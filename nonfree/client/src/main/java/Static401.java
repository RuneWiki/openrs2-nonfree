import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!mr;")
	public static Class226 aClass226_4;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array12;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Component;IILclient!mr;I)Lclient!hh;")
	public static Class35 method5453(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class226 arg3) {
		if (Static283.anInt7446 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class35 local34 = (Class35) Class.forName("Class35_Sub2").getDeclaredConstructor().newInstance();
			local34.anInt3252 = arg1;
			local34.anIntArray215 = new int[(Static452.aBoolean540 ? 2 : 1) * 256];
			local34.method2741(arg0);
			local34.anInt3251 = (arg1 & 0xFFFFFC00) + 1024;
			if (local34.anInt3251 > 16384) {
				local34.anInt3251 = 16384;
			}
			local34.method2748(local34.anInt3251);
			if (Static92.anInt1710 > 0 && Static341.aClass90_1 == null) {
				Static341.aClass90_1 = new Class90();
				Static341.aClass90_1.aClass226_1 = arg3;
				arg3.method4842(Static341.aClass90_1, Static92.anInt1710);
			}
			if (Static341.aClass90_1 != null) {
				if (Static341.aClass90_1.aClass35Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static341.aClass90_1.aClass35Array1[arg2] = local34;
			}
			return local34;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class35_Sub1 local112 = new Class35_Sub1(arg3, arg2);
				local112.anInt3252 = arg1;
				local112.anIntArray215 = new int[(Static452.aBoolean540 ? 2 : 1) * 256];
				local112.method2741(arg0);
				local112.anInt3251 = 16384;
				local112.method2748(local112.anInt3251);
				if (Static92.anInt1710 > 0 && Static341.aClass90_1 == null) {
					Static341.aClass90_1 = new Class90();
					Static341.aClass90_1.aClass226_1 = arg3;
					arg3.method4842(Static341.aClass90_1, Static92.anInt1710);
				}
				if (Static341.aClass90_1 != null) {
					if (Static341.aClass90_1.aClass35Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static341.aClass90_1.aClass35Array1[arg2] = local112;
				}
				return local112;
			} catch (@Pc(176) Throwable local176) {
				return new Class35();
			}
		}
	}
}
