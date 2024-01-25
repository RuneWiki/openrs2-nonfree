import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	public static int anInt7983;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_206 = new Class381(18, 7);

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	public static int anInt7981 = 0;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_161 = new Class156(121, 4);

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[50][];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILclient!nq;I)V")
	public static void method6906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub41 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass5_Sub36_Sub2_1.method7287(arg0);
		arg2.aClass5_Sub36_Sub2_1.method7277(arg3);
		arg2.aClass5_Sub36_Sub2_1.method7277(arg1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!oi;)V")
	public static void method6907(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class4_Sub1_Sub1_Sub2_Sub2) {
			@Pc(35) Class4_Sub1_Sub1_Sub2_Sub2 local35 = (Class4_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local35.aClass105_1 != null) {
				Static76.method1267(local35, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 != local35.aByte139);
			}
		} else if (arg0 instanceof Class4_Sub1_Sub1_Sub2_Sub1) {
			@Pc(18) Class4_Sub1_Sub1_Sub2_Sub1 local18 = (Class4_Sub1_Sub1_Sub2_Sub1) arg0;
			Static367.method5342(local18, local18.aByte139 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139);
		}
	}
}
