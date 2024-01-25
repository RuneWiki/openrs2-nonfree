import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
	public static int anInt5040;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_73 = new Class171(52, 3);

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "Z")
	public static boolean aBoolean333 = true;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_50 = new Class240(71, 8);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IBILjava/awt/Component;Lclient!ec;)Lclient!br;")
	public static Class41 method4342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class92 arg3) {
		if (Static16.anInt10139 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class41 local35 = (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
			local35.anInt9438 = arg0;
			local35.anIntArray510 = new int[(Static608.aBoolean713 ? 2 : 1) * 256];
			local35.method7699(arg2);
			local35.anInt9444 = (arg0 & 0xFFFFFC00) + 1024;
			if (local35.anInt9444 > 16384) {
				local35.anInt9444 = 16384;
			}
			local35.method7693(local35.anInt9444);
			if (Static399.anInt6572 > 0 && Static443.aClass274_1 == null) {
				Static443.aClass274_1 = new Class274();
				Static443.aClass274_1.aClass92_5 = arg3;
				arg3.method1871(Static443.aClass274_1, Static399.anInt6572);
			}
			if (Static443.aClass274_1 != null) {
				if (Static443.aClass274_1.aClass41Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static443.aClass274_1.aClass41Array1[arg1] = local35;
			}
			return local35;
		} catch (@Pc(112) Throwable local112) {
			try {
				@Pc(118) Class41_Sub2 local118 = new Class41_Sub2(arg3, arg1);
				local118.anInt9438 = arg0;
				local118.anIntArray510 = new int[(Static608.aBoolean713 ? 2 : 1) * 256];
				local118.method7699(arg2);
				local118.anInt9444 = 16384;
				local118.method7693(local118.anInt9444);
				if (Static399.anInt6572 > 0 && Static443.aClass274_1 == null) {
					Static443.aClass274_1 = new Class274();
					Static443.aClass274_1.aClass92_5 = arg3;
					arg3.method1871(Static443.aClass274_1, Static399.anInt6572);
				}
				if (Static443.aClass274_1 != null) {
					if (Static443.aClass274_1.aClass41Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static443.aClass274_1.aClass41Array1[arg1] = local118;
				}
				return local118;
			} catch (@Pc(180) Throwable local180) {
				return new Class41();
			}
		}
	}
}
