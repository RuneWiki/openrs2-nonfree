import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_14 = new Class70(15, 0, 1, 0);

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[2048];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = arg6 - 334;
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 100) {
			local16 = 100;
		}
		@Pc(43) int local43 = Static110.aShort20 + (Static263.aShort93 - Static110.aShort20) * local16 / 100;
		@Pc(49) int local49 = local43 * arg1 >> 8;
		@Pc(56) int local56 = 16384 - arg0 & 0x3FFF;
		@Pc(62) int local62 = 16384 - arg3 & 0x3FFF;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = local49;
		if (local56 != 0) {
			local66 = Class65.anIntArray88[local56] * -local49 >> 15;
			local68 = local49 * Class65.anIntArray87[local56] >> 15;
		}
		if (local62 != 0) {
			local64 = local68 * Class65.anIntArray88[local62] >> 15;
			local68 = Class65.anIntArray87[local62] * local68 >> 15;
		}
		Static419.anInt7092 = arg0;
		Static410.anInt6946 = arg4 - local66;
		Static266.anInt4433 = arg5 - local64;
		Static372.anInt6317 = arg3;
		Static152.anInt7561 = arg2 - local68;
		Static205.anInt5939 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Z")
	public static boolean method2552(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZBLclient!dq;Ljava/lang/String;Z)V")
	public static void method2553(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static149.method2335(arg2, arg1, 3);
			return;
		}
		@Pc(21) String local21;
		if (Static75.aString22.startsWith("win") && Static75.anInt1371 != 3) {
			local21 = null;
			if (arg1.anApplet1 != null) {
				local21 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(41) Class181 local41 = Static149.method2335(arg2, arg1, 0);
				Static442.aClass51_6 = arg1;
				Static391.aClass181_8 = local41;
				Static237.aString48 = arg2;
				return;
			}
		}
		if (Static75.aString22.startsWith("mac")) {
			local21 = null;
			if (arg1.anApplet1 != null) {
				local21 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg0) {
				Static149.method2335(arg2, arg1, 1);
				return;
			}
		}
		Static149.method2335(arg2, arg1, 2);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!uu;)Lclient!ji;")
	public static Class3_Sub3_Sub13 method2554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class250 arg2) {
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg2.method5806(arg0, arg1));
		@Pc(54) Class3_Sub3_Sub13 local54 = new Class3_Sub3_Sub13(arg1, local14.method4073(), local14.method4073(), local14.method4108(), local14.method4108(), local14.method4096() == 1, local14.method4096(), local14.method4096());
		@Pc(58) int local58 = local14.method4096();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass193_29.method4527(new Class3_Sub34(local14.method4096(), local14.method4083(), local14.method4083(), local14.method4083(), local14.method4083(), local14.method4083(), local14.method4083(), local14.method4083(), local14.method4083()));
		}
		local54.method3006();
		return local54;
	}
}
