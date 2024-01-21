import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
	public int anInt942;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	public int anInt943;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
	private final int anInt944;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	private final int anInt945;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "Z")
	private final boolean aBoolean64;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!bb;II)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub4_5 = arg0;
		this.anInt944 = arg0.anInt309;
		this.anInt945 = arg0.anInt307;
		this.aBoolean64 = arg0.aBoolean21;
		this.anInt955 = arg1;
		this.anInt949 = arg2;
		this.anInt952 = 8192;
		this.anInt953 = 0;
		this.method717();
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!bb;III)V")
	public Class3_Sub9_Sub1(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub4_5 = arg0;
		this.anInt944 = arg0.anInt309;
		this.anInt945 = arg0.anInt307;
		this.aBoolean64 = arg0.aBoolean21;
		this.anInt955 = arg1;
		this.anInt949 = arg2;
		this.anInt952 = arg3;
		this.anInt953 = 0;
		this.method717();
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
	public synchronized void method716(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt953 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "()V")
	private void method717() {
		this.anInt954 = this.anInt949;
		this.anInt943 = Static183.method723(this.anInt949, this.anInt952);
		this.anInt942 = Static183.method742(this.anInt949, this.anInt952);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public synchronized void method718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method730(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static183.method723(arg1, arg2);
		@Pc(14) int local14 = Static183.method742(arg1, arg2);
		if (this.anInt943 == local10 && this.anInt942 == local14) {
			this.anInt950 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt954;
		if (this.anInt954 - arg1 > local31) {
			local31 = this.anInt954 - arg1;
		}
		if (local10 - this.anInt943 > local31) {
			local31 = local10 - this.anInt943;
		}
		if (this.anInt943 - local10 > local31) {
			local31 = this.anInt943 - local10;
		}
		if (local14 - this.anInt942 > local31) {
			local31 = local14 - this.anInt942;
		}
		if (this.anInt942 - local14 > local31) {
			local31 = this.anInt942 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt950 = arg0;
		this.anInt949 = arg1;
		this.anInt952 = arg2;
		this.anInt946 = (arg1 - this.anInt954) / arg0;
		this.anInt948 = (local10 - this.anInt943) / arg0;
		this.anInt947 = (local14 - this.anInt942) / arg0;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()Lclient!tb;")
	@Override
	public Class3_Sub9 method2218() {
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIII)I")
	private int method721(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt950 <= 0) {
				if (this.anInt955 == -256 && (this.anInt953 & 0xFF) == 0) {
					if (Static126.aBoolean195) {
						return Static183.method731(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, arg3, arg2, this);
					}
					return Static183.method739(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, arg3, arg2, this);
				}
				if (Static126.aBoolean195) {
					return Static183.method722(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, arg3, arg2, this, this.anInt955, arg4);
				}
				return Static183.method732(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, arg3, arg2, this, this.anInt955, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt950;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt950 += arg1;
			if (this.anInt955 == -256 && (this.anInt953 & 0xFF) == 0) {
				if (Static126.aBoolean195) {
					arg1 = Static183.method714(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, this.anInt948, this.anInt947, local5, arg2, this);
				} else {
					arg1 = Static183.method720(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, this.anInt946, local5, arg2, this);
				}
			} else if (Static126.aBoolean195) {
				arg1 = Static183.method726(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, this.anInt948, this.anInt947, local5, arg2, this, this.anInt955, arg4);
			} else {
				arg1 = Static183.method753(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, this.anInt946, local5, arg2, this, this.anInt955, arg4);
			}
			this.anInt950 -= arg1;
			if (this.anInt950 != 0) {
				return arg1;
			}
		} while (!this.method750());
		return arg3;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public synchronized void method724(@OriginalArg(0) int arg0) {
		this.method730(arg0 << 6, this.method727());
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2220(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt949 == 0 && this.anInt950 == 0) {
			this.method2215(arg2);
			return;
		}
		@Pc(13) Class3_Sub4_Sub1 local13 = (Class3_Sub4_Sub1) super.aClass3_Sub4_5;
		@Pc(18) int local18 = this.anInt944 << 8;
		@Pc(23) int local23 = this.anInt945 << 8;
		@Pc(29) int local29 = local13.aByteArray2.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt951 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt953 < 0) {
			if (this.anInt955 <= 0) {
				this.method736();
				this.method2783();
				return;
			}
			this.anInt953 = 0;
		}
		if (this.anInt953 >= local29) {
			if (this.anInt955 >= 0) {
				this.method736();
				this.method2783();
				return;
			}
			this.anInt953 = local29 - 1;
		}
		if (this.anInt951 >= 0) {
			if (this.anInt951 > 0) {
				if (this.aBoolean64) {
					label130: {
						if (this.anInt955 < 0) {
							local40 = this.method721(arg0, arg1, local18, local44, local13.aByteArray2[this.anInt944]);
							if (this.anInt953 >= local18) {
								return;
							}
							this.anInt953 = local18 + local18 - this.anInt953 - 1;
							this.anInt955 = -this.anInt955;
							if (--this.anInt951 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method738(arg0, local40, local23, local44, local13.aByteArray2[this.anInt945 - 1]);
							if (this.anInt953 < local23) {
								return;
							}
							this.anInt953 = local23 + local23 - this.anInt953 - 1;
							this.anInt955 = -this.anInt955;
							if (--this.anInt951 == 0) {
								break;
							}
							local40 = this.method721(arg0, local40, local18, local44, local13.aByteArray2[this.anInt944]);
							if (this.anInt953 >= local18) {
								return;
							}
							this.anInt953 = local18 + local18 - this.anInt953 - 1;
							this.anInt955 = -this.anInt955;
						} while (--this.anInt951 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt955 < 0) {
						while (true) {
							local40 = this.method721(arg0, local40, local18, local44, local13.aByteArray2[this.anInt945 - 1]);
							if (this.anInt953 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt953 - 1) / local33;
							if (local416 >= this.anInt951) {
								this.anInt953 += local33 * this.anInt951;
								this.anInt951 = 0;
								break;
							}
							this.anInt953 += local33 * local416;
							this.anInt951 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method738(arg0, local40, local23, local44, local13.aByteArray2[this.anInt944]);
							if (this.anInt953 < local23) {
								return;
							}
							local416 = (this.anInt953 - local18) / local33;
							if (local416 >= this.anInt951) {
								this.anInt953 -= local33 * this.anInt951;
								this.anInt951 = 0;
								break;
							}
							this.anInt953 -= local33 * local416;
							this.anInt951 -= local416;
						}
					}
				}
			}
			if (this.anInt955 < 0) {
				this.method721(arg0, local40, 0, local44, 0);
				if (this.anInt953 < 0) {
					this.anInt953 = -1;
					this.method736();
					this.method2783();
					return;
				}
			} else {
				this.method738(arg0, local40, local29, local44, 0);
				if (this.anInt953 >= local29) {
					this.anInt953 = local29;
					this.method736();
					this.method2783();
				}
			}
		} else if (this.aBoolean64) {
			if (this.anInt955 < 0) {
				local40 = this.method721(arg0, arg1, local18, local44, local13.aByteArray2[this.anInt944]);
				if (this.anInt953 >= local18) {
					return;
				}
				this.anInt953 = local18 + local18 - this.anInt953 - 1;
				this.anInt955 = -this.anInt955;
			}
			while (true) {
				local40 = this.method738(arg0, local40, local23, local44, local13.aByteArray2[this.anInt945 - 1]);
				if (this.anInt953 < local23) {
					return;
				}
				this.anInt953 = local23 + local23 - this.anInt953 - 1;
				this.anInt955 = -this.anInt955;
				local40 = this.method721(arg0, local40, local18, local44, local13.aByteArray2[this.anInt944]);
				if (this.anInt953 >= local18) {
					return;
				}
				this.anInt953 = local18 + local18 - this.anInt953 - 1;
				this.anInt955 = -this.anInt955;
			}
		} else if (this.anInt955 < 0) {
			while (true) {
				local40 = this.method721(arg0, local40, local18, local44, local13.aByteArray2[this.anInt945 - 1]);
				if (this.anInt953 >= local18) {
					return;
				}
				this.anInt953 = local23 - (local23 - 1 - this.anInt953) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method738(arg0, local40, local23, local44, local13.aByteArray2[this.anInt944]);
				if (this.anInt953 < local23) {
					return;
				}
				this.anInt953 = local18 + (this.anInt953 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lclient!tb;")
	@Override
	public Class3_Sub9 method2219() {
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()I")
	@Override
	public int method2214() {
		return this.anInt949 == 0 && this.anInt950 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "()I")
	public synchronized int method727() {
		return this.anInt952 < 0 ? -1 : this.anInt952;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	private synchronized void method728() {
		this.method730(0, this.method727());
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public synchronized void method729() {
		this.anInt955 = (this.anInt955 ^ this.anInt955 >> 31) + (this.anInt955 >>> 31);
		this.anInt955 = -this.anInt955;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	private synchronized void method730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt949 = arg0;
		this.anInt952 = arg1;
		this.anInt950 = 0;
		this.method717();
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "()I")
	public synchronized int method733() {
		return this.anInt949 == Integer.MIN_VALUE ? 0 : this.anInt949;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "()I")
	public synchronized int method734() {
		return this.anInt955 < 0 ? -this.anInt955 : this.anInt955;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
	public synchronized void method735(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method728();
			this.method2783();
		} else if (this.anInt943 == 0 && this.anInt942 == 0) {
			this.anInt950 = 0;
			this.anInt949 = 0;
			this.anInt954 = 0;
			this.method2783();
		} else {
			@Pc(31) int local31 = -this.anInt954;
			if (this.anInt954 > local31) {
				local31 = this.anInt954;
			}
			if (-this.anInt943 > local31) {
				local31 = -this.anInt943;
			}
			if (this.anInt943 > local31) {
				local31 = this.anInt943;
			}
			if (-this.anInt942 > local31) {
				local31 = -this.anInt942;
			}
			if (this.anInt942 > local31) {
				local31 = this.anInt942;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt950 = arg0;
			this.anInt949 = Integer.MIN_VALUE;
			this.anInt946 = -this.anInt954 / arg0;
			this.anInt948 = -this.anInt943 / arg0;
			this.anInt947 = -this.anInt942 / arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "()V")
	private void method736() {
		if (this.anInt950 == 0) {
			return;
		}
		if (this.anInt949 == Integer.MIN_VALUE) {
			this.anInt949 = 0;
		}
		this.anInt950 = 0;
		this.method717();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "([IIIII)I")
	private int method738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt950 <= 0) {
				if (this.anInt955 == 256 && (this.anInt953 & 0xFF) == 0) {
					if (Static126.aBoolean195) {
						return Static183.method746(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, arg3, arg2, this);
					}
					return Static183.method719(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, arg3, arg2, this);
				}
				if (Static126.aBoolean195) {
					return Static183.method749(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, arg3, arg2, this, this.anInt955, arg4);
				}
				return Static183.method737(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, arg3, arg2, this, this.anInt955, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt950;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt950 += arg1;
			if (this.anInt955 == 256 && (this.anInt953 & 0xFF) == 0) {
				if (Static126.aBoolean195) {
					arg1 = Static183.method744(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, this.anInt948, this.anInt947, local5, arg2, this);
				} else {
					arg1 = Static183.method751(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, this.anInt946, local5, arg2, this);
				}
			} else if (Static126.aBoolean195) {
				arg1 = Static183.method725(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt943, this.anInt942, this.anInt948, this.anInt947, local5, arg2, this, this.anInt955, arg4);
			} else {
				arg1 = Static183.method752(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2, arg0, this.anInt953, arg1, this.anInt954, this.anInt946, local5, arg2, this, this.anInt955, arg4);
			}
			this.anInt950 -= arg1;
			if (this.anInt950 != 0) {
				return arg1;
			}
		} while (!this.method750());
		return arg3;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2215(@OriginalArg(0) int arg0) {
		if (this.anInt950 > 0) {
			if (arg0 >= this.anInt950) {
				if (this.anInt949 == Integer.MIN_VALUE) {
					this.anInt949 = 0;
					this.anInt954 = this.anInt943 = this.anInt942 = 0;
					this.method2783();
					arg0 = this.anInt950;
				}
				this.anInt950 = 0;
				this.method717();
			} else {
				this.anInt954 += this.anInt946 * arg0;
				this.anInt943 += this.anInt948 * arg0;
				this.anInt942 += this.anInt947 * arg0;
				this.anInt950 -= arg0;
			}
		}
		@Pc(71) Class3_Sub4_Sub1 local71 = (Class3_Sub4_Sub1) super.aClass3_Sub4_5;
		@Pc(76) int local76 = this.anInt944 << 8;
		@Pc(81) int local81 = this.anInt945 << 8;
		@Pc(87) int local87 = local71.aByteArray2.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt951 = 0;
		}
		if (this.anInt953 < 0) {
			if (this.anInt955 <= 0) {
				this.method736();
				this.method2783();
				return;
			}
			this.anInt953 = 0;
		}
		if (this.anInt953 >= local87) {
			if (this.anInt955 >= 0) {
				this.method736();
				this.method2783();
				return;
			}
			this.anInt953 = local87 - 1;
		}
		this.anInt953 += this.anInt955 * arg0;
		if (this.anInt951 >= 0) {
			if (this.anInt951 > 0) {
				if (this.aBoolean64) {
					label125: {
						if (this.anInt955 < 0) {
							if (this.anInt953 >= local76) {
								return;
							}
							this.anInt953 = local76 + local76 - this.anInt953 - 1;
							this.anInt955 = -this.anInt955;
							if (--this.anInt951 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt953 < local81) {
								return;
							}
							this.anInt953 = local81 + local81 - this.anInt953 - 1;
							this.anInt955 = -this.anInt955;
							if (--this.anInt951 == 0) {
								break;
							}
							if (this.anInt953 >= local76) {
								return;
							}
							this.anInt953 = local76 + local76 - this.anInt953 - 1;
							this.anInt955 = -this.anInt955;
						} while (--this.anInt951 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt955 < 0) {
						if (this.anInt953 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt953 - 1) / local91;
						if (local361 < this.anInt951) {
							this.anInt953 += local91 * local361;
							this.anInt951 -= local361;
							return;
						}
						this.anInt953 += local91 * this.anInt951;
						this.anInt951 = 0;
					} else if (this.anInt953 >= local81) {
						local361 = (this.anInt953 - local76) / local91;
						if (local361 < this.anInt951) {
							this.anInt953 -= local91 * local361;
							this.anInt951 -= local361;
							return;
						}
						this.anInt953 -= local91 * this.anInt951;
						this.anInt951 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt955 < 0) {
				if (this.anInt953 < 0) {
					this.anInt953 = -1;
					this.method736();
					this.method2783();
					return;
				}
			} else if (this.anInt953 >= local87) {
				this.anInt953 = local87;
				this.method736();
				this.method2783();
			}
		} else if (this.aBoolean64) {
			if (this.anInt955 < 0) {
				if (this.anInt953 >= local76) {
					return;
				}
				this.anInt953 = local76 + local76 - this.anInt953 - 1;
				this.anInt955 = -this.anInt955;
			}
			while (this.anInt953 >= local81) {
				this.anInt953 = local81 + local81 - this.anInt953 - 1;
				this.anInt955 = -this.anInt955;
				if (this.anInt953 >= local76) {
					return;
				}
				this.anInt953 = local76 + local76 - this.anInt953 - 1;
				this.anInt955 = -this.anInt955;
			}
		} else if (this.anInt955 < 0) {
			if (this.anInt953 < local76) {
				this.anInt953 = local81 - (local81 - 1 - this.anInt953) % local91 - 1;
			}
		} else if (this.anInt953 >= local81) {
			this.anInt953 = local76 + (this.anInt953 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
	public synchronized void method741(@OriginalArg(0) int arg0) {
		this.anInt951 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
	@Override
	public int method2217() {
		@Pc(6) int local6 = this.anInt954 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt951 == 0) {
			local6 -= local6 * this.anInt953 / (((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2.length << 8);
		} else if (this.anInt951 >= 0) {
			local6 -= local6 * this.anInt944 / ((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "()Z")
	public boolean method743() {
		return this.anInt950 != 0;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)V")
	public synchronized void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method718(arg0, arg1, this.method727());
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "()Z")
	public boolean method747() {
		return this.anInt953 < 0 || this.anInt953 >= ((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray2.length << 8;
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V")
	public synchronized void method748(@OriginalArg(0) int arg0) {
		if (this.anInt955 < 0) {
			this.anInt955 = -arg0;
		} else {
			this.anInt955 = arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "()Z")
	private boolean method750() {
		@Pc(2) int local2 = this.anInt949;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static183.method723(local2, this.anInt952);
			local8 = Static183.method742(local2, this.anInt952);
		}
		if (this.anInt954 != local2 || this.anInt943 != local10 || this.anInt942 != local8) {
			if (this.anInt954 < local2) {
				this.anInt946 = 1;
				this.anInt950 = local2 - this.anInt954;
			} else if (this.anInt954 > local2) {
				this.anInt946 = -1;
				this.anInt950 = this.anInt954 - local2;
			} else {
				this.anInt946 = 0;
			}
			if (this.anInt943 < local10) {
				this.anInt948 = 1;
				if (this.anInt950 == 0 || this.anInt950 > local10 - this.anInt943) {
					this.anInt950 = local10 - this.anInt943;
				}
			} else if (this.anInt943 > local10) {
				this.anInt948 = -1;
				if (this.anInt950 == 0 || this.anInt950 > this.anInt943 - local10) {
					this.anInt950 = this.anInt943 - local10;
				}
			} else {
				this.anInt948 = 0;
			}
			if (this.anInt942 < local8) {
				this.anInt947 = 1;
				if (this.anInt950 == 0 || this.anInt950 > local8 - this.anInt942) {
					this.anInt950 = local8 - this.anInt942;
				}
			} else if (this.anInt942 > local8) {
				this.anInt947 = -1;
				if (this.anInt950 == 0 || this.anInt950 > this.anInt942 - local8) {
					this.anInt950 = this.anInt942 - local8;
				}
			} else {
				this.anInt947 = 0;
			}
			return false;
		} else if (this.anInt949 == Integer.MIN_VALUE) {
			this.anInt949 = 0;
			this.anInt954 = this.anInt943 = this.anInt942 = 0;
			this.method2783();
			return true;
		} else {
			this.method717();
			return false;
		}
	}
}
