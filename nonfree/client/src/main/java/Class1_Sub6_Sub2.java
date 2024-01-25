import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
	private int anInt2597;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	public int anInt2598;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
	public int anInt2599;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	public int anInt2601;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
	public int anInt2602;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	public int anInt2604;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public int anInt2610;

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
	private final int anInt2609;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
	private final int anInt2606;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
	private final boolean aBoolean191;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	private int anInt2603;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
	private int anInt2600;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
	private int anInt2608;

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
	public int anInt2607;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!ua;II)V")
	public Class1_Sub6_Sub2(@OriginalArg(0) Class1_Sub39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub39_5 = arg0;
		this.anInt2609 = arg0.anInt6077;
		this.anInt2606 = arg0.anInt6075;
		this.aBoolean191 = arg0.aBoolean453;
		this.anInt2603 = arg1;
		this.anInt2600 = arg2;
		this.anInt2608 = 8192;
		this.anInt2607 = 0;
		this.method2501();
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!ua;III)V")
	public Class1_Sub6_Sub2(@OriginalArg(0) Class1_Sub39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub39_5 = arg0;
		this.anInt2609 = arg0.anInt6077;
		this.anInt2606 = arg0.anInt6075;
		this.aBoolean191 = arg0.aBoolean453;
		this.anInt2603 = arg1;
		this.anInt2600 = arg2;
		this.anInt2608 = arg3;
		this.anInt2607 = 0;
		this.method2501();
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "()Z")
	public boolean method2490() {
		return this.anInt2607 < 0 || this.anInt2607 >= ((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89.length << 8;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()I")
	@Override
	public int method4053() {
		@Pc(6) int local6 = this.anInt2601 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2597 == 0) {
			local6 -= local6 * this.anInt2607 / (((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89.length << 8);
		} else if (this.anInt2597 >= 0) {
			local6 -= local6 * this.anInt2609 / ((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "()Z")
	private boolean method2493() {
		@Pc(2) int local2 = this.anInt2600;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static372.method2526(local2, this.anInt2608);
			local8 = Static372.method2506(local2, this.anInt2608);
		}
		if (this.anInt2601 != local2 || this.anInt2610 != local10 || this.anInt2602 != local8) {
			if (this.anInt2601 < local2) {
				this.anInt2599 = 1;
				this.anInt2605 = local2 - this.anInt2601;
			} else if (this.anInt2601 > local2) {
				this.anInt2599 = -1;
				this.anInt2605 = this.anInt2601 - local2;
			} else {
				this.anInt2599 = 0;
			}
			if (this.anInt2610 < local10) {
				this.anInt2604 = 1;
				if (this.anInt2605 == 0 || this.anInt2605 > local10 - this.anInt2610) {
					this.anInt2605 = local10 - this.anInt2610;
				}
			} else if (this.anInt2610 > local10) {
				this.anInt2604 = -1;
				if (this.anInt2605 == 0 || this.anInt2605 > this.anInt2610 - local10) {
					this.anInt2605 = this.anInt2610 - local10;
				}
			} else {
				this.anInt2604 = 0;
			}
			if (this.anInt2602 < local8) {
				this.anInt2598 = 1;
				if (this.anInt2605 == 0 || this.anInt2605 > local8 - this.anInt2602) {
					this.anInt2605 = local8 - this.anInt2602;
				}
			} else if (this.anInt2602 > local8) {
				this.anInt2598 = -1;
				if (this.anInt2605 == 0 || this.anInt2605 > this.anInt2602 - local8) {
					this.anInt2605 = this.anInt2602 - local8;
				}
			} else {
				this.anInt2598 = 0;
			}
			return false;
		} else if (this.anInt2600 == Integer.MIN_VALUE) {
			this.anInt2600 = 0;
			this.anInt2601 = this.anInt2610 = this.anInt2602 = 0;
			this.method6045();
			return true;
		} else {
			this.method2501();
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "()I")
	@Override
	public int method4057() {
		return this.anInt2600 == 0 && this.anInt2605 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public synchronized void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2519(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static372.method2526(arg1, arg2);
		@Pc(14) int local14 = Static372.method2506(arg1, arg2);
		if (this.anInt2610 == local10 && this.anInt2602 == local14) {
			this.anInt2605 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2601;
		if (this.anInt2601 - arg1 > local31) {
			local31 = this.anInt2601 - arg1;
		}
		if (local10 - this.anInt2610 > local31) {
			local31 = local10 - this.anInt2610;
		}
		if (this.anInt2610 - local10 > local31) {
			local31 = this.anInt2610 - local10;
		}
		if (local14 - this.anInt2602 > local31) {
			local31 = local14 - this.anInt2602;
		}
		if (this.anInt2602 - local14 > local31) {
			local31 = this.anInt2602 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2605 = arg0;
		this.anInt2600 = arg1;
		this.anInt2608 = arg2;
		this.anInt2599 = (arg1 - this.anInt2601) / arg0;
		this.anInt2604 = (local10 - this.anInt2610) / arg0;
		this.anInt2598 = (local14 - this.anInt2602) / arg0;
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "()Z")
	public boolean method2496() {
		return this.anInt2605 != 0;
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "()V")
	private void method2501() {
		this.anInt2601 = this.anInt2600;
		this.anInt2610 = Static372.method2526(this.anInt2600, this.anInt2608);
		this.anInt2602 = Static372.method2506(this.anInt2600, this.anInt2608);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4051(@OriginalArg(0) int arg0) {
		if (this.anInt2605 > 0) {
			if (arg0 >= this.anInt2605) {
				if (this.anInt2600 == Integer.MIN_VALUE) {
					this.anInt2600 = 0;
					this.anInt2601 = this.anInt2610 = this.anInt2602 = 0;
					this.method6045();
					arg0 = this.anInt2605;
				}
				this.anInt2605 = 0;
				this.method2501();
			} else {
				this.anInt2601 += this.anInt2599 * arg0;
				this.anInt2610 += this.anInt2604 * arg0;
				this.anInt2602 += this.anInt2598 * arg0;
				this.anInt2605 -= arg0;
			}
		}
		@Pc(71) Class1_Sub39_Sub1 local71 = (Class1_Sub39_Sub1) super.aClass1_Sub39_5;
		@Pc(76) int local76 = this.anInt2609 << 8;
		@Pc(81) int local81 = this.anInt2606 << 8;
		@Pc(87) int local87 = local71.aByteArray89.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2597 = 0;
		}
		if (this.anInt2607 < 0) {
			if (this.anInt2603 <= 0) {
				this.method2512();
				this.method6045();
				return;
			}
			this.anInt2607 = 0;
		}
		if (this.anInt2607 >= local87) {
			if (this.anInt2603 >= 0) {
				this.method2512();
				this.method6045();
				return;
			}
			this.anInt2607 = local87 - 1;
		}
		this.anInt2607 += this.anInt2603 * arg0;
		if (this.anInt2597 >= 0) {
			if (this.anInt2597 > 0) {
				if (this.aBoolean191) {
					label125: {
						if (this.anInt2603 < 0) {
							if (this.anInt2607 >= local76) {
								return;
							}
							this.anInt2607 = local76 + local76 - this.anInt2607 - 1;
							this.anInt2603 = -this.anInt2603;
							if (--this.anInt2597 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2607 < local81) {
								return;
							}
							this.anInt2607 = local81 + local81 - this.anInt2607 - 1;
							this.anInt2603 = -this.anInt2603;
							if (--this.anInt2597 == 0) {
								break;
							}
							if (this.anInt2607 >= local76) {
								return;
							}
							this.anInt2607 = local76 + local76 - this.anInt2607 - 1;
							this.anInt2603 = -this.anInt2603;
						} while (--this.anInt2597 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2603 < 0) {
						if (this.anInt2607 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2607 - 1) / local91;
						if (local361 < this.anInt2597) {
							this.anInt2607 += local91 * local361;
							this.anInt2597 -= local361;
							return;
						}
						this.anInt2607 += local91 * this.anInt2597;
						this.anInt2597 = 0;
					} else if (this.anInt2607 >= local81) {
						local361 = (this.anInt2607 - local76) / local91;
						if (local361 < this.anInt2597) {
							this.anInt2607 -= local91 * local361;
							this.anInt2597 -= local361;
							return;
						}
						this.anInt2607 -= local91 * this.anInt2597;
						this.anInt2597 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2603 < 0) {
				if (this.anInt2607 < 0) {
					this.anInt2607 = -1;
					this.method2512();
					this.method6045();
					return;
				}
			} else if (this.anInt2607 >= local87) {
				this.anInt2607 = local87;
				this.method2512();
				this.method6045();
			}
		} else if (this.aBoolean191) {
			if (this.anInt2603 < 0) {
				if (this.anInt2607 >= local76) {
					return;
				}
				this.anInt2607 = local76 + local76 - this.anInt2607 - 1;
				this.anInt2603 = -this.anInt2603;
			}
			while (this.anInt2607 >= local81) {
				this.anInt2607 = local81 + local81 - this.anInt2607 - 1;
				this.anInt2603 = -this.anInt2603;
				if (this.anInt2607 >= local76) {
					return;
				}
				this.anInt2607 = local76 + local76 - this.anInt2607 - 1;
				this.anInt2603 = -this.anInt2603;
			}
		} else if (this.anInt2603 < 0) {
			if (this.anInt2607 < local76) {
				this.anInt2607 = local81 - (local81 - 1 - this.anInt2607) % local91 - 1;
			}
		} else if (this.anInt2607 >= local81) {
			this.anInt2607 = local76 + (this.anInt2607 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([IIIII)I")
	private int method2505(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2605 <= 0) {
				if (this.anInt2603 == -256 && (this.anInt2607 & 0xFF) == 0) {
					if (Static100.aBoolean156) {
						return Static372.method2504(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, arg3, arg2, this);
					}
					return Static372.method2499(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, arg3, arg2, this);
				}
				if (Static100.aBoolean156) {
					return Static372.method2502(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, arg3, arg2, this, this.anInt2603, arg4);
				}
				return Static372.method2498(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, arg3, arg2, this, this.anInt2603, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2605;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2605 += arg1;
			if (this.anInt2603 == -256 && (this.anInt2607 & 0xFF) == 0) {
				if (Static100.aBoolean156) {
					arg1 = Static372.method2500(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, this.anInt2604, this.anInt2598, local5, arg2, this);
				} else {
					arg1 = Static372.method2491(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, this.anInt2599, local5, arg2, this);
				}
			} else if (Static100.aBoolean156) {
				arg1 = Static372.method2524(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, this.anInt2604, this.anInt2598, local5, arg2, this, this.anInt2603, arg4);
			} else {
				arg1 = Static372.method2518(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, this.anInt2599, local5, arg2, this, this.anInt2603, arg4);
			}
			this.anInt2605 -= arg1;
			if (this.anInt2605 != 0) {
				return arg1;
			}
		} while (!this.method2493());
		return arg3;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public synchronized void method2507(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2607 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	private synchronized void method2510() {
		this.method2519(0, this.method2523());
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
	public synchronized void method2511(@OriginalArg(0) int arg0) {
		if (this.anInt2603 < 0) {
			this.anInt2603 = -arg0;
		} else {
			this.anInt2603 = arg0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "()V")
	private void method2512() {
		if (this.anInt2605 == 0) {
			return;
		}
		if (this.anInt2600 == Integer.MIN_VALUE) {
			this.anInt2600 = 0;
		}
		this.anInt2605 = 0;
		this.method2501();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "([IIIII)I")
	private int method2513(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2605 <= 0) {
				if (this.anInt2603 == 256 && (this.anInt2607 & 0xFF) == 0) {
					if (Static100.aBoolean156) {
						return Static372.method2503(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, arg3, arg2, this);
					}
					return Static372.method2528(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, arg3, arg2, this);
				}
				if (Static100.aBoolean156) {
					return Static372.method2497(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, arg3, arg2, this, this.anInt2603, arg4);
				}
				return Static372.method2492(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, arg3, arg2, this, this.anInt2603, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2605;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2605 += arg1;
			if (this.anInt2603 == 256 && (this.anInt2607 & 0xFF) == 0) {
				if (Static100.aBoolean156) {
					arg1 = Static372.method2522(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, this.anInt2604, this.anInt2598, local5, arg2, this);
				} else {
					arg1 = Static372.method2515(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, this.anInt2599, local5, arg2, this);
				}
			} else if (Static100.aBoolean156) {
				arg1 = Static372.method2509(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2610, this.anInt2602, this.anInt2604, this.anInt2598, local5, arg2, this, this.anInt2603, arg4);
			} else {
				arg1 = Static372.method2495(((Class1_Sub39_Sub1) super.aClass1_Sub39_5).aByteArray89, arg0, this.anInt2607, arg1, this.anInt2601, this.anInt2599, local5, arg2, this, this.anInt2603, arg4);
			}
			this.anInt2605 -= arg1;
			if (this.anInt2605 != 0) {
				return arg1;
			}
		} while (!this.method2493());
		return arg3;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public synchronized void method2514() {
		this.anInt2603 = (this.anInt2603 ^ this.anInt2603 >> 31) + (this.anInt2603 >>> 31);
		this.anInt2603 = -this.anInt2603;
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "()I")
	public synchronized int method2516() {
		return this.anInt2603 < 0 ? -this.anInt2603 : this.anInt2603;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()Lclient!ar;")
	@Override
	public Class1_Sub6 method4054() {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public synchronized void method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2494(arg0, arg1, this.method2523());
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
	private synchronized void method2519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2600 = arg0;
		this.anInt2608 = arg1;
		this.anInt2605 = 0;
		this.method2501();
	}

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "()I")
	public synchronized int method2520() {
		return this.anInt2600 == Integer.MIN_VALUE ? 0 : this.anInt2600;
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
	public synchronized void method2521(@OriginalArg(0) int arg0) {
		this.method2519(arg0 << 6, this.method2523());
	}

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "()I")
	public synchronized int method2523() {
		return this.anInt2608 < 0 ? -1 : this.anInt2608;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2600 == 0 && this.anInt2605 == 0) {
			this.method4051(arg2);
			return;
		}
		@Pc(13) Class1_Sub39_Sub1 local13 = (Class1_Sub39_Sub1) super.aClass1_Sub39_5;
		@Pc(18) int local18 = this.anInt2609 << 8;
		@Pc(23) int local23 = this.anInt2606 << 8;
		@Pc(29) int local29 = local13.aByteArray89.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2597 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2607 < 0) {
			if (this.anInt2603 <= 0) {
				this.method2512();
				this.method6045();
				return;
			}
			this.anInt2607 = 0;
		}
		if (this.anInt2607 >= local29) {
			if (this.anInt2603 >= 0) {
				this.method2512();
				this.method6045();
				return;
			}
			this.anInt2607 = local29 - 1;
		}
		if (this.anInt2597 >= 0) {
			if (this.anInt2597 > 0) {
				if (this.aBoolean191) {
					label130: {
						if (this.anInt2603 < 0) {
							local40 = this.method2505(arg0, arg1, local18, local44, local13.aByteArray89[this.anInt2609]);
							if (this.anInt2607 >= local18) {
								return;
							}
							this.anInt2607 = local18 + local18 - this.anInt2607 - 1;
							this.anInt2603 = -this.anInt2603;
							if (--this.anInt2597 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2513(arg0, local40, local23, local44, local13.aByteArray89[this.anInt2606 - 1]);
							if (this.anInt2607 < local23) {
								return;
							}
							this.anInt2607 = local23 + local23 - this.anInt2607 - 1;
							this.anInt2603 = -this.anInt2603;
							if (--this.anInt2597 == 0) {
								break;
							}
							local40 = this.method2505(arg0, local40, local18, local44, local13.aByteArray89[this.anInt2609]);
							if (this.anInt2607 >= local18) {
								return;
							}
							this.anInt2607 = local18 + local18 - this.anInt2607 - 1;
							this.anInt2603 = -this.anInt2603;
						} while (--this.anInt2597 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2603 < 0) {
						while (true) {
							local40 = this.method2505(arg0, local40, local18, local44, local13.aByteArray89[this.anInt2606 - 1]);
							if (this.anInt2607 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2607 - 1) / local33;
							if (local416 >= this.anInt2597) {
								this.anInt2607 += local33 * this.anInt2597;
								this.anInt2597 = 0;
								break;
							}
							this.anInt2607 += local33 * local416;
							this.anInt2597 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2513(arg0, local40, local23, local44, local13.aByteArray89[this.anInt2609]);
							if (this.anInt2607 < local23) {
								return;
							}
							local416 = (this.anInt2607 - local18) / local33;
							if (local416 >= this.anInt2597) {
								this.anInt2607 -= local33 * this.anInt2597;
								this.anInt2597 = 0;
								break;
							}
							this.anInt2607 -= local33 * local416;
							this.anInt2597 -= local416;
						}
					}
				}
			}
			if (this.anInt2603 < 0) {
				this.method2505(arg0, local40, 0, local44, 0);
				if (this.anInt2607 < 0) {
					this.anInt2607 = -1;
					this.method2512();
					this.method6045();
					return;
				}
			} else {
				this.method2513(arg0, local40, local29, local44, 0);
				if (this.anInt2607 >= local29) {
					this.anInt2607 = local29;
					this.method2512();
					this.method6045();
				}
			}
		} else if (this.aBoolean191) {
			if (this.anInt2603 < 0) {
				local40 = this.method2505(arg0, arg1, local18, local44, local13.aByteArray89[this.anInt2609]);
				if (this.anInt2607 >= local18) {
					return;
				}
				this.anInt2607 = local18 + local18 - this.anInt2607 - 1;
				this.anInt2603 = -this.anInt2603;
			}
			while (true) {
				local40 = this.method2513(arg0, local40, local23, local44, local13.aByteArray89[this.anInt2606 - 1]);
				if (this.anInt2607 < local23) {
					return;
				}
				this.anInt2607 = local23 + local23 - this.anInt2607 - 1;
				this.anInt2603 = -this.anInt2603;
				local40 = this.method2505(arg0, local40, local18, local44, local13.aByteArray89[this.anInt2609]);
				if (this.anInt2607 >= local18) {
					return;
				}
				this.anInt2607 = local18 + local18 - this.anInt2607 - 1;
				this.anInt2603 = -this.anInt2603;
			}
		} else if (this.anInt2603 < 0) {
			while (true) {
				local40 = this.method2505(arg0, local40, local18, local44, local13.aByteArray89[this.anInt2606 - 1]);
				if (this.anInt2607 >= local18) {
					return;
				}
				this.anInt2607 = local23 - (local23 - 1 - this.anInt2607) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2513(arg0, local40, local23, local44, local13.aByteArray89[this.anInt2609]);
				if (this.anInt2607 < local23) {
					return;
				}
				this.anInt2607 = local18 + (this.anInt2607 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public Class1_Sub6 method4056() {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V")
	public synchronized void method2527(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2510();
			this.method6045();
		} else if (this.anInt2610 == 0 && this.anInt2602 == 0) {
			this.anInt2605 = 0;
			this.anInt2600 = 0;
			this.anInt2601 = 0;
			this.method6045();
		} else {
			@Pc(31) int local31 = -this.anInt2601;
			if (this.anInt2601 > local31) {
				local31 = this.anInt2601;
			}
			if (-this.anInt2610 > local31) {
				local31 = -this.anInt2610;
			}
			if (this.anInt2610 > local31) {
				local31 = this.anInt2610;
			}
			if (-this.anInt2602 > local31) {
				local31 = -this.anInt2602;
			}
			if (this.anInt2602 > local31) {
				local31 = this.anInt2602;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2605 = arg0;
			this.anInt2600 = Integer.MIN_VALUE;
			this.anInt2599 = -this.anInt2601 / arg0;
			this.anInt2604 = -this.anInt2610 / arg0;
			this.anInt2598 = -this.anInt2602 / arg0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V")
	public synchronized void method2529(@OriginalArg(0) int arg0) {
		this.anInt2597 = arg0;
	}
}
