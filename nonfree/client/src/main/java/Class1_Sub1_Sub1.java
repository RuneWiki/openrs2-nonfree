import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "Ib", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!a", name = "Jb", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!a", name = "Lb", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!a", name = "Mb", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!a", name = "Nb", descriptor = "Z")
	private boolean aBoolean8;

	@OriginalMember(owner = "client!a", name = "Ob", descriptor = "Lclient!an;")
	private Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!a", name = "Pb", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!a", name = "Qb", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
	private final int[] anIntArray4 = new int[16];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	private final int[] anIntArray6 = new int[16];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private final int anInt26 = 1000000;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
	private final int[] anIntArray1 = new int[16];

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
	public final int[] anIntArray5 = new int[16];

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	public final int[] anIntArray2 = new int[16];

	@OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
	private final int[] anIntArray3 = new int[16];

	@OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
	private int anInt54 = 256;

	@OriginalMember(owner = "client!a", name = "U", descriptor = "[I")
	private final int[] anIntArray9 = new int[16];

	@OriginalMember(owner = "client!a", name = "H", descriptor = "[I")
	private final int[] anIntArray8 = new int[16];

	@OriginalMember(owner = "client!a", name = "kb", descriptor = "[I")
	private final int[] anIntArray11 = new int[16];

	@OriginalMember(owner = "client!a", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "[[Lclient!qi;")
	private final Class1_Sub29[][] aClass1_Sub29ArrayArray1 = new Class1_Sub29[16][128];

	@OriginalMember(owner = "client!a", name = "nb", descriptor = "[[Lclient!qi;")
	private final Class1_Sub29[][] aClass1_Sub29ArrayArray2 = new Class1_Sub29[16][128];

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "[I")
	public final int[] anIntArray10 = new int[16];

	@OriginalMember(owner = "client!a", name = "yb", descriptor = "[I")
	private final int[] anIntArray12 = new int[16];

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	private final int[] anIntArray7 = new int[16];

	@OriginalMember(owner = "client!a", name = "Fb", descriptor = "[I")
	private final int[] anIntArray14 = new int[16];

	@OriginalMember(owner = "client!a", name = "zb", descriptor = "[I")
	private final int[] anIntArray13 = new int[16];

	@OriginalMember(owner = "client!a", name = "Hb", descriptor = "[I")
	private final int[] anIntArray15 = new int[16];

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "Lclient!bk;")
	private final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!a", name = "Kb", descriptor = "Lclient!rc;")
	private final Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(this);

	@OriginalMember(owner = "client!a", name = "Bb", descriptor = "Lclient!tm;")
	private final Class197 aClass197_1 = new Class197(128);

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		this.method35();
		this.method37(true);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	private void method24(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method24(local12);
			}
			return;
		}
		this.anIntArray4[arg0] = 12800;
		this.anIntArray12[arg0] = 8192;
		this.anIntArray9[arg0] = 16383;
		this.anIntArray11[arg0] = 8192;
		this.anIntArray6[arg0] = 0;
		this.anIntArray7[arg0] = 8192;
		this.method54(arg0);
		this.method31(arg0);
		this.anIntArray10[arg0] = 0;
		this.anIntArray3[arg0] = 32767;
		this.lb[arg0] = 256;
		this.anIntArray5[arg0] = 0;
		this.method56(arg0, 8192);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public synchronized Class1_Sub1 method5029() {
		return this.aClass1_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public synchronized void method26() {
		for (@Pc(7) Class1_Sub33 local7 = (Class1_Sub33) this.aClass197_1.method5161(); local7 != null; local7 = (Class1_Sub33) this.aClass197_1.method5154()) {
			local7.method4968();
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5031() {
		return 0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!qi;)Z")
	public boolean method27(@OriginalArg(1) Class1_Sub29 arg0) {
		if (arg0.aClass1_Sub1_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt5255 >= 0) {
			arg0.method5628();
			if (arg0.anInt5260 > 0 && this.aClass1_Sub29ArrayArray1[arg0.anInt5265][arg0.anInt5260] == arg0) {
				this.aClass1_Sub29ArrayArray1[arg0.anInt5265][arg0.anInt5260] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5034(@OriginalArg(0) int arg0) {
		if (this.aClass21_1.method704()) {
			@Pc(14) int local14 = this.aClass21_1.anInt956 * this.anInt26 / Static38.anInt1250;
			do {
				@Pc(23) long local23 = this.aLong5 + (long) local14 * (long) arg0;
				if (this.aLong4 - local23 >= 0L) {
					this.aLong5 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong4 + (long) local14 - this.aLong5 - 1L) / (long) local14);
				this.aLong5 += (long) local54 * (long) local14;
				this.aClass1_Sub1_Sub3_1.method5034(local54);
				arg0 -= local54;
				this.method49();
			} while (this.aClass21_1.method704());
		}
		this.aClass1_Sub1_Sub3_1.method5034(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	private void method28(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!an;ZZB)V")
	private synchronized void method29(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method34(arg2);
		this.aClass21_1.method717(arg0.aByteArray4);
		this.aLong5 = 0L;
		this.aBoolean8 = arg1;
		@Pc(24) int local24 = this.aClass21_1.method715();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass21_1.method711(local26);
			this.aClass21_1.method714(local26);
			this.aClass21_1.method710(local26);
		}
		this.anInt69 = this.aClass21_1.method709();
		this.anInt68 = this.aClass21_1.anIntArray83[this.anInt69];
		this.aLong4 = this.aClass21_1.method716(this.anInt68);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZI)V")
	private void method30(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray1[arg1]) {
			this.anIntArray1[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub29ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	private void method31(@OriginalArg(1) int arg0) {
		if ((this.anIntArray10[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub29 local19 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method410(); local19 != null; local19 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method419()) {
			if (local19.anInt5265 == arg0) {
				local19.anInt5259 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	public synchronized void method32() {
		for (@Pc(15) Class1_Sub33 local15 = (Class1_Sub33) this.aClass197_1.method5161(); local15 != null; local15 = (Class1_Sub33) this.aClass197_1.method5154()) {
			local15.method5628();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IZI)V")
	private void method33() {
		this.anIntArray13[9] = 128;
		this.anIntArray15[9] = 128;
		this.method30(128, 9);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZ)V")
	private synchronized void method34(@OriginalArg(0) boolean arg0) {
		this.aClass21_1.method705();
		this.aClass1_Sub5_1 = null;
		this.method37(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	private synchronized void method35() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray8[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BZ)V")
	private void method37(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method57(-1);
		} else {
			this.method52(-1);
		}
		this.method24(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray1[local27] = this.anIntArray13[local27];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray15[local45] = this.anIntArray13[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!qi;)I")
	private int method38(@OriginalArg(1) Class1_Sub29 arg0) {
		@Pc(14) int local14 = arg0.anInt5272 + (arg0.anInt5257 * arg0.anInt5271 >> 12);
		local14 += (this.anIntArray11[arg0.anInt5265] - 8192) * this.lb[arg0.anInt5265] >> 12;
		@Pc(35) Class173 local35 = arg0.aClass173_1;
		@Pc(61) int local61;
		if (local35.anInt5351 > 0 && (local35.anInt5354 > 0 || this.anIntArray6[arg0.anInt5265] > 0)) {
			local61 = local35.anInt5354 << 2;
			@Pc(66) int local66 = local35.anInt5360 << 1;
			if (local66 > arg0.anInt5270) {
				local61 = arg0.anInt5270 * local61 / local66;
			}
			local61 += this.anIntArray6[arg0.anInt5265] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt5261 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass1_Sub15_Sub1_1.anInt6345 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static38.anInt1250 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(ILclient!qi;)I")
	private int method39(@OriginalArg(1) Class1_Sub29 arg0) {
		if (this.anIntArray8[arg0.anInt5265] == 0) {
			return 0;
		}
		@Pc(17) Class173 local17 = arg0.aClass173_1;
		@Pc(33) int local33 = this.anIntArray9[arg0.anInt5265] * this.anIntArray4[arg0.anInt5265] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt5275 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt54 * local50 + 128 >> 8;
		local33 = this.anIntArray8[arg0.anInt5265] * local59 + 128 >> 8;
		if (local17.anInt5357 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt5357 * (double) arg0.anInt5263 * 1.953125E-5D) * (double) local33 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(127) int local127;
		@Pc(139) int local139;
		if (local17.aByteArray83 != null) {
			local101 = arg0.anInt5254;
			local109 = local17.aByteArray83[arg0.anInt5267 + 1];
			if (local17.aByteArray83.length - 2 > arg0.anInt5267) {
				local127 = (local17.aByteArray83[arg0.anInt5267] & 0xFF) << 8;
				local139 = (local17.aByteArray83[arg0.anInt5267 + 2] & 0xFF) << 8;
				local109 += (local101 - local127) * (-local109 + local17.aByteArray83[arg0.anInt5267 - -3]) / (local139 - local127);
			}
			local33 = local33 * local109 + 32 >> 6;
		}
		if (arg0.anInt5255 > 0 && local17.aByteArray82 != null) {
			local101 = arg0.anInt5255;
			local109 = local17.aByteArray82[arg0.anInt5274 + 1];
			if (arg0.anInt5274 < local17.aByteArray82.length - 2) {
				local127 = (local17.aByteArray82[arg0.anInt5274] & 0xFF) << 8;
				local139 = (local17.aByteArray82[arg0.anInt5274 + 2] & 0xFF) << 8;
				local109 += (local101 - local127) * (local17.aByteArray82[arg0.anInt5274 - -3] - local109) / (local139 - local127);
			}
			local33 = local109 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZLclient!an;)V")
	public synchronized void method40(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		this.method29(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public synchronized void method41() {
		this.method34(true);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)Z")
	public synchronized boolean method42() {
		return this.aClass21_1.method704();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
	public synchronized void method43(@OriginalArg(0) int arg0) {
		this.anInt54 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public synchronized Class1_Sub1 method5033() {
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZ)V")
	private void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray11[arg1] = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!wo;Lclient!an;IBLclient!jm;)Z")
	public synchronized boolean method45(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class1_Sub5 arg1, @OriginalArg(4) Class107 arg2) {
		arg1.method334();
		@Pc(9) boolean local9 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class1_Sub17 local31 = (Class1_Sub17) arg1.aClass197_2.method5161(); local31 != null; local31 = (Class1_Sub17) arg1.aClass197_2.method5154()) {
			@Pc(37) int local37 = (int) local31.aLong213;
			@Pc(45) Class1_Sub33 local45 = (Class1_Sub33) this.aClass197_1.method5157((long) local37);
			if (local45 == null) {
				local45 = Static262.method4653(arg0, local37);
				if (local45 == null) {
					local9 = false;
					continue;
				}
				this.aClass197_1.method5166(local45, (long) local37);
			}
			if (!local45.method4972(local25, local31.aByteArray39, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method335();
		}
		return local9;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	private void method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class1_Sub29 local21 = this.aClass1_Sub29ArrayArray2[arg2][arg0];
		if (local21 == null) {
			return;
		}
		this.aClass1_Sub29ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray10[arg2] & 0x2) == 0) {
			local21.anInt5255 = 0;
			return;
		}
		for (@Pc(45) Class1_Sub29 local45 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method410(); local45 != null; local45 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method419()) {
			if (local45.anInt5265 == local21.anInt5265 && local45.anInt5255 < 0 && local21 != local45) {
				local21.anInt5255 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
	private void method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
	public int method48() {
		return this.anInt54;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	private void method49() {
		@Pc(16) int local16 = this.anInt69;
		@Pc(19) int local19 = this.anInt68;
		@Pc(22) long local22 = this.aLong4;
		if (this.aClass1_Sub5_1 != null && this.anInt70 == local19) {
			this.method29(this.aClass1_Sub5_1, this.aBoolean8, this.aBoolean9);
			this.method49();
			return;
		}
		while (local19 == this.anInt68) {
			while (this.aClass21_1.anIntArray83[local16] == local19) {
				this.aClass21_1.method711(local16);
				@Pc(55) int local55 = this.aClass21_1.method702(local16);
				if (local55 == 1) {
					this.aClass21_1.method707();
					this.aClass21_1.method710(local16);
					if (this.aClass21_1.method712()) {
						if (this.aClass1_Sub5_1 != null) {
							this.method40(this.aBoolean8, this.aClass1_Sub5_1);
							this.method49();
							return;
						}
						if (!this.aBoolean8 || local19 == 0) {
							this.method37(true);
							this.aClass21_1.method705();
							return;
						}
						this.aClass21_1.method708(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method50(local55);
				}
				this.aClass21_1.method714(local16);
				this.aClass21_1.method710(local16);
			}
			local16 = this.aClass21_1.method709();
			local19 = this.aClass21_1.anIntArray83[local16];
			local22 = this.aClass21_1.method716(local19);
		}
		this.anInt68 = local19;
		this.aLong4 = local22;
		this.anInt69 = local16;
		if (this.aClass1_Sub5_1 != null && this.anInt70 < local19) {
			this.anInt68 = this.anInt70;
			this.anInt69 = -1;
			this.aLong4 = this.aClass21_1.method716(this.anInt68);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	private void method50(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method46(local26, local32, local20);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 > 0) {
				this.method60(local32, local26, local20);
			} else {
				this.method46(local26, 64, local20);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method28(local26, local32, local20);
		} else if (local13 == 176) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray15[local20] = (this.anIntArray15[local20] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray15[local20] = (local32 << 7) + (this.anIntArray15[local20] & 0xFFFFC07F);
			}
			if (local26 == 1) {
				this.anIntArray6[local20] = (this.anIntArray6[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 33) {
				this.anIntArray6[local20] = (this.anIntArray6[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 5) {
				this.anIntArray7[local20] = (this.anIntArray7[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 37) {
				this.anIntArray7[local20] = (this.anIntArray7[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 7) {
				this.anIntArray4[local20] = (local32 << 7) + (this.anIntArray4[local20] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray4[local20] = local32 + (this.anIntArray4[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray12[local20] = (this.anIntArray12[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray12[local20] = (this.anIntArray12[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 11) {
				this.anIntArray9[local20] = (this.anIntArray9[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 43) {
				this.anIntArray9[local20] = local32 + (this.anIntArray9[local20] & 0xFFFFFF80);
			}
			if (local26 == 64) {
				if (local32 >= 64) {
					this.anIntArray10[local20] |= 0x1;
				} else {
					this.anIntArray10[local20] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local32 >= 64) {
					this.anIntArray10[local20] |= 0x2;
				} else {
					this.method54(local20);
					this.anIntArray10[local20] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray3[local20] = (this.anIntArray3[local20] & 0x7F) + (local32 << 7);
			}
			if (local26 == 98) {
				this.anIntArray3[local20] = (this.anIntArray3[local20] & 0x3F80) + local32;
			}
			if (local26 == 101) {
				this.anIntArray3[local20] = (local32 << 7) + ((this.anIntArray3[local20] & 0x7F) + 16384);
			}
			if (local26 == 100) {
				this.anIntArray3[local20] = local32 + (this.anIntArray3[local20] & 0x3F80) + 16384;
			}
			if (local26 == 120) {
				this.method57(local20);
			}
			if (local26 == 121) {
				this.method24(local20);
			}
			if (local26 == 123) {
				this.method52(local20);
			}
			@Pc(504) int local504;
			if (local26 == 6) {
				local504 = this.anIntArray3[local20];
				if (local504 == 16384) {
					this.lb[local20] = (this.lb[local20] & 0xFFFFC07F) + (local32 << 7);
				}
			}
			if (local26 == 38) {
				local504 = this.anIntArray3[local20];
				if (local504 == 16384) {
					this.lb[local20] = local32 + (this.lb[local20] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray5[local20] = (this.anIntArray5[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 48) {
				this.anIntArray5[local20] = (this.anIntArray5[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 81) {
				if (local32 >= 64) {
					this.anIntArray10[local20] |= 0x4;
				} else {
					this.method31(local20);
					this.anIntArray10[local20] &= 0xFFFFFFFB;
				}
			}
			if (local26 == 17) {
				this.method56(local20, (this.anIntArray14[local20] & 0xFFFFC07F) + (local32 << 7));
			}
			if (local26 == 49) {
				this.method56(local20, local32 + (this.anIntArray14[local20] & 0xFFFFFF80));
			}
		} else if (local13 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method30(this.anIntArray15[local20] + local26, local20);
		} else if (local13 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method47(local20, local26);
		} else if (local13 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method44(local26, local20);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method37(true);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qi;ZI)V")
	public void method51(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) int local14 = arg0.aClass1_Sub15_Sub1_1.aByteArray92.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass1_Sub15_Sub1_1.aBoolean619) {
			@Pc(44) int local44 = local14 + local14 - arg0.aClass1_Sub15_Sub1_1.anInt6346;
			local33 = (int) ((long) this.anIntArray5[arg0.anInt5265] * (long) local44 >> 6);
			local14 <<= 0x8;
			if (local14 <= local33) {
				local33 = local14 + local14 - local33 - 1;
				arg0.aClass1_Sub1_Sub2_3.method4037();
			}
		} else {
			local33 = (int) ((long) this.anIntArray5[arg0.anInt5265] * (long) local14 >> 6);
		}
		arg0.aClass1_Sub1_Sub2_3.method4059(local33);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IB)V")
	private void method52(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub29 local12 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method410(); local12 != null; local12 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method419()) {
			if ((arg0 < 0 || arg0 == local12.anInt5265) && local12.anInt5255 < 0) {
				this.aClass1_Sub29ArrayArray2[local12.anInt5265][local12.anInt5264] = null;
				local12.anInt5255 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!qi;)I")
	private int method53(@OriginalArg(1) Class1_Sub29 arg0) {
		@Pc(14) int local14 = this.anIntArray12[arg0.anInt5265];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt5258) * (16384 - local14) + 32 >> 6) : local14 * arg0.anInt5258 + 32 >> 6;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5028(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass21_1.method704()) {
			@Pc(14) int local14 = this.aClass21_1.anInt956 * this.anInt26 / Static38.anInt1250;
			do {
				@Pc(23) long local23 = this.aLong5 + (long) arg2 * (long) local14;
				if (this.aLong4 - local23 >= 0L) {
					this.aLong5 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong4 - this.aLong5 - 1L) / (long) local14);
				this.aLong5 += (long) local52 * (long) local14;
				this.aClass1_Sub1_Sub3_1.method5028(arg0, arg1, local52);
				arg1 += local52;
				arg2 -= local52;
				this.method49();
			} while (this.aClass21_1.method704());
		}
		this.aClass1_Sub1_Sub3_1.method5028(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)V")
	private void method54(@OriginalArg(0) int arg0) {
		if ((this.anIntArray10[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub29 local19 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method410(); local19 != null; local19 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method419()) {
			if (arg0 == local19.anInt5265 && this.aClass1_Sub29ArrayArray2[arg0][local19.anInt5264] == null && local19.anInt5255 < 0) {
				local19.anInt5255 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!qi;B[II)Z")
	public boolean method55(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt5253 = Static38.anInt1250 / 100;
		if (arg1.anInt5255 >= 0 && (arg1.aClass1_Sub1_Sub2_3 == null || arg1.aClass1_Sub1_Sub2_3.method4054())) {
			arg1.method4605();
			arg1.method5628();
			if (arg1.anInt5260 > 0 && arg1 == this.aClass1_Sub29ArrayArray1[arg1.anInt5265][arg1.anInt5260]) {
				this.aClass1_Sub29ArrayArray1[arg1.anInt5265][arg1.anInt5260] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg1.anInt5271;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray7[arg1.anInt5265] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg1.anInt5271 = local59;
		}
		arg1.aClass1_Sub1_Sub2_3.method4022(this.method38(arg1));
		@Pc(104) Class173 local104 = arg1.aClass173_1;
		arg1.anInt5270++;
		@Pc(112) boolean local112 = false;
		arg1.anInt5261 += local104.anInt5351;
		@Pc(137) double local137 = (double) ((arg1.anInt5264 - 60 << 8) + (arg1.anInt5271 * arg1.anInt5257 >> 12)) * 5.086263020833333E-6D;
		if (local104.anInt5357 > 0) {
			if (local104.anInt5353 > 0) {
				arg1.anInt5263 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt5353) * 128.0D + 0.5D);
			} else {
				arg1.anInt5263 += 128;
			}
			if (arg1.anInt5263 * local104.anInt5357 >= 819200) {
				local112 = true;
			}
		}
		if (local104.aByteArray83 != null) {
			if (local104.anInt5356 <= 0) {
				arg1.anInt5254 += 128;
			} else {
				arg1.anInt5254 += (int) (Math.pow(2.0D, (double) local104.anInt5356 * local137) * 128.0D + 0.5D);
			}
			while (local104.aByteArray83.length - 2 > arg1.anInt5267 && (local104.aByteArray83[arg1.anInt5267 + 2] & 0xFF) << 8 < arg1.anInt5254) {
				arg1.anInt5267 += 2;
			}
			if (local104.aByteArray83.length - 2 == arg1.anInt5267 && local104.aByteArray83[arg1.anInt5267 + 1] == 0) {
				local112 = true;
			}
		}
		if (arg1.anInt5255 >= 0 && local104.aByteArray82 != null && (this.anIntArray10[arg1.anInt5265] & 0x1) == 0 && (arg1.anInt5260 < 0 || arg1 != this.aClass1_Sub29ArrayArray1[arg1.anInt5265][arg1.anInt5260])) {
			if (local104.anInt5359 > 0) {
				arg1.anInt5255 += (int) (Math.pow(2.0D, (double) local104.anInt5359 * local137) * 128.0D + 0.5D);
			} else {
				arg1.anInt5255 += 128;
			}
			while (local104.aByteArray82.length - 2 > arg1.anInt5274 && arg1.anInt5255 > (local104.aByteArray82[arg1.anInt5274 + 2] & 0xFF) << 8) {
				arg1.anInt5274 += 2;
			}
			if (arg1.anInt5274 == local104.aByteArray82.length - 2) {
				local112 = true;
			}
		}
		if (!local112) {
			arg1.aClass1_Sub1_Sub2_3.method4043(arg1.anInt5253, this.method39(arg1), this.method53(arg1));
			return false;
		}
		arg1.aClass1_Sub1_Sub2_3.method4032(arg1.anInt5253);
		if (arg2 == null) {
			arg1.aClass1_Sub1_Sub2_3.method5034(arg0);
		} else {
			arg1.aClass1_Sub1_Sub2_3.method5028(arg2, arg3, arg0);
		}
		if (arg1.aClass1_Sub1_Sub2_3.method4026()) {
			this.aClass1_Sub1_Sub3_1.aClass1_Sub1_Sub4_2.method5040(arg1.aClass1_Sub1_Sub2_3);
		}
		arg1.method4605();
		if (arg1.anInt5255 >= 0) {
			arg1.method5628();
			if (arg1.anInt5260 > 0 && arg1 == this.aClass1_Sub29ArrayArray1[arg1.anInt5265][arg1.anInt5260]) {
				this.aClass1_Sub29ArrayArray1[arg1.anInt5265][arg1.anInt5260] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(III)V")
	private void method56(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray14[arg0] = arg1;
		this.anIntArray2[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(II)V")
	private void method57(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub29 local10 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method410(); local10 != null; local10 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method419()) {
			if (arg0 < 0 || arg0 == local10.anInt5265) {
				if (local10.aClass1_Sub1_Sub2_3 != null) {
					local10.aClass1_Sub1_Sub2_3.method4032(Static38.anInt1250 / 100);
					if (local10.aClass1_Sub1_Sub2_3.method4026()) {
						this.aClass1_Sub1_Sub3_1.aClass1_Sub1_Sub4_2.method5040(local10.aClass1_Sub1_Sub2_3);
					}
					local10.method4605();
				}
				if (local10.anInt5255 < 0) {
					this.aClass1_Sub29ArrayArray2[local10.anInt5265][local10.anInt5264] = null;
				}
				local10.method5628();
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
	public synchronized void method58() {
		this.method33();
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIII)V")
	private void method60(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method46(arg1, 64, arg2);
		if ((this.anIntArray10[arg2] & 0x2) != 0) {
			for (@Pc(29) Class1_Sub29 local29 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method420(); local29 != null; local29 = (Class1_Sub29) this.aClass1_Sub1_Sub3_1.aClass16_29.method409()) {
				if (arg2 == local29.anInt5265 && local29.anInt5255 < 0) {
					this.aClass1_Sub29ArrayArray2[arg2][local29.anInt5264] = null;
					this.aClass1_Sub29ArrayArray2[arg2][arg1] = local29;
					@Pc(67) int local67 = local29.anInt5272 + (local29.anInt5271 * local29.anInt5257 >> 12);
					local29.anInt5272 += arg1 - local29.anInt5264 << 8;
					local29.anInt5271 = 4096;
					local29.anInt5264 = arg1;
					local29.anInt5257 = local67 - local29.anInt5272;
					return;
				}
			}
		}
		@Pc(113) Class1_Sub33 local113 = (Class1_Sub33) this.aClass197_1.method5157((long) this.anIntArray1[arg2]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class1_Sub15_Sub1 local121 = local113.aClass1_Sub15_Sub1Array1[arg1];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class1_Sub29 local128 = new Class1_Sub29();
		local128.aClass1_Sub15_Sub1_1 = local121;
		local128.anInt5265 = arg2;
		local128.aClass1_Sub33_1 = local113;
		local128.aClass173_1 = local113.aClass173Array1[arg1];
		local128.anInt5260 = local113.aByteArray90[arg1];
		local128.anInt5264 = arg1;
		local128.anInt5275 = local113.aByteArray88[arg1] * local113.anInt5810 * arg0 * arg0 + 1024 >> 11;
		local128.anInt5258 = local113.aByteArray89[arg1] & 0xFF;
		local128.anInt5272 = (arg1 << 8) - (local113.aShortArray114[arg1] & 0x7FFF);
		local128.anInt5254 = 0;
		local128.anInt5274 = 0;
		local128.anInt5263 = 0;
		local128.anInt5267 = 0;
		local128.anInt5255 = -1;
		if (this.anIntArray5[arg2] == 0) {
			local128.aClass1_Sub1_Sub2_3 = Static370.method4039(local121, this.method38(local128), this.method39(local128), this.method53(local128));
		} else {
			local128.aClass1_Sub1_Sub2_3 = Static370.method4039(local121, this.method38(local128), 0, this.method53(local128));
			this.method51(local128, local113.aShortArray114[arg1] < 0);
		}
		if (local113.aShortArray114[arg1] < 0) {
			local128.aClass1_Sub1_Sub2_3.method4049(-1);
		}
		if (local128.anInt5260 >= 0) {
			@Pc(278) Class1_Sub29 local278 = this.aClass1_Sub29ArrayArray1[arg2][local128.anInt5260];
			if (local278 != null && local278.anInt5255 < 0) {
				this.aClass1_Sub29ArrayArray2[arg2][local278.anInt5264] = null;
				local278.anInt5255 = 0;
			}
			this.aClass1_Sub29ArrayArray1[arg2][local128.anInt5260] = local128;
		}
		this.aClass1_Sub1_Sub3_1.aClass16_29.method416(local128);
		this.aClass1_Sub29ArrayArray2[arg2][arg1] = local128;
	}
}
