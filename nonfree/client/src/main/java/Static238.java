import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	public static int anInt4357;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	public static int anInt4359;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!no;")
	public static final Class2_Sub27 aClass2_Sub27_1 = new Class2_Sub27(0, 0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method3867(@OriginalArg(2) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local48 >= '0' && local48 <= '9') {
				local86 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local86 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local86 = local48 - 'W';
			} else {
				return false;
			}
			if (local86 >= 10) {
				return false;
			}
			if (local28) {
				local86 = -local86;
			}
			@Pc(121) int local121 = local37 * 10 + local86;
			if (local37 != local121 / 10) {
				return false;
			}
			local30 = true;
			local37 = local121;
		}
		return local30;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I")
	public static int method3868() {
		if (Static363.aFrame4 == null) {
			return Static375.aBoolean328 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
	public static void method3869() {
		Static50.anInt1032 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static224.anInt2647; local3++) {
			@Pc(8) Class242 local8 = Static196.aClass242Array1[local3];
			@Pc(12) int local12;
			if (Static77.anIntArray196 != null) {
				for (local12 = 0; local12 < Static77.anIntArray196.length; local12++) {
					if (Static77.anIntArray196[local12] != -1000000 && (local8.anInt6510 <= Static77.anIntArray196[local12] || local8.anInt6512 <= Static77.anIntArray196[local12]) && (local8.anInt6517 <= Static355.anIntArray756[local12] || local8.anInt6506 <= Static355.anIntArray756[local12]) && (local8.anInt6517 >= Static377.anIntArray796[local12] || local8.anInt6506 >= Static377.anIntArray796[local12]) && (local8.anInt6516 <= Static204.anIntArray452[local12] || local8.anInt6503 <= Static204.anIntArray452[local12]) && (local8.anInt6516 >= Static92.anIntArray226[local12] || local8.anInt6503 >= Static92.anIntArray226[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt6521 == 1) {
				local12 = local8.anInt6523 + Static273.anInt4882 - Static33.anInt702;
				if (local12 >= 0 && local12 <= Static273.anInt4882 + Static273.anInt4882) {
					local110 = local8.anInt6504 + Static273.anInt4882 - Static345.anInt6083;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6509 + Static273.anInt4882 - Static345.anInt6083;
					if (local121 > Static273.anInt4882 + Static273.anInt4882) {
						local121 = Static273.anInt4882 + Static273.anInt4882;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static227.aBooleanArrayArray5[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static174.anInt6735 - local8.anInt6517;
						if (local153 > Static292.anInt5164) {
							local8.anInt6511 = 1;
						} else {
							if (local153 >= -Static292.anInt5164) {
								continue;
							}
							local8.anInt6511 = 2;
							local153 = -local153;
						}
						local8.anInt6519 = (local8.anInt6516 - Static34.anInt736 << 8) / local153;
						local8.anInt6507 = (local8.anInt6503 - Static34.anInt736 << 8) / local153;
						local8.anInt6513 = (local8.anInt6510 - Static23.anInt555 << 8) / local153;
						local8.anInt6514 = (local8.anInt6512 - Static23.anInt555 << 8) / local153;
						Static219.aClass242Array2[Static50.anInt1032++] = local8;
					}
				}
			} else if (local8.anInt6521 == 2) {
				local12 = local8.anInt6504 + Static273.anInt4882 - Static345.anInt6083;
				if (local12 >= 0 && local12 <= Static273.anInt4882 + Static273.anInt4882) {
					local110 = local8.anInt6523 + Static273.anInt4882 - Static33.anInt702;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6505 + Static273.anInt4882 - Static33.anInt702;
					if (local121 > Static273.anInt4882 + Static273.anInt4882) {
						local121 = Static273.anInt4882 + Static273.anInt4882;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static227.aBooleanArrayArray5[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static34.anInt736 - local8.anInt6516;
						if (local153 > Static292.anInt5164) {
							local8.anInt6511 = 3;
						} else {
							if (local153 >= -Static292.anInt5164) {
								continue;
							}
							local8.anInt6511 = 4;
							local153 = -local153;
						}
						local8.anInt6518 = (local8.anInt6517 - Static174.anInt6735 << 8) / local153;
						local8.anInt6508 = (local8.anInt6506 - Static174.anInt6735 << 8) / local153;
						local8.anInt6513 = (local8.anInt6510 - Static23.anInt555 << 8) / local153;
						local8.anInt6514 = (local8.anInt6512 - Static23.anInt555 << 8) / local153;
						Static219.aClass242Array2[Static50.anInt1032++] = local8;
					}
				}
			} else if (local8.anInt6521 == 4) {
				local12 = local8.anInt6510 - Static23.anInt555;
				if (local12 > Static292.anInt5172) {
					local110 = local8.anInt6504 + Static273.anInt4882 - Static345.anInt6083;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6509 + Static273.anInt4882 - Static345.anInt6083;
					if (local121 > Static273.anInt4882 + Static273.anInt4882) {
						local121 = Static273.anInt4882 + Static273.anInt4882;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt6523 + Static273.anInt4882 - Static33.anInt702;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt6505 + Static273.anInt4882 - Static33.anInt702;
						if (local153 > Static273.anInt4882 + Static273.anInt4882) {
							local153 = Static273.anInt4882 + Static273.anInt4882;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static227.aBooleanArrayArray5[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt6511 = 5;
							local8.anInt6518 = (local8.anInt6517 - Static174.anInt6735 << 8) / local12;
							local8.anInt6508 = (local8.anInt6506 - Static174.anInt6735 << 8) / local12;
							local8.anInt6519 = (local8.anInt6516 - Static34.anInt736 << 8) / local12;
							local8.anInt6507 = (local8.anInt6503 - Static34.anInt736 << 8) / local12;
							Static219.aClass242Array2[Static50.anInt1032++] = local8;
						}
					}
				}
			}
		}
	}
}
