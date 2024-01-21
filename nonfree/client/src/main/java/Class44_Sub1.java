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

@OriginalClass("client!ub")
public final class Class44_Sub1 extends Class44 implements Runnable {

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt950 = 131;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt951 = 2;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	private int anInt952 = 964;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "B")
	private byte aByte31 = 50;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "B")
	private byte aByte32 = -126;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(true);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(6);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(6);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(6);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(6);

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(6);

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method636(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method666(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, -26728);
			this.anIntArrayArray24[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray24[local22][local56] = local42.method482();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method666(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, -26728);
			this.anIntArrayArray25[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray25[local36][local123] = local115.method485();
			}
		}
		local104 = arg0.method666("model_index", null);
		local56 = this.anIntArrayArray24[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method666("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, -26728);
		local56 = local104.length / 7;
		this.anIntArray256 = new int[local56];
		this.anIntArray257 = new int[local56];
		this.anIntArray258 = new int[local56];
		this.anIntArray259 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray256[local216] = local193.method482();
			this.anIntArray257[local216] = local193.method482();
			this.anIntArray258[local216] = local193.method482();
			this.anIntArray259[local216] = local193.method480();
		}
		local104 = arg0.method666("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, -26728);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, -26728);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean230 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public int method638(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("29294, " + arg0 + ", " + -73 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method639() {
		try {
			return this.anIntArray260.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("49643, " + -1919 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
	public int method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) int local5 = (arg3 << 8) + arg0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray256.length; local11++) {
				if (this.anIntArray256[local11] == local5) {
					if (arg2 == 0) {
						return this.anIntArray257[local11];
					}
					return this.anIntArray258[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("85207, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
	public void method641(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray256.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray259[local16] != 0) {
					this.method648((byte) 2, this.anIntArray258[local16], 3);
					this.method648((byte) 2, this.anIntArray257[local16], 3);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("43094, " + -34 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
	public boolean method642(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray256.length; local14++) {
				if (this.anIntArray258[local14] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("47003, " + arg0 + ", " + -640 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
	public int method643(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("88467, " + arg0 + ", " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)Z")
	public boolean method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return this.anIntArray261[arg1] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("27309, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method635(@OriginalArg(0) int arg0) {
		this.method645(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)V")
	public void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method518(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method519()) {
				if (local34.anInt770 == arg0 && local34.anInt771 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt770 = arg0;
			local34.anInt771 = arg1;
			local34.aBoolean195 = true;
			@Pc(71) Class29 local71 = this.aClass29_8;
			synchronized (this.aClass29_8) {
				this.aClass29_8.method508(local34);
			}
			this.aClass32_2.method516(local34);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
	public int method646() {
		@Pc(2) Class32 local2 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			return this.aClass32_2.method520();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!mb;")
	public Class1_Sub1_Sub4 method647() {
		@Pc(4) Class29 local4 = this.aClass29_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass29_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass29_11.method510();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class32 local24 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			local11.method674();
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIII)V")
	public void method648(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg2][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass45Array1[arg2 + 1].method658(arg1);
				if (!this.method655(local25, this.anIntArrayArray25[arg2][arg1], this.anIntArrayArray24[arg2][arg1])) {
					this.aByteArrayArray5[arg2][arg1] = arg0;
					if (arg0 > this.anInt954) {
						this.anInt954 = arg0;
					}
					this.anInt958++;
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("30397, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method649() {
		try {
			@Pc(2) Class29 local2 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("61381, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt954 != 0))) {
				@Pc(41) Class1_Sub1_Sub4 local41 = new Class1_Sub1_Sub4();
				local41.anInt770 = arg0;
				local41.anInt771 = arg1;
				local41.aBoolean195 = false;
				@Pc(53) Class29 local53 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local41);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("63289, " + arg0 + ", " + 47179 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean230) {
				this.anInt964++;
				@Pc(11) byte local11 = 20;
				if (this.anInt954 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean231 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean231; local32++) {
					this.aBoolean231 = false;
					this.method651((byte) 2);
					this.method652();
					if (this.anInt955 == 0 && local32 >= 5) {
						break;
					}
					this.method653();
					if (this.anInputStream2 != null) {
						this.method654(this.anInt953);
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class1_Sub1_Sub4 local73;
				for (local73 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
					if (local73.aBoolean195) {
						local68 = true;
						local73.anInt772++;
						if (local73.anInt772 > 50) {
							local73.anInt772 = 0;
							this.method656(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local68 = true;
						local73.anInt772++;
						if (local73.anInt772 > 50) {
							local73.anInt772 = 0;
							this.method656(local73);
						}
					}
				}
				if (local68) {
					this.anInt962++;
					if (this.anInt962 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt961 = 0;
					}
				} else {
					this.anInt962 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean54 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt954 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt963++;
					if (this.anInt963 > 500) {
						this.anInt963 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt962 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method651(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) Class29 local18 = this.aClass29_8;
			@Pc(25) Class1_Sub1_Sub4 local25;
			synchronized (this.aClass29_8) {
				local25 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
			}
			while (local25 != null) {
				this.aBoolean231 = true;
				@Pc(36) byte[] local36 = null;
				if (this.aClient5.aClass45Array1[0] != null) {
					local36 = this.aClient5.aClass45Array1[local25.anInt770 + 1].method658(local25.anInt771);
				}
				if (!this.method655(local36, this.anIntArrayArray25[local25.anInt770][local25.anInt771], this.anIntArrayArray24[local25.anInt770][local25.anInt771])) {
					local36 = null;
				}
				@Pc(81) Class29 local81 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local36 == null) {
						this.aClass29_9.method508(local25);
					} else {
						local25.aByteArray10 = local36;
						@Pc(97) Class29 local97 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method508(local25);
						}
					}
					local25 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("15401, " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method652() {
		try {
			this.anInt955 = 0;
			this.anInt956 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
				if (local12.aBoolean195) {
					this.anInt955++;
				} else {
					this.anInt956++;
				}
			}
			while (this.anInt955 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray5[local12.anInt770][local12.anInt771] != 0) {
					this.anInt957++;
				}
				this.aByteArrayArray5[local12.anInt770][local12.anInt771] = 0;
				this.aClass29_10.method508(local12);
				this.anInt955++;
				this.method656(local12);
				this.aBoolean231 = true;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("56140, " + 0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method653() {
		try {
			while (this.anInt955 == 0) {
				if (this.anInt956 >= 10 || this.anInt954 == 0) {
					return;
				}
				@Pc(18) Class29 local18 = this.aClass29_12;
				@Pc(25) Class1_Sub1_Sub4 local25;
				synchronized (this.aClass29_12) {
					local25 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local25 != null) {
					if (this.aByteArrayArray5[local25.anInt770][local25.anInt771] != 0) {
						this.aByteArrayArray5[local25.anInt770][local25.anInt771] = 0;
						this.aClass29_10.method508(local25);
						this.method656(local25);
						this.aBoolean231 = true;
						if (this.anInt957 < this.anInt958) {
							this.anInt957++;
						}
						this.aString30 = "Loading extra files - " + this.anInt957 * 100 / this.anInt958 + "%";
						this.anInt956++;
						if (this.anInt956 == 10) {
							return;
						}
					}
					local18 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local25 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
					}
				}
				for (@Pc(119) int local119 = 0; local119 < 4; local119++) {
					@Pc(126) byte[] local126 = this.aByteArrayArray5[local119];
					@Pc(129) int local129 = local126.length;
					for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
						if (local126[local131] == this.anInt954) {
							local126[local131] = 0;
							local25 = new Class1_Sub1_Sub4();
							local25.anInt770 = local119;
							local25.anInt771 = local131;
							local25.aBoolean195 = false;
							this.aClass29_10.method508(local25);
							this.method656(local25);
							this.aBoolean231 = true;
							if (this.anInt957 < this.anInt958) {
								this.anInt957++;
							}
							this.aString30 = "Loading extra files - " + this.anInt957 * 100 / this.anInt958 + "%";
							this.anInt956++;
							if (this.anInt956 == 10) {
								return;
							}
						}
					}
				}
				this.anInt954--;
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("34712, " + 964 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	private void method654(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				try {
					@Pc(8) int local8 = this.anInputStream2.available();
					@Pc(43) int local43;
					@Pc(59) int local59;
					if (this.anInt961 == 0 && local8 >= 6) {
						this.aBoolean231 = true;
						for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream2.read(this.aByteArray18, local19, 6 - local19)) {
						}
						local43 = this.aByteArray18[0] & 0xFF;
						local59 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
						@Pc(75) int local75 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
						@Pc(82) int local82 = this.aByteArray18[5] & 0xFF;
						this.aClass1_Sub1_Sub4_1 = null;
						for (@Pc(90) Class1_Sub1_Sub4 local90 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local90 != null; local90 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
							if (local90.anInt770 == local43 && local90.anInt771 == local59) {
								this.aClass1_Sub1_Sub4_1 = local90;
							}
							if (this.aClass1_Sub1_Sub4_1 != null) {
								local90.anInt772 = 0;
							}
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							this.anInt962 = 0;
							if (local75 == 0) {
								signlink.reporterror("Rej: " + local43 + "," + local59);
								this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
								if (this.aClass1_Sub1_Sub4_1.aBoolean195) {
									@Pc(148) Class29 local148 = this.aClass29_11;
									synchronized (this.aClass29_11) {
										this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
									}
								} else {
									this.aClass1_Sub1_Sub4_1.method673();
								}
								this.aClass1_Sub1_Sub4_1 = null;
							} else {
								if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local82 == 0) {
									this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local75];
								}
								if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local82 != 0) {
									throw new IOException("missing start of file");
								}
							}
						}
						this.anInt960 = local82 * 500;
						this.anInt961 = 500;
						if (this.anInt961 > local75 - local82 * 500) {
							this.anInt961 = local75 - local82 * 500;
						}
					}
					if (this.anInt961 > 0 && local8 >= this.anInt961) {
						this.aBoolean231 = true;
						@Pc(227) byte[] local227 = this.aByteArray18;
						local43 = 0;
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local227 = this.aClass1_Sub1_Sub4_1.aByteArray10;
							local43 = this.anInt960;
						}
						for (local59 = 0; local59 < this.anInt961; local59 += this.anInputStream2.read(local227, local59 + local43, this.anInt961 - local59)) {
						}
						if (this.anInt961 + this.anInt960 >= local227.length && this.aClass1_Sub1_Sub4_1 != null) {
							if (this.aClient5.aClass45Array1[0] != null) {
								this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt770 + 1].method659(local227, this.aClass1_Sub1_Sub4_1.anInt771, local227.length);
							}
							if (!this.aClass1_Sub1_Sub4_1.aBoolean195 && this.aClass1_Sub1_Sub4_1.anInt770 == 3) {
								this.aClass1_Sub1_Sub4_1.aBoolean195 = true;
								this.aClass1_Sub1_Sub4_1.anInt770 = 93;
							}
							if (this.aClass1_Sub1_Sub4_1.aBoolean195) {
								@Pc(320) Class29 local320 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method673();
							}
						}
						this.anInt961 = 0;
					}
				} catch (@Pc(341) IOException local341) {
					try {
						this.aSocket3.close();
					} catch (@Pc(346) Exception local346) {
					}
					this.aSocket3 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt961 = 0;
				}
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("92613, " + arg0 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BBII)Z")
	private boolean method655(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			@Pc(37) int local37;
			if (this.aByte31 != 50) {
				for (local37 = 1; local37 > 0; local37++) {
				}
			}
			this.aCRC32_2.update(arg0, 0, local12);
			local37 = (int) this.aCRC32_2.getValue();
			if (local28 == arg2) {
				return local37 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("99655, " + arg0 + ", " + 50 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method656(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			if (this.aByte32 == -126) {
				try {
					if (this.aSocket3 == null) {
						@Pc(11) long local11 = System.currentTimeMillis();
						if (local11 - this.aLong31 < 4000L) {
							return;
						}
						this.aLong31 = local11;
						this.aSocket3 = this.aClient5.method230(client.anInt348 + 43594);
						this.anInputStream2 = this.aSocket3.getInputStream();
						this.anOutputStream2 = this.aSocket3.getOutputStream();
						this.anOutputStream2.write(15);
						for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
							this.anInputStream2.read();
						}
						this.anInt962 = 0;
					}
					this.aByteArray18[0] = (byte) arg0.anInt770;
					this.aByteArray18[1] = (byte) (arg0.anInt771 >> 8);
					this.aByteArray18[2] = (byte) arg0.anInt771;
					if (arg0.aBoolean195) {
						this.aByteArray18[3] = 2;
					} else if (this.aClient5.aBoolean54) {
						this.aByteArray18[3] = 0;
					} else {
						this.aByteArray18[3] = 1;
					}
					this.anOutputStream2.write(this.aByteArray18, 0, 4);
					this.anInt963 = 0;
					this.anInt959 = -10000;
				} catch (@Pc(123) IOException local123) {
					try {
						this.aSocket3.close();
					} catch (@Pc(128) Exception local128) {
					}
					this.aSocket3 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt961 = 0;
					this.anInt959++;
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("22553, " + arg0 + ", " + -126 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
