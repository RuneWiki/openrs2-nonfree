import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_89 = new Class27(69, 3);

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public static int anInt6587 = -1;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!lt;BLjava/awt/Component;II)Lclient!on;")
	public static Class130 method5162(@OriginalArg(0) Class159 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static438.anInt7333 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class130 local35 = (Class130) Class.forName("Class130_Sub2").getDeclaredConstructor().newInstance();
			local35.anIntArray451 = new int[(Static324.aBoolean365 ? 2 : 1) * 256];
			local35.anInt4526 = arg2;
			local35.method3638(arg1);
			local35.anInt4523 = (arg2 & 0xFFFFFC00) + 1024;
			if (local35.anInt4523 > 16384) {
				local35.anInt4523 = 16384;
			}
			local35.method3647(local35.anInt4523);
			if (Static369.anInt6377 > 0 && Static358.aClass175_1 == null) {
				Static358.aClass175_1 = new Class175();
				Static358.aClass175_1.aClass159_2 = arg0;
				arg0.method3496(Static369.anInt6377, Static358.aClass175_1);
			}
			if (Static358.aClass175_1 != null) {
				if (Static358.aClass175_1.aClass130Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static358.aClass175_1.aClass130Array1[arg3] = local35;
			}
			return local35;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(121) Class130_Sub1 local121 = new Class130_Sub1(arg0, arg3);
				local121.anIntArray451 = new int[(Static324.aBoolean365 ? 2 : 1) * 256];
				local121.anInt4526 = arg2;
				local121.method3638(arg1);
				local121.anInt4523 = 16384;
				local121.method3647(local121.anInt4523);
				if (Static369.anInt6377 > 0 && Static358.aClass175_1 == null) {
					Static358.aClass175_1 = new Class175();
					Static358.aClass175_1.aClass159_2 = arg0;
					arg0.method3496(Static369.anInt6377, Static358.aClass175_1);
				}
				if (Static358.aClass175_1 != null) {
					if (Static358.aClass175_1.aClass130Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static358.aClass175_1.aClass130Array1[arg3] = local121;
				}
				return local121;
			} catch (@Pc(183) Throwable local183) {
				return new Class130();
			}
		}
	}
}
