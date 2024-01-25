import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt5089;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_112 = new Class205(38, 6);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!is;Ljava/awt/Component;II)Lclient!ue;")
	public static Class85 method4433(@OriginalArg(1) Class111 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static42.anInt4820 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class85 local30 = (Class85) Class.forName("Class85_Sub2").getDeclaredConstructor().newInstance();
			local30.anInt4796 = arg2;
			local30.anIntArray923 = new int[(Static44.aBoolean66 ? 2 : 1) * 256];
			local30.method4221(arg1);
			local30.anInt4793 = (arg2 & 0xFFFFFC00) + 1024;
			if (local30.anInt4793 > 16384) {
				local30.anInt4793 = 16384;
			}
			local30.method4225(local30.anInt4793);
			if (Static208.anInt3821 > 0 && Static307.aClass57_1 == null) {
				Static307.aClass57_1 = new Class57();
				Static307.aClass57_1.aClass111_1 = arg0;
				arg0.method2819(Static307.aClass57_1, Static208.anInt3821);
			}
			if (Static307.aClass57_1 != null) {
				if (Static307.aClass57_1.aClass85Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static307.aClass57_1.aClass85Array1[arg3] = local30;
			}
			return local30;
		} catch (@Pc(102) Throwable local102) {
			try {
				@Pc(108) Class85_Sub1 local108 = new Class85_Sub1(arg0, arg3);
				local108.anInt4796 = arg2;
				local108.anIntArray923 = new int[(Static44.aBoolean66 ? 2 : 1) * 256];
				local108.method4221(arg1);
				local108.anInt4793 = 16384;
				local108.method4225(local108.anInt4793);
				if (Static208.anInt3821 > 0 && Static307.aClass57_1 == null) {
					Static307.aClass57_1 = new Class57();
					Static307.aClass57_1.aClass111_1 = arg0;
					arg0.method2819(Static307.aClass57_1, Static208.anInt3821);
				}
				if (Static307.aClass57_1 != null) {
					if (Static307.aClass57_1.aClass85Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static307.aClass57_1.aClass85Array1[arg3] = local108;
				}
				return local108;
			} catch (@Pc(172) Throwable local172) {
				return new Class85();
			}
		}
	}
}
