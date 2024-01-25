import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class121 {

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Ljava/lang/String;")
	public String aString210;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
	public int anInt3564;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public int anInt3565;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public int anInt3571;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public int anInt3572;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Ljava/lang/String;")
	public String aString211;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
	public int anInt3580;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	private int anInt3581;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
	public int anInt3582;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
	private int anInt3587;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
	private int anInt3589;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
	private int anInt3591;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public int anInt3566 = 0;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public int anInt3562 = -1;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
	public int anInt3563 = -1;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	private int anInt3567 = -1;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray24 = new String[5];

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
	public boolean aBoolean256 = true;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	public int anInt3579 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
	public boolean aBoolean257 = true;

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
	private int anInt3588 = -1;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
	private int anInt3590 = -1;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	public int anInt3575 = -1;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
	public boolean aBoolean258 = true;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt3577 = -1;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	private int anInt3576 = -1;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
	public int anInt3584 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	public int anInt3585 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
	private int anInt3593 = -1;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
	public int anInt3586 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!en;ZZ)Lclient!kh;")
	public Class54 method3307(@OriginalArg(0) Class59 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg1 ? this.anInt3563 : this.anInt3562;
		@Pc(23) int local23 = local16 | arg0.anInt5487 << 29;
		@Pc(30) Class54 local30 = (Class54) Static261.aClass66_87.method1939((long) local23);
		if (local30 != null) {
			return local30;
		} else if (Static293.aClass170_97.method4568(local16)) {
			@Pc(46) Class37 local46 = Static360.method907(Static293.aClass170_97, local16, 0);
			if (local46 != null) {
				local30 = arg0.method4872(local46);
				Static261.aClass66_87.method1936((long) local23, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!en;)Lclient!kh;")
	public Class54 method3308(@OriginalArg(1) Class59 arg0) {
		@Pc(29) Class54 local29 = (Class54) Static261.aClass66_87.method1939((long) (arg0.anInt5487 << 29 | this.anInt3576 | 0x20000));
		if (local29 != null) {
			return local29;
		}
		Static293.aClass170_97.method4568(this.anInt3576);
		@Pc(45) Class37 local45 = Static360.method907(Static293.aClass170_97, this.anInt3576, 0);
		if (local45 != null) {
			local29 = arg0.method4872(local45);
			Static261.aClass66_87.method1936((long) (this.anInt3576 | 0x20000 | arg0.anInt5487 << 29), local29);
		}
		return local29;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	public boolean method3309() {
		if (this.anInt3590 == -1 && this.anInt3588 == -1) {
			return true;
		}
		@Pc(33) int local33;
		if (this.anInt3590 == -1) {
			local33 = Static264.method2886(this.anInt3588);
		} else {
			local33 = Static69.anIntArray80[this.anInt3590];
		}
		if (this.anInt3587 > local33 || local33 > this.anInt3589) {
			return false;
		} else if (this.anInt3593 == -1 && this.anInt3567 == -1) {
			return true;
		} else {
			if (this.anInt3593 == -1) {
				local33 = Static264.method2886(this.anInt3567);
			} else {
				local33 = Static69.anIntArray80[this.anInt3593];
			}
			return local33 >= this.anInt3591 && local33 <= this.anInt3581;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!bk;)V")
	private void method3310(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt3562 = arg1.method1845();
		} else if (arg0 == 2) {
			this.anInt3563 = arg1.method1845();
		} else if (arg0 == 3) {
			this.aString211 = arg1.method1840();
		} else if (arg0 == 4) {
			this.anInt3580 = arg1.method1843();
		} else if (arg0 == 5) {
			this.anInt3577 = arg1.method1843();
		} else if (arg0 == 6) {
			this.anInt3566 = arg1.method1832();
		} else {
			@Pc(52) int local52;
			if (arg0 == 7) {
				local52 = arg1.method1832();
				if ((local52 & 0x2) == 2) {
					this.aBoolean255 = true;
				}
				if ((local52 & 0x1) == 0) {
					this.aBoolean258 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean257 = arg1.method1832() == 1;
			} else if (arg0 == 9) {
				this.anInt3588 = arg1.method1845();
				if (this.anInt3588 == 65535) {
					this.anInt3588 = -1;
				}
				this.anInt3590 = arg1.method1845();
				if (this.anInt3590 == 65535) {
					this.anInt3590 = -1;
				}
				this.anInt3587 = arg1.method1826();
				this.anInt3589 = arg1.method1826();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray24[arg0 - 10] = arg1.method1840();
			} else if (arg0 == 15) {
				local52 = arg1.method1832();
				this.anIntArray269 = new int[local52 * 2];
				for (@Pc(116) int local116 = 0; local116 < local52 * 2; local116++) {
					this.anIntArray269[local116] = arg1.method1834();
				}
				this.anInt3572 = arg1.method1826();
				this.anInt3565 = arg1.method1826();
			} else if (arg0 == 16) {
				this.aBoolean256 = false;
			} else if (arg0 == 17) {
				this.aString210 = arg1.method1840();
			} else if (arg0 == 18) {
				this.anInt3576 = arg1.method1845();
			} else if (arg0 == 19) {
				this.anInt3575 = arg1.method1845();
			} else if (arg0 == 20) {
				this.anInt3567 = arg1.method1845();
				if (this.anInt3567 == 65535) {
					this.anInt3567 = -1;
				}
				this.anInt3593 = arg1.method1845();
				if (this.anInt3593 == 65535) {
					this.anInt3593 = -1;
				}
				this.anInt3591 = arg1.method1826();
				this.anInt3581 = arg1.method1826();
			} else if (arg0 == 21) {
				this.anInt3571 = arg1.method1826();
			} else if (arg0 == 22) {
				this.anInt3582 = arg1.method1826();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method3311() {
		if (this.anIntArray269 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray269.length; local12 += 2) {
			if (this.anInt3585 > this.anIntArray269[local12]) {
				this.anInt3585 = this.anIntArray269[local12];
			} else if (this.anInt3584 < this.anIntArray269[local12]) {
				this.anInt3584 = this.anIntArray269[local12];
			}
			if (this.anIntArray269[local12 + 1] < this.anInt3579) {
				this.anInt3579 = this.anIntArray269[local12 + 1];
			} else if (this.anIntArray269[local12 + 1] > this.anInt3586) {
				this.anInt3586 = this.anIntArray269[local12 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method3313(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1832();
			if (local3 == 0) {
				return;
			}
			this.method3310(local3, arg0);
		}
	}
}
