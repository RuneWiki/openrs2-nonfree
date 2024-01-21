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

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	private int anInt944;

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
	private int anInt945;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
	private boolean aBoolean229 = true;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt942 = 4;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "B")
	private byte aByte36 = 4;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "B")
	private byte aByte37 = -13;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "B")
	private byte aByte38 = -25;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(true);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(0);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(0);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(0);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(0);

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(0);

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
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 58);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 58);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 58);
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
		local193 = new Class1_Sub1_Sub3(local104, 58);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 58);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean231 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean231 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method638(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("84999, " + 4 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	public int method639() {
		try {
			return this.anIntArray260.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("59313, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBII)I")
	public int method640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray256.length; local7++) {
				if (this.anIntArray256[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray257[local7];
					}
					return this.anIntArray258[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("77314, " + arg0 + ", " + -55 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
	public void method641(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray256.length;
			for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
				if (arg0 || this.anIntArray259[local7] != 0) {
					this.method648((byte) 2, 3, this.anIntArray258[local7]);
					this.method648((byte) 2, 3, this.anIntArray257[local7]);
				}
			}
			if (this.aByte36 != 4) {
				for (@Pc(44) int local44 = 1; local44 > 0; local44++) {
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("67859, " + 4 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public boolean method642(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray256.length; local8++) {
				if (this.anIntArray258[local8] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("68750, " + arg0 + ", " + -46678 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)I")
	public int method643(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("82002, " + 724 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)Z")
	public boolean method644(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray261[arg0] == 1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("55849, " + arg0 + ", " + -829 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method635(@OriginalArg(0) int arg0) {
		this.method645(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(II)V")
	public void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method518(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method519((byte) 8)) {
				if (local34.anInt769 == arg0 && local34.anInt770 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt769 = arg0;
			local34.anInt770 = arg1;
			local34.aBoolean194 = true;
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIBI)V")
	public void method648(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg1][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass45Array1[arg1 + 1].method658(arg2, 913);
				if (!this.method655(this.anIntArrayArray25[arg1][arg2], this.anIntArrayArray24[arg1][arg2], local25)) {
					this.aByteArrayArray5[arg1][arg2] = arg0;
					if (arg0 > this.anInt944) {
						this.anInt944 = arg0;
					}
					this.anInt948++;
					if (this.aByte37 == -13) {
						;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("43823, " + arg0 + ", " + arg1 + ", " + -13 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method649() {
		try {
			@Pc(13) Class29 local13 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("9183, " + 4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	public void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt944 != 0))) {
				@Pc(34) Class1_Sub1_Sub4 local34 = new Class1_Sub1_Sub4();
				local34.anInt769 = arg0;
				local34.anInt770 = arg1;
				local34.aBoolean194 = false;
				@Pc(46) Class29 local46 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local34);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("194, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean231) {
				this.anInt954++;
				@Pc(11) byte local11 = 20;
				if (this.anInt944 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean232 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean232; local32++) {
					this.aBoolean232 = false;
					this.method651();
					this.method652();
					if (this.anInt945 == 0 && local32 >= 5) {
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
					if (local72.aBoolean194) {
						local67 = true;
						local72.anInt771++;
						if (local72.anInt771 > 50) {
							local72.anInt771 = 0;
							this.method656(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local67 = true;
						local72.anInt771++;
						if (local72.anInt771 > 50) {
							local72.anInt771 = 0;
							this.method656(local72);
						}
					}
				}
				if (local67) {
					this.anInt952++;
					if (this.anInt952 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt951 = 0;
					}
				} else {
					this.anInt952 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean80 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt944 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt953++;
					if (this.anInt953 > 500) {
						this.anInt953 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt952 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method651() {
		try {
			if (this.aByte38 == -25) {
				@Pc(7) Class29 local7 = this.aClass29_8;
				@Pc(14) Class1_Sub1_Sub4 local14;
				synchronized (this.aClass29_8) {
					local14 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
				while (local14 != null) {
					this.aBoolean232 = true;
					@Pc(25) byte[] local25 = null;
					if (this.aClient5.aClass45Array1[0] != null) {
						local25 = this.aClient5.aClass45Array1[local14.anInt769 + 1].method658(local14.anInt770, 913);
					}
					if (!this.method655(this.anIntArrayArray25[local14.anInt769][local14.anInt770], this.anIntArrayArray24[local14.anInt769][local14.anInt770], local25)) {
						local25 = null;
					}
					@Pc(70) Class29 local70 = this.aClass29_8;
					synchronized (this.aClass29_8) {
						if (local25 == null) {
							this.aClass29_9.method508(local14);
						} else {
							local14.aByteArray10 = local25;
							@Pc(86) Class29 local86 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(local14);
							}
						}
						local14 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("2744, " + -25 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	private void method652() {
		try {
			this.anInt945 = 0;
			this.anInt946 = 0;
			@Pc(18) Class1_Sub1_Sub4 local18;
			for (local18 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local18 != null; local18 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
				if (local18.aBoolean194) {
					this.anInt945++;
				} else {
					this.anInt946++;
				}
			}
			while (this.anInt945 < 10) {
				local18 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local18 == null) {
					break;
				}
				if (this.aByteArrayArray5[local18.anInt769][local18.anInt770] != 0) {
					this.anInt947++;
				}
				this.aByteArrayArray5[local18.anInt769][local18.anInt770] = 0;
				this.aClass29_10.method508(local18);
				this.anInt945++;
				this.method656(local18);
				this.aBoolean232 = true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("11475, " + 45 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	private void method653() {
		try {
			while (this.anInt945 == 0) {
				if (this.anInt946 >= 10 || this.anInt944 == 0) {
					return;
				}
				@Pc(15) Class29 local15 = this.aClass29_12;
				@Pc(22) Class1_Sub1_Sub4 local22;
				synchronized (this.aClass29_12) {
					local22 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local22 != null) {
					if (this.aByteArrayArray5[local22.anInt769][local22.anInt770] != 0) {
						this.aByteArrayArray5[local22.anInt769][local22.anInt770] = 0;
						this.aClass29_10.method508(local22);
						this.method656(local22);
						this.aBoolean232 = true;
						if (this.anInt947 < this.anInt948) {
							this.anInt947++;
						}
						this.aString30 = "Loading extra files - " + this.anInt947 * 100 / this.anInt948 + "%";
						this.anInt946++;
						if (this.anInt946 == 10) {
							return;
						}
					}
					local15 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local22 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray5[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt944) {
							local123[local128] = 0;
							local22 = new Class1_Sub1_Sub4();
							local22.anInt769 = local116;
							local22.anInt770 = local128;
							local22.aBoolean194 = false;
							this.aClass29_10.method508(local22);
							this.method656(local22);
							this.aBoolean232 = true;
							if (this.anInt947 < this.anInt948) {
								this.anInt947++;
							}
							this.aString30 = "Loading extra files - " + this.anInt947 * 100 / this.anInt948 + "%";
							this.anInt946++;
							if (this.anInt946 == 10) {
								return;
							}
						}
					}
				}
				this.anInt944--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("84816, " + 14 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	private void method654() {
		try {
			try {
				@Pc(14) int local14 = this.anInputStream2.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt951 == 0 && local14 >= 6) {
					this.aBoolean232 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream2.read(this.aByteArray18, local25, 6 - local25)) {
					}
					local49 = this.aByteArray18[0] & 0xFF;
					local65 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(96) Class1_Sub1_Sub4 local96 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local96 != null; local96 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						if (local96.anInt769 == local49 && local96.anInt770 == local65) {
							this.aClass1_Sub1_Sub4_1 = local96;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local96.anInt771 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt952 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean194) {
								@Pc(154) Class29 local154 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method673();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local88 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local81];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local88 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt950 = local88 * 500;
					this.anInt951 = 500;
					if (this.anInt951 > local81 - local88 * 500) {
						this.anInt951 = local81 - local88 * 500;
					}
				}
				if (this.anInt951 > 0 && local14 >= this.anInt951) {
					this.aBoolean232 = true;
					@Pc(233) byte[] local233 = this.aByteArray18;
					local49 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local233 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local49 = this.anInt950;
					}
					for (local65 = 0; local65 < this.anInt951; local65 += this.anInputStream2.read(local233, local65 + local49, this.anInt951 - local65)) {
					}
					if (this.anInt951 + this.anInt950 >= local233.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass45Array1[0] != null) {
							this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt769 + 1].method659(this.aClass1_Sub1_Sub4_1.anInt770, local233, local233.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean194 && this.aClass1_Sub1_Sub4_1.anInt769 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean194 = true;
							this.aClass1_Sub1_Sub4_1.anInt769 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean194) {
							@Pc(326) Class29 local326 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method673();
						}
					}
					this.anInt951 = 0;
				}
			} catch (@Pc(347) IOException local347) {
				try {
					this.aSocket3.close();
				} catch (@Pc(352) Exception local352) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt951 = 0;
			}
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("66368, " + 0 + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BI)Z")
	private boolean method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg2, 0, local12);
			@Pc(53) int local53 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local53 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("91876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local66.toString());
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
					this.aSocket3 = this.aClient5.method213(client.anInt363 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt952 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt769;
				this.aByteArray18[1] = (byte) (arg0.anInt770 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt770;
				if (arg0.aBoolean194) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean80) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt953 = 0;
				this.anInt949 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket3.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt951 = 0;
				this.anInt949++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("46346, " + arg0 + ", " + -590 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
