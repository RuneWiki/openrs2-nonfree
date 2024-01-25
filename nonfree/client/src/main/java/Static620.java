import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "F")
	public static float aFloat195 = 0.0F;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	public static int anInt9784 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ft;Ljava/awt/Component;BII)Lclient!wm;")
	public static Class150 method8526(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static90.anInt9479 == 0) {
			throw new IllegalStateException();
		} else if (arg3 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(42) Class150 local42 = (Class150) Class.forName("he").getDeclaredConstructor().newInstance();
				local42.anIntArray360 = new int[(Static30.aBoolean32 ? 2 : 1) * 256];
				local42.anInt6111 = arg2;
				local42.method5494(arg1);
				local42.anInt6112 = (arg2 & -1024) + 1024;
				if (local42.anInt6112 > 16384) {
					local42.anInt6112 = 16384;
				}
				local42.method5496(local42.anInt6112);
				if (Static337.anInt5758 > 0 && Static446.aClass218_1 == null) {
					Static446.aClass218_1 = new Class218();
					Static446.aClass218_1.aClass122_21 = arg0;
					arg0.method3352(Static446.aClass218_1, Static337.anInt5758);
				}
				if (Static446.aClass218_1 != null) {
					if (Static446.aClass218_1.aClass150Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static446.aClass218_1.aClass150Array1[arg3] = local42;
				}
				return local42;
			} catch (@Pc(139) Throwable local139) {
				try {
					@Pc(145) Class150_Sub2 local145 = new Class150_Sub2(arg0, arg3);
					local145.anInt6111 = arg2;
					local145.anIntArray360 = new int[(Static30.aBoolean32 ? 2 : 1) * 256];
					local145.method5494(arg1);
					local145.anInt6112 = 16384;
					local145.method5496(local145.anInt6112);
					if (Static337.anInt5758 > 0 && Static446.aClass218_1 == null) {
						Static446.aClass218_1 = new Class218();
						Static446.aClass218_1.aClass122_21 = arg0;
						arg0.method3352(Static446.aClass218_1, Static337.anInt5758);
					}
					if (Static446.aClass218_1 != null) {
						if (Static446.aClass218_1.aClass150Array1[arg3] != null) {
							throw new IllegalArgumentException();
						}
						Static446.aClass218_1.aClass150Array1[arg3] = local145;
					}
					return local145;
				} catch (@Pc(215) Throwable local215) {
					return new Class150();
				}
			}
		}
	}
}
