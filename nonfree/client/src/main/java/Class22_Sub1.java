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

@OriginalClass("client!UWINSVPX")
public final class Class22_Sub1 extends Class22 implements Runnable {

	@OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!UWINSVPX", name = "d", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!UWINSVPX", name = "f", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!UWINSVPX", name = "g", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!UWINSVPX", name = "h", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!UWINSVPX", name = "i", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!UWINSVPX", name = "j", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!UWINSVPX", name = "k", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!UWINSVPX", name = "l", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!UWINSVPX", name = "m", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!UWINSVPX", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!UWINSVPX", name = "p", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!UWINSVPX", name = "q", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!UWINSVPX", name = "t", descriptor = "Lclient!VLOPFRWW;")
	private Class1_Sub2_Sub4 aClass1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!UWINSVPX", name = "x", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!UWINSVPX", name = "y", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!UWINSVPX", name = "A", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!UWINSVPX", name = "B", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!UWINSVPX", name = "E", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!UWINSVPX", name = "F", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!UWINSVPX", name = "G", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!UWINSVPX", name = "J", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!UWINSVPX", name = "N", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!UWINSVPX", name = "P", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray17 = new int[4][];

	@OriginalMember(owner = "client!UWINSVPX", name = "e", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!UWINSVPX", name = "n", descriptor = "[B")
	private byte[] aByteArray15 = new byte[65000];

	@OriginalMember(owner = "client!UWINSVPX", name = "r", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_5 = new Class42(-270);

	@OriginalMember(owner = "client!UWINSVPX", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!UWINSVPX", name = "u", descriptor = "I")
	private int anInt645 = 6;

	@OriginalMember(owner = "client!UWINSVPX", name = "v", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!UWINSVPX", name = "w", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_6 = new Class42(-270);

	@OriginalMember(owner = "client!UWINSVPX", name = "z", descriptor = "I")
	private int anInt647 = 170;

	@OriginalMember(owner = "client!UWINSVPX", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray18 = new int[4][];

	@OriginalMember(owner = "client!UWINSVPX", name = "D", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!UWINSVPX", name = "H", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!UWINSVPX", name = "I", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_7 = new Class42(-270);

	@OriginalMember(owner = "client!UWINSVPX", name = "K", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_8 = new Class42(-270);

	@OriginalMember(owner = "client!UWINSVPX", name = "L", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!UWINSVPX", name = "M", descriptor = "Ljava/lang/String;")
	public String aString15 = "";

	@OriginalMember(owner = "client!UWINSVPX", name = "O", descriptor = "Lclient!ISCMIAJK;")
	private Class19 aClass19_2 = new Class19(true);

	@OriginalMember(owner = "client!UWINSVPX", name = "Q", descriptor = "[B")
	private byte[] aByteArray16 = new byte[500];

	@OriginalMember(owner = "client!UWINSVPX", name = "R", descriptor = "Lclient!WOVRPCGT;")
	private Class42 aClass42_9 = new Class42(-270);

	@OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "(I)V")
	public void method454() {
		try {
			@Pc(5) Class42 local5 = this.aClass42_6;
			synchronized (this.aClass42_6) {
				this.aClass42_6.method491();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("18001, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(ILclient!VLOPFRWW;)V")
	private void method455(@OriginalArg(1) Class1_Sub2_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong20 < 4000L) {
						return;
					}
					this.aLong20 = local11;
					this.aSocket1 = this.aClient4.method591(client.anInt973 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream1.read();
					}
					this.anInt640 = 0;
				}
				this.aByteArray16[0] = (byte) arg0.anInt665;
				this.aByteArray16[1] = (byte) (arg0.anInt664 >> 8);
				this.aByteArray16[2] = (byte) arg0.anInt664;
				if (arg0.aBoolean151) {
					this.aByteArray16[3] = 2;
				} else if (this.aClient4.aBoolean217) {
					this.aByteArray16[3] = 0;
				} else {
					this.aByteArray16[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray16, 0, 4);
				this.anInt650 = 0;
				this.anInt648 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket1.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt644 = 0;
				this.anInt648++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("20127, " + 0 + ", " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(IBII)I")
	public int method456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray157.length; local12++) {
				if (this.anIntArray157[local12] == local5) {
					if (arg2 == 0) {
						return this.anIntArray158[local12];
					}
					return this.anIntArray155[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("62196, " + arg0 + ", " + -105 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "(I)V")
	private void method457() {
		try {
			@Pc(4) Class42 local4 = this.aClass42_5;
			@Pc(11) Class1_Sub2_Sub4 local11;
			synchronized (this.aClass42_5) {
				local11 = (Class1_Sub2_Sub4) this.aClass42_5.method486();
			}
			if (this.anInt645 != 6) {
				this.aBoolean140 = !this.aBoolean140;
			}
			while (local11 != null) {
				this.aBoolean141 = true;
				@Pc(36) byte[] local36 = null;
				if (this.aClient4.aClass43Array1[0] != null) {
					local36 = this.aClient4.aClass43Array1[local11.anInt665 + 1].method492(local11.anInt664);
				}
				if (!this.method461(this.anIntArrayArray18[local11.anInt665][local11.anInt664], this.anIntArrayArray17[local11.anInt665][local11.anInt664], local36)) {
					local36 = null;
				}
				@Pc(81) Class42 local81 = this.aClass42_5;
				synchronized (this.aClass42_5) {
					if (local36 == null) {
						this.aClass42_7.method484(local11);
					} else {
						local11.aByteArray17 = local36;
						@Pc(97) Class42 local97 = this.aClass42_8;
						synchronized (this.aClass42_8) {
							this.aClass42_8.method484(local11);
						}
					}
					local11 = (Class1_Sub2_Sub4) this.aClass42_5.method486();
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("61446, " + 6 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(II)Z")
	public boolean method458(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray157.length; local1++) {
				if (this.anIntArray155[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("52365, " + -13551 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "(II)Z")
	public boolean method459(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray156[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("73199, " + arg0 + ", " + 8884 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "d", descriptor = "(I)V")
	private void method460() {
		try {
			this.anInt638 = 0;
			this.anInt639 = 0;
			@Pc(12) Class1_Sub2_Sub4 local12;
			for (local12 = (Class1_Sub2_Sub4) this.aClass42_9.method487(); local12 != null; local12 = (Class1_Sub2_Sub4) this.aClass42_9.method489()) {
				if (local12.aBoolean151) {
					this.anInt638++;
				} else {
					this.anInt639++;
				}
			}
			while (this.anInt638 < 10) {
				local12 = (Class1_Sub2_Sub4) this.aClass42_7.method486();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray3[local12.anInt665][local12.anInt664] != 0) {
					this.anInt641++;
				}
				this.aByteArrayArray3[local12.anInt665][local12.anInt664] = 0;
				this.aClass42_9.method484(local12);
				this.anInt638++;
				this.method455(local12);
				this.aBoolean141 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("63720, " + 0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(III[B)Z")
	private boolean method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(34) int local34 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_1.getValue();
			if (local34 == arg0) {
				return local48 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("87368, " + -98 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(ZI)I")
	public int method462(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray14[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("8126, " + false + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "()I")
	public int method463() {
		@Pc(2) Class19 local2 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			return this.aClass19_2.method226();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(III)V")
	public void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient4.aClass43Array1[0] != null && (this.anIntArrayArray18[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt649 != 0))) {
				@Pc(34) Class1_Sub2_Sub4 local34 = new Class1_Sub2_Sub4();
				local34.anInt665 = arg1;
				local34.anInt664 = arg0;
				local34.aBoolean151 = false;
				@Pc(46) Class42 local46 = this.aClass42_6;
				synchronized (this.aClass42_6) {
					this.aClass42_6.method484(local34);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("31519, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "e", descriptor = "(I)I")
	public int method465(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = true;
			return this.anIntArray153.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("7376, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "()V")
	public void method466() {
		this.aBoolean142 = false;
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(B)V")
	private void method467(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(13) int local13 = this.anInputStream1.available();
				@Pc(48) int local48;
				@Pc(64) int local64;
				if (this.anInt644 == 0 && local13 >= 6) {
					this.aBoolean141 = true;
					for (@Pc(24) int local24 = 0; local24 < 6; local24 += this.anInputStream1.read(this.aByteArray16, local24, 6 - local24)) {
					}
					local48 = this.aByteArray16[0] & 0xFF;
					local64 = ((this.aByteArray16[1] & 0xFF) << 8) + (this.aByteArray16[2] & 0xFF);
					@Pc(80) int local80 = ((this.aByteArray16[3] & 0xFF) << 8) + (this.aByteArray16[4] & 0xFF);
					@Pc(87) int local87 = this.aByteArray16[5] & 0xFF;
					this.aClass1_Sub2_Sub4_1 = null;
					for (@Pc(95) Class1_Sub2_Sub4 local95 = (Class1_Sub2_Sub4) this.aClass42_9.method487(); local95 != null; local95 = (Class1_Sub2_Sub4) this.aClass42_9.method489()) {
						if (local95.anInt665 == local48 && local95.anInt664 == local64) {
							this.aClass1_Sub2_Sub4_1 = local95;
						}
						if (this.aClass1_Sub2_Sub4_1 != null) {
							local95.anInt666 = 0;
						}
					}
					if (this.aClass1_Sub2_Sub4_1 != null) {
						this.anInt640 = 0;
						if (local80 == 0) {
							signlink.reporterror("Rej: " + local48 + "," + local64);
							this.aClass1_Sub2_Sub4_1.aByteArray17 = null;
							if (this.aClass1_Sub2_Sub4_1.aBoolean151) {
								@Pc(153) Class42 local153 = this.aClass42_8;
								synchronized (this.aClass42_8) {
									this.aClass42_8.method484(this.aClass1_Sub2_Sub4_1);
								}
							} else {
								this.aClass1_Sub2_Sub4_1.method571();
							}
							this.aClass1_Sub2_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub2_Sub4_1.aByteArray17 == null && local87 == 0) {
								this.aClass1_Sub2_Sub4_1.aByteArray17 = new byte[local80];
							}
							if (this.aClass1_Sub2_Sub4_1.aByteArray17 == null && local87 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt643 = local87 * 500;
					this.anInt644 = 500;
					if (this.anInt644 > local80 - local87 * 500) {
						this.anInt644 = local80 - local87 * 500;
					}
				}
				if (this.anInt644 > 0 && local13 >= this.anInt644) {
					this.aBoolean141 = true;
					@Pc(232) byte[] local232 = this.aByteArray16;
					local48 = 0;
					if (this.aClass1_Sub2_Sub4_1 != null) {
						local232 = this.aClass1_Sub2_Sub4_1.aByteArray17;
						local48 = this.anInt643;
					}
					for (local64 = 0; local64 < this.anInt644; local64 += this.anInputStream1.read(local232, local64 + local48, this.anInt644 - local64)) {
					}
					if (this.anInt644 + this.anInt643 >= local232.length && this.aClass1_Sub2_Sub4_1 != null) {
						if (this.aClient4.aClass43Array1[0] != null) {
							this.aClient4.aClass43Array1[this.aClass1_Sub2_Sub4_1.anInt665 + 1].method493(local232, this.aClass1_Sub2_Sub4_1.anInt664, local232.length);
						}
						if (!this.aClass1_Sub2_Sub4_1.aBoolean151 && this.aClass1_Sub2_Sub4_1.anInt665 == 3) {
							this.aClass1_Sub2_Sub4_1.aBoolean151 = true;
							this.aClass1_Sub2_Sub4_1.anInt665 = 93;
						}
						if (this.aClass1_Sub2_Sub4_1.aBoolean151) {
							@Pc(325) Class42 local325 = this.aClass42_8;
							synchronized (this.aClass42_8) {
								this.aClass42_8.method484(this.aClass1_Sub2_Sub4_1);
							}
						} else {
							this.aClass1_Sub2_Sub4_1.method571();
						}
					}
					this.anInt644 = 0;
				}
			} catch (@Pc(346) IOException local346) {
				try {
					this.aSocket1.close();
				} catch (@Pc(351) Exception local351) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt644 = 0;
			}
		} catch (@Pc(365) RuntimeException local365) {
			signlink.reporterror("43080, " + arg0 + ", " + local365.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(BI)I")
	public int method468(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray18[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("47660, " + 69 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "(ZI)V")
	public void method469(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray157.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray154[local16] != 0) {
					this.method473(3, this.anIntArray155[local16], (byte) 2);
					this.method473(3, this.anIntArray158[local16], (byte) 2);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("23838, " + arg0 + ", " + 170 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "(II)V")
	public void method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray18.length || arg1 < 0 || arg1 > this.anIntArrayArray18[arg0].length || this.anIntArrayArray18[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class19 local27 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			@Pc(34) Class1_Sub2_Sub4 local34;
			for (local34 = (Class1_Sub2_Sub4) this.aClass19_2.method224(); local34 != null; local34 = (Class1_Sub2_Sub4) this.aClass19_2.method225(907)) {
				if (local34.anInt665 == arg0 && local34.anInt664 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub2_Sub4();
			local34.anInt665 = arg0;
			local34.anInt664 = arg1;
			local34.aBoolean151 = true;
			@Pc(71) Class42 local71 = this.aClass42_5;
			synchronized (this.aClass42_5) {
				this.aClass42_5.method484(local34);
			}
			this.aClass19_2.method222(local34);
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "()Lclient!VLOPFRWW;")
	public Class1_Sub2_Sub4 method471() {
		@Pc(4) Class42 local4 = this.aClass42_8;
		@Pc(11) Class1_Sub2_Sub4 local11;
		synchronized (this.aClass42_8) {
			local11 = (Class1_Sub2_Sub4) this.aClass42_8.method486();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class19 local24 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			local11.method572();
		}
		if (local11.aByteArray17 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray17));
			while (true) {
				if (local41 == this.aByteArray15.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray15, local41, this.aByteArray15.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray17 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray17[local93] = this.aByteArray15[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean142) {
				this.anInt642++;
				@Pc(11) byte local11 = 20;
				if (this.anInt649 == 0 && this.aClient4.aClass43Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean141 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean141; local32++) {
					this.aBoolean141 = false;
					this.method457();
					this.method460();
					if (this.anInt638 == 0 && local32 >= 5) {
						break;
					}
					this.method472();
					if (this.anInputStream1 != null) {
						this.method467((byte) 7);
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub2_Sub4 local72;
				for (local72 = (Class1_Sub2_Sub4) this.aClass42_9.method487(); local72 != null; local72 = (Class1_Sub2_Sub4) this.aClass42_9.method489()) {
					if (local72.aBoolean151) {
						local67 = true;
						local72.anInt666++;
						if (local72.anInt666 > 50) {
							local72.anInt666 = 0;
							this.method455(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub2_Sub4) this.aClass42_9.method487(); local72 != null; local72 = (Class1_Sub2_Sub4) this.aClass42_9.method489()) {
						local67 = true;
						local72.anInt666++;
						if (local72.anInt666 > 50) {
							local72.anInt666 = 0;
							this.method455(local72);
						}
					}
				}
				if (local67) {
					this.anInt640++;
					if (this.anInt640 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt644 = 0;
					}
				} else {
					this.anInt640 = 0;
					this.aString15 = "";
				}
				if (this.aClient4.aBoolean217 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt649 > 0 || this.aClient4.aClass43Array1[0] == null)) {
					this.anInt650++;
					if (this.anInt650 > 500) {
						this.anInt650 = 0;
						this.aByteArray16[0] = 0;
						this.aByteArray16[1] = 0;
						this.aByteArray16[2] = 0;
						this.aByteArray16[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray16, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt640 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(Z)V")
	private void method472() {
		try {
			while (this.anInt638 == 0) {
				if (this.anInt639 >= 10 || this.anInt649 == 0) {
					return;
				}
				@Pc(14) Class42 local14 = this.aClass42_6;
				@Pc(21) Class1_Sub2_Sub4 local21;
				synchronized (this.aClass42_6) {
					local21 = (Class1_Sub2_Sub4) this.aClass42_6.method486();
				}
				while (local21 != null) {
					if (this.aByteArrayArray3[local21.anInt665][local21.anInt664] != 0) {
						this.aByteArrayArray3[local21.anInt665][local21.anInt664] = 0;
						this.aClass42_9.method484(local21);
						this.method455(local21);
						this.aBoolean141 = true;
						if (this.anInt641 < this.anInt646) {
							this.anInt641++;
						}
						this.aString15 = "Loading extra files - " + this.anInt641 * 100 / this.anInt646 + "%";
						this.anInt639++;
						if (this.anInt639 == 10) {
							return;
						}
					}
					local14 = this.aClass42_6;
					synchronized (this.aClass42_6) {
						local21 = (Class1_Sub2_Sub4) this.aClass42_6.method486();
					}
				}
				for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
					@Pc(122) byte[] local122 = this.aByteArrayArray3[local115];
					@Pc(125) int local125 = local122.length;
					for (@Pc(127) int local127 = 0; local127 < local125; local127++) {
						if (local122[local127] == this.anInt649) {
							local122[local127] = 0;
							local21 = new Class1_Sub2_Sub4();
							local21.anInt665 = local115;
							local21.anInt664 = local127;
							local21.aBoolean151 = false;
							this.aClass42_9.method484(local21);
							this.method455(local21);
							this.aBoolean141 = true;
							if (this.anInt641 < this.anInt646) {
								this.anInt641++;
							}
							this.aString15 = "Loading extra files - " + this.anInt641 * 100 / this.anInt646 + "%";
							this.anInt639++;
							if (this.anInt639 == 10) {
								return;
							}
						}
					}
				}
				this.anInt649--;
			}
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("25887, " + true + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(IIBB)V")
	public void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient4.aClass43Array1[0] != null && this.anIntArrayArray18[arg0][arg1] != 0) {
				@Pc(32) byte[] local32 = this.aClient4.aClass43Array1[arg0 + 1].method492(arg1);
				if (!this.method461(this.anIntArrayArray18[arg0][arg1], this.anIntArrayArray17[arg0][arg1], local32)) {
					this.aByteArrayArray3[arg0][arg1] = arg2;
					if (arg2 > this.anInt649) {
						this.anInt649 = arg2;
					}
					this.anInt646++;
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("65832, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(Lclient!NXFIIFAD;Lclient!client;)V")
	public void method474(@OriginalArg(0) Class31 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method352(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub2_Sub3 local42 = new Class1_Sub2_Sub3(local31, -670);
			this.anIntArrayArray18[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray18[local22][local56] = local42.method309();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method352(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub2_Sub3 local115 = new Class1_Sub2_Sub3(local104, -670);
			this.anIntArrayArray17[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray17[local36][local123] = local115.method312();
			}
		}
		local104 = arg0.method352("model_index", null);
		local56 = this.anIntArrayArray18[0].length;
		this.aByteArray14 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray14[local158] = local104[local158];
			} else {
				this.aByteArray14[local158] = 0;
			}
		}
		local104 = arg0.method352("map_index", null);
		@Pc(193) Class1_Sub2_Sub3 local193 = new Class1_Sub2_Sub3(local104, -670);
		local56 = local104.length / 7;
		this.anIntArray157 = new int[local56];
		this.anIntArray158 = new int[local56];
		this.anIntArray155 = new int[local56];
		this.anIntArray154 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray157[local216] = local193.method309();
			this.anIntArray158[local216] = local193.method309();
			this.anIntArray155[local216] = local193.method309();
			this.anIntArray154[local216] = local193.method307();
		}
		local104 = arg0.method352("anim_index", null);
		local193 = new Class1_Sub2_Sub3(local104, -670);
		local56 = local104.length / 2;
		this.anIntArray153 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray153[local268] = local193.method309();
		}
		local104 = arg0.method352("midi_index", null);
		local193 = new Class1_Sub2_Sub3(local104, -670);
		local56 = local104.length;
		this.anIntArray156 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray156[local300] = local193.method307();
		}
		this.aClient4 = arg1;
		this.aBoolean142 = true;
		this.aClient4.method587(this, 2);
	}

	@OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(I)V")
	@Override
	public void method453(@OriginalArg(0) int arg0) {
		this.method470(0, arg0);
	}
}
