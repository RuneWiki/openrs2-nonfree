import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class1_Sub11_Sub4 extends Class1_Sub11 {

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
	public int anInt4165;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	private int anInt4167;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public int anInt4168;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public int anInt4172;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public int anInt4173;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public int anInt4174;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
	private int anInt4176;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	private final int anInt4175;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
	private final int anInt4169;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "Z")
	private final boolean aBoolean207;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	private int anInt4178;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	private int anInt4166;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
	private int anInt4170;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	public int anInt4177;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!gf;II)V")
	public Class1_Sub11_Sub4(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub9_5 = arg0;
		this.anInt4175 = arg0.anInt1576;
		this.anInt4169 = arg0.anInt1575;
		this.aBoolean207 = arg0.aBoolean70;
		this.anInt4178 = arg1;
		this.anInt4166 = arg2;
		this.anInt4170 = 8192;
		this.anInt4177 = 0;
		this.method2949();
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!gf;III)V")
	public Class1_Sub11_Sub4(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub9_5 = arg0;
		this.anInt4175 = arg0.anInt1576;
		this.anInt4169 = arg0.anInt1575;
		this.aBoolean207 = arg0.aBoolean70;
		this.anInt4178 = arg1;
		this.anInt4166 = arg2;
		this.anInt4170 = arg3;
		this.anInt4177 = 0;
		this.method2949();
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public synchronized void method2937(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2975();
			this.method3141();
		} else if (this.anInt4173 == 0 && this.anInt4171 == 0) {
			this.anInt4176 = 0;
			this.anInt4166 = 0;
			this.anInt4174 = 0;
			this.method3141();
		} else {
			@Pc(31) int local31 = -this.anInt4174;
			if (this.anInt4174 > local31) {
				local31 = this.anInt4174;
			}
			if (-this.anInt4173 > local31) {
				local31 = -this.anInt4173;
			}
			if (this.anInt4173 > local31) {
				local31 = this.anInt4173;
			}
			if (-this.anInt4171 > local31) {
				local31 = -this.anInt4171;
			}
			if (this.anInt4171 > local31) {
				local31 = this.anInt4171;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4176 = arg0;
			this.anInt4166 = Integer.MIN_VALUE;
			this.anInt4165 = -this.anInt4174 / arg0;
			this.anInt4172 = -this.anInt4173 / arg0;
			this.anInt4168 = -this.anInt4171 / arg0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "()I")
	public synchronized int method2939() {
		return this.anInt4178 < 0 ? -this.anInt4178 : this.anInt4178;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
	public synchronized void method2941(@OriginalArg(0) int arg0) {
		if (this.anInt4178 < 0) {
			this.anInt4178 = -arg0;
		} else {
			this.anInt4178 = arg0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()Lclient!og;")
	@Override
	public Class1_Sub11 method2936() {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
	@Override
	public int method2930() {
		return this.anInt4166 == 0 && this.anInt4176 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "()Z")
	private boolean method2943() {
		@Pc(2) int local2 = this.anInt4166;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static189.method2965(local2, this.anInt4170);
			local8 = Static189.method2938(local2, this.anInt4170);
		}
		if (this.anInt4174 != local2 || this.anInt4173 != local10 || this.anInt4171 != local8) {
			if (this.anInt4174 < local2) {
				this.anInt4165 = 1;
				this.anInt4176 = local2 - this.anInt4174;
			} else if (this.anInt4174 > local2) {
				this.anInt4165 = -1;
				this.anInt4176 = this.anInt4174 - local2;
			} else {
				this.anInt4165 = 0;
			}
			if (this.anInt4173 < local10) {
				this.anInt4172 = 1;
				if (this.anInt4176 == 0 || this.anInt4176 > local10 - this.anInt4173) {
					this.anInt4176 = local10 - this.anInt4173;
				}
			} else if (this.anInt4173 > local10) {
				this.anInt4172 = -1;
				if (this.anInt4176 == 0 || this.anInt4176 > this.anInt4173 - local10) {
					this.anInt4176 = this.anInt4173 - local10;
				}
			} else {
				this.anInt4172 = 0;
			}
			if (this.anInt4171 < local8) {
				this.anInt4168 = 1;
				if (this.anInt4176 == 0 || this.anInt4176 > local8 - this.anInt4171) {
					this.anInt4176 = local8 - this.anInt4171;
				}
			} else if (this.anInt4171 > local8) {
				this.anInt4168 = -1;
				if (this.anInt4176 == 0 || this.anInt4176 > this.anInt4171 - local8) {
					this.anInt4176 = this.anInt4171 - local8;
				}
			} else {
				this.anInt4168 = 0;
			}
			return false;
		} else if (this.anInt4166 == Integer.MIN_VALUE) {
			this.anInt4166 = 0;
			this.anInt4174 = this.anInt4173 = this.anInt4171 = 0;
			this.method3141();
			return true;
		} else {
			this.method2949();
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "()Z")
	public boolean method2945() {
		return this.anInt4177 < 0 || this.anInt4177 >= ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13.length << 8;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	public synchronized void method2947() {
		this.anInt4178 = (this.anInt4178 ^ this.anInt4178 >> 31) + (this.anInt4178 >>> 31);
		this.anInt4178 = -this.anInt4178;
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "()V")
	private void method2949() {
		this.anInt4174 = this.anInt4166;
		this.anInt4173 = Static189.method2965(this.anInt4166, this.anInt4170);
		this.anInt4171 = Static189.method2938(this.anInt4166, this.anInt4170);
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2935(@OriginalArg(0) int arg0) {
		if (this.anInt4176 > 0) {
			if (arg0 >= this.anInt4176) {
				if (this.anInt4166 == Integer.MIN_VALUE) {
					this.anInt4166 = 0;
					this.anInt4174 = this.anInt4173 = this.anInt4171 = 0;
					this.method3141();
					arg0 = this.anInt4176;
				}
				this.anInt4176 = 0;
				this.method2949();
			} else {
				this.anInt4174 += this.anInt4165 * arg0;
				this.anInt4173 += this.anInt4172 * arg0;
				this.anInt4171 += this.anInt4168 * arg0;
				this.anInt4176 -= arg0;
			}
		}
		@Pc(71) Class1_Sub9_Sub1 local71 = (Class1_Sub9_Sub1) super.aClass1_Sub9_5;
		@Pc(76) int local76 = this.anInt4175 << 8;
		@Pc(81) int local81 = this.anInt4169 << 8;
		@Pc(87) int local87 = local71.aByteArray13.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4167 = 0;
		}
		if (this.anInt4177 < 0) {
			if (this.anInt4178 <= 0) {
				this.method2957();
				this.method3141();
				return;
			}
			this.anInt4177 = 0;
		}
		if (this.anInt4177 >= local87) {
			if (this.anInt4178 >= 0) {
				this.method2957();
				this.method3141();
				return;
			}
			this.anInt4177 = local87 - 1;
		}
		this.anInt4177 += this.anInt4178 * arg0;
		if (this.anInt4167 >= 0) {
			if (this.anInt4167 > 0) {
				if (this.aBoolean207) {
					label125: {
						if (this.anInt4178 < 0) {
							if (this.anInt4177 >= local76) {
								return;
							}
							this.anInt4177 = local76 + local76 - this.anInt4177 - 1;
							this.anInt4178 = -this.anInt4178;
							if (--this.anInt4167 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4177 < local81) {
								return;
							}
							this.anInt4177 = local81 + local81 - this.anInt4177 - 1;
							this.anInt4178 = -this.anInt4178;
							if (--this.anInt4167 == 0) {
								break;
							}
							if (this.anInt4177 >= local76) {
								return;
							}
							this.anInt4177 = local76 + local76 - this.anInt4177 - 1;
							this.anInt4178 = -this.anInt4178;
						} while (--this.anInt4167 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4178 < 0) {
						if (this.anInt4177 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4177 - 1) / local91;
						if (local361 < this.anInt4167) {
							this.anInt4177 += local91 * local361;
							this.anInt4167 -= local361;
							return;
						}
						this.anInt4177 += local91 * this.anInt4167;
						this.anInt4167 = 0;
					} else if (this.anInt4177 >= local81) {
						local361 = (this.anInt4177 - local76) / local91;
						if (local361 < this.anInt4167) {
							this.anInt4177 -= local91 * local361;
							this.anInt4167 -= local361;
							return;
						}
						this.anInt4177 -= local91 * this.anInt4167;
						this.anInt4167 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4178 < 0) {
				if (this.anInt4177 < 0) {
					this.anInt4177 = -1;
					this.method2957();
					this.method3141();
					return;
				}
			} else if (this.anInt4177 >= local87) {
				this.anInt4177 = local87;
				this.method2957();
				this.method3141();
			}
		} else if (this.aBoolean207) {
			if (this.anInt4178 < 0) {
				if (this.anInt4177 >= local76) {
					return;
				}
				this.anInt4177 = local76 + local76 - this.anInt4177 - 1;
				this.anInt4178 = -this.anInt4178;
			}
			while (this.anInt4177 >= local81) {
				this.anInt4177 = local81 + local81 - this.anInt4177 - 1;
				this.anInt4178 = -this.anInt4178;
				if (this.anInt4177 >= local76) {
					return;
				}
				this.anInt4177 = local76 + local76 - this.anInt4177 - 1;
				this.anInt4178 = -this.anInt4178;
			}
		} else if (this.anInt4178 < 0) {
			if (this.anInt4177 < local76) {
				this.anInt4177 = local81 - (local81 - 1 - this.anInt4177) % local91 - 1;
			}
		} else if (this.anInt4177 >= local81) {
			this.anInt4177 = local76 + (this.anInt4177 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	public int method2931() {
		@Pc(6) int local6 = this.anInt4174 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4167 == 0) {
			local6 -= local6 * this.anInt4177 / (((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13.length << 8);
		} else if (this.anInt4167 >= 0) {
			local6 -= local6 * this.anInt4175 / ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4166 == 0 && this.anInt4176 == 0) {
			this.method2935(arg2);
			return;
		}
		@Pc(13) Class1_Sub9_Sub1 local13 = (Class1_Sub9_Sub1) super.aClass1_Sub9_5;
		@Pc(18) int local18 = this.anInt4175 << 8;
		@Pc(23) int local23 = this.anInt4169 << 8;
		@Pc(29) int local29 = local13.aByteArray13.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4167 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4177 < 0) {
			if (this.anInt4178 <= 0) {
				this.method2957();
				this.method3141();
				return;
			}
			this.anInt4177 = 0;
		}
		if (this.anInt4177 >= local29) {
			if (this.anInt4178 >= 0) {
				this.method2957();
				this.method3141();
				return;
			}
			this.anInt4177 = local29 - 1;
		}
		if (this.anInt4167 >= 0) {
			if (this.anInt4167 > 0) {
				if (this.aBoolean207) {
					label130: {
						if (this.anInt4178 < 0) {
							local40 = this.method2976(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt4175]);
							if (this.anInt4177 >= local18) {
								return;
							}
							this.anInt4177 = local18 + local18 - this.anInt4177 - 1;
							this.anInt4178 = -this.anInt4178;
							if (--this.anInt4167 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2955(arg0, local40, local23, local44, local13.aByteArray13[this.anInt4169 - 1]);
							if (this.anInt4177 < local23) {
								return;
							}
							this.anInt4177 = local23 + local23 - this.anInt4177 - 1;
							this.anInt4178 = -this.anInt4178;
							if (--this.anInt4167 == 0) {
								break;
							}
							local40 = this.method2976(arg0, local40, local18, local44, local13.aByteArray13[this.anInt4175]);
							if (this.anInt4177 >= local18) {
								return;
							}
							this.anInt4177 = local18 + local18 - this.anInt4177 - 1;
							this.anInt4178 = -this.anInt4178;
						} while (--this.anInt4167 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4178 < 0) {
						while (true) {
							local40 = this.method2976(arg0, local40, local18, local44, local13.aByteArray13[this.anInt4169 - 1]);
							if (this.anInt4177 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4177 - 1) / local33;
							if (local416 >= this.anInt4167) {
								this.anInt4177 += local33 * this.anInt4167;
								this.anInt4167 = 0;
								break;
							}
							this.anInt4177 += local33 * local416;
							this.anInt4167 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2955(arg0, local40, local23, local44, local13.aByteArray13[this.anInt4175]);
							if (this.anInt4177 < local23) {
								return;
							}
							local416 = (this.anInt4177 - local18) / local33;
							if (local416 >= this.anInt4167) {
								this.anInt4177 -= local33 * this.anInt4167;
								this.anInt4167 = 0;
								break;
							}
							this.anInt4177 -= local33 * local416;
							this.anInt4167 -= local416;
						}
					}
				}
			}
			if (this.anInt4178 < 0) {
				this.method2976(arg0, local40, 0, local44, 0);
				if (this.anInt4177 < 0) {
					this.anInt4177 = -1;
					this.method2957();
					this.method3141();
					return;
				}
			} else {
				this.method2955(arg0, local40, local29, local44, 0);
				if (this.anInt4177 >= local29) {
					this.anInt4177 = local29;
					this.method2957();
					this.method3141();
				}
			}
		} else if (this.aBoolean207) {
			if (this.anInt4178 < 0) {
				local40 = this.method2976(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt4175]);
				if (this.anInt4177 >= local18) {
					return;
				}
				this.anInt4177 = local18 + local18 - this.anInt4177 - 1;
				this.anInt4178 = -this.anInt4178;
			}
			while (true) {
				local40 = this.method2955(arg0, local40, local23, local44, local13.aByteArray13[this.anInt4169 - 1]);
				if (this.anInt4177 < local23) {
					return;
				}
				this.anInt4177 = local23 + local23 - this.anInt4177 - 1;
				this.anInt4178 = -this.anInt4178;
				local40 = this.method2976(arg0, local40, local18, local44, local13.aByteArray13[this.anInt4175]);
				if (this.anInt4177 >= local18) {
					return;
				}
				this.anInt4177 = local18 + local18 - this.anInt4177 - 1;
				this.anInt4178 = -this.anInt4178;
			}
		} else if (this.anInt4178 < 0) {
			while (true) {
				local40 = this.method2976(arg0, local40, local18, local44, local13.aByteArray13[this.anInt4169 - 1]);
				if (this.anInt4177 >= local18) {
					return;
				}
				this.anInt4177 = local23 - (local23 - 1 - this.anInt4177) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2955(arg0, local40, local23, local44, local13.aByteArray13[this.anInt4175]);
				if (this.anInt4177 < local23) {
					return;
				}
				this.anInt4177 = local18 + (this.anInt4177 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIII)I")
	private int method2955(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4176 <= 0) {
				if (this.anInt4178 == 256 && (this.anInt4177 & 0xFF) == 0) {
					if (Static80.aBoolean110) {
						return Static189.method2951(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, arg3, arg2, this);
					}
					return Static189.method2967(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, arg3, arg2, this);
				}
				if (Static80.aBoolean110) {
					return Static189.method2960(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, arg3, arg2, this, this.anInt4178, arg4);
				}
				return Static189.method2964(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, arg3, arg2, this, this.anInt4178, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4176;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4176 += arg1;
			if (this.anInt4178 == 256 && (this.anInt4177 & 0xFF) == 0) {
				if (Static80.aBoolean110) {
					arg1 = Static189.method2946(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, this.anInt4172, this.anInt4168, local5, arg2, this);
				} else {
					arg1 = Static189.method2944(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, this.anInt4165, local5, arg2, this);
				}
			} else if (Static80.aBoolean110) {
				arg1 = Static189.method2973(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, this.anInt4172, this.anInt4168, local5, arg2, this, this.anInt4178, arg4);
			} else {
				arg1 = Static189.method2970(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, this.anInt4165, local5, arg2, this, this.anInt4178, arg4);
			}
			this.anInt4176 -= arg1;
			if (this.anInt4176 != 0) {
				return arg1;
			}
		} while (!this.method2943());
		return arg3;
	}

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "()V")
	private void method2957() {
		if (this.anInt4176 == 0) {
			return;
		}
		if (this.anInt4166 == Integer.MIN_VALUE) {
			this.anInt4166 = 0;
		}
		this.anInt4176 = 0;
		this.method2949();
	}

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "()I")
	public synchronized int method2958() {
		return this.anInt4166 == Integer.MIN_VALUE ? 0 : this.anInt4166;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
	public synchronized void method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2971(arg0, arg1, this.method2969());
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V")
	public synchronized void method2961(@OriginalArg(0) int arg0) {
		this.anInt4167 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
	private synchronized void method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4166 = arg0;
		this.anInt4170 = arg1;
		this.anInt4176 = 0;
		this.method2949();
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "()Z")
	public boolean method2966() {
		return this.anInt4176 != 0;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()Lclient!og;")
	@Override
	public Class1_Sub11 method2932() {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)V")
	public synchronized void method2968(@OriginalArg(0) int arg0) {
		this.method2963(arg0 << 6, this.method2969());
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "()I")
	public synchronized int method2969() {
		return this.anInt4170 < 0 ? -1 : this.anInt4170;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public synchronized void method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2963(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static189.method2965(arg1, arg2);
		@Pc(14) int local14 = Static189.method2938(arg1, arg2);
		if (this.anInt4173 == local10 && this.anInt4171 == local14) {
			this.anInt4176 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4174;
		if (this.anInt4174 - arg1 > local31) {
			local31 = this.anInt4174 - arg1;
		}
		if (local10 - this.anInt4173 > local31) {
			local31 = local10 - this.anInt4173;
		}
		if (this.anInt4173 - local10 > local31) {
			local31 = this.anInt4173 - local10;
		}
		if (local14 - this.anInt4171 > local31) {
			local31 = local14 - this.anInt4171;
		}
		if (this.anInt4171 - local14 > local31) {
			local31 = this.anInt4171 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4176 = arg0;
		this.anInt4166 = arg1;
		this.anInt4170 = arg2;
		this.anInt4165 = (arg1 - this.anInt4174) / arg0;
		this.anInt4172 = (local10 - this.anInt4173) / arg0;
		this.anInt4168 = (local14 - this.anInt4171) / arg0;
	}

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)V")
	public synchronized void method2974(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4177 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "(I)V")
	private synchronized void method2975() {
		this.method2963(0, this.method2969());
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "([IIIII)I")
	private int method2976(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4176 <= 0) {
				if (this.anInt4178 == -256 && (this.anInt4177 & 0xFF) == 0) {
					if (Static80.aBoolean110) {
						return Static189.method2952(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, arg3, arg2, this);
					}
					return Static189.method2962(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, arg3, arg2, this);
				}
				if (Static80.aBoolean110) {
					return Static189.method2954(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, arg3, arg2, this, this.anInt4178, arg4);
				}
				return Static189.method2972(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, arg3, arg2, this, this.anInt4178, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4176;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4176 += arg1;
			if (this.anInt4178 == -256 && (this.anInt4177 & 0xFF) == 0) {
				if (Static80.aBoolean110) {
					arg1 = Static189.method2956(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, this.anInt4172, this.anInt4168, local5, arg2, this);
				} else {
					arg1 = Static189.method2950(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, this.anInt4165, local5, arg2, this);
				}
			} else if (Static80.aBoolean110) {
				arg1 = Static189.method2942(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4173, this.anInt4171, this.anInt4172, this.anInt4168, local5, arg2, this, this.anInt4178, arg4);
			} else {
				arg1 = Static189.method2940(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray13, arg0, this.anInt4177, arg1, this.anInt4174, this.anInt4165, local5, arg2, this, this.anInt4178, arg4);
			}
			this.anInt4176 -= arg1;
			if (this.anInt4176 != 0) {
				return arg1;
			}
		} while (!this.method2943());
		return arg3;
	}
}
