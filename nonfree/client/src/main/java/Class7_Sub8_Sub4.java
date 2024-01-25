import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class7_Sub8_Sub4 extends Class7_Sub8 {

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public int anInt6142;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	private int anInt6146;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	private int anInt6147;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	public int anInt6148;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public int anInt6149;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public int anInt6153;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public int anInt6154;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	private final int anInt6150;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	private final int anInt6145;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Z")
	private final boolean aBoolean404;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	private int anInt6143;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private int anInt6141;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	public int anInt6151;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!lv;II)V")
	public Class7_Sub8_Sub4(@OriginalArg(0) Class7_Sub31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass7_Sub31_5 = arg0;
		this.anInt6150 = arg0.anInt4157;
		this.anInt6145 = arg0.anInt4159;
		this.aBoolean404 = arg0.aBoolean253;
		this.anInt6143 = arg1;
		this.anInt6141 = arg2;
		this.anInt6152 = 8192;
		this.anInt6151 = 0;
		this.method4888();
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!lv;III)V")
	public Class7_Sub8_Sub4(@OriginalArg(0) Class7_Sub31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass7_Sub31_5 = arg0;
		this.anInt6150 = arg0.anInt4157;
		this.anInt6145 = arg0.anInt4159;
		this.aBoolean404 = arg0.aBoolean253;
		this.anInt6143 = arg1;
		this.anInt6141 = arg2;
		this.anInt6152 = arg3;
		this.anInt6151 = 0;
		this.method4888();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4871(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6141 == 0 && this.anInt6146 == 0) {
			this.method4870(arg2);
			return;
		}
		@Pc(13) Class7_Sub31_Sub1 local13 = (Class7_Sub31_Sub1) super.aClass7_Sub31_5;
		@Pc(18) int local18 = this.anInt6150 << 8;
		@Pc(23) int local23 = this.anInt6145 << 8;
		@Pc(29) int local29 = local13.aByteArray56.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6147 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6151 < 0) {
			if (this.anInt6143 <= 0) {
				this.method4890();
				this.method5802();
				return;
			}
			this.anInt6151 = 0;
		}
		if (this.anInt6151 >= local29) {
			if (this.anInt6143 >= 0) {
				this.method4890();
				this.method5802();
				return;
			}
			this.anInt6151 = local29 - 1;
		}
		if (this.anInt6147 >= 0) {
			if (this.anInt6147 > 0) {
				if (this.aBoolean404) {
					label130: {
						if (this.anInt6143 < 0) {
							local40 = this.method4878(arg0, arg1, local18, local44, local13.aByteArray56[this.anInt6150]);
							if (this.anInt6151 >= local18) {
								return;
							}
							this.anInt6151 = local18 + local18 - this.anInt6151 - 1;
							this.anInt6143 = -this.anInt6143;
							if (--this.anInt6147 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4910(arg0, local40, local23, local44, local13.aByteArray56[this.anInt6145 - 1]);
							if (this.anInt6151 < local23) {
								return;
							}
							this.anInt6151 = local23 + local23 - this.anInt6151 - 1;
							this.anInt6143 = -this.anInt6143;
							if (--this.anInt6147 == 0) {
								break;
							}
							local40 = this.method4878(arg0, local40, local18, local44, local13.aByteArray56[this.anInt6150]);
							if (this.anInt6151 >= local18) {
								return;
							}
							this.anInt6151 = local18 + local18 - this.anInt6151 - 1;
							this.anInt6143 = -this.anInt6143;
						} while (--this.anInt6147 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6143 < 0) {
						while (true) {
							local40 = this.method4878(arg0, local40, local18, local44, local13.aByteArray56[this.anInt6145 - 1]);
							if (this.anInt6151 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6151 - 1) / local33;
							if (local416 >= this.anInt6147) {
								this.anInt6151 += local33 * this.anInt6147;
								this.anInt6147 = 0;
								break;
							}
							this.anInt6151 += local33 * local416;
							this.anInt6147 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4910(arg0, local40, local23, local44, local13.aByteArray56[this.anInt6150]);
							if (this.anInt6151 < local23) {
								return;
							}
							local416 = (this.anInt6151 - local18) / local33;
							if (local416 >= this.anInt6147) {
								this.anInt6151 -= local33 * this.anInt6147;
								this.anInt6147 = 0;
								break;
							}
							this.anInt6151 -= local33 * local416;
							this.anInt6147 -= local416;
						}
					}
				}
			}
			if (this.anInt6143 < 0) {
				this.method4878(arg0, local40, 0, local44, 0);
				if (this.anInt6151 < 0) {
					this.anInt6151 = -1;
					this.method4890();
					this.method5802();
					return;
				}
			} else {
				this.method4910(arg0, local40, local29, local44, 0);
				if (this.anInt6151 >= local29) {
					this.anInt6151 = local29;
					this.method4890();
					this.method5802();
				}
			}
		} else if (this.aBoolean404) {
			if (this.anInt6143 < 0) {
				local40 = this.method4878(arg0, arg1, local18, local44, local13.aByteArray56[this.anInt6150]);
				if (this.anInt6151 >= local18) {
					return;
				}
				this.anInt6151 = local18 + local18 - this.anInt6151 - 1;
				this.anInt6143 = -this.anInt6143;
			}
			while (true) {
				local40 = this.method4910(arg0, local40, local23, local44, local13.aByteArray56[this.anInt6145 - 1]);
				if (this.anInt6151 < local23) {
					return;
				}
				this.anInt6151 = local23 + local23 - this.anInt6151 - 1;
				this.anInt6143 = -this.anInt6143;
				local40 = this.method4878(arg0, local40, local18, local44, local13.aByteArray56[this.anInt6150]);
				if (this.anInt6151 >= local18) {
					return;
				}
				this.anInt6151 = local18 + local18 - this.anInt6151 - 1;
				this.anInt6143 = -this.anInt6143;
			}
		} else if (this.anInt6143 < 0) {
			while (true) {
				local40 = this.method4878(arg0, local40, local18, local44, local13.aByteArray56[this.anInt6145 - 1]);
				if (this.anInt6151 >= local18) {
					return;
				}
				this.anInt6151 = local23 - (local23 - 1 - this.anInt6151) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4910(arg0, local40, local23, local44, local13.aByteArray56[this.anInt6150]);
				if (this.anInt6151 < local23) {
					return;
				}
				this.anInt6151 = local18 + (this.anInt6151 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()Z")
	private boolean method4873() {
		@Pc(2) int local2 = this.anInt6141;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static467.method4892(local2, this.anInt6152);
			local8 = Static467.method4907(local2, this.anInt6152);
		}
		if (this.anInt6144 != local2 || this.anInt6154 != local10 || this.anInt6149 != local8) {
			if (this.anInt6144 < local2) {
				this.anInt6142 = 1;
				this.anInt6146 = local2 - this.anInt6144;
			} else if (this.anInt6144 > local2) {
				this.anInt6142 = -1;
				this.anInt6146 = this.anInt6144 - local2;
			} else {
				this.anInt6142 = 0;
			}
			if (this.anInt6154 < local10) {
				this.anInt6153 = 1;
				if (this.anInt6146 == 0 || this.anInt6146 > local10 - this.anInt6154) {
					this.anInt6146 = local10 - this.anInt6154;
				}
			} else if (this.anInt6154 > local10) {
				this.anInt6153 = -1;
				if (this.anInt6146 == 0 || this.anInt6146 > this.anInt6154 - local10) {
					this.anInt6146 = this.anInt6154 - local10;
				}
			} else {
				this.anInt6153 = 0;
			}
			if (this.anInt6149 < local8) {
				this.anInt6148 = 1;
				if (this.anInt6146 == 0 || this.anInt6146 > local8 - this.anInt6149) {
					this.anInt6146 = local8 - this.anInt6149;
				}
			} else if (this.anInt6149 > local8) {
				this.anInt6148 = -1;
				if (this.anInt6146 == 0 || this.anInt6146 > this.anInt6149 - local8) {
					this.anInt6146 = this.anInt6149 - local8;
				}
			} else {
				this.anInt6148 = 0;
			}
			return false;
		} else if (this.anInt6141 == Integer.MIN_VALUE) {
			this.anInt6141 = 0;
			this.anInt6144 = this.anInt6154 = this.anInt6149 = 0;
			this.method5802();
			return true;
		} else {
			this.method4888();
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	public synchronized void method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4904(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static467.method4892(arg1, arg2);
		@Pc(14) int local14 = Static467.method4907(arg1, arg2);
		if (this.anInt6154 == local10 && this.anInt6149 == local14) {
			this.anInt6146 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6144;
		if (this.anInt6144 - arg1 > local31) {
			local31 = this.anInt6144 - arg1;
		}
		if (local10 - this.anInt6154 > local31) {
			local31 = local10 - this.anInt6154;
		}
		if (this.anInt6154 - local10 > local31) {
			local31 = this.anInt6154 - local10;
		}
		if (local14 - this.anInt6149 > local31) {
			local31 = local14 - this.anInt6149;
		}
		if (this.anInt6149 - local14 > local31) {
			local31 = this.anInt6149 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6146 = arg0;
		this.anInt6141 = arg1;
		this.anInt6152 = arg2;
		this.anInt6142 = (arg1 - this.anInt6144) / arg0;
		this.anInt6153 = (local10 - this.anInt6154) / arg0;
		this.anInt6148 = (local14 - this.anInt6149) / arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public synchronized void method4876() {
		this.anInt6143 = (this.anInt6143 ^ this.anInt6143 >> 31) + (this.anInt6143 >>> 31);
		this.anInt6143 = -this.anInt6143;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "()I")
	public synchronized int method4877() {
		return this.anInt6152 < 0 ? -1 : this.anInt6152;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()Lclient!bs;")
	@Override
	public Class7_Sub8 method4872() {
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIII)I")
	private int method4878(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6146 <= 0) {
				if (this.anInt6143 == -256 && (this.anInt6151 & 0xFF) == 0) {
					if (Static213.aBoolean232) {
						return Static467.method4903(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, arg3, arg2, this);
					}
					return Static467.method4911(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, arg3, arg2, this);
				}
				if (Static213.aBoolean232) {
					return Static467.method4886(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, arg3, arg2, this, this.anInt6143, arg4);
				}
				return Static467.method4898(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, arg3, arg2, this, this.anInt6143, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6146;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6146 += arg1;
			if (this.anInt6143 == -256 && (this.anInt6151 & 0xFF) == 0) {
				if (Static213.aBoolean232) {
					arg1 = Static467.method4894(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, this.anInt6153, this.anInt6148, local5, arg2, this);
				} else {
					arg1 = Static467.method4899(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, this.anInt6142, local5, arg2, this);
				}
			} else if (Static213.aBoolean232) {
				arg1 = Static467.method4897(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, this.anInt6153, this.anInt6148, local5, arg2, this, this.anInt6143, arg4);
			} else {
				arg1 = Static467.method4893(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, this.anInt6142, local5, arg2, this, this.anInt6143, arg4);
			}
			this.anInt6146 -= arg1;
			if (this.anInt6146 != 0) {
				return arg1;
			}
		} while (!this.method4873());
		return arg3;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	private synchronized void method4879() {
		this.method4904(0, this.method4877());
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public synchronized void method4880(@OriginalArg(0) int arg0) {
		this.method4904(arg0 << 6, this.method4877());
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()Lclient!bs;")
	@Override
	public Class7_Sub8 method4866() {
		return null;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public synchronized void method4883(@OriginalArg(0) int arg0) {
		this.anInt6147 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public synchronized void method4885(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4879();
			this.method5802();
		} else if (this.anInt6154 == 0 && this.anInt6149 == 0) {
			this.anInt6146 = 0;
			this.anInt6141 = 0;
			this.anInt6144 = 0;
			this.method5802();
		} else {
			@Pc(31) int local31 = -this.anInt6144;
			if (this.anInt6144 > local31) {
				local31 = this.anInt6144;
			}
			if (-this.anInt6154 > local31) {
				local31 = -this.anInt6154;
			}
			if (this.anInt6154 > local31) {
				local31 = this.anInt6154;
			}
			if (-this.anInt6149 > local31) {
				local31 = -this.anInt6149;
			}
			if (this.anInt6149 > local31) {
				local31 = this.anInt6149;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6146 = arg0;
			this.anInt6141 = Integer.MIN_VALUE;
			this.anInt6142 = -this.anInt6144 / arg0;
			this.anInt6153 = -this.anInt6154 / arg0;
			this.anInt6148 = -this.anInt6149 / arg0;
		}
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
	private void method4888() {
		this.anInt6144 = this.anInt6141;
		this.anInt6154 = Static467.method4892(this.anInt6141, this.anInt6152);
		this.anInt6149 = Static467.method4907(this.anInt6141, this.anInt6152);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4870(@OriginalArg(0) int arg0) {
		if (this.anInt6146 > 0) {
			if (arg0 >= this.anInt6146) {
				if (this.anInt6141 == Integer.MIN_VALUE) {
					this.anInt6141 = 0;
					this.anInt6144 = this.anInt6154 = this.anInt6149 = 0;
					this.method5802();
					arg0 = this.anInt6146;
				}
				this.anInt6146 = 0;
				this.method4888();
			} else {
				this.anInt6144 += this.anInt6142 * arg0;
				this.anInt6154 += this.anInt6153 * arg0;
				this.anInt6149 += this.anInt6148 * arg0;
				this.anInt6146 -= arg0;
			}
		}
		@Pc(71) Class7_Sub31_Sub1 local71 = (Class7_Sub31_Sub1) super.aClass7_Sub31_5;
		@Pc(76) int local76 = this.anInt6150 << 8;
		@Pc(81) int local81 = this.anInt6145 << 8;
		@Pc(87) int local87 = local71.aByteArray56.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6147 = 0;
		}
		if (this.anInt6151 < 0) {
			if (this.anInt6143 <= 0) {
				this.method4890();
				this.method5802();
				return;
			}
			this.anInt6151 = 0;
		}
		if (this.anInt6151 >= local87) {
			if (this.anInt6143 >= 0) {
				this.method4890();
				this.method5802();
				return;
			}
			this.anInt6151 = local87 - 1;
		}
		this.anInt6151 += this.anInt6143 * arg0;
		if (this.anInt6147 >= 0) {
			if (this.anInt6147 > 0) {
				if (this.aBoolean404) {
					label125: {
						if (this.anInt6143 < 0) {
							if (this.anInt6151 >= local76) {
								return;
							}
							this.anInt6151 = local76 + local76 - this.anInt6151 - 1;
							this.anInt6143 = -this.anInt6143;
							if (--this.anInt6147 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6151 < local81) {
								return;
							}
							this.anInt6151 = local81 + local81 - this.anInt6151 - 1;
							this.anInt6143 = -this.anInt6143;
							if (--this.anInt6147 == 0) {
								break;
							}
							if (this.anInt6151 >= local76) {
								return;
							}
							this.anInt6151 = local76 + local76 - this.anInt6151 - 1;
							this.anInt6143 = -this.anInt6143;
						} while (--this.anInt6147 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6143 < 0) {
						if (this.anInt6151 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6151 - 1) / local91;
						if (local361 < this.anInt6147) {
							this.anInt6151 += local91 * local361;
							this.anInt6147 -= local361;
							return;
						}
						this.anInt6151 += local91 * this.anInt6147;
						this.anInt6147 = 0;
					} else if (this.anInt6151 >= local81) {
						local361 = (this.anInt6151 - local76) / local91;
						if (local361 < this.anInt6147) {
							this.anInt6151 -= local91 * local361;
							this.anInt6147 -= local361;
							return;
						}
						this.anInt6151 -= local91 * this.anInt6147;
						this.anInt6147 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6143 < 0) {
				if (this.anInt6151 < 0) {
					this.anInt6151 = -1;
					this.method4890();
					this.method5802();
					return;
				}
			} else if (this.anInt6151 >= local87) {
				this.anInt6151 = local87;
				this.method4890();
				this.method5802();
			}
		} else if (this.aBoolean404) {
			if (this.anInt6143 < 0) {
				if (this.anInt6151 >= local76) {
					return;
				}
				this.anInt6151 = local76 + local76 - this.anInt6151 - 1;
				this.anInt6143 = -this.anInt6143;
			}
			while (this.anInt6151 >= local81) {
				this.anInt6151 = local81 + local81 - this.anInt6151 - 1;
				this.anInt6143 = -this.anInt6143;
				if (this.anInt6151 >= local76) {
					return;
				}
				this.anInt6151 = local76 + local76 - this.anInt6151 - 1;
				this.anInt6143 = -this.anInt6143;
			}
		} else if (this.anInt6143 < 0) {
			if (this.anInt6151 < local76) {
				this.anInt6151 = local81 - (local81 - 1 - this.anInt6151) % local91 - 1;
			}
		} else if (this.anInt6151 >= local81) {
			this.anInt6151 = local76 + (this.anInt6151 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "()V")
	private void method4890() {
		if (this.anInt6146 == 0) {
			return;
		}
		if (this.anInt6141 == Integer.MIN_VALUE) {
			this.anInt6141 = 0;
		}
		this.anInt6146 = 0;
		this.method4888();
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public synchronized void method4891(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6151 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "()I")
	public synchronized int method4896() {
		return this.anInt6143 < 0 ? -this.anInt6143 : this.anInt6143;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
	@Override
	public int method4867() {
		@Pc(6) int local6 = this.anInt6144 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6147 == 0) {
			local6 -= local6 * this.anInt6151 / (((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56.length << 8);
		} else if (this.anInt6147 >= 0) {
			local6 -= local6 * this.anInt6150 / ((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "()Z")
	public boolean method4901() {
		return this.anInt6151 < 0 || this.anInt6151 >= ((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56.length << 8;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V")
	private synchronized void method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6141 = arg0;
		this.anInt6152 = arg1;
		this.anInt6146 = 0;
		this.method4888();
	}

	@OriginalMember(owner = "client!td", name = "k", descriptor = "()I")
	public synchronized int method4905() {
		return this.anInt6141 == Integer.MIN_VALUE ? 0 : this.anInt6141;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(II)V")
	public synchronized void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4874(arg0, arg1, this.method4877());
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
	public synchronized void method4909(@OriginalArg(0) int arg0) {
		if (this.anInt6143 < 0) {
			this.anInt6143 = -arg0;
		} else {
			this.anInt6143 = arg0;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "([IIIII)I")
	private int method4910(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6146 <= 0) {
				if (this.anInt6143 == 256 && (this.anInt6151 & 0xFF) == 0) {
					if (Static213.aBoolean232) {
						return Static467.method4884(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, arg3, arg2, this);
					}
					return Static467.method4906(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, arg3, arg2, this);
				}
				if (Static213.aBoolean232) {
					return Static467.method4887(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, arg3, arg2, this, this.anInt6143, arg4);
				}
				return Static467.method4895(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, arg3, arg2, this, this.anInt6143, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6146;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6146 += arg1;
			if (this.anInt6143 == 256 && (this.anInt6151 & 0xFF) == 0) {
				if (Static213.aBoolean232) {
					arg1 = Static467.method4900(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, this.anInt6153, this.anInt6148, local5, arg2, this);
				} else {
					arg1 = Static467.method4881(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, this.anInt6142, local5, arg2, this);
				}
			} else if (Static213.aBoolean232) {
				arg1 = Static467.method4902(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6154, this.anInt6149, this.anInt6153, this.anInt6148, local5, arg2, this, this.anInt6143, arg4);
			} else {
				arg1 = Static467.method4889(((Class7_Sub31_Sub1) super.aClass7_Sub31_5).aByteArray56, arg0, this.anInt6151, arg1, this.anInt6144, this.anInt6142, local5, arg2, this, this.anInt6143, arg4);
			}
			this.anInt6146 -= arg1;
			if (this.anInt6146 != 0) {
				return arg1;
			}
		} while (!this.method4873());
		return arg3;
	}

	@OriginalMember(owner = "client!td", name = "l", descriptor = "()Z")
	public boolean method4912() {
		return this.anInt6146 != 0;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
	@Override
	public int method4869() {
		return this.anInt6141 == 0 && this.anInt6146 == 0 ? 0 : 1;
	}
}
