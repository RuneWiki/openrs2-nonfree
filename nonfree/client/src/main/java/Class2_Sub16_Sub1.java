import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public int anInt1653;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	private int anInt1654;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public int anInt1655;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	private int anInt1658;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	public int anInt1660;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	public int anInt1661;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	public int anInt1662;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	public int anInt1664;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
	private final int anInt1666;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	private final int anInt1657;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Z")
	private final boolean aBoolean67;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
	private int anInt1665;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	private int anInt1656;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	private int anInt1659;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	public int anInt1663;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ke;II)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) Class2_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub14_5 = arg0;
		this.anInt1666 = arg0.anInt1409;
		this.anInt1657 = arg0.anInt1410;
		this.aBoolean67 = arg0.aBoolean55;
		this.anInt1665 = arg1;
		this.anInt1656 = arg2;
		this.anInt1659 = 8192;
		this.anInt1663 = 0;
		this.method1170();
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ke;III)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) Class2_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub14_5 = arg0;
		this.anInt1666 = arg0.anInt1409;
		this.anInt1657 = arg0.anInt1410;
		this.aBoolean67 = arg0.aBoolean55;
		this.anInt1665 = arg1;
		this.anInt1656 = arg2;
		this.anInt1659 = arg3;
		this.anInt1663 = 0;
		this.method1170();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1913(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1656 == 0 && this.anInt1658 == 0) {
			this.method1916(arg2);
			return;
		}
		@Pc(13) Class2_Sub14_Sub1 local13 = (Class2_Sub14_Sub1) super.aClass2_Sub14_5;
		@Pc(18) int local18 = this.anInt1666 << 8;
		@Pc(23) int local23 = this.anInt1657 << 8;
		@Pc(29) int local29 = local13.aByteArray11.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1654 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1663 < 0) {
			if (this.anInt1665 <= 0) {
				this.method1189();
				this.method1930();
				return;
			}
			this.anInt1663 = 0;
		}
		if (this.anInt1663 >= local29) {
			if (this.anInt1665 >= 0) {
				this.method1189();
				this.method1930();
				return;
			}
			this.anInt1663 = local29 - 1;
		}
		if (this.anInt1654 >= 0) {
			if (this.anInt1654 > 0) {
				if (this.aBoolean67) {
					label130: {
						if (this.anInt1665 < 0) {
							local40 = this.method1182(arg0, arg1, local18, local44, local13.aByteArray11[this.anInt1666]);
							if (this.anInt1663 >= local18) {
								return;
							}
							this.anInt1663 = local18 + local18 - this.anInt1663 - 1;
							this.anInt1665 = -this.anInt1665;
							if (--this.anInt1654 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1191(arg0, local40, local23, local44, local13.aByteArray11[this.anInt1657 - 1]);
							if (this.anInt1663 < local23) {
								return;
							}
							this.anInt1663 = local23 + local23 - this.anInt1663 - 1;
							this.anInt1665 = -this.anInt1665;
							if (--this.anInt1654 == 0) {
								break;
							}
							local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray11[this.anInt1666]);
							if (this.anInt1663 >= local18) {
								return;
							}
							this.anInt1663 = local18 + local18 - this.anInt1663 - 1;
							this.anInt1665 = -this.anInt1665;
						} while (--this.anInt1654 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1665 < 0) {
						while (true) {
							local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray11[this.anInt1657 - 1]);
							if (this.anInt1663 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1663 - 1) / local33;
							if (local416 >= this.anInt1654) {
								this.anInt1663 += local33 * this.anInt1654;
								this.anInt1654 = 0;
								break;
							}
							this.anInt1663 += local33 * local416;
							this.anInt1654 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1191(arg0, local40, local23, local44, local13.aByteArray11[this.anInt1666]);
							if (this.anInt1663 < local23) {
								return;
							}
							local416 = (this.anInt1663 - local18) / local33;
							if (local416 >= this.anInt1654) {
								this.anInt1663 -= local33 * this.anInt1654;
								this.anInt1654 = 0;
								break;
							}
							this.anInt1663 -= local33 * local416;
							this.anInt1654 -= local416;
						}
					}
				}
			}
			if (this.anInt1665 < 0) {
				this.method1182(arg0, local40, 0, local44, 0);
				if (this.anInt1663 < 0) {
					this.anInt1663 = -1;
					this.method1189();
					this.method1930();
					return;
				}
			} else {
				this.method1191(arg0, local40, local29, local44, 0);
				if (this.anInt1663 >= local29) {
					this.anInt1663 = local29;
					this.method1189();
					this.method1930();
				}
			}
		} else if (this.aBoolean67) {
			if (this.anInt1665 < 0) {
				local40 = this.method1182(arg0, arg1, local18, local44, local13.aByteArray11[this.anInt1666]);
				if (this.anInt1663 >= local18) {
					return;
				}
				this.anInt1663 = local18 + local18 - this.anInt1663 - 1;
				this.anInt1665 = -this.anInt1665;
			}
			while (true) {
				local40 = this.method1191(arg0, local40, local23, local44, local13.aByteArray11[this.anInt1657 - 1]);
				if (this.anInt1663 < local23) {
					return;
				}
				this.anInt1663 = local23 + local23 - this.anInt1663 - 1;
				this.anInt1665 = -this.anInt1665;
				local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray11[this.anInt1666]);
				if (this.anInt1663 >= local18) {
					return;
				}
				this.anInt1663 = local18 + local18 - this.anInt1663 - 1;
				this.anInt1665 = -this.anInt1665;
			}
		} else if (this.anInt1665 < 0) {
			while (true) {
				local40 = this.method1182(arg0, local40, local18, local44, local13.aByteArray11[this.anInt1657 - 1]);
				if (this.anInt1663 >= local18) {
					return;
				}
				this.anInt1663 = local23 - (local23 - 1 - this.anInt1663) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1191(arg0, local40, local23, local44, local13.aByteArray11[this.anInt1666]);
				if (this.anInt1663 < local23) {
					return;
				}
				this.anInt1663 = local18 + (this.anInt1663 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "()Z")
	public boolean method1164() {
		return this.anInt1663 < 0 || this.anInt1663 >= ((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11.length << 8;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public synchronized void method1168(@OriginalArg(0) int arg0) {
		if (this.anInt1665 < 0) {
			this.anInt1665 = -arg0;
		} else {
			this.anInt1665 = arg0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "()Z")
	private boolean method1169() {
		@Pc(2) int local2 = this.anInt1656;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static134.method1178(local2, this.anInt1659);
			local8 = Static134.method1194(local2, this.anInt1659);
		}
		if (this.anInt1653 != local2 || this.anInt1661 != local10 || this.anInt1660 != local8) {
			if (this.anInt1653 < local2) {
				this.anInt1664 = 1;
				this.anInt1658 = local2 - this.anInt1653;
			} else if (this.anInt1653 > local2) {
				this.anInt1664 = -1;
				this.anInt1658 = this.anInt1653 - local2;
			} else {
				this.anInt1664 = 0;
			}
			if (this.anInt1661 < local10) {
				this.anInt1655 = 1;
				if (this.anInt1658 == 0 || this.anInt1658 > local10 - this.anInt1661) {
					this.anInt1658 = local10 - this.anInt1661;
				}
			} else if (this.anInt1661 > local10) {
				this.anInt1655 = -1;
				if (this.anInt1658 == 0 || this.anInt1658 > this.anInt1661 - local10) {
					this.anInt1658 = this.anInt1661 - local10;
				}
			} else {
				this.anInt1655 = 0;
			}
			if (this.anInt1660 < local8) {
				this.anInt1662 = 1;
				if (this.anInt1658 == 0 || this.anInt1658 > local8 - this.anInt1660) {
					this.anInt1658 = local8 - this.anInt1660;
				}
			} else if (this.anInt1660 > local8) {
				this.anInt1662 = -1;
				if (this.anInt1658 == 0 || this.anInt1658 > this.anInt1660 - local8) {
					this.anInt1658 = this.anInt1660 - local8;
				}
			} else {
				this.anInt1662 = 0;
			}
			return false;
		} else if (this.anInt1656 == Integer.MIN_VALUE) {
			this.anInt1656 = 0;
			this.anInt1653 = this.anInt1661 = this.anInt1660 = 0;
			this.method1930();
			return true;
		} else {
			this.method1170();
			return false;
		}
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "()V")
	private void method1170() {
		this.anInt1653 = this.anInt1656;
		this.anInt1661 = Static134.method1178(this.anInt1656, this.anInt1659);
		this.anInt1660 = Static134.method1194(this.anInt1656, this.anInt1659);
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V")
	public synchronized void method1172(@OriginalArg(0) int arg0) {
		this.method1175(arg0 << 6, this.method1192());
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public synchronized void method1173() {
		this.anInt1665 = (this.anInt1665 ^ this.anInt1665 >> 31) + (this.anInt1665 >>> 31);
		this.anInt1665 = -this.anInt1665;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()Lclient!wc;")
	@Override
	public Class2_Sub16 method1911() {
		return null;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
	@Override
	public int method1914() {
		return this.anInt1656 == 0 && this.anInt1658 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
	@Override
	public int method1910() {
		@Pc(6) int local6 = this.anInt1653 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1654 == 0) {
			local6 -= local6 * this.anInt1663 / (((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11.length << 8);
		} else if (this.anInt1654 >= 0) {
			local6 -= local6 * this.anInt1666 / ((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	public synchronized void method1174(@OriginalArg(0) int arg0) {
		this.anInt1654 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	private synchronized void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1656 = arg0;
		this.anInt1659 = arg1;
		this.anInt1658 = 0;
		this.method1170();
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "()I")
	public synchronized int method1181() {
		return this.anInt1665 < 0 ? -this.anInt1665 : this.anInt1665;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIII)I")
	private int method1182(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1658 <= 0) {
				if (this.anInt1665 == -256 && (this.anInt1663 & 0xFF) == 0) {
					if (Static106.aBoolean99) {
						return Static134.method1201(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, arg3, arg2, this);
					}
					return Static134.method1171(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, arg3, arg2, this);
				}
				if (Static106.aBoolean99) {
					return Static134.method1177(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, arg3, arg2, this, this.anInt1665, arg4);
				}
				return Static134.method1165(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, arg3, arg2, this, this.anInt1665, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1658;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1658 += arg1;
			if (this.anInt1665 == -256 && (this.anInt1663 & 0xFF) == 0) {
				if (Static106.aBoolean99) {
					arg1 = Static134.method1179(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, this.anInt1655, this.anInt1662, local5, arg2, this);
				} else {
					arg1 = Static134.method1193(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, this.anInt1664, local5, arg2, this);
				}
			} else if (Static106.aBoolean99) {
				arg1 = Static134.method1176(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, this.anInt1655, this.anInt1662, local5, arg2, this, this.anInt1665, arg4);
			} else {
				arg1 = Static134.method1167(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, this.anInt1664, local5, arg2, this, this.anInt1665, arg4);
			}
			this.anInt1658 -= arg1;
			if (this.anInt1658 != 0) {
				return arg1;
			}
		} while (!this.method1169());
		return arg3;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()Lclient!wc;")
	@Override
	public Class2_Sub16 method1912() {
		return null;
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "()I")
	public synchronized int method1183() {
		return this.anInt1656 == Integer.MIN_VALUE ? 0 : this.anInt1656;
	}

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "()Z")
	public boolean method1184() {
		return this.anInt1658 != 0;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
	public synchronized void method1185(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1200();
			this.method1930();
		} else if (this.anInt1661 == 0 && this.anInt1660 == 0) {
			this.anInt1658 = 0;
			this.anInt1656 = 0;
			this.anInt1653 = 0;
			this.method1930();
		} else {
			@Pc(31) int local31 = -this.anInt1653;
			if (this.anInt1653 > local31) {
				local31 = this.anInt1653;
			}
			if (-this.anInt1661 > local31) {
				local31 = -this.anInt1661;
			}
			if (this.anInt1661 > local31) {
				local31 = this.anInt1661;
			}
			if (-this.anInt1660 > local31) {
				local31 = -this.anInt1660;
			}
			if (this.anInt1660 > local31) {
				local31 = this.anInt1660;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1658 = arg0;
			this.anInt1656 = Integer.MIN_VALUE;
			this.anInt1664 = -this.anInt1653 / arg0;
			this.anInt1655 = -this.anInt1661 / arg0;
			this.anInt1662 = -this.anInt1660 / arg0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
	public synchronized void method1187(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1663 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "()V")
	private void method1189() {
		if (this.anInt1658 == 0) {
			return;
		}
		if (this.anInt1656 == Integer.MIN_VALUE) {
			this.anInt1656 = 0;
		}
		this.anInt1658 = 0;
		this.method1170();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "([IIIII)I")
	private int method1191(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1658 <= 0) {
				if (this.anInt1665 == 256 && (this.anInt1663 & 0xFF) == 0) {
					if (Static106.aBoolean99) {
						return Static134.method1203(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, arg3, arg2, this);
					}
					return Static134.method1197(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, arg3, arg2, this);
				}
				if (Static106.aBoolean99) {
					return Static134.method1198(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, arg3, arg2, this, this.anInt1665, arg4);
				}
				return Static134.method1188(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, arg3, arg2, this, this.anInt1665, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1658;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1658 += arg1;
			if (this.anInt1665 == 256 && (this.anInt1663 & 0xFF) == 0) {
				if (Static106.aBoolean99) {
					arg1 = Static134.method1196(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, this.anInt1655, this.anInt1662, local5, arg2, this);
				} else {
					arg1 = Static134.method1166(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, this.anInt1664, local5, arg2, this);
				}
			} else if (Static106.aBoolean99) {
				arg1 = Static134.method1180(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1661, this.anInt1660, this.anInt1655, this.anInt1662, local5, arg2, this, this.anInt1665, arg4);
			} else {
				arg1 = Static134.method1199(((Class2_Sub14_Sub1) super.aClass2_Sub14_5).aByteArray11, arg0, this.anInt1663, arg1, this.anInt1653, this.anInt1664, local5, arg2, this, this.anInt1665, arg4);
			}
			this.anInt1658 -= arg1;
			if (this.anInt1658 != 0) {
				return arg1;
			}
		} while (!this.method1169());
		return arg3;
	}

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "()I")
	public synchronized int method1192() {
		return this.anInt1659 < 0 ? -1 : this.anInt1659;
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(II)V")
	public synchronized void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1202(arg0, arg1, this.method1192());
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1916(@OriginalArg(0) int arg0) {
		if (this.anInt1658 > 0) {
			if (arg0 >= this.anInt1658) {
				if (this.anInt1656 == Integer.MIN_VALUE) {
					this.anInt1656 = 0;
					this.anInt1653 = this.anInt1661 = this.anInt1660 = 0;
					this.method1930();
					arg0 = this.anInt1658;
				}
				this.anInt1658 = 0;
				this.method1170();
			} else {
				this.anInt1653 += this.anInt1664 * arg0;
				this.anInt1661 += this.anInt1655 * arg0;
				this.anInt1660 += this.anInt1662 * arg0;
				this.anInt1658 -= arg0;
			}
		}
		@Pc(71) Class2_Sub14_Sub1 local71 = (Class2_Sub14_Sub1) super.aClass2_Sub14_5;
		@Pc(76) int local76 = this.anInt1666 << 8;
		@Pc(81) int local81 = this.anInt1657 << 8;
		@Pc(87) int local87 = local71.aByteArray11.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1654 = 0;
		}
		if (this.anInt1663 < 0) {
			if (this.anInt1665 <= 0) {
				this.method1189();
				this.method1930();
				return;
			}
			this.anInt1663 = 0;
		}
		if (this.anInt1663 >= local87) {
			if (this.anInt1665 >= 0) {
				this.method1189();
				this.method1930();
				return;
			}
			this.anInt1663 = local87 - 1;
		}
		this.anInt1663 += this.anInt1665 * arg0;
		if (this.anInt1654 >= 0) {
			if (this.anInt1654 > 0) {
				if (this.aBoolean67) {
					label125: {
						if (this.anInt1665 < 0) {
							if (this.anInt1663 >= local76) {
								return;
							}
							this.anInt1663 = local76 + local76 - this.anInt1663 - 1;
							this.anInt1665 = -this.anInt1665;
							if (--this.anInt1654 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1663 < local81) {
								return;
							}
							this.anInt1663 = local81 + local81 - this.anInt1663 - 1;
							this.anInt1665 = -this.anInt1665;
							if (--this.anInt1654 == 0) {
								break;
							}
							if (this.anInt1663 >= local76) {
								return;
							}
							this.anInt1663 = local76 + local76 - this.anInt1663 - 1;
							this.anInt1665 = -this.anInt1665;
						} while (--this.anInt1654 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1665 < 0) {
						if (this.anInt1663 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1663 - 1) / local91;
						if (local361 < this.anInt1654) {
							this.anInt1663 += local91 * local361;
							this.anInt1654 -= local361;
							return;
						}
						this.anInt1663 += local91 * this.anInt1654;
						this.anInt1654 = 0;
					} else if (this.anInt1663 >= local81) {
						local361 = (this.anInt1663 - local76) / local91;
						if (local361 < this.anInt1654) {
							this.anInt1663 -= local91 * local361;
							this.anInt1654 -= local361;
							return;
						}
						this.anInt1663 -= local91 * this.anInt1654;
						this.anInt1654 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1665 < 0) {
				if (this.anInt1663 < 0) {
					this.anInt1663 = -1;
					this.method1189();
					this.method1930();
					return;
				}
			} else if (this.anInt1663 >= local87) {
				this.anInt1663 = local87;
				this.method1189();
				this.method1930();
			}
		} else if (this.aBoolean67) {
			if (this.anInt1665 < 0) {
				if (this.anInt1663 >= local76) {
					return;
				}
				this.anInt1663 = local76 + local76 - this.anInt1663 - 1;
				this.anInt1665 = -this.anInt1665;
			}
			while (this.anInt1663 >= local81) {
				this.anInt1663 = local81 + local81 - this.anInt1663 - 1;
				this.anInt1665 = -this.anInt1665;
				if (this.anInt1663 >= local76) {
					return;
				}
				this.anInt1663 = local76 + local76 - this.anInt1663 - 1;
				this.anInt1665 = -this.anInt1665;
			}
		} else if (this.anInt1665 < 0) {
			if (this.anInt1663 < local76) {
				this.anInt1663 = local81 - (local81 - 1 - this.anInt1663) % local91 - 1;
			}
		} else if (this.anInt1663 >= local81) {
			this.anInt1663 = local76 + (this.anInt1663 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V")
	private synchronized void method1200() {
		this.method1175(0, this.method1192());
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public synchronized void method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1175(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static134.method1178(arg1, arg2);
		@Pc(14) int local14 = Static134.method1194(arg1, arg2);
		if (this.anInt1661 == local10 && this.anInt1660 == local14) {
			this.anInt1658 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1653;
		if (this.anInt1653 - arg1 > local31) {
			local31 = this.anInt1653 - arg1;
		}
		if (local10 - this.anInt1661 > local31) {
			local31 = local10 - this.anInt1661;
		}
		if (this.anInt1661 - local10 > local31) {
			local31 = this.anInt1661 - local10;
		}
		if (local14 - this.anInt1660 > local31) {
			local31 = local14 - this.anInt1660;
		}
		if (this.anInt1660 - local14 > local31) {
			local31 = this.anInt1660 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1658 = arg0;
		this.anInt1656 = arg1;
		this.anInt1659 = arg2;
		this.anInt1664 = (arg1 - this.anInt1653) / arg0;
		this.anInt1655 = (local10 - this.anInt1661) / arg0;
		this.anInt1662 = (local14 - this.anInt1660) / arg0;
	}
}
