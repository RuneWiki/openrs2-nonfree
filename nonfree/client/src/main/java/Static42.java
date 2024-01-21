import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 aClass2_Sub4_Sub3_Sub3_1;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_700 = Static107.method1838("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method741() {
		aClass2_Sub4_Sub3_Sub3_1 = null;
		aClass28_700 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIZ)I")
	public static int method742() {
		return Static178.anInt3955 + Static104.anInt2597;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public static int method743(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
