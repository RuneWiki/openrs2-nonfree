import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString27 = "slide:";

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static int[] anIntArray84 = new int[50];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)J")
	public static long method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass67_1 == null ? 0L : local7.aClass67_1.aLong80;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!oc;")
	public static Class120 method639(@OriginalArg(0) int arg0) {
		@Pc(10) Class120 local10 = (Class120) Static109.aClass172_20.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static11.aClass22_5.method665(Static68.method1445(arg0), Static226.method3573(arg0));
		local10 = new Class120();
		local10.anInt3876 = arg0;
		if (local25 != null) {
			local10.method3155(new Class4_Sub24(local25));
		}
		Static109.aClass172_20.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method641() {
		Static175.aClass4_Sub24_Sub1_1.method3123(105);
		for (@Pc(18) Class4_Sub30 local18 = (Class4_Sub30) Static167.aClass163_25.method4192(); local18 != null; local18 = (Class4_Sub30) Static167.aClass163_25.method4183()) {
			if (local18.anInt5201 == 0) {
				Static157.method262(true, local18);
			}
		}
		if (Static44.aClass97_6 != null) {
			Static178.method2927(Static44.aClass97_6);
			Static44.aClass97_6 = null;
		}
	}
}
