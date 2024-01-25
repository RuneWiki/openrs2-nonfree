import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class2_Sub23_Sub2 extends Class2_Sub23 {

	@OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
	private int anInt4943;

	@OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
	public int anInt4944;

	@OriginalMember(owner = "client!kda", name = "C", descriptor = "I")
	private int anInt4947;

	@OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!kda", name = "B", descriptor = "I")
	public int anInt4950;

	@OriginalMember(owner = "client!kda", name = "z", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
	private final int anInt4956;

	@OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
	private final int anInt4946;

	@OriginalMember(owner = "client!kda", name = "x", descriptor = "Z")
	private final boolean aBoolean423;

	@OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
	private int anInt4948;

	@OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
	private int anInt4955;

	@OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
	private int anInt4945;

	@OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
	public int anInt4951;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!rb;III)V")
	public Class2_Sub23_Sub2(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub4_6 = arg0;
		this.anInt4956 = arg0.anInt8533;
		this.anInt4946 = arg0.anInt8534;
		this.aBoolean423 = arg0.aBoolean731;
		this.anInt4948 = arg1;
		this.anInt4955 = arg2;
		this.anInt4945 = arg3;
		this.anInt4951 = 0;
		this.method4507();
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)V")
	private synchronized void method4480() {
		this.method4513(0, this.method4505());
	}

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "(I)V")
	public synchronized void method4481(@OriginalArg(0) int arg0) {
		if (this.anInt4948 < 0) {
			this.anInt4948 = -arg0;
		} else {
			this.anInt4948 = arg0;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "()I")
	@Override
	public int method7672() {
		@Pc(6) int local6 = this.anInt4944 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4943 == 0) {
			local6 -= local6 * this.anInt4951 / (((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102.length << 8);
		} else if (this.anInt4943 >= 0) {
			local6 -= local6 * this.anInt4956 / ((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7676() {
		return null;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)V")
	public synchronized void method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4513(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static733.method4515(arg1, arg2);
		@Pc(14) int local14 = Static733.method4479(arg1, arg2);
		if (this.anInt4952 == local10 && this.anInt4950 == local14) {
			this.anInt4947 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4944;
		if (this.anInt4944 - arg1 > local31) {
			local31 = this.anInt4944 - arg1;
		}
		if (local10 - this.anInt4952 > local31) {
			local31 = local10 - this.anInt4952;
		}
		if (this.anInt4952 - local10 > local31) {
			local31 = this.anInt4952 - local10;
		}
		if (local14 - this.anInt4950 > local31) {
			local31 = local14 - this.anInt4950;
		}
		if (this.anInt4950 - local14 > local31) {
			local31 = this.anInt4950 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4947 = arg0;
		this.anInt4955 = arg1;
		this.anInt4945 = arg2;
		this.anInt4953 = (arg1 - this.anInt4944) / arg0;
		this.anInt4949 = (local10 - this.anInt4952) / arg0;
		this.anInt4954 = (local14 - this.anInt4950) / arg0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7677() {
		return null;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(II)V")
	public synchronized void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4486(arg0, arg1, this.method4505());
	}

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "()Z")
	public boolean method4488() {
		return this.anInt4951 < 0 || this.anInt4951 >= ((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102.length << 8;
	}

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "()I")
	public synchronized int method4489() {
		return this.anInt4955 == Integer.MIN_VALUE ? 0 : this.anInt4955;
	}

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "()I")
	public synchronized int method4490() {
		return this.anInt4948 < 0 ? -this.anInt4948 : this.anInt4948;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7671(@OriginalArg(0) int arg0) {
		if (this.anInt4947 > 0) {
			if (arg0 >= this.anInt4947) {
				if (this.anInt4955 == Integer.MIN_VALUE) {
					this.anInt4955 = 0;
					this.anInt4944 = this.anInt4952 = this.anInt4950 = 0;
					this.method9872();
					arg0 = this.anInt4947;
				}
				this.anInt4947 = 0;
				this.method4507();
			} else {
				this.anInt4944 += this.anInt4953 * arg0;
				this.anInt4952 += this.anInt4949 * arg0;
				this.anInt4950 += this.anInt4954 * arg0;
				this.anInt4947 -= arg0;
			}
		}
		@Pc(71) Class2_Sub4_Sub1 local71 = (Class2_Sub4_Sub1) super.aClass2_Sub4_6;
		@Pc(76) int local76 = this.anInt4956 << 8;
		@Pc(81) int local81 = this.anInt4946 << 8;
		@Pc(87) int local87 = local71.aByteArray102.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4943 = 0;
		}
		if (this.anInt4951 < 0) {
			if (this.anInt4948 <= 0) {
				this.method4503();
				this.method9872();
				return;
			}
			this.anInt4951 = 0;
		}
		if (this.anInt4951 >= local87) {
			if (this.anInt4948 >= 0) {
				this.method4503();
				this.method9872();
				return;
			}
			this.anInt4951 = local87 - 1;
		}
		this.anInt4951 += this.anInt4948 * arg0;
		if (this.anInt4943 >= 0) {
			if (this.anInt4943 > 0) {
				if (this.aBoolean423) {
					label125: {
						if (this.anInt4948 < 0) {
							if (this.anInt4951 >= local76) {
								return;
							}
							this.anInt4951 = local76 + local76 - this.anInt4951 - 1;
							this.anInt4948 = -this.anInt4948;
							if (--this.anInt4943 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4951 < local81) {
								return;
							}
							this.anInt4951 = local81 + local81 - this.anInt4951 - 1;
							this.anInt4948 = -this.anInt4948;
							if (--this.anInt4943 == 0) {
								break;
							}
							if (this.anInt4951 >= local76) {
								return;
							}
							this.anInt4951 = local76 + local76 - this.anInt4951 - 1;
							this.anInt4948 = -this.anInt4948;
						} while (--this.anInt4943 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4948 < 0) {
						if (this.anInt4951 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4951 - 1) / local91;
						if (local361 < this.anInt4943) {
							this.anInt4951 += local91 * local361;
							this.anInt4943 -= local361;
							return;
						}
						this.anInt4951 += local91 * this.anInt4943;
						this.anInt4943 = 0;
					} else if (this.anInt4951 >= local81) {
						local361 = (this.anInt4951 - local76) / local91;
						if (local361 < this.anInt4943) {
							this.anInt4951 -= local91 * local361;
							this.anInt4943 -= local361;
							return;
						}
						this.anInt4951 -= local91 * this.anInt4943;
						this.anInt4943 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4948 < 0) {
				if (this.anInt4951 < 0) {
					this.anInt4951 = -1;
					this.method4503();
					this.method9872();
					return;
				}
			} else if (this.anInt4951 >= local87) {
				this.anInt4951 = local87;
				this.method4503();
				this.method9872();
			}
		} else if (this.aBoolean423) {
			if (this.anInt4948 < 0) {
				if (this.anInt4951 >= local76) {
					return;
				}
				this.anInt4951 = local76 + local76 - this.anInt4951 - 1;
				this.anInt4948 = -this.anInt4948;
			}
			while (this.anInt4951 >= local81) {
				this.anInt4951 = local81 + local81 - this.anInt4951 - 1;
				this.anInt4948 = -this.anInt4948;
				if (this.anInt4951 >= local76) {
					return;
				}
				this.anInt4951 = local76 + local76 - this.anInt4951 - 1;
				this.anInt4948 = -this.anInt4948;
			}
		} else if (this.anInt4948 < 0) {
			if (this.anInt4951 < local76) {
				this.anInt4951 = local81 - (local81 - 1 - this.anInt4951) % local91 - 1;
			}
		} else if (this.anInt4951 >= local81) {
			this.anInt4951 = local76 + (this.anInt4951 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	public synchronized void method4495(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4951 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "([IIIII)I")
	private int method4496(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4947 <= 0) {
				if (this.anInt4948 == 256 && (this.anInt4951 & 0xFF) == 0) {
					if (Static42.aBoolean76) {
						return Static733.method4494(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, arg3, arg2, this);
					}
					return Static733.method4509(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, arg3, arg2, this);
				}
				if (Static42.aBoolean76) {
					return Static733.method4483(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, arg3, arg2, this, this.anInt4948, arg4);
				}
				return Static733.method4500(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, arg3, arg2, this, this.anInt4948, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4947;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4947 += arg1;
			if (this.anInt4948 == 256 && (this.anInt4951 & 0xFF) == 0) {
				if (Static42.aBoolean76) {
					arg1 = Static733.method4501(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, this.anInt4949, this.anInt4954, local5, arg2, this);
				} else {
					arg1 = Static733.method4491(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, this.anInt4953, local5, arg2, this);
				}
			} else if (Static42.aBoolean76) {
				arg1 = Static733.method4497(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, this.anInt4949, this.anInt4954, local5, arg2, this, this.anInt4948, arg4);
			} else {
				arg1 = Static733.method4504(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, this.anInt4953, local5, arg2, this, this.anInt4948, arg4);
			}
			this.anInt4947 -= arg1;
			if (this.anInt4947 != 0) {
				return arg1;
			}
		} while (!this.method4508());
		return arg3;
	}

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "(I)V")
	public synchronized void method4498(@OriginalArg(0) int arg0) {
		this.anInt4943 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "(I)V")
	public synchronized void method4499(@OriginalArg(0) int arg0) {
		this.method4513(arg0 << 6, this.method4505());
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([IIIII)I")
	private int method4502(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4947 <= 0) {
				if (this.anInt4948 == -256 && (this.anInt4951 & 0xFF) == 0) {
					if (Static42.aBoolean76) {
						return Static733.method4493(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, arg3, arg2, this);
					}
					return Static733.method4484(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, arg3, arg2, this);
				}
				if (Static42.aBoolean76) {
					return Static733.method4492(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, arg3, arg2, this, this.anInt4948, arg4);
				}
				return Static733.method4482(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, arg3, arg2, this, this.anInt4948, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4947;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4947 += arg1;
			if (this.anInt4948 == -256 && (this.anInt4951 & 0xFF) == 0) {
				if (Static42.aBoolean76) {
					arg1 = Static733.method4516(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, this.anInt4949, this.anInt4954, local5, arg2, this);
				} else {
					arg1 = Static733.method4512(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, this.anInt4953, local5, arg2, this);
				}
			} else if (Static42.aBoolean76) {
				arg1 = Static733.method4485(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4952, this.anInt4950, this.anInt4949, this.anInt4954, local5, arg2, this, this.anInt4948, arg4);
			} else {
				arg1 = Static733.method4514(((Class2_Sub4_Sub1) super.aClass2_Sub4_6).aByteArray102, arg0, this.anInt4951, arg1, this.anInt4944, this.anInt4953, local5, arg2, this, this.anInt4948, arg4);
			}
			this.anInt4947 -= arg1;
			if (this.anInt4947 != 0) {
				return arg1;
			}
		} while (!this.method4508());
		return arg3;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4955 == 0 && this.anInt4947 == 0) {
			this.method7671(arg2);
			return;
		}
		@Pc(13) Class2_Sub4_Sub1 local13 = (Class2_Sub4_Sub1) super.aClass2_Sub4_6;
		@Pc(18) int local18 = this.anInt4956 << 8;
		@Pc(23) int local23 = this.anInt4946 << 8;
		@Pc(29) int local29 = local13.aByteArray102.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4943 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4951 < 0) {
			if (this.anInt4948 <= 0) {
				this.method4503();
				this.method9872();
				return;
			}
			this.anInt4951 = 0;
		}
		if (this.anInt4951 >= local29) {
			if (this.anInt4948 >= 0) {
				this.method4503();
				this.method9872();
				return;
			}
			this.anInt4951 = local29 - 1;
		}
		if (this.anInt4943 >= 0) {
			if (this.anInt4943 > 0) {
				if (this.aBoolean423) {
					label130: {
						if (this.anInt4948 < 0) {
							local40 = this.method4502(arg0, arg1, local18, local44, local13.aByteArray102[this.anInt4956]);
							if (this.anInt4951 >= local18) {
								return;
							}
							this.anInt4951 = local18 + local18 - this.anInt4951 - 1;
							this.anInt4948 = -this.anInt4948;
							if (--this.anInt4943 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4496(arg0, local40, local23, local44, local13.aByteArray102[this.anInt4946 - 1]);
							if (this.anInt4951 < local23) {
								return;
							}
							this.anInt4951 = local23 + local23 - this.anInt4951 - 1;
							this.anInt4948 = -this.anInt4948;
							if (--this.anInt4943 == 0) {
								break;
							}
							local40 = this.method4502(arg0, local40, local18, local44, local13.aByteArray102[this.anInt4956]);
							if (this.anInt4951 >= local18) {
								return;
							}
							this.anInt4951 = local18 + local18 - this.anInt4951 - 1;
							this.anInt4948 = -this.anInt4948;
						} while (--this.anInt4943 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4948 < 0) {
						while (true) {
							local40 = this.method4502(arg0, local40, local18, local44, local13.aByteArray102[this.anInt4946 - 1]);
							if (this.anInt4951 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4951 - 1) / local33;
							if (local416 >= this.anInt4943) {
								this.anInt4951 += local33 * this.anInt4943;
								this.anInt4943 = 0;
								break;
							}
							this.anInt4951 += local33 * local416;
							this.anInt4943 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4496(arg0, local40, local23, local44, local13.aByteArray102[this.anInt4956]);
							if (this.anInt4951 < local23) {
								return;
							}
							local416 = (this.anInt4951 - local18) / local33;
							if (local416 >= this.anInt4943) {
								this.anInt4951 -= local33 * this.anInt4943;
								this.anInt4943 = 0;
								break;
							}
							this.anInt4951 -= local33 * local416;
							this.anInt4943 -= local416;
						}
					}
				}
			}
			if (this.anInt4948 < 0) {
				this.method4502(arg0, local40, 0, local44, 0);
				if (this.anInt4951 < 0) {
					this.anInt4951 = -1;
					this.method4503();
					this.method9872();
					return;
				}
			} else {
				this.method4496(arg0, local40, local29, local44, 0);
				if (this.anInt4951 >= local29) {
					this.anInt4951 = local29;
					this.method4503();
					this.method9872();
				}
			}
		} else if (this.aBoolean423) {
			if (this.anInt4948 < 0) {
				local40 = this.method4502(arg0, arg1, local18, local44, local13.aByteArray102[this.anInt4956]);
				if (this.anInt4951 >= local18) {
					return;
				}
				this.anInt4951 = local18 + local18 - this.anInt4951 - 1;
				this.anInt4948 = -this.anInt4948;
			}
			while (true) {
				local40 = this.method4496(arg0, local40, local23, local44, local13.aByteArray102[this.anInt4946 - 1]);
				if (this.anInt4951 < local23) {
					return;
				}
				this.anInt4951 = local23 + local23 - this.anInt4951 - 1;
				this.anInt4948 = -this.anInt4948;
				local40 = this.method4502(arg0, local40, local18, local44, local13.aByteArray102[this.anInt4956]);
				if (this.anInt4951 >= local18) {
					return;
				}
				this.anInt4951 = local18 + local18 - this.anInt4951 - 1;
				this.anInt4948 = -this.anInt4948;
			}
		} else if (this.anInt4948 < 0) {
			while (true) {
				local40 = this.method4502(arg0, local40, local18, local44, local13.aByteArray102[this.anInt4946 - 1]);
				if (this.anInt4951 >= local18) {
					return;
				}
				this.anInt4951 = local23 - (local23 - 1 - this.anInt4951) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4496(arg0, local40, local23, local44, local13.aByteArray102[this.anInt4956]);
				if (this.anInt4951 < local23) {
					return;
				}
				this.anInt4951 = local18 + (this.anInt4951 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "()V")
	private void method4503() {
		if (this.anInt4947 == 0) {
			return;
		}
		if (this.anInt4955 == Integer.MIN_VALUE) {
			this.anInt4955 = 0;
		}
		this.anInt4947 = 0;
		this.method4507();
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "()I")
	@Override
	public int method7674() {
		return this.anInt4955 == 0 && this.anInt4947 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "()I")
	public synchronized int method4505() {
		return this.anInt4945 < 0 ? -1 : this.anInt4945;
	}

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "()V")
	private void method4507() {
		this.anInt4944 = this.anInt4955;
		this.anInt4952 = Static733.method4515(this.anInt4955, this.anInt4945);
		this.anInt4950 = Static733.method4479(this.anInt4955, this.anInt4945);
	}

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "()Z")
	private boolean method4508() {
		@Pc(2) int local2 = this.anInt4955;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static733.method4515(local2, this.anInt4945);
			local8 = Static733.method4479(local2, this.anInt4945);
		}
		if (this.anInt4944 != local2 || this.anInt4952 != local10 || this.anInt4950 != local8) {
			if (this.anInt4944 < local2) {
				this.anInt4953 = 1;
				this.anInt4947 = local2 - this.anInt4944;
			} else if (this.anInt4944 > local2) {
				this.anInt4953 = -1;
				this.anInt4947 = this.anInt4944 - local2;
			} else {
				this.anInt4953 = 0;
			}
			if (this.anInt4952 < local10) {
				this.anInt4949 = 1;
				if (this.anInt4947 == 0 || this.anInt4947 > local10 - this.anInt4952) {
					this.anInt4947 = local10 - this.anInt4952;
				}
			} else if (this.anInt4952 > local10) {
				this.anInt4949 = -1;
				if (this.anInt4947 == 0 || this.anInt4947 > this.anInt4952 - local10) {
					this.anInt4947 = this.anInt4952 - local10;
				}
			} else {
				this.anInt4949 = 0;
			}
			if (this.anInt4950 < local8) {
				this.anInt4954 = 1;
				if (this.anInt4947 == 0 || this.anInt4947 > local8 - this.anInt4950) {
					this.anInt4947 = local8 - this.anInt4950;
				}
			} else if (this.anInt4950 > local8) {
				this.anInt4954 = -1;
				if (this.anInt4947 == 0 || this.anInt4947 > this.anInt4950 - local8) {
					this.anInt4947 = this.anInt4950 - local8;
				}
			} else {
				this.anInt4954 = 0;
			}
			return false;
		} else if (this.anInt4955 == Integer.MIN_VALUE) {
			this.anInt4955 = 0;
			this.anInt4944 = this.anInt4952 = this.anInt4950 = 0;
			this.method9872();
			return true;
		} else {
			this.method4507();
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "(I)V")
	public synchronized void method4510(@OriginalArg(0) int arg0) {
		this.method4513(this.method4489(), arg0);
	}

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "()Z")
	public boolean method4511() {
		return this.anInt4947 != 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
	private synchronized void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4955 = arg0;
		this.anInt4945 = arg1;
		this.anInt4947 = 0;
		this.method4507();
	}

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "(I)V")
	public synchronized void method4517(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4480();
			this.method9872();
		} else if (this.anInt4952 == 0 && this.anInt4950 == 0) {
			this.anInt4947 = 0;
			this.anInt4955 = 0;
			this.anInt4944 = 0;
			this.method9872();
		} else {
			@Pc(31) int local31 = -this.anInt4944;
			if (this.anInt4944 > local31) {
				local31 = this.anInt4944;
			}
			if (-this.anInt4952 > local31) {
				local31 = -this.anInt4952;
			}
			if (this.anInt4952 > local31) {
				local31 = this.anInt4952;
			}
			if (-this.anInt4950 > local31) {
				local31 = -this.anInt4950;
			}
			if (this.anInt4950 > local31) {
				local31 = this.anInt4950;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4947 = arg0;
			this.anInt4955 = Integer.MIN_VALUE;
			this.anInt4953 = -this.anInt4944 / arg0;
			this.anInt4949 = -this.anInt4952 / arg0;
			this.anInt4954 = -this.anInt4950 / arg0;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(Z)V")
	public synchronized void method4518() {
		this.anInt4948 = (this.anInt4948 ^ this.anInt4948 >> 31) + (this.anInt4948 >>> 31);
		this.anInt4948 = -this.anInt4948;
	}
}
