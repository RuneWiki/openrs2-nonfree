import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	private final int anInt385;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	private final int anInt391;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Z")
	private final boolean aBoolean12;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	public int anInt380;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "I")
	public int anInt379;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!w;II)V")
	public Class5_Sub2_Sub1(@OriginalArg(0) Class5_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub15_3 = arg0;
		this.anInt385 = arg0.anInt2842;
		this.anInt391 = arg0.anInt2843;
		this.aBoolean12 = arg0.aBoolean126;
		this.anInt386 = arg1;
		this.anInt380 = arg2;
		this.anInt384 = 128;
		this.anInt379 = 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)I")
	private int method281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt381 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt381;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt381 += arg1;
			if (this.anInt386 == -256 && (this.anInt379 & 0xFF) == 0) {
				if (Static102.aBoolean104) {
					arg1 = Static122.method295(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt384, this.anInt382, this.anInt389, this.anInt383, local7, arg2, this);
				} else {
					arg1 = Static122.method285(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt382, this.anInt389, local7, arg2, this);
				}
			} else if (Static102.aBoolean104) {
				arg1 = Static122.method299(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt384, this.anInt382, this.anInt389, this.anInt383, local7, arg2, this, this.anInt386, arg4);
			} else {
				arg1 = Static122.method291(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt382, this.anInt389, local7, arg2, this, this.anInt386, arg4);
			}
			this.anInt381 -= arg1;
			if (this.anInt381 != 0) {
				return arg1;
			}
			this.anInt384 = this.anInt388;
			if (this.anInt390 == Integer.MIN_VALUE) {
				this.anInt380 = 0;
				this.method2002();
				return arg3;
			}
			this.anInt380 = this.anInt390;
		}
		if (this.anInt386 == -256 && (this.anInt379 & 0xFF) == 0) {
			return Static102.aBoolean104 ? Static122.method301(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.method287(), this.method294(), arg3, arg2, this) : Static122.method284(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, arg3, arg2, this);
		} else if (Static102.aBoolean104) {
			return Static122.method298(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.method287(), this.method294(), arg3, arg2, this, this.anInt386, arg4);
		} else {
			return Static122.method302(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, arg3, arg2, this, this.anInt386, arg4);
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()Lclient!eb;")
	@Override
	public Class5_Sub2 method1115() {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1117(@OriginalArg(0) int arg0) {
		if (this.method289()) {
			return;
		}
		if (this.anInt381 > 0) {
			if (arg0 >= this.anInt381) {
				if (this.anInt390 == Integer.MIN_VALUE) {
					this.anInt380 = 0;
					this.method2002();
					arg0 = this.anInt381;
				} else {
					this.anInt380 = this.anInt390;
				}
				this.anInt384 = this.anInt388;
				this.anInt381 = 0;
			} else {
				this.anInt380 += this.anInt389 * arg0;
				if (Static102.aBoolean104) {
					this.anInt384 += this.anInt383 * arg0;
				}
				this.anInt381 -= arg0;
			}
		}
		@Pc(66) Class5_Sub15_Sub1 local66 = (Class5_Sub15_Sub1) super.aClass5_Sub15_3;
		@Pc(71) int local71 = this.anInt385 << 8;
		@Pc(76) int local76 = this.anInt391 << 8;
		@Pc(82) int local82 = local66.aByteArray29.length << 8;
		@Pc(86) int local86 = local76 - local71;
		if (local86 <= 0) {
			this.anInt387 = 0;
		}
		if (this.anInt379 < 0) {
			if (this.anInt386 <= 0) {
				this.method300();
				this.method2002();
				return;
			}
			this.anInt379 = 0;
		}
		if (this.anInt379 >= local82) {
			if (this.anInt386 >= 0) {
				this.method300();
				this.method2002();
				return;
			}
			this.anInt379 = local82 - 1;
		}
		this.anInt379 += this.anInt386 * arg0;
		if (this.anInt387 >= 0) {
			if (this.anInt387 > 0) {
				if (this.aBoolean12) {
					label133: {
						if (this.anInt386 < 0) {
							if (this.anInt379 >= local71) {
								return;
							}
							this.anInt379 = local71 + local71 - this.anInt379 - 1;
							this.anInt386 = -this.anInt386;
							if (--this.anInt387 == 0) {
								break label133;
							}
						}
						do {
							if (this.anInt379 < local76) {
								return;
							}
							this.anInt379 = local76 + local76 - this.anInt379 - 1;
							this.anInt386 = -this.anInt386;
							if (--this.anInt387 == 0) {
								break;
							}
							if (this.anInt379 >= local71) {
								return;
							}
							this.anInt379 = local71 + local71 - this.anInt379 - 1;
							this.anInt386 = -this.anInt386;
						} while (--this.anInt387 != 0);
					}
				} else {
					@Pc(356) int local356;
					if (this.anInt386 < 0) {
						if (this.anInt379 >= local71) {
							return;
						}
						local356 = (local76 - this.anInt379 - 1) / local86;
						if (local356 < this.anInt387) {
							this.anInt379 += local86 * local356;
							this.anInt387 -= local356;
							return;
						}
						this.anInt379 += local86 * this.anInt387;
						this.anInt387 = 0;
					} else if (this.anInt379 >= local76) {
						local356 = (this.anInt379 - local71) / local86;
						if (local356 < this.anInt387) {
							this.anInt379 -= local86 * local356;
							this.anInt387 -= local356;
							return;
						}
						this.anInt379 -= local86 * this.anInt387;
						this.anInt387 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt386 < 0) {
				if (this.anInt379 < 0) {
					this.anInt379 = -1;
					this.method300();
					this.method2002();
					return;
				}
			} else if (this.anInt379 >= local82) {
				this.anInt379 = local82;
				this.method300();
				this.method2002();
			}
		} else if (this.aBoolean12) {
			if (this.anInt386 < 0) {
				if (this.anInt379 >= local71) {
					return;
				}
				this.anInt379 = local71 + local71 - this.anInt379 - 1;
				this.anInt386 = -this.anInt386;
			}
			while (this.anInt379 >= local76) {
				this.anInt379 = local76 + local76 - this.anInt379 - 1;
				this.anInt386 = -this.anInt386;
				if (this.anInt379 >= local71) {
					return;
				}
				this.anInt379 = local71 + local71 - this.anInt379 - 1;
				this.anInt386 = -this.anInt386;
			}
		} else if (this.anInt386 < 0) {
			if (this.anInt379 < local71) {
				this.anInt379 = local76 - (local76 - 1 - this.anInt379) % local86 - 1;
			}
		} else if (this.anInt379 >= local76) {
			this.anInt379 = local71 + (this.anInt379 - local71) % local86;
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()I")
	private synchronized int method282() {
		return this.anInt381 > 0 ? this.anInt388 : this.anInt384;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public synchronized void method283(@OriginalArg(0) int arg0) {
		this.anInt387 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()Lclient!eb;")
	@Override
	public Class5_Sub2 method1114() {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "()I")
	private int method287() {
		return this.anInt384 < 0 ? this.anInt380 : (int) ((double) this.anInt380 * Math.sqrt((double) (256 - this.anInt384) * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "()Z")
	private boolean method289() {
		if (this.anInt381 != 0 && Static102.aBoolean104 != (this.anInt383 != Integer.MIN_VALUE)) {
			this.anInt380 = this.anInt390 == Integer.MIN_VALUE ? 0 : this.anInt390;
			this.anInt384 = this.anInt388;
			this.anInt381 = 0;
			if (this.anInt390 == Integer.MIN_VALUE) {
				this.method2002();
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()I")
	@Override
	public int method1116() {
		@Pc(4) int local4 = this.anInt380 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt387 == 0) {
			local4 -= local4 * this.anInt379 / (((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29.length << 8);
		} else if (this.anInt387 >= 0) {
			local4 -= local4 * this.anInt385 / ((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "()I")
	private int method294() {
		return this.anInt384 < 0 ? -this.anInt380 : (int) ((double) this.anInt380 * Math.sqrt((double) this.anInt384 * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
	@Override
	public int method1112() {
		return this.anInt380 == 0 && (this.anInt381 == 0 || this.anInt390 == 0 || this.anInt390 == Integer.MIN_VALUE) ? 0 : 1;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "()V")
	private void method300() {
		if (this.anInt381 != 0) {
			this.anInt380 = this.anInt390 == Integer.MIN_VALUE ? 0 : this.anInt390;
			this.anInt384 = this.anInt388;
			this.anInt381 = 0;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.method289()) {
			return;
		}
		if (this.anInt380 == 0 && (this.anInt381 == 0 || this.anInt390 == 0 || this.anInt390 == Integer.MIN_VALUE)) {
			this.method1117(arg2);
			return;
		}
		@Pc(24) Class5_Sub15_Sub1 local24 = (Class5_Sub15_Sub1) super.aClass5_Sub15_3;
		@Pc(29) int local29 = this.anInt385 << 8;
		@Pc(34) int local34 = this.anInt391 << 8;
		@Pc(40) int local40 = local24.aByteArray29.length << 8;
		@Pc(44) int local44 = local34 - local29;
		if (local44 <= 0) {
			this.anInt387 = 0;
		}
		@Pc(51) int local51 = arg1;
		@Pc(55) int local55 = arg2 + arg1;
		if (this.anInt379 < 0) {
			if (this.anInt386 <= 0) {
				this.method300();
				this.method2002();
				return;
			}
			this.anInt379 = 0;
		}
		if (this.anInt379 >= local40) {
			if (this.anInt386 >= 0) {
				this.method300();
				this.method2002();
				return;
			}
			this.anInt379 = local40 - 1;
		}
		if (this.anInt387 >= 0) {
			if (this.anInt387 > 0) {
				if (this.aBoolean12) {
					label134: {
						if (this.anInt386 < 0) {
							local51 = this.method281(arg0, arg1, local29, local55, local24.aByteArray29[this.anInt385]);
							if (this.anInt379 >= local29) {
								return;
							}
							this.anInt379 = local29 + local29 - this.anInt379 - 1;
							this.anInt386 = -this.anInt386;
							if (--this.anInt387 == 0) {
								break label134;
							}
						}
						do {
							local51 = this.method304(arg0, local51, local34, local55, local24.aByteArray29[this.anInt391 - 1]);
							if (this.anInt379 < local34) {
								return;
							}
							this.anInt379 = local34 + local34 - this.anInt379 - 1;
							this.anInt386 = -this.anInt386;
							if (--this.anInt387 == 0) {
								break;
							}
							local51 = this.method281(arg0, local51, local29, local55, local24.aByteArray29[this.anInt385]);
							if (this.anInt379 >= local29) {
								return;
							}
							this.anInt379 = local29 + local29 - this.anInt379 - 1;
							this.anInt386 = -this.anInt386;
						} while (--this.anInt387 != 0);
					}
				} else {
					@Pc(427) int local427;
					if (this.anInt386 < 0) {
						while (true) {
							local51 = this.method281(arg0, local51, local29, local55, local24.aByteArray29[this.anInt391 - 1]);
							if (this.anInt379 >= local29) {
								return;
							}
							local427 = (local34 - this.anInt379 - 1) / local44;
							if (local427 >= this.anInt387) {
								this.anInt379 += local44 * this.anInt387;
								this.anInt387 = 0;
								break;
							}
							this.anInt379 += local44 * local427;
							this.anInt387 -= local427;
						}
					} else {
						while (true) {
							local51 = this.method304(arg0, local51, local34, local55, local24.aByteArray29[this.anInt385]);
							if (this.anInt379 < local34) {
								return;
							}
							local427 = (this.anInt379 - local29) / local44;
							if (local427 >= this.anInt387) {
								this.anInt379 -= local44 * this.anInt387;
								this.anInt387 = 0;
								break;
							}
							this.anInt379 -= local44 * local427;
							this.anInt387 -= local427;
						}
					}
				}
			}
			if (this.anInt386 < 0) {
				this.method281(arg0, local51, 0, local55, 0);
				if (this.anInt379 < 0) {
					this.anInt379 = -1;
					this.method300();
					this.method2002();
					return;
				}
			} else {
				this.method304(arg0, local51, local40, local55, 0);
				if (this.anInt379 >= local40) {
					this.anInt379 = local40;
					this.method300();
					this.method2002();
				}
			}
		} else if (this.aBoolean12) {
			if (this.anInt386 < 0) {
				local51 = this.method281(arg0, arg1, local29, local55, local24.aByteArray29[this.anInt385]);
				if (this.anInt379 >= local29) {
					return;
				}
				this.anInt379 = local29 + local29 - this.anInt379 - 1;
				this.anInt386 = -this.anInt386;
			}
			while (true) {
				local51 = this.method304(arg0, local51, local34, local55, local24.aByteArray29[this.anInt391 - 1]);
				if (this.anInt379 < local34) {
					return;
				}
				this.anInt379 = local34 + local34 - this.anInt379 - 1;
				this.anInt386 = -this.anInt386;
				local51 = this.method281(arg0, local51, local29, local55, local24.aByteArray29[this.anInt385]);
				if (this.anInt379 >= local29) {
					return;
				}
				this.anInt379 = local29 + local29 - this.anInt379 - 1;
				this.anInt386 = -this.anInt386;
			}
		} else if (this.anInt386 < 0) {
			while (true) {
				local51 = this.method281(arg0, local51, local29, local55, local24.aByteArray29[this.anInt391 - 1]);
				if (this.anInt379 >= local29) {
					return;
				}
				this.anInt379 = local34 - (local34 - 1 - this.anInt379) % local44 - 1;
			}
		} else {
			while (true) {
				local51 = this.method304(arg0, local51, local34, local55, local24.aByteArray29[this.anInt385]);
				if (this.anInt379 < local34) {
					return;
				}
				this.anInt379 = local29 + (this.anInt379 - local29) % local44;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "([IIIII)I")
	private int method304(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt381 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt381;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt381 += arg1;
			if (this.anInt386 == 256 && (this.anInt379 & 0xFF) == 0) {
				if (Static102.aBoolean104) {
					arg1 = Static122.method293(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt384, this.anInt382, this.anInt389, this.anInt383, local7, arg2, this);
				} else {
					arg1 = Static122.method286(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt382, this.anInt389, local7, arg2, this);
				}
			} else if (Static102.aBoolean104) {
				arg1 = Static122.method296(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt384, this.anInt382, this.anInt389, this.anInt383, local7, arg2, this, this.anInt386, arg4);
			} else {
				arg1 = Static122.method288(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, this.anInt382, this.anInt389, local7, arg2, this, this.anInt386, arg4);
			}
			this.anInt381 -= arg1;
			if (this.anInt381 != 0) {
				return arg1;
			}
			this.anInt384 = this.anInt388;
			if (this.anInt390 == Integer.MIN_VALUE) {
				this.anInt380 = 0;
				this.method2002();
				return arg3;
			}
			this.anInt380 = this.anInt390;
		}
		if (this.anInt386 == 256 && (this.anInt379 & 0xFF) == 0) {
			return Static102.aBoolean104 ? Static122.method292(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.method287(), this.method294(), arg3, arg2, this) : Static122.method305(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, arg3, arg2, this);
		} else if (Static102.aBoolean104) {
			return Static122.method297(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.method287(), this.method294(), arg3, arg2, this, this.anInt386, arg4);
		} else {
			return Static122.method303(((Class5_Sub15_Sub1) super.aClass5_Sub15_3).aByteArray29, arg0, this.anInt379, arg1, this.anInt380, arg3, arg2, this, this.anInt386, arg4);
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	public synchronized void method306(@OriginalArg(0) int arg0) {
		this.method307(arg0, this.method282());
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
	private synchronized void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt380 = arg0;
		this.anInt384 = arg1;
		this.anInt381 = 0;
	}
}
