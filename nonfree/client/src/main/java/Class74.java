import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class74 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
	private int anInt1728;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
	public int anInt1733;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
	public int anInt1738;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	private int anInt1743;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
	public int anInt1747;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
	public int anInt1751;

	@OriginalMember(owner = "client!fp", name = "bb", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	private int anInt1722 = -1;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	private int anInt1720 = -1;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
	private int anInt1726 = -1;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	public int anInt1727 = -1;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
	public int anInt1737 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
	private int anInt1736 = -1;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public int anInt1725 = -1;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
	public int anInt1735 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "Z")
	public boolean aBoolean121 = true;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
	public int anInt1740 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "Z")
	public boolean aBoolean124 = true;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
	public int anInt1745 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!fp", name = "X", descriptor = "I")
	public int anInt1754 = -1;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	public int anInt1748 = 0;

	@OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
	public int anInt1752 = -1;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	private int anInt1734 = -1;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!ii;)Lclient!cq;")
	public Class8 method1446(@OriginalArg(1) Class105 arg0) {
		@Pc(18) Class8 local18 = (Class8) Static302.aClass37_99.method915((long) (arg0.anInt4861 << 29 | this.anInt1736 | 0x20000));
		if (local18 != null) {
			return local18;
		}
		Static41.aClass134_20.method3005(this.anInt1736);
		@Pc(41) Class201 local41 = Static369.method5469(Static41.aClass134_20, this.anInt1736, 0);
		if (local41 != null) {
			local18 = arg0.method4238(local41);
			Static302.aClass37_99.method922((long) (this.anInt1736 | 0x20000 | arg0.anInt4861 << 29), local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)Z")
	public boolean method1448() {
		if (this.anInt1722 == -1 && this.anInt1720 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt1722 == -1) {
			local32 = Static318.method5453(this.anInt1720);
		} else {
			local32 = Static81.anIntArray119[this.anInt1722];
		}
		if (this.anInt1743 > local32 || local32 > this.anInt1758) {
			return false;
		} else if (this.anInt1726 == -1 && this.anInt1734 == -1) {
			return true;
		} else {
			if (this.anInt1726 == -1) {
				local32 = Static318.method5453(this.anInt1734);
			} else {
				local32 = Static81.anIntArray119[this.anInt1726];
			}
			return this.anInt1728 <= local32 && this.anInt1741 >= local32;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!nj;I)V")
	private void method1450(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1725 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt1752 = arg0.method5715();
		} else if (arg1 == 3) {
			this.aString71 = arg0.method5701();
		} else if (arg1 == 4) {
			this.anInt1723 = arg0.method5705();
		} else if (arg1 == 5) {
			this.anInt1754 = arg0.method5705();
		} else if (arg1 == 6) {
			this.anInt1748 = arg0.method5720();
		} else {
			@Pc(47) int local47;
			if (arg1 == 7) {
				local47 = arg0.method5720();
				if ((local47 & 0x2) == 2) {
					this.aBoolean122 = true;
				}
				if ((local47 & 0x1) == 0) {
					this.aBoolean125 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean124 = arg0.method5720() == 1;
			} else if (arg1 == 9) {
				this.anInt1720 = arg0.method5715();
				if (this.anInt1720 == 65535) {
					this.anInt1720 = -1;
				}
				this.anInt1722 = arg0.method5715();
				if (this.anInt1722 == 65535) {
					this.anInt1722 = -1;
				}
				this.anInt1743 = arg0.method5716();
				this.anInt1758 = arg0.method5716();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray14[arg1 - 10] = arg0.method5701();
			} else if (arg1 == 15) {
				local47 = arg0.method5720();
				this.anIntArray149 = new int[local47 * 2];
				for (@Pc(124) int local124 = 0; local124 < local47 * 2; local124++) {
					this.anIntArray149[local124] = arg0.method5691();
				}
				this.anInt1738 = arg0.method5716();
				this.anInt1747 = arg0.method5716();
			} else if (arg1 == 16) {
				this.aBoolean121 = false;
			} else if (arg1 == 17) {
				this.aString70 = arg0.method5701();
			} else if (arg1 == 18) {
				this.anInt1736 = arg0.method5715();
			} else if (arg1 == 19) {
				this.anInt1727 = arg0.method5715();
			} else if (arg1 == 20) {
				this.anInt1734 = arg0.method5715();
				if (this.anInt1734 == 65535) {
					this.anInt1734 = -1;
				}
				this.anInt1726 = arg0.method5715();
				if (this.anInt1726 == 65535) {
					this.anInt1726 = -1;
				}
				this.anInt1728 = arg0.method5716();
				this.anInt1741 = arg0.method5716();
			} else if (arg1 == 21) {
				this.anInt1733 = arg0.method5716();
			} else if (arg1 == 22) {
				this.anInt1751 = arg0.method5716();
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	public void method1453() {
		if (this.anIntArray149 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray149.length; local15 += 2) {
			if (this.anIntArray149[local15] < this.anInt1735) {
				this.anInt1735 = this.anIntArray149[local15];
			} else if (this.anIntArray149[local15] > this.anInt1737) {
				this.anInt1737 = this.anIntArray149[local15];
			}
			if (this.anInt1740 > this.anIntArray149[local15 + 1]) {
				this.anInt1740 = this.anIntArray149[local15 + 1];
			} else if (this.anInt1745 < this.anIntArray149[local15 + 1]) {
				this.anInt1745 = this.anIntArray149[local15 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method1457(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5720();
			if (local9 == 0) {
				return;
			}
			this.method1450(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLclient!ii;Z)Lclient!cq;")
	public Class8 method1458(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class105 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt1752 : this.anInt1725;
		@Pc(18) int local18 = local11 | arg1.anInt4861 << 29;
		@Pc(25) Class8 local25 = (Class8) Static302.aClass37_99.method915((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static41.aClass134_20.method3005(local11)) {
			@Pc(41) Class201 local41 = Static369.method5469(Static41.aClass134_20, local11, 0);
			if (local41 != null) {
				local25 = arg1.method4238(local41);
				Static302.aClass37_99.method922((long) local18, local25);
			}
			return local25;
		} else {
			return null;
		}
	}
}
