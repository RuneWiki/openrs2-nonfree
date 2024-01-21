import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!be", name = "Fb", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!be", name = "Gb", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "[I")
	public int[] anIntArray42;

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "I")
	public int anInt354 = 0;

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
	public int anInt352 = 0;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public int anInt356 = 0;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([Lclient!be;I)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) Class2_Sub1_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt354 = 0;
		this.anInt356 = 0;
		this.anInt352 = 0;
		this.aByte1 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class2_Sub1_Sub1_Sub2 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt354 += local41.anInt354;
				this.anInt356 += local41.anInt356;
				this.anInt352 += local41.anInt352;
				if (local41.aByteArray5 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local41.aByte1;
					}
					if (this.aByte1 != local41.aByte1) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray6 != null;
				local22 |= local41.aByteArray4 != null;
			}
		}
		this.anIntArray37 = new int[this.anInt354];
		this.anIntArray36 = new int[this.anInt354];
		this.anIntArray38 = new int[this.anInt354];
		this.anIntArray35 = new int[this.anInt356];
		this.anIntArray32 = new int[this.anInt356];
		this.anIntArray31 = new int[this.anInt356];
		this.anIntArray41 = new int[this.anInt356];
		this.anIntArray33 = new int[this.anInt356];
		this.anIntArray39 = new int[this.anInt356];
		if (this.anInt352 > 0) {
			this.anIntArray34 = new int[this.anInt352];
			this.anIntArray42 = new int[this.anInt352];
			this.anIntArray40 = new int[this.anInt352];
		}
		if (local18) {
			this.aByteArray5 = new byte[this.anInt356];
		}
		if (local20) {
			this.aByteArray6 = new byte[this.anInt356];
		}
		if (local22) {
			this.aByteArray4 = new byte[this.anInt356];
			this.aShortArray3 = new short[this.anInt356];
		}
		this.anInt354 = 0;
		this.anInt356 = 0;
		this.anInt352 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class2_Sub1_Sub1_Sub2 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt354;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt354; local221++) {
					this.anIntArray37[this.anInt354] = local214.anIntArray37[local221];
					this.anIntArray36[this.anInt354] = local214.anIntArray36[local221];
					this.anIntArray38[this.anInt354] = local214.anIntArray38[local221];
					this.anInt354++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt356; local262++) {
					this.anIntArray35[this.anInt356] = local214.anIntArray35[local262] + local219;
					this.anIntArray32[this.anInt356] = local214.anIntArray32[local262] + local219;
					this.anIntArray31[this.anInt356] = local214.anIntArray31[local262] + local219;
					this.anIntArray41[this.anInt356] = local214.anIntArray41[local262];
					this.anIntArray33[this.anInt356] = local214.anIntArray33[local262];
					this.anIntArray39[this.anInt356] = local214.anIntArray39[local262];
					if (local18) {
						if (local214.aByteArray5 == null) {
							this.aByteArray5[this.anInt356] = local214.aByte1;
						} else {
							this.aByteArray5[this.anInt356] = local214.aByteArray5[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray6 == null) {
							this.aByteArray6[this.anInt356] = 0;
						} else {
							this.aByteArray6[this.anInt356] = local214.aByteArray6[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray4 == null || local214.aByteArray4[local262] == -1) {
							this.aByteArray4[this.anInt356] = -1;
						} else {
							this.aByteArray4[this.anInt356] = (byte) (local214.aByteArray4[local262] + local207);
							this.aShortArray3[this.anInt356] = local214.aShortArray3[local262];
						}
					}
					this.anInt356++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt352; local418++) {
					this.anIntArray34[this.anInt352] = local214.anIntArray34[local418] + local219;
					this.anIntArray42[this.anInt352] = local214.anIntArray42[local418] + local219;
					this.anIntArray40[this.anInt352] = local214.anIntArray40[local418] + local219;
					this.anInt352++;
				}
				local207 += local214.anInt352;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	private void method200(@OriginalArg(0) int arg0) {
		if (Static12.aBooleanArray4[arg0]) {
			this.method205(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray35[arg0];
		@Pc(17) int local17 = this.anIntArray32[arg0];
		@Pc(22) int local22 = this.anIntArray31[arg0];
		Static52.aBoolean104 = Static12.aBooleanArray3[arg0];
		if (this.aByteArray6 == null) {
			Static52.anInt1582 = 0;
		} else {
			Static52.anInt1582 = this.aByteArray6[arg0] & 0xFF;
		}
		if (this.aByteArray4 != null && this.aByteArray4[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray4[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray34[local119];
			@Pc(129) int local129 = this.anIntArray42[local119];
			@Pc(134) int local134 = this.anIntArray40[local119];
			if (this.anIntArray39[arg0] == -1) {
				Static52.method926(Static12.anIntArray50[local12], Static12.anIntArray50[local17], Static12.anIntArray50[local22], Static12.anIntArray61[local12], Static12.anIntArray61[local17], Static12.anIntArray61[local22], this.anIntArray41[arg0], this.anIntArray41[arg0], this.anIntArray41[arg0], Static12.anIntArray58[local124], Static12.anIntArray58[local129], Static12.anIntArray58[local134], Static12.anIntArray48[local124], Static12.anIntArray48[local129], Static12.anIntArray48[local134], Static12.anIntArray57[local124], Static12.anIntArray57[local129], Static12.anIntArray57[local134], this.aShortArray3[arg0]);
			} else {
				Static52.method926(Static12.anIntArray50[local12], Static12.anIntArray50[local17], Static12.anIntArray50[local22], Static12.anIntArray61[local12], Static12.anIntArray61[local17], Static12.anIntArray61[local22], this.anIntArray41[arg0], this.anIntArray33[arg0], this.anIntArray39[arg0], Static12.anIntArray58[local124], Static12.anIntArray58[local129], Static12.anIntArray58[local134], Static12.anIntArray48[local124], Static12.anIntArray48[local129], Static12.anIntArray48[local134], Static12.anIntArray57[local124], Static12.anIntArray57[local129], Static12.anIntArray57[local134], this.aShortArray3[arg0]);
			}
		} else if (this.anIntArray39[arg0] == -1) {
			Static52.method941(Static12.anIntArray50[local12], Static12.anIntArray50[local17], Static12.anIntArray50[local22], Static12.anIntArray61[local12], Static12.anIntArray61[local17], Static12.anIntArray61[local22], Static12.anIntArray55[this.anIntArray41[arg0]]);
		} else {
			Static52.method940(Static12.anIntArray50[local12], Static12.anIntArray50[local17], Static12.anIntArray50[local22], Static12.anIntArray61[local12], Static12.anIntArray61[local17], Static12.anIntArray61[local22], this.anIntArray41[arg0], this.anIntArray33[arg0], this.anIntArray39[arg0]);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public void method201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt354; local1++) {
			this.anIntArray37[local1] += arg0;
			this.anIntArray36[local1] += arg1;
			this.anIntArray38[local1] += arg2;
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
	public void method203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static12.anIntArray56[0] = -1;
		if (this.anInt353 != 2 && this.anInt353 != 1) {
			this.method216();
		}
		@Pc(15) int local15 = Static52.anInt1583;
		@Pc(17) int local17 = Static52.anInt1589;
		@Pc(21) int local21 = Static12.anIntArray47[0];
		@Pc(25) int local25 = Static12.anIntArray45[0];
		@Pc(29) int local29 = Static12.anIntArray47[arg0];
		@Pc(33) int local33 = Static12.anIntArray45[arg0];
		@Pc(37) int local37 = Static12.anIntArray47[arg1];
		@Pc(41) int local41 = Static12.anIntArray45[arg1];
		@Pc(45) int local45 = Static12.anIntArray47[arg2];
		@Pc(49) int local49 = Static12.anIntArray45[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt354; local61++) {
			@Pc(67) int local67 = this.anIntArray37[local61];
			@Pc(72) int local72 = this.anIntArray36[local61];
			@Pc(77) int local77 = this.anIntArray38[local61];
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
			Static12.anIntArray59[local61] = local77 - local59;
			Static12.anIntArray61[local61] = local15 + (local67 << 9) / local77;
			Static12.anIntArray50[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt352 > 0) {
				Static12.anIntArray58[local61] = local67;
				Static12.anIntArray48[local61] = local89;
				Static12.anIntArray57[local61] = local77;
			}
		}
		try {
			this.method207(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method204(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static12.aByteArray8.length < this.anInt356) {
			Static12.aByteArray8 = new byte[this.anInt356 + 100];
		}
		return this.method217(arg0, Static12.aClass2_Sub1_Sub1_Sub2_2, Static12.aByteArray8);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	private void method205(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static52.anInt1583;
		@Pc(3) int local3 = Static52.anInt1589;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray35[arg0];
		@Pc(15) int local15 = this.anIntArray32[arg0];
		@Pc(20) int local20 = this.anIntArray31[arg0];
		@Pc(24) int local24 = Static12.anIntArray57[local10];
		@Pc(28) int local28 = Static12.anIntArray57[local15];
		@Pc(32) int local32 = Static12.anIntArray57[local20];
		if (this.aByteArray6 == null) {
			Static52.anInt1582 = 0;
		} else {
			Static52.anInt1582 = this.aByteArray6[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static12.anIntArray52[0] = Static12.anIntArray61[local10];
			Static12.anIntArray60[0] = Static12.anIntArray50[local10];
			local5++;
			Static12.anIntArray44[0] = this.anIntArray41[arg0];
		} else {
			local73 = Static12.anIntArray58[local10];
			local77 = Static12.anIntArray48[local10];
			local82 = this.anIntArray41[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static12.anIntArray43[local32 - local24];
				Static12.anIntArray52[0] = local1 + (local73 + ((Static12.anIntArray58[local20] - local73) * local95 >> 16) << 9) / 50;
				Static12.anIntArray60[0] = local3 + (local77 + ((Static12.anIntArray48[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static12.anIntArray44[0] = local82 + ((this.anIntArray39[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static12.anIntArray43[local28 - local24];
				Static12.anIntArray52[local5] = local1 + (local73 + ((Static12.anIntArray58[local15] - local73) * local95 >> 16) << 9) / 50;
				Static12.anIntArray60[local5] = local3 + (local77 + ((Static12.anIntArray48[local15] - local77) * local95 >> 16) << 9) / 50;
				Static12.anIntArray44[local5++] = local82 + ((this.anIntArray33[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static12.anIntArray52[local5] = Static12.anIntArray61[local15];
			Static12.anIntArray60[local5] = Static12.anIntArray50[local15];
			Static12.anIntArray44[local5++] = this.anIntArray33[arg0];
		} else {
			local73 = Static12.anIntArray58[local15];
			local77 = Static12.anIntArray48[local15];
			local82 = this.anIntArray33[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static12.anIntArray43[local24 - local28];
				Static12.anIntArray52[local5] = local1 + (local73 + ((Static12.anIntArray58[local10] - local73) * local95 >> 16) << 9) / 50;
				Static12.anIntArray60[local5] = local3 + (local77 + ((Static12.anIntArray48[local10] - local77) * local95 >> 16) << 9) / 50;
				Static12.anIntArray44[local5++] = local82 + ((this.anIntArray41[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static12.anIntArray43[local32 - local28];
				Static12.anIntArray52[local5] = local1 + (local73 + ((Static12.anIntArray58[local20] - local73) * local95 >> 16) << 9) / 50;
				Static12.anIntArray60[local5] = local3 + (local77 + ((Static12.anIntArray48[local20] - local77) * local95 >> 16) << 9) / 50;
				Static12.anIntArray44[local5++] = local82 + ((this.anIntArray39[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static12.anIntArray52[local5] = Static12.anIntArray61[local20];
			Static12.anIntArray60[local5] = Static12.anIntArray50[local20];
			Static12.anIntArray44[local5++] = this.anIntArray39[arg0];
		} else {
			local73 = Static12.anIntArray58[local20];
			local77 = Static12.anIntArray48[local20];
			local82 = this.anIntArray39[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static12.anIntArray43[local28 - local32];
				Static12.anIntArray52[local5] = local1 + (local73 + ((Static12.anIntArray58[local15] - local73) * local95 >> 16) << 9) / 50;
				Static12.anIntArray60[local5] = local3 + (local77 + ((Static12.anIntArray48[local15] - local77) * local95 >> 16) << 9) / 50;
				Static12.anIntArray44[local5++] = local82 + ((this.anIntArray33[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static12.anIntArray43[local24 - local32];
				Static12.anIntArray52[local5] = local1 + (local73 + ((Static12.anIntArray58[local10] - local73) * local95 >> 16) << 9) / 50;
				Static12.anIntArray60[local5] = local3 + (local77 + ((Static12.anIntArray48[local10] - local77) * local95 >> 16) << 9) / 50;
				Static12.anIntArray44[local5++] = local82 + ((this.anIntArray41[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static12.anIntArray52[0];
		local77 = Static12.anIntArray52[1];
		local82 = Static12.anIntArray52[2];
		local95 = Static12.anIntArray60[0];
		@Pc(590) int local590 = Static12.anIntArray60[1];
		@Pc(594) int local594 = Static12.anIntArray60[2];
		Static52.aBoolean104 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static52.anInt1590 || local77 > Static52.anInt1590 || local82 > Static52.anInt1590) {
				Static52.aBoolean104 = true;
			}
			if (this.aByteArray4 != null && this.aByteArray4[arg0] != -1) {
				local669 = this.aByteArray4[arg0] & 0xFF;
				local674 = this.anIntArray34[local669];
				local679 = this.anIntArray42[local669];
				local684 = this.anIntArray40[local669];
				if (this.anIntArray39[arg0] == -1) {
					Static52.method926(local95, local590, local594, local73, local77, local82, this.anIntArray41[arg0], this.anIntArray41[arg0], this.anIntArray41[arg0], Static12.anIntArray58[local674], Static12.anIntArray58[local679], Static12.anIntArray58[local684], Static12.anIntArray48[local674], Static12.anIntArray48[local679], Static12.anIntArray48[local684], Static12.anIntArray57[local674], Static12.anIntArray57[local679], Static12.anIntArray57[local684], this.aShortArray3[arg0]);
				} else {
					Static52.method926(local95, local590, local594, local73, local77, local82, Static12.anIntArray44[0], Static12.anIntArray44[1], Static12.anIntArray44[2], Static12.anIntArray58[local674], Static12.anIntArray58[local679], Static12.anIntArray58[local684], Static12.anIntArray48[local674], Static12.anIntArray48[local679], Static12.anIntArray48[local684], Static12.anIntArray57[local674], Static12.anIntArray57[local679], Static12.anIntArray57[local684], this.aShortArray3[arg0]);
				}
			} else if (this.anIntArray39[arg0] == -1) {
				Static52.method941(local95, local590, local594, local73, local77, local82, Static12.anIntArray55[this.anIntArray41[arg0]]);
			} else {
				Static52.method940(local95, local590, local594, local73, local77, local82, Static12.anIntArray44[0], Static12.anIntArray44[1], Static12.anIntArray44[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static52.anInt1590 || local77 > Static52.anInt1590 || local82 > Static52.anInt1590 || Static12.anIntArray52[3] < 0 || Static12.anIntArray52[3] > Static52.anInt1590) {
			Static52.aBoolean104 = true;
		}
		if (this.aByteArray4 == null || this.aByteArray4[arg0] == -1) {
			if (this.anIntArray39[arg0] == -1) {
				local669 = Static12.anIntArray55[this.anIntArray41[arg0]];
				Static52.method941(local95, local590, local594, local73, local77, local82, local669);
				Static52.method941(local95, local594, Static12.anIntArray60[3], local73, local82, Static12.anIntArray52[3], local669);
				return;
			}
			Static52.method940(local95, local590, local594, local73, local77, local82, Static12.anIntArray44[0], Static12.anIntArray44[1], Static12.anIntArray44[2]);
			Static52.method940(local95, local594, Static12.anIntArray60[3], local73, local82, Static12.anIntArray52[3], Static12.anIntArray44[0], Static12.anIntArray44[2], Static12.anIntArray44[3]);
			return;
		}
		local669 = this.aByteArray4[arg0] & 0xFF;
		local674 = this.anIntArray34[local669];
		local679 = this.anIntArray42[local669];
		local684 = this.anIntArray40[local669];
		@Pc(924) short local924 = this.aShortArray3[arg0];
		if (this.anIntArray39[arg0] == -1) {
			Static52.method926(local95, local590, local594, local73, local77, local82, this.anIntArray41[arg0], this.anIntArray41[arg0], this.anIntArray41[arg0], Static12.anIntArray58[local674], Static12.anIntArray58[local679], Static12.anIntArray58[local684], Static12.anIntArray48[local674], Static12.anIntArray48[local679], Static12.anIntArray48[local684], Static12.anIntArray57[local674], Static12.anIntArray57[local679], Static12.anIntArray57[local684], local924);
			Static52.method926(local95, local594, Static12.anIntArray60[3], local73, local82, Static12.anIntArray52[3], this.anIntArray41[arg0], this.anIntArray41[arg0], this.anIntArray41[arg0], Static12.anIntArray58[local674], Static12.anIntArray58[local679], Static12.anIntArray58[local684], Static12.anIntArray48[local674], Static12.anIntArray48[local679], Static12.anIntArray48[local684], Static12.anIntArray57[local674], Static12.anIntArray57[local679], Static12.anIntArray57[local684], local924);
			return;
		}
		Static52.method926(local95, local590, local594, local73, local77, local82, Static12.anIntArray44[0], Static12.anIntArray44[1], Static12.anIntArray44[2], Static12.anIntArray58[local674], Static12.anIntArray58[local679], Static12.anIntArray58[local684], Static12.anIntArray48[local674], Static12.anIntArray48[local679], Static12.anIntArray48[local684], Static12.anIntArray57[local674], Static12.anIntArray57[local679], Static12.anIntArray57[local684], local924);
		Static52.method926(local95, local594, Static12.anIntArray60[3], local73, local82, Static12.anIntArray52[3], Static12.anIntArray44[0], Static12.anIntArray44[2], Static12.anIntArray44[3], Static12.anIntArray58[local674], Static12.anIntArray58[local679], Static12.anIntArray58[local684], Static12.anIntArray48[local674], Static12.anIntArray48[local679], Static12.anIntArray48[local684], Static12.anIntArray57[local674], Static12.anIntArray57[local679], Static12.anIntArray57[local684], local924);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[IIII)V")
	private void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static12.anInt363 = 0;
			Static12.anInt361 = 0;
			Static12.anInt360 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray3.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray3[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static12.anInt363 += this.anIntArray37[local36];
						Static12.anInt361 += this.anIntArray36[local36];
						Static12.anInt360 += this.anIntArray38[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static12.anInt363 = Static12.anInt363 / local6 + arg2;
				Static12.anInt361 = Static12.anInt361 / local6 + arg3;
				Static12.anInt360 = Static12.anInt360 / local6 + arg4;
			} else {
				Static12.anInt363 = arg2;
				Static12.anInt361 = arg3;
				Static12.anInt360 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local115 = this.anIntArrayArray3[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray37[local31] += arg2;
						this.anIntArray36[local31] += arg3;
						this.anIntArray38[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local115 = this.anIntArrayArray3[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray37[local31] -= Static12.anInt363;
						this.anIntArray36[local31] -= Static12.anInt361;
						this.anIntArray38[local31] -= Static12.anInt360;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static12.anIntArray47[local225];
							local235 = Static12.anIntArray45[local225];
							local251 = this.anIntArray36[local31] * local231 + this.anIntArray37[local31] * local235 >> 16;
							this.anIntArray36[local31] = this.anIntArray36[local31] * local235 - this.anIntArray37[local31] * local231 >> 16;
							this.anIntArray37[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static12.anIntArray47[local36];
							local235 = Static12.anIntArray45[local36];
							local251 = this.anIntArray36[local31] * local235 - this.anIntArray38[local31] * local231 >> 16;
							this.anIntArray38[local31] = this.anIntArray36[local31] * local231 + this.anIntArray38[local31] * local235 >> 16;
							this.anIntArray36[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static12.anIntArray47[local219];
							local235 = Static12.anIntArray45[local219];
							local251 = this.anIntArray38[local31] * local231 + this.anIntArray37[local31] * local235 >> 16;
							this.anIntArray38[local31] = this.anIntArray38[local31] * local235 - this.anIntArray37[local31] * local231 >> 16;
							this.anIntArray37[local31] = local251;
						}
						this.anIntArray37[local31] += Static12.anInt363;
						this.anIntArray36[local31] += Static12.anInt361;
						this.anIntArray38[local31] += Static12.anInt360;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local115 = this.anIntArrayArray3[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray37[local31] -= Static12.anInt363;
						this.anIntArray36[local31] -= Static12.anInt361;
						this.anIntArray38[local31] -= Static12.anInt360;
						this.anIntArray37[local31] = this.anIntArray37[local31] * arg2 / 128;
						this.anIntArray36[local31] = this.anIntArray36[local31] * arg3 / 128;
						this.anIntArray38[local31] = this.anIntArray38[local31] * arg4 / 128;
						this.anIntArray37[local31] += Static12.anInt363;
						this.anIntArray36[local31] += Static12.anInt361;
						this.anIntArray38[local31] += Static12.anInt360;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray2 != null && this.aByteArray6 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray6[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray6[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZI)V")
	private void method207(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt351 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt351; local6++) {
			Static12.anIntArray56[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt356; local18++) {
			if (this.anIntArray39[local18] != -2) {
				local30 = this.anIntArray35[local18];
				local35 = this.anIntArray32[local18];
				local40 = this.anIntArray31[local18];
				local44 = Static12.anIntArray61[local30];
				local48 = Static12.anIntArray61[local35];
				local52 = Static12.anIntArray61[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static12.anIntArray58[local30];
					local71 = Static12.anIntArray58[local35];
					@Pc(75) int local75 = Static12.anIntArray58[local40];
					@Pc(79) int local79 = Static12.anIntArray48[local30];
					local83 = Static12.anIntArray48[local35];
					local87 = Static12.anIntArray48[local40];
					@Pc(91) int local91 = Static12.anIntArray57[local30];
					local95 = Static12.anIntArray57[local35];
					@Pc(99) int local99 = Static12.anIntArray57[local40];
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
						Static12.aBooleanArray4[local18] = true;
						@Pc(180) int local180 = (Static12.anIntArray59[local30] + Static12.anIntArray59[local35] + Static12.anIntArray59[local40]) / 3 + this.anInt355;
						Static12.anIntArrayArray5[local180][Static12.anIntArray56[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method202(Static12.anInt359, Static12.anInt362, Static12.anIntArray50[local30], Static12.anIntArray50[local35], Static12.anIntArray50[local40], local44, local48, local52)) {
						Static12.anIntArray53[Static12.anInt358++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static12.anIntArray50[local40] - Static12.anIntArray50[local35]) - (Static12.anIntArray50[local30] - Static12.anIntArray50[local35]) * (local52 - local48) > 0) {
						Static12.aBooleanArray4[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static52.anInt1590 && local48 <= Static52.anInt1590 && local52 <= Static52.anInt1590) {
							Static12.aBooleanArray3[local18] = false;
						} else {
							Static12.aBooleanArray3[local18] = true;
						}
						local67 = (Static12.anIntArray59[local30] + Static12.anIntArray59[local35] + Static12.anIntArray59[local40]) / 3 + this.anInt355;
						Static12.anIntArrayArray5[local67][Static12.anIntArray56[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray5 == null) {
			for (local30 = this.anInt351 - 1; local30 >= 0; local30--) {
				local35 = Static12.anIntArray56[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static12.anIntArrayArray5[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method200(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static12.anIntArray49[local30] = 0;
			Static12.anIntArray51[local30] = 0;
		}
		for (local35 = this.anInt351 - 1; local35 >= 0; local35--) {
			local40 = Static12.anIntArray56[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static12.anIntArrayArray5[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray5[local52];
					local71 = Static12.anIntArray49[local388]++;
					Static12.anIntArrayArray4[local388][local71] = local52;
					if (local388 < 10) {
						Static12.anIntArray51[local388] += local35;
					} else if (local388 == 10) {
						Static12.anIntArray46[local71] = local35;
					} else {
						Static12.anIntArray54[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static12.anIntArray49[1] > 0 || Static12.anIntArray49[2] > 0) {
			local40 = (Static12.anIntArray51[1] + Static12.anIntArray51[2]) / (Static12.anIntArray49[1] + Static12.anIntArray49[2]);
		}
		local44 = 0;
		if (Static12.anIntArray49[3] > 0 || Static12.anIntArray49[4] > 0) {
			local44 = (Static12.anIntArray51[3] + Static12.anIntArray51[4]) / (Static12.anIntArray49[3] + Static12.anIntArray49[4]);
		}
		local48 = 0;
		if (Static12.anIntArray49[6] > 0 || Static12.anIntArray49[8] > 0) {
			local48 = (Static12.anIntArray51[6] + Static12.anIntArray51[8]) / (Static12.anIntArray49[6] + Static12.anIntArray49[8]);
		}
		local67 = 0;
		local71 = Static12.anIntArray49[10];
		@Pc(521) int[] local521 = Static12.anIntArrayArray4[10];
		@Pc(523) int[] local523 = Static12.anIntArray46;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static12.anIntArray49[11];
			local521 = Static12.anIntArrayArray4[11];
			local523 = Static12.anIntArray54;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method200(local521[local67++]);
				if (local67 == local71 && local521 != Static12.anIntArrayArray4[11]) {
					local67 = 0;
					local71 = Static12.anIntArray49[11];
					local521 = Static12.anIntArrayArray4[11];
					local523 = Static12.anIntArray54;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method200(local521[local67++]);
				if (local67 == local71 && local521 != Static12.anIntArrayArray4[11]) {
					local67 = 0;
					local71 = Static12.anIntArray49[11];
					local521 = Static12.anIntArrayArray4[11];
					local523 = Static12.anIntArray54;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method200(local521[local67++]);
				if (local67 == local71 && local521 != Static12.anIntArrayArray4[11]) {
					local67 = 0;
					local71 = Static12.anIntArray49[11];
					local521 = Static12.anIntArrayArray4[11];
					local523 = Static12.anIntArray54;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static12.anIntArray49[local83];
			@Pc(686) int[] local686 = Static12.anIntArrayArray4[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method200(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method200(local521[local67++]);
			if (local67 == local71 && local521 != Static12.anIntArrayArray4[11]) {
				local67 = 0;
				local521 = Static12.anIntArrayArray4[11];
				local71 = Static12.anIntArray49[11];
				local523 = Static12.anIntArray54;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	public void method208() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt354; local1++) {
			this.anIntArray37[local1] = -this.anIntArray37[local1];
			this.anIntArray38[local1] = -this.anIntArray38[local1];
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIIIIII)V")
	public void method209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static12.anIntArray56[0] = -1;
		if (this.anInt353 != 2 && this.anInt353 != 1) {
			this.method216();
		}
		@Pc(15) int local15 = Static52.anInt1583;
		@Pc(17) int local17 = Static52.anInt1589;
		@Pc(21) int local21 = Static12.anIntArray47[0];
		@Pc(25) int local25 = Static12.anIntArray45[0];
		@Pc(29) int local29 = Static12.anIntArray47[arg0];
		@Pc(33) int local33 = Static12.anIntArray45[arg0];
		@Pc(37) int local37 = Static12.anIntArray47[arg1];
		@Pc(41) int local41 = Static12.anIntArray45[arg1];
		@Pc(45) int local45 = Static12.anIntArray47[arg2];
		@Pc(49) int local49 = Static12.anIntArray45[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt354; local61++) {
			@Pc(67) int local67 = this.anIntArray37[local61];
			@Pc(72) int local72 = this.anIntArray36[local61];
			@Pc(77) int local77 = this.anIntArray38[local61];
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
			Static12.anIntArray59[local61] = local77 - local59;
			Static12.anIntArray61[local61] = local15 + (local67 << 9) / arg6;
			Static12.anIntArray50[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt352 > 0) {
				Static12.anIntArray58[local61] = local67;
				Static12.anIntArray48[local61] = local89;
				Static12.anIntArray57[local61] = local77;
			}
		}
		try {
			this.method207(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public void method210(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static12.anIntArray47[arg0];
		@Pc(7) int local7 = Static12.anIntArray45[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt354; local9++) {
			@Pc(26) int local26 = this.anIntArray36[local9] * local7 - this.anIntArray38[local9] * local3 >> 16;
			this.anIntArray38[local9] = this.anIntArray36[local9] * local3 + this.anIntArray38[local9] * local7 >> 16;
			this.anIntArray36[local9] = local26;
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
	public void method211() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt354; local1++) {
			@Pc(7) int local7 = this.anIntArray38[local1];
			this.anIntArray38[local1] = this.anIntArray37[local1];
			this.anIntArray37[local1] = -local7;
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(Z)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method212(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static12.aByteArray7.length < this.anInt356) {
			Static12.aByteArray7 = new byte[this.anInt356 + 100];
		}
		return this.method217(arg0, Static12.aClass2_Sub1_Sub1_Sub2_1, Static12.aByteArray7);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()I")
	public int method213() {
		this.method221();
		return this.anInt350;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static12.anIntArray56[0] = -1;
		if (this.anInt353 != 1) {
			this.method221();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt350 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt350 << 9;
		if (local64 / local40 >= Static52.anInt1585) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt350 << 9;
		if (local77 / local40 <= Static52.anInt1587) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt350 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static52.anInt1586) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2306 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static52.anInt1584) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2306 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt352 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static12.aBoolean31) {
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
			local219 = Static12.anInt359 - Static52.anInt1583;
			local223 = Static12.anInt362 - Static52.anInt1589;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean30) {
					Static12.anIntArray53[Static12.anInt358++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static52.anInt1583;
		local219 = Static52.anInt1589;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static12.anIntArray47[arg0];
			local257 = Static12.anIntArray45[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt354; local269++) {
			@Pc(275) int local275 = this.anIntArray37[local269];
			@Pc(280) int local280 = this.anIntArray36[local269];
			@Pc(285) int local285 = this.anIntArray38[local269];
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
			Static12.anIntArray59[local269] = local285 - local29;
			if (local285 >= 50) {
				Static12.anIntArray61[local269] = local172 + (local275 << 9) / local285;
				Static12.anIntArray50[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static12.anIntArray61[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static12.anIntArray58[local269] = local275;
				Static12.anIntArray48[local269] = local297;
				Static12.anIntArray57[local269] = local285;
			}
		}
		try {
			this.method207(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "()V")
	public void method215() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt354; local1++) {
			@Pc(7) int local7 = this.anIntArray37[local1];
			this.anIntArray37[local1] = this.anIntArray38[local1];
			this.anIntArray38[local1] = -local7;
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "()V")
	private void method216() {
		if (this.anInt353 == 2) {
			return;
		}
		this.anInt353 = 2;
		this.anInt350 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt354; local12++) {
			@Pc(18) int local18 = this.anIntArray37[local12];
			@Pc(23) int local23 = this.anIntArray36[local12];
			@Pc(28) int local28 = this.anIntArray38[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt350) {
				this.anInt350 = local40;
			}
		}
		this.anInt350 = (int) (Math.sqrt((double) this.anInt350) + 0.99D);
		this.anInt355 = this.anInt350;
		this.anInt351 = this.anInt350 + this.anInt350;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!be;[B)Lclient!be;")
	private Class2_Sub1_Sub1_Sub2 method217(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt354 = this.anInt354;
		arg1.anInt356 = this.anInt356;
		arg1.anInt352 = this.anInt352;
		if (arg1.anIntArray37 == null || arg1.anIntArray37.length < this.anInt354) {
			arg1.anIntArray37 = new int[this.anInt354 + 100];
			arg1.anIntArray36 = new int[this.anInt354 + 100];
			arg1.anIntArray38 = new int[this.anInt354 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt354; local43++) {
			arg1.anIntArray37[local43] = this.anIntArray37[local43];
			arg1.anIntArray36[local43] = this.anIntArray36[local43];
			arg1.anIntArray38[local43] = this.anIntArray38[local43];
		}
		if (arg0) {
			arg1.aByteArray6 = this.aByteArray6;
		} else {
			arg1.aByteArray6 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray6 == null) {
				for (local88 = 0; local88 < this.anInt356; local88++) {
					arg1.aByteArray6[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt356; local88++) {
					arg1.aByteArray6[local88] = this.aByteArray6[local88];
				}
			}
		}
		arg1.anIntArray35 = this.anIntArray35;
		arg1.anIntArray32 = this.anIntArray32;
		arg1.anIntArray31 = this.anIntArray31;
		arg1.anIntArray41 = this.anIntArray41;
		arg1.anIntArray33 = this.anIntArray33;
		arg1.anIntArray39 = this.anIntArray39;
		arg1.aByteArray5 = this.aByteArray5;
		arg1.aByteArray4 = this.aByteArray4;
		arg1.aShortArray3 = this.aShortArray3;
		arg1.aByte1 = this.aByte1;
		arg1.anIntArray34 = this.anIntArray34;
		arg1.anIntArray42 = this.anIntArray42;
		arg1.anIntArray40 = this.anIntArray40;
		arg1.anIntArrayArray3 = this.anIntArrayArray3;
		arg1.anIntArrayArray2 = this.anIntArrayArray2;
		arg1.aBoolean30 = this.aBoolean30;
		arg1.anInt353 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public void method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt354; local1++) {
			this.anIntArray37[local1] = this.anIntArray37[local1] * arg0 / 128;
			this.anIntArray36[local1] = this.anIntArray36[local1] * arg1 / 128;
			this.anIntArray38[local1] = this.anIntArray38[local1] * arg2 / 128;
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!te;I)V")
	public void method219(@OriginalArg(0) Class2_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray3 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class69 local12 = arg0.aClass69Array1[arg1];
		@Pc(15) Class2_Sub9 local15 = local12.aClass2_Sub9_1;
		Static12.anInt363 = 0;
		Static12.anInt361 = 0;
		Static12.anInt360 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2882; local23++) {
			@Pc(29) int local29 = local12.anIntArray370[local23];
			this.method206(local15.anIntArray233[local29], local15.anIntArrayArray22[local29], local12.anIntArray374[local23], local12.anIntArray371[local23], local12.anIntArray373[local23]);
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!te;ILclient!te;I[I)V")
	public void method220(@OriginalArg(0) Class2_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method219(arg0, arg1);
			return;
		}
		@Pc(18) Class69 local18 = arg0.aClass69Array1[arg1];
		@Pc(23) Class69 local23 = arg2.aClass69Array1[arg3];
		@Pc(26) Class2_Sub9 local26 = local18.aClass2_Sub9_1;
		Static12.anInt363 = 0;
		Static12.anInt361 = 0;
		Static12.anInt360 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2882; local41++) {
			local47 = local18.anIntArray370[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray233[local47] == 0) {
				this.method206(local26.anIntArray233[local47], local26.anIntArrayArray22[local47], local18.anIntArray374[local41], local18.anIntArray371[local41], local18.anIntArray373[local41]);
			}
		}
		Static12.anInt363 = 0;
		Static12.anInt361 = 0;
		Static12.anInt360 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2882; local47++) {
			@Pc(112) int local112 = local23.anIntArray370[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray233[local112] == 0) {
				this.method206(local26.anIntArray233[local112], local26.anIntArrayArray22[local112], local23.anIntArray374[local47], local23.anIntArray371[local47], local23.anIntArray373[local47]);
			}
		}
		this.anInt353 = 0;
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "()V")
	public void method221() {
		if (this.anInt353 == 1) {
			return;
		}
		this.anInt353 = 1;
		super.anInt2306 = 0;
		this.anInt357 = 0;
		this.anInt350 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt354; local18++) {
			@Pc(24) int local24 = this.anIntArray37[local18];
			@Pc(29) int local29 = this.anIntArray36[local18];
			@Pc(34) int local34 = this.anIntArray38[local18];
			if (-local29 > super.anInt2306) {
				super.anInt2306 = -local29;
			}
			if (local29 > this.anInt357) {
				this.anInt357 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt350) {
				this.anInt350 = local58;
			}
		}
		this.anInt350 = (int) (Math.sqrt((double) this.anInt350) + 0.99D);
		this.anInt355 = (int) (Math.sqrt((double) (this.anInt350 * this.anInt350 + super.anInt2306 * super.anInt2306)) + 0.99D);
		this.anInt351 = this.anInt355 + (int) (Math.sqrt((double) (this.anInt350 * this.anInt350 + this.anInt357 * this.anInt357)) + 0.99D);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZ)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class2_Sub1_Sub1_Sub2 local16;
		if (arg4) {
			local16 = new Class2_Sub1_Sub1_Sub2();
			local16.anInt354 = this.anInt354;
			local16.anInt356 = this.anInt356;
			local16.anInt352 = this.anInt352;
			local16.anIntArray37 = this.anIntArray37;
			local16.anIntArray38 = this.anIntArray38;
			local16.anIntArray35 = this.anIntArray35;
			local16.anIntArray32 = this.anIntArray32;
			local16.anIntArray31 = this.anIntArray31;
			local16.anIntArray41 = this.anIntArray41;
			local16.anIntArray33 = this.anIntArray33;
			local16.anIntArray39 = this.anIntArray39;
			local16.aByteArray5 = this.aByteArray5;
			local16.aByteArray6 = this.aByteArray6;
			local16.aByteArray4 = this.aByteArray4;
			local16.aShortArray3 = this.aShortArray3;
			local16.aByte1 = this.aByte1;
			local16.anIntArray34 = this.anIntArray34;
			local16.anIntArray42 = this.anIntArray42;
			local16.anIntArray40 = this.anIntArray40;
			local16.anIntArrayArray3 = this.anIntArrayArray3;
			local16.anIntArrayArray2 = this.anIntArrayArray2;
			local16.aBoolean30 = this.aBoolean30;
			local16.anIntArray36 = new int[local16.anInt354];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt354; local124++) {
			@Pc(130) int local130 = this.anIntArray37[local124];
			@Pc(135) int local135 = this.anIntArray36[local124];
			@Pc(140) int local140 = this.anIntArray38[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray36[local124] = local135 + local176 - local122;
		}
		local16.anInt353 = 0;
		return local16;
	}
}
