import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "Lclient!pn;")
	public static Class4_Sub21_Sub4 aClass4_Sub21_Sub4_5;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "[[S")
	public static short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
	public static int anInt5164;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
	public static int anInt5162 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ufa;I)V")
	public static void method4013(@OriginalArg(0) Class21_Sub1_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class21_Sub1_Sub1_Sub1_Sub1) {
			@Pc(14) Class21_Sub1_Sub1_Sub1_Sub1 local14 = (Class21_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local14.aClass51_1 != null) {
				Static546.method7655(local14.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, local14);
				return;
			}
		} else if (arg0 instanceof Class21_Sub1_Sub1_Sub1_Sub2) {
			@Pc(35) Class21_Sub1_Sub1_Sub1_Sub2 local35 = (Class21_Sub1_Sub1_Sub1_Sub2) arg0;
			Static222.method3617(local35, local35.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127);
		} else {
			return;
		}
	}
}
