import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_210 = new Class381(48, -1);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt8120 = -1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLclient!rv;)V")
	public static void method7010(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36_Sub2 arg1) {
		@Pc(25) boolean local25 = arg1.method7343(1) == 1;
		if (local25) {
			Static486.anIntArray457[Static282.anInt5022++] = arg0;
		}
		@Pc(42) int local42 = arg1.method7343(2);
		@Pc(46) Class4_Sub1_Sub1_Sub2_Sub1 local46 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[arg0];
		if (local42 != 0) {
			@Pc(174) int local174;
			@Pc(179) int local179;
			@Pc(184) int local184;
			if (local42 == 1) {
				local174 = arg1.method7343(3);
				local179 = local46.anIntArray405[0];
				local184 = local46.anIntArray404[0];
				if (local174 == 0) {
					local184--;
					local179--;
				} else if (local174 == 1) {
					local184--;
				} else if (local174 == 2) {
					local184--;
					local179++;
				} else if (local174 == 3) {
					local179--;
				} else if (local174 == 4) {
					local179++;
				} else if (local174 == 5) {
					local184++;
					local179--;
				} else if (local174 == 6) {
					local184++;
				} else if (local174 == 7) {
					local184++;
					local179++;
				}
				if (local25) {
					local46.anInt4549 = local184;
					local46.anInt4537 = local179;
					local46.aBoolean302 = true;
				} else {
					local46.method4086(Static298.aByteArray56[arg0], local179, local184, (byte) -58);
				}
			} else if (local42 == 2) {
				local174 = arg1.method7343(4);
				local179 = local46.anIntArray405[0];
				local184 = local46.anIntArray404[0];
				if (local174 == 0) {
					local179 -= 2;
					local184 -= 2;
				} else if (local174 == 1) {
					local179--;
					local184 -= 2;
				} else if (local174 == 2) {
					local184 -= 2;
				} else if (local174 == 3) {
					local179++;
					local184 -= 2;
				} else if (local174 == 4) {
					local184 -= 2;
					local179 += 2;
				} else if (local174 == 5) {
					local179 -= 2;
					local184--;
				} else if (local174 == 6) {
					local179 += 2;
					local184--;
				} else if (local174 == 7) {
					local179 -= 2;
				} else if (local174 == 8) {
					local179 += 2;
				} else if (local174 == 9) {
					local179 -= 2;
					local184++;
				} else if (local174 == 10) {
					local184++;
					local179 += 2;
				} else if (local174 == 11) {
					local184 += 2;
					local179 -= 2;
				} else if (local174 == 12) {
					local184 += 2;
					local179--;
				} else if (local174 == 13) {
					local184 += 2;
				} else if (local174 == 14) {
					local184 += 2;
					local179++;
				} else if (local174 == 15) {
					local179 += 2;
					local184 += 2;
				}
				if (local25) {
					local46.aBoolean302 = true;
					local46.anInt4537 = local179;
					local46.anInt4549 = local184;
				} else {
					local46.method4086(Static298.aByteArray56[arg0], local179, local184, (byte) -101);
				}
			} else {
				local174 = arg1.method7343(1);
				@Pc(544) int local544;
				@Pc(554) int local554;
				@Pc(569) int local569;
				@Pc(577) int local577;
				if (local174 == 0) {
					local179 = arg1.method7343(12);
					local184 = local179 >> 10;
					local544 = local179 >> 5 & 0x1F;
					if (local544 > 15) {
						local544 -= 32;
					}
					local554 = local179 & 0x1F;
					if (local554 > 15) {
						local554 -= 32;
					}
					local569 = local46.anIntArray405[0] + local544;
					local577 = local46.anIntArray404[0] + local554;
					if (local25) {
						local46.aBoolean302 = true;
						local46.anInt4537 = local569;
						local46.anInt4549 = local577;
					} else {
						local46.method4086(Static298.aByteArray56[arg0], local569, local577, (byte) -100);
					}
					local46.aByte139 = local46.aByte138 = (byte) (local184 + local46.aByte139 & 0x3);
					if (Static389.method1741(local577, local569)) {
						local46.aByte138++;
					}
					if (arg0 == Static649.anInt10621) {
						if (local46.aByte139 != Static324.anInt5529) {
							Static597.aBoolean675 = true;
						}
						Static324.anInt5529 = local46.aByte139;
					}
				} else {
					local179 = arg1.method7343(30);
					local184 = local179 >> 28;
					local544 = local179 >> 14 & 0x3FFF;
					local554 = local179 & 0x3FFF;
					local569 = (local46.anIntArray405[0] + Static315.anInt5380 + local544 & 0x3FFF) - Static315.anInt5380;
					local577 = (local46.anIntArray404[0] + Static290.anInt5128 + local554 & 0x3FFF) - Static290.anInt5128;
					if (local25) {
						local46.anInt4537 = local569;
						local46.aBoolean302 = true;
						local46.anInt4549 = local577;
					} else {
						local46.method4086(Static298.aByteArray56[arg0], local569, local577, (byte) -125);
					}
					local46.aByte139 = local46.aByte138 = (byte) (local46.aByte139 + local184 & 0x3);
					if (Static389.method1741(local577, local569)) {
						local46.aByte138++;
					}
					if (Static649.anInt10621 == arg0) {
						Static324.anInt5529 = local46.aByte139;
					}
				}
			}
		} else if (local25) {
			local46.aBoolean302 = false;
		} else if (Static649.anInt10621 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(76) Class268 local76 = Static465.aClass268Array1[arg0] = new Class268();
			local76.anInt7109 = (local46.anIntArray405[0] + Static315.anInt5380 >> 6 << 14) + ((local46.aByte139 << 28) + (local46.anIntArray404[0] + Static290.anInt5128 >> 6));
			if (local46.anInt4558 == -1) {
				local76.anInt7108 = local46.aClass49_7.method978();
			} else {
				local76.anInt7108 = local46.anInt4558;
			}
			local76.aBoolean473 = local46.aBoolean303;
			local76.aBoolean474 = local46.aBoolean304;
			local76.anInt7107 = local46.anInt6863;
			if (local46.anInt4545 > 0) {
				Static22.method358(local46);
			}
			Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[arg0] = null;
			if (arg1.method7343(1) != 0) {
				Static6.method96(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([BILjava/io/File;I)V")
	public static void method7011(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local19.readFully(arg0, 0, arg2);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}
}
