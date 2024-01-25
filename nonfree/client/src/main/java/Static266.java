import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
	public static int anInt5447;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Lclient!am;")
	public static Class11 aClass11_113;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString196 = "shake:";

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "J")
	public static long aLong199 = 0L;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	public static void method4640(@OriginalArg(0) int arg0) {
		Static33.anInt493 = arg0;
		@Pc(12) Class154 local12 = Static195.aClass154_67;
		synchronized (Static195.aClass154_67) {
			Static195.aClass154_67.method4219();
		}
		local12 = Static277.aClass154_85;
		synchronized (Static277.aClass154_85) {
			Static277.aClass154_85.method4219();
		}
		local12 = Static81.aClass154_26;
		synchronized (Static81.aClass154_26) {
			Static81.aClass154_26.method4219();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)Z")
	public static boolean method4641(@OriginalArg(1) int arg0) {
		if (Static115.aBooleanArray17[arg0]) {
			return true;
		} else if (Static108.aClass11_48.method272(arg0)) {
			@Pc(28) int local28 = Static108.aClass11_48.method292(arg0);
			if (local28 == 0) {
				Static115.aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static158.aClass72ArrayArray1[arg0] == null) {
				Static158.aClass72ArrayArray1[arg0] = new Class72[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static158.aClass72ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static108.aClass11_48.method288(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class72 local73 = Static158.aClass72ArrayArray1[arg0][local47] = new Class72();
						local73.anInt1830 = (arg0 << 16) + local47;
						if (local61[0] == -1) {
							local73.method1507(new Class4_Sub7(local61));
						} else {
							local73.method1510(new Class4_Sub7(local61));
						}
					}
				}
			}
			Static115.aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!am;)V")
	public static void method4644(@OriginalArg(1) Class11 arg0) {
		Static345.aClass11_151 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
	public static void method4645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg1, 14);
		local8.method2031();
		local8.anInt2410 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	public static void method4649() {
		@Pc(5) Class154 local5 = Static238.aClass154_76;
		synchronized (Static238.aClass154_76) {
			Static238.aClass154_76.method4212();
		}
		local5 = Static181.aClass154_64;
		synchronized (Static181.aClass154_64) {
			Static181.aClass154_64.method4212();
		}
	}
}
