import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	public int anInt332;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "I")
	public int anInt334;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "I")
	public int anInt337;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "I")
	public int anInt339;

	@OriginalMember(owner = "client!am", name = "z", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "I")
	private final int anInt336;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "I")
	private final int anInt338;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Z")
	private final boolean aBoolean38;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!am", name = "C", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "I")
	public int anInt342;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ug;II)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) Class3_Sub48_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub48_5 = arg0;
		this.anInt336 = arg0.anInt8530;
		this.anInt338 = arg0.anInt8531;
		this.aBoolean38 = arg0.aBoolean659;
		this.anInt335 = arg1;
		this.anInt344 = arg2;
		this.anInt340 = 8192;
		this.anInt342 = 0;
		this.method292();
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ug;III)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) Class3_Sub48_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub48_5 = arg0;
		this.anInt336 = arg0.anInt8530;
		this.anInt338 = arg0.anInt8531;
		this.aBoolean38 = arg0.aBoolean659;
		this.anInt335 = arg1;
		this.anInt344 = arg2;
		this.anInt340 = arg3;
		this.anInt342 = 0;
		this.method292();
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "()Z")
	public boolean method274() {
		return this.anInt331 != 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([IIIII)I")
	private int method275(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt331 <= 0) {
				if (this.anInt335 == -256 && (this.anInt342 & 0xFF) == 0) {
					if (Static305.aBoolean394) {
						return Static597.method302(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, arg3, arg2, this);
					}
					return Static597.method300(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, arg3, arg2, this);
				}
				if (Static305.aBoolean394) {
					return Static597.method279(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, arg3, arg2, this, this.anInt335, arg4);
				}
				return Static597.method304(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, arg3, arg2, this, this.anInt335, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt331;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt331 += arg1;
			if (this.anInt335 == -256 && (this.anInt342 & 0xFF) == 0) {
				if (Static305.aBoolean394) {
					arg1 = Static597.method295(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, this.anInt334, this.anInt332, local5, arg2, this);
				} else {
					arg1 = Static597.method276(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, this.anInt337, local5, arg2, this);
				}
			} else if (Static305.aBoolean394) {
				arg1 = Static597.method273(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, this.anInt334, this.anInt332, local5, arg2, this, this.anInt335, arg4);
			} else {
				arg1 = Static597.method310(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, this.anInt337, local5, arg2, this, this.anInt335, arg4);
			}
			this.anInt331 -= arg1;
			if (this.anInt331 != 0) {
				return arg1;
			}
		} while (!this.method296());
		return arg3;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
	public synchronized void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method301(arg0, arg1, this.method287());
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()I")
	@Override
	public int method6655() {
		return this.anInt344 == 0 && this.anInt331 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public synchronized void method281(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt342 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "()I")
	public synchronized int method282() {
		return this.anInt335 < 0 ? -this.anInt335 : this.anInt335;
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "()V")
	private void method283() {
		if (this.anInt331 == 0) {
			return;
		}
		if (this.anInt344 == Integer.MIN_VALUE) {
			this.anInt344 = 0;
		}
		this.anInt331 = 0;
		this.method292();
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()Lclient!nj;")
	@Override
	public Class3_Sub4 method6656() {
		return null;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public synchronized void method286(@OriginalArg(0) int arg0) {
		this.method299(arg0 << 6, this.method287());
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "()I")
	public synchronized int method287() {
		return this.anInt340 < 0 ? -1 : this.anInt340;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V")
	public synchronized void method288(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method303();
			this.method7825();
		} else if (this.anInt339 == 0 && this.anInt341 == 0) {
			this.anInt331 = 0;
			this.anInt344 = 0;
			this.anInt343 = 0;
			this.method7825();
		} else {
			@Pc(31) int local31 = -this.anInt343;
			if (this.anInt343 > local31) {
				local31 = this.anInt343;
			}
			if (-this.anInt339 > local31) {
				local31 = -this.anInt339;
			}
			if (this.anInt339 > local31) {
				local31 = this.anInt339;
			}
			if (-this.anInt341 > local31) {
				local31 = -this.anInt341;
			}
			if (this.anInt341 > local31) {
				local31 = this.anInt341;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt331 = arg0;
			this.anInt344 = Integer.MIN_VALUE;
			this.anInt337 = -this.anInt343 / arg0;
			this.anInt334 = -this.anInt339 / arg0;
			this.anInt332 = -this.anInt341 / arg0;
		}
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V")
	public synchronized void method289(@OriginalArg(0) int arg0) {
		this.anInt333 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "i", descriptor = "()I")
	public synchronized int method291() {
		return this.anInt344 == Integer.MIN_VALUE ? 0 : this.anInt344;
	}

	@OriginalMember(owner = "client!am", name = "j", descriptor = "()V")
	private void method292() {
		this.anInt343 = this.anInt344;
		this.anInt339 = Static597.method311(this.anInt344, this.anInt340);
		this.anInt341 = Static597.method293(this.anInt344, this.anInt340);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "([IIIII)I")
	private int method294(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt331 <= 0) {
				if (this.anInt335 == 256 && (this.anInt342 & 0xFF) == 0) {
					if (Static305.aBoolean394) {
						return Static597.method284(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, arg3, arg2, this);
					}
					return Static597.method305(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, arg3, arg2, this);
				}
				if (Static305.aBoolean394) {
					return Static597.method307(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, arg3, arg2, this, this.anInt335, arg4);
				}
				return Static597.method278(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, arg3, arg2, this, this.anInt335, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt331;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt331 += arg1;
			if (this.anInt335 == 256 && (this.anInt342 & 0xFF) == 0) {
				if (Static305.aBoolean394) {
					arg1 = Static597.method290(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, this.anInt334, this.anInt332, local5, arg2, this);
				} else {
					arg1 = Static597.method312(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, this.anInt337, local5, arg2, this);
				}
			} else if (Static305.aBoolean394) {
				arg1 = Static597.method309(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt339, this.anInt341, this.anInt334, this.anInt332, local5, arg2, this, this.anInt335, arg4);
			} else {
				arg1 = Static597.method285(((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91, arg0, this.anInt342, arg1, this.anInt343, this.anInt337, local5, arg2, this, this.anInt335, arg4);
			}
			this.anInt331 -= arg1;
			if (this.anInt331 != 0) {
				return arg1;
			}
		} while (!this.method296());
		return arg3;
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "()Z")
	private boolean method296() {
		@Pc(2) int local2 = this.anInt344;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static597.method311(local2, this.anInt340);
			local8 = Static597.method293(local2, this.anInt340);
		}
		if (this.anInt343 != local2 || this.anInt339 != local10 || this.anInt341 != local8) {
			if (this.anInt343 < local2) {
				this.anInt337 = 1;
				this.anInt331 = local2 - this.anInt343;
			} else if (this.anInt343 > local2) {
				this.anInt337 = -1;
				this.anInt331 = this.anInt343 - local2;
			} else {
				this.anInt337 = 0;
			}
			if (this.anInt339 < local10) {
				this.anInt334 = 1;
				if (this.anInt331 == 0 || this.anInt331 > local10 - this.anInt339) {
					this.anInt331 = local10 - this.anInt339;
				}
			} else if (this.anInt339 > local10) {
				this.anInt334 = -1;
				if (this.anInt331 == 0 || this.anInt331 > this.anInt339 - local10) {
					this.anInt331 = this.anInt339 - local10;
				}
			} else {
				this.anInt334 = 0;
			}
			if (this.anInt341 < local8) {
				this.anInt332 = 1;
				if (this.anInt331 == 0 || this.anInt331 > local8 - this.anInt341) {
					this.anInt331 = local8 - this.anInt341;
				}
			} else if (this.anInt341 > local8) {
				this.anInt332 = -1;
				if (this.anInt331 == 0 || this.anInt331 > this.anInt341 - local8) {
					this.anInt331 = this.anInt341 - local8;
				}
			} else {
				this.anInt332 = 0;
			}
			return false;
		} else if (this.anInt344 == Integer.MIN_VALUE) {
			this.anInt344 = 0;
			this.anInt343 = this.anInt339 = this.anInt341 = 0;
			this.method7825();
			return true;
		} else {
			this.method292();
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public synchronized void method297() {
		this.anInt335 = (this.anInt335 ^ this.anInt335 >> 31) + (this.anInt335 >>> 31);
		this.anInt335 = -this.anInt335;
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V")
	public synchronized void method298(@OriginalArg(0) int arg0) {
		if (this.anInt335 < 0) {
			this.anInt335 = -arg0;
		} else {
			this.anInt335 = arg0;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6658(@OriginalArg(0) int arg0) {
		if (this.anInt331 > 0) {
			if (arg0 >= this.anInt331) {
				if (this.anInt344 == Integer.MIN_VALUE) {
					this.anInt344 = 0;
					this.anInt343 = this.anInt339 = this.anInt341 = 0;
					this.method7825();
					arg0 = this.anInt331;
				}
				this.anInt331 = 0;
				this.method292();
			} else {
				this.anInt343 += this.anInt337 * arg0;
				this.anInt339 += this.anInt334 * arg0;
				this.anInt341 += this.anInt332 * arg0;
				this.anInt331 -= arg0;
			}
		}
		@Pc(71) Class3_Sub48_Sub1 local71 = (Class3_Sub48_Sub1) super.aClass3_Sub48_5;
		@Pc(76) int local76 = this.anInt336 << 8;
		@Pc(81) int local81 = this.anInt338 << 8;
		@Pc(87) int local87 = local71.aByteArray91.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt333 = 0;
		}
		if (this.anInt342 < 0) {
			if (this.anInt335 <= 0) {
				this.method283();
				this.method7825();
				return;
			}
			this.anInt342 = 0;
		}
		if (this.anInt342 >= local87) {
			if (this.anInt335 >= 0) {
				this.method283();
				this.method7825();
				return;
			}
			this.anInt342 = local87 - 1;
		}
		this.anInt342 += this.anInt335 * arg0;
		if (this.anInt333 >= 0) {
			if (this.anInt333 > 0) {
				if (this.aBoolean38) {
					label125: {
						if (this.anInt335 < 0) {
							if (this.anInt342 >= local76) {
								return;
							}
							this.anInt342 = local76 + local76 - this.anInt342 - 1;
							this.anInt335 = -this.anInt335;
							if (--this.anInt333 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt342 < local81) {
								return;
							}
							this.anInt342 = local81 + local81 - this.anInt342 - 1;
							this.anInt335 = -this.anInt335;
							if (--this.anInt333 == 0) {
								break;
							}
							if (this.anInt342 >= local76) {
								return;
							}
							this.anInt342 = local76 + local76 - this.anInt342 - 1;
							this.anInt335 = -this.anInt335;
						} while (--this.anInt333 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt335 < 0) {
						if (this.anInt342 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt342 - 1) / local91;
						if (local361 < this.anInt333) {
							this.anInt342 += local91 * local361;
							this.anInt333 -= local361;
							return;
						}
						this.anInt342 += local91 * this.anInt333;
						this.anInt333 = 0;
					} else if (this.anInt342 >= local81) {
						local361 = (this.anInt342 - local76) / local91;
						if (local361 < this.anInt333) {
							this.anInt342 -= local91 * local361;
							this.anInt333 -= local361;
							return;
						}
						this.anInt342 -= local91 * this.anInt333;
						this.anInt333 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt335 < 0) {
				if (this.anInt342 < 0) {
					this.anInt342 = -1;
					this.method283();
					this.method7825();
					return;
				}
			} else if (this.anInt342 >= local87) {
				this.anInt342 = local87;
				this.method283();
				this.method7825();
			}
		} else if (this.aBoolean38) {
			if (this.anInt335 < 0) {
				if (this.anInt342 >= local76) {
					return;
				}
				this.anInt342 = local76 + local76 - this.anInt342 - 1;
				this.anInt335 = -this.anInt335;
			}
			while (this.anInt342 >= local81) {
				this.anInt342 = local81 + local81 - this.anInt342 - 1;
				this.anInt335 = -this.anInt335;
				if (this.anInt342 >= local76) {
					return;
				}
				this.anInt342 = local76 + local76 - this.anInt342 - 1;
				this.anInt335 = -this.anInt335;
			}
		} else if (this.anInt335 < 0) {
			if (this.anInt342 < local76) {
				this.anInt342 = local81 - (local81 - 1 - this.anInt342) % local91 - 1;
			}
		} else if (this.anInt342 >= local81) {
			this.anInt342 = local76 + (this.anInt342 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(II)V")
	private synchronized void method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt344 = arg0;
		this.anInt340 = arg1;
		this.anInt331 = 0;
		this.method292();
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()I")
	@Override
	public int method6657() {
		@Pc(6) int local6 = this.anInt343 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt333 == 0) {
			local6 -= local6 * this.anInt342 / (((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91.length << 8);
		} else if (this.anInt333 >= 0) {
			local6 -= local6 * this.anInt336 / ((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	public synchronized void method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method299(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static597.method311(arg1, arg2);
		@Pc(14) int local14 = Static597.method293(arg1, arg2);
		if (this.anInt339 == local10 && this.anInt341 == local14) {
			this.anInt331 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt343;
		if (this.anInt343 - arg1 > local31) {
			local31 = this.anInt343 - arg1;
		}
		if (local10 - this.anInt339 > local31) {
			local31 = local10 - this.anInt339;
		}
		if (this.anInt339 - local10 > local31) {
			local31 = this.anInt339 - local10;
		}
		if (local14 - this.anInt341 > local31) {
			local31 = local14 - this.anInt341;
		}
		if (this.anInt341 - local14 > local31) {
			local31 = this.anInt341 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt331 = arg0;
		this.anInt344 = arg1;
		this.anInt340 = arg2;
		this.anInt337 = (arg1 - this.anInt343) / arg0;
		this.anInt334 = (local10 - this.anInt339) / arg0;
		this.anInt332 = (local14 - this.anInt341) / arg0;
	}

	@OriginalMember(owner = "client!am", name = "i", descriptor = "(I)V")
	private synchronized void method303() {
		this.method299(0, this.method287());
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "()Z")
	public boolean method306() {
		return this.anInt342 < 0 || this.anInt342 >= ((Class3_Sub48_Sub1) super.aClass3_Sub48_5).aByteArray91.length << 8;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "()Lclient!nj;")
	@Override
	public Class3_Sub4 method6660() {
		return null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt344 == 0 && this.anInt331 == 0) {
			this.method6658(arg2);
			return;
		}
		@Pc(13) Class3_Sub48_Sub1 local13 = (Class3_Sub48_Sub1) super.aClass3_Sub48_5;
		@Pc(18) int local18 = this.anInt336 << 8;
		@Pc(23) int local23 = this.anInt338 << 8;
		@Pc(29) int local29 = local13.aByteArray91.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt333 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt342 < 0) {
			if (this.anInt335 <= 0) {
				this.method283();
				this.method7825();
				return;
			}
			this.anInt342 = 0;
		}
		if (this.anInt342 >= local29) {
			if (this.anInt335 >= 0) {
				this.method283();
				this.method7825();
				return;
			}
			this.anInt342 = local29 - 1;
		}
		if (this.anInt333 >= 0) {
			if (this.anInt333 > 0) {
				if (this.aBoolean38) {
					label130: {
						if (this.anInt335 < 0) {
							local40 = this.method275(arg0, arg1, local18, local44, local13.aByteArray91[this.anInt336]);
							if (this.anInt342 >= local18) {
								return;
							}
							this.anInt342 = local18 + local18 - this.anInt342 - 1;
							this.anInt335 = -this.anInt335;
							if (--this.anInt333 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method294(arg0, local40, local23, local44, local13.aByteArray91[this.anInt338 - 1]);
							if (this.anInt342 < local23) {
								return;
							}
							this.anInt342 = local23 + local23 - this.anInt342 - 1;
							this.anInt335 = -this.anInt335;
							if (--this.anInt333 == 0) {
								break;
							}
							local40 = this.method275(arg0, local40, local18, local44, local13.aByteArray91[this.anInt336]);
							if (this.anInt342 >= local18) {
								return;
							}
							this.anInt342 = local18 + local18 - this.anInt342 - 1;
							this.anInt335 = -this.anInt335;
						} while (--this.anInt333 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt335 < 0) {
						while (true) {
							local40 = this.method275(arg0, local40, local18, local44, local13.aByteArray91[this.anInt338 - 1]);
							if (this.anInt342 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt342 - 1) / local33;
							if (local416 >= this.anInt333) {
								this.anInt342 += local33 * this.anInt333;
								this.anInt333 = 0;
								break;
							}
							this.anInt342 += local33 * local416;
							this.anInt333 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method294(arg0, local40, local23, local44, local13.aByteArray91[this.anInt336]);
							if (this.anInt342 < local23) {
								return;
							}
							local416 = (this.anInt342 - local18) / local33;
							if (local416 >= this.anInt333) {
								this.anInt342 -= local33 * this.anInt333;
								this.anInt333 = 0;
								break;
							}
							this.anInt342 -= local33 * local416;
							this.anInt333 -= local416;
						}
					}
				}
			}
			if (this.anInt335 < 0) {
				this.method275(arg0, local40, 0, local44, 0);
				if (this.anInt342 < 0) {
					this.anInt342 = -1;
					this.method283();
					this.method7825();
					return;
				}
			} else {
				this.method294(arg0, local40, local29, local44, 0);
				if (this.anInt342 >= local29) {
					this.anInt342 = local29;
					this.method283();
					this.method7825();
				}
			}
		} else if (this.aBoolean38) {
			if (this.anInt335 < 0) {
				local40 = this.method275(arg0, arg1, local18, local44, local13.aByteArray91[this.anInt336]);
				if (this.anInt342 >= local18) {
					return;
				}
				this.anInt342 = local18 + local18 - this.anInt342 - 1;
				this.anInt335 = -this.anInt335;
			}
			while (true) {
				local40 = this.method294(arg0, local40, local23, local44, local13.aByteArray91[this.anInt338 - 1]);
				if (this.anInt342 < local23) {
					return;
				}
				this.anInt342 = local23 + local23 - this.anInt342 - 1;
				this.anInt335 = -this.anInt335;
				local40 = this.method275(arg0, local40, local18, local44, local13.aByteArray91[this.anInt336]);
				if (this.anInt342 >= local18) {
					return;
				}
				this.anInt342 = local18 + local18 - this.anInt342 - 1;
				this.anInt335 = -this.anInt335;
			}
		} else if (this.anInt335 < 0) {
			while (true) {
				local40 = this.method275(arg0, local40, local18, local44, local13.aByteArray91[this.anInt338 - 1]);
				if (this.anInt342 >= local18) {
					return;
				}
				this.anInt342 = local23 - (local23 - 1 - this.anInt342) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method294(arg0, local40, local23, local44, local13.aByteArray91[this.anInt336]);
				if (this.anInt342 < local23) {
					return;
				}
				this.anInt342 = local18 + (this.anInt342 - local18) % local33;
			}
		}
	}
}
