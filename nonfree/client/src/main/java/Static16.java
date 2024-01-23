import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "Lclient!ai;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
	public static int anInt435;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "Lclient!eg;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_1 = new Class1_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_141 = Static200.method3116("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "Lclient!db;")
	public static Class19 aClass19_2 = new Class19();

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_143 = Static200.method3116(" from your friend list first)3");

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_142 = aClass60_143;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "[Lclient!fa;")
	public static Class29[] aClass29Array1 = new Class29[100];

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "J")
	public static volatile long aLong11 = 0L;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_144 = Static200.method3116(")1j");

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method309() {
		for (@Pc(7) int local7 = -1; local7 < Static205.anInt4356; local7++) {
			@Pc(16) int local16;
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static124.anIntArray353[local7];
			}
			@Pc(24) Class9_Sub4_Sub1 local24 = Static41.aClass9_Sub4_Sub1Array2[local16];
			if (local24 != null) {
				Static29.method539(local24, local24.anInt3937);
			}
		}
	}
}
