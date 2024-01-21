import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "Lclient!ja;")
	public final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lclient!we;")
	public final Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1 = new Class3_Sub3_Sub4();

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "Lclient!lf;")
	private final Class3_Sub3_Sub2 aClass3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class3_Sub3_Sub2 arg0) {
		this.aClass3_Sub3_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
	@Override
	public int method2063() {
		return 0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lclient!be;")
	@Override
	public Class3_Sub3 method2059() {
		@Pc(9) Class3_Sub19 local9;
		do {
			local9 = (Class3_Sub19) this.aClass37_1.method990();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub3_Sub3_3 == null);
		return local9.aClass3_Sub3_Sub3_3;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLclient!w;[III)V")
	private void method169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub19 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub3_Sub2_1.anIntArray146[arg1.anInt3034] & 0x4) != 0 && arg1.anInt3029 < 0) {
			@Pc(25) int local25 = this.aClass3_Sub3_Sub2_1.anIntArray153[arg1.anInt3034] / Static7.anInt420;
			while (true) {
				@Pc(36) int local36 = (local25 + 1048575 - arg1.anInt3035) / local25;
				if (local36 > arg3) {
					arg1.anInt3035 += arg3 * local25;
					break;
				}
				arg1.aClass3_Sub3_Sub3_3.method2062(arg2, arg4, local36);
				arg3 -= local36;
				arg4 += local36;
				@Pc(57) int local57 = Static7.anInt420 / 100;
				@Pc(61) int local61 = 262144 / local25;
				if (local57 > local61) {
					local57 = local61;
				}
				@Pc(73) Class3_Sub3_Sub3 local73 = arg1.aClass3_Sub3_Sub3_3;
				arg1.anInt3035 += local36 * local25 - 1048576;
				if (this.aClass3_Sub3_Sub2_1.anIntArray150[arg1.anInt3034] == 0) {
					arg1.aClass3_Sub3_Sub3_3 = Static132.method1577(arg1.aClass3_Sub4_Sub1_1, local73.method1575(), local73.method1561(), local73.method1573());
				} else {
					arg1.aClass3_Sub3_Sub3_3 = Static132.method1577(arg1.aClass3_Sub4_Sub1_1, local73.method1575(), 0, local73.method1573());
					this.aClass3_Sub3_Sub2_1.method1255(arg1, arg1.aClass3_Sub10_1.aShortArray4[arg1.anInt3036] < 0);
					arg1.aClass3_Sub3_Sub3_3.method1592(local57, local73.method1561());
				}
				if (arg1.aClass3_Sub10_1.aShortArray4[arg1.anInt3036] < 0) {
					arg1.aClass3_Sub3_Sub3_3.method1564(-1);
				}
				local73.method1571(local57);
				local73.method2062(arg2, arg4, arg0 - arg4);
				if (local73.method1594()) {
					this.aClass3_Sub3_Sub4_1.method2068(local73);
				}
			}
		}
		arg1.aClass3_Sub3_Sub3_3.method2062(arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	@Override
	public void method2057(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class3_Sub19 local11 = (Class3_Sub19) this.aClass37_1.method989(); local11 != null; local11 = (Class3_Sub19) this.aClass37_1.method990()) {
			if (!this.aClass3_Sub3_Sub2_1.method1267(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt3042) {
						this.method172(local11, local21);
						local11.anInt3042 -= local21;
						break;
					}
					this.method172(local11, local11.anInt3042);
					local21 -= local11.anInt3042;
				} while (!this.aClass3_Sub3_Sub2_1.method1244(local11));
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "()Lclient!be;")
	@Override
	public Class3_Sub3 method2060() {
		@Pc(5) Class3_Sub19 local5 = (Class3_Sub19) this.aClass37_1.method989();
		if (local5 == null) {
			return null;
		} else if (local5.aClass3_Sub3_Sub3_3 == null) {
			return this.method2059();
		} else {
			return local5.aClass3_Sub3_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!w;IB)V")
	private void method172(@OriginalArg(0) Class3_Sub19 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass3_Sub3_Sub2_1.anIntArray146[arg0.anInt3034] & 0x4) != 0 && arg0.anInt3029 < 0) {
			@Pc(26) int local26 = this.aClass3_Sub3_Sub2_1.anIntArray153[arg0.anInt3034] / Static7.anInt420;
			@Pc(35) int local35 = (local26 + 1048575 - arg0.anInt3035) / local26;
			arg0.anInt3035 = local26 * arg1 + arg0.anInt3035 & 0xFFFFF;
			if (local35 <= arg1) {
				if (this.aClass3_Sub3_Sub2_1.anIntArray150[arg0.anInt3034] == 0) {
					arg0.aClass3_Sub3_Sub3_3 = Static132.method1577(arg0.aClass3_Sub4_Sub1_1, arg0.aClass3_Sub3_Sub3_3.method1575(), arg0.aClass3_Sub3_Sub3_3.method1561(), arg0.aClass3_Sub3_Sub3_3.method1573());
				} else {
					arg0.aClass3_Sub3_Sub3_3 = Static132.method1577(arg0.aClass3_Sub4_Sub1_1, arg0.aClass3_Sub3_Sub3_3.method1575(), 0, arg0.aClass3_Sub3_Sub3_3.method1573());
					this.aClass3_Sub3_Sub2_1.method1255(arg0, arg0.aClass3_Sub10_1.aShortArray4[arg0.anInt3036] < 0);
				}
				if (arg0.aClass3_Sub10_1.aShortArray4[arg0.anInt3036] < 0) {
					arg0.aClass3_Sub3_Sub3_3.method1564(-1);
				}
				arg1 = arg0.anInt3035 / local26;
			}
		}
		arg0.aClass3_Sub3_Sub3_3.method2057(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "([III)V")
	@Override
	public void method2062(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub3_Sub4_1.method2062(arg0, arg1, arg2);
		@Pc(15) int local15 = arg2 + arg1;
		for (@Pc(21) Class3_Sub19 local21 = (Class3_Sub19) this.aClass37_1.method989(); local21 != null; local21 = (Class3_Sub19) this.aClass37_1.method990()) {
			if (!this.aClass3_Sub3_Sub2_1.method1267(local21)) {
				@Pc(31) int local31 = arg2;
				@Pc(33) int local33 = arg1;
				do {
					if (local21.anInt3042 >= local31) {
						this.method169(local15, local21, arg0, local31, local33);
						local21.anInt3042 -= local31;
						break;
					}
					this.method169(local15, local21, arg0, local21.anInt3042, local33);
					local31 -= local21.anInt3042;
					local33 += local21.anInt3042;
				} while (!this.aClass3_Sub3_Sub2_1.method1244(local21));
			}
		}
	}
}
