import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public static int anInt10137;

	@OriginalMember(owner = "client!wia", name = "l", descriptor = "[I")
	public static final int[] anIntArray728 = new int[3];

	@OriginalMember(owner = "client!wia", name = "m", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!wia", name = "o", descriptor = "Lclient!dm;")
	public static Class78 aClass78_12 = null;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BZLclient!dm;)V")
	public static void method8478(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(23) int local23 = arg1.anInt1971 == 0 ? arg1.anInt1964 : arg1.anInt1971;
		@Pc(35) int local35 = arg1.anInt1961 == 0 ? arg1.anInt1991 : arg1.anInt1961;
		Static118.method2465(arg1.anInt1968, Static399.aClass78ArrayArray1[arg1.anInt1968 >> 16], arg0, local35, local23);
		if (arg1.aClass78Array9 != null) {
			Static118.method2465(arg1.anInt1968, arg1.aClass78Array9, arg0, local35, local23);
		}
		@Pc(68) Class2_Sub37 local68 = (Class2_Sub37) Static206.aClass222_14.method5468((long) arg1.anInt1968);
		if (local68 != null) {
			Static489.method7000(local68.anInt6848, arg0, local35, local23);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V")
	public static void method8479() {
		@Pc(12) int local12 = Static571.anInt9395;
		@Pc(14) int[] local14 = Static131.anIntArray213;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class11_Sub1_Sub1_Sub2_Sub1 local24 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local14[local16]];
			if (local24 != null && local24.anInt3249 > 0) {
				local24.anInt3249--;
				if (local24.anInt3249 == 0) {
					local24.aString33 = null;
				}
			}
		}
		for (@Pc(47) int local47 = 0; local47 < Static228.anInt4647; local47++) {
			@Pc(54) long local54 = (long) Static160.anIntArray256[local47];
			@Pc(60) Class2_Sub51 local60 = (Class2_Sub51) Static357.aClass222_23.method5468(local54);
			if (local60 != null) {
				@Pc(65) Class11_Sub1_Sub1_Sub2_Sub2 local65 = local60.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				if (local65.anInt3249 > 0) {
					local65.anInt3249--;
					if (local65.anInt3249 == 0) {
						local65.aString33 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IC)Z")
	public static boolean method8480(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static450.aCharArray8;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (local42 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)Z")
	public static boolean method8481(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
