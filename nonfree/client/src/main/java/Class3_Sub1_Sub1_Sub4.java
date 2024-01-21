import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ea", name = "nb", descriptor = "[I")
	public int[] anIntArray91;

	@OriginalMember(owner = "client!ea", name = "ob", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!ea", name = "pb", descriptor = "[[I")
	public int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!ea", name = "rb", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!ea", name = "sb", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ea", name = "tb", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!ea", name = "ub", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!ea", name = "vb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ea", name = "xb", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!ea", name = "Ab", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!ea", name = "Bb", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!ea", name = "Cb", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!ea", name = "Db", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!ea", name = "Eb", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!ea", name = "Fb", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ea", name = "Ib", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!ea", name = "Kb", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!ea", name = "Lb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!ea", name = "Mb", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!ea", name = "Nb", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!ea", name = "Ob", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!ea", name = "Pb", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!ea", name = "wb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ea", name = "zb", descriptor = "I")
	public int anInt965 = 0;

	@OriginalMember(owner = "client!ea", name = "yb", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!ea", name = "Hb", descriptor = "I")
	public int anInt967 = 0;

	@OriginalMember(owner = "client!ea", name = "Gb", descriptor = "I")
	public int anInt966 = 0;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([Lclient!ea;I)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) Class3_Sub1_Sub1_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt966 = 0;
		this.anInt967 = 0;
		this.anInt965 = 0;
		this.aByte8 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class3_Sub1_Sub1_Sub4 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt966 += local41.anInt966;
				this.anInt967 += local41.anInt967;
				this.anInt965 += local41.anInt965;
				if (local41.aByteArray25 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local41.aByte8;
					}
					if (this.aByte8 != local41.aByte8) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray23 != null;
				local22 |= local41.aByteArray24 != null;
			}
		}
		this.anIntArray102 = new int[this.anInt966];
		this.anIntArray98 = new int[this.anInt966];
		this.anIntArray94 = new int[this.anInt966];
		this.anIntArray93 = new int[this.anInt967];
		this.anIntArray91 = new int[this.anInt967];
		this.anIntArray95 = new int[this.anInt967];
		this.anIntArray100 = new int[this.anInt967];
		this.anIntArray97 = new int[this.anInt967];
		this.anIntArray96 = new int[this.anInt967];
		if (this.anInt965 > 0) {
			this.anIntArray99 = new int[this.anInt965];
			this.anIntArray101 = new int[this.anInt965];
			this.anIntArray92 = new int[this.anInt965];
		}
		if (local18) {
			this.aByteArray25 = new byte[this.anInt967];
		}
		if (local20) {
			this.aByteArray23 = new byte[this.anInt967];
		}
		if (local22) {
			this.aByteArray24 = new byte[this.anInt967];
			this.aShortArray4 = new short[this.anInt967];
		}
		this.anInt966 = 0;
		this.anInt967 = 0;
		this.anInt965 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class3_Sub1_Sub1_Sub4 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt966;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt966; local221++) {
					this.anIntArray102[this.anInt966] = local214.anIntArray102[local221];
					this.anIntArray98[this.anInt966] = local214.anIntArray98[local221];
					this.anIntArray94[this.anInt966] = local214.anIntArray94[local221];
					this.anInt966++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt967; local262++) {
					this.anIntArray93[this.anInt967] = local214.anIntArray93[local262] + local219;
					this.anIntArray91[this.anInt967] = local214.anIntArray91[local262] + local219;
					this.anIntArray95[this.anInt967] = local214.anIntArray95[local262] + local219;
					this.anIntArray100[this.anInt967] = local214.anIntArray100[local262];
					this.anIntArray97[this.anInt967] = local214.anIntArray97[local262];
					this.anIntArray96[this.anInt967] = local214.anIntArray96[local262];
					if (local18) {
						if (local214.aByteArray25 == null) {
							this.aByteArray25[this.anInt967] = local214.aByte8;
						} else {
							this.aByteArray25[this.anInt967] = local214.aByteArray25[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray23 == null) {
							this.aByteArray23[this.anInt967] = 0;
						} else {
							this.aByteArray23[this.anInt967] = local214.aByteArray23[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray24 == null || local214.aByteArray24[local262] == -1) {
							this.aByteArray24[this.anInt967] = -1;
						} else {
							this.aByteArray24[this.anInt967] = (byte) (local214.aByteArray24[local262] + local207);
							this.aShortArray4[this.anInt967] = local214.aShortArray4[local262];
						}
					}
					this.anInt967++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt965; local418++) {
					this.anIntArray99[this.anInt965] = local214.anIntArray99[local418] + local219;
					this.anIntArray101[this.anInt965] = local214.anIntArray101[local418] + local219;
					this.anIntArray92[this.anInt965] = local214.anIntArray92[local418] + local219;
					this.anInt965++;
				}
				local207 += local214.anInt965;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIII)V")
	public void method620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static25.anIntArray116[0] = -1;
		if (this.anInt970 != 2 && this.anInt970 != 1) {
			this.method642();
		}
		@Pc(15) int local15 = Static7.anInt310;
		@Pc(17) int local17 = Static7.anInt313;
		@Pc(21) int local21 = Static25.anIntArray121[0];
		@Pc(25) int local25 = Static25.anIntArray107[0];
		@Pc(29) int local29 = Static25.anIntArray121[arg0];
		@Pc(33) int local33 = Static25.anIntArray107[arg0];
		@Pc(37) int local37 = Static25.anIntArray121[arg1];
		@Pc(41) int local41 = Static25.anIntArray107[arg1];
		@Pc(45) int local45 = Static25.anIntArray121[arg2];
		@Pc(49) int local49 = Static25.anIntArray107[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt966; local61++) {
			@Pc(67) int local67 = this.anIntArray102[local61];
			@Pc(72) int local72 = this.anIntArray98[local61];
			@Pc(77) int local77 = this.anIntArray94[local61];
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
			Static25.anIntArray108[local61] = local77 - local59;
			Static25.anIntArray114[local61] = local15 + (local67 << 9) / arg6;
			Static25.anIntArray104[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt965 > 0) {
				Static25.anIntArray120[local61] = local67;
				Static25.anIntArray118[local61] = local89;
				Static25.anIntArray103[local61] = local77;
			}
		}
		try {
			this.method626(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)V")
	private void method621(@OriginalArg(0) int arg0) {
		if (Static25.aBooleanArray25[arg0]) {
			this.method635(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray93[arg0];
		@Pc(17) int local17 = this.anIntArray91[arg0];
		@Pc(22) int local22 = this.anIntArray95[arg0];
		Static7.aBoolean8 = Static25.aBooleanArray24[arg0];
		if (this.aByteArray23 == null) {
			Static7.anInt314 = 0;
		} else {
			Static7.anInt314 = this.aByteArray23[arg0] & 0xFF;
		}
		if (this.aByteArray24 != null && this.aByteArray24[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray24[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray99[local119];
			@Pc(129) int local129 = this.anIntArray101[local119];
			@Pc(134) int local134 = this.anIntArray92[local119];
			if (this.anIntArray96[arg0] == -1) {
				Static7.method278(Static25.anIntArray104[local12], Static25.anIntArray104[local17], Static25.anIntArray104[local22], Static25.anIntArray114[local12], Static25.anIntArray114[local17], Static25.anIntArray114[local22], this.anIntArray100[arg0], this.anIntArray100[arg0], this.anIntArray100[arg0], Static25.anIntArray120[local124], Static25.anIntArray120[local129], Static25.anIntArray120[local134], Static25.anIntArray118[local124], Static25.anIntArray118[local129], Static25.anIntArray118[local134], Static25.anIntArray103[local124], Static25.anIntArray103[local129], Static25.anIntArray103[local134], this.aShortArray4[arg0]);
			} else {
				Static7.method278(Static25.anIntArray104[local12], Static25.anIntArray104[local17], Static25.anIntArray104[local22], Static25.anIntArray114[local12], Static25.anIntArray114[local17], Static25.anIntArray114[local22], this.anIntArray100[arg0], this.anIntArray97[arg0], this.anIntArray96[arg0], Static25.anIntArray120[local124], Static25.anIntArray120[local129], Static25.anIntArray120[local134], Static25.anIntArray118[local124], Static25.anIntArray118[local129], Static25.anIntArray118[local134], Static25.anIntArray103[local124], Static25.anIntArray103[local129], Static25.anIntArray103[local134], this.aShortArray4[arg0]);
			}
		} else if (this.anIntArray96[arg0] == -1) {
			Static7.method277(Static25.anIntArray104[local12], Static25.anIntArray104[local17], Static25.anIntArray104[local22], Static25.anIntArray114[local12], Static25.anIntArray114[local17], Static25.anIntArray114[local22], Static25.anIntArray106[this.anIntArray100[arg0]]);
		} else {
			Static7.method280(Static25.anIntArray104[local12], Static25.anIntArray104[local17], Static25.anIntArray104[local22], Static25.anIntArray114[local12], Static25.anIntArray114[local17], Static25.anIntArray114[local22], this.anIntArray100[arg0], this.anIntArray97[arg0], this.anIntArray96[arg0]);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZ)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub1_Sub4 local16;
		if (arg4) {
			local16 = new Class3_Sub1_Sub1_Sub4();
			local16.anInt966 = this.anInt966;
			local16.anInt967 = this.anInt967;
			local16.anInt965 = this.anInt965;
			local16.anIntArray102 = this.anIntArray102;
			local16.anIntArray94 = this.anIntArray94;
			local16.anIntArray93 = this.anIntArray93;
			local16.anIntArray91 = this.anIntArray91;
			local16.anIntArray95 = this.anIntArray95;
			local16.anIntArray100 = this.anIntArray100;
			local16.anIntArray97 = this.anIntArray97;
			local16.anIntArray96 = this.anIntArray96;
			local16.aByteArray25 = this.aByteArray25;
			local16.aByteArray23 = this.aByteArray23;
			local16.aByteArray24 = this.aByteArray24;
			local16.aShortArray4 = this.aShortArray4;
			local16.aByte8 = this.aByte8;
			local16.anIntArray99 = this.anIntArray99;
			local16.anIntArray101 = this.anIntArray101;
			local16.anIntArray92 = this.anIntArray92;
			local16.anIntArrayArray23 = this.anIntArrayArray23;
			local16.anIntArrayArray24 = this.anIntArrayArray24;
			local16.aBoolean29 = this.aBoolean29;
			local16.anIntArray98 = new int[local16.anInt966];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt966; local124++) {
			@Pc(130) int local130 = this.anIntArray102[local124];
			@Pc(135) int local135 = this.anIntArray98[local124];
			@Pc(140) int local140 = this.anIntArray94[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray98[local124] = local135 + local176 - local122;
		}
		local16.anInt970 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[IIII)V")
	private void method624(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static25.anInt977 = 0;
			Static25.anInt975 = 0;
			Static25.anInt972 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray23.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray23[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static25.anInt977 += this.anIntArray102[local36];
						Static25.anInt975 += this.anIntArray98[local36];
						Static25.anInt972 += this.anIntArray94[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static25.anInt977 = Static25.anInt977 / local6 + arg2;
				Static25.anInt975 = Static25.anInt975 / local6 + arg3;
				Static25.anInt972 = Static25.anInt972 / local6 + arg4;
			} else {
				Static25.anInt977 = arg2;
				Static25.anInt975 = arg3;
				Static25.anInt972 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray102[local31] += arg2;
						this.anIntArray98[local31] += arg3;
						this.anIntArray94[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray102[local31] -= Static25.anInt977;
						this.anIntArray98[local31] -= Static25.anInt975;
						this.anIntArray94[local31] -= Static25.anInt972;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static25.anIntArray121[local225];
							local235 = Static25.anIntArray107[local225];
							local251 = this.anIntArray98[local31] * local231 + this.anIntArray102[local31] * local235 >> 16;
							this.anIntArray98[local31] = this.anIntArray98[local31] * local235 - this.anIntArray102[local31] * local231 >> 16;
							this.anIntArray102[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static25.anIntArray121[local36];
							local235 = Static25.anIntArray107[local36];
							local251 = this.anIntArray98[local31] * local235 - this.anIntArray94[local31] * local231 >> 16;
							this.anIntArray94[local31] = this.anIntArray98[local31] * local231 + this.anIntArray94[local31] * local235 >> 16;
							this.anIntArray98[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static25.anIntArray121[local219];
							local235 = Static25.anIntArray107[local219];
							local251 = this.anIntArray94[local31] * local231 + this.anIntArray102[local31] * local235 >> 16;
							this.anIntArray94[local31] = this.anIntArray94[local31] * local235 - this.anIntArray102[local31] * local231 >> 16;
							this.anIntArray102[local31] = local251;
						}
						this.anIntArray102[local31] += Static25.anInt977;
						this.anIntArray98[local31] += Static25.anInt975;
						this.anIntArray94[local31] += Static25.anInt972;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray102[local31] -= Static25.anInt977;
						this.anIntArray98[local31] -= Static25.anInt975;
						this.anIntArray94[local31] -= Static25.anInt972;
						this.anIntArray102[local31] = this.anIntArray102[local31] * arg2 / 128;
						this.anIntArray98[local31] = this.anIntArray98[local31] * arg3 / 128;
						this.anIntArray94[local31] = this.anIntArray94[local31] * arg4 / 128;
						this.anIntArray102[local31] += Static25.anInt977;
						this.anIntArray98[local31] += Static25.anInt975;
						this.anIntArray94[local31] += Static25.anInt972;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray24 != null && this.aByteArray23 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray24.length) {
					local115 = this.anIntArrayArray24[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray23[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray23[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!g;ILclient!g;I[I)V")
	public void method625(@OriginalArg(0) Class3_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method636(arg0, arg1);
			return;
		}
		@Pc(18) Class30 local18 = arg0.aClass30Array1[arg1];
		@Pc(23) Class30 local23 = arg2.aClass30Array1[arg3];
		@Pc(26) Class3_Sub16 local26 = local18.aClass3_Sub16_1;
		Static25.anInt977 = 0;
		Static25.anInt975 = 0;
		Static25.anInt972 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1449; local41++) {
			local47 = local18.anIntArray175[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray266[local47] == 0) {
				this.method624(local26.anIntArray266[local47], local26.anIntArrayArray62[local47], local18.anIntArray171[local41], local18.anIntArray178[local41], local18.anIntArray172[local41]);
			}
		}
		Static25.anInt977 = 0;
		Static25.anInt975 = 0;
		Static25.anInt972 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1449; local47++) {
			@Pc(112) int local112 = local23.anIntArray175[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray266[local112] == 0) {
				this.method624(local26.anIntArray266[local112], local26.anIntArrayArray62[local112], local23.anIntArray171[local47], local23.anIntArray178[local47], local23.anIntArray172[local47]);
			}
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static25.anIntArray116[0] = -1;
		if (this.anInt970 != 1) {
			this.method628();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt969 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt969 << 9;
		if (local64 / local40 >= Static7.anInt311) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt969 << 9;
		if (local77 / local40 <= Static7.anInt312) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt969 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static7.anInt318) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3333 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static7.anInt315) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3333 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt965 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static25.aBoolean30) {
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
			local219 = Static25.anInt976 - Static7.anInt310;
			local223 = Static25.anInt973 - Static7.anInt313;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean29) {
					Static25.anIntArray111[Static25.anInt974++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static7.anInt310;
		local219 = Static7.anInt313;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static25.anIntArray121[arg0];
			local257 = Static25.anIntArray107[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt966; local269++) {
			@Pc(275) int local275 = this.anIntArray102[local269];
			@Pc(280) int local280 = this.anIntArray98[local269];
			@Pc(285) int local285 = this.anIntArray94[local269];
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
			Static25.anIntArray108[local269] = local285 - local29;
			if (local285 >= 50) {
				Static25.anIntArray114[local269] = local172 + (local275 << 9) / local285;
				Static25.anIntArray104[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static25.anIntArray114[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static25.anIntArray120[local269] = local275;
				Static25.anIntArray118[local269] = local297;
				Static25.anIntArray103[local269] = local285;
			}
		}
		try {
			this.method626(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZI)V")
	private void method626(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt968 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt968; local6++) {
			Static25.anIntArray116[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt967; local18++) {
			if (this.anIntArray96[local18] != -2) {
				local30 = this.anIntArray93[local18];
				local35 = this.anIntArray91[local18];
				local40 = this.anIntArray95[local18];
				local44 = Static25.anIntArray114[local30];
				local48 = Static25.anIntArray114[local35];
				local52 = Static25.anIntArray114[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static25.anIntArray120[local30];
					local71 = Static25.anIntArray120[local35];
					@Pc(75) int local75 = Static25.anIntArray120[local40];
					@Pc(79) int local79 = Static25.anIntArray118[local30];
					local83 = Static25.anIntArray118[local35];
					local87 = Static25.anIntArray118[local40];
					@Pc(91) int local91 = Static25.anIntArray103[local30];
					local95 = Static25.anIntArray103[local35];
					@Pc(99) int local99 = Static25.anIntArray103[local40];
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
						Static25.aBooleanArray25[local18] = true;
						@Pc(180) int local180 = (Static25.anIntArray108[local30] + Static25.anIntArray108[local35] + Static25.anIntArray108[local40]) / 3 + this.anInt964;
						Static25.anIntArrayArray25[local180][Static25.anIntArray116[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method640(Static25.anInt976, Static25.anInt973, Static25.anIntArray104[local30], Static25.anIntArray104[local35], Static25.anIntArray104[local40], local44, local48, local52)) {
						Static25.anIntArray111[Static25.anInt974++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static25.anIntArray104[local40] - Static25.anIntArray104[local35]) - (Static25.anIntArray104[local30] - Static25.anIntArray104[local35]) * (local52 - local48) > 0) {
						Static25.aBooleanArray25[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static7.anInt316 && local48 <= Static7.anInt316 && local52 <= Static7.anInt316) {
							Static25.aBooleanArray24[local18] = false;
						} else {
							Static25.aBooleanArray24[local18] = true;
						}
						local67 = (Static25.anIntArray108[local30] + Static25.anIntArray108[local35] + Static25.anIntArray108[local40]) / 3 + this.anInt964;
						Static25.anIntArrayArray25[local67][Static25.anIntArray116[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray25 == null) {
			for (local30 = this.anInt968 - 1; local30 >= 0; local30--) {
				local35 = Static25.anIntArray116[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static25.anIntArrayArray25[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method621(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static25.anIntArray119[local30] = 0;
			Static25.anIntArray112[local30] = 0;
		}
		for (local35 = this.anInt968 - 1; local35 >= 0; local35--) {
			local40 = Static25.anIntArray116[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static25.anIntArrayArray25[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray25[local52];
					local71 = Static25.anIntArray119[local388]++;
					Static25.anIntArrayArray26[local388][local71] = local52;
					if (local388 < 10) {
						Static25.anIntArray112[local388] += local35;
					} else if (local388 == 10) {
						Static25.anIntArray109[local71] = local35;
					} else {
						Static25.anIntArray113[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static25.anIntArray119[1] > 0 || Static25.anIntArray119[2] > 0) {
			local40 = (Static25.anIntArray112[1] + Static25.anIntArray112[2]) / (Static25.anIntArray119[1] + Static25.anIntArray119[2]);
		}
		local44 = 0;
		if (Static25.anIntArray119[3] > 0 || Static25.anIntArray119[4] > 0) {
			local44 = (Static25.anIntArray112[3] + Static25.anIntArray112[4]) / (Static25.anIntArray119[3] + Static25.anIntArray119[4]);
		}
		local48 = 0;
		if (Static25.anIntArray119[6] > 0 || Static25.anIntArray119[8] > 0) {
			local48 = (Static25.anIntArray112[6] + Static25.anIntArray112[8]) / (Static25.anIntArray119[6] + Static25.anIntArray119[8]);
		}
		local67 = 0;
		local71 = Static25.anIntArray119[10];
		@Pc(521) int[] local521 = Static25.anIntArrayArray26[10];
		@Pc(523) int[] local523 = Static25.anIntArray109;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static25.anIntArray119[11];
			local521 = Static25.anIntArrayArray26[11];
			local523 = Static25.anIntArray113;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method621(local521[local67++]);
				if (local67 == local71 && local521 != Static25.anIntArrayArray26[11]) {
					local67 = 0;
					local71 = Static25.anIntArray119[11];
					local521 = Static25.anIntArrayArray26[11];
					local523 = Static25.anIntArray113;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method621(local521[local67++]);
				if (local67 == local71 && local521 != Static25.anIntArrayArray26[11]) {
					local67 = 0;
					local71 = Static25.anIntArray119[11];
					local521 = Static25.anIntArrayArray26[11];
					local523 = Static25.anIntArray113;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method621(local521[local67++]);
				if (local67 == local71 && local521 != Static25.anIntArrayArray26[11]) {
					local67 = 0;
					local71 = Static25.anIntArray119[11];
					local521 = Static25.anIntArrayArray26[11];
					local523 = Static25.anIntArray113;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static25.anIntArray119[local83];
			@Pc(686) int[] local686 = Static25.anIntArrayArray26[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method621(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method621(local521[local67++]);
			if (local67 == local71 && local521 != Static25.anIntArrayArray26[11]) {
				local67 = 0;
				local521 = Static25.anIntArrayArray26[11];
				local71 = Static25.anIntArray119[11];
				local523 = Static25.anIntArray113;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method627(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static25.aByteArray26.length < this.anInt967) {
			Static25.aByteArray26 = new byte[this.anInt967 + 100];
		}
		return this.method638(arg0, Static25.aClass3_Sub1_Sub1_Sub4_2, Static25.aByteArray26);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
	public void method628() {
		if (this.anInt970 == 1) {
			return;
		}
		this.anInt970 = 1;
		super.anInt3333 = 0;
		this.anInt971 = 0;
		this.anInt969 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt966; local18++) {
			@Pc(24) int local24 = this.anIntArray102[local18];
			@Pc(29) int local29 = this.anIntArray98[local18];
			@Pc(34) int local34 = this.anIntArray94[local18];
			if (-local29 > super.anInt3333) {
				super.anInt3333 = -local29;
			}
			if (local29 > this.anInt971) {
				this.anInt971 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt969) {
				this.anInt969 = local58;
			}
		}
		this.anInt969 = (int) (Math.sqrt((double) this.anInt969) + 0.99D);
		this.anInt964 = (int) (Math.sqrt((double) (this.anInt969 * this.anInt969 + super.anInt3333 * super.anInt3333)) + 0.99D);
		this.anInt968 = this.anInt964 + (int) (Math.sqrt((double) (this.anInt969 * this.anInt969 + this.anInt971 * this.anInt971)) + 0.99D);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method629(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static25.aByteArray27.length < this.anInt967) {
			Static25.aByteArray27 = new byte[this.anInt967 + 100];
		}
		return this.method638(arg0, Static25.aClass3_Sub1_Sub1_Sub4_3, Static25.aByteArray27);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
	public int method630() {
		this.method628();
		return this.anInt969;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public void method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt966; local1++) {
			this.anIntArray102[local1] += arg0;
			this.anIntArray98[local1] += arg1;
			this.anIntArray94[local1] += arg2;
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public void method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt966; local1++) {
			this.anIntArray102[local1] = this.anIntArray102[local1] * arg0 / 128;
			this.anIntArray98[local1] = this.anIntArray98[local1] * arg1 / 128;
			this.anIntArray94[local1] = this.anIntArray94[local1] * arg2 / 128;
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()V")
	public void method633() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt966; local1++) {
			@Pc(7) int local7 = this.anIntArray102[local1];
			this.anIntArray102[local1] = this.anIntArray94[local1];
			this.anIntArray94[local1] = -local7;
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "()V")
	public void method634() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt966; local1++) {
			@Pc(7) int local7 = this.anIntArray94[local1];
			this.anIntArray94[local1] = this.anIntArray102[local1];
			this.anIntArray102[local1] = -local7;
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(I)V")
	private void method635(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static7.anInt310;
		@Pc(3) int local3 = Static7.anInt313;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray93[arg0];
		@Pc(15) int local15 = this.anIntArray91[arg0];
		@Pc(20) int local20 = this.anIntArray95[arg0];
		@Pc(24) int local24 = Static25.anIntArray103[local10];
		@Pc(28) int local28 = Static25.anIntArray103[local15];
		@Pc(32) int local32 = Static25.anIntArray103[local20];
		if (this.aByteArray23 == null) {
			Static7.anInt314 = 0;
		} else {
			Static7.anInt314 = this.aByteArray23[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static25.anIntArray115[0] = Static25.anIntArray114[local10];
			Static25.anIntArray105[0] = Static25.anIntArray104[local10];
			local5++;
			Static25.anIntArray117[0] = this.anIntArray100[arg0];
		} else {
			local73 = Static25.anIntArray120[local10];
			local77 = Static25.anIntArray118[local10];
			local82 = this.anIntArray100[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static25.anIntArray110[local32 - local24];
				Static25.anIntArray115[0] = local1 + (local73 + ((Static25.anIntArray120[local20] - local73) * local95 >> 16) << 9) / 50;
				Static25.anIntArray105[0] = local3 + (local77 + ((Static25.anIntArray118[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static25.anIntArray117[0] = local82 + ((this.anIntArray96[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static25.anIntArray110[local28 - local24];
				Static25.anIntArray115[local5] = local1 + (local73 + ((Static25.anIntArray120[local15] - local73) * local95 >> 16) << 9) / 50;
				Static25.anIntArray105[local5] = local3 + (local77 + ((Static25.anIntArray118[local15] - local77) * local95 >> 16) << 9) / 50;
				Static25.anIntArray117[local5++] = local82 + ((this.anIntArray97[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static25.anIntArray115[local5] = Static25.anIntArray114[local15];
			Static25.anIntArray105[local5] = Static25.anIntArray104[local15];
			Static25.anIntArray117[local5++] = this.anIntArray97[arg0];
		} else {
			local73 = Static25.anIntArray120[local15];
			local77 = Static25.anIntArray118[local15];
			local82 = this.anIntArray97[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static25.anIntArray110[local24 - local28];
				Static25.anIntArray115[local5] = local1 + (local73 + ((Static25.anIntArray120[local10] - local73) * local95 >> 16) << 9) / 50;
				Static25.anIntArray105[local5] = local3 + (local77 + ((Static25.anIntArray118[local10] - local77) * local95 >> 16) << 9) / 50;
				Static25.anIntArray117[local5++] = local82 + ((this.anIntArray100[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static25.anIntArray110[local32 - local28];
				Static25.anIntArray115[local5] = local1 + (local73 + ((Static25.anIntArray120[local20] - local73) * local95 >> 16) << 9) / 50;
				Static25.anIntArray105[local5] = local3 + (local77 + ((Static25.anIntArray118[local20] - local77) * local95 >> 16) << 9) / 50;
				Static25.anIntArray117[local5++] = local82 + ((this.anIntArray96[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static25.anIntArray115[local5] = Static25.anIntArray114[local20];
			Static25.anIntArray105[local5] = Static25.anIntArray104[local20];
			Static25.anIntArray117[local5++] = this.anIntArray96[arg0];
		} else {
			local73 = Static25.anIntArray120[local20];
			local77 = Static25.anIntArray118[local20];
			local82 = this.anIntArray96[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static25.anIntArray110[local28 - local32];
				Static25.anIntArray115[local5] = local1 + (local73 + ((Static25.anIntArray120[local15] - local73) * local95 >> 16) << 9) / 50;
				Static25.anIntArray105[local5] = local3 + (local77 + ((Static25.anIntArray118[local15] - local77) * local95 >> 16) << 9) / 50;
				Static25.anIntArray117[local5++] = local82 + ((this.anIntArray97[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static25.anIntArray110[local24 - local32];
				Static25.anIntArray115[local5] = local1 + (local73 + ((Static25.anIntArray120[local10] - local73) * local95 >> 16) << 9) / 50;
				Static25.anIntArray105[local5] = local3 + (local77 + ((Static25.anIntArray118[local10] - local77) * local95 >> 16) << 9) / 50;
				Static25.anIntArray117[local5++] = local82 + ((this.anIntArray100[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static25.anIntArray115[0];
		local77 = Static25.anIntArray115[1];
		local82 = Static25.anIntArray115[2];
		local95 = Static25.anIntArray105[0];
		@Pc(590) int local590 = Static25.anIntArray105[1];
		@Pc(594) int local594 = Static25.anIntArray105[2];
		Static7.aBoolean8 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static7.anInt316 || local77 > Static7.anInt316 || local82 > Static7.anInt316) {
				Static7.aBoolean8 = true;
			}
			if (this.aByteArray24 != null && this.aByteArray24[arg0] != -1) {
				local669 = this.aByteArray24[arg0] & 0xFF;
				local674 = this.anIntArray99[local669];
				local679 = this.anIntArray101[local669];
				local684 = this.anIntArray92[local669];
				if (this.anIntArray96[arg0] == -1) {
					Static7.method278(local95, local590, local594, local73, local77, local82, this.anIntArray100[arg0], this.anIntArray100[arg0], this.anIntArray100[arg0], Static25.anIntArray120[local674], Static25.anIntArray120[local679], Static25.anIntArray120[local684], Static25.anIntArray118[local674], Static25.anIntArray118[local679], Static25.anIntArray118[local684], Static25.anIntArray103[local674], Static25.anIntArray103[local679], Static25.anIntArray103[local684], this.aShortArray4[arg0]);
				} else {
					Static7.method278(local95, local590, local594, local73, local77, local82, Static25.anIntArray117[0], Static25.anIntArray117[1], Static25.anIntArray117[2], Static25.anIntArray120[local674], Static25.anIntArray120[local679], Static25.anIntArray120[local684], Static25.anIntArray118[local674], Static25.anIntArray118[local679], Static25.anIntArray118[local684], Static25.anIntArray103[local674], Static25.anIntArray103[local679], Static25.anIntArray103[local684], this.aShortArray4[arg0]);
				}
			} else if (this.anIntArray96[arg0] == -1) {
				Static7.method277(local95, local590, local594, local73, local77, local82, Static25.anIntArray106[this.anIntArray100[arg0]]);
			} else {
				Static7.method280(local95, local590, local594, local73, local77, local82, Static25.anIntArray117[0], Static25.anIntArray117[1], Static25.anIntArray117[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static7.anInt316 || local77 > Static7.anInt316 || local82 > Static7.anInt316 || Static25.anIntArray115[3] < 0 || Static25.anIntArray115[3] > Static7.anInt316) {
			Static7.aBoolean8 = true;
		}
		if (this.aByteArray24 == null || this.aByteArray24[arg0] == -1) {
			if (this.anIntArray96[arg0] == -1) {
				local669 = Static25.anIntArray106[this.anIntArray100[arg0]];
				Static7.method277(local95, local590, local594, local73, local77, local82, local669);
				Static7.method277(local95, local594, Static25.anIntArray105[3], local73, local82, Static25.anIntArray115[3], local669);
				return;
			}
			Static7.method280(local95, local590, local594, local73, local77, local82, Static25.anIntArray117[0], Static25.anIntArray117[1], Static25.anIntArray117[2]);
			Static7.method280(local95, local594, Static25.anIntArray105[3], local73, local82, Static25.anIntArray115[3], Static25.anIntArray117[0], Static25.anIntArray117[2], Static25.anIntArray117[3]);
			return;
		}
		local669 = this.aByteArray24[arg0] & 0xFF;
		local674 = this.anIntArray99[local669];
		local679 = this.anIntArray101[local669];
		local684 = this.anIntArray92[local669];
		@Pc(924) short local924 = this.aShortArray4[arg0];
		if (this.anIntArray96[arg0] == -1) {
			Static7.method278(local95, local590, local594, local73, local77, local82, this.anIntArray100[arg0], this.anIntArray100[arg0], this.anIntArray100[arg0], Static25.anIntArray120[local674], Static25.anIntArray120[local679], Static25.anIntArray120[local684], Static25.anIntArray118[local674], Static25.anIntArray118[local679], Static25.anIntArray118[local684], Static25.anIntArray103[local674], Static25.anIntArray103[local679], Static25.anIntArray103[local684], local924);
			Static7.method278(local95, local594, Static25.anIntArray105[3], local73, local82, Static25.anIntArray115[3], this.anIntArray100[arg0], this.anIntArray100[arg0], this.anIntArray100[arg0], Static25.anIntArray120[local674], Static25.anIntArray120[local679], Static25.anIntArray120[local684], Static25.anIntArray118[local674], Static25.anIntArray118[local679], Static25.anIntArray118[local684], Static25.anIntArray103[local674], Static25.anIntArray103[local679], Static25.anIntArray103[local684], local924);
			return;
		}
		Static7.method278(local95, local590, local594, local73, local77, local82, Static25.anIntArray117[0], Static25.anIntArray117[1], Static25.anIntArray117[2], Static25.anIntArray120[local674], Static25.anIntArray120[local679], Static25.anIntArray120[local684], Static25.anIntArray118[local674], Static25.anIntArray118[local679], Static25.anIntArray118[local684], Static25.anIntArray103[local674], Static25.anIntArray103[local679], Static25.anIntArray103[local684], local924);
		Static7.method278(local95, local594, Static25.anIntArray105[3], local73, local82, Static25.anIntArray115[3], Static25.anIntArray117[0], Static25.anIntArray117[2], Static25.anIntArray117[3], Static25.anIntArray120[local674], Static25.anIntArray120[local679], Static25.anIntArray120[local684], Static25.anIntArray118[local674], Static25.anIntArray118[local679], Static25.anIntArray118[local684], Static25.anIntArray103[local674], Static25.anIntArray103[local679], Static25.anIntArray103[local684], local924);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!g;I)V")
	public void method636(@OriginalArg(0) Class3_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray23 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class30 local12 = arg0.aClass30Array1[arg1];
		@Pc(15) Class3_Sub16 local15 = local12.aClass3_Sub16_1;
		Static25.anInt977 = 0;
		Static25.anInt975 = 0;
		Static25.anInt972 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1449; local23++) {
			@Pc(29) int local29 = local12.anIntArray175[local23];
			this.method624(local15.anIntArray266[local29], local15.anIntArrayArray62[local29], local12.anIntArray171[local23], local12.anIntArray178[local23], local12.anIntArray172[local23]);
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "()V")
	public void method637() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt966; local1++) {
			this.anIntArray102[local1] = -this.anIntArray102[local1];
			this.anIntArray94[local1] = -this.anIntArray94[local1];
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!ea;[B)Lclient!ea;")
	private Class3_Sub1_Sub1_Sub4 method638(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt966 = this.anInt966;
		arg1.anInt967 = this.anInt967;
		arg1.anInt965 = this.anInt965;
		if (arg1.anIntArray102 == null || arg1.anIntArray102.length < this.anInt966) {
			arg1.anIntArray102 = new int[this.anInt966 + 100];
			arg1.anIntArray98 = new int[this.anInt966 + 100];
			arg1.anIntArray94 = new int[this.anInt966 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt966; local43++) {
			arg1.anIntArray102[local43] = this.anIntArray102[local43];
			arg1.anIntArray98[local43] = this.anIntArray98[local43];
			arg1.anIntArray94[local43] = this.anIntArray94[local43];
		}
		if (arg0) {
			arg1.aByteArray23 = this.aByteArray23;
		} else {
			arg1.aByteArray23 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray23 == null) {
				for (local88 = 0; local88 < this.anInt967; local88++) {
					arg1.aByteArray23[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt967; local88++) {
					arg1.aByteArray23[local88] = this.aByteArray23[local88];
				}
			}
		}
		arg1.anIntArray93 = this.anIntArray93;
		arg1.anIntArray91 = this.anIntArray91;
		arg1.anIntArray95 = this.anIntArray95;
		arg1.anIntArray100 = this.anIntArray100;
		arg1.anIntArray97 = this.anIntArray97;
		arg1.anIntArray96 = this.anIntArray96;
		arg1.aByteArray25 = this.aByteArray25;
		arg1.aByteArray24 = this.aByteArray24;
		arg1.aShortArray4 = this.aShortArray4;
		arg1.aByte8 = this.aByte8;
		arg1.anIntArray99 = this.anIntArray99;
		arg1.anIntArray101 = this.anIntArray101;
		arg1.anIntArray92 = this.anIntArray92;
		arg1.anIntArrayArray23 = this.anIntArrayArray23;
		arg1.anIntArrayArray24 = this.anIntArrayArray24;
		arg1.aBoolean29 = this.aBoolean29;
		arg1.anInt970 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V")
	public void method639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static25.anIntArray116[0] = -1;
		if (this.anInt970 != 2 && this.anInt970 != 1) {
			this.method642();
		}
		@Pc(15) int local15 = Static7.anInt310;
		@Pc(17) int local17 = Static7.anInt313;
		@Pc(21) int local21 = Static25.anIntArray121[0];
		@Pc(25) int local25 = Static25.anIntArray107[0];
		@Pc(29) int local29 = Static25.anIntArray121[arg0];
		@Pc(33) int local33 = Static25.anIntArray107[arg0];
		@Pc(37) int local37 = Static25.anIntArray121[arg1];
		@Pc(41) int local41 = Static25.anIntArray107[arg1];
		@Pc(45) int local45 = Static25.anIntArray121[arg2];
		@Pc(49) int local49 = Static25.anIntArray107[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt966; local61++) {
			@Pc(67) int local67 = this.anIntArray102[local61];
			@Pc(72) int local72 = this.anIntArray98[local61];
			@Pc(77) int local77 = this.anIntArray94[local61];
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
			Static25.anIntArray108[local61] = local77 - local59;
			Static25.anIntArray114[local61] = local15 + (local67 << 9) / local77;
			Static25.anIntArray104[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt965 > 0) {
				Static25.anIntArray120[local61] = local67;
				Static25.anIntArray118[local61] = local89;
				Static25.anIntArray103[local61] = local77;
			}
		}
		try {
			this.method626(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "(I)V")
	public void method641(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static25.anIntArray121[arg0];
		@Pc(7) int local7 = Static25.anIntArray107[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt966; local9++) {
			@Pc(26) int local26 = this.anIntArray98[local9] * local7 - this.anIntArray94[local9] * local3 >> 16;
			this.anIntArray94[local9] = this.anIntArray98[local9] * local3 + this.anIntArray94[local9] * local7 >> 16;
			this.anIntArray98[local9] = local26;
		}
		this.anInt970 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "()V")
	private void method642() {
		if (this.anInt970 == 2) {
			return;
		}
		this.anInt970 = 2;
		this.anInt969 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt966; local12++) {
			@Pc(18) int local18 = this.anIntArray102[local12];
			@Pc(23) int local23 = this.anIntArray98[local12];
			@Pc(28) int local28 = this.anIntArray94[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt969) {
				this.anInt969 = local40;
			}
		}
		this.anInt969 = (int) (Math.sqrt((double) this.anInt969) + 0.99D);
		this.anInt964 = this.anInt969;
		this.anInt968 = this.anInt969 + this.anInt969;
	}
}
