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

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	private int anInt968;

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
	private int anInt969;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
	public int anInt977;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt965 = -33617;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "B")
	private byte aByte41 = 8;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt966 = 7;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Z")
	private boolean aBoolean254 = true;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt967 = 6;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "B")
	private byte aByte42 = 3;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "B")
	private byte aByte43 = 79;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(2);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31((byte) -118);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31((byte) -118);

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31((byte) -118);

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31((byte) -118);

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31((byte) -118);

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
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(16, local31);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(16, local104);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(16, local104);
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
		local193 = new Class1_Sub1_Sub3(16, local104);
		local56 = local104.length / 2;
		this.anIntArray262 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray262[local268] = local193.method500();
		}
		local104 = arg0.method678("midi_index", null);
		local193 = new Class1_Sub1_Sub3(16, local104);
		local56 = local104.length;
		this.anIntArray263 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray263[local300] = local193.method498();
		}
		this.aClient2 = arg1;
		this.aBoolean255 = true;
		this.aClient2.method96(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method649() {
		this.aBoolean255 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)I")
	public int method650(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte42 != 3) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.anIntArrayArray23[arg0].length;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("90302, " + arg0 + ", " + 3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
	public int method651() {
		try {
			return this.anIntArray262.length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("69212, " + 3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray258.length; local7++) {
				if (this.anIntArray258[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray259[local7];
					}
					return this.anIntArray260[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("28268, " + 31009 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
	public void method653(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray258.length;
			for (@Pc(10) int local10 = 0; local10 < local3; local10++) {
				if (arg0 || this.anIntArray261[local10] != 0) {
					this.method660(3, this.anIntArray260[local10], (byte) 2);
					this.method660(3, this.anIntArray259[local10], (byte) 2);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("34512, " + arg0 + ", " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Z")
	public boolean method654(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray258.length; local7++) {
				if (this.anIntArray260[local7] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("25055, " + arg0 + ", " + 30646 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)I")
	public int method655(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("87772, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z")
	public boolean method656(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray263[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("58422, " + -31662 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method647(@OriginalArg(0) int arg0) {
		this.method657(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
	public void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method533(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method534()) {
				if (local34.anInt804 == arg0 && local34.anInt805 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt804 = arg0;
			local34.anInt805 = arg1;
			local34.aBoolean222 = true;
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

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIBI)V")
	public void method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && this.anIntArrayArray23[arg0][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass46Array1[arg0 + 1].method670(891, arg1);
				if (!this.method667(local25, this.anIntArrayArray23[arg0][arg1], this.anIntArrayArray24[arg0][arg1])) {
					this.aByteArrayArray5[arg0][arg1] = arg2;
					if (arg2 > this.anInt968) {
						this.anInt968 = arg2;
					}
					this.anInt972++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("15315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 33601 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public void method661() {
		try {
			@Pc(7) Class31 local7 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method527();
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53065, " + -491 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)V")
	public void method662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && (this.anIntArrayArray23[arg1][arg0] != 0 && (this.aByteArrayArray5[arg1][arg0] != 0 && this.anInt968 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt804 = arg1;
				local30.anInt805 = arg0;
				local30.aBoolean222 = false;
				@Pc(46) Class31 local46 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method520(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("73762, " + 70 + ", " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean255) {
				this.anInt977++;
				@Pc(11) byte local11 = 20;
				if (this.anInt968 == 0 && this.aClient2.aClass46Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean256 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean256; local32++) {
					this.aBoolean256 = false;
					this.method663();
					this.method664();
					if (this.anInt969 == 0 && local32 >= 5) {
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
					if (local72.aBoolean222) {
						local67 = true;
						local72.anInt806++;
						if (local72.anInt806 > 50) {
							local72.anInt806 = 0;
							this.method668(local72, (byte) 1);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						local67 = true;
						local72.anInt806++;
						if (local72.anInt806 > 50) {
							local72.anInt806 = 0;
							this.method668(local72, (byte) 1);
						}
					}
				}
				if (local67) {
					this.anInt975++;
					if (this.anInt975 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt974 = 0;
					}
				} else {
					this.anInt975 = 0;
					this.aString31 = "";
				}
				if (this.aClient2.aBoolean74 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt968 > 0 || this.aClient2.aClass46Array1[0] == null)) {
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

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	private void method663() {
		try {
			@Pc(4) Class31 local4 = this.aClass31_8;
			@Pc(11) Class1_Sub1_Sub4 local11;
			synchronized (this.aClass31_8) {
				local11 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
			}
			while (local11 != null) {
				this.aBoolean256 = true;
				@Pc(34) byte[] local34 = null;
				if (this.aClient2.aClass46Array1[0] != null) {
					local34 = this.aClient2.aClass46Array1[local11.anInt804 + 1].method670(891, local11.anInt805);
				}
				if (!this.method667(local34, this.anIntArrayArray23[local11.anInt804][local11.anInt805], this.anIntArrayArray24[local11.anInt804][local11.anInt805])) {
					local34 = null;
				}
				@Pc(79) Class31 local79 = this.aClass31_8;
				synchronized (this.aClass31_8) {
					if (local34 == null) {
						this.aClass31_9.method520(local11);
					} else {
						local11.aByteArray10 = local34;
						@Pc(95) Class31 local95 = this.aClass31_11;
						synchronized (this.aClass31_11) {
							this.aClass31_11.method520(local11);
						}
					}
					local11 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("47196, " + 38100 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	private void method664() {
		try {
			this.anInt969 = 0;
			this.anInt970 = 0;
			@Pc(16) Class1_Sub1_Sub4 local16;
			for (local16 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local16 != null; local16 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
				if (local16.aBoolean222) {
					this.anInt969++;
				} else {
					this.anInt970++;
				}
			}
			while (this.anInt969 < 10) {
				local16 = (Class1_Sub1_Sub4) this.aClass31_9.method522();
				if (local16 == null) {
					break;
				}
				if (this.aByteArrayArray5[local16.anInt804][local16.anInt805] != 0) {
					this.anInt971++;
				}
				this.aByteArrayArray5[local16.anInt804][local16.anInt805] = 0;
				this.aClass31_10.method520(local16);
				this.anInt969++;
				this.method668(local16, (byte) 1);
				this.aBoolean256 = true;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("68148, " + 2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	private void method665() {
		try {
			while (this.anInt969 == 0) {
				if (this.anInt970 >= 10 || this.anInt968 == 0) {
					return;
				}
				@Pc(20) Class31 local20 = this.aClass31_12;
				@Pc(27) Class1_Sub1_Sub4 local27;
				synchronized (this.aClass31_12) {
					local27 = (Class1_Sub1_Sub4) this.aClass31_12.method522();
				}
				while (local27 != null) {
					if (this.aByteArrayArray5[local27.anInt804][local27.anInt805] != 0) {
						this.aByteArrayArray5[local27.anInt804][local27.anInt805] = 0;
						this.aClass31_10.method520(local27);
						this.method668(local27, (byte) 1);
						this.aBoolean256 = true;
						if (this.anInt971 < this.anInt972) {
							this.anInt971++;
						}
						this.aString31 = "Loading extra files - " + this.anInt971 * 100 / this.anInt972 + "%";
						this.anInt970++;
						if (this.anInt970 == 10) {
							return;
						}
					}
					local20 = this.aClass31_12;
					synchronized (this.aClass31_12) {
						local27 = (Class1_Sub1_Sub4) this.aClass31_12.method522();
					}
				}
				for (@Pc(121) int local121 = 0; local121 < 4; local121++) {
					@Pc(128) byte[] local128 = this.aByteArrayArray5[local121];
					@Pc(131) int local131 = local128.length;
					for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
						if (local128[local133] == this.anInt968) {
							local128[local133] = 0;
							local27 = new Class1_Sub1_Sub4();
							local27.anInt804 = local121;
							local27.anInt805 = local133;
							local27.aBoolean222 = false;
							this.aClass31_10.method520(local27);
							this.method668(local27, (byte) 1);
							this.aBoolean256 = true;
							if (this.anInt971 < this.anInt972) {
								this.anInt971++;
							}
							this.aString31 = "Loading extra files - " + this.anInt971 * 100 / this.anInt972 + "%";
							this.anInt970++;
							if (this.anInt970 == 10) {
								return;
							}
						}
					}
				}
				this.anInt968--;
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("58629, " + 0 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	private void method666() {
		try {
			try {
				@Pc(14) int local14 = this.anInputStream2.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt974 == 0 && local14 >= 6) {
					this.aBoolean256 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream2.read(this.aByteArray18, local25, 6 - local25)) {
					}
					local49 = this.aByteArray18[0] & 0xFF;
					local65 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(96) Class1_Sub1_Sub4 local96 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local96 != null; local96 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						if (local96.anInt804 == local49 && local96.anInt805 == local65) {
							this.aClass1_Sub1_Sub4_1 = local96;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local96.anInt806 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt975 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean222) {
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
					this.anInt973 = local88 * 500;
					this.anInt974 = 500;
					if (this.anInt974 > local81 - local88 * 500) {
						this.anInt974 = local81 - local88 * 500;
					}
				}
				if (this.anInt974 > 0 && local14 >= this.anInt974) {
					this.aBoolean256 = true;
					@Pc(233) byte[] local233 = this.aByteArray18;
					local49 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local233 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local49 = this.anInt973;
					}
					for (local65 = 0; local65 < this.anInt974; local65 += this.anInputStream2.read(local233, local65 + local49, this.anInt974 - local65)) {
					}
					if (this.anInt974 + this.anInt973 >= local233.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass46Array1[0] != null) {
							this.aClient2.aClass46Array1[this.aClass1_Sub1_Sub4_1.anInt804 + 1].method671(this.aClass1_Sub1_Sub4_1.anInt805, local233, this.aByte41, local233.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean222 && this.aClass1_Sub1_Sub4_1.anInt804 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean222 = true;
							this.aClass1_Sub1_Sub4_1.anInt804 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean222) {
							@Pc(327) Class31 local327 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method669();
						}
					}
					this.anInt974 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket2.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt974 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("8890, " + false + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIIB)Z")
	private boolean method667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			if (this.aByte43 != 79) {
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
			signlink.reporterror("71557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 79 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nb;B)V")
	private void method668(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				if (this.aSocket2 == null) {
					@Pc(14) long local14 = System.currentTimeMillis();
					if (local14 - this.aLong34 < 5000L) {
						return;
					}
					this.aLong34 = local14;
					this.aSocket2 = this.aClient2.method167(client.anInt292 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(49) int local49 = 0; local49 < 8; local49++) {
						this.anInputStream2.read();
					}
					this.anInt975 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt804;
				this.aByteArray18[1] = (byte) (arg0.anInt805 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt805;
				if (arg0.aBoolean222) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean74) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt976 = 0;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket2.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt974 = 0;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("52884, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
