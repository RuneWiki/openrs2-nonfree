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

@OriginalClass("client!LAQKYZGL")
public final class Class26_Sub1 extends Class26 implements Runnable {

	@OriginalMember(owner = "client!LAQKYZGL", name = "l", descriptor = "I")
	private static int anInt393 = -34;

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!LAQKYZGL", name = "b", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!LAQKYZGL", name = "c", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!LAQKYZGL", name = "d", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!LAQKYZGL", name = "g", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!LAQKYZGL", name = "h", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!LAQKYZGL", name = "i", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!LAQKYZGL", name = "k", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!LAQKYZGL", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!LAQKYZGL", name = "o", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!LAQKYZGL", name = "v", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!LAQKYZGL", name = "w", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!LAQKYZGL", name = "y", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!LAQKYZGL", name = "z", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!LAQKYZGL", name = "A", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!LAQKYZGL", name = "C", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!LAQKYZGL", name = "D", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!LAQKYZGL", name = "E", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!LAQKYZGL", name = "F", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!LAQKYZGL", name = "H", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!LAQKYZGL", name = "J", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!LAQKYZGL", name = "K", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!LAQKYZGL", name = "L", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!LAQKYZGL", name = "N", descriptor = "Lclient!SFALJUFQ;")
	private Class5_Sub1_Sub3 aClass5_Sub1_Sub3_1;

	@OriginalMember(owner = "client!LAQKYZGL", name = "O", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!LAQKYZGL", name = "P", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!LAQKYZGL", name = "e", descriptor = "[B")
	private byte[] aByteArray6 = new byte[65000];

	@OriginalMember(owner = "client!LAQKYZGL", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[4][];

	@OriginalMember(owner = "client!LAQKYZGL", name = "j", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!LAQKYZGL", name = "m", descriptor = "I")
	private int anInt394 = 161;

	@OriginalMember(owner = "client!LAQKYZGL", name = "p", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_1 = new Class42((byte) 0);

	@OriginalMember(owner = "client!LAQKYZGL", name = "q", descriptor = "Lclient!TOAGRHDF;")
	private Class41 aClass41_2 = new Class41(anInt393);

	@OriginalMember(owner = "client!LAQKYZGL", name = "r", descriptor = "Z")
	private boolean aBoolean120 = true;

	@OriginalMember(owner = "client!LAQKYZGL", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[4][];

	@OriginalMember(owner = "client!LAQKYZGL", name = "t", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_2 = new Class42((byte) 0);

	@OriginalMember(owner = "client!LAQKYZGL", name = "u", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_3 = new Class42((byte) 0);

	@OriginalMember(owner = "client!LAQKYZGL", name = "x", descriptor = "I")
	private int anInt397 = 1;

	@OriginalMember(owner = "client!LAQKYZGL", name = "B", descriptor = "Ljava/lang/String;")
	public String aString8 = "";

	@OriginalMember(owner = "client!LAQKYZGL", name = "G", descriptor = "I")
	private int anInt404 = 831;

	@OriginalMember(owner = "client!LAQKYZGL", name = "I", descriptor = "I")
	private int anInt405 = -12;

	@OriginalMember(owner = "client!LAQKYZGL", name = "M", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_4 = new Class42((byte) 0);

	@OriginalMember(owner = "client!LAQKYZGL", name = "Q", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!LAQKYZGL", name = "R", descriptor = "Lclient!VLUKUYNM;")
	private Class42 aClass42_5 = new Class42((byte) 0);

	@OriginalMember(owner = "client!LAQKYZGL", name = "S", descriptor = "[B")
	private byte[] aByteArray8 = new byte[500];

	@OriginalMember(owner = "client!LAQKYZGL", name = "T", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!LAQKYZGL", name = "U", descriptor = "Z")
	private boolean aBoolean121 = true;

	@OriginalMember(owner = "client!LAQKYZGL", name = "b", descriptor = "(I)V")
	private void method198() {
		try {
			while (this.anInt398 == 0) {
				if (this.anInt399 >= 10 || this.anInt390 == 0) {
					return;
				}
				@Pc(10) Class42 local10 = this.aClass42_5;
				@Pc(17) Class5_Sub1_Sub3 local17;
				synchronized (this.aClass42_5) {
					local17 = (Class5_Sub1_Sub3) this.aClass42_5.method298();
				}
				while (local17 != null) {
					if (this.aByteArrayArray2[local17.anInt587][local17.anInt589] != 0) {
						this.aByteArrayArray2[local17.anInt587][local17.anInt589] = 0;
						this.aClass42_3.method296(local17);
						this.method199(local17);
						this.aBoolean119 = true;
						if (this.anInt395 < this.anInt402) {
							this.anInt395++;
						}
						this.aString8 = "Loading extra files - " + this.anInt395 * 100 / this.anInt402 + "%";
						this.anInt399++;
						if (this.anInt399 == 10) {
							return;
						}
					}
					local10 = this.aClass42_5;
					synchronized (this.aClass42_5) {
						local17 = (Class5_Sub1_Sub3) this.aClass42_5.method298();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray2[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt390) {
							local118[local123] = 0;
							local17 = new Class5_Sub1_Sub3();
							local17.anInt587 = local111;
							local17.anInt589 = local123;
							local17.aBoolean162 = false;
							this.aClass42_3.method296(local17);
							this.method199(local17);
							this.aBoolean119 = true;
							if (this.anInt395 < this.anInt402) {
								this.anInt395++;
							}
							this.aString8 = "Loading extra files - " + this.anInt395 * 100 / this.anInt402 + "%";
							this.anInt399++;
							if (this.anInt399 == 10) {
								return;
							}
						}
					}
				}
				this.anInt390--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("11561, " + 0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(Lclient!SFALJUFQ;Z)V")
	private void method199(@OriginalArg(0) Class5_Sub1_Sub3 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong15 < 4000L) {
						return;
					}
					this.aLong15 = local9;
					this.aSocket2 = this.aClient4.method678(client.anInt988 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt401 = 0;
				}
				this.aByteArray8[0] = (byte) arg0.anInt587;
				this.aByteArray8[1] = (byte) (arg0.anInt589 >> 8);
				this.aByteArray8[2] = (byte) arg0.anInt589;
				if (arg0.aBoolean162) {
					this.aByteArray8[3] = 2;
				} else if (this.aClient4.aBoolean245) {
					this.aByteArray8[3] = 0;
				} else {
					this.aByteArray8[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray8, 0, 4);
				this.anInt403 = 0;
				this.anInt396 = -10000;
			} catch (@Pc(121) IOException local121) {
				try {
					this.aSocket2.close();
				} catch (@Pc(126) Exception local126) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt392 = 0;
				this.anInt396++;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("19573, " + arg0 + ", " + true + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(Z)V")
	private void method200() {
		try {
			this.anInt398 = 0;
			this.anInt399 = 0;
			@Pc(15) Class5_Sub1_Sub3 local15;
			for (local15 = (Class5_Sub1_Sub3) this.aClass42_3.method299(); local15 != null; local15 = (Class5_Sub1_Sub3) this.aClass42_3.method301(this.anInt404)) {
				if (local15.aBoolean162) {
					this.anInt398++;
				} else {
					this.anInt399++;
				}
			}
			while (this.anInt398 < 10) {
				local15 = (Class5_Sub1_Sub3) this.aClass42_2.method298();
				if (local15 == null) {
					break;
				}
				if (this.aByteArrayArray2[local15.anInt587][local15.anInt589] != 0) {
					this.anInt395++;
				}
				this.aByteArrayArray2[local15.anInt587][local15.anInt589] = 0;
				this.aClass42_3.method296(local15);
				this.anInt398++;
				this.method199(local15);
				this.aBoolean119 = true;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("31162, " + true + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(IB)Z")
	public boolean method201(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray75[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("60971, " + arg0 + ", " + -72 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "()Lclient!SFALJUFQ;")
	public Class5_Sub1_Sub3 method202() {
		@Pc(4) Class42 local4 = this.aClass42_4;
		@Pc(11) Class5_Sub1_Sub3 local11;
		synchronized (this.aClass42_4) {
			local11 = (Class5_Sub1_Sub3) this.aClass42_4.method298();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class41 local24 = this.aClass41_2;
		synchronized (this.aClass41_2) {
			local11.method424();
		}
		if (local11.aByteArray12 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray12));
			while (true) {
				if (local41 == this.aByteArray6.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray6, local41, this.aByteArray6.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray12 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray12[local93] = this.aByteArray6[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "c", descriptor = "(I)V")
	private void method203() {
		try {
			@Pc(5) Class42 local5 = this.aClass42_1;
			@Pc(12) Class5_Sub1_Sub3 local12;
			synchronized (this.aClass42_1) {
				local12 = (Class5_Sub1_Sub3) this.aClass42_1.method298();
			}
			while (local12 != null) {
				this.aBoolean119 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient4.aClass19Array1[0] != null) {
					local23 = this.aClient4.aClass19Array1[local12.anInt587 + 1].method147(this.aBoolean121, local12.anInt589);
				}
				if (!this.method207(this.anIntArrayArray5[local12.anInt587][local12.anInt589], local23, this.anIntArrayArray4[local12.anInt587][local12.anInt589])) {
					local23 = null;
				}
				@Pc(69) Class42 local69 = this.aClass42_1;
				synchronized (this.aClass42_1) {
					if (local23 == null) {
						this.aClass42_2.method296(local12);
					} else {
						local12.aByteArray12 = local23;
						@Pc(85) Class42 local85 = this.aClass42_4;
						synchronized (this.aClass42_4) {
							this.aClass42_4.method296(local12);
						}
					}
					local12 = (Class5_Sub1_Sub3) this.aClass42_1.method298();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("41556, " + 0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(II)I")
	public int method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			return arg1 < 0 ? this.aByteArray7[arg0] & 0xFF : anInt393;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("83292, " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "b", descriptor = "()V")
	public void method205() {
		this.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(I)V")
	@Override
	public void method197(@OriginalArg(0) int arg0) {
		this.method206(0, arg0);
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean120) {
				this.anInt407++;
				@Pc(11) byte local11 = 20;
				if (this.anInt390 == 0 && this.aClient4.aClass19Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean119 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean119; local32++) {
					this.aBoolean119 = false;
					this.method203();
					this.method200();
					if (this.anInt398 == 0 && local32 >= 5) {
						break;
					}
					this.method198();
					if (this.anInputStream2 != null) {
						this.method218(this.anInt400);
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class5_Sub1_Sub3 local73;
				for (local73 = (Class5_Sub1_Sub3) this.aClass42_3.method299(); local73 != null; local73 = (Class5_Sub1_Sub3) this.aClass42_3.method301(this.anInt404)) {
					if (local73.aBoolean162) {
						local68 = true;
						local73.anInt588++;
						if (local73.anInt588 > 50) {
							local73.anInt588 = 0;
							this.method199(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class5_Sub1_Sub3) this.aClass42_3.method299(); local73 != null; local73 = (Class5_Sub1_Sub3) this.aClass42_3.method301(this.anInt404)) {
						local68 = true;
						local73.anInt588++;
						if (local73.anInt588 > 50) {
							local73.anInt588 = 0;
							this.method199(local73);
						}
					}
				}
				if (local68) {
					this.anInt401++;
					if (this.anInt401 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(160) Exception local160) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt392 = 0;
					}
				} else {
					this.anInt401 = 0;
					this.aString8 = "";
				}
				if (this.aClient4.aBoolean245 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt390 > 0 || this.aClient4.aClass19Array1[0] == null)) {
					this.anInt403++;
					if (this.anInt403 > 500) {
						this.anInt403 = 0;
						this.aByteArray8[0] = 0;
						this.aByteArray8[1] = 0;
						this.aByteArray8[2] = 0;
						this.aByteArray8[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray8, 0, 4);
						} catch (@Pc(241) IOException local241) {
							this.anInt401 = 5000;
						}
					}
				}
			}
		} catch (@Pc(250) Exception local250) {
			signlink.reporterror("od_ex " + local250.getMessage());
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "b", descriptor = "(II)V")
	public void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray4.length || arg1 < 0 || arg1 > this.anIntArrayArray4[arg0].length || this.anIntArrayArray4[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class41 local27 = this.aClass41_2;
		synchronized (this.aClass41_2) {
			@Pc(34) Class5_Sub1_Sub3 local34;
			for (local34 = (Class5_Sub1_Sub3) this.aClass41_2.method293(); local34 != null; local34 = (Class5_Sub1_Sub3) this.aClass41_2.method294(this.anInt404)) {
				if (local34.anInt587 == arg0 && local34.anInt589 == arg1) {
					return;
				}
			}
			local34 = new Class5_Sub1_Sub3();
			local34.anInt587 = arg0;
			local34.anInt589 = arg1;
			local34.aBoolean162 = true;
			@Pc(72) Class42 local72 = this.aClass42_1;
			synchronized (this.aClass42_1) {
				this.aClass42_1.method296(local34);
			}
			this.aClass41_2.method291(local34);
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(I[BZI)Z")
	private boolean method207(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			if (local28 == arg2) {
				return local42 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("85340, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(IIII)I")
	public int method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = (arg0 << 8) + arg1;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray74.length; local18++) {
				if (this.anIntArray74[local18] == local7) {
					if (arg2 == 0) {
						return this.anIntArray76[local18];
					}
					return this.anIntArray77[local18];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("50730, " + arg0 + ", " + arg1 + ", " + -704 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(IBII)V")
	public void method209(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aClient4.aClass19Array1[0] != null && this.anIntArrayArray4[arg0][arg2] != 0) {
				@Pc(26) byte[] local26 = this.aClient4.aClass19Array1[arg0 + 1].method147(this.aBoolean121, arg2);
				if (!this.method207(this.anIntArrayArray5[arg0][arg2], local26, this.anIntArrayArray4[arg0][arg2])) {
					this.aByteArrayArray2[arg0][arg2] = arg1;
					@Pc(55) boolean local55 = false;
					if (arg1 > this.anInt390) {
						this.anInt390 = arg1;
					}
					this.anInt402++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("6380, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(III)V")
	public void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient4.aClass19Array1[0] != null && (this.anIntArrayArray4[arg2][arg0] != 0 && (this.aByteArrayArray2[arg2][arg0] != 0 && this.anInt390 != 0))) {
				@Pc(30) Class5_Sub1_Sub3 local30 = new Class5_Sub1_Sub3();
				if (arg1 != 0) {
					for (@Pc(34) int local34 = 1; local34 > 0; local34++) {
					}
				}
				local30.anInt587 = arg2;
				local30.anInt589 = arg0;
				local30.aBoolean162 = false;
				@Pc(51) Class42 local51 = this.aClass42_5;
				synchronized (this.aClass42_5) {
					this.aClass42_5.method296(local30);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("14092, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "c", descriptor = "()I")
	public int method211() {
		@Pc(2) Class41 local2 = this.aClass41_2;
		synchronized (this.aClass41_2) {
			return this.aClass41_2.method295();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(IZ)I")
	public int method212(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			return arg1 ? this.anInt406 : this.anIntArrayArray4[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("33549, " + arg0 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(ZB)V")
	public void method213(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray74.length;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				if (arg0 || this.anIntArray79[local17] != 0) {
					this.method209(3, (byte) 2, this.anIntArray77[local17], 161);
					this.method209(3, (byte) 2, this.anIntArray76[local17], 161);
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("88094, " + arg0 + ", " + 84 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "c", descriptor = "(II)Z")
	public boolean method214(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray74.length; local14++) {
				if (this.anIntArray77[local14] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("26322, " + arg0 + ", " + -742 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "a", descriptor = "(Lclient!MJLXHQTQ;Lclient!client;)V")
	public void method215(@OriginalArg(0) Class31 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method227(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class5_Sub1_Sub4 local42 = new Class5_Sub1_Sub4(local31, -82);
			this.anIntArrayArray4[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray4[local22][local56] = local42.method439();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method227(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class5_Sub1_Sub4 local115 = new Class5_Sub1_Sub4(local104, -82);
			this.anIntArrayArray5[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray5[local36][local123] = local115.method442();
			}
		}
		local104 = arg0.method227("model_index", null);
		local56 = this.anIntArrayArray4[0].length;
		this.aByteArray7 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray7[local158] = local104[local158];
			} else {
				this.aByteArray7[local158] = 0;
			}
		}
		local104 = arg0.method227("map_index", null);
		@Pc(193) Class5_Sub1_Sub4 local193 = new Class5_Sub1_Sub4(local104, -82);
		local56 = local104.length / 7;
		this.anIntArray74 = new int[local56];
		this.anIntArray76 = new int[local56];
		this.anIntArray77 = new int[local56];
		this.anIntArray79 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray74[local216] = local193.method439();
			this.anIntArray76[local216] = local193.method439();
			this.anIntArray77[local216] = local193.method439();
			this.anIntArray79[local216] = local193.method437();
		}
		local104 = arg0.method227("anim_index", null);
		local193 = new Class5_Sub1_Sub4(local104, -82);
		local56 = local104.length / 2;
		this.anIntArray78 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray78[local268] = local193.method439();
		}
		local104 = arg0.method227("midi_index", null);
		local193 = new Class5_Sub1_Sub4(local104, -82);
		local56 = local104.length;
		this.anIntArray75 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray75[local300] = local193.method437();
		}
		this.aClient4 = arg1;
		this.aBoolean120 = true;
		this.aClient4.method582(this, 2);
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "d", descriptor = "(I)V")
	public void method216() {
		try {
			@Pc(11) Class42 local11 = this.aClass42_5;
			synchronized (this.aClass42_5) {
				this.aClass42_5.method303();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("67692, " + 257 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "b", descriptor = "(Z)I")
	public int method217() {
		try {
			return this.anIntArray78.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("74384, " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAQKYZGL", name = "e", descriptor = "(I)V")
	private void method218(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5;
			if (arg0 != 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			try {
				local5 = this.anInputStream2.available();
				@Pc(49) int local49;
				@Pc(65) int local65;
				if (this.anInt392 == 0 && local5 >= 6) {
					this.aBoolean119 = true;
					for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream2.read(this.aByteArray8, local25, 6 - local25)) {
					}
					local49 = this.aByteArray8[0] & 0xFF;
					local65 = ((this.aByteArray8[1] & 0xFF) << 8) + (this.aByteArray8[2] & 0xFF);
					@Pc(81) int local81 = ((this.aByteArray8[3] & 0xFF) << 8) + (this.aByteArray8[4] & 0xFF);
					@Pc(88) int local88 = this.aByteArray8[5] & 0xFF;
					this.aClass5_Sub1_Sub3_1 = null;
					for (@Pc(96) Class5_Sub1_Sub3 local96 = (Class5_Sub1_Sub3) this.aClass42_3.method299(); local96 != null; local96 = (Class5_Sub1_Sub3) this.aClass42_3.method301(this.anInt404)) {
						if (local96.anInt587 == local49 && local96.anInt589 == local65) {
							this.aClass5_Sub1_Sub3_1 = local96;
						}
						if (this.aClass5_Sub1_Sub3_1 != null) {
							local96.anInt588 = 0;
						}
					}
					if (this.aClass5_Sub1_Sub3_1 != null) {
						this.anInt401 = 0;
						if (local81 == 0) {
							signlink.reporterror("Rej: " + local49 + "," + local65);
							this.aClass5_Sub1_Sub3_1.aByteArray12 = null;
							if (this.aClass5_Sub1_Sub3_1.aBoolean162) {
								@Pc(155) Class42 local155 = this.aClass42_4;
								synchronized (this.aClass42_4) {
									this.aClass42_4.method296(this.aClass5_Sub1_Sub3_1);
								}
							} else {
								this.aClass5_Sub1_Sub3_1.method423();
							}
							this.aClass5_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass5_Sub1_Sub3_1.aByteArray12 == null && local88 == 0) {
								this.aClass5_Sub1_Sub3_1.aByteArray12 = new byte[local81];
							}
							if (this.aClass5_Sub1_Sub3_1.aByteArray12 == null && local88 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt391 = local88 * 500;
					this.anInt392 = 500;
					if (this.anInt392 > local81 - local88 * 500) {
						this.anInt392 = local81 - local88 * 500;
					}
				}
				if (this.anInt392 > 0 && local5 >= this.anInt392) {
					this.aBoolean119 = true;
					@Pc(234) byte[] local234 = this.aByteArray8;
					local49 = 0;
					if (this.aClass5_Sub1_Sub3_1 != null) {
						local234 = this.aClass5_Sub1_Sub3_1.aByteArray12;
						local49 = this.anInt391;
					}
					for (local65 = 0; local65 < this.anInt392; local65 += this.anInputStream2.read(local234, local65 + local49, this.anInt392 - local65)) {
					}
					if (this.anInt392 + this.anInt391 >= local234.length && this.aClass5_Sub1_Sub3_1 != null) {
						if (this.aClient4.aClass19Array1[0] != null) {
							this.aClient4.aClass19Array1[this.aClass5_Sub1_Sub3_1.anInt587 + 1].method148(local234.length, local234, this.aClass5_Sub1_Sub3_1.anInt589);
						}
						if (!this.aClass5_Sub1_Sub3_1.aBoolean162 && this.aClass5_Sub1_Sub3_1.anInt587 == 3) {
							this.aClass5_Sub1_Sub3_1.aBoolean162 = true;
							this.aClass5_Sub1_Sub3_1.anInt587 = 93;
						}
						if (this.aClass5_Sub1_Sub3_1.aBoolean162) {
							@Pc(327) Class42 local327 = this.aClass42_4;
							synchronized (this.aClass42_4) {
								this.aClass42_4.method296(this.aClass5_Sub1_Sub3_1);
							}
						} else {
							this.aClass5_Sub1_Sub3_1.method423();
						}
					}
					this.anInt392 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket2.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt392 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("83274, " + arg0 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}
}
