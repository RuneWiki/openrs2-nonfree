import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!de", name = "L", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!de", name = "Eb", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!de", name = "Lb", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!de", name = "Pb", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!de", name = "Qb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!de", name = "Vb", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
	public int anInt957 = -1;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	public int anInt958 = 1;

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
	private int anInt961 = 0;

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
	public int anInt960 = 0;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
	public int anInt965 = 2;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	private int anInt953 = -1;

	@OriginalMember(owner = "client!de", name = "W", descriptor = "I")
	public int anInt955 = 0;

	@OriginalMember(owner = "client!de", name = "V", descriptor = "I")
	private int anInt954 = 0;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "[Lclient!dj;")
	public Class24[] aClass24Array6 = new Class24[5];

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!de", name = "Cb", descriptor = "Z")
	public boolean aBoolean53 = true;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
	public int anInt962 = 0;

	@OriginalMember(owner = "client!de", name = "db", descriptor = "I")
	public int anInt959 = -1;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	public int anInt950 = -1;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!de", name = "Kb", descriptor = "I")
	private int anInt979 = 0;

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "Z")
	public boolean aBoolean49 = true;

	@OriginalMember(owner = "client!de", name = "Gb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
	private int anInt964 = 0;

	@OriginalMember(owner = "client!de", name = "Db", descriptor = "I")
	public int anInt976 = 1;

	@OriginalMember(owner = "client!de", name = "Bb", descriptor = "I")
	private int anInt975 = 128;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!de", name = "Ob", descriptor = "I")
	public int anInt983 = 0;

	@OriginalMember(owner = "client!de", name = "Hb", descriptor = "Lclient!dj;")
	public Class24 aClass24_232 = Static185.aClass24_1195;

	@OriginalMember(owner = "client!de", name = "Jb", descriptor = "I")
	public int anInt978 = 16;

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!de", name = "Nb", descriptor = "I")
	private int anInt982 = 128;

	@OriginalMember(owner = "client!de", name = "Ab", descriptor = "I")
	public int anInt974 = -1;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "I")
	private int anInt968 = -1;

	@OriginalMember(owner = "client!de", name = "Rb", descriptor = "I")
	public int anInt984 = -1;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "I")
	private int anInt951 = -1;

	@OriginalMember(owner = "client!de", name = "Sb", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!de", name = "Ub", descriptor = "I")
	private int anInt986 = 128;

	@OriginalMember(owner = "client!de", name = "Tb", descriptor = "I")
	public int anInt985 = -1;

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "I")
	private int anInt972 = 0;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)Z")
	public boolean method685() {
		if (this.anIntArray85 == null) {
			return this.anInt959 != -1 || this.anIntArray83 != null;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray85.length; local26++) {
			if (this.anIntArray85[local26] != -1) {
				@Pc(41) Class1_Sub2_Sub5 local41 = Static37.method702(this.anIntArray85[local26]);
				if (local41.anInt959 != -1 || local41.anIntArray83 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!fj;)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		@Pc(8) int local8;
		@Pc(25) int local25;
		if (arg0 == 1) {
			local8 = arg1.method2771();
			if (local8 > 0) {
				if (this.anIntArray86 == null || Static201.aBoolean223) {
					this.anIntArray84 = new int[local8];
					this.anIntArray86 = new int[local8];
					for (local25 = 0; local25 < local8; local25++) {
						this.anIntArray86[local25] = arg1.method2765();
						this.anIntArray84[local25] = arg1.method2771();
					}
				} else {
					arg1.anInt3592 += local8 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass24_232 = arg1.method2761();
		} else if (arg0 == 5) {
			local8 = arg1.method2771();
			if (local8 > 0) {
				if (this.anIntArray86 == null || Static201.aBoolean223) {
					this.anIntArray84 = null;
					this.anIntArray86 = new int[local8];
					for (local25 = 0; local25 < local8; local25++) {
						this.anIntArray86[local25] = arg1.method2765();
					}
				} else {
					arg1.anInt3592 += local8 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt976 = arg1.method2771();
		} else if (arg0 == 15) {
			this.anInt958 = arg1.method2771();
		} else if (arg0 == 17) {
			this.aBoolean53 = false;
			this.anInt965 = 0;
		} else if (arg0 == 18) {
			this.aBoolean53 = false;
		} else if (arg0 == 19) {
			this.anInt984 = arg1.method2771();
		} else if (arg0 == 21) {
			this.anInt968 = 0;
		} else if (arg0 == 22) {
			this.aBoolean54 = true;
		} else if (arg0 == 23) {
			this.aBoolean55 = true;
		} else if (arg0 == 24) {
			this.anInt985 = arg1.method2765();
			if (this.anInt985 == 65535) {
				this.anInt985 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt965 = 1;
		} else if (arg0 == 28) {
			this.anInt978 = arg1.method2771();
		} else if (arg0 == 29) {
			this.anInt964 = arg1.method2770();
		} else if (arg0 == 39) {
			this.anInt961 = arg1.method2770() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass24Array6[arg0 - 30] = arg1.method2761();
			if (this.aClass24Array6[arg0 - 30].method771(Static93.aClass24_635)) {
				this.aClass24Array6[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local8 = arg1.method2771();
			this.aShortArray23 = new short[local8];
			this.aShortArray20 = new short[local8];
			for (local25 = 0; local25 < local8; local25++) {
				this.aShortArray20[local25] = (short) arg1.method2765();
				this.aShortArray23[local25] = (short) arg1.method2765();
			}
		} else if (arg0 == 41) {
			local8 = arg1.method2771();
			this.aShortArray22 = new short[local8];
			this.aShortArray21 = new short[local8];
			for (local25 = 0; local25 < local8; local25++) {
				this.aShortArray21[local25] = (short) arg1.method2765();
				this.aShortArray22[local25] = (short) arg1.method2765();
			}
		} else if (arg0 == 42) {
			local8 = arg1.method2771();
			this.aByteArray12 = new byte[local8];
			for (local25 = 0; local25 < local8; local25++) {
				this.aByteArray12[local25] = arg1.method2770();
			}
		} else if (arg0 == 60) {
			this.anInt957 = arg1.method2765();
		} else if (arg0 == 62) {
			this.aBoolean50 = true;
		} else if (arg0 == 64) {
			this.aBoolean48 = false;
		} else if (arg0 == 65) {
			this.anInt982 = arg1.method2765();
		} else if (arg0 == 66) {
			this.anInt975 = arg1.method2765();
		} else if (arg0 == 67) {
			this.anInt986 = arg1.method2765();
		} else if (arg0 == 68) {
			this.anInt950 = arg1.method2765();
		} else if (arg0 == 69) {
			this.anInt955 = arg1.method2771();
		} else if (arg0 == 70) {
			this.anInt972 = arg1.method2779();
		} else if (arg0 == 71) {
			this.anInt954 = arg1.method2779();
		} else if (arg0 == 72) {
			this.anInt979 = arg1.method2779();
		} else if (arg0 == 73) {
			this.aBoolean46 = true;
		} else if (arg0 == 74) {
			this.aBoolean51 = true;
		} else if (arg0 == 75) {
			this.anInt974 = arg1.method2771();
		} else if (arg0 == 77) {
			this.anInt953 = arg1.method2765();
			if (this.anInt953 == 65535) {
				this.anInt953 = -1;
			}
			this.anInt951 = arg1.method2765();
			if (this.anInt951 == 65535) {
				this.anInt951 = -1;
			}
			local8 = arg1.method2771();
			this.anIntArray85 = new int[local8 + 1];
			for (local25 = 0; local25 <= local8; local25++) {
				this.anIntArray85[local25] = arg1.method2765();
				if (this.anIntArray85[local25] == 65535) {
					this.anIntArray85[local25] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt959 = arg1.method2765();
			this.anInt983 = arg1.method2771();
		} else if (arg0 == 79) {
			this.anInt962 = arg1.method2765();
			this.anInt960 = arg1.method2765();
			this.anInt983 = arg1.method2771();
			local8 = arg1.method2771();
			this.anIntArray83 = new int[local8];
			for (local25 = 0; local25 < local8; local25++) {
				this.anIntArray83[local25] = arg1.method2765();
			}
		} else if (arg0 == 81) {
			this.anInt968 = arg1.method2771() * 256;
		} else if (arg0 != 82) {
			if (arg0 == 83) {
				arg1.method2771();
			} else if (arg0 == 84) {
				arg1.method2779();
			} else if (arg0 == 85) {
				arg1.method2779();
			} else if (arg0 == 86) {
				arg1.method2779();
			} else if (arg0 == 87) {
				arg1.method2765();
			} else if (arg0 != 88) {
				if (arg0 == 89) {
					this.aBoolean49 = false;
				} else if (arg0 == 90) {
					this.aBoolean52 = true;
				} else if (arg0 == 91) {
					this.aBoolean47 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public void method688() {
		if (this.anInt984 == -1) {
			this.anInt984 = 0;
			if (this.anIntArray86 != null && (this.anIntArray84 == null || this.anIntArray84[0] == 10)) {
				this.anInt984 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass24Array6[local31] != null) {
					this.anInt984 = 1;
					break;
				}
			}
		}
		if (this.anInt974 == -1) {
			this.anInt974 = this.anInt965 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(BI)Z")
	public boolean method690(@OriginalArg(1) int arg0) {
		if (this.anIntArray84 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray84.length; local13++) {
				if (arg0 == this.anIntArray84[local13]) {
					return Static106.aClass69_23.method2194(this.anIntArray86[local13] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray86 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray86.length; local59++) {
				local57 &= Static106.aClass69_23.method2194(this.anIntArray86[local59] & 0xFFFF, 0);
			}
			return local57;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([[IIZIIIII)Lclient!i;")
	public Class1_Sub2_Sub11 method691(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) long local19;
		if (this.anIntArray84 == null) {
			local19 = arg4 + (this.anInt980 << 10);
		} else {
			local19 = arg4 + (this.anInt980 << 10) + (arg6 << 3);
		}
		@Pc(40) boolean local40;
		if (arg2 && this.aBoolean54) {
			local40 = true;
			local19 |= Long.MIN_VALUE;
		} else {
			local40 = false;
		}
		@Pc(52) Class5 local52 = Static28.aClass46_1.method1588(local19);
		if (local52 == null) {
			@Pc(60) Class5_Sub6 local60 = this.method693(arg4, arg6);
			if (local60 == null) {
				Static2.aClass1_Sub2_Sub11_1.aClass5_3 = null;
				return Static2.aClass1_Sub2_Sub11_1;
			}
			local60.method2938();
			if (local40) {
				local60.aShort13 = (short) (this.anInt961 * 5 + 768);
				local52 = local60;
				local60.aShort17 = (short) (this.anInt964 + 64);
				local60.method2944();
			} else {
				local52 = new Class5_Sub1_Sub1(local60, this.anInt964 + 64, 768 - -(this.anInt961 * 5), -50, -10, -50);
			}
			Static28.aClass46_1.method1586(local52, local19);
		}
		if (local40) {
			local52 = ((Class5_Sub6) local52).method2941();
		}
		if (this.anInt968 >= 0) {
			if (local52 instanceof Class5_Sub1_Sub1) {
				local52 = ((Class5_Sub1_Sub1) local52).method183(arg0, arg5, arg3, arg1, true, this.anInt968);
			} else if (local52 instanceof Class5_Sub6) {
				local52 = ((Class5_Sub6) local52).method2954(arg0, arg5, arg3, arg1, this.anInt968);
			}
		}
		Static2.aClass1_Sub2_Sub11_1.aClass5_3 = local52;
		return Static2.aClass1_Sub2_Sub11_1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)Lclient!se;")
	private Class5_Sub6 method693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) Class5_Sub6 local1 = null;
		@Pc(10) boolean local10 = this.aBoolean50;
		if (arg1 == 2 && arg0 > 3) {
			local10 = !local10;
		}
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(66) int local66;
		if (this.anIntArray84 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray86 == null) {
				return null;
			}
			local33 = this.anIntArray86.length;
			for (local35 = 0; local35 < local33; local35++) {
				local66 = this.anIntArray86[local35];
				if (local10) {
					local66 += 65536;
				}
				local1 = (Class5_Sub6) Static140.aClass46_5.method1588((long) local66);
				if (local1 == null) {
					local1 = Static171.method2955(Static106.aClass69_23, local66 & 0xFFFF);
					if (local1 == null) {
						return null;
					}
					if (local10) {
						local1.method2951();
					}
					Static140.aClass46_5.method1586(local1, (long) local66);
				}
				if (local33 > 1) {
					Static145.aClass5_Sub6Array1[local35] = local1;
				}
			}
			if (local33 > 1) {
				local1 = new Class5_Sub6(Static145.aClass5_Sub6Array1, local33);
			}
		} else {
			local33 = -1;
			for (local35 = 0; local35 < this.anIntArray84.length; local35++) {
				if (arg1 == this.anIntArray84[local35]) {
					local33 = local35;
					break;
				}
			}
			if (local33 == -1) {
				return null;
			}
			local66 = this.anIntArray86[local33];
			if (local10) {
				local66 += 65536;
			}
			local1 = (Class5_Sub6) Static140.aClass46_5.method1588((long) local66);
			if (local1 == null) {
				local1 = Static171.method2955(Static106.aClass69_23, local66 & 0xFFFF);
				if (local1 == null) {
					return null;
				}
				if (local10) {
					local1.method2951();
				}
				Static140.aClass46_5.method1586(local1, (long) local66);
			}
		}
		@Pc(201) boolean local201;
		if (this.anInt982 == 128 && this.anInt975 == 128 && this.anInt986 == 128) {
			local201 = false;
		} else {
			local201 = true;
		}
		@Pc(218) boolean local218;
		if (this.anInt972 == 0 && this.anInt954 == 0 && this.anInt979 == 0) {
			local218 = false;
		} else {
			local218 = true;
		}
		@Pc(248) Class5_Sub6 local248 = new Class5_Sub6(local1, arg0 == 0 && !local201 && !local218, this.aShortArray20 == null, this.aShortArray21 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local248.method2943();
			local248.method2950(45, 0, -45);
		}
		@Pc(268) int local268 = arg0 & 0x3;
		if (local268 == 1) {
			local248.method2939();
		} else if (local268 == 2) {
			local248.method2946();
		} else if (local268 == 3) {
			local248.method2933();
		}
		@Pc(292) int local292;
		if (this.aShortArray20 != null) {
			for (local292 = 0; local292 < this.aShortArray20.length; local292++) {
				if (this.aByteArray12 == null || this.aByteArray12.length <= local292) {
					local248.method2936(this.aShortArray20[local292], this.aShortArray23[local292]);
				} else {
					local248.method2936(this.aShortArray20[local292], Static166.aShortArray41[this.aByteArray12[local292] & 0xFF]);
				}
			}
		}
		if (this.aShortArray21 != null) {
			for (local292 = 0; local292 < this.aShortArray21.length; local292++) {
				local248.method2934(this.aShortArray21[local292], this.aShortArray22[local292]);
			}
		}
		if (local201) {
			local248.method2947(this.anInt982, this.anInt975, this.anInt986);
		}
		if (local218) {
			local248.method2950(this.anInt972, this.anInt954, this.anInt979);
		}
		return local248;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)Z")
	public boolean method694() {
		if (this.anIntArray86 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray86.length; local20++) {
			local10 &= Static106.aClass69_23.method2194(this.anIntArray86[local20] & 0xFFFF, 0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)Lclient!de;")
	public Class1_Sub2_Sub5 method695() {
		@Pc(7) int local7 = -1;
		if (this.anInt953 != -1) {
			local7 = Static43.method797(this.anInt953);
		} else if (this.anInt951 != -1) {
			local7 = Static122.anIntArray213[this.anInt951];
		}
		return local7 < 0 || this.anIntArray85.length <= local7 || this.anIntArray85[local7] == -1 ? null : Static37.method702(this.anIntArray85[local7]);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[[IIIIILclient!td;II)Lclient!i;")
	public Class1_Sub2_Sub11 method696(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub2_Sub22 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) long local18;
		if (this.anIntArray84 == null) {
			local18 = arg3 + (this.anInt980 << 10);
		} else {
			local18 = (arg4 << 3) + (this.anInt980 << 10) + arg3;
		}
		@Pc(36) Class5_Sub1_Sub1 local36 = (Class5_Sub1_Sub1) Static41.aClass46_3.method1588(local18);
		if (local36 == null) {
			@Pc(44) Class5_Sub6 local44 = this.method693(arg3, arg4);
			if (local44 == null) {
				return null;
			}
			local36 = new Class5_Sub1_Sub1(local44, this.anInt964 + 64, this.anInt961 * 5 + 768, -50, -10, -50);
			Static41.aClass46_3.method1586(local36, local18);
		}
		if (arg5 != null) {
			local36 = (Class5_Sub1_Sub1) arg5.method3080(arg3, local36, arg2);
		}
		if (this.anInt968 >= 0) {
			if (arg5 == null) {
				local36 = (Class5_Sub1_Sub1) local36.method153(true);
			}
			local36 = local36.method183(arg1, arg0, arg6, arg7, false, this.anInt968);
		}
		Static2.aClass1_Sub2_Sub11_1.aClass5_3 = local36;
		return Static2.aClass1_Sub2_Sub11_1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!fj;)V")
	public void method697(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2771();
			if (local7 == 0) {
				return;
			}
			this.method686(local7, arg0);
		}
	}
}
