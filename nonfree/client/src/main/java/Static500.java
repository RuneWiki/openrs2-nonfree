import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
	public static int anInt8793;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "Lclient!ua;")
	public static final Class289 aClass289_4 = new Class289();

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_156 = new Class133(27, 16);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!mm;III)V")
	public static void method7214(@OriginalArg(1) Class3_Sub32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) long local21 = (long) (arg2 << 28 | arg1 << 14 | arg3);
		@Pc(27) Class3_Sub12 local27 = (Class3_Sub12) Static476.aClass267_37.method6644(local21);
		if (local27 == null) {
			local27 = new Class3_Sub12();
			Static476.aClass267_37.method6640(local27, local21);
			local27.aClass71_13.method2076(arg0);
			return;
		}
		@Pc(50) Class27 local50 = Static99.aClass96_7.method2508(arg0.anInt5999);
		@Pc(53) int local53 = local50.anInt821;
		if (local50.anInt832 == 1) {
			local53 *= arg0.anInt5994 + 1;
		}
		for (@Pc(70) Class3_Sub32 local70 = (Class3_Sub32) local27.aClass71_13.method2089(); local70 != null; local70 = (Class3_Sub32) local27.aClass71_13.method2086()) {
			local50 = Static99.aClass96_7.method2508(local70.anInt5999);
			@Pc(81) int local81 = local50.anInt821;
			if (local50.anInt832 == 1) {
				local81 *= local70.anInt5994 + 1;
			}
			if (local81 < local53) {
				Static203.method3790(local70, arg0);
				return;
			}
		}
		local27.aClass71_13.method2076(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/util/Random;ZI)I")
	public static int method7215(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static260.method4582(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local42 <= local45);
			return Static402.method7159(arg1, local45);
		}
	}
}
