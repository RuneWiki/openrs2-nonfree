import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 aClass8_Sub1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public static int anInt990;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!ub;")
	public static Class8_Sub1_Sub3_Sub4_Sub1 aClass8_Sub1_Sub3_Sub4_Sub1_2;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt986 = 0;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!ic;")
	private static Class34 aClass34_527 = Static56.method816("This world is full)3");

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_524 = aClass34_527;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt991 = 0;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_525 = Static56.method816("Abbrechen");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!ic;")
	private static Class34 aClass34_526 = Static56.method816("Type");

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	public static int anInt996 = 99;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_528 = Static56.method816("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_529 = Static56.method816("Versteckt");

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!ic;")
	public static Class34 aClass34_530 = aClass34_526;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method622() {
		aClass34_524 = null;
		aClass8_Sub1_Sub3_Sub4_Sub1_2 = null;
		aClass8_Sub1_Sub3_Sub3_1 = null;
		aClass34_528 = null;
		aClass34_529 = null;
		aClass34_527 = null;
		aClass34_530 = null;
		aClass34_526 = null;
		aClass34_525 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!wd;)V")
	public static void method625(@OriginalArg(1) Class8_Sub20 arg0) {
		@Pc(4) byte[] local4 = new byte[24];
		if (Static132.aClass35_6 != null) {
			@Pc(19) int local19;
			try {
				local19 = 0;
				Static132.aClass35_6.method910(0L);
				Static132.aClass35_6.method901(local4);
				while (local19 < 24 && local4[local19] == 0) {
					local19++;
				}
				if (local19 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local19 = 0; local19 < 24; local19++) {
					local4[local19] = -1;
				}
			}
		}
		arg0.method1871(local4, 24);
	}
}
