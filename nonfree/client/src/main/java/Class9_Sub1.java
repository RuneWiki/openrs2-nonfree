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

@OriginalClass("client!JHGVYYQH")
public final class Class9_Sub1 extends Class9 implements Runnable {

	@OriginalMember(owner = "client!JHGVYYQH", name = "q", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!JHGVYYQH", name = "c", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!JHGVYYQH", name = "d", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!JHGVYYQH", name = "g", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!JHGVYYQH", name = "l", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!JHGVYYQH", name = "m", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!JHGVYYQH", name = "n", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!JHGVYYQH", name = "o", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!JHGVYYQH", name = "p", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!JHGVYYQH", name = "r", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!JHGVYYQH", name = "s", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!JHGVYYQH", name = "t", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!JHGVYYQH", name = "v", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!JHGVYYQH", name = "w", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!JHGVYYQH", name = "x", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!JHGVYYQH", name = "A", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!JHGVYYQH", name = "B", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!JHGVYYQH", name = "F", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!JHGVYYQH", name = "H", descriptor = "Lclient!MNWUSGDU;")
	private Class5_Sub1_Sub3 aClass5_Sub1_Sub3_1;

	@OriginalMember(owner = "client!JHGVYYQH", name = "I", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!JHGVYYQH", name = "K", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!JHGVYYQH", name = "M", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!JHGVYYQH", name = "O", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!JHGVYYQH", name = "P", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!JHGVYYQH", name = "Q", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!JHGVYYQH", name = "b", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_1 = new Class41(0);

	@OriginalMember(owner = "client!JHGVYYQH", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray8 = new int[4][];

	@OriginalMember(owner = "client!JHGVYYQH", name = "f", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_2 = new Class41(0);

	@OriginalMember(owner = "client!JHGVYYQH", name = "h", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!JHGVYYQH", name = "i", descriptor = "I")
	private int anInt237 = 986;

	@OriginalMember(owner = "client!JHGVYYQH", name = "j", descriptor = "I")
	private int anInt238 = 1;

	@OriginalMember(owner = "client!JHGVYYQH", name = "k", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_3 = new Class41(0);

	@OriginalMember(owner = "client!JHGVYYQH", name = "u", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!JHGVYYQH", name = "y", descriptor = "[B")
	private byte[] aByteArray11 = new byte[500];

	@OriginalMember(owner = "client!JHGVYYQH", name = "z", descriptor = "Lclient!HIGYXWXY;")
	private Class19 aClass19_1 = new Class19(aBoolean72);

	@OriginalMember(owner = "client!JHGVYYQH", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!JHGVYYQH", name = "D", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!JHGVYYQH", name = "E", descriptor = "Ljava/lang/String;")
	public String aString3 = "";

	@OriginalMember(owner = "client!JHGVYYQH", name = "G", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_4 = new Class41(0);

	@OriginalMember(owner = "client!JHGVYYQH", name = "J", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!JHGVYYQH", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray9 = new int[4][];

	@OriginalMember(owner = "client!JHGVYYQH", name = "N", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_5 = new Class41(0);

	@OriginalMember(owner = "client!JHGVYYQH", name = "R", descriptor = "[B")
	private byte[] aByteArray12 = new byte[65000];

	@OriginalMember(owner = "client!JHGVYYQH", name = "b", descriptor = "(I)I")
	public int method140() {
		try {
			return this.anIntArray73.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("27450, " + -871 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(III[B)Z")
	private boolean method141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(56) int local56 = (int) this.aCRC32_1.getValue();
			if (local28 == arg0) {
				return local56 == arg1;
			} else {
				return false;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("77197, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(IIII)I")
	public int method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg3;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray77.length; local11++) {
				if (this.anIntArray77[local11] == local5) {
					if (arg2 == 0) {
						return this.anIntArray78[local11];
					}
					return this.anIntArray76[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("74553, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(B)V")
	private void method143() {
		try {
			this.anInt240 = 0;
			this.anInt241 = 0;
			@Pc(16) Class5_Sub1_Sub3 local16;
			for (local16 = (Class5_Sub1_Sub3) this.aClass41_5.method468(); local16 != null; local16 = (Class5_Sub1_Sub3) this.aClass41_5.method470()) {
				if (local16.aBoolean92) {
					this.anInt240++;
				} else {
					this.anInt241++;
				}
			}
			while (this.anInt240 < 10) {
				local16 = (Class5_Sub1_Sub3) this.aClass41_1.method467();
				if (local16 == null) {
					break;
				}
				if (this.aByteArrayArray3[local16.anInt288][local16.anInt290] != 0) {
					this.anInt239++;
				}
				this.aByteArrayArray3[local16.anInt288][local16.anInt290] = 0;
				this.aClass41_5.method465(local16);
				this.anInt240++;
				this.method154(local16);
				this.aBoolean70 = true;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("83414, " + 52 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(Z)V")
	private void method144() {
		try {
			while (this.anInt240 == 0) {
				if (this.anInt241 >= 10 || this.anInt246 == 0) {
					return;
				}
				@Pc(19) Class41 local19 = this.aClass41_4;
				@Pc(26) Class5_Sub1_Sub3 local26;
				synchronized (this.aClass41_4) {
					local26 = (Class5_Sub1_Sub3) this.aClass41_4.method467();
				}
				while (local26 != null) {
					if (this.aByteArrayArray3[local26.anInt288][local26.anInt290] != 0) {
						this.aByteArrayArray3[local26.anInt288][local26.anInt290] = 0;
						this.aClass41_5.method465(local26);
						this.method154(local26);
						this.aBoolean70 = true;
						if (this.anInt239 < this.anInt245) {
							this.anInt239++;
						}
						this.aString3 = "Loading extra files - " + this.anInt239 * 100 / this.anInt245 + "%";
						this.anInt241++;
						if (this.anInt241 == 10) {
							return;
						}
					}
					local19 = this.aClass41_4;
					synchronized (this.aClass41_4) {
						local26 = (Class5_Sub1_Sub3) this.aClass41_4.method467();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray3[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt246) {
							local127[local132] = 0;
							local26 = new Class5_Sub1_Sub3();
							local26.anInt288 = local120;
							local26.anInt290 = local132;
							local26.aBoolean92 = false;
							this.aClass41_5.method465(local26);
							this.method154(local26);
							this.aBoolean70 = true;
							if (this.anInt239 < this.anInt245) {
								this.anInt239++;
							}
							this.aString3 = "Loading extra files - " + this.anInt239 * 100 / this.anInt245 + "%";
							this.anInt241++;
							if (this.anInt241 == 10) {
								return;
							}
						}
					}
				}
				this.anInt246--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("86424, " + true + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "b", descriptor = "(Z)V")
	public void method145() {
		try {
			@Pc(5) Class41 local5 = this.aClass41_4;
			synchronized (this.aClass41_4) {
				this.aClass41_4.method472();
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("68361, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "c", descriptor = "(I)V")
	private void method146() {
		try {
			@Pc(14) Class41 local14 = this.aClass41_3;
			@Pc(21) Class5_Sub1_Sub3 local21;
			synchronized (this.aClass41_3) {
				local21 = (Class5_Sub1_Sub3) this.aClass41_3.method467();
			}
			while (local21 != null) {
				this.aBoolean70 = true;
				@Pc(32) byte[] local32 = null;
				if (this.aClient1.aClass42Array1[0] != null) {
					local32 = this.aClient1.aClass42Array1[local21.anInt288 + 1].method473(local21.anInt290, this.aBoolean74);
				}
				if (!this.method141(this.anIntArrayArray9[local21.anInt288][local21.anInt290], this.anIntArrayArray8[local21.anInt288][local21.anInt290], local32)) {
					local32 = null;
				}
				@Pc(78) Class41 local78 = this.aClass41_3;
				synchronized (this.aClass41_3) {
					if (local32 == null) {
						this.aClass41_1.method465(local21);
					} else {
						local21.aByteArray14 = local32;
						@Pc(94) Class41 local94 = this.aClass41_2;
						synchronized (this.aClass41_2) {
							this.aClass41_2.method465(local21);
						}
					}
					local21 = (Class5_Sub1_Sub3) this.aClass41_3.method467();
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("569, " + 9 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(II)I")
	public int method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArrayArray9[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("8498, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "d", descriptor = "(I)V")
	private void method148() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt249 == 0 && local10 >= 6) {
					this.aBoolean70 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray11, local21, 6 - local21)) {
					}
					local45 = this.aByteArray11[0] & 0xFF;
					local61 = ((this.aByteArray11[1] & 0xFF) << 8) + (this.aByteArray11[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray11[3] & 0xFF) << 8) + (this.aByteArray11[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray11[5] & 0xFF;
					this.aClass5_Sub1_Sub3_1 = null;
					for (@Pc(92) Class5_Sub1_Sub3 local92 = (Class5_Sub1_Sub3) this.aClass41_5.method468(); local92 != null; local92 = (Class5_Sub1_Sub3) this.aClass41_5.method470()) {
						if (local92.anInt288 == local45 && local92.anInt290 == local61) {
							this.aClass5_Sub1_Sub3_1 = local92;
						}
						if (this.aClass5_Sub1_Sub3_1 != null) {
							local92.anInt289 = 0;
						}
					}
					if (this.aClass5_Sub1_Sub3_1 != null) {
						this.anInt244 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass5_Sub1_Sub3_1.aByteArray14 = null;
							if (this.aClass5_Sub1_Sub3_1.aBoolean92) {
								@Pc(150) Class41 local150 = this.aClass41_2;
								synchronized (this.aClass41_2) {
									this.aClass41_2.method465(this.aClass5_Sub1_Sub3_1);
								}
							} else {
								this.aClass5_Sub1_Sub3_1.method542();
							}
							this.aClass5_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass5_Sub1_Sub3_1.aByteArray14 == null && local84 == 0) {
								this.aClass5_Sub1_Sub3_1.aByteArray14 = new byte[local77];
							}
							if (this.aClass5_Sub1_Sub3_1.aByteArray14 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt248 = local84 * 500;
					this.anInt249 = 500;
					if (this.anInt249 > local77 - local84 * 500) {
						this.anInt249 = local77 - local84 * 500;
					}
				}
				if (this.anInt249 > 0 && local10 >= this.anInt249) {
					this.aBoolean70 = true;
					@Pc(229) byte[] local229 = this.aByteArray11;
					local45 = 0;
					if (this.aClass5_Sub1_Sub3_1 != null) {
						local229 = this.aClass5_Sub1_Sub3_1.aByteArray14;
						local45 = this.anInt248;
					}
					for (local61 = 0; local61 < this.anInt249; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt249 - local61)) {
					}
					if (this.anInt249 + this.anInt248 >= local229.length && this.aClass5_Sub1_Sub3_1 != null) {
						if (this.aClient1.aClass42Array1[0] != null) {
							this.aClient1.aClass42Array1[this.aClass5_Sub1_Sub3_1.anInt288 + 1].method474(local229, this.aClass5_Sub1_Sub3_1.anInt290, local229.length);
						}
						if (!this.aClass5_Sub1_Sub3_1.aBoolean92 && this.aClass5_Sub1_Sub3_1.anInt288 == 3) {
							this.aClass5_Sub1_Sub3_1.aBoolean92 = true;
							this.aClass5_Sub1_Sub3_1.anInt288 = 93;
						}
						if (this.aClass5_Sub1_Sub3_1.aBoolean92) {
							@Pc(322) Class41 local322 = this.aClass41_2;
							synchronized (this.aClass41_2) {
								this.aClass41_2.method465(this.aClass5_Sub1_Sub3_1);
							}
						} else {
							this.aClass5_Sub1_Sub3_1.method542();
						}
					}
					this.anInt249 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket2.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt249 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("40352, " + 0 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(BI)Z")
	public boolean method149(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray77.length; local3++) {
				if (this.anIntArray76[local3] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("80012, " + 15 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(I)V")
	@Override
	public void method139(@OriginalArg(0) int arg0) {
		this.method150(0, arg0);
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "b", descriptor = "(II)V")
	public void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray9.length || arg1 < 0 || arg1 > this.anIntArrayArray9[arg0].length || this.anIntArrayArray9[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class19 local27 = this.aClass19_1;
		synchronized (this.aClass19_1) {
			@Pc(34) Class5_Sub1_Sub3 local34;
			for (local34 = (Class5_Sub1_Sub3) this.aClass19_1.method127(); local34 != null; local34 = (Class5_Sub1_Sub3) this.aClass19_1.method128()) {
				if (local34.anInt288 == arg0 && local34.anInt290 == arg1) {
					return;
				}
			}
			local34 = new Class5_Sub1_Sub3();
			local34.anInt288 = arg0;
			local34.anInt290 = arg1;
			local34.aBoolean92 = true;
			@Pc(71) Class41 local71 = this.aClass41_3;
			synchronized (this.aClass41_3) {
				this.aClass41_3.method465(local34);
			}
			this.aClass19_1.method125(local34);
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(III)V")
	public void method151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient1.aClass42Array1[0] != null && (this.anIntArrayArray9[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt246 != 0))) {
				@Pc(30) Class5_Sub1_Sub3 local30 = new Class5_Sub1_Sub3();
				local30.anInt288 = arg1;
				local30.anInt290 = arg0;
				local30.aBoolean92 = false;
				@Pc(51) Class41 local51 = this.aClass41_4;
				synchronized (this.aClass41_4) {
					this.aClass41_4.method465(local30);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("44764, " + 486 + ", " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "()Lclient!MNWUSGDU;")
	public Class5_Sub1_Sub3 method152() {
		@Pc(4) Class41 local4 = this.aClass41_2;
		@Pc(11) Class5_Sub1_Sub3 local11;
		synchronized (this.aClass41_2) {
			local11 = (Class5_Sub1_Sub3) this.aClass41_2.method467();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class19 local24 = this.aClass19_1;
		synchronized (this.aClass19_1) {
			local11.method543();
		}
		if (local11.aByteArray14 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray14));
			while (true) {
				if (local41 == this.aByteArray12.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray12, local41, this.aByteArray12.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray14 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray14[local93] = this.aByteArray12[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "b", descriptor = "()I")
	public int method153() {
		@Pc(2) Class19 local2 = this.aClass19_1;
		synchronized (this.aClass19_1) {
			return this.aClass19_1.method129();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(Lclient!MNWUSGDU;Z)V")
	private void method154(@OriginalArg(0) Class5_Sub1_Sub3 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(11) long local11 = System.currentTimeMillis();
					if (local11 - this.aLong9 < 4000L) {
						return;
					}
					this.aLong9 = local11;
					this.aSocket2 = this.aClient1.method669(client.anInt1058 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
						this.anInputStream2.read();
					}
					this.anInt244 = 0;
				}
				this.aByteArray11[0] = (byte) arg0.anInt288;
				this.aByteArray11[1] = (byte) (arg0.anInt290 >> 8);
				this.aByteArray11[2] = (byte) arg0.anInt290;
				if (arg0.aBoolean92) {
					this.aByteArray11[3] = 2;
				} else if (this.aClient1.aBoolean221) {
					this.aByteArray11[3] = 0;
				} else {
					this.aByteArray11[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray11, 0, 4);
				this.anInt247 = 0;
				this.anInt243 = -10000;
			} catch (@Pc(123) IOException local123) {
				try {
					this.aSocket2.close();
				} catch (@Pc(128) Exception local128) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt249 = 0;
				this.anInt243++;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("93764, " + arg0 + ", " + true + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(ZB)V")
	public void method155(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray77.length;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				if (arg0 || this.anIntArray75[local16] != 0) {
					this.method160((byte) 2, this.anIntArray76[local16], 3);
					this.method160((byte) 2, this.anIntArray78[local16], 3);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("26475, " + arg0 + ", " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(ZI)Z")
	public boolean method156(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray74[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("78854, " + false + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(Lclient!TXPLZUUI;Lclient!client;)V")
	public void method157(@OriginalArg(0) Class40 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method464(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class5_Sub1_Sub4 local42 = new Class5_Sub1_Sub4(local31, 0);
			this.anIntArrayArray9[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray9[local22][local56] = local42.method242();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method464(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class5_Sub1_Sub4 local115 = new Class5_Sub1_Sub4(local104, 0);
			this.anIntArrayArray8[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray8[local36][local123] = local115.method245();
			}
		}
		local104 = arg0.method464("model_index", null);
		local56 = this.anIntArrayArray9[0].length;
		this.aByteArray10 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray10[local158] = local104[local158];
			} else {
				this.aByteArray10[local158] = 0;
			}
		}
		local104 = arg0.method464("map_index", null);
		@Pc(193) Class5_Sub1_Sub4 local193 = new Class5_Sub1_Sub4(local104, 0);
		local56 = local104.length / 7;
		this.anIntArray77 = new int[local56];
		this.anIntArray78 = new int[local56];
		this.anIntArray76 = new int[local56];
		this.anIntArray75 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray77[local216] = local193.method242();
			this.anIntArray78[local216] = local193.method242();
			this.anIntArray76[local216] = local193.method242();
			this.anIntArray75[local216] = local193.method240();
		}
		local104 = arg0.method464("anim_index", null);
		local193 = new Class5_Sub1_Sub4(local104, 0);
		local56 = local104.length / 2;
		this.anIntArray73 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray73[local268] = local193.method242();
		}
		local104 = arg0.method464("midi_index", null);
		local193 = new Class5_Sub1_Sub4(local104, 0);
		local56 = local104.length;
		this.anIntArray74 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray74[local300] = local193.method240();
		}
		this.aClient1 = arg1;
		this.aBoolean71 = true;
		this.aClient1.method584(this, 2);
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(IB)I")
	public int method158(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray10[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("80781, " + arg0 + ", " + -88 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean71) {
				this.anInt242++;
				@Pc(11) byte local11 = 20;
				if (this.anInt246 == 0 && this.aClient1.aClass42Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean70 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean70; local32++) {
					this.aBoolean70 = false;
					this.method146();
					this.method143();
					if (this.anInt240 == 0 && local32 >= 5) {
						break;
					}
					this.method144();
					if (this.anInputStream2 != null) {
						this.method148();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class5_Sub1_Sub3 local72;
				for (local72 = (Class5_Sub1_Sub3) this.aClass41_5.method468(); local72 != null; local72 = (Class5_Sub1_Sub3) this.aClass41_5.method470()) {
					if (local72.aBoolean92) {
						local67 = true;
						local72.anInt289++;
						if (local72.anInt289 > 50) {
							local72.anInt289 = 0;
							this.method154(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class5_Sub1_Sub3) this.aClass41_5.method468(); local72 != null; local72 = (Class5_Sub1_Sub3) this.aClass41_5.method470()) {
						local67 = true;
						local72.anInt289++;
						if (local72.anInt289 > 50) {
							local72.anInt289 = 0;
							this.method154(local72);
						}
					}
				}
				if (local67) {
					this.anInt244++;
					if (this.anInt244 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt249 = 0;
					}
				} else {
					this.anInt244 = 0;
					this.aString3 = "";
				}
				if (this.aClient1.aBoolean221 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt246 > 0 || this.aClient1.aClass42Array1[0] == null)) {
					this.anInt247++;
					if (this.anInt247 > 500) {
						this.anInt247 = 0;
						this.aByteArray11[0] = 0;
						this.aByteArray11[1] = 0;
						this.aByteArray11[2] = 0;
						this.aByteArray11[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray11, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt244 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "c", descriptor = "()V")
	public void method159() {
		this.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!JHGVYYQH", name = "a", descriptor = "(IBII)V")
	public void method160(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient1.aClass42Array1[0] != null && this.anIntArrayArray9[arg2][arg1] != 0) {
				@Pc(26) byte[] local26 = this.aClient1.aClass42Array1[arg2 + 1].method473(arg1, this.aBoolean74);
				if (!this.method141(this.anIntArrayArray9[arg2][arg1], this.anIntArrayArray8[arg2][arg1], local26)) {
					this.aByteArrayArray3[arg2][arg1] = arg0;
					if (arg0 > this.anInt246) {
						this.anInt246 = arg0;
					}
					this.anInt245++;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("41572, " + -13858 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
