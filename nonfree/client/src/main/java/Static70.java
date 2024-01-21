import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_987 = Static69.method1153("@gre@");

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Lclient!rd;")
	private static Class64 aClass64_990 = Static69.method1153("Error connecting to server)3");

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_988 = aClass64_990;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	public static int anInt1573 = 78;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_989 = Static69.method1153("backright1");

	@OriginalMember(owner = "client!me", name = "H", descriptor = "I")
	public static int anInt1576 = 0;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Lclient!rd;")
	public static Class64 aClass64_991 = Static69.method1153("Verbindung mit");

	@OriginalMember(owner = "client!me", name = "J", descriptor = "Z")
	public static volatile boolean aBoolean85 = true;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public static int anInt1578 = 0;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
	public static int anInt1581 = 0;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_992 = Static69.method1153("Icons redrawn");

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
	public static int anInt1591 = 0;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public static void method1162() {
		aClass64_989 = null;
		aClass64_990 = null;
		aClass64_987 = null;
		aClass64_991 = null;
		aClass64_992 = null;
		aClass64_988 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!pb;ZLclient!pb;I)Lclient!a;")
	public static Class1_Sub1_Sub1 method1163(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1049(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg1.method1074(arg0, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(62) byte[] local62 = arg2.method1074(local44, 0);
				if (local62 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub1(arg1, arg2, arg0, false);
		} catch (@Pc(88) Exception local88) {
			return null;
		}
	}
}
