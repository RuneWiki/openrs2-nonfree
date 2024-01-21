import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!g", name = "F", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	public int anInt1810;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!g", name = "Gb", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!g", name = "M", descriptor = "I")
	public int anInt1809 = -1;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "I")
	public int anInt1813 = 1;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!g", name = "V", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	private int anInt1807 = 0;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "I")
	public int anInt1806 = 16;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "I")
	private int anInt1811 = 0;

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
	private int anInt1826 = -1;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
	private int anInt1825 = 128;

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!g", name = "ub", descriptor = "I")
	private int anInt1830 = 128;

	@OriginalMember(owner = "client!g", name = "wb", descriptor = "I")
	public int anInt1832 = -1;

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "Z")
	public boolean aBoolean67 = true;

	@OriginalMember(owner = "client!g", name = "Db", descriptor = "I")
	private int anInt1836 = 0;

	@OriginalMember(owner = "client!g", name = "Eb", descriptor = "Lclient!rf;")
	public Class70 aClass70_573 = Static33.aClass70_358;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
	private int anInt1816 = -1;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "I")
	private int anInt1814 = -1;

	@OriginalMember(owner = "client!g", name = "Bb", descriptor = "[Lclient!rf;")
	public final Class70[] aClass70Array9 = new Class70[5];

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	public int anInt1818 = 1;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "I")
	public int anInt1808 = 0;

	@OriginalMember(owner = "client!g", name = "Cb", descriptor = "I")
	public int anInt1835 = -1;

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
	private int anInt1824 = 0;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	private int anInt1817 = 128;

	@OriginalMember(owner = "client!g", name = "Hb", descriptor = "I")
	public int anInt1838 = 0;

	@OriginalMember(owner = "client!g", name = "Ab", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!g", name = "yb", descriptor = "I")
	public int anInt1833 = 0;

	@OriginalMember(owner = "client!g", name = "sb", descriptor = "I")
	private int anInt1828 = 0;

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!g", name = "Mb", descriptor = "I")
	public int anInt1841 = 0;

	@OriginalMember(owner = "client!g", name = "Nb", descriptor = "I")
	public int anInt1842 = 2;

	@OriginalMember(owner = "client!g", name = "Qb", descriptor = "I")
	public int anInt1844 = -1;

	@OriginalMember(owner = "client!g", name = "Rb", descriptor = "I")
	public int anInt1845 = -1;

	@OriginalMember(owner = "client!g", name = "Pb", descriptor = "I")
	public int anInt1843 = -1;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)Lclient!g;")
	public Class1_Sub1_Sub7 method1395() {
		@Pc(14) int local14 = -1;
		if (this.anInt1826 != -1) {
			local14 = Static79.method1809(this.anInt1826);
		} else if (this.anInt1814 != -1) {
			local14 = Static133.anIntArray330[this.anInt1814];
		}
		return local14 < 0 || this.anIntArray186.length <= local14 || this.anIntArray186[local14] == -1 ? null : Static176.method3433(this.anIntArray186[local14]);
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
	public void method1396() {
		if (this.anInt1809 == -1) {
			this.anInt1809 = 0;
			if (this.anIntArray188 != null && (this.anIntArray184 == null || this.anIntArray184[0] == 10)) {
				this.anInt1809 = 1;
			}
			for (@Pc(36) int local36 = 0; local36 < 5; local36++) {
				if (this.aClass70Array9[local36] != null) {
					this.anInt1809 = 1;
				}
			}
		}
		if (this.anInt1843 == -1) {
			this.anInt1843 = this.anInt1842 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII[[III)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method1397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) long local23;
		if (this.anIntArray184 == null) {
			local23 = (this.anInt1810 << 10) + arg5;
		} else {
			local23 = arg5 + (arg1 << 3) + (this.anInt1810 << 10);
		}
		@Pc(40) Class1_Sub1_Sub4_Sub1 local40 = (Class1_Sub1_Sub4_Sub1) Static104.aClass25_16.method1302(local23);
		if (local40 == null) {
			@Pc(48) Class1_Sub1_Sub4_Sub3 local48 = this.method1404(arg1, arg5);
			if (local48 == null) {
				return null;
			}
			local40 = local48.method1135(this.anInt1807 + 64, this.anInt1828 * 5 + 768, -50, -10, -50, ~this.anInt1816 <= -1);
			Static104.aClass25_16.method1299(local40, local23);
		}
		if (this.anInt1816 >= 0) {
			local40 = local40.method731(arg3, arg0, arg2, arg4, true, this.anInt1816);
		}
		return local40;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fa;II)V")
	private void method1398(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(180) int local180;
		@Pc(190) int local190;
		if (arg1 == 1) {
			local180 = arg0.method1234();
			if (local180 > 0) {
				if (this.anIntArray188 == null || Static162.aBoolean166) {
					this.anIntArray184 = new int[local180];
					this.anIntArray188 = new int[local180];
					for (local190 = 0; local190 < local180; local190++) {
						this.anIntArray188[local190] = arg0.method1280();
						this.anIntArray184[local190] = arg0.method1234();
					}
				} else {
					arg0.anInt1592 += local180 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass70_573 = arg0.method1253();
		} else if (arg1 == 5) {
			local180 = arg0.method1234();
			if (local180 > 0) {
				if (this.anIntArray188 != null && !Static162.aBoolean166) {
					arg0.anInt1592 += local180 * 2;
					return;
				}
				this.anIntArray188 = new int[local180];
				this.anIntArray184 = null;
				for (local190 = 0; local190 < local180; local190++) {
					this.anIntArray188[local190] = arg0.method1280();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt1818 = arg0.method1234();
			return;
		} else if (arg1 == 15) {
			this.anInt1813 = arg0.method1234();
			return;
		} else if (arg1 == 17) {
			this.anInt1842 = 0;
			this.aBoolean67 = false;
			return;
		} else if (arg1 == 18) {
			this.aBoolean67 = false;
			return;
		} else if (arg1 == 19) {
			this.anInt1809 = arg0.method1234();
			return;
		} else if (arg1 == 21) {
			this.anInt1816 = 0;
			return;
		} else if (arg1 == 22) {
			this.aBoolean68 = true;
			return;
		} else if (arg1 == 23) {
			this.aBoolean65 = true;
			return;
		} else {
			if (arg1 == 24) {
				this.anInt1832 = arg0.method1280();
				if (this.anInt1832 == 65535) {
					this.anInt1832 = -1;
					return;
				}
			} else if (arg1 == 27) {
				this.anInt1842 = 1;
			} else if (arg1 == 28) {
				this.anInt1806 = arg0.method1234();
				return;
			} else if (arg1 == 29) {
				this.anInt1807 = arg0.method1243();
				return;
			} else if (arg1 == 39) {
				this.anInt1828 = arg0.method1243() * 5;
				return;
			} else {
				if (arg1 >= 30 && arg1 < 35) {
					this.aClass70Array9[arg1 - 30] = arg0.method1253();
					if (this.aClass70Array9[arg1 - 30].method2905(Static67.aClass70_646)) {
						this.aClass70Array9[arg1 - 30] = null;
						return;
					}
				} else if (arg1 == 40) {
					local180 = arg0.method1234();
					this.aShortArray19 = new short[local180];
					this.aShortArray20 = new short[local180];
					for (local190 = 0; local190 < local180; local190++) {
						this.aShortArray20[local190] = (short) arg0.method1280();
						this.aShortArray19[local190] = (short) arg0.method1280();
					}
				} else if (arg1 == 41) {
					local180 = arg0.method1234();
					this.aShortArray22 = new short[local180];
					this.aShortArray21 = new short[local180];
					for (local190 = 0; local190 < local180; local190++) {
						this.aShortArray21[local190] = (short) arg0.method1280();
						this.aShortArray22[local190] = (short) arg0.method1280();
					}
					return;
				} else if (arg1 == 60) {
					this.anInt1835 = arg0.method1280();
					return;
				} else if (arg1 == 62) {
					this.aBoolean63 = true;
					return;
				} else if (arg1 == 64) {
					this.aBoolean69 = false;
					return;
				} else if (arg1 == 65) {
					this.anInt1817 = arg0.method1280();
					return;
				} else if (arg1 == 66) {
					this.anInt1830 = arg0.method1280();
					return;
				} else if (arg1 == 67) {
					this.anInt1825 = arg0.method1280();
					return;
				} else if (arg1 == 68) {
					this.anInt1844 = arg0.method1280();
					return;
				} else if (arg1 == 69) {
					this.anInt1833 = arg0.method1234();
					return;
				} else if (arg1 == 70) {
					this.anInt1836 = arg0.method1279();
					return;
				} else if (arg1 == 71) {
					this.anInt1824 = arg0.method1279();
					return;
				} else if (arg1 == 72) {
					this.anInt1811 = arg0.method1279();
					return;
				} else if (arg1 == 73) {
					this.aBoolean64 = true;
					return;
				} else if (arg1 == 74) {
					this.aBoolean66 = true;
					return;
				} else if (arg1 == 75) {
					this.anInt1843 = arg0.method1234();
					return;
				} else if (arg1 == 77) {
					this.anInt1826 = arg0.method1280();
					if (this.anInt1826 == 65535) {
						this.anInt1826 = -1;
					}
					this.anInt1814 = arg0.method1280();
					if (this.anInt1814 == 65535) {
						this.anInt1814 = -1;
					}
					local180 = arg0.method1234();
					this.anIntArray186 = new int[local180 + 1];
					for (local190 = 0; local190 <= local180; local190++) {
						this.anIntArray186[local190] = arg0.method1280();
						if (this.anIntArray186[local190] == 65535) {
							this.anIntArray186[local190] = -1;
						}
					}
					return;
				} else if (arg1 == 78) {
					this.anInt1845 = arg0.method1280();
					this.anInt1838 = arg0.method1234();
					return;
				} else {
					if (arg1 == 79) {
						this.anInt1841 = arg0.method1280();
						this.anInt1808 = arg0.method1280();
						this.anInt1838 = arg0.method1234();
						local180 = arg0.method1234();
						this.anIntArray185 = new int[local180];
						for (local190 = 0; local190 < local180; local190++) {
							this.anIntArray185[local190] = arg0.method1280();
						}
					} else if (arg1 == 81) {
						this.anInt1816 = arg0.method1234() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!re;I[[IIIIZ)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method1399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray184 == null) {
			local16 = arg3 + (this.anInt1810 << 10);
		} else {
			local16 = arg3 + (arg7 << 3) + (this.anInt1810 << 10);
		}
		@Pc(42) Class1_Sub1_Sub4_Sub1 local42 = (Class1_Sub1_Sub4_Sub1) Static85.aClass25_14.method1302(local16);
		if (local42 == null) {
			@Pc(50) Class1_Sub1_Sub4_Sub3 local50 = this.method1404(arg7, arg3);
			if (local50 == null) {
				return null;
			}
			local42 = local50.method1135(this.anInt1807 + 64, this.anInt1828 * 5 + 768, -50, -10, -50, true);
			Static85.aClass25_14.method1299(local42, local16);
		}
		if (arg2 == null && this.anInt1816 == -1) {
			return local42;
		}
		if (arg2 == null) {
			local42 = local42.method733(true);
		} else {
			local42 = arg2.method2880(local42, arg5, arg3);
		}
		if (this.anInt1816 >= 0) {
			local42 = local42.method731(arg4, arg1, arg0, arg6, false, this.anInt1816);
		}
		return local42;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)Z")
	public boolean method1400(@OriginalArg(1) int arg0) {
		if (this.anIntArray184 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.anIntArray184.length; local54++) {
				if (this.anIntArray184[local54] == arg0) {
					return Static74.aClass76_64.method3329(this.anIntArray188[local54] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray188 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(27) boolean local27 = true;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray188.length; local29++) {
				local27 &= Static74.aClass76_64.method3329(this.anIntArray188[local29] & 0xFFFF, 0);
			}
			return local27;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII[[IIB)Lclient!s;")
	public Class1_Sub1_Sub4 method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray184 == null) {
			local20 = (this.anInt1810 << 10) + arg5;
		} else {
			local20 = arg5 + (arg3 << 3) + (this.anInt1810 << 10);
		}
		@Pc(36) Class1_Sub1_Sub4 local36 = (Class1_Sub1_Sub4) Static110.aClass25_17.method1302(local20);
		if (local36 == null) {
			@Pc(44) Class1_Sub1_Sub4_Sub3 local44 = this.method1404(arg3, arg5);
			if (local44 == null) {
				return null;
			}
			if (this.aBoolean68) {
				local44.aShort25 = (short) (this.anInt1828 * 5 + 768);
				local44.aShort24 = (short) (this.anInt1807 + 64);
				local44.method1150();
				local36 = local44;
			} else {
				local36 = local44.method1135(this.anInt1807 + 64, this.anInt1828 * 5 + 768, -50, -10, -50, this.anInt1816 >= 0);
			}
			Static110.aClass25_17.method1299(local36, local20);
		}
		if (this.aBoolean68) {
			local36 = ((Class1_Sub1_Sub4_Sub3) local36).method1133();
		}
		if (this.anInt1816 >= 0) {
			if (local36 instanceof Class1_Sub1_Sub4_Sub1) {
				local36 = ((Class1_Sub1_Sub4_Sub1) local36).method731(arg4, arg0, arg2, arg1, true, this.anInt1816);
			} else if (local36 instanceof Class1_Sub1_Sub4_Sub3) {
				local36 = ((Class1_Sub1_Sub4_Sub3) local36).method1145(arg4, arg0, arg2, arg1, this.anInt1816);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!fa;)V")
	public void method1402(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1234();
			if (local9 == 0) {
				return;
			}
			this.method1398(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)Lclient!ei;")
	private Class1_Sub1_Sub4_Sub3 method1404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class1_Sub1_Sub4_Sub3 local3 = null;
		@Pc(6) boolean local6 = this.aBoolean63;
		if (arg0 == 2 && arg1 > 3) {
			local6 = !local6;
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		@Pc(63) int local63;
		if (this.anIntArray184 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray188 == null) {
				return null;
			}
			local29 = this.anIntArray188.length;
			for (local31 = 0; local31 < local29; local31++) {
				local63 = this.anIntArray188[local31];
				if (local6) {
					local63 += 65536;
				}
				local3 = (Class1_Sub1_Sub4_Sub3) Static172.aClass25_25.method1302((long) local63);
				if (local3 == null) {
					local3 = Static46.method1144(Static74.aClass76_64, local63 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local6) {
						local3.method1131();
					}
					Static172.aClass25_25.method1299(local3, (long) local63);
				}
				if (local29 > 1) {
					Static53.aClass1_Sub1_Sub4_Sub3Array1[local31] = local3;
				}
			}
			if (local29 > 1) {
				local3 = new Class1_Sub1_Sub4_Sub3(Static53.aClass1_Sub1_Sub4_Sub3Array1, local29);
			}
		} else {
			local29 = -1;
			for (local31 = 0; local31 < this.anIntArray184.length; local31++) {
				if (arg0 == this.anIntArray184[local31]) {
					local29 = local31;
					break;
				}
			}
			if (local29 == -1) {
				return null;
			}
			local63 = this.anIntArray188[local29];
			if (local6) {
				local63 += 65536;
			}
			local3 = (Class1_Sub1_Sub4_Sub3) Static172.aClass25_25.method1302((long) local63);
			if (local3 == null) {
				local3 = Static46.method1144(Static74.aClass76_64, local63 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local6) {
					local3.method1131();
				}
				Static172.aClass25_25.method1299(local3, (long) local63);
			}
		}
		@Pc(196) boolean local196;
		if (this.anInt1817 == 128 && this.anInt1830 == 128 && this.anInt1825 == 128) {
			local196 = false;
		} else {
			local196 = true;
		}
		@Pc(217) boolean local217;
		if (this.anInt1836 == 0 && this.anInt1824 == 0 && this.anInt1811 == 0) {
			local217 = false;
		} else {
			local217 = true;
		}
		@Pc(253) Class1_Sub1_Sub4_Sub3 local253 = new Class1_Sub1_Sub4_Sub3(local3, arg1 == 0 && !local196 && !local217 && !local6, this.aShortArray20 == null, this.aShortArray21 == null, true);
		if (local6) {
			local253.method1143();
		}
		if (arg0 == 4 && arg1 > 3) {
			local253.method1136();
			local253.method1147(45, 0, -45);
		}
		@Pc(279) int local279 = arg1 & 0x3;
		if (local279 == 1) {
			local253.method1129();
		} else if (local279 == 2) {
			local253.method1139();
		} else if (local279 == 3) {
			local253.method1128();
		}
		@Pc(307) int local307;
		if (this.aShortArray20 != null) {
			for (local307 = 0; local307 < this.aShortArray20.length; local307++) {
				local253.method1146(this.aShortArray20[local307], this.aShortArray19[local307]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local307 = 0; local307 < this.aShortArray21.length; local307++) {
				local253.method1149(this.aShortArray21[local307], this.aShortArray22[local307]);
			}
		}
		if (local196) {
			local253.method1140(this.anInt1817, this.anInt1830, this.anInt1825);
		}
		if (local217) {
			local253.method1147(this.anInt1836, this.anInt1824, this.anInt1811);
		}
		return local253;
	}

	@OriginalMember(owner = "client!g", name = "j", descriptor = "(I)Z")
	public boolean method1405() {
		if (this.anIntArray186 == null) {
			return this.anInt1845 != -1 || this.anIntArray185 != null;
		}
		for (@Pc(29) int local29 = 0; local29 < this.anIntArray186.length; local29++) {
			if (this.anIntArray186[local29] != -1) {
				@Pc(44) Class1_Sub1_Sub7 local44 = Static176.method3433(this.anIntArray186[local29]);
				if (local44.anInt1845 != -1 || local44.anIntArray185 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!g", name = "k", descriptor = "(I)Z")
	public boolean method1407() {
		if (this.anIntArray188 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray188.length; local20++) {
			local18 &= Static74.aClass76_64.method3329(this.anIntArray188[local20] & 0xFFFF, 0);
		}
		return local18;
	}
}
