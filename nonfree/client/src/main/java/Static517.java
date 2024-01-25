import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!ts", name = "S", descriptor = "Lclient!f;")
	public static Class78 aClass78_33;

	@OriginalMember(owner = "client!ts", name = "T", descriptor = "Lclient!hp;")
	public static Class144 aClass144_1;

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString89 = null;

	@OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
	public static int anInt9274 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
	public static void method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		Static147.method2808(false, arg3, arg2, arg0, null, arg1);
	}

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "(B)V")
	public static void method7563() {
		@Pc(15) Class337 local15 = null;
		try {
			@Pc(21) Class234 local21 = Static406.aClass354_5.method8215("3", false);
			while (local21.anInt6717 == 0) {
				Static63.method1019(1L);
			}
			if (local21.anInt6717 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local15 = (Class337) local21.anObject16;
			@Pc(48) byte[] local48 = new byte[(int) local15.method7969()];
			if (local48.length == 0) {
				Static143.aString26 = "";
				Static98.aString8 = "";
			} else {
				@Pc(69) int local69;
				for (@Pc(56) int local56 = 0; local56 < local48.length; local56 += local69) {
					local69 = local15.method7964(local56, local48.length - local56, local48);
					if (local69 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(91) Class4_Sub11 local91 = new Class4_Sub11(local48);
				@Pc(95) int local95 = local91.method4905();
				if (local95 > 120) {
					throw new RuntimeException("Bad length");
				}
				local91.anInt5831 = local95 + 1;
				if (!local91.method4907()) {
					throw new RuntimeException("Invalid CRC");
				}
				local91.anInt5831 = 1;
				@Pc(126) int local126 = local91.method4905();
				if (local126 > 3) {
					throw new RuntimeException("Invalid version " + local126);
				}
				Static143.aString26 = local91.method4900();
				Static98.aString8 = local91.method4900();
				if (local126 >= 1) {
					Static126.anInt2811 = local91.method4936();
				} else {
					Static126.anInt2811 = Static566.anInt9919;
				}
				if (local126 < 2) {
					Static430.aLong211 = Static79.aLong41;
				} else {
					Static430.aLong211 = local91.method4903();
				}
				if (local126 < 3) {
					Static337.aString66 = Static314.aString60;
				} else if (local91.method4905() == 1) {
					Static337.aString66 = local91.method4900();
				} else {
					Static337.aString66 = null;
				}
			}
		} catch (@Pc(200) Exception local200) {
			Static98.aString8 = "";
			Static143.aString26 = "";
		}
		try {
			if (local15 != null) {
				local15.method7966();
			}
		} catch (@Pc(211) Exception local211) {
		}
	}
}
