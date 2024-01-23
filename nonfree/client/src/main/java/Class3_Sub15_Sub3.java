import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class3_Sub15_Sub3 extends Class3_Sub15 {

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!fk;")
	public Class56 aClass56_11 = new Class56();

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Lclient!kd;")
	public Class3_Sub15_Sub2 aClass3_Sub15_Sub2_2 = new Class3_Sub15_Sub2();

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!ue;")
	private Class3_Sub15_Sub4 aClass3_Sub15_Sub4_2;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ue;)V")
	public Class3_Sub15_Sub3(@OriginalArg(0) Class3_Sub15_Sub4 arg0) {
		this.aClass3_Sub15_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "()Lclient!ph;")
	@Override
	public Class3_Sub15 method4563() {
		while (true) {
			@Pc(9) Class3_Sub13 local9 = (Class3_Sub13) this.aClass56_11.method1278();
			if (local9 != null) {
				if (local9.aClass3_Sub15_Sub1_1 == null) {
					continue;
				}
				return local9.aClass3_Sub15_Sub1_1;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILclient!hn;[II)V")
	private void method3107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub13 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub15_Sub4_2.anIntArray585[arg2.anInt2043] & 0x4) != 0 && arg2.anInt2054 < 0) {
			@Pc(32) int local32 = this.aClass3_Sub15_Sub4_2.anIntArray572[arg2.anInt2043] / Static155.anInt2915;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg2.anInt2053) / local32;
				if (local42 > arg0) {
					arg2.anInt2053 += arg0 * local32;
					break;
				}
				arg0 -= local42;
				arg2.aClass3_Sub15_Sub1_1.method4560(arg3, arg4, local42);
				arg2.anInt2053 += local42 * local32 - 1048576;
				@Pc(69) int local69 = Static155.anInt2915 / 100;
				@Pc(73) int local73 = 262144 / local32;
				arg4 += local42;
				@Pc(80) Class3_Sub15_Sub1 local80 = arg2.aClass3_Sub15_Sub1_1;
				if (local69 > local73) {
					local69 = local73;
				}
				if (this.aClass3_Sub15_Sub4_2.anIntArray577[arg2.anInt2043] == 0) {
					arg2.aClass3_Sub15_Sub1_1 = Static319.method2113(arg2.aClass3_Sub11_Sub1_1, local80.method2142(), local80.method2115(), local80.method2117());
				} else {
					arg2.aClass3_Sub15_Sub1_1 = Static319.method2113(arg2.aClass3_Sub11_Sub1_1, local80.method2142(), 0, local80.method2117());
					this.aClass3_Sub15_Sub4_2.method4585(arg2.aClass3_Sub22_1.aShortArray72[arg2.anInt2059] < 0, arg2);
					arg2.aClass3_Sub15_Sub1_1.method2132(local69, local80.method2115());
				}
				if (arg2.aClass3_Sub22_1.aShortArray72[arg2.anInt2059] < 0) {
					arg2.aClass3_Sub15_Sub1_1.method2133(-1);
				}
				local80.method2125(local69);
				local80.method4560(arg3, arg4, arg1 - arg4);
				if (local80.method2126()) {
					this.aClass3_Sub15_Sub2_2.method2430(local80);
				}
			}
		}
		arg2.aClass3_Sub15_Sub1_1.method4560(arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	@Override
	public void method4561(@OriginalArg(0) int arg0) {
		this.aClass3_Sub15_Sub2_2.method4561(arg0);
		for (@Pc(15) Class3_Sub13 local15 = (Class3_Sub13) this.aClass56_11.method1281(); local15 != null; local15 = (Class3_Sub13) this.aClass56_11.method1278()) {
			if (!this.aClass3_Sub15_Sub4_2.method4566(local15)) {
				@Pc(26) int local26 = arg0;
				do {
					if (local26 <= local15.anInt2047) {
						this.method3108(local26, local15);
						local15.anInt2047 -= local26;
						break;
					}
					this.method3108(local15.anInt2047, local15);
					local26 -= local15.anInt2047;
				} while (!this.aClass3_Sub15_Sub4_2.method4574(local15, 0, local26, null));
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([III)V")
	@Override
	public void method4560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub15_Sub2_2.method4560(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub13 local17 = (Class3_Sub13) this.aClass56_11.method1281(); local17 != null; local17 = (Class3_Sub13) this.aClass56_11.method1278()) {
			if (!this.aClass3_Sub15_Sub4_2.method4566(local17)) {
				@Pc(28) int local28 = arg2;
				@Pc(30) int local30 = arg1;
				do {
					if (local17.anInt2047 >= local28) {
						this.method3107(local28, local28 + local30, local17, arg0, local30);
						local17.anInt2047 -= local28;
						break;
					}
					this.method3107(local17.anInt2047, local30 + local28, local17, arg0, local30);
					local28 -= local17.anInt2047;
					local30 += local17.anInt2047;
				} while (!this.aClass3_Sub15_Sub4_2.method4574(local17, local30, local28, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()Lclient!ph;")
	@Override
	public Class3_Sub15 method4559() {
		@Pc(9) Class3_Sub13 local9 = (Class3_Sub13) this.aClass56_11.method1281();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub15_Sub1_1 == null) {
			return this.method4563();
		} else {
			return local9.aClass3_Sub15_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLclient!hn;)V")
	private void method3108(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub13 arg1) {
		if ((this.aClass3_Sub15_Sub4_2.anIntArray585[arg1.anInt2043] & 0x4) != 0 && arg1.anInt2054 < 0) {
			@Pc(21) int local21 = this.aClass3_Sub15_Sub4_2.anIntArray572[arg1.anInt2043] / Static155.anInt2915;
			@Pc(31) int local31 = (local21 + 1048575 - arg1.anInt2053) / local21;
			arg1.anInt2053 = arg1.anInt2053 + local21 * arg0 & 0xFFFFF;
			if (arg0 >= local31) {
				if (this.aClass3_Sub15_Sub4_2.anIntArray577[arg1.anInt2043] == 0) {
					arg1.aClass3_Sub15_Sub1_1 = Static319.method2113(arg1.aClass3_Sub11_Sub1_1, arg1.aClass3_Sub15_Sub1_1.method2142(), arg1.aClass3_Sub15_Sub1_1.method2115(), arg1.aClass3_Sub15_Sub1_1.method2117());
				} else {
					arg1.aClass3_Sub15_Sub1_1 = Static319.method2113(arg1.aClass3_Sub11_Sub1_1, arg1.aClass3_Sub15_Sub1_1.method2142(), 0, arg1.aClass3_Sub15_Sub1_1.method2117());
					this.aClass3_Sub15_Sub4_2.method4585(arg1.aClass3_Sub22_1.aShortArray72[arg1.anInt2059] < 0, arg1);
				}
				if (arg1.aClass3_Sub22_1.aShortArray72[arg1.anInt2059] < 0) {
					arg1.aClass3_Sub15_Sub1_1.method2133(-1);
				}
				arg0 = arg1.anInt2053 / local21;
			}
		}
		arg1.aClass3_Sub15_Sub1_1.method4561(arg0);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "()I")
	@Override
	public int method4564() {
		return 0;
	}
}
