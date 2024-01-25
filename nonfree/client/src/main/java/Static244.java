import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "Lclient!hg;")
	public static final Class132 aClass132_2 = new Class132(2);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLjava/awt/Component;Lclient!qj;II)Lclient!aj;")
	public static Class11 method4236(@OriginalArg(1) Component arg0, @OriginalArg(2) Class272 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static330.anInt6003 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class11 local31 = (Class11) Class.forName("Class11_Sub1").getDeclaredConstructor().newInstance();
			local31.anIntArray550 = new int[(Static341.aBoolean438 ? 2 : 1) * 256];
			local31.anInt7648 = arg2;
			local31.method6289(arg0);
			local31.anInt7645 = (arg2 & 0xFFFFFC00) + 1024;
			if (local31.anInt7645 > 16384) {
				local31.anInt7645 = 16384;
			}
			local31.method6293(local31.anInt7645);
			if (Static293.anInt5470 > 0 && Static513.aClass244_1 == null) {
				Static513.aClass244_1 = new Class244();
				Static513.aClass244_1.aClass272_4 = arg1;
				arg1.method6121(Static293.anInt5470, Static513.aClass244_1);
			}
			if (Static513.aClass244_1 != null) {
				if (Static513.aClass244_1.aClass11Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static513.aClass244_1.aClass11Array1[arg3] = local31;
			}
			return local31;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class11_Sub2 local117 = new Class11_Sub2(arg1, arg3);
				local117.anIntArray550 = new int[(Static341.aBoolean438 ? 2 : 1) * 256];
				local117.anInt7648 = arg2;
				local117.method6289(arg0);
				local117.anInt7645 = 16384;
				local117.method6293(local117.anInt7645);
				if (Static293.anInt5470 > 0 && Static513.aClass244_1 == null) {
					Static513.aClass244_1 = new Class244();
					Static513.aClass244_1.aClass272_4 = arg1;
					arg1.method6121(Static293.anInt5470, Static513.aClass244_1);
				}
				if (Static513.aClass244_1 != null) {
					if (Static513.aClass244_1.aClass11Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static513.aClass244_1.aClass11Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class11();
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
	public static void method4239() {
		Static51.method1127();
		Static482.method6632();
	}
}
