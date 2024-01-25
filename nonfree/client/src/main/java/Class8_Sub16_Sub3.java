import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class8_Sub16_Sub3 extends Class8_Sub16 {

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
	public int anInt8210;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	private int anInt8212;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public int anInt8213;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
	public int anInt8215;

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
	private int anInt8219;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
	public int anInt8220;

	@OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
	public int anInt8222;

	@OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
	public int anInt8223;

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
	private final int anInt8216;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
	private final int anInt8217;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "Z")
	private final boolean aBoolean590;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	private int anInt8218;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
	private int anInt8221;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	private int anInt8211;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
	public int anInt8214;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!cba;III)V")
	public Class8_Sub16_Sub3(@OriginalArg(0) Class8_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass8_Sub9_6 = arg0;
		this.anInt8216 = arg0.anInt1948;
		this.anInt8217 = arg0.anInt1946;
		this.aBoolean590 = arg0.aBoolean132;
		this.anInt8218 = arg1;
		this.anInt8221 = arg2;
		this.anInt8211 = arg3;
		this.anInt8214 = 0;
		this.method6777();
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "()I")
	public synchronized int method6755() {
		return this.anInt8211 < 0 ? -1 : this.anInt8211;
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "()Z")
	private boolean method6757() {
		@Pc(2) int local2 = this.anInt8221;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static651.method6786(local2, this.anInt8211);
			local8 = Static651.method6756(local2, this.anInt8211);
		}
		if (this.anInt8213 != local2 || this.anInt8215 != local10 || this.anInt8220 != local8) {
			if (this.anInt8213 < local2) {
				this.anInt8210 = 1;
				this.anInt8219 = local2 - this.anInt8213;
			} else if (this.anInt8213 > local2) {
				this.anInt8210 = -1;
				this.anInt8219 = this.anInt8213 - local2;
			} else {
				this.anInt8210 = 0;
			}
			if (this.anInt8215 < local10) {
				this.anInt8222 = 1;
				if (this.anInt8219 == 0 || this.anInt8219 > local10 - this.anInt8215) {
					this.anInt8219 = local10 - this.anInt8215;
				}
			} else if (this.anInt8215 > local10) {
				this.anInt8222 = -1;
				if (this.anInt8219 == 0 || this.anInt8219 > this.anInt8215 - local10) {
					this.anInt8219 = this.anInt8215 - local10;
				}
			} else {
				this.anInt8222 = 0;
			}
			if (this.anInt8220 < local8) {
				this.anInt8223 = 1;
				if (this.anInt8219 == 0 || this.anInt8219 > local8 - this.anInt8220) {
					this.anInt8219 = local8 - this.anInt8220;
				}
			} else if (this.anInt8220 > local8) {
				this.anInt8223 = -1;
				if (this.anInt8219 == 0 || this.anInt8219 > this.anInt8220 - local8) {
					this.anInt8219 = this.anInt8220 - local8;
				}
			} else {
				this.anInt8223 = 0;
			}
			return false;
		} else if (this.anInt8221 == Integer.MIN_VALUE) {
			this.anInt8221 = 0;
			this.anInt8213 = this.anInt8215 = this.anInt8220 = 0;
			this.method8640();
			return true;
		} else {
			this.method6777();
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "()I")
	@Override
	public int method7432() {
		@Pc(6) int local6 = this.anInt8213 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt8212 == 0) {
			local6 -= local6 * this.anInt8214 / (((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8.length << 8);
		} else if (this.anInt8212 >= 0) {
			local6 -= local6 * this.anInt8216 / ((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
	public synchronized void method6759(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6780();
			this.method8640();
		} else if (this.anInt8215 == 0 && this.anInt8220 == 0) {
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			this.anInt8213 = 0;
			this.method8640();
		} else {
			@Pc(31) int local31 = -this.anInt8213;
			if (this.anInt8213 > local31) {
				local31 = this.anInt8213;
			}
			if (-this.anInt8215 > local31) {
				local31 = -this.anInt8215;
			}
			if (this.anInt8215 > local31) {
				local31 = this.anInt8215;
			}
			if (-this.anInt8220 > local31) {
				local31 = -this.anInt8220;
			}
			if (this.anInt8220 > local31) {
				local31 = this.anInt8220;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt8219 = arg0;
			this.anInt8221 = Integer.MIN_VALUE;
			this.anInt8210 = -this.anInt8213 / arg0;
			this.anInt8222 = -this.anInt8215 / arg0;
			this.anInt8223 = -this.anInt8220 / arg0;
		}
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "()V")
	private void method6760() {
		if (this.anInt8219 == 0) {
			return;
		}
		if (this.anInt8221 == Integer.MIN_VALUE) {
			this.anInt8221 = 0;
		}
		this.anInt8219 = 0;
		this.method6777();
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
	public synchronized void method6762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6771(arg0, arg1, this.method6755());
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "()I")
	public synchronized int method6764() {
		return this.anInt8218 < 0 ? -this.anInt8218 : this.anInt8218;
	}

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "()Z")
	public boolean method6765() {
		return this.anInt8219 != 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7435(@OriginalArg(0) int arg0) {
		if (this.anInt8219 > 0) {
			if (arg0 >= this.anInt8219) {
				if (this.anInt8221 == Integer.MIN_VALUE) {
					this.anInt8221 = 0;
					this.anInt8213 = this.anInt8215 = this.anInt8220 = 0;
					this.method8640();
					arg0 = this.anInt8219;
				}
				this.anInt8219 = 0;
				this.method6777();
			} else {
				this.anInt8213 += this.anInt8210 * arg0;
				this.anInt8215 += this.anInt8222 * arg0;
				this.anInt8220 += this.anInt8223 * arg0;
				this.anInt8219 -= arg0;
			}
		}
		@Pc(71) Class8_Sub9_Sub1 local71 = (Class8_Sub9_Sub1) super.aClass8_Sub9_6;
		@Pc(76) int local76 = this.anInt8216 << 8;
		@Pc(81) int local81 = this.anInt8217 << 8;
		@Pc(87) int local87 = local71.aByteArray8.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt8212 = 0;
		}
		if (this.anInt8214 < 0) {
			if (this.anInt8218 <= 0) {
				this.method6760();
				this.method8640();
				return;
			}
			this.anInt8214 = 0;
		}
		if (this.anInt8214 >= local87) {
			if (this.anInt8218 >= 0) {
				this.method6760();
				this.method8640();
				return;
			}
			this.anInt8214 = local87 - 1;
		}
		this.anInt8214 += this.anInt8218 * arg0;
		if (this.anInt8212 >= 0) {
			if (this.anInt8212 > 0) {
				if (this.aBoolean590) {
					label125: {
						if (this.anInt8218 < 0) {
							if (this.anInt8214 >= local76) {
								return;
							}
							this.anInt8214 = local76 + local76 - this.anInt8214 - 1;
							this.anInt8218 = -this.anInt8218;
							if (--this.anInt8212 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt8214 < local81) {
								return;
							}
							this.anInt8214 = local81 + local81 - this.anInt8214 - 1;
							this.anInt8218 = -this.anInt8218;
							if (--this.anInt8212 == 0) {
								break;
							}
							if (this.anInt8214 >= local76) {
								return;
							}
							this.anInt8214 = local76 + local76 - this.anInt8214 - 1;
							this.anInt8218 = -this.anInt8218;
						} while (--this.anInt8212 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt8218 < 0) {
						if (this.anInt8214 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt8214 - 1) / local91;
						if (local361 < this.anInt8212) {
							this.anInt8214 += local91 * local361;
							this.anInt8212 -= local361;
							return;
						}
						this.anInt8214 += local91 * this.anInt8212;
						this.anInt8212 = 0;
					} else if (this.anInt8214 >= local81) {
						local361 = (this.anInt8214 - local76) / local91;
						if (local361 < this.anInt8212) {
							this.anInt8214 -= local91 * local361;
							this.anInt8212 -= local361;
							return;
						}
						this.anInt8214 -= local91 * this.anInt8212;
						this.anInt8212 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt8218 < 0) {
				if (this.anInt8214 < 0) {
					this.anInt8214 = -1;
					this.method6760();
					this.method8640();
					return;
				}
			} else if (this.anInt8214 >= local87) {
				this.anInt8214 = local87;
				this.method6760();
				this.method8640();
			}
		} else if (this.aBoolean590) {
			if (this.anInt8218 < 0) {
				if (this.anInt8214 >= local76) {
					return;
				}
				this.anInt8214 = local76 + local76 - this.anInt8214 - 1;
				this.anInt8218 = -this.anInt8218;
			}
			while (this.anInt8214 >= local81) {
				this.anInt8214 = local81 + local81 - this.anInt8214 - 1;
				this.anInt8218 = -this.anInt8218;
				if (this.anInt8214 >= local76) {
					return;
				}
				this.anInt8214 = local76 + local76 - this.anInt8214 - 1;
				this.anInt8218 = -this.anInt8218;
			}
		} else if (this.anInt8218 < 0) {
			if (this.anInt8214 < local76) {
				this.anInt8214 = local81 - (local81 - 1 - this.anInt8214) % local91 - 1;
			}
		} else if (this.anInt8214 >= local81) {
			this.anInt8214 = local76 + (this.anInt8214 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([IIIII)I")
	private int method6767(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt8219 <= 0) {
				if (this.anInt8218 == -256 && (this.anInt8214 & 0xFF) == 0) {
					if (Static343.aBoolean463) {
						return Static651.method6758(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, arg3, arg2, this);
					}
					return Static651.method6763(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, arg3, arg2, this);
				}
				if (Static343.aBoolean463) {
					return Static651.method6770(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, arg3, arg2, this, this.anInt8218, arg4);
				}
				return Static651.method6783(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, arg3, arg2, this, this.anInt8218, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt8219;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt8219 += arg1;
			if (this.anInt8218 == -256 && (this.anInt8214 & 0xFF) == 0) {
				if (Static343.aBoolean463) {
					arg1 = Static651.method6785(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, this.anInt8222, this.anInt8223, local5, arg2, this);
				} else {
					arg1 = Static651.method6761(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, this.anInt8210, local5, arg2, this);
				}
			} else if (Static343.aBoolean463) {
				arg1 = Static651.method6772(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, this.anInt8222, this.anInt8223, local5, arg2, this, this.anInt8218, arg4);
			} else {
				arg1 = Static651.method6791(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, this.anInt8210, local5, arg2, this, this.anInt8218, arg4);
			}
			this.anInt8219 -= arg1;
			if (this.anInt8219 != 0) {
				return arg1;
			}
		} while (!this.method6757());
		return arg3;
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
	public synchronized void method6768(@OriginalArg(0) int arg0) {
		this.method6790(this.method6779(), arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
	public synchronized void method6769() {
		this.anInt8218 = (this.anInt8218 ^ this.anInt8218 >> 31) + (this.anInt8218 >>> 31);
		this.anInt8218 = -this.anInt8218;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
	public synchronized void method6771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6790(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static651.method6786(arg1, arg2);
		@Pc(14) int local14 = Static651.method6756(arg1, arg2);
		if (this.anInt8215 == local10 && this.anInt8220 == local14) {
			this.anInt8219 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt8213;
		if (this.anInt8213 - arg1 > local31) {
			local31 = this.anInt8213 - arg1;
		}
		if (local10 - this.anInt8215 > local31) {
			local31 = local10 - this.anInt8215;
		}
		if (this.anInt8215 - local10 > local31) {
			local31 = this.anInt8215 - local10;
		}
		if (local14 - this.anInt8220 > local31) {
			local31 = local14 - this.anInt8220;
		}
		if (this.anInt8220 - local14 > local31) {
			local31 = this.anInt8220 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt8219 = arg0;
		this.anInt8221 = arg1;
		this.anInt8211 = arg2;
		this.anInt8210 = (arg1 - this.anInt8213) / arg0;
		this.anInt8222 = (local10 - this.anInt8215) / arg0;
		this.anInt8223 = (local14 - this.anInt8220) / arg0;
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)V")
	public synchronized void method6773(@OriginalArg(0) int arg0) {
		this.anInt8212 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)V")
	public synchronized void method6774(@OriginalArg(0) int arg0) {
		if (this.anInt8218 < 0) {
			this.anInt8218 = -arg0;
		} else {
			this.anInt8218 = arg0;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8221 == 0 && this.anInt8219 == 0) {
			this.method7435(arg2);
			return;
		}
		@Pc(13) Class8_Sub9_Sub1 local13 = (Class8_Sub9_Sub1) super.aClass8_Sub9_6;
		@Pc(18) int local18 = this.anInt8216 << 8;
		@Pc(23) int local23 = this.anInt8217 << 8;
		@Pc(29) int local29 = local13.aByteArray8.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt8212 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt8214 < 0) {
			if (this.anInt8218 <= 0) {
				this.method6760();
				this.method8640();
				return;
			}
			this.anInt8214 = 0;
		}
		if (this.anInt8214 >= local29) {
			if (this.anInt8218 >= 0) {
				this.method6760();
				this.method8640();
				return;
			}
			this.anInt8214 = local29 - 1;
		}
		if (this.anInt8212 >= 0) {
			if (this.anInt8212 > 0) {
				if (this.aBoolean590) {
					label130: {
						if (this.anInt8218 < 0) {
							local40 = this.method6767(arg0, arg1, local18, local44, local13.aByteArray8[this.anInt8216]);
							if (this.anInt8214 >= local18) {
								return;
							}
							this.anInt8214 = local18 + local18 - this.anInt8214 - 1;
							this.anInt8218 = -this.anInt8218;
							if (--this.anInt8212 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6793(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8217 - 1]);
							if (this.anInt8214 < local23) {
								return;
							}
							this.anInt8214 = local23 + local23 - this.anInt8214 - 1;
							this.anInt8218 = -this.anInt8218;
							if (--this.anInt8212 == 0) {
								break;
							}
							local40 = this.method6767(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8216]);
							if (this.anInt8214 >= local18) {
								return;
							}
							this.anInt8214 = local18 + local18 - this.anInt8214 - 1;
							this.anInt8218 = -this.anInt8218;
						} while (--this.anInt8212 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt8218 < 0) {
						while (true) {
							local40 = this.method6767(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8217 - 1]);
							if (this.anInt8214 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt8214 - 1) / local33;
							if (local416 >= this.anInt8212) {
								this.anInt8214 += local33 * this.anInt8212;
								this.anInt8212 = 0;
								break;
							}
							this.anInt8214 += local33 * local416;
							this.anInt8212 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6793(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8216]);
							if (this.anInt8214 < local23) {
								return;
							}
							local416 = (this.anInt8214 - local18) / local33;
							if (local416 >= this.anInt8212) {
								this.anInt8214 -= local33 * this.anInt8212;
								this.anInt8212 = 0;
								break;
							}
							this.anInt8214 -= local33 * local416;
							this.anInt8212 -= local416;
						}
					}
				}
			}
			if (this.anInt8218 < 0) {
				this.method6767(arg0, local40, 0, local44, 0);
				if (this.anInt8214 < 0) {
					this.anInt8214 = -1;
					this.method6760();
					this.method8640();
					return;
				}
			} else {
				this.method6793(arg0, local40, local29, local44, 0);
				if (this.anInt8214 >= local29) {
					this.anInt8214 = local29;
					this.method6760();
					this.method8640();
				}
			}
		} else if (this.aBoolean590) {
			if (this.anInt8218 < 0) {
				local40 = this.method6767(arg0, arg1, local18, local44, local13.aByteArray8[this.anInt8216]);
				if (this.anInt8214 >= local18) {
					return;
				}
				this.anInt8214 = local18 + local18 - this.anInt8214 - 1;
				this.anInt8218 = -this.anInt8218;
			}
			while (true) {
				local40 = this.method6793(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8217 - 1]);
				if (this.anInt8214 < local23) {
					return;
				}
				this.anInt8214 = local23 + local23 - this.anInt8214 - 1;
				this.anInt8218 = -this.anInt8218;
				local40 = this.method6767(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8216]);
				if (this.anInt8214 >= local18) {
					return;
				}
				this.anInt8214 = local18 + local18 - this.anInt8214 - 1;
				this.anInt8218 = -this.anInt8218;
			}
		} else if (this.anInt8218 < 0) {
			while (true) {
				local40 = this.method6767(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8217 - 1]);
				if (this.anInt8214 >= local18) {
					return;
				}
				this.anInt8214 = local23 - (local23 - 1 - this.anInt8214) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6793(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8216]);
				if (this.anInt8214 < local23) {
					return;
				}
				this.anInt8214 = local18 + (this.anInt8214 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "()V")
	private void method6777() {
		this.anInt8213 = this.anInt8221;
		this.anInt8215 = Static651.method6786(this.anInt8221, this.anInt8211);
		this.anInt8220 = Static651.method6756(this.anInt8221, this.anInt8211);
	}

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "()I")
	public synchronized int method6779() {
		return this.anInt8221 == Integer.MIN_VALUE ? 0 : this.anInt8221;
	}

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "(I)V")
	private synchronized void method6780() {
		this.method6790(0, this.method6755());
	}

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "(I)V")
	public synchronized void method6781(@OriginalArg(0) int arg0) {
		this.method6790(arg0 << 6, this.method6755());
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "()I")
	@Override
	public int method7431() {
		return this.anInt8221 == 0 && this.anInt8219 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "(I)V")
	public synchronized void method6787(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt8214 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(II)V")
	private synchronized void method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8221 = arg0;
		this.anInt8211 = arg1;
		this.anInt8219 = 0;
		this.method6777();
	}

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "()Z")
	public boolean method6792() {
		return this.anInt8214 < 0 || this.anInt8214 >= ((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8.length << 8;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7434() {
		return null;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "([IIIII)I")
	private int method6793(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt8219 <= 0) {
				if (this.anInt8218 == 256 && (this.anInt8214 & 0xFF) == 0) {
					if (Static343.aBoolean463) {
						return Static651.method6789(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, arg3, arg2, this);
					}
					return Static651.method6776(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, arg3, arg2, this);
				}
				if (Static343.aBoolean463) {
					return Static651.method6784(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, arg3, arg2, this, this.anInt8218, arg4);
				}
				return Static651.method6766(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, arg3, arg2, this, this.anInt8218, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt8219;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt8219 += arg1;
			if (this.anInt8218 == 256 && (this.anInt8214 & 0xFF) == 0) {
				if (Static343.aBoolean463) {
					arg1 = Static651.method6794(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, this.anInt8222, this.anInt8223, local5, arg2, this);
				} else {
					arg1 = Static651.method6788(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, this.anInt8210, local5, arg2, this);
				}
			} else if (Static343.aBoolean463) {
				arg1 = Static651.method6778(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8215, this.anInt8220, this.anInt8222, this.anInt8223, local5, arg2, this, this.anInt8218, arg4);
			} else {
				arg1 = Static651.method6775(((Class8_Sub9_Sub1) super.aClass8_Sub9_6).aByteArray8, arg0, this.anInt8214, arg1, this.anInt8213, this.anInt8210, local5, arg2, this, this.anInt8218, arg4);
			}
			this.anInt8219 -= arg1;
			if (this.anInt8219 != 0) {
				return arg1;
			}
		} while (!this.method6757());
		return arg3;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7429() {
		return null;
	}
}
