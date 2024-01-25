import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "Lclient!eo;")
	public static Class68 aClass68_11 = null;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_10 = new Class180("", 14);

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public static int anInt6527 = 0;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "Lclient!eo;")
	public static Class68 aClass68_12 = null;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	public static void method5135() {
		@Pc(5) Class203 local5 = null;
		try {
			@Pc(10) Class190 local10 = Static295.aClass103_5.method2841("2");
			while (local10.anInt5799 == 0) {
				Static135.method2458(1L);
			}
			if (local10.anInt5799 == 1) {
				local5 = (Class203) local10.anObject7;
				@Pc(37) Class3_Sub2 local37 = new Class3_Sub2(Static366.anInt6539 * 6 + 3);
				local37.method6001(1);
				local37.method6045(Static366.anInt6539);
				for (@Pc(49) int local49 = 0; local49 < Static436.anIntArray560.length; local49++) {
					if (Static372.aBooleanArray9[local49]) {
						local37.method6045(local49);
						local37.method6008(Static436.anIntArray560[local49]);
					}
				}
				local5.method4996(local37.anInt7620, 0, local37.aByteArray95);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local5 != null) {
				local5.method4993();
			}
		} catch (@Pc(94) Exception local94) {
		}
		Static331.aLong170 = Static150.method2672();
		Static184.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5136(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < Static317.anInt5757; local14++) {
			if (arg0.equalsIgnoreCase(Static170.aStringArray78[local14])) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([SZI)[S")
	public static short[] method5137(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static464.method5794(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
