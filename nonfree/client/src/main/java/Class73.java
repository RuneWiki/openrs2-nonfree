import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class73 {

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_29;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	private final int anInt2377;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class73(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_29 = arg2;
		this.aClass348_29.method7981(1);
		@Pc(22) Class4_Sub13 local22 = new Class4_Sub13(this.aClass348_29.method7964(0, 0));
		@Pc(26) int local26 = local22.method7004();
		if (local26 > 3) {
			this.anInt2377 = -1;
			this.anIntArrayArray9 = new int[0][];
			this.aBooleanArray3 = new boolean[0];
		} else {
			@Pc(35) int local35 = local22.method7004();
			@Pc(38) Class184[] local38 = Static385.method5960();
			@Pc(40) boolean local40 = true;
			@Pc(50) int local50;
			@Pc(56) int local56;
			if (local38.length == local35) {
				for (local50 = 0; local50 < local38.length; local50++) {
					local56 = local22.method7004();
					if (local56 != local38[local50].anInt5783) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local50 = local22.method7004();
				local56 = local22.method7004();
				if (local26 > 2) {
					this.anInt2377 = local22.method7043();
				} else {
					this.anInt2377 = -1;
				}
				this.anIntArrayArray9 = new int[local56 + 1][];
				this.aBooleanArray3 = new boolean[local56 + 1];
				@Pc(136) int local136;
				for (@Pc(130) int local130 = 0; local130 < local50; local130++) {
					local136 = local22.method7004();
					this.aBooleanArray3[local136] = local22.method7004() == 1;
					@Pc(152) int local152 = local22.method7054();
					@Pc(164) int local164;
					if (this.anInt2377 == -1) {
						this.anIntArrayArray9[local136] = new int[local152];
						for (local164 = 0; local164 < local152; local164++) {
							this.anIntArrayArray9[local136][local164] = local22.method7054();
						}
					} else {
						this.anIntArrayArray9[local136] = new int[local152 + 1];
						this.anIntArrayArray9[local136][0] = this.anInt2377;
						for (local164 = 0; local164 < local152; local164++) {
							this.anIntArrayArray9[local136][local164 + 1] = local22.method7054();
						}
					}
				}
				for (local136 = 0; local136 < local56 + 1; local136++) {
					if (this.anIntArrayArray9[local136] == null) {
						if (this.anInt2377 == -1) {
							this.anIntArrayArray9[local136] = new int[0];
						} else {
							this.anIntArrayArray9[local136] = new int[] { this.anInt2377 };
						}
					}
				}
			} else {
				this.anIntArrayArray9 = new int[0][];
				this.anInt2377 = -1;
				this.aBooleanArray3 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
	public boolean method1887() {
		return this.anInt2377 != -1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
	public int[] method1888(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray9.length) {
			return this.anInt2377 == -1 ? new int[0] : new int[] { this.anInt2377 };
		} else if (this.aBooleanArray3[arg0] && this.anIntArrayArray9[arg0].length > 1) {
			@Pc(59) int local59 = this.anInt2377 == -1 ? 0 : 1;
			@Pc(68) Random local68 = new Random();
			@Pc(75) int[] local75 = new int[this.anIntArrayArray9[arg0].length];
			Static599.method3062(this.anIntArrayArray9[arg0], 0, local75, 0, local75.length);
			for (@Pc(87) int local87 = local59; local87 < local75.length; local87++) {
				@Pc(100) int local100 = local59 + Static319.method4997(local68, local75.length - local59);
				@Pc(104) int local104 = local75[local87];
				local75[local87] = local75[local100];
				local75[local100] = local104;
			}
			return local75;
		} else {
			return this.anIntArrayArray9[arg0];
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)Lclient!gh;")
	public Class125 method1890(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass348_29.method7964(arg0, 1);
		@Pc(20) Class125 local20 = new Class125();
		local20.method2768(new Class4_Sub13(local10));
		return local20;
	}
}
