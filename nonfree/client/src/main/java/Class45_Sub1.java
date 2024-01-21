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

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	public int anInt979;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt969 = 1;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(true);

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31(-767);

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31(-767);

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31(-767);

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31(-767);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31(-767);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Ljava/lang/String;")
	public String aString31 = "";

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method648(@OriginalArg(0) Class48 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method678(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 337);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 337);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 337);
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
		local193 = new Class1_Sub1_Sub3(local104, 337);
		local56 = local104.length / 2;
		this.anIntArray262 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray262[local268] = local193.method500();
		}
		local104 = arg0.method678("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 337);
		local56 = local104.length;
		this.anIntArray263 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray263[local300] = local193.method498();
		}
		this.aClient2 = arg1;
		this.aBoolean226 = true;
		this.aClient2.method96(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method649() {
		this.aBoolean226 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public int method650(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray23[arg0].length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("49019, " + arg0 + ", " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)I")
	public int method651(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean225 = !this.aBoolean225;
			}
			return this.anIntArray262.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("1880, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(16) int local16 = (arg2 << 8) + arg0;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray258.length; local18++) {
				if (this.anIntArray258[local18] == local16) {
					if (arg1 == 0) {
						return this.anIntArray259[local18];
					}
					return this.anIntArray260[local18];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("54343, " + arg0 + ", " + arg1 + ", " + -371 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	public void method653(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray258.length;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				if (arg0 || this.anIntArray261[local8] != 0) {
					this.method660((byte) 2, this.anIntArray260[local8], 3);
					this.method660((byte) 2, this.anIntArray259[local8], 3);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("3101, " + 0 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z")
	public boolean method654(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray258.length; local8++) {
				if (this.anIntArray260[local8] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("5210, " + arg0 + ", " + -47341 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)I")
	public int method655(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("18163, " + 4 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IZ)Z")
	public boolean method656(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray263[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("90499, " + arg0 + ", " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method647(@OriginalArg(0) int arg0) {
		this.method657(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)V")
	public void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method533(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method534()) {
				if (local34.anInt796 == arg0 && local34.anInt797 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt796 = arg0;
			local34.anInt797 = arg1;
			local34.aBoolean197 = true;
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
				@Pc(25) byte[] local25 = this.aClient2.aClass46Array1[arg2 + 1].method670(arg1);
				if (!this.method667(this.anIntArrayArray24[arg2][arg1], local25, this.anIntArrayArray23[arg2][arg1])) {
					this.aByteArrayArray5[arg2][arg1] = arg0;
					if (arg0 > this.anInt970) {
						this.anInt970 = arg0;
					}
					this.anInt974++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("57149, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public void method661() {
		try {
			@Pc(12) Class31 local12 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method527();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("37823, " + -391 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
	public void method662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && (this.anIntArrayArray23[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt970 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt796 = arg0;
				local30.anInt797 = arg1;
				local30.aBoolean197 = false;
				@Pc(45) Class31 local45 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method520(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("49128, " + false + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean226) {
				this.anInt979++;
				@Pc(11) byte local11 = 20;
				if (this.anInt970 == 0 && this.aClient2.aClass46Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean227 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean227; local32++) {
					this.aBoolean227 = false;
					this.method663();
					this.method664();
					if (this.anInt971 == 0 && local32 >= 5) {
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
					if (local72.aBoolean197) {
						local67 = true;
						local72.anInt798++;
						if (local72.anInt798 > 50) {
							local72.anInt798 = 0;
							this.method668(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						local67 = true;
						local72.anInt798++;
						if (local72.anInt798 > 50) {
							local72.anInt798 = 0;
							this.method668(local72);
						}
					}
				}
				if (local67) {
					this.anInt977++;
					if (this.anInt977 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt976 = 0;
					}
				} else {
					this.anInt977 = 0;
					this.aString31 = "";
				}
				if (this.aClient2.aBoolean46 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt970 > 0 || this.aClient2.aClass46Array1[0] == null)) {
					this.anInt978++;
					if (this.anInt978 > 500) {
						this.anInt978 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt977 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	private void method663() {
		try {
			@Pc(9) Class31 local9 = this.aClass31_8;
			@Pc(16) Class1_Sub1_Sub4 local16;
			synchronized (this.aClass31_8) {
				local16 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
			}
			while (local16 != null) {
				this.aBoolean227 = true;
				@Pc(27) byte[] local27 = null;
				if (this.aClient2.aClass46Array1[0] != null) {
					local27 = this.aClient2.aClass46Array1[local16.anInt796 + 1].method670(local16.anInt797);
				}
				if (!this.method667(this.anIntArrayArray24[local16.anInt796][local16.anInt797], local27, this.anIntArrayArray23[local16.anInt796][local16.anInt797])) {
					local27 = null;
				}
				@Pc(72) Class31 local72 = this.aClass31_8;
				synchronized (this.aClass31_8) {
					if (local27 == null) {
						this.aClass31_9.method520(local16);
					} else {
						local16.aByteArray10 = local27;
						@Pc(88) Class31 local88 = this.aClass31_11;
						synchronized (this.aClass31_11) {
							this.aClass31_11.method520(local16);
						}
					}
					local16 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("16016, " + 1 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	private void method664() {
		try {
			this.anInt971 = 0;
			this.anInt972 = 0;
			@Pc(22) Class1_Sub1_Sub4 local22;
			for (local22 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local22 != null; local22 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
				if (local22.aBoolean197) {
					this.anInt971++;
				} else {
					this.anInt972++;
				}
			}
			while (this.anInt971 < 10) {
				local22 = (Class1_Sub1_Sub4) this.aClass31_9.method522();
				if (local22 == null) {
					break;
				}
				if (this.aByteArrayArray5[local22.anInt796][local22.anInt797] != 0) {
					this.anInt973++;
				}
				this.aByteArrayArray5[local22.anInt796][local22.anInt797] = 0;
				this.aClass31_10.method520(local22);
				this.anInt971++;
				this.method668(local22);
				this.aBoolean227 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("76476, " + -193 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
	private void method665() {
		try {
			while (this.anInt971 == 0) {
				if (this.anInt972 >= 10 || this.anInt970 == 0) {
					return;
				}
				@Pc(10) Class31 local10 = this.aClass31_12;
				@Pc(17) Class1_Sub1_Sub4 local17;
				synchronized (this.aClass31_12) {
					local17 = (Class1_Sub1_Sub4) this.aClass31_12.method522();
				}
				while (local17 != null) {
					if (this.aByteArrayArray5[local17.anInt796][local17.anInt797] != 0) {
						this.aByteArrayArray5[local17.anInt796][local17.anInt797] = 0;
						this.aClass31_10.method520(local17);
						this.method668(local17);
						this.aBoolean227 = true;
						if (this.anInt973 < this.anInt974) {
							this.anInt973++;
						}
						this.aString31 = "Loading extra files - " + this.anInt973 * 100 / this.anInt974 + "%";
						this.anInt972++;
						if (this.anInt972 == 10) {
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
						if (local118[local123] == this.anInt970) {
							local118[local123] = 0;
							local17 = new Class1_Sub1_Sub4();
							local17.anInt796 = local111;
							local17.anInt797 = local123;
							local17.aBoolean197 = false;
							this.aClass31_10.method520(local17);
							this.method668(local17);
							this.aBoolean227 = true;
							if (this.anInt973 < this.anInt974) {
								this.anInt973++;
							}
							this.aString31 = "Loading extra files - " + this.anInt973 * 100 / this.anInt974 + "%";
							this.anInt972++;
							if (this.anInt972 == 10) {
								return;
							}
						}
					}
				}
				this.anInt970--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("25143, " + true + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	private void method666() {
		try {
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt976 == 0 && local9 >= 6) {
					this.aBoolean227 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
					}
					local44 = this.aByteArray18[0] & 0xFF;
					local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						if (local91.anInt796 == local44 && local91.anInt797 == local60) {
							this.aClass1_Sub1_Sub4_1 = local91;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local91.anInt798 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt977 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean197) {
								@Pc(149) Class31 local149 = this.aClass31_11;
								synchronized (this.aClass31_11) {
									this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
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
					this.anInt975 = local83 * 500;
					this.anInt976 = 500;
					if (this.anInt976 > local76 - local83 * 500) {
						this.anInt976 = local76 - local83 * 500;
					}
				}
				if (this.anInt976 > 0 && local9 >= this.anInt976) {
					this.aBoolean227 = true;
					@Pc(228) byte[] local228 = this.aByteArray18;
					local44 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local228 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local44 = this.anInt975;
					}
					for (local60 = 0; local60 < this.anInt976; local60 += this.anInputStream2.read(local228, local60 + local44, this.anInt976 - local60)) {
					}
					if (this.anInt976 + this.anInt975 >= local228.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass46Array1[0] != null) {
							this.aClient2.aClass46Array1[this.aClass1_Sub1_Sub4_1.anInt796 + 1].method671(local228, this.aClass1_Sub1_Sub4_1.anInt797, local228.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean197 && this.aClass1_Sub1_Sub4_1.anInt796 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean197 = true;
							this.aClass1_Sub1_Sub4_1.anInt796 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean197) {
							@Pc(321) Class31 local321 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method669();
						}
					}
					this.anInt976 = 0;
				}
			} catch (@Pc(342) IOException local342) {
				try {
					this.aSocket2.close();
				} catch (@Pc(347) Exception local347) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt976 = 0;
			}
		} catch (@Pc(361) RuntimeException local361) {
			signlink.reporterror("95050, " + 19519 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB[BI)Z")
	private boolean method667(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg1, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_2.getValue();
			if (local28 == arg2) {
				return local48 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("26191, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method668(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong34 < 5000L) {
						return;
					}
					this.aLong34 = local9;
					this.aSocket2 = this.aClient2.method131(client.anInt262 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt977 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt796;
				this.aByteArray18[1] = (byte) (arg0.anInt797 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt797;
				if (arg0.aBoolean197) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean46) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt978 = 0;
			} catch (@Pc(118) IOException local118) {
				try {
					this.aSocket2.close();
				} catch (@Pc(123) Exception local123) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt976 = 0;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("75807, " + arg0 + ", " + 231 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
