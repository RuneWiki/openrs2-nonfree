import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class52 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private int anInt1729;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	private int anInt1730;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public int anInt1731;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	public int anInt1735;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt1737;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	public int anInt1739;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public int anInt1741;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "I")
	private int anInt1745;

	@OriginalMember(owner = "client!el", name = "E", descriptor = "I")
	private int anInt1747;

	@OriginalMember(owner = "client!el", name = "M", descriptor = "I")
	public int anInt1754;

	@OriginalMember(owner = "client!el", name = "N", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	public int anInt1738 = -1;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	private int anInt1740 = -1;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	public int anInt1743 = -1;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public int anInt1736 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	private int anInt1728 = -1;

	@OriginalMember(owner = "client!el", name = "B", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray25 = new String[5];

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public int anInt1733 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	private int anInt1742 = -1;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private int anInt1732 = -1;

	@OriginalMember(owner = "client!el", name = "F", descriptor = "I")
	public int anInt1748 = -1;

	@OriginalMember(owner = "client!el", name = "H", descriptor = "I")
	private int anInt1750 = -1;

	@OriginalMember(owner = "client!el", name = "G", descriptor = "I")
	public int anInt1749 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
	public int anInt1756 = -1;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!el", name = "C", descriptor = "Z")
	public boolean aBoolean112 = true;

	@OriginalMember(owner = "client!el", name = "J", descriptor = "Z")
	public boolean aBoolean113 = true;

	@OriginalMember(owner = "client!el", name = "I", descriptor = "I")
	public int anInt1751 = 0;

	@OriginalMember(owner = "client!el", name = "S", descriptor = "I")
	public int anInt1758 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
	public boolean method1767() {
		if (this.anInt1728 == -1 && this.anInt1742 == -1) {
			return true;
		}
		@Pc(35) int local35;
		if (this.anInt1728 == -1) {
			local35 = Static120.method2561(this.anInt1742);
		} else {
			local35 = Static102.anIntArray211[this.anInt1728];
		}
		if (this.anInt1729 > local35 || local35 > this.anInt1730) {
			return false;
		} else if (this.anInt1732 == -1 && this.anInt1740 == -1) {
			return true;
		} else {
			if (this.anInt1732 == -1) {
				local35 = Static120.method2561(this.anInt1740);
			} else {
				local35 = Static102.anIntArray211[this.anInt1732];
			}
			return this.anInt1747 <= local35 && local35 <= this.anInt1745;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!jg;I)V")
	private void method1771(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1743 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt1738 = arg0.method2498();
		} else if (arg1 == 3) {
			this.aString65 = arg0.method2496();
		} else if (arg1 == 4) {
			this.anInt1735 = arg0.method2501();
		} else if (arg1 == 5) {
			this.anInt1748 = arg0.method2501();
		} else if (arg1 == 6) {
			this.anInt1751 = arg0.method2548();
		} else {
			@Pc(109) int local109;
			if (arg1 == 7) {
				local109 = arg0.method2548();
				if ((local109 & 0x1) == 0) {
					this.aBoolean111 = false;
				}
				if ((local109 & 0x2) == 2) {
					this.aBoolean110 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean112 = arg0.method2548() == 1;
			} else if (arg1 == 9) {
				this.anInt1742 = arg0.method2498();
				if (this.anInt1742 == 65535) {
					this.anInt1742 = -1;
				}
				this.anInt1728 = arg0.method2498();
				if (this.anInt1728 == 65535) {
					this.anInt1728 = -1;
				}
				this.anInt1729 = arg0.method2510();
				this.anInt1730 = arg0.method2510();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray25[arg1 - 10] = arg0.method2496();
			} else if (arg1 == 15) {
				local109 = arg0.method2548();
				this.anIntArray128 = new int[local109 * 2];
				for (@Pc(117) int local117 = 0; local117 < local109 * 2; local117++) {
					this.anIntArray128[local117] = arg0.method2502();
				}
				this.anInt1737 = arg0.method2510();
				this.anInt1754 = arg0.method2510();
			} else if (arg1 == 16) {
				this.aBoolean113 = false;
			} else if (arg1 == 17) {
				this.aString64 = arg0.method2496();
			} else if (arg1 == 18) {
				this.anInt1750 = arg0.method2498();
			} else if (arg1 == 19) {
				this.anInt1756 = arg0.method2498();
			} else if (arg1 == 20) {
				this.anInt1740 = arg0.method2498();
				if (this.anInt1740 == 65535) {
					this.anInt1740 = -1;
				}
				this.anInt1732 = arg0.method2498();
				if (this.anInt1732 == 65535) {
					this.anInt1732 = -1;
				}
				this.anInt1747 = arg0.method2510();
				this.anInt1745 = arg0.method2510();
			} else if (arg1 == 21) {
				this.anInt1739 = arg0.method2510();
			} else if (arg1 == 22) {
				this.anInt1731 = arg0.method2510();
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!e;Z)Lclient!gl;")
	public Class2 method1772(@OriginalArg(1) Class46 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1738 : this.anInt1743;
		@Pc(18) int local18 = local11 | arg0.anInt5722 << 29;
		@Pc(25) Class2 local25 = (Class2) Static348.aClass11_123.method209((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static161.aClass143_67.method3736(local11)) {
			@Pc(49) Class207 local49 = Static368.method5811(Static161.aClass143_67, local11, 0);
			if (local49 != null) {
				local25 = arg0.method5157(local49);
				Static348.aClass11_123.method219((long) local18, local25);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public void method1773() {
		if (this.anIntArray128 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray128.length; local15 += 2) {
			if (this.anIntArray128[local15] < this.anInt1749) {
				this.anInt1749 = this.anIntArray128[local15];
			} else if (this.anInt1733 < this.anIntArray128[local15]) {
				this.anInt1733 = this.anIntArray128[local15];
			}
			if (this.anInt1736 > this.anIntArray128[local15 + 1]) {
				this.anInt1736 = this.anIntArray128[local15 + 1];
			} else if (this.anInt1758 < this.anIntArray128[local15 + 1]) {
				this.anInt1758 = this.anIntArray128[local15 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method1774(@OriginalArg(0) Class14_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2548();
			if (local9 == 0) {
				return;
			}
			this.method1771(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!e;)Lclient!gl;")
	public Class2 method1775(@OriginalArg(1) Class46 arg0) {
		@Pc(18) Class2 local18 = (Class2) Static348.aClass11_123.method209((long) (this.anInt1750 | 0x20000 | arg0.anInt5722 << 29));
		if (local18 != null) {
			return local18;
		}
		Static161.aClass143_67.method3736(this.anInt1750);
		@Pc(39) Class207 local39 = Static368.method5811(Static161.aClass143_67, this.anInt1750, 0);
		if (local39 != null) {
			local18 = arg0.method5157(local39);
			Static348.aClass11_123.method219((long) (arg0.anInt5722 << 29 | this.anInt1750 | 0x20000), local18);
		}
		return local18;
	}
}
