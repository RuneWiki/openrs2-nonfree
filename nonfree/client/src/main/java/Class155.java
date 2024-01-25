import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class155 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public int anInt4664;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	public int anInt4669;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
	public int anInt4674;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "Ljava/lang/String;")
	public String aString294;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	private int anInt4677;

	@OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
	private int anInt4678;

	@OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
	public int anInt4681;

	@OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
	private int anInt4686;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
	public int anInt4687;

	@OriginalMember(owner = "client!oo", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString295;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	public int anInt4671 = -1;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	public int anInt4673 = -1;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "Z")
	public boolean aBoolean345 = true;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public int anInt4667 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public int anInt4663 = 0;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
	public int anInt4684 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private int anInt4665 = -1;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	private int anInt4659 = -1;

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
	public int anInt4683 = -1;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
	public int anInt4676 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
	private int anInt4685 = -1;

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Z")
	public boolean aBoolean344 = true;

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
	private int anInt4689 = -1;

	@OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
	public int anInt4690 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public int anInt4672 = -1;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Z")
	public boolean aBoolean347 = true;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
	private int anInt4691 = -1;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLclient!pe;Z)Lclient!kb;")
	public Class52 method4080(@OriginalArg(1) Class89 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg1 ? this.anInt4671 : this.anInt4673;
		@Pc(23) int local23 = arg0.anInt6390 << 29 | local16;
		@Pc(30) Class52 local30 = (Class52) Static281.aClass103_51.method2682((long) local23);
		if (local30 != null) {
			return local30;
		} else if (Static233.aClass180_58.method4562(local16)) {
			@Pc(46) Class56 local46 = Static358.method1307(Static233.aClass180_58, local16, 0);
			if (local46 != null) {
				local30 = arg0.method5411(local46);
				Static281.aClass103_51.method2687(local30, (long) local23);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!ap;I)V")
	private void method4082(@OriginalArg(1) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4673 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt4671 = arg0.method2764();
		} else if (arg1 == 3) {
			this.aString294 = arg0.method2782();
		} else if (arg1 == 4) {
			this.anInt4664 = arg0.method2791();
		} else if (arg1 == 5) {
			this.anInt4672 = arg0.method2791();
		} else if (arg1 == 6) {
			this.anInt4663 = arg0.method2772();
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method2772();
				if ((local70 & 0x1) == 0) {
					this.aBoolean345 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean346 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean344 = arg0.method2772() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt4685 = arg0.method2764();
				if (this.anInt4685 == 65535) {
					this.anInt4685 = -1;
				}
				this.anInt4691 = arg0.method2764();
				if (this.anInt4691 == 65535) {
					this.anInt4691 = -1;
				}
				this.anInt4677 = arg0.method2767();
				this.anInt4686 = arg0.method2767();
				return;
			} else {
				if (arg1 < 10 || arg1 > 14) {
					if (arg1 == 15) {
						local70 = arg0.method2772();
						this.anIntArray625 = new int[local70 * 2];
						for (@Pc(174) int local174 = 0; local174 < local70 * 2; local174++) {
							this.anIntArray625[local174] = arg0.method2744();
						}
						this.anInt4669 = arg0.method2767();
						this.anInt4674 = arg0.method2767();
						return;
					} else if (arg1 == 16) {
						this.aBoolean347 = false;
						return;
					} else if (arg1 == 17) {
						this.aString295 = arg0.method2782();
						return;
					} else if (arg1 == 18) {
						this.anInt4659 = arg0.method2764();
						return;
					} else if (arg1 == 19) {
						this.anInt4683 = arg0.method2764();
						return;
					} else {
						if (arg1 == 20) {
							this.anInt4689 = arg0.method2764();
							if (this.anInt4689 == 65535) {
								this.anInt4689 = -1;
							}
							this.anInt4665 = arg0.method2764();
							if (this.anInt4665 == 65535) {
								this.anInt4665 = -1;
							}
							this.anInt4678 = arg0.method2767();
							this.anInt4658 = arg0.method2767();
						} else if (arg1 == 21) {
							this.anInt4687 = arg0.method2767();
							return;
						} else if (arg1 == 22) {
							this.anInt4660 = arg0.method2767();
							return;
						}
						return;
					}
				}
				this.aStringArray40[arg1 - 10] = arg0.method2782();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!pe;)Lclient!kb;")
	public Class52 method4083(@OriginalArg(1) Class89 arg0) {
		@Pc(18) Class52 local18 = (Class52) Static281.aClass103_51.method2682((long) (this.anInt4659 | 0x20000 | arg0.anInt6390 << 29));
		if (local18 != null) {
			return local18;
		}
		Static233.aClass180_58.method4562(this.anInt4659);
		@Pc(42) Class56 local42 = Static358.method1307(Static233.aClass180_58, this.anInt4659, 0);
		if (local42 != null) {
			local18 = arg0.method5411(local42);
			Static281.aClass103_51.method2687(local18, (long) (arg0.anInt6390 << 29 | this.anInt4659 | 0x20000));
		}
		return local18;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Z")
	public boolean method4084() {
		if (this.anInt4691 == -1 && this.anInt4685 == -1) {
			return true;
		}
		@Pc(30) int local30;
		if (this.anInt4691 == -1) {
			local30 = Static141.method2849(this.anInt4685);
		} else {
			local30 = Static212.anIntArray579[this.anInt4691];
		}
		if (local30 < this.anInt4677 || local30 > this.anInt4686) {
			return false;
		} else if (this.anInt4665 == -1 && this.anInt4689 == -1) {
			return true;
		} else {
			if (this.anInt4665 == -1) {
				local30 = Static141.method2849(this.anInt4689);
			} else {
				local30 = Static212.anIntArray579[this.anInt4665];
			}
			return local30 >= this.anInt4678 && this.anInt4658 >= local30;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public void method4088() {
		if (this.anIntArray625 == null) {
			return;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray625.length; local8 += 2) {
			if (this.anIntArray625[local8] < this.anInt4676) {
				this.anInt4676 = this.anIntArray625[local8];
			} else if (this.anInt4690 < this.anIntArray625[local8]) {
				this.anInt4690 = this.anIntArray625[local8];
			}
			if (this.anIntArray625[local8 + 1] < this.anInt4667) {
				this.anInt4667 = this.anIntArray625[local8 + 1];
			} else if (this.anIntArray625[local8 + 1] > this.anInt4684) {
				this.anInt4684 = this.anIntArray625[local8 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLclient!ap;)V")
	public void method4089(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2772();
			if (local8 == 0) {
				return;
			}
			this.method4082(arg0, local8);
		}
	}
}
