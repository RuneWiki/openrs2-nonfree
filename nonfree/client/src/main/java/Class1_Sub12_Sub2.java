import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!va", name = "x", descriptor = "I")
	private int anInt2651;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Z")
	private boolean aBoolean145;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	private int anInt2652;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	private int anInt2653;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "I")
	private int anInt2656;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private int anInt2659;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	private final int anInt2655;

	@OriginalMember(owner = "client!va", name = "H", descriptor = "I")
	private final int anInt2660;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "I")
	private int anInt2657;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!me;II)V")
	public Class1_Sub12_Sub2(@OriginalArg(0) Class1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub10_3 = arg0;
		this.anInt2655 = arg0.anInt1558;
		this.anInt2660 = arg0.anInt1556;
		this.anInt2657 = arg1;
		this.anInt2654 = arg2;
		this.anInt2658 = 0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()Z")
	public boolean method1788() {
		return this.method1826();
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1785(@OriginalArg(0) int arg0) {
		if (this.anInt2651 > 0) {
			if (arg0 >= this.anInt2651) {
				if (this.anInt2653 == Integer.MIN_VALUE) {
					this.method1825();
					arg0 = this.anInt2651;
				} else {
					this.anInt2654 = this.anInt2653;
				}
				this.anInt2651 = 0;
			} else {
				this.anInt2654 += this.anInt2659 * arg0;
				this.anInt2651 -= arg0;
			}
		}
		this.anInt2658 += this.anInt2657 * arg0;
		@Pc(53) Class1_Sub10_Sub1 local53 = (Class1_Sub10_Sub1) super.aClass1_Sub10_3;
		@Pc(58) int local58 = this.anInt2655 << 8;
		@Pc(63) int local63 = this.anInt2660 << 8;
		@Pc(69) int local69 = local53.aByteArray20.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt2652 = 0;
		}
		if (this.anInt2652 >= 0) {
			if (this.anInt2652 > 0) {
				if (this.aBoolean145) {
					label113: {
						if (this.anInt2657 < 0) {
							if (this.anInt2658 >= local58) {
								return;
							}
							this.anInt2658 = local58 + local58 - this.anInt2658 - 1;
							this.anInt2657 = -this.anInt2657;
							if (--this.anInt2652 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt2658 < local63) {
								return;
							}
							this.anInt2658 = local63 + local63 - this.anInt2658 - 1;
							this.anInt2657 = -this.anInt2657;
							if (--this.anInt2652 == 0) {
								break;
							}
							if (this.anInt2658 >= local58) {
								return;
							}
							this.anInt2658 = local58 + local58 - this.anInt2658 - 1;
							this.anInt2657 = -this.anInt2657;
						} while (--this.anInt2652 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt2657 < 0) {
						if (this.anInt2658 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt2658 - 1) / local73;
						if (local299 < this.anInt2652) {
							this.anInt2658 += local73 * local299;
							this.anInt2652 -= local299;
							return;
						}
						this.anInt2658 += local73 * this.anInt2652;
						this.anInt2652 = 0;
					} else if (this.anInt2658 >= local63) {
						local299 = (this.anInt2658 - local58) / local73;
						if (local299 < this.anInt2652) {
							this.anInt2658 -= local73 * local299;
							this.anInt2652 -= local299;
							return;
						}
						this.anInt2658 -= local73 * this.anInt2652;
						this.anInt2652 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2657 < 0) {
				if (this.anInt2658 < 0) {
					this.anInt2658 = 0;
					this.method1825();
					return;
				}
			} else if (this.anInt2658 >= local69) {
				this.anInt2658 = local69 - 1;
				this.method1825();
			}
		} else if (this.aBoolean145) {
			if (this.anInt2657 < 0) {
				if (this.anInt2658 >= local58) {
					return;
				}
				this.anInt2658 = local58 + local58 - this.anInt2658 - 1;
				this.anInt2657 = -this.anInt2657;
			}
			while (this.anInt2658 >= local63) {
				this.anInt2658 = local63 + local63 - this.anInt2658 - 1;
				this.anInt2657 = -this.anInt2657;
				if (this.anInt2658 >= local58) {
					return;
				}
				this.anInt2658 = local58 + local58 - this.anInt2658 - 1;
				this.anInt2657 = -this.anInt2657;
			}
		} else if (this.anInt2657 < 0) {
			if (this.anInt2658 < local58) {
				this.anInt2658 = local63 - (local63 - 1 - this.anInt2658) % local73 - 1;
			}
		} else if (this.anInt2658 >= local63) {
			this.anInt2658 = local58 + (this.anInt2658 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIII)I")
	private int method1793(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2651 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2651;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2651 += arg1;
			if (this.anInt2657 == -256 && (this.anInt2658 & 0xFF) == 0) {
				arg1 = Static117.method1799(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, this.anInt2656, this.anInt2659, local7, arg2, this);
			} else {
				arg1 = Static117.method1791(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, this.anInt2656, this.anInt2659, local7, arg2, this, this.anInt2657, arg4);
			}
			this.anInt2651 -= arg1;
			if (this.anInt2651 != 0) {
				return arg1;
			}
			if (this.anInt2653 == Integer.MIN_VALUE) {
				this.method1825();
				return arg3;
			}
			this.anInt2654 = this.anInt2653;
		}
		return this.anInt2657 == -256 && (this.anInt2658 & 0xFF) == 0 ? Static117.method1798(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, arg3, arg2, this) : Static117.method1792(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, arg3, arg2, this, this.anInt2657, arg4);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "([IIIII)I")
	private int method1794(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2651 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2651;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2651 += arg1;
			if (this.anInt2657 == 256 && (this.anInt2658 & 0xFF) == 0) {
				arg1 = Static117.method1790(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, this.anInt2656, this.anInt2659, local7, arg2, this);
			} else {
				arg1 = Static117.method1801(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, this.anInt2656, this.anInt2659, local7, arg2, this, this.anInt2657, arg4);
			}
			this.anInt2651 -= arg1;
			if (this.anInt2651 != 0) {
				return arg1;
			}
			if (this.anInt2653 == Integer.MIN_VALUE) {
				this.method1825();
				return arg3;
			}
			this.anInt2654 = this.anInt2653;
		}
		return this.anInt2657 == 256 && (this.anInt2658 & 0xFF) == 0 ? Static117.method1800(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, arg3, arg2, this) : Static117.method1795(((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20, arg0, this.anInt2658, arg1, this.anInt2654, arg3, arg2, this, this.anInt2657, arg4);
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public synchronized void method1796(@OriginalArg(0) int arg0) {
		this.anInt2654 = arg0;
		this.anInt2651 = 0;
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	public synchronized void method1797(@OriginalArg(0) int arg0) {
		this.anInt2652 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1786(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2654 == 0 && (this.anInt2651 == 0 || this.anInt2653 == 0 || this.anInt2653 == Integer.MIN_VALUE)) {
			this.method1785(arg2);
			return 0;
		}
		@Pc(21) Class1_Sub10_Sub1 local21 = (Class1_Sub10_Sub1) super.aClass1_Sub10_3;
		@Pc(26) int local26 = this.anInt2655 << 8;
		@Pc(31) int local31 = this.anInt2660 << 8;
		@Pc(37) int local37 = local21.aByteArray20.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt2652 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt2652 >= 0) {
			if (this.anInt2652 > 0) {
				if (this.aBoolean145) {
					label118: {
						if (this.anInt2657 < 0) {
							local48 = this.method1793(arg0, arg1, local26, local52, local21.aByteArray20[this.anInt2655]);
							if (this.anInt2658 >= local26) {
								return 1;
							}
							this.anInt2658 = local26 + local26 - this.anInt2658 - 1;
							this.anInt2657 = -this.anInt2657;
							if (--this.anInt2652 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1794(arg0, local48, local31, local52, local21.aByteArray20[this.anInt2660 - 1]);
							if (this.anInt2658 < local31) {
								return 1;
							}
							this.anInt2658 = local31 + local31 - this.anInt2658 - 1;
							this.anInt2657 = -this.anInt2657;
							if (--this.anInt2652 == 0) {
								break;
							}
							local48 = this.method1793(arg0, local48, local26, local52, local21.aByteArray20[this.anInt2655]);
							if (this.anInt2658 >= local26) {
								return 1;
							}
							this.anInt2658 = local26 + local26 - this.anInt2658 - 1;
							this.anInt2657 = -this.anInt2657;
						} while (--this.anInt2652 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt2657 < 0) {
						while (true) {
							local48 = this.method1793(arg0, local48, local26, local52, local21.aByteArray20[this.anInt2660 - 1]);
							if (this.anInt2658 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt2658 - 1) / local41;
							if (local398 >= this.anInt2652) {
								this.anInt2658 += local41 * this.anInt2652;
								this.anInt2652 = 0;
								break;
							}
							this.anInt2658 += local41 * local398;
							this.anInt2652 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1794(arg0, local48, local31, local52, local21.aByteArray20[this.anInt2655]);
							if (this.anInt2658 < local31) {
								return 1;
							}
							local398 = (this.anInt2658 - local26) / local41;
							if (local398 >= this.anInt2652) {
								this.anInt2658 -= local41 * this.anInt2652;
								this.anInt2652 = 0;
								break;
							}
							this.anInt2658 -= local41 * local398;
							this.anInt2652 -= local398;
						}
					}
				}
			}
			if (this.anInt2657 < 0) {
				this.method1793(arg0, local48, 0, local52, 0);
				if (this.anInt2658 < 0) {
					this.anInt2658 = 0;
					this.method1825();
				}
			} else {
				this.method1794(arg0, local48, local37, local52, 0);
				if (this.anInt2658 >= local37) {
					this.anInt2658 = local37 - 1;
					this.method1825();
				}
			}
			return 1;
		} else if (this.aBoolean145) {
			if (this.anInt2657 < 0) {
				local48 = this.method1793(arg0, arg1, local26, local52, local21.aByteArray20[this.anInt2655]);
				if (this.anInt2658 >= local26) {
					return 1;
				}
				this.anInt2658 = local26 + local26 - this.anInt2658 - 1;
				this.anInt2657 = -this.anInt2657;
			}
			while (true) {
				local48 = this.method1794(arg0, local48, local31, local52, local21.aByteArray20[this.anInt2660 - 1]);
				if (this.anInt2658 < local31) {
					return 1;
				}
				this.anInt2658 = local31 + local31 - this.anInt2658 - 1;
				this.anInt2657 = -this.anInt2657;
				local48 = this.method1793(arg0, local48, local26, local52, local21.aByteArray20[this.anInt2655]);
				if (this.anInt2658 >= local26) {
					return 1;
				}
				this.anInt2658 = local26 + local26 - this.anInt2658 - 1;
				this.anInt2657 = -this.anInt2657;
			}
		} else if (this.anInt2657 < 0) {
			while (true) {
				local48 = this.method1793(arg0, local48, local26, local52, local21.aByteArray20[this.anInt2660 - 1]);
				if (this.anInt2658 >= local26) {
					return 1;
				}
				this.anInt2658 = local31 - (local31 - 1 - this.anInt2658) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1794(arg0, local48, local31, local52, local21.aByteArray20[this.anInt2655]);
				if (this.anInt2658 < local31) {
					return 1;
				}
				this.anInt2658 = local26 + (this.anInt2658 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()I")
	@Override
	public int method1787() {
		@Pc(4) int local4 = this.anInt2654 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt2652 == 0) {
			local4 -= local4 * this.anInt2658 / (((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20.length << 8);
		} else if (this.anInt2652 >= 0) {
			local4 -= local4 * this.anInt2655 / ((Class1_Sub10_Sub1) super.aClass1_Sub10_3).aByteArray20.length;
		}
		return local4 > 255 ? 255 : local4;
	}
}
