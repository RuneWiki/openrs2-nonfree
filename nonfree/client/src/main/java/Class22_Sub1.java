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

@OriginalClass("client!NTGEPOMK")
public final class Class22_Sub1 extends Class22 implements Runnable {

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!NTGEPOMK", name = "c", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!NTGEPOMK", name = "d", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!NTGEPOMK", name = "e", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!NTGEPOMK", name = "f", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!NTGEPOMK", name = "g", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!NTGEPOMK", name = "i", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!NTGEPOMK", name = "k", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!NTGEPOMK", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!NTGEPOMK", name = "r", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!NTGEPOMK", name = "t", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!NTGEPOMK", name = "u", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "client!NTGEPOMK", name = "v", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!NTGEPOMK", name = "z", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!NTGEPOMK", name = "A", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!NTGEPOMK", name = "B", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!NTGEPOMK", name = "C", descriptor = "Lclient!HEWLXUXO;")
	private Class6_Sub1_Sub3 aClass6_Sub1_Sub3_1;

	@OriginalMember(owner = "client!NTGEPOMK", name = "D", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!NTGEPOMK", name = "E", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "client!NTGEPOMK", name = "G", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!NTGEPOMK", name = "H", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!NTGEPOMK", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!NTGEPOMK", name = "N", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!NTGEPOMK", name = "Q", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "I")
	private int anInt496 = 523;

	@OriginalMember(owner = "client!NTGEPOMK", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray12 = new int[4][];

	@OriginalMember(owner = "client!NTGEPOMK", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!NTGEPOMK", name = "l", descriptor = "Ljava/lang/String;")
	public String aString7 = "";

	@OriginalMember(owner = "client!NTGEPOMK", name = "m", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_1 = new Class5(-7255);

	@OriginalMember(owner = "client!NTGEPOMK", name = "n", descriptor = "I")
	private int anInt499 = 3;

	@OriginalMember(owner = "client!NTGEPOMK", name = "o", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!NTGEPOMK", name = "p", descriptor = "[B")
	private byte[] aByteArray8 = new byte[500];

	@OriginalMember(owner = "client!NTGEPOMK", name = "s", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_2 = new Class5(-7255);

	@OriginalMember(owner = "client!NTGEPOMK", name = "w", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!NTGEPOMK", name = "x", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_3 = new Class5(-7255);

	@OriginalMember(owner = "client!NTGEPOMK", name = "y", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_4 = new Class5(-7255);

	@OriginalMember(owner = "client!NTGEPOMK", name = "F", descriptor = "Lclient!CEEJCAVA;")
	private Class5 aClass5_5 = new Class5(-7255);

	@OriginalMember(owner = "client!NTGEPOMK", name = "J", descriptor = "Lclient!LIHZBJAU;")
	private Class24 aClass24_1 = new Class24(0);

	@OriginalMember(owner = "client!NTGEPOMK", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray13 = new int[4][];

	@OriginalMember(owner = "client!NTGEPOMK", name = "L", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!NTGEPOMK", name = "M", descriptor = "I")
	private int anInt508 = 208;

	@OriginalMember(owner = "client!NTGEPOMK", name = "O", descriptor = "[B")
	private byte[] aByteArray10 = new byte[65000];

	@OriginalMember(owner = "client!NTGEPOMK", name = "P", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "()V")
	public void method279() {
		this.aBoolean138 = false;
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(Z)V")
	private void method280() {
		try {
			this.anInt505 = 0;
			this.anInt506 = 0;
			@Pc(12) Class6_Sub1_Sub3 local12;
			for (local12 = (Class6_Sub1_Sub3) this.aClass5_3.method33(); local12 != null; local12 = (Class6_Sub1_Sub3) this.aClass5_3.method35((byte) 8)) {
				if (local12.aBoolean53) {
					this.anInt505++;
				} else {
					this.anInt506++;
				}
			}
			while (this.anInt505 < 10) {
				local12 = (Class6_Sub1_Sub3) this.aClass5_1.method32();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray2[local12.anInt160][local12.anInt161] != 0) {
					this.anInt504++;
				}
				this.aByteArrayArray2[local12.anInt160][local12.anInt161] = 0;
				this.aClass5_3.method30(local12);
				this.anInt505++;
				this.method296(local12);
				this.aBoolean140 = true;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("69007, " + false + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(I)V")
	@Override
	public void method278(@OriginalArg(0) int arg0) {
		this.method283(0, arg0);
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(I)V")
	private void method281() {
		try {
			@Pc(9) Class5 local9 = this.aClass5_5;
			@Pc(16) Class6_Sub1_Sub3 local16;
			synchronized (this.aClass5_5) {
				local16 = (Class6_Sub1_Sub3) this.aClass5_5.method32();
			}
			while (local16 != null) {
				this.aBoolean140 = true;
				@Pc(27) byte[] local27 = null;
				if (this.aClient3.aClass14Array1[0] != null) {
					local27 = this.aClient3.aClass14Array1[local16.anInt160 + 1].method117(local16.anInt161);
				}
				if (!this.method297(this.anIntArrayArray13[local16.anInt160][local16.anInt161], local27, this.anIntArrayArray12[local16.anInt160][local16.anInt161])) {
					local27 = null;
				}
				@Pc(72) Class5 local72 = this.aClass5_5;
				synchronized (this.aClass5_5) {
					if (local27 == null) {
						this.aClass5_1.method30(local16);
					} else {
						local16.aByteArray4 = local27;
						@Pc(88) Class5 local88 = this.aClass5_4;
						synchronized (this.aClass5_4) {
							this.aClass5_4.method30(local16);
						}
					}
					local16 = (Class6_Sub1_Sub3) this.aClass5_5.method32();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("6525, " + -613 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(ZI)V")
	public void method282(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.anIntArray136.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray138[local5] != 0) {
					this.method291(3, (byte) 2, this.anIntArray134[local5]);
					this.method291(3, (byte) 2, this.anIntArray133[local5]);
				}
			}
			if (arg1 < 9 || arg1 > 9) {
				;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("18013, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(II)V")
	public void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray13.length || arg1 < 0 || arg1 > this.anIntArrayArray13[arg0].length || this.anIntArrayArray13[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class24 local27 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			@Pc(34) Class6_Sub1_Sub3 local34;
			for (local34 = (Class6_Sub1_Sub3) this.aClass24_1.method187(); local34 != null; local34 = (Class6_Sub1_Sub3) this.aClass24_1.method188()) {
				if (local34.anInt160 == arg0 && local34.anInt161 == arg1) {
					return;
				}
			}
			local34 = new Class6_Sub1_Sub3();
			local34.anInt160 = arg0;
			local34.anInt161 = arg1;
			local34.aBoolean53 = true;
			@Pc(71) Class5 local71 = this.aClass5_5;
			synchronized (this.aClass5_5) {
				this.aClass5_5.method30(local34);
			}
			this.aClass24_1.method185(local34);
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(ZII)V")
	public void method284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient3.aClass14Array1[0] != null && (this.anIntArrayArray13[arg1][arg0] != 0 && (this.aByteArrayArray2[arg1][arg0] != 0 && this.anInt498 != 0))) {
				@Pc(30) Class6_Sub1_Sub3 local30 = new Class6_Sub1_Sub3();
				local30.anInt160 = arg1;
				local30.anInt161 = arg0;
				local30.aBoolean53 = false;
				@Pc(42) Class5 local42 = this.aClass5_2;
				synchronized (this.aClass5_2) {
					this.aClass5_2.method30(local30);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("64308, " + false + ", " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "()I")
	public int method285() {
		@Pc(2) Class24 local2 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			return this.aClass24_1.method189();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IZ)Z")
	public boolean method286(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray135[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("1150, " + arg0 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(B)I")
	public int method287() {
		try {
			return this.anIntArray137.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("31039, " + 3 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(Lclient!ESUFCMYV;Lclient!client;)V")
	public void method288(@OriginalArg(0) Class11 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method89(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class6_Sub1_Sub4 local42 = new Class6_Sub1_Sub4(local31, (byte) -17);
			this.anIntArrayArray13[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray13[local22][local56] = local42.method413();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method89(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class6_Sub1_Sub4 local115 = new Class6_Sub1_Sub4(local104, (byte) -17);
			this.anIntArrayArray12[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray12[local36][local123] = local115.method416();
			}
		}
		local104 = arg0.method89("model_index", null);
		local56 = this.anIntArrayArray13[0].length;
		this.aByteArray9 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray9[local158] = local104[local158];
			} else {
				this.aByteArray9[local158] = 0;
			}
		}
		local104 = arg0.method89("map_index", null);
		@Pc(193) Class6_Sub1_Sub4 local193 = new Class6_Sub1_Sub4(local104, (byte) -17);
		local56 = local104.length / 7;
		this.anIntArray136 = new int[local56];
		this.anIntArray133 = new int[local56];
		this.anIntArray134 = new int[local56];
		this.anIntArray138 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray136[local216] = local193.method413();
			this.anIntArray133[local216] = local193.method413();
			this.anIntArray134[local216] = local193.method413();
			this.anIntArray138[local216] = local193.method411();
		}
		local104 = arg0.method89("anim_index", null);
		local193 = new Class6_Sub1_Sub4(local104, (byte) -17);
		local56 = local104.length / 2;
		this.anIntArray137 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray137[local268] = local193.method413();
		}
		local104 = arg0.method89("midi_index", null);
		local193 = new Class6_Sub1_Sub4(local104, (byte) -17);
		local56 = local104.length;
		this.anIntArray135 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray135[local300] = local193.method411();
		}
		this.aClient3 = arg1;
		this.aBoolean138 = true;
		this.aClient3.method586(this, 2);
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(B)V")
	public void method289() {
		try {
			@Pc(2) Class5 local2 = this.aClass5_2;
			synchronized (this.aClass5_2) {
				this.aClass5_2.method37();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("93351, " + -72 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(Z)V")
	private void method290() {
		try {
			while (this.anInt505 == 0) {
				if (this.anInt506 >= 10 || this.anInt498 == 0) {
					return;
				}
				@Pc(10) Class5 local10 = this.aClass5_2;
				@Pc(17) Class6_Sub1_Sub3 local17;
				synchronized (this.aClass5_2) {
					local17 = (Class6_Sub1_Sub3) this.aClass5_2.method32();
				}
				while (local17 != null) {
					if (this.aByteArrayArray2[local17.anInt160][local17.anInt161] != 0) {
						this.aByteArrayArray2[local17.anInt160][local17.anInt161] = 0;
						this.aClass5_3.method30(local17);
						this.method296(local17);
						this.aBoolean140 = true;
						if (this.anInt504 < this.anInt502) {
							this.anInt504++;
						}
						this.aString7 = "Loading extra files - " + this.anInt504 * 100 / this.anInt502 + "%";
						this.anInt506++;
						if (this.anInt506 == 10) {
							return;
						}
					}
					local10 = this.aClass5_2;
					synchronized (this.aClass5_2) {
						local17 = (Class6_Sub1_Sub3) this.aClass5_2.method32();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray2[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt498) {
							local118[local123] = 0;
							local17 = new Class6_Sub1_Sub3();
							local17.anInt160 = local111;
							local17.anInt161 = local123;
							local17.aBoolean53 = false;
							this.aClass5_3.method30(local17);
							this.method296(local17);
							this.aBoolean140 = true;
							if (this.anInt504 < this.anInt502) {
								this.anInt504++;
							}
							this.aString7 = "Loading extra files - " + this.anInt504 * 100 / this.anInt502 + "%";
							this.anInt506++;
							if (this.anInt506 == 10) {
								return;
							}
						}
					}
				}
				this.anInt498--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("68745, " + false + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IBII)V")
	public void method291(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient3.aClass14Array1[0] != null && this.anIntArrayArray13[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass14Array1[arg0 + 1].method117(arg2);
				if (!this.method297(this.anIntArrayArray13[arg0][arg2], local25, this.anIntArrayArray12[arg0][arg2])) {
					this.aByteArrayArray2[arg0][arg2] = arg1;
					if (arg1 > this.anInt498) {
						this.anInt498 = arg1;
					}
					this.anInt502++;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("62636, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 462 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "c", descriptor = "(I)V")
	private void method292() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream1.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt501 == 0 && local8 >= 6) {
					this.aBoolean140 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray8, local19, 6 - local19)) {
					}
					local43 = this.aByteArray8[0] & 0xFF;
					local59 = ((this.aByteArray8[1] & 0xFF) << 8) + (this.aByteArray8[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray8[3] & 0xFF) << 8) + (this.aByteArray8[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray8[5] & 0xFF;
					this.aClass6_Sub1_Sub3_1 = null;
					for (@Pc(90) Class6_Sub1_Sub3 local90 = (Class6_Sub1_Sub3) this.aClass5_3.method33(); local90 != null; local90 = (Class6_Sub1_Sub3) this.aClass5_3.method35((byte) 8)) {
						if (local90.anInt160 == local43 && local90.anInt161 == local59) {
							this.aClass6_Sub1_Sub3_1 = local90;
						}
						if (this.aClass6_Sub1_Sub3_1 != null) {
							local90.anInt162 = 0;
						}
					}
					if (this.aClass6_Sub1_Sub3_1 != null) {
						this.anInt503 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass6_Sub1_Sub3_1.aByteArray4 = null;
							if (this.aClass6_Sub1_Sub3_1.aBoolean53) {
								@Pc(148) Class5 local148 = this.aClass5_4;
								synchronized (this.aClass5_4) {
									this.aClass5_4.method30(this.aClass6_Sub1_Sub3_1);
								}
							} else {
								this.aClass6_Sub1_Sub3_1.method548();
							}
							this.aClass6_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass6_Sub1_Sub3_1.aByteArray4 == null && local82 == 0) {
								this.aClass6_Sub1_Sub3_1.aByteArray4 = new byte[local75];
							}
							if (this.aClass6_Sub1_Sub3_1.aByteArray4 == null && local82 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt500 = local82 * 500;
					this.anInt501 = 500;
					if (this.anInt501 > local75 - local82 * 500) {
						this.anInt501 = local75 - local82 * 500;
					}
				}
				if (this.anInt501 > 0 && local8 >= this.anInt501) {
					this.aBoolean140 = true;
					@Pc(227) byte[] local227 = this.aByteArray8;
					local43 = 0;
					if (this.aClass6_Sub1_Sub3_1 != null) {
						local227 = this.aClass6_Sub1_Sub3_1.aByteArray4;
						local43 = this.anInt500;
					}
					for (local59 = 0; local59 < this.anInt501; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt501 - local59)) {
					}
					if (this.anInt501 + this.anInt500 >= local227.length && this.aClass6_Sub1_Sub3_1 != null) {
						if (this.aClient3.aClass14Array1[0] != null) {
							this.aClient3.aClass14Array1[this.aClass6_Sub1_Sub3_1.anInt160 + 1].method118(local227.length, this.aClass6_Sub1_Sub3_1.anInt161, local227);
						}
						if (!this.aClass6_Sub1_Sub3_1.aBoolean53 && this.aClass6_Sub1_Sub3_1.anInt160 == 3) {
							this.aClass6_Sub1_Sub3_1.aBoolean53 = true;
							this.aClass6_Sub1_Sub3_1.anInt160 = 93;
						}
						if (this.aClass6_Sub1_Sub3_1.aBoolean53) {
							@Pc(320) Class5 local320 = this.aClass5_4;
							synchronized (this.aClass5_4) {
								this.aClass5_4.method30(this.aClass6_Sub1_Sub3_1);
							}
						} else {
							this.aClass6_Sub1_Sub3_1.method548();
						}
					}
					this.anInt501 = 0;
				}
			} catch (@Pc(341) IOException local341) {
				try {
					this.aSocket1.close();
				} catch (@Pc(346) Exception local346) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt501 = 0;
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("37909, " + -607 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "c", descriptor = "()Lclient!HEWLXUXO;")
	public Class6_Sub1_Sub3 method293() {
		@Pc(4) Class5 local4 = this.aClass5_4;
		@Pc(11) Class6_Sub1_Sub3 local11;
		synchronized (this.aClass5_4) {
			local11 = (Class6_Sub1_Sub3) this.aClass5_4.method32();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class24 local24 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			local11.method549();
		}
		if (local11.aByteArray4 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray4));
			while (true) {
				if (local41 == this.aByteArray10.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray10, local41, this.aByteArray10.length - local41);
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
			local11.aByteArray4[local93] = this.aByteArray10[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(IZ)I")
	public int method294(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray13[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("55162, " + arg0 + ", " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean138) {
				this.anInt507++;
				@Pc(11) byte local11 = 20;
				if (this.anInt498 == 0 && this.aClient3.aClass14Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean140 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean140; local32++) {
					this.aBoolean140 = false;
					this.method281();
					this.method280();
					if (this.anInt505 == 0 && local32 >= 5) {
						break;
					}
					this.method290();
					if (this.anInputStream1 != null) {
						this.method292();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class6_Sub1_Sub3 local72;
				for (local72 = (Class6_Sub1_Sub3) this.aClass5_3.method33(); local72 != null; local72 = (Class6_Sub1_Sub3) this.aClass5_3.method35((byte) 8)) {
					if (local72.aBoolean53) {
						local67 = true;
						local72.anInt162++;
						if (local72.anInt162 > 50) {
							local72.anInt162 = 0;
							this.method296(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class6_Sub1_Sub3) this.aClass5_3.method33(); local72 != null; local72 = (Class6_Sub1_Sub3) this.aClass5_3.method35((byte) 8)) {
						local67 = true;
						local72.anInt162++;
						if (local72.anInt162 > 50) {
							local72.anInt162 = 0;
							this.method296(local72);
						}
					}
				}
				if (local67) {
					this.anInt503++;
					if (this.anInt503 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt501 = 0;
					}
				} else {
					this.anInt503 = 0;
					this.aString7 = "";
				}
				if (this.aClient3.aBoolean243 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt498 > 0 || this.aClient3.aClass14Array1[0] == null)) {
					this.anInt509++;
					if (this.anInt509 > 500) {
						this.anInt509 = 0;
						this.aByteArray8[0] = 0;
						this.aByteArray8[1] = 0;
						this.aByteArray8[2] = 0;
						this.aByteArray8[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray8, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt503 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IB)Z")
	public boolean method295(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray136.length; local17++) {
				if (this.anIntArray134[local17] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("9603, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(Lclient!HEWLXUXO;I)V")
	private void method296(@OriginalArg(0) Class6_Sub1_Sub3 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(12) long local12 = System.currentTimeMillis();
					if (local12 - this.aLong20 < 4000L) {
						return;
					}
					this.aLong20 = local12;
					this.aSocket1 = this.aClient3.method588(client.anInt957 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(47) int local47 = 0; local47 < 8; local47++) {
						this.anInputStream1.read();
					}
					this.anInt503 = 0;
				}
				this.aByteArray8[0] = (byte) arg0.anInt160;
				this.aByteArray8[1] = (byte) (arg0.anInt161 >> 8);
				this.aByteArray8[2] = (byte) arg0.anInt161;
				if (arg0.aBoolean53) {
					this.aByteArray8[3] = 2;
				} else if (this.aClient3.aBoolean243) {
					this.aByteArray8[3] = 0;
				} else {
					this.aByteArray8[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray8, 0, 4);
				this.anInt509 = 0;
				this.anInt497 = -10000;
			} catch (@Pc(124) IOException local124) {
				try {
					this.aSocket1.close();
				} catch (@Pc(129) Exception local129) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt501 = 0;
				this.anInt497++;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("1138, " + arg0 + ", " + 7904 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(II[BI)Z")
	private boolean method297(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(49) int local49 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local49 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("16290, " + -532 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IIII)I")
	public int method298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray136.length; local7++) {
				if (this.anIntArray136[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray133[local7];
					}
					return this.anIntArray134[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("5972, " + arg0 + ", " + 208 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(ZI)I")
	public int method299(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray9[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("75651, " + true + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
