import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class65 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!pl;")
	private final Class259 aClass259_35;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	private final int anInt1667;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "[[I")
	private final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class65(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_35 = arg2;
		this.aClass259_35.method5969(1);
		@Pc(22) Class2_Sub15 local22 = new Class2_Sub15(this.aClass259_35.method5985(0, 0));
		@Pc(26) int local26 = local22.method4325();
		if (local26 > 3) {
			this.aBooleanArray6 = new boolean[0];
			this.anIntArrayArray3 = new int[0][];
			this.anInt1667 = -1;
		} else {
			@Pc(33) int local33 = local22.method4325();
			@Pc(36) Class357[] local36 = Static54.method923();
			@Pc(38) boolean local38 = true;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local36.length == local33) {
				for (local52 = 0; local52 < local36.length; local52++) {
					local58 = local22.method4325();
					if (local36[local52].anInt9412 != local58) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local52 = local22.method4325();
				local58 = local22.method4325();
				if (local26 > 2) {
					this.anInt1667 = local22.method4334();
				} else {
					this.anInt1667 = -1;
				}
				this.aBooleanArray6 = new boolean[local58 + 1];
				this.anIntArrayArray3 = new int[local58 + 1][];
				@Pc(134) int local134;
				for (@Pc(128) int local128 = 0; local128 < local52; local128++) {
					local134 = local22.method4325();
					this.aBooleanArray6[local134] = local22.method4325() == 1;
					@Pc(150) int local150 = local22.method4294();
					@Pc(163) int local163;
					if (this.anInt1667 == -1) {
						this.anIntArrayArray3[local134] = new int[local150];
						for (local163 = 0; local163 < local150; local163++) {
							this.anIntArrayArray3[local134][local163] = local22.method4294();
						}
					} else {
						this.anIntArrayArray3[local134] = new int[local150 + 1];
						this.anIntArrayArray3[local134][0] = this.anInt1667;
						for (local163 = 0; local163 < local150; local163++) {
							this.anIntArrayArray3[local134][local163 + 1] = local22.method4294();
						}
					}
				}
				for (local134 = 0; local134 < local58 + 1; local134++) {
					if (this.anIntArrayArray3[local134] == null) {
						if (this.anInt1667 == -1) {
							this.anIntArrayArray3[local134] = new int[0];
						} else {
							this.anIntArrayArray3[local134] = new int[] { this.anInt1667 };
						}
					}
				}
			} else {
				this.anInt1667 = -1;
				this.anIntArrayArray3 = new int[0][];
				this.aBooleanArray6 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)Lclient!nh;")
	public Class231 method1196(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass259_35.method5985(arg0, 1);
		@Pc(19) Class231 local19 = new Class231();
		local19.method5403(new Class2_Sub15(local10));
		return local19;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z")
	public boolean method1197() {
		return this.anInt1667 != -1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)[I")
	public int[] method1198(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray3.length <= arg0) {
			return this.anInt1667 == -1 ? new int[0] : new int[] { this.anInt1667 };
		} else if (this.aBooleanArray6[arg0] && this.anIntArrayArray3[arg0].length > 1) {
			@Pc(56) int local56 = this.anInt1667 == -1 ? 0 : 1;
			@Pc(60) Random local60 = new Random();
			@Pc(67) int[] local67 = new int[this.anIntArrayArray3[arg0].length];
			Static598.method1132(this.anIntArrayArray3[arg0], 0, local67, 0, local67.length);
			for (@Pc(87) int local87 = local56; local87 < local67.length; local87++) {
				@Pc(100) int local100 = local56 + Static233.method3629(local60, local67.length - local56);
				@Pc(104) int local104 = local67[local87];
				local67[local87] = local67[local100];
				local67[local100] = local104;
			}
			return local67;
		} else {
			return this.anIntArrayArray3[arg0];
		}
	}
}
