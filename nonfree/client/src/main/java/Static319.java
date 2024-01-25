import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILjava/lang/String;IILclient!ha;B)V")
	public static void method4666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class22 arg5) {
		if (Static111.aClass178_2 == null || Static490.aClass178_21 == null) {
			if (Static218.aClass182_59.method3964(Static393.anInt6110) && Static218.aClass182_59.method3964(Static481.anInt7537)) {
				Static111.aClass178_2 = arg5.method9363(Static735.method8269(Static218.aClass182_59, Static393.anInt6110, 0), true);
				@Pc(34) Class361 local34 = Static735.method8269(Static218.aClass182_59, Static481.anInt7537, 0);
				Static490.aClass178_21 = arg5.method9363(local34, true);
				local34.method8282();
				Static392.aClass178_12 = arg5.method9363(local34, true);
			} else {
				arg5.aa(arg1, arg0, arg3, 20, 255 - Static276.anInt4227 << 24 | Static32.anInt1113, 1);
			}
		}
		if (Static111.aClass178_2 != null && Static490.aClass178_21 != null) {
			@Pc(86) int local86 = (arg3 - Static490.aClass178_21.method7636() * 2) / Static111.aClass178_2.method7636();
			for (@Pc(88) int local88 = 0; local88 < local86; local88++) {
				Static111.aClass178_2.method7637(Static490.aClass178_21.method7636() + arg1 + local88 * Static111.aClass178_2.method7636(), arg0);
			}
			Static490.aClass178_21.method7637(arg1, arg0);
			Static392.aClass178_12.method7637(arg1 + arg3 - Static392.aClass178_12.method7636(), arg0);
		}
		Static561.aClass57_10.method9131(-1, arg0 + 14, Static587.anInt8945 | 0xFF000000, arg1 + 3, arg2);
		arg5.aa(arg1, arg0 + 20, arg3, arg4 - 20, Static32.anInt1113 | -Static276.anInt4227 + 255 << 24, 1);
	}
}
