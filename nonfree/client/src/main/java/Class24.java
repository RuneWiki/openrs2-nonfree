import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MAPQLTQU")
public final class Class24 {

	@OriginalMember(owner = "client!MAPQLTQU", name = "c", descriptor = "Z")
	private static boolean aBoolean117;

	@OriginalMember(owner = "client!MAPQLTQU", name = "d", descriptor = "Z")
	private static boolean aBoolean118;

	@OriginalMember(owner = "client!MAPQLTQU", name = "h", descriptor = "[B")
	private static byte[] aByteArray7;

	@OriginalMember(owner = "client!MAPQLTQU", name = "i", descriptor = "Lclient!DNRIFKTO;")
	private static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_3;

	@OriginalMember(owner = "client!MAPQLTQU", name = "a", descriptor = "Z")
	private static boolean aBoolean116 = true;

	@OriginalMember(owner = "client!MAPQLTQU", name = "f", descriptor = "[Lclient!MAPQLTQU;")
	private static Class24[] aClass24Array1 = new Class24[5000];

	@OriginalMember(owner = "client!MAPQLTQU", name = "g", descriptor = "[I")
	public static int[] anIntArray75 = new int[5000];

	@OriginalMember(owner = "client!MAPQLTQU", name = "b", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!MAPQLTQU", name = "k", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!MAPQLTQU", name = "l", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!MAPQLTQU", name = "e", descriptor = "I")
	private int anInt446 = -441;

	@OriginalMember(owner = "client!MAPQLTQU", name = "j", descriptor = "[Lclient!UHNEGZAI;")
	private Class43[] aClass43Array1 = new Class43[10];

	@OriginalMember(owner = "client!MAPQLTQU", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	public static void method260(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			aByteArray7 = new byte[441000];
			aClass2_Sub1_Sub4_3 = new Class2_Sub1_Sub4(aByteArray7, aBoolean116);
			if (arg1 <= 0) {
				aBoolean117 = !aBoolean117;
			}
			Class43.method423();
			while (true) {
				@Pc(20) int local20 = arg0.method96();
				if (local20 == 65535) {
					return;
				}
				aClass24Array1[local20] = new Class24(false);
				aClass24Array1[local20].method262(arg0);
				anIntArray75[local20] = aClass24Array1[local20].method263();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("26117, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAPQLTQU", name = "a", descriptor = "(BII)Lclient!DNRIFKTO;")
	public static Class2_Sub1_Sub4 method261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass24Array1[arg0] == null) {
				return null;
			} else {
				@Pc(16) Class24 local16 = aClass24Array1[arg0];
				return local16.method264(arg1);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("6752, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAPQLTQU", name = "<init>", descriptor = "(Z)V")
	private Class24(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!MAPQLTQU", name = "b", descriptor = "(Lclient!DNRIFKTO;I)V")
	private void method262(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method94();
				if (local6 != 0) {
					arg0.anInt166--;
					this.aClass43Array1[local1] = new Class43();
					this.aClass43Array1[local1].method426(arg0);
				}
			}
			this.anInt447 = arg0.method96();
			this.anInt448 = arg0.method96();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("44075, " + arg0 + ", " + -25 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAPQLTQU", name = "a", descriptor = "(I)I")
	private int method263() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass43Array1[local5] != null && this.aClass43Array1[local5].anInt632 / 20 < local3) {
					local3 = this.aClass43Array1[local5].anInt632 / 20;
				}
			}
			if (this.anInt447 < this.anInt448 && this.anInt447 / 20 < local3) {
				local3 = this.anInt447 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass43Array1[local58] != null) {
					this.aClass43Array1[local58].anInt632 -= local3 * 20;
				}
			}
			if (this.anInt447 < this.anInt448) {
				this.anInt447 -= local3 * 20;
				this.anInt448 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("22426, " + 9 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAPQLTQU", name = "a", descriptor = "(II)Lclient!DNRIFKTO;")
	private Class2_Sub1_Sub4 method264(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method265(arg0);
			aClass2_Sub1_Sub4_3.anInt166 = 0;
			aClass2_Sub1_Sub4_3.method88(1380533830);
			aClass2_Sub1_Sub4_3.method89(local3 + 36);
			aClass2_Sub1_Sub4_3.method88(1463899717);
			aClass2_Sub1_Sub4_3.method88(1718449184);
			aClass2_Sub1_Sub4_3.method89(16);
			aClass2_Sub1_Sub4_3.method86(220, 1);
			aClass2_Sub1_Sub4_3.method86(220, 1);
			aClass2_Sub1_Sub4_3.method89(22050);
			aClass2_Sub1_Sub4_3.method89(22050);
			aClass2_Sub1_Sub4_3.method86(220, 1);
			aClass2_Sub1_Sub4_3.method86(220, 8);
			aClass2_Sub1_Sub4_3.method88(1684108385);
			aClass2_Sub1_Sub4_3.method89(local3);
			aClass2_Sub1_Sub4_3.anInt166 += local3;
			return aClass2_Sub1_Sub4_3;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("51501, " + arg0 + ", " + -25912 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAPQLTQU", name = "b", descriptor = "(I)I")
	private int method265(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass43Array1[local5] != null && this.aClass43Array1[local5].anInt631 + this.aClass43Array1[local5].anInt632 > local3) {
				local3 = this.aClass43Array1[local5].anInt631 + this.aClass43Array1[local5].anInt632;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt447 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt448 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray7[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass43Array1[local106] != null) {
				local123 = this.aClass43Array1[local106].anInt631 * 22050 / 1000;
				local133 = this.aClass43Array1[local106].anInt632 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass43Array1[local106].method424(local123, this.aClass43Array1[local106].anInt631);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray7[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray7[local133 + local123] = aByteArray7[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray7[local147 + local123] = aByteArray7[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
