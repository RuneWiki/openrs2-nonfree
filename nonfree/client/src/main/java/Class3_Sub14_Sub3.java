import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class3_Sub14_Sub3 extends Class3_Sub14 {

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Lclient!ki;")
	public final Class183 aClass183_50 = new Class183();

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Lclient!fg;")
	public final Class3_Sub14_Sub1 aClass3_Sub14_Sub1_1 = new Class3_Sub14_Sub1();

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!uga;")
	private final Class3_Sub14_Sub4 aClass3_Sub14_Sub4_2;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!uga;)V")
	public Class3_Sub14_Sub3(@OriginalArg(0) Class3_Sub14_Sub4 arg0) {
		this.aClass3_Sub14_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!iga;)V")
	private void method6721(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub23 arg1) {
		if ((this.aClass3_Sub14_Sub4_2.anIntArray642[arg1.anInt4454] & 0x4) != 0 && arg1.anInt4460 < 0) {
			@Pc(26) int local26 = this.aClass3_Sub14_Sub4_2.anIntArray629[arg1.anInt4454] / Static149.anInt2863;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt4462) / local26;
			arg1.anInt4462 = arg1.anInt4462 + arg0 * local26 & 0xFFFFF;
			if (arg0 >= local36) {
				if (this.aClass3_Sub14_Sub4_2.anIntArray628[arg1.anInt4454] == 0) {
					arg1.aClass3_Sub14_Sub2_2 = Static606.method6355(arg1.aClass3_Sub6_Sub1_2, arg1.aClass3_Sub14_Sub2_2.method6377(), arg1.aClass3_Sub14_Sub2_2.method6383(), arg1.aClass3_Sub14_Sub2_2.method6367());
				} else {
					arg1.aClass3_Sub14_Sub2_2 = Static606.method6355(arg1.aClass3_Sub6_Sub1_2, arg1.aClass3_Sub14_Sub2_2.method6377(), 0, arg1.aClass3_Sub14_Sub2_2.method6367());
					this.aClass3_Sub14_Sub4_2.method7828(arg1.aClass3_Sub15_1.aShortArray59[arg1.anInt4463] < 0, arg1);
				}
				if (arg1.aClass3_Sub15_1.aShortArray59[arg1.anInt4463] < 0) {
					arg1.aClass3_Sub14_Sub2_2.method6369(-1);
				}
				arg0 = arg1.anInt4462 / local26;
			}
		}
		arg1.aClass3_Sub14_Sub2_2.method7821(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Lclient!ega;")
	@Override
	public Class3_Sub14 method7819() {
		@Pc(9) Class3_Sub23 local9;
		do {
			local9 = (Class3_Sub23) this.aClass183_50.method4793();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub14_Sub2_2 == null);
		return local9.aClass3_Sub14_Sub2_2;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Lclient!ega;")
	@Override
	public Class3_Sub14 method7822() {
		@Pc(9) Class3_Sub23 local9 = (Class3_Sub23) this.aClass183_50.method4795();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub14_Sub2_2 == null) {
			return this.method7819();
		} else {
			return local9.aClass3_Sub14_Sub2_2;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	@Override
	public int method7820() {
		return 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method7821(@OriginalArg(0) int arg0) {
		this.aClass3_Sub14_Sub1_1.method7821(arg0);
		for (@Pc(15) Class3_Sub23 local15 = (Class3_Sub23) this.aClass183_50.method4795(); local15 != null; local15 = (Class3_Sub23) this.aClass183_50.method4793()) {
			if (!this.aClass3_Sub14_Sub4_2.method7844(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4449) {
						this.method6721(local25, local15);
						local15.anInt4449 -= local25;
						break;
					}
					this.method6721(local15.anInt4449, local15);
					local25 -= local15.anInt4449;
				} while (!this.aClass3_Sub14_Sub4_2.method7825(0, local15, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)V")
	@Override
	public void method7823(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub14_Sub1_1.method7823(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass183_50.method4795(); local17 != null; local17 = (Class3_Sub23) this.aClass183_50.method4793()) {
			if (!this.aClass3_Sub14_Sub4_2.method7844(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt4449 >= local29) {
						this.method6723(local29 + local27, local17, local29, arg0, local27);
						local17.anInt4449 -= local29;
						break;
					}
					this.method6723(local29 + local27, local17, local17.anInt4449, arg0, local27);
					local29 -= local17.anInt4449;
					local27 += local17.anInt4449;
				} while (!this.aClass3_Sub14_Sub4_2.method7825(local27, local17, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!iga;I[III)V")
	private void method6723(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass3_Sub14_Sub4_2.anIntArray642[arg1.anInt4454] & 0x4) != 0 && arg1.anInt4460 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub14_Sub4_2.anIntArray629[arg1.anInt4454] / Static149.anInt2863;
			while (true) {
				@Pc(38) int local38 = (local29 + 1048575 - arg1.anInt4462) / local29;
				if (local38 > arg2) {
					arg1.anInt4462 += arg2 * local29;
					break;
				}
				arg1.aClass3_Sub14_Sub2_2.method7823(arg3, arg4, local38);
				arg1.anInt4462 += local29 * local38 - 1048576;
				arg4 += local38;
				arg2 -= local38;
				@Pc(69) int local69 = Static149.anInt2863 / 100;
				@Pc(73) int local73 = 262144 / local29;
				if (local73 < local69) {
					local69 = local73;
				}
				@Pc(81) Class3_Sub14_Sub2 local81 = arg1.aClass3_Sub14_Sub2_2;
				if (this.aClass3_Sub14_Sub4_2.anIntArray628[arg1.anInt4454] == 0) {
					arg1.aClass3_Sub14_Sub2_2 = Static606.method6355(arg1.aClass3_Sub6_Sub1_2, local81.method6377(), local81.method6383(), local81.method6367());
				} else {
					arg1.aClass3_Sub14_Sub2_2 = Static606.method6355(arg1.aClass3_Sub6_Sub1_2, local81.method6377(), 0, local81.method6367());
					this.aClass3_Sub14_Sub4_2.method7828(arg1.aClass3_Sub15_1.aShortArray59[arg1.anInt4463] < 0, arg1);
					arg1.aClass3_Sub14_Sub2_2.method6356(local69, local81.method6383());
				}
				if (arg1.aClass3_Sub15_1.aShortArray59[arg1.anInt4463] < 0) {
					arg1.aClass3_Sub14_Sub2_2.method6369(-1);
				}
				local81.method6381(local69);
				local81.method7823(arg3, arg4, arg0 - arg4);
				if (local81.method6375()) {
					this.aClass3_Sub14_Sub1_1.method2820(local81);
				}
			}
		}
		arg1.aClass3_Sub14_Sub2_2.method7823(arg3, arg4, arg2);
	}
}
