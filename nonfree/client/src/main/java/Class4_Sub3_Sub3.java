import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	private int anInt6827;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	private int anInt6829;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public int anInt6830;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
	public int anInt6833;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	public int anInt6834;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
	public int anInt6836;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
	public int anInt6840;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
	private final int anInt6835;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
	private final int anInt6838;

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "Z")
	private final boolean aBoolean530;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
	private int anInt6837;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	private int anInt6828;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	public int anInt6831;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!aia;III)V")
	public Class4_Sub3_Sub3(@OriginalArg(0) Class4_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub4_6 = arg0;
		this.anInt6835 = arg0.anInt194;
		this.anInt6838 = arg0.anInt192;
		this.aBoolean530 = arg0.aBoolean17;
		this.anInt6837 = arg1;
		this.anInt6828 = arg2;
		this.anInt6839 = arg3;
		this.anInt6831 = 0;
		this.method6005();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public synchronized void method5989(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6831 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	public synchronized void method5991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6026(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static683.method6009(arg1, arg2);
		@Pc(14) int local14 = Static683.method5990(arg1, arg2);
		if (this.anInt6834 == local10 && this.anInt6836 == local14) {
			this.anInt6827 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6833;
		if (this.anInt6833 - arg1 > local31) {
			local31 = this.anInt6833 - arg1;
		}
		if (local10 - this.anInt6834 > local31) {
			local31 = local10 - this.anInt6834;
		}
		if (this.anInt6834 - local10 > local31) {
			local31 = this.anInt6834 - local10;
		}
		if (local14 - this.anInt6836 > local31) {
			local31 = local14 - this.anInt6836;
		}
		if (this.anInt6836 - local14 > local31) {
			local31 = this.anInt6836 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6827 = arg0;
		this.anInt6828 = arg1;
		this.anInt6839 = arg2;
		this.anInt6840 = (arg1 - this.anInt6833) / arg0;
		this.anInt6832 = (local10 - this.anInt6834) / arg0;
		this.anInt6830 = (local14 - this.anInt6836) / arg0;
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "()I")
	public synchronized int method5992() {
		return this.anInt6837 < 0 ? -this.anInt6837 : this.anInt6837;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public synchronized void method5996(@OriginalArg(0) int arg0) {
		this.method6026(this.method6000(), arg0);
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	public synchronized void method5999(@OriginalArg(0) int arg0) {
		this.method6026(arg0 << 6, this.method6001());
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "()I")
	public synchronized int method6000() {
		return this.anInt6828 == Integer.MIN_VALUE ? 0 : this.anInt6828;
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "()I")
	public synchronized int method6001() {
		return this.anInt6839 < 0 ? -1 : this.anInt6839;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	public synchronized void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5991(arg0, arg1, this.method6001());
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([IIIII)I")
	private int method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6827 <= 0) {
				if (this.anInt6837 == 256 && (this.anInt6831 & 0xFF) == 0) {
					if (Static157.aBoolean213) {
						return Static683.method5995(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, arg3, arg2, this);
					}
					return Static683.method6011(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, arg3, arg2, this);
				}
				if (Static157.aBoolean213) {
					return Static683.method5993(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, arg3, arg2, this, this.anInt6837, arg4);
				}
				return Static683.method6022(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, arg3, arg2, this, this.anInt6837, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6827;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6827 += arg1;
			if (this.anInt6837 == 256 && (this.anInt6831 & 0xFF) == 0) {
				if (Static157.aBoolean213) {
					arg1 = Static683.method5997(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, this.anInt6832, this.anInt6830, local5, arg2, this);
				} else {
					arg1 = Static683.method6025(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, this.anInt6840, local5, arg2, this);
				}
			} else if (Static157.aBoolean213) {
				arg1 = Static683.method5988(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, this.anInt6832, this.anInt6830, local5, arg2, this, this.anInt6837, arg4);
			} else {
				arg1 = Static683.method6016(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, this.anInt6840, local5, arg2, this, this.anInt6837, arg4);
			}
			this.anInt6827 -= arg1;
			if (this.anInt6827 != 0) {
				return arg1;
			}
		} while (!this.method6014());
		return arg3;
	}

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "()V")
	private void method6005() {
		this.anInt6833 = this.anInt6828;
		this.anInt6834 = Static683.method6009(this.anInt6828, this.anInt6839);
		this.anInt6836 = Static683.method5990(this.anInt6828, this.anInt6839);
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
	public synchronized void method6006(@OriginalArg(0) int arg0) {
		if (this.anInt6837 < 0) {
			this.anInt6837 = -arg0;
		} else {
			this.anInt6837 = arg0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
	public synchronized void method6008() {
		this.anInt6837 = (this.anInt6837 ^ this.anInt6837 >> 31) + (this.anInt6837 >>> 31);
		this.anInt6837 = -this.anInt6837;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7719() {
		return null;
	}

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "()Z")
	private boolean method6014() {
		@Pc(2) int local2 = this.anInt6828;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static683.method6009(local2, this.anInt6839);
			local8 = Static683.method5990(local2, this.anInt6839);
		}
		if (this.anInt6833 != local2 || this.anInt6834 != local10 || this.anInt6836 != local8) {
			if (this.anInt6833 < local2) {
				this.anInt6840 = 1;
				this.anInt6827 = local2 - this.anInt6833;
			} else if (this.anInt6833 > local2) {
				this.anInt6840 = -1;
				this.anInt6827 = this.anInt6833 - local2;
			} else {
				this.anInt6840 = 0;
			}
			if (this.anInt6834 < local10) {
				this.anInt6832 = 1;
				if (this.anInt6827 == 0 || this.anInt6827 > local10 - this.anInt6834) {
					this.anInt6827 = local10 - this.anInt6834;
				}
			} else if (this.anInt6834 > local10) {
				this.anInt6832 = -1;
				if (this.anInt6827 == 0 || this.anInt6827 > this.anInt6834 - local10) {
					this.anInt6827 = this.anInt6834 - local10;
				}
			} else {
				this.anInt6832 = 0;
			}
			if (this.anInt6836 < local8) {
				this.anInt6830 = 1;
				if (this.anInt6827 == 0 || this.anInt6827 > local8 - this.anInt6836) {
					this.anInt6827 = local8 - this.anInt6836;
				}
			} else if (this.anInt6836 > local8) {
				this.anInt6830 = -1;
				if (this.anInt6827 == 0 || this.anInt6827 > this.anInt6836 - local8) {
					this.anInt6827 = this.anInt6836 - local8;
				}
			} else {
				this.anInt6830 = 0;
			}
			return false;
		} else if (this.anInt6828 == Integer.MIN_VALUE) {
			this.anInt6828 = 0;
			this.anInt6833 = this.anInt6834 = this.anInt6836 = 0;
			this.method9000();
			return true;
		} else {
			this.method6005();
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)V")
	public synchronized void method6015(@OriginalArg(0) int arg0) {
		this.anInt6829 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()I")
	@Override
	public int method7717() {
		@Pc(6) int local6 = this.anInt6833 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6829 == 0) {
			local6 -= local6 * this.anInt6831 / (((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1.length << 8);
		} else if (this.anInt6829 >= 0) {
			local6 -= local6 * this.anInt6835 / ((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "()Z")
	public boolean method6017() {
		return this.anInt6831 < 0 || this.anInt6831 >= ((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1.length << 8;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7715(@OriginalArg(0) int arg0) {
		if (this.anInt6827 > 0) {
			if (arg0 >= this.anInt6827) {
				if (this.anInt6828 == Integer.MIN_VALUE) {
					this.anInt6828 = 0;
					this.anInt6833 = this.anInt6834 = this.anInt6836 = 0;
					this.method9000();
					arg0 = this.anInt6827;
				}
				this.anInt6827 = 0;
				this.method6005();
			} else {
				this.anInt6833 += this.anInt6840 * arg0;
				this.anInt6834 += this.anInt6832 * arg0;
				this.anInt6836 += this.anInt6830 * arg0;
				this.anInt6827 -= arg0;
			}
		}
		@Pc(71) Class4_Sub4_Sub1 local71 = (Class4_Sub4_Sub1) super.aClass4_Sub4_6;
		@Pc(76) int local76 = this.anInt6835 << 8;
		@Pc(81) int local81 = this.anInt6838 << 8;
		@Pc(87) int local87 = local71.aByteArray1.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6829 = 0;
		}
		if (this.anInt6831 < 0) {
			if (this.anInt6837 <= 0) {
				this.method6020();
				this.method9000();
				return;
			}
			this.anInt6831 = 0;
		}
		if (this.anInt6831 >= local87) {
			if (this.anInt6837 >= 0) {
				this.method6020();
				this.method9000();
				return;
			}
			this.anInt6831 = local87 - 1;
		}
		this.anInt6831 += this.anInt6837 * arg0;
		if (this.anInt6829 >= 0) {
			if (this.anInt6829 > 0) {
				if (this.aBoolean530) {
					label125: {
						if (this.anInt6837 < 0) {
							if (this.anInt6831 >= local76) {
								return;
							}
							this.anInt6831 = local76 + local76 - this.anInt6831 - 1;
							this.anInt6837 = -this.anInt6837;
							if (--this.anInt6829 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6831 < local81) {
								return;
							}
							this.anInt6831 = local81 + local81 - this.anInt6831 - 1;
							this.anInt6837 = -this.anInt6837;
							if (--this.anInt6829 == 0) {
								break;
							}
							if (this.anInt6831 >= local76) {
								return;
							}
							this.anInt6831 = local76 + local76 - this.anInt6831 - 1;
							this.anInt6837 = -this.anInt6837;
						} while (--this.anInt6829 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6837 < 0) {
						if (this.anInt6831 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6831 - 1) / local91;
						if (local361 < this.anInt6829) {
							this.anInt6831 += local91 * local361;
							this.anInt6829 -= local361;
							return;
						}
						this.anInt6831 += local91 * this.anInt6829;
						this.anInt6829 = 0;
					} else if (this.anInt6831 >= local81) {
						local361 = (this.anInt6831 - local76) / local91;
						if (local361 < this.anInt6829) {
							this.anInt6831 -= local91 * local361;
							this.anInt6829 -= local361;
							return;
						}
						this.anInt6831 -= local91 * this.anInt6829;
						this.anInt6829 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6837 < 0) {
				if (this.anInt6831 < 0) {
					this.anInt6831 = -1;
					this.method6020();
					this.method9000();
					return;
				}
			} else if (this.anInt6831 >= local87) {
				this.anInt6831 = local87;
				this.method6020();
				this.method9000();
			}
		} else if (this.aBoolean530) {
			if (this.anInt6837 < 0) {
				if (this.anInt6831 >= local76) {
					return;
				}
				this.anInt6831 = local76 + local76 - this.anInt6831 - 1;
				this.anInt6837 = -this.anInt6837;
			}
			while (this.anInt6831 >= local81) {
				this.anInt6831 = local81 + local81 - this.anInt6831 - 1;
				this.anInt6837 = -this.anInt6837;
				if (this.anInt6831 >= local76) {
					return;
				}
				this.anInt6831 = local76 + local76 - this.anInt6831 - 1;
				this.anInt6837 = -this.anInt6837;
			}
		} else if (this.anInt6837 < 0) {
			if (this.anInt6831 < local76) {
				this.anInt6831 = local81 - (local81 - 1 - this.anInt6831) % local91 - 1;
			}
		} else if (this.anInt6831 >= local81) {
			this.anInt6831 = local76 + (this.anInt6831 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()I")
	@Override
	public int method7714() {
		return this.anInt6828 == 0 && this.anInt6827 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "(I)V")
	public synchronized void method6018(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6023();
			this.method9000();
		} else if (this.anInt6834 == 0 && this.anInt6836 == 0) {
			this.anInt6827 = 0;
			this.anInt6828 = 0;
			this.anInt6833 = 0;
			this.method9000();
		} else {
			@Pc(31) int local31 = -this.anInt6833;
			if (this.anInt6833 > local31) {
				local31 = this.anInt6833;
			}
			if (-this.anInt6834 > local31) {
				local31 = -this.anInt6834;
			}
			if (this.anInt6834 > local31) {
				local31 = this.anInt6834;
			}
			if (-this.anInt6836 > local31) {
				local31 = -this.anInt6836;
			}
			if (this.anInt6836 > local31) {
				local31 = this.anInt6836;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6827 = arg0;
			this.anInt6828 = Integer.MIN_VALUE;
			this.anInt6840 = -this.anInt6833 / arg0;
			this.anInt6832 = -this.anInt6834 / arg0;
			this.anInt6830 = -this.anInt6836 / arg0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "()Z")
	public boolean method6019() {
		return this.anInt6827 != 0;
	}

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "()V")
	private void method6020() {
		if (this.anInt6827 == 0) {
			return;
		}
		if (this.anInt6828 == Integer.MIN_VALUE) {
			this.anInt6828 = 0;
		}
		this.anInt6827 = 0;
		this.method6005();
	}

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "(I)V")
	private synchronized void method6023() {
		this.method6026(0, this.method6001());
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7718(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6828 == 0 && this.anInt6827 == 0) {
			this.method7715(arg2);
			return;
		}
		@Pc(13) Class4_Sub4_Sub1 local13 = (Class4_Sub4_Sub1) super.aClass4_Sub4_6;
		@Pc(18) int local18 = this.anInt6835 << 8;
		@Pc(23) int local23 = this.anInt6838 << 8;
		@Pc(29) int local29 = local13.aByteArray1.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6829 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6831 < 0) {
			if (this.anInt6837 <= 0) {
				this.method6020();
				this.method9000();
				return;
			}
			this.anInt6831 = 0;
		}
		if (this.anInt6831 >= local29) {
			if (this.anInt6837 >= 0) {
				this.method6020();
				this.method9000();
				return;
			}
			this.anInt6831 = local29 - 1;
		}
		if (this.anInt6829 >= 0) {
			if (this.anInt6829 > 0) {
				if (this.aBoolean530) {
					label130: {
						if (this.anInt6837 < 0) {
							local40 = this.method6027(arg0, arg1, local18, local44, local13.aByteArray1[this.anInt6835]);
							if (this.anInt6831 >= local18) {
								return;
							}
							this.anInt6831 = local18 + local18 - this.anInt6831 - 1;
							this.anInt6837 = -this.anInt6837;
							if (--this.anInt6829 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6004(arg0, local40, local23, local44, local13.aByteArray1[this.anInt6838 - 1]);
							if (this.anInt6831 < local23) {
								return;
							}
							this.anInt6831 = local23 + local23 - this.anInt6831 - 1;
							this.anInt6837 = -this.anInt6837;
							if (--this.anInt6829 == 0) {
								break;
							}
							local40 = this.method6027(arg0, local40, local18, local44, local13.aByteArray1[this.anInt6835]);
							if (this.anInt6831 >= local18) {
								return;
							}
							this.anInt6831 = local18 + local18 - this.anInt6831 - 1;
							this.anInt6837 = -this.anInt6837;
						} while (--this.anInt6829 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6837 < 0) {
						while (true) {
							local40 = this.method6027(arg0, local40, local18, local44, local13.aByteArray1[this.anInt6838 - 1]);
							if (this.anInt6831 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6831 - 1) / local33;
							if (local416 >= this.anInt6829) {
								this.anInt6831 += local33 * this.anInt6829;
								this.anInt6829 = 0;
								break;
							}
							this.anInt6831 += local33 * local416;
							this.anInt6829 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6004(arg0, local40, local23, local44, local13.aByteArray1[this.anInt6835]);
							if (this.anInt6831 < local23) {
								return;
							}
							local416 = (this.anInt6831 - local18) / local33;
							if (local416 >= this.anInt6829) {
								this.anInt6831 -= local33 * this.anInt6829;
								this.anInt6829 = 0;
								break;
							}
							this.anInt6831 -= local33 * local416;
							this.anInt6829 -= local416;
						}
					}
				}
			}
			if (this.anInt6837 < 0) {
				this.method6027(arg0, local40, 0, local44, 0);
				if (this.anInt6831 < 0) {
					this.anInt6831 = -1;
					this.method6020();
					this.method9000();
					return;
				}
			} else {
				this.method6004(arg0, local40, local29, local44, 0);
				if (this.anInt6831 >= local29) {
					this.anInt6831 = local29;
					this.method6020();
					this.method9000();
				}
			}
		} else if (this.aBoolean530) {
			if (this.anInt6837 < 0) {
				local40 = this.method6027(arg0, arg1, local18, local44, local13.aByteArray1[this.anInt6835]);
				if (this.anInt6831 >= local18) {
					return;
				}
				this.anInt6831 = local18 + local18 - this.anInt6831 - 1;
				this.anInt6837 = -this.anInt6837;
			}
			while (true) {
				local40 = this.method6004(arg0, local40, local23, local44, local13.aByteArray1[this.anInt6838 - 1]);
				if (this.anInt6831 < local23) {
					return;
				}
				this.anInt6831 = local23 + local23 - this.anInt6831 - 1;
				this.anInt6837 = -this.anInt6837;
				local40 = this.method6027(arg0, local40, local18, local44, local13.aByteArray1[this.anInt6835]);
				if (this.anInt6831 >= local18) {
					return;
				}
				this.anInt6831 = local18 + local18 - this.anInt6831 - 1;
				this.anInt6837 = -this.anInt6837;
			}
		} else if (this.anInt6837 < 0) {
			while (true) {
				local40 = this.method6027(arg0, local40, local18, local44, local13.aByteArray1[this.anInt6838 - 1]);
				if (this.anInt6831 >= local18) {
					return;
				}
				this.anInt6831 = local23 - (local23 - 1 - this.anInt6831) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6004(arg0, local40, local23, local44, local13.aByteArray1[this.anInt6835]);
				if (this.anInt6831 < local23) {
					return;
				}
				this.anInt6831 = local18 + (this.anInt6831 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(II)V")
	private synchronized void method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6828 = arg0;
		this.anInt6839 = arg1;
		this.anInt6827 = 0;
		this.method6005();
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7720() {
		return null;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "([IIIII)I")
	private int method6027(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6827 <= 0) {
				if (this.anInt6837 == -256 && (this.anInt6831 & 0xFF) == 0) {
					if (Static157.aBoolean213) {
						return Static683.method6012(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, arg3, arg2, this);
					}
					return Static683.method5998(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, arg3, arg2, this);
				}
				if (Static157.aBoolean213) {
					return Static683.method6010(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, arg3, arg2, this, this.anInt6837, arg4);
				}
				return Static683.method6007(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, arg3, arg2, this, this.anInt6837, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6827;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6827 += arg1;
			if (this.anInt6837 == -256 && (this.anInt6831 & 0xFF) == 0) {
				if (Static157.aBoolean213) {
					arg1 = Static683.method6021(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, this.anInt6832, this.anInt6830, local5, arg2, this);
				} else {
					arg1 = Static683.method6024(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, this.anInt6840, local5, arg2, this);
				}
			} else if (Static157.aBoolean213) {
				arg1 = Static683.method6003(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6834, this.anInt6836, this.anInt6832, this.anInt6830, local5, arg2, this, this.anInt6837, arg4);
			} else {
				arg1 = Static683.method6013(((Class4_Sub4_Sub1) super.aClass4_Sub4_6).aByteArray1, arg0, this.anInt6831, arg1, this.anInt6833, this.anInt6840, local5, arg2, this, this.anInt6837, arg4);
			}
			this.anInt6827 -= arg1;
			if (this.anInt6827 != 0) {
				return arg1;
			}
		} while (!this.method6014());
		return arg3;
	}
}
