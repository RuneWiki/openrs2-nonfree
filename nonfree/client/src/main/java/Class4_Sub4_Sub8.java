import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class4_Sub4_Sub8 extends Class4_Sub4 {

	@OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!k", name = "N", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!k", name = "pb", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!k", name = "rb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!k", name = "Hb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!k", name = "Pb", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "I")
	private int anInt1483 = -1;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	public int anInt1485 = -1;

	@OriginalMember(owner = "client!k", name = "R", descriptor = "I")
	private int anInt1491 = 0;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	private int anInt1496 = 128;

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
	private int anInt1497 = 128;

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
	public int anInt1498 = 1;

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
	public int anInt1500 = 2;

	@OriginalMember(owner = "client!k", name = "mb", descriptor = "Lclient!v;")
	public Class76 aClass76_636 = Static30.aClass76_609;

	@OriginalMember(owner = "client!k", name = "qb", descriptor = "I")
	public int anInt1506 = 0;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!k", name = "eb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!k", name = "nb", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!k", name = "Ab", descriptor = "I")
	private int anInt1515 = 0;

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
	public int anInt1499 = 0;

	@OriginalMember(owner = "client!k", name = "Bb", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!k", name = "H", descriptor = "I")
	public int anInt1484 = 0;

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	private int anInt1495 = 0;

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "[Lclient!v;")
	public final Class76[] aClass76Array13 = new Class76[5];

	@OriginalMember(owner = "client!k", name = "ub", descriptor = "I")
	public int anInt1509 = -1;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "I")
	private int anInt1492 = -1;

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	public int anInt1487 = -1;

	@OriginalMember(owner = "client!k", name = "Cb", descriptor = "I")
	private int anInt1516 = 128;

	@OriginalMember(owner = "client!k", name = "Db", descriptor = "I")
	private int anInt1517 = -1;

	@OriginalMember(owner = "client!k", name = "Ib", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!k", name = "Eb", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
	private int anInt1501 = 0;

	@OriginalMember(owner = "client!k", name = "kb", descriptor = "I")
	public int anInt1503 = 16;

	@OriginalMember(owner = "client!k", name = "wb", descriptor = "I")
	public int anInt1511 = -1;

	@OriginalMember(owner = "client!k", name = "Gb", descriptor = "I")
	public int anInt1519 = 0;

	@OriginalMember(owner = "client!k", name = "ob", descriptor = "I")
	public int anInt1505 = 1;

	@OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
	private int anInt1508 = 0;

	@OriginalMember(owner = "client!k", name = "Jb", descriptor = "I")
	public int anInt1520 = -1;

	@OriginalMember(owner = "client!k", name = "Rb", descriptor = "I")
	public int anInt1527 = -1;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!kc;II[[IIII)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(20) long local20;
		if (this.anIntArray191 == null) {
			local20 = arg0 + (this.anInt1525 << 10);
		} else {
			local20 = (arg7 << 3) + (this.anInt1525 << 10) + arg0;
		}
		@Pc(36) Class4_Sub4_Sub3_Sub7 local36 = (Class4_Sub4_Sub3_Sub7) Static133.aClass72_29.method1781(local20);
		if (local36 == null) {
			@Pc(44) Class4_Sub4_Sub3_Sub5 local44 = this.method1002(arg0, arg7);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method1652(this.anInt1495 + 64, 768 - -(this.anInt1491 * 5), -50, -10, -50);
			Static133.aClass72_29.method1783(local36, local20);
		}
		if (arg2 == null && this.anInt1483 == -1) {
			return local36;
		}
		if (arg2 == null) {
			local36 = local36.method1771(true);
		} else {
			local36 = arg2.method1033(arg4, local36, arg0);
		}
		if (this.anInt1483 >= 0) {
			local36 = local36.method1775(arg5, arg3, arg1, arg6, false, this.anInt1483);
		}
		return local36;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)Lclient!k;")
	public Class4_Sub4_Sub8 method994() {
		@Pc(5) int local5 = -1;
		if (this.anInt1492 != -1) {
			local5 = Static67.method1125(this.anInt1492);
		} else if (this.anInt1517 != -1) {
			local5 = Static124.anIntArray393[this.anInt1517];
		}
		return local5 < 0 || this.anIntArray192.length <= local5 || this.anIntArray192[local5] == -1 ? null : Static104.method1600(this.anIntArray192[local5]);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLclient!ne;)V")
	public void method995(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method599();
			if (local5 == 0) {
				return;
			}
			this.method1006(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
	public boolean method996(@OriginalArg(1) int arg0) {
		if (this.anIntArray191 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.anIntArray191.length; local57++) {
				if (arg0 == this.anIntArray191[local57]) {
					return Static126.aClass17_41.method300(this.anIntArray190[local57] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray190 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(30) boolean local30 = true;
			for (@Pc(32) int local32 = 0; local32 < this.anIntArray190.length; local32++) {
				local30 &= Static126.aClass17_41.method300(this.anIntArray190[local32] & 0xFFFF, 0);
			}
			return local30;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)Z")
	public boolean method998() {
		if (this.anIntArray192 == null) {
			return this.anInt1509 != -1 || this.anIntArray189 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray192.length; local21++) {
			if (this.anIntArray192[local21] != -1) {
				@Pc(37) Class4_Sub4_Sub8 local37 = Static104.method1600(this.anIntArray192[local21]);
				if (local37.anInt1509 != -1 || local37.anIntArray189 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
	public void method999() {
		if (this.anInt1511 == -1) {
			this.anInt1511 = 0;
			if (this.anIntArray190 != null && (this.anIntArray191 == null || this.anIntArray191[0] == 10)) {
				this.anInt1511 = 1;
			}
			for (@Pc(26) int local26 = 0; local26 < 5; local26++) {
				if (this.aClass76Array13[local26] != null) {
					this.anInt1511 = 1;
				}
			}
		}
		if (this.anInt1520 == -1) {
			this.anInt1520 = this.anInt1500 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lclient!sd;")
	private Class4_Sub4_Sub3_Sub5 method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub4_Sub3_Sub5 local12 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(52) int local52;
		@Pc(58) int local58;
		if (this.anIntArray191 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray190 == null) {
				return null;
			}
			local30 = this.aBoolean95;
			local34 = this.anIntArray190.length;
			if (arg1 == 2 && arg0 > 3) {
				local30 = !local30;
			}
			for (local52 = 0; local52 < local34; local52++) {
				local58 = this.anIntArray190[local52];
				if (local30) {
					local58 += 65536;
				}
				local12 = (Class4_Sub4_Sub3_Sub5) Static115.aClass72_26.method1781((long) local58);
				if (local12 == null) {
					local12 = Static108.method1648(Static126.aClass17_41, local58 & 0xFFFF);
					if (local12 == null) {
						return null;
					}
					if (local30) {
						local12.method1641();
					}
					Static115.aClass72_26.method1783(local12, (long) local58);
				}
				if (local34 > 1) {
					Static34.aClass4_Sub4_Sub3_Sub5Array1[local52] = local12;
				}
			}
			if (local34 > 1) {
				local12 = new Class4_Sub4_Sub3_Sub5(Static34.aClass4_Sub4_Sub3_Sub5Array1, local34);
			}
		} else {
			@Pc(117) int local117 = -1;
			for (local34 = 0; local34 < this.anIntArray191.length; local34++) {
				if (this.anIntArray191[local34] == arg1) {
					local117 = local34;
					break;
				}
			}
			if (local117 == -1) {
				return null;
			}
			local52 = this.anIntArray190[local117];
			@Pc(164) boolean local164 = this.aBoolean95 ^ arg0 > 3;
			if (local164) {
				local52 += 65536;
			}
			local12 = (Class4_Sub4_Sub3_Sub5) Static115.aClass72_26.method1781((long) local52);
			if (local12 == null) {
				local12 = Static108.method1648(Static126.aClass17_41, local52 & 0xFFFF);
				if (local12 == null) {
					return null;
				}
				if (local164) {
					local12.method1641();
				}
				Static115.aClass72_26.method1783(local12, (long) local52);
			}
		}
		if (this.anInt1516 == 128 && this.anInt1497 == 128 && this.anInt1496 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(238) boolean local238;
		if (this.anInt1515 == 0 && this.anInt1508 == 0 && this.anInt1501 == 0) {
			local238 = false;
		} else {
			local238 = true;
		}
		@Pc(272) Class4_Sub4_Sub3_Sub5 local272 = new Class4_Sub4_Sub3_Sub5(local12, arg0 == 0 && !local30 && !local238, this.aShortArray9 == null, this.aShortArray10 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local272.method1643();
			local272.method1645(45, 0, -45);
		}
		@Pc(292) int local292 = arg0 & 0x3;
		if (local292 == 1) {
			local272.method1642();
		} else if (local292 == 2) {
			local272.method1654();
		} else if (local292 == 3) {
			local272.method1659();
		}
		if (this.aShortArray9 != null) {
			for (local58 = 0; local58 < this.aShortArray9.length; local58++) {
				local272.method1657(this.aShortArray9[local58], this.aShortArray11[local58]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local58 = 0; local58 < this.aShortArray10.length; local58++) {
				local272.method1655(this.aShortArray10[local58], this.aShortArray12[local58]);
			}
		}
		if (local30) {
			local272.method1646(this.anInt1516, this.anInt1497, this.anInt1496);
		}
		if (local238) {
			local272.method1645(this.anInt1515, this.anInt1508, this.anInt1501);
		}
		return local272;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII[[II)Lclient!jd;")
	public Class4_Sub4_Sub3 method1003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray191 == null) {
			local16 = (this.anInt1525 << 10) + arg2;
		} else {
			local16 = (arg3 << 3) + ((this.anInt1525 << 10) + arg2);
		}
		@Pc(37) Class4_Sub4_Sub3 local37 = (Class4_Sub4_Sub3) Static35.aClass72_15.method1781(local16);
		if (local37 == null) {
			@Pc(47) Class4_Sub4_Sub3_Sub5 local47 = this.method1002(arg2, arg3);
			if (local47 == null) {
				return null;
			}
			if (this.aBoolean93) {
				local37 = local47;
				local47.aShort1 = (short) (this.anInt1495 + 64);
				local47.aShort2 = (short) (this.anInt1491 * 5 + 768);
				local47.method1658();
			} else {
				local37 = local47.method1652(this.anInt1495 + 64, this.anInt1491 * 5 + 768, -50, -10, -50);
			}
			Static35.aClass72_15.method1783(local37, local16);
		}
		if (this.aBoolean93) {
			local37 = ((Class4_Sub4_Sub3_Sub5) local37).method1663();
		}
		if (this.anInt1483 >= 0) {
			if (local37 instanceof Class4_Sub4_Sub3_Sub7) {
				local37 = ((Class4_Sub4_Sub3_Sub7) local37).method1775(arg4, arg5, arg1, arg0, true, this.anInt1483);
			} else if (local37 instanceof Class4_Sub4_Sub3_Sub5) {
				local37 = ((Class4_Sub4_Sub3_Sub5) local37).method1660(arg4, arg5, arg1, arg0, this.anInt1483);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!ne;Z)V")
	private void method1006(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		@Pc(20) int local20;
		@Pc(46) int local46;
		if (arg0 == 1) {
			local20 = arg1.method599();
			if (local20 > 0) {
				if (this.anIntArray190 == null || Static115.aBoolean145) {
					this.anIntArray190 = new int[local20];
					this.anIntArray191 = new int[local20];
					for (local46 = 0; local46 < local20; local46++) {
						this.anIntArray190[local46] = arg1.method604();
						this.anIntArray191[local46] = arg1.method599();
					}
				} else {
					arg1.anInt931 += local20 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass76_636 = arg1.method581();
		} else if (arg0 == 5) {
			local20 = arg1.method599();
			if (local20 > 0) {
				if (this.anIntArray190 == null || Static115.aBoolean145) {
					this.anIntArray190 = new int[local20];
					this.anIntArray191 = null;
					for (local46 = 0; local46 < local20; local46++) {
						this.anIntArray190[local46] = arg1.method604();
					}
				} else {
					arg1.anInt931 += local20 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1498 = arg1.method599();
		} else if (arg0 == 15) {
			this.anInt1505 = arg1.method599();
		} else if (arg0 == 17) {
			this.aBoolean89 = false;
			this.anInt1500 = 0;
		} else if (arg0 == 18) {
			this.aBoolean89 = false;
		} else if (arg0 == 19) {
			this.anInt1511 = arg1.method599();
		} else if (arg0 == 21) {
			this.anInt1483 = 0;
		} else if (arg0 == 22) {
			this.aBoolean93 = true;
		} else if (arg0 == 23) {
			this.aBoolean92 = true;
		} else if (arg0 == 24) {
			this.anInt1487 = arg1.method604();
			if (this.anInt1487 == 65535) {
				this.anInt1487 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt1500 = 1;
		} else if (arg0 == 28) {
			this.anInt1503 = arg1.method599();
		} else if (arg0 == 29) {
			this.anInt1495 = arg1.method579();
		} else if (arg0 == 39) {
			this.anInt1491 = arg1.method579() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass76Array13[arg0 - 30] = arg1.method581();
			if (this.aClass76Array13[arg0 - 30].method1882(Static95.aClass76_990)) {
				this.aClass76Array13[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local20 = arg1.method599();
			this.aShortArray9 = new short[local20];
			this.aShortArray11 = new short[local20];
			for (local46 = 0; local46 < local20; local46++) {
				this.aShortArray9[local46] = (short) arg1.method604();
				this.aShortArray11[local46] = (short) arg1.method604();
			}
		} else if (arg0 == 41) {
			local20 = arg1.method599();
			this.aShortArray10 = new short[local20];
			this.aShortArray12 = new short[local20];
			for (local46 = 0; local46 < local20; local46++) {
				this.aShortArray10[local46] = (short) arg1.method604();
				this.aShortArray12[local46] = (short) arg1.method604();
			}
		} else if (arg0 == 60) {
			this.anInt1527 = arg1.method604();
		} else if (arg0 == 62) {
			this.aBoolean95 = true;
		} else if (arg0 == 64) {
			this.aBoolean91 = false;
		} else if (arg0 == 65) {
			this.anInt1516 = arg1.method604();
		} else if (arg0 == 66) {
			this.anInt1497 = arg1.method604();
		} else if (arg0 == 67) {
			this.anInt1496 = arg1.method604();
		} else if (arg0 == 68) {
			this.anInt1485 = arg1.method604();
		} else if (arg0 == 69) {
			this.anInt1506 = arg1.method599();
		} else if (arg0 == 70) {
			this.anInt1515 = arg1.method574();
		} else if (arg0 == 71) {
			this.anInt1508 = arg1.method574();
		} else if (arg0 == 72) {
			this.anInt1501 = arg1.method574();
		} else if (arg0 == 73) {
			this.aBoolean94 = true;
		} else if (arg0 == 74) {
			this.aBoolean90 = true;
		} else if (arg0 == 75) {
			this.anInt1520 = arg1.method599();
		} else if (arg0 == 77) {
			this.anInt1492 = arg1.method604();
			if (this.anInt1492 == 65535) {
				this.anInt1492 = -1;
			}
			this.anInt1517 = arg1.method604();
			if (this.anInt1517 == 65535) {
				this.anInt1517 = -1;
			}
			local20 = arg1.method599();
			this.anIntArray192 = new int[local20 + 1];
			for (local46 = 0; local46 <= local20; local46++) {
				this.anIntArray192[local46] = arg1.method604();
				if (this.anIntArray192[local46] == 65535) {
					this.anIntArray192[local46] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt1509 = arg1.method604();
			this.anInt1499 = arg1.method599();
		} else if (arg0 == 79) {
			this.anInt1519 = arg1.method604();
			this.anInt1484 = arg1.method604();
			this.anInt1499 = arg1.method599();
			local20 = arg1.method599();
			this.anIntArray189 = new int[local20];
			for (local46 = 0; local46 < local20; local46++) {
				this.anIntArray189[local46] = arg1.method604();
			}
		} else if (arg0 == 81) {
			this.anInt1483 = arg1.method599() * 256;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II[[IIIII)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1007(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18;
		if (this.anIntArray191 == null) {
			local18 = arg2 + (this.anInt1525 << 10);
		} else {
			local18 = arg2 + (arg4 << 3) + (this.anInt1525 << 10);
		}
		@Pc(34) Class4_Sub4_Sub3_Sub7 local34 = (Class4_Sub4_Sub3_Sub7) Static133.aClass72_29.method1781(local18);
		if (local34 == null) {
			@Pc(44) Class4_Sub4_Sub3_Sub5 local44 = this.method1002(arg2, arg4);
			if (local44 == null) {
				return null;
			}
			local34 = local44.method1652(this.anInt1495 + 64, this.anInt1491 * 5 + 768, -50, -10, -50);
			Static133.aClass72_29.method1783(local34, local18);
		}
		if (this.anInt1483 >= 0) {
			local34 = local34.method1775(arg1, arg0, arg5, arg3, true, this.anInt1483);
		}
		return local34;
	}

	@OriginalMember(owner = "client!k", name = "i", descriptor = "(I)Z")
	public boolean method1008() {
		if (this.anIntArray190 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray190.length; local14++) {
			local12 &= Static126.aClass17_41.method300(this.anIntArray190[local14] & 0xFFFF, 0);
		}
		return local12;
	}
}
