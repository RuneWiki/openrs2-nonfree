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

@OriginalClass("client!SDLNXGIT")
public final class Class35_Sub1 extends Class35 implements Runnable {

	@OriginalMember(owner = "client!SDLNXGIT", name = "h", descriptor = "Z")
	private static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!SDLNXGIT", name = "f", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!SDLNXGIT", name = "g", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!SDLNXGIT", name = "i", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!SDLNXGIT", name = "j", descriptor = "Lclient!ZLBJQGSS;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!SDLNXGIT", name = "k", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!SDLNXGIT", name = "l", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!SDLNXGIT", name = "n", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!SDLNXGIT", name = "p", descriptor = "I")
	private int anInt680;

	@OriginalMember(owner = "client!SDLNXGIT", name = "q", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!SDLNXGIT", name = "r", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!SDLNXGIT", name = "u", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!SDLNXGIT", name = "v", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!SDLNXGIT", name = "w", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!SDLNXGIT", name = "x", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!SDLNXGIT", name = "z", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!SDLNXGIT", name = "A", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!SDLNXGIT", name = "C", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!SDLNXGIT", name = "H", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!SDLNXGIT", name = "K", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!SDLNXGIT", name = "N", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!SDLNXGIT", name = "P", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!SDLNXGIT", name = "Q", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!SDLNXGIT", name = "R", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!SDLNXGIT", name = "T", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray19 = new int[4][];

	@OriginalMember(owner = "client!SDLNXGIT", name = "b", descriptor = "Ljava/lang/String;")
	public String aString14 = "";

	@OriginalMember(owner = "client!SDLNXGIT", name = "c", descriptor = "Lclient!RKSMLTCN;")
	private Class37 aClass37_2 = new Class37(42993);

	@OriginalMember(owner = "client!SDLNXGIT", name = "d", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!SDLNXGIT", name = "e", descriptor = "[B")
	private byte[] aByteArray15 = new byte[65000];

	@OriginalMember(owner = "client!SDLNXGIT", name = "m", descriptor = "B")
	private byte aByte28 = -123;

	@OriginalMember(owner = "client!SDLNXGIT", name = "o", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_2 = new Class13(aBoolean132);

	@OriginalMember(owner = "client!SDLNXGIT", name = "s", descriptor = "B")
	private byte aByte29 = -27;

	@OriginalMember(owner = "client!SDLNXGIT", name = "t", descriptor = "Z")
	private boolean aBoolean133 = true;

	@OriginalMember(owner = "client!SDLNXGIT", name = "y", descriptor = "[B")
	private byte[] aByteArray16 = new byte[500];

	@OriginalMember(owner = "client!SDLNXGIT", name = "B", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_3 = new Class13(aBoolean132);

	@OriginalMember(owner = "client!SDLNXGIT", name = "D", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_4 = new Class13(aBoolean132);

	@OriginalMember(owner = "client!SDLNXGIT", name = "E", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!SDLNXGIT", name = "F", descriptor = "B")
	private byte aByte30 = -123;

	@OriginalMember(owner = "client!SDLNXGIT", name = "G", descriptor = "I")
	private int anInt686 = 7;

	@OriginalMember(owner = "client!SDLNXGIT", name = "I", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_5 = new Class13(aBoolean132);

	@OriginalMember(owner = "client!SDLNXGIT", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray20 = new int[4][];

	@OriginalMember(owner = "client!SDLNXGIT", name = "L", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!SDLNXGIT", name = "M", descriptor = "I")
	private int anInt689 = 631;

	@OriginalMember(owner = "client!SDLNXGIT", name = "O", descriptor = "B")
	private byte aByte31 = -54;

	@OriginalMember(owner = "client!SDLNXGIT", name = "S", descriptor = "Lclient!EWLVMFRK;")
	private Class13 aClass13_6 = new Class13(aBoolean132);

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(II)I")
	public int method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArrayArray19[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("80778, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "b", descriptor = "(II)V")
	public void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray19.length || arg1 < 0 || arg1 > this.anIntArrayArray19[arg0].length || this.anIntArrayArray19[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class37 local27 = this.aClass37_2;
		synchronized (this.aClass37_2) {
			@Pc(34) Class1_Sub1_Sub4 local34;
			for (local34 = (Class1_Sub1_Sub4) this.aClass37_2.method346(); local34 != null; local34 = (Class1_Sub1_Sub4) this.aClass37_2.method347((byte) 3)) {
				if (local34.anInt839 == arg0 && local34.anInt840 == arg1) {
					return;
				}
			}
			local34 = new Class1_Sub1_Sub4();
			local34.anInt839 = arg0;
			local34.anInt840 = arg1;
			local34.aBoolean185 = true;
			@Pc(71) Class13 local71 = this.aClass13_5;
			synchronized (this.aClass13_5) {
				this.aClass13_5.method108(local34);
			}
			this.aClass37_2.method344(local34);
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(B)V")
	private void method371() {
		try {
			while (this.anInt680 == 0) {
				if (this.anInt681 >= 10 || this.anInt679 == 0) {
					return;
				}
				@Pc(19) Class13 local19 = this.aClass13_2;
				@Pc(26) Class1_Sub1_Sub4 local26;
				synchronized (this.aClass13_2) {
					local26 = (Class1_Sub1_Sub4) this.aClass13_2.method110();
				}
				while (local26 != null) {
					if (this.aByteArrayArray2[local26.anInt839][local26.anInt840] != 0) {
						this.aByteArrayArray2[local26.anInt839][local26.anInt840] = 0;
						this.aClass13_3.method108(local26);
						this.method384(local26);
						this.aBoolean134 = true;
						if (this.anInt691 < this.anInt685) {
							this.anInt691++;
						}
						this.aString14 = "Loading extra files - " + this.anInt691 * 100 / this.anInt685 + "%";
						this.anInt681++;
						if (this.anInt681 == 10) {
							return;
						}
					}
					local19 = this.aClass13_2;
					synchronized (this.aClass13_2) {
						local26 = (Class1_Sub1_Sub4) this.aClass13_2.method110();
					}
				}
				for (@Pc(120) int local120 = 0; local120 < 4; local120++) {
					@Pc(127) byte[] local127 = this.aByteArrayArray2[local120];
					@Pc(130) int local130 = local127.length;
					for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
						if (local127[local132] == this.anInt679) {
							local127[local132] = 0;
							local26 = new Class1_Sub1_Sub4();
							local26.anInt839 = local120;
							local26.anInt840 = local132;
							local26.aBoolean185 = false;
							this.aClass13_3.method108(local26);
							this.method384(local26);
							this.aBoolean134 = true;
							if (this.anInt691 < this.anInt685) {
								this.anInt691++;
							}
							this.aString14 = "Loading extra files - " + this.anInt691 * 100 / this.anInt685 + "%";
							this.anInt681++;
							if (this.anInt681 == 10) {
								return;
							}
						}
					}
				}
				this.anInt679--;
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("26650, " + 65 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(ZZ)V")
	public void method372(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg0) {
				@Pc(6) int local6 = this.anIntArray170.length;
				for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
					if (arg1 || this.anIntArray171[local8] != 0) {
						this.method386(3, this.anIntArray175[local8], (byte) 2);
						this.method386(3, this.anIntArray173[local8], (byte) 2);
					}
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("18620, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "b", descriptor = "(I)I")
	public int method373() {
		try {
			return this.anIntArray172.length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("55428, " + 43313 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(ZII[B)Z")
	private boolean method374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null || arg2.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg2.length - 2;
			@Pc(28) int local28 = ((arg2[local12] & 0xFF) << 8) + (arg2[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg2, 0, local12);
			@Pc(48) int local48 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local48 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("22789, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(Z)V")
	private void method375() {
		try {
			@Pc(5) Class13 local5 = this.aClass13_5;
			@Pc(12) Class1_Sub1_Sub4 local12;
			synchronized (this.aClass13_5) {
				local12 = (Class1_Sub1_Sub4) this.aClass13_5.method110();
			}
			while (local12 != null) {
				this.aBoolean134 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient4.aClass33Array1[0] != null) {
					local23 = this.aClient4.aClass33Array1[local12.anInt839 + 1].method328(this.aByte29, local12.anInt840);
				}
				if (!this.method374(this.anIntArrayArray20[local12.anInt839][local12.anInt840], this.anIntArrayArray19[local12.anInt839][local12.anInt840], local23)) {
					local23 = null;
				}
				@Pc(69) Class13 local69 = this.aClass13_5;
				synchronized (this.aClass13_5) {
					if (local23 == null) {
						this.aClass13_6.method108(local12);
					} else {
						local12.aByteArray20 = local23;
						@Pc(85) Class13 local85 = this.aClass13_4;
						synchronized (this.aClass13_4) {
							this.aClass13_4.method108(local12);
						}
					}
					local12 = (Class1_Sub1_Sub4) this.aClass13_5.method110();
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("39346, " + true + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "b", descriptor = "(B)V")
	private void method376(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte30) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			this.anInt680 = 0;
			this.anInt681 = 0;
			@Pc(23) Class1_Sub1_Sub4 local23;
			for (local23 = (Class1_Sub1_Sub4) this.aClass13_3.method111(); local23 != null; local23 = (Class1_Sub1_Sub4) this.aClass13_3.method113()) {
				if (local23.aBoolean185) {
					this.anInt680++;
				} else {
					this.anInt681++;
				}
			}
			while (this.anInt680 < 10) {
				local23 = (Class1_Sub1_Sub4) this.aClass13_6.method110();
				if (local23 == null) {
					break;
				}
				if (this.aByteArrayArray2[local23.anInt839][local23.anInt840] != 0) {
					this.anInt691++;
				}
				this.aByteArrayArray2[local23.anInt839][local23.anInt840] = 0;
				this.aClass13_3.method108(local23);
				this.anInt680++;
				this.method384(local23);
				this.aBoolean134 = true;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("60462, " + arg0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "()Lclient!ZLBJQGSS;")
	public Class1_Sub1_Sub4 method377() {
		@Pc(4) Class13 local4 = this.aClass13_4;
		@Pc(11) Class1_Sub1_Sub4 local11;
		synchronized (this.aClass13_4) {
			local11 = (Class1_Sub1_Sub4) this.aClass13_4.method110();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class37 local24 = this.aClass37_2;
		synchronized (this.aClass37_2) {
			local11.method566();
		}
		if (local11.aByteArray20 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray20));
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
		local11.aByteArray20 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray20[local93] = this.aByteArray15[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(IIZI)I")
	public int method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = (arg1 << 8) + arg2;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray170.length; local18++) {
				if (this.anIntArray170[local18] == local7) {
					if (arg0 == 0) {
						return this.anIntArray173[local18];
					}
					return this.anIntArray175[local18];
				}
			}
			return -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("95388, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "c", descriptor = "(II)I")
	public int method379(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("92836, " + arg0 + ", " + 21251 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "b", descriptor = "()I")
	public int method380() {
		@Pc(2) Class37 local2 = this.aClass37_2;
		synchronized (this.aClass37_2) {
			return this.aClass37_2.method348();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(III)V")
	public void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient4.aClass33Array1[0] != null && (this.anIntArrayArray19[arg1][arg2] != 0 && (this.aByteArrayArray2[arg1][arg2] != 0 && this.anInt679 != 0))) {
				@Pc(30) Class1_Sub1_Sub4 local30 = new Class1_Sub1_Sub4();
				@Pc(34) int local34 = 58 / arg0;
				local30.anInt839 = arg1;
				local30.anInt840 = arg2;
				local30.aBoolean185 = false;
				@Pc(46) Class13 local46 = this.aClass13_2;
				synchronized (this.aClass13_2) {
					this.aClass13_2.method108(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("13284, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "c", descriptor = "()V")
	public void method382() {
		this.aBoolean133 = false;
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "d", descriptor = "(II)Z")
	public boolean method383(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray170.length; local1++) {
				if (this.anIntArray175[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("46039, " + arg0 + ", " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(Lclient!ZLBJQGSS;Z)V")
	private void method384(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong20 < 4000L) {
						return;
					}
					this.aLong20 = local9;
					this.aSocket2 = this.aClient4.method642(client.anInt969 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt687 = 0;
				}
				this.aByteArray16[0] = (byte) arg0.anInt839;
				this.aByteArray16[1] = (byte) (arg0.anInt840 >> 8);
				this.aByteArray16[2] = (byte) arg0.anInt840;
				if (arg0.aBoolean185) {
					this.aByteArray16[3] = 2;
				} else if (this.aClient4.aBoolean237) {
					this.aByteArray16[3] = 0;
				} else {
					this.aByteArray16[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray16, 0, 4);
				this.anInt684 = 0;
				this.anInt688 = -10000;
			} catch (@Pc(121) IOException local121) {
				try {
					this.aSocket2.close();
				} catch (@Pc(126) Exception local126) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt683 = 0;
				this.anInt688++;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("8176, " + arg0 + ", " + true + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(I)V")
	@Override
	public void method368(@OriginalArg(0) int arg0) {
		this.method370(0, arg0);
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "c", descriptor = "(B)V")
	public void method385() {
		try {
			if (this.aByte31 != -54) {
				this.anInt689 = 387;
			}
			@Pc(9) Class13 local9 = this.aClass13_2;
			synchronized (this.aClass13_2) {
				this.aClass13_2.method115();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("83477, " + -54 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(IIIB)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient4.aClass33Array1[0] != null && this.anIntArrayArray19[arg0][arg1] != 0) {
				@Pc(26) byte[] local26 = this.aClient4.aClass33Array1[arg0 + 1].method328(this.aByte29, arg1);
				if (!this.method374(this.anIntArrayArray20[arg0][arg1], this.anIntArrayArray19[arg0][arg1], local26)) {
					this.aByteArrayArray2[arg0][arg1] = arg2;
					if (arg2 > this.anInt679) {
						this.anInt679 = arg2;
					}
					this.anInt685++;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("82086, " + arg0 + ", " + -79 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean133) {
				this.anInt690++;
				@Pc(11) byte local11 = 20;
				if (this.anInt679 == 0 && this.aClient4.aClass33Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean134 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean134; local32++) {
					this.aBoolean134 = false;
					this.method375();
					this.method376(this.aByte28);
					if (this.anInt680 == 0 && local32 >= 5) {
						break;
					}
					this.method371();
					if (this.anInputStream2 != null) {
						this.method387(this.anInt686);
					}
				}
				@Pc(69) boolean local69 = false;
				@Pc(74) Class1_Sub1_Sub4 local74;
				for (local74 = (Class1_Sub1_Sub4) this.aClass13_3.method111(); local74 != null; local74 = (Class1_Sub1_Sub4) this.aClass13_3.method113()) {
					if (local74.aBoolean185) {
						local69 = true;
						local74.anInt838++;
						if (local74.anInt838 > 50) {
							local74.anInt838 = 0;
							this.method384(local74);
						}
					}
				}
				if (!local69) {
					for (local74 = (Class1_Sub1_Sub4) this.aClass13_3.method111(); local74 != null; local74 = (Class1_Sub1_Sub4) this.aClass13_3.method113()) {
						local69 = true;
						local74.anInt838++;
						if (local74.anInt838 > 50) {
							local74.anInt838 = 0;
							this.method384(local74);
						}
					}
				}
				if (local69) {
					this.anInt687++;
					if (this.anInt687 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt683 = 0;
					}
				} else {
					this.anInt687 = 0;
					this.aString14 = "";
				}
				if (this.aClient4.aBoolean237 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt679 > 0 || this.aClient4.aClass33Array1[0] == null)) {
					this.anInt684++;
					if (this.anInt684 > 500) {
						this.anInt684 = 0;
						this.aByteArray16[0] = 0;
						this.aByteArray16[1] = 0;
						this.aByteArray16[2] = 0;
						this.aByteArray16[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray16, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt687 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "c", descriptor = "(I)V")
	private void method387(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= this.anInt686 && arg0 <= this.anInt686) {
				try {
					@Pc(14) int local14 = this.anInputStream2.available();
					@Pc(49) int local49;
					@Pc(65) int local65;
					if (this.anInt683 == 0 && local14 >= 6) {
						this.aBoolean134 = true;
						for (@Pc(25) int local25 = 0; local25 < 6; local25 += this.anInputStream2.read(this.aByteArray16, local25, 6 - local25)) {
						}
						local49 = this.aByteArray16[0] & 0xFF;
						local65 = ((this.aByteArray16[1] & 0xFF) << 8) + (this.aByteArray16[2] & 0xFF);
						@Pc(81) int local81 = ((this.aByteArray16[3] & 0xFF) << 8) + (this.aByteArray16[4] & 0xFF);
						@Pc(88) int local88 = this.aByteArray16[5] & 0xFF;
						this.aClass1_Sub1_Sub4_1 = null;
						for (@Pc(96) Class1_Sub1_Sub4 local96 = (Class1_Sub1_Sub4) this.aClass13_3.method111(); local96 != null; local96 = (Class1_Sub1_Sub4) this.aClass13_3.method113()) {
							if (local96.anInt839 == local49 && local96.anInt840 == local65) {
								this.aClass1_Sub1_Sub4_1 = local96;
							}
							if (this.aClass1_Sub1_Sub4_1 != null) {
								local96.anInt838 = 0;
							}
						}
						if (this.aClass1_Sub1_Sub4_1 != null) {
							this.anInt687 = 0;
							if (local81 == 0) {
								signlink.reporterror("Rej: " + local49 + "," + local65);
								this.aClass1_Sub1_Sub4_1.aByteArray20 = null;
								if (this.aClass1_Sub1_Sub4_1.aBoolean185) {
									@Pc(154) Class13 local154 = this.aClass13_4;
									synchronized (this.aClass13_4) {
										this.aClass13_4.method108(this.aClass1_Sub1_Sub4_1);
									}
								} else {
									this.aClass1_Sub1_Sub4_1.method565();
								}
								this.aClass1_Sub1_Sub4_1 = null;
							} else {
								if (this.aClass1_Sub1_Sub4_1.aByteArray20 == null && local88 == 0) {
									this.aClass1_Sub1_Sub4_1.aByteArray20 = new byte[local81];
								}
								if (this.aClass1_Sub1_Sub4_1.aByteArray20 == null && local88 != 0) {
									throw new IOException("missing start of file");
								}
							}
						}
						this.anInt682 = local88 * 500;
						this.anInt683 = 500;
						if (this.anInt683 > local81 - local88 * 500) {
							this.anInt683 = local81 - local88 * 500;
						}
					}
					if (this.anInt683 > 0 && local14 >= this.anInt683) {
						this.aBoolean134 = true;
						@Pc(233) byte[] local233 = this.aByteArray16;
						local49 = 0;
						if (this.aClass1_Sub1_Sub4_1 != null) {
							local233 = this.aClass1_Sub1_Sub4_1.aByteArray20;
							local49 = this.anInt682;
						}
						for (local65 = 0; local65 < this.anInt683; local65 += this.anInputStream2.read(local233, local65 + local49, this.anInt683 - local65)) {
						}
						if (this.anInt683 + this.anInt682 >= local233.length && this.aClass1_Sub1_Sub4_1 != null) {
							if (this.aClient4.aClass33Array1[0] != null) {
								this.aClient4.aClass33Array1[this.aClass1_Sub1_Sub4_1.anInt839 + 1].method329(local233, local233.length, this.aClass1_Sub1_Sub4_1.anInt840);
							}
							if (!this.aClass1_Sub1_Sub4_1.aBoolean185 && this.aClass1_Sub1_Sub4_1.anInt839 == 3) {
								this.aClass1_Sub1_Sub4_1.aBoolean185 = true;
								this.aClass1_Sub1_Sub4_1.anInt839 = 93;
							}
							if (this.aClass1_Sub1_Sub4_1.aBoolean185) {
								@Pc(326) Class13 local326 = this.aClass13_4;
								synchronized (this.aClass13_4) {
									this.aClass13_4.method108(this.aClass1_Sub1_Sub4_1);
								}
							} else {
								this.aClass1_Sub1_Sub4_1.method565();
							}
						}
						this.anInt683 = 0;
					}
				} catch (@Pc(347) IOException local347) {
					try {
						this.aSocket2.close();
					} catch (@Pc(352) Exception local352) {
					}
					this.aSocket2 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt683 = 0;
				}
			}
		} catch (@Pc(366) RuntimeException local366) {
			signlink.reporterror("49768, " + arg0 + ", " + local366.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "a", descriptor = "(Lclient!QKFGLETG;Lclient!client;)V")
	public void method388(@OriginalArg(0) Class36 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method337(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class1_Sub1_Sub3 local42 = new Class1_Sub1_Sub3((byte) 9, local31);
			this.anIntArrayArray19[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray19[local22][local56] = local42.method500();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method337(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class1_Sub1_Sub3 local115 = new Class1_Sub1_Sub3((byte) 9, local104);
			this.anIntArrayArray20[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray20[local36][local123] = local115.method503();
			}
		}
		local104 = arg0.method337("model_index", null);
		local56 = this.anIntArrayArray19[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method337("map_index", null);
		@Pc(193) Class1_Sub1_Sub3 local193 = new Class1_Sub1_Sub3((byte) 9, local104);
		local56 = local104.length / 7;
		this.anIntArray170 = new int[local56];
		this.anIntArray173 = new int[local56];
		this.anIntArray175 = new int[local56];
		this.anIntArray171 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray170[local216] = local193.method500();
			this.anIntArray173[local216] = local193.method500();
			this.anIntArray175[local216] = local193.method500();
			this.anIntArray171[local216] = local193.method498();
		}
		local104 = arg0.method337("anim_index", null);
		local193 = new Class1_Sub1_Sub3((byte) 9, local104);
		local56 = local104.length / 2;
		this.anIntArray172 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray172[local268] = local193.method500();
		}
		local104 = arg0.method337("midi_index", null);
		local193 = new Class1_Sub1_Sub3((byte) 9, local104);
		local56 = local104.length;
		this.anIntArray174 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray174[local300] = local193.method498();
		}
		this.aClient4 = arg1;
		this.aBoolean133 = true;
		this.aClient4.method578(this, 2);
	}

	@OriginalMember(owner = "client!SDLNXGIT", name = "e", descriptor = "(II)Z")
	public boolean method389(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray174[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("61593, " + -86 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
