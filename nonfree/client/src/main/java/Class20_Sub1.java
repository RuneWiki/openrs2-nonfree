import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OBRIXRSB")
public final class Class20_Sub1 extends Class20 implements Runnable {

	@OriginalMember(owner = "client!OBRIXRSB", name = "U", descriptor = "I")
	private static int anInt563 = -524;

	@OriginalMember(owner = "client!OBRIXRSB", name = "b", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!OBRIXRSB", name = "d", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!OBRIXRSB", name = "k", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "client!OBRIXRSB", name = "m", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!OBRIXRSB", name = "o", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!OBRIXRSB", name = "p", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!OBRIXRSB", name = "q", descriptor = "Lclient!NDLPOBEC;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!OBRIXRSB", name = "r", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!OBRIXRSB", name = "s", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!OBRIXRSB", name = "w", descriptor = "I")
	public int anInt554;

	@OriginalMember(owner = "client!OBRIXRSB", name = "x", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!OBRIXRSB", name = "y", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!OBRIXRSB", name = "z", descriptor = "I")
	private int anInt555;

	@OriginalMember(owner = "client!OBRIXRSB", name = "A", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!OBRIXRSB", name = "F", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!OBRIXRSB", name = "H", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!OBRIXRSB", name = "K", descriptor = "I")
	private int anInt560;

	@OriginalMember(owner = "client!OBRIXRSB", name = "L", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!OBRIXRSB", name = "M", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!OBRIXRSB", name = "O", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!OBRIXRSB", name = "P", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!OBRIXRSB", name = "Q", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!OBRIXRSB", name = "R", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!OBRIXRSB", name = "V", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!OBRIXRSB", name = "c", descriptor = "Lclient!BGEXEDZG;")
	private Class3 aClass3_2 = new Class3((byte) 3);

	@OriginalMember(owner = "client!OBRIXRSB", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray12 = new int[4][];

	@OriginalMember(owner = "client!OBRIXRSB", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!OBRIXRSB", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray13 = new int[4][];

	@OriginalMember(owner = "client!OBRIXRSB", name = "h", descriptor = "[B")
	private byte[] aByteArray12 = new byte[500];

	@OriginalMember(owner = "client!OBRIXRSB", name = "i", descriptor = "Ljava/lang/String;")
	public String aString7 = "";

	@OriginalMember(owner = "client!OBRIXRSB", name = "j", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!OBRIXRSB", name = "l", descriptor = "B")
	private byte aByte21 = 9;

	@OriginalMember(owner = "client!OBRIXRSB", name = "n", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!OBRIXRSB", name = "t", descriptor = "[B")
	private byte[] aByteArray14 = new byte[65000];

	@OriginalMember(owner = "client!OBRIXRSB", name = "u", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_4 = new Class7(anInt563);

	@OriginalMember(owner = "client!OBRIXRSB", name = "v", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!OBRIXRSB", name = "B", descriptor = "I")
	private int anInt557 = -212;

	@OriginalMember(owner = "client!OBRIXRSB", name = "C", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_5 = new Class7(anInt563);

	@OriginalMember(owner = "client!OBRIXRSB", name = "D", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_6 = new Class7(anInt563);

	@OriginalMember(owner = "client!OBRIXRSB", name = "E", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_7 = new Class7(anInt563);

	@OriginalMember(owner = "client!OBRIXRSB", name = "G", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!OBRIXRSB", name = "I", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!OBRIXRSB", name = "J", descriptor = "I")
	private int anInt559 = -514;

	@OriginalMember(owner = "client!OBRIXRSB", name = "N", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!OBRIXRSB", name = "S", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!OBRIXRSB", name = "T", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!OBRIXRSB", name = "W", descriptor = "Lclient!CLCMCMIN;")
	private Class7 aClass7_8 = new Class7(anInt563);

	@OriginalMember(owner = "client!OBRIXRSB", name = "X", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "()I")
	public int method378() {
		@Pc(2) Class3 local2 = this.aClass3_2;
		synchronized (this.aClass3_2) {
			return this.aClass3_2.method31();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(I)V")
	@Override
	public void method377(@OriginalArg(0) int arg0) {
		this.method394(0, arg0);
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "b", descriptor = "(I)V")
	private void method379() {
		try {
			while (this.anInt561 == 0) {
				if (this.anInt562 >= 10 || this.anInt560 == 0) {
					return;
				}
				@Pc(20) Class7 local20 = this.aClass7_8;
				@Pc(27) Class1_Sub1_Sub4 local27;
				synchronized (this.aClass7_8) {
					local27 = (Class1_Sub1_Sub4) this.aClass7_8.method99();
				}
				while (local27 != null) {
					if (this.aByteArrayArray3[local27.anInt547][local27.anInt548] != 0) {
						this.aByteArrayArray3[local27.anInt547][local27.anInt548] = 0;
						this.aClass7_6.method97(local27);
						this.method398(local27, this.aBoolean140);
						this.aBoolean145 = true;
						if (this.anInt550 < this.anInt551) {
							this.anInt550++;
						}
						this.aString7 = "Loading extra files - " + this.anInt550 * 100 / this.anInt551 + "%";
						this.anInt562++;
						if (this.anInt562 == 10) {
							return;
						}
					}
					local20 = this.aClass7_8;
					synchronized (this.aClass7_8) {
						local27 = (Class1_Sub1_Sub4) this.aClass7_8.method99();
					}
				}
				for (@Pc(122) int local122 = 0; local122 < 4; local122++) {
					@Pc(129) byte[] local129 = this.aByteArrayArray3[local122];
					@Pc(132) int local132 = local129.length;
					for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
						if (local129[local134] == this.anInt560) {
							local129[local134] = 0;
							local27 = new Class1_Sub1_Sub4();
							local27.anInt547 = local122;
							local27.anInt548 = local134;
							local27.aBoolean137 = false;
							this.aClass7_6.method97(local27);
							this.method398(local27, this.aBoolean140);
							this.aBoolean145 = true;
							if (this.anInt550 < this.anInt551) {
								this.anInt550++;
							}
							this.aString7 = "Loading extra files - " + this.anInt550 * 100 / this.anInt551 + "%";
							this.anInt562++;
							if (this.anInt562 == 10) {
								return;
							}
						}
					}
				}
				this.anInt560--;
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("98996, " + 2 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "c", descriptor = "(I)V")
	private void method380() {
		try {
			this.anInt561 = 0;
			this.anInt562 = 0;
			@Pc(21) Class1_Sub1_Sub4 local21;
			for (local21 = (Class1_Sub1_Sub4) this.aClass7_6.method100(); local21 != null; local21 = (Class1_Sub1_Sub4) this.aClass7_6.method102()) {
				if (local21.aBoolean137) {
					this.anInt561++;
				} else {
					this.anInt562++;
				}
			}
			while (this.anInt561 < 10) {
				local21 = (Class1_Sub1_Sub4) this.aClass7_5.method99();
				if (local21 == null) {
					break;
				}
				if (this.aByteArrayArray3[local21.anInt547][local21.anInt548] != 0) {
					this.anInt550++;
				}
				this.aByteArrayArray3[local21.anInt547][local21.anInt548] = 0;
				this.aClass7_6.method97(local21);
				this.anInt561++;
				this.method398(local21, this.aBoolean140);
				this.aBoolean145 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("41355, " + 0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(ZBII)V")
	public void method381(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient3.aClass34Array1[0] != null && this.anIntArrayArray12[arg1][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass34Array1[arg1 + 1].method415(arg2);
				if (!this.method384(this.anIntArrayArray13[arg1][arg2], local25, this.anIntArrayArray12[arg1][arg2])) {
					this.aByteArrayArray3[arg1][arg2] = arg0;
					if (arg0 > this.anInt560) {
						this.anInt560 = arg0;
					}
					this.anInt551++;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("50336, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(BI)Z")
	public boolean method382(@OriginalArg(1) int arg0) {
		try {
			if (this.aByte21 != 9) {
				this.aBoolean142 = !this.aBoolean142;
			}
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray128.length; local13++) {
				if (this.anIntArray132[local13] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("89891, " + 9 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "d", descriptor = "(I)I")
	public int method383() {
		try {
			return this.anIntArray130.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("70300, " + 138 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(I[BIZ)Z")
	private boolean method384(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(17) int local17 = arg1.length - 2;
			@Pc(33) int local33 = ((arg1[local17] & 0xFF) << 8) + (arg1[local17 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local17);
			@Pc(47) int local47 = (int) this.aCRC32_1.getValue();
			if (local33 == arg2) {
				return local47 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("62732, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "b", descriptor = "()Lclient!NDLPOBEC;")
	public Class1_Sub1_Sub4 method385() {
		@Pc(4) Class7 local4 = this.aClass7_7;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass7_7) {
			local11 = (Class1_Sub1_Sub4) this.aClass7_7.method99();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class3 local24 = this.aClass3_2;
		synchronized (this.aClass3_2) {
			local11.method508();
		}
		if (local11.aByteArray11 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray11));
			while (true) {
				if (local41 == this.aByteArray14.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray14, local41, this.aByteArray14.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray11 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray11[local93] = this.aByteArray14[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "c", descriptor = "()V")
	public void method386() {
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(IZ)I")
	public int method387(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				anInt563 = 226;
			}
			return this.anIntArrayArray12[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("85808, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "e", descriptor = "(I)V")
	private void method388(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class7 local6 = this.aClass7_4;
			@Pc(13) Class1_Sub1_Sub4 local13;
			synchronized (this.aClass7_4) {
				local13 = (Class1_Sub1_Sub4) this.aClass7_4.method99();
			}
			while (local13 != null) {
				this.aBoolean145 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient3.aClass34Array1[0] != null) {
					local24 = this.aClient3.aClass34Array1[local13.anInt547 + 1].method415(local13.anInt548);
				}
				if (!this.method384(this.anIntArrayArray13[local13.anInt547][local13.anInt548], local24, this.anIntArrayArray12[local13.anInt547][local13.anInt548])) {
					local24 = null;
				}
				@Pc(69) Class7 local69 = this.aClass7_4;
				synchronized (this.aClass7_4) {
					if (local24 == null) {
						this.aClass7_5.method97(local13);
					} else {
						local13.aByteArray11 = local24;
						@Pc(85) Class7 local85 = this.aClass7_7;
						synchronized (this.aClass7_7) {
							this.aClass7_7.method97(local13);
						}
					}
					local13 = (Class1_Sub1_Sub4) this.aClass7_4.method99();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("6537, " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(III)V")
	public void method389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient3.aClass34Array1[0] != null && (this.anIntArrayArray12[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt560 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt547 = arg1;
				local30.anInt548 = arg0;
				local30.aBoolean137 = false;
				@Pc(42) Class7 local42 = this.aClass7_8;
				synchronized (this.aClass7_8) {
					this.aClass7_8.method97(local30);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("84669, " + arg0 + ", " + -212 + ", " + arg1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(II)I")
	public int method390(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray13[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("95756, " + 0 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "b", descriptor = "(II)Z")
	public boolean method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
			return this.anIntArray131[arg1] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("98481, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(IIIB)I")
	public int method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(7) int local7 = (arg2 << 8) + arg1;
			@Pc(12) boolean local12 = false;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray128.length; local18++) {
				if (this.anIntArray128[local18] == local7) {
					if (arg0 == 0) {
						return this.anIntArray129[local18];
					}
					return this.anIntArray132[local18];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("11840, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(B)V")
	public void method393() {
		try {
			@Pc(13) Class7 local13 = this.aClass7_8;
			synchronized (this.aClass7_8) {
				this.aClass7_8.method104();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("42436, " + 50 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "c", descriptor = "(II)V")
	public void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray12.length || arg1 < 0 || arg1 > this.anIntArrayArray12[arg0].length || this.anIntArrayArray12[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class3 local27 = this.aClass3_2;
		synchronized (this.aClass3_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass3_2.method29(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass3_2.method30()) {
				if (local34.anInt547 == arg0 && local34.anInt548 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt547 = arg0;
			local34.anInt548 = arg1;
			local34.aBoolean137 = true;
			@Pc(71) Class7 local71 = this.aClass7_4;
			synchronized (this.aClass7_4) {
				this.aClass7_4.method97(local34);
			}
			this.aClass3_2.method27(local34);
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(Z)V")
	private void method395() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream1.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt556 == 0 && local8 >= 6) {
					this.aBoolean145 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray12, local19, 6 - local19)) {
					}
					local43 = this.aByteArray12[0] & 0xFF;
					local59 = ((this.aByteArray12[1] & 0xFF) << 8) + (this.aByteArray12[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray12[3] & 0xFF) << 8) + (this.aByteArray12[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray12[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(90) Class1_Sub1_Sub4 local90 = (Class1_Sub1_Sub4) this.aClass7_6.method100(); local90 != null; local90 = (Class1_Sub1_Sub4) this.aClass7_6.method102()) {
						if (local90.anInt547 == local43 && local90.anInt548 == local59) {
							this.aClass1_Sub1_Sub4_1 = local90;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local90.anInt546 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt552 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass1_Sub1_Sub4_1.aByteArray11 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean137) {
								@Pc(148) Class7 local148 = this.aClass7_7;
								synchronized (this.aClass7_7) {
									this.aClass7_7.method97(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method507();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray11 == null && local82 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray11 = new byte[local75];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray11 == null && local82 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt555 = local82 * 500;
					this.anInt556 = 500;
					if (this.anInt556 > local75 - local82 * 500) {
						this.anInt556 = local75 - local82 * 500;
					}
				}
				if (this.anInt556 > 0 && local8 >= this.anInt556) {
					this.aBoolean145 = true;
					@Pc(227) byte[] local227 = this.aByteArray12;
					local43 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local227 = this.aClass1_Sub1_Sub4_1.aByteArray11;
						local43 = this.anInt555;
					}
					for (local59 = 0; local59 < this.anInt556; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt556 - local59)) {
					}
					if (this.anInt556 + this.anInt555 >= local227.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient3.aClass34Array1[0] != null) {
							this.aClient3.aClass34Array1[this.aClass1_Sub1_Sub4_1.anInt547 + 1].method416(this.aClass1_Sub1_Sub4_1.anInt548, local227.length, local227, this.aBoolean138);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean137 && this.aClass1_Sub1_Sub4_1.anInt547 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean137 = true;
							this.aClass1_Sub1_Sub4_1.anInt547 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean137) {
							@Pc(321) Class7 local321 = this.aClass7_7;
							synchronized (this.aClass7_7) {
								this.aClass7_7.method97(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method507();
						}
					}
					this.anInt556 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket1.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt556 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("80795, " + false + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(ZZ)V")
	public void method396(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray128.length;
			for (@Pc(15) int local15 = 0; local15 < local3; local15++) {
				if (arg0 || this.anIntArray127[local15] != 0) {
					this.method381((byte) 2, 3, this.anIntArray132[local15]);
					this.method381((byte) 2, 3, this.anIntArray129[local15]);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("440, " + arg0 + ", " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(Lclient!VSUYIIVA;Lclient!client;)V")
	public void method397(@OriginalArg(0) Class42 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method539(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub2 local42 = new Class1_Sub1_Sub2(local31, 792);
			this.anIntArrayArray12[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray12[local22][local56] = local42.method61();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method539(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub2 local115 = new Class1_Sub1_Sub2(local104, 792);
			this.anIntArrayArray13[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray13[local36][local123] = local115.method64();
			}
		}
		local104 = arg0.method539("model_index", null);
		local56 = this.anIntArrayArray12[0].length;
		this.aByteArray13 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray13[local158] = local104[local158];
			} else {
				this.aByteArray13[local158] = 0;
			}
		}
		local104 = arg0.method539("map_index", null);
		@Pc(193) Class1_Sub1_Sub2 local193 = new Class1_Sub1_Sub2(local104, 792);
		local56 = local104.length / 7;
		this.anIntArray128 = new int[local56];
		this.anIntArray129 = new int[local56];
		this.anIntArray132 = new int[local56];
		this.anIntArray127 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray128[local216] = local193.method61();
			this.anIntArray129[local216] = local193.method61();
			this.anIntArray132[local216] = local193.method61();
			this.anIntArray127[local216] = local193.method59();
		}
		local104 = arg0.method539("anim_index", null);
		local193 = new Class1_Sub1_Sub2(local104, 792);
		local56 = local104.length / 2;
		this.anIntArray130 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray130[local268] = local193.method61();
		}
		local104 = arg0.method539("midi_index", null);
		local193 = new Class1_Sub1_Sub2(local104, 792);
		local56 = local104.length;
		this.anIntArray131 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray131[local300] = local193.method59();
		}
		this.aClient3 = arg1;
		this.aBoolean144 = true;
		this.aClient3.method580(this, 2);
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "a", descriptor = "(Lclient!NDLPOBEC;Z)V")
	private void method398(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				try {
					if (this.aSocket1 == null) {
						@Pc(9) long local9 = System.currentTimeMillis();
						if (local9 - this.aLong21 < 4000L) {
							return;
						}
						this.aLong21 = local9;
						this.aSocket1 = this.aClient3.method593(client.anInt971 + 43594);
						this.anInputStream1 = this.aSocket1.getInputStream();
						this.anOutputStream1 = this.aSocket1.getOutputStream();
						this.anOutputStream1.write(15);
						for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
							this.anInputStream1.read();
						}
						this.anInt552 = 0;
					}
					this.aByteArray12[0] = (byte) arg0.anInt547;
					this.aByteArray12[1] = (byte) (arg0.anInt548 >> 8);
					this.aByteArray12[2] = (byte) arg0.anInt548;
					if (arg0.aBoolean137) {
						this.aByteArray12[3] = 2;
					} else if (this.aClient3.aBoolean264) {
						this.aByteArray12[3] = 0;
					} else {
						this.aByteArray12[3] = 1;
					}
					this.anOutputStream1.write(this.aByteArray12, 0, 4);
					this.anInt553 = 0;
					this.anInt554 = -10000;
				} catch (@Pc(121) IOException local121) {
					try {
						this.aSocket1.close();
					} catch (@Pc(126) Exception local126) {
					}
					this.aSocket1 = null;
					this.anInputStream1 = null;
					this.anOutputStream1 = null;
					this.anInt556 = 0;
					this.anInt554++;
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("15410, " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBRIXRSB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean144) {
				this.anInt558++;
				@Pc(11) byte local11 = 20;
				if (this.anInt560 == 0 && this.aClient3.aClass34Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean145 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean145; local32++) {
					this.aBoolean145 = false;
					this.method388(130);
					this.method380();
					if (this.anInt561 == 0 && local32 >= 5) {
						break;
					}
					this.method379();
					if (this.anInputStream1 != null) {
						this.method395();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass7_6.method100(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass7_6.method102()) {
					if (local72.aBoolean137) {
						local67 = true;
						local72.anInt546++;
						if (local72.anInt546 > 50) {
							local72.anInt546 = 0;
							this.method398(local72, this.aBoolean140);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass7_6.method100(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass7_6.method102()) {
						local67 = true;
						local72.anInt546++;
						if (local72.anInt546 > 50) {
							local72.anInt546 = 0;
							this.method398(local72, this.aBoolean140);
						}
					}
				}
				if (local67) {
					this.anInt552++;
					if (this.anInt552 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt556 = 0;
					}
				} else {
					this.anInt552 = 0;
					this.aString7 = "";
				}
				if (this.aClient3.aBoolean264 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt560 > 0 || this.aClient3.aClass34Array1[0] == null)) {
					this.anInt553++;
					if (this.anInt553 > 500) {
						this.anInt553 = 0;
						this.aByteArray12[0] = 0;
						this.aByteArray12[1] = 0;
						this.aByteArray12[2] = 0;
						this.aByteArray12[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray12, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt552 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}
}
