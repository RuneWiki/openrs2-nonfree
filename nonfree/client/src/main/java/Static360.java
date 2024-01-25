import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!pu;")
	public static Class270 aClass270_68;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "Lclient!u;")
	public static final Class323 aClass323_3 = new Class323();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)I")
	public static int method4778(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	public static void method4786() {
		if (Static9.method101(Static216.anInt4135) || Static237.method3602(Static216.anInt4135)) {
			Static506.method7063(Static59.anInt1132 >> 12, 5000, Static405.anInt7085 >> 12);
		} else {
			@Pc(27) int local27 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] >> 3;
			@Pc(34) int local34 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] >> 3;
			if (local27 >= 0 && local27 < Static71.anInt1410 >> 3 && local34 >= 0 && Static471.anInt8012 >> 3 > local34) {
				Static506.method7063(local34, 5000, local27);
			} else {
				Static506.method7063(Static471.anInt8012 >> 4, 0, Static71.anInt1410 >> 4);
			}
		}
		Static408.method5643();
		Static343.method4699();
		Static317.method4387();
		Static31.method420();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V")
	public static void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub6_Sub16 local10 = Static212.method3332(9, arg0);
		local10.method6594();
		local10.anInt8204 = arg1;
		local10.anInt8208 = arg2;
	}
}
