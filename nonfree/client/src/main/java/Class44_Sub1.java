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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private static boolean aBoolean244;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt938 = 749;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt940 = 633;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(-5693);

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(-794);

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(-794);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(-794);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(-794);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(-794);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method636(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method666(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, aBoolean244);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, aBoolean244);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, aBoolean244);
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
		local193 = new Class1_Sub1_Sub3(local104, aBoolean244);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, aBoolean244);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean246 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean246 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method638(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("19201, " + 2136 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method639() {
		try {
			return this.anIntArray260.length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("1211, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
	public int method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg1;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray256.length; local12++) {
				if (this.anIntArray256[local12] == local5) {
					if (arg0 == 0) {
						return this.anIntArray257[local12];
					}
					return this.anIntArray258[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("26111, " + arg0 + ", " + arg1 + ", " + -28157 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public void method641(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray256.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray259[local16] != 0) {
					this.method648(349, (byte) 2, 3, this.anIntArray258[local16]);
					this.method648(349, (byte) 2, 3, this.anIntArray257[local16]);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("3707, " + 0 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)Z")
	public boolean method642(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray256.length; local1++) {
				if (this.anIntArray258[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("50046, " + 9 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
	public int method643(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("69952, " + arg0 + ", " + 3 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Z")
	public boolean method644(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return this.anIntArray261[arg1] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("87090, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method635(@OriginalArg(0) int arg0) {
		this.method645(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	public void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method518(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method519()) {
				if (local34.anInt761 == arg0 && local34.anInt762 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt761 = arg0;
			local34.anInt762 = arg1;
			local34.aBoolean207 = true;
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBII)V")
	public void method648(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg2][arg3] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass45Array1[arg2 + 1].method658(arg3);
				@Pc(29) boolean local29 = false;
				if (!this.method655((byte) 3, this.anIntArrayArray25[arg2][arg3], local25, this.anIntArrayArray24[arg2][arg3])) {
					this.aByteArrayArray5[arg2][arg3] = arg1;
					if (arg1 > this.anInt941) {
						this.anInt941 = arg1;
					}
					this.anInt945++;
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("24898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public void method649() {
		try {
			@Pc(11) Class29 local11 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("99553, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg1][arg0] != 0 && (this.aByteArrayArray5[arg1][arg0] != 0 && this.anInt941 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt761 = arg1;
				local30.anInt762 = arg0;
				local30.aBoolean207 = false;
				@Pc(42) Class29 local42 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local30);
				}
				if (this.anInt940 == 633) {
					;
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("77367, " + 633 + ", " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean246) {
				this.anInt951++;
				@Pc(11) byte local11 = 20;
				if (this.anInt941 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean247 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean247; local32++) {
					this.aBoolean247 = false;
					this.method651();
					this.method652();
					if (this.anInt942 == 0 && local32 >= 5) {
						break;
					}
					this.method653();
					if (this.anInputStream2 != null) {
						this.method654();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
					if (local72.aBoolean207) {
						local67 = true;
						local72.anInt763++;
						if (local72.anInt763 > 50) {
							local72.anInt763 = 0;
							this.method656(local72, this.aBoolean245);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local67 = true;
						local72.anInt763++;
						if (local72.anInt763 > 50) {
							local72.anInt763 = 0;
							this.method656(local72, this.aBoolean245);
						}
					}
				}
				if (local67) {
					this.anInt949++;
					if (this.anInt949 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt948 = 0;
					}
				} else {
					this.anInt949 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean48 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt941 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt950++;
					if (this.anInt950 > 500) {
						this.anInt950 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt949 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method651() {
		try {
			@Pc(15) Class29 local15 = this.aClass29_8;
			@Pc(22) Class1_Sub1_Sub4 local22;
			synchronized (this.aClass29_8) {
				local22 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
			}
			while (local22 != null) {
				this.aBoolean247 = true;
				@Pc(33) byte[] local33 = null;
				if (this.aClient5.aClass45Array1[0] != null) {
					local33 = this.aClient5.aClass45Array1[local22.anInt761 + 1].method658(local22.anInt762);
				}
				if (!this.method655((byte) 3, this.anIntArrayArray25[local22.anInt761][local22.anInt762], local33, this.anIntArrayArray24[local22.anInt761][local22.anInt762])) {
					local33 = null;
				}
				@Pc(78) Class29 local78 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local33 == null) {
						this.aClass29_9.method508(local22);
					} else {
						local22.aByteArray10 = local33;
						@Pc(94) Class29 local94 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method508(local22);
						}
					}
					local22 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("97191, " + -225 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method652() {
		try {
			this.anInt942 = 0;
			this.anInt943 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
				if (local12.aBoolean207) {
					this.anInt942++;
				} else {
					this.anInt943++;
				}
			}
			while (this.anInt942 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray5[local12.anInt761][local12.anInt762] != 0) {
					this.anInt944++;
				}
				this.aByteArrayArray5[local12.anInt761][local12.anInt762] = 0;
				this.aClass29_10.method508(local12);
				this.anInt942++;
				this.method656(local12, this.aBoolean245);
				this.aBoolean247 = true;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("47864, " + 41 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method653() {
		try {
			while (this.anInt942 == 0) {
				if (this.anInt943 >= 10 || this.anInt941 == 0) {
					return;
				}
				@Pc(19) Class29 local19 = this.aClass29_12;
				@Pc(26) Class1_Sub1_Sub4 local26;
				synchronized (this.aClass29_12) {
					local26 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local26 != null) {
					if (this.aByteArrayArray5[local26.anInt761][local26.anInt762] != 0) {
						this.aByteArrayArray5[local26.anInt761][local26.anInt762] = 0;
						this.aClass29_10.method508(local26);
						this.method656(local26, this.aBoolean245);
						this.aBoolean247 = true;
						if (this.anInt944 < this.anInt945) {
							this.anInt944++;
						}
						this.aString30 = "Loading extra files - " + this.anInt944 * 100 / this.anInt945 + "%";
						this.anInt943++;
						if (this.anInt943 == 10) {
							return;
						}
					}
					local19 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local26 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
					}
				}
				for (@Pc(121) int local121 = 0; local121 < 4; local121++) {
					@Pc(128) byte[] local128 = this.aByteArrayArray5[local121];
					@Pc(131) int local131 = local128.length;
					for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
						if (local128[local133] == this.anInt941) {
							local128[local133] = 0;
							local26 = new Class1_Sub1_Sub4();
							local26.anInt761 = local121;
							local26.anInt762 = local133;
							local26.aBoolean207 = false;
							this.aClass29_10.method508(local26);
							this.method656(local26, this.aBoolean245);
							this.aBoolean247 = true;
							if (this.anInt944 < this.anInt945) {
								this.anInt944++;
							}
							this.aString30 = "Loading extra files - " + this.anInt944 * 100 / this.anInt945 + "%";
							this.anInt943++;
							if (this.anInt943 == 10) {
								return;
							}
						}
					}
				}
				this.anInt941--;
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("15683, " + -715 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method654() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt948 == 0 && local9 >= 6) {
					this.aBoolean247 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
					}
					local44 = this.aByteArray18[0] & 0xFF;
					local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						if (local91.anInt761 == local44 && local91.anInt762 == local60) {
							this.aClass1_Sub1_Sub4_1 = local91;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local91.anInt763 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt949 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean207) {
								@Pc(149) Class29 local149 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method673();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local83 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local76];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local83 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt947 = local83 * 500;
					this.anInt948 = 500;
					if (this.anInt948 > local76 - local83 * 500) {
						this.anInt948 = local76 - local83 * 500;
					}
				}
				if (this.anInt948 > 0 && local9 >= this.anInt948) {
					this.aBoolean247 = true;
					@Pc(228) byte[] local228 = this.aByteArray18;
					local44 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local228 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local44 = this.anInt947;
					}
					for (local60 = 0; local60 < this.anInt948; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt948 - local60)) {
					}
					if (this.anInt948 + this.anInt947 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass45Array1[0] != null) {
							this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt761 + 1].method659(local228.length, this.aClass1_Sub1_Sub4_1.anInt762, local228);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean207 && this.aClass1_Sub1_Sub4_1.anInt761 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean207 = true;
							this.aClass1_Sub1_Sub4_1.anInt761 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean207) {
							@Pc(321) Class29 local321 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method673();
						}
					}
					this.anInt948 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket3.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt948 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("78073, " + -21071 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI[BI)Z")
	private boolean method655(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(14) int local14 = arg2.length - 2;
			@Pc(30) int local30 = ((arg2[local14] & 0xFF) << 8) + (arg2[local14 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg2, 0, local14);
			@Pc(44) int local44 = (int) this.aCRC32_2.getValue();
			@Pc(49) boolean local49 = false;
			if (local30 == arg3) {
				return local44 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("98045, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;Z)V")
	private void method656(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			try {
				if (this.aSocket3 == null) {
					@Pc(15) long local15 = System.currentTimeMillis();
					if (local15 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local15;
					this.aSocket3 = this.aClient5.method153(client.anInt283 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(50) int local50 = 0; local50 < 8; local50++) {
						this.anInputStream2.read();
					}
					this.anInt949 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt761;
				this.aByteArray18[1] = (byte) (arg0.anInt762 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt762;
				if (arg0.aBoolean207) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean48) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt950 = 0;
				this.anInt946 = -10000;
			} catch (@Pc(127) IOException local127) {
				try {
					this.aSocket3.close();
				} catch (@Pc(132) Exception local132) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt948 = 0;
				this.anInt946++;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("36564, " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
