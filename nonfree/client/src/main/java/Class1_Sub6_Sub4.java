import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public int anInt8174;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
	public int anInt8176;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	public int anInt8178;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
	public int anInt8179;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	private int anInt8180;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
	public int anInt8182;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
	private int anInt8183;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	public int anInt8187;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	private final int anInt8181;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
	private final int anInt8186;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
	private final boolean aBoolean614;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	private int anInt8177;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	private int anInt8184;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	private int anInt8175;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public int anInt8185;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!bu;III)V")
	public Class1_Sub6_Sub4(@OriginalArg(0) Class1_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub13_5 = arg0;
		this.anInt8181 = arg0.anInt913;
		this.anInt8186 = arg0.anInt915;
		this.aBoolean614 = arg0.aBoolean51;
		this.anInt8177 = arg1;
		this.anInt8184 = arg2;
		this.anInt8175 = arg3;
		this.anInt8185 = 0;
		this.method6621();
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "()Z")
	public boolean method6584() {
		return this.anInt8183 != 0;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "()I")
	public synchronized int method6585() {
		return this.anInt8184 == Integer.MIN_VALUE ? 0 : this.anInt8184;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub6 method6578() {
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public synchronized void method6588(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt8185 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	private synchronized void method6589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8184 = arg0;
		this.anInt8175 = arg1;
		this.anInt8183 = 0;
		this.method6621();
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "()I")
	public synchronized int method6590() {
		return this.anInt8175 < 0 ? -1 : this.anInt8175;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public synchronized void method6596() {
		this.anInt8177 = (this.anInt8177 ^ this.anInt8177 >> 31) + (this.anInt8177 >>> 31);
		this.anInt8177 = -this.anInt8177;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public synchronized void method6597(@OriginalArg(0) int arg0) {
		if (this.anInt8177 < 0) {
			this.anInt8177 = -arg0;
		} else {
			this.anInt8177 = arg0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6579(@OriginalArg(0) int arg0) {
		if (this.anInt8183 > 0) {
			if (arg0 >= this.anInt8183) {
				if (this.anInt8184 == Integer.MIN_VALUE) {
					this.anInt8184 = 0;
					this.anInt8187 = this.anInt8182 = this.anInt8176 = 0;
					this.method7908();
					arg0 = this.anInt8183;
				}
				this.anInt8183 = 0;
				this.method6621();
			} else {
				this.anInt8187 += this.anInt8174 * arg0;
				this.anInt8182 += this.anInt8179 * arg0;
				this.anInt8176 += this.anInt8178 * arg0;
				this.anInt8183 -= arg0;
			}
		}
		@Pc(71) Class1_Sub13_Sub1 local71 = (Class1_Sub13_Sub1) super.aClass1_Sub13_5;
		@Pc(76) int local76 = this.anInt8181 << 8;
		@Pc(81) int local81 = this.anInt8186 << 8;
		@Pc(87) int local87 = local71.aByteArray8.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt8180 = 0;
		}
		if (this.anInt8185 < 0) {
			if (this.anInt8177 <= 0) {
				this.method6618();
				this.method7908();
				return;
			}
			this.anInt8185 = 0;
		}
		if (this.anInt8185 >= local87) {
			if (this.anInt8177 >= 0) {
				this.method6618();
				this.method7908();
				return;
			}
			this.anInt8185 = local87 - 1;
		}
		this.anInt8185 += this.anInt8177 * arg0;
		if (this.anInt8180 >= 0) {
			if (this.anInt8180 > 0) {
				if (this.aBoolean614) {
					label125: {
						if (this.anInt8177 < 0) {
							if (this.anInt8185 >= local76) {
								return;
							}
							this.anInt8185 = local76 + local76 - this.anInt8185 - 1;
							this.anInt8177 = -this.anInt8177;
							if (--this.anInt8180 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt8185 < local81) {
								return;
							}
							this.anInt8185 = local81 + local81 - this.anInt8185 - 1;
							this.anInt8177 = -this.anInt8177;
							if (--this.anInt8180 == 0) {
								break;
							}
							if (this.anInt8185 >= local76) {
								return;
							}
							this.anInt8185 = local76 + local76 - this.anInt8185 - 1;
							this.anInt8177 = -this.anInt8177;
						} while (--this.anInt8180 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt8177 < 0) {
						if (this.anInt8185 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt8185 - 1) / local91;
						if (local361 < this.anInt8180) {
							this.anInt8185 += local91 * local361;
							this.anInt8180 -= local361;
							return;
						}
						this.anInt8185 += local91 * this.anInt8180;
						this.anInt8180 = 0;
					} else if (this.anInt8185 >= local81) {
						local361 = (this.anInt8185 - local76) / local91;
						if (local361 < this.anInt8180) {
							this.anInt8185 -= local91 * local361;
							this.anInt8180 -= local361;
							return;
						}
						this.anInt8185 -= local91 * this.anInt8180;
						this.anInt8180 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt8177 < 0) {
				if (this.anInt8185 < 0) {
					this.anInt8185 = -1;
					this.method6618();
					this.method7908();
					return;
				}
			} else if (this.anInt8185 >= local87) {
				this.anInt8185 = local87;
				this.method6618();
				this.method7908();
			}
		} else if (this.aBoolean614) {
			if (this.anInt8177 < 0) {
				if (this.anInt8185 >= local76) {
					return;
				}
				this.anInt8185 = local76 + local76 - this.anInt8185 - 1;
				this.anInt8177 = -this.anInt8177;
			}
			while (this.anInt8185 >= local81) {
				this.anInt8185 = local81 + local81 - this.anInt8185 - 1;
				this.anInt8177 = -this.anInt8177;
				if (this.anInt8185 >= local76) {
					return;
				}
				this.anInt8185 = local76 + local76 - this.anInt8185 - 1;
				this.anInt8177 = -this.anInt8177;
			}
		} else if (this.anInt8177 < 0) {
			if (this.anInt8185 < local76) {
				this.anInt8185 = local81 - (local81 - 1 - this.anInt8185) % local91 - 1;
			}
		} else if (this.anInt8185 >= local81) {
			this.anInt8185 = local76 + (this.anInt8185 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V")
	public synchronized void method6598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6599(arg0, arg1, this.method6590());
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	public synchronized void method6599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6589(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static605.method6593(arg1, arg2);
		@Pc(14) int local14 = Static605.method6613(arg1, arg2);
		if (this.anInt8182 == local10 && this.anInt8176 == local14) {
			this.anInt8183 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt8187;
		if (this.anInt8187 - arg1 > local31) {
			local31 = this.anInt8187 - arg1;
		}
		if (local10 - this.anInt8182 > local31) {
			local31 = local10 - this.anInt8182;
		}
		if (this.anInt8182 - local10 > local31) {
			local31 = this.anInt8182 - local10;
		}
		if (local14 - this.anInt8176 > local31) {
			local31 = local14 - this.anInt8176;
		}
		if (this.anInt8176 - local14 > local31) {
			local31 = this.anInt8176 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt8183 = arg0;
		this.anInt8184 = arg1;
		this.anInt8175 = arg2;
		this.anInt8174 = (arg1 - this.anInt8187) / arg0;
		this.anInt8179 = (local10 - this.anInt8182) / arg0;
		this.anInt8178 = (local14 - this.anInt8176) / arg0;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	private synchronized void method6602() {
		this.method6589(0, this.method6590());
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "()Z")
	private boolean method6604() {
		@Pc(2) int local2 = this.anInt8184;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static605.method6593(local2, this.anInt8175);
			local8 = Static605.method6613(local2, this.anInt8175);
		}
		if (this.anInt8187 != local2 || this.anInt8182 != local10 || this.anInt8176 != local8) {
			if (this.anInt8187 < local2) {
				this.anInt8174 = 1;
				this.anInt8183 = local2 - this.anInt8187;
			} else if (this.anInt8187 > local2) {
				this.anInt8174 = -1;
				this.anInt8183 = this.anInt8187 - local2;
			} else {
				this.anInt8174 = 0;
			}
			if (this.anInt8182 < local10) {
				this.anInt8179 = 1;
				if (this.anInt8183 == 0 || this.anInt8183 > local10 - this.anInt8182) {
					this.anInt8183 = local10 - this.anInt8182;
				}
			} else if (this.anInt8182 > local10) {
				this.anInt8179 = -1;
				if (this.anInt8183 == 0 || this.anInt8183 > this.anInt8182 - local10) {
					this.anInt8183 = this.anInt8182 - local10;
				}
			} else {
				this.anInt8179 = 0;
			}
			if (this.anInt8176 < local8) {
				this.anInt8178 = 1;
				if (this.anInt8183 == 0 || this.anInt8183 > local8 - this.anInt8176) {
					this.anInt8183 = local8 - this.anInt8176;
				}
			} else if (this.anInt8176 > local8) {
				this.anInt8178 = -1;
				if (this.anInt8183 == 0 || this.anInt8183 > this.anInt8176 - local8) {
					this.anInt8183 = this.anInt8176 - local8;
				}
			} else {
				this.anInt8178 = 0;
			}
			return false;
		} else if (this.anInt8184 == Integer.MIN_VALUE) {
			this.anInt8184 = 0;
			this.anInt8187 = this.anInt8182 = this.anInt8176 = 0;
			this.method7908();
			return true;
		} else {
			this.method6621();
			return false;
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "()I")
	@Override
	public int method6580() {
		return this.anInt8184 == 0 && this.anInt8183 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
	@Override
	public int method6575() {
		@Pc(6) int local6 = this.anInt8187 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt8180 == 0) {
			local6 -= local6 * this.anInt8185 / (((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8.length << 8);
		} else if (this.anInt8180 >= 0) {
			local6 -= local6 * this.anInt8181 / ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub6 method6577() {
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([IIIII)I")
	private int method6607(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt8183 <= 0) {
				if (this.anInt8177 == 256 && (this.anInt8185 & 0xFF) == 0) {
					if (Static269.aBoolean372) {
						return Static605.method6609(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, arg3, arg2, this);
					}
					return Static605.method6591(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, arg3, arg2, this);
				}
				if (Static269.aBoolean372) {
					return Static605.method6600(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, arg3, arg2, this, this.anInt8177, arg4);
				}
				return Static605.method6603(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, arg3, arg2, this, this.anInt8177, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt8183;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt8183 += arg1;
			if (this.anInt8177 == 256 && (this.anInt8185 & 0xFF) == 0) {
				if (Static269.aBoolean372) {
					arg1 = Static605.method6592(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, this.anInt8179, this.anInt8178, local5, arg2, this);
				} else {
					arg1 = Static605.method6601(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, this.anInt8174, local5, arg2, this);
				}
			} else if (Static269.aBoolean372) {
				arg1 = Static605.method6610(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, this.anInt8179, this.anInt8178, local5, arg2, this, this.anInt8177, arg4);
			} else {
				arg1 = Static605.method6594(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, this.anInt8174, local5, arg2, this, this.anInt8177, arg4);
			}
			this.anInt8183 -= arg1;
			if (this.anInt8183 != 0) {
				return arg1;
			}
		} while (!this.method6604());
		return arg3;
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "()Z")
	public boolean method6608() {
		return this.anInt8185 < 0 || this.anInt8185 >= ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8.length << 8;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8184 == 0 && this.anInt8183 == 0) {
			this.method6579(arg2);
			return;
		}
		@Pc(13) Class1_Sub13_Sub1 local13 = (Class1_Sub13_Sub1) super.aClass1_Sub13_5;
		@Pc(18) int local18 = this.anInt8181 << 8;
		@Pc(23) int local23 = this.anInt8186 << 8;
		@Pc(29) int local29 = local13.aByteArray8.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt8180 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt8185 < 0) {
			if (this.anInt8177 <= 0) {
				this.method6618();
				this.method7908();
				return;
			}
			this.anInt8185 = 0;
		}
		if (this.anInt8185 >= local29) {
			if (this.anInt8177 >= 0) {
				this.method6618();
				this.method7908();
				return;
			}
			this.anInt8185 = local29 - 1;
		}
		if (this.anInt8180 >= 0) {
			if (this.anInt8180 > 0) {
				if (this.aBoolean614) {
					label130: {
						if (this.anInt8177 < 0) {
							local40 = this.method6616(arg0, arg1, local18, local44, local13.aByteArray8[this.anInt8181]);
							if (this.anInt8185 >= local18) {
								return;
							}
							this.anInt8185 = local18 + local18 - this.anInt8185 - 1;
							this.anInt8177 = -this.anInt8177;
							if (--this.anInt8180 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6607(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8186 - 1]);
							if (this.anInt8185 < local23) {
								return;
							}
							this.anInt8185 = local23 + local23 - this.anInt8185 - 1;
							this.anInt8177 = -this.anInt8177;
							if (--this.anInt8180 == 0) {
								break;
							}
							local40 = this.method6616(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8181]);
							if (this.anInt8185 >= local18) {
								return;
							}
							this.anInt8185 = local18 + local18 - this.anInt8185 - 1;
							this.anInt8177 = -this.anInt8177;
						} while (--this.anInt8180 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt8177 < 0) {
						while (true) {
							local40 = this.method6616(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8186 - 1]);
							if (this.anInt8185 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt8185 - 1) / local33;
							if (local416 >= this.anInt8180) {
								this.anInt8185 += local33 * this.anInt8180;
								this.anInt8180 = 0;
								break;
							}
							this.anInt8185 += local33 * local416;
							this.anInt8180 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6607(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8181]);
							if (this.anInt8185 < local23) {
								return;
							}
							local416 = (this.anInt8185 - local18) / local33;
							if (local416 >= this.anInt8180) {
								this.anInt8185 -= local33 * this.anInt8180;
								this.anInt8180 = 0;
								break;
							}
							this.anInt8185 -= local33 * local416;
							this.anInt8180 -= local416;
						}
					}
				}
			}
			if (this.anInt8177 < 0) {
				this.method6616(arg0, local40, 0, local44, 0);
				if (this.anInt8185 < 0) {
					this.anInt8185 = -1;
					this.method6618();
					this.method7908();
					return;
				}
			} else {
				this.method6607(arg0, local40, local29, local44, 0);
				if (this.anInt8185 >= local29) {
					this.anInt8185 = local29;
					this.method6618();
					this.method7908();
				}
			}
		} else if (this.aBoolean614) {
			if (this.anInt8177 < 0) {
				local40 = this.method6616(arg0, arg1, local18, local44, local13.aByteArray8[this.anInt8181]);
				if (this.anInt8185 >= local18) {
					return;
				}
				this.anInt8185 = local18 + local18 - this.anInt8185 - 1;
				this.anInt8177 = -this.anInt8177;
			}
			while (true) {
				local40 = this.method6607(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8186 - 1]);
				if (this.anInt8185 < local23) {
					return;
				}
				this.anInt8185 = local23 + local23 - this.anInt8185 - 1;
				this.anInt8177 = -this.anInt8177;
				local40 = this.method6616(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8181]);
				if (this.anInt8185 >= local18) {
					return;
				}
				this.anInt8185 = local18 + local18 - this.anInt8185 - 1;
				this.anInt8177 = -this.anInt8177;
			}
		} else if (this.anInt8177 < 0) {
			while (true) {
				local40 = this.method6616(arg0, local40, local18, local44, local13.aByteArray8[this.anInt8186 - 1]);
				if (this.anInt8185 >= local18) {
					return;
				}
				this.anInt8185 = local23 - (local23 - 1 - this.anInt8185) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6607(arg0, local40, local23, local44, local13.aByteArray8[this.anInt8181]);
				if (this.anInt8185 < local23) {
					return;
				}
				this.anInt8185 = local18 + (this.anInt8185 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
	public synchronized void method6611(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6602();
			this.method7908();
		} else if (this.anInt8182 == 0 && this.anInt8176 == 0) {
			this.anInt8183 = 0;
			this.anInt8184 = 0;
			this.anInt8187 = 0;
			this.method7908();
		} else {
			@Pc(31) int local31 = -this.anInt8187;
			if (this.anInt8187 > local31) {
				local31 = this.anInt8187;
			}
			if (-this.anInt8182 > local31) {
				local31 = -this.anInt8182;
			}
			if (this.anInt8182 > local31) {
				local31 = this.anInt8182;
			}
			if (-this.anInt8176 > local31) {
				local31 = -this.anInt8176;
			}
			if (this.anInt8176 > local31) {
				local31 = this.anInt8176;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt8183 = arg0;
			this.anInt8184 = Integer.MIN_VALUE;
			this.anInt8174 = -this.anInt8187 / arg0;
			this.anInt8179 = -this.anInt8182 / arg0;
			this.anInt8178 = -this.anInt8176 / arg0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V")
	public synchronized void method6612(@OriginalArg(0) int arg0) {
		this.method6589(this.method6585(), arg0);
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "()I")
	public synchronized int method6614() {
		return this.anInt8177 < 0 ? -this.anInt8177 : this.anInt8177;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "([IIIII)I")
	private int method6616(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt8183 <= 0) {
				if (this.anInt8177 == -256 && (this.anInt8185 & 0xFF) == 0) {
					if (Static269.aBoolean372) {
						return Static605.method6606(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, arg3, arg2, this);
					}
					return Static605.method6583(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, arg3, arg2, this);
				}
				if (Static269.aBoolean372) {
					return Static605.method6605(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, arg3, arg2, this, this.anInt8177, arg4);
				}
				return Static605.method6586(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, arg3, arg2, this, this.anInt8177, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt8183;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt8183 += arg1;
			if (this.anInt8177 == -256 && (this.anInt8185 & 0xFF) == 0) {
				if (Static269.aBoolean372) {
					arg1 = Static605.method6587(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, this.anInt8179, this.anInt8178, local5, arg2, this);
				} else {
					arg1 = Static605.method6615(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, this.anInt8174, local5, arg2, this);
				}
			} else if (Static269.aBoolean372) {
				arg1 = Static605.method6595(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8182, this.anInt8176, this.anInt8179, this.anInt8178, local5, arg2, this, this.anInt8177, arg4);
			} else {
				arg1 = Static605.method6582(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray8, arg0, this.anInt8185, arg1, this.anInt8187, this.anInt8174, local5, arg2, this, this.anInt8177, arg4);
			}
			this.anInt8183 -= arg1;
			if (this.anInt8183 != 0) {
				return arg1;
			}
		} while (!this.method6604());
		return arg3;
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "()V")
	private void method6618() {
		if (this.anInt8183 == 0) {
			return;
		}
		if (this.anInt8184 == Integer.MIN_VALUE) {
			this.anInt8184 = 0;
		}
		this.anInt8183 = 0;
		this.method6621();
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V")
	public synchronized void method6619(@OriginalArg(0) int arg0) {
		this.method6589(arg0 << 6, this.method6590());
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "(I)V")
	public synchronized void method6620(@OriginalArg(0) int arg0) {
		this.anInt8180 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "()V")
	private void method6621() {
		this.anInt8187 = this.anInt8184;
		this.anInt8182 = Static605.method6593(this.anInt8184, this.anInt8175);
		this.anInt8176 = Static605.method6613(this.anInt8184, this.anInt8175);
	}
}
