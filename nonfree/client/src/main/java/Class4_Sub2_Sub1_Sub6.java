import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class4_Sub2_Sub1_Sub6 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!vb", name = "Vb", descriptor = "I")
	private int anInt3078;

	@OriginalMember(owner = "client!vb", name = "Xb", descriptor = "I")
	private int anInt3079;

	@OriginalMember(owner = "client!vb", name = "Yb", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!vb", name = "Zb", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!vb", name = "bc", descriptor = "I")
	private int anInt3080;

	@OriginalMember(owner = "client!vb", name = "cc", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!vb", name = "ec", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!vb", name = "fc", descriptor = "I")
	private int anInt3082;

	@OriginalMember(owner = "client!vb", name = "gc", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!vb", name = "hc", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!vb", name = "ic", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!vb", name = "kc", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!vb", name = "mc", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!vb", name = "oc", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!vb", name = "pc", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!vb", name = "qc", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!vb", name = "rc", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!vb", name = "sc", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!vb", name = "tc", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!vb", name = "uc", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!vb", name = "vc", descriptor = "I")
	private int anInt3085;

	@OriginalMember(owner = "client!vb", name = "xc", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!vb", name = "yc", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!vb", name = "lc", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!vb", name = "Wb", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!vb", name = "jc", descriptor = "I")
	public int anInt3083 = 0;

	@OriginalMember(owner = "client!vb", name = "nc", descriptor = "I")
	public int anInt3084 = 0;

	@OriginalMember(owner = "client!vb", name = "dc", descriptor = "I")
	public int anInt3081 = 0;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([Lclient!vb;I)V")
	public Class4_Sub2_Sub1_Sub6(@OriginalArg(0) Class4_Sub2_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt3084 = 0;
		this.anInt3081 = 0;
		this.anInt3083 = 0;
		this.aByte8 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class4_Sub2_Sub1_Sub6 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt3084 += local41.anInt3084;
				this.anInt3081 += local41.anInt3081;
				this.anInt3083 += local41.anInt3083;
				if (local41.aByteArray35 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local41.aByte8;
					}
					if (this.aByte8 != local41.aByte8) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray36 != null;
				local22 |= local41.aByteArray37 != null;
			}
		}
		this.anIntArray333 = new int[this.anInt3084];
		this.anIntArray331 = new int[this.anInt3084];
		this.anIntArray326 = new int[this.anInt3084];
		this.anIntArray327 = new int[this.anInt3081];
		this.anIntArray329 = new int[this.anInt3081];
		this.anIntArray336 = new int[this.anInt3081];
		this.anIntArray328 = new int[this.anInt3081];
		this.anIntArray337 = new int[this.anInt3081];
		this.anIntArray334 = new int[this.anInt3081];
		if (this.anInt3083 > 0) {
			this.anIntArray330 = new int[this.anInt3083];
			this.anIntArray335 = new int[this.anInt3083];
			this.anIntArray332 = new int[this.anInt3083];
		}
		if (local18) {
			this.aByteArray35 = new byte[this.anInt3081];
		}
		if (local20) {
			this.aByteArray36 = new byte[this.anInt3081];
		}
		if (local22) {
			this.aByteArray37 = new byte[this.anInt3081];
			this.aShortArray14 = new short[this.anInt3081];
		}
		this.anInt3084 = 0;
		this.anInt3081 = 0;
		this.anInt3083 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class4_Sub2_Sub1_Sub6 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt3084;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt3084; local221++) {
					this.anIntArray333[this.anInt3084] = local214.anIntArray333[local221];
					this.anIntArray331[this.anInt3084] = local214.anIntArray331[local221];
					this.anIntArray326[this.anInt3084] = local214.anIntArray326[local221];
					this.anInt3084++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt3081; local262++) {
					this.anIntArray327[this.anInt3081] = local214.anIntArray327[local262] + local219;
					this.anIntArray329[this.anInt3081] = local214.anIntArray329[local262] + local219;
					this.anIntArray336[this.anInt3081] = local214.anIntArray336[local262] + local219;
					this.anIntArray328[this.anInt3081] = local214.anIntArray328[local262];
					this.anIntArray337[this.anInt3081] = local214.anIntArray337[local262];
					this.anIntArray334[this.anInt3081] = local214.anIntArray334[local262];
					if (local18) {
						if (local214.aByteArray35 == null) {
							this.aByteArray35[this.anInt3081] = local214.aByte8;
						} else {
							this.aByteArray35[this.anInt3081] = local214.aByteArray35[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray36 == null) {
							this.aByteArray36[this.anInt3081] = 0;
						} else {
							this.aByteArray36[this.anInt3081] = local214.aByteArray36[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray37 == null || local214.aByteArray37[local262] == -1) {
							this.aByteArray37[this.anInt3081] = -1;
						} else {
							this.aByteArray37[this.anInt3081] = (byte) (local214.aByteArray37[local262] + local207);
							this.aShortArray14[this.anInt3081] = local214.aShortArray14[local262];
						}
					}
					this.anInt3081++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt3083; local418++) {
					this.anIntArray330[this.anInt3083] = local214.anIntArray330[local418] + local219;
					this.anIntArray335[this.anInt3083] = local214.anIntArray335[local418] + local219;
					this.anIntArray332[this.anInt3083] = local214.anIntArray332[local418] + local219;
					this.anInt3083++;
				}
				local207 += local214.anInt3083;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!vb;[B)Lclient!vb;")
	private Class4_Sub2_Sub1_Sub6 method2128(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub6 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3084 = this.anInt3084;
		arg1.anInt3081 = this.anInt3081;
		arg1.anInt3083 = this.anInt3083;
		if (arg1.anIntArray333 == null || arg1.anIntArray333.length < this.anInt3084) {
			arg1.anIntArray333 = new int[this.anInt3084 + 100];
			arg1.anIntArray331 = new int[this.anInt3084 + 100];
			arg1.anIntArray326 = new int[this.anInt3084 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt3084; local43++) {
			arg1.anIntArray333[local43] = this.anIntArray333[local43];
			arg1.anIntArray331[local43] = this.anIntArray331[local43];
			arg1.anIntArray326[local43] = this.anIntArray326[local43];
		}
		if (arg0) {
			arg1.aByteArray36 = this.aByteArray36;
		} else {
			arg1.aByteArray36 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray36 == null) {
				for (local88 = 0; local88 < this.anInt3081; local88++) {
					arg1.aByteArray36[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt3081; local88++) {
					arg1.aByteArray36[local88] = this.aByteArray36[local88];
				}
			}
		}
		arg1.anIntArray327 = this.anIntArray327;
		arg1.anIntArray329 = this.anIntArray329;
		arg1.anIntArray336 = this.anIntArray336;
		arg1.anIntArray328 = this.anIntArray328;
		arg1.anIntArray337 = this.anIntArray337;
		arg1.anIntArray334 = this.anIntArray334;
		arg1.aByteArray35 = this.aByteArray35;
		arg1.aByteArray37 = this.aByteArray37;
		arg1.aShortArray14 = this.aShortArray14;
		arg1.aByte8 = this.aByte8;
		arg1.anIntArray330 = this.anIntArray330;
		arg1.anIntArray335 = this.anIntArray335;
		arg1.anIntArray332 = this.anIntArray332;
		arg1.anIntArrayArray25 = this.anIntArrayArray25;
		arg1.anIntArrayArray26 = this.anIntArrayArray26;
		arg1.aBoolean152 = this.aBoolean152;
		arg1.anInt3085 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3084; local1++) {
			this.anIntArray333[local1] = this.anIntArray333[local1] * arg0 / 128;
			this.anIntArray331[local1] = this.anIntArray331[local1] * arg1 / 128;
			this.anIntArray326[local1] = this.anIntArray326[local1] * arg2 / 128;
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method2130() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3084; local1++) {
			@Pc(7) int local7 = this.anIntArray326[local1];
			this.anIntArray326[local1] = this.anIntArray333[local1];
			this.anIntArray333[local1] = -local7;
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)V")
	public void method2131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static124.anIntArray344[0] = -1;
		if (this.anInt3085 != 2 && this.anInt3085 != 1) {
			this.method2132();
		}
		@Pc(15) int local15 = Static57.anInt1544;
		@Pc(17) int local17 = Static57.anInt1546;
		@Pc(21) int local21 = Static124.anIntArray341[0];
		@Pc(25) int local25 = Static124.anIntArray355[0];
		@Pc(29) int local29 = Static124.anIntArray341[arg0];
		@Pc(33) int local33 = Static124.anIntArray355[arg0];
		@Pc(37) int local37 = Static124.anIntArray341[arg1];
		@Pc(41) int local41 = Static124.anIntArray355[arg1];
		@Pc(45) int local45 = Static124.anIntArray341[arg2];
		@Pc(49) int local49 = Static124.anIntArray355[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt3084; local61++) {
			@Pc(67) int local67 = this.anIntArray333[local61];
			@Pc(72) int local72 = this.anIntArray331[local61];
			@Pc(77) int local77 = this.anIntArray326[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static124.anIntArray345[local61] = local77 - local59;
			Static124.anIntArray354[local61] = local15 + (local67 << 9) / arg6;
			Static124.anIntArray349[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt3083 > 0) {
				Static124.anIntArray356[local61] = local67;
				Static124.anIntArray351[local61] = local89;
				Static124.anIntArray340[local61] = local77;
			}
		}
		try {
			this.method2142(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
	private void method2132() {
		if (this.anInt3085 == 2) {
			return;
		}
		this.anInt3085 = 2;
		this.anInt3079 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3084; local12++) {
			@Pc(18) int local18 = this.anIntArray333[local12];
			@Pc(23) int local23 = this.anIntArray331[local12];
			@Pc(28) int local28 = this.anIntArray326[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt3079) {
				this.anInt3079 = local40;
			}
		}
		this.anInt3079 = (int) (Math.sqrt((double) this.anInt3079) + 0.99D);
		this.anInt3080 = this.anInt3079;
		this.anInt3078 = this.anInt3079 + this.anInt3079;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method2133(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static124.aByteArray38.length < this.anInt3081) {
			Static124.aByteArray38 = new byte[this.anInt3081 + 100];
		}
		return this.method2128(arg0, Static124.aClass4_Sub2_Sub1_Sub6_2, Static124.aByteArray38);
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	private void method2134(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static57.anInt1544;
		@Pc(3) int local3 = Static57.anInt1546;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray327[arg0];
		@Pc(15) int local15 = this.anIntArray329[arg0];
		@Pc(20) int local20 = this.anIntArray336[arg0];
		@Pc(24) int local24 = Static124.anIntArray340[local10];
		@Pc(28) int local28 = Static124.anIntArray340[local15];
		@Pc(32) int local32 = Static124.anIntArray340[local20];
		if (this.aByteArray36 == null) {
			Static57.anInt1543 = 0;
		} else {
			Static57.anInt1543 = this.aByteArray36[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static124.anIntArray353[0] = Static124.anIntArray354[local10];
			Static124.anIntArray338[0] = Static124.anIntArray349[local10];
			local5++;
			Static124.anIntArray352[0] = this.anIntArray328[arg0];
		} else {
			local73 = Static124.anIntArray356[local10];
			local77 = Static124.anIntArray351[local10];
			local82 = this.anIntArray328[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static124.anIntArray350[local32 - local24];
				Static124.anIntArray353[0] = local1 + (local73 + ((Static124.anIntArray356[local20] - local73) * local95 >> 16) << 9) / 50;
				Static124.anIntArray338[0] = local3 + (local77 + ((Static124.anIntArray351[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static124.anIntArray352[0] = local82 + ((this.anIntArray334[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static124.anIntArray350[local28 - local24];
				Static124.anIntArray353[local5] = local1 + (local73 + ((Static124.anIntArray356[local15] - local73) * local95 >> 16) << 9) / 50;
				Static124.anIntArray338[local5] = local3 + (local77 + ((Static124.anIntArray351[local15] - local77) * local95 >> 16) << 9) / 50;
				Static124.anIntArray352[local5++] = local82 + ((this.anIntArray337[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static124.anIntArray353[local5] = Static124.anIntArray354[local15];
			Static124.anIntArray338[local5] = Static124.anIntArray349[local15];
			Static124.anIntArray352[local5++] = this.anIntArray337[arg0];
		} else {
			local73 = Static124.anIntArray356[local15];
			local77 = Static124.anIntArray351[local15];
			local82 = this.anIntArray337[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static124.anIntArray350[local24 - local28];
				Static124.anIntArray353[local5] = local1 + (local73 + ((Static124.anIntArray356[local10] - local73) * local95 >> 16) << 9) / 50;
				Static124.anIntArray338[local5] = local3 + (local77 + ((Static124.anIntArray351[local10] - local77) * local95 >> 16) << 9) / 50;
				Static124.anIntArray352[local5++] = local82 + ((this.anIntArray328[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static124.anIntArray350[local32 - local28];
				Static124.anIntArray353[local5] = local1 + (local73 + ((Static124.anIntArray356[local20] - local73) * local95 >> 16) << 9) / 50;
				Static124.anIntArray338[local5] = local3 + (local77 + ((Static124.anIntArray351[local20] - local77) * local95 >> 16) << 9) / 50;
				Static124.anIntArray352[local5++] = local82 + ((this.anIntArray334[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static124.anIntArray353[local5] = Static124.anIntArray354[local20];
			Static124.anIntArray338[local5] = Static124.anIntArray349[local20];
			Static124.anIntArray352[local5++] = this.anIntArray334[arg0];
		} else {
			local73 = Static124.anIntArray356[local20];
			local77 = Static124.anIntArray351[local20];
			local82 = this.anIntArray334[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static124.anIntArray350[local28 - local32];
				Static124.anIntArray353[local5] = local1 + (local73 + ((Static124.anIntArray356[local15] - local73) * local95 >> 16) << 9) / 50;
				Static124.anIntArray338[local5] = local3 + (local77 + ((Static124.anIntArray351[local15] - local77) * local95 >> 16) << 9) / 50;
				Static124.anIntArray352[local5++] = local82 + ((this.anIntArray337[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static124.anIntArray350[local24 - local32];
				Static124.anIntArray353[local5] = local1 + (local73 + ((Static124.anIntArray356[local10] - local73) * local95 >> 16) << 9) / 50;
				Static124.anIntArray338[local5] = local3 + (local77 + ((Static124.anIntArray351[local10] - local77) * local95 >> 16) << 9) / 50;
				Static124.anIntArray352[local5++] = local82 + ((this.anIntArray328[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static124.anIntArray353[0];
		local77 = Static124.anIntArray353[1];
		local82 = Static124.anIntArray353[2];
		local95 = Static124.anIntArray338[0];
		@Pc(590) int local590 = Static124.anIntArray338[1];
		@Pc(594) int local594 = Static124.anIntArray338[2];
		Static57.aBoolean82 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static57.anInt1542 || local77 > Static57.anInt1542 || local82 > Static57.anInt1542) {
				Static57.aBoolean82 = true;
			}
			if (this.aByteArray37 != null && this.aByteArray37[arg0] != -1) {
				local669 = this.aByteArray37[arg0] & 0xFF;
				local674 = this.anIntArray330[local669];
				local679 = this.anIntArray335[local669];
				local684 = this.anIntArray332[local669];
				if (this.anIntArray334[arg0] == -1) {
					Static57.method1037(local95, local590, local594, local73, local77, local82, this.anIntArray328[arg0], this.anIntArray328[arg0], this.anIntArray328[arg0], Static124.anIntArray356[local674], Static124.anIntArray356[local679], Static124.anIntArray356[local684], Static124.anIntArray351[local674], Static124.anIntArray351[local679], Static124.anIntArray351[local684], Static124.anIntArray340[local674], Static124.anIntArray340[local679], Static124.anIntArray340[local684], this.aShortArray14[arg0]);
				} else {
					Static57.method1037(local95, local590, local594, local73, local77, local82, Static124.anIntArray352[0], Static124.anIntArray352[1], Static124.anIntArray352[2], Static124.anIntArray356[local674], Static124.anIntArray356[local679], Static124.anIntArray356[local684], Static124.anIntArray351[local674], Static124.anIntArray351[local679], Static124.anIntArray351[local684], Static124.anIntArray340[local674], Static124.anIntArray340[local679], Static124.anIntArray340[local684], this.aShortArray14[arg0]);
				}
			} else if (this.anIntArray334[arg0] == -1) {
				Static57.method1035(local95, local590, local594, local73, local77, local82, Static124.anIntArray348[this.anIntArray328[arg0]]);
			} else {
				Static57.method1029(local95, local590, local594, local73, local77, local82, Static124.anIntArray352[0], Static124.anIntArray352[1], Static124.anIntArray352[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static57.anInt1542 || local77 > Static57.anInt1542 || local82 > Static57.anInt1542 || Static124.anIntArray353[3] < 0 || Static124.anIntArray353[3] > Static57.anInt1542) {
			Static57.aBoolean82 = true;
		}
		if (this.aByteArray37 == null || this.aByteArray37[arg0] == -1) {
			if (this.anIntArray334[arg0] == -1) {
				local669 = Static124.anIntArray348[this.anIntArray328[arg0]];
				Static57.method1035(local95, local590, local594, local73, local77, local82, local669);
				Static57.method1035(local95, local594, Static124.anIntArray338[3], local73, local82, Static124.anIntArray353[3], local669);
				return;
			}
			Static57.method1029(local95, local590, local594, local73, local77, local82, Static124.anIntArray352[0], Static124.anIntArray352[1], Static124.anIntArray352[2]);
			Static57.method1029(local95, local594, Static124.anIntArray338[3], local73, local82, Static124.anIntArray353[3], Static124.anIntArray352[0], Static124.anIntArray352[2], Static124.anIntArray352[3]);
			return;
		}
		local669 = this.aByteArray37[arg0] & 0xFF;
		local674 = this.anIntArray330[local669];
		local679 = this.anIntArray335[local669];
		local684 = this.anIntArray332[local669];
		@Pc(924) short local924 = this.aShortArray14[arg0];
		if (this.anIntArray334[arg0] == -1) {
			Static57.method1037(local95, local590, local594, local73, local77, local82, this.anIntArray328[arg0], this.anIntArray328[arg0], this.anIntArray328[arg0], Static124.anIntArray356[local674], Static124.anIntArray356[local679], Static124.anIntArray356[local684], Static124.anIntArray351[local674], Static124.anIntArray351[local679], Static124.anIntArray351[local684], Static124.anIntArray340[local674], Static124.anIntArray340[local679], Static124.anIntArray340[local684], local924);
			Static57.method1037(local95, local594, Static124.anIntArray338[3], local73, local82, Static124.anIntArray353[3], this.anIntArray328[arg0], this.anIntArray328[arg0], this.anIntArray328[arg0], Static124.anIntArray356[local674], Static124.anIntArray356[local679], Static124.anIntArray356[local684], Static124.anIntArray351[local674], Static124.anIntArray351[local679], Static124.anIntArray351[local684], Static124.anIntArray340[local674], Static124.anIntArray340[local679], Static124.anIntArray340[local684], local924);
			return;
		}
		Static57.method1037(local95, local590, local594, local73, local77, local82, Static124.anIntArray352[0], Static124.anIntArray352[1], Static124.anIntArray352[2], Static124.anIntArray356[local674], Static124.anIntArray356[local679], Static124.anIntArray356[local684], Static124.anIntArray351[local674], Static124.anIntArray351[local679], Static124.anIntArray351[local684], Static124.anIntArray340[local674], Static124.anIntArray340[local679], Static124.anIntArray340[local684], local924);
		Static57.method1037(local95, local594, Static124.anIntArray338[3], local73, local82, Static124.anIntArray353[3], Static124.anIntArray352[0], Static124.anIntArray352[2], Static124.anIntArray352[3], Static124.anIntArray356[local674], Static124.anIntArray356[local679], Static124.anIntArray356[local684], Static124.anIntArray351[local674], Static124.anIntArray351[local679], Static124.anIntArray351[local684], Static124.anIntArray340[local674], Static124.anIntArray340[local679], Static124.anIntArray340[local684], local924);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static124.anIntArray344[0] = -1;
		if (this.anInt3085 != 1) {
			this.method2150();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt3079 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt3079 << 9;
		if (local64 / local40 >= Static57.anInt1545) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt3079 << 9;
		if (local77 / local40 <= Static57.anInt1539) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt3079 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static57.anInt1541) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3118 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static57.anInt1540) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3118 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt3083 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static124.aBoolean153) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static124.anInt3087 - Static57.anInt1544;
			local223 = Static124.anInt3088 - Static57.anInt1546;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean152) {
					Static124.anIntArray342[Static124.anInt3089++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static57.anInt1544;
		local219 = Static57.anInt1546;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static124.anIntArray341[arg0];
			local257 = Static124.anIntArray355[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt3084; local269++) {
			@Pc(275) int local275 = this.anIntArray333[local269];
			@Pc(280) int local280 = this.anIntArray331[local269];
			@Pc(285) int local285 = this.anIntArray326[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static124.anIntArray345[local269] = local285 - local29;
			if (local285 >= 50) {
				Static124.anIntArray354[local269] = local172 + (local275 << 9) / local285;
				Static124.anIntArray349[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static124.anIntArray354[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static124.anIntArray356[local269] = local275;
				Static124.anIntArray351[local269] = local297;
				Static124.anIntArray340[local269] = local285;
			}
		}
		try {
			this.method2142(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()V")
	public void method2135() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3084; local1++) {
			this.anIntArray333[local1] = -this.anIntArray333[local1];
			this.anIntArray326[local1] = -this.anIntArray326[local1];
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[IIII)V")
	private void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static124.anInt3091 = 0;
			Static124.anInt3090 = 0;
			Static124.anInt3086 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray25.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray25[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static124.anInt3091 += this.anIntArray333[local36];
						Static124.anInt3090 += this.anIntArray331[local36];
						Static124.anInt3086 += this.anIntArray326[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static124.anInt3091 = Static124.anInt3091 / local6 + arg2;
				Static124.anInt3090 = Static124.anInt3090 / local6 + arg3;
				Static124.anInt3086 = Static124.anInt3086 / local6 + arg4;
			} else {
				Static124.anInt3091 = arg2;
				Static124.anInt3090 = arg3;
				Static124.anInt3086 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray333[local31] += arg2;
						this.anIntArray331[local31] += arg3;
						this.anIntArray326[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray333[local31] -= Static124.anInt3091;
						this.anIntArray331[local31] -= Static124.anInt3090;
						this.anIntArray326[local31] -= Static124.anInt3086;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static124.anIntArray341[local225];
							local235 = Static124.anIntArray355[local225];
							local251 = this.anIntArray331[local31] * local231 + this.anIntArray333[local31] * local235 >> 16;
							this.anIntArray331[local31] = this.anIntArray331[local31] * local235 - this.anIntArray333[local31] * local231 >> 16;
							this.anIntArray333[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static124.anIntArray341[local36];
							local235 = Static124.anIntArray355[local36];
							local251 = this.anIntArray331[local31] * local235 - this.anIntArray326[local31] * local231 >> 16;
							this.anIntArray326[local31] = this.anIntArray331[local31] * local231 + this.anIntArray326[local31] * local235 >> 16;
							this.anIntArray331[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static124.anIntArray341[local219];
							local235 = Static124.anIntArray355[local219];
							local251 = this.anIntArray326[local31] * local231 + this.anIntArray333[local31] * local235 >> 16;
							this.anIntArray326[local31] = this.anIntArray326[local31] * local235 - this.anIntArray333[local31] * local231 >> 16;
							this.anIntArray333[local31] = local251;
						}
						this.anIntArray333[local31] += Static124.anInt3091;
						this.anIntArray331[local31] += Static124.anInt3090;
						this.anIntArray326[local31] += Static124.anInt3086;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray333[local31] -= Static124.anInt3091;
						this.anIntArray331[local31] -= Static124.anInt3090;
						this.anIntArray326[local31] -= Static124.anInt3086;
						this.anIntArray333[local31] = this.anIntArray333[local31] * arg2 / 128;
						this.anIntArray331[local31] = this.anIntArray331[local31] * arg3 / 128;
						this.anIntArray326[local31] = this.anIntArray326[local31] * arg4 / 128;
						this.anIntArray333[local31] += Static124.anInt3091;
						this.anIntArray331[local31] += Static124.anInt3090;
						this.anIntArray326[local31] += Static124.anInt3086;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray26 != null && this.aByteArray36 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray36[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray36[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()V")
	public void method2137() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3084; local1++) {
			@Pc(7) int local7 = this.anIntArray333[local1];
			this.anIntArray333[local1] = this.anIntArray326[local1];
			this.anIntArray326[local1] = -local7;
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method2138(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static124.aByteArray39.length < this.anInt3081) {
			Static124.aByteArray39 = new byte[this.anInt3081 + 100];
		}
		return this.method2128(arg0, Static124.aClass4_Sub2_Sub1_Sub6_3, Static124.aByteArray39);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!da;ILclient!da;I[I)V")
	public void method2139(@OriginalArg(0) Class4_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub2_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2143(arg0, arg1);
			return;
		}
		@Pc(18) Class11 local18 = arg0.aClass11Array1[arg1];
		@Pc(23) Class11 local23 = arg2.aClass11Array1[arg3];
		@Pc(26) Class4_Sub12 local26 = local18.aClass4_Sub12_1;
		Static124.anInt3091 = 0;
		Static124.anInt3090 = 0;
		Static124.anInt3086 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt347; local41++) {
			local47 = local18.anIntArray42[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray198[local47] == 0) {
				this.method2136(local26.anIntArray198[local47], local26.anIntArrayArray15[local47], local18.anIntArray41[local41], local18.anIntArray43[local41], local18.anIntArray39[local41]);
			}
		}
		Static124.anInt3091 = 0;
		Static124.anInt3090 = 0;
		Static124.anInt3086 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt347; local47++) {
			@Pc(112) int local112 = local23.anIntArray42[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray198[local112] == 0) {
				this.method2136(local26.anIntArray198[local112], local26.anIntArrayArray15[local112], local23.anIntArray41[local47], local23.anIntArray43[local47], local23.anIntArray39[local47]);
			}
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "()I")
	public int method2141() {
		this.method2150();
		return this.anInt3079;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZI)V")
	private void method2142(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3078 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt3078; local6++) {
			Static124.anIntArray344[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt3081; local18++) {
			if (this.anIntArray334[local18] != -2) {
				local30 = this.anIntArray327[local18];
				local35 = this.anIntArray329[local18];
				local40 = this.anIntArray336[local18];
				local44 = Static124.anIntArray354[local30];
				local48 = Static124.anIntArray354[local35];
				local52 = Static124.anIntArray354[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static124.anIntArray356[local30];
					local71 = Static124.anIntArray356[local35];
					@Pc(75) int local75 = Static124.anIntArray356[local40];
					@Pc(79) int local79 = Static124.anIntArray351[local30];
					local83 = Static124.anIntArray351[local35];
					local87 = Static124.anIntArray351[local40];
					@Pc(91) int local91 = Static124.anIntArray340[local30];
					local95 = Static124.anIntArray340[local35];
					@Pc(99) int local99 = Static124.anIntArray340[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static124.aBooleanArray17[local18] = true;
						@Pc(180) int local180 = (Static124.anIntArray345[local30] + Static124.anIntArray345[local35] + Static124.anIntArray345[local40]) / 3 + this.anInt3080;
						Static124.anIntArrayArray27[local180][Static124.anIntArray344[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method2147(Static124.anInt3087, Static124.anInt3088, Static124.anIntArray349[local30], Static124.anIntArray349[local35], Static124.anIntArray349[local40], local44, local48, local52)) {
						Static124.anIntArray342[Static124.anInt3089++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static124.anIntArray349[local40] - Static124.anIntArray349[local35]) - (Static124.anIntArray349[local30] - Static124.anIntArray349[local35]) * (local52 - local48) > 0) {
						Static124.aBooleanArray17[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static57.anInt1542 && local48 <= Static57.anInt1542 && local52 <= Static57.anInt1542) {
							Static124.aBooleanArray18[local18] = false;
						} else {
							Static124.aBooleanArray18[local18] = true;
						}
						local67 = (Static124.anIntArray345[local30] + Static124.anIntArray345[local35] + Static124.anIntArray345[local40]) / 3 + this.anInt3080;
						Static124.anIntArrayArray27[local67][Static124.anIntArray344[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray35 == null) {
			for (local30 = this.anInt3078 - 1; local30 >= 0; local30--) {
				local35 = Static124.anIntArray344[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static124.anIntArrayArray27[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method2148(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static124.anIntArray339[local30] = 0;
			Static124.anIntArray343[local30] = 0;
		}
		for (local35 = this.anInt3078 - 1; local35 >= 0; local35--) {
			local40 = Static124.anIntArray344[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static124.anIntArrayArray27[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray35[local52];
					local71 = Static124.anIntArray339[local388]++;
					Static124.anIntArrayArray28[local388][local71] = local52;
					if (local388 < 10) {
						Static124.anIntArray343[local388] += local35;
					} else if (local388 == 10) {
						Static124.anIntArray346[local71] = local35;
					} else {
						Static124.anIntArray347[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static124.anIntArray339[1] > 0 || Static124.anIntArray339[2] > 0) {
			local40 = (Static124.anIntArray343[1] + Static124.anIntArray343[2]) / (Static124.anIntArray339[1] + Static124.anIntArray339[2]);
		}
		local44 = 0;
		if (Static124.anIntArray339[3] > 0 || Static124.anIntArray339[4] > 0) {
			local44 = (Static124.anIntArray343[3] + Static124.anIntArray343[4]) / (Static124.anIntArray339[3] + Static124.anIntArray339[4]);
		}
		local48 = 0;
		if (Static124.anIntArray339[6] > 0 || Static124.anIntArray339[8] > 0) {
			local48 = (Static124.anIntArray343[6] + Static124.anIntArray343[8]) / (Static124.anIntArray339[6] + Static124.anIntArray339[8]);
		}
		local67 = 0;
		local71 = Static124.anIntArray339[10];
		@Pc(521) int[] local521 = Static124.anIntArrayArray28[10];
		@Pc(523) int[] local523 = Static124.anIntArray346;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static124.anIntArray339[11];
			local521 = Static124.anIntArrayArray28[11];
			local523 = Static124.anIntArray347;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method2148(local521[local67++]);
				if (local67 == local71 && local521 != Static124.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static124.anIntArray339[11];
					local521 = Static124.anIntArrayArray28[11];
					local523 = Static124.anIntArray347;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method2148(local521[local67++]);
				if (local67 == local71 && local521 != Static124.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static124.anIntArray339[11];
					local521 = Static124.anIntArrayArray28[11];
					local523 = Static124.anIntArray347;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method2148(local521[local67++]);
				if (local67 == local71 && local521 != Static124.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static124.anIntArray339[11];
					local521 = Static124.anIntArrayArray28[11];
					local523 = Static124.anIntArray347;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static124.anIntArray339[local83];
			@Pc(686) int[] local686 = Static124.anIntArrayArray28[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method2148(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method2148(local521[local67++]);
			if (local67 == local71 && local521 != Static124.anIntArrayArray28[11]) {
				local67 = 0;
				local521 = Static124.anIntArrayArray28[11];
				local71 = Static124.anIntArray339[11];
				local523 = Static124.anIntArray347;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!da;I)V")
	public void method2143(@OriginalArg(0) Class4_Sub2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray25 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class11 local12 = arg0.aClass11Array1[arg1];
		@Pc(15) Class4_Sub12 local15 = local12.aClass4_Sub12_1;
		Static124.anInt3091 = 0;
		Static124.anInt3090 = 0;
		Static124.anInt3086 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt347; local23++) {
			@Pc(29) int local29 = local12.anIntArray42[local23];
			this.method2136(local15.anIntArray198[local29], local15.anIntArrayArray15[local29], local12.anIntArray41[local23], local12.anIntArray43[local23], local12.anIntArray39[local23]);
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	public void method2144(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static124.anIntArray341[arg0];
		@Pc(7) int local7 = Static124.anIntArray355[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3084; local9++) {
			@Pc(26) int local26 = this.anIntArray331[local9] * local7 - this.anIntArray326[local9] * local3 >> 16;
			this.anIntArray326[local9] = this.anIntArray331[local9] * local3 + this.anIntArray326[local9] * local7 >> 16;
			this.anIntArray331[local9] = local26;
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
	public void method2145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static124.anIntArray344[0] = -1;
		if (this.anInt3085 != 2 && this.anInt3085 != 1) {
			this.method2132();
		}
		@Pc(15) int local15 = Static57.anInt1544;
		@Pc(17) int local17 = Static57.anInt1546;
		@Pc(21) int local21 = Static124.anIntArray341[0];
		@Pc(25) int local25 = Static124.anIntArray355[0];
		@Pc(29) int local29 = Static124.anIntArray341[arg0];
		@Pc(33) int local33 = Static124.anIntArray355[arg0];
		@Pc(37) int local37 = Static124.anIntArray341[arg1];
		@Pc(41) int local41 = Static124.anIntArray355[arg1];
		@Pc(45) int local45 = Static124.anIntArray341[arg2];
		@Pc(49) int local49 = Static124.anIntArray355[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt3084; local61++) {
			@Pc(67) int local67 = this.anIntArray333[local61];
			@Pc(72) int local72 = this.anIntArray331[local61];
			@Pc(77) int local77 = this.anIntArray326[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static124.anIntArray345[local61] = local77 - local59;
			Static124.anIntArray354[local61] = local15 + (local67 << 9) / local77;
			Static124.anIntArray349[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt3083 > 0) {
				Static124.anIntArray356[local61] = local67;
				Static124.anIntArray351[local61] = local89;
				Static124.anIntArray340[local61] = local77;
			}
		}
		try {
			this.method2142(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public void method2146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3084; local1++) {
			this.anIntArray333[local1] += arg0;
			this.anIntArray331[local1] += arg1;
			this.anIntArray326[local1] += arg2;
		}
		this.anInt3085 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	private void method2148(@OriginalArg(0) int arg0) {
		if (Static124.aBooleanArray17[arg0]) {
			this.method2134(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray327[arg0];
		@Pc(17) int local17 = this.anIntArray329[arg0];
		@Pc(22) int local22 = this.anIntArray336[arg0];
		Static57.aBoolean82 = Static124.aBooleanArray18[arg0];
		if (this.aByteArray36 == null) {
			Static57.anInt1543 = 0;
		} else {
			Static57.anInt1543 = this.aByteArray36[arg0] & 0xFF;
		}
		if (this.aByteArray37 != null && this.aByteArray37[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray37[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray330[local119];
			@Pc(129) int local129 = this.anIntArray335[local119];
			@Pc(134) int local134 = this.anIntArray332[local119];
			if (this.anIntArray334[arg0] == -1) {
				Static57.method1037(Static124.anIntArray349[local12], Static124.anIntArray349[local17], Static124.anIntArray349[local22], Static124.anIntArray354[local12], Static124.anIntArray354[local17], Static124.anIntArray354[local22], this.anIntArray328[arg0], this.anIntArray328[arg0], this.anIntArray328[arg0], Static124.anIntArray356[local124], Static124.anIntArray356[local129], Static124.anIntArray356[local134], Static124.anIntArray351[local124], Static124.anIntArray351[local129], Static124.anIntArray351[local134], Static124.anIntArray340[local124], Static124.anIntArray340[local129], Static124.anIntArray340[local134], this.aShortArray14[arg0]);
			} else {
				Static57.method1037(Static124.anIntArray349[local12], Static124.anIntArray349[local17], Static124.anIntArray349[local22], Static124.anIntArray354[local12], Static124.anIntArray354[local17], Static124.anIntArray354[local22], this.anIntArray328[arg0], this.anIntArray337[arg0], this.anIntArray334[arg0], Static124.anIntArray356[local124], Static124.anIntArray356[local129], Static124.anIntArray356[local134], Static124.anIntArray351[local124], Static124.anIntArray351[local129], Static124.anIntArray351[local134], Static124.anIntArray340[local124], Static124.anIntArray340[local129], Static124.anIntArray340[local134], this.aShortArray14[arg0]);
			}
		} else if (this.anIntArray334[arg0] == -1) {
			Static57.method1035(Static124.anIntArray349[local12], Static124.anIntArray349[local17], Static124.anIntArray349[local22], Static124.anIntArray354[local12], Static124.anIntArray354[local17], Static124.anIntArray354[local22], Static124.anIntArray348[this.anIntArray328[arg0]]);
		} else {
			Static57.method1029(Static124.anIntArray349[local12], Static124.anIntArray349[local17], Static124.anIntArray349[local22], Static124.anIntArray354[local12], Static124.anIntArray354[local17], Static124.anIntArray354[local22], this.anIntArray328[arg0], this.anIntArray337[arg0], this.anIntArray334[arg0]);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIZ)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method2149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class4_Sub2_Sub1_Sub6 local16;
		if (arg4) {
			local16 = new Class4_Sub2_Sub1_Sub6();
			local16.anInt3084 = this.anInt3084;
			local16.anInt3081 = this.anInt3081;
			local16.anInt3083 = this.anInt3083;
			local16.anIntArray333 = this.anIntArray333;
			local16.anIntArray326 = this.anIntArray326;
			local16.anIntArray327 = this.anIntArray327;
			local16.anIntArray329 = this.anIntArray329;
			local16.anIntArray336 = this.anIntArray336;
			local16.anIntArray328 = this.anIntArray328;
			local16.anIntArray337 = this.anIntArray337;
			local16.anIntArray334 = this.anIntArray334;
			local16.aByteArray35 = this.aByteArray35;
			local16.aByteArray36 = this.aByteArray36;
			local16.aByteArray37 = this.aByteArray37;
			local16.aShortArray14 = this.aShortArray14;
			local16.aByte8 = this.aByte8;
			local16.anIntArray330 = this.anIntArray330;
			local16.anIntArray335 = this.anIntArray335;
			local16.anIntArray332 = this.anIntArray332;
			local16.anIntArrayArray25 = this.anIntArrayArray25;
			local16.anIntArrayArray26 = this.anIntArrayArray26;
			local16.aBoolean152 = this.aBoolean152;
			local16.anIntArray331 = new int[local16.anInt3084];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt3084; local124++) {
			@Pc(130) int local130 = this.anIntArray333[local124];
			@Pc(135) int local135 = this.anIntArray331[local124];
			@Pc(140) int local140 = this.anIntArray326[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray331[local124] = local135 + local176 - local122;
		}
		local16.anInt3085 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "()V")
	public void method2150() {
		if (this.anInt3085 == 1) {
			return;
		}
		this.anInt3085 = 1;
		super.anInt3118 = 0;
		this.anInt3082 = 0;
		this.anInt3079 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt3084; local18++) {
			@Pc(24) int local24 = this.anIntArray333[local18];
			@Pc(29) int local29 = this.anIntArray331[local18];
			@Pc(34) int local34 = this.anIntArray326[local18];
			if (-local29 > super.anInt3118) {
				super.anInt3118 = -local29;
			}
			if (local29 > this.anInt3082) {
				this.anInt3082 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt3079) {
				this.anInt3079 = local58;
			}
		}
		this.anInt3079 = (int) (Math.sqrt((double) this.anInt3079) + 0.99D);
		this.anInt3080 = (int) (Math.sqrt((double) (this.anInt3079 * this.anInt3079 + super.anInt3118 * super.anInt3118)) + 0.99D);
		this.anInt3078 = this.anInt3080 + (int) (Math.sqrt((double) (this.anInt3079 * this.anInt3079 + this.anInt3082 * this.anInt3082)) + 0.99D);
	}
}
