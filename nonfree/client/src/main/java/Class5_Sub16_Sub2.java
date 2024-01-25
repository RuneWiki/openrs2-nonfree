import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class5_Sub16_Sub2 extends Class5_Sub16 {

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public int anInt3758;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	private int anInt3759;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
	public int anInt3760;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
	public int anInt3761;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
	private int anInt3764;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
	public int anInt3765;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
	public int anInt3766;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
	public int anInt3767;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
	private final int anInt3762;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
	private final int anInt3768;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Z")
	private final boolean aBoolean303;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	private int anInt3757;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
	private int anInt3763;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
	private int anInt3756;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
	public int anInt3755;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!ct;III)V")
	public Class5_Sub16_Sub2(@OriginalArg(0) Class5_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub11_6 = arg0;
		this.anInt3762 = arg0.anInt1320;
		this.anInt3768 = arg0.anInt1319;
		this.aBoolean303 = arg0.aBoolean106;
		this.anInt3757 = arg1;
		this.anInt3763 = arg2;
		this.anInt3756 = arg3;
		this.anInt3755 = 0;
		this.method3357();
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	public synchronized void method3334(@OriginalArg(0) int arg0) {
		this.method3344(this.method3364(), arg0);
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	public synchronized void method3335(@OriginalArg(0) int arg0) {
		this.method3344(arg0 << 6, this.method3345());
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8283() {
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public synchronized void method3339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3350(arg0, arg1, this.method3345());
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([IIIII)I")
	private int method3340(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3764 <= 0) {
				if (this.anInt3757 == 256 && (this.anInt3755 & 0xFF) == 0) {
					if (Static568.aBoolean763) {
						return Static653.method3332(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, arg3, arg2, this);
					}
					return Static653.method3362(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, arg3, arg2, this);
				}
				if (Static568.aBoolean763) {
					return Static653.method3337(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, arg3, arg2, this, this.anInt3757, arg4);
				}
				return Static653.method3355(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, arg3, arg2, this, this.anInt3757, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3764;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3764 += arg1;
			if (this.anInt3757 == 256 && (this.anInt3755 & 0xFF) == 0) {
				if (Static568.aBoolean763) {
					arg1 = Static653.method3333(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, this.anInt3758, this.anInt3765, local5, arg2, this);
				} else {
					arg1 = Static653.method3336(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, this.anInt3760, local5, arg2, this);
				}
			} else if (Static568.aBoolean763) {
				arg1 = Static653.method3363(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, this.anInt3758, this.anInt3765, local5, arg2, this, this.anInt3757, arg4);
			} else {
				arg1 = Static653.method3346(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, this.anInt3760, local5, arg2, this, this.anInt3757, arg4);
			}
			this.anInt3764 -= arg1;
			if (this.anInt3764 != 0) {
				return arg1;
			}
		} while (!this.method3367());
		return arg3;
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V")
	public synchronized void method3342(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3755 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V")
	public synchronized void method3343(@OriginalArg(0) int arg0) {
		if (this.anInt3757 < 0) {
			this.anInt3757 = -arg0;
		} else {
			this.anInt3757 = arg0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8281() {
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	private synchronized void method3344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3763 = arg0;
		this.anInt3756 = arg1;
		this.anInt3764 = 0;
		this.method3357();
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "()I")
	public synchronized int method3345() {
		return this.anInt3756 < 0 ? -1 : this.anInt3756;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
	public synchronized void method3350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3344(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static653.method3365(arg1, arg2);
		@Pc(14) int local14 = Static653.method3371(arg1, arg2);
		if (this.anInt3766 == local10 && this.anInt3761 == local14) {
			this.anInt3764 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3767;
		if (this.anInt3767 - arg1 > local31) {
			local31 = this.anInt3767 - arg1;
		}
		if (local10 - this.anInt3766 > local31) {
			local31 = local10 - this.anInt3766;
		}
		if (this.anInt3766 - local10 > local31) {
			local31 = this.anInt3766 - local10;
		}
		if (local14 - this.anInt3761 > local31) {
			local31 = local14 - this.anInt3761;
		}
		if (this.anInt3761 - local14 > local31) {
			local31 = this.anInt3761 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3764 = arg0;
		this.anInt3763 = arg1;
		this.anInt3756 = arg2;
		this.anInt3760 = (arg1 - this.anInt3767) / arg0;
		this.anInt3758 = (local10 - this.anInt3766) / arg0;
		this.anInt3765 = (local14 - this.anInt3761) / arg0;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "()I")
	@Override
	public int method8284() {
		@Pc(6) int local6 = this.anInt3767 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3759 == 0) {
			local6 -= local6 * this.anInt3755 / (((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17.length << 8);
		} else if (this.anInt3759 >= 0) {
			local6 -= local6 * this.anInt3762 / ((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8286(@OriginalArg(0) int arg0) {
		if (this.anInt3764 > 0) {
			if (arg0 >= this.anInt3764) {
				if (this.anInt3763 == Integer.MIN_VALUE) {
					this.anInt3763 = 0;
					this.anInt3767 = this.anInt3766 = this.anInt3761 = 0;
					this.method8911();
					arg0 = this.anInt3764;
				}
				this.anInt3764 = 0;
				this.method3357();
			} else {
				this.anInt3767 += this.anInt3760 * arg0;
				this.anInt3766 += this.anInt3758 * arg0;
				this.anInt3761 += this.anInt3765 * arg0;
				this.anInt3764 -= arg0;
			}
		}
		@Pc(71) Class5_Sub11_Sub1 local71 = (Class5_Sub11_Sub1) super.aClass5_Sub11_6;
		@Pc(76) int local76 = this.anInt3762 << 8;
		@Pc(81) int local81 = this.anInt3768 << 8;
		@Pc(87) int local87 = local71.aByteArray17.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3759 = 0;
		}
		if (this.anInt3755 < 0) {
			if (this.anInt3757 <= 0) {
				this.method3358();
				this.method8911();
				return;
			}
			this.anInt3755 = 0;
		}
		if (this.anInt3755 >= local87) {
			if (this.anInt3757 >= 0) {
				this.method3358();
				this.method8911();
				return;
			}
			this.anInt3755 = local87 - 1;
		}
		this.anInt3755 += this.anInt3757 * arg0;
		if (this.anInt3759 >= 0) {
			if (this.anInt3759 > 0) {
				if (this.aBoolean303) {
					label125: {
						if (this.anInt3757 < 0) {
							if (this.anInt3755 >= local76) {
								return;
							}
							this.anInt3755 = local76 + local76 - this.anInt3755 - 1;
							this.anInt3757 = -this.anInt3757;
							if (--this.anInt3759 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3755 < local81) {
								return;
							}
							this.anInt3755 = local81 + local81 - this.anInt3755 - 1;
							this.anInt3757 = -this.anInt3757;
							if (--this.anInt3759 == 0) {
								break;
							}
							if (this.anInt3755 >= local76) {
								return;
							}
							this.anInt3755 = local76 + local76 - this.anInt3755 - 1;
							this.anInt3757 = -this.anInt3757;
						} while (--this.anInt3759 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3757 < 0) {
						if (this.anInt3755 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3755 - 1) / local91;
						if (local361 < this.anInt3759) {
							this.anInt3755 += local91 * local361;
							this.anInt3759 -= local361;
							return;
						}
						this.anInt3755 += local91 * this.anInt3759;
						this.anInt3759 = 0;
					} else if (this.anInt3755 >= local81) {
						local361 = (this.anInt3755 - local76) / local91;
						if (local361 < this.anInt3759) {
							this.anInt3755 -= local91 * local361;
							this.anInt3759 -= local361;
							return;
						}
						this.anInt3755 -= local91 * this.anInt3759;
						this.anInt3759 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3757 < 0) {
				if (this.anInt3755 < 0) {
					this.anInt3755 = -1;
					this.method3358();
					this.method8911();
					return;
				}
			} else if (this.anInt3755 >= local87) {
				this.anInt3755 = local87;
				this.method3358();
				this.method8911();
			}
		} else if (this.aBoolean303) {
			if (this.anInt3757 < 0) {
				if (this.anInt3755 >= local76) {
					return;
				}
				this.anInt3755 = local76 + local76 - this.anInt3755 - 1;
				this.anInt3757 = -this.anInt3757;
			}
			while (this.anInt3755 >= local81) {
				this.anInt3755 = local81 + local81 - this.anInt3755 - 1;
				this.anInt3757 = -this.anInt3757;
				if (this.anInt3755 >= local76) {
					return;
				}
				this.anInt3755 = local76 + local76 - this.anInt3755 - 1;
				this.anInt3757 = -this.anInt3757;
			}
		} else if (this.anInt3757 < 0) {
			if (this.anInt3755 < local76) {
				this.anInt3755 = local81 - (local81 - 1 - this.anInt3755) % local91 - 1;
			}
		} else if (this.anInt3755 >= local81) {
			this.anInt3755 = local76 + (this.anInt3755 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
	public synchronized void method3352(@OriginalArg(0) int arg0) {
		this.anInt3759 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "()Z")
	public boolean method3353() {
		return this.anInt3764 != 0;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(Z)V")
	public synchronized void method3354() {
		this.anInt3757 = (this.anInt3757 ^ this.anInt3757 >> 31) + (this.anInt3757 >>> 31);
		this.anInt3757 = -this.anInt3757;
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "()Z")
	public boolean method3356() {
		return this.anInt3755 < 0 || this.anInt3755 >= ((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17.length << 8;
	}

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "()V")
	private void method3357() {
		this.anInt3767 = this.anInt3763;
		this.anInt3766 = Static653.method3365(this.anInt3763, this.anInt3756);
		this.anInt3761 = Static653.method3371(this.anInt3763, this.anInt3756);
	}

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "()V")
	private void method3358() {
		if (this.anInt3764 == 0) {
			return;
		}
		if (this.anInt3763 == Integer.MIN_VALUE) {
			this.anInt3763 = 0;
		}
		this.anInt3764 = 0;
		this.method3357();
	}

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "()I")
	public synchronized int method3359() {
		return this.anInt3757 < 0 ? -this.anInt3757 : this.anInt3757;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "([IIIII)I")
	private int method3360(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3764 <= 0) {
				if (this.anInt3757 == -256 && (this.anInt3755 & 0xFF) == 0) {
					if (Static568.aBoolean763) {
						return Static653.method3348(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, arg3, arg2, this);
					}
					return Static653.method3349(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, arg3, arg2, this);
				}
				if (Static568.aBoolean763) {
					return Static653.method3366(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, arg3, arg2, this, this.anInt3757, arg4);
				}
				return Static653.method3361(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, arg3, arg2, this, this.anInt3757, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3764;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3764 += arg1;
			if (this.anInt3757 == -256 && (this.anInt3755 & 0xFF) == 0) {
				if (Static568.aBoolean763) {
					arg1 = Static653.method3347(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, this.anInt3758, this.anInt3765, local5, arg2, this);
				} else {
					arg1 = Static653.method3370(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, this.anInt3760, local5, arg2, this);
				}
			} else if (Static568.aBoolean763) {
				arg1 = Static653.method3351(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3766, this.anInt3761, this.anInt3758, this.anInt3765, local5, arg2, this, this.anInt3757, arg4);
			} else {
				arg1 = Static653.method3338(((Class5_Sub11_Sub1) super.aClass5_Sub11_6).aByteArray17, arg0, this.anInt3755, arg1, this.anInt3767, this.anInt3760, local5, arg2, this, this.anInt3757, arg4);
			}
			this.anInt3764 -= arg1;
			if (this.anInt3764 != 0) {
				return arg1;
			}
		} while (!this.method3367());
		return arg3;
	}

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "()I")
	public synchronized int method3364() {
		return this.anInt3763 == Integer.MIN_VALUE ? 0 : this.anInt3763;
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "()I")
	@Override
	public int method8287() {
		return this.anInt3763 == 0 && this.anInt3764 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "()Z")
	private boolean method3367() {
		@Pc(2) int local2 = this.anInt3763;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static653.method3365(local2, this.anInt3756);
			local8 = Static653.method3371(local2, this.anInt3756);
		}
		if (this.anInt3767 != local2 || this.anInt3766 != local10 || this.anInt3761 != local8) {
			if (this.anInt3767 < local2) {
				this.anInt3760 = 1;
				this.anInt3764 = local2 - this.anInt3767;
			} else if (this.anInt3767 > local2) {
				this.anInt3760 = -1;
				this.anInt3764 = this.anInt3767 - local2;
			} else {
				this.anInt3760 = 0;
			}
			if (this.anInt3766 < local10) {
				this.anInt3758 = 1;
				if (this.anInt3764 == 0 || this.anInt3764 > local10 - this.anInt3766) {
					this.anInt3764 = local10 - this.anInt3766;
				}
			} else if (this.anInt3766 > local10) {
				this.anInt3758 = -1;
				if (this.anInt3764 == 0 || this.anInt3764 > this.anInt3766 - local10) {
					this.anInt3764 = this.anInt3766 - local10;
				}
			} else {
				this.anInt3758 = 0;
			}
			if (this.anInt3761 < local8) {
				this.anInt3765 = 1;
				if (this.anInt3764 == 0 || this.anInt3764 > local8 - this.anInt3761) {
					this.anInt3764 = local8 - this.anInt3761;
				}
			} else if (this.anInt3761 > local8) {
				this.anInt3765 = -1;
				if (this.anInt3764 == 0 || this.anInt3764 > this.anInt3761 - local8) {
					this.anInt3764 = this.anInt3761 - local8;
				}
			} else {
				this.anInt3765 = 0;
			}
			return false;
		} else if (this.anInt3763 == Integer.MIN_VALUE) {
			this.anInt3763 = 0;
			this.anInt3767 = this.anInt3766 = this.anInt3761 = 0;
			this.method8911();
			return true;
		} else {
			this.method3357();
			return false;
		}
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
	private synchronized void method3368() {
		this.method3344(0, this.method3345());
	}

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)V")
	public synchronized void method3369(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3368();
			this.method8911();
		} else if (this.anInt3766 == 0 && this.anInt3761 == 0) {
			this.anInt3764 = 0;
			this.anInt3763 = 0;
			this.anInt3767 = 0;
			this.method8911();
		} else {
			@Pc(31) int local31 = -this.anInt3767;
			if (this.anInt3767 > local31) {
				local31 = this.anInt3767;
			}
			if (-this.anInt3766 > local31) {
				local31 = -this.anInt3766;
			}
			if (this.anInt3766 > local31) {
				local31 = this.anInt3766;
			}
			if (-this.anInt3761 > local31) {
				local31 = -this.anInt3761;
			}
			if (this.anInt3761 > local31) {
				local31 = this.anInt3761;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3764 = arg0;
			this.anInt3763 = Integer.MIN_VALUE;
			this.anInt3760 = -this.anInt3767 / arg0;
			this.anInt3758 = -this.anInt3766 / arg0;
			this.anInt3765 = -this.anInt3761 / arg0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3763 == 0 && this.anInt3764 == 0) {
			this.method8286(arg2);
			return;
		}
		@Pc(13) Class5_Sub11_Sub1 local13 = (Class5_Sub11_Sub1) super.aClass5_Sub11_6;
		@Pc(18) int local18 = this.anInt3762 << 8;
		@Pc(23) int local23 = this.anInt3768 << 8;
		@Pc(29) int local29 = local13.aByteArray17.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3759 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3755 < 0) {
			if (this.anInt3757 <= 0) {
				this.method3358();
				this.method8911();
				return;
			}
			this.anInt3755 = 0;
		}
		if (this.anInt3755 >= local29) {
			if (this.anInt3757 >= 0) {
				this.method3358();
				this.method8911();
				return;
			}
			this.anInt3755 = local29 - 1;
		}
		if (this.anInt3759 >= 0) {
			if (this.anInt3759 > 0) {
				if (this.aBoolean303) {
					label130: {
						if (this.anInt3757 < 0) {
							local40 = this.method3360(arg0, arg1, local18, local44, local13.aByteArray17[this.anInt3762]);
							if (this.anInt3755 >= local18) {
								return;
							}
							this.anInt3755 = local18 + local18 - this.anInt3755 - 1;
							this.anInt3757 = -this.anInt3757;
							if (--this.anInt3759 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3340(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3768 - 1]);
							if (this.anInt3755 < local23) {
								return;
							}
							this.anInt3755 = local23 + local23 - this.anInt3755 - 1;
							this.anInt3757 = -this.anInt3757;
							if (--this.anInt3759 == 0) {
								break;
							}
							local40 = this.method3360(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3762]);
							if (this.anInt3755 >= local18) {
								return;
							}
							this.anInt3755 = local18 + local18 - this.anInt3755 - 1;
							this.anInt3757 = -this.anInt3757;
						} while (--this.anInt3759 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3757 < 0) {
						while (true) {
							local40 = this.method3360(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3768 - 1]);
							if (this.anInt3755 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3755 - 1) / local33;
							if (local416 >= this.anInt3759) {
								this.anInt3755 += local33 * this.anInt3759;
								this.anInt3759 = 0;
								break;
							}
							this.anInt3755 += local33 * local416;
							this.anInt3759 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3340(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3762]);
							if (this.anInt3755 < local23) {
								return;
							}
							local416 = (this.anInt3755 - local18) / local33;
							if (local416 >= this.anInt3759) {
								this.anInt3755 -= local33 * this.anInt3759;
								this.anInt3759 = 0;
								break;
							}
							this.anInt3755 -= local33 * local416;
							this.anInt3759 -= local416;
						}
					}
				}
			}
			if (this.anInt3757 < 0) {
				this.method3360(arg0, local40, 0, local44, 0);
				if (this.anInt3755 < 0) {
					this.anInt3755 = -1;
					this.method3358();
					this.method8911();
					return;
				}
			} else {
				this.method3340(arg0, local40, local29, local44, 0);
				if (this.anInt3755 >= local29) {
					this.anInt3755 = local29;
					this.method3358();
					this.method8911();
				}
			}
		} else if (this.aBoolean303) {
			if (this.anInt3757 < 0) {
				local40 = this.method3360(arg0, arg1, local18, local44, local13.aByteArray17[this.anInt3762]);
				if (this.anInt3755 >= local18) {
					return;
				}
				this.anInt3755 = local18 + local18 - this.anInt3755 - 1;
				this.anInt3757 = -this.anInt3757;
			}
			while (true) {
				local40 = this.method3340(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3768 - 1]);
				if (this.anInt3755 < local23) {
					return;
				}
				this.anInt3755 = local23 + local23 - this.anInt3755 - 1;
				this.anInt3757 = -this.anInt3757;
				local40 = this.method3360(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3762]);
				if (this.anInt3755 >= local18) {
					return;
				}
				this.anInt3755 = local18 + local18 - this.anInt3755 - 1;
				this.anInt3757 = -this.anInt3757;
			}
		} else if (this.anInt3757 < 0) {
			while (true) {
				local40 = this.method3360(arg0, local40, local18, local44, local13.aByteArray17[this.anInt3768 - 1]);
				if (this.anInt3755 >= local18) {
					return;
				}
				this.anInt3755 = local23 - (local23 - 1 - this.anInt3755) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3340(arg0, local40, local23, local44, local13.aByteArray17[this.anInt3762]);
				if (this.anInt3755 < local23) {
					return;
				}
				this.anInt3755 = local18 + (this.anInt3755 - local18) % local33;
			}
		}
	}
}
