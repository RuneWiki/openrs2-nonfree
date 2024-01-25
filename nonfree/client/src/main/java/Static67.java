import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cd", name = "Gb", descriptor = "Z")
	public static boolean aBoolean69;

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_66 = new Class179(4, -2);

	@OriginalMember(owner = "client!cd", name = "Cb", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!gs;)V")
	public static void method1185(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub23_Sub1 arg1) {
		@Pc(20) boolean local20 = arg1.method2878(1) == 1;
		if (local20) {
			Static224.anIntArray215[Static96.anInt1738++] = arg0;
		}
		@Pc(35) int local35 = arg1.method2878(2);
		@Pc(39) Class2_Sub1_Sub1_Sub3_Sub1 local39 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[arg0];
		if (local35 != 0) {
			@Pc(150) int local150;
			@Pc(155) int local155;
			@Pc(160) int local160;
			if (local35 == 1) {
				local150 = arg1.method2878(3);
				local155 = local39.anIntArray302[0];
				local160 = local39.anIntArray301[0];
				if (local150 == 0) {
					local155--;
					local160--;
				} else if (local150 == 1) {
					local160--;
				} else if (local150 == 2) {
					local155++;
					local160--;
				} else if (local150 == 3) {
					local155--;
				} else if (local150 == 4) {
					local155++;
				} else if (local150 == 5) {
					local160++;
					local155--;
				} else if (local150 == 6) {
					local160++;
				} else if (local150 == 7) {
					local155++;
					local160++;
				}
				if (local20) {
					local39.anInt4179 = local160;
					local39.aBoolean255 = true;
					local39.anInt4180 = local155;
				} else {
					local39.method3516(local160, local155, Static665.aByteArray105[arg0]);
				}
			} else if (local35 == 2) {
				local150 = arg1.method2878(4);
				local155 = local39.anIntArray302[0];
				local160 = local39.anIntArray301[0];
				if (local150 == 0) {
					local160 -= 2;
					local155 -= 2;
				} else if (local150 == 1) {
					local155--;
					local160 -= 2;
				} else if (local150 == 2) {
					local160 -= 2;
				} else if (local150 == 3) {
					local160 -= 2;
					local155++;
				} else if (local150 == 4) {
					local155 += 2;
					local160 -= 2;
				} else if (local150 == 5) {
					local155 -= 2;
					local160--;
				} else if (local150 == 6) {
					local155 += 2;
					local160--;
				} else if (local150 == 7) {
					local155 -= 2;
				} else if (local150 == 8) {
					local155 += 2;
				} else if (local150 == 9) {
					local160++;
					local155 -= 2;
				} else if (local150 == 10) {
					local155 += 2;
					local160++;
				} else if (local150 == 11) {
					local155 -= 2;
					local160 += 2;
				} else if (local150 == 12) {
					local155--;
					local160 += 2;
				} else if (local150 == 13) {
					local160 += 2;
				} else if (local150 == 14) {
					local155++;
					local160 += 2;
				} else if (local150 == 15) {
					local155 += 2;
					local160 += 2;
				}
				if (local20) {
					local39.anInt4180 = local155;
					local39.aBoolean255 = true;
					local39.anInt4179 = local160;
				} else {
					local39.method3516(local160, local155, Static665.aByteArray105[arg0]);
				}
			} else {
				local150 = arg1.method2878(1);
				@Pc(425) int local425;
				@Pc(435) int local435;
				@Pc(448) int local448;
				@Pc(456) int local456;
				if (local150 == 0) {
					local155 = arg1.method2878(12);
					local160 = local155 >> 10;
					local425 = local155 >> 5 & 0x1F;
					if (local425 > 15) {
						local425 -= 32;
					}
					local435 = local155 & 0x1F;
					if (local435 > 15) {
						local435 -= 32;
					}
					local448 = local425 + local39.anIntArray302[0];
					local456 = local39.anIntArray301[0] + local435;
					if (local20) {
						local39.aBoolean255 = true;
						local39.anInt4180 = local448;
						local39.anInt4179 = local456;
					} else {
						local39.method3516(local456, local448, Static665.aByteArray105[arg0]);
					}
					local39.aByte140 = local39.aByte141 = (byte) (local39.aByte140 + local160 & 0x3);
					if (Static250.method3635(local448, local456)) {
						local39.aByte141++;
					}
					if (arg0 == Static659.anInt7559) {
						if (local39.aByte140 != Static253.anInt4353) {
							Static119.aBoolean126 = true;
						}
						Static253.anInt4353 = local39.aByte140;
					}
				} else {
					local155 = arg1.method2878(30);
					local160 = local155 >> 28;
					local425 = local155 >> 14 & 0x3FFF;
					local435 = local155 & 0x3FFF;
					local448 = (local425 + local39.anIntArray302[0] + Static534.anInt8753 & 0x3FFF) - Static534.anInt8753;
					local456 = (Static234.anInt4239 + local39.anIntArray301[0] + local435 & 0x3FFF) - Static234.anInt4239;
					if (local20) {
						local39.aBoolean255 = true;
						local39.anInt4179 = local456;
						local39.anInt4180 = local448;
					} else {
						local39.method3516(local456, local448, Static665.aByteArray105[arg0]);
					}
					local39.aByte140 = local39.aByte141 = (byte) (local160 + local39.aByte140 & 0x3);
					if (Static250.method3635(local448, local456)) {
						local39.aByte141++;
					}
					if (Static659.anInt7559 == arg0) {
						Static253.anInt4353 = local39.aByte140;
					}
				}
			}
		} else if (local20) {
			local39.aBoolean255 = false;
		} else if (arg0 == Static659.anInt7559) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class120 local67 = Static288.aClass120Array1[arg0] = new Class120();
			local67.anInt3039 = (Static534.anInt8753 + local39.anIntArray302[0] >> 6 << 14) + (local39.aByte140 << 28) + (local39.anIntArray301[0] + Static234.anInt4239 >> 6);
			if (local39.anInt4207 == -1) {
				local67.anInt3036 = local39.lb.method8507();
			} else {
				local67.anInt3036 = local39.anInt4207;
			}
			local67.aBoolean190 = local39.aBoolean258;
			local67.anInt3038 = local39.anInt5066;
			local67.aBoolean191 = local39.aBoolean260;
			if (local39.anInt4177 > 0) {
				Static368.method5311(local39);
			}
			Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[arg0] = null;
			if (arg1.method2878(1) != 0) {
				Static673.method9102(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1187(@OriginalArg(1) String arg0) {
		if (Static241.aStringArray30 == null) {
			Static531.method7382();
		}
		Static81.aCalendar3.setTime(new Date(Static566.method7936()));
		@Pc(26) int local26 = Static81.aCalendar3.get(11);
		@Pc(30) int local30 = Static81.aCalendar3.get(12);
		@Pc(34) int local34 = Static81.aCalendar3.get(13);
		@Pc(68) String local68 = Integer.toString(local26 / 10) + local26 % 10 + ":" + local30 / 10 + local30 % 10 + ":" + local34 / 10 + local34 % 10;
		@Pc(73) String[] local73 = Static635.method8720(arg0, '\n');
		for (@Pc(75) int local75 = 0; local75 < local73.length; local75++) {
			for (@Pc(79) int local79 = Static567.anInt9420; local79 > 0; local79--) {
				Static241.aStringArray30[local79] = Static241.aStringArray30[local79 - 1];
			}
			Static241.aStringArray30[0] = local68 + ": " + local73[local75];
			if (Static456.aFileOutputStream1 != null) {
				try {
					Static456.aFileOutputStream1.write(Static80.method1384(Static241.aStringArray30[0] + "\n"));
				} catch (@Pc(125) IOException local125) {
				}
			}
			if (Static567.anInt9420 < Static241.aStringArray30.length - 1) {
				if (Static22.anInt521 > 0) {
					Static22.anInt521++;
				}
				Static567.anInt9420++;
			}
		}
	}
}
