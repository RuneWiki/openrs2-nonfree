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

@OriginalClass("client!vb")
public final class Class45_Sub1 extends Class45 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Z")
	private static boolean aBoolean224 = true;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
	public int anInt1009;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private int anInt998 = 593;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt999 = 32319;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(false);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31(aBoolean224);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31(aBoolean224);

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31(aBoolean224);

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31(aBoolean224);

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31(aBoolean224);

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/lang/String;")
	public String aString31 = "";

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method648(@OriginalArg(0) Class48 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method678(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(45427, local31);
			this.anIntArrayArray23[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray23[local22][local56] = local42.method500();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method678(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(45427, local104);
			this.anIntArrayArray24[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray24[local36][local123] = local115.method503();
			}
		}
		local104 = arg0.method678("model_index", null);
		local56 = this.anIntArrayArray23[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method678("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(45427, local104);
		local56 = local104.length / 7;
		this.anIntArray258 = new int[local56];
		this.anIntArray259 = new int[local56];
		this.anIntArray260 = new int[local56];
		this.anIntArray261 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray258[local216] = local193.method500();
			this.anIntArray259[local216] = local193.method500();
			this.anIntArray260[local216] = local193.method500();
			this.anIntArray261[local216] = local193.method498();
		}
		local104 = arg0.method678("anim_index", null);
		local193 = new Class1_Sub1_Sub3(45427, local104);
		local56 = local104.length / 2;
		this.anIntArray262 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray262[local268] = local193.method500();
		}
		local104 = arg0.method678("midi_index", null);
		local193 = new Class1_Sub1_Sub3(45427, local104);
		local56 = local104.length;
		this.anIntArray263 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray263[local300] = local193.method498();
		}
		this.aClient2 = arg1;
		this.aBoolean228 = true;
		this.aClient2.method96(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method649() {
		this.aBoolean228 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I")
	public int method650(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return this.anIntArrayArray23[arg1].length;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("64581, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
	public int method651() {
		try {
			return this.anIntArray262.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("221, " + 2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray258.length; local13++) {
				if (this.anIntArray258[local13] == local5) {
					if (arg2 == 0) {
						return this.anIntArray259[local13];
					}
					return this.anIntArray260[local13];
				}
			}
			return -1;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("40119, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -21445 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	public void method653(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(11) int local11 = this.anIntArray258.length;
			for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
				if (arg0 || this.anIntArray261[local13] != 0) {
					this.method660((byte) 2, this.anIntArray260[local13], 3);
					this.method660((byte) 2, this.anIntArray259[local13], 3);
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("52922, " + 638 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)Z")
	public boolean method654(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray258.length; local1++) {
				if (this.anIntArray260[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("32669, " + true + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public int method655(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("29120, " + arg0 + ", " + -772 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ZI)Z")
	public boolean method656(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray263[arg0] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("7293, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method647(@OriginalArg(0) int arg0) {
		this.method657(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method533(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method534()) {
				if (local34.anInt826 == arg0 && local34.anInt827 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt826 = arg0;
			local34.anInt827 = arg1;
			local34.aBoolean193 = true;
			@Pc(71) Class31 local71 = this.aClass31_8;
			synchronized (this.aClass31_8) {
				this.aClass31_8.method520(local34);
			}
			this.aClass34_2.method531(local34);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	public int method658() {
		@Pc(2) Class34 local2 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			return this.aClass34_2.method535();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!nb;")
	public Class1_Sub1_Sub4 method659() {
		@Pc(4) Class31 local4 = this.aClass31_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass31_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass31_11.method522();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			local11.method515();
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

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBII)V")
	public void method660(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && this.anIntArrayArray23[arg2][arg1] != 0) {
				@Pc(35) byte[] local35 = this.aClient2.aClass46Array1[arg2 + 1].method670(arg1);
				if (!this.method667(local35, this.anIntArrayArray23[arg2][arg1], this.anIntArrayArray24[arg2][arg1])) {
					this.aByteArrayArray5[arg2][arg1] = arg0;
					if (arg0 > this.anInt1000) {
						this.anInt1000 = arg0;
					}
					this.anInt1004++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("72525, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public void method661() {
		try {
			@Pc(2) Class31 local2 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method527();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("65327, " + 9 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != 0) {
				this.aBoolean226 = !this.aBoolean226;
			}
			if (this.aClient2.aClass46Array1[0] != null && (this.anIntArrayArray23[arg1][arg2] != 0 && (this.aByteArrayArray5[arg1][arg2] != 0 && this.anInt1000 != 0))) {
				@Pc(40) Class1_Sub1_Sub4 local40 = new Class1_Sub1_Sub4();
				local40.anInt826 = arg1;
				local40.anInt827 = arg2;
				local40.aBoolean193 = false;
				@Pc(52) Class31 local52 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method520(local40);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("22329, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean228) {
				this.anInt1009++;
				@Pc(11) byte local11 = 20;
				if (this.anInt1000 == 0 && this.aClient2.aClass46Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean229 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean229; local32++) {
					this.aBoolean229 = false;
					this.method663();
					this.method664();
					if (this.anInt1001 == 0 && local32 >= 5) {
						break;
					}
					this.method665();
					if (this.anInputStream2 != null) {
						this.method666();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
					if (local72.aBoolean193) {
						local67 = true;
						local72.anInt828++;
						if (local72.anInt828 > 50) {
							local72.anInt828 = 0;
							this.method668(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						local67 = true;
						local72.anInt828++;
						if (local72.anInt828 > 50) {
							local72.anInt828 = 0;
							this.method668(local72);
						}
					}
				}
				if (local67) {
					this.anInt1007++;
					if (this.anInt1007 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt1006 = 0;
					}
				} else {
					this.anInt1007 = 0;
					this.aString31 = "";
				}
				if (this.aClient2.aBoolean70 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt1000 > 0 || this.aClient2.aClass46Array1[0] == null)) {
					this.anInt1008++;
					if (this.anInt1008 > 500) {
						this.anInt1008 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt1007 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	private void method663() {
		try {
			@Pc(6) Class31 local6 = this.aClass31_8;
			@Pc(13) Class1_Sub1_Sub4 local13;
			synchronized (this.aClass31_8) {
				local13 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
			}
			while (local13 != null) {
				this.aBoolean229 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient2.aClass46Array1[0] != null) {
					local24 = this.aClient2.aClass46Array1[local13.anInt826 + 1].method670(local13.anInt827);
				}
				if (!this.method667(local24, this.anIntArrayArray23[local13.anInt826][local13.anInt827], this.anIntArrayArray24[local13.anInt826][local13.anInt827])) {
					local24 = null;
				}
				@Pc(69) Class31 local69 = this.aClass31_8;
				synchronized (this.aClass31_8) {
					if (local24 == null) {
						this.aClass31_9.method520(local13);
					} else {
						local13.aByteArray10 = local24;
						@Pc(85) Class31 local85 = this.aClass31_11;
						synchronized (this.aClass31_11) {
							this.aClass31_11.method520(local13);
						}
					}
					local13 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("27964, " + 3 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	private void method664() {
		try {
			this.anInt1001 = 0;
			this.anInt1002 = 0;
			@Pc(15) Class1_Sub1_Sub4 local15;
			for (local15 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local15 != null; local15 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
				if (local15.aBoolean193) {
					this.anInt1001++;
				} else {
					this.anInt1002++;
				}
			}
			while (this.anInt1001 < 10) {
				local15 = (Class1_Sub1_Sub4) this.aClass31_9.method522();
				if (local15 == null) {
					break;
				}
				if (this.aByteArrayArray5[local15.anInt826][local15.anInt827] != 0) {
					this.anInt1003++;
				}
				this.aByteArrayArray5[local15.anInt826][local15.anInt827] = 0;
				this.aClass31_10.method520(local15);
				this.anInt1001++;
				this.method668(local15);
				this.aBoolean229 = true;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("70783, " + -529 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	private void method665() {
		try {
			while (this.anInt1001 == 0) {
				if (this.anInt1002 >= 10 || this.anInt1000 == 0) {
					return;
				}
				@Pc(10) Class31 local10 = this.aClass31_12;
				@Pc(17) Class1_Sub1_Sub4 local17;
				synchronized (this.aClass31_12) {
					local17 = (Class1_Sub1_Sub4) this.aClass31_12.method522();
				}
				while (local17 != null) {
					if (this.aByteArrayArray5[local17.anInt826][local17.anInt827] != 0) {
						this.aByteArrayArray5[local17.anInt826][local17.anInt827] = 0;
						this.aClass31_10.method520(local17);
						this.method668(local17);
						this.aBoolean229 = true;
						if (this.anInt1003 < this.anInt1004) {
							this.anInt1003++;
						}
						this.aString31 = "Loading extra files - " + this.anInt1003 * 100 / this.anInt1004 + "%";
						this.anInt1002++;
						if (this.anInt1002 == 10) {
							return;
						}
					}
					local10 = this.aClass31_12;
					synchronized (this.aClass31_12) {
						local17 = (Class1_Sub1_Sub4) this.aClass31_12.method522();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray5[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt1000) {
							local118[local123] = 0;
							local17 = new Class1_Sub1_Sub4();
							local17.anInt826 = local111;
							local17.anInt827 = local123;
							local17.aBoolean193 = false;
							this.aClass31_10.method520(local17);
							this.method668(local17);
							this.aBoolean229 = true;
							if (this.anInt1003 < this.anInt1004) {
								this.anInt1003++;
							}
							this.aString31 = "Loading extra files - " + this.anInt1003 * 100 / this.anInt1004 + "%";
							this.anInt1002++;
							if (this.anInt1002 == 10) {
								return;
							}
						}
					}
				}
				this.anInt1000--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("41003, " + true + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	private void method666() {
		try {
			try {
				@Pc(14) int local14 = this.anInputStream2.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt1006 == 0 && local14 >= 6) {
					this.aBoolean229 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream2.read(this.aByteArray18, local25, 6 - local25)) {
					}
					local49 = this.aByteArray18[0] & 0xFF;
					local65 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(96) Class1_Sub1_Sub4 local96 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local96 != null; local96 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						if (local96.anInt826 == local49 && local96.anInt827 == local65) {
							this.aClass1_Sub1_Sub4_1 = local96;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local96.anInt828 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt1007 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean193) {
								@Pc(154) Class31 local154 = this.aClass31_11;
								synchronized (this.aClass31_11) {
									this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method669();
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
					this.anInt1005 = local88 * 500;
					this.anInt1006 = 500;
					if (this.anInt1006 > local81 - local88 * 500) {
						this.anInt1006 = local81 - local88 * 500;
					}
				}
				if (this.anInt1006 > 0 && local14 >= this.anInt1006) {
					this.aBoolean229 = true;
					@Pc(233) byte[] local233 = this.aByteArray18;
					local49 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local233 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local49 = this.anInt1005;
					}
					for (local65 = 0; local65 < this.anInt1006; local65 += this.anInputStream2.read(local233, local65 + local49, this.anInt1006 - local65)) {
					}
					if (this.anInt1006 + this.anInt1005 >= local233.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass46Array1[0] != null) {
							this.aClient2.aClass46Array1[this.aClass1_Sub1_Sub4_1.anInt826 + 1].method671(local233.length, this.aClass1_Sub1_Sub4_1.anInt827, local233);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean193 && this.aClass1_Sub1_Sub4_1.anInt826 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean193 = true;
							this.aClass1_Sub1_Sub4_1.anInt826 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean193) {
							@Pc(326) Class31 local326 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method669();
						}
					}
					this.anInt1006 = 0;
				}
			} catch (@Pc(347) IOException local347) {
				try {
					this.aSocket2.close();
				} catch (@Pc(352) Exception local352) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt1006 = 0;
			}
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("90663, " + 0 + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIZI)Z")
	private boolean method667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg0, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local48 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("62094, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!nb;)V")
	private void method668(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong34 < 5000L) {
						return;
					}
					this.aLong34 = local11;
					this.aSocket2 = this.aClient2.method186(client.anInt329 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt1007 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt826;
				this.aByteArray18[1] = (byte) (arg0.anInt827 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt827;
				if (arg0.aBoolean193) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean70) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt1008 = 0;
			} catch (@Pc(120) IOException local120) {
				try {
					this.aSocket2.close();
				} catch (@Pc(125) Exception local125) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt1006 = 0;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("50476, " + false + ", " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}
}
