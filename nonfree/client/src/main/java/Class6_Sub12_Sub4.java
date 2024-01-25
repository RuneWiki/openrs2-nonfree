import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class6_Sub12_Sub4 extends Class6_Sub12 {

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public int anInt6248;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public int anInt6249;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	public int anInt6250;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public int anInt6252;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	private int anInt6253;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	private int anInt6254;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	public int anInt6256;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	public int anInt6257;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	private final int anInt6245;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	private final int anInt6247;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
	private final boolean aBoolean417;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	private int anInt6258;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	private int anInt6246;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	private int anInt6255;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "I")
	public int anInt6251;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!hk;II)V")
	public Class6_Sub12_Sub4(@OriginalArg(0) Class6_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub11_5 = arg0;
		this.anInt6245 = arg0.anInt2220;
		this.anInt6247 = arg0.anInt2221;
		this.aBoolean417 = arg0.aBoolean188;
		this.anInt6258 = arg1;
		this.anInt6246 = arg2;
		this.anInt6255 = 8192;
		this.anInt6251 = 0;
		this.method5693();
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!hk;III)V")
	public Class6_Sub12_Sub4(@OriginalArg(0) Class6_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub11_5 = arg0;
		this.anInt6245 = arg0.anInt2220;
		this.anInt6247 = arg0.anInt2221;
		this.aBoolean417 = arg0.aBoolean188;
		this.anInt6258 = arg1;
		this.anInt6246 = arg2;
		this.anInt6255 = arg3;
		this.anInt6251 = 0;
		this.method5693();
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "()Z")
	public boolean method5660() {
		return this.anInt6251 < 0 || this.anInt6251 >= ((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47.length << 8;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "()I")
	public synchronized int method5663() {
		return this.anInt6255 < 0 ? -1 : this.anInt6255;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
	public synchronized void method5664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5677(arg0, arg1, this.method5663());
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5654(@OriginalArg(0) int arg0) {
		if (this.anInt6253 > 0) {
			if (arg0 >= this.anInt6253) {
				if (this.anInt6246 == Integer.MIN_VALUE) {
					this.anInt6246 = 0;
					this.anInt6249 = this.anInt6250 = this.anInt6256 = 0;
					this.method5756();
					arg0 = this.anInt6253;
				}
				this.anInt6253 = 0;
				this.method5693();
			} else {
				this.anInt6249 += this.anInt6257 * arg0;
				this.anInt6250 += this.anInt6248 * arg0;
				this.anInt6256 += this.anInt6252 * arg0;
				this.anInt6253 -= arg0;
			}
		}
		@Pc(71) Class6_Sub11_Sub1 local71 = (Class6_Sub11_Sub1) super.aClass6_Sub11_5;
		@Pc(76) int local76 = this.anInt6245 << 8;
		@Pc(81) int local81 = this.anInt6247 << 8;
		@Pc(87) int local87 = local71.aByteArray47.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6254 = 0;
		}
		if (this.anInt6251 < 0) {
			if (this.anInt6258 <= 0) {
				this.method5690();
				this.method5756();
				return;
			}
			this.anInt6251 = 0;
		}
		if (this.anInt6251 >= local87) {
			if (this.anInt6258 >= 0) {
				this.method5690();
				this.method5756();
				return;
			}
			this.anInt6251 = local87 - 1;
		}
		this.anInt6251 += this.anInt6258 * arg0;
		if (this.anInt6254 >= 0) {
			if (this.anInt6254 > 0) {
				if (this.aBoolean417) {
					label125: {
						if (this.anInt6258 < 0) {
							if (this.anInt6251 >= local76) {
								return;
							}
							this.anInt6251 = local76 + local76 - this.anInt6251 - 1;
							this.anInt6258 = -this.anInt6258;
							if (--this.anInt6254 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6251 < local81) {
								return;
							}
							this.anInt6251 = local81 + local81 - this.anInt6251 - 1;
							this.anInt6258 = -this.anInt6258;
							if (--this.anInt6254 == 0) {
								break;
							}
							if (this.anInt6251 >= local76) {
								return;
							}
							this.anInt6251 = local76 + local76 - this.anInt6251 - 1;
							this.anInt6258 = -this.anInt6258;
						} while (--this.anInt6254 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6258 < 0) {
						if (this.anInt6251 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6251 - 1) / local91;
						if (local361 < this.anInt6254) {
							this.anInt6251 += local91 * local361;
							this.anInt6254 -= local361;
							return;
						}
						this.anInt6251 += local91 * this.anInt6254;
						this.anInt6254 = 0;
					} else if (this.anInt6251 >= local81) {
						local361 = (this.anInt6251 - local76) / local91;
						if (local361 < this.anInt6254) {
							this.anInt6251 -= local91 * local361;
							this.anInt6254 -= local361;
							return;
						}
						this.anInt6251 -= local91 * this.anInt6254;
						this.anInt6254 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6258 < 0) {
				if (this.anInt6251 < 0) {
					this.anInt6251 = -1;
					this.method5690();
					this.method5756();
					return;
				}
			} else if (this.anInt6251 >= local87) {
				this.anInt6251 = local87;
				this.method5690();
				this.method5756();
			}
		} else if (this.aBoolean417) {
			if (this.anInt6258 < 0) {
				if (this.anInt6251 >= local76) {
					return;
				}
				this.anInt6251 = local76 + local76 - this.anInt6251 - 1;
				this.anInt6258 = -this.anInt6258;
			}
			while (this.anInt6251 >= local81) {
				this.anInt6251 = local81 + local81 - this.anInt6251 - 1;
				this.anInt6258 = -this.anInt6258;
				if (this.anInt6251 >= local76) {
					return;
				}
				this.anInt6251 = local76 + local76 - this.anInt6251 - 1;
				this.anInt6258 = -this.anInt6258;
			}
		} else if (this.anInt6258 < 0) {
			if (this.anInt6251 < local76) {
				this.anInt6251 = local81 - (local81 - 1 - this.anInt6251) % local91 - 1;
			}
		} else if (this.anInt6251 >= local81) {
			this.anInt6251 = local76 + (this.anInt6251 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public synchronized void method5670(@OriginalArg(0) int arg0) {
		this.method5682(arg0 << 6, this.method5663());
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "()Z")
	public boolean method5672() {
		return this.anInt6253 != 0;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "()I")
	@Override
	public int method5658() {
		@Pc(6) int local6 = this.anInt6249 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6254 == 0) {
			local6 -= local6 * this.anInt6251 / (((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47.length << 8);
		} else if (this.anInt6254 >= 0) {
			local6 -= local6 * this.anInt6245 / ((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "()I")
	public synchronized int method5673() {
		return this.anInt6246 == Integer.MIN_VALUE ? 0 : this.anInt6246;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([IIIII)I")
	private int method5674(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6253 <= 0) {
				if (this.anInt6258 == 256 && (this.anInt6251 & 0xFF) == 0) {
					if (Static16.aBoolean25) {
						return Static369.method5697(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, arg3, arg2, this);
					}
					return Static369.method5678(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, arg3, arg2, this);
				}
				if (Static16.aBoolean25) {
					return Static369.method5662(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, arg3, arg2, this, this.anInt6258, arg4);
				}
				return Static369.method5668(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, arg3, arg2, this, this.anInt6258, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6253;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6253 += arg1;
			if (this.anInt6258 == 256 && (this.anInt6251 & 0xFF) == 0) {
				if (Static16.aBoolean25) {
					arg1 = Static369.method5669(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, this.anInt6248, this.anInt6252, local5, arg2, this);
				} else {
					arg1 = Static369.method5681(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, this.anInt6257, local5, arg2, this);
				}
			} else if (Static16.aBoolean25) {
				arg1 = Static369.method5666(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, this.anInt6248, this.anInt6252, local5, arg2, this, this.anInt6258, arg4);
			} else {
				arg1 = Static369.method5679(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, this.anInt6257, local5, arg2, this, this.anInt6258, arg4);
			}
			this.anInt6253 -= arg1;
			if (this.anInt6253 != 0) {
				return arg1;
			}
		} while (!this.method5686());
		return arg3;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()Lclient!wm;")
	@Override
	public Class6_Sub12 method5655() {
		return null;
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
	public synchronized void method5675(@OriginalArg(0) int arg0) {
		this.anInt6254 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "()I")
	@Override
	public int method5656() {
		return this.anInt6246 == 0 && this.anInt6253 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6246 == 0 && this.anInt6253 == 0) {
			this.method5654(arg2);
			return;
		}
		@Pc(13) Class6_Sub11_Sub1 local13 = (Class6_Sub11_Sub1) super.aClass6_Sub11_5;
		@Pc(18) int local18 = this.anInt6245 << 8;
		@Pc(23) int local23 = this.anInt6247 << 8;
		@Pc(29) int local29 = local13.aByteArray47.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6254 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6251 < 0) {
			if (this.anInt6258 <= 0) {
				this.method5690();
				this.method5756();
				return;
			}
			this.anInt6251 = 0;
		}
		if (this.anInt6251 >= local29) {
			if (this.anInt6258 >= 0) {
				this.method5690();
				this.method5756();
				return;
			}
			this.anInt6251 = local29 - 1;
		}
		if (this.anInt6254 >= 0) {
			if (this.anInt6254 > 0) {
				if (this.aBoolean417) {
					label130: {
						if (this.anInt6258 < 0) {
							local40 = this.method5688(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt6245]);
							if (this.anInt6251 >= local18) {
								return;
							}
							this.anInt6251 = local18 + local18 - this.anInt6251 - 1;
							this.anInt6258 = -this.anInt6258;
							if (--this.anInt6254 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5674(arg0, local40, local23, local44, local13.aByteArray47[this.anInt6247 - 1]);
							if (this.anInt6251 < local23) {
								return;
							}
							this.anInt6251 = local23 + local23 - this.anInt6251 - 1;
							this.anInt6258 = -this.anInt6258;
							if (--this.anInt6254 == 0) {
								break;
							}
							local40 = this.method5688(arg0, local40, local18, local44, local13.aByteArray47[this.anInt6245]);
							if (this.anInt6251 >= local18) {
								return;
							}
							this.anInt6251 = local18 + local18 - this.anInt6251 - 1;
							this.anInt6258 = -this.anInt6258;
						} while (--this.anInt6254 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6258 < 0) {
						while (true) {
							local40 = this.method5688(arg0, local40, local18, local44, local13.aByteArray47[this.anInt6247 - 1]);
							if (this.anInt6251 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6251 - 1) / local33;
							if (local416 >= this.anInt6254) {
								this.anInt6251 += local33 * this.anInt6254;
								this.anInt6254 = 0;
								break;
							}
							this.anInt6251 += local33 * local416;
							this.anInt6254 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5674(arg0, local40, local23, local44, local13.aByteArray47[this.anInt6245]);
							if (this.anInt6251 < local23) {
								return;
							}
							local416 = (this.anInt6251 - local18) / local33;
							if (local416 >= this.anInt6254) {
								this.anInt6251 -= local33 * this.anInt6254;
								this.anInt6254 = 0;
								break;
							}
							this.anInt6251 -= local33 * local416;
							this.anInt6254 -= local416;
						}
					}
				}
			}
			if (this.anInt6258 < 0) {
				this.method5688(arg0, local40, 0, local44, 0);
				if (this.anInt6251 < 0) {
					this.anInt6251 = -1;
					this.method5690();
					this.method5756();
					return;
				}
			} else {
				this.method5674(arg0, local40, local29, local44, 0);
				if (this.anInt6251 >= local29) {
					this.anInt6251 = local29;
					this.method5690();
					this.method5756();
				}
			}
		} else if (this.aBoolean417) {
			if (this.anInt6258 < 0) {
				local40 = this.method5688(arg0, arg1, local18, local44, local13.aByteArray47[this.anInt6245]);
				if (this.anInt6251 >= local18) {
					return;
				}
				this.anInt6251 = local18 + local18 - this.anInt6251 - 1;
				this.anInt6258 = -this.anInt6258;
			}
			while (true) {
				local40 = this.method5674(arg0, local40, local23, local44, local13.aByteArray47[this.anInt6247 - 1]);
				if (this.anInt6251 < local23) {
					return;
				}
				this.anInt6251 = local23 + local23 - this.anInt6251 - 1;
				this.anInt6258 = -this.anInt6258;
				local40 = this.method5688(arg0, local40, local18, local44, local13.aByteArray47[this.anInt6245]);
				if (this.anInt6251 >= local18) {
					return;
				}
				this.anInt6251 = local18 + local18 - this.anInt6251 - 1;
				this.anInt6258 = -this.anInt6258;
			}
		} else if (this.anInt6258 < 0) {
			while (true) {
				local40 = this.method5688(arg0, local40, local18, local44, local13.aByteArray47[this.anInt6247 - 1]);
				if (this.anInt6251 >= local18) {
					return;
				}
				this.anInt6251 = local23 - (local23 - 1 - this.anInt6251) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5674(arg0, local40, local23, local44, local13.aByteArray47[this.anInt6245]);
				if (this.anInt6251 < local23) {
					return;
				}
				this.anInt6251 = local18 + (this.anInt6251 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public synchronized void method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5682(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static369.method5694(arg1, arg2);
		@Pc(14) int local14 = Static369.method5667(arg1, arg2);
		if (this.anInt6250 == local10 && this.anInt6256 == local14) {
			this.anInt6253 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6249;
		if (this.anInt6249 - arg1 > local31) {
			local31 = this.anInt6249 - arg1;
		}
		if (local10 - this.anInt6250 > local31) {
			local31 = local10 - this.anInt6250;
		}
		if (this.anInt6250 - local10 > local31) {
			local31 = this.anInt6250 - local10;
		}
		if (local14 - this.anInt6256 > local31) {
			local31 = local14 - this.anInt6256;
		}
		if (this.anInt6256 - local14 > local31) {
			local31 = this.anInt6256 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6253 = arg0;
		this.anInt6246 = arg1;
		this.anInt6255 = arg2;
		this.anInt6257 = (arg1 - this.anInt6249) / arg0;
		this.anInt6248 = (local10 - this.anInt6250) / arg0;
		this.anInt6252 = (local14 - this.anInt6256) / arg0;
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "()I")
	public synchronized int method5680() {
		return this.anInt6258 < 0 ? -this.anInt6258 : this.anInt6258;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)V")
	private synchronized void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6246 = arg0;
		this.anInt6255 = arg1;
		this.anInt6253 = 0;
		this.method5693();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public synchronized void method5683() {
		this.anInt6258 = (this.anInt6258 ^ this.anInt6258 >> 31) + (this.anInt6258 >>> 31);
		this.anInt6258 = -this.anInt6258;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	public synchronized void method5685(@OriginalArg(0) int arg0) {
		if (this.anInt6258 < 0) {
			this.anInt6258 = -arg0;
		} else {
			this.anInt6258 = arg0;
		}
	}

	@OriginalMember(owner = "client!we", name = "j", descriptor = "()Z")
	private boolean method5686() {
		@Pc(2) int local2 = this.anInt6246;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static369.method5694(local2, this.anInt6255);
			local8 = Static369.method5667(local2, this.anInt6255);
		}
		if (this.anInt6249 != local2 || this.anInt6250 != local10 || this.anInt6256 != local8) {
			if (this.anInt6249 < local2) {
				this.anInt6257 = 1;
				this.anInt6253 = local2 - this.anInt6249;
			} else if (this.anInt6249 > local2) {
				this.anInt6257 = -1;
				this.anInt6253 = this.anInt6249 - local2;
			} else {
				this.anInt6257 = 0;
			}
			if (this.anInt6250 < local10) {
				this.anInt6248 = 1;
				if (this.anInt6253 == 0 || this.anInt6253 > local10 - this.anInt6250) {
					this.anInt6253 = local10 - this.anInt6250;
				}
			} else if (this.anInt6250 > local10) {
				this.anInt6248 = -1;
				if (this.anInt6253 == 0 || this.anInt6253 > this.anInt6250 - local10) {
					this.anInt6253 = this.anInt6250 - local10;
				}
			} else {
				this.anInt6248 = 0;
			}
			if (this.anInt6256 < local8) {
				this.anInt6252 = 1;
				if (this.anInt6253 == 0 || this.anInt6253 > local8 - this.anInt6256) {
					this.anInt6253 = local8 - this.anInt6256;
				}
			} else if (this.anInt6256 > local8) {
				this.anInt6252 = -1;
				if (this.anInt6253 == 0 || this.anInt6253 > this.anInt6256 - local8) {
					this.anInt6253 = this.anInt6256 - local8;
				}
			} else {
				this.anInt6252 = 0;
			}
			return false;
		} else if (this.anInt6246 == Integer.MIN_VALUE) {
			this.anInt6246 = 0;
			this.anInt6249 = this.anInt6250 = this.anInt6256 = 0;
			this.method5756();
			return true;
		} else {
			this.method5693();
			return false;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "([IIIII)I")
	private int method5688(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6253 <= 0) {
				if (this.anInt6258 == -256 && (this.anInt6251 & 0xFF) == 0) {
					if (Static16.aBoolean25) {
						return Static369.method5684(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, arg3, arg2, this);
					}
					return Static369.method5689(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, arg3, arg2, this);
				}
				if (Static16.aBoolean25) {
					return Static369.method5659(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, arg3, arg2, this, this.anInt6258, arg4);
				}
				return Static369.method5665(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, arg3, arg2, this, this.anInt6258, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6253;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6253 += arg1;
			if (this.anInt6258 == -256 && (this.anInt6251 & 0xFF) == 0) {
				if (Static16.aBoolean25) {
					arg1 = Static369.method5671(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, this.anInt6248, this.anInt6252, local5, arg2, this);
				} else {
					arg1 = Static369.method5692(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, this.anInt6257, local5, arg2, this);
				}
			} else if (Static16.aBoolean25) {
				arg1 = Static369.method5687(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6250, this.anInt6256, this.anInt6248, this.anInt6252, local5, arg2, this, this.anInt6258, arg4);
			} else {
				arg1 = Static369.method5676(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47, arg0, this.anInt6251, arg1, this.anInt6249, this.anInt6257, local5, arg2, this, this.anInt6258, arg4);
			}
			this.anInt6253 -= arg1;
			if (this.anInt6253 != 0) {
				return arg1;
			}
		} while (!this.method5686());
		return arg3;
	}

	@OriginalMember(owner = "client!we", name = "k", descriptor = "()V")
	private void method5690() {
		if (this.anInt6253 == 0) {
			return;
		}
		if (this.anInt6246 == Integer.MIN_VALUE) {
			this.anInt6246 = 0;
		}
		this.anInt6253 = 0;
		this.method5693();
	}

	@OriginalMember(owner = "client!we", name = "l", descriptor = "()V")
	private void method5693() {
		this.anInt6249 = this.anInt6246;
		this.anInt6250 = Static369.method5694(this.anInt6246, this.anInt6255);
		this.anInt6256 = Static369.method5667(this.anInt6246, this.anInt6255);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()Lclient!wm;")
	@Override
	public Class6_Sub12 method5652() {
		return null;
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
	public synchronized void method5695(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5698();
			this.method5756();
		} else if (this.anInt6250 == 0 && this.anInt6256 == 0) {
			this.anInt6253 = 0;
			this.anInt6246 = 0;
			this.anInt6249 = 0;
			this.method5756();
		} else {
			@Pc(31) int local31 = -this.anInt6249;
			if (this.anInt6249 > local31) {
				local31 = this.anInt6249;
			}
			if (-this.anInt6250 > local31) {
				local31 = -this.anInt6250;
			}
			if (this.anInt6250 > local31) {
				local31 = this.anInt6250;
			}
			if (-this.anInt6256 > local31) {
				local31 = -this.anInt6256;
			}
			if (this.anInt6256 > local31) {
				local31 = this.anInt6256;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6253 = arg0;
			this.anInt6246 = Integer.MIN_VALUE;
			this.anInt6257 = -this.anInt6249 / arg0;
			this.anInt6248 = -this.anInt6250 / arg0;
			this.anInt6252 = -this.anInt6256 / arg0;
		}
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
	public synchronized void method5696(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray47.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6251 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "(I)V")
	private synchronized void method5698() {
		this.method5682(0, this.method5663());
	}
}
