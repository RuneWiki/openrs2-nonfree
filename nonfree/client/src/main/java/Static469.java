import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "[I")
	public static int[] anIntArray550;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Z")
	public static boolean aBoolean496;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_1 = new Class278(0, 3, Static259.aClass167_11);

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_2 = new Class278(1, 3, Static259.aClass167_11);

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_3 = new Class278(2, 4, Static259.aClass167_7);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_4 = new Class278(3, 1, Static259.aClass167_11);

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_5 = new Class278(4, 2, Static259.aClass167_11);

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_6 = new Class278(5, 3, Static259.aClass167_11);

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!ok;")
	public static final Class278 aClass278_7 = new Class278(6, 4, Static259.aClass167_11);

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public static final int anInt7374 = Static462.method6277(16);

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public static int anInt7375 = 0;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "[Lclient!m;")
	public static final Class240[] aClass240Array1 = new Class240[6];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!ok;")
	public static Class278 method6369(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass278_1;
		} else if (arg0 == 1) {
			return aClass278_2;
		} else if (arg0 == 2) {
			return aClass278_3;
		} else if (arg0 == 3) {
			return aClass278_4;
		} else if (arg0 == 4) {
			return aClass278_5;
		} else if (arg0 == 5) {
			return aClass278_6;
		} else if (arg0 == 6) {
			return aClass278_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!kt;)V")
	public static void method6371(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
			@Pc(37) Class9_Sub1_Sub1_Sub2_Sub2 local37 = (Class9_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local37.aClass219_1 == null) {
				return;
			}
			Static694.method9183(local37.aByte139 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139, local37);
		} else if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
			@Pc(21) Class9_Sub1_Sub1_Sub2_Sub1 local21 = (Class9_Sub1_Sub1_Sub2_Sub1) arg0;
			Static208.method3142(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != local21.aByte139, local21);
			return;
		}
	}
}
