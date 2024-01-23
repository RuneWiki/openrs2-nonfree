import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt1791;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[Lclient!r;")
	public static Class73[] aClass73Array2;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_560 = Static200.method3116("Texturen geladen)3");

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public static int anInt1793 = 0;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lclient!fc;")
	public static Class30[] aClass30Array1 = new Class30[50];

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_561 = null;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1317() {
		@Pc(10) int local10 = Static16.aClass1_Sub9_Sub1_1.method949(8);
		@Pc(15) int local15;
		if (local10 < Static205.anInt4356) {
			for (local15 = local10; local15 < Static205.anInt4356; local15++) {
				Static122.anIntArray343[Static59.anInt1503++] = Static124.anIntArray353[local15];
			}
		}
		if (Static205.anInt4356 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static205.anInt4356 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(54) int local54 = Static124.anIntArray353[local15];
			@Pc(58) Class9_Sub4_Sub1 local58 = Static41.aClass9_Sub4_Sub1Array2[local54];
			@Pc(63) int local63 = Static16.aClass1_Sub9_Sub1_1.method949(1);
			if (local63 == 0) {
				Static124.anIntArray353[Static205.anInt4356++] = local54;
				local58.anInt3907 = Static42.anInt910;
			} else {
				@Pc(83) int local83 = Static16.aClass1_Sub9_Sub1_1.method949(2);
				if (local83 == 0) {
					Static124.anIntArray353[Static205.anInt4356++] = local54;
					local58.anInt3907 = Static42.anInt910;
					Static180.anIntArray502[Static192.anInt4121++] = local54;
				} else {
					@Pc(130) int local130;
					@Pc(140) int local140;
					if (local83 == 1) {
						Static124.anIntArray353[Static205.anInt4356++] = local54;
						local58.anInt3907 = Static42.anInt910;
						local130 = Static16.aClass1_Sub9_Sub1_1.method949(3);
						local58.method2904(false, local130);
						local140 = Static16.aClass1_Sub9_Sub1_1.method949(1);
						if (local140 == 1) {
							Static180.anIntArray502[Static192.anInt4121++] = local54;
						}
					} else if (local83 == 2) {
						Static124.anIntArray353[Static205.anInt4356++] = local54;
						local58.anInt3907 = Static42.anInt910;
						local130 = Static16.aClass1_Sub9_Sub1_1.method949(3);
						local58.method2904(true, local130);
						local140 = Static16.aClass1_Sub9_Sub1_1.method949(3);
						local58.method2904(true, local140);
						@Pc(196) int local196 = Static16.aClass1_Sub9_Sub1_1.method949(1);
						if (local196 == 1) {
							Static180.anIntArray502[Static192.anInt4121++] = local54;
						}
					} else if (local83 == 3) {
						Static122.anIntArray343[Static59.anInt1503++] = local54;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1318(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static176.aClass51_2);
		arg0.removeMouseMotionListener(Static176.aClass51_2);
		arg0.removeFocusListener(Static176.aClass51_2);
		Static10.anInt342 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public static void method1320(@OriginalArg(0) int arg0) {
		if (Static186.anInt3973 == 0) {
			Static37.aClass1_Sub7_Sub3_2.method3426(arg0);
		} else {
			Static156.anInt3478 = arg0;
		}
	}
}
