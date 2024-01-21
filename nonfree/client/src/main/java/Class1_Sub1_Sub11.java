import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lh", name = "T", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!lh", name = "gb", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!lh", name = "hb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!lh", name = "kb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!lh", name = "yb", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!lh", name = "Hb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!lh", name = "Mb", descriptor = "I")
	public int anInt2823;

	@OriginalMember(owner = "client!lh", name = "M", descriptor = "Z")
	public boolean aBoolean113 = true;

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "[Lclient!ea;")
	public final Class18[] aClass18Array15 = new Class18[5];

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
	private int anInt2798 = -1;

	@OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
	public int anInt2796 = 0;

	@OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
	private int anInt2793 = -1;

	@OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
	private int anInt2802 = 0;

	@OriginalMember(owner = "client!lh", name = "lb", descriptor = "I")
	public int anInt2805 = -1;

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
	private int anInt2791 = 128;

	@OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
	public int anInt2797 = -1;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
	public int anInt2788 = 0;

	@OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
	private int anInt2789 = -1;

	@OriginalMember(owner = "client!lh", name = "S", descriptor = "Z")
	public boolean aBoolean114 = true;

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
	public int anInt2799 = 0;

	@OriginalMember(owner = "client!lh", name = "rb", descriptor = "I")
	public int anInt2810 = 16;

	@OriginalMember(owner = "client!lh", name = "zb", descriptor = "I")
	private int anInt2816 = 128;

	@OriginalMember(owner = "client!lh", name = "ub", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!lh", name = "xb", descriptor = "I")
	public int anInt2815 = 1;

	@OriginalMember(owner = "client!lh", name = "sb", descriptor = "I")
	public int anInt2811 = -1;

	@OriginalMember(owner = "client!lh", name = "tb", descriptor = "I")
	public int anInt2812 = 0;

	@OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
	public int anInt2800 = -1;

	@OriginalMember(owner = "client!lh", name = "Eb", descriptor = "I")
	private int anInt2818 = 0;

	@OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
	public int anInt2794 = -1;

	@OriginalMember(owner = "client!lh", name = "Db", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!lh", name = "Gb", descriptor = "I")
	public int anInt2820 = 2;

	@OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
	private int anInt2804 = 0;

	@OriginalMember(owner = "client!lh", name = "Fb", descriptor = "I")
	private int anInt2819 = 0;

	@OriginalMember(owner = "client!lh", name = "Jb", descriptor = "I")
	public int anInt2822 = 1;

	@OriginalMember(owner = "client!lh", name = "Kb", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!lh", name = "wb", descriptor = "I")
	public int anInt2814 = -1;

	@OriginalMember(owner = "client!lh", name = "Nb", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!lh", name = "Lb", descriptor = "Lclient!ea;")
	public Class18 aClass18_699 = Static86.aClass18_643;

	@OriginalMember(owner = "client!lh", name = "Pb", descriptor = "I")
	private int anInt2825 = 0;

	@OriginalMember(owner = "client!lh", name = "Qb", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!lh", name = "Rb", descriptor = "I")
	private int anInt2826 = 128;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lclient!lh;")
	public Class1_Sub1_Sub11 method1961() {
		@Pc(1) int local1 = -1;
		if (this.anInt2798 != -1) {
			local1 = Static59.method549(this.anInt2798);
		} else if (this.anInt2789 != -1) {
			local1 = Static170.anIntArray420[this.anInt2789];
		}
		return local1 < 0 || this.anIntArray250.length <= local1 || this.anIntArray250[local1] == -1 ? null : Static62.method1274(this.anIntArray250[local1]);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII[[IIILclient!pf;I)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1_Sub1_Sub12 arg6, @OriginalArg(8) int arg7) {
		@Pc(21) long local21;
		if (this.anIntArray253 == null) {
			local21 = (this.anInt2823 << 10) + arg7;
		} else {
			local21 = (this.anInt2823 << 10) + (arg2 << 3) + arg7;
		}
		@Pc(37) Class1_Sub1_Sub5_Sub4 local37 = (Class1_Sub1_Sub5_Sub4) Static122.aClass66_14.method2599(local21);
		if (local37 == null) {
			@Pc(51) Class1_Sub1_Sub5_Sub5 local51 = this.method1969(arg2, arg7);
			if (local51 == null) {
				return null;
			}
			local37 = local51.method1472(this.anInt2804 + 64, this.anInt2819 * 5 + 768, -50, -10, -50, true);
			Static122.aClass66_14.method2597(local21, local37);
		}
		if (arg6 == null && this.anInt2793 == -1) {
			return local37;
		}
		if (arg6 == null) {
			local37 = local37.method1012(true);
		} else {
			local37 = arg6.method2399(arg3, arg7, local37);
		}
		if (this.anInt2793 >= 0) {
			local37 = local37.method1001(arg4, arg1, arg5, arg0, false, this.anInt2793);
		}
		return local37;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[[IIIIZI)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray253 == null) {
			local14 = arg0 + (this.anInt2823 << 10);
		} else {
			local14 = arg0 + (arg5 << 3) + (this.anInt2823 << 10);
		}
		@Pc(34) Class1_Sub1_Sub5_Sub4 local34 = (Class1_Sub1_Sub5_Sub4) Static147.aClass66_18.method2599(local14);
		if (local34 == null) {
			@Pc(42) Class1_Sub1_Sub5_Sub5 local42 = this.method1969(arg5, arg0);
			if (local42 == null) {
				return null;
			}
			local34 = local42.method1472(this.anInt2804 + 64, this.anInt2819 * 5 + 768, -50, -10, -50, ~this.anInt2793 <= -1);
			Static147.aClass66_18.method2597(local14, local34);
		}
		if (this.anInt2793 >= 0) {
			local34 = local34.method1001(arg1, arg2, arg3, arg4, true, this.anInt2793);
		}
		return local34;
	}

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)V")
	public void method1965() {
		if (this.anInt2811 == -1) {
			this.anInt2811 = 0;
			if (this.anIntArray249 != null && (this.anIntArray253 == null || this.anIntArray253[0] == 10)) {
				this.anInt2811 = 1;
			}
			for (@Pc(26) int local26 = 0; local26 < 5; local26++) {
				if (this.aClass18Array15[local26] != null) {
					this.anInt2811 = 1;
				}
			}
		}
		if (this.anInt2805 == -1) {
			this.anInt2805 = this.anInt2820 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
	public boolean method1966(@OriginalArg(0) int arg0) {
		if (this.anIntArray253 != null) {
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray253.length; local64++) {
				if (this.anIntArray253[local64] == arg0) {
					return Static132.aClass16_24.method2238(this.anIntArray249[local64] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray249 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(37) boolean local37 = true;
			for (@Pc(39) int local39 = 0; local39 < this.anIntArray249.length; local39++) {
				local37 &= Static132.aClass16_24.method2238(this.anIntArray249[local39] & 0xFFFF, 0);
			}
			return local37;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)Z")
	public boolean method1967() {
		if (this.anIntArray250 == null) {
			return this.anInt2800 != -1 || this.anIntArray252 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray250.length; local27++) {
			if (this.anIntArray250[local27] != -1) {
				@Pc(42) Class1_Sub1_Sub11 local42 = Static62.method1274(this.anIntArray250[local27]);
				if (local42.anInt2800 != -1 || local42.anIntArray252 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII[[II)Lclient!ff;")
	public Class1_Sub1_Sub5 method1968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray253 == null) {
			local16 = (this.anInt2823 << 10) + arg5;
		} else {
			local16 = arg5 + (arg1 << 3) + (this.anInt2823 << 10);
		}
		@Pc(36) Class1_Sub1_Sub5 local36 = (Class1_Sub1_Sub5) Static89.aClass66_9.method2599(local16);
		if (local36 == null) {
			@Pc(51) Class1_Sub1_Sub5_Sub5 local51 = this.method1969(arg1, arg5);
			if (local51 == null) {
				return null;
			}
			if (this.aBoolean117) {
				local51.aShort1 = (short) (this.anInt2804 + 64);
				local51.aShort2 = (short) (this.anInt2819 * 5 + 768);
				local36 = local51;
				local51.method1492();
			} else {
				local36 = local51.method1472(this.anInt2804 + 64, this.anInt2819 * 5 + 768, -50, -10, -50, this.anInt2793 >= 0);
			}
			Static89.aClass66_9.method2597(local16, local36);
		}
		if (this.aBoolean117) {
			local36 = ((Class1_Sub1_Sub5_Sub5) local36).method1486();
		}
		if (this.anInt2793 >= 0) {
			if (local36 instanceof Class1_Sub1_Sub5_Sub4) {
				local36 = ((Class1_Sub1_Sub5_Sub4) local36).method1001(arg4, arg3, arg2, arg0, true, this.anInt2793);
			} else if (local36 instanceof Class1_Sub1_Sub5_Sub5) {
				local36 = ((Class1_Sub1_Sub5_Sub5) local36).method1485(arg4, arg3, arg2, arg0, this.anInt2793);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lclient!ja;")
	private Class1_Sub1_Sub5_Sub5 method1969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class1_Sub1_Sub5_Sub5 local3 = null;
		@Pc(14) int local14;
		@Pc(43) int local43;
		@Pc(105) boolean local105;
		@Pc(131) int local131;
		if (this.anIntArray253 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray249 == null) {
				return null;
			}
			local105 = this.aBoolean120;
			if (arg0 == 2 && arg1 > 3) {
				local105 = !local105;
			}
			local14 = this.anIntArray249.length;
			for (local43 = 0; local43 < local14; local43++) {
				local131 = this.anIntArray249[local43];
				if (local105) {
					local131 += 65536;
				}
				local3 = (Class1_Sub1_Sub5_Sub5) Static129.aClass66_16.method2599((long) local131);
				if (local3 == null) {
					local3 = Static70.method1483(Static132.aClass16_24, local131 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local105) {
						local3.method1493();
					}
					Static129.aClass66_16.method2597((long) local131, local3);
				}
				if (local14 > 1) {
					Static35.aClass1_Sub1_Sub5_Sub5Array2[local43] = local3;
				}
			}
			if (local14 > 1) {
				local3 = new Class1_Sub1_Sub5_Sub5(Static35.aClass1_Sub1_Sub5_Sub5Array2, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray253.length; local14++) {
				if (this.anIntArray253[local14] == arg0) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local43 = this.anIntArray249[local12];
			@Pc(53) boolean local53 = arg1 > 3 ^ this.aBoolean120;
			if (local53) {
				local43 += 65536;
			}
			local3 = (Class1_Sub1_Sub5_Sub5) Static129.aClass66_16.method2599((long) local43);
			if (local3 == null) {
				local3 = Static70.method1483(Static132.aClass16_24, local43 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local53) {
					local3.method1493();
				}
				Static129.aClass66_16.method2597((long) local43, local3);
			}
		}
		if (this.anInt2826 == 128 && this.anInt2816 == 128 && this.anInt2791 == 128) {
			local105 = false;
		} else {
			local105 = true;
		}
		@Pc(229) boolean local229;
		if (this.anInt2802 == 0 && this.anInt2818 == 0 && this.anInt2825 == 0) {
			local229 = false;
		} else {
			local229 = true;
		}
		@Pc(260) Class1_Sub1_Sub5_Sub5 local260 = new Class1_Sub1_Sub5_Sub5(local3, arg1 == 0 && !local105 && !local229, this.aShortArray24 == null, this.aShortArray25 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local260.method1478();
			local260.method1474(45, 0, -45);
		}
		@Pc(280) int local280 = arg1 & 0x3;
		if (local280 == 1) {
			local260.method1475();
		} else if (local280 == 2) {
			local260.method1487();
		} else if (local280 == 3) {
			local260.method1473();
		}
		if (this.aShortArray24 != null) {
			for (local131 = 0; local131 < this.aShortArray24.length; local131++) {
				local260.method1489(this.aShortArray24[local131], this.aShortArray23[local131]);
			}
		}
		if (this.aShortArray25 != null) {
			for (local131 = 0; local131 < this.aShortArray25.length; local131++) {
				local260.method1479(this.aShortArray25[local131], this.aShortArray22[local131]);
			}
		}
		if (local105) {
			local260.method1488(this.anInt2826, this.anInt2816, this.anInt2791);
		}
		if (local229) {
			local260.method1474(this.anInt2802, this.anInt2818, this.anInt2825);
		}
		return local260;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!hc;)V")
	private void method1970(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		@Pc(10) int local10;
		@Pc(40) int local40;
		if (arg0 == 1) {
			local10 = arg1.method544();
			if (local10 > 0) {
				if (this.anIntArray249 == null || Static161.aBoolean196) {
					this.anIntArray249 = new int[local10];
					this.anIntArray253 = new int[local10];
					for (local40 = 0; local40 < local10; local40++) {
						this.anIntArray249[local40] = arg1.method546();
						this.anIntArray253[local40] = arg1.method544();
					}
				} else {
					arg1.anInt839 += local10 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass18_699 = arg1.method510();
		} else if (arg0 == 5) {
			local10 = arg1.method544();
			if (local10 > 0) {
				if (this.anIntArray249 == null || Static161.aBoolean196) {
					this.anIntArray253 = null;
					this.anIntArray249 = new int[local10];
					for (local40 = 0; local40 < local10; local40++) {
						this.anIntArray249[local40] = arg1.method546();
					}
				} else {
					arg1.anInt839 += local10 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt2815 = arg1.method544();
		} else if (arg0 == 15) {
			this.anInt2822 = arg1.method544();
		} else if (arg0 == 17) {
			this.aBoolean114 = false;
			this.anInt2820 = 0;
		} else if (arg0 == 18) {
			this.aBoolean114 = false;
		} else if (arg0 == 19) {
			this.anInt2811 = arg1.method544();
		} else if (arg0 == 21) {
			this.anInt2793 = 0;
		} else if (arg0 == 22) {
			this.aBoolean117 = true;
		} else if (arg0 == 23) {
			this.aBoolean119 = true;
		} else if (arg0 == 24) {
			this.anInt2814 = arg1.method546();
			if (this.anInt2814 == 65535) {
				this.anInt2814 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt2820 = 1;
		} else if (arg0 == 28) {
			this.anInt2810 = arg1.method544();
		} else if (arg0 == 29) {
			this.anInt2804 = arg1.method548();
		} else if (arg0 == 39) {
			this.anInt2819 = arg1.method548() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass18Array15[arg0 - 30] = arg1.method510();
			if (this.aClass18Array15[arg0 - 30].method734(Static59.aClass18_217)) {
				this.aClass18Array15[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local10 = arg1.method544();
			this.aShortArray23 = new short[local10];
			this.aShortArray24 = new short[local10];
			for (local40 = 0; local40 < local10; local40++) {
				this.aShortArray24[local40] = (short) arg1.method546();
				this.aShortArray23[local40] = (short) arg1.method546();
			}
		} else if (arg0 == 41) {
			local10 = arg1.method544();
			this.aShortArray22 = new short[local10];
			this.aShortArray25 = new short[local10];
			for (local40 = 0; local40 < local10; local40++) {
				this.aShortArray25[local40] = (short) arg1.method546();
				this.aShortArray22[local40] = (short) arg1.method546();
			}
		} else if (arg0 == 60) {
			this.anInt2794 = arg1.method546();
		} else if (arg0 == 62) {
			this.aBoolean120 = true;
		} else if (arg0 == 64) {
			this.aBoolean113 = false;
		} else if (arg0 == 65) {
			this.anInt2826 = arg1.method546();
		} else if (arg0 == 66) {
			this.anInt2816 = arg1.method546();
		} else if (arg0 == 67) {
			this.anInt2791 = arg1.method546();
		} else if (arg0 == 68) {
			this.anInt2797 = arg1.method546();
		} else if (arg0 == 69) {
			this.anInt2799 = arg1.method544();
		} else if (arg0 == 70) {
			this.anInt2802 = arg1.method497();
		} else if (arg0 == 71) {
			this.anInt2818 = arg1.method497();
		} else if (arg0 == 72) {
			this.anInt2825 = arg1.method497();
		} else if (arg0 == 73) {
			this.aBoolean115 = true;
		} else if (arg0 == 74) {
			this.aBoolean118 = true;
		} else if (arg0 == 75) {
			this.anInt2805 = arg1.method544();
		} else if (arg0 == 77) {
			this.anInt2798 = arg1.method546();
			if (this.anInt2798 == 65535) {
				this.anInt2798 = -1;
			}
			this.anInt2789 = arg1.method546();
			if (this.anInt2789 == 65535) {
				this.anInt2789 = -1;
			}
			local10 = arg1.method544();
			this.anIntArray250 = new int[local10 + 1];
			for (local40 = 0; local40 <= local10; local40++) {
				this.anIntArray250[local40] = arg1.method546();
				if (this.anIntArray250[local40] == 65535) {
					this.anIntArray250[local40] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt2800 = arg1.method546();
			this.anInt2796 = arg1.method544();
		} else if (arg0 == 79) {
			this.anInt2812 = arg1.method546();
			this.anInt2788 = arg1.method546();
			this.anInt2796 = arg1.method544();
			local10 = arg1.method544();
			this.anIntArray252 = new int[local10];
			for (local40 = 0; local40 < local10; local40++) {
				this.anIntArray252[local40] = arg1.method546();
			}
		} else if (arg0 == 81) {
			this.anInt2793 = arg1.method544() * 256;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!hc;B)V")
	public void method1971(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method544();
			if (local18 == 0) {
				return;
			}
			this.method1970(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)Z")
	public boolean method1972() {
		if (this.anIntArray249 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray249.length; local22++) {
			local12 &= Static132.aClass16_24.method2238(this.anIntArray249[local22] & 0xFFFF, 0);
		}
		return local12;
	}
}
