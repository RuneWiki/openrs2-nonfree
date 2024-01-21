import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class3_Sub9_Sub3 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "Lclient!sc;")
	public final Class72 aClass72_23 = new Class72();

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "Lclient!qe;")
	public final Class3_Sub9_Sub4 aClass3_Sub9_Sub4_2 = new Class3_Sub9_Sub4();

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "Lclient!g;")
	private final Class3_Sub9_Sub2 aClass3_Sub9_Sub2_1;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!g;)V")
	public Class3_Sub9_Sub3(@OriginalArg(0) Class3_Sub9_Sub2 arg0) {
		this.aClass3_Sub9_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "([III)V")
	@Override
	public void method2220(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub9_Sub4_2.method2220(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) this.aClass72_23.method2401(); local17 != null; local17 = (Class3_Sub8) this.aClass72_23.method2407()) {
			if (!this.aClass3_Sub9_Sub2_1.method907(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt913) {
						this.method1223(local17, arg0, local27, local29, local27 + local29);
						local17.anInt913 -= local29;
						break;
					}
					this.method1223(local17, arg0, local27, local17.anInt913, local29 + local27);
					local27 += local17.anInt913;
					local29 -= local17.anInt913;
				} while (!this.aClass3_Sub9_Sub2_1.method896(local29, local17, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()Lclient!tb;")
	@Override
	public Class3_Sub9 method2219() {
		@Pc(9) Class3_Sub8 local9 = (Class3_Sub8) this.aClass72_23.method2401();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub9_Sub1_3 == null) {
			return this.method2218();
		} else {
			return local9.aClass3_Sub9_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ee;[IIIII)V")
	private void method1223(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub9_Sub2_1.anIntArray122[arg0.anInt912] & 0x4) != 0 && arg0.anInt926 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub9_Sub2_1.anIntArray109[arg0.anInt912] / Static143.anInt3288;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt914) / local29;
				if (arg3 < local39) {
					arg0.anInt914 += arg3 * local29;
					break;
				}
				arg3 -= local39;
				@Pc(50) int local50 = 262144 / local29;
				arg0.aClass3_Sub9_Sub1_3.method2220(arg1, arg2, local39);
				arg2 += local39;
				arg0.anInt914 += local29 * local39 - 1048576;
				@Pc(74) int local74 = Static143.anInt3288 / 100;
				if (local74 > local50) {
					local74 = local50;
				}
				@Pc(82) Class3_Sub9_Sub1 local82 = arg0.aClass3_Sub9_Sub1_3;
				if (this.aClass3_Sub9_Sub2_1.anIntArray117[arg0.anInt912] == 0) {
					arg0.aClass3_Sub9_Sub1_3 = Static183.method715(arg0.aClass3_Sub4_Sub1_1, local82.method734(), local82.method733(), local82.method727());
				} else {
					arg0.aClass3_Sub9_Sub1_3 = Static183.method715(arg0.aClass3_Sub4_Sub1_1, local82.method734(), 0, local82.method727());
					this.aClass3_Sub9_Sub2_1.method911(arg0.aClass3_Sub20_1.aShortArray35[arg0.anInt911] < 0, arg0);
					arg0.aClass3_Sub9_Sub1_3.method745(local74, local82.method733());
				}
				if (arg0.aClass3_Sub20_1.aShortArray35[arg0.anInt911] < 0) {
					arg0.aClass3_Sub9_Sub1_3.method741(-1);
				}
				local82.method735(local74);
				local82.method2220(arg1, arg2, arg4 - arg2);
				if (local82.method743()) {
					this.aClass3_Sub9_Sub4_2.method2223(local82);
				}
			}
		}
		arg0.aClass3_Sub9_Sub1_3.method2220(arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
	@Override
	public int method2214() {
		return 0;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()Lclient!tb;")
	@Override
	public Class3_Sub9 method2218() {
		@Pc(9) Class3_Sub8 local9;
		do {
			local9 = (Class3_Sub8) this.aClass72_23.method2407();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub9_Sub1_3 == null);
		return local9.aClass3_Sub9_Sub1_3;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	@Override
	public void method2215(@OriginalArg(0) int arg0) {
		this.aClass3_Sub9_Sub4_2.method2215(arg0);
		for (@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) this.aClass72_23.method2401(); local15 != null; local15 = (Class3_Sub8) this.aClass72_23.method2407()) {
			if (!this.aClass3_Sub9_Sub2_1.method907(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt913) {
						this.method1227(local15, local25);
						local15.anInt913 -= local25;
						break;
					}
					this.method1227(local15, local15.anInt913);
					local25 -= local15.anInt913;
				} while (!this.aClass3_Sub9_Sub2_1.method896(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ee;BI)V")
	private void method1227(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub9_Sub2_1.anIntArray122[arg0.anInt912] & 0x4) != 0 && arg0.anInt926 < 0) {
			@Pc(24) int local24 = this.aClass3_Sub9_Sub2_1.anIntArray109[arg0.anInt912] / Static143.anInt3288;
			@Pc(35) int local35 = (local24 + 1048575 - arg0.anInt914) / local24;
			arg0.anInt914 = arg0.anInt914 + arg1 * local24 & 0xFFFFF;
			if (local35 <= arg1) {
				if (this.aClass3_Sub9_Sub2_1.anIntArray117[arg0.anInt912] == 0) {
					arg0.aClass3_Sub9_Sub1_3 = Static183.method715(arg0.aClass3_Sub4_Sub1_1, arg0.aClass3_Sub9_Sub1_3.method734(), arg0.aClass3_Sub9_Sub1_3.method733(), arg0.aClass3_Sub9_Sub1_3.method727());
				} else {
					arg0.aClass3_Sub9_Sub1_3 = Static183.method715(arg0.aClass3_Sub4_Sub1_1, arg0.aClass3_Sub9_Sub1_3.method734(), 0, arg0.aClass3_Sub9_Sub1_3.method727());
					this.aClass3_Sub9_Sub2_1.method911(arg0.aClass3_Sub20_1.aShortArray35[arg0.anInt911] < 0, arg0);
				}
				if (arg0.aClass3_Sub20_1.aShortArray35[arg0.anInt911] < 0) {
					arg0.aClass3_Sub9_Sub1_3.method741(-1);
				}
				arg1 = arg0.anInt914 / local24;
			}
		}
		arg0.aClass3_Sub9_Sub1_3.method2215(arg1);
	}
}
