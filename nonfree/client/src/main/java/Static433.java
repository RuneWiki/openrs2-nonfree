import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
	public static boolean aBoolean315;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!w", name = "D", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_79 = new Class231("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZB)V")
	public static void method3962(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class6_Sub14 local6 = (Class6_Sub14) Static329.aClass88_40.method1882(); local6 != null; local6 = (Class6_Sub14) Static329.aClass88_40.method1891()) {
			if (local6.aClass6_Sub5_Sub4_1 != null) {
				Static371.aClass6_Sub5_Sub2_2.method2168(local6.aClass6_Sub5_Sub4_1);
				local6.aClass6_Sub5_Sub4_1 = null;
			}
			if (local6.aClass6_Sub5_Sub4_2 != null) {
				Static371.aClass6_Sub5_Sub2_2.method2168(local6.aClass6_Sub5_Sub4_2);
				local6.aClass6_Sub5_Sub4_2 = null;
			}
			local6.method5977();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(59) Class6_Sub14 local59 = (Class6_Sub14) Static170.aClass88_18.method1882(); local59 != null; local59 = (Class6_Sub14) Static170.aClass88_18.method1891()) {
			if (local59.aClass6_Sub5_Sub4_1 != null) {
				Static371.aClass6_Sub5_Sub2_2.method2168(local59.aClass6_Sub5_Sub4_1);
				local59.aClass6_Sub5_Sub4_1 = null;
			}
			local59.method5977();
		}
		for (@Pc(86) Class6_Sub14 local86 = (Class6_Sub14) Static417.aClass137_35.method3181(); local86 != null; local86 = (Class6_Sub14) Static417.aClass137_35.method3182()) {
			if (local86.aClass6_Sub5_Sub4_1 != null) {
				Static371.aClass6_Sub5_Sub2_2.method2168(local86.aClass6_Sub5_Sub4_1);
				local86.aClass6_Sub5_Sub4_1 = null;
			}
			local86.method5977();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	public static void method3964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(14) int local14 = arg1 - arg4;
		if (local9 == 0) {
			if (local14 != 0) {
				Static386.method5318(arg4, arg1, arg3, arg0);
			}
		} else if (local14 == 0) {
			Static316.method5793(arg3, arg4, arg0, arg2);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local9;
			@Pc(52) int local52 = arg4 - (arg0 * local43 >> 12);
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (arg2 < Static81.anInt1574) {
				local64 = Static81.anInt1574;
				local72 = local52 + (local43 * Static81.anInt1574 >> 12);
			} else if (Static99.anInt1808 < arg2) {
				local64 = Static99.anInt1808;
				local72 = local52 + (local43 * Static99.anInt1808 >> 12);
			} else {
				local64 = arg2;
				local72 = arg1;
			}
			@Pc(99) int local99;
			@Pc(107) int local107;
			if (arg0 < Static81.anInt1574) {
				local99 = Static81.anInt1574;
				local107 = local52 + (local43 * Static81.anInt1574 >> 12);
			} else if (arg0 > Static99.anInt1808) {
				local99 = Static99.anInt1808;
				local107 = local52 + (Static99.anInt1808 * local43 >> 12);
			} else {
				local107 = arg4;
				local99 = arg0;
			}
			if (local72 < Static97.anInt1796) {
				local72 = Static97.anInt1796;
				local64 = (Static97.anInt1796 - local52 << 12) / local43;
			} else if (local72 > Static85.anInt1636) {
				local72 = Static85.anInt1636;
				local64 = (Static85.anInt1636 - local52 << 12) / local43;
			}
			if (Static97.anInt1796 > local107) {
				local107 = Static97.anInt1796;
				local99 = (Static97.anInt1796 - local52 << 12) / local43;
			} else if (Static85.anInt1636 < local107) {
				local107 = Static85.anInt1636;
				local99 = (Static85.anInt1636 - local52 << 12) / local43;
			}
			Static369.method5137(arg3, local64, local107, local72, local99);
		}
	}
}
