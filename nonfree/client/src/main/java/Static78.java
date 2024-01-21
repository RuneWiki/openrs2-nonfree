import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!na;")
	public static Class56 aClass56_26;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!cf;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt1728;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_4;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_745 = Static119.method1462("null");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!pe;")
	private static Class65 aClass65_746 = Static119.method1462("Connection timed out)3");

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_747 = Static119.method1462(" weitere Optionen");

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_748 = Static119.method1462("Benutzername: ");

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_749 = aClass65_746;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt1729 = 0;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_750 = Static119.method1462("jolt");

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)J")
	public static synchronized long method1296() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static129.aLong94) {
			Static23.aLong55 += Static129.aLong94 - local5;
		}
		Static129.aLong94 = local5;
		return Static23.aLong55 + local5;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method1297() {
		aClass65_745 = null;
		aClass65_748 = null;
		aClass56_26 = null;
		aClass65_746 = null;
		aClass2_Sub1_Sub4_Sub1_4 = null;
		aClass65_750 = null;
		aClass65_747 = null;
		aClass65_749 = null;
		aClass15_7 = null;
		aBooleanArray12 = null;
	}
}
