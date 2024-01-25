import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class7_Sub8_Sub1 extends Class7_Sub8 {

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "Lclient!fi;")
	public final Class74 aClass74_6 = new Class74();

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "Lclient!np;")
	public final Class7_Sub8_Sub3 aClass7_Sub8_Sub3_1 = new Class7_Sub8_Sub3();

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Lclient!ka;")
	private final Class7_Sub8_Sub2 aClass7_Sub8_Sub2_1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class7_Sub8_Sub1(@OriginalArg(0) Class7_Sub8_Sub2 arg0) {
		this.aClass7_Sub8_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public Class7_Sub8 method4930() {
		@Pc(9) Class7_Sub41 local9;
		do {
			local9 = (Class7_Sub41) this.aClass74_6.method1798();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass7_Sub8_Sub4_3 == null);
		return local9.aClass7_Sub8_Sub4_3;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!w;[IIIII)V")
	private void method1482(@OriginalArg(0) Class7_Sub41 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass7_Sub8_Sub2_1.anIntArray457[arg0.anInt6516] & 0x4) != 0 && arg0.anInt6505 < 0) {
			@Pc(26) int local26 = this.aClass7_Sub8_Sub2_1.anIntArray448[arg0.anInt6516] / Static172.anInt2667;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg0.anInt6512) / local26;
				if (local36 > arg3) {
					arg0.anInt6512 += arg3 * local26;
					break;
				}
				arg0.aClass7_Sub8_Sub4_3.method4934(arg1, arg4, local36);
				arg0.anInt6512 += local36 * local26 - 1048576;
				arg4 += local36;
				arg3 -= local36;
				@Pc(67) int local67 = Static172.anInt2667 / 100;
				@Pc(71) int local71 = 262144 / local26;
				if (local71 < local67) {
					local67 = local71;
				}
				@Pc(83) Class7_Sub8_Sub4 local83 = arg0.aClass7_Sub8_Sub4_3;
				if (this.aClass7_Sub8_Sub2_1.anIntArray450[arg0.anInt6516] == 0) {
					arg0.aClass7_Sub8_Sub4_3 = Static367.method4960(arg0.aClass7_Sub20_Sub1_1, local83.method4964(), local83.method4971(), local83.method4944());
				} else {
					arg0.aClass7_Sub8_Sub4_3 = Static367.method4960(arg0.aClass7_Sub20_Sub1_1, local83.method4964(), 0, local83.method4944());
					this.aClass7_Sub8_Sub2_1.method3106(arg0.aClass7_Sub31_1.aShortArray106[arg0.anInt6519] < 0, arg0);
					arg0.aClass7_Sub8_Sub4_3.method4972(local67, local83.method4971());
				}
				if (arg0.aClass7_Sub31_1.aShortArray106[arg0.anInt6519] < 0) {
					arg0.aClass7_Sub8_Sub4_3.method4947(-1);
				}
				local83.method4973(local67);
				local83.method4934(arg1, arg4, arg2 - arg4);
				if (local83.method4963()) {
					this.aClass7_Sub8_Sub3_1.method3895(local83);
				}
			}
		}
		arg0.aClass7_Sub8_Sub4_3.method4934(arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class7_Sub8 method4932() {
		@Pc(9) Class7_Sub41 local9 = (Class7_Sub41) this.aClass74_6.method1793();
		if (local9 == null) {
			return null;
		} else if (local9.aClass7_Sub8_Sub4_3 == null) {
			return this.method4930();
		} else {
			return local9.aClass7_Sub8_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!w;B)V")
	private void method1486(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub41 arg1) {
		if ((this.aClass7_Sub8_Sub2_1.anIntArray457[arg1.anInt6516] & 0x4) != 0 && arg1.anInt6505 < 0) {
			@Pc(23) int local23 = this.aClass7_Sub8_Sub2_1.anIntArray448[arg1.anInt6516] / Static172.anInt2667;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt6512) / local23;
			arg1.anInt6512 = local23 * arg0 + arg1.anInt6512 & 0xFFFFF;
			if (arg0 >= local33) {
				if (this.aClass7_Sub8_Sub2_1.anIntArray450[arg1.anInt6516] == 0) {
					arg1.aClass7_Sub8_Sub4_3 = Static367.method4960(arg1.aClass7_Sub20_Sub1_1, arg1.aClass7_Sub8_Sub4_3.method4964(), arg1.aClass7_Sub8_Sub4_3.method4971(), arg1.aClass7_Sub8_Sub4_3.method4944());
				} else {
					arg1.aClass7_Sub8_Sub4_3 = Static367.method4960(arg1.aClass7_Sub20_Sub1_1, arg1.aClass7_Sub8_Sub4_3.method4964(), 0, arg1.aClass7_Sub8_Sub4_3.method4944());
					this.aClass7_Sub8_Sub2_1.method3106(arg1.aClass7_Sub31_1.aShortArray106[arg1.anInt6519] < 0, arg1);
				}
				if (arg1.aClass7_Sub31_1.aShortArray106[arg1.anInt6519] < 0) {
					arg1.aClass7_Sub8_Sub4_3.method4947(-1);
				}
				arg0 = arg1.anInt6512 / local23;
			}
		}
		arg1.aClass7_Sub8_Sub4_3.method4936(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	@Override
	public void method4936(@OriginalArg(0) int arg0) {
		this.aClass7_Sub8_Sub3_1.method4936(arg0);
		for (@Pc(15) Class7_Sub41 local15 = (Class7_Sub41) this.aClass74_6.method1793(); local15 != null; local15 = (Class7_Sub41) this.aClass74_6.method1798()) {
			if (!this.aClass7_Sub8_Sub2_1.method3107(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt6518 >= local25) {
						this.method1486(local25, local15);
						local15.anInt6518 -= local25;
						break;
					}
					this.method1486(local15.anInt6518, local15);
					local25 -= local15.anInt6518;
				} while (!this.aClass7_Sub8_Sub2_1.method3095(local25, 0, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "()I")
	@Override
	public int method4935() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "([III)V")
	@Override
	public void method4934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub8_Sub3_1.method4934(arg0, arg1, arg2);
		for (@Pc(17) Class7_Sub41 local17 = (Class7_Sub41) this.aClass74_6.method1793(); local17 != null; local17 = (Class7_Sub41) this.aClass74_6.method1798()) {
			if (!this.aClass7_Sub8_Sub2_1.method3107(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt6518) {
						this.method1482(local17, arg0, local29 + local27, local29, local27);
						local17.anInt6518 -= local29;
						break;
					}
					this.method1482(local17, arg0, local29 + local27, local17.anInt6518, local27);
					local29 -= local17.anInt6518;
					local27 += local17.anInt6518;
				} while (!this.aClass7_Sub8_Sub2_1.method3095(local29, local27, local17, arg0));
			}
		}
	}
}
