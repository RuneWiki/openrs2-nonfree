import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!jc;")
	public static Class40 aClass40_10;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
	public static int[] anIntArray52 = new int[2000];

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_499 = null;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_500 = Static107.method1838("mapmarker");

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean23 = false;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!eb;")
	public static Class19 method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass19_1 == null ? null : local7.aClass19_1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!qe;ILjava/awt/Component;)Lclient!fc;")
	public static Class21 method482(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static113.anInt2749 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class21 local32 = (Class21) Class.forName("Class21_Sub2").getDeclaredConstructor().newInstance();
			local32.anInt1938 = arg0;
			local32.anIntArray187 = new int[(Static114.aBoolean125 ? 2 : 1) * 256];
			local32.method1350(arg3);
			local32.anInt1942 = (arg0 & 0xFFFFFC00) + 1024;
			if (local32.anInt1942 > 16384) {
				local32.anInt1942 = 16384;
			}
			local32.method1335(local32.anInt1942);
			if (Static165.anInt3686 > 0 && Static176.aClass58_1 == null) {
				Static176.aClass58_1 = new Class58();
				Static176.aClass58_1.aClass66_4 = arg1;
				arg1.method2127(Static176.aClass58_1, Static165.anInt3686);
			}
			if (Static176.aClass58_1 != null) {
				if (Static176.aClass58_1.aClass21Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static176.aClass58_1.aClass21Array1[arg2] = local32;
			}
			return local32;
		} catch (@Pc(104) Throwable local104) {
			try {
				@Pc(110) Class21_Sub1 local110 = new Class21_Sub1(arg1, arg2);
				local110.anInt1938 = arg0;
				local110.anIntArray187 = new int[(Static114.aBoolean125 ? 2 : 1) * 256];
				local110.method1350(arg3);
				local110.anInt1942 = 16384;
				local110.method1335(local110.anInt1942);
				if (Static165.anInt3686 > 0 && Static176.aClass58_1 == null) {
					Static176.aClass58_1 = new Class58();
					Static176.aClass58_1.aClass66_4 = arg1;
					arg1.method2127(Static176.aClass58_1, Static165.anInt3686);
				}
				if (Static176.aClass58_1 != null) {
					if (Static176.aClass58_1.aClass21Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static176.aClass58_1.aClass21Array1[arg2] = local110;
				}
				return local110;
			} catch (@Pc(177) Throwable local177) {
				return new Class21();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!jc;IZLclient!th;Lclient!jc;)V")
	public static void method483(@OriginalArg(0) Class40 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub4_Sub3_Sub2_Sub1 arg2, @OriginalArg(4) Class40 arg3) {
		Static5.aClass40_1 = arg0;
		Static155.aClass40_34 = arg3;
		Static108.aBoolean123 = arg1;
		Static145.anInt3284 = Static155.aClass40_34.method1785(10);
		Static8.aClass2_Sub4_Sub3_Sub2_Sub1_1 = arg2;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method484() {
		aClass28_500 = null;
		anIntArray52 = null;
		aClass40_10 = null;
		aClass28_499 = null;
	}
}
