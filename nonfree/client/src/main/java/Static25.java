import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt632;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!df;")
	public static Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	public static int anInt634;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public static int anInt635;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!kc;")
	private static Class36 aClass36_346 = Static14.method2017("Unable to connect)3");

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static int anInt633 = 0;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_347 = aClass36_346;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
	public static int[] anIntArray49 = new int[25];

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!kc;")
	public static Class36 aClass36_348 = aClass36_346;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method519() {
		if (Static52.aClass32_1 != null) {
			@Pc(3) Class32 local3 = Static52.aClass32_1;
			synchronized (Static52.aClass32_1) {
				Static52.aClass32_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method520() {
		Static62.aClass22_24.method716();
		Static55.aClass22_37.method716();
		Static103.aClass22_33.method716();
		Static118.aClass22_40.method716();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[Lclient!ed;IIIILclient!ed;III)Lclient!ed;")
	public static Class2_Sub1_Sub6 method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub6[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub1_Sub6 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 > arg10 || arg6 < arg0 || arg8 <= arg10 || arg5 <= arg6) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
			@Pc(31) Class2_Sub1_Sub6 local31 = arg3[local25];
			if (local31 != null && local31.anInt669 == arg4 && !Static81.method1492(local31) && local31 != arg7) {
				@Pc(54) int local54 = arg9 + local31.anInt722 - arg1;
				@Pc(61) int local61 = arg0 + local31.anInt685 - arg2;
				if (local31.anInt676 == 0) {
					@Pc(87) Class2_Sub1_Sub6 local87 = method521(local61, local31.anInt675, local31.anInt716, arg3, local31.anInt680, local31.anInt660 + local61, arg6, arg7, local31.anInt677 + local54, local54, arg10);
					if (local87 != null) {
						return local87;
					}
					if (local31.aClass2_Sub1_Sub6Array1 != null) {
						local87 = method521(local61, local31.anInt675, local31.anInt716, local31.aClass2_Sub1_Sub6Array1, local31.anInt680, local31.anInt660 + local61, arg6, arg7, local31.anInt677 + local54, local54, arg10);
						if (local87 != null) {
							return local87;
						}
					}
				}
				if (Static68.method1174(Static67.method1163(local31)) && local54 <= arg10 && arg6 >= local61 && local54 + local31.anInt677 > arg10 && local61 + local31.anInt660 > arg6) {
					return local31;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method522() {
		anIntArray48 = null;
		aClass36_346 = null;
		aClass36_348 = null;
		aFontMetrics1 = null;
		aClass2_Sub1_Sub1_Sub2_3 = null;
		anIntArray49 = null;
		aClass36_347 = null;
		RuntimeException_Sub1.anIntArray47 = null;
	}
}
