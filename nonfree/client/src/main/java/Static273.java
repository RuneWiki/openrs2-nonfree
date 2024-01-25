import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
	public static int anInt4903;

	@OriginalMember(owner = "client!kaa", name = "D", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array13;

	@OriginalMember(owner = "client!kaa", name = "J", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!kaa", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!kaa", name = "F", descriptor = "Lclient!mq;")
	public static final Class236 aClass236_3 = new Class236();

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIB)V")
	public static void method4416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) float local14 = (float) Static620.anInt8204 / (float) Static620.anInt8201;
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = arg0;
		if (local14 < 1.0F) {
			local18 = (int) (local14 * (float) arg1);
		} else {
			local16 = (int) ((float) arg0 / local14);
		}
		@Pc(44) int local44 = arg3 - (arg1 - local16) / 2;
		@Pc(53) int local53 = arg2 - (arg0 - local18) / 2;
		Static235.anInt4321 = Static620.anInt8204 - local53 * Static620.anInt8204 / local18;
		Static196.anInt3883 = local44 * Static620.anInt8201 / local16;
		Static523.anInt8995 = -1;
		Static181.anInt3236 = -1;
		Static494.method7232();
	}

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "(I)V")
	public static void method4417() {
		if (Static422.aClass93_3 != null) {
			Static422.aClass93_3.method6357();
		}
		if (Static505.aClass93_4 != null) {
			Static505.aClass93_4.method6357();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V")
	public static void method4418() {
		@Pc(7) Class79 local7 = null;
		try {
			@Pc(13) Class91 local13 = Static470.aClass100_14.method2085("");
			while (local13.anInt2271 == 0) {
				Static314.method4821(1L);
			}
			if (local13.anInt2271 == 1) {
				local7 = (Class79) local13.anObject2;
				@Pc(33) Class5_Sub22 local33 = Static97.aClass5_Sub25_8.method3678();
				local7.method1660(0, local33.aByteArray71, local33.anInt6629);
			}
		} catch (@Pc(43) Exception local43) {
		}
		try {
			if (local7 != null) {
				local7.method1662();
			}
		} catch (@Pc(50) Exception local50) {
		}
	}
}
