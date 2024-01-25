import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array17;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[S")
	private static final short[] aShortArray108 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Z")
	public static boolean aBoolean682 = false;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "[S")
	private static final short[] aShortArray109 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[S")
	private static final short[] aShortArray111 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "[S")
	private static final short[] aShortArray110 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray17 = new short[][] { aShortArray111, aShortArray109, aShortArray110, aShortArray108 };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
	public static int method7841() {
		return Static634.anInt10113 == 1 ? Static584.anInt9612 : Static622.anInt9017;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ts;I)V")
	public static void method7842(@OriginalArg(0) Class41_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(15) Class5_Sub38 local15 = (Class5_Sub38) Static337.aClass335_25.method7766((long) arg0.anInt9469);
		if (local15 == null) {
			return;
		}
		if (local15.aClass5_Sub14_Sub1_3 != null) {
			Static229.aClass5_Sub14_Sub3_1.method2294(local15.aClass5_Sub14_Sub1_3);
			local15.aClass5_Sub14_Sub1_3 = null;
		}
		local15.method8829();
	}
}
