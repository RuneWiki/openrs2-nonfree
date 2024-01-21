import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
	public static int anInt1372;

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_429 = Static170.method3101("http:)4)4");

	@OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
	public static int anInt1377 = 0;

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
	public static int anInt1378 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ah;ZLclient!ah;Lclient!ah;Lclient!ah;)V")
	public static void method1148(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class7 arg3) {
		Static148.aClass7_28 = arg0;
		Static94.aClass7_44 = arg3;
		Static92.aClass7_67 = arg1;
		Static79.aClass7_38 = arg2;
		Static42.aClass33ArrayArray1 = new Class33[Static92.aClass7_67.method1025()][];
		Static32.aBooleanArray5 = new boolean[Static92.aClass7_67.method1025()];
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method1149(@OriginalArg(0) int arg0) {
		if (Static32.aBooleanArray5[arg0]) {
			return true;
		} else if (Static92.aClass7_67.method1027(arg0)) {
			@Pc(23) int local23 = Static92.aClass7_67.method1022(arg0);
			if (local23 == 0) {
				Static32.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static42.aClass33ArrayArray1[arg0] == null) {
				Static42.aClass33ArrayArray1[arg0] = new Class33[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static42.aClass33ArrayArray1[arg0][local47] == null) {
					@Pc(62) byte[] local62 = Static92.aClass7_67.method1021(arg0, local47);
					if (local62 != null) {
						Static42.aClass33ArrayArray1[arg0][local47] = new Class33();
						Static42.aClass33ArrayArray1[arg0][local47].anInt1471 = (arg0 << 16) + local47;
						if (local62[0] == -1) {
							Static42.aClass33ArrayArray1[arg0][local47].method1199(new Class3_Sub8(local62));
						} else {
							Static42.aClass33ArrayArray1[arg0][local47].method1207(new Class3_Sub8(local62));
						}
					}
				}
			}
			Static32.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
	public static void method1150() {
		aClass28_429 = null;
		aByteArrayArrayArray10 = null;
	}
}
