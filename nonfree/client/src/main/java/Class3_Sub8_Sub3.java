import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub8_Sub3 extends Class3_Sub8 {

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!kr;")
	public final Class138 aClass138_14 = new Class138();

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!fj;")
	public final Class3_Sub8_Sub2 aClass3_Sub8_Sub2_3 = new Class3_Sub8_Sub2();

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!hi;")
	private final Class3_Sub8_Sub4 aClass3_Sub8_Sub4_2;

	static {
		new Class57("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!hi;)V")
	public Class3_Sub8_Sub3(@OriginalArg(0) Class3_Sub8_Sub4 arg0) {
		this.aClass3_Sub8_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!ep;)V")
	private void method1828(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub13 arg1) {
		if ((this.aClass3_Sub8_Sub4_2.anIntArray265[arg1.anInt1847] & 0x4) != 0 && arg1.anInt1836 < 0) {
			@Pc(27) int local27 = this.aClass3_Sub8_Sub4_2.anIntArray264[arg1.anInt1847] / Static374.anInt6244;
			@Pc(38) int local38 = (local27 + 1048575 - arg1.anInt1846) / local27;
			arg1.anInt1846 = arg1.anInt1846 + arg0 * local27 & 0xFFFFF;
			if (local38 <= arg0) {
				if (this.aClass3_Sub8_Sub4_2.anIntArray261[arg1.anInt1847] == 0) {
					arg1.aClass3_Sub8_Sub1_3 = Static396.method1258(arg1.aClass3_Sub29_Sub1_1, arg1.aClass3_Sub8_Sub1_3.method1246(), arg1.aClass3_Sub8_Sub1_3.method1263(), arg1.aClass3_Sub8_Sub1_3.method1275());
				} else {
					arg1.aClass3_Sub8_Sub1_3 = Static396.method1258(arg1.aClass3_Sub29_Sub1_1, arg1.aClass3_Sub8_Sub1_3.method1246(), 0, arg1.aClass3_Sub8_Sub1_3.method1275());
					this.aClass3_Sub8_Sub4_2.method2138(arg1.aClass3_Sub37_1.aShortArray82[arg1.anInt1835] < 0, arg1);
				}
				if (arg1.aClass3_Sub37_1.aShortArray82[arg1.anInt1835] < 0) {
					arg1.aClass3_Sub8_Sub1_3.method1248(-1);
				}
				arg0 = arg1.anInt1846 / local27;
			}
		}
		arg1.aClass3_Sub8_Sub1_3.method2131(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	@Override
	public void method2131(@OriginalArg(0) int arg0) {
		this.aClass3_Sub8_Sub2_3.method2131(arg0);
		for (@Pc(15) Class3_Sub13 local15 = (Class3_Sub13) this.aClass138_14.method3051(); local15 != null; local15 = (Class3_Sub13) this.aClass138_14.method3050()) {
			if (!this.aClass3_Sub8_Sub4_2.method2168(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1839 >= local25) {
						this.method1828(local25, local15);
						local15.anInt1839 -= local25;
						break;
					}
					this.method1828(local15.anInt1839, local15);
					local25 -= local15.anInt1839;
				} while (!this.aClass3_Sub8_Sub4_2.method2155(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[IIIILclient!ep;)V")
	private void method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub13 arg4) {
		if ((this.aClass3_Sub8_Sub4_2.anIntArray265[arg4.anInt1847] & 0x4) != 0 && arg4.anInt1836 < 0) {
			@Pc(25) int local25 = this.aClass3_Sub8_Sub4_2.anIntArray264[arg4.anInt1847] / Static374.anInt6244;
			while (true) {
				@Pc(36) int local36 = (local25 + 1048575 - arg4.anInt1846) / local25;
				if (arg2 < local36) {
					arg4.anInt1846 += arg2 * local25;
					break;
				}
				arg4.aClass3_Sub8_Sub1_3.method2129(arg1, arg3, local36);
				arg2 -= local36;
				arg4.anInt1846 += local25 * local36 - 1048576;
				arg3 += local36;
				@Pc(67) int local67 = Static374.anInt6244 / 100;
				@Pc(71) int local71 = 262144 / local25;
				if (local71 < local67) {
					local67 = local71;
				}
				@Pc(83) Class3_Sub8_Sub1 local83 = arg4.aClass3_Sub8_Sub1_3;
				if (this.aClass3_Sub8_Sub4_2.anIntArray261[arg4.anInt1847] == 0) {
					arg4.aClass3_Sub8_Sub1_3 = Static396.method1258(arg4.aClass3_Sub29_Sub1_1, local83.method1246(), local83.method1263(), local83.method1275());
				} else {
					arg4.aClass3_Sub8_Sub1_3 = Static396.method1258(arg4.aClass3_Sub29_Sub1_1, local83.method1246(), 0, local83.method1275());
					this.aClass3_Sub8_Sub4_2.method2138(arg4.aClass3_Sub37_1.aShortArray82[arg4.anInt1835] < 0, arg4);
					arg4.aClass3_Sub8_Sub1_3.method1267(local67, local83.method1263());
				}
				if (arg4.aClass3_Sub37_1.aShortArray82[arg4.anInt1835] < 0) {
					arg4.aClass3_Sub8_Sub1_3.method1248(-1);
				}
				local83.method1253(local67);
				local83.method2129(arg1, arg3, arg0 - arg3);
				if (local83.method1264()) {
					this.aClass3_Sub8_Sub2_3.method1710(local83);
				}
			}
		}
		arg4.aClass3_Sub8_Sub1_3.method2129(arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
	@Override
	public int method2125() {
		return 0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "([III)V")
	@Override
	public void method2129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub8_Sub2_3.method2129(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub13 local17 = (Class3_Sub13) this.aClass138_14.method3051(); local17 != null; local17 = (Class3_Sub13) this.aClass138_14.method3050()) {
			if (!this.aClass3_Sub8_Sub4_2.method2168(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1839) {
						this.method1831(local29 + local27, arg0, local27, local29, local17);
						local17.anInt1839 -= local27;
						break;
					}
					this.method1831(local27 + local29, arg0, local17.anInt1839, local29, local17);
					local27 -= local17.anInt1839;
					local29 += local17.anInt1839;
				} while (!this.aClass3_Sub8_Sub4_2.method2155(local27, local17, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()Lclient!me;")
	@Override
	public Class3_Sub8 method2126() {
		@Pc(9) Class3_Sub13 local9;
		do {
			local9 = (Class3_Sub13) this.aClass138_14.method3050();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub8_Sub1_3 == null);
		return local9.aClass3_Sub8_Sub1_3;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "()Lclient!me;")
	@Override
	public Class3_Sub8 method2128() {
		@Pc(9) Class3_Sub13 local9 = (Class3_Sub13) this.aClass138_14.method3051();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub8_Sub1_3 == null) {
			return this.method2126();
		} else {
			return local9.aClass3_Sub8_Sub1_3;
		}
	}
}
