import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub9_Sub2 extends Class2_Sub9 {

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	private int anInt1657;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public int anInt1659;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
	public int anInt1660;

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
	public int anInt1661;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
	public int anInt1664;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
	public int anInt1667;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
	public int anInt1668;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
	private int anInt1669;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
	private final int anInt1665;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	private final int anInt1656;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "Z")
	private final boolean aBoolean88;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
	private int anInt1663;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
	private int anInt1662;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
	private int anInt1658;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
	public int anInt1666;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!cb;II)V")
	public Class2_Sub9_Sub2(@OriginalArg(0) Class2_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub6_5 = arg0;
		this.anInt1665 = arg0.anInt609;
		this.anInt1656 = arg0.anInt608;
		this.aBoolean88 = arg0.aBoolean33;
		this.anInt1663 = arg1;
		this.anInt1662 = arg2;
		this.anInt1658 = 8192;
		this.anInt1666 = 0;
		this.method1337();
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!cb;III)V")
	public Class2_Sub9_Sub2(@OriginalArg(0) Class2_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub6_5 = arg0;
		this.anInt1665 = arg0.anInt609;
		this.anInt1656 = arg0.anInt608;
		this.aBoolean88 = arg0.aBoolean33;
		this.anInt1663 = arg1;
		this.anInt1662 = arg2;
		this.anInt1658 = arg3;
		this.anInt1666 = 0;
		this.method1337();
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "()Z")
	public boolean method1319() {
		return this.anInt1666 < 0 || this.anInt1666 >= ((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5.length << 8;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	public synchronized void method1320(@OriginalArg(0) int arg0) {
		this.method1354(arg0 << 6, this.method1330());
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "()Lclient!dh;")
	@Override
	public Class2_Sub9 method2468() {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V")
	public synchronized void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1353(arg0, arg1, this.method1330());
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	public synchronized void method1326(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1666 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
	public synchronized void method1327(@OriginalArg(0) int arg0) {
		if (this.anInt1663 < 0) {
			this.anInt1663 = -arg0;
		} else {
			this.anInt1663 = arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public synchronized void method1328(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1348();
			this.method3254();
		} else if (this.anInt1660 == 0 && this.anInt1664 == 0) {
			this.anInt1657 = 0;
			this.anInt1662 = 0;
			this.anInt1668 = 0;
			this.method3254();
		} else {
			@Pc(31) int local31 = -this.anInt1668;
			if (this.anInt1668 > local31) {
				local31 = this.anInt1668;
			}
			if (-this.anInt1660 > local31) {
				local31 = -this.anInt1660;
			}
			if (this.anInt1660 > local31) {
				local31 = this.anInt1660;
			}
			if (-this.anInt1664 > local31) {
				local31 = -this.anInt1664;
			}
			if (this.anInt1664 > local31) {
				local31 = this.anInt1664;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1657 = arg0;
			this.anInt1662 = Integer.MIN_VALUE;
			this.anInt1659 = -this.anInt1668 / arg0;
			this.anInt1661 = -this.anInt1660 / arg0;
			this.anInt1667 = -this.anInt1664 / arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "()Lclient!dh;")
	@Override
	public Class2_Sub9 method2470() {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "()I")
	public synchronized int method1330() {
		return this.anInt1658 < 0 ? -1 : this.anInt1658;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1662 == 0 && this.anInt1657 == 0) {
			this.method2473(arg2);
			return;
		}
		@Pc(13) Class2_Sub6_Sub1 local13 = (Class2_Sub6_Sub1) super.aClass2_Sub6_5;
		@Pc(18) int local18 = this.anInt1665 << 8;
		@Pc(23) int local23 = this.anInt1656 << 8;
		@Pc(29) int local29 = local13.aByteArray5.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1669 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1666 < 0) {
			if (this.anInt1663 <= 0) {
				this.method1341();
				this.method3254();
				return;
			}
			this.anInt1666 = 0;
		}
		if (this.anInt1666 >= local29) {
			if (this.anInt1663 >= 0) {
				this.method1341();
				this.method3254();
				return;
			}
			this.anInt1666 = local29 - 1;
		}
		if (this.anInt1669 >= 0) {
			if (this.anInt1669 > 0) {
				if (this.aBoolean88) {
					label130: {
						if (this.anInt1663 < 0) {
							local40 = this.method1332(arg0, arg1, local18, local44, local13.aByteArray5[this.anInt1665]);
							if (this.anInt1666 >= local18) {
								return;
							}
							this.anInt1666 = local18 + local18 - this.anInt1666 - 1;
							this.anInt1663 = -this.anInt1663;
							if (--this.anInt1669 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1357(arg0, local40, local23, local44, local13.aByteArray5[this.anInt1656 - 1]);
							if (this.anInt1666 < local23) {
								return;
							}
							this.anInt1666 = local23 + local23 - this.anInt1666 - 1;
							this.anInt1663 = -this.anInt1663;
							if (--this.anInt1669 == 0) {
								break;
							}
							local40 = this.method1332(arg0, local40, local18, local44, local13.aByteArray5[this.anInt1665]);
							if (this.anInt1666 >= local18) {
								return;
							}
							this.anInt1666 = local18 + local18 - this.anInt1666 - 1;
							this.anInt1663 = -this.anInt1663;
						} while (--this.anInt1669 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1663 < 0) {
						while (true) {
							local40 = this.method1332(arg0, local40, local18, local44, local13.aByteArray5[this.anInt1656 - 1]);
							if (this.anInt1666 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1666 - 1) / local33;
							if (local416 >= this.anInt1669) {
								this.anInt1666 += local33 * this.anInt1669;
								this.anInt1669 = 0;
								break;
							}
							this.anInt1666 += local33 * local416;
							this.anInt1669 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1357(arg0, local40, local23, local44, local13.aByteArray5[this.anInt1665]);
							if (this.anInt1666 < local23) {
								return;
							}
							local416 = (this.anInt1666 - local18) / local33;
							if (local416 >= this.anInt1669) {
								this.anInt1666 -= local33 * this.anInt1669;
								this.anInt1669 = 0;
								break;
							}
							this.anInt1666 -= local33 * local416;
							this.anInt1669 -= local416;
						}
					}
				}
			}
			if (this.anInt1663 < 0) {
				this.method1332(arg0, local40, 0, local44, 0);
				if (this.anInt1666 < 0) {
					this.anInt1666 = -1;
					this.method1341();
					this.method3254();
					return;
				}
			} else {
				this.method1357(arg0, local40, local29, local44, 0);
				if (this.anInt1666 >= local29) {
					this.anInt1666 = local29;
					this.method1341();
					this.method3254();
				}
			}
		} else if (this.aBoolean88) {
			if (this.anInt1663 < 0) {
				local40 = this.method1332(arg0, arg1, local18, local44, local13.aByteArray5[this.anInt1665]);
				if (this.anInt1666 >= local18) {
					return;
				}
				this.anInt1666 = local18 + local18 - this.anInt1666 - 1;
				this.anInt1663 = -this.anInt1663;
			}
			while (true) {
				local40 = this.method1357(arg0, local40, local23, local44, local13.aByteArray5[this.anInt1656 - 1]);
				if (this.anInt1666 < local23) {
					return;
				}
				this.anInt1666 = local23 + local23 - this.anInt1666 - 1;
				this.anInt1663 = -this.anInt1663;
				local40 = this.method1332(arg0, local40, local18, local44, local13.aByteArray5[this.anInt1665]);
				if (this.anInt1666 >= local18) {
					return;
				}
				this.anInt1666 = local18 + local18 - this.anInt1666 - 1;
				this.anInt1663 = -this.anInt1663;
			}
		} else if (this.anInt1663 < 0) {
			while (true) {
				local40 = this.method1332(arg0, local40, local18, local44, local13.aByteArray5[this.anInt1656 - 1]);
				if (this.anInt1666 >= local18) {
					return;
				}
				this.anInt1666 = local23 - (local23 - 1 - this.anInt1666) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1357(arg0, local40, local23, local44, local13.aByteArray5[this.anInt1665]);
				if (this.anInt1666 < local23) {
					return;
				}
				this.anInt1666 = local18 + (this.anInt1666 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII)I")
	private int method1332(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1657 <= 0) {
				if (this.anInt1663 == -256 && (this.anInt1666 & 0xFF) == 0) {
					if (Static105.aBoolean119) {
						return Static219.method1356(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, arg3, arg2, this);
					}
					return Static219.method1323(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, arg3, arg2, this);
				}
				if (Static105.aBoolean119) {
					return Static219.method1322(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, arg3, arg2, this, this.anInt1663, arg4);
				}
				return Static219.method1324(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, arg3, arg2, this, this.anInt1663, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1657;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1657 += arg1;
			if (this.anInt1663 == -256 && (this.anInt1666 & 0xFF) == 0) {
				if (Static105.aBoolean119) {
					arg1 = Static219.method1340(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, this.anInt1661, this.anInt1667, local5, arg2, this);
				} else {
					arg1 = Static219.method1334(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, this.anInt1659, local5, arg2, this);
				}
			} else if (Static105.aBoolean119) {
				arg1 = Static219.method1355(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, this.anInt1661, this.anInt1667, local5, arg2, this, this.anInt1663, arg4);
			} else {
				arg1 = Static219.method1349(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, this.anInt1659, local5, arg2, this, this.anInt1663, arg4);
			}
			this.anInt1657 -= arg1;
			if (this.anInt1657 != 0) {
				return arg1;
			}
		} while (!this.method1345());
		return arg3;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public synchronized void method1335() {
		this.anInt1663 = (this.anInt1663 ^ this.anInt1663 >> 31) + (this.anInt1663 >>> 31);
		this.anInt1663 = -this.anInt1663;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "()Z")
	public boolean method1336() {
		return this.anInt1657 != 0;
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "()V")
	private void method1337() {
		this.anInt1668 = this.anInt1662;
		this.anInt1660 = Static219.method1318(this.anInt1662, this.anInt1658);
		this.anInt1664 = Static219.method1321(this.anInt1662, this.anInt1658);
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
	private void method1341() {
		if (this.anInt1657 == 0) {
			return;
		}
		if (this.anInt1662 == Integer.MIN_VALUE) {
			this.anInt1662 = 0;
		}
		this.anInt1657 = 0;
		this.method1337();
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "()I")
	@Override
	public int method2472() {
		return this.anInt1662 == 0 && this.anInt1657 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "()I")
	public synchronized int method1342() {
		return this.anInt1663 < 0 ? -this.anInt1663 : this.anInt1663;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
	public synchronized void method1344(@OriginalArg(0) int arg0) {
		this.anInt1669 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "()Z")
	private boolean method1345() {
		@Pc(2) int local2 = this.anInt1662;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static219.method1318(local2, this.anInt1658);
			local8 = Static219.method1321(local2, this.anInt1658);
		}
		if (this.anInt1668 != local2 || this.anInt1660 != local10 || this.anInt1664 != local8) {
			if (this.anInt1668 < local2) {
				this.anInt1659 = 1;
				this.anInt1657 = local2 - this.anInt1668;
			} else if (this.anInt1668 > local2) {
				this.anInt1659 = -1;
				this.anInt1657 = this.anInt1668 - local2;
			} else {
				this.anInt1659 = 0;
			}
			if (this.anInt1660 < local10) {
				this.anInt1661 = 1;
				if (this.anInt1657 == 0 || this.anInt1657 > local10 - this.anInt1660) {
					this.anInt1657 = local10 - this.anInt1660;
				}
			} else if (this.anInt1660 > local10) {
				this.anInt1661 = -1;
				if (this.anInt1657 == 0 || this.anInt1657 > this.anInt1660 - local10) {
					this.anInt1657 = this.anInt1660 - local10;
				}
			} else {
				this.anInt1661 = 0;
			}
			if (this.anInt1664 < local8) {
				this.anInt1667 = 1;
				if (this.anInt1657 == 0 || this.anInt1657 > local8 - this.anInt1664) {
					this.anInt1657 = local8 - this.anInt1664;
				}
			} else if (this.anInt1664 > local8) {
				this.anInt1667 = -1;
				if (this.anInt1657 == 0 || this.anInt1657 > this.anInt1664 - local8) {
					this.anInt1657 = this.anInt1664 - local8;
				}
			} else {
				this.anInt1667 = 0;
			}
			return false;
		} else if (this.anInt1662 == Integer.MIN_VALUE) {
			this.anInt1662 = 0;
			this.anInt1668 = this.anInt1660 = this.anInt1664 = 0;
			this.method3254();
			return true;
		} else {
			this.method1337();
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "()I")
	public synchronized int method1346() {
		return this.anInt1662 == Integer.MIN_VALUE ? 0 : this.anInt1662;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2473(@OriginalArg(0) int arg0) {
		if (this.anInt1657 > 0) {
			if (arg0 >= this.anInt1657) {
				if (this.anInt1662 == Integer.MIN_VALUE) {
					this.anInt1662 = 0;
					this.anInt1668 = this.anInt1660 = this.anInt1664 = 0;
					this.method3254();
					arg0 = this.anInt1657;
				}
				this.anInt1657 = 0;
				this.method1337();
			} else {
				this.anInt1668 += this.anInt1659 * arg0;
				this.anInt1660 += this.anInt1661 * arg0;
				this.anInt1664 += this.anInt1667 * arg0;
				this.anInt1657 -= arg0;
			}
		}
		@Pc(71) Class2_Sub6_Sub1 local71 = (Class2_Sub6_Sub1) super.aClass2_Sub6_5;
		@Pc(76) int local76 = this.anInt1665 << 8;
		@Pc(81) int local81 = this.anInt1656 << 8;
		@Pc(87) int local87 = local71.aByteArray5.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1669 = 0;
		}
		if (this.anInt1666 < 0) {
			if (this.anInt1663 <= 0) {
				this.method1341();
				this.method3254();
				return;
			}
			this.anInt1666 = 0;
		}
		if (this.anInt1666 >= local87) {
			if (this.anInt1663 >= 0) {
				this.method1341();
				this.method3254();
				return;
			}
			this.anInt1666 = local87 - 1;
		}
		this.anInt1666 += this.anInt1663 * arg0;
		if (this.anInt1669 >= 0) {
			if (this.anInt1669 > 0) {
				if (this.aBoolean88) {
					label125: {
						if (this.anInt1663 < 0) {
							if (this.anInt1666 >= local76) {
								return;
							}
							this.anInt1666 = local76 + local76 - this.anInt1666 - 1;
							this.anInt1663 = -this.anInt1663;
							if (--this.anInt1669 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1666 < local81) {
								return;
							}
							this.anInt1666 = local81 + local81 - this.anInt1666 - 1;
							this.anInt1663 = -this.anInt1663;
							if (--this.anInt1669 == 0) {
								break;
							}
							if (this.anInt1666 >= local76) {
								return;
							}
							this.anInt1666 = local76 + local76 - this.anInt1666 - 1;
							this.anInt1663 = -this.anInt1663;
						} while (--this.anInt1669 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1663 < 0) {
						if (this.anInt1666 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1666 - 1) / local91;
						if (local361 < this.anInt1669) {
							this.anInt1666 += local91 * local361;
							this.anInt1669 -= local361;
							return;
						}
						this.anInt1666 += local91 * this.anInt1669;
						this.anInt1669 = 0;
					} else if (this.anInt1666 >= local81) {
						local361 = (this.anInt1666 - local76) / local91;
						if (local361 < this.anInt1669) {
							this.anInt1666 -= local91 * local361;
							this.anInt1669 -= local361;
							return;
						}
						this.anInt1666 -= local91 * this.anInt1669;
						this.anInt1669 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1663 < 0) {
				if (this.anInt1666 < 0) {
					this.anInt1666 = -1;
					this.method1341();
					this.method3254();
					return;
				}
			} else if (this.anInt1666 >= local87) {
				this.anInt1666 = local87;
				this.method1341();
				this.method3254();
			}
		} else if (this.aBoolean88) {
			if (this.anInt1663 < 0) {
				if (this.anInt1666 >= local76) {
					return;
				}
				this.anInt1666 = local76 + local76 - this.anInt1666 - 1;
				this.anInt1663 = -this.anInt1663;
			}
			while (this.anInt1666 >= local81) {
				this.anInt1666 = local81 + local81 - this.anInt1666 - 1;
				this.anInt1663 = -this.anInt1663;
				if (this.anInt1666 >= local76) {
					return;
				}
				this.anInt1666 = local76 + local76 - this.anInt1666 - 1;
				this.anInt1663 = -this.anInt1663;
			}
		} else if (this.anInt1663 < 0) {
			if (this.anInt1666 < local76) {
				this.anInt1666 = local81 - (local81 - 1 - this.anInt1666) % local91 - 1;
			}
		} else if (this.anInt1666 >= local81) {
			this.anInt1666 = local76 + (this.anInt1666 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "()I")
	@Override
	public int method2469() {
		@Pc(6) int local6 = this.anInt1668 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1669 == 0) {
			local6 -= local6 * this.anInt1666 / (((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5.length << 8);
		} else if (this.anInt1669 >= 0) {
			local6 -= local6 * this.anInt1665 / ((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
	private synchronized void method1348() {
		this.method1354(0, this.method1330());
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public synchronized void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1354(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static219.method1318(arg1, arg2);
		@Pc(14) int local14 = Static219.method1321(arg1, arg2);
		if (this.anInt1660 == local10 && this.anInt1664 == local14) {
			this.anInt1657 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1668;
		if (this.anInt1668 - arg1 > local31) {
			local31 = this.anInt1668 - arg1;
		}
		if (local10 - this.anInt1660 > local31) {
			local31 = local10 - this.anInt1660;
		}
		if (this.anInt1660 - local10 > local31) {
			local31 = this.anInt1660 - local10;
		}
		if (local14 - this.anInt1664 > local31) {
			local31 = local14 - this.anInt1664;
		}
		if (this.anInt1664 - local14 > local31) {
			local31 = this.anInt1664 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1657 = arg0;
		this.anInt1662 = arg1;
		this.anInt1658 = arg2;
		this.anInt1659 = (arg1 - this.anInt1668) / arg0;
		this.anInt1661 = (local10 - this.anInt1660) / arg0;
		this.anInt1667 = (local14 - this.anInt1664) / arg0;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)V")
	private synchronized void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1662 = arg0;
		this.anInt1658 = arg1;
		this.anInt1657 = 0;
		this.method1337();
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "([IIIII)I")
	private int method1357(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1657 <= 0) {
				if (this.anInt1663 == 256 && (this.anInt1666 & 0xFF) == 0) {
					if (Static105.aBoolean119) {
						return Static219.method1347(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, arg3, arg2, this);
					}
					return Static219.method1351(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, arg3, arg2, this);
				}
				if (Static105.aBoolean119) {
					return Static219.method1352(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, arg3, arg2, this, this.anInt1663, arg4);
				}
				return Static219.method1339(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, arg3, arg2, this, this.anInt1663, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1657;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1657 += arg1;
			if (this.anInt1663 == 256 && (this.anInt1666 & 0xFF) == 0) {
				if (Static105.aBoolean119) {
					arg1 = Static219.method1343(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, this.anInt1661, this.anInt1667, local5, arg2, this);
				} else {
					arg1 = Static219.method1350(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, this.anInt1659, local5, arg2, this);
				}
			} else if (Static105.aBoolean119) {
				arg1 = Static219.method1331(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1660, this.anInt1664, this.anInt1661, this.anInt1667, local5, arg2, this, this.anInt1663, arg4);
			} else {
				arg1 = Static219.method1338(((Class2_Sub6_Sub1) super.aClass2_Sub6_5).aByteArray5, arg0, this.anInt1666, arg1, this.anInt1668, this.anInt1659, local5, arg2, this, this.anInt1663, arg4);
			}
			this.anInt1657 -= arg1;
			if (this.anInt1657 != 0) {
				return arg1;
			}
		} while (!this.method1345());
		return arg3;
	}
}
