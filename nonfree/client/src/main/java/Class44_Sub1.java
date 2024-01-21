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

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
	private int[] anIntArray255;

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

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt939 = -555;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "B")
	private byte aByte55 = 64;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(9);

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(-199);

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(-199);

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(-199);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(-199);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(-199);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method632(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method662(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 15787);
			this.anIntArrayArray24[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray24[local22][local56] = local42.method478();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method662(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 15787);
			this.anIntArrayArray25[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray25[local36][local123] = local115.method481();
			}
		}
		local104 = arg0.method662("model_index", null);
		local56 = this.anIntArrayArray24[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method662("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 15787);
		local56 = local104.length / 7;
		this.anIntArray255 = new int[local56];
		this.anIntArray256 = new int[local56];
		this.anIntArray257 = new int[local56];
		this.anIntArray258 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray255[local216] = local193.method478();
			this.anIntArray256[local216] = local193.method478();
			this.anIntArray257[local216] = local193.method478();
			this.anIntArray258[local216] = local193.method476();
		}
		local104 = arg0.method662("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 15787);
		local56 = local104.length / 2;
		this.anIntArray259 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray259[local268] = local193.method478();
		}
		local104 = arg0.method662("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 15787);
		local56 = local104.length;
		this.anIntArray260 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray260[local300] = local193.method476();
		}
		this.aClient3 = arg1;
		this.aBoolean241 = true;
		this.aClient3.method94(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method633() {
		this.aBoolean241 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public int method634(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("37225, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method635() {
		try {
			return this.anIntArray259.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("62481, " + 7 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
	public int method636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray255.length; local7++) {
				if (this.anIntArray255[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray256[local7];
					}
					return this.anIntArray257[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("24222, " + arg0 + ", " + -942 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZ)V")
	public void method637(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray255.length;
			for (@Pc(15) int local15 = 0; local15 < local3; local15++) {
				if (arg0 || this.anIntArray258[local15] != 0) {
					this.method644(3, (byte) 2, this.anIntArray257[local15]);
					this.method644(3, (byte) 2, this.anIntArray256[local15]);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("78980, " + false + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
	public boolean method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray255.length; local3++) {
				if (this.anIntArray257[local3] == arg0) {
					return true;
				}
			}
			if (arg1 != 0) {
				for (@Pc(23) int local23 = 1; local23 > 0; local23++) {
				}
			}
			return false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("68583, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
	public int method639(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("30503, " + arg0 + ", " + -600 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)Z")
	public boolean method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArray260[arg0] == 1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("97829, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method631(@OriginalArg(0) int arg0) {
		this.method641(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)V")
	public void method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method514(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method515()) {
				if (local34.anInt761 == arg0 && local34.anInt762 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt761 = arg0;
			local34.anInt762 = arg1;
			local34.aBoolean205 = true;
			@Pc(71) Class29 local71 = this.aClass29_8;
			synchronized (this.aClass29_8) {
				this.aClass29_8.method504(local34);
			}
			this.aClass32_2.method512(local34);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
	public int method642() {
		@Pc(2) Class32 local2 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			return this.aClass32_2.method516();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!mb;")
	public Class1_Sub1_Sub4 method643() {
		@Pc(4) Class29 local4 = this.aClass29_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass29_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass29_11.method506();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class32 local24 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			local11.method670();
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
	public void method644(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient3.aClass45Array1[0] != null && this.anIntArrayArray24[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass45Array1[arg0 + 1].method654(arg2);
				if (!this.method651(local25, this.anIntArrayArray24[arg0][arg2], this.anIntArrayArray25[arg0][arg2])) {
					this.aByteArrayArray5[arg0][arg2] = arg1;
					if (arg1 > this.anInt941) {
						this.anInt941 = arg1;
					}
					this.anInt945++;
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("42758, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method645(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				@Pc(5) Class29 local5 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method511();
				}
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("65651, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	public void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient3.aClass45Array1[0] != null && (this.anIntArrayArray24[arg1][arg0] != 0 && (this.aByteArrayArray5[arg1][arg0] != 0 && this.anInt941 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt761 = arg1;
				local30.anInt762 = arg0;
				local30.aBoolean205 = false;
				@Pc(46) Class29 local46 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method504(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("69676, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean241) {
				this.anInt951++;
				@Pc(11) byte local11 = 20;
				if (this.anInt941 == 0 && this.aClient3.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean242 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean242; local32++) {
					this.aBoolean242 = false;
					this.method647();
					this.method648();
					if (this.anInt942 == 0 && local32 >= 5) {
						break;
					}
					this.method649();
					if (this.anInputStream2 != null) {
						this.method650(200);
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method507(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method509()) {
					if (local72.aBoolean205) {
						local67 = true;
						local72.anInt763++;
						if (local72.anInt763 > 50) {
							local72.anInt763 = 0;
							this.method652(local72, 409);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method507(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method509()) {
						local67 = true;
						local72.anInt763++;
						if (local72.anInt763 > 50) {
							local72.anInt763 = 0;
							this.method652(local72, 409);
						}
					}
				}
				if (local67) {
					this.anInt949++;
					if (this.anInt949 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(157) Exception local157) {
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
				if (this.aClient3.aBoolean57 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt941 > 0 || this.aClient3.aClass45Array1[0] == null)) {
					this.anInt950++;
					if (this.anInt950 > 500) {
						this.anInt950 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt949 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method647() {
		try {
			@Pc(2) Class29 local2 = this.aClass29_8;
			@Pc(9) Class1_Sub1_Sub4 local9;
			synchronized (this.aClass29_8) {
				local9 = (Class1_Sub1_Sub4) this.aClass29_8.method506();
			}
			while (local9 != null) {
				this.aBoolean242 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient3.aClass45Array1[0] != null) {
					local24 = this.aClient3.aClass45Array1[local9.anInt761 + 1].method654(local9.anInt762);
				}
				if (!this.method651(local24, this.anIntArrayArray24[local9.anInt761][local9.anInt762], this.anIntArrayArray25[local9.anInt761][local9.anInt762])) {
					local24 = null;
				}
				@Pc(69) Class29 local69 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local24 == null) {
						this.aClass29_9.method504(local9);
					} else {
						local9.aByteArray10 = local24;
						@Pc(85) Class29 local85 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method504(local9);
						}
					}
					local9 = (Class1_Sub1_Sub4) this.aClass29_8.method506();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("28575, " + -101 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method648() {
		try {
			this.anInt942 = 0;
			this.anInt943 = 0;
			@Pc(18) Class1_Sub1_Sub4 local18;
			for (local18 = (Class1_Sub1_Sub4) this.aClass29_10.method507(); local18 != null; local18 = (Class1_Sub1_Sub4) this.aClass29_10.method509()) {
				if (local18.aBoolean205) {
					this.anInt942++;
				} else {
					this.anInt943++;
				}
			}
			while (this.anInt942 < 10) {
				local18 = (Class1_Sub1_Sub4) this.aClass29_9.method506();
				if (local18 == null) {
					break;
				}
				if (this.aByteArrayArray5[local18.anInt761][local18.anInt762] != 0) {
					this.anInt944++;
				}
				this.aByteArrayArray5[local18.anInt761][local18.anInt762] = 0;
				this.aClass29_10.method504(local18);
				this.anInt942++;
				this.method652(local18, 409);
				this.aBoolean242 = true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("10900, " + -3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method649() {
		try {
			while (this.anInt942 == 0) {
				if (this.anInt943 >= 10 || this.anInt941 == 0) {
					return;
				}
				@Pc(19) Class29 local19 = this.aClass29_12;
				@Pc(26) Class1_Sub1_Sub4 local26;
				synchronized (this.aClass29_12) {
					local26 = (Class1_Sub1_Sub4) this.aClass29_12.method506();
				}
				while (local26 != null) {
					if (this.aByteArrayArray5[local26.anInt761][local26.anInt762] != 0) {
						this.aByteArrayArray5[local26.anInt761][local26.anInt762] = 0;
						this.aClass29_10.method504(local26);
						this.method652(local26, 409);
						this.aBoolean242 = true;
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
						local26 = (Class1_Sub1_Sub4) this.aClass29_12.method506();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray5[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt941) {
							local127[local132] = 0;
							local26 = new Class1_Sub1_Sub4();
							local26.anInt761 = local120;
							local26.anInt762 = local132;
							local26.aBoolean205 = false;
							this.aClass29_10.method504(local26);
							this.method652(local26, 409);
							this.aBoolean242 = true;
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
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("38119, " + 0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method650(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt948 == 0 && local9 >= 6) {
					this.aBoolean242 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
					}
					local44 = this.aByteArray18[0] & 0xFF;
					local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass29_10.method507(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass29_10.method509()) {
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
							if (this.aClass1_Sub1_Sub4_1.aBoolean205) {
								@Pc(149) Class29 local149 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method504(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method669();
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
					this.aBoolean242 = true;
					@Pc(228) byte[] local228 = this.aByteArray18;
					local44 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local228 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local44 = this.anInt947;
					}
					for (local60 = 0; local60 < this.anInt948; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt948 - local60)) {
					}
					if (this.anInt948 + this.anInt947 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient3.aClass45Array1[0] != null) {
							this.aClient3.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt761 + 1].method655(local228, local228.length, this.aClass1_Sub1_Sub4_1.anInt762);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean205 && this.aClass1_Sub1_Sub4_1.anInt761 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean205 = true;
							this.aClass1_Sub1_Sub4_1.anInt761 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean205) {
							@Pc(321) Class29 local321 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method504(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method669();
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
			signlink.reporterror("67743, " + arg0 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIBI)Z")
	private boolean method651(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			if (this.aByte55 != 64) {
				throw new NullPointerException();
			}
			this.aCRC32_2.update(arg0, 0, local12);
			@Pc(50) int local50 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local50 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("56096, " + arg0 + ", " + arg1 + ", " + 64 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;I)V")
	private void method652(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				if (this.aSocket3 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local10;
					this.aSocket3 = this.aClient3.method116(client.anInt393 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream2.read();
					}
					this.anInt949 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt761;
				this.aByteArray18[1] = (byte) (arg0.anInt762 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt762;
				if (arg0.aBoolean205) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient3.aBoolean57) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt950 = 0;
				this.anInt946 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket3.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt948 = 0;
				this.anInt946++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("57925, " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
