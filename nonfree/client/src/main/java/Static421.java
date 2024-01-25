import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!am;")
	public static Class15 aClass15_6;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[S")
	public static short[] aShortArray155 = new short[256];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	public static void method7824(@OriginalArg(0) int arg0) {
		if (Static474.method3731(arg0)) {
			Static310.method4787(-1, Static458.aClass115ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method7827() {
		@Pc(13) Class8[] local13 = Class4_Sub20.aClass8Array1;
		synchronized (Class4_Sub20.aClass8Array1) {
			for (@Pc(17) int local17 = 0; local17 < Class4_Sub20.aClass8Array1.length; local17++) {
				Class4_Sub20.aClass8Array1[local17] = new Class8();
				Static436.anIntArray613[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method7828() {
		Static129.anInt2971 = Static195.aClass196_5.anInt5177 + Static195.aClass196_5.anInt5173 + 2;
		Static192.aStringArray13 = new String[500];
		Static515.anInt8858 = Static162.aClass196_4.anInt5177 + Static162.aClass196_4.anInt5173 + 2;
		for (@Pc(31) int local31 = 0; local31 < Static192.aStringArray13.length; local31++) {
			Static192.aStringArray13[local31] = "";
		}
	}
}
