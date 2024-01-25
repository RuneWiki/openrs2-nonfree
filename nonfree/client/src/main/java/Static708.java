import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static708 {

	@OriginalMember(owner = "client!wga", name = "y", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
	public static int anInt11073 = 0;

	@OriginalMember(owner = "client!wga", name = "t", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_130 = new Class286(16, 7);

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
	public static int anInt11077 = 0;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBILclient!lb;)Lclient!saa;")
	public static Class330 method9245(@OriginalArg(2) int arg0, @OriginalArg(3) Class221 arg1) {
		@Pc(9) byte[] local9 = arg1.method5089(0, arg0);
		return local9 == null ? null : new Class330(local9);
	}
}
