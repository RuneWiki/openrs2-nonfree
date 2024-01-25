import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "Lclient!ta;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_11 = new Class181(31, -1);

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	public static final int anInt1255 = 1339;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZIIIZ)V")
	public static void method1133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(20) Class6_Sub15 local20 = (Class6_Sub15) Static577.aClass305_40.method7447(local14);
		if (local20 == null) {
			local20 = new Class6_Sub15();
			Static577.aClass305_40.method7448(local14, local20);
		}
		if (arg1 >= local20.anIntArray173.length) {
			@Pc(45) int[] local45 = new int[arg1 + 1];
			@Pc(50) int[] local50 = new int[arg1 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray173.length; local52++) {
				local45[local52] = local20.anIntArray173[local52];
				local50[local52] = local20.anIntArray174[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray173.length; local78 < arg1; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray173 = local45;
			local20.anIntArray174 = local50;
		}
		local20.anIntArray173[arg1] = arg0;
		local20.anIntArray174[arg1] = arg2;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!jo;B)V")
	public static void method1134(@OriginalArg(0) Class168 arg0) {
		Static473.anInt8688 = arg0.method4432("hitmarks");
		Static440.anInt8039 = arg0.method4432("hitbar_default");
		Static393.anInt7340 = arg0.method4432("timerbar_default");
		Static418.anInt1963 = arg0.method4432("headicons_pk");
		Static298.anInt5670 = arg0.method4432("headicons_prayer");
		Static168.anInt3846 = arg0.method4432("hint_headicons");
		Static210.anInt4419 = arg0.method4432("hint_mapmarkers");
		Static470.anInt8658 = arg0.method4432("mapflag");
		Static170.anInt3899 = arg0.method4432("cross");
		Static300.anInt5682 = arg0.method4432("mapdots");
		Static214.anInt4557 = arg0.method4432("scrollbar");
		Static479.anInt8749 = arg0.method4432("name_icons");
		Static504.anInt8961 = arg0.method4432("floorshadows");
		Static398.anInt7528 = arg0.method4432("compass");
		Static523.anInt9086 = arg0.method4432("otherlevel");
		Static380.anInt7114 = arg0.method4432("hint_mapedge");
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1135(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg1); local9 != -1; local9 = arg2.indexOf(arg1, arg0.length() + local9)) {
			arg2 = arg2.substring(0, local9) + arg0 + arg2.substring(arg1.length() + local9);
		}
		return arg2;
	}
}
