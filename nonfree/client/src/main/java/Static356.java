import java.awt.Canvas;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "Lclient!mi;")
	public static Class46 aClass46_21;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "S")
	public static short aShort73 = 256;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_136 = new Class215(24, 6);

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "Z")
	public static boolean aBoolean506 = false;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)I")
	public static int method5897() {
		@Pc(7) int local7 = 0;
		@Pc(25) Field[] local25 = dh.class.getDeclaredFields();
		for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
			@Pc(35) Field local35 = local25[local29];
			if (su.class.isAssignableFrom(local35.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!cea;Lclient!wea;I)V")
	public static void method5899(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1, @OriginalArg(2) Class370 arg2) {
		@Pc(9) Class2_Sub10 local9 = new Class2_Sub10();
		local9.anInt1927 = arg1.method8383();
		local9.anInt1929 = arg1.method8381();
		local9.anIntArray82 = new int[local9.anInt1927];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt1927][][];
		local9.aClass240Array1 = new Class240[local9.anInt1927];
		local9.aClass240Array2 = new Class240[local9.anInt1927];
		local9.anIntArray81 = new int[local9.anInt1927];
		local9.anIntArray83 = new int[local9.anInt1927];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt1927; local55++) {
			try {
				@Pc(61) int local61 = arg1.method8383();
				@Pc(86) String local86;
				@Pc(90) String local90;
				@Pc(94) int local94;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local86 = arg1.method8373();
					local90 = arg1.method8373();
					local94 = 0;
					if (local61 == 1) {
						local94 = arg1.method8381();
					}
					local9.anIntArray82[local55] = local61;
					local9.anIntArray83[local55] = local94;
					local9.aClass240Array2[local55] = arg2.method9078(local90, Static14.method294(local86));
				} else if (local61 == 3 || local61 == 4) {
					local86 = arg1.method8373();
					local90 = arg1.method8373();
					local94 = arg1.method8383();
					@Pc(97) String[] local97 = new String[local94];
					for (@Pc(99) int local99 = 0; local99 < local94; local99++) {
						local97[local99] = arg1.method8373();
					}
					@Pc(114) byte[][] local114 = new byte[local94][];
					@Pc(125) int local125;
					if (local61 == 3) {
						for (@Pc(119) int local119 = 0; local119 < local94; local119++) {
							local125 = arg1.method8381();
							local114[local119] = new byte[local125];
							arg1.method8385(0, local125, local114[local119]);
						}
					}
					local9.anIntArray82[local55] = local61;
					@Pc(150) Class[] local150 = new Class[local94];
					for (local125 = 0; local125 < local94; local125++) {
						local150[local125] = Static14.method294(local97[local125]);
					}
					local9.aClass240Array1[local55] = arg2.method9065(local150, Static14.method294(local86), local90);
					local9.aByteArrayArrayArray3[local55] = local114;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.anIntArray81[local55] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.anIntArray81[local55] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.anIntArray81[local55] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.anIntArray81[local55] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.anIntArray81[local55] = -5;
			}
		}
		Static489.aClass341_58.method8528(local9);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lclient!pi;")
	public static Class2_Sub31 method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class2_Sub31_Sub1");
			@Pc(15) Class2_Sub31 local15 = (Class2_Sub31) local11.getDeclaredConstructor().newInstance();
			local15.method5139(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class2_Sub31_Sub2 local28 = new Class2_Sub31_Sub2();
			local28.method5139(arg1, arg2, arg0);
			return local28;
		}
	}
}
