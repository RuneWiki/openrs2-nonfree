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

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "B")
	private byte aByte45 = 0;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt948 = 477;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32((byte) 8);

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(-822);

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(-822);

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(-822);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(-822);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(-822);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method629(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method659(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, (byte) 1);
			this.anIntArrayArray24[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray24[local22][local56] = local42.method475();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method659(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, (byte) 1);
			this.anIntArrayArray25[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray25[local36][local123] = local115.method478();
			}
		}
		local104 = arg0.method659("model_index", null);
		local56 = this.anIntArrayArray24[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method659("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, (byte) 1);
		local56 = local104.length / 7;
		this.anIntArray253 = new int[local56];
		this.anIntArray254 = new int[local56];
		this.anIntArray255 = new int[local56];
		this.anIntArray256 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray253[local216] = local193.method475();
			this.anIntArray254[local216] = local193.method475();
			this.anIntArray255[local216] = local193.method475();
			this.anIntArray256[local216] = local193.method473();
		}
		local104 = arg0.method659("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, (byte) 1);
		local56 = local104.length / 2;
		this.anIntArray257 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray257[local268] = local193.method475();
		}
		local104 = arg0.method659("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, (byte) 1);
		local56 = local104.length;
		this.anIntArray258 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray258[local300] = local193.method473();
		}
		this.aClient2 = arg1;
		this.aBoolean227 = true;
		this.aClient2.method94(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method630() {
		this.aBoolean227 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				this.aBoolean226 = !this.aBoolean226;
			}
			return this.anIntArrayArray24[arg1].length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("38724, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method632() {
		try {
			return this.anIntArray257.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("92738, " + 836 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZI)I")
	public int method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg2;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray253.length; local7++) {
				if (this.anIntArray253[local7] == local5) {
					if (arg0 == 0) {
						return this.anIntArray254[local7];
					}
					return this.anIntArray255[local7];
				}
			}
			return -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("5191, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public void method634(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anIntArray253.length;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				if (arg0 || this.anIntArray256[local8] != 0) {
					this.method641(this.anIntArray255[local8], 3, (byte) 2);
					this.method641(this.anIntArray254[local8], 3, (byte) 2);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("12508, " + arg0 + ", " + -515 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public boolean method635(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray253.length; local16++) {
				if (this.anIntArray255[local16] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("8575, " + arg0 + ", " + 1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public int method636(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("95098, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Z")
	public boolean method637(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray258[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("45946, " + arg0 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method628(@OriginalArg(0) int arg0) {
		this.method638(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	public void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method511(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method512(this.aByte45)) {
				if (local34.anInt770 == arg0 && local34.anInt771 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt770 = arg0;
			local34.anInt771 = arg1;
			local34.aBoolean190 = true;
			@Pc(72) Class29 local72 = this.aClass29_8;
			synchronized (this.aClass29_8) {
				this.aClass29_8.method501(local34);
			}
			this.aClass32_2.method509(local34);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
	public int method639() {
		@Pc(2) Class32 local2 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			return this.aClass32_2.method513();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!mb;")
	public Class1_Sub1_Sub4 method640() {
		@Pc(4) Class29 local4 = this.aClass29_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass29_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass29_11.method503();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class32 local24 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			local11.method668();
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIB)V")
	public void method641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && this.anIntArrayArray24[arg1][arg0] != 0) {
				@Pc(35) byte[] local35 = this.aClient2.aClass45Array1[arg1 + 1].method651((byte) 2, arg0);
				if (!this.method648(this.anIntArrayArray25[arg1][arg0], this.anIntArrayArray24[arg1][arg0], local35)) {
					this.aByteArrayArray5[arg1][arg0] = arg2;
					if (arg2 > this.anInt949) {
						this.anInt949 = arg2;
					}
					this.anInt953++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("14424, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method642() {
		try {
			@Pc(13) Class29 local13 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method508();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("19673, " + 41 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt949 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt770 = arg0;
				local30.anInt771 = arg1;
				local30.aBoolean190 = false;
				@Pc(42) Class29 local42 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method501(local30);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("36466, " + -21322 + ", " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean227) {
				this.anInt959++;
				@Pc(11) byte local11 = 20;
				if (this.anInt949 == 0 && this.aClient2.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean228 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean228; local32++) {
					this.aBoolean228 = false;
					this.method644((byte) 7);
					this.method645();
					if (this.anInt950 == 0 && local32 >= 5) {
						break;
					}
					this.method646();
					if (this.anInputStream2 != null) {
						this.method647();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method504(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method506(this.aByte45)) {
					if (local72.aBoolean190) {
						local67 = true;
						local72.anInt772++;
						if (local72.anInt772 > 50) {
							local72.anInt772 = 0;
							this.method649(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method504(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method506(this.aByte45)) {
						local67 = true;
						local72.anInt772++;
						if (local72.anInt772 > 50) {
							local72.anInt772 = 0;
							this.method649(local72);
						}
					}
				}
				if (local67) {
					this.anInt957++;
					if (this.anInt957 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt956 = 0;
					}
				} else {
					this.anInt957 = 0;
					this.aString30 = "";
				}
				if (this.aClient2.aBoolean51 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt949 > 0 || this.aClient2.aClass45Array1[0] == null)) {
					this.anInt958++;
					if (this.anInt958 > 500) {
						this.anInt958 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt957 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method644(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) Class29 local12 = this.aClass29_8;
			@Pc(19) Class1_Sub1_Sub4 local19;
			synchronized (this.aClass29_8) {
				local19 = (Class1_Sub1_Sub4) this.aClass29_8.method503();
			}
			while (local19 != null) {
				this.aBoolean228 = true;
				@Pc(30) byte[] local30 = null;
				if (this.aClient2.aClass45Array1[0] != null) {
					local30 = this.aClient2.aClass45Array1[local19.anInt770 + 1].method651((byte) 2, local19.anInt771);
				}
				if (!this.method648(this.anIntArrayArray25[local19.anInt770][local19.anInt771], this.anIntArrayArray24[local19.anInt770][local19.anInt771], local30)) {
					local30 = null;
				}
				@Pc(75) Class29 local75 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local30 == null) {
						this.aClass29_9.method501(local19);
					} else {
						local19.aByteArray10 = local30;
						@Pc(91) Class29 local91 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method501(local19);
						}
					}
					local19 = (Class1_Sub1_Sub4) this.aClass29_8.method503();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("54948, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	private void method645() {
		try {
			this.anInt950 = 0;
			this.anInt951 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass29_10.method504(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass29_10.method506(this.aByte45)) {
				if (local12.aBoolean190) {
					this.anInt950++;
				} else {
					this.anInt951++;
				}
			}
			while (this.anInt950 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass29_9.method503();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray5[local12.anInt770][local12.anInt771] != 0) {
					this.anInt952++;
				}
				this.aByteArrayArray5[local12.anInt770][local12.anInt771] = 0;
				this.aClass29_10.method501(local12);
				this.anInt950++;
				this.method649(local12);
				this.aBoolean228 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("30756, " + false + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method646() {
		try {
			while (this.anInt950 == 0) {
				if (this.anInt951 >= 10 || this.anInt949 == 0) {
					return;
				}
				@Pc(10) Class29 local10 = this.aClass29_12;
				@Pc(17) Class1_Sub1_Sub4 local17;
				synchronized (this.aClass29_12) {
					local17 = (Class1_Sub1_Sub4) this.aClass29_12.method503();
				}
				while (local17 != null) {
					if (this.aByteArrayArray5[local17.anInt770][local17.anInt771] != 0) {
						this.aByteArrayArray5[local17.anInt770][local17.anInt771] = 0;
						this.aClass29_10.method501(local17);
						this.method649(local17);
						this.aBoolean228 = true;
						if (this.anInt952 < this.anInt953) {
							this.anInt952++;
						}
						this.aString30 = "Loading extra files - " + this.anInt952 * 100 / this.anInt953 + "%";
						this.anInt951++;
						if (this.anInt951 == 10) {
							return;
						}
					}
					local10 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local17 = (Class1_Sub1_Sub4) this.aClass29_12.method503();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray5[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt949) {
							local118[local123] = 0;
							local17 = new Class1_Sub1_Sub4();
							local17.anInt770 = local111;
							local17.anInt771 = local123;
							local17.aBoolean190 = false;
							this.aClass29_10.method501(local17);
							this.method649(local17);
							this.aBoolean228 = true;
							if (this.anInt952 < this.anInt953) {
								this.anInt952++;
							}
							this.aString30 = "Loading extra files - " + this.anInt952 * 100 / this.anInt953 + "%";
							this.anInt951++;
							if (this.anInt951 == 10) {
								return;
							}
						}
					}
				}
				this.anInt949--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("27445, " + 0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method647() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream2.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt956 == 0 && local8 >= 6) {
					this.aBoolean228 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream2.read(this.aByteArray18, local19, 6 - local19)) {
					}
					local43 = this.aByteArray18[0] & 0xFF;
					local59 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(90) Class1_Sub1_Sub4 local90 = (Class1_Sub1_Sub4) this.aClass29_10.method504(); local90 != null; local90 = (Class1_Sub1_Sub4) this.aClass29_10.method506(this.aByte45)) {
						if (local90.anInt770 == local43 && local90.anInt771 == local59) {
							this.aClass1_Sub1_Sub4_1 = local90;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local90.anInt772 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt957 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean190) {
								@Pc(149) Class29 local149 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method501(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method667();
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
					this.anInt955 = local82 * 500;
					this.anInt956 = 500;
					if (this.anInt956 > local75 - local82 * 500) {
						this.anInt956 = local75 - local82 * 500;
					}
				}
				if (this.anInt956 > 0 && local8 >= this.anInt956) {
					this.aBoolean228 = true;
					@Pc(228) byte[] local228 = this.aByteArray18;
					local43 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local228 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local43 = this.anInt955;
					}
					for (local59 = 0; local59 < this.anInt956; local59 += this.anInputStream2.read(local228, local59 + local43, this.anInt956 - local59)) {
					}
					if (this.anInt956 + this.anInt955 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass45Array1[0] != null) {
							this.aClient2.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt770 + 1].method652(local228.length, this.aClass1_Sub1_Sub4_1.anInt771, local228, (byte) 8);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean190 && this.aClass1_Sub1_Sub4_1.anInt770 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean190 = true;
							this.aClass1_Sub1_Sub4_1.anInt770 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean190) {
							@Pc(321) Class29 local321 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method501(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method667();
						}
					}
					this.anInt956 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket3.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt956 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("96850, " + -194 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII[B)Z")
	private boolean method648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg2, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local52 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("13433, " + 103 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;I)V")
	private void method649(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket3 == null) {
					@Pc(16) long local16 = System.currentTimeMillis();
					if (local16 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local16;
					this.aSocket3 = this.aClient2.method154(client.anInt405 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
						this.anInputStream2.read();
					}
					this.anInt957 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt770;
				this.aByteArray18[1] = (byte) (arg0.anInt771 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt771;
				if (arg0.aBoolean190) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean51) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt958 = 0;
				this.anInt954 = -10000;
			} catch (@Pc(128) IOException local128) {
				try {
					this.aSocket3.close();
				} catch (@Pc(133) Exception local133) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt956 = 0;
				this.anInt954++;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("39941, " + arg0 + ", " + 295 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
