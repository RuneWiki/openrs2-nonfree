import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public static int anInt349;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_16 = new Class56(94, 0);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method317(@OriginalArg(0) int arg0) {
		Static164.anInt3319 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static155.anInt3254; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static39.anInt747; local6++) {
				if (Static309.aClass299ArrayArrayArray3[arg0][local3][local6] == null) {
					Static309.aClass299ArrayArrayArray3[arg0][local3][local6] = new Class299(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method318() {
		Static168.anIntArray173 = null;
		Static579.anIntArray605 = null;
		Static63.anIntArray65 = null;
		Static59.aBoolean114 = false;
		Static535.anIntArray564 = null;
		Static579.anIntArray606 = null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLjava/lang/String;I)Lclient!nk;")
	public static Class123 method319(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class123 local8;
		try {
			local8 = (Class123) Class.forName("Class123_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class123_Sub1();
		}
		local8.anInt6491 = arg1;
		local8.aString47 = arg0;
		return local8;
	}
}
