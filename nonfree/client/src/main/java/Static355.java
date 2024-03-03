import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public static int anInt7105;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!ml;Ljava/awt/Component;I)Lclient!tg;", line = 31)
	public static Class221 method6348(@OriginalArg(1) int arg0, @OriginalArg(2) Class152 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static331.anInt6630 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class221 local33 = (Class221) Class.forName("Class221_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt7083 = arg3;
			local33.anIntArray485 = new int[(Static329.aBoolean93 ? 2 : 1) * 256];
			local33.method6328(arg2);
			local33.anInt7086 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt7086 > 16384) {
				local33.anInt7086 = 16384;
			}
			local33.method6333(local33.anInt7086);
			if (Static187.anInt3694 > 0 && Static63.aClass129_1 == null) {
				Static63.aClass129_1 = new Class129();
				Static63.aClass129_1.aClass152_3 = arg1;
				arg1.method3770(Static187.anInt3694, Static63.aClass129_1);
			}
			if (Static63.aClass129_1 != null) {
				if (Static63.aClass129_1.aClass221Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static63.aClass129_1.aClass221Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class221_Sub2 local112 = new Class221_Sub2(arg1, arg0);
				local112.anInt7083 = arg3;
				local112.anIntArray485 = new int[(Static329.aBoolean93 ? 2 : 1) * 256];
				local112.method6328(arg2);
				local112.anInt7086 = 16384;
				local112.method6333(local112.anInt7086);
				if (Static187.anInt3694 > 0 && Static63.aClass129_1 == null) {
					Static63.aClass129_1 = new Class129();
					Static63.aClass129_1.aClass152_3 = arg1;
					arg1.method3770(Static187.anInt3694, Static63.aClass129_1);
				}
				if (Static63.aClass129_1 != null) {
					if (Static63.aClass129_1.aClass221Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static63.aClass129_1.aClass221Array1[arg0] = local112;
				}
				return local112;
			} catch (@Pc(186) Throwable local186) {
				return new Class221();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 120)
	public static int method6349(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
