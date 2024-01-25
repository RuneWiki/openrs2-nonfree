import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	private int anInt1564;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	public int anInt1567;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	public int anInt1568;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	public int anInt1569;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	public int anInt1571;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
	public int anInt1574;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
	public int anInt1575;

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
	private final int anInt1570;

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
	private final int anInt1572;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "Z")
	private final boolean aBoolean137;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	private int anInt1577;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
	private int anInt1576;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	private int anInt1565;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	public int anInt1566;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!eg;II)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub12_5 = arg0;
		this.anInt1570 = arg0.anInt1551;
		this.anInt1572 = arg0.anInt1552;
		this.aBoolean137 = arg0.aBoolean134;
		this.anInt1577 = arg1;
		this.anInt1576 = arg2;
		this.anInt1565 = 8192;
		this.anInt1566 = 0;
		this.method1528();
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!eg;III)V")
	public Class1_Sub6_Sub3(@OriginalArg(0) Class1_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub12_5 = arg0;
		this.anInt1570 = arg0.anInt1551;
		this.anInt1572 = arg0.anInt1552;
		this.aBoolean137 = arg0.aBoolean134;
		this.anInt1577 = arg1;
		this.anInt1576 = arg2;
		this.anInt1565 = arg3;
		this.anInt1566 = 0;
		this.method1528();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	public synchronized void method1499(@OriginalArg(0) int arg0) {
		if (this.anInt1577 < 0) {
			this.anInt1577 = -arg0;
		} else {
			this.anInt1577 = arg0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()I")
	public synchronized int method1500() {
		return this.anInt1577 < 0 ? -this.anInt1577 : this.anInt1577;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "()Z")
	private boolean method1501() {
		@Pc(2) int local2 = this.anInt1576;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static357.method1510(local2, this.anInt1565);
			local8 = Static357.method1517(local2, this.anInt1565);
		}
		if (this.anInt1569 != local2 || this.anInt1567 != local10 || this.anInt1575 != local8) {
			if (this.anInt1569 < local2) {
				this.anInt1574 = 1;
				this.anInt1564 = local2 - this.anInt1569;
			} else if (this.anInt1569 > local2) {
				this.anInt1574 = -1;
				this.anInt1564 = this.anInt1569 - local2;
			} else {
				this.anInt1574 = 0;
			}
			if (this.anInt1567 < local10) {
				this.anInt1568 = 1;
				if (this.anInt1564 == 0 || this.anInt1564 > local10 - this.anInt1567) {
					this.anInt1564 = local10 - this.anInt1567;
				}
			} else if (this.anInt1567 > local10) {
				this.anInt1568 = -1;
				if (this.anInt1564 == 0 || this.anInt1564 > this.anInt1567 - local10) {
					this.anInt1564 = this.anInt1567 - local10;
				}
			} else {
				this.anInt1568 = 0;
			}
			if (this.anInt1575 < local8) {
				this.anInt1571 = 1;
				if (this.anInt1564 == 0 || this.anInt1564 > local8 - this.anInt1575) {
					this.anInt1564 = local8 - this.anInt1575;
				}
			} else if (this.anInt1575 > local8) {
				this.anInt1571 = -1;
				if (this.anInt1564 == 0 || this.anInt1564 > this.anInt1575 - local8) {
					this.anInt1564 = this.anInt1575 - local8;
				}
			} else {
				this.anInt1571 = 0;
			}
			return false;
		} else if (this.anInt1576 == Integer.MIN_VALUE) {
			this.anInt1576 = 0;
			this.anInt1569 = this.anInt1567 = this.anInt1575 = 0;
			this.method5710();
			return true;
		} else {
			this.method1528();
			return false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	public synchronized void method1503(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1514();
			this.method5710();
		} else if (this.anInt1567 == 0 && this.anInt1575 == 0) {
			this.anInt1564 = 0;
			this.anInt1576 = 0;
			this.anInt1569 = 0;
			this.method5710();
		} else {
			@Pc(31) int local31 = -this.anInt1569;
			if (this.anInt1569 > local31) {
				local31 = this.anInt1569;
			}
			if (-this.anInt1567 > local31) {
				local31 = -this.anInt1567;
			}
			if (this.anInt1567 > local31) {
				local31 = this.anInt1567;
			}
			if (-this.anInt1575 > local31) {
				local31 = -this.anInt1575;
			}
			if (this.anInt1575 > local31) {
				local31 = this.anInt1575;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1564 = arg0;
			this.anInt1576 = Integer.MIN_VALUE;
			this.anInt1574 = -this.anInt1569 / arg0;
			this.anInt1568 = -this.anInt1567 / arg0;
			this.anInt1571 = -this.anInt1575 / arg0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
	@Override
	public int method1659() {
		return this.anInt1576 == 0 && this.anInt1564 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "()I")
	public synchronized int method1504() {
		return this.anInt1565 < 0 ? -1 : this.anInt1565;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1576 == 0 && this.anInt1564 == 0) {
			this.method1661(arg2);
			return;
		}
		@Pc(13) Class1_Sub12_Sub1 local13 = (Class1_Sub12_Sub1) super.aClass1_Sub12_5;
		@Pc(18) int local18 = this.anInt1570 << 8;
		@Pc(23) int local23 = this.anInt1572 << 8;
		@Pc(29) int local29 = local13.aByteArray22.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1573 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1566 < 0) {
			if (this.anInt1577 <= 0) {
				this.method1523();
				this.method5710();
				return;
			}
			this.anInt1566 = 0;
		}
		if (this.anInt1566 >= local29) {
			if (this.anInt1577 >= 0) {
				this.method1523();
				this.method5710();
				return;
			}
			this.anInt1566 = local29 - 1;
		}
		if (this.anInt1573 >= 0) {
			if (this.anInt1573 > 0) {
				if (this.aBoolean137) {
					label130: {
						if (this.anInt1577 < 0) {
							local40 = this.method1524(arg0, arg1, local18, local44, local13.aByteArray22[this.anInt1570]);
							if (this.anInt1566 >= local18) {
								return;
							}
							this.anInt1566 = local18 + local18 - this.anInt1566 - 1;
							this.anInt1577 = -this.anInt1577;
							if (--this.anInt1573 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1535(arg0, local40, local23, local44, local13.aByteArray22[this.anInt1572 - 1]);
							if (this.anInt1566 < local23) {
								return;
							}
							this.anInt1566 = local23 + local23 - this.anInt1566 - 1;
							this.anInt1577 = -this.anInt1577;
							if (--this.anInt1573 == 0) {
								break;
							}
							local40 = this.method1524(arg0, local40, local18, local44, local13.aByteArray22[this.anInt1570]);
							if (this.anInt1566 >= local18) {
								return;
							}
							this.anInt1566 = local18 + local18 - this.anInt1566 - 1;
							this.anInt1577 = -this.anInt1577;
						} while (--this.anInt1573 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1577 < 0) {
						while (true) {
							local40 = this.method1524(arg0, local40, local18, local44, local13.aByteArray22[this.anInt1572 - 1]);
							if (this.anInt1566 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1566 - 1) / local33;
							if (local416 >= this.anInt1573) {
								this.anInt1566 += local33 * this.anInt1573;
								this.anInt1573 = 0;
								break;
							}
							this.anInt1566 += local33 * local416;
							this.anInt1573 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1535(arg0, local40, local23, local44, local13.aByteArray22[this.anInt1570]);
							if (this.anInt1566 < local23) {
								return;
							}
							local416 = (this.anInt1566 - local18) / local33;
							if (local416 >= this.anInt1573) {
								this.anInt1566 -= local33 * this.anInt1573;
								this.anInt1573 = 0;
								break;
							}
							this.anInt1566 -= local33 * local416;
							this.anInt1573 -= local416;
						}
					}
				}
			}
			if (this.anInt1577 < 0) {
				this.method1524(arg0, local40, 0, local44, 0);
				if (this.anInt1566 < 0) {
					this.anInt1566 = -1;
					this.method1523();
					this.method5710();
					return;
				}
			} else {
				this.method1535(arg0, local40, local29, local44, 0);
				if (this.anInt1566 >= local29) {
					this.anInt1566 = local29;
					this.method1523();
					this.method5710();
				}
			}
		} else if (this.aBoolean137) {
			if (this.anInt1577 < 0) {
				local40 = this.method1524(arg0, arg1, local18, local44, local13.aByteArray22[this.anInt1570]);
				if (this.anInt1566 >= local18) {
					return;
				}
				this.anInt1566 = local18 + local18 - this.anInt1566 - 1;
				this.anInt1577 = -this.anInt1577;
			}
			while (true) {
				local40 = this.method1535(arg0, local40, local23, local44, local13.aByteArray22[this.anInt1572 - 1]);
				if (this.anInt1566 < local23) {
					return;
				}
				this.anInt1566 = local23 + local23 - this.anInt1566 - 1;
				this.anInt1577 = -this.anInt1577;
				local40 = this.method1524(arg0, local40, local18, local44, local13.aByteArray22[this.anInt1570]);
				if (this.anInt1566 >= local18) {
					return;
				}
				this.anInt1566 = local18 + local18 - this.anInt1566 - 1;
				this.anInt1577 = -this.anInt1577;
			}
		} else if (this.anInt1577 < 0) {
			while (true) {
				local40 = this.method1524(arg0, local40, local18, local44, local13.aByteArray22[this.anInt1572 - 1]);
				if (this.anInt1566 >= local18) {
					return;
				}
				this.anInt1566 = local23 - (local23 - 1 - this.anInt1566) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1535(arg0, local40, local23, local44, local13.aByteArray22[this.anInt1570]);
				if (this.anInt1566 < local23) {
					return;
				}
				this.anInt1566 = local18 + (this.anInt1566 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	private synchronized void method1505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1576 = arg0;
		this.anInt1565 = arg1;
		this.anInt1564 = 0;
		this.method1528();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()Lclient!pn;")
	@Override
	public Class1_Sub6 method1664() {
		return null;
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "()Z")
	public boolean method1512() {
		return this.anInt1564 != 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public synchronized void method1513() {
		this.anInt1577 = (this.anInt1577 ^ this.anInt1577 >> 31) + (this.anInt1577 >>> 31);
		this.anInt1577 = -this.anInt1577;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	private synchronized void method1514() {
		this.method1505(0, this.method1504());
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public Class1_Sub6 method1660() {
		return null;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
	public synchronized void method1516(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1566 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "()Z")
	public boolean method1518() {
		return this.anInt1566 < 0 || this.anInt1566 >= ((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22.length << 8;
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V")
	public synchronized void method1519(@OriginalArg(0) int arg0) {
		this.method1505(arg0 << 6, this.method1504());
	}

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "()I")
	public synchronized int method1520() {
		return this.anInt1576 == Integer.MIN_VALUE ? 0 : this.anInt1576;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(II)V")
	public synchronized void method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1534(arg0, arg1, this.method1504());
	}

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "()V")
	private void method1523() {
		if (this.anInt1564 == 0) {
			return;
		}
		if (this.anInt1576 == Integer.MIN_VALUE) {
			this.anInt1576 = 0;
		}
		this.anInt1564 = 0;
		this.method1528();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIIII)I")
	private int method1524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1564 <= 0) {
				if (this.anInt1577 == -256 && (this.anInt1566 & 0xFF) == 0) {
					if (Static111.aBoolean191) {
						return Static357.method1508(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, arg3, arg2, this);
					}
					return Static357.method1509(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, arg3, arg2, this);
				}
				if (Static111.aBoolean191) {
					return Static357.method1532(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, arg3, arg2, this, this.anInt1577, arg4);
				}
				return Static357.method1529(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, arg3, arg2, this, this.anInt1577, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1564;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1564 += arg1;
			if (this.anInt1577 == -256 && (this.anInt1566 & 0xFF) == 0) {
				if (Static111.aBoolean191) {
					arg1 = Static357.method1531(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, this.anInt1568, this.anInt1571, local5, arg2, this);
				} else {
					arg1 = Static357.method1533(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, this.anInt1574, local5, arg2, this);
				}
			} else if (Static111.aBoolean191) {
				arg1 = Static357.method1527(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, this.anInt1568, this.anInt1571, local5, arg2, this, this.anInt1577, arg4);
			} else {
				arg1 = Static357.method1506(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, this.anInt1574, local5, arg2, this, this.anInt1577, arg4);
			}
			this.anInt1564 -= arg1;
			if (this.anInt1564 != 0) {
				return arg1;
			}
		} while (!this.method1501());
		return arg3;
	}

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "(I)V")
	public synchronized void method1526(@OriginalArg(0) int arg0) {
		this.anInt1573 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()I")
	@Override
	public int method1662() {
		@Pc(6) int local6 = this.anInt1569 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1573 == 0) {
			local6 -= local6 * this.anInt1566 / (((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22.length << 8);
		} else if (this.anInt1573 >= 0) {
			local6 -= local6 * this.anInt1570 / ((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "()V")
	private void method1528() {
		this.anInt1569 = this.anInt1576;
		this.anInt1567 = Static357.method1510(this.anInt1576, this.anInt1565);
		this.anInt1575 = Static357.method1517(this.anInt1576, this.anInt1565);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
	public synchronized void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1505(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static357.method1510(arg1, arg2);
		@Pc(14) int local14 = Static357.method1517(arg1, arg2);
		if (this.anInt1567 == local10 && this.anInt1575 == local14) {
			this.anInt1564 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1569;
		if (this.anInt1569 - arg1 > local31) {
			local31 = this.anInt1569 - arg1;
		}
		if (local10 - this.anInt1567 > local31) {
			local31 = local10 - this.anInt1567;
		}
		if (this.anInt1567 - local10 > local31) {
			local31 = this.anInt1567 - local10;
		}
		if (local14 - this.anInt1575 > local31) {
			local31 = local14 - this.anInt1575;
		}
		if (this.anInt1575 - local14 > local31) {
			local31 = this.anInt1575 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1564 = arg0;
		this.anInt1576 = arg1;
		this.anInt1565 = arg2;
		this.anInt1574 = (arg1 - this.anInt1569) / arg0;
		this.anInt1568 = (local10 - this.anInt1567) / arg0;
		this.anInt1571 = (local14 - this.anInt1575) / arg0;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1661(@OriginalArg(0) int arg0) {
		if (this.anInt1564 > 0) {
			if (arg0 >= this.anInt1564) {
				if (this.anInt1576 == Integer.MIN_VALUE) {
					this.anInt1576 = 0;
					this.anInt1569 = this.anInt1567 = this.anInt1575 = 0;
					this.method5710();
					arg0 = this.anInt1564;
				}
				this.anInt1564 = 0;
				this.method1528();
			} else {
				this.anInt1569 += this.anInt1574 * arg0;
				this.anInt1567 += this.anInt1568 * arg0;
				this.anInt1575 += this.anInt1571 * arg0;
				this.anInt1564 -= arg0;
			}
		}
		@Pc(71) Class1_Sub12_Sub1 local71 = (Class1_Sub12_Sub1) super.aClass1_Sub12_5;
		@Pc(76) int local76 = this.anInt1570 << 8;
		@Pc(81) int local81 = this.anInt1572 << 8;
		@Pc(87) int local87 = local71.aByteArray22.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1573 = 0;
		}
		if (this.anInt1566 < 0) {
			if (this.anInt1577 <= 0) {
				this.method1523();
				this.method5710();
				return;
			}
			this.anInt1566 = 0;
		}
		if (this.anInt1566 >= local87) {
			if (this.anInt1577 >= 0) {
				this.method1523();
				this.method5710();
				return;
			}
			this.anInt1566 = local87 - 1;
		}
		this.anInt1566 += this.anInt1577 * arg0;
		if (this.anInt1573 >= 0) {
			if (this.anInt1573 > 0) {
				if (this.aBoolean137) {
					label125: {
						if (this.anInt1577 < 0) {
							if (this.anInt1566 >= local76) {
								return;
							}
							this.anInt1566 = local76 + local76 - this.anInt1566 - 1;
							this.anInt1577 = -this.anInt1577;
							if (--this.anInt1573 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1566 < local81) {
								return;
							}
							this.anInt1566 = local81 + local81 - this.anInt1566 - 1;
							this.anInt1577 = -this.anInt1577;
							if (--this.anInt1573 == 0) {
								break;
							}
							if (this.anInt1566 >= local76) {
								return;
							}
							this.anInt1566 = local76 + local76 - this.anInt1566 - 1;
							this.anInt1577 = -this.anInt1577;
						} while (--this.anInt1573 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1577 < 0) {
						if (this.anInt1566 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1566 - 1) / local91;
						if (local361 < this.anInt1573) {
							this.anInt1566 += local91 * local361;
							this.anInt1573 -= local361;
							return;
						}
						this.anInt1566 += local91 * this.anInt1573;
						this.anInt1573 = 0;
					} else if (this.anInt1566 >= local81) {
						local361 = (this.anInt1566 - local76) / local91;
						if (local361 < this.anInt1573) {
							this.anInt1566 -= local91 * local361;
							this.anInt1573 -= local361;
							return;
						}
						this.anInt1566 -= local91 * this.anInt1573;
						this.anInt1573 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1577 < 0) {
				if (this.anInt1566 < 0) {
					this.anInt1566 = -1;
					this.method1523();
					this.method5710();
					return;
				}
			} else if (this.anInt1566 >= local87) {
				this.anInt1566 = local87;
				this.method1523();
				this.method5710();
			}
		} else if (this.aBoolean137) {
			if (this.anInt1577 < 0) {
				if (this.anInt1566 >= local76) {
					return;
				}
				this.anInt1566 = local76 + local76 - this.anInt1566 - 1;
				this.anInt1577 = -this.anInt1577;
			}
			while (this.anInt1566 >= local81) {
				this.anInt1566 = local81 + local81 - this.anInt1566 - 1;
				this.anInt1577 = -this.anInt1577;
				if (this.anInt1566 >= local76) {
					return;
				}
				this.anInt1566 = local76 + local76 - this.anInt1566 - 1;
				this.anInt1577 = -this.anInt1577;
			}
		} else if (this.anInt1577 < 0) {
			if (this.anInt1566 < local76) {
				this.anInt1566 = local81 - (local81 - 1 - this.anInt1566) % local91 - 1;
			}
		} else if (this.anInt1566 >= local81) {
			this.anInt1566 = local76 + (this.anInt1566 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "([IIIII)I")
	private int method1535(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1564 <= 0) {
				if (this.anInt1577 == 256 && (this.anInt1566 & 0xFF) == 0) {
					if (Static111.aBoolean191) {
						return Static357.method1536(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, arg3, arg2, this);
					}
					return Static357.method1525(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, arg3, arg2, this);
				}
				if (Static111.aBoolean191) {
					return Static357.method1522(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, arg3, arg2, this, this.anInt1577, arg4);
				}
				return Static357.method1515(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, arg3, arg2, this, this.anInt1577, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1564;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1564 += arg1;
			if (this.anInt1577 == 256 && (this.anInt1566 & 0xFF) == 0) {
				if (Static111.aBoolean191) {
					arg1 = Static357.method1511(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, this.anInt1568, this.anInt1571, local5, arg2, this);
				} else {
					arg1 = Static357.method1507(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, this.anInt1574, local5, arg2, this);
				}
			} else if (Static111.aBoolean191) {
				arg1 = Static357.method1497(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1567, this.anInt1575, this.anInt1568, this.anInt1571, local5, arg2, this, this.anInt1577, arg4);
			} else {
				arg1 = Static357.method1502(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray22, arg0, this.anInt1566, arg1, this.anInt1569, this.anInt1574, local5, arg2, this, this.anInt1577, arg4);
			}
			this.anInt1564 -= arg1;
			if (this.anInt1564 != 0) {
				return arg1;
			}
		} while (!this.method1501());
		return arg3;
	}
}
