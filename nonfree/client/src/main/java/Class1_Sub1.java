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

@OriginalClass("client!HJOZCGZH")
public final class Class1_Sub1 extends Class1 implements Runnable {

	@OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!HJOZCGZH", name = "e", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!HJOZCGZH", name = "h", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!HJOZCGZH", name = "i", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!HJOZCGZH", name = "j", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!HJOZCGZH", name = "k", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!HJOZCGZH", name = "n", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!HJOZCGZH", name = "q", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!HJOZCGZH", name = "s", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!HJOZCGZH", name = "t", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!HJOZCGZH", name = "u", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!HJOZCGZH", name = "v", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!HJOZCGZH", name = "x", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!HJOZCGZH", name = "y", descriptor = "Lclient!VOTBAEIQ;")
	private Class8_Sub1_Sub4 aClass8_Sub1_Sub4_1;

	@OriginalMember(owner = "client!HJOZCGZH", name = "C", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!HJOZCGZH", name = "F", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!HJOZCGZH", name = "G", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!HJOZCGZH", name = "J", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!HJOZCGZH", name = "N", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!HJOZCGZH", name = "O", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!HJOZCGZH", name = "P", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!HJOZCGZH", name = "Q", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!HJOZCGZH", name = "T", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!HJOZCGZH", name = "U", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_1 = new Class7((byte) 1);

	@OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!HJOZCGZH", name = "d", descriptor = "Lclient!JLOKOMHZ;")
	private Class16 aClass16_1 = new Class16(-46779);

	@OriginalMember(owner = "client!HJOZCGZH", name = "f", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_2 = new Class7((byte) 1);

	@OriginalMember(owner = "client!HJOZCGZH", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[4][];

	@OriginalMember(owner = "client!HJOZCGZH", name = "l", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!HJOZCGZH", name = "m", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!HJOZCGZH", name = "o", descriptor = "B")
	private byte aByte2 = 4;

	@OriginalMember(owner = "client!HJOZCGZH", name = "p", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_3 = new Class7((byte) 1);

	@OriginalMember(owner = "client!HJOZCGZH", name = "r", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!HJOZCGZH", name = "w", descriptor = "Ljava/lang/String;")
	public String aString6 = "";

	@OriginalMember(owner = "client!HJOZCGZH", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!HJOZCGZH", name = "A", descriptor = "I")
	private int anInt245 = 203;

	@OriginalMember(owner = "client!HJOZCGZH", name = "B", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_4 = new Class7((byte) 1);

	@OriginalMember(owner = "client!HJOZCGZH", name = "D", descriptor = "[B")
	private byte[] aByteArray2 = new byte[500];

	@OriginalMember(owner = "client!HJOZCGZH", name = "E", descriptor = "I")
	private int anInt247 = -535;

	@OriginalMember(owner = "client!HJOZCGZH", name = "H", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!HJOZCGZH", name = "I", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!HJOZCGZH", name = "K", descriptor = "I")
	private int anInt248 = 373;

	@OriginalMember(owner = "client!HJOZCGZH", name = "L", descriptor = "I")
	private int anInt249 = 222;

	@OriginalMember(owner = "client!HJOZCGZH", name = "M", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!HJOZCGZH", name = "R", descriptor = "Lclient!CRZPTUPR;")
	private Class7 aClass7_5 = new Class7((byte) 1);

	@OriginalMember(owner = "client!HJOZCGZH", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[4][];

	@OriginalMember(owner = "client!HJOZCGZH", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean51) {
				this.anInt250++;
				@Pc(11) byte local11 = 20;
				if (this.anInt246 == 0 && this.aClient1.aClass39Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean48 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean48; local32++) {
					this.aBoolean48 = false;
					this.method110();
					this.method108();
					if (this.anInt240 == 0 && local32 >= 5) {
						break;
					}
					this.method107();
					if (this.anInputStream1 != null) {
						this.method95();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class8_Sub1_Sub4 local72;
				for (local72 = (Class8_Sub1_Sub4) this.aClass7_2.method32(); local72 != null; local72 = (Class8_Sub1_Sub4) this.aClass7_2.method34()) {
					if (local72.aBoolean164) {
						local67 = true;
						local72.anInt677++;
						if (local72.anInt677 > 50) {
							local72.anInt677 = 0;
							this.method106(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class8_Sub1_Sub4) this.aClass7_2.method32(); local72 != null; local72 = (Class8_Sub1_Sub4) this.aClass7_2.method34()) {
						local67 = true;
						local72.anInt677++;
						if (local72.anInt677 > 50) {
							local72.anInt677 = 0;
							this.method106(local72);
						}
					}
				}
				if (local67) {
					this.anInt243++;
					if (this.anInt243 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt238 = 0;
					}
				} else {
					this.anInt243 = 0;
					this.aString6 = "";
				}
				if (this.aClient1.aBoolean218 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt246 > 0 || this.aClient1.aClass39Array1[0] == null)) {
					this.anInt239++;
					if (this.anInt239 > 500) {
						this.anInt239 = 0;
						this.aByteArray2[0] = 0;
						this.aByteArray2[1] = 0;
						this.aByteArray2[2] = 0;
						this.aByteArray2[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray2, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt243 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(Z)V")
	public void method91(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(2) Class7 local2 = this.aClass7_3;
			synchronized (this.aClass7_3) {
				this.aClass7_3.method36();
			}
			if (!arg0) {
				this.anInt248 = 123;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("62883, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(IB)Z")
	public boolean method92(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray62[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("43403, " + arg0 + ", " + 4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "()V")
	public void method93() {
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(III)V")
	public void method94(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient1.aClass39Array1[0] != null && (this.anIntArrayArray4[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt246 != 0))) {
				@Pc(30) Class8_Sub1_Sub4 local30 = new Class8_Sub1_Sub4();
				local30.anInt678 = arg1;
				local30.anInt679 = arg0;
				local30.aBoolean164 = false;
				@Pc(42) Class7 local42 = this.aClass7_3;
				synchronized (this.aClass7_3) {
					this.aClass7_3.method29(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("9074, " + arg0 + ", " + 222 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(I)V")
	@Override
	public void method90(@OriginalArg(0) int arg0) {
		this.method104(0, arg0);
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "(I)V")
	private void method95() {
		try {
			try {
				@Pc(15) int local15 = this.anInputStream1.available();
				@Pc(50) int local50;
				@Pc(66) int local66;
				if (this.anInt238 == 0 && local15 >= 6) {
					this.aBoolean48 = true;
					for (@Pc(26) int local26 = 0; local26 < 6; local26 += this.anInputStream1.read(this.aByteArray2, local26, 6 - local26)) {
					}
					local50 = this.aByteArray2[0] & 0xFF;
					local66 = ((this.aByteArray2[1] & 0xFF) << 8) + (this.aByteArray2[2] & 0xFF);
					@Pc(82) int local82 = ((this.aByteArray2[3] & 0xFF) << 8) + (this.aByteArray2[4] & 0xFF);
					@Pc(89) int local89 = this.aByteArray2[5] & 0xFF;
					this.aClass8_Sub1_Sub4_1 = null;
					for (@Pc(97) Class8_Sub1_Sub4 local97 = (Class8_Sub1_Sub4) this.aClass7_2.method32(); local97 != null; local97 = (Class8_Sub1_Sub4) this.aClass7_2.method34()) {
						if (local97.anInt678 == local50 && local97.anInt679 == local66) {
							this.aClass8_Sub1_Sub4_1 = local97;
						}
						if (this.aClass8_Sub1_Sub4_1 != null) {
							local97.anInt677 = 0;
						}
					}
					if (this.aClass8_Sub1_Sub4_1 != null) {
						this.anInt243 = 0;
						if (local82 == 0) {
							signlink.reporterror("Rej: " + local50 + "," + local66);
							this.aClass8_Sub1_Sub4_1.aByteArray16 = null;
							if (this.aClass8_Sub1_Sub4_1.aBoolean164) {
								@Pc(155) Class7 local155 = this.aClass7_1;
								synchronized (this.aClass7_1) {
									this.aClass7_1.method29(this.aClass8_Sub1_Sub4_1);
								}
							} else {
								this.aClass8_Sub1_Sub4_1.method546();
							}
							this.aClass8_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass8_Sub1_Sub4_1.aByteArray16 == null && local89 == 0) {
								this.aClass8_Sub1_Sub4_1.aByteArray16 = new byte[local82];
							}
							if (this.aClass8_Sub1_Sub4_1.aByteArray16 == null && local89 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt237 = local89 * 500;
					this.anInt238 = 500;
					if (this.anInt238 > local82 - local89 * 500) {
						this.anInt238 = local82 - local89 * 500;
					}
				}
				if (this.anInt238 > 0 && local15 >= this.anInt238) {
					this.aBoolean48 = true;
					@Pc(234) byte[] local234 = this.aByteArray2;
					local50 = 0;
					if (this.aClass8_Sub1_Sub4_1 != null) {
						local234 = this.aClass8_Sub1_Sub4_1.aByteArray16;
						local50 = this.anInt237;
					}
					for (local66 = 0; local66 < this.anInt238; local66 += this.anInputStream1.read(local234, local66 + local50, this.anInt238 - local66)) {
					}
					if (this.anInt238 + this.anInt237 >= local234.length && this.aClass8_Sub1_Sub4_1 != null) {
						if (this.aClient1.aClass39Array1[0] != null) {
							this.aClient1.aClass39Array1[this.aClass8_Sub1_Sub4_1.anInt678 + 1].method466(local234.length, local234, this.aClass8_Sub1_Sub4_1.anInt679);
						}
						if (!this.aClass8_Sub1_Sub4_1.aBoolean164 && this.aClass8_Sub1_Sub4_1.anInt678 == 3) {
							this.aClass8_Sub1_Sub4_1.aBoolean164 = true;
							this.aClass8_Sub1_Sub4_1.anInt678 = 93;
						}
						if (this.aClass8_Sub1_Sub4_1.aBoolean164) {
							@Pc(327) Class7 local327 = this.aClass7_1;
							synchronized (this.aClass7_1) {
								this.aClass7_1.method29(this.aClass8_Sub1_Sub4_1);
							}
						} else {
							this.aClass8_Sub1_Sub4_1.method546();
						}
					}
					this.anInt238 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket1.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt238 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("8339, " + 0 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(II)Z")
	public boolean method96(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray61.length; local1++) {
				if (this.anIntArray63[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("75462, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "(II)I")
	public int method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			return this.anIntArrayArray4[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("52778, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(IIII)I")
	public int method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != 43127) {
				return this.anInt245;
			}
			@Pc(11) int local11 = (arg1 << 8) + arg0;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray61.length; local13++) {
				if (this.anIntArray61[local13] == local11) {
					if (arg2 == 0) {
						return this.anIntArray66[local13];
					}
					return this.anIntArray63[local13];
				}
			}
			return -1;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23184, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "(I)I")
	public int method99(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArray64.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("48768, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(Lclient!SXKKBWPU;Lclient!client;)V")
	public void method100(@OriginalArg(0) Class35 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method364(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class8_Sub1_Sub3 local42 = new Class8_Sub1_Sub3(local31, -631);
			this.anIntArrayArray4[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray4[local22][local56] = local42.method408();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method364(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class8_Sub1_Sub3 local115 = new Class8_Sub1_Sub3(local104, -631);
			this.anIntArrayArray5[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray5[local36][local123] = local115.method411();
			}
		}
		local104 = arg0.method364("model_index", null);
		local56 = this.anIntArrayArray4[0].length;
		this.aByteArray4 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray4[local158] = local104[local158];
			} else {
				this.aByteArray4[local158] = 0;
			}
		}
		local104 = arg0.method364("map_index", null);
		@Pc(193) Class8_Sub1_Sub3 local193 = new Class8_Sub1_Sub3(local104, -631);
		local56 = local104.length / 7;
		this.anIntArray61 = new int[local56];
		this.anIntArray66 = new int[local56];
		this.anIntArray63 = new int[local56];
		this.anIntArray65 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray61[local216] = local193.method408();
			this.anIntArray66[local216] = local193.method408();
			this.anIntArray63[local216] = local193.method408();
			this.anIntArray65[local216] = local193.method406();
		}
		local104 = arg0.method364("anim_index", null);
		local193 = new Class8_Sub1_Sub3(local104, -631);
		local56 = local104.length / 2;
		this.anIntArray64 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray64[local268] = local193.method408();
		}
		local104 = arg0.method364("midi_index", null);
		local193 = new Class8_Sub1_Sub3(local104, -631);
		local56 = local104.length;
		this.anIntArray62 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray62[local300] = local193.method406();
		}
		this.aClient1 = arg1;
		this.aBoolean51 = true;
		this.aClient1.method587(this, 2);
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "()I")
	public int method101() {
		@Pc(2) Class16 local2 = this.aClass16_1;
		synchronized (this.aClass16_1) {
			return this.aClass16_1.method123();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(BIII)V")
	public void method102(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass39Array1[0] != null && this.anIntArrayArray4[arg2][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass39Array1[arg2 + 1].method465(arg1);
				if (!this.method103(local25, this.anIntArrayArray4[arg2][arg1], this.anIntArrayArray5[arg2][arg1])) {
					this.aByteArrayArray1[arg2][arg1] = arg0;
					if (arg0 > this.anInt246) {
						this.anInt246 = arg0;
					}
					this.anInt244++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("69352, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "([BIII)Z")
	private boolean method103(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local48 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("47698, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "(II)V")
	public void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray4.length || arg1 < 0 || arg1 > this.anIntArrayArray4[arg0].length || this.anIntArrayArray4[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class16 local27 = this.aClass16_1;
		synchronized (this.aClass16_1) {
			@Pc(34) Class8_Sub1_Sub4 local34;
			for (local34 = (Class8_Sub1_Sub4) this.aClass16_1.method121(); local34 != null; local34 = (Class8_Sub1_Sub4) this.aClass16_1.method122()) {
				if (local34.anInt678 == arg0 && local34.anInt679 == arg1) {
					return;
				}
			}
			local34 = new Class8_Sub1_Sub4();
			local34.anInt678 = arg0;
			local34.anInt679 = arg1;
			local34.aBoolean164 = true;
			@Pc(71) Class7 local71 = this.aClass7_4;
			synchronized (this.aClass7_4) {
				this.aClass7_4.method29(local34);
			}
			this.aClass16_1.method119(local34);
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "()Lclient!VOTBAEIQ;")
	public Class8_Sub1_Sub4 method105() {
		@Pc(4) Class7 local4 = this.aClass7_1;
		@Pc(11) Class8_Sub1_Sub4 local11;
		synchronized (this.aClass7_1) {
			local11 = (Class8_Sub1_Sub4) this.aClass7_1.method31();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class16 local24 = this.aClass16_1;
		synchronized (this.aClass16_1) {
			local11.method547();
		}
		if (local11.aByteArray16 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray16));
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
		local11.aByteArray16 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray16[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(Lclient!VOTBAEIQ;I)V")
	private void method106(@OriginalArg(0) Class8_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(13) long local13 = System.currentTimeMillis();
					if (local13 - this.aLong11 < 4000L) {
						return;
					}
					this.aLong11 = local13;
					this.aSocket1 = this.aClient1.method714(client.anInt1014 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(48) int local48 = 0; local48 < 8; local48++) {
						this.anInputStream1.read();
					}
					this.anInt243 = 0;
				}
				this.aByteArray2[0] = (byte) arg0.anInt678;
				this.aByteArray2[1] = (byte) (arg0.anInt679 >> 8);
				this.aByteArray2[2] = (byte) arg0.anInt679;
				if (arg0.aBoolean164) {
					this.aByteArray2[3] = 2;
				} else if (this.aClient1.aBoolean218) {
					this.aByteArray2[3] = 0;
				} else {
					this.aByteArray2[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray2, 0, 4);
				this.anInt239 = 0;
				this.anInt236 = -10000;
			} catch (@Pc(125) IOException local125) {
				try {
					this.aSocket1.close();
				} catch (@Pc(130) Exception local130) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt238 = 0;
				this.anInt236++;
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("38028, " + arg0 + ", " + -535 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "(Z)V")
	private void method107() {
		try {
			while (this.anInt240 == 0) {
				if (this.anInt241 >= 10 || this.anInt246 == 0) {
					return;
				}
				@Pc(19) Class7 local19 = this.aClass7_3;
				@Pc(26) Class8_Sub1_Sub4 local26;
				synchronized (this.aClass7_3) {
					local26 = (Class8_Sub1_Sub4) this.aClass7_3.method31();
				}
				while (local26 != null) {
					if (this.aByteArrayArray1[local26.anInt678][local26.anInt679] != 0) {
						this.aByteArrayArray1[local26.anInt678][local26.anInt679] = 0;
						this.aClass7_2.method29(local26);
						this.method106(local26);
						this.aBoolean48 = true;
						if (this.anInt242 < this.anInt244) {
							this.anInt242++;
						}
						this.aString6 = "Loading extra files - " + this.anInt242 * 100 / this.anInt244 + "%";
						this.anInt241++;
						if (this.anInt241 == 10) {
							return;
						}
					}
					local19 = this.aClass7_3;
					synchronized (this.aClass7_3) {
						local26 = (Class8_Sub1_Sub4) this.aClass7_3.method31();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray1[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt246) {
							local127[local132] = 0;
							local26 = new Class8_Sub1_Sub4();
							local26.anInt678 = local120;
							local26.anInt679 = local132;
							local26.aBoolean164 = false;
							this.aClass7_2.method29(local26);
							this.method106(local26);
							this.aBoolean48 = true;
							if (this.anInt242 < this.anInt244) {
								this.anInt242++;
							}
							this.aString6 = "Loading extra files - " + this.anInt242 * 100 / this.anInt244 + "%";
							this.anInt241++;
							if (this.anInt241 == 10) {
								return;
							}
						}
					}
				}
				this.anInt246--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("85330, " + true + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "(Z)V")
	private void method108() {
		try {
			this.anInt240 = 0;
			this.anInt241 = 0;
			@Pc(12) Class8_Sub1_Sub4 local12;
			for (local12 = (Class8_Sub1_Sub4) this.aClass7_2.method32(); local12 != null; local12 = (Class8_Sub1_Sub4) this.aClass7_2.method34()) {
				if (local12.aBoolean164) {
					this.anInt240++;
				} else {
					this.anInt241++;
				}
			}
			while (this.anInt240 < 10) {
				local12 = (Class8_Sub1_Sub4) this.aClass7_5.method31();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray1[local12.anInt678][local12.anInt679] != 0) {
					this.anInt242++;
				}
				this.aByteArrayArray1[local12.anInt678][local12.anInt679] = 0;
				this.aClass7_2.method29(local12);
				this.anInt240++;
				this.method106(local12);
				this.aBoolean48 = true;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("7862, " + true + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(BZ)V")
	public void method109(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(13) int local13 = this.anIntArray61.length;
			for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
				if (arg1 || this.anIntArray65[local15] != 0) {
					this.method102((byte) 2, this.anIntArray63[local15], 3);
					this.method102((byte) 2, this.anIntArray66[local15], 3);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("3005, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "d", descriptor = "(Z)V")
	private void method110() {
		try {
			@Pc(4) Class7 local4 = this.aClass7_4;
			@Pc(11) Class8_Sub1_Sub4 local11;
			synchronized (this.aClass7_4) {
				local11 = (Class8_Sub1_Sub4) this.aClass7_4.method31();
			}
			while (local11 != null) {
				this.aBoolean48 = true;
				@Pc(33) byte[] local33 = null;
				if (this.aClient1.aClass39Array1[0] != null) {
					local33 = this.aClient1.aClass39Array1[local11.anInt678 + 1].method465(local11.anInt679);
				}
				if (!this.method103(local33, this.anIntArrayArray4[local11.anInt678][local11.anInt679], this.anIntArrayArray5[local11.anInt678][local11.anInt679])) {
					local33 = null;
				}
				@Pc(78) Class7 local78 = this.aClass7_4;
				synchronized (this.aClass7_4) {
					if (local33 == null) {
						this.aClass7_5.method29(local11);
					} else {
						local11.aByteArray16 = local33;
						@Pc(94) Class7 local94 = this.aClass7_1;
						synchronized (this.aClass7_1) {
							this.aClass7_1.method29(local11);
						}
					}
					local11 = (Class8_Sub1_Sub4) this.aClass7_4.method31();
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("5801, " + false + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(BI)I")
	public int method111(@OriginalArg(1) int arg0) {
		try {
			return this.aByte2 == 4 ? this.aByteArray4[arg0] & 0xFF : 4;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("82188, " + 4 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
