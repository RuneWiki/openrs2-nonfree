import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "F")
	public static float aFloat206;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt10667;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static final int[] anIntArray580 = new int[1];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)Z")
	public static boolean method8751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z")
	public static boolean method8752() {
		return Static634.method5642("jaclib") ? Static634.method5642("hw3d") : false;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method8753() {
		if (Static388.aClass41_2 != null) {
			Static388.aClass41_2.method7709();
		}
		if (Static665.aClass41_3 != null) {
			Static665.aClass41_3.method7709();
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method8754() {
		Static491.aClass95_11.xa(((float) Static336.aClass3_Sub41_18.aClass14_Sub14_1.method4344() * 0.1F + 0.7F) * Static595.aFloat185);
		Static491.aClass95_11.ZA(Static295.anInt5040, Static261.aFloat76, aFloat206, (float) (Static372.anInt6288 << 2), (float) (Static349.anInt6010 << 2), (float) (Static639.anInt10531 << 2));
		Static491.aClass95_11.method7989(Static127.aClass57_3);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!fea;I)I")
	public static int method8755(@OriginalArg(0) Class112 arg0) {
		if (Static134.aClass112_9 == arg0) {
			return 7681;
		} else if (Static617.aClass112_28 == arg0) {
			return 8448;
		} else if (Static315.aClass112_22 == arg0) {
			return 34165;
		} else if (arg0 == Static461.aClass112_52) {
			return 260;
		} else if (arg0 == Static214.aClass112_46) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
