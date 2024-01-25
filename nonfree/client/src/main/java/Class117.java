import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class117 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!oh;")
	private final Class237 aClass237_52;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	private final int anInt4162;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class117(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_52 = arg2;
		this.aClass237_52.method6315(1);
		@Pc(22) Class8_Sub8 local22 = new Class8_Sub8(this.aClass237_52.method6314(0, 0));
		@Pc(26) int local26 = local22.method8525();
		if (local26 > 3) {
			this.anInt4162 = -1;
			this.anIntArrayArray22 = new int[0][];
			this.aBooleanArray8 = new boolean[0];
		} else {
			@Pc(47) int local47 = local22.method8525();
			@Pc(50) Class138[] local50 = Static361.method5667();
			@Pc(52) boolean local52 = true;
			@Pc(66) int local66;
			@Pc(72) int local72;
			if (local47 == local50.length) {
				for (local66 = 0; local66 < local50.length; local66++) {
					local72 = local22.method8525();
					if (local50[local66].anInt4988 != local72) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local66 = local22.method8525();
				local72 = local22.method8525();
				if (local26 > 2) {
					this.anInt4162 = local22.method8568();
				} else {
					this.anInt4162 = -1;
				}
				this.aBooleanArray8 = new boolean[local72 + 1];
				this.anIntArrayArray22 = new int[local72 + 1][];
				@Pc(152) int local152;
				for (@Pc(146) int local146 = 0; local146 < local66; local146++) {
					local152 = local22.method8525();
					this.aBooleanArray8[local152] = local22.method8525() == 1;
					@Pc(168) int local168 = local22.method8578();
					@Pc(180) int local180;
					if (this.anInt4162 == -1) {
						this.anIntArrayArray22[local152] = new int[local168];
						for (local180 = 0; local180 < local168; local180++) {
							this.anIntArrayArray22[local152][local180] = local22.method8578();
						}
					} else {
						this.anIntArrayArray22[local152] = new int[local168 + 1];
						this.anIntArrayArray22[local152][0] = this.anInt4162;
						for (local180 = 0; local180 < local168; local180++) {
							this.anIntArrayArray22[local152][local180 + 1] = local22.method8578();
						}
					}
				}
				for (local152 = 0; local152 < local72 + 1; local152++) {
					if (this.anIntArrayArray22[local152] == null) {
						if (this.anInt4162 == -1) {
							this.anIntArrayArray22[local152] = new int[0];
						} else {
							this.anIntArrayArray22[local152] = new int[] { this.anInt4162 };
						}
					}
				}
			} else {
				this.anIntArrayArray22 = new int[0][];
				this.anInt4162 = -1;
				this.aBooleanArray8 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	public int[] method3386(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray22.length <= arg0) {
			return this.anInt4162 == -1 ? new int[0] : new int[] { this.anInt4162 };
		} else if (this.aBooleanArray8[arg0] && this.anIntArrayArray22[arg0].length > 1) {
			@Pc(59) int local59 = this.anInt4162 == -1 ? 0 : 1;
			@Pc(63) Random local63 = new Random();
			@Pc(70) int[] local70 = new int[this.anIntArrayArray22[arg0].length];
			Static649.method5529(this.anIntArrayArray22[arg0], 0, local70, 0, local70.length);
			for (@Pc(87) int local87 = local59; local87 < local70.length; local87++) {
				@Pc(100) int local100 = Static221.method4149(local70.length - local59, local63) + local59;
				@Pc(104) int local104 = local70[local87];
				local70[local87] = local70[local100];
				local70[local100] = local104;
			}
			return local70;
		} else {
			return this.anIntArrayArray22[arg0];
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z")
	public boolean method3387() {
		return this.anInt4162 != -1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!lda;")
	public Class192 method3388(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass237_52.method6314(1, arg0);
		@Pc(14) Class192 local14 = new Class192();
		local14.method4970(new Class8_Sub8(local10));
		return local14;
	}
}
