import jagex3.jagmisc.jagmisc;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "Lclient!lt;")
	public static final Class185 aClass185_1 = new Class185("WIP", 2);

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "[I")
	public static final int[] anIntArray39 = new int[13];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!lp;ILjava/lang/String;)Lclient!qo;")
	public static Class243 method865(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method4811(arg2);
		}
		@Pc(45) Class243 local45;
		if (arg0 == 1) {
			try {
				Static554.method4838("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, arg1.anApplet1);
				local45 = new Class243();
				local45.anInt6905 = 1;
				return local45;
			} catch (@Pc(51) Throwable local51) {
				local45 = new Class243();
				local45.anInt6905 = 2;
				return local45;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local45 = new Class243();
				local45.anInt6905 = 1;
				return local45;
			} catch (@Pc(87) Exception local87) {
				local45 = new Class243();
				local45.anInt6905 = 2;
				return local45;
			}
		} else if (arg0 == 3) {
			try {
				Static554.method4839(arg1.anApplet1, "loggedout");
			} catch (@Pc(107) Throwable local107) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local45 = new Class243();
				local45.anInt6905 = 1;
				return local45;
			} catch (@Pc(129) Exception local129) {
				local45 = new Class243();
				local45.anInt6905 = 2;
				return local45;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIZ)I")
	public static int method866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub49 local8 = Static393.method5919(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(29) int local29 = 0; local29 < local8.anIntArray746.length; local29++) {
				if (local8.anIntArray747[local29] == arg0) {
					local19 += local8.anIntArray746[local29];
				}
			}
			return local19;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZBI)V")
	public static void method867(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static478.aClass9_10 = Static383.method7645(Static389.anInterface8_10, Static89.aClass1_Sub28_Sub1_1.anInt4890 * 2, 0, Static40.aClass160_5, Static78.aCanvas7);
		} else {
			if (arg0) {
				Static478.aClass9_10 = Static383.method7645(Static389.anInterface8_10, 0, 0, Static40.aClass160_5, Static78.aCanvas7);
				Static478.aClass9_10.Z(0);
				@Pc(24) Class177 local24 = Static384.method5813(Static309.aClass160_69, Static517.anInt8717);
				@Pc(33) Class27 local33 = Static478.aClass9_10.method7603(local24, Static559.method5935(Static390.aClass160_80, Static517.anInt8717));
				Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993), true, local33);
				Static153.method3117();
				Static478.aClass9_10.method7585();
			}
			try {
				Static478.aClass9_10 = Static383.method7645(Static389.anInterface8_10, Static89.aClass1_Sub28_Sub1_1.anInt4890 * 2, arg1, Static40.aClass160_5, Static78.aCanvas7);
				if (Static478.aClass9_10.method7576()) {
					@Pc(62) boolean local62 = true;
					try {
						local62 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(72) Throwable local72) {
					}
					@Pc(78) Class1_Sub16 local78;
					if (local62) {
						local78 = Static478.aClass9_10.method7629(146800640);
					} else {
						local78 = Static478.aClass9_10.method7629(104857600);
					}
					Static478.aClass9_10.method7600(local78);
				}
			} catch (@Pc(88) Throwable local88) {
				Static478.aClass9_10 = Static383.method7645(Static389.anInterface8_10, 0, 0, Static40.aClass160_5, Static78.aCanvas7);
				arg1 = 0;
			}
		}
		Static526.anInt8926 = arg1;
		Static213.method3845();
		if (!Static478.aClass9_10.method7605()) {
			Static442.anInt7959 = 1;
		}
		Static478.aClass9_10.method7643(Static442.anInt7959);
		Static478.aClass9_10.method7596(0);
		Static478.aClass9_10.L(8);
		Static56.aClass22_5 = Static478.aClass9_10.method7644();
		Static163.aClass22_6 = Static478.aClass9_10.method7644();
		Static442.method6768();
		Static478.aClass9_10.method7615(!Static89.aClass1_Sub28_Sub1_1.aBoolean317);
		if (Static478.aClass9_10.method7601()) {
			Static138.method7943(Static89.aClass1_Sub28_Sub1_1.aBoolean330);
		}
		Static485.method7021(Static478.aClass9_10, Static36.anInt1324 >> 3, Static542.anInt9387 >> 3);
		Static157.method3127();
		Static521.aBoolean614 = false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!vp;III)V")
	public static void method868(@OriginalArg(0) Class309 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static77.aClass309_3 = arg0;
		Static313.anInt5978 = arg1;
		Static145.anInt3324 = arg2;
	}
}
