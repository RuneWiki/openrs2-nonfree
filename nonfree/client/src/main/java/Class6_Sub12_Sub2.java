import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class6_Sub12_Sub2 extends Class6_Sub12 {

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "Lclient!vq;")
	public final Class211 aClass211_21 = new Class211();

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "Lclient!sd;")
	public final Class6_Sub12_Sub3 aClass6_Sub12_Sub3_4 = new Class6_Sub12_Sub3();

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "Lclient!fh;")
	private final Class6_Sub12_Sub1 aClass6_Sub12_Sub1_2;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class6_Sub12_Sub2(@OriginalArg(0) Class6_Sub12_Sub1 arg0) {
		this.aClass6_Sub12_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "()I")
	@Override
	public int method5656() {
		return 0;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "()Lclient!wm;")
	@Override
	public Class6_Sub12 method5655() {
		@Pc(9) Class6_Sub9 local9;
		do {
			local9 = (Class6_Sub9) this.aClass211_21.method5582();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub12_Sub4_1 == null);
		return local9.aClass6_Sub12_Sub4_1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "()Lclient!wm;")
	@Override
	public Class6_Sub12 method5652() {
		@Pc(9) Class6_Sub9 local9 = (Class6_Sub9) this.aClass211_21.method5594();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub12_Sub4_1 == null) {
			return this.method5655();
		} else {
			return local9.aClass6_Sub12_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "([III)V")
	@Override
	public void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub12_Sub3_4.method5657(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub9 local17 = (Class6_Sub9) this.aClass211_21.method5594(); local17 != null; local17 = (Class6_Sub9) this.aClass211_21.method5582()) {
			if (!this.aClass6_Sub12_Sub1_2.method1450(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1235) {
						this.method2457(arg0, local27, local29 + local27, local17, local29);
						local17.anInt1235 -= local27;
						break;
					}
					this.method2457(arg0, local17.anInt1235, local29 + local27, local17, local29);
					local29 += local17.anInt1235;
					local27 -= local17.anInt1235;
				} while (!this.aClass6_Sub12_Sub1_2.method1442(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([IBIILclient!ea;I)V")
	private void method2457(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub9 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub12_Sub1_2.anIntArray186[arg3.anInt1233] & 0x4) != 0 && arg3.anInt1230 < 0) {
			@Pc(26) int local26 = this.aClass6_Sub12_Sub1_2.anIntArray185[arg3.anInt1233] / Static22.anInt358;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg3.anInt1225) / local26;
				if (local36 > arg1) {
					arg3.anInt1225 += arg1 * local26;
					break;
				}
				arg3.aClass6_Sub12_Sub4_1.method5657(arg0, arg4, local36);
				arg1 -= local36;
				arg4 += local36;
				arg3.anInt1225 += local26 * local36 - 1048576;
				@Pc(67) int local67 = Static22.anInt358 / 100;
				@Pc(71) int local71 = 262144 / local26;
				if (local71 < local67) {
					local67 = local71;
				}
				@Pc(79) Class6_Sub12_Sub4 local79 = arg3.aClass6_Sub12_Sub4_1;
				if (this.aClass6_Sub12_Sub1_2.anIntArray176[arg3.anInt1233] == 0) {
					arg3.aClass6_Sub12_Sub4_1 = Static369.method5661(arg3.aClass6_Sub11_Sub1_1, local79.method5680(), local79.method5673(), local79.method5663());
				} else {
					arg3.aClass6_Sub12_Sub4_1 = Static369.method5661(arg3.aClass6_Sub11_Sub1_1, local79.method5680(), 0, local79.method5663());
					this.aClass6_Sub12_Sub1_2.method1453(arg3, arg3.aClass6_Sub26_1.aShortArray69[arg3.anInt1231] < 0);
					arg3.aClass6_Sub12_Sub4_1.method5664(local67, local79.method5673());
				}
				if (arg3.aClass6_Sub26_1.aShortArray69[arg3.anInt1231] < 0) {
					arg3.aClass6_Sub12_Sub4_1.method5675(-1);
				}
				local79.method5695(local67);
				local79.method5657(arg0, arg4, arg2 - arg4);
				if (local79.method5672()) {
					this.aClass6_Sub12_Sub3_4.method4904(local79);
				}
			}
		}
		arg3.aClass6_Sub12_Sub4_1.method5657(arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	@Override
	public void method5654(@OriginalArg(0) int arg0) {
		this.aClass6_Sub12_Sub3_4.method5654(arg0);
		for (@Pc(15) Class6_Sub9 local15 = (Class6_Sub9) this.aClass211_21.method5594(); local15 != null; local15 = (Class6_Sub9) this.aClass211_21.method5582()) {
			if (!this.aClass6_Sub12_Sub1_2.method1450(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1235 >= local25) {
						this.method2463(local15, local25);
						local15.anInt1235 -= local25;
						break;
					}
					this.method2463(local15, local15.anInt1235);
					local25 -= local15.anInt1235;
				} while (!this.aClass6_Sub12_Sub1_2.method1442(null, 0, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ea;IZ)V")
	private void method2463(@OriginalArg(0) Class6_Sub9 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass6_Sub12_Sub1_2.anIntArray186[arg0.anInt1233] & 0x4) != 0 && arg0.anInt1230 < 0) {
			@Pc(24) int local24 = this.aClass6_Sub12_Sub1_2.anIntArray185[arg0.anInt1233] / Static22.anInt358;
			@Pc(34) int local34 = (local24 + 1048575 - arg0.anInt1225) / local24;
			arg0.anInt1225 = arg0.anInt1225 + local24 * arg1 & 0xFFFFF;
			if (local34 <= arg1) {
				if (this.aClass6_Sub12_Sub1_2.anIntArray176[arg0.anInt1233] == 0) {
					arg0.aClass6_Sub12_Sub4_1 = Static369.method5661(arg0.aClass6_Sub11_Sub1_1, arg0.aClass6_Sub12_Sub4_1.method5680(), arg0.aClass6_Sub12_Sub4_1.method5673(), arg0.aClass6_Sub12_Sub4_1.method5663());
				} else {
					arg0.aClass6_Sub12_Sub4_1 = Static369.method5661(arg0.aClass6_Sub11_Sub1_1, arg0.aClass6_Sub12_Sub4_1.method5680(), 0, arg0.aClass6_Sub12_Sub4_1.method5663());
					this.aClass6_Sub12_Sub1_2.method1453(arg0, arg0.aClass6_Sub26_1.aShortArray69[arg0.anInt1231] < 0);
				}
				if (arg0.aClass6_Sub26_1.aShortArray69[arg0.anInt1231] < 0) {
					arg0.aClass6_Sub12_Sub4_1.method5675(-1);
				}
				arg1 = arg0.anInt1225 / local24;
			}
		}
		arg0.aClass6_Sub12_Sub4_1.method5654(arg1);
	}
}
