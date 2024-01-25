import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array14;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
	public static final int[] anIntArray548 = new int[32];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)V")
	public static void method5003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 9);
		local8.method850();
		local8.anInt994 = arg1;
		local8.anInt996 = arg2;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)Lclient!db;")
	public static Class5_Sub1_Sub2 method5004() {
		@Pc(8) Class5_Sub1_Sub2 local8 = (Class5_Sub1_Sub2) Static50.aClass212_1.method5943();
		if (local8 != null) {
			local8.method6005();
			local8.method5970();
			return local8;
		}
		@Pc(31) Class5_Sub1_Sub2 local31;
		do {
			local31 = (Class5_Sub1_Sub2) Static183.aClass212_6.method5943();
			if (local31 == null) {
				return null;
			}
			if (local31.method855() > Static340.method5863()) {
				return null;
			}
			local31.method6005();
			local31.method5970();
		} while ((local31.aLong234 & Long.MIN_VALUE) == 0L);
		return local31;
	}
}
