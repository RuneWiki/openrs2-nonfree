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

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt973 = -102;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	private int anInt974 = -62;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt975 = 810;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(0);

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Ljava/lang/String;")
	public String aString31 = "";

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method648(@OriginalArg(0) Class48 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method678(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, (byte) 3);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, (byte) 3);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, (byte) 3);
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
		local193 = new Class1_Sub1_Sub3(local104, (byte) 3);
		local56 = local104.length / 2;
		this.anIntArray262 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray262[local268] = local193.method500();
		}
		local104 = arg0.method678("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, (byte) 3);
		local56 = local104.length;
		this.anIntArray263 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray263[local300] = local193.method498();
		}
		this.aClient2 = arg1;
		this.aBoolean238 = true;
		this.aClient2.method96(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method649() {
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)I")
	public int method650(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray23[arg0].length;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("62159, " + arg0 + ", " + -1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)I")
	public int method651() {
		try {
			return this.anIntArray262.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("83911, " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = (arg0 << 8) + arg1;
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray258.length; local9++) {
				if (this.anIntArray258[local9] == local7) {
					if (arg2 == 0) {
						return this.anIntArray259[local9];
					}
					return this.anIntArray260[local9];
				}
			}
			return arg3 < 0 ? -1 : 2;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("59422, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	public void method653(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray258.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray261[local5] != 0) {
					this.method660(3, (byte) 2, this.anIntArray260[local5]);
					this.method660(3, (byte) 2, this.anIntArray259[local5]);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("70552, " + 41461 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)Z")
	public boolean method654(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray258.length; local3++) {
				if (this.anIntArray260[local3] == arg0) {
					return true;
				}
			}
			@Pc(24) boolean local24 = false;
			return false;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("31183, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I")
	public int method655(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("24972, " + 5 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IZ)Z")
	public boolean method656(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray263[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("95152, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method647(@OriginalArg(0) int arg0) {
		this.method657(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method533(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method534()) {
				if (local34.anInt805 == arg0 && local34.anInt806 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt805 = arg0;
			local34.anInt806 = arg1;
			local34.aBoolean205 = true;
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
	public void method660(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && this.anIntArrayArray23[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass46Array1[arg0 + 1].method670(arg2);
				if (!this.method667(local25, this.anIntArrayArray23[arg0][arg2], this.anIntArrayArray24[arg0][arg2])) {
					this.aByteArrayArray5[arg0][arg2] = arg1;
					if (arg1 > this.anInt976) {
						this.anInt976 = arg1;
					}
					this.anInt980++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("67853, " + 810 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
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
			signlink.reporterror("59253, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient2.aClass46Array1[0] != null && (this.anIntArrayArray23[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt976 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt805 = arg0;
				local30.anInt806 = arg1;
				local30.aBoolean205 = false;
				@Pc(52) Class31 local52 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method520(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("58476, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean238) {
				this.anInt985++;
				@Pc(11) byte local11 = 20;
				if (this.anInt976 == 0 && this.aClient2.aClass46Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean239 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean239; local32++) {
					this.aBoolean239 = false;
					this.method663();
					this.method664();
					if (this.anInt977 == 0 && local32 >= 5) {
						break;
					}
					this.method665(this.aBoolean237);
					if (this.anInputStream2 != null) {
						this.method666();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class1_Sub1_Sub4 local73;
				for (local73 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
					if (local73.aBoolean205) {
						local68 = true;
						local73.anInt807++;
						if (local73.anInt807 > 50) {
							local73.anInt807 = 0;
							this.method668(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						local68 = true;
						local73.anInt807++;
						if (local73.anInt807 > 50) {
							local73.anInt807 = 0;
							this.method668(local73);
						}
					}
				}
				if (local68) {
					this.anInt983++;
					if (this.anInt983 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt982 = 0;
					}
				} else {
					this.anInt983 = 0;
					this.aString31 = "";
				}
				if (this.aClient2.aBoolean46 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt976 > 0 || this.aClient2.aClass46Array1[0] == null)) {
					this.anInt984++;
					if (this.anInt984 > 500) {
						this.anInt984 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt983 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	private void method663() {
		try {
			@Pc(6) Class31 local6 = this.aClass31_8;
			@Pc(13) Class1_Sub1_Sub4 local13;
			synchronized (this.aClass31_8) {
				local13 = (Class1_Sub1_Sub4) this.aClass31_8.method522();
			}
			while (local13 != null) {
				this.aBoolean239 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient2.aClass46Array1[0] != null) {
					local24 = this.aClient2.aClass46Array1[local13.anInt805 + 1].method670(local13.anInt806);
				}
				if (!this.method667(local24, this.anIntArrayArray23[local13.anInt805][local13.anInt806], this.anIntArrayArray24[local13.anInt805][local13.anInt806])) {
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
			signlink.reporterror("71318, " + 2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	private void method664() {
		try {
			this.anInt977 = 0;
			this.anInt978 = 0;
			@Pc(21) Class1_Sub1_Sub4 local21;
			for (local21 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local21 != null; local21 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
				if (local21.aBoolean205) {
					this.anInt977++;
				} else {
					this.anInt978++;
				}
			}
			while (this.anInt977 < 10) {
				local21 = (Class1_Sub1_Sub4) this.aClass31_9.method522();
				if (local21 == null) {
					break;
				}
				if (this.aByteArrayArray5[local21.anInt805][local21.anInt806] != 0) {
					this.anInt979++;
				}
				this.aByteArrayArray5[local21.anInt805][local21.anInt806] = 0;
				this.aClass31_10.method520(local21);
				this.anInt977++;
				this.method668(local21);
				this.aBoolean239 = true;
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("85337, " + 908 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
	private void method665(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				while (this.anInt977 == 0) {
					if (this.anInt978 >= 10 || this.anInt976 == 0) {
						return;
					}
					@Pc(10) Class31 local10 = this.aClass31_12;
					@Pc(17) Class1_Sub1_Sub4 local17;
					synchronized (this.aClass31_12) {
						local17 = (Class1_Sub1_Sub4) this.aClass31_12.method522();
					}
					while (local17 != null) {
						if (this.aByteArrayArray5[local17.anInt805][local17.anInt806] != 0) {
							this.aByteArrayArray5[local17.anInt805][local17.anInt806] = 0;
							this.aClass31_10.method520(local17);
							this.method668(local17);
							this.aBoolean239 = true;
							if (this.anInt979 < this.anInt980) {
								this.anInt979++;
							}
							this.aString31 = "Loading extra files - " + this.anInt979 * 100 / this.anInt980 + "%";
							this.anInt978++;
							if (this.anInt978 == 10) {
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
							if (local118[local123] == this.anInt976) {
								local118[local123] = 0;
								local17 = new Class1_Sub1_Sub4();
								local17.anInt805 = local111;
								local17.anInt806 = local123;
								local17.aBoolean205 = false;
								this.aClass31_10.method520(local17);
								this.method668(local17);
								this.aBoolean239 = true;
								if (this.anInt979 < this.anInt980) {
									this.anInt979++;
								}
								this.aString31 = "Loading extra files - " + this.anInt979 * 100 / this.anInt980 + "%";
								this.anInt978++;
								if (this.anInt978 == 10) {
									return;
								}
							}
						}
					}
					this.anInt976--;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("27941, " + arg0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	private void method666() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt982 == 0 && local10 >= 6) {
					this.aBoolean239 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray18, local21, 6 - local21)) {
					}
					local45 = this.aByteArray18[0] & 0xFF;
					local61 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(92) Class1_Sub1_Sub4 local92 = (Class1_Sub1_Sub4) this.aClass31_10.method523(); local92 != null; local92 = (Class1_Sub1_Sub4) this.aClass31_10.method525()) {
						if (local92.anInt805 == local45 && local92.anInt806 == local61) {
							this.aClass1_Sub1_Sub4_1 = local92;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local92.anInt807 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt983 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean205) {
								@Pc(150) Class31 local150 = this.aClass31_11;
								synchronized (this.aClass31_11) {
									this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method669();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local84 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local77];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt981 = local84 * 500;
					this.anInt982 = 500;
					if (this.anInt982 > local77 - local84 * 500) {
						this.anInt982 = local77 - local84 * 500;
					}
				}
				if (this.anInt982 > 0 && local10 >= this.anInt982) {
					this.aBoolean239 = true;
					@Pc(229) byte[] local229 = this.aByteArray18;
					local45 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local229 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local45 = this.anInt981;
					}
					for (local61 = 0; local61 < this.anInt982; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt982 - local61)) {
					}
					if (this.anInt982 + this.anInt981 >= local229.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass46Array1[0] != null) {
							this.aClient2.aClass46Array1[this.aClass1_Sub1_Sub4_1.anInt805 + 1].method671(local229.length, this.aClass1_Sub1_Sub4_1.anInt806, local229, this.aBoolean235);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean205 && this.aClass1_Sub1_Sub4_1.anInt805 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean205 = true;
							this.aClass1_Sub1_Sub4_1.anInt805 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean205) {
							@Pc(323) Class31 local323 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method520(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method669();
						}
					}
					this.anInt982 = 0;
				}
			} catch (@Pc(344) IOException local344) {
				try {
					this.aSocket2.close();
				} catch (@Pc(349) Exception local349) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt982 = 0;
			}
		} catch (@Pc(363) RuntimeException local363) {
			signlink.reporterror("11999, " + 0 + ", " + local363.toString());
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
			@Pc(52) int local52 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local52 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("51310, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method668(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong34 < 5000L) {
						return;
					}
					this.aLong34 = local10;
					this.aSocket2 = this.aClient2.method111(client.anInt262 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream2.read();
					}
					this.anInt983 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt805;
				this.aByteArray18[1] = (byte) (arg0.anInt806 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt806;
				if (arg0.aBoolean205) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean46) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt984 = 0;
			} catch (@Pc(119) IOException local119) {
				try {
					this.aSocket2.close();
				} catch (@Pc(124) Exception local124) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt982 = 0;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("237, " + arg0 + ", " + 6 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}
}
