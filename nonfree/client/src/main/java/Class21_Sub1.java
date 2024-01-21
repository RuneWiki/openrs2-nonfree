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

@OriginalClass("client!LNOSHUMO")
public final class Class21_Sub1 extends Class21 implements Runnable {

	@OriginalMember(owner = "client!LNOSHUMO", name = "h", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!LNOSHUMO", name = "i", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!LNOSHUMO", name = "j", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!LNOSHUMO", name = "l", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!LNOSHUMO", name = "m", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!LNOSHUMO", name = "p", descriptor = "Lclient!MFGDOVSO;")
	private Class8_Sub1_Sub4 aClass8_Sub1_Sub4_1;

	@OriginalMember(owner = "client!LNOSHUMO", name = "q", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!LNOSHUMO", name = "r", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!LNOSHUMO", name = "t", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!LNOSHUMO", name = "w", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!LNOSHUMO", name = "x", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!LNOSHUMO", name = "y", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!LNOSHUMO", name = "z", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!LNOSHUMO", name = "A", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!LNOSHUMO", name = "B", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!LNOSHUMO", name = "D", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!LNOSHUMO", name = "E", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!LNOSHUMO", name = "F", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!LNOSHUMO", name = "I", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!LNOSHUMO", name = "J", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!LNOSHUMO", name = "K", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!LNOSHUMO", name = "O", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!LNOSHUMO", name = "Q", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!LNOSHUMO", name = "R", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray10 = new int[4][];

	@OriginalMember(owner = "client!LNOSHUMO", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!LNOSHUMO", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!LNOSHUMO", name = "e", descriptor = "Z")
	private boolean aBoolean96 = true;

	@OriginalMember(owner = "client!LNOSHUMO", name = "f", descriptor = "Ljava/lang/String;")
	public String aString3 = "";

	@OriginalMember(owner = "client!LNOSHUMO", name = "g", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_4 = new Class37((byte) 3);

	@OriginalMember(owner = "client!LNOSHUMO", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray11 = new int[4][];

	@OriginalMember(owner = "client!LNOSHUMO", name = "n", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_5 = new Class37((byte) 3);

	@OriginalMember(owner = "client!LNOSHUMO", name = "o", descriptor = "I")
	private int anInt352 = -371;

	@OriginalMember(owner = "client!LNOSHUMO", name = "s", descriptor = "[B")
	private byte[] aByteArray12 = new byte[65000];

	@OriginalMember(owner = "client!LNOSHUMO", name = "u", descriptor = "I")
	private int anInt355 = -786;

	@OriginalMember(owner = "client!LNOSHUMO", name = "v", descriptor = "[B")
	private byte[] aByteArray13 = new byte[500];

	@OriginalMember(owner = "client!LNOSHUMO", name = "C", descriptor = "Z")
	private boolean aBoolean97 = true;

	@OriginalMember(owner = "client!LNOSHUMO", name = "G", descriptor = "Lclient!LAPJVQGB;")
	private Class24 aClass24_2 = new Class24(-20780);

	@OriginalMember(owner = "client!LNOSHUMO", name = "H", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!LNOSHUMO", name = "L", descriptor = "I")
	private int anInt362 = 6;

	@OriginalMember(owner = "client!LNOSHUMO", name = "M", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_6 = new Class37((byte) 3);

	@OriginalMember(owner = "client!LNOSHUMO", name = "N", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_7 = new Class37((byte) 3);

	@OriginalMember(owner = "client!LNOSHUMO", name = "P", descriptor = "Lclient!VLLJSJTJ;")
	private Class37 aClass37_8 = new Class37((byte) 3);

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(ZB)V")
	public void method297(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(7) int local7 = this.anIntArray54.length;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				if (arg0 || this.anIntArray51[local9] != 0) {
					this.method313(3, (byte) 2, this.anIntArray53[local9]);
					this.method313(3, (byte) 2, this.anIntArray50[local9]);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23395, " + arg0 + ", " + 54 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(II)I")
	public int method298(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray11[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("80921, " + arg0 + ", " + 16501 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "(I)V")
	private void method299() {
		try {
			try {
				@Pc(16) int local16 = this.anInputStream2.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt351 == 0 && local16 >= 6) {
					this.aBoolean98 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream2.read(this.aByteArray13, local27, 6 - local27)) {
					}
					local51 = this.aByteArray13[0] & 0xFF;
					local67 = ((this.aByteArray13[1] & 0xFF) << 8) + (this.aByteArray13[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray13[3] & 0xFF) << 8) + (this.aByteArray13[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray13[5] & 0xFF;
					this.aClass8_Sub1_Sub4_1 = null;
					for (@Pc(98) Class8_Sub1_Sub4 local98 = (Class8_Sub1_Sub4) this.aClass37_8.method491(); local98 != null; local98 = (Class8_Sub1_Sub4) this.aClass37_8.method493()) {
						if (local98.anInt395 == local51 && local98.anInt397 == local67) {
							this.aClass8_Sub1_Sub4_1 = local98;
						}
						if (this.aClass8_Sub1_Sub4_1 != null) {
							local98.anInt396 = 0;
						}
					}
					if (this.aClass8_Sub1_Sub4_1 != null) {
						this.anInt361 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass8_Sub1_Sub4_1.aByteArray15 = null;
							if (this.aClass8_Sub1_Sub4_1.aBoolean105) {
								@Pc(156) Class37 local156 = this.aClass37_4;
								synchronized (this.aClass37_4) {
									this.aClass37_4.method488(this.aClass8_Sub1_Sub4_1);
								}
							} else {
								this.aClass8_Sub1_Sub4_1.method554();
							}
							this.aClass8_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass8_Sub1_Sub4_1.aByteArray15 == null && local90 == 0) {
								this.aClass8_Sub1_Sub4_1.aByteArray15 = new byte[local83];
							}
							if (this.aClass8_Sub1_Sub4_1.aByteArray15 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt350 = local90 * 500;
					this.anInt351 = 500;
					if (this.anInt351 > local83 - local90 * 500) {
						this.anInt351 = local83 - local90 * 500;
					}
				}
				if (this.anInt351 > 0 && local16 >= this.anInt351) {
					this.aBoolean98 = true;
					@Pc(235) byte[] local235 = this.aByteArray13;
					local51 = 0;
					if (this.aClass8_Sub1_Sub4_1 != null) {
						local235 = this.aClass8_Sub1_Sub4_1.aByteArray15;
						local51 = this.anInt350;
					}
					for (local67 = 0; local67 < this.anInt351; local67 += this.anInputStream2.read(local235, local67 + local51, this.anInt351 - local67)) {
					}
					if (this.anInt351 + this.anInt350 >= local235.length && this.aClass8_Sub1_Sub4_1 != null) {
						if (this.aClient1.aClass39Array1[0] != null) {
							this.aClient1.aClass39Array1[this.aClass8_Sub1_Sub4_1.anInt395 + 1].method497(local235.length, local235, this.aClass8_Sub1_Sub4_1.anInt397);
						}
						if (!this.aClass8_Sub1_Sub4_1.aBoolean105 && this.aClass8_Sub1_Sub4_1.anInt395 == 3) {
							this.aClass8_Sub1_Sub4_1.aBoolean105 = true;
							this.aClass8_Sub1_Sub4_1.anInt395 = 93;
						}
						if (this.aClass8_Sub1_Sub4_1.aBoolean105) {
							@Pc(328) Class37 local328 = this.aClass37_4;
							synchronized (this.aClass37_4) {
								this.aClass37_4.method488(this.aClass8_Sub1_Sub4_1);
							}
						} else {
							this.aClass8_Sub1_Sub4_1.method554();
						}
					}
					this.anInt351 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket2.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt351 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("58989, " + 6 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(III)V")
	public void method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient1.aClass39Array1[0] != null && (this.anIntArrayArray11[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt356 != 0))) {
				@Pc(30) Class8_Sub1_Sub4 local30 = new Class8_Sub1_Sub4();
				local30.anInt395 = arg1;
				local30.anInt397 = arg0;
				local30.aBoolean105 = false;
				@Pc(46) Class37 local46 = this.aClass37_7;
				synchronized (this.aClass37_7) {
					this.aClass37_7.method488(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("10019, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(Z)V")
	public void method301() {
		try {
			@Pc(2) Class37 local2 = this.aClass37_7;
			synchronized (this.aClass37_7) {
				this.aClass37_7.method495();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("72732, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(IZ)Z")
	public boolean method302(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray55[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("1278, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(B)V")
	private void method303() {
		try {
			while (this.anInt357 == 0) {
				if (this.anInt358 >= 10 || this.anInt356 == 0) {
					return;
				}
				@Pc(15) Class37 local15 = this.aClass37_7;
				@Pc(22) Class8_Sub1_Sub4 local22;
				synchronized (this.aClass37_7) {
					local22 = (Class8_Sub1_Sub4) this.aClass37_7.method490();
				}
				while (local22 != null) {
					if (this.aByteArrayArray3[local22.anInt395][local22.anInt397] != 0) {
						this.aByteArrayArray3[local22.anInt395][local22.anInt397] = 0;
						this.aClass37_8.method488(local22);
						this.method315(local22);
						this.aBoolean98 = true;
						if (this.anInt363 < this.anInt353) {
							this.anInt363++;
						}
						this.aString3 = "Loading extra files - " + this.anInt363 * 100 / this.anInt353 + "%";
						this.anInt358++;
						if (this.anInt358 == 10) {
							return;
						}
					}
					local15 = this.aClass37_7;
					synchronized (this.aClass37_7) {
						local22 = (Class8_Sub1_Sub4) this.aClass37_7.method490();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray3[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt356) {
							local123[local128] = 0;
							local22 = new Class8_Sub1_Sub4();
							local22.anInt395 = local116;
							local22.anInt397 = local128;
							local22.aBoolean105 = false;
							this.aClass37_8.method488(local22);
							this.method315(local22);
							this.aBoolean98 = true;
							if (this.anInt363 < this.anInt353) {
								this.anInt363++;
							}
							this.aString3 = "Loading extra files - " + this.anInt363 * 100 / this.anInt353 + "%";
							this.anInt358++;
							if (this.anInt358 == 10) {
								return;
							}
						}
					}
				}
				this.anInt356--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("88407, " + 5 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "([BIII)Z")
	private boolean method304(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(38) int local38 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_1.getValue();
			if (local38 == arg2) {
				return local52 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("75422, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "(II)V")
	public void method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray11.length || arg1 < 0 || arg1 > this.anIntArrayArray11[arg0].length || this.anIntArrayArray11[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class24 local27 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			@Pc(34) Class8_Sub1_Sub4 local34;
			for (local34 = (Class8_Sub1_Sub4) this.aClass24_2.method287(); local34 != null; local34 = (Class8_Sub1_Sub4) this.aClass24_2.method288()) {
				if (local34.anInt395 == arg0 && local34.anInt397 == arg1) {
					return;
				}
			}
			local34 = new Class8_Sub1_Sub4();
			local34.anInt395 = arg0;
			local34.anInt397 = arg1;
			local34.aBoolean105 = true;
			@Pc(71) Class37 local71 = this.aClass37_5;
			synchronized (this.aClass37_5) {
				this.aClass37_5.method488(local34);
			}
			this.aClass24_2.method285(local34);
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(I)V")
	@Override
	public void method296(@OriginalArg(0) int arg0) {
		this.method305(0, arg0);
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "()I")
	public int method306() {
		@Pc(2) Class24 local2 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			return this.aClass24_2.method289();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(Lclient!XRWUKRPO;Lclient!client;)V")
	public void method307(@OriginalArg(0) Class45 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method553(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class8_Sub1_Sub3 local42 = new Class8_Sub1_Sub3(local31, -49015);
			this.anIntArrayArray11[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray11[local22][local56] = local42.method167();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method553(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class8_Sub1_Sub3 local115 = new Class8_Sub1_Sub3(local104, -49015);
			this.anIntArrayArray10[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray10[local36][local123] = local115.method170();
			}
		}
		local104 = arg0.method553("model_index", null);
		local56 = this.anIntArrayArray11[0].length;
		this.aByteArray11 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray11[local158] = local104[local158];
			} else {
				this.aByteArray11[local158] = 0;
			}
		}
		local104 = arg0.method553("map_index", null);
		@Pc(193) Class8_Sub1_Sub3 local193 = new Class8_Sub1_Sub3(local104, -49015);
		local56 = local104.length / 7;
		this.anIntArray54 = new int[local56];
		this.anIntArray50 = new int[local56];
		this.anIntArray53 = new int[local56];
		this.anIntArray51 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray54[local216] = local193.method167();
			this.anIntArray50[local216] = local193.method167();
			this.anIntArray53[local216] = local193.method167();
			this.anIntArray51[local216] = local193.method165();
		}
		local104 = arg0.method553("anim_index", null);
		local193 = new Class8_Sub1_Sub3(local104, -49015);
		local56 = local104.length / 2;
		this.anIntArray52 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray52[local268] = local193.method167();
		}
		local104 = arg0.method553("midi_index", null);
		local193 = new Class8_Sub1_Sub3(local104, -49015);
		local56 = local104.length;
		this.anIntArray55 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray55[local300] = local193.method165();
		}
		this.aClient1 = arg1;
		this.aBoolean97 = true;
		this.aClient1.method578(this, 2);
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "()V")
	public void method308() {
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(BI)Z")
	public boolean method309(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray54.length; local1++) {
				if (this.anIntArray53[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57648, " + -7 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "c", descriptor = "(I)V")
	private void method310(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Class37 local4 = this.aClass37_5;
			@Pc(11) Class8_Sub1_Sub4 local11;
			synchronized (this.aClass37_5) {
				local11 = (Class8_Sub1_Sub4) this.aClass37_5.method490();
			}
			if (arg0 < 0) {
				while (local11 != null) {
					this.aBoolean98 = true;
					@Pc(27) byte[] local27 = null;
					if (this.aClient1.aClass39Array1[0] != null) {
						local27 = this.aClient1.aClass39Array1[local11.anInt395 + 1].method496((byte) 8, local11.anInt397);
					}
					if (!this.method304(local27, this.anIntArrayArray10[local11.anInt395][local11.anInt397], this.anIntArrayArray11[local11.anInt395][local11.anInt397])) {
						local27 = null;
					}
					@Pc(72) Class37 local72 = this.aClass37_5;
					synchronized (this.aClass37_5) {
						if (local27 == null) {
							this.aClass37_6.method488(local11);
						} else {
							local11.aByteArray15 = local27;
							@Pc(88) Class37 local88 = this.aClass37_4;
							synchronized (this.aClass37_4) {
								this.aClass37_4.method488(local11);
							}
						}
						local11 = (Class8_Sub1_Sub4) this.aClass37_5.method490();
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("52995, " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean97) {
				this.anInt359++;
				@Pc(11) byte local11 = 20;
				if (this.anInt356 == 0 && this.aClient1.aClass39Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean98 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean98; local32++) {
					this.aBoolean98 = false;
					this.method310(this.anInt355);
					this.method312();
					if (this.anInt357 == 0 && local32 >= 5) {
						break;
					}
					this.method303();
					if (this.anInputStream2 != null) {
						this.method299();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class8_Sub1_Sub4 local73;
				for (local73 = (Class8_Sub1_Sub4) this.aClass37_8.method491(); local73 != null; local73 = (Class8_Sub1_Sub4) this.aClass37_8.method493()) {
					if (local73.aBoolean105) {
						local68 = true;
						local73.anInt396++;
						if (local73.anInt396 > 50) {
							local73.anInt396 = 0;
							this.method315(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class8_Sub1_Sub4) this.aClass37_8.method491(); local73 != null; local73 = (Class8_Sub1_Sub4) this.aClass37_8.method493()) {
						local68 = true;
						local73.anInt396++;
						if (local73.anInt396 > 50) {
							local73.anInt396 = 0;
							this.method315(local73);
						}
					}
				}
				if (local68) {
					this.anInt361++;
					if (this.anInt361 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt351 = 0;
					}
				} else {
					this.anInt361 = 0;
					this.aString3 = "";
				}
				if (this.aClient1.aBoolean219 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt356 > 0 || this.aClient1.aClass39Array1[0] == null)) {
					this.anInt360++;
					if (this.anInt360 > 500) {
						this.anInt360 = 0;
						this.aByteArray13[0] = 0;
						this.aByteArray13[1] = 0;
						this.aByteArray13[2] = 0;
						this.aByteArray13[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray13, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt361 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "c", descriptor = "()Lclient!MFGDOVSO;")
	public Class8_Sub1_Sub4 method311() {
		@Pc(4) Class37 local4 = this.aClass37_4;
		@Pc(11) Class8_Sub1_Sub4 local11;
		synchronized (this.aClass37_4) {
			local11 = (Class8_Sub1_Sub4) this.aClass37_4.method490();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class24 local24 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			local11.method555();
		}
		if (local11.aByteArray15 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray15));
			while (true) {
				if (local41 == this.aByteArray12.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray12, local41, this.aByteArray12.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray15 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray15[local93] = this.aByteArray12[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "(Z)V")
	private void method312() {
		try {
			this.anInt357 = 0;
			this.anInt358 = 0;
			@Pc(12) Class8_Sub1_Sub4 local12;
			for (local12 = (Class8_Sub1_Sub4) this.aClass37_8.method491(); local12 != null; local12 = (Class8_Sub1_Sub4) this.aClass37_8.method493()) {
				if (local12.aBoolean105) {
					this.anInt357++;
				} else {
					this.anInt358++;
				}
			}
			while (this.anInt357 < 10) {
				local12 = (Class8_Sub1_Sub4) this.aClass37_6.method490();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray3[local12.anInt395][local12.anInt397] != 0) {
					this.anInt363++;
				}
				this.aByteArrayArray3[local12.anInt395][local12.anInt397] = 0;
				this.aClass37_8.method488(local12);
				this.anInt357++;
				this.method315(local12);
				this.aBoolean98 = true;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("50498, " + true + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(IIBI)V")
	public void method313(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass39Array1[0] != null && this.anIntArrayArray11[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass39Array1[arg0 + 1].method496((byte) 8, arg2);
				if (!this.method304(local25, this.anIntArrayArray10[arg0][arg2], this.anIntArrayArray11[arg0][arg2])) {
					this.aByteArrayArray3[arg0][arg2] = arg1;
					if (arg1 > this.anInt356) {
						this.anInt356 = arg1;
					}
					this.anInt353++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("89171, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "(IZ)I")
	public int method314(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray11[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("79444, " + arg0 + ", " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(ILclient!MFGDOVSO;)V")
	private void method315(@OriginalArg(1) Class8_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(16) long local16 = System.currentTimeMillis();
					if (local16 - this.aLong15 < 4000L) {
						return;
					}
					this.aLong15 = local16;
					this.aSocket2 = this.aClient1.method676(client.anInt878 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
						this.anInputStream2.read();
					}
					this.anInt361 = 0;
				}
				this.aByteArray13[0] = (byte) arg0.anInt395;
				this.aByteArray13[1] = (byte) (arg0.anInt397 >> 8);
				this.aByteArray13[2] = (byte) arg0.anInt397;
				if (arg0.aBoolean105) {
					this.aByteArray13[3] = 2;
				} else if (this.aClient1.aBoolean219) {
					this.aByteArray13[3] = 0;
				} else {
					this.aByteArray13[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray13, 0, 4);
				this.anInt360 = 0;
				this.anInt354 = -10000;
			} catch (@Pc(128) IOException local128) {
				try {
					this.aSocket2.close();
				} catch (@Pc(133) Exception local133) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt351 = 0;
				this.anInt354++;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("9786, " + -921 + ", " + arg0 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "a", descriptor = "(IIII)I")
	public int method316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) int local10 = (arg2 << 8) + arg0;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray54.length; local12++) {
				if (this.anIntArray54[local12] == local10) {
					if (arg1 == 0) {
						return this.anIntArray50[local12];
					}
					return this.anIntArray53[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("29519, " + -33346 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNOSHUMO", name = "b", descriptor = "(B)I")
	public int method317() {
		try {
			return this.anIntArray52.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("38182, " + 8 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}
