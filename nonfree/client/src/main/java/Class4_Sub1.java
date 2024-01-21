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

@OriginalClass("client!IHBKBLZU")
public final class Class4_Sub1 extends Class4 implements Runnable {

	@OriginalMember(owner = "client!IHBKBLZU", name = "d", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!IHBKBLZU", name = "e", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!IHBKBLZU", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!IHBKBLZU", name = "j", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!IHBKBLZU", name = "l", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!IHBKBLZU", name = "m", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!IHBKBLZU", name = "o", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!IHBKBLZU", name = "p", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!IHBKBLZU", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!IHBKBLZU", name = "r", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!IHBKBLZU", name = "s", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!IHBKBLZU", name = "t", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!IHBKBLZU", name = "u", descriptor = "Lclient!NFBFXKHQ;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!IHBKBLZU", name = "x", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!IHBKBLZU", name = "y", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!IHBKBLZU", name = "A", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!IHBKBLZU", name = "B", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!IHBKBLZU", name = "D", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!IHBKBLZU", name = "E", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!IHBKBLZU", name = "G", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!IHBKBLZU", name = "L", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!IHBKBLZU", name = "N", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!IHBKBLZU", name = "O", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!IHBKBLZU", name = "P", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_2 = new Class8(0);

	@OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[4][];

	@OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!IHBKBLZU", name = "g", descriptor = "Z")
	private boolean aBoolean32 = true;

	@OriginalMember(owner = "client!IHBKBLZU", name = "h", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!IHBKBLZU", name = "i", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!IHBKBLZU", name = "k", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_3 = new Class8(0);

	@OriginalMember(owner = "client!IHBKBLZU", name = "n", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_4 = new Class8(0);

	@OriginalMember(owner = "client!IHBKBLZU", name = "v", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!IHBKBLZU", name = "w", descriptor = "[B")
	private byte[] aByteArray2 = new byte[500];

	@OriginalMember(owner = "client!IHBKBLZU", name = "z", descriptor = "Lclient!LKYWDMZN;")
	private Class21 aClass21_2 = new Class21(0);

	@OriginalMember(owner = "client!IHBKBLZU", name = "C", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_5 = new Class8(0);

	@OriginalMember(owner = "client!IHBKBLZU", name = "F", descriptor = "Lclient!ETMNPRAF;")
	private Class8 aClass8_6 = new Class8(0);

	@OriginalMember(owner = "client!IHBKBLZU", name = "H", descriptor = "I")
	private int anInt149 = -43582;

	@OriginalMember(owner = "client!IHBKBLZU", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[4][];

	@OriginalMember(owner = "client!IHBKBLZU", name = "J", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!IHBKBLZU", name = "K", descriptor = "Ljava/lang/String;")
	public String aString3 = "";

	@OriginalMember(owner = "client!IHBKBLZU", name = "M", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(II)I")
	public int method110(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray6[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("65532, " + arg0 + ", " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "(II)V")
	public void method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray6.length || arg1 < 0 || arg1 > this.anIntArrayArray6[arg0].length || this.anIntArrayArray6[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class21 local27 = this.aClass21_2;
		synchronized (this.aClass21_2) {
			@Pc(34) Class1_Sub1_Sub3 local34;
			for (local34 = (Class1_Sub1_Sub3) this.aClass21_2.method218(); local34 != null; local34 = (Class1_Sub1_Sub3) this.aClass21_2.method219()) {
				if (local34.anInt351 == arg0 && local34.anInt349 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub3();
			local34.anInt351 = arg0;
			local34.anInt349 = arg1;
			local34.aBoolean67 = true;
			@Pc(71) Class8 local71 = this.aClass8_2;
			synchronized (this.aClass8_2) {
				this.aClass8_2.method43(local34);
			}
			this.aClass21_2.method216(local34);
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(B)V")
	private void method112() {
		try {
			@Pc(14) Class8 local14 = this.aClass8_2;
			@Pc(21) Class1_Sub1_Sub3 local21;
			synchronized (this.aClass8_2) {
				local21 = (Class1_Sub1_Sub3) this.aClass8_2.method45();
			}
			while (local21 != null) {
				this.aBoolean33 = true;
				@Pc(32) byte[] local32 = null;
				if (this.aClient1.aClass47Array1[0] != null) {
					local32 = this.aClient1.aClass47Array1[local21.anInt351 + 1].method538(local21.anInt349);
				}
				if (!this.method123(local32, this.anIntArrayArray6[local21.anInt351][local21.anInt349], this.anIntArrayArray5[local21.anInt351][local21.anInt349])) {
					local32 = null;
				}
				@Pc(77) Class8 local77 = this.aClass8_2;
				synchronized (this.aClass8_2) {
					if (local32 == null) {
						this.aClass8_6.method43(local21);
					} else {
						local21.aByteArray6 = local32;
						@Pc(93) Class8 local93 = this.aClass8_4;
						synchronized (this.aClass8_4) {
							this.aClass8_4.method43(local21);
						}
					}
					local21 = (Class1_Sub1_Sub3) this.aClass8_2.method45();
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("23627, " + -59 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(Lclient!NFBFXKHQ;B)V")
	private void method113(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong7 < 4000L) {
						return;
					}
					this.aLong7 = local10;
					this.aSocket1 = this.aClient1.method720(client.anInt1031 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream1.read();
					}
					this.anInt151 = 0;
				}
				this.aByteArray2[0] = (byte) arg0.anInt351;
				this.aByteArray2[1] = (byte) (arg0.anInt349 >> 8);
				this.aByteArray2[2] = (byte) arg0.anInt349;
				if (arg0.aBoolean67) {
					this.aByteArray2[3] = 2;
				} else if (this.aClient1.aBoolean213) {
					this.aByteArray2[3] = 0;
				} else {
					this.aByteArray2[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray2, 0, 4);
				this.anInt152 = 0;
				this.anInt143 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket1.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt148 = 0;
				this.anInt143++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("14333, " + arg0 + ", " + 9 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(ZI)I")
	public int method114(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray4[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("20988, " + true + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean32) {
				this.anInt146++;
				@Pc(11) byte local11 = 20;
				if (this.anInt150 == 0 && this.aClient1.aClass47Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean33 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean33; local32++) {
					this.aBoolean33 = false;
					this.method112();
					this.method116();
					if (this.anInt144 == 0 && local32 >= 5) {
						break;
					}
					this.method130();
					if (this.anInputStream1 != null) {
						this.method120();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub3 local72;
				for (local72 = (Class1_Sub1_Sub3) this.aClass8_5.method46(); local72 != null; local72 = (Class1_Sub1_Sub3) this.aClass8_5.method48()) {
					if (local72.aBoolean67) {
						local67 = true;
						local72.anInt350++;
						if (local72.anInt350 > 50) {
							local72.anInt350 = 0;
							this.method113(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub3) this.aClass8_5.method46(); local72 != null; local72 = (Class1_Sub1_Sub3) this.aClass8_5.method48()) {
						local67 = true;
						local72.anInt350++;
						if (local72.anInt350 > 50) {
							local72.anInt350 = 0;
							this.method113(local72);
						}
					}
				}
				if (local67) {
					this.anInt151++;
					if (this.anInt151 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt148 = 0;
					}
				} else {
					this.anInt151 = 0;
					this.aString3 = "";
				}
				if (this.aClient1.aBoolean213 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt150 > 0 || this.aClient1.aClass47Array1[0] == null)) {
					this.anInt152++;
					if (this.anInt152 > 500) {
						this.anInt152 = 0;
						this.aByteArray2[0] = 0;
						this.aByteArray2[1] = 0;
						this.aByteArray2[2] = 0;
						this.aByteArray2[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray2, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt151 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "()I")
	public int method115() {
		@Pc(2) Class21 local2 = this.aClass21_2;
		synchronized (this.aClass21_2) {
			return this.aClass21_2.method220();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "(I)V")
	private void method116() {
		try {
			this.anInt144 = 0;
			this.anInt145 = 0;
			@Pc(23) Class1_Sub1_Sub3 local23;
			for (local23 = (Class1_Sub1_Sub3) this.aClass8_5.method46(); local23 != null; local23 = (Class1_Sub1_Sub3) this.aClass8_5.method48()) {
				if (local23.aBoolean67) {
					this.anInt144++;
				} else {
					this.anInt145++;
				}
			}
			while (this.anInt144 < 10) {
				local23 = (Class1_Sub1_Sub3) this.aClass8_6.method45();
				if (local23 == null) {
					break;
				}
				if (this.aByteArrayArray1[local23.anInt351][local23.anInt349] != 0) {
					this.anInt142++;
				}
				this.aByteArrayArray1[local23.anInt351][local23.anInt349] = 0;
				this.aClass8_5.method43(local23);
				this.anInt144++;
				this.method113(local23);
				this.aBoolean33 = true;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("97933, " + 46379 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(I)V")
	@Override
	public void method109(@OriginalArg(0) int arg0) {
		this.method111(0, arg0);
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(Lclient!WEMOPWVJ;Lclient!client;)V")
	public void method117(@OriginalArg(0) Class43 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method515(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub4 local42 = new Class1_Sub1_Sub4(local31, true);
			this.anIntArrayArray6[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray6[local22][local56] = local42.method407();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method515(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub4 local115 = new Class1_Sub1_Sub4(local104, true);
			this.anIntArrayArray5[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray5[local36][local123] = local115.method410();
			}
		}
		local104 = arg0.method515("model_index", null);
		local56 = this.anIntArrayArray6[0].length;
		this.aByteArray4 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray4[local158] = local104[local158];
			} else {
				this.aByteArray4[local158] = 0;
			}
		}
		local104 = arg0.method515("map_index", null);
		@Pc(193) Class1_Sub1_Sub4 local193 = new Class1_Sub1_Sub4(local104, true);
		local56 = local104.length / 7;
		this.anIntArray50 = new int[local56];
		this.anIntArray51 = new int[local56];
		this.anIntArray46 = new int[local56];
		this.anIntArray49 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray50[local216] = local193.method407();
			this.anIntArray51[local216] = local193.method407();
			this.anIntArray46[local216] = local193.method407();
			this.anIntArray49[local216] = local193.method405();
		}
		local104 = arg0.method515("anim_index", null);
		local193 = new Class1_Sub1_Sub4(local104, true);
		local56 = local104.length / 2;
		this.anIntArray47 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray47[local268] = local193.method407();
		}
		local104 = arg0.method515("midi_index", null);
		local193 = new Class1_Sub1_Sub4(local104, true);
		local56 = local104.length;
		this.anIntArray48 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray48[local300] = local193.method405();
		}
		this.aClient1 = arg1;
		this.aBoolean32 = true;
		this.aClient1.method583(this, 2);
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "()V")
	public void method118() {
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(BBII)V")
	public void method119(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass47Array1[0] != null && this.anIntArrayArray6[arg1][arg2] != 0) {
				@Pc(29) byte[] local29 = this.aClient1.aClass47Array1[arg1 + 1].method538(arg2);
				if (!this.method123(local29, this.anIntArrayArray6[arg1][arg2], this.anIntArrayArray5[arg1][arg2])) {
					this.aByteArrayArray1[arg1][arg2] = arg0;
					if (arg0 > this.anInt150) {
						this.anInt150 = arg0;
					}
					this.anInt141++;
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("34572, " + arg0 + ", " + -5 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "(B)V")
	private void method120() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream1.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt148 == 0 && local9 >= 6) {
					this.aBoolean33 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream1.read(this.aByteArray2, local20, 6 - local20)) {
					}
					local44 = this.aByteArray2[0] & 0xFF;
					local60 = ((this.aByteArray2[1] & 0xFF) << 8) + (this.aByteArray2[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray2[3] & 0xFF) << 8) + (this.aByteArray2[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray2[5] & 0xFF;
					this.aClass1_Sub1_Sub3_1 = null;
					for (@Pc(91) Class1_Sub1_Sub3 local91 = (Class1_Sub1_Sub3) this.aClass8_5.method46(); local91 != null; local91 = (Class1_Sub1_Sub3) this.aClass8_5.method48()) {
						if (local91.anInt351 == local44 && local91.anInt349 == local60) {
							this.aClass1_Sub1_Sub3_1 = local91;
						}
						if (this.aClass1_Sub1_Sub3_1 != null) {
							local91.anInt350 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub3_1 != null) {
						this.anInt151 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass1_Sub1_Sub3_1.aByteArray6 = null;
							if (this.aClass1_Sub1_Sub3_1.aBoolean67) {
								@Pc(149) Class8 local149 = this.aClass8_4;
								synchronized (this.aClass8_4) {
									this.aClass8_4.method43(this.aClass1_Sub1_Sub3_1);
								}
							} else {
								this.aClass1_Sub1_Sub3_1.method551();
							}
							this.aClass1_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub3_1.aByteArray6 == null && local83 == 0) {
								this.aClass1_Sub1_Sub3_1.aByteArray6 = new byte[local76];
							}
							if (this.aClass1_Sub1_Sub3_1.aByteArray6 == null && local83 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt147 = local83 * 500;
					this.anInt148 = 500;
					if (this.anInt148 > local76 - local83 * 500) {
						this.anInt148 = local76 - local83 * 500;
					}
				}
				if (this.anInt148 > 0 && local9 >= this.anInt148) {
					this.aBoolean33 = true;
					@Pc(228) byte[] local228 = this.aByteArray2;
					local44 = 0;
					if (this.aClass1_Sub1_Sub3_1 != null) {
						local228 = this.aClass1_Sub1_Sub3_1.aByteArray6;
						local44 = this.anInt147;
					}
					for (local60 = 0; local60 < this.anInt148; local60 += this.anInputStream1.read(local228, local60 + local44, this.anInt148 - local60)) {
					}
					if (this.anInt148 + this.anInt147 >= local228.length && this.aClass1_Sub1_Sub3_1 != null) {
						if (this.aClient1.aClass47Array1[0] != null) {
							this.aClient1.aClass47Array1[this.aClass1_Sub1_Sub3_1.anInt351 + 1].method539(this.aClass1_Sub1_Sub3_1.anInt349, local228.length, 72, local228);
						}
						if (!this.aClass1_Sub1_Sub3_1.aBoolean67 && this.aClass1_Sub1_Sub3_1.anInt351 == 3) {
							this.aClass1_Sub1_Sub3_1.aBoolean67 = true;
							this.aClass1_Sub1_Sub3_1.anInt351 = 93;
						}
						if (this.aClass1_Sub1_Sub3_1.aBoolean67) {
							@Pc(321) Class8 local321 = this.aClass8_4;
							synchronized (this.aClass8_4) {
								this.aClass8_4.method43(this.aClass1_Sub1_Sub3_1);
							}
						} else {
							this.aClass1_Sub1_Sub3_1.method551();
						}
					}
					this.anInt148 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket1.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt148 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("61654, " + 22 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "(II)Z")
	public boolean method121(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray48[arg0] == 1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("61279, " + arg0 + ", " + -672 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(Z)I")
	public int method122() {
		try {
			return this.anIntArray47.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("72127, " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(Z[BII)Z")
	private boolean method123(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("56144, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(ZZ)V")
	public void method124(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray50.length;
			for (@Pc(15) int local15 = 0; local15 < local3; local15++) {
				if (arg0 || this.anIntArray49[local15] != 0) {
					this.method119((byte) 2, 3, this.anIntArray46[local15]);
					this.method119((byte) 2, 3, this.anIntArray51[local15]);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("80758, " + true + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(IIZI)I")
	public int method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg2;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray50.length; local7++) {
				if (this.anIntArray50[local7] == local5) {
					if (arg0 == 0) {
						return this.anIntArray51[local7];
					}
					return this.anIntArray46[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("41259, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "(I)V")
	public void method126(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class8 local6 = this.aClass8_3;
			synchronized (this.aClass8_3) {
				this.aClass8_3.method50();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("48136, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "()Lclient!NFBFXKHQ;")
	public Class1_Sub1_Sub3 method127() {
		@Pc(4) Class8 local4 = this.aClass8_4;
		@Pc(11) Class1_Sub1_Sub3 local11;
		synchronized (this.aClass8_4) {
			local11 = (Class1_Sub1_Sub3) this.aClass8_4.method45();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class21 local24 = this.aClass21_2;
		synchronized (this.aClass21_2) {
			local11.method552();
		}
		if (local11.aByteArray6 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray6));
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
		local11.aByteArray6 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray6[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(III)V")
	public void method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient1.aClass47Array1[0] != null && (this.anIntArrayArray6[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt150 != 0))) {
				@Pc(30) Class1_Sub1_Sub3 local30 = new Class1_Sub1_Sub3();
				local30.anInt351 = arg1;
				local30.anInt349 = arg0;
				local30.aBoolean67 = false;
				@Pc(45) Class8 local45 = this.aClass8_3;
				synchronized (this.aClass8_3) {
					this.aClass8_3.method43(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("76714, " + arg0 + ", " + arg1 + ", " + -751 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(IB)Z")
	public boolean method129(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray50.length; local1++) {
				if (this.anIntArray46[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("50692, " + arg0 + ", " + 8 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "(B)V")
	private void method130() {
		try {
			while (this.anInt144 == 0) {
				if (this.anInt145 >= 10 || this.anInt150 == 0) {
					return;
				}
				@Pc(11) Class8 local11 = this.aClass8_3;
				@Pc(18) Class1_Sub1_Sub3 local18;
				synchronized (this.aClass8_3) {
					local18 = (Class1_Sub1_Sub3) this.aClass8_3.method45();
				}
				while (local18 != null) {
					if (this.aByteArrayArray1[local18.anInt351][local18.anInt349] != 0) {
						this.aByteArrayArray1[local18.anInt351][local18.anInt349] = 0;
						this.aClass8_5.method43(local18);
						this.method113(local18);
						this.aBoolean33 = true;
						if (this.anInt142 < this.anInt141) {
							this.anInt142++;
						}
						this.aString3 = "Loading extra files - " + this.anInt142 * 100 / this.anInt141 + "%";
						this.anInt145++;
						if (this.anInt145 == 10) {
							return;
						}
					}
					local11 = this.aClass8_3;
					synchronized (this.aClass8_3) {
						local18 = (Class1_Sub1_Sub3) this.aClass8_3.method45();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray1[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt150) {
							local119[local124] = 0;
							local18 = new Class1_Sub1_Sub3();
							local18.anInt351 = local112;
							local18.anInt349 = local124;
							local18.aBoolean67 = false;
							this.aClass8_5.method43(local18);
							this.method113(local18);
							this.aBoolean33 = true;
							if (this.anInt142 < this.anInt141) {
								this.anInt142++;
							}
							this.aString3 = "Loading extra files - " + this.anInt142 * 100 / this.anInt141 + "%";
							this.anInt145++;
							if (this.anInt145 == 10) {
								return;
							}
						}
					}
				}
				this.anInt150--;
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("43482, " + 1 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}
}
