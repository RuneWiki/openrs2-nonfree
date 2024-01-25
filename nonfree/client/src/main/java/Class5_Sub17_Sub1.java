import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class5_Sub17_Sub1 extends Class5_Sub17 {

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int anInt2273;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	public int anInt2275;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	private int anInt2279;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
	public int anInt2280;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	private final int anInt2276;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	private final int anInt2271;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "Z")
	private final boolean aBoolean146;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
	private int anInt2278;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	private int anInt2277;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
	private int anInt2282;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!fp;II)V")
	public Class5_Sub17_Sub1(@OriginalArg(0) Class5_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub15_5 = arg0;
		this.anInt2276 = arg0.anInt2151;
		this.anInt2271 = arg0.anInt2150;
		this.aBoolean146 = arg0.aBoolean137;
		this.anInt2278 = arg1;
		this.anInt2277 = arg2;
		this.anInt2282 = 8192;
		this.anInt2283 = 0;
		this.method2095();
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!fp;III)V")
	public Class5_Sub17_Sub1(@OriginalArg(0) Class5_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub15_5 = arg0;
		this.anInt2276 = arg0.anInt2151;
		this.anInt2271 = arg0.anInt2150;
		this.aBoolean146 = arg0.aBoolean137;
		this.anInt2278 = arg1;
		this.anInt2277 = arg2;
		this.anInt2282 = arg3;
		this.anInt2283 = 0;
		this.method2095();
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
	public synchronized void method2093(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2094();
			this.method5803();
		} else if (this.anInt2280 == 0 && this.anInt2273 == 0) {
			this.anInt2281 = 0;
			this.anInt2277 = 0;
			this.anInt2272 = 0;
			this.method5803();
		} else {
			@Pc(31) int local31 = -this.anInt2272;
			if (this.anInt2272 > local31) {
				local31 = this.anInt2272;
			}
			if (-this.anInt2280 > local31) {
				local31 = -this.anInt2280;
			}
			if (this.anInt2280 > local31) {
				local31 = this.anInt2280;
			}
			if (-this.anInt2273 > local31) {
				local31 = -this.anInt2273;
			}
			if (this.anInt2273 > local31) {
				local31 = this.anInt2273;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2281 = arg0;
			this.anInt2277 = Integer.MIN_VALUE;
			this.anInt2275 = -this.anInt2272 / arg0;
			this.anInt2274 = -this.anInt2280 / arg0;
			this.anInt2284 = -this.anInt2273 / arg0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()Lclient!nf;")
	@Override
	public Class5_Sub17 method4461() {
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
	private synchronized void method2094() {
		this.method2107(0, this.method2111());
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
	private void method2095() {
		this.anInt2272 = this.anInt2277;
		this.anInt2280 = Static361.method2104(this.anInt2277, this.anInt2282);
		this.anInt2273 = Static361.method2101(this.anInt2277, this.anInt2282);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2277 == 0 && this.anInt2281 == 0) {
			this.method4465(arg2);
			return;
		}
		@Pc(13) Class5_Sub15_Sub1 local13 = (Class5_Sub15_Sub1) super.aClass5_Sub15_5;
		@Pc(18) int local18 = this.anInt2276 << 8;
		@Pc(23) int local23 = this.anInt2271 << 8;
		@Pc(29) int local29 = local13.aByteArray19.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2279 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2283 < 0) {
			if (this.anInt2278 <= 0) {
				this.method2119();
				this.method5803();
				return;
			}
			this.anInt2283 = 0;
		}
		if (this.anInt2283 >= local29) {
			if (this.anInt2278 >= 0) {
				this.method2119();
				this.method5803();
				return;
			}
			this.anInt2283 = local29 - 1;
		}
		if (this.anInt2279 >= 0) {
			if (this.anInt2279 > 0) {
				if (this.aBoolean146) {
					label130: {
						if (this.anInt2278 < 0) {
							local40 = this.method2124(arg0, arg1, local18, local44, local13.aByteArray19[this.anInt2276]);
							if (this.anInt2283 >= local18) {
								return;
							}
							this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
							this.anInt2278 = -this.anInt2278;
							if (--this.anInt2279 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2126(arg0, local40, local23, local44, local13.aByteArray19[this.anInt2271 - 1]);
							if (this.anInt2283 < local23) {
								return;
							}
							this.anInt2283 = local23 + local23 - this.anInt2283 - 1;
							this.anInt2278 = -this.anInt2278;
							if (--this.anInt2279 == 0) {
								break;
							}
							local40 = this.method2124(arg0, local40, local18, local44, local13.aByteArray19[this.anInt2276]);
							if (this.anInt2283 >= local18) {
								return;
							}
							this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
							this.anInt2278 = -this.anInt2278;
						} while (--this.anInt2279 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2278 < 0) {
						while (true) {
							local40 = this.method2124(arg0, local40, local18, local44, local13.aByteArray19[this.anInt2271 - 1]);
							if (this.anInt2283 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2283 - 1) / local33;
							if (local416 >= this.anInt2279) {
								this.anInt2283 += local33 * this.anInt2279;
								this.anInt2279 = 0;
								break;
							}
							this.anInt2283 += local33 * local416;
							this.anInt2279 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2126(arg0, local40, local23, local44, local13.aByteArray19[this.anInt2276]);
							if (this.anInt2283 < local23) {
								return;
							}
							local416 = (this.anInt2283 - local18) / local33;
							if (local416 >= this.anInt2279) {
								this.anInt2283 -= local33 * this.anInt2279;
								this.anInt2279 = 0;
								break;
							}
							this.anInt2283 -= local33 * local416;
							this.anInt2279 -= local416;
						}
					}
				}
			}
			if (this.anInt2278 < 0) {
				this.method2124(arg0, local40, 0, local44, 0);
				if (this.anInt2283 < 0) {
					this.anInt2283 = -1;
					this.method2119();
					this.method5803();
					return;
				}
			} else {
				this.method2126(arg0, local40, local29, local44, 0);
				if (this.anInt2283 >= local29) {
					this.anInt2283 = local29;
					this.method2119();
					this.method5803();
				}
			}
		} else if (this.aBoolean146) {
			if (this.anInt2278 < 0) {
				local40 = this.method2124(arg0, arg1, local18, local44, local13.aByteArray19[this.anInt2276]);
				if (this.anInt2283 >= local18) {
					return;
				}
				this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
				this.anInt2278 = -this.anInt2278;
			}
			while (true) {
				local40 = this.method2126(arg0, local40, local23, local44, local13.aByteArray19[this.anInt2271 - 1]);
				if (this.anInt2283 < local23) {
					return;
				}
				this.anInt2283 = local23 + local23 - this.anInt2283 - 1;
				this.anInt2278 = -this.anInt2278;
				local40 = this.method2124(arg0, local40, local18, local44, local13.aByteArray19[this.anInt2276]);
				if (this.anInt2283 >= local18) {
					return;
				}
				this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
				this.anInt2278 = -this.anInt2278;
			}
		} else if (this.anInt2278 < 0) {
			while (true) {
				local40 = this.method2124(arg0, local40, local18, local44, local13.aByteArray19[this.anInt2271 - 1]);
				if (this.anInt2283 >= local18) {
					return;
				}
				this.anInt2283 = local23 - (local23 - 1 - this.anInt2283) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2126(arg0, local40, local23, local44, local13.aByteArray19[this.anInt2276]);
				if (this.anInt2283 < local23) {
					return;
				}
				this.anInt2283 = local18 + (this.anInt2283 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "()Z")
	public boolean method2098() {
		return this.anInt2283 < 0 || this.anInt2283 >= ((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19.length << 8;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	public synchronized void method2100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2129(arg0, arg1, this.method2111());
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
	public synchronized void method2102(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2283 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
	private synchronized void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2277 = arg0;
		this.anInt2282 = arg1;
		this.anInt2281 = 0;
		this.method2095();
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()Lclient!nf;")
	@Override
	public Class5_Sub17 method4463() {
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "()I")
	public synchronized int method2111() {
		return this.anInt2282 < 0 ? -1 : this.anInt2282;
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "()I")
	public synchronized int method2112() {
		return this.anInt2277 == Integer.MIN_VALUE ? 0 : this.anInt2277;
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "()Z")
	private boolean method2113() {
		@Pc(2) int local2 = this.anInt2277;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static361.method2104(local2, this.anInt2282);
			local8 = Static361.method2101(local2, this.anInt2282);
		}
		if (this.anInt2272 != local2 || this.anInt2280 != local10 || this.anInt2273 != local8) {
			if (this.anInt2272 < local2) {
				this.anInt2275 = 1;
				this.anInt2281 = local2 - this.anInt2272;
			} else if (this.anInt2272 > local2) {
				this.anInt2275 = -1;
				this.anInt2281 = this.anInt2272 - local2;
			} else {
				this.anInt2275 = 0;
			}
			if (this.anInt2280 < local10) {
				this.anInt2274 = 1;
				if (this.anInt2281 == 0 || this.anInt2281 > local10 - this.anInt2280) {
					this.anInt2281 = local10 - this.anInt2280;
				}
			} else if (this.anInt2280 > local10) {
				this.anInt2274 = -1;
				if (this.anInt2281 == 0 || this.anInt2281 > this.anInt2280 - local10) {
					this.anInt2281 = this.anInt2280 - local10;
				}
			} else {
				this.anInt2274 = 0;
			}
			if (this.anInt2273 < local8) {
				this.anInt2284 = 1;
				if (this.anInt2281 == 0 || this.anInt2281 > local8 - this.anInt2273) {
					this.anInt2281 = local8 - this.anInt2273;
				}
			} else if (this.anInt2273 > local8) {
				this.anInt2284 = -1;
				if (this.anInt2281 == 0 || this.anInt2281 > this.anInt2273 - local8) {
					this.anInt2281 = this.anInt2273 - local8;
				}
			} else {
				this.anInt2284 = 0;
			}
			return false;
		} else if (this.anInt2277 == Integer.MIN_VALUE) {
			this.anInt2277 = 0;
			this.anInt2272 = this.anInt2280 = this.anInt2273 = 0;
			this.method5803();
			return true;
		} else {
			this.method2095();
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	public synchronized void method2116(@OriginalArg(0) int arg0) {
		if (this.anInt2278 < 0) {
			this.anInt2278 = -arg0;
		} else {
			this.anInt2278 = arg0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	public synchronized void method2117() {
		this.anInt2278 = (this.anInt2278 ^ this.anInt2278 >> 31) + (this.anInt2278 >>> 31);
		this.anInt2278 = -this.anInt2278;
	}

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "()V")
	private void method2119() {
		if (this.anInt2281 == 0) {
			return;
		}
		if (this.anInt2277 == Integer.MIN_VALUE) {
			this.anInt2277 = 0;
		}
		this.anInt2281 = 0;
		this.method2095();
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
	@Override
	public int method4462() {
		@Pc(6) int local6 = this.anInt2272 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2279 == 0) {
			local6 -= local6 * this.anInt2283 / (((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19.length << 8);
		} else if (this.anInt2279 >= 0) {
			local6 -= local6 * this.anInt2276 / ((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
	@Override
	public int method4459() {
		return this.anInt2277 == 0 && this.anInt2281 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "()Z")
	public boolean method2120() {
		return this.anInt2281 != 0;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
	public synchronized void method2121(@OriginalArg(0) int arg0) {
		this.anInt2279 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII)I")
	private int method2124(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2281 <= 0) {
				if (this.anInt2278 == -256 && (this.anInt2283 & 0xFF) == 0) {
					if (Static250.aBoolean374) {
						return Static361.method2106(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, arg3, arg2, this);
					}
					return Static361.method2092(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, arg3, arg2, this);
				}
				if (Static250.aBoolean374) {
					return Static361.method2096(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, arg3, arg2, this, this.anInt2278, arg4);
				}
				return Static361.method2123(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, arg3, arg2, this, this.anInt2278, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2281;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2281 += arg1;
			if (this.anInt2278 == -256 && (this.anInt2283 & 0xFF) == 0) {
				if (Static250.aBoolean374) {
					arg1 = Static361.method2118(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, this.anInt2274, this.anInt2284, local5, arg2, this);
				} else {
					arg1 = Static361.method2099(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, this.anInt2275, local5, arg2, this);
				}
			} else if (Static250.aBoolean374) {
				arg1 = Static361.method2125(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, this.anInt2274, this.anInt2284, local5, arg2, this, this.anInt2278, arg4);
			} else {
				arg1 = Static361.method2103(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, this.anInt2275, local5, arg2, this, this.anInt2278, arg4);
			}
			this.anInt2281 -= arg1;
			if (this.anInt2281 != 0) {
				return arg1;
			}
		} while (!this.method2113());
		return arg3;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4465(@OriginalArg(0) int arg0) {
		if (this.anInt2281 > 0) {
			if (arg0 >= this.anInt2281) {
				if (this.anInt2277 == Integer.MIN_VALUE) {
					this.anInt2277 = 0;
					this.anInt2272 = this.anInt2280 = this.anInt2273 = 0;
					this.method5803();
					arg0 = this.anInt2281;
				}
				this.anInt2281 = 0;
				this.method2095();
			} else {
				this.anInt2272 += this.anInt2275 * arg0;
				this.anInt2280 += this.anInt2274 * arg0;
				this.anInt2273 += this.anInt2284 * arg0;
				this.anInt2281 -= arg0;
			}
		}
		@Pc(71) Class5_Sub15_Sub1 local71 = (Class5_Sub15_Sub1) super.aClass5_Sub15_5;
		@Pc(76) int local76 = this.anInt2276 << 8;
		@Pc(81) int local81 = this.anInt2271 << 8;
		@Pc(87) int local87 = local71.aByteArray19.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2279 = 0;
		}
		if (this.anInt2283 < 0) {
			if (this.anInt2278 <= 0) {
				this.method2119();
				this.method5803();
				return;
			}
			this.anInt2283 = 0;
		}
		if (this.anInt2283 >= local87) {
			if (this.anInt2278 >= 0) {
				this.method2119();
				this.method5803();
				return;
			}
			this.anInt2283 = local87 - 1;
		}
		this.anInt2283 += this.anInt2278 * arg0;
		if (this.anInt2279 >= 0) {
			if (this.anInt2279 > 0) {
				if (this.aBoolean146) {
					label125: {
						if (this.anInt2278 < 0) {
							if (this.anInt2283 >= local76) {
								return;
							}
							this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
							this.anInt2278 = -this.anInt2278;
							if (--this.anInt2279 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2283 < local81) {
								return;
							}
							this.anInt2283 = local81 + local81 - this.anInt2283 - 1;
							this.anInt2278 = -this.anInt2278;
							if (--this.anInt2279 == 0) {
								break;
							}
							if (this.anInt2283 >= local76) {
								return;
							}
							this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
							this.anInt2278 = -this.anInt2278;
						} while (--this.anInt2279 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2278 < 0) {
						if (this.anInt2283 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2283 - 1) / local91;
						if (local361 < this.anInt2279) {
							this.anInt2283 += local91 * local361;
							this.anInt2279 -= local361;
							return;
						}
						this.anInt2283 += local91 * this.anInt2279;
						this.anInt2279 = 0;
					} else if (this.anInt2283 >= local81) {
						local361 = (this.anInt2283 - local76) / local91;
						if (local361 < this.anInt2279) {
							this.anInt2283 -= local91 * local361;
							this.anInt2279 -= local361;
							return;
						}
						this.anInt2283 -= local91 * this.anInt2279;
						this.anInt2279 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2278 < 0) {
				if (this.anInt2283 < 0) {
					this.anInt2283 = -1;
					this.method2119();
					this.method5803();
					return;
				}
			} else if (this.anInt2283 >= local87) {
				this.anInt2283 = local87;
				this.method2119();
				this.method5803();
			}
		} else if (this.aBoolean146) {
			if (this.anInt2278 < 0) {
				if (this.anInt2283 >= local76) {
					return;
				}
				this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
				this.anInt2278 = -this.anInt2278;
			}
			while (this.anInt2283 >= local81) {
				this.anInt2283 = local81 + local81 - this.anInt2283 - 1;
				this.anInt2278 = -this.anInt2278;
				if (this.anInt2283 >= local76) {
					return;
				}
				this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
				this.anInt2278 = -this.anInt2278;
			}
		} else if (this.anInt2278 < 0) {
			if (this.anInt2283 < local76) {
				this.anInt2283 = local81 - (local81 - 1 - this.anInt2283) % local91 - 1;
			}
		} else if (this.anInt2283 >= local81) {
			this.anInt2283 = local76 + (this.anInt2283 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([IIIII)I")
	private int method2126(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2281 <= 0) {
				if (this.anInt2278 == 256 && (this.anInt2283 & 0xFF) == 0) {
					if (Static250.aBoolean374) {
						return Static361.method2105(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, arg3, arg2, this);
					}
					return Static361.method2097(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, arg3, arg2, this);
				}
				if (Static250.aBoolean374) {
					return Static361.method2131(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, arg3, arg2, this, this.anInt2278, arg4);
				}
				return Static361.method2122(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, arg3, arg2, this, this.anInt2278, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2281;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2281 += arg1;
			if (this.anInt2278 == 256 && (this.anInt2283 & 0xFF) == 0) {
				if (Static250.aBoolean374) {
					arg1 = Static361.method2114(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, this.anInt2274, this.anInt2284, local5, arg2, this);
				} else {
					arg1 = Static361.method2127(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, this.anInt2275, local5, arg2, this);
				}
			} else if (Static250.aBoolean374) {
				arg1 = Static361.method2110(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2280, this.anInt2273, this.anInt2274, this.anInt2284, local5, arg2, this, this.anInt2278, arg4);
			} else {
				arg1 = Static361.method2108(((Class5_Sub15_Sub1) super.aClass5_Sub15_5).aByteArray19, arg0, this.anInt2283, arg1, this.anInt2272, this.anInt2275, local5, arg2, this, this.anInt2278, arg4);
			}
			this.anInt2281 -= arg1;
			if (this.anInt2281 != 0) {
				return arg1;
			}
		} while (!this.method2113());
		return arg3;
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "()I")
	public synchronized int method2128() {
		return this.anInt2278 < 0 ? -this.anInt2278 : this.anInt2278;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	public synchronized void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2107(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static361.method2104(arg1, arg2);
		@Pc(14) int local14 = Static361.method2101(arg1, arg2);
		if (this.anInt2280 == local10 && this.anInt2273 == local14) {
			this.anInt2281 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2272;
		if (this.anInt2272 - arg1 > local31) {
			local31 = this.anInt2272 - arg1;
		}
		if (local10 - this.anInt2280 > local31) {
			local31 = local10 - this.anInt2280;
		}
		if (this.anInt2280 - local10 > local31) {
			local31 = this.anInt2280 - local10;
		}
		if (local14 - this.anInt2273 > local31) {
			local31 = local14 - this.anInt2273;
		}
		if (this.anInt2273 - local14 > local31) {
			local31 = this.anInt2273 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2281 = arg0;
		this.anInt2277 = arg1;
		this.anInt2282 = arg2;
		this.anInt2275 = (arg1 - this.anInt2272) / arg0;
		this.anInt2274 = (local10 - this.anInt2280) / arg0;
		this.anInt2284 = (local14 - this.anInt2273) / arg0;
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
	public synchronized void method2130(@OriginalArg(0) int arg0) {
		this.method2107(arg0 << 6, this.method2111());
	}
}
