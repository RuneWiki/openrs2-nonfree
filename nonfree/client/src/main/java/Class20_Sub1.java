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

@OriginalClass("client!LVBGZMMP")
public final class Class20_Sub1 extends Class20 implements Runnable {

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!LVBGZMMP", name = "c", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!LVBGZMMP", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!LVBGZMMP", name = "i", descriptor = "I")
	public int anInt252;

	@OriginalMember(owner = "client!LVBGZMMP", name = "j", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!LVBGZMMP", name = "k", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!LVBGZMMP", name = "m", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!LVBGZMMP", name = "n", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!LVBGZMMP", name = "o", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!LVBGZMMP", name = "p", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!LVBGZMMP", name = "q", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!LVBGZMMP", name = "r", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!LVBGZMMP", name = "s", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!LVBGZMMP", name = "t", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!LVBGZMMP", name = "w", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!LVBGZMMP", name = "y", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!LVBGZMMP", name = "A", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!LVBGZMMP", name = "B", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!LVBGZMMP", name = "C", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!LVBGZMMP", name = "E", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!LVBGZMMP", name = "F", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!LVBGZMMP", name = "K", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!LVBGZMMP", name = "O", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!LVBGZMMP", name = "P", descriptor = "Lclient!WNUCRRKP;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!LVBGZMMP", name = "d", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!LVBGZMMP", name = "f", descriptor = "[B")
	private byte[] aByteArray5 = new byte[65000];

	@OriginalMember(owner = "client!LVBGZMMP", name = "g", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!LVBGZMMP", name = "h", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!LVBGZMMP", name = "l", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_4 = new Class30(9203);

	@OriginalMember(owner = "client!LVBGZMMP", name = "u", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!LVBGZMMP", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[4][];

	@OriginalMember(owner = "client!LVBGZMMP", name = "x", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_5 = new Class30(9203);

	@OriginalMember(owner = "client!LVBGZMMP", name = "z", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_6 = new Class30(9203);

	@OriginalMember(owner = "client!LVBGZMMP", name = "D", descriptor = "[B")
	private byte[] aByteArray7 = new byte[500];

	@OriginalMember(owner = "client!LVBGZMMP", name = "G", descriptor = "Ljava/lang/String;")
	public String aString2 = "";

	@OriginalMember(owner = "client!LVBGZMMP", name = "H", descriptor = "Lclient!AAITTAMV;")
	private Class1 aClass1_2 = new Class1((byte) -113);

	@OriginalMember(owner = "client!LVBGZMMP", name = "I", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_7 = new Class30(9203);

	@OriginalMember(owner = "client!LVBGZMMP", name = "J", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!LVBGZMMP", name = "L", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!LVBGZMMP", name = "M", descriptor = "Lclient!QGWIBVPG;")
	private Class30 aClass30_8 = new Class30(9203);

	@OriginalMember(owner = "client!LVBGZMMP", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray7 = new int[4][];

	@OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "(I)V")
	public void method283() {
		try {
			@Pc(11) Class30 local11 = this.aClass30_5;
			synchronized (this.aClass30_5) {
				this.aClass30_5.method350();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("71729, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(Lclient!WNUCRRKP;Z)V")
	private void method284(@OriginalArg(0) Class4_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong15 < 4000L) {
						return;
					}
					this.aLong15 = local9;
					this.aSocket1 = this.aClient3.method619(client.anInt853 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream1.read();
					}
					this.anInt261 = 0;
				}
				this.aByteArray7[0] = (byte) arg0.anInt637;
				this.aByteArray7[1] = (byte) (arg0.anInt636 >> 8);
				this.aByteArray7[2] = (byte) arg0.anInt636;
				if (arg0.aBoolean175) {
					this.aByteArray7[3] = 2;
				} else if (this.aClient3.aBoolean241) {
					this.aByteArray7[3] = 0;
				} else {
					this.aByteArray7[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray7, 0, 4);
				this.anInt257 = 0;
				this.anInt256 = -10000;
			} catch (@Pc(121) IOException local121) {
				try {
					this.aSocket1.close();
				} catch (@Pc(126) Exception local126) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt254 = 0;
				this.anInt256++;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("2892, " + arg0 + ", " + false + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(BI)I")
	public int method285(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray7[arg0].length;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("84650, " + -58 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(BZ)V")
	public void method286(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray75.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray77[local5] != 0) {
					this.method291(3, (byte) 2, this.anIntArray78[local5]);
					this.method291(3, (byte) 2, this.anIntArray79[local5]);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37420, " + -122 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "c", descriptor = "(I)V")
	private void method287() {
		try {
			this.anInt259 = 0;
			this.anInt260 = 0;
			@Pc(12) Class4_Sub1_Sub4 local12;
			for (local12 = (Class4_Sub1_Sub4) this.aClass30_6.method346(); local12 != null; local12 = (Class4_Sub1_Sub4) this.aClass30_6.method348()) {
				if (local12.aBoolean175) {
					this.anInt259++;
				} else {
					this.anInt260++;
				}
			}
			while (this.anInt259 < 10) {
				local12 = (Class4_Sub1_Sub4) this.aClass30_7.method345();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray2[local12.anInt637][local12.anInt636] != 0) {
					this.anInt262++;
				}
				this.aByteArrayArray2[local12.anInt637][local12.anInt636] = 0;
				this.aClass30_6.method343(local12);
				this.anInt259++;
				this.method284(local12);
				this.aBoolean92 = true;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("82030, " + 6 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "([BIIB)Z")
	private boolean method288(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg0.length - 2;
			@Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local12);
			@Pc(53) int local53 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local53 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("58131, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "()V")
	public void method289() {
		this.aBoolean93 = false;
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(IB)Z")
	public boolean method290(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray75.length; local1++) {
				if (this.anIntArray78[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("36842, " + arg0 + ", " + 6 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean93) {
				this.anInt252++;
				@Pc(11) byte local11 = 20;
				if (this.anInt258 == 0 && this.aClient3.aClass3Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean92 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean92; local32++) {
					this.aBoolean92 = false;
					this.method303();
					this.method287();
					if (this.anInt259 == 0 && local32 >= 5) {
						break;
					}
					this.method296();
					if (this.anInputStream1 != null) {
						this.method301();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class4_Sub1_Sub4 local72;
				for (local72 = (Class4_Sub1_Sub4) this.aClass30_6.method346(); local72 != null; local72 = (Class4_Sub1_Sub4) this.aClass30_6.method348()) {
					if (local72.aBoolean175) {
						local67 = true;
						local72.anInt638++;
						if (local72.anInt638 > 50) {
							local72.anInt638 = 0;
							this.method284(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class4_Sub1_Sub4) this.aClass30_6.method346(); local72 != null; local72 = (Class4_Sub1_Sub4) this.aClass30_6.method348()) {
						local67 = true;
						local72.anInt638++;
						if (local72.anInt638 > 50) {
							local72.anInt638 = 0;
							this.method284(local72);
						}
					}
				}
				if (local67) {
					this.anInt261++;
					if (this.anInt261 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt254 = 0;
					}
				} else {
					this.anInt261 = 0;
					this.aString2 = "";
				}
				if (this.aClient3.aBoolean241 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt258 > 0 || this.aClient3.aClass3Array1[0] == null)) {
					this.anInt257++;
					if (this.anInt257 > 500) {
						this.anInt257 = 0;
						this.aByteArray7[0] = 0;
						this.aByteArray7[1] = 0;
						this.aByteArray7[2] = 0;
						this.aByteArray7[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray7, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt261 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(IBII)V")
	public void method291(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient3.aClass3Array1[0] != null && this.anIntArrayArray7[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient3.aClass3Array1[arg0 + 1].method8(arg2);
				if (!this.method288(local25, this.anIntArrayArray7[arg0][arg2], this.anIntArrayArray6[arg0][arg2])) {
					this.aByteArrayArray2[arg0][arg2] = arg1;
					if (arg1 > this.anInt258) {
						this.anInt258 = arg1;
					}
					this.anInt255++;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("39054, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 55 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(II)V")
	public void method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray7.length || arg1 < 0 || arg1 > this.anIntArrayArray7[arg0].length || this.anIntArrayArray7[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class1 local27 = this.aClass1_2;
		synchronized (this.aClass1_2) {
			@Pc(34) Class4_Sub1_Sub4 local34;
			for (local34 = (Class4_Sub1_Sub4) this.aClass1_2.method3(); local34 != null; local34 = (Class4_Sub1_Sub4) this.aClass1_2.method4()) {
				if (local34.anInt637 == arg0 && local34.anInt636 == arg1) {
					return;
				}
			}
			local34 = new Class4_Sub1_Sub4();
			local34.anInt637 = arg0;
			local34.anInt636 = arg1;
			local34.aBoolean175 = true;
			@Pc(71) Class30 local71 = this.aClass30_4;
			synchronized (this.aClass30_4) {
				this.aClass30_4.method343(local34);
			}
			this.aClass1_2.method1(local34);
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "(II)Z")
	public boolean method293(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray76[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("47551, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(III)V")
	public void method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient3.aClass3Array1[0] != null && (this.anIntArrayArray7[arg2][arg0] != 0 && (this.aByteArrayArray2[arg2][arg0] != 0 && this.anInt258 != 0))) {
				@Pc(30) Class4_Sub1_Sub4 local30 = new Class4_Sub1_Sub4();
				local30.anInt637 = arg2;
				local30.anInt636 = arg0;
				local30.aBoolean175 = false;
				@Pc(42) Class30 local42 = this.aClass30_5;
				synchronized (this.aClass30_5) {
					this.aClass30_5.method343(local30);
				}
				if (arg1 != 11573) {
					this.aBoolean96 = !this.aBoolean96;
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("61813, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(B)I")
	public int method295() {
		try {
			return this.anIntArray80.length;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("99348, " + -117 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(Z)V")
	private void method296() {
		try {
			while (this.anInt259 == 0) {
				if (this.anInt260 >= 10 || this.anInt258 == 0) {
					return;
				}
				@Pc(10) Class30 local10 = this.aClass30_5;
				@Pc(17) Class4_Sub1_Sub4 local17;
				synchronized (this.aClass30_5) {
					local17 = (Class4_Sub1_Sub4) this.aClass30_5.method345();
				}
				while (local17 != null) {
					if (this.aByteArrayArray2[local17.anInt637][local17.anInt636] != 0) {
						this.aByteArrayArray2[local17.anInt637][local17.anInt636] = 0;
						this.aClass30_6.method343(local17);
						this.method284(local17);
						this.aBoolean92 = true;
						if (this.anInt262 < this.anInt255) {
							this.anInt262++;
						}
						this.aString2 = "Loading extra files - " + this.anInt262 * 100 / this.anInt255 + "%";
						this.anInt260++;
						if (this.anInt260 == 10) {
							return;
						}
					}
					local10 = this.aClass30_5;
					synchronized (this.aClass30_5) {
						local17 = (Class4_Sub1_Sub4) this.aClass30_5.method345();
					}
				}
				for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
					@Pc(118) byte[] local118 = this.aByteArrayArray2[local111];
					@Pc(121) int local121 = local118.length;
					for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
						if (local118[local123] == this.anInt258) {
							local118[local123] = 0;
							local17 = new Class4_Sub1_Sub4();
							local17.anInt637 = local111;
							local17.anInt636 = local123;
							local17.aBoolean175 = false;
							this.aClass30_6.method343(local17);
							this.method284(local17);
							this.aBoolean92 = true;
							if (this.anInt262 < this.anInt255) {
								this.anInt262++;
							}
							this.aString2 = "Loading extra files - " + this.anInt262 * 100 / this.anInt255 + "%";
							this.anInt260++;
							if (this.anInt260 == 10) {
								return;
							}
						}
					}
				}
				this.anInt258--;
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("23602, " + false + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(IIII)I")
	public int method297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(15) int local15 = (arg2 << 8) + arg0;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray75.length; local17++) {
				if (this.anIntArray75[local17] == local15) {
					if (arg1 == 0) {
						return this.anIntArray79[local17];
					}
					return this.anIntArray78[local17];
				}
			}
			return -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("31824, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "()Lclient!WNUCRRKP;")
	public Class4_Sub1_Sub4 method298() {
		@Pc(4) Class30 local4 = this.aClass30_8;
		@Pc(11) Class4_Sub1_Sub4 local11;
		synchronized (this.aClass30_8) {
			local11 = (Class4_Sub1_Sub4) this.aClass30_8.method345();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class1 local24 = this.aClass1_2;
		synchronized (this.aClass1_2) {
			local11.method573();
		}
		if (local11.aByteArray20 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray20));
			while (true) {
				if (local41 == this.aByteArray5.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray5, local41, this.aByteArray5.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray20 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray20[local93] = this.aByteArray5[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(Lclient!AKPFVPPG;Lclient!client;)V")
	public void method299(@OriginalArg(0) Class2 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method7(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class4_Sub1_Sub3 local42 = new Class4_Sub1_Sub3(local31, (byte) 3);
			this.anIntArrayArray7[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray7[local22][local56] = local42.method104();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method7(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class4_Sub1_Sub3 local115 = new Class4_Sub1_Sub3(local104, (byte) 3);
			this.anIntArrayArray6[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray6[local36][local123] = local115.method107();
			}
		}
		local104 = arg0.method7("model_index", null);
		local56 = this.anIntArrayArray7[0].length;
		this.aByteArray6 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray6[local158] = local104[local158];
			} else {
				this.aByteArray6[local158] = 0;
			}
		}
		local104 = arg0.method7("map_index", null);
		@Pc(193) Class4_Sub1_Sub3 local193 = new Class4_Sub1_Sub3(local104, (byte) 3);
		local56 = local104.length / 7;
		this.anIntArray75 = new int[local56];
		this.anIntArray79 = new int[local56];
		this.anIntArray78 = new int[local56];
		this.anIntArray77 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray75[local216] = local193.method104();
			this.anIntArray79[local216] = local193.method104();
			this.anIntArray78[local216] = local193.method104();
			this.anIntArray77[local216] = local193.method102();
		}
		local104 = arg0.method7("anim_index", null);
		local193 = new Class4_Sub1_Sub3(local104, (byte) 3);
		local56 = local104.length / 2;
		this.anIntArray80 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray80[local268] = local193.method104();
		}
		local104 = arg0.method7("midi_index", null);
		local193 = new Class4_Sub1_Sub3(local104, (byte) 3);
		local56 = local104.length;
		this.anIntArray76 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray76[local300] = local193.method102();
		}
		this.aClient3 = arg1;
		this.aBoolean93 = true;
		this.aClient3.method588(this, 2);
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(ZI)I")
	public int method300(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray6[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("15727, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "(Z)V")
	private void method301() {
		try {
			try {
				@Pc(8) int local8 = this.anInputStream1.available();
				@Pc(43) int local43;
				@Pc(59) int local59;
				if (this.anInt254 == 0 && local8 >= 6) {
					this.aBoolean92 = true;
					for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream1.read(this.aByteArray7, local19, 6 - local19)) {
					}
					local43 = this.aByteArray7[0] & 0xFF;
					local59 = ((this.aByteArray7[1] & 0xFF) << 8) + (this.aByteArray7[2] & 0xFF);
					@Pc(75) int local75 = ((this.aByteArray7[3] & 0xFF) << 8) + (this.aByteArray7[4] & 0xFF);
					@Pc(82) int local82 = this.aByteArray7[5] & 0xFF;
					this.aClass4_Sub1_Sub4_1 = null;
					for (@Pc(90) Class4_Sub1_Sub4 local90 = (Class4_Sub1_Sub4) this.aClass30_6.method346(); local90 != null; local90 = (Class4_Sub1_Sub4) this.aClass30_6.method348()) {
						if (local90.anInt637 == local43 && local90.anInt636 == local59) {
							this.aClass4_Sub1_Sub4_1 = local90;
						}
						if (this.aClass4_Sub1_Sub4_1 != null) {
							local90.anInt638 = 0;
						}
					}
					if (this.aClass4_Sub1_Sub4_1 != null) {
						this.anInt261 = 0;
						if (local75 == 0) {
							signlink.reporterror("Rej: " + local43 + "," + local59);
							this.aClass4_Sub1_Sub4_1.aByteArray20 = null;
							if (this.aClass4_Sub1_Sub4_1.aBoolean175) {
								@Pc(148) Class30 local148 = this.aClass30_8;
								synchronized (this.aClass30_8) {
									this.aClass30_8.method343(this.aClass4_Sub1_Sub4_1);
								}
							} else {
								this.aClass4_Sub1_Sub4_1.method572();
							}
							this.aClass4_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass4_Sub1_Sub4_1.aByteArray20 == null && local82 == 0) {
								this.aClass4_Sub1_Sub4_1.aByteArray20 = new byte[local75];
							}
							if (this.aClass4_Sub1_Sub4_1.aByteArray20 == null && local82 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt253 = local82 * 500;
					this.anInt254 = 500;
					if (this.anInt254 > local75 - local82 * 500) {
						this.anInt254 = local75 - local82 * 500;
					}
				}
				if (this.anInt254 > 0 && local8 >= this.anInt254) {
					this.aBoolean92 = true;
					@Pc(227) byte[] local227 = this.aByteArray7;
					local43 = 0;
					if (this.aClass4_Sub1_Sub4_1 != null) {
						local227 = this.aClass4_Sub1_Sub4_1.aByteArray20;
						local43 = this.anInt253;
					}
					for (local59 = 0; local59 < this.anInt254; local59 += this.anInputStream1.read(local227, local59 + local43, this.anInt254 - local59)) {
					}
					if (this.anInt254 + this.anInt253 >= local227.length && this.aClass4_Sub1_Sub4_1 != null) {
						if (this.aClient3.aClass3Array1[0] != null) {
							this.aClient3.aClass3Array1[this.aClass4_Sub1_Sub4_1.anInt637 + 1].method9(local227, local227.length, this.aClass4_Sub1_Sub4_1.anInt636);
						}
						if (!this.aClass4_Sub1_Sub4_1.aBoolean175 && this.aClass4_Sub1_Sub4_1.anInt637 == 3) {
							this.aClass4_Sub1_Sub4_1.aBoolean175 = true;
							this.aClass4_Sub1_Sub4_1.anInt637 = 93;
						}
						if (this.aClass4_Sub1_Sub4_1.aBoolean175) {
							@Pc(320) Class30 local320 = this.aClass30_8;
							synchronized (this.aClass30_8) {
								this.aClass30_8.method343(this.aClass4_Sub1_Sub4_1);
							}
						} else {
							this.aClass4_Sub1_Sub4_1.method572();
						}
					}
					this.anInt254 = 0;
				}
			} catch (@Pc(341) IOException local341) {
				try {
					this.aSocket1.close();
				} catch (@Pc(346) Exception local346) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt254 = 0;
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("44174, " + false + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(I)V")
	@Override
	public void method282(@OriginalArg(0) int arg0) {
		this.method292(0, arg0);
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "c", descriptor = "()I")
	public int method302() {
		@Pc(2) Class1 local2 = this.aClass1_2;
		synchronized (this.aClass1_2) {
			return this.aClass1_2.method5();
		}
	}

	@OriginalMember(owner = "client!LVBGZMMP", name = "d", descriptor = "(I)V")
	private void method303() {
		try {
			@Pc(6) Class30 local6 = this.aClass30_4;
			@Pc(13) Class4_Sub1_Sub4 local13;
			synchronized (this.aClass30_4) {
				local13 = (Class4_Sub1_Sub4) this.aClass30_4.method345();
			}
			while (local13 != null) {
				this.aBoolean92 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient3.aClass3Array1[0] != null) {
					local24 = this.aClient3.aClass3Array1[local13.anInt637 + 1].method8(local13.anInt636);
				}
				if (!this.method288(local24, this.anIntArrayArray7[local13.anInt637][local13.anInt636], this.anIntArrayArray6[local13.anInt637][local13.anInt636])) {
					local24 = null;
				}
				@Pc(69) Class30 local69 = this.aClass30_4;
				synchronized (this.aClass30_4) {
					if (local24 == null) {
						this.aClass30_7.method343(local13);
					} else {
						local13.aByteArray20 = local24;
						@Pc(85) Class30 local85 = this.aClass30_8;
						synchronized (this.aClass30_8) {
							this.aClass30_8.method343(local13);
						}
					}
					local13 = (Class4_Sub1_Sub4) this.aClass30_4.method345();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("5802, " + -41529 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}
}
