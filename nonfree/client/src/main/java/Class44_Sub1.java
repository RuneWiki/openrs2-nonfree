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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
	public int anInt934;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt924 = 8;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "B")
	private byte aByte36 = -67;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "B")
	private byte aByte37 = -67;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "B")
	private byte aByte38 = 70;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "B")
	private byte aByte39 = 7;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(false);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29((byte) 5);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29((byte) 5);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29((byte) 5);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29((byte) 5);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29((byte) 5);

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method628(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method658(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3((byte) 3, local31);
			this.anIntArrayArray24[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray24[local22][local56] = local42.method474();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method658(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3((byte) 3, local104);
			this.anIntArrayArray25[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray25[local36][local123] = local115.method477();
			}
		}
		local104 = arg0.method658("model_index", null);
		local56 = this.anIntArrayArray24[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method658("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3((byte) 3, local104);
		local56 = local104.length / 7;
		this.anIntArray253 = new int[local56];
		this.anIntArray254 = new int[local56];
		this.anIntArray255 = new int[local56];
		this.anIntArray256 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray253[local216] = local193.method474();
			this.anIntArray254[local216] = local193.method474();
			this.anIntArray255[local216] = local193.method474();
			this.anIntArray256[local216] = local193.method472();
		}
		local104 = arg0.method658("anim_index", null);
		local193 = new Class1_Sub1_Sub3((byte) 3, local104);
		local56 = local104.length / 2;
		this.anIntArray257 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray257[local268] = local193.method474();
		}
		local104 = arg0.method658("midi_index", null);
		local193 = new Class1_Sub1_Sub3((byte) 3, local104);
		local56 = local104.length;
		this.anIntArray258 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray258[local300] = local193.method472();
		}
		this.aClient2 = arg1;
		this.aBoolean246 = true;
		this.aClient2.method94(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method629() {
		this.aBoolean246 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method630(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("50696, " + -561 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method631() {
		try {
			if (this.anInt924 > 8 || this.anInt924 < 8) {
				this.anInt924 = 172;
			}
			return this.anIntArray257.length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("96134, " + 8 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)I")
	public int method632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray253.length; local7++) {
				if (this.anIntArray253[local7] == local5) {
					if (arg1 == 0) {
						return this.anIntArray254[local7];
					}
					return this.anIntArray255[local7];
				}
			}
			return -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("74032, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public void method633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.anIntArray253.length;
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				if (arg0 || this.anIntArray256[local9] != 0) {
					this.method640(3, this.anIntArray255[local9], (byte) 2);
					this.method640(3, this.anIntArray254[local9], (byte) 2);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("29721, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)Z")
	public boolean method634(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray253.length; local1++) {
				if (this.anIntArray255[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("82709, " + 5 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)I")
	public int method635(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("74822, " + false + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Z")
	public boolean method636(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray258[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("69672, " + arg0 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method627(@OriginalArg(0) int arg0) {
		this.method637(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	public void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method510(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method511()) {
				if (local34.anInt744 == arg0 && local34.anInt745 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt744 = arg0;
			local34.anInt745 = arg1;
			local34.aBoolean210 = true;
			@Pc(71) Class29 local71 = this.aClass29_8;
			synchronized (this.aClass29_8) {
				this.aClass29_8.method500(local34);
			}
			this.aClass32_2.method508(local34);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
	public int method638() {
		@Pc(2) Class32 local2 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			return this.aClass32_2.method512();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!mb;")
	public Class1_Sub1_Sub4 method639() {
		@Pc(4) Class29 local4 = this.aClass29_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass29_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass29_11.method502();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class32 local24 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			local11.method667();
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBI)V")
	public void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && this.anIntArrayArray24[arg0][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass45Array1[arg0 + 1].method650(arg1);
				if (!this.method647(this.anIntArrayArray25[arg0][arg1], this.anIntArrayArray24[arg0][arg1], local25)) {
					this.aByteArrayArray5[arg0][arg1] = arg2;
					if (arg2 > this.anInt925) {
						this.anInt925 = arg2;
					}
					this.anInt929++;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("64724, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 954 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method641() {
		try {
			@Pc(13) Class29 local13 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method507();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("84180, " + 21906 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ)V")
	public void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt925 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt744 = arg0;
				local30.anInt745 = arg1;
				local30.aBoolean210 = false;
				@Pc(51) Class29 local51 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method500(local30);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("80448, " + arg0 + ", " + arg1 + ", " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean246) {
				this.anInt934++;
				@Pc(11) byte local11 = 20;
				if (this.anInt925 == 0 && this.aClient2.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean247 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean247; local32++) {
					this.aBoolean247 = false;
					this.method643();
					this.method644(this.aByte36);
					if (this.anInt926 == 0 && local32 >= 5) {
						break;
					}
					this.method645(this.aByte38);
					if (this.anInputStream2 != null) {
						this.method646(this.aByte39);
					}
				}
				@Pc(70) boolean local70 = false;
				@Pc(75) Class1_Sub1_Sub4 local75;
				for (local75 = (Class1_Sub1_Sub4) this.aClass29_10.method503(); local75 != null; local75 = (Class1_Sub1_Sub4) this.aClass29_10.method505()) {
					if (local75.aBoolean210) {
						local70 = true;
						local75.anInt746++;
						if (local75.anInt746 > 50) {
							local75.anInt746 = 0;
							this.method648(local75);
						}
					}
				}
				if (!local70) {
					for (local75 = (Class1_Sub1_Sub4) this.aClass29_10.method503(); local75 != null; local75 = (Class1_Sub1_Sub4) this.aClass29_10.method505()) {
						local70 = true;
						local75.anInt746++;
						if (local75.anInt746 > 50) {
							local75.anInt746 = 0;
							this.method648(local75);
						}
					}
				}
				if (local70) {
					this.anInt932++;
					if (this.anInt932 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(160) Exception local160) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt931 = 0;
					}
				} else {
					this.anInt932 = 0;
					this.aString30 = "";
				}
				if (this.aClient2.aBoolean80 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt925 > 0 || this.aClient2.aClass45Array1[0] == null)) {
					this.anInt933++;
					if (this.anInt933 > 500) {
						this.anInt933 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(241) IOException local241) {
							this.anInt932 = 5000;
						}
					}
				}
			}
		} catch (@Pc(250) Exception local250) {
			signlink.reporterror("od_ex " + local250.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method643() {
		try {
			@Pc(4) Class29 local4 = this.aClass29_8;
			@Pc(11) Class1_Sub1_Sub4 local11;
			synchronized (this.aClass29_8) {
				local11 = (Class1_Sub1_Sub4) this.aClass29_8.method502();
			}
			while (local11 != null) {
				this.aBoolean247 = true;
				@Pc(30) byte[] local30 = null;
				if (this.aClient2.aClass45Array1[0] != null) {
					local30 = this.aClient2.aClass45Array1[local11.anInt744 + 1].method650(local11.anInt745);
				}
				if (!this.method647(this.anIntArrayArray25[local11.anInt744][local11.anInt745], this.anIntArrayArray24[local11.anInt744][local11.anInt745], local30)) {
					local30 = null;
				}
				@Pc(75) Class29 local75 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local30 == null) {
						this.aClass29_9.method500(local11);
					} else {
						local11.aByteArray10 = local30;
						@Pc(91) Class29 local91 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method500(local11);
						}
					}
					local11 = (Class1_Sub1_Sub4) this.aClass29_8.method502();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("53901, " + 29321 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method644(@OriginalArg(0) byte arg0) {
		try {
			this.anInt926 = 0;
			this.anInt927 = 0;
			if (arg0 == this.aByte37) {
				@Pc(17) Class1_Sub1_Sub4 local17;
				for (local17 = (Class1_Sub1_Sub4) this.aClass29_10.method503(); local17 != null; local17 = (Class1_Sub1_Sub4) this.aClass29_10.method505()) {
					if (local17.aBoolean210) {
						this.anInt926++;
					} else {
						this.anInt927++;
					}
				}
				while (this.anInt926 < 10) {
					local17 = (Class1_Sub1_Sub4) this.aClass29_9.method502();
					if (local17 == null) {
						break;
					}
					if (this.aByteArrayArray5[local17.anInt744][local17.anInt745] != 0) {
						this.anInt928++;
					}
					this.aByteArrayArray5[local17.anInt744][local17.anInt745] = 0;
					this.aClass29_10.method500(local17);
					this.anInt926++;
					this.method648(local17);
					this.aBoolean247 = true;
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("42538, " + arg0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method645(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 70) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			while (this.anInt926 == 0) {
				if (this.anInt927 >= 10 || this.anInt925 == 0) {
					return;
				}
				@Pc(19) Class29 local19 = this.aClass29_12;
				@Pc(26) Class1_Sub1_Sub4 local26;
				synchronized (this.aClass29_12) {
					local26 = (Class1_Sub1_Sub4) this.aClass29_12.method502();
				}
				while (local26 != null) {
					if (this.aByteArrayArray5[local26.anInt744][local26.anInt745] != 0) {
						this.aByteArrayArray5[local26.anInt744][local26.anInt745] = 0;
						this.aClass29_10.method500(local26);
						this.method648(local26);
						this.aBoolean247 = true;
						if (this.anInt928 < this.anInt929) {
							this.anInt928++;
						}
						this.aString30 = "Loading extra files - " + this.anInt928 * 100 / this.anInt929 + "%";
						this.anInt927++;
						if (this.anInt927 == 10) {
							return;
						}
					}
					local19 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local26 = (Class1_Sub1_Sub4) this.aClass29_12.method502();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray5[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt925) {
							local127[local132] = 0;
							local26 = new Class1_Sub1_Sub4();
							local26.anInt744 = local120;
							local26.anInt745 = local132;
							local26.aBoolean210 = false;
							this.aClass29_10.method500(local26);
							this.method648(local26);
							this.aBoolean247 = true;
							if (this.anInt928 < this.anInt929) {
								this.anInt928++;
							}
							this.aString30 = "Loading extra files - " + this.anInt928 * 100 / this.anInt929 + "%";
							this.anInt927++;
							if (this.anInt927 == 10) {
								return;
							}
						}
					}
				}
				this.anInt925--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("38903, " + arg0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	private void method646(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 7) {
				try {
					@Pc(9) int local9 = this.anInputStream2.available();
					@Pc(44) int local44;
					@Pc(60) int local60;
					if (this.anInt931 == 0 && local9 >= 6) {
						this.aBoolean247 = true;
						for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
						}
						local44 = this.aByteArray18[0] & 0xFF;
						local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
						@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
						@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
						this.aClass1_Sub1_Sub4_1 = null;
						for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass29_10.method503(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass29_10.method505()) {
							if (local91.anInt744 == local44 && local91.anInt745 == local60) {
								this.aClass1_Sub1_Sub4_1 = local91;
							}
							if (this.aClass1_Sub1_Sub4_1 != null) {
								local91.anInt746 = 0;
							}
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							this.anInt932 = 0;
							if (local76 == 0) {
								signlink.reporterror("Rej: " + local44 + "," + local60);
								this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
								if (this.aClass1_Sub1_Sub4_1.aBoolean210) {
									@Pc(149) Class29 local149 = this.aClass29_11;
									synchronized (this.aClass29_11) {
										this.aClass29_11.method500(this.aClass1_Sub1_Sub4_1);
									}
								} else {
									this.aClass1_Sub1_Sub4_1.method666();
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
						this.anInt930 = local83 * 500;
						this.anInt931 = 500;
						if (this.anInt931 > local76 - local83 * 500) {
							this.anInt931 = local76 - local83 * 500;
						}
					}
					if (this.anInt931 > 0 && local9 >= this.anInt931) {
						this.aBoolean247 = true;
						@Pc(228) byte[] local228 = this.aByteArray18;
						local44 = 0;
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local228 = this.aClass1_Sub1_Sub4_1.aByteArray10;
							local44 = this.anInt930;
						}
						for (local60 = 0; local60 < this.anInt931; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt931 - local60)) {
						}
						if (this.anInt931 + this.anInt930 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
							if (this.aClient2.aClass45Array1[0] != null) {
								this.aClient2.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt744 + 1].method651(local228, this.aClass1_Sub1_Sub4_1.anInt745, local228.length, 870);
							}
							if (!this.aClass1_Sub1_Sub4_1.aBoolean210 && this.aClass1_Sub1_Sub4_1.anInt744 == 3) {
								this.aClass1_Sub1_Sub4_1.aBoolean210 = true;
								this.aClass1_Sub1_Sub4_1.anInt744 = 93;
							}
							if (this.aClass1_Sub1_Sub4_1.aBoolean210) {
								@Pc(321) Class29 local321 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method500(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method666();
							}
						}
						this.anInt931 = 0;
					}
				} catch (@Pc(342) IOException local342) {
					try {
						this.aSocket3.close();
					} catch (@Pc(347) Exception local347) {
					}
					this.aSocket3 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt931 = 0;
				}
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("41904, " + arg0 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI[B)Z")
	private boolean method647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg2, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local48 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("64220, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;Z)V")
	private void method648(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket3 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong31 < 5000L) {
						return;
					}
					this.aLong31 = local9;
					this.aSocket3 = this.aClient2.method204(client.anInt315 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt932 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt744;
				this.aByteArray18[1] = (byte) (arg0.anInt745 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt745;
				if (arg0.aBoolean210) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean80) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt933 = 0;
			} catch (@Pc(118) IOException local118) {
				try {
					this.aSocket3.close();
				} catch (@Pc(123) Exception local123) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt931 = 0;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("37222, " + arg0 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
