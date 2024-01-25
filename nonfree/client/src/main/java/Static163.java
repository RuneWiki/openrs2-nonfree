import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "[Lclient!d;")
	public static Class52[] aClass52Array4;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_170 = new Class133(59, -1);

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_125 = new Class158(32, -1);

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!bg;")
	public static final Class29 aClass29_5 = new Class29(0);

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public static int anInt9272 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!qf;ZII)V")
	public static void method7661(@OriginalArg(0) Class245 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class10 local8 = arg0.method6006(Static121.aClass5_7);
		if (local8 == null) {
			return;
		}
		Static121.aClass5_7.ca(arg2, arg1, arg0.anInt7249 + arg2, arg1 + arg0.anInt7229);
		if (Static262.anInt5487 >= 3) {
			Static121.aClass5_7.L(-16777216, local8, arg2, arg1);
		} else {
			Static386.aClass119_21.method6679((float) arg2 + (float) arg0.anInt7249 / 2.0F, (float) arg0.anInt7229 / 2.0F + (float) arg1, ((int) -Static487.aFloat258 & 0x3FFF) << 2, local8, arg2, arg1);
		}
	}
}
