import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "Lclient!iv;")
	public static Class119 aClass119_31;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	public static int anInt1937;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_32 = new Class119(7, 4);

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!li;ILjava/awt/Component;)Lclient!kc;")
	public static Class16 method1507(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static232.anInt4442 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class16 local35 = (Class16) Class.forName("Class16_Sub2").getDeclaredConstructor().newInstance();
			local35.anInt5271 = arg0;
			local35.anIntArray355 = new int[(Static324.aBoolean657 ? 2 : 1) * 256];
			local35.method4115(arg3);
			local35.anInt5266 = (arg0 & -1024) + 1024;
			if (local35.anInt5266 > 16384) {
				local35.anInt5266 = 16384;
			}
			local35.method4118(local35.anInt5266);
			if (Static361.anInt6115 > 0 && Static226.aClass158_1 == null) {
				Static226.aClass158_1 = new Class158();
				Static226.aClass158_1.aClass143_4 = arg1;
				arg1.method3397(Static361.anInt6115, Static226.aClass158_1);
			}
			if (Static226.aClass158_1 != null) {
				if (Static226.aClass158_1.aClass16Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static226.aClass158_1.aClass16Array1[arg2] = local35;
			}
			return local35;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class16_Sub1 local111 = new Class16_Sub1(arg1, arg2);
				local111.anInt5271 = arg0;
				local111.anIntArray355 = new int[(Static324.aBoolean657 ? 2 : 1) * 256];
				local111.method4115(arg3);
				local111.anInt5266 = 16384;
				local111.method4118(local111.anInt5266);
				if (Static361.anInt6115 > 0 && Static226.aClass158_1 == null) {
					Static226.aClass158_1 = new Class158();
					Static226.aClass158_1.aClass143_4 = arg1;
					arg1.method3397(Static361.anInt6115, Static226.aClass158_1);
				}
				if (Static226.aClass158_1 != null) {
					if (Static226.aClass158_1.aClass16Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static226.aClass158_1.aClass16Array1[arg2] = local111;
				}
				return local111;
			} catch (@Pc(173) Throwable local173) {
				return new Class16();
			}
		}
	}
}
