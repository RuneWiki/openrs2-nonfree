import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public int anInt1461;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	public int anInt1464;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	private int anInt1468;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	public int anInt1470;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
	public int anInt1472;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	private int anInt1469;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	private int anInt1460;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "Z")
	private boolean aBoolean113;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	private int anInt1463;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	private int anInt1471;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	private int anInt1473;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!om;II)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class1_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub22_5 = arg0;
		this.anInt1469 = arg0.anInt3754;
		this.anInt1460 = arg0.anInt3753;
		this.aBoolean113 = arg0.aBoolean291;
		this.anInt1463 = arg1;
		this.anInt1471 = arg2;
		this.anInt1473 = 8192;
		this.anInt1466 = 0;
		this.method1249();
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!om;III)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class1_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub22_5 = arg0;
		this.anInt1469 = arg0.anInt3754;
		this.anInt1460 = arg0.anInt3753;
		this.aBoolean113 = arg0.aBoolean291;
		this.anInt1463 = arg1;
		this.anInt1471 = arg2;
		this.anInt1473 = arg3;
		this.anInt1466 = 0;
		this.method1249();
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()Z")
	public boolean method1222() {
		return this.anInt1465 != 0;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "()Z")
	private boolean method1226() {
		@Pc(2) int local2 = this.anInt1471;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static305.method1247(local2, this.anInt1473);
			local8 = Static305.method1223(local2, this.anInt1473);
		}
		if (this.anInt1461 != local2 || this.anInt1472 != local10 || this.anInt1464 != local8) {
			if (this.anInt1461 < local2) {
				this.anInt1467 = 1;
				this.anInt1465 = local2 - this.anInt1461;
			} else if (this.anInt1461 > local2) {
				this.anInt1467 = -1;
				this.anInt1465 = this.anInt1461 - local2;
			} else {
				this.anInt1467 = 0;
			}
			if (this.anInt1472 < local10) {
				this.anInt1470 = 1;
				if (this.anInt1465 == 0 || this.anInt1465 > local10 - this.anInt1472) {
					this.anInt1465 = local10 - this.anInt1472;
				}
			} else if (this.anInt1472 > local10) {
				this.anInt1470 = -1;
				if (this.anInt1465 == 0 || this.anInt1465 > this.anInt1472 - local10) {
					this.anInt1465 = this.anInt1472 - local10;
				}
			} else {
				this.anInt1470 = 0;
			}
			if (this.anInt1464 < local8) {
				this.anInt1462 = 1;
				if (this.anInt1465 == 0 || this.anInt1465 > local8 - this.anInt1464) {
					this.anInt1465 = local8 - this.anInt1464;
				}
			} else if (this.anInt1464 > local8) {
				this.anInt1462 = -1;
				if (this.anInt1465 == 0 || this.anInt1465 > this.anInt1464 - local8) {
					this.anInt1465 = this.anInt1464 - local8;
				}
			} else {
				this.anInt1462 = 0;
			}
			return false;
		} else if (this.anInt1471 == Integer.MIN_VALUE) {
			this.anInt1471 = 0;
			this.anInt1461 = this.anInt1472 = this.anInt1464 = 0;
			this.method4534();
			return true;
		} else {
			this.method1249();
			return false;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public synchronized void method1228() {
		this.anInt1463 = (this.anInt1463 ^ this.anInt1463 >> 31) + (this.anInt1463 >>> 31);
		this.anInt1463 = -this.anInt1463;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public synchronized void method1231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1254(arg0, arg1, this.method1232());
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "()I")
	public synchronized int method1232() {
		return this.anInt1473 < 0 ? -1 : this.anInt1473;
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "()I")
	public synchronized int method1233() {
		return this.anInt1463 < 0 ? -this.anInt1463 : this.anInt1463;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4204(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1471 == 0 && this.anInt1465 == 0) {
			this.method4209(arg2);
			return;
		}
		@Pc(13) Class1_Sub22_Sub1 local13 = (Class1_Sub22_Sub1) this.aClass1_Sub22_5;
		@Pc(18) int local18 = this.anInt1469 << 8;
		@Pc(23) int local23 = this.anInt1460 << 8;
		@Pc(29) int local29 = local13.aByteArray70.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1468 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1466 < 0) {
			if (this.anInt1463 <= 0) {
				this.method1251();
				this.method4534();
				return;
			}
			this.anInt1466 = 0;
		}
		if (this.anInt1466 >= local29) {
			if (this.anInt1463 >= 0) {
				this.method1251();
				this.method4534();
				return;
			}
			this.anInt1466 = local29 - 1;
		}
		if (this.anInt1468 >= 0) {
			if (this.anInt1468 > 0) {
				if (this.aBoolean113) {
					label131: {
						if (this.anInt1463 < 0) {
							local40 = this.method1246(arg0, arg1, local18, local44, local13.aByteArray70[this.anInt1469]);
							if (this.anInt1466 >= local18) {
								return;
							}
							this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
							this.anInt1463 = -this.anInt1463;
							if (--this.anInt1468 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method1237(arg0, local40, local23, local44, local13.aByteArray70[this.anInt1460 - 1]);
							if (this.anInt1466 < local23) {
								return;
							}
							this.anInt1466 = local23 + local23 - this.anInt1466 - 1;
							this.anInt1463 = -this.anInt1463;
							if (--this.anInt1468 == 0) {
								break;
							}
							local40 = this.method1246(arg0, local40, local18, local44, local13.aByteArray70[this.anInt1469]);
							if (this.anInt1466 >= local18) {
								return;
							}
							this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
							this.anInt1463 = -this.anInt1463;
						} while (--this.anInt1468 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt1463 < 0) {
						while (true) {
							local40 = this.method1246(arg0, local40, local18, local44, local13.aByteArray70[this.anInt1460 - 1]);
							if (this.anInt1466 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt1466 - 1) / local33;
							if (local417 >= this.anInt1468) {
								this.anInt1466 += local33 * this.anInt1468;
								this.anInt1468 = 0;
								break;
							}
							this.anInt1466 += local33 * local417;
							this.anInt1468 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method1237(arg0, local40, local23, local44, local13.aByteArray70[this.anInt1469]);
							if (this.anInt1466 < local23) {
								return;
							}
							local417 = (this.anInt1466 - local18) / local33;
							if (local417 >= this.anInt1468) {
								this.anInt1466 -= local33 * this.anInt1468;
								this.anInt1468 = 0;
								break;
							}
							this.anInt1466 -= local33 * local417;
							this.anInt1468 -= local417;
						}
					}
				}
			}
			if (this.anInt1463 < 0) {
				this.method1246(arg0, local40, 0, local44, 0);
				if (this.anInt1466 < 0) {
					this.anInt1466 = -1;
					this.method1251();
					this.method4534();
				}
			} else {
				this.method1237(arg0, local40, local29, local44, 0);
				if (this.anInt1466 >= local29) {
					this.anInt1466 = local29;
					this.method1251();
					this.method4534();
				}
			}
		} else if (this.aBoolean113) {
			if (this.anInt1463 < 0) {
				local40 = this.method1246(arg0, arg1, local18, local44, local13.aByteArray70[this.anInt1469]);
				if (this.anInt1466 >= local18) {
					return;
				}
				this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
				this.anInt1463 = -this.anInt1463;
			}
			while (true) {
				local40 = this.method1237(arg0, local40, local23, local44, local13.aByteArray70[this.anInt1460 - 1]);
				if (this.anInt1466 < local23) {
					return;
				}
				this.anInt1466 = local23 + local23 - this.anInt1466 - 1;
				this.anInt1463 = -this.anInt1463;
				local40 = this.method1246(arg0, local40, local18, local44, local13.aByteArray70[this.anInt1469]);
				if (this.anInt1466 >= local18) {
					return;
				}
				this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
				this.anInt1463 = -this.anInt1463;
			}
		} else if (this.anInt1463 < 0) {
			while (true) {
				local40 = this.method1246(arg0, local40, local18, local44, local13.aByteArray70[this.anInt1460 - 1]);
				if (this.anInt1466 >= local18) {
					return;
				}
				this.anInt1466 = local23 - (local23 - 1 - this.anInt1466) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1237(arg0, local40, local23, local44, local13.aByteArray70[this.anInt1469]);
				if (this.anInt1466 < local23) {
					return;
				}
				this.anInt1466 = local18 + (this.anInt1466 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "()Z")
	public boolean method1235() {
		return this.anInt1466 < 0 || this.anInt1466 >= ((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70.length << 8;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4209(@OriginalArg(0) int arg0) {
		if (this.anInt1465 > 0) {
			if (arg0 >= this.anInt1465) {
				if (this.anInt1471 == Integer.MIN_VALUE) {
					this.anInt1471 = 0;
					this.anInt1461 = this.anInt1472 = this.anInt1464 = 0;
					this.method4534();
					arg0 = this.anInt1465;
				}
				this.anInt1465 = 0;
				this.method1249();
			} else {
				this.anInt1461 += this.anInt1467 * arg0;
				this.anInt1472 += this.anInt1470 * arg0;
				this.anInt1464 += this.anInt1462 * arg0;
				this.anInt1465 -= arg0;
			}
		}
		@Pc(71) Class1_Sub22_Sub1 local71 = (Class1_Sub22_Sub1) this.aClass1_Sub22_5;
		@Pc(76) int local76 = this.anInt1469 << 8;
		@Pc(81) int local81 = this.anInt1460 << 8;
		@Pc(87) int local87 = local71.aByteArray70.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1468 = 0;
		}
		if (this.anInt1466 < 0) {
			if (this.anInt1463 <= 0) {
				this.method1251();
				this.method4534();
				return;
			}
			this.anInt1466 = 0;
		}
		if (this.anInt1466 >= local87) {
			if (this.anInt1463 >= 0) {
				this.method1251();
				this.method4534();
				return;
			}
			this.anInt1466 = local87 - 1;
		}
		this.anInt1466 += this.anInt1463 * arg0;
		if (this.anInt1468 >= 0) {
			if (this.anInt1468 > 0) {
				if (this.aBoolean113) {
					label121: {
						if (this.anInt1463 < 0) {
							if (this.anInt1466 >= local76) {
								return;
							}
							this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
							this.anInt1463 = -this.anInt1463;
							if (--this.anInt1468 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt1466 < local81) {
								return;
							}
							this.anInt1466 = local81 + local81 - this.anInt1466 - 1;
							this.anInt1463 = -this.anInt1463;
							if (--this.anInt1468 == 0) {
								break;
							}
							if (this.anInt1466 >= local76) {
								return;
							}
							this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
							this.anInt1463 = -this.anInt1463;
						} while (--this.anInt1468 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt1463 < 0) {
							if (this.anInt1466 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt1466 - 1) / local91;
							if (local362 >= this.anInt1468) {
								this.anInt1466 += local91 * this.anInt1468;
								this.anInt1468 = 0;
								break label153;
							}
							this.anInt1466 += local91 * local362;
							this.anInt1468 -= local362;
						} else if (this.anInt1466 >= local81) {
							local362 = (this.anInt1466 - local76) / local91;
							if (local362 >= this.anInt1468) {
								this.anInt1466 -= local91 * this.anInt1468;
								this.anInt1468 = 0;
								break label153;
							}
							this.anInt1466 -= local91 * local362;
							this.anInt1468 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt1463 < 0) {
				if (this.anInt1466 < 0) {
					this.anInt1466 = -1;
					this.method1251();
					this.method4534();
				}
			} else if (this.anInt1466 >= local87) {
				this.anInt1466 = local87;
				this.method1251();
				this.method4534();
			}
		} else if (this.aBoolean113) {
			if (this.anInt1463 < 0) {
				if (this.anInt1466 >= local76) {
					return;
				}
				this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
				this.anInt1463 = -this.anInt1463;
			}
			while (this.anInt1466 >= local81) {
				this.anInt1466 = local81 + local81 - this.anInt1466 - 1;
				this.anInt1463 = -this.anInt1463;
				if (this.anInt1466 >= local76) {
					return;
				}
				this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
				this.anInt1463 = -this.anInt1463;
			}
		} else if (this.anInt1463 < 0) {
			if (this.anInt1466 >= local76) {
				return;
			}
			this.anInt1466 = local81 - (local81 - 1 - this.anInt1466) % local91 - 1;
		} else if (this.anInt1466 >= local81) {
			this.anInt1466 = local76 + (this.anInt1466 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIIII)I")
	private int method1237(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt1465 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt1465;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt1465 += arg1;
				if (this.anInt1463 == 256 && (this.anInt1466 & 0xFF) == 0) {
					if (Static129.aBoolean297) {
						arg1 = Static305.method1258(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, this.anInt1470, this.anInt1462, local7, arg2, this);
					} else {
						arg1 = Static305.method1256(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1467, local7, arg2, this);
					}
				} else if (Static129.aBoolean297) {
					arg1 = Static305.method1234(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, this.anInt1470, this.anInt1462, local7, arg2, this, this.anInt1463, arg4);
				} else {
					arg1 = Static305.method1239(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1467, local7, arg2, this, this.anInt1463, arg4);
				}
				this.anInt1465 -= arg1;
				if (this.anInt1465 != 0) {
					return arg1;
				}
				if (!this.method1226()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt1463 == 256 && (this.anInt1466 & 0xFF) == 0) {
				if (Static129.aBoolean297) {
					return Static305.method1245(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, arg3, arg2, this);
				}
				return Static305.method1261(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, arg3, arg2, this);
			}
			if (Static129.aBoolean297) {
				return Static305.method1253(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, arg3, arg2, this, this.anInt1463, arg4);
			}
			return Static305.method1230(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, arg3, arg2, this, this.anInt1463, arg4);
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	public synchronized void method1238(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1466 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
	private synchronized void method1241() {
		this.method1259(0, this.method1232());
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()I")
	@Override
	public int method4203() {
		@Pc(6) int local6 = this.anInt1461 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1468 == 0) {
			local6 -= local6 * this.anInt1466 / (((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70.length << 8);
		} else if (this.anInt1468 >= 0) {
			local6 -= local6 * this.anInt1469 / ((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "([IIIII)I")
	private int method1246(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt1465 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt1465;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt1465 += arg1;
				if (this.anInt1463 == -256 && (this.anInt1466 & 0xFF) == 0) {
					if (Static129.aBoolean297) {
						arg1 = Static305.method1229(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, this.anInt1470, this.anInt1462, local7, arg2, this);
					} else {
						arg1 = Static305.method1227(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1467, local7, arg2, this);
					}
				} else if (Static129.aBoolean297) {
					arg1 = Static305.method1243(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, this.anInt1470, this.anInt1462, local7, arg2, this, this.anInt1463, arg4);
				} else {
					arg1 = Static305.method1244(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1467, local7, arg2, this, this.anInt1463, arg4);
				}
				this.anInt1465 -= arg1;
				if (this.anInt1465 != 0) {
					return arg1;
				}
				if (!this.method1226()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt1463 == -256 && (this.anInt1466 & 0xFF) == 0) {
				if (Static129.aBoolean297) {
					return Static305.method1240(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, arg3, arg2, this);
				}
				return Static305.method1225(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, arg3, arg2, this);
			}
			if (Static129.aBoolean297) {
				return Static305.method1242(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1472, this.anInt1464, arg3, arg2, this, this.anInt1463, arg4);
			}
			return Static305.method1248(((Class1_Sub22_Sub1) this.aClass1_Sub22_5).aByteArray70, arg0, this.anInt1466, arg1, this.anInt1461, arg3, arg2, this, this.anInt1463, arg4);
		}
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "()V")
	private void method1249() {
		this.anInt1461 = this.anInt1471;
		this.anInt1472 = Static305.method1247(this.anInt1471, this.anInt1473);
		this.anInt1464 = Static305.method1223(this.anInt1471, this.anInt1473);
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
	public synchronized void method1250(@OriginalArg(0) int arg0) {
		if (this.anInt1463 < 0) {
			this.anInt1463 = -arg0;
		} else {
			this.anInt1463 = arg0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "()V")
	private void method1251() {
		if (this.anInt1465 == 0) {
			return;
		}
		if (this.anInt1471 == Integer.MIN_VALUE) {
			this.anInt1471 = 0;
		}
		this.anInt1465 = 0;
		this.method1249();
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()I")
	@Override
	public int method4207() {
		return this.anInt1471 == 0 && this.anInt1465 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	public synchronized void method1252(@OriginalArg(0) int arg0) {
		this.anInt1468 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public synchronized void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1259(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static305.method1247(arg1, arg2);
		@Pc(14) int local14 = Static305.method1223(arg1, arg2);
		if (this.anInt1472 == local10 && this.anInt1464 == local14) {
			this.anInt1465 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1461;
		if (this.anInt1461 - arg1 > local31) {
			local31 = this.anInt1461 - arg1;
		}
		if (local10 - this.anInt1472 > local31) {
			local31 = local10 - this.anInt1472;
		}
		if (this.anInt1472 - local10 > local31) {
			local31 = this.anInt1472 - local10;
		}
		if (local14 - this.anInt1464 > local31) {
			local31 = local14 - this.anInt1464;
		}
		if (this.anInt1464 - local14 > local31) {
			local31 = this.anInt1464 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1465 = arg0;
		this.anInt1471 = arg1;
		this.anInt1473 = arg2;
		this.anInt1467 = (arg1 - this.anInt1461) / arg0;
		this.anInt1470 = (local10 - this.anInt1472) / arg0;
		this.anInt1462 = (local14 - this.anInt1464) / arg0;
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "()I")
	public synchronized int method1255() {
		return this.anInt1471 == Integer.MIN_VALUE ? 0 : this.anInt1471;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()Lclient!sm;")
	@Override
	public Class1_Sub8 method4208() {
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	public synchronized void method1257(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1241();
			this.method4534();
		} else if (this.anInt1472 == 0 && this.anInt1464 == 0) {
			this.anInt1465 = 0;
			this.anInt1471 = 0;
			this.anInt1461 = 0;
			this.method4534();
		} else {
			@Pc(31) int local31 = -this.anInt1461;
			if (this.anInt1461 > local31) {
				local31 = this.anInt1461;
			}
			if (-this.anInt1472 > local31) {
				local31 = -this.anInt1472;
			}
			if (this.anInt1472 > local31) {
				local31 = this.anInt1472;
			}
			if (-this.anInt1464 > local31) {
				local31 = -this.anInt1464;
			}
			if (this.anInt1464 > local31) {
				local31 = this.anInt1464;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1465 = arg0;
			this.anInt1471 = Integer.MIN_VALUE;
			this.anInt1467 = -this.anInt1461 / arg0;
			this.anInt1470 = -this.anInt1472 / arg0;
			this.anInt1462 = -this.anInt1464 / arg0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V")
	private synchronized void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1471 = arg0;
		this.anInt1473 = arg1;
		this.anInt1465 = 0;
		this.method1249();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lclient!sm;")
	@Override
	public Class1_Sub8 method4206() {
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V")
	public synchronized void method1260(@OriginalArg(0) int arg0) {
		this.method1259(arg0 << 6, this.method1232());
	}
}
