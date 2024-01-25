import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	public int anInt51;

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private final int anInt49;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	private final int anInt46;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
	private final boolean aBoolean4;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	private int anInt43;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!ks;III)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class3_Sub35_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub35_6 = arg0;
		this.anInt49 = arg0.anInt5395;
		this.anInt46 = arg0.anInt5394;
		this.aBoolean4 = arg0.aBoolean393;
		this.anInt43 = arg1;
		this.anInt47 = arg2;
		this.anInt53 = arg3;
		this.anInt45 = 0;
		this.method70();
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "()Z")
	public boolean method68() {
		return this.anInt45 < 0 || this.anInt45 >= ((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56.length << 8;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "()V")
	private void method70() {
		this.anInt44 = this.anInt47;
		this.anInt41 = Static679.method78(this.anInt47, this.anInt53);
		this.anInt51 = Static679.method81(this.anInt47, this.anInt53);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public synchronized void method74(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt45 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt47 == 0 && this.anInt40 == 0) {
			this.method5779(arg2);
			return;
		}
		@Pc(13) Class3_Sub35_Sub1 local13 = (Class3_Sub35_Sub1) super.aClass3_Sub35_6;
		@Pc(18) int local18 = this.anInt49 << 8;
		@Pc(23) int local23 = this.anInt46 << 8;
		@Pc(29) int local29 = local13.aByteArray56.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt52 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt45 < 0) {
			if (this.anInt43 <= 0) {
				this.method88();
				this.method9380();
				return;
			}
			this.anInt45 = 0;
		}
		if (this.anInt45 >= local29) {
			if (this.anInt43 >= 0) {
				this.method88();
				this.method9380();
				return;
			}
			this.anInt45 = local29 - 1;
		}
		if (this.anInt52 >= 0) {
			if (this.anInt52 > 0) {
				if (this.aBoolean4) {
					label130: {
						if (this.anInt43 < 0) {
							local40 = this.method102(arg0, arg1, local18, local44, local13.aByteArray56[this.anInt49]);
							if (this.anInt45 >= local18) {
								return;
							}
							this.anInt45 = local18 + local18 - this.anInt45 - 1;
							this.anInt43 = -this.anInt43;
							if (--this.anInt52 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method92(arg0, local40, local23, local44, local13.aByteArray56[this.anInt46 - 1]);
							if (this.anInt45 < local23) {
								return;
							}
							this.anInt45 = local23 + local23 - this.anInt45 - 1;
							this.anInt43 = -this.anInt43;
							if (--this.anInt52 == 0) {
								break;
							}
							local40 = this.method102(arg0, local40, local18, local44, local13.aByteArray56[this.anInt49]);
							if (this.anInt45 >= local18) {
								return;
							}
							this.anInt45 = local18 + local18 - this.anInt45 - 1;
							this.anInt43 = -this.anInt43;
						} while (--this.anInt52 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt43 < 0) {
						while (true) {
							local40 = this.method102(arg0, local40, local18, local44, local13.aByteArray56[this.anInt46 - 1]);
							if (this.anInt45 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt45 - 1) / local33;
							if (local416 >= this.anInt52) {
								this.anInt45 += local33 * this.anInt52;
								this.anInt52 = 0;
								break;
							}
							this.anInt45 += local33 * local416;
							this.anInt52 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method92(arg0, local40, local23, local44, local13.aByteArray56[this.anInt49]);
							if (this.anInt45 < local23) {
								return;
							}
							local416 = (this.anInt45 - local18) / local33;
							if (local416 >= this.anInt52) {
								this.anInt45 -= local33 * this.anInt52;
								this.anInt52 = 0;
								break;
							}
							this.anInt45 -= local33 * local416;
							this.anInt52 -= local416;
						}
					}
				}
			}
			if (this.anInt43 < 0) {
				this.method102(arg0, local40, 0, local44, 0);
				if (this.anInt45 < 0) {
					this.anInt45 = -1;
					this.method88();
					this.method9380();
					return;
				}
			} else {
				this.method92(arg0, local40, local29, local44, 0);
				if (this.anInt45 >= local29) {
					this.anInt45 = local29;
					this.method88();
					this.method9380();
				}
			}
		} else if (this.aBoolean4) {
			if (this.anInt43 < 0) {
				local40 = this.method102(arg0, arg1, local18, local44, local13.aByteArray56[this.anInt49]);
				if (this.anInt45 >= local18) {
					return;
				}
				this.anInt45 = local18 + local18 - this.anInt45 - 1;
				this.anInt43 = -this.anInt43;
			}
			while (true) {
				local40 = this.method92(arg0, local40, local23, local44, local13.aByteArray56[this.anInt46 - 1]);
				if (this.anInt45 < local23) {
					return;
				}
				this.anInt45 = local23 + local23 - this.anInt45 - 1;
				this.anInt43 = -this.anInt43;
				local40 = this.method102(arg0, local40, local18, local44, local13.aByteArray56[this.anInt49]);
				if (this.anInt45 >= local18) {
					return;
				}
				this.anInt45 = local18 + local18 - this.anInt45 - 1;
				this.anInt43 = -this.anInt43;
			}
		} else if (this.anInt43 < 0) {
			while (true) {
				local40 = this.method102(arg0, local40, local18, local44, local13.aByteArray56[this.anInt46 - 1]);
				if (this.anInt45 >= local18) {
					return;
				}
				this.anInt45 = local23 - (local23 - 1 - this.anInt45) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method92(arg0, local40, local23, local44, local13.aByteArray56[this.anInt49]);
				if (this.anInt45 < local23) {
					return;
				}
				this.anInt45 = local18 + (this.anInt45 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
	public synchronized void method79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method86(arg0, arg1, this.method98());
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "()I")
	public synchronized int method80() {
		return this.anInt47 == Integer.MIN_VALUE ? 0 : this.anInt47;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
	@Override
	public int method5780() {
		return this.anInt47 == 0 && this.anInt40 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "()Z")
	private boolean method85() {
		@Pc(2) int local2 = this.anInt47;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static679.method78(local2, this.anInt53);
			local8 = Static679.method81(local2, this.anInt53);
		}
		if (this.anInt44 != local2 || this.anInt41 != local10 || this.anInt51 != local8) {
			if (this.anInt44 < local2) {
				this.anInt48 = 1;
				this.anInt40 = local2 - this.anInt44;
			} else if (this.anInt44 > local2) {
				this.anInt48 = -1;
				this.anInt40 = this.anInt44 - local2;
			} else {
				this.anInt48 = 0;
			}
			if (this.anInt41 < local10) {
				this.anInt42 = 1;
				if (this.anInt40 == 0 || this.anInt40 > local10 - this.anInt41) {
					this.anInt40 = local10 - this.anInt41;
				}
			} else if (this.anInt41 > local10) {
				this.anInt42 = -1;
				if (this.anInt40 == 0 || this.anInt40 > this.anInt41 - local10) {
					this.anInt40 = this.anInt41 - local10;
				}
			} else {
				this.anInt42 = 0;
			}
			if (this.anInt51 < local8) {
				this.anInt50 = 1;
				if (this.anInt40 == 0 || this.anInt40 > local8 - this.anInt51) {
					this.anInt40 = local8 - this.anInt51;
				}
			} else if (this.anInt51 > local8) {
				this.anInt50 = -1;
				if (this.anInt40 == 0 || this.anInt40 > this.anInt51 - local8) {
					this.anInt40 = this.anInt51 - local8;
				}
			} else {
				this.anInt50 = 0;
			}
			return false;
		} else if (this.anInt47 == Integer.MIN_VALUE) {
			this.anInt47 = 0;
			this.anInt44 = this.anInt41 = this.anInt51 = 0;
			this.method9380();
			return true;
		} else {
			this.method70();
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
	public synchronized void method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method99(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static679.method78(arg1, arg2);
		@Pc(14) int local14 = Static679.method81(arg1, arg2);
		if (this.anInt41 == local10 && this.anInt51 == local14) {
			this.anInt40 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt44;
		if (this.anInt44 - arg1 > local31) {
			local31 = this.anInt44 - arg1;
		}
		if (local10 - this.anInt41 > local31) {
			local31 = local10 - this.anInt41;
		}
		if (this.anInt41 - local10 > local31) {
			local31 = this.anInt41 - local10;
		}
		if (local14 - this.anInt51 > local31) {
			local31 = local14 - this.anInt51;
		}
		if (this.anInt51 - local14 > local31) {
			local31 = this.anInt51 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt40 = arg0;
		this.anInt47 = arg1;
		this.anInt53 = arg2;
		this.anInt48 = (arg1 - this.anInt44) / arg0;
		this.anInt42 = (local10 - this.anInt41) / arg0;
		this.anInt50 = (local14 - this.anInt51) / arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public synchronized void method87() {
		this.anInt43 = (this.anInt43 ^ this.anInt43 >> 31) + (this.anInt43 >>> 31);
		this.anInt43 = -this.anInt43;
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "()V")
	private void method88() {
		if (this.anInt40 == 0) {
			return;
		}
		if (this.anInt47 == Integer.MIN_VALUE) {
			this.anInt47 = 0;
		}
		this.anInt40 = 0;
		this.method70();
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5782() {
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public synchronized void method90(@OriginalArg(0) int arg0) {
		if (this.anInt43 < 0) {
			this.anInt43 = -arg0;
		} else {
			this.anInt43 = arg0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIIII)I")
	private int method92(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt40 <= 0) {
				if (this.anInt43 == 256 && (this.anInt45 & 0xFF) == 0) {
					if (Static219.aBoolean313) {
						return Static679.method76(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, arg3, arg2, this);
					}
					return Static679.method83(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, arg3, arg2, this);
				}
				if (Static219.aBoolean313) {
					return Static679.method93(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, arg3, arg2, this, this.anInt43, arg4);
				}
				return Static679.method82(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, arg3, arg2, this, this.anInt43, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt40;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt40 += arg1;
			if (this.anInt43 == 256 && (this.anInt45 & 0xFF) == 0) {
				if (Static219.aBoolean313) {
					arg1 = Static679.method69(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, this.anInt42, this.anInt50, local5, arg2, this);
				} else {
					arg1 = Static679.method75(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, this.anInt48, local5, arg2, this);
				}
			} else if (Static219.aBoolean313) {
				arg1 = Static679.method89(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, this.anInt42, this.anInt50, local5, arg2, this, this.anInt43, arg4);
			} else {
				arg1 = Static679.method94(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, this.anInt48, local5, arg2, this, this.anInt43, arg4);
			}
			this.anInt40 -= arg1;
			if (this.anInt40 != 0) {
				return arg1;
			}
		} while (!this.method85());
		return arg3;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5779(@OriginalArg(0) int arg0) {
		if (this.anInt40 > 0) {
			if (arg0 >= this.anInt40) {
				if (this.anInt47 == Integer.MIN_VALUE) {
					this.anInt47 = 0;
					this.anInt44 = this.anInt41 = this.anInt51 = 0;
					this.method9380();
					arg0 = this.anInt40;
				}
				this.anInt40 = 0;
				this.method70();
			} else {
				this.anInt44 += this.anInt48 * arg0;
				this.anInt41 += this.anInt42 * arg0;
				this.anInt51 += this.anInt50 * arg0;
				this.anInt40 -= arg0;
			}
		}
		@Pc(71) Class3_Sub35_Sub1 local71 = (Class3_Sub35_Sub1) super.aClass3_Sub35_6;
		@Pc(76) int local76 = this.anInt49 << 8;
		@Pc(81) int local81 = this.anInt46 << 8;
		@Pc(87) int local87 = local71.aByteArray56.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt52 = 0;
		}
		if (this.anInt45 < 0) {
			if (this.anInt43 <= 0) {
				this.method88();
				this.method9380();
				return;
			}
			this.anInt45 = 0;
		}
		if (this.anInt45 >= local87) {
			if (this.anInt43 >= 0) {
				this.method88();
				this.method9380();
				return;
			}
			this.anInt45 = local87 - 1;
		}
		this.anInt45 += this.anInt43 * arg0;
		if (this.anInt52 >= 0) {
			if (this.anInt52 > 0) {
				if (this.aBoolean4) {
					label125: {
						if (this.anInt43 < 0) {
							if (this.anInt45 >= local76) {
								return;
							}
							this.anInt45 = local76 + local76 - this.anInt45 - 1;
							this.anInt43 = -this.anInt43;
							if (--this.anInt52 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt45 < local81) {
								return;
							}
							this.anInt45 = local81 + local81 - this.anInt45 - 1;
							this.anInt43 = -this.anInt43;
							if (--this.anInt52 == 0) {
								break;
							}
							if (this.anInt45 >= local76) {
								return;
							}
							this.anInt45 = local76 + local76 - this.anInt45 - 1;
							this.anInt43 = -this.anInt43;
						} while (--this.anInt52 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt43 < 0) {
						if (this.anInt45 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt45 - 1) / local91;
						if (local361 < this.anInt52) {
							this.anInt45 += local91 * local361;
							this.anInt52 -= local361;
							return;
						}
						this.anInt45 += local91 * this.anInt52;
						this.anInt52 = 0;
					} else if (this.anInt45 >= local81) {
						local361 = (this.anInt45 - local76) / local91;
						if (local361 < this.anInt52) {
							this.anInt45 -= local91 * local361;
							this.anInt52 -= local361;
							return;
						}
						this.anInt45 -= local91 * this.anInt52;
						this.anInt52 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt43 < 0) {
				if (this.anInt45 < 0) {
					this.anInt45 = -1;
					this.method88();
					this.method9380();
					return;
				}
			} else if (this.anInt45 >= local87) {
				this.anInt45 = local87;
				this.method88();
				this.method9380();
			}
		} else if (this.aBoolean4) {
			if (this.anInt43 < 0) {
				if (this.anInt45 >= local76) {
					return;
				}
				this.anInt45 = local76 + local76 - this.anInt45 - 1;
				this.anInt43 = -this.anInt43;
			}
			while (this.anInt45 >= local81) {
				this.anInt45 = local81 + local81 - this.anInt45 - 1;
				this.anInt43 = -this.anInt43;
				if (this.anInt45 >= local76) {
					return;
				}
				this.anInt45 = local76 + local76 - this.anInt45 - 1;
				this.anInt43 = -this.anInt43;
			}
		} else if (this.anInt43 < 0) {
			if (this.anInt45 < local76) {
				this.anInt45 = local81 - (local81 - 1 - this.anInt45) % local91 - 1;
			}
		} else if (this.anInt45 >= local81) {
			this.anInt45 = local76 + (this.anInt45 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "()I")
	public synchronized int method95() {
		return this.anInt43 < 0 ? -this.anInt43 : this.anInt43;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	public synchronized void method96(@OriginalArg(0) int arg0) {
		this.method99(arg0 << 6, this.method98());
	}

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "()I")
	public synchronized int method98() {
		return this.anInt53 < 0 ? -1 : this.anInt53;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)V")
	private synchronized void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt47 = arg0;
		this.anInt53 = arg1;
		this.anInt40 = 0;
		this.method70();
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
	public synchronized void method100(@OriginalArg(0) int arg0) {
		this.anInt52 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5778() {
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
	public synchronized void method101(@OriginalArg(0) int arg0) {
		this.method99(this.method80(), arg0);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "([IIIII)I")
	private int method102(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt40 <= 0) {
				if (this.anInt43 == -256 && (this.anInt45 & 0xFF) == 0) {
					if (Static219.aBoolean313) {
						return Static679.method72(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, arg3, arg2, this);
					}
					return Static679.method73(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, arg3, arg2, this);
				}
				if (Static219.aBoolean313) {
					return Static679.method77(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, arg3, arg2, this, this.anInt43, arg4);
				}
				return Static679.method97(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, arg3, arg2, this, this.anInt43, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt40;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt40 += arg1;
			if (this.anInt43 == -256 && (this.anInt45 & 0xFF) == 0) {
				if (Static219.aBoolean313) {
					arg1 = Static679.method71(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, this.anInt42, this.anInt50, local5, arg2, this);
				} else {
					arg1 = Static679.method91(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, this.anInt48, local5, arg2, this);
				}
			} else if (Static219.aBoolean313) {
				arg1 = Static679.method84(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt41, this.anInt51, this.anInt42, this.anInt50, local5, arg2, this, this.anInt43, arg4);
			} else {
				arg1 = Static679.method106(((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56, arg0, this.anInt45, arg1, this.anInt44, this.anInt48, local5, arg2, this, this.anInt43, arg4);
			}
			this.anInt40 -= arg1;
			if (this.anInt40 != 0) {
				return arg1;
			}
		} while (!this.method85());
		return arg3;
	}

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V")
	private synchronized void method103() {
		this.method99(0, this.method98());
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V")
	public synchronized void method104(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method103();
			this.method9380();
		} else if (this.anInt41 == 0 && this.anInt51 == 0) {
			this.anInt40 = 0;
			this.anInt47 = 0;
			this.anInt44 = 0;
			this.method9380();
		} else {
			@Pc(31) int local31 = -this.anInt44;
			if (this.anInt44 > local31) {
				local31 = this.anInt44;
			}
			if (-this.anInt41 > local31) {
				local31 = -this.anInt41;
			}
			if (this.anInt41 > local31) {
				local31 = this.anInt41;
			}
			if (-this.anInt51 > local31) {
				local31 = -this.anInt51;
			}
			if (this.anInt51 > local31) {
				local31 = this.anInt51;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt40 = arg0;
			this.anInt47 = Integer.MIN_VALUE;
			this.anInt48 = -this.anInt44 / arg0;
			this.anInt42 = -this.anInt41 / arg0;
			this.anInt50 = -this.anInt51 / arg0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "()Z")
	public boolean method105() {
		return this.anInt40 != 0;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
	@Override
	public int method5781() {
		@Pc(6) int local6 = this.anInt44 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt52 == 0) {
			local6 -= local6 * this.anInt45 / (((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56.length << 8);
		} else if (this.anInt52 >= 0) {
			local6 -= local6 * this.anInt49 / ((Class3_Sub35_Sub1) super.aClass3_Sub35_6).aByteArray56.length;
		}
		return local6 > 255 ? 255 : local6;
	}
}
