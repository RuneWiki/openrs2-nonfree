import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lia", name = "A", descriptor = "Lclient!tm;")
	public final Class338 aClass338_145 = new Class338();

	@OriginalMember(owner = "client!lia", name = "D", descriptor = "Lclient!bd;")
	public final Class3_Sub1_Sub2 aClass3_Sub1_Sub2_2 = new Class3_Sub1_Sub2();

	@OriginalMember(owner = "client!lia", name = "t", descriptor = "Lclient!dr;")
	private final Class3_Sub1_Sub3 aClass3_Sub1_Sub3_3;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class3_Sub1_Sub4(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		this.aClass3_Sub1_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5782() {
		@Pc(9) Class3_Sub50 local9;
		do {
			local9 = (Class3_Sub50) this.aClass338_145.method8168();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub1_Sub1_4 == null);
		return local9.aClass3_Sub1_Sub1_4;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIILclient!sq;[I)V")
	private void method5169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub50 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass3_Sub1_Sub3_3.anIntArray186[arg3.anInt9083] & 0x4) != 0 && arg3.anInt9081 < 0) {
			@Pc(38) int local38 = this.aClass3_Sub1_Sub3_3.anIntArray181[arg3.anInt9083] / Static348.anInt5701;
			while (true) {
				@Pc(48) int local48 = (local38 + 1048575 - arg3.anInt9072) / local38;
				if (arg1 < local48) {
					arg3.anInt9072 += arg1 * local38;
					break;
				}
				arg3.aClass3_Sub1_Sub1_4.method5783(arg4, arg0, local48);
				arg3.anInt9072 += local38 * local48 - 1048576;
				arg0 += local48;
				arg1 -= local48;
				@Pc(83) int local83 = Static348.anInt5701 / 100;
				@Pc(87) int local87 = 262144 / local38;
				if (local87 < local83) {
					local83 = local87;
				}
				@Pc(95) Class3_Sub1_Sub1 local95 = arg3.aClass3_Sub1_Sub1_4;
				if (this.aClass3_Sub1_Sub3_3.anIntArray176[arg3.anInt9083] == 0) {
					arg3.aClass3_Sub1_Sub1_4 = Static679.method67(arg3.aClass3_Sub35_Sub1_4, local95.method95(), local95.method80(), local95.method98());
				} else {
					arg3.aClass3_Sub1_Sub1_4 = Static679.method67(arg3.aClass3_Sub35_Sub1_4, local95.method95(), 0, local95.method98());
					this.aClass3_Sub1_Sub3_3.method2144(arg3.aClass3_Sub20_1.aShortArray29[arg3.anInt9065] < 0, arg3);
					arg3.aClass3_Sub1_Sub1_4.method79(local83, local95.method80());
				}
				if (arg3.aClass3_Sub20_1.aShortArray29[arg3.anInt9065] < 0) {
					arg3.aClass3_Sub1_Sub1_4.method100(-1);
				}
				local95.method104(local83);
				local95.method5783(arg4, arg0, arg2 - arg0);
				if (local95.method105()) {
					this.aClass3_Sub1_Sub2_2.method934(local95);
				}
			}
		}
		arg3.aClass3_Sub1_Sub1_4.method5783(arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "()I")
	@Override
	public int method5780() {
		return 0;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "([III)V")
	@Override
	public void method5783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub1_Sub2_2.method5783(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub50 local17 = (Class3_Sub50) this.aClass338_145.method8177(); local17 != null; local17 = (Class3_Sub50) this.aClass338_145.method8168()) {
			if (!this.aClass3_Sub1_Sub3_3.method2168(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt9069 >= local27) {
						this.method5169(local29, local27, local29 + local27, local17, arg0);
						local17.anInt9069 -= local27;
						break;
					}
					this.method5169(local29, local17.anInt9069, local27 + local29, local17, arg0);
					local27 -= local17.anInt9069;
					local29 += local17.anInt9069;
				} while (!this.aClass3_Sub1_Sub3_3.method2179(local17, local29, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5778() {
		@Pc(9) Class3_Sub50 local9 = (Class3_Sub50) this.aClass338_145.method8177();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub1_Sub1_4 == null) {
			return this.method5782();
		} else {
			return local9.aClass3_Sub1_Sub1_4;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!sq;)V")
	private void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub50 arg1) {
		if ((this.aClass3_Sub1_Sub3_3.anIntArray186[arg1.anInt9083] & 0x4) != 0 && arg1.anInt9081 < 0) {
			@Pc(27) int local27 = this.aClass3_Sub1_Sub3_3.anIntArray181[arg1.anInt9083] / Static348.anInt5701;
			@Pc(37) int local37 = (local27 + 1048575 - arg1.anInt9072) / local27;
			arg1.anInt9072 = local27 * arg0 + arg1.anInt9072 & 0xFFFFF;
			if (arg0 >= local37) {
				if (this.aClass3_Sub1_Sub3_3.anIntArray176[arg1.anInt9083] == 0) {
					arg1.aClass3_Sub1_Sub1_4 = Static679.method67(arg1.aClass3_Sub35_Sub1_4, arg1.aClass3_Sub1_Sub1_4.method95(), arg1.aClass3_Sub1_Sub1_4.method80(), arg1.aClass3_Sub1_Sub1_4.method98());
				} else {
					arg1.aClass3_Sub1_Sub1_4 = Static679.method67(arg1.aClass3_Sub35_Sub1_4, arg1.aClass3_Sub1_Sub1_4.method95(), 0, arg1.aClass3_Sub1_Sub1_4.method98());
					this.aClass3_Sub1_Sub3_3.method2144(arg1.aClass3_Sub20_1.aShortArray29[arg1.anInt9065] < 0, arg1);
				}
				if (arg1.aClass3_Sub20_1.aShortArray29[arg1.anInt9065] < 0) {
					arg1.aClass3_Sub1_Sub1_4.method100(-1);
				}
				arg0 = arg1.anInt9072 / local27;
			}
		}
		arg1.aClass3_Sub1_Sub1_4.method5779(arg0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
	@Override
	public void method5779(@OriginalArg(0) int arg0) {
		this.aClass3_Sub1_Sub2_2.method5779(arg0);
		for (@Pc(15) Class3_Sub50 local15 = (Class3_Sub50) this.aClass338_145.method8177(); local15 != null; local15 = (Class3_Sub50) this.aClass338_145.method8168()) {
			if (!this.aClass3_Sub1_Sub3_3.method2168(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt9069) {
						this.method5171(local25, local15);
						local15.anInt9069 -= local25;
						break;
					}
					this.method5171(local15.anInt9069, local15);
					local25 -= local15.anInt9069;
				} while (!this.aClass3_Sub1_Sub3_3.method2179(local15, 0, (int[]) null, local25));
			}
		}
	}
}
