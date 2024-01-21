import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt964 = 1;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_491 = Static14.method2017("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!kc;")
	private static Class36 aClass36_494 = Static14.method2017("Could not complete login)3");

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_492 = aClass36_494;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public static int anInt968 = -1;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_493 = Static14.method2017("@red@");

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!kc;")
	private static Class36 aClass36_495 = Static14.method2017("Offline");

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
	public static int[] anIntArray145 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_496 = aClass36_495;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
	public static void method746(@OriginalArg(1) boolean arg0) {
		if (Static80.aClass51_4 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub12 local11 = new Class2_Sub12(4);
			local11.method1409(arg0 ? 2 : 3);
			local11.method1390(0);
			Static80.aClass51_4.method1486(4, local11.aByteArray20);
		} catch (@Pc(32) IOException local32) {
			try {
				Static80.aClass51_4.method1483();
			} catch (@Pc(37) Exception local37) {
			}
			Static80.aClass51_4 = null;
			Static22.anInt580++;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method747() {
		aClass36_495 = null;
		aClass36_494 = null;
		aClass36_496 = null;
		aClass36_493 = null;
		anIntArray145 = null;
		aClass36_492 = null;
		aClass36_491 = null;
		anIntArray144 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[BIII)V")
	public static void method748(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static41.aClass29_1 == null) {
			return;
		}
		if (Static79.anInt2048 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			anInt969 = arg2;
			if (Static79.anInt2048 == 0) {
				Static20.anInt502 = 0;
			} else {
				@Pc(45) int local45 = Static67.method1164(Static79.anInt2048);
				@Pc(49) int local49 = local45 - Static99.anInt2032;
				Static20.anInt502 = (local49 + arg2 + 3600 - 1) / arg2;
			}
			Static17.aByteArray4 = arg1;
			Static11.aBoolean4 = arg0;
			Static88.anInt2316 = arg3;
		} else if (anInt969 == 0) {
			Static36.method735(arg3, arg0, arg1);
		} else {
			Static88.anInt2316 = arg3;
			Static11.aBoolean4 = arg0;
			Static17.aByteArray4 = arg1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ac;ILclient!ac;Lclient!ac;)V")
	public static void method749(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) Class3 arg2) {
		Static53.aClass3_15 = arg0;
		Static91.aClass3_22 = arg2;
		Static10.aClass3_1 = arg1;
		Static42.aClass2_Sub1_Sub6ArrayArray1 = new Class2_Sub1_Sub6[Static91.aClass3_22.method947()][];
		Static100.aBooleanArray14 = new boolean[Static91.aClass3_22.method947()];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ed;B)Z")
	public static boolean method750(@OriginalArg(0) Class2_Sub1_Sub6 arg0) {
		if (arg0.anIntArray56 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray56.length; local12++) {
			@Pc(28) int local28 = Static74.method1421(arg0, local12);
			@Pc(33) int local33 = arg0.anIntArray55[local12];
			if (arg0.anIntArray56[local12] == 2) {
				if (local33 <= local28) {
					return false;
				}
			} else if (arg0.anIntArray56[local12] == 3) {
				if (local33 >= local28) {
					return false;
				}
			} else if (arg0.anIntArray56[local12] == 4) {
				if (local33 == local28) {
					return false;
				}
			} else if (local33 != local28) {
				return false;
			}
		}
		return true;
	}
}
