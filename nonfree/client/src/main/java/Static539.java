import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "F")
	public static float aFloat181 = 0.25F;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIBI)V")
	public static void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static613.anInt10112 = arg5;
		Static609.anInt10031 = arg1;
		Static685.anInt4668 = arg0;
		Static18.anInt244 = arg2;
		Static189.anInt3209 = arg3;
		Static32.anInt11014 = arg4;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public static void method7936() {
		Static540.aClass299Array3 = null;
		if (Static656.aBoolean741 && Static141.method2141() != 1) {
			Static143.method2158(0, Static513.method7350(), Static387.anInt9114 == 3 || Static387.anInt9114 == 7, Static52.method948(), 0);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (Static656.aBoolean741) {
			local41 = Static532.method7876();
			local43 = Static276.method4674();
		}
		Static3.method78(Static563.anInt4939 + local41, local43, local41, local43 + Static506.anInt8791, -1, Static358.anInt6145, local43, local41);
		if (Static540.aClass299Array3 != null) {
			Static591.method8402(local43 + Static506.anInt8791, true, Static563.anInt4939 + local41, Static540.aClass299Array3, Static26.anInt353, Static530.aClass299_9.anInt8555, local41, -1412584499, Static666.anInt10882, local43);
			Static540.aClass299Array3 = null;
		}
	}
}
