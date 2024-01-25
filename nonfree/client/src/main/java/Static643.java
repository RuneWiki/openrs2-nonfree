import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_121 = new Class387(69, -1);

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "[F")
	public static final float[] aFloatArray108 = new float[4];

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	public static int anInt10456 = 0;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
	public static int anInt10457 = 0;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z")
	public static boolean method8966() {
		try {
			@Pc(12) Class340 local12 = new Class340();
			@Pc(17) byte[] local17 = local12.method8466(Static619.aByteArray17);
			Static128.method6003(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	public static void method8969() {
		Static649.aClass73Array3 = null;
		if (Static40.aBoolean61 && Static341.method5176() != 1) {
			Static44.method713(Static79.method1204(), 0, Static107.anInt1746 == 3 || Static107.anInt1746 == 7, Static421.method6303(), 0);
		}
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		if (Static40.aBoolean61) {
			local43 = Static169.method2467();
			local45 = Static375.method5510();
		}
		Static481.method6999(local45, local43, local45 + Static631.anInt10283, local43 - -Static70.anInt1125, local45, Static390.anInt6669, -1, local43);
		if (Static649.aClass73Array3 != null) {
			Static243.method3598(Static649.aClass73Array3, Static631.anInt10283 + local45, Static70.anInt1125 + local43, Static508.anInt8703, Static142.aClass73_6.anInt1359, -1412584499, true, Static206.anInt3361, local43, local45);
			Static649.aClass73Array3 = null;
		}
	}
}
