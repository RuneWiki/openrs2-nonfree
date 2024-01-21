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

@OriginalClass("client!KMIIMWED")
public final class Class18_Sub1 extends Class18 implements Runnable {

	@OriginalMember(owner = "client!KMIIMWED", name = "G", descriptor = "B")
	private static byte aByte12 = -98;

	@OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!KMIIMWED", name = "e", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!KMIIMWED", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!KMIIMWED", name = "h", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!KMIIMWED", name = "i", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!KMIIMWED", name = "k", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!KMIIMWED", name = "l", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!KMIIMWED", name = "m", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!KMIIMWED", name = "n", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!KMIIMWED", name = "o", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!KMIIMWED", name = "q", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!KMIIMWED", name = "s", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!KMIIMWED", name = "y", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!KMIIMWED", name = "A", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!KMIIMWED", name = "B", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!KMIIMWED", name = "C", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!KMIIMWED", name = "H", descriptor = "Lclient!OKKEIIWQ;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!KMIIMWED", name = "K", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!KMIIMWED", name = "L", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!KMIIMWED", name = "M", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!KMIIMWED", name = "N", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!KMIIMWED", name = "O", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!KMIIMWED", name = "P", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!KMIIMWED", name = "Q", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_4 = new Class41(36113);

	@OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "I")
	private int anInt223 = -24958;

	@OriginalMember(owner = "client!KMIIMWED", name = "d", descriptor = "Lclient!OZVXYFRH;")
	private Class28 aClass28_2 = new Class28(aByte12);

	@OriginalMember(owner = "client!KMIIMWED", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray12 = new int[4][];

	@OriginalMember(owner = "client!KMIIMWED", name = "j", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_5 = new Class41(36113);

	@OriginalMember(owner = "client!KMIIMWED", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!KMIIMWED", name = "r", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!KMIIMWED", name = "t", descriptor = "[B")
	private byte[] aByteArray13 = new byte[500];

	@OriginalMember(owner = "client!KMIIMWED", name = "u", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_6 = new Class41(36113);

	@OriginalMember(owner = "client!KMIIMWED", name = "v", descriptor = "I")
	private int anInt226 = 43360;

	@OriginalMember(owner = "client!KMIIMWED", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray13 = new int[4][];

	@OriginalMember(owner = "client!KMIIMWED", name = "x", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_7 = new Class41(36113);

	@OriginalMember(owner = "client!KMIIMWED", name = "z", descriptor = "Ljava/lang/String;")
	public String aString4 = "";

	@OriginalMember(owner = "client!KMIIMWED", name = "D", descriptor = "[B")
	private byte[] aByteArray14 = new byte[65000];

	@OriginalMember(owner = "client!KMIIMWED", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!KMIIMWED", name = "F", descriptor = "I")
	private int anInt230 = 192;

	@OriginalMember(owner = "client!KMIIMWED", name = "I", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!KMIIMWED", name = "J", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!KMIIMWED", name = "R", descriptor = "Lclient!WTGHTNMN;")
	private Class41 aClass41_8 = new Class41(36113);

	@OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "(I)V")
	private void method190() {
		try {
			this.anInt232 = 0;
			this.anInt233 = 0;
			@Pc(26) Class2_Sub1_Sub4 local26;
			for (local26 = (Class2_Sub1_Sub4) this.aClass41_5.method414(); local26 != null; local26 = (Class2_Sub1_Sub4) this.aClass41_5.method416()) {
				if (local26.aBoolean110) {
					this.anInt232++;
				} else {
					this.anInt233++;
				}
			}
			while (this.anInt232 < 10) {
				local26 = (Class2_Sub1_Sub4) this.aClass41_7.method413();
				if (local26 == null) {
					break;
				}
				if (this.aByteArrayArray2[local26.anInt259][local26.anInt258] != 0) {
					this.anInt227++;
				}
				this.aByteArrayArray2[local26.anInt259][local26.anInt258] = 0;
				this.aClass41_5.method411(local26);
				this.anInt232++;
				this.method195(local26);
				this.aBoolean92 = true;
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("34568, " + 6 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "(I)V")
	private void method191() {
		try {
			@Pc(6) Class41 local6 = this.aClass41_4;
			@Pc(13) Class2_Sub1_Sub4 local13;
			synchronized (this.aClass41_4) {
				local13 = (Class2_Sub1_Sub4) this.aClass41_4.method413();
			}
			while (local13 != null) {
				this.aBoolean92 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient2.aClass45Array1[0] != null) {
					local24 = this.aClient2.aClass45Array1[local13.anInt259 + 1].method462(local13.anInt258);
				}
				if (!this.method210(local24, this.anIntArrayArray13[local13.anInt259][local13.anInt258], this.anIntArrayArray12[local13.anInt259][local13.anInt258])) {
					local24 = null;
				}
				@Pc(69) Class41 local69 = this.aClass41_4;
				synchronized (this.aClass41_4) {
					if (local24 == null) {
						this.aClass41_7.method411(local13);
					} else {
						local13.aByteArray17 = local24;
						@Pc(85) Class41 local85 = this.aClass41_6;
						synchronized (this.aClass41_6) {
							this.aClass41_6.method411(local13);
						}
					}
					local13 = (Class2_Sub1_Sub4) this.aClass41_4.method413();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("21736, " + 48458 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "()I")
	public int method192() {
		@Pc(2) Class28 local2 = this.aClass28_2;
		synchronized (this.aClass28_2) {
			return this.aClass28_2.method239();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IZ)Z")
	public boolean method193(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray92[arg0] == 1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("15254, " + arg0 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(ZIII)I")
	public int method194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg2;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray96.length; local12++) {
				if (this.anIntArray96[local12] == local5) {
					if (arg1 == 0) {
						return this.anIntArray95[local12];
					}
					return this.anIntArray97[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("68041, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(ZLclient!OKKEIIWQ;)V")
	private void method195(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong10 < 4000L) {
						return;
					}
					this.aLong10 = local11;
					this.aSocket2 = this.aClient2.method644(client.anInt862 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt231 = 0;
				}
				this.aByteArray13[0] = (byte) arg0.anInt259;
				this.aByteArray13[1] = (byte) (arg0.anInt258 >> 8);
				this.aByteArray13[2] = (byte) arg0.anInt258;
				if (arg0.aBoolean110) {
					this.aByteArray13[3] = 2;
				} else if (this.aClient2.aBoolean271) {
					this.aByteArray13[3] = 0;
				} else {
					this.aByteArray13[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray13, 0, 4);
				this.anInt225 = 0;
				this.anInt235 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket2.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt229 = 0;
				this.anInt235++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("66561, " + false + ", " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(ZZ)V")
	public void method196(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(3) int local3 = this.anIntArray96.length;
			if (!arg1) {
				this.anInt223 = -268;
			}
			for (@Pc(10) int local10 = 0; local10 < local3; local10++) {
				if (arg0 || this.anIntArray93[local10] != 0) {
					this.method200(3, this.anIntArray97[local10], (byte) 8, (byte) 2);
					this.method200(3, this.anIntArray95[local10], (byte) 8, (byte) 2);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("24243, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(B)V")
	private void method197() {
		try {
			while (this.anInt232 == 0) {
				if (this.anInt233 >= 10 || this.anInt224 == 0) {
					return;
				}
				@Pc(15) Class41 local15 = this.aClass41_8;
				@Pc(22) Class2_Sub1_Sub4 local22;
				synchronized (this.aClass41_8) {
					local22 = (Class2_Sub1_Sub4) this.aClass41_8.method413();
				}
				while (local22 != null) {
					if (this.aByteArrayArray2[local22.anInt259][local22.anInt258] != 0) {
						this.aByteArrayArray2[local22.anInt259][local22.anInt258] = 0;
						this.aClass41_5.method411(local22);
						this.method195(local22);
						this.aBoolean92 = true;
						if (this.anInt227 < this.anInt236) {
							this.anInt227++;
						}
						this.aString4 = "Loading extra files - " + this.anInt227 * 100 / this.anInt236 + "%";
						this.anInt233++;
						if (this.anInt233 == 10) {
							return;
						}
					}
					local15 = this.aClass41_8;
					synchronized (this.aClass41_8) {
						local22 = (Class2_Sub1_Sub4) this.aClass41_8.method413();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray2[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt224) {
							local123[local128] = 0;
							local22 = new Class2_Sub1_Sub4();
							local22.anInt259 = local116;
							local22.anInt258 = local128;
							local22.aBoolean110 = false;
							this.aClass41_5.method411(local22);
							this.method195(local22);
							this.aBoolean92 = true;
							if (this.anInt227 < this.anInt236) {
								this.anInt227++;
							}
							this.aString4 = "Loading extra files - " + this.anInt227 * 100 / this.anInt236 + "%";
							this.anInt233++;
							if (this.anInt233 == 10) {
								return;
							}
						}
					}
				}
				this.anInt224--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("17549, " + 1 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "()Lclient!OKKEIIWQ;")
	public Class2_Sub1_Sub4 method198() {
		@Pc(4) Class41 local4 = this.aClass41_6;
		@Pc(11) Class2_Sub1_Sub4 local11;
		synchronized (this.aClass41_6) {
			local11 = (Class2_Sub1_Sub4) this.aClass41_6.method413();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class28 local24 = this.aClass28_2;
		synchronized (this.aClass28_2) {
			local11.method467();
		}
		if (local11.aByteArray17 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray17));
			while (true) {
				if (local41 == this.aByteArray14.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray14, local41, this.aByteArray14.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray17 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray17[local93] = this.aByteArray14[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(I)V")
	@Override
	public void method189(@OriginalArg(0) int arg0) {
		this.method207(0, arg0);
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "d", descriptor = "(I)I")
	public int method199() {
		try {
			return this.anIntArray94.length;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("32404, " + 2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IIBB)V")
	public void method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.aClient2.aClass45Array1[0] != null && this.anIntArrayArray13[arg0][arg1] != 0) {
				@Pc(33) byte[] local33 = this.aClient2.aClass45Array1[arg0 + 1].method462(arg1);
				if (!this.method210(local33, this.anIntArrayArray13[arg0][arg1], this.anIntArrayArray12[arg0][arg1])) {
					this.aByteArrayArray2[arg0][arg1] = arg3;
					if (arg3 > this.anInt224) {
						this.anInt224 = arg3;
					}
					this.anInt236++;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("40371, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(II)I")
	public int method201(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray13[arg0].length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("24953, " + arg0 + ", " + -98 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "e", descriptor = "(I)V")
	public void method202(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class41 local2 = this.aClass41_8;
			synchronized (this.aClass41_8) {
				this.aClass41_8.method418();
			}
			if (arg0 < 2 || arg0 > 2) {
				this.anInt223 = -489;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("76976, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(Lclient!MAARFNGV;Lclient!client;)V")
	public void method203(@OriginalArg(0) Class22 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method218(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub3 local42 = new Class2_Sub1_Sub3(local31, true);
			this.anIntArrayArray13[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray13[local22][local56] = local42.method99();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method218(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub3 local115 = new Class2_Sub1_Sub3(local104, true);
			this.anIntArrayArray12[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray12[local36][local123] = local115.method102();
			}
		}
		local104 = arg0.method218("model_index", null);
		local56 = this.anIntArrayArray13[0].length;
		this.aByteArray12 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray12[local158] = local104[local158];
			} else {
				this.aByteArray12[local158] = 0;
			}
		}
		local104 = arg0.method218("map_index", null);
		@Pc(193) Class2_Sub1_Sub3 local193 = new Class2_Sub1_Sub3(local104, true);
		local56 = local104.length / 7;
		this.anIntArray96 = new int[local56];
		this.anIntArray95 = new int[local56];
		this.anIntArray97 = new int[local56];
		this.anIntArray93 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray96[local216] = local193.method99();
			this.anIntArray95[local216] = local193.method99();
			this.anIntArray97[local216] = local193.method99();
			this.anIntArray93[local216] = local193.method97();
		}
		local104 = arg0.method218("anim_index", null);
		local193 = new Class2_Sub1_Sub3(local104, true);
		local56 = local104.length / 2;
		this.anIntArray94 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray94[local268] = local193.method99();
		}
		local104 = arg0.method218("midi_index", null);
		local193 = new Class2_Sub1_Sub3(local104, true);
		local56 = local104.length;
		this.anIntArray92 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray92[local300] = local193.method97();
		}
		this.aClient2 = arg1;
		this.aBoolean94 = true;
		this.aClient2.method587(this, 2);
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean94) {
				this.anInt234++;
				@Pc(11) byte local11 = 20;
				if (this.anInt224 == 0 && this.aClient2.aClass45Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean92 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean92; local32++) {
					this.aBoolean92 = false;
					this.method191();
					this.method190();
					if (this.anInt232 == 0 && local32 >= 5) {
						break;
					}
					this.method197();
					if (this.anInputStream2 != null) {
						this.method209();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class2_Sub1_Sub4 local72;
				for (local72 = (Class2_Sub1_Sub4) this.aClass41_5.method414(); local72 != null; local72 = (Class2_Sub1_Sub4) this.aClass41_5.method416()) {
					if (local72.aBoolean110) {
						local67 = true;
						local72.anInt260++;
						if (local72.anInt260 > 50) {
							local72.anInt260 = 0;
							this.method195(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class2_Sub1_Sub4) this.aClass41_5.method414(); local72 != null; local72 = (Class2_Sub1_Sub4) this.aClass41_5.method416()) {
						local67 = true;
						local72.anInt260++;
						if (local72.anInt260 > 50) {
							local72.anInt260 = 0;
							this.method195(local72);
						}
					}
				}
				if (local67) {
					this.anInt231++;
					if (this.anInt231 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt229 = 0;
					}
				} else {
					this.anInt231 = 0;
					this.aString4 = "";
				}
				if (this.aClient2.aBoolean271 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt224 > 0 || this.aClient2.aClass45Array1[0] == null)) {
					this.anInt225++;
					if (this.anInt225 > 500) {
						this.anInt225 = 0;
						this.aByteArray13[0] = 0;
						this.aByteArray13[1] = 0;
						this.aByteArray13[2] = 0;
						this.aByteArray13[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray13, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt231 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IB)Z")
	public boolean method204(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray96.length; local1++) {
				if (this.anIntArray97[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("59350, " + arg0 + ", " + 106 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IZI)V")
	public void method205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass45Array1[0] != null && (this.anIntArrayArray13[arg0][arg1] != 0 && (this.aByteArrayArray2[arg0][arg1] != 0 && this.anInt224 != 0))) {
				@Pc(30) Class2_Sub1_Sub4 local30 = new Class2_Sub1_Sub4();
				local30.anInt259 = arg0;
				local30.anInt258 = arg1;
				local30.aBoolean110 = false;
				@Pc(47) Class41 local47 = this.aClass41_8;
				synchronized (this.aClass41_8) {
					this.aClass41_8.method411(local30);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("74796, " + arg0 + ", " + true + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "()V")
	public void method206() {
		this.aBoolean94 = false;
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "(II)V")
	public void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray13.length || arg1 < 0 || arg1 > this.anIntArrayArray13[arg0].length || this.anIntArrayArray13[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class28 local27 = this.aClass28_2;
		synchronized (this.aClass28_2) {
			@Pc(34) Class2_Sub1_Sub4 local34;
			for (local34 = (Class2_Sub1_Sub4) this.aClass28_2.method237(); local34 != null; local34 = (Class2_Sub1_Sub4) this.aClass28_2.method238()) {
				if (local34.anInt259 == arg0 && local34.anInt258 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub4();
			local34.anInt259 = arg0;
			local34.anInt258 = arg1;
			local34.aBoolean110 = true;
			@Pc(71) Class41 local71 = this.aClass41_4;
			synchronized (this.aClass41_4) {
				this.aClass41_4.method411(local34);
			}
			this.aClass28_2.method235(local34);
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "(II)I")
	public int method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != -24958) {
				this.aBoolean93 = !this.aBoolean93;
			}
			return this.aByteArray12[arg0] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("6700, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(Z)V")
	private void method209() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt229 == 0 && local10 >= 6) {
					this.aBoolean92 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray13, local21, 6 - local21)) {
					}
					local45 = this.aByteArray13[0] & 0xFF;
					local61 = ((this.aByteArray13[1] & 0xFF) << 8) + (this.aByteArray13[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray13[3] & 0xFF) << 8) + (this.aByteArray13[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray13[5] & 0xFF;
					this.aClass2_Sub1_Sub4_1 = null;
					for (@Pc(92) Class2_Sub1_Sub4 local92 = (Class2_Sub1_Sub4) this.aClass41_5.method414(); local92 != null; local92 = (Class2_Sub1_Sub4) this.aClass41_5.method416()) {
						if (local92.anInt259 == local45 && local92.anInt258 == local61) {
							this.aClass2_Sub1_Sub4_1 = local92;
						}
						if (this.aClass2_Sub1_Sub4_1 != null) {
							local92.anInt260 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub4_1 != null) {
						this.anInt231 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass2_Sub1_Sub4_1.aByteArray17 = null;
							if (this.aClass2_Sub1_Sub4_1.aBoolean110) {
								@Pc(150) Class41 local150 = this.aClass41_6;
								synchronized (this.aClass41_6) {
									this.aClass41_6.method411(this.aClass2_Sub1_Sub4_1);
								}
							} else {
								this.aClass2_Sub1_Sub4_1.method466();
							}
							this.aClass2_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub4_1.aByteArray17 == null && local84 == 0) {
								this.aClass2_Sub1_Sub4_1.aByteArray17 = new byte[local77];
							}
							if (this.aClass2_Sub1_Sub4_1.aByteArray17 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt228 = local84 * 500;
					this.anInt229 = 500;
					if (this.anInt229 > local77 - local84 * 500) {
						this.anInt229 = local77 - local84 * 500;
					}
				}
				if (this.anInt229 > 0 && local10 >= this.anInt229) {
					this.aBoolean92 = true;
					@Pc(229) byte[] local229 = this.aByteArray13;
					local45 = 0;
					if (this.aClass2_Sub1_Sub4_1 != null) {
						local229 = this.aClass2_Sub1_Sub4_1.aByteArray17;
						local45 = this.anInt228;
					}
					for (local61 = 0; local61 < this.anInt229; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt229 - local61)) {
					}
					if (this.anInt229 + this.anInt228 >= local229.length && this.aClass2_Sub1_Sub4_1 != null) {
						if (this.aClient2.aClass45Array1[0] != null) {
							this.aClient2.aClass45Array1[this.aClass2_Sub1_Sub4_1.anInt259 + 1].method463(local229, local229.length, this.aClass2_Sub1_Sub4_1.anInt258);
						}
						if (!this.aClass2_Sub1_Sub4_1.aBoolean110 && this.aClass2_Sub1_Sub4_1.anInt259 == 3) {
							this.aClass2_Sub1_Sub4_1.aBoolean110 = true;
							this.aClass2_Sub1_Sub4_1.anInt259 = 93;
						}
						if (this.aClass2_Sub1_Sub4_1.aBoolean110) {
							@Pc(322) Class41 local322 = this.aClass41_6;
							synchronized (this.aClass41_6) {
								this.aClass41_6.method411(this.aClass2_Sub1_Sub4_1);
							}
						} else {
							this.aClass2_Sub1_Sub4_1.method466();
						}
					}
					this.anInt229 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket2.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt229 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("31456, " + true + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(I[BII)Z")
	private boolean method210(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(49) int local49 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local49 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("97407, " + 38378 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}
}
