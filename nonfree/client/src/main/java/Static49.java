import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_41;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!oa;")
	private static Class56 aClass56_838 = Static33.method650("OFF");

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_833 = aClass56_838;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_834 = Static33.method650("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public static int anInt1492 = -1;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!oa;")
	private static Class56 aClass56_835 = Static33.method650("Public chat");

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_836 = aClass56_835;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_837 = Static33.method650("(Z");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
	public static int anInt1493 = 0;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!oa;")
	private static Class56 aClass56_842 = Static33.method650("Unable to connect)3");

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_839 = aClass56_842;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_840 = aClass56_842;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_841 = Static33.method650("Freunde");

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!oa;")
	public static Class56 aClass56_843 = Static33.method650(" )2> @cya@");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)V")
	public static void method974(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method975() {
		aClass56_833 = null;
		aClass56_839 = null;
		aClass56_837 = null;
		aClass44_Sub1_41 = null;
		aClass56_838 = null;
		aClass56_843 = null;
		aClass56_842 = null;
		anIntArray102 = null;
		aClass56_834 = null;
		aClass56_836 = null;
		aClass56_840 = null;
		aClass56_841 = null;
		aClass56_835 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method977() {
		while (true) {
			if (Static31.aClass3_Sub2_Sub1_3.method326(Static73.anInt2013) >= 11) {
				@Pc(16) int local16 = Static31.aClass3_Sub2_Sub1_3.method323(11);
				if (local16 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local16] == null) {
						local21 = true;
						Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local16] = new Class3_Sub1_Sub2_Sub4_Sub1();
						if (Static94.aClass3_Sub2Array1[local16] != null) {
							Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local16].method877(Static94.aClass3_Sub2Array1[local16]);
						}
					}
					Static54.anIntArray108[Static110.anInt2767++] = local16;
					@Pc(59) Class3_Sub1_Sub2_Sub4_Sub1 local59 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local16];
					local59.anInt3147 = Static98.anInt2566;
					@Pc(67) int local67 = Static31.aClass3_Sub2_Sub1_3.method323(1);
					if (local67 == 1) {
						Static79.anIntArray186[Static60.anInt1776++] = local16;
					}
					@Pc(85) int local85 = Static31.aClass3_Sub2_Sub1_3.method323(1);
					@Pc(92) int local92 = Static31.aClass3_Sub2_Sub1_3.method323(5);
					@Pc(99) int local99 = Static8.anIntArray8[Static31.aClass3_Sub2_Sub1_3.method323(3)];
					if (local92 > 15) {
						local92 -= 32;
					}
					if (local21) {
						local59.anInt3156 = local99;
					}
					@Pc(113) int local113 = Static31.aClass3_Sub2_Sub1_3.method323(5);
					if (local113 > 15) {
						local113 -= 32;
					}
					local59.method2031(local85 == 1, local92 + Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0] - -local113);
					continue;
				}
			}
			Static31.aClass3_Sub2_Sub1_3.method318();
			return;
		}
	}
}
