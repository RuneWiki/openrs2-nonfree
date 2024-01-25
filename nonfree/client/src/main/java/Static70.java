import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
	public static int anInt570;

	@OriginalMember(owner = "client!cs", name = "T", descriptor = "Lclient!kea;")
	public static Class161 aClass161_6;

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
	public static int anInt567 = 0;

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_5 = new Class125(4);

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "[I")
	public static final int[] anIntArray102 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
	public static int anInt577 = 0;

	@OriginalMember(owner = "client!cs", name = "R", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_17 = new Class133(101, -1);

	@OriginalMember(owner = "client!cs", name = "S", descriptor = "[I")
	public static final int[] anIntArray103 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII)V")
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(15) int local15 = arg3 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static317.method5133(arg0, arg1, arg2, arg3);
			}
		} else if (local15 == 0) {
			Static490.method7168(arg0, arg1, arg2, arg4);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg2 - (local48 * arg1 >> 12);
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (arg1 < Static190.anInt4314) {
				local66 = Static190.anInt4314;
				local74 = (local48 * Static190.anInt4314 >> 12) + local57;
			} else if (arg1 <= Static145.anInt2941) {
				local74 = arg2;
				local66 = arg1;
			} else {
				local66 = Static145.anInt2941;
				local74 = (local48 * Static145.anInt2941 >> 12) + local57;
			}
			@Pc(103) int local103;
			@Pc(105) int local105;
			if (arg4 < Static190.anInt4314) {
				local103 = Static190.anInt4314;
				local105 = local57 + (Static190.anInt4314 * local48 >> 12);
			} else if (Static145.anInt2941 >= arg4) {
				local103 = arg4;
				local105 = arg3;
			} else {
				local105 = (local48 * Static145.anInt2941 >> 12) + local57;
				local103 = Static145.anInt2941;
			}
			if (Static269.anInt5577 > local105) {
				local103 = (Static269.anInt5577 - local57 << 12) / local48;
				local105 = Static269.anInt5577;
			} else if (Static81.anInt1788 < local105) {
				local105 = Static81.anInt1788;
				local103 = (Static81.anInt1788 - local57 << 12) / local48;
			}
			if (Static269.anInt5577 > local74) {
				local74 = Static269.anInt5577;
				local66 = (Static269.anInt5577 - local57 << 12) / local48;
			} else if (local74 > Static81.anInt1788) {
				local66 = (Static81.anInt1788 - local57 << 12) / local48;
				local74 = Static81.anInt1788;
			}
			Static39.method945(local103, local105, arg0, local66, local74);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZI)Z")
	public static boolean method612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static504.method7747(arg0, arg1) | (arg1 & 0x60000) != 0 || Static39.method946(arg1, arg0);
	}
}
