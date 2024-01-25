import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_14 = new Class265();

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_15 = new Class265();

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	public static int anInt1700 = -2;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "[I")
	public static final int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
	public static int anInt1702 = -1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
	public static void method1205(@OriginalArg(0) int arg0) {
		Static303.anInt5385 = 100;
		Static401.anInt6978 = -1;
		Static167.anInt3227 = arg0;
		Static176.anInt3420 = 3;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!cr;I)V")
	public static void method1206(@OriginalArg(0) Class41 arg0) {
		if (Static437.anInt7642 != arg0.anInt1632) {
			return;
		}
		if (Static231.aClass4_Sub2_Sub2_Sub1_2.aString48 == null) {
			arg0.anInt1608 = 0;
			arg0.anInt1659 = 0;
			return;
		}
		arg0.anInt1684 = 150;
		arg0.anInt1681 = (int) (Math.sin((double) Static164.anInt3206 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt1659 = Static393.anInt6881;
		arg0.anInt1662 = 5;
		arg0.anInt1608 = Static206.method3175(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48);
		arg0.anInt1605 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt6458;
		arg0.anInt1680 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt6452;
		arg0.anInt1640 = 0;
		arg0.anInt1645 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt6520;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(IB)V")
	public static void method1207(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 6);
		local8.method435();
	}
}
