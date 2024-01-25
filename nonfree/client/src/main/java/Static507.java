import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public static int anInt8639 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!q;)V")
	public static void method7251(@OriginalArg(1) Class3_Sub4_Sub17 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method8848();
		for (@Pc(15) Class3_Sub4_Sub17 local15 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local15 != null; local15 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
			if (Static377.method5449(arg0.method7227(), local15.method7227())) {
				local7 = true;
				Static511.method7264(local15, arg0);
				break;
			}
		}
		if (-32526 != -32526) {
			anInt8639 = -31;
		}
		if (!local7) {
			Static555.aClass283_12.method7036(arg0);
		}
	}
}
