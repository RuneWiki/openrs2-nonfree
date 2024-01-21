import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class3_Sub5_Sub4 extends Class3_Sub5 {

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int anInt3852;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public int anInt3855;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public int anInt3857;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	private int anInt3858;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	public int anInt3863;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	private final int anInt3856;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "I")
	private final int anInt3861;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Z")
	private final boolean aBoolean168;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	private int anInt3851;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	private int anInt3853;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	private int anInt3864;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public int anInt3859;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!wc;II)V")
	public Class3_Sub5_Sub4(@OriginalArg(0) Class3_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub9_5 = arg0;
		this.anInt3856 = arg0.anInt3890;
		this.anInt3861 = arg0.anInt3891;
		this.aBoolean168 = arg0.aBoolean169;
		this.anInt3851 = arg1;
		this.anInt3853 = arg2;
		this.anInt3864 = 8192;
		this.anInt3859 = 0;
		this.method2813();
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!wc;III)V")
	public Class3_Sub5_Sub4(@OriginalArg(0) Class3_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub9_5 = arg0;
		this.anInt3856 = arg0.anInt3890;
		this.anInt3861 = arg0.anInt3891;
		this.aBoolean168 = arg0.aBoolean169;
		this.anInt3851 = arg1;
		this.anInt3853 = arg2;
		this.anInt3864 = arg3;
		this.anInt3859 = 0;
		this.method2813();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3853 == 0 && this.anInt3860 == 0) {
			this.method2769(arg2);
			return;
		}
		@Pc(13) Class3_Sub9_Sub1 local13 = (Class3_Sub9_Sub1) super.aClass3_Sub9_5;
		@Pc(18) int local18 = this.anInt3856 << 8;
		@Pc(23) int local23 = this.anInt3861 << 8;
		@Pc(29) int local29 = local13.aByteArray48.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3858 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3859 < 0) {
			if (this.anInt3851 <= 0) {
				this.method2787();
				this.method2900();
				return;
			}
			this.anInt3859 = 0;
		}
		if (this.anInt3859 >= local29) {
			if (this.anInt3851 >= 0) {
				this.method2787();
				this.method2900();
				return;
			}
			this.anInt3859 = local29 - 1;
		}
		if (this.anInt3858 >= 0) {
			if (this.anInt3858 > 0) {
				if (this.aBoolean168) {
					label130: {
						if (this.anInt3851 < 0) {
							local40 = this.method2795(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt3856]);
							if (this.anInt3859 >= local18) {
								return;
							}
							this.anInt3859 = local18 + local18 - this.anInt3859 - 1;
							this.anInt3851 = -this.anInt3851;
							if (--this.anInt3858 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2811(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3861 - 1]);
							if (this.anInt3859 < local23) {
								return;
							}
							this.anInt3859 = local23 + local23 - this.anInt3859 - 1;
							this.anInt3851 = -this.anInt3851;
							if (--this.anInt3858 == 0) {
								break;
							}
							local40 = this.method2795(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3856]);
							if (this.anInt3859 >= local18) {
								return;
							}
							this.anInt3859 = local18 + local18 - this.anInt3859 - 1;
							this.anInt3851 = -this.anInt3851;
						} while (--this.anInt3858 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3851 < 0) {
						while (true) {
							local40 = this.method2795(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3861 - 1]);
							if (this.anInt3859 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3859 - 1) / local33;
							if (local416 >= this.anInt3858) {
								this.anInt3859 += local33 * this.anInt3858;
								this.anInt3858 = 0;
								break;
							}
							this.anInt3859 += local33 * local416;
							this.anInt3858 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2811(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3856]);
							if (this.anInt3859 < local23) {
								return;
							}
							local416 = (this.anInt3859 - local18) / local33;
							if (local416 >= this.anInt3858) {
								this.anInt3859 -= local33 * this.anInt3858;
								this.anInt3858 = 0;
								break;
							}
							this.anInt3859 -= local33 * local416;
							this.anInt3858 -= local416;
						}
					}
				}
			}
			if (this.anInt3851 < 0) {
				this.method2795(arg0, local40, 0, local44, 0);
				if (this.anInt3859 < 0) {
					this.anInt3859 = -1;
					this.method2787();
					this.method2900();
					return;
				}
			} else {
				this.method2811(arg0, local40, local29, local44, 0);
				if (this.anInt3859 >= local29) {
					this.anInt3859 = local29;
					this.method2787();
					this.method2900();
				}
			}
		} else if (this.aBoolean168) {
			if (this.anInt3851 < 0) {
				local40 = this.method2795(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt3856]);
				if (this.anInt3859 >= local18) {
					return;
				}
				this.anInt3859 = local18 + local18 - this.anInt3859 - 1;
				this.anInt3851 = -this.anInt3851;
			}
			while (true) {
				local40 = this.method2811(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3861 - 1]);
				if (this.anInt3859 < local23) {
					return;
				}
				this.anInt3859 = local23 + local23 - this.anInt3859 - 1;
				this.anInt3851 = -this.anInt3851;
				local40 = this.method2795(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3856]);
				if (this.anInt3859 >= local18) {
					return;
				}
				this.anInt3859 = local18 + local18 - this.anInt3859 - 1;
				this.anInt3851 = -this.anInt3851;
			}
		} else if (this.anInt3851 < 0) {
			while (true) {
				local40 = this.method2795(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3861 - 1]);
				if (this.anInt3859 >= local18) {
					return;
				}
				this.anInt3859 = local23 - (local23 - 1 - this.anInt3859) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2811(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3856]);
				if (this.anInt3859 < local23) {
					return;
				}
				this.anInt3859 = local18 + (this.anInt3859 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public synchronized void method2776(@OriginalArg(0) int arg0) {
		if (this.anInt3851 < 0) {
			this.anInt3851 = -arg0;
		} else {
			this.anInt3851 = arg0;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	public synchronized void method2782() {
		this.anInt3851 = (this.anInt3851 ^ this.anInt3851 >> 31) + (this.anInt3851 >>> 31);
		this.anInt3851 = -this.anInt3851;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
	@Override
	public int method2772() {
		@Pc(6) int local6 = this.anInt3855 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3858 == 0) {
			local6 -= local6 * this.anInt3859 / (((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48.length << 8);
		} else if (this.anInt3858 >= 0) {
			local6 -= local6 * this.anInt3856 / ((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
	public boolean method2783() {
		return this.anInt3859 < 0 || this.anInt3859 >= ((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48.length << 8;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	public synchronized void method2785(@OriginalArg(0) int arg0) {
		this.anInt3858 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
	private void method2787() {
		if (this.anInt3860 == 0) {
			return;
		}
		if (this.anInt3853 == Integer.MIN_VALUE) {
			this.anInt3853 = 0;
		}
		this.anInt3860 = 0;
		this.method2813();
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()I")
	public synchronized int method2788() {
		return this.anInt3853 == Integer.MIN_VALUE ? 0 : this.anInt3853;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	private synchronized void method2789() {
		this.method2815(0, this.method2793());
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	public synchronized void method2790(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2789();
			this.method2900();
		} else if (this.anInt3862 == 0 && this.anInt3857 == 0) {
			this.anInt3860 = 0;
			this.anInt3853 = 0;
			this.anInt3855 = 0;
			this.method2900();
		} else {
			@Pc(31) int local31 = -this.anInt3855;
			if (this.anInt3855 > local31) {
				local31 = this.anInt3855;
			}
			if (-this.anInt3862 > local31) {
				local31 = -this.anInt3862;
			}
			if (this.anInt3862 > local31) {
				local31 = this.anInt3862;
			}
			if (-this.anInt3857 > local31) {
				local31 = -this.anInt3857;
			}
			if (this.anInt3857 > local31) {
				local31 = this.anInt3857;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3860 = arg0;
			this.anInt3853 = Integer.MIN_VALUE;
			this.anInt3852 = -this.anInt3855 / arg0;
			this.anInt3854 = -this.anInt3862 / arg0;
			this.anInt3863 = -this.anInt3857 / arg0;
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Lclient!le;")
	@Override
	public Class3_Sub5 method2775() {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
	@Override
	public int method2770() {
		return this.anInt3853 == 0 && this.anInt3860 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2769(@OriginalArg(0) int arg0) {
		if (this.anInt3860 > 0) {
			if (arg0 >= this.anInt3860) {
				if (this.anInt3853 == Integer.MIN_VALUE) {
					this.anInt3853 = 0;
					this.anInt3855 = this.anInt3862 = this.anInt3857 = 0;
					this.method2900();
					arg0 = this.anInt3860;
				}
				this.anInt3860 = 0;
				this.method2813();
			} else {
				this.anInt3855 += this.anInt3852 * arg0;
				this.anInt3862 += this.anInt3854 * arg0;
				this.anInt3857 += this.anInt3863 * arg0;
				this.anInt3860 -= arg0;
			}
		}
		@Pc(71) Class3_Sub9_Sub1 local71 = (Class3_Sub9_Sub1) super.aClass3_Sub9_5;
		@Pc(76) int local76 = this.anInt3856 << 8;
		@Pc(81) int local81 = this.anInt3861 << 8;
		@Pc(87) int local87 = local71.aByteArray48.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3858 = 0;
		}
		if (this.anInt3859 < 0) {
			if (this.anInt3851 <= 0) {
				this.method2787();
				this.method2900();
				return;
			}
			this.anInt3859 = 0;
		}
		if (this.anInt3859 >= local87) {
			if (this.anInt3851 >= 0) {
				this.method2787();
				this.method2900();
				return;
			}
			this.anInt3859 = local87 - 1;
		}
		this.anInt3859 += this.anInt3851 * arg0;
		if (this.anInt3858 >= 0) {
			if (this.anInt3858 > 0) {
				if (this.aBoolean168) {
					label125: {
						if (this.anInt3851 < 0) {
							if (this.anInt3859 >= local76) {
								return;
							}
							this.anInt3859 = local76 + local76 - this.anInt3859 - 1;
							this.anInt3851 = -this.anInt3851;
							if (--this.anInt3858 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3859 < local81) {
								return;
							}
							this.anInt3859 = local81 + local81 - this.anInt3859 - 1;
							this.anInt3851 = -this.anInt3851;
							if (--this.anInt3858 == 0) {
								break;
							}
							if (this.anInt3859 >= local76) {
								return;
							}
							this.anInt3859 = local76 + local76 - this.anInt3859 - 1;
							this.anInt3851 = -this.anInt3851;
						} while (--this.anInt3858 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3851 < 0) {
						if (this.anInt3859 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3859 - 1) / local91;
						if (local361 < this.anInt3858) {
							this.anInt3859 += local91 * local361;
							this.anInt3858 -= local361;
							return;
						}
						this.anInt3859 += local91 * this.anInt3858;
						this.anInt3858 = 0;
					} else if (this.anInt3859 >= local81) {
						local361 = (this.anInt3859 - local76) / local91;
						if (local361 < this.anInt3858) {
							this.anInt3859 -= local91 * local361;
							this.anInt3858 -= local361;
							return;
						}
						this.anInt3859 -= local91 * this.anInt3858;
						this.anInt3858 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3851 < 0) {
				if (this.anInt3859 < 0) {
					this.anInt3859 = -1;
					this.method2787();
					this.method2900();
					return;
				}
			} else if (this.anInt3859 >= local87) {
				this.anInt3859 = local87;
				this.method2787();
				this.method2900();
			}
		} else if (this.aBoolean168) {
			if (this.anInt3851 < 0) {
				if (this.anInt3859 >= local76) {
					return;
				}
				this.anInt3859 = local76 + local76 - this.anInt3859 - 1;
				this.anInt3851 = -this.anInt3851;
			}
			while (this.anInt3859 >= local81) {
				this.anInt3859 = local81 + local81 - this.anInt3859 - 1;
				this.anInt3851 = -this.anInt3851;
				if (this.anInt3859 >= local76) {
					return;
				}
				this.anInt3859 = local76 + local76 - this.anInt3859 - 1;
				this.anInt3851 = -this.anInt3851;
			}
		} else if (this.anInt3851 < 0) {
			if (this.anInt3859 < local76) {
				this.anInt3859 = local81 - (local81 - 1 - this.anInt3859) % local91 - 1;
			}
		} else if (this.anInt3859 >= local81) {
			this.anInt3859 = local76 + (this.anInt3859 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
	private boolean method2792() {
		@Pc(2) int local2 = this.anInt3853;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static189.method2799(local2, this.anInt3864);
			local8 = Static189.method2784(local2, this.anInt3864);
		}
		if (this.anInt3855 != local2 || this.anInt3862 != local10 || this.anInt3857 != local8) {
			if (this.anInt3855 < local2) {
				this.anInt3852 = 1;
				this.anInt3860 = local2 - this.anInt3855;
			} else if (this.anInt3855 > local2) {
				this.anInt3852 = -1;
				this.anInt3860 = this.anInt3855 - local2;
			} else {
				this.anInt3852 = 0;
			}
			if (this.anInt3862 < local10) {
				this.anInt3854 = 1;
				if (this.anInt3860 == 0 || this.anInt3860 > local10 - this.anInt3862) {
					this.anInt3860 = local10 - this.anInt3862;
				}
			} else if (this.anInt3862 > local10) {
				this.anInt3854 = -1;
				if (this.anInt3860 == 0 || this.anInt3860 > this.anInt3862 - local10) {
					this.anInt3860 = this.anInt3862 - local10;
				}
			} else {
				this.anInt3854 = 0;
			}
			if (this.anInt3857 < local8) {
				this.anInt3863 = 1;
				if (this.anInt3860 == 0 || this.anInt3860 > local8 - this.anInt3857) {
					this.anInt3860 = local8 - this.anInt3857;
				}
			} else if (this.anInt3857 > local8) {
				this.anInt3863 = -1;
				if (this.anInt3860 == 0 || this.anInt3860 > this.anInt3857 - local8) {
					this.anInt3860 = this.anInt3857 - local8;
				}
			} else {
				this.anInt3863 = 0;
			}
			return false;
		} else if (this.anInt3853 == Integer.MIN_VALUE) {
			this.anInt3853 = 0;
			this.anInt3855 = this.anInt3862 = this.anInt3857 = 0;
			this.method2900();
			return true;
		} else {
			this.method2813();
			return false;
		}
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()I")
	public synchronized int method2793() {
		return this.anInt3864 < 0 ? -1 : this.anInt3864;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)I")
	private int method2795(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3860 <= 0) {
				if (this.anInt3851 == -256 && (this.anInt3859 & 0xFF) == 0) {
					if (Static3.aBoolean5) {
						return Static189.method2812(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, arg3, arg2, this);
					}
					return Static189.method2786(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, arg3, arg2, this);
				}
				if (Static3.aBoolean5) {
					return Static189.method2803(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, arg3, arg2, this, this.anInt3851, arg4);
				}
				return Static189.method2778(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, arg3, arg2, this, this.anInt3851, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3860;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3860 += arg1;
			if (this.anInt3851 == -256 && (this.anInt3859 & 0xFF) == 0) {
				if (Static3.aBoolean5) {
					arg1 = Static189.method2777(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, this.anInt3854, this.anInt3863, local5, arg2, this);
				} else {
					arg1 = Static189.method2800(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, this.anInt3852, local5, arg2, this);
				}
			} else if (Static3.aBoolean5) {
				arg1 = Static189.method2805(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, this.anInt3854, this.anInt3863, local5, arg2, this, this.anInt3851, arg4);
			} else {
				arg1 = Static189.method2802(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, this.anInt3852, local5, arg2, this, this.anInt3851, arg4);
			}
			this.anInt3860 -= arg1;
			if (this.anInt3860 != 0) {
				return arg1;
			}
		} while (!this.method2792());
		return arg3;
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	public boolean method2796() {
		return this.anInt3860 != 0;
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	public synchronized void method2798(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3859 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
	public synchronized void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2810(arg0, arg1, this.method2793());
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
	public synchronized void method2808(@OriginalArg(0) int arg0) {
		this.method2815(arg0 << 6, this.method2793());
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()I")
	public synchronized int method2809() {
		return this.anInt3851 < 0 ? -this.anInt3851 : this.anInt3851;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public synchronized void method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2815(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static189.method2799(arg1, arg2);
		@Pc(14) int local14 = Static189.method2784(arg1, arg2);
		if (this.anInt3862 == local10 && this.anInt3857 == local14) {
			this.anInt3860 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3855;
		if (this.anInt3855 - arg1 > local31) {
			local31 = this.anInt3855 - arg1;
		}
		if (local10 - this.anInt3862 > local31) {
			local31 = local10 - this.anInt3862;
		}
		if (this.anInt3862 - local10 > local31) {
			local31 = this.anInt3862 - local10;
		}
		if (local14 - this.anInt3857 > local31) {
			local31 = local14 - this.anInt3857;
		}
		if (this.anInt3857 - local14 > local31) {
			local31 = this.anInt3857 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3860 = arg0;
		this.anInt3853 = arg1;
		this.anInt3864 = arg2;
		this.anInt3852 = (arg1 - this.anInt3855) / arg0;
		this.anInt3854 = (local10 - this.anInt3862) / arg0;
		this.anInt3863 = (local14 - this.anInt3857) / arg0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "([IIIII)I")
	private int method2811(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3860 <= 0) {
				if (this.anInt3851 == 256 && (this.anInt3859 & 0xFF) == 0) {
					if (Static3.aBoolean5) {
						return Static189.method2779(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, arg3, arg2, this);
					}
					return Static189.method2797(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, arg3, arg2, this);
				}
				if (Static3.aBoolean5) {
					return Static189.method2814(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, arg3, arg2, this, this.anInt3851, arg4);
				}
				return Static189.method2791(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, arg3, arg2, this, this.anInt3851, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3860;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3860 += arg1;
			if (this.anInt3851 == 256 && (this.anInt3859 & 0xFF) == 0) {
				if (Static3.aBoolean5) {
					arg1 = Static189.method2804(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, this.anInt3854, this.anInt3863, local5, arg2, this);
				} else {
					arg1 = Static189.method2807(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, this.anInt3852, local5, arg2, this);
				}
			} else if (Static3.aBoolean5) {
				arg1 = Static189.method2806(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3862, this.anInt3857, this.anInt3854, this.anInt3863, local5, arg2, this, this.anInt3851, arg4);
			} else {
				arg1 = Static189.method2781(((Class3_Sub9_Sub1) super.aClass3_Sub9_5).aByteArray48, arg0, this.anInt3859, arg1, this.anInt3855, this.anInt3852, local5, arg2, this, this.anInt3851, arg4);
			}
			this.anInt3860 -= arg1;
			if (this.anInt3860 != 0) {
				return arg1;
			}
		} while (!this.method2792());
		return arg3;
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()V")
	private void method2813() {
		this.anInt3855 = this.anInt3853;
		this.anInt3862 = Static189.method2799(this.anInt3853, this.anInt3864);
		this.anInt3857 = Static189.method2784(this.anInt3853, this.anInt3864);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()Lclient!le;")
	@Override
	public Class3_Sub5 method2774() {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	private synchronized void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3853 = arg0;
		this.anInt3864 = arg1;
		this.anInt3860 = 0;
		this.method2813();
	}
}
