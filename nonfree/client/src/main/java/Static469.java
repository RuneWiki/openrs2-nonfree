import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!kr;")
	public static Class171 aClass171_151;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!ei;")
	public static final Class79 aClass79_13 = new Class79();

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "Z")
	public static boolean aBoolean633 = false;

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
	public static int anInt9081 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Component;IIILclient!gaa;)Lclient!lj;")
	public static Class183 method7461(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class102 arg3) {
		if (Static477.anInt7971 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class183 local33 = (Class183) Class.forName("Class183_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt9036 = arg1;
			local33.anIntArray835 = new int[(Static187.aBoolean231 ? 2 : 1) * 256];
			local33.method7414(arg0);
			local33.anInt9032 = (arg1 & 0xFFFFFC00) + 1024;
			if (local33.anInt9032 > 16384) {
				local33.anInt9032 = 16384;
			}
			local33.method7417(local33.anInt9032);
			if (Static444.anInt7642 > 0 && Static197.aClass297_2 == null) {
				Static197.aClass297_2 = new Class297();
				Static197.aClass297_2.aClass102_5 = arg3;
				arg3.method2391(Static444.anInt7642, Static197.aClass297_2);
			}
			if (Static197.aClass297_2 != null) {
				if (Static197.aClass297_2.aClass183Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static197.aClass297_2.aClass183Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(116) Class183_Sub1 local116 = new Class183_Sub1(arg3, arg2);
				local116.anInt9036 = arg1;
				local116.anIntArray835 = new int[(Static187.aBoolean231 ? 2 : 1) * 256];
				local116.method7414(arg0);
				local116.anInt9032 = 16384;
				local116.method7417(local116.anInt9032);
				if (Static444.anInt7642 > 0 && Static197.aClass297_2 == null) {
					Static197.aClass297_2 = new Class297();
					Static197.aClass297_2.aClass102_5 = arg3;
					arg3.method2391(Static444.anInt7642, Static197.aClass297_2);
				}
				if (Static197.aClass297_2 != null) {
					if (Static197.aClass297_2.aClass183Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static197.aClass297_2.aClass183Array1[arg2] = local116;
				}
				return local116;
			} catch (@Pc(178) Throwable local178) {
				return new Class183();
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)V")
	public static void method7464() {
		@Pc(1) Class313 local1 = Static286.aClass313_31;
		synchronized (Static286.aClass313_31) {
			Static286.aClass313_31.method7403(5);
		}
	}
}
