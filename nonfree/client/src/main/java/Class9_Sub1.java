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

@OriginalClass("client!ELICEBAH")
public final class Class9_Sub1 extends Class9 implements Runnable {

	@OriginalMember(owner = "client!ELICEBAH", name = "b", descriptor = "I")
	public int anInt83;

	@OriginalMember(owner = "client!ELICEBAH", name = "c", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!ELICEBAH", name = "d", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!ELICEBAH", name = "e", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!ELICEBAH", name = "f", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!ELICEBAH", name = "g", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!ELICEBAH", name = "l", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!ELICEBAH", name = "r", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!ELICEBAH", name = "t", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!ELICEBAH", name = "v", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!ELICEBAH", name = "w", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!ELICEBAH", name = "A", descriptor = "Lclient!VVUONHHF;")
	private Class6_Sub2_Sub4 aClass6_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ELICEBAH", name = "B", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!ELICEBAH", name = "C", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ELICEBAH", name = "D", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ELICEBAH", name = "E", descriptor = "I")
	private int anInt91;

	@OriginalMember(owner = "client!ELICEBAH", name = "F", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!ELICEBAH", name = "G", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!ELICEBAH", name = "H", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ELICEBAH", name = "J", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!ELICEBAH", name = "K", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!ELICEBAH", name = "M", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!ELICEBAH", name = "O", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!ELICEBAH", name = "P", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!ELICEBAH", name = "R", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ELICEBAH", name = "h", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ELICEBAH", name = "i", descriptor = "I")
	private int anInt86 = -652;

	@OriginalMember(owner = "client!ELICEBAH", name = "j", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!ELICEBAH", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!ELICEBAH", name = "m", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_1 = new Class39(41824);

	@OriginalMember(owner = "client!ELICEBAH", name = "n", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_2 = new Class39(41824);

	@OriginalMember(owner = "client!ELICEBAH", name = "o", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ELICEBAH", name = "p", descriptor = "Ljava/lang/String;")
	public String aString3 = "";

	@OriginalMember(owner = "client!ELICEBAH", name = "q", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ELICEBAH", name = "s", descriptor = "Lclient!ODYOEFFK;")
	private Class26 aClass26_1 = new Class26(889);

	@OriginalMember(owner = "client!ELICEBAH", name = "u", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_3 = new Class39(41824);

	@OriginalMember(owner = "client!ELICEBAH", name = "x", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ELICEBAH", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[4][];

	@OriginalMember(owner = "client!ELICEBAH", name = "z", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_4 = new Class39(41824);

	@OriginalMember(owner = "client!ELICEBAH", name = "I", descriptor = "Lclient!URASIGRB;")
	private Class39 aClass39_5 = new Class39(41824);

	@OriginalMember(owner = "client!ELICEBAH", name = "L", descriptor = "[B")
	private byte[] aByteArray3 = new byte[500];

	@OriginalMember(owner = "client!ELICEBAH", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[4][];

	@OriginalMember(owner = "client!ELICEBAH", name = "Q", descriptor = "[B")
	private byte[] aByteArray5 = new byte[65000];

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(II)V")
	public void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray4.length || arg1 < 0 || arg1 > this.anIntArrayArray4[arg0].length || this.anIntArrayArray4[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class26 local27 = this.aClass26_1;
		synchronized (this.aClass26_1) {
			@Pc(34) Class6_Sub2_Sub4 local34;
			for (local34 = (Class6_Sub2_Sub4) this.aClass26_1.method353(); local34 != null; local34 = (Class6_Sub2_Sub4) this.aClass26_1.method354()) {
				if (local34.anInt705 == arg0 && local34.anInt706 == arg1) {
					return;
				}
			}
			local34 = new Class6_Sub2_Sub4();
			local34.anInt705 = arg0;
			local34.anInt706 = arg1;
			local34.aBoolean184 = true;
			@Pc(71) Class39 local71 = this.aClass39_2;
			synchronized (this.aClass39_2) {
				this.aClass39_2.method456(local34);
			}
			this.aClass26_1.method351(local34);
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(B)V")
	public void method55() {
		try {
			@Pc(2) Class39 local2 = this.aClass39_1;
			synchronized (this.aClass39_1) {
				this.aClass39_1.method463();
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("91199, " + 6 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(ZI)Z")
	public boolean method56(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				this.aBoolean35 = !this.aBoolean35;
			}
			return this.anIntArray32[arg1] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("17294, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean33) {
				this.anInt83++;
				@Pc(11) byte local11 = 20;
				if (this.anInt93 == 0 && this.aClient2.aClass21Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean34 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean34; local32++) {
					this.aBoolean34 = false;
					this.method60();
					this.method74();
					if (this.anInt91 == 0 && local32 >= 5) {
						break;
					}
					this.method62();
					if (this.anInputStream2 != null) {
						this.method63();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class6_Sub2_Sub4 local72;
				for (local72 = (Class6_Sub2_Sub4) this.aClass39_3.method459(); local72 != null; local72 = (Class6_Sub2_Sub4) this.aClass39_3.method461()) {
					if (local72.aBoolean184) {
						local67 = true;
						local72.anInt707++;
						if (local72.anInt707 > 50) {
							local72.anInt707 = 0;
							this.method59(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class6_Sub2_Sub4) this.aClass39_3.method459(); local72 != null; local72 = (Class6_Sub2_Sub4) this.aClass39_3.method461()) {
						local67 = true;
						local72.anInt707++;
						if (local72.anInt707 > 50) {
							local72.anInt707 = 0;
							this.method59(local72);
						}
					}
				}
				if (local67) {
					this.anInt94++;
					if (this.anInt94 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt89 = 0;
					}
				} else {
					this.anInt94 = 0;
					this.aString3 = "";
				}
				if (this.aClient2.aBoolean226 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt93 > 0 || this.aClient2.aClass21Array1[0] == null)) {
					this.anInt95++;
					if (this.anInt95 > 500) {
						this.anInt95 = 0;
						this.aByteArray3[0] = 0;
						this.aByteArray3[1] = 0;
						this.aByteArray3[2] = 0;
						this.aByteArray3[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray3, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt94 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "b", descriptor = "(ZI)Z")
	public boolean method57(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray29.length; local3++) {
				if (this.anIntArray27[local3] == arg1) {
					return true;
				}
			}
			if (arg0) {
				for (@Pc(23) int local23 = 1; local23 > 0; local23++) {
				}
			}
			return false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("37198, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "()V")
	public void method58() {
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(ILclient!VVUONHHF;)V")
	private void method59(@OriginalArg(1) Class6_Sub2_Sub4 arg0) {
		try {
			try {
				if (this.aSocket2 == null) {
					@Pc(9) long local9 = System.currentTimeMillis();
					if (local9 - this.aLong5 < 4000L) {
						return;
					}
					this.aLong5 = local9;
					this.aSocket2 = this.aClient2.method643(client.anInt866 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
						this.anInputStream2.read();
					}
					this.anInt94 = 0;
				}
				this.aByteArray3[0] = (byte) arg0.anInt705;
				this.aByteArray3[1] = (byte) (arg0.anInt706 >> 8);
				this.aByteArray3[2] = (byte) arg0.anInt706;
				if (arg0.aBoolean184) {
					this.aByteArray3[3] = 2;
				} else if (this.aClient2.aBoolean226) {
					this.aByteArray3[3] = 0;
				} else {
					this.aByteArray3[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray3, 0, 4);
				this.anInt95 = 0;
				this.anInt90 = -10000;
			} catch (@Pc(121) IOException local121) {
				try {
					this.aSocket2.close();
				} catch (@Pc(126) Exception local126) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt89 = 0;
				this.anInt90++;
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("75248, " + -207 + ", " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "b", descriptor = "(B)V")
	private void method60() {
		try {
			@Pc(4) Class39 local4 = this.aClass39_2;
			@Pc(11) Class6_Sub2_Sub4 local11;
			synchronized (this.aClass39_2) {
				local11 = (Class6_Sub2_Sub4) this.aClass39_2.method458();
			}
			while (local11 != null) {
				this.aBoolean34 = true;
				@Pc(30) byte[] local30 = null;
				if (this.aClient2.aClass21Array1[0] != null) {
					local30 = this.aClient2.aClass21Array1[local11.anInt705 + 1].method287(local11.anInt706);
				}
				if (!this.method72(this.aBoolean32, this.anIntArrayArray4[local11.anInt705][local11.anInt706], this.anIntArrayArray5[local11.anInt705][local11.anInt706], local30)) {
					local30 = null;
				}
				@Pc(76) Class39 local76 = this.aClass39_2;
				synchronized (this.aClass39_2) {
					if (local30 == null) {
						this.aClass39_4.method456(local11);
					} else {
						local11.aByteArray18 = local30;
						@Pc(92) Class39 local92 = this.aClass39_5;
						synchronized (this.aClass39_5) {
							this.aClass39_5.method456(local11);
						}
					}
					local11 = (Class6_Sub2_Sub4) this.aClass39_2.method458();
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("49321, " + 98 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "c", descriptor = "(ZI)I")
	public int method61(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray4[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("2531, " + false + ", " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "b", descriptor = "(I)V")
	private void method62() {
		try {
			while (this.anInt91 == 0) {
				if (this.anInt92 >= 10 || this.anInt93 == 0) {
					return;
				}
				@Pc(18) Class39 local18 = this.aClass39_1;
				@Pc(25) Class6_Sub2_Sub4 local25;
				synchronized (this.aClass39_1) {
					local25 = (Class6_Sub2_Sub4) this.aClass39_1.method458();
				}
				while (local25 != null) {
					if (this.aByteArrayArray1[local25.anInt705][local25.anInt706] != 0) {
						this.aByteArrayArray1[local25.anInt705][local25.anInt706] = 0;
						this.aClass39_3.method456(local25);
						this.method59(local25);
						this.aBoolean34 = true;
						if (this.anInt87 < this.anInt84) {
							this.anInt87++;
						}
						this.aString3 = "Loading extra files - " + this.anInt87 * 100 / this.anInt84 + "%";
						this.anInt92++;
						if (this.anInt92 == 10) {
							return;
						}
					}
					local18 = this.aClass39_1;
					synchronized (this.aClass39_1) {
						local25 = (Class6_Sub2_Sub4) this.aClass39_1.method458();
					}
				}
				for (@Pc(119) int local119 = 0; local119 < 4; local119++) {
					@Pc(126) byte[] local126 = this.aByteArrayArray1[local119];
					@Pc(129) int local129 = local126.length;
					for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
						if (local126[local131] == this.anInt93) {
							local126[local131] = 0;
							local25 = new Class6_Sub2_Sub4();
							local25.anInt705 = local119;
							local25.anInt706 = local131;
							local25.aBoolean184 = false;
							this.aClass39_3.method456(local25);
							this.method59(local25);
							this.aBoolean34 = true;
							if (this.anInt87 < this.anInt84) {
								this.anInt87++;
							}
							this.aString3 = "Loading extra files - " + this.anInt87 * 100 / this.anInt84 + "%";
							this.anInt92++;
							if (this.anInt92 == 10) {
								return;
							}
						}
					}
				}
				this.anInt93--;
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("52246, " + -45 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "c", descriptor = "(I)V")
	private void method63() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt89 == 0 && local10 >= 6) {
					this.aBoolean34 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray3, local21, 6 - local21)) {
					}
					local45 = this.aByteArray3[0] & 0xFF;
					local61 = ((this.aByteArray3[1] & 0xFF) << 8) + (this.aByteArray3[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray3[3] & 0xFF) << 8) + (this.aByteArray3[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray3[5] & 0xFF;
					this.aClass6_Sub2_Sub4_1 = null;
					for (@Pc(92) Class6_Sub2_Sub4 local92 = (Class6_Sub2_Sub4) this.aClass39_3.method459(); local92 != null; local92 = (Class6_Sub2_Sub4) this.aClass39_3.method461()) {
						if (local92.anInt705 == local45 && local92.anInt706 == local61) {
							this.aClass6_Sub2_Sub4_1 = local92;
						}
						if (this.aClass6_Sub2_Sub4_1 != null) {
							local92.anInt707 = 0;
						}
					}
					if (this.aClass6_Sub2_Sub4_1 != null) {
						this.anInt94 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass6_Sub2_Sub4_1.aByteArray18 = null;
							if (this.aClass6_Sub2_Sub4_1.aBoolean184) {
								@Pc(150) Class39 local150 = this.aClass39_5;
								synchronized (this.aClass39_5) {
									this.aClass39_5.method456(this.aClass6_Sub2_Sub4_1);
								}
							} else {
								this.aClass6_Sub2_Sub4_1.method512();
							}
							this.aClass6_Sub2_Sub4_1 = null;
						} else {
							if (this.aClass6_Sub2_Sub4_1.aByteArray18 == null && local84 == 0) {
								this.aClass6_Sub2_Sub4_1.aByteArray18 = new byte[local77];
							}
							if (this.aClass6_Sub2_Sub4_1.aByteArray18 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt88 = local84 * 500;
					this.anInt89 = 500;
					if (this.anInt89 > local77 - local84 * 500) {
						this.anInt89 = local77 - local84 * 500;
					}
				}
				if (this.anInt89 > 0 && local10 >= this.anInt89) {
					this.aBoolean34 = true;
					@Pc(229) byte[] local229 = this.aByteArray3;
					local45 = 0;
					if (this.aClass6_Sub2_Sub4_1 != null) {
						local229 = this.aClass6_Sub2_Sub4_1.aByteArray18;
						local45 = this.anInt88;
					}
					for (local61 = 0; local61 < this.anInt89; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt89 - local61)) {
					}
					if (this.anInt89 + this.anInt88 >= local229.length && this.aClass6_Sub2_Sub4_1 != null) {
						if (this.aClient2.aClass21Array1[0] != null) {
							this.aClient2.aClass21Array1[this.aClass6_Sub2_Sub4_1.anInt705 + 1].method288(this.aClass6_Sub2_Sub4_1.anInt706, this.anInt85, local229.length, local229);
						}
						if (!this.aClass6_Sub2_Sub4_1.aBoolean184 && this.aClass6_Sub2_Sub4_1.anInt705 == 3) {
							this.aClass6_Sub2_Sub4_1.aBoolean184 = true;
							this.aClass6_Sub2_Sub4_1.anInt705 = 93;
						}
						if (this.aClass6_Sub2_Sub4_1.aBoolean184) {
							@Pc(323) Class39 local323 = this.aClass39_5;
							synchronized (this.aClass39_5) {
								this.aClass39_5.method456(this.aClass6_Sub2_Sub4_1);
							}
						} else {
							this.aClass6_Sub2_Sub4_1.method512();
						}
					}
					this.anInt89 = 0;
				}
			} catch (@Pc(344) IOException local344) {
				try {
					this.aSocket2.close();
				} catch (@Pc(349) Exception local349) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt89 = 0;
			}
		} catch (@Pc(363) RuntimeException local363) {
			signlink.reporterror("28755, " + -668 + ", " + local363.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(Z)I")
	public int method64() {
		try {
			return this.anIntArray31.length;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("22869, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(III)V")
	public void method65(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient2.aClass21Array1[0] != null && (this.anIntArrayArray4[arg1][arg0] != 0 && (this.aByteArrayArray1[arg1][arg0] != 0 && this.anInt93 != 0))) {
				@Pc(30) Class6_Sub2_Sub4 local30 = new Class6_Sub2_Sub4();
				local30.anInt705 = arg1;
				local30.anInt706 = arg0;
				local30.aBoolean184 = false;
				@Pc(42) Class39 local42 = this.aClass39_1;
				synchronized (this.aClass39_1) {
					this.aClass39_1.method456(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("18582, " + -901 + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(Lclient!RVLWVPJQ;Lclient!client;)V")
	public void method66(@OriginalArg(0) Class36 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method381(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class6_Sub2_Sub3 local42 = new Class6_Sub2_Sub3(741, local31);
			this.anIntArrayArray4[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray4[local22][local56] = local42.method404();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method381(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class6_Sub2_Sub3 local115 = new Class6_Sub2_Sub3(741, local104);
			this.anIntArrayArray5[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray5[local36][local123] = local115.method407();
			}
		}
		local104 = arg0.method381("model_index", null);
		local56 = this.anIntArrayArray4[0].length;
		this.aByteArray4 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray4[local158] = local104[local158];
			} else {
				this.aByteArray4[local158] = 0;
			}
		}
		local104 = arg0.method381("map_index", null);
		@Pc(193) Class6_Sub2_Sub3 local193 = new Class6_Sub2_Sub3(741, local104);
		local56 = local104.length / 7;
		this.anIntArray29 = new int[local56];
		this.anIntArray30 = new int[local56];
		this.anIntArray27 = new int[local56];
		this.anIntArray28 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray29[local216] = local193.method404();
			this.anIntArray30[local216] = local193.method404();
			this.anIntArray27[local216] = local193.method404();
			this.anIntArray28[local216] = local193.method402();
		}
		local104 = arg0.method381("anim_index", null);
		local193 = new Class6_Sub2_Sub3(741, local104);
		local56 = local104.length / 2;
		this.anIntArray31 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray31[local268] = local193.method404();
		}
		local104 = arg0.method381("midi_index", null);
		local193 = new Class6_Sub2_Sub3(741, local104);
		local56 = local104.length;
		this.anIntArray32 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray32[local300] = local193.method402();
		}
		this.aClient2 = arg1;
		this.aBoolean33 = true;
		this.aClient2.method582(this, 2);
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "b", descriptor = "()Lclient!VVUONHHF;")
	public Class6_Sub2_Sub4 method67() {
		@Pc(4) Class39 local4 = this.aClass39_5;
		@Pc(11) Class6_Sub2_Sub4 local11;
		synchronized (this.aClass39_5) {
			local11 = (Class6_Sub2_Sub4) this.aClass39_5.method458();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class26 local24 = this.aClass26_1;
		synchronized (this.aClass26_1) {
			local11.method513();
		}
		if (local11.aByteArray18 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray18));
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
		local11.aByteArray18 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray18[local93] = this.aByteArray5[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(I)V")
	@Override
	public void method53(@OriginalArg(0) int arg0) {
		this.method54(0, arg0);
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(IIII)I")
	public int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg0;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray29.length; local17++) {
				if (this.anIntArray29[local17] == local5) {
					if (arg1 == 0) {
						return this.anIntArray30[local17];
					}
					return this.anIntArray27[local17];
				}
			}
			return -1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("67632, " + arg0 + ", " + arg1 + ", " + -306 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "b", descriptor = "(II)I")
	public int method69(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray4[arg0] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("69422, " + arg0 + ", " + -651 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(IIBI)V")
	public void method70(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass21Array1[0] != null && this.anIntArrayArray4[arg0][arg2] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass21Array1[arg0 + 1].method287(arg2);
				if (!this.method72(this.aBoolean32, this.anIntArrayArray4[arg0][arg2], this.anIntArrayArray5[arg0][arg2], local25)) {
					this.aByteArrayArray1[arg0][arg2] = arg1;
					if (arg1 > this.anInt93) {
						this.anInt93 = arg1;
					}
					this.anInt84++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("64822, " + -279 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(IZ)V")
	public void method71(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			while (arg0 >= 0) {
				this.aBoolean35 = !this.aBoolean35;
			}
			@Pc(17) int local17 = this.anIntArray29.length;
			for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
				if (arg1 || this.anIntArray28[local19] != 0) {
					this.method70(3, (byte) 2, this.anIntArray27[local19]);
					this.method70(3, (byte) 2, this.anIntArray30[local19]);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("44818, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "a", descriptor = "(ZII[B)Z")
	private boolean method72(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg3 == null || arg3.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg3.length - 2;
			@Pc(28) int local28 = ((arg3[local12] & 0xFF) << 8) + (arg3[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg3, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			if (arg0) {
				this.aBoolean31 = !this.aBoolean31;
			}
			if (local28 == arg1) {
				return local42 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("1697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "c", descriptor = "()I")
	public int method73() {
		@Pc(2) Class26 local2 = this.aClass26_1;
		synchronized (this.aClass26_1) {
			return this.aClass26_1.method355();
		}
	}

	@OriginalMember(owner = "client!ELICEBAH", name = "d", descriptor = "(I)V")
	private void method74() {
		try {
			this.anInt91 = 0;
			this.anInt92 = 0;
			@Pc(17) Class6_Sub2_Sub4 local17;
			for (local17 = (Class6_Sub2_Sub4) this.aClass39_3.method459(); local17 != null; local17 = (Class6_Sub2_Sub4) this.aClass39_3.method461()) {
				if (local17.aBoolean184) {
					this.anInt91++;
				} else {
					this.anInt92++;
				}
			}
			while (this.anInt91 < 10) {
				local17 = (Class6_Sub2_Sub4) this.aClass39_4.method458();
				if (local17 == null) {
					break;
				}
				if (this.aByteArrayArray1[local17.anInt705][local17.anInt706] != 0) {
					this.anInt87++;
				}
				this.aByteArrayArray1[local17.anInt705][local17.anInt706] = 0;
				this.aClass39_3.method456(local17);
				this.anInt91++;
				this.method59(local17);
				this.aBoolean34 = true;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("71563, " + -477 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}
}
