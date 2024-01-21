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

@OriginalClass("client!QJAHKUCY")
public final class Class9_Sub1 extends Class9 implements Runnable {

	@OriginalMember(owner = "client!QJAHKUCY", name = "c", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!QJAHKUCY", name = "d", descriptor = "Lclient!ACXEOGCN;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!QJAHKUCY", name = "g", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!QJAHKUCY", name = "i", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!QJAHKUCY", name = "j", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!QJAHKUCY", name = "l", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!QJAHKUCY", name = "n", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!QJAHKUCY", name = "r", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!QJAHKUCY", name = "s", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "client!QJAHKUCY", name = "t", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!QJAHKUCY", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!QJAHKUCY", name = "x", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!QJAHKUCY", name = "y", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!QJAHKUCY", name = "B", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!QJAHKUCY", name = "C", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!QJAHKUCY", name = "D", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!QJAHKUCY", name = "E", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!QJAHKUCY", name = "F", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!QJAHKUCY", name = "G", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "client!QJAHKUCY", name = "J", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!QJAHKUCY", name = "N", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!QJAHKUCY", name = "P", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!QJAHKUCY", name = "Q", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!QJAHKUCY", name = "S", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!QJAHKUCY", name = "e", descriptor = "Ljava/lang/String;")
	public String aString12 = "";

	@OriginalMember(owner = "client!QJAHKUCY", name = "f", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_1 = new Class12(false);

	@OriginalMember(owner = "client!QJAHKUCY", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray9 = new int[4][];

	@OriginalMember(owner = "client!QJAHKUCY", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray10 = new int[4][];

	@OriginalMember(owner = "client!QJAHKUCY", name = "m", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_2 = new Class12(false);

	@OriginalMember(owner = "client!QJAHKUCY", name = "o", descriptor = "[B")
	private byte[] aByteArray15 = new byte[65000];

	@OriginalMember(owner = "client!QJAHKUCY", name = "p", descriptor = "I")
	private int anInt499 = -289;

	@OriginalMember(owner = "client!QJAHKUCY", name = "q", descriptor = "Lclient!JTFJPMGL;")
	private Class19 aClass19_2 = new Class19(-120);

	@OriginalMember(owner = "client!QJAHKUCY", name = "u", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_3 = new Class12(false);

	@OriginalMember(owner = "client!QJAHKUCY", name = "w", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!QJAHKUCY", name = "z", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_4 = new Class12(false);

	@OriginalMember(owner = "client!QJAHKUCY", name = "A", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!QJAHKUCY", name = "H", descriptor = "[B")
	private byte[] aByteArray16 = new byte[500];

	@OriginalMember(owner = "client!QJAHKUCY", name = "I", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!QJAHKUCY", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!QJAHKUCY", name = "L", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!QJAHKUCY", name = "M", descriptor = "I")
	private int anInt508 = 707;

	@OriginalMember(owner = "client!QJAHKUCY", name = "O", descriptor = "I")
	private int anInt509 = 165;

	@OriginalMember(owner = "client!QJAHKUCY", name = "R", descriptor = "Lclient!EZXKBAZY;")
	private Class12 aClass12_5 = new Class12(false);

	@OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(I)I")
	public int method300() {
		try {
			return this.anIntArray111.length;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("22284, " + 16517 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(ZI)V")
	public void method301(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray110.length;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				if (arg0 || this.anIntArray113[local16] != 0) {
					this.method307(this.anIntArray114[local16], (byte) 2, 3);
					this.method307(this.anIntArray112[local16], (byte) 2, 3);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("36032, " + arg0 + ", " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(ILclient!ACXEOGCN;)V")
	private void method302(@OriginalArg(1) Class2_Sub1_Sub1 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong20 < 4000L) {
						return;
					}
					this.aLong20 = local11;
					this.aSocket2 = this.aClient3.method673(client.anInt1002 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt498 = 0;
				}
				this.aByteArray16[0] = (byte) arg0.anInt8;
				this.aByteArray16[1] = (byte) (arg0.anInt7 >> 8);
				this.aByteArray16[2] = (byte) arg0.anInt7;
				if (arg0.aBoolean6) {
					this.aByteArray16[3] = 2;
				} else if (this.aClient3.aBoolean238) {
					this.aByteArray16[3] = 0;
				} else {
					this.aByteArray16[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray16, 0, 4);
				this.anInt497 = 0;
				this.anInt507 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket2.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt504 = 0;
				this.anInt507++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("42951, " + -513 + ", " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(Lclient!FXNTEMPE;Lclient!client;)V")
	public void method303(@OriginalArg(0) Class13 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method117(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub4 local42 = new Class2_Sub1_Sub4(local31, -46859);
			this.anIntArrayArray10[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray10[local22][local56] = local42.method342();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method117(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub4 local115 = new Class2_Sub1_Sub4(local104, -46859);
			this.anIntArrayArray9[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray9[local36][local123] = local115.method345();
			}
		}
		local104 = arg0.method117("model_index", null);
		local56 = this.anIntArrayArray10[0].length;
		this.aByteArray14 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray14[local158] = local104[local158];
			} else {
				this.aByteArray14[local158] = 0;
			}
		}
		local104 = arg0.method117("map_index", null);
		@Pc(193) Class2_Sub1_Sub4 local193 = new Class2_Sub1_Sub4(local104, -46859);
		local56 = local104.length / 7;
		this.anIntArray110 = new int[local56];
		this.anIntArray112 = new int[local56];
		this.anIntArray114 = new int[local56];
		this.anIntArray113 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray110[local216] = local193.method342();
			this.anIntArray112[local216] = local193.method342();
			this.anIntArray114[local216] = local193.method342();
			this.anIntArray113[local216] = local193.method340();
		}
		local104 = arg0.method117("anim_index", null);
		local193 = new Class2_Sub1_Sub4(local104, -46859);
		local56 = local104.length / 2;
		this.anIntArray111 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray111[local268] = local193.method342();
		}
		local104 = arg0.method117("midi_index", null);
		local193 = new Class2_Sub1_Sub4(local104, -46859);
		local56 = local104.length;
		this.anIntArray109 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray109[local300] = local193.method340();
		}
		this.aClient3 = arg1;
		this.aBoolean129 = true;
		this.aClient3.method587(this, 2);
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean129) {
				this.anInt502++;
				@Pc(11) byte local11 = 20;
				if (this.anInt506 == 0 && this.aClient3.aClass47Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean128 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean128; local32++) {
					this.aBoolean128 = false;
					this.method308();
					this.method315(this.anInt508);
					if (this.anInt500 == 0 && local32 >= 5) {
						break;
					}
					this.method309((byte) 6);
					if (this.anInputStream2 != null) {
						this.method317();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class2_Sub1_Sub1 local73;
				for (local73 = (Class2_Sub1_Sub1) this.aClass12_4.method111(); local73 != null; local73 = (Class2_Sub1_Sub1) this.aClass12_4.method113()) {
					if (local73.aBoolean6) {
						local68 = true;
						local73.anInt9++;
						if (local73.anInt9 > 50) {
							local73.anInt9 = 0;
							this.method302(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class2_Sub1_Sub1) this.aClass12_4.method111(); local73 != null; local73 = (Class2_Sub1_Sub1) this.aClass12_4.method113()) {
						local68 = true;
						local73.anInt9++;
						if (local73.anInt9 > 50) {
							local73.anInt9 = 0;
							this.method302(local73);
						}
					}
				}
				if (local68) {
					this.anInt498++;
					if (this.anInt498 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt504 = 0;
					}
				} else {
					this.anInt498 = 0;
					this.aString12 = "";
				}
				if (this.aClient3.aBoolean238 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt506 > 0 || this.aClient3.aClass47Array1[0] == null)) {
					this.anInt497++;
					if (this.anInt497 > 500) {
						this.anInt497 = 0;
						this.aByteArray16[0] = 0;
						this.aByteArray16[1] = 0;
						this.aByteArray16[2] = 0;
						this.aByteArray16[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray16, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt498 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(I)V")
	@Override
	public void method299(@OriginalArg(0) int arg0) {
		this.method316(0, arg0);
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(IB)Z")
	public boolean method304(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray110.length; local3++) {
				if (this.anIntArray114[local3] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("47544, " + arg0 + ", " + 123 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "c", descriptor = "(I)V")
	public void method305() {
		try {
			@Pc(2) Class12 local2 = this.aClass12_1;
			synchronized (this.aClass12_1) {
				this.aClass12_1.method115();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("95510, " + -41110 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(II)I")
	public int method306(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray10[arg0].length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("14939, " + arg0 + ", " + 1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(IIBI)V")
	public void method307(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient3.aClass47Array1[0] != null && this.anIntArrayArray10[arg2][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass47Array1[arg2 + 1].method568(arg0);
				if (!this.method320(local25, this.anIntArrayArray9[arg2][arg0], this.anIntArrayArray10[arg2][arg0])) {
					this.aByteArrayArray4[arg2][arg0] = arg1;
					if (arg1 > this.anInt506) {
						this.anInt506 = arg1;
					}
					this.anInt510++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("93562, " + arg0 + ", " + -155 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "d", descriptor = "(I)V")
	private void method308() {
		try {
			@Pc(4) Class12 local4 = this.aClass12_5;
			@Pc(11) Class2_Sub1_Sub1 local11;
			synchronized (this.aClass12_5) {
				local11 = (Class2_Sub1_Sub1) this.aClass12_5.method110();
			}
			while (local11 != null) {
				this.aBoolean128 = true;
				@Pc(29) byte[] local29 = null;
				if (this.aClient3.aClass47Array1[0] != null) {
					local29 = this.aClient3.aClass47Array1[local11.anInt8 + 1].method568(local11.anInt7);
				}
				if (!this.method320(local29, this.anIntArrayArray9[local11.anInt8][local11.anInt7], this.anIntArrayArray10[local11.anInt8][local11.anInt7])) {
					local29 = null;
				}
				@Pc(74) Class12 local74 = this.aClass12_5;
				synchronized (this.aClass12_5) {
					if (local29 == null) {
						this.aClass12_3.method108(local11);
					} else {
						local11.aByteArray1 = local29;
						@Pc(90) Class12 local90 = this.aClass12_2;
						synchronized (this.aClass12_2) {
							this.aClass12_2.method108(local11);
						}
					}
					local11 = (Class2_Sub1_Sub1) this.aClass12_5.method110();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("45156, " + 0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(B)V")
	private void method309(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (this.anInt500 == 0) {
				if (this.anInt501 >= 10 || this.anInt506 == 0) {
					return;
				}
				@Pc(19) Class12 local19 = this.aClass12_1;
				@Pc(26) Class2_Sub1_Sub1 local26;
				synchronized (this.aClass12_1) {
					local26 = (Class2_Sub1_Sub1) this.aClass12_1.method110();
				}
				while (local26 != null) {
					if (this.aByteArrayArray4[local26.anInt8][local26.anInt7] != 0) {
						this.aByteArrayArray4[local26.anInt8][local26.anInt7] = 0;
						this.aClass12_4.method108(local26);
						this.method302(local26);
						this.aBoolean128 = true;
						if (this.anInt505 < this.anInt510) {
							this.anInt505++;
						}
						this.aString12 = "Loading extra files - " + this.anInt505 * 100 / this.anInt510 + "%";
						this.anInt501++;
						if (this.anInt501 == 10) {
							return;
						}
					}
					local19 = this.aClass12_1;
					synchronized (this.aClass12_1) {
						local26 = (Class2_Sub1_Sub1) this.aClass12_1.method110();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray4[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt506) {
							local127[local132] = 0;
							local26 = new Class2_Sub1_Sub1();
							local26.anInt8 = local120;
							local26.anInt7 = local132;
							local26.aBoolean6 = false;
							this.aClass12_4.method108(local26);
							this.method302(local26);
							this.aBoolean128 = true;
							if (this.anInt505 < this.anInt510) {
								this.anInt505++;
							}
							this.aString12 = "Loading extra files - " + this.anInt505 * 100 / this.anInt510 + "%";
							this.anInt501++;
							if (this.anInt501 == 10) {
								return;
							}
						}
					}
				}
				this.anInt506--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("32296, " + arg0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(BI)I")
	public int method310(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray14[arg0] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("25131, " + 4 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(IIBI)I")
	public int method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg2;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray110.length; local7++) {
				if (this.anIntArray110[local7] == local5) {
					if (arg1 == 0) {
						return this.anIntArray112[local7];
					}
					return this.anIntArray114[local7];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("6748, " + arg0 + ", " + arg1 + ", " + 14 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "()V")
	public void method312() {
		this.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "()I")
	public int method313() {
		@Pc(2) Class19 local2 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			return this.aClass19_2.method200();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "c", descriptor = "()Lclient!ACXEOGCN;")
	public Class2_Sub1_Sub1 method314() {
		@Pc(4) Class12 local4 = this.aClass12_2;
		@Pc(11) Class2_Sub1_Sub1 local11;
		synchronized (this.aClass12_2) {
			local11 = (Class2_Sub1_Sub1) this.aClass12_2.method110();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class19 local24 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			local11.method508();
		}
		if (local11.aByteArray1 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray1));
			while (true) {
				if (local41 == this.aByteArray15.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray15, local41, this.aByteArray15.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray1 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray1[local93] = this.aByteArray15[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "e", descriptor = "(I)V")
	private void method315(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > 0) {
				this.anInt500 = 0;
				this.anInt501 = 0;
				@Pc(15) Class2_Sub1_Sub1 local15;
				for (local15 = (Class2_Sub1_Sub1) this.aClass12_4.method111(); local15 != null; local15 = (Class2_Sub1_Sub1) this.aClass12_4.method113()) {
					if (local15.aBoolean6) {
						this.anInt500++;
					} else {
						this.anInt501++;
					}
				}
				while (this.anInt500 < 10) {
					local15 = (Class2_Sub1_Sub1) this.aClass12_3.method110();
					if (local15 == null) {
						break;
					}
					if (this.aByteArrayArray4[local15.anInt8][local15.anInt7] != 0) {
						this.anInt505++;
					}
					this.aByteArrayArray4[local15.anInt8][local15.anInt7] = 0;
					this.aClass12_4.method108(local15);
					this.anInt500++;
					this.method302(local15);
					this.aBoolean128 = true;
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("97494, " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(II)V")
	public void method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray10.length || arg1 < 0 || arg1 > this.anIntArrayArray10[arg0].length || this.anIntArrayArray10[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class19 local27 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			@Pc(34) Class2_Sub1_Sub1 local34;
			for (local34 = (Class2_Sub1_Sub1) this.aClass19_2.method198(); local34 != null; local34 = (Class2_Sub1_Sub1) this.aClass19_2.method199(262)) {
				if (local34.anInt8 == arg0 && local34.anInt7 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub1();
			local34.anInt8 = arg0;
			local34.anInt7 = arg1;
			local34.aBoolean6 = true;
			@Pc(71) Class12 local71 = this.aClass12_5;
			synchronized (this.aClass12_5) {
				this.aClass12_5.method108(local34);
			}
			this.aClass19_2.method196(local34);
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "f", descriptor = "(I)V")
	private void method317() {
		try {
			try {
				@Pc(16) int local16 = this.anInputStream2.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt504 == 0 && local16 >= 6) {
					this.aBoolean128 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream2.read(this.aByteArray16, local27, 6 - local27)) {
					}
					local51 = this.aByteArray16[0] & 0xFF;
					local67 = ((this.aByteArray16[1] & 0xFF) << 8) + (this.aByteArray16[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray16[3] & 0xFF) << 8) + (this.aByteArray16[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray16[5] & 0xFF;
					this.aClass2_Sub1_Sub1_1 = null;
					for (@Pc(98) Class2_Sub1_Sub1 local98 = (Class2_Sub1_Sub1) this.aClass12_4.method111(); local98 != null; local98 = (Class2_Sub1_Sub1) this.aClass12_4.method113()) {
						if (local98.anInt8 == local51 && local98.anInt7 == local67) {
							this.aClass2_Sub1_Sub1_1 = local98;
						}
						if (this.aClass2_Sub1_Sub1_1 != null) {
							local98.anInt9 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub1_1 != null) {
						this.anInt498 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass2_Sub1_Sub1_1.aByteArray1 = null;
							if (this.aClass2_Sub1_Sub1_1.aBoolean6) {
								@Pc(156) Class12 local156 = this.aClass12_2;
								synchronized (this.aClass12_2) {
									this.aClass12_2.method108(this.aClass2_Sub1_Sub1_1);
								}
							} else {
								this.aClass2_Sub1_Sub1_1.method507();
							}
							this.aClass2_Sub1_Sub1_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub1_1.aByteArray1 == null && local90 == 0) {
								this.aClass2_Sub1_Sub1_1.aByteArray1 = new byte[local83];
							}
							if (this.aClass2_Sub1_Sub1_1.aByteArray1 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt503 = local90 * 500;
					this.anInt504 = 500;
					if (this.anInt504 > local83 - local90 * 500) {
						this.anInt504 = local83 - local90 * 500;
					}
				}
				if (this.anInt504 > 0 && local16 >= this.anInt504) {
					this.aBoolean128 = true;
					@Pc(235) byte[] local235 = this.aByteArray16;
					local51 = 0;
					if (this.aClass2_Sub1_Sub1_1 != null) {
						local235 = this.aClass2_Sub1_Sub1_1.aByteArray1;
						local51 = this.anInt503;
					}
					for (local67 = 0; local67 < this.anInt504; local67 += this.anInputStream2.read(local235, local67 + local51, this.anInt504 - local67)) {
					}
					if (this.anInt504 + this.anInt503 >= local235.length && this.aClass2_Sub1_Sub1_1 != null) {
						if (this.aClient3.aClass47Array1[0] != null) {
							this.aClient3.aClass47Array1[this.aClass2_Sub1_Sub1_1.anInt8 + 1].method569(local235, local235.length, this.aClass2_Sub1_Sub1_1.anInt7);
						}
						if (!this.aClass2_Sub1_Sub1_1.aBoolean6 && this.aClass2_Sub1_Sub1_1.anInt8 == 3) {
							this.aClass2_Sub1_Sub1_1.aBoolean6 = true;
							this.aClass2_Sub1_Sub1_1.anInt8 = 93;
						}
						if (this.aClass2_Sub1_Sub1_1.aBoolean6) {
							@Pc(328) Class12 local328 = this.aClass12_2;
							synchronized (this.aClass12_2) {
								this.aClass12_2.method108(this.aClass2_Sub1_Sub1_1);
							}
						} else {
							this.aClass2_Sub1_Sub1_1.method507();
						}
					}
					this.anInt504 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket2.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt504 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("93726, " + 2412 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(BI)Z")
	public boolean method318(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray109[arg0] == 1;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("41923, " + 8 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(III)V")
	public void method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient3.aClass47Array1[0] != null && (this.anIntArrayArray10[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt506 != 0))) {
				@Pc(30) Class2_Sub1_Sub1 local30 = new Class2_Sub1_Sub1();
				local30.anInt8 = arg1;
				local30.anInt7 = arg0;
				local30.aBoolean6 = false;
				@Pc(43) boolean local43 = false;
				@Pc(46) Class12 local46 = this.aClass12_1;
				synchronized (this.aClass12_1) {
					this.aClass12_1.method108(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("97679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "([BIII)Z")
	private boolean method320(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(52) int local52 = (int) this.aCRC32_1.getValue();
			if (local28 == arg2) {
				return local52 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("13814, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}
}
