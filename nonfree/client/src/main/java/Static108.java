import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "Lclient!ah;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
	public static int anInt2350;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "[I")
	public static final int[] anIntArray201 = new int[1];

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	public static void method2147() {
		Static39.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
	public static int method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static383.anIntArrayArray47 == null ? 0 : Static383.anIntArrayArray47[arg0][arg1] & 0xFFFFFF;
	}
}
