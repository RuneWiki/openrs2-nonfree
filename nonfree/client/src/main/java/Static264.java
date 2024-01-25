import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	public static int anInt5417;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Z")
	public static boolean aBoolean487 = true;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "[Lclient!tm;")
	public static final Class189[] aClass189Array1 = new Class189[8];

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	public static int anInt5425 = -1;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!on;BI)V")
	public static void method4796(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class77 local13 = arg1.method4042(Static147.aClass4_2);
		if (local13 == null) {
			return;
		}
		Static147.aClass4_2.method4252(arg2, arg0, arg1.anInt4468 + arg2, arg1.anInt4414 + arg0);
		if (Static260.anInt5271 < 3) {
			Static253.aClass31_141.method4385((float) arg2 + (float) arg1.anInt4468 / 2.0F, (float) arg1.anInt4414 / 2.0F + (float) arg0, ((int) -Static92.aFloat28 & 0x3FFF) << 2, local13, arg2, arg0);
		} else {
			Static147.aClass4_2.method4269(local13, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!tq;B)V")
	public static void method4800(@OriginalArg(0) Class191 arg0) {
		Static192.aClass191_122 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	public static void method4804() {
		@Pc(5) Class119 local5 = Static162.aClass119_99;
		synchronized (Static162.aClass119_99) {
			Static162.aClass119_99.method3312();
		}
		local5 = Static217.aClass119_128;
		synchronized (Static217.aClass119_128) {
			Static217.aClass119_128.method3312();
		}
	}
}
