import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "[I")
	public static final int[] anIntArray387 = new int[2048];

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)I")
	public static int method4155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!gt;IIILjava/awt/Component;)Lclient!sl;")
	public static Class191 method4156(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static193.anInt3215 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(28) Class191 local28 = (Class191) Class.forName("Class191_Sub2").getDeclaredConstructor().newInstance();
			local28.anInt6339 = arg1;
			local28.anIntArray445 = new int[(Static335.aBoolean372 ? 2 : 1) * 256];
			local28.method5012(arg3);
			local28.anInt6341 = (arg1 & 0xFFFFFC00) + 1024;
			if (local28.anInt6341 > 16384) {
				local28.anInt6341 = 16384;
			}
			local28.method5008(local28.anInt6341);
			if (Static48.anInt888 > 0 && Static450.aClass174_1 == null) {
				Static450.aClass174_1 = new Class174();
				Static450.aClass174_1.aClass93_4 = arg0;
				arg0.method2076(Static48.anInt888, Static450.aClass174_1);
			}
			if (Static450.aClass174_1 != null) {
				if (Static450.aClass174_1.aClass191Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static450.aClass174_1.aClass191Array1[arg2] = local28;
			}
			return local28;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class191_Sub1 local114 = new Class191_Sub1(arg0, arg2);
				local114.anIntArray445 = new int[(Static335.aBoolean372 ? 2 : 1) * 256];
				local114.anInt6339 = arg1;
				local114.method5012(arg3);
				local114.anInt6341 = 16384;
				local114.method5008(local114.anInt6341);
				if (Static48.anInt888 > 0 && Static450.aClass174_1 == null) {
					Static450.aClass174_1 = new Class174();
					Static450.aClass174_1.aClass93_4 = arg0;
					arg0.method2076(Static48.anInt888, Static450.aClass174_1);
				}
				if (Static450.aClass174_1 != null) {
					if (Static450.aClass174_1.aClass191Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static450.aClass174_1.aClass191Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class191();
			}
		}
	}
}
