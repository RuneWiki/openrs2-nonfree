import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
	public int anInt5510;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	public int anInt5512;

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
	public int anInt5513;

	@OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
	private int anInt5515;

	@OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
	public int anInt5517;

	@OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
	public int anInt5518;

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!kca", name = "A", descriptor = "I")
	private int anInt5522;

	@OriginalMember(owner = "client!kca", name = "B", descriptor = "I")
	private final int anInt5523;

	@OriginalMember(owner = "client!kca", name = "x", descriptor = "I")
	private final int anInt5519;

	@OriginalMember(owner = "client!kca", name = "w", descriptor = "Z")
	private final boolean aBoolean400;

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
	private int anInt5516;

	@OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
	private int anInt5514;

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
	private int anInt5511;

	@OriginalMember(owner = "client!kca", name = "z", descriptor = "I")
	public int anInt5521;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!wo;III)V")
	public Class3_Sub3_Sub5(@OriginalArg(0) Class3_Sub18_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub18_6 = arg0;
		this.anInt5523 = arg0.anInt10134;
		this.anInt5519 = arg0.anInt10132;
		this.aBoolean400 = arg0.aBoolean767;
		this.anInt5516 = arg1;
		this.anInt5514 = arg2;
		this.anInt5511 = arg3;
		this.anInt5521 = 0;
		this.method4710();
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
	public synchronized void method4684(@OriginalArg(0) int arg0) {
		this.method4722(arg0 << 6, this.method4711());
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V")
	public synchronized void method4685() {
		this.anInt5516 = (this.anInt5516 ^ this.anInt5516 >> 31) + (this.anInt5516 >>> 31);
		this.anInt5516 = -this.anInt5516;
	}

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "()I")
	public synchronized int method4687() {
		return this.anInt5514 == Integer.MIN_VALUE ? 0 : this.anInt5514;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	public synchronized void method4688(@OriginalArg(0) int arg0) {
		this.method4722(this.method4687(), arg0);
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "()I")
	@Override
	public int method4683() {
		@Pc(6) int local6 = this.anInt5510 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5522 == 0) {
			local6 -= local6 * this.anInt5521 / (((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106.length << 8);
		} else if (this.anInt5522 >= 0) {
			local6 -= local6 * this.anInt5523 / ((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
	public synchronized void method4693(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4702();
			this.method8682();
		} else if (this.anInt5520 == 0 && this.anInt5513 == 0) {
			this.anInt5515 = 0;
			this.anInt5514 = 0;
			this.anInt5510 = 0;
			this.method8682();
		} else {
			@Pc(31) int local31 = -this.anInt5510;
			if (this.anInt5510 > local31) {
				local31 = this.anInt5510;
			}
			if (-this.anInt5520 > local31) {
				local31 = -this.anInt5520;
			}
			if (this.anInt5520 > local31) {
				local31 = this.anInt5520;
			}
			if (-this.anInt5513 > local31) {
				local31 = -this.anInt5513;
			}
			if (this.anInt5513 > local31) {
				local31 = this.anInt5513;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5515 = arg0;
			this.anInt5514 = Integer.MIN_VALUE;
			this.anInt5518 = -this.anInt5510 / arg0;
			this.anInt5517 = -this.anInt5520 / arg0;
			this.anInt5512 = -this.anInt5513 / arg0;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([IIIII)I")
	private int method4694(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5515 <= 0) {
				if (this.anInt5516 == 256 && (this.anInt5521 & 0xFF) == 0) {
					if (Static411.aBoolean570) {
						return Static655.method4721(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, arg3, arg2, this);
					}
					return Static655.method4715(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, arg3, arg2, this);
				}
				if (Static411.aBoolean570) {
					return Static655.method4701(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, arg3, arg2, this, this.anInt5516, arg4);
				}
				return Static655.method4713(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, arg3, arg2, this, this.anInt5516, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5515;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5515 += arg1;
			if (this.anInt5516 == 256 && (this.anInt5521 & 0xFF) == 0) {
				if (Static411.aBoolean570) {
					arg1 = Static655.method4709(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, this.anInt5517, this.anInt5512, local5, arg2, this);
				} else {
					arg1 = Static655.method4699(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, this.anInt5518, local5, arg2, this);
				}
			} else if (Static411.aBoolean570) {
				arg1 = Static655.method4690(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, this.anInt5517, this.anInt5512, local5, arg2, this, this.anInt5516, arg4);
			} else {
				arg1 = Static655.method4717(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, this.anInt5518, local5, arg2, this, this.anInt5516, arg4);
			}
			this.anInt5515 -= arg1;
			if (this.anInt5515 != 0) {
				return arg1;
			}
		} while (!this.method4714());
		return arg3;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4679() {
		return null;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "([IIIII)I")
	private int method4696(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5515 <= 0) {
				if (this.anInt5516 == -256 && (this.anInt5521 & 0xFF) == 0) {
					if (Static411.aBoolean570) {
						return Static655.method4691(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, arg3, arg2, this);
					}
					return Static655.method4719(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, arg3, arg2, this);
				}
				if (Static411.aBoolean570) {
					return Static655.method4718(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, arg3, arg2, this, this.anInt5516, arg4);
				}
				return Static655.method4692(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, arg3, arg2, this, this.anInt5516, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5515;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5515 += arg1;
			if (this.anInt5516 == -256 && (this.anInt5521 & 0xFF) == 0) {
				if (Static411.aBoolean570) {
					arg1 = Static655.method4697(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, this.anInt5517, this.anInt5512, local5, arg2, this);
				} else {
					arg1 = Static655.method4695(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, this.anInt5518, local5, arg2, this);
				}
			} else if (Static411.aBoolean570) {
				arg1 = Static655.method4689(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5520, this.anInt5513, this.anInt5517, this.anInt5512, local5, arg2, this, this.anInt5516, arg4);
			} else {
				arg1 = Static655.method4700(((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106, arg0, this.anInt5521, arg1, this.anInt5510, this.anInt5518, local5, arg2, this, this.anInt5516, arg4);
			}
			this.anInt5515 -= arg1;
			if (this.anInt5515 != 0) {
				return arg1;
			}
		} while (!this.method4714());
		return arg3;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5514 == 0 && this.anInt5515 == 0) {
			this.method4678(arg2);
			return;
		}
		@Pc(13) Class3_Sub18_Sub1 local13 = (Class3_Sub18_Sub1) super.aClass3_Sub18_6;
		@Pc(18) int local18 = this.anInt5523 << 8;
		@Pc(23) int local23 = this.anInt5519 << 8;
		@Pc(29) int local29 = local13.aByteArray106.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5522 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5521 < 0) {
			if (this.anInt5516 <= 0) {
				this.method4708();
				this.method8682();
				return;
			}
			this.anInt5521 = 0;
		}
		if (this.anInt5521 >= local29) {
			if (this.anInt5516 >= 0) {
				this.method4708();
				this.method8682();
				return;
			}
			this.anInt5521 = local29 - 1;
		}
		if (this.anInt5522 >= 0) {
			if (this.anInt5522 > 0) {
				if (this.aBoolean400) {
					label130: {
						if (this.anInt5516 < 0) {
							local40 = this.method4696(arg0, arg1, local18, local44, local13.aByteArray106[this.anInt5523]);
							if (this.anInt5521 >= local18) {
								return;
							}
							this.anInt5521 = local18 + local18 - this.anInt5521 - 1;
							this.anInt5516 = -this.anInt5516;
							if (--this.anInt5522 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4694(arg0, local40, local23, local44, local13.aByteArray106[this.anInt5519 - 1]);
							if (this.anInt5521 < local23) {
								return;
							}
							this.anInt5521 = local23 + local23 - this.anInt5521 - 1;
							this.anInt5516 = -this.anInt5516;
							if (--this.anInt5522 == 0) {
								break;
							}
							local40 = this.method4696(arg0, local40, local18, local44, local13.aByteArray106[this.anInt5523]);
							if (this.anInt5521 >= local18) {
								return;
							}
							this.anInt5521 = local18 + local18 - this.anInt5521 - 1;
							this.anInt5516 = -this.anInt5516;
						} while (--this.anInt5522 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5516 < 0) {
						while (true) {
							local40 = this.method4696(arg0, local40, local18, local44, local13.aByteArray106[this.anInt5519 - 1]);
							if (this.anInt5521 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5521 - 1) / local33;
							if (local416 >= this.anInt5522) {
								this.anInt5521 += local33 * this.anInt5522;
								this.anInt5522 = 0;
								break;
							}
							this.anInt5521 += local33 * local416;
							this.anInt5522 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4694(arg0, local40, local23, local44, local13.aByteArray106[this.anInt5523]);
							if (this.anInt5521 < local23) {
								return;
							}
							local416 = (this.anInt5521 - local18) / local33;
							if (local416 >= this.anInt5522) {
								this.anInt5521 -= local33 * this.anInt5522;
								this.anInt5522 = 0;
								break;
							}
							this.anInt5521 -= local33 * local416;
							this.anInt5522 -= local416;
						}
					}
				}
			}
			if (this.anInt5516 < 0) {
				this.method4696(arg0, local40, 0, local44, 0);
				if (this.anInt5521 < 0) {
					this.anInt5521 = -1;
					this.method4708();
					this.method8682();
					return;
				}
			} else {
				this.method4694(arg0, local40, local29, local44, 0);
				if (this.anInt5521 >= local29) {
					this.anInt5521 = local29;
					this.method4708();
					this.method8682();
				}
			}
		} else if (this.aBoolean400) {
			if (this.anInt5516 < 0) {
				local40 = this.method4696(arg0, arg1, local18, local44, local13.aByteArray106[this.anInt5523]);
				if (this.anInt5521 >= local18) {
					return;
				}
				this.anInt5521 = local18 + local18 - this.anInt5521 - 1;
				this.anInt5516 = -this.anInt5516;
			}
			while (true) {
				local40 = this.method4694(arg0, local40, local23, local44, local13.aByteArray106[this.anInt5519 - 1]);
				if (this.anInt5521 < local23) {
					return;
				}
				this.anInt5521 = local23 + local23 - this.anInt5521 - 1;
				this.anInt5516 = -this.anInt5516;
				local40 = this.method4696(arg0, local40, local18, local44, local13.aByteArray106[this.anInt5523]);
				if (this.anInt5521 >= local18) {
					return;
				}
				this.anInt5521 = local18 + local18 - this.anInt5521 - 1;
				this.anInt5516 = -this.anInt5516;
			}
		} else if (this.anInt5516 < 0) {
			while (true) {
				local40 = this.method4696(arg0, local40, local18, local44, local13.aByteArray106[this.anInt5519 - 1]);
				if (this.anInt5521 >= local18) {
					return;
				}
				this.anInt5521 = local23 - (local23 - 1 - this.anInt5521) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4694(arg0, local40, local23, local44, local13.aByteArray106[this.anInt5523]);
				if (this.anInt5521 < local23) {
					return;
				}
				this.anInt5521 = local18 + (this.anInt5521 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4678(@OriginalArg(0) int arg0) {
		if (this.anInt5515 > 0) {
			if (arg0 >= this.anInt5515) {
				if (this.anInt5514 == Integer.MIN_VALUE) {
					this.anInt5514 = 0;
					this.anInt5510 = this.anInt5520 = this.anInt5513 = 0;
					this.method8682();
					arg0 = this.anInt5515;
				}
				this.anInt5515 = 0;
				this.method4710();
			} else {
				this.anInt5510 += this.anInt5518 * arg0;
				this.anInt5520 += this.anInt5517 * arg0;
				this.anInt5513 += this.anInt5512 * arg0;
				this.anInt5515 -= arg0;
			}
		}
		@Pc(71) Class3_Sub18_Sub1 local71 = (Class3_Sub18_Sub1) super.aClass3_Sub18_6;
		@Pc(76) int local76 = this.anInt5523 << 8;
		@Pc(81) int local81 = this.anInt5519 << 8;
		@Pc(87) int local87 = local71.aByteArray106.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5522 = 0;
		}
		if (this.anInt5521 < 0) {
			if (this.anInt5516 <= 0) {
				this.method4708();
				this.method8682();
				return;
			}
			this.anInt5521 = 0;
		}
		if (this.anInt5521 >= local87) {
			if (this.anInt5516 >= 0) {
				this.method4708();
				this.method8682();
				return;
			}
			this.anInt5521 = local87 - 1;
		}
		this.anInt5521 += this.anInt5516 * arg0;
		if (this.anInt5522 >= 0) {
			if (this.anInt5522 > 0) {
				if (this.aBoolean400) {
					label125: {
						if (this.anInt5516 < 0) {
							if (this.anInt5521 >= local76) {
								return;
							}
							this.anInt5521 = local76 + local76 - this.anInt5521 - 1;
							this.anInt5516 = -this.anInt5516;
							if (--this.anInt5522 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5521 < local81) {
								return;
							}
							this.anInt5521 = local81 + local81 - this.anInt5521 - 1;
							this.anInt5516 = -this.anInt5516;
							if (--this.anInt5522 == 0) {
								break;
							}
							if (this.anInt5521 >= local76) {
								return;
							}
							this.anInt5521 = local76 + local76 - this.anInt5521 - 1;
							this.anInt5516 = -this.anInt5516;
						} while (--this.anInt5522 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5516 < 0) {
						if (this.anInt5521 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5521 - 1) / local91;
						if (local361 < this.anInt5522) {
							this.anInt5521 += local91 * local361;
							this.anInt5522 -= local361;
							return;
						}
						this.anInt5521 += local91 * this.anInt5522;
						this.anInt5522 = 0;
					} else if (this.anInt5521 >= local81) {
						local361 = (this.anInt5521 - local76) / local91;
						if (local361 < this.anInt5522) {
							this.anInt5521 -= local91 * local361;
							this.anInt5522 -= local361;
							return;
						}
						this.anInt5521 -= local91 * this.anInt5522;
						this.anInt5522 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5516 < 0) {
				if (this.anInt5521 < 0) {
					this.anInt5521 = -1;
					this.method4708();
					this.method8682();
					return;
				}
			} else if (this.anInt5521 >= local87) {
				this.anInt5521 = local87;
				this.method4708();
				this.method8682();
			}
		} else if (this.aBoolean400) {
			if (this.anInt5516 < 0) {
				if (this.anInt5521 >= local76) {
					return;
				}
				this.anInt5521 = local76 + local76 - this.anInt5521 - 1;
				this.anInt5516 = -this.anInt5516;
			}
			while (this.anInt5521 >= local81) {
				this.anInt5521 = local81 + local81 - this.anInt5521 - 1;
				this.anInt5516 = -this.anInt5516;
				if (this.anInt5521 >= local76) {
					return;
				}
				this.anInt5521 = local76 + local76 - this.anInt5521 - 1;
				this.anInt5516 = -this.anInt5516;
			}
		} else if (this.anInt5516 < 0) {
			if (this.anInt5521 < local76) {
				this.anInt5521 = local81 - (local81 - 1 - this.anInt5521) % local91 - 1;
			}
		} else if (this.anInt5521 >= local81) {
			this.anInt5521 = local76 + (this.anInt5521 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)V")
	public synchronized void method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4703(arg0, arg1, this.method4711());
	}

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "(I)V")
	private synchronized void method4702() {
		this.method4722(0, this.method4711());
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)V")
	public synchronized void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4722(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static655.method4707(arg1, arg2);
		@Pc(14) int local14 = Static655.method4720(arg1, arg2);
		if (this.anInt5520 == local10 && this.anInt5513 == local14) {
			this.anInt5515 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5510;
		if (this.anInt5510 - arg1 > local31) {
			local31 = this.anInt5510 - arg1;
		}
		if (local10 - this.anInt5520 > local31) {
			local31 = local10 - this.anInt5520;
		}
		if (this.anInt5520 - local10 > local31) {
			local31 = this.anInt5520 - local10;
		}
		if (local14 - this.anInt5513 > local31) {
			local31 = local14 - this.anInt5513;
		}
		if (this.anInt5513 - local14 > local31) {
			local31 = this.anInt5513 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5515 = arg0;
		this.anInt5514 = arg1;
		this.anInt5511 = arg2;
		this.anInt5518 = (arg1 - this.anInt5510) / arg0;
		this.anInt5517 = (local10 - this.anInt5520) / arg0;
		this.anInt5512 = (local14 - this.anInt5513) / arg0;
	}

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "()I")
	public synchronized int method4704() {
		return this.anInt5516 < 0 ? -this.anInt5516 : this.anInt5516;
	}

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "(I)V")
	public synchronized void method4705(@OriginalArg(0) int arg0) {
		if (this.anInt5516 < 0) {
			this.anInt5516 = -arg0;
		} else {
			this.anInt5516 = arg0;
		}
	}

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "()Z")
	public boolean method4706() {
		return this.anInt5515 != 0;
	}

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "()V")
	private void method4708() {
		if (this.anInt5515 == 0) {
			return;
		}
		if (this.anInt5514 == Integer.MIN_VALUE) {
			this.anInt5514 = 0;
		}
		this.anInt5515 = 0;
		this.method4710();
	}

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "()V")
	private void method4710() {
		this.anInt5510 = this.anInt5514;
		this.anInt5520 = Static655.method4707(this.anInt5514, this.anInt5511);
		this.anInt5513 = Static655.method4720(this.anInt5514, this.anInt5511);
	}

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "()I")
	public synchronized int method4711() {
		return this.anInt5511 < 0 ? -1 : this.anInt5511;
	}

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "(I)V")
	public synchronized void method4712(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5521 = arg0;
	}

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "()Z")
	private boolean method4714() {
		@Pc(2) int local2 = this.anInt5514;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static655.method4707(local2, this.anInt5511);
			local8 = Static655.method4720(local2, this.anInt5511);
		}
		if (this.anInt5510 != local2 || this.anInt5520 != local10 || this.anInt5513 != local8) {
			if (this.anInt5510 < local2) {
				this.anInt5518 = 1;
				this.anInt5515 = local2 - this.anInt5510;
			} else if (this.anInt5510 > local2) {
				this.anInt5518 = -1;
				this.anInt5515 = this.anInt5510 - local2;
			} else {
				this.anInt5518 = 0;
			}
			if (this.anInt5520 < local10) {
				this.anInt5517 = 1;
				if (this.anInt5515 == 0 || this.anInt5515 > local10 - this.anInt5520) {
					this.anInt5515 = local10 - this.anInt5520;
				}
			} else if (this.anInt5520 > local10) {
				this.anInt5517 = -1;
				if (this.anInt5515 == 0 || this.anInt5515 > this.anInt5520 - local10) {
					this.anInt5515 = this.anInt5520 - local10;
				}
			} else {
				this.anInt5517 = 0;
			}
			if (this.anInt5513 < local8) {
				this.anInt5512 = 1;
				if (this.anInt5515 == 0 || this.anInt5515 > local8 - this.anInt5513) {
					this.anInt5515 = local8 - this.anInt5513;
				}
			} else if (this.anInt5513 > local8) {
				this.anInt5512 = -1;
				if (this.anInt5515 == 0 || this.anInt5515 > this.anInt5513 - local8) {
					this.anInt5515 = this.anInt5513 - local8;
				}
			} else {
				this.anInt5512 = 0;
			}
			return false;
		} else if (this.anInt5514 == Integer.MIN_VALUE) {
			this.anInt5514 = 0;
			this.anInt5510 = this.anInt5520 = this.anInt5513 = 0;
			this.method8682();
			return true;
		} else {
			this.method4710();
			return false;
		}
	}

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "(I)V")
	public synchronized void method4716(@OriginalArg(0) int arg0) {
		this.anInt5522 = arg0;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "()I")
	@Override
	public int method4681() {
		return this.anInt5514 == 0 && this.anInt5515 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4680() {
		return null;
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(II)V")
	private synchronized void method4722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5514 = arg0;
		this.anInt5511 = arg1;
		this.anInt5515 = 0;
		this.method4710();
	}

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "()Z")
	public boolean method4723() {
		return this.anInt5521 < 0 || this.anInt5521 >= ((Class3_Sub18_Sub1) super.aClass3_Sub18_6).aByteArray106.length << 8;
	}
}
