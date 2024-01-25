import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!og;")
	public static Class178 aClass178_11;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!s;")
	public static final Class217 aClass217_114 = new Class217(110, -2);

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "[Lclient!ei;")
	public static final Class10_Sub1_Sub4[] aClass10_Sub1_Sub4Array3 = new Class10_Sub1_Sub4[14];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([SI)[S")
	public static short[] method4077(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static468.method4352(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z")
	public static boolean method4078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static165.method5194(arg0, arg1) || Static445.method5935(arg1, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method4080() {
		@Pc(1) Class267 local1 = Static412.aClass267_77;
		synchronized (Static412.aClass267_77) {
			Static412.aClass267_77.method6011();
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
	public static int method4082() {
		return 6;
	}
}
