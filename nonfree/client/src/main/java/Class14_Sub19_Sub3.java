import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class14_Sub19_Sub3 extends Class14_Sub19 {

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	private int anInt5408;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	private int anInt5410;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
	public int anInt5415;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
	private final int anInt5413;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
	private final int anInt5418;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "Z")
	private final boolean aBoolean360;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
	private int anInt5414;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
	private int anInt5409;

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
	private int anInt5421;

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
	public int anInt5416;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!kr;II)V")
	public Class14_Sub19_Sub3(@OriginalArg(0) Class14_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass14_Sub11_5 = arg0;
		this.anInt5413 = arg0.anInt3561;
		this.anInt5418 = arg0.anInt3559;
		this.aBoolean360 = arg0.aBoolean229;
		this.anInt5414 = arg1;
		this.anInt5409 = arg2;
		this.anInt5421 = 8192;
		this.anInt5416 = 0;
		this.method4858();
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!kr;III)V")
	public Class14_Sub19_Sub3(@OriginalArg(0) Class14_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass14_Sub11_5 = arg0;
		this.anInt5413 = arg0.anInt3561;
		this.anInt5418 = arg0.anInt3559;
		this.aBoolean360 = arg0.aBoolean229;
		this.anInt5414 = arg1;
		this.anInt5409 = arg2;
		this.anInt5421 = arg3;
		this.anInt5416 = 0;
		this.method4858();
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "()I")
	public synchronized int method4821() {
		return this.anInt5414 < 0 ? -this.anInt5414 : this.anInt5414;
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "()V")
	private void method4823() {
		if (this.anInt5408 == 0) {
			return;
		}
		if (this.anInt5409 == Integer.MIN_VALUE) {
			this.anInt5409 = 0;
		}
		this.anInt5408 = 0;
		this.method4858();
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V")
	public synchronized void method4824() {
		this.anInt5414 = (this.anInt5414 ^ this.anInt5414 >> 31) + (this.anInt5414 >>> 31);
		this.anInt5414 = -this.anInt5414;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "()I")
	@Override
	public int method5509() {
		return this.anInt5409 == 0 && this.anInt5408 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V")
	public synchronized void method4828(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4829();
			this.method5986();
		} else if (this.anInt5411 == 0 && this.anInt5412 == 0) {
			this.anInt5408 = 0;
			this.anInt5409 = 0;
			this.anInt5420 = 0;
			this.method5986();
		} else {
			@Pc(31) int local31 = -this.anInt5420;
			if (this.anInt5420 > local31) {
				local31 = this.anInt5420;
			}
			if (-this.anInt5411 > local31) {
				local31 = -this.anInt5411;
			}
			if (this.anInt5411 > local31) {
				local31 = this.anInt5411;
			}
			if (-this.anInt5412 > local31) {
				local31 = -this.anInt5412;
			}
			if (this.anInt5412 > local31) {
				local31 = this.anInt5412;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5408 = arg0;
			this.anInt5409 = Integer.MIN_VALUE;
			this.anInt5417 = -this.anInt5420 / arg0;
			this.anInt5419 = -this.anInt5411 / arg0;
			this.anInt5415 = -this.anInt5412 / arg0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)V")
	private synchronized void method4829() {
		this.method4856(0, this.method4853());
	}

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)V")
	public synchronized void method4830(@OriginalArg(0) int arg0) {
		if (this.anInt5414 < 0) {
			this.anInt5414 = -arg0;
		} else {
			this.anInt5414 = arg0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "()Z")
	public boolean method4831() {
		return this.anInt5416 < 0 || this.anInt5416 >= ((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98.length << 8;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
	public synchronized void method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4850(arg0, arg1, this.method4853());
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "()I")
	@Override
	public int method5510() {
		@Pc(6) int local6 = this.anInt5420 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5410 == 0) {
			local6 -= local6 * this.anInt5416 / (((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98.length << 8);
		} else if (this.anInt5410 >= 0) {
			local6 -= local6 * this.anInt5413 / ((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "()Z")
	private boolean method4838() {
		@Pc(2) int local2 = this.anInt5409;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static365.method4855(local2, this.anInt5421);
			local8 = Static365.method4846(local2, this.anInt5421);
		}
		if (this.anInt5420 != local2 || this.anInt5411 != local10 || this.anInt5412 != local8) {
			if (this.anInt5420 < local2) {
				this.anInt5417 = 1;
				this.anInt5408 = local2 - this.anInt5420;
			} else if (this.anInt5420 > local2) {
				this.anInt5417 = -1;
				this.anInt5408 = this.anInt5420 - local2;
			} else {
				this.anInt5417 = 0;
			}
			if (this.anInt5411 < local10) {
				this.anInt5419 = 1;
				if (this.anInt5408 == 0 || this.anInt5408 > local10 - this.anInt5411) {
					this.anInt5408 = local10 - this.anInt5411;
				}
			} else if (this.anInt5411 > local10) {
				this.anInt5419 = -1;
				if (this.anInt5408 == 0 || this.anInt5408 > this.anInt5411 - local10) {
					this.anInt5408 = this.anInt5411 - local10;
				}
			} else {
				this.anInt5419 = 0;
			}
			if (this.anInt5412 < local8) {
				this.anInt5415 = 1;
				if (this.anInt5408 == 0 || this.anInt5408 > local8 - this.anInt5412) {
					this.anInt5408 = local8 - this.anInt5412;
				}
			} else if (this.anInt5412 > local8) {
				this.anInt5415 = -1;
				if (this.anInt5408 == 0 || this.anInt5408 > this.anInt5412 - local8) {
					this.anInt5408 = this.anInt5412 - local8;
				}
			} else {
				this.anInt5415 = 0;
			}
			return false;
		} else if (this.anInt5409 == Integer.MIN_VALUE) {
			this.anInt5409 = 0;
			this.anInt5420 = this.anInt5411 = this.anInt5412 = 0;
			this.method5986();
			return true;
		} else {
			this.method4858();
			return false;
		}
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "()I")
	public synchronized int method4839() {
		return this.anInt5409 == Integer.MIN_VALUE ? 0 : this.anInt5409;
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "(I)V")
	public synchronized void method4840(@OriginalArg(0) int arg0) {
		this.anInt5410 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "(I)V")
	public synchronized void method4841(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5416 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()Lclient!kp;")
	@Override
	public Class14_Sub19 method5506() {
		return null;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIIII)I")
	private int method4843(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5408 <= 0) {
				if (this.anInt5414 == -256 && (this.anInt5416 & 0xFF) == 0) {
					if (Static111.aBoolean172) {
						return Static365.method4836(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, arg3, arg2, this);
					}
					return Static365.method4859(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, arg3, arg2, this);
				}
				if (Static111.aBoolean172) {
					return Static365.method4822(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, arg3, arg2, this, this.anInt5414, arg4);
				}
				return Static365.method4847(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, arg3, arg2, this, this.anInt5414, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5408;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5408 += arg1;
			if (this.anInt5414 == -256 && (this.anInt5416 & 0xFF) == 0) {
				if (Static111.aBoolean172) {
					arg1 = Static365.method4849(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, this.anInt5419, this.anInt5415, local5, arg2, this);
				} else {
					arg1 = Static365.method4852(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, this.anInt5417, local5, arg2, this);
				}
			} else if (Static111.aBoolean172) {
				arg1 = Static365.method4851(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, this.anInt5419, this.anInt5415, local5, arg2, this, this.anInt5414, arg4);
			} else {
				arg1 = Static365.method4837(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, this.anInt5417, local5, arg2, this, this.anInt5414, arg4);
			}
			this.anInt5408 -= arg1;
			if (this.anInt5408 != 0) {
				return arg1;
			}
		} while (!this.method4838());
		return arg3;
	}

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "(I)V")
	public synchronized void method4844(@OriginalArg(0) int arg0) {
		this.method4856(arg0 << 6, this.method4853());
	}

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "()Z")
	public boolean method4845() {
		return this.anInt5408 != 0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5409 == 0 && this.anInt5408 == 0) {
			this.method5507(arg2);
			return;
		}
		@Pc(13) Class14_Sub11_Sub1 local13 = (Class14_Sub11_Sub1) super.aClass14_Sub11_5;
		@Pc(18) int local18 = this.anInt5413 << 8;
		@Pc(23) int local23 = this.anInt5418 << 8;
		@Pc(29) int local29 = local13.aByteArray98.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5410 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5416 < 0) {
			if (this.anInt5414 <= 0) {
				this.method4823();
				this.method5986();
				return;
			}
			this.anInt5416 = 0;
		}
		if (this.anInt5416 >= local29) {
			if (this.anInt5414 >= 0) {
				this.method4823();
				this.method5986();
				return;
			}
			this.anInt5416 = local29 - 1;
		}
		if (this.anInt5410 >= 0) {
			if (this.anInt5410 > 0) {
				if (this.aBoolean360) {
					label130: {
						if (this.anInt5414 < 0) {
							local40 = this.method4843(arg0, arg1, local18, local44, local13.aByteArray98[this.anInt5413]);
							if (this.anInt5416 >= local18) {
								return;
							}
							this.anInt5416 = local18 + local18 - this.anInt5416 - 1;
							this.anInt5414 = -this.anInt5414;
							if (--this.anInt5410 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4857(arg0, local40, local23, local44, local13.aByteArray98[this.anInt5418 - 1]);
							if (this.anInt5416 < local23) {
								return;
							}
							this.anInt5416 = local23 + local23 - this.anInt5416 - 1;
							this.anInt5414 = -this.anInt5414;
							if (--this.anInt5410 == 0) {
								break;
							}
							local40 = this.method4843(arg0, local40, local18, local44, local13.aByteArray98[this.anInt5413]);
							if (this.anInt5416 >= local18) {
								return;
							}
							this.anInt5416 = local18 + local18 - this.anInt5416 - 1;
							this.anInt5414 = -this.anInt5414;
						} while (--this.anInt5410 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5414 < 0) {
						while (true) {
							local40 = this.method4843(arg0, local40, local18, local44, local13.aByteArray98[this.anInt5418 - 1]);
							if (this.anInt5416 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5416 - 1) / local33;
							if (local416 >= this.anInt5410) {
								this.anInt5416 += local33 * this.anInt5410;
								this.anInt5410 = 0;
								break;
							}
							this.anInt5416 += local33 * local416;
							this.anInt5410 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4857(arg0, local40, local23, local44, local13.aByteArray98[this.anInt5413]);
							if (this.anInt5416 < local23) {
								return;
							}
							local416 = (this.anInt5416 - local18) / local33;
							if (local416 >= this.anInt5410) {
								this.anInt5416 -= local33 * this.anInt5410;
								this.anInt5410 = 0;
								break;
							}
							this.anInt5416 -= local33 * local416;
							this.anInt5410 -= local416;
						}
					}
				}
			}
			if (this.anInt5414 < 0) {
				this.method4843(arg0, local40, 0, local44, 0);
				if (this.anInt5416 < 0) {
					this.anInt5416 = -1;
					this.method4823();
					this.method5986();
					return;
				}
			} else {
				this.method4857(arg0, local40, local29, local44, 0);
				if (this.anInt5416 >= local29) {
					this.anInt5416 = local29;
					this.method4823();
					this.method5986();
				}
			}
		} else if (this.aBoolean360) {
			if (this.anInt5414 < 0) {
				local40 = this.method4843(arg0, arg1, local18, local44, local13.aByteArray98[this.anInt5413]);
				if (this.anInt5416 >= local18) {
					return;
				}
				this.anInt5416 = local18 + local18 - this.anInt5416 - 1;
				this.anInt5414 = -this.anInt5414;
			}
			while (true) {
				local40 = this.method4857(arg0, local40, local23, local44, local13.aByteArray98[this.anInt5418 - 1]);
				if (this.anInt5416 < local23) {
					return;
				}
				this.anInt5416 = local23 + local23 - this.anInt5416 - 1;
				this.anInt5414 = -this.anInt5414;
				local40 = this.method4843(arg0, local40, local18, local44, local13.aByteArray98[this.anInt5413]);
				if (this.anInt5416 >= local18) {
					return;
				}
				this.anInt5416 = local18 + local18 - this.anInt5416 - 1;
				this.anInt5414 = -this.anInt5414;
			}
		} else if (this.anInt5414 < 0) {
			while (true) {
				local40 = this.method4843(arg0, local40, local18, local44, local13.aByteArray98[this.anInt5418 - 1]);
				if (this.anInt5416 >= local18) {
					return;
				}
				this.anInt5416 = local23 - (local23 - 1 - this.anInt5416) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4857(arg0, local40, local23, local44, local13.aByteArray98[this.anInt5413]);
				if (this.anInt5416 < local23) {
					return;
				}
				this.anInt5416 = local18 + (this.anInt5416 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
	public synchronized void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4856(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static365.method4855(arg1, arg2);
		@Pc(14) int local14 = Static365.method4846(arg1, arg2);
		if (this.anInt5411 == local10 && this.anInt5412 == local14) {
			this.anInt5408 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5420;
		if (this.anInt5420 - arg1 > local31) {
			local31 = this.anInt5420 - arg1;
		}
		if (local10 - this.anInt5411 > local31) {
			local31 = local10 - this.anInt5411;
		}
		if (this.anInt5411 - local10 > local31) {
			local31 = this.anInt5411 - local10;
		}
		if (local14 - this.anInt5412 > local31) {
			local31 = local14 - this.anInt5412;
		}
		if (this.anInt5412 - local14 > local31) {
			local31 = this.anInt5412 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5408 = arg0;
		this.anInt5409 = arg1;
		this.anInt5421 = arg2;
		this.anInt5417 = (arg1 - this.anInt5420) / arg0;
		this.anInt5419 = (local10 - this.anInt5411) / arg0;
		this.anInt5415 = (local14 - this.anInt5412) / arg0;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "()Lclient!kp;")
	@Override
	public Class14_Sub19 method5508() {
		return null;
	}

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "()I")
	public synchronized int method4853() {
		return this.anInt5421 < 0 ? -1 : this.anInt5421;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(II)V")
	private synchronized void method4856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5409 = arg0;
		this.anInt5421 = arg1;
		this.anInt5408 = 0;
		this.method4858();
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "([IIIII)I")
	private int method4857(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5408 <= 0) {
				if (this.anInt5414 == 256 && (this.anInt5416 & 0xFF) == 0) {
					if (Static111.aBoolean172) {
						return Static365.method4854(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, arg3, arg2, this);
					}
					return Static365.method4848(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, arg3, arg2, this);
				}
				if (Static111.aBoolean172) {
					return Static365.method4860(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, arg3, arg2, this, this.anInt5414, arg4);
				}
				return Static365.method4825(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, arg3, arg2, this, this.anInt5414, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5408;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5408 += arg1;
			if (this.anInt5414 == 256 && (this.anInt5416 & 0xFF) == 0) {
				if (Static111.aBoolean172) {
					arg1 = Static365.method4832(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, this.anInt5419, this.anInt5415, local5, arg2, this);
				} else {
					arg1 = Static365.method4834(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, this.anInt5417, local5, arg2, this);
				}
			} else if (Static111.aBoolean172) {
				arg1 = Static365.method4826(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5411, this.anInt5412, this.anInt5419, this.anInt5415, local5, arg2, this, this.anInt5414, arg4);
			} else {
				arg1 = Static365.method4827(((Class14_Sub11_Sub1) super.aClass14_Sub11_5).aByteArray98, arg0, this.anInt5416, arg1, this.anInt5420, this.anInt5417, local5, arg2, this, this.anInt5414, arg4);
			}
			this.anInt5408 -= arg1;
			if (this.anInt5408 != 0) {
				return arg1;
			}
		} while (!this.method4838());
		return arg3;
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "()V")
	private void method4858() {
		this.anInt5420 = this.anInt5409;
		this.anInt5411 = Static365.method4855(this.anInt5409, this.anInt5421);
		this.anInt5412 = Static365.method4846(this.anInt5409, this.anInt5421);
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5507(@OriginalArg(0) int arg0) {
		if (this.anInt5408 > 0) {
			if (arg0 >= this.anInt5408) {
				if (this.anInt5409 == Integer.MIN_VALUE) {
					this.anInt5409 = 0;
					this.anInt5420 = this.anInt5411 = this.anInt5412 = 0;
					this.method5986();
					arg0 = this.anInt5408;
				}
				this.anInt5408 = 0;
				this.method4858();
			} else {
				this.anInt5420 += this.anInt5417 * arg0;
				this.anInt5411 += this.anInt5419 * arg0;
				this.anInt5412 += this.anInt5415 * arg0;
				this.anInt5408 -= arg0;
			}
		}
		@Pc(71) Class14_Sub11_Sub1 local71 = (Class14_Sub11_Sub1) super.aClass14_Sub11_5;
		@Pc(76) int local76 = this.anInt5413 << 8;
		@Pc(81) int local81 = this.anInt5418 << 8;
		@Pc(87) int local87 = local71.aByteArray98.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5410 = 0;
		}
		if (this.anInt5416 < 0) {
			if (this.anInt5414 <= 0) {
				this.method4823();
				this.method5986();
				return;
			}
			this.anInt5416 = 0;
		}
		if (this.anInt5416 >= local87) {
			if (this.anInt5414 >= 0) {
				this.method4823();
				this.method5986();
				return;
			}
			this.anInt5416 = local87 - 1;
		}
		this.anInt5416 += this.anInt5414 * arg0;
		if (this.anInt5410 >= 0) {
			if (this.anInt5410 > 0) {
				if (this.aBoolean360) {
					label125: {
						if (this.anInt5414 < 0) {
							if (this.anInt5416 >= local76) {
								return;
							}
							this.anInt5416 = local76 + local76 - this.anInt5416 - 1;
							this.anInt5414 = -this.anInt5414;
							if (--this.anInt5410 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5416 < local81) {
								return;
							}
							this.anInt5416 = local81 + local81 - this.anInt5416 - 1;
							this.anInt5414 = -this.anInt5414;
							if (--this.anInt5410 == 0) {
								break;
							}
							if (this.anInt5416 >= local76) {
								return;
							}
							this.anInt5416 = local76 + local76 - this.anInt5416 - 1;
							this.anInt5414 = -this.anInt5414;
						} while (--this.anInt5410 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5414 < 0) {
						if (this.anInt5416 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5416 - 1) / local91;
						if (local361 < this.anInt5410) {
							this.anInt5416 += local91 * local361;
							this.anInt5410 -= local361;
							return;
						}
						this.anInt5416 += local91 * this.anInt5410;
						this.anInt5410 = 0;
					} else if (this.anInt5416 >= local81) {
						local361 = (this.anInt5416 - local76) / local91;
						if (local361 < this.anInt5410) {
							this.anInt5416 -= local91 * local361;
							this.anInt5410 -= local361;
							return;
						}
						this.anInt5416 -= local91 * this.anInt5410;
						this.anInt5410 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5414 < 0) {
				if (this.anInt5416 < 0) {
					this.anInt5416 = -1;
					this.method4823();
					this.method5986();
					return;
				}
			} else if (this.anInt5416 >= local87) {
				this.anInt5416 = local87;
				this.method4823();
				this.method5986();
			}
		} else if (this.aBoolean360) {
			if (this.anInt5414 < 0) {
				if (this.anInt5416 >= local76) {
					return;
				}
				this.anInt5416 = local76 + local76 - this.anInt5416 - 1;
				this.anInt5414 = -this.anInt5414;
			}
			while (this.anInt5416 >= local81) {
				this.anInt5416 = local81 + local81 - this.anInt5416 - 1;
				this.anInt5414 = -this.anInt5414;
				if (this.anInt5416 >= local76) {
					return;
				}
				this.anInt5416 = local76 + local76 - this.anInt5416 - 1;
				this.anInt5414 = -this.anInt5414;
			}
		} else if (this.anInt5414 < 0) {
			if (this.anInt5416 < local76) {
				this.anInt5416 = local81 - (local81 - 1 - this.anInt5416) % local91 - 1;
			}
		} else if (this.anInt5416 >= local81) {
			this.anInt5416 = local76 + (this.anInt5416 - local76) % local91;
		}
	}
}
