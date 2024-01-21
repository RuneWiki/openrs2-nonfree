import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class8_Sub1_Sub1_Sub6 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!nb", name = "jb", descriptor = "I")
	private int anInt2142;

	@OriginalMember(owner = "client!nb", name = "lb", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!nb", name = "mb", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!nb", name = "nb", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!nb", name = "ob", descriptor = "I")
	private int anInt2143;

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!nb", name = "qb", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!nb", name = "rb", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!nb", name = "sb", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!nb", name = "tb", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!nb", name = "ub", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!nb", name = "vb", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!nb", name = "xb", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!nb", name = "yb", descriptor = "I")
	private int anInt2144;

	@OriginalMember(owner = "client!nb", name = "zb", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!nb", name = "Ab", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!nb", name = "Bb", descriptor = "I")
	private int anInt2145;

	@OriginalMember(owner = "client!nb", name = "Db", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!nb", name = "Eb", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!nb", name = "Fb", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!nb", name = "Gb", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!nb", name = "Ib", descriptor = "I")
	private int anInt2148;

	@OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
	public int anInt2141 = 0;

	@OriginalMember(owner = "client!nb", name = "Hb", descriptor = "I")
	public int anInt2147 = 0;

	@OriginalMember(owner = "client!nb", name = "kb", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!nb", name = "Cb", descriptor = "I")
	public int anInt2146 = 0;

	@OriginalMember(owner = "client!nb", name = "wb", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class8_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([Lclient!nb;I)V")
	public Class8_Sub1_Sub1_Sub6(@OriginalArg(0) Class8_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2147 = 0;
		this.anInt2141 = 0;
		this.anInt2146 = 0;
		this.aByte4 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class8_Sub1_Sub1_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2147 += local43.anInt2147;
				this.anInt2141 += local43.anInt2141;
				this.anInt2146 += local43.anInt2146;
				if (local43.aByteArray33 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local43.aByte4;
					}
					if (this.aByte4 != local43.aByte4) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray32 != null;
				local22 |= local43.aShortArray34 != null;
				local24 |= local43.aByteArray34 != null;
			}
		}
		this.anIntArray285 = new int[this.anInt2147];
		this.anIntArray281 = new int[this.anInt2147];
		this.anIntArray278 = new int[this.anInt2147];
		this.anIntArray275 = new int[this.anInt2141];
		this.anIntArray280 = new int[this.anInt2141];
		this.anIntArray282 = new int[this.anInt2141];
		this.anIntArray283 = new int[this.anInt2141];
		this.anIntArray277 = new int[this.anInt2141];
		this.anIntArray279 = new int[this.anInt2141];
		if (local18) {
			this.aByteArray33 = new byte[this.anInt2141];
		}
		if (local20) {
			this.aByteArray32 = new byte[this.anInt2141];
		}
		if (local22) {
			this.aShortArray34 = new short[this.anInt2141];
		}
		if (local24) {
			this.aByteArray34 = new byte[this.anInt2141];
		}
		if (this.anInt2146 > 0) {
			this.anIntArray284 = new int[this.anInt2146];
			this.anIntArray274 = new int[this.anInt2146];
			this.anIntArray276 = new int[this.anInt2146];
		}
		this.anInt2147 = 0;
		this.anInt2141 = 0;
		this.anInt2146 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class8_Sub1_Sub1_Sub6 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2141; local229++) {
					this.anIntArray275[this.anInt2141] = local225.anIntArray275[local229] + this.anInt2147;
					this.anIntArray280[this.anInt2141] = local225.anIntArray280[local229] + this.anInt2147;
					this.anIntArray282[this.anInt2141] = local225.anIntArray282[local229] + this.anInt2147;
					this.anIntArray283[this.anInt2141] = local225.anIntArray283[local229];
					this.anIntArray277[this.anInt2141] = local225.anIntArray277[local229];
					this.anIntArray279[this.anInt2141] = local225.anIntArray279[local229];
					if (local18) {
						if (local225.aByteArray33 == null) {
							this.aByteArray33[this.anInt2141] = local225.aByte4;
						} else {
							this.aByteArray33[this.anInt2141] = local225.aByteArray33[local229];
						}
					}
					if (local20 && local225.aByteArray32 != null) {
						this.aByteArray32[this.anInt2141] = local225.aByteArray32[local229];
					}
					if (local22) {
						if (local225.aShortArray34 == null) {
							this.aShortArray34[this.anInt2141] = -1;
						} else {
							this.aShortArray34[this.anInt2141] = local225.aShortArray34[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray34 == null || local225.aByteArray34[local229] == -1) {
							this.aByteArray34[this.anInt2141] = -1;
						} else {
							this.aByteArray34[this.anInt2141] = (byte) (local225.aByteArray34[local229] + this.anInt2146);
						}
					}
					this.anInt2141++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2146; local394++) {
					this.anIntArray284[this.anInt2146] = local225.anIntArray284[local394] + this.anInt2147;
					this.anIntArray274[this.anInt2146] = local225.anIntArray274[local394] + this.anInt2147;
					this.anIntArray276[this.anInt2146] = local225.anIntArray276[local394] + this.anInt2147;
					this.anInt2146++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2147; local444++) {
					this.anIntArray285[this.anInt2147] = local225.anIntArray285[local444];
					this.anIntArray281[this.anInt2147] = local225.anIntArray281[local444];
					this.anIntArray278[this.anInt2147] = local225.anIntArray278[local444];
					this.anInt2147++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[IIII)V")
	private void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static85.anInt2152 = 0;
			Static85.anInt2153 = 0;
			Static85.anInt2151 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray20.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray20[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static85.anInt2152 += this.anIntArray285[local36];
						Static85.anInt2153 += this.anIntArray281[local36];
						Static85.anInt2151 += this.anIntArray278[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static85.anInt2152 = Static85.anInt2152 / local6 + arg2;
				Static85.anInt2153 = Static85.anInt2153 / local6 + arg3;
				Static85.anInt2151 = Static85.anInt2151 / local6 + arg4;
			} else {
				Static85.anInt2152 = arg2;
				Static85.anInt2153 = arg3;
				Static85.anInt2151 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray20.length) {
					local115 = this.anIntArrayArray20[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray285[local31] += arg2;
						this.anIntArray281[local31] += arg3;
						this.anIntArray278[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray20.length) {
					local115 = this.anIntArrayArray20[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray285[local31] -= Static85.anInt2152;
						this.anIntArray281[local31] -= Static85.anInt2153;
						this.anIntArray278[local31] -= Static85.anInt2151;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static85.anIntArray290[local225];
							local235 = Static85.anIntArray293[local225];
							local251 = this.anIntArray281[local31] * local231 + this.anIntArray285[local31] * local235 >> 16;
							this.anIntArray281[local31] = this.anIntArray281[local31] * local235 - this.anIntArray285[local31] * local231 >> 16;
							this.anIntArray285[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static85.anIntArray290[local36];
							local235 = Static85.anIntArray293[local36];
							local251 = this.anIntArray281[local31] * local235 - this.anIntArray278[local31] * local231 >> 16;
							this.anIntArray278[local31] = this.anIntArray281[local31] * local231 + this.anIntArray278[local31] * local235 >> 16;
							this.anIntArray281[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static85.anIntArray290[local219];
							local235 = Static85.anIntArray293[local219];
							local251 = this.anIntArray278[local31] * local231 + this.anIntArray285[local31] * local235 >> 16;
							this.anIntArray278[local31] = this.anIntArray278[local31] * local235 - this.anIntArray285[local31] * local231 >> 16;
							this.anIntArray285[local31] = local251;
						}
						this.anIntArray285[local31] += Static85.anInt2152;
						this.anIntArray281[local31] += Static85.anInt2153;
						this.anIntArray278[local31] += Static85.anInt2151;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray20.length) {
					local115 = this.anIntArrayArray20[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray285[local31] -= Static85.anInt2152;
						this.anIntArray281[local31] -= Static85.anInt2153;
						this.anIntArray278[local31] -= Static85.anInt2151;
						this.anIntArray285[local31] = this.anIntArray285[local31] * arg2 / 128;
						this.anIntArray281[local31] = this.anIntArray281[local31] * arg3 / 128;
						this.anIntArray278[local31] = this.anIntArray278[local31] * arg4 / 128;
						this.anIntArray285[local31] += Static85.anInt2152;
						this.anIntArray281[local31] += Static85.anInt2153;
						this.anIntArray278[local31] += Static85.anInt2151;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray19 != null && this.aByteArray32 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray19.length) {
					local115 = this.anIntArrayArray19[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray32[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray32[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	public void method1269() {
		if (this.anInt2145 == 1) {
			return;
		}
		this.anInt2145 = 1;
		super.anInt2957 = 0;
		this.anInt2148 = 0;
		this.anInt2143 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2147; local18++) {
			@Pc(24) int local24 = this.anIntArray285[local18];
			@Pc(29) int local29 = this.anIntArray281[local18];
			@Pc(34) int local34 = this.anIntArray278[local18];
			if (-local29 > super.anInt2957) {
				super.anInt2957 = -local29;
			}
			if (local29 > this.anInt2148) {
				this.anInt2148 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2143) {
				this.anInt2143 = local58;
			}
		}
		this.anInt2143 = (int) (Math.sqrt((double) this.anInt2143) + 0.99D);
		this.anInt2142 = (int) (Math.sqrt((double) (this.anInt2143 * this.anInt2143 + super.anInt2957 * super.anInt2957)) + 0.99D);
		this.anInt2144 = this.anInt2142 + (int) (Math.sqrt((double) (this.anInt2143 * this.anInt2143 + this.anInt2148 * this.anInt2148)) + 0.99D);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!he;ILclient!he;I[I)V")
	public void method1270(@OriginalArg(0) Class8_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1283(arg0, arg1);
			return;
		}
		@Pc(18) Class41 local18 = arg0.aClass41Array1[arg1];
		@Pc(23) Class41 local23 = arg2.aClass41Array1[arg3];
		@Pc(26) Class8_Sub6 local26 = local18.aClass8_Sub6_1;
		Static85.anInt2152 = 0;
		Static85.anInt2153 = 0;
		Static85.anInt2151 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1604; local41++) {
			local47 = local18.anIntArray197[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray66[local47] == 0) {
				this.method1268(local26.anIntArray66[local47], local26.anIntArrayArray2[local47], local18.anIntArray201[local41], local18.anIntArray203[local41], local18.anIntArray198[local41]);
			}
		}
		Static85.anInt2152 = 0;
		Static85.anInt2153 = 0;
		Static85.anInt2151 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1604; local47++) {
			@Pc(112) int local112 = local23.anIntArray197[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray66[local112] == 0) {
				this.method1268(local26.anIntArray66[local112], local26.anIntArrayArray2[local112], local23.anIntArray201[local47], local23.anIntArray203[local47], local23.anIntArray198[local47]);
			}
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public void method1271(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static85.anIntArray290[arg0];
		@Pc(7) int local7 = Static85.anIntArray293[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2147; local9++) {
			@Pc(26) int local26 = this.anIntArray281[local9] * local7 - this.anIntArray278[local9] * local3 >> 16;
			this.anIntArray278[local9] = this.anIntArray281[local9] * local3 + this.anIntArray278[local9] * local7 >> 16;
			this.anIntArray281[local9] = local26;
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1273(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static85.aByteArray36.length < this.anInt2141) {
			Static85.aByteArray36 = new byte[this.anInt2141 + 100];
		}
		return this.method1275(arg0, Static85.aClass8_Sub1_Sub1_Sub6_3, Static85.aByteArray36);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1274(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static85.aByteArray35.length < this.anInt2141) {
			Static85.aByteArray35 = new byte[this.anInt2141 + 100];
		}
		return this.method1275(arg0, Static85.aClass8_Sub1_Sub1_Sub6_2, Static85.aByteArray35);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!nb;[B)Lclient!nb;")
	private Class8_Sub1_Sub1_Sub6 method1275(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2147 = this.anInt2147;
		arg1.anInt2141 = this.anInt2141;
		arg1.anInt2146 = this.anInt2146;
		if (arg1.anIntArray285 == null || arg1.anIntArray285.length < this.anInt2147) {
			arg1.anIntArray285 = new int[this.anInt2147 + 100];
			arg1.anIntArray281 = new int[this.anInt2147 + 100];
			arg1.anIntArray278 = new int[this.anInt2147 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2147; local43++) {
			arg1.anIntArray285[local43] = this.anIntArray285[local43];
			arg1.anIntArray281[local43] = this.anIntArray281[local43];
			arg1.anIntArray278[local43] = this.anIntArray278[local43];
		}
		if (arg0) {
			arg1.aByteArray32 = this.aByteArray32;
		} else {
			arg1.aByteArray32 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray32 == null) {
				for (local88 = 0; local88 < this.anInt2141; local88++) {
					arg1.aByteArray32[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2141; local88++) {
					arg1.aByteArray32[local88] = this.aByteArray32[local88];
				}
			}
		}
		arg1.anIntArray275 = this.anIntArray275;
		arg1.anIntArray280 = this.anIntArray280;
		arg1.anIntArray282 = this.anIntArray282;
		arg1.anIntArray283 = this.anIntArray283;
		arg1.anIntArray277 = this.anIntArray277;
		arg1.anIntArray279 = this.anIntArray279;
		arg1.aByteArray33 = this.aByteArray33;
		arg1.aByteArray34 = this.aByteArray34;
		arg1.aShortArray34 = this.aShortArray34;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray284 = this.anIntArray284;
		arg1.anIntArray274 = this.anIntArray274;
		arg1.anIntArray276 = this.anIntArray276;
		arg1.anIntArrayArray20 = this.anIntArrayArray20;
		arg1.anIntArrayArray19 = this.anIntArrayArray19;
		arg1.aBoolean81 = this.aBoolean81;
		arg1.anInt2145 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZI)V")
	private void method1277(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2144 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2144; local6++) {
			Static85.anIntArray289[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2141; local18++) {
			if (this.anIntArray279[local18] != -2) {
				local30 = this.anIntArray275[local18];
				local35 = this.anIntArray280[local18];
				local40 = this.anIntArray282[local18];
				local44 = Static85.anIntArray295[local30];
				local48 = Static85.anIntArray295[local35];
				local52 = Static85.anIntArray295[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static85.anIntArray302[local30];
					local71 = Static85.anIntArray302[local35];
					@Pc(75) int local75 = Static85.anIntArray302[local40];
					@Pc(79) int local79 = Static85.anIntArray299[local30];
					local83 = Static85.anIntArray299[local35];
					local87 = Static85.anIntArray299[local40];
					@Pc(91) int local91 = Static85.anIntArray298[local30];
					local95 = Static85.anIntArray298[local35];
					@Pc(99) int local99 = Static85.anIntArray298[local40];
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
						Static85.aBooleanArray16[local18] = true;
						@Pc(180) int local180 = (Static85.anIntArray286[local30] + Static85.anIntArray286[local35] + Static85.anIntArray286[local40]) / 3 + this.anInt2142;
						Static85.anIntArrayArray22[local180][Static85.anIntArray289[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1272(Static85.anInt2150, Static85.anInt2149, Static85.anIntArray292[local30], Static85.anIntArray292[local35], Static85.anIntArray292[local40], local44, local48, local52)) {
						Static85.anIntArray301[Static85.anInt2154++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static85.anIntArray292[local40] - Static85.anIntArray292[local35]) - (Static85.anIntArray292[local30] - Static85.anIntArray292[local35]) * (local52 - local48) > 0) {
						Static85.aBooleanArray16[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static11.anInt284 && local48 <= Static11.anInt284 && local52 <= Static11.anInt284) {
							Static85.aBooleanArray15[local18] = false;
						} else {
							Static85.aBooleanArray15[local18] = true;
						}
						local67 = (Static85.anIntArray286[local30] + Static85.anIntArray286[local35] + Static85.anIntArray286[local40]) / 3 + this.anInt2142;
						Static85.anIntArrayArray22[local67][Static85.anIntArray289[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray33 == null) {
			for (local30 = this.anInt2144 - 1; local30 >= 0; local30--) {
				local35 = Static85.anIntArray289[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static85.anIntArrayArray22[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1285(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static85.anIntArray303[local30] = 0;
			Static85.anIntArray297[local30] = 0;
		}
		for (local35 = this.anInt2144 - 1; local35 >= 0; local35--) {
			local40 = Static85.anIntArray289[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static85.anIntArrayArray22[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray33[local52];
					local71 = Static85.anIntArray303[local388]++;
					Static85.anIntArrayArray21[local388][local71] = local52;
					if (local388 < 10) {
						Static85.anIntArray297[local388] += local35;
					} else if (local388 == 10) {
						Static85.anIntArray291[local71] = local35;
					} else {
						Static85.anIntArray304[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static85.anIntArray303[1] > 0 || Static85.anIntArray303[2] > 0) {
			local40 = (Static85.anIntArray297[1] + Static85.anIntArray297[2]) / (Static85.anIntArray303[1] + Static85.anIntArray303[2]);
		}
		local44 = 0;
		if (Static85.anIntArray303[3] > 0 || Static85.anIntArray303[4] > 0) {
			local44 = (Static85.anIntArray297[3] + Static85.anIntArray297[4]) / (Static85.anIntArray303[3] + Static85.anIntArray303[4]);
		}
		local48 = 0;
		if (Static85.anIntArray303[6] > 0 || Static85.anIntArray303[8] > 0) {
			local48 = (Static85.anIntArray297[6] + Static85.anIntArray297[8]) / (Static85.anIntArray303[6] + Static85.anIntArray303[8]);
		}
		local67 = 0;
		local71 = Static85.anIntArray303[10];
		@Pc(521) int[] local521 = Static85.anIntArrayArray21[10];
		@Pc(523) int[] local523 = Static85.anIntArray291;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static85.anIntArray303[11];
			local521 = Static85.anIntArrayArray21[11];
			local523 = Static85.anIntArray304;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1285(local521[local67++]);
				if (local67 == local71 && local521 != Static85.anIntArrayArray21[11]) {
					local67 = 0;
					local71 = Static85.anIntArray303[11];
					local521 = Static85.anIntArrayArray21[11];
					local523 = Static85.anIntArray304;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1285(local521[local67++]);
				if (local67 == local71 && local521 != Static85.anIntArrayArray21[11]) {
					local67 = 0;
					local71 = Static85.anIntArray303[11];
					local521 = Static85.anIntArrayArray21[11];
					local523 = Static85.anIntArray304;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1285(local521[local67++]);
				if (local67 == local71 && local521 != Static85.anIntArrayArray21[11]) {
					local67 = 0;
					local71 = Static85.anIntArray303[11];
					local521 = Static85.anIntArrayArray21[11];
					local523 = Static85.anIntArray304;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static85.anIntArray303[local83];
			@Pc(686) int[] local686 = Static85.anIntArrayArray21[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1285(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1285(local521[local67++]);
			if (local67 == local71 && local521 != Static85.anIntArrayArray21[11]) {
				local67 = 0;
				local521 = Static85.anIntArrayArray21[11];
				local71 = Static85.anIntArray303[11];
				local523 = Static85.anIntArray304;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	public void method1278() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2147; local1++) {
			this.anIntArray285[local1] = -this.anIntArray285[local1];
			this.anIntArray278[local1] = -this.anIntArray278[local1];
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
	public void method1279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static85.anIntArray289[0] = -1;
		if (this.anInt2145 != 2 && this.anInt2145 != 1) {
			this.method1284();
		}
		@Pc(15) int local15 = Static11.anInt289;
		@Pc(17) int local17 = Static11.anInt288;
		@Pc(21) int local21 = Static85.anIntArray290[0];
		@Pc(25) int local25 = Static85.anIntArray293[0];
		@Pc(29) int local29 = Static85.anIntArray290[arg0];
		@Pc(33) int local33 = Static85.anIntArray293[arg0];
		@Pc(37) int local37 = Static85.anIntArray290[arg1];
		@Pc(41) int local41 = Static85.anIntArray293[arg1];
		@Pc(45) int local45 = Static85.anIntArray290[arg2];
		@Pc(49) int local49 = Static85.anIntArray293[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2147; local61++) {
			@Pc(67) int local67 = this.anIntArray285[local61];
			@Pc(72) int local72 = this.anIntArray281[local61];
			@Pc(77) int local77 = this.anIntArray278[local61];
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
			Static85.anIntArray286[local61] = local77 - local59;
			Static85.anIntArray295[local61] = local15 + (local67 << 9) / local77;
			Static85.anIntArray292[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2146 > 0) {
				Static85.anIntArray302[local61] = local67;
				Static85.anIntArray299[local61] = local89;
				Static85.anIntArray298[local61] = local77;
			}
		}
		try {
			this.method1277(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIIIIII)V")
	public void method1280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static85.anIntArray289[0] = -1;
		if (this.anInt2145 != 2 && this.anInt2145 != 1) {
			this.method1284();
		}
		@Pc(15) int local15 = Static11.anInt289;
		@Pc(17) int local17 = Static11.anInt288;
		@Pc(21) int local21 = Static85.anIntArray290[0];
		@Pc(25) int local25 = Static85.anIntArray293[0];
		@Pc(29) int local29 = Static85.anIntArray290[arg0];
		@Pc(33) int local33 = Static85.anIntArray293[arg0];
		@Pc(37) int local37 = Static85.anIntArray290[arg1];
		@Pc(41) int local41 = Static85.anIntArray293[arg1];
		@Pc(45) int local45 = Static85.anIntArray290[arg2];
		@Pc(49) int local49 = Static85.anIntArray293[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2147; local61++) {
			@Pc(67) int local67 = this.anIntArray285[local61];
			@Pc(72) int local72 = this.anIntArray281[local61];
			@Pc(77) int local77 = this.anIntArray278[local61];
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
			Static85.anIntArray286[local61] = local77 - local59;
			Static85.anIntArray295[local61] = local15 + (local67 << 9) / arg6;
			Static85.anIntArray292[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2146 > 0) {
				Static85.anIntArray302[local61] = local67;
				Static85.anIntArray299[local61] = local89;
				Static85.anIntArray298[local61] = local77;
			}
		}
		try {
			this.method1277(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()V")
	public void method1281() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2147; local1++) {
			@Pc(7) int local7 = this.anIntArray285[local1];
			this.anIntArray285[local1] = this.anIntArray278[local1];
			this.anIntArray278[local1] = -local7;
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V")
	private void method1282(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static11.anInt289;
		@Pc(3) int local3 = Static11.anInt288;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray275[arg0];
		@Pc(15) int local15 = this.anIntArray280[arg0];
		@Pc(20) int local20 = this.anIntArray282[arg0];
		@Pc(24) int local24 = Static85.anIntArray298[local10];
		@Pc(28) int local28 = Static85.anIntArray298[local15];
		@Pc(32) int local32 = Static85.anIntArray298[local20];
		if (this.aByteArray32 == null) {
			Static11.anInt285 = 0;
		} else {
			Static11.anInt285 = this.aByteArray32[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static85.anIntArray296[0] = Static85.anIntArray295[local10];
			Static85.anIntArray300[0] = Static85.anIntArray292[local10];
			local5++;
			Static85.anIntArray288[0] = this.anIntArray283[arg0];
		} else {
			local73 = Static85.anIntArray302[local10];
			local77 = Static85.anIntArray299[local10];
			local82 = this.anIntArray283[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static85.anIntArray294[local32 - local24];
				Static85.anIntArray296[0] = local1 + (local73 + ((Static85.anIntArray302[local20] - local73) * local95 >> 16) << 9) / 50;
				Static85.anIntArray300[0] = local3 + (local77 + ((Static85.anIntArray299[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static85.anIntArray288[0] = local82 + ((this.anIntArray279[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static85.anIntArray294[local28 - local24];
				Static85.anIntArray296[local5] = local1 + (local73 + ((Static85.anIntArray302[local15] - local73) * local95 >> 16) << 9) / 50;
				Static85.anIntArray300[local5] = local3 + (local77 + ((Static85.anIntArray299[local15] - local77) * local95 >> 16) << 9) / 50;
				Static85.anIntArray288[local5++] = local82 + ((this.anIntArray277[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static85.anIntArray296[local5] = Static85.anIntArray295[local15];
			Static85.anIntArray300[local5] = Static85.anIntArray292[local15];
			Static85.anIntArray288[local5++] = this.anIntArray277[arg0];
		} else {
			local73 = Static85.anIntArray302[local15];
			local77 = Static85.anIntArray299[local15];
			local82 = this.anIntArray277[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static85.anIntArray294[local24 - local28];
				Static85.anIntArray296[local5] = local1 + (local73 + ((Static85.anIntArray302[local10] - local73) * local95 >> 16) << 9) / 50;
				Static85.anIntArray300[local5] = local3 + (local77 + ((Static85.anIntArray299[local10] - local77) * local95 >> 16) << 9) / 50;
				Static85.anIntArray288[local5++] = local82 + ((this.anIntArray283[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static85.anIntArray294[local32 - local28];
				Static85.anIntArray296[local5] = local1 + (local73 + ((Static85.anIntArray302[local20] - local73) * local95 >> 16) << 9) / 50;
				Static85.anIntArray300[local5] = local3 + (local77 + ((Static85.anIntArray299[local20] - local77) * local95 >> 16) << 9) / 50;
				Static85.anIntArray288[local5++] = local82 + ((this.anIntArray279[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static85.anIntArray296[local5] = Static85.anIntArray295[local20];
			Static85.anIntArray300[local5] = Static85.anIntArray292[local20];
			Static85.anIntArray288[local5++] = this.anIntArray279[arg0];
		} else {
			local73 = Static85.anIntArray302[local20];
			local77 = Static85.anIntArray299[local20];
			local82 = this.anIntArray279[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static85.anIntArray294[local28 - local32];
				Static85.anIntArray296[local5] = local1 + (local73 + ((Static85.anIntArray302[local15] - local73) * local95 >> 16) << 9) / 50;
				Static85.anIntArray300[local5] = local3 + (local77 + ((Static85.anIntArray299[local15] - local77) * local95 >> 16) << 9) / 50;
				Static85.anIntArray288[local5++] = local82 + ((this.anIntArray277[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static85.anIntArray294[local24 - local32];
				Static85.anIntArray296[local5] = local1 + (local73 + ((Static85.anIntArray302[local10] - local73) * local95 >> 16) << 9) / 50;
				Static85.anIntArray300[local5] = local3 + (local77 + ((Static85.anIntArray299[local10] - local77) * local95 >> 16) << 9) / 50;
				Static85.anIntArray288[local5++] = local82 + ((this.anIntArray283[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static85.anIntArray296[0];
		local77 = Static85.anIntArray296[1];
		local82 = Static85.anIntArray296[2];
		local95 = Static85.anIntArray300[0];
		@Pc(590) int local590 = Static85.anIntArray300[1];
		@Pc(594) int local594 = Static85.anIntArray300[2];
		Static11.aBoolean11 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static11.anInt284 || local77 > Static11.anInt284 || local82 > Static11.anInt284) {
				Static11.aBoolean11 = true;
			}
			if (this.aShortArray34 != null && this.aShortArray34[arg0] != -1) {
				if (this.aByteArray34 == null || this.aByteArray34[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray34[arg0] & 0xFF;
					local683 = this.anIntArray284[local678];
					local688 = this.anIntArray274[local678];
					local693 = this.anIntArray276[local678];
				}
				if (this.anIntArray279[arg0] == -1) {
					Static11.method174(local95, local590, local594, local73, local77, local82, this.anIntArray283[arg0], this.anIntArray283[arg0], this.anIntArray283[arg0], Static85.anIntArray302[local683], Static85.anIntArray302[local688], Static85.anIntArray302[local693], Static85.anIntArray299[local683], Static85.anIntArray299[local688], Static85.anIntArray299[local693], Static85.anIntArray298[local683], Static85.anIntArray298[local688], Static85.anIntArray298[local693], this.aShortArray34[arg0]);
				} else {
					Static11.method174(local95, local590, local594, local73, local77, local82, Static85.anIntArray288[0], Static85.anIntArray288[1], Static85.anIntArray288[2], Static85.anIntArray302[local683], Static85.anIntArray302[local688], Static85.anIntArray302[local693], Static85.anIntArray299[local683], Static85.anIntArray299[local688], Static85.anIntArray299[local693], Static85.anIntArray298[local683], Static85.anIntArray298[local688], Static85.anIntArray298[local693], this.aShortArray34[arg0]);
				}
			} else if (this.anIntArray279[arg0] == -1) {
				Static11.method182(local95, local590, local594, local73, local77, local82, Static85.anIntArray287[this.anIntArray283[arg0]]);
			} else {
				Static11.method183(local95, local590, local594, local73, local77, local82, Static85.anIntArray288[0], Static85.anIntArray288[1], Static85.anIntArray288[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static11.anInt284 || local77 > Static11.anInt284 || local82 > Static11.anInt284 || Static85.anIntArray296[3] < 0 || Static85.anIntArray296[3] > Static11.anInt284) {
			Static11.aBoolean11 = true;
		}
		if (this.aShortArray34 == null || this.aShortArray34[arg0] == -1) {
			if (this.anIntArray279[arg0] == -1) {
				local683 = Static85.anIntArray287[this.anIntArray283[arg0]];
				Static11.method182(local95, local590, local594, local73, local77, local82, local683);
				Static11.method182(local95, local594, Static85.anIntArray300[3], local73, local82, Static85.anIntArray296[3], local683);
				return;
			}
			Static11.method183(local95, local590, local594, local73, local77, local82, Static85.anIntArray288[0], Static85.anIntArray288[1], Static85.anIntArray288[2]);
			Static11.method183(local95, local594, Static85.anIntArray300[3], local73, local82, Static85.anIntArray296[3], Static85.anIntArray288[0], Static85.anIntArray288[2], Static85.anIntArray288[3]);
			return;
		}
		if (this.aByteArray34 == null || this.aByteArray34[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray34[arg0] & 0xFF;
			local683 = this.anIntArray284[local678];
			local688 = this.anIntArray274[local678];
			local693 = this.anIntArray276[local678];
		}
		@Pc(956) short local956 = this.aShortArray34[arg0];
		if (this.anIntArray279[arg0] == -1) {
			Static11.method174(local95, local590, local594, local73, local77, local82, this.anIntArray283[arg0], this.anIntArray283[arg0], this.anIntArray283[arg0], Static85.anIntArray302[local683], Static85.anIntArray302[local688], Static85.anIntArray302[local693], Static85.anIntArray299[local683], Static85.anIntArray299[local688], Static85.anIntArray299[local693], Static85.anIntArray298[local683], Static85.anIntArray298[local688], Static85.anIntArray298[local693], local956);
			Static11.method174(local95, local594, Static85.anIntArray300[3], local73, local82, Static85.anIntArray296[3], this.anIntArray283[arg0], this.anIntArray283[arg0], this.anIntArray283[arg0], Static85.anIntArray302[local683], Static85.anIntArray302[local688], Static85.anIntArray302[local693], Static85.anIntArray299[local683], Static85.anIntArray299[local688], Static85.anIntArray299[local693], Static85.anIntArray298[local683], Static85.anIntArray298[local688], Static85.anIntArray298[local693], local956);
			return;
		}
		Static11.method174(local95, local590, local594, local73, local77, local82, Static85.anIntArray288[0], Static85.anIntArray288[1], Static85.anIntArray288[2], Static85.anIntArray302[local683], Static85.anIntArray302[local688], Static85.anIntArray302[local693], Static85.anIntArray299[local683], Static85.anIntArray299[local688], Static85.anIntArray299[local693], Static85.anIntArray298[local683], Static85.anIntArray298[local688], Static85.anIntArray298[local693], local956);
		Static11.method174(local95, local594, Static85.anIntArray300[3], local73, local82, Static85.anIntArray296[3], Static85.anIntArray288[0], Static85.anIntArray288[2], Static85.anIntArray288[3], Static85.anIntArray302[local683], Static85.anIntArray302[local688], Static85.anIntArray302[local693], Static85.anIntArray299[local683], Static85.anIntArray299[local688], Static85.anIntArray299[local693], Static85.anIntArray298[local683], Static85.anIntArray298[local688], Static85.anIntArray298[local693], local956);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!he;I)V")
	public void method1283(@OriginalArg(0) Class8_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray20 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class41 local12 = arg0.aClass41Array1[arg1];
		@Pc(15) Class8_Sub6 local15 = local12.aClass8_Sub6_1;
		Static85.anInt2152 = 0;
		Static85.anInt2153 = 0;
		Static85.anInt2151 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1604; local23++) {
			@Pc(29) int local29 = local12.anIntArray197[local23];
			this.method1268(local15.anIntArray66[local29], local15.anIntArrayArray2[local29], local12.anIntArray201[local23], local12.anIntArray203[local23], local12.anIntArray198[local23]);
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "()V")
	private void method1284() {
		if (this.anInt2145 == 2) {
			return;
		}
		this.anInt2145 = 2;
		this.anInt2143 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2147; local12++) {
			@Pc(18) int local18 = this.anIntArray285[local12];
			@Pc(23) int local23 = this.anIntArray281[local12];
			@Pc(28) int local28 = this.anIntArray278[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2143) {
				this.anInt2143 = local40;
			}
		}
		this.anInt2143 = (int) (Math.sqrt((double) this.anInt2143) + 0.99D);
		this.anInt2142 = this.anInt2143;
		this.anInt2144 = this.anInt2143 + this.anInt2143;
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	private void method1285(@OriginalArg(0) int arg0) {
		if (Static85.aBooleanArray16[arg0]) {
			this.method1282(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray275[arg0];
		@Pc(17) int local17 = this.anIntArray280[arg0];
		@Pc(22) int local22 = this.anIntArray282[arg0];
		Static11.aBoolean11 = Static85.aBooleanArray15[arg0];
		if (this.aByteArray32 == null) {
			Static11.anInt285 = 0;
		} else {
			Static11.anInt285 = this.aByteArray32[arg0] & 0xFF;
		}
		if (this.aShortArray34 != null && this.aShortArray34[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray34 == null || this.aByteArray34[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray34[arg0] & 0xFF;
				local133 = this.anIntArray284[local128];
				local138 = this.anIntArray274[local128];
				local143 = this.anIntArray276[local128];
			}
			if (this.anIntArray279[arg0] == -1) {
				Static11.method174(Static85.anIntArray292[local12], Static85.anIntArray292[local17], Static85.anIntArray292[local22], Static85.anIntArray295[local12], Static85.anIntArray295[local17], Static85.anIntArray295[local22], this.anIntArray283[arg0], this.anIntArray283[arg0], this.anIntArray283[arg0], Static85.anIntArray302[local133], Static85.anIntArray302[local138], Static85.anIntArray302[local143], Static85.anIntArray299[local133], Static85.anIntArray299[local138], Static85.anIntArray299[local143], Static85.anIntArray298[local133], Static85.anIntArray298[local138], Static85.anIntArray298[local143], this.aShortArray34[arg0]);
			} else {
				Static11.method174(Static85.anIntArray292[local12], Static85.anIntArray292[local17], Static85.anIntArray292[local22], Static85.anIntArray295[local12], Static85.anIntArray295[local17], Static85.anIntArray295[local22], this.anIntArray283[arg0], this.anIntArray277[arg0], this.anIntArray279[arg0], Static85.anIntArray302[local133], Static85.anIntArray302[local138], Static85.anIntArray302[local143], Static85.anIntArray299[local133], Static85.anIntArray299[local138], Static85.anIntArray299[local143], Static85.anIntArray298[local133], Static85.anIntArray298[local138], Static85.anIntArray298[local143], this.aShortArray34[arg0]);
			}
		} else if (this.anIntArray279[arg0] == -1) {
			Static11.method182(Static85.anIntArray292[local12], Static85.anIntArray292[local17], Static85.anIntArray292[local22], Static85.anIntArray295[local12], Static85.anIntArray295[local17], Static85.anIntArray295[local22], Static85.anIntArray287[this.anIntArray283[arg0]]);
		} else {
			Static11.method183(Static85.anIntArray292[local12], Static85.anIntArray292[local17], Static85.anIntArray292[local22], Static85.anIntArray295[local12], Static85.anIntArray295[local17], Static85.anIntArray295[local22], this.anIntArray283[arg0], this.anIntArray277[arg0], this.anIntArray279[arg0]);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2147; local1++) {
			this.anIntArray285[local1] += arg0;
			this.anIntArray281[local1] += arg1;
			this.anIntArray278[local1] += arg2;
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "()V")
	public void method1287() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2147; local1++) {
			@Pc(7) int local7 = this.anIntArray278[local1];
			this.anIntArray278[local1] = this.anIntArray285[local1];
			this.anIntArray285[local1] = -local7;
		}
		this.anInt2145 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "()I")
	public int method1288() {
		this.method1269();
		return this.anInt2143;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static85.anIntArray289[0] = -1;
		if (this.anInt2145 != 1) {
			this.method1269();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2143 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2143 << 9;
		if (local64 / local40 >= Static11.anInt287) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2143 << 9;
		if (local77 / local40 <= Static11.anInt286) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2143 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static11.anInt283) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2957 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static11.anInt282) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2957 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2146 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static85.aBoolean82) {
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
			local219 = Static85.anInt2150 - Static11.anInt289;
			local223 = Static85.anInt2149 - Static11.anInt288;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean81) {
					Static85.anIntArray301[Static85.anInt2154++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static11.anInt289;
		local219 = Static11.anInt288;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static85.anIntArray290[arg0];
			local257 = Static85.anIntArray293[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2147; local269++) {
			@Pc(275) int local275 = this.anIntArray285[local269];
			@Pc(280) int local280 = this.anIntArray281[local269];
			@Pc(285) int local285 = this.anIntArray278[local269];
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
			Static85.anIntArray286[local269] = local285 - local29;
			if (local285 >= 50) {
				Static85.anIntArray295[local269] = local172 + (local275 << 9) / local285;
				Static85.anIntArray292[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static85.anIntArray295[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static85.anIntArray302[local269] = local275;
				Static85.anIntArray299[local269] = local297;
				Static85.anIntArray298[local269] = local285;
			}
		}
		try {
			this.method1277(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([[IIIIZI)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1289(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1269();
		@Pc(6) int local6 = arg1 - this.anInt2143;
		@Pc(11) int local11 = arg1 + this.anInt2143;
		@Pc(16) int local16 = arg3 - this.anInt2143;
		@Pc(21) int local21 = arg3 + this.anInt2143;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class8_Sub1_Sub1_Sub6 local101;
		if (arg4) {
			local101 = new Class8_Sub1_Sub1_Sub6();
			local101.anInt2147 = this.anInt2147;
			local101.anInt2141 = this.anInt2141;
			local101.anInt2146 = this.anInt2146;
			local101.anIntArray285 = this.anIntArray285;
			local101.anIntArray278 = this.anIntArray278;
			local101.anIntArray275 = this.anIntArray275;
			local101.anIntArray280 = this.anIntArray280;
			local101.anIntArray282 = this.anIntArray282;
			local101.anIntArray283 = this.anIntArray283;
			local101.anIntArray277 = this.anIntArray277;
			local101.anIntArray279 = this.anIntArray279;
			local101.aByteArray33 = this.aByteArray33;
			local101.aByteArray32 = this.aByteArray32;
			local101.aByteArray34 = this.aByteArray34;
			local101.aShortArray34 = this.aShortArray34;
			local101.aByte4 = this.aByte4;
			local101.anIntArray284 = this.anIntArray284;
			local101.anIntArray274 = this.anIntArray274;
			local101.anIntArray276 = this.anIntArray276;
			local101.anIntArrayArray20 = this.anIntArrayArray20;
			local101.anIntArrayArray19 = this.anIntArrayArray19;
			local101.aBoolean81 = this.aBoolean81;
			local101.anIntArray281 = new int[local101.anInt2147];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt2147; local201++) {
				local209 = this.anIntArray285[local201] + arg1;
				local216 = this.anIntArray278[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray281[local201] = this.anIntArray281[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2147; local201++) {
				local209 = (-this.anIntArray281[local201] << 16) / super.anInt2957;
				if (local209 < arg5) {
					local216 = this.anIntArray285[local201] + arg1;
					local220 = this.anIntArray278[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray281[local201] = this.anIntArray281[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt2145 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
	public void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2147; local1++) {
			this.anIntArray285[local1] = this.anIntArray285[local1] * arg0 / 128;
			this.anIntArray281[local1] = this.anIntArray281[local1] * arg1 / 128;
			this.anIntArray278[local1] = this.anIntArray278[local1] * arg2 / 128;
		}
		this.anInt2145 = 0;
	}
}
