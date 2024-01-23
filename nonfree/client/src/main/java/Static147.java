import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!gn;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "[[Lclient!nf;")
	public static Class119[][] aClass119ArrayArray1;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	public static int anInt2715;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = new String[200];

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	public static int anInt2706 = -1;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	public static int anInt2712 = 0;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
	public static int[] anIntArray340 = new int[100];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lclient!oa;")
	public static Class124 method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2570; local13++) {
			@Pc(22) Class124 local22 = local7.aClass124Array2[local13];
			if ((local22.aLong114 >> 29 & 0x3L) == 2L && local22.anInt3416 == arg1 && local22.anInt3411 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jh;I)V")
	public static void method2287(@OriginalArg(0) Class84 arg0) {
		@Pc(7) Class115 local7 = null;
		try {
			@Pc(21) Class118 local21 = arg0.method1954("runescape");
			while (local21.anInt3187 == 0) {
				Static275.method4233(1L);
			}
			if (local21.anInt3187 == 1) {
				local7 = (Class115) local21.anObject3;
				@Pc(44) Class1_Sub18 local44 = Static65.method1079();
				local7.method2609(local44.aByteArray71, local44.anInt3911, 0);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local7 != null) {
				local7.method2608();
			}
		} catch (@Pc(62) Exception local62) {
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jj;II)Lclient!oc;")
	public static Class1_Sub2_Sub13 method2289(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(35) Class1_Sub2_Sub13 local35 = new Class1_Sub2_Sub13(arg1, arg0.method3101(), arg0.method3101(), arg0.method3074(), arg0.method3074(), arg0.method3122() == 1, arg0.method3122());
		@Pc(39) int local39 = arg0.method3122();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			local35.aClass69_21.method1628(new Class1_Sub23(arg0.method3122(), arg0.method3122(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107()));
		}
		local35.method2809();
		return local35;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZ)V")
	public static void method2290(@OriginalArg(2) boolean arg0) {
		Static234.anInt4892 = 22050;
		Static129.aBoolean297 = arg0;
		Static146.anInt2691 = 2;
	}
}
