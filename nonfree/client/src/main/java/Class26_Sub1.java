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

@OriginalClass("client!MWSOISVX")
public final class Class26_Sub1 extends Class26 implements Runnable {

	@OriginalMember(owner = "client!MWSOISVX", name = "f", descriptor = "Z")
	private static boolean aBoolean119 = true;

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!MWSOISVX", name = "b", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!MWSOISVX", name = "g", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!MWSOISVX", name = "h", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!MWSOISVX", name = "i", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!MWSOISVX", name = "j", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!MWSOISVX", name = "m", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!MWSOISVX", name = "p", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!MWSOISVX", name = "s", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!MWSOISVX", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!MWSOISVX", name = "v", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!MWSOISVX", name = "x", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!MWSOISVX", name = "y", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!MWSOISVX", name = "z", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!MWSOISVX", name = "A", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!MWSOISVX", name = "G", descriptor = "Lclient!COEBDAGX;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_1;

	@OriginalMember(owner = "client!MWSOISVX", name = "I", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!MWSOISVX", name = "J", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!MWSOISVX", name = "K", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!MWSOISVX", name = "L", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!MWSOISVX", name = "N", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!MWSOISVX", name = "O", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!MWSOISVX", name = "R", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!MWSOISVX", name = "S", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!MWSOISVX", name = "c", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_4 = new Class48(-489);

	@OriginalMember(owner = "client!MWSOISVX", name = "d", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_5 = new Class48(-489);

	@OriginalMember(owner = "client!MWSOISVX", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray7 = new int[4][];

	@OriginalMember(owner = "client!MWSOISVX", name = "k", descriptor = "Z")
	private boolean aBoolean120 = true;

	@OriginalMember(owner = "client!MWSOISVX", name = "l", descriptor = "I")
	private int anInt468 = -596;

	@OriginalMember(owner = "client!MWSOISVX", name = "n", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_6 = new Class48(-489);

	@OriginalMember(owner = "client!MWSOISVX", name = "o", descriptor = "Lclient!QUHNUHWS;")
	private Class35 aClass35_1 = new Class35(-160);

	@OriginalMember(owner = "client!MWSOISVX", name = "q", descriptor = "I")
	private int anInt469 = 4;

	@OriginalMember(owner = "client!MWSOISVX", name = "r", descriptor = "I")
	private int anInt470 = 44965;

	@OriginalMember(owner = "client!MWSOISVX", name = "u", descriptor = "B")
	private byte aByte21 = 7;

	@OriginalMember(owner = "client!MWSOISVX", name = "w", descriptor = "[B")
	private byte[] aByteArray9 = new byte[65000];

	@OriginalMember(owner = "client!MWSOISVX", name = "B", descriptor = "Ljava/lang/String;")
	public String aString14 = "";

	@OriginalMember(owner = "client!MWSOISVX", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray8 = new int[4][];

	@OriginalMember(owner = "client!MWSOISVX", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[4][];

	@OriginalMember(owner = "client!MWSOISVX", name = "E", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_7 = new Class48(-489);

	@OriginalMember(owner = "client!MWSOISVX", name = "F", descriptor = "Lclient!ZCVCEQHJ;")
	private Class48 aClass48_8 = new Class48(-489);

	@OriginalMember(owner = "client!MWSOISVX", name = "H", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!MWSOISVX", name = "M", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!MWSOISVX", name = "P", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!MWSOISVX", name = "Q", descriptor = "B")
	private byte aByte22 = 7;

	@OriginalMember(owner = "client!MWSOISVX", name = "T", descriptor = "[B")
	private byte[] aByteArray11 = new byte[500];

	@OriginalMember(owner = "client!MWSOISVX", name = "U", descriptor = "I")
	private int anInt479 = -242;

	@OriginalMember(owner = "client!MWSOISVX", name = "b", descriptor = "(I)V")
	private void method268() {
		try {
			while (this.anInt475 == 0) {
				if (this.anInt476 >= 10 || this.anInt472 == 0) {
					return;
				}
				@Pc(11) Class48 local11 = this.aClass48_7;
				@Pc(18) Class2_Sub1_Sub3 local18;
				synchronized (this.aClass48_7) {
					local18 = (Class2_Sub1_Sub3) this.aClass48_7.method564();
				}
				while (local18 != null) {
					if (this.aByteArrayArray3[local18.anInt104][local18.anInt103] != 0) {
						this.aByteArrayArray3[local18.anInt104][local18.anInt103] = 0;
						this.aClass48_5.method562(local18);
						this.method287((byte) 1, local18);
						this.aBoolean121 = true;
						if (this.anInt478 < this.anInt465) {
							this.anInt478++;
						}
						this.aString14 = "Loading extra files - " + this.anInt478 * 100 / this.anInt465 + "%";
						this.anInt476++;
						if (this.anInt476 == 10) {
							return;
						}
					}
					local11 = this.aClass48_7;
					synchronized (this.aClass48_7) {
						local18 = (Class2_Sub1_Sub3) this.aClass48_7.method564();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray3[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt472) {
							local119[local124] = 0;
							local18 = new Class2_Sub1_Sub3();
							local18.anInt104 = local112;
							local18.anInt103 = local124;
							local18.aBoolean22 = false;
							this.aClass48_5.method562(local18);
							this.method287((byte) 1, local18);
							this.aBoolean121 = true;
							if (this.anInt478 < this.anInt465) {
								this.anInt478++;
							}
							this.aString14 = "Loading extra files - " + this.anInt478 * 100 / this.anInt465 + "%";
							this.anInt476++;
							if (this.anInt476 == 10) {
								return;
							}
						}
					}
				}
				this.anInt472--;
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("11150, " + 5 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(II)Z")
	public boolean method269(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray77.length; local3++) {
				if (this.anIntArray80[local3] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("92913, " + arg0 + ", " + -596 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "b", descriptor = "(II)V")
	public void method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray8.length || arg1 < 0 || arg1 > this.anIntArrayArray8[arg0].length || this.anIntArrayArray8[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class35 local27 = this.aClass35_1;
		synchronized (this.aClass35_1) {
			@Pc(34) Class2_Sub1_Sub3 local34;
			for (local34 = (Class2_Sub1_Sub3) this.aClass35_1.method357(); local34 != null; local34 = (Class2_Sub1_Sub3) this.aClass35_1.method358()) {
				if (local34.anInt104 == arg0 && local34.anInt103 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub3();
			local34.anInt104 = arg0;
			local34.anInt103 = arg1;
			local34.aBoolean22 = true;
			@Pc(71) Class48 local71 = this.aClass48_6;
			synchronized (this.aClass48_6) {
				this.aClass48_6.method562(local34);
			}
			this.aClass35_1.method355(local34);
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "()V")
	public void method271() {
		this.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(ZII)V")
	public void method272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient3.aClass12Array1[0] != null && (this.anIntArrayArray8[arg1][arg0] != 0 && (this.aByteArrayArray3[arg1][arg0] != 0 && this.anInt472 != 0))) {
				@Pc(30) Class2_Sub1_Sub3 local30 = new Class2_Sub1_Sub3();
				local30.anInt104 = arg1;
				local30.anInt103 = arg0;
				local30.aBoolean22 = false;
				@Pc(42) Class48 local42 = this.aClass48_7;
				synchronized (this.aClass48_7) {
					this.aClass48_7.method562(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("52258, " + false + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "c", descriptor = "(I)V")
	public void method273() {
		try {
			@Pc(6) Class48 local6 = this.aClass48_7;
			synchronized (this.aClass48_7) {
				this.aClass48_7.method569();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("34253, " + 39268 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(IBII)V")
	public void method274(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aClient3.aClass12Array1[0] != null && this.anIntArrayArray8[arg0][arg3] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass12Array1[arg0 + 1].method178(arg3);
				@Pc(29) boolean local29 = false;
				if (!this.method285(local25, this.anIntArrayArray8[arg0][arg3], this.anIntArrayArray7[arg0][arg3], this.aByte21)) {
					this.aByteArrayArray3[arg0][arg3] = arg1;
					if (arg1 > this.anInt472) {
						this.anInt472 = arg1;
					}
					this.anInt465++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("69602, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "b", descriptor = "()Lclient!COEBDAGX;")
	public Class2_Sub1_Sub3 method275() {
		@Pc(4) Class48 local4 = this.aClass48_4;
		@Pc(11) Class2_Sub1_Sub3 local11;
		synchronized (this.aClass48_4) {
			local11 = (Class2_Sub1_Sub3) this.aClass48_4.method564();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class35 local24 = this.aClass35_1;
		synchronized (this.aClass35_1) {
			local11.method559();
		}
		if (local11.aByteArray1 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray1));
			while (true) {
				if (local41 == this.aByteArray9.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray9, local41, this.aByteArray9.length - local41);
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
			local11.aByteArray1[local93] = this.aByteArray9[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(ZZ)V")
	public void method276(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(6) int local6 = this.anIntArray77.length;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				if (arg0 || this.anIntArray79[local8] != 0) {
					this.method274(3, (byte) 2, 212, this.anIntArray80[local8]);
					this.method274(3, (byte) 2, 212, this.anIntArray81[local8]);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("58741, " + true + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "d", descriptor = "(I)I")
	public int method277() {
		try {
			return this.anIntArray78.length;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("95336, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "e", descriptor = "(I)V")
	private void method278() {
		try {
			@Pc(7) int local7;
			if (this.anInt470 != 44965) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			try {
				local7 = this.anInputStream1.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt467 == 0 && local7 >= 6) {
					this.aBoolean121 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream1.read(this.aByteArray11, local27, 6 - local27)) {
					}
					local51 = this.aByteArray11[0] & 0xFF;
					local67 = ((this.aByteArray11[1] & 0xFF) << 8) + (this.aByteArray11[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray11[3] & 0xFF) << 8) + (this.aByteArray11[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray11[5] & 0xFF;
					this.aClass2_Sub1_Sub3_1 = null;
					for (@Pc(98) Class2_Sub1_Sub3 local98 = (Class2_Sub1_Sub3) this.aClass48_5.method565(); local98 != null; local98 = (Class2_Sub1_Sub3) this.aClass48_5.method567()) {
						if (local98.anInt104 == local51 && local98.anInt103 == local67) {
							this.aClass2_Sub1_Sub3_1 = local98;
						}
						if (this.aClass2_Sub1_Sub3_1 != null) {
							local98.anInt102 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub3_1 != null) {
						this.anInt471 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass2_Sub1_Sub3_1.aByteArray1 = null;
							if (this.aClass2_Sub1_Sub3_1.aBoolean22) {
								@Pc(156) Class48 local156 = this.aClass48_4;
								synchronized (this.aClass48_4) {
									this.aClass48_4.method562(this.aClass2_Sub1_Sub3_1);
								}
							} else {
								this.aClass2_Sub1_Sub3_1.method558();
							}
							this.aClass2_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub3_1.aByteArray1 == null && local90 == 0) {
								this.aClass2_Sub1_Sub3_1.aByteArray1 = new byte[local83];
							}
							if (this.aClass2_Sub1_Sub3_1.aByteArray1 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt466 = local90 * 500;
					this.anInt467 = 500;
					if (this.anInt467 > local83 - local90 * 500) {
						this.anInt467 = local83 - local90 * 500;
					}
				}
				if (this.anInt467 > 0 && local7 >= this.anInt467) {
					this.aBoolean121 = true;
					@Pc(235) byte[] local235 = this.aByteArray11;
					local51 = 0;
					if (this.aClass2_Sub1_Sub3_1 != null) {
						local235 = this.aClass2_Sub1_Sub3_1.aByteArray1;
						local51 = this.anInt466;
					}
					for (local67 = 0; local67 < this.anInt467; local67 += this.anInputStream1.read(local235, local67 + local51, this.anInt467 - local67)) {
					}
					if (this.anInt467 + this.anInt466 >= local235.length && this.aClass2_Sub1_Sub3_1 != null) {
						if (this.aClient3.aClass12Array1[0] != null) {
							this.aClient3.aClass12Array1[this.aClass2_Sub1_Sub3_1.anInt104 + 1].method179(local235.length, local235, this.aClass2_Sub1_Sub3_1.anInt103);
						}
						if (!this.aClass2_Sub1_Sub3_1.aBoolean22 && this.aClass2_Sub1_Sub3_1.anInt104 == 3) {
							this.aClass2_Sub1_Sub3_1.aBoolean22 = true;
							this.aClass2_Sub1_Sub3_1.anInt104 = 93;
						}
						if (this.aClass2_Sub1_Sub3_1.aBoolean22) {
							@Pc(328) Class48 local328 = this.aClass48_4;
							synchronized (this.aClass48_4) {
								this.aClass48_4.method562(this.aClass2_Sub1_Sub3_1);
							}
						} else {
							this.aClass2_Sub1_Sub3_1.method558();
						}
					}
					this.anInt467 = 0;
				}
			} catch (@Pc(349) IOException local349) {
				try {
					this.aSocket1.close();
				} catch (@Pc(354) Exception local354) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt467 = 0;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("14195, " + 44965 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "c", descriptor = "()I")
	public int method279() {
		@Pc(2) Class35 local2 = this.aClass35_1;
		synchronized (this.aClass35_1) {
			return this.aClass35_1.method359();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean120) {
				this.anInt474++;
				@Pc(11) byte local11 = 20;
				if (this.anInt472 == 0 && this.aClient3.aClass12Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean121 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean121; local32++) {
					this.aBoolean121 = false;
					this.method284();
					this.method286(this.aByte22);
					if (this.anInt475 == 0 && local32 >= 5) {
						break;
					}
					this.method268();
					if (this.anInputStream1 != null) {
						this.method278();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class2_Sub1_Sub3 local73;
				for (local73 = (Class2_Sub1_Sub3) this.aClass48_5.method565(); local73 != null; local73 = (Class2_Sub1_Sub3) this.aClass48_5.method567()) {
					if (local73.aBoolean22) {
						local68 = true;
						local73.anInt102++;
						if (local73.anInt102 > 50) {
							local73.anInt102 = 0;
							this.method287((byte) 1, local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class2_Sub1_Sub3) this.aClass48_5.method565(); local73 != null; local73 = (Class2_Sub1_Sub3) this.aClass48_5.method567()) {
						local68 = true;
						local73.anInt102++;
						if (local73.anInt102 > 50) {
							local73.anInt102 = 0;
							this.method287((byte) 1, local73);
						}
					}
				}
				if (local68) {
					this.anInt471++;
					if (this.anInt471 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt467 = 0;
					}
				} else {
					this.anInt471 = 0;
					this.aString14 = "";
				}
				if (this.aClient3.aBoolean262 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt472 > 0 || this.aClient3.aClass12Array1[0] == null)) {
					this.anInt477++;
					if (this.anInt477 > 500) {
						this.anInt477 = 0;
						this.aByteArray11[0] = 0;
						this.aByteArray11[1] = 0;
						this.aByteArray11[2] = 0;
						this.aByteArray11[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray11, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt471 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "c", descriptor = "(II)I")
	public int method280(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray10[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("65624, " + -30035 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(IB)Z")
	public boolean method281(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 8) {
				@Pc(4) boolean local4 = false;
			} else {
				this.anInt479 = 206;
			}
			return this.anIntArray76[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("25491, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(ZIII)I")
	public int method282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg0;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray77.length; local7++) {
				if (this.anIntArray77[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray81[local7];
					}
					return this.anIntArray80[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("73531, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(I)V")
	@Override
	public void method267(@OriginalArg(0) int arg0) {
		this.method270(0, arg0);
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(IZ)I")
	public int method283(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray8[arg0].length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("94498, " + arg0 + ", " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "f", descriptor = "(I)V")
	private void method284() {
		try {
			@Pc(4) Class48 local4 = this.aClass48_6;
			@Pc(11) Class2_Sub1_Sub3 local11;
			synchronized (this.aClass48_6) {
				local11 = (Class2_Sub1_Sub3) this.aClass48_6.method564();
			}
			while (local11 != null) {
				this.aBoolean121 = true;
				@Pc(29) byte[] local29 = null;
				if (this.aClient3.aClass12Array1[0] != null) {
					local29 = this.aClient3.aClass12Array1[local11.anInt104 + 1].method178(local11.anInt103);
				}
				if (!this.method285(local29, this.anIntArrayArray8[local11.anInt104][local11.anInt103], this.anIntArrayArray7[local11.anInt104][local11.anInt103], this.aByte21)) {
					local29 = null;
				}
				@Pc(75) Class48 local75 = this.aClass48_6;
				synchronized (this.aClass48_6) {
					if (local29 == null) {
						this.aClass48_8.method562(local11);
					} else {
						local11.aByteArray1 = local29;
						@Pc(91) Class48 local91 = this.aClass48_4;
						synchronized (this.aClass48_4) {
							this.aClass48_4.method562(local11);
						}
					}
					local11 = (Class2_Sub1_Sub3) this.aClass48_6.method564();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("80199, " + 0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "([BIIB)Z")
	private boolean method285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			if (arg3 != this.aByte21) {
				throw new NullPointerException();
			}
			@Pc(37) boolean local37 = false;
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(53) int local53 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local53 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("95809, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(B)V")
	private void method286(@OriginalArg(0) byte arg0) {
		try {
			this.anInt475 = 0;
			if (arg0 == 7) {
				this.anInt476 = 0;
				@Pc(16) Class2_Sub1_Sub3 local16;
				for (local16 = (Class2_Sub1_Sub3) this.aClass48_5.method565(); local16 != null; local16 = (Class2_Sub1_Sub3) this.aClass48_5.method567()) {
					if (local16.aBoolean22) {
						this.anInt475++;
					} else {
						this.anInt476++;
					}
				}
				while (this.anInt475 < 10) {
					local16 = (Class2_Sub1_Sub3) this.aClass48_8.method564();
					if (local16 == null) {
						break;
					}
					if (this.aByteArrayArray3[local16.anInt104][local16.anInt103] != 0) {
						this.anInt478++;
					}
					this.aByteArrayArray3[local16.anInt104][local16.anInt103] = 0;
					this.aClass48_5.method562(local16);
					this.anInt475++;
					this.method287((byte) 1, local16);
					this.aBoolean121 = true;
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("58848, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(BLclient!COEBDAGX;)V")
	private void method287(@OriginalArg(0) byte arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				if (this.aSocket1 == null) {
					@Pc(21) long local21 = System.currentTimeMillis();
					if (local21 - this.aLong18 < 4000L) {
						return;
					}
					this.aLong18 = local21;
					this.aSocket1 = this.aClient3.method590(client.anInt892 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(56) int local56 = 0; local56 < 8; local56++) {
						this.anInputStream1.read();
					}
					this.anInt471 = 0;
				}
				this.aByteArray11[0] = (byte) arg1.anInt104;
				this.aByteArray11[1] = (byte) (arg1.anInt103 >> 8);
				this.aByteArray11[2] = (byte) arg1.anInt103;
				if (arg1.aBoolean22) {
					this.aByteArray11[3] = 2;
				} else if (this.aClient3.aBoolean262) {
					this.aByteArray11[3] = 0;
				} else {
					this.aByteArray11[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray11, 0, 4);
				this.anInt477 = 0;
				this.anInt473 = -10000;
			} catch (@Pc(133) IOException local133) {
				try {
					this.aSocket1.close();
				} catch (@Pc(138) Exception local138) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt467 = 0;
				this.anInt473++;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("28214, " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWSOISVX", name = "a", descriptor = "(Lclient!FNOQZAYQ;Lclient!client;)V")
	public void method288(@OriginalArg(0) Class8 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method165(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub4 local42 = new Class2_Sub1_Sub4(local31, aBoolean119);
			this.anIntArrayArray8[local22] = new int[local36];
			this.aByteArrayArray3[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray8[local22][local56] = local42.method96();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method165(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub4 local115 = new Class2_Sub1_Sub4(local104, aBoolean119);
			this.anIntArrayArray7[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray7[local36][local123] = local115.method99();
			}
		}
		local104 = arg0.method165("model_index", null);
		local56 = this.anIntArrayArray8[0].length;
		this.aByteArray10 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray10[local158] = local104[local158];
			} else {
				this.aByteArray10[local158] = 0;
			}
		}
		local104 = arg0.method165("map_index", null);
		@Pc(193) Class2_Sub1_Sub4 local193 = new Class2_Sub1_Sub4(local104, aBoolean119);
		local56 = local104.length / 7;
		this.anIntArray77 = new int[local56];
		this.anIntArray81 = new int[local56];
		this.anIntArray80 = new int[local56];
		this.anIntArray79 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray77[local216] = local193.method96();
			this.anIntArray81[local216] = local193.method96();
			this.anIntArray80[local216] = local193.method96();
			this.anIntArray79[local216] = local193.method94();
		}
		local104 = arg0.method165("anim_index", null);
		local193 = new Class2_Sub1_Sub4(local104, aBoolean119);
		local56 = local104.length / 2;
		this.anIntArray78 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray78[local268] = local193.method96();
		}
		local104 = arg0.method165("midi_index", null);
		local193 = new Class2_Sub1_Sub4(local104, aBoolean119);
		local56 = local104.length;
		this.anIntArray76 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray76[local300] = local193.method94();
		}
		this.aClient3 = arg1;
		this.aBoolean120 = true;
		this.aClient3.method584(this, 2);
	}
}
