import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
	private int anInt2065;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
	public int anInt2066;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
	public int anInt2069;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
	public int anInt2070;

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
	public int anInt2072;

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
	public int anInt2075;

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
	private int anInt2077;

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
	private int anInt2074;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
	private int anInt2067;

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "Z")
	private boolean aBoolean164;

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
	private int anInt2076;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
	private int anInt2073;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
	public int anInt2068;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!id;II)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) Class2_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub9_5 = arg0;
		this.anInt2074 = arg0.anInt2256;
		this.anInt2067 = arg0.anInt2255;
		this.aBoolean164 = arg0.aBoolean179;
		this.anInt2076 = arg1;
		this.anInt2073 = arg2;
		this.anInt2071 = 8192;
		this.anInt2068 = 0;
		this.method1809();
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!id;III)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) Class2_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass2_Sub9_5 = arg0;
		this.anInt2074 = arg0.anInt2256;
		this.anInt2067 = arg0.anInt2255;
		this.aBoolean164 = arg0.aBoolean179;
		this.anInt2076 = arg1;
		this.anInt2073 = arg2;
		this.anInt2071 = arg3;
		this.anInt2068 = 0;
		this.method1809();
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "()Lclient!md;")
	@Override
	public Class2_Sub5 method3551() {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII)I")
	private int method1783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt2077 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt2077;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt2077 += arg1;
				if (this.anInt2076 == -256 && (this.anInt2068 & 0xFF) == 0) {
					if (Static82.aBoolean465) {
						arg1 = Static306.method1803(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, this.anInt2072, this.anInt2070, local7, arg2, this);
					} else {
						arg1 = Static306.method1785(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, this.anInt2075, local7, arg2, this);
					}
				} else if (Static82.aBoolean465) {
					arg1 = Static306.method1799(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, this.anInt2072, this.anInt2070, local7, arg2, this, this.anInt2076, arg4);
				} else {
					arg1 = Static306.method1782(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, this.anInt2075, local7, arg2, this, this.anInt2076, arg4);
				}
				this.anInt2077 -= arg1;
				if (this.anInt2077 != 0) {
					return arg1;
				}
				if (!this.method1788()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt2076 == -256 && (this.anInt2068 & 0xFF) == 0) {
				if (Static82.aBoolean465) {
					return Static306.method1780(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, arg3, arg2, this);
				}
				return Static306.method1792(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, arg3, arg2, this);
			}
			if (Static82.aBoolean465) {
				return Static306.method1779(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, arg3, arg2, this, this.anInt2076, arg4);
			}
			return Static306.method1790(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, arg3, arg2, this, this.anInt2076, arg4);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public synchronized void method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1802(arg0, arg1, this.method1798());
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "()I")
	@Override
	public int method3545() {
		@Pc(6) int local6 = this.anInt2069 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2065 == 0) {
			local6 -= local6 * this.anInt2068 / (((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22.length << 8);
		} else if (this.anInt2065 >= 0) {
			local6 -= local6 * this.anInt2074 / ((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
	public synchronized void method1787(@OriginalArg(0) int arg0) {
		this.method1800(arg0 << 6, this.method1798());
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "()Z")
	private boolean method1788() {
		@Pc(2) int local2 = this.anInt2073;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static306.method1811(local2, this.anInt2071);
			local8 = Static306.method1805(local2, this.anInt2071);
		}
		if (this.anInt2069 != local2 || this.anInt2078 != local10 || this.anInt2066 != local8) {
			if (this.anInt2069 < local2) {
				this.anInt2075 = 1;
				this.anInt2077 = local2 - this.anInt2069;
			} else if (this.anInt2069 > local2) {
				this.anInt2075 = -1;
				this.anInt2077 = this.anInt2069 - local2;
			} else {
				this.anInt2075 = 0;
			}
			if (this.anInt2078 < local10) {
				this.anInt2072 = 1;
				if (this.anInt2077 == 0 || this.anInt2077 > local10 - this.anInt2078) {
					this.anInt2077 = local10 - this.anInt2078;
				}
			} else if (this.anInt2078 > local10) {
				this.anInt2072 = -1;
				if (this.anInt2077 == 0 || this.anInt2077 > this.anInt2078 - local10) {
					this.anInt2077 = this.anInt2078 - local10;
				}
			} else {
				this.anInt2072 = 0;
			}
			if (this.anInt2066 < local8) {
				this.anInt2070 = 1;
				if (this.anInt2077 == 0 || this.anInt2077 > local8 - this.anInt2066) {
					this.anInt2077 = local8 - this.anInt2066;
				}
			} else if (this.anInt2066 > local8) {
				this.anInt2070 = -1;
				if (this.anInt2077 == 0 || this.anInt2077 > this.anInt2066 - local8) {
					this.anInt2077 = this.anInt2066 - local8;
				}
			} else {
				this.anInt2070 = 0;
			}
			return false;
		} else if (this.anInt2073 == Integer.MIN_VALUE) {
			this.anInt2073 = 0;
			this.anInt2069 = this.anInt2078 = this.anInt2066 = 0;
			this.method4926();
			return true;
		} else {
			this.method1809();
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public synchronized void method1789(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2068 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
	public synchronized void method1794(@OriginalArg(0) int arg0) {
		this.anInt2065 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
	private synchronized void method1797() {
		this.method1800(0, this.method1798());
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "()I")
	public synchronized int method1798() {
		return this.anInt2071 < 0 ? -1 : this.anInt2071;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "()Lclient!md;")
	@Override
	public Class2_Sub5 method3548() {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
	private synchronized void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2073 = arg0;
		this.anInt2071 = arg1;
		this.anInt2077 = 0;
		this.method1809();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public synchronized void method1801() {
		this.anInt2076 = (this.anInt2076 ^ this.anInt2076 >> 31) + (this.anInt2076 >>> 31);
		this.anInt2076 = -this.anInt2076;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
	public synchronized void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1800(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static306.method1811(arg1, arg2);
		@Pc(14) int local14 = Static306.method1805(arg1, arg2);
		if (this.anInt2078 == local10 && this.anInt2066 == local14) {
			this.anInt2077 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2069;
		if (this.anInt2069 - arg1 > local31) {
			local31 = this.anInt2069 - arg1;
		}
		if (local10 - this.anInt2078 > local31) {
			local31 = local10 - this.anInt2078;
		}
		if (this.anInt2078 - local10 > local31) {
			local31 = this.anInt2078 - local10;
		}
		if (local14 - this.anInt2066 > local31) {
			local31 = local14 - this.anInt2066;
		}
		if (this.anInt2066 - local14 > local31) {
			local31 = this.anInt2066 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2077 = arg0;
		this.anInt2073 = arg1;
		this.anInt2071 = arg2;
		this.anInt2075 = (arg1 - this.anInt2069) / arg0;
		this.anInt2072 = (local10 - this.anInt2078) / arg0;
		this.anInt2070 = (local14 - this.anInt2066) / arg0;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2073 == 0 && this.anInt2077 == 0) {
			this.method3546(arg2);
			return;
		}
		@Pc(13) Class2_Sub9_Sub1 local13 = (Class2_Sub9_Sub1) this.aClass2_Sub9_5;
		@Pc(18) int local18 = this.anInt2074 << 8;
		@Pc(23) int local23 = this.anInt2067 << 8;
		@Pc(29) int local29 = local13.aByteArray22.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2065 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2068 < 0) {
			if (this.anInt2076 <= 0) {
				this.method1813();
				this.method4926();
				return;
			}
			this.anInt2068 = 0;
		}
		if (this.anInt2068 >= local29) {
			if (this.anInt2076 >= 0) {
				this.method1813();
				this.method4926();
				return;
			}
			this.anInt2068 = local29 - 1;
		}
		if (this.anInt2065 >= 0) {
			if (this.anInt2065 > 0) {
				if (this.aBoolean164) {
					label131: {
						if (this.anInt2076 < 0) {
							local40 = this.method1783(arg0, arg1, local18, local44, local13.aByteArray22[this.anInt2074]);
							if (this.anInt2068 >= local18) {
								return;
							}
							this.anInt2068 = local18 + local18 - this.anInt2068 - 1;
							this.anInt2076 = -this.anInt2076;
							if (--this.anInt2065 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method1814(arg0, local40, local23, local44, local13.aByteArray22[this.anInt2067 - 1]);
							if (this.anInt2068 < local23) {
								return;
							}
							this.anInt2068 = local23 + local23 - this.anInt2068 - 1;
							this.anInt2076 = -this.anInt2076;
							if (--this.anInt2065 == 0) {
								break;
							}
							local40 = this.method1783(arg0, local40, local18, local44, local13.aByteArray22[this.anInt2074]);
							if (this.anInt2068 >= local18) {
								return;
							}
							this.anInt2068 = local18 + local18 - this.anInt2068 - 1;
							this.anInt2076 = -this.anInt2076;
						} while (--this.anInt2065 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt2076 < 0) {
						while (true) {
							local40 = this.method1783(arg0, local40, local18, local44, local13.aByteArray22[this.anInt2067 - 1]);
							if (this.anInt2068 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt2068 - 1) / local33;
							if (local417 >= this.anInt2065) {
								this.anInt2068 += local33 * this.anInt2065;
								this.anInt2065 = 0;
								break;
							}
							this.anInt2068 += local33 * local417;
							this.anInt2065 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method1814(arg0, local40, local23, local44, local13.aByteArray22[this.anInt2074]);
							if (this.anInt2068 < local23) {
								return;
							}
							local417 = (this.anInt2068 - local18) / local33;
							if (local417 >= this.anInt2065) {
								this.anInt2068 -= local33 * this.anInt2065;
								this.anInt2065 = 0;
								break;
							}
							this.anInt2068 -= local33 * local417;
							this.anInt2065 -= local417;
						}
					}
				}
			}
			if (this.anInt2076 < 0) {
				this.method1783(arg0, local40, 0, local44, 0);
				if (this.anInt2068 < 0) {
					this.anInt2068 = -1;
					this.method1813();
					this.method4926();
				}
			} else {
				this.method1814(arg0, local40, local29, local44, 0);
				if (this.anInt2068 >= local29) {
					this.anInt2068 = local29;
					this.method1813();
					this.method4926();
				}
			}
		} else if (this.aBoolean164) {
			if (this.anInt2076 < 0) {
				local40 = this.method1783(arg0, arg1, local18, local44, local13.aByteArray22[this.anInt2074]);
				if (this.anInt2068 >= local18) {
					return;
				}
				this.anInt2068 = local18 + local18 - this.anInt2068 - 1;
				this.anInt2076 = -this.anInt2076;
			}
			while (true) {
				local40 = this.method1814(arg0, local40, local23, local44, local13.aByteArray22[this.anInt2067 - 1]);
				if (this.anInt2068 < local23) {
					return;
				}
				this.anInt2068 = local23 + local23 - this.anInt2068 - 1;
				this.anInt2076 = -this.anInt2076;
				local40 = this.method1783(arg0, local40, local18, local44, local13.aByteArray22[this.anInt2074]);
				if (this.anInt2068 >= local18) {
					return;
				}
				this.anInt2068 = local18 + local18 - this.anInt2068 - 1;
				this.anInt2076 = -this.anInt2076;
			}
		} else if (this.anInt2076 < 0) {
			while (true) {
				local40 = this.method1783(arg0, local40, local18, local44, local13.aByteArray22[this.anInt2067 - 1]);
				if (this.anInt2068 >= local18) {
					return;
				}
				this.anInt2068 = local23 - (local23 - 1 - this.anInt2068) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1814(arg0, local40, local23, local44, local13.aByteArray22[this.anInt2074]);
				if (this.anInt2068 < local23) {
					return;
				}
				this.anInt2068 = local18 + (this.anInt2068 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "()I")
	public synchronized int method1804() {
		return this.anInt2076 < 0 ? -this.anInt2076 : this.anInt2076;
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
	public synchronized void method1806(@OriginalArg(0) int arg0) {
		if (this.anInt2076 < 0) {
			this.anInt2076 = -arg0;
		} else {
			this.anInt2076 = arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3546(@OriginalArg(0) int arg0) {
		if (this.anInt2077 > 0) {
			if (arg0 >= this.anInt2077) {
				if (this.anInt2073 == Integer.MIN_VALUE) {
					this.anInt2073 = 0;
					this.anInt2069 = this.anInt2078 = this.anInt2066 = 0;
					this.method4926();
					arg0 = this.anInt2077;
				}
				this.anInt2077 = 0;
				this.method1809();
			} else {
				this.anInt2069 += this.anInt2075 * arg0;
				this.anInt2078 += this.anInt2072 * arg0;
				this.anInt2066 += this.anInt2070 * arg0;
				this.anInt2077 -= arg0;
			}
		}
		@Pc(71) Class2_Sub9_Sub1 local71 = (Class2_Sub9_Sub1) this.aClass2_Sub9_5;
		@Pc(76) int local76 = this.anInt2074 << 8;
		@Pc(81) int local81 = this.anInt2067 << 8;
		@Pc(87) int local87 = local71.aByteArray22.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2065 = 0;
		}
		if (this.anInt2068 < 0) {
			if (this.anInt2076 <= 0) {
				this.method1813();
				this.method4926();
				return;
			}
			this.anInt2068 = 0;
		}
		if (this.anInt2068 >= local87) {
			if (this.anInt2076 >= 0) {
				this.method1813();
				this.method4926();
				return;
			}
			this.anInt2068 = local87 - 1;
		}
		this.anInt2068 += this.anInt2076 * arg0;
		if (this.anInt2065 >= 0) {
			if (this.anInt2065 > 0) {
				if (this.aBoolean164) {
					label121: {
						if (this.anInt2076 < 0) {
							if (this.anInt2068 >= local76) {
								return;
							}
							this.anInt2068 = local76 + local76 - this.anInt2068 - 1;
							this.anInt2076 = -this.anInt2076;
							if (--this.anInt2065 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt2068 < local81) {
								return;
							}
							this.anInt2068 = local81 + local81 - this.anInt2068 - 1;
							this.anInt2076 = -this.anInt2076;
							if (--this.anInt2065 == 0) {
								break;
							}
							if (this.anInt2068 >= local76) {
								return;
							}
							this.anInt2068 = local76 + local76 - this.anInt2068 - 1;
							this.anInt2076 = -this.anInt2076;
						} while (--this.anInt2065 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt2076 < 0) {
							if (this.anInt2068 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt2068 - 1) / local91;
							if (local362 >= this.anInt2065) {
								this.anInt2068 += local91 * this.anInt2065;
								this.anInt2065 = 0;
								break label153;
							}
							this.anInt2068 += local91 * local362;
							this.anInt2065 -= local362;
						} else if (this.anInt2068 >= local81) {
							local362 = (this.anInt2068 - local76) / local91;
							if (local362 >= this.anInt2065) {
								this.anInt2068 -= local91 * this.anInt2065;
								this.anInt2065 = 0;
								break label153;
							}
							this.anInt2068 -= local91 * local362;
							this.anInt2065 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt2076 < 0) {
				if (this.anInt2068 < 0) {
					this.anInt2068 = -1;
					this.method1813();
					this.method4926();
				}
			} else if (this.anInt2068 >= local87) {
				this.anInt2068 = local87;
				this.method1813();
				this.method4926();
			}
		} else if (this.aBoolean164) {
			if (this.anInt2076 < 0) {
				if (this.anInt2068 >= local76) {
					return;
				}
				this.anInt2068 = local76 + local76 - this.anInt2068 - 1;
				this.anInt2076 = -this.anInt2076;
			}
			while (this.anInt2068 >= local81) {
				this.anInt2068 = local81 + local81 - this.anInt2068 - 1;
				this.anInt2076 = -this.anInt2076;
				if (this.anInt2068 >= local76) {
					return;
				}
				this.anInt2068 = local76 + local76 - this.anInt2068 - 1;
				this.anInt2076 = -this.anInt2076;
			}
		} else if (this.anInt2076 < 0) {
			if (this.anInt2068 >= local76) {
				return;
			}
			this.anInt2068 = local81 - (local81 - 1 - this.anInt2068) % local91 - 1;
		} else if (this.anInt2068 >= local81) {
			this.anInt2068 = local76 + (this.anInt2068 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "()I")
	@Override
	public int method3549() {
		return this.anInt2073 == 0 && this.anInt2077 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)V")
	public synchronized void method1808(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1797();
			this.method4926();
		} else if (this.anInt2078 == 0 && this.anInt2066 == 0) {
			this.anInt2077 = 0;
			this.anInt2073 = 0;
			this.anInt2069 = 0;
			this.method4926();
		} else {
			@Pc(31) int local31 = -this.anInt2069;
			if (this.anInt2069 > local31) {
				local31 = this.anInt2069;
			}
			if (-this.anInt2078 > local31) {
				local31 = -this.anInt2078;
			}
			if (this.anInt2078 > local31) {
				local31 = this.anInt2078;
			}
			if (-this.anInt2066 > local31) {
				local31 = -this.anInt2066;
			}
			if (this.anInt2066 > local31) {
				local31 = this.anInt2066;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2077 = arg0;
			this.anInt2073 = Integer.MIN_VALUE;
			this.anInt2075 = -this.anInt2069 / arg0;
			this.anInt2072 = -this.anInt2078 / arg0;
			this.anInt2070 = -this.anInt2066 / arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
	private void method1809() {
		this.anInt2069 = this.anInt2073;
		this.anInt2078 = Static306.method1811(this.anInt2073, this.anInt2071);
		this.anInt2066 = Static306.method1805(this.anInt2073, this.anInt2071);
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "()Z")
	public boolean method1810() {
		return this.anInt2077 != 0;
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "()V")
	private void method1813() {
		if (this.anInt2077 == 0) {
			return;
		}
		if (this.anInt2073 == Integer.MIN_VALUE) {
			this.anInt2073 = 0;
		}
		this.anInt2077 = 0;
		this.method1809();
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "([IIIII)I")
	private int method1814(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt2077 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt2077;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt2077 += arg1;
				if (this.anInt2076 == 256 && (this.anInt2068 & 0xFF) == 0) {
					if (Static82.aBoolean465) {
						arg1 = Static306.method1793(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, this.anInt2072, this.anInt2070, local7, arg2, this);
					} else {
						arg1 = Static306.method1812(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, this.anInt2075, local7, arg2, this);
					}
				} else if (Static82.aBoolean465) {
					arg1 = Static306.method1807(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, this.anInt2072, this.anInt2070, local7, arg2, this, this.anInt2076, arg4);
				} else {
					arg1 = Static306.method1817(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, this.anInt2075, local7, arg2, this, this.anInt2076, arg4);
				}
				this.anInt2077 -= arg1;
				if (this.anInt2077 != 0) {
					return arg1;
				}
				if (!this.method1788()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt2076 == 256 && (this.anInt2068 & 0xFF) == 0) {
				if (Static82.aBoolean465) {
					return Static306.method1786(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, arg3, arg2, this);
				}
				return Static306.method1796(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, arg3, arg2, this);
			}
			if (Static82.aBoolean465) {
				return Static306.method1791(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2078, this.anInt2066, arg3, arg2, this, this.anInt2076, arg4);
			}
			return Static306.method1781(((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22, arg0, this.anInt2068, arg1, this.anInt2069, arg3, arg2, this, this.anInt2076, arg4);
		}
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "()Z")
	public boolean method1816() {
		return this.anInt2068 < 0 || this.anInt2068 >= ((Class2_Sub9_Sub1) this.aClass2_Sub9_5).aByteArray22.length << 8;
	}

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "()I")
	public synchronized int method1818() {
		return this.anInt2073 == Integer.MIN_VALUE ? 0 : this.anInt2073;
	}
}
