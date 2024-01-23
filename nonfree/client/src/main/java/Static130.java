import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "[Lclient!r;")
	public static Class73[] aClass73Array6;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public static int anInt2847 = 100;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_983 = Static200.method3116("Hier wechseln");

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!sb;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!uf;I)V")
	public static void method2188(@OriginalArg(0) Class101 arg0) {
		Static10.aClass101_1 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBIIII)V")
	public static void method2189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static200.anInt4273 || arg3 < Static141.anInt3163) {
			return;
		}
		@Pc(30) boolean local30;
		if (arg2 < Static214.anInt4572) {
			arg2 = Static214.anInt4572;
			local30 = false;
		} else if (arg2 <= anInt2847) {
			local30 = true;
		} else {
			arg2 = anInt2847;
			local30 = false;
		}
		@Pc(48) boolean local48;
		if (arg4 < Static214.anInt4572) {
			local48 = false;
			arg4 = Static214.anInt4572;
		} else if (anInt2847 >= arg4) {
			local48 = true;
		} else {
			local48 = false;
			arg4 = anInt2847;
		}
		if (arg0 >= Static141.anInt3163) {
			Static104.method1768(arg2, arg4, arg1, Static148.anIntArrayArray78[arg0++]);
		} else {
			arg0 = Static141.anInt3163;
		}
		if (Static200.anInt4273 >= arg3) {
			Static104.method1768(arg2, arg4, arg1, Static148.anIntArrayArray78[arg3--]);
		} else {
			arg3 = Static200.anInt4273;
		}
		@Pc(109) int local109;
		if (local30 && local48) {
			for (local109 = arg0; local109 <= arg3; local109++) {
				@Pc(153) int[] local153 = Static148.anIntArrayArray78[local109];
				local153[arg2] = local153[arg4] = arg1;
			}
		} else if (local30) {
			for (local109 = arg0; local109 <= arg3; local109++) {
				Static148.anIntArrayArray78[local109][arg2] = arg1;
			}
		} else if (local48) {
			for (local109 = arg0; local109 <= arg3; local109++) {
				Static148.anIntArrayArray78[local109][arg4] = arg1;
			}
			return;
		}
	}
}
