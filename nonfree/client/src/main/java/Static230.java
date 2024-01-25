import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "[S")
	public static short[] aShortArray76;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	public static int anInt4303 = -1;

	@OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
	public static int anInt4308 = 100;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public static void method4089() {
		for (@Pc(14) Class6_Sub5 local14 = (Class6_Sub5) Static261.aClass211_30.method5594(); local14 != null; local14 = (Class6_Sub5) Static261.aClass211_30.method5582()) {
			if (local14.anInt509 == -1) {
				local14.anInt506 = 0;
				Static326.method5426(local14);
			} else {
				local14.method5756();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public static boolean method4091(@OriginalArg(0) int arg0) {
		if (arg0 == 28 || arg0 == 42 || arg0 == 23 || arg0 == 24 || arg0 == 34 || arg0 == 11 || arg0 == 9 || arg0 == 40) {
			return true;
		} else if (arg0 == 37 || arg0 == 5 || arg0 == 1005 || arg0 == 1010) {
			return true;
		} else if (arg0 == 7 || arg0 == 8 || arg0 == 10 || arg0 == 48 || arg0 == 16) {
			return true;
		} else {
			return arg0 == 33 || arg0 == 29 || arg0 == 50 || arg0 == 6 || arg0 == 22 || arg0 == 14;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!dp;Lclient!ja;)V")
	public static void method4092(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class81 arg1) {
		if (Static242.aBoolean316) {
			return;
		}
		arg1.method2987(0);
		Static172.aClass40_10 = arg1.method3015(Static363.method2253(arg0, Static137.anInt2494));
		Static172.aClass40_10.method5077((Static209.anInt3815 - Static172.aClass40_10.method5083()) / 2, (Static94.anInt1731 - Static172.aClass40_10.method5084()) / 2);
		Static2.aClass40_1 = arg1.method3015(Static363.method2253(arg0, Static15.anInt278));
		Static2.aClass40_1.method5077((Static209.anInt3815 - Static2.aClass40_1.method5083()) / 2, 18);
		Static242.aBoolean316 = true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()V")
	public static void method4093() {
		Static270.method4574(Static131.anInt2392);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)V")
	public static void method4094(@OriginalArg(1) int arg0) {
		Static192.anInt3643 = arg0;
		Static242.aClass70_81.method1399();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public static void method4095() {
		if (Static90.aFrame1 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static95.aFrame2 == null) {
			local18 = Static308.aClass206_5.anApplet1;
		} else {
			local18 = Static95.aFrame2;
		}
		Static92.anInt1689 = local18.getSize().width;
		Static99.anInt6127 = local18.getSize().height;
		@Pc(37) Insets local37;
		if (local18 == Static95.aFrame2) {
			local37 = Static95.aFrame2.getInsets();
			Static99.anInt6127 -= local37.top + local37.bottom;
			Static92.anInt1689 -= local37.left + local37.right;
		}
		if (Static137.method2629() == 1) {
			Static271.anInt5038 = (Static92.anInt1689 - 765) / 2;
			Static94.anInt1731 = 503;
			Static209.anInt3815 = 765;
			Static57.anInt1098 = 0;
		} else if (Static183.anInt3439 < 96 && Static13.anInt232 == 0) {
			@Pc(74) int local74 = Static92.anInt1689 <= 1024 ? Static92.anInt1689 : 1024;
			@Pc(83) int local83 = Static99.anInt6127 > 768 ? 768 : Static99.anInt6127;
			Static209.anInt3815 = local74;
			Static271.anInt5038 = (Static92.anInt1689 - local74) / 2;
			Static57.anInt1098 = 0;
			Static94.anInt1731 = local83;
		} else {
			Static57.anInt1098 = 0;
			Static271.anInt5038 = 0;
			Static94.anInt1731 = Static99.anInt6127;
			Static209.anInt3815 = Static92.anInt1689;
		}
		if (Static189.anInt3601 != 0) {
			@Pc(131) boolean local131;
			if (Static209.anInt3815 < 1024 && Static94.anInt1731 < 768) {
				local131 = true;
			} else {
				local131 = false;
			}
		}
		Static354.aCanvas5.setSize(Static209.anInt3815, Static94.anInt1731);
		if (Static289.aClass81_7 != null) {
			Static289.aClass81_7.method2965();
		}
		if (local18 == Static95.aFrame2) {
			local37 = Static95.aFrame2.getInsets();
			Static354.aCanvas5.setLocation(Static271.anInt5038 + local37.left, local37.top + Static57.anInt1098);
		} else {
			Static354.aCanvas5.setLocation(Static271.anInt5038, Static57.anInt1098);
		}
		if (Static62.anInt1131 != -1) {
			Static222.method3938(true);
		}
		Static66.method1126();
	}
}
