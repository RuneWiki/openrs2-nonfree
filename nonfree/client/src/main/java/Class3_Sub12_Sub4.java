import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class3_Sub12_Sub4 extends Class3_Sub12 {

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
	private int anInt10428;

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
	public int anInt10429;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	public int anInt10430;

	@OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
	public int anInt10431;

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	public int anInt10434;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
	public int anInt10435;

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	public int anInt10436;

	@OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
	private int anInt10441;

	@OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
	private final int anInt10440;

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
	private final int anInt10437;

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "Z")
	private final boolean aBoolean725;

	@OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
	private int anInt10439;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
	private int anInt10432;

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
	private int anInt10438;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
	public int anInt10433;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!pv;III)V")
	public Class3_Sub12_Sub4(@OriginalArg(0) Class3_Sub39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub39_6 = arg0;
		this.anInt10440 = arg0.anInt7569;
		this.anInt10437 = arg0.anInt7567;
		this.aBoolean725 = arg0.aBoolean534;
		this.anInt10439 = arg1;
		this.anInt10432 = arg2;
		this.anInt10438 = arg3;
		this.anInt10433 = 0;
		this.method8545();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8942(@OriginalArg(0) int arg0) {
		if (this.anInt10441 > 0) {
			if (arg0 >= this.anInt10441) {
				if (this.anInt10432 == Integer.MIN_VALUE) {
					this.anInt10432 = 0;
					this.anInt10436 = this.anInt10435 = this.anInt10431 = 0;
					this.method9034();
					arg0 = this.anInt10441;
				}
				this.anInt10441 = 0;
				this.method8545();
			} else {
				this.anInt10436 += this.anInt10434 * arg0;
				this.anInt10435 += this.anInt10430 * arg0;
				this.anInt10431 += this.anInt10429 * arg0;
				this.anInt10441 -= arg0;
			}
		}
		@Pc(71) Class3_Sub39_Sub1 local71 = (Class3_Sub39_Sub1) super.aClass3_Sub39_6;
		@Pc(76) int local76 = this.anInt10440 << 8;
		@Pc(81) int local81 = this.anInt10437 << 8;
		@Pc(87) int local87 = local71.aByteArray67.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt10428 = 0;
		}
		if (this.anInt10433 < 0) {
			if (this.anInt10439 <= 0) {
				this.method8541();
				this.method9034();
				return;
			}
			this.anInt10433 = 0;
		}
		if (this.anInt10433 >= local87) {
			if (this.anInt10439 >= 0) {
				this.method8541();
				this.method9034();
				return;
			}
			this.anInt10433 = local87 - 1;
		}
		this.anInt10433 += this.anInt10439 * arg0;
		if (this.anInt10428 >= 0) {
			if (this.anInt10428 > 0) {
				if (this.aBoolean725) {
					label125: {
						if (this.anInt10439 < 0) {
							if (this.anInt10433 >= local76) {
								return;
							}
							this.anInt10433 = local76 + local76 - this.anInt10433 - 1;
							this.anInt10439 = -this.anInt10439;
							if (--this.anInt10428 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt10433 < local81) {
								return;
							}
							this.anInt10433 = local81 + local81 - this.anInt10433 - 1;
							this.anInt10439 = -this.anInt10439;
							if (--this.anInt10428 == 0) {
								break;
							}
							if (this.anInt10433 >= local76) {
								return;
							}
							this.anInt10433 = local76 + local76 - this.anInt10433 - 1;
							this.anInt10439 = -this.anInt10439;
						} while (--this.anInt10428 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt10439 < 0) {
						if (this.anInt10433 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt10433 - 1) / local91;
						if (local361 < this.anInt10428) {
							this.anInt10433 += local91 * local361;
							this.anInt10428 -= local361;
							return;
						}
						this.anInt10433 += local91 * this.anInt10428;
						this.anInt10428 = 0;
					} else if (this.anInt10433 >= local81) {
						local361 = (this.anInt10433 - local76) / local91;
						if (local361 < this.anInt10428) {
							this.anInt10433 -= local91 * local361;
							this.anInt10428 -= local361;
							return;
						}
						this.anInt10433 -= local91 * this.anInt10428;
						this.anInt10428 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt10439 < 0) {
				if (this.anInt10433 < 0) {
					this.anInt10433 = -1;
					this.method8541();
					this.method9034();
					return;
				}
			} else if (this.anInt10433 >= local87) {
				this.anInt10433 = local87;
				this.method8541();
				this.method9034();
			}
		} else if (this.aBoolean725) {
			if (this.anInt10439 < 0) {
				if (this.anInt10433 >= local76) {
					return;
				}
				this.anInt10433 = local76 + local76 - this.anInt10433 - 1;
				this.anInt10439 = -this.anInt10439;
			}
			while (this.anInt10433 >= local81) {
				this.anInt10433 = local81 + local81 - this.anInt10433 - 1;
				this.anInt10439 = -this.anInt10439;
				if (this.anInt10433 >= local76) {
					return;
				}
				this.anInt10433 = local76 + local76 - this.anInt10433 - 1;
				this.anInt10439 = -this.anInt10439;
			}
		} else if (this.anInt10439 < 0) {
			if (this.anInt10433 < local76) {
				this.anInt10433 = local81 - (local81 - 1 - this.anInt10433) % local91 - 1;
			}
		} else if (this.anInt10433 >= local81) {
			this.anInt10433 = local76 + (this.anInt10433 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	public synchronized void method8524(@OriginalArg(0) int arg0) {
		if (this.anInt10439 < 0) {
			this.anInt10439 = -arg0;
		} else {
			this.anInt10439 = arg0;
		}
	}

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "()Z")
	public boolean method8525() {
		return this.anInt10433 < 0 || this.anInt10433 >= ((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67.length << 8;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "([IIIII)I")
	private int method8526(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10441 <= 0) {
				if (this.anInt10439 == -256 && (this.anInt10433 & 0xFF) == 0) {
					if (Static608.aBoolean713) {
						return Static687.method8539(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, arg3, arg2, this);
					}
					return Static687.method8537(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, arg3, arg2, this);
				}
				if (Static608.aBoolean713) {
					return Static687.method8547(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, arg3, arg2, this, this.anInt10439, arg4);
				}
				return Static687.method8552(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, arg3, arg2, this, this.anInt10439, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10441;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10441 += arg1;
			if (this.anInt10439 == -256 && (this.anInt10433 & 0xFF) == 0) {
				if (Static608.aBoolean713) {
					arg1 = Static687.method8555(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, this.anInt10430, this.anInt10429, local5, arg2, this);
				} else {
					arg1 = Static687.method8529(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, this.anInt10434, local5, arg2, this);
				}
			} else if (Static608.aBoolean713) {
				arg1 = Static687.method8538(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, this.anInt10430, this.anInt10429, local5, arg2, this, this.anInt10439, arg4);
			} else {
				arg1 = Static687.method8553(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, this.anInt10434, local5, arg2, this, this.anInt10439, arg4);
			}
			this.anInt10441 -= arg1;
			if (this.anInt10441 != 0) {
				return arg1;
			}
		} while (!this.method8558());
		return arg3;
	}

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "()I")
	public synchronized int method8527() {
		return this.anInt10432 == Integer.MIN_VALUE ? 0 : this.anInt10432;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	public synchronized void method8528(@OriginalArg(0) int arg0) {
		this.anInt10428 = arg0;
	}

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "()I")
	public synchronized int method8531() {
		return this.anInt10439 < 0 ? -this.anInt10439 : this.anInt10439;
	}

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
	public synchronized void method8532(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method8542();
			this.method9034();
		} else if (this.anInt10435 == 0 && this.anInt10431 == 0) {
			this.anInt10441 = 0;
			this.anInt10432 = 0;
			this.anInt10436 = 0;
			this.method9034();
		} else {
			@Pc(31) int local31 = -this.anInt10436;
			if (this.anInt10436 > local31) {
				local31 = this.anInt10436;
			}
			if (-this.anInt10435 > local31) {
				local31 = -this.anInt10435;
			}
			if (this.anInt10435 > local31) {
				local31 = this.anInt10435;
			}
			if (-this.anInt10431 > local31) {
				local31 = -this.anInt10431;
			}
			if (this.anInt10431 > local31) {
				local31 = this.anInt10431;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt10441 = arg0;
			this.anInt10432 = Integer.MIN_VALUE;
			this.anInt10434 = -this.anInt10436 / arg0;
			this.anInt10430 = -this.anInt10435 / arg0;
			this.anInt10429 = -this.anInt10431 / arg0;
		}
	}

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "(I)V")
	public synchronized void method8535(@OriginalArg(0) int arg0) {
		this.method8536(arg0 << 6, this.method8559());
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(II)V")
	private synchronized void method8536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10432 = arg0;
		this.anInt10438 = arg1;
		this.anInt10441 = 0;
		this.method8545();
	}

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "(I)V")
	public synchronized void method8540(@OriginalArg(0) int arg0) {
		this.method8536(this.method8527(), arg0);
	}

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "()V")
	private void method8541() {
		if (this.anInt10441 == 0) {
			return;
		}
		if (this.anInt10432 == Integer.MIN_VALUE) {
			this.anInt10432 = 0;
		}
		this.anInt10441 = 0;
		this.method8545();
	}

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "(I)V")
	private synchronized void method8542() {
		this.method8536(0, this.method8559());
	}

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "()Z")
	public boolean method8543() {
		return this.anInt10441 != 0;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
	public synchronized void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method8536(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static687.method8534(arg1, arg2);
		@Pc(14) int local14 = Static687.method8548(arg1, arg2);
		if (this.anInt10435 == local10 && this.anInt10431 == local14) {
			this.anInt10441 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt10436;
		if (this.anInt10436 - arg1 > local31) {
			local31 = this.anInt10436 - arg1;
		}
		if (local10 - this.anInt10435 > local31) {
			local31 = local10 - this.anInt10435;
		}
		if (this.anInt10435 - local10 > local31) {
			local31 = this.anInt10435 - local10;
		}
		if (local14 - this.anInt10431 > local31) {
			local31 = local14 - this.anInt10431;
		}
		if (this.anInt10431 - local14 > local31) {
			local31 = this.anInt10431 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt10441 = arg0;
		this.anInt10432 = arg1;
		this.anInt10438 = arg2;
		this.anInt10434 = (arg1 - this.anInt10436) / arg0;
		this.anInt10430 = (local10 - this.anInt10435) / arg0;
		this.anInt10429 = (local14 - this.anInt10431) / arg0;
	}

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "()V")
	private void method8545() {
		this.anInt10436 = this.anInt10432;
		this.anInt10435 = Static687.method8534(this.anInt10432, this.anInt10438);
		this.anInt10431 = Static687.method8548(this.anInt10432, this.anInt10438);
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8945() {
		return null;
	}

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "()I")
	@Override
	public int method8947() {
		return this.anInt10432 == 0 && this.anInt10441 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
	public synchronized void method8550() {
		this.anInt10439 = (this.anInt10439 ^ this.anInt10439 >> 31) + (this.anInt10439 >>> 31);
		this.anInt10439 = -this.anInt10439;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "([IIIII)I")
	private int method8551(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10441 <= 0) {
				if (this.anInt10439 == 256 && (this.anInt10433 & 0xFF) == 0) {
					if (Static608.aBoolean713) {
						return Static687.method8521(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, arg3, arg2, this);
					}
					return Static687.method8520(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, arg3, arg2, this);
				}
				if (Static608.aBoolean713) {
					return Static687.method8549(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, arg3, arg2, this, this.anInt10439, arg4);
				}
				return Static687.method8522(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, arg3, arg2, this, this.anInt10439, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10441;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10441 += arg1;
			if (this.anInt10439 == 256 && (this.anInt10433 & 0xFF) == 0) {
				if (Static608.aBoolean713) {
					arg1 = Static687.method8533(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, this.anInt10430, this.anInt10429, local5, arg2, this);
				} else {
					arg1 = Static687.method8556(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, this.anInt10434, local5, arg2, this);
				}
			} else if (Static608.aBoolean713) {
				arg1 = Static687.method8530(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10435, this.anInt10431, this.anInt10430, this.anInt10429, local5, arg2, this, this.anInt10439, arg4);
			} else {
				arg1 = Static687.method8523(((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67, arg0, this.anInt10433, arg1, this.anInt10436, this.anInt10434, local5, arg2, this, this.anInt10439, arg4);
			}
			this.anInt10441 -= arg1;
			if (this.anInt10441 != 0) {
				return arg1;
			}
		} while (!this.method8558());
		return arg3;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10432 == 0 && this.anInt10441 == 0) {
			this.method8942(arg2);
			return;
		}
		@Pc(13) Class3_Sub39_Sub1 local13 = (Class3_Sub39_Sub1) super.aClass3_Sub39_6;
		@Pc(18) int local18 = this.anInt10440 << 8;
		@Pc(23) int local23 = this.anInt10437 << 8;
		@Pc(29) int local29 = local13.aByteArray67.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt10428 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt10433 < 0) {
			if (this.anInt10439 <= 0) {
				this.method8541();
				this.method9034();
				return;
			}
			this.anInt10433 = 0;
		}
		if (this.anInt10433 >= local29) {
			if (this.anInt10439 >= 0) {
				this.method8541();
				this.method9034();
				return;
			}
			this.anInt10433 = local29 - 1;
		}
		if (this.anInt10428 >= 0) {
			if (this.anInt10428 > 0) {
				if (this.aBoolean725) {
					label130: {
						if (this.anInt10439 < 0) {
							local40 = this.method8526(arg0, arg1, local18, local44, local13.aByteArray67[this.anInt10440]);
							if (this.anInt10433 >= local18) {
								return;
							}
							this.anInt10433 = local18 + local18 - this.anInt10433 - 1;
							this.anInt10439 = -this.anInt10439;
							if (--this.anInt10428 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method8551(arg0, local40, local23, local44, local13.aByteArray67[this.anInt10437 - 1]);
							if (this.anInt10433 < local23) {
								return;
							}
							this.anInt10433 = local23 + local23 - this.anInt10433 - 1;
							this.anInt10439 = -this.anInt10439;
							if (--this.anInt10428 == 0) {
								break;
							}
							local40 = this.method8526(arg0, local40, local18, local44, local13.aByteArray67[this.anInt10440]);
							if (this.anInt10433 >= local18) {
								return;
							}
							this.anInt10433 = local18 + local18 - this.anInt10433 - 1;
							this.anInt10439 = -this.anInt10439;
						} while (--this.anInt10428 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt10439 < 0) {
						while (true) {
							local40 = this.method8526(arg0, local40, local18, local44, local13.aByteArray67[this.anInt10437 - 1]);
							if (this.anInt10433 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt10433 - 1) / local33;
							if (local416 >= this.anInt10428) {
								this.anInt10433 += local33 * this.anInt10428;
								this.anInt10428 = 0;
								break;
							}
							this.anInt10433 += local33 * local416;
							this.anInt10428 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method8551(arg0, local40, local23, local44, local13.aByteArray67[this.anInt10440]);
							if (this.anInt10433 < local23) {
								return;
							}
							local416 = (this.anInt10433 - local18) / local33;
							if (local416 >= this.anInt10428) {
								this.anInt10433 -= local33 * this.anInt10428;
								this.anInt10428 = 0;
								break;
							}
							this.anInt10433 -= local33 * local416;
							this.anInt10428 -= local416;
						}
					}
				}
			}
			if (this.anInt10439 < 0) {
				this.method8526(arg0, local40, 0, local44, 0);
				if (this.anInt10433 < 0) {
					this.anInt10433 = -1;
					this.method8541();
					this.method9034();
					return;
				}
			} else {
				this.method8551(arg0, local40, local29, local44, 0);
				if (this.anInt10433 >= local29) {
					this.anInt10433 = local29;
					this.method8541();
					this.method9034();
				}
			}
		} else if (this.aBoolean725) {
			if (this.anInt10439 < 0) {
				local40 = this.method8526(arg0, arg1, local18, local44, local13.aByteArray67[this.anInt10440]);
				if (this.anInt10433 >= local18) {
					return;
				}
				this.anInt10433 = local18 + local18 - this.anInt10433 - 1;
				this.anInt10439 = -this.anInt10439;
			}
			while (true) {
				local40 = this.method8551(arg0, local40, local23, local44, local13.aByteArray67[this.anInt10437 - 1]);
				if (this.anInt10433 < local23) {
					return;
				}
				this.anInt10433 = local23 + local23 - this.anInt10433 - 1;
				this.anInt10439 = -this.anInt10439;
				local40 = this.method8526(arg0, local40, local18, local44, local13.aByteArray67[this.anInt10440]);
				if (this.anInt10433 >= local18) {
					return;
				}
				this.anInt10433 = local18 + local18 - this.anInt10433 - 1;
				this.anInt10439 = -this.anInt10439;
			}
		} else if (this.anInt10439 < 0) {
			while (true) {
				local40 = this.method8526(arg0, local40, local18, local44, local13.aByteArray67[this.anInt10437 - 1]);
				if (this.anInt10433 >= local18) {
					return;
				}
				this.anInt10433 = local23 - (local23 - 1 - this.anInt10433) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method8551(arg0, local40, local23, local44, local13.aByteArray67[this.anInt10440]);
				if (this.anInt10433 < local23) {
					return;
				}
				this.anInt10433 = local18 + (this.anInt10433 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "(I)V")
	public synchronized void method8554(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt10433 = arg0;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "()I")
	@Override
	public int method8943() {
		@Pc(6) int local6 = this.anInt10436 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt10428 == 0) {
			local6 -= local6 * this.anInt10433 / (((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67.length << 8);
		} else if (this.anInt10428 >= 0) {
			local6 -= local6 * this.anInt10440 / ((Class3_Sub39_Sub1) super.aClass3_Sub39_6).aByteArray67.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "(II)V")
	public synchronized void method8557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8544(arg0, arg1, this.method8559());
	}

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "()Z")
	private boolean method8558() {
		@Pc(2) int local2 = this.anInt10432;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static687.method8534(local2, this.anInt10438);
			local8 = Static687.method8548(local2, this.anInt10438);
		}
		if (this.anInt10436 != local2 || this.anInt10435 != local10 || this.anInt10431 != local8) {
			if (this.anInt10436 < local2) {
				this.anInt10434 = 1;
				this.anInt10441 = local2 - this.anInt10436;
			} else if (this.anInt10436 > local2) {
				this.anInt10434 = -1;
				this.anInt10441 = this.anInt10436 - local2;
			} else {
				this.anInt10434 = 0;
			}
			if (this.anInt10435 < local10) {
				this.anInt10430 = 1;
				if (this.anInt10441 == 0 || this.anInt10441 > local10 - this.anInt10435) {
					this.anInt10441 = local10 - this.anInt10435;
				}
			} else if (this.anInt10435 > local10) {
				this.anInt10430 = -1;
				if (this.anInt10441 == 0 || this.anInt10441 > this.anInt10435 - local10) {
					this.anInt10441 = this.anInt10435 - local10;
				}
			} else {
				this.anInt10430 = 0;
			}
			if (this.anInt10431 < local8) {
				this.anInt10429 = 1;
				if (this.anInt10441 == 0 || this.anInt10441 > local8 - this.anInt10431) {
					this.anInt10441 = local8 - this.anInt10431;
				}
			} else if (this.anInt10431 > local8) {
				this.anInt10429 = -1;
				if (this.anInt10441 == 0 || this.anInt10441 > this.anInt10431 - local8) {
					this.anInt10441 = this.anInt10431 - local8;
				}
			} else {
				this.anInt10429 = 0;
			}
			return false;
		} else if (this.anInt10432 == Integer.MIN_VALUE) {
			this.anInt10432 = 0;
			this.anInt10436 = this.anInt10435 = this.anInt10431 = 0;
			this.method9034();
			return true;
		} else {
			this.method8545();
			return false;
		}
	}

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "()I")
	public synchronized int method8559() {
		return this.anInt10438 < 0 ? -1 : this.anInt10438;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8946() {
		return null;
	}
}
