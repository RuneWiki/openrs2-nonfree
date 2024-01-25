import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!vn", name = "db", descriptor = "Lclient!nk;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!vn", name = "X", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_108 = new Class183(6, 0);

	@OriginalMember(owner = "client!vn", name = "eb", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_198 = new Class208(99, 8);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)I")
	public static int method5901(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public static int method5906(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method5907(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static153.method2738(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local42 <= local45);
			return Static353.method5608(local45, arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZII)V")
	public static void method5908(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(16) Class189 local16 = Static169.aClass189ArrayArray3[arg1][arg0];
		Static319.method5152(5000, local16 == null ? Static318.aClass189_2 : local16);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Lclient!pi;")
	public static Class35_Sub1 method5909() {
		Static340.anInt6285 = 0;
		return Static97.method1697();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!kd;BIII)Ljava/awt/Frame;")
	public static Frame method5910(@OriginalArg(0) int arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method3253()) {
			return null;
		}
		@Pc(17) Class68[] local17 = Static257.method4426(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg3 == local17[local25].anInt1896 && arg0 == local17[local25].anInt1899 && (!local23 || local17[local25].anInt1895 > arg2)) {
				local23 = true;
				arg2 = local17[local25].anInt1895;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(93) Class86 local93 = arg1.method3249(arg0, arg3, arg2);
		while (local93.anInt2590 == 0) {
			Static215.method3855(10L);
		}
		@Pc(105) Frame local105 = (Frame) local93.anObject2;
		if (local105 == null) {
			return null;
		} else if (local93.anInt2590 == 2) {
			Static108.method1966(arg1, local105);
			return null;
		} else {
			return local105;
		}
	}
}
