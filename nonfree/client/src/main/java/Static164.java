import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public static int anInt6595 = 100;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
	public static void method5050(@OriginalArg(0) int arg0) {
		if (Static218.anIntArray425 == null || Static218.anIntArray425.length < arg0) {
			Static218.anIntArray425 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBIZ)I")
	public static int method5053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub46 local8 = Static114.method1848(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray751.length; local27++) {
				if (local8.anIntArray750[local27] == arg0) {
					local19 += local8.anIntArray751[local27];
				}
			}
			return local19;
		}
	}
}
