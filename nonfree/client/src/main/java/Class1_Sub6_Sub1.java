import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "Lclient!gca;")
	public final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "Lclient!se;")
	public final Class1_Sub6_Sub3 aClass1_Sub6_Sub3_1 = new Class1_Sub6_Sub3();

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Lclient!jba;")
	private final Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!jba;)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		this.aClass1_Sub6_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ag;II[III)V")
	private void method466(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub6_Sub2_1.anIntArray239[arg0.anInt305] & 0x4) != 0 && arg0.anInt301 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub6_Sub2_1.anIntArray238[arg0.anInt305] / Static304.anInt5650;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg0.anInt302) / local25;
				if (local35 > arg1) {
					arg0.anInt302 += local25 * arg1;
					break;
				}
				arg0.aClass1_Sub6_Sub4_3.method6576(arg2, arg4, local35);
				arg1 -= local35;
				arg4 += local35;
				arg0.anInt302 += local35 * local25 - 1048576;
				@Pc(66) int local66 = Static304.anInt5650 / 100;
				@Pc(70) int local70 = 262144 / local25;
				if (local70 < local66) {
					local66 = local70;
				}
				@Pc(78) Class1_Sub6_Sub4 local78 = arg0.aClass1_Sub6_Sub4_3;
				if (this.aClass1_Sub6_Sub2_1.anIntArray240[arg0.anInt305] == 0) {
					arg0.aClass1_Sub6_Sub4_3 = Static605.method6617(arg0.aClass1_Sub13_Sub1_3, local78.method6614(), local78.method6585(), local78.method6590());
				} else {
					arg0.aClass1_Sub6_Sub4_3 = Static605.method6617(arg0.aClass1_Sub13_Sub1_3, local78.method6614(), 0, local78.method6590());
					this.aClass1_Sub6_Sub2_1.method3506(arg0.aClass1_Sub48_1.aShortArray136[arg0.anInt290] < 0, arg0);
					arg0.aClass1_Sub6_Sub4_3.method6598(local66, local78.method6585());
				}
				if (arg0.aClass1_Sub48_1.aShortArray136[arg0.anInt290] < 0) {
					arg0.aClass1_Sub6_Sub4_3.method6620(-1);
				}
				local78.method6611(local66);
				local78.method6576(arg2, arg4, arg3 - arg4);
				if (local78.method6584()) {
					this.aClass1_Sub6_Sub3_1.method6530(local78);
				}
			}
		}
		arg0.aClass1_Sub6_Sub4_3.method6576(arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ag;II)V")
	private void method467(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub6_Sub2_1.anIntArray239[arg0.anInt305] & 0x4) != 0 && arg0.anInt301 < 0) {
			@Pc(20) int local20 = this.aClass1_Sub6_Sub2_1.anIntArray238[arg0.anInt305] / Static304.anInt5650;
			@Pc(29) int local29 = (local20 + 1048575 - arg0.anInt302) / local20;
			arg0.anInt302 = arg1 * local20 + arg0.anInt302 & 0xFFFFF;
			if (arg1 >= local29) {
				if (this.aClass1_Sub6_Sub2_1.anIntArray240[arg0.anInt305] == 0) {
					arg0.aClass1_Sub6_Sub4_3 = Static605.method6617(arg0.aClass1_Sub13_Sub1_3, arg0.aClass1_Sub6_Sub4_3.method6614(), arg0.aClass1_Sub6_Sub4_3.method6585(), arg0.aClass1_Sub6_Sub4_3.method6590());
				} else {
					arg0.aClass1_Sub6_Sub4_3 = Static605.method6617(arg0.aClass1_Sub13_Sub1_3, arg0.aClass1_Sub6_Sub4_3.method6614(), 0, arg0.aClass1_Sub6_Sub4_3.method6590());
					this.aClass1_Sub6_Sub2_1.method3506(arg0.aClass1_Sub48_1.aShortArray136[arg0.anInt290] < 0, arg0);
				}
				if (arg0.aClass1_Sub48_1.aShortArray136[arg0.anInt290] < 0) {
					arg0.aClass1_Sub6_Sub4_3.method6620(-1);
				}
				arg1 = arg0.anInt302 / local20;
			}
		}
		arg0.aClass1_Sub6_Sub4_3.method6579(arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([III)V")
	@Override
	public void method6576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub6_Sub3_1.method6576(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass111_1.method2547(); local17 != null; local17 = (Class1_Sub5) this.aClass111_1.method2554()) {
			if (!this.aClass1_Sub6_Sub2_1.method3500(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt289) {
						this.method466(local17, local29, arg0, local27 + local29, local27);
						local17.anInt289 -= local29;
						break;
					}
					this.method466(local17, local17.anInt289, arg0, local27 + local29, local27);
					local27 += local17.anInt289;
					local29 -= local17.anInt289;
				} while (!this.aClass1_Sub6_Sub2_1.method3530(local17, arg0, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub6 method6578() {
		@Pc(9) Class1_Sub5 local9;
		do {
			local9 = (Class1_Sub5) this.aClass111_1.method2554();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub6_Sub4_3 == null);
		return local9.aClass1_Sub6_Sub4_3;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public void method6579(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_Sub3_1.method6579(arg0);
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass111_1.method2547(); local15 != null; local15 = (Class1_Sub5) this.aClass111_1.method2554()) {
			if (!this.aClass1_Sub6_Sub2_1.method3500(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt289) {
						this.method467(local15, local25);
						local15.anInt289 -= local25;
						break;
					}
					this.method467(local15, local15.anInt289);
					local25 -= local15.anInt289;
				} while (!this.aClass1_Sub6_Sub2_1.method3530(local15, null, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()I")
	@Override
	public int method6580() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub6 method6577() {
		@Pc(9) Class1_Sub5 local9 = (Class1_Sub5) this.aClass111_1.method2547();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub6_Sub4_3 == null) {
			return this.method6578();
		} else {
			return local9.aClass1_Sub6_Sub4_3;
		}
	}
}
