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

@OriginalClass("client!RKMPVAZH")
public final class Class28_Sub1 extends Class28 implements Runnable {

	@OriginalMember(owner = "client!RKMPVAZH", name = "U", descriptor = "Z")
	private static boolean aBoolean147;

	@OriginalMember(owner = "client!RKMPVAZH", name = "c", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!RKMPVAZH", name = "g", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!RKMPVAZH", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!RKMPVAZH", name = "k", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!RKMPVAZH", name = "l", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!RKMPVAZH", name = "o", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!RKMPVAZH", name = "s", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!RKMPVAZH", name = "t", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!RKMPVAZH", name = "u", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!RKMPVAZH", name = "v", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!RKMPVAZH", name = "w", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!RKMPVAZH", name = "x", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!RKMPVAZH", name = "y", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!RKMPVAZH", name = "z", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!RKMPVAZH", name = "A", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!RKMPVAZH", name = "B", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!RKMPVAZH", name = "F", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!RKMPVAZH", name = "G", descriptor = "Lclient!HSCHLCCN;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!RKMPVAZH", name = "J", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!RKMPVAZH", name = "M", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!RKMPVAZH", name = "N", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!RKMPVAZH", name = "Q", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!RKMPVAZH", name = "R", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!RKMPVAZH", name = "T", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "Ljava/lang/String;")
	public String aString16 = "";

	@OriginalMember(owner = "client!RKMPVAZH", name = "d", descriptor = "B")
	private byte aByte21 = 9;

	@OriginalMember(owner = "client!RKMPVAZH", name = "e", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_5 = new Class16(aBoolean147);

	@OriginalMember(owner = "client!RKMPVAZH", name = "f", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_6 = new Class16(aBoolean147);

	@OriginalMember(owner = "client!RKMPVAZH", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray16 = new int[4][];

	@OriginalMember(owner = "client!RKMPVAZH", name = "j", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_7 = new Class16(aBoolean147);

	@OriginalMember(owner = "client!RKMPVAZH", name = "m", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_8 = new Class16(aBoolean147);

	@OriginalMember(owner = "client!RKMPVAZH", name = "n", descriptor = "[B")
	private byte[] aByteArray17 = new byte[65000];

	@OriginalMember(owner = "client!RKMPVAZH", name = "p", descriptor = "Lclient!IHMCQRZY;")
	private Class16 aClass16_9 = new Class16(aBoolean147);

	@OriginalMember(owner = "client!RKMPVAZH", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray17 = new int[4][];

	@OriginalMember(owner = "client!RKMPVAZH", name = "r", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!RKMPVAZH", name = "C", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!RKMPVAZH", name = "D", descriptor = "Lclient!KZFVEUEL;")
	private Class20 aClass20_1 = new Class20(9);

	@OriginalMember(owner = "client!RKMPVAZH", name = "E", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!RKMPVAZH", name = "H", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!RKMPVAZH", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!RKMPVAZH", name = "K", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!RKMPVAZH", name = "L", descriptor = "I")
	private int anInt684 = 550;

	@OriginalMember(owner = "client!RKMPVAZH", name = "O", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!RKMPVAZH", name = "P", descriptor = "I")
	private int anInt687 = -6404;

	@OriginalMember(owner = "client!RKMPVAZH", name = "S", descriptor = "I")
	private int anInt689 = -319;

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(I)V")
	@Override
	public void method450(@OriginalArg(0) int arg0) {
		this.method469(0, arg0);
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(I)V")
	private void method451(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -6404) {
				this.anInt689 = 68;
			}
			while (this.anInt681 == 0) {
				if (this.anInt682 >= 10 || this.anInt688 == 0) {
					return;
				}
				@Pc(15) Class16 local15 = this.aClass16_9;
				@Pc(22) Class1_Sub1_Sub3 local22;
				synchronized (this.aClass16_9) {
					local22 = (Class1_Sub1_Sub3) this.aClass16_9.method184();
				}
				while (local22 != null) {
					if (this.aByteArrayArray4[local22.anInt332][local22.anInt333] != 0) {
						this.aByteArrayArray4[local22.anInt332][local22.anInt333] = 0;
						this.aClass16_7.method182(local22);
						this.method455(550, local22);
						this.aBoolean145 = true;
						if (this.anInt683 < this.anInt678) {
							this.anInt683++;
						}
						this.aString16 = "Loading extra files - " + this.anInt683 * 100 / this.anInt678 + "%";
						this.anInt682++;
						if (this.anInt682 == 10) {
							return;
						}
					}
					local15 = this.aClass16_9;
					synchronized (this.aClass16_9) {
						local22 = (Class1_Sub1_Sub3) this.aClass16_9.method184();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray4[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt688) {
							local123[local128] = 0;
							local22 = new Class1_Sub1_Sub3();
							local22.anInt332 = local116;
							local22.anInt333 = local128;
							local22.aBoolean69 = false;
							this.aClass16_7.method182(local22);
							this.method455(550, local22);
							this.aBoolean145 = true;
							if (this.anInt683 < this.anInt678) {
								this.anInt683++;
							}
							this.aString16 = "Loading extra files - " + this.anInt683 * 100 / this.anInt678 + "%";
							this.anInt682++;
							if (this.anInt682 == 10) {
								return;
							}
						}
					}
				}
				this.anInt688--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("19402, " + arg0 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "()I")
	public int method452() {
		@Pc(2) Class20 local2 = this.aClass20_1;
		synchronized (this.aClass20_1) {
			return this.aClass20_1.method249();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean146) {
				this.anInt679++;
				@Pc(11) byte local11 = 20;
				if (this.anInt688 == 0 && this.aClient4.aClass34Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean145 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean145; local32++) {
					this.aBoolean145 = false;
					this.method468();
					this.method461();
					if (this.anInt681 == 0 && local32 >= 5) {
						break;
					}
					this.method451(this.anInt687);
					if (this.anInputStream1 != null) {
						this.method453((byte) 6);
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class1_Sub1_Sub3 local73;
				for (local73 = (Class1_Sub1_Sub3) this.aClass16_7.method185(); local73 != null; local73 = (Class1_Sub1_Sub3) this.aClass16_7.method187()) {
					if (local73.aBoolean69) {
						local68 = true;
						local73.anInt331++;
						if (local73.anInt331 > 50) {
							local73.anInt331 = 0;
							this.method455(550, local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class1_Sub1_Sub3) this.aClass16_7.method185(); local73 != null; local73 = (Class1_Sub1_Sub3) this.aClass16_7.method187()) {
						local68 = true;
						local73.anInt331++;
						if (local73.anInt331 > 50) {
							local73.anInt331 = 0;
							this.method455(550, local73);
						}
					}
				}
				if (local68) {
					this.anInt676++;
					if (this.anInt676 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt686 = 0;
					}
				} else {
					this.anInt676 = 0;
					this.aString16 = "";
				}
				if (this.aClient4.aBoolean188 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt688 > 0 || this.aClient4.aClass34Array1[0] == null)) {
					this.anInt677++;
					if (this.anInt677 > 500) {
						this.anInt677 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt676 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(B)V")
	private void method453(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(15) int local15 = this.anInputStream1.available();
				@Pc(50) int local50;
				@Pc(66) int local66;
				if (this.anInt686 == 0 && local15 >= 6) {
					this.aBoolean145 = true;
					for (@Pc(26) int local26 = 0; local26 < 6; local26 += this.anInputStream1.read(this.aByteArray18, local26, 6 - local26)) {
					}
					local50 = this.aByteArray18[0] & 0xFF;
					local66 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(82) int local82 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(89) int local89 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub3_1 = null;
					for (@Pc(97) Class1_Sub1_Sub3 local97 = (Class1_Sub1_Sub3) this.aClass16_7.method185(); local97 != null; local97 = (Class1_Sub1_Sub3) this.aClass16_7.method187()) {
						if (local97.anInt332 == local50 && local97.anInt333 == local66) {
							this.aClass1_Sub1_Sub3_1 = local97;
						}
						if (this.aClass1_Sub1_Sub3_1 != null) {
							local97.anInt331 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub3_1 != null) {
						this.anInt676 = 0;
						if (local82 == 0) {
							signlink.reporterror("Rej: " + local50 + "," + local66);
							this.aClass1_Sub1_Sub3_1.aByteArray4 = null;
							if (this.aClass1_Sub1_Sub3_1.aBoolean69) {
								@Pc(155) Class16 local155 = this.aClass16_6;
								synchronized (this.aClass16_6) {
									this.aClass16_6.method182(this.aClass1_Sub1_Sub3_1);
								}
							} else {
								this.aClass1_Sub1_Sub3_1.method560();
							}
							this.aClass1_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub3_1.aByteArray4 == null && local89 == 0) {
								this.aClass1_Sub1_Sub3_1.aByteArray4 = new byte[local82];
							}
							if (this.aClass1_Sub1_Sub3_1.aByteArray4 == null && local89 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt685 = local89 * 500;
					this.anInt686 = 500;
					if (this.anInt686 > local82 - local89 * 500) {
						this.anInt686 = local82 - local89 * 500;
					}
				}
				if (this.anInt686 > 0 && local15 >= this.anInt686) {
					this.aBoolean145 = true;
					@Pc(234) byte[] local234 = this.aByteArray18;
					local50 = 0;
					if (this.aClass1_Sub1_Sub3_1 != null) {
						local234 = this.aClass1_Sub1_Sub3_1.aByteArray4;
						local50 = this.anInt685;
					}
					for (local66 = 0; local66 < this.anInt686; local66 += this.anInputStream1.read(local234, local66 + local50, this.anInt686 - local66)) {
					}
					if (this.anInt686 + this.anInt685 >= local234.length && this.aClass1_Sub1_Sub3_1 != null) {
						if (this.aClient4.aClass34Array1[0] != null) {
							this.aClient4.aClass34Array1[this.aClass1_Sub1_Sub3_1.anInt332 + 1].method437(this.aClass1_Sub1_Sub3_1.anInt333, local234.length, local234);
						}
						if (!this.aClass1_Sub1_Sub3_1.aBoolean69 && this.aClass1_Sub1_Sub3_1.anInt332 == 3) {
							this.aClass1_Sub1_Sub3_1.aBoolean69 = true;
							this.aClass1_Sub1_Sub3_1.anInt332 = 93;
						}
						if (this.aClass1_Sub1_Sub3_1.aBoolean69) {
							@Pc(327) Class16 local327 = this.aClass16_6;
							synchronized (this.aClass16_6) {
								this.aClass16_6.method182(this.aClass1_Sub1_Sub3_1);
							}
						} else {
							this.aClass1_Sub1_Sub3_1.method560();
						}
					}
					this.anInt686 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket1.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt686 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("58320, " + arg0 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IBIB)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (this.aClient4.aClass34Array1[0] != null && this.anIntArrayArray16[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient4.aClass34Array1[arg0 + 1].method436(403, arg2);
				if (!this.method465(local25, this.anIntArrayArray16[arg0][arg2], this.anIntArrayArray17[arg0][arg2])) {
					this.aByteArrayArray4[arg0][arg2] = arg1;
					if (arg3 != 9) {
						this.anInt689 = -138;
					}
					if (arg1 > this.anInt688) {
						this.anInt688 = arg1;
					}
					this.anInt678++;
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("55935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(ILclient!HSCHLCCN;)V")
	private void method455(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				if (this.aSocket1 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong23 < 4000L) {
						return;
					}
					this.aLong23 = local10;
					this.aSocket1 = this.aClient4.method709(client.anInt956 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream1.read();
					}
					this.anInt676 = 0;
				}
				this.aByteArray18[0] = (byte) arg1.anInt332;
				this.aByteArray18[1] = (byte) (arg1.anInt333 >> 8);
				this.aByteArray18[2] = (byte) arg1.anInt333;
				if (arg1.aBoolean69) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient4.aBoolean188) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray18, 0, 4);
				this.anInt677 = 0;
				this.anInt680 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket1.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt686 = 0;
				this.anInt680++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("22678, " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(ZI)Z")
	public boolean method456(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray167[arg0] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("20638, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IB)I")
	public int method457(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray16[arg0] & 0xFF;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("17098, " + arg0 + ", " + -98 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(Lclient!IEMHZJLX;Lclient!client;)V")
	public void method458(@OriginalArg(0) Class15 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method181(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub4 local42 = new Class1_Sub1_Sub4(0, local31);
			this.anIntArrayArray16[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray16[local22][local56] = local42.method296();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method181(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub4 local115 = new Class1_Sub1_Sub4(0, local104);
			this.anIntArrayArray17[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray17[local36][local123] = local115.method299();
			}
		}
		local104 = arg0.method181("model_index", null);
		local56 = this.anIntArrayArray16[0].length;
		this.aByteArray16 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray16[local158] = local104[local158];
			} else {
				this.aByteArray16[local158] = 0;
			}
		}
		local104 = arg0.method181("map_index", null);
		@Pc(193) Class1_Sub1_Sub4 local193 = new Class1_Sub1_Sub4(0, local104);
		local56 = local104.length / 7;
		this.anIntArray170 = new int[local56];
		this.anIntArray169 = new int[local56];
		this.anIntArray166 = new int[local56];
		this.anIntArray171 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray170[local216] = local193.method296();
			this.anIntArray169[local216] = local193.method296();
			this.anIntArray166[local216] = local193.method296();
			this.anIntArray171[local216] = local193.method294();
		}
		local104 = arg0.method181("anim_index", null);
		local193 = new Class1_Sub1_Sub4(0, local104);
		local56 = local104.length / 2;
		this.anIntArray168 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray168[local268] = local193.method296();
		}
		local104 = arg0.method181("midi_index", null);
		local193 = new Class1_Sub1_Sub4(0, local104);
		local56 = local104.length;
		this.anIntArray167 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray167[local300] = local193.method294();
		}
		this.aClient4 = arg1;
		this.aBoolean146 = true;
		this.aClient4.method585(this, 2);
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(Z)I")
	public int method459() {
		try {
			return this.anIntArray168.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("83730, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IIIZ)I")
	public int method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(15) int local15 = (arg1 << 8) + arg2;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray170.length; local17++) {
				if (this.anIntArray170[local17] == local15) {
					if (arg0 == 0) {
						return this.anIntArray169[local17];
					}
					return this.anIntArray166[local17];
				}
			}
			return -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("62163, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(B)V")
	private void method461() {
		try {
			this.anInt681 = 0;
			this.anInt682 = 0;
			@Pc(18) Class1_Sub1_Sub3 local18;
			for (local18 = (Class1_Sub1_Sub3) this.aClass16_7.method185(); local18 != null; local18 = (Class1_Sub1_Sub3) this.aClass16_7.method187()) {
				if (local18.aBoolean69) {
					this.anInt681++;
				} else {
					this.anInt682++;
				}
			}
			while (this.anInt681 < 10) {
				local18 = (Class1_Sub1_Sub3) this.aClass16_8.method184();
				if (local18 == null) {
					break;
				}
				if (this.aByteArrayArray4[local18.anInt332][local18.anInt333] != 0) {
					this.anInt683++;
				}
				this.aByteArrayArray4[local18.anInt332][local18.anInt333] = 0;
				this.aClass16_7.method182(local18);
				this.anInt681++;
				this.method455(550, local18);
				this.aBoolean145 = true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("61166, " + -36 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "()Lclient!HSCHLCCN;")
	public Class1_Sub1_Sub3 method462() {
		@Pc(4) Class16 local4 = this.aClass16_6;
		@Pc(11) Class1_Sub1_Sub3 local11;
		synchronized (this.aClass16_6) {
			local11 = (Class1_Sub1_Sub3) this.aClass16_6.method184();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class20 local24 = this.aClass20_1;
		synchronized (this.aClass20_1) {
			local11.method511();
		}
		if (local11.aByteArray4 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray4));
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
		local11.aByteArray4 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray4[local93] = this.aByteArray17[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IZ)V")
	public void method463(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray170.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray171[local5] != 0) {
					this.method454(3, (byte) 2, this.anIntArray166[local5], this.aByte21);
					this.method454(3, (byte) 2, this.anIntArray169[local5], this.aByte21);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("38066, " + 3 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "c", descriptor = "()V")
	public void method464() {
		this.aBoolean146 = false;
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "([BIII)Z")
	private boolean method465(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local42 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("4944, " + arg0 + ", " + arg1 + ", " + -250 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(II)Z")
	public boolean method466(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray170.length; local1++) {
				if (this.anIntArray166[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("48430, " + 0 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(ZI)I")
	public int method467(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray16[arg0].length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("44079, " + true + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "c", descriptor = "(I)V")
	private void method468() {
		try {
			@Pc(4) Class16 local4 = this.aClass16_5;
			@Pc(11) Class1_Sub1_Sub3 local11;
			synchronized (this.aClass16_5) {
				local11 = (Class1_Sub1_Sub3) this.aClass16_5.method184();
			}
			while (local11 != null) {
				this.aBoolean145 = true;
				@Pc(27) byte[] local27 = null;
				if (this.aClient4.aClass34Array1[0] != null) {
					local27 = this.aClient4.aClass34Array1[local11.anInt332 + 1].method436(403, local11.anInt333);
				}
				if (!this.method465(local27, this.anIntArrayArray16[local11.anInt332][local11.anInt333], this.anIntArrayArray17[local11.anInt332][local11.anInt333])) {
					local27 = null;
				}
				@Pc(72) Class16 local72 = this.aClass16_5;
				synchronized (this.aClass16_5) {
					if (local27 == null) {
						this.aClass16_8.method182(local11);
					} else {
						local11.aByteArray4 = local27;
						@Pc(88) Class16 local88 = this.aClass16_6;
						synchronized (this.aClass16_6) {
							this.aClass16_6.method182(local11);
						}
					}
					local11 = (Class1_Sub1_Sub3) this.aClass16_5.method184();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("26507, " + -649 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(II)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray16.length || arg1 < 0 || arg1 > this.anIntArrayArray16[arg0].length || this.anIntArrayArray16[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class20 local27 = this.aClass20_1;
		synchronized (this.aClass20_1) {
			@Pc(34) Class1_Sub1_Sub3 local34;
			for (local34 = (Class1_Sub1_Sub3) this.aClass20_1.method247(); local34 != null; local34 = (Class1_Sub1_Sub3) this.aClass20_1.method248()) {
				if (local34.anInt332 == arg0 && local34.anInt333 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub3();
			local34.anInt332 = arg0;
			local34.anInt333 = arg1;
			local34.aBoolean69 = true;
			@Pc(71) Class16 local71 = this.aClass16_5;
			synchronized (this.aClass16_5) {
				this.aClass16_5.method182(local34);
			}
			this.aClass20_1.method245(local34);
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(BII)V")
	public void method470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient4.aClass34Array1[0] != null && (this.anIntArrayArray16[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt688 != 0))) {
				@Pc(30) Class1_Sub1_Sub3 local30 = new Class1_Sub1_Sub3();
				local30.anInt332 = arg1;
				local30.anInt333 = arg0;
				local30.aBoolean69 = false;
				@Pc(42) Class16 local42 = this.aClass16_9;
				synchronized (this.aClass16_9) {
					this.aClass16_9.method182(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("90786, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(Z)V")
	public void method471() {
		try {
			@Pc(2) Class16 local2 = this.aClass16_9;
			synchronized (this.aClass16_9) {
				this.aClass16_9.method189();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("29306, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
