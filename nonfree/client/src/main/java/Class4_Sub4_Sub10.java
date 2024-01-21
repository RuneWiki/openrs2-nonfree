import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class4_Sub4_Sub10 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
	public int anInt1709;

	@OriginalMember(owner = "client!lc", name = "hb", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!lc", name = "mb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!lc", name = "nb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!lc", name = "xb", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public int anInt1697 = -1;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "Z")
	public boolean aBoolean105 = true;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
	public int anInt1700 = -1;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	public int anInt1698 = -1;

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "I")
	private int anInt1710 = -1;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public int anInt1696 = -1;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Z")
	public boolean aBoolean104 = true;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
	public int anInt1706 = 1;

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
	public int anInt1708 = 32;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lclient!v;")
	public Class76 aClass76_716 = Static36.aClass76_438;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
	private int anInt1705 = 128;

	@OriginalMember(owner = "client!lc", name = "pb", descriptor = "I")
	private int anInt1715 = 128;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "Z")
	public boolean aBoolean107 = true;

	@OriginalMember(owner = "client!lc", name = "kb", descriptor = "I")
	private int anInt1712 = -1;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	public int anInt1702 = -1;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	public int anInt1701 = -1;

	@OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
	public int anInt1716 = -1;

	@OriginalMember(owner = "client!lc", name = "Ab", descriptor = "I")
	private int anInt1719 = 0;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public int anInt1692 = -1;

	@OriginalMember(owner = "client!lc", name = "yb", descriptor = "I")
	public int anInt1717 = -1;

	@OriginalMember(owner = "client!lc", name = "Bb", descriptor = "[Lclient!v;")
	public final Class76[] aClass76Array17 = new Class76[5];

	@OriginalMember(owner = "client!lc", name = "zb", descriptor = "I")
	private int anInt1718 = 0;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Lclient!lc;")
	public Class4_Sub4_Sub10 method1124() {
		@Pc(5) int local5 = -1;
		if (this.anInt1710 != -1) {
			local5 = Static67.method1125(this.anInt1710);
		} else if (this.anInt1712 != -1) {
			local5 = Static124.anIntArray393[this.anInt1712];
		}
		return local5 < 0 || this.anIntArray231.length <= local5 || this.anIntArray231[local5] == -1 ? null : Static88.method1465(this.anIntArray231[local5]);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method1126() {
		if (this.anIntArray231 != null) {
			@Pc(12) Class4_Sub4_Sub10 local12 = this.method1124();
			return local12 == null ? null : local12.method1126();
		} else if (this.anIntArray230 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray230.length; local36++) {
				if (!Static111.aClass17_34.method300(this.anIntArray230[local36], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(64) Class4_Sub4_Sub3_Sub5[] local64 = new Class4_Sub4_Sub3_Sub5[this.anIntArray230.length];
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray230.length; local66++) {
				local64[local66] = Static108.method1648(Static111.aClass17_34, this.anIntArray230[local66]);
			}
			@Pc(101) Class4_Sub4_Sub3_Sub5 local101;
			if (local64.length == 1) {
				local101 = local64[0];
			} else {
				local101 = new Class4_Sub4_Sub3_Sub5(local64, local64.length);
			}
			@Pc(112) int local112;
			if (this.aShortArray14 != null) {
				for (local112 = 0; local112 < this.aShortArray14.length; local112++) {
					local101.method1657(this.aShortArray14[local112], this.aShortArray13[local112]);
				}
			}
			if (this.aShortArray16 != null) {
				for (local112 = 0; local112 < this.aShortArray16.length; local112++) {
					local101.method1655(this.aShortArray16[local112], this.aShortArray15[local112]);
				}
			}
			return local101;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ne;I)V")
	public void method1127(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method599();
			if (local14 == 0) {
				return;
			}
			this.method1129(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z")
	public boolean method1128() {
		if (this.anIntArray231 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt1710 != -1) {
			local15 = Static67.method1125(this.anInt1710);
		} else if (this.anInt1712 != -1) {
			local15 = Static124.anIntArray393[this.anInt1712];
		}
		return local15 >= 0 && local15 < this.anIntArray231.length && this.anIntArray231[local15] != -1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!ne;I)V")
	private void method1129(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		@Pc(88) int local88;
		@Pc(94) int local94;
		if (arg0 == 1) {
			local88 = arg1.method599();
			this.anIntArray234 = new int[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.anIntArray234[local94] = arg1.method604();
			}
		} else if (arg0 == 2) {
			this.aClass76_716 = arg1.method581();
		} else if (arg0 == 12) {
			this.anInt1706 = arg1.method599();
		} else if (arg0 == 13) {
			this.anInt1698 = arg1.method604();
		} else if (arg0 == 14) {
			this.anInt1702 = arg1.method604();
		} else if (arg0 == 15) {
			this.anInt1692 = arg1.method604();
		} else if (arg0 == 16) {
			this.anInt1697 = arg1.method604();
		} else if (arg0 == 17) {
			this.anInt1702 = arg1.method604();
			this.anInt1716 = arg1.method604();
			this.anInt1717 = arg1.method604();
			this.anInt1701 = arg1.method604();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass76Array17[arg0 - 30] = arg1.method581();
			if (this.aClass76Array17[arg0 - 30].method1882(Static95.aClass76_990)) {
				this.aClass76Array17[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local88 = arg1.method599();
			this.aShortArray14 = new short[local88];
			this.aShortArray13 = new short[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.aShortArray14[local94] = (short) arg1.method604();
				this.aShortArray13[local94] = (short) arg1.method604();
			}
			return;
		} else if (arg0 == 41) {
			local88 = arg1.method599();
			this.aShortArray15 = new short[local88];
			this.aShortArray16 = new short[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.aShortArray16[local94] = (short) arg1.method604();
				this.aShortArray15[local94] = (short) arg1.method604();
			}
			return;
		} else if (arg0 == 60) {
			local88 = arg1.method599();
			this.anIntArray230 = new int[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.anIntArray230[local94] = arg1.method604();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean104 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt1696 = arg1.method604();
			return;
		} else if (arg0 == 97) {
			this.anInt1705 = arg1.method604();
			return;
		} else if (arg0 == 98) {
			this.anInt1715 = arg1.method604();
			return;
		} else if (arg0 == 99) {
			this.aBoolean106 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt1719 = arg1.method579();
			return;
		} else if (arg0 == 101) {
			this.anInt1718 = arg1.method579() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt1700 = arg1.method604();
			return;
		} else if (arg0 == 103) {
			this.anInt1708 = arg1.method604();
			return;
		} else if (arg0 == 106) {
			this.anInt1710 = arg1.method604();
			if (this.anInt1710 == 65535) {
				this.anInt1710 = -1;
			}
			this.anInt1712 = arg1.method604();
			if (this.anInt1712 == 65535) {
				this.anInt1712 = -1;
			}
			local88 = arg1.method599();
			this.anIntArray231 = new int[local88 + 1];
			for (local94 = 0; local94 <= local88; local94++) {
				this.anIntArray231[local94] = arg1.method604();
				if (this.anIntArray231[local94] == 65535) {
					this.anIntArray231[local94] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean105 = false;
			} else if (arg0 == 109) {
				this.aBoolean107 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public void method1131() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!kc;Lclient!kc;I)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub9 arg2, @OriginalArg(3) Class4_Sub4_Sub9 arg3) {
		if (this.anIntArray231 != null) {
			@Pc(12) Class4_Sub4_Sub10 local12 = this.method1124();
			return local12 == null ? null : local12.method1132(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class4_Sub4_Sub3_Sub7 local32 = (Class4_Sub4_Sub3_Sub7) Static10.aClass72_8.method1781((long) this.anInt1709);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray234.length; local38++) {
				if (!Static111.aClass17_34.method300(this.anIntArray234[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class4_Sub4_Sub3_Sub5[] local70 = new Class4_Sub4_Sub3_Sub5[this.anIntArray234.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray234.length; local72++) {
				local70[local72] = Static108.method1648(Static111.aClass17_34, this.anIntArray234[local72]);
			}
			@Pc(105) Class4_Sub4_Sub3_Sub5 local105;
			if (local70.length == 1) {
				local105 = local70[0];
			} else {
				local105 = new Class4_Sub4_Sub3_Sub5(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray14 != null) {
				for (local116 = 0; local116 < this.aShortArray14.length; local116++) {
					local105.method1657(this.aShortArray14[local116], this.aShortArray13[local116]);
				}
			}
			if (this.aShortArray16 != null) {
				for (local116 = 0; local116 < this.aShortArray16.length; local116++) {
					local105.method1655(this.aShortArray16[local116], this.aShortArray15[local116]);
				}
			}
			local32 = local105.method1652(this.anInt1719 + 64, 850 - -this.anInt1718, -30, -50, -30);
			Static10.aClass72_8.method1783(local32, (long) this.anInt1709);
		}
		@Pc(191) Class4_Sub4_Sub3_Sub7 local191;
		if (arg3 != null && arg2 != null) {
			local191 = arg3.method1027(arg0, arg2, local32, arg1);
		} else if (arg3 != null) {
			local191 = arg3.method1035(arg1, local32);
		} else if (arg2 == null) {
			local191 = local32.method1771(true);
		} else {
			local191 = arg2.method1035(arg0, local32);
		}
		if (this.anInt1705 != 128 || this.anInt1715 != 128) {
			local191.method1774(this.anInt1705, this.anInt1715, this.anInt1705);
		}
		return local191;
	}
}
