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

@OriginalClass("client!UCDUMMGN")
public final class Class36_Sub1 extends Class36 implements Runnable {

	@OriginalMember(owner = "client!UCDUMMGN", name = "M", descriptor = "I")
	private static int anInt702 = 536;

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!UCDUMMGN", name = "d", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!UCDUMMGN", name = "e", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!UCDUMMGN", name = "f", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!UCDUMMGN", name = "g", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!UCDUMMGN", name = "h", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!UCDUMMGN", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!UCDUMMGN", name = "l", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!UCDUMMGN", name = "n", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!UCDUMMGN", name = "o", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!UCDUMMGN", name = "p", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!UCDUMMGN", name = "q", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!UCDUMMGN", name = "u", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!UCDUMMGN", name = "x", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!UCDUMMGN", name = "y", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!UCDUMMGN", name = "B", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!UCDUMMGN", name = "C", descriptor = "Lclient!HLJPLHON;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!UCDUMMGN", name = "G", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!UCDUMMGN", name = "H", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!UCDUMMGN", name = "J", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!UCDUMMGN", name = "L", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!UCDUMMGN", name = "O", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!UCDUMMGN", name = "P", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "[B")
	private byte[] aByteArray15 = new byte[500];

	@OriginalMember(owner = "client!UCDUMMGN", name = "i", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_5 = new Class41(-388);

	@OriginalMember(owner = "client!UCDUMMGN", name = "j", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_6 = new Class41(-388);

	@OriginalMember(owner = "client!UCDUMMGN", name = "m", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!UCDUMMGN", name = "r", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!UCDUMMGN", name = "s", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_7 = new Class41(-388);

	@OriginalMember(owner = "client!UCDUMMGN", name = "t", descriptor = "[B")
	private byte[] aByteArray17 = new byte[65000];

	@OriginalMember(owner = "client!UCDUMMGN", name = "v", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_8 = new Class41(-388);

	@OriginalMember(owner = "client!UCDUMMGN", name = "w", descriptor = "Lclient!ABNYIQPF;")
	private Class2 aClass2_2 = new Class2(8);

	@OriginalMember(owner = "client!UCDUMMGN", name = "z", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!UCDUMMGN", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray17 = new int[4][];

	@OriginalMember(owner = "client!UCDUMMGN", name = "D", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!UCDUMMGN", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray18 = new int[4][];

	@OriginalMember(owner = "client!UCDUMMGN", name = "F", descriptor = "Ljava/lang/String;")
	public String aString10 = "";

	@OriginalMember(owner = "client!UCDUMMGN", name = "I", descriptor = "Lclient!WCVCMGLX;")
	private Class41 aClass41_9 = new Class41(-388);

	@OriginalMember(owner = "client!UCDUMMGN", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!UCDUMMGN", name = "N", descriptor = "Z")
	private boolean aBoolean157 = true;

	@OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(I)V")
	public void method490(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class41 local2 = this.aClass41_6;
			synchronized (this.aClass41_6) {
				this.aClass41_6.method538();
			}
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("25948, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IIZ[B)Z")
	private boolean method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local52 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("43794, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(Z)V")
	private void method492() {
		try {
			try {
				@Pc(14) int local14 = this.anInputStream1.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt700 == 0 && local14 >= 6) {
					this.aBoolean154 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream1.read(this.aByteArray15, local25, 6 - local25)) {
					}
					local49 = this.aByteArray15[0] & 0xFF;
					local65 = ((this.aByteArray15[1] & 0xFF) << 8) + (this.aByteArray15[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray15[3] & 0xFF) << 8) + (this.aByteArray15[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray15[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(96) Class1_Sub1_Sub4 local96 = (Class1_Sub1_Sub4) this.aClass41_9.method534(); local96 != null; local96 = (Class1_Sub1_Sub4) this.aClass41_9.method536()) {
						if (local96.anInt194 == local49 && local96.anInt192 == local65) {
							this.aClass1_Sub1_Sub4_1 = local96;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local96.anInt193 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt696 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass1_Sub1_Sub4_1.aByteArray9 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean56) {
								@Pc(154) Class41 local154 = this.aClass41_7;
								synchronized (this.aClass41_7) {
									this.aClass41_7.method531(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method552();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray9 == null && local88 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray9 = new byte[local81];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray9 == null && local88 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt699 = local88 * 500;
					this.anInt700 = 500;
					if (this.anInt700 > local81 - local88 * 500) {
						this.anInt700 = local81 - local88 * 500;
					}
				}
				if (this.anInt700 > 0 && local14 >= this.anInt700) {
					this.aBoolean154 = true;
					@Pc(233) byte[] local233 = this.aByteArray15;
					local49 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local233 = this.aClass1_Sub1_Sub4_1.aByteArray9;
						local49 = this.anInt699;
					}
					for (local65 = 0; local65 < this.anInt700; local65 += this.anInputStream1.read(local233, local65 + local49, this.anInt700 - local65)) {
					}
					if (this.anInt700 + this.anInt699 >= local233.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient3.aClass20Array1[0] != null) {
							this.aClient3.aClass20Array1[this.aClass1_Sub1_Sub4_1.anInt194 + 1].method236(this.aClass1_Sub1_Sub4_1.anInt192, local233, local233.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean56 && this.aClass1_Sub1_Sub4_1.anInt194 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean56 = true;
							this.aClass1_Sub1_Sub4_1.anInt194 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean56) {
							@Pc(326) Class41 local326 = this.aClass41_7;
							synchronized (this.aClass41_7) {
								this.aClass41_7.method531(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method552();
						}
					}
					this.anInt700 = 0;
				}
			} catch (@Pc(347) IOException local347) {
				try {
					this.aSocket1.close();
				} catch (@Pc(352) Exception local352) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt700 = 0;
			}
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("2783, " + true + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IZ)Z")
	public boolean method493(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray179[arg0] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("97902, " + arg0 + ", " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(BIII)V")
	public void method494(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient3.aClass20Array1[0] != null && this.anIntArrayArray18[arg2][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass20Array1[arg2 + 1].method235(arg1);
				if (!this.method491(this.anIntArrayArray18[arg2][arg1], this.anIntArrayArray17[arg2][arg1], local25)) {
					this.aByteArrayArray3[arg2][arg1] = arg0;
					if (arg0 > this.anInt694) {
						this.anInt694 = arg0;
					}
					this.anInt703++;
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("85082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -447 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(Lclient!HLJPLHON;I)V")
	private void method495(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(20) long local20 = System.currentTimeMillis();
					if (local20 - this.aLong25 < 4000L) {
						return;
					}
					this.aLong25 = local20;
					this.aSocket1 = this.aClient3.method617(client.anInt928 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(55) int local55 = 0; local55 < 8; local55++) {
						this.anInputStream1.read();
					}
					this.anInt696 = 0;
				}
				this.aByteArray15[0] = (byte) arg0.anInt194;
				this.aByteArray15[1] = (byte) (arg0.anInt192 >> 8);
				this.aByteArray15[2] = (byte) arg0.anInt192;
				if (arg0.aBoolean56) {
					this.aByteArray15[3] = 2;
				} else if (this.aClient3.aBoolean213) {
					this.aByteArray15[3] = 0;
				} else {
					this.aByteArray15[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray15, 0, 4);
				this.anInt695 = 0;
				this.anInt697 = -10000;
			} catch (@Pc(132) IOException local132) {
				try {
					this.aSocket1.close();
				} catch (@Pc(137) Exception local137) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt700 = 0;
				this.anInt697++;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("62073, " + arg0 + ", " + 4 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "(I)V")
	private void method496() {
		try {
			this.anInt692 = 0;
			this.anInt693 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass41_9.method534(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass41_9.method536()) {
				if (local12.aBoolean56) {
					this.anInt692++;
				} else {
					this.anInt693++;
				}
			}
			while (this.anInt692 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass41_8.method533();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray3[local12.anInt194][local12.anInt192] != 0) {
					this.anInt698++;
				}
				this.aByteArrayArray3[local12.anInt194][local12.anInt192] = 0;
				this.aClass41_9.method531(local12);
				this.anInt692++;
				this.method495(local12);
				this.aBoolean154 = true;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("29732, " + -104 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "()I")
	public int method497() {
		@Pc(2) Class2 local2 = this.aClass2_2;
		synchronized (this.aClass2_2) {
			return this.aClass2_2.method6();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean157) {
				this.anInt701++;
				@Pc(11) byte local11 = 20;
				if (this.anInt694 == 0 && this.aClient3.aClass20Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean154 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean154; local32++) {
					this.aBoolean154 = false;
					this.method501();
					this.method496();
					if (this.anInt692 == 0 && local32 >= 5) {
						break;
					}
					this.method506();
					if (this.anInputStream1 != null) {
						this.method492();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass41_9.method534(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass41_9.method536()) {
					if (local72.aBoolean56) {
						local67 = true;
						local72.anInt193++;
						if (local72.anInt193 > 50) {
							local72.anInt193 = 0;
							this.method495(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass41_9.method534(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass41_9.method536()) {
						local67 = true;
						local72.anInt193++;
						if (local72.anInt193 > 50) {
							local72.anInt193 = 0;
							this.method495(local72);
						}
					}
				}
				if (local67) {
					this.anInt696++;
					if (this.anInt696 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt700 = 0;
					}
				} else {
					this.anInt696 = 0;
					this.aString10 = "";
				}
				if (this.aClient3.aBoolean213 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt694 > 0 || this.aClient3.aClass20Array1[0] == null)) {
					this.anInt695++;
					if (this.anInt695 > 500) {
						this.anInt695 = 0;
						this.aByteArray15[0] = 0;
						this.aByteArray15[1] = 0;
						this.aByteArray15[2] = 0;
						this.aByteArray15[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray15, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt696 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "()V")
	public void method498() {
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(Lclient!UUIGNTAD;Lclient!client;)V")
	public void method499(@OriginalArg(0) Class38 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method512(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, anInt702);
			this.anIntArrayArray18[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray18[local22][local56] = local42.method57();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method512(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, anInt702);
			this.anIntArrayArray17[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray17[local36][local123] = local115.method60();
			}
		}
		local104 = arg0.method512("model_index", null);
		local56 = this.anIntArrayArray18[0].length;
		this.aByteArray16 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray16[local158] = local104[local158];
			} else {
				this.aByteArray16[local158] = 0;
			}
		}
		local104 = arg0.method512("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, anInt702);
		local56 = local104.length / 7;
		this.anIntArray178 = new int[local56];
		this.anIntArray182 = new int[local56];
		this.anIntArray183 = new int[local56];
		this.anIntArray181 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray178[local216] = local193.method57();
			this.anIntArray182[local216] = local193.method57();
			this.anIntArray183[local216] = local193.method57();
			this.anIntArray181[local216] = local193.method55();
		}
		local104 = arg0.method512("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, anInt702);
		local56 = local104.length / 2;
		this.anIntArray180 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray180[local268] = local193.method57();
		}
		local104 = arg0.method512("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, anInt702);
		local56 = local104.length;
		this.anIntArray179 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray179[local300] = local193.method55();
		}
		this.aClient3 = arg1;
		this.aBoolean157 = true;
		this.aClient3.method585(this, 2);
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(IZ)V")
	public void method500(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anIntArray178.length;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				if (arg0 || this.anIntArray181[local8] != 0) {
					this.method494((byte) 2, this.anIntArray183[local8], 3);
					this.method494((byte) 2, this.anIntArray182[local8], 3);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("15206, " + -250 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(Z)V")
	private void method501() {
		try {
			@Pc(2) Class41 local2 = this.aClass41_5;
			@Pc(9) Class1_Sub1_Sub4 local9;
			synchronized (this.aClass41_5) {
				local9 = (Class1_Sub1_Sub4) this.aClass41_5.method533();
			}
			while (local9 != null) {
				this.aBoolean154 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient3.aClass20Array1[0] != null) {
					local23 = this.aClient3.aClass20Array1[local9.anInt194 + 1].method235(local9.anInt192);
				}
				if (!this.method491(this.anIntArrayArray18[local9.anInt194][local9.anInt192], this.anIntArrayArray17[local9.anInt194][local9.anInt192], local23)) {
					local23 = null;
				}
				@Pc(68) Class41 local68 = this.aClass41_5;
				synchronized (this.aClass41_5) {
					if (local23 == null) {
						this.aClass41_8.method531(local9);
					} else {
						local9.aByteArray9 = local23;
						@Pc(84) Class41 local84 = this.aClass41_7;
						synchronized (this.aClass41_7) {
							this.aClass41_7.method531(local9);
						}
					}
					local9 = (Class1_Sub1_Sub4) this.aClass41_5.method533();
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("84504, " + false + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(II)I")
	public int method502(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray16[arg0] & 0xFF;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("97691, " + 3 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "()Lclient!HLJPLHON;")
	public Class1_Sub1_Sub4 method503() {
		@Pc(4) Class41 local4 = this.aClass41_7;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass41_7) {
			local11 = (Class1_Sub1_Sub4) this.aClass41_7.method533();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class2 local24 = this.aClass2_2;
		synchronized (this.aClass2_2) {
			local11.method553();
		}
		if (local11.aByteArray9 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray9));
			while (true) {
				if (local41 == this.aByteArray17.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray17, local41, this.aByteArray17.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray9 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray9[local93] = this.aByteArray17[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(B)I")
	public int method504(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.anIntArray180.length;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("13128, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(I)V")
	@Override
	public void method489(@OriginalArg(0) int arg0) {
		this.method507(0, arg0);
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IIII)I")
	public int method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = (arg0 << 8) + arg2;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray178.length; local15++) {
				if (this.anIntArray178[local15] == local13) {
					if (arg1 == 0) {
						return this.anIntArray182[local15];
					}
					return this.anIntArray183[local15];
				}
			}
			return -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("46895, " + -679 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "d", descriptor = "(I)V")
	private void method506() {
		try {
			while (this.anInt692 == 0) {
				if (this.anInt693 >= 10 || this.anInt694 == 0) {
					return;
				}
				@Pc(15) Class41 local15 = this.aClass41_6;
				@Pc(22) Class1_Sub1_Sub4 local22;
				synchronized (this.aClass41_6) {
					local22 = (Class1_Sub1_Sub4) this.aClass41_6.method533();
				}
				while (local22 != null) {
					if (this.aByteArrayArray3[local22.anInt194][local22.anInt192] != 0) {
						this.aByteArrayArray3[local22.anInt194][local22.anInt192] = 0;
						this.aClass41_9.method531(local22);
						this.method495(local22);
						this.aBoolean154 = true;
						if (this.anInt698 < this.anInt703) {
							this.anInt698++;
						}
						this.aString10 = "Loading extra files - " + this.anInt698 * 100 / this.anInt703 + "%";
						this.anInt693++;
						if (this.anInt693 == 10) {
							return;
						}
					}
					local15 = this.aClass41_6;
					synchronized (this.aClass41_6) {
						local22 = (Class1_Sub1_Sub4) this.aClass41_6.method533();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray3[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt694) {
							local123[local128] = 0;
							local22 = new Class1_Sub1_Sub4();
							local22.anInt194 = local116;
							local22.anInt192 = local128;
							local22.aBoolean56 = false;
							this.aClass41_9.method531(local22);
							this.method495(local22);
							this.aBoolean154 = true;
							if (this.anInt698 < this.anInt703) {
								this.anInt698++;
							}
							this.aString10 = "Loading extra files - " + this.anInt698 * 100 / this.anInt703 + "%";
							this.anInt693++;
							if (this.anInt693 == 10) {
								return;
							}
						}
					}
				}
				this.anInt694--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("61013, " + -591 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(II)V")
	public void method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray18.length || arg1 < 0 || arg1 > this.anIntArrayArray18[arg0].length || this.anIntArrayArray18[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class2 local27 = this.aClass2_2;
		synchronized (this.aClass2_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass2_2.method4(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass2_2.method5()) {
				if (local34.anInt194 == arg0 && local34.anInt192 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt194 = arg0;
			local34.anInt192 = arg1;
			local34.aBoolean56 = true;
			@Pc(71) Class41 local71 = this.aClass41_5;
			synchronized (this.aClass41_5) {
				this.aClass41_5.method531(local34);
			}
			this.aClass2_2.method2(local34);
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(III)V")
	public void method508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient3.aClass20Array1[0] != null && (this.anIntArrayArray18[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt694 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt194 = arg1;
				local30.anInt192 = arg0;
				local30.aBoolean56 = false;
				@Pc(42) Class41 local42 = this.aClass41_6;
				synchronized (this.aClass41_6) {
					this.aClass41_6.method531(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("62642, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "(II)I")
	public int method509(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray18[arg0].length;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("98120, " + arg0 + ", " + -20698 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IB)Z")
	public boolean method510(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray178.length; local7++) {
				if (this.anIntArray183[local7] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("44821, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
