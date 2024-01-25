import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!kb;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
	public static final int[] anIntArray85 = new int[50];

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
	public static final boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!u;")
	public static Class187_Sub1 method479(@OriginalArg(1) int arg0) {
		return Static316.aBoolean441 && Static58.anInt1482 <= arg0 && Static65.anInt1637 >= arg0 ? Static238.aClass187_Sub1Array1[arg0 - Static58.anInt1482] : null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I")
	public static int method480() {
		return Static116.anInt2643;
	}
}
