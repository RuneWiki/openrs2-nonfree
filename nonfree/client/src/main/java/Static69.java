import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_24;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 aClass1_Sub1_Sub8_Sub1_2;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_504 = Static8.method128("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public static int anInt2081 = 127;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_505 = Static8.method128("Fertigkeit)2");

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_506 = Static8.method128("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!ea;")
	private static Class18 aClass18_507 = Static8.method128("Enter your username (V password)3");

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_508 = aClass18_507;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1446() {
		aClass16_Sub1_24 = null;
		aClass18_506 = null;
		aClass18_507 = null;
		aClass18_505 = null;
		aClass1_Sub1_Sub8_Sub1_2 = null;
		aClass18_508 = null;
		aClass18_504 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	public static void method1447() {
		Static78.aBoolean96 = false;
		Static7.anInt199 = -1;
		Static41.anInt1326 = 1;
		Static91.anInt2765 = 0;
		Static47.anInt4240 = -1;
		Static171.aClass16_37 = null;
		Static32.anInt1093 = 2;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!dd;IBZLclient!dd;)Lclient!t;")
	public static Class1_Sub1_Sub16 method1448(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class16 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method2242(arg1);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(27) byte[] local27 = arg2.method2233(local12[local14], arg1);
			if (local27 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = local27[1] & 0xFF | (local27[0] & 0xFF) << 8;
				@Pc(63) byte[] local63 = arg0.method2233(0, local47);
				if (local63 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub16(arg2, arg0, arg1, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}
