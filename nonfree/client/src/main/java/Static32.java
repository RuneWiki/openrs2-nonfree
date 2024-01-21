import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_431 = Static45.method1937("Standort");

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_432 = Static45.method1937("::noclip");

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!af;")
	private static Class5 aClass5_435 = Static45.method1937("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_433 = aClass5_435;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_434 = Static45.method1937(" ");

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method655() {
		aClass5_435 = null;
		aClass5_432 = null;
		aClass5_434 = null;
		aCRC32_2 = null;
		aClass5_431 = null;
		aClass5_433 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
	public static boolean method656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!sa;ILclient!r;)V")
	public static void method657(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class53 local9 = Static8.aClass53_4;
		synchronized (Static8.aClass53_4) {
			for (@Pc(16) Class1_Sub19 local16 = (Class1_Sub19) Static8.aClass53_4.method1442(); local16 != null; local16 = (Class1_Sub19) Static8.aClass53_4.method1450()) {
				if ((long) arg1 == local16.aLong95 && local16.aClass70_3 == arg0 && local16.anInt2528 == 0) {
					local7 = local16.aByteArray34;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(80) byte[] local80 = arg0.method1881(arg1);
			arg2.method1732(local80, arg1, true, arg0);
		} else {
			arg2.method1732(local7, arg1, true, arg0);
		}
	}
}
