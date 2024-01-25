import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt7840 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_239 = new Class235(82, 8);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!bd;[[BB)V")
	public static void method6296(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static269.aByteArrayArray20.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(28) int local28 = (Static566.anIntArray710[local10] >> 8) * 64 - Static541.anInt9058;
				@Pc(39) int local39 = (Static566.anIntArray710[local10] & 0xFF) * 64 - Static116.anInt2289;
				Static510.method7089();
				arg0.method416(local16, Static478.aClass59Array2, local28, local39, Static16.aClass134_1);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public static void method6297() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static227.aBooleanArray6[local3] = false;
		}
		Static196.anInt3664 = -1;
		Static243.anInt4483 = -1;
		Static442.anInt7679 = -1;
		Static336.anInt5683 = 0;
		Static581.anInt6126 = 0;
		Static402.anInt7038 = Static561.anInt9344;
		Static340.anInt5707 = 5;
		Static520.anInt8824 = Static59.anInt1132;
		Static147.anInt2734 = Static301.anInt5197;
		Static113.anInt2218 = Static405.anInt7085;
		Static434.anInt7642 = Static295.anInt5077;
		Static110.anInt2171 = -1;
		Static376.anInt6285 = Static103.anInt2093;
	}
}
