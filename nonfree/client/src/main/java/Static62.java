import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
	public static int anInt1380;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString71 = "flash1:";

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
	public static int anInt1374 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1200(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(14) int local14 = arg1.length();
		if (local11 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(26) int local26 = local8;
		@Pc(31) int local31 = local14 - local11;
		if (local31 != 0) {
			@Pc(37) int local37 = 0;
			while (true) {
				local37 = arg0.indexOf(arg2, local37);
				if (local37 < 0) {
					break;
				}
				local26 += local31;
				local37 += local11;
			}
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local26);
		@Pc(66) int local66 = 0;
		while (true) {
			@Pc(71) int local71 = arg0.indexOf(arg2, local66);
			if (local71 < 0) {
				local64.append(arg0.substring(local66));
				return local64.toString();
			}
			local64.append(arg0.substring(local66, local71));
			local66 = local71 + local11;
			local64.append(arg1);
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method1202() {
		@Pc(31) String local31;
		if (Static106.anInt2305 == 1 && Static216.anInt4481 < 2) {
			local31 = Static212.aString224 + Static208.aString217 + Static8.aString13 + " ->";
		} else if (Static133.aBoolean219 && Static216.anInt4481 < 2) {
			local31 = Static296.aString299 + Static208.aString217 + Static150.aString153 + " ->";
		} else if (Static42.aBoolean74 && Static79.aBooleanArray8[81] && Static216.anInt4481 > 2) {
			local31 = Static196.method3333(Static216.anInt4481 - 2);
		} else {
			local31 = Static196.method3333(Static216.anInt4481 - 1);
		}
		if (Static216.anInt4481 > 2) {
			local31 = local31 + "<col=ffffff> / " + (Static216.anInt4481 - 2) + Static53.aString61;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B[B)V")
	public static void method1203(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class2_Sub26 local6 = new Class2_Sub26(arg0);
		local6.anInt5328 = arg0.length - 2;
		Static27.anInt576 = local6.method4242();
		Static273.aByteArrayArray115 = new byte[Static27.anInt576][];
		Static40.anIntArray59 = new int[Static27.anInt576];
		Static30.anIntArray46 = new int[Static27.anInt576];
		Static19.anIntArray30 = new int[Static27.anInt576];
		Static262.anIntArray528 = new int[Static27.anInt576];
		Static29.aBooleanArray4 = new boolean[Static27.anInt576];
		Static107.aByteArrayArray52 = new byte[Static27.anInt576][];
		local6.anInt5328 = arg0.length - Static27.anInt576 * 8 - 7;
		Static148.anInt3175 = local6.method4242();
		Static260.anInt5414 = local6.method4242();
		@Pc(68) int local68 = (local6.method4261() & 0xFF) + 1;
		@Pc(70) int local70;
		for (local70 = 0; local70 < Static27.anInt576; local70++) {
			Static262.anIntArray528[local70] = local6.method4242();
		}
		for (local70 = 0; local70 < Static27.anInt576; local70++) {
			Static40.anIntArray59[local70] = local6.method4242();
		}
		for (local70 = 0; local70 < Static27.anInt576; local70++) {
			Static30.anIntArray46[local70] = local6.method4242();
		}
		for (local70 = 0; local70 < Static27.anInt576; local70++) {
			Static19.anIntArray30[local70] = local6.method4242();
		}
		local6.anInt5328 = arg0.length - Static27.anInt576 * 8 - (local68 + -1) * 3 - 7;
		Static187.anIntArray314 = new int[local68];
		for (local70 = 1; local70 < local68; local70++) {
			Static187.anIntArray314[local70] = local6.method4245();
			if (Static187.anIntArray314[local70] == 0) {
				Static187.anIntArray314[local70] = 1;
			}
		}
		local6.anInt5328 = 0;
		for (local70 = 0; local70 < Static27.anInt576; local70++) {
			@Pc(193) int local193 = Static30.anIntArray46[local70];
			@Pc(197) int local197 = Static19.anIntArray30[local70];
			@Pc(201) int local201 = local197 * local193;
			@Pc(204) byte[] local204 = new byte[local201];
			@Pc(207) byte[] local207 = new byte[local201];
			Static273.aByteArrayArray115[local70] = local207;
			Static107.aByteArrayArray52[local70] = local204;
			@Pc(219) int local219 = local6.method4261();
			@Pc(221) boolean local221 = false;
			@Pc(230) int local230;
			if ((local219 & 0x1) == 0) {
				for (local230 = 0; local230 < local201; local230++) {
					local207[local230] = local6.method4220();
				}
				if ((local219 & 0x2) != 0) {
					for (local230 = 0; local230 < local201; local230++) {
						@Pc(261) byte local261 = local204[local230] = local6.method4220();
						local221 |= local261 != -1;
					}
				}
			} else {
				local230 = 0;
				label98: while (true) {
					@Pc(282) int local282;
					if (local230 >= local193) {
						if ((local219 & 0x2) == 0) {
							break;
						}
						local230 = 0;
						while (true) {
							if (local230 >= local193) {
								break label98;
							}
							for (local282 = 0; local282 < local197; local282++) {
								@Pc(329) byte local329 = local204[local230 + local282 * local193] = local6.method4220();
								local221 |= local329 != -1;
							}
							local230++;
						}
					}
					for (local282 = 0; local282 < local197; local282++) {
						local207[local193 * local282 + local230] = local6.method4220();
					}
					local230++;
				}
			}
			Static29.aBooleanArray4[local70] = local221;
		}
	}
}
