import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!pc;")
	public static Class188 aClass188_42;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	public static int anInt2938 = 0;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!cr;")
	public static Class41 aClass41_6 = null;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_39 = new Class44(42, 4);

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean263 = true;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V")
	public static void method2330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		@Pc(22) int local22 = -1;
		Static49.method990(Static277.anIntArrayArray40[arg0], arg3 + arg2, -arg2 + arg3, arg1);
		while (local15 < local17) {
			local22 += 2;
			local20 += local22;
			local15++;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(59) int[] local59 = Static277.anIntArrayArray40[local17 + arg0];
				@Pc(66) int[] local66 = Static277.anIntArrayArray40[arg0 - local17];
				@Pc(70) int local70 = arg3 + local15;
				@Pc(75) int local75 = arg3 - local15;
				Static49.method990(local59, local70, local75, arg1);
				Static49.method990(local66, local70, local75, arg1);
			}
			@Pc(91) int local91 = local17 + arg3;
			@Pc(96) int local96 = arg3 - local17;
			@Pc(102) int[] local102 = Static277.anIntArrayArray40[local15 + arg0];
			@Pc(108) int[] local108 = Static277.anIntArrayArray40[arg0 - local15];
			Static49.method990(local102, local91, local96, arg1);
			Static49.method990(local108, local91, local96, arg1);
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIII)V")
	public static void method2331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static66.anInt1689; local7++) {
			@Pc(13) Rectangle local13 = Class2_Sub20_Sub1.aRectangleArray2[local7];
			if (arg0 < local13.x + local13.width && arg0 + arg1 > local13.x && local13.y + local13.height > arg2 && arg3 + arg2 > local13.y) {
				Static10.aBooleanArray5[local7] = true;
			}
		}
	}
}
