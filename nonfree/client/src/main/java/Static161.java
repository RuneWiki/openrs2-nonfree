import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
	public static int anInt3558;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_136 = new Class64(32, 8);

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "Lclient!db;")
	public static final Class64 aClass64_137 = new Class64(40, 0);

	@OriginalMember(owner = "client!gda", name = "j", descriptor = "[Lclient!vt;")
	public static final Class4_Sub50[] aClass4_Sub50Array1 = new Class4_Sub50[1024];

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
	public static void method3169() {
		Static300.anInt5730 = 0;
		Static354.aClass124_32.method3265();
		Static354.aClass124_32.method3275(Static512.aClass4_Sub18_3);
		Static300.anInt5730++;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(JI)V")
	public static void method3170(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
