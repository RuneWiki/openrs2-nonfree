import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "F")
	public static float aFloat43 = 1024.0F;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public static int anInt3201 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	public static int method2985(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method2986() {
		if (Static257.method4680() || Static182.anInt3603 == Static69.anInt1511) {
			Static187.method3374(Static147.aClass4_2);
			if (Static182.anInt3603 != Static145.anInt6939) {
				Static224.method3941();
			}
		} else {
			Static282.method5084(Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], Static278.anInt5657, false, Static182.anInt3603, Static146.anInt3013, false);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
	public static void method2991(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static104.aBooleanArray24[arg0]) {
			return;
		}
		Static252.aClass191_161.method5444(arg0);
		if (Static265.aClass146ArrayArray41[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(33) int local33 = 0; local33 < Static265.aClass146ArrayArray41[arg0].length; local33++) {
			if (Static265.aClass146ArrayArray41[arg0][local33] != null) {
				if (Static265.aClass146ArrayArray41[arg0][local33].anInt4419 == 2) {
					local25 = false;
				} else {
					Static265.aClass146ArrayArray41[arg0][local33] = null;
				}
			}
		}
		if (local25) {
			Static265.aClass146ArrayArray41[arg0] = null;
		}
		Static104.aBooleanArray24[arg0] = false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2992() {
		Static47.aClass119_29.method3312();
		Static301.aClass119_156.method3312();
	}
}
