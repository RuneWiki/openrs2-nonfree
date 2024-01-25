import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class6_Sub5_Sub4 extends Class6_Sub5 {

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
	public int anInt7048;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public int anInt7049;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
	public int anInt7050;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
	public int anInt7051;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
	private int anInt7055;

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
	public int anInt7057;

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
	private int anInt7058;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
	public int anInt7060;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	private final int anInt7054;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	private final int anInt7052;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	private int anInt7053;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
	private int anInt7056;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
	private int anInt7061;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	public int anInt7059;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!gu;II)V")
	public Class6_Sub5_Sub4(@OriginalArg(0) Class6_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub4_5 = arg0;
		this.anInt7054 = arg0.anInt2444;
		this.anInt7052 = arg0.anInt2443;
		this.aBoolean479 = arg0.aBoolean184;
		this.anInt7053 = arg1;
		this.anInt7056 = arg2;
		this.anInt7061 = 8192;
		this.anInt7059 = 0;
		this.method5759();
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!gu;III)V")
	public Class6_Sub5_Sub4(@OriginalArg(0) Class6_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub4_5 = arg0;
		this.anInt7054 = arg0.anInt2444;
		this.anInt7052 = arg0.anInt2443;
		this.aBoolean479 = arg0.aBoolean184;
		this.anInt7053 = arg1;
		this.anInt7056 = arg2;
		this.anInt7061 = arg3;
		this.anInt7059 = 0;
		this.method5759();
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "()Z")
	public boolean method5735() {
		return this.anInt7059 < 0 || this.anInt7059 >= ((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34.length << 8;
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V")
	public synchronized void method5736(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7059 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5730(@OriginalArg(0) int arg0) {
		if (this.anInt7055 > 0) {
			if (arg0 >= this.anInt7055) {
				if (this.anInt7056 == Integer.MIN_VALUE) {
					this.anInt7056 = 0;
					this.anInt7049 = this.anInt7060 = this.anInt7057 = 0;
					this.method5977();
					arg0 = this.anInt7055;
				}
				this.anInt7055 = 0;
				this.method5759();
			} else {
				this.anInt7049 += this.anInt7048 * arg0;
				this.anInt7060 += this.anInt7050 * arg0;
				this.anInt7057 += this.anInt7051 * arg0;
				this.anInt7055 -= arg0;
			}
		}
		@Pc(71) Class6_Sub4_Sub1 local71 = (Class6_Sub4_Sub1) super.aClass6_Sub4_5;
		@Pc(76) int local76 = this.anInt7054 << 8;
		@Pc(81) int local81 = this.anInt7052 << 8;
		@Pc(87) int local87 = local71.aByteArray34.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7058 = 0;
		}
		if (this.anInt7059 < 0) {
			if (this.anInt7053 <= 0) {
				this.method5744();
				this.method5977();
				return;
			}
			this.anInt7059 = 0;
		}
		if (this.anInt7059 >= local87) {
			if (this.anInt7053 >= 0) {
				this.method5744();
				this.method5977();
				return;
			}
			this.anInt7059 = local87 - 1;
		}
		this.anInt7059 += this.anInt7053 * arg0;
		if (this.anInt7058 >= 0) {
			if (this.anInt7058 > 0) {
				if (this.aBoolean479) {
					label125: {
						if (this.anInt7053 < 0) {
							if (this.anInt7059 >= local76) {
								return;
							}
							this.anInt7059 = local76 + local76 - this.anInt7059 - 1;
							this.anInt7053 = -this.anInt7053;
							if (--this.anInt7058 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7059 < local81) {
								return;
							}
							this.anInt7059 = local81 + local81 - this.anInt7059 - 1;
							this.anInt7053 = -this.anInt7053;
							if (--this.anInt7058 == 0) {
								break;
							}
							if (this.anInt7059 >= local76) {
								return;
							}
							this.anInt7059 = local76 + local76 - this.anInt7059 - 1;
							this.anInt7053 = -this.anInt7053;
						} while (--this.anInt7058 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7053 < 0) {
						if (this.anInt7059 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7059 - 1) / local91;
						if (local361 < this.anInt7058) {
							this.anInt7059 += local91 * local361;
							this.anInt7058 -= local361;
							return;
						}
						this.anInt7059 += local91 * this.anInt7058;
						this.anInt7058 = 0;
					} else if (this.anInt7059 >= local81) {
						local361 = (this.anInt7059 - local76) / local91;
						if (local361 < this.anInt7058) {
							this.anInt7059 -= local91 * local361;
							this.anInt7058 -= local361;
							return;
						}
						this.anInt7059 -= local91 * this.anInt7058;
						this.anInt7058 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7053 < 0) {
				if (this.anInt7059 < 0) {
					this.anInt7059 = -1;
					this.method5744();
					this.method5977();
					return;
				}
			} else if (this.anInt7059 >= local87) {
				this.anInt7059 = local87;
				this.method5744();
				this.method5977();
			}
		} else if (this.aBoolean479) {
			if (this.anInt7053 < 0) {
				if (this.anInt7059 >= local76) {
					return;
				}
				this.anInt7059 = local76 + local76 - this.anInt7059 - 1;
				this.anInt7053 = -this.anInt7053;
			}
			while (this.anInt7059 >= local81) {
				this.anInt7059 = local81 + local81 - this.anInt7059 - 1;
				this.anInt7053 = -this.anInt7053;
				if (this.anInt7059 >= local76) {
					return;
				}
				this.anInt7059 = local76 + local76 - this.anInt7059 - 1;
				this.anInt7053 = -this.anInt7053;
			}
		} else if (this.anInt7053 < 0) {
			if (this.anInt7059 < local76) {
				this.anInt7059 = local81 - (local81 - 1 - this.anInt7059) % local91 - 1;
			}
		} else if (this.anInt7059 >= local81) {
			this.anInt7059 = local76 + (this.anInt7059 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()I")
	@Override
	public int method5728() {
		return this.anInt7056 == 0 && this.anInt7055 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	public synchronized void method5739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5760(arg0, arg1, this.method5746());
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([IIIII)I")
	private int method5743(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7055 <= 0) {
				if (this.anInt7053 == 256 && (this.anInt7059 & 0xFF) == 0) {
					if (Static24.aBoolean29) {
						return Static460.method5762(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, arg3, arg2, this);
					}
					return Static460.method5757(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, arg3, arg2, this);
				}
				if (Static24.aBoolean29) {
					return Static460.method5751(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, arg3, arg2, this, this.anInt7053, arg4);
				}
				return Static460.method5750(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, arg3, arg2, this, this.anInt7053, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7055;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7055 += arg1;
			if (this.anInt7053 == 256 && (this.anInt7059 & 0xFF) == 0) {
				if (Static24.aBoolean29) {
					arg1 = Static460.method5737(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, this.anInt7050, this.anInt7051, local5, arg2, this);
				} else {
					arg1 = Static460.method5765(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, this.anInt7048, local5, arg2, this);
				}
			} else if (Static24.aBoolean29) {
				arg1 = Static460.method5738(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, this.anInt7050, this.anInt7051, local5, arg2, this, this.anInt7053, arg4);
			} else {
				arg1 = Static460.method5747(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, this.anInt7048, local5, arg2, this, this.anInt7053, arg4);
			}
			this.anInt7055 -= arg1;
			if (this.anInt7055 != 0) {
				return arg1;
			}
		} while (!this.method5752());
		return arg3;
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "()V")
	private void method5744() {
		if (this.anInt7055 == 0) {
			return;
		}
		if (this.anInt7056 == Integer.MIN_VALUE) {
			this.anInt7056 = 0;
		}
		this.anInt7055 = 0;
		this.method5759();
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	public synchronized void method5745(@OriginalArg(0) int arg0) {
		this.anInt7058 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "()I")
	public synchronized int method5746() {
		return this.anInt7061 < 0 ? -1 : this.anInt7061;
	}

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "()Z")
	public boolean method5749() {
		return this.anInt7055 != 0;
	}

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "()Z")
	private boolean method5752() {
		@Pc(2) int local2 = this.anInt7056;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static460.method5742(local2, this.anInt7061);
			local8 = Static460.method5771(local2, this.anInt7061);
		}
		if (this.anInt7049 != local2 || this.anInt7060 != local10 || this.anInt7057 != local8) {
			if (this.anInt7049 < local2) {
				this.anInt7048 = 1;
				this.anInt7055 = local2 - this.anInt7049;
			} else if (this.anInt7049 > local2) {
				this.anInt7048 = -1;
				this.anInt7055 = this.anInt7049 - local2;
			} else {
				this.anInt7048 = 0;
			}
			if (this.anInt7060 < local10) {
				this.anInt7050 = 1;
				if (this.anInt7055 == 0 || this.anInt7055 > local10 - this.anInt7060) {
					this.anInt7055 = local10 - this.anInt7060;
				}
			} else if (this.anInt7060 > local10) {
				this.anInt7050 = -1;
				if (this.anInt7055 == 0 || this.anInt7055 > this.anInt7060 - local10) {
					this.anInt7055 = this.anInt7060 - local10;
				}
			} else {
				this.anInt7050 = 0;
			}
			if (this.anInt7057 < local8) {
				this.anInt7051 = 1;
				if (this.anInt7055 == 0 || this.anInt7055 > local8 - this.anInt7057) {
					this.anInt7055 = local8 - this.anInt7057;
				}
			} else if (this.anInt7057 > local8) {
				this.anInt7051 = -1;
				if (this.anInt7055 == 0 || this.anInt7055 > this.anInt7057 - local8) {
					this.anInt7055 = this.anInt7057 - local8;
				}
			} else {
				this.anInt7051 = 0;
			}
			return false;
		} else if (this.anInt7056 == Integer.MIN_VALUE) {
			this.anInt7056 = 0;
			this.anInt7049 = this.anInt7060 = this.anInt7057 = 0;
			this.method5977();
			return true;
		} else {
			this.method5759();
			return false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "()I")
	public synchronized int method5753() {
		return this.anInt7053 < 0 ? -this.anInt7053 : this.anInt7053;
	}

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "()I")
	public synchronized int method5758() {
		return this.anInt7056 == Integer.MIN_VALUE ? 0 : this.anInt7056;
	}

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "()V")
	private void method5759() {
		this.anInt7049 = this.anInt7056;
		this.anInt7060 = Static460.method5742(this.anInt7056, this.anInt7061);
		this.anInt7057 = Static460.method5771(this.anInt7056, this.anInt7061);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
	public synchronized void method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5767(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static460.method5742(arg1, arg2);
		@Pc(14) int local14 = Static460.method5771(arg1, arg2);
		if (this.anInt7060 == local10 && this.anInt7057 == local14) {
			this.anInt7055 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7049;
		if (this.anInt7049 - arg1 > local31) {
			local31 = this.anInt7049 - arg1;
		}
		if (local10 - this.anInt7060 > local31) {
			local31 = local10 - this.anInt7060;
		}
		if (this.anInt7060 - local10 > local31) {
			local31 = this.anInt7060 - local10;
		}
		if (local14 - this.anInt7057 > local31) {
			local31 = local14 - this.anInt7057;
		}
		if (this.anInt7057 - local14 > local31) {
			local31 = this.anInt7057 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7055 = arg0;
		this.anInt7056 = arg1;
		this.anInt7061 = arg2;
		this.anInt7048 = (arg1 - this.anInt7049) / arg0;
		this.anInt7050 = (local10 - this.anInt7060) / arg0;
		this.anInt7051 = (local14 - this.anInt7057) / arg0;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "()Lclient!wg;")
	@Override
	public Class6_Sub5 method5732() {
		return null;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "()I")
	@Override
	public int method5731() {
		@Pc(6) int local6 = this.anInt7049 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7058 == 0) {
			local6 -= local6 * this.anInt7059 / (((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34.length << 8);
		} else if (this.anInt7058 >= 0) {
			local6 -= local6 * this.anInt7054 / ((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V")
	public synchronized void method5763(@OriginalArg(0) int arg0) {
		this.method5767(arg0 << 6, this.method5746());
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "()Lclient!wg;")
	@Override
	public Class6_Sub5 method5729() {
		return null;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)V")
	private synchronized void method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7056 = arg0;
		this.anInt7061 = arg1;
		this.anInt7055 = 0;
		this.method5759();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "([IIIII)I")
	private int method5768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7055 <= 0) {
				if (this.anInt7053 == -256 && (this.anInt7059 & 0xFF) == 0) {
					if (Static24.aBoolean29) {
						return Static460.method5756(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, arg3, arg2, this);
					}
					return Static460.method5754(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, arg3, arg2, this);
				}
				if (Static24.aBoolean29) {
					return Static460.method5741(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, arg3, arg2, this, this.anInt7053, arg4);
				}
				return Static460.method5755(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, arg3, arg2, this, this.anInt7053, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7055;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7055 += arg1;
			if (this.anInt7053 == -256 && (this.anInt7059 & 0xFF) == 0) {
				if (Static24.aBoolean29) {
					arg1 = Static460.method5748(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, this.anInt7050, this.anInt7051, local5, arg2, this);
				} else {
					arg1 = Static460.method5766(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, this.anInt7048, local5, arg2, this);
				}
			} else if (Static24.aBoolean29) {
				arg1 = Static460.method5770(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7060, this.anInt7057, this.anInt7050, this.anInt7051, local5, arg2, this, this.anInt7053, arg4);
			} else {
				arg1 = Static460.method5764(((Class6_Sub4_Sub1) super.aClass6_Sub4_5).aByteArray34, arg0, this.anInt7059, arg1, this.anInt7049, this.anInt7048, local5, arg2, this, this.anInt7053, arg4);
			}
			this.anInt7055 -= arg1;
			if (this.anInt7055 != 0) {
				return arg1;
			}
		} while (!this.method5752());
		return arg3;
	}

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)V")
	public synchronized void method5769(@OriginalArg(0) int arg0) {
		if (this.anInt7053 < 0) {
			this.anInt7053 = -arg0;
		} else {
			this.anInt7053 = arg0;
		}
	}

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "(I)V")
	private synchronized void method5772() {
		this.method5767(0, this.method5746());
	}

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "(I)V")
	public synchronized void method5773(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5772();
			this.method5977();
		} else if (this.anInt7060 == 0 && this.anInt7057 == 0) {
			this.anInt7055 = 0;
			this.anInt7056 = 0;
			this.anInt7049 = 0;
			this.method5977();
		} else {
			@Pc(31) int local31 = -this.anInt7049;
			if (this.anInt7049 > local31) {
				local31 = this.anInt7049;
			}
			if (-this.anInt7060 > local31) {
				local31 = -this.anInt7060;
			}
			if (this.anInt7060 > local31) {
				local31 = this.anInt7060;
			}
			if (-this.anInt7057 > local31) {
				local31 = -this.anInt7057;
			}
			if (this.anInt7057 > local31) {
				local31 = this.anInt7057;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7055 = arg0;
			this.anInt7056 = Integer.MIN_VALUE;
			this.anInt7048 = -this.anInt7049 / arg0;
			this.anInt7050 = -this.anInt7060 / arg0;
			this.anInt7051 = -this.anInt7057 / arg0;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5734(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7056 == 0 && this.anInt7055 == 0) {
			this.method5730(arg2);
			return;
		}
		@Pc(13) Class6_Sub4_Sub1 local13 = (Class6_Sub4_Sub1) super.aClass6_Sub4_5;
		@Pc(18) int local18 = this.anInt7054 << 8;
		@Pc(23) int local23 = this.anInt7052 << 8;
		@Pc(29) int local29 = local13.aByteArray34.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7058 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7059 < 0) {
			if (this.anInt7053 <= 0) {
				this.method5744();
				this.method5977();
				return;
			}
			this.anInt7059 = 0;
		}
		if (this.anInt7059 >= local29) {
			if (this.anInt7053 >= 0) {
				this.method5744();
				this.method5977();
				return;
			}
			this.anInt7059 = local29 - 1;
		}
		if (this.anInt7058 >= 0) {
			if (this.anInt7058 > 0) {
				if (this.aBoolean479) {
					label130: {
						if (this.anInt7053 < 0) {
							local40 = this.method5768(arg0, arg1, local18, local44, local13.aByteArray34[this.anInt7054]);
							if (this.anInt7059 >= local18) {
								return;
							}
							this.anInt7059 = local18 + local18 - this.anInt7059 - 1;
							this.anInt7053 = -this.anInt7053;
							if (--this.anInt7058 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5743(arg0, local40, local23, local44, local13.aByteArray34[this.anInt7052 - 1]);
							if (this.anInt7059 < local23) {
								return;
							}
							this.anInt7059 = local23 + local23 - this.anInt7059 - 1;
							this.anInt7053 = -this.anInt7053;
							if (--this.anInt7058 == 0) {
								break;
							}
							local40 = this.method5768(arg0, local40, local18, local44, local13.aByteArray34[this.anInt7054]);
							if (this.anInt7059 >= local18) {
								return;
							}
							this.anInt7059 = local18 + local18 - this.anInt7059 - 1;
							this.anInt7053 = -this.anInt7053;
						} while (--this.anInt7058 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7053 < 0) {
						while (true) {
							local40 = this.method5768(arg0, local40, local18, local44, local13.aByteArray34[this.anInt7052 - 1]);
							if (this.anInt7059 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7059 - 1) / local33;
							if (local416 >= this.anInt7058) {
								this.anInt7059 += local33 * this.anInt7058;
								this.anInt7058 = 0;
								break;
							}
							this.anInt7059 += local33 * local416;
							this.anInt7058 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5743(arg0, local40, local23, local44, local13.aByteArray34[this.anInt7054]);
							if (this.anInt7059 < local23) {
								return;
							}
							local416 = (this.anInt7059 - local18) / local33;
							if (local416 >= this.anInt7058) {
								this.anInt7059 -= local33 * this.anInt7058;
								this.anInt7058 = 0;
								break;
							}
							this.anInt7059 -= local33 * local416;
							this.anInt7058 -= local416;
						}
					}
				}
			}
			if (this.anInt7053 < 0) {
				this.method5768(arg0, local40, 0, local44, 0);
				if (this.anInt7059 < 0) {
					this.anInt7059 = -1;
					this.method5744();
					this.method5977();
					return;
				}
			} else {
				this.method5743(arg0, local40, local29, local44, 0);
				if (this.anInt7059 >= local29) {
					this.anInt7059 = local29;
					this.method5744();
					this.method5977();
				}
			}
		} else if (this.aBoolean479) {
			if (this.anInt7053 < 0) {
				local40 = this.method5768(arg0, arg1, local18, local44, local13.aByteArray34[this.anInt7054]);
				if (this.anInt7059 >= local18) {
					return;
				}
				this.anInt7059 = local18 + local18 - this.anInt7059 - 1;
				this.anInt7053 = -this.anInt7053;
			}
			while (true) {
				local40 = this.method5743(arg0, local40, local23, local44, local13.aByteArray34[this.anInt7052 - 1]);
				if (this.anInt7059 < local23) {
					return;
				}
				this.anInt7059 = local23 + local23 - this.anInt7059 - 1;
				this.anInt7053 = -this.anInt7053;
				local40 = this.method5768(arg0, local40, local18, local44, local13.aByteArray34[this.anInt7054]);
				if (this.anInt7059 >= local18) {
					return;
				}
				this.anInt7059 = local18 + local18 - this.anInt7059 - 1;
				this.anInt7053 = -this.anInt7053;
			}
		} else if (this.anInt7053 < 0) {
			while (true) {
				local40 = this.method5768(arg0, local40, local18, local44, local13.aByteArray34[this.anInt7052 - 1]);
				if (this.anInt7059 >= local18) {
					return;
				}
				this.anInt7059 = local23 - (local23 - 1 - this.anInt7059) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5743(arg0, local40, local23, local44, local13.aByteArray34[this.anInt7054]);
				if (this.anInt7059 < local23) {
					return;
				}
				this.anInt7059 = local18 + (this.anInt7059 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
	public synchronized void method5774() {
		this.anInt7053 = (this.anInt7053 ^ this.anInt7053 >> 31) + (this.anInt7053 >>> 31);
		this.anInt7053 = -this.anInt7053;
	}
}
