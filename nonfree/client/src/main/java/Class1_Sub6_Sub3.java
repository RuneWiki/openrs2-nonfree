import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	public int anInt2900;

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
	private int anInt2903;

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
	private int anInt2906;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
	public int anInt2908;

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
	public int anInt2910;

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
	public int anInt2911;

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
	public int anInt2912;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
	private final int anInt2904;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
	private final int anInt2902;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "Z")
	private final boolean aBoolean117;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
	private int anInt2901;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
	private int anInt2909;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
	public int anInt2913;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!mg;II)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub19_5 = arg0;
		this.anInt2904 = arg0.anInt2892;
		this.anInt2902 = arg0.anInt2893;
		this.aBoolean117 = arg0.aBoolean115;
		this.anInt2901 = arg1;
		this.anInt2909 = arg2;
		this.anInt2905 = 8192;
		this.anInt2913 = 0;
		this.method2205();
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!mg;III)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub19_5 = arg0;
		this.anInt2904 = arg0.anInt2892;
		this.anInt2902 = arg0.anInt2893;
		this.aBoolean117 = arg0.aBoolean115;
		this.anInt2901 = arg1;
		this.anInt2909 = arg2;
		this.anInt2905 = arg3;
		this.anInt2913 = 0;
		this.method2205();
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	public synchronized void method2184(@OriginalArg(0) int arg0) {
		this.anInt2903 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "()I")
	public synchronized int method2186() {
		return this.anInt2909 == Integer.MIN_VALUE ? 0 : this.anInt2909;
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "()I")
	public synchronized int method2187() {
		return this.anInt2905 < 0 ? -1 : this.anInt2905;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2373(@OriginalArg(0) int arg0) {
		if (this.anInt2906 > 0) {
			if (arg0 >= this.anInt2906) {
				if (this.anInt2909 == Integer.MIN_VALUE) {
					this.anInt2909 = 0;
					this.anInt2908 = this.anInt2911 = this.anInt2912 = 0;
					this.method3295();
					arg0 = this.anInt2906;
				}
				this.anInt2906 = 0;
				this.method2205();
			} else {
				this.anInt2908 += this.anInt2900 * arg0;
				this.anInt2911 += this.anInt2907 * arg0;
				this.anInt2912 += this.anInt2910 * arg0;
				this.anInt2906 -= arg0;
			}
		}
		@Pc(71) Class1_Sub19_Sub1 local71 = (Class1_Sub19_Sub1) super.aClass1_Sub19_5;
		@Pc(76) int local76 = this.anInt2904 << 8;
		@Pc(81) int local81 = this.anInt2902 << 8;
		@Pc(87) int local87 = local71.aByteArray35.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2903 = 0;
		}
		if (this.anInt2913 < 0) {
			if (this.anInt2901 <= 0) {
				this.method2190();
				this.method3295();
				return;
			}
			this.anInt2913 = 0;
		}
		if (this.anInt2913 >= local87) {
			if (this.anInt2901 >= 0) {
				this.method2190();
				this.method3295();
				return;
			}
			this.anInt2913 = local87 - 1;
		}
		this.anInt2913 += this.anInt2901 * arg0;
		if (this.anInt2903 >= 0) {
			if (this.anInt2903 > 0) {
				if (this.aBoolean117) {
					label125: {
						if (this.anInt2901 < 0) {
							if (this.anInt2913 >= local76) {
								return;
							}
							this.anInt2913 = local76 + local76 - this.anInt2913 - 1;
							this.anInt2901 = -this.anInt2901;
							if (--this.anInt2903 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2913 < local81) {
								return;
							}
							this.anInt2913 = local81 + local81 - this.anInt2913 - 1;
							this.anInt2901 = -this.anInt2901;
							if (--this.anInt2903 == 0) {
								break;
							}
							if (this.anInt2913 >= local76) {
								return;
							}
							this.anInt2913 = local76 + local76 - this.anInt2913 - 1;
							this.anInt2901 = -this.anInt2901;
						} while (--this.anInt2903 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2901 < 0) {
						if (this.anInt2913 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2913 - 1) / local91;
						if (local361 < this.anInt2903) {
							this.anInt2913 += local91 * local361;
							this.anInt2903 -= local361;
							return;
						}
						this.anInt2913 += local91 * this.anInt2903;
						this.anInt2903 = 0;
					} else if (this.anInt2913 >= local81) {
						local361 = (this.anInt2913 - local76) / local91;
						if (local361 < this.anInt2903) {
							this.anInt2913 -= local91 * local361;
							this.anInt2903 -= local361;
							return;
						}
						this.anInt2913 -= local91 * this.anInt2903;
						this.anInt2903 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2901 < 0) {
				if (this.anInt2913 < 0) {
					this.anInt2913 = -1;
					this.method2190();
					this.method3295();
					return;
				}
			} else if (this.anInt2913 >= local87) {
				this.anInt2913 = local87;
				this.method2190();
				this.method3295();
			}
		} else if (this.aBoolean117) {
			if (this.anInt2901 < 0) {
				if (this.anInt2913 >= local76) {
					return;
				}
				this.anInt2913 = local76 + local76 - this.anInt2913 - 1;
				this.anInt2901 = -this.anInt2901;
			}
			while (this.anInt2913 >= local81) {
				this.anInt2913 = local81 + local81 - this.anInt2913 - 1;
				this.anInt2901 = -this.anInt2901;
				if (this.anInt2913 >= local76) {
					return;
				}
				this.anInt2913 = local76 + local76 - this.anInt2913 - 1;
				this.anInt2901 = -this.anInt2901;
			}
		} else if (this.anInt2901 < 0) {
			if (this.anInt2913 < local76) {
				this.anInt2913 = local81 - (local81 - 1 - this.anInt2913) % local91 - 1;
			}
		} else if (this.anInt2913 >= local81) {
			this.anInt2913 = local76 + (this.anInt2913 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "()V")
	private void method2190() {
		if (this.anInt2906 == 0) {
			return;
		}
		if (this.anInt2909 == Integer.MIN_VALUE) {
			this.anInt2909 = 0;
		}
		this.anInt2906 = 0;
		this.method2205();
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "()Z")
	public boolean method2191() {
		return this.anInt2906 != 0;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
	public synchronized void method2192(@OriginalArg(0) int arg0) {
		this.method2210(arg0 << 6, this.method2187());
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII)I")
	private int method2194(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2906 <= 0) {
				if (this.anInt2901 == 256 && (this.anInt2913 & 0xFF) == 0) {
					if (Static128.aBoolean131) {
						return Static216.method2196(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, arg3, arg2, this);
					}
					return Static216.method2188(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, arg3, arg2, this);
				}
				if (Static128.aBoolean131) {
					return Static216.method2212(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, arg3, arg2, this, this.anInt2901, arg4);
				}
				return Static216.method2222(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, arg3, arg2, this, this.anInt2901, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2906;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2906 += arg1;
			if (this.anInt2901 == 256 && (this.anInt2913 & 0xFF) == 0) {
				if (Static128.aBoolean131) {
					arg1 = Static216.method2221(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, this.anInt2907, this.anInt2910, local5, arg2, this);
				} else {
					arg1 = Static216.method2189(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, this.anInt2900, local5, arg2, this);
				}
			} else if (Static128.aBoolean131) {
				arg1 = Static216.method2207(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, this.anInt2907, this.anInt2910, local5, arg2, this, this.anInt2901, arg4);
			} else {
				arg1 = Static216.method2185(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, this.anInt2900, local5, arg2, this, this.anInt2901, arg4);
			}
			this.anInt2906 -= arg1;
			if (this.anInt2906 != 0) {
				return arg1;
			}
		} while (!this.method2223());
		return arg3;
	}

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "()Z")
	public boolean method2195() {
		return this.anInt2913 < 0 || this.anInt2913 >= ((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35.length << 8;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public synchronized void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2210(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static216.method2218(arg1, arg2);
		@Pc(14) int local14 = Static216.method2200(arg1, arg2);
		if (this.anInt2911 == local10 && this.anInt2912 == local14) {
			this.anInt2906 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2908;
		if (this.anInt2908 - arg1 > local31) {
			local31 = this.anInt2908 - arg1;
		}
		if (local10 - this.anInt2911 > local31) {
			local31 = local10 - this.anInt2911;
		}
		if (this.anInt2911 - local10 > local31) {
			local31 = this.anInt2911 - local10;
		}
		if (local14 - this.anInt2912 > local31) {
			local31 = local14 - this.anInt2912;
		}
		if (this.anInt2912 - local14 > local31) {
			local31 = this.anInt2912 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2906 = arg0;
		this.anInt2909 = arg1;
		this.anInt2905 = arg2;
		this.anInt2900 = (arg1 - this.anInt2908) / arg0;
		this.anInt2907 = (local10 - this.anInt2911) / arg0;
		this.anInt2910 = (local14 - this.anInt2912) / arg0;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
	private synchronized void method2199() {
		this.method2210(0, this.method2187());
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public synchronized void method2202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2197(arg0, arg1, this.method2187());
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lclient!d;")
	@Override
	public Class1_Sub6 method2368() {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "()I")
	@Override
	public int method2374() {
		return this.anInt2909 == 0 && this.anInt2906 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()Lclient!d;")
	@Override
	public Class1_Sub6 method2369() {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()I")
	@Override
	public int method2372() {
		@Pc(6) int local6 = this.anInt2908 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2903 == 0) {
			local6 -= local6 * this.anInt2913 / (((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35.length << 8);
		} else if (this.anInt2903 >= 0) {
			local6 -= local6 * this.anInt2904 / ((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "()V")
	private void method2205() {
		this.anInt2908 = this.anInt2909;
		this.anInt2911 = Static216.method2218(this.anInt2909, this.anInt2905);
		this.anInt2912 = Static216.method2200(this.anInt2909, this.anInt2905);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2909 == 0 && this.anInt2906 == 0) {
			this.method2373(arg2);
			return;
		}
		@Pc(13) Class1_Sub19_Sub1 local13 = (Class1_Sub19_Sub1) super.aClass1_Sub19_5;
		@Pc(18) int local18 = this.anInt2904 << 8;
		@Pc(23) int local23 = this.anInt2902 << 8;
		@Pc(29) int local29 = local13.aByteArray35.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2903 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2913 < 0) {
			if (this.anInt2901 <= 0) {
				this.method2190();
				this.method3295();
				return;
			}
			this.anInt2913 = 0;
		}
		if (this.anInt2913 >= local29) {
			if (this.anInt2901 >= 0) {
				this.method2190();
				this.method3295();
				return;
			}
			this.anInt2913 = local29 - 1;
		}
		if (this.anInt2903 >= 0) {
			if (this.anInt2903 > 0) {
				if (this.aBoolean117) {
					label130: {
						if (this.anInt2901 < 0) {
							local40 = this.method2216(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt2904]);
							if (this.anInt2913 >= local18) {
								return;
							}
							this.anInt2913 = local18 + local18 - this.anInt2913 - 1;
							this.anInt2901 = -this.anInt2901;
							if (--this.anInt2903 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2194(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2902 - 1]);
							if (this.anInt2913 < local23) {
								return;
							}
							this.anInt2913 = local23 + local23 - this.anInt2913 - 1;
							this.anInt2901 = -this.anInt2901;
							if (--this.anInt2903 == 0) {
								break;
							}
							local40 = this.method2216(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2904]);
							if (this.anInt2913 >= local18) {
								return;
							}
							this.anInt2913 = local18 + local18 - this.anInt2913 - 1;
							this.anInt2901 = -this.anInt2901;
						} while (--this.anInt2903 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2901 < 0) {
						while (true) {
							local40 = this.method2216(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2902 - 1]);
							if (this.anInt2913 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2913 - 1) / local33;
							if (local416 >= this.anInt2903) {
								this.anInt2913 += local33 * this.anInt2903;
								this.anInt2903 = 0;
								break;
							}
							this.anInt2913 += local33 * local416;
							this.anInt2903 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2194(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2904]);
							if (this.anInt2913 < local23) {
								return;
							}
							local416 = (this.anInt2913 - local18) / local33;
							if (local416 >= this.anInt2903) {
								this.anInt2913 -= local33 * this.anInt2903;
								this.anInt2903 = 0;
								break;
							}
							this.anInt2913 -= local33 * local416;
							this.anInt2903 -= local416;
						}
					}
				}
			}
			if (this.anInt2901 < 0) {
				this.method2216(arg0, local40, 0, local44, 0);
				if (this.anInt2913 < 0) {
					this.anInt2913 = -1;
					this.method2190();
					this.method3295();
					return;
				}
			} else {
				this.method2194(arg0, local40, local29, local44, 0);
				if (this.anInt2913 >= local29) {
					this.anInt2913 = local29;
					this.method2190();
					this.method3295();
				}
			}
		} else if (this.aBoolean117) {
			if (this.anInt2901 < 0) {
				local40 = this.method2216(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt2904]);
				if (this.anInt2913 >= local18) {
					return;
				}
				this.anInt2913 = local18 + local18 - this.anInt2913 - 1;
				this.anInt2901 = -this.anInt2901;
			}
			while (true) {
				local40 = this.method2194(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2902 - 1]);
				if (this.anInt2913 < local23) {
					return;
				}
				this.anInt2913 = local23 + local23 - this.anInt2913 - 1;
				this.anInt2901 = -this.anInt2901;
				local40 = this.method2216(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2904]);
				if (this.anInt2913 >= local18) {
					return;
				}
				this.anInt2913 = local18 + local18 - this.anInt2913 - 1;
				this.anInt2901 = -this.anInt2901;
			}
		} else if (this.anInt2901 < 0) {
			while (true) {
				local40 = this.method2216(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2902 - 1]);
				if (this.anInt2913 >= local18) {
					return;
				}
				this.anInt2913 = local23 - (local23 - 1 - this.anInt2913) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2194(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2904]);
				if (this.anInt2913 < local23) {
					return;
				}
				this.anInt2913 = local18 + (this.anInt2913 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	public synchronized void method2209(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2913 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)V")
	private synchronized void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2909 = arg0;
		this.anInt2905 = arg1;
		this.anInt2906 = 0;
		this.method2205();
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V")
	public synchronized void method2214(@OriginalArg(0) int arg0) {
		if (this.anInt2901 < 0) {
			this.anInt2901 = -arg0;
		} else {
			this.anInt2901 = arg0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "([IIIII)I")
	private int method2216(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2906 <= 0) {
				if (this.anInt2901 == -256 && (this.anInt2913 & 0xFF) == 0) {
					if (Static128.aBoolean131) {
						return Static216.method2193(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, arg3, arg2, this);
					}
					return Static216.method2211(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, arg3, arg2, this);
				}
				if (Static128.aBoolean131) {
					return Static216.method2206(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, arg3, arg2, this, this.anInt2901, arg4);
				}
				return Static216.method2198(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, arg3, arg2, this, this.anInt2901, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2906;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2906 += arg1;
			if (this.anInt2901 == -256 && (this.anInt2913 & 0xFF) == 0) {
				if (Static128.aBoolean131) {
					arg1 = Static216.method2208(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, this.anInt2907, this.anInt2910, local5, arg2, this);
				} else {
					arg1 = Static216.method2213(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, this.anInt2900, local5, arg2, this);
				}
			} else if (Static128.aBoolean131) {
				arg1 = Static216.method2201(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2911, this.anInt2912, this.anInt2907, this.anInt2910, local5, arg2, this, this.anInt2901, arg4);
			} else {
				arg1 = Static216.method2215(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray35, arg0, this.anInt2913, arg1, this.anInt2908, this.anInt2900, local5, arg2, this, this.anInt2901, arg4);
			}
			this.anInt2906 -= arg1;
			if (this.anInt2906 != 0) {
				return arg1;
			}
		} while (!this.method2223());
		return arg3;
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V")
	public synchronized void method2217(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2199();
			this.method3295();
		} else if (this.anInt2911 == 0 && this.anInt2912 == 0) {
			this.anInt2906 = 0;
			this.anInt2909 = 0;
			this.anInt2908 = 0;
			this.method3295();
		} else {
			@Pc(31) int local31 = -this.anInt2908;
			if (this.anInt2908 > local31) {
				local31 = this.anInt2908;
			}
			if (-this.anInt2911 > local31) {
				local31 = -this.anInt2911;
			}
			if (this.anInt2911 > local31) {
				local31 = this.anInt2911;
			}
			if (-this.anInt2912 > local31) {
				local31 = -this.anInt2912;
			}
			if (this.anInt2912 > local31) {
				local31 = this.anInt2912;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2906 = arg0;
			this.anInt2909 = Integer.MIN_VALUE;
			this.anInt2900 = -this.anInt2908 / arg0;
			this.anInt2907 = -this.anInt2911 / arg0;
			this.anInt2910 = -this.anInt2912 / arg0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "()I")
	public synchronized int method2219() {
		return this.anInt2901 < 0 ? -this.anInt2901 : this.anInt2901;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	public synchronized void method2220() {
		this.anInt2901 = (this.anInt2901 ^ this.anInt2901 >> 31) + (this.anInt2901 >>> 31);
		this.anInt2901 = -this.anInt2901;
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "()Z")
	private boolean method2223() {
		@Pc(2) int local2 = this.anInt2909;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static216.method2218(local2, this.anInt2905);
			local8 = Static216.method2200(local2, this.anInt2905);
		}
		if (this.anInt2908 != local2 || this.anInt2911 != local10 || this.anInt2912 != local8) {
			if (this.anInt2908 < local2) {
				this.anInt2900 = 1;
				this.anInt2906 = local2 - this.anInt2908;
			} else if (this.anInt2908 > local2) {
				this.anInt2900 = -1;
				this.anInt2906 = this.anInt2908 - local2;
			} else {
				this.anInt2900 = 0;
			}
			if (this.anInt2911 < local10) {
				this.anInt2907 = 1;
				if (this.anInt2906 == 0 || this.anInt2906 > local10 - this.anInt2911) {
					this.anInt2906 = local10 - this.anInt2911;
				}
			} else if (this.anInt2911 > local10) {
				this.anInt2907 = -1;
				if (this.anInt2906 == 0 || this.anInt2906 > this.anInt2911 - local10) {
					this.anInt2906 = this.anInt2911 - local10;
				}
			} else {
				this.anInt2907 = 0;
			}
			if (this.anInt2912 < local8) {
				this.anInt2910 = 1;
				if (this.anInt2906 == 0 || this.anInt2906 > local8 - this.anInt2912) {
					this.anInt2906 = local8 - this.anInt2912;
				}
			} else if (this.anInt2912 > local8) {
				this.anInt2910 = -1;
				if (this.anInt2906 == 0 || this.anInt2906 > this.anInt2912 - local8) {
					this.anInt2906 = this.anInt2912 - local8;
				}
			} else {
				this.anInt2910 = 0;
			}
			return false;
		} else if (this.anInt2909 == Integer.MIN_VALUE) {
			this.anInt2909 = 0;
			this.anInt2908 = this.anInt2911 = this.anInt2912 = 0;
			this.method3295();
			return true;
		} else {
			this.method2205();
			return false;
		}
	}
}
