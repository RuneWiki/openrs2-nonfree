import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!ol", name = "L", descriptor = "Z")
	public static boolean aBoolean435;

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_151 = new Class40(101, 0);

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "Z")
	public static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)Lclient!oa;")
	public static Class121 method5383(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		return new da(arg0, arg1);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZIIZ)I")
	public static int method5384(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class6_Sub13 local10 = Static59.method44(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray171.length; local18++) {
			if (local10.anIntArray171[local18] >= 0 && local10.anIntArray171[local18] < Static295.aClass256_2.anInt7112) {
				@Pc(43) Class110 local43 = Static295.aClass256_2.method5924(local10.anIntArray171[local18]);
				@Pc(57) int local57 = local43.method2201(arg0, Static112.aClass307_1.method6811(arg0).anInt9461);
				if (arg2) {
					local16 += local10.anIntArray172[local18] * local57;
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}
}
