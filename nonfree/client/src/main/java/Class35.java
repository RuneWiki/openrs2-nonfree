import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QJLULATA")
public final class Class35 {

	@OriginalMember(owner = "client!QJLULATA", name = "f", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!QJLULATA", name = "g", descriptor = "Lclient!IUVBENCV;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_5;

	@OriginalMember(owner = "client!QJLULATA", name = "c", descriptor = "B")
	private static byte aByte14 = 6;

	@OriginalMember(owner = "client!QJLULATA", name = "d", descriptor = "[Lclient!QJLULATA;")
	private static Class35[] aClass35Array1 = new Class35[5000];

	@OriginalMember(owner = "client!QJLULATA", name = "e", descriptor = "[I")
	public static int[] anIntArray162 = new int[5000];

	@OriginalMember(owner = "client!QJLULATA", name = "i", descriptor = "I")
	private int anInt573;

	@OriginalMember(owner = "client!QJLULATA", name = "j", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!QJLULATA", name = "b", descriptor = "I")
	private int anInt572 = 4;

	@OriginalMember(owner = "client!QJLULATA", name = "h", descriptor = "[Lclient!KEVJJMXF;")
	private Class21[] aClass21Array1 = new Class21[10];

	@OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(Lclient!IUVBENCV;I)V")
	public static void method375(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			aByteArray18 = new byte[441000];
			aClass8_Sub1_Sub3_5 = new Class8_Sub1_Sub3(aByteArray18, 713);
			Class21.method237();
			while (true) {
				@Pc(15) int local15 = arg0.method154();
				if (local15 == 65535) {
					return;
				}
				aClass35Array1[local15] = new Class35(true);
				aClass35Array1[local15].method377(arg0, (byte) 1);
				anIntArray162[local15] = aClass35Array1[local15].method378();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("58102, " + arg0 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(III)Lclient!IUVBENCV;")
	public static Class8_Sub1_Sub3 method376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass35Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class35 local16 = aClass35Array1[arg1];
				return local16.method379(arg0, aByte14);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("34959, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLULATA", name = "<init>", descriptor = "(Z)V")
	private Class35(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	private void method377(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method152();
				if (local6 != 0) {
					arg0.anInt239--;
					this.aClass21Array1[local1] = new Class21();
					this.aClass21Array1[local1].method240(arg0, (byte) 1);
				}
			}
			this.anInt573 = arg0.method154();
			this.anInt574 = arg0.method154();
			@Pc(45) boolean local45 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("18762, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(I)I")
	private int method378() {
		try {
			@Pc(9) int local9 = 9999999;
			for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
				if (this.aClass21Array1[local11] != null && this.aClass21Array1[local11].anInt321 / 20 < local9) {
					local9 = this.aClass21Array1[local11].anInt321 / 20;
				}
			}
			if (this.anInt573 < this.anInt574 && this.anInt573 / 20 < local9) {
				local9 = this.anInt573 / 20;
			}
			if (local9 == 9999999 || local9 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass21Array1[local64] != null) {
					this.aClass21Array1[local64].anInt321 -= local9 * 20;
				}
			}
			if (this.anInt573 < this.anInt574) {
				this.anInt573 -= local9 * 20;
				this.anInt574 -= local9 * 20;
			}
			return local9;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("70781, " + 10400 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(IB)Lclient!IUVBENCV;")
	private Class8_Sub1_Sub3 method379(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) int local3 = this.method380(arg0);
			aClass8_Sub1_Sub3_5.anInt239 = 0;
			aClass8_Sub1_Sub3_5.method146(1380533830);
			aClass8_Sub1_Sub3_5.method147(local3 + 36);
			aClass8_Sub1_Sub3_5.method146(1463899717);
			aClass8_Sub1_Sub3_5.method146(1718449184);
			if (arg1 != 6) {
				throw new NullPointerException();
			}
			aClass8_Sub1_Sub3_5.method147(16);
			aClass8_Sub1_Sub3_5.method144(1);
			aClass8_Sub1_Sub3_5.method144(1);
			aClass8_Sub1_Sub3_5.method147(22050);
			aClass8_Sub1_Sub3_5.method147(22050);
			aClass8_Sub1_Sub3_5.method144(1);
			aClass8_Sub1_Sub3_5.method144(8);
			aClass8_Sub1_Sub3_5.method146(1684108385);
			aClass8_Sub1_Sub3_5.method147(local3);
			aClass8_Sub1_Sub3_5.anInt239 += local3;
			return aClass8_Sub1_Sub3_5;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("62388, " + arg0 + ", " + arg1 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLULATA", name = "b", descriptor = "(I)I")
	private int method380(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass21Array1[local5] != null && this.aClass21Array1[local5].anInt320 + this.aClass21Array1[local5].anInt321 > local3) {
				local3 = this.aClass21Array1[local5].anInt320 + this.aClass21Array1[local5].anInt321;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt573 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt574 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray18[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass21Array1[local106] != null) {
				local123 = this.aClass21Array1[local106].anInt320 * 22050 / 1000;
				local133 = this.aClass21Array1[local106].anInt321 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass21Array1[local106].method238(local123, this.aClass21Array1[local106].anInt320);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray18[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray18[local147 + local133 + 44] = (byte) local165;
				}
			}
		}
		if (arg0 > 1) {
			local58 += 44;
			local65 += 44;
			local51 += 44;
			local90 += 44;
			local123 = local90 - local51;
			for (local133 = local51 - 1; local133 >= local65; local133--) {
				aByteArray18[local133 + local123] = aByteArray18[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray18[local147 + local123] = aByteArray18[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
