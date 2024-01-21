import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub4_Sub6 extends Class2_Sub4 {

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!dg", name = "ib", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!dg", name = "vb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!dg", name = "xb", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!dg", name = "Cb", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!dg", name = "Gb", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!dg", name = "Lb", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!dg", name = "Nb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "[Lclient!gg;")
	public final Class28[] aClass28Array11 = new Class28[5];

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
	private int anInt1013 = 128;

	@OriginalMember(owner = "client!dg", name = "cb", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
	public int anInt1027 = 2;

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "Z")
	public boolean aBoolean44 = true;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	private int anInt1017 = 0;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	private int anInt1015 = 128;

	@OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
	public int anInt1024 = -1;

	@OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
	private int anInt1025 = 0;

	@OriginalMember(owner = "client!dg", name = "lb", descriptor = "Lclient!gg;")
	public Class28 aClass28_641 = Static49.aClass28_790;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
	public int anInt1019 = -1;

	@OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
	public int anInt1030 = 0;

	@OriginalMember(owner = "client!dg", name = "ub", descriptor = "I")
	public int anInt1038 = 0;

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
	public int anInt1020 = -1;

	@OriginalMember(owner = "client!dg", name = "sb", descriptor = "I")
	public int anInt1036 = 16;

	@OriginalMember(owner = "client!dg", name = "Ab", descriptor = "I")
	private int anInt1041 = 0;

	@OriginalMember(owner = "client!dg", name = "yb", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!dg", name = "Jb", descriptor = "I")
	private int anInt1046 = -1;

	@OriginalMember(owner = "client!dg", name = "tb", descriptor = "I")
	public int anInt1037 = 1;

	@OriginalMember(owner = "client!dg", name = "Bb", descriptor = "I")
	public int anInt1042 = 0;

	@OriginalMember(owner = "client!dg", name = "Mb", descriptor = "I")
	public int anInt1049 = -1;

	@OriginalMember(owner = "client!dg", name = "pb", descriptor = "I")
	private int anInt1033 = -1;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
	private int anInt1018 = -1;

	@OriginalMember(owner = "client!dg", name = "Ob", descriptor = "I")
	public int anInt1050 = 1;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	private int anInt1016 = 0;

	@OriginalMember(owner = "client!dg", name = "Qb", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!dg", name = "Ib", descriptor = "I")
	private int anInt1045 = 0;

	@OriginalMember(owner = "client!dg", name = "Pb", descriptor = "I")
	public int anInt1051 = -1;

	@OriginalMember(owner = "client!dg", name = "qb", descriptor = "I")
	public int anInt1034 = 0;

	@OriginalMember(owner = "client!dg", name = "Sb", descriptor = "I")
	private int anInt1053 = 128;

	@OriginalMember(owner = "client!dg", name = "Rb", descriptor = "I")
	public int anInt1052 = -1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLclient!ab;)V")
	public void method706(@OriginalArg(1) Class2_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1698();
			if (local14 == 0) {
				return;
			}
			this.method712(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)Lclient!ka;")
	private Class2_Sub4_Sub1_Sub5 method708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub4_Sub1_Sub5 local7 = null;
		@Pc(10) boolean local10 = this.aBoolean45;
		if (arg1 == 2 && arg0 > 3) {
			local10 = !local10;
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		@Pc(63) int local63;
		if (this.anIntArray84 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray83 == null) {
				return null;
			}
			local29 = this.anIntArray83.length;
			for (local31 = 0; local31 < local29; local31++) {
				local63 = this.anIntArray83[local31];
				if (local10) {
					local63 += 65536;
				}
				local7 = (Class2_Sub4_Sub1_Sub5) Static97.aClass14_125.method603((long) local63);
				if (local7 == null) {
					local7 = Static86.method1530(Static180.aClass40_41, local63 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local10) {
						local7.method1534();
					}
					Static97.aClass14_125.method607((long) local63, local7);
				}
				if (local29 > 1) {
					Static107.aClass2_Sub4_Sub1_Sub5Array1[local31] = local7;
				}
			}
			if (local29 > 1) {
				local7 = new Class2_Sub4_Sub1_Sub5(Static107.aClass2_Sub4_Sub1_Sub5Array1, local29);
			}
		} else {
			local29 = -1;
			for (local31 = 0; local31 < this.anIntArray84.length; local31++) {
				if (arg1 == this.anIntArray84[local31]) {
					local29 = local31;
					break;
				}
			}
			if (local29 == -1) {
				return null;
			}
			local63 = this.anIntArray83[local29];
			if (local10) {
				local63 += 65536;
			}
			local7 = (Class2_Sub4_Sub1_Sub5) Static97.aClass14_125.method603((long) local63);
			if (local7 == null) {
				local7 = Static86.method1530(Static180.aClass40_41, local63 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local10) {
					local7.method1534();
				}
				Static97.aClass14_125.method607((long) local63, local7);
			}
		}
		@Pc(198) boolean local198;
		if (this.anInt1013 == 128 && this.anInt1015 == 128 && this.anInt1053 == 128) {
			local198 = false;
		} else {
			local198 = true;
		}
		@Pc(224) boolean local224;
		if (this.anInt1041 == 0 && this.anInt1025 == 0 && this.anInt1016 == 0) {
			local224 = false;
		} else {
			local224 = true;
		}
		@Pc(257) Class2_Sub4_Sub1_Sub5 local257 = new Class2_Sub4_Sub1_Sub5(local7, arg0 == 0 && !local198 && !local224 && !local10, this.aShortArray11 == null, this.aShortArray10 == null, true);
		if (local10) {
			local257.method1527();
		}
		if (arg1 == 4 && arg0 > 3) {
			local257.method1547();
			local257.method1548(45, 0, -45);
		}
		@Pc(283) int local283 = arg0 & 0x3;
		if (local283 == 1) {
			local257.method1549();
		} else if (local283 == 2) {
			local257.method1539();
		} else if (local283 == 3) {
			local257.method1542();
		}
		@Pc(313) int local313;
		if (this.aShortArray11 != null) {
			for (local313 = 0; local313 < this.aShortArray11.length; local313++) {
				local257.method1531(this.aShortArray11[local313], this.aShortArray9[local313]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local313 = 0; local313 < this.aShortArray10.length; local313++) {
				local257.method1537(this.aShortArray10[local313], this.aShortArray12[local313]);
			}
		}
		if (local198) {
			local257.method1528(this.anInt1013, this.anInt1015, this.anInt1053);
		}
		if (local224) {
			local257.method1548(this.anInt1041, this.anInt1025, this.anInt1016);
		}
		return local257;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Z")
	public boolean method710() {
		if (this.anIntArray83 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray83.length; local21++) {
			local19 &= Static180.aClass40_41.method1783(this.anIntArray83[local21] & 0xFFFF, 0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Z")
	public boolean method711() {
		if (this.anIntArray82 == null) {
			return this.anInt1020 != -1 || this.anIntArray81 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray82.length; local22++) {
			if (this.anIntArray82[local22] != -1) {
				@Pc(37) Class2_Sub4_Sub6 local37 = Static151.method2339(this.anIntArray82[local22]);
				if (local37.anInt1020 != -1 || local37.anIntArray81 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ab;IZ)V")
	private void method712(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg1 == 1) {
			local16 = arg0.method1698();
			if (local16 > 0) {
				if (this.anIntArray83 == null || Static72.aBoolean92) {
					this.anIntArray84 = new int[local16];
					this.anIntArray83 = new int[local16];
					for (local45 = 0; local45 < local16; local45++) {
						this.anIntArray83[local45] = arg0.method1680();
						this.anIntArray84[local45] = arg0.method1698();
					}
				} else {
					arg0.anInt2385 += local16 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass28_641 = arg0.method1662();
		} else if (arg1 == 5) {
			local16 = arg0.method1698();
			if (local16 > 0) {
				if (this.anIntArray83 == null || Static72.aBoolean92) {
					this.anIntArray83 = new int[local16];
					this.anIntArray84 = null;
					for (local45 = 0; local45 < local16; local45++) {
						this.anIntArray83[local45] = arg0.method1680();
					}
				} else {
					arg0.anInt2385 += local16 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1050 = arg0.method1698();
		} else if (arg1 == 15) {
			this.anInt1037 = arg0.method1698();
		} else if (arg1 == 17) {
			this.aBoolean44 = false;
			this.anInt1027 = 0;
		} else if (arg1 == 18) {
			this.aBoolean44 = false;
		} else if (arg1 == 19) {
			this.anInt1051 = arg0.method1698();
		} else if (arg1 == 21) {
			this.anInt1018 = 0;
		} else if (arg1 == 22) {
			this.aBoolean41 = true;
		} else if (arg1 == 23) {
			this.aBoolean47 = true;
		} else if (arg1 == 24) {
			this.anInt1024 = arg0.method1680();
			if (this.anInt1024 == 65535) {
				this.anInt1024 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt1027 = 1;
		} else if (arg1 == 28) {
			this.anInt1036 = arg0.method1698();
		} else if (arg1 == 29) {
			this.anInt1045 = arg0.method1707();
		} else if (arg1 == 39) {
			this.anInt1017 = arg0.method1707() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass28Array11[arg1 - 30] = arg0.method1662();
			if (this.aClass28Array11[arg1 - 30].method1140(Static90.aClass28_1388)) {
				this.aClass28Array11[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local16 = arg0.method1698();
			this.aShortArray9 = new short[local16];
			this.aShortArray11 = new short[local16];
			for (local45 = 0; local45 < local16; local45++) {
				this.aShortArray11[local45] = (short) arg0.method1680();
				this.aShortArray9[local45] = (short) arg0.method1680();
			}
		} else if (arg1 == 41) {
			local16 = arg0.method1698();
			this.aShortArray12 = new short[local16];
			this.aShortArray10 = new short[local16];
			for (local45 = 0; local45 < local16; local45++) {
				this.aShortArray10[local45] = (short) arg0.method1680();
				this.aShortArray12[local45] = (short) arg0.method1680();
			}
		} else if (arg1 == 60) {
			this.anInt1052 = arg0.method1680();
		} else if (arg1 == 62) {
			this.aBoolean45 = true;
		} else if (arg1 == 64) {
			this.aBoolean43 = false;
		} else if (arg1 == 65) {
			this.anInt1013 = arg0.method1680();
		} else if (arg1 == 66) {
			this.anInt1015 = arg0.method1680();
		} else if (arg1 == 67) {
			this.anInt1053 = arg0.method1680();
		} else if (arg1 == 68) {
			this.anInt1019 = arg0.method1680();
		} else if (arg1 == 69) {
			this.anInt1030 = arg0.method1698();
		} else if (arg1 == 70) {
			this.anInt1041 = arg0.method1659();
		} else if (arg1 == 71) {
			this.anInt1025 = arg0.method1659();
		} else if (arg1 == 72) {
			this.anInt1016 = arg0.method1659();
		} else if (arg1 == 73) {
			this.aBoolean46 = true;
		} else if (arg1 == 74) {
			this.aBoolean42 = true;
		} else if (arg1 == 75) {
			this.anInt1049 = arg0.method1698();
		} else if (arg1 == 77) {
			this.anInt1033 = arg0.method1680();
			if (this.anInt1033 == 65535) {
				this.anInt1033 = -1;
			}
			this.anInt1046 = arg0.method1680();
			if (this.anInt1046 == 65535) {
				this.anInt1046 = -1;
			}
			local16 = arg0.method1698();
			this.anIntArray82 = new int[local16 + 1];
			for (local45 = 0; local45 <= local16; local45++) {
				this.anIntArray82[local45] = arg0.method1680();
				if (this.anIntArray82[local45] == 65535) {
					this.anIntArray82[local45] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1020 = arg0.method1680();
			this.anInt1042 = arg0.method1698();
		} else if (arg1 == 79) {
			this.anInt1034 = arg0.method1680();
			this.anInt1038 = arg0.method1680();
			this.anInt1042 = arg0.method1698();
			local16 = arg0.method1698();
			this.anIntArray81 = new int[local16];
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray81[local45] = arg0.method1680();
			}
		} else if (arg1 == 81) {
			this.anInt1018 = arg0.method1698() * 256;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)Z")
	public boolean method714(@OriginalArg(1) int arg0) {
		if (this.anIntArray84 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray84.length; local15++) {
				if (arg0 == this.anIntArray84[local15]) {
					return Static180.aClass40_41.method1783(this.anIntArray83[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray83 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < this.anIntArray83.length; local58++) {
				local56 &= Static180.aClass40_41.method1783(this.anIntArray83[local58] & 0xFFFF, 0);
			}
			return local56;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII[[IIB)Lclient!d;")
	public Class2_Sub4_Sub1 method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5) {
		@Pc(24) long local24;
		if (this.anIntArray84 == null) {
			local24 = (this.anInt1048 << 10) + arg5;
		} else {
			local24 = arg5 + (arg2 << 3) + (this.anInt1048 << 10);
		}
		@Pc(44) Class2_Sub4_Sub1 local44 = (Class2_Sub4_Sub1) Static4.aClass14_7.method603(local24);
		if (local44 == null) {
			@Pc(52) Class2_Sub4_Sub1_Sub5 local52 = this.method708(arg5, arg2);
			if (local52 == null) {
				return null;
			}
			if (this.aBoolean41) {
				local52.aShort34 = (short) (this.anInt1045 + 64);
				local44 = local52;
				local52.aShort32 = (short) (this.anInt1017 * 5 + 768);
				local52.method1535();
			} else {
				local44 = local52.method1544(this.anInt1045 + 64, this.anInt1017 * 5 + 768, -50, -10, -50, this.anInt1018 >= 0);
			}
			Static4.aClass14_7.method607(local24, local44);
		}
		if (this.aBoolean41) {
			local44 = ((Class2_Sub4_Sub1_Sub5) local44).method1540();
		}
		if (this.anInt1018 >= 0) {
			if (local44 instanceof Class2_Sub4_Sub1_Sub3) {
				local44 = ((Class2_Sub4_Sub1_Sub3) local44).method1192(arg4, arg1, arg0, arg3, true, this.anInt1018);
			} else if (local44 instanceof Class2_Sub4_Sub1_Sub5) {
				local44 = ((Class2_Sub4_Sub1_Sub5) local44).method1526(arg4, arg1, arg0, arg3, this.anInt1018);
			}
		}
		return local44;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[[IIIIII)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method716(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(18) long local18;
		if (this.anIntArray84 == null) {
			local18 = arg3 + (this.anInt1048 << 10);
		} else {
			local18 = (arg2 << 3) + (this.anInt1048 << 10) + arg3;
		}
		@Pc(34) Class2_Sub4_Sub1_Sub3 local34 = (Class2_Sub4_Sub1_Sub3) Static118.aClass14_205.method603(local18);
		if (local34 == null) {
			@Pc(44) Class2_Sub4_Sub1_Sub5 local44 = this.method708(arg3, arg2);
			if (local44 == null) {
				return null;
			}
			local34 = local44.method1544(this.anInt1045 + 64, this.anInt1017 * 5 + 768, -50, -10, -50, ~this.anInt1018 <= -1);
			Static118.aClass14_205.method607(local18, local34);
		}
		if (this.anInt1018 >= 0) {
			local34 = local34.method1192(arg1, arg4, arg5, arg0, true, this.anInt1018);
		}
		return local34;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([[IIBLclient!ah;IIIII)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method717(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray84 == null) {
			local17 = (this.anInt1048 << 10) + arg6;
		} else {
			local17 = (arg7 << 3) + (this.anInt1048 << 10) + arg6;
		}
		@Pc(37) Class2_Sub4_Sub1_Sub3 local37 = (Class2_Sub4_Sub1_Sub3) Static85.aClass14_107.method603(local17);
		if (local37 == null) {
			@Pc(45) Class2_Sub4_Sub1_Sub5 local45 = this.method708(arg6, arg7);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method1544(this.anInt1045 + 64, this.anInt1017 * 5 + 768, -50, -10, -50, true);
			Static85.aClass14_107.method607(local17, local37);
		}
		if (arg2 == null && this.anInt1018 == -1) {
			return local37;
		}
		if (arg2 == null) {
			local37 = local37.method1201(true);
		} else {
			local37 = arg2.method305(arg6, local37, arg4);
		}
		if (this.anInt1018 >= 0) {
			local37 = local37.method1192(arg0, arg1, arg5, arg3, false, this.anInt1018);
		}
		return local37;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Lclient!dg;")
	public Class2_Sub4_Sub6 method718() {
		@Pc(10) int local10 = -1;
		if (this.anInt1033 != -1) {
			local10 = Static27.method1953(this.anInt1033);
		} else if (this.anInt1046 != -1) {
			local10 = Static24.anIntArray52[this.anInt1046];
		}
		return local10 < 0 || local10 >= this.anIntArray82.length || this.anIntArray82[local10] == -1 ? null : Static151.method2339(this.anIntArray82[local10]);
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
	public void method719() {
		if (this.anInt1051 == -1) {
			this.anInt1051 = 0;
			if (this.anIntArray83 != null && (this.anIntArray84 == null || this.anIntArray84[0] == 10)) {
				this.anInt1051 = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < 5; local32++) {
				if (this.aClass28Array11[local32] != null) {
					this.anInt1051 = 1;
				}
			}
		}
		if (this.anInt1049 == -1) {
			this.anInt1049 = this.anInt1027 == 0 ? 0 : 1;
		}
	}
}
