import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!th", name = "kb", descriptor = "F")
	public static float aFloat206;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_134 = new Class349(44, -1);

	@OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
	public static final int anInt8185 = -1;

	@OriginalMember(owner = "client!th", name = "nb", descriptor = "[I")
	public static final int[] anIntArray550 = new int[13];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!uca;)V")
	public static void method6618(@OriginalArg(1) Class162_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static45.anObject3 == null) {
			@Pc(5) Class10_Sub2_Sub1 local5 = new Class10_Sub2_Sub1();
			local12 = local5.method5244();
			Static45.anObject3 = Static144.method1989(local12);
		}
		if (Static422.anObject17 == null) {
			@Pc(27) Class10_Sub1_Sub1 local27 = new Class10_Sub1_Sub1();
			local12 = local27.method217();
			Static422.anObject17 = Static144.method1989(local12);
		}
		@Pc(42) Class178 local42 = arg0.aClass178_1;
		if (local42.method3646() && Static83.anObject4 == null) {
			local12 = Static63.method1085(0.5F, 4.0F, 4.0F, 16.0F, new Class43_Sub1(419684), 0.6F);
			Static83.anObject4 = Static144.method1989(local12);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Lclient!eda;")
	public static Class86_Sub1 method6622() {
		Static505.anInt8015 = 0;
		return Static71.method4252();
	}
}
