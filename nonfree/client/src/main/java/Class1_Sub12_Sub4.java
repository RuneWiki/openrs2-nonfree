import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class1_Sub12_Sub4 extends Class1_Sub12 {

	@OriginalMember(owner = "client!tca", name = "xb", descriptor = "Z")
	private boolean aBoolean504;

	@OriginalMember(owner = "client!tca", name = "yb", descriptor = "I")
	private int anInt7646;

	@OriginalMember(owner = "client!tca", name = "zb", descriptor = "I")
	private int anInt7647;

	@OriginalMember(owner = "client!tca", name = "Ab", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!tca", name = "Cb", descriptor = "J")
	private long aLong203;

	@OriginalMember(owner = "client!tca", name = "Db", descriptor = "I")
	private int anInt7648;

	@OriginalMember(owner = "client!tca", name = "Eb", descriptor = "Lclient!ps;")
	private Class1_Sub38 aClass1_Sub38_2;

	@OriginalMember(owner = "client!tca", name = "Fb", descriptor = "Z")
	private boolean aBoolean505;

	@OriginalMember(owner = "client!tca", name = "z", descriptor = "[[Lclient!fi;")
	private final Class1_Sub17[][] aClass1_Sub17ArrayArray2 = new Class1_Sub17[16][128];

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "[I")
	private final int[] anIntArray600 = new int[16];

	@OriginalMember(owner = "client!tca", name = "Q", descriptor = "[I")
	private final int[] anIntArray605 = new int[16];

	@OriginalMember(owner = "client!tca", name = "M", descriptor = "[I")
	public final int[] anIntArray604 = new int[16];

	@OriginalMember(owner = "client!tca", name = "R", descriptor = "[I")
	private final int[] anIntArray606 = new int[16];

	@OriginalMember(owner = "client!tca", name = "db", descriptor = "[I")
	private final int[] anIntArray611 = new int[16];

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "[I")
	public final int[] anIntArray601 = new int[16];

	@OriginalMember(owner = "client!tca", name = "cb", descriptor = "[I")
	private final int[] anIntArray610 = new int[16];

	@OriginalMember(owner = "client!tca", name = "W", descriptor = "I")
	private final int anInt7629 = 1000000;

	@OriginalMember(owner = "client!tca", name = "fb", descriptor = "[I")
	private final int[] anIntArray612 = new int[16];

	@OriginalMember(owner = "client!tca", name = "Y", descriptor = "[I")
	private final int[] anIntArray607 = new int[16];

	@OriginalMember(owner = "client!tca", name = "Z", descriptor = "[I")
	private final int[] anIntArray608 = new int[16];

	@OriginalMember(owner = "client!tca", name = "kb", descriptor = "[I")
	private final int[] anIntArray613 = new int[16];

	@OriginalMember(owner = "client!tca", name = "bb", descriptor = "[I")
	private final int[] anIntArray609 = new int[16];

	@OriginalMember(owner = "client!tca", name = "H", descriptor = "[I")
	public final int[] anIntArray602 = new int[16];

	@OriginalMember(owner = "client!tca", name = "qb", descriptor = "[I")
	private final int[] anIntArray615 = new int[16];

	@OriginalMember(owner = "client!tca", name = "ob", descriptor = "[I")
	private final int[] anIntArray614 = new int[16];

	@OriginalMember(owner = "client!tca", name = "r", descriptor = "[[Lclient!fi;")
	private final Class1_Sub17[][] aClass1_Sub17ArrayArray1 = new Class1_Sub17[16][128];

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "[I")
	private final int[] anIntArray603 = new int[16];

	@OriginalMember(owner = "client!tca", name = "wb", descriptor = "I")
	private int anInt7645 = 256;

	@OriginalMember(owner = "client!tca", name = "O", descriptor = "Lclient!rq;")
	private final Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!tca", name = "Bb", descriptor = "Lclient!io;")
	private final Class1_Sub12_Sub2 aClass1_Sub12_Sub2_1 = new Class1_Sub12_Sub2(this);

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "Lclient!lb;")
	private final Class174 aClass174_30 = new Class174(128);

	static {
		new Class114(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class1_Sub12_Sub4() {
		this.method6536();
		this.method6551(true);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)V")
	private void method6522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub17 local16 = this.aClass1_Sub17ArrayArray2[arg1][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass1_Sub17ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray602[arg1] & 0x2) == 0) {
			local16.anInt3197 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub17 local44 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1419(); local44 != null; local44 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1415()) {
			if (local16.anInt3193 == local44.anInt3193 && local44.anInt3197 < 0 && local16 != local44) {
				local16.anInt3197 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!fi;[III)Z")
	public boolean method6523(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub17 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg1.anInt3190 = Static77.anInt2079 / 100;
		if (arg1.anInt3197 >= 0 && (arg1.aClass1_Sub12_Sub1_4 == null || arg1.aClass1_Sub12_Sub1_4.method2329())) {
			arg1.method2901();
			arg1.method7983();
			if (arg1.anInt3189 > 0 && arg1 == this.aClass1_Sub17ArrayArray1[arg1.anInt3193][arg1.anInt3189]) {
				this.aClass1_Sub17ArrayArray1[arg1.anInt3193][arg1.anInt3189] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg1.anInt3196;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray609[arg1.anInt3193] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg1.anInt3196 = local59;
		}
		arg1.aClass1_Sub12_Sub1_4.method2339(this.method6538(arg1));
		@Pc(99) Class297 local99 = arg1.aClass297_1;
		@Pc(101) boolean local101 = false;
		arg1.anInt3192++;
		arg1.anInt3187 += local99.anInt8477;
		@Pc(132) double local132 = (double) ((arg1.anInt3194 * arg1.anInt3196 >> 12) + (arg1.anInt3184 - 60 << 8)) * 5.086263020833333E-6D;
		if (local99.anInt8473 > 0) {
			if (local99.anInt8478 <= 0) {
				arg1.anInt3186 += 128;
			} else {
				arg1.anInt3186 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt8478) * 128.0D + 0.5D);
			}
			if (local99.anInt8473 * arg1.anInt3186 >= 819200) {
				local101 = true;
			}
		}
		if (local99.aByteArray108 != null) {
			if (local99.anInt8475 > 0) {
				arg1.anInt3181 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt8475) * 128.0D + 0.5D);
			} else {
				arg1.anInt3181 += 128;
			}
			while (local99.aByteArray108.length - 2 > arg1.anInt3195 && (local99.aByteArray108[arg1.anInt3195 + 2] & 0xFF) << 8 < arg1.anInt3181) {
				arg1.anInt3195 += 2;
			}
			if (local99.aByteArray108.length - 2 == arg1.anInt3195 && local99.aByteArray108[arg1.anInt3195 + 1] == 0) {
				local101 = true;
			}
		}
		if (arg1.anInt3197 >= 0 && local99.aByteArray107 != null && (this.anIntArray602[arg1.anInt3193] & 0x1) == 0 && (arg1.anInt3189 < 0 || arg1 != this.aClass1_Sub17ArrayArray1[arg1.anInt3193][arg1.anInt3189])) {
			if (local99.anInt8472 > 0) {
				arg1.anInt3197 += (int) (Math.pow(2.0D, (double) local99.anInt8472 * local132) * 128.0D + 0.5D);
			} else {
				arg1.anInt3197 += 128;
			}
			while (arg1.anInt3201 < local99.aByteArray107.length - 2 && (local99.aByteArray107[arg1.anInt3201 + 2] & 0xFF) << 8 < arg1.anInt3197) {
				arg1.anInt3201 += 2;
			}
			if (local99.aByteArray107.length - 2 == arg1.anInt3201) {
				local101 = true;
			}
		}
		if (!local101) {
			arg1.aClass1_Sub12_Sub1_4.method2343(arg1.anInt3190, this.method6530(arg1), this.method6553(arg1));
			return false;
		}
		arg1.aClass1_Sub12_Sub1_4.method2326(arg1.anInt3190);
		if (arg2 == null) {
			arg1.aClass1_Sub12_Sub1_4.method6516(arg0);
		} else {
			arg1.aClass1_Sub12_Sub1_4.method6519(arg2, arg3, arg0);
		}
		if (arg1.aClass1_Sub12_Sub1_4.method2360()) {
			this.aClass1_Sub12_Sub2_1.aClass1_Sub12_Sub3_1.method6369(arg1.aClass1_Sub12_Sub1_4);
		}
		arg1.method2901();
		if (arg1.anInt3197 >= 0) {
			arg1.method7983();
			if (arg1.anInt3189 > 0 && this.aClass1_Sub17ArrayArray1[arg1.anInt3193][arg1.anInt3189] == arg1) {
				this.aClass1_Sub17ArrayArray1[arg1.anInt3193][arg1.anInt3189] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
	private void method6524(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method6524(local7);
			}
			return;
		}
		this.anIntArray607[arg0] = 12800;
		this.anIntArray606[arg0] = 8192;
		this.anIntArray610[arg0] = 16383;
		this.anIntArray608[arg0] = 8192;
		this.anIntArray600[arg0] = 0;
		this.anIntArray609[arg0] = 8192;
		this.method6546(arg0);
		this.method6550(arg0);
		this.anIntArray602[arg0] = 0;
		this.anIntArray614[arg0] = 32767;
		this.anIntArray611[arg0] = 256;
		this.anIntArray604[arg0] = 0;
		this.method6533(8192, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!fi;)Z")
	public boolean method6525(@OriginalArg(1) Class1_Sub17 arg0) {
		if (arg0.aClass1_Sub12_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt3197 >= 0) {
			arg0.method7983();
			if (arg0.anInt3189 > 0 && arg0 == this.aClass1_Sub17ArrayArray1[arg0.anInt3193][arg0.anInt3189]) {
				this.aClass1_Sub17ArrayArray1[arg0.anInt3193][arg0.anInt3189] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V")
	private void method6526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray608[arg1] = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(II)V")
	private void method6527(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class1_Sub17 local6 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1419(); local6 != null; local6 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1415()) {
			if ((arg0 < 0 || arg0 == local6.anInt3193) && local6.anInt3197 < 0) {
				this.aClass1_Sub17ArrayArray2[local6.anInt3193][local6.anInt3184] = null;
				local6.anInt3197 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZILclient!fi;)V")
	public void method6528(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub32_Sub1_2.aByteArray81.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass1_Sub32_Sub1_2.aBoolean459) {
			@Pc(37) int local37 = local8 + local8 - arg1.aClass1_Sub32_Sub1_2.anInt6858;
			local27 = (int) ((long) this.anIntArray604[arg1.anInt3193] * (long) local37 >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				local27 = local8 + local8 - local27 - 1;
				arg1.aClass1_Sub12_Sub1_4.method2344();
			}
		} else {
			local27 = (int) ((long) this.anIntArray604[arg1.anInt3193] * (long) local8 >> 6);
		}
		arg1.aClass1_Sub12_Sub1_4.method2338(local27);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method6529() {
		return this.aClass256_1.method6272();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass256_1.method6272()) {
			@Pc(14) int local14 = this.anInt7629 * this.aClass256_1.anInt7350 / Static77.anInt2079;
			do {
				@Pc(24) long local24 = this.aLong202 + (long) local14 * (long) arg2;
				if (this.aLong203 - local24 >= 0L) {
					this.aLong202 = local24;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong203 - this.aLong202 - 1L) / (long) local14);
				this.aLong202 += (long) local14 * (long) local53;
				this.aClass1_Sub12_Sub2_1.method6519(arg0, arg1, local53);
				arg1 += local53;
				arg2 -= local53;
				this.method6542();
			} while (this.aClass256_1.method6272());
		}
		this.aClass1_Sub12_Sub2_1.method6519(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!fi;)I")
	private int method6530(@OriginalArg(1) Class1_Sub17 arg0) {
		if (this.anIntArray605[arg0.anInt3193] == 0) {
			return 0;
		}
		@Pc(17) Class297 local17 = arg0.aClass297_1;
		@Pc(33) int local33 = this.anIntArray607[arg0.anInt3193] * this.anIntArray610[arg0.anInt3193] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt3188 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt7645 + 128 >> 8;
		local33 = local59 * this.anIntArray605[arg0.anInt3193] + 128 >> 8;
		if (local17.anInt8473 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt3186 * 1.953125E-5D * (double) local17.anInt8473) + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(139) int local139;
		@Pc(151) int local151;
		if (local17.aByteArray108 != null) {
			local109 = arg0.anInt3181;
			local117 = local17.aByteArray108[arg0.anInt3195 + 1];
			if (local17.aByteArray108.length - 2 > arg0.anInt3195) {
				local139 = (local17.aByteArray108[arg0.anInt3195] & 0xFF) << 8;
				local151 = (local17.aByteArray108[arg0.anInt3195 + 2] & 0xFF) << 8;
				local117 += (local17.aByteArray108[arg0.anInt3195 + 3] - local117) * (local109 + -local139) / (local151 - local139);
			}
			local33 = local117 * local33 + 32 >> 6;
		}
		if (arg0.anInt3197 > 0 && local17.aByteArray107 != null) {
			local109 = arg0.anInt3197;
			local117 = local17.aByteArray107[arg0.anInt3201 + 1];
			if (arg0.anInt3201 < local17.aByteArray107.length - 2) {
				local139 = (local17.aByteArray107[arg0.anInt3201] & 0xFF) << 8;
				local151 = (local17.aByteArray107[arg0.anInt3201 + 2] & 0xFF) << 8;
				local117 += (local17.aByteArray107[arg0.anInt3201 + 3] - local117) * (-local139 + local109) / (local151 - local139);
			}
			local33 = local117 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(IIII)V")
	private void method6531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)V")
	public synchronized void method6532() {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass174_30.method4421(); local5 != null; local5 = (Class1_Sub8) this.aClass174_30.method4429()) {
			local5.method7983();
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(III)V")
	private void method6533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray612[arg1] = arg0;
		this.anIntArray601[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BI)V")
	private void method6534(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1_Sub17 local14 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1419(); local14 != null; local14 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1415()) {
			if (arg0 < 0 || arg0 == local14.anInt3193) {
				if (local14.aClass1_Sub12_Sub1_4 != null) {
					local14.aClass1_Sub12_Sub1_4.method2326(Static77.anInt2079 / 100);
					if (local14.aClass1_Sub12_Sub1_4.method2360()) {
						this.aClass1_Sub12_Sub2_1.aClass1_Sub12_Sub3_1.method6369(local14.aClass1_Sub12_Sub1_4);
					}
					local14.method2901();
				}
				if (local14.anInt3197 < 0) {
					this.aClass1_Sub17ArrayArray2[local14.anInt3193][local14.anInt3184] = null;
				}
				local14.method7983();
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLclient!ps;IZ)V")
	private synchronized void method6535(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub38 arg1, @OriginalArg(3) boolean arg2) {
		this.method6555(arg2);
		this.aClass256_1.method6260(arg1.aByteArray79);
		this.aLong202 = 0L;
		this.aBoolean504 = arg0;
		@Pc(28) int local28 = this.aClass256_1.method6263();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass256_1.method6257(local30);
			this.aClass256_1.method6262(local30);
			this.aClass256_1.method6267(local30);
		}
		this.anInt7646 = this.aClass256_1.method6271();
		this.anInt7647 = this.aClass256_1.anIntArray581[this.anInt7646];
		this.aLong203 = this.aClass256_1.method6259(this.anInt7647);
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(III)V")
	private synchronized void method6536() {
		for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
			this.anIntArray605[local16] = 256;
		}
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(III)V")
	public synchronized void method6537() {
		this.method6543();
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(BLclient!fi;)I")
	private int method6538(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(14) int local14 = (arg0.anInt3196 * arg0.anInt3194 >> 12) + arg0.anInt3185;
		local14 += (this.anIntArray608[arg0.anInt3193] - 8192) * this.anIntArray611[arg0.anInt3193] >> 12;
		@Pc(41) Class297 local41 = arg0.aClass297_1;
		@Pc(61) int local61;
		if (local41.anInt8477 > 0 && (local41.anInt8470 > 0 || this.anIntArray600[arg0.anInt3193] > 0)) {
			local61 = local41.anInt8470 << 2;
			@Pc(66) int local66 = local41.anInt8471 << 1;
			if (arg0.anInt3192 < local66) {
				local61 = arg0.anInt3192 * local61 / local66;
			}
			local61 += this.anIntArray600[arg0.anInt3193] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt3187 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass1_Sub32_Sub1_2.anInt6859 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static77.anInt2079 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(BI)V")
	private void method6539(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = arg0 & 0xF0;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (local16 == 128) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			this.method6522(local29, local23, local35);
		} else if (local16 == 144) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			if (local35 > 0) {
				this.method6544(local23, local29, local35);
			} else {
				this.method6522(local29, local23, 64);
			}
		} else if (local16 == 160) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			this.method6531(local23, local35, local29);
		} else if (local16 == 176) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			if (local29 == 0) {
				this.anIntArray615[local23] = (this.anIntArray615[local23] & 0xFFE03FFF) + (local35 << 14);
			}
			if (local29 == 32) {
				this.anIntArray615[local23] = (this.anIntArray615[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 1) {
				this.anIntArray600[local23] = (local35 << 7) + (this.anIntArray600[local23] & 0xFFFFC07F);
			}
			if (local29 == 33) {
				this.anIntArray600[local23] = (this.anIntArray600[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 5) {
				this.anIntArray609[local23] = (this.anIntArray609[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 37) {
				this.anIntArray609[local23] = (this.anIntArray609[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 7) {
				this.anIntArray607[local23] = (local35 << 7) + (this.anIntArray607[local23] & 0xFFFFC07F);
			}
			if (local29 == 39) {
				this.anIntArray607[local23] = local35 + (this.anIntArray607[local23] & 0xFFFFFF80);
			}
			if (local29 == 10) {
				this.anIntArray606[local23] = (local35 << 7) + (this.anIntArray606[local23] & 0xFFFFC07F);
			}
			if (local29 == 42) {
				this.anIntArray606[local23] = local35 + (this.anIntArray606[local23] & 0xFFFFFF80);
			}
			if (local29 == 11) {
				this.anIntArray610[local23] = (local35 << 7) + (this.anIntArray610[local23] & 0xFFFFC07F);
			}
			if (local29 == 43) {
				this.anIntArray610[local23] = (this.anIntArray610[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 64) {
				if (local35 < 64) {
					this.anIntArray602[local23] &= 0xFFFFFFFE;
				} else {
					this.anIntArray602[local23] |= 0x1;
				}
			}
			if (local29 == 65) {
				if (local35 >= 64) {
					this.anIntArray602[local23] |= 0x2;
				} else {
					this.method6546(local23);
					this.anIntArray602[local23] &= 0xFFFFFFFD;
				}
			}
			if (local29 == 99) {
				this.anIntArray614[local23] = (this.anIntArray614[local23] & 0x7F) + (local35 << 7);
			}
			if (local29 == 98) {
				this.anIntArray614[local23] = local35 + (this.anIntArray614[local23] & 0x3F80);
			}
			if (local29 == 101) {
				this.anIntArray614[local23] = (this.anIntArray614[local23] & 0x7F) + ((local35 << 7) + 16384);
			}
			if (local29 == 100) {
				this.anIntArray614[local23] = (this.anIntArray614[local23] & 0x3F80) + local35 + 16384;
			}
			if (local29 == 120) {
				this.method6534(local23);
			}
			if (local29 == 121) {
				this.method6524(local23);
			}
			if (local29 == 123) {
				this.method6527(local23);
			}
			@Pc(503) int local503;
			if (local29 == 6) {
				local503 = this.anIntArray614[local23];
				if (local503 == 16384) {
					this.anIntArray611[local23] = (this.anIntArray611[local23] & 0xFFFFC07F) + (local35 << 7);
				}
			}
			if (local29 == 38) {
				local503 = this.anIntArray614[local23];
				if (local503 == 16384) {
					this.anIntArray611[local23] = (this.anIntArray611[local23] & 0xFFFFFF80) + local35;
				}
			}
			if (local29 == 16) {
				this.anIntArray604[local23] = (local35 << 7) + (this.anIntArray604[local23] & 0xFFFFC07F);
			}
			if (local29 == 48) {
				this.anIntArray604[local23] = (this.anIntArray604[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 81) {
				if (local35 < 64) {
					this.method6550(local23);
					this.anIntArray602[local23] &= 0xFFFFFFFB;
				} else {
					this.anIntArray602[local23] |= 0x4;
				}
			}
			if (local29 == 17) {
				this.method6533((this.anIntArray612[local23] & 0xFFFFC07F) + (local35 << 7), local23);
			}
			if (local29 == 49) {
				this.method6533((this.anIntArray612[local23] & 0xFFFFFF80) + local35, local23);
			}
		} else if (local16 == 192) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method6547(this.anIntArray615[local23] + local29, local23);
		} else if (local16 == 208) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method6541(local23, local29);
		} else if (local16 == 224) {
			local23 = arg0 & 0xF;
			local29 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F01CC) >> 9);
			this.method6526(local29, local23);
		} else {
			local16 = arg0 & 0xFF;
			if (local16 == 255) {
				this.method6551(true);
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "()I")
	@Override
	public synchronized int method6521() {
		return 0;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public synchronized void method6540() {
		for (@Pc(7) Class1_Sub8 local7 = (Class1_Sub8) this.aClass174_30.method4421(); local7 != null; local7 = (Class1_Sub8) this.aClass174_30.method4429()) {
			local7.method1556();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BII)V")
	private void method6541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V")
	private void method6542() {
		@Pc(8) int local8 = this.anInt7646;
		@Pc(18) int local18 = this.anInt7647;
		@Pc(21) long local21 = this.aLong203;
		if (this.aClass1_Sub38_2 != null && this.anInt7648 == local18) {
			this.method6535(this.aBoolean504, this.aClass1_Sub38_2, this.aBoolean505);
			this.method6542();
			return;
		}
		while (local18 == this.anInt7647) {
			while (this.aClass256_1.anIntArray581[local8] == local18) {
				this.aClass256_1.method6257(local8);
				@Pc(54) int local54 = this.aClass256_1.method6261(local8);
				if (local54 == 1) {
					this.aClass256_1.method6258();
					this.aClass256_1.method6267(local8);
					if (this.aClass256_1.method6269()) {
						if (this.aClass1_Sub38_2 != null) {
							this.method6556(this.aClass1_Sub38_2, this.aBoolean504);
							this.method6542();
							return;
						}
						if (!this.aBoolean504 || local18 == 0) {
							this.method6551(true);
							this.aClass256_1.method6268();
							return;
						}
						this.aClass256_1.method6266(local21);
					}
					break;
				}
				if ((local54 & 0x80) != 0) {
					this.method6539(local54);
				}
				this.aClass256_1.method6262(local8);
				this.aClass256_1.method6267(local8);
			}
			local8 = this.aClass256_1.method6271();
			local18 = this.aClass256_1.anIntArray581[local8];
			local21 = this.aClass256_1.method6259(local18);
		}
		this.aLong203 = local21;
		this.anInt7647 = local18;
		this.anInt7646 = local8;
		if (this.aClass1_Sub38_2 != null && this.anInt7648 < local18) {
			this.anInt7647 = this.anInt7648;
			this.anInt7646 = -1;
			this.aLong203 = this.aClass256_1.method6259(this.anInt7647);
		}
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(III)V")
	private void method6543() {
		this.anIntArray613[9] = 128;
		this.anIntArray615[9] = 128;
		this.method6547(128, 9);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BIII)V")
	private void method6544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6522(arg1, arg0, 64);
		if ((this.anIntArray602[arg0] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub17 local28 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1420(); local28 != null; local28 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1421()) {
				if (local28.anInt3193 == arg0 && local28.anInt3197 < 0) {
					this.aClass1_Sub17ArrayArray2[arg0][local28.anInt3184] = null;
					this.aClass1_Sub17ArrayArray2[arg0][arg1] = local28;
					@Pc(66) int local66 = local28.anInt3185 + (local28.anInt3196 * local28.anInt3194 >> 12);
					local28.anInt3185 += arg1 - local28.anInt3184 << 8;
					local28.anInt3194 = local66 - local28.anInt3185;
					local28.anInt3184 = arg1;
					local28.anInt3196 = 4096;
					return;
				}
			}
		}
		@Pc(111) Class1_Sub8 local111 = (Class1_Sub8) this.aClass174_30.method4422((long) this.anIntArray603[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class1_Sub32_Sub1 local119 = local111.aClass1_Sub32_Sub1Array1[arg1];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class1_Sub17 local126 = new Class1_Sub17();
		local126.anInt3193 = arg0;
		local126.aClass1_Sub8_1 = local111;
		local126.aClass1_Sub32_Sub1_2 = local119;
		local126.aClass297_1 = local111.aClass297Array1[arg1];
		local126.anInt3189 = local111.aByteArray18[arg1];
		local126.anInt3184 = arg1;
		local126.anInt3188 = local111.aByteArray20[arg1] * arg2 * arg2 * local111.anInt1559 + 1024 >> 11;
		local126.anInt3191 = local111.aByteArray19[arg1] & 0xFF;
		local126.anInt3185 = (arg1 << 8) - (local111.aShortArray19[arg1] & 0x7FFF);
		local126.anInt3186 = 0;
		local126.anInt3181 = 0;
		local126.anInt3201 = 0;
		local126.anInt3195 = 0;
		local126.anInt3197 = -1;
		if (this.anIntArray604[arg0] == 0) {
			local126.aClass1_Sub12_Sub1_4 = Static550.method2336(local119, this.method6538(local126), this.method6530(local126), this.method6553(local126));
		} else {
			local126.aClass1_Sub12_Sub1_4 = Static550.method2336(local119, this.method6538(local126), 0, this.method6553(local126));
			this.method6528(local111.aShortArray19[arg1] < 0, local126);
		}
		if (local111.aShortArray19[arg1] < 0) {
			local126.aClass1_Sub12_Sub1_4.method2351(-1);
		}
		if (local126.anInt3189 >= 0) {
			@Pc(274) Class1_Sub17 local274 = this.aClass1_Sub17ArrayArray1[arg0][local126.anInt3189];
			if (local274 != null && local274.anInt3197 < 0) {
				this.aClass1_Sub17ArrayArray2[arg0][local274.anInt3184] = null;
				local274.anInt3197 = 0;
			}
			this.aClass1_Sub17ArrayArray1[arg0][local126.anInt3189] = local126;
		}
		this.aClass1_Sub12_Sub2_1.aClass38_31.method1426(local126);
		this.aClass1_Sub17ArrayArray2[arg0][arg1] = local126;
	}

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "(I)I")
	public int method6545() {
		return this.anInt7645;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6516(@OriginalArg(0) int arg0) {
		if (this.aClass256_1.method6272()) {
			@Pc(14) int local14 = this.anInt7629 * this.aClass256_1.anInt7350 / Static77.anInt2079;
			do {
				@Pc(23) long local23 = this.aLong202 + (long) local14 * (long) arg0;
				if (this.aLong203 - local23 >= 0L) {
					this.aLong202 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong203 - this.aLong202 - 1L) / (long) local14);
				this.aLong202 += (long) local52 * (long) local14;
				this.aClass1_Sub12_Sub2_1.method6516(local52);
				arg0 -= local52;
				this.method6542();
			} while (this.aClass256_1.method6272());
		}
		this.aClass1_Sub12_Sub2_1.method6516(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(IB)V")
	private void method6546(@OriginalArg(0) int arg0) {
		if ((this.anIntArray602[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class1_Sub17 local13 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1419(); local13 != null; local13 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1415()) {
			if (local13.anInt3193 == arg0 && this.aClass1_Sub17ArrayArray2[arg0][local13.anInt3184] == null && local13.anInt3197 < 0) {
				local13.anInt3197 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "(III)V")
	private void method6547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray603[arg1] != arg0) {
			this.anIntArray603[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass1_Sub17ArrayArray1[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "()Lclient!kca;")
	@Override
	public synchronized Class1_Sub12 method6517() {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(I)V")
	public synchronized void method6549() {
		this.method6555(true);
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(II)V")
	private void method6550(@OriginalArg(1) int arg0) {
		if ((this.anIntArray602[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class1_Sub17 local16 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1419(); local16 != null; local16 = (Class1_Sub17) this.aClass1_Sub12_Sub2_1.aClass38_31.method1415()) {
			if (arg0 == local16.anInt3193) {
				local16.anInt3182 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZB)V")
	private void method6551(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6534(-1);
		} else {
			this.method6527(-1);
		}
		this.method6524(-1);
		for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
			this.anIntArray603[local24] = this.anIntArray613[local24];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray615[local39] = this.anIntArray613[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!kda;ZLclient!iba;ILclient!ps;)Z")
	public synchronized boolean method6552(@OriginalArg(0) Class160 arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(4) Class1_Sub38 arg2) {
		arg2.method5758();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class1_Sub20 local26 = (Class1_Sub20) arg2.aClass174_25.method4421(); local26 != null; local26 = (Class1_Sub20) arg2.aClass174_25.method4429()) {
			@Pc(32) int local32 = (int) local26.aLong244;
			@Pc(40) Class1_Sub8 local40 = (Class1_Sub8) this.aClass174_30.method4422((long) local32);
			if (local40 == null) {
				local40 = Static382.method5787(local32, arg0);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass174_30.method4420(local40, (long) local32);
			}
			if (!local40.method1555(arg1, local20, local26.aByteArray60)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method5760();
		}
		return local9;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(ILclient!fi;)I")
	private int method6553(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(15) int local15 = this.anIntArray606[arg0.anInt3193];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt3191) * (-local15 + 16384) + 32 >> 6) : local15 * arg0.anInt3191 + 32 >> 6;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "()Lclient!kca;")
	@Override
	public synchronized Class1_Sub12 method6515() {
		return this.aClass1_Sub12_Sub2_1;
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(II)V")
	public synchronized void method6554(@OriginalArg(0) int arg0) {
		this.anInt7645 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BZ)V")
	private synchronized void method6555(@OriginalArg(1) boolean arg0) {
		this.aClass256_1.method6268();
		this.aClass1_Sub38_2 = null;
		this.method6551(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!ps;Z)V")
	public synchronized void method6556(@OriginalArg(1) Class1_Sub38 arg0, @OriginalArg(2) boolean arg1) {
		this.method6535(arg1, arg0, true);
	}
}
