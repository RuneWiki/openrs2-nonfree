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
public final class Class43_Sub1 extends Class43 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private static int anInt975 = 855;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	private int anInt976 = -66;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt977 = -971;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt978 = -49612;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34(anInt975);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31(false);

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method644(@OriginalArg(0) Class46 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method674(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, false);
			this.anIntArrayArray23[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray23[local22][local56] = local42.method498();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method674(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, false);
			this.anIntArrayArray24[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray24[local36][local123] = local115.method501();
			}
		}
		local104 = arg0.method674("model_index", null);
		local56 = this.anIntArrayArray23[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method674("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, false);
		local56 = local104.length / 7;
		this.anIntArray257 = new int[local56];
		this.anIntArray258 = new int[local56];
		this.anIntArray259 = new int[local56];
		this.anIntArray260 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray257[local216] = local193.method498();
			this.anIntArray258[local216] = local193.method498();
			this.anIntArray259[local216] = local193.method498();
			this.anIntArray260[local216] = local193.method496();
		}
		local104 = arg0.method674("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, false);
		local56 = local104.length / 2;
		this.anIntArray261 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray261[local268] = local193.method498();
		}
		local104 = arg0.method674("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, false);
		local56 = local104.length;
		this.anIntArray262 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray262[local300] = local193.method496();
		}
		this.aClient2 = arg1;
		this.aBoolean215 = true;
		this.aClient2.method96(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method645() {
		this.aBoolean215 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public int method646(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray23[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("50466, " + arg0 + ", " + -66 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
	public int method647() {
		try {
			return this.anIntArray261.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("41652, " + -318 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)I")
	public int method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = (arg1 << 8) + arg2;
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray257.length; local22++) {
				if (this.anIntArray257[local22] == local7) {
					if (arg0 == 0) {
						return this.anIntArray258[local22];
					}
					return this.anIntArray259[local22];
				}
			}
			return -1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("25477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	public void method649(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray257.length;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				if (arg0 || this.anIntArray260[local8] != 0) {
					this.method656(this.anIntArray259[local8], 3, (byte) 2);
					this.method656(this.anIntArray258[local8], 3, (byte) 2);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("65296, " + -777 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z")
	public boolean method650(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray257.length; local3++) {
				if (this.anIntArray259[local3] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("65131, " + -971 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)I")
	public int method651(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("55270, " + arg0 + ", " + -84 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)Z")
	public boolean method652(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt978 != -49612) {
				this.aBoolean214 = !this.aBoolean214;
			}
			return this.anIntArray262[arg0] == 1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("26641, " + -49612 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method643(@OriginalArg(0) int arg0) {
		this.method653(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(II)V")
	public void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method533(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method534()) {
				if (local34.anInt806 == arg0 && local34.anInt807 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt806 = arg0;
			local34.anInt807 = arg1;
			local34.aBoolean185 = true;
			@Pc(71) Class31 local71 = this.aClass31_8;
			synchronized (this.aClass31_8) {
				this.aClass31_8.method521(local34);
			}
			this.aClass34_2.method531(local34);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	public int method654() {
		@Pc(2) Class34 local2 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			return this.aClass34_2.method535();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!nb;")
	public Class1_Sub1_Sub4 method655() {
		@Pc(4) Class31 local4 = this.aClass31_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass31_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass31_11.method523();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			local11.method513();
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
	public void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aClient2.aClass44Array1[0] != null && this.anIntArrayArray23[arg1][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass44Array1[arg1 + 1].method666(arg0);
				if (!this.method663(local25, this.anIntArrayArray24[arg1][arg0], this.anIntArrayArray23[arg1][arg0])) {
					this.aByteArrayArray5[arg1][arg0] = arg2;
					if (arg2 > this.anInt980) {
						this.anInt980 = arg2;
					}
					this.anInt984++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("52593, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public void method657() {
		try {
			@Pc(5) Class31 local5 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method528();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("34506, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass44Array1[0] != null && (this.anIntArrayArray23[arg1][arg0] != 0 && (this.aByteArrayArray5[arg1][arg0] != 0 && this.anInt980 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt806 = arg1;
				local30.anInt807 = arg0;
				local30.aBoolean185 = false;
				@Pc(52) Class31 local52 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method521(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("22609, " + -26459 + ", " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean215) {
				this.anInt989++;
				@Pc(11) byte local11 = 20;
				if (this.anInt980 == 0 && this.aClient2.aClass44Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean216 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean216; local32++) {
					this.aBoolean216 = false;
					this.method659();
					this.method660();
					if (this.anInt981 == 0 && local32 >= 5) {
						break;
					}
					this.method661();
					if (this.anInputStream2 != null) {
						this.method662(this.anInt979);
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class1_Sub1_Sub4 local73;
				for (local73 = (Class1_Sub1_Sub4) this.aClass31_10.method524(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass31_10.method526()) {
					if (local73.aBoolean185) {
						local68 = true;
						local73.anInt808++;
						if (local73.anInt808 > 50) {
							local73.anInt808 = 0;
							this.method664(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class1_Sub1_Sub4) this.aClass31_10.method524(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass31_10.method526()) {
						local68 = true;
						local73.anInt808++;
						if (local73.anInt808 > 50) {
							local73.anInt808 = 0;
							this.method664(local73);
						}
					}
				}
				if (local68) {
					this.anInt987++;
					if (this.anInt987 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt986 = 0;
					}
				} else {
					this.anInt987 = 0;
					this.aString30 = "";
				}
				if (this.aClient2.aBoolean55 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt980 > 0 || this.aClient2.aClass44Array1[0] == null)) {
					this.anInt988++;
					if (this.anInt988 > 500) {
						this.anInt988 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt987 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
	private void method659() {
		try {
			@Pc(7) Class31 local7 = this.aClass31_8;
			@Pc(14) Class1_Sub1_Sub4 local14;
			synchronized (this.aClass31_8) {
				local14 = (Class1_Sub1_Sub4) this.aClass31_8.method523();
			}
			while (local14 != null) {
				this.aBoolean216 = true;
				@Pc(25) byte[] local25 = null;
				if (this.aClient2.aClass44Array1[0] != null) {
					local25 = this.aClient2.aClass44Array1[local14.anInt806 + 1].method666(local14.anInt807);
				}
				if (!this.method663(local25, this.anIntArrayArray24[local14.anInt806][local14.anInt807], this.anIntArrayArray23[local14.anInt806][local14.anInt807])) {
					local25 = null;
				}
				@Pc(70) Class31 local70 = this.aClass31_8;
				synchronized (this.aClass31_8) {
					if (local25 == null) {
						this.aClass31_9.method521(local14);
					} else {
						local14.aByteArray10 = local25;
						@Pc(86) Class31 local86 = this.aClass31_11;
						synchronized (this.aClass31_11) {
							this.aClass31_11.method521(local14);
						}
					}
					local14 = (Class1_Sub1_Sub4) this.aClass31_8.method523();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("43436, " + true + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	private void method660() {
		try {
			this.anInt981 = 0;
			this.anInt982 = 0;
			@Pc(18) Class1_Sub1_Sub4 local18;
			for (local18 = (Class1_Sub1_Sub4) this.aClass31_10.method524(); local18 != null; local18 = (Class1_Sub1_Sub4) this.aClass31_10.method526()) {
				if (local18.aBoolean185) {
					this.anInt981++;
				} else {
					this.anInt982++;
				}
			}
			while (this.anInt981 < 10) {
				local18 = (Class1_Sub1_Sub4) this.aClass31_9.method523();
				if (local18 == null) {
					break;
				}
				if (this.aByteArrayArray5[local18.anInt806][local18.anInt807] != 0) {
					this.anInt983++;
				}
				this.aByteArrayArray5[local18.anInt806][local18.anInt807] = 0;
				this.aClass31_10.method521(local18);
				this.anInt981++;
				this.method664(local18);
				this.aBoolean216 = true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("74665, " + 35142 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)V")
	private void method661() {
		try {
			while (this.anInt981 == 0) {
				if (this.anInt982 >= 10 || this.anInt980 == 0) {
					return;
				}
				@Pc(18) Class31 local18 = this.aClass31_12;
				@Pc(25) Class1_Sub1_Sub4 local25;
				synchronized (this.aClass31_12) {
					local25 = (Class1_Sub1_Sub4) this.aClass31_12.method523();
				}
				while (local25 != null) {
					if (this.aByteArrayArray5[local25.anInt806][local25.anInt807] != 0) {
						this.aByteArrayArray5[local25.anInt806][local25.anInt807] = 0;
						this.aClass31_10.method521(local25);
						this.method664(local25);
						this.aBoolean216 = true;
						if (this.anInt983 < this.anInt984) {
							this.anInt983++;
						}
						this.aString30 = "Loading extra files - " + this.anInt983 * 100 / this.anInt984 + "%";
						this.anInt982++;
						if (this.anInt982 == 10) {
							return;
						}
					}
					local18 = this.aClass31_12;
					synchronized (this.aClass31_12) {
						local25 = (Class1_Sub1_Sub4) this.aClass31_12.method523();
					}
				}
				for (@Pc(119) int local119 = 0; local119 < 4; local119++) {
					@Pc(126) byte[] local126 = this.aByteArrayArray5[local119];
					@Pc(129) int local129 = local126.length;
					for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
						if (local126[local131] == this.anInt980) {
							local126[local131] = 0;
							local25 = new Class1_Sub1_Sub4();
							local25.anInt806 = local119;
							local25.anInt807 = local131;
							local25.aBoolean185 = false;
							this.aClass31_10.method521(local25);
							this.method664(local25);
							this.aBoolean216 = true;
							if (this.anInt983 < this.anInt984) {
								this.anInt983++;
							}
							this.aString30 = "Loading extra files - " + this.anInt983 * 100 / this.anInt984 + "%";
							this.anInt982++;
							if (this.anInt982 == 10) {
								return;
							}
						}
					}
				}
				this.anInt980--;
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("34565, " + false + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	private void method662(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt978 = 216;
			}
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt986 == 0 && local10 >= 6) {
					this.aBoolean216 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray18, local21, 6 - local21)) {
					}
					local45 = this.aByteArray18[0] & 0xFF;
					local61 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(92) Class1_Sub1_Sub4 local92 = (Class1_Sub1_Sub4) this.aClass31_10.method524(); local92 != null; local92 = (Class1_Sub1_Sub4) this.aClass31_10.method526()) {
						if (local92.anInt806 == local45 && local92.anInt807 == local61) {
							this.aClass1_Sub1_Sub4_1 = local92;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local92.anInt808 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt987 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean185) {
								@Pc(150) Class31 local150 = this.aClass31_11;
								synchronized (this.aClass31_11) {
									this.aClass31_11.method521(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method665();
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
					this.anInt985 = local84 * 500;
					this.anInt986 = 500;
					if (this.anInt986 > local77 - local84 * 500) {
						this.anInt986 = local77 - local84 * 500;
					}
				}
				if (this.anInt986 > 0 && local10 >= this.anInt986) {
					this.aBoolean216 = true;
					@Pc(229) byte[] local229 = this.aByteArray18;
					local45 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local229 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local45 = this.anInt985;
					}
					for (local61 = 0; local61 < this.anInt986; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt986 - local61)) {
					}
					if (this.anInt986 + this.anInt985 >= local229.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass44Array1[0] != null) {
							this.aClient2.aClass44Array1[this.aClass1_Sub1_Sub4_1.anInt806 + 1].method667(local229, this.aClass1_Sub1_Sub4_1.anInt807, local229.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean185 && this.aClass1_Sub1_Sub4_1.anInt806 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean185 = true;
							this.aClass1_Sub1_Sub4_1.anInt806 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean185) {
							@Pc(322) Class31 local322 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method521(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method665();
						}
					}
					this.anInt986 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket2.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt986 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("24370, " + arg0 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII)Z")
	private boolean method663(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("9, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nb;B)V")
	private void method664(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(16) long local16 = System.currentTimeMillis();
					if (local16 - this.aLong34 < 5000L) {
						return;
					}
					this.aLong34 = local16;
					this.aSocket2 = this.aClient2.method227(client.anInt385 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
						this.anInputStream2.read();
					}
					this.anInt987 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt806;
				this.aByteArray18[1] = (byte) (arg0.anInt807 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt807;
				if (arg0.aBoolean185) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean55) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt988 = 0;
			} catch (@Pc(125) IOException local125) {
				try {
					this.aSocket2.close();
				} catch (@Pc(130) Exception local130) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt986 = 0;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("61188, " + arg0 + ", " + 0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
