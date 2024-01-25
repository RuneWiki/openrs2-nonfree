import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_112 = new Class184(13, 0);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBII)I")
	public static int method2726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static281.anInt5171 < 100) {
			return -2;
		}
		@Pc(21) int local21 = -2;
		@Pc(23) int local23 = Integer.MAX_VALUE;
		@Pc(28) int local28 = arg1 - Static210.anInt7505;
		@Pc(32) int local32 = arg2 - Static210.anInt7496;
		for (@Pc(37) Class3_Sub8 local37 = (Class3_Sub8) Static210.aClass229_48.method5328(); local37 != null; local37 = (Class3_Sub8) Static210.aClass229_48.method5325()) {
			if (local37.anInt1157 == arg0) {
				@Pc(49) int local49 = local37.anInt1153;
				@Pc(52) int local52 = local37.anInt1154;
				@Pc(62) int local62 = Static210.anInt7496 + local52 | local49 + Static210.anInt7505 << 14;
				@Pc(83) int local83 = (local28 - local49) * (-local49 + local28) + (local32 - local52) * (local32 + -local52);
				if (local21 < 0 || local23 > local83) {
					local21 = local62;
					local23 = local83;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	public static void method2728(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(11, arg0);
		local8.method1563();
	}
}
