import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!fc", name = "Lb", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!fc", name = "Pb", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
	public int anInt765 = -1;

	@OriginalMember(owner = "client!fc", name = "eb", descriptor = "Z")
	public boolean aBoolean36 = true;

	@OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
	private int anInt766 = -1;

	@OriginalMember(owner = "client!fc", name = "rb", descriptor = "I")
	private int anInt777 = -1;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
	public int anInt759 = -1;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	public int anInt760 = 1;

	@OriginalMember(owner = "client!fc", name = "Bb", descriptor = "I")
	private int anInt784 = 128;

	@OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
	public int anInt774 = -1;

	@OriginalMember(owner = "client!fc", name = "Z", descriptor = "Lclient!mc;")
	public Class42 aClass42_414 = Static64.aClass42_833;

	@OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
	public int anInt767 = 32;

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
	public int anInt763 = -1;

	@OriginalMember(owner = "client!fc", name = "yb", descriptor = "I")
	public int anInt781 = -1;

	@OriginalMember(owner = "client!fc", name = "Db", descriptor = "I")
	private int anInt786 = 0;

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
	private int anInt780 = 0;

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "I")
	public int anInt785 = -1;

	@OriginalMember(owner = "client!fc", name = "Eb", descriptor = "I")
	public int anInt787 = -1;

	@OriginalMember(owner = "client!fc", name = "Ib", descriptor = "I")
	private int anInt791 = 128;

	@OriginalMember(owner = "client!fc", name = "Mb", descriptor = "[Lclient!mc;")
	public final Class42[] aClass42Array5 = new Class42[5];

	@OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
	public int anInt769 = -1;

	@OriginalMember(owner = "client!fc", name = "Sb", descriptor = "Z")
	public boolean aBoolean39 = true;

	@OriginalMember(owner = "client!fc", name = "Tb", descriptor = "I")
	public int anInt794 = -1;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method540() {
		if (this.anIntArray90 != null) {
			@Pc(12) Class1_Sub1_Sub6 local12 = this.method551();
			return local12 == null ? null : local12.method540();
		} else if (this.anIntArray85 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray85.length; local29++) {
				if (!Static69.aClass33_17.method1310(0, this.anIntArray85[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class1_Sub1_Sub8_Sub3[] local61 = new Class1_Sub1_Sub8_Sub3[this.anIntArray85.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray85.length; local63++) {
				local61[local63] = Static76.method1372(Static69.aClass33_17, this.anIntArray85[local63]);
			}
			@Pc(91) Class1_Sub1_Sub8_Sub3 local91;
			if (local61.length == 1) {
				local91 = local61[0];
			} else {
				local91 = new Class1_Sub1_Sub8_Sub3(local61, local61.length);
			}
			if (this.anIntArray88 != null) {
				for (@Pc(105) int local105 = 0; local105 < this.anIntArray88.length; local105++) {
					local91.method1383(this.anIntArray88[local105], this.anIntArray87[local105]);
				}
			}
			return local91;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method541(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1186();
			if (local5 == 0) {
				return;
			}
			this.method550(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public void method546() {
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)Z")
	public boolean method547() {
		if (this.anIntArray90 == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.anInt766 != -1) {
			local16 = Static52.method973(this.anInt766);
		} else if (this.anInt777 != -1) {
			local16 = Static51.anIntArray200[this.anInt777];
		}
		return local16 >= 0 && local16 < this.anIntArray90.length && this.anIntArray90[local16] != -1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!s;IIILclient!s;)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method549(@OriginalArg(0) Class1_Sub1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub14 arg3) {
		if (this.anIntArray90 != null) {
			@Pc(12) Class1_Sub1_Sub6 local12 = this.method551();
			return local12 == null ? null : local12.method549(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class1_Sub1_Sub8_Sub3 local32 = (Class1_Sub1_Sub8_Sub3) Static105.aClass37_28.method982((long) this.anInt771);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray86.length; local38++) {
				if (!Static69.aClass33_17.method1310(0, this.anIntArray86[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class1_Sub1_Sub8_Sub3[] local70 = new Class1_Sub1_Sub8_Sub3[this.anIntArray86.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray86.length; local72++) {
				local70[local72] = Static76.method1372(Static69.aClass33_17, this.anIntArray86[local72]);
			}
			if (local70.length == 1) {
				local32 = local70[0];
			} else {
				local32 = new Class1_Sub1_Sub8_Sub3(local70, local70.length);
			}
			if (this.anIntArray88 != null) {
				for (@Pc(116) int local116 = 0; local116 < this.anIntArray88.length; local116++) {
					local32.method1383(this.anIntArray88[local116], this.anIntArray87[local116]);
				}
			}
			local32.method1377();
			local32.method1394(this.anInt786 + 64, this.anInt780 + 850, -30, -50, -30, true);
			Static105.aClass37_28.method981((long) this.anInt771, local32);
		}
		@Pc(169) Class1_Sub1_Sub8_Sub3 local169;
		if (arg3 != null && arg0 != null) {
			local169 = arg3.method1620(arg0, arg1, local32, arg2);
		} else if (arg3 != null) {
			local169 = arg3.method1611(local32, arg2);
		} else if (arg0 == null) {
			local169 = local32.method1380(true);
		} else {
			local169 = arg0.method1611(local32, arg1);
		}
		if (this.anInt784 != 128 || this.anInt791 != 128) {
			local169.method1364(this.anInt784, this.anInt791, this.anInt784);
		}
		return local169;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ka;BI)V")
	private void method550(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(216) int local216;
		@Pc(224) int local224;
		if (arg1 == 1) {
			local216 = arg0.method1186();
			this.anIntArray86 = new int[local216];
			for (local224 = 0; local224 < local216; local224++) {
				this.anIntArray86[local224] = arg0.method1199();
			}
		} else if (arg1 == 2) {
			this.aClass42_414 = arg0.method1201();
		} else if (arg1 == 12) {
			this.anInt760 = arg0.method1186();
		} else if (arg1 == 13) {
			this.anInt769 = arg0.method1199();
		} else if (arg1 == 14) {
			this.anInt787 = arg0.method1199();
		} else if (arg1 == 15) {
			this.anInt781 = arg0.method1199();
		} else if (arg1 == 16) {
			this.anInt765 = arg0.method1199();
		} else if (arg1 == 17) {
			this.anInt787 = arg0.method1199();
			this.anInt785 = arg0.method1199();
			this.anInt774 = arg0.method1199();
			this.anInt763 = arg0.method1199();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass42Array5[arg1 - 30] = arg0.method1201();
			if (this.aClass42Array5[arg1 - 30].method1040(Static107.aClass42_1423)) {
				this.aClass42Array5[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local216 = arg0.method1186();
			this.anIntArray88 = new int[local216];
			this.anIntArray87 = new int[local216];
			for (local224 = 0; local224 < local216; local224++) {
				this.anIntArray88[local224] = arg0.method1199();
				this.anIntArray87[local224] = arg0.method1199();
			}
		} else if (arg1 == 60) {
			local216 = arg0.method1186();
			this.anIntArray85 = new int[local216];
			for (local224 = 0; local224 < local216; local224++) {
				this.anIntArray85[local224] = arg0.method1199();
			}
		} else if (arg1 == 93) {
			this.aBoolean39 = false;
		} else if (arg1 == 95) {
			this.anInt759 = arg0.method1199();
		} else if (arg1 == 97) {
			this.anInt784 = arg0.method1199();
		} else if (arg1 == 98) {
			this.anInt791 = arg0.method1199();
		} else if (arg1 == 99) {
			this.aBoolean35 = true;
		} else if (arg1 == 100) {
			this.anInt786 = arg0.method1209();
		} else if (arg1 == 101) {
			this.anInt780 = arg0.method1209() * 5;
		} else if (arg1 == 102) {
			this.anInt794 = arg0.method1199();
		} else if (arg1 == 103) {
			this.anInt767 = arg0.method1199();
		} else if (arg1 == 106) {
			this.anInt766 = arg0.method1199();
			if (this.anInt766 == 65535) {
				this.anInt766 = -1;
			}
			this.anInt777 = arg0.method1199();
			if (this.anInt777 == 65535) {
				this.anInt777 = -1;
			}
			local216 = arg0.method1186();
			this.anIntArray90 = new int[local216 + 1];
			for (local224 = 0; local224 <= local216; local224++) {
				this.anIntArray90[local224] = arg0.method1199();
				if (this.anIntArray90[local224] == 65535) {
					this.anIntArray90[local224] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean36 = false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Lclient!fc;")
	public Class1_Sub1_Sub6 method551() {
		@Pc(5) int local5 = -1;
		if (this.anInt766 != -1) {
			local5 = Static52.method973(this.anInt766);
		} else if (this.anInt777 != -1) {
			local5 = Static51.anIntArray200[this.anInt777];
		}
		return local5 < 0 || local5 >= this.anIntArray90.length || this.anIntArray90[local5] == -1 ? null : Static43.method771(this.anIntArray90[local5]);
	}
}
