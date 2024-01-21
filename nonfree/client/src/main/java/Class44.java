import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class44 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	private int anInt1774;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V")
	public void method958(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray197[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static33.anIntArrayArray9[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static33.anIntArrayArray9[arg1].length - 1;
			}
		}
		this.anIntArray197[arg1] = local8;
		this.method962();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILclient!ge;Lclient!ge;I)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method960(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub6 arg1, @OriginalArg(3) Class10_Sub1_Sub6 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1774 != -1) {
			return Static53.method802(this.anInt1774).method274(arg1, arg0, arg2, arg3);
		}
		@Pc(23) long local23 = this.aLong46;
		@Pc(26) int[] local26 = this.anIntArray196;
		if (arg2 != null && (arg2.anInt967 >= 0 || arg2.anInt981 >= 0)) {
			local26 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local26[local42] = this.anIntArray196[local42];
			}
			if (arg2.anInt967 >= 0) {
				local23 += arg2.anInt967 - this.anIntArray196[5] << 8;
				local26[5] = arg2.anInt967;
			}
			if (arg2.anInt981 >= 0) {
				local23 += arg2.anInt981 - this.anIntArray196[3] << 16;
				local26[3] = arg2.anInt981;
			}
		}
		@Pc(103) Class10_Sub1_Sub5_Sub4 local103 = (Class10_Sub1_Sub5_Sub4) Static38.aClass29_29.method644(local23);
		if (local103 == null) {
			@Pc(112) boolean local112 = false;
			for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
				@Pc(120) int local120 = local26[local114];
				if (local120 >= 256 && local120 < 512 && !Static105.method1647(local120 - 256).method714()) {
					local112 = true;
				}
				if (local120 >= 512 && !Static94.method1491(local120 - 512).method1577(this.aBoolean82)) {
					local112 = true;
				}
			}
			if (local112) {
				if (this.aLong47 != -1L) {
					local103 = (Class10_Sub1_Sub5_Sub4) Static38.aClass29_29.method644(this.aLong47);
				}
				if (local103 == null) {
					return null;
				}
			}
			if (local103 == null) {
				@Pc(184) Class10_Sub1_Sub5_Sub4[] local184 = new Class10_Sub1_Sub5_Sub4[12];
				@Pc(186) int local186 = 0;
				@Pc(194) int local194;
				for (@Pc(188) int local188 = 0; local188 < 12; local188++) {
					local194 = local26[local188];
					@Pc(208) Class10_Sub1_Sub5_Sub4 local208;
					if (local194 >= 256 && local194 < 512) {
						local208 = Static105.method1647(local194 - 256).method711();
						if (local208 != null) {
							local184[local186++] = local208;
						}
					}
					if (local194 >= 512) {
						local208 = Static94.method1491(local194 - 512).method1581(this.aBoolean82);
						if (local208 != null) {
							local184[local186++] = local208;
						}
					}
				}
				local103 = new Class10_Sub1_Sub5_Sub4(local184, local186);
				for (local194 = 0; local194 < 5; local194++) {
					if (this.anIntArray197[local194] != 0) {
						local103.method1328(Static33.anIntArrayArray9[local194][0], Static33.anIntArrayArray9[local194][this.anIntArray197[local194]]);
						if (local194 == 1) {
							local103.method1328(Static10.anIntArray45[0], Static10.anIntArray45[this.anIntArray197[local194]]);
						}
					}
				}
				local103.method1310();
				local103.method1324(64, 850, -30, -50, -30, true);
				Static38.aClass29_29.method649(local103, local23);
				this.aLong47 = local23;
			}
		}
		if (arg2 == null && arg1 == null) {
			return local103;
		}
		@Pc(325) Class10_Sub1_Sub5_Sub4 local325;
		if (arg2 != null && arg1 != null) {
			local325 = arg2.method583(arg3, local103, arg0, arg1);
		} else if (arg2 == null) {
			local325 = arg1.method579(arg0, local103);
		} else {
			local325 = arg2.method579(arg3, local103);
		}
		return local325;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method961() {
		if (this.anInt1774 != -1) {
			return Static53.method802(this.anInt1774).method282();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(38) int local38 = this.anIntArray196[local20];
			if (local38 >= 256 && local38 < 512 && !Static105.method1647(local38 - 256).method705()) {
				local18 = true;
			}
			if (local38 >= 512 && !Static94.method1491(local38 - 512).method1574(this.aBoolean82)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(85) int local85 = 0;
		@Pc(88) Class10_Sub1_Sub5_Sub4[] local88 = new Class10_Sub1_Sub5_Sub4[12];
		for (@Pc(90) int local90 = 0; local90 < 12; local90++) {
			@Pc(97) int local97 = this.anIntArray196[local90];
			@Pc(113) Class10_Sub1_Sub5_Sub4 local113;
			if (local97 >= 256 && local97 < 512) {
				local113 = Static105.method1647(local97 - 256).method710();
				if (local113 != null) {
					local88[local85++] = local113;
				}
			}
			if (local97 >= 512) {
				local113 = Static94.method1491(local97 - 512).method1583(this.aBoolean82);
				if (local113 != null) {
					local88[local85++] = local113;
				}
			}
		}
		@Pc(154) Class10_Sub1_Sub5_Sub4 local154 = new Class10_Sub1_Sub5_Sub4(local88, local85);
		for (@Pc(156) int local156 = 0; local156 < 5; local156++) {
			if (this.anIntArray197[local156] != 0) {
				local154.method1328(Static33.anIntArrayArray9[local156][0], Static33.anIntArrayArray9[local156][this.anIntArray197[local156]]);
				if (local156 == 1) {
					local154.method1328(Static10.anIntArray45[0], Static10.anIntArray45[this.anIntArray197[local156]]);
				}
			}
		}
		return local154;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	private void method962() {
		@Pc(4) long local4 = this.aLong46;
		@Pc(13) int local13 = this.anIntArray196[5];
		@Pc(18) int local18 = this.anIntArray196[9];
		this.anIntArray196[5] = local18;
		this.anIntArray196[9] = local13;
		this.aLong46 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong46 <<= 0x4;
			if (this.anIntArray196[local33] >= 256) {
				this.aLong46 += this.anIntArray196[local33] - 256;
			}
		}
		if (this.anIntArray196[0] >= 256) {
			this.aLong46 += this.anIntArray196[0] - 256 >> 4;
		}
		if (this.anIntArray196[1] >= 256) {
			this.aLong46 += this.anIntArray196[1] - 256 >> 8;
		}
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			this.aLong46 <<= 0x3;
			this.aLong46 += this.anIntArray197[local114];
		}
		this.aLong46 <<= 0x1;
		this.aLong46 += this.aBoolean82 ? 1 : 0;
		this.anIntArray196[5] = local13;
		this.anIntArray196[9] = local18;
		if (local4 != 0L && this.aLong46 != local4) {
			Static38.aClass29_29.method640(local4);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	public void method964(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean82 != arg0) {
			this.method969(this.anIntArray197, -1, arg0, null);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIZ)V")
	public void method965(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean82) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray196[Static5.anIntArray20[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(51) Class10_Sub1_Sub8 local51;
		do {
			if (arg1) {
				local19++;
				if (local19 >= Static53.anInt1452) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static53.anInt1452 - 1;
				}
			}
			local51 = Static105.method1647(local19);
		} while (local51 == null || local51.aBoolean53 || (this.aBoolean82 ? 7 : 0) + arg0 != local51.anInt1233);
		this.anIntArray196[Static5.anIntArray20[arg0]] = local19 + 256;
		this.method962();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!tc;)V")
	public void method967(@OriginalArg(1) Class10_Sub10 arg0) {
		arg0.method1126(this.aBoolean82 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray196[Static5.anIntArray20[local16]];
			if (local25 == 0) {
				arg0.method1126(-1);
			} else {
				arg0.method1126(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1126(this.anIntArray197[local25]);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
	public int method968() {
		return this.anInt1774 == -1 ? this.anIntArray196[1] + (this.anIntArray196[11] << 5) + (this.anIntArray196[8] << 10) + (this.anIntArray196[0] << 15) + (this.anIntArray197[4] << 20) + (this.anIntArray197[0] << 25) : Static53.method802(this.anInt1774).anInt389 + 305419896;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIZI[I)V")
	public void method969(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static53.anInt1452; local12++) {
					@Pc(18) Class10_Sub1_Sub8 local18 = Static105.method1647(local12);
					if (local18 != null && !local18.aBoolean53 && (arg2 ? 7 : 0) + local8 == local18.anInt1233) {
						arg3[Static5.anIntArray20[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray197 = arg0;
		this.aBoolean82 = arg2;
		this.anIntArray196 = arg3;
		this.anInt1774 = arg1;
		this.method962();
	}
}
