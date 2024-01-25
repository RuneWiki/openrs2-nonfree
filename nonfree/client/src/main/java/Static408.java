import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)Lclient!jd;")
	public static Class164 method5789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static15.aClass164ArrayArrayArray5[0][arg1][arg2] != null && Static15.aClass164ArrayArrayArray5[0][arg1][arg2].aClass164_1 != null;
			if (local28 && arg0 >= Static183.anInt3720 - 1) {
				return null;
			}
			Static24.method659(arg0, arg1, arg2);
		}
		return Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)V")
	public static void method5791() {
		Static457.aClass332_1 = new Class332(8);
		Static610.anInt9845 = 0;
		for (@Pc(22) Class28_Sub7 local22 = (Class28_Sub7) Static544.aClass371_6.method8911(); local22 != null; local22 = (Class28_Sub7) Static544.aClass371_6.method8917()) {
			local22.method7911();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BC)Z")
	public static boolean method5794(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
