import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "[I")
	public int[] anIntArray57;

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!da", name = "sb", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!da", name = "vb", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!da", name = "Pb", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!da", name = "Wb", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!da", name = "Yb", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
	public int anInt530 = 0;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
	public int anInt534 = -1;

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
	public int anInt537 = 1;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
	public int anInt529 = -1;

	@OriginalMember(owner = "client!da", name = "xb", descriptor = "I")
	private int anInt540 = 0;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
	public int anInt532 = -1;

	@OriginalMember(owner = "client!da", name = "Ab", descriptor = "I")
	private int anInt543 = 0;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "I")
	public int anInt528 = 1;

	@OriginalMember(owner = "client!da", name = "rb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!da", name = "Ib", descriptor = "I")
	private int anInt550 = 128;

	@OriginalMember(owner = "client!da", name = "Kb", descriptor = "I")
	private int anInt552 = 0;

	@OriginalMember(owner = "client!da", name = "Eb", descriptor = "I")
	public int anInt546 = 0;

	@OriginalMember(owner = "client!da", name = "Db", descriptor = "I")
	private int anInt545 = 128;

	@OriginalMember(owner = "client!da", name = "zb", descriptor = "I")
	private int anInt542 = -1;

	@OriginalMember(owner = "client!da", name = "tb", descriptor = "I")
	public int anInt539 = 16;

	@OriginalMember(owner = "client!da", name = "Rb", descriptor = "I")
	private int anInt559 = 0;

	@OriginalMember(owner = "client!da", name = "Lb", descriptor = "I")
	private int anInt553 = 0;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!da", name = "Jb", descriptor = "I")
	public int anInt551 = -1;

	@OriginalMember(owner = "client!da", name = "Ob", descriptor = "I")
	private int anInt556 = -1;

	@OriginalMember(owner = "client!da", name = "Cb", descriptor = "I")
	public int anInt544 = -1;

	@OriginalMember(owner = "client!da", name = "Gb", descriptor = "I")
	public int anInt548 = 0;

	@OriginalMember(owner = "client!da", name = "Vb", descriptor = "Z")
	public boolean aBoolean31 = true;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!da", name = "yb", descriptor = "I")
	private int anInt541 = 128;

	@OriginalMember(owner = "client!da", name = "nb", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!da", name = "wb", descriptor = "[Lclient!ke;")
	public final Class39[] aClass39Array5 = new Class39[5];

	@OriginalMember(owner = "client!da", name = "Zb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!da", name = "Hb", descriptor = "I")
	public int anInt549 = 0;

	@OriginalMember(owner = "client!da", name = "dc", descriptor = "Z")
	public boolean aBoolean33 = true;

	@OriginalMember(owner = "client!da", name = "ac", descriptor = "Lclient!ke;")
	public Class39 aClass39_280 = Static37.aClass39_475;

	@OriginalMember(owner = "client!da", name = "ub", descriptor = "Z")
	public boolean aBoolean30 = true;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)Z")
	public boolean method412() {
		if (this.anIntArray62 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray62.length; local20++) {
			local18 &= Static18.aClass36_14.method1768(0, this.anIntArray62[local20] & 0xFFFF);
		}
		return local18;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILclient!aa;IIIII)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(27) long local27;
		if (this.anIntArray60 == null) {
			local27 = arg5 + (this.anInt557 << 10);
		} else {
			local27 = (this.anInt557 << 10) - (-(arg0 << 3) - arg5);
		}
		@Pc(43) Class2_Sub1_Sub2_Sub2 local43 = (Class2_Sub1_Sub2_Sub2) Static58.aClass54_15.method1634(local27);
		if (local43 == null) {
			local43 = this.method420(true, true, arg5, arg0);
			if (local43 == null) {
				return null;
			}
			Static58.aClass54_15.method1637(local27, local43);
		}
		if (arg2 == null && !this.aBoolean26) {
			return local43;
		}
		if (arg2 == null) {
			local43 = local43.method707(true);
		} else {
			local43 = arg2.method60(local43, arg7, arg5);
		}
		if (this.aBoolean26) {
			@Pc(100) int local100 = (arg6 + arg4 + arg3 + arg1) / 4;
			for (@Pc(102) int local102 = 0; local102 < local43.anInt988; local102++) {
				@Pc(109) int local109 = local43.anIntArray114[local102];
				@Pc(114) int local114 = local43.anIntArray112[local102];
				@Pc(127) int local127 = (arg3 - arg1) * (local109 - -64) / 128 + arg1;
				@Pc(139) int local139 = arg6 + (arg4 - arg6) * (local109 + 64) / 128;
				@Pc(153) int local153 = local139 + (local114 + 64) * (-local139 + local127) / 128;
				local43.anIntArray118[local102] += local153 - local100;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIII)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11;
		if (this.anIntArray60 == null) {
			local11 = (this.anInt557 << 10) + arg0;
		} else {
			local11 = (this.anInt557 << 10) + ((arg3 << 3) + arg0);
		}
		@Pc(31) Class2_Sub1_Sub2_Sub2 local31 = (Class2_Sub1_Sub2_Sub2) Static39.aClass54_10.method1634(local11);
		if (local31 == null) {
			local31 = this.method420(false, !this.aBoolean25, arg0, arg3);
			if (local31 == null) {
				return null;
			}
			Static39.aClass54_10.method1637(local11, local31);
		}
		if (this.aBoolean26 || this.aBoolean25) {
			local31 = new Class2_Sub1_Sub2_Sub2(local31, this.aBoolean26, this.aBoolean25);
		}
		if (this.aBoolean26) {
			@Pc(88) int local88 = (arg5 + arg2 + arg4 + arg1) / 4;
			for (@Pc(90) int local90 = 0; local90 < local31.anInt988; local90++) {
				@Pc(96) int local96 = local31.anIntArray114[local90];
				@Pc(109) int local109 = arg4 + (arg2 - arg4) * (local96 + 64) / 128;
				@Pc(122) int local122 = (arg5 - arg1) * (local96 + 64) / 128 + arg1;
				@Pc(127) int local127 = local31.anIntArray112[local90];
				@Pc(140) int local140 = (local122 - local109) * (local127 + 64) / 128 + local109;
				local31.anIntArray118[local90] += local140 - local88;
			}
		}
		return local31;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Z")
	public boolean method416() {
		if (this.anIntArray61 == null) {
			return this.anInt532 != -1 || this.anIntArray57 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray61.length; local21++) {
			if (this.anIntArray61[local21] != -1) {
				@Pc(36) Class2_Sub1_Sub5 local36 = Static48.method916(this.anIntArray61[local21]);
				if (local36.anInt532 != -1 || local36.anIntArray57 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
	public void method417() {
		if (this.anInt551 == -1) {
			this.anInt551 = 0;
			if (this.anIntArray62 != null && (this.anIntArray60 == null || this.anIntArray60[0] == 10)) {
				this.anInt551 = 1;
			}
			for (@Pc(25) int local25 = 0; local25 < 5; local25++) {
				if (this.aClass39Array5[local25] != null) {
					this.anInt551 = 1;
				}
			}
		}
		if (this.anInt529 == -1) {
			this.anInt529 = this.aBoolean30 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!g;I)V")
	private void method418(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24;
		@Pc(52) int local52;
		if (arg1 == 1) {
			local24 = arg0.method1281();
			if (local24 > 0) {
				if (this.anIntArray62 == null || Static108.aBoolean137) {
					this.anIntArray60 = new int[local24];
					this.anIntArray62 = new int[local24];
					for (local52 = 0; local52 < local24; local52++) {
						this.anIntArray62[local52] = arg0.method1273();
						this.anIntArray60[local52] = arg0.method1281();
					}
				} else {
					arg0.anInt1772 += local24 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass39_280 = arg0.method1250();
		} else if (arg1 == 5) {
			local24 = arg0.method1281();
			if (local24 > 0) {
				if (this.anIntArray62 == null || Static108.aBoolean137) {
					this.anIntArray62 = new int[local24];
					this.anIntArray60 = null;
					for (local52 = 0; local52 < local24; local52++) {
						this.anIntArray62[local52] = arg0.method1273();
					}
				} else {
					arg0.anInt1772 += local24 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt528 = arg0.method1281();
		} else if (arg1 == 15) {
			this.anInt537 = arg0.method1281();
		} else if (arg1 == 17) {
			this.aBoolean30 = false;
		} else if (arg1 == 18) {
			this.aBoolean31 = false;
		} else if (arg1 == 19) {
			this.anInt551 = arg0.method1281();
		} else if (arg1 == 21) {
			this.aBoolean26 = true;
		} else if (arg1 == 22) {
			this.aBoolean25 = true;
		} else if (arg1 == 23) {
			this.aBoolean29 = true;
		} else if (arg1 == 24) {
			this.anInt544 = arg0.method1273();
			if (this.anInt544 == 65535) {
				this.anInt544 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt539 = arg0.method1281();
		} else if (arg1 == 29) {
			this.anInt540 = arg0.method1254();
		} else if (arg1 == 39) {
			this.anInt552 = arg0.method1254() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass39Array5[arg1 - 30] = arg0.method1250();
			if (this.aClass39Array5[arg1 - 30].method1106(Static109.aClass39_1332)) {
				this.aClass39Array5[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local24 = arg0.method1281();
			this.anIntArray58 = new int[local24];
			this.anIntArray63 = new int[local24];
			for (local52 = 0; local52 < local24; local52++) {
				this.anIntArray58[local52] = arg0.method1273();
				this.anIntArray63[local52] = arg0.method1273();
			}
		} else if (arg1 == 60) {
			this.anInt535 = arg0.method1273();
		} else if (arg1 == 62) {
			this.aBoolean28 = true;
		} else if (arg1 == 64) {
			this.aBoolean33 = false;
		} else if (arg1 == 65) {
			this.anInt541 = arg0.method1273();
		} else if (arg1 == 66) {
			this.anInt550 = arg0.method1273();
		} else if (arg1 == 67) {
			this.anInt545 = arg0.method1273();
		} else if (arg1 == 68) {
			this.anInt534 = arg0.method1273();
		} else if (arg1 == 69) {
			this.anInt530 = arg0.method1281();
		} else if (arg1 == 70) {
			this.anInt559 = arg0.method1269();
		} else if (arg1 == 71) {
			this.anInt553 = arg0.method1269();
		} else if (arg1 == 72) {
			this.anInt543 = arg0.method1269();
		} else if (arg1 == 73) {
			this.aBoolean32 = true;
		} else if (arg1 == 74) {
			this.aBoolean27 = true;
		} else if (arg1 == 75) {
			this.anInt529 = arg0.method1281();
		} else if (arg1 == 77) {
			this.anInt542 = arg0.method1273();
			if (this.anInt542 == 65535) {
				this.anInt542 = -1;
			}
			this.anInt556 = arg0.method1273();
			if (this.anInt556 == 65535) {
				this.anInt556 = -1;
			}
			local24 = arg0.method1281();
			this.anIntArray61 = new int[local24 + 1];
			for (local52 = 0; local52 <= local24; local52++) {
				this.anIntArray61[local52] = arg0.method1273();
				if (this.anIntArray61[local52] == 65535) {
					this.anIntArray61[local52] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt532 = arg0.method1273();
			this.anInt549 = arg0.method1281();
		} else if (arg1 == 79) {
			this.anInt548 = arg0.method1273();
			this.anInt546 = arg0.method1273();
			this.anInt549 = arg0.method1281();
			local24 = arg0.method1281();
			this.anIntArray57 = new int[local24];
			for (local52 = 0; local52 < local24; local52++) {
				this.anIntArray57[local52] = arg0.method1273();
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
	public boolean method419(@OriginalArg(0) int arg0) {
		if (this.anIntArray60 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray60.length; local18++) {
				if (arg0 == this.anIntArray60[local18]) {
					return Static18.aClass36_14.method1768(0, this.anIntArray62[local18] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray62 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray62.length; local63++) {
				local61 &= Static18.aClass36_14.method1768(0, this.anIntArray62[local63] & 0xFFFF);
			}
			return local61;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZIIB)Lclient!ga;")
	private Class2_Sub1_Sub2_Sub2 method420(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class2_Sub1_Sub2_Sub2 local1 = null;
		@Pc(12) int local12;
		@Pc(38) int local38;
		@Pc(109) boolean local109;
		@Pc(121) int local121;
		if (this.anIntArray60 == null) {
			if (arg3 != 10) {
				return null;
			}
			if (this.anIntArray62 == null) {
				return null;
			}
			local109 = this.aBoolean28 ^ arg2 > 3;
			local12 = this.anIntArray62.length;
			for (local38 = 0; local38 < local12; local38++) {
				local121 = this.anIntArray62[local38];
				if (local109) {
					local121 += 65536;
				}
				local1 = (Class2_Sub1_Sub2_Sub2) Static64.aClass54_20.method1634((long) local121);
				if (local1 == null) {
					local1 = Static32.method722(Static18.aClass36_14, local121 & 0xFFFF);
					if (local1 == null) {
						return null;
					}
					if (local109) {
						local1.method717();
					}
					Static64.aClass54_20.method1637((long) local121, local1);
				}
				if (local12 > 1) {
					Static82.aClass2_Sub1_Sub2_Sub2Array1[local38] = local1;
				}
			}
			if (local12 > 1) {
				local1 = new Class2_Sub1_Sub2_Sub2(Static82.aClass2_Sub1_Sub2_Sub2Array1, local12);
			}
		} else {
			@Pc(10) int local10 = -1;
			for (local12 = 0; local12 < this.anIntArray60.length; local12++) {
				if (this.anIntArray60[local12] == arg3) {
					local10 = local12;
					break;
				}
			}
			if (local10 == -1) {
				return null;
			}
			local38 = this.anIntArray62[local10];
			@Pc(48) boolean local48 = this.aBoolean28 ^ arg2 > 3;
			if (local48) {
				local38 += 65536;
			}
			local1 = (Class2_Sub1_Sub2_Sub2) Static64.aClass54_20.method1634((long) local38);
			if (local1 == null) {
				local1 = Static32.method722(Static18.aClass36_14, local38 & 0xFFFF);
				if (local1 == null) {
					return null;
				}
				if (local48) {
					local1.method717();
				}
				Static64.aClass54_20.method1637((long) local38, local1);
			}
		}
		if (this.anInt541 == 128 && this.anInt550 == 128 && this.anInt545 == 128) {
			local109 = false;
		} else {
			local109 = true;
		}
		@Pc(217) boolean local217;
		if (this.anInt559 == 0 && this.anInt553 == 0 && this.anInt543 == 0) {
			local217 = false;
		} else {
			local217 = true;
		}
		@Pc(244) Class2_Sub1_Sub2_Sub2 local244 = new Class2_Sub1_Sub2_Sub2(local1, arg2 == 0 && !local109 && !local217, this.anIntArray58 == null, true);
		@Pc(248) int local248 = arg2 & 0x3;
		if (local248 == 1) {
			local244.method694();
		} else if (local248 == 2) {
			local244.method701();
		} else if (local248 == 3) {
			local244.method702();
		}
		if (this.anIntArray58 != null) {
			for (local121 = 0; local121 < this.anIntArray58.length; local121++) {
				local244.method716(this.anIntArray58[local121], this.anIntArray63[local121]);
			}
		}
		if (local109) {
			local244.method714(this.anInt541, this.anInt550, this.anInt545);
		}
		if (local217) {
			local244.method692(this.anInt559, this.anInt553, this.anInt543);
		}
		if (arg0) {
			local244.method693();
		}
		local244.method712(this.anInt540 + 64, this.anInt552 * 5 + 768, -50, -10, -50, arg1);
		return local244;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(B)Lclient!da;")
	public Class2_Sub1_Sub5 method422() {
		@Pc(5) int local5 = -1;
		if (this.anInt542 != -1) {
			local5 = Static92.method1723(this.anInt542);
		} else if (this.anInt556 != -1) {
			local5 = Static28.anIntArray89[this.anInt556];
		}
		return local5 < 0 || local5 >= this.anIntArray61.length || this.anIntArray61[local5] == -1 ? null : Static48.method916(this.anIntArray61[local5]);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!g;)V")
	public void method423(@OriginalArg(1) Class2_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1281();
			if (local7 == 0) {
				return;
			}
			this.method418(arg0, local7);
		}
	}
}
