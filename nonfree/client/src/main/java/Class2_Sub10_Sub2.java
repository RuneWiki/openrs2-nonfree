import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "Lclient!vb;")
	public final Class84 aClass84_9 = new Class84();

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "Lclient!vg;")
	public final Class2_Sub10_Sub4 aClass2_Sub10_Sub4_7 = new Class2_Sub10_Sub4();

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "Lclient!ph;")
	private final Class2_Sub10_Sub3 aClass2_Sub10_Sub3_2;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ph;)V")
	public Class2_Sub10_Sub2(@OriginalArg(0) Class2_Sub10_Sub3 arg0) {
		this.aClass2_Sub10_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public Class2_Sub10 method2737() {
		@Pc(9) Class2_Sub7 local9 = (Class2_Sub7) this.aClass84_9.method2694();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub10_Sub1_1 == null) {
			return this.method2738();
		} else {
			return local9.aClass2_Sub10_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	@Override
	public void method2741(@OriginalArg(0) int arg0) {
		this.aClass2_Sub10_Sub4_7.method2741(arg0);
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) this.aClass84_9.method2694(); local15 != null; local15 = (Class2_Sub7) this.aClass84_9.method2697()) {
			if (!this.aClass2_Sub10_Sub3_2.method2002(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt401) {
						this.method1905(local15, local25);
						local15.anInt401 -= local25;
						break;
					}
					this.method1905(local15, local15.anInt401);
					local25 -= local15.anInt401;
				} while (!this.aClass2_Sub10_Sub3_2.method2005(local15, 0, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!bh;III[II)V")
	private void method1903(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub10_Sub3_2.anIntArray268[arg0.anInt400] & 0x4) != 0 && arg0.anInt413 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub10_Sub3_2.anIntArray266[arg0.anInt400] / Static50.anInt1375;
			while (true) {
				@Pc(43) int local43 = (local34 + 1048575 - arg0.anInt417) / local34;
				if (arg4 < local43) {
					arg0.anInt417 += arg4 * local34;
					break;
				}
				arg4 -= local43;
				arg0.aClass2_Sub10_Sub1_1.method2742(arg3, arg1, local43);
				@Pc(64) int local64 = Static50.anInt1375 / 100;
				@Pc(68) int local68 = 262144 / local34;
				arg0.anInt417 += local43 * local34 - 1048576;
				arg1 += local43;
				if (local64 > local68) {
					local64 = local68;
				}
				@Pc(90) Class2_Sub10_Sub1 local90 = arg0.aClass2_Sub10_Sub1_1;
				if (this.aClass2_Sub10_Sub3_2.anIntArray262[arg0.anInt400] == 0) {
					arg0.aClass2_Sub10_Sub1_1 = Static186.method809(arg0.aClass2_Sub19_Sub1_1, local90.method782(), local90.method811(), local90.method798());
				} else {
					arg0.aClass2_Sub10_Sub1_1 = Static186.method809(arg0.aClass2_Sub19_Sub1_1, local90.method782(), 0, local90.method798());
					this.aClass2_Sub10_Sub3_2.method2004(arg0.aClass2_Sub15_1.aShortArray15[arg0.anInt407] < 0, arg0);
					arg0.aClass2_Sub10_Sub1_1.method779(local64, local90.method811());
				}
				if (arg0.aClass2_Sub15_1.aShortArray15[arg0.anInt407] < 0) {
					arg0.aClass2_Sub10_Sub1_1.method775(-1);
				}
				local90.method800(local64);
				local90.method2742(arg3, arg1, arg2 - arg1);
				if (local90.method777()) {
					this.aClass2_Sub10_Sub4_7.method2745(local90);
				}
			}
		}
		arg0.aClass2_Sub10_Sub1_1.method2742(arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()Lclient!tf;")
	@Override
	public Class2_Sub10 method2738() {
		@Pc(9) Class2_Sub7 local9;
		do {
			local9 = (Class2_Sub7) this.aClass84_9.method2697();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub10_Sub1_1 == null);
		return local9.aClass2_Sub10_Sub1_1;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "([III)V")
	@Override
	public void method2742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub10_Sub4_7.method2742(arg0, arg1, arg2);
		for (@Pc(13) Class2_Sub7 local13 = (Class2_Sub7) this.aClass84_9.method2694(); local13 != null; local13 = (Class2_Sub7) this.aClass84_9.method2697()) {
			if (!this.aClass2_Sub10_Sub3_2.method2002(local13)) {
				@Pc(23) int local23 = arg2;
				@Pc(25) int local25 = arg1;
				do {
					if (local13.anInt401 >= local23) {
						this.method1903(local13, local25, local25 + local23, arg0, local23);
						local13.anInt401 -= local23;
						break;
					}
					this.method1903(local13, local25, local25 + local23, arg0, local13.anInt401);
					local25 += local13.anInt401;
					local23 -= local13.anInt401;
				} while (!this.aClass2_Sub10_Sub3_2.method2005(local13, local25, arg0, local23));
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "()I")
	@Override
	public int method2743() {
		return 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!bh;II)V")
	private void method1905(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub10_Sub3_2.anIntArray268[arg0.anInt400] & 0x4) != 0 && arg0.anInt413 < 0) {
			@Pc(36) int local36 = this.aClass2_Sub10_Sub3_2.anIntArray266[arg0.anInt400] / Static50.anInt1375;
			@Pc(46) int local46 = (local36 + 1048575 - arg0.anInt417) / local36;
			arg0.anInt417 = local36 * arg1 + arg0.anInt417 & 0xFFFFF;
			if (local46 <= arg1) {
				if (this.aClass2_Sub10_Sub3_2.anIntArray262[arg0.anInt400] == 0) {
					arg0.aClass2_Sub10_Sub1_1 = Static186.method809(arg0.aClass2_Sub19_Sub1_1, arg0.aClass2_Sub10_Sub1_1.method782(), arg0.aClass2_Sub10_Sub1_1.method811(), arg0.aClass2_Sub10_Sub1_1.method798());
				} else {
					arg0.aClass2_Sub10_Sub1_1 = Static186.method809(arg0.aClass2_Sub19_Sub1_1, arg0.aClass2_Sub10_Sub1_1.method782(), 0, arg0.aClass2_Sub10_Sub1_1.method798());
					this.aClass2_Sub10_Sub3_2.method2004(arg0.aClass2_Sub15_1.aShortArray15[arg0.anInt407] < 0, arg0);
				}
				if (arg0.aClass2_Sub15_1.aShortArray15[arg0.anInt407] < 0) {
					arg0.aClass2_Sub10_Sub1_1.method775(-1);
				}
				arg1 = arg0.anInt417 / local36;
			}
		}
		arg0.aClass2_Sub10_Sub1_1.method2741(arg1);
	}
}
