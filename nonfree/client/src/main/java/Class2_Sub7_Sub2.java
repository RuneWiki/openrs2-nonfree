import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Lclient!pi;")
	public final Class67 aClass67_4 = new Class67();

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Lclient!u;")
	public final Class2_Sub7_Sub4 aClass2_Sub7_Sub4_1 = new Class2_Sub7_Sub4();

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "Lclient!h;")
	private final Class2_Sub7_Sub1 aClass2_Sub7_Sub1_2;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class2_Sub7_Sub2(@OriginalArg(0) Class2_Sub7_Sub1 arg0) {
		this.aClass2_Sub7_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[IIILclient!lf;I)V")
	private void method1882(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub14 arg4) {
		if ((this.aClass2_Sub7_Sub1_2.anIntArray201[arg4.anInt2992] & 0x4) != 0 && arg4.anInt2990 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub7_Sub1_2.anIntArray203[arg4.anInt2992] / Static98.anInt2858;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg4.anInt3007) / local29;
				if (local39 > arg3) {
					arg4.anInt3007 += arg3 * local29;
					break;
				}
				arg4.aClass2_Sub7_Sub3_1.method3312(arg1, arg0, local39);
				@Pc(52) int local52 = Static98.anInt2858 / 100;
				arg4.anInt3007 += local29 * local39 - 1048576;
				arg3 -= local39;
				@Pc(70) int local70 = 262144 / local29;
				arg0 += local39;
				if (local70 < local52) {
					local52 = local70;
				}
				@Pc(86) Class2_Sub7_Sub3 local86 = arg4.aClass2_Sub7_Sub3_1;
				if (this.aClass2_Sub7_Sub1_2.anIntArray193[arg4.anInt2992] == 0) {
					arg4.aClass2_Sub7_Sub3_1 = Static205.method3244(arg4.aClass2_Sub16_Sub1_1, local86.method3248(), local86.method3220(), local86.method3229());
				} else {
					arg4.aClass2_Sub7_Sub3_1 = Static205.method3244(arg4.aClass2_Sub16_Sub1_1, local86.method3248(), 0, local86.method3229());
					this.aClass2_Sub7_Sub1_2.method1546(arg4, arg4.aClass2_Sub10_1.aShortArray43[arg4.anInt2991] < 0);
					arg4.aClass2_Sub7_Sub3_1.method3236(local52, local86.method3220());
				}
				if (arg4.aClass2_Sub10_1.aShortArray43[arg4.anInt2991] < 0) {
					arg4.aClass2_Sub7_Sub3_1.method3243(-1);
				}
				local86.method3254(local52);
				local86.method3312(arg1, arg0, arg2 - arg0);
				if (local86.method3251()) {
					this.aClass2_Sub7_Sub4_1.method3322(local86);
				}
			}
		}
		arg4.aClass2_Sub7_Sub3_1.method3312(arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)V")
	@Override
	public void method3312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub7_Sub4_1.method3312(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub14 local17 = (Class2_Sub14) this.aClass67_4.method2848(); local17 != null; local17 = (Class2_Sub14) this.aClass67_4.method2851()) {
			if (!this.aClass2_Sub7_Sub1_2.method1526(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2995 >= local29) {
						this.method1882(local27, arg0, local27 + local29, local29, local17);
						local17.anInt2995 -= local29;
						break;
					}
					this.method1882(local27, arg0, local29 + local27, local17.anInt2995, local17);
					local29 -= local17.anInt2995;
					local27 += local17.anInt2995;
				} while (!this.aClass2_Sub7_Sub1_2.method1538(local27, local17, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
	@Override
	public int method3311() {
		return 0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lclient!sg;")
	@Override
	public Class2_Sub7 method3313() {
		@Pc(9) Class2_Sub14 local9 = (Class2_Sub14) this.aClass67_4.method2848();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub7_Sub3_1 == null) {
			return this.method3314();
		} else {
			return local9.aClass2_Sub7_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lclient!sg;")
	@Override
	public Class2_Sub7 method3314() {
		@Pc(9) Class2_Sub14 local9;
		do {
			local9 = (Class2_Sub14) this.aClass67_4.method2851();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub7_Sub3_1 == null);
		return local9.aClass2_Sub7_Sub3_1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILclient!lf;)V")
	private void method1886(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub14 arg1) {
		if ((this.aClass2_Sub7_Sub1_2.anIntArray201[arg1.anInt2992] & 0x4) != 0 && arg1.anInt2990 < 0) {
			@Pc(24) int local24 = this.aClass2_Sub7_Sub1_2.anIntArray203[arg1.anInt2992] / Static98.anInt2858;
			@Pc(33) int local33 = (local24 + 1048575 - arg1.anInt3007) / local24;
			arg1.anInt3007 = arg0 * local24 + arg1.anInt3007 & 0xFFFFF;
			if (arg0 >= local33) {
				if (this.aClass2_Sub7_Sub1_2.anIntArray193[arg1.anInt2992] == 0) {
					arg1.aClass2_Sub7_Sub3_1 = Static205.method3244(arg1.aClass2_Sub16_Sub1_1, arg1.aClass2_Sub7_Sub3_1.method3248(), arg1.aClass2_Sub7_Sub3_1.method3220(), arg1.aClass2_Sub7_Sub3_1.method3229());
				} else {
					arg1.aClass2_Sub7_Sub3_1 = Static205.method3244(arg1.aClass2_Sub16_Sub1_1, arg1.aClass2_Sub7_Sub3_1.method3248(), 0, arg1.aClass2_Sub7_Sub3_1.method3229());
					this.aClass2_Sub7_Sub1_2.method1546(arg1, arg1.aClass2_Sub10_1.aShortArray43[arg1.anInt2991] < 0);
				}
				if (arg1.aClass2_Sub10_1.aShortArray43[arg1.anInt2991] < 0) {
					arg1.aClass2_Sub7_Sub3_1.method3243(-1);
				}
				arg0 = arg1.anInt3007 / local24;
			}
		}
		arg1.aClass2_Sub7_Sub3_1.method3309(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	@Override
	public void method3309(@OriginalArg(0) int arg0) {
		this.aClass2_Sub7_Sub4_1.method3309(arg0);
		for (@Pc(15) Class2_Sub14 local15 = (Class2_Sub14) this.aClass67_4.method2848(); local15 != null; local15 = (Class2_Sub14) this.aClass67_4.method2851()) {
			if (!this.aClass2_Sub7_Sub1_2.method1526(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2995) {
						this.method1886(local25, local15);
						local15.anInt2995 -= local25;
						break;
					}
					this.method1886(local15.anInt2995, local15);
					local25 -= local15.anInt2995;
				} while (!this.aClass2_Sub7_Sub1_2.method1538(0, local15, null, local25));
			}
		}
	}
}
