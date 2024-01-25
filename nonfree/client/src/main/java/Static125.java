import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[Lclient!sba;")
	public static Class302[] aClass302Array1;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public static int anInt3109;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public static int anInt3103 = 0;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_44 = new Class73(78, 4);

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
	public static final int[] anIntArray119 = new int[2048];

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
	public static void method2615(@OriginalArg(0) int arg0) {
		Static152.anInt3555 = arg0;
		@Pc(11) Class94 local11 = Static403.aClass94_38;
		synchronized (Static403.aClass94_38) {
			Static403.aClass94_38.method2952();
		}
		local11 = Static378.aClass94_34;
		synchronized (Static378.aClass94_34) {
			Static378.aClass94_34.method2952();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)Z")
	public static boolean method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(17) Interface22 local17 = (Interface22) Static37.method1328(arg1, arg0, arg2);
		if (local17 != null) {
			local11 = Static338.method5608(local17) & true;
		}
		local17 = (Interface22) Static173.method3262(arg1, arg0, arg2, rl.class);
		if (local17 != null) {
			local11 &= Static338.method5608(local17);
		}
		local17 = (Interface22) Static446.method6808(arg1, arg0, arg2);
		if (local17 != null) {
			local11 &= Static338.method5608(local17);
		}
		return local11;
	}
}
