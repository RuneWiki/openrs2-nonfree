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

@OriginalClass("client!NJYVZTLI")
public final class Class25_Sub1 extends Class25 implements Runnable {

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!NJYVZTLI", name = "d", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!NJYVZTLI", name = "e", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!NJYVZTLI", name = "f", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!NJYVZTLI", name = "g", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!NJYVZTLI", name = "k", descriptor = "I")
	public int anInt381;

	@OriginalMember(owner = "client!NJYVZTLI", name = "l", descriptor = "Lclient!WIICVWRM;")
	private Class6_Sub2_Sub4 aClass6_Sub2_Sub4_1;

	@OriginalMember(owner = "client!NJYVZTLI", name = "m", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!NJYVZTLI", name = "q", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!NJYVZTLI", name = "t", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!NJYVZTLI", name = "u", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!NJYVZTLI", name = "y", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!NJYVZTLI", name = "z", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!NJYVZTLI", name = "C", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!NJYVZTLI", name = "E", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!NJYVZTLI", name = "F", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!NJYVZTLI", name = "G", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!NJYVZTLI", name = "H", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!NJYVZTLI", name = "L", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!NJYVZTLI", name = "N", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!NJYVZTLI", name = "P", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!NJYVZTLI", name = "Q", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!NJYVZTLI", name = "R", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!NJYVZTLI", name = "S", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!NJYVZTLI", name = "T", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!NJYVZTLI", name = "U", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_1 = new Class13(true);

	@OriginalMember(owner = "client!NJYVZTLI", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray8 = new int[4][];

	@OriginalMember(owner = "client!NJYVZTLI", name = "i", descriptor = "Ljava/lang/String;")
	public String aString7 = "";

	@OriginalMember(owner = "client!NJYVZTLI", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!NJYVZTLI", name = "n", descriptor = "[B")
	private byte[] aByteArray7 = new byte[500];

	@OriginalMember(owner = "client!NJYVZTLI", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!NJYVZTLI", name = "p", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!NJYVZTLI", name = "r", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!NJYVZTLI", name = "s", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_2 = new Class13(true);

	@OriginalMember(owner = "client!NJYVZTLI", name = "v", descriptor = "I")
	private int anInt383 = 57;

	@OriginalMember(owner = "client!NJYVZTLI", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray9 = new int[4][];

	@OriginalMember(owner = "client!NJYVZTLI", name = "x", descriptor = "B")
	private byte aByte11 = -32;

	@OriginalMember(owner = "client!NJYVZTLI", name = "A", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_3 = new Class13(true);

	@OriginalMember(owner = "client!NJYVZTLI", name = "B", descriptor = "B")
	private byte aByte12 = -32;

	@OriginalMember(owner = "client!NJYVZTLI", name = "D", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!NJYVZTLI", name = "I", descriptor = "[B")
	private byte[] aByteArray8 = new byte[65000];

	@OriginalMember(owner = "client!NJYVZTLI", name = "J", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_4 = new Class13(true);

	@OriginalMember(owner = "client!NJYVZTLI", name = "K", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!NJYVZTLI", name = "M", descriptor = "Lclient!BGTUCWCI;")
	private Class3 aClass3_1 = new Class3(41416);

	@OriginalMember(owner = "client!NJYVZTLI", name = "O", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_5 = new Class13(true);

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "()I")
	public int method227() {
		@Pc(2) Class3 local2 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			return this.aClass3_1.method17();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(II)V")
	public void method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray8.length || arg1 < 0 || arg1 > this.anIntArrayArray8[arg0].length || this.anIntArrayArray8[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class3 local27 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			@Pc(34) Class6_Sub2_Sub4 local34;
			for (local34 = (Class6_Sub2_Sub4) this.aClass3_1.method15(); local34 != null; local34 = (Class6_Sub2_Sub4) this.aClass3_1.method16()) {
				if (local34.anInt670 == arg0 && local34.anInt669 == arg1) {
					return;
				}
			}
			local34 = new Class6_Sub2_Sub4();
			local34.anInt670 = arg0;
			local34.anInt669 = arg1;
			local34.aBoolean199 = true;
			@Pc(71) Class13 local71 = this.aClass13_3;
			synchronized (this.aClass13_3) {
				this.aClass13_3.method110(local34);
			}
			this.aClass3_1.method13(local34);
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(II)I")
	public int method229(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray6[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("43572, " + 973 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(B)V")
	private void method230() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream1.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt389 == 0 && local9 >= 6) {
					this.aBoolean115 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream1.read(this.aByteArray7, local20, 6 - local20)) {
					}
					local44 = this.aByteArray7[0] & 0xFF;
					local60 = ((this.aByteArray7[1] & 0xFF) << 8) + (this.aByteArray7[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray7[3] & 0xFF) << 8) + (this.aByteArray7[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray7[5] & 0xFF;
					this.aClass6_Sub2_Sub4_1 = null;
					for (@Pc(91) Class6_Sub2_Sub4 local91 = (Class6_Sub2_Sub4) this.aClass13_1.method113(); local91 != null; local91 = (Class6_Sub2_Sub4) this.aClass13_1.method115()) {
						if (local91.anInt670 == local44 && local91.anInt669 == local60) {
							this.aClass6_Sub2_Sub4_1 = local91;
						}
						if (this.aClass6_Sub2_Sub4_1 != null) {
							local91.anInt671 = 0;
						}
					}
					if (this.aClass6_Sub2_Sub4_1 != null) {
						this.anInt379 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass6_Sub2_Sub4_1.aByteArray14 = null;
							if (this.aClass6_Sub2_Sub4_1.aBoolean199) {
								@Pc(149) Class13 local149 = this.aClass13_5;
								synchronized (this.aClass13_5) {
									this.aClass13_5.method110(this.aClass6_Sub2_Sub4_1);
								}
							} else {
								this.aClass6_Sub2_Sub4_1.method545();
							}
							this.aClass6_Sub2_Sub4_1 = null;
						} else {
							if (this.aClass6_Sub2_Sub4_1.aByteArray14 == null && local83 == 0) {
								this.aClass6_Sub2_Sub4_1.aByteArray14 = new byte[local76];
							}
							if (this.aClass6_Sub2_Sub4_1.aByteArray14 == null && local83 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt388 = local83 * 500;
					this.anInt389 = 500;
					if (this.anInt389 > local76 - local83 * 500) {
						this.anInt389 = local76 - local83 * 500;
					}
				}
				if (this.anInt389 > 0 && local9 >= this.anInt389) {
					this.aBoolean115 = true;
					@Pc(228) byte[] local228 = this.aByteArray7;
					local44 = 0;
					if (this.aClass6_Sub2_Sub4_1 != null) {
						local228 = this.aClass6_Sub2_Sub4_1.aByteArray14;
						local44 = this.anInt388;
					}
					for (local60 = 0; local60 < this.anInt389; local60 += this.anInputStream1.read(local228, local60 + local44, this.anInt389 - local60)) {
					}
					if (this.anInt389 + this.anInt388 >= local228.length && this.aClass6_Sub2_Sub4_1 != null) {
						if (this.aClient4.aClass1Array1[0] != null) {
							this.aClient4.aClass1Array1[this.aClass6_Sub2_Sub4_1.anInt670 + 1].method2(local228, this.aClass6_Sub2_Sub4_1.anInt669, local228.length);
						}
						if (!this.aClass6_Sub2_Sub4_1.aBoolean199 && this.aClass6_Sub2_Sub4_1.anInt670 == 3) {
							this.aClass6_Sub2_Sub4_1.aBoolean199 = true;
							this.aClass6_Sub2_Sub4_1.anInt670 = 93;
						}
						if (this.aClass6_Sub2_Sub4_1.aBoolean199) {
							@Pc(321) Class13 local321 = this.aClass13_5;
							synchronized (this.aClass13_5) {
								this.aClass13_5.method110(this.aClass6_Sub2_Sub4_1);
							}
						} else {
							this.aClass6_Sub2_Sub4_1.method545();
						}
					}
					this.anInt389 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket1.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt389 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("37570, " + 8 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(Lclient!WIICVWRM;B)V")
	private void method231(@OriginalArg(0) Class6_Sub2_Sub4 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == this.aByte12) {
				try {
					if (this.aSocket1 == null) {
						@Pc(11) long local11 = System.currentTimeMillis();
						if (local11 - this.aLong15 < 4000L) {
							return;
						}
						this.aLong15 = local11;
						this.aSocket1 = this.aClient4.method593(client.anInt893 + 43594);
						this.anInputStream1 = this.aSocket1.getInputStream();
						this.anOutputStream1 = this.aSocket1.getOutputStream();
						this.anOutputStream1.write(15);
						for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
							this.anInputStream1.read();
						}
						this.anInt379 = 0;
					}
					this.aByteArray7[0] = (byte) arg0.anInt670;
					this.aByteArray7[1] = (byte) (arg0.anInt669 >> 8);
					this.aByteArray7[2] = (byte) arg0.anInt669;
					if (arg0.aBoolean199) {
						this.aByteArray7[3] = 2;
					} else if (this.aClient4.aBoolean266) {
						this.aByteArray7[3] = 0;
					} else {
						this.aByteArray7[3] = 1;
					}
					this.anOutputStream1.write(this.aByteArray7, 0, 4);
					this.anInt384 = 0;
					this.anInt381 = -10000;
				} catch (@Pc(123) IOException local123) {
					try {
						this.aSocket1.close();
					} catch (@Pc(128) Exception local128) {
					}
					this.aSocket1 = null;
					this.anInputStream1 = null;
					this.anOutputStream1 = null;
					this.anInt389 = 0;
					this.anInt381++;
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("92550, " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(IIII)I")
	public int method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(19) int local19 = (arg2 << 8) + arg1;
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray119.length; local21++) {
				if (this.anIntArray119[local21] == local19) {
					if (arg0 == 0) {
						return this.anIntArray117[local21];
					}
					return this.anIntArray116[local21];
				}
			}
			return -1;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("16352, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "(II)Z")
	public boolean method233(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray120[arg0] == 1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("11778, " + arg0 + ", " + 19296 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "d", descriptor = "(II)Z")
	public boolean method234(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray119.length; local1++) {
				if (this.anIntArray116[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("84832, " + arg0 + ", " + -526 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(B)V")
	private void method235() {
		try {
			while (this.anInt390 == 0) {
				if (this.anInt391 >= 10 || this.anInt386 == 0) {
					return;
				}
				@Pc(20) Class13 local20 = this.aClass13_4;
				@Pc(27) Class6_Sub2_Sub4 local27;
				synchronized (this.aClass13_4) {
					local27 = (Class6_Sub2_Sub4) this.aClass13_4.method112();
				}
				while (local27 != null) {
					if (this.aByteArrayArray1[local27.anInt670][local27.anInt669] != 0) {
						this.aByteArrayArray1[local27.anInt670][local27.anInt669] = 0;
						this.aClass13_1.method110(local27);
						this.method231(local27, this.aByte11);
						this.aBoolean115 = true;
						if (this.anInt387 < this.anInt382) {
							this.anInt387++;
						}
						this.aString7 = "Loading extra files - " + this.anInt387 * 100 / this.anInt382 + "%";
						this.anInt391++;
						if (this.anInt391 == 10) {
							return;
						}
					}
					local20 = this.aClass13_4;
					synchronized (this.aClass13_4) {
						local27 = (Class6_Sub2_Sub4) this.aClass13_4.method112();
					}
				}
				for (@Pc(122) int local122 = 0; local122 < 4; local122++) {
					@Pc(129) byte[] local129 = this.aByteArrayArray1[local122];
					@Pc(132) int local132 = local129.length;
					for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
						if (local129[local134] == this.anInt386) {
							local129[local134] = 0;
							local27 = new Class6_Sub2_Sub4();
							local27.anInt670 = local122;
							local27.anInt669 = local134;
							local27.aBoolean199 = false;
							this.aClass13_1.method110(local27);
							this.method231(local27, this.aByte11);
							this.aBoolean115 = true;
							if (this.anInt387 < this.anInt382) {
								this.anInt387++;
							}
							this.aString7 = "Loading extra files - " + this.anInt387 * 100 / this.anInt382 + "%";
							this.anInt391++;
							if (this.anInt391 == 10) {
								return;
							}
						}
					}
				}
				this.anInt386--;
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("7491, " + 67 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "()V")
	public void method236() {
		this.aBoolean117 = false;
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "(B)I")
	public int method237() {
		try {
			return this.anIntArray118.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("3612, " + 113 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(Lclient!RSPRYUFS;Lclient!client;)V")
	public void method238(@OriginalArg(0) Class37 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method358(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class6_Sub2_Sub3 local42 = new Class6_Sub2_Sub3(-587, local31);
			this.anIntArrayArray8[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray8[local22][local56] = local42.method264();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method358(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class6_Sub2_Sub3 local115 = new Class6_Sub2_Sub3(-587, local104);
			this.anIntArrayArray9[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray9[local36][local123] = local115.method267();
			}
		}
		local104 = arg0.method358("model_index", null);
		local56 = this.anIntArrayArray8[0].length;
		this.aByteArray6 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray6[local158] = local104[local158];
			} else {
				this.aByteArray6[local158] = 0;
			}
		}
		local104 = arg0.method358("map_index", null);
		@Pc(193) Class6_Sub2_Sub3 local193 = new Class6_Sub2_Sub3(-587, local104);
		local56 = local104.length / 7;
		this.anIntArray119 = new int[local56];
		this.anIntArray117 = new int[local56];
		this.anIntArray116 = new int[local56];
		this.anIntArray121 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray119[local216] = local193.method264();
			this.anIntArray117[local216] = local193.method264();
			this.anIntArray116[local216] = local193.method264();
			this.anIntArray121[local216] = local193.method262();
		}
		local104 = arg0.method358("anim_index", null);
		local193 = new Class6_Sub2_Sub3(-587, local104);
		local56 = local104.length / 2;
		this.anIntArray118 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray118[local268] = local193.method264();
		}
		local104 = arg0.method358("midi_index", null);
		local193 = new Class6_Sub2_Sub3(-587, local104);
		local56 = local104.length;
		this.anIntArray120 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray120[local300] = local193.method262();
		}
		this.aClient4 = arg1;
		this.aBoolean117 = true;
		this.aClient4.method587(this, 2);
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(I[BIB)Z")
	private boolean method239(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(34) int local34 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_1.getValue();
			if (local34 == arg2) {
				return local48 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("74822, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -27 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(Z)V")
	private void method240() {
		try {
			this.anInt390 = 0;
			this.anInt391 = 0;
			@Pc(22) Class6_Sub2_Sub4 local22;
			for (local22 = (Class6_Sub2_Sub4) this.aClass13_1.method113(); local22 != null; local22 = (Class6_Sub2_Sub4) this.aClass13_1.method115()) {
				if (local22.aBoolean199) {
					this.anInt390++;
				} else {
					this.anInt391++;
				}
			}
			while (this.anInt390 < 10) {
				local22 = (Class6_Sub2_Sub4) this.aClass13_2.method112();
				if (local22 == null) {
					break;
				}
				if (this.aByteArrayArray1[local22.anInt670][local22.anInt669] != 0) {
					this.anInt387++;
				}
				this.aByteArrayArray1[local22.anInt670][local22.anInt669] = 0;
				this.aClass13_1.method110(local22);
				this.anInt390++;
				this.method231(local22, this.aByte11);
				this.aBoolean115 = true;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("69160, " + true + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(I)V")
	public void method241() {
		try {
			@Pc(2) Class13 local2 = this.aClass13_4;
			synchronized (this.aClass13_4) {
				this.aClass13_4.method117();
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("43486, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(ZZ)V")
	public void method242(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray119.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray121[local5] != 0) {
					this.method244(3, (byte) 2, this.anIntArray116[local5]);
					this.method244(3, (byte) 2, this.anIntArray117[local5]);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("67328, " + arg0 + ", " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "()Lclient!WIICVWRM;")
	public Class6_Sub2_Sub4 method243() {
		@Pc(4) Class13 local4 = this.aClass13_5;
		@Pc(11) Class6_Sub2_Sub4 local11;
		synchronized (this.aClass13_5) {
			local11 = (Class6_Sub2_Sub4) this.aClass13_5.method112();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class3 local24 = this.aClass3_1;
		synchronized (this.aClass3_1) {
			local11.method546();
		}
		if (local11.aByteArray14 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray14));
			while (true) {
				if (local41 == this.aByteArray8.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray8, local41, this.aByteArray8.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray14 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray14[local93] = this.aByteArray8[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(I)V")
	@Override
	public void method226(@OriginalArg(0) int arg0) {
		this.method228(0, arg0);
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(IBBI)V")
	public void method244(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient4.aClass1Array1[0] != null && this.anIntArrayArray8[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient4.aClass1Array1[arg0 + 1].method1(arg2);
				if (!this.method239(this.anIntArrayArray9[arg0][arg2], local25, this.anIntArrayArray8[arg0][arg2])) {
					this.aByteArrayArray1[arg0][arg2] = arg1;
					if (arg1 > this.anInt386) {
						this.anInt386 = arg1;
					}
					this.anInt382++;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("20246, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(Z)V")
	private void method245() {
		try {
			@Pc(5) Class13 local5 = this.aClass13_3;
			@Pc(12) Class6_Sub2_Sub4 local12;
			synchronized (this.aClass13_3) {
				local12 = (Class6_Sub2_Sub4) this.aClass13_3.method112();
			}
			while (local12 != null) {
				this.aBoolean115 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient4.aClass1Array1[0] != null) {
					local23 = this.aClient4.aClass1Array1[local12.anInt670 + 1].method1(local12.anInt669);
				}
				if (!this.method239(this.anIntArrayArray9[local12.anInt670][local12.anInt669], local23, this.anIntArrayArray8[local12.anInt670][local12.anInt669])) {
					local23 = null;
				}
				@Pc(68) Class13 local68 = this.aClass13_3;
				synchronized (this.aClass13_3) {
					if (local23 == null) {
						this.aClass13_2.method110(local12);
					} else {
						local12.aByteArray14 = local23;
						@Pc(84) Class13 local84 = this.aClass13_5;
						synchronized (this.aClass13_5) {
							this.aClass13_5.method110(local12);
						}
					}
					local12 = (Class6_Sub2_Sub4) this.aClass13_3.method112();
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("60611, " + true + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(III)V")
	public void method246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient4.aClass1Array1[0] != null && (this.anIntArrayArray8[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt386 != 0))) {
				@Pc(30) Class6_Sub2_Sub4 local30 = new Class6_Sub2_Sub4();
				local30.anInt670 = arg1;
				local30.anInt669 = arg0;
				local30.aBoolean199 = false;
				@Pc(45) Class13 local45 = this.aClass13_4;
				synchronized (this.aClass13_4) {
					this.aClass13_4.method110(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("58715, " + arg0 + ", " + 691 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "e", descriptor = "(II)I")
	public int method247(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray8[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("92762, " + 0 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NJYVZTLI", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean117) {
				this.anInt385++;
				@Pc(11) byte local11 = 20;
				if (this.anInt386 == 0 && this.aClient4.aClass1Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean115 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean115; local32++) {
					this.aBoolean115 = false;
					this.method245();
					this.method240();
					if (this.anInt390 == 0 && local32 >= 5) {
						break;
					}
					this.method235();
					if (this.anInputStream1 != null) {
						this.method230();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class6_Sub2_Sub4 local72;
				for (local72 = (Class6_Sub2_Sub4) this.aClass13_1.method113(); local72 != null; local72 = (Class6_Sub2_Sub4) this.aClass13_1.method115()) {
					if (local72.aBoolean199) {
						local67 = true;
						local72.anInt671++;
						if (local72.anInt671 > 50) {
							local72.anInt671 = 0;
							this.method231(local72, this.aByte11);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class6_Sub2_Sub4) this.aClass13_1.method113(); local72 != null; local72 = (Class6_Sub2_Sub4) this.aClass13_1.method115()) {
						local67 = true;
						local72.anInt671++;
						if (local72.anInt671 > 50) {
							local72.anInt671 = 0;
							this.method231(local72, this.aByte11);
						}
					}
				}
				if (local67) {
					this.anInt379++;
					if (this.anInt379 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt389 = 0;
					}
				} else {
					this.anInt379 = 0;
					this.aString7 = "";
				}
				if (this.aClient4.aBoolean266 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt386 > 0 || this.aClient4.aClass1Array1[0] == null)) {
					this.anInt384++;
					if (this.anInt384 > 500) {
						this.anInt384 = 0;
						this.aByteArray7[0] = 0;
						this.aByteArray7[1] = 0;
						this.aByteArray7[2] = 0;
						this.aByteArray7[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray7, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt379 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}
}
