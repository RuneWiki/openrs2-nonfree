import java.awt.Image;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "[[[Lclient!fa;")
	private static Class1_Sub9[][][] aClass1_Sub9ArrayArrayArray1;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!kc", name = "fb", descriptor = "Lclient!jb;")
	public static Class28 aClass28_42;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!sc;")
	private static Class107 aClass107_645 = Static231.method3737("Started 3d library");

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Lclient!sc;")
	public static Class107 aClass107_646 = Static231.method3737("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Lclient!sc;")
	private static Class107 aClass107_647 = Static231.method3737("Loaded wordpack");

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "Lclient!sc;")
	private static Class107 aClass107_649 = Static231.method3737(" is already on your ignore list)3");

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "Lclient!sc;")
	public static Class107 aClass107_648 = aClass107_649;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "Lclient!sc;")
	public static Class107 aClass107_650 = Static231.method3737("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_651 = aClass107_645;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_652 = aClass107_647;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	public static void method1900() {
		for (@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static157.aClass120_18.method3564(); local10 != null; local10 = (Class1_Sub21) Static157.aClass120_18.method3561()) {
			if (local10.aBoolean300) {
				local10.method2527();
			}
		}
		for (@Pc(32) Class1_Sub21 local32 = (Class1_Sub21) Static82.aClass120_9.method3564(); local32 != null; local32 = (Class1_Sub21) Static82.aClass120_9.method3561()) {
			if (local32.aBoolean300) {
				local32.method2527();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!sc;)Z")
	public static boolean method1901(@OriginalArg(1) Class107 arg0) {
		try {
			@Pc(10) int local10 = arg0.method3073();
			if (local10 == -1) {
				return false;
			}
			@Pc(21) Class107 local21 = arg0.method3104(0, local10);
			@Pc(28) Class107 local28 = arg0.method3084(local10 + 1);
			@Pc(31) MessageDigest local31 = MessageDigest.getInstance("SHA");
			local31.reset();
			local31.update(local21.method3116());
			@Pc(46) byte[] local46 = local31.digest();
			@Pc(50) byte[] local50 = local28.method3098();
			@Pc(55) Class1_Sub26 local55 = new Class1_Sub26(5000);
			local55.method2993(local50.length, local50);
			local55.anInt4021 = 0;
			local55.method2953(Static22.aBigInteger1, Static133.aBigInteger2);
			if (local55.aByteArray52[0] != 1) {
				return false;
			}
			for (@Pc(82) int local82 = 0; local82 < 20; local82++) {
				if (local55.aByteArray52[local82 + 1] != local46[local82]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(105) Exception local105) {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!sc;I)V")
	public static void method1903(@OriginalArg(1) Class107 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub19 local8 = Static166.method3214(arg1, 2);
		local8.method3691();
		local8.aClass107_1333 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static99.anInt915 && Static38.anInt784 >= arg0 && arg6 >= Static99.anInt915 && Static38.anInt784 >= arg6 && arg4 >= Static99.anInt915 && arg4 <= Static38.anInt784 && arg7 >= Static99.anInt915 && Static38.anInt784 >= arg7 && arg8 >= Static223.anInt4869 && Static47.anInt1057 >= arg8 && arg3 >= Static223.anInt4869 && Static47.anInt1057 >= arg3 && Static223.anInt4869 <= arg1 && arg1 <= Static47.anInt1057 && Static223.anInt4869 <= arg2 && arg2 <= Static47.anInt1057) {
			Static96.method1622(arg8, arg1, arg6, arg3, arg0, arg7, arg2, arg4, arg5);
		} else {
			Static228.method3720(arg5, arg4, arg1, arg7, arg0, arg3, arg8, arg2, arg6);
		}
	}
}
