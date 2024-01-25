import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
	public static int anInt3593;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_117 = new Class175("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!oh;)V")
	public static void method2966(@OriginalArg(0) Class1_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort181; local2 <= arg0.aShort180; local2++) {
			for (@Pc(6) int local6 = arg0.aShort179; local6 <= arg0.aShort178; local6++) {
				@Pc(16) Class217 local16 = Static151.aClass217ArrayArrayArray3[arg0.aByte77][local2][local6];
				if (local16 != null) {
					@Pc(21) Class182 local21 = local16.aClass182_3;
					@Pc(23) Class182 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub3_2 == arg0) {
							if (local23 == null) {
								local16.aClass182_3 = local21.aClass182_2;
							} else {
								local23.aClass182_2 = local21.aClass182_2;
							}
							local21.method4451();
							break;
						}
						local23 = local21;
						local21 = local21.aClass182_2;
					}
					local16.aByte90 = 0;
					for (@Pc(56) Class182 local56 = local16.aClass182_3; local56 != null; local56 = local56.aClass182_2) {
						local16.aByte90 = (byte) (local16.aByte90 | local56.anInt5511);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BIIII)V")
	public static void method2968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static123.aClass21_Sub1_1.anInt868 != 0 && arg3 != 0 && Static205.anInt4113 < 50 && arg0 != -1) {
			Static192.aClass83Array1[Static205.anInt4113++] = new Class83((byte) 2, arg0, arg3, arg1, arg2, 0);
		}
	}
}
