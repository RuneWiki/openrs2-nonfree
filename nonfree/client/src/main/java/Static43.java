import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!be;")
	public static Class2_Sub5_Sub1 aClass2_Sub5_Sub1_1;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!mn;")
	public static Class115 aClass115_5;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt1054 = 100;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Z")
	public static boolean aBoolean77 = true;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qh;BIII)V")
	public static void method830(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) Static238.aClass1_24.method13(); local15 != null; local15 = (Class2_Sub23) Static238.aClass1_24.method9()) {
			if (arg2 == local15.anInt4653 && local15.anInt4650 == arg1 * 128 && local15.anInt4651 == arg3 * 128 && local15.aClass143_1.anInt4488 == arg0.anInt4488) {
				if (local15.aClass2_Sub5_Sub2_1 != null) {
					aClass2_Sub5_Sub1_1.method404(local15.aClass2_Sub5_Sub2_1);
					local15.aClass2_Sub5_Sub2_1 = null;
				}
				if (local15.aClass2_Sub5_Sub2_2 != null) {
					aClass2_Sub5_Sub1_1.method404(local15.aClass2_Sub5_Sub2_2);
					local15.aClass2_Sub5_Sub2_2 = null;
				}
				local15.method4926();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)[F")
	public static float[] method833() {
		@Pc(7) float local7 = Static117.method2156() + Static117.method2150();
		@Pc(9) int local9 = Static117.method2151();
		Static29.aFloatArray4[3] = 1.0F;
		@Pc(22) float local22 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(40) float local40 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(42) float local42 = 0.58823526F;
		Static29.aFloatArray4[1] = local7 * local42 * Static191.aFloatArray3[1] * local40;
		@Pc(61) float local61 = (float) (local9 & 0xFF) / 255.0F;
		Static29.aFloatArray4[2] = local7 * Static191.aFloatArray3[2] * local61 * local42;
		Static29.aFloatArray4[0] = local42 * Static191.aFloatArray3[0] * local22 * local7;
		return Static29.aFloatArray4;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBII)V")
	public static void method835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static157.anInt3299 = -1;
		Static61.anInt2999 = Static52.anInt1205 * arg3 / arg0;
		Static34.anInt1968 = -1;
		Static219.anInt4587 = Static142.anInt3081 * arg2 / arg1;
		Static133.method2322();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!wm;Ljava/lang/String;)I")
	public static int method836(@OriginalArg(1) Class2_Sub26 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt5328;
		@Pc(10) byte[] local10 = Static90.method1693(arg1);
		arg0.method4237(local10.length);
		arg0.anInt5328 += Static183.aClass124_1.method3176(local10.length, 0, arg0.aByteArray72, local10, arg0.anInt5328);
		return arg0.anInt5328 - local6;
	}
}
