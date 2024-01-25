import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[S")
	private static final short[] aShortArray7 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "[S")
	private static final short[] aShortArray8 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[S")
	private static final short[] aShortArray9 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "[S")
	private static final short[] aShortArray10 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray7, aShortArray8, aShortArray9, aShortArray10 };

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean50 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ft;)V")
	public static void method609(@OriginalArg(1) Class28_Sub1_Sub4_Sub2_Sub1 arg0) {
		for (@Pc(15) Class5_Sub52 local15 = (Class5_Sub52) Static195.aClass114_21.method2805(); local15 != null; local15 = (Class5_Sub52) Static195.aClass114_21.method2814()) {
			if (arg0 == local15.aClass28_Sub1_Sub4_Sub2_Sub1_2) {
				if (local15.aClass5_Sub17_Sub2_2 != null) {
					Static245.aClass5_Sub17_Sub4_2.method6184(local15.aClass5_Sub17_Sub2_2);
					local15.aClass5_Sub17_Sub2_2 = null;
				}
				local15.method9052();
				return;
			}
		}
	}
}
