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
	private static int anInt963 = 1000;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	private int anInt967;

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
	private int anInt968;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public int anInt972;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
	public int anInt977;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt964 = 625;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt965 = 617;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(-39453);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(18783);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(18783);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(18783);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(18783);

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(18783);

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
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(anInt963, local31);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(anInt963, local104);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(anInt963, local104);
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
		local193 = new Class1_Sub1_Sub3(anInt963, local104);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(anInt963, local104);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean237 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean237 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method638(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("24673, " + 26014 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method639() {
		try {
			return this.anIntArray260.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("61116, " + -3812 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
	public int method640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(19) int local19 = (arg0 << 8) + arg2;
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray256.length; local21++) {
				if (this.anIntArray256[local21] == local19) {
					if (arg1 == 0) {
						return this.anIntArray257[local21];
					}
					return this.anIntArray258[local21];
				}
			}
			return -1;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("44134, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public void method641(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray256.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray259[local5] != 0) {
					this.method648(this.anInt966, 3, (byte) 2, this.anIntArray258[local5]);
					this.method648(this.anInt966, 3, (byte) 2, this.anIntArray257[local5]);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23754, " + arg0 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public boolean method642(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray256.length; local7++) {
				if (this.anIntArray258[local7] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("95500, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public int method643(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("24031, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)Z")
	public boolean method644(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray261[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("30961, " + -199 + ", " + arg0 + ", " + local16.toString());
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
				if (local34.anInt781 == arg0 && local34.anInt782 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt781 = arg0;
			local34.anInt782 = arg1;
			local34.aBoolean202 = true;
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBI)V")
	public void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg1][arg3] != 0) {
				@Pc(34) byte[] local34 = this.aClient5.aClass45Array1[arg1 + 1].method658(arg3);
				if (!this.method655(this.anIntArrayArray24[arg1][arg3], this.anIntArrayArray25[arg1][arg3], local34)) {
					this.aByteArrayArray5[arg1][arg3] = arg2;
					if (arg2 > this.anInt967) {
						this.anInt967 = arg2;
					}
					this.anInt971++;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("12708, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method649(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class29 local6 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("4364, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)V")
	public void method650(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg2] != 0 && (this.aByteArrayArray5[arg0][arg2] != 0 && this.anInt967 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				if (arg1 != 3) {
					this.aBoolean236 = !this.aBoolean236;
				}
				local30.anInt781 = arg0;
				local30.anInt782 = arg2;
				local30.aBoolean202 = false;
				@Pc(53) Class29 local53 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local30);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("53399, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean237) {
				this.anInt977++;
				@Pc(11) byte local11 = 20;
				if (this.anInt967 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean238 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean238; local32++) {
					this.aBoolean238 = false;
					this.method651(960);
					this.method652();
					if (this.anInt968 == 0 && local32 >= 5) {
						break;
					}
					this.method653(275);
					if (this.anInputStream2 != null) {
						this.method654();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
					if (local72.aBoolean202) {
						local67 = true;
						local72.anInt783++;
						if (local72.anInt783 > 50) {
							local72.anInt783 = 0;
							this.method656(557, local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local67 = true;
						local72.anInt783++;
						if (local72.anInt783 > 50) {
							local72.anInt783 = 0;
							this.method656(557, local72);
						}
					}
				}
				if (local67) {
					this.anInt975++;
					if (this.anInt975 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt974 = 0;
					}
				} else {
					this.anInt975 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean59 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt967 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt976++;
					if (this.anInt976 > 500) {
						this.anInt976 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt975 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method651(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class29 local6 = this.aClass29_8;
			@Pc(13) Class1_Sub1_Sub4 local13;
			synchronized (this.aClass29_8) {
				local13 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
			}
			while (local13 != null) {
				this.aBoolean238 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient5.aClass45Array1[0] != null) {
					local24 = this.aClient5.aClass45Array1[local13.anInt781 + 1].method658(local13.anInt782);
				}
				if (!this.method655(this.anIntArrayArray24[local13.anInt781][local13.anInt782], this.anIntArrayArray25[local13.anInt781][local13.anInt782], local24)) {
					local24 = null;
				}
				@Pc(69) Class29 local69 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local24 == null) {
						this.aClass29_9.method508(local13);
					} else {
						local13.aByteArray10 = local24;
						@Pc(85) Class29 local85 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method508(local13);
						}
					}
					local13 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("89879, " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method652() {
		try {
			this.anInt968 = 0;
			this.anInt969 = 0;
			@Pc(23) Class1_Sub1_Sub4 local23;
			for (local23 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local23 != null; local23 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
				if (local23.aBoolean202) {
					this.anInt968++;
				} else {
					this.anInt969++;
				}
			}
			while (this.anInt968 < 10) {
				local23 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local23 == null) {
					break;
				}
				if (this.aByteArrayArray5[local23.anInt781][local23.anInt782] != 0) {
					this.anInt970++;
				}
				this.aByteArrayArray5[local23.anInt781][local23.anInt782] = 0;
				this.aClass29_10.method508(local23);
				this.anInt968++;
				this.method656(557, local23);
				this.aBoolean238 = true;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("46521, " + 4204 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	private void method653(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			while (this.anInt968 == 0) {
				if (this.anInt969 >= 10 || this.anInt967 == 0) {
					return;
				}
				@Pc(13) Class29 local13 = this.aClass29_12;
				@Pc(20) Class1_Sub1_Sub4 local20;
				synchronized (this.aClass29_12) {
					local20 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local20 != null) {
					if (this.aByteArrayArray5[local20.anInt781][local20.anInt782] != 0) {
						this.aByteArrayArray5[local20.anInt781][local20.anInt782] = 0;
						this.aClass29_10.method508(local20);
						this.method656(557, local20);
						this.aBoolean238 = true;
						if (this.anInt970 < this.anInt971) {
							this.anInt970++;
						}
						this.aString30 = "Loading extra files - " + this.anInt970 * 100 / this.anInt971 + "%";
						this.anInt969++;
						if (this.anInt969 == 10) {
							return;
						}
					}
					local13 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local20 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
					}
				}
				for (@Pc(114) int local114 = 0; local114 < 4; local114++) {
					@Pc(121) byte[] local121 = this.aByteArrayArray5[local114];
					@Pc(124) int local124 = local121.length;
					for (@Pc(126) int local126 = 0; local126 < local124; local126++) {
						if (local121[local126] == this.anInt967) {
							local121[local126] = 0;
							local20 = new Class1_Sub1_Sub4();
							local20.anInt781 = local114;
							local20.anInt782 = local126;
							local20.aBoolean202 = false;
							this.aClass29_10.method508(local20);
							this.method656(557, local20);
							this.aBoolean238 = true;
							if (this.anInt970 < this.anInt971) {
								this.anInt970++;
							}
							this.aString30 = "Loading extra files - " + this.anInt970 * 100 / this.anInt971 + "%";
							this.anInt969++;
							if (this.anInt969 == 10) {
								return;
							}
						}
					}
				}
				this.anInt967--;
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("81424, " + arg0 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	private void method654() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt974 == 0 && local9 >= 6) {
					this.aBoolean238 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
					}
					local44 = this.aByteArray18[0] & 0xFF;
					local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						if (local91.anInt781 == local44 && local91.anInt782 == local60) {
							this.aClass1_Sub1_Sub4_1 = local91;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local91.anInt783 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt975 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean202) {
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
					this.anInt973 = local83 * 500;
					this.anInt974 = 500;
					if (this.anInt974 > local76 - local83 * 500) {
						this.anInt974 = local76 - local83 * 500;
					}
				}
				if (this.anInt974 > 0 && local9 >= this.anInt974) {
					this.aBoolean238 = true;
					@Pc(228) byte[] local228 = this.aByteArray18;
					local44 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local228 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local44 = this.anInt973;
					}
					for (local60 = 0; local60 < this.anInt974; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt974 - local60)) {
					}
					if (this.anInt974 + this.anInt973 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass45Array1[0] != null) {
							this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt781 + 1].method659(this.aClass1_Sub1_Sub4_1.anInt782, this.anInt964, local228, local228.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean202 && this.aClass1_Sub1_Sub4_1.anInt781 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean202 = true;
							this.aClass1_Sub1_Sub4_1.anInt781 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean202) {
							@Pc(322) Class29 local322 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method673();
						}
					}
					this.anInt974 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket3.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt974 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("21639, " + 2645 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI[B)Z")
	private boolean method655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg2, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_2.getValue();
			if (local28 == arg0) {
				return local48 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("85977, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!mb;)V")
	private void method656(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				if (this.aSocket3 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local10;
					this.aSocket3 = this.aClient5.method163(client.anInt256 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream2.read();
					}
					this.anInt975 = 0;
				}
				this.aByteArray18[0] = (byte) arg1.anInt781;
				this.aByteArray18[1] = (byte) (arg1.anInt782 >> 8);
				this.aByteArray18[2] = (byte) arg1.anInt782;
				if (arg1.aBoolean202) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean59) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt976 = 0;
				this.anInt972 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket3.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt974 = 0;
				this.anInt972++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("7959, " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
