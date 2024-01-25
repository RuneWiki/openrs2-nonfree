import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!bv;")
	public static Class31 aClass31_4;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public static int method3568(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static189.method2489(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3571(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static330.method4213(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static145.anInt2445; local31++) {
			@Pc(37) String local37 = Static108.aStringArray17[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static330.method4213(local37);
			if (local37 != null && local37.equals(local26)) {
				Static145.anInt2445--;
				for (@Pc(61) int local61 = local31; local61 < Static145.anInt2445; local61++) {
					Static108.aStringArray17[local61] = Static108.aStringArray17[local61 + 1];
					Static244.aStringArray29[local61] = Static244.aStringArray29[local61 + 1];
					Static163.anIntArray137[local61] = Static163.anIntArray137[local61 + 1];
					Static226.aStringArray47[local61] = Static226.aStringArray47[local61 + 1];
					Static154.anIntArray343[local61] = Static154.anIntArray343[local61 + 1];
					Static82.aBooleanArray10[local61] = Static82.aBooleanArray10[local61 + 1];
				}
				Static136.anInt2311 = Static443.anInt6230;
				Static5.method94(Static415.aClass137_77);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg0));
				Static75.aClass1_Sub11_Sub1_1.method4453(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!m;Lclient!ji;IZ)Lclient!qa;")
	public static synchronized Class128 method3583(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static353.aBooleanArray27[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(49) Class128 local49;
		if (arg1 == 0) {
			local49 = Static43.method4050(local7, arg2, arg0);
		} else if (arg1 == 1) {
			local49 = Static35.method609(arg0, local7, arg4, arg3, arg2);
		} else if (arg1 == 2) {
			local49 = Static339.method4301(arg2, local7, arg0, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static353.aBooleanArray27[local7] = true;
		return local49;
	}
}
