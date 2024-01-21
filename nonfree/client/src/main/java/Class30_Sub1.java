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

@OriginalClass("client!QUPTMIEH")
public final class Class30_Sub1 extends Class30 implements Runnable {

	@OriginalMember(owner = "client!QUPTMIEH", name = "e", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!QUPTMIEH", name = "f", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!QUPTMIEH", name = "g", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!QUPTMIEH", name = "j", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!QUPTMIEH", name = "k", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!QUPTMIEH", name = "m", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!QUPTMIEH", name = "n", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!QUPTMIEH", name = "o", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!QUPTMIEH", name = "r", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!QUPTMIEH", name = "s", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!QUPTMIEH", name = "t", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!QUPTMIEH", name = "y", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!QUPTMIEH", name = "z", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!QUPTMIEH", name = "C", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!QUPTMIEH", name = "D", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!QUPTMIEH", name = "E", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!QUPTMIEH", name = "F", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!QUPTMIEH", name = "G", descriptor = "Lclient!CPQQDQVK;")
	private Class6_Sub1_Sub1 aClass6_Sub1_Sub1_1;

	@OriginalMember(owner = "client!QUPTMIEH", name = "K", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!QUPTMIEH", name = "M", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!QUPTMIEH", name = "N", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!QUPTMIEH", name = "O", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!QUPTMIEH", name = "P", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!QUPTMIEH", name = "Q", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!QUPTMIEH", name = "S", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray18 = new int[4][];

	@OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_4 = new Class40(826);

	@OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "Ljava/lang/String;")
	public String aString11 = "";

	@OriginalMember(owner = "client!QUPTMIEH", name = "d", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_5 = new Class40(826);

	@OriginalMember(owner = "client!QUPTMIEH", name = "h", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!QUPTMIEH", name = "i", descriptor = "I")
	private int anInt398 = 6;

	@OriginalMember(owner = "client!QUPTMIEH", name = "l", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_6 = new Class40(826);

	@OriginalMember(owner = "client!QUPTMIEH", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray19 = new int[4][];

	@OriginalMember(owner = "client!QUPTMIEH", name = "q", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_7 = new Class40(826);

	@OriginalMember(owner = "client!QUPTMIEH", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!QUPTMIEH", name = "v", descriptor = "[B")
	private byte[] aByteArray13 = new byte[65000];

	@OriginalMember(owner = "client!QUPTMIEH", name = "w", descriptor = "I")
	private int anInt404 = -253;

	@OriginalMember(owner = "client!QUPTMIEH", name = "x", descriptor = "I")
	private int anInt405 = -10782;

	@OriginalMember(owner = "client!QUPTMIEH", name = "A", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!QUPTMIEH", name = "B", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!QUPTMIEH", name = "H", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!QUPTMIEH", name = "I", descriptor = "Lclient!TSCGUBKV;")
	private Class36 aClass36_1 = new Class36(-433);

	@OriginalMember(owner = "client!QUPTMIEH", name = "J", descriptor = "[B")
	private byte[] aByteArray15 = new byte[500];

	@OriginalMember(owner = "client!QUPTMIEH", name = "L", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!QUPTMIEH", name = "R", descriptor = "Lclient!VGFLNLXH;")
	private Class40 aClass40_8 = new Class40(826);

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(Lclient!XOJZVVDK;Lclient!client;)V")
	public void method278(@OriginalArg(0) Class43 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method518(local20[local22], (byte[]) null);
			local36 = local31.length / 2;
			@Pc(42) Class6_Sub1_Sub4 local42 = new Class6_Sub1_Sub4(888, local31);
			this.anIntArrayArray19[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray19[local22][local56] = local42.method241();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method518(local93[local36], (byte[]) null);
			local56 = local104.length / 4;
			@Pc(115) Class6_Sub1_Sub4 local115 = new Class6_Sub1_Sub4(888, local104);
			this.anIntArrayArray18[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray18[local36][local123] = local115.method244();
			}
		}
		local104 = arg0.method518("model_index", (byte[]) null);
		local56 = this.anIntArrayArray19[0].length;
		this.aByteArray14 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray14[local158] = local104[local158];
			} else {
				this.aByteArray14[local158] = 0;
			}
		}
		local104 = arg0.method518("map_index", (byte[]) null);
		@Pc(193) Class6_Sub1_Sub4 local193 = new Class6_Sub1_Sub4(888, local104);
		local56 = local104.length / 7;
		this.anIntArray134 = new int[local56];
		this.anIntArray132 = new int[local56];
		this.anIntArray137 = new int[local56];
		this.anIntArray133 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray134[local216] = local193.method241();
			this.anIntArray132[local216] = local193.method241();
			this.anIntArray137[local216] = local193.method241();
			this.anIntArray133[local216] = local193.method239();
		}
		local104 = arg0.method518("anim_index", (byte[]) null);
		local193 = new Class6_Sub1_Sub4(888, local104);
		local56 = local104.length / 2;
		this.anIntArray135 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray135[local268] = local193.method241();
		}
		local104 = arg0.method518("midi_index", (byte[]) null);
		local193 = new Class6_Sub1_Sub4(888, local104);
		local56 = local104.length;
		this.anIntArray136 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray136[local300] = local193.method239();
		}
		this.aClient4 = arg1;
		this.aBoolean116 = true;
		this.aClient4.method585(this, 2);
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(II)I")
	public int method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 < 0 ? this.aByteArray14[arg1] & 0xFF : this.anInt403;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("39410, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "(I)V")
	private void method280() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream1.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt396 == 0 && local8 >= 6) {
					this.aBoolean117 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray15, local19, 6 - local19)) {
					}
					local43 = this.aByteArray15[0] & 0xFF;
					local59 = ((this.aByteArray15[1] & 0xFF) << 8) + (this.aByteArray15[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray15[3] & 0xFF) << 8) + (this.aByteArray15[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray15[5] & 0xFF;
					this.aClass6_Sub1_Sub1_1 = null;
					for (@Pc(90) Class6_Sub1_Sub1 local90 = (Class6_Sub1_Sub1) this.aClass40_5.method472(); local90 != null; local90 = (Class6_Sub1_Sub1) this.aClass40_5.method474()) {
						if (local90.anInt67 == local43 && local90.anInt68 == local59) {
							this.aClass6_Sub1_Sub1_1 = local90;
						}
						if (this.aClass6_Sub1_Sub1_1 != null) {
							local90.anInt66 = 0;
						}
					}
					if (this.aClass6_Sub1_Sub1_1 != null) {
						this.anInt397 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass6_Sub1_Sub1_1.aByteArray1 = null;
							if (this.aClass6_Sub1_Sub1_1.aBoolean21) {
								@Pc(148) Class40 local148 = this.aClass40_4;
								synchronized (this.aClass40_4) {
									this.aClass40_4.method469(this.aClass6_Sub1_Sub1_1);
								}
							} else {
								this.aClass6_Sub1_Sub1_1.method542();
							}
							this.aClass6_Sub1_Sub1_1 = null;
						} else {
							if (this.aClass6_Sub1_Sub1_1.aByteArray1 == null && local82 == 0) {
								this.aClass6_Sub1_Sub1_1.aByteArray1 = new byte[local75];
							}
							if (this.aClass6_Sub1_Sub1_1.aByteArray1 == null && local82 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt395 = local82 * 500;
					this.anInt396 = 500;
					if (this.anInt396 > local75 - local82 * 500) {
						this.anInt396 = local75 - local82 * 500;
					}
				}
				if (this.anInt396 > 0 && local8 >= this.anInt396) {
					this.aBoolean117 = true;
					@Pc(227) byte[] local227 = this.aByteArray15;
					local43 = 0;
					if (this.aClass6_Sub1_Sub1_1 != null) {
						local227 = this.aClass6_Sub1_Sub1_1.aByteArray1;
						local43 = this.anInt395;
					}
					for (local59 = 0; local59 < this.anInt396; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt396 - local59)) {
					}
					if (this.anInt396 + this.anInt395 >= local227.length && this.aClass6_Sub1_Sub1_1 != null) {
						if (this.aClient4.aClass45Array1[0] != null) {
							this.aClient4.aClass45Array1[this.aClass6_Sub1_Sub1_1.anInt67 + 1].method526(local227, local227.length, this.aClass6_Sub1_Sub1_1.anInt68);
						}
						if (!this.aClass6_Sub1_Sub1_1.aBoolean21 && this.aClass6_Sub1_Sub1_1.anInt67 == 3) {
							this.aClass6_Sub1_Sub1_1.aBoolean21 = true;
							this.aClass6_Sub1_Sub1_1.anInt67 = 93;
						}
						if (this.aClass6_Sub1_Sub1_1.aBoolean21) {
							@Pc(320) Class40 local320 = this.aClass40_4;
							synchronized (this.aClass40_4) {
								this.aClass40_4.method469(this.aClass6_Sub1_Sub1_1);
							}
						} else {
							this.aClass6_Sub1_Sub1_1.method542();
						}
					}
					this.anInt396 = 0;
				}
			} catch (@Pc(341) IOException local341) {
				try {
					this.aSocket1.close();
				} catch (@Pc(346) Exception local346) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt396 = 0;
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("67418, " + -925 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "(II)Z")
	public boolean method281(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray136[arg0] == 1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("53254, " + 0 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(I)V")
	@Override
	public void method277(@OriginalArg(0) int arg0) {
		this.method282(0, arg0);
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "(II)V")
	public void method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray19.length || arg1 < 0 || arg1 > this.anIntArrayArray19[arg0].length || this.anIntArrayArray19[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class36 local27 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			@Pc(34) Class6_Sub1_Sub1 local34;
			for (local34 = (Class6_Sub1_Sub1) this.aClass36_1.method387(); local34 != null; local34 = (Class6_Sub1_Sub1) this.aClass36_1.method388()) {
				if (local34.anInt67 == arg0 && local34.anInt68 == arg1) {
					return;
				}
			}
			local34 = new Class6_Sub1_Sub1();
			local34.anInt67 = arg0;
			local34.anInt68 = arg1;
			local34.aBoolean21 = true;
			@Pc(71) Class40 local71 = this.aClass40_6;
			synchronized (this.aClass40_6) {
				this.aClass40_6.method469(local34);
			}
			this.aClass36_1.method385(local34);
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(III)V")
	public void method283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient4.aClass45Array1[0] != null && (this.anIntArrayArray19[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt401 != 0))) {
				@Pc(30) Class6_Sub1_Sub1 local30 = new Class6_Sub1_Sub1();
				local30.anInt67 = arg1;
				local30.anInt68 = arg0;
				local30.aBoolean21 = false;
				@Pc(42) Class40 local42 = this.aClass40_7;
				synchronized (this.aClass40_7) {
					this.aClass40_7.method469(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("28538, " + arg0 + ", " + -534 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(IIIB)I")
	public int method284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = (arg1 << 8) + arg2;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray134.length; local19++) {
				if (this.anIntArray134[local19] == local17) {
					if (arg0 == 0) {
						return this.anIntArray132[local19];
					}
					return this.anIntArray137[local19];
				}
			}
			return -1;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("31862, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "()I")
	public int method285() {
		@Pc(2) Class36 local2 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			return this.aClass36_1.method389();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "(I)V")
	private void method286() {
		try {
			while (this.anInt399 == 0) {
				if (this.anInt400 >= 10 || this.anInt401 == 0) {
					return;
				}
				@Pc(14) Class40 local14 = this.aClass40_7;
				@Pc(21) Class6_Sub1_Sub1 local21;
				synchronized (this.aClass40_7) {
					local21 = (Class6_Sub1_Sub1) this.aClass40_7.method471();
				}
				while (local21 != null) {
					if (this.aByteArrayArray3[local21.anInt67][local21.anInt68] != 0) {
						this.aByteArrayArray3[local21.anInt67][local21.anInt68] = 0;
						this.aClass40_5.method469(local21);
						this.method297(local21);
						this.aBoolean117 = true;
						if (this.anInt402 < this.anInt408) {
							this.anInt402++;
						}
						this.aString11 = "Loading extra files - " + this.anInt402 * 100 / this.anInt408 + "%";
						this.anInt400++;
						if (this.anInt400 == 10) {
							return;
						}
					}
					local14 = this.aClass40_7;
					synchronized (this.aClass40_7) {
						local21 = (Class6_Sub1_Sub1) this.aClass40_7.method471();
					}
				}
				for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
					@Pc(122) byte[] local122 = this.aByteArrayArray3[local115];
					@Pc(125) int local125 = local122.length;
					for (@Pc(127) int local127 = 0; local127 < local125; local127++) {
						if (local122[local127] == this.anInt401) {
							local122[local127] = 0;
							local21 = new Class6_Sub1_Sub1();
							local21.anInt67 = local115;
							local21.anInt68 = local127;
							local21.aBoolean21 = false;
							this.aClass40_5.method469(local21);
							this.method297(local21);
							this.aBoolean117 = true;
							if (this.anInt402 < this.anInt408) {
								this.anInt402++;
							}
							this.aString11 = "Loading extra files - " + this.anInt402 * 100 / this.anInt408 + "%";
							this.anInt400++;
							if (this.anInt400 == 10) {
								return;
							}
						}
					}
				}
				this.anInt401--;
			}
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("82892, " + -253 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "d", descriptor = "(I)I")
	public int method287() {
		try {
			return this.anIntArray135.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("66285, " + -643 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "()Lclient!CPQQDQVK;")
	public Class6_Sub1_Sub1 method288() {
		@Pc(4) Class40 local4 = this.aClass40_4;
		@Pc(11) Class6_Sub1_Sub1 local11;
		synchronized (this.aClass40_4) {
			local11 = (Class6_Sub1_Sub1) this.aClass40_4.method471();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class36 local24 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			local11.method543();
		}
		if (local11.aByteArray1 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray1));
			while (true) {
				if (local41 == this.aByteArray13.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray13, local41, this.aByteArray13.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray1 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray1[local93] = this.aByteArray13[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(IIBI)V")
	public void method289(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient4.aClass45Array1[0] != null && this.anIntArrayArray19[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient4.aClass45Array1[arg0 + 1].method525(arg2);
				if (!this.method291(this.anIntArrayArray19[arg0][arg2], local25, this.anIntArrayArray18[arg0][arg2])) {
					this.aByteArrayArray3[arg0][arg2] = arg1;
					if (arg1 > this.anInt401) {
						this.anInt401 = arg1;
					}
					this.anInt408++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("92446, " + arg0 + ", " + 125 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "d", descriptor = "(II)Z")
	public boolean method290(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray134.length; local1++) {
				if (this.anIntArray137[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("10704, " + 646 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(I[BII)Z")
	private boolean method291(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			if (6 < this.anInt398 || 6 > this.anInt398) {
				this.anInt403 = -115;
			}
			if (local28 == arg0) {
				return local42 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("27263, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "e", descriptor = "(I)V")
	public void method292() {
		try {
			@Pc(2) Class40 local2 = this.aClass40_7;
			synchronized (this.aClass40_7) {
				this.aClass40_7.method476();
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("83301, " + -10941 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(IZ)V")
	public void method293(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray134.length;
			for (@Pc(12) int local12 = 0; local12 < local5; local12++) {
				if (arg0 || this.anIntArray133[local12] != 0) {
					this.method289(3, (byte) 2, this.anIntArray137[local12]);
					this.method289(3, (byte) 2, this.anIntArray132[local12]);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("70067, " + -924 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "()V")
	public void method294() {
		this.aBoolean116 = false;
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean116) {
				this.anInt406++;
				@Pc(11) byte local11 = 20;
				if (this.anInt401 == 0 && this.aClient4.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean117 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean117; local32++) {
					this.aBoolean117 = false;
					this.method298((byte) 1);
					this.method295();
					if (this.anInt399 == 0 && local32 >= 5) {
						break;
					}
					this.method286();
					if (this.anInputStream1 != null) {
						this.method280();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class6_Sub1_Sub1 local72;
				for (local72 = (Class6_Sub1_Sub1) this.aClass40_5.method472(); local72 != null; local72 = (Class6_Sub1_Sub1) this.aClass40_5.method474()) {
					if (local72.aBoolean21) {
						local67 = true;
						local72.anInt66++;
						if (local72.anInt66 > 50) {
							local72.anInt66 = 0;
							this.method297(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class6_Sub1_Sub1) this.aClass40_5.method472(); local72 != null; local72 = (Class6_Sub1_Sub1) this.aClass40_5.method474()) {
						local67 = true;
						local72.anInt66++;
						if (local72.anInt66 > 50) {
							local72.anInt66 = 0;
							this.method297(local72);
						}
					}
				}
				if (local67) {
					this.anInt397++;
					if (this.anInt397 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt396 = 0;
					}
				} else {
					this.anInt397 = 0;
					this.aString11 = "";
				}
				if (this.aClient4.aBoolean243 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt401 > 0 || this.aClient4.aClass45Array1[0] == null)) {
					this.anInt407++;
					if (this.anInt407 > 500) {
						this.anInt407 = 0;
						this.aByteArray15[0] = 0;
						this.aByteArray15[1] = 0;
						this.aByteArray15[2] = 0;
						this.aByteArray15[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray15, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt397 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(B)V")
	private void method295() {
		try {
			this.anInt399 = 0;
			this.anInt400 = 0;
			@Pc(12) Class6_Sub1_Sub1 local12;
			for (local12 = (Class6_Sub1_Sub1) this.aClass40_5.method472(); local12 != null; local12 = (Class6_Sub1_Sub1) this.aClass40_5.method474()) {
				if (local12.aBoolean21) {
					this.anInt399++;
				} else {
					this.anInt400++;
				}
			}
			while (this.anInt399 < 10) {
				local12 = (Class6_Sub1_Sub1) this.aClass40_8.method471();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray3[local12.anInt67][local12.anInt68] != 0) {
					this.anInt402++;
				}
				this.aByteArrayArray3[local12.anInt67][local12.anInt68] = 0;
				this.aClass40_5.method469(local12);
				this.anInt399++;
				this.method297(local12);
				this.aBoolean117 = true;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("4923, " + 0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "e", descriptor = "(II)I")
	public int method296(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray19[arg0].length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("56497, " + arg0 + ", " + -42623 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(Lclient!CPQQDQVK;Z)V")
	private void method297(@OriginalArg(0) Class6_Sub1_Sub1 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong16 < 4000L) {
						return;
					}
					this.aLong16 = local11;
					this.aSocket1 = this.aClient4.method654(43594 + client.anInt877);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream1.read();
					}
					this.anInt397 = 0;
				}
				this.aByteArray15[0] = (byte) arg0.anInt67;
				this.aByteArray15[1] = (byte) (arg0.anInt68 >> 8);
				this.aByteArray15[2] = (byte) arg0.anInt68;
				if (arg0.aBoolean21) {
					this.aByteArray15[3] = 2;
				} else if (this.aClient4.aBoolean243) {
					this.aByteArray15[3] = 0;
				} else {
					this.aByteArray15[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray15, 0, 4);
				this.anInt407 = 0;
				this.anInt409 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket1.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt396 = 0;
				this.anInt409++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("51846, " + arg0 + ", " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "(B)V")
	private void method298(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) Class40 local12 = this.aClass40_6;
			@Pc(19) Class6_Sub1_Sub1 local19;
			synchronized (this.aClass40_6) {
				local19 = (Class6_Sub1_Sub1) this.aClass40_6.method471();
			}
			while (local19 != null) {
				this.aBoolean117 = true;
				@Pc(30) byte[] local30 = null;
				if (this.aClient4.aClass45Array1[0] != null) {
					local30 = this.aClient4.aClass45Array1[local19.anInt67 + 1].method525(local19.anInt68);
				}
				if (!this.method291(this.anIntArrayArray19[local19.anInt67][local19.anInt68], local30, this.anIntArrayArray18[local19.anInt67][local19.anInt68])) {
					local30 = null;
				}
				@Pc(75) Class40 local75 = this.aClass40_6;
				synchronized (this.aClass40_6) {
					if (local30 == null) {
						this.aClass40_8.method469(local19);
					} else {
						local19.aByteArray1 = local30;
						@Pc(91) Class40 local91 = this.aClass40_4;
						synchronized (this.aClass40_4) {
							this.aClass40_4.method469(local19);
						}
					}
					local19 = (Class6_Sub1_Sub1) this.aClass40_6.method471();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("976, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
