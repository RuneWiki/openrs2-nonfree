import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "Lclient!sb;")
	public static Class301 aClass301_6;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
	public static int anInt8729;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_94 = new Class257(72, 6);

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "Lclient!rb;")
	public static final Class283 aClass283_6 = new Class283();

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
	public static int anInt8727 = 0;

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_119 = new Class71(77, 3);

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	public static void method7209() {
		Static594.aClass236_100.method6245();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(III)V")
	public static void method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static405.aClass56ArrayArrayArray2[0][arg1][arg2] != null && Static405.aClass56ArrayArrayArray2[0][arg1][arg2].aClass56_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static405.aClass56ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class56 local44 = Static405.aClass56ArrayArrayArray2[local22][arg1][arg2] = new Class56(local22);
				if (local20) {
					local44.aByte22++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!gh;Ljava/awt/Component;II)Lclient!nc;")
	public static Class80 method7211(@OriginalArg(1) Class118 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static345.anInt6689 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class80 local36 = (Class80) Class.forName("Class80_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray210 = new int[(Static343.aBoolean463 ? 2 : 1) * 256];
			local36.anInt3972 = arg2;
			local36.method3199(arg1);
			local36.anInt3971 = (arg2 & 0xFFFFFC00) + 1024;
			if (local36.anInt3971 > 16384) {
				local36.anInt3971 = 16384;
			}
			local36.method3200(local36.anInt3971);
			if (Static31.anInt1230 > 0 && Static364.aClass323_1 == null) {
				Static364.aClass323_1 = new Class323();
				Static364.aClass323_1.aClass118_5 = arg0;
				arg0.method3410(Static31.anInt1230, Static364.aClass323_1);
			}
			if (Static364.aClass323_1 != null) {
				if (Static364.aClass323_1.aClass80Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static364.aClass323_1.aClass80Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class80_Sub1 local114 = new Class80_Sub1(arg0, arg3);
				local114.anInt3972 = arg2;
				local114.anIntArray210 = new int[(Static343.aBoolean463 ? 2 : 1) * 256];
				local114.method3199(arg1);
				local114.anInt3971 = 16384;
				local114.method3200(local114.anInt3971);
				if (Static31.anInt1230 > 0 && Static364.aClass323_1 == null) {
					Static364.aClass323_1 = new Class323();
					Static364.aClass323_1.aClass118_5 = arg0;
					arg0.method3410(Static31.anInt1230, Static364.aClass323_1);
				}
				if (Static364.aClass323_1 != null) {
					if (Static364.aClass323_1.aClass80Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static364.aClass323_1.aClass80Array1[arg3] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class80();
			}
		}
	}
}
