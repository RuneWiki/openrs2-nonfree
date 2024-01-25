import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!jga", name = "t", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_55 = new Class187(1, 3);

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "Lclient!pd;")
	public static final Class270 aClass270_4 = new Class270();

	@OriginalMember(owner = "client!jga", name = "A", descriptor = "[I")
	public static final int[] anIntArray260 = new int[13];

	@OriginalMember(owner = "client!jga", name = "B", descriptor = "Z")
	public static boolean aBoolean285 = false;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBI)Z")
	public static boolean method3829(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static389.method576(arg0, arg1) | (arg1 & 0x70000) != 0 || Static69.method991(arg0, arg1);
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V")
	public static void method3830() {
		Static620.method8294(Static563.aClass143_13, (long) Static421.anInt7434);
		if (Static131.anInt2222 != -1) {
			Static57.method856(Static131.anInt2222);
		}
		for (@Pc(19) int local19 = 0; local19 < Static283.anInt4411; local19++) {
			if (Static425.aBooleanArray18[local19]) {
				Static209.aBooleanArray4[local19] = true;
			}
			Static224.aBooleanArray6[local19] = Static425.aBooleanArray18[local19];
			Static425.aBooleanArray18[local19] = false;
		}
		Static367.anInt6417 = Static421.anInt7434;
		if (Static131.anInt2222 != -1) {
			Static283.anInt4411 = 0;
			Static81.method1270();
		}
		Static563.aClass143_13.la();
		Static155.method2355(Static563.aClass143_13);
		@Pc(60) int local60 = Static608.method8179();
		if (local60 == -1) {
			local60 = Static54.anInt8558;
		}
		if (local60 == -1) {
			local60 = Static464.anInt8094;
		}
		Static52.method801(local60);
		Static648.anInt10220 = 0;
	}
}
