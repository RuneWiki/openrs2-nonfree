import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "Lclient!ra;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_10 = new Class316(64);

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
	public static int anInt1960 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!n;)Lclient!qa;")
	public static Class9 method1889(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface8 arg1) {
		return new a(arg0, arg1);
	}

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)V")
	public static void method1891() {
		Static106.aClass125_1.method5266();
		for (@Pc(13) int local13 = 0; local13 < 32; local13++) {
			Static528.aLongArray15[local13] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static444.aLongArray14[local26] = 0L;
		}
		Static182.anInt3917 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)V")
	public static void method1893(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static416.anInt7252 - Static492.anInt8389;
		if (local8 >= 100) {
			Static464.anInt8003 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static362.aFloat128;
		if (local19 < Static497.anInt8449 >> 8) {
			local19 = Static497.anInt8449 >> 8;
		}
		if (Static385.aBooleanArray27[4] && Static282.anIntArray398[4] + 128 > local19) {
			local19 = Static282.anIntArray398[4] + 128;
		}
		@Pc(57) int local57 = (int) Static443.aFloat151 + Static157.anInt3480 & 0x3FFF;
		Static490.method7169(arg0, local19, Static126.anInt3030, local57, Static180.anInt3880, (local19 >> 3) * 3 + 600 << 0, Static74.method1954(Static245.anInt4747, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189) - 50);
		@Pc(102) float local102 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static308.anInt5918 = (int) (local102 * (float) (Static308.anInt5918 - Static494.anInt8411) + (float) Static494.anInt8411);
		Static411.anInt7178 = (int) ((float) Static203.anInt4295 + local102 * (float) (Static411.anInt7178 - Static203.anInt4295));
		Static347.anInt6404 = (int) ((float) Static457.anInt7744 + local102 * (float) (Static347.anInt6404 - Static457.anInt7744));
		Static520.anInt8842 = (int) (local102 * (float) (Static520.anInt8842 - Static224.anInt4517) + (float) Static224.anInt4517);
		@Pc(158) int local158 = Static339.anInt6337 - Static211.anInt4381;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static339.anInt6337 = (int) (local102 * (float) local158 + (float) Static211.anInt4381);
		Static339.anInt6337 &= 0x3FFF;
	}
}
