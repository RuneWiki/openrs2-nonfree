import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_145 = new Class268(64, -1);

	@OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
	public static int anInt8106 = -1;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)V")
	public static void method6998() {
		for (@Pc(8) int local8 = 0; local8 < Static197.aByteArrayArrayArray24.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static197.aByteArrayArrayArray24[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static197.aByteArrayArrayArray24[0][0].length; local16++) {
					Static197.aByteArrayArrayArray24[local8][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBI)V")
	public static void method7000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(15, 0);
		local8.method3723();
		local8.anInt4294 = arg1;
		local8.anInt4291 = arg0;
	}
}
