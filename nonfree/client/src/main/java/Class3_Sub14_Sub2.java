import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class3_Sub14_Sub2 extends Class3_Sub14 {

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
	private int anInt7715;

	@OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
	public int anInt7716;

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
	public int anInt7718;

	@OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
	public int anInt7720;

	@OriginalMember(owner = "client!pda", name = "B", descriptor = "I")
	public int anInt7724;

	@OriginalMember(owner = "client!pda", name = "D", descriptor = "I")
	private int anInt7726;

	@OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
	public int anInt7727;

	@OriginalMember(owner = "client!pda", name = "F", descriptor = "I")
	public int anInt7728;

	@OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
	private final int anInt7723;

	@OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
	private final int anInt7721;

	@OriginalMember(owner = "client!pda", name = "x", descriptor = "Z")
	private final boolean aBoolean652;

	@OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
	private int anInt7722;

	@OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
	private int anInt7719;

	@OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
	private int anInt7725;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
	public int anInt7717;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!bp;II)V")
	public Class3_Sub14_Sub2(@OriginalArg(0) Class3_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub6_5 = arg0;
		this.anInt7723 = arg0.anInt1102;
		this.anInt7721 = arg0.anInt1103;
		this.aBoolean652 = arg0.aBoolean88;
		this.anInt7722 = arg1;
		this.anInt7719 = arg2;
		this.anInt7725 = 8192;
		this.anInt7717 = 0;
		this.method6379();
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!bp;III)V")
	public Class3_Sub14_Sub2(@OriginalArg(0) Class3_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub6_5 = arg0;
		this.anInt7723 = arg0.anInt1102;
		this.anInt7721 = arg0.anInt1103;
		this.aBoolean652 = arg0.aBoolean88;
		this.anInt7722 = arg1;
		this.anInt7719 = arg2;
		this.anInt7725 = arg3;
		this.anInt7717 = 0;
		this.method6379();
	}

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "()Z")
	public boolean method6353() {
		return this.anInt7717 < 0 || this.anInt7717 >= ((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13.length << 8;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)V")
	public synchronized void method6356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6373(arg0, arg1, this.method6367());
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "()Lclient!ega;")
	@Override
	public Class3_Sub14 method7822() {
		return null;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V")
	public synchronized void method6357(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7717 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "()Lclient!ega;")
	@Override
	public Class3_Sub14 method7819() {
		return null;
	}

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "()I")
	public synchronized int method6367() {
		return this.anInt7725 < 0 ? -1 : this.anInt7725;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7823(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7719 == 0 && this.anInt7715 == 0) {
			this.method7821(arg2);
			return;
		}
		@Pc(13) Class3_Sub6_Sub1 local13 = (Class3_Sub6_Sub1) super.aClass3_Sub6_5;
		@Pc(18) int local18 = this.anInt7723 << 8;
		@Pc(23) int local23 = this.anInt7721 << 8;
		@Pc(29) int local29 = local13.aByteArray13.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7726 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7717 < 0) {
			if (this.anInt7722 <= 0) {
				this.method6389();
				this.method8412();
				return;
			}
			this.anInt7717 = 0;
		}
		if (this.anInt7717 >= local29) {
			if (this.anInt7722 >= 0) {
				this.method6389();
				this.method8412();
				return;
			}
			this.anInt7717 = local29 - 1;
		}
		if (this.anInt7726 >= 0) {
			if (this.anInt7726 > 0) {
				if (this.aBoolean652) {
					label130: {
						if (this.anInt7722 < 0) {
							local40 = this.method6385(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt7723]);
							if (this.anInt7717 >= local18) {
								return;
							}
							this.anInt7717 = local18 + local18 - this.anInt7717 - 1;
							this.anInt7722 = -this.anInt7722;
							if (--this.anInt7726 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6384(arg0, local40, local23, local44, local13.aByteArray13[this.anInt7721 - 1]);
							if (this.anInt7717 < local23) {
								return;
							}
							this.anInt7717 = local23 + local23 - this.anInt7717 - 1;
							this.anInt7722 = -this.anInt7722;
							if (--this.anInt7726 == 0) {
								break;
							}
							local40 = this.method6385(arg0, local40, local18, local44, local13.aByteArray13[this.anInt7723]);
							if (this.anInt7717 >= local18) {
								return;
							}
							this.anInt7717 = local18 + local18 - this.anInt7717 - 1;
							this.anInt7722 = -this.anInt7722;
						} while (--this.anInt7726 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7722 < 0) {
						while (true) {
							local40 = this.method6385(arg0, local40, local18, local44, local13.aByteArray13[this.anInt7721 - 1]);
							if (this.anInt7717 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7717 - 1) / local33;
							if (local416 >= this.anInt7726) {
								this.anInt7717 += local33 * this.anInt7726;
								this.anInt7726 = 0;
								break;
							}
							this.anInt7717 += local33 * local416;
							this.anInt7726 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6384(arg0, local40, local23, local44, local13.aByteArray13[this.anInt7723]);
							if (this.anInt7717 < local23) {
								return;
							}
							local416 = (this.anInt7717 - local18) / local33;
							if (local416 >= this.anInt7726) {
								this.anInt7717 -= local33 * this.anInt7726;
								this.anInt7726 = 0;
								break;
							}
							this.anInt7717 -= local33 * local416;
							this.anInt7726 -= local416;
						}
					}
				}
			}
			if (this.anInt7722 < 0) {
				this.method6385(arg0, local40, 0, local44, 0);
				if (this.anInt7717 < 0) {
					this.anInt7717 = -1;
					this.method6389();
					this.method8412();
					return;
				}
			} else {
				this.method6384(arg0, local40, local29, local44, 0);
				if (this.anInt7717 >= local29) {
					this.anInt7717 = local29;
					this.method6389();
					this.method8412();
				}
			}
		} else if (this.aBoolean652) {
			if (this.anInt7722 < 0) {
				local40 = this.method6385(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt7723]);
				if (this.anInt7717 >= local18) {
					return;
				}
				this.anInt7717 = local18 + local18 - this.anInt7717 - 1;
				this.anInt7722 = -this.anInt7722;
			}
			while (true) {
				local40 = this.method6384(arg0, local40, local23, local44, local13.aByteArray13[this.anInt7721 - 1]);
				if (this.anInt7717 < local23) {
					return;
				}
				this.anInt7717 = local23 + local23 - this.anInt7717 - 1;
				this.anInt7722 = -this.anInt7722;
				local40 = this.method6385(arg0, local40, local18, local44, local13.aByteArray13[this.anInt7723]);
				if (this.anInt7717 >= local18) {
					return;
				}
				this.anInt7717 = local18 + local18 - this.anInt7717 - 1;
				this.anInt7722 = -this.anInt7722;
			}
		} else if (this.anInt7722 < 0) {
			while (true) {
				local40 = this.method6385(arg0, local40, local18, local44, local13.aByteArray13[this.anInt7721 - 1]);
				if (this.anInt7717 >= local18) {
					return;
				}
				this.anInt7717 = local23 - (local23 - 1 - this.anInt7717) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6384(arg0, local40, local23, local44, local13.aByteArray13[this.anInt7723]);
				if (this.anInt7717 < local23) {
					return;
				}
				this.anInt7717 = local18 + (this.anInt7717 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
	public synchronized void method6368() {
		this.anInt7722 = (this.anInt7722 ^ this.anInt7722 >> 31) + (this.anInt7722 >>> 31);
		this.anInt7722 = -this.anInt7722;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
	public synchronized void method6369(@OriginalArg(0) int arg0) {
		this.anInt7726 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
	public synchronized void method6373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6382(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static606.method6362(arg1, arg2);
		@Pc(14) int local14 = Static606.method6358(arg1, arg2);
		if (this.anInt7728 == local10 && this.anInt7724 == local14) {
			this.anInt7715 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7718;
		if (this.anInt7718 - arg1 > local31) {
			local31 = this.anInt7718 - arg1;
		}
		if (local10 - this.anInt7728 > local31) {
			local31 = local10 - this.anInt7728;
		}
		if (this.anInt7728 - local10 > local31) {
			local31 = this.anInt7728 - local10;
		}
		if (local14 - this.anInt7724 > local31) {
			local31 = local14 - this.anInt7724;
		}
		if (this.anInt7724 - local14 > local31) {
			local31 = this.anInt7724 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7715 = arg0;
		this.anInt7719 = arg1;
		this.anInt7725 = arg2;
		this.anInt7716 = (arg1 - this.anInt7718) / arg0;
		this.anInt7727 = (local10 - this.anInt7728) / arg0;
		this.anInt7720 = (local14 - this.anInt7724) / arg0;
	}

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "()Z")
	public boolean method6375() {
		return this.anInt7715 != 0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7821(@OriginalArg(0) int arg0) {
		if (this.anInt7715 > 0) {
			if (arg0 >= this.anInt7715) {
				if (this.anInt7719 == Integer.MIN_VALUE) {
					this.anInt7719 = 0;
					this.anInt7718 = this.anInt7728 = this.anInt7724 = 0;
					this.method8412();
					arg0 = this.anInt7715;
				}
				this.anInt7715 = 0;
				this.method6379();
			} else {
				this.anInt7718 += this.anInt7716 * arg0;
				this.anInt7728 += this.anInt7727 * arg0;
				this.anInt7724 += this.anInt7720 * arg0;
				this.anInt7715 -= arg0;
			}
		}
		@Pc(71) Class3_Sub6_Sub1 local71 = (Class3_Sub6_Sub1) super.aClass3_Sub6_5;
		@Pc(76) int local76 = this.anInt7723 << 8;
		@Pc(81) int local81 = this.anInt7721 << 8;
		@Pc(87) int local87 = local71.aByteArray13.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7726 = 0;
		}
		if (this.anInt7717 < 0) {
			if (this.anInt7722 <= 0) {
				this.method6389();
				this.method8412();
				return;
			}
			this.anInt7717 = 0;
		}
		if (this.anInt7717 >= local87) {
			if (this.anInt7722 >= 0) {
				this.method6389();
				this.method8412();
				return;
			}
			this.anInt7717 = local87 - 1;
		}
		this.anInt7717 += this.anInt7722 * arg0;
		if (this.anInt7726 >= 0) {
			if (this.anInt7726 > 0) {
				if (this.aBoolean652) {
					label125: {
						if (this.anInt7722 < 0) {
							if (this.anInt7717 >= local76) {
								return;
							}
							this.anInt7717 = local76 + local76 - this.anInt7717 - 1;
							this.anInt7722 = -this.anInt7722;
							if (--this.anInt7726 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7717 < local81) {
								return;
							}
							this.anInt7717 = local81 + local81 - this.anInt7717 - 1;
							this.anInt7722 = -this.anInt7722;
							if (--this.anInt7726 == 0) {
								break;
							}
							if (this.anInt7717 >= local76) {
								return;
							}
							this.anInt7717 = local76 + local76 - this.anInt7717 - 1;
							this.anInt7722 = -this.anInt7722;
						} while (--this.anInt7726 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7722 < 0) {
						if (this.anInt7717 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7717 - 1) / local91;
						if (local361 < this.anInt7726) {
							this.anInt7717 += local91 * local361;
							this.anInt7726 -= local361;
							return;
						}
						this.anInt7717 += local91 * this.anInt7726;
						this.anInt7726 = 0;
					} else if (this.anInt7717 >= local81) {
						local361 = (this.anInt7717 - local76) / local91;
						if (local361 < this.anInt7726) {
							this.anInt7717 -= local91 * local361;
							this.anInt7726 -= local361;
							return;
						}
						this.anInt7717 -= local91 * this.anInt7726;
						this.anInt7726 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7722 < 0) {
				if (this.anInt7717 < 0) {
					this.anInt7717 = -1;
					this.method6389();
					this.method8412();
					return;
				}
			} else if (this.anInt7717 >= local87) {
				this.anInt7717 = local87;
				this.method6389();
				this.method8412();
			}
		} else if (this.aBoolean652) {
			if (this.anInt7722 < 0) {
				if (this.anInt7717 >= local76) {
					return;
				}
				this.anInt7717 = local76 + local76 - this.anInt7717 - 1;
				this.anInt7722 = -this.anInt7722;
			}
			while (this.anInt7717 >= local81) {
				this.anInt7717 = local81 + local81 - this.anInt7717 - 1;
				this.anInt7722 = -this.anInt7722;
				if (this.anInt7717 >= local76) {
					return;
				}
				this.anInt7717 = local76 + local76 - this.anInt7717 - 1;
				this.anInt7722 = -this.anInt7722;
			}
		} else if (this.anInt7722 < 0) {
			if (this.anInt7717 < local76) {
				this.anInt7717 = local81 - (local81 - 1 - this.anInt7717) % local91 - 1;
			}
		} else if (this.anInt7717 >= local81) {
			this.anInt7717 = local76 + (this.anInt7717 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "()I")
	public synchronized int method6377() {
		return this.anInt7722 < 0 ? -this.anInt7722 : this.anInt7722;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "()I")
	@Override
	public int method7820() {
		return this.anInt7719 == 0 && this.anInt7715 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "()I")
	@Override
	public int method7818() {
		@Pc(6) int local6 = this.anInt7718 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7726 == 0) {
			local6 -= local6 * this.anInt7717 / (((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13.length << 8);
		} else if (this.anInt7726 >= 0) {
			local6 -= local6 * this.anInt7723 / ((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "(I)V")
	public synchronized void method6378(@OriginalArg(0) int arg0) {
		this.method6382(arg0 << 6, this.method6367());
	}

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "()V")
	private void method6379() {
		this.anInt7718 = this.anInt7719;
		this.anInt7728 = Static606.method6362(this.anInt7719, this.anInt7725);
		this.anInt7724 = Static606.method6358(this.anInt7719, this.anInt7725);
	}

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "()Z")
	private boolean method6380() {
		@Pc(2) int local2 = this.anInt7719;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static606.method6362(local2, this.anInt7725);
			local8 = Static606.method6358(local2, this.anInt7725);
		}
		if (this.anInt7718 != local2 || this.anInt7728 != local10 || this.anInt7724 != local8) {
			if (this.anInt7718 < local2) {
				this.anInt7716 = 1;
				this.anInt7715 = local2 - this.anInt7718;
			} else if (this.anInt7718 > local2) {
				this.anInt7716 = -1;
				this.anInt7715 = this.anInt7718 - local2;
			} else {
				this.anInt7716 = 0;
			}
			if (this.anInt7728 < local10) {
				this.anInt7727 = 1;
				if (this.anInt7715 == 0 || this.anInt7715 > local10 - this.anInt7728) {
					this.anInt7715 = local10 - this.anInt7728;
				}
			} else if (this.anInt7728 > local10) {
				this.anInt7727 = -1;
				if (this.anInt7715 == 0 || this.anInt7715 > this.anInt7728 - local10) {
					this.anInt7715 = this.anInt7728 - local10;
				}
			} else {
				this.anInt7727 = 0;
			}
			if (this.anInt7724 < local8) {
				this.anInt7720 = 1;
				if (this.anInt7715 == 0 || this.anInt7715 > local8 - this.anInt7724) {
					this.anInt7715 = local8 - this.anInt7724;
				}
			} else if (this.anInt7724 > local8) {
				this.anInt7720 = -1;
				if (this.anInt7715 == 0 || this.anInt7715 > this.anInt7724 - local8) {
					this.anInt7715 = this.anInt7724 - local8;
				}
			} else {
				this.anInt7720 = 0;
			}
			return false;
		} else if (this.anInt7719 == Integer.MIN_VALUE) {
			this.anInt7719 = 0;
			this.anInt7718 = this.anInt7728 = this.anInt7724 = 0;
			this.method8412();
			return true;
		} else {
			this.method6379();
			return false;
		}
	}

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "(I)V")
	public synchronized void method6381(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6386();
			this.method8412();
		} else if (this.anInt7728 == 0 && this.anInt7724 == 0) {
			this.anInt7715 = 0;
			this.anInt7719 = 0;
			this.anInt7718 = 0;
			this.method8412();
		} else {
			@Pc(31) int local31 = -this.anInt7718;
			if (this.anInt7718 > local31) {
				local31 = this.anInt7718;
			}
			if (-this.anInt7728 > local31) {
				local31 = -this.anInt7728;
			}
			if (this.anInt7728 > local31) {
				local31 = this.anInt7728;
			}
			if (-this.anInt7724 > local31) {
				local31 = -this.anInt7724;
			}
			if (this.anInt7724 > local31) {
				local31 = this.anInt7724;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7715 = arg0;
			this.anInt7719 = Integer.MIN_VALUE;
			this.anInt7716 = -this.anInt7718 / arg0;
			this.anInt7727 = -this.anInt7728 / arg0;
			this.anInt7720 = -this.anInt7724 / arg0;
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(II)V")
	private synchronized void method6382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7719 = arg0;
		this.anInt7725 = arg1;
		this.anInt7715 = 0;
		this.method6379();
	}

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "()I")
	public synchronized int method6383() {
		return this.anInt7719 == Integer.MIN_VALUE ? 0 : this.anInt7719;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([IIIII)I")
	private int method6384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7715 <= 0) {
				if (this.anInt7722 == 256 && (this.anInt7717 & 0xFF) == 0) {
					if (Static124.aBoolean223) {
						return Static606.method6359(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, arg3, arg2, this);
					}
					return Static606.method6370(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, arg3, arg2, this);
				}
				if (Static124.aBoolean223) {
					return Static606.method6390(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, arg3, arg2, this, this.anInt7722, arg4);
				}
				return Static606.method6372(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, arg3, arg2, this, this.anInt7722, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7715;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7715 += arg1;
			if (this.anInt7722 == 256 && (this.anInt7717 & 0xFF) == 0) {
				if (Static124.aBoolean223) {
					arg1 = Static606.method6374(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, this.anInt7727, this.anInt7720, local5, arg2, this);
				} else {
					arg1 = Static606.method6352(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, this.anInt7716, local5, arg2, this);
				}
			} else if (Static124.aBoolean223) {
				arg1 = Static606.method6361(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, this.anInt7727, this.anInt7720, local5, arg2, this, this.anInt7722, arg4);
			} else {
				arg1 = Static606.method6366(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, this.anInt7716, local5, arg2, this, this.anInt7722, arg4);
			}
			this.anInt7715 -= arg1;
			if (this.anInt7715 != 0) {
				return arg1;
			}
		} while (!this.method6380());
		return arg3;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "([IIIII)I")
	private int method6385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7715 <= 0) {
				if (this.anInt7722 == -256 && (this.anInt7717 & 0xFF) == 0) {
					if (Static124.aBoolean223) {
						return Static606.method6360(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, arg3, arg2, this);
					}
					return Static606.method6387(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, arg3, arg2, this);
				}
				if (Static124.aBoolean223) {
					return Static606.method6364(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, arg3, arg2, this, this.anInt7722, arg4);
				}
				return Static606.method6363(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, arg3, arg2, this, this.anInt7722, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7715;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7715 += arg1;
			if (this.anInt7722 == -256 && (this.anInt7717 & 0xFF) == 0) {
				if (Static124.aBoolean223) {
					arg1 = Static606.method6371(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, this.anInt7727, this.anInt7720, local5, arg2, this);
				} else {
					arg1 = Static606.method6365(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, this.anInt7716, local5, arg2, this);
				}
			} else if (Static124.aBoolean223) {
				arg1 = Static606.method6391(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7728, this.anInt7724, this.anInt7727, this.anInt7720, local5, arg2, this, this.anInt7722, arg4);
			} else {
				arg1 = Static606.method6376(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray13, arg0, this.anInt7717, arg1, this.anInt7718, this.anInt7716, local5, arg2, this, this.anInt7722, arg4);
			}
			this.anInt7715 -= arg1;
			if (this.anInt7715 != 0) {
				return arg1;
			}
		} while (!this.method6380());
		return arg3;
	}

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "(I)V")
	private synchronized void method6386() {
		this.method6382(0, this.method6367());
	}

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "(I)V")
	public synchronized void method6388(@OriginalArg(0) int arg0) {
		if (this.anInt7722 < 0) {
			this.anInt7722 = -arg0;
		} else {
			this.anInt7722 = arg0;
		}
	}

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "()V")
	private void method6389() {
		if (this.anInt7715 == 0) {
			return;
		}
		if (this.anInt7719 == Integer.MIN_VALUE) {
			this.anInt7719 = 0;
		}
		this.anInt7715 = 0;
		this.method6379();
	}
}
