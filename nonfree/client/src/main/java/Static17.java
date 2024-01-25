import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "Lclient!fh;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Lclient!kc;")
	public static Class202 aClass202_1;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_4 = new Class376(49, 3);

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
	public static final int[] anIntArray13 = new int[1000];

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!rha;")
	public static final Class309 aClass309_1 = new Class309("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	public static void method713() {
		for (@Pc(15) Class3_Sub54 local15 = (Class3_Sub54) Static623.aClass62_45.method1680(); local15 != null; local15 = (Class3_Sub54) Static623.aClass62_45.method1681()) {
			Static492.method7030(local15.anInt10223);
		}
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)Lclient!qj;")
	public static Class3_Sub44 method714() {
		@Pc(11) Class3_Sub44 local11 = Static485.method6945();
		local11.aClass376_114 = null;
		local11.anInt8292 = 0;
		local11.aClass3_Sub17_Sub2_3 = new Class3_Sub17_Sub2(5000);
		return local11;
	}
}
