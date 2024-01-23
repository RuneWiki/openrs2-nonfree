import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Z")
	public static boolean aBoolean281;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public static int anInt4077;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
	public static int[] anIntArray333 = new int[1000];

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	public static int anInt4071 = 0;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[S")
	public static short[] aShortArray59 = new short[256];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!nf;IIB)Ljava/awt/Frame;")
	public static Frame method3279(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1.method2989()) {
			return null;
		}
		@Pc(22) Class191[] local22 = Static293.method4624(arg1);
		if (local22 == null) {
			return null;
		}
		@Pc(29) boolean local29 = false;
		for (@Pc(31) int local31 = 0; local31 < local22.length; local31++) {
			if (local22[local31].anInt5845 == arg2 && arg3 == local22[local31].anInt5843 && (!local29 || local22[local31].anInt5844 > arg0)) {
				local29 = true;
				arg0 = local22[local31].anInt5844;
			}
		}
		if (!local29) {
			return null;
		}
		@Pc(104) Class10 local104 = arg1.method3001(arg3, arg0, arg2);
		while (local104.anInt151 == 0) {
			Static202.method3246(10L);
		}
		@Pc(116) Frame local116 = (Frame) local104.anObject1;
		if (local116 == null) {
			return null;
		} else if (local104.anInt151 == 2) {
			Static194.method3152(arg1, local116);
			return null;
		} else {
			return local116;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	public static void method3280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Static311.aBoolean427) {
			arg0 = 2;
			arg1 = 2;
		}
		if (arg0 != Static224.anInt4349) {
			if (Static12.aBoolean10) {
				return;
			}
			if (Static224.anInt4349 != 0) {
				Static278.anInterface2Array1[Static224.anInt4349].method3761();
			}
			if (arg0 != 0) {
				@Pc(48) Interface2 local48 = Static278.anInterface2Array1[arg0];
				local48.method3762();
				local48.method3763(arg1);
			}
			Static224.anInt4349 = arg0;
			Static106.anInt2117 = arg1;
		} else if (arg0 != 0 && Static106.anInt2117 != arg1) {
			Static278.anInterface2Array1[arg0].method3763(arg1);
			Static106.anInt2117 = arg1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIILjava/awt/Component;)Lclient!rk;")
	public static Class62 method3283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class62_Sub2");
			@Pc(10) Class62 local10 = (Class62) local6.getDeclaredConstructor().newInstance();
			local10.method4463(arg0, arg2, arg1);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class62_Sub1 local29 = new Class62_Sub1();
			local29.method4463(arg0, arg2, arg1);
			return local29;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method3284() {
		Static242.aClass169_131.method4020(5);
		Static270.aClass169_141.method4020(5);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)J")
	public static long method3285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass102_1 == null ? 0L : local7.aClass102_1.aLong113;
	}
}
