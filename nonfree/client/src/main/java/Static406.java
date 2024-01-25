import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "Lclient!de;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_104 = new Class306("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "()V")
	public static void method6067() {
		for (@Pc(1) int local1 = 0; local1 < Static480.anInt7981; local1++) {
			@Pc(6) Class49_Sub2 local6 = Static301.aClass49_Sub2Array3[local1];
			Static158.method2475(local6);
			Static301.aClass49_Sub2Array3[local1] = null;
		}
		Static480.anInt7981 = 0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)I")
	public static int method6069(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
