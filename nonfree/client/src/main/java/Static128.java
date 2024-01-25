import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_36 = new Class186(11, 6);

	@OriginalMember(owner = "client!gk", name = "H", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
	public static final int anInt2277 = 1406;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)Lclient!ht;")
	public static Class6_Sub16 method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class6_Sub16 local7 = new Class6_Sub16();
		local7.anInt2717 = arg2;
		local7.anInt2715 = arg1;
		Static20.aClass137_3.method3179((long) arg0, local7);
		Static331.method4738(arg1);
		@Pc(31) Class239 local31 = Static299.method4387(arg0);
		if (local31 != null) {
			Static354.method4992(local31);
		}
		if (Static46.aClass239_13 != null) {
			Static354.method4992(Static46.aClass239_13);
			Static46.aClass239_13 = null;
		}
		Static281.method4243();
		if (local31 != null) {
			Static199.method3150(local31, !arg3);
		}
		if (!arg3) {
			Static308.method4423(arg1);
		}
		if (!arg3 && Static313.anInt5099 != -1) {
			Static277.method4189(1, Static313.anInt5099);
		}
		return local7;
	}
}
