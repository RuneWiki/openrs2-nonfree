import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public static int anInt4185;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt4186;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!ek;")
	public static Class42 aClass42_61;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
	public static boolean aBoolean283 = true;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[Lclient!gb;")
	public static Class58_Sub1[] aClass58_Sub1Array1 = new Class58_Sub1[0];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZII)V")
	public static void method3396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static30.method572(Static148.anInt3245, arg4, Static166.anInt3675);
		@Pc(21) int local21 = Static30.method572(Static148.anInt3245, arg3, Static166.anInt3675);
		@Pc(27) int local27 = Static30.method572(Static53.anInt1319, arg1, Static81.anInt1915);
		@Pc(33) int local33 = Static30.method572(Static53.anInt1319, arg0, Static81.anInt1915);
		for (@Pc(35) int local35 = local7; local35 <= local21; local35++) {
			Static25.method486(Static275.anIntArrayArray37[local35], local27, local33, arg2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method3397() {
		Static48.anInt1204 = 0;
		Static218.anInt4451 = 0;
		Static244.anInt4865 = -1;
		Static154.anInt3462 = -1;
		Static196.aBoolean281 = false;
		Static68.anInt1741 = 0;
		Static259.anInt5137 = -1;
		Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
		Static34.anInt892 = -1;
		Static21.anInt454 = 0;
		Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
		Static101.method1743();
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static188.aClass15_Sub2_Sub2Array41.length; local33++) {
			if (Static188.aClass15_Sub2_Sub2Array41[local33] != null) {
				Static188.aClass15_Sub2_Sub2Array41[local33].anInt5352 = -1;
			}
		}
		for (local33 = 0; local33 < Static35.aClass15_Sub2_Sub1Array2.length; local33++) {
			if (Static35.aClass15_Sub2_Sub1Array2[local33] != null) {
				Static35.aClass15_Sub2_Sub1Array2[local33].anInt5352 = -1;
			}
		}
		Static74.method1403();
		Static16.anInt342 = 1;
		Static305.method4624(30);
		for (local33 = 0; local33 < 100; local33++) {
			Static293.aBooleanArray23[local33] = true;
		}
		Static258.method4049();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method3398() {
		if (Static274.aBoolean362) {
			return;
		}
		Static63.aBoolean100 = true;
		Static274.aBoolean362 = true;
		if (Static41.aBoolean65) {
			Static239.aFloat51 = (int) Static239.aFloat51 - 65 & 0xFFFFFF80;
		} else {
			Static102.aFloat11 += (-Static102.aFloat11 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!dn;")
	public static Class36 method3400(@OriginalArg(0) int arg0) {
		@Pc(16) Class36 local16 = (Class36) Static236.aClass157_40.method4031((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static273.aClass42_92.method1256(31, arg0);
		local16 = new Class36();
		if (local27 != null) {
			local16.method1111(new Class2_Sub16(local27), arg0);
		}
		Static236.aClass157_40.method4026((long) arg0, local16);
		return local16;
	}
}
