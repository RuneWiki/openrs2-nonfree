import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public static int anInt7599;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "[Lclient!nha;")
	public static Class9_Sub8[] aClass9_Sub8Array1;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_246 = new Class194(113, -1);

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Lclient!sga;")
	public static final Class306 aClass306_3 = new Class306();

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!jk;")
	public static RuntimeException_Sub1 method6616(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString41 = local12.aString41 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZJ)V")
	public static void method6618(@OriginalArg(1) long arg0) {
		if (Static567.aClass351ArrayArrayArray4 != null) {
			if (Static471.anInt8064 == 1 || Static471.anInt8064 == 5) {
				Static284.method4609(arg0);
			} else if (Static471.anInt8064 == 4) {
				Static92.method1553(arg0);
			}
		}
		Static344.method5466((long) Static304.anInt8391, Static266.aClass82_8);
		if (Static528.anInt8950 != -1) {
			Static135.method2358(Static528.anInt8950);
		}
		for (@Pc(39) int local39 = 0; local39 < Static453.anInt7674; local39++) {
			if (Static110.aBooleanArray5[local39]) {
				Static356.aBooleanArray21[local39] = true;
			}
			Static125.aBooleanArray14[local39] = Static110.aBooleanArray5[local39];
			Static110.aBooleanArray5[local39] = false;
		}
		Static472.anInt8085 = Static304.anInt8391;
		Static286.method4620(-1, (Class344) null, -1);
		Static558.method7940((Class344) null, -1, -1);
		if (Static528.anInt8950 != -1) {
			Static453.anInt7674 = 0;
			Static143.method2416();
		}
		Static266.aClass82_8.la();
		Static324.method5360(Static266.aClass82_8);
		@Pc(100) int local100 = Static97.method1659();
		if (local100 == -1) {
			local100 = Static80.anInt1600;
		}
		if (local100 == -1) {
			local100 = Static111.anInt2222;
		}
		Static232.method3991(local100);
		@Pc(120) int local120 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() << 8;
		Static309.method5174(Static487.anInt8277, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, local120 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152, local120 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158);
		Static487.anInt8277 = 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
	public static void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static366.aClass82_11 == null) {
			return;
		}
		@Pc(15) int local15 = Static492.anInt8358;
		@Pc(17) int local17 = Static515.anInt8713;
		Static308.method1830(arg1, arg0);
		if (Static424.anInt7715 == 0) {
			Static115.anInterface7_2 = null;
			Static115.anInterface7_2 = Static366.aClass82_11.method6143(Static366.aClass82_11.method6163(Static646.anInt4677, Static606.anInt9796), Static366.aClass82_11.method6182(Static646.anInt4677, Static606.anInt9796));
		} else if (Static424.anInt7715 == 1 && (Static494.anInterface7Array1 == null || Static492.anInt8358 != local15 || Static515.anInt8713 != local17)) {
			Static494.anInterface7Array1 = new Interface7[Static515.anInt8713 * Static492.anInt8358];
			for (@Pc(63) int local63 = 0; local63 < Static494.anInterface7Array1.length; local63++) {
				Static494.anInterface7Array1[local63] = Static366.aClass82_11.method6143(Static366.aClass82_11.method6163(Static557.anInt9256, Static126.anInt2688), Static366.aClass82_11.method6182(Static557.anInt9256, Static126.anInt2688));
			}
			Static624.anInt9972 = 1;
			Static241.anIntArray264 = new int[Static515.anInt8713 * Static492.anInt8358];
		}
		Static334.aBoolean462 = true;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!uq;ZZ)V")
	public static void method6622(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean770 = arg1;
		if (Static302.aBoolean437) {
			Static197.aClass250Array1[Static197.aClass250Array1.length - 1].method6322(arg0);
		} else {
			Static11.method200(arg0, Static402.aClass3_Sub22Array5);
		}
	}
}
