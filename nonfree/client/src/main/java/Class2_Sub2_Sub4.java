import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public int anInt4101;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	private int anInt4103;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
	public int anInt4104;

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public int anInt4106;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	private int anInt4107;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	public int anInt4108;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	public int anInt4110;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
	public int anInt4112;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	private final int anInt4099;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
	private final int anInt4109;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
	private int anInt4105;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
	private int anInt4111;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!qc;II)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class2_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub20_5 = arg0;
		this.anInt4099 = arg0.anInt3410;
		this.anInt4109 = arg0.anInt3411;
		this.aBoolean182 = arg0.aBoolean146;
		this.anInt4102 = arg1;
		this.anInt4105 = arg2;
		this.anInt4111 = 8192;
		this.anInt4100 = 0;
		this.method2858();
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!qc;III)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class2_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub20_5 = arg0;
		this.anInt4099 = arg0.anInt3410;
		this.anInt4109 = arg0.anInt3411;
		this.aBoolean182 = arg0.aBoolean146;
		this.anInt4102 = arg1;
		this.anInt4105 = arg2;
		this.anInt4111 = arg3;
		this.anInt4100 = 0;
		this.method2858();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIIII)I")
	private int method2854(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4107 <= 0) {
				if (this.anInt4102 == -256 && (this.anInt4100 & 0xFF) == 0) {
					if (Static29.aBoolean31) {
						return Static223.method2881(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, arg3, arg2, this);
					}
					return Static223.method2893(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, arg3, arg2, this);
				}
				if (Static29.aBoolean31) {
					return Static223.method2880(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, arg3, arg2, this, this.anInt4102, arg4);
				}
				return Static223.method2871(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, arg3, arg2, this, this.anInt4102, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4107;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4107 += arg1;
			if (this.anInt4102 == -256 && (this.anInt4100 & 0xFF) == 0) {
				if (Static29.aBoolean31) {
					arg1 = Static223.method2887(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, this.anInt4104, this.anInt4112, local5, arg2, this);
				} else {
					arg1 = Static223.method2885(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, this.anInt4108, local5, arg2, this);
				}
			} else if (Static29.aBoolean31) {
				arg1 = Static223.method2884(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, this.anInt4104, this.anInt4112, local5, arg2, this, this.anInt4102, arg4);
			} else {
				arg1 = Static223.method2886(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, this.anInt4108, local5, arg2, this, this.anInt4102, arg4);
			}
			this.anInt4107 -= arg1;
			if (this.anInt4107 != 0) {
				return arg1;
			}
		} while (!this.method2862());
		return arg3;
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "()V")
	private void method2855() {
		if (this.anInt4107 == 0) {
			return;
		}
		if (this.anInt4105 == Integer.MIN_VALUE) {
			this.anInt4105 = 0;
		}
		this.anInt4107 = 0;
		this.method2858();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	private synchronized void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4105 = arg0;
		this.anInt4111 = arg1;
		this.anInt4107 = 0;
		this.method2858();
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "()V")
	private void method2858() {
		this.anInt4101 = this.anInt4105;
		this.anInt4110 = Static223.method2870(this.anInt4105, this.anInt4111);
		this.anInt4106 = Static223.method2877(this.anInt4105, this.anInt4111);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
	public synchronized void method2859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2866(arg0, arg1, this.method2883());
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "()I")
	public synchronized int method2860() {
		return this.anInt4105 == Integer.MIN_VALUE ? 0 : this.anInt4105;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2850(@OriginalArg(0) int arg0) {
		if (this.anInt4107 > 0) {
			if (arg0 >= this.anInt4107) {
				if (this.anInt4105 == Integer.MIN_VALUE) {
					this.anInt4105 = 0;
					this.anInt4101 = this.anInt4110 = this.anInt4106 = 0;
					this.method3183();
					arg0 = this.anInt4107;
				}
				this.anInt4107 = 0;
				this.method2858();
			} else {
				this.anInt4101 += this.anInt4108 * arg0;
				this.anInt4110 += this.anInt4104 * arg0;
				this.anInt4106 += this.anInt4112 * arg0;
				this.anInt4107 -= arg0;
			}
		}
		@Pc(71) Class2_Sub20_Sub1 local71 = (Class2_Sub20_Sub1) super.aClass2_Sub20_5;
		@Pc(76) int local76 = this.anInt4099 << 8;
		@Pc(81) int local81 = this.anInt4109 << 8;
		@Pc(87) int local87 = local71.aByteArray35.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4103 = 0;
		}
		if (this.anInt4100 < 0) {
			if (this.anInt4102 <= 0) {
				this.method2855();
				this.method3183();
				return;
			}
			this.anInt4100 = 0;
		}
		if (this.anInt4100 >= local87) {
			if (this.anInt4102 >= 0) {
				this.method2855();
				this.method3183();
				return;
			}
			this.anInt4100 = local87 - 1;
		}
		this.anInt4100 += this.anInt4102 * arg0;
		if (this.anInt4103 >= 0) {
			if (this.anInt4103 > 0) {
				if (this.aBoolean182) {
					label125: {
						if (this.anInt4102 < 0) {
							if (this.anInt4100 >= local76) {
								return;
							}
							this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
							this.anInt4102 = -this.anInt4102;
							if (--this.anInt4103 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4100 < local81) {
								return;
							}
							this.anInt4100 = local81 + local81 - this.anInt4100 - 1;
							this.anInt4102 = -this.anInt4102;
							if (--this.anInt4103 == 0) {
								break;
							}
							if (this.anInt4100 >= local76) {
								return;
							}
							this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
							this.anInt4102 = -this.anInt4102;
						} while (--this.anInt4103 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4102 < 0) {
						if (this.anInt4100 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4100 - 1) / local91;
						if (local361 < this.anInt4103) {
							this.anInt4100 += local91 * local361;
							this.anInt4103 -= local361;
							return;
						}
						this.anInt4100 += local91 * this.anInt4103;
						this.anInt4103 = 0;
					} else if (this.anInt4100 >= local81) {
						local361 = (this.anInt4100 - local76) / local91;
						if (local361 < this.anInt4103) {
							this.anInt4100 -= local91 * local361;
							this.anInt4103 -= local361;
							return;
						}
						this.anInt4100 -= local91 * this.anInt4103;
						this.anInt4103 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4102 < 0) {
				if (this.anInt4100 < 0) {
					this.anInt4100 = -1;
					this.method2855();
					this.method3183();
					return;
				}
			} else if (this.anInt4100 >= local87) {
				this.anInt4100 = local87;
				this.method2855();
				this.method3183();
			}
		} else if (this.aBoolean182) {
			if (this.anInt4102 < 0) {
				if (this.anInt4100 >= local76) {
					return;
				}
				this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
				this.anInt4102 = -this.anInt4102;
			}
			while (this.anInt4100 >= local81) {
				this.anInt4100 = local81 + local81 - this.anInt4100 - 1;
				this.anInt4102 = -this.anInt4102;
				if (this.anInt4100 >= local76) {
					return;
				}
				this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
				this.anInt4102 = -this.anInt4102;
			}
		} else if (this.anInt4102 < 0) {
			if (this.anInt4100 < local76) {
				this.anInt4100 = local81 - (local81 - 1 - this.anInt4100) % local91 - 1;
			}
		} else if (this.anInt4100 >= local81) {
			this.anInt4100 = local76 + (this.anInt4100 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "()Z")
	private boolean method2862() {
		@Pc(2) int local2 = this.anInt4105;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static223.method2870(local2, this.anInt4111);
			local8 = Static223.method2877(local2, this.anInt4111);
		}
		if (this.anInt4101 != local2 || this.anInt4110 != local10 || this.anInt4106 != local8) {
			if (this.anInt4101 < local2) {
				this.anInt4108 = 1;
				this.anInt4107 = local2 - this.anInt4101;
			} else if (this.anInt4101 > local2) {
				this.anInt4108 = -1;
				this.anInt4107 = this.anInt4101 - local2;
			} else {
				this.anInt4108 = 0;
			}
			if (this.anInt4110 < local10) {
				this.anInt4104 = 1;
				if (this.anInt4107 == 0 || this.anInt4107 > local10 - this.anInt4110) {
					this.anInt4107 = local10 - this.anInt4110;
				}
			} else if (this.anInt4110 > local10) {
				this.anInt4104 = -1;
				if (this.anInt4107 == 0 || this.anInt4107 > this.anInt4110 - local10) {
					this.anInt4107 = this.anInt4110 - local10;
				}
			} else {
				this.anInt4104 = 0;
			}
			if (this.anInt4106 < local8) {
				this.anInt4112 = 1;
				if (this.anInt4107 == 0 || this.anInt4107 > local8 - this.anInt4106) {
					this.anInt4107 = local8 - this.anInt4106;
				}
			} else if (this.anInt4106 > local8) {
				this.anInt4112 = -1;
				if (this.anInt4107 == 0 || this.anInt4107 > this.anInt4106 - local8) {
					this.anInt4107 = this.anInt4106 - local8;
				}
			} else {
				this.anInt4112 = 0;
			}
			return false;
		} else if (this.anInt4105 == Integer.MIN_VALUE) {
			this.anInt4105 = 0;
			this.anInt4101 = this.anInt4110 = this.anInt4106 = 0;
			this.method3183();
			return true;
		} else {
			this.method2858();
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	public synchronized void method2863(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2878();
			this.method3183();
		} else if (this.anInt4110 == 0 && this.anInt4106 == 0) {
			this.anInt4107 = 0;
			this.anInt4105 = 0;
			this.anInt4101 = 0;
			this.method3183();
		} else {
			@Pc(31) int local31 = -this.anInt4101;
			if (this.anInt4101 > local31) {
				local31 = this.anInt4101;
			}
			if (-this.anInt4110 > local31) {
				local31 = -this.anInt4110;
			}
			if (this.anInt4110 > local31) {
				local31 = this.anInt4110;
			}
			if (-this.anInt4106 > local31) {
				local31 = -this.anInt4106;
			}
			if (this.anInt4106 > local31) {
				local31 = this.anInt4106;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4107 = arg0;
			this.anInt4105 = Integer.MIN_VALUE;
			this.anInt4108 = -this.anInt4101 / arg0;
			this.anInt4104 = -this.anInt4110 / arg0;
			this.anInt4112 = -this.anInt4106 / arg0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "()I")
	public synchronized int method2865() {
		return this.anInt4102 < 0 ? -this.anInt4102 : this.anInt4102;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public synchronized void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2857(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static223.method2870(arg1, arg2);
		@Pc(14) int local14 = Static223.method2877(arg1, arg2);
		if (this.anInt4110 == local10 && this.anInt4106 == local14) {
			this.anInt4107 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4101;
		if (this.anInt4101 - arg1 > local31) {
			local31 = this.anInt4101 - arg1;
		}
		if (local10 - this.anInt4110 > local31) {
			local31 = local10 - this.anInt4110;
		}
		if (this.anInt4110 - local10 > local31) {
			local31 = this.anInt4110 - local10;
		}
		if (local14 - this.anInt4106 > local31) {
			local31 = local14 - this.anInt4106;
		}
		if (this.anInt4106 - local14 > local31) {
			local31 = this.anInt4106 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4107 = arg0;
		this.anInt4105 = arg1;
		this.anInt4111 = arg2;
		this.anInt4108 = (arg1 - this.anInt4101) / arg0;
		this.anInt4104 = (local10 - this.anInt4110) / arg0;
		this.anInt4112 = (local14 - this.anInt4106) / arg0;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "()I")
	@Override
	public int method2852() {
		@Pc(6) int local6 = this.anInt4101 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4103 == 0) {
			local6 -= local6 * this.anInt4100 / (((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35.length << 8);
		} else if (this.anInt4103 >= 0) {
			local6 -= local6 * this.anInt4099 / ((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
	public synchronized void method2867(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4100 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "()I")
	@Override
	public int method2849() {
		return this.anInt4105 == 0 && this.anInt4107 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "()Z")
	public boolean method2868() {
		return this.anInt4107 != 0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "([IIIII)I")
	private int method2872(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4107 <= 0) {
				if (this.anInt4102 == 256 && (this.anInt4100 & 0xFF) == 0) {
					if (Static29.aBoolean31) {
						return Static223.method2873(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, arg3, arg2, this);
					}
					return Static223.method2869(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, arg3, arg2, this);
				}
				if (Static29.aBoolean31) {
					return Static223.method2882(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, arg3, arg2, this, this.anInt4102, arg4);
				}
				return Static223.method2856(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, arg3, arg2, this, this.anInt4102, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4107;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4107 += arg1;
			if (this.anInt4102 == 256 && (this.anInt4100 & 0xFF) == 0) {
				if (Static29.aBoolean31) {
					arg1 = Static223.method2861(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, this.anInt4104, this.anInt4112, local5, arg2, this);
				} else {
					arg1 = Static223.method2892(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, this.anInt4108, local5, arg2, this);
				}
			} else if (Static29.aBoolean31) {
				arg1 = Static223.method2874(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4110, this.anInt4106, this.anInt4104, this.anInt4112, local5, arg2, this, this.anInt4102, arg4);
			} else {
				arg1 = Static223.method2876(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35, arg0, this.anInt4100, arg1, this.anInt4101, this.anInt4108, local5, arg2, this, this.anInt4102, arg4);
			}
			this.anInt4107 -= arg1;
			if (this.anInt4107 != 0) {
				return arg1;
			}
		} while (!this.method2862());
		return arg3;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2853(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4105 == 0 && this.anInt4107 == 0) {
			this.method2850(arg2);
			return;
		}
		@Pc(13) Class2_Sub20_Sub1 local13 = (Class2_Sub20_Sub1) super.aClass2_Sub20_5;
		@Pc(18) int local18 = this.anInt4099 << 8;
		@Pc(23) int local23 = this.anInt4109 << 8;
		@Pc(29) int local29 = local13.aByteArray35.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4103 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4100 < 0) {
			if (this.anInt4102 <= 0) {
				this.method2855();
				this.method3183();
				return;
			}
			this.anInt4100 = 0;
		}
		if (this.anInt4100 >= local29) {
			if (this.anInt4102 >= 0) {
				this.method2855();
				this.method3183();
				return;
			}
			this.anInt4100 = local29 - 1;
		}
		if (this.anInt4103 >= 0) {
			if (this.anInt4103 > 0) {
				if (this.aBoolean182) {
					label130: {
						if (this.anInt4102 < 0) {
							local40 = this.method2854(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt4099]);
							if (this.anInt4100 >= local18) {
								return;
							}
							this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
							this.anInt4102 = -this.anInt4102;
							if (--this.anInt4103 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2872(arg0, local40, local23, local44, local13.aByteArray35[this.anInt4109 - 1]);
							if (this.anInt4100 < local23) {
								return;
							}
							this.anInt4100 = local23 + local23 - this.anInt4100 - 1;
							this.anInt4102 = -this.anInt4102;
							if (--this.anInt4103 == 0) {
								break;
							}
							local40 = this.method2854(arg0, local40, local18, local44, local13.aByteArray35[this.anInt4099]);
							if (this.anInt4100 >= local18) {
								return;
							}
							this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
							this.anInt4102 = -this.anInt4102;
						} while (--this.anInt4103 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4102 < 0) {
						while (true) {
							local40 = this.method2854(arg0, local40, local18, local44, local13.aByteArray35[this.anInt4109 - 1]);
							if (this.anInt4100 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4100 - 1) / local33;
							if (local416 >= this.anInt4103) {
								this.anInt4100 += local33 * this.anInt4103;
								this.anInt4103 = 0;
								break;
							}
							this.anInt4100 += local33 * local416;
							this.anInt4103 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2872(arg0, local40, local23, local44, local13.aByteArray35[this.anInt4099]);
							if (this.anInt4100 < local23) {
								return;
							}
							local416 = (this.anInt4100 - local18) / local33;
							if (local416 >= this.anInt4103) {
								this.anInt4100 -= local33 * this.anInt4103;
								this.anInt4103 = 0;
								break;
							}
							this.anInt4100 -= local33 * local416;
							this.anInt4103 -= local416;
						}
					}
				}
			}
			if (this.anInt4102 < 0) {
				this.method2854(arg0, local40, 0, local44, 0);
				if (this.anInt4100 < 0) {
					this.anInt4100 = -1;
					this.method2855();
					this.method3183();
					return;
				}
			} else {
				this.method2872(arg0, local40, local29, local44, 0);
				if (this.anInt4100 >= local29) {
					this.anInt4100 = local29;
					this.method2855();
					this.method3183();
				}
			}
		} else if (this.aBoolean182) {
			if (this.anInt4102 < 0) {
				local40 = this.method2854(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt4099]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
				this.anInt4102 = -this.anInt4102;
			}
			while (true) {
				local40 = this.method2872(arg0, local40, local23, local44, local13.aByteArray35[this.anInt4109 - 1]);
				if (this.anInt4100 < local23) {
					return;
				}
				this.anInt4100 = local23 + local23 - this.anInt4100 - 1;
				this.anInt4102 = -this.anInt4102;
				local40 = this.method2854(arg0, local40, local18, local44, local13.aByteArray35[this.anInt4099]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
				this.anInt4102 = -this.anInt4102;
			}
		} else if (this.anInt4102 < 0) {
			while (true) {
				local40 = this.method2854(arg0, local40, local18, local44, local13.aByteArray35[this.anInt4109 - 1]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local23 - (local23 - 1 - this.anInt4100) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2872(arg0, local40, local23, local44, local13.aByteArray35[this.anInt4099]);
				if (this.anInt4100 < local23) {
					return;
				}
				this.anInt4100 = local18 + (this.anInt4100 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()Lclient!af;")
	@Override
	public Class2_Sub2 method2847() {
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
	private synchronized void method2878() {
		this.method2857(0, this.method2883());
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
	public synchronized void method2879(@OriginalArg(0) int arg0) {
		this.method2857(arg0 << 6, this.method2883());
	}

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "()I")
	public synchronized int method2883() {
		return this.anInt4111 < 0 ? -1 : this.anInt4111;
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
	public synchronized void method2888(@OriginalArg(0) int arg0) {
		this.anInt4103 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "()Lclient!af;")
	@Override
	public Class2_Sub2 method2848() {
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
	public synchronized void method2889() {
		this.anInt4102 = (this.anInt4102 ^ this.anInt4102 >> 31) + (this.anInt4102 >>> 31);
		this.anInt4102 = -this.anInt4102;
	}

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "()Z")
	public boolean method2890() {
		return this.anInt4100 < 0 || this.anInt4100 >= ((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray35.length << 8;
	}

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "(I)V")
	public synchronized void method2891(@OriginalArg(0) int arg0) {
		if (this.anInt4102 < 0) {
			this.anInt4102 = -arg0;
		} else {
			this.anInt4102 = arg0;
		}
	}
}
