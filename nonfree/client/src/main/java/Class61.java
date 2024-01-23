import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class61 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public int anInt1972;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!gf;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "[Lclient!gf;")
	public Class66[] aClass66Array1;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
	public int anInt1979;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public int anInt1978;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([BI)V")
	public Class61(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1978 = Static43.method2328(arg0.length, arg0);
		if (this.anInt1978 != arg1) {
			throw new RuntimeException();
		}
		this.method1503(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V")
	private void method1503(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub10 local8 = new Class4_Sub10(Static109.method1750(arg0));
		@Pc(12) int local12 = local8.method4666();
		if (local12 != 5 && local12 != 6) {
			throw new RuntimeException();
		}
		if (local12 >= 6) {
			this.anInt1971 = local8.method4632();
		} else {
			this.anInt1971 = 0;
		}
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local8.method4666();
		this.anInt1972 = local8.method4653();
		@Pc(55) int local55 = -1;
		this.anIntArray156 = new int[this.anInt1972];
		@Pc(62) int local62;
		for (local62 = 0; local62 < this.anInt1972; local62++) {
			this.anIntArray156[local62] = local44 += local8.method4653();
			if (local55 < this.anIntArray156[local62]) {
				local55 = this.anIntArray156[local62];
			}
		}
		this.anInt1979 = local55 + 1;
		this.anIntArray154 = new int[this.anInt1979];
		this.anIntArray153 = new int[this.anInt1979];
		this.anIntArrayArray14 = new int[this.anInt1979][];
		this.anIntArray152 = new int[this.anInt1979];
		this.anIntArray157 = new int[this.anInt1979];
		if (local48 != 0) {
			this.anIntArray155 = new int[this.anInt1979];
			for (local62 = 0; local62 < this.anInt1979; local62++) {
				this.anIntArray155[local62] = -1;
			}
			for (local62 = 0; local62 < this.anInt1972; local62++) {
				this.anIntArray155[this.anIntArray156[local62]] = local8.method4632();
			}
			this.aClass66_1 = new Class66(this.anIntArray155);
		}
		for (local62 = 0; local62 < this.anInt1972; local62++) {
			this.anIntArray153[this.anIntArray156[local62]] = local8.method4632();
		}
		for (local62 = 0; local62 < this.anInt1972; local62++) {
			this.anIntArray157[this.anIntArray156[local62]] = local8.method4632();
		}
		for (local62 = 0; local62 < this.anInt1972; local62++) {
			this.anIntArray154[this.anIntArray156[local62]] = local8.method4653();
		}
		@Pc(265) int local265;
		@Pc(270) int local270;
		@Pc(260) int local260;
		@Pc(278) int local278;
		for (local62 = 0; local62 < this.anInt1972; local62++) {
			local44 = 0;
			local260 = -1;
			local265 = this.anIntArray156[local62];
			local270 = this.anIntArray154[local265];
			this.anIntArrayArray14[local265] = new int[local270];
			for (local278 = 0; local278 < local270; local278++) {
				@Pc(300) int local300 = this.anIntArrayArray14[local265][local278] = local44 += local8.method4653();
				if (local300 > local260) {
					local260 = local300;
				}
			}
			this.anIntArray152[local265] = local260 + 1;
			if (local260 + 1 == local270) {
				this.anIntArrayArray14[local265] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.anIntArrayArray15 = new int[local55 + 1][];
		this.aClass66Array1 = new Class66[local55 + 1];
		for (local62 = 0; local62 < this.anInt1972; local62++) {
			local265 = this.anIntArray156[local62];
			local270 = this.anIntArray154[local265];
			this.anIntArrayArray15[local265] = new int[this.anIntArray152[local265]];
			for (local260 = 0; local260 < this.anIntArray152[local265]; local260++) {
				this.anIntArrayArray15[local265][local260] = -1;
			}
			for (local260 = 0; local260 < local270; local260++) {
				if (this.anIntArrayArray14[local265] == null) {
					local278 = local260;
				} else {
					local278 = this.anIntArrayArray14[local265][local260];
				}
				this.anIntArrayArray15[local265][local278] = local8.method4632();
			}
			this.aClass66Array1[local265] = new Class66(this.anIntArrayArray15[local265]);
		}
	}
}
