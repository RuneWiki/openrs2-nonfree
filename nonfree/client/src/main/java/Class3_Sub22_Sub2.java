import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class3_Sub22_Sub2 extends Class3_Sub22 {

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!tj;")
	public final Class357 aClass357_42 = new Class357();

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!vn;")
	public final Class3_Sub22_Sub4 aClass3_Sub22_Sub4_2 = new Class3_Sub22_Sub4();

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Lclient!wk;")
	private final Class3_Sub22_Sub5 aClass3_Sub22_Sub5_2;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class3_Sub22_Sub2(@OriginalArg(0) Class3_Sub22_Sub5 arg0) {
		this.aClass3_Sub22_Sub5_2 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "([III)V")
	@Override
	public void method9302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub22_Sub4_2.method9302(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub41 local17 = (Class3_Sub41) this.aClass357_42.method8391(); local17 != null; local17 = (Class3_Sub41) this.aClass357_42.method8392()) {
			if (!this.aClass3_Sub22_Sub5_2.method9340(local17)) {
				@Pc(29) int local29 = arg1;
				@Pc(31) int local31 = arg2;
				do {
					if (local17.anInt8276 >= local31) {
						this.method5978(local29, local31, local17, arg0, local31 + local29);
						local17.anInt8276 -= local31;
						break;
					}
					this.method5978(local29, local17.anInt8276, local17, arg0, local31 + local29);
					local31 -= local17.anInt8276;
					local29 += local17.anInt8276;
				} while (!this.aClass3_Sub22_Sub5_2.method9312(local29, local31, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIILclient!ow;[II)V")
	private void method5978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub41 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub22_Sub5_2.anIntArray633[arg2.anInt8288] & 0x4) != 0 && arg2.anInt8284 < 0) {
			@Pc(38) int local38 = this.aClass3_Sub22_Sub5_2.anIntArray631[arg2.anInt8288] / Static103.anInt1658;
			while (true) {
				@Pc(48) int local48 = (local38 + 1048575 - arg2.anInt8275) / local38;
				if (local48 > arg1) {
					arg2.anInt8275 += arg1 * local38;
					break;
				}
				arg2.aClass3_Sub22_Sub1_2.method9302(arg3, arg0, local48);
				arg1 -= local48;
				arg2.anInt8275 += local48 * local38 - 1048576;
				arg0 += local48;
				@Pc(83) int local83 = Static103.anInt1658 / 100;
				@Pc(87) int local87 = 262144 / local38;
				if (local83 > local87) {
					local83 = local87;
				}
				@Pc(95) Class3_Sub22_Sub1 local95 = arg2.aClass3_Sub22_Sub1_2;
				if (this.aClass3_Sub22_Sub5_2.anIntArray621[arg2.anInt8288] == 0) {
					arg2.aClass3_Sub22_Sub1_2 = Static727.method3896(arg2.aClass3_Sub33_Sub1_2, local95.method3911(), local95.method3904(), local95.method3898());
				} else {
					arg2.aClass3_Sub22_Sub1_2 = Static727.method3896(arg2.aClass3_Sub33_Sub1_2, local95.method3911(), 0, local95.method3898());
					this.aClass3_Sub22_Sub5_2.method9336(arg2.aClass3_Sub54_1.aShortArray152[arg2.anInt8289] < 0, arg2);
					arg2.aClass3_Sub22_Sub1_2.method3910(local83, local95.method3904());
				}
				if (arg2.aClass3_Sub54_1.aShortArray152[arg2.anInt8289] < 0) {
					arg2.aClass3_Sub22_Sub1_2.method3881(-1);
				}
				local95.method3899(local83);
				local95.method9302(arg3, arg0, arg4 - arg0);
				if (local95.method3883()) {
					this.aClass3_Sub22_Sub4_2.method9058(local95);
				}
			}
		}
		arg2.aClass3_Sub22_Sub1_2.method9302(arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void method9304(@OriginalArg(0) int arg0) {
		this.aClass3_Sub22_Sub4_2.method9304(arg0);
		for (@Pc(15) Class3_Sub41 local15 = (Class3_Sub41) this.aClass357_42.method8391(); local15 != null; local15 = (Class3_Sub41) this.aClass357_42.method8392()) {
			if (!this.aClass3_Sub22_Sub5_2.method9340(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local15.anInt8276 >= local27) {
						this.method5979(local15, local27);
						local15.anInt8276 -= local27;
						break;
					}
					this.method5979(local15, local15.anInt8276);
					local27 -= local15.anInt8276;
				} while (!this.aClass3_Sub22_Sub5_2.method9312(0, local27, (int[]) null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9303() {
		@Pc(11) Class3_Sub41 local11;
		do {
			local11 = (Class3_Sub41) this.aClass357_42.method8392();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass3_Sub22_Sub1_2 == null);
		return local11.aClass3_Sub22_Sub1_2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ow;BI)V")
	private void method5979(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub22_Sub5_2.anIntArray633[arg0.anInt8288] & 0x4) != 0 && arg0.anInt8284 < 0) {
			@Pc(28) int local28 = this.aClass3_Sub22_Sub5_2.anIntArray631[arg0.anInt8288] / Static103.anInt1658;
			@Pc(38) int local38 = (local28 + 1048575 - arg0.anInt8275) / local28;
			arg0.anInt8275 = arg0.anInt8275 + arg1 * local28 & 0xFFFFF;
			if (arg1 >= local38) {
				if (this.aClass3_Sub22_Sub5_2.anIntArray621[arg0.anInt8288] == 0) {
					arg0.aClass3_Sub22_Sub1_2 = Static727.method3896(arg0.aClass3_Sub33_Sub1_2, arg0.aClass3_Sub22_Sub1_2.method3911(), arg0.aClass3_Sub22_Sub1_2.method3904(), arg0.aClass3_Sub22_Sub1_2.method3898());
				} else {
					arg0.aClass3_Sub22_Sub1_2 = Static727.method3896(arg0.aClass3_Sub33_Sub1_2, arg0.aClass3_Sub22_Sub1_2.method3911(), 0, arg0.aClass3_Sub22_Sub1_2.method3898());
					this.aClass3_Sub22_Sub5_2.method9336(arg0.aClass3_Sub54_1.aShortArray152[arg0.anInt8289] < 0, arg0);
				}
				if (arg0.aClass3_Sub54_1.aShortArray152[arg0.anInt8289] < 0) {
					arg0.aClass3_Sub22_Sub1_2.method3881(-1);
				}
				arg1 = arg0.anInt8275 / local28;
			}
		}
		arg0.aClass3_Sub22_Sub1_2.method9304(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9305() {
		@Pc(9) Class3_Sub41 local9 = (Class3_Sub41) this.aClass357_42.method8391();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub22_Sub1_2 == null) {
			return this.method9303();
		} else {
			return local9.aClass3_Sub22_Sub1_2;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()I")
	@Override
	public int method9307() {
		return 0;
	}
}
