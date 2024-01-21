import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
	public static int anInt2073;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "Lclient!sf;")
	public static Class66 aClass66_18 = new Class66(64);

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	public static int anInt2074 = -1;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Lclient!he;")
	public static Class26 aClass26_1055 = Static6.method100("scrollen:");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!df;")
	public static Class11 method1340() {
		try {
			return (Class11) Class.forName("Class11_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class11_Sub1();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Z")
	public static boolean method1341(@OriginalArg(1) int arg0) {
		if (Static116.aBooleanArray27[arg0]) {
			return true;
		} else if (Static14.aClass16_21.method562(arg0)) {
			@Pc(23) int local23 = Static14.aClass16_21.method561(arg0);
			if (local23 == 0) {
				Static116.aBooleanArray27[arg0] = true;
				return true;
			}
			if (Static49.aClass3_Sub14ArrayArray1[arg0] == null) {
				Static49.aClass3_Sub14ArrayArray1[arg0] = new Class3_Sub14[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static49.aClass3_Sub14ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static14.aClass16_21.method566(arg0, local50);
					if (local64 != null) {
						Static49.aClass3_Sub14ArrayArray1[arg0][local50] = new Class3_Sub14();
						Static49.aClass3_Sub14ArrayArray1[arg0][local50].anInt2154 = (arg0 << 16) + local50;
						if (local64[0] == -1) {
							Static49.aClass3_Sub14ArrayArray1[arg0][local50].method1384(new Class3_Sub11(local64));
						} else {
							Static49.aClass3_Sub14ArrayArray1[arg0][local50].method1380(new Class3_Sub11(local64));
						}
					}
				}
			}
			Static116.aBooleanArray27[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
	public static boolean method1342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1343() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
	public static void method1344() {
		aClass66_18 = null;
		aClass26_1055 = null;
	}
}
