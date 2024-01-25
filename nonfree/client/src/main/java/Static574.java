import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt9473;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_178 = new Class136(67, 12);

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!cda;")
	public static final Class49 aClass49_6 = new Class49();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method8137(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static299.aClass40Array1 == Static327.aClass40Array2) {
			return;
		}
		@Pc(10) int local10 = Static492.aClass40Array3[arg1].method8447(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class40 local23 = Static492.aClass40Array3[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8447(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
