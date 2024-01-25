import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bo", name = "U", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
	public static int anInt659;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
	public static final int anInt652 = 0;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "Lclient!hc;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!bo", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString26 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
	public static int anInt657 = 0;

	@OriginalMember(owner = "client!bo", name = "X", descriptor = "[I")
	public static final int[] anIntArray42 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bo", name = "Y", descriptor = "[I")
	public static final int[] anIntArray43 = new int[14];

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(B)V")
	public static void method720() {
		Static189.aClass11_135.method214();
		Static348.aClass11_123.method214();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static223.aClass76_9.method2256(Static325.aString231);
		@Pc(25) int local25;
		for (@Pc(17) Class14_Sub23 local17 = (Class14_Sub23) Static95.aClass18_9.method459(); local17 != null; local17 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			local25 = Static343.method5862(local17);
			if (local12 < local25) {
				local12 = local25;
			}
		}
		local12 += 8;
		local25 = Static41.anInt980 * 16 + 21;
		@Pc(55) int local55 = arg1 - local12 / 2;
		if (local12 + local55 > Static294.anInt5659) {
			local55 = Static294.anInt5659 - local12;
		}
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(78) int local78 = arg0;
		if (arg0 + local25 > Static46.anInt1173) {
			local78 = Static46.anInt1173 - local25;
		}
		if (local78 < 0) {
			local78 = 0;
		}
		Static349.anInt6632 = local55;
		Static147.anInt2656 = (Static45.aBoolean80 ? 26 : 22) + Static41.anInt980 * 16;
		Static302.aBoolean409 = true;
		Static124.anInt2716 = local12;
		Static127.anInt2787 = local78;
	}
}
