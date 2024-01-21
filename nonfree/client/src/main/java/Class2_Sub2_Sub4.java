import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	public int anInt2518;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
	public int anInt2523;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	private int anInt2525;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
	private int anInt2527;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	public int anInt2529;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	public int anInt2530;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
	private final int anInt2522;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	private final int anInt2526;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "Z")
	private final boolean aBoolean185;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	private int anInt2524;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	private int anInt2528;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	private int anInt2517;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public int anInt2520;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qe;II)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class2_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub16_5 = arg0;
		this.anInt2522 = arg0.anInt2505;
		this.anInt2526 = arg0.anInt2506;
		this.aBoolean185 = arg0.aBoolean180;
		this.anInt2524 = arg1;
		this.anInt2528 = arg2;
		this.anInt2517 = 8192;
		this.anInt2520 = 0;
		this.method1537();
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qe;III)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) Class2_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub16_5 = arg0;
		this.anInt2522 = arg0.anInt2505;
		this.anInt2526 = arg0.anInt2506;
		this.aBoolean185 = arg0.aBoolean180;
		this.anInt2524 = arg1;
		this.anInt2528 = arg2;
		this.anInt2517 = arg3;
		this.anInt2520 = 0;
		this.method1537();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIII)I")
	private int method1525(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2527 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2527;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2527 += arg1;
			if (this.anInt2524 == -256 && (this.anInt2520 & 0xFF) == 0) {
				if (Static36.aBoolean74) {
					arg1 = Static133.method1526(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, this.anInt2519, this.anInt2518, local7, arg2, this);
				} else {
					arg1 = Static133.method1548(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, this.anInt2529, local7, arg2, this);
				}
			} else if (Static36.aBoolean74) {
				arg1 = Static133.method1555(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, this.anInt2519, this.anInt2518, local7, arg2, this, this.anInt2524, arg4);
			} else {
				arg1 = Static133.method1541(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, this.anInt2529, local7, arg2, this, this.anInt2524, arg4);
			}
			this.anInt2527 -= arg1;
			if (this.anInt2527 != 0) {
				return arg1;
			}
			if (this.anInt2528 == Integer.MIN_VALUE) {
				this.anInt2528 = 0;
				this.anInt2523 = this.anInt2530 = this.anInt2521 = 0;
				this.method1961();
				return arg3;
			}
			this.method1537();
		}
		if (this.anInt2524 == -256 && (this.anInt2520 & 0xFF) == 0) {
			return Static36.aBoolean74 ? Static133.method1562(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, arg3, arg2, this) : Static133.method1563(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, arg3, arg2, this);
		} else if (Static36.aBoolean74) {
			return Static133.method1545(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, arg3, arg2, this, this.anInt2524, arg4);
		} else {
			return Static133.method1529(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, arg3, arg2, this, this.anInt2524, arg4);
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public Class2_Sub2 method1521() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public synchronized void method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1536(arg0, arg1, this.method1553());
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()Z")
	public boolean method1531() {
		return this.anInt2520 < 0 || this.anInt2520 >= ((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35.length << 8;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public synchronized void method1533(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1547();
			this.method1961();
		} else if (this.anInt2530 == 0 && this.anInt2521 == 0) {
			this.anInt2527 = 0;
			this.anInt2528 = 0;
			this.anInt2523 = 0;
			this.method1961();
		} else {
			this.anInt2527 = arg0;
			this.anInt2528 = Integer.MIN_VALUE;
			this.anInt2529 = -this.anInt2523 / arg0;
			this.anInt2519 = -this.anInt2530 / arg0;
			this.anInt2518 = -this.anInt2521 / arg0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2528 == 0 && this.anInt2527 == 0) {
			this.method1523(arg2);
			return;
		}
		@Pc(13) Class2_Sub16_Sub1 local13 = (Class2_Sub16_Sub1) super.aClass2_Sub16_5;
		@Pc(18) int local18 = this.anInt2522 << 8;
		@Pc(23) int local23 = this.anInt2526 << 8;
		@Pc(29) int local29 = local13.aByteArray35.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2525 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2520 < 0) {
			if (this.anInt2524 <= 0) {
				this.method1556();
				this.method1961();
				return;
			}
			this.anInt2520 = 0;
		}
		if (this.anInt2520 >= local29) {
			if (this.anInt2524 >= 0) {
				this.method1556();
				this.method1961();
				return;
			}
			this.anInt2520 = local29 - 1;
		}
		if (this.anInt2525 >= 0) {
			if (this.anInt2525 > 0) {
				if (this.aBoolean185) {
					label130: {
						if (this.anInt2524 < 0) {
							local40 = this.method1525(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt2522]);
							if (this.anInt2520 >= local18) {
								return;
							}
							this.anInt2520 = local18 + local18 - this.anInt2520 - 1;
							this.anInt2524 = -this.anInt2524;
							if (--this.anInt2525 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2526 - 1]);
							if (this.anInt2520 < local23) {
								return;
							}
							this.anInt2520 = local23 + local23 - this.anInt2520 - 1;
							this.anInt2524 = -this.anInt2524;
							if (--this.anInt2525 == 0) {
								break;
							}
							local40 = this.method1525(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2522]);
							if (this.anInt2520 >= local18) {
								return;
							}
							this.anInt2520 = local18 + local18 - this.anInt2520 - 1;
							this.anInt2524 = -this.anInt2524;
						} while (--this.anInt2525 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2524 < 0) {
						while (true) {
							local40 = this.method1525(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2526 - 1]);
							if (this.anInt2520 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2520 - 1) / local33;
							if (local416 >= this.anInt2525) {
								this.anInt2520 += local33 * this.anInt2525;
								this.anInt2525 = 0;
								break;
							}
							this.anInt2520 += local33 * local416;
							this.anInt2525 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2522]);
							if (this.anInt2520 < local23) {
								return;
							}
							local416 = (this.anInt2520 - local18) / local33;
							if (local416 >= this.anInt2525) {
								this.anInt2520 -= local33 * this.anInt2525;
								this.anInt2525 = 0;
								break;
							}
							this.anInt2520 -= local33 * local416;
							this.anInt2525 -= local416;
						}
					}
				}
			}
			if (this.anInt2524 < 0) {
				this.method1525(arg0, local40, 0, local44, 0);
				if (this.anInt2520 < 0) {
					this.anInt2520 = -1;
					this.method1556();
					this.method1961();
					return;
				}
			} else {
				this.method1559(arg0, local40, local29, local44, 0);
				if (this.anInt2520 >= local29) {
					this.anInt2520 = local29;
					this.method1556();
					this.method1961();
				}
			}
		} else if (this.aBoolean185) {
			if (this.anInt2524 < 0) {
				local40 = this.method1525(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt2522]);
				if (this.anInt2520 >= local18) {
					return;
				}
				this.anInt2520 = local18 + local18 - this.anInt2520 - 1;
				this.anInt2524 = -this.anInt2524;
			}
			while (true) {
				local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2526 - 1]);
				if (this.anInt2520 < local23) {
					return;
				}
				this.anInt2520 = local23 + local23 - this.anInt2520 - 1;
				this.anInt2524 = -this.anInt2524;
				local40 = this.method1525(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2522]);
				if (this.anInt2520 >= local18) {
					return;
				}
				this.anInt2520 = local18 + local18 - this.anInt2520 - 1;
				this.anInt2524 = -this.anInt2524;
			}
		} else if (this.anInt2524 < 0) {
			while (true) {
				local40 = this.method1525(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2526 - 1]);
				if (this.anInt2520 >= local18) {
					return;
				}
				this.anInt2520 = local23 - (local23 - 1 - this.anInt2520) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2522]);
				if (this.anInt2520 < local23) {
					return;
				}
				this.anInt2520 = local18 + (this.anInt2520 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	public synchronized void method1536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1561(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static133.method1534(arg1, arg2);
		@Pc(14) int local14 = Static133.method1542(arg1, arg2);
		if (this.anInt2530 == local10 && this.anInt2521 == local14) {
			this.anInt2527 = 0;
			return;
		}
		this.anInt2527 = arg0;
		this.anInt2528 = arg1;
		this.anInt2517 = arg2;
		this.anInt2529 = (arg1 - this.anInt2523) / arg0;
		this.anInt2519 = (local10 - this.anInt2530) / arg0;
		this.anInt2518 = (local14 - this.anInt2521) / arg0;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "()V")
	private void method1537() {
		this.anInt2523 = this.anInt2528;
		this.anInt2530 = Static133.method1534(this.anInt2528, this.anInt2517);
		this.anInt2521 = Static133.method1542(this.anInt2528, this.anInt2517);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public synchronized void method1538(@OriginalArg(0) int arg0) {
		this.method1561(arg0 << 6, this.method1553());
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1523(@OriginalArg(0) int arg0) {
		if (this.anInt2527 > 0) {
			if (arg0 >= this.anInt2527) {
				if (this.anInt2528 == Integer.MIN_VALUE) {
					this.anInt2528 = 0;
					this.anInt2523 = this.anInt2530 = this.anInt2521 = 0;
					this.method1961();
					arg0 = this.anInt2527;
				}
				this.anInt2527 = 0;
				this.method1537();
			} else {
				this.anInt2523 += this.anInt2529 * arg0;
				this.anInt2530 += this.anInt2519 * arg0;
				this.anInt2521 += this.anInt2518 * arg0;
				this.anInt2527 -= arg0;
			}
		}
		@Pc(71) Class2_Sub16_Sub1 local71 = (Class2_Sub16_Sub1) super.aClass2_Sub16_5;
		@Pc(76) int local76 = this.anInt2522 << 8;
		@Pc(81) int local81 = this.anInt2526 << 8;
		@Pc(87) int local87 = local71.aByteArray35.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2525 = 0;
		}
		if (this.anInt2520 < 0) {
			if (this.anInt2524 <= 0) {
				this.method1556();
				this.method1961();
				return;
			}
			this.anInt2520 = 0;
		}
		if (this.anInt2520 >= local87) {
			if (this.anInt2524 >= 0) {
				this.method1556();
				this.method1961();
				return;
			}
			this.anInt2520 = local87 - 1;
		}
		this.anInt2520 += this.anInt2524 * arg0;
		if (this.anInt2525 >= 0) {
			if (this.anInt2525 > 0) {
				if (this.aBoolean185) {
					label125: {
						if (this.anInt2524 < 0) {
							if (this.anInt2520 >= local76) {
								return;
							}
							this.anInt2520 = local76 + local76 - this.anInt2520 - 1;
							this.anInt2524 = -this.anInt2524;
							if (--this.anInt2525 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2520 < local81) {
								return;
							}
							this.anInt2520 = local81 + local81 - this.anInt2520 - 1;
							this.anInt2524 = -this.anInt2524;
							if (--this.anInt2525 == 0) {
								break;
							}
							if (this.anInt2520 >= local76) {
								return;
							}
							this.anInt2520 = local76 + local76 - this.anInt2520 - 1;
							this.anInt2524 = -this.anInt2524;
						} while (--this.anInt2525 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2524 < 0) {
						if (this.anInt2520 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2520 - 1) / local91;
						if (local361 < this.anInt2525) {
							this.anInt2520 += local91 * local361;
							this.anInt2525 -= local361;
							return;
						}
						this.anInt2520 += local91 * this.anInt2525;
						this.anInt2525 = 0;
					} else if (this.anInt2520 >= local81) {
						local361 = (this.anInt2520 - local76) / local91;
						if (local361 < this.anInt2525) {
							this.anInt2520 -= local91 * local361;
							this.anInt2525 -= local361;
							return;
						}
						this.anInt2520 -= local91 * this.anInt2525;
						this.anInt2525 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2524 < 0) {
				if (this.anInt2520 < 0) {
					this.anInt2520 = -1;
					this.method1556();
					this.method1961();
					return;
				}
			} else if (this.anInt2520 >= local87) {
				this.anInt2520 = local87;
				this.method1556();
				this.method1961();
			}
		} else if (this.aBoolean185) {
			if (this.anInt2524 < 0) {
				if (this.anInt2520 >= local76) {
					return;
				}
				this.anInt2520 = local76 + local76 - this.anInt2520 - 1;
				this.anInt2524 = -this.anInt2524;
			}
			while (this.anInt2520 >= local81) {
				this.anInt2520 = local81 + local81 - this.anInt2520 - 1;
				this.anInt2524 = -this.anInt2524;
				if (this.anInt2520 >= local76) {
					return;
				}
				this.anInt2520 = local76 + local76 - this.anInt2520 - 1;
				this.anInt2524 = -this.anInt2524;
			}
		} else if (this.anInt2524 < 0) {
			if (this.anInt2520 < local76) {
				this.anInt2520 = local81 - (local81 - 1 - this.anInt2520) % local91 - 1;
			}
		} else if (this.anInt2520 >= local81) {
			this.anInt2520 = local76 + (this.anInt2520 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()I")
	public synchronized int method1539() {
		return this.anInt2528 == Integer.MIN_VALUE ? 0 : this.anInt2528;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "()Z")
	public boolean method1540() {
		return this.anInt2527 != 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public synchronized void method1543() {
		this.anInt2524 = (this.anInt2524 ^ this.anInt2524 >> 31) + (this.anInt2524 >>> 31);
		this.anInt2524 = -this.anInt2524;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	public synchronized void method1544(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2520 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	private synchronized void method1547() {
		this.method1561(0, this.method1553());
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()I")
	@Override
	public int method1520() {
		return this.anInt2528 == 0 && this.anInt2527 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
	public synchronized void method1550(@OriginalArg(0) int arg0) {
		if (this.anInt2524 < 0) {
			this.anInt2524 = -arg0;
		} else {
			this.anInt2524 = arg0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
	public synchronized void method1551(@OriginalArg(0) int arg0) {
		this.anInt2525 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()I")
	@Override
	public int method1519() {
		@Pc(6) int local6 = this.anInt2523 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2525 == 0) {
			local6 -= local6 * this.anInt2520 / (((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35.length << 8);
		} else if (this.anInt2525 >= 0) {
			local6 -= local6 * this.anInt2522 / ((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "()I")
	public synchronized int method1552() {
		return this.anInt2524 < 0 ? -this.anInt2524 : this.anInt2524;
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
	public synchronized int method1553() {
		return this.anInt2517 < 0 ? -1 : this.anInt2517;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public Class2_Sub2 method1518() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "()V")
	private void method1556() {
		if (this.anInt2527 == 0) {
			return;
		}
		if (this.anInt2528 == Integer.MIN_VALUE) {
			this.anInt2528 = 0;
		}
		this.anInt2527 = 0;
		this.method1537();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "([IIIII)I")
	private int method1559(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2527 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2527;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2527 += arg1;
			if (this.anInt2524 == 256 && (this.anInt2520 & 0xFF) == 0) {
				if (Static36.aBoolean74) {
					arg1 = Static133.method1549(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, this.anInt2519, this.anInt2518, local7, arg2, this);
				} else {
					arg1 = Static133.method1554(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, this.anInt2529, local7, arg2, this);
				}
			} else if (Static36.aBoolean74) {
				arg1 = Static133.method1532(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, this.anInt2519, this.anInt2518, local7, arg2, this, this.anInt2524, arg4);
			} else {
				arg1 = Static133.method1557(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, this.anInt2529, local7, arg2, this, this.anInt2524, arg4);
			}
			this.anInt2527 -= arg1;
			if (this.anInt2527 != 0) {
				return arg1;
			}
			if (this.anInt2528 == Integer.MIN_VALUE) {
				this.anInt2528 = 0;
				this.anInt2523 = this.anInt2530 = this.anInt2521 = 0;
				this.method1961();
				return arg3;
			}
			this.method1537();
		}
		if (this.anInt2524 == 256 && (this.anInt2520 & 0xFF) == 0) {
			return Static36.aBoolean74 ? Static133.method1535(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, arg3, arg2, this) : Static133.method1527(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, arg3, arg2, this);
		} else if (Static36.aBoolean74) {
			return Static133.method1546(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2530, this.anInt2521, arg3, arg2, this, this.anInt2524, arg4);
		} else {
			return Static133.method1528(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray35, arg0, this.anInt2520, arg1, this.anInt2523, arg3, arg2, this, this.anInt2524, arg4);
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)V")
	private synchronized void method1561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2528 = arg0;
		this.anInt2517 = arg1;
		this.anInt2527 = 0;
		this.method1537();
	}
}
