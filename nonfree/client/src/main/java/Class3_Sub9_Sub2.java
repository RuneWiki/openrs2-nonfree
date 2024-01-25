import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	public int anInt6364;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	private int anInt6365;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public int anInt6366;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	public int anInt6367;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	private int anInt6373;

	@OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
	public int anInt6374;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
	public int anInt6375;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	private final int anInt6363;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
	private final int anInt6371;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "Z")
	private final boolean aBoolean407;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
	private int anInt6372;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	private int anInt6369;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	private int anInt6370;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	public int anInt6368;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!te;II)V")
	public Class3_Sub9_Sub2(@OriginalArg(0) Class3_Sub42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub42_5 = arg0;
		this.anInt6363 = arg0.anInt8317;
		this.anInt6371 = arg0.anInt8319;
		this.aBoolean407 = arg0.aBoolean589;
		this.anInt6372 = arg1;
		this.anInt6369 = arg2;
		this.anInt6370 = 8192;
		this.anInt6368 = 0;
		this.method5369();
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!te;III)V")
	public Class3_Sub9_Sub2(@OriginalArg(0) Class3_Sub42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub42_5 = arg0;
		this.anInt6363 = arg0.anInt8317;
		this.anInt6371 = arg0.anInt8319;
		this.aBoolean407 = arg0.aBoolean589;
		this.anInt6372 = arg1;
		this.anInt6369 = arg2;
		this.anInt6370 = arg3;
		this.anInt6368 = 0;
		this.method5369();
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V")
	public synchronized void method5337() {
		this.anInt6372 = (this.anInt6372 ^ this.anInt6372 >> 31) + (this.anInt6372 >>> 31);
		this.anInt6372 = -this.anInt6372;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6369 == 0 && this.anInt6373 == 0) {
			this.method6931(arg2);
			return;
		}
		@Pc(13) Class3_Sub42_Sub1 local13 = (Class3_Sub42_Sub1) super.aClass3_Sub42_5;
		@Pc(18) int local18 = this.anInt6363 << 8;
		@Pc(23) int local23 = this.anInt6371 << 8;
		@Pc(29) int local29 = local13.aByteArray97.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6365 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6368 < 0) {
			if (this.anInt6372 <= 0) {
				this.method5372();
				this.method7820();
				return;
			}
			this.anInt6368 = 0;
		}
		if (this.anInt6368 >= local29) {
			if (this.anInt6372 >= 0) {
				this.method5372();
				this.method7820();
				return;
			}
			this.anInt6368 = local29 - 1;
		}
		if (this.anInt6365 >= 0) {
			if (this.anInt6365 > 0) {
				if (this.aBoolean407) {
					label130: {
						if (this.anInt6372 < 0) {
							local40 = this.method5370(arg0, arg1, local18, local44, local13.aByteArray97[this.anInt6363]);
							if (this.anInt6368 >= local18) {
								return;
							}
							this.anInt6368 = local18 + local18 - this.anInt6368 - 1;
							this.anInt6372 = -this.anInt6372;
							if (--this.anInt6365 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5351(arg0, local40, local23, local44, local13.aByteArray97[this.anInt6371 - 1]);
							if (this.anInt6368 < local23) {
								return;
							}
							this.anInt6368 = local23 + local23 - this.anInt6368 - 1;
							this.anInt6372 = -this.anInt6372;
							if (--this.anInt6365 == 0) {
								break;
							}
							local40 = this.method5370(arg0, local40, local18, local44, local13.aByteArray97[this.anInt6363]);
							if (this.anInt6368 >= local18) {
								return;
							}
							this.anInt6368 = local18 + local18 - this.anInt6368 - 1;
							this.anInt6372 = -this.anInt6372;
						} while (--this.anInt6365 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6372 < 0) {
						while (true) {
							local40 = this.method5370(arg0, local40, local18, local44, local13.aByteArray97[this.anInt6371 - 1]);
							if (this.anInt6368 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6368 - 1) / local33;
							if (local416 >= this.anInt6365) {
								this.anInt6368 += local33 * this.anInt6365;
								this.anInt6365 = 0;
								break;
							}
							this.anInt6368 += local33 * local416;
							this.anInt6365 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5351(arg0, local40, local23, local44, local13.aByteArray97[this.anInt6363]);
							if (this.anInt6368 < local23) {
								return;
							}
							local416 = (this.anInt6368 - local18) / local33;
							if (local416 >= this.anInt6365) {
								this.anInt6368 -= local33 * this.anInt6365;
								this.anInt6365 = 0;
								break;
							}
							this.anInt6368 -= local33 * local416;
							this.anInt6365 -= local416;
						}
					}
				}
			}
			if (this.anInt6372 < 0) {
				this.method5370(arg0, local40, 0, local44, 0);
				if (this.anInt6368 < 0) {
					this.anInt6368 = -1;
					this.method5372();
					this.method7820();
					return;
				}
			} else {
				this.method5351(arg0, local40, local29, local44, 0);
				if (this.anInt6368 >= local29) {
					this.anInt6368 = local29;
					this.method5372();
					this.method7820();
				}
			}
		} else if (this.aBoolean407) {
			if (this.anInt6372 < 0) {
				local40 = this.method5370(arg0, arg1, local18, local44, local13.aByteArray97[this.anInt6363]);
				if (this.anInt6368 >= local18) {
					return;
				}
				this.anInt6368 = local18 + local18 - this.anInt6368 - 1;
				this.anInt6372 = -this.anInt6372;
			}
			while (true) {
				local40 = this.method5351(arg0, local40, local23, local44, local13.aByteArray97[this.anInt6371 - 1]);
				if (this.anInt6368 < local23) {
					return;
				}
				this.anInt6368 = local23 + local23 - this.anInt6368 - 1;
				this.anInt6372 = -this.anInt6372;
				local40 = this.method5370(arg0, local40, local18, local44, local13.aByteArray97[this.anInt6363]);
				if (this.anInt6368 >= local18) {
					return;
				}
				this.anInt6368 = local18 + local18 - this.anInt6368 - 1;
				this.anInt6372 = -this.anInt6372;
			}
		} else if (this.anInt6372 < 0) {
			while (true) {
				local40 = this.method5370(arg0, local40, local18, local44, local13.aByteArray97[this.anInt6371 - 1]);
				if (this.anInt6368 >= local18) {
					return;
				}
				this.anInt6368 = local23 - (local23 - 1 - this.anInt6368) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5351(arg0, local40, local23, local44, local13.aByteArray97[this.anInt6363]);
				if (this.anInt6368 < local23) {
					return;
				}
				this.anInt6368 = local18 + (this.anInt6368 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "(I)V")
	public synchronized void method5339(@OriginalArg(0) int arg0) {
		this.method5364(arg0 << 6, this.method5362());
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "()Lclient!bk;")
	@Override
	public Class3_Sub9 method6929() {
		return null;
	}

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "()Z")
	public boolean method5341() {
		return this.anInt6368 < 0 || this.anInt6368 >= ((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97.length << 8;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6931(@OriginalArg(0) int arg0) {
		if (this.anInt6373 > 0) {
			if (arg0 >= this.anInt6373) {
				if (this.anInt6369 == Integer.MIN_VALUE) {
					this.anInt6369 = 0;
					this.anInt6366 = this.anInt6364 = this.anInt6375 = 0;
					this.method7820();
					arg0 = this.anInt6373;
				}
				this.anInt6373 = 0;
				this.method5369();
			} else {
				this.anInt6366 += this.anInt6374 * arg0;
				this.anInt6364 += this.anInt6367 * arg0;
				this.anInt6375 += this.anInt6362 * arg0;
				this.anInt6373 -= arg0;
			}
		}
		@Pc(71) Class3_Sub42_Sub1 local71 = (Class3_Sub42_Sub1) super.aClass3_Sub42_5;
		@Pc(76) int local76 = this.anInt6363 << 8;
		@Pc(81) int local81 = this.anInt6371 << 8;
		@Pc(87) int local87 = local71.aByteArray97.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6365 = 0;
		}
		if (this.anInt6368 < 0) {
			if (this.anInt6372 <= 0) {
				this.method5372();
				this.method7820();
				return;
			}
			this.anInt6368 = 0;
		}
		if (this.anInt6368 >= local87) {
			if (this.anInt6372 >= 0) {
				this.method5372();
				this.method7820();
				return;
			}
			this.anInt6368 = local87 - 1;
		}
		this.anInt6368 += this.anInt6372 * arg0;
		if (this.anInt6365 >= 0) {
			if (this.anInt6365 > 0) {
				if (this.aBoolean407) {
					label125: {
						if (this.anInt6372 < 0) {
							if (this.anInt6368 >= local76) {
								return;
							}
							this.anInt6368 = local76 + local76 - this.anInt6368 - 1;
							this.anInt6372 = -this.anInt6372;
							if (--this.anInt6365 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6368 < local81) {
								return;
							}
							this.anInt6368 = local81 + local81 - this.anInt6368 - 1;
							this.anInt6372 = -this.anInt6372;
							if (--this.anInt6365 == 0) {
								break;
							}
							if (this.anInt6368 >= local76) {
								return;
							}
							this.anInt6368 = local76 + local76 - this.anInt6368 - 1;
							this.anInt6372 = -this.anInt6372;
						} while (--this.anInt6365 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6372 < 0) {
						if (this.anInt6368 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6368 - 1) / local91;
						if (local361 < this.anInt6365) {
							this.anInt6368 += local91 * local361;
							this.anInt6365 -= local361;
							return;
						}
						this.anInt6368 += local91 * this.anInt6365;
						this.anInt6365 = 0;
					} else if (this.anInt6368 >= local81) {
						local361 = (this.anInt6368 - local76) / local91;
						if (local361 < this.anInt6365) {
							this.anInt6368 -= local91 * local361;
							this.anInt6365 -= local361;
							return;
						}
						this.anInt6368 -= local91 * this.anInt6365;
						this.anInt6365 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6372 < 0) {
				if (this.anInt6368 < 0) {
					this.anInt6368 = -1;
					this.method5372();
					this.method7820();
					return;
				}
			} else if (this.anInt6368 >= local87) {
				this.anInt6368 = local87;
				this.method5372();
				this.method7820();
			}
		} else if (this.aBoolean407) {
			if (this.anInt6372 < 0) {
				if (this.anInt6368 >= local76) {
					return;
				}
				this.anInt6368 = local76 + local76 - this.anInt6368 - 1;
				this.anInt6372 = -this.anInt6372;
			}
			while (this.anInt6368 >= local81) {
				this.anInt6368 = local81 + local81 - this.anInt6368 - 1;
				this.anInt6372 = -this.anInt6372;
				if (this.anInt6368 >= local76) {
					return;
				}
				this.anInt6368 = local76 + local76 - this.anInt6368 - 1;
				this.anInt6372 = -this.anInt6372;
			}
		} else if (this.anInt6372 < 0) {
			if (this.anInt6368 < local76) {
				this.anInt6368 = local81 - (local81 - 1 - this.anInt6368) % local91 - 1;
			}
		} else if (this.anInt6368 >= local81) {
			this.anInt6368 = local76 + (this.anInt6368 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "(I)V")
	public synchronized void method5347(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6368 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([IIIII)I")
	private int method5351(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6373 <= 0) {
				if (this.anInt6372 == 256 && (this.anInt6368 & 0xFF) == 0) {
					if (Static8.aBoolean56) {
						return Static556.method5349(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, arg3, arg2, this);
					}
					return Static556.method5345(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, arg3, arg2, this);
				}
				if (Static8.aBoolean56) {
					return Static556.method5373(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, arg3, arg2, this, this.anInt6372, arg4);
				}
				return Static556.method5348(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, arg3, arg2, this, this.anInt6372, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6373;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6373 += arg1;
			if (this.anInt6372 == 256 && (this.anInt6368 & 0xFF) == 0) {
				if (Static8.aBoolean56) {
					arg1 = Static556.method5371(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, this.anInt6367, this.anInt6362, local5, arg2, this);
				} else {
					arg1 = Static556.method5356(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, this.anInt6374, local5, arg2, this);
				}
			} else if (Static8.aBoolean56) {
				arg1 = Static556.method5367(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, this.anInt6367, this.anInt6362, local5, arg2, this, this.anInt6372, arg4);
			} else {
				arg1 = Static556.method5363(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, this.anInt6374, local5, arg2, this, this.anInt6372, arg4);
			}
			this.anInt6373 -= arg1;
			if (this.anInt6373 != 0) {
				return arg1;
			}
		} while (!this.method5357());
		return arg3;
	}

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "(I)V")
	public synchronized void method5352(@OriginalArg(0) int arg0) {
		if (this.anInt6372 < 0) {
			this.anInt6372 = -arg0;
		} else {
			this.anInt6372 = arg0;
		}
	}

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "(I)V")
	private synchronized void method5353() {
		this.method5364(0, this.method5362());
	}

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "()I")
	public synchronized int method5355() {
		return this.anInt6372 < 0 ? -this.anInt6372 : this.anInt6372;
	}

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "()Z")
	private boolean method5357() {
		@Pc(2) int local2 = this.anInt6369;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static556.method5350(local2, this.anInt6370);
			local8 = Static556.method5338(local2, this.anInt6370);
		}
		if (this.anInt6366 != local2 || this.anInt6364 != local10 || this.anInt6375 != local8) {
			if (this.anInt6366 < local2) {
				this.anInt6374 = 1;
				this.anInt6373 = local2 - this.anInt6366;
			} else if (this.anInt6366 > local2) {
				this.anInt6374 = -1;
				this.anInt6373 = this.anInt6366 - local2;
			} else {
				this.anInt6374 = 0;
			}
			if (this.anInt6364 < local10) {
				this.anInt6367 = 1;
				if (this.anInt6373 == 0 || this.anInt6373 > local10 - this.anInt6364) {
					this.anInt6373 = local10 - this.anInt6364;
				}
			} else if (this.anInt6364 > local10) {
				this.anInt6367 = -1;
				if (this.anInt6373 == 0 || this.anInt6373 > this.anInt6364 - local10) {
					this.anInt6373 = this.anInt6364 - local10;
				}
			} else {
				this.anInt6367 = 0;
			}
			if (this.anInt6375 < local8) {
				this.anInt6362 = 1;
				if (this.anInt6373 == 0 || this.anInt6373 > local8 - this.anInt6375) {
					this.anInt6373 = local8 - this.anInt6375;
				}
			} else if (this.anInt6375 > local8) {
				this.anInt6362 = -1;
				if (this.anInt6373 == 0 || this.anInt6373 > this.anInt6375 - local8) {
					this.anInt6373 = this.anInt6375 - local8;
				}
			} else {
				this.anInt6362 = 0;
			}
			return false;
		} else if (this.anInt6369 == Integer.MIN_VALUE) {
			this.anInt6369 = 0;
			this.anInt6366 = this.anInt6364 = this.anInt6375 = 0;
			this.method7820();
			return true;
		} else {
			this.method5369();
			return false;
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(II)V")
	public synchronized void method5358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5374(arg0, arg1, this.method5362());
	}

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "(I)V")
	public synchronized void method5360(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5353();
			this.method7820();
		} else if (this.anInt6364 == 0 && this.anInt6375 == 0) {
			this.anInt6373 = 0;
			this.anInt6369 = 0;
			this.anInt6366 = 0;
			this.method7820();
		} else {
			@Pc(31) int local31 = -this.anInt6366;
			if (this.anInt6366 > local31) {
				local31 = this.anInt6366;
			}
			if (-this.anInt6364 > local31) {
				local31 = -this.anInt6364;
			}
			if (this.anInt6364 > local31) {
				local31 = this.anInt6364;
			}
			if (-this.anInt6375 > local31) {
				local31 = -this.anInt6375;
			}
			if (this.anInt6375 > local31) {
				local31 = this.anInt6375;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6373 = arg0;
			this.anInt6369 = Integer.MIN_VALUE;
			this.anInt6374 = -this.anInt6366 / arg0;
			this.anInt6367 = -this.anInt6364 / arg0;
			this.anInt6362 = -this.anInt6375 / arg0;
		}
	}

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "()I")
	public synchronized int method5362() {
		return this.anInt6370 < 0 ? -1 : this.anInt6370;
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(II)V")
	private synchronized void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6369 = arg0;
		this.anInt6370 = arg1;
		this.anInt6373 = 0;
		this.method5369();
	}

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "(I)V")
	public synchronized void method5365(@OriginalArg(0) int arg0) {
		this.anInt6365 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "()Z")
	public boolean method5366() {
		return this.anInt6373 != 0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "()I")
	@Override
	public int method6926() {
		return this.anInt6369 == 0 && this.anInt6373 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "()I")
	public synchronized int method5368() {
		return this.anInt6369 == Integer.MIN_VALUE ? 0 : this.anInt6369;
	}

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "()V")
	private void method5369() {
		this.anInt6366 = this.anInt6369;
		this.anInt6364 = Static556.method5350(this.anInt6369, this.anInt6370);
		this.anInt6375 = Static556.method5338(this.anInt6369, this.anInt6370);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "([IIIII)I")
	private int method5370(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6373 <= 0) {
				if (this.anInt6372 == -256 && (this.anInt6368 & 0xFF) == 0) {
					if (Static8.aBoolean56) {
						return Static556.method5375(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, arg3, arg2, this);
					}
					return Static556.method5359(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, arg3, arg2, this);
				}
				if (Static8.aBoolean56) {
					return Static556.method5343(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, arg3, arg2, this, this.anInt6372, arg4);
				}
				return Static556.method5344(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, arg3, arg2, this, this.anInt6372, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6373;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6373 += arg1;
			if (this.anInt6372 == -256 && (this.anInt6368 & 0xFF) == 0) {
				if (Static8.aBoolean56) {
					arg1 = Static556.method5340(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, this.anInt6367, this.anInt6362, local5, arg2, this);
				} else {
					arg1 = Static556.method5346(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, this.anInt6374, local5, arg2, this);
				}
			} else if (Static8.aBoolean56) {
				arg1 = Static556.method5361(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6364, this.anInt6375, this.anInt6367, this.anInt6362, local5, arg2, this, this.anInt6372, arg4);
			} else {
				arg1 = Static556.method5354(((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97, arg0, this.anInt6368, arg1, this.anInt6366, this.anInt6374, local5, arg2, this, this.anInt6372, arg4);
			}
			this.anInt6373 -= arg1;
			if (this.anInt6373 != 0) {
				return arg1;
			}
		} while (!this.method5357());
		return arg3;
	}

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "()V")
	private void method5372() {
		if (this.anInt6373 == 0) {
			return;
		}
		if (this.anInt6369 == Integer.MIN_VALUE) {
			this.anInt6369 = 0;
		}
		this.anInt6373 = 0;
		this.method5369();
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "()I")
	@Override
	public int method6932() {
		@Pc(6) int local6 = this.anInt6366 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6365 == 0) {
			local6 -= local6 * this.anInt6368 / (((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97.length << 8);
		} else if (this.anInt6365 >= 0) {
			local6 -= local6 * this.anInt6363 / ((Class3_Sub42_Sub1) super.aClass3_Sub42_5).aByteArray97.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
	public synchronized void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5364(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static556.method5350(arg1, arg2);
		@Pc(14) int local14 = Static556.method5338(arg1, arg2);
		if (this.anInt6364 == local10 && this.anInt6375 == local14) {
			this.anInt6373 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6366;
		if (this.anInt6366 - arg1 > local31) {
			local31 = this.anInt6366 - arg1;
		}
		if (local10 - this.anInt6364 > local31) {
			local31 = local10 - this.anInt6364;
		}
		if (this.anInt6364 - local10 > local31) {
			local31 = this.anInt6364 - local10;
		}
		if (local14 - this.anInt6375 > local31) {
			local31 = local14 - this.anInt6375;
		}
		if (this.anInt6375 - local14 > local31) {
			local31 = this.anInt6375 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6373 = arg0;
		this.anInt6369 = arg1;
		this.anInt6370 = arg2;
		this.anInt6374 = (arg1 - this.anInt6366) / arg0;
		this.anInt6367 = (local10 - this.anInt6364) / arg0;
		this.anInt6362 = (local14 - this.anInt6375) / arg0;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "()Lclient!bk;")
	@Override
	public Class3_Sub9 method6928() {
		return null;
	}
}
