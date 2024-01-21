import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
	public static int anInt377;

	@OriginalMember(owner = "client!bg", name = "X", descriptor = "Lclient!qe;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_113 = Static81.method1507("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_116 = Static81.method1507("shake:");

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_114 = aClass24_116;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "Lclient!dj;")
	public static Class24 aClass24_115 = null;

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "Lclient!dj;")
	public static Class24 aClass24_117 = aClass24_116;

	@OriginalMember(owner = "client!bg", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_118 = Static81.method1507(": ");

	@OriginalMember(owner = "client!bg", name = "Y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_119 = Static81.method1507("Weiter");

	@OriginalMember(owner = "client!bg", name = "ab", descriptor = "I")
	public static int anInt379 = -1;

	@OriginalMember(owner = "client!bg", name = "jb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_126 = Static81.method1507("as it was used to break our rules)3");

	@OriginalMember(owner = "client!bg", name = "db", descriptor = "Lclient!dj;")
	public static Class24 aClass24_120 = aClass24_126;

	@OriginalMember(owner = "client!bg", name = "kb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_127 = Static81.method1507("yellow:");

	@OriginalMember(owner = "client!bg", name = "eb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_121 = aClass24_127;

	@OriginalMember(owner = "client!bg", name = "fb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_122 = aClass24_127;

	@OriginalMember(owner = "client!bg", name = "hb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_124 = Static81.method1507("Attack");

	@OriginalMember(owner = "client!bg", name = "gb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_123 = aClass24_124;

	@OriginalMember(owner = "client!bg", name = "ib", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_125 = Static81.method1507("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
	public static int method366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static111.method1910(arg1 - 1, arg0 + -1) + Static111.method1910(arg1 - 1, arg0 + 1) + Static111.method1910(arg1 - -1, arg0 + -1) + Static111.method1910(arg1 - -1, arg0 + 1);
		@Pc(74) int local74 = Static111.method1910(arg1, arg0 - 1) + Static111.method1910(arg1, arg0 + 1) + Static111.method1910(arg1 - 1, arg0) + Static111.method1910(arg1 + 1, arg0);
		@Pc(79) int local79 = Static111.method1910(arg1, arg0);
		return local74 / 8 + local46 / 16 + local79 / 4;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!ve;Lclient!ve;Lclient!ve;)V")
	public static void method369(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) Class69 arg2) {
		Static119.aClass69_28 = arg2;
		Static192.aClass69_36 = arg0;
		Static116.aClass69_27 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!vc;BI)V")
	public static void method370(@OriginalArg(0) Class98[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class98 local9 = arg0[local1];
			if (local9 != null) {
				if (local9.anInt4373 == 0) {
					if (local9.aClass98Array3 != null) {
						method370(local9.aClass98Array3, arg1);
					}
					@Pc(33) Class1_Sub11 local33 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local9.anInt4357);
					if (local33 != null) {
						Static5.method108(local33.anInt2169, arg1);
					}
				}
				@Pc(49) Class1_Sub16 local49;
				if (arg1 == 0 && local9.anObjectArray7 != null) {
					local49 = new Class1_Sub16();
					local49.aClass98_13 = local9;
					local49.anObjectArray1 = local9.anObjectArray7;
					Static131.method2258(local49);
				}
				if (arg1 == 1 && local9.anObjectArray8 != null) {
					if (local9.anInt4379 >= 0) {
						@Pc(73) Class98 local73 = Static188.method3229(local9.anInt4357);
						if (local73 == null || local73.aClass98Array3 == null || local73.aClass98Array3.length <= local9.anInt4379 || local73.aClass98Array3[local9.anInt4379] != local9) {
							continue;
						}
					}
					local49 = new Class1_Sub16();
					local49.aClass98_13 = local9;
					local49.anObjectArray1 = local9.anObjectArray8;
					Static131.method2258(local49);
				}
			}
		}
	}
}
