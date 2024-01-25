import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class6_Sub18_Sub1 extends Class6_Sub18 {

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public int anInt3046;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	public int anInt3047;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	public int anInt3051;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	private int anInt3053;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	private int anInt3054;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	public int anInt3055;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	public int anInt3056;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	private final int anInt3045;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	private final int anInt3048;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Z")
	private final boolean aBoolean221;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	private int anInt3050;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	private int anInt3049;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ft;II)V")
	public Class6_Sub18_Sub1(@OriginalArg(0) Class6_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub19_5 = arg0;
		this.anInt3045 = arg0.anInt3209;
		this.anInt3048 = arg0.anInt3211;
		this.aBoolean221 = arg0.aBoolean237;
		this.anInt3050 = arg1;
		this.anInt3044 = arg2;
		this.anInt3049 = 8192;
		this.anInt3052 = 0;
		this.method2708();
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ft;III)V")
	public Class6_Sub18_Sub1(@OriginalArg(0) Class6_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub19_5 = arg0;
		this.anInt3045 = arg0.anInt3209;
		this.anInt3048 = arg0.anInt3211;
		this.aBoolean221 = arg0.aBoolean237;
		this.anInt3050 = arg1;
		this.anInt3044 = arg2;
		this.anInt3049 = arg3;
		this.anInt3052 = 0;
		this.method2708();
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "()I")
	public synchronized int method2679() {
		return this.anInt3049 < 0 ? -1 : this.anInt3049;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public Class6_Sub18 method6371() {
		return null;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "()V")
	private void method2681() {
		if (this.anInt3053 == 0) {
			return;
		}
		if (this.anInt3044 == Integer.MIN_VALUE) {
			this.anInt3044 = 0;
		}
		this.anInt3053 = 0;
		this.method2708();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public synchronized void method2685(@OriginalArg(0) int arg0) {
		this.anInt3054 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	public synchronized void method2686(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3052 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class6_Sub18 method6374() {
		return null;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "()Z")
	public boolean method2688() {
		return this.anInt3053 != 0;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "()I")
	public synchronized int method2689() {
		return this.anInt3044 == Integer.MIN_VALUE ? 0 : this.anInt3044;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([IIIII)I")
	private int method2690(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3053 <= 0) {
				if (this.anInt3050 == 256 && (this.anInt3052 & 0xFF) == 0) {
					if (Static341.aBoolean438) {
						return Static600.method2698(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, arg3, arg2, this);
					}
					return Static600.method2675(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, arg3, arg2, this);
				}
				if (Static341.aBoolean438) {
					return Static600.method2710(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, arg3, arg2, this, this.anInt3050, arg4);
				}
				return Static600.method2683(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, arg3, arg2, this, this.anInt3050, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3053;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3053 += arg1;
			if (this.anInt3050 == 256 && (this.anInt3052 & 0xFF) == 0) {
				if (Static341.aBoolean438) {
					arg1 = Static600.method2711(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, this.anInt3055, this.anInt3047, local5, arg2, this);
				} else {
					arg1 = Static600.method2695(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, this.anInt3051, local5, arg2, this);
				}
			} else if (Static341.aBoolean438) {
				arg1 = Static600.method2676(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, this.anInt3055, this.anInt3047, local5, arg2, this, this.anInt3050, arg4);
			} else {
				arg1 = Static600.method2703(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, this.anInt3051, local5, arg2, this, this.anInt3050, arg4);
			}
			this.anInt3053 -= arg1;
			if (this.anInt3053 != 0) {
				return arg1;
			}
		} while (!this.method2705());
		return arg3;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public synchronized void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2694(arg0, arg1, this.method2679());
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6377(@OriginalArg(0) int arg0) {
		if (this.anInt3053 > 0) {
			if (arg0 >= this.anInt3053) {
				if (this.anInt3044 == Integer.MIN_VALUE) {
					this.anInt3044 = 0;
					this.anInt3056 = this.anInt3043 = this.anInt3046 = 0;
					this.method7804();
					arg0 = this.anInt3053;
				}
				this.anInt3053 = 0;
				this.method2708();
			} else {
				this.anInt3056 += this.anInt3051 * arg0;
				this.anInt3043 += this.anInt3055 * arg0;
				this.anInt3046 += this.anInt3047 * arg0;
				this.anInt3053 -= arg0;
			}
		}
		@Pc(71) Class6_Sub19_Sub1 local71 = (Class6_Sub19_Sub1) super.aClass6_Sub19_5;
		@Pc(76) int local76 = this.anInt3045 << 8;
		@Pc(81) int local81 = this.anInt3048 << 8;
		@Pc(87) int local87 = local71.aByteArray13.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3054 = 0;
		}
		if (this.anInt3052 < 0) {
			if (this.anInt3050 <= 0) {
				this.method2681();
				this.method7804();
				return;
			}
			this.anInt3052 = 0;
		}
		if (this.anInt3052 >= local87) {
			if (this.anInt3050 >= 0) {
				this.method2681();
				this.method7804();
				return;
			}
			this.anInt3052 = local87 - 1;
		}
		this.anInt3052 += this.anInt3050 * arg0;
		if (this.anInt3054 >= 0) {
			if (this.anInt3054 > 0) {
				if (this.aBoolean221) {
					label125: {
						if (this.anInt3050 < 0) {
							if (this.anInt3052 >= local76) {
								return;
							}
							this.anInt3052 = local76 + local76 - this.anInt3052 - 1;
							this.anInt3050 = -this.anInt3050;
							if (--this.anInt3054 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3052 < local81) {
								return;
							}
							this.anInt3052 = local81 + local81 - this.anInt3052 - 1;
							this.anInt3050 = -this.anInt3050;
							if (--this.anInt3054 == 0) {
								break;
							}
							if (this.anInt3052 >= local76) {
								return;
							}
							this.anInt3052 = local76 + local76 - this.anInt3052 - 1;
							this.anInt3050 = -this.anInt3050;
						} while (--this.anInt3054 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3050 < 0) {
						if (this.anInt3052 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3052 - 1) / local91;
						if (local361 < this.anInt3054) {
							this.anInt3052 += local91 * local361;
							this.anInt3054 -= local361;
							return;
						}
						this.anInt3052 += local91 * this.anInt3054;
						this.anInt3054 = 0;
					} else if (this.anInt3052 >= local81) {
						local361 = (this.anInt3052 - local76) / local91;
						if (local361 < this.anInt3054) {
							this.anInt3052 -= local91 * local361;
							this.anInt3054 -= local361;
							return;
						}
						this.anInt3052 -= local91 * this.anInt3054;
						this.anInt3054 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3050 < 0) {
				if (this.anInt3052 < 0) {
					this.anInt3052 = -1;
					this.method2681();
					this.method7804();
					return;
				}
			} else if (this.anInt3052 >= local87) {
				this.anInt3052 = local87;
				this.method2681();
				this.method7804();
			}
		} else if (this.aBoolean221) {
			if (this.anInt3050 < 0) {
				if (this.anInt3052 >= local76) {
					return;
				}
				this.anInt3052 = local76 + local76 - this.anInt3052 - 1;
				this.anInt3050 = -this.anInt3050;
			}
			while (this.anInt3052 >= local81) {
				this.anInt3052 = local81 + local81 - this.anInt3052 - 1;
				this.anInt3050 = -this.anInt3050;
				if (this.anInt3052 >= local76) {
					return;
				}
				this.anInt3052 = local76 + local76 - this.anInt3052 - 1;
				this.anInt3050 = -this.anInt3050;
			}
		} else if (this.anInt3050 < 0) {
			if (this.anInt3052 < local76) {
				this.anInt3052 = local81 - (local81 - 1 - this.anInt3052) % local91 - 1;
			}
		} else if (this.anInt3052 >= local81) {
			this.anInt3052 = local76 + (this.anInt3052 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "()Z")
	public boolean method2693() {
		return this.anInt3052 < 0 || this.anInt3052 >= ((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13.length << 8;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public synchronized void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2713(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static600.method2684(arg1, arg2);
		@Pc(14) int local14 = Static600.method2702(arg1, arg2);
		if (this.anInt3043 == local10 && this.anInt3046 == local14) {
			this.anInt3053 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3056;
		if (this.anInt3056 - arg1 > local31) {
			local31 = this.anInt3056 - arg1;
		}
		if (local10 - this.anInt3043 > local31) {
			local31 = local10 - this.anInt3043;
		}
		if (this.anInt3043 - local10 > local31) {
			local31 = this.anInt3043 - local10;
		}
		if (local14 - this.anInt3046 > local31) {
			local31 = local14 - this.anInt3046;
		}
		if (this.anInt3046 - local14 > local31) {
			local31 = this.anInt3046 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3053 = arg0;
		this.anInt3044 = arg1;
		this.anInt3049 = arg2;
		this.anInt3051 = (arg1 - this.anInt3056) / arg0;
		this.anInt3055 = (local10 - this.anInt3043) / arg0;
		this.anInt3047 = (local14 - this.anInt3046) / arg0;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	public synchronized void method2696(@OriginalArg(0) int arg0) {
		if (this.anInt3050 < 0) {
			this.anInt3050 = -arg0;
		} else {
			this.anInt3050 = arg0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
	public synchronized void method2697(@OriginalArg(0) int arg0) {
		this.method2713(arg0 << 6, this.method2679());
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
	public synchronized void method2699(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2701();
			this.method7804();
		} else if (this.anInt3043 == 0 && this.anInt3046 == 0) {
			this.anInt3053 = 0;
			this.anInt3044 = 0;
			this.anInt3056 = 0;
			this.method7804();
		} else {
			@Pc(31) int local31 = -this.anInt3056;
			if (this.anInt3056 > local31) {
				local31 = this.anInt3056;
			}
			if (-this.anInt3043 > local31) {
				local31 = -this.anInt3043;
			}
			if (this.anInt3043 > local31) {
				local31 = this.anInt3043;
			}
			if (-this.anInt3046 > local31) {
				local31 = -this.anInt3046;
			}
			if (this.anInt3046 > local31) {
				local31 = this.anInt3046;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3053 = arg0;
			this.anInt3044 = Integer.MIN_VALUE;
			this.anInt3051 = -this.anInt3056 / arg0;
			this.anInt3055 = -this.anInt3043 / arg0;
			this.anInt3047 = -this.anInt3046 / arg0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
	private synchronized void method2701() {
		this.method2713(0, this.method2679());
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "()Z")
	private boolean method2705() {
		@Pc(2) int local2 = this.anInt3044;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static600.method2684(local2, this.anInt3049);
			local8 = Static600.method2702(local2, this.anInt3049);
		}
		if (this.anInt3056 != local2 || this.anInt3043 != local10 || this.anInt3046 != local8) {
			if (this.anInt3056 < local2) {
				this.anInt3051 = 1;
				this.anInt3053 = local2 - this.anInt3056;
			} else if (this.anInt3056 > local2) {
				this.anInt3051 = -1;
				this.anInt3053 = this.anInt3056 - local2;
			} else {
				this.anInt3051 = 0;
			}
			if (this.anInt3043 < local10) {
				this.anInt3055 = 1;
				if (this.anInt3053 == 0 || this.anInt3053 > local10 - this.anInt3043) {
					this.anInt3053 = local10 - this.anInt3043;
				}
			} else if (this.anInt3043 > local10) {
				this.anInt3055 = -1;
				if (this.anInt3053 == 0 || this.anInt3053 > this.anInt3043 - local10) {
					this.anInt3053 = this.anInt3043 - local10;
				}
			} else {
				this.anInt3055 = 0;
			}
			if (this.anInt3046 < local8) {
				this.anInt3047 = 1;
				if (this.anInt3053 == 0 || this.anInt3053 > local8 - this.anInt3046) {
					this.anInt3053 = local8 - this.anInt3046;
				}
			} else if (this.anInt3046 > local8) {
				this.anInt3047 = -1;
				if (this.anInt3053 == 0 || this.anInt3053 > this.anInt3046 - local8) {
					this.anInt3053 = this.anInt3046 - local8;
				}
			} else {
				this.anInt3047 = 0;
			}
			return false;
		} else if (this.anInt3044 == Integer.MIN_VALUE) {
			this.anInt3044 = 0;
			this.anInt3056 = this.anInt3043 = this.anInt3046 = 0;
			this.method7804();
			return true;
		} else {
			this.method2708();
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "()I")
	public synchronized int method2706() {
		return this.anInt3050 < 0 ? -this.anInt3050 : this.anInt3050;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
	@Override
	public int method6373() {
		@Pc(6) int local6 = this.anInt3056 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3054 == 0) {
			local6 -= local6 * this.anInt3052 / (((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13.length << 8);
		} else if (this.anInt3054 >= 0) {
			local6 -= local6 * this.anInt3045 / ((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "()V")
	private void method2708() {
		this.anInt3056 = this.anInt3044;
		this.anInt3043 = Static600.method2684(this.anInt3044, this.anInt3049);
		this.anInt3046 = Static600.method2702(this.anInt3044, this.anInt3049);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public synchronized void method2709() {
		this.anInt3050 = (this.anInt3050 ^ this.anInt3050 >> 31) + (this.anInt3050 >>> 31);
		this.anInt3050 = -this.anInt3050;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6372(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3044 == 0 && this.anInt3053 == 0) {
			this.method6377(arg2);
			return;
		}
		@Pc(13) Class6_Sub19_Sub1 local13 = (Class6_Sub19_Sub1) super.aClass6_Sub19_5;
		@Pc(18) int local18 = this.anInt3045 << 8;
		@Pc(23) int local23 = this.anInt3048 << 8;
		@Pc(29) int local29 = local13.aByteArray13.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3054 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3052 < 0) {
			if (this.anInt3050 <= 0) {
				this.method2681();
				this.method7804();
				return;
			}
			this.anInt3052 = 0;
		}
		if (this.anInt3052 >= local29) {
			if (this.anInt3050 >= 0) {
				this.method2681();
				this.method7804();
				return;
			}
			this.anInt3052 = local29 - 1;
		}
		if (this.anInt3054 >= 0) {
			if (this.anInt3054 > 0) {
				if (this.aBoolean221) {
					label130: {
						if (this.anInt3050 < 0) {
							local40 = this.method2712(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt3045]);
							if (this.anInt3052 >= local18) {
								return;
							}
							this.anInt3052 = local18 + local18 - this.anInt3052 - 1;
							this.anInt3050 = -this.anInt3050;
							if (--this.anInt3054 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray13[this.anInt3048 - 1]);
							if (this.anInt3052 < local23) {
								return;
							}
							this.anInt3052 = local23 + local23 - this.anInt3052 - 1;
							this.anInt3050 = -this.anInt3050;
							if (--this.anInt3054 == 0) {
								break;
							}
							local40 = this.method2712(arg0, local40, local18, local44, local13.aByteArray13[this.anInt3045]);
							if (this.anInt3052 >= local18) {
								return;
							}
							this.anInt3052 = local18 + local18 - this.anInt3052 - 1;
							this.anInt3050 = -this.anInt3050;
						} while (--this.anInt3054 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3050 < 0) {
						while (true) {
							local40 = this.method2712(arg0, local40, local18, local44, local13.aByteArray13[this.anInt3048 - 1]);
							if (this.anInt3052 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3052 - 1) / local33;
							if (local416 >= this.anInt3054) {
								this.anInt3052 += local33 * this.anInt3054;
								this.anInt3054 = 0;
								break;
							}
							this.anInt3052 += local33 * local416;
							this.anInt3054 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray13[this.anInt3045]);
							if (this.anInt3052 < local23) {
								return;
							}
							local416 = (this.anInt3052 - local18) / local33;
							if (local416 >= this.anInt3054) {
								this.anInt3052 -= local33 * this.anInt3054;
								this.anInt3054 = 0;
								break;
							}
							this.anInt3052 -= local33 * local416;
							this.anInt3054 -= local416;
						}
					}
				}
			}
			if (this.anInt3050 < 0) {
				this.method2712(arg0, local40, 0, local44, 0);
				if (this.anInt3052 < 0) {
					this.anInt3052 = -1;
					this.method2681();
					this.method7804();
					return;
				}
			} else {
				this.method2690(arg0, local40, local29, local44, 0);
				if (this.anInt3052 >= local29) {
					this.anInt3052 = local29;
					this.method2681();
					this.method7804();
				}
			}
		} else if (this.aBoolean221) {
			if (this.anInt3050 < 0) {
				local40 = this.method2712(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt3045]);
				if (this.anInt3052 >= local18) {
					return;
				}
				this.anInt3052 = local18 + local18 - this.anInt3052 - 1;
				this.anInt3050 = -this.anInt3050;
			}
			while (true) {
				local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray13[this.anInt3048 - 1]);
				if (this.anInt3052 < local23) {
					return;
				}
				this.anInt3052 = local23 + local23 - this.anInt3052 - 1;
				this.anInt3050 = -this.anInt3050;
				local40 = this.method2712(arg0, local40, local18, local44, local13.aByteArray13[this.anInt3045]);
				if (this.anInt3052 >= local18) {
					return;
				}
				this.anInt3052 = local18 + local18 - this.anInt3052 - 1;
				this.anInt3050 = -this.anInt3050;
			}
		} else if (this.anInt3050 < 0) {
			while (true) {
				local40 = this.method2712(arg0, local40, local18, local44, local13.aByteArray13[this.anInt3048 - 1]);
				if (this.anInt3052 >= local18) {
					return;
				}
				this.anInt3052 = local23 - (local23 - 1 - this.anInt3052) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2690(arg0, local40, local23, local44, local13.aByteArray13[this.anInt3045]);
				if (this.anInt3052 < local23) {
					return;
				}
				this.anInt3052 = local18 + (this.anInt3052 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "()I")
	@Override
	public int method6376() {
		return this.anInt3044 == 0 && this.anInt3053 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "([IIIII)I")
	private int method2712(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3053 <= 0) {
				if (this.anInt3050 == -256 && (this.anInt3052 & 0xFF) == 0) {
					if (Static341.aBoolean438) {
						return Static600.method2682(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, arg3, arg2, this);
					}
					return Static600.method2707(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, arg3, arg2, this);
				}
				if (Static341.aBoolean438) {
					return Static600.method2678(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, arg3, arg2, this, this.anInt3050, arg4);
				}
				return Static600.method2691(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, arg3, arg2, this, this.anInt3050, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3053;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3053 += arg1;
			if (this.anInt3050 == -256 && (this.anInt3052 & 0xFF) == 0) {
				if (Static341.aBoolean438) {
					arg1 = Static600.method2704(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, this.anInt3055, this.anInt3047, local5, arg2, this);
				} else {
					arg1 = Static600.method2700(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, this.anInt3051, local5, arg2, this);
				}
			} else if (Static341.aBoolean438) {
				arg1 = Static600.method2674(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3043, this.anInt3046, this.anInt3055, this.anInt3047, local5, arg2, this, this.anInt3050, arg4);
			} else {
				arg1 = Static600.method2680(((Class6_Sub19_Sub1) super.aClass6_Sub19_5).aByteArray13, arg0, this.anInt3052, arg1, this.anInt3056, this.anInt3051, local5, arg2, this, this.anInt3050, arg4);
			}
			this.anInt3053 -= arg1;
			if (this.anInt3053 != 0) {
				return arg1;
			}
		} while (!this.method2705());
		return arg3;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)V")
	private synchronized void method2713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3044 = arg0;
		this.anInt3049 = arg1;
		this.anInt3053 = 0;
		this.method2708();
	}
}
