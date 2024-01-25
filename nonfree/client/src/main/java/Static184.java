import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public static int anInt3595;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_8 = new Class48(2, 8);

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
	public static int anInt3598 = -1;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)I")
	public static int method3077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 / arg1;
		@Pc(21) int local21 = arg2 & arg1 - 1;
		@Pc(25) int local25 = arg0 / arg1;
		@Pc(31) int local31 = arg1 - 1 & arg0;
		@Pc(36) int local36 = Static201.method3267(local25, local15);
		@Pc(43) int local43 = Static201.method3267(local25, local15 + 1);
		@Pc(50) int local50 = Static201.method3267(local25 + 1, local15);
		@Pc(59) int local59 = Static201.method3267(local25 + 1, local15 + 1);
		@Pc(66) int local66 = Static32.method461(arg1, local21, local36, local43);
		@Pc(73) int local73 = Static32.method461(arg1, local21, local50, local59);
		return Static32.method461(arg1, local31, local66, local73);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)[Lclient!vha;")
	public static Class368[] method3078() {
		return new Class368[] { Static305.aClass368_3, Static306.aClass368_4, Static79.aClass368_1 };
	}
}
