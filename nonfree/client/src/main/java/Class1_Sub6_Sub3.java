import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
	public int anInt2320;

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
	private int anInt2322;

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	private int anInt2324;

	@OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
	private int anInt2328;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
	public int anInt2318;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!ee;II)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub7_5 = arg0;
		this.anInt2330 = arg0.anInt1312;
		this.anInt2329 = arg0.anInt1314;
		this.aBoolean208 = arg0.aBoolean113;
		this.anInt2327 = arg1;
		this.anInt2326 = arg2;
		this.anInt2328 = 8192;
		this.anInt2318 = 0;
		this.method1844();
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!ee;III)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub7_5 = arg0;
		this.anInt2330 = arg0.anInt1312;
		this.anInt2329 = arg0.anInt1314;
		this.aBoolean208 = arg0.aBoolean113;
		this.anInt2327 = arg1;
		this.anInt2326 = arg2;
		this.anInt2328 = arg3;
		this.anInt2318 = 0;
		this.method1844();
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2187(@OriginalArg(0) int arg0) {
		if (this.anInt2322 > 0) {
			if (arg0 >= this.anInt2322) {
				if (this.anInt2326 == Integer.MIN_VALUE) {
					this.anInt2326 = 0;
					this.anInt2323 = this.anInt2320 = this.anInt2325 = 0;
					this.method3735();
					arg0 = this.anInt2322;
				}
				this.anInt2322 = 0;
				this.method1844();
			} else {
				this.anInt2323 += this.anInt2319 * arg0;
				this.anInt2320 += this.anInt2331 * arg0;
				this.anInt2325 += this.anInt2321 * arg0;
				this.anInt2322 -= arg0;
			}
		}
		@Pc(71) Class1_Sub7_Sub1 local71 = (Class1_Sub7_Sub1) super.aClass1_Sub7_5;
		@Pc(76) int local76 = this.anInt2330 << 8;
		@Pc(81) int local81 = this.anInt2329 << 8;
		@Pc(87) int local87 = local71.aByteArray24.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2324 = 0;
		}
		if (this.anInt2318 < 0) {
			if (this.anInt2327 <= 0) {
				this.method1847();
				this.method3735();
				return;
			}
			this.anInt2318 = 0;
		}
		if (this.anInt2318 >= local87) {
			if (this.anInt2327 >= 0) {
				this.method1847();
				this.method3735();
				return;
			}
			this.anInt2318 = local87 - 1;
		}
		this.anInt2318 += this.anInt2327 * arg0;
		if (this.anInt2324 >= 0) {
			if (this.anInt2324 > 0) {
				if (this.aBoolean208) {
					label125: {
						if (this.anInt2327 < 0) {
							if (this.anInt2318 >= local76) {
								return;
							}
							this.anInt2318 = local76 + local76 - this.anInt2318 - 1;
							this.anInt2327 = -this.anInt2327;
							if (--this.anInt2324 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2318 < local81) {
								return;
							}
							this.anInt2318 = local81 + local81 - this.anInt2318 - 1;
							this.anInt2327 = -this.anInt2327;
							if (--this.anInt2324 == 0) {
								break;
							}
							if (this.anInt2318 >= local76) {
								return;
							}
							this.anInt2318 = local76 + local76 - this.anInt2318 - 1;
							this.anInt2327 = -this.anInt2327;
						} while (--this.anInt2324 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2327 < 0) {
						if (this.anInt2318 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2318 - 1) / local91;
						if (local361 < this.anInt2324) {
							this.anInt2318 += local91 * local361;
							this.anInt2324 -= local361;
							return;
						}
						this.anInt2318 += local91 * this.anInt2324;
						this.anInt2324 = 0;
					} else if (this.anInt2318 >= local81) {
						local361 = (this.anInt2318 - local76) / local91;
						if (local361 < this.anInt2324) {
							this.anInt2318 -= local91 * local361;
							this.anInt2324 -= local361;
							return;
						}
						this.anInt2318 -= local91 * this.anInt2324;
						this.anInt2324 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2327 < 0) {
				if (this.anInt2318 < 0) {
					this.anInt2318 = -1;
					this.method1847();
					this.method3735();
					return;
				}
			} else if (this.anInt2318 >= local87) {
				this.anInt2318 = local87;
				this.method1847();
				this.method3735();
			}
		} else if (this.aBoolean208) {
			if (this.anInt2327 < 0) {
				if (this.anInt2318 >= local76) {
					return;
				}
				this.anInt2318 = local76 + local76 - this.anInt2318 - 1;
				this.anInt2327 = -this.anInt2327;
			}
			while (this.anInt2318 >= local81) {
				this.anInt2318 = local81 + local81 - this.anInt2318 - 1;
				this.anInt2327 = -this.anInt2327;
				if (this.anInt2318 >= local76) {
					return;
				}
				this.anInt2318 = local76 + local76 - this.anInt2318 - 1;
				this.anInt2327 = -this.anInt2327;
			}
		} else if (this.anInt2327 < 0) {
			if (this.anInt2318 < local76) {
				this.anInt2318 = local81 - (local81 - 1 - this.anInt2318) % local91 - 1;
			}
		} else if (this.anInt2318 >= local81) {
			this.anInt2318 = local76 + (this.anInt2318 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
	public synchronized void method1812(@OriginalArg(0) int arg0) {
		if (this.anInt2327 < 0) {
			this.anInt2327 = -arg0;
		} else {
			this.anInt2327 = arg0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "()Lclient!pf;")
	@Override
	public Class1_Sub6 method2185() {
		return null;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "()Z")
	public boolean method1813() {
		return this.anInt2318 < 0 || this.anInt2318 >= ((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24.length << 8;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V")
	public synchronized void method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1840(arg0, arg1, this.method1823());
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
	public synchronized void method1818() {
		this.anInt2327 = (this.anInt2327 ^ this.anInt2327 >> 31) + (this.anInt2327 >>> 31);
		this.anInt2327 = -this.anInt2327;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "()Z")
	public boolean method1819() {
		return this.anInt2322 != 0;
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "()Z")
	private boolean method1821() {
		@Pc(2) int local2 = this.anInt2326;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static238.method1814(local2, this.anInt2328);
			local8 = Static238.method1825(local2, this.anInt2328);
		}
		if (this.anInt2323 != local2 || this.anInt2320 != local10 || this.anInt2325 != local8) {
			if (this.anInt2323 < local2) {
				this.anInt2319 = 1;
				this.anInt2322 = local2 - this.anInt2323;
			} else if (this.anInt2323 > local2) {
				this.anInt2319 = -1;
				this.anInt2322 = this.anInt2323 - local2;
			} else {
				this.anInt2319 = 0;
			}
			if (this.anInt2320 < local10) {
				this.anInt2331 = 1;
				if (this.anInt2322 == 0 || this.anInt2322 > local10 - this.anInt2320) {
					this.anInt2322 = local10 - this.anInt2320;
				}
			} else if (this.anInt2320 > local10) {
				this.anInt2331 = -1;
				if (this.anInt2322 == 0 || this.anInt2322 > this.anInt2320 - local10) {
					this.anInt2322 = this.anInt2320 - local10;
				}
			} else {
				this.anInt2331 = 0;
			}
			if (this.anInt2325 < local8) {
				this.anInt2321 = 1;
				if (this.anInt2322 == 0 || this.anInt2322 > local8 - this.anInt2325) {
					this.anInt2322 = local8 - this.anInt2325;
				}
			} else if (this.anInt2325 > local8) {
				this.anInt2321 = -1;
				if (this.anInt2322 == 0 || this.anInt2322 > this.anInt2325 - local8) {
					this.anInt2322 = this.anInt2325 - local8;
				}
			} else {
				this.anInt2321 = 0;
			}
			return false;
		} else if (this.anInt2326 == Integer.MIN_VALUE) {
			this.anInt2326 = 0;
			this.anInt2323 = this.anInt2320 = this.anInt2325 = 0;
			this.method3735();
			return true;
		} else {
			this.method1844();
			return false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
	private synchronized void method1822() {
		this.method1846(0, this.method1823());
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()Lclient!pf;")
	@Override
	public Class1_Sub6 method2182() {
		return null;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "()I")
	public synchronized int method1823() {
		return this.anInt2328 < 0 ? -1 : this.anInt2328;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2326 == 0 && this.anInt2322 == 0) {
			this.method2187(arg2);
			return;
		}
		@Pc(13) Class1_Sub7_Sub1 local13 = (Class1_Sub7_Sub1) super.aClass1_Sub7_5;
		@Pc(18) int local18 = this.anInt2330 << 8;
		@Pc(23) int local23 = this.anInt2329 << 8;
		@Pc(29) int local29 = local13.aByteArray24.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2324 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2318 < 0) {
			if (this.anInt2327 <= 0) {
				this.method1847();
				this.method3735();
				return;
			}
			this.anInt2318 = 0;
		}
		if (this.anInt2318 >= local29) {
			if (this.anInt2327 >= 0) {
				this.method1847();
				this.method3735();
				return;
			}
			this.anInt2318 = local29 - 1;
		}
		if (this.anInt2324 >= 0) {
			if (this.anInt2324 > 0) {
				if (this.aBoolean208) {
					label130: {
						if (this.anInt2327 < 0) {
							local40 = this.method1849(arg0, arg1, local18, local44, local13.aByteArray24[this.anInt2330]);
							if (this.anInt2318 >= local18) {
								return;
							}
							this.anInt2318 = local18 + local18 - this.anInt2318 - 1;
							this.anInt2327 = -this.anInt2327;
							if (--this.anInt2324 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1850(arg0, local40, local23, local44, local13.aByteArray24[this.anInt2329 - 1]);
							if (this.anInt2318 < local23) {
								return;
							}
							this.anInt2318 = local23 + local23 - this.anInt2318 - 1;
							this.anInt2327 = -this.anInt2327;
							if (--this.anInt2324 == 0) {
								break;
							}
							local40 = this.method1849(arg0, local40, local18, local44, local13.aByteArray24[this.anInt2330]);
							if (this.anInt2318 >= local18) {
								return;
							}
							this.anInt2318 = local18 + local18 - this.anInt2318 - 1;
							this.anInt2327 = -this.anInt2327;
						} while (--this.anInt2324 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2327 < 0) {
						while (true) {
							local40 = this.method1849(arg0, local40, local18, local44, local13.aByteArray24[this.anInt2329 - 1]);
							if (this.anInt2318 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2318 - 1) / local33;
							if (local416 >= this.anInt2324) {
								this.anInt2318 += local33 * this.anInt2324;
								this.anInt2324 = 0;
								break;
							}
							this.anInt2318 += local33 * local416;
							this.anInt2324 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1850(arg0, local40, local23, local44, local13.aByteArray24[this.anInt2330]);
							if (this.anInt2318 < local23) {
								return;
							}
							local416 = (this.anInt2318 - local18) / local33;
							if (local416 >= this.anInt2324) {
								this.anInt2318 -= local33 * this.anInt2324;
								this.anInt2324 = 0;
								break;
							}
							this.anInt2318 -= local33 * local416;
							this.anInt2324 -= local416;
						}
					}
				}
			}
			if (this.anInt2327 < 0) {
				this.method1849(arg0, local40, 0, local44, 0);
				if (this.anInt2318 < 0) {
					this.anInt2318 = -1;
					this.method1847();
					this.method3735();
					return;
				}
			} else {
				this.method1850(arg0, local40, local29, local44, 0);
				if (this.anInt2318 >= local29) {
					this.anInt2318 = local29;
					this.method1847();
					this.method3735();
				}
			}
		} else if (this.aBoolean208) {
			if (this.anInt2327 < 0) {
				local40 = this.method1849(arg0, arg1, local18, local44, local13.aByteArray24[this.anInt2330]);
				if (this.anInt2318 >= local18) {
					return;
				}
				this.anInt2318 = local18 + local18 - this.anInt2318 - 1;
				this.anInt2327 = -this.anInt2327;
			}
			while (true) {
				local40 = this.method1850(arg0, local40, local23, local44, local13.aByteArray24[this.anInt2329 - 1]);
				if (this.anInt2318 < local23) {
					return;
				}
				this.anInt2318 = local23 + local23 - this.anInt2318 - 1;
				this.anInt2327 = -this.anInt2327;
				local40 = this.method1849(arg0, local40, local18, local44, local13.aByteArray24[this.anInt2330]);
				if (this.anInt2318 >= local18) {
					return;
				}
				this.anInt2318 = local18 + local18 - this.anInt2318 - 1;
				this.anInt2327 = -this.anInt2327;
			}
		} else if (this.anInt2327 < 0) {
			while (true) {
				local40 = this.method1849(arg0, local40, local18, local44, local13.aByteArray24[this.anInt2329 - 1]);
				if (this.anInt2318 >= local18) {
					return;
				}
				this.anInt2318 = local23 - (local23 - 1 - this.anInt2318) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1850(arg0, local40, local23, local44, local13.aByteArray24[this.anInt2330]);
				if (this.anInt2318 < local23) {
					return;
				}
				this.anInt2318 = local18 + (this.anInt2318 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	public synchronized void method1826(@OriginalArg(0) int arg0) {
		this.method1846(arg0 << 6, this.method1823());
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "()I")
	public synchronized int method1833() {
		return this.anInt2326 == Integer.MIN_VALUE ? 0 : this.anInt2326;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
	@Override
	public int method2181() {
		@Pc(6) int local6 = this.anInt2323 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2324 == 0) {
			local6 -= local6 * this.anInt2318 / (((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24.length << 8);
		} else if (this.anInt2324 >= 0) {
			local6 -= local6 * this.anInt2330 / ((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
	public synchronized void method1837(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "()I")
	public synchronized int method1838() {
		return this.anInt2327 < 0 ? -this.anInt2327 : this.anInt2327;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
	public synchronized void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1846(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static238.method1814(arg1, arg2);
		@Pc(14) int local14 = Static238.method1825(arg1, arg2);
		if (this.anInt2320 == local10 && this.anInt2325 == local14) {
			this.anInt2322 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2323;
		if (this.anInt2323 - arg1 > local31) {
			local31 = this.anInt2323 - arg1;
		}
		if (local10 - this.anInt2320 > local31) {
			local31 = local10 - this.anInt2320;
		}
		if (this.anInt2320 - local10 > local31) {
			local31 = this.anInt2320 - local10;
		}
		if (local14 - this.anInt2325 > local31) {
			local31 = local14 - this.anInt2325;
		}
		if (this.anInt2325 - local14 > local31) {
			local31 = this.anInt2325 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2322 = arg0;
		this.anInt2326 = arg1;
		this.anInt2328 = arg2;
		this.anInt2319 = (arg1 - this.anInt2323) / arg0;
		this.anInt2331 = (local10 - this.anInt2320) / arg0;
		this.anInt2321 = (local14 - this.anInt2325) / arg0;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V")
	public synchronized void method1842(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2318 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "()V")
	private void method1844() {
		this.anInt2323 = this.anInt2326;
		this.anInt2320 = Static238.method1814(this.anInt2326, this.anInt2328);
		this.anInt2325 = Static238.method1825(this.anInt2326, this.anInt2328);
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(I)V")
	public synchronized void method1845(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1822();
			this.method3735();
		} else if (this.anInt2320 == 0 && this.anInt2325 == 0) {
			this.anInt2322 = 0;
			this.anInt2326 = 0;
			this.anInt2323 = 0;
			this.method3735();
		} else {
			@Pc(31) int local31 = -this.anInt2323;
			if (this.anInt2323 > local31) {
				local31 = this.anInt2323;
			}
			if (-this.anInt2320 > local31) {
				local31 = -this.anInt2320;
			}
			if (this.anInt2320 > local31) {
				local31 = this.anInt2320;
			}
			if (-this.anInt2325 > local31) {
				local31 = -this.anInt2325;
			}
			if (this.anInt2325 > local31) {
				local31 = this.anInt2325;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2322 = arg0;
			this.anInt2326 = Integer.MIN_VALUE;
			this.anInt2319 = -this.anInt2323 / arg0;
			this.anInt2331 = -this.anInt2320 / arg0;
			this.anInt2321 = -this.anInt2325 / arg0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
	private synchronized void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2326 = arg0;
		this.anInt2328 = arg1;
		this.anInt2322 = 0;
		this.method1844();
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "()V")
	private void method1847() {
		if (this.anInt2322 == 0) {
			return;
		}
		if (this.anInt2326 == Integer.MIN_VALUE) {
			this.anInt2326 = 0;
		}
		this.anInt2322 = 0;
		this.method1844();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIIII)I")
	private int method1849(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2322 <= 0) {
				if (this.anInt2327 == -256 && (this.anInt2318 & 0xFF) == 0) {
					if (Static97.aBoolean189) {
						return Static238.method1824(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, arg3, arg2, this);
					}
					return Static238.method1839(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, arg3, arg2, this);
				}
				if (Static97.aBoolean189) {
					return Static238.method1835(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, arg3, arg2, this, this.anInt2327, arg4);
				}
				return Static238.method1848(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, arg3, arg2, this, this.anInt2327, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2322;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2322 += arg1;
			if (this.anInt2327 == -256 && (this.anInt2318 & 0xFF) == 0) {
				if (Static97.aBoolean189) {
					arg1 = Static238.method1836(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, this.anInt2331, this.anInt2321, local5, arg2, this);
				} else {
					arg1 = Static238.method1834(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, this.anInt2319, local5, arg2, this);
				}
			} else if (Static97.aBoolean189) {
				arg1 = Static238.method1830(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, this.anInt2331, this.anInt2321, local5, arg2, this, this.anInt2327, arg4);
			} else {
				arg1 = Static238.method1851(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, this.anInt2319, local5, arg2, this, this.anInt2327, arg4);
			}
			this.anInt2322 -= arg1;
			if (this.anInt2322 != 0) {
				return arg1;
			}
		} while (!this.method1821());
		return arg3;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "([IIIII)I")
	private int method1850(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2322 <= 0) {
				if (this.anInt2327 == 256 && (this.anInt2318 & 0xFF) == 0) {
					if (Static97.aBoolean189) {
						return Static238.method1832(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, arg3, arg2, this);
					}
					return Static238.method1829(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, arg3, arg2, this);
				}
				if (Static97.aBoolean189) {
					return Static238.method1828(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, arg3, arg2, this, this.anInt2327, arg4);
				}
				return Static238.method1827(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, arg3, arg2, this, this.anInt2327, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2322;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2322 += arg1;
			if (this.anInt2327 == 256 && (this.anInt2318 & 0xFF) == 0) {
				if (Static97.aBoolean189) {
					arg1 = Static238.method1843(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, this.anInt2331, this.anInt2321, local5, arg2, this);
				} else {
					arg1 = Static238.method1820(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, this.anInt2319, local5, arg2, this);
				}
			} else if (Static97.aBoolean189) {
				arg1 = Static238.method1841(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2320, this.anInt2325, this.anInt2331, this.anInt2321, local5, arg2, this, this.anInt2327, arg4);
			} else {
				arg1 = Static238.method1817(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray24, arg0, this.anInt2318, arg1, this.anInt2323, this.anInt2319, local5, arg2, this, this.anInt2327, arg4);
			}
			this.anInt2322 -= arg1;
			if (this.anInt2322 != 0) {
				return arg1;
			}
		} while (!this.method1821());
		return arg3;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
	@Override
	public int method2184() {
		return this.anInt2326 == 0 && this.anInt2322 == 0 ? 0 : 1;
	}
}
