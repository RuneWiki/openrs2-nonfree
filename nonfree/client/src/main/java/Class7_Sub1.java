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

@OriginalClass("client!FHVZVKRA")
public final class Class7_Sub1 extends Class7 implements Runnable {

	@OriginalMember(owner = "client!FHVZVKRA", name = "p", descriptor = "I")
	private static int anInt82 = 3;

	@OriginalMember(owner = "client!FHVZVKRA", name = "b", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!FHVZVKRA", name = "c", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!FHVZVKRA", name = "e", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!FHVZVKRA", name = "f", descriptor = "I")
	private int anInt76;

	@OriginalMember(owner = "client!FHVZVKRA", name = "g", descriptor = "I")
	private int anInt77;

	@OriginalMember(owner = "client!FHVZVKRA", name = "i", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!FHVZVKRA", name = "j", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!FHVZVKRA", name = "k", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!FHVZVKRA", name = "n", descriptor = "I")
	private int anInt81;

	@OriginalMember(owner = "client!FHVZVKRA", name = "s", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!FHVZVKRA", name = "t", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!FHVZVKRA", name = "u", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!FHVZVKRA", name = "w", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!FHVZVKRA", name = "z", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!FHVZVKRA", name = "A", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!FHVZVKRA", name = "B", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!FHVZVKRA", name = "D", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!FHVZVKRA", name = "F", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!FHVZVKRA", name = "H", descriptor = "Lclient!UUFPGSJG;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!FHVZVKRA", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!FHVZVKRA", name = "K", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!FHVZVKRA", name = "L", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!FHVZVKRA", name = "M", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!FHVZVKRA", name = "O", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!FHVZVKRA", name = "P", descriptor = "I")
	public int anInt87;

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!FHVZVKRA", name = "d", descriptor = "I")
	private int anInt74 = -844;

	@OriginalMember(owner = "client!FHVZVKRA", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!FHVZVKRA", name = "l", descriptor = "Lclient!XBBVJJRK;")
	private Class44 aClass44_1 = new Class44((byte) -100);

	@OriginalMember(owner = "client!FHVZVKRA", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!FHVZVKRA", name = "o", descriptor = "Ljava/lang/String;")
	public String aString7 = "";

	@OriginalMember(owner = "client!FHVZVKRA", name = "q", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_4 = new Class36(anInt82);

	@OriginalMember(owner = "client!FHVZVKRA", name = "r", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!FHVZVKRA", name = "v", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!FHVZVKRA", name = "x", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!FHVZVKRA", name = "y", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_5 = new Class36(anInt82);

	@OriginalMember(owner = "client!FHVZVKRA", name = "C", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_6 = new Class36(anInt82);

	@OriginalMember(owner = "client!FHVZVKRA", name = "E", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_7 = new Class36(anInt82);

	@OriginalMember(owner = "client!FHVZVKRA", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[4][];

	@OriginalMember(owner = "client!FHVZVKRA", name = "J", descriptor = "Lclient!RGZIHLRP;")
	private Class36 aClass36_8 = new Class36(anInt82);

	@OriginalMember(owner = "client!FHVZVKRA", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[4][];

	@OriginalMember(owner = "client!FHVZVKRA", name = "Q", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(II[BI)Z")
	private boolean method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			@Pc(46) boolean local46 = false;
			if (local28 == arg3) {
				return local42 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("4549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "b", descriptor = "(I)I")
	public int method49(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArray14.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("60223, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean26) {
				this.anInt87++;
				@Pc(11) byte local11 = 20;
				if (this.anInt86 == 0 && this.aClient1.aClass26Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean24 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean24; local32++) {
					this.aBoolean24 = false;
					this.method58();
					this.method59();
					if (this.anInt79 == 0 && local32 >= 5) {
						break;
					}
					this.method65();
					if (this.anInputStream1 != null) {
						this.method51();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass36_7.method400(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass36_7.method402((byte) 2)) {
					if (local72.aBoolean173) {
						local67 = true;
						local72.anInt729++;
						if (local72.anInt729 > 50) {
							local72.anInt729 = 0;
							this.method67(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass36_7.method400(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass36_7.method402((byte) 2)) {
						local67 = true;
						local72.anInt729++;
						if (local72.anInt729 > 50) {
							local72.anInt729 = 0;
							this.method67(local72);
						}
					}
				}
				if (local67) {
					this.anInt76++;
					if (this.anInt76 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt84 = 0;
					}
				} else {
					this.anInt76 = 0;
					this.aString7 = "";
				}
				if (this.aClient1.aBoolean234 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt86 > 0 || this.aClient1.aClass26Array1[0] == null)) {
					this.anInt77++;
					if (this.anInt77 > 500) {
						this.anInt77 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray4, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt76 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(IZI)V")
	public void method50(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient1.aClass26Array1[0] != null && (this.anIntArrayArray3[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt86 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt728 = arg1;
				local30.anInt730 = arg0;
				local30.aBoolean173 = false;
				@Pc(51) Class36 local51 = this.aClass36_5;
				synchronized (this.aClass36_5) {
					this.aClass36_5.method397(local30);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("81152, " + arg0 + ", " + true + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "c", descriptor = "(I)V")
	private void method51() {
		try {
			try {
				@Pc(14) int local14 = this.anInputStream1.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt84 == 0 && local14 >= 6) {
					this.aBoolean24 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream1.read(this.aByteArray4, local25, 6 - local25)) {
					}
					local49 = this.aByteArray4[0] & 0xFF;
					local65 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray4[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(96) Class1_Sub1_Sub4 local96 = (Class1_Sub1_Sub4) this.aClass36_7.method400(); local96 != null; local96 = (Class1_Sub1_Sub4) this.aClass36_7.method402((byte) 2)) {
						if (local96.anInt728 == local49 && local96.anInt730 == local65) {
							this.aClass1_Sub1_Sub4_1 = local96;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local96.anInt729 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt76 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass1_Sub1_Sub4_1.aByteArray20 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean173) {
								@Pc(154) Class36 local154 = this.aClass36_6;
								synchronized (this.aClass36_6) {
									this.aClass36_6.method397(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method510();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray20 == null && local88 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray20 = new byte[local81];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray20 == null && local88 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt83 = local88 * 500;
					this.anInt84 = 500;
					if (this.anInt84 > local81 - local88 * 500) {
						this.anInt84 = local81 - local88 * 500;
					}
				}
				if (this.anInt84 > 0 && local14 >= this.anInt84) {
					this.aBoolean24 = true;
					@Pc(233) byte[] local233 = this.aByteArray4;
					local49 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local233 = this.aClass1_Sub1_Sub4_1.aByteArray20;
						local49 = this.anInt83;
					}
					for (local65 = 0; local65 < this.anInt84; local65 += this.anInputStream1.read(local233, local65 + local49, this.anInt84 - local65)) {
					}
					if (this.anInt84 + this.anInt83 >= local233.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient1.aClass26Array1[0] != null) {
							this.aClient1.aClass26Array1[this.aClass1_Sub1_Sub4_1.anInt728 + 1].method336(this.aClass1_Sub1_Sub4_1.anInt730, local233.length, local233);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean173 && this.aClass1_Sub1_Sub4_1.anInt728 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean173 = true;
							this.aClass1_Sub1_Sub4_1.anInt728 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean173) {
							@Pc(326) Class36 local326 = this.aClass36_6;
							synchronized (this.aClass36_6) {
								this.aClass36_6.method397(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method510();
						}
					}
					this.anInt84 = 0;
				}
			} catch (@Pc(347) IOException local347) {
				try {
					this.aSocket1.close();
				} catch (@Pc(352) Exception local352) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt84 = 0;
			}
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("53419, " + 5 + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(II)I")
	public int method52(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray2[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("33525, " + 6 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(IB)I")
	public int method53(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 6) {
				@Pc(4) boolean local4 = false;
				return this.anIntArrayArray3[arg0].length;
			} else {
				return this.anInt75;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("48999, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "b", descriptor = "(II)Z")
	public boolean method54(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray16[arg0] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("71849, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(IZ)V")
	public void method55(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray15.length;
			for (@Pc(12) int local12 = 0; local12 < local5; local12++) {
				if (arg0 || this.anIntArray17[local12] != 0) {
					this.method66(3, (byte) 2, this.anIntArray18[local12]);
					this.method66(3, (byte) 2, this.anIntArray19[local12]);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("60903, " + -844 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(I)V")
	@Override
	public void method47(@OriginalArg(0) int arg0) {
		this.method56(0, arg0);
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "c", descriptor = "(II)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray3.length || arg1 < 0 || arg1 > this.anIntArrayArray3[arg0].length || this.anIntArrayArray3[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class44 local27 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass44_1.method493(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass44_1.method494((byte) 2)) {
				if (local34.anInt728 == arg0 && local34.anInt730 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt728 = arg0;
			local34.anInt730 = arg1;
			local34.aBoolean173 = true;
			@Pc(71) Class36 local71 = this.aClass36_8;
			synchronized (this.aClass36_8) {
				this.aClass36_8.method397(local34);
			}
			this.aClass44_1.method491(local34);
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(Lclient!MNPBQFWE;Lclient!client;)V")
	public void method57(@OriginalArg(0) Class27 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method340(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub2 local42 = new Class1_Sub1_Sub2(false, local31);
			this.anIntArrayArray3[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray3[local22][local56] = local42.method24();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method340(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub2 local115 = new Class1_Sub1_Sub2(false, local104);
			this.anIntArrayArray2[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray2[local36][local123] = local115.method27();
			}
		}
		local104 = arg0.method340("model_index", null);
		local56 = this.anIntArrayArray3[0].length;
		this.aByteArray2 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray2[local158] = local104[local158];
			} else {
				this.aByteArray2[local158] = 0;
			}
		}
		local104 = arg0.method340("map_index", null);
		@Pc(193) Class1_Sub1_Sub2 local193 = new Class1_Sub1_Sub2(false, local104);
		local56 = local104.length / 7;
		this.anIntArray15 = new int[local56];
		this.anIntArray19 = new int[local56];
		this.anIntArray18 = new int[local56];
		this.anIntArray17 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray15[local216] = local193.method24();
			this.anIntArray19[local216] = local193.method24();
			this.anIntArray18[local216] = local193.method24();
			this.anIntArray17[local216] = local193.method22();
		}
		local104 = arg0.method340("anim_index", null);
		local193 = new Class1_Sub1_Sub2(false, local104);
		local56 = local104.length / 2;
		this.anIntArray14 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray14[local268] = local193.method24();
		}
		local104 = arg0.method340("midi_index", null);
		local193 = new Class1_Sub1_Sub2(false, local104);
		local56 = local104.length;
		this.anIntArray16 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray16[local300] = local193.method22();
		}
		this.aClient1 = arg1;
		this.aBoolean26 = true;
		this.aClient1.method550(this, 2);
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "d", descriptor = "(I)V")
	private void method58() {
		try {
			@Pc(7) Class36 local7 = this.aClass36_8;
			@Pc(14) Class1_Sub1_Sub4 local14;
			synchronized (this.aClass36_8) {
				local14 = (Class1_Sub1_Sub4) this.aClass36_8.method399();
			}
			while (local14 != null) {
				this.aBoolean24 = true;
				@Pc(25) byte[] local25 = null;
				if (this.aClient1.aClass26Array1[0] != null) {
					local25 = this.aClient1.aClass26Array1[local14.anInt728 + 1].method335(674, local14.anInt730);
				}
				if (!this.method48(this.anIntArrayArray2[local14.anInt728][local14.anInt730], 763, local25, this.anIntArrayArray3[local14.anInt728][local14.anInt730])) {
					local25 = null;
				}
				@Pc(70) Class36 local70 = this.aClass36_8;
				synchronized (this.aClass36_8) {
					if (local25 == null) {
						this.aClass36_4.method397(local14);
					} else {
						local14.aByteArray20 = local25;
						@Pc(86) Class36 local86 = this.aClass36_6;
						synchronized (this.aClass36_6) {
							this.aClass36_6.method397(local14);
						}
					}
					local14 = (Class1_Sub1_Sub4) this.aClass36_8.method399();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("21226, " + -296 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(B)V")
	private void method59() {
		try {
			this.anInt79 = 0;
			this.anInt80 = 0;
			@Pc(21) Class1_Sub1_Sub4 local21;
			for (local21 = (Class1_Sub1_Sub4) this.aClass36_7.method400(); local21 != null; local21 = (Class1_Sub1_Sub4) this.aClass36_7.method402((byte) 2)) {
				if (local21.aBoolean173) {
					this.anInt79++;
				} else {
					this.anInt80++;
				}
			}
			while (this.anInt79 < 10) {
				local21 = (Class1_Sub1_Sub4) this.aClass36_4.method399();
				if (local21 == null) {
					break;
				}
				if (this.aByteArrayArray1[local21.anInt728][local21.anInt730] != 0) {
					this.anInt81++;
				}
				this.aByteArrayArray1[local21.anInt728][local21.anInt730] = 0;
				this.aClass36_7.method397(local21);
				this.anInt79++;
				this.method67(local21);
				this.aBoolean24 = true;
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("23343, " + 0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "()I")
	public int method60() {
		@Pc(2) Class44 local2 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			return this.aClass44_1.method495();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "e", descriptor = "(I)V")
	public void method61() {
		try {
			@Pc(2) Class36 local2 = this.aClass36_5;
			synchronized (this.aClass36_5) {
				this.aClass36_5.method404();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("50648, " + -31725 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "b", descriptor = "()V")
	public void method62() {
		this.aBoolean26 = false;
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "c", descriptor = "()Lclient!UUFPGSJG;")
	public Class1_Sub1_Sub4 method63() {
		@Pc(4) Class36 local4 = this.aClass36_6;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass36_6) {
			local11 = (Class1_Sub1_Sub4) this.aClass36_6.method399();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class44 local24 = this.aClass44_1;
		synchronized (this.aClass44_1) {
			local11.method511();
		}
		if (local11.aByteArray20 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray20));
			while (true) {
				if (local41 == this.aByteArray3.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray3, local41, this.aByteArray3.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray20 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray20[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "d", descriptor = "(II)Z")
	public boolean method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray15.length; local1++) {
				if (this.anIntArray18[local1] == arg1) {
					return true;
				}
			}
			@Pc(21) boolean local21 = false;
			return false;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("98336, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(Z)V")
	private void method65() {
		try {
			while (this.anInt79 == 0) {
				if (this.anInt80 >= 10 || this.anInt86 == 0) {
					return;
				}
				@Pc(10) Class36 local10 = this.aClass36_5;
				@Pc(17) Class1_Sub1_Sub4 local17;
				synchronized (this.aClass36_5) {
					local17 = (Class1_Sub1_Sub4) this.aClass36_5.method399();
				}
				while (local17 != null) {
					if (this.aByteArrayArray1[local17.anInt728][local17.anInt730] != 0) {
						this.aByteArrayArray1[local17.anInt728][local17.anInt730] = 0;
						this.aClass36_7.method397(local17);
						this.method67(local17);
						this.aBoolean24 = true;
						if (this.anInt81 < this.anInt85) {
							this.anInt81++;
						}
						this.aString7 = "Loading extra files - " + this.anInt81 * 100 / this.anInt85 + "%";
						this.anInt80++;
						if (this.anInt80 == 10) {
							return;
						}
					}
					local10 = this.aClass36_5;
					synchronized (this.aClass36_5) {
						local17 = (Class1_Sub1_Sub4) this.aClass36_5.method399();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray1[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt86) {
							local118[local123] = 0;
							local17 = new Class1_Sub1_Sub4();
							local17.anInt728 = local111;
							local17.anInt730 = local123;
							local17.aBoolean173 = false;
							this.aClass36_7.method397(local17);
							this.method67(local17);
							this.aBoolean24 = true;
							if (this.anInt81 < this.anInt85) {
								this.anInt81++;
							}
							this.aString7 = "Loading extra files - " + this.anInt81 * 100 / this.anInt85 + "%";
							this.anInt80++;
							if (this.anInt80 == 10) {
								return;
							}
						}
					}
				}
				this.anInt86--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("32904, " + false + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(IZBI)V")
	public void method66(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass26Array1[0] != null && this.anIntArrayArray3[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass26Array1[arg0 + 1].method335(674, arg2);
				if (!this.method48(this.anIntArrayArray2[arg0][arg2], 763, local25, this.anIntArrayArray3[arg0][arg2])) {
					this.aByteArrayArray1[arg0][arg2] = arg1;
					if (arg1 > this.anInt86) {
						this.anInt86 = arg1;
					}
					this.anInt85++;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("25112, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(Lclient!UUFPGSJG;I)V")
	private void method67(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong5 < 4000L) {
						return;
					}
					this.aLong5 = local11;
					this.aSocket1 = this.aClient1.method643(client.anInt965 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream1.read();
					}
					this.anInt76 = 0;
				}
				this.aByteArray4[0] = (byte) arg0.anInt728;
				this.aByteArray4[1] = (byte) (arg0.anInt730 >> 8);
				this.aByteArray4[2] = (byte) arg0.anInt730;
				if (arg0.aBoolean173) {
					this.aByteArray4[3] = 2;
				} else if (this.aClient1.aBoolean234) {
					this.aByteArray4[3] = 0;
				} else {
					this.aByteArray4[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray4, 0, 4);
				this.anInt77 = 0;
				this.anInt78 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket1.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt84 = 0;
				this.anInt78++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("51871, " + arg0 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHVZVKRA", name = "a", descriptor = "(IIII)I")
	public int method68(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = (arg0 << 8) + arg1;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray15.length; local11++) {
				if (this.anIntArray15[local11] == local9) {
					if (arg2 == 0) {
						return this.anIntArray19[local11];
					}
					return this.anIntArray18[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("28169, " + arg0 + ", " + -900 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
