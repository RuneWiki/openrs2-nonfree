import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
	public static boolean aBoolean82;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!nh;")
	public static Class62 aClass62_18;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!h;")
	public static Class4_Sub11 aClass4_Sub11_3;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	public static int anInt1849;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_705 = Static177.method3050("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!jd;")
	public static Class46 aClass46_704 = aClass46_705;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_706 = Static177.method3050("::qa_op_test");

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	public static int anInt1847 = 0;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_707 = Static177.method3050(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!jd;B)Z")
	public static boolean method1475(@OriginalArg(0) Class46 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static148.anInt3385; local19++) {
			if (arg0.method1683(Static23.aClass46Array4[local19])) {
				return true;
			}
		}
		return arg0.method1683(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!ac;)V")
	public static void method1476(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		arg0.aBoolean120 = false;
		@Pc(18) Class4_Sub1_Sub4 local18;
		if (arg0.anInt2809 != -1) {
			local18 = Static137.method2394(arg0.anInt2809);
			if (local18 == null || local18.anIntArray52 == null) {
				arg0.anInt2809 = -1;
			} else {
				arg0.anInt2818++;
				if (local18.anIntArray52.length > arg0.anInt2814 && local18.anIntArray50[arg0.anInt2814] < arg0.anInt2818) {
					arg0.anInt2814++;
					arg0.anInt2818 = 1;
					Static186.method3139(local18, arg0.anInt2814, arg0 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1, arg0.anInt2803, arg0.anInt2832);
				}
				if (local18.anIntArray52.length <= arg0.anInt2814) {
					arg0.anInt2818 = 0;
					arg0.anInt2814 = 0;
					Static186.method3139(local18, arg0.anInt2814, arg0 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1, arg0.anInt2803, arg0.anInt2832);
				}
			}
		}
		if (arg0.anInt2825 != -1 && Static142.anInt3325 >= arg0.anInt2798) {
			if (arg0.anInt2827 < 0) {
				arg0.anInt2827 = 0;
			}
			@Pc(130) int local130 = Static93.method1816(arg0.anInt2825).anInt1398;
			if (local130 == -1) {
				arg0.anInt2825 = -1;
			} else {
				@Pc(137) Class4_Sub1_Sub4 local137 = Static137.method2394(local130);
				if (local137 == null || local137.anIntArray52 == null) {
					arg0.anInt2825 = -1;
				} else {
					arg0.anInt2788++;
					if (local137.anIntArray52.length > arg0.anInt2827 && arg0.anInt2788 > local137.anIntArray50[arg0.anInt2827]) {
						arg0.anInt2788 = 1;
						arg0.anInt2827++;
						Static186.method3139(local137, arg0.anInt2827, arg0 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1, arg0.anInt2803, arg0.anInt2832);
					}
					if (arg0.anInt2827 >= local137.anIntArray52.length) {
						arg0.anInt2825 = -1;
					}
				}
			}
		}
		if (arg0.anInt2808 != -1 && arg0.anInt2840 <= 1) {
			local18 = Static137.method2394(arg0.anInt2808);
			if (local18.anInt540 == 1 && arg0.anInt2836 > 0 && Static142.anInt3325 >= arg0.anInt2835 && arg0.anInt2821 < Static142.anInt3325) {
				arg0.anInt2840 = 1;
				return;
			}
		}
		if (arg0.anInt2808 != -1 && arg0.anInt2840 == 0) {
			local18 = Static137.method2394(arg0.anInt2808);
			if (local18 == null || local18.anIntArray52 == null) {
				arg0.anInt2808 = -1;
			} else {
				arg0.anInt2837++;
				if (arg0.anInt2844 < local18.anIntArray52.length && local18.anIntArray50[arg0.anInt2844] < arg0.anInt2837) {
					arg0.anInt2837 = 1;
					arg0.anInt2844++;
					Static186.method3139(local18, arg0.anInt2844, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt2803, arg0.anInt2832);
				}
				if (local18.anIntArray52.length <= arg0.anInt2844) {
					arg0.anInt2812++;
					arg0.anInt2844 -= local18.anInt547;
					if (local18.anInt545 <= arg0.anInt2812) {
						arg0.anInt2808 = -1;
					} else if (arg0.anInt2844 >= 0 && arg0.anInt2844 < local18.anIntArray52.length) {
						Static186.method3139(local18, arg0.anInt2844, arg0 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1, arg0.anInt2803, arg0.anInt2832);
					} else {
						arg0.anInt2808 = -1;
					}
				}
				arg0.aBoolean120 = local18.aBoolean26;
			}
		}
		if (arg0.anInt2840 > 0) {
			arg0.anInt2840--;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZ)I")
	public static int method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(44) int local44 = Static120.method2857(arg0 - 1, arg1 + -1) + Static120.method2857(arg0 - 1, arg1 + 1) + Static120.method2857(arg0 + 1, arg1 + -1) + Static120.method2857(arg0 + 1, arg1 - -1);
		@Pc(73) int local73 = Static120.method2857(arg0, arg1 - 1) + Static120.method2857(arg0, arg1 + 1) + Static120.method2857(arg0 - 1, arg1) + Static120.method2857(arg0 - -1, arg1);
		@Pc(78) int local78 = Static120.method2857(arg0, arg1);
		return local78 / 4 + local44 / 16 + local73 / 8;
	}
}
