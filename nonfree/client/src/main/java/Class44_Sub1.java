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
	private static int anInt963 = 888;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public int anInt970;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Z")
	private boolean aBoolean229 = true;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(49694);

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(anInt963);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(anInt963);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(anInt963);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(anInt963);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(anInt963);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method636(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method666(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(false, local31);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(false, local104);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(false, local104);
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
		local193 = new Class1_Sub1_Sub3(false, local104);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(false, local104);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean229 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean229 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("31786, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	public int method639(@OriginalArg(0) boolean arg0) {
		try {
			return arg0 ? this.anIntArray260.length : this.anInt964;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("60238, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
	public int method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 41 / arg3;
			@Pc(9) int local9 = (arg1 << 8) + arg2;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray256.length; local11++) {
				if (this.anIntArray256[local11] == local9) {
					if (arg0 == 0) {
						return this.anIntArray257[local11];
					}
					return this.anIntArray258[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("15039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public void method641(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray256.length;
			for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
				if (arg0 || this.anIntArray259[local7] != 0) {
					this.method648((byte) 2, this.anIntArray258[local7], 3);
					this.method648((byte) 2, this.anIntArray257[local7], 3);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("17932, " + arg0 + ", " + -517 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public boolean method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 47587) {
				this.anInt964 = 110;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray256.length; local7++) {
				if (this.anIntArray258[local7] == arg1) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("7392, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)I")
	public int method643(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("64074, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Z")
	public boolean method644(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				throw new NullPointerException();
			}
			return this.anIntArray261[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("79096, " + arg0 + ", " + arg1 + ", " + local16.toString());
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
				if (local34.anInt785 == arg0 && local34.anInt786 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt785 = arg0;
			local34.anInt786 = arg1;
			local34.aBoolean190 = true;
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
	public void method648(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg2][arg1] != 0) {
				@Pc(35) byte[] local35 = this.aClient5.aClass45Array1[arg2 + 1].method658(arg1);
				if (!this.method655(local35, this.anIntArrayArray25[arg2][arg1], this.anIntArrayArray24[arg2][arg1])) {
					this.aByteArrayArray5[arg2][arg1] = arg0;
					if (arg0 > this.anInt965) {
						this.anInt965 = arg0;
					}
					this.anInt969++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("91561, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public void method649() {
		try {
			@Pc(11) Class29 local11 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("57538, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg1][arg0] != 0 && (this.aByteArrayArray5[arg1][arg0] != 0 && this.anInt965 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt785 = arg1;
				local30.anInt786 = arg0;
				local30.aBoolean190 = false;
				@Pc(47) Class29 local47 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local30);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("76453, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean229) {
				this.anInt975++;
				@Pc(11) byte local11 = 20;
				if (this.anInt965 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean230 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean230; local32++) {
					this.aBoolean230 = false;
					this.method651();
					this.method652();
					if (this.anInt966 == 0 && local32 >= 5) {
						break;
					}
					this.method653();
					if (this.anInputStream2 != null) {
						this.method654((byte) 1);
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
					if (local72.aBoolean190) {
						local67 = true;
						local72.anInt787++;
						if (local72.anInt787 > 50) {
							local72.anInt787 = 0;
							this.method656(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local67 = true;
						local72.anInt787++;
						if (local72.anInt787 > 50) {
							local72.anInt787 = 0;
							this.method656(local72);
						}
					}
				}
				if (local67) {
					this.anInt973++;
					if (this.anInt973 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt972 = 0;
					}
				} else {
					this.anInt973 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean82 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt965 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt974++;
					if (this.anInt974 > 500) {
						this.anInt974 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt973 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method651() {
		try {
			@Pc(2) Class29 local2 = this.aClass29_8;
			@Pc(9) Class1_Sub1_Sub4 local9;
			synchronized (this.aClass29_8) {
				local9 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
			}
			while (local9 != null) {
				this.aBoolean230 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient5.aClass45Array1[0] != null) {
					local24 = this.aClient5.aClass45Array1[local9.anInt785 + 1].method658(local9.anInt786);
				}
				if (!this.method655(local24, this.anIntArrayArray25[local9.anInt785][local9.anInt786], this.anIntArrayArray24[local9.anInt785][local9.anInt786])) {
					local24 = null;
				}
				@Pc(69) Class29 local69 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local24 == null) {
						this.aClass29_9.method508(local9);
					} else {
						local9.aByteArray10 = local24;
						@Pc(85) Class29 local85 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method508(local9);
						}
					}
					local9 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("45479, " + -45 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	private void method652() {
		try {
			this.anInt966 = 0;
			this.anInt967 = 0;
			@Pc(22) Class1_Sub1_Sub4 local22;
			for (local22 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local22 != null; local22 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
				if (local22.aBoolean190) {
					this.anInt966++;
				} else {
					this.anInt967++;
				}
			}
			while (this.anInt966 < 10) {
				local22 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local22 == null) {
					break;
				}
				if (this.aByteArrayArray5[local22.anInt785][local22.anInt786] != 0) {
					this.anInt968++;
				}
				this.aByteArrayArray5[local22.anInt785][local22.anInt786] = 0;
				this.aClass29_10.method508(local22);
				this.anInt966++;
				this.method656(local22);
				this.aBoolean230 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("5688, " + -34026 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method653() {
		try {
			while (this.anInt966 == 0) {
				if (this.anInt967 >= 10 || this.anInt965 == 0) {
					return;
				}
				@Pc(18) Class29 local18 = this.aClass29_12;
				@Pc(25) Class1_Sub1_Sub4 local25;
				synchronized (this.aClass29_12) {
					local25 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local25 != null) {
					if (this.aByteArrayArray5[local25.anInt785][local25.anInt786] != 0) {
						this.aByteArrayArray5[local25.anInt785][local25.anInt786] = 0;
						this.aClass29_10.method508(local25);
						this.method656(local25);
						this.aBoolean230 = true;
						if (this.anInt968 < this.anInt969) {
							this.anInt968++;
						}
						this.aString30 = "Loading extra files - " + this.anInt968 * 100 / this.anInt969 + "%";
						this.anInt967++;
						if (this.anInt967 == 10) {
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
						if (local126[local131] == this.anInt965) {
							local126[local131] = 0;
							local25 = new Class1_Sub1_Sub4();
							local25.anInt785 = local119;
							local25.anInt786 = local131;
							local25.aBoolean190 = false;
							this.aClass29_10.method508(local25);
							this.method656(local25);
							this.aBoolean230 = true;
							if (this.anInt968 < this.anInt969) {
								this.anInt968++;
							}
							this.aString30 = "Loading extra files - " + this.anInt968 * 100 / this.anInt969 + "%";
							this.anInt967++;
							if (this.anInt967 == 10) {
								return;
							}
						}
					}
				}
				this.anInt965--;
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("65186, " + 0 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method654(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(13) int local13 = this.anInputStream2.available();
				@Pc(48) int local48;
				@Pc(64) int local64;
				if (this.anInt972 == 0 && local13 >= 6) {
					this.aBoolean230 = true;
					for (@Pc(24) int local24 = 0; local24 < 6; local24 += this.anInputStream2.read(this.aByteArray18, local24, 6 - local24)) {
					}
					local48 = this.aByteArray18[0] & 0xFF;
					local64 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(80) int local80 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(87) int local87 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(95) Class1_Sub1_Sub4 local95 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local95 != null; local95 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						if (local95.anInt785 == local48 && local95.anInt786 == local64) {
							this.aClass1_Sub1_Sub4_1 = local95;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local95.anInt787 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt973 = 0;
						if (local80 == 0) {
							signlink.reporterror("Rej: " + local48 + "," + local64);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean190) {
								@Pc(153) Class29 local153 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method673();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local87 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local80];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local87 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt971 = local87 * 500;
					this.anInt972 = 500;
					if (this.anInt972 > local80 - local87 * 500) {
						this.anInt972 = local80 - local87 * 500;
					}
				}
				if (this.anInt972 > 0 && local13 >= this.anInt972) {
					this.aBoolean230 = true;
					@Pc(232) byte[] local232 = this.aByteArray18;
					local48 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local232 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local48 = this.anInt971;
					}
					for (local64 = 0; local64 < this.anInt972; local64 += this.anInputStream2.read(local232, local64 + local48, this.anInt972 - local64)) {
					}
					if (this.anInt972 + this.anInt971 >= local232.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass45Array1[0] != null) {
							this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt785 + 1].method659(local232.length, local232, this.aClass1_Sub1_Sub4_1.anInt786);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean190 && this.aClass1_Sub1_Sub4_1.anInt785 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean190 = true;
							this.aClass1_Sub1_Sub4_1.anInt785 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean190) {
							@Pc(325) Class29 local325 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method673();
						}
					}
					this.anInt972 = 0;
				}
			} catch (@Pc(346) IOException local346) {
				try {
					this.aSocket3.close();
				} catch (@Pc(351) Exception local351) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt972 = 0;
			}
		} catch (@Pc(365) RuntimeException local365) {
			signlink.reporterror("70657, " + arg0 + ", " + local365.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z[BII)Z")
	private boolean method655(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg0, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_2.getValue();
			if (local28 == arg2) {
				return local48 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("59767, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!mb;)V")
	private void method656(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket3 == null) {
					@Pc(16) long local16 = System.currentTimeMillis();
					if (local16 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local16;
					this.aSocket3 = this.aClient5.method228(client.anInt256 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
						this.anInputStream2.read();
					}
					this.anInt973 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt785;
				this.aByteArray18[1] = (byte) (arg0.anInt786 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt786;
				if (arg0.aBoolean190) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean82) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt974 = 0;
				this.anInt970 = -10000;
			} catch (@Pc(128) IOException local128) {
				try {
					this.aSocket3.close();
				} catch (@Pc(133) Exception local133) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt972 = 0;
				this.anInt970++;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("34998, " + 107 + ", " + arg0 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
