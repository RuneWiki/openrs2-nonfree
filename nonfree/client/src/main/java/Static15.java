import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "Lclient!e;")
	public static Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "Kb", descriptor = "Z")
	public static boolean aBoolean16;

	@OriginalMember(owner = "client!cb", name = "Yb", descriptor = "I")
	public static int anInt324;

	@OriginalMember(owner = "client!cb", name = "ac", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_4;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_233 = method178("compass");

	@OriginalMember(owner = "client!cb", name = "jc", descriptor = "Lclient!gd;")
	private static Class23 aClass23_237 = method178("purple:");

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_234 = aClass23_237;

	@OriginalMember(owner = "client!cb", name = "Lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_235 = method178("Aus");

	@OriginalMember(owner = "client!cb", name = "Mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_236 = method178("Handel)4Duell");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public static void method172() {
		aClass23_235 = null;
		aClass23_236 = null;
		aClass1_Sub1_Sub6_Sub3_4 = null;
		aClass1_Sub4_Sub1_1 = null;
		aClass23_237 = null;
		aClass23_233 = null;
		aClass23_234 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)Lclient!ee;")
	public static Class1_Sub1_Sub7 method174(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static105.aClass1_Sub1_Sub7ArrayArray1[local7] == null || Static105.aClass1_Sub1_Sub7ArrayArray1[local7][local11] == null) {
			@Pc(30) boolean local30 = Static77.method1346(local7);
			if (!local30) {
				return null;
			}
		}
		return Static105.aClass1_Sub1_Sub7ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!gd;")
	public static Class23 method178(@OriginalArg(1) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(18) Class23 local18 = new Class23();
		local18.aByteArray4 = new byte[local14];
		@Pc(24) int local24 = 0;
		while (local24 < local14) {
			@Pc(32) int local32 = local11[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local24 >= local14) {
					break;
				}
				@Pc(69) int local69 = local11[local24++] & 0xFF;
				local18.aByteArray4[local18.anInt965++] = (byte) (local32 * 43 + local69 - 1720 - 48);
			} else if (local32 != 0) {
				local18.aByteArray4[local18.anInt965++] = (byte) local32;
			}
		}
		local18.method547();
		return local18.method515();
	}
}
