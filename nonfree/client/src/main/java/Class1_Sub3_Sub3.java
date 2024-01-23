import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "Lclient!qg;")
	public Class131 aClass131_9 = new Class131();

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "Lclient!ca;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1();

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Lclient!df;")
	private Class1_Sub3_Sub2 aClass1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!df;)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class1_Sub3_Sub2 arg0) {
		this.aClass1_Sub3_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()Lclient!ba;")
	@Override
	public Class1_Sub3 method2543() {
		@Pc(9) Class1_Sub25 local9 = (Class1_Sub25) this.aClass131_9.method3791();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub3_Sub4_3 == null) {
			return this.method2542();
		} else {
			return local9.aClass1_Sub3_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()I")
	@Override
	public int method2541() {
		return 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILclient!oj;I[II)V")
	private void method2347(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub25 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub3_Sub2_1.anIntArray132[arg1.anInt4268] & 0x4) != 0 && arg1.anInt4277 < 0) {
			@Pc(33) int local33 = this.aClass1_Sub3_Sub2_1.anIntArray121[arg1.anInt4268] / Static43.anInt1255;
			while (true) {
				@Pc(43) int local43 = (local33 + 1048575 - arg1.anInt4285) / local33;
				if (local43 > arg2) {
					arg1.anInt4285 += local33 * arg2;
					break;
				}
				arg1.aClass1_Sub3_Sub4_3.method2540(arg3, arg0, local43);
				arg2 -= local43;
				@Pc(60) int local60 = 262144 / local33;
				arg0 += local43;
				arg1.anInt4285 += local43 * local33 - 1048576;
				@Pc(78) int local78 = Static43.anInt1255 / 100;
				@Pc(81) Class1_Sub3_Sub4 local81 = arg1.aClass1_Sub3_Sub4_3;
				if (local78 > local60) {
					local78 = local60;
				}
				if (this.aClass1_Sub3_Sub2_1.anIntArray122[arg1.anInt4268] == 0) {
					arg1.aClass1_Sub3_Sub4_3 = Static304.method2561(arg1.aClass1_Sub4_Sub1_1, local81.method2559(), local81.method2545(), local81.method2566());
				} else {
					arg1.aClass1_Sub3_Sub4_3 = Static304.method2561(arg1.aClass1_Sub4_Sub1_1, local81.method2559(), 0, local81.method2566());
					this.aClass1_Sub3_Sub2_1.method978(arg1.aClass1_Sub17_1.aShortArray45[arg1.anInt4276] < 0, arg1);
					arg1.aClass1_Sub3_Sub4_3.method2582(local78, local81.method2545());
				}
				if (arg1.aClass1_Sub17_1.aShortArray45[arg1.anInt4276] < 0) {
					arg1.aClass1_Sub3_Sub4_3.method2583(-1);
				}
				local81.method2547(local78);
				local81.method2540(arg3, arg0, arg4 - arg0);
				if (local81.method2579()) {
					this.aClass1_Sub3_Sub1_1.method522(local81);
				}
			}
		}
		arg1.aClass1_Sub3_Sub4_3.method2540(arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
	@Override
	public void method2540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub3_Sub1_1.method2540(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub25 local17 = (Class1_Sub25) this.aClass131_9.method3791(); local17 != null; local17 = (Class1_Sub25) this.aClass131_9.method3792()) {
			if (!this.aClass1_Sub3_Sub2_1.method991(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt4264) {
						this.method2347(local27, local17, local29, arg0, local27 + local29);
						local17.anInt4264 -= local29;
						break;
					}
					this.method2347(local27, local17, local17.anInt4264, arg0, local27 + local29);
					local27 += local17.anInt4264;
					local29 -= local17.anInt4264;
				} while (!this.aClass1_Sub3_Sub2_1.method977(local27, local29, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!oj;)V")
	private void method2348(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub25 arg1) {
		if ((this.aClass1_Sub3_Sub2_1.anIntArray132[arg1.anInt4268] & 0x4) != 0 && arg1.anInt4277 < 0) {
			@Pc(35) int local35 = this.aClass1_Sub3_Sub2_1.anIntArray121[arg1.anInt4268] / Static43.anInt1255;
			@Pc(44) int local44 = (local35 + 1048575 - arg1.anInt4285) / local35;
			arg1.anInt4285 = arg1.anInt4285 + local35 * arg0 & 0xFFFFF;
			if (local44 <= arg0) {
				if (this.aClass1_Sub3_Sub2_1.anIntArray122[arg1.anInt4268] == 0) {
					arg1.aClass1_Sub3_Sub4_3 = Static304.method2561(arg1.aClass1_Sub4_Sub1_1, arg1.aClass1_Sub3_Sub4_3.method2559(), arg1.aClass1_Sub3_Sub4_3.method2545(), arg1.aClass1_Sub3_Sub4_3.method2566());
				} else {
					arg1.aClass1_Sub3_Sub4_3 = Static304.method2561(arg1.aClass1_Sub4_Sub1_1, arg1.aClass1_Sub3_Sub4_3.method2559(), 0, arg1.aClass1_Sub3_Sub4_3.method2566());
					this.aClass1_Sub3_Sub2_1.method978(arg1.aClass1_Sub17_1.aShortArray45[arg1.anInt4276] < 0, arg1);
				}
				if (arg1.aClass1_Sub17_1.aShortArray45[arg1.anInt4276] < 0) {
					arg1.aClass1_Sub3_Sub4_3.method2583(-1);
				}
				arg0 = arg1.anInt4285 / local35;
			}
		}
		arg1.aClass1_Sub3_Sub4_3.method2539(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lclient!ba;")
	@Override
	public Class1_Sub3 method2542() {
		@Pc(9) Class1_Sub25 local9;
		do {
			local9 = (Class1_Sub25) this.aClass131_9.method3792();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub3_Sub4_3 == null);
		return local9.aClass1_Sub3_Sub4_3;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	@Override
	public void method2539(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3_Sub1_1.method2539(arg0);
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) this.aClass131_9.method3791(); local15 != null; local15 = (Class1_Sub25) this.aClass131_9.method3792()) {
			if (!this.aClass1_Sub3_Sub2_1.method991(local15)) {
				@Pc(28) int local28 = arg0;
				do {
					if (local15.anInt4264 >= local28) {
						this.method2348(local28, local15);
						local15.anInt4264 -= local28;
						break;
					}
					this.method2348(local15.anInt4264, local15);
					local28 -= local15.anInt4264;
				} while (!this.aClass1_Sub3_Sub2_1.method977(0, local28, local15, null));
			}
		}
	}
}
