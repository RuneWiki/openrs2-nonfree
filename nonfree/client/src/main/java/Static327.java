import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public static int anInt5764;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt5766;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!bn;")
	public static Class2_Sub7 aClass2_Sub7_2;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!fn;")
	public static Class77 aClass77_147;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
	public static final int[] anIntArray702 = new int[4096];

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
	public static int anInt5773 = 0;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method5048() {
		if (!Static68.aBoolean110) {
			return;
		}
		@Pc(11) Class155 local11 = Static257.method5607(Static106.anInt2069, Static54.anInt1110);
		if (local11 != null && local11.anObjectArray15 != null) {
			@Pc(20) Class2_Sub24 local20 = new Class2_Sub24();
			local20.aClass155_23 = local11;
			local20.anObjectArray5 = local11.anObjectArray15;
			Static157.method2604(local20);
		}
		Static206.anInt3826 = -1;
		Static332.anInt5811 = -1;
		Static68.aBoolean110 = false;
		if (local11 != null) {
			Static295.method4664(local11);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ld;)V")
	public static void method5051(@OriginalArg(1) Class12_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(15) Class2_Sub42 local15 = (Class2_Sub42) Static39.aClass210_7.method5035(); local15 != null; local15 = (Class2_Sub42) Static39.aClass210_7.method5037()) {
			if (arg0 == local15.aClass12_Sub1_Sub2_Sub1_1) {
				if (local15.aClass2_Sub2_Sub2_2 != null) {
					Static339.aClass2_Sub2_Sub1_2.method110(local15.aClass2_Sub2_Sub2_2);
					local15.aClass2_Sub2_Sub2_2 = null;
				}
				local15.method5745();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!wk;B)Z")
	public static boolean method5055(@OriginalArg(0) Interface11 arg0) {
		@Pc(17) Class34 local17 = Static11.aClass123_5.method2703(arg0.method5025());
		if (local17.anInt799 == -1) {
			return true;
		} else {
			@Pc(30) Class145 local30 = Static201.aClass181_6.method4320(local17.anInt799);
			return local30.anInt3853 == -1 ? true : local30.method3539();
		}
	}
}
