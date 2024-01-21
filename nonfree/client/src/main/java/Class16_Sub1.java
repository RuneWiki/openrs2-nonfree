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

@OriginalClass("client!HKGQPBYJ")
public final class Class16_Sub1 extends Class16 implements Runnable {

	@OriginalMember(owner = "client!HKGQPBYJ", name = "I", descriptor = "B")
	private static byte aByte19 = -126;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "Lclient!LVCMGOBA;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "d", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "e", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "j", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "l", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "n", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "q", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "t", descriptor = "I")
	public int anInt222;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "u", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "v", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "x", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "y", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "z", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "B", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "C", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "F", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "G", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "H", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "J", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "M", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "S", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "V", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "f", descriptor = "[B")
	private byte[] aByteArray5 = new byte[500];

	@OriginalMember(owner = "client!HKGQPBYJ", name = "g", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "h", descriptor = "[B")
	private byte[] aByteArray6 = new byte[65000];

	@OriginalMember(owner = "client!HKGQPBYJ", name = "i", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_1 = new Class44(aByte19);

	@OriginalMember(owner = "client!HKGQPBYJ", name = "m", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "p", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "r", descriptor = "I")
	private int anInt221 = 891;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "s", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_2 = new Class44(aByte19);

	@OriginalMember(owner = "client!HKGQPBYJ", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[4][];

	@OriginalMember(owner = "client!HKGQPBYJ", name = "A", descriptor = "I")
	private int anInt227 = -529;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "D", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_3 = new Class44(aByte19);

	@OriginalMember(owner = "client!HKGQPBYJ", name = "E", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_4 = new Class44(aByte19);

	@OriginalMember(owner = "client!HKGQPBYJ", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!HKGQPBYJ", name = "L", descriptor = "I")
	private int anInt230 = 965;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "N", descriptor = "Ljava/lang/String;")
	public String aString4 = "";

	@OriginalMember(owner = "client!HKGQPBYJ", name = "O", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[4][];

	@OriginalMember(owner = "client!HKGQPBYJ", name = "Q", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "R", descriptor = "Lclient!EDMDOBNM;")
	private Class9 aClass9_2 = new Class9(0);

	@OriginalMember(owner = "client!HKGQPBYJ", name = "T", descriptor = "Lclient!WAPMJSJO;")
	private Class44 aClass44_5 = new Class44(aByte19);

	@OriginalMember(owner = "client!HKGQPBYJ", name = "U", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!HKGQPBYJ", name = "W", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(II)I")
	public int method206(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray6[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("69145, " + 0 + ", " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(ZI)V")
	public void method207(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray44.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray45[local16] != 0) {
					this.method219(this.anIntArray46[local16], 3, (byte) 2);
					this.method219(this.anIntArray48[local16], 3, (byte) 2);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("24699, " + arg0 + ", " + 27878 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "(II)I")
	public int method208(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray7[arg0] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("54698, " + arg0 + ", " + -32251 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(III)V")
	public void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient3.aClass38Array1[0] != null && (this.anIntArrayArray6[arg0][arg1] != 0 && (this.aByteArrayArray2[arg0][arg1] != 0 && this.anInt231 != 0))) {
				@Pc(30) Class3_Sub1_Sub3 local30 = new Class3_Sub1_Sub3();
				local30.anInt285 = arg0;
				local30.anInt287 = arg1;
				local30.aBoolean82 = false;
				@Pc(52) Class44 local52 = this.aClass44_3;
				synchronized (this.aClass44_3) {
					this.aClass44_3.method436(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("15281, " + arg0 + ", " + arg1 + ", " + 407 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "()I")
	public int method210() {
		@Pc(2) Class9 local2 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			return this.aClass9_2.method83();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(IIII)I")
	public int method211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) int local10 = (arg0 << 8) + arg2;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray44.length; local12++) {
				if (this.anIntArray44[local12] == local10) {
					if (arg1 == 0) {
						return this.anIntArray48[local12];
					}
					return this.anIntArray46[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("7190, " + -45861 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "(II)Z")
	public boolean method212(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray43[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("54147, " + arg0 + ", " + 9 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(Z)V")
	private void method213(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				try {
					@Pc(8) int local8 = this.anInputStream1.available();
					@Pc(43) int local43;
					@Pc(59) int local59;
					if (this.anInt224 == 0 && local8 >= 6) {
						this.aBoolean65 = true;
						for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray5, local19, 6 - local19)) {
						}
						local43 = this.aByteArray5[0] & 0xFF;
						local59 = ((this.aByteArray5[1] & 0xFF) << 8) + (this.aByteArray5[2] & 0xFF);
						@Pc(75) int local75 = ((this.aByteArray5[3] & 0xFF) << 8) + (this.aByteArray5[4] & 0xFF);
						@Pc(82) int local82 = this.aByteArray5[5] & 0xFF;
						this.aClass3_Sub1_Sub3_1 = null;
						for (@Pc(90) Class3_Sub1_Sub3 local90 = (Class3_Sub1_Sub3) this.aClass44_2.method439(); local90 != null; local90 = (Class3_Sub1_Sub3) this.aClass44_2.method441()) {
							if (local90.anInt285 == local43 && local90.anInt287 == local59) {
								this.aClass3_Sub1_Sub3_1 = local90;
							}
							if (this.aClass3_Sub1_Sub3_1 != null) {
								local90.anInt286 = 0;
							}
						}
						if (this.aClass3_Sub1_Sub3_1 != null) {
							this.anInt228 = 0;
							if (local75 == 0) {
								signlink.reporterror("Rej: " + local43 + "," + local59);
								this.aClass3_Sub1_Sub3_1.aByteArray8 = null;
								if (this.aClass3_Sub1_Sub3_1.aBoolean82) {
									@Pc(148) Class44 local148 = this.aClass44_5;
									synchronized (this.aClass44_5) {
										this.aClass44_5.method436(this.aClass3_Sub1_Sub3_1);
									}
								} else {
									this.aClass3_Sub1_Sub3_1.method514();
								}
								this.aClass3_Sub1_Sub3_1 = null;
							} else {
								if (this.aClass3_Sub1_Sub3_1.aByteArray8 == null && local82 == 0) {
									this.aClass3_Sub1_Sub3_1.aByteArray8 = new byte[local75];
								}
								if (this.aClass3_Sub1_Sub3_1.aByteArray8 == null && local82 != 0) {
									throw new IOException("missing start of file");
								}
							}
						}
						this.anInt223 = local82 * 500;
						this.anInt224 = 500;
						if (this.anInt224 > local75 - local82 * 500) {
							this.anInt224 = local75 - local82 * 500;
						}
					}
					if (this.anInt224 > 0 && local8 >= this.anInt224) {
						this.aBoolean65 = true;
						@Pc(227) byte[] local227 = this.aByteArray5;
						local43 = 0;
						if (this.aClass3_Sub1_Sub3_1 != null) {
							local227 = this.aClass3_Sub1_Sub3_1.aByteArray8;
							local43 = this.anInt223;
						}
						for (local59 = 0; local59 < this.anInt224; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt224 - local59)) {
						}
						if (this.anInt224 + this.anInt223 >= local227.length && this.aClass3_Sub1_Sub3_1 != null) {
							if (this.aClient3.aClass38Array1[0] != null) {
								this.aClient3.aClass38Array1[this.aClass3_Sub1_Sub3_1.anInt285 + 1].method372(local227, (byte) 5, local227.length, this.aClass3_Sub1_Sub3_1.anInt287);
							}
							if (!this.aClass3_Sub1_Sub3_1.aBoolean82 && this.aClass3_Sub1_Sub3_1.anInt285 == 3) {
								this.aClass3_Sub1_Sub3_1.aBoolean82 = true;
								this.aClass3_Sub1_Sub3_1.anInt285 = 93;
							}
							if (this.aClass3_Sub1_Sub3_1.aBoolean82) {
								@Pc(320) Class44 local320 = this.aClass44_5;
								synchronized (this.aClass44_5) {
									this.aClass44_5.method436(this.aClass3_Sub1_Sub3_1);
								}
							} else {
								this.aClass3_Sub1_Sub3_1.method514();
							}
						}
						this.anInt224 = 0;
					}
				} catch (@Pc(341) IOException local341) {
					try {
						this.aSocket1.close();
					} catch (@Pc(346) Exception local346) {
					}
					this.aSocket1 = null;
					this.anInputStream1 = null;
					this.anOutputStream1 = null;
					this.anInt224 = 0;
				}
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("32099, " + arg0 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(Lclient!RPFMUSNN;Lclient!client;)V")
	public void method214(@OriginalArg(0) Class35 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method341(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class3_Sub1_Sub4 local42 = new Class3_Sub1_Sub4((byte) -58, local31);
			this.anIntArrayArray6[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray6[local22][local56] = local42.method460();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method341(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class3_Sub1_Sub4 local115 = new Class3_Sub1_Sub4((byte) -58, local104);
			this.anIntArrayArray5[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray5[local36][local123] = local115.method463();
			}
		}
		local104 = arg0.method341("model_index", null);
		local56 = this.anIntArrayArray6[0].length;
		this.aByteArray7 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray7[local158] = local104[local158];
			} else {
				this.aByteArray7[local158] = 0;
			}
		}
		local104 = arg0.method341("map_index", null);
		@Pc(193) Class3_Sub1_Sub4 local193 = new Class3_Sub1_Sub4((byte) -58, local104);
		local56 = local104.length / 7;
		this.anIntArray44 = new int[local56];
		this.anIntArray48 = new int[local56];
		this.anIntArray46 = new int[local56];
		this.anIntArray45 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray44[local216] = local193.method460();
			this.anIntArray48[local216] = local193.method460();
			this.anIntArray46[local216] = local193.method460();
			this.anIntArray45[local216] = local193.method458();
		}
		local104 = arg0.method341("anim_index", null);
		local193 = new Class3_Sub1_Sub4((byte) -58, local104);
		local56 = local104.length / 2;
		this.anIntArray47 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray47[local268] = local193.method460();
		}
		local104 = arg0.method341("midi_index", null);
		local193 = new Class3_Sub1_Sub4((byte) -58, local104);
		local56 = local104.length;
		this.anIntArray43 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray43[local300] = local193.method458();
		}
		this.aClient3 = arg1;
		this.aBoolean66 = true;
		this.aClient3.method586(this, 2);
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean66) {
				this.anInt220++;
				@Pc(11) byte local11 = 20;
				if (this.anInt231 == 0 && this.aClient3.aClass38Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean65 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean65; local32++) {
					this.aBoolean65 = false;
					this.method216(this.anInt229);
					this.method220();
					if (this.anInt225 == 0 && local32 >= 5) {
						break;
					}
					this.method217();
					if (this.anInputStream1 != null) {
						this.method213(this.aBoolean69);
					}
				}
				@Pc(69) boolean local69 = false;
				@Pc(74) Class3_Sub1_Sub3 local74;
				for (local74 = (Class3_Sub1_Sub3) this.aClass44_2.method439(); local74 != null; local74 = (Class3_Sub1_Sub3) this.aClass44_2.method441()) {
					if (local74.aBoolean82) {
						local69 = true;
						local74.anInt286++;
						if (local74.anInt286 > 50) {
							local74.anInt286 = 0;
							this.method218(local74);
						}
					}
				}
				if (!local69) {
					for (local74 = (Class3_Sub1_Sub3) this.aClass44_2.method439(); local74 != null; local74 = (Class3_Sub1_Sub3) this.aClass44_2.method441()) {
						local69 = true;
						local74.anInt286++;
						if (local74.anInt286 > 50) {
							local74.anInt286 = 0;
							this.method218(local74);
						}
					}
				}
				if (local69) {
					this.anInt228++;
					if (this.anInt228 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt224 = 0;
					}
				} else {
					this.anInt228 = 0;
					this.aString4 = "";
				}
				if (this.aClient3.aBoolean206 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt231 > 0 || this.aClient3.aClass38Array1[0] == null)) {
					this.anInt217++;
					if (this.anInt217 > 500) {
						this.anInt217 = 0;
						this.aByteArray5[0] = 0;
						this.aByteArray5[1] = 0;
						this.aByteArray5[2] = 0;
						this.aByteArray5[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray5, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt228 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(IB)Z")
	public boolean method215(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray44.length; local3++) {
				if (this.anIntArray46[local3] == arg0) {
					return true;
				}
			}
			@Pc(24) boolean local24 = false;
			return false;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("76688, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "(I)V")
	private void method216(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt227 = 56;
			}
			@Pc(7) Class44 local7 = this.aClass44_4;
			@Pc(14) Class3_Sub1_Sub3 local14;
			synchronized (this.aClass44_4) {
				local14 = (Class3_Sub1_Sub3) this.aClass44_4.method438();
			}
			while (local14 != null) {
				this.aBoolean65 = true;
				@Pc(25) byte[] local25 = null;
				if (this.aClient3.aClass38Array1[0] != null) {
					local25 = this.aClient3.aClass38Array1[local14.anInt285 + 1].method371(local14.anInt287);
				}
				if (!this.method226(this.anIntArrayArray5[local14.anInt285][local14.anInt287], local25, this.anIntArrayArray6[local14.anInt285][local14.anInt287], this.anInt221)) {
					local25 = null;
				}
				@Pc(71) Class44 local71 = this.aClass44_4;
				synchronized (this.aClass44_4) {
					if (local25 == null) {
						this.aClass44_1.method436(local14);
					} else {
						local14.aByteArray8 = local25;
						@Pc(87) Class44 local87 = this.aClass44_5;
						synchronized (this.aClass44_5) {
							this.aClass44_5.method436(local14);
						}
					}
					local14 = (Class3_Sub1_Sub3) this.aClass44_4.method438();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("23348, " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "(I)V")
	private void method217() {
		try {
			while (this.anInt225 == 0) {
				if (this.anInt226 >= 10 || this.anInt231 == 0) {
					return;
				}
				@Pc(14) Class44 local14 = this.aClass44_3;
				@Pc(21) Class3_Sub1_Sub3 local21;
				synchronized (this.aClass44_3) {
					local21 = (Class3_Sub1_Sub3) this.aClass44_3.method438();
				}
				while (local21 != null) {
					if (this.aByteArrayArray2[local21.anInt285][local21.anInt287] != 0) {
						this.aByteArrayArray2[local21.anInt285][local21.anInt287] = 0;
						this.aClass44_2.method436(local21);
						this.method218(local21);
						this.aBoolean65 = true;
						if (this.anInt218 < this.anInt219) {
							this.anInt218++;
						}
						this.aString4 = "Loading extra files - " + this.anInt218 * 100 / this.anInt219 + "%";
						this.anInt226++;
						if (this.anInt226 == 10) {
							return;
						}
					}
					local14 = this.aClass44_3;
					synchronized (this.aClass44_3) {
						local21 = (Class3_Sub1_Sub3) this.aClass44_3.method438();
					}
				}
				for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
					@Pc(122) byte[] local122 = this.aByteArrayArray2[local115];
					@Pc(125) int local125 = local122.length;
					for (@Pc(127) int local127 = 0; local127 < local125; local127++) {
						if (local122[local127] == this.anInt231) {
							local122[local127] = 0;
							local21 = new Class3_Sub1_Sub3();
							local21.anInt285 = local115;
							local21.anInt287 = local127;
							local21.aBoolean82 = false;
							this.aClass44_2.method436(local21);
							this.method218(local21);
							this.aBoolean65 = true;
							if (this.anInt218 < this.anInt219) {
								this.anInt218++;
							}
							this.aString4 = "Loading extra files - " + this.anInt218 * 100 / this.anInt219 + "%";
							this.anInt226++;
							if (this.anInt226 == 10) {
								return;
							}
						}
					}
				}
				this.anInt231--;
			}
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("68739, " + 0 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(Lclient!LVCMGOBA;Z)V")
	private void method218(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong11 < 4000L) {
						return;
					}
					this.aLong11 = local11;
					this.aSocket1 = this.aClient3.method621(client.anInt865 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream1.read();
					}
					this.anInt228 = 0;
				}
				this.aByteArray5[0] = (byte) arg0.anInt285;
				this.aByteArray5[1] = (byte) (arg0.anInt287 >> 8);
				this.aByteArray5[2] = (byte) arg0.anInt287;
				if (arg0.aBoolean82) {
					this.aByteArray5[3] = 2;
				} else if (this.aClient3.aBoolean206) {
					this.aByteArray5[3] = 0;
				} else {
					this.aByteArray5[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray5, 0, 4);
				this.anInt217 = 0;
				this.anInt222 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket1.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt224 = 0;
				this.anInt222++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("72043, " + arg0 + ", " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(IIBZ)V")
	public void method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aClient3.aClass38Array1[0] != null && this.anIntArrayArray6[arg1][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass38Array1[arg1 + 1].method371(arg0);
				if (!this.method226(this.anIntArrayArray5[arg1][arg0], local25, this.anIntArrayArray6[arg1][arg0], this.anInt221)) {
					this.aByteArrayArray2[arg1][arg0] = arg2;
					if (arg2 > this.anInt231) {
						this.anInt231 = arg2;
					}
					this.anInt219++;
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("76714, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "d", descriptor = "(I)V")
	private void method220() {
		try {
			this.anInt225 = 0;
			this.anInt226 = 0;
			@Pc(24) Class3_Sub1_Sub3 local24;
			for (local24 = (Class3_Sub1_Sub3) this.aClass44_2.method439(); local24 != null; local24 = (Class3_Sub1_Sub3) this.aClass44_2.method441()) {
				if (local24.aBoolean82) {
					this.anInt225++;
				} else {
					this.anInt226++;
				}
			}
			while (this.anInt225 < 10) {
				local24 = (Class3_Sub1_Sub3) this.aClass44_1.method438();
				if (local24 == null) {
					break;
				}
				if (this.aByteArrayArray2[local24.anInt285][local24.anInt287] != 0) {
					this.anInt218++;
				}
				this.aByteArrayArray2[local24.anInt285][local24.anInt287] = 0;
				this.aClass44_2.method436(local24);
				this.anInt225++;
				this.method218(local24);
				this.aBoolean65 = true;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("75814, " + -756 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "()V")
	public void method221() {
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "d", descriptor = "(II)V")
	public void method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray6.length || arg1 < 0 || arg1 > this.anIntArrayArray6[arg0].length || this.anIntArrayArray6[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class9 local27 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			@Pc(34) Class3_Sub1_Sub3 local34;
			for (local34 = (Class3_Sub1_Sub3) this.aClass9_2.method81(); local34 != null; local34 = (Class3_Sub1_Sub3) this.aClass9_2.method82()) {
				if (local34.anInt285 == arg0 && local34.anInt287 == arg1) {
					return;
				}
			}
			local34 = new Class3_Sub1_Sub3();
			local34.anInt285 = arg0;
			local34.anInt287 = arg1;
			local34.aBoolean82 = true;
			@Pc(71) Class44 local71 = this.aClass44_4;
			synchronized (this.aClass44_4) {
				this.aClass44_4.method436(local34);
			}
			this.aClass9_2.method79(local34);
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(B)V")
	public void method223(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 34) {
				@Pc(6) Class44 local6 = this.aClass44_3;
				synchronized (this.aClass44_3) {
					this.aClass44_3.method443();
				}
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("7392, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "e", descriptor = "(I)I")
	public int method224() {
		try {
			return this.anIntArray47.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("81760, " + -48454 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "()Lclient!LVCMGOBA;")
	public Class3_Sub1_Sub3 method225() {
		@Pc(4) Class44 local4 = this.aClass44_5;
		@Pc(11) Class3_Sub1_Sub3 local11;
		synchronized (this.aClass44_5) {
			local11 = (Class3_Sub1_Sub3) this.aClass44_5.method438();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class9 local24 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			local11.method515();
		}
		if (local11.aByteArray8 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray8));
			while (true) {
				if (local41 == this.aByteArray6.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray6, local41, this.aByteArray6.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray8 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray8[local93] = this.aByteArray6[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(I[BII)Z")
	private boolean method226(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			if (arg3 <= 0) {
				this.anInt230 = 218;
			}
			@Pc(33) int local33 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(47) int local47 = (int) this.aCRC32_1.getValue();
			if (local33 == arg2) {
				return local47 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("14468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(I)V")
	@Override
	public void method205(@OriginalArg(0) int arg0) {
		this.method222(0, arg0);
	}
}
