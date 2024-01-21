import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public int anInt1648;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	private int anInt1650;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	private int anInt1651;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public int anInt1653;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public int anInt1656;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
	public int anInt1658;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt1659;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public int anInt1661;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	private final int anInt1652;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	private final int anInt1654;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	private int anInt1655;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	private int anInt1660;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	private int anInt1657;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	public int anInt1649;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!vf;II)V")
	public Class4_Sub2_Sub2(@OriginalArg(0) Class4_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub12_5 = arg0;
		this.anInt1652 = arg0.anInt3982;
		this.anInt1654 = arg0.anInt3983;
		this.aBoolean74 = arg0.aBoolean164;
		this.anInt1655 = arg1;
		this.anInt1660 = arg2;
		this.anInt1657 = 8192;
		this.anInt1649 = 0;
		this.method1325();
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!vf;III)V")
	public Class4_Sub2_Sub2(@OriginalArg(0) Class4_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub12_5 = arg0;
		this.anInt1652 = arg0.anInt3982;
		this.anInt1654 = arg0.anInt3983;
		this.aBoolean74 = arg0.aBoolean164;
		this.anInt1655 = arg1;
		this.anInt1660 = arg2;
		this.anInt1657 = arg3;
		this.anInt1649 = 0;
		this.method1325();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lclient!ag;")
	@Override
	public Class4_Sub2 method2768() {
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
	public synchronized int method1304() {
		return this.anInt1655 < 0 ? -this.anInt1655 : this.anInt1655;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
	public boolean method1307() {
		return this.anInt1651 != 0;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "()I")
	public synchronized int method1308() {
		return this.anInt1657 < 0 ? -1 : this.anInt1657;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public synchronized void method1311() {
		this.anInt1655 = (this.anInt1655 ^ this.anInt1655 >> 31) + (this.anInt1655 >>> 31);
		this.anInt1655 = -this.anInt1655;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
	@Override
	public int method2771() {
		return this.anInt1660 == 0 && this.anInt1651 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIII)I")
	private int method1312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1651 <= 0) {
				if (this.anInt1655 == -256 && (this.anInt1649 & 0xFF) == 0) {
					if (Static68.aBoolean82) {
						return Static192.method1310(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, arg3, arg2, this);
					}
					return Static192.method1319(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, arg3, arg2, this);
				}
				if (Static68.aBoolean82) {
					return Static192.method1324(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, arg3, arg2, this, this.anInt1655, arg4);
				}
				return Static192.method1305(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, arg3, arg2, this, this.anInt1655, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1651;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1651 += arg1;
			if (this.anInt1655 == -256 && (this.anInt1649 & 0xFF) == 0) {
				if (Static68.aBoolean82) {
					arg1 = Static192.method1317(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, this.anInt1661, this.anInt1653, local5, arg2, this);
				} else {
					arg1 = Static192.method1318(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, this.anInt1648, local5, arg2, this);
				}
			} else if (Static68.aBoolean82) {
				arg1 = Static192.method1334(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, this.anInt1661, this.anInt1653, local5, arg2, this, this.anInt1655, arg4);
			} else {
				arg1 = Static192.method1332(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, this.anInt1648, local5, arg2, this, this.anInt1655, arg4);
			}
			this.anInt1651 -= arg1;
			if (this.anInt1651 != 0) {
				return arg1;
			}
		} while (!this.method1331());
		return arg3;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public synchronized void method1313(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1315();
			this.method3173();
		} else if (this.anInt1658 == 0 && this.anInt1659 == 0) {
			this.anInt1651 = 0;
			this.anInt1660 = 0;
			this.anInt1656 = 0;
			this.method3173();
		} else {
			@Pc(31) int local31 = -this.anInt1656;
			if (this.anInt1656 > local31) {
				local31 = this.anInt1656;
			}
			if (-this.anInt1658 > local31) {
				local31 = -this.anInt1658;
			}
			if (this.anInt1658 > local31) {
				local31 = this.anInt1658;
			}
			if (-this.anInt1659 > local31) {
				local31 = -this.anInt1659;
			}
			if (this.anInt1659 > local31) {
				local31 = this.anInt1659;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1651 = arg0;
			this.anInt1660 = Integer.MIN_VALUE;
			this.anInt1648 = -this.anInt1656 / arg0;
			this.anInt1661 = -this.anInt1658 / arg0;
			this.anInt1653 = -this.anInt1659 / arg0;
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()I")
	public synchronized int method1314() {
		return this.anInt1660 == Integer.MIN_VALUE ? 0 : this.anInt1660;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	private synchronized void method1315() {
		this.method1339(0, this.method1308());
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public synchronized void method1321(@OriginalArg(0) int arg0) {
		if (this.anInt1655 < 0) {
			this.anInt1655 = -arg0;
		} else {
			this.anInt1655 = arg0;
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public synchronized void method1322(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1649 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int arg0) {
		if (this.anInt1651 > 0) {
			if (arg0 >= this.anInt1651) {
				if (this.anInt1660 == Integer.MIN_VALUE) {
					this.anInt1660 = 0;
					this.anInt1656 = this.anInt1658 = this.anInt1659 = 0;
					this.method3173();
					arg0 = this.anInt1651;
				}
				this.anInt1651 = 0;
				this.method1325();
			} else {
				this.anInt1656 += this.anInt1648 * arg0;
				this.anInt1658 += this.anInt1661 * arg0;
				this.anInt1659 += this.anInt1653 * arg0;
				this.anInt1651 -= arg0;
			}
		}
		@Pc(71) Class4_Sub12_Sub1 local71 = (Class4_Sub12_Sub1) super.aClass4_Sub12_5;
		@Pc(76) int local76 = this.anInt1652 << 8;
		@Pc(81) int local81 = this.anInt1654 << 8;
		@Pc(87) int local87 = local71.aByteArray48.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1650 = 0;
		}
		if (this.anInt1649 < 0) {
			if (this.anInt1655 <= 0) {
				this.method1330();
				this.method3173();
				return;
			}
			this.anInt1649 = 0;
		}
		if (this.anInt1649 >= local87) {
			if (this.anInt1655 >= 0) {
				this.method1330();
				this.method3173();
				return;
			}
			this.anInt1649 = local87 - 1;
		}
		this.anInt1649 += this.anInt1655 * arg0;
		if (this.anInt1650 >= 0) {
			if (this.anInt1650 > 0) {
				if (this.aBoolean74) {
					label125: {
						if (this.anInt1655 < 0) {
							if (this.anInt1649 >= local76) {
								return;
							}
							this.anInt1649 = local76 + local76 - this.anInt1649 - 1;
							this.anInt1655 = -this.anInt1655;
							if (--this.anInt1650 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1649 < local81) {
								return;
							}
							this.anInt1649 = local81 + local81 - this.anInt1649 - 1;
							this.anInt1655 = -this.anInt1655;
							if (--this.anInt1650 == 0) {
								break;
							}
							if (this.anInt1649 >= local76) {
								return;
							}
							this.anInt1649 = local76 + local76 - this.anInt1649 - 1;
							this.anInt1655 = -this.anInt1655;
						} while (--this.anInt1650 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1655 < 0) {
						if (this.anInt1649 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1649 - 1) / local91;
						if (local361 < this.anInt1650) {
							this.anInt1649 += local91 * local361;
							this.anInt1650 -= local361;
							return;
						}
						this.anInt1649 += local91 * this.anInt1650;
						this.anInt1650 = 0;
					} else if (this.anInt1649 >= local81) {
						local361 = (this.anInt1649 - local76) / local91;
						if (local361 < this.anInt1650) {
							this.anInt1649 -= local91 * local361;
							this.anInt1650 -= local361;
							return;
						}
						this.anInt1649 -= local91 * this.anInt1650;
						this.anInt1650 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1655 < 0) {
				if (this.anInt1649 < 0) {
					this.anInt1649 = -1;
					this.method1330();
					this.method3173();
					return;
				}
			} else if (this.anInt1649 >= local87) {
				this.anInt1649 = local87;
				this.method1330();
				this.method3173();
			}
		} else if (this.aBoolean74) {
			if (this.anInt1655 < 0) {
				if (this.anInt1649 >= local76) {
					return;
				}
				this.anInt1649 = local76 + local76 - this.anInt1649 - 1;
				this.anInt1655 = -this.anInt1655;
			}
			while (this.anInt1649 >= local81) {
				this.anInt1649 = local81 + local81 - this.anInt1649 - 1;
				this.anInt1655 = -this.anInt1655;
				if (this.anInt1649 >= local76) {
					return;
				}
				this.anInt1649 = local76 + local76 - this.anInt1649 - 1;
				this.anInt1655 = -this.anInt1655;
			}
		} else if (this.anInt1655 < 0) {
			if (this.anInt1649 < local76) {
				this.anInt1649 = local81 - (local81 - 1 - this.anInt1649) % local91 - 1;
			}
		} else if (this.anInt1649 >= local81) {
			this.anInt1649 = local76 + (this.anInt1649 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()V")
	private void method1325() {
		this.anInt1656 = this.anInt1660;
		this.anInt1658 = Static192.method1340(this.anInt1660, this.anInt1657);
		this.anInt1659 = Static192.method1341(this.anInt1660, this.anInt1657);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public synchronized void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1342(arg0, arg1, this.method1308());
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "([IIIII)I")
	private int method1328(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1651 <= 0) {
				if (this.anInt1655 == 256 && (this.anInt1649 & 0xFF) == 0) {
					if (Static68.aBoolean82) {
						return Static192.method1320(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, arg3, arg2, this);
					}
					return Static192.method1333(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, arg3, arg2, this);
				}
				if (Static68.aBoolean82) {
					return Static192.method1323(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, arg3, arg2, this, this.anInt1655, arg4);
				}
				return Static192.method1327(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, arg3, arg2, this, this.anInt1655, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1651;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1651 += arg1;
			if (this.anInt1655 == 256 && (this.anInt1649 & 0xFF) == 0) {
				if (Static68.aBoolean82) {
					arg1 = Static192.method1338(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, this.anInt1661, this.anInt1653, local5, arg2, this);
				} else {
					arg1 = Static192.method1309(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, this.anInt1648, local5, arg2, this);
				}
			} else if (Static68.aBoolean82) {
				arg1 = Static192.method1336(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1658, this.anInt1659, this.anInt1661, this.anInt1653, local5, arg2, this, this.anInt1655, arg4);
			} else {
				arg1 = Static192.method1316(((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48, arg0, this.anInt1649, arg1, this.anInt1656, this.anInt1648, local5, arg2, this, this.anInt1655, arg4);
			}
			this.anInt1651 -= arg1;
			if (this.anInt1651 != 0) {
				return arg1;
			}
		} while (!this.method1331());
		return arg3;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()I")
	@Override
	public int method2770() {
		@Pc(6) int local6 = this.anInt1656 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1650 == 0) {
			local6 -= local6 * this.anInt1649 / (((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48.length << 8);
		} else if (this.anInt1650 >= 0) {
			local6 -= local6 * this.anInt1652 / ((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
	private void method1330() {
		if (this.anInt1651 == 0) {
			return;
		}
		if (this.anInt1660 == Integer.MIN_VALUE) {
			this.anInt1660 = 0;
		}
		this.anInt1651 = 0;
		this.method1325();
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	private boolean method1331() {
		@Pc(2) int local2 = this.anInt1660;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static192.method1340(local2, this.anInt1657);
			local8 = Static192.method1341(local2, this.anInt1657);
		}
		if (this.anInt1656 != local2 || this.anInt1658 != local10 || this.anInt1659 != local8) {
			if (this.anInt1656 < local2) {
				this.anInt1648 = 1;
				this.anInt1651 = local2 - this.anInt1656;
			} else if (this.anInt1656 > local2) {
				this.anInt1648 = -1;
				this.anInt1651 = this.anInt1656 - local2;
			} else {
				this.anInt1648 = 0;
			}
			if (this.anInt1658 < local10) {
				this.anInt1661 = 1;
				if (this.anInt1651 == 0 || this.anInt1651 > local10 - this.anInt1658) {
					this.anInt1651 = local10 - this.anInt1658;
				}
			} else if (this.anInt1658 > local10) {
				this.anInt1661 = -1;
				if (this.anInt1651 == 0 || this.anInt1651 > this.anInt1658 - local10) {
					this.anInt1651 = this.anInt1658 - local10;
				}
			} else {
				this.anInt1661 = 0;
			}
			if (this.anInt1659 < local8) {
				this.anInt1653 = 1;
				if (this.anInt1651 == 0 || this.anInt1651 > local8 - this.anInt1659) {
					this.anInt1651 = local8 - this.anInt1659;
				}
			} else if (this.anInt1659 > local8) {
				this.anInt1653 = -1;
				if (this.anInt1651 == 0 || this.anInt1651 > this.anInt1659 - local8) {
					this.anInt1651 = this.anInt1659 - local8;
				}
			} else {
				this.anInt1653 = 0;
			}
			return false;
		} else if (this.anInt1660 == Integer.MIN_VALUE) {
			this.anInt1660 = 0;
			this.anInt1656 = this.anInt1658 = this.anInt1659 = 0;
			this.method3173();
			return true;
		} else {
			this.method1325();
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lclient!ag;")
	@Override
	public Class4_Sub2 method2774() {
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1660 == 0 && this.anInt1651 == 0) {
			this.method2773(arg2);
			return;
		}
		@Pc(13) Class4_Sub12_Sub1 local13 = (Class4_Sub12_Sub1) super.aClass4_Sub12_5;
		@Pc(18) int local18 = this.anInt1652 << 8;
		@Pc(23) int local23 = this.anInt1654 << 8;
		@Pc(29) int local29 = local13.aByteArray48.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1650 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1649 < 0) {
			if (this.anInt1655 <= 0) {
				this.method1330();
				this.method3173();
				return;
			}
			this.anInt1649 = 0;
		}
		if (this.anInt1649 >= local29) {
			if (this.anInt1655 >= 0) {
				this.method1330();
				this.method3173();
				return;
			}
			this.anInt1649 = local29 - 1;
		}
		if (this.anInt1650 >= 0) {
			if (this.anInt1650 > 0) {
				if (this.aBoolean74) {
					label130: {
						if (this.anInt1655 < 0) {
							local40 = this.method1312(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt1652]);
							if (this.anInt1649 >= local18) {
								return;
							}
							this.anInt1649 = local18 + local18 - this.anInt1649 - 1;
							this.anInt1655 = -this.anInt1655;
							if (--this.anInt1650 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1328(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1654 - 1]);
							if (this.anInt1649 < local23) {
								return;
							}
							this.anInt1649 = local23 + local23 - this.anInt1649 - 1;
							this.anInt1655 = -this.anInt1655;
							if (--this.anInt1650 == 0) {
								break;
							}
							local40 = this.method1312(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1652]);
							if (this.anInt1649 >= local18) {
								return;
							}
							this.anInt1649 = local18 + local18 - this.anInt1649 - 1;
							this.anInt1655 = -this.anInt1655;
						} while (--this.anInt1650 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1655 < 0) {
						while (true) {
							local40 = this.method1312(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1654 - 1]);
							if (this.anInt1649 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1649 - 1) / local33;
							if (local416 >= this.anInt1650) {
								this.anInt1649 += local33 * this.anInt1650;
								this.anInt1650 = 0;
								break;
							}
							this.anInt1649 += local33 * local416;
							this.anInt1650 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1328(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1652]);
							if (this.anInt1649 < local23) {
								return;
							}
							local416 = (this.anInt1649 - local18) / local33;
							if (local416 >= this.anInt1650) {
								this.anInt1649 -= local33 * this.anInt1650;
								this.anInt1650 = 0;
								break;
							}
							this.anInt1649 -= local33 * local416;
							this.anInt1650 -= local416;
						}
					}
				}
			}
			if (this.anInt1655 < 0) {
				this.method1312(arg0, local40, 0, local44, 0);
				if (this.anInt1649 < 0) {
					this.anInt1649 = -1;
					this.method1330();
					this.method3173();
					return;
				}
			} else {
				this.method1328(arg0, local40, local29, local44, 0);
				if (this.anInt1649 >= local29) {
					this.anInt1649 = local29;
					this.method1330();
					this.method3173();
				}
			}
		} else if (this.aBoolean74) {
			if (this.anInt1655 < 0) {
				local40 = this.method1312(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt1652]);
				if (this.anInt1649 >= local18) {
					return;
				}
				this.anInt1649 = local18 + local18 - this.anInt1649 - 1;
				this.anInt1655 = -this.anInt1655;
			}
			while (true) {
				local40 = this.method1328(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1654 - 1]);
				if (this.anInt1649 < local23) {
					return;
				}
				this.anInt1649 = local23 + local23 - this.anInt1649 - 1;
				this.anInt1655 = -this.anInt1655;
				local40 = this.method1312(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1652]);
				if (this.anInt1649 >= local18) {
					return;
				}
				this.anInt1649 = local18 + local18 - this.anInt1649 - 1;
				this.anInt1655 = -this.anInt1655;
			}
		} else if (this.anInt1655 < 0) {
			while (true) {
				local40 = this.method1312(arg0, local40, local18, local44, local13.aByteArray48[this.anInt1654 - 1]);
				if (this.anInt1649 >= local18) {
					return;
				}
				this.anInt1649 = local23 - (local23 - 1 - this.anInt1649) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1328(arg0, local40, local23, local44, local13.aByteArray48[this.anInt1652]);
				if (this.anInt1649 < local23) {
					return;
				}
				this.anInt1649 = local18 + (this.anInt1649 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public synchronized void method1335(@OriginalArg(0) int arg0) {
		this.anInt1650 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
	public synchronized void method1337(@OriginalArg(0) int arg0) {
		this.method1339(arg0 << 6, this.method1308());
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	private synchronized void method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1660 = arg0;
		this.anInt1657 = arg1;
		this.anInt1651 = 0;
		this.method1325();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public synchronized void method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1339(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static192.method1340(arg1, arg2);
		@Pc(14) int local14 = Static192.method1341(arg1, arg2);
		if (this.anInt1658 == local10 && this.anInt1659 == local14) {
			this.anInt1651 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1656;
		if (this.anInt1656 - arg1 > local31) {
			local31 = this.anInt1656 - arg1;
		}
		if (local10 - this.anInt1658 > local31) {
			local31 = local10 - this.anInt1658;
		}
		if (this.anInt1658 - local10 > local31) {
			local31 = this.anInt1658 - local10;
		}
		if (local14 - this.anInt1659 > local31) {
			local31 = local14 - this.anInt1659;
		}
		if (this.anInt1659 - local14 > local31) {
			local31 = this.anInt1659 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1651 = arg0;
		this.anInt1660 = arg1;
		this.anInt1657 = arg2;
		this.anInt1648 = (arg1 - this.anInt1656) / arg0;
		this.anInt1661 = (local10 - this.anInt1658) / arg0;
		this.anInt1653 = (local14 - this.anInt1659) / arg0;
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public boolean method1343() {
		return this.anInt1649 < 0 || this.anInt1649 >= ((Class4_Sub12_Sub1) super.aClass4_Sub12_5).aByteArray48.length << 8;
	}
}
