import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!h", name = "K", descriptor = "Lclient!td;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Ljava/lang/String;")
	public static final String aString177 = "glow3:";

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2152(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ap;IILclient!bd;)V")
	public static void method2153(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class21 arg2) {
		@Pc(9) Class7_Sub19 local9 = new Class7_Sub19();
		local9.anInt3297 = arg0.method2772();
		local9.anInt3300 = arg0.method2767();
		local9.anIntArray439 = new int[local9.anInt3297];
		local9.aClass99Array1 = new Class99[local9.anInt3297];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt3297][][];
		local9.anIntArray438 = new int[local9.anInt3297];
		local9.aClass99Array2 = new Class99[local9.anInt3297];
		local9.anIntArray437 = new int[local9.anInt3297];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3297; local51++) {
			try {
				@Pc(62) int local62 = arg0.method2772();
				@Pc(86) String local86;
				@Pc(90) String local90;
				@Pc(94) int local94;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local86 = arg0.method2782();
					local90 = arg0.method2782();
					local94 = 0;
					if (local62 == 1) {
						local94 = arg0.method2767();
					}
					local9.anIntArray438[local51] = local62;
					local9.anIntArray439[local51] = local94;
					local9.aClass99Array1[local51] = arg2.method384(Static327.method5238(local86), local90);
				} else if (local62 == 3 || local62 == 4) {
					local86 = arg0.method2782();
					local90 = arg0.method2782();
					local94 = arg0.method2772();
					@Pc(97) String[] local97 = new String[local94];
					for (@Pc(99) int local99 = 0; local99 < local94; local99++) {
						local97[local99] = arg0.method2782();
					}
					@Pc(118) byte[][] local118 = new byte[local94][];
					@Pc(131) int local131;
					if (local62 == 3) {
						for (@Pc(125) int local125 = 0; local125 < local94; local125++) {
							local131 = arg0.method2767();
							local118[local125] = new byte[local131];
							arg0.method2793(local131, local118[local125]);
						}
					}
					local9.anIntArray438[local51] = local62;
					@Pc(160) Class[] local160 = new Class[local94];
					for (local131 = 0; local131 < local94; local131++) {
						local160[local131] = Static327.method5238(local97[local131]);
					}
					local9.aClass99Array2[local51] = arg2.method381(local90, local160, Static327.method5238(local86));
					local9.aByteArrayArrayArray6[local51] = local118;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local9.anIntArray437[local51] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local9.anIntArray437[local51] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local9.anIntArray437[local51] = -3;
			} catch (@Pc(260) Exception local260) {
				local9.anIntArray437[local51] = -4;
			} catch (@Pc(267) Throwable local267) {
				local9.anIntArray437[local51] = -5;
			}
		}
		Static157.aClass74_21.method1802(local9);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
	public static void method2154() {
		Static305.aClass103_62.method2679(5);
		Static177.aClass103_29.method2679(5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ)V")
	public static void method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(15, 0);
		local8.method4790();
		local8.anInt5696 = arg0;
		local8.anInt5687 = arg1;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lclient!ks;")
	public static Class126 method2159(@OriginalArg(0) int arg0) {
		@Pc(5) Class103 local5 = Static193.aClass103_36;
		@Pc(23) Class126 local23;
		synchronized (Static193.aClass103_36) {
			local23 = (Class126) Static193.aClass103_36.method2682((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(43) byte[] local43 = Static86.aClass180_24.method4560(Static177.method3287(arg0), Static176.method3282(arg0));
		local23 = new Class126();
		if (local43 != null) {
			local23.method3300(new Class7_Sub3(local43));
		}
		local5 = Static193.aClass103_36;
		synchronized (Static193.aClass103_36) {
			Static193.aClass103_36.method2687(local23, (long) arg0);
			return local23;
		}
	}
}
