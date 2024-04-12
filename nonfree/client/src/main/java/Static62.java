import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!p;")
	public static Class45 aClass45_26;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 5)
	public static void method1096() {
		Class38.aClass40_486 = null;
		Class38.aClass40_488 = null;
		Class38.aClass40_482 = null;
		Class38.anIntArray339 = null;
		Class38.aClass40_487 = null;
		Class38.aClass40_484 = null;
		aClass45_26 = null;
		Class38.aClass40_485 = null;
		Class38.aClass40_483 = null;
		Class38.aClass40_489 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 38)
	public static void method1097(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Class49.aClass62_1);
		arg0.addMouseMotionListener(Class49.aClass62_1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V", line = 54)
	public static void method1098(@OriginalArg(0) boolean arg0) {
		Class57.anInt2146++;
		if (Class57.anInt2146 < 50 && !arg0) {
			return;
		}
		Class57.anInt2146 = 0;
		if (Class45.aBoolean164 || Static64.aClass25_36 == null) {
			return;
		}
		Class47.aClass2_Sub3_Sub1_4.method1736(217);
		try {
			Static64.aClass25_36.method731(Class47.aClass2_Sub3_Sub1_4.aByteArray24, Class47.aClass2_Sub3_Sub1_4.anInt2546);
			Class47.aClass2_Sub3_Sub1_4.anInt2546 = 0;
		} catch (@Pc(40) IOException local40) {
			Class45.aBoolean164 = true;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 79)
	public static void method1099() {
		if (Class57.anInt2139 == 2) {
			Static96.method1667(Class47.anInt1917 * 2, (client.anInt410 - Static79.anInt2058 << 7) + Class17.anInt441, Class2_Sub2_Sub12_Sub3.anInt1493 + (-Static28.anInt725 + Class51.anInt1952 << 7));
			if (Class14.anInt426 > -1 && Class24.anInt2511 % 20 < 10) {
				Static93.aClass2_Sub2_Sub2_Sub4Array10[0].method1624(Class14.anInt426 - 12, Class18_Sub1.anInt477 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)I", line = 137)
	public static int method1100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 166)
	public static void method1101() {
		@Pc(7) Class30 local7 = Class41.aClass30_1;
		synchronized (Class41.aClass30_1) {
			Class27.anInt1094 = Class17.anInt437;
			@Pc(20) int local20;
			if (Class2_Sub2_Sub8.anInt949 >= 0) {
				while (Class2_Sub2_Sub8.anInt949 != Class2_Sub2_Sub12_Sub1_Sub2.anInt2342) {
					local20 = Class45.anIntArray470[Class2_Sub2_Sub12_Sub1_Sub2.anInt2342];
					Class2_Sub2_Sub12_Sub1_Sub2.anInt2342 = Class2_Sub2_Sub12_Sub1_Sub2.anInt2342 + 1 & 0x7F;
					if (local20 >= 0) {
						Class2_Sub2_Sub15.aBooleanArray37[local20] = true;
					} else {
						Class2_Sub2_Sub15.aBooleanArray37[~local20] = false;
					}
				}
			} else {
				for (local20 = 0; local20 < 112; local20++) {
					Class2_Sub2_Sub15.aBooleanArray37[local20] = false;
				}
				Class2_Sub2_Sub8.anInt949 = Class2_Sub2_Sub12_Sub1_Sub2.anInt2342;
			}
			Class17.anInt437 = Class2_Sub2_Sub12_Sub6.anInt2226;
		}
	}
}
