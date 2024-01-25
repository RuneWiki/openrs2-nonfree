import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub9_Sub4 extends Class1_Sub9 {

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	private int anInt6257;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public int anInt6258;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
	public int anInt6259;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	public int anInt6260;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
	public int anInt6266;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
	public int anInt6268;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
	private int anInt6270;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
	private final int anInt6265;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
	private final int anInt6264;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "Z")
	private final boolean aBoolean551;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
	private int anInt6263;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	private int anInt6262;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	private int anInt6269;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
	public int anInt6267;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!cj;II)V")
	public Class1_Sub9_Sub4(@OriginalArg(0) Class1_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub8_5 = arg0;
		this.anInt6265 = arg0.anInt753;
		this.anInt6264 = arg0.anInt754;
		this.aBoolean551 = arg0.aBoolean105;
		this.anInt6263 = arg1;
		this.anInt6262 = arg2;
		this.anInt6269 = 8192;
		this.anInt6267 = 0;
		this.method5018();
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!cj;III)V")
	public Class1_Sub9_Sub4(@OriginalArg(0) Class1_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub8_5 = arg0;
		this.anInt6265 = arg0.anInt753;
		this.anInt6264 = arg0.anInt754;
		this.aBoolean551 = arg0.aBoolean105;
		this.anInt6263 = arg1;
		this.anInt6262 = arg2;
		this.anInt6269 = arg3;
		this.anInt6267 = 0;
		this.method5018();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([IIIII)I")
	private int method5017(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6270 <= 0) {
				if (this.anInt6263 == 256 && (this.anInt6267 & 0xFF) == 0) {
					if (Static167.aBoolean276) {
						return Static474.method5036(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, arg3, arg2, this);
					}
					return Static474.method5026(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, arg3, arg2, this);
				}
				if (Static167.aBoolean276) {
					return Static474.method5044(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, arg3, arg2, this, this.anInt6263, arg4);
				}
				return Static474.method5041(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, arg3, arg2, this, this.anInt6263, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6270;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6270 += arg1;
			if (this.anInt6263 == 256 && (this.anInt6267 & 0xFF) == 0) {
				if (Static167.aBoolean276) {
					arg1 = Static474.method5024(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, this.anInt6261, this.anInt6266, local5, arg2, this);
				} else {
					arg1 = Static474.method5050(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, this.anInt6268, local5, arg2, this);
				}
			} else if (Static167.aBoolean276) {
				arg1 = Static474.method5020(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, this.anInt6261, this.anInt6266, local5, arg2, this, this.anInt6263, arg4);
			} else {
				arg1 = Static474.method5055(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, this.anInt6268, local5, arg2, this, this.anInt6263, arg4);
			}
			this.anInt6270 -= arg1;
			if (this.anInt6270 != 0) {
				return arg1;
			}
		} while (!this.method5038());
		return arg3;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
	private void method5018() {
		this.anInt6259 = this.anInt6262;
		this.anInt6258 = Static474.method5033(this.anInt6262, this.anInt6269);
		this.anInt6260 = Static474.method5037(this.anInt6262, this.anInt6269);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "()I")
	public synchronized int method5021() {
		return this.anInt6262 == Integer.MIN_VALUE ? 0 : this.anInt6262;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5016(@OriginalArg(0) int arg0) {
		if (this.anInt6270 > 0) {
			if (arg0 >= this.anInt6270) {
				if (this.anInt6262 == Integer.MIN_VALUE) {
					this.anInt6262 = 0;
					this.anInt6259 = this.anInt6258 = this.anInt6260 = 0;
					this.method5953();
					arg0 = this.anInt6270;
				}
				this.anInt6270 = 0;
				this.method5018();
			} else {
				this.anInt6259 += this.anInt6268 * arg0;
				this.anInt6258 += this.anInt6261 * arg0;
				this.anInt6260 += this.anInt6266 * arg0;
				this.anInt6270 -= arg0;
			}
		}
		@Pc(71) Class1_Sub8_Sub1 local71 = (Class1_Sub8_Sub1) super.aClass1_Sub8_5;
		@Pc(76) int local76 = this.anInt6265 << 8;
		@Pc(81) int local81 = this.anInt6264 << 8;
		@Pc(87) int local87 = local71.aByteArray12.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6257 = 0;
		}
		if (this.anInt6267 < 0) {
			if (this.anInt6263 <= 0) {
				this.method5025();
				this.method5953();
				return;
			}
			this.anInt6267 = 0;
		}
		if (this.anInt6267 >= local87) {
			if (this.anInt6263 >= 0) {
				this.method5025();
				this.method5953();
				return;
			}
			this.anInt6267 = local87 - 1;
		}
		this.anInt6267 += this.anInt6263 * arg0;
		if (this.anInt6257 >= 0) {
			if (this.anInt6257 > 0) {
				if (this.aBoolean551) {
					label125: {
						if (this.anInt6263 < 0) {
							if (this.anInt6267 >= local76) {
								return;
							}
							this.anInt6267 = local76 + local76 - this.anInt6267 - 1;
							this.anInt6263 = -this.anInt6263;
							if (--this.anInt6257 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6267 < local81) {
								return;
							}
							this.anInt6267 = local81 + local81 - this.anInt6267 - 1;
							this.anInt6263 = -this.anInt6263;
							if (--this.anInt6257 == 0) {
								break;
							}
							if (this.anInt6267 >= local76) {
								return;
							}
							this.anInt6267 = local76 + local76 - this.anInt6267 - 1;
							this.anInt6263 = -this.anInt6263;
						} while (--this.anInt6257 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6263 < 0) {
						if (this.anInt6267 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6267 - 1) / local91;
						if (local361 < this.anInt6257) {
							this.anInt6267 += local91 * local361;
							this.anInt6257 -= local361;
							return;
						}
						this.anInt6267 += local91 * this.anInt6257;
						this.anInt6257 = 0;
					} else if (this.anInt6267 >= local81) {
						local361 = (this.anInt6267 - local76) / local91;
						if (local361 < this.anInt6257) {
							this.anInt6267 -= local91 * local361;
							this.anInt6257 -= local361;
							return;
						}
						this.anInt6267 -= local91 * this.anInt6257;
						this.anInt6257 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6263 < 0) {
				if (this.anInt6267 < 0) {
					this.anInt6267 = -1;
					this.method5025();
					this.method5953();
					return;
				}
			} else if (this.anInt6267 >= local87) {
				this.anInt6267 = local87;
				this.method5025();
				this.method5953();
			}
		} else if (this.aBoolean551) {
			if (this.anInt6263 < 0) {
				if (this.anInt6267 >= local76) {
					return;
				}
				this.anInt6267 = local76 + local76 - this.anInt6267 - 1;
				this.anInt6263 = -this.anInt6263;
			}
			while (this.anInt6267 >= local81) {
				this.anInt6267 = local81 + local81 - this.anInt6267 - 1;
				this.anInt6263 = -this.anInt6263;
				if (this.anInt6267 >= local76) {
					return;
				}
				this.anInt6267 = local76 + local76 - this.anInt6267 - 1;
				this.anInt6263 = -this.anInt6263;
			}
		} else if (this.anInt6263 < 0) {
			if (this.anInt6267 < local76) {
				this.anInt6267 = local81 - (local81 - 1 - this.anInt6267) % local91 - 1;
			}
		} else if (this.anInt6267 >= local81) {
			this.anInt6267 = local76 + (this.anInt6267 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "()Z")
	public boolean method5023() {
		return this.anInt6270 != 0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
	@Override
	public int method5011() {
		return this.anInt6262 == 0 && this.anInt6270 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "()V")
	private void method5025() {
		if (this.anInt6270 == 0) {
			return;
		}
		if (this.anInt6262 == Integer.MIN_VALUE) {
			this.anInt6262 = 0;
		}
		this.anInt6270 = 0;
		this.method5018();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
	@Override
	public int method5010() {
		@Pc(6) int local6 = this.anInt6259 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6257 == 0) {
			local6 -= local6 * this.anInt6267 / (((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12.length << 8);
		} else if (this.anInt6257 >= 0) {
			local6 -= local6 * this.anInt6265 / ((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "()Z")
	public boolean method5029() {
		return this.anInt6267 < 0 || this.anInt6267 >= ((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12.length << 8;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lclient!cv;")
	@Override
	public Class1_Sub9 method5013() {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	public synchronized void method5030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5052(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static474.method5033(arg1, arg2);
		@Pc(14) int local14 = Static474.method5037(arg1, arg2);
		if (this.anInt6258 == local10 && this.anInt6260 == local14) {
			this.anInt6270 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6259;
		if (this.anInt6259 - arg1 > local31) {
			local31 = this.anInt6259 - arg1;
		}
		if (local10 - this.anInt6258 > local31) {
			local31 = local10 - this.anInt6258;
		}
		if (this.anInt6258 - local10 > local31) {
			local31 = this.anInt6258 - local10;
		}
		if (local14 - this.anInt6260 > local31) {
			local31 = local14 - this.anInt6260;
		}
		if (this.anInt6260 - local14 > local31) {
			local31 = this.anInt6260 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6270 = arg0;
		this.anInt6262 = arg1;
		this.anInt6269 = arg2;
		this.anInt6268 = (arg1 - this.anInt6259) / arg0;
		this.anInt6261 = (local10 - this.anInt6258) / arg0;
		this.anInt6266 = (local14 - this.anInt6260) / arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public synchronized void method5031() {
		this.anInt6263 = (this.anInt6263 ^ this.anInt6263 >> 31) + (this.anInt6263 >>> 31);
		this.anInt6263 = -this.anInt6263;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5012(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6262 == 0 && this.anInt6270 == 0) {
			this.method5016(arg2);
			return;
		}
		@Pc(13) Class1_Sub8_Sub1 local13 = (Class1_Sub8_Sub1) super.aClass1_Sub8_5;
		@Pc(18) int local18 = this.anInt6265 << 8;
		@Pc(23) int local23 = this.anInt6264 << 8;
		@Pc(29) int local29 = local13.aByteArray12.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6257 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6267 < 0) {
			if (this.anInt6263 <= 0) {
				this.method5025();
				this.method5953();
				return;
			}
			this.anInt6267 = 0;
		}
		if (this.anInt6267 >= local29) {
			if (this.anInt6263 >= 0) {
				this.method5025();
				this.method5953();
				return;
			}
			this.anInt6267 = local29 - 1;
		}
		if (this.anInt6257 >= 0) {
			if (this.anInt6257 > 0) {
				if (this.aBoolean551) {
					label130: {
						if (this.anInt6263 < 0) {
							local40 = this.method5034(arg0, arg1, local18, local44, local13.aByteArray12[this.anInt6265]);
							if (this.anInt6267 >= local18) {
								return;
							}
							this.anInt6267 = local18 + local18 - this.anInt6267 - 1;
							this.anInt6263 = -this.anInt6263;
							if (--this.anInt6257 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5017(arg0, local40, local23, local44, local13.aByteArray12[this.anInt6264 - 1]);
							if (this.anInt6267 < local23) {
								return;
							}
							this.anInt6267 = local23 + local23 - this.anInt6267 - 1;
							this.anInt6263 = -this.anInt6263;
							if (--this.anInt6257 == 0) {
								break;
							}
							local40 = this.method5034(arg0, local40, local18, local44, local13.aByteArray12[this.anInt6265]);
							if (this.anInt6267 >= local18) {
								return;
							}
							this.anInt6267 = local18 + local18 - this.anInt6267 - 1;
							this.anInt6263 = -this.anInt6263;
						} while (--this.anInt6257 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6263 < 0) {
						while (true) {
							local40 = this.method5034(arg0, local40, local18, local44, local13.aByteArray12[this.anInt6264 - 1]);
							if (this.anInt6267 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6267 - 1) / local33;
							if (local416 >= this.anInt6257) {
								this.anInt6267 += local33 * this.anInt6257;
								this.anInt6257 = 0;
								break;
							}
							this.anInt6267 += local33 * local416;
							this.anInt6257 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5017(arg0, local40, local23, local44, local13.aByteArray12[this.anInt6265]);
							if (this.anInt6267 < local23) {
								return;
							}
							local416 = (this.anInt6267 - local18) / local33;
							if (local416 >= this.anInt6257) {
								this.anInt6267 -= local33 * this.anInt6257;
								this.anInt6257 = 0;
								break;
							}
							this.anInt6267 -= local33 * local416;
							this.anInt6257 -= local416;
						}
					}
				}
			}
			if (this.anInt6263 < 0) {
				this.method5034(arg0, local40, 0, local44, 0);
				if (this.anInt6267 < 0) {
					this.anInt6267 = -1;
					this.method5025();
					this.method5953();
					return;
				}
			} else {
				this.method5017(arg0, local40, local29, local44, 0);
				if (this.anInt6267 >= local29) {
					this.anInt6267 = local29;
					this.method5025();
					this.method5953();
				}
			}
		} else if (this.aBoolean551) {
			if (this.anInt6263 < 0) {
				local40 = this.method5034(arg0, arg1, local18, local44, local13.aByteArray12[this.anInt6265]);
				if (this.anInt6267 >= local18) {
					return;
				}
				this.anInt6267 = local18 + local18 - this.anInt6267 - 1;
				this.anInt6263 = -this.anInt6263;
			}
			while (true) {
				local40 = this.method5017(arg0, local40, local23, local44, local13.aByteArray12[this.anInt6264 - 1]);
				if (this.anInt6267 < local23) {
					return;
				}
				this.anInt6267 = local23 + local23 - this.anInt6267 - 1;
				this.anInt6263 = -this.anInt6263;
				local40 = this.method5034(arg0, local40, local18, local44, local13.aByteArray12[this.anInt6265]);
				if (this.anInt6267 >= local18) {
					return;
				}
				this.anInt6267 = local18 + local18 - this.anInt6267 - 1;
				this.anInt6263 = -this.anInt6263;
			}
		} else if (this.anInt6263 < 0) {
			while (true) {
				local40 = this.method5034(arg0, local40, local18, local44, local13.aByteArray12[this.anInt6264 - 1]);
				if (this.anInt6267 >= local18) {
					return;
				}
				this.anInt6267 = local23 - (local23 - 1 - this.anInt6267) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5017(arg0, local40, local23, local44, local13.aByteArray12[this.anInt6265]);
				if (this.anInt6267 < local23) {
					return;
				}
				this.anInt6267 = local18 + (this.anInt6267 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "([IIIII)I")
	private int method5034(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6270 <= 0) {
				if (this.anInt6263 == -256 && (this.anInt6267 & 0xFF) == 0) {
					if (Static167.aBoolean276) {
						return Static474.method5046(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, arg3, arg2, this);
					}
					return Static474.method5032(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, arg3, arg2, this);
				}
				if (Static167.aBoolean276) {
					return Static474.method5049(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, arg3, arg2, this, this.anInt6263, arg4);
				}
				return Static474.method5047(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, arg3, arg2, this, this.anInt6263, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6270;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6270 += arg1;
			if (this.anInt6263 == -256 && (this.anInt6267 & 0xFF) == 0) {
				if (Static167.aBoolean276) {
					arg1 = Static474.method5027(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, this.anInt6261, this.anInt6266, local5, arg2, this);
				} else {
					arg1 = Static474.method5019(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, this.anInt6268, local5, arg2, this);
				}
			} else if (Static167.aBoolean276) {
				arg1 = Static474.method5043(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6258, this.anInt6260, this.anInt6261, this.anInt6266, local5, arg2, this, this.anInt6263, arg4);
			} else {
				arg1 = Static474.method5022(((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12, arg0, this.anInt6267, arg1, this.anInt6259, this.anInt6268, local5, arg2, this, this.anInt6263, arg4);
			}
			this.anInt6270 -= arg1;
			if (this.anInt6270 != 0) {
				return arg1;
			}
		} while (!this.method5038());
		return arg3;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	private synchronized void method5035() {
		this.method5052(0, this.method5054());
	}

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "()Z")
	private boolean method5038() {
		@Pc(2) int local2 = this.anInt6262;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static474.method5033(local2, this.anInt6269);
			local8 = Static474.method5037(local2, this.anInt6269);
		}
		if (this.anInt6259 != local2 || this.anInt6258 != local10 || this.anInt6260 != local8) {
			if (this.anInt6259 < local2) {
				this.anInt6268 = 1;
				this.anInt6270 = local2 - this.anInt6259;
			} else if (this.anInt6259 > local2) {
				this.anInt6268 = -1;
				this.anInt6270 = this.anInt6259 - local2;
			} else {
				this.anInt6268 = 0;
			}
			if (this.anInt6258 < local10) {
				this.anInt6261 = 1;
				if (this.anInt6270 == 0 || this.anInt6270 > local10 - this.anInt6258) {
					this.anInt6270 = local10 - this.anInt6258;
				}
			} else if (this.anInt6258 > local10) {
				this.anInt6261 = -1;
				if (this.anInt6270 == 0 || this.anInt6270 > this.anInt6258 - local10) {
					this.anInt6270 = this.anInt6258 - local10;
				}
			} else {
				this.anInt6261 = 0;
			}
			if (this.anInt6260 < local8) {
				this.anInt6266 = 1;
				if (this.anInt6270 == 0 || this.anInt6270 > local8 - this.anInt6260) {
					this.anInt6270 = local8 - this.anInt6260;
				}
			} else if (this.anInt6260 > local8) {
				this.anInt6266 = -1;
				if (this.anInt6270 == 0 || this.anInt6270 > this.anInt6260 - local8) {
					this.anInt6270 = this.anInt6260 - local8;
				}
			} else {
				this.anInt6266 = 0;
			}
			return false;
		} else if (this.anInt6262 == Integer.MIN_VALUE) {
			this.anInt6262 = 0;
			this.anInt6259 = this.anInt6258 = this.anInt6260 = 0;
			this.method5953();
			return true;
		} else {
			this.method5018();
			return false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
	public synchronized void method5039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5030(arg0, arg1, this.method5054());
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public synchronized void method5040(@OriginalArg(0) int arg0) {
		this.anInt6257 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()Lclient!cv;")
	@Override
	public Class1_Sub9 method5014() {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public synchronized void method5042(@OriginalArg(0) int arg0) {
		if (this.anInt6263 < 0) {
			this.anInt6263 = -arg0;
		} else {
			this.anInt6263 = arg0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "(I)V")
	public synchronized void method5045(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5035();
			this.method5953();
		} else if (this.anInt6258 == 0 && this.anInt6260 == 0) {
			this.anInt6270 = 0;
			this.anInt6262 = 0;
			this.anInt6259 = 0;
			this.method5953();
		} else {
			@Pc(31) int local31 = -this.anInt6259;
			if (this.anInt6259 > local31) {
				local31 = this.anInt6259;
			}
			if (-this.anInt6258 > local31) {
				local31 = -this.anInt6258;
			}
			if (this.anInt6258 > local31) {
				local31 = this.anInt6258;
			}
			if (-this.anInt6260 > local31) {
				local31 = -this.anInt6260;
			}
			if (this.anInt6260 > local31) {
				local31 = this.anInt6260;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6270 = arg0;
			this.anInt6262 = Integer.MIN_VALUE;
			this.anInt6268 = -this.anInt6259 / arg0;
			this.anInt6261 = -this.anInt6258 / arg0;
			this.anInt6266 = -this.anInt6260 / arg0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V")
	public synchronized void method5048(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub8_Sub1) super.aClass1_Sub8_5).aByteArray12.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6267 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
	private synchronized void method5052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6262 = arg0;
		this.anInt6269 = arg1;
		this.anInt6270 = 0;
		this.method5018();
	}

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "()I")
	public synchronized int method5053() {
		return this.anInt6263 < 0 ? -this.anInt6263 : this.anInt6263;
	}

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "()I")
	public synchronized int method5054() {
		return this.anInt6269 < 0 ? -1 : this.anInt6269;
	}

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)V")
	public synchronized void method5056(@OriginalArg(0) int arg0) {
		this.method5052(arg0 << 6, this.method5054());
	}
}
