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

@OriginalClass("client!GLPUEKVZ")
public final class Class16_Sub1 extends Class16 implements Runnable {

	@OriginalMember(owner = "client!GLPUEKVZ", name = "F", descriptor = "I")
	private static int anInt303;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "e", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "f", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "g", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "j", descriptor = "Lclient!UWCGEJPY;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "k", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "n", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "q", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "r", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "u", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "v", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "x", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "y", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "z", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "A", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "B", descriptor = "I")
	public int anInt302;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "D", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "E", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "G", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "H", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "J", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "M", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "Q", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "R", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "S", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "b", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_2 = new Class23(6);

	@OriginalMember(owner = "client!GLPUEKVZ", name = "c", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[4][];

	@OriginalMember(owner = "client!GLPUEKVZ", name = "h", descriptor = "I")
	private int anInt296 = 9;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "i", descriptor = "I")
	private int anInt297 = 507;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "l", descriptor = "Lclient!DTFBSXNF;")
	private Class6 aClass6_2 = new Class6(false);

	@OriginalMember(owner = "client!GLPUEKVZ", name = "m", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "o", descriptor = "Ljava/lang/String;")
	public String aString5 = "";

	@OriginalMember(owner = "client!GLPUEKVZ", name = "p", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "s", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_3 = new Class23(6);

	@OriginalMember(owner = "client!GLPUEKVZ", name = "t", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_4 = new Class23(6);

	@OriginalMember(owner = "client!GLPUEKVZ", name = "w", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_5 = new Class23(6);

	@OriginalMember(owner = "client!GLPUEKVZ", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!GLPUEKVZ", name = "I", descriptor = "Lclient!LOISKKJJ;")
	private Class23 aClass23_6 = new Class23(6);

	@OriginalMember(owner = "client!GLPUEKVZ", name = "K", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!GLPUEKVZ", name = "L", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "N", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!GLPUEKVZ", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray7 = new int[4][];

	@OriginalMember(owner = "client!GLPUEKVZ", name = "P", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!GLPUEKVZ", name = "T", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!GLPUEKVZ", name = "b", descriptor = "(I)V")
	private void method207() {
		try {
			try {
				@Pc(16) int local16 = this.anInputStream2.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt305 == 0 && local16 >= 6) {
					this.aBoolean80 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream2.read(this.aByteArray4, local27, 6 - local27)) {
					}
					local51 = this.aByteArray4[0] & 0xFF;
					local67 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray4[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(98) Class1_Sub1_Sub4 local98 = (Class1_Sub1_Sub4) this.aClass23_5.method422(); local98 != null; local98 = (Class1_Sub1_Sub4) this.aClass23_5.method424((byte) 5)) {
						if (local98.anInt743 == local51 && local98.anInt742 == local67) {
							this.aClass1_Sub1_Sub4_1 = local98;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local98.anInt741 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt308 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass1_Sub1_Sub4_1.aByteArray19 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean185) {
								@Pc(156) Class23 local156 = this.aClass23_6;
								synchronized (this.aClass23_6) {
									this.aClass23_6.method419(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method544();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray19 == null && local90 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray19 = new byte[local83];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray19 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt304 = local90 * 500;
					this.anInt305 = 500;
					if (this.anInt305 > local83 - local90 * 500) {
						this.anInt305 = local83 - local90 * 500;
					}
				}
				if (this.anInt305 > 0 && local16 >= this.anInt305) {
					this.aBoolean80 = true;
					@Pc(235) byte[] local235 = this.aByteArray4;
					local51 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local235 = this.aClass1_Sub1_Sub4_1.aByteArray19;
						local51 = this.anInt304;
					}
					for (local67 = 0; local67 < this.anInt305; local67 += this.anInputStream2.read(local235, local67 + local51, this.anInt305 - local67)) {
					}
					if (this.anInt305 + this.anInt304 >= local235.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass34Array1[0] != null) {
							this.aClient2.aClass34Array1[this.aClass1_Sub1_Sub4_1.anInt743 + 1].method487(local235, this.aClass1_Sub1_Sub4_1.anInt742, 103, local235.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean185 && this.aClass1_Sub1_Sub4_1.anInt743 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean185 = true;
							this.aClass1_Sub1_Sub4_1.anInt743 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean185) {
							@Pc(328) Class23 local328 = this.aClass23_6;
							synchronized (this.aClass23_6) {
								this.aClass23_6.method419(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method544();
						}
					}
					this.anInt305 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket2.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt305 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("21341, " + -18776 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "c", descriptor = "(I)V")
	private void method208(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class23 local6 = this.aClass23_3;
			@Pc(13) Class1_Sub1_Sub4 local13;
			synchronized (this.aClass23_3) {
				local13 = (Class1_Sub1_Sub4) this.aClass23_3.method421();
			}
			while (local13 != null) {
				this.aBoolean80 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient2.aClass34Array1[0] != null) {
					local24 = this.aClient2.aClass34Array1[local13.anInt743 + 1].method486(local13.anInt742);
				}
				if (!this.method216(this.anInt296, this.anIntArrayArray6[local13.anInt743][local13.anInt742], this.anIntArrayArray7[local13.anInt743][local13.anInt742], local24)) {
					local24 = null;
				}
				@Pc(70) Class23 local70 = this.aClass23_3;
				synchronized (this.aClass23_3) {
					if (local24 == null) {
						this.aClass23_4.method419(local13);
					} else {
						local13.aByteArray19 = local24;
						@Pc(86) Class23 local86 = this.aClass23_6;
						synchronized (this.aClass23_6) {
							this.aClass23_6.method419(local13);
						}
					}
					local13 = (Class1_Sub1_Sub4) this.aClass23_3.method421();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("35206, " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(I)V")
	@Override
	public void method206(@OriginalArg(0) int arg0) {
		this.method214(0, arg0);
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(II)I")
	public int method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 <= 0) {
				this.aBoolean79 = !this.aBoolean79;
			}
			return this.aByteArray2[arg1] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("53992, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "()I")
	public int method210() {
		@Pc(2) Class6 local2 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			return this.aClass6_2.method97();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(B)V")
	private void method211() {
		try {
			while (this.anInt300 == 0) {
				if (this.anInt301 >= 10 || this.anInt299 == 0) {
					return;
				}
				@Pc(11) Class23 local11 = this.aClass23_2;
				@Pc(18) Class1_Sub1_Sub4 local18;
				synchronized (this.aClass23_2) {
					local18 = (Class1_Sub1_Sub4) this.aClass23_2.method421();
				}
				while (local18 != null) {
					if (this.aByteArrayArray2[local18.anInt743][local18.anInt742] != 0) {
						this.aByteArrayArray2[local18.anInt743][local18.anInt742] = 0;
						this.aClass23_5.method419(local18);
						this.method220(local18, 332);
						this.aBoolean80 = true;
						if (this.anInt295 < this.anInt306) {
							this.anInt295++;
						}
						this.aString5 = "Loading extra files - " + this.anInt295 * 100 / this.anInt306 + "%";
						this.anInt301++;
						if (this.anInt301 == 10) {
							return;
						}
					}
					local11 = this.aClass23_2;
					synchronized (this.aClass23_2) {
						local18 = (Class1_Sub1_Sub4) this.aClass23_2.method421();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray2[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt299) {
							local119[local124] = 0;
							local18 = new Class1_Sub1_Sub4();
							local18.anInt743 = local112;
							local18.anInt742 = local124;
							local18.aBoolean185 = false;
							this.aClass23_5.method419(local18);
							this.method220(local18, 332);
							this.aBoolean80 = true;
							if (this.anInt295 < this.anInt306) {
								this.anInt295++;
							}
							this.aString5 = "Loading extra files - " + this.anInt295 * 100 / this.anInt306 + "%";
							this.anInt301++;
							if (this.anInt301 == 10) {
								return;
							}
						}
					}
				}
				this.anInt299--;
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("83247, " + -23 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "b", descriptor = "()V")
	public void method212() {
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(IBBI)V")
	public void method213(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass34Array1[0] != null && this.anIntArrayArray7[arg2][arg0] != 0) {
				@Pc(35) byte[] local35 = this.aClient2.aClass34Array1[arg2 + 1].method486(arg0);
				if (!this.method216(this.anInt296, this.anIntArrayArray6[arg2][arg0], this.anIntArrayArray7[arg2][arg0], local35)) {
					this.aByteArrayArray2[arg2][arg0] = arg1;
					if (arg1 > this.anInt299) {
						this.anInt299 = arg1;
					}
					this.anInt306++;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("3595, " + arg0 + ", " + 39 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "b", descriptor = "(II)V")
	public void method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray7.length || arg1 < 0 || arg1 > this.anIntArrayArray7[arg0].length || this.anIntArrayArray7[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class6 local27 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass6_2.method95(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass6_2.method96()) {
				if (local34.anInt743 == arg0 && local34.anInt742 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt743 = arg0;
			local34.anInt742 = arg1;
			local34.aBoolean185 = true;
			@Pc(71) Class23 local71 = this.aClass23_3;
			synchronized (this.aClass23_3) {
				this.aClass23_3.method419(local34);
			}
			this.aClass6_2.method93(local34);
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(IIIZ)I")
	public int method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg0;
			if (!arg3) {
				anInt303 = 220;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray49.length; local11++) {
				if (this.anIntArray49[local11] == local5) {
					if (arg1 == 0) {
						return this.anIntArray44[local11];
					}
					return this.anIntArray48[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("60114, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(III[B)Z")
	private boolean method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg3 == null || arg3.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg3.length - 2;
			@Pc(17) int local17;
			if (arg0 != 9) {
				for (local17 = 1; local17 > 0; local17++) {
				}
			}
			local17 = ((arg3[local12] & 0xFF) << 8) + (arg3[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg3, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_1.getValue();
			if (local17 == arg2) {
				return local52 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("93189, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(Lclient!SPZBTZXL;Lclient!client;)V")
	public void method217(@OriginalArg(0) Class35 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method491(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, anInt303);
			this.anIntArrayArray7[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray7[local22][local56] = local42.method361();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method491(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, anInt303);
			this.anIntArrayArray6[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray6[local36][local123] = local115.method364();
			}
		}
		local104 = arg0.method491("model_index", null);
		local56 = this.anIntArrayArray7[0].length;
		this.aByteArray2 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray2[local158] = local104[local158];
			} else {
				this.aByteArray2[local158] = 0;
			}
		}
		local104 = arg0.method491("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, anInt303);
		local56 = local104.length / 7;
		this.anIntArray49 = new int[local56];
		this.anIntArray44 = new int[local56];
		this.anIntArray48 = new int[local56];
		this.anIntArray45 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray49[local216] = local193.method361();
			this.anIntArray44[local216] = local193.method361();
			this.anIntArray48[local216] = local193.method361();
			this.anIntArray45[local216] = local193.method359();
		}
		local104 = arg0.method491("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, anInt303);
		local56 = local104.length / 2;
		this.anIntArray46 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray46[local268] = local193.method361();
		}
		local104 = arg0.method491("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, anInt303);
		local56 = local104.length;
		this.anIntArray47 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray47[local300] = local193.method359();
		}
		this.aClient2 = arg1;
		this.aBoolean77 = true;
		this.aClient2.method580(this, 2);
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean77) {
				this.anInt302++;
				@Pc(11) byte local11 = 20;
				if (this.anInt299 == 0 && this.aClient2.aClass34Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean80 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean80; local32++) {
					this.aBoolean80 = false;
					this.method208(593);
					this.method223((byte) 4);
					if (this.anInt300 == 0 && local32 >= 5) {
						break;
					}
					this.method211();
					if (this.anInputStream2 != null) {
						this.method207();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass23_5.method422(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass23_5.method424((byte) 5)) {
					if (local72.aBoolean185) {
						local67 = true;
						local72.anInt741++;
						if (local72.anInt741 > 50) {
							local72.anInt741 = 0;
							this.method220(local72, 332);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass23_5.method422(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass23_5.method424((byte) 5)) {
						local67 = true;
						local72.anInt741++;
						if (local72.anInt741 > 50) {
							local72.anInt741 = 0;
							this.method220(local72, 332);
						}
					}
				}
				if (local67) {
					this.anInt308++;
					if (this.anInt308 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt305 = 0;
					}
				} else {
					this.anInt308 = 0;
					this.aString5 = "";
				}
				if (this.aClient2.aBoolean241 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt299 > 0 || this.aClient2.aClass34Array1[0] == null)) {
					this.anInt307++;
					if (this.anInt307 > 500) {
						this.anInt307 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray4, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt308 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(ZI)Z")
	public boolean method218(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray47[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("20274, " + false + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "b", descriptor = "(ZI)Z")
	public boolean method219(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray49.length; local1++) {
				if (this.anIntArray48[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("25422, " + true + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(Lclient!UWCGEJPY;I)V")
	private void method220(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				if (this.aSocket2 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong13 < 4000L) {
						return;
					}
					this.aLong13 = local10;
					this.aSocket2 = this.aClient2.method669(client.anInt1018 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream2.read();
					}
					this.anInt308 = 0;
				}
				this.aByteArray4[0] = (byte) arg0.anInt743;
				this.aByteArray4[1] = (byte) (arg0.anInt742 >> 8);
				this.aByteArray4[2] = (byte) arg0.anInt742;
				if (arg0.aBoolean185) {
					this.aByteArray4[3] = 2;
				} else if (this.aClient2.aBoolean241) {
					this.aByteArray4[3] = 0;
				} else {
					this.aByteArray4[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray4, 0, 4);
				this.anInt307 = 0;
				this.anInt298 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket2.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt305 = 0;
				this.anInt298++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("93502, " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "d", descriptor = "(I)V")
	public void method221(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				anInt303 = -435;
			}
			@Pc(6) Class23 local6 = this.aClass23_2;
			synchronized (this.aClass23_2) {
				this.aClass23_2.method426();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("41092, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(BZ)V")
	public void method222(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray49.length;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				if (arg0 || this.anIntArray45[local9] != 0) {
					this.method213(this.anIntArray48[local9], (byte) 2, 3);
					this.method213(this.anIntArray44[local9], (byte) 2, 3);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("10580, " + -7 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "b", descriptor = "(B)V")
	private void method223(@OriginalArg(0) byte arg0) {
		try {
			this.anInt300 = 0;
			@Pc(9) boolean local9 = false;
			this.anInt301 = 0;
			@Pc(27) Class1_Sub1_Sub4 local27;
			for (local27 = (Class1_Sub1_Sub4) this.aClass23_5.method422(); local27 != null; local27 = (Class1_Sub1_Sub4) this.aClass23_5.method424((byte) 5)) {
				if (local27.aBoolean185) {
					this.anInt300++;
				} else {
					this.anInt301++;
				}
			}
			while (this.anInt300 < 10) {
				local27 = (Class1_Sub1_Sub4) this.aClass23_4.method421();
				if (local27 == null) {
					break;
				}
				if (this.aByteArrayArray2[local27.anInt743][local27.anInt742] != 0) {
					this.anInt295++;
				}
				this.aByteArrayArray2[local27.anInt743][local27.anInt742] = 0;
				this.aClass23_5.method419(local27);
				this.anInt300++;
				this.method220(local27, 332);
				this.aBoolean80 = true;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("8258, " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "c", descriptor = "()Lclient!UWCGEJPY;")
	public Class1_Sub1_Sub4 method224() {
		@Pc(4) Class23 local4 = this.aClass23_6;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass23_6) {
			local11 = (Class1_Sub1_Sub4) this.aClass23_6.method421();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class6 local24 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			local11.method545();
		}
		if (local11.aByteArray19 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray19));
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
		local11.aByteArray19 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray19[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(BI)I")
	public int method225(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray7[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("6902, " + 9 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "a", descriptor = "(IBI)V")
	public void method226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass34Array1[0] != null && (this.anIntArrayArray7[arg0][arg1] != 0 && (this.aByteArrayArray2[arg0][arg1] != 0 && this.anInt299 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt743 = arg0;
				local30.anInt742 = arg1;
				local30.aBoolean185 = false;
				@Pc(42) Class23 local42 = this.aClass23_2;
				synchronized (this.aClass23_2) {
					this.aClass23_2.method419(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("73593, " + arg0 + ", " + 16 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLPUEKVZ", name = "e", descriptor = "(I)I")
	public int method227() {
		try {
			return this.anIntArray46.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("45458, " + -520 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}
}
