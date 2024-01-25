import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array13;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Z")
	public static boolean aBoolean313;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
	public static int anInt4162 = 0;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public static int anInt4163 = 0;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_87 = new Class180(33, 0);

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	public static int anInt4171 = 0;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
	public static final int[] anIntArray375 = new int[3];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ha;Lclient!or;Z)V")
	public static void method3795(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class260 arg1) {
		@Pc(35) boolean local35 = Static170.aClass370_1.method8907(arg1.anInt6955, arg1.anInt6938, arg1.aBoolean498 ? Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 : null, arg1.anInt6936 | 0xFF000000, arg1.anInt6996, arg0, arg1.anInt6964) == null;
		if (local35) {
			Static395.aClass338_155.method8171(new Class3_Sub44(arg1.anInt6964, arg1.anInt6996, arg1.anInt6938, arg1.anInt6936 | 0xFF000000, arg1.anInt6955, arg1.aBoolean498));
			Static456.method8151(arg1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public static void method3796() {
		Static208.aClass165_26.method4403();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IC)Z")
	public static boolean method3798(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static460.method6705(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static129.aCharArray1;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static534.aCharArray8;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (arg0 == local59) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method3799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg1) {
			Static676.method9368(arg1, arg4, arg0, arg2);
		} else if (arg2 - arg1 >= Static7.anInt93 && arg1 + arg2 <= Static115.anInt2377 && Static374.anInt5986 <= arg0 - arg3 && arg3 + arg0 <= Static84.anInt1667) {
			Static107.method2052(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static462.method6722(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	public static void method3800() {
		Static300.aClass165_35.method4400();
		Static649.aClass165_78.method4400();
		Static45.aClass165_10.method4400();
		Static376.aClass165_41.method4400();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3801(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		if (local11 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local11 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local11 || Static90.method8848(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local11 <= local25 - 1 || Static90.method8848(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(71) byte[] local71 = new byte[local31];
		Static13.method190(arg0, local71, 0);
		return local71;
	}
}
