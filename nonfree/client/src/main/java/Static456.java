import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Lclient!gp;")
	public static Class117 aClass117_191;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public static int anInt7874;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "F")
	public static float aFloat330;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public static int anInt7875;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_193 = new Class150(32, 0);

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "[I")
	public static final int[] anIntArray599 = new int[5];

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "[Lclient!bs;")
	public static final Interface1[] anInterface1Array2 = new Interface1[75];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
	public static int method6376(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static441.method6250(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!od;[[BI)V")
	public static void method6377(@OriginalArg(0) Class130_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static124.aByteArrayArray13.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static103.anIntArray76[local10] >> 8) * 64 - Static515.anInt3214;
				@Pc(40) int local40 = (Static103.anIntArray76[local10] & 0xFF) * 64 - Static338.anInt6353;
				Static485.method6727();
				arg0.method5434(Static71.aClass10Array3, Static110.aClass62_15, local29, local16, local40);
			}
		}
	}
}
