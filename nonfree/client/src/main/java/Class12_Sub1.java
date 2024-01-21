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

@OriginalClass("client!XQFIPMSR")
public final class Class12_Sub1 extends Class12 implements Runnable {

	@OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!XQFIPMSR", name = "e", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!XQFIPMSR", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!XQFIPMSR", name = "i", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!XQFIPMSR", name = "l", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!XQFIPMSR", name = "m", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!XQFIPMSR", name = "n", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!XQFIPMSR", name = "o", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!XQFIPMSR", name = "s", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!XQFIPMSR", name = "z", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!XQFIPMSR", name = "A", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!XQFIPMSR", name = "B", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!XQFIPMSR", name = "C", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!XQFIPMSR", name = "D", descriptor = "Lclient!PKGIHVSX;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!XQFIPMSR", name = "F", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!XQFIPMSR", name = "H", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!XQFIPMSR", name = "I", descriptor = "I")
	private int anInt808;

	@OriginalMember(owner = "client!XQFIPMSR", name = "L", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!XQFIPMSR", name = "N", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!XQFIPMSR", name = "P", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!XQFIPMSR", name = "Q", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!XQFIPMSR", name = "R", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!XQFIPMSR", name = "S", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!XQFIPMSR", name = "d", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!XQFIPMSR", name = "f", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!XQFIPMSR", name = "g", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_5 = new Class6((byte) 5);

	@OriginalMember(owner = "client!XQFIPMSR", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray19 = new int[4][];

	@OriginalMember(owner = "client!XQFIPMSR", name = "k", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!XQFIPMSR", name = "p", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_6 = new Class6((byte) 5);

	@OriginalMember(owner = "client!XQFIPMSR", name = "q", descriptor = "I")
	private int anInt803 = 37281;

	@OriginalMember(owner = "client!XQFIPMSR", name = "r", descriptor = "I")
	private int anInt804 = 4;

	@OriginalMember(owner = "client!XQFIPMSR", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!XQFIPMSR", name = "u", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_7 = new Class6((byte) 5);

	@OriginalMember(owner = "client!XQFIPMSR", name = "v", descriptor = "Lclient!HRSVWDNF;")
	private Class16 aClass16_2 = new Class16((byte) 77);

	@OriginalMember(owner = "client!XQFIPMSR", name = "w", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!XQFIPMSR", name = "x", descriptor = "I")
	private int anInt805 = 42058;

	@OriginalMember(owner = "client!XQFIPMSR", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!XQFIPMSR", name = "E", descriptor = "[B")
	private byte[] aByteArray20 = new byte[65000];

	@OriginalMember(owner = "client!XQFIPMSR", name = "G", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_8 = new Class6((byte) 5);

	@OriginalMember(owner = "client!XQFIPMSR", name = "J", descriptor = "I")
	private int anInt809 = -236;

	@OriginalMember(owner = "client!XQFIPMSR", name = "K", descriptor = "Lclient!DMMTBJKZ;")
	private Class6 aClass6_9 = new Class6((byte) 5);

	@OriginalMember(owner = "client!XQFIPMSR", name = "M", descriptor = "Ljava/lang/String;")
	public String aString16 = "";

	@OriginalMember(owner = "client!XQFIPMSR", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray20 = new int[4][];

	@OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "(I)V")
	public void method531(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class6 local2 = this.aClass6_9;
			synchronized (this.aClass6_9) {
				this.aClass6_9.method101();
			}
			@Pc(17) boolean local17 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("15261, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(IB)I")
	public int method532(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray19[arg0].length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("11168, " + arg0 + ", " + 7 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(IIB[B)Z")
	private boolean method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(49) int local49 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local49 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("29509, " + arg0 + ", " + arg1 + ", " + -123 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(B)V")
	private void method534() {
		try {
			try {
				@Pc(11) int local11 = this.anInputStream2.available();
				@Pc(46) int local46;
				@Pc(62) int local62;
				if (this.anInt808 == 0 && local11 >= 6) {
					this.aBoolean169 = true;
					for (@Pc(22) int local22 = 0; local22 < 6; local22 += this.anInputStream2.read(this.aByteArray18, local22, 6 - local22)) {
					}
					local46 = this.aByteArray18[0] & 0xFF;
					local62 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(78) int local78 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(85) int local85 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(93) Class1_Sub1_Sub4 local93 = (Class1_Sub1_Sub4) this.aClass6_7.method97(); local93 != null; local93 = (Class1_Sub1_Sub4) this.aClass6_7.method99(569)) {
						if (local93.anInt625 == local46 && local93.anInt623 == local62) {
							this.aClass1_Sub1_Sub4_1 = local93;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local93.anInt624 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt806 = 0;
						if (local78 == 0) {
							signlink.reporterror("Rej: " + local46 + "," + local62);
							this.aClass1_Sub1_Sub4_1.aByteArray13 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean121) {
								@Pc(151) Class6 local151 = this.aClass6_5;
								synchronized (this.aClass6_5) {
									this.aClass6_5.method94(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method501();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray13 == null && local85 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray13 = new byte[local78];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray13 == null && local85 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt807 = local85 * 500;
					this.anInt808 = 500;
					if (this.anInt808 > local78 - local85 * 500) {
						this.anInt808 = local78 - local85 * 500;
					}
				}
				if (this.anInt808 > 0 && local11 >= this.anInt808) {
					this.aBoolean169 = true;
					@Pc(230) byte[] local230 = this.aByteArray18;
					local46 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local230 = this.aClass1_Sub1_Sub4_1.aByteArray13;
						local46 = this.anInt807;
					}
					for (local62 = 0; local62 < this.anInt808; local62 += this.anInputStream2.read(local230, local62 + local46, this.anInt808 - local62)) {
					}
					if (this.anInt808 + this.anInt807 >= local230.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass8Array1[0] != null) {
							this.aClient5.aClass8Array1[this.aClass1_Sub1_Sub4_1.anInt625 + 1].method138(local230.length, this.aClass1_Sub1_Sub4_1.anInt623, local230);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean121 && this.aClass1_Sub1_Sub4_1.anInt625 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean121 = true;
							this.aClass1_Sub1_Sub4_1.anInt625 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean121) {
							@Pc(323) Class6 local323 = this.aClass6_5;
							synchronized (this.aClass6_5) {
								this.aClass6_5.method94(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method501();
						}
					}
					this.anInt808 = 0;
				}
			} catch (@Pc(344) IOException local344) {
				try {
					this.aSocket2.close();
				} catch (@Pc(349) Exception local349) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt808 = 0;
			}
		} catch (@Pc(363) RuntimeException local363) {
			signlink.reporterror("31963, " + 6 + ", " + local363.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(IBBI)V")
	public void method535(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aClient5.aClass8Array1[0] != null && this.anIntArrayArray19[arg0][arg3] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass8Array1[arg0 + 1].method137(arg3);
				if (!this.method533(this.anIntArrayArray20[arg0][arg3], this.anIntArrayArray19[arg0][arg3], local25)) {
					this.aByteArrayArray4[arg0][arg3] = arg1;
					@Pc(55) boolean local55 = false;
					if (arg1 > this.anInt813) {
						this.anInt813 = arg1;
					}
					this.anInt801++;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("59441, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "()V")
	public void method536() {
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(I)V")
	@Override
	public void method530(@OriginalArg(0) int arg0) {
		this.method549(0, arg0);
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(II)Z")
	public boolean method537(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray201.length; local1++) {
				if (this.anIntArray198[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("44403, " + 1 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(III)V")
	public void method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass8Array1[0] != null && (this.anIntArrayArray19[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt813 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt625 = arg1;
				local30.anInt623 = arg0;
				local30.aBoolean121 = false;
				@Pc(52) Class6 local52 = this.aClass6_9;
				synchronized (this.aClass6_9) {
					this.aClass6_9.method94(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("99121, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "(I)V")
	private void method539() {
		try {
			this.anInt811 = 0;
			this.anInt812 = 0;
			@Pc(25) Class1_Sub1_Sub4 local25;
			for (local25 = (Class1_Sub1_Sub4) this.aClass6_7.method97(); local25 != null; local25 = (Class1_Sub1_Sub4) this.aClass6_7.method99(569)) {
				if (local25.aBoolean121) {
					this.anInt811++;
				} else {
					this.anInt812++;
				}
			}
			while (this.anInt811 < 10) {
				local25 = (Class1_Sub1_Sub4) this.aClass6_8.method96();
				if (local25 == null) {
					break;
				}
				if (this.aByteArrayArray4[local25.anInt625][local25.anInt623] != 0) {
					this.anInt800++;
				}
				this.aByteArrayArray4[local25.anInt625][local25.anInt623] = 0;
				this.aClass6_7.method94(local25);
				this.anInt811++;
				this.method550(local25);
				this.aBoolean169 = true;
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("35404, " + 8 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(ZI)V")
	public void method540(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray201.length;
			for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
				if (arg0 || this.anIntArray199[local11] != 0) {
					this.method535(3, (byte) 2, (byte) 8, this.anIntArray198[local11]);
					this.method535(3, (byte) 2, (byte) 8, this.anIntArray202[local11]);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("51507, " + arg0 + ", " + -47244 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(Lclient!HBJEXSJX;Lclient!client;)V")
	public void method541(@OriginalArg(0) Class13 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method278(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 0);
			this.anIntArrayArray19[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray19[local22][local56] = local42.method157();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method278(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 0);
			this.anIntArrayArray20[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray20[local36][local123] = local115.method160();
			}
		}
		local104 = arg0.method278("model_index", null);
		local56 = this.anIntArrayArray19[0].length;
		this.aByteArray19 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray19[local158] = local104[local158];
			} else {
				this.aByteArray19[local158] = 0;
			}
		}
		local104 = arg0.method278("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 0);
		local56 = local104.length / 7;
		this.anIntArray201 = new int[local56];
		this.anIntArray202 = new int[local56];
		this.anIntArray198 = new int[local56];
		this.anIntArray199 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray201[local216] = local193.method157();
			this.anIntArray202[local216] = local193.method157();
			this.anIntArray198[local216] = local193.method157();
			this.anIntArray199[local216] = local193.method155();
		}
		local104 = arg0.method278("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 0);
		local56 = local104.length / 2;
		this.anIntArray200 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray200[local268] = local193.method157();
		}
		local104 = arg0.method278("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 0);
		local56 = local104.length;
		this.anIntArray197 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray197[local300] = local193.method155();
		}
		this.aClient5 = arg1;
		this.aBoolean171 = true;
		this.aClient5.method587(this, 2);
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "(II)I")
	public int method542(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray19[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("82454, " + 0 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "()Lclient!PKGIHVSX;")
	public Class1_Sub1_Sub4 method543() {
		@Pc(4) Class6 local4 = this.aClass6_5;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass6_5) {
			local11 = (Class1_Sub1_Sub4) this.aClass6_5.method96();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class16 local24 = this.aClass16_2;
		synchronized (this.aClass16_2) {
			local11.method502();
		}
		if (local11.aByteArray13 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray13));
			while (true) {
				if (local41 == this.aByteArray20.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray20, local41, this.aByteArray20.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray13 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray13[local93] = this.aByteArray20[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "d", descriptor = "(I)V")
	private void method544() {
		try {
			while (this.anInt811 == 0) {
				if (this.anInt812 >= 10 || this.anInt813 == 0) {
					return;
				}
				@Pc(20) Class6 local20 = this.aClass6_9;
				@Pc(27) Class1_Sub1_Sub4 local27;
				synchronized (this.aClass6_9) {
					local27 = (Class1_Sub1_Sub4) this.aClass6_9.method96();
				}
				while (local27 != null) {
					if (this.aByteArrayArray4[local27.anInt625][local27.anInt623] != 0) {
						this.aByteArrayArray4[local27.anInt625][local27.anInt623] = 0;
						this.aClass6_7.method94(local27);
						this.method550(local27);
						this.aBoolean169 = true;
						if (this.anInt800 < this.anInt801) {
							this.anInt800++;
						}
						this.aString16 = "Loading extra files - " + this.anInt800 * 100 / this.anInt801 + "%";
						this.anInt812++;
						if (this.anInt812 == 10) {
							return;
						}
					}
					local20 = this.aClass6_9;
					synchronized (this.aClass6_9) {
						local27 = (Class1_Sub1_Sub4) this.aClass6_9.method96();
					}
				}
				for (@Pc(121) int local121 = 0; local121 < 4; local121++) {
					@Pc(128) byte[] local128 = this.aByteArrayArray4[local121];
					@Pc(131) int local131 = local128.length;
					for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
						if (local128[local133] == this.anInt813) {
							local128[local133] = 0;
							local27 = new Class1_Sub1_Sub4();
							local27.anInt625 = local121;
							local27.anInt623 = local133;
							local27.aBoolean121 = false;
							this.aClass6_7.method94(local27);
							this.method550(local27);
							this.aBoolean169 = true;
							if (this.anInt800 < this.anInt801) {
								this.anInt800++;
							}
							this.aString16 = "Loading extra files - " + this.anInt800 * 100 / this.anInt801 + "%";
							this.anInt812++;
							if (this.anInt812 == 10) {
								return;
							}
						}
					}
				}
				this.anInt813--;
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("60743, " + -479 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(Z)I")
	public int method545() {
		try {
			return this.anIntArray200.length;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("41601, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(BIII)I")
	public int method546(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = (arg3 << 8) + arg1;
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray201.length; local9++) {
				if (this.anIntArray201[local9] == local7) {
					if (arg2 == 0) {
						return this.anIntArray202[local9];
					}
					return this.anIntArray198[local9];
				}
			}
			if (arg0 != 12) {
				for (@Pc(40) int local40 = 1; local40 > 0; local40++) {
				}
			}
			return -1;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("19315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "()I")
	public int method547() {
		@Pc(2) Class16 local2 = this.aClass16_2;
		synchronized (this.aClass16_2) {
			return this.aClass16_2.method290();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "e", descriptor = "(I)V")
	private void method548() {
		try {
			if (this.anInt803 != 37281) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(15) Class6 local15 = this.aClass6_6;
			@Pc(22) Class1_Sub1_Sub4 local22;
			synchronized (this.aClass6_6) {
				local22 = (Class1_Sub1_Sub4) this.aClass6_6.method96();
			}
			while (local22 != null) {
				this.aBoolean169 = true;
				@Pc(33) byte[] local33 = null;
				if (this.aClient5.aClass8Array1[0] != null) {
					local33 = this.aClient5.aClass8Array1[local22.anInt625 + 1].method137(local22.anInt623);
				}
				if (!this.method533(this.anIntArrayArray20[local22.anInt625][local22.anInt623], this.anIntArrayArray19[local22.anInt625][local22.anInt623], local33)) {
					local33 = null;
				}
				@Pc(78) Class6 local78 = this.aClass6_6;
				synchronized (this.aClass6_6) {
					if (local33 == null) {
						this.aClass6_8.method94(local22);
					} else {
						local22.aByteArray13 = local33;
						@Pc(94) Class6 local94 = this.aClass6_5;
						synchronized (this.aClass6_5) {
							this.aClass6_5.method94(local22);
						}
					}
					local22 = (Class1_Sub1_Sub4) this.aClass6_6.method96();
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("18896, " + 37281 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "(II)V")
	public void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray19.length || arg1 < 0 || arg1 > this.anIntArrayArray19[arg0].length || this.anIntArrayArray19[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class16 local27 = this.aClass16_2;
		synchronized (this.aClass16_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass16_2.method288(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass16_2.method289(569)) {
				if (local34.anInt625 == arg0 && local34.anInt623 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt625 = arg0;
			local34.anInt623 = arg1;
			local34.aBoolean121 = true;
			@Pc(71) Class6 local71 = this.aClass6_6;
			synchronized (this.aClass6_6) {
				this.aClass6_6.method94(local34);
			}
			this.aClass16_2.method286(local34);
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(ZLclient!PKGIHVSX;)V")
	private void method550(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong26 < 4000L) {
						return;
					}
					this.aLong26 = local11;
					this.aSocket2 = this.aClient5.method671(client.anInt887 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt806 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt625;
				this.aByteArray18[1] = (byte) (arg0.anInt623 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt623;
				if (arg0.aBoolean121) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean216) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt802 = 0;
				this.anInt799 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket2.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt808 = 0;
				this.anInt799++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("93239, " + true + ", " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean171) {
				this.anInt810++;
				@Pc(11) byte local11 = 20;
				if (this.anInt813 == 0 && this.aClient5.aClass8Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean169 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean169; local32++) {
					this.aBoolean169 = false;
					this.method548();
					this.method539();
					if (this.anInt811 == 0 && local32 >= 5) {
						break;
					}
					this.method544();
					if (this.anInputStream2 != null) {
						this.method534();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass6_7.method97(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass6_7.method99(569)) {
					if (local72.aBoolean121) {
						local67 = true;
						local72.anInt624++;
						if (local72.anInt624 > 50) {
							local72.anInt624 = 0;
							this.method550(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass6_7.method97(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass6_7.method99(569)) {
						local67 = true;
						local72.anInt624++;
						if (local72.anInt624 > 50) {
							local72.anInt624 = 0;
							this.method550(local72);
						}
					}
				}
				if (local67) {
					this.anInt806++;
					if (this.anInt806 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt808 = 0;
					}
				} else {
					this.anInt806 = 0;
					this.aString16 = "";
				}
				if (this.aClient5.aBoolean216 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt813 > 0 || this.aClient5.aClass8Array1[0] == null)) {
					this.anInt802++;
					if (this.anInt802 > 500) {
						this.anInt802 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt806 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!XQFIPMSR", name = "d", descriptor = "(II)Z")
	public boolean method551(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray197[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("37958, " + 0 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
