import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_11 = new Class67();

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1200 = Static158.method3034("(U5");

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1201 = Static158.method3034("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!uc", name = "ib", descriptor = "Lclient!md;")
	public static final Class51 aClass51_14 = new Class51(4096);

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
	public static int anInt4363 = 0;

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1202 = Static158.method3034("Neuer Benutzer");

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1203 = Static158.method3034(" has logged in)3");

	@OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
	public static int anInt4364 = -1;

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "Z")
	public static volatile boolean aBoolean173 = true;

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1204 = aClass60_1203;

	@OriginalMember(owner = "client!uc", name = "pb", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZILjava/awt/Component;Lclient!t;)Lclient!lg;")
	public static Class8 method3350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class81 arg3) {
		if (Static98.anInt2858 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class8 local36 = (Class8) Class.forName("Class8_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray410 = new int[(Static16.aBoolean15 ? 2 : 1) * 256];
			local36.anInt3630 = arg1;
			local36.method2799(arg2);
			local36.anInt3634 = (arg1 & 0xFFFFFC00) + 1024;
			if (local36.anInt3634 > 16384) {
				local36.anInt3634 = 16384;
			}
			local36.method2800(local36.anInt3634);
			if (Static42.anInt1304 > 0 && Static99.aClass61_1 == null) {
				Static99.aClass61_1 = new Class61();
				Static99.aClass61_1.aClass81_3 = arg3;
				arg3.method3153(Static42.anInt1304, Static99.aClass61_1);
			}
			if (Static99.aClass61_1 != null) {
				if (Static99.aClass61_1.aClass8Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static99.aClass61_1.aClass8Array1[arg0] = local36;
			}
			return local36;
		} catch (@Pc(109) Throwable local109) {
			try {
				@Pc(120) Class8_Sub1 local120 = new Class8_Sub1(arg3, arg0);
				local120.anIntArray410 = new int[(Static16.aBoolean15 ? 2 : 1) * 256];
				local120.anInt3630 = arg1;
				local120.method2799(arg2);
				local120.anInt3634 = 16384;
				local120.method2800(local120.anInt3634);
				if (Static42.anInt1304 > 0 && Static99.aClass61_1 == null) {
					Static99.aClass61_1 = new Class61();
					Static99.aClass61_1.aClass81_3 = arg3;
					arg3.method3153(Static42.anInt1304, Static99.aClass61_1);
				}
				if (Static99.aClass61_1 != null) {
					if (Static99.aClass61_1.aClass8Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static99.aClass61_1.aClass8Array1[arg0] = local120;
				}
				return local120;
			} catch (@Pc(182) Throwable local182) {
				return new Class8();
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(III)V")
	public static void method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static27.aBoolean30 = true;
		Static54.anInt1748 = arg0;
		Static33.anInt1074 = arg1;
		Static31.anInt988 = arg2;
		anInt4364 = -1;
		Static27.anInt829 = -1;
	}
}
