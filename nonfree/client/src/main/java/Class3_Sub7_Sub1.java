import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	private final int anInt652;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	private final int anInt644;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Z")
	private final boolean aBoolean57;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!ma;III)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) Class3_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub12_6 = arg0;
		this.anInt652 = arg0.anInt6623;
		this.anInt644 = arg0.anInt6624;
		this.aBoolean57 = arg0.aBoolean564;
		this.anInt645 = arg1;
		this.anInt648 = arg2;
		this.anInt641 = arg3;
		this.anInt647 = 0;
		this.method651();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public synchronized void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method678(arg0, arg1, this.method662());
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public synchronized void method647() {
		this.anInt645 = (this.anInt645 ^ this.anInt645 >> 31) + (this.anInt645 >>> 31);
		this.anInt645 = -this.anInt645;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()Z")
	private boolean method649() {
		@Pc(2) int local2 = this.anInt648;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static650.method652(local2, this.anInt641);
			local8 = Static650.method682(local2, this.anInt641);
		}
		if (this.anInt643 != local2 || this.anInt650 != local10 || this.anInt642 != local8) {
			if (this.anInt643 < local2) {
				this.anInt646 = 1;
				this.anInt651 = local2 - this.anInt643;
			} else if (this.anInt643 > local2) {
				this.anInt646 = -1;
				this.anInt651 = this.anInt643 - local2;
			} else {
				this.anInt646 = 0;
			}
			if (this.anInt650 < local10) {
				this.anInt653 = 1;
				if (this.anInt651 == 0 || this.anInt651 > local10 - this.anInt650) {
					this.anInt651 = local10 - this.anInt650;
				}
			} else if (this.anInt650 > local10) {
				this.anInt653 = -1;
				if (this.anInt651 == 0 || this.anInt651 > this.anInt650 - local10) {
					this.anInt651 = this.anInt650 - local10;
				}
			} else {
				this.anInt653 = 0;
			}
			if (this.anInt642 < local8) {
				this.anInt649 = 1;
				if (this.anInt651 == 0 || this.anInt651 > local8 - this.anInt642) {
					this.anInt651 = local8 - this.anInt642;
				}
			} else if (this.anInt642 > local8) {
				this.anInt649 = -1;
				if (this.anInt651 == 0 || this.anInt651 > this.anInt642 - local8) {
					this.anInt651 = this.anInt642 - local8;
				}
			} else {
				this.anInt649 = 0;
			}
			return false;
		} else if (this.anInt648 == Integer.MIN_VALUE) {
			this.anInt648 = 0;
			this.anInt643 = this.anInt650 = this.anInt642 = 0;
			this.method8671();
			return true;
		} else {
			this.method651();
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public synchronized void method650(@OriginalArg(0) int arg0) {
		this.anInt654 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()V")
	private void method651() {
		this.anInt643 = this.anInt648;
		this.anInt650 = Static650.method652(this.anInt648, this.anInt641);
		this.anInt642 = Static650.method682(this.anInt648, this.anInt641);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6006() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
	@Override
	public int method6001() {
		@Pc(6) int local6 = this.anInt643 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt654 == 0) {
			local6 -= local6 * this.anInt647 / (((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70.length << 8);
		} else if (this.anInt654 >= 0) {
			local6 -= local6 * this.anInt652 / ((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	@Override
	public int method6000() {
		return this.anInt648 == 0 && this.anInt651 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "()Z")
	public boolean method655() {
		return this.anInt647 < 0 || this.anInt647 >= ((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70.length << 8;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public synchronized void method656(@OriginalArg(0) int arg0) {
		this.method658(arg0 << 6, this.method662());
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	private synchronized void method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt648 = arg0;
		this.anInt641 = arg1;
		this.anInt651 = 0;
		this.method651();
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "()I")
	public synchronized int method662() {
		return this.anInt641 < 0 ? -1 : this.anInt641;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "()I")
	public synchronized int method664() {
		return this.anInt645 < 0 ? -this.anInt645 : this.anInt645;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	private synchronized void method667() {
		this.method658(0, this.method662());
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	public synchronized void method668(@OriginalArg(0) int arg0) {
		this.method658(this.method684(), arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIIII)I")
	private int method670(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt651 <= 0) {
				if (this.anInt645 == -256 && (this.anInt647 & 0xFF) == 0) {
					if (Static457.aBoolean715) {
						return Static650.method681(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, arg3, arg2, this);
					}
					return Static650.method661(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, arg3, arg2, this);
				}
				if (Static457.aBoolean715) {
					return Static650.method675(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, arg3, arg2, this, this.anInt645, arg4);
				}
				return Static650.method663(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, arg3, arg2, this, this.anInt645, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt651;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt651 += arg1;
			if (this.anInt645 == -256 && (this.anInt647 & 0xFF) == 0) {
				if (Static457.aBoolean715) {
					arg1 = Static650.method665(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, this.anInt653, this.anInt649, local5, arg2, this);
				} else {
					arg1 = Static650.method669(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, this.anInt646, local5, arg2, this);
				}
			} else if (Static457.aBoolean715) {
				arg1 = Static650.method653(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, this.anInt653, this.anInt649, local5, arg2, this, this.anInt645, arg4);
			} else {
				arg1 = Static650.method666(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, this.anInt646, local5, arg2, this, this.anInt645, arg4);
			}
			this.anInt651 -= arg1;
			if (this.anInt651 != 0) {
				return arg1;
			}
		} while (!this.method649());
		return arg3;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	public synchronized void method672(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt647 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "()Z")
	public boolean method673() {
		return this.anInt651 != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6002(@OriginalArg(0) int arg0) {
		if (this.anInt651 > 0) {
			if (arg0 >= this.anInt651) {
				if (this.anInt648 == Integer.MIN_VALUE) {
					this.anInt648 = 0;
					this.anInt643 = this.anInt650 = this.anInt642 = 0;
					this.method8671();
					arg0 = this.anInt651;
				}
				this.anInt651 = 0;
				this.method651();
			} else {
				this.anInt643 += this.anInt646 * arg0;
				this.anInt650 += this.anInt653 * arg0;
				this.anInt642 += this.anInt649 * arg0;
				this.anInt651 -= arg0;
			}
		}
		@Pc(71) Class3_Sub12_Sub1 local71 = (Class3_Sub12_Sub1) super.aClass3_Sub12_6;
		@Pc(76) int local76 = this.anInt652 << 8;
		@Pc(81) int local81 = this.anInt644 << 8;
		@Pc(87) int local87 = local71.aByteArray70.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt654 = 0;
		}
		if (this.anInt647 < 0) {
			if (this.anInt645 <= 0) {
				this.method679();
				this.method8671();
				return;
			}
			this.anInt647 = 0;
		}
		if (this.anInt647 >= local87) {
			if (this.anInt645 >= 0) {
				this.method679();
				this.method8671();
				return;
			}
			this.anInt647 = local87 - 1;
		}
		this.anInt647 += this.anInt645 * arg0;
		if (this.anInt654 >= 0) {
			if (this.anInt654 > 0) {
				if (this.aBoolean57) {
					label125: {
						if (this.anInt645 < 0) {
							if (this.anInt647 >= local76) {
								return;
							}
							this.anInt647 = local76 + local76 - this.anInt647 - 1;
							this.anInt645 = -this.anInt645;
							if (--this.anInt654 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt647 < local81) {
								return;
							}
							this.anInt647 = local81 + local81 - this.anInt647 - 1;
							this.anInt645 = -this.anInt645;
							if (--this.anInt654 == 0) {
								break;
							}
							if (this.anInt647 >= local76) {
								return;
							}
							this.anInt647 = local76 + local76 - this.anInt647 - 1;
							this.anInt645 = -this.anInt645;
						} while (--this.anInt654 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt645 < 0) {
						if (this.anInt647 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt647 - 1) / local91;
						if (local361 < this.anInt654) {
							this.anInt647 += local91 * local361;
							this.anInt654 -= local361;
							return;
						}
						this.anInt647 += local91 * this.anInt654;
						this.anInt654 = 0;
					} else if (this.anInt647 >= local81) {
						local361 = (this.anInt647 - local76) / local91;
						if (local361 < this.anInt654) {
							this.anInt647 -= local91 * local361;
							this.anInt654 -= local361;
							return;
						}
						this.anInt647 -= local91 * this.anInt654;
						this.anInt654 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt645 < 0) {
				if (this.anInt647 < 0) {
					this.anInt647 = -1;
					this.method679();
					this.method8671();
					return;
				}
			} else if (this.anInt647 >= local87) {
				this.anInt647 = local87;
				this.method679();
				this.method8671();
			}
		} else if (this.aBoolean57) {
			if (this.anInt645 < 0) {
				if (this.anInt647 >= local76) {
					return;
				}
				this.anInt647 = local76 + local76 - this.anInt647 - 1;
				this.anInt645 = -this.anInt645;
			}
			while (this.anInt647 >= local81) {
				this.anInt647 = local81 + local81 - this.anInt647 - 1;
				this.anInt645 = -this.anInt645;
				if (this.anInt647 >= local76) {
					return;
				}
				this.anInt647 = local76 + local76 - this.anInt647 - 1;
				this.anInt645 = -this.anInt645;
			}
		} else if (this.anInt645 < 0) {
			if (this.anInt647 < local76) {
				this.anInt647 = local81 - (local81 - 1 - this.anInt647) % local91 - 1;
			}
		} else if (this.anInt647 >= local81) {
			this.anInt647 = local76 + (this.anInt647 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "([IIIII)I")
	private int method674(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt651 <= 0) {
				if (this.anInt645 == 256 && (this.anInt647 & 0xFF) == 0) {
					if (Static457.aBoolean715) {
						return Static650.method671(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, arg3, arg2, this);
					}
					return Static650.method657(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, arg3, arg2, this);
				}
				if (Static457.aBoolean715) {
					return Static650.method659(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, arg3, arg2, this, this.anInt645, arg4);
				}
				return Static650.method648(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, arg3, arg2, this, this.anInt645, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt651;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt651 += arg1;
			if (this.anInt645 == 256 && (this.anInt647 & 0xFF) == 0) {
				if (Static457.aBoolean715) {
					arg1 = Static650.method654(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, this.anInt653, this.anInt649, local5, arg2, this);
				} else {
					arg1 = Static650.method683(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, this.anInt646, local5, arg2, this);
				}
			} else if (Static457.aBoolean715) {
				arg1 = Static650.method660(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt650, this.anInt642, this.anInt653, this.anInt649, local5, arg2, this, this.anInt645, arg4);
			} else {
				arg1 = Static650.method676(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray70, arg0, this.anInt647, arg1, this.anInt643, this.anInt646, local5, arg2, this, this.anInt645, arg4);
			}
			this.anInt651 -= arg1;
			if (this.anInt651 != 0) {
				return arg1;
			}
		} while (!this.method649());
		return arg3;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt648 == 0 && this.anInt651 == 0) {
			this.method6002(arg2);
			return;
		}
		@Pc(13) Class3_Sub12_Sub1 local13 = (Class3_Sub12_Sub1) super.aClass3_Sub12_6;
		@Pc(18) int local18 = this.anInt652 << 8;
		@Pc(23) int local23 = this.anInt644 << 8;
		@Pc(29) int local29 = local13.aByteArray70.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt654 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt647 < 0) {
			if (this.anInt645 <= 0) {
				this.method679();
				this.method8671();
				return;
			}
			this.anInt647 = 0;
		}
		if (this.anInt647 >= local29) {
			if (this.anInt645 >= 0) {
				this.method679();
				this.method8671();
				return;
			}
			this.anInt647 = local29 - 1;
		}
		if (this.anInt654 >= 0) {
			if (this.anInt654 > 0) {
				if (this.aBoolean57) {
					label130: {
						if (this.anInt645 < 0) {
							local40 = this.method670(arg0, arg1, local18, local44, local13.aByteArray70[this.anInt652]);
							if (this.anInt647 >= local18) {
								return;
							}
							this.anInt647 = local18 + local18 - this.anInt647 - 1;
							this.anInt645 = -this.anInt645;
							if (--this.anInt654 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method674(arg0, local40, local23, local44, local13.aByteArray70[this.anInt644 - 1]);
							if (this.anInt647 < local23) {
								return;
							}
							this.anInt647 = local23 + local23 - this.anInt647 - 1;
							this.anInt645 = -this.anInt645;
							if (--this.anInt654 == 0) {
								break;
							}
							local40 = this.method670(arg0, local40, local18, local44, local13.aByteArray70[this.anInt652]);
							if (this.anInt647 >= local18) {
								return;
							}
							this.anInt647 = local18 + local18 - this.anInt647 - 1;
							this.anInt645 = -this.anInt645;
						} while (--this.anInt654 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt645 < 0) {
						while (true) {
							local40 = this.method670(arg0, local40, local18, local44, local13.aByteArray70[this.anInt644 - 1]);
							if (this.anInt647 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt647 - 1) / local33;
							if (local416 >= this.anInt654) {
								this.anInt647 += local33 * this.anInt654;
								this.anInt654 = 0;
								break;
							}
							this.anInt647 += local33 * local416;
							this.anInt654 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method674(arg0, local40, local23, local44, local13.aByteArray70[this.anInt652]);
							if (this.anInt647 < local23) {
								return;
							}
							local416 = (this.anInt647 - local18) / local33;
							if (local416 >= this.anInt654) {
								this.anInt647 -= local33 * this.anInt654;
								this.anInt654 = 0;
								break;
							}
							this.anInt647 -= local33 * local416;
							this.anInt654 -= local416;
						}
					}
				}
			}
			if (this.anInt645 < 0) {
				this.method670(arg0, local40, 0, local44, 0);
				if (this.anInt647 < 0) {
					this.anInt647 = -1;
					this.method679();
					this.method8671();
					return;
				}
			} else {
				this.method674(arg0, local40, local29, local44, 0);
				if (this.anInt647 >= local29) {
					this.anInt647 = local29;
					this.method679();
					this.method8671();
				}
			}
		} else if (this.aBoolean57) {
			if (this.anInt645 < 0) {
				local40 = this.method670(arg0, arg1, local18, local44, local13.aByteArray70[this.anInt652]);
				if (this.anInt647 >= local18) {
					return;
				}
				this.anInt647 = local18 + local18 - this.anInt647 - 1;
				this.anInt645 = -this.anInt645;
			}
			while (true) {
				local40 = this.method674(arg0, local40, local23, local44, local13.aByteArray70[this.anInt644 - 1]);
				if (this.anInt647 < local23) {
					return;
				}
				this.anInt647 = local23 + local23 - this.anInt647 - 1;
				this.anInt645 = -this.anInt645;
				local40 = this.method670(arg0, local40, local18, local44, local13.aByteArray70[this.anInt652]);
				if (this.anInt647 >= local18) {
					return;
				}
				this.anInt647 = local18 + local18 - this.anInt647 - 1;
				this.anInt645 = -this.anInt645;
			}
		} else if (this.anInt645 < 0) {
			while (true) {
				local40 = this.method670(arg0, local40, local18, local44, local13.aByteArray70[this.anInt644 - 1]);
				if (this.anInt647 >= local18) {
					return;
				}
				this.anInt647 = local23 - (local23 - 1 - this.anInt647) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method674(arg0, local40, local23, local44, local13.aByteArray70[this.anInt652]);
				if (this.anInt647 < local23) {
					return;
				}
				this.anInt647 = local18 + (this.anInt647 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6005() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
	public synchronized void method677(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method667();
			this.method8671();
		} else if (this.anInt650 == 0 && this.anInt642 == 0) {
			this.anInt651 = 0;
			this.anInt648 = 0;
			this.anInt643 = 0;
			this.method8671();
		} else {
			@Pc(31) int local31 = -this.anInt643;
			if (this.anInt643 > local31) {
				local31 = this.anInt643;
			}
			if (-this.anInt650 > local31) {
				local31 = -this.anInt650;
			}
			if (this.anInt650 > local31) {
				local31 = this.anInt650;
			}
			if (-this.anInt642 > local31) {
				local31 = -this.anInt642;
			}
			if (this.anInt642 > local31) {
				local31 = this.anInt642;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt651 = arg0;
			this.anInt648 = Integer.MIN_VALUE;
			this.anInt646 = -this.anInt643 / arg0;
			this.anInt653 = -this.anInt650 / arg0;
			this.anInt649 = -this.anInt642 / arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public synchronized void method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method658(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static650.method652(arg1, arg2);
		@Pc(14) int local14 = Static650.method682(arg1, arg2);
		if (this.anInt650 == local10 && this.anInt642 == local14) {
			this.anInt651 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt643;
		if (this.anInt643 - arg1 > local31) {
			local31 = this.anInt643 - arg1;
		}
		if (local10 - this.anInt650 > local31) {
			local31 = local10 - this.anInt650;
		}
		if (this.anInt650 - local10 > local31) {
			local31 = this.anInt650 - local10;
		}
		if (local14 - this.anInt642 > local31) {
			local31 = local14 - this.anInt642;
		}
		if (this.anInt642 - local14 > local31) {
			local31 = this.anInt642 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt651 = arg0;
		this.anInt648 = arg1;
		this.anInt641 = arg2;
		this.anInt646 = (arg1 - this.anInt643) / arg0;
		this.anInt653 = (local10 - this.anInt650) / arg0;
		this.anInt649 = (local14 - this.anInt642) / arg0;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "()V")
	private void method679() {
		if (this.anInt651 == 0) {
			return;
		}
		if (this.anInt648 == Integer.MIN_VALUE) {
			this.anInt648 = 0;
		}
		this.anInt651 = 0;
		this.method651();
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "()I")
	public synchronized int method684() {
		return this.anInt648 == Integer.MIN_VALUE ? 0 : this.anInt648;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
	public synchronized void method685(@OriginalArg(0) int arg0) {
		if (this.anInt645 < 0) {
			this.anInt645 = -arg0;
		} else {
			this.anInt645 = arg0;
		}
	}
}
