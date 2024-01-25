import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Lclient!ed;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_29 = new Class77(97, 3);

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
	public static int anInt1243 = 0;

	@OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
	public static int anInt1245 = 1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method1157() {
		for (@Pc(10) Class22_Sub6 local10 = (Class22_Sub6) Static35.aClass56_1.method1259(); local10 != null; local10 = (Class22_Sub6) Static35.aClass56_1.method1254()) {
			local10.method3558();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB[B)I")
	public static int method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(18) int local18 = arg1; local18 < arg0; local18++) {
			local7 = local7 >>> 8 ^ Class102.anIntArray290[(arg2[local18] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIII)V")
	public static void method1159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static213.anInt3924 = arg0;
		Static215.anInt3982 = arg2;
		Static327.anInt5766 = arg3;
		Static368.anInt6428 = arg1;
		Static276.anInt4908 = arg4;
		if (Static368.anInt6428 >= 100) {
			@Pc(34) int local34 = Static276.anInt4908 * 128 + 64;
			@Pc(40) int local40 = Static215.anInt3982 * 128 + 64;
			@Pc(49) int local49 = Static18.method508(local40, Static331.anInt5804, local34) - Static327.anInt5766;
			@Pc(54) int local54 = local34 - Static160.anInt2915;
			@Pc(59) int local59 = local49 - Static71.anInt1354;
			@Pc(64) int local64 = local40 - Static22.anInt547;
			@Pc(75) int local75 = (int) Math.sqrt((double) (local64 * local64 + local54 * local54));
			Static278.anInt1556 = (int) (Math.atan2((double) local59, (double) local75) * 2607.5945876176133D) & 0x3FFF;
			Static392.anInt6749 = (int) (-2607.5945876176133D * Math.atan2((double) local54, (double) local64)) & 0x3FFF;
			Static315.anInt5585 = 0;
			if (Static278.anInt1556 < 1024) {
				Static278.anInt1556 = 1024;
			}
			if (Static278.anInt1556 > 3072) {
				Static278.anInt1556 = 3072;
			}
		}
		Static283.anInt5017 = 2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!fs;")
	public static Class78 method1164(@OriginalArg(1) Component arg0) {
		return new Class78_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public static void method1165() {
		Static267.aClass82_6.method4457(((float) Static146.anInt2670 * 0.1F + 0.7F) * Static159.aFloat33);
		Static267.aClass82_6.method4520(Static251.anInt4516, Static366.aFloat97, Static110.aFloat28, (float) Static346.anInt6114, (float) Static292.anInt5166, (float) Static69.anInt1316);
		Static267.aClass82_6.method4508(Static343.aClass21_3);
	}
}
