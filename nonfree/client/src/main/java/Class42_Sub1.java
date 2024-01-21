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
public final class Class42_Sub1 extends Class42 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Lclient!nb;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt964 = 2;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt965 = 1;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[4][];

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[4][];

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!qb;")
	private Class34 aClass34_2 = new Class34((byte) 5);

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!pb;")
	private Class31 aClass31_8 = new Class31((byte) 115);

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!pb;")
	private Class31 aClass31_9 = new Class31((byte) 115);

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!pb;")
	private Class31 aClass31_10 = new Class31((byte) 115);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!pb;")
	private Class31 aClass31_11 = new Class31((byte) 115);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!pb;")
	private Class31 aClass31_12 = new Class31((byte) 115);

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Ljava/lang/String;")
	public String aString30 = "";

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!yb;Lclient!client;)V")
	public void method616(@OriginalArg(0) Class45 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method644(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3(local31, true);
			this.anIntArrayArray23[local22] = new int[local36];
			this.aByteArrayArray5[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray23[local22][local56] = local42.method470();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method644(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3(local104, true);
			this.anIntArrayArray24[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray24[local36][local123] = local115.method473();
			}
		}
		local104 = arg0.method644("model_index", null);
		local56 = this.anIntArrayArray23[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method644("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3(local104, true);
		local56 = local104.length / 6;
		this.anIntArray246 = new int[local56];
		this.anIntArray247 = new int[local56];
		this.anIntArray248 = new int[local56];
		for (@Pc(212) int local212 = 0; local212 < local56; local212++) {
			this.anIntArray246[local212] = local193.method470();
			this.anIntArray247[local212] = local193.method470();
			this.anIntArray248[local212] = local193.method470();
		}
		local104 = arg0.method644("anim_index", null);
		local193 = new Class1_Sub1_Sub3(local104, true);
		local56 = local104.length / 2;
		this.anIntArray249 = new int[local56];
		for (@Pc(258) int local258 = 0; local258 < local56; local258++) {
			this.anIntArray249[local258] = local193.method470();
		}
		this.aClient1 = arg1;
		this.aBoolean194 = true;
		this.aClient1.method90(this, 2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method617() {
		this.aBoolean194 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public int method618(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray23[arg0].length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("86798, " + arg0 + ", " + 4 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
	public int method619() {
		try {
			return this.anIntArray249.length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("78995, " + -34 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIB)I")
	public int method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(16) int local16 = (arg2 << 8) + arg0;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray246.length; local18++) {
				if (this.anIntArray246[local18] == local16) {
					if (arg1 == 0) {
						return this.anIntArray247[local18];
					}
					return this.anIntArray248[local18];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("63883, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Z")
	public boolean method621(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray246.length; local11++) {
				if (this.anIntArray248[local11] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("80284, " + arg0 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I")
	public int method622(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("73432, " + 0 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method615(@OriginalArg(0) int arg0) {
		this.method623(0, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
	public void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray23.length || arg1 < 0 || arg1 > this.anIntArrayArray23[arg0].length || this.anIntArrayArray23[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class34 local27 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass34_2.method543(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass34_2.method544()) {
				if (local34.anInt811 == arg0 && local34.anInt812 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt811 = arg0;
			local34.anInt812 = arg1;
			local34.aBoolean166 = true;
			@Pc(71) Class31 local71 = this.aClass31_8;
			synchronized (this.aClass31_8) {
				this.aClass31_8.method495(local34);
			}
			this.aClass34_2.method541(local34);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
	public int method624() {
		@Pc(2) Class34 local2 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			return this.aClass34_2.method545();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lclient!nb;")
	public Class1_Sub1_Sub4 method625() {
		@Pc(4) Class31 local4 = this.aClass31_11;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass31_11) {
			local11 = (Class1_Sub1_Sub4) this.aClass31_11.method497();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = this.aClass34_2;
		synchronized (this.aClass34_2) {
			local11.method488();
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

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIB)V")
	public void method626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient1.aClass43Array1[0] != null && this.anIntArrayArray23[arg1][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass43Array1[arg1 + 1].method636(arg0);
				if (!this.method633(this.anIntArrayArray23[arg1][arg0], local25, this.anIntArrayArray24[arg1][arg0])) {
					this.aByteArrayArray5[arg1][arg0] = arg2;
					if (arg2 > this.anInt966) {
						this.anInt966 = arg2;
					}
					this.anInt970++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("80405, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public void method627() {
		try {
			@Pc(7) Class31 local7 = this.aClass31_12;
			synchronized (this.aClass31_12) {
				this.aClass31_12.method502();
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("14481, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
	public void method628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient1.aClass43Array1[0] != null && (this.anIntArrayArray23[arg0][arg1] != 0 && (this.aByteArrayArray5[arg0][arg1] != 0 && this.anInt966 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				local30.anInt811 = arg0;
				local30.anInt812 = arg1;
				local30.aBoolean166 = false;
				@Pc(51) Class31 local51 = this.aClass31_12;
				synchronized (this.aClass31_12) {
					this.aClass31_12.method495(local30);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("16440, " + true + ", " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean194) {
				this.anInt975++;
				try {
					Thread.sleep(20L);
				} catch (@Pc(13) Exception local13) {
				}
				this.aBoolean195 = true;
				for (@Pc(18) int local18 = 0; local18 < 100 && this.aBoolean195; local18++) {
					this.aBoolean195 = false;
					this.method629();
					this.method630();
					if (this.anInt967 == 0 && local18 >= 5) {
						break;
					}
					this.method631();
					if (this.anInputStream2 != null) {
						this.method632();
					}
				}
				@Pc(53) boolean local53 = false;
				@Pc(58) Class1_Sub1_Sub4 local58;
				for (local58 = (Class1_Sub1_Sub4) this.aClass31_10.method498(); local58 != null; local58 = (Class1_Sub1_Sub4) this.aClass31_10.method500()) {
					if (local58.aBoolean166) {
						local53 = true;
						local58.anInt813++;
						if (local58.anInt813 > 50) {
							local58.anInt813 = 0;
							this.method634(local58);
						}
					}
				}
				if (!local53) {
					for (local58 = (Class1_Sub1_Sub4) this.aClass31_10.method498(); local58 != null; local58 = (Class1_Sub1_Sub4) this.aClass31_10.method500()) {
						local53 = true;
						local58.anInt813++;
						if (local58.anInt813 > 50) {
							local58.anInt813 = 0;
							this.method634(local58);
						}
					}
				}
				if (local53) {
					this.anInt973++;
					if (this.anInt973 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(143) Exception local143) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt972 = 0;
					}
				} else {
					this.anInt973 = 0;
					this.aString30 = "";
				}
				if (this.aClient1.aBoolean72 && this.aSocket2 != null && this.anOutputStream2 != null && this.anInt966 > 0) {
					this.anInt974++;
					if (this.anInt974 > 500) {
						this.anInt974 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(218) IOException local218) {
							this.anInt973 = 5000;
						}
					}
				}
			}
		} catch (@Pc(227) Exception local227) {
			signlink.reporterror("od_ex " + local227.getMessage());
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	private void method629() {
		try {
			@Pc(4) Class31 local4 = this.aClass31_8;
			@Pc(11) Class1_Sub1_Sub4 local11;
			synchronized (this.aClass31_8) {
				local11 = (Class1_Sub1_Sub4) this.aClass31_8.method497();
			}
			while (local11 != null) {
				this.aBoolean195 = true;
				@Pc(35) byte[] local35 = null;
				if (this.aClient1.aClass43Array1[0] != null) {
					local35 = this.aClient1.aClass43Array1[local11.anInt811 + 1].method636(local11.anInt812);
				}
				if (!this.method633(this.anIntArrayArray23[local11.anInt811][local11.anInt812], local35, this.anIntArrayArray24[local11.anInt811][local11.anInt812])) {
					local35 = null;
				}
				@Pc(80) Class31 local80 = this.aClass31_8;
				synchronized (this.aClass31_8) {
					if (local35 == null) {
						this.aClass31_9.method495(local11);
					} else {
						local11.aByteArray10 = local35;
						@Pc(96) Class31 local96 = this.aClass31_11;
						synchronized (this.aClass31_11) {
							this.aClass31_11.method495(local11);
						}
					}
					local11 = (Class1_Sub1_Sub4) this.aClass31_8.method497();
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("7711, " + -26888 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	private void method630() {
		try {
			this.anInt967 = 0;
			this.anInt968 = 0;
			@Pc(12) Class1_Sub1_Sub4 local12;
			for (local12 = (Class1_Sub1_Sub4) this.aClass31_10.method498(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass31_10.method500()) {
				if (local12.aBoolean166) {
					this.anInt967++;
				} else {
					this.anInt968++;
				}
			}
			while (this.anInt967 < 10) {
				local12 = (Class1_Sub1_Sub4) this.aClass31_9.method497();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray5[local12.anInt811][local12.anInt812] != 0) {
					this.anInt969++;
				}
				this.aByteArrayArray5[local12.anInt811][local12.anInt812] = 0;
				this.aClass31_10.method495(local12);
				this.anInt967++;
				this.method634(local12);
				this.aBoolean195 = true;
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("77148, " + -863 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
	private void method631() {
		try {
			while (this.anInt967 == 0) {
				if (this.anInt968 >= 10 || this.anInt966 == 0) {
					return;
				}
				@Pc(10) Class31 local10 = this.aClass31_12;
				@Pc(17) Class1_Sub1_Sub4 local17;
				synchronized (this.aClass31_12) {
					local17 = (Class1_Sub1_Sub4) this.aClass31_12.method497();
				}
				while (local17 != null) {
					if (this.aByteArrayArray5[local17.anInt811][local17.anInt812] != 0) {
						this.aByteArrayArray5[local17.anInt811][local17.anInt812] = 0;
						this.aClass31_10.method495(local17);
						this.method634(local17);
						this.aBoolean195 = true;
						if (this.anInt969 < this.anInt970) {
							this.anInt969++;
						}
						this.aString30 = "Loading extra files - " + this.anInt969 * 100 / this.anInt970 + "%";
						this.anInt968++;
						if (this.anInt968 == 10) {
							return;
						}
					}
					local10 = this.aClass31_12;
					synchronized (this.aClass31_12) {
						local17 = (Class1_Sub1_Sub4) this.aClass31_12.method497();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray5[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt966) {
							local118[local123] = 0;
							local17 = new Class1_Sub1_Sub4();
							local17.anInt811 = local111;
							local17.anInt812 = local123;
							local17.aBoolean166 = false;
							this.aClass31_10.method495(local17);
							this.method634(local17);
							this.aBoolean195 = true;
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
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("44165, " + false + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	private void method632() {
		try {
			try {
				@Pc(16) int local16 = this.anInputStream2.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt972 == 0 && local16 >= 6) {
					this.aBoolean195 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream2.read(this.aByteArray18, local27, 6 - local27)) {
					}
					local51 = this.aByteArray18[0] & 0xFF;
					local67 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray18[5] & 0xFF;
					this.aClass1_Sub1_Sub4_1 = null;
					for (@Pc(98) Class1_Sub1_Sub4 local98 = (Class1_Sub1_Sub4) this.aClass31_10.method498(); local98 != null; local98 = (Class1_Sub1_Sub4) this.aClass31_10.method500()) {
						if (local98.anInt811 == local51 && local98.anInt812 == local67) {
							this.aClass1_Sub1_Sub4_1 = local98;
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local98.anInt813 = 0;
						}
					}
					if (this.aClass1_Sub1_Sub4_1 != null) {
						this.anInt973 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass1_Sub1_Sub4_1.aByteArray10 = null;
							if (this.aClass1_Sub1_Sub4_1.aBoolean166) {
								@Pc(156) Class31 local156 = this.aClass31_11;
								synchronized (this.aClass31_11) {
									this.aClass31_11.method495(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method635();
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
					this.anInt971 = local90 * 500;
					this.anInt972 = 500;
					if (this.anInt972 > local83 - local90 * 500) {
						this.anInt972 = local83 - local90 * 500;
					}
				}
				if (this.anInt972 > 0 && local16 >= this.anInt972) {
					this.aBoolean195 = true;
					@Pc(235) byte[] local235 = this.aByteArray18;
					local51 = 0;
					if (this.aClass1_Sub1_Sub4_1 != null) {
						local235 = this.aClass1_Sub1_Sub4_1.aByteArray10;
						local51 = this.anInt971;
					}
					for (local67 = 0; local67 < this.anInt972; local67 += this.anInputStream2.read(local235, local67 + local51, this.anInt972 - local67)) {
					}
					if (this.anInt972 + this.anInt971 >= local235.length && this.aClass1_Sub1_Sub4_1 != null) {
						if (this.aClient1.aClass43Array1[0] != null) {
							this.aClient1.aClass43Array1[this.aClass1_Sub1_Sub4_1.anInt811 + 1].method637(this.aClass1_Sub1_Sub4_1.anInt812, local235.length, local235);
						}
						if (!this.aClass1_Sub1_Sub4_1.aBoolean166 && this.aClass1_Sub1_Sub4_1.anInt811 == 3) {
							this.aClass1_Sub1_Sub4_1.aBoolean166 = true;
							this.aClass1_Sub1_Sub4_1.anInt811 = 93;
						}
						if (this.aClass1_Sub1_Sub4_1.aBoolean166) {
							@Pc(328) Class31 local328 = this.aClass31_11;
							synchronized (this.aClass31_11) {
								this.aClass31_11.method495(this.aClass1_Sub1_Sub4_1);
							}
						} else {
							this.aClass1_Sub1_Sub4_1.method635();
						}
					}
					this.anInt972 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket2.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt972 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("26871, " + 5 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[BBI)Z")
	private boolean method633(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(19) int local19 = arg1.length - 2;
			@Pc(35) int local35 = ((arg1[local19] & 0xFF) << 8) + (arg1[local19 + 1] & 0xFF);
			this.aCRC32_2.reset();
			this.aCRC32_2.update(arg1, 0, local19);
			@Pc(49) int local49 = (int) this.aCRC32_2.getValue();
			if (local35 == arg0) {
				return local49 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("69715, " + arg0 + ", " + arg1 + ", " + -83 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!nb;)V")
	private void method634(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong29 < 5000L) {
						return;
					}
					this.aLong29 = local9;
					this.aSocket2 = this.aClient1.method215(client.anInt276 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt973 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt811;
				this.aByteArray18[1] = (byte) (arg0.anInt812 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt812;
				if (arg0.aBoolean166) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient1.aBoolean72) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt974 = 0;
			} catch (@Pc(118) IOException local118) {
				try {
					this.aSocket2.close();
				} catch (@Pc(123) Exception local123) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt972 = 0;
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("31746, " + false + ", " + arg0 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
