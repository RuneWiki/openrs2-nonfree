import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "Lclient!mr;")
	public final Class223 aClass223_63 = new Class223();

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "Lclient!caa;")
	public final Class3_Sub7_Sub1 aClass3_Sub7_Sub1_2 = new Class3_Sub7_Sub1();

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "Lclient!eg;")
	private final Class3_Sub7_Sub2 aClass3_Sub7_Sub2_4;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class3_Sub7_Sub5(@OriginalArg(0) Class3_Sub7_Sub2 arg0) {
		this.aClass3_Sub7_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "()I")
	@Override
	public int method8763() {
		return 0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZLclient!md;II[I)V")
	private void method8764(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub36 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass3_Sub7_Sub2_4.anIntArray119[arg1.anInt6663] & 0x4) != 0 && arg1.anInt6673 < 0) {
			@Pc(40) int local40 = this.aClass3_Sub7_Sub2_4.anIntArray116[arg1.anInt6663] / Static276.anInt4980;
			while (true) {
				@Pc(49) int local49 = (local40 + 1048575 - arg1.anInt6675) / local40;
				if (local49 > arg2) {
					arg1.anInt6675 += arg2 * local40;
					break;
				}
				arg1.aClass3_Sub7_Sub3_3.method8757(arg4, arg3, local49);
				arg1.anInt6675 += local40 * local49 - 1048576;
				arg3 += local49;
				arg2 -= local49;
				@Pc(84) int local84 = Static276.anInt4980 / 100;
				@Pc(88) int local88 = 262144 / local40;
				if (local84 > local88) {
					local84 = local88;
				}
				@Pc(100) Class3_Sub7_Sub3 local100 = arg1.aClass3_Sub7_Sub3_3;
				if (this.aClass3_Sub7_Sub2_4.anIntArray113[arg1.anInt6663] == 0) {
					arg1.aClass3_Sub7_Sub3_3 = Static647.method4058(arg1.aClass3_Sub30_Sub1_3, local100.method4045(), local100.method4040(), local100.method4053());
				} else {
					arg1.aClass3_Sub7_Sub3_3 = Static647.method4058(arg1.aClass3_Sub30_Sub1_3, local100.method4045(), 0, local100.method4053());
					this.aClass3_Sub7_Sub2_4.method2458(arg1, arg1.aClass3_Sub44_1.aShortArray117[arg1.anInt6666] < 0);
					arg1.aClass3_Sub7_Sub3_3.method4056(local84, local100.method4040());
				}
				if (arg1.aClass3_Sub44_1.aShortArray117[arg1.anInt6666] < 0) {
					arg1.aClass3_Sub7_Sub3_3.method4068(-1);
				}
				local100.method4064(local84);
				local100.method8757(arg4, arg3, arg0 - arg3);
				if (local100.method4067()) {
					this.aClass3_Sub7_Sub1_2.method1626(local100);
				}
			}
		}
		arg1.aClass3_Sub7_Sub3_3.method8757(arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILclient!md;)V")
	private void method8765(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub36 arg1) {
		if ((this.aClass3_Sub7_Sub2_4.anIntArray119[arg1.anInt6663] & 0x4) != 0 && arg1.anInt6673 < 0) {
			@Pc(23) int local23 = this.aClass3_Sub7_Sub2_4.anIntArray116[arg1.anInt6663] / Static276.anInt4980;
			@Pc(34) int local34 = (local23 + 1048575 - arg1.anInt6675) / local23;
			arg1.anInt6675 = arg0 * local23 + arg1.anInt6675 & 0xFFFFF;
			if (arg0 >= local34) {
				if (this.aClass3_Sub7_Sub2_4.anIntArray113[arg1.anInt6663] == 0) {
					arg1.aClass3_Sub7_Sub3_3 = Static647.method4058(arg1.aClass3_Sub30_Sub1_3, arg1.aClass3_Sub7_Sub3_3.method4045(), arg1.aClass3_Sub7_Sub3_3.method4040(), arg1.aClass3_Sub7_Sub3_3.method4053());
				} else {
					arg1.aClass3_Sub7_Sub3_3 = Static647.method4058(arg1.aClass3_Sub30_Sub1_3, arg1.aClass3_Sub7_Sub3_3.method4045(), 0, arg1.aClass3_Sub7_Sub3_3.method4053());
					this.aClass3_Sub7_Sub2_4.method2458(arg1, arg1.aClass3_Sub44_1.aShortArray117[arg1.anInt6666] < 0);
				}
				if (arg1.aClass3_Sub44_1.aShortArray117[arg1.anInt6666] < 0) {
					arg1.aClass3_Sub7_Sub3_3.method4068(-1);
				}
				arg0 = arg1.anInt6675 / local23;
			}
		}
		arg1.aClass3_Sub7_Sub3_3.method8758(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
	@Override
	public void method8758(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7_Sub1_2.method8758(arg0);
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) this.aClass223_63.method5874(); local15 != null; local15 = (Class3_Sub36) this.aClass223_63.method5870()) {
			if (!this.aClass3_Sub7_Sub2_4.method2452(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6672) {
						this.method8765(local25, local15);
						local15.anInt6672 -= local25;
						break;
					}
					this.method8765(local15.anInt6672, local15);
					local25 -= local15.anInt6672;
				} while (!this.aClass3_Sub7_Sub2_4.method2468(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8761() {
		@Pc(9) Class3_Sub36 local9 = (Class3_Sub36) this.aClass223_63.method5874();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub7_Sub3_3 == null) {
			return this.method8760();
		} else {
			return local9.aClass3_Sub7_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8760() {
		@Pc(9) Class3_Sub36 local9;
		do {
			local9 = (Class3_Sub36) this.aClass223_63.method5870();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub7_Sub3_3 == null);
		return local9.aClass3_Sub7_Sub3_3;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([III)V")
	@Override
	public void method8757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub7_Sub1_2.method8757(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) this.aClass223_63.method5874(); local17 != null; local17 = (Class3_Sub36) this.aClass223_63.method5870()) {
			if (!this.aClass3_Sub7_Sub2_4.method2452(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt6672 >= local27) {
						this.method8764(local27 + local29, local17, local27, local29, arg0);
						local17.anInt6672 -= local27;
						break;
					}
					this.method8764(local27 + local29, local17, local17.anInt6672, local29, arg0);
					local27 -= local17.anInt6672;
					local29 += local17.anInt6672;
				} while (!this.aClass3_Sub7_Sub2_4.method2468(local17, local29, local27, arg0));
			}
		}
	}
}
