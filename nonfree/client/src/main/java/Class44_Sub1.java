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

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[B")
	private byte[] aByteArray17;

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

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	public int anInt976;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt962 = 942;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt963 = 763;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt964 = 920;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	private int anInt965 = -112;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(0);

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(464);

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(464);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(464);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(464);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(464);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method636(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method666(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(-49365, local31);
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
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(-49365, local104);
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
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(-49365, local104);
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
		local193 = new Class1_Sub1_Sub3(-49365, local104);
		local56 = local104.length / 2;
		this.anIntArray260 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray260[local268] = local193.method482();
		}
		local104 = arg0.method666("midi_index", null);
		local193 = new Class1_Sub1_Sub3(-49365, local104);
		local56 = local104.length;
		this.anIntArray261 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray261[local300] = local193.method480();
		}
		this.aClient5 = arg1;
		this.aBoolean236 = true;
		this.aClient5.method95(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method637() {
		this.aBoolean236 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("70217, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method639() {
		try {
			return this.anIntArray260.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("75876, " + 9 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)I")
	public int method640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray256.length; local7++) {
				if (this.anIntArray256[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray257[local7];
					}
					return this.anIntArray258[local7];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("64652, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public void method641(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) int local5 = this.anIntArray256.length;
			@Pc(10) int local10;
			if (arg0 != 35850) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < local5; local10++) {
				if (arg1 || this.anIntArray259[local10] != 0) {
					this.method648(this.anIntArray258[local10], (byte) 2, 3);
					this.method648(this.anIntArray257[local10], (byte) 2, 3);
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("24462, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public boolean method642(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray256.length; local1++) {
				if (this.anIntArray258[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("7513, " + 28967 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IZ)I")
	public int method643(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("30819, " + arg0 + ", " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Z")
	public boolean method644(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray261[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("25189, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method635(@OriginalArg(0) int arg0) {
		this.method645(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	public void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method518(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method519()) {
				if (local34.anInt791 == arg0 && local34.anInt792 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt791 = arg0;
			local34.anInt792 = arg1;
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZBI)V")
	public void method648(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && this.anIntArrayArray24[arg2][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient5.aClass45Array1[arg2 + 1].method658(arg0);
				if (!this.method655(this.anIntArrayArray25[arg2][arg0], this.anIntArrayArray24[arg2][arg0], local25)) {
					this.aByteArrayArray5[arg2][arg0] = arg1;
					if (arg1 > this.anInt966) {
						this.anInt966 = arg1;
					}
					this.anInt970++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("37552, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method649() {
		try {
			@Pc(2) Class29 local2 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method515();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("18343, " + -44242 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)V")
	public void method650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt966 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt791 = arg0;
				local30.anInt792 = arg1;
				local30.aBoolean202 = false;
				@Pc(42) Class29 local42 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method508(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("36782, " + false + ", " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean236) {
				this.anInt976++;
				@Pc(11) byte local11 = 20;
				if (this.anInt966 == 0 && this.aClient5.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean237 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean237; local32++) {
					this.aBoolean237 = false;
					this.method651();
					this.method652(this.anInt964);
					if (this.anInt967 == 0 && local32 >= 5) {
						break;
					}
					this.method653((byte) 8);
					if (this.anInputStream2 != null) {
						this.method654();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class1_Sub1_Sub4 local73;
				for (local73 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
					if (local73.aBoolean202) {
						local68 = true;
						local73.anInt793++;
						if (local73.anInt793 > 50) {
							local73.anInt793 = 0;
							this.method656(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local73 != null; local73 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						local68 = true;
						local73.anInt793++;
						if (local73.anInt793 > 50) {
							local73.anInt793 = 0;
							this.method656(local73);
						}
					}
				}
				if (local68) {
					this.anInt974++;
					if (this.anInt974 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt973 = 0;
					}
				} else {
					this.anInt974 = 0;
					this.aString30 = "";
				}
				if (this.aClient5.aBoolean71 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt966 > 0 || this.aClient5.aClass45Array1[0] == null)) {
					this.anInt975++;
					if (this.anInt975 > 500) {
						this.anInt975 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt974 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method651() {
		try {
			@Pc(4) Class29 local4 = this.aClass29_8;
			@Pc(11) Class1_Sub1_Sub4 local11;
			synchronized (this.aClass29_8) {
				local11 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
			}
			while (local11 != null) {
				this.aBoolean237 = true;
				@Pc(33) byte[] local33 = null;
				if (this.aClient5.aClass45Array1[0] != null) {
					local33 = this.aClient5.aClass45Array1[local11.anInt791 + 1].method658(local11.anInt792);
				}
				if (!this.method655(this.anIntArrayArray25[local11.anInt791][local11.anInt792], this.anIntArrayArray24[local11.anInt791][local11.anInt792], local33)) {
					local33 = null;
				}
				@Pc(78) Class29 local78 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local33 == null) {
						this.aClass29_9.method508(local11);
					} else {
						local11.aByteArray10 = local33;
						@Pc(94) Class29 local94 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method508(local11);
						}
					}
					local11 = (Class1_Sub1_Sub4) this.aClass29_8.method510();
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("3366, " + -169 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method652(@OriginalArg(0) int arg0) {
		try {
			this.anInt967 = 0;
			if (arg0 <= 0) {
				for (@Pc(8) int local8 = 1; local8 > 0; local8++) {
				}
			}
			this.anInt968 = 0;
			@Pc(21) Class1_Sub1_Sub4 local21;
			for (local21 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local21 != null; local21 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
				if (local21.aBoolean202) {
					this.anInt967++;
				} else {
					this.anInt968++;
				}
			}
			while (this.anInt967 < 10) {
				local21 = (Class1_Sub1_Sub4) this.aClass29_9.method510();
				if (local21 == null) {
					break;
				}
				if (this.aByteArrayArray5[local21.anInt791][local21.anInt792] != 0) {
					this.anInt969++;
				}
				this.aByteArrayArray5[local21.anInt791][local21.anInt792] = 0;
				this.aClass29_10.method508(local21);
				this.anInt967++;
				this.method656(local21);
				this.aBoolean237 = true;
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("36467, " + arg0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method653(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (this.anInt967 == 0) {
				if (this.anInt968 >= 10 || this.anInt966 == 0) {
					return;
				}
				@Pc(23) Class29 local23 = this.aClass29_12;
				@Pc(30) Class1_Sub1_Sub4 local30;
				synchronized (this.aClass29_12) {
					local30 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
				}
				while (local30 != null) {
					if (this.aByteArrayArray5[local30.anInt791][local30.anInt792] != 0) {
						this.aByteArrayArray5[local30.anInt791][local30.anInt792] = 0;
						this.aClass29_10.method508(local30);
						this.method656(local30);
						this.aBoolean237 = true;
						if (this.anInt969 < this.anInt970) {
							this.anInt969++;
						}
						this.aString30 = "Loading extra files - " + this.anInt969 * 100 / this.anInt970 + "%";
						this.anInt968++;
						if (this.anInt968 == 10) {
							return;
						}
					}
					local23 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local30 = (Class1_Sub1_Sub4) this.aClass29_12.method510();
					}
				}
				for (@Pc(124) int local124 = 0; local124 < 4; local124++) {
					@Pc(131) byte[] local131 = this.aByteArrayArray5[local124];
					@Pc(134) int local134 = local131.length;
					for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
						if (local131[local136] == this.anInt966) {
							local131[local136] = 0;
							local30 = new Class1_Sub1_Sub4();
							local30.anInt791 = local124;
							local30.anInt792 = local136;
							local30.aBoolean202 = false;
							this.aClass29_10.method508(local30);
							this.method656(local30);
							this.aBoolean237 = true;
							if (this.anInt969 < this.anInt970) {
								this.anInt969++;
							}
							this.aString30 = "Loading extra files - " + this.anInt969 * 100 / this.anInt970 + "%";
							this.anInt968++;
							if (this.anInt968 == 10) {
								return;
							}
						}
					}
				}
				this.anInt966--;
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("75620, " + arg0 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	private void method654() {
		try {
			try {
				@Pc(17) int local17 = this.anInputStream2.available();
				@Pc(52) int local52;
				@Pc(68) int local68;
				if (this.anInt973 == 0 && local17 >= 6) {
					this.aBoolean237 = true;
					for (@Pc(28) int local28 = 0; local28 < 6; local28 += this.anInputStream2.read(this.aByteArray18, local28, 6 - local28)) {
					}
					local52 = this.aByteArray18[0] & 0xFF;
					local68 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(84) int local84 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(91) int local91 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(99) Class1_Sub1_Sub4 local99 = (Class1_Sub1_Sub4) this.aClass29_10.method511(); local99 != null; local99 = (Class1_Sub1_Sub4) this.aClass29_10.method513()) {
						if (local99.anInt791 == local52 && local99.anInt792 == local68) {
							this.aClass1_Sub1_Sub4_1 = local99;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local99.anInt793 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt974 = 0;
						if (local84 == 0) {
							signlink.reporterror("Rej: " + local52 + "," + local68);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean202) {
								@Pc(157) Class29 local157 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method673();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local91 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local84];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local91 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt972 = local91 * 500;
					this.anInt973 = 500;
					if (this.anInt973 > local84 - local91 * 500) {
						this.anInt973 = local84 - local91 * 500;
					}
				}
				if (this.anInt973 > 0 && local17 >= this.anInt973) {
					this.aBoolean237 = true;
					@Pc(236) byte[] local236 = this.aByteArray18;
					local52 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local236 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local52 = this.anInt972;
					}
					for (local68 = 0; local68 < this.anInt973; local68 += this.anInputStream2.read(local236, local68 + local52, this.anInt973 - local68)) {
					}
					if (this.anInt973 + this.anInt972 >= local236.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass45Array1[0] != null) {
							this.aClient5.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt791 + 1].method659(this.aClass1_Sub1_Sub4_1.anInt792, (byte) 9, local236.length, local236);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean202 && this.aClass1_Sub1_Sub4_1.anInt791 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean202 = true;
							this.aClass1_Sub1_Sub4_1.anInt791 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean202) {
							@Pc(329) Class29 local329 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method508(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method673();
						}
					}
					this.anInt973 = 0;
				}
			} catch (@Pc(350) IOException local350) {
				try {
					this.aSocket3.close();
				} catch (@Pc(355) Exception local355) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt973 = 0;
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("1127, " + -112 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ[B)Z")
	private boolean method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg2, 0, local12);
			@Pc(47) int local47 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local47 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("62736, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!mb;)V")
	private void method656(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket3 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local10;
					this.aSocket3 = this.aClient5.method168(client.anInt340 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream2.read();
					}
					this.anInt974 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt791;
				this.aByteArray18[1] = (byte) (arg0.anInt792 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt792;
				if (arg0.aBoolean202) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient5.aBoolean71) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt975 = 0;
				this.anInt971 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket3.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt973 = 0;
				this.anInt971++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("46120, " + 114 + ", " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
