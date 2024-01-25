import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public static int anInt2654 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIBI)V")
	public static void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static573.anInt6751 = arg0;
		Static348.anInt6498 = arg1;
		Static147.anInt3005 = arg2;
		Static200.anInt3737 = arg3;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method2223() {
		@Pc(7) Class4 local7 = null;
		try {
			@Pc(13) Class174 local13 = Static48.aClass298_12.method7290("");
			while (local13.anInt5121 == 0) {
				Static143.method2414(1L);
			}
			if (local13.anInt5121 == 1) {
				local7 = (Class4) local13.anObject12;
				@Pc(38) Class3_Sub9 local38 = Static32.aClass3_Sub41_3.method6770();
				local7.method86(local38.aByteArray51, 0, local38.anInt6453);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local7 != null) {
				local7.method84();
			}
		} catch (@Pc(59) Exception local59) {
		}
	}
}
