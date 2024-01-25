import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!vja", name = "F", descriptor = "I")
	public static int anInt10660;

	@OriginalMember(owner = "client!vja", name = "C", descriptor = "I")
	public static int anInt10648 = 0;

	@OriginalMember(owner = "client!vja", name = "E", descriptor = "Lclient!qga;")
	public static Class299 aClass299_12 = null;

	@OriginalMember(owner = "client!vja", name = "A", descriptor = "I")
	public static int anInt10662 = 0;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method9101(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class14_Sub2_Sub9 local16 = Static499.method7527((long) arg0, 3);
		local16.method4004();
		local16.aString55 = arg1;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII)Lclient!vv;")
	public static Class14_Sub54 method9104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class14_Sub54 local5 = null;
		if (arg1 == 0) {
			local5 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static617.aClass251_254);
		}
		if (arg1 == 1) {
			local5 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static67.aClass251_34);
		}
		local5.aClass14_Sub21_Sub2_2.method7737(Static89.aClass207_3.method5068(82) ? 1 : 0);
		local5.aClass14_Sub21_Sub2_2.method7705(Static550.anInt9242 + arg0);
		local5.aClass14_Sub21_Sub2_2.method7705(arg2 + Static36.anInt617);
		Static483.aBoolean590 = false;
		Static60.anInt998 = arg2;
		Static605.anInt7003 = arg0;
		Static428.method6435();
		return local5;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method9108(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static652.aBoolean739) {
			try {
				@Pc(29) Class191 local29 = (Class191) Class.forName("qr").getDeclaredConstructor().newInstance();
				local29.method7608(arg0);
				return local29;
			} catch (@Pc(36) Throwable local36) {
				Static652.aBoolean739 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I[I[I)V")
	public static void method9109(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static218.aByteArrayArrayArray10 = null;
			Static654.anIntArray571 = null;
			Static232.anIntArray227 = null;
			return;
		}
		Static232.anIntArray227 = arg0;
		Static654.anIntArray571 = new int[arg0.length];
		Static218.aByteArrayArrayArray10 = new byte[arg0.length][][];
		for (@Pc(31) int local31 = 0; local31 < Static232.anIntArray227.length; local31++) {
			Static218.aByteArrayArrayArray10[local31] = new byte[arg1[local31]][];
		}
	}
}
