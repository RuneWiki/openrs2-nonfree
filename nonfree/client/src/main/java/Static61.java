import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!oa;")
	private static Class56 aClass56_948 = Static33.method650("Location");

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!oa;")
	private static Class56 aClass56_949 = Static33.method650("Click to continue");

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_950 = aClass56_949;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_951 = Static33.method650("");

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!oa;")
	private static Class56 aClass56_952 = Static33.method650("To play on this world move to a free area first");

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!oa;")
	private static Class56 aClass56_953 = Static33.method650("Report abuse");

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_954 = aClass56_953;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Lclient!oa;")
	public static Class56 aClass56_955 = Static33.method650("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_956 = aClass56_952;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "Lclient!oa;")
	public static Class56 aClass56_957 = Static33.method650("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
	public static int anInt1799 = 0;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "Lclient!oa;")
	public static Class56 aClass56_958 = Static33.method650(" (X");

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[5][5000];

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_959 = aClass56_948;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!tb;ZILclient!gb;Lclient!tb;)V")
	public static void method1199(@OriginalArg(0) Class44 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class3_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) Class44 arg3) {
		Static88.aClass44_52 = arg0;
		Static28.aClass44_18 = arg3;
		Static108.aBoolean135 = arg1;
		Static93.anInt2439 = Static88.aClass44_52.method1151(10);
		Static99.aClass3_Sub1_Sub1_Sub1_2 = arg2;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1200(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static4.method40(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static87.aClass43_3.anApplet1 != null) {
				@Pc(102) Class54 local102 = Static87.aClass43_3.method1099(new URL(Static87.aClass43_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static5.anInt75 + "&u=" + Static92.aLong68 + "&v1=" + Static58.aString3 + "&v2=" + Static58.aString2 + "&e=" + local7));
				while (local102.anInt2077 == 0) {
					Static68.method1266(1L);
				}
				if (local102.anInt2077 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local102.anObject2;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method1201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(24) int local24 = local10 << 13 ^ local10;
		@Pc(38) int local38 = local24 * (local24 * 15731 * local24 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local38 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	public static int method1202() {
		return Static5.anInt74++;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method1203() {
		aClass56_958 = null;
		aClass56_954 = null;
		aClass56_957 = null;
		aClass56_948 = null;
		anIntArrayArray17 = null;
		aClass56_953 = null;
		aClass56_952 = null;
		aClass56_959 = null;
		aClass56_949 = null;
		aClass56_955 = null;
		aClass56_951 = null;
		aClass56_950 = null;
		aClass56_956 = null;
	}
}
