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

@OriginalClass("client!TDBJVJCU")
public final class Class19_Sub1 extends Class19 implements Runnable {

	@OriginalMember(owner = "client!TDBJVJCU", name = "b", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!TDBJVJCU", name = "c", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!TDBJVJCU", name = "e", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!TDBJVJCU", name = "g", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!TDBJVJCU", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!TDBJVJCU", name = "i", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!TDBJVJCU", name = "j", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!TDBJVJCU", name = "o", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!TDBJVJCU", name = "p", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!TDBJVJCU", name = "q", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!TDBJVJCU", name = "r", descriptor = "Lclient!KRPFBUJX;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!TDBJVJCU", name = "v", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!TDBJVJCU", name = "w", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!TDBJVJCU", name = "x", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!TDBJVJCU", name = "y", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!TDBJVJCU", name = "z", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!TDBJVJCU", name = "A", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!TDBJVJCU", name = "D", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!TDBJVJCU", name = "E", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!TDBJVJCU", name = "G", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!TDBJVJCU", name = "H", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!TDBJVJCU", name = "N", descriptor = "I")
	private int anInt620;

	@OriginalMember(owner = "client!TDBJVJCU", name = "P", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!TDBJVJCU", name = "R", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!TDBJVJCU", name = "S", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!TDBJVJCU", name = "T", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_5 = new Class27(false);

	@OriginalMember(owner = "client!TDBJVJCU", name = "d", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_6 = new Class27(false);

	@OriginalMember(owner = "client!TDBJVJCU", name = "f", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_7 = new Class27(false);

	@OriginalMember(owner = "client!TDBJVJCU", name = "k", descriptor = "Lclient!VHKTMNAT;")
	private Class41 aClass41_1 = new Class41(true);

	@OriginalMember(owner = "client!TDBJVJCU", name = "l", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!TDBJVJCU", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray11 = new int[4][];

	@OriginalMember(owner = "client!TDBJVJCU", name = "n", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!TDBJVJCU", name = "s", descriptor = "[B")
	private byte[] aByteArray16 = new byte[500];

	@OriginalMember(owner = "client!TDBJVJCU", name = "t", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!TDBJVJCU", name = "u", descriptor = "I")
	private int anInt613 = 8;

	@OriginalMember(owner = "client!TDBJVJCU", name = "B", descriptor = "[B")
	private byte[] aByteArray17 = new byte[65000];

	@OriginalMember(owner = "client!TDBJVJCU", name = "C", descriptor = "I")
	private int anInt617 = 693;

	@OriginalMember(owner = "client!TDBJVJCU", name = "F", descriptor = "Ljava/lang/String;")
	public String aString15 = "";

	@OriginalMember(owner = "client!TDBJVJCU", name = "I", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_8 = new Class27(false);

	@OriginalMember(owner = "client!TDBJVJCU", name = "J", descriptor = "I")
	private int anInt619 = 586;

	@OriginalMember(owner = "client!TDBJVJCU", name = "K", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!TDBJVJCU", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray12 = new int[4][];

	@OriginalMember(owner = "client!TDBJVJCU", name = "M", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!TDBJVJCU", name = "O", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!TDBJVJCU", name = "Q", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!TDBJVJCU", name = "U", descriptor = "Lclient!PILILDKN;")
	private Class27 aClass27_9 = new Class27(false);

	@OriginalMember(owner = "client!TDBJVJCU", name = "V", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(Lclient!BYZSQZUF;Lclient!client;)V")
	public void method401(@OriginalArg(0) Class5 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method66(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class3_Sub1_Sub3 local42 = new Class3_Sub1_Sub3(0, local31);
			this.anIntArrayArray11[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray11[local22][local56] = local42.method148();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method66(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class3_Sub1_Sub3 local115 = new Class3_Sub1_Sub3(0, local104);
			this.anIntArrayArray12[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray12[local36][local123] = local115.method151();
			}
		}
		local104 = arg0.method66("model_index", null);
		local56 = this.anIntArrayArray11[0].length;
		this.aByteArray18 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray18[local158] = local104[local158];
			} else {
				this.aByteArray18[local158] = 0;
			}
		}
		local104 = arg0.method66("map_index", null);
		@Pc(193) Class3_Sub1_Sub3 local193 = new Class3_Sub1_Sub3(0, local104);
		local56 = local104.length / 7;
		this.anIntArray132 = new int[local56];
		this.anIntArray137 = new int[local56];
		this.anIntArray134 = new int[local56];
		this.anIntArray133 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray132[local216] = local193.method148();
			this.anIntArray137[local216] = local193.method148();
			this.anIntArray134[local216] = local193.method148();
			this.anIntArray133[local216] = local193.method146();
		}
		local104 = arg0.method66("anim_index", null);
		local193 = new Class3_Sub1_Sub3(0, local104);
		local56 = local104.length / 2;
		this.anIntArray135 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray135[local268] = local193.method148();
		}
		local104 = arg0.method66("midi_index", null);
		local193 = new Class3_Sub1_Sub3(0, local104);
		local56 = local104.length;
		this.anIntArray136 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray136[local300] = local193.method146();
		}
		this.aClient3 = arg1;
		this.aBoolean186 = true;
		this.aClient3.method580(this, 2);
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(IIII)I")
	public int method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray132.length; local7++) {
				if (this.anIntArray132[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray137[local7];
					}
					return this.anIntArray134[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("84146, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "([BZII)Z")
	private boolean method403(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(38) int local38 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_1.getValue();
			if (local38 == arg1) {
				return local52 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("9926, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(I)V")
	@Override
	public void method400(@OriginalArg(0) int arg0) {
		this.method406(0, arg0);
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "b", descriptor = "(I)I")
	public int method404() {
		try {
			return this.anIntArray135.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("76585, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(BIIB)V")
	public void method405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient3.aClass32Array1[0] != null && this.anIntArrayArray11[arg0][arg1] != 0) {
				@Pc(37) byte[] local37 = this.aClient3.aClass32Array1[arg0 + 1].method350(this.anInt613, arg1);
				if (!this.method403(local37, this.anIntArrayArray11[arg0][arg1], this.anIntArrayArray12[arg0][arg1])) {
					this.aByteArrayArray3[arg0][arg1] = arg2;
					if (arg2 > this.anInt623) {
						this.anInt623 = arg2;
					}
					this.anInt618++;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("62199, " + -65 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(II)V")
	public void method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray11.length || arg1 < 0 || arg1 > this.anIntArrayArray11[arg0].length || this.anIntArrayArray11[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class41 local27 = this.aClass41_1;
		synchronized (this.aClass41_1) {
			@Pc(34) Class3_Sub1_Sub4 local34;
			for (local34 = (Class3_Sub1_Sub4) this.aClass41_1.method429(); local34 != null; local34 = (Class3_Sub1_Sub4) this.aClass41_1.method430()) {
				if (local34.anInt294 == arg0 && local34.anInt295 == arg1) {
					return;
				}
			}
			local34 = new Class3_Sub1_Sub4();
			local34.anInt294 = arg0;
			local34.anInt295 = arg1;
			local34.aBoolean99 = true;
			@Pc(71) Class27 local71 = this.aClass27_6;
			synchronized (this.aClass27_6) {
				this.aClass27_6.method302(local34);
			}
			this.aClass41_1.method427(local34);
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "()V")
	public void method407() {
		this.aBoolean186 = false;
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "c", descriptor = "(I)V")
	private void method408() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt611 == 0 && local9 >= 6) {
					this.aBoolean184 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray16, local20, 6 - local20)) {
					}
					local44 = this.aByteArray16[0] & 0xFF;
					local60 = ((this.aByteArray16[1] & 0xFF) << 8) + (this.aByteArray16[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray16[3] & 0xFF) << 8) + (this.aByteArray16[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray16[5] & 0xFF;
					this.aClass3_Sub1_Sub4_1 = null;
					for (@Pc(91) Class3_Sub1_Sub4 local91 = (Class3_Sub1_Sub4) this.aClass27_8.method305(); local91 != null; local91 = (Class3_Sub1_Sub4) this.aClass27_8.method307()) {
						if (local91.anInt294 == local44 && local91.anInt295 == local60) {
							this.aClass3_Sub1_Sub4_1 = local91;
						}
						if (this.aClass3_Sub1_Sub4_1 != null) {
							local91.anInt296 = 0;
						}
					}
					if (this.aClass3_Sub1_Sub4_1 != null) {
						this.anInt621 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass3_Sub1_Sub4_1.aByteArray12 = null;
							if (this.aClass3_Sub1_Sub4_1.aBoolean99) {
								@Pc(149) Class27 local149 = this.aClass27_7;
								synchronized (this.aClass27_7) {
									this.aClass27_7.method302(this.aClass3_Sub1_Sub4_1);
								}
							} else {
								this.aClass3_Sub1_Sub4_1.method535();
							}
							this.aClass3_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass3_Sub1_Sub4_1.aByteArray12 == null && local83 == 0) {
								this.aClass3_Sub1_Sub4_1.aByteArray12 = new byte[local76];
							}
							if (this.aClass3_Sub1_Sub4_1.aByteArray12 == null && local83 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt610 = local83 * 500;
					this.anInt611 = 500;
					if (this.anInt611 > local76 - local83 * 500) {
						this.anInt611 = local76 - local83 * 500;
					}
				}
				if (this.anInt611 > 0 && local9 >= this.anInt611) {
					this.aBoolean184 = true;
					@Pc(228) byte[] local228 = this.aByteArray16;
					local44 = 0;
					if (this.aClass3_Sub1_Sub4_1 != null) {
						local228 = this.aClass3_Sub1_Sub4_1.aByteArray12;
						local44 = this.anInt610;
					}
					for (local60 = 0; local60 < this.anInt611; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt611 - local60)) {
					}
					if (this.anInt611 + this.anInt610 >= local228.length && this.aClass3_Sub1_Sub4_1 != null) {
						if (this.aClient3.aClass32Array1[0] != null) {
							this.aClient3.aClass32Array1[this.aClass3_Sub1_Sub4_1.anInt294 + 1].method351(this.aClass3_Sub1_Sub4_1.anInt295, local228.length, local228);
						}
						if (!this.aClass3_Sub1_Sub4_1.aBoolean99 && this.aClass3_Sub1_Sub4_1.anInt294 == 3) {
							this.aClass3_Sub1_Sub4_1.aBoolean99 = true;
							this.aClass3_Sub1_Sub4_1.anInt294 = 93;
						}
						if (this.aClass3_Sub1_Sub4_1.aBoolean99) {
							@Pc(321) Class27 local321 = this.aClass27_7;
							synchronized (this.aClass27_7) {
								this.aClass27_7.method302(this.aClass3_Sub1_Sub4_1);
							}
						} else {
							this.aClass3_Sub1_Sub4_1.method535();
						}
					}
					this.anInt611 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket2.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt611 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("95599, " + 1 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "b", descriptor = "()I")
	public int method409() {
		@Pc(2) Class41 local2 = this.aClass41_1;
		synchronized (this.aClass41_1) {
			return this.aClass41_1.method431();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(Lclient!KRPFBUJX;I)V")
	private void method410(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				this.anInt608 = 426;
			}
			try {
				if (this.aSocket2 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong19 < 4000L) {
						return;
					}
					this.aLong19 = local11;
					this.aSocket2 = this.aClient3.method654(client.anInt913 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt621 = 0;
				}
				this.aByteArray16[0] = (byte) arg0.anInt294;
				this.aByteArray16[1] = (byte) (arg0.anInt295 >> 8);
				this.aByteArray16[2] = (byte) arg0.anInt295;
				if (arg0.aBoolean99) {
					this.aByteArray16[3] = 2;
				} else if (this.aClient3.aBoolean251) {
					this.aByteArray16[3] = 0;
				} else {
					this.aByteArray16[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray16, 0, 4);
				this.anInt620 = 0;
				this.anInt622 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket2.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt611 = 0;
				this.anInt622++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("49785, " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "b", descriptor = "(II)I")
	public int method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArrayArray11[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("49966, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "d", descriptor = "(I)V")
	public void method412() {
		try {
			@Pc(2) Class27 local2 = this.aClass27_9;
			synchronized (this.aClass27_9) {
				this.aClass27_9.method309();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("90559, " + -67 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "c", descriptor = "()Lclient!KRPFBUJX;")
	public Class3_Sub1_Sub4 method413() {
		@Pc(4) Class27 local4 = this.aClass27_7;
		@Pc(11) Class3_Sub1_Sub4 local11;
		synchronized (this.aClass27_7) {
			local11 = (Class3_Sub1_Sub4) this.aClass27_7.method304();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class41 local24 = this.aClass41_1;
		synchronized (this.aClass41_1) {
			local11.method536();
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

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(III)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient3.aClass32Array1[0] != null && (this.anIntArrayArray11[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt623 != 0))) {
				@Pc(34) Class3_Sub1_Sub4 local34 = new Class3_Sub1_Sub4();
				local34.anInt294 = arg1;
				local34.anInt295 = arg0;
				local34.aBoolean99 = false;
				@Pc(46) Class27 local46 = this.aClass27_9;
				synchronized (this.aClass27_9) {
					this.aClass27_9.method302(local34);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("65596, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(ZI)V")
	public void method415(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray132.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray133[local16] != 0) {
					this.method405(3, this.anIntArray134[local16], (byte) 2);
					this.method405(3, this.anIntArray137[local16], (byte) 2);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("74721, " + arg0 + ", " + 806 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "a", descriptor = "(IB)Z")
	public boolean method416(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte16 != 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.anIntArray136[arg0] == 1;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("71817, " + arg0 + ", " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "c", descriptor = "(II)I")
	public int method417(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray18[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("15143, " + 16165 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "e", descriptor = "(I)V")
	private void method418() {
		try {
			@Pc(5) Class27 local5 = this.aClass27_6;
			@Pc(12) Class3_Sub1_Sub4 local12;
			synchronized (this.aClass27_6) {
				local12 = (Class3_Sub1_Sub4) this.aClass27_6.method304();
			}
			while (local12 != null) {
				this.aBoolean184 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient3.aClass32Array1[0] != null) {
					local23 = this.aClient3.aClass32Array1[local12.anInt294 + 1].method350(this.anInt613, local12.anInt295);
				}
				if (!this.method403(local23, this.anIntArrayArray11[local12.anInt294][local12.anInt295], this.anIntArrayArray12[local12.anInt294][local12.anInt295])) {
					local23 = null;
				}
				@Pc(69) Class27 local69 = this.aClass27_6;
				synchronized (this.aClass27_6) {
					if (local23 == null) {
						this.aClass27_5.method302(local12);
					} else {
						local12.aByteArray12 = local23;
						@Pc(85) Class27 local85 = this.aClass27_7;
						synchronized (this.aClass27_7) {
							this.aClass27_7.method302(local12);
						}
					}
					local12 = (Class3_Sub1_Sub4) this.aClass27_6.method304();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("26086, " + 858 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "f", descriptor = "(I)V")
	private void method419(@OriginalArg(0) int arg0) {
		try {
			this.anInt614 = 0;
			this.anInt615 = 0;
			if (arg0 <= 0) {
				this.anInt619 = -473;
			}
			@Pc(17) Class3_Sub1_Sub4 local17;
			for (local17 = (Class3_Sub1_Sub4) this.aClass27_8.method305(); local17 != null; local17 = (Class3_Sub1_Sub4) this.aClass27_8.method307()) {
				if (local17.aBoolean99) {
					this.anInt614++;
				} else {
					this.anInt615++;
				}
			}
			while (this.anInt614 < 10) {
				local17 = (Class3_Sub1_Sub4) this.aClass27_5.method304();
				if (local17 == null) {
					break;
				}
				if (this.aByteArrayArray3[local17.anInt294][local17.anInt295] != 0) {
					this.anInt612++;
				}
				this.aByteArrayArray3[local17.anInt294][local17.anInt295] = 0;
				this.aClass27_8.method302(local17);
				this.anInt614++;
				this.method410(local17, this.anInt616);
				this.aBoolean184 = true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("36469, " + arg0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean186) {
				this.anInt609++;
				@Pc(11) byte local11 = 20;
				if (this.anInt623 == 0 && this.aClient3.aClass32Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean184 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean184; local32++) {
					this.aBoolean184 = false;
					this.method418();
					this.method419(this.anInt617);
					if (this.anInt614 == 0 && local32 >= 5) {
						break;
					}
					this.method421();
					if (this.anInputStream2 != null) {
						this.method408();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class3_Sub1_Sub4 local73;
				for (local73 = (Class3_Sub1_Sub4) this.aClass27_8.method305(); local73 != null; local73 = (Class3_Sub1_Sub4) this.aClass27_8.method307()) {
					if (local73.aBoolean99) {
						local68 = true;
						local73.anInt296++;
						if (local73.anInt296 > 50) {
							local73.anInt296 = 0;
							this.method410(local73, this.anInt616);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class3_Sub1_Sub4) this.aClass27_8.method305(); local73 != null; local73 = (Class3_Sub1_Sub4) this.aClass27_8.method307()) {
						local68 = true;
						local73.anInt296++;
						if (local73.anInt296 > 50) {
							local73.anInt296 = 0;
							this.method410(local73, this.anInt616);
						}
					}
				}
				if (local68) {
					this.anInt621++;
					if (this.anInt621 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(160) Exception local160) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt611 = 0;
					}
				} else {
					this.anInt621 = 0;
					this.aString15 = "";
				}
				if (this.aClient3.aBoolean251 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt623 > 0 || this.aClient3.aClass32Array1[0] == null)) {
					this.anInt620++;
					if (this.anInt620 > 500) {
						this.anInt620 = 0;
						this.aByteArray16[0] = 0;
						this.aByteArray16[1] = 0;
						this.aByteArray16[2] = 0;
						this.aByteArray16[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray16, 0, 4);
						} catch (@Pc(241) IOException local241) {
							this.anInt621 = 5000;
						}
					}
				}
			}
		} catch (@Pc(250) Exception local250) {
			signlink.reporterror("od_ex " + local250.getMessage());
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "d", descriptor = "(II)Z")
	public boolean method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray132.length; local1++) {
				if (this.anIntArray134[local1] == arg1) {
					return true;
				}
			}
			@Pc(21) boolean local21 = false;
			return false;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("71264, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDBJVJCU", name = "g", descriptor = "(I)V")
	private void method421() {
		try {
			while (this.anInt614 == 0) {
				if (this.anInt615 >= 10 || this.anInt623 == 0) {
					return;
				}
				@Pc(10) Class27 local10 = this.aClass27_9;
				@Pc(17) Class3_Sub1_Sub4 local17;
				synchronized (this.aClass27_9) {
					local17 = (Class3_Sub1_Sub4) this.aClass27_9.method304();
				}
				while (local17 != null) {
					if (this.aByteArrayArray3[local17.anInt294][local17.anInt295] != 0) {
						this.aByteArrayArray3[local17.anInt294][local17.anInt295] = 0;
						this.aClass27_8.method302(local17);
						this.method410(local17, this.anInt616);
						this.aBoolean184 = true;
						if (this.anInt612 < this.anInt618) {
							this.anInt612++;
						}
						this.aString15 = "Loading extra files - " + this.anInt612 * 100 / this.anInt618 + "%";
						this.anInt615++;
						if (this.anInt615 == 10) {
							return;
						}
					}
					local10 = this.aClass27_9;
					synchronized (this.aClass27_9) {
						local17 = (Class3_Sub1_Sub4) this.aClass27_9.method304();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray3[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt623) {
							local119[local124] = 0;
							local17 = new Class3_Sub1_Sub4();
							local17.anInt294 = local112;
							local17.anInt295 = local124;
							local17.aBoolean99 = false;
							this.aClass27_8.method302(local17);
							this.method410(local17, this.anInt616);
							this.aBoolean184 = true;
							if (this.anInt612 < this.anInt618) {
								this.anInt612++;
							}
							this.aString15 = "Loading extra files - " + this.anInt612 * 100 / this.anInt618 + "%";
							this.anInt615++;
							if (this.anInt615 == 10) {
								return;
							}
						}
					}
				}
				this.anInt623--;
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("12386, " + 793 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}
}
