import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub33_Sub3 extends Class3_Sub33 {

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "Lclient!qd;")
	public static Class302 lb;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "J")
	private long aLong306;

	@OriginalMember(owner = "client!te", name = "vb", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	private int anInt9344;

	@OriginalMember(owner = "client!te", name = "Db", descriptor = "I")
	private int anInt9345;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "J")
	private long aLong307;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "I")
	private int anInt9346;

	@OriginalMember(owner = "client!te", name = "Kb", descriptor = "Z")
	private boolean aBoolean619;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Lclient!bc;")
	private Class3_Sub8 aClass3_Sub8_4;

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "[I")
	private final int[] anIntArray673 = new int[16];

	@OriginalMember(owner = "client!te", name = "yb", descriptor = "[I")
	public final int[] anIntArray674 = new int[16];

	@OriginalMember(owner = "client!te", name = "pb", descriptor = "[I")
	private final int[] anIntArray678 = new int[16];

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "[I")
	public final int[] anIntArray679 = new int[16];

	@OriginalMember(owner = "client!te", name = "Ib", descriptor = "[[Lclient!wea;")
	private final Class3_Sub58[][] aClass3_Sub58ArrayArray1 = new Class3_Sub58[16][128];

	@OriginalMember(owner = "client!te", name = "R", descriptor = "[I")
	private final int[] anIntArray681 = new int[16];

	@OriginalMember(owner = "client!te", name = "tb", descriptor = "[I")
	private final int[] anIntArray680 = new int[16];

	@OriginalMember(owner = "client!te", name = "C", descriptor = "[I")
	private final int[] anIntArray683 = new int[16];

	@OriginalMember(owner = "client!te", name = "D", descriptor = "[[Lclient!wea;")
	private final Class3_Sub58[][] aClass3_Sub58ArrayArray2 = new Class3_Sub58[16][128];

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	private int anInt9300 = 256;

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
	private final int[] anIntArray682 = new int[16];

	@OriginalMember(owner = "client!te", name = "u", descriptor = "[I")
	private final int[] anIntArray684 = new int[16];

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
	private final int anInt9334 = 1000000;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "[I")
	private final int[] anIntArray675 = new int[16];

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "[I")
	private final int[] anIntArray676 = new int[16];

	@OriginalMember(owner = "client!te", name = "J", descriptor = "[I")
	private final int[] anIntArray685 = new int[16];

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[I")
	private final int[] anIntArray677 = new int[16];

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "[I")
	private final int[] anIntArray686 = new int[16];

	@OriginalMember(owner = "client!te", name = "y", descriptor = "[I")
	public final int[] anIntArray687 = new int[16];

	@OriginalMember(owner = "client!te", name = "x", descriptor = "[I")
	private final int[] anIntArray688 = new int[16];

	@OriginalMember(owner = "client!te", name = "T", descriptor = "Lclient!rea;")
	private final Class324 aClass324_1 = new Class324();

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "Lclient!oca;")
	private final Class3_Sub33_Sub2 aClass3_Sub33_Sub2_1 = new Class3_Sub33_Sub2(this);

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Lclient!qn;")
	private final Class313 aClass313_43;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class3_Sub33_Sub3() {
		this.aClass313_43 = new Class313(128);
		this.method7912(256, -1);
		this.method7886(true);
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class3_Sub33_Sub3(@OriginalArg(0) Class3_Sub33_Sub3 arg0) {
		this.aClass313_43 = arg0.aClass313_43;
		this.method7912(256, -1);
		this.method7886(true);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(III)V")
	private void method7880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray673[arg1] = arg0;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)V")
	private void method7881(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method7881(local9);
			}
			return;
		}
		this.anIntArray675[arg0] = 12800;
		this.anIntArray683[arg0] = 8192;
		this.anIntArray684[arg0] = 16383;
		this.anIntArray673[arg0] = 8192;
		this.anIntArray685[arg0] = 0;
		this.anIntArray682[arg0] = 8192;
		this.method7897(arg0);
		this.method7902(arg0);
		this.anIntArray687[arg0] = 0;
		this.anIntArray676[arg0] = 32767;
		this.anIntArray678[arg0] = 256;
		this.anIntArray679[arg0] = 0;
		this.method7892(arg0, 8192);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
	private void method7882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	private void method7883() {
		@Pc(8) int local8 = this.anInt9344;
		@Pc(16) int local16 = this.anInt9345;
		@Pc(19) long local19 = this.aLong306;
		if (this.aClass3_Sub8_4 != null && local16 == this.anInt9346) {
			this.method7896(this.aClass3_Sub8_4, this.aBoolean619, this.aBoolean618);
			this.method7883();
			return;
		}
		while (local16 == this.anInt9345) {
			while (this.aClass324_1.anIntArray616[local8] == local16) {
				this.aClass324_1.method7255(local8);
				@Pc(51) int local51 = this.aClass324_1.method7250(local8);
				if (local51 == 1) {
					this.aClass324_1.method7248();
					this.aClass324_1.method7254(local8);
					if (this.aClass324_1.method7252()) {
						if (this.aClass3_Sub8_4 != null) {
							this.method7911(this.aClass3_Sub8_4, this.aBoolean618);
							this.method7883();
							return;
						}
						if (!this.aBoolean618 || local16 == 0) {
							this.method7886(true);
							this.aClass324_1.method7261();
							return;
						}
						this.aClass324_1.method7246(local19);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method7901(local51);
				}
				this.aClass324_1.method7249(local8);
				this.aClass324_1.method7254(local8);
			}
			local8 = this.aClass324_1.method7251();
			local16 = this.aClass324_1.anIntArray616[local8];
			local19 = this.aClass324_1.method7253(local16);
		}
		this.aLong306 = local19;
		this.anInt9345 = local16;
		this.anInt9344 = local8;
		if (this.aClass3_Sub8_4 != null && local16 > this.anInt9346) {
			this.anInt9345 = this.anInt9346;
			this.anInt9344 = -1;
			this.aLong306 = this.aClass324_1.method7253(this.anInt9345);
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	public synchronized void method7884() {
		this.method7891(true);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IZ)V")
	private void method7886(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method7917(-1);
		} else {
			this.method7916(-1);
		}
		this.method7881(-1);
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray677[local35] = this.anIntArray680[local35];
		}
		for (@Pc(55) int local55 = 0; local55 < 16; local55++) {
			this.anIntArray681[local55] = this.anIntArray680[local55] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IZ)V")
	public synchronized void method7887(@OriginalArg(0) int arg0) {
		this.anInt9300 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(III)V")
	public synchronized void method7888() {
		this.method7918();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)V")
	private void method7889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7905(64, arg1, arg0);
		if ((this.anIntArray687[arg1] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub58 local28 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7656(); local28 != null; local28 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7649()) {
				if (arg1 == local28.anInt11075 && local28.anInt11085 < 0) {
					this.aClass3_Sub58ArrayArray2[arg1][local28.anInt11087] = null;
					this.aClass3_Sub58ArrayArray2[arg1][arg0] = local28;
					@Pc(74) int local74 = local28.anInt11068 + (local28.anInt11084 * local28.anInt11070 >> 12);
					local28.anInt11068 += arg0 - local28.anInt11087 << 8;
					local28.anInt11087 = arg0;
					local28.anInt11084 = 4096;
					local28.anInt11070 = local74 - local28.anInt11068;
					return;
				}
			}
		}
		@Pc(124) Class3_Sub46 local124 = (Class3_Sub46) this.aClass313_43.method7104((long) this.anIntArray677[arg1]);
		if (local124 == null) {
			return;
		}
		@Pc(133) Class3_Sub34_Sub1 local133 = local124.aClass3_Sub34_Sub1Array1[arg0];
		if (local133 == null) {
			return;
		}
		@Pc(141) Class3_Sub58 local141 = new Class3_Sub58();
		local141.aClass3_Sub46_1 = local124;
		local141.anInt11075 = arg1;
		local141.aClass3_Sub34_Sub1_4 = local133;
		local141.aClass206_1 = local124.aClass206Array1[arg0];
		local141.anInt11073 = local124.aByteArray74[arg0];
		local141.anInt11087 = arg0;
		local141.anInt11079 = local124.aByteArray76[arg0] * local124.anInt7528 * arg2 * arg2 + 1024 >> 11;
		local141.anInt11069 = local124.aByteArray75[arg0] & 0xFF;
		local141.anInt11068 = (arg0 << 8) - (local124.aShortArray103[arg0] & 0x7FFF);
		local141.anInt11080 = 0;
		local141.anInt11083 = 0;
		local141.anInt11082 = 0;
		local141.anInt11076 = 0;
		local141.anInt11085 = -1;
		if (this.anIntArray679[arg1] == 0) {
			local141.aClass3_Sub33_Sub5_4 = Static737.method8739(local133, this.method7895(local141), this.method7899(local141), this.method7900(local141));
		} else {
			local141.aClass3_Sub33_Sub5_4 = Static737.method8739(local133, this.method7895(local141), 0, this.method7900(local141));
			this.method7898(local141, local124.aShortArray103[arg0] < 0);
		}
		if (local124.aShortArray103[arg0] < 0) {
			local141.aClass3_Sub33_Sub5_4.method8730(-1);
		}
		if (local141.anInt11073 >= 0) {
			@Pc(301) Class3_Sub58 local301 = this.aClass3_Sub58ArrayArray1[arg1][local141.anInt11073];
			if (local301 != null && local301.anInt11085 < 0) {
				this.aClass3_Sub58ArrayArray2[arg1][local301.anInt11087] = null;
				local301.anInt11085 = 0;
			}
			this.aClass3_Sub58ArrayArray1[arg1][local141.anInt11073] = local141;
		}
		this.aClass3_Sub33_Sub2_1.aClass342_57.method7654(local141);
		this.aClass3_Sub58ArrayArray2[arg1][arg0] = local141;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)V")
	private void method7890(@OriginalArg(1) long arg0) {
		while (this.aLong306 <= arg0) {
			@Pc(15) int local15 = this.anInt9344;
			@Pc(18) int local18 = this.anInt9345;
			@Pc(21) long local21 = this.aLong306;
			while (local18 == this.anInt9345) {
				while (this.aClass324_1.anIntArray616[local15] == local18) {
					this.aClass324_1.method7255(local15);
					@Pc(34) int local34 = this.aClass324_1.method7250(local15);
					if (local34 == 1) {
						this.aClass324_1.method7248();
						this.aClass324_1.method7254(local15);
						if (this.aClass324_1.method7252()) {
							if (!this.aBoolean618 || local18 == 0) {
								this.method7886(true);
								this.aClass324_1.method7261();
								return;
							}
							this.aClass324_1.method7246(local21);
						}
						break;
					}
					if ((local34 & 0x80) != 0 && (local34 & 0xF0) != 144) {
						this.method7901(local34);
					}
					this.aClass324_1.method7249(local15);
					this.aClass324_1.method7254(local15);
				}
				this.aLong307 = local21;
				local15 = this.aClass324_1.method7251();
				local18 = this.aClass324_1.anIntArray616[local15];
				local21 = this.aClass324_1.method7253(local18);
			}
			this.anInt9345 = local18;
			this.anInt9344 = local15;
			this.aLong306 = local21;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(IZ)V")
	private synchronized void method7891(@OriginalArg(1) boolean arg0) {
		this.aClass324_1.method7261();
		this.aClass3_Sub8_4 = null;
		this.method7886(arg0);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(III)V")
	private void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray688[arg0] = arg1;
		this.anIntArray674[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZZLclient!bc;JZ)V")
	public synchronized void method7893(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub8 arg1, @OriginalArg(3) long arg2) {
		this.method7896(arg1, true, arg0);
		this.method7890(arg2 * (long) this.aClass324_1.anInt8497);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	private void method7894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8710(@OriginalArg(0) int arg0) {
		if (this.aClass324_1.method7247()) {
			@Pc(18) int local18 = this.anInt9334 * this.aClass324_1.anInt8497 / Static330.anInt9773;
			do {
				@Pc(27) long local27 = this.aLong307 + (long) arg0 * (long) local18;
				if (this.aLong306 - local27 >= 0L) {
					this.aLong307 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong306 - this.aLong307 - 1L) / (long) local18);
				this.aLong307 += (long) local56 * (long) local18;
				this.aClass3_Sub33_Sub2_1.method8710(local56);
				arg0 -= local56;
				this.method7883();
			} while (this.aClass324_1.method7247());
		}
		this.aClass3_Sub33_Sub2_1.method8710(arg0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()Lclient!oga;")
	@Override
	public synchronized Class3_Sub33 method8708() {
		return null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!wea;Z)I")
	private int method7895(@OriginalArg(0) Class3_Sub58 arg0) {
		@Pc(21) int local21 = arg0.anInt11068 + (arg0.anInt11084 * arg0.anInt11070 >> 12);
		local21 += (this.anIntArray673[arg0.anInt11075] - 8192) * this.anIntArray678[arg0.anInt11075] >> 12;
		@Pc(42) Class206 local42 = arg0.aClass206_1;
		@Pc(66) int local66;
		if (local42.anInt5384 > 0 && (local42.anInt5389 > 0 || this.anIntArray685[arg0.anInt11075] > 0)) {
			local66 = local42.anInt5389 << 2;
			@Pc(71) int local71 = local42.anInt5385 << 1;
			if (arg0.anInt11071 < local71) {
				local66 = arg0.anInt11071 * local66 / local71;
			}
			local66 += this.anIntArray685[arg0.anInt11075] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt11074 & 0x1FF) * 0.01227184630308513D);
			local21 += (int) (local101 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass3_Sub34_Sub1_4.anInt11127 * 256) * Math.pow(2.0D, (double) local21 * 3.255208333333333E-4D) / (double) Static330.anInt9773 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!bc;ZZ)V")
	private synchronized void method7896(@OriginalArg(1) Class3_Sub8 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method7891(arg1);
		this.aClass324_1.method7259(arg0.aByteArray19);
		this.aLong307 = 0L;
		this.aBoolean618 = arg2;
		@Pc(24) int local24 = this.aClass324_1.method7258();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass324_1.method7255(local34);
			this.aClass324_1.method7249(local34);
			this.aClass324_1.method7254(local34);
		}
		this.anInt9344 = this.aClass324_1.method7251();
		this.anInt9345 = this.aClass324_1.anIntArray616[this.anInt9344];
		this.aLong306 = this.aClass324_1.method7253(this.anInt9345);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	private void method7897(@OriginalArg(0) int arg0) {
		if ((this.anIntArray687[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class3_Sub58 local27 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7644(); local27 != null; local27 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7650()) {
			if (arg0 == local27.anInt11075 && this.aClass3_Sub58ArrayArray2[arg0][local27.anInt11087] == null && local27.anInt11085 < 0) {
				local27.anInt11085 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!wea;ZB)V")
	public void method7898(@OriginalArg(0) Class3_Sub58 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub34_Sub1_4.aByteArray109.length;
		@Pc(29) int local29;
		if (arg1 && arg0.aClass3_Sub34_Sub1_4.aBoolean753) {
			@Pc(40) int local40 = local8 + local8 - arg0.aClass3_Sub34_Sub1_4.anInt11126;
			local29 = (int) ((long) local40 * (long) this.anIntArray679[arg0.anInt11075] >> 6);
			local8 <<= 0x8;
			if (local29 >= local8) {
				local29 = local8 + local8 - local29 - 1;
				arg0.aClass3_Sub33_Sub5_4.method8716();
			}
		} else {
			local29 = (int) ((long) this.anIntArray679[arg0.anInt11075] * (long) local8 >> 6);
		}
		arg0.aClass3_Sub33_Sub5_4.method8736(local29);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "()Lclient!oga;")
	@Override
	public synchronized Class3_Sub33 method8706() {
		return this.aClass3_Sub33_Sub2_1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!wea;B)I")
	private int method7899(@OriginalArg(0) Class3_Sub58 arg0) {
		if (this.anIntArray686[arg0.anInt11075] == 0) {
			return 0;
		}
		@Pc(25) Class206 local25 = arg0.aClass206_1;
		@Pc(41) int local41 = this.anIntArray684[arg0.anInt11075] * this.anIntArray675[arg0.anInt11075] + 4096 >> 13;
		@Pc(49) int local49 = local41 * local41 + 16384 >> 15;
		@Pc(58) int local58 = arg0.anInt11079 * local49 + 16384 >> 15;
		@Pc(67) int local67 = this.anInt9300 * local58 + 128 >> 8;
		local41 = this.anIntArray686[arg0.anInt11075] * local67 + 128 >> 8;
		if (local25.anInt5391 > 0) {
			local41 = (int) (Math.pow(0.5D, (double) arg0.anInt11082 * 1.953125E-5D * (double) local25.anInt5391) * (double) local41 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local25.aByteArray51 != null) {
			local106 = arg0.anInt11080;
			local114 = local25.aByteArray51[arg0.anInt11083 + 1];
			if (local25.aByteArray51.length - 2 > arg0.anInt11083) {
				local136 = (local25.aByteArray51[arg0.anInt11083] & 0xFF) << 8;
				local148 = (local25.aByteArray51[arg0.anInt11083 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local25.aByteArray51[arg0.anInt11083 + 3]) / (local148 - local136);
			}
			local41 = local41 * local114 + 32 >> 6;
		}
		if (arg0.anInt11085 > 0 && local25.aByteArray52 != null) {
			local106 = arg0.anInt11085;
			local114 = local25.aByteArray52[arg0.anInt11076 + 1];
			if (arg0.anInt11076 < local25.aByteArray52.length - 2) {
				local136 = (local25.aByteArray52[arg0.anInt11076] & 0xFF) << 8;
				local148 = (local25.aByteArray52[arg0.anInt11076 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local25.aByteArray52[arg0.anInt11076 + 3]) / (local148 - local136);
			}
			local41 = local41 * local114 + 32 >> 6;
		}
		return local41;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(ILclient!wea;)I")
	private int method7900(@OriginalArg(1) Class3_Sub58 arg0) {
		@Pc(15) int local15 = this.anIntArray683[arg0.anInt11075];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt11069) * (-local15 + 16384) + 32 >> 6) : local15 * arg0.anInt11069 - -32 >> 6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V")
	private void method7901(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method7905(local28, local16, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method7889(local22, local16, local28);
			} else {
				this.method7905(64, local16, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method7894(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray681[local16] = (local28 << 14) + (this.anIntArray681[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray681[local16] = (local28 << 7) + (this.anIntArray681[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray685[local16] = (local28 << 7) + (this.anIntArray685[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray685[local16] = local28 + (this.anIntArray685[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray682[local16] = (local28 << 7) + (this.anIntArray682[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray682[local16] = (this.anIntArray682[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray675[local16] = (local28 << 7) + (this.anIntArray675[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray675[local16] = (this.anIntArray675[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray683[local16] = (this.anIntArray683[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray683[local16] = local28 + (this.anIntArray683[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray684[local16] = (this.anIntArray684[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray684[local16] = local28 + (this.anIntArray684[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray687[local16] |= 0x1;
				} else {
					this.anIntArray687[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray687[local16] |= 0x2;
				} else {
					this.method7897(local16);
					this.anIntArray687[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray676[local16] = (this.anIntArray676[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray676[local16] = (this.anIntArray676[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray676[local16] = (local28 << 7) + (this.anIntArray676[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray676[local16] = (this.anIntArray676[local16] & 0x3F80) + (local28 + 16384);
			}
			if (local22 == 120) {
				this.method7917(local16);
			}
			if (local22 == 121) {
				this.method7881(local16);
			}
			if (local22 == 123) {
				this.method7916(local16);
			}
			@Pc(550) int local550;
			if (local22 == 6) {
				local550 = this.anIntArray676[local16];
				if (local550 == 16384) {
					this.anIntArray678[local16] = (this.anIntArray678[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local550 = this.anIntArray676[local16];
				if (local550 == 16384) {
					this.anIntArray678[local16] = local28 + (this.anIntArray678[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray679[local16] = (this.anIntArray679[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray679[local16] = local28 + (this.anIntArray679[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method7902(local16);
					this.anIntArray687[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray687[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method7892(local16, (this.anIntArray688[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method7892(local16, local28 + (this.anIntArray688[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method7914(local28 + this.anIntArray681[local22], local22);
		} else if (local9 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method7882(local28, local22);
		} else if (local9 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F000F) >> 9);
			this.method7880(local28, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7886(true);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
	private void method7902(@OriginalArg(0) int arg0) {
		if ((this.anIntArray687[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub58 local18 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7644(); local18 != null; local18 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7650()) {
			if (arg0 == local18.anInt11075) {
				local18.anInt11072 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)I")
	public int method7903() {
		return this.anInt9300;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public synchronized void method7904() {
		for (@Pc(15) Class3_Sub46 local15 = (Class3_Sub46) this.aClass313_43.method7103(); local15 != null; local15 = (Class3_Sub46) this.aClass313_43.method7110()) {
			local15.method6506();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V")
	private void method7905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub58 local12 = this.aClass3_Sub58ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub58ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray687[arg1] & 0x2) == 0) {
			local12.anInt11085 = 0;
			return;
		}
		for (@Pc(47) Class3_Sub58 local47 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7644(); local47 != null; local47 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7650()) {
			if (local12.anInt11075 == local47.anInt11075 && local47.anInt11085 < 0 && local47 != local12) {
				local12.anInt11085 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass324_1.method7247()) {
			@Pc(18) int local18 = this.aClass324_1.anInt8497 * this.anInt9334 / Static330.anInt9773;
			do {
				@Pc(28) long local28 = this.aLong307 + (long) local18 * (long) arg2;
				if (this.aLong306 - local28 >= 0L) {
					this.aLong307 = local28;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong306 + (long) local18 - this.aLong307 - 1L) / (long) local18);
				this.aLong307 += (long) local59 * (long) local18;
				this.aClass3_Sub33_Sub2_1.method8709(arg0, arg1, local59);
				arg1 += local59;
				arg2 -= local59;
				this.method7883();
			} while (this.aClass324_1.method7247());
		}
		this.aClass3_Sub33_Sub2_1.method8709(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!wea;I[II)Z")
	public boolean method7908(@OriginalArg(1) Class3_Sub58 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt11077 = Static330.anInt9773 / 100;
		if (arg0.anInt11085 >= 0 && (arg0.aClass3_Sub33_Sub5_4 == null || arg0.aClass3_Sub33_Sub5_4.method8732())) {
			arg0.method9437();
			arg0.method9596();
			if (arg0.anInt11073 > 0 && arg0 == this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073]) {
				this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073] = null;
			}
			return true;
		}
		@Pc(75) int local75 = arg0.anInt11084;
		if (local75 > 0) {
			local75 -= (int) (Math.pow(2.0D, (double) this.anIntArray682[arg0.anInt11075] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local75 < 0) {
				local75 = 0;
			}
			arg0.anInt11084 = local75;
		}
		arg0.aClass3_Sub33_Sub5_4.method8727(this.method7895(arg0));
		@Pc(115) Class206 local115 = arg0.aClass206_1;
		arg0.anInt11074 += local115.anInt5384;
		arg0.anInt11071++;
		@Pc(130) boolean local130 = false;
		@Pc(148) double local148 = (double) ((arg0.anInt11087 - 60 << 8) + (arg0.anInt11070 * arg0.anInt11084 >> 12)) * 5.086263020833333E-6D;
		if (local115.anInt5391 > 0) {
			if (local115.anInt5390 <= 0) {
				arg0.anInt11082 += 128;
			} else {
				arg0.anInt11082 += (int) (Math.pow(2.0D, (double) local115.anInt5390 * local148) * 128.0D + 0.5D);
			}
			if (local115.anInt5391 * arg0.anInt11082 >= 819200) {
				local130 = true;
			}
		}
		if (local115.aByteArray51 != null) {
			if (local115.anInt5386 <= 0) {
				arg0.anInt11080 += 128;
			} else {
				arg0.anInt11080 += (int) (Math.pow(2.0D, local148 * (double) local115.anInt5386) * 128.0D + 0.5D);
			}
			while (local115.aByteArray51.length - 2 > arg0.anInt11083 && (local115.aByteArray51[arg0.anInt11083 + 2] & 0xFF) << 8 < arg0.anInt11080) {
				arg0.anInt11083 += 2;
			}
			if (arg0.anInt11083 == local115.aByteArray51.length - 2 && local115.aByteArray51[arg0.anInt11083 + 1] == 0) {
				local130 = true;
			}
		}
		if (arg0.anInt11085 >= 0 && local115.aByteArray52 != null && (this.anIntArray687[arg0.anInt11075] & 0x1) == 0 && (arg0.anInt11073 < 0 || arg0 != this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073])) {
			if (local115.anInt5387 > 0) {
				arg0.anInt11085 += (int) (Math.pow(2.0D, (double) local115.anInt5387 * local148) * 128.0D + 0.5D);
			} else {
				arg0.anInt11085 += 128;
			}
			while (local115.aByteArray52.length - 2 > arg0.anInt11076 && arg0.anInt11085 > (local115.aByteArray52[arg0.anInt11076 + 2] & 0xFF) << 8) {
				arg0.anInt11076 += 2;
			}
			if (arg0.anInt11076 == local115.aByteArray52.length - 2) {
				local130 = true;
			}
		}
		if (!local130) {
			arg0.aClass3_Sub33_Sub5_4.method8729(arg0.anInt11077, this.method7899(arg0), this.method7900(arg0));
			return false;
		}
		arg0.aClass3_Sub33_Sub5_4.method8735(arg0.anInt11077);
		if (arg2 == null) {
			arg0.aClass3_Sub33_Sub5_4.method8710(arg3);
		} else {
			arg0.aClass3_Sub33_Sub5_4.method8709(arg2, arg1, arg3);
		}
		if (arg0.aClass3_Sub33_Sub5_4.method8714()) {
			this.aClass3_Sub33_Sub2_1.aClass3_Sub33_Sub4_2.method8545(arg0.aClass3_Sub33_Sub5_4);
		}
		arg0.method9437();
		if (arg0.anInt11085 >= 0) {
			arg0.method9596();
			if (arg0.anInt11073 > 0 && arg0 == this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073]) {
				this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!bc;Lclient!gh;ILclient!ik;)Z")
	public synchronized boolean method7909(@OriginalArg(1) Class3_Sub8 arg0, @OriginalArg(2) Class138 arg1, @OriginalArg(4) Class182 arg2) {
		arg0.method1123();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class3_Sub45 local27 = (Class3_Sub45) arg0.aClass313_5.method7103(); local27 != null; local27 = (Class3_Sub45) arg0.aClass313_5.method7110()) {
			@Pc(35) int local35 = (int) local27.aLong345;
			@Pc(43) Class3_Sub46 local43 = (Class3_Sub46) this.aClass313_43.method7104((long) local35);
			if (local43 == null) {
				local43 = Static491.method6651(arg2, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass313_43.method7107((long) local35, local43);
			}
			if (!local43.method6505(local27.aByteArray73, arg1, local21)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1124();
		}
		return local9;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!wea;)Z")
	public boolean method7910(@OriginalArg(1) Class3_Sub58 arg0) {
		if (arg0.aClass3_Sub33_Sub5_4 != null) {
			return false;
		}
		if (arg0.anInt11085 >= 0) {
			arg0.method9596();
			if (arg0.anInt11073 > 0 && this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073] == arg0) {
				this.aClass3_Sub58ArrayArray1[arg0.anInt11075][arg0.anInt11073] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!bc;ZB)V")
	public synchronized void method7911(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		this.method7896(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public synchronized void method7912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray686[arg1] = arg0;
		} else {
			for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
				this.anIntArray686[local24] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)Z")
	public synchronized boolean method7913() {
		return this.aClass324_1.method7247();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
	@Override
	public synchronized int method8705() {
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)V")
	private void method7914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray677[arg1] != arg0) {
			this.anIntArray677[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass3_Sub58ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public synchronized void method7915() {
		for (@Pc(15) Class3_Sub46 local15 = (Class3_Sub46) this.aClass313_43.method7103(); local15 != null; local15 = (Class3_Sub46) this.aClass313_43.method7110()) {
			local15.method9596();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
	private void method7916(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class3_Sub58 local19 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7644(); local19 != null; local19 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7650()) {
			if ((arg0 < 0 || arg0 == local19.anInt11075) && local19.anInt11085 < 0) {
				this.aClass3_Sub58ArrayArray2[local19.anInt11075][local19.anInt11087] = null;
				local19.anInt11085 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(II)V")
	private void method7917(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class3_Sub58 local8 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7644(); local8 != null; local8 = (Class3_Sub58) this.aClass3_Sub33_Sub2_1.aClass342_57.method7650()) {
			if (arg0 < 0 || local8.anInt11075 == arg0) {
				if (local8.aClass3_Sub33_Sub5_4 != null) {
					local8.aClass3_Sub33_Sub5_4.method8735(Static330.anInt9773 / 100);
					if (local8.aClass3_Sub33_Sub5_4.method8714()) {
						this.aClass3_Sub33_Sub2_1.aClass3_Sub33_Sub4_2.method8545(local8.aClass3_Sub33_Sub5_4);
					}
					local8.method9437();
				}
				if (local8.anInt11085 < 0) {
					this.aClass3_Sub58ArrayArray2[local8.anInt11075][local8.anInt11087] = null;
				}
				local8.method9596();
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(III)V")
	private void method7918() {
		this.anIntArray680[9] = 128;
		this.anIntArray681[9] = 128;
		this.method7914(128, 9);
	}
}
