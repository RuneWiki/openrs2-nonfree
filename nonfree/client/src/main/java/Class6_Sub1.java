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

@OriginalClass("client!XZFDFADG")
public final class Class6_Sub1 extends Class6 implements Runnable {

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!XZFDFADG", name = "c", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!XZFDFADG", name = "d", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!XZFDFADG", name = "e", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!XZFDFADG", name = "g", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!XZFDFADG", name = "j", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!XZFDFADG", name = "k", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!XZFDFADG", name = "l", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!XZFDFADG", name = "n", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!XZFDFADG", name = "o", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!XZFDFADG", name = "p", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!XZFDFADG", name = "t", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!XZFDFADG", name = "w", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!XZFDFADG", name = "y", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!XZFDFADG", name = "z", descriptor = "Lclient!RPOURQXY;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!XZFDFADG", name = "B", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!XZFDFADG", name = "E", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!XZFDFADG", name = "F", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!XZFDFADG", name = "H", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!XZFDFADG", name = "I", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!XZFDFADG", name = "J", descriptor = "I")
	private int anInt781;

	@OriginalMember(owner = "client!XZFDFADG", name = "L", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!XZFDFADG", name = "O", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!XZFDFADG", name = "P", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!XZFDFADG", name = "b", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_5 = new Class38((byte) 55);

	@OriginalMember(owner = "client!XZFDFADG", name = "f", descriptor = "[B")
	private byte[] aByteArray17 = new byte[65000];

	@OriginalMember(owner = "client!XZFDFADG", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray20 = new int[4][];

	@OriginalMember(owner = "client!XZFDFADG", name = "i", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_6 = new Class38((byte) 55);

	@OriginalMember(owner = "client!XZFDFADG", name = "m", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_7 = new Class38((byte) 55);

	@OriginalMember(owner = "client!XZFDFADG", name = "q", descriptor = "B")
	private byte aByte35 = 1;

	@OriginalMember(owner = "client!XZFDFADG", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!XZFDFADG", name = "s", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!XZFDFADG", name = "u", descriptor = "I")
	private int anInt775 = -459;

	@OriginalMember(owner = "client!XZFDFADG", name = "v", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!XZFDFADG", name = "x", descriptor = "Ljava/lang/String;")
	public String aString15 = "";

	@OriginalMember(owner = "client!XZFDFADG", name = "A", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_8 = new Class38((byte) 55);

	@OriginalMember(owner = "client!XZFDFADG", name = "C", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!XZFDFADG", name = "D", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!XZFDFADG", name = "G", descriptor = "I")
	private int anInt779 = 5;

	@OriginalMember(owner = "client!XZFDFADG", name = "K", descriptor = "Lclient!PNEYGONI;")
	private Class24 aClass24_2 = new Class24((byte) 33);

	@OriginalMember(owner = "client!XZFDFADG", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray21 = new int[4][];

	@OriginalMember(owner = "client!XZFDFADG", name = "N", descriptor = "Lclient!VYBZTNTY;")
	private Class38 aClass38_9 = new Class38((byte) 55);

	@OriginalMember(owner = "client!XZFDFADG", name = "Q", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "()Lclient!RPOURQXY;")
	public Class3_Sub1_Sub4 method529() {
		@Pc(4) Class38 local4 = this.aClass38_6;
		@Pc(11) Class3_Sub1_Sub4 local11;
		synchronized (this.aClass38_6) {
			local11 = (Class3_Sub1_Sub4) this.aClass38_6.method485();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class24 local24 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			local11.method504();
		}
		if (local11.aByteArray12 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray12));
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
		local11.aByteArray12 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray12[local93] = this.aByteArray17[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(II)Z")
	public boolean method530(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray198[arg0] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58739, " + arg0 + ", " + 878 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "b", descriptor = "(I)V")
	private void method531() {
		try {
			try {
				@Pc(15) int local15 = this.anInputStream1.available();
				@Pc(50) int local50;
				@Pc(66) int local66;
				if (this.anInt772 == 0 && local15 >= 6) {
					this.aBoolean182 = true;
					for (@Pc(26) int local26 = 0; local26 < 6; local26 += this.anInputStream1.read(this.aByteArray18, local26, 6 - local26)) {
					}
					local50 = this.aByteArray18[0] & 0xFF;
					local66 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(82) int local82 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(89) int local89 = this.aByteArray18[5] & 0xFF;
					this.aClass3_Sub1_Sub4_1 = null;
					for (@Pc(97) Class3_Sub1_Sub4 local97 = (Class3_Sub1_Sub4) this.aClass38_5.method486(); local97 != null; local97 = (Class3_Sub1_Sub4) this.aClass38_5.method488()) {
						if (local97.anInt639 == local50 && local97.anInt638 == local66) {
							this.aClass3_Sub1_Sub4_1 = local97;
						}
						if (this.aClass3_Sub1_Sub4_1 != null) {
							local97.anInt637 = 0;
						}
					}
					if (this.aClass3_Sub1_Sub4_1 != null) {
						this.anInt781 = 0;
						if (local82 == 0) {
							signlink.reporterror("Rej: " + local50 + "," + local66);
							this.aClass3_Sub1_Sub4_1.aByteArray12 = null;
							if (this.aClass3_Sub1_Sub4_1.aBoolean153) {
								@Pc(155) Class38 local155 = this.aClass38_6;
								synchronized (this.aClass38_6) {
									this.aClass38_6.method483(this.aClass3_Sub1_Sub4_1);
								}
							} else {
								this.aClass3_Sub1_Sub4_1.method503();
							}
							this.aClass3_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass3_Sub1_Sub4_1.aByteArray12 == null && local89 == 0) {
								this.aClass3_Sub1_Sub4_1.aByteArray12 = new byte[local82];
							}
							if (this.aClass3_Sub1_Sub4_1.aByteArray12 == null && local89 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt771 = local89 * 500;
					this.anInt772 = 500;
					if (this.anInt772 > local82 - local89 * 500) {
						this.anInt772 = local82 - local89 * 500;
					}
				}
				if (this.anInt772 > 0 && local15 >= this.anInt772) {
					this.aBoolean182 = true;
					@Pc(234) byte[] local234 = this.aByteArray18;
					local50 = 0;
					if (this.aClass3_Sub1_Sub4_1 != null) {
						local234 = this.aClass3_Sub1_Sub4_1.aByteArray12;
						local50 = this.anInt771;
					}
					for (local66 = 0; local66 < this.anInt772; local66 += this.anInputStream1.read(local234, local66 + local50, this.anInt772 - local66)) {
					}
					if (this.anInt772 + this.anInt771 >= local234.length && this.aClass3_Sub1_Sub4_1 != null) {
						if (this.aClient4.aClass44Array1[0] != null) {
							this.aClient4.aClass44Array1[this.aClass3_Sub1_Sub4_1.anInt639 + 1].method521(this.aClass3_Sub1_Sub4_1.anInt638, local234, (byte) 7, local234.length);
						}
						if (!this.aClass3_Sub1_Sub4_1.aBoolean153 && this.aClass3_Sub1_Sub4_1.anInt639 == 3) {
							this.aClass3_Sub1_Sub4_1.aBoolean153 = true;
							this.aClass3_Sub1_Sub4_1.anInt639 = 93;
						}
						if (this.aClass3_Sub1_Sub4_1.aBoolean153) {
							@Pc(327) Class38 local327 = this.aClass38_6;
							synchronized (this.aClass38_6) {
								this.aClass38_6.method483(this.aClass3_Sub1_Sub4_1);
							}
						} else {
							this.aClass3_Sub1_Sub4_1.method503();
						}
					}
					this.anInt772 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket1.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt772 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("52598, " + 7 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(ZZ)V")
	public void method532(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray195.length;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				if (arg0 || this.anIntArray197[local8] != 0) {
					this.method541(3, (byte) 2, this.anIntArray193[local8]);
					this.method541(3, (byte) 2, this.anIntArray194[local8]);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("81387, " + arg0 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(IIII)I")
	public int method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray195.length; local7++) {
				if (this.anIntArray195[local7] == local5) {
					if (arg3 == 0) {
						return this.anIntArray194[local7];
					}
					return this.anIntArray193[local7];
				}
			}
			return arg1 == 22558 ? -1 : this.anInt775;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("69283, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "b", descriptor = "(II)I")
	public int method534(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray16[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("64967, " + arg0 + ", " + 453 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "c", descriptor = "(II)I")
	public int method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArrayArray20[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("23159, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "c", descriptor = "(I)I")
	public int method536(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArray196.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("81086, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "([BIII)Z")
	private boolean method537(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(35) int local35 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(49) int local49 = (int) this.aCRC32_1.getValue();
			if (local35 == arg1) {
				return local49 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("47050, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(B)V")
	private void method538(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 1) {
				this.aBoolean181 = !this.aBoolean181;
			}
			while (this.anInt769 == 0) {
				if (this.anInt770 >= 10 || this.anInt774 == 0) {
					return;
				}
				@Pc(20) Class38 local20 = this.aClass38_9;
				@Pc(27) Class3_Sub1_Sub4 local27;
				synchronized (this.aClass38_9) {
					local27 = (Class3_Sub1_Sub4) this.aClass38_9.method485();
				}
				while (local27 != null) {
					if (this.aByteArrayArray4[local27.anInt639][local27.anInt638] != 0) {
						this.aByteArrayArray4[local27.anInt639][local27.anInt638] = 0;
						this.aClass38_5.method483(local27);
						this.method547((byte) 9, local27);
						this.aBoolean182 = true;
						if (this.anInt773 < this.anInt777) {
							this.anInt773++;
						}
						this.aString15 = "Loading extra files - " + this.anInt773 * 100 / this.anInt777 + "%";
						this.anInt770++;
						if (this.anInt770 == 10) {
							return;
						}
					}
					local20 = this.aClass38_9;
					synchronized (this.aClass38_9) {
						local27 = (Class3_Sub1_Sub4) this.aClass38_9.method485();
					}
				}
				for (@Pc(121) int local121 = 0; local121 < 4; local121++) {
					@Pc(128) byte[] local128 = this.aByteArrayArray4[local121];
					@Pc(131) int local131 = local128.length;
					for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
						if (local128[local133] == this.anInt774) {
							local128[local133] = 0;
							local27 = new Class3_Sub1_Sub4();
							local27.anInt639 = local121;
							local27.anInt638 = local133;
							local27.aBoolean153 = false;
							this.aClass38_5.method483(local27);
							this.method547((byte) 9, local27);
							this.aBoolean182 = true;
							if (this.anInt773 < this.anInt777) {
								this.anInt773++;
							}
							this.aString15 = "Loading extra files - " + this.anInt773 * 100 / this.anInt777 + "%";
							this.anInt770++;
							if (this.anInt770 == 10) {
								return;
							}
						}
					}
				}
				this.anInt774--;
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("92099, " + arg0 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "d", descriptor = "(II)Z")
	public boolean method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray195.length; local7++) {
				if (this.anIntArray193[local7] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("73692, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "b", descriptor = "()I")
	public int method540() {
		@Pc(2) Class24 local2 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			return this.aClass24_2.method371();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(IBII)V")
	public void method541(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient4.aClass44Array1[0] != null && this.anIntArrayArray20[arg0][arg2] != 0) {
				@Pc(28) byte[] local28 = this.aClient4.aClass44Array1[arg0 + 1].method520(arg2);
				if (!this.method537(local28, this.anIntArrayArray20[arg0][arg2], this.anIntArrayArray21[arg0][arg2])) {
					this.aByteArrayArray4[arg0][arg2] = arg1;
					if (arg1 > this.anInt774) {
						this.anInt774 = arg1;
					}
					this.anInt777++;
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("15184, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "d", descriptor = "(I)V")
	public void method542() {
		try {
			@Pc(7) Class38 local7 = this.aClass38_9;
			synchronized (this.aClass38_9) {
				this.aClass38_9.method490();
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53980, " + -984 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(Lclient!DTIATKJO;Lclient!client;)V")
	public void method543(@OriginalArg(0) Class7 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method30(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class3_Sub1_Sub2 local42 = new Class3_Sub1_Sub2(-527, local31);
			this.anIntArrayArray20[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray20[local22][local56] = local42.method91();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method30(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class3_Sub1_Sub2 local115 = new Class3_Sub1_Sub2(-527, local104);
			this.anIntArrayArray21[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray21[local36][local123] = local115.method94();
			}
		}
		local104 = arg0.method30("model_index", null);
		local56 = this.anIntArrayArray20[0].length;
		this.aByteArray16 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray16[local158] = local104[local158];
			} else {
				this.aByteArray16[local158] = 0;
			}
		}
		local104 = arg0.method30("map_index", null);
		@Pc(193) Class3_Sub1_Sub2 local193 = new Class3_Sub1_Sub2(-527, local104);
		local56 = local104.length / 7;
		this.anIntArray195 = new int[local56];
		this.anIntArray194 = new int[local56];
		this.anIntArray193 = new int[local56];
		this.anIntArray197 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray195[local216] = local193.method91();
			this.anIntArray194[local216] = local193.method91();
			this.anIntArray193[local216] = local193.method91();
			this.anIntArray197[local216] = local193.method89();
		}
		local104 = arg0.method30("anim_index", null);
		local193 = new Class3_Sub1_Sub2(-527, local104);
		local56 = local104.length / 2;
		this.anIntArray196 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray196[local268] = local193.method91();
		}
		local104 = arg0.method30("midi_index", null);
		local193 = new Class3_Sub1_Sub2(-527, local104);
		local56 = local104.length;
		this.anIntArray198 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray198[local300] = local193.method89();
		}
		this.aClient4 = arg1;
		this.aBoolean183 = true;
		this.aClient4.method585(this, 2);
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "c", descriptor = "()V")
	public void method544() {
		this.aBoolean183 = false;
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "e", descriptor = "(I)V")
	private void method545() {
		try {
			this.anInt769 = 0;
			this.anInt770 = 0;
			@Pc(22) Class3_Sub1_Sub4 local22;
			for (local22 = (Class3_Sub1_Sub4) this.aClass38_5.method486(); local22 != null; local22 = (Class3_Sub1_Sub4) this.aClass38_5.method488()) {
				if (local22.aBoolean153) {
					this.anInt769++;
				} else {
					this.anInt770++;
				}
			}
			while (this.anInt769 < 10) {
				local22 = (Class3_Sub1_Sub4) this.aClass38_8.method485();
				if (local22 == null) {
					break;
				}
				if (this.aByteArrayArray4[local22.anInt639][local22.anInt638] != 0) {
					this.anInt773++;
				}
				this.aByteArrayArray4[local22.anInt639][local22.anInt638] = 0;
				this.aClass38_5.method483(local22);
				this.anInt769++;
				this.method547((byte) 9, local22);
				this.aBoolean182 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("28094, " + 0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "f", descriptor = "(I)V")
	private void method546() {
		try {
			@Pc(9) Class38 local9 = this.aClass38_7;
			@Pc(16) Class3_Sub1_Sub4 local16;
			synchronized (this.aClass38_7) {
				local16 = (Class3_Sub1_Sub4) this.aClass38_7.method485();
			}
			while (local16 != null) {
				this.aBoolean182 = true;
				@Pc(27) byte[] local27 = null;
				if (this.aClient4.aClass44Array1[0] != null) {
					local27 = this.aClient4.aClass44Array1[local16.anInt639 + 1].method520(local16.anInt638);
				}
				if (!this.method537(local27, this.anIntArrayArray20[local16.anInt639][local16.anInt638], this.anIntArrayArray21[local16.anInt639][local16.anInt638])) {
					local27 = null;
				}
				@Pc(72) Class38 local72 = this.aClass38_7;
				synchronized (this.aClass38_7) {
					if (local27 == null) {
						this.aClass38_8.method483(local16);
					} else {
						local16.aByteArray12 = local27;
						@Pc(88) Class38 local88 = this.aClass38_6;
						synchronized (this.aClass38_6) {
							this.aClass38_6.method483(local16);
						}
					}
					local16 = (Class3_Sub1_Sub4) this.aClass38_7.method485();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("70179, " + 8 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(BLclient!RPOURQXY;)V")
	private void method547(@OriginalArg(0) byte arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				if (this.aSocket1 == null) {
					@Pc(20) long local20 = System.currentTimeMillis();
					if (local20 - this.aLong26 < 4000L) {
						return;
					}
					this.aLong26 = local20;
					this.aSocket1 = this.aClient4.method686(client.anInt941 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(55) int local55 = 0; local55 < 8; local55++) {
						this.anInputStream1.read();
					}
					this.anInt781 = 0;
				}
				this.aByteArray18[0] = (byte) arg1.anInt639;
				this.aByteArray18[1] = (byte) (arg1.anInt638 >> 8);
				this.aByteArray18[2] = (byte) arg1.anInt638;
				if (arg1.aBoolean153) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient4.aBoolean214) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray18, 0, 4);
				this.anInt778 = 0;
				this.anInt776 = -10000;
			} catch (@Pc(132) IOException local132) {
				try {
					this.aSocket1.close();
				} catch (@Pc(137) Exception local137) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt772 = 0;
				this.anInt776++;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("4361, " + arg0 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "e", descriptor = "(II)V")
	public void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray20.length || arg1 < 0 || arg1 > this.anIntArrayArray20[arg0].length || this.anIntArrayArray20[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class24 local27 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			@Pc(34) Class3_Sub1_Sub4 local34;
			for (local34 = (Class3_Sub1_Sub4) this.aClass24_2.method369(); local34 != null; local34 = (Class3_Sub1_Sub4) this.aClass24_2.method370()) {
				if (local34.anInt639 == arg0 && local34.anInt638 == arg1) {
					return;
				}
			}
			local34 = new Class3_Sub1_Sub4();
			local34.anInt639 = arg0;
			local34.anInt638 = arg1;
			local34.aBoolean153 = true;
			@Pc(71) Class38 local71 = this.aClass38_7;
			synchronized (this.aClass38_7) {
				this.aClass38_7.method483(local34);
			}
			this.aClass24_2.method367(local34);
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(III)V")
	public void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient4.aClass44Array1[0] != null && (this.anIntArrayArray20[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt774 != 0))) {
				@Pc(30) Class3_Sub1_Sub4 local30 = new Class3_Sub1_Sub4();
				local30.anInt639 = arg1;
				local30.anInt638 = arg0;
				local30.aBoolean153 = false;
				@Pc(42) Class38 local42 = this.aClass38_9;
				synchronized (this.aClass38_9) {
					this.aClass38_9.method483(local30);
				}
				if (arg2 < 1 || arg2 > 1) {
					this.anInt779 = 163;
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("99675, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean183) {
				this.anInt780++;
				@Pc(11) byte local11 = 20;
				if (this.anInt774 == 0 && this.aClient4.aClass44Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean182 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean182; local32++) {
					this.aBoolean182 = false;
					this.method546();
					this.method545();
					if (this.anInt769 == 0 && local32 >= 5) {
						break;
					}
					this.method538(this.aByte35);
					if (this.anInputStream1 != null) {
						this.method531();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class3_Sub1_Sub4 local73;
				for (local73 = (Class3_Sub1_Sub4) this.aClass38_5.method486(); local73 != null; local73 = (Class3_Sub1_Sub4) this.aClass38_5.method488()) {
					if (local73.aBoolean153) {
						local68 = true;
						local73.anInt637++;
						if (local73.anInt637 > 50) {
							local73.anInt637 = 0;
							this.method547((byte) 9, local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class3_Sub1_Sub4) this.aClass38_5.method486(); local73 != null; local73 = (Class3_Sub1_Sub4) this.aClass38_5.method488()) {
						local68 = true;
						local73.anInt637++;
						if (local73.anInt637 > 50) {
							local73.anInt637 = 0;
							this.method547((byte) 9, local73);
						}
					}
				}
				if (local68) {
					this.anInt781++;
					if (this.anInt781 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt772 = 0;
					}
				} else {
					this.anInt781 = 0;
					this.aString15 = "";
				}
				if (this.aClient4.aBoolean214 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt774 > 0 || this.aClient4.aClass44Array1[0] == null)) {
					this.anInt778++;
					if (this.anInt778 > 500) {
						this.anInt778 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt781 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!XZFDFADG", name = "a", descriptor = "(I)V")
	@Override
	public void method528(@OriginalArg(0) int arg0) {
		this.method548(0, arg0);
	}
}
