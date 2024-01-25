import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class14_Sub1_Sub1 extends Class14_Sub1 {

	@OriginalMember(owner = "client!aga", name = "D", descriptor = "I")
	public int anInt116;

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "I")
	public int anInt117;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!aga", name = "w", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!aga", name = "B", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "I")
	private final int anInt127;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
	private final int anInt126;

	@OriginalMember(owner = "client!aga", name = "C", descriptor = "Z")
	private final boolean aBoolean13;

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!pd;III)V")
	public Class14_Sub1_Sub1(@OriginalArg(0) Class14_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass14_Sub19_6 = arg0;
		this.anInt127 = arg0.anInt7682;
		this.anInt126 = arg0.anInt7681;
		this.aBoolean13 = arg0.aBoolean539;
		this.anInt125 = arg1;
		this.anInt123 = arg2;
		this.anInt119 = arg3;
		this.anInt122 = 0;
		this.method180();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(II)V")
	public synchronized void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method170(arg0, arg1, this.method185());
	}

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "(I)V")
	public synchronized void method152(@OriginalArg(0) int arg0) {
		this.anInt129 = arg0;
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method9318(@OriginalArg(0) int arg0) {
		if (this.anInt128 > 0) {
			if (arg0 >= this.anInt128) {
				if (this.anInt123 == Integer.MIN_VALUE) {
					this.anInt123 = 0;
					this.anInt116 = this.anInt118 = this.anInt124 = 0;
					this.method9513();
					arg0 = this.anInt128;
				}
				this.anInt128 = 0;
				this.method180();
			} else {
				this.anInt116 += this.anInt121 * arg0;
				this.anInt118 += this.anInt117 * arg0;
				this.anInt124 += this.anInt120 * arg0;
				this.anInt128 -= arg0;
			}
		}
		@Pc(71) Class14_Sub19_Sub1 local71 = (Class14_Sub19_Sub1) super.aClass14_Sub19_6;
		@Pc(76) int local76 = this.anInt127 << 8;
		@Pc(81) int local81 = this.anInt126 << 8;
		@Pc(87) int local87 = local71.aByteArray83.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt129 = 0;
		}
		if (this.anInt122 < 0) {
			if (this.anInt125 <= 0) {
				this.method177();
				this.method9513();
				return;
			}
			this.anInt122 = 0;
		}
		if (this.anInt122 >= local87) {
			if (this.anInt125 >= 0) {
				this.method177();
				this.method9513();
				return;
			}
			this.anInt122 = local87 - 1;
		}
		this.anInt122 += this.anInt125 * arg0;
		if (this.anInt129 >= 0) {
			if (this.anInt129 > 0) {
				if (this.aBoolean13) {
					label125: {
						if (this.anInt125 < 0) {
							if (this.anInt122 >= local76) {
								return;
							}
							this.anInt122 = local76 + local76 - this.anInt122 - 1;
							this.anInt125 = -this.anInt125;
							if (--this.anInt129 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt122 < local81) {
								return;
							}
							this.anInt122 = local81 + local81 - this.anInt122 - 1;
							this.anInt125 = -this.anInt125;
							if (--this.anInt129 == 0) {
								break;
							}
							if (this.anInt122 >= local76) {
								return;
							}
							this.anInt122 = local76 + local76 - this.anInt122 - 1;
							this.anInt125 = -this.anInt125;
						} while (--this.anInt129 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt125 < 0) {
						if (this.anInt122 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt122 - 1) / local91;
						if (local361 < this.anInt129) {
							this.anInt122 += local91 * local361;
							this.anInt129 -= local361;
							return;
						}
						this.anInt122 += local91 * this.anInt129;
						this.anInt129 = 0;
					} else if (this.anInt122 >= local81) {
						local361 = (this.anInt122 - local76) / local91;
						if (local361 < this.anInt129) {
							this.anInt122 -= local91 * local361;
							this.anInt129 -= local361;
							return;
						}
						this.anInt122 -= local91 * this.anInt129;
						this.anInt129 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt125 < 0) {
				if (this.anInt122 < 0) {
					this.anInt122 = -1;
					this.method177();
					this.method9513();
					return;
				}
			} else if (this.anInt122 >= local87) {
				this.anInt122 = local87;
				this.method177();
				this.method9513();
			}
		} else if (this.aBoolean13) {
			if (this.anInt125 < 0) {
				if (this.anInt122 >= local76) {
					return;
				}
				this.anInt122 = local76 + local76 - this.anInt122 - 1;
				this.anInt125 = -this.anInt125;
			}
			while (this.anInt122 >= local81) {
				this.anInt122 = local81 + local81 - this.anInt122 - 1;
				this.anInt125 = -this.anInt125;
				if (this.anInt122 >= local76) {
					return;
				}
				this.anInt122 = local76 + local76 - this.anInt122 - 1;
				this.anInt125 = -this.anInt125;
			}
		} else if (this.anInt125 < 0) {
			if (this.anInt122 < local76) {
				this.anInt122 = local81 - (local81 - 1 - this.anInt122) % local91 - 1;
			}
		} else if (this.anInt122 >= local81) {
			this.anInt122 = local76 + (this.anInt122 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "(I)V")
	public synchronized void method159(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt122 = arg0;
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "()I")
	public synchronized int method160() {
		return this.anInt125 < 0 ? -this.anInt125 : this.anInt125;
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "(I)V")
	public synchronized void method162(@OriginalArg(0) int arg0) {
		this.method174(this.method179(), arg0);
	}

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "(I)V")
	public synchronized void method163(@OriginalArg(0) int arg0) {
		if (this.anInt125 < 0) {
			this.anInt125 = -arg0;
		} else {
			this.anInt125 = arg0;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V")
	public synchronized void method164() {
		this.anInt125 = (this.anInt125 ^ this.anInt125 >> 31) + (this.anInt125 >>> 31);
		this.anInt125 = -this.anInt125;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([IIIII)I")
	private int method165(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt128 <= 0) {
				if (this.anInt125 == 256 && (this.anInt122 & 0xFF) == 0) {
					if (Static583.aBoolean664) {
						return Static692.method187(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, arg3, arg2, this);
					}
					return Static692.method153(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, arg3, arg2, this);
				}
				if (Static583.aBoolean664) {
					return Static692.method168(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, arg3, arg2, this, this.anInt125, arg4);
				}
				return Static692.method184(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, arg3, arg2, this, this.anInt125, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt128;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt128 += arg1;
			if (this.anInt125 == 256 && (this.anInt122 & 0xFF) == 0) {
				if (Static583.aBoolean664) {
					arg1 = Static692.method171(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, this.anInt117, this.anInt120, local5, arg2, this);
				} else {
					arg1 = Static692.method154(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, this.anInt121, local5, arg2, this);
				}
			} else if (Static583.aBoolean664) {
				arg1 = Static692.method158(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, this.anInt117, this.anInt120, local5, arg2, this, this.anInt125, arg4);
			} else {
				arg1 = Static692.method156(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, this.anInt121, local5, arg2, this, this.anInt125, arg4);
			}
			this.anInt128 -= arg1;
			if (this.anInt128 != 0) {
				return arg1;
			}
		} while (!this.method183());
		return arg3;
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V")
	private synchronized void method166() {
		this.method174(0, this.method185());
	}

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "(I)V")
	public synchronized void method167(@OriginalArg(0) int arg0) {
		this.method174(arg0 << 6, this.method185());
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)V")
	public synchronized void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method174(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static692.method161(arg1, arg2);
		@Pc(14) int local14 = Static692.method173(arg1, arg2);
		if (this.anInt118 == local10 && this.anInt124 == local14) {
			this.anInt128 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt116;
		if (this.anInt116 - arg1 > local31) {
			local31 = this.anInt116 - arg1;
		}
		if (local10 - this.anInt118 > local31) {
			local31 = local10 - this.anInt118;
		}
		if (this.anInt118 - local10 > local31) {
			local31 = this.anInt118 - local10;
		}
		if (local14 - this.anInt124 > local31) {
			local31 = local14 - this.anInt124;
		}
		if (this.anInt124 - local14 > local31) {
			local31 = this.anInt124 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt128 = arg0;
		this.anInt123 = arg1;
		this.anInt119 = arg2;
		this.anInt121 = (arg1 - this.anInt116) / arg0;
		this.anInt117 = (local10 - this.anInt118) / arg0;
		this.anInt120 = (local14 - this.anInt124) / arg0;
	}

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "()Z")
	public boolean method172() {
		return this.anInt122 < 0 || this.anInt122 >= ((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83.length << 8;
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(II)V")
	private synchronized void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt123 = arg0;
		this.anInt119 = arg1;
		this.anInt128 = 0;
		this.method180();
	}

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "()Z")
	public boolean method175() {
		return this.anInt128 != 0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "()I")
	@Override
	public int method9315() {
		@Pc(6) int local6 = this.anInt116 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt129 == 0) {
			local6 -= local6 * this.anInt122 / (((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83.length << 8);
		} else if (this.anInt129 >= 0) {
			local6 -= local6 * this.anInt127 / ((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9316() {
		return null;
	}

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "()V")
	private void method177() {
		if (this.anInt128 == 0) {
			return;
		}
		if (this.anInt123 == Integer.MIN_VALUE) {
			this.anInt123 = 0;
		}
		this.anInt128 = 0;
		this.method180();
	}

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "()I")
	public synchronized int method179() {
		return this.anInt123 == Integer.MIN_VALUE ? 0 : this.anInt123;
	}

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "()V")
	private void method180() {
		this.anInt116 = this.anInt123;
		this.anInt118 = Static692.method161(this.anInt123, this.anInt119);
		this.anInt124 = Static692.method173(this.anInt123, this.anInt119);
	}

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "(I)V")
	public synchronized void method181(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method166();
			this.method9513();
		} else if (this.anInt118 == 0 && this.anInt124 == 0) {
			this.anInt128 = 0;
			this.anInt123 = 0;
			this.anInt116 = 0;
			this.method9513();
		} else {
			@Pc(31) int local31 = -this.anInt116;
			if (this.anInt116 > local31) {
				local31 = this.anInt116;
			}
			if (-this.anInt118 > local31) {
				local31 = -this.anInt118;
			}
			if (this.anInt118 > local31) {
				local31 = this.anInt118;
			}
			if (-this.anInt124 > local31) {
				local31 = -this.anInt124;
			}
			if (this.anInt124 > local31) {
				local31 = this.anInt124;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt128 = arg0;
			this.anInt123 = Integer.MIN_VALUE;
			this.anInt121 = -this.anInt116 / arg0;
			this.anInt117 = -this.anInt118 / arg0;
			this.anInt120 = -this.anInt124 / arg0;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt123 == 0 && this.anInt128 == 0) {
			this.method9318(arg2);
			return;
		}
		@Pc(13) Class14_Sub19_Sub1 local13 = (Class14_Sub19_Sub1) super.aClass14_Sub19_6;
		@Pc(18) int local18 = this.anInt127 << 8;
		@Pc(23) int local23 = this.anInt126 << 8;
		@Pc(29) int local29 = local13.aByteArray83.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt129 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt122 < 0) {
			if (this.anInt125 <= 0) {
				this.method177();
				this.method9513();
				return;
			}
			this.anInt122 = 0;
		}
		if (this.anInt122 >= local29) {
			if (this.anInt125 >= 0) {
				this.method177();
				this.method9513();
				return;
			}
			this.anInt122 = local29 - 1;
		}
		if (this.anInt129 >= 0) {
			if (this.anInt129 > 0) {
				if (this.aBoolean13) {
					label130: {
						if (this.anInt125 < 0) {
							local40 = this.method186(arg0, arg1, local18, local44, local13.aByteArray83[this.anInt127]);
							if (this.anInt122 >= local18) {
								return;
							}
							this.anInt122 = local18 + local18 - this.anInt122 - 1;
							this.anInt125 = -this.anInt125;
							if (--this.anInt129 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method165(arg0, local40, local23, local44, local13.aByteArray83[this.anInt126 - 1]);
							if (this.anInt122 < local23) {
								return;
							}
							this.anInt122 = local23 + local23 - this.anInt122 - 1;
							this.anInt125 = -this.anInt125;
							if (--this.anInt129 == 0) {
								break;
							}
							local40 = this.method186(arg0, local40, local18, local44, local13.aByteArray83[this.anInt127]);
							if (this.anInt122 >= local18) {
								return;
							}
							this.anInt122 = local18 + local18 - this.anInt122 - 1;
							this.anInt125 = -this.anInt125;
						} while (--this.anInt129 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt125 < 0) {
						while (true) {
							local40 = this.method186(arg0, local40, local18, local44, local13.aByteArray83[this.anInt126 - 1]);
							if (this.anInt122 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt122 - 1) / local33;
							if (local416 >= this.anInt129) {
								this.anInt122 += local33 * this.anInt129;
								this.anInt129 = 0;
								break;
							}
							this.anInt122 += local33 * local416;
							this.anInt129 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method165(arg0, local40, local23, local44, local13.aByteArray83[this.anInt127]);
							if (this.anInt122 < local23) {
								return;
							}
							local416 = (this.anInt122 - local18) / local33;
							if (local416 >= this.anInt129) {
								this.anInt122 -= local33 * this.anInt129;
								this.anInt129 = 0;
								break;
							}
							this.anInt122 -= local33 * local416;
							this.anInt129 -= local416;
						}
					}
				}
			}
			if (this.anInt125 < 0) {
				this.method186(arg0, local40, 0, local44, 0);
				if (this.anInt122 < 0) {
					this.anInt122 = -1;
					this.method177();
					this.method9513();
					return;
				}
			} else {
				this.method165(arg0, local40, local29, local44, 0);
				if (this.anInt122 >= local29) {
					this.anInt122 = local29;
					this.method177();
					this.method9513();
				}
			}
		} else if (this.aBoolean13) {
			if (this.anInt125 < 0) {
				local40 = this.method186(arg0, arg1, local18, local44, local13.aByteArray83[this.anInt127]);
				if (this.anInt122 >= local18) {
					return;
				}
				this.anInt122 = local18 + local18 - this.anInt122 - 1;
				this.anInt125 = -this.anInt125;
			}
			while (true) {
				local40 = this.method165(arg0, local40, local23, local44, local13.aByteArray83[this.anInt126 - 1]);
				if (this.anInt122 < local23) {
					return;
				}
				this.anInt122 = local23 + local23 - this.anInt122 - 1;
				this.anInt125 = -this.anInt125;
				local40 = this.method186(arg0, local40, local18, local44, local13.aByteArray83[this.anInt127]);
				if (this.anInt122 >= local18) {
					return;
				}
				this.anInt122 = local18 + local18 - this.anInt122 - 1;
				this.anInt125 = -this.anInt125;
			}
		} else if (this.anInt125 < 0) {
			while (true) {
				local40 = this.method186(arg0, local40, local18, local44, local13.aByteArray83[this.anInt126 - 1]);
				if (this.anInt122 >= local18) {
					return;
				}
				this.anInt122 = local23 - (local23 - 1 - this.anInt122) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method165(arg0, local40, local23, local44, local13.aByteArray83[this.anInt127]);
				if (this.anInt122 < local23) {
					return;
				}
				this.anInt122 = local18 + (this.anInt122 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "()I")
	@Override
	public int method9321() {
		return this.anInt123 == 0 && this.anInt128 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "()Z")
	private boolean method183() {
		@Pc(2) int local2 = this.anInt123;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static692.method161(local2, this.anInt119);
			local8 = Static692.method173(local2, this.anInt119);
		}
		if (this.anInt116 != local2 || this.anInt118 != local10 || this.anInt124 != local8) {
			if (this.anInt116 < local2) {
				this.anInt121 = 1;
				this.anInt128 = local2 - this.anInt116;
			} else if (this.anInt116 > local2) {
				this.anInt121 = -1;
				this.anInt128 = this.anInt116 - local2;
			} else {
				this.anInt121 = 0;
			}
			if (this.anInt118 < local10) {
				this.anInt117 = 1;
				if (this.anInt128 == 0 || this.anInt128 > local10 - this.anInt118) {
					this.anInt128 = local10 - this.anInt118;
				}
			} else if (this.anInt118 > local10) {
				this.anInt117 = -1;
				if (this.anInt128 == 0 || this.anInt128 > this.anInt118 - local10) {
					this.anInt128 = this.anInt118 - local10;
				}
			} else {
				this.anInt117 = 0;
			}
			if (this.anInt124 < local8) {
				this.anInt120 = 1;
				if (this.anInt128 == 0 || this.anInt128 > local8 - this.anInt124) {
					this.anInt128 = local8 - this.anInt124;
				}
			} else if (this.anInt124 > local8) {
				this.anInt120 = -1;
				if (this.anInt128 == 0 || this.anInt128 > this.anInt124 - local8) {
					this.anInt128 = this.anInt124 - local8;
				}
			} else {
				this.anInt120 = 0;
			}
			return false;
		} else if (this.anInt123 == Integer.MIN_VALUE) {
			this.anInt123 = 0;
			this.anInt116 = this.anInt118 = this.anInt124 = 0;
			this.method9513();
			return true;
		} else {
			this.method180();
			return false;
		}
	}

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "()I")
	public synchronized int method185() {
		return this.anInt119 < 0 ? -1 : this.anInt119;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "([IIIII)I")
	private int method186(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt128 <= 0) {
				if (this.anInt125 == -256 && (this.anInt122 & 0xFF) == 0) {
					if (Static583.aBoolean664) {
						return Static692.method189(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, arg3, arg2, this);
					}
					return Static692.method178(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, arg3, arg2, this);
				}
				if (Static583.aBoolean664) {
					return Static692.method155(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, arg3, arg2, this, this.anInt125, arg4);
				}
				return Static692.method176(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, arg3, arg2, this, this.anInt125, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt128;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt128 += arg1;
			if (this.anInt125 == -256 && (this.anInt122 & 0xFF) == 0) {
				if (Static583.aBoolean664) {
					arg1 = Static692.method157(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, this.anInt117, this.anInt120, local5, arg2, this);
				} else {
					arg1 = Static692.method169(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, this.anInt121, local5, arg2, this);
				}
			} else if (Static583.aBoolean664) {
				arg1 = Static692.method182(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt118, this.anInt124, this.anInt117, this.anInt120, local5, arg2, this, this.anInt125, arg4);
			} else {
				arg1 = Static692.method151(((Class14_Sub19_Sub1) super.aClass14_Sub19_6).aByteArray83, arg0, this.anInt122, arg1, this.anInt116, this.anInt121, local5, arg2, this, this.anInt125, arg4);
			}
			this.anInt128 -= arg1;
			if (this.anInt128 != 0) {
				return arg1;
			}
		} while (!this.method183());
		return arg3;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9320() {
		return null;
	}
}
