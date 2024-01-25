import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
	public static int anInt9140;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("be111a6fa62598c3dc22c509dadcd1fe3c5e5eefae189d8b08658c1fb3613c38546b73ab9ad654bf5544bfa913c326831c3d3c60def99d78aa26d5a2f7aa8263", 16);

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	public static volatile int anInt9144 = -1;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method7538(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static24.method418(local18) : local18;
		} else if (arg0 instanceof Class143) {
			@Pc(32) Class143 local32 = (Class143) arg0;
			return local32.method4421();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIII)V")
	public static void method7539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		if (local10 == 0) {
			if (local22 != 0) {
				Static115.method7631(arg2, arg1, arg0, arg3);
			}
		} else if (local22 == 0) {
			Static231.method4414(arg2, arg1, arg0, arg4);
		} else {
			@Pc(54) int local54 = (local22 << 12) / local10;
			@Pc(63) int local63 = arg1 - (local54 * arg0 >> 12);
			@Pc(76) int local76;
			@Pc(74) int local74;
			if (Static472.anInt6105 > arg4) {
				local74 = (local54 * Static472.anInt6105 >> 12) + local63;
				local76 = Static472.anInt6105;
			} else if (arg4 <= Static202.anInt4720) {
				local76 = arg4;
				local74 = arg3;
			} else {
				local74 = (local54 * Static202.anInt4720 >> 12) + local63;
				local76 = Static202.anInt4720;
			}
			@Pc(111) int local111;
			@Pc(109) int local109;
			if (Static472.anInt6105 > arg0) {
				local111 = Static472.anInt6105;
				local109 = (local54 * Static472.anInt6105 >> 12) + local63;
			} else if (Static202.anInt4720 >= arg0) {
				local109 = arg1;
				local111 = arg0;
			} else {
				local111 = Static202.anInt4720;
				local109 = local63 + (local54 * Static202.anInt4720 >> 12);
			}
			if (Static246.anInt5506 > local109) {
				local111 = (Static246.anInt5506 - local63 << 12) / local54;
				local109 = Static246.anInt5506;
			} else if (local109 > Static583.anInt9761) {
				local111 = (Static583.anInt9761 - local63 << 12) / local54;
				local109 = Static583.anInt9761;
			}
			if (Static246.anInt5506 > local74) {
				local74 = Static246.anInt5506;
				local76 = (Static246.anInt5506 - local63 << 12) / local54;
			} else if (local74 > Static583.anInt9761) {
				local76 = (Static583.anInt9761 - local63 << 12) / local54;
				local74 = Static583.anInt9761;
			}
			Static194.method3872(local109, local76, local74, local111, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)I")
	public static int method7542(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static75.method1858(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
	public static boolean method7543(@OriginalArg(0) int arg0) {
		if (arg0 == 51 || arg0 == 44 || arg0 == 3 || arg0 == 50 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1002;
		}
	}
}
