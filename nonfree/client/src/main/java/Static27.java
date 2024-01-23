import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "Lclient!th;")
	public static Class168 aClass168_148;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	public static int anInt4398;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "F")
	public static float aFloat44 = 128.0F;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "Z")
	public static boolean aBoolean273 = true;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	public static int[] anIntArray393 = new int[500];

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[5];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZ)I")
	public static int method3226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local8 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local8.anIntArray164.length; local21++) {
			if (local8.anIntArray164[local21] >= 0 && Static58.anInt1268 > local8.anIntArray164[local21]) {
				@Pc(52) Class57 local52 = Static56.method1050(local8.anIntArray164[local21]);
				if (local52.aClass186_6 != null) {
					@Pc(66) Class1_Sub17 local66 = (Class1_Sub17) local52.aClass186_6.method4570((long) arg1);
					if (local66 != null) {
						if (arg2) {
							local19 += local8.anIntArray165[local21] * local66.anInt3669;
						} else {
							local19 += local66.anInt3669;
						}
					}
				}
			}
		}
		return local19;
	}
}
