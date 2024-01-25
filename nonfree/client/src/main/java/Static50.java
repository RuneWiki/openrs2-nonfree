import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public static int anInt1333 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!ra;")
	public static Class320 method1249(@OriginalArg(0) int arg0) {
		@Pc(8) Class320[] local8 = Static496.method6773();
		for (@Pc(12) int local12 = 0; local12 < local8.length; local12++) {
			@Pc(18) Class320 local18 = local8[local12];
			if (arg0 == local18.anInt8440) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!afa;ILclient!aba;I)V")
	public static void method1251(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16;
		@Pc(19) int[] local19;
		@Pc(22) int[] local22;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(49) int local49;
		if ((arg1 & 0x10000) != 0) {
			local16 = arg2.method2075();
			local19 = new int[local16];
			local22 = new int[local16];
			for (local24 = 0; local24 < local16; local24++) {
				local30 = arg2.method2044();
				if ((local30 & 0xC000) == 49152) {
					local49 = arg2.method2029();
					local19[local24] = local30 << 16 | local49;
				} else {
					local19[local24] = local30;
				}
				local22[local24] = arg2.method2044();
			}
			arg0.method7483(local22, local19);
		}
		@Pc(80) byte local80 = -1;
		@Pc(95) int local95;
		@Pc(104) int local104;
		@Pc(133) boolean local133;
		if ((arg1 & 0x100000) != 0) {
			local16 = arg2.method2028(-14795);
			local95 = arg2.method2069();
			if (local16 == 65535) {
				local16 = -1;
			}
			local104 = arg2.method2039();
			local24 = local104 & 0x7;
			local30 = local104 >> 3 & 0xF;
			if (local30 == 15) {
				local30 = -1;
			}
			local133 = (local104 >> 7 & 0x1) == 1;
			arg0.method7480(3, local133, local24, local95, local16, local30);
		}
		if ((arg1 & 0x40000) != 0) {
			arg0.aByte128 = arg2.method2022();
			arg0.aByte127 = arg2.method2049();
			arg0.aByte129 = arg2.method2062();
			arg0.aByte130 = (byte) arg2.method2039();
			arg0.anInt8804 = Static716.anInt11157 + arg2.method2029();
			arg0.anInt8802 = Static716.anInt11157 + arg2.method2028(-14795);
		}
		if ((arg1 & 0x1) != 0) {
			local16 = arg2.method2048(255);
			@Pc(199) byte[] local199 = new byte[local16];
			@Pc(204) Class3_Sub2 local204 = new Class3_Sub2(local199);
			arg2.method2051(local16, local199);
			Static718.aClass3_Sub2Array1[arg3] = local204;
			arg0.method473(local204, 104);
		}
		if ((arg1 & 0x2) != 0) {
			local16 = arg2.method2029();
			local95 = arg2.method2069();
			if (local16 == 65535) {
				local16 = -1;
			}
			local104 = arg2.method2053();
			local24 = local104 & 0x7;
			local30 = local104 >> 3 & 0xF;
			if (local30 == 15) {
				local30 = -1;
			}
			local133 = (local104 >> 7 & 0x1) == 1;
			arg0.method7480(0, local133, local24, local95, local16, local30);
		}
		if ((arg1 & 0x800) != 0) {
			arg0.anInt8813 = arg2.method2022();
			arg0.anInt8806 = arg2.method2049();
			arg0.anInt8810 = arg2.method2049();
			arg0.anInt8808 = arg2.method2022();
			arg0.anInt8811 = arg2.method2060() + Static716.anInt11157;
			arg0.anInt8812 = arg2.method2060() + Static716.anInt11157;
			arg0.anInt8805 = arg2.method2075();
			arg0.anInt8816 = 0;
			if (arg0.aBoolean38) {
				arg0.anInt8806 += arg0.anInt529;
				arg0.anInt8817 = 0;
				arg0.anInt8808 += arg0.anInt529;
				arg0.anInt8813 += arg0.anInt553;
				arg0.anInt8810 += arg0.anInt553;
			} else {
				arg0.anInt8806 += arg0.anIntArray643[0];
				arg0.anInt8817 = 1;
				arg0.anInt8808 += arg0.anIntArray643[0];
				arg0.anInt8813 += arg0.anIntArray644[0];
				arg0.anInt8810 += arg0.anIntArray644[0];
			}
		}
		if ((arg1 & 0x20) != 0) {
			@Pc(425) int[] local425 = new int[4];
			for (local95 = 0; local95 < 4; local95++) {
				local425[local95] = arg2.method2044();
				if (local425[local95] == 65535) {
					local425[local95] = -1;
				}
			}
			local104 = arg2.method2075();
			Static98.method1975(local425, false, arg0, local104);
		}
		if ((arg1 & 0x10) != 0) {
			local16 = arg2.method2048(255);
			if (local16 > 0) {
				for (local95 = 0; local95 < local16; local95++) {
					local24 = -1;
					local30 = -1;
					local104 = arg2.method2054();
					local49 = -1;
					if (local104 == 32767) {
						local104 = arg2.method2054();
						local30 = arg2.method2054();
						local24 = arg2.method2054();
						local49 = arg2.method2054();
					} else if (local104 == 32766) {
						local104 = -1;
					} else {
						local30 = arg2.method2054();
					}
					@Pc(535) int local535 = arg2.method2054();
					@Pc(539) int local539 = arg2.method2053();
					arg0.method7497(local104, Static716.anInt11157, local30, local539, local49, local535, local24);
				}
			}
		}
		if ((arg1 & 0x100) != 0) {
			arg0.aBoolean36 = arg2.method2053() == 1;
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt554 = arg2.method2060();
			if (arg0.anInt8817 == 0) {
				arg0.method7479(arg0.anInt554);
				arg0.anInt554 = -1;
			}
		}
		if ((arg1 & 0x80000) != 0) {
			local16 = arg2.method2044();
			local95 = arg2.method2036();
			if (local16 == 65535) {
				local16 = -1;
			}
			local104 = arg2.method2039();
			local24 = local104 & 0x7;
			local30 = local104 >> 3 & 0xF;
			if (local30 == 15) {
				local30 = -1;
			}
			local133 = (local104 >> 7 & 0x1) == 1;
			arg0.method7480(2, local133, local24, local95, local16, local30);
		}
		if ((arg1 & 0x8000) != 0) {
			@Pc(673) String local673 = arg2.method2014();
			if (local673.charAt(0) == '~') {
				local673 = local673.substring(1);
				Static97.method1971(local673, arg0.aString3, arg0.method472(), arg0.method475(), 2, 0);
			} else if (arg0 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2) {
				Static97.method1971(local673, arg0.aString3, arg0.method472(), arg0.method475(), 2, 0);
			}
			arg0.method478(0, 0, local673);
		}
		if ((arg1 & 0x80) != 0) {
			local16 = arg2.method2029();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg0.anInt8767 = local16;
		}
		if ((arg1 & 0x4000) != 0) {
			local16 = arg2.method2060();
			if (local16 == 65535) {
				local16 = -1;
			}
			local95 = arg2.method2011();
			local104 = arg2.method2075();
			local24 = local104 & 0x7;
			local30 = local104 >> 3 & 0xF;
			if (local30 == 15) {
				local30 = -1;
			}
			local133 = (local104 >> 7 & 0x1) == 1;
			arg0.method7480(1, local133, local24, local95, local16, local30);
		}
		if ((arg1 & 0x1000) != 0) {
			local16 = arg2.method2044();
			arg0.anInt8779 = arg2.method2075();
			arg0.anInt8777 = arg2.method2048(255);
			arg0.aBoolean592 = (local16 & 0x8000) != 0;
			arg0.anInt8788 = local16 & 0x7FFF;
			arg0.anInt8797 = arg0.anInt8788 + Static716.anInt11157 + arg0.anInt8779;
		}
		if ((arg1 & 0x2000) != 0) {
			local16 = arg2.method2048(255);
			local19 = new int[local16];
			local22 = new int[local16];
			@Pc(873) int[] local873 = new int[local16];
			for (local30 = 0; local30 < local16; local30++) {
				local49 = arg2.method2060();
				if (local49 == 65535) {
					local49 = -1;
				}
				local19[local30] = local49;
				local22[local30] = arg2.method2039();
				local873[local30] = arg2.method2028(-14795);
			}
			Static518.method6974(local873, local19, arg0, local22);
		}
		if ((arg1 & 0x200) != 0) {
			local80 = arg2.method2049();
		}
		if ((arg1 & 0x20000) != 0) {
			arg0.aBoolean37 = arg2.method2048(255) == 1;
		}
		if ((arg1 & 0x40) != 0) {
			Static503.aByteArray80[arg3] = arg2.method2022();
		}
		if (!arg0.aBoolean38) {
			return;
		}
		if (local80 == 127) {
			arg0.method483(arg0.anInt553, arg0.anInt529);
			return;
		}
		@Pc(984) byte local984;
		if (local80 == -1) {
			local984 = Static503.aByteArray80[arg3];
		} else {
			local984 = local80;
		}
		Static534.method7109(arg0, local984);
		arg0.method480(arg0.anInt529, arg0.anInt553, local984);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)Lclient!eha;")
	public static Class3_Sub22 method1252() {
		@Pc(7) Class288 local7 = null;
		@Pc(13) Class3_Sub22 local13 = new Class3_Sub22(Static346.aClass309_6, 0);
		try {
			@Pc(19) Class338 local19 = Static122.aClass47_1.method1391("");
			while (local19.anInt8934 == 0) {
				Static550.method7219(1L);
			}
			if (local19.anInt8934 == 1) {
				local7 = (Class288) local19.anObject16;
				@Pc(53) byte[] local53 = new byte[(int) local7.method6776()];
				@Pc(68) int local68;
				for (@Pc(55) int local55 = 0; local55 < local53.length; local55 += local68) {
					local68 = local7.method6778(local53.length - local55, local53, local55);
					if (local68 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub22(new Class3_Sub2(local53), Static346.aClass309_6, 0);
			}
		} catch (@Pc(104) Exception local104) {
		}
		try {
			if (local7 != null) {
				local7.method6780();
			}
		} catch (@Pc(111) Exception local111) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)[Lclient!vf;")
	public static Class390[] method1254() {
		return new Class390[] { Static386.aClass390_8, Static56.aClass390_2, Static709.aClass390_13, Static624.aClass390_10, Static248.aClass390_7, Static133.aClass390_5, Static562.aClass390_11, Static601.aClass390_12, Static9.aClass390_1, Static184.aClass390_6 };
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public static void method1255() {
		@Pc(5) Class307 local5 = Static41.aClass307_11;
		synchronized (Static41.aClass307_11) {
			Static41.aClass307_11.method7006();
		}
	}
}
