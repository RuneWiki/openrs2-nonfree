import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!rb", name = "qb", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!rb", name = "yb", descriptor = "I")
	public int anInt2570;

	@OriginalMember(owner = "client!rb", name = "Gb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
	private int anInt2555 = 128;

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
	public int anInt2552 = -1;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
	public int anInt2553 = -1;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "I")
	public int anInt2567 = -1;

	@OriginalMember(owner = "client!rb", name = "Bb", descriptor = "I")
	public int anInt2573 = 1;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	public int anInt2560 = -1;

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "I")
	private int anInt2565 = -1;

	@OriginalMember(owner = "client!rb", name = "Cb", descriptor = "I")
	public int anInt2574 = -1;

	@OriginalMember(owner = "client!rb", name = "wb", descriptor = "I")
	private int anInt2569 = 128;

	@OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
	private int anInt2572 = 0;

	@OriginalMember(owner = "client!rb", name = "Fb", descriptor = "I")
	public int anInt2576 = -1;

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "I")
	public int anInt2566 = 32;

	@OriginalMember(owner = "client!rb", name = "Hb", descriptor = "I")
	public int anInt2577 = -1;

	@OriginalMember(owner = "client!rb", name = "Ib", descriptor = "[Lclient!wd;")
	public final Class80[] aClass80Array15 = new Class80[5];

	@OriginalMember(owner = "client!rb", name = "Lb", descriptor = "I")
	private int anInt2579 = -1;

	@OriginalMember(owner = "client!rb", name = "Jb", descriptor = "I")
	private int anInt2578 = 0;

	@OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
	public int anInt2568 = -1;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "Lclient!wd;")
	public Class80 aClass80_979 = Static17.aClass80_232;

	@OriginalMember(owner = "client!rb", name = "Nb", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!rb", name = "Mb", descriptor = "I")
	public int anInt2580 = -1;

	@OriginalMember(owner = "client!rb", name = "Pb", descriptor = "Z")
	public boolean aBoolean192 = true;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!h;IILclient!h;B)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method1575(@OriginalArg(0) Class2_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub8 arg3) {
		if (this.anIntArray331 != null) {
			@Pc(12) Class2_Sub1_Sub13 local12 = this.method1582();
			return local12 == null ? null : local12.method1575(arg0, arg1, arg2, arg3);
		}
		@Pc(40) Class2_Sub1_Sub1_Sub2 local40 = (Class2_Sub1_Sub1_Sub2) Static25.aClass32_17.method887((long) this.anInt2570);
		if (local40 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray330.length; local46++) {
				if (!Static118.aClass11_43.method384(0, this.anIntArray330[local46])) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(76) Class2_Sub1_Sub1_Sub6[] local76 = new Class2_Sub1_Sub1_Sub6[this.anIntArray330.length];
			for (@Pc(78) int local78 = 0; local78 < this.anIntArray330.length; local78++) {
				local76[local78] = Static26.method540(Static118.aClass11_43, this.anIntArray330[local78]);
			}
			@Pc(109) Class2_Sub1_Sub1_Sub6 local109;
			if (local76.length == 1) {
				local109 = local76[0];
			} else {
				local109 = new Class2_Sub1_Sub1_Sub6(local76, local76.length);
			}
			if (this.aShortArray13 != null) {
				for (@Pc(120) int local120 = 0; local120 < this.aShortArray13.length; local120++) {
					local109.method559(this.aShortArray13[local120], this.aShortArray14[local120]);
				}
			}
			local40 = local109.method548(this.anInt2572 + 64, this.anInt2578 + 850, -30, -50, -30);
			Static25.aClass32_17.method880(local40, (long) this.anInt2570);
		}
		@Pc(171) Class2_Sub1_Sub1_Sub2 local171;
		if (arg0 != null && arg3 != null) {
			local171 = arg0.method741(arg2, local40, arg1, arg3);
		} else if (arg0 != null) {
			local171 = arg0.method737(local40, arg1);
		} else if (arg3 == null) {
			local171 = local40.method212(true);
		} else {
			local171 = arg3.method737(local40, arg2);
		}
		if (this.anInt2555 != 128 || this.anInt2569 != 128) {
			local171.method218(this.anInt2555, this.anInt2569, this.anInt2555);
		}
		return local171;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBLclient!wb;)V")
	private void method1576(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		@Pc(94) int local94;
		@Pc(100) int local100;
		if (arg0 == 1) {
			local94 = arg1.method1780();
			this.anIntArray330 = new int[local94];
			for (local100 = 0; local100 < local94; local100++) {
				this.anIntArray330[local100] = arg1.method1783();
			}
		} else if (arg0 == 2) {
			this.aClass80_979 = arg1.method1797();
		} else if (arg0 == 12) {
			this.anInt2573 = arg1.method1780();
		} else if (arg0 == 13) {
			this.anInt2580 = arg1.method1783();
		} else if (arg0 == 14) {
			this.anInt2576 = arg1.method1783();
		} else if (arg0 == 15) {
			this.anInt2574 = arg1.method1783();
			return;
		} else if (arg0 == 16) {
			this.anInt2577 = arg1.method1783();
			return;
		} else if (arg0 == 17) {
			this.anInt2576 = arg1.method1783();
			this.anInt2567 = arg1.method1783();
			this.anInt2553 = arg1.method1783();
			this.anInt2552 = arg1.method1783();
			return;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass80Array15[arg0 - 30] = arg1.method1797();
			if (this.aClass80Array15[arg0 - 30].method2006(Static102.aClass80_1010)) {
				this.aClass80Array15[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local94 = arg1.method1780();
			this.aShortArray13 = new short[local94];
			this.aShortArray14 = new short[local94];
			for (local100 = 0; local100 < local94; local100++) {
				this.aShortArray13[local100] = (short) arg1.method1783();
				this.aShortArray14[local100] = (short) arg1.method1783();
			}
			return;
		} else if (arg0 == 60) {
			local94 = arg1.method1780();
			this.anIntArray329 = new int[local94];
			for (local100 = 0; local100 < local94; local100++) {
				this.anIntArray329[local100] = arg1.method1783();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean191 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt2568 = arg1.method1783();
			return;
		} else if (arg0 == 97) {
			this.anInt2555 = arg1.method1783();
			return;
		} else if (arg0 == 98) {
			this.anInt2569 = arg1.method1783();
			return;
		} else if (arg0 == 99) {
			this.aBoolean190 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt2572 = arg1.method1767();
			return;
		} else if (arg0 == 101) {
			this.anInt2578 = arg1.method1767() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt2560 = arg1.method1783();
			return;
		} else {
			if (arg0 == 103) {
				this.anInt2566 = arg1.method1783();
			} else if (arg0 == 106) {
				this.anInt2565 = arg1.method1783();
				if (this.anInt2565 == 65535) {
					this.anInt2565 = -1;
				}
				this.anInt2579 = arg1.method1783();
				if (this.anInt2579 == 65535) {
					this.anInt2579 = -1;
				}
				local94 = arg1.method1780();
				this.anIntArray331 = new int[local94 + 1];
				for (local100 = 0; local100 <= local94; local100++) {
					this.anIntArray331[local100] = arg1.method1783();
					if (this.anIntArray331[local100] == 65535) {
						this.anIntArray331[local100] = -1;
					}
				}
				return;
			} else if (arg0 == 107) {
				this.aBoolean189 = false;
				return;
			} else if (arg0 == 109) {
				this.aBoolean192 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public void method1577() {
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method1579() {
		if (this.anIntArray331 != null) {
			@Pc(14) Class2_Sub1_Sub13 local14 = this.method1582();
			return local14 == null ? null : local14.method1579();
		} else if (this.anIntArray329 == null) {
			return null;
		} else {
			@Pc(29) boolean local29 = false;
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray329.length; local31++) {
				if (!Static118.aClass11_43.method384(0, this.anIntArray329[local31])) {
					local29 = true;
				}
			}
			if (local29) {
				return null;
			}
			@Pc(65) Class2_Sub1_Sub1_Sub6[] local65 = new Class2_Sub1_Sub1_Sub6[this.anIntArray329.length];
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray329.length; local67++) {
				local65[local67] = Static26.method540(Static118.aClass11_43, this.anIntArray329[local67]);
			}
			@Pc(98) Class2_Sub1_Sub1_Sub6 local98;
			if (local65.length == 1) {
				local98 = local65[0];
			} else {
				local98 = new Class2_Sub1_Sub1_Sub6(local65, local65.length);
			}
			if (this.aShortArray13 != null) {
				for (@Pc(109) int local109 = 0; local109 < this.aShortArray13.length; local109++) {
					local98.method559(this.aShortArray13[local109], this.aShortArray14[local109]);
				}
			}
			return local98;
		}
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(B)Z")
	public boolean method1580() {
		if (this.anIntArray331 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2565 != -1) {
			local10 = Static73.method1165(this.anInt2565);
		} else if (this.anInt2579 != -1) {
			local10 = Static15.anIntArray66[this.anInt2579];
		}
		return local10 >= 0 && local10 < this.anIntArray331.length && this.anIntArray331[local10] != -1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method1581(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1780();
			if (local5 == 0) {
				return;
			}
			this.method1576(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)Lclient!rb;")
	public Class2_Sub1_Sub13 method1582() {
		@Pc(11) int local11 = -1;
		if (this.anInt2565 != -1) {
			local11 = Static73.method1165(this.anInt2565);
		} else if (this.anInt2579 != -1) {
			local11 = Static15.anIntArray66[this.anInt2579];
		}
		return local11 < 0 || this.anIntArray331.length <= local11 || this.anIntArray331[local11] == -1 ? null : Static23.method462(this.anIntArray331[local11]);
	}
}
