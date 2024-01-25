import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[Lclient!eo;B)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(1) Class68[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(13) Class68 local13 = arg1[local1];
			if (local13 != null) {
				if (local13.anInt2182 == 0) {
					if (local13.aClass68Array2 != null) {
						method3809(arg0, local13.aClass68Array2);
					}
					@Pc(37) Class3_Sub40 local37 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local13.anInt2177);
					if (local37 != null) {
						Static289.method4240(local37.anInt6668, arg0);
					}
				}
				@Pc(53) Class3_Sub20 local53;
				if (arg0 == 0 && local13.anObjectArray28 != null) {
					local53 = new Class3_Sub20();
					local53.anObjectArray35 = local13.anObjectArray28;
					local53.aClass68_4 = local13;
					Static272.method4044(local53);
				}
				if (arg0 == 1 && local13.anObjectArray30 != null) {
					if (local13.anInt2187 >= 0) {
						@Pc(81) Class68 local81 = Static321.method4661(local13.anInt2177);
						if (local81 == null || local81.aClass68Array2 == null || local13.anInt2187 >= local81.aClass68Array2.length || local13 != local81.aClass68Array2[local13.anInt2187]) {
							continue;
						}
					}
					local53 = new Class3_Sub20();
					local53.aClass68_4 = local13;
					local53.anObjectArray35 = local13.anObjectArray30;
					Static272.method4044(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I")
	public static int method3812() {
		return 16;
	}
}
