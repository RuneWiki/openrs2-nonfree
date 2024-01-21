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

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	private int anInt927;

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
	private int anInt928;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public int anInt932;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
	public int anInt937;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt924 = 545;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt925 = 722;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	private boolean aBoolean245 = true;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "B")
	private byte aByte38 = 57;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	private boolean aBoolean248 = true;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32((byte) 5);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(-16188);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(-16188);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(-16188);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(-16188);

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(-16188);

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
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, (byte) -93);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, (byte) -93);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, (byte) -93);
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
		local193 = new Class1_Sub1_Sub3(local104, (byte) -93);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, (byte) -93);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean248 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method638(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("674, " + arg0 + ", " + 16993 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method639() {
		try {
			return this.anIntArray260.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("25744, " + -436 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZII)I")
	public int method640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg1;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray256.length; local11++) {
				if (this.anIntArray256[local11] == local5) {
					if (arg0 == 0) {
						return this.anIntArray257[local11];
					}
					return this.anIntArray258[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("98759, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public void method641(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(8) int local8 = this.anIntArray256.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				if (arg0 || this.anIntArray259[local10] != 0) {
					this.method648((byte) 2, 3, this.aBoolean245, this.anIntArray258[local10]);
					this.method648((byte) 2, 3, this.aBoolean245, this.anIntArray257[local10]);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("25517, " + 0 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Z")
	public boolean method642(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray256.length; local7++) {
				if (this.anIntArray258[local7] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("71639, " + true + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
	public int method643(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("86658, " + 3 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IZ)Z")
	public boolean method644(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray261[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("55178, " + arg0 + ", " + true + ", " + local15.toString());
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
				if (local34.anInt749 == arg0 && local34.anInt750 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt749 = arg0;
			local34.anInt750 = arg1;
			local34.aBoolean206 = true;
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIZI)V")
	public void method648(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg1][arg3] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass45Array1[arg1 + 1].method658(arg3);
				if (!this.method655(this.anIntArrayArray25[arg1][arg3], this.anIntArrayArray24[arg1][arg3], this.anInt926, local25)) {
					this.aByteArrayArray5[arg1][arg3] = arg0;
					if (!arg2) {
						this.anInt925 = -93;
					}
					if (arg0 > this.anInt927) {
						this.anInt927 = arg0;
					}
					this.anInt931++;
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("36303, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method649() {
		try {
			@Pc(6) Class29 local6 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("51695, " + -75 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg1][arg0] != 0 && (this.aByteArrayArray5[arg1][arg0] != 0 && this.anInt927 != 0))) {
				@Pc(36) Class1_Sub1_Sub4 local36 = new Class1_Sub1_Sub4();
				local36.anInt749 = arg1;
				local36.anInt750 = arg0;
				local36.aBoolean206 = false;
				@Pc(48) Class29 local48 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local36);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("17247, " + arg0 + ", " + -43609 + ", " + arg1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean248) {
				this.anInt937++;
				@Pc(11) byte local11 = 20;
				if (this.anInt927 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean249 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean249; local32++) {
					this.aBoolean249 = false;
					this.method651(this.aByte38);
					this.method652(this.aBoolean246);
					if (this.anInt928 == 0 && local32 >= 5) {
						break;
					}
					this.method653();
					if (this.anInputStream2 != null) {
						this.method654();
					}
				}
				@Pc(69) boolean local69 = false;
				@Pc(74) Class1_Sub1_Sub4 local74;
				for (local74 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local74 != null; local74 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
					if (local74.aBoolean206) {
						local69 = true;
						local74.anInt751++;
						if (local74.anInt751 > 50) {
							local74.anInt751 = 0;
							this.method656(local74);
						}
					}
				}
				if (!local69) {
					for (local74 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local74 != null; local74 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local69 = true;
						local74.anInt751++;
						if (local74.anInt751 > 50) {
							local74.anInt751 = 0;
							this.method656(local74);
						}
					}
				}
				if (local69) {
					this.anInt935++;
					if (this.anInt935 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt934 = 0;
					}
				} else {
					this.anInt935 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean89 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt927 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt936++;
					if (this.anInt936 > 500) {
						this.anInt936 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt935 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method651(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 57) {
				@Pc(6) Class29 local6 = this.aClass29_8;
				@Pc(13) Class1_Sub1_Sub4 local13;
				synchronized (this.aClass29_8) {
					local13 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
				while (local13 != null) {
					this.aBoolean249 = true;
					@Pc(24) byte[] local24 = null;
					if (this.aClient5.aClass45Array1[0] != null) {
						local24 = this.aClient5.aClass45Array1[local13.anInt749 + 1].method658(local13.anInt750);
					}
					if (!this.method655(this.anIntArrayArray25[local13.anInt749][local13.anInt750], this.anIntArrayArray24[local13.anInt749][local13.anInt750], this.anInt926, local24)) {
						local24 = null;
					}
					@Pc(70) Class29 local70 = this.aClass29_8;
					synchronized (this.aClass29_8) {
						if (local24 == null) {
							this.aClass29_9.method508(local13);
						} else {
							local13.aByteArray10 = local24;
							@Pc(86) Class29 local86 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(local13);
							}
						}
						local13 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("74662, " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	private void method652(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt928 = 0;
			this.anInt929 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12 = (Class1_Sub1_Sub4) this.aClass29_10.method511();
			if (arg0) {
				for (@Pc(16) int local16 = 1; local16 > 0; local16++) {
				}
			}
			while (local12 != null) {
				if (local12.aBoolean206) {
					this.anInt928++;
				} else {
					this.anInt929++;
				}
				local12 = (Class1_Sub1_Sub4) this.aClass29_10.method513();
			}
			while (this.anInt928 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray5[local12.anInt749][local12.anInt750] != 0) {
					this.anInt930++;
				}
				this.aByteArrayArray5[local12.anInt749][local12.anInt750] = 0;
				this.aClass29_10.method508(local12);
				this.anInt928++;
				this.method656(local12);
				this.aBoolean249 = true;
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("68183, " + arg0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method653() {
		try {
			while (this.anInt928 == 0) {
				if (this.anInt929 >= 10 || this.anInt927 == 0) {
					return;
				}
				@Pc(14) Class29 local14 = this.aClass29_12;
				@Pc(21) Class1_Sub1_Sub4 local21;
				synchronized (this.aClass29_12) {
					local21 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local21 != null) {
					if (this.aByteArrayArray5[local21.anInt749][local21.anInt750] != 0) {
						this.aByteArrayArray5[local21.anInt749][local21.anInt750] = 0;
						this.aClass29_10.method508(local21);
						this.method656(local21);
						this.aBoolean249 = true;
						if (this.anInt930 < this.anInt931) {
							this.anInt930++;
						}
						this.aString30 = "Loading extra files - " + this.anInt930 * 100 / this.anInt931 + "%";
						this.anInt929++;
						if (this.anInt929 == 10) {
							return;
						}
					}
					local14 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local21 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
					}
				}
				for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
					@Pc(122) byte[] local122 = this.aByteArrayArray5[local115];
					@Pc(125) int local125 = local122.length;
					for (@Pc(127) int local127 = 0; local127 < local125; local127++) {
						if (local122[local127] == this.anInt927) {
							local122[local127] = 0;
							local21 = new Class1_Sub1_Sub4();
							local21.anInt749 = local115;
							local21.anInt750 = local127;
							local21.aBoolean206 = false;
							this.aClass29_10.method508(local21);
							this.method656(local21);
							this.aBoolean249 = true;
							if (this.anInt930 < this.anInt931) {
								this.anInt930++;
							}
							this.aString30 = "Loading extra files - " + this.anInt930 * 100 / this.anInt931 + "%";
							this.anInt929++;
							if (this.anInt929 == 10) {
								return;
							}
						}
					}
				}
				this.anInt927--;
			}
		} catch (@Pc(225) RuntimeException local225) {
			signlink.reporterror("19891, " + 8 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	private void method654() {
		try {
			try {
				@Pc(15) int local15 = this.anInputStream2.available();
				@Pc(50) int local50;
				@Pc(66) int local66;
				if (this.anInt934 == 0 && local15 >= 6) {
					this.aBoolean249 = true;
					for (@Pc(26) int local26 = 0; local26 < 6; local26 += this.anInputStream2.read(this.aByteArray18, local26, 6 - local26)) {
					}
					local50 = this.aByteArray18[0] & 0xFF;
					local66 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(82) int local82 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(89) int local89 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(97) Class1_Sub1_Sub4 local97 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local97 != null; local97 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						if (local97.anInt749 == local50 && local97.anInt750 == local66) {
							this.aClass1_Sub1_Sub4_1 = local97;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local97.anInt751 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt935 = 0;
						if (local82 == 0) {
							signlink.reporterror("Rej: " + local50 + "," + local66);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean206) {
								@Pc(155) Class29 local155 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method673();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local89 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local82];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local89 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt933 = local89 * 500;
					this.anInt934 = 500;
					if (this.anInt934 > local82 - local89 * 500) {
						this.anInt934 = local82 - local89 * 500;
					}
				}
				if (this.anInt934 > 0 && local15 >= this.anInt934) {
					this.aBoolean249 = true;
					@Pc(234) byte[] local234 = this.aByteArray18;
					local50 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local234 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local50 = this.anInt933;
					}
					for (local66 = 0; local66 < this.anInt934; local66 += this.anInputStream2.read(local234, local66 + local50, this.anInt934 - local66)) {
					}
					if (this.anInt934 + this.anInt933 >= local234.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass45Array1[0] != null) {
							this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt749 + 1].method659(local234, this.aClass1_Sub1_Sub4_1.anInt750, local234.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean206 && this.aClass1_Sub1_Sub4_1.anInt749 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean206 = true;
							this.aClass1_Sub1_Sub4_1.anInt749 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean206) {
							@Pc(327) Class29 local327 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method673();
						}
					}
					this.anInt934 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket3.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt934 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("8446, " + false + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)Z")
	private boolean method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg3 == null || arg3.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg3.length - 2;
			if (arg2 != 0) {
				this.aBoolean247 = !this.aBoolean247;
			}
			@Pc(38) int local38 = ((arg3[local12] & 0xFF) << 8) + (arg3[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg3, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_2.getValue();
			if (local38 == arg1) {
				return local52 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("14533, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;I)V")
	private void method656(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket3 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local11;
					this.aSocket3 = this.aClient5.method186(client.anInt292 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt935 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt749;
				this.aByteArray18[1] = (byte) (arg0.anInt750 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt750;
				if (arg0.aBoolean206) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean89) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt936 = 0;
				this.anInt932 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket3.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt934 = 0;
				this.anInt932++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("32603, " + arg0 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
