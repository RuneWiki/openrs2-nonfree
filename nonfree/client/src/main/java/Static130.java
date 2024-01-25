import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Lclient!ud;")
	public static Class239 aClass239_4;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public static int anInt2604;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public static int anInt2601 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)B")
	public static byte method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V")
	public static void method1931() {
		Static67.aClass4_Sub18_Sub4_2.method5765();
		Static324.aClass166_264 = null;
		Static142.anInt2689 = 1;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public static void method1932() {
		@Pc(7) Class154 local7 = null;
		try {
			@Pc(12) Class108 local12 = Static89.aClass114_3.method2363("2");
			while (local12.anInt2803 == 0) {
				Static20.method1515(1L);
			}
			if (local12.anInt2803 == 1) {
				local7 = (Class154) local12.anObject4;
				@Pc(45) Class4_Sub30 local45 = new Class4_Sub30(Static215.anInt7151 * 6 + 3);
				local45.method4871(1);
				local45.method4846(Static215.anInt7151);
				for (@Pc(55) int local55 = 0; local55 < Static327.anIntArray505.length; local55++) {
					if (Static291.aBooleanArray18[local55]) {
						local45.method4846(local55);
						local45.method4861(Static327.anIntArray505[local55]);
					}
				}
				local7.method3336(local45.anInt6244, local45.aByteArray79, 0);
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method3335();
			}
		} catch (@Pc(97) Exception local97) {
		}
		Static256.aLong156 = Static199.method2845();
		Static111.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method1933() {
		@Pc(15) String local15 = "www";
		if (aClass239_4 == Static6.aClass239_2) {
			local15 = "www-wtrc";
		} else if (Static263.aClass239_5 == aClass239_4) {
			local15 = "www-wtqa";
		} else if (aClass239_4 == Static124.aClass239_3) {
			local15 = "www-wtwip";
		}
		@Pc(36) String local36 = "";
		if (Static156.aString26 != null) {
			local36 = "/p=" + Static156.aString26;
		}
		return "http://" + local15 + "." + Static441.aClass95_5.aString24 + ".com/l=" + Static139.anInt2670 + "/a=" + Static121.anInt2512 + local36 + "/";
	}
}
