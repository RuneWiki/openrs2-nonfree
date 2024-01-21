import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	public static int anInt586 = 0;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "Lclient!sd;")
	public static Class73 aClass73_352 = Static122.method531("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
	public static int anInt590 = -1;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "Lclient!sd;")
	private static Class73 aClass73_353 = Static122.method531("Enter your username (V password)3");

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lclient!sd;")
	private static Class73 aClass73_354 = Static122.method531("Sorry invited players only)3");

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_355 = aClass73_354;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_356 = aClass73_353;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
	public static int method470(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILjava/awt/Component;ILclient!ih;)Lclient!sg;")
	public static Class5 method471(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class39 arg3) {
		if (Static143.anInt3288 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class5 local35 = (Class5) Class.forName("Class5_Sub2").getDeclaredConstructor().newInstance();
			local35.anIntArray381 = new int[(Static126.aBoolean195 ? 2 : 1) * 256];
			local35.anInt3596 = arg0;
			local35.method2600(arg1);
			local35.anInt3600 = (arg0 & 0xFFFFFC00) + 1024;
			if (local35.anInt3600 > 16384) {
				local35.anInt3600 = 16384;
			}
			local35.method2602(local35.anInt3600);
			if (Static96.anInt2137 > 0 && Static166.aClass76_1 == null) {
				Static166.aClass76_1 = new Class76();
				Static166.aClass76_1.aClass39_4 = arg3;
				arg3.method1232(Static166.aClass76_1, Static96.anInt2137);
			}
			if (Static166.aClass76_1 != null) {
				if (Static166.aClass76_1.aClass5Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static166.aClass76_1.aClass5Array1[arg2] = local35;
			}
			return local35;
		} catch (@Pc(107) Throwable local107) {
			try {
				@Pc(120) Class5_Sub1 local120 = new Class5_Sub1(arg3, arg2);
				local120.anInt3596 = arg0;
				local120.anIntArray381 = new int[(Static126.aBoolean195 ? 2 : 1) * 256];
				local120.method2600(arg1);
				local120.anInt3600 = 16384;
				local120.method2602(local120.anInt3600);
				if (Static96.anInt2137 > 0 && Static166.aClass76_1 == null) {
					Static166.aClass76_1 = new Class76();
					Static166.aClass76_1.aClass39_4 = arg3;
					arg3.method1232(Static166.aClass76_1, Static96.anInt2137);
				}
				if (Static166.aClass76_1 != null) {
					if (Static166.aClass76_1.aClass5Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static166.aClass76_1.aClass5Array1[arg2] = local120;
				}
				return local120;
			} catch (@Pc(182) Throwable local182) {
				return new Class5();
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BZ)Lclient!hb;")
	public static Class3_Sub1_Sub3_Sub1_Sub1 method472(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class3_Sub1_Sub3_Sub1_Sub1 local23 = new Class3_Sub1_Sub3_Sub1_Sub1(arg0, Static42.anIntArray46, Static72.anIntArray177, Static37.anIntArray89, Static143.anIntArray350, Static9.anIntArray12, Static124.aByteArrayArray8);
			Static90.method1592();
			return local23;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method474() {
		aClass73_353 = null;
		anIntArray61 = null;
		aClass73_352 = null;
		aClass73_354 = null;
		aClass73_356 = null;
		aClass73_355 = null;
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)Lclient!ug;")
	public static Class10 method475() {
		try {
			return (Class10) Class.forName("Class10_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
