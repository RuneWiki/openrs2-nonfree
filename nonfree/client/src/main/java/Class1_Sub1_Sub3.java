import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!cb", name = "Cb", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!cb", name = "Vb", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	private int anInt635 = 0;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	private int anInt646 = 0;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
	private int anInt633 = 128;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "[Lclient!ed;")
	public final Class23[] aClass23Array1 = new Class23[5];

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
	private int anInt637 = 0;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	public int anInt632 = 0;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
	public int anInt642 = -1;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
	public int anInt656 = 1;

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
	public int anInt644 = 2;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
	public int anInt643 = 0;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "I")
	public int anInt662 = 16;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
	private int anInt634 = 128;

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "I")
	public int anInt663 = -1;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
	private int anInt653 = -1;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
	private int anInt638 = 0;

	@OriginalMember(owner = "client!cb", name = "Hb", descriptor = "I")
	private int anInt669 = 128;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
	public int anInt655 = -1;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
	public int anInt651 = -1;

	@OriginalMember(owner = "client!cb", name = "Eb", descriptor = "I")
	private int anInt667 = -1;

	@OriginalMember(owner = "client!cb", name = "Gb", descriptor = "I")
	private int anInt668 = 0;

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
	public int anInt660 = 0;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "Lclient!ed;")
	public Class23 aClass23_238 = Static50.aClass23_518;

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "I")
	public int anInt654 = -1;

	@OriginalMember(owner = "client!cb", name = "Nb", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
	public int anInt657 = 1;

	@OriginalMember(owner = "client!cb", name = "Lb", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	private int anInt641 = -1;

	@OriginalMember(owner = "client!cb", name = "Wb", descriptor = "I")
	public int anInt673 = -1;

	@OriginalMember(owner = "client!cb", name = "Kb", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
	public int anInt664 = 0;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	public void method368() {
		if (this.anInt655 == -1) {
			this.anInt655 = 0;
			if (this.anIntArray89 != null && (this.anIntArray91 == null || this.anIntArray91[0] == 10)) {
				this.anInt655 = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < 5; local32++) {
				if (this.aClass23Array1[local32] != null) {
					this.anInt655 = 1;
				}
			}
		}
		if (this.anInt654 == -1) {
			this.anInt654 = this.anInt644 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII[[III)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray91 == null) {
			local19 = arg1 + (this.anInt665 << 10);
		} else {
			local19 = arg1 + (this.anInt665 << 10) + (arg5 << 3);
		}
		@Pc(43) Class1_Sub1_Sub1_Sub2 local43 = (Class1_Sub1_Sub1_Sub2) Static35.aClass79_4.method2657(local19);
		if (local43 == null) {
			@Pc(51) Class1_Sub1_Sub1_Sub6 local51 = this.method377(arg5, arg1);
			if (local51 == null) {
				return null;
			}
			local43 = local51.method2609(this.anInt638 + 64, this.anInt637 * 5 + 768, -50, -10, -50, ~this.anInt641 <= -1);
			Static35.aClass79_4.method2658(local19, local43);
		}
		if (this.anInt641 >= 0) {
			local43 = local43.method1072(arg3, arg0, arg2, arg4, true, this.anInt641);
		}
		return local43;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!jg;)V")
	public void method370(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method861();
			if (local5 == 0) {
				return;
			}
			this.method376(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Lclient!cb;")
	public Class1_Sub1_Sub3 method371() {
		@Pc(5) int local5 = -1;
		if (this.anInt653 != -1) {
			local5 = Static108.method1225(this.anInt653);
		} else if (this.anInt667 != -1) {
			local5 = Static27.anIntArray108[this.anInt667];
		}
		return local5 < 0 || this.anIntArray88.length <= local5 || this.anIntArray88[local5] == -1 ? null : Static84.method3155(this.anIntArray88[local5]);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)Z")
	public boolean method373() {
		if (this.anIntArray88 == null) {
			return this.anInt673 != -1 || this.anIntArray86 != null;
		}
		for (@Pc(35) int local35 = 0; local35 < this.anIntArray88.length; local35++) {
			if (this.anIntArray88[local35] != -1) {
				@Pc(50) Class1_Sub1_Sub3 local50 = Static84.method3155(this.anIntArray88[local35]);
				if (local50.anInt673 != -1 || local50.anIntArray86 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)Z")
	public boolean method374() {
		if (this.anIntArray89 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray89.length; local20++) {
			local12 &= Static111.aClass30_41.method1284(this.anIntArray89[local20] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[[ILclient!wf;IIIBII)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method375(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class1_Sub1_Sub18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) long local22;
		if (this.anIntArray91 == null) {
			local22 = arg3 + (this.anInt665 << 10);
		} else {
			local22 = (this.anInt665 << 10) + (arg5 << 3) + arg3;
		}
		@Pc(42) Class1_Sub1_Sub1_Sub2 local42 = (Class1_Sub1_Sub1_Sub2) Static140.aClass79_22.method2657(local22);
		if (local42 == null) {
			@Pc(50) Class1_Sub1_Sub1_Sub6 local50 = this.method377(arg5, arg3);
			if (local50 == null) {
				return null;
			}
			local42 = local50.method2609(this.anInt638 + 64, this.anInt637 * 5 + 768, -50, -10, -50, true);
			Static140.aClass79_22.method2658(local22, local42);
		}
		if (arg2 == null && this.anInt641 == -1) {
			return local42;
		}
		if (arg2 == null) {
			local42 = local42.method1083(true);
		} else {
			local42 = arg2.method3099(arg4, local42, arg3);
		}
		if (this.anInt641 >= 0) {
			local42 = local42.method1072(arg1, arg0, arg6, arg7, false, this.anInt641);
		}
		return local42;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!jg;I)V")
	private void method376(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(35) int local35;
		if (arg1 == 1) {
			local8 = arg0.method861();
			if (local8 > 0) {
				if (this.anIntArray89 == null || Static166.aBoolean204) {
					this.anIntArray91 = new int[local8];
					this.anIntArray89 = new int[local8];
					for (local35 = 0; local35 < local8; local35++) {
						this.anIntArray89[local35] = arg0.method878();
						this.anIntArray91[local35] = arg0.method861();
					}
				} else {
					arg0.anInt1357 += local8 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass23_238 = arg0.method864();
		} else if (arg1 == 5) {
			local8 = arg0.method861();
			if (local8 > 0) {
				if (this.anIntArray89 == null || Static166.aBoolean204) {
					this.anIntArray89 = new int[local8];
					this.anIntArray91 = null;
					for (local35 = 0; local35 < local8; local35++) {
						this.anIntArray89[local35] = arg0.method878();
					}
				} else {
					arg0.anInt1357 += local8 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt656 = arg0.method861();
		} else if (arg1 == 15) {
			this.anInt657 = arg0.method861();
		} else if (arg1 == 17) {
			this.aBoolean27 = false;
			this.anInt644 = 0;
		} else if (arg1 == 18) {
			this.aBoolean27 = false;
		} else if (arg1 == 19) {
			this.anInt655 = arg0.method861();
		} else if (arg1 == 21) {
			this.anInt641 = 0;
		} else if (arg1 == 22) {
			this.aBoolean30 = true;
		} else if (arg1 == 23) {
			this.aBoolean28 = true;
		} else if (arg1 == 24) {
			this.anInt651 = arg0.method878();
			if (this.anInt651 == 65535) {
				this.anInt651 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt644 = 1;
		} else if (arg1 == 28) {
			this.anInt662 = arg0.method861();
		} else if (arg1 == 29) {
			this.anInt638 = arg0.method900();
		} else if (arg1 == 39) {
			this.anInt637 = arg0.method900() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass23Array1[arg1 - 30] = arg0.method864();
			if (this.aClass23Array1[arg1 - 30].method644(Static103.aClass23_1015)) {
				this.aClass23Array1[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method861();
			this.aShortArray6 = new short[local8];
			this.aShortArray7 = new short[local8];
			for (local35 = 0; local35 < local8; local35++) {
				this.aShortArray7[local35] = (short) arg0.method878();
				this.aShortArray6[local35] = (short) arg0.method878();
			}
		} else if (arg1 == 41) {
			local8 = arg0.method861();
			this.aShortArray8 = new short[local8];
			this.aShortArray9 = new short[local8];
			for (local35 = 0; local35 < local8; local35++) {
				this.aShortArray9[local35] = (short) arg0.method878();
				this.aShortArray8[local35] = (short) arg0.method878();
			}
		} else if (arg1 == 60) {
			this.anInt642 = arg0.method878();
		} else if (arg1 == 62) {
			this.aBoolean26 = true;
		} else if (arg1 == 64) {
			this.aBoolean32 = false;
		} else if (arg1 == 65) {
			this.anInt669 = arg0.method878();
		} else if (arg1 == 66) {
			this.anInt633 = arg0.method878();
		} else if (arg1 == 67) {
			this.anInt634 = arg0.method878();
		} else if (arg1 == 68) {
			this.anInt663 = arg0.method878();
		} else if (arg1 == 69) {
			this.anInt643 = arg0.method861();
		} else if (arg1 == 70) {
			this.anInt668 = arg0.method875();
		} else if (arg1 == 71) {
			this.anInt646 = arg0.method875();
		} else if (arg1 == 72) {
			this.anInt635 = arg0.method875();
		} else if (arg1 == 73) {
			this.aBoolean31 = true;
		} else if (arg1 == 74) {
			this.aBoolean29 = true;
		} else if (arg1 == 75) {
			this.anInt654 = arg0.method861();
		} else if (arg1 == 77) {
			this.anInt653 = arg0.method878();
			if (this.anInt653 == 65535) {
				this.anInt653 = -1;
			}
			this.anInt667 = arg0.method878();
			if (this.anInt667 == 65535) {
				this.anInt667 = -1;
			}
			local8 = arg0.method861();
			this.anIntArray88 = new int[local8 + 1];
			for (local35 = 0; local35 <= local8; local35++) {
				this.anIntArray88[local35] = arg0.method878();
				if (this.anIntArray88[local35] == 65535) {
					this.anIntArray88[local35] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt673 = arg0.method878();
			this.anInt664 = arg0.method861();
		} else if (arg1 == 79) {
			this.anInt632 = arg0.method878();
			this.anInt660 = arg0.method878();
			this.anInt664 = arg0.method861();
			local8 = arg0.method861();
			this.anIntArray86 = new int[local8];
			for (local35 = 0; local35 < local8; local35++) {
				this.anIntArray86[local35] = arg0.method878();
			}
		} else if (arg1 == 81) {
			this.anInt641 = arg0.method861() * 256;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIB)Lclient!sf;")
	private Class1_Sub1_Sub1_Sub6 method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub1_Sub1_Sub6 local7 = null;
		@Pc(14) int local14;
		@Pc(47) int local47;
		@Pc(113) boolean local113;
		@Pc(137) int local137;
		if (this.anIntArray91 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray89 == null) {
				return null;
			}
			local14 = this.anIntArray89.length;
			local113 = this.aBoolean26;
			if (arg0 == 2 && arg1 > 3) {
				local113 = !local113;
			}
			for (local47 = 0; local47 < local14; local47++) {
				local137 = this.anIntArray89[local47];
				if (local113) {
					local137 += 65536;
				}
				local7 = (Class1_Sub1_Sub1_Sub6) Static68.aClass79_10.method2657((long) local137);
				if (local7 == null) {
					local7 = Static151.method2610(Static111.aClass30_41, local137 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local113) {
						local7.method2600();
					}
					Static68.aClass79_10.method2658((long) local137, local7);
				}
				if (local14 > 1) {
					Static125.aClass1_Sub1_Sub1_Sub6Array1[local47] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class1_Sub1_Sub1_Sub6(Static125.aClass1_Sub1_Sub1_Sub6Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray91.length; local14++) {
				if (arg0 == this.anIntArray91[local14]) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local47 = this.anIntArray89[local12];
			@Pc(57) boolean local57 = arg1 > 3 ^ this.aBoolean26;
			if (local57) {
				local47 += 65536;
			}
			local7 = (Class1_Sub1_Sub1_Sub6) Static68.aClass79_10.method2657((long) local47);
			if (local7 == null) {
				local7 = Static151.method2610(Static111.aClass30_41, local47 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local57) {
					local7.method2600();
				}
				Static68.aClass79_10.method2658((long) local47, local7);
			}
		}
		if (this.anInt669 == 128 && this.anInt633 == 128 && this.anInt634 == 128) {
			local113 = false;
		} else {
			local113 = true;
		}
		@Pc(238) boolean local238;
		if (this.anInt668 == 0 && this.anInt646 == 0 && this.anInt635 == 0) {
			local238 = false;
		} else {
			local238 = true;
		}
		@Pc(269) Class1_Sub1_Sub1_Sub6 local269 = new Class1_Sub1_Sub1_Sub6(local7, arg1 == 0 && !local113 && !local238, this.aShortArray7 == null, this.aShortArray9 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local269.method2596();
			local269.method2594(45, 0, -45);
		}
		@Pc(289) int local289 = arg1 & 0x3;
		if (local289 == 1) {
			local269.method2604();
		} else if (local289 == 2) {
			local269.method2611();
		} else if (local289 == 3) {
			local269.method2613();
		}
		if (this.aShortArray7 != null) {
			for (local137 = 0; local137 < this.aShortArray7.length; local137++) {
				local269.method2593(this.aShortArray7[local137], this.aShortArray6[local137]);
			}
		}
		if (this.aShortArray9 != null) {
			for (local137 = 0; local137 < this.aShortArray9.length; local137++) {
				local269.method2603(this.aShortArray9[local137], this.aShortArray8[local137]);
			}
		}
		if (local113) {
			local269.method2606(this.anInt669, this.anInt633, this.anInt634);
		}
		if (local238) {
			local269.method2594(this.anInt668, this.anInt646, this.anInt635);
		}
		return local269;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Z")
	public boolean method380(@OriginalArg(1) int arg0) {
		if (this.anIntArray91 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray91.length; local18++) {
				if (this.anIntArray91[local18] == arg0) {
					return Static111.aClass30_41.method1284(this.anIntArray89[local18] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray89 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < this.anIntArray89.length; local61++) {
				local59 &= Static111.aClass30_41.method1284(this.anIntArray89[local61] & 0xFFFF, 0);
			}
			return local59;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII[[I)Lclient!ka;")
	public Class1_Sub1_Sub1 method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(28) long local28;
		if (this.anIntArray91 == null) {
			local28 = arg4 + (this.anInt665 << 10);
		} else {
			local28 = (this.anInt665 << 10) - (-(arg1 << 3) - arg4);
		}
		@Pc(44) Class1_Sub1_Sub1 local44 = (Class1_Sub1_Sub1) Static97.aClass79_13.method2657(local28);
		if (local44 == null) {
			@Pc(52) Class1_Sub1_Sub1_Sub6 local52 = this.method377(arg1, arg4);
			if (local52 == null) {
				return null;
			}
			if (this.aBoolean30) {
				local52.aShort35 = (short) (this.anInt638 + 64);
				local52.aShort32 = (short) (this.anInt637 * 5 + 768);
				local52.method2595();
				local44 = local52;
			} else {
				local44 = local52.method2609(this.anInt638 + 64, 768 - -(this.anInt637 * 5), -50, -10, -50, this.anInt641 >= 0);
			}
			Static97.aClass79_13.method2658(local28, local44);
		}
		if (this.aBoolean30) {
			local44 = ((Class1_Sub1_Sub1_Sub6) local44).method2601();
		}
		if (this.anInt641 >= 0) {
			if (local44 instanceof Class1_Sub1_Sub1_Sub2) {
				local44 = ((Class1_Sub1_Sub1_Sub2) local44).method1072(arg5, arg2, arg3, arg0, true, this.anInt641);
			} else if (local44 instanceof Class1_Sub1_Sub1_Sub6) {
				local44 = ((Class1_Sub1_Sub1_Sub6) local44).method2597(arg5, arg2, arg3, arg0, this.anInt641);
			}
		}
		return local44;
	}
}
