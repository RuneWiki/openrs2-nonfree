import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Lclient!ph;")
	public static Class138 aClass138_52;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[Lclient!vk;")
	public static Class1_Sub1_Sub24[] aClass1_Sub1_Sub24Array4 = new Class1_Sub1_Sub24[14];

	@OriginalMember(owner = "client!od", name = "G", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!od", name = "K", descriptor = "[Lclient!qm;")
	public static Class22_Sub3_Sub2[] aClass22_Sub3_Sub2Array1 = new Class22_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!od", name = "N", descriptor = "I")
	public static int anInt3969 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Lclient!mf;")
	public static Class112 method3169(@OriginalArg(1) int arg0) {
		@Pc(10) Class112 local10 = (Class112) Static197.aClass169_109.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static242.aClass138_65.method3346(Static53.method905(arg0), Static191.method3137(arg0));
		local10 = new Class112();
		local10.anInt3514 = arg0;
		if (local33 != null) {
			local10.method2826(new Class1_Sub14(local33));
		}
		local10.method2816();
		Static197.aClass169_109.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method3171() {
		Static282.aClass169_150.method4014();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!vn;Z)V")
	public static void method3172(@OriginalArg(1) Class1_Sub32 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = (int) arg0.aLong223;
		@Pc(18) int local18 = arg0.anInt5722;
		arg0.method4616();
		if (arg1) {
			Static191.method3136(local18);
		}
		Static83.method1246(local18);
		@Pc(33) Class146 local33 = Static259.method3908(local15);
		if (local33 != null) {
			Static237.method2927(local33);
		}
		@Pc(41) int local41 = Static316.anInt5941;
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41; local43++) {
			if (Static279.method4132(Static241.aShortArray76[local43])) {
				Static109.method1790(local43);
			}
		}
		if (Static316.anInt5941 == 1) {
			Static108.aBoolean161 = false;
			Static94.method1387(Static78.anInt1455, Static143.anInt2824, Static44.anInt848, Static66.anInt1303);
		} else {
			Static94.method1387(Static78.anInt1455, Static143.anInt2824, Static44.anInt848, Static66.anInt1303);
			local43 = Static245.aClass1_Sub1_Sub12_2.method4438(Static143.aString98);
			for (@Pc(90) int local90 = 0; local90 < Static316.anInt5941; local90++) {
				@Pc(103) int local103 = Static245.aClass1_Sub1_Sub12_2.method4438(Static190.method3114(local90));
				if (local43 < local103) {
					local43 = local103;
				}
			}
			Static66.anInt1303 = Static316.anInt5941 * 15 + (Static37.aBoolean62 ? 26 : 22);
			Static44.anInt848 = local43 + 8;
		}
		if (Static287.anInt5450 != -1) {
			Static86.method1270(1, Static287.anInt5450);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BILclient!qf;II)V")
	public static void method3175(@OriginalArg(1) int arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static291.aBoolean404) {
			Static133.method2180(arg0, arg3, arg0 + arg1.anInt4345, arg3 + arg1.anInt4371);
		}
		if (Static128.anInt2551 < 3) {
			if (Static291.aBoolean404) {
				((Class1_Sub1_Sub3_Sub1) Static152.aClass1_Sub1_Sub3_5).method4644(arg0, arg3, arg1.anInt4345, arg1.anInt4371, Static152.aClass1_Sub1_Sub3_5.anInt5875 / 2, Static152.aClass1_Sub1_Sub3_5.anInt5887 / 2, (int) Static2.aFloat1, 256, (Class1_Sub1_Sub3_Sub1) arg1.method3519(false));
			} else {
				((Class1_Sub1_Sub3_Sub2) Static152.aClass1_Sub1_Sub3_5).method3474(arg0, arg3, arg1.anInt4345, arg1.anInt4371, Static152.aClass1_Sub1_Sub3_5.anInt5875 / 2, Static152.aClass1_Sub1_Sub3_5.anInt5887 / 2, (int) Static2.aFloat1, arg1.anIntArray362, arg1.anIntArray363);
			}
		} else if (Static291.aBoolean404) {
			@Pc(88) Class1_Sub1_Sub3 local88 = arg1.method3519(false);
			if (local88 != null) {
				local88.method4628(arg0, arg3);
			}
		} else {
			Static41.method737(arg0, arg3, arg1.anIntArray362, arg1.anIntArray363);
		}
		Static307.aBooleanArray65[arg2] = true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method3177(@OriginalArg(1) Class138 arg0) {
		Static143.aClass103_Sub2Array1 = Static9.method2423(Static296.anInt5600, arg0);
		Static50.anIntArray81 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static259.anIntArray453[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static259.anIntArray453[local15 + 1] >> 16 & 0xFF;
			@Pc(47) int local47 = Static259.anIntArray453[local15 + 1] >> 8 & 0xFF;
			@Pc(55) int local55 = Static259.anIntArray453[local15 + 1] & 0xFF;
			@Pc(63) float local63 = ((float) local37 - local27) / 64.0F;
			@Pc(72) float local72 = (float) (Static259.anIntArray453[local15] >> 8 & 0xFF);
			@Pc(80) float local80 = ((float) local47 - local72) / 64.0F;
			@Pc(87) float local87 = (float) (Static259.anIntArray453[local15] & 0xFF);
			@Pc(94) float local94 = ((float) local55 - local87) / 64.0F;
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				Static50.anIntArray81[local96 + local15 * 64] = (int) local87 | (int) local72 << 8 | (int) local27 << 16;
				local87 += local94;
				local27 += local63;
				local72 += local80;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static50.anIntArray81[local15] = Static259.anIntArray453[3];
		}
		Static167.anIntArray281 = new int[32768];
		Static95.anIntArray474 = new int[32768];
		Static134.method2181(null);
		Static311.anIntArray531 = new int[32768];
		Static258.anIntArray452 = new int[32768];
		Static287.aClass1_Sub1_Sub3_Sub2_4 = new Class1_Sub1_Sub3_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method3178(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static120.method1926(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static279.method4130(local7);
			local7 = Static15.method208("%3a", ":", local7);
			local7 = Static15.method208("%40", "@", local7);
			local7 = Static15.method208("%26", "&", local7);
			local7 = Static15.method208("%23", "#", local7);
			if (Static298.aClass117_4.anApplet1 == null) {
				return;
			}
			@Pc(105) Class10 local105 = Static298.aClass117_4.method3002(new URL(Static298.aClass117_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static53.anInt1015 + "&u=" + Static154.aLong122 + "&v1=" + Static181.aString118 + "&v2=" + Static181.aString116 + "&e=" + local7));
			while (local105.anInt151 == 0) {
				Static202.method3246(1L);
			}
			if (local105.anInt151 == 1) {
				@Pc(127) DataInputStream local127 = (DataInputStream) local105.anObject1;
				local127.read();
				local127.close();
			}
		} catch (@Pc(134) Exception local134) {
		}
	}
}
