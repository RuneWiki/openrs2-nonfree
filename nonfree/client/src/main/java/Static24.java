import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_914 = Static193.method3027("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "[Lclient!t;")
	public static final Class87[] aClass87Array2 = new Class87[500];

	@OriginalMember(owner = "client!ce", name = "kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_915 = Static193.method3027("Null");

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_916 = Static193.method3027("sch-Utteln:");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public static void method1241(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static101.aBooleanArray9[arg0]) {
			return;
		}
		Static97.aClass52_21.method1579(arg0);
		if (Static49.aClass6ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(32) boolean local32 = true;
		for (@Pc(34) int local34 = 0; local34 < Static49.aClass6ArrayArray1[arg0].length; local34++) {
			if (Static49.aClass6ArrayArray1[arg0][local34] != null) {
				if (Static49.aClass6ArrayArray1[arg0][local34].anInt250 == 2) {
					local32 = false;
				} else {
					Static49.aClass6ArrayArray1[arg0][local34] = null;
				}
			}
		}
		if (local32) {
			Static49.aClass6ArrayArray1[arg0] = null;
		}
		Static101.aBooleanArray9[arg0] = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)Z")
	public static boolean method1263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}
}
