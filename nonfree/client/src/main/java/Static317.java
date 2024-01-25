import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILclient!wha;I)Z")
	public static boolean method5018(@OriginalArg(1) Class393 arg0, @OriginalArg(2) int arg1) {
		Static109.aClass263_2.method8440(arg0.anIntArray593[arg1], arg0.anIntArray592[arg1], arg0.anIntArray591[arg1], Static5.anIntArray4);
		@Pc(29) int local29 = Static5.anIntArray4[2];
		if (local29 < 50) {
			return false;
		} else {
			arg0.aShortArray145[arg1] = (short) (Static553.anInt9261 + Static5.anIntArray4[0] * Static214.anInt3758 / local29);
			arg0.aShortArray144[arg1] = (short) (Static370.anInt6294 + Static581.anInt9592 * Static5.anIntArray4[1] / local29);
			arg0.aShortArray146[arg1] = (short) local29;
			return true;
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)Lclient!jc;")
	public static Class14_Sub21 method5019() {
		@Pc(8) Class14_Sub21 local8 = Static61.method1032();
		local8.method7735(0L);
		local8.method7690(Static187.aString36);
		local8.method7735(Static210.aLong121);
		local8.method7735(Static1.aLong189);
		local8.method7697(Static141.aBigInteger5, Static51.aBigInteger1);
		return local8;
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(BII)Z")
	public static boolean method5020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIII)V")
	public static void method5021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static132.anInt2080; local11++) {
			@Pc(17) Rectangle local17 = Class14_Sub33.aRectangleArray2[local11];
			if (local17.width + local17.x > arg2 && arg2 + arg3 > local17.x && local17.height + local17.y > arg0 && arg0 + arg1 > local17.y) {
				Static655.aBooleanArray27[local11] = true;
			}
		}
		Static140.method2127(arg2 + arg3, arg2, arg0 + arg1, arg0);
	}
}
