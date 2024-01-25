import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int anInt7842;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public static int anInt7845 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
	public static int method7013(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return arg0 & ~local37;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V")
	public static void method7014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static254.anInt4901; local3++) {
			@Pc(9) Rectangle local9 = Class33.aRectangleArray1[local3];
			if (arg2 < local9.width + local9.x && arg0 + arg2 > local9.x && local9.height + local9.y > arg1 && local9.y < arg3 + arg1) {
				Static561.aBooleanArray58[local3] = true;
			}
		}
		Static220.method4070(arg3 + arg1, arg1, arg2, arg0 + arg2);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public static void method7015() {
		@Pc(1) Class22 local1 = Static290.aClass22_36;
		synchronized (Static290.aClass22_36) {
			Static290.aClass22_36.method461();
		}
	}
}
