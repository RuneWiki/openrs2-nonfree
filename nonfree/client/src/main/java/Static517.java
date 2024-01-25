import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject156;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_140 = new CRC32();

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	public static int anInt10516 = 0;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString233 = null;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
	public static int anInt10518 = 0;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	public static int anInt10520 = 0;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	public static int anInt10521 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)Z")
	public static boolean method8194(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ek;I)Ljava/lang/String;")
	public static String method8195(@OriginalArg(1) Class4_Sub13 arg0) {
		try {
			@Pc(7) int local7 = arg0.method7019();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt9170 += Static180.aClass79_4.method1935(arg0.anInt9170, local15, local7, arg0.aByteArray88, 0);
			return Static380.method5901(local15, 0, local7);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)[Lclient!uea;")
	public static Class326[] method8196() {
		return new Class326[] { Static383.aClass326_7, Static252.aClass326_4, Static492.aClass326_8, Static173.aClass326_3, Static480.aClass326_9, Static287.aClass326_5 };
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method8197(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg2); local13 != -1; local13 = arg0.indexOf(arg2, arg1.length() + local13)) {
			arg0 = arg0.substring(0, local13) + arg1 + arg0.substring(local13 + arg2.length());
		}
		return arg0;
	}
}
