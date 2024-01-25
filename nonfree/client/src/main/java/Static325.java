import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Lclient!cr;")
	public static Class41 aClass41_39;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "Lclient!vg;")
	public static Class201 aClass201_11;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "I")
	public static int anInt6299;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "Lclient!wn;")
	public static Class95 aClass95_14;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public static int anInt6278 = 0;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "I")
	public static int anInt6291 = 1;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "[I")
	public static final int[] anIntArray596 = new int[64];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Lclient!pq;")
	public static Class163 method5628(@OriginalArg(0) int arg0) {
		@Pc(10) Class109 local10 = Static331.aClass109_60;
		@Pc(19) Class163 local19;
		synchronized (Static331.aClass109_60) {
			local19 = (Class163) Static331.aClass109_60.method2857((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static198.aClass93_76.method2410(Static324.method5614(arg0), Static254.method4488(arg0));
		local19 = new Class163();
		local19.anInt5027 = arg0;
		if (local39 != null) {
			local19.method4487(new Class5_Sub12(local39));
		}
		@Pc(57) Class109 local57 = Static331.aClass109_60;
		synchronized (Static331.aClass109_60) {
			Static331.aClass109_60.method2855((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!ij;)V")
	public static void method5629(@OriginalArg(1) Class93 arg0) {
		Static87.aClass93_36 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!eq;I)V")
	public static void method5631(@OriginalArg(1) Class65 arg0, @OriginalArg(2) int arg1) {
		if (Static321.aBoolean519) {
			Static321.aBoolean519 = false;
			arg1 = 0;
		}
		if (Static42.aClass65_4 != null && Static42.aClass65_4.method1424(arg0)) {
			return;
		}
		Static42.aClass65_4 = arg0;
		Static303.aLong199 = Static340.method5863();
		Static76.anInt1458 = arg1;
		Static273.anInt5337 = arg1;
		if (Static273.anInt5337 == 0) {
			Static102.method1832();
			return;
		}
		Static63.anInt5182 = Static113.anInt2095;
		Static215.anInt4245 = Static233.anInt4655;
		Static93.anInt1795 = Static49.anInt4961;
		Static158.aFloat62 = Static5.aFloat1;
		Static342.aClass54_4 = Static88.aClass54_2;
		Static245.aFloat60 = Static6.aFloat2;
		Static54.aFloat9 = Static133.aFloat17;
		Static240.aFloat58 = Static234.aFloat57;
		Static177.aFloat33 = Static316.aFloat59;
		Static109.aFloat16 = Static144.aFloat22;
	}
}
