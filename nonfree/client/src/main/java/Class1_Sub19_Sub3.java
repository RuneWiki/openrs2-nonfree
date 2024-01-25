import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub19_Sub3 extends Class1_Sub19 {

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!td", name = "Jb", descriptor = "I")
	private int anInt6992;

	@OriginalMember(owner = "client!td", name = "Kb", descriptor = "I")
	private int anInt6993;

	@OriginalMember(owner = "client!td", name = "Lb", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!td", name = "Mb", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!td", name = "Ob", descriptor = "Lclient!fp;")
	private Class1_Sub18 aClass1_Sub18_2;

	@OriginalMember(owner = "client!td", name = "Pb", descriptor = "I")
	private int anInt6994;

	@OriginalMember(owner = "client!td", name = "Qb", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	private int anInt6954 = 256;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "[I")
	private final int[] anIntArray644 = new int[16];

	@OriginalMember(owner = "client!td", name = "w", descriptor = "[I")
	private final int[] anIntArray646 = new int[16];

	@OriginalMember(owner = "client!td", name = "t", descriptor = "[I")
	private final int[] anIntArray645 = new int[16];

	@OriginalMember(owner = "client!td", name = "F", descriptor = "[[Lclient!bv;")
	private final Class1_Sub7[][] aClass1_Sub7ArrayArray1 = new Class1_Sub7[16][128];

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "[I")
	public final int[] anIntArray654 = new int[16];

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "[I")
	private final int[] anIntArray651 = new int[16];

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "[I")
	public final int[] anIntArray653 = new int[16];

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "[I")
	private final int[] anIntArray652 = new int[16];

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "[I")
	private final int[] anIntArray655 = new int[16];

	@OriginalMember(owner = "client!td", name = "X", descriptor = "[[Lclient!bv;")
	private final Class1_Sub7[][] aClass1_Sub7ArrayArray2 = new Class1_Sub7[16][128];

	@OriginalMember(owner = "client!td", name = "S", descriptor = "[I")
	private final int[] anIntArray649 = new int[16];

	@OriginalMember(owner = "client!td", name = "N", descriptor = "I")
	private final int anInt6963 = 1000000;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "[I")
	private final int[] anIntArray657 = new int[16];

	@OriginalMember(owner = "client!td", name = "L", descriptor = "[I")
	private final int[] anIntArray647 = new int[16];

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "[I")
	public final int[] anIntArray656 = new int[16];

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[I")
	private final int[] anIntArray648 = new int[16];

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[I")
	private final int[] anIntArray650 = new int[16];

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "[I")
	private final int[] anIntArray658 = new int[16];

	@OriginalMember(owner = "client!td", name = "Eb", descriptor = "[I")
	private final int[] anIntArray659 = new int[16];

	@OriginalMember(owner = "client!td", name = "J", descriptor = "Lclient!nu;")
	private final Class182 aClass182_1 = new Class182();

	@OriginalMember(owner = "client!td", name = "Nb", descriptor = "Lclient!fq;")
	private final Class1_Sub19_Sub1 aClass1_Sub19_Sub1_1 = new Class1_Sub19_Sub1(this);

	@OriginalMember(owner = "client!td", name = "A", descriptor = "Lclient!bu;")
	private final Class38 aClass38_35 = new Class38(128);

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class1_Sub19_Sub3() {
		this.method5315();
		this.method5323(true);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V")
	private void method5293(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4548(); local14 != null; local14 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4545()) {
			if ((arg0 < 0 || arg0 == local14.anInt1076) && local14.anInt1077 < 0) {
				this.aClass1_Sub7ArrayArray1[local14.anInt1076][local14.anInt1072] = null;
				local14.anInt1077 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public synchronized void method5294() {
		this.method5316(true);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
	private void method5296(@OriginalArg(0) int arg0) {
		if ((this.anIntArray654[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(13) Class1_Sub7 local13 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4548(); local13 != null; local13 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4545()) {
			if (local13.anInt1076 == arg0) {
				local13.anInt1082 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public synchronized void method5297() {
		for (@Pc(9) Class1_Sub20 local9 = (Class1_Sub20) this.aClass38_35.method767(); local9 != null; local9 = (Class1_Sub20) this.aClass38_35.method773()) {
			local9.method2422();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IIII)V")
	private void method5298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5319(64, arg1, arg0);
		if ((this.anIntArray654[arg0] & 0x2) != 0) {
			for (@Pc(26) Class1_Sub7 local26 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4556(); local26 != null; local26 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4544()) {
				if (arg0 == local26.anInt1076 && local26.anInt1077 < 0) {
					this.aClass1_Sub7ArrayArray1[arg0][local26.anInt1072] = null;
					this.aClass1_Sub7ArrayArray1[arg0][arg1] = local26;
					@Pc(63) int local63 = (local26.anInt1074 * local26.anInt1068 >> 12) + local26.anInt1069;
					local26.anInt1069 += arg1 - local26.anInt1072 << 8;
					local26.anInt1068 = 4096;
					local26.anInt1074 = local63 - local26.anInt1069;
					local26.anInt1072 = arg1;
					return;
				}
			}
		}
		@Pc(110) Class1_Sub20 local110 = (Class1_Sub20) this.aClass38_35.method765((long) this.anIntArray645[arg0]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class1_Sub12_Sub1 local118 = local110.aClass1_Sub12_Sub1Array1[arg1];
		if (local118 == null) {
			return;
		}
		@Pc(131) Class1_Sub7 local131 = new Class1_Sub7();
		local131.aClass1_Sub20_1 = local110;
		local131.anInt1076 = arg0;
		local131.aClass1_Sub12_Sub1_1 = local118;
		local131.aClass254_1 = local110.aClass254Array1[arg1];
		local131.anInt1064 = local110.aByteArray42[arg1];
		local131.anInt1072 = arg1;
		local131.anInt1063 = local110.anInt3255 * arg2 * arg2 * local110.aByteArray40[arg1] + 1024 >> 11;
		local131.anInt1070 = local110.aByteArray41[arg1] & 0xFF;
		local131.anInt1069 = (arg1 << 8) - (local110.aShortArray64[arg1] & 0x7FFF);
		local131.anInt1067 = 0;
		local131.anInt1077 = -1;
		local131.anInt1083 = 0;
		local131.anInt1078 = 0;
		local131.anInt1065 = 0;
		if (this.anIntArray656[arg0] == 0) {
			local131.aClass1_Sub19_Sub4_1 = Static468.method5845(local118, this.method5305(local131), this.method5307(local131), this.method5299(local131));
		} else {
			local131.aClass1_Sub19_Sub4_1 = Static468.method5845(local118, this.method5305(local131), 0, this.method5299(local131));
			this.method5309(local110.aShortArray64[arg1] < 0, local131);
		}
		if (local110.aShortArray64[arg1] < 0) {
			local131.aClass1_Sub19_Sub4_1.method5828(-1);
		}
		if (local131.anInt1064 >= 0) {
			@Pc(286) Class1_Sub7 local286 = this.aClass1_Sub7ArrayArray2[arg0][local131.anInt1064];
			if (local286 != null && local286.anInt1077 < 0) {
				this.aClass1_Sub7ArrayArray1[arg0][local286.anInt1072] = null;
				local286.anInt1077 = 0;
			}
			this.aClass1_Sub7ArrayArray2[arg0][local131.anInt1064] = local131;
		}
		this.aClass1_Sub19_Sub1_1.aClass203_16.method4551(local131);
		this.aClass1_Sub7ArrayArray1[arg0][arg1] = local131;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!bv;I)I")
	private int method5299(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(17) int local17 = this.anIntArray652[arg0.anInt1076];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt1070) * (-local17 + 16384) + 32 >> 6) : local17 * arg0.anInt1070 + 32 >> 6;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
	private void method5300(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method5300(local10);
			}
			return;
		}
		this.anIntArray648[arg0] = 12800;
		this.anIntArray652[arg0] = 8192;
		this.anIntArray644[arg0] = 16383;
		this.anIntArray647[arg0] = 8192;
		this.anIntArray658[arg0] = 0;
		this.anIntArray655[arg0] = 8192;
		this.method5308(arg0);
		this.method5296(arg0);
		this.anIntArray654[arg0] = 0;
		this.anIntArray650[arg0] = 32767;
		this.anIntArray657[arg0] = 256;
		this.anIntArray656[arg0] = 0;
		this.method5324(arg0, 8192);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILclient!fp;)V")
	public synchronized void method5301(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		this.method5303(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass182_1.method4134()) {
			@Pc(16) int local16 = this.anInt6963 * this.aClass182_1.anInt5391 / Static84.anInt2035;
			do {
				@Pc(25) long local25 = (long) local16 * (long) arg2 + this.aLong197;
				if (this.aLong196 - local25 >= 0L) {
					this.aLong197 = local25;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local16 + this.aLong196 - this.aLong197 - 1L) / (long) local16);
				this.aLong197 += (long) local16 * (long) local53;
				this.aClass1_Sub19_Sub1_1.method5803(arg0, arg1, local53);
				arg1 += local53;
				arg2 -= local53;
				this.method5311();
			} while (this.aClass182_1.method4134());
		}
		this.aClass1_Sub19_Sub1_1.method5803(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public synchronized void method5302() {
		for (@Pc(16) Class1_Sub20 local16 = (Class1_Sub20) this.aClass38_35.method767(); local16 != null; local16 = (Class1_Sub20) this.aClass38_35.method773()) {
			local16.method6178();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fp;ZZZ)V")
	private synchronized void method5303(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method5316(arg1);
		this.aClass182_1.method4130(arg0.aByteArray36);
		this.aLong197 = 0L;
		this.aBoolean438 = arg2;
		@Pc(22) int local22 = this.aClass182_1.method4127();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			this.aClass182_1.method4132(local24);
			this.aClass182_1.method4123(local24);
			this.aClass182_1.method4126(local24);
		}
		this.anInt6992 = this.aClass182_1.method4136();
		this.anInt6993 = this.aClass182_1.anIntArray504[this.anInt6992];
		this.aLong196 = this.aClass182_1.method4129(this.anInt6993);
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(II)V")
	public synchronized void method5304(@OriginalArg(1) int arg0) {
		this.anInt6954 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5802(@OriginalArg(0) int arg0) {
		if (this.aClass182_1.method4134()) {
			@Pc(16) int local16 = this.aClass182_1.anInt5391 * this.anInt6963 / Static84.anInt2035;
			do {
				@Pc(25) long local25 = (long) local16 * (long) arg0 + this.aLong197;
				if (this.aLong196 - local25 >= 0L) {
					this.aLong197 = local25;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong196 + (long) local16 - this.aLong197 - 1L) / (long) local16);
				this.aLong197 += (long) local16 * (long) local55;
				arg0 -= local55;
				this.aClass1_Sub19_Sub1_1.method5802(local55);
				this.method5311();
			} while (this.aClass182_1.method4134());
		}
		this.aClass1_Sub19_Sub1_1.method5802(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()Lclient!oa;")
	@Override
	public synchronized Class1_Sub19 method5805() {
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!bv;)I")
	private int method5305(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(14) int local14 = (arg0.anInt1068 * arg0.anInt1074 >> 12) + arg0.anInt1069;
		local14 += this.anIntArray657[arg0.anInt1076] * (this.anIntArray647[arg0.anInt1076] - 8192) >> 12;
		@Pc(41) Class254 local41 = arg0.aClass254_1;
		@Pc(61) int local61;
		if (local41.anInt7485 > 0 && (local41.anInt7484 > 0 || this.anIntArray658[arg0.anInt1076] > 0)) {
			local61 = local41.anInt7484 << 2;
			@Pc(66) int local66 = local41.anInt7481 << 1;
			if (local66 > arg0.anInt1062) {
				local61 = arg0.anInt1062 * local61 / local66;
			}
			local61 += this.anIntArray658[arg0.anInt1076] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt1071 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass1_Sub12_Sub1_1.anInt4814 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static84.anInt2035 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!bv;Z)I")
	private int method5307(@OriginalArg(0) Class1_Sub7 arg0) {
		if (this.anIntArray659[arg0.anInt1076] == 0) {
			return 0;
		}
		@Pc(17) Class254 local17 = arg0.aClass254_1;
		@Pc(33) int local33 = this.anIntArray648[arg0.anInt1076] * this.anIntArray644[arg0.anInt1076] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt1063 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt6954 + 128 >> 8;
		local33 = local59 * this.anIntArray659[arg0.anInt1076] + 128 >> 8;
		if (local17.anInt7483 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt1067 * 1.953125E-5D * (double) local17.anInt7483) + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local17.aByteArray89 != null) {
			local98 = arg0.anInt1065;
			local106 = local17.aByteArray89[arg0.anInt1083 + 1];
			if (local17.aByteArray89.length - 2 > arg0.anInt1083) {
				local124 = (local17.aByteArray89[arg0.anInt1083] & 0xFF) << 8;
				local136 = (local17.aByteArray89[arg0.anInt1083 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (local17.aByteArray89[arg0.anInt1083 + 3] + -local106) / (local136 - local124);
			}
			local33 = local106 * local33 + 32 >> 6;
		}
		if (arg0.anInt1077 > 0 && local17.aByteArray88 != null) {
			local98 = arg0.anInt1077;
			local106 = local17.aByteArray88[arg0.anInt1078 + 1];
			if (local17.aByteArray88.length - 2 > arg0.anInt1078) {
				local124 = (local17.aByteArray88[arg0.anInt1078] & 0xFF) << 8;
				local136 = (local17.aByteArray88[arg0.anInt1078 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local17.aByteArray88[arg0.anInt1078 + 3]) / (local136 - local124);
			}
			local33 = local33 * local106 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)V")
	private void method5308(@OriginalArg(0) int arg0) {
		if ((this.anIntArray654[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class1_Sub7 local13 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4548(); local13 != null; local13 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4545()) {
			if (local13.anInt1076 == arg0 && this.aClass1_Sub7ArrayArray1[arg0][local13.anInt1072] == null && local13.anInt1077 < 0) {
				local13.anInt1077 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZLclient!bv;)V")
	public void method5309(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		@Pc(16) int local16 = arg1.aClass1_Sub12_Sub1_1.aByteArray54.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass1_Sub12_Sub1_1.aBoolean307) {
			@Pc(31) int local31 = local16 + local16 - arg1.aClass1_Sub12_Sub1_1.anInt4816;
			local44 = (int) ((long) this.anIntArray656[arg1.anInt1076] * (long) local31 >> 6);
			local16 <<= 0x8;
			if (local16 <= local44) {
				local44 = local16 + local16 - local44 - 1;
				arg1.aClass1_Sub19_Sub4_1.method5837();
			}
		} else {
			local44 = (int) ((long) local16 * (long) this.anIntArray656[arg1.anInt1076] >> 6);
		}
		arg1.aClass1_Sub19_Sub4_1.method5841(local44);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IIII)V")
	private void method5310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	private void method5311() {
		@Pc(6) int local6 = this.anInt6992;
		@Pc(15) int local15 = this.anInt6993;
		@Pc(18) long local18 = this.aLong196;
		if (this.aClass1_Sub18_2 != null && local15 == this.anInt6994) {
			this.method5303(this.aClass1_Sub18_2, this.aBoolean439, this.aBoolean438);
			this.method5311();
			return;
		}
		while (local15 == this.anInt6993) {
			while (this.aClass182_1.anIntArray504[local6] == local15) {
				this.aClass182_1.method4132(local6);
				@Pc(51) int local51 = this.aClass182_1.method4135(local6);
				if (local51 == 1) {
					this.aClass182_1.method4125();
					this.aClass182_1.method4126(local6);
					if (this.aClass182_1.method4122()) {
						if (this.aClass1_Sub18_2 != null) {
							this.method5301(this.aBoolean438, this.aClass1_Sub18_2);
							this.method5311();
							return;
						}
						if (!this.aBoolean438 || local15 == 0) {
							this.method5323(true);
							this.aClass182_1.method4128();
							return;
						}
						this.aClass182_1.method4137(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method5314(local51);
				}
				this.aClass182_1.method4123(local6);
				this.aClass182_1.method4126(local6);
			}
			local6 = this.aClass182_1.method4136();
			local15 = this.aClass182_1.anIntArray504[local6];
			local18 = this.aClass182_1.method4129(local15);
		}
		this.anInt6993 = local15;
		this.anInt6992 = local6;
		this.aLong196 = local18;
		if (this.aClass1_Sub18_2 != null && this.anInt6994 < local15) {
			this.anInt6993 = this.anInt6994;
			this.anInt6992 = -1;
			this.aLong196 = this.aClass182_1.method4129(this.anInt6993);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	private void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray645[arg0] != arg1) {
			this.anIntArray645[arg0] = arg1;
			for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
				this.aClass1_Sub7ArrayArray2[arg0][local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!bv;I[II)Z")
	public boolean method5313(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt1075 = Static84.anInt2035 / 100;
		if (arg1.anInt1077 >= 0 && (arg1.aClass1_Sub19_Sub4_1 == null || arg1.aClass1_Sub19_Sub4_1.method5823())) {
			arg1.method788();
			arg1.method6178();
			if (arg1.anInt1064 > 0 && this.aClass1_Sub7ArrayArray2[arg1.anInt1076][arg1.anInt1064] == arg1) {
				this.aClass1_Sub7ArrayArray2[arg1.anInt1076][arg1.anInt1064] = null;
			}
			return true;
		}
		@Pc(51) int local51 = arg1.anInt1068;
		if (local51 > 0) {
			local51 -= (int) (Math.pow(2.0D, (double) this.anIntArray655[arg1.anInt1076] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local51 < 0) {
				local51 = 0;
			}
			arg1.anInt1068 = local51;
		}
		arg1.aClass1_Sub19_Sub4_1.method5814(this.method5305(arg1));
		@Pc(91) Class254 local91 = arg1.aClass254_1;
		arg1.anInt1071 += local91.anInt7485;
		arg1.anInt1062++;
		@Pc(106) boolean local106 = false;
		@Pc(125) double local125 = (double) ((arg1.anInt1072 - 60 << 8) + (arg1.anInt1074 * arg1.anInt1068 >> 12)) * 5.086263020833333E-6D;
		if (local91.anInt7483 > 0) {
			if (local91.anInt7479 > 0) {
				arg1.anInt1067 += (int) (Math.pow(2.0D, (double) local91.anInt7479 * local125) * 128.0D + 0.5D);
			} else {
				arg1.anInt1067 += 128;
			}
			if (local91.anInt7483 * arg1.anInt1067 >= 819200) {
				local106 = true;
			}
		}
		if (local91.aByteArray89 != null) {
			if (local91.anInt7480 <= 0) {
				arg1.anInt1065 += 128;
			} else {
				arg1.anInt1065 += (int) (Math.pow(2.0D, local125 * (double) local91.anInt7480) * 128.0D + 0.5D);
			}
			while (local91.aByteArray89.length - 2 > arg1.anInt1083 && (local91.aByteArray89[arg1.anInt1083 + 2] & 0xFF) << 8 < arg1.anInt1065) {
				arg1.anInt1083 += 2;
			}
			if (local91.aByteArray89.length - 2 == arg1.anInt1083 && local91.aByteArray89[arg1.anInt1083 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg1.anInt1077 >= 0 && local91.aByteArray88 != null && (this.anIntArray654[arg1.anInt1076] & 0x1) == 0 && (arg1.anInt1064 < 0 || arg1 != this.aClass1_Sub7ArrayArray2[arg1.anInt1076][arg1.anInt1064])) {
			if (local91.anInt7478 <= 0) {
				arg1.anInt1077 += 128;
			} else {
				arg1.anInt1077 += (int) (Math.pow(2.0D, local125 * (double) local91.anInt7478) * 128.0D + 0.5D);
			}
			while (arg1.anInt1078 < local91.aByteArray88.length - 2 && (local91.aByteArray88[arg1.anInt1078 + 2] & 0xFF) << 8 < arg1.anInt1077) {
				arg1.anInt1078 += 2;
			}
			if (local91.aByteArray88.length - 2 == arg1.anInt1078) {
				local106 = true;
			}
		}
		if (!local106) {
			arg1.aClass1_Sub19_Sub4_1.method5824(arg1.anInt1075, this.method5307(arg1), this.method5299(arg1));
			return false;
		}
		arg1.aClass1_Sub19_Sub4_1.method5810(arg1.anInt1075);
		if (arg2 == null) {
			arg1.aClass1_Sub19_Sub4_1.method5802(arg3);
		} else {
			arg1.aClass1_Sub19_Sub4_1.method5803(arg2, arg0, arg3);
		}
		if (arg1.aClass1_Sub19_Sub4_1.method5809()) {
			this.aClass1_Sub19_Sub1_1.aClass1_Sub19_Sub2_2.method3187(arg1.aClass1_Sub19_Sub4_1);
		}
		arg1.method788();
		if (arg1.anInt1077 >= 0) {
			arg1.method6178();
			if (arg1.anInt1064 > 0 && arg1 == this.aClass1_Sub7ArrayArray2[arg1.anInt1076][arg1.anInt1064]) {
				this.aClass1_Sub7ArrayArray2[arg1.anInt1076][arg1.anInt1064] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
	private void method5314(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local7 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5319(local28, local22, local16);
		} else if (local7 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method5298(local16, local22, local28);
			} else {
				this.method5319(64, local22, local16);
			}
		} else if (local7 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5310(local28, local16, local22);
		} else if (local7 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray649[local16] = (local28 << 14) + (this.anIntArray649[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray649[local16] = (this.anIntArray649[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray658[local16] = (this.anIntArray658[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray658[local16] = local28 + (this.anIntArray658[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray655[local16] = (local28 << 7) + (this.anIntArray655[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray655[local16] = local28 + (this.anIntArray655[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray648[local16] = (local28 << 7) + (this.anIntArray648[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray648[local16] = local28 + (this.anIntArray648[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray652[local16] = (this.anIntArray652[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray652[local16] = (this.anIntArray652[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray644[local16] = (local28 << 7) + (this.anIntArray644[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray644[local16] = local28 + (this.anIntArray644[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray654[local16] |= 0x1;
				} else {
					this.anIntArray654[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray654[local16] |= 0x2;
				} else {
					this.method5308(local16);
					this.anIntArray654[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray650[local16] = (local28 << 7) + (this.anIntArray650[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray650[local16] = local28 + (this.anIntArray650[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray650[local16] = (this.anIntArray650[local16] & 0x7F) + ((local28 << 7) + 16384);
			}
			if (local22 == 100) {
				this.anIntArray650[local16] = (this.anIntArray650[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method5326(local16);
			}
			if (local22 == 121) {
				this.method5300(local16);
			}
			if (local22 == 123) {
				this.method5293(local16);
			}
			@Pc(506) int local506;
			if (local22 == 6) {
				local506 = this.anIntArray650[local16];
				if (local506 == 16384) {
					this.anIntArray657[local16] = (this.anIntArray657[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local506 = this.anIntArray650[local16];
				if (local506 == 16384) {
					this.anIntArray657[local16] = (this.anIntArray657[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray656[local16] = (this.anIntArray656[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray656[local16] = local28 + (this.anIntArray656[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray654[local16] |= 0x4;
				} else {
					this.method5296(local16);
					this.anIntArray654[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method5324(local16, (local28 << 7) + (this.anIntArray646[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method5324(local16, local28 + (this.anIntArray646[local16] & 0xFFFFFF80));
			}
		} else if (local7 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5312(local16, this.anIntArray649[local16] + local22);
		} else if (local7 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5325(local22, local16);
		} else if (local7 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0177) >> 9);
			this.method5321(local16, local22);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.method5323(true);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V")
	private synchronized void method5315() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray659[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	private synchronized void method5316(@OriginalArg(1) boolean arg0) {
		this.aClass182_1.method4128();
		this.aClass1_Sub18_2 = null;
		this.method5323(arg0);
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)I")
	public int method5317() {
		return this.anInt6954;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI)V")
	private void method5318() {
		this.anIntArray651[9] = 128;
		this.anIntArray649[9] = 128;
		this.method5312(9, 128);
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(IIII)V")
	private void method5319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub7 local10 = this.aClass1_Sub7ArrayArray1[arg2][arg1];
		if (local10 == null) {
			return;
		}
		this.aClass1_Sub7ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray654[arg2] & 0x2) == 0) {
			local10.anInt1077 = 0;
			return;
		}
		for (@Pc(46) Class1_Sub7 local46 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4548(); local46 != null; local46 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4545()) {
			if (local46.anInt1076 == local10.anInt1076 && local46.anInt1077 < 0 && local46 != local10) {
				local10.anInt1077 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!vm;Lclient!qs;Lclient!fp;II)Z")
	public synchronized boolean method5320(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class1_Sub18 arg2) {
		arg2.method1951();
		@Pc(7) boolean local7 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class1_Sub42 local27 = (Class1_Sub42) arg2.aClass38_10.method767(); local27 != null; local27 = (Class1_Sub42) arg2.aClass38_10.method773()) {
			@Pc(32) int local32 = (int) local27.aLong228;
			@Pc(40) Class1_Sub20 local40 = (Class1_Sub20) this.aClass38_35.method765((long) local32);
			if (local40 == null) {
				local40 = Static74.method1398(arg1, local32);
				if (local40 == null) {
					local7 = false;
					continue;
				}
				this.aClass38_35.method766(local40, (long) local32);
			}
			if (!local40.method2423(local21, local27.aByteArray85, arg0)) {
				local7 = false;
			}
		}
		if (local7) {
			arg2.method1949();
		}
		return local7;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
	private void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray647[arg0] = arg1;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()Lclient!oa;")
	@Override
	public synchronized Class1_Sub19 method5807() {
		return this.aClass1_Sub19_Sub1_1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)V")
	public synchronized void method5322() {
		this.method5318();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IZ)V")
	private void method5323(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5326(-1);
		} else {
			this.method5293(-1);
		}
		this.method5300(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray645[local20] = this.anIntArray651[local20];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray649[local35] = this.anIntArray651[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)V")
	private void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray646[arg0] = arg1;
		this.anIntArray653[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
	private void method5325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	private void method5326(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub7 local10 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4548(); local10 != null; local10 = (Class1_Sub7) this.aClass1_Sub19_Sub1_1.aClass203_16.method4545()) {
			if (arg0 < 0 || local10.anInt1076 == arg0) {
				if (local10.aClass1_Sub19_Sub4_1 != null) {
					local10.aClass1_Sub19_Sub4_1.method5810(Static84.anInt2035 / 100);
					if (local10.aClass1_Sub19_Sub4_1.method5809()) {
						this.aClass1_Sub19_Sub1_1.aClass1_Sub19_Sub2_2.method3187(local10.aClass1_Sub19_Sub4_1);
					}
					local10.method788();
				}
				if (local10.anInt1077 < 0) {
					this.aClass1_Sub7ArrayArray1[local10.anInt1076][local10.anInt1072] = null;
				}
				local10.method6178();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()I")
	@Override
	public synchronized int method5808() {
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!bv;)Z")
	public boolean method5327(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aClass1_Sub19_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1077 >= 0) {
			arg0.method6178();
			if (arg0.anInt1064 > 0 && this.aClass1_Sub7ArrayArray2[arg0.anInt1076][arg0.anInt1064] == arg0) {
				this.aClass1_Sub7ArrayArray2[arg0.anInt1076][arg0.anInt1064] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)Z")
	public synchronized boolean method5328() {
		return this.aClass182_1.method4134();
	}
}
