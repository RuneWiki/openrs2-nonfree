import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[Lclient!kj;")
	public static Class176[] aClass176Array1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_14 = new Class364(13, 8);

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[F")
	public static final float[] aFloatArray42 = new float[4];

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt4755 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method3819(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static256.aClass127Array3 != Static108.aClass127Array5) {
			@Pc(12) int local12 = Static420.aClass127Array6[arg1].method7860(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class127 local19 = Static420.aClass127Array6[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7860(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method7863(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
