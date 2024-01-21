import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class5_Sub7_Sub2 extends Class5_Sub7 {

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
	public int anInt1371;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
	public int anInt1372;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
	public int anInt1373;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
	public int anInt1375;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
	private int anInt1377;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	private int anInt1378;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
	private final int anInt1374;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
	private final int anInt1376;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
	private int anInt1367;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	private int anInt1380;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!e;II)V")
	public Class5_Sub7_Sub2(@OriginalArg(0) Class5_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub5_5 = arg0;
		this.anInt1374 = arg0.anInt773;
		this.anInt1376 = arg0.anInt774;
		this.aBoolean74 = arg0.aBoolean33;
		this.anInt1367 = arg1;
		this.anInt1369 = arg2;
		this.anInt1380 = 8192;
		this.anInt1370 = 0;
		this.method1035();
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!e;III)V")
	public Class5_Sub7_Sub2(@OriginalArg(0) Class5_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub5_5 = arg0;
		this.anInt1374 = arg0.anInt773;
		this.anInt1376 = arg0.anInt774;
		this.aBoolean74 = arg0.aBoolean33;
		this.anInt1367 = arg1;
		this.anInt1369 = arg2;
		this.anInt1380 = arg3;
		this.anInt1370 = 0;
		this.method1035();
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "()Z")
	public boolean method1002() {
		return this.anInt1378 != 0;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "()V")
	private void method1003() {
		if (this.anInt1378 == 0) {
			return;
		}
		if (this.anInt1369 == Integer.MIN_VALUE) {
			this.anInt1369 = 0;
		}
		this.anInt1378 = 0;
		this.method1035();
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "()I")
	public synchronized int method1004() {
		return this.anInt1369 == Integer.MIN_VALUE ? 0 : this.anInt1369;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	private synchronized void method1005() {
		this.method1034(0, this.method1020());
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	public synchronized void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1034(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static128.method1032(arg1, arg2);
		@Pc(14) int local14 = Static128.method1037(arg1, arg2);
		if (this.anInt1373 == local10 && this.anInt1371 == local14) {
			this.anInt1378 = 0;
			return;
		}
		this.anInt1378 = arg0;
		this.anInt1369 = arg1;
		this.anInt1380 = arg2;
		this.anInt1375 = (arg1 - this.anInt1368) / arg0;
		this.anInt1372 = (local10 - this.anInt1373) / arg0;
		this.anInt1379 = (local14 - this.anInt1371) / arg0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2023(@OriginalArg(0) int arg0) {
		if (this.anInt1378 > 0) {
			if (arg0 >= this.anInt1378) {
				if (this.anInt1369 == Integer.MIN_VALUE) {
					this.anInt1369 = 0;
					this.anInt1368 = this.anInt1373 = this.anInt1371 = 0;
					this.method2144();
					arg0 = this.anInt1378;
				}
				this.anInt1378 = 0;
				this.method1035();
			} else {
				this.anInt1368 += this.anInt1375 * arg0;
				this.anInt1373 += this.anInt1372 * arg0;
				this.anInt1371 += this.anInt1379 * arg0;
				this.anInt1378 -= arg0;
			}
		}
		@Pc(71) Class5_Sub5_Sub1 local71 = (Class5_Sub5_Sub1) super.aClass5_Sub5_5;
		@Pc(76) int local76 = this.anInt1374 << 8;
		@Pc(81) int local81 = this.anInt1376 << 8;
		@Pc(87) int local87 = local71.aByteArray18.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1377 = 0;
		}
		if (this.anInt1370 < 0) {
			if (this.anInt1367 <= 0) {
				this.method1003();
				this.method2144();
				return;
			}
			this.anInt1370 = 0;
		}
		if (this.anInt1370 >= local87) {
			if (this.anInt1367 >= 0) {
				this.method1003();
				this.method2144();
				return;
			}
			this.anInt1370 = local87 - 1;
		}
		this.anInt1370 += this.anInt1367 * arg0;
		if (this.anInt1377 >= 0) {
			if (this.anInt1377 > 0) {
				if (this.aBoolean74) {
					label125: {
						if (this.anInt1367 < 0) {
							if (this.anInt1370 >= local76) {
								return;
							}
							this.anInt1370 = local76 + local76 - this.anInt1370 - 1;
							this.anInt1367 = -this.anInt1367;
							if (--this.anInt1377 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1370 < local81) {
								return;
							}
							this.anInt1370 = local81 + local81 - this.anInt1370 - 1;
							this.anInt1367 = -this.anInt1367;
							if (--this.anInt1377 == 0) {
								break;
							}
							if (this.anInt1370 >= local76) {
								return;
							}
							this.anInt1370 = local76 + local76 - this.anInt1370 - 1;
							this.anInt1367 = -this.anInt1367;
						} while (--this.anInt1377 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1367 < 0) {
						if (this.anInt1370 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1370 - 1) / local91;
						if (local361 < this.anInt1377) {
							this.anInt1370 += local91 * local361;
							this.anInt1377 -= local361;
							return;
						}
						this.anInt1370 += local91 * this.anInt1377;
						this.anInt1377 = 0;
					} else if (this.anInt1370 >= local81) {
						local361 = (this.anInt1370 - local76) / local91;
						if (local361 < this.anInt1377) {
							this.anInt1370 -= local91 * local361;
							this.anInt1377 -= local361;
							return;
						}
						this.anInt1370 -= local91 * this.anInt1377;
						this.anInt1377 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1367 < 0) {
				if (this.anInt1370 < 0) {
					this.anInt1370 = -1;
					this.method1003();
					this.method2144();
					return;
				}
			} else if (this.anInt1370 >= local87) {
				this.anInt1370 = local87;
				this.method1003();
				this.method2144();
			}
		} else if (this.aBoolean74) {
			if (this.anInt1367 < 0) {
				if (this.anInt1370 >= local76) {
					return;
				}
				this.anInt1370 = local76 + local76 - this.anInt1370 - 1;
				this.anInt1367 = -this.anInt1367;
			}
			while (this.anInt1370 >= local81) {
				this.anInt1370 = local81 + local81 - this.anInt1370 - 1;
				this.anInt1367 = -this.anInt1367;
				if (this.anInt1370 >= local76) {
					return;
				}
				this.anInt1370 = local76 + local76 - this.anInt1370 - 1;
				this.anInt1367 = -this.anInt1367;
			}
		} else if (this.anInt1367 < 0) {
			if (this.anInt1370 < local76) {
				this.anInt1370 = local81 - (local81 - 1 - this.anInt1370) % local91 - 1;
			}
		} else if (this.anInt1370 >= local81) {
			this.anInt1370 = local76 + (this.anInt1370 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	public synchronized void method1013(@OriginalArg(0) int arg0) {
		if (this.anInt1367 < 0) {
			this.anInt1367 = -arg0;
		} else {
			this.anInt1367 = arg0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
	@Override
	public int method2022() {
		@Pc(6) int local6 = this.anInt1368 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1377 == 0) {
			local6 -= local6 * this.anInt1370 / (((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18.length << 8);
		} else if (this.anInt1377 >= 0) {
			local6 -= local6 * this.anInt1374 / ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
	public synchronized void method1019(@OriginalArg(0) int arg0) {
		this.method1034(arg0 << 6, this.method1020());
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "()I")
	public synchronized int method1020() {
		return this.anInt1380 < 0 ? -1 : this.anInt1380;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1369 == 0 && this.anInt1378 == 0) {
			this.method2023(arg2);
			return;
		}
		@Pc(13) Class5_Sub5_Sub1 local13 = (Class5_Sub5_Sub1) super.aClass5_Sub5_5;
		@Pc(18) int local18 = this.anInt1374 << 8;
		@Pc(23) int local23 = this.anInt1376 << 8;
		@Pc(29) int local29 = local13.aByteArray18.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1377 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1370 < 0) {
			if (this.anInt1367 <= 0) {
				this.method1003();
				this.method2144();
				return;
			}
			this.anInt1370 = 0;
		}
		if (this.anInt1370 >= local29) {
			if (this.anInt1367 >= 0) {
				this.method1003();
				this.method2144();
				return;
			}
			this.anInt1370 = local29 - 1;
		}
		if (this.anInt1377 >= 0) {
			if (this.anInt1377 > 0) {
				if (this.aBoolean74) {
					label130: {
						if (this.anInt1367 < 0) {
							local40 = this.method1026(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt1374]);
							if (this.anInt1370 >= local18) {
								return;
							}
							this.anInt1370 = local18 + local18 - this.anInt1370 - 1;
							this.anInt1367 = -this.anInt1367;
							if (--this.anInt1377 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1030(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1376 - 1]);
							if (this.anInt1370 < local23) {
								return;
							}
							this.anInt1370 = local23 + local23 - this.anInt1370 - 1;
							this.anInt1367 = -this.anInt1367;
							if (--this.anInt1377 == 0) {
								break;
							}
							local40 = this.method1026(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1374]);
							if (this.anInt1370 >= local18) {
								return;
							}
							this.anInt1370 = local18 + local18 - this.anInt1370 - 1;
							this.anInt1367 = -this.anInt1367;
						} while (--this.anInt1377 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1367 < 0) {
						while (true) {
							local40 = this.method1026(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1376 - 1]);
							if (this.anInt1370 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1370 - 1) / local33;
							if (local416 >= this.anInt1377) {
								this.anInt1370 += local33 * this.anInt1377;
								this.anInt1377 = 0;
								break;
							}
							this.anInt1370 += local33 * local416;
							this.anInt1377 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1030(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1374]);
							if (this.anInt1370 < local23) {
								return;
							}
							local416 = (this.anInt1370 - local18) / local33;
							if (local416 >= this.anInt1377) {
								this.anInt1370 -= local33 * this.anInt1377;
								this.anInt1377 = 0;
								break;
							}
							this.anInt1370 -= local33 * local416;
							this.anInt1377 -= local416;
						}
					}
				}
			}
			if (this.anInt1367 < 0) {
				this.method1026(arg0, local40, 0, local44, 0);
				if (this.anInt1370 < 0) {
					this.anInt1370 = -1;
					this.method1003();
					this.method2144();
					return;
				}
			} else {
				this.method1030(arg0, local40, local29, local44, 0);
				if (this.anInt1370 >= local29) {
					this.anInt1370 = local29;
					this.method1003();
					this.method2144();
				}
			}
		} else if (this.aBoolean74) {
			if (this.anInt1367 < 0) {
				local40 = this.method1026(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt1374]);
				if (this.anInt1370 >= local18) {
					return;
				}
				this.anInt1370 = local18 + local18 - this.anInt1370 - 1;
				this.anInt1367 = -this.anInt1367;
			}
			while (true) {
				local40 = this.method1030(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1376 - 1]);
				if (this.anInt1370 < local23) {
					return;
				}
				this.anInt1370 = local23 + local23 - this.anInt1370 - 1;
				this.anInt1367 = -this.anInt1367;
				local40 = this.method1026(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1374]);
				if (this.anInt1370 >= local18) {
					return;
				}
				this.anInt1370 = local18 + local18 - this.anInt1370 - 1;
				this.anInt1367 = -this.anInt1367;
			}
		} else if (this.anInt1367 < 0) {
			while (true) {
				local40 = this.method1026(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1376 - 1]);
				if (this.anInt1370 >= local18) {
					return;
				}
				this.anInt1370 = local23 - (local23 - 1 - this.anInt1370) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1030(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1374]);
				if (this.anInt1370 < local23) {
					return;
				}
				this.anInt1370 = local18 + (this.anInt1370 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lclient!u;")
	@Override
	public Class5_Sub7 method2024() {
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
	public synchronized void method1024() {
		this.anInt1367 = (this.anInt1367 ^ this.anInt1367 >> 31) + (this.anInt1367 >>> 31);
		this.anInt1367 = -this.anInt1367;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([IIIII)I")
	private int method1026(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1378 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1378;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1378 += arg1;
			if (this.anInt1367 == -256 && (this.anInt1370 & 0xFF) == 0) {
				if (Static33.aBoolean47) {
					arg1 = Static128.method1007(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, this.anInt1372, this.anInt1379, local7, arg2, this);
				} else {
					arg1 = Static128.method1021(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, this.anInt1375, local7, arg2, this);
				}
			} else if (Static33.aBoolean47) {
				arg1 = Static128.method1012(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, this.anInt1372, this.anInt1379, local7, arg2, this, this.anInt1367, arg4);
			} else {
				arg1 = Static128.method1025(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, this.anInt1375, local7, arg2, this, this.anInt1367, arg4);
			}
			this.anInt1378 -= arg1;
			if (this.anInt1378 != 0) {
				return arg1;
			}
			if (this.anInt1369 == Integer.MIN_VALUE) {
				this.anInt1369 = 0;
				this.anInt1368 = this.anInt1373 = this.anInt1371 = 0;
				this.method2144();
				return arg3;
			}
			this.method1035();
		}
		if (this.anInt1367 == -256 && (this.anInt1370 & 0xFF) == 0) {
			return Static33.aBoolean47 ? Static128.method1010(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, arg3, arg2, this) : Static128.method1011(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, arg3, arg2, this);
		} else if (Static33.aBoolean47) {
			return Static128.method1016(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, arg3, arg2, this, this.anInt1367, arg4);
		} else {
			return Static128.method1015(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, arg3, arg2, this, this.anInt1367, arg4);
		}
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "()I")
	public synchronized int method1027() {
		return this.anInt1367 < 0 ? -this.anInt1367 : this.anInt1367;
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V")
	public synchronized void method1028(@OriginalArg(0) int arg0) {
		this.anInt1377 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
	@Override
	public int method2021() {
		return this.anInt1369 == 0 && this.anInt1378 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([IIIII)I")
	private int method1030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1378 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1378;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1378 += arg1;
			if (this.anInt1367 == 256 && (this.anInt1370 & 0xFF) == 0) {
				if (Static33.aBoolean47) {
					arg1 = Static128.method1033(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, this.anInt1372, this.anInt1379, local7, arg2, this);
				} else {
					arg1 = Static128.method1014(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, this.anInt1375, local7, arg2, this);
				}
			} else if (Static33.aBoolean47) {
				arg1 = Static128.method1008(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, this.anInt1372, this.anInt1379, local7, arg2, this, this.anInt1367, arg4);
			} else {
				arg1 = Static128.method1018(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, this.anInt1375, local7, arg2, this, this.anInt1367, arg4);
			}
			this.anInt1378 -= arg1;
			if (this.anInt1378 != 0) {
				return arg1;
			}
			if (this.anInt1369 == Integer.MIN_VALUE) {
				this.anInt1369 = 0;
				this.anInt1368 = this.anInt1373 = this.anInt1371 = 0;
				this.method2144();
				return arg3;
			}
			this.method1035();
		}
		if (this.anInt1367 == 256 && (this.anInt1370 & 0xFF) == 0) {
			return Static33.aBoolean47 ? Static128.method1001(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, arg3, arg2, this) : Static128.method1023(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, arg3, arg2, this);
		} else if (Static33.aBoolean47) {
			return Static128.method1006(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1373, this.anInt1371, arg3, arg2, this, this.anInt1367, arg4);
		} else {
			return Static128.method1017(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18, arg0, this.anInt1370, arg1, this.anInt1368, arg3, arg2, this, this.anInt1367, arg4);
		}
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
	public synchronized void method1031(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1370 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lclient!u;")
	@Override
	public Class5_Sub7 method2026() {
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	private synchronized void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1369 = arg0;
		this.anInt1380 = arg1;
		this.anInt1378 = 0;
		this.method1035();
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "()V")
	private void method1035() {
		this.anInt1368 = this.anInt1369;
		this.anInt1373 = Static128.method1032(this.anInt1369, this.anInt1380);
		this.anInt1371 = Static128.method1037(this.anInt1369, this.anInt1380);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V")
	public synchronized void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1009(arg0, arg1, this.method1020());
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V")
	public synchronized void method1038(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1005();
			this.method2144();
		} else if (this.anInt1373 == 0 && this.anInt1371 == 0) {
			this.anInt1378 = 0;
			this.anInt1369 = 0;
			this.anInt1368 = 0;
			this.method2144();
		} else {
			this.anInt1378 = arg0;
			this.anInt1369 = Integer.MIN_VALUE;
			this.anInt1375 = -this.anInt1368 / arg0;
			this.anInt1372 = -this.anInt1373 / arg0;
			this.anInt1379 = -this.anInt1371 / arg0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "()Z")
	public boolean method1039() {
		return this.anInt1370 < 0 || this.anInt1370 >= ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray18.length << 8;
	}
}
