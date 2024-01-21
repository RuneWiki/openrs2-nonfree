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

@OriginalClass("client!BISZONYZ")
public final class Class4_Sub1 extends Class4 implements Runnable {

	@OriginalMember(owner = "client!BISZONYZ", name = "d", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!BISZONYZ", name = "e", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!BISZONYZ", name = "f", descriptor = "I")
	private int anInt13;

	@OriginalMember(owner = "client!BISZONYZ", name = "g", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!BISZONYZ", name = "h", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!BISZONYZ", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!BISZONYZ", name = "l", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!BISZONYZ", name = "q", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!BISZONYZ", name = "r", descriptor = "I")
	public int anInt15;

	@OriginalMember(owner = "client!BISZONYZ", name = "s", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!BISZONYZ", name = "v", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!BISZONYZ", name = "x", descriptor = "I")
	private int anInt16;

	@OriginalMember(owner = "client!BISZONYZ", name = "y", descriptor = "I")
	private int anInt17;

	@OriginalMember(owner = "client!BISZONYZ", name = "z", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!BISZONYZ", name = "C", descriptor = "I")
	private int anInt18;

	@OriginalMember(owner = "client!BISZONYZ", name = "D", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!BISZONYZ", name = "E", descriptor = "Lclient!OVHZHUGL;")
	private Class8_Sub1_Sub4 aClass8_Sub1_Sub4_1;

	@OriginalMember(owner = "client!BISZONYZ", name = "F", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!BISZONYZ", name = "G", descriptor = "I")
	public int anInt19;

	@OriginalMember(owner = "client!BISZONYZ", name = "H", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!BISZONYZ", name = "J", descriptor = "I")
	public int anInt20;

	@OriginalMember(owner = "client!BISZONYZ", name = "N", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!BISZONYZ", name = "O", descriptor = "I")
	private int anInt21;

	@OriginalMember(owner = "client!BISZONYZ", name = "Q", descriptor = "I")
	private int anInt22;

	@OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "[B")
	private byte[] aByteArray3 = new byte[500];

	@OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "Z")
	private boolean aBoolean8 = true;

	@OriginalMember(owner = "client!BISZONYZ", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!BISZONYZ", name = "j", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_1 = new Class49(223);

	@OriginalMember(owner = "client!BISZONYZ", name = "m", descriptor = "Z")
	private boolean aBoolean9 = true;

	@OriginalMember(owner = "client!BISZONYZ", name = "n", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_2 = new Class49(223);

	@OriginalMember(owner = "client!BISZONYZ", name = "o", descriptor = "Lclient!QHOLWOGP;")
	private Class34 aClass34_1 = new Class34((byte) -67);

	@OriginalMember(owner = "client!BISZONYZ", name = "p", descriptor = "I")
	private int anInt14 = -81;

	@OriginalMember(owner = "client!BISZONYZ", name = "t", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!BISZONYZ", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!BISZONYZ", name = "w", descriptor = "Ljava/lang/String;")
	public String aString1 = "";

	@OriginalMember(owner = "client!BISZONYZ", name = "A", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_3 = new Class49(223);

	@OriginalMember(owner = "client!BISZONYZ", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[4][];

	@OriginalMember(owner = "client!BISZONYZ", name = "I", descriptor = "B")
	private byte aByte1 = 60;

	@OriginalMember(owner = "client!BISZONYZ", name = "K", descriptor = "[B")
	private byte[] aByteArray5 = new byte[65000];

	@OriginalMember(owner = "client!BISZONYZ", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[4][];

	@OriginalMember(owner = "client!BISZONYZ", name = "M", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_4 = new Class49(223);

	@OriginalMember(owner = "client!BISZONYZ", name = "P", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_5 = new Class49(223);

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(I)V")
	@Override
	public void method20(@OriginalArg(0) int arg0) {
		this.method41(0, arg0);
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(II)Z")
	public boolean method21(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray6[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("29778, " + arg0 + ", " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(Z)V")
	private void method22() {
		try {
			while (this.anInt12 == 0) {
				if (this.anInt13 >= 10 || this.anInt18 == 0) {
					return;
				}
				@Pc(10) Class49 local10 = this.aClass49_4;
				@Pc(17) Class8_Sub1_Sub4 local17;
				synchronized (this.aClass49_4) {
					local17 = (Class8_Sub1_Sub4) this.aClass49_4.method537();
				}
				while (local17 != null) {
					if (this.aByteArrayArray1[local17.anInt518][local17.anInt520] != 0) {
						this.aByteArrayArray1[local17.anInt518][local17.anInt520] = 0;
						this.aClass49_5.method535(local17);
						this.method34(local17);
						this.aBoolean10 = true;
						if (this.anInt22 < this.anInt20) {
							this.anInt22++;
						}
						this.aString1 = "Loading extra files - " + this.anInt22 * 100 / this.anInt20 + "%";
						this.anInt13++;
						if (this.anInt13 == 10) {
							return;
						}
					}
					local10 = this.aClass49_4;
					synchronized (this.aClass49_4) {
						local17 = (Class8_Sub1_Sub4) this.aClass49_4.method537();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray1[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt18) {
							local118[local123] = 0;
							local17 = new Class8_Sub1_Sub4();
							local17.anInt518 = local111;
							local17.anInt520 = local123;
							local17.aBoolean117 = false;
							this.aClass49_5.method535(local17);
							this.method34(local17);
							this.aBoolean10 = true;
							if (this.anInt22 < this.anInt20) {
								this.anInt22++;
							}
							this.aString1 = "Loading extra files - " + this.anInt22 * 100 / this.anInt20 + "%";
							this.anInt13++;
							if (this.anInt13 == 10) {
								return;
							}
						}
					}
				}
				this.anInt18--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("42550, " + true + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "()Lclient!OVHZHUGL;")
	public Class8_Sub1_Sub4 method23() {
		@Pc(4) Class49 local4 = this.aClass49_2;
		@Pc(11) Class8_Sub1_Sub4 local11;
		synchronized (this.aClass49_2) {
			local11 = (Class8_Sub1_Sub4) this.aClass49_2.method537();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = this.aClass34_1;
		synchronized (this.aClass34_1) {
			local11.method544();
		}
		if (local11.aByteArray17 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray17));
			while (true) {
				if (local41 == this.aByteArray5.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray5, local41, this.aByteArray5.length - local41);
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
			local11.aByteArray17[local93] = this.aByteArray5[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IBII)V")
	public void method24(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass3Array1[0] != null && this.anIntArrayArray3[arg2][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass3Array1[arg2 + 1].method15(arg0, (byte) 1);
				if (!this.method33(this.anIntArrayArray3[arg2][arg0], this.anIntArrayArray2[arg2][arg0], local25)) {
					this.aByteArrayArray1[arg2][arg0] = arg1;
					if (arg1 > this.anInt18) {
						this.anInt18 = arg1;
					}
					this.anInt20++;
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("71819, " + arg0 + ", " + arg1 + ", " + 46267 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "(Z)V")
	private void method25() {
		try {
			@Pc(2) Class49 local2 = this.aClass49_1;
			@Pc(9) Class8_Sub1_Sub4 local9;
			synchronized (this.aClass49_1) {
				local9 = (Class8_Sub1_Sub4) this.aClass49_1.method537();
			}
			while (local9 != null) {
				this.aBoolean10 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient1.aClass3Array1[0] != null) {
					local23 = this.aClient1.aClass3Array1[local9.anInt518 + 1].method15(local9.anInt520, (byte) 1);
				}
				if (!this.method33(this.anIntArrayArray3[local9.anInt518][local9.anInt520], this.anIntArrayArray2[local9.anInt518][local9.anInt520], local23)) {
					local23 = null;
				}
				@Pc(68) Class49 local68 = this.aClass49_1;
				synchronized (this.aClass49_1) {
					if (local23 == null) {
						this.aClass49_3.method535(local9);
					} else {
						local9.aByteArray17 = local23;
						@Pc(84) Class49 local84 = this.aClass49_2;
						synchronized (this.aClass49_2) {
							this.aClass49_2.method535(local9);
						}
					}
					local9 = (Class8_Sub1_Sub4) this.aClass49_1.method537();
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("75361, " + true + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "()V")
	public void method26() {
		this.aBoolean9 = false;
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IBI)V")
	public void method27(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient1.aClass3Array1[0] != null && (this.anIntArrayArray3[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt18 != 0))) {
				@Pc(30) Class8_Sub1_Sub4 local30 = new Class8_Sub1_Sub4();
				if (this.aByte1 != 60) {
					this.aBoolean8 = !this.aBoolean8;
				}
				local30.anInt518 = arg1;
				local30.anInt520 = arg0;
				local30.aBoolean117 = false;
				@Pc(54) Class49 local54 = this.aClass49_4;
				synchronized (this.aClass49_4) {
					this.aClass49_4.method535(local30);
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("75792, " + arg0 + ", " + 60 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "(II)I")
	public int method28(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray3[arg0].length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("82930, " + -792 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IIII)I")
	public int method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(13) int local13 = (arg1 << 8) + arg2;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray5.length; local15++) {
				if (this.anIntArray5[local15] == local13) {
					if (arg0 == 0) {
						return this.anIntArray7[local15];
					}
					return this.anIntArray10[local15];
				}
			}
			return -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("89661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "()I")
	public int method30() {
		@Pc(2) Class34 local2 = this.aClass34_1;
		synchronized (this.aClass34_1) {
			return this.aClass34_1.method374();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "(I)V")
	private void method31() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream1.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt17 == 0 && local9 >= 6) {
					this.aBoolean10 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream1.read(this.aByteArray3, local20, 6 - local20)) {
					}
					local44 = this.aByteArray3[0] & 0xFF;
					local60 = ((this.aByteArray3[1] & 0xFF) << 8) + (this.aByteArray3[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray3[3] & 0xFF) << 8) + (this.aByteArray3[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray3[5] & 0xFF;
					this.aClass8_Sub1_Sub4_1 = null;
					for (@Pc(91) Class8_Sub1_Sub4 local91 = (Class8_Sub1_Sub4) this.aClass49_5.method538(); local91 != null; local91 = (Class8_Sub1_Sub4) this.aClass49_5.method540((byte) 6)) {
						if (local91.anInt518 == local44 && local91.anInt520 == local60) {
							this.aClass8_Sub1_Sub4_1 = local91;
						}
						if (this.aClass8_Sub1_Sub4_1 != null) {
							local91.anInt519 = 0;
						}
					}
					if (this.aClass8_Sub1_Sub4_1 != null) {
						this.anInt11 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass8_Sub1_Sub4_1.aByteArray17 = null;
							if (this.aClass8_Sub1_Sub4_1.aBoolean117) {
								@Pc(149) Class49 local149 = this.aClass49_2;
								synchronized (this.aClass49_2) {
									this.aClass49_2.method535(this.aClass8_Sub1_Sub4_1);
								}
							} else {
								this.aClass8_Sub1_Sub4_1.method543();
							}
							this.aClass8_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass8_Sub1_Sub4_1.aByteArray17 == null && local83 == 0) {
								this.aClass8_Sub1_Sub4_1.aByteArray17 = new byte[local76];
							}
							if (this.aClass8_Sub1_Sub4_1.aByteArray17 == null && local83 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt16 = local83 * 500;
					this.anInt17 = 500;
					if (this.anInt17 > local76 - local83 * 500) {
						this.anInt17 = local76 - local83 * 500;
					}
				}
				if (this.anInt17 > 0 && local9 >= this.anInt17) {
					this.aBoolean10 = true;
					@Pc(228) byte[] local228 = this.aByteArray3;
					local44 = 0;
					if (this.aClass8_Sub1_Sub4_1 != null) {
						local228 = this.aClass8_Sub1_Sub4_1.aByteArray17;
						local44 = this.anInt16;
					}
					for (local60 = 0; local60 < this.anInt17; local60 += this.anInputStream1.read(local228, local60 + local44, this.anInt17 - local60)) {
					}
					if (this.anInt17 + this.anInt16 >= local228.length && this.aClass8_Sub1_Sub4_1 != null) {
						if (this.aClient1.aClass3Array1[0] != null) {
							this.aClient1.aClass3Array1[this.aClass8_Sub1_Sub4_1.anInt518 + 1].method16(local228, this.aClass8_Sub1_Sub4_1.anInt520, local228.length);
						}
						if (!this.aClass8_Sub1_Sub4_1.aBoolean117 && this.aClass8_Sub1_Sub4_1.anInt518 == 3) {
							this.aClass8_Sub1_Sub4_1.aBoolean117 = true;
							this.aClass8_Sub1_Sub4_1.anInt518 = 93;
						}
						if (this.aClass8_Sub1_Sub4_1.aBoolean117) {
							@Pc(321) Class49 local321 = this.aClass49_2;
							synchronized (this.aClass49_2) {
								this.aClass49_2.method535(this.aClass8_Sub1_Sub4_1);
							}
						} else {
							this.aClass8_Sub1_Sub4_1.method543();
						}
					}
					this.anInt17 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket1.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt17 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("15112, " + 4 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "(Z)I")
	public int method32() {
		try {
			return this.anIntArray9.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("40570, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(III[B)Z")
	private boolean method33(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(49) int local49 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local49 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("90978, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(ILclient!OVHZHUGL;)V")
	private void method34(@OriginalArg(1) Class8_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong1 < 4000L) {
						return;
					}
					this.aLong1 = local10;
					this.aSocket1 = this.aClient1.method692(client.anInt1075 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream1.read();
					}
					this.anInt11 = 0;
				}
				this.aByteArray3[0] = (byte) arg0.anInt518;
				this.aByteArray3[1] = (byte) (arg0.anInt520 >> 8);
				this.aByteArray3[2] = (byte) arg0.anInt520;
				if (arg0.aBoolean117) {
					this.aByteArray3[3] = 2;
				} else if (this.aClient1.aBoolean214) {
					this.aByteArray3[3] = 0;
				} else {
					this.aByteArray3[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray3, 0, 4);
				this.anInt21 = 0;
				this.anInt19 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket1.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt17 = 0;
				this.anInt19++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("37135, " + -44712 + ", " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(ZZ)V")
	public void method35(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anIntArray5.length;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				if (arg0 || this.anIntArray8[local8] != 0) {
					this.method24(this.anIntArray10[local8], (byte) 2, 3);
					this.method24(this.anIntArray7[local8], (byte) 2, 3);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37262, " + false + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean9) {
				this.anInt15++;
				@Pc(11) byte local11 = 20;
				if (this.anInt18 == 0 && this.aClient1.aClass3Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean10 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean10; local32++) {
					this.aBoolean10 = false;
					this.method25();
					this.method39();
					if (this.anInt12 == 0 && local32 >= 5) {
						break;
					}
					this.method22();
					if (this.anInputStream1 != null) {
						this.method31();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class8_Sub1_Sub4 local72;
				for (local72 = (Class8_Sub1_Sub4) this.aClass49_5.method538(); local72 != null; local72 = (Class8_Sub1_Sub4) this.aClass49_5.method540((byte) 6)) {
					if (local72.aBoolean117) {
						local67 = true;
						local72.anInt519++;
						if (local72.anInt519 > 50) {
							local72.anInt519 = 0;
							this.method34(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class8_Sub1_Sub4) this.aClass49_5.method538(); local72 != null; local72 = (Class8_Sub1_Sub4) this.aClass49_5.method540((byte) 6)) {
						local67 = true;
						local72.anInt519++;
						if (local72.anInt519 > 50) {
							local72.anInt519 = 0;
							this.method34(local72);
						}
					}
				}
				if (local67) {
					this.anInt11++;
					if (this.anInt11 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt17 = 0;
					}
				} else {
					this.anInt11 = 0;
					this.aString1 = "";
				}
				if (this.aClient1.aBoolean214 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt18 > 0 || this.aClient1.aClass3Array1[0] == null)) {
					this.anInt21++;
					if (this.anInt21 > 500) {
						this.anInt21 = 0;
						this.aByteArray3[0] = 0;
						this.aByteArray3[1] = 0;
						this.aByteArray3[2] = 0;
						this.aByteArray3[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray3, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt11 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IB)I")
	public int method36(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray4[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("26163, " + arg0 + ", " + -6 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(Lclient!AWEEREDT;Lclient!client;)V")
	public void method37(@OriginalArg(0) Class2 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method14(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class8_Sub1_Sub3 local42 = new Class8_Sub1_Sub3(local31, 713);
			this.anIntArrayArray3[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray3[local22][local56] = local42.method154();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method14(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class8_Sub1_Sub3 local115 = new Class8_Sub1_Sub3(local104, 713);
			this.anIntArrayArray2[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray2[local36][local123] = local115.method157();
			}
		}
		local104 = arg0.method14("model_index", null);
		local56 = this.anIntArrayArray3[0].length;
		this.aByteArray4 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray4[local158] = local104[local158];
			} else {
				this.aByteArray4[local158] = 0;
			}
		}
		local104 = arg0.method14("map_index", null);
		@Pc(193) Class8_Sub1_Sub3 local193 = new Class8_Sub1_Sub3(local104, 713);
		local56 = local104.length / 7;
		this.anIntArray5 = new int[local56];
		this.anIntArray7 = new int[local56];
		this.anIntArray10 = new int[local56];
		this.anIntArray8 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray5[local216] = local193.method154();
			this.anIntArray7[local216] = local193.method154();
			this.anIntArray10[local216] = local193.method154();
			this.anIntArray8[local216] = local193.method152();
		}
		local104 = arg0.method14("anim_index", null);
		local193 = new Class8_Sub1_Sub3(local104, 713);
		local56 = local104.length / 2;
		this.anIntArray9 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray9[local268] = local193.method154();
		}
		local104 = arg0.method14("midi_index", null);
		local193 = new Class8_Sub1_Sub3(local104, 713);
		local56 = local104.length;
		this.anIntArray6 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray6[local300] = local193.method152();
		}
		this.aClient1 = arg1;
		this.aBoolean9 = true;
		this.aClient1.method585(this, 2);
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "(II)Z")
	public boolean method38(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray5.length; local1++) {
				if (this.anIntArray10[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("16833, " + arg0 + ", " + -981 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "(I)V")
	private void method39() {
		try {
			this.anInt12 = 0;
			this.anInt13 = 0;
			@Pc(18) Class8_Sub1_Sub4 local18;
			for (local18 = (Class8_Sub1_Sub4) this.aClass49_5.method538(); local18 != null; local18 = (Class8_Sub1_Sub4) this.aClass49_5.method540((byte) 6)) {
				if (local18.aBoolean117) {
					this.anInt12++;
				} else {
					this.anInt13++;
				}
			}
			while (this.anInt12 < 10) {
				local18 = (Class8_Sub1_Sub4) this.aClass49_3.method537();
				if (local18 == null) {
					break;
				}
				if (this.aByteArrayArray1[local18.anInt518][local18.anInt520] != 0) {
					this.anInt22++;
				}
				this.aByteArrayArray1[local18.anInt518][local18.anInt520] = 0;
				this.aClass49_5.method535(local18);
				this.anInt12++;
				this.method34(local18);
				this.aBoolean10 = true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("87074, " + 34189 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "d", descriptor = "(I)V")
	public void method40() {
		try {
			@Pc(2) Class49 local2 = this.aClass49_4;
			synchronized (this.aClass49_4) {
				this.aClass49_4.method542();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("62060, " + 3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISZONYZ", name = "d", descriptor = "(II)V")
	public void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray3.length || arg1 < 0 || arg1 > this.anIntArrayArray3[arg0].length || this.anIntArrayArray3[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_1;
		synchronized (this.aClass34_1) {
			@Pc(34) Class8_Sub1_Sub4 local34;
			for (local34 = (Class8_Sub1_Sub4) this.aClass34_1.method372(); local34 != null; local34 = (Class8_Sub1_Sub4) this.aClass34_1.method373()) {
				if (local34.anInt518 == arg0 && local34.anInt520 == arg1) {
					return;
				}
			}
			local34 = new Class8_Sub1_Sub4();
			local34.anInt518 = arg0;
			local34.anInt520 = arg1;
			local34.aBoolean117 = true;
			@Pc(71) Class49 local71 = this.aClass49_1;
			synchronized (this.aClass49_1) {
				this.aClass49_1.method535(local34);
			}
			this.aClass34_1.method370(local34);
		}
	}
}
