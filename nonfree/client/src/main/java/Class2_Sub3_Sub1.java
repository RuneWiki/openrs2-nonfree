import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "I")
	private int anInt535;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "I")
	private final int anInt525;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	private final int anInt534;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Z")
	private final boolean aBoolean20;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ca;II)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) Class2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub2_3 = arg0;
		this.anInt525 = arg0.anInt294;
		this.anInt534 = arg0.anInt296;
		this.aBoolean20 = arg0.aBoolean6;
		this.anInt527 = arg1;
		this.anInt523 = arg2;
		this.anInt528 = 128;
		this.anInt532 = 0;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2059(@OriginalArg(0) int arg0) {
		if (this.method403()) {
			return;
		}
		if (this.anInt526 > 0) {
			if (arg0 >= this.anInt526) {
				if (this.anInt529 == Integer.MIN_VALUE) {
					this.anInt523 = 0;
					this.method2073();
					arg0 = this.anInt526;
				} else {
					this.anInt523 = this.anInt529;
				}
				this.anInt528 = this.anInt531;
				this.anInt526 = 0;
			} else {
				this.anInt523 += this.anInt530 * arg0;
				if (Static35.aBoolean50) {
					this.anInt528 += this.anInt535 * arg0;
				}
				this.anInt526 -= arg0;
			}
		}
		this.anInt532 += this.anInt527 * arg0;
		@Pc(75) Class2_Sub2_Sub1 local75 = (Class2_Sub2_Sub1) super.aClass2_Sub2_3;
		@Pc(80) int local80 = this.anInt525 << 8;
		@Pc(85) int local85 = this.anInt534 << 8;
		@Pc(91) int local91 = local75.aByteArray2.length << 8;
		@Pc(95) int local95 = local85 - local80;
		if (local95 <= 0) {
			this.anInt533 = 0;
		}
		if (this.anInt533 >= 0) {
			if (this.anInt533 > 0) {
				if (this.aBoolean20) {
					label120: {
						if (this.anInt527 < 0) {
							if (this.anInt532 >= local80) {
								return;
							}
							this.anInt532 = local80 + local80 - this.anInt532 - 1;
							this.anInt527 = -this.anInt527;
							if (--this.anInt533 == 0) {
								break label120;
							}
						}
						do {
							if (this.anInt532 < local85) {
								return;
							}
							this.anInt532 = local85 + local85 - this.anInt532 - 1;
							this.anInt527 = -this.anInt527;
							if (--this.anInt533 == 0) {
								break;
							}
							if (this.anInt532 >= local80) {
								return;
							}
							this.anInt532 = local80 + local80 - this.anInt532 - 1;
							this.anInt527 = -this.anInt527;
						} while (--this.anInt533 != 0);
					}
				} else {
					@Pc(321) int local321;
					if (this.anInt527 < 0) {
						if (this.anInt532 >= local80) {
							return;
						}
						local321 = (local85 - this.anInt532 - 1) / local95;
						if (local321 < this.anInt533) {
							this.anInt532 += local95 * local321;
							this.anInt533 -= local321;
							return;
						}
						this.anInt532 += local95 * this.anInt533;
						this.anInt533 = 0;
					} else if (this.anInt532 >= local85) {
						local321 = (this.anInt532 - local80) / local95;
						if (local321 < this.anInt533) {
							this.anInt532 -= local95 * local321;
							this.anInt533 -= local321;
							return;
						}
						this.anInt532 -= local95 * this.anInt533;
						this.anInt533 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt527 < 0) {
				if (this.anInt532 < 0) {
					this.anInt532 = 0;
					this.method2073();
					return;
				}
			} else if (this.anInt532 >= local91) {
				this.anInt532 = local91 - 1;
				this.method2073();
			}
		} else if (this.aBoolean20) {
			if (this.anInt527 < 0) {
				if (this.anInt532 >= local80) {
					return;
				}
				this.anInt532 = local80 + local80 - this.anInt532 - 1;
				this.anInt527 = -this.anInt527;
			}
			while (this.anInt532 >= local85) {
				this.anInt532 = local85 + local85 - this.anInt532 - 1;
				this.anInt527 = -this.anInt527;
				if (this.anInt532 >= local80) {
					return;
				}
				this.anInt532 = local80 + local80 - this.anInt532 - 1;
				this.anInt527 = -this.anInt527;
			}
		} else if (this.anInt527 < 0) {
			if (this.anInt532 < local80) {
				this.anInt532 = local85 - (local85 - 1 - this.anInt532) % local95 - 1;
			}
		} else if (this.anInt532 >= local85) {
			this.anInt532 = local80 + (this.anInt532 - local80) % local95;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
	private int method399() {
		return this.anInt528 < 0 ? -this.anInt523 : (int) ((double) this.anInt523 * Math.sqrt((double) this.anInt528 * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()Z")
	private boolean method403() {
		if (this.anInt526 != 0 && Static35.aBoolean50 != (this.anInt535 != Integer.MIN_VALUE)) {
			this.anInt523 = this.anInt529 == Integer.MIN_VALUE ? 0 : this.anInt529;
			this.anInt528 = this.anInt531;
			this.anInt526 = 0;
			if (this.anInt529 == Integer.MIN_VALUE) {
				this.method2073();
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	private synchronized void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt523 = arg0;
		this.anInt528 = arg1;
		this.anInt526 = 0;
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public synchronized void method405(@OriginalArg(0) int arg0) {
		this.anInt533 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method2057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.method403()) {
			return 0;
		} else if (this.anInt523 == 0 && (this.anInt526 == 0 || this.anInt529 == 0 || this.anInt529 == Integer.MIN_VALUE)) {
			this.method2059(arg2);
			return 0;
		} else {
			@Pc(26) Class2_Sub2_Sub1 local26 = (Class2_Sub2_Sub1) super.aClass2_Sub2_3;
			@Pc(31) int local31 = this.anInt525 << 8;
			@Pc(36) int local36 = this.anInt534 << 8;
			@Pc(42) int local42 = local26.aByteArray2.length << 8;
			@Pc(46) int local46 = local36 - local31;
			if (local46 <= 0) {
				this.anInt533 = 0;
			}
			@Pc(53) int local53 = arg1;
			@Pc(57) int local57 = arg2 + arg1;
			if (this.anInt533 >= 0) {
				if (this.anInt533 > 0) {
					if (this.aBoolean20) {
						label121: {
							if (this.anInt527 < 0) {
								local53 = this.method411(arg0, arg1, local31, local57, local26.aByteArray2[this.anInt525]);
								if (this.anInt532 >= local31) {
									return 1;
								}
								this.anInt532 = local31 + local31 - this.anInt532 - 1;
								this.anInt527 = -this.anInt527;
								if (--this.anInt533 == 0) {
									break label121;
								}
							}
							do {
								local53 = this.method421(arg0, local53, local36, local57, local26.aByteArray2[this.anInt534 - 1]);
								if (this.anInt532 < local36) {
									return 1;
								}
								this.anInt532 = local36 + local36 - this.anInt532 - 1;
								this.anInt527 = -this.anInt527;
								if (--this.anInt533 == 0) {
									break;
								}
								local53 = this.method411(arg0, local53, local31, local57, local26.aByteArray2[this.anInt525]);
								if (this.anInt532 >= local31) {
									return 1;
								}
								this.anInt532 = local31 + local31 - this.anInt532 - 1;
								this.anInt527 = -this.anInt527;
							} while (--this.anInt533 != 0);
						}
					} else {
						@Pc(403) int local403;
						if (this.anInt527 < 0) {
							while (true) {
								local53 = this.method411(arg0, local53, local31, local57, local26.aByteArray2[this.anInt534 - 1]);
								if (this.anInt532 >= local31) {
									return 1;
								}
								local403 = (local36 - this.anInt532 - 1) / local46;
								if (local403 >= this.anInt533) {
									this.anInt532 += local46 * this.anInt533;
									this.anInt533 = 0;
									break;
								}
								this.anInt532 += local46 * local403;
								this.anInt533 -= local403;
							}
						} else {
							while (true) {
								local53 = this.method421(arg0, local53, local36, local57, local26.aByteArray2[this.anInt525]);
								if (this.anInt532 < local36) {
									return 1;
								}
								local403 = (this.anInt532 - local31) / local46;
								if (local403 >= this.anInt533) {
									this.anInt532 -= local46 * this.anInt533;
									this.anInt533 = 0;
									break;
								}
								this.anInt532 -= local46 * local403;
								this.anInt533 -= local403;
							}
						}
					}
				}
				if (this.anInt527 < 0) {
					this.method411(arg0, local53, 0, local57, 0);
					if (this.anInt532 < 0) {
						this.anInt532 = 0;
						this.method2073();
					}
				} else {
					this.method421(arg0, local53, local42, local57, 0);
					if (this.anInt532 >= local42) {
						this.anInt532 = local42 - 1;
						this.method2073();
					}
				}
				return 1;
			} else if (this.aBoolean20) {
				if (this.anInt527 < 0) {
					local53 = this.method411(arg0, arg1, local31, local57, local26.aByteArray2[this.anInt525]);
					if (this.anInt532 >= local31) {
						return 1;
					}
					this.anInt532 = local31 + local31 - this.anInt532 - 1;
					this.anInt527 = -this.anInt527;
				}
				while (true) {
					local53 = this.method421(arg0, local53, local36, local57, local26.aByteArray2[this.anInt534 - 1]);
					if (this.anInt532 < local36) {
						return 1;
					}
					this.anInt532 = local36 + local36 - this.anInt532 - 1;
					this.anInt527 = -this.anInt527;
					local53 = this.method411(arg0, local53, local31, local57, local26.aByteArray2[this.anInt525]);
					if (this.anInt532 >= local31) {
						return 1;
					}
					this.anInt532 = local31 + local31 - this.anInt532 - 1;
					this.anInt527 = -this.anInt527;
				}
			} else if (this.anInt527 < 0) {
				while (true) {
					local53 = this.method411(arg0, local53, local31, local57, local26.aByteArray2[this.anInt534 - 1]);
					if (this.anInt532 >= local31) {
						return 1;
					}
					this.anInt532 = local36 - (local36 - 1 - this.anInt532) % local46 - 1;
				}
			} else {
				while (true) {
					local53 = this.method421(arg0, local53, local36, local57, local26.aByteArray2[this.anInt525]);
					if (this.anInt532 < local36) {
						return 1;
					}
					this.anInt532 = local31 + (this.anInt532 - local31) % local46;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()I")
	private synchronized int method410() {
		return this.anInt526 > 0 ? this.anInt531 : this.anInt528;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([IIIII)I")
	private int method411(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt526 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt526;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt526 += arg1;
			if (this.anInt527 == -256 && (this.anInt532 & 0xFF) == 0) {
				if (Static35.aBoolean50) {
					arg1 = Static121.method409(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt528, this.anInt524, this.anInt530, this.anInt535, local7, arg2, this);
				} else {
					arg1 = Static121.method397(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt524, this.anInt530, local7, arg2, this);
				}
			} else if (Static35.aBoolean50) {
				arg1 = Static121.method415(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt528, this.anInt524, this.anInt530, this.anInt535, local7, arg2, this, this.anInt527, arg4);
			} else {
				arg1 = Static121.method417(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt524, this.anInt530, local7, arg2, this, this.anInt527, arg4);
			}
			this.anInt526 -= arg1;
			if (this.anInt526 != 0) {
				return arg1;
			}
			this.anInt528 = this.anInt531;
			if (this.anInt529 == Integer.MIN_VALUE) {
				this.anInt523 = 0;
				this.method2073();
				return arg3;
			}
			this.anInt523 = this.anInt529;
		}
		if (this.anInt527 == -256 && (this.anInt532 & 0xFF) == 0) {
			return Static35.aBoolean50 ? Static121.method413(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.method419(), this.method399(), arg3, arg2, this) : Static121.method396(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, arg3, arg2, this);
		} else if (Static35.aBoolean50) {
			return Static121.method406(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.method419(), this.method399(), arg3, arg2, this, this.anInt527, arg4);
		} else {
			return Static121.method408(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, arg3, arg2, this, this.anInt527, arg4);
		}
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	public synchronized void method414(@OriginalArg(0) int arg0) {
		this.method404(arg0, this.method410());
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
	@Override
	public int method2058() {
		@Pc(4) int local4 = this.anInt523 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt533 == 0) {
			local4 -= local4 * this.anInt532 / (((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2.length << 8);
		} else if (this.anInt533 >= 0) {
			local4 -= local4 * this.anInt525 / ((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()Z")
	public boolean method418() {
		return this.method2070();
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "()I")
	private int method419() {
		return this.anInt528 < 0 ? this.anInt523 : (int) ((double) this.anInt523 * Math.sqrt((double) (256 - this.anInt528) * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "([IIIII)I")
	private int method421(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt526 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt526;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt526 += arg1;
			if (this.anInt527 == 256 && (this.anInt532 & 0xFF) == 0) {
				if (Static35.aBoolean50) {
					arg1 = Static121.method401(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt528, this.anInt524, this.anInt530, this.anInt535, local7, arg2, this);
				} else {
					arg1 = Static121.method395(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt524, this.anInt530, local7, arg2, this);
				}
			} else if (Static35.aBoolean50) {
				arg1 = Static121.method398(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt528, this.anInt524, this.anInt530, this.anInt535, local7, arg2, this, this.anInt527, arg4);
			} else {
				arg1 = Static121.method412(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, this.anInt524, this.anInt530, local7, arg2, this, this.anInt527, arg4);
			}
			this.anInt526 -= arg1;
			if (this.anInt526 != 0) {
				return arg1;
			}
			this.anInt528 = this.anInt531;
			if (this.anInt529 == Integer.MIN_VALUE) {
				this.anInt523 = 0;
				this.method2073();
				return arg3;
			}
			this.anInt523 = this.anInt529;
		}
		if (this.anInt527 == 256 && (this.anInt532 & 0xFF) == 0) {
			return Static35.aBoolean50 ? Static121.method402(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.method419(), this.method399(), arg3, arg2, this) : Static121.method416(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, arg3, arg2, this);
		} else if (Static35.aBoolean50) {
			return Static121.method400(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.method419(), this.method399(), arg3, arg2, this, this.anInt527, arg4);
		} else {
			return Static121.method420(((Class2_Sub2_Sub1) super.aClass2_Sub2_3).aByteArray2, arg0, this.anInt532, arg1, this.anInt523, arg3, arg2, this, this.anInt527, arg4);
		}
	}
}
