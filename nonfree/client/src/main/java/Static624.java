import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "[I")
	public static int[] anIntArray578;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!lb;")
	public static Class221 aClass221_153;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public static int anInt10064;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "Lclient!hda;")
	public static final Class146 aClass146_4 = new Class146("LIVE", 0);

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Lclient!dda;")
	public static final Class66 aClass66_9 = new Class66();

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "[I")
	public static final int[] anIntArray579 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
	public static void method8446(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static418.anInt7393;
		@Pc(7) int local7 = Static263.anInt4829;
		if (arg0 && Static568.aBoolean784) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static488.aClass67_12.f(local7, local5);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;B)Lclient!ha;")
	public static Class67 method8449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface2 arg3) {
		return new Class67_Sub3(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!bm;Lclient!lb;BLclient!wk;Lclient!lb;Lclient!lb;)Z")
	public static boolean method8450(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(3) Class3_Sub22_Sub5 arg2, @OriginalArg(4) Class221 arg3, @OriginalArg(5) Class221 arg4) {
		Static588.anIntArray528 = new int[16];
		Static671.aClass3_Sub22_Sub5_3 = arg2;
		Static296.aClass33_3 = arg0;
		Static386.aClass221_79 = arg4;
		Static300.aClass221_86 = arg3;
		Static343.aClass221_97 = arg1;
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			Static588.anIntArray528[local20] = 255;
		}
		return -11 <= -81 ? true : true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!av;B)V")
	public static void method8451(@OriginalArg(0) Class20 arg0) {
		@Pc(7) Class20 local7 = Static55.method716(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static575.anInt9435;
			local13 = Static272.anInt5005;
		} else {
			local13 = local7.anInt569;
			local11 = local7.anInt509;
		}
		Static127.method2133(false, arg0, local11, local13);
		Static231.method3630(local13, arg0, local11);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V")
	public static void method8452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static27.method393(arg1, Static280.anInt5114, Static356.anInt6028);
		@Pc(17) int local17 = Static27.method393(arg0, Static280.anInt5114, Static356.anInt6028);
		@Pc(23) int local23 = Static27.method393(arg4, Static85.anInt1313, Static316.anInt6313);
		@Pc(29) int local29 = Static27.method393(arg3, Static85.anInt1313, Static316.anInt6313);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static482.method7040(arg2, local23, Static384.anIntArrayArray38[local39], local29);
		}
	}
}
