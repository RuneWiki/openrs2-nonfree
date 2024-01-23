import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[F")
	public static float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "Lclient!ul;")
	public static Class172 aClass172_10 = new Class172(64);

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "[S")
	public static short[] aShortArray21 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)I")
	public static int method987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method989() {
		Static46.aClass172_8.method4346();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)Lclient!wi;")
	public static Class186 method992(@OriginalArg(0) int arg0) {
		@Pc(6) Class186 local6 = (Class186) Static94.aClass172_17.method4347((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static14.aClass22_7.method665(Static247.method3792(arg0), Static22.method455(arg0));
		local6 = new Class186();
		local6.anInt5808 = arg0;
		if (local25 != null) {
			local6.method4666(new Class4_Sub24(local25));
		}
		local6.method4668();
		Static94.aClass172_17.method4345(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method994(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static53.aBoolean68) {
			try {
				@Pc(28) Class60 local28 = (Class60) Class.forName("Class60_Sub1").getDeclaredConstructor().newInstance();
				local28.method2551(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static53.aBoolean68 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
	public static void method995() {
		Static296.aClass172_49.method4349(5);
		Static162.aClass172_30.method4349(5);
	}
}
