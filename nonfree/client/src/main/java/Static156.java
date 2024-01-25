import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array5;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_70 = new Class332(64);

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt2754 = 0;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public static void method2289(@OriginalArg(0) int arg0) {
		Static230.anInt3922 = -1;
		Static95.anInt1576 = arg0;
		Static331.anInt6297 = -1;
		Static155.method2279();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method2290() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class278 local13 = Static152.aClass57_4.method929(false, "3");
			while (local13.anInt7757 == 0) {
				Static149.method2211(1L);
			}
			if (local13.anInt7757 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class133) local13.anObject24;
			@Pc(42) byte[] local42 = new byte[(int) local7.method2789()];
			if (local42.length == 0) {
				Static187.aString49 = "";
				Static209.aString53 = "";
			} else {
				@Pc(69) int local69;
				for (@Pc(56) int local56 = 0; local56 < local42.length; local56 += local69) {
					local69 = local7.method2787(local42, local56, local42.length - local56);
					if (local69 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(90) Class6_Sub14 local90 = new Class6_Sub14(local42);
				@Pc(94) int local94 = local90.method6041();
				if (local94 > 60) {
					throw new RuntimeException("Bad length");
				}
				local90.anInt7244 = local94 + 1;
				if (!local90.method6024()) {
					throw new RuntimeException("Invalid CRC");
				}
				local90.anInt7244 = 1;
				@Pc(123) int local123 = local90.method6041();
				if (local123 > 2) {
					throw new RuntimeException("Invalid version " + local123);
				}
				Static187.aString49 = local90.method6010();
				Static209.aString53 = local90.method6010();
				if (local123 >= 1) {
					Static538.anInt9113 = local90.method6006();
				} else {
					Static538.anInt9113 = Static323.anInt5822;
				}
				if (local123 < 2) {
					Static378.aLong175 = Static421.aLong191;
				} else {
					Static378.aLong175 = local90.method6033();
				}
			}
		} catch (@Pc(173) Exception local173) {
			Static187.aString49 = "";
			Static209.aString53 = "";
		}
		try {
			if (local7 != null) {
				local7.method2788();
			}
		} catch (@Pc(184) Exception local184) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
	public static int method2291(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
