import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString154 = null;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
	public static int[] anIntArray516 = new int[1000];

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt4956 = -1;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString155 = "level: ";

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt4960 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JI)V")
	public static void method3931(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ag;I)V")
	public static void method3932(@OriginalArg(0) Class7_Sub1 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static59.anIntArray156.length; local7++) {
			Static59.anIntArray156[local7] = 0;
		}
		@Pc(35) int local35;
		for (local7 = 0; local7 < 5000; local7++) {
			local35 = (int) (Math.random() * 128.0D * (double) 256);
			Static59.anIntArray156[local35] = (int) (Math.random() * 284.0D);
		}
		@Pc(65) int local65;
		@Pc(74) int local74;
		for (local7 = 0; local7 < 20; local7++) {
			for (local35 = 1; local35 < 255; local35++) {
				for (local65 = 1; local65 < 127; local65++) {
					local74 = (local35 << 7) + local65;
					Static180.anIntArray364[local74] = (Static59.anIntArray156[local74 - 128] + Static59.anIntArray156[local74 + 1] + Static59.anIntArray156[local74 + -1] + Static59.anIntArray156[local74 + 128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static59.anIntArray156;
			Static59.anIntArray156 = Static180.anIntArray364;
			Static180.anIntArray364 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local35 = 0; local35 < arg0.anInt5433; local35++) {
			for (local65 = 0; local65 < arg0.anInt5432; local65++) {
				if (arg0.aByteArray1[local7++] != 0) {
					@Pc(153) int local153 = local35 + arg0.anInt5426 + 16;
					local74 = arg0.anInt5429 + local65 + 16;
					@Pc(166) int local166 = (local153 << 7) + local74;
					Static59.anIntArray156[local166] = 0;
				}
			}
		}
	}
}
