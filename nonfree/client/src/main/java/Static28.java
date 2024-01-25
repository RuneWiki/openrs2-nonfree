import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!pe;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!sh;")
	public static Class313 aClass313_1;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[Lclient!hg;")
	public static final Class130[] aClass130Array1 = new Class130[14];

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!tr;")
	public static final Class332 aClass332_1 = new Class332();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	public static void method685(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub6_Sub6 local13 = Static139.method3119(arg0, 2);
		local13.method3093();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!kf;)I")
	public static int method687(@OriginalArg(1) Class177 arg0) {
		if (Static118.aClass177_1 == arg0) {
			return 5890;
		} else if (arg0 == Static360.aClass177_5) {
			return 34167;
		} else if (Static154.aClass177_4 == arg0) {
			return 34168;
		} else if (Static165.aClass177_3 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
