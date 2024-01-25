import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "Z")
	public static boolean aBoolean282;

	@OriginalMember(owner = "client!gia", name = "q", descriptor = "Lclient!nd;")
	public static Class238 aClass238_90;

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!gia", name = "l", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_75 = new Class200(50, 10);

	@OriginalMember(owner = "client!gia", name = "p", descriptor = "Lclient!an;")
	public static final Class19 aClass19_5 = new Class19();

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3200(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static529.method7327(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static568.anInt9305; local27++) {
			@Pc(32) String local32 = Static84.aStringArray8[local27];
			if (local32.startsWith("*")) {
				local32 = local32.substring(1);
			}
			local32 = Static529.method7327(local32);
			if (local32 != null && local32.equals(local22)) {
				Static568.anInt9305--;
				for (@Pc(56) int local56 = local27; local56 < Static568.anInt9305; local56++) {
					Static84.aStringArray8[local56] = Static84.aStringArray8[local56 + 1];
					Static307.aStringArray33[local56] = Static307.aStringArray33[local56 + 1];
					Static188.aStringArray22[local56] = Static188.aStringArray22[local56 + 1];
					Static204.aStringArray26[local56] = Static204.aStringArray26[local56 + 1];
					Static66.aBooleanArray1[local56] = Static66.aBooleanArray1[local56 + 1];
				}
				Static76.anInt1945 = Static148.anInt3063;
				@Pc(116) Class2_Sub31 local116 = Static275.method4480(Static640.aClass314_2, Static165.aClass145_55);
				local116.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg0));
				local116.aClass2_Sub17_Sub1_2.method2856(arg0);
				Static526.method7309(local116);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZI)V")
	public static void method3201(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static284.anInt5163++;
			Static298.method4716();
		}
		if (arg0) {
			Static252.anInt4800++;
			Static86.method1807();
		}
	}
}
