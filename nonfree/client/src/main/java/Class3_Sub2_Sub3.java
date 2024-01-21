import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lclient!ad;")
	public final Class5 aClass5_10 = new Class5();

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "Lclient!fb;")
	public final Class3_Sub2_Sub2 aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2();

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!ud;")
	private final Class3_Sub2_Sub4 aClass3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class3_Sub2_Sub3(@OriginalArg(0) Class3_Sub2_Sub4 arg0) {
		this.aClass3_Sub2_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()I")
	@Override
	public int method2170() {
		return 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!f;III[I)V")
	private void method874(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass3_Sub2_Sub4_2.anIntArray360[arg1.anInt1038] & 0x4) != 0 && arg1.anInt1029 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub2_Sub4_2.anIntArray351[arg1.anInt1038] / Static68.anInt2134;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt1046) / local29;
				if (arg0 < local39) {
					arg1.anInt1046 += arg0 * local29;
					break;
				}
				arg0 -= local39;
				@Pc(54) int local54 = 262144 / local29;
				arg1.aClass3_Sub2_Sub1_3.method2164(arg4, arg3, local39);
				@Pc(63) Class3_Sub2_Sub1 local63 = arg1.aClass3_Sub2_Sub1_3;
				arg3 += local39;
				arg1.anInt1046 += local39 * local29 - 1048576;
				@Pc(81) int local81 = Static68.anInt2134 / 100;
				if (local81 > local54) {
					local81 = local54;
				}
				if (this.aClass3_Sub2_Sub4_2.anIntArray352[arg1.anInt1038] == 0) {
					arg1.aClass3_Sub2_Sub1_3 = Static131.method185(arg1.aClass3_Sub9_Sub1_1, local63.method184(), local63.method193(), local63.method167());
				} else {
					arg1.aClass3_Sub2_Sub1_3 = Static131.method185(arg1.aClass3_Sub9_Sub1_1, local63.method184(), 0, local63.method167());
					this.aClass3_Sub2_Sub4_2.method2198(arg1, arg1.aClass3_Sub11_1.aShortArray7[arg1.anInt1036] < 0);
					arg1.aClass3_Sub2_Sub1_3.method195(local81, local63.method193());
				}
				if (arg1.aClass3_Sub11_1.aShortArray7[arg1.anInt1036] < 0) {
					arg1.aClass3_Sub2_Sub1_3.method163(-1);
				}
				local63.method176(local81);
				local63.method2164(arg4, arg3, arg2 - arg3);
				if (local63.method181()) {
					this.aClass3_Sub2_Sub2_1.method716(local63);
				}
			}
		}
		arg1.aClass3_Sub2_Sub1_3.method2164(arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()Lclient!mc;")
	@Override
	public Class3_Sub2 method2167() {
		@Pc(9) Class3_Sub8 local9;
		do {
			local9 = (Class3_Sub8) this.aClass5_10.method90();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub2_Sub1_3 == null);
		return local9.aClass3_Sub2_Sub1_3;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
	@Override
	public void method2169(@OriginalArg(0) int arg0) {
		this.aClass3_Sub2_Sub2_1.method2169(arg0);
		for (@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) this.aClass5_10.method92(); local15 != null; local15 = (Class3_Sub8) this.aClass5_10.method90()) {
			if (!this.aClass3_Sub2_Sub4_2.method2195(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1039) {
						this.method876(local15, local25);
						local15.anInt1039 -= local25;
						break;
					}
					this.method876(local15, local15.anInt1039);
					local25 -= local15.anInt1039;
				} while (!this.aClass3_Sub2_Sub4_2.method2176(local25, null, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!f;II)V")
	private void method876(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass3_Sub2_Sub4_2.anIntArray360[arg0.anInt1038] & 0x4) != 0 && arg0.anInt1029 < 0) {
			@Pc(20) int local20 = this.aClass3_Sub2_Sub4_2.anIntArray351[arg0.anInt1038] / Static68.anInt2134;
			@Pc(30) int local30 = (local20 + 1048575 - arg0.anInt1046) / local20;
			arg0.anInt1046 = arg0.anInt1046 + local20 * arg1 & 0xFFFFF;
			if (arg1 >= local30) {
				if (this.aClass3_Sub2_Sub4_2.anIntArray352[arg0.anInt1038] == 0) {
					arg0.aClass3_Sub2_Sub1_3 = Static131.method185(arg0.aClass3_Sub9_Sub1_1, arg0.aClass3_Sub2_Sub1_3.method184(), arg0.aClass3_Sub2_Sub1_3.method193(), arg0.aClass3_Sub2_Sub1_3.method167());
				} else {
					arg0.aClass3_Sub2_Sub1_3 = Static131.method185(arg0.aClass3_Sub9_Sub1_1, arg0.aClass3_Sub2_Sub1_3.method184(), 0, arg0.aClass3_Sub2_Sub1_3.method167());
					this.aClass3_Sub2_Sub4_2.method2198(arg0, arg0.aClass3_Sub11_1.aShortArray7[arg0.anInt1036] < 0);
				}
				if (arg0.aClass3_Sub11_1.aShortArray7[arg0.anInt1036] < 0) {
					arg0.aClass3_Sub2_Sub1_3.method163(-1);
				}
				arg1 = arg0.anInt1046 / local20;
			}
		}
		arg0.aClass3_Sub2_Sub1_3.method2169(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()Lclient!mc;")
	@Override
	public Class3_Sub2 method2166() {
		@Pc(9) Class3_Sub8 local9 = (Class3_Sub8) this.aClass5_10.method92();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub2_Sub1_3 == null) {
			return this.method2167();
		} else {
			return local9.aClass3_Sub2_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V")
	@Override
	public void method2164(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub2_Sub2_1.method2164(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) this.aClass5_10.method92(); local17 != null; local17 = (Class3_Sub8) this.aClass5_10.method90()) {
			if (!this.aClass3_Sub2_Sub4_2.method2195(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt1039 >= local29) {
						this.method874(local29, local17, local27 + local29, local27, arg0);
						local17.anInt1039 -= local29;
						break;
					}
					this.method874(local17.anInt1039, local17, local29 + local27, local27, arg0);
					local27 += local17.anInt1039;
					local29 -= local17.anInt1039;
				} while (!this.aClass3_Sub2_Sub4_2.method2176(local29, arg0, local17, local27));
			}
		}
	}
}
