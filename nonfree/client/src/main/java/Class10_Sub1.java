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

@OriginalClass("client!VNVHYJAS")
public final class Class10_Sub1 extends Class10 implements Runnable {

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!VNVHYJAS", name = "b", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!VNVHYJAS", name = "e", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!VNVHYJAS", name = "h", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!VNVHYJAS", name = "i", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!VNVHYJAS", name = "j", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!VNVHYJAS", name = "m", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!VNVHYJAS", name = "p", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!VNVHYJAS", name = "s", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!VNVHYJAS", name = "t", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!VNVHYJAS", name = "u", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!VNVHYJAS", name = "w", descriptor = "Lclient!ZRGWPKYE;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!VNVHYJAS", name = "x", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!VNVHYJAS", name = "y", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!VNVHYJAS", name = "z", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!VNVHYJAS", name = "B", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!VNVHYJAS", name = "F", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!VNVHYJAS", name = "G", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!VNVHYJAS", name = "H", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!VNVHYJAS", name = "J", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!VNVHYJAS", name = "L", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!VNVHYJAS", name = "N", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!VNVHYJAS", name = "O", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!VNVHYJAS", name = "R", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!VNVHYJAS", name = "S", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!VNVHYJAS", name = "c", descriptor = "I")
	private int anInt640 = 12536;

	@OriginalMember(owner = "client!VNVHYJAS", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray17 = new int[4][];

	@OriginalMember(owner = "client!VNVHYJAS", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray18 = new int[4][];

	@OriginalMember(owner = "client!VNVHYJAS", name = "g", descriptor = "I")
	private int anInt641 = -867;

	@OriginalMember(owner = "client!VNVHYJAS", name = "k", descriptor = "[B")
	private byte[] aByteArray15 = new byte[65000];

	@OriginalMember(owner = "client!VNVHYJAS", name = "l", descriptor = "Z")
	private boolean aBoolean157 = true;

	@OriginalMember(owner = "client!VNVHYJAS", name = "n", descriptor = "[B")
	private byte[] aByteArray16 = new byte[500];

	@OriginalMember(owner = "client!VNVHYJAS", name = "o", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_5 = new Class27((byte) 118);

	@OriginalMember(owner = "client!VNVHYJAS", name = "q", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_6 = new Class27((byte) 118);

	@OriginalMember(owner = "client!VNVHYJAS", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!VNVHYJAS", name = "v", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_7 = new Class27((byte) 118);

	@OriginalMember(owner = "client!VNVHYJAS", name = "A", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_8 = new Class27((byte) 118);

	@OriginalMember(owner = "client!VNVHYJAS", name = "C", descriptor = "I")
	private int anInt650 = 4559;

	@OriginalMember(owner = "client!VNVHYJAS", name = "D", descriptor = "Ljava/lang/String;")
	public String aString15 = "";

	@OriginalMember(owner = "client!VNVHYJAS", name = "E", descriptor = "Lclient!OCPYCLUF;")
	private Class27 aClass27_9 = new Class27((byte) 118);

	@OriginalMember(owner = "client!VNVHYJAS", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!VNVHYJAS", name = "K", descriptor = "Lclient!YGUBUIIU;")
	private Class46 aClass46_1 = new Class46(false);

	@OriginalMember(owner = "client!VNVHYJAS", name = "M", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!VNVHYJAS", name = "P", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!VNVHYJAS", name = "Q", descriptor = "I")
	private int anInt652 = 7;

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(II)Z")
	public boolean method446(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArray187[arg0] == 1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("85801, " + 2 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(Lclient!INOFEYKQ;Lclient!client;)V")
	public void method447(@OriginalArg(0) Class14 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method202(local20[local22], (byte[]) null);
			local36 = local31.length / 2;
			@Pc(42) Class3_Sub1_Sub3 local42 = new Class3_Sub1_Sub3((byte) -103, local31);
			this.anIntArrayArray18[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray18[local22][local56] = local42.method276();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method202(local93[local36], (byte[]) null);
			local56 = local104.length / 4;
			@Pc(115) Class3_Sub1_Sub3 local115 = new Class3_Sub1_Sub3((byte) -103, local104);
			this.anIntArrayArray17[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray17[local36][local123] = local115.method279();
			}
		}
		local104 = arg0.method202("model_index", (byte[]) null);
		local56 = this.anIntArrayArray18[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method202("map_index", (byte[]) null);
		@Pc(193) Class3_Sub1_Sub3 local193 = new Class3_Sub1_Sub3((byte) -103, local104);
		local56 = local104.length / 7;
		this.anIntArray189 = new int[local56];
		this.anIntArray190 = new int[local56];
		this.anIntArray191 = new int[local56];
		this.anIntArray188 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray189[local216] = local193.method276();
			this.anIntArray190[local216] = local193.method276();
			this.anIntArray191[local216] = local193.method276();
			this.anIntArray188[local216] = local193.method274();
		}
		local104 = arg0.method202("anim_index", (byte[]) null);
		local193 = new Class3_Sub1_Sub3((byte) -103, local104);
		local56 = local104.length / 2;
		this.anIntArray192 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray192[local268] = local193.method276();
		}
		local104 = arg0.method202("midi_index", (byte[]) null);
		local193 = new Class3_Sub1_Sub3((byte) -103, local104);
		local56 = local104.length;
		this.anIntArray187 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray187[local300] = local193.method274();
		}
		this.aClient5 = arg1;
		this.aBoolean157 = true;
		this.aClient5.method585(this, 2);
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(Z)I")
	public int method448() {
		try {
			return this.anIntArray192.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("72658, " + true + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(IZ)V")
	public void method449(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray189.length;
			for (@Pc(15) int local15 = 0; local15 < local3; local15++) {
				if (arg0 || this.anIntArray188[local15] != 0) {
					this.method454(3, this.anIntArray191[local15], (byte) 2);
					this.method454(3, this.anIntArray190[local15], (byte) 2);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("78110, " + -388 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(B)V")
	private void method450(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			while (this.anInt653 == 0) {
				if (this.anInt654 >= 10 || this.anInt651 == 0) {
					return;
				}
				@Pc(15) Class27 local15 = this.aClass27_6;
				@Pc(22) Class3_Sub1_Sub4 local22;
				synchronized (this.aClass27_6) {
					local22 = (Class3_Sub1_Sub4) this.aClass27_6.method326();
				}
				while (local22 != null) {
					if (this.aByteArrayArray4[local22.anInt771][local22.anInt773] != 0) {
						this.aByteArrayArray4[local22.anInt771][local22.anInt773] = 0;
						this.aClass27_9.method324(local22);
						this.method451(local22);
						this.aBoolean158 = true;
						if (this.anInt649 < this.anInt639) {
							this.anInt649++;
						}
						this.aString15 = "Loading extra files - " + this.anInt649 * 100 / this.anInt639 + "%";
						this.anInt654++;
						if (this.anInt654 == 10) {
							return;
						}
					}
					local15 = this.aClass27_6;
					synchronized (this.aClass27_6) {
						local22 = (Class3_Sub1_Sub4) this.aClass27_6.method326();
					}
				}
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					@Pc(123) byte[] local123 = this.aByteArrayArray4[local116];
					@Pc(126) int local126 = local123.length;
					for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
						if (local123[local128] == this.anInt651) {
							local123[local128] = 0;
							local22 = new Class3_Sub1_Sub4();
							local22.anInt771 = local116;
							local22.anInt773 = local128;
							local22.aBoolean189 = false;
							this.aClass27_9.method324(local22);
							this.method451(local22);
							this.aBoolean158 = true;
							if (this.anInt649 < this.anInt639) {
								this.anInt649++;
							}
							this.aString15 = "Loading extra files - " + this.anInt649 * 100 / this.anInt639 + "%";
							this.anInt654++;
							if (this.anInt654 == 10) {
								return;
							}
						}
					}
				}
				this.anInt651--;
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("96211, " + arg0 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(Lclient!ZRGWPKYE;B)V")
	private void method451(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(16) long local16 = System.currentTimeMillis();
					if (local16 - this.aLong20 < 4000L) {
						return;
					}
					this.aLong20 = local16;
					this.aSocket1 = this.aClient5.method713(client.anInt1032 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
						this.anInputStream1.read();
					}
					this.anInt643 = 0;
				}
				this.aByteArray16[0] = (byte) arg0.anInt771;
				this.aByteArray16[1] = (byte) (arg0.anInt773 >> 8);
				this.aByteArray16[2] = (byte) arg0.anInt773;
				if (arg0.aBoolean189) {
					this.aByteArray16[3] = 2;
				} else if (this.aClient5.aBoolean237) {
					this.aByteArray16[3] = 0;
				} else {
					this.aByteArray16[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray16, 0, 4);
				this.anInt648 = 0;
				this.anInt642 = -10000;
			} catch (@Pc(128) IOException local128) {
				try {
					this.aSocket1.close();
				} catch (@Pc(133) Exception local133) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt646 = 0;
				this.anInt642++;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("60081, " + arg0 + ", " + 123 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(IIII)I")
	public int method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray189.length; local7++) {
				if (this.anIntArray189[local7] == local5) {
					if (arg2 == 0) {
						return this.anIntArray190[local7];
					}
					return this.anIntArray191[local7];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("24682, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -632 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "b", descriptor = "(II)Z")
	public boolean method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray189.length; local1++) {
				if (this.anIntArray191[local1] == arg0) {
					return true;
				}
			}
			@Pc(21) int local21 = 13 / arg1;
			return false;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("38932, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean157) {
				this.anInt647++;
				@Pc(11) byte local11 = 20;
				if (this.anInt651 == 0 && this.aClient5.aClass44Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean158 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean158; local32++) {
					this.aBoolean158 = false;
					this.method463();
					this.method457();
					if (this.anInt653 == 0 && local32 >= 5) {
						break;
					}
					this.method450((byte) 4);
					if (this.anInputStream1 != null) {
						this.method466();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class3_Sub1_Sub4 local72;
				for (local72 = (Class3_Sub1_Sub4) this.aClass27_9.method327(); local72 != null; local72 = (Class3_Sub1_Sub4) this.aClass27_9.method329(this.anInt644)) {
					if (local72.aBoolean189) {
						local67 = true;
						local72.anInt772++;
						if (local72.anInt772 > 50) {
							local72.anInt772 = 0;
							this.method451(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class3_Sub1_Sub4) this.aClass27_9.method327(); local72 != null; local72 = (Class3_Sub1_Sub4) this.aClass27_9.method329(this.anInt644)) {
						local67 = true;
						local72.anInt772++;
						if (local72.anInt772 > 50) {
							local72.anInt772 = 0;
							this.method451(local72);
						}
					}
				}
				if (local67) {
					this.anInt643++;
					if (this.anInt643 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt646 = 0;
					}
				} else {
					this.anInt643 = 0;
					this.aString15 = "";
				}
				if (this.aClient5.aBoolean237 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt651 > 0 || this.aClient5.aClass44Array1[0] == null)) {
					this.anInt648++;
					if (this.anInt648 > 500) {
						this.anInt648 = 0;
						this.aByteArray16[0] = 0;
						this.aByteArray16[1] = 0;
						this.aByteArray16[2] = 0;
						this.aByteArray16[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray16, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt643 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(IIIB)V")
	public void method454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient5.aClass44Array1[0] != null && this.anIntArrayArray18[arg0][arg1] != 0) {
				@Pc(28) byte[] local28 = this.aClient5.aClass44Array1[arg0 + 1].method478(arg1);
				if (!this.method460(250, local28, this.anIntArrayArray18[arg0][arg1], this.anIntArrayArray17[arg0][arg1])) {
					this.aByteArrayArray4[arg0][arg1] = arg2;
					if (arg2 > this.anInt651) {
						this.anInt651 = arg2;
					}
					this.anInt639++;
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("65849, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(BII)V")
	public void method455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient5.aClass44Array1[0] != null && (this.anIntArrayArray18[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt651 != 0))) {
				@Pc(30) Class3_Sub1_Sub4 local30 = new Class3_Sub1_Sub4();
				local30.anInt771 = arg1;
				local30.anInt773 = arg0;
				local30.aBoolean189 = false;
				@Pc(46) Class27 local46 = this.aClass27_6;
				synchronized (this.aClass27_6) {
					this.aClass27_6.method324(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("79857, " + 28 + ", " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "c", descriptor = "(II)I")
	public int method456(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("28916, " + arg0 + ", " + 9 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "b", descriptor = "(I)V")
	private void method457() {
		try {
			this.anInt653 = 0;
			if (12536 != this.anInt640) {
				this.aBoolean159 = !this.aBoolean159;
			}
			this.anInt654 = 0;
			@Pc(24) Class3_Sub1_Sub4 local24;
			for (local24 = (Class3_Sub1_Sub4) this.aClass27_9.method327(); local24 != null; local24 = (Class3_Sub1_Sub4) this.aClass27_9.method329(this.anInt644)) {
				if (local24.aBoolean189) {
					this.anInt653++;
				} else {
					this.anInt654++;
				}
			}
			while (this.anInt653 < 10) {
				local24 = (Class3_Sub1_Sub4) this.aClass27_8.method326();
				if (local24 == null) {
					break;
				}
				if (this.aByteArrayArray4[local24.anInt771][local24.anInt773] != 0) {
					this.anInt649++;
				}
				this.aByteArrayArray4[local24.anInt771][local24.anInt773] = 0;
				this.aClass27_9.method324(local24);
				this.anInt653++;
				this.method451(local24);
				this.aBoolean158 = true;
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("9036, " + 12536 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "()Lclient!ZRGWPKYE;")
	public Class3_Sub1_Sub4 method458() {
		@Pc(4) Class27 local4 = this.aClass27_7;
		@Pc(11) Class3_Sub1_Sub4 local11;
		synchronized (this.aClass27_7) {
			local11 = (Class3_Sub1_Sub4) this.aClass27_7.method326();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class46 local24 = this.aClass46_1;
		synchronized (this.aClass46_1) {
			local11.method548();
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

	@OriginalMember(owner = "client!VNVHYJAS", name = "b", descriptor = "(Z)V")
	public void method459() {
		try {
			@Pc(2) Class27 local2 = this.aClass27_6;
			synchronized (this.aClass27_6) {
				this.aClass27_6.method331();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("72133, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(I[BII)Z")
	private boolean method460(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(42) int local42 = (int) this.aCRC32_1.getValue();
			@Pc(46) boolean local46 = false;
			if (local28 == arg2) {
				return local42 == arg3;
			} else {
				return false;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("54741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "b", descriptor = "()I")
	public int method461() {
		@Pc(2) Class46 local2 = this.aClass46_1;
		synchronized (this.aClass46_1) {
			return this.aClass46_1.method520();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "c", descriptor = "()V")
	public void method462() {
		this.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "c", descriptor = "(Z)V")
	private void method463() {
		try {
			@Pc(2) Class27 local2 = this.aClass27_5;
			@Pc(9) Class3_Sub1_Sub4 local9;
			synchronized (this.aClass27_5) {
				local9 = (Class3_Sub1_Sub4) this.aClass27_5.method326();
			}
			while (local9 != null) {
				this.aBoolean158 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient5.aClass44Array1[0] != null) {
					local23 = this.aClient5.aClass44Array1[local9.anInt771 + 1].method478(local9.anInt773);
				}
				if (!this.method460(250, local23, this.anIntArrayArray18[local9.anInt771][local9.anInt773], this.anIntArrayArray17[local9.anInt771][local9.anInt773])) {
					local23 = null;
				}
				@Pc(68) Class27 local68 = this.aClass27_5;
				synchronized (this.aClass27_5) {
					if (local23 == null) {
						this.aClass27_8.method324(local9);
					} else {
						local9.aByteArray20 = local23;
						@Pc(84) Class27 local84 = this.aClass27_7;
						synchronized (this.aClass27_7) {
							this.aClass27_7.method324(local9);
						}
					}
					local9 = (Class3_Sub1_Sub4) this.aClass27_5.method326();
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("10629, " + true + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "a", descriptor = "(I)V")
	@Override
	public void method445(@OriginalArg(0) int arg0) {
		this.method464(0, arg0);
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "d", descriptor = "(II)V")
	public void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray18.length || arg1 < 0 || arg1 > this.anIntArrayArray18[arg0].length || this.anIntArrayArray18[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class46 local27 = this.aClass46_1;
		synchronized (this.aClass46_1) {
			@Pc(34) Class3_Sub1_Sub4 local34;
			for (local34 = (Class3_Sub1_Sub4) this.aClass46_1.method518(); local34 != null; local34 = (Class3_Sub1_Sub4) this.aClass46_1.method519(this.anInt644)) {
				if (local34.anInt771 == arg0 && local34.anInt773 == arg1) {
					return;
				}
			}
			local34 = new Class3_Sub1_Sub4();
			local34.anInt771 = arg0;
			local34.anInt773 = arg1;
			local34.aBoolean189 = true;
			@Pc(72) Class27 local72 = this.aClass27_5;
			synchronized (this.aClass27_5) {
				this.aClass27_5.method324(local34);
			}
			this.aClass46_1.method516(local34);
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "e", descriptor = "(II)I")
	public int method465(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray18[arg0].length;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("41869, " + -559 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VNVHYJAS", name = "c", descriptor = "(I)V")
	private void method466() {
		try {
			@Pc(7) int local7;
			if (4559 != this.anInt650) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			try {
				local7 = this.anInputStream1.available();
				@Pc(51) int local51;
				@Pc(67) int local67;
				if (this.anInt646 == 0 && local7 >= 6) {
					this.aBoolean158 = true;
					for (@Pc(27) int local27 = 0; local27 < 6; local27 += this.anInputStream1.read(this.aByteArray16, local27, 6 - local27)) {
					}
					local51 = this.aByteArray16[0] & 0xFF;
					local67 = ((this.aByteArray16[1] & 0xFF) << 8) + (this.aByteArray16[2] & 0xFF);
					@Pc(83) int local83 = ((this.aByteArray16[3] & 0xFF) << 8) + (this.aByteArray16[4] & 0xFF);
					@Pc(90) int local90 = this.aByteArray16[5] & 0xFF;
					this.aClass3_Sub1_Sub4_1 = null;
					for (@Pc(98) Class3_Sub1_Sub4 local98 = (Class3_Sub1_Sub4) this.aClass27_9.method327(); local98 != null; local98 = (Class3_Sub1_Sub4) this.aClass27_9.method329(this.anInt644)) {
						if (local98.anInt771 == local51 && local98.anInt773 == local67) {
							this.aClass3_Sub1_Sub4_1 = local98;
						}
						if (this.aClass3_Sub1_Sub4_1 != null) {
							local98.anInt772 = 0;
						}
					}
					if (this.aClass3_Sub1_Sub4_1 != null) {
						this.anInt643 = 0;
						if (local83 == 0) {
							signlink.reporterror("Rej: " + local51 + "," + local67);
							this.aClass3_Sub1_Sub4_1.aByteArray20 = null;
							if (this.aClass3_Sub1_Sub4_1.aBoolean189) {
								@Pc(157) Class27 local157 = this.aClass27_7;
								synchronized (this.aClass27_7) {
									this.aClass27_7.method324(this.aClass3_Sub1_Sub4_1);
								}
							} else {
								this.aClass3_Sub1_Sub4_1.method547();
							}
							this.aClass3_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass3_Sub1_Sub4_1.aByteArray20 == null && local90 == 0) {
								this.aClass3_Sub1_Sub4_1.aByteArray20 = new byte[local83];
							}
							if (this.aClass3_Sub1_Sub4_1.aByteArray20 == null && local90 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt645 = local90 * 500;
					this.anInt646 = 500;
					if (this.anInt646 > local83 - local90 * 500) {
						this.anInt646 = local83 - local90 * 500;
					}
				}
				if (this.anInt646 > 0 && local7 >= this.anInt646) {
					this.aBoolean158 = true;
					@Pc(236) byte[] local236 = this.aByteArray16;
					local51 = 0;
					if (this.aClass3_Sub1_Sub4_1 != null) {
						local236 = this.aClass3_Sub1_Sub4_1.aByteArray20;
						local51 = this.anInt645;
					}
					for (local67 = 0; local67 < this.anInt646; local67 += this.anInputStream1.read(local236, local67 + local51, this.anInt646 - local67)) {
					}
					if (this.anInt646 + this.anInt645 >= local236.length && this.aClass3_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass44Array1[0] != null) {
							this.aClient5.aClass44Array1[this.aClass3_Sub1_Sub4_1.anInt771 + 1].method479(local236.length, local236, this.aClass3_Sub1_Sub4_1.anInt773);
						}
						if (!this.aClass3_Sub1_Sub4_1.aBoolean189 && this.aClass3_Sub1_Sub4_1.anInt771 == 3) {
							this.aClass3_Sub1_Sub4_1.aBoolean189 = true;
							this.aClass3_Sub1_Sub4_1.anInt771 = 93;
						}
						if (this.aClass3_Sub1_Sub4_1.aBoolean189) {
							@Pc(329) Class27 local329 = this.aClass27_7;
							synchronized (this.aClass27_7) {
								this.aClass27_7.method324(this.aClass3_Sub1_Sub4_1);
							}
						} else {
							this.aClass3_Sub1_Sub4_1.method547();
						}
					}
					this.anInt646 = 0;
				}
			} catch (@Pc(350) IOException local350) {
				try {
					this.aSocket1.close();
				} catch (@Pc(355) Exception local355) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt646 = 0;
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("36198, " + 4559 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}
}
