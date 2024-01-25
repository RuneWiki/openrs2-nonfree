import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class8_Sub16_Sub4 extends Class8_Sub16 {

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Lclient!bq;")
	public final Class43 aClass43_54 = new Class43();

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "Lclient!sm;")
	public final Class8_Sub16_Sub5 aClass8_Sub16_Sub5_2 = new Class8_Sub16_Sub5();

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "Lclient!dia;")
	private final Class8_Sub16_Sub1 aClass8_Sub16_Sub1_3;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class8_Sub16_Sub4(@OriginalArg(0) Class8_Sub16_Sub1 arg0) {
		this.aClass8_Sub16_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[IIIILclient!sia;)V")
	private void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class8_Sub43 arg4) {
		if ((this.aClass8_Sub16_Sub1_3.anIntArray128[arg4.anInt9045] & 0x4) != 0 && arg4.anInt9035 < 0) {
			@Pc(36) int local36 = this.aClass8_Sub16_Sub1_3.anIntArray125[arg4.anInt9045] / Static345.anInt6689;
			while (true) {
				@Pc(45) int local45 = (local36 + 1048575 - arg4.anInt9049) / local36;
				if (local45 > arg2) {
					arg4.anInt9049 += local36 * arg2;
					break;
				}
				arg4.aClass8_Sub16_Sub3_4.method7430(arg1, arg3, local45);
				arg2 -= local45;
				arg3 += local45;
				arg4.anInt9049 += local36 * local45 - 1048576;
				@Pc(76) int local76 = Static345.anInt6689 / 100;
				@Pc(80) int local80 = 262144 / local36;
				if (local76 > local80) {
					local76 = local80;
				}
				@Pc(92) Class8_Sub16_Sub3 local92 = arg4.aClass8_Sub16_Sub3_4;
				if (this.aClass8_Sub16_Sub1_3.anIntArray131[arg4.anInt9045] == 0) {
					arg4.aClass8_Sub16_Sub3_4 = Static651.method6782(arg4.aClass8_Sub9_Sub1_4, local92.method6764(), local92.method6779(), local92.method6755());
				} else {
					arg4.aClass8_Sub16_Sub3_4 = Static651.method6782(arg4.aClass8_Sub9_Sub1_4, local92.method6764(), 0, local92.method6755());
					this.aClass8_Sub16_Sub1_3.method2292(arg4.aClass8_Sub41_1.aShortArray102[arg4.anInt9050] < 0, arg4);
					arg4.aClass8_Sub16_Sub3_4.method6762(local76, local92.method6779());
				}
				if (arg4.aClass8_Sub41_1.aShortArray102[arg4.anInt9050] < 0) {
					arg4.aClass8_Sub16_Sub3_4.method6773(-1);
				}
				local92.method6759(local76);
				local92.method7430(arg1, arg3, arg0 - arg3);
				if (local92.method6765()) {
					this.aClass8_Sub16_Sub5_2.method7442(local92);
				}
			}
		}
		arg4.aClass8_Sub16_Sub3_4.method7430(arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([III)V")
	@Override
	public void method7430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass8_Sub16_Sub5_2.method7430(arg0, arg1, arg2);
		for (@Pc(17) Class8_Sub43 local17 = (Class8_Sub43) this.aClass43_54.method1422(); local17 != null; local17 = (Class8_Sub43) this.aClass43_54.method1426()) {
			if (!this.aClass8_Sub16_Sub1_3.method2285(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt9047 >= local29) {
						this.method6985(local29 + local27, arg0, local29, local27, local17);
						local17.anInt9047 -= local29;
						break;
					}
					this.method6985(local27 + local29, arg0, local17.anInt9047, local27, local17);
					local29 -= local17.anInt9047;
					local27 += local17.anInt9047;
				} while (!this.aClass8_Sub16_Sub1_3.method2269(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!sia;BI)V")
	private void method6986(@OriginalArg(0) Class8_Sub43 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass8_Sub16_Sub1_3.anIntArray128[arg0.anInt9045] & 0x4) != 0 && arg0.anInt9035 < 0) {
			@Pc(31) int local31 = this.aClass8_Sub16_Sub1_3.anIntArray125[arg0.anInt9045] / Static345.anInt6689;
			@Pc(41) int local41 = (local31 + 1048575 - arg0.anInt9049) / local31;
			arg0.anInt9049 = local31 * arg1 + arg0.anInt9049 & 0xFFFFF;
			if (arg1 >= local41) {
				if (this.aClass8_Sub16_Sub1_3.anIntArray131[arg0.anInt9045] == 0) {
					arg0.aClass8_Sub16_Sub3_4 = Static651.method6782(arg0.aClass8_Sub9_Sub1_4, arg0.aClass8_Sub16_Sub3_4.method6764(), arg0.aClass8_Sub16_Sub3_4.method6779(), arg0.aClass8_Sub16_Sub3_4.method6755());
				} else {
					arg0.aClass8_Sub16_Sub3_4 = Static651.method6782(arg0.aClass8_Sub9_Sub1_4, arg0.aClass8_Sub16_Sub3_4.method6764(), 0, arg0.aClass8_Sub16_Sub3_4.method6755());
					this.aClass8_Sub16_Sub1_3.method2292(arg0.aClass8_Sub41_1.aShortArray102[arg0.anInt9050] < 0, arg0);
				}
				if (arg0.aClass8_Sub41_1.aShortArray102[arg0.anInt9050] < 0) {
					arg0.aClass8_Sub16_Sub3_4.method6773(-1);
				}
				arg1 = arg0.anInt9049 / local31;
			}
		}
		arg0.aClass8_Sub16_Sub3_4.method7435(arg1);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7429() {
		@Pc(9) Class8_Sub43 local9;
		do {
			local9 = (Class8_Sub43) this.aClass43_54.method1426();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass8_Sub16_Sub3_4 == null);
		return local9.aClass8_Sub16_Sub3_4;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "()I")
	@Override
	public int method7431() {
		return 0;
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7434() {
		@Pc(9) Class8_Sub43 local9 = (Class8_Sub43) this.aClass43_54.method1422();
		if (local9 == null) {
			return null;
		} else if (local9.aClass8_Sub16_Sub3_4 == null) {
			return this.method7429();
		} else {
			return local9.aClass8_Sub16_Sub3_4;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	@Override
	public void method7435(@OriginalArg(0) int arg0) {
		this.aClass8_Sub16_Sub5_2.method7435(arg0);
		for (@Pc(15) Class8_Sub43 local15 = (Class8_Sub43) this.aClass43_54.method1422(); local15 != null; local15 = (Class8_Sub43) this.aClass43_54.method1426()) {
			if (!this.aClass8_Sub16_Sub1_3.method2285(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt9047) {
						this.method6986(local15, local25);
						local15.anInt9047 -= local25;
						break;
					}
					this.method6986(local15, local15.anInt9047);
					local25 -= local15.anInt9047;
				} while (!this.aClass8_Sub16_Sub1_3.method2269(null, local25, 0, local15));
			}
		}
	}
}
