import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub7_Sub4 extends Class1_Sub7 {

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public int anInt7701;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public int anInt7703;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private int anInt7705;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	public int anInt7706;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	private int anInt7708;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	public int anInt7709;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public int anInt7710;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public int anInt7712;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	private final int anInt7702;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "I")
	private final int anInt7711;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Z")
	private final boolean aBoolean594;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "I")
	private int anInt7713;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	private int anInt7704;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	private int anInt7714;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public int anInt7707;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!mm;II)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub17_5 = arg0;
		this.anInt7702 = arg0.anInt5539;
		this.anInt7711 = arg0.anInt5540;
		this.aBoolean594 = arg0.aBoolean445;
		this.anInt7713 = arg1;
		this.anInt7704 = arg2;
		this.anInt7714 = 8192;
		this.anInt7707 = 0;
		this.method6144();
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!mm;III)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub17_5 = arg0;
		this.anInt7702 = arg0.anInt5539;
		this.anInt7711 = arg0.anInt5540;
		this.aBoolean594 = arg0.aBoolean445;
		this.anInt7713 = arg1;
		this.anInt7704 = arg2;
		this.anInt7714 = arg3;
		this.anInt7707 = 0;
		this.method6144();
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public synchronized void method6139(@OriginalArg(0) int arg0) {
		this.method6140(arg0 << 6, this.method6165());
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	private synchronized void method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7704 = arg0;
		this.anInt7714 = arg1;
		this.anInt7708 = 0;
		this.method6144();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public synchronized void method6142(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6172();
			this.method7859();
		} else if (this.anInt7710 == 0 && this.anInt7701 == 0) {
			this.anInt7708 = 0;
			this.anInt7704 = 0;
			this.anInt7709 = 0;
			this.method7859();
		} else {
			@Pc(31) int local31 = -this.anInt7709;
			if (this.anInt7709 > local31) {
				local31 = this.anInt7709;
			}
			if (-this.anInt7710 > local31) {
				local31 = -this.anInt7710;
			}
			if (this.anInt7710 > local31) {
				local31 = this.anInt7710;
			}
			if (-this.anInt7701 > local31) {
				local31 = -this.anInt7701;
			}
			if (this.anInt7701 > local31) {
				local31 = this.anInt7701;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7708 = arg0;
			this.anInt7704 = Integer.MIN_VALUE;
			this.anInt7712 = -this.anInt7709 / arg0;
			this.anInt7706 = -this.anInt7710 / arg0;
			this.anInt7703 = -this.anInt7701 / arg0;
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "()V")
	private void method6144() {
		this.anInt7709 = this.anInt7704;
		this.anInt7710 = Static606.method6146(this.anInt7704, this.anInt7714);
		this.anInt7701 = Static606.method6153(this.anInt7704, this.anInt7714);
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "()I")
	public synchronized int method6145() {
		return this.anInt7713 < 0 ? -this.anInt7713 : this.anInt7713;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
	@Override
	public int method6137() {
		@Pc(6) int local6 = this.anInt7709 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7705 == 0) {
			local6 -= local6 * this.anInt7707 / (((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67.length << 8);
		} else if (this.anInt7705 >= 0) {
			local6 -= local6 * this.anInt7702 / ((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "()Z")
	private boolean method6148() {
		@Pc(2) int local2 = this.anInt7704;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static606.method6146(local2, this.anInt7714);
			local8 = Static606.method6153(local2, this.anInt7714);
		}
		if (this.anInt7709 != local2 || this.anInt7710 != local10 || this.anInt7701 != local8) {
			if (this.anInt7709 < local2) {
				this.anInt7712 = 1;
				this.anInt7708 = local2 - this.anInt7709;
			} else if (this.anInt7709 > local2) {
				this.anInt7712 = -1;
				this.anInt7708 = this.anInt7709 - local2;
			} else {
				this.anInt7712 = 0;
			}
			if (this.anInt7710 < local10) {
				this.anInt7706 = 1;
				if (this.anInt7708 == 0 || this.anInt7708 > local10 - this.anInt7710) {
					this.anInt7708 = local10 - this.anInt7710;
				}
			} else if (this.anInt7710 > local10) {
				this.anInt7706 = -1;
				if (this.anInt7708 == 0 || this.anInt7708 > this.anInt7710 - local10) {
					this.anInt7708 = this.anInt7710 - local10;
				}
			} else {
				this.anInt7706 = 0;
			}
			if (this.anInt7701 < local8) {
				this.anInt7703 = 1;
				if (this.anInt7708 == 0 || this.anInt7708 > local8 - this.anInt7701) {
					this.anInt7708 = local8 - this.anInt7701;
				}
			} else if (this.anInt7701 > local8) {
				this.anInt7703 = -1;
				if (this.anInt7708 == 0 || this.anInt7708 > this.anInt7701 - local8) {
					this.anInt7708 = this.anInt7701 - local8;
				}
			} else {
				this.anInt7703 = 0;
			}
			return false;
		} else if (this.anInt7704 == Integer.MIN_VALUE) {
			this.anInt7704 = 0;
			this.anInt7709 = this.anInt7710 = this.anInt7701 = 0;
			this.method7859();
			return true;
		} else {
			this.method6144();
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
	public synchronized void method6149() {
		this.anInt7713 = (this.anInt7713 ^ this.anInt7713 >> 31) + (this.anInt7713 >>> 31);
		this.anInt7713 = -this.anInt7713;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()Lclient!pda;")
	@Override
	public Class1_Sub7 method6136() {
		return null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6138(@OriginalArg(0) int arg0) {
		if (this.anInt7708 > 0) {
			if (arg0 >= this.anInt7708) {
				if (this.anInt7704 == Integer.MIN_VALUE) {
					this.anInt7704 = 0;
					this.anInt7709 = this.anInt7710 = this.anInt7701 = 0;
					this.method7859();
					arg0 = this.anInt7708;
				}
				this.anInt7708 = 0;
				this.method6144();
			} else {
				this.anInt7709 += this.anInt7712 * arg0;
				this.anInt7710 += this.anInt7706 * arg0;
				this.anInt7701 += this.anInt7703 * arg0;
				this.anInt7708 -= arg0;
			}
		}
		@Pc(71) Class1_Sub17_Sub1 local71 = (Class1_Sub17_Sub1) super.aClass1_Sub17_5;
		@Pc(76) int local76 = this.anInt7702 << 8;
		@Pc(81) int local81 = this.anInt7711 << 8;
		@Pc(87) int local87 = local71.aByteArray67.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7705 = 0;
		}
		if (this.anInt7707 < 0) {
			if (this.anInt7713 <= 0) {
				this.method6169();
				this.method7859();
				return;
			}
			this.anInt7707 = 0;
		}
		if (this.anInt7707 >= local87) {
			if (this.anInt7713 >= 0) {
				this.method6169();
				this.method7859();
				return;
			}
			this.anInt7707 = local87 - 1;
		}
		this.anInt7707 += this.anInt7713 * arg0;
		if (this.anInt7705 >= 0) {
			if (this.anInt7705 > 0) {
				if (this.aBoolean594) {
					label125: {
						if (this.anInt7713 < 0) {
							if (this.anInt7707 >= local76) {
								return;
							}
							this.anInt7707 = local76 + local76 - this.anInt7707 - 1;
							this.anInt7713 = -this.anInt7713;
							if (--this.anInt7705 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7707 < local81) {
								return;
							}
							this.anInt7707 = local81 + local81 - this.anInt7707 - 1;
							this.anInt7713 = -this.anInt7713;
							if (--this.anInt7705 == 0) {
								break;
							}
							if (this.anInt7707 >= local76) {
								return;
							}
							this.anInt7707 = local76 + local76 - this.anInt7707 - 1;
							this.anInt7713 = -this.anInt7713;
						} while (--this.anInt7705 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7713 < 0) {
						if (this.anInt7707 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7707 - 1) / local91;
						if (local361 < this.anInt7705) {
							this.anInt7707 += local91 * local361;
							this.anInt7705 -= local361;
							return;
						}
						this.anInt7707 += local91 * this.anInt7705;
						this.anInt7705 = 0;
					} else if (this.anInt7707 >= local81) {
						local361 = (this.anInt7707 - local76) / local91;
						if (local361 < this.anInt7705) {
							this.anInt7707 -= local91 * local361;
							this.anInt7705 -= local361;
							return;
						}
						this.anInt7707 -= local91 * this.anInt7705;
						this.anInt7705 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7713 < 0) {
				if (this.anInt7707 < 0) {
					this.anInt7707 = -1;
					this.method6169();
					this.method7859();
					return;
				}
			} else if (this.anInt7707 >= local87) {
				this.anInt7707 = local87;
				this.method6169();
				this.method7859();
			}
		} else if (this.aBoolean594) {
			if (this.anInt7713 < 0) {
				if (this.anInt7707 >= local76) {
					return;
				}
				this.anInt7707 = local76 + local76 - this.anInt7707 - 1;
				this.anInt7713 = -this.anInt7713;
			}
			while (this.anInt7707 >= local81) {
				this.anInt7707 = local81 + local81 - this.anInt7707 - 1;
				this.anInt7713 = -this.anInt7713;
				if (this.anInt7707 >= local76) {
					return;
				}
				this.anInt7707 = local76 + local76 - this.anInt7707 - 1;
				this.anInt7713 = -this.anInt7713;
			}
		} else if (this.anInt7713 < 0) {
			if (this.anInt7707 < local76) {
				this.anInt7707 = local81 - (local81 - 1 - this.anInt7707) % local91 - 1;
			}
		} else if (this.anInt7707 >= local81) {
			this.anInt7707 = local76 + (this.anInt7707 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public synchronized void method6154(@OriginalArg(0) int arg0) {
		if (this.anInt7713 < 0) {
			this.anInt7713 = -arg0;
		} else {
			this.anInt7713 = arg0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([IIIII)I")
	private int method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7708 <= 0) {
				if (this.anInt7713 == -256 && (this.anInt7707 & 0xFF) == 0) {
					if (Static19.aBoolean22) {
						return Static606.method6159(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, arg3, arg2, this);
					}
					return Static606.method6164(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, arg3, arg2, this);
				}
				if (Static19.aBoolean22) {
					return Static606.method6141(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, arg3, arg2, this, this.anInt7713, arg4);
				}
				return Static606.method6161(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, arg3, arg2, this, this.anInt7713, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7708;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7708 += arg1;
			if (this.anInt7713 == -256 && (this.anInt7707 & 0xFF) == 0) {
				if (Static19.aBoolean22) {
					arg1 = Static606.method6163(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, this.anInt7706, this.anInt7703, local5, arg2, this);
				} else {
					arg1 = Static606.method6170(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, this.anInt7712, local5, arg2, this);
				}
			} else if (Static19.aBoolean22) {
				arg1 = Static606.method6157(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, this.anInt7706, this.anInt7703, local5, arg2, this, this.anInt7713, arg4);
			} else {
				arg1 = Static606.method6177(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, this.anInt7712, local5, arg2, this, this.anInt7713, arg4);
			}
			this.anInt7708 -= arg1;
			if (this.anInt7708 != 0) {
				return arg1;
			}
		} while (!this.method6148());
		return arg3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	public synchronized void method6156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6140(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static606.method6146(arg1, arg2);
		@Pc(14) int local14 = Static606.method6153(arg1, arg2);
		if (this.anInt7710 == local10 && this.anInt7701 == local14) {
			this.anInt7708 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7709;
		if (this.anInt7709 - arg1 > local31) {
			local31 = this.anInt7709 - arg1;
		}
		if (local10 - this.anInt7710 > local31) {
			local31 = local10 - this.anInt7710;
		}
		if (this.anInt7710 - local10 > local31) {
			local31 = this.anInt7710 - local10;
		}
		if (local14 - this.anInt7701 > local31) {
			local31 = local14 - this.anInt7701;
		}
		if (this.anInt7701 - local14 > local31) {
			local31 = this.anInt7701 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7708 = arg0;
		this.anInt7704 = arg1;
		this.anInt7714 = arg2;
		this.anInt7712 = (arg1 - this.anInt7709) / arg0;
		this.anInt7706 = (local10 - this.anInt7710) / arg0;
		this.anInt7703 = (local14 - this.anInt7701) / arg0;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "()Z")
	public boolean method6162() {
		return this.anInt7707 < 0 || this.anInt7707 >= ((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67.length << 8;
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "()I")
	public synchronized int method6165() {
		return this.anInt7714 < 0 ? -1 : this.anInt7714;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
	public synchronized void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6156(arg0, arg1, this.method6165());
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "([IIIII)I")
	private int method6167(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7708 <= 0) {
				if (this.anInt7713 == 256 && (this.anInt7707 & 0xFF) == 0) {
					if (Static19.aBoolean22) {
						return Static606.method6158(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, arg3, arg2, this);
					}
					return Static606.method6173(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, arg3, arg2, this);
				}
				if (Static19.aBoolean22) {
					return Static606.method6176(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, arg3, arg2, this, this.anInt7713, arg4);
				}
				return Static606.method6151(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, arg3, arg2, this, this.anInt7713, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7708;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7708 += arg1;
			if (this.anInt7713 == 256 && (this.anInt7707 & 0xFF) == 0) {
				if (Static19.aBoolean22) {
					arg1 = Static606.method6160(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, this.anInt7706, this.anInt7703, local5, arg2, this);
				} else {
					arg1 = Static606.method6150(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, this.anInt7712, local5, arg2, this);
				}
			} else if (Static19.aBoolean22) {
				arg1 = Static606.method6152(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7710, this.anInt7701, this.anInt7706, this.anInt7703, local5, arg2, this, this.anInt7713, arg4);
			} else {
				arg1 = Static606.method6147(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67, arg0, this.anInt7707, arg1, this.anInt7709, this.anInt7712, local5, arg2, this, this.anInt7713, arg4);
			}
			this.anInt7708 -= arg1;
			if (this.anInt7708 != 0) {
				return arg1;
			}
		} while (!this.method6148());
		return arg3;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()I")
	@Override
	public int method6135() {
		return this.anInt7704 == 0 && this.anInt7708 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "()V")
	private void method6169() {
		if (this.anInt7708 == 0) {
			return;
		}
		if (this.anInt7704 == Integer.MIN_VALUE) {
			this.anInt7704 = 0;
		}
		this.anInt7708 = 0;
		this.method6144();
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public synchronized void method6171(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray67.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7707 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
	private synchronized void method6172() {
		this.method6140(0, this.method6165());
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "()I")
	public synchronized int method6174() {
		return this.anInt7704 == Integer.MIN_VALUE ? 0 : this.anInt7704;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public Class1_Sub7 method6134() {
		return null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6132(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7704 == 0 && this.anInt7708 == 0) {
			this.method6138(arg2);
			return;
		}
		@Pc(13) Class1_Sub17_Sub1 local13 = (Class1_Sub17_Sub1) super.aClass1_Sub17_5;
		@Pc(18) int local18 = this.anInt7702 << 8;
		@Pc(23) int local23 = this.anInt7711 << 8;
		@Pc(29) int local29 = local13.aByteArray67.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7705 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7707 < 0) {
			if (this.anInt7713 <= 0) {
				this.method6169();
				this.method7859();
				return;
			}
			this.anInt7707 = 0;
		}
		if (this.anInt7707 >= local29) {
			if (this.anInt7713 >= 0) {
				this.method6169();
				this.method7859();
				return;
			}
			this.anInt7707 = local29 - 1;
		}
		if (this.anInt7705 >= 0) {
			if (this.anInt7705 > 0) {
				if (this.aBoolean594) {
					label130: {
						if (this.anInt7713 < 0) {
							local40 = this.method6155(arg0, arg1, local18, local44, local13.aByteArray67[this.anInt7702]);
							if (this.anInt7707 >= local18) {
								return;
							}
							this.anInt7707 = local18 + local18 - this.anInt7707 - 1;
							this.anInt7713 = -this.anInt7713;
							if (--this.anInt7705 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6167(arg0, local40, local23, local44, local13.aByteArray67[this.anInt7711 - 1]);
							if (this.anInt7707 < local23) {
								return;
							}
							this.anInt7707 = local23 + local23 - this.anInt7707 - 1;
							this.anInt7713 = -this.anInt7713;
							if (--this.anInt7705 == 0) {
								break;
							}
							local40 = this.method6155(arg0, local40, local18, local44, local13.aByteArray67[this.anInt7702]);
							if (this.anInt7707 >= local18) {
								return;
							}
							this.anInt7707 = local18 + local18 - this.anInt7707 - 1;
							this.anInt7713 = -this.anInt7713;
						} while (--this.anInt7705 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7713 < 0) {
						while (true) {
							local40 = this.method6155(arg0, local40, local18, local44, local13.aByteArray67[this.anInt7711 - 1]);
							if (this.anInt7707 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7707 - 1) / local33;
							if (local416 >= this.anInt7705) {
								this.anInt7707 += local33 * this.anInt7705;
								this.anInt7705 = 0;
								break;
							}
							this.anInt7707 += local33 * local416;
							this.anInt7705 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6167(arg0, local40, local23, local44, local13.aByteArray67[this.anInt7702]);
							if (this.anInt7707 < local23) {
								return;
							}
							local416 = (this.anInt7707 - local18) / local33;
							if (local416 >= this.anInt7705) {
								this.anInt7707 -= local33 * this.anInt7705;
								this.anInt7705 = 0;
								break;
							}
							this.anInt7707 -= local33 * local416;
							this.anInt7705 -= local416;
						}
					}
				}
			}
			if (this.anInt7713 < 0) {
				this.method6155(arg0, local40, 0, local44, 0);
				if (this.anInt7707 < 0) {
					this.anInt7707 = -1;
					this.method6169();
					this.method7859();
					return;
				}
			} else {
				this.method6167(arg0, local40, local29, local44, 0);
				if (this.anInt7707 >= local29) {
					this.anInt7707 = local29;
					this.method6169();
					this.method7859();
				}
			}
		} else if (this.aBoolean594) {
			if (this.anInt7713 < 0) {
				local40 = this.method6155(arg0, arg1, local18, local44, local13.aByteArray67[this.anInt7702]);
				if (this.anInt7707 >= local18) {
					return;
				}
				this.anInt7707 = local18 + local18 - this.anInt7707 - 1;
				this.anInt7713 = -this.anInt7713;
			}
			while (true) {
				local40 = this.method6167(arg0, local40, local23, local44, local13.aByteArray67[this.anInt7711 - 1]);
				if (this.anInt7707 < local23) {
					return;
				}
				this.anInt7707 = local23 + local23 - this.anInt7707 - 1;
				this.anInt7713 = -this.anInt7713;
				local40 = this.method6155(arg0, local40, local18, local44, local13.aByteArray67[this.anInt7702]);
				if (this.anInt7707 >= local18) {
					return;
				}
				this.anInt7707 = local18 + local18 - this.anInt7707 - 1;
				this.anInt7713 = -this.anInt7713;
			}
		} else if (this.anInt7713 < 0) {
			while (true) {
				local40 = this.method6155(arg0, local40, local18, local44, local13.aByteArray67[this.anInt7711 - 1]);
				if (this.anInt7707 >= local18) {
					return;
				}
				this.anInt7707 = local23 - (local23 - 1 - this.anInt7707) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6167(arg0, local40, local23, local44, local13.aByteArray67[this.anInt7702]);
				if (this.anInt7707 < local23) {
					return;
				}
				this.anInt7707 = local18 + (this.anInt7707 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "()Z")
	public boolean method6175() {
		return this.anInt7708 != 0;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
	public synchronized void method6178(@OriginalArg(0) int arg0) {
		this.anInt7705 = arg0;
	}
}
