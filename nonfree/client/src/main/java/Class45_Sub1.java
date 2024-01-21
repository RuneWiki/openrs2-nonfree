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

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
	public int anInt979;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt967 = 73;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt969 = 2;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(956);

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31((byte) 9);

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31((byte) 9);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31((byte) 9);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31((byte) 9);

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31((byte) 9);

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method660(@OriginalArg(0) Class48 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method689(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, true);
			this.anIntArrayArray24[local22] = new int[local36];
			this.aByteArrayArray7[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray24[local22][local56] = local42.method505();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method689(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, true);
			this.anIntArrayArray25[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray25[local36][local123] = local115.method508();
			}
		}
		local104 = arg0.method689("model_index", null);
		local56 = this.anIntArrayArray24[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method689("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, true);
		local56 = local104.length / 7;
		this.anIntArray269 = new int[local56];
		this.anIntArray270 = new int[local56];
		this.anIntArray271 = new int[local56];
		this.anIntArray272 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray269[local216] = local193.method505();
			this.anIntArray270[local216] = local193.method505();
			this.anIntArray271[local216] = local193.method505();
			this.anIntArray272[local216] = local193.method503();
		}
		local104 = arg0.method689("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, true);
		local56 = local104.length / 2;
		this.anIntArray273 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray273[local268] = local193.method505();
		}
		local104 = arg0.method689("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, true);
		local56 = local104.length;
		this.anIntArray274 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray274[local300] = local193.method503();
		}
		this.aClient2 = arg1;
		this.aBoolean231 = true;
		this.aClient2.method90(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method661() {
		this.aBoolean231 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public int method662(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("65128, " + 73 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
	public int method663() {
		try {
			return this.anIntArray273.length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("3959, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) int local17 = (arg0 << 8) + arg2;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray269.length; local19++) {
				if (this.anIntArray269[local19] == local17) {
					if (arg1 == 0) {
						return this.anIntArray270[local19];
					}
					return this.anIntArray271[local19];
				}
			}
			return -1;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("31423, " + 23320 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V")
	public void method665(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray269.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray272[local16] != 0) {
					this.method672(this.anIntArray271[local16], (byte) 2, 3);
					this.method672(this.anIntArray270[local16], (byte) 2, 3);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("29346, " + arg0 + ", " + 2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z")
	public boolean method666(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray269.length; local1++) {
				if (this.anIntArray271[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57114, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)I")
	public int method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("10144, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)Z")
	public boolean method668(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			return this.anIntArray274[arg1] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("45164, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method659(@OriginalArg(0) int arg0) {
		this.method669(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)V")
	public void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method541(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method542(633)) {
				if (local34.anInt779 == arg0 && local34.anInt780 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt779 = arg0;
			local34.anInt780 = arg1;
			local34.aBoolean190 = true;
			@Pc(71) Class31 local71 = this.aClass31_8;
			synchronized (this.aClass31_8) {
				this.aClass31_8.method531(local34);
			}
			this.aClass34_2.method539(local34);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	public int method670() {
		@Pc(2) Class34 local2 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			return this.aClass34_2.method543();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!nb;")
	public Class1_Sub1_Sub4 method671() {
		@Pc(4) Class31 local4 = this.aClass31_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass31_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass31_11.method533();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			local11.method691();
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

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBZI)V")
	public void method672(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && this.anIntArrayArray24[arg2][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass46Array1[arg2 + 1].method681(arg0);
				if (!this.method679(this.anIntArrayArray24[arg2][arg0], this.anIntArrayArray25[arg2][arg0], this.anInt969, local25)) {
					this.aByteArrayArray7[arg2][arg0] = arg1;
					if (arg1 > this.anInt970) {
						this.anInt970 = arg1;
					}
					this.anInt974++;
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("19392, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public void method673() {
		try {
			@Pc(2) Class31 local2 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method538();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("25125, " + 29974 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
	public void method674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray7[arg0][arg1] != 0 && this.anInt970 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt779 = arg0;
				local30.anInt780 = arg1;
				local30.aBoolean190 = false;
				@Pc(46) Class31 local46 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method531(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("58881, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean231) {
				this.anInt979++;
				@Pc(11) byte local11 = 20;
				if (this.anInt970 == 0 && this.aClient2.aClass46Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean232 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean232; local32++) {
					this.aBoolean232 = false;
					this.method675();
					this.method676(this.anInt968);
					if (this.anInt971 == 0 && local32 >= 5) {
						break;
					}
					this.method677();
					if (this.anInputStream2 != null) {
						this.method678(24);
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class1_Sub1_Sub4 local73;
				for (local73 = (Class1_Sub1_Sub4) this.aClass31_10.method534(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass31_10.method536(633)) {
					if (local73.aBoolean190) {
						local68 = true;
						local73.anInt781++;
						if (local73.anInt781 > 50) {
							local73.anInt781 = 0;
							this.method680(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class1_Sub1_Sub4) this.aClass31_10.method534(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass31_10.method536(633)) {
						local68 = true;
						local73.anInt781++;
						if (local73.anInt781 > 50) {
							local73.anInt781 = 0;
							this.method680(local73);
						}
					}
				}
				if (local68) {
					this.anInt977++;
					if (this.anInt977 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt976 = 0;
					}
				} else {
					this.anInt977 = 0;
					this.aString30 = "";
				}
				if (this.aClient2.aBoolean81 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt970 > 0 || this.aClient2.aClass46Array1[0] == null)) {
					this.anInt978++;
					if (this.anInt978 > 500) {
						this.anInt978 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt977 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	private void method675() {
		try {
			@Pc(13) Class31 local13 = this.aClass31_8;
			@Pc(20) Class1_Sub1_Sub4 local20;
			synchronized (this.aClass31_8) {
				local20 = (Class1_Sub1_Sub4) this.aClass31_8.method533();
			}
			while (local20 != null) {
				this.aBoolean232 = true;
				@Pc(31) byte[] local31 = null;
				if (this.aClient2.aClass46Array1[0] != null) {
					local31 = this.aClient2.aClass46Array1[local20.anInt779 + 1].method681(local20.anInt780);
				}
				if (!this.method679(this.anIntArrayArray24[local20.anInt779][local20.anInt780], this.anIntArrayArray25[local20.anInt779][local20.anInt780], this.anInt969, local31)) {
					local31 = null;
				}
				@Pc(77) Class31 local77 = this.aClass31_8;
				synchronized (this.aClass31_8) {
					if (local31 == null) {
						this.aClass31_9.method531(local20);
					} else {
						local20.aByteArray10 = local31;
						@Pc(93) Class31 local93 = this.aClass31_11;
						synchronized (this.aClass31_11) {
							this.aClass31_11.method531(local20);
						}
					}
					local20 = (Class1_Sub1_Sub4) this.aClass31_8.method533();
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("31903, " + -104 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	private void method676(@OriginalArg(0) int arg0) {
		try {
			this.anInt971 = 0;
			this.anInt972 = 0;
			if (arg0 == 0) {
				@Pc(15) Class1_Sub1_Sub4 local15;
				for (local15 = (Class1_Sub1_Sub4) this.aClass31_10.method534(); local15 != null; local15 = (Class1_Sub1_Sub4) this.aClass31_10.method536(633)) {
					if (local15.aBoolean190) {
						this.anInt971++;
					} else {
						this.anInt972++;
					}
				}
				while (this.anInt971 < 10) {
					local15 = (Class1_Sub1_Sub4) this.aClass31_9.method533();
					if (local15 == null) {
						break;
					}
					if (this.aByteArrayArray7[local15.anInt779][local15.anInt780] != 0) {
						this.anInt973++;
					}
					this.aByteArrayArray7[local15.anInt779][local15.anInt780] = 0;
					this.aClass31_10.method531(local15);
					this.anInt971++;
					this.method680(local15);
					this.aBoolean232 = true;
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("87407, " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	private void method677() {
		try {
			while (this.anInt971 == 0) {
				if (this.anInt972 >= 10 || this.anInt970 == 0) {
					return;
				}
				@Pc(11) Class31 local11 = this.aClass31_12;
				@Pc(18) Class1_Sub1_Sub4 local18;
				synchronized (this.aClass31_12) {
					local18 = (Class1_Sub1_Sub4) this.aClass31_12.method533();
				}
				while (local18 != null) {
					if (this.aByteArrayArray7[local18.anInt779][local18.anInt780] != 0) {
						this.aByteArrayArray7[local18.anInt779][local18.anInt780] = 0;
						this.aClass31_10.method531(local18);
						this.method680(local18);
						this.aBoolean232 = true;
						if (this.anInt973 < this.anInt974) {
							this.anInt973++;
						}
						this.aString30 = "Loading extra files - " + this.anInt973 * 100 / this.anInt974 + "%";
						this.anInt972++;
						if (this.anInt972 == 10) {
							return;
						}
					}
					local11 = this.aClass31_12;
					synchronized (this.aClass31_12) {
						local18 = (Class1_Sub1_Sub4) this.aClass31_12.method533();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray7[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt970) {
							local119[local124] = 0;
							local18 = new Class1_Sub1_Sub4();
							local18.anInt779 = local112;
							local18.anInt780 = local124;
							local18.aBoolean190 = false;
							this.aClass31_10.method531(local18);
							this.method680(local18);
							this.aBoolean232 = true;
							if (this.anInt973 < this.anInt974) {
								this.anInt973++;
							}
							this.aString30 = "Loading extra files - " + this.anInt973 * 100 / this.anInt974 + "%";
							this.anInt972++;
							if (this.anInt972 == 10) {
								return;
							}
						}
					}
				}
				this.anInt970--;
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("7790, " + 8 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	private void method678(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = true;
			try {
				@Pc(9) int local9 = this.anInputStream2.available();
				@Pc(44) int local44;
				@Pc(60) int local60;
				if (this.anInt976 == 0 && local9 >= 6) {
					this.aBoolean232 = true;
					for (@Pc(20) int local20 = 0; local20 < 6; local20 += this.anInputStream2.read(this.aByteArray18, local20, 6 - local20)) {
					}
					local44 = this.aByteArray18[0] & 0xFF;
					local60 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(76) int local76 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(83) int local83 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(91) Class1_Sub1_Sub4 local91 = (Class1_Sub1_Sub4) this.aClass31_10.method534(); local91 != null; local91 = (Class1_Sub1_Sub4) this.aClass31_10.method536(633)) {
						if (local91.anInt779 == local44 && local91.anInt780 == local60) {
							this.aClass1_Sub1_Sub4_1 = local91;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local91.anInt781 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt977 = 0;
						if (local76 == 0) {
							signlink.reporterror("Rej: " + local44 + "," + local60);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean190) {
								@Pc(149) Class31 local149 = this.aClass31_11;
								synchronized (this.aClass31_11) {
									this.aClass31_11.method531(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method690();
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
					this.aBoolean232 = true;
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
							this.aClient2.aClass46Array1[this.aClass1_Sub1_Sub4_1.anInt779 + 1].method682(local228, this.aClass1_Sub1_Sub4_1.anInt780, local228.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean190 && this.aClass1_Sub1_Sub4_1.anInt779 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean190 = true;
							this.aClass1_Sub1_Sub4_1.anInt779 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean190) {
							@Pc(321) Class31 local321 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method531(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method690();
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
			signlink.reporterror("75923, " + arg0 + ", " + local361.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[B)Z")
	private boolean method679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg2 < 2 || arg2 > 2) {
				this.anInt967 = 133;
			}
			if (arg3 == null || arg3.length < 2) {
				return false;
			}
			@Pc(21) int local21 = arg3.length - 2;
			@Pc(37) int local37 = ((arg3[local21] & 0xFF) << 8) + (arg3[local21 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg3, 0, local21);
			@Pc(51) int local51 = (int) this.aCRC32_2.getValue();
			if (local37 == arg0) {
				return local51 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("85828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nb;Z)V")
	private void method680(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong33 < 5000L) {
						return;
					}
					this.aLong33 = local9;
					this.aSocket2 = this.aClient2.method116(client.anInt310 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt977 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt779;
				this.aByteArray18[1] = (byte) (arg0.anInt780 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt780;
				if (arg0.aBoolean190) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean81) {
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
			signlink.reporterror("52188, " + arg0 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
