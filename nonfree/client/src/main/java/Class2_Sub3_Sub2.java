import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!en", name = "t", descriptor = "I")
	public int anInt1635;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "I")
	private int anInt1637;

	@OriginalMember(owner = "client!en", name = "x", descriptor = "I")
	private int anInt1638;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "I")
	public int anInt1639;

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	public int anInt1640;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "I")
	public int anInt1643;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "I")
	public int anInt1647;

	@OriginalMember(owner = "client!en", name = "I", descriptor = "I")
	public int anInt1648;

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	private final int anInt1644;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "I")
	private final int anInt1641;

	@OriginalMember(owner = "client!en", name = "u", descriptor = "Z")
	private final boolean aBoolean150;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "I")
	private int anInt1646;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	private int anInt1645;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "I")
	private int anInt1642;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	public int anInt1636;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!vo;II)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class2_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub12_5 = arg0;
		this.anInt1644 = arg0.anInt6729;
		this.anInt1641 = arg0.anInt6731;
		this.aBoolean150 = arg0.aBoolean592;
		this.anInt1646 = arg1;
		this.anInt1645 = arg2;
		this.anInt1642 = 8192;
		this.anInt1636 = 0;
		this.method1719();
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!vo;III)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class2_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub12_5 = arg0;
		this.anInt1644 = arg0.anInt6729;
		this.anInt1641 = arg0.anInt6731;
		this.aBoolean150 = arg0.aBoolean592;
		this.anInt1646 = arg1;
		this.anInt1645 = arg2;
		this.anInt1642 = arg3;
		this.anInt1636 = 0;
		this.method1719();
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "()I")
	public synchronized int method1697() {
		return this.anInt1642 < 0 ? -1 : this.anInt1642;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "()Z")
	private boolean method1698() {
		@Pc(2) int local2 = this.anInt1645;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static360.method1731(local2, this.anInt1642);
			local8 = Static360.method1730(local2, this.anInt1642);
		}
		if (this.anInt1640 != local2 || this.anInt1635 != local10 || this.anInt1647 != local8) {
			if (this.anInt1640 < local2) {
				this.anInt1639 = 1;
				this.anInt1638 = local2 - this.anInt1640;
			} else if (this.anInt1640 > local2) {
				this.anInt1639 = -1;
				this.anInt1638 = this.anInt1640 - local2;
			} else {
				this.anInt1639 = 0;
			}
			if (this.anInt1635 < local10) {
				this.anInt1643 = 1;
				if (this.anInt1638 == 0 || this.anInt1638 > local10 - this.anInt1635) {
					this.anInt1638 = local10 - this.anInt1635;
				}
			} else if (this.anInt1635 > local10) {
				this.anInt1643 = -1;
				if (this.anInt1638 == 0 || this.anInt1638 > this.anInt1635 - local10) {
					this.anInt1638 = this.anInt1635 - local10;
				}
			} else {
				this.anInt1643 = 0;
			}
			if (this.anInt1647 < local8) {
				this.anInt1648 = 1;
				if (this.anInt1638 == 0 || this.anInt1638 > local8 - this.anInt1647) {
					this.anInt1638 = local8 - this.anInt1647;
				}
			} else if (this.anInt1647 > local8) {
				this.anInt1648 = -1;
				if (this.anInt1638 == 0 || this.anInt1638 > this.anInt1647 - local8) {
					this.anInt1638 = this.anInt1647 - local8;
				}
			} else {
				this.anInt1648 = 0;
			}
			return false;
		} else if (this.anInt1645 == Integer.MIN_VALUE) {
			this.anInt1645 = 0;
			this.anInt1640 = this.anInt1635 = this.anInt1647 = 0;
			this.method5945();
			return true;
		} else {
			this.method1719();
			return false;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)I")
	private int method1699(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1638 <= 0) {
				if (this.anInt1646 == -256 && (this.anInt1636 & 0xFF) == 0) {
					if (Static18.aBoolean55) {
						return Static360.method1710(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, arg3, arg2, this);
					}
					return Static360.method1713(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, arg3, arg2, this);
				}
				if (Static18.aBoolean55) {
					return Static360.method1724(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, arg3, arg2, this, this.anInt1646, arg4);
				}
				return Static360.method1722(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, arg3, arg2, this, this.anInt1646, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1638;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1638 += arg1;
			if (this.anInt1646 == -256 && (this.anInt1636 & 0xFF) == 0) {
				if (Static18.aBoolean55) {
					arg1 = Static360.method1715(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, this.anInt1643, this.anInt1648, local5, arg2, this);
				} else {
					arg1 = Static360.method1732(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, this.anInt1639, local5, arg2, this);
				}
			} else if (Static18.aBoolean55) {
				arg1 = Static360.method1721(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, this.anInt1643, this.anInt1648, local5, arg2, this, this.anInt1646, arg4);
			} else {
				arg1 = Static360.method1694(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, this.anInt1639, local5, arg2, this, this.anInt1646, arg4);
			}
			this.anInt1638 -= arg1;
			if (this.anInt1638 != 0) {
				return arg1;
			}
		} while (!this.method1698());
		return arg3;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public synchronized void method1700(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1636 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "()Z")
	public boolean method1701() {
		return this.anInt1638 != 0;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	private synchronized void method1703() {
		this.method1706(0, this.method1697());
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	public synchronized void method1705() {
		this.anInt1646 = (this.anInt1646 ^ this.anInt1646 >> 31) + (this.anInt1646 >>> 31);
		this.anInt1646 = -this.anInt1646;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	private synchronized void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1645 = arg0;
		this.anInt1642 = arg1;
		this.anInt1638 = 0;
		this.method1719();
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "()V")
	private void method1707() {
		if (this.anInt1638 == 0) {
			return;
		}
		if (this.anInt1645 == Integer.MIN_VALUE) {
			this.anInt1645 = 0;
		}
		this.anInt1638 = 0;
		this.method1719();
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "()Z")
	public boolean method1708() {
		return this.anInt1636 < 0 || this.anInt1636 >= ((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90.length << 8;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V")
	public synchronized void method1709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1723(arg0, arg1, this.method1697());
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	public synchronized void method1711(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1703();
			this.method5945();
		} else if (this.anInt1635 == 0 && this.anInt1647 == 0) {
			this.anInt1638 = 0;
			this.anInt1645 = 0;
			this.anInt1640 = 0;
			this.method5945();
		} else {
			@Pc(31) int local31 = -this.anInt1640;
			if (this.anInt1640 > local31) {
				local31 = this.anInt1640;
			}
			if (-this.anInt1635 > local31) {
				local31 = -this.anInt1635;
			}
			if (this.anInt1635 > local31) {
				local31 = this.anInt1635;
			}
			if (-this.anInt1647 > local31) {
				local31 = -this.anInt1647;
			}
			if (this.anInt1647 > local31) {
				local31 = this.anInt1647;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1638 = arg0;
			this.anInt1645 = Integer.MIN_VALUE;
			this.anInt1639 = -this.anInt1640 / arg0;
			this.anInt1643 = -this.anInt1635 / arg0;
			this.anInt1648 = -this.anInt1647 / arg0;
		}
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	public synchronized void method1712(@OriginalArg(0) int arg0) {
		if (this.anInt1646 < 0) {
			this.anInt1646 = -arg0;
		} else {
			this.anInt1646 = arg0;
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "()I")
	@Override
	public int method4478() {
		@Pc(6) int local6 = this.anInt1640 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1637 == 0) {
			local6 -= local6 * this.anInt1636 / (((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90.length << 8);
		} else if (this.anInt1637 >= 0) {
			local6 -= local6 * this.anInt1644 / ((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()I")
	@Override
	public int method4474() {
		return this.anInt1645 == 0 && this.anInt1638 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	public synchronized void method1716(@OriginalArg(0) int arg0) {
		this.anInt1637 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()Lclient!j;")
	@Override
	public Class2_Sub3 method4475() {
		return null;
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)V")
	public synchronized void method1718(@OriginalArg(0) int arg0) {
		this.method1706(arg0 << 6, this.method1697());
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "()V")
	private void method1719() {
		this.anInt1640 = this.anInt1645;
		this.anInt1635 = Static360.method1731(this.anInt1645, this.anInt1642);
		this.anInt1647 = Static360.method1730(this.anInt1645, this.anInt1642);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4473(@OriginalArg(0) int arg0) {
		if (this.anInt1638 > 0) {
			if (arg0 >= this.anInt1638) {
				if (this.anInt1645 == Integer.MIN_VALUE) {
					this.anInt1645 = 0;
					this.anInt1640 = this.anInt1635 = this.anInt1647 = 0;
					this.method5945();
					arg0 = this.anInt1638;
				}
				this.anInt1638 = 0;
				this.method1719();
			} else {
				this.anInt1640 += this.anInt1639 * arg0;
				this.anInt1635 += this.anInt1643 * arg0;
				this.anInt1647 += this.anInt1648 * arg0;
				this.anInt1638 -= arg0;
			}
		}
		@Pc(71) Class2_Sub12_Sub1 local71 = (Class2_Sub12_Sub1) super.aClass2_Sub12_5;
		@Pc(76) int local76 = this.anInt1644 << 8;
		@Pc(81) int local81 = this.anInt1641 << 8;
		@Pc(87) int local87 = local71.aByteArray90.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1637 = 0;
		}
		if (this.anInt1636 < 0) {
			if (this.anInt1646 <= 0) {
				this.method1707();
				this.method5945();
				return;
			}
			this.anInt1636 = 0;
		}
		if (this.anInt1636 >= local87) {
			if (this.anInt1646 >= 0) {
				this.method1707();
				this.method5945();
				return;
			}
			this.anInt1636 = local87 - 1;
		}
		this.anInt1636 += this.anInt1646 * arg0;
		if (this.anInt1637 >= 0) {
			if (this.anInt1637 > 0) {
				if (this.aBoolean150) {
					label125: {
						if (this.anInt1646 < 0) {
							if (this.anInt1636 >= local76) {
								return;
							}
							this.anInt1636 = local76 + local76 - this.anInt1636 - 1;
							this.anInt1646 = -this.anInt1646;
							if (--this.anInt1637 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1636 < local81) {
								return;
							}
							this.anInt1636 = local81 + local81 - this.anInt1636 - 1;
							this.anInt1646 = -this.anInt1646;
							if (--this.anInt1637 == 0) {
								break;
							}
							if (this.anInt1636 >= local76) {
								return;
							}
							this.anInt1636 = local76 + local76 - this.anInt1636 - 1;
							this.anInt1646 = -this.anInt1646;
						} while (--this.anInt1637 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1646 < 0) {
						if (this.anInt1636 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1636 - 1) / local91;
						if (local361 < this.anInt1637) {
							this.anInt1636 += local91 * local361;
							this.anInt1637 -= local361;
							return;
						}
						this.anInt1636 += local91 * this.anInt1637;
						this.anInt1637 = 0;
					} else if (this.anInt1636 >= local81) {
						local361 = (this.anInt1636 - local76) / local91;
						if (local361 < this.anInt1637) {
							this.anInt1636 -= local91 * local361;
							this.anInt1637 -= local361;
							return;
						}
						this.anInt1636 -= local91 * this.anInt1637;
						this.anInt1637 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1646 < 0) {
				if (this.anInt1636 < 0) {
					this.anInt1636 = -1;
					this.method1707();
					this.method5945();
					return;
				}
			} else if (this.anInt1636 >= local87) {
				this.anInt1636 = local87;
				this.method1707();
				this.method5945();
			}
		} else if (this.aBoolean150) {
			if (this.anInt1646 < 0) {
				if (this.anInt1636 >= local76) {
					return;
				}
				this.anInt1636 = local76 + local76 - this.anInt1636 - 1;
				this.anInt1646 = -this.anInt1646;
			}
			while (this.anInt1636 >= local81) {
				this.anInt1636 = local81 + local81 - this.anInt1636 - 1;
				this.anInt1646 = -this.anInt1646;
				if (this.anInt1636 >= local76) {
					return;
				}
				this.anInt1636 = local76 + local76 - this.anInt1636 - 1;
				this.anInt1646 = -this.anInt1646;
			}
		} else if (this.anInt1646 < 0) {
			if (this.anInt1636 < local76) {
				this.anInt1636 = local81 - (local81 - 1 - this.anInt1636) % local91 - 1;
			}
		} else if (this.anInt1636 >= local81) {
			this.anInt1636 = local76 + (this.anInt1636 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	public synchronized void method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1706(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static360.method1731(arg1, arg2);
		@Pc(14) int local14 = Static360.method1730(arg1, arg2);
		if (this.anInt1635 == local10 && this.anInt1647 == local14) {
			this.anInt1638 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1640;
		if (this.anInt1640 - arg1 > local31) {
			local31 = this.anInt1640 - arg1;
		}
		if (local10 - this.anInt1635 > local31) {
			local31 = local10 - this.anInt1635;
		}
		if (this.anInt1635 - local10 > local31) {
			local31 = this.anInt1635 - local10;
		}
		if (local14 - this.anInt1647 > local31) {
			local31 = local14 - this.anInt1647;
		}
		if (this.anInt1647 - local14 > local31) {
			local31 = this.anInt1647 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1638 = arg0;
		this.anInt1645 = arg1;
		this.anInt1642 = arg2;
		this.anInt1639 = (arg1 - this.anInt1640) / arg0;
		this.anInt1643 = (local10 - this.anInt1635) / arg0;
		this.anInt1648 = (local14 - this.anInt1647) / arg0;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()Lclient!j;")
	@Override
	public Class2_Sub3 method4476() {
		return null;
	}

	@OriginalMember(owner = "client!en", name = "k", descriptor = "()I")
	public synchronized int method1726() {
		return this.anInt1646 < 0 ? -this.anInt1646 : this.anInt1646;
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "()I")
	public synchronized int method1728() {
		return this.anInt1645 == Integer.MIN_VALUE ? 0 : this.anInt1645;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1645 == 0 && this.anInt1638 == 0) {
			this.method4473(arg2);
			return;
		}
		@Pc(13) Class2_Sub12_Sub1 local13 = (Class2_Sub12_Sub1) super.aClass2_Sub12_5;
		@Pc(18) int local18 = this.anInt1644 << 8;
		@Pc(23) int local23 = this.anInt1641 << 8;
		@Pc(29) int local29 = local13.aByteArray90.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1637 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1636 < 0) {
			if (this.anInt1646 <= 0) {
				this.method1707();
				this.method5945();
				return;
			}
			this.anInt1636 = 0;
		}
		if (this.anInt1636 >= local29) {
			if (this.anInt1646 >= 0) {
				this.method1707();
				this.method5945();
				return;
			}
			this.anInt1636 = local29 - 1;
		}
		if (this.anInt1637 >= 0) {
			if (this.anInt1637 > 0) {
				if (this.aBoolean150) {
					label130: {
						if (this.anInt1646 < 0) {
							local40 = this.method1699(arg0, arg1, local18, local44, local13.aByteArray90[this.anInt1644]);
							if (this.anInt1636 >= local18) {
								return;
							}
							this.anInt1636 = local18 + local18 - this.anInt1636 - 1;
							this.anInt1646 = -this.anInt1646;
							if (--this.anInt1637 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1733(arg0, local40, local23, local44, local13.aByteArray90[this.anInt1641 - 1]);
							if (this.anInt1636 < local23) {
								return;
							}
							this.anInt1636 = local23 + local23 - this.anInt1636 - 1;
							this.anInt1646 = -this.anInt1646;
							if (--this.anInt1637 == 0) {
								break;
							}
							local40 = this.method1699(arg0, local40, local18, local44, local13.aByteArray90[this.anInt1644]);
							if (this.anInt1636 >= local18) {
								return;
							}
							this.anInt1636 = local18 + local18 - this.anInt1636 - 1;
							this.anInt1646 = -this.anInt1646;
						} while (--this.anInt1637 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1646 < 0) {
						while (true) {
							local40 = this.method1699(arg0, local40, local18, local44, local13.aByteArray90[this.anInt1641 - 1]);
							if (this.anInt1636 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1636 - 1) / local33;
							if (local416 >= this.anInt1637) {
								this.anInt1636 += local33 * this.anInt1637;
								this.anInt1637 = 0;
								break;
							}
							this.anInt1636 += local33 * local416;
							this.anInt1637 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1733(arg0, local40, local23, local44, local13.aByteArray90[this.anInt1644]);
							if (this.anInt1636 < local23) {
								return;
							}
							local416 = (this.anInt1636 - local18) / local33;
							if (local416 >= this.anInt1637) {
								this.anInt1636 -= local33 * this.anInt1637;
								this.anInt1637 = 0;
								break;
							}
							this.anInt1636 -= local33 * local416;
							this.anInt1637 -= local416;
						}
					}
				}
			}
			if (this.anInt1646 < 0) {
				this.method1699(arg0, local40, 0, local44, 0);
				if (this.anInt1636 < 0) {
					this.anInt1636 = -1;
					this.method1707();
					this.method5945();
					return;
				}
			} else {
				this.method1733(arg0, local40, local29, local44, 0);
				if (this.anInt1636 >= local29) {
					this.anInt1636 = local29;
					this.method1707();
					this.method5945();
				}
			}
		} else if (this.aBoolean150) {
			if (this.anInt1646 < 0) {
				local40 = this.method1699(arg0, arg1, local18, local44, local13.aByteArray90[this.anInt1644]);
				if (this.anInt1636 >= local18) {
					return;
				}
				this.anInt1636 = local18 + local18 - this.anInt1636 - 1;
				this.anInt1646 = -this.anInt1646;
			}
			while (true) {
				local40 = this.method1733(arg0, local40, local23, local44, local13.aByteArray90[this.anInt1641 - 1]);
				if (this.anInt1636 < local23) {
					return;
				}
				this.anInt1636 = local23 + local23 - this.anInt1636 - 1;
				this.anInt1646 = -this.anInt1646;
				local40 = this.method1699(arg0, local40, local18, local44, local13.aByteArray90[this.anInt1644]);
				if (this.anInt1636 >= local18) {
					return;
				}
				this.anInt1636 = local18 + local18 - this.anInt1636 - 1;
				this.anInt1646 = -this.anInt1646;
			}
		} else if (this.anInt1646 < 0) {
			while (true) {
				local40 = this.method1699(arg0, local40, local18, local44, local13.aByteArray90[this.anInt1641 - 1]);
				if (this.anInt1636 >= local18) {
					return;
				}
				this.anInt1636 = local23 - (local23 - 1 - this.anInt1636) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1733(arg0, local40, local23, local44, local13.aByteArray90[this.anInt1644]);
				if (this.anInt1636 < local23) {
					return;
				}
				this.anInt1636 = local18 + (this.anInt1636 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "([IIIII)I")
	private int method1733(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1638 <= 0) {
				if (this.anInt1646 == 256 && (this.anInt1636 & 0xFF) == 0) {
					if (Static18.aBoolean55) {
						return Static360.method1702(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, arg3, arg2, this);
					}
					return Static360.method1720(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, arg3, arg2, this);
				}
				if (Static18.aBoolean55) {
					return Static360.method1714(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, arg3, arg2, this, this.anInt1646, arg4);
				}
				return Static360.method1695(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, arg3, arg2, this, this.anInt1646, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1638;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1638 += arg1;
			if (this.anInt1646 == 256 && (this.anInt1636 & 0xFF) == 0) {
				if (Static18.aBoolean55) {
					arg1 = Static360.method1729(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, this.anInt1643, this.anInt1648, local5, arg2, this);
				} else {
					arg1 = Static360.method1704(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, this.anInt1639, local5, arg2, this);
				}
			} else if (Static18.aBoolean55) {
				arg1 = Static360.method1717(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1635, this.anInt1647, this.anInt1643, this.anInt1648, local5, arg2, this, this.anInt1646, arg4);
			} else {
				arg1 = Static360.method1727(((Class2_Sub12_Sub1) super.aClass2_Sub12_5).aByteArray90, arg0, this.anInt1636, arg1, this.anInt1640, this.anInt1639, local5, arg2, this, this.anInt1646, arg4);
			}
			this.anInt1638 -= arg1;
			if (this.anInt1638 != 0) {
				return arg1;
			}
		} while (!this.method1698());
		return arg3;
	}
}
