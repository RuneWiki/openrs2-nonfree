import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "[[Lclient!br;")
	public static Class21[][] aClass21ArrayArray1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_283 = new Class159("M", "M", "M", "M");

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public static int anInt5402 = -1;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
	public static final int[] anIntArray441 = new int[50];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method4637(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static106.anIntArray233[local7] = Static106.anIntArray233[local7 - 1];
			Static330.anIntArray487[local7] = Static330.anIntArray487[local7 - 1];
			Static46.aStringArray12[local7] = Static46.aStringArray12[local7 - 1];
			Static324.aStringArray73[local7] = Static324.aStringArray73[local7 - 1];
			Static183.aStringArray47[local7] = Static183.aStringArray47[local7 - 1];
			Static214.aStringArray24[local7] = Static214.aStringArray24[local7 - 1];
			Static122.anIntArray250[local7] = Static122.anIntArray250[local7 - 1];
		}
		Static106.anIntArray233[0] = arg0;
		Static46.aStringArray12[0] = arg5;
		Static330.anIntArray487[0] = arg6;
		Static324.aStringArray73[0] = arg3;
		Static183.aStringArray47[0] = arg2;
		Static144.anInt3263 = Static66.anInt1751;
		Static325.anInt6234++;
		Static122.anIntArray250[0] = arg4;
		Static214.aStringArray24[0] = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IC)Z")
	public static boolean method4638(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!br;)Lclient!br;")
	public static Class21 method4639(@OriginalArg(1) Class21 arg0) {
		if (arg0.anInt723 != -1) {
			return Static92.method534(arg0.anInt723);
		}
		@Pc(21) int local21 = arg0.anInt728 >>> 16;
		@Pc(26) Class22 local26 = new Class22(Static270.aClass43_29);
		for (@Pc(31) Class4_Sub25 local31 = (Class4_Sub25) local26.method554(); local31 != null; local31 = (Class4_Sub25) local26.method551()) {
			if (local21 == local31.anInt3695) {
				return Static92.method534((int) local31.aLong223);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method4640() {
		@Pc(1) Class198 local1 = Static330.aClass198_235;
		synchronized (Static330.aClass198_235) {
			Static330.aClass198_235.method5202(5);
		}
		local1 = Static281.aClass198_202;
		synchronized (Static281.aClass198_202) {
			Static281.aClass198_202.method5202(5);
		}
	}
}
