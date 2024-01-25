import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class165 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Ljava/lang/String;")
	public String aString196;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public int anInt4669;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public int anInt4670;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	private int anInt4675;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	public int anInt4678;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
	private int anInt4685;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
	private int anInt4686;

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
	public int anInt4687;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString197;

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
	private int anInt4699;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public int anInt4668 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	private int anInt4665 = -1;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	private int anInt4680 = -1;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
	public boolean aBoolean331 = true;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt4677 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray31 = new String[5];

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
	private int anInt4684 = -1;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public int anInt4672 = -1;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public int anInt4681 = -1;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Z")
	public boolean aBoolean330 = true;

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
	private int anInt4690 = -1;

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
	public int anInt4691 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	private int anInt4666 = -1;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
	public int anInt4689 = -1;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
	public int anInt4694 = 0;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public int anInt4671 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
	public int anInt4700 = -1;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "Z")
	public boolean aBoolean332 = true;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method4320(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4689 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt4681 = arg0.method4021();
		} else if (arg1 == 3) {
			this.aString196 = arg0.method4023();
		} else if (arg1 == 4) {
			this.anInt4698 = arg0.method3996();
		} else if (arg1 == 5) {
			this.anInt4672 = arg0.method3996();
		} else if (arg1 == 6) {
			this.anInt4694 = arg0.method3972();
		} else {
			@Pc(39) int local39;
			if (arg1 == 7) {
				local39 = arg0.method3972();
				if ((local39 & 0x1) == 0) {
					this.aBoolean330 = false;
				}
				if ((local39 & 0x2) == 2) {
					this.aBoolean329 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean331 = arg0.method3972() == 1;
			} else if (arg1 == 9) {
				this.anInt4666 = arg0.method4021();
				if (this.anInt4666 == 65535) {
					this.anInt4666 = -1;
				}
				this.anInt4680 = arg0.method4021();
				if (this.anInt4680 == 65535) {
					this.anInt4680 = -1;
				}
				this.anInt4699 = arg0.method3979();
				this.anInt4675 = arg0.method3979();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray31[arg1 - 10] = arg0.method4023();
			} else if (arg1 == 15) {
				local39 = arg0.method3972();
				this.anIntArray509 = new int[local39 * 2];
				for (@Pc(154) int local154 = 0; local154 < local39 * 2; local154++) {
					this.anIntArray509[local154] = arg0.method4022();
				}
				this.anInt4687 = arg0.method3979();
				this.anInt4696 = arg0.method3979();
			} else if (arg1 == 16) {
				this.aBoolean332 = false;
			} else if (arg1 == 17) {
				this.aString197 = arg0.method4023();
			} else if (arg1 == 18) {
				this.anInt4665 = arg0.method4021();
			} else if (arg1 == 19) {
				this.anInt4700 = arg0.method4021();
			} else if (arg1 == 20) {
				this.anInt4690 = arg0.method4021();
				if (this.anInt4690 == 65535) {
					this.anInt4690 = -1;
				}
				this.anInt4684 = arg0.method4021();
				if (this.anInt4684 == 65535) {
					this.anInt4684 = -1;
				}
				this.anInt4686 = arg0.method3979();
				this.anInt4685 = arg0.method3979();
			} else if (arg1 == 21) {
				this.anInt4669 = arg0.method3979();
			} else if (arg1 == 22) {
				this.anInt4670 = arg0.method3979();
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!ja;)Lclient!of;")
	public Class40 method4321(@OriginalArg(1) Class81 arg0) {
		@Pc(18) Class40 local18 = (Class40) Static134.aClass70_46.method1396((long) (this.anInt4665 | 0x20000 | arg0.anInt2815 << 29));
		if (local18 != null) {
			return local18;
		}
		Static234.aClass53_5.method1026(this.anInt4665);
		@Pc(34) Class88 local34 = Static363.method2255(Static234.aClass53_5, this.anInt4665, 0);
		if (local34 != null) {
			local18 = arg0.method3015(local34);
			Static134.aClass70_46.method1406(local18, (long) (arg0.anInt2815 << 29 | this.anInt4665 | 0x20000));
		}
		return local18;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public void method4324() {
		if (this.anIntArray509 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray509.length; local12 += 2) {
			if (this.anIntArray509[local12] < this.anInt4691) {
				this.anInt4691 = this.anIntArray509[local12];
			} else if (this.anInt4671 < this.anIntArray509[local12]) {
				this.anInt4671 = this.anIntArray509[local12];
			}
			if (this.anInt4677 > this.anIntArray509[local12 + 1]) {
				this.anInt4677 = this.anIntArray509[local12 + 1];
			} else if (this.anInt4668 < this.anIntArray509[local12 + 1]) {
				this.anInt4668 = this.anIntArray509[local12 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Z")
	public boolean method4325() {
		if (this.anInt4680 == -1 && this.anInt4666 == -1) {
			return true;
		}
		@Pc(29) int local29;
		if (this.anInt4680 == -1) {
			local29 = Static41.method5822(this.anInt4666);
		} else {
			local29 = Static41.anIntArray721[this.anInt4680];
		}
		if (this.anInt4699 > local29 || local29 > this.anInt4675) {
			return false;
		} else if (this.anInt4684 == -1 && this.anInt4690 == -1) {
			return true;
		} else {
			if (this.anInt4684 == -1) {
				local29 = Static41.method5822(this.anInt4690);
			} else {
				local29 = Static41.anIntArray721[this.anInt4684];
			}
			return local29 >= this.anInt4686 && local29 <= this.anInt4685;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!ja;Z)Lclient!of;")
	public Class40 method4329(@OriginalArg(1) Class81 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt4681 : this.anInt4689;
		@Pc(18) int local18 = arg0.anInt2815 << 29 | local11;
		@Pc(25) Class40 local25 = (Class40) Static134.aClass70_46.method1396((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static234.aClass53_5.method1026(local11)) {
			@Pc(41) Class88 local41 = Static363.method2255(Static234.aClass53_5, local11, 0);
			if (local41 != null) {
				local25 = arg0.method3015(local41);
				Static134.aClass70_46.method1406(local25, (long) local18);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method4331(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3972();
			if (local13 == 0) {
				return;
			}
			this.method4320(arg0, local13);
		}
	}
}
