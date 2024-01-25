import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
	public static int anInt1172;

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "Lclient!mo;")
	public static Class143 aClass143_32;

	@OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
	public static int anInt1179;

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "[Lclient!jg;")
	public static final Class14_Sub4[] aClass14_Sub4Array1 = new Class14_Sub4[2048];

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "J")
	public static long aLong37 = 0L;

	@OriginalMember(owner = "client!cp", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString47 = "Members object";

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method1135(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static272.aClass143_96.anInt4082 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static178.anInt3666; local18++) {
			@Pc(24) Class220 local24 = Static296.method5066(local18);
			if ((!arg1 || local24.aBoolean445) && local24.anInt6651 == -1 && local24.anInt6656 == -1 && local24.anInt6679 == 0 && local24.aString251.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static60.anInt1452 = -1;
					Static125.aShortArray73 = null;
					return;
				}
				if (local14.length <= local16) {
					@Pc(70) short[] local70 = new short[local14.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local16; local72++) {
						local70[local72] = local14[local72];
					}
					local14 = local70;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static125.aShortArray73 = local14;
		Static351.anInt6641 = 0;
		Static60.anInt1452 = local16;
		@Pc(118) String[] local118 = new String[Static60.anInt1452];
		for (@Pc(120) int local120 = 0; local120 < Static60.anInt1452; local120++) {
			local118[local120] = Static296.method5066(local14[local120]).aString251;
		}
		Static96.method2207(local118, Static125.aShortArray73);
		Static272.aClass143_96.method3748();
		Static272.aClass143_96.anInt4082 = 2;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)Lclient!fn;")
	public static Class65 method1138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt2117 = arg0 + 1 + 5;
		local7.anInt2134 = -1;
		local7.anInt2120 = -1;
		local7.anInt2131 = arg1 + 1 + 5;
		local7.anIntArrayArray29 = new int[local7.anInt2117][local7.anInt2131];
		local7.method2134();
		return local7;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public static void method1139(@OriginalArg(1) int arg0) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(3, arg0);
		local8.method3539();
	}
}
