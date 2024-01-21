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

@OriginalClass("client!vb")
public final class Class42_Sub1 extends Class42 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(309);

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31(-740);

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31(-740);

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31(-740);

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31(-740);

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31(-740);

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Ljava/lang/String;")
	public String aString29 = "";

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method615(@OriginalArg(0) Class45 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method639(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(699, local31);
			this.anIntArrayArray23[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray23[local22][local56] = local42.method469();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method639(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(699, local104);
			this.anIntArrayArray24[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray24[local36][local123] = local115.method472();
			}
		}
		local104 = arg0.method639("model_index", null);
		local56 = this.anIntArrayArray23[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method639("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(699, local104);
		local56 = local104.length / 6;
		this.anIntArray246 = new int[local56];
		this.anIntArray247 = new int[local56];
		this.anIntArray248 = new int[local56];
		for (@Pc(212) int local212 = 0; local212 < local56; local212++) {
			this.anIntArray246[local212] = local193.method469();
			this.anIntArray247[local212] = local193.method469();
			this.anIntArray248[local212] = local193.method469();
		}
		local104 = arg0.method639("anim_index", null);
		local193 = new Class1_Sub1_Sub3(699, local104);
		local56 = local104.length / 2;
		this.anIntArray249 = new int[local56];
		for (@Pc(258) int local258 = 0; local258 < local56; local258++) {
			this.anIntArray249[local258] = local193.method469();
		}
		this.aClient1 = arg1;
		this.aBoolean190 = true;
		this.aClient1.method90(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method616() {
		this.aBoolean190 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public int method617(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray23[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("65703, " + -504 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
	public int method618() {
		try {
			return this.anIntArray249.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("3427, " + 94 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray246.length; local7++) {
				if (this.anIntArray246[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray247[local7];
					}
					return this.anIntArray248[local7];
				}
			}
			return -1;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("48410, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)Z")
	public boolean method620(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray246.length; local12++) {
				if (this.anIntArray248[local12] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("79794, " + false + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I")
	public int method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("5209, " + arg0 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method614(@OriginalArg(0) int arg0) {
		this.method622(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
	public void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method542(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method543()) {
				if (local34.anInt804 == arg0 && local34.anInt805 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt804 = arg0;
			local34.anInt805 = arg1;
			local34.aBoolean165 = true;
			@Pc(71) Class31 local71 = this.aClass31_8;
			synchronized (this.aClass31_8) {
				this.aClass31_8.method494(local34);
			}
			this.aClass34_2.method540(local34);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	public int method623() {
		@Pc(2) Class34 local2 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			return this.aClass34_2.method544();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!nb;")
	public Class1_Sub1_Sub4 method624() {
		@Pc(4) Class31 local4 = this.aClass31_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass31_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass31_11.method496();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			local11.method487();
		}
		if (local11.aByteArray10 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray10));
			while (true) {
				if (local41 == this.aByteArray19.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray19, local41, this.aByteArray19.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray10 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray10[local93] = this.aByteArray19[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBBI)V")
	public void method625(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass43Array1[0] != null && this.anIntArrayArray23[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass43Array1[arg0 + 1].method631(arg2);
				if (this.aByte28 != 0) {
					this.anInt960 = 413;
				}
				if (!this.method628(local25, this.anIntArrayArray24[arg0][arg2], this.anIntArrayArray23[arg0][arg2])) {
					this.aByteArrayArray5[arg0][arg2] = arg1;
					if (arg1 > this.anInt961) {
						this.anInt961 = arg1;
					}
					this.anInt963++;
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("49070, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public void method626() {
		try {
			@Pc(2) Class31 local2 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method501();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("87680, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient1.aClass43Array1[0] != null && (this.anIntArrayArray23[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt961 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt804 = arg0;
				local30.anInt805 = arg1;
				local30.aBoolean165 = false;
				@Pc(42) Class31 local42 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method494(local30);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("28308, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean190) {
			this.anInt968++;
			try {
				Thread.sleep(20L);
			} catch (@Pc(13) Exception local13) {
			}
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < 100 && local15; local17++) {
				local15 = false;
				@Pc(26) Class31 local26 = this.aClass31_8;
				@Pc(33) Class1_Sub1_Sub4 local33;
				synchronized (this.aClass31_8) {
					local33 = (Class1_Sub1_Sub4) this.aClass31_8.method496();
				}
				while (local33 != null) {
					local15 = true;
					@Pc(43) byte[] local43 = null;
					if (this.aClient1.aClass43Array1[0] != null) {
						local43 = this.aClient1.aClass43Array1[local33.anInt804 + 1].method631(local33.anInt805);
					}
					if (!this.method628(local43, this.anIntArrayArray24[local33.anInt804][local33.anInt805], this.anIntArrayArray23[local33.anInt804][local33.anInt805])) {
						local43 = null;
					}
					@Pc(88) Class31 local88 = this.aClass31_8;
					synchronized (this.aClass31_8) {
						if (local43 == null) {
							this.aClass31_9.method494(local33);
						} else {
							local33.aByteArray10 = local43;
							@Pc(104) Class31 local104 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method494(local33);
							}
						}
						local33 = (Class1_Sub1_Sub4) this.aClass31_8.method496();
					}
				}
				@Pc(131) int local131 = 0;
				@Pc(133) int local133 = 0;
				for (local33 = (Class1_Sub1_Sub4) this.aClass31_10.method497(); local33 != null; local33 = (Class1_Sub1_Sub4) this.aClass31_10.method499()) {
					if (local33.aBoolean165) {
						local131++;
					} else {
						local133++;
					}
				}
				while (local131 < 10) {
					local33 = (Class1_Sub1_Sub4) this.aClass31_9.method496();
					if (local33 == null) {
						break;
					}
					if (this.aByteArrayArray5[local33.anInt804][local33.anInt805] != 0) {
						this.anInt962++;
					}
					this.aByteArrayArray5[local33.anInt804][local33.anInt805] = 0;
					this.aClass31_10.method494(local33);
					local131++;
					this.method629(local33);
					local15 = true;
				}
				if (local131 == 0 && local17 >= 5) {
					break;
				}
				@Pc(315) byte[] local315;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(308) int local308;
				label344: while (local131 == 0 && local133 < 10 && this.anInt961 != 0) {
					@Pc(214) Class31 local214 = this.aClass31_12;
					synchronized (this.aClass31_12) {
						local33 = (Class1_Sub1_Sub4) this.aClass31_12.method496();
					}
					while (local33 != null) {
						if (this.aByteArrayArray5[local33.anInt804][local33.anInt805] != 0) {
							this.aByteArrayArray5[local33.anInt804][local33.anInt805] = 0;
							this.aClass31_10.method494(local33);
							this.method629(local33);
							local15 = true;
							if (this.anInt962 < this.anInt963) {
								this.anInt962++;
							}
							this.aString29 = "Loading extra files - " + this.anInt962 * 100 / this.anInt963 + "%";
							local133++;
							if (local133 == 10) {
								break label344;
							}
						}
						local214 = this.aClass31_12;
						synchronized (this.aClass31_12) {
							local33 = (Class1_Sub1_Sub4) this.aClass31_12.method496();
						}
					}
					for (local308 = 0; local308 < 4; local308++) {
						local315 = this.aByteArrayArray5[local308];
						local318 = local315.length;
						for (local320 = 0; local320 < local318; local320++) {
							if (local315[local320] == this.anInt961) {
								local315[local320] = 0;
								local33 = new Class1_Sub1_Sub4();
								local33.anInt804 = local308;
								local33.anInt805 = local320;
								local33.aBoolean165 = false;
								this.aClass31_10.method494(local33);
								this.method629(local33);
								local15 = true;
								if (this.anInt962 < this.anInt963) {
									this.anInt962++;
								}
								this.aString29 = "Loading extra files - " + this.anInt962 * 100 / this.anInt963 + "%";
								if (local33.anInt804 >= 2) {
									this.aString29 = ".";
								}
								local133++;
								if (local133 == 10) {
									break label344;
								}
							}
						}
					}
					this.anInt961--;
				}
				if (this.anInputStream2 != null) {
					try {
						local308 = this.anInputStream2.available();
						if (this.anInt965 == 0 && local308 >= 6) {
							local15 = true;
							for (@Pc(431) int local431 = 0; local431 < 6; local431 += this.anInputStream2.read(this.aByteArray18, local431, 6 - local431)) {
							}
							local318 = this.aByteArray18[0] & 0xFF;
							local320 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
							@Pc(487) int local487 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
							@Pc(494) int local494 = this.aByteArray18[5] & 0xFF;
							this.aClass1_Sub1_Sub4_1 = null;
							for (@Pc(502) Class1_Sub1_Sub4 local502 = (Class1_Sub1_Sub4) this.aClass31_10.method497(); local502 != null; local502 = (Class1_Sub1_Sub4) this.aClass31_10.method499()) {
								if (local502.anInt804 == local318 && local502.anInt805 == local320) {
									this.aClass1_Sub1_Sub4_1 = local502;
								}
								if (this.aClass1_Sub1_Sub4_1 != null) {
									local502.anInt806 = 0;
								}
							}
							if (this.aClass1_Sub1_Sub4_1 != null) {
								this.anInt966 = 0;
								if (local487 == 0) {
									signlink.reporterror("Rej: " + local318 + "," + local320);
									this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
									if (this.aClass1_Sub1_Sub4_1.aBoolean165) {
										@Pc(560) Class31 local560 = this.aClass31_11;
										synchronized (this.aClass31_11) {
											this.aClass31_11.method494(this.aClass1_Sub1_Sub4_1);
										}
									} else {
										this.aClass1_Sub1_Sub4_1.method630();
									}
									this.aClass1_Sub1_Sub4_1 = null;
								} else {
									if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local494 == 0) {
										this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local487];
									}
									if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local494 != 0) {
										throw new IOException("missing start of file");
									}
								}
							}
							this.anInt964 = local494 * 500;
							this.anInt965 = 500;
							if (this.anInt965 > local487 - local494 * 500) {
								this.anInt965 = local487 - local494 * 500;
							}
						}
						if (this.anInt965 > 0 && local308 >= this.anInt965) {
							local15 = true;
							local315 = this.aByteArray18;
							local318 = 0;
							if (this.aClass1_Sub1_Sub4_1 != null) {
								local315 = this.aClass1_Sub1_Sub4_1.aByteArray10;
								local318 = this.anInt964;
							}
							for (local320 = 0; local320 < this.anInt965; local320 += this.anInputStream2.read(local315, local320 + local318, this.anInt965 - local320)) {
							}
							if (this.anInt965 + this.anInt964 >= local315.length && this.aClass1_Sub1_Sub4_1 != null) {
								if (this.aClient1.aClass43Array1[0] != null) {
									this.aClient1.aClass43Array1[this.aClass1_Sub1_Sub4_1.anInt804 + 1].method632(local315.length, local315, this.aClass1_Sub1_Sub4_1.anInt805);
								}
								if (!this.aClass1_Sub1_Sub4_1.aBoolean165 && this.aClass1_Sub1_Sub4_1.anInt804 == 3) {
									this.aClass1_Sub1_Sub4_1.aBoolean165 = true;
									this.aClass1_Sub1_Sub4_1.anInt804 = 93;
								}
								if (this.aClass1_Sub1_Sub4_1.aBoolean165) {
									@Pc(731) Class31 local731 = this.aClass31_11;
									synchronized (this.aClass31_11) {
										this.aClass31_11.method494(this.aClass1_Sub1_Sub4_1);
									}
								} else {
									this.aClass1_Sub1_Sub4_1.method630();
								}
							}
							this.anInt965 = 0;
						}
					} catch (@Pc(752) IOException local752) {
						try {
							this.aSocket2.close();
						} catch (@Pc(757) Exception local757) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt965 = 0;
					}
				}
			}
			@Pc(776) boolean local776 = false;
			@Pc(781) Class1_Sub1_Sub4 local781;
			for (local781 = (Class1_Sub1_Sub4) this.aClass31_10.method497(); local781 != null; local781 = (Class1_Sub1_Sub4) this.aClass31_10.method499()) {
				if (local781.aBoolean165) {
					local776 = true;
					local781.anInt806++;
					if (local781.anInt806 > 50) {
						local781.anInt806 = 0;
						this.method629(local781);
					}
				}
			}
			if (!local776) {
				for (local781 = (Class1_Sub1_Sub4) this.aClass31_10.method497(); local781 != null; local781 = (Class1_Sub1_Sub4) this.aClass31_10.method499()) {
					local776 = true;
					local781.anInt806++;
					if (local781.anInt806 > 50) {
						local781.anInt806 = 0;
						this.method629(local781);
					}
				}
			}
			if (local776) {
				this.anInt966++;
				if (this.anInt966 > 750) {
					try {
						this.aSocket2.close();
					} catch (@Pc(866) Exception local866) {
					}
					this.aSocket2 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt965 = 0;
				}
			} else {
				this.anInt966 = 0;
				this.aString29 = "";
			}
			if (this.aClient1.aBoolean60 && this.aSocket2 != null && this.anOutputStream2 != null && this.anInt961 > 0) {
				this.anInt967++;
				if (this.anInt967 > 500) {
					this.anInt967 = 0;
					this.aByteArray18[0] = 0;
					this.aByteArray18[1] = 0;
					this.aByteArray18[2] = 0;
					this.aByteArray18[3] = 10;
					try {
						this.anOutputStream2.write(this.aByteArray18, 0, 4);
					} catch (@Pc(941) IOException local941) {
						this.anInt966 = 5000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIIB)Z")
	private boolean method628(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg0, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_2.getValue();
			if (local28 == arg2) {
				return local52 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("84135, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -50 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nb;Z)V")
	private void method629(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong28 < 5000L) {
						return;
					}
					this.aLong28 = local9;
					this.aSocket2 = this.aClient1.method114(client.anInt251 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt966 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt804;
				this.aByteArray18[1] = (byte) (arg0.anInt805 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt805;
				if (arg0.aBoolean165) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient1.aBoolean60 || arg0.anInt804 > 1) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt967 = 0;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket2.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt965 = 0;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("23272, " + arg0 + ", " + false + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
