import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_179 = new Class106("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_169 = new Class217(4, -2);

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt5175 = 0;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Z")
	public static boolean method4770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(19) Class71 local19 = Static219.method4081(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local19.method2278(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
	public static void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class152 local3 = new Class152();
		local3.anInt4481 = arg1 >> Static153.anInt3177;
		local3.anInt4470 = arg2 >> Static153.anInt3177;
		local3.anInt4483 = arg3 >> Static153.anInt3177;
		local3.anInt4463 = arg4 >> Static153.anInt3177;
		local3.anInt4479 = arg0;
		local3.anInt4466 = arg1;
		local3.anInt4480 = arg2;
		local3.anInt4468 = arg3;
		local3.anInt4464 = arg4;
		local3.anInt4475 = arg5;
		local3.anInt4471 = arg6;
		Static92.aClass152Array1[Static258.anInt1131++] = local3;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
	public static int method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
