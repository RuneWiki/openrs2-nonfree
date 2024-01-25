import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
	public static int anInt5655;

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_130 = new Class40(55, -2);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)V")
	public static void method4860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub1_Sub5 local15 = Static77.method1176(arg1, 13);
		local15.method776();
		local15.anInt972 = arg0;
	}
}
