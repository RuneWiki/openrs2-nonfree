import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class5_Sub16_Sub3 extends Class5_Sub16 {

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public int anInt5109;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
	public int anInt5111;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	public int anInt5113;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	public int anInt5114;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
	private int anInt5115;

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
	public int anInt5117;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
	private int anInt5118;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	public int anInt5122;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	private final int anInt5119;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
	private final int anInt5116;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	private int anInt5112;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
	private int anInt5110;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
	public int anInt5121;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!dg;II)V")
	public Class5_Sub16_Sub3(@OriginalArg(0) Class5_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub10_5 = arg0;
		this.anInt5119 = arg0.anInt1040;
		this.anInt5116 = arg0.anInt1041;
		this.aBoolean427 = arg0.aBoolean77;
		this.anInt5120 = arg1;
		this.anInt5112 = arg2;
		this.anInt5110 = 8192;
		this.anInt5121 = 0;
		this.method4596();
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!dg;III)V")
	public Class5_Sub16_Sub3(@OriginalArg(0) Class5_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub10_5 = arg0;
		this.anInt5119 = arg0.anInt1040;
		this.anInt5116 = arg0.anInt1041;
		this.aBoolean427 = arg0.aBoolean77;
		this.anInt5120 = arg1;
		this.anInt5112 = arg2;
		this.anInt5110 = arg3;
		this.anInt5121 = 0;
		this.method4596();
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()I")
	@Override
	public int method5792() {
		return this.anInt5112 == 0 && this.anInt5115 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	private synchronized void method4568() {
		this.method4577(0, this.method4574());
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([IIIII)I")
	private int method4570(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5115 <= 0) {
				if (this.anInt5120 == -256 && (this.anInt5121 & 0xFF) == 0) {
					if (Static188.aBoolean287) {
						return Static365.method4564(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, arg3, arg2, this);
					}
					return Static365.method4566(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, arg3, arg2, this);
				}
				if (Static188.aBoolean287) {
					return Static365.method4599(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, arg3, arg2, this, this.anInt5120, arg4);
				}
				return Static365.method4593(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, arg3, arg2, this, this.anInt5120, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5115;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5115 += arg1;
			if (this.anInt5120 == -256 && (this.anInt5121 & 0xFF) == 0) {
				if (Static188.aBoolean287) {
					arg1 = Static365.method4579(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, this.anInt5109, this.anInt5122, local5, arg2, this);
				} else {
					arg1 = Static365.method4597(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, this.anInt5111, local5, arg2, this);
				}
			} else if (Static188.aBoolean287) {
				arg1 = Static365.method4601(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, this.anInt5109, this.anInt5122, local5, arg2, this, this.anInt5120, arg4);
			} else {
				arg1 = Static365.method4571(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, this.anInt5111, local5, arg2, this, this.anInt5120, arg4);
			}
			this.anInt5115 -= arg1;
			if (this.anInt5115 != 0) {
				return arg1;
			}
		} while (!this.method4590());
		return arg3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5112 == 0 && this.anInt5115 == 0) {
			this.method5793(arg2);
			return;
		}
		@Pc(13) Class5_Sub10_Sub1 local13 = (Class5_Sub10_Sub1) super.aClass5_Sub10_5;
		@Pc(18) int local18 = this.anInt5119 << 8;
		@Pc(23) int local23 = this.anInt5116 << 8;
		@Pc(29) int local29 = local13.aByteArray9.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5118 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5121 < 0) {
			if (this.anInt5120 <= 0) {
				this.method4594();
				this.method6005();
				return;
			}
			this.anInt5121 = 0;
		}
		if (this.anInt5121 >= local29) {
			if (this.anInt5120 >= 0) {
				this.method4594();
				this.method6005();
				return;
			}
			this.anInt5121 = local29 - 1;
		}
		if (this.anInt5118 >= 0) {
			if (this.anInt5118 > 0) {
				if (this.aBoolean427) {
					label130: {
						if (this.anInt5120 < 0) {
							local40 = this.method4570(arg0, arg1, local18, local44, local13.aByteArray9[this.anInt5119]);
							if (this.anInt5121 >= local18) {
								return;
							}
							this.anInt5121 = local18 + local18 - this.anInt5121 - 1;
							this.anInt5120 = -this.anInt5120;
							if (--this.anInt5118 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4584(arg0, local40, local23, local44, local13.aByteArray9[this.anInt5116 - 1]);
							if (this.anInt5121 < local23) {
								return;
							}
							this.anInt5121 = local23 + local23 - this.anInt5121 - 1;
							this.anInt5120 = -this.anInt5120;
							if (--this.anInt5118 == 0) {
								break;
							}
							local40 = this.method4570(arg0, local40, local18, local44, local13.aByteArray9[this.anInt5119]);
							if (this.anInt5121 >= local18) {
								return;
							}
							this.anInt5121 = local18 + local18 - this.anInt5121 - 1;
							this.anInt5120 = -this.anInt5120;
						} while (--this.anInt5118 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5120 < 0) {
						while (true) {
							local40 = this.method4570(arg0, local40, local18, local44, local13.aByteArray9[this.anInt5116 - 1]);
							if (this.anInt5121 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5121 - 1) / local33;
							if (local416 >= this.anInt5118) {
								this.anInt5121 += local33 * this.anInt5118;
								this.anInt5118 = 0;
								break;
							}
							this.anInt5121 += local33 * local416;
							this.anInt5118 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4584(arg0, local40, local23, local44, local13.aByteArray9[this.anInt5119]);
							if (this.anInt5121 < local23) {
								return;
							}
							local416 = (this.anInt5121 - local18) / local33;
							if (local416 >= this.anInt5118) {
								this.anInt5121 -= local33 * this.anInt5118;
								this.anInt5118 = 0;
								break;
							}
							this.anInt5121 -= local33 * local416;
							this.anInt5118 -= local416;
						}
					}
				}
			}
			if (this.anInt5120 < 0) {
				this.method4570(arg0, local40, 0, local44, 0);
				if (this.anInt5121 < 0) {
					this.anInt5121 = -1;
					this.method4594();
					this.method6005();
					return;
				}
			} else {
				this.method4584(arg0, local40, local29, local44, 0);
				if (this.anInt5121 >= local29) {
					this.anInt5121 = local29;
					this.method4594();
					this.method6005();
				}
			}
		} else if (this.aBoolean427) {
			if (this.anInt5120 < 0) {
				local40 = this.method4570(arg0, arg1, local18, local44, local13.aByteArray9[this.anInt5119]);
				if (this.anInt5121 >= local18) {
					return;
				}
				this.anInt5121 = local18 + local18 - this.anInt5121 - 1;
				this.anInt5120 = -this.anInt5120;
			}
			while (true) {
				local40 = this.method4584(arg0, local40, local23, local44, local13.aByteArray9[this.anInt5116 - 1]);
				if (this.anInt5121 < local23) {
					return;
				}
				this.anInt5121 = local23 + local23 - this.anInt5121 - 1;
				this.anInt5120 = -this.anInt5120;
				local40 = this.method4570(arg0, local40, local18, local44, local13.aByteArray9[this.anInt5119]);
				if (this.anInt5121 >= local18) {
					return;
				}
				this.anInt5121 = local18 + local18 - this.anInt5121 - 1;
				this.anInt5120 = -this.anInt5120;
			}
		} else if (this.anInt5120 < 0) {
			while (true) {
				local40 = this.method4570(arg0, local40, local18, local44, local13.aByteArray9[this.anInt5116 - 1]);
				if (this.anInt5121 >= local18) {
					return;
				}
				this.anInt5121 = local23 - (local23 - 1 - this.anInt5121) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4584(arg0, local40, local23, local44, local13.aByteArray9[this.anInt5119]);
				if (this.anInt5121 < local23) {
					return;
				}
				this.anInt5121 = local18 + (this.anInt5121 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class5_Sub16 method5790() {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)V")
	public synchronized void method4573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4588(arg0, arg1, this.method4574());
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "()I")
	public synchronized int method4574() {
		return this.anInt5110 < 0 ? -1 : this.anInt5110;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	public synchronized void method4575() {
		this.anInt5120 = (this.anInt5120 ^ this.anInt5120 >> 31) + (this.anInt5120 >>> 31);
		this.anInt5120 = -this.anInt5120;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	public synchronized void method4576(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5121 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)V")
	private synchronized void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5112 = arg0;
		this.anInt5110 = arg1;
		this.anInt5115 = 0;
		this.method4596();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public int method5788() {
		@Pc(6) int local6 = this.anInt5117 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5118 == 0) {
			local6 -= local6 * this.anInt5121 / (((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9.length << 8);
		} else if (this.anInt5118 >= 0) {
			local6 -= local6 * this.anInt5119 / ((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public synchronized void method4578(@OriginalArg(0) int arg0) {
		if (this.anInt5120 < 0) {
			this.anInt5120 = -arg0;
		} else {
			this.anInt5120 = arg0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	public synchronized void method4580(@OriginalArg(0) int arg0) {
		this.method4577(arg0 << 6, this.method4574());
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "()I")
	public synchronized int method4583() {
		return this.anInt5112 == Integer.MIN_VALUE ? 0 : this.anInt5112;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "([IIIII)I")
	private int method4584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5115 <= 0) {
				if (this.anInt5120 == 256 && (this.anInt5121 & 0xFF) == 0) {
					if (Static188.aBoolean287) {
						return Static365.method4585(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, arg3, arg2, this);
					}
					return Static365.method4563(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, arg3, arg2, this);
				}
				if (Static188.aBoolean287) {
					return Static365.method4572(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, arg3, arg2, this, this.anInt5120, arg4);
				}
				return Static365.method4600(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, arg3, arg2, this, this.anInt5120, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5115;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5115 += arg1;
			if (this.anInt5120 == 256 && (this.anInt5121 & 0xFF) == 0) {
				if (Static188.aBoolean287) {
					arg1 = Static365.method4589(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, this.anInt5109, this.anInt5122, local5, arg2, this);
				} else {
					arg1 = Static365.method4591(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, this.anInt5111, local5, arg2, this);
				}
			} else if (Static188.aBoolean287) {
				arg1 = Static365.method4565(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5113, this.anInt5114, this.anInt5109, this.anInt5122, local5, arg2, this, this.anInt5120, arg4);
			} else {
				arg1 = Static365.method4569(((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9, arg0, this.anInt5121, arg1, this.anInt5117, this.anInt5111, local5, arg2, this, this.anInt5120, arg4);
			}
			this.anInt5115 -= arg1;
			if (this.anInt5115 != 0) {
				return arg1;
			}
		} while (!this.method4590());
		return arg3;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5793(@OriginalArg(0) int arg0) {
		if (this.anInt5115 > 0) {
			if (arg0 >= this.anInt5115) {
				if (this.anInt5112 == Integer.MIN_VALUE) {
					this.anInt5112 = 0;
					this.anInt5117 = this.anInt5113 = this.anInt5114 = 0;
					this.method6005();
					arg0 = this.anInt5115;
				}
				this.anInt5115 = 0;
				this.method4596();
			} else {
				this.anInt5117 += this.anInt5111 * arg0;
				this.anInt5113 += this.anInt5109 * arg0;
				this.anInt5114 += this.anInt5122 * arg0;
				this.anInt5115 -= arg0;
			}
		}
		@Pc(71) Class5_Sub10_Sub1 local71 = (Class5_Sub10_Sub1) super.aClass5_Sub10_5;
		@Pc(76) int local76 = this.anInt5119 << 8;
		@Pc(81) int local81 = this.anInt5116 << 8;
		@Pc(87) int local87 = local71.aByteArray9.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5118 = 0;
		}
		if (this.anInt5121 < 0) {
			if (this.anInt5120 <= 0) {
				this.method4594();
				this.method6005();
				return;
			}
			this.anInt5121 = 0;
		}
		if (this.anInt5121 >= local87) {
			if (this.anInt5120 >= 0) {
				this.method4594();
				this.method6005();
				return;
			}
			this.anInt5121 = local87 - 1;
		}
		this.anInt5121 += this.anInt5120 * arg0;
		if (this.anInt5118 >= 0) {
			if (this.anInt5118 > 0) {
				if (this.aBoolean427) {
					label125: {
						if (this.anInt5120 < 0) {
							if (this.anInt5121 >= local76) {
								return;
							}
							this.anInt5121 = local76 + local76 - this.anInt5121 - 1;
							this.anInt5120 = -this.anInt5120;
							if (--this.anInt5118 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5121 < local81) {
								return;
							}
							this.anInt5121 = local81 + local81 - this.anInt5121 - 1;
							this.anInt5120 = -this.anInt5120;
							if (--this.anInt5118 == 0) {
								break;
							}
							if (this.anInt5121 >= local76) {
								return;
							}
							this.anInt5121 = local76 + local76 - this.anInt5121 - 1;
							this.anInt5120 = -this.anInt5120;
						} while (--this.anInt5118 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5120 < 0) {
						if (this.anInt5121 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5121 - 1) / local91;
						if (local361 < this.anInt5118) {
							this.anInt5121 += local91 * local361;
							this.anInt5118 -= local361;
							return;
						}
						this.anInt5121 += local91 * this.anInt5118;
						this.anInt5118 = 0;
					} else if (this.anInt5121 >= local81) {
						local361 = (this.anInt5121 - local76) / local91;
						if (local361 < this.anInt5118) {
							this.anInt5121 -= local91 * local361;
							this.anInt5118 -= local361;
							return;
						}
						this.anInt5121 -= local91 * this.anInt5118;
						this.anInt5118 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5120 < 0) {
				if (this.anInt5121 < 0) {
					this.anInt5121 = -1;
					this.method4594();
					this.method6005();
					return;
				}
			} else if (this.anInt5121 >= local87) {
				this.anInt5121 = local87;
				this.method4594();
				this.method6005();
			}
		} else if (this.aBoolean427) {
			if (this.anInt5120 < 0) {
				if (this.anInt5121 >= local76) {
					return;
				}
				this.anInt5121 = local76 + local76 - this.anInt5121 - 1;
				this.anInt5120 = -this.anInt5120;
			}
			while (this.anInt5121 >= local81) {
				this.anInt5121 = local81 + local81 - this.anInt5121 - 1;
				this.anInt5120 = -this.anInt5120;
				if (this.anInt5121 >= local76) {
					return;
				}
				this.anInt5121 = local76 + local76 - this.anInt5121 - 1;
				this.anInt5120 = -this.anInt5120;
			}
		} else if (this.anInt5120 < 0) {
			if (this.anInt5121 < local76) {
				this.anInt5121 = local81 - (local81 - 1 - this.anInt5121) % local91 - 1;
			}
		} else if (this.anInt5121 >= local81) {
			this.anInt5121 = local76 + (this.anInt5121 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)V")
	public synchronized void method4586(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4568();
			this.method6005();
		} else if (this.anInt5113 == 0 && this.anInt5114 == 0) {
			this.anInt5115 = 0;
			this.anInt5112 = 0;
			this.anInt5117 = 0;
			this.method6005();
		} else {
			@Pc(31) int local31 = -this.anInt5117;
			if (this.anInt5117 > local31) {
				local31 = this.anInt5117;
			}
			if (-this.anInt5113 > local31) {
				local31 = -this.anInt5113;
			}
			if (this.anInt5113 > local31) {
				local31 = this.anInt5113;
			}
			if (-this.anInt5114 > local31) {
				local31 = -this.anInt5114;
			}
			if (this.anInt5114 > local31) {
				local31 = this.anInt5114;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5115 = arg0;
			this.anInt5112 = Integer.MIN_VALUE;
			this.anInt5111 = -this.anInt5117 / arg0;
			this.anInt5109 = -this.anInt5113 / arg0;
			this.anInt5122 = -this.anInt5114 / arg0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "()Z")
	public boolean method4587() {
		return this.anInt5115 != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public synchronized void method4588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4577(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static365.method4567(arg1, arg2);
		@Pc(14) int local14 = Static365.method4595(arg1, arg2);
		if (this.anInt5113 == local10 && this.anInt5114 == local14) {
			this.anInt5115 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5117;
		if (this.anInt5117 - arg1 > local31) {
			local31 = this.anInt5117 - arg1;
		}
		if (local10 - this.anInt5113 > local31) {
			local31 = local10 - this.anInt5113;
		}
		if (this.anInt5113 - local10 > local31) {
			local31 = this.anInt5113 - local10;
		}
		if (local14 - this.anInt5114 > local31) {
			local31 = local14 - this.anInt5114;
		}
		if (this.anInt5114 - local14 > local31) {
			local31 = this.anInt5114 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5115 = arg0;
		this.anInt5112 = arg1;
		this.anInt5110 = arg2;
		this.anInt5111 = (arg1 - this.anInt5117) / arg0;
		this.anInt5109 = (local10 - this.anInt5113) / arg0;
		this.anInt5122 = (local14 - this.anInt5114) / arg0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lclient!rb;")
	@Override
	public Class5_Sub16 method5791() {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "()Z")
	private boolean method4590() {
		@Pc(2) int local2 = this.anInt5112;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static365.method4567(local2, this.anInt5110);
			local8 = Static365.method4595(local2, this.anInt5110);
		}
		if (this.anInt5117 != local2 || this.anInt5113 != local10 || this.anInt5114 != local8) {
			if (this.anInt5117 < local2) {
				this.anInt5111 = 1;
				this.anInt5115 = local2 - this.anInt5117;
			} else if (this.anInt5117 > local2) {
				this.anInt5111 = -1;
				this.anInt5115 = this.anInt5117 - local2;
			} else {
				this.anInt5111 = 0;
			}
			if (this.anInt5113 < local10) {
				this.anInt5109 = 1;
				if (this.anInt5115 == 0 || this.anInt5115 > local10 - this.anInt5113) {
					this.anInt5115 = local10 - this.anInt5113;
				}
			} else if (this.anInt5113 > local10) {
				this.anInt5109 = -1;
				if (this.anInt5115 == 0 || this.anInt5115 > this.anInt5113 - local10) {
					this.anInt5115 = this.anInt5113 - local10;
				}
			} else {
				this.anInt5109 = 0;
			}
			if (this.anInt5114 < local8) {
				this.anInt5122 = 1;
				if (this.anInt5115 == 0 || this.anInt5115 > local8 - this.anInt5114) {
					this.anInt5115 = local8 - this.anInt5114;
				}
			} else if (this.anInt5114 > local8) {
				this.anInt5122 = -1;
				if (this.anInt5115 == 0 || this.anInt5115 > this.anInt5114 - local8) {
					this.anInt5115 = this.anInt5114 - local8;
				}
			} else {
				this.anInt5122 = 0;
			}
			return false;
		} else if (this.anInt5112 == Integer.MIN_VALUE) {
			this.anInt5112 = 0;
			this.anInt5117 = this.anInt5113 = this.anInt5114 = 0;
			this.method6005();
			return true;
		} else {
			this.method4596();
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
	public synchronized void method4592(@OriginalArg(0) int arg0) {
		this.anInt5118 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "()V")
	private void method4594() {
		if (this.anInt5115 == 0) {
			return;
		}
		if (this.anInt5112 == Integer.MIN_VALUE) {
			this.anInt5112 = 0;
		}
		this.anInt5115 = 0;
		this.method4596();
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "()V")
	private void method4596() {
		this.anInt5117 = this.anInt5112;
		this.anInt5113 = Static365.method4567(this.anInt5112, this.anInt5110);
		this.anInt5114 = Static365.method4595(this.anInt5112, this.anInt5110);
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "()Z")
	public boolean method4598() {
		return this.anInt5121 < 0 || this.anInt5121 >= ((Class5_Sub10_Sub1) super.aClass5_Sub10_5).aByteArray9.length << 8;
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "()I")
	public synchronized int method4602() {
		return this.anInt5120 < 0 ? -this.anInt5120 : this.anInt5120;
	}
}
