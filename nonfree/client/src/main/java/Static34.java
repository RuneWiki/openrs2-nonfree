import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/awt/Component;ZLclient!pe;II)Lclient!wf;")
	public static Class196 method1032(@OriginalArg(0) Component arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static77.anInt1912 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class196 local35 = (Class196) Class.forName("Class196_Sub2").getDeclaredConstructor().newInstance();
			local35.anIntArray541 = new int[(Static83.aBoolean193 ? 2 : 1) * 256];
			local35.anInt7686 = arg3;
			local35.method6406(arg0);
			local35.anInt7687 = (arg3 & 0xFFFFFC00) + 1024;
			if (local35.anInt7687 > 16384) {
				local35.anInt7687 = 16384;
			}
			local35.method6410(local35.anInt7687);
			if (Static153.anInt3342 > 0 && Static206.aClass327_1 == null) {
				Static206.aClass327_1 = new Class327();
				Static206.aClass327_1.aClass246_8 = arg1;
				arg1.method6134(Static206.aClass327_1, Static153.anInt3342);
			}
			if (Static206.aClass327_1 != null) {
				if (Static206.aClass327_1.aClass196Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static206.aClass327_1.aClass196Array1[arg2] = local35;
			}
			return local35;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(116) Class196_Sub1 local116 = new Class196_Sub1(arg1, arg2);
				local116.anInt7686 = arg3;
				local116.anIntArray541 = new int[(Static83.aBoolean193 ? 2 : 1) * 256];
				local116.method6406(arg0);
				local116.anInt7687 = 16384;
				local116.method6410(local116.anInt7687);
				if (Static153.anInt3342 > 0 && Static206.aClass327_1 == null) {
					Static206.aClass327_1 = new Class327();
					Static206.aClass327_1.aClass246_8 = arg1;
					arg1.method6134(Static206.aClass327_1, Static153.anInt3342);
				}
				if (Static206.aClass327_1 != null) {
					if (Static206.aClass327_1.aClass196Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static206.aClass327_1.aClass196Array1[arg2] = local116;
				}
				return local116;
			} catch (@Pc(178) Throwable local178) {
				return new Class196();
			}
		}
	}
}
