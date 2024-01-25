import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Z")
	public static boolean aBoolean476 = true;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
	public static int anInt7428 = -2;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_14 = new Class146(9, 7);

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Lclient!ub;")
	public static final Class234 aClass234_6 = new Class234("RC", 1);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)I")
	public static int method5756(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local19 >> 12) + 40960;
		return local13 * local35 >> 12;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!kj;ILjava/awt/Component;II)Lclient!hv;")
	public static Class110 method5757(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static78.anInt1548 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class110 local34 = (Class110) Class.forName("Class110_Sub1").getDeclaredConstructor().newInstance();
			local34.anIntArray467 = new int[(Static93.aBoolean97 ? 2 : 1) * 256];
			local34.anInt5916 = arg3;
			local34.method4784(arg1);
			local34.anInt5913 = (arg3 & -1024) + 1024;
			if (local34.anInt5913 > 16384) {
				local34.anInt5913 = 16384;
			}
			local34.method4775(local34.anInt5913);
			if (Static288.anInt5041 > 0 && Static412.aClass189_1 == null) {
				Static412.aClass189_1 = new Class189();
				Static412.aClass189_1.aClass138_6 = arg0;
				arg0.method3220(Static288.anInt5041, Static412.aClass189_1);
			}
			if (Static412.aClass189_1 != null) {
				if (Static412.aClass189_1.aClass110Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static412.aClass189_1.aClass110Array1[arg2] = local34;
			}
			return local34;
		} catch (@Pc(109) Throwable local109) {
			try {
				@Pc(115) Class110_Sub2 local115 = new Class110_Sub2(arg0, arg2);
				local115.anInt5916 = arg3;
				local115.anIntArray467 = new int[(Static93.aBoolean97 ? 2 : 1) * 256];
				local115.method4784(arg1);
				local115.anInt5913 = 16384;
				local115.method4775(local115.anInt5913);
				if (Static288.anInt5041 > 0 && Static412.aClass189_1 == null) {
					Static412.aClass189_1 = new Class189();
					Static412.aClass189_1.aClass138_6 = arg0;
					arg0.method3220(Static288.anInt5041, Static412.aClass189_1);
				}
				if (Static412.aClass189_1 != null) {
					if (Static412.aClass189_1.aClass110Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static412.aClass189_1.aClass110Array1[arg2] = local115;
				}
				return local115;
			} catch (@Pc(174) Throwable local174) {
				return new Class110();
			}
		}
	}
}
