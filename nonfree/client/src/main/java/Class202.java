import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class202 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!fm;")
	public Class78 aClass78_4;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	public int anInt5563;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
	public int anInt5565;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	private int anInt5568;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	private int anInt5569;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
	private int anInt5583;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
	public int anInt5584;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
	public int anInt5591;

	@OriginalMember(owner = "client!ql", name = "P", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
	private int anInt5595;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "Lclient!gu;")
	private Class96 aClass96_35;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
	public int anInt5596;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray35 = new String[5];

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	private int anInt5564 = -1;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public int anInt5576 = -1;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "Z")
	public boolean aBoolean397 = true;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	public int anInt5579 = -1;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
	public int anInt5570 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public int anInt5561 = -1;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	private int anInt5572 = -1;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
	public int anInt5566 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
	private int anInt5590 = -1;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public int anInt5562 = -1;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
	public int anInt5593 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
	public int anInt5594 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
	private int anInt5597 = -1;

	@OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
	public int anInt5592 = 0;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
	private int anInt5598 = -1;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method4650() {
		if (this.anIntArray517 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray517.length; local17 += 2) {
			if (this.anInt5594 > this.anIntArray517[local17]) {
				this.anInt5594 = this.anIntArray517[local17];
			} else if (this.anIntArray517[local17] > this.anInt5593) {
				this.anInt5593 = this.anIntArray517[local17];
			}
			if (this.anIntArray517[local17 + 1] < this.anInt5570) {
				this.anInt5570 = this.anIntArray517[local17 + 1];
			} else if (this.anInt5566 < this.anIntArray517[local17 + 1]) {
				this.anInt5566 = this.anIntArray517[local17 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method4651(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass96_35 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub12 local16 = (Class1_Sub12) this.aClass96_35.method2335((long) arg0);
			return local16 == null ? arg1 : local16.aString11;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)I")
	public int method4652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass96_35 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub43 local16 = (Class1_Sub43) this.aClass96_35.method2335((long) arg0);
			return local16 == null ? arg1 : local16.anInt6933;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!ya;)Lclient!l;")
	public Class143 method4654(@OriginalArg(1) Class39 arg0) {
		@Pc(22) Class143 local22 = (Class143) this.aClass78_4.aClass134_18.method3266((long) (arg0.anInt5452 << 29 | this.anInt5597 | 0x20000));
		if (local22 != null) {
			return local22;
		}
		this.aClass78_4.aClass246_75.method5497(this.anInt5597);
		@Pc(42) Class51 local42 = Static461.method1450(this.aClass78_4.aClass246_75, this.anInt5597, 0);
		if (local42 != null) {
			local22 = arg0.method4549(local42);
			this.aClass78_4.aClass134_18.method3263((long) (this.anInt5597 | 0x20000 | arg0.anInt5452 << 29), local22);
		}
		return local22;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ov;I)Z")
	public boolean method4655(@OriginalArg(0) Interface8 arg0) {
		@Pc(14) int local14;
		if (this.anInt5590 == -1) {
			if (this.anInt5572 == -1) {
				return true;
			}
			local14 = arg0.method595(this.anInt5572);
		} else {
			local14 = arg0.method594(this.anInt5590);
		}
		if (this.anInt5583 > local14 || this.anInt5595 < local14) {
			return false;
		}
		@Pc(54) int local54;
		if (this.anInt5598 == -1) {
			if (this.anInt5564 == -1) {
				return true;
			}
			local54 = arg0.method595(this.anInt5564);
		} else {
			local54 = arg0.method594(this.anInt5598);
		}
		return local54 >= this.anInt5568 && local54 <= this.anInt5569;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ya;IZ)Lclient!l;")
	public Class143 method4658(@OriginalArg(0) Class39 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5579 : this.anInt5576;
		@Pc(23) int local23 = local11 | arg0.anInt5452 << 29;
		@Pc(32) Class143 local32 = (Class143) this.aClass78_4.aClass134_18.method3266((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass78_4.aClass246_75.method5497(local11)) {
			@Pc(52) Class51 local52 = Static461.method1450(this.aClass78_4.aClass246_75, local11, 0);
			if (local52 != null) {
				local32 = arg0.method4549(local52);
				this.aClass78_4.aClass134_18.method3263((long) local23, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!hp;)V")
	public void method4660(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5366();
			if (local12 == 0) {
				return;
			}
			this.method4661(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!hp;IB)V")
	private void method4661(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5576 = arg0.method5362();
		} else if (arg1 == 2) {
			this.anInt5579 = arg0.method5362();
		} else if (arg1 == 3) {
			this.aString52 = arg0.method5401();
		} else if (arg1 == 4) {
			this.anInt5565 = arg0.method5399();
		} else if (arg1 == 5) {
			this.anInt5562 = arg0.method5399();
		} else if (arg1 == 6) {
			this.anInt5592 = arg0.method5366();
			return;
		} else {
			@Pc(216) int local216;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean399 = arg0.method5366() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt5572 = arg0.method5362();
					if (this.anInt5572 == 65535) {
						this.anInt5572 = -1;
					}
					this.anInt5590 = arg0.method5362();
					if (this.anInt5590 == 65535) {
						this.anInt5590 = -1;
					}
					this.anInt5583 = arg0.method5407();
					this.anInt5595 = arg0.method5407();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray35[arg1 - 10] = arg0.method5401();
					return;
				}
				@Pc(223) int local223;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean397 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString53 = arg0.method5401();
					} else if (arg1 == 18) {
						this.anInt5597 = arg0.method5362();
						return;
					} else if (arg1 == 19) {
						this.anInt5561 = arg0.method5362();
						return;
					} else if (arg1 == 20) {
						this.anInt5564 = arg0.method5362();
						if (this.anInt5564 == 65535) {
							this.anInt5564 = -1;
						}
						this.anInt5598 = arg0.method5362();
						if (this.anInt5598 == 65535) {
							this.anInt5598 = -1;
						}
						this.anInt5568 = arg0.method5407();
						this.anInt5569 = arg0.method5407();
						return;
					} else if (arg1 == 21) {
						this.anInt5584 = arg0.method5407();
						return;
					} else if (arg1 == 22) {
						this.anInt5563 = arg0.method5407();
						return;
					} else if (arg1 == 249) {
						local216 = arg0.method5366();
						if (this.aClass96_35 == null) {
							local223 = Static406.method5434(local216);
							this.aClass96_35 = new Class96(local223);
						}
						for (local223 = 0; local223 < local216; local223++) {
							@Pc(243) boolean local243 = arg0.method5366() == 1;
							@Pc(247) int local247 = arg0.method5399();
							@Pc(256) Class1 local256;
							if (local243) {
								local256 = new Class1_Sub12(arg0.method5401());
							} else {
								local256 = new Class1_Sub43(arg0.method5407());
							}
							this.aClass96_35.method2341((long) local247, local256);
						}
						return;
					}
					return;
				}
				local216 = arg0.method5366();
				this.anIntArray517 = new int[local216 * 2];
				for (local223 = 0; local223 < local216 * 2; local223++) {
					this.anIntArray517[local223] = arg0.method5380();
				}
				this.anInt5596 = arg0.method5407();
				this.anInt5591 = arg0.method5407();
				return;
			}
			local216 = arg0.method5366();
			if ((local216 & 0x2) == 2) {
				this.aBoolean400 = true;
			}
			if ((local216 & 0x1) == 0) {
				this.aBoolean398 = false;
				return;
			}
		}
	}
}
