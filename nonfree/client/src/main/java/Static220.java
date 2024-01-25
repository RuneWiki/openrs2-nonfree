import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_66 = new Class11(65, -1);

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	public static int anInt3948 = -1;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray99 = new String[100];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZIZ)V")
	public static void method3634(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) Class2_Sub1 local14 = Static72.method4067(arg0, arg1);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray14.length; local19++) {
				local14.anIntArray14[local19] = -1;
				local14.anIntArray15[local19] = 0;
			}
		}
	}
}
