import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!q", name = "I", descriptor = "Lclient!gda;")
	public static Class126 aClass126_218;

	@OriginalMember(owner = "client!q", name = "S", descriptor = "Lclient!gda;")
	public static Class126 aClass126_219;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_150 = new Class156(21, 0);

	@OriginalMember(owner = "client!q", name = "N", descriptor = "[S")
	public static short[] aShortArray115 = new short[256];

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
	public static int anInt7669 = 0;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)Z")
	public static boolean method6667(@OriginalArg(0) int arg0) {
		return Static310.anInt5335 == 0 ? Static445.aClass5_Sub4_Sub2_6.method1822() : true;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)Lclient!caa;")
	public static Class4_Sub3 method6669() {
		@Pc(15) Class4_Sub3 local15 = (Class4_Sub3) Static485.aClass387_11.method9013();
		if (local15 == null) {
			return new Class4_Sub3();
		} else {
			Static99.anInt1643--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = arg4; local14 <= arg3; local14++) {
			for (@Pc(20) int local20 = arg2; local20 <= arg1; local20++) {
				if (arg0 == Static109.anIntArrayArray62[local14][local20] && Static615.anIntArrayArray58[local14][local20] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIZ)V")
	public static void method6672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static644.method8892();
		Static683.aLong313 = 0L;
		@Pc(15) int local15 = Static260.method4249();
		if (arg0 == 3 || local15 == 3) {
			arg3 = true;
		}
		if (!Static273.aClass100_6.method8655()) {
			arg3 = true;
		}
		Static337.method5065(arg3, local15, arg1, arg2, arg0);
	}
}
