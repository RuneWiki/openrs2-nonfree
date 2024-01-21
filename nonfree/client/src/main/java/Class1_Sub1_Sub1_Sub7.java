import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub1_Sub1_Sub7 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!td", name = "sb", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
	public int anInt2700;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!td", name = "zb", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!td", name = "Ab", descriptor = "[Lclient!g;")
	private Class26[] aClass26Array1;

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!td", name = "Db", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!td", name = "Eb", descriptor = "I")
	public int anInt2701;

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "I")
	public int anInt2702;

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!td", name = "Kb", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!td", name = "Lb", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!td", name = "Mb", descriptor = "I")
	public int anInt2703;

	@OriginalMember(owner = "client!td", name = "Nb", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!td", name = "Qb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!td", name = "Rb", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!td", name = "Sb", descriptor = "[Lclient!t;")
	public Class69[] aClass69Array1;

	@OriginalMember(owner = "client!td", name = "Tb", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!td", name = "Ub", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!td", name = "Vb", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!td", name = "Wb", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!td", name = "Xb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!td", name = "Yb", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!td", name = "Zb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!td", name = "bc", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!td", name = "cc", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!td", name = "dc", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!td", name = "fc", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!td", name = "gc", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!td", name = "hc", descriptor = "[Lclient!t;")
	public Class69[] aClass69Array2;

	@OriginalMember(owner = "client!td", name = "ic", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!td", name = "jc", descriptor = "I")
	public int anInt2707;

	@OriginalMember(owner = "client!td", name = "kc", descriptor = "[I")
	public int[] anIntArray469;

	@OriginalMember(owner = "client!td", name = "lc", descriptor = "I")
	private int anInt2708;

	@OriginalMember(owner = "client!td", name = "mc", descriptor = "[I")
	public int[] anIntArray470;

	@OriginalMember(owner = "client!td", name = "xb", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!td", name = "Pb", descriptor = "I")
	public int anInt2704 = 0;

	@OriginalMember(owner = "client!td", name = "Ob", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!td", name = "ec", descriptor = "I")
	public int anInt2706 = 0;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1912(arg0);
		} else {
			this.method1904(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([Lclient!td;I)V")
	public Class1_Sub1_Sub1_Sub7(@OriginalArg(0) Class1_Sub1_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2704 = 0;
		this.anInt2706 = 0;
		this.anInt2708 = 0;
		this.aByte7 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub1_Sub1_Sub7 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2704 += local44.anInt2704;
				this.anInt2706 += local44.anInt2706;
				this.anInt2708 += local44.anInt2708;
				if (local44.aByteArray34 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local44.aByte7;
					}
					if (this.aByte7 != local44.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray33 != null;
				local19 |= local44.aByteArray35 != null;
				local21 |= local44.anIntArray466 != null;
				local23 |= local44.aShortArray94 != null;
				local25 |= local44.aByteArray30 != null;
			}
		}
		this.anIntArray463 = new int[this.anInt2704];
		this.anIntArray467 = new int[this.anInt2704];
		this.anIntArray470 = new int[this.anInt2704];
		this.anIntArray465 = new int[this.anInt2704];
		this.anIntArray459 = new int[this.anInt2706];
		this.anIntArray469 = new int[this.anInt2706];
		this.anIntArray468 = new int[this.anInt2706];
		if (local15) {
			this.aByteArray33 = new byte[this.anInt2706];
		}
		if (local17) {
			this.aByteArray34 = new byte[this.anInt2706];
		}
		if (local19) {
			this.aByteArray35 = new byte[this.anInt2706];
		}
		if (local21) {
			this.anIntArray466 = new int[this.anInt2706];
		}
		if (local23) {
			this.aShortArray94 = new short[this.anInt2706];
		}
		if (local25) {
			this.aByteArray30 = new byte[this.anInt2706];
		}
		this.aShortArray92 = new short[this.anInt2706];
		if (this.anInt2708 > 0) {
			this.aByteArray32 = new byte[this.anInt2708];
			this.aShortArray90 = new short[this.anInt2708];
			this.aShortArray89 = new short[this.anInt2708];
			this.aShortArray87 = new short[this.anInt2708];
			this.aShortArray86 = new short[this.anInt2708];
			this.aShortArray93 = new short[this.anInt2708];
			this.aShortArray95 = new short[this.anInt2708];
			this.aShortArray85 = new short[this.anInt2708];
			this.aByteArray31 = new byte[this.anInt2708];
			this.aShortArray88 = new short[this.anInt2708];
			this.aShortArray91 = new short[this.anInt2708];
		}
		this.anInt2704 = 0;
		this.anInt2706 = 0;
		this.anInt2708 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class1_Sub1_Sub1_Sub7 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt2706; local297++) {
					if (local15 && local293.aByteArray33 != null) {
						this.aByteArray33[this.anInt2706] = local293.aByteArray33[local297];
					}
					if (local17) {
						if (local293.aByteArray34 == null) {
							this.aByteArray34[this.anInt2706] = local293.aByte7;
						} else {
							this.aByteArray34[this.anInt2706] = local293.aByteArray34[local297];
						}
					}
					if (local19 && local293.aByteArray35 != null) {
						this.aByteArray35[this.anInt2706] = local293.aByteArray35[local297];
					}
					if (local21 && local293.anIntArray466 != null) {
						this.anIntArray466[this.anInt2706] = local293.anIntArray466[local297];
					}
					if (local23) {
						if (local293.aShortArray94 == null) {
							this.aShortArray94[this.anInt2706] = -1;
						} else {
							this.aShortArray94[this.anInt2706] = local293.aShortArray94[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray30 == null || local293.aByteArray30[local297] == -1) {
							this.aByteArray30[this.anInt2706] = -1;
						} else {
							this.aByteArray30[this.anInt2706] = (byte) (local293.aByteArray30[local297] + this.anInt2708);
						}
					}
					this.aShortArray92[this.anInt2706] = local293.aShortArray92[local297];
					this.anIntArray459[this.anInt2706] = this.method1920(local293, local293.anIntArray459[local297]);
					this.anIntArray469[this.anInt2706] = this.method1920(local293, local293.anIntArray469[local297]);
					this.anIntArray468[this.anInt2706] = this.method1920(local293, local293.anIntArray468[local297]);
					this.anInt2706++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt2708; local472++) {
					@Pc(484) byte local484 = this.aByteArray32[this.anInt2708] = local293.aByteArray32[local472];
					if (local484 == 0) {
						this.aShortArray90[this.anInt2708] = (short) this.method1920(local293, local293.aShortArray90[local472]);
						this.aShortArray89[this.anInt2708] = (short) this.method1920(local293, local293.aShortArray89[local472]);
						this.aShortArray87[this.anInt2708] = (short) this.method1920(local293, local293.aShortArray87[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray90[this.anInt2708] = local293.aShortArray90[local472];
						this.aShortArray89[this.anInt2708] = local293.aShortArray89[local472];
						this.aShortArray87[this.anInt2708] = local293.aShortArray87[local472];
						this.aShortArray86[this.anInt2708] = local293.aShortArray86[local472];
						this.aShortArray93[this.anInt2708] = local293.aShortArray93[local472];
						this.aShortArray95[this.anInt2708] = local293.aShortArray95[local472];
						this.aShortArray85[this.anInt2708] = local293.aShortArray85[local472];
						this.aByteArray31[this.anInt2708] = local293.aByteArray31[local472];
						this.aShortArray88[this.anInt2708] = local293.aShortArray88[local472];
					}
					if (local484 == 2) {
						this.aShortArray91[this.anInt2708] = local293.aShortArray91[local472];
					}
					this.anInt2708++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!td;ZZZZ)V")
	public Class1_Sub1_Sub1_Sub7(@OriginalArg(0) Class1_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2704 = arg0.anInt2704;
		this.anInt2706 = arg0.anInt2706;
		this.anInt2708 = arg0.anInt2708;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray463 = arg0.anIntArray463;
			this.anIntArray467 = arg0.anIntArray467;
			this.anIntArray470 = arg0.anIntArray470;
		} else {
			this.anIntArray463 = new int[this.anInt2704];
			this.anIntArray467 = new int[this.anInt2704];
			this.anIntArray470 = new int[this.anInt2704];
			for (local57 = 0; local57 < this.anInt2704; local57++) {
				this.anIntArray463[local57] = arg0.anIntArray463[local57];
				this.anIntArray467[local57] = arg0.anIntArray467[local57];
				this.anIntArray470[local57] = arg0.anIntArray470[local57];
			}
		}
		if (arg2) {
			this.aShortArray92 = arg0.aShortArray92;
		} else {
			this.aShortArray92 = new short[this.anInt2706];
			for (local57 = 0; local57 < this.anInt2706; local57++) {
				this.aShortArray92[local57] = arg0.aShortArray92[local57];
			}
		}
		if (arg3 || arg0.aShortArray94 == null) {
			this.aShortArray94 = arg0.aShortArray94;
		} else {
			this.aShortArray94 = new short[this.anInt2706];
			for (local57 = 0; local57 < this.anInt2706; local57++) {
				this.aShortArray94[local57] = arg0.aShortArray94[local57];
			}
		}
		this.aByteArray35 = arg0.aByteArray35;
		this.anIntArray459 = arg0.anIntArray459;
		this.anIntArray469 = arg0.anIntArray469;
		this.anIntArray468 = arg0.anIntArray468;
		this.aByteArray33 = arg0.aByteArray33;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByte7 = arg0.aByte7;
		this.aByteArray32 = arg0.aByteArray32;
		this.aShortArray90 = arg0.aShortArray90;
		this.aShortArray89 = arg0.aShortArray89;
		this.aShortArray87 = arg0.aShortArray87;
		this.aShortArray86 = arg0.aShortArray86;
		this.aShortArray93 = arg0.aShortArray93;
		this.aShortArray95 = arg0.aShortArray95;
		this.aShortArray85 = arg0.aShortArray85;
		this.aByteArray31 = arg0.aByteArray31;
		this.aShortArray88 = arg0.aShortArray88;
		this.aShortArray91 = arg0.aShortArray91;
		this.anIntArray465 = arg0.anIntArray465;
		this.anIntArray466 = arg0.anIntArray466;
		this.anIntArrayArray29 = arg0.anIntArrayArray29;
		this.anIntArrayArray28 = arg0.anIntArrayArray28;
		this.aClass69Array1 = arg0.aClass69Array1;
		this.aClass26Array1 = arg0.aClass26Array1;
		this.aClass69Array2 = arg0.aClass69Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1913();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class1_Sub1_Sub1_Sub6 local26 = new Class1_Sub1_Sub1_Sub6();
		local26.anIntArray263 = new int[this.anInt2706];
		local26.anIntArray271 = new int[this.anInt2706];
		local26.anIntArray266 = new int[this.anInt2706];
		@Pc(184) int local184;
		if (this.anInt2708 > 0 && this.aByteArray30 != null) {
			@Pc(51) int[] local51 = new int[this.anInt2708];
			for (@Pc(53) int local53 = 0; local53 < this.anInt2706; local53++) {
				if (this.aByteArray30[local53] != -1) {
					local51[this.aByteArray30[local53] & 0xFF]++;
				}
			}
			local26.anInt1902 = 0;
			for (@Pc(82) int local82 = 0; local82 < this.anInt2708; local82++) {
				if (local51[local82] > 0 && this.aByteArray32[local82] == 0) {
					local26.anInt1902++;
				}
			}
			local26.anIntArray261 = new int[local26.anInt1902];
			local26.anIntArray264 = new int[local26.anInt1902];
			local26.anIntArray268 = new int[local26.anInt1902];
			@Pc(120) int local120 = 0;
			for (@Pc(122) int local122 = 0; local122 < this.anInt2708; local122++) {
				if (local51[local122] > 0 && this.aByteArray32[local122] == 0) {
					local26.anIntArray261[local120] = this.aShortArray90[local122] & 0xFFFF;
					local26.anIntArray264[local120] = this.aShortArray89[local122] & 0xFFFF;
					local26.anIntArray268[local120] = this.aShortArray87[local122] & 0xFFFF;
					local51[local122] = local120++;
				} else {
					local51[local122] = -1;
				}
			}
			local26.aByteArray13 = new byte[this.anInt2706];
			for (local184 = 0; local184 < this.anInt2706; local184++) {
				if (this.aByteArray30[local184] == -1) {
					local26.aByteArray13[local184] = -1;
				} else {
					local26.aByteArray13[local184] = (byte) local51[this.aByteArray30[local184] & 0xFF];
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt2706; local217++) {
			@Pc(223) byte local223;
			if (this.aByteArray33 == null) {
				local223 = 0;
			} else {
				local223 = this.aByteArray33[local217];
			}
			@Pc(234) byte local234;
			if (this.aByteArray35 == null) {
				local234 = 0;
			} else {
				local234 = this.aByteArray35[local217];
			}
			@Pc(245) short local245;
			if (this.aShortArray94 == null) {
				local245 = -1;
			} else {
				local245 = this.aShortArray94[local217];
			}
			if (local234 == -2) {
				local223 = 3;
			}
			if (local234 == -1) {
				local223 = 2;
			}
			@Pc(292) Class69 local292;
			@Pc(453) Class26 local453;
			if (local245 == -1) {
				if (local223 == 0) {
					@Pc(273) int local273 = this.aShortArray92[local217] & 0xFFFF;
					if (this.aClass69Array2 == null || this.aClass69Array2[this.anIntArray459[local217]] == null) {
						local292 = this.aClass69Array1[this.anIntArray459[local217]];
					} else {
						local292 = this.aClass69Array2[this.anIntArray459[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt2630 + arg3 * local292.anInt2623 + arg4 * local292.anInt2628) / (local22 * local292.anInt2629);
					local26.anIntArray263[local217] = Static113.method1917(local273, local184);
					if (this.aClass69Array2 == null || this.aClass69Array2[this.anIntArray469[local217]] == null) {
						local292 = this.aClass69Array1[this.anIntArray469[local217]];
					} else {
						local292 = this.aClass69Array2[this.anIntArray469[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt2630 + arg3 * local292.anInt2623 + arg4 * local292.anInt2628) / (local22 * local292.anInt2629);
					local26.anIntArray271[local217] = Static113.method1917(local273, local184);
					if (this.aClass69Array2 == null || this.aClass69Array2[this.anIntArray468[local217]] == null) {
						local292 = this.aClass69Array1[this.anIntArray468[local217]];
					} else {
						local292 = this.aClass69Array2[this.anIntArray468[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt2630 + arg3 * local292.anInt2623 + arg4 * local292.anInt2628) / (local22 * local292.anInt2629);
					local26.anIntArray266[local217] = Static113.method1917(local273, local184);
				} else if (local223 == 1) {
					local453 = this.aClass26Array1[local217];
					local184 = arg0 + (arg2 * local453.anInt862 + arg3 * local453.anInt863 + arg4 * local453.anInt859) / (local22 + local22 / 2);
					local26.anIntArray263[local217] = Static113.method1917(this.aShortArray92[local217] & 0xFFFF, local184);
					local26.anIntArray266[local217] = -1;
				} else if (local223 == 3) {
					local26.anIntArray263[local217] = 128;
					local26.anIntArray266[local217] = -1;
				} else {
					local26.anIntArray266[local217] = -2;
				}
			} else if (local223 == 0) {
				if (this.aClass69Array2 == null || this.aClass69Array2[this.anIntArray459[local217]] == null) {
					local292 = this.aClass69Array1[this.anIntArray459[local217]];
				} else {
					local292 = this.aClass69Array2[this.anIntArray459[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt2630 + arg3 * local292.anInt2623 + arg4 * local292.anInt2628) / (local22 * local292.anInt2629);
				local26.anIntArray263[local217] = Static113.method1907(local184);
				if (this.aClass69Array2 == null || this.aClass69Array2[this.anIntArray469[local217]] == null) {
					local292 = this.aClass69Array1[this.anIntArray469[local217]];
				} else {
					local292 = this.aClass69Array2[this.anIntArray469[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt2630 + arg3 * local292.anInt2623 + arg4 * local292.anInt2628) / (local22 * local292.anInt2629);
				local26.anIntArray271[local217] = Static113.method1907(local184);
				if (this.aClass69Array2 == null || this.aClass69Array2[this.anIntArray468[local217]] == null) {
					local292 = this.aClass69Array1[this.anIntArray468[local217]];
				} else {
					local292 = this.aClass69Array2[this.anIntArray468[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt2630 + arg3 * local292.anInt2623 + arg4 * local292.anInt2628) / (local22 * local292.anInt2629);
				local26.anIntArray266[local217] = Static113.method1907(local184);
			} else if (local223 == 1) {
				local453 = this.aClass26Array1[local217];
				local184 = arg0 + (arg2 * local453.anInt862 + arg3 * local453.anInt863 + arg4 * local453.anInt859) / (local22 + local22 / 2);
				local26.anIntArray263[local217] = Static113.method1907(local184);
				local26.anIntArray266[local217] = -1;
			} else {
				local26.anIntArray266[local217] = -2;
			}
		}
		this.method1902();
		local26.anInt1903 = this.anInt2704;
		local26.anIntArray269 = this.anIntArray463;
		local26.anIntArray260 = this.anIntArray467;
		local26.anIntArray265 = this.anIntArray470;
		local26.anInt1906 = this.anInt2706;
		local26.anIntArray262 = this.anIntArray459;
		local26.anIntArray267 = this.anIntArray469;
		local26.anIntArray270 = this.anIntArray468;
		local26.aByteArray14 = this.aByteArray34;
		local26.aByteArray16 = this.aByteArray35;
		local26.aByte4 = this.aByte7;
		local26.anIntArrayArray19 = this.anIntArrayArray29;
		local26.anIntArrayArray18 = this.anIntArrayArray28;
		local26.aShortArray51 = this.aShortArray94;
		return local26;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
	private void method1900() {
		this.aClass69Array1 = null;
		this.aClass69Array2 = null;
		this.aClass26Array1 = null;
		this.aBoolean114 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	public void method1901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2704; local1++) {
			this.anIntArray463[local1] = this.anIntArray463[local1] * arg0 / 128;
			this.anIntArray467[local1] = this.anIntArray467[local1] * arg1 / 128;
			this.anIntArray470[local1] = this.anIntArray470[local1] * arg2 / 128;
		}
		this.method1900();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
	private void method1902() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray465 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2704; local9++) {
				local15 = this.anIntArray465[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray29 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray29[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2704) {
				local65 = this.anIntArray465[local59];
				this.anIntArrayArray29[local65][local5[local65]++] = local59++;
			}
			this.anIntArray465 = null;
		}
		if (this.anIntArray466 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2706; local9++) {
			local15 = this.anIntArray466[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray28 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray28[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2706) {
			local65 = this.anIntArray466[local59];
			this.anIntArrayArray28[local65][local5[local65]++] = local59++;
		}
		this.anIntArray466 = null;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1903() {
		@Pc(3) Class1_Sub1_Sub1_Sub7 local3 = new Class1_Sub1_Sub1_Sub7();
		if (this.aByteArray33 != null) {
			local3.aByteArray33 = new byte[this.anInt2706];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2706; local13++) {
				local3.aByteArray33[local13] = this.aByteArray33[local13];
			}
		}
		local3.anInt2704 = this.anInt2704;
		local3.anInt2706 = this.anInt2706;
		local3.anInt2708 = this.anInt2708;
		local3.anIntArray463 = this.anIntArray463;
		local3.anIntArray467 = this.anIntArray467;
		local3.anIntArray470 = this.anIntArray470;
		local3.anIntArray459 = this.anIntArray459;
		local3.anIntArray469 = this.anIntArray469;
		local3.anIntArray468 = this.anIntArray468;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray30 = this.aByteArray30;
		local3.aShortArray92 = this.aShortArray92;
		local3.aShortArray94 = this.aShortArray94;
		local3.aByte7 = this.aByte7;
		local3.aByteArray32 = this.aByteArray32;
		local3.aShortArray90 = this.aShortArray90;
		local3.aShortArray89 = this.aShortArray89;
		local3.aShortArray87 = this.aShortArray87;
		local3.aShortArray86 = this.aShortArray86;
		local3.aShortArray93 = this.aShortArray93;
		local3.aShortArray95 = this.aShortArray95;
		local3.aShortArray85 = this.aShortArray85;
		local3.aByteArray31 = this.aByteArray31;
		local3.aShortArray88 = this.aShortArray88;
		local3.aShortArray91 = this.aShortArray91;
		local3.anIntArray465 = this.anIntArray465;
		local3.anIntArray466 = this.anIntArray466;
		local3.anIntArrayArray29 = this.anIntArrayArray29;
		local3.anIntArrayArray28 = this.anIntArrayArray28;
		local3.aClass69Array1 = this.aClass69Array1;
		local3.aClass26Array1 = this.aClass26Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([B)V")
	private void method1904(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub12 local8 = new Class1_Sub12(arg0);
		@Pc(13) Class1_Sub12 local13 = new Class1_Sub12(arg0);
		@Pc(18) Class1_Sub12 local18 = new Class1_Sub12(arg0);
		@Pc(23) Class1_Sub12 local23 = new Class1_Sub12(arg0);
		@Pc(28) Class1_Sub12 local28 = new Class1_Sub12(arg0);
		local8.anInt1694 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1176();
		@Pc(42) int local42 = local8.method1176();
		@Pc(46) int local46 = local8.method1190();
		@Pc(50) int local50 = local8.method1190();
		@Pc(54) int local54 = local8.method1190();
		@Pc(58) int local58 = local8.method1190();
		@Pc(62) int local62 = local8.method1190();
		@Pc(66) int local66 = local8.method1190();
		@Pc(70) int local70 = local8.method1176();
		@Pc(74) int local74 = local8.method1176();
		@Pc(78) int local78 = local8.method1176();
		@Pc(82) int local82 = local8.method1176();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt2704 = local38;
		this.anInt2706 = local42;
		this.anInt2708 = local46;
		this.anIntArray463 = new int[local38];
		this.anIntArray467 = new int[local38];
		this.anIntArray470 = new int[local38];
		this.anIntArray459 = new int[local42];
		this.anIntArray469 = new int[local42];
		this.anIntArray468 = new int[local42];
		if (local46 > 0) {
			this.aByteArray32 = new byte[local46];
			this.aShortArray90 = new short[local46];
			this.aShortArray89 = new short[local46];
			this.aShortArray87 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray465 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray33 = new byte[local42];
			this.aByteArray30 = new byte[local42];
			this.aShortArray94 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray34 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray35 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray466 = new int[local42];
		}
		this.aShortArray92 = new short[local42];
		local8.anInt1694 = 0;
		local13.anInt1694 = local165;
		local18.anInt1694 = local171;
		local23.anInt1694 = local90;
		local28.anInt1694 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1190();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1185();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1185();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1185();
			}
			this.anIntArray463[local307] = local301 + local314;
			this.anIntArray467[local307] = local303 + local324;
			this.anIntArray470[local307] = local305 + local334;
			local301 = this.anIntArray463[local307];
			local303 = this.anIntArray467[local307];
			local305 = this.anIntArray470[local307];
			if (local66 == 1) {
				this.anIntArray465[local307] = local28.method1190();
			}
		}
		local8.anInt1694 = local149;
		local13.anInt1694 = local116;
		local18.anInt1694 = local98;
		local23.anInt1694 = local134;
		local28.anInt1694 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray92[local312] = (short) local8.method1176();
			if (local50 == 1) {
				local314 = local13.method1190();
				if ((local314 & 0x1) == 1) {
					this.aByteArray33[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray33[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray30[local312] = (byte) (local314 >> 2);
					this.aShortArray94[local312] = this.aShortArray92[local312];
					this.aShortArray92[local312] = 127;
					if (this.aShortArray94[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray30[local312] = -1;
					this.aShortArray94[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray34[local312] = local18.method1211();
			}
			if (local58 == 1) {
				this.aByteArray35[local312] = local23.method1211();
			}
			if (local62 == 1) {
				this.anIntArray466[local312] = local28.method1190();
			}
		}
		local8.anInt1694 = local143;
		local13.anInt1694 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1190();
			if (local543 == 1) {
				local314 = local8.method1185() + local536;
				local324 = local8.method1185() + local314;
				local334 = local8.method1185() + local324;
				local536 = local334;
				this.anIntArray459[local538] = local314;
				this.anIntArray469[local538] = local324;
				this.anIntArray468[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1185() + local536;
				local536 = local334;
				this.anIntArray459[local538] = local314;
				this.anIntArray469[local538] = local324;
				this.anIntArray468[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1185() + local536;
				local536 = local334;
				this.anIntArray459[local538] = local314;
				this.anIntArray469[local538] = local324;
				this.anIntArray468[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1185() + local536;
				local536 = local334;
				this.anIntArray459[local538] = local314;
				this.anIntArray469[local538] = local646;
				this.anIntArray468[local538] = local334;
			}
		}
		local8.anInt1694 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray32[local543] = 0;
			this.aShortArray90[local543] = (short) local8.method1176();
			this.aShortArray89[local543] = (short) local8.method1176();
			this.aShortArray87[local543] = (short) local8.method1176();
		}
		if (this.aByteArray30 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray30[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray90[local731] & 0xFFFF) == this.anIntArray459[local723] && (this.aShortArray89[local731] & 0xFFFF) == this.anIntArray469[local723] && (this.aShortArray87[local731] & 0xFFFF) == this.anIntArray468[local723]) {
						this.aByteArray30[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray30 = null;
			}
		}
		if (!local3) {
			this.aShortArray94 = null;
		}
		if (!local1) {
			this.aByteArray33 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	public void method1905() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2704; local1++) {
			@Pc(7) int local7 = this.anIntArray470[local1];
			this.anIntArray470[local1] = this.anIntArray463[local1];
			this.anIntArray463[local1] = -local7;
		}
		this.method1900();
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
	public void method1908() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2704; local1++) {
			this.anIntArray463[local1] = -this.anIntArray463[local1];
			this.anIntArray470[local1] = -this.anIntArray470[local1];
		}
		this.method1900();
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
	public void method1909() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2704; local1++) {
			@Pc(7) int local7 = this.anIntArray463[local1];
			this.anIntArray463[local1] = this.anIntArray470[local1];
			this.anIntArray470[local1] = -local7;
		}
		this.method1900();
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
	public void method1910() {
		if (this.aBoolean114) {
			return;
		}
		super.anInt2699 = 0;
		this.anInt2701 = 0;
		this.anInt2702 = 999999;
		this.anInt2703 = -999999;
		this.anInt2700 = -99999;
		this.anInt2707 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2704; local23++) {
			@Pc(29) int local29 = this.anIntArray463[local23];
			@Pc(34) int local34 = this.anIntArray467[local23];
			@Pc(39) int local39 = this.anIntArray470[local23];
			if (local29 < this.anInt2702) {
				this.anInt2702 = local29;
			}
			if (local29 > this.anInt2703) {
				this.anInt2703 = local29;
			}
			if (local39 < this.anInt2707) {
				this.anInt2707 = local39;
			}
			if (local39 > this.anInt2700) {
				this.anInt2700 = local39;
			}
			if (-local34 > super.anInt2699) {
				super.anInt2699 = -local34;
			}
			if (local34 > this.anInt2701) {
				this.anInt2701 = local34;
			}
		}
		this.aBoolean114 = true;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "([B)V")
	private void method1912(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub12 local4 = new Class1_Sub12(arg0);
		@Pc(9) Class1_Sub12 local9 = new Class1_Sub12(arg0);
		@Pc(14) Class1_Sub12 local14 = new Class1_Sub12(arg0);
		@Pc(19) Class1_Sub12 local19 = new Class1_Sub12(arg0);
		@Pc(24) Class1_Sub12 local24 = new Class1_Sub12(arg0);
		@Pc(29) Class1_Sub12 local29 = new Class1_Sub12(arg0);
		@Pc(34) Class1_Sub12 local34 = new Class1_Sub12(arg0);
		local4.anInt1694 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1176();
		@Pc(48) int local48 = local4.method1176();
		@Pc(52) int local52 = local4.method1190();
		@Pc(56) int local56 = local4.method1190();
		@Pc(60) int local60 = local4.method1190();
		@Pc(64) int local64 = local4.method1190();
		@Pc(68) int local68 = local4.method1190();
		@Pc(72) int local72 = local4.method1190();
		@Pc(76) int local76 = local4.method1190();
		@Pc(80) int local80 = local4.method1176();
		@Pc(84) int local84 = local4.method1176();
		@Pc(88) int local88 = local4.method1176();
		@Pc(92) int local92 = local4.method1176();
		@Pc(96) int local96 = local4.method1176();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray32 = new byte[local52];
			local4.anInt1694 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray32[local113] = local4.method1211();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100 * 2;
		@Pc(283) int local283 = local113;
		local113 += local100;
		@Pc(289) int local289 = local113;
		local113 += local100 * 2 + local102 * 2;
		this.anInt2704 = local44;
		this.anInt2706 = local48;
		this.anInt2708 = local52;
		this.anIntArray463 = new int[local44];
		this.anIntArray467 = new int[local44];
		this.anIntArray470 = new int[local44];
		this.anIntArray459 = new int[local48];
		this.anIntArray469 = new int[local48];
		this.anIntArray468 = new int[local48];
		if (local76 == 1) {
			this.anIntArray465 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray33 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray34 = new byte[local48];
		} else {
			this.aByte7 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray35 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray466 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray94 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray30 = new byte[local48];
		}
		this.aShortArray92 = new short[local48];
		if (local52 > 0) {
			this.aShortArray90 = new short[local52];
			this.aShortArray89 = new short[local52];
			this.aShortArray87 = new short[local52];
			if (local100 > 0) {
				this.aShortArray86 = new short[local100];
				this.aShortArray93 = new short[local100];
				this.aShortArray95 = new short[local100];
				this.aShortArray85 = new short[local100];
				this.aByteArray31 = new byte[local100];
				this.aShortArray88 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray91 = new short[local102];
			}
		}
		local4.anInt1694 = local52;
		local9.anInt1694 = local233;
		local14.anInt1694 = local239;
		local19.anInt1694 = local245;
		local24.anInt1694 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1190();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1185();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1185();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1185();
			}
			this.anIntArray463[local463] = local457 + local470;
			this.anIntArray467[local463] = local459 + local480;
			this.anIntArray470[local463] = local461 + local490;
			local457 = this.anIntArray463[local463];
			local459 = this.anIntArray467[local463];
			local461 = this.anIntArray470[local463];
			if (local76 == 1) {
				this.anIntArray465[local463] = local24.method1190();
			}
		}
		local4.anInt1694 = local225;
		local9.anInt1694 = local151;
		local14.anInt1694 = local166;
		local19.anInt1694 = local193;
		local24.anInt1694 = local175;
		local29.anInt1694 = local208;
		local34.anInt1694 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray92[local468] = (short) local4.method1176();
			if (local56 == 1) {
				this.aByteArray33[local468] = local9.method1211();
			}
			if (local60 == 255) {
				this.aByteArray34[local468] = local14.method1211();
			}
			if (local64 == 1) {
				this.aByteArray35[local468] = local19.method1211();
			}
			if (local68 == 1) {
				this.anIntArray466[local468] = local24.method1190();
			}
			if (local72 == 1) {
				this.aShortArray94[local468] = (short) (local29.method1176() - 1);
			}
			if (this.aByteArray30 != null && this.aShortArray94[local468] != -1) {
				this.aByteArray30[local468] = (byte) (local34.method1190() - 1);
			}
		}
		local4.anInt1694 = local202;
		local9.anInt1694 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(670) int local670 = 0;
		@Pc(677) int local677;
		@Pc(780) int local780;
		for (@Pc(672) int local672 = 0; local672 < local48; local672++) {
			local677 = local9.method1190();
			if (local677 == 1) {
				local470 = local4.method1185() + local670;
				local480 = local4.method1185() + local470;
				local490 = local4.method1185() + local480;
				local670 = local490;
				this.anIntArray459[local672] = local470;
				this.anIntArray469[local672] = local480;
				this.anIntArray468[local672] = local490;
			}
			if (local677 == 2) {
				local480 = local490;
				local490 = local4.method1185() + local670;
				local670 = local490;
				this.anIntArray459[local672] = local470;
				this.anIntArray469[local672] = local480;
				this.anIntArray468[local672] = local490;
			}
			if (local677 == 3) {
				local470 = local490;
				local490 = local4.method1185() + local670;
				local670 = local490;
				this.anIntArray459[local672] = local470;
				this.anIntArray469[local672] = local480;
				this.anIntArray468[local672] = local490;
			}
			if (local677 == 4) {
				local780 = local470;
				local470 = local480;
				local480 = local780;
				local490 = local4.method1185() + local670;
				local670 = local490;
				this.anIntArray459[local672] = local470;
				this.anIntArray469[local672] = local780;
				this.anIntArray468[local672] = local490;
			}
		}
		local4.anInt1694 = local251;
		local9.anInt1694 = local259;
		local14.anInt1694 = local267;
		local19.anInt1694 = local275;
		local24.anInt1694 = local283;
		local29.anInt1694 = local289;
		for (local677 = 0; local677 < local52; local677++) {
			local780 = this.aByteArray32[local677] & 0xFF;
			if (local780 == 0) {
				this.aShortArray90[local677] = (short) local4.method1176();
				this.aShortArray89[local677] = (short) local4.method1176();
				this.aShortArray87[local677] = (short) local4.method1176();
			}
			if (local780 == 1) {
				this.aShortArray90[local677] = (short) local9.method1176();
				this.aShortArray89[local677] = (short) local9.method1176();
				this.aShortArray87[local677] = (short) local9.method1176();
				this.aShortArray86[local677] = (short) local14.method1176();
				this.aShortArray93[local677] = (short) local14.method1176();
				this.aShortArray95[local677] = (short) local14.method1176();
				this.aShortArray85[local677] = (short) local19.method1176();
				this.aByteArray31[local677] = local24.method1211();
				this.aShortArray88[local677] = (short) local29.method1176();
			}
			if (local780 == 2) {
				this.aShortArray90[local677] = (short) local9.method1176();
				this.aShortArray89[local677] = (short) local9.method1176();
				this.aShortArray87[local677] = (short) local9.method1176();
				this.aShortArray86[local677] = (short) local14.method1176();
				this.aShortArray93[local677] = (short) local14.method1176();
				this.aShortArray95[local677] = (short) local14.method1176();
				this.aShortArray85[local677] = (short) local19.method1176();
				this.aByteArray31[local677] = local24.method1211();
				this.aShortArray88[local677] = (short) local29.method1176();
				this.aShortArray91[local677] = (short) local29.method1176();
			}
			if (local780 == 3) {
				this.aShortArray90[local677] = (short) local9.method1176();
				this.aShortArray89[local677] = (short) local9.method1176();
				this.aShortArray87[local677] = (short) local9.method1176();
				this.aShortArray86[local677] = (short) local14.method1176();
				this.aShortArray93[local677] = (short) local14.method1176();
				this.aShortArray95[local677] = (short) local14.method1176();
				this.aShortArray85[local677] = (short) local19.method1176();
				this.aByteArray31[local677] = local24.method1211();
				this.aShortArray88[local677] = (short) local29.method1176();
			}
		}
		local4.anInt1694 = local113;
		local780 = local4.method1190();
		if (local780 == 0) {
			return;
		}
		new Class81();
		local4.method1176();
		local4.method1176();
		local4.method1176();
		local4.method1210();
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "()V")
	public void method1913() {
		if (this.aClass69Array1 != null) {
			return;
		}
		this.aClass69Array1 = new Class69[this.anInt2704];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2704; local10++) {
			this.aClass69Array1[local10] = new Class69();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2706; local25++) {
			@Pc(31) int local31 = this.anIntArray459[local25];
			@Pc(36) int local36 = this.anIntArray469[local25];
			@Pc(41) int local41 = this.anIntArray468[local25];
			@Pc(51) int local51 = this.anIntArray463[local36] - this.anIntArray463[local31];
			@Pc(61) int local61 = this.anIntArray467[local36] - this.anIntArray467[local31];
			@Pc(71) int local71 = this.anIntArray470[local36] - this.anIntArray470[local31];
			@Pc(81) int local81 = this.anIntArray463[local41] - this.anIntArray463[local31];
			@Pc(91) int local91 = this.anIntArray467[local41] - this.anIntArray467[local31];
			@Pc(101) int local101 = this.anIntArray470[local41] - this.anIntArray470[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray33 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray33[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class69 local211 = this.aClass69Array1[local31];
				local211.anInt2630 += local109;
				local211.anInt2623 += local117;
				local211.anInt2628 += local125;
				local211.anInt2629++;
				@Pc(240) Class69 local240 = this.aClass69Array1[local36];
				local240.anInt2630 += local109;
				local240.anInt2623 += local117;
				local240.anInt2628 += local125;
				local240.anInt2629++;
				@Pc(269) Class69 local269 = this.aClass69Array1[local41];
				local269.anInt2630 += local109;
				local269.anInt2623 += local117;
				local269.anInt2628 += local125;
				local269.anInt2629++;
			} else if (local198 == 1) {
				if (this.aClass26Array1 == null) {
					this.aClass26Array1 = new Class26[this.anInt2706];
				}
				@Pc(314) Class26 local314 = this.aClass26Array1[local25] = new Class26();
				local314.anInt862 = local109;
				local314.anInt863 = local117;
				local314.anInt859 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(SS)V")
	public void method1914(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2706; local1++) {
			if (this.aShortArray92[local1] == arg0) {
				this.aShortArray92[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(SS)V")
	public void method1915(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray94 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2706; local5++) {
			if (this.aShortArray94[local5] == arg0) {
				this.aShortArray94[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
	public void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2704; local1++) {
			this.anIntArray463[local1] += arg0;
			this.anIntArray467[local1] += arg1;
			this.anIntArray470[local1] += arg2;
		}
		this.method1900();
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public void method1918() {
		@Pc(3) int local3 = Static113.anIntArray461[256];
		@Pc(7) int local7 = Static113.anIntArray462[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2704; local9++) {
			@Pc(26) int local26 = this.anIntArray470[local9] * local3 + this.anIntArray463[local9] * local7 >> 16;
			this.anIntArray470[local9] = this.anIntArray470[local9] * local7 - this.anIntArray463[local9] * local3 >> 16;
			this.anIntArray463[local9] = local26;
		}
		this.method1900();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([[IIIIZI)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1919(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1910();
		@Pc(6) int local6 = arg1 + this.anInt2702;
		@Pc(11) int local11 = arg1 + this.anInt2703;
		@Pc(16) int local16 = arg3 + this.anInt2707;
		@Pc(21) int local21 = arg3 + this.anInt2700;
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
		@Pc(101) Class1_Sub1_Sub1_Sub7 local101 = new Class1_Sub1_Sub1_Sub7();
		local101.anInt2704 = this.anInt2704;
		local101.anInt2706 = this.anInt2706;
		local101.anInt2708 = this.anInt2708;
		local101.anIntArray463 = this.anIntArray463;
		local101.anIntArray470 = this.anIntArray470;
		local101.anIntArray459 = this.anIntArray459;
		local101.anIntArray469 = this.anIntArray469;
		local101.anIntArray468 = this.anIntArray468;
		local101.aByteArray33 = this.aByteArray33;
		local101.aByteArray34 = this.aByteArray34;
		local101.aByteArray35 = this.aByteArray35;
		local101.aByteArray30 = this.aByteArray30;
		local101.aShortArray92 = this.aShortArray92;
		local101.aShortArray94 = this.aShortArray94;
		local101.aByte7 = this.aByte7;
		local101.aByteArray32 = this.aByteArray32;
		local101.aShortArray90 = this.aShortArray90;
		local101.aShortArray89 = this.aShortArray89;
		local101.aShortArray87 = this.aShortArray87;
		local101.aShortArray86 = this.aShortArray86;
		local101.aShortArray93 = this.aShortArray93;
		local101.aShortArray95 = this.aShortArray95;
		local101.aShortArray85 = this.aShortArray85;
		local101.aByteArray31 = this.aByteArray31;
		local101.aShortArray88 = this.aShortArray88;
		local101.aShortArray91 = this.aShortArray91;
		local101.anIntArray465 = this.anIntArray465;
		local101.anIntArray466 = this.anIntArray466;
		local101.anIntArrayArray29 = this.anIntArrayArray29;
		local101.anIntArrayArray28 = this.anIntArrayArray28;
		local101.aShort2 = this.aShort2;
		local101.aShort1 = this.aShort1;
		local101.anIntArray467 = new int[local101.anInt2704];
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(294) int local294;
		@Pc(320) int local320;
		@Pc(332) int local332;
		if (arg4 == 0) {
			for (local241 = 0; local241 < local101.anInt2704; local241++) {
				local249 = this.anIntArray463[local241] + arg1;
				local256 = this.anIntArray470[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray467[local241] = this.anIntArray467[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt2704; local241++) {
				local249 = (-this.anIntArray467[local241] << 16) / super.anInt2699;
				if (local249 < arg4) {
					local256 = this.anIntArray463[local241] + arg1;
					local260 = this.anIntArray470[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray467[local241] = this.anIntArray467[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method1900();
		return local101;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!td;I)I")
	private int method1920(@OriginalArg(0) Class1_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray463[arg1];
		@Pc(11) int local11 = arg0.anIntArray467[arg1];
		@Pc(16) int local16 = arg0.anIntArray470[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2704; local18++) {
			if (local6 == this.anIntArray463[local18] && local11 == this.anIntArray467[local18] && local16 == this.anIntArray470[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray463[this.anInt2704] = local6;
			this.anIntArray467[this.anInt2704] = local11;
			this.anIntArray470[this.anInt2704] = local16;
			if (arg0.anIntArray465 != null) {
				this.anIntArray465[this.anInt2704] = arg0.anIntArray465[arg1];
			}
			local1 = this.anInt2704++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "()V")
	public void method1921() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2704; local1++) {
			this.anIntArray470[local1] = -this.anIntArray470[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2706; local18++) {
			@Pc(24) int local24 = this.anIntArray459[local18];
			this.anIntArray459[local18] = this.anIntArray468[local18];
			this.anIntArray468[local18] = local24;
		}
		this.method1900();
	}
}
