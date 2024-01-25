import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ffa", name = "F", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
	public static int anInt2897 = -1;

	@OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
	public static final int anInt2898 = 1400;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)V")
	public static void method2681() {
		@Pc(1) Class223 local1 = Static9.aClass223_2;
		synchronized (Static9.aClass223_2) {
			Static9.aClass223_2.method5398();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(III)Lclient!dn;")
	public static Class1_Sub4_Sub1 method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub4_Sub1_2;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZILclient!jn;)Lclient!tea;")
	public static Class4_Sub44 method2683(@OriginalArg(1) int arg0, @OriginalArg(2) Class176 arg1) {
		@Pc(16) byte[] local16 = arg1.method4005(arg0);
		return local16 == null ? null : new Class4_Sub44(local16);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BZ)V")
	public static void method2684(@OriginalArg(1) boolean arg0) {
		if (Static299.aClass241_3 != null) {
			Static299.aClass241_3.method7087();
			Static299.aClass241_3 = null;
		}
		Static587.anInt10158 = 0;
		Static28.method361();
		Static204.method7208();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static86.aClass111Array1[local19].method2855();
		}
		Static136.method2695(false);
		System.gc();
		Static454.method6875();
		Static393.aBoolean519 = false;
		Static18.anInt281 = -1;
		Static115.method2466();
		Static174.method3171(true);
		Static552.anInt9805 = 0;
		Static358.anInt6981 = 0;
		Static158.anInt3275 = 0;
		Static254.anInt4667 = 0;
		Static540.anInt5859 = 0;
		Static541.anInt9603 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static532.aClass366Array1.length; local66++) {
			Static532.aClass366Array1[local66] = null;
		}
		Static355.method5750();
		for (@Pc(85) int local85 = 0; local85 < 2048; local85++) {
			Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local85] = null;
		}
		Static418.anInt7866 = 0;
		Static585.aClass350_41.method8203();
		Static436.anInt8163 = 0;
		Static251.aClass350_19.method8203();
		Static428.method6708();
		Static308.anInt6171 = 0;
		Static45.aClass148_1.method3457();
		Static139.method2733();
		Static76.method1235();
		Static406.aLong201 = 0L;
		Static484.aClass4_Sub42_2 = null;
		if (arg0) {
			Static285.method5604(12);
			return;
		}
		Static285.method5604(3);
		try {
			Static604.method8248(Static110.anApplet1, "loggedout");
		} catch (@Pc(136) Throwable local136) {
		}
	}
}
