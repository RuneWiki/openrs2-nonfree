import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub12_Sub4 extends Class1_Sub12 {

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	public int anInt3709;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	private int anInt3712;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	public int anInt3714;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "I")
	private int anInt3715;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "I")
	public int anInt3716;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	public int anInt3720;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "I")
	public int anInt3721;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "I")
	public int anInt3722;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "I")
	private final int anInt3717;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	private final int anInt3710;

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Z")
	private final boolean aBoolean207;

	@OriginalMember(owner = "client!t", name = "H", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	private int anInt3718;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	private int anInt3713;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	public int anInt3711;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!qc;II)V")
	public Class1_Sub12_Sub4(@OriginalArg(0) Class1_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub22_5 = arg0;
		this.anInt3717 = arg0.anInt3128;
		this.anInt3710 = arg0.anInt3126;
		this.aBoolean207 = arg0.aBoolean179;
		this.anInt3719 = arg1;
		this.anInt3718 = arg2;
		this.anInt3713 = 8192;
		this.anInt3711 = 0;
		this.method2798();
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!qc;III)V")
	public Class1_Sub12_Sub4(@OriginalArg(0) Class1_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub22_5 = arg0;
		this.anInt3717 = arg0.anInt3128;
		this.anInt3710 = arg0.anInt3126;
		this.aBoolean207 = arg0.aBoolean179;
		this.anInt3719 = arg1;
		this.anInt3718 = arg2;
		this.anInt3713 = arg3;
		this.anInt3711 = 0;
		this.method2798();
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public synchronized void method2765(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3711 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()I")
	public synchronized int method2767() {
		return this.anInt3719 < 0 ? -this.anInt3719 : this.anInt3719;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public synchronized void method2768(@OriginalArg(0) int arg0) {
		this.method2778(arg0 << 6, this.method2793());
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "()I")
	public synchronized int method2770() {
		return this.anInt3718 == Integer.MIN_VALUE ? 0 : this.anInt3718;
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)V")
	public synchronized void method2772(@OriginalArg(0) int arg0) {
		this.anInt3715 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIII)I")
	private int method2773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3712 <= 0) {
				if (this.anInt3719 == -256 && (this.anInt3711 & 0xFF) == 0) {
					if (Static151.aBoolean177) {
						return Static217.method2760(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, arg3, arg2, this);
					}
					return Static217.method2774(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, arg3, arg2, this);
				}
				if (Static151.aBoolean177) {
					return Static217.method2763(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, arg3, arg2, this, this.anInt3719, arg4);
				}
				return Static217.method2784(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, arg3, arg2, this, this.anInt3719, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3712;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3712 += arg1;
			if (this.anInt3719 == -256 && (this.anInt3711 & 0xFF) == 0) {
				if (Static151.aBoolean177) {
					arg1 = Static217.method2795(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, this.anInt3714, this.anInt3721, local5, arg2, this);
				} else {
					arg1 = Static217.method2766(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, this.anInt3722, local5, arg2, this);
				}
			} else if (Static151.aBoolean177) {
				arg1 = Static217.method2788(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, this.anInt3714, this.anInt3721, local5, arg2, this, this.anInt3719, arg4);
			} else {
				arg1 = Static217.method2776(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, this.anInt3722, local5, arg2, this, this.anInt3719, arg4);
			}
			this.anInt3712 -= arg1;
			if (this.anInt3712 != 0) {
				return arg1;
			}
		} while (!this.method2797());
		return arg3;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
	private synchronized void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3718 = arg0;
		this.anInt3713 = arg1;
		this.anInt3712 = 0;
		this.method2798();
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "()Z")
	public boolean method2779() {
		return this.anInt3712 != 0;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "([IIIII)I")
	private int method2780(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3712 <= 0) {
				if (this.anInt3719 == 256 && (this.anInt3711 & 0xFF) == 0) {
					if (Static151.aBoolean177) {
						return Static217.method2791(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, arg3, arg2, this);
					}
					return Static217.method2775(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, arg3, arg2, this);
				}
				if (Static151.aBoolean177) {
					return Static217.method2759(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, arg3, arg2, this, this.anInt3719, arg4);
				}
				return Static217.method2769(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, arg3, arg2, this, this.anInt3719, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3712;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3712 += arg1;
			if (this.anInt3719 == 256 && (this.anInt3711 & 0xFF) == 0) {
				if (Static151.aBoolean177) {
					arg1 = Static217.method2789(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, this.anInt3714, this.anInt3721, local5, arg2, this);
				} else {
					arg1 = Static217.method2796(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, this.anInt3722, local5, arg2, this);
				}
			} else if (Static151.aBoolean177) {
				arg1 = Static217.method2761(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3716, this.anInt3709, this.anInt3714, this.anInt3721, local5, arg2, this, this.anInt3719, arg4);
			} else {
				arg1 = Static217.method2786(((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43, arg0, this.anInt3711, arg1, this.anInt3720, this.anInt3722, local5, arg2, this, this.anInt3719, arg4);
			}
			this.anInt3712 -= arg1;
			if (this.anInt3712 != 0) {
				return arg1;
			}
		} while (!this.method2797());
		return arg3;
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "()V")
	private void method2781() {
		if (this.anInt3712 == 0) {
			return;
		}
		if (this.anInt3718 == Integer.MIN_VALUE) {
			this.anInt3718 = 0;
		}
		this.anInt3712 = 0;
		this.method2798();
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
	public synchronized void method2782(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2787();
			this.method3414();
		} else if (this.anInt3716 == 0 && this.anInt3709 == 0) {
			this.anInt3712 = 0;
			this.anInt3718 = 0;
			this.anInt3720 = 0;
			this.method3414();
		} else {
			@Pc(31) int local31 = -this.anInt3720;
			if (this.anInt3720 > local31) {
				local31 = this.anInt3720;
			}
			if (-this.anInt3716 > local31) {
				local31 = -this.anInt3716;
			}
			if (this.anInt3716 > local31) {
				local31 = this.anInt3716;
			}
			if (-this.anInt3709 > local31) {
				local31 = -this.anInt3709;
			}
			if (this.anInt3709 > local31) {
				local31 = this.anInt3709;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3712 = arg0;
			this.anInt3718 = Integer.MIN_VALUE;
			this.anInt3722 = -this.anInt3720 / arg0;
			this.anInt3714 = -this.anInt3716 / arg0;
			this.anInt3721 = -this.anInt3709 / arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V")
	public synchronized void method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2785(arg0, arg1, this.method2793());
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public synchronized void method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2778(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static217.method2771(arg1, arg2);
		@Pc(14) int local14 = Static217.method2764(arg1, arg2);
		if (this.anInt3716 == local10 && this.anInt3709 == local14) {
			this.anInt3712 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3720;
		if (this.anInt3720 - arg1 > local31) {
			local31 = this.anInt3720 - arg1;
		}
		if (local10 - this.anInt3716 > local31) {
			local31 = local10 - this.anInt3716;
		}
		if (this.anInt3716 - local10 > local31) {
			local31 = this.anInt3716 - local10;
		}
		if (local14 - this.anInt3709 > local31) {
			local31 = local14 - this.anInt3709;
		}
		if (this.anInt3709 - local14 > local31) {
			local31 = this.anInt3709 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3712 = arg0;
		this.anInt3718 = arg1;
		this.anInt3713 = arg2;
		this.anInt3722 = (arg1 - this.anInt3720) / arg0;
		this.anInt3714 = (local10 - this.anInt3716) / arg0;
		this.anInt3721 = (local14 - this.anInt3709) / arg0;
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "(I)V")
	private synchronized void method2787() {
		this.method2778(0, this.method2793());
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub12 method2755() {
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub12 method2754() {
		return null;
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "(I)V")
	public synchronized void method2790(@OriginalArg(0) int arg0) {
		if (this.anInt3719 < 0) {
			this.anInt3719 = -arg0;
		} else {
			this.anInt3719 = arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
	@Override
	public int method2758() {
		@Pc(6) int local6 = this.anInt3720 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3715 == 0) {
			local6 -= local6 * this.anInt3711 / (((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43.length << 8);
		} else if (this.anInt3715 >= 0) {
			local6 -= local6 * this.anInt3717 / ((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
	@Override
	public int method2756() {
		return this.anInt3718 == 0 && this.anInt3712 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public synchronized void method2792() {
		this.anInt3719 = (this.anInt3719 ^ this.anInt3719 >> 31) + (this.anInt3719 >>> 31);
		this.anInt3719 = -this.anInt3719;
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "()I")
	public synchronized int method2793() {
		return this.anInt3713 < 0 ? -1 : this.anInt3713;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2757(@OriginalArg(0) int arg0) {
		if (this.anInt3712 > 0) {
			if (arg0 >= this.anInt3712) {
				if (this.anInt3718 == Integer.MIN_VALUE) {
					this.anInt3718 = 0;
					this.anInt3720 = this.anInt3716 = this.anInt3709 = 0;
					this.method3414();
					arg0 = this.anInt3712;
				}
				this.anInt3712 = 0;
				this.method2798();
			} else {
				this.anInt3720 += this.anInt3722 * arg0;
				this.anInt3716 += this.anInt3714 * arg0;
				this.anInt3709 += this.anInt3721 * arg0;
				this.anInt3712 -= arg0;
			}
		}
		@Pc(71) Class1_Sub22_Sub1 local71 = (Class1_Sub22_Sub1) super.aClass1_Sub22_5;
		@Pc(76) int local76 = this.anInt3717 << 8;
		@Pc(81) int local81 = this.anInt3710 << 8;
		@Pc(87) int local87 = local71.aByteArray43.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3715 = 0;
		}
		if (this.anInt3711 < 0) {
			if (this.anInt3719 <= 0) {
				this.method2781();
				this.method3414();
				return;
			}
			this.anInt3711 = 0;
		}
		if (this.anInt3711 >= local87) {
			if (this.anInt3719 >= 0) {
				this.method2781();
				this.method3414();
				return;
			}
			this.anInt3711 = local87 - 1;
		}
		this.anInt3711 += this.anInt3719 * arg0;
		if (this.anInt3715 >= 0) {
			if (this.anInt3715 > 0) {
				if (this.aBoolean207) {
					label125: {
						if (this.anInt3719 < 0) {
							if (this.anInt3711 >= local76) {
								return;
							}
							this.anInt3711 = local76 + local76 - this.anInt3711 - 1;
							this.anInt3719 = -this.anInt3719;
							if (--this.anInt3715 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3711 < local81) {
								return;
							}
							this.anInt3711 = local81 + local81 - this.anInt3711 - 1;
							this.anInt3719 = -this.anInt3719;
							if (--this.anInt3715 == 0) {
								break;
							}
							if (this.anInt3711 >= local76) {
								return;
							}
							this.anInt3711 = local76 + local76 - this.anInt3711 - 1;
							this.anInt3719 = -this.anInt3719;
						} while (--this.anInt3715 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3719 < 0) {
						if (this.anInt3711 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3711 - 1) / local91;
						if (local361 < this.anInt3715) {
							this.anInt3711 += local91 * local361;
							this.anInt3715 -= local361;
							return;
						}
						this.anInt3711 += local91 * this.anInt3715;
						this.anInt3715 = 0;
					} else if (this.anInt3711 >= local81) {
						local361 = (this.anInt3711 - local76) / local91;
						if (local361 < this.anInt3715) {
							this.anInt3711 -= local91 * local361;
							this.anInt3715 -= local361;
							return;
						}
						this.anInt3711 -= local91 * this.anInt3715;
						this.anInt3715 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3719 < 0) {
				if (this.anInt3711 < 0) {
					this.anInt3711 = -1;
					this.method2781();
					this.method3414();
					return;
				}
			} else if (this.anInt3711 >= local87) {
				this.anInt3711 = local87;
				this.method2781();
				this.method3414();
			}
		} else if (this.aBoolean207) {
			if (this.anInt3719 < 0) {
				if (this.anInt3711 >= local76) {
					return;
				}
				this.anInt3711 = local76 + local76 - this.anInt3711 - 1;
				this.anInt3719 = -this.anInt3719;
			}
			while (this.anInt3711 >= local81) {
				this.anInt3711 = local81 + local81 - this.anInt3711 - 1;
				this.anInt3719 = -this.anInt3719;
				if (this.anInt3711 >= local76) {
					return;
				}
				this.anInt3711 = local76 + local76 - this.anInt3711 - 1;
				this.anInt3719 = -this.anInt3719;
			}
		} else if (this.anInt3719 < 0) {
			if (this.anInt3711 < local76) {
				this.anInt3711 = local81 - (local81 - 1 - this.anInt3711) % local91 - 1;
			}
		} else if (this.anInt3711 >= local81) {
			this.anInt3711 = local76 + (this.anInt3711 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()Z")
	public boolean method2794() {
		return this.anInt3711 < 0 || this.anInt3711 >= ((Class1_Sub22_Sub1) super.aClass1_Sub22_5).aByteArray43.length << 8;
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "()Z")
	private boolean method2797() {
		@Pc(2) int local2 = this.anInt3718;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static217.method2771(local2, this.anInt3713);
			local8 = Static217.method2764(local2, this.anInt3713);
		}
		if (this.anInt3720 != local2 || this.anInt3716 != local10 || this.anInt3709 != local8) {
			if (this.anInt3720 < local2) {
				this.anInt3722 = 1;
				this.anInt3712 = local2 - this.anInt3720;
			} else if (this.anInt3720 > local2) {
				this.anInt3722 = -1;
				this.anInt3712 = this.anInt3720 - local2;
			} else {
				this.anInt3722 = 0;
			}
			if (this.anInt3716 < local10) {
				this.anInt3714 = 1;
				if (this.anInt3712 == 0 || this.anInt3712 > local10 - this.anInt3716) {
					this.anInt3712 = local10 - this.anInt3716;
				}
			} else if (this.anInt3716 > local10) {
				this.anInt3714 = -1;
				if (this.anInt3712 == 0 || this.anInt3712 > this.anInt3716 - local10) {
					this.anInt3712 = this.anInt3716 - local10;
				}
			} else {
				this.anInt3714 = 0;
			}
			if (this.anInt3709 < local8) {
				this.anInt3721 = 1;
				if (this.anInt3712 == 0 || this.anInt3712 > local8 - this.anInt3709) {
					this.anInt3712 = local8 - this.anInt3709;
				}
			} else if (this.anInt3709 > local8) {
				this.anInt3721 = -1;
				if (this.anInt3712 == 0 || this.anInt3712 > this.anInt3709 - local8) {
					this.anInt3712 = this.anInt3709 - local8;
				}
			} else {
				this.anInt3721 = 0;
			}
			return false;
		} else if (this.anInt3718 == Integer.MIN_VALUE) {
			this.anInt3718 = 0;
			this.anInt3720 = this.anInt3716 = this.anInt3709 = 0;
			this.method3414();
			return true;
		} else {
			this.method2798();
			return false;
		}
	}

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()V")
	private void method2798() {
		this.anInt3720 = this.anInt3718;
		this.anInt3716 = Static217.method2771(this.anInt3718, this.anInt3713);
		this.anInt3709 = Static217.method2764(this.anInt3718, this.anInt3713);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3718 == 0 && this.anInt3712 == 0) {
			this.method2757(arg2);
			return;
		}
		@Pc(13) Class1_Sub22_Sub1 local13 = (Class1_Sub22_Sub1) super.aClass1_Sub22_5;
		@Pc(18) int local18 = this.anInt3717 << 8;
		@Pc(23) int local23 = this.anInt3710 << 8;
		@Pc(29) int local29 = local13.aByteArray43.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3715 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3711 < 0) {
			if (this.anInt3719 <= 0) {
				this.method2781();
				this.method3414();
				return;
			}
			this.anInt3711 = 0;
		}
		if (this.anInt3711 >= local29) {
			if (this.anInt3719 >= 0) {
				this.method2781();
				this.method3414();
				return;
			}
			this.anInt3711 = local29 - 1;
		}
		if (this.anInt3715 >= 0) {
			if (this.anInt3715 > 0) {
				if (this.aBoolean207) {
					label130: {
						if (this.anInt3719 < 0) {
							local40 = this.method2773(arg0, arg1, local18, local44, local13.aByteArray43[this.anInt3717]);
							if (this.anInt3711 >= local18) {
								return;
							}
							this.anInt3711 = local18 + local18 - this.anInt3711 - 1;
							this.anInt3719 = -this.anInt3719;
							if (--this.anInt3715 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2780(arg0, local40, local23, local44, local13.aByteArray43[this.anInt3710 - 1]);
							if (this.anInt3711 < local23) {
								return;
							}
							this.anInt3711 = local23 + local23 - this.anInt3711 - 1;
							this.anInt3719 = -this.anInt3719;
							if (--this.anInt3715 == 0) {
								break;
							}
							local40 = this.method2773(arg0, local40, local18, local44, local13.aByteArray43[this.anInt3717]);
							if (this.anInt3711 >= local18) {
								return;
							}
							this.anInt3711 = local18 + local18 - this.anInt3711 - 1;
							this.anInt3719 = -this.anInt3719;
						} while (--this.anInt3715 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3719 < 0) {
						while (true) {
							local40 = this.method2773(arg0, local40, local18, local44, local13.aByteArray43[this.anInt3710 - 1]);
							if (this.anInt3711 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3711 - 1) / local33;
							if (local416 >= this.anInt3715) {
								this.anInt3711 += local33 * this.anInt3715;
								this.anInt3715 = 0;
								break;
							}
							this.anInt3711 += local33 * local416;
							this.anInt3715 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2780(arg0, local40, local23, local44, local13.aByteArray43[this.anInt3717]);
							if (this.anInt3711 < local23) {
								return;
							}
							local416 = (this.anInt3711 - local18) / local33;
							if (local416 >= this.anInt3715) {
								this.anInt3711 -= local33 * this.anInt3715;
								this.anInt3715 = 0;
								break;
							}
							this.anInt3711 -= local33 * local416;
							this.anInt3715 -= local416;
						}
					}
				}
			}
			if (this.anInt3719 < 0) {
				this.method2773(arg0, local40, 0, local44, 0);
				if (this.anInt3711 < 0) {
					this.anInt3711 = -1;
					this.method2781();
					this.method3414();
					return;
				}
			} else {
				this.method2780(arg0, local40, local29, local44, 0);
				if (this.anInt3711 >= local29) {
					this.anInt3711 = local29;
					this.method2781();
					this.method3414();
				}
			}
		} else if (this.aBoolean207) {
			if (this.anInt3719 < 0) {
				local40 = this.method2773(arg0, arg1, local18, local44, local13.aByteArray43[this.anInt3717]);
				if (this.anInt3711 >= local18) {
					return;
				}
				this.anInt3711 = local18 + local18 - this.anInt3711 - 1;
				this.anInt3719 = -this.anInt3719;
			}
			while (true) {
				local40 = this.method2780(arg0, local40, local23, local44, local13.aByteArray43[this.anInt3710 - 1]);
				if (this.anInt3711 < local23) {
					return;
				}
				this.anInt3711 = local23 + local23 - this.anInt3711 - 1;
				this.anInt3719 = -this.anInt3719;
				local40 = this.method2773(arg0, local40, local18, local44, local13.aByteArray43[this.anInt3717]);
				if (this.anInt3711 >= local18) {
					return;
				}
				this.anInt3711 = local18 + local18 - this.anInt3711 - 1;
				this.anInt3719 = -this.anInt3719;
			}
		} else if (this.anInt3719 < 0) {
			while (true) {
				local40 = this.method2773(arg0, local40, local18, local44, local13.aByteArray43[this.anInt3710 - 1]);
				if (this.anInt3711 >= local18) {
					return;
				}
				this.anInt3711 = local23 - (local23 - 1 - this.anInt3711) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2780(arg0, local40, local23, local44, local13.aByteArray43[this.anInt3717]);
				if (this.anInt3711 < local23) {
					return;
				}
				this.anInt3711 = local18 + (this.anInt3711 - local18) % local33;
			}
		}
	}
}
