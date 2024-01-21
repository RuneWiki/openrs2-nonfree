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

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt948 = 106;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[4][];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!pb;")
	private Class32 aClass32_2 = new Class32(false);

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!ob;")
	private Class29 aClass29_8 = new Class29(false);

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
	private Class29 aClass29_9 = new Class29(false);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
	private Class29 aClass29_10 = new Class29(false);

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
	private Class29 aClass29_11 = new Class29(false);

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
	private Class29 aClass29_12 = new Class29(false);

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
	public void method630(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method660(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, 185);
			this.anIntArrayArray24[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray24[local22][local56] = local42.method476();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method660(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, 185);
			this.anIntArrayArray25[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray25[local36][local123] = local115.method479();
			}
		}
		local104 = arg0.method660("model_index", null);
		local56 = this.anIntArrayArray24[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method660("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, 185);
		local56 = local104.length / 7;
		this.anIntArray253 = new int[local56];
		this.anIntArray254 = new int[local56];
		this.anIntArray255 = new int[local56];
		this.anIntArray256 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray253[local216] = local193.method476();
			this.anIntArray254[local216] = local193.method476();
			this.anIntArray255[local216] = local193.method476();
			this.anIntArray256[local216] = local193.method474();
		}
		local104 = arg0.method660("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 185);
		local56 = local104.length / 2;
		this.anIntArray257 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray257[local268] = local193.method476();
		}
		local104 = arg0.method660("midi_index", null);
		local193 = new Class1_Sub1_Sub3(local104, 185);
		local56 = local104.length;
		this.anIntArray258 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray258[local300] = local193.method474();
		}
		this.aClient2 = arg1;
		this.aBoolean240 = true;
		this.aClient2.method94(this, 2);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method631() {
		this.aBoolean240 = false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method632(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray24[arg0].length;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("53962, " + arg0 + ", " + -833 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method633() {
		try {
			return this.anIntArray257.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("77362, " + -937 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZ)I")
	public int method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = (arg1 << 8) + arg2;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray253.length; local18++) {
				if (this.anIntArray253[local18] == local7) {
					if (arg0 == 0) {
						return this.anIntArray254[local18];
					}
					return this.anIntArray255[local18];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("99122, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
	public void method635(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(19) int local19 = this.anIntArray253.length;
			for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
				if (arg1 || this.anIntArray256[local21] != 0) {
					this.method642(this.anIntArray255[local21], (byte) 2, 3);
					this.method642(this.anIntArray254[local21], (byte) 2, 3);
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("90669, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public boolean method636(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray253.length; local12++) {
				if (this.anIntArray255[local12] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("31556, " + 5 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)I")
	public int method637(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("35452, " + arg0 + ", " + 30455 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)Z")
	public boolean method638(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray258[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("31759, " + -685 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method629(@OriginalArg(0) int arg0) {
		this.method639(0, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(II)V")
	public void method639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class32 local27 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass32_2.method512(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass32_2.method513()) {
				if (local34.anInt767 == arg0 && local34.anInt768 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt767 = arg0;
			local34.anInt768 = arg1;
			local34.aBoolean200 = true;
			@Pc(71) Class29 local71 = this.aClass29_8;
			synchronized (this.aClass29_8) {
				this.aClass29_8.method502(local34);
			}
			this.aClass32_2.method510(local34);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
	public int method640() {
		@Pc(2) Class32 local2 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			return this.aClass32_2.method514();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!mb;")
	public Class1_Sub1_Sub4 method641() {
		@Pc(4) Class29 local4 = this.aClass29_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass29_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass29_11.method504();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class32 local24 = this.aClass32_2;
		synchronized (this.aClass32_2) {
			local11.method669();
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

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBII)V")
	public void method642(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && this.anIntArrayArray24[arg2][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass45Array1[arg2 + 1].method652(arg0);
				if (!this.method649(local25, this.anIntArrayArray24[arg2][arg0], this.anIntArrayArray25[arg2][arg0])) {
					this.aByteArrayArray5[arg2][arg0] = arg1;
					if (arg1 > this.anInt950) {
						this.anInt950 = arg1;
					}
					this.anInt954++;
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("97925, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method643() {
		try {
			@Pc(2) Class29 local2 = this.aClass29_12;
			synchronized (this.aClass29_12) {
				this.aClass29_12.method509();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("50143, " + -5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)V")
	public void method644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && (this.anIntArrayArray24[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt950 != 0))) {
				@Pc(33) Class1_Sub1_Sub4 local33 = new Class1_Sub1_Sub4();
				local33.anInt767 = arg0;
				local33.anInt768 = arg1;
				local33.aBoolean200 = false;
				@Pc(45) Class29 local45 = this.aClass29_12;
				synchronized (this.aClass29_12) {
					this.aClass29_12.method502(local33);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("7896, " + false + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean240) {
				this.anInt960++;
				@Pc(11) byte local11 = 20;
				if (this.anInt950 == 0 && this.aClient2.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean241 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean241; local32++) {
					this.aBoolean241 = false;
					this.method645();
					this.method646();
					if (this.anInt951 == 0 && local32 >= 5) {
						break;
					}
					this.method647();
					if (this.anInputStream2 != null) {
						this.method648();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class1_Sub1_Sub4 local72;
				for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method505(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method507()) {
					if (local72.aBoolean200) {
						local67 = true;
						local72.anInt769++;
						if (local72.anInt769 > 50) {
							local72.anInt769 = 0;
							this.method650(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class1_Sub1_Sub4) this.aClass29_10.method505(); local72 != null; local72 = (Class1_Sub1_Sub4) this.aClass29_10.method507()) {
						local67 = true;
						local72.anInt769++;
						if (local72.anInt769 > 50) {
							local72.anInt769 = 0;
							this.method650(local72);
						}
					}
				}
				if (local67) {
					this.anInt958++;
					if (this.anInt958 > 750) {
						try {
							this.aSocket3.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket3 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt957 = 0;
					}
				} else {
					this.anInt958 = 0;
					this.aString30 = "";
				}
				if (this.aClient2.aBoolean90 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt950 > 0 || this.aClient2.aClass45Array1[0] == null)) {
					this.anInt959++;
					if (this.anInt959 > 500) {
						this.anInt959 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt958 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	private void method645() {
		try {
			@Pc(7) Class29 local7 = this.aClass29_8;
			@Pc(14) Class1_Sub1_Sub4 local14;
			synchronized (this.aClass29_8) {
				local14 = (Class1_Sub1_Sub4) this.aClass29_8.method504();
			}
			while (local14 != null) {
				this.aBoolean241 = true;
				@Pc(25) byte[] local25 = null;
				if (this.aClient2.aClass45Array1[0] != null) {
					local25 = this.aClient2.aClass45Array1[local14.anInt767 + 1].method652(local14.anInt768);
				}
				if (!this.method649(local25, this.anIntArrayArray24[local14.anInt767][local14.anInt768], this.anIntArrayArray25[local14.anInt767][local14.anInt768])) {
					local25 = null;
				}
				@Pc(70) Class29 local70 = this.aClass29_8;
				synchronized (this.aClass29_8) {
					if (local25 == null) {
						this.aClass29_9.method502(local14);
					} else {
						local14.aByteArray10 = local25;
						@Pc(86) Class29 local86 = this.aClass29_11;
						synchronized (this.aClass29_11) {
							this.aClass29_11.method502(local14);
						}
					}
					local14 = (Class1_Sub1_Sub4) this.aClass29_8.method504();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("2659, " + true + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	private void method646() {
		try {
			this.anInt951 = 0;
			this.anInt952 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass29_10.method505(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass29_10.method507()) {
				if (local12.aBoolean200) {
					this.anInt951++;
				} else {
					this.anInt952++;
				}
			}
			while (this.anInt951 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass29_9.method504();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray5[local12.anInt767][local12.anInt768] != 0) {
					this.anInt953++;
				}
				this.aByteArrayArray5[local12.anInt767][local12.anInt768] = 0;
				this.aClass29_10.method502(local12);
				this.anInt951++;
				this.method650(local12);
				this.aBoolean241 = true;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("5654, " + false + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	private void method647() {
		try {
			while (this.anInt951 == 0) {
				if (this.anInt952 >= 10 || this.anInt950 == 0) {
					return;
				}
				@Pc(19) Class29 local19 = this.aClass29_12;
				@Pc(26) Class1_Sub1_Sub4 local26;
				synchronized (this.aClass29_12) {
					local26 = (Class1_Sub1_Sub4) this.aClass29_12.method504();
				}
				while (local26 != null) {
					if (this.aByteArrayArray5[local26.anInt767][local26.anInt768] != 0) {
						this.aByteArrayArray5[local26.anInt767][local26.anInt768] = 0;
						this.aClass29_10.method502(local26);
						this.method650(local26);
						this.aBoolean241 = true;
						if (this.anInt953 < this.anInt954) {
							this.anInt953++;
						}
						this.aString30 = "Loading extra files - " + this.anInt953 * 100 / this.anInt954 + "%";
						this.anInt952++;
						if (this.anInt952 == 10) {
							return;
						}
					}
					local19 = this.aClass29_12;
					synchronized (this.aClass29_12) {
						local26 = (Class1_Sub1_Sub4) this.aClass29_12.method504();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray5[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt950) {
							local127[local132] = 0;
							local26 = new Class1_Sub1_Sub4();
							local26.anInt767 = local120;
							local26.anInt768 = local132;
							local26.aBoolean200 = false;
							this.aClass29_10.method502(local26);
							this.method650(local26);
							this.aBoolean241 = true;
							if (this.anInt953 < this.anInt954) {
								this.anInt953++;
							}
							this.aString30 = "Loading extra files - " + this.anInt953 * 100 / this.anInt954 + "%";
							this.anInt952++;
							if (this.anInt952 == 10) {
								return;
							}
						}
					}
				}
				this.anInt950--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("94162, " + 3 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method648() {
		try {
			try {
				@Pc(16) int local16 = this.anInputStream2.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt957 == 0 && local16 >= 6) {
					this.aBoolean241 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream2.read(this.aByteArray18, local27, 6 - local27)) {
					}
					local51 = this.aByteArray18[0] & 0xFF;
					local67 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(98) Class1_Sub1_Sub4 local98 = (Class1_Sub1_Sub4) this.aClass29_10.method505(); local98 != null; local98 = (Class1_Sub1_Sub4) this.aClass29_10.method507()) {
						if (local98.anInt767 == local51 && local98.anInt768 == local67) {
							this.aClass1_Sub1_Sub4_1 = local98;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local98.anInt769 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt958 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean200) {
								@Pc(156) Class29 local156 = this.aClass29_11;
								synchronized (this.aClass29_11) {
									this.aClass29_11.method502(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method668();
							}
							this.aClass1_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local90 == 0) {
								this.aClass1_Sub1_Sub4_1.aByteArray10 = new byte[local83];
							}
							if (this.aClass1_Sub1_Sub4_1.aByteArray10 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt956 = local90 * 500;
					this.anInt957 = 500;
					if (this.anInt957 > local83 - local90 * 500) {
						this.anInt957 = local83 - local90 * 500;
					}
				}
				if (this.anInt957 > 0 && local16 >= this.anInt957) {
					this.aBoolean241 = true;
					@Pc(235) byte[] local235 = this.aByteArray18;
					local51 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local235 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local51 = this.anInt956;
					}
					for (local67 = 0; local67 < this.anInt957; local67 += this.anInputStream2.read(local235, local67 + local51, this.anInt957 - local67)) {
					}
					if (this.anInt957 + this.anInt956 >= local235.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass45Array1[0] != null) {
							this.aClient2.aClass45Array1[this.aClass1_Sub1_Sub4_1.anInt767 + 1].method653(local235, this.aClass1_Sub1_Sub4_1.anInt768, local235.length);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean200 && this.aClass1_Sub1_Sub4_1.anInt767 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean200 = true;
							this.aClass1_Sub1_Sub4_1.anInt767 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean200) {
							@Pc(328) Class29 local328 = this.aClass29_11;
							synchronized (this.aClass29_11) {
								this.aClass29_11.method502(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method668();
						}
					}
					this.anInt957 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket3.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt957 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("69728, " + 79 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BII)Z")
	private boolean method649(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg0, 0, local12);
			@Pc(47) int local47 = (int) this.aCRC32_2.getValue();
			if (local28 == arg1) {
				return local47 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("49142, " + -557 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;I)V")
	private void method650(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket3 == null) {
					@Pc(10) long local10 = System.currentTimeMillis();
					if (local10 - this.aLong31 < 4000L) {
						return;
					}
					this.aLong31 = local10;
					this.aSocket3 = this.aClient2.method185(client.anInt248 + 43594);
					this.anInputStream2 = this.aSocket3.getInputStream();
					this.anOutputStream2 = this.aSocket3.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(45) int local45 = 0; local45 < 8; local45++) {
						this.anInputStream2.read();
					}
					this.anInt958 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt767;
				this.aByteArray18[1] = (byte) (arg0.anInt768 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt768;
				if (arg0.aBoolean200) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient2.aBoolean90) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt959 = 0;
				this.anInt955 = -10000;
			} catch (@Pc(122) IOException local122) {
				try {
					this.aSocket3.close();
				} catch (@Pc(127) Exception local127) {
				}
				this.aSocket3 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt957 = 0;
				this.anInt955++;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("25660, " + arg0 + ", " + 6024 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
