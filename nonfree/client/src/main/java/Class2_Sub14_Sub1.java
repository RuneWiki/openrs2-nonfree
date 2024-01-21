import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	private int anInt1711;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	public int anInt1714;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	public int anInt1716;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt1718;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public int anInt1721;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private final int anInt1719;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	private final int anInt1722;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	private int anInt1724;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt1717;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private int anInt1715;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	public int anInt1712;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!k;II)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt1719 = arg0.anInt1820;
		this.anInt1722 = arg0.anInt1821;
		this.aBoolean74 = arg0.aBoolean78;
		this.anInt1724 = arg1;
		this.anInt1717 = arg2;
		this.anInt1715 = 8192;
		this.anInt1712 = 0;
		this.method1378();
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!k;III)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt1719 = arg0.anInt1820;
		this.anInt1722 = arg0.anInt1821;
		this.aBoolean74 = arg0.aBoolean78;
		this.anInt1724 = arg1;
		this.anInt1717 = arg2;
		this.anInt1715 = arg3;
		this.anInt1712 = 0;
		this.method1378();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public synchronized void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1369(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static188.method1372(arg1, arg2);
		@Pc(14) int local14 = Static188.method1350(arg1, arg2);
		if (this.anInt1714 == local10 && this.anInt1721 == local14) {
			this.anInt1718 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1716;
		if (this.anInt1716 - arg1 > local31) {
			local31 = this.anInt1716 - arg1;
		}
		if (local10 - this.anInt1714 > local31) {
			local31 = local10 - this.anInt1714;
		}
		if (this.anInt1714 - local10 > local31) {
			local31 = this.anInt1714 - local10;
		}
		if (local14 - this.anInt1721 > local31) {
			local31 = local14 - this.anInt1721;
		}
		if (this.anInt1721 - local14 > local31) {
			local31 = this.anInt1721 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1718 = arg0;
		this.anInt1717 = arg1;
		this.anInt1715 = arg2;
		this.anInt1713 = (arg1 - this.anInt1716) / arg0;
		this.anInt1720 = (local10 - this.anInt1714) / arg0;
		this.anInt1723 = (local14 - this.anInt1721) / arg0;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()I")
	public synchronized int method1347() {
		return this.anInt1724 < 0 ? -this.anInt1724 : this.anInt1724;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public synchronized void method1349(@OriginalArg(0) int arg0) {
		this.anInt1711 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public synchronized void method1352(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1712 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()Lclient!kc;")
	@Override
	public Class2_Sub14 method2586() {
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()Z")
	public boolean method1354() {
		return this.anInt1712 < 0 || this.anInt1712 >= ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25.length << 8;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	public synchronized void method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1346(arg0, arg1, this.method1366());
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public synchronized void method1356(@OriginalArg(0) int arg0) {
		if (this.anInt1724 < 0) {
			this.anInt1724 = -arg0;
		} else {
			this.anInt1724 = arg0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public synchronized void method1358(@OriginalArg(0) int arg0) {
		this.method1369(arg0 << 6, this.method1366());
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1717 == 0 && this.anInt1718 == 0) {
			this.method2587(arg2);
			return;
		}
		@Pc(13) Class2_Sub5_Sub1 local13 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(18) int local18 = this.anInt1719 << 8;
		@Pc(23) int local23 = this.anInt1722 << 8;
		@Pc(29) int local29 = local13.aByteArray25.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1711 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1712 < 0) {
			if (this.anInt1724 <= 0) {
				this.method1362();
				this.method3007();
				return;
			}
			this.anInt1712 = 0;
		}
		if (this.anInt1712 >= local29) {
			if (this.anInt1724 >= 0) {
				this.method1362();
				this.method3007();
				return;
			}
			this.anInt1712 = local29 - 1;
		}
		if (this.anInt1711 >= 0) {
			if (this.anInt1711 > 0) {
				if (this.aBoolean74) {
					label130: {
						if (this.anInt1724 < 0) {
							local40 = this.method1376(arg0, arg1, local18, local44, local13.aByteArray25[this.anInt1719]);
							if (this.anInt1712 >= local18) {
								return;
							}
							this.anInt1712 = local18 + local18 - this.anInt1712 - 1;
							this.anInt1724 = -this.anInt1724;
							if (--this.anInt1711 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1377(arg0, local40, local23, local44, local13.aByteArray25[this.anInt1722 - 1]);
							if (this.anInt1712 < local23) {
								return;
							}
							this.anInt1712 = local23 + local23 - this.anInt1712 - 1;
							this.anInt1724 = -this.anInt1724;
							if (--this.anInt1711 == 0) {
								break;
							}
							local40 = this.method1376(arg0, local40, local18, local44, local13.aByteArray25[this.anInt1719]);
							if (this.anInt1712 >= local18) {
								return;
							}
							this.anInt1712 = local18 + local18 - this.anInt1712 - 1;
							this.anInt1724 = -this.anInt1724;
						} while (--this.anInt1711 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1724 < 0) {
						while (true) {
							local40 = this.method1376(arg0, local40, local18, local44, local13.aByteArray25[this.anInt1722 - 1]);
							if (this.anInt1712 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1712 - 1) / local33;
							if (local416 >= this.anInt1711) {
								this.anInt1712 += local33 * this.anInt1711;
								this.anInt1711 = 0;
								break;
							}
							this.anInt1712 += local33 * local416;
							this.anInt1711 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1377(arg0, local40, local23, local44, local13.aByteArray25[this.anInt1719]);
							if (this.anInt1712 < local23) {
								return;
							}
							local416 = (this.anInt1712 - local18) / local33;
							if (local416 >= this.anInt1711) {
								this.anInt1712 -= local33 * this.anInt1711;
								this.anInt1711 = 0;
								break;
							}
							this.anInt1712 -= local33 * local416;
							this.anInt1711 -= local416;
						}
					}
				}
			}
			if (this.anInt1724 < 0) {
				this.method1376(arg0, local40, 0, local44, 0);
				if (this.anInt1712 < 0) {
					this.anInt1712 = -1;
					this.method1362();
					this.method3007();
					return;
				}
			} else {
				this.method1377(arg0, local40, local29, local44, 0);
				if (this.anInt1712 >= local29) {
					this.anInt1712 = local29;
					this.method1362();
					this.method3007();
				}
			}
		} else if (this.aBoolean74) {
			if (this.anInt1724 < 0) {
				local40 = this.method1376(arg0, arg1, local18, local44, local13.aByteArray25[this.anInt1719]);
				if (this.anInt1712 >= local18) {
					return;
				}
				this.anInt1712 = local18 + local18 - this.anInt1712 - 1;
				this.anInt1724 = -this.anInt1724;
			}
			while (true) {
				local40 = this.method1377(arg0, local40, local23, local44, local13.aByteArray25[this.anInt1722 - 1]);
				if (this.anInt1712 < local23) {
					return;
				}
				this.anInt1712 = local23 + local23 - this.anInt1712 - 1;
				this.anInt1724 = -this.anInt1724;
				local40 = this.method1376(arg0, local40, local18, local44, local13.aByteArray25[this.anInt1719]);
				if (this.anInt1712 >= local18) {
					return;
				}
				this.anInt1712 = local18 + local18 - this.anInt1712 - 1;
				this.anInt1724 = -this.anInt1724;
			}
		} else if (this.anInt1724 < 0) {
			while (true) {
				local40 = this.method1376(arg0, local40, local18, local44, local13.aByteArray25[this.anInt1722 - 1]);
				if (this.anInt1712 >= local18) {
					return;
				}
				this.anInt1712 = local23 - (local23 - 1 - this.anInt1712) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1377(arg0, local40, local23, local44, local13.aByteArray25[this.anInt1719]);
				if (this.anInt1712 < local23) {
					return;
				}
				this.anInt1712 = local18 + (this.anInt1712 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2587(@OriginalArg(0) int arg0) {
		if (this.anInt1718 > 0) {
			if (arg0 >= this.anInt1718) {
				if (this.anInt1717 == Integer.MIN_VALUE) {
					this.anInt1717 = 0;
					this.anInt1716 = this.anInt1714 = this.anInt1721 = 0;
					this.method3007();
					arg0 = this.anInt1718;
				}
				this.anInt1718 = 0;
				this.method1378();
			} else {
				this.anInt1716 += this.anInt1713 * arg0;
				this.anInt1714 += this.anInt1720 * arg0;
				this.anInt1721 += this.anInt1723 * arg0;
				this.anInt1718 -= arg0;
			}
		}
		@Pc(71) Class2_Sub5_Sub1 local71 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(76) int local76 = this.anInt1719 << 8;
		@Pc(81) int local81 = this.anInt1722 << 8;
		@Pc(87) int local87 = local71.aByteArray25.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1711 = 0;
		}
		if (this.anInt1712 < 0) {
			if (this.anInt1724 <= 0) {
				this.method1362();
				this.method3007();
				return;
			}
			this.anInt1712 = 0;
		}
		if (this.anInt1712 >= local87) {
			if (this.anInt1724 >= 0) {
				this.method1362();
				this.method3007();
				return;
			}
			this.anInt1712 = local87 - 1;
		}
		this.anInt1712 += this.anInt1724 * arg0;
		if (this.anInt1711 >= 0) {
			if (this.anInt1711 > 0) {
				if (this.aBoolean74) {
					label125: {
						if (this.anInt1724 < 0) {
							if (this.anInt1712 >= local76) {
								return;
							}
							this.anInt1712 = local76 + local76 - this.anInt1712 - 1;
							this.anInt1724 = -this.anInt1724;
							if (--this.anInt1711 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1712 < local81) {
								return;
							}
							this.anInt1712 = local81 + local81 - this.anInt1712 - 1;
							this.anInt1724 = -this.anInt1724;
							if (--this.anInt1711 == 0) {
								break;
							}
							if (this.anInt1712 >= local76) {
								return;
							}
							this.anInt1712 = local76 + local76 - this.anInt1712 - 1;
							this.anInt1724 = -this.anInt1724;
						} while (--this.anInt1711 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1724 < 0) {
						if (this.anInt1712 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1712 - 1) / local91;
						if (local361 < this.anInt1711) {
							this.anInt1712 += local91 * local361;
							this.anInt1711 -= local361;
							return;
						}
						this.anInt1712 += local91 * this.anInt1711;
						this.anInt1711 = 0;
					} else if (this.anInt1712 >= local81) {
						local361 = (this.anInt1712 - local76) / local91;
						if (local361 < this.anInt1711) {
							this.anInt1712 -= local91 * local361;
							this.anInt1711 -= local361;
							return;
						}
						this.anInt1712 -= local91 * this.anInt1711;
						this.anInt1711 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1724 < 0) {
				if (this.anInt1712 < 0) {
					this.anInt1712 = -1;
					this.method1362();
					this.method3007();
					return;
				}
			} else if (this.anInt1712 >= local87) {
				this.anInt1712 = local87;
				this.method1362();
				this.method3007();
			}
		} else if (this.aBoolean74) {
			if (this.anInt1724 < 0) {
				if (this.anInt1712 >= local76) {
					return;
				}
				this.anInt1712 = local76 + local76 - this.anInt1712 - 1;
				this.anInt1724 = -this.anInt1724;
			}
			while (this.anInt1712 >= local81) {
				this.anInt1712 = local81 + local81 - this.anInt1712 - 1;
				this.anInt1724 = -this.anInt1724;
				if (this.anInt1712 >= local76) {
					return;
				}
				this.anInt1712 = local76 + local76 - this.anInt1712 - 1;
				this.anInt1724 = -this.anInt1724;
			}
		} else if (this.anInt1724 < 0) {
			if (this.anInt1712 < local76) {
				this.anInt1712 = local81 - (local81 - 1 - this.anInt1712) % local91 - 1;
			}
		} else if (this.anInt1712 >= local81) {
			this.anInt1712 = local76 + (this.anInt1712 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()I")
	@Override
	public int method2583() {
		@Pc(6) int local6 = this.anInt1716 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1711 == 0) {
			local6 -= local6 * this.anInt1712 / (((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25.length << 8);
		} else if (this.anInt1711 >= 0) {
			local6 -= local6 * this.anInt1719 / ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "()Z")
	public boolean method1360() {
		return this.anInt1718 != 0;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "()V")
	private void method1362() {
		if (this.anInt1718 == 0) {
			return;
		}
		if (this.anInt1717 == Integer.MIN_VALUE) {
			this.anInt1717 = 0;
		}
		this.anInt1718 = 0;
		this.method1378();
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()Lclient!kc;")
	@Override
	public Class2_Sub14 method2588() {
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "()I")
	public synchronized int method1366() {
		return this.anInt1715 < 0 ? -1 : this.anInt1715;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
	private synchronized void method1367() {
		this.method1369(0, this.method1366());
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
	private synchronized void method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1717 = arg0;
		this.anInt1715 = arg1;
		this.anInt1718 = 0;
		this.method1378();
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "()I")
	public synchronized int method1370() {
		return this.anInt1717 == Integer.MIN_VALUE ? 0 : this.anInt1717;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public synchronized void method1375() {
		this.anInt1724 = (this.anInt1724 ^ this.anInt1724 >> 31) + (this.anInt1724 >>> 31);
		this.anInt1724 = -this.anInt1724;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIII)I")
	private int method1376(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1718 <= 0) {
				if (this.anInt1724 == -256 && (this.anInt1712 & 0xFF) == 0) {
					if (Static149.aBoolean131) {
						return Static188.method1351(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, arg3, arg2, this);
					}
					return Static188.method1353(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, arg3, arg2, this);
				}
				if (Static149.aBoolean131) {
					return Static188.method1374(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, arg3, arg2, this, this.anInt1724, arg4);
				}
				return Static188.method1348(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, arg3, arg2, this, this.anInt1724, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1718;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1718 += arg1;
			if (this.anInt1724 == -256 && (this.anInt1712 & 0xFF) == 0) {
				if (Static149.aBoolean131) {
					arg1 = Static188.method1384(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, this.anInt1720, this.anInt1723, local5, arg2, this);
				} else {
					arg1 = Static188.method1357(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, this.anInt1713, local5, arg2, this);
				}
			} else if (Static149.aBoolean131) {
				arg1 = Static188.method1373(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, this.anInt1720, this.anInt1723, local5, arg2, this, this.anInt1724, arg4);
			} else {
				arg1 = Static188.method1379(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, this.anInt1713, local5, arg2, this, this.anInt1724, arg4);
			}
			this.anInt1718 -= arg1;
			if (this.anInt1718 != 0) {
				return arg1;
			}
		} while (!this.method1381());
		return arg3;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "([IIIII)I")
	private int method1377(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1718 <= 0) {
				if (this.anInt1724 == 256 && (this.anInt1712 & 0xFF) == 0) {
					if (Static149.aBoolean131) {
						return Static188.method1365(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, arg3, arg2, this);
					}
					return Static188.method1368(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, arg3, arg2, this);
				}
				if (Static149.aBoolean131) {
					return Static188.method1363(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, arg3, arg2, this, this.anInt1724, arg4);
				}
				return Static188.method1371(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, arg3, arg2, this, this.anInt1724, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1718;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1718 += arg1;
			if (this.anInt1724 == 256 && (this.anInt1712 & 0xFF) == 0) {
				if (Static149.aBoolean131) {
					arg1 = Static188.method1359(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, this.anInt1720, this.anInt1723, local5, arg2, this);
				} else {
					arg1 = Static188.method1364(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, this.anInt1713, local5, arg2, this);
				}
			} else if (Static149.aBoolean131) {
				arg1 = Static188.method1385(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1714, this.anInt1721, this.anInt1720, this.anInt1723, local5, arg2, this, this.anInt1724, arg4);
			} else {
				arg1 = Static188.method1383(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray25, arg0, this.anInt1712, arg1, this.anInt1716, this.anInt1713, local5, arg2, this, this.anInt1724, arg4);
			}
			this.anInt1718 -= arg1;
			if (this.anInt1718 != 0) {
				return arg1;
			}
		} while (!this.method1381());
		return arg3;
	}

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "()V")
	private void method1378() {
		this.anInt1716 = this.anInt1717;
		this.anInt1714 = Static188.method1372(this.anInt1717, this.anInt1715);
		this.anInt1721 = Static188.method1350(this.anInt1717, this.anInt1715);
	}

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "()Z")
	private boolean method1381() {
		@Pc(2) int local2 = this.anInt1717;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static188.method1372(local2, this.anInt1715);
			local8 = Static188.method1350(local2, this.anInt1715);
		}
		if (this.anInt1716 != local2 || this.anInt1714 != local10 || this.anInt1721 != local8) {
			if (this.anInt1716 < local2) {
				this.anInt1713 = 1;
				this.anInt1718 = local2 - this.anInt1716;
			} else if (this.anInt1716 > local2) {
				this.anInt1713 = -1;
				this.anInt1718 = this.anInt1716 - local2;
			} else {
				this.anInt1713 = 0;
			}
			if (this.anInt1714 < local10) {
				this.anInt1720 = 1;
				if (this.anInt1718 == 0 || this.anInt1718 > local10 - this.anInt1714) {
					this.anInt1718 = local10 - this.anInt1714;
				}
			} else if (this.anInt1714 > local10) {
				this.anInt1720 = -1;
				if (this.anInt1718 == 0 || this.anInt1718 > this.anInt1714 - local10) {
					this.anInt1718 = this.anInt1714 - local10;
				}
			} else {
				this.anInt1720 = 0;
			}
			if (this.anInt1721 < local8) {
				this.anInt1723 = 1;
				if (this.anInt1718 == 0 || this.anInt1718 > local8 - this.anInt1721) {
					this.anInt1718 = local8 - this.anInt1721;
				}
			} else if (this.anInt1721 > local8) {
				this.anInt1723 = -1;
				if (this.anInt1718 == 0 || this.anInt1718 > this.anInt1721 - local8) {
					this.anInt1718 = this.anInt1721 - local8;
				}
			} else {
				this.anInt1723 = 0;
			}
			return false;
		} else if (this.anInt1717 == Integer.MIN_VALUE) {
			this.anInt1717 = 0;
			this.anInt1716 = this.anInt1714 = this.anInt1721 = 0;
			this.method3007();
			return true;
		} else {
			this.method1378();
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
	public synchronized void method1382(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1367();
			this.method3007();
		} else if (this.anInt1714 == 0 && this.anInt1721 == 0) {
			this.anInt1718 = 0;
			this.anInt1717 = 0;
			this.anInt1716 = 0;
			this.method3007();
		} else {
			@Pc(31) int local31 = -this.anInt1716;
			if (this.anInt1716 > local31) {
				local31 = this.anInt1716;
			}
			if (-this.anInt1714 > local31) {
				local31 = -this.anInt1714;
			}
			if (this.anInt1714 > local31) {
				local31 = this.anInt1714;
			}
			if (-this.anInt1721 > local31) {
				local31 = -this.anInt1721;
			}
			if (this.anInt1721 > local31) {
				local31 = this.anInt1721;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1718 = arg0;
			this.anInt1717 = Integer.MIN_VALUE;
			this.anInt1713 = -this.anInt1716 / arg0;
			this.anInt1720 = -this.anInt1714 / arg0;
			this.anInt1723 = -this.anInt1721 / arg0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
	@Override
	public int method2589() {
		return this.anInt1717 == 0 && this.anInt1718 == 0 ? 0 : 1;
	}
}
