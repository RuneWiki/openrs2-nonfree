import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dga", name = "N", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!dga", name = "L", descriptor = "Lclient!cp;")
	public static final Class60 aClass60_2 = new Class60();

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B[S)[S")
	public static short[] method1767(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static679.method4132(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILclient!cea;Ljava/awt/Component;B)Lclient!iv;")
	public static Class34 method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) Component arg3) {
		if (Static237.anInt4718 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(41) Class34 local41 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
			local41.anIntArray335 = new int[(Static41.aBoolean53 ? 2 : 1) * 256];
			local41.anInt7065 = arg0;
			local41.method6332(arg3);
			local41.anInt7070 = (arg0 & 0xFFFFFC00) + 1024;
			if (local41.anInt7070 > 16384) {
				local41.anInt7070 = 16384;
			}
			local41.method6324(local41.anInt7070);
			if (Static216.anInt4467 > 0 && Static385.aClass350_1 == null) {
				Static385.aClass350_1 = new Class350();
				Static385.aClass350_1.aClass48_7 = arg2;
				arg2.method1317(Static216.anInt4467, Static385.aClass350_1);
			}
			if (Static385.aClass350_1 != null) {
				if (Static385.aClass350_1.aClass34Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static385.aClass350_1.aClass34Array1[arg1] = local41;
			}
			return local41;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class34_Sub2 local119 = new Class34_Sub2(arg2, arg1);
				local119.anInt7065 = arg0;
				local119.anIntArray335 = new int[(Static41.aBoolean53 ? 2 : 1) * 256];
				local119.method6332(arg3);
				local119.anInt7070 = 16384;
				local119.method6324(local119.anInt7070);
				if (Static216.anInt4467 > 0 && Static385.aClass350_1 == null) {
					Static385.aClass350_1 = new Class350();
					Static385.aClass350_1.aClass48_7 = arg2;
					arg2.method1317(Static216.anInt4467, Static385.aClass350_1);
				}
				if (Static385.aClass350_1 != null) {
					if (Static385.aClass350_1.aClass34Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static385.aClass350_1.aClass34Array1[arg1] = local119;
				}
				return local119;
			} catch (@Pc(178) Throwable local178) {
				return new Class34();
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BZ)V")
	public static void method1769(@OriginalArg(1) boolean arg0) {
		@Pc(9) int local9 = Static315.anInt5681;
		@Pc(11) int local11 = Static309.anInt5585;
		if (arg0 && Static110.aBoolean800) {
			local9 <<= 0x1;
			local11 = -local9;
		}
		Static607.aClass101_15.f(local11, local9);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!us;I)V")
	public static void method1770(@OriginalArg(0) int arg0, @OriginalArg(1) Class363 arg1) {
		if (Static521.aBoolean519) {
			Static521.aBoolean519 = false;
			arg0 = 0;
		}
		if (Static458.aClass363_2 != null && Static458.aClass363_2.method9220(arg1)) {
			return;
		}
		Static458.aClass363_2 = arg1;
		Static633.aLong293 = Static99.method1701();
		Static626.anInt10884 = arg0;
		Static440.anInt8001 = arg0;
		if (Static440.anInt8001 == 0) {
			Static107.method1935();
			return;
		}
		Static91.aFloat15 = Static88.aFloat14;
		Static409.aFloat162 = Static240.aFloat91;
		Static130.aFloat39 = Static474.aFloat177;
		Static259.aFloat92 = Static202.aFloat85;
		Static376.aClass3_3 = Static283.aClass3_2;
		Static214.aFloat87 = Static489.aFloat178;
		Static398.anInt7406 = Static383.anInt7254;
		Static184.aFloat81 = Static21.aFloat1;
		Static457.anInt8187 = Static427.anInt7842;
		Static543.anInt9487 = Static567.anInt9848;
	}
}
