import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class43 {

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[B")
	private static byte[] aByteArray16;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_23;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "B")
	private static byte aByte43 = 6;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[Lclient!yb;")
	private static Class43[] aClass43Array1 = new Class43[1000];

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "[I")
	public static int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private int anInt867 = -865;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[Lclient!zb;")
	private Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method541(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			aByteArray16 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Class1_Sub3_Sub3(aByteArray16, aBoolean184);
			Class44.method555();
			while (true) {
				@Pc(15) int local15 = arg0.method374();
				if (local15 == 65535) {
					return;
				}
				aClass43Array1[local15] = new Class43();
				aClass43Array1[local15].method543(aByte43, arg0);
				anIntArray231[local15] = aClass43Array1[local15].method544(aBoolean185);
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("78954, " + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(III)Lclient!kb;")
	public static Class1_Sub3_Sub3 method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (aClass43Array1[arg0] == null) {
				return null;
			} else {
				@Pc(16) Class43 local16 = aClass43Array1[arg0];
				return local16.method545(arg2);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("51373, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLclient!kb;)V")
	private void method543(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg1.method372();
				if (local6 != 0) {
					arg1.anInt539--;
					this.aClass44Array1[local1] = new Class44();
					this.aClass44Array1[local1].method558(aByte43, arg1);
				}
			}
			this.anInt868 = arg1.method374();
			this.anInt869 = arg1.method374();
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			@Pc(45) boolean local45 = false;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("54962, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Z)I")
	private int method544(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt938 / 20 < local3) {
					local3 = this.aClass44Array1[local5].anInt938 / 20;
				}
			}
			if (this.anInt868 < this.anInt869 && this.anInt868 / 20 < local3) {
				local3 = this.anInt868 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass44Array1[local58] != null) {
					this.aClass44Array1[local58].anInt938 -= local3 * 20;
				}
			}
			if (!arg0) {
				return 3;
			}
			if (this.anInt868 < this.anInt869) {
				this.anInt868 -= local3 * 20;
				this.anInt869 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("66947, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IB)Lclient!kb;")
	private Class1_Sub3_Sub3 method545(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method546(arg0);
			aClass1_Sub3_Sub3_23.anInt539 = 0;
			aClass1_Sub3_Sub3_23.method366(1380533830);
			aClass1_Sub3_Sub3_23.method367(local3 + 36, this.anInt867);
			aClass1_Sub3_Sub3_23.method366(1463899717);
			aClass1_Sub3_Sub3_23.method366(1718449184);
			aClass1_Sub3_Sub3_23.method367(16, this.anInt867);
			aClass1_Sub3_Sub3_23.method364(1);
			aClass1_Sub3_Sub3_23.method364(1);
			aClass1_Sub3_Sub3_23.method367(22050, this.anInt867);
			aClass1_Sub3_Sub3_23.method367(22050, this.anInt867);
			aClass1_Sub3_Sub3_23.method364(1);
			aClass1_Sub3_Sub3_23.method364(8);
			aClass1_Sub3_Sub3_23.method366(1684108385);
			aClass1_Sub3_Sub3_23.method367(local3, this.anInt867);
			aClass1_Sub3_Sub3_23.anInt539 += local3;
			return aClass1_Sub3_Sub3_23;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("1074, " + arg0 + ", " + 124 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I")
	private int method546(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt937 + this.aClass44Array1[local5].anInt938 > local3) {
				local3 = this.aClass44Array1[local5].anInt937 + this.aClass44Array1[local5].anInt938;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt868 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt869 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray16[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass44Array1[local106] != null) {
				local123 = this.aClass44Array1[local106].anInt937 * 22050 / 1000;
				local133 = this.aClass44Array1[local106].anInt938 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass44Array1[local106].method556(local123, this.aClass44Array1[local106].anInt937);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray16[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray16[local133 + local123] = aByteArray16[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray16[local147 + local123] = aByteArray16[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
