import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!pn;")
	public static final Class249 aClass249_8 = new Class249();

	@OriginalMember(owner = "client!u", name = "v", descriptor = "I")
	public static int anInt8338 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class6_Sub1_Sub5 local16 = Static77.method1176(arg0, 16);
		local16.method776();
		local16.anInt972 = arg1;
	}
}
