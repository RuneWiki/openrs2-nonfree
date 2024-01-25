import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray52;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "[I")
	public static final int[] anIntArray778 = new int[4];

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "Lclient!fea;")
	public static final Class87 aClass87_8 = new Class87();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
	public static int method7765(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(28) int local28 = (local14 >>> 2 & 0xB3333333) + (local14 & 0x33333333);
		@Pc(36) int local36 = (local28 >>> 4) + local28 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILclient!oa;Lclient!eea;I)V")
	public static void method7768(@OriginalArg(2) Class5 arg0, @OriginalArg(3) Class71 arg1) {
		Static325.aClass71_47.method2088();
		if (Static172.aBoolean294) {
			return;
		}
		for (@Pc(22) Class3_Sub31 local22 = (Class3_Sub31) arg1.method2089(); local22 != null; local22 = (Class3_Sub31) arg1.method2086()) {
			@Pc(30) Class179 local30 = Static55.aClass135_2.method3801(local22.anInt5809);
			if (Static47.method7754(local30)) {
				@Pc(42) boolean local42 = Static508.method7282(arg0, local30, local22);
				if (local42) {
					Static495.method4749(arg0, local30, local22);
				}
			}
		}
	}
}
