import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!nd;")
	public final Class59 aClass59_2 = new Class59();

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Lclient!se;")
	public final Class3_Sub5_Sub3 aClass3_Sub5_Sub3_1 = new Class3_Sub5_Sub3();

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!qh;")
	private final Class3_Sub5_Sub2 aClass3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) Class3_Sub5_Sub2 arg0) {
		this.aClass3_Sub5_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()Lclient!le;")
	@Override
	public Class3_Sub5 method2775() {
		@Pc(9) Class3_Sub23 local9;
		do {
			local9 = (Class3_Sub23) this.aClass59_2.method1734();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub5_Sub4_3 == null);
		return local9.aClass3_Sub5_Sub4_3;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLclient!t;)V")
	private void method361(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub23 arg1) {
		if ((this.aClass3_Sub5_Sub2_1.anIntArray362[arg1.anInt3418] & 0x4) != 0 && arg1.anInt3433 < 0) {
			@Pc(20) int local20 = this.aClass3_Sub5_Sub2_1.anIntArray360[arg1.anInt3418] / Static149.anInt3584;
			@Pc(29) int local29 = (local20 + 1048575 - arg1.anInt3426) / local20;
			arg1.anInt3426 = arg0 * local20 + arg1.anInt3426 & 0xFFFFF;
			if (local29 <= arg0) {
				if (this.aClass3_Sub5_Sub2_1.anIntArray357[arg1.anInt3418] == 0) {
					arg1.aClass3_Sub5_Sub4_3 = Static189.method2794(arg1.aClass3_Sub9_Sub1_1, arg1.aClass3_Sub5_Sub4_3.method2809(), arg1.aClass3_Sub5_Sub4_3.method2788(), arg1.aClass3_Sub5_Sub4_3.method2793());
				} else {
					arg1.aClass3_Sub5_Sub4_3 = Static189.method2794(arg1.aClass3_Sub9_Sub1_1, arg1.aClass3_Sub5_Sub4_3.method2809(), 0, arg1.aClass3_Sub5_Sub4_3.method2793());
					this.aClass3_Sub5_Sub2_1.method2295(arg1.aClass3_Sub22_1.aShortArray30[arg1.anInt3422] < 0, arg1);
				}
				if (arg1.aClass3_Sub22_1.aShortArray30[arg1.anInt3422] < 0) {
					arg1.aClass3_Sub5_Sub4_3.method2785(-1);
				}
				arg0 = arg1.anInt3426 / local20;
			}
		}
		arg1.aClass3_Sub5_Sub4_3.method2769(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
	@Override
	public int method2770() {
		return 0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	@Override
	public void method2769(@OriginalArg(0) int arg0) {
		this.aClass3_Sub5_Sub3_1.method2769(arg0);
		for (@Pc(11) Class3_Sub23 local11 = (Class3_Sub23) this.aClass59_2.method1731(); local11 != null; local11 = (Class3_Sub23) this.aClass59_2.method1734()) {
			if (!this.aClass3_Sub5_Sub2_1.method2293(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt3430) {
						this.method361(local21, local11);
						local11.anInt3430 -= local21;
						break;
					}
					this.method361(local11.anInt3430, local11);
					local21 -= local11.anInt3430;
				} while (!this.aClass3_Sub5_Sub2_1.method2289(local11, local21, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lclient!le;")
	@Override
	public Class3_Sub5 method2774() {
		@Pc(9) Class3_Sub23 local9 = (Class3_Sub23) this.aClass59_2.method1731();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub5_Sub4_3 == null) {
			return this.method2775();
		} else {
			return local9.aClass3_Sub5_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([IILclient!t;III)V")
	private void method366(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub23 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub5_Sub2_1.anIntArray362[arg2.anInt3418] & 0x4) != 0 && arg2.anInt3433 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub5_Sub2_1.anIntArray360[arg2.anInt3418] / Static149.anInt3584;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg2.anInt3426) / local29;
				if (arg3 < local39) {
					arg2.anInt3426 += arg3 * local29;
					break;
				}
				arg2.aClass3_Sub5_Sub4_3.method2773(arg0, arg4, local39);
				arg3 -= local39;
				arg4 += local39;
				arg2.anInt3426 += local29 * local39 - 1048576;
				@Pc(74) int local74 = Static149.anInt3584 / 100;
				@Pc(78) int local78 = 262144 / local29;
				if (local74 > local78) {
					local74 = local78;
				}
				@Pc(90) Class3_Sub5_Sub4 local90 = arg2.aClass3_Sub5_Sub4_3;
				if (this.aClass3_Sub5_Sub2_1.anIntArray357[arg2.anInt3418] == 0) {
					arg2.aClass3_Sub5_Sub4_3 = Static189.method2794(arg2.aClass3_Sub9_Sub1_1, local90.method2809(), local90.method2788(), local90.method2793());
				} else {
					arg2.aClass3_Sub5_Sub4_3 = Static189.method2794(arg2.aClass3_Sub9_Sub1_1, local90.method2809(), 0, local90.method2793());
					this.aClass3_Sub5_Sub2_1.method2295(arg2.aClass3_Sub22_1.aShortArray30[arg2.anInt3422] < 0, arg2);
					arg2.aClass3_Sub5_Sub4_3.method2801(local74, local90.method2788());
				}
				if (arg2.aClass3_Sub22_1.aShortArray30[arg2.anInt3422] < 0) {
					arg2.aClass3_Sub5_Sub4_3.method2785(-1);
				}
				local90.method2790(local74);
				local90.method2773(arg0, arg4, arg1 - arg4);
				if (local90.method2796()) {
					this.aClass3_Sub5_Sub3_1.method2455(local90);
				}
			}
		}
		arg2.aClass3_Sub5_Sub4_3.method2773(arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V")
	@Override
	public void method2773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub5_Sub3_1.method2773(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass59_2.method1731(); local17 != null; local17 = (Class3_Sub23) this.aClass59_2.method1734()) {
			if (!this.aClass3_Sub5_Sub2_1.method2293(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt3430 >= local29) {
						this.method366(arg0, local27 + local29, local17, local29, local27);
						local17.anInt3430 -= local29;
						break;
					}
					this.method366(arg0, local27 + local29, local17, local17.anInt3430, local27);
					local29 -= local17.anInt3430;
					local27 += local17.anInt3430;
				} while (!this.aClass3_Sub5_Sub2_1.method2289(local17, local29, arg0, local27));
			}
		}
	}
}
