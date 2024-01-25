import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
	public static int anInt3813;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
	public static int anInt3815;

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "[I")
	public static final int[] anIntArray449 = new int[50];

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString164 = "Allocating memory";

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString165 = " has logged in.";

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Lclient!bq;")
	public static Class24 method3737(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = Static267.aClass70_84;
		@Pc(19) Class24 local19;
		synchronized (Static267.aClass70_84) {
			local19 = (Class24) Static267.aClass70_84.method1396((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static323.aClass53_146.method1033(Static16.method284(arg0), Static228.method4088(arg0));
		local19 = new Class24();
		local19.anInt592 = arg0;
		if (local39 != null) {
			local19.method492(new Class6_Sub10(local39));
		}
		local19.method488();
		@Pc(60) Class70 local60 = Static267.aClass70_84;
		synchronized (Static267.aClass70_84) {
			Static267.aClass70_84.method1406(local19, (long) arg0);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILclient!bs;ILclient!pi;ZLjava/lang/String;Lclient!rn;ILclient!mb;)V")
	public static void method3738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class30 arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class74 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class132 arg10) {
		@Pc(11) int local11;
		if (Static334.anInt6112 == 4) {
			local11 = (int) Static117.aFloat58 & 0x3FFF;
		} else {
			local11 = Static345.anInt6260 + (int) Static117.aFloat58 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg10.anInt3507 / 2, arg10.anInt3503 / 2) + 10;
		@Pc(40) int local40 = arg1 * arg1 + arg3 * arg3;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(50) int local50 = Class207.anIntArray697[local11];
		@Pc(54) int local54 = Class207.anIntArray698[local11];
		if (Static334.anInt6112 != 4) {
			local50 = local50 * 256 / (Static279.anInt5302 + 256);
			local54 = local54 * 256 / (Static279.anInt5302 + 256);
		}
		@Pc(88) int local88 = local50 * arg1 + arg3 * local54 >> 15;
		@Pc(98) int local98 = local54 * arg1 - local50 * arg3 >> 15;
		@Pc(105) int local105 = arg4.method503(arg7, null, 100);
		@Pc(113) int local113 = arg4.method506(arg7, null);
		@Pc(119) int local119 = local88 - local105 / 2;
		if (-arg10.anInt3507 <= local119 && arg10.anInt3507 >= local119 && -arg10.anInt3503 <= local98 && arg10.anInt3503 >= local98) {
			arg6.method5337(arg10.anInt3507 / 2 + local119 + arg9, -local113 + arg10.anInt3503 / 2 + arg2 - local98 + -arg0, null, 0, local105, null, 0, 1, arg2, arg9, arg8, arg7, arg5, 50, 0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V")
	public static void method3739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static307.anInt1198 / (float) Static307.anInt1202;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(39) int local39 = arg1 - (arg2 - local11) / 2;
		@Pc(48) int local48 = arg0 - (arg3 - local13) / 2;
		Static192.anInt3645 = -1;
		Static23.anInt371 = Static307.anInt1198 - local48 * Static307.anInt1198 / local13;
		Static17.anInt6198 = -1;
		Static61.anInt1126 = local39 * Static307.anInt1202 / local11;
		Static323.method5376();
	}
}
