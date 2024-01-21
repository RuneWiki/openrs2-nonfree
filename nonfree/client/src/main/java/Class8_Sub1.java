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

@OriginalClass("client!FJSXIAWX")
public final class Class8_Sub1 extends Class8 implements Runnable {

	@OriginalMember(owner = "client!FJSXIAWX", name = "b", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!FJSXIAWX", name = "c", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!FJSXIAWX", name = "d", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!FJSXIAWX", name = "e", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!FJSXIAWX", name = "f", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!FJSXIAWX", name = "g", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!FJSXIAWX", name = "i", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!FJSXIAWX", name = "k", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!FJSXIAWX", name = "l", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!FJSXIAWX", name = "m", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!FJSXIAWX", name = "o", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!FJSXIAWX", name = "p", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!FJSXIAWX", name = "r", descriptor = "Lclient!NCRHUMXM;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!FJSXIAWX", name = "v", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!FJSXIAWX", name = "w", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!FJSXIAWX", name = "y", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!FJSXIAWX", name = "A", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!FJSXIAWX", name = "D", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!FJSXIAWX", name = "G", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!FJSXIAWX", name = "I", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!FJSXIAWX", name = "M", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!FJSXIAWX", name = "N", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!FJSXIAWX", name = "O", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!FJSXIAWX", name = "P", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!FJSXIAWX", name = "Q", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!FJSXIAWX", name = "S", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!FJSXIAWX", name = "h", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_1 = new Class50(708);

	@OriginalMember(owner = "client!FJSXIAWX", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!FJSXIAWX", name = "n", descriptor = "Lclient!ZLISRGEK;")
	private Class49 aClass49_1 = new Class49(8);

	@OriginalMember(owner = "client!FJSXIAWX", name = "q", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!FJSXIAWX", name = "s", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_2 = new Class50(708);

	@OriginalMember(owner = "client!FJSXIAWX", name = "t", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!FJSXIAWX", name = "u", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_3 = new Class50(708);

	@OriginalMember(owner = "client!FJSXIAWX", name = "x", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!FJSXIAWX", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!FJSXIAWX", name = "B", descriptor = "Ljava/lang/String;")
	public String aString4 = "";

	@OriginalMember(owner = "client!FJSXIAWX", name = "C", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!FJSXIAWX", name = "E", descriptor = "I")
	private int anInt228 = 5;

	@OriginalMember(owner = "client!FJSXIAWX", name = "F", descriptor = "I")
	private int anInt229 = 7;

	@OriginalMember(owner = "client!FJSXIAWX", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray9 = new int[4][];

	@OriginalMember(owner = "client!FJSXIAWX", name = "J", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!FJSXIAWX", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray10 = new int[4][];

	@OriginalMember(owner = "client!FJSXIAWX", name = "L", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!FJSXIAWX", name = "R", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_4 = new Class50(708);

	@OriginalMember(owner = "client!FJSXIAWX", name = "T", descriptor = "Lclient!ZWZXPJNQ;")
	private Class50 aClass50_5 = new Class50(708);

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(II[BI)Z")
	private boolean method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			@Pc(46) boolean local46 = false;
			if (local28 == arg1) {
				return local42 == arg3;
			} else {
				return false;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("63438, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "()I")
	public int method116() {
		@Pc(2) Class49 local2 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			return this.aClass49_1.method567();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "b", descriptor = "(I)V")
	private void method117() {
		try {
			this.anInt225 = 0;
			this.anInt226 = 0;
			@Pc(15) Class3_Sub1_Sub3 local15;
			for (local15 = (Class3_Sub1_Sub3) this.aClass50_3.method571(); local15 != null; local15 = (Class3_Sub1_Sub3) this.aClass50_3.method573((byte) 3)) {
				if (local15.aBoolean116) {
					this.anInt225++;
				} else {
					this.anInt226++;
				}
			}
			while (this.anInt225 < 10) {
				local15 = (Class3_Sub1_Sub3) this.aClass50_4.method570();
				if (local15 == null) {
					break;
				}
				if (this.aByteArrayArray1[local15.anInt435][local15.anInt436] != 0) {
					this.anInt218++;
				}
				this.aByteArrayArray1[local15.anInt435][local15.anInt436] = 0;
				this.aClass50_3.method568(local15);
				this.anInt225++;
				this.method132(this.anInt228, local15);
				this.aBoolean48 = true;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("28861, " + 0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(IIIB)V")
	public void method118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient2.aClass29Array1[0] != null && this.anIntArrayArray9[arg0][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass29Array1[arg0 + 1].method393(arg1);
				if (!this.method115(318, this.anIntArrayArray9[arg0][arg1], local25, this.anIntArrayArray10[arg0][arg1])) {
					this.aByteArrayArray1[arg0][arg1] = arg2;
					if (arg2 > this.anInt224) {
						this.anInt224 = arg2;
					}
					this.anInt222++;
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("64104, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(BI)Z")
	public boolean method119(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray93.length; local3++) {
				if (this.anIntArray91[local3] == arg1) {
					return true;
				}
			}
			@Pc(24) boolean local24 = false;
			return false;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("56209, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "c", descriptor = "(I)V")
	private void method120(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean49 = !this.aBoolean49;
			}
			@Pc(12) Class50 local12 = this.aClass50_2;
			@Pc(19) Class3_Sub1_Sub3 local19;
			synchronized (this.aClass50_2) {
				local19 = (Class3_Sub1_Sub3) this.aClass50_2.method570();
			}
			while (local19 != null) {
				this.aBoolean48 = true;
				@Pc(30) byte[] local30 = null;
				if (this.aClient2.aClass29Array1[0] != null) {
					local30 = this.aClient2.aClass29Array1[local19.anInt435 + 1].method393(local19.anInt436);
				}
				if (!this.method115(318, this.anIntArrayArray9[local19.anInt435][local19.anInt436], local30, this.anIntArrayArray10[local19.anInt435][local19.anInt436])) {
					local30 = null;
				}
				@Pc(75) Class50 local75 = this.aClass50_2;
				synchronized (this.aClass50_2) {
					if (local30 == null) {
						this.aClass50_4.method568(local19);
					} else {
						local19.aByteArray15 = local30;
						@Pc(91) Class50 local91 = this.aClass50_1;
						synchronized (this.aClass50_1) {
							this.aClass50_1.method568(local19);
						}
					}
					local19 = (Class3_Sub1_Sub3) this.aClass50_2.method570();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("36324, " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(I)V")
	@Override
	public void method114(@OriginalArg(0) int arg0) {
		this.method128(0, arg0);
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(IZI)V")
	public void method121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass29Array1[0] != null && (this.anIntArrayArray9[arg0][arg1] != 0 && (this.aByteArrayArray1[arg0][arg1] != 0 && this.anInt224 != 0))) {
				@Pc(30) Class3_Sub1_Sub3 local30 = new Class3_Sub1_Sub3();
				local30.anInt435 = arg0;
				local30.anInt436 = arg1;
				local30.aBoolean116 = false;
				@Pc(42) Class50 local42 = this.aClass50_5;
				synchronized (this.aClass50_5) {
					this.aClass50_5.method568(local30);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("52407, " + arg0 + ", " + false + ", " + arg1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "b", descriptor = "()V")
	public void method122() {
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(ZI)V")
	public void method123(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anIntArray93.length;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				if (arg0 || this.anIntArray92[local8] != 0) {
					this.method118(3, this.anIntArray91[local8], (byte) 2);
					this.method118(3, this.anIntArray94[local8], (byte) 2);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("89439, " + arg0 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(Lclient!GWOEELWB;Lclient!client;)V")
	public void method124(@OriginalArg(0) Class13 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method140(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class3_Sub1_Sub2 local42 = new Class3_Sub1_Sub2(true, local31);
			this.anIntArrayArray9[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray9[local22][local56] = local42.method202();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method140(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class3_Sub1_Sub2 local115 = new Class3_Sub1_Sub2(true, local104);
			this.anIntArrayArray10[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray10[local36][local123] = local115.method205();
			}
		}
		local104 = arg0.method140("model_index", null);
		local56 = this.anIntArrayArray9[0].length;
		this.aByteArray2 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray2[local158] = local104[local158];
			} else {
				this.aByteArray2[local158] = 0;
			}
		}
		local104 = arg0.method140("map_index", null);
		@Pc(193) Class3_Sub1_Sub2 local193 = new Class3_Sub1_Sub2(true, local104);
		local56 = local104.length / 7;
		this.anIntArray93 = new int[local56];
		this.anIntArray94 = new int[local56];
		this.anIntArray91 = new int[local56];
		this.anIntArray92 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray93[local216] = local193.method202();
			this.anIntArray94[local216] = local193.method202();
			this.anIntArray91[local216] = local193.method202();
			this.anIntArray92[local216] = local193.method200();
		}
		local104 = arg0.method140("anim_index", null);
		local193 = new Class3_Sub1_Sub2(true, local104);
		local56 = local104.length / 2;
		this.anIntArray90 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray90[local268] = local193.method202();
		}
		local104 = arg0.method140("midi_index", null);
		local193 = new Class3_Sub1_Sub2(true, local104);
		local56 = local104.length;
		this.anIntArray95 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray95[local300] = local193.method200();
		}
		this.aClient2 = arg1;
		this.aBoolean46 = true;
		this.aClient2.method587(this, 2);
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(II)I")
	public int method125(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray2[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("98826, " + -715 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(IIII)I")
	public int method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray93.length; local7++) {
				if (this.anIntArray93[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray94[local7];
					}
					return this.anIntArray91[local7];
				}
			}
			@Pc(37) boolean local37 = false;
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("63793, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean46) {
				this.anInt227++;
				@Pc(11) byte local11 = 20;
				if (this.anInt224 == 0 && this.aClient2.aClass29Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean48 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean48; local32++) {
					this.aBoolean48 = false;
					this.method120(this.anInt231);
					this.method117();
					if (this.anInt225 == 0 && local32 >= 5) {
						break;
					}
					this.method135();
					if (this.anInputStream1 != null) {
						this.method133(this.anInt229);
					}
				}
				@Pc(69) boolean local69 = false;
				@Pc(74) Class3_Sub1_Sub3 local74;
				for (local74 = (Class3_Sub1_Sub3) this.aClass50_3.method571(); local74 != null; local74 = (Class3_Sub1_Sub3) this.aClass50_3.method573((byte) 3)) {
					if (local74.aBoolean116) {
						local69 = true;
						local74.anInt437++;
						if (local74.anInt437 > 50) {
							local74.anInt437 = 0;
							this.method132(this.anInt228, local74);
						}
					}
				}
				if (!local69) {
					for (local74 = (Class3_Sub1_Sub3) this.aClass50_3.method571(); local74 != null; local74 = (Class3_Sub1_Sub3) this.aClass50_3.method573((byte) 3)) {
						local69 = true;
						local74.anInt437++;
						if (local74.anInt437 > 50) {
							local74.anInt437 = 0;
							this.method132(this.anInt228, local74);
						}
					}
				}
				if (local69) {
					this.anInt232++;
					if (this.anInt232 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(161) Exception local161) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt220 = 0;
					}
				} else {
					this.anInt232 = 0;
					this.aString4 = "";
				}
				if (this.aClient2.aBoolean233 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt224 > 0 || this.aClient2.aClass29Array1[0] == null)) {
					this.anInt223++;
					if (this.anInt223 > 500) {
						this.anInt223 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray4, 0, 4);
						} catch (@Pc(242) IOException local242) {
							this.anInt232 = 5000;
						}
					}
				}
			}
		} catch (@Pc(251) Exception local251) {
			signlink.reporterror("od_ex " + local251.getMessage());
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "d", descriptor = "(I)I")
	public int method127() {
		try {
			return this.anIntArray90.length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("71309, " + -101 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "b", descriptor = "(II)V")
	public void method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray9.length || arg1 < 0 || arg1 > this.anIntArrayArray9[arg0].length || this.anIntArrayArray9[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class49 local27 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			@Pc(34) Class3_Sub1_Sub3 local34;
			for (local34 = (Class3_Sub1_Sub3) this.aClass49_1.method565(); local34 != null; local34 = (Class3_Sub1_Sub3) this.aClass49_1.method566((byte) 3)) {
				if (local34.anInt435 == arg0 && local34.anInt436 == arg1) {
					return;
				}
			}
			local34 = new Class3_Sub1_Sub3();
			local34.anInt435 = arg0;
			local34.anInt436 = arg1;
			local34.aBoolean116 = true;
			@Pc(71) Class50 local71 = this.aClass50_2;
			synchronized (this.aClass50_2) {
				this.aClass50_2.method568(local34);
			}
			this.aClass49_1.method563(local34);
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "e", descriptor = "(I)V")
	public void method129(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class50 local2 = this.aClass50_5;
			synchronized (this.aClass50_5) {
				this.aClass50_5.method575();
			}
			@Pc(17) int local17 = 24 / arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16809, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "c", descriptor = "(II)I")
	public int method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 17 / arg0;
			return this.anIntArrayArray9[arg1].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("17673, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "d", descriptor = "(II)Z")
	public boolean method131(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray95[arg0] == 1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("3523, " + -25506 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "a", descriptor = "(ILclient!NCRHUMXM;)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			if (arg0 < 5 || arg0 > 5) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			try {
				if (this.aSocket1 == null) {
					@Pc(19) long local19 = System.currentTimeMillis();
					if (local19 - this.aLong12 < 4000L) {
						return;
					}
					this.aLong12 = local19;
					this.aSocket1 = this.aClient2.method694(client.anInt936 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(54) int local54 = 0; local54 < 8; local54++) {
						this.anInputStream1.read();
					}
					this.anInt232 = 0;
				}
				this.aByteArray4[0] = (byte) arg1.anInt435;
				this.aByteArray4[1] = (byte) (arg1.anInt436 >> 8);
				this.aByteArray4[2] = (byte) arg1.anInt436;
				if (arg1.aBoolean116) {
					this.aByteArray4[3] = 2;
				} else if (this.aClient2.aBoolean233) {
					this.aByteArray4[3] = 0;
				} else {
					this.aByteArray4[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray4, 0, 4);
				this.anInt223 = 0;
				this.anInt221 = -10000;
			} catch (@Pc(131) IOException local131) {
				try {
					this.aSocket1.close();
				} catch (@Pc(136) Exception local136) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt220 = 0;
				this.anInt221++;
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("14368, " + arg0 + ", " + arg1 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "f", descriptor = "(I)V")
	private void method133(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 7) {
				this.aBoolean47 = !this.aBoolean47;
			}
			try {
				@Pc(16) int local16 = this.anInputStream1.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt220 == 0 && local16 >= 6) {
					this.aBoolean48 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream1.read(this.aByteArray4, local27, 6 - local27)) {
					}
					local51 = this.aByteArray4[0] & 0xFF;
					local67 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray4[5] & 0xFF;
					this.aClass3_Sub1_Sub3_1 = null;
					for (@Pc(98) Class3_Sub1_Sub3 local98 = (Class3_Sub1_Sub3) this.aClass50_3.method571(); local98 != null; local98 = (Class3_Sub1_Sub3) this.aClass50_3.method573((byte) 3)) {
						if (local98.anInt435 == local51 && local98.anInt436 == local67) {
							this.aClass3_Sub1_Sub3_1 = local98;
						}
						if (this.aClass3_Sub1_Sub3_1 != null) {
							local98.anInt437 = 0;
						}
					}
					if (this.aClass3_Sub1_Sub3_1 != null) {
						this.anInt232 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass3_Sub1_Sub3_1.aByteArray15 = null;
							if (this.aClass3_Sub1_Sub3_1.aBoolean116) {
								@Pc(156) Class50 local156 = this.aClass50_1;
								synchronized (this.aClass50_1) {
									this.aClass50_1.method568(this.aClass3_Sub1_Sub3_1);
								}
							} else {
								this.aClass3_Sub1_Sub3_1.method559();
							}
							this.aClass3_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass3_Sub1_Sub3_1.aByteArray15 == null && local90 == 0) {
								this.aClass3_Sub1_Sub3_1.aByteArray15 = new byte[local83];
							}
							if (this.aClass3_Sub1_Sub3_1.aByteArray15 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt219 = local90 * 500;
					this.anInt220 = 500;
					if (this.anInt220 > local83 - local90 * 500) {
						this.anInt220 = local83 - local90 * 500;
					}
				}
				if (this.anInt220 > 0 && local16 >= this.anInt220) {
					this.aBoolean48 = true;
					@Pc(235) byte[] local235 = this.aByteArray4;
					local51 = 0;
					if (this.aClass3_Sub1_Sub3_1 != null) {
						local235 = this.aClass3_Sub1_Sub3_1.aByteArray15;
						local51 = this.anInt219;
					}
					for (local67 = 0; local67 < this.anInt220; local67 += this.anInputStream1.read(local235, local67 + local51, this.anInt220 - local67)) {
					}
					if (this.anInt220 + this.anInt219 >= local235.length && this.aClass3_Sub1_Sub3_1 != null) {
						if (this.aClient2.aClass29Array1[0] != null) {
							this.aClient2.aClass29Array1[this.aClass3_Sub1_Sub3_1.anInt435 + 1].method394(this.aClass3_Sub1_Sub3_1.anInt436, local235, local235.length);
						}
						if (!this.aClass3_Sub1_Sub3_1.aBoolean116 && this.aClass3_Sub1_Sub3_1.anInt435 == 3) {
							this.aClass3_Sub1_Sub3_1.aBoolean116 = true;
							this.aClass3_Sub1_Sub3_1.anInt435 = 93;
						}
						if (this.aClass3_Sub1_Sub3_1.aBoolean116) {
							@Pc(328) Class50 local328 = this.aClass50_1;
							synchronized (this.aClass50_1) {
								this.aClass50_1.method568(this.aClass3_Sub1_Sub3_1);
							}
						} else {
							this.aClass3_Sub1_Sub3_1.method559();
						}
					}
					this.anInt220 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket1.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt220 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("96580, " + arg0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "c", descriptor = "()Lclient!NCRHUMXM;")
	public Class3_Sub1_Sub3 method134() {
		@Pc(4) Class50 local4 = this.aClass50_1;
		@Pc(11) Class3_Sub1_Sub3 local11;
		synchronized (this.aClass50_1) {
			local11 = (Class3_Sub1_Sub3) this.aClass50_1.method570();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class49 local24 = this.aClass49_1;
		synchronized (this.aClass49_1) {
			local11.method560();
		}
		if (local11.aByteArray15 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray15));
			while (true) {
				if (local41 == this.aByteArray3.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray3, local41, this.aByteArray3.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray15 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray15[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!FJSXIAWX", name = "g", descriptor = "(I)V")
	private void method135() {
		try {
			while (this.anInt225 == 0) {
				if (this.anInt226 >= 10 || this.anInt224 == 0) {
					return;
				}
				@Pc(10) Class50 local10 = this.aClass50_5;
				@Pc(17) Class3_Sub1_Sub3 local17;
				synchronized (this.aClass50_5) {
					local17 = (Class3_Sub1_Sub3) this.aClass50_5.method570();
				}
				while (local17 != null) {
					if (this.aByteArrayArray1[local17.anInt435][local17.anInt436] != 0) {
						this.aByteArrayArray1[local17.anInt435][local17.anInt436] = 0;
						this.aClass50_3.method568(local17);
						this.method132(this.anInt228, local17);
						this.aBoolean48 = true;
						if (this.anInt218 < this.anInt222) {
							this.anInt218++;
						}
						this.aString4 = "Loading extra files - " + this.anInt218 * 100 / this.anInt222 + "%";
						this.anInt226++;
						if (this.anInt226 == 10) {
							return;
						}
					}
					local10 = this.aClass50_5;
					synchronized (this.aClass50_5) {
						local17 = (Class3_Sub1_Sub3) this.aClass50_5.method570();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray1[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt224) {
							local119[local124] = 0;
							local17 = new Class3_Sub1_Sub3();
							local17.anInt435 = local112;
							local17.anInt436 = local124;
							local17.aBoolean116 = false;
							this.aClass50_3.method568(local17);
							this.method132(this.anInt228, local17);
							this.aBoolean48 = true;
							if (this.anInt218 < this.anInt222) {
								this.anInt218++;
							}
							this.aString4 = "Loading extra files - " + this.anInt218 * 100 / this.anInt222 + "%";
							this.anInt226++;
							if (this.anInt226 == 10) {
								return;
							}
						}
					}
				}
				this.anInt224--;
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("19546, " + 27 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}
}
