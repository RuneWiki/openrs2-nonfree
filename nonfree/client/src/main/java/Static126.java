import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_70 = new Class77(87, 4);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	public static int anInt2390 = 1;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_71 = new Class77(6, 8);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_72 = new Class77(100, 9);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;IIILclient!dq;)Lclient!dc;")
	public static Class45 method2267(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class53 arg3) {
		if (Static221.anInt4100 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class45 local35 = (Class45) Class.forName("Class45_Sub2").getDeclaredConstructor().newInstance();
			local35.anIntArray443 = new int[(Static148.aBoolean202 ? 2 : 1) * 256];
			local35.anInt3706 = arg1;
			local35.method3358(arg0);
			local35.anInt3711 = (arg1 & 0xFFFFFC00) + 1024;
			if (local35.anInt3711 > 16384) {
				local35.anInt3711 = 16384;
			}
			local35.method3362(local35.anInt3711);
			if (Static6.anInt169 > 0 && Static249.aClass39_1 == null) {
				Static249.aClass39_1 = new Class39();
				Static249.aClass39_1.aClass53_1 = arg3;
				arg3.method1169(Static249.aClass39_1, Static6.anInt169);
			}
			if (Static249.aClass39_1 != null) {
				if (Static249.aClass39_1.aClass45Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static249.aClass39_1.aClass45Array1[arg2] = local35;
			}
			return local35;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class45_Sub1 local114 = new Class45_Sub1(arg3, arg2);
				local114.anInt3706 = arg1;
				local114.anIntArray443 = new int[(Static148.aBoolean202 ? 2 : 1) * 256];
				local114.method3358(arg0);
				local114.anInt3711 = 16384;
				local114.method3362(local114.anInt3711);
				if (Static6.anInt169 > 0 && Static249.aClass39_1 == null) {
					Static249.aClass39_1 = new Class39();
					Static249.aClass39_1.aClass53_1 = arg3;
					arg3.method1169(Static249.aClass39_1, Static6.anInt169);
				}
				if (Static249.aClass39_1 != null) {
					if (Static249.aClass39_1.aClass45Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static249.aClass39_1.aClass45Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(176) Throwable local176) {
				return new Class45();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!wp;")
	public static Class149 method2269(@OriginalArg(1) Component arg0) {
		return new Class149_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2272(@OriginalArg(0) String arg0) {
		if (Static61.aClass195Array1 != null) {
			Static19.method552(Static214.aClass41_121);
			Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg0));
			Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
		}
	}
}
