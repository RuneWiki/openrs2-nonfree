import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class120 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public int anInt3635;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	private int anInt3639;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	private int anInt3640;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	public int anInt3643;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private int anInt3651;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public int anInt3653;

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!li", name = "A", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!li", name = "B", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "I")
	public int anInt3663;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "I")
	public int anInt3664;

	@OriginalMember(owner = "client!li", name = "R", descriptor = "I")
	private int anInt3668;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	private int anInt3636 = -1;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public int anInt3641 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public int anInt3637 = -1;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "I")
	public int anInt3647 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Z")
	public boolean aBoolean322 = false;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public int anInt3650 = -1;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	private int anInt3649 = -1;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "I")
	public int anInt3654 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray30 = new String[5];

	@OriginalMember(owner = "client!li", name = "q", descriptor = "I")
	private int anInt3648 = -1;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Z")
	public boolean aBoolean321 = true;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	private int anInt3642 = -1;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "I")
	private int anInt3661 = -1;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public int anInt3646 = -1;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Z")
	public boolean aBoolean323 = true;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "I")
	public int anInt3666 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!li", name = "K", descriptor = "I")
	public int anInt3662 = 0;

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
	public int anInt3667 = -1;

	@OriginalMember(owner = "client!li", name = "N", descriptor = "Z")
	public boolean aBoolean324 = true;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLclient!ae;Z)Lclient!gj;")
	public Class31 method3330(@OriginalArg(1) Class4 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt3650 : this.anInt3646;
		@Pc(24) int local24 = arg0.anInt4681 << 29 | local11;
		@Pc(31) Class31 local31 = (Class31) Static301.aClass119_156.method3311((long) local24);
		if (local31 != null) {
			return local31;
		} else if (Static302.aClass191_190.method5440(local11)) {
			@Pc(47) Class76 local47 = Static361.method2368(Static302.aClass191_190, local11, 0);
			if (local47 != null) {
				local31 = arg0.method4214(local47);
				Static301.aClass119_156.method3308(local31, (long) local24);
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public void method3331() {
		if (this.anIntArray297 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray297.length; local6 += 2) {
			if (this.anInt3641 > this.anIntArray297[local6]) {
				this.anInt3641 = this.anIntArray297[local6];
			} else if (this.anIntArray297[local6] > this.anInt3654) {
				this.anInt3654 = this.anIntArray297[local6];
			}
			if (this.anIntArray297[local6 + 1] < this.anInt3666) {
				this.anInt3666 = this.anIntArray297[local6 + 1];
			} else if (this.anInt3647 < this.anIntArray297[local6 + 1]) {
				this.anInt3647 = this.anIntArray297[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!dg;)V")
	public void method3333(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method3340(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	public boolean method3337() {
		if (this.anInt3649 == -1 && this.anInt3642 == -1) {
			return true;
		}
		@Pc(26) int local26;
		if (this.anInt3649 == -1) {
			local26 = Static209.method4334(this.anInt3642);
		} else {
			local26 = Static133.anIntArray238[this.anInt3649];
		}
		if (this.anInt3639 > local26 || local26 > this.anInt3668) {
			return false;
		} else if (this.anInt3636 == -1 && this.anInt3648 == -1) {
			return true;
		} else {
			if (this.anInt3636 == -1) {
				local26 = Static209.method4334(this.anInt3648);
			} else {
				local26 = Static133.anIntArray238[this.anInt3636];
			}
			return local26 >= this.anInt3640 && this.anInt3651 >= local26;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ae;I)Lclient!gj;")
	public Class31 method3339(@OriginalArg(0) Class4 arg0) {
		@Pc(18) Class31 local18 = (Class31) Static301.aClass119_156.method3311((long) (arg0.anInt4681 << 29 | this.anInt3661 | 0x20000));
		if (local18 != null) {
			return local18;
		}
		Static302.aClass191_190.method5440(this.anInt3661);
		@Pc(40) Class76 local40 = Static361.method2368(Static302.aClass191_190, this.anInt3661, 0);
		if (local40 != null) {
			local18 = arg0.method4214(local40);
			Static301.aClass119_156.method3308(local18, (long) (arg0.anInt4681 << 29 | 0x20000 | this.anInt3661));
		}
		return local18;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!dg;)V")
	private void method3340(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt3646 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt3650 = arg1.method4464();
		} else if (arg0 == 3) {
			this.aString32 = arg1.method4409();
		} else if (arg0 == 4) {
			this.anInt3663 = arg1.method4463();
		} else if (arg0 == 5) {
			this.anInt3667 = arg1.method4463();
		} else if (arg0 == 6) {
			this.anInt3662 = arg1.method4421();
		} else {
			@Pc(90) int local90;
			if (arg0 == 7) {
				local90 = arg1.method4421();
				if ((local90 & 0x2) == 2) {
					this.aBoolean322 = true;
				}
				if ((local90 & 0x1) == 0) {
					this.aBoolean323 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean321 = arg1.method4421() == 1;
			} else if (arg0 == 9) {
				this.anInt3642 = arg1.method4464();
				if (this.anInt3642 == 65535) {
					this.anInt3642 = -1;
				}
				this.anInt3649 = arg1.method4464();
				if (this.anInt3649 == 65535) {
					this.anInt3649 = -1;
				}
				this.anInt3639 = arg1.method4444();
				this.anInt3668 = arg1.method4444();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray30[arg0 - 10] = arg1.method4409();
			} else if (arg0 == 15) {
				local90 = arg1.method4421();
				this.anIntArray297 = new int[local90 * 2];
				for (@Pc(98) int local98 = 0; local98 < local90 * 2; local98++) {
					this.anIntArray297[local98] = arg1.method4460();
				}
				this.anInt3655 = arg1.method4444();
				this.anInt3664 = arg1.method4444();
			} else if (arg0 == 16) {
				this.aBoolean324 = false;
			} else if (arg0 == 17) {
				this.aString31 = arg1.method4409();
			} else if (arg0 == 18) {
				this.anInt3661 = arg1.method4464();
			} else if (arg0 == 19) {
				this.anInt3637 = arg1.method4464();
			} else if (arg0 == 20) {
				this.anInt3648 = arg1.method4464();
				if (this.anInt3648 == 65535) {
					this.anInt3648 = -1;
				}
				this.anInt3636 = arg1.method4464();
				if (this.anInt3636 == 65535) {
					this.anInt3636 = -1;
				}
				this.anInt3640 = arg1.method4444();
				this.anInt3651 = arg1.method4444();
			} else if (arg0 == 21) {
				this.anInt3643 = arg1.method4444();
			} else if (arg0 == 22) {
				this.anInt3653 = arg1.method4444();
			}
		}
	}
}
