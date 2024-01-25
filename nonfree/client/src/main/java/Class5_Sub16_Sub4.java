import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class5_Sub16_Sub4 extends Class5_Sub16 {

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "Lclient!ro;")
	public final Class306 aClass306_44 = new Class306();

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "Lclient!oca;")
	public final Class5_Sub16_Sub3 aClass5_Sub16_Sub3_2 = new Class5_Sub16_Sub3();

	@OriginalMember(owner = "client!qba", name = "x", descriptor = "Lclient!ft;")
	private final Class5_Sub16_Sub1 aClass5_Sub16_Sub1_3;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class5_Sub16_Sub4(@OriginalArg(0) Class5_Sub16_Sub1 arg0) {
		this.aClass5_Sub16_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "()I")
	@Override
	public int method8287() {
		return 0;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8283() {
		@Pc(9) Class5_Sub30 local9 = (Class5_Sub30) this.aClass306_44.method7313();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub16_Sub2_2 == null) {
			return this.method8281();
		} else {
			return local9.aClass5_Sub16_Sub2_2;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([III)V")
	@Override
	public void method8282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub16_Sub3_2.method8282(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub30 local17 = (Class5_Sub30) this.aClass306_44.method7313(); local17 != null; local17 = (Class5_Sub30) this.aClass306_44.method7301()) {
			if (!this.aClass5_Sub16_Sub1_3.method2591(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt5825 >= local29) {
						this.method6736(local29, local17, local27 + local29, local27, arg0);
						local17.anInt5825 -= local29;
						break;
					}
					this.method6736(local17.anInt5825, local17, local29 + local27, local27, arg0);
					local29 -= local17.anInt5825;
					local27 += local17.anInt5825;
				} while (!this.aClass5_Sub16_Sub1_3.method2562(local17, arg0, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	@Override
	public void method8286(@OriginalArg(0) int arg0) {
		this.aClass5_Sub16_Sub3_2.method8286(arg0);
		for (@Pc(15) Class5_Sub30 local15 = (Class5_Sub30) this.aClass306_44.method7313(); local15 != null; local15 = (Class5_Sub30) this.aClass306_44.method7301()) {
			if (!this.aClass5_Sub16_Sub1_3.method2591(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5825 >= local25) {
						this.method6735(local25, local15);
						local15.anInt5825 -= local25;
						break;
					}
					this.method6735(local15.anInt5825, local15);
					local25 -= local15.anInt5825;
				} while (!this.aClass5_Sub16_Sub1_3.method2562(local15, (int[]) null, 0, local25));
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BILclient!lv;)V")
	private void method6735(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub30 arg1) {
		if ((this.aClass5_Sub16_Sub1_3.anIntArray263[arg1.anInt5826] & 0x4) != 0 && arg1.anInt5818 < 0) {
			@Pc(33) int local33 = this.aClass5_Sub16_Sub1_3.anIntArray268[arg1.anInt5826] / Static92.anInt9993;
			@Pc(43) int local43 = (local33 + 1048575 - arg1.anInt5833) / local33;
			arg1.anInt5833 = arg1.anInt5833 + local33 * arg0 & 0xFFFFF;
			if (local43 <= arg0) {
				if (this.aClass5_Sub16_Sub1_3.anIntArray261[arg1.anInt5826] == 0) {
					arg1.aClass5_Sub16_Sub2_2 = Static653.method3341(arg1.aClass5_Sub11_Sub1_2, arg1.aClass5_Sub16_Sub2_2.method3359(), arg1.aClass5_Sub16_Sub2_2.method3364(), arg1.aClass5_Sub16_Sub2_2.method3345());
				} else {
					arg1.aClass5_Sub16_Sub2_2 = Static653.method3341(arg1.aClass5_Sub11_Sub1_2, arg1.aClass5_Sub16_Sub2_2.method3359(), 0, arg1.aClass5_Sub16_Sub2_2.method3345());
					this.aClass5_Sub16_Sub1_3.method2588(arg1, arg1.aClass5_Sub51_1.aShortArray190[arg1.anInt5821] < 0);
				}
				if (arg1.aClass5_Sub51_1.aShortArray190[arg1.anInt5821] < 0) {
					arg1.aClass5_Sub16_Sub2_2.method3352(-1);
				}
				arg0 = arg1.anInt5833 / local33;
			}
		}
		arg1.aClass5_Sub16_Sub2_2.method8286(arg0);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!lv;BII[I)V")
	private void method6736(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass5_Sub16_Sub1_3.anIntArray263[arg1.anInt5826] & 0x4) != 0 && arg1.anInt5818 < 0) {
			@Pc(38) int local38 = this.aClass5_Sub16_Sub1_3.anIntArray268[arg1.anInt5826] / Static92.anInt9993;
			while (true) {
				@Pc(48) int local48 = (local38 + 1048575 - arg1.anInt5833) / local38;
				if (local48 > arg0) {
					arg1.anInt5833 += arg0 * local38;
					break;
				}
				arg1.aClass5_Sub16_Sub2_2.method8282(arg4, arg3, local48);
				arg0 -= local48;
				arg3 += local48;
				arg1.anInt5833 += local48 * local38 - 1048576;
				@Pc(79) int local79 = Static92.anInt9993 / 100;
				@Pc(83) int local83 = 262144 / local38;
				if (local83 < local79) {
					local79 = local83;
				}
				@Pc(95) Class5_Sub16_Sub2 local95 = arg1.aClass5_Sub16_Sub2_2;
				if (this.aClass5_Sub16_Sub1_3.anIntArray261[arg1.anInt5826] == 0) {
					arg1.aClass5_Sub16_Sub2_2 = Static653.method3341(arg1.aClass5_Sub11_Sub1_2, local95.method3359(), local95.method3364(), local95.method3345());
				} else {
					arg1.aClass5_Sub16_Sub2_2 = Static653.method3341(arg1.aClass5_Sub11_Sub1_2, local95.method3359(), 0, local95.method3345());
					this.aClass5_Sub16_Sub1_3.method2588(arg1, arg1.aClass5_Sub51_1.aShortArray190[arg1.anInt5821] < 0);
					arg1.aClass5_Sub16_Sub2_2.method3339(local79, local95.method3364());
				}
				if (arg1.aClass5_Sub51_1.aShortArray190[arg1.anInt5821] < 0) {
					arg1.aClass5_Sub16_Sub2_2.method3352(-1);
				}
				local95.method3369(local79);
				local95.method8282(arg4, arg3, arg2 - arg3);
				if (local95.method3353()) {
					this.aClass5_Sub16_Sub3_2.method6140(local95);
				}
			}
		}
		arg1.aClass5_Sub16_Sub2_2.method8282(arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8281() {
		@Pc(9) Class5_Sub30 local9;
		do {
			local9 = (Class5_Sub30) this.aClass306_44.method7301();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub16_Sub2_2 == null);
		return local9.aClass5_Sub16_Sub2_2;
	}
}
