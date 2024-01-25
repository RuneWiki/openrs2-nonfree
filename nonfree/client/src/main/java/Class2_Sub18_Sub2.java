import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub18_Sub2 extends Class2_Sub18 {

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!jb", name = "Gb", descriptor = "I")
	private int anInt3647;

	@OriginalMember(owner = "client!jb", name = "Hb", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!jb", name = "Ib", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!jb", name = "Mb", descriptor = "I")
	private int anInt3650;

	@OriginalMember(owner = "client!jb", name = "Nb", descriptor = "Lclient!cc;")
	private Class2_Sub9 aClass2_Sub9_2;

	@OriginalMember(owner = "client!jb", name = "Ob", descriptor = "I")
	private int anInt3651;

	@OriginalMember(owner = "client!jb", name = "Pb", descriptor = "Z")
	private boolean aBoolean305;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "[I")
	private final int[] anIntArray243 = new int[16];

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "[I")
	private final int[] anIntArray244 = new int[16];

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[[Lclient!rv;")
	private final Class2_Sub37[][] aClass2_Sub37ArrayArray1 = new Class2_Sub37[16][128];

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
	private final int[] anIntArray234 = new int[16];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public final int[] anIntArray238 = new int[16];

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
	private final int[] anIntArray237 = new int[16];

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
	private final int[] anIntArray242 = new int[16];

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
	private final int[] anIntArray236 = new int[16];

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
	private int anInt3621 = 256;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
	private final int[] anIntArray235 = new int[16];

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
	private final int[] anIntArray233 = new int[16];

	@OriginalMember(owner = "client!jb", name = "pb", descriptor = "[I")
	private final int[] anIntArray245 = new int[16];

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
	private final int anInt3635 = 1000000;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
	private final int[] anIntArray239 = new int[16];

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[I")
	public final int[] anIntArray240 = new int[16];

	@OriginalMember(owner = "client!jb", name = "tb", descriptor = "[I")
	private final int[] anIntArray246 = new int[16];

	@OriginalMember(owner = "client!jb", name = "wb", descriptor = "[I")
	private final int[] anIntArray248 = new int[16];

	@OriginalMember(owner = "client!jb", name = "ub", descriptor = "[[Lclient!rv;")
	private final Class2_Sub37[][] aClass2_Sub37ArrayArray2 = new Class2_Sub37[16][128];

	@OriginalMember(owner = "client!jb", name = "vb", descriptor = "[I")
	private final int[] anIntArray247 = new int[16];

	@OriginalMember(owner = "client!jb", name = "xb", descriptor = "[I")
	public final int[] anIntArray249 = new int[16];

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Lclient!mi;")
	private final Class159 aClass159_1 = new Class159();

	@OriginalMember(owner = "client!jb", name = "Lb", descriptor = "Lclient!pk;")
	private final Class2_Sub18_Sub3 aClass2_Sub18_Sub3_1 = new Class2_Sub18_Sub3(this);

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "Lclient!ub;")
	private final Class240 aClass240_17 = new Class240(128);

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class2_Sub18_Sub2() {
		this.method2908();
		this.method2888(true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rv;B)I")
	private int method2881(@OriginalArg(0) Class2_Sub37 arg0) {
		if (this.anIntArray236[arg0.anInt6172] == 0) {
			return 0;
		}
		@Pc(20) Class116 local20 = arg0.aClass116_1;
		@Pc(36) int local36 = this.anIntArray244[arg0.anInt6172] * this.anIntArray242[arg0.anInt6172] + 4096 >> 13;
		@Pc(44) int local44 = local36 * local36 + 16384 >> 15;
		@Pc(53) int local53 = local44 * arg0.anInt6173 + 16384 >> 15;
		@Pc(62) int local62 = local53 * this.anInt3621 + 128 >> 8;
		local36 = local62 * this.anIntArray236[arg0.anInt6172] + 128 >> 8;
		if (local20.anInt3225 > 0) {
			local36 = (int) (Math.pow(0.5D, (double) arg0.anInt6159 * 1.953125E-5D * (double) local20.anInt3225) * (double) local36 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local20.aByteArray99 != null) {
			local104 = arg0.anInt6170;
			local112 = local20.aByteArray99[arg0.anInt6161 + 1];
			if (arg0.anInt6161 < local20.aByteArray99.length - 2) {
				local134 = (local20.aByteArray99[arg0.anInt6161] & 0xFF) << 8;
				local146 = (local20.aByteArray99[arg0.anInt6161 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (local20.aByteArray99[arg0.anInt6161 + 3] - local112) / (local146 - local134);
			}
			local36 = local112 * local36 + 32 >> 6;
		}
		if (arg0.anInt6157 > 0 && local20.aByteArray100 != null) {
			local104 = arg0.anInt6157;
			local112 = local20.aByteArray100[arg0.anInt6180 + 1];
			if (arg0.anInt6180 < local20.aByteArray100.length - 2) {
				local134 = (local20.aByteArray100[arg0.anInt6180] & 0xFF) << 8;
				local146 = (local20.aByteArray100[arg0.anInt6180 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (local20.aByteArray100[arg0.anInt6180 - -3] + -local112) / (local146 - local134);
			}
			local36 = local36 * local112 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
	private void method2882() {
		this.anIntArray234[9] = 128;
		this.anIntArray246[9] = 128;
		this.method2915(9, 128);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
	public synchronized void method2884(@OriginalArg(1) int arg0) {
		this.anInt3621 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	private void method2885(@OriginalArg(0) int arg0) {
		if ((this.anIntArray238[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class2_Sub37 local15 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6005(); local15 != null; local15 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6001()) {
			if (local15.anInt6172 == arg0) {
				local15.anInt6171 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)V")
	private void method2886(@OriginalArg(0) int arg0) {
		if ((this.anIntArray238[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub37 local23 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6005(); local23 != null; local23 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6001()) {
			if (arg0 == local23.anInt6172 && this.aClass2_Sub37ArrayArray2[arg0][local23.anInt6163] == null && local23.anInt6157 < 0) {
				local23.anInt6157 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public synchronized Class2_Sub18 method4451() {
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZ)V")
	private void method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub37 local12 = this.aClass2_Sub37ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub37ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray238[arg1] & 0x2) == 0) {
			local12.anInt6157 = 0;
			return;
		}
		for (@Pc(49) Class2_Sub37 local49 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6005(); local49 != null; local49 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6001()) {
			if (local12.anInt6172 == local49.anInt6172 && local49.anInt6157 < 0 && local49 != local12) {
				local12.anInt6157 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V")
	private void method2888(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method2890(-1);
		} else {
			this.method2895(-1);
		}
		this.method2894(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray248[local23] = this.anIntArray234[local23];
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			this.anIntArray246[local48] = this.anIntArray234[local48] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	private void method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2887(64, arg2, arg0);
		if ((this.anIntArray238[arg2] & 0x2) != 0) {
			for (@Pc(27) Class2_Sub37 local27 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6006(); local27 != null; local27 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method5993()) {
				if (local27.anInt6172 == arg2 && local27.anInt6157 < 0) {
					this.aClass2_Sub37ArrayArray2[arg2][local27.anInt6163] = null;
					this.aClass2_Sub37ArrayArray2[arg2][arg0] = local27;
					@Pc(65) int local65 = (local27.anInt6166 * local27.anInt6177 >> 12) + local27.anInt6175;
					local27.anInt6175 += arg0 - local27.anInt6163 << 8;
					local27.anInt6163 = arg0;
					local27.anInt6177 = 4096;
					local27.anInt6166 = local65 - local27.anInt6175;
					return;
				}
			}
		}
		@Pc(110) Class2_Sub4 local110 = (Class2_Sub4) this.aClass240_17.method5439((long) this.anIntArray248[arg2]);
		if (local110 == null) {
			return;
		}
		@Pc(124) Class2_Sub41_Sub1 local124 = local110.aClass2_Sub41_Sub1Array1[arg0];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class2_Sub37 local131 = new Class2_Sub37();
		local131.aClass2_Sub4_1 = local110;
		local131.anInt6172 = arg2;
		local131.aClass2_Sub41_Sub1_2 = local124;
		local131.aClass116_1 = local110.aClass116Array1[arg0];
		local131.anInt6179 = local110.aByteArray10[arg0];
		local131.anInt6163 = arg0;
		local131.anInt6173 = local110.aByteArray11[arg0] * local110.anInt418 * arg1 * arg1 + 1024 >> 11;
		local131.anInt6160 = local110.aByteArray12[arg0] & 0xFF;
		local131.anInt6175 = (arg0 << 8) - (local110.aShortArray2[arg0] & 0x7FFF);
		local131.anInt6159 = 0;
		local131.anInt6157 = -1;
		local131.anInt6170 = 0;
		local131.anInt6180 = 0;
		local131.anInt6161 = 0;
		if (this.anIntArray240[arg2] == 0) {
			local131.aClass2_Sub18_Sub1_4 = Static458.method2682(local124, this.method2899(local131), this.method2881(local131), this.method2910(local131));
		} else {
			local131.aClass2_Sub18_Sub1_4 = Static458.method2682(local124, this.method2899(local131), 0, this.method2910(local131));
			this.method2918(local131, local110.aShortArray2[arg0] < 0);
		}
		if (local110.aShortArray2[arg0] < 0) {
			local131.aClass2_Sub18_Sub1_4.method2698(-1);
		}
		if (local131.anInt6179 >= 0) {
			@Pc(279) Class2_Sub37 local279 = this.aClass2_Sub37ArrayArray1[arg2][local131.anInt6179];
			if (local279 != null && local279.anInt6157 < 0) {
				this.aClass2_Sub37ArrayArray2[arg2][local279.anInt6163] = null;
				local279.anInt6157 = 0;
			}
			this.aClass2_Sub37ArrayArray1[arg2][local131.anInt6179] = local131;
		}
		this.aClass2_Sub18_Sub3_1.aClass265_43.method5999(local131);
		this.aClass2_Sub37ArrayArray2[arg2][arg0] = local131;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	private void method2890(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class2_Sub37 local18 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6005(); local18 != null; local18 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6001()) {
			if (arg0 < 0 || arg0 == local18.anInt6172) {
				if (local18.aClass2_Sub18_Sub1_4 != null) {
					local18.aClass2_Sub18_Sub1_4.method2689(Static369.anInt6566 / 100);
					if (local18.aClass2_Sub18_Sub1_4.method2684()) {
						this.aClass2_Sub18_Sub3_1.aClass2_Sub18_Sub4_1.method4455(local18.aClass2_Sub18_Sub1_4);
					}
					local18.method4909();
				}
				if (local18.anInt6157 < 0) {
					this.aClass2_Sub37ArrayArray2[local18.anInt6172][local18.anInt6163] = null;
				}
				local18.method6072();
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!cc;BZ)V")
	public synchronized void method2891(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) boolean arg1) {
		this.method2904(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IZ)V")
	private synchronized void method2892(@OriginalArg(1) boolean arg0) {
		this.aClass159_1.method3646();
		this.aClass2_Sub9_2 = null;
		this.method2888(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public synchronized void method2893() {
		for (@Pc(26) Class2_Sub4 local26 = (Class2_Sub4) this.aClass240_17.method5438(); local26 != null; local26 = (Class2_Sub4) this.aClass240_17.method5436()) {
			local26.method263();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	private void method2894(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2894(local12);
			}
			return;
		}
		this.anIntArray242[arg0] = 12800;
		this.anIntArray237[arg0] = 8192;
		this.anIntArray244[arg0] = 16383;
		this.anIntArray239[arg0] = 8192;
		this.anIntArray245[arg0] = 0;
		this.anIntArray235[arg0] = 8192;
		this.method2886(arg0);
		this.method2885(arg0);
		this.anIntArray238[arg0] = 0;
		this.anIntArray243[arg0] = 32767;
		this.anIntArray247[arg0] = 256;
		this.anIntArray240[arg0] = 0;
		this.method2906(arg0, 8192);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
	private void method2895(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub37 local8 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6005(); local8 != null; local8 = (Class2_Sub37) this.aClass2_Sub18_Sub3_1.aClass265_43.method6001()) {
			if ((arg0 < 0 || arg0 == local8.anInt6172) && local8.anInt6157 < 0) {
				this.aClass2_Sub37ArrayArray2[local8.anInt6172][local8.anInt6163] = null;
				local8.anInt6157 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
	private void method2896() {
		@Pc(8) int local8 = this.anInt3647;
		@Pc(11) int local11 = this.anInt3650;
		@Pc(22) long local22 = this.aLong91;
		if (this.aClass2_Sub9_2 != null && this.anInt3651 == local11) {
			this.method2904(this.aBoolean305, this.aBoolean304, this.aClass2_Sub9_2);
			this.method2896();
			return;
		}
		while (local11 == this.anInt3650) {
			while (local11 == this.aClass159_1.anIntArray318[local8]) {
				this.aClass159_1.method3650(local8);
				@Pc(55) int local55 = this.aClass159_1.method3639(local8);
				if (local55 == 1) {
					this.aClass159_1.method3644();
					this.aClass159_1.method3653(local8);
					if (this.aClass159_1.method3643()) {
						if (this.aClass2_Sub9_2 != null) {
							this.method2891(this.aClass2_Sub9_2, this.aBoolean304);
							this.method2896();
							return;
						}
						if (!this.aBoolean304 || local11 == 0) {
							this.method2888(true);
							this.aClass159_1.method3646();
							return;
						}
						this.aClass159_1.method3648(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method2901(local55);
				}
				this.aClass159_1.method3647(local8);
				this.aClass159_1.method3653(local8);
			}
			local8 = this.aClass159_1.method3649();
			local11 = this.aClass159_1.anIntArray318[local8];
			local22 = this.aClass159_1.method3652(local11);
		}
		this.anInt3650 = local11;
		this.anInt3647 = local8;
		this.aLong91 = local22;
		if (this.aClass2_Sub9_2 != null && this.anInt3651 < local11) {
			this.anInt3650 = this.anInt3651;
			this.anInt3647 = -1;
			this.aLong91 = this.aClass159_1.method3652(this.anInt3650);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
	private void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!rv;)I")
	private int method2899(@OriginalArg(1) Class2_Sub37 arg0) {
		@Pc(14) int local14 = arg0.anInt6175 + (arg0.anInt6177 * arg0.anInt6166 >> 12);
		local14 += this.anIntArray247[arg0.anInt6172] * (this.anIntArray239[arg0.anInt6172] - 8192) >> 12;
		@Pc(35) Class116 local35 = arg0.aClass116_1;
		@Pc(63) int local63;
		if (local35.anInt3226 > 0 && (local35.anInt3228 > 0 || this.anIntArray245[arg0.anInt6172] > 0)) {
			@Pc(58) int local58 = local35.anInt3228 << 2;
			local63 = local35.anInt3229 << 1;
			if (arg0.anInt6182 < local63) {
				local58 = local58 * arg0.anInt6182 / local63;
			}
			local58 += this.anIntArray245[arg0.anInt6172] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt6181 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local97 * (double) local58);
		}
		local63 = (int) ((double) (arg0.aClass2_Sub41_Sub1_2.anInt7101 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static369.anInt6566 + 0.5D);
		return local63 >= 1 ? local63 : 1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4450(@OriginalArg(0) int arg0) {
		if (this.aClass159_1.method3651()) {
			@Pc(18) int local18 = this.aClass159_1.anInt4516 * this.anInt3635 / Static369.anInt6566;
			do {
				@Pc(27) long local27 = this.aLong92 + (long) arg0 * (long) local18;
				if (this.aLong91 - local27 >= 0L) {
					this.aLong92 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong91 - this.aLong92 - 1L) / (long) local18);
				this.aLong92 += (long) local18 * (long) local56;
				arg0 -= local56;
				this.aClass2_Sub18_Sub3_1.method4450(local56);
				this.method2896();
			} while (this.aClass159_1.method3651());
		}
		this.aClass2_Sub18_Sub3_1.method4450(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)V")
	private void method2901(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2887(local28, local16, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2887(64, local16, local22);
			} else {
				this.method2889(local22, local28, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2898(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray246[local16] = (local28 << 14) + (this.anIntArray246[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray246[local16] = (this.anIntArray246[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray245[local16] = (this.anIntArray245[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray245[local16] = (this.anIntArray245[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray235[local16] = (local28 << 7) + (this.anIntArray235[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray235[local16] = local28 + (this.anIntArray235[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray242[local16] = (local28 << 7) + (this.anIntArray242[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray242[local16] = (this.anIntArray242[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray237[local16] = (local28 << 7) + (this.anIntArray237[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray237[local16] = (this.anIntArray237[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray244[local16] = (this.anIntArray244[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray244[local16] = local28 + (this.anIntArray244[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray238[local16] |= 0x1;
				} else {
					this.anIntArray238[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2886(local16);
					this.anIntArray238[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray238[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray243[local16] = (this.anIntArray243[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray243[local16] = (this.anIntArray243[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray243[local16] = (local28 << 7) + (this.anIntArray243[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray243[local16] = local28 + (this.anIntArray243[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method2890(local16);
			}
			if (local22 == 121) {
				this.method2894(local16);
			}
			if (local22 == 123) {
				this.method2895(local16);
			}
			@Pc(512) int local512;
			if (local22 == 6) {
				local512 = this.anIntArray243[local16];
				if (local512 == 16384) {
					this.anIntArray247[local16] = (local28 << 7) + (this.anIntArray247[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local512 = this.anIntArray243[local16];
				if (local512 == 16384) {
					this.anIntArray247[local16] = (this.anIntArray247[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray240[local16] = (local28 << 7) + (this.anIntArray240[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray240[local16] = local28 + (this.anIntArray240[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray238[local16] |= 0x4;
				} else {
					this.method2885(local16);
					this.anIntArray238[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2906(local16, (this.anIntArray233[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method2906(local16, local28 + (this.anIntArray233[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2915(local16, local22 + this.anIntArray246[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2916(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method2914(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2888(true);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass159_1.method3651()) {
			@Pc(14) int local14 = this.anInt3635 * this.aClass159_1.anInt4516 / Static369.anInt6566;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong92;
				if (this.aLong91 - local23 >= 0L) {
					this.aLong92 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong91 - this.aLong92 - 1L) / (long) local14);
				this.aLong92 += (long) local51 * (long) local14;
				this.aClass2_Sub18_Sub3_1.method4446(arg0, arg1, local51);
				arg1 += local51;
				arg2 -= local51;
				this.method2896();
			} while (this.aClass159_1.method3651());
		}
		this.aClass2_Sub18_Sub3_1.method4446(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I")
	public int method2902() {
		return this.anInt3621;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	public synchronized void method2903() {
		this.method2892(true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()I")
	@Override
	public synchronized int method4445() {
		return 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZILclient!cc;)V")
	private synchronized void method2904(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class2_Sub9 arg2) {
		this.method2892(arg0);
		this.aClass159_1.method3640(arg2.aByteArray29);
		this.aBoolean304 = arg1;
		this.aLong92 = 0L;
		@Pc(32) int local32 = this.aClass159_1.method3645();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass159_1.method3650(local34);
			this.aClass159_1.method3647(local34);
			this.aClass159_1.method3653(local34);
		}
		this.anInt3647 = this.aClass159_1.method3649();
		this.anInt3650 = this.aClass159_1.anIntArray318[this.anInt3647];
		this.aLong91 = this.aClass159_1.method3652(this.anInt3650);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	private void method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray233[arg0] = arg1;
		this.anIntArray249[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)V")
	public synchronized void method2907() {
		this.method2882();
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(III)V")
	private synchronized void method2908() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray236[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!tf;ZLclient!pc;Lclient!cc;)Z")
	public synchronized boolean method2909(@OriginalArg(1) Class229 arg0, @OriginalArg(3) Class188 arg1, @OriginalArg(4) Class2_Sub9 arg2) {
		arg2.method889();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(32) Class2_Sub12 local32 = (Class2_Sub12) arg2.aClass240_4.method5438(); local32 != null; local32 = (Class2_Sub12) arg2.aClass240_4.method5436()) {
			@Pc(38) int local38 = (int) local32.aLong227;
			@Pc(46) Class2_Sub4 local46 = (Class2_Sub4) this.aClass240_17.method5439((long) local38);
			if (local46 == null) {
				local46 = Static422.method5718(local38, arg1);
				if (local46 == null) {
					local9 = false;
					continue;
				}
				this.aClass240_17.method5430((long) local38, local46);
			}
			if (!local46.method266(local32.aByteArray42, local20, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method887();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!rv;)I")
	private int method2910(@OriginalArg(1) Class2_Sub37 arg0) {
		@Pc(15) int local15 = this.anIntArray237[arg0.anInt6172];
		return local15 < 8192 ? arg0.anInt6160 * local15 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt6160 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	public synchronized void method2911() {
		for (@Pc(7) Class2_Sub4 local7 = (Class2_Sub4) this.aClass240_17.method5438(); local7 != null; local7 = (Class2_Sub4) this.aClass240_17.method5436()) {
			local7.method6072();
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Z")
	public synchronized boolean method2912() {
		return this.aClass159_1.method3651();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IBIILclient!rv;)Z")
	public boolean method2913(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub37 arg3) {
		arg3.anInt6178 = Static369.anInt6566 / 100;
		if (arg3.anInt6157 >= 0 && (arg3.aClass2_Sub18_Sub1_4 == null || arg3.aClass2_Sub18_Sub1_4.method2674())) {
			arg3.method4909();
			arg3.method6072();
			if (arg3.anInt6179 > 0 && arg3 == this.aClass2_Sub37ArrayArray1[arg3.anInt6172][arg3.anInt6179]) {
				this.aClass2_Sub37ArrayArray1[arg3.anInt6172][arg3.anInt6179] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg3.anInt6177;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray235[arg3.anInt6172] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg3.anInt6177 = local61;
		}
		arg3.aClass2_Sub18_Sub1_4.method2710(this.method2899(arg3));
		@Pc(101) Class116 local101 = arg3.aClass116_1;
		@Pc(103) boolean local103 = false;
		arg3.anInt6181 += local101.anInt3226;
		arg3.anInt6182++;
		@Pc(134) double local134 = (double) ((arg3.anInt6166 * arg3.anInt6177 >> 12) + (arg3.anInt6163 - 60 << 8)) * 5.086263020833333E-6D;
		if (local101.anInt3225 > 0) {
			if (local101.anInt3230 > 0) {
				arg3.anInt6159 += (int) (Math.pow(2.0D, (double) local101.anInt3230 * local134) * 128.0D + 0.5D);
			} else {
				arg3.anInt6159 += 128;
			}
			if (arg3.anInt6159 * local101.anInt3225 >= 819200) {
				local103 = true;
			}
		}
		if (local101.aByteArray99 != null) {
			if (local101.anInt3231 > 0) {
				arg3.anInt6170 += (int) (Math.pow(2.0D, (double) local101.anInt3231 * local134) * 128.0D + 0.5D);
			} else {
				arg3.anInt6170 += 128;
			}
			while (arg3.anInt6161 < local101.aByteArray99.length - 2 && arg3.anInt6170 > (local101.aByteArray99[arg3.anInt6161 + 2] & 0xFF) << 8) {
				arg3.anInt6161 += 2;
			}
			if (local101.aByteArray99.length - 2 == arg3.anInt6161 && local101.aByteArray99[arg3.anInt6161 + 1] == 0) {
				local103 = true;
			}
		}
		if (arg3.anInt6157 >= 0 && local101.aByteArray100 != null && (this.anIntArray238[arg3.anInt6172] & 0x1) == 0 && (arg3.anInt6179 < 0 || arg3 != this.aClass2_Sub37ArrayArray1[arg3.anInt6172][arg3.anInt6179])) {
			if (local101.anInt3223 <= 0) {
				arg3.anInt6157 += 128;
			} else {
				arg3.anInt6157 += (int) (Math.pow(2.0D, (double) local101.anInt3223 * local134) * 128.0D + 0.5D);
			}
			while (arg3.anInt6180 < local101.aByteArray100.length - 2 && (local101.aByteArray100[arg3.anInt6180 + 2] & 0xFF) << 8 < arg3.anInt6157) {
				arg3.anInt6180 += 2;
			}
			if (local101.aByteArray100.length - 2 == arg3.anInt6180) {
				local103 = true;
			}
		}
		if (!local103) {
			arg3.aClass2_Sub18_Sub1_4.method2700(arg3.anInt6178, this.method2881(arg3), this.method2910(arg3));
			return false;
		}
		arg3.aClass2_Sub18_Sub1_4.method2689(arg3.anInt6178);
		if (arg0 == null) {
			arg3.aClass2_Sub18_Sub1_4.method4450(arg1);
		} else {
			arg3.aClass2_Sub18_Sub1_4.method4446(arg0, arg2, arg1);
		}
		if (arg3.aClass2_Sub18_Sub1_4.method2684()) {
			this.aClass2_Sub18_Sub3_1.aClass2_Sub18_Sub4_1.method4455(arg3.aClass2_Sub18_Sub1_4);
		}
		arg3.method4909();
		if (arg3.anInt6157 >= 0) {
			arg3.method6072();
			if (arg3.anInt6179 > 0 && arg3 == this.aClass2_Sub37ArrayArray1[arg3.anInt6172][arg3.anInt6179]) {
				this.aClass2_Sub37ArrayArray1[arg3.anInt6172][arg3.anInt6179] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(III)V")
	private void method2914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray239[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(III)V")
	private void method2915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray248[arg0] != arg1) {
			this.anIntArray248[arg0] = arg1;
			for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
				this.aClass2_Sub37ArrayArray1[arg0][local25] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(III)V")
	private void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rv;I)Z")
	public boolean method2917(@OriginalArg(0) Class2_Sub37 arg0) {
		if (arg0.aClass2_Sub18_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt6157 >= 0) {
			arg0.method6072();
			if (arg0.anInt6179 > 0 && this.aClass2_Sub37ArrayArray1[arg0.anInt6172][arg0.anInt6179] == arg0) {
				this.aClass2_Sub37ArrayArray1[arg0.anInt6172][arg0.anInt6179] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rv;ZZ)V")
	public void method2918(@OriginalArg(0) Class2_Sub37 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub41_Sub1_2.aByteArray195.length;
		@Pc(40) int local40;
		if (arg1 && arg0.aClass2_Sub41_Sub1_2.aBoolean601) {
			@Pc(23) int local23 = local8 + local8 - arg0.aClass2_Sub41_Sub1_2.anInt7099;
			local8 <<= 0x8;
			local40 = (int) ((long) this.anIntArray240[arg0.anInt6172] * (long) local23 >> 6);
			if (local40 >= local8) {
				local40 = local8 + local8 - local40 - 1;
				arg0.aClass2_Sub18_Sub1_4.method2705();
			}
		} else {
			local40 = (int) ((long) local8 * (long) this.anIntArray240[arg0.anInt6172] >> 6);
		}
		arg0.aClass2_Sub18_Sub1_4.method2693(local40);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public synchronized Class2_Sub18 method4448() {
		return this.aClass2_Sub18_Sub3_1;
	}
}
