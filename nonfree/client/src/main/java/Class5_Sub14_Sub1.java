import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class5_Sub14_Sub1 extends Class5_Sub14 {

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public int anInt1461;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	private int anInt1462;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public int anInt1463;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
	public int anInt1465;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
	private int anInt1467;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
	public int anInt1470;

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
	public int anInt1473;

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
	private final int anInt1471;

	@OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
	private final int anInt1474;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "Z")
	private final boolean aBoolean111;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
	private int anInt1472;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	private int anInt1469;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
	private int anInt1464;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!bc;III)V")
	public Class5_Sub14_Sub1(@OriginalArg(0) Class5_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub9_6 = arg0;
		this.anInt1471 = arg0.anInt489;
		this.anInt1474 = arg0.anInt488;
		this.aBoolean111 = arg0.aBoolean20;
		this.anInt1472 = arg1;
		this.anInt1469 = arg2;
		this.anInt1464 = arg3;
		this.anInt1466 = 0;
		this.method1344();
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "()I")
	public synchronized int method1339() {
		return this.anInt1464 < 0 ? -1 : this.anInt1464;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	public synchronized void method1340(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1350();
			this.method8829();
		} else if (this.anInt1461 == 0 && this.anInt1468 == 0) {
			this.anInt1467 = 0;
			this.anInt1469 = 0;
			this.anInt1465 = 0;
			this.method8829();
		} else {
			@Pc(31) int local31 = -this.anInt1465;
			if (this.anInt1465 > local31) {
				local31 = this.anInt1465;
			}
			if (-this.anInt1461 > local31) {
				local31 = -this.anInt1461;
			}
			if (this.anInt1461 > local31) {
				local31 = this.anInt1461;
			}
			if (-this.anInt1468 > local31) {
				local31 = -this.anInt1468;
			}
			if (this.anInt1468 > local31) {
				local31 = this.anInt1468;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1467 = arg0;
			this.anInt1469 = Integer.MIN_VALUE;
			this.anInt1470 = -this.anInt1465 / arg0;
			this.anInt1463 = -this.anInt1461 / arg0;
			this.anInt1473 = -this.anInt1468 / arg0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public synchronized void method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1366(arg0, arg1, this.method1339());
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([IIIII)I")
	private int method1342(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1467 <= 0) {
				if (this.anInt1472 == -256 && (this.anInt1466 & 0xFF) == 0) {
					if (Static135.aBoolean154) {
						return Static678.method1353(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, arg3, arg2, this);
					}
					return Static678.method1374(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, arg3, arg2, this);
				}
				if (Static135.aBoolean154) {
					return Static678.method1365(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, arg3, arg2, this, this.anInt1472, arg4);
				}
				return Static678.method1372(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, arg3, arg2, this, this.anInt1472, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1467;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1467 += arg1;
			if (this.anInt1472 == -256 && (this.anInt1466 & 0xFF) == 0) {
				if (Static135.aBoolean154) {
					arg1 = Static678.method1370(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, this.anInt1463, this.anInt1473, local5, arg2, this);
				} else {
					arg1 = Static678.method1378(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, this.anInt1470, local5, arg2, this);
				}
			} else if (Static135.aBoolean154) {
				arg1 = Static678.method1354(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, this.anInt1463, this.anInt1473, local5, arg2, this, this.anInt1472, arg4);
			} else {
				arg1 = Static678.method1369(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, this.anInt1470, local5, arg2, this, this.anInt1472, arg4);
			}
			this.anInt1467 -= arg1;
			if (this.anInt1467 != 0) {
				return arg1;
			}
		} while (!this.method1377());
		return arg3;
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "()Z")
	public boolean method1343() {
		return this.anInt1466 < 0 || this.anInt1466 >= ((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4.length << 8;
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "()V")
	private void method1344() {
		this.anInt1465 = this.anInt1469;
		this.anInt1461 = Static678.method1345(this.anInt1469, this.anInt1464);
		this.anInt1468 = Static678.method1356(this.anInt1469, this.anInt1464);
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V")
	public synchronized void method1346(@OriginalArg(0) int arg0) {
		this.method1362(arg0 << 6, this.method1339());
	}

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "()I")
	public synchronized int method1347() {
		return this.anInt1472 < 0 ? -this.anInt1472 : this.anInt1472;
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "(I)V")
	private synchronized void method1350() {
		this.method1362(0, this.method1339());
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8778(@OriginalArg(0) int arg0) {
		if (this.anInt1467 > 0) {
			if (arg0 >= this.anInt1467) {
				if (this.anInt1469 == Integer.MIN_VALUE) {
					this.anInt1469 = 0;
					this.anInt1465 = this.anInt1461 = this.anInt1468 = 0;
					this.method8829();
					arg0 = this.anInt1467;
				}
				this.anInt1467 = 0;
				this.method1344();
			} else {
				this.anInt1465 += this.anInt1470 * arg0;
				this.anInt1461 += this.anInt1463 * arg0;
				this.anInt1468 += this.anInt1473 * arg0;
				this.anInt1467 -= arg0;
			}
		}
		@Pc(71) Class5_Sub9_Sub1 local71 = (Class5_Sub9_Sub1) super.aClass5_Sub9_6;
		@Pc(76) int local76 = this.anInt1471 << 8;
		@Pc(81) int local81 = this.anInt1474 << 8;
		@Pc(87) int local87 = local71.aByteArray4.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1462 = 0;
		}
		if (this.anInt1466 < 0) {
			if (this.anInt1472 <= 0) {
				this.method1358();
				this.method8829();
				return;
			}
			this.anInt1466 = 0;
		}
		if (this.anInt1466 >= local87) {
			if (this.anInt1472 >= 0) {
				this.method1358();
				this.method8829();
				return;
			}
			this.anInt1466 = local87 - 1;
		}
		this.anInt1466 += this.anInt1472 * arg0;
		if (this.anInt1462 >= 0) {
			if (this.anInt1462 > 0) {
				if (this.aBoolean111) {
					label125: {
						if (this.anInt1472 < 0) {
							if (this.anInt1466 >= local76) {
								return;
							}
							this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
							this.anInt1472 = -this.anInt1472;
							if (--this.anInt1462 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1466 < local81) {
								return;
							}
							this.anInt1466 = local81 + local81 - this.anInt1466 - 1;
							this.anInt1472 = -this.anInt1472;
							if (--this.anInt1462 == 0) {
								break;
							}
							if (this.anInt1466 >= local76) {
								return;
							}
							this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
							this.anInt1472 = -this.anInt1472;
						} while (--this.anInt1462 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1472 < 0) {
						if (this.anInt1466 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1466 - 1) / local91;
						if (local361 < this.anInt1462) {
							this.anInt1466 += local91 * local361;
							this.anInt1462 -= local361;
							return;
						}
						this.anInt1466 += local91 * this.anInt1462;
						this.anInt1462 = 0;
					} else if (this.anInt1466 >= local81) {
						local361 = (this.anInt1466 - local76) / local91;
						if (local361 < this.anInt1462) {
							this.anInt1466 -= local91 * local361;
							this.anInt1462 -= local361;
							return;
						}
						this.anInt1466 -= local91 * this.anInt1462;
						this.anInt1462 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1472 < 0) {
				if (this.anInt1466 < 0) {
					this.anInt1466 = -1;
					this.method1358();
					this.method8829();
					return;
				}
			} else if (this.anInt1466 >= local87) {
				this.anInt1466 = local87;
				this.method1358();
				this.method8829();
			}
		} else if (this.aBoolean111) {
			if (this.anInt1472 < 0) {
				if (this.anInt1466 >= local76) {
					return;
				}
				this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
				this.anInt1472 = -this.anInt1472;
			}
			while (this.anInt1466 >= local81) {
				this.anInt1466 = local81 + local81 - this.anInt1466 - 1;
				this.anInt1472 = -this.anInt1472;
				if (this.anInt1466 >= local76) {
					return;
				}
				this.anInt1466 = local76 + local76 - this.anInt1466 - 1;
				this.anInt1472 = -this.anInt1472;
			}
		} else if (this.anInt1472 < 0) {
			if (this.anInt1466 < local76) {
				this.anInt1466 = local81 - (local81 - 1 - this.anInt1466) % local91 - 1;
			}
		} else if (this.anInt1466 >= local81) {
			this.anInt1466 = local76 + (this.anInt1466 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "()I")
	public synchronized int method1355() {
		return this.anInt1469 == Integer.MIN_VALUE ? 0 : this.anInt1469;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
	public synchronized void method1357() {
		this.anInt1472 = (this.anInt1472 ^ this.anInt1472 >> 31) + (this.anInt1472 >>> 31);
		this.anInt1472 = -this.anInt1472;
	}

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "()V")
	private void method1358() {
		if (this.anInt1467 == 0) {
			return;
		}
		if (this.anInt1469 == Integer.MIN_VALUE) {
			this.anInt1469 = 0;
		}
		this.anInt1467 = 0;
		this.method1344();
	}

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)V")
	public synchronized void method1360(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1466 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "(I)V")
	public synchronized void method1361(@OriginalArg(0) int arg0) {
		this.anInt1462 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1469 == 0 && this.anInt1467 == 0) {
			this.method8778(arg2);
			return;
		}
		@Pc(13) Class5_Sub9_Sub1 local13 = (Class5_Sub9_Sub1) super.aClass5_Sub9_6;
		@Pc(18) int local18 = this.anInt1471 << 8;
		@Pc(23) int local23 = this.anInt1474 << 8;
		@Pc(29) int local29 = local13.aByteArray4.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1462 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1466 < 0) {
			if (this.anInt1472 <= 0) {
				this.method1358();
				this.method8829();
				return;
			}
			this.anInt1466 = 0;
		}
		if (this.anInt1466 >= local29) {
			if (this.anInt1472 >= 0) {
				this.method1358();
				this.method8829();
				return;
			}
			this.anInt1466 = local29 - 1;
		}
		if (this.anInt1462 >= 0) {
			if (this.anInt1462 > 0) {
				if (this.aBoolean111) {
					label130: {
						if (this.anInt1472 < 0) {
							local40 = this.method1342(arg0, arg1, local18, local44, local13.aByteArray4[this.anInt1471]);
							if (this.anInt1466 >= local18) {
								return;
							}
							this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
							this.anInt1472 = -this.anInt1472;
							if (--this.anInt1462 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1373(arg0, local40, local23, local44, local13.aByteArray4[this.anInt1474 - 1]);
							if (this.anInt1466 < local23) {
								return;
							}
							this.anInt1466 = local23 + local23 - this.anInt1466 - 1;
							this.anInt1472 = -this.anInt1472;
							if (--this.anInt1462 == 0) {
								break;
							}
							local40 = this.method1342(arg0, local40, local18, local44, local13.aByteArray4[this.anInt1471]);
							if (this.anInt1466 >= local18) {
								return;
							}
							this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
							this.anInt1472 = -this.anInt1472;
						} while (--this.anInt1462 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1472 < 0) {
						while (true) {
							local40 = this.method1342(arg0, local40, local18, local44, local13.aByteArray4[this.anInt1474 - 1]);
							if (this.anInt1466 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1466 - 1) / local33;
							if (local416 >= this.anInt1462) {
								this.anInt1466 += local33 * this.anInt1462;
								this.anInt1462 = 0;
								break;
							}
							this.anInt1466 += local33 * local416;
							this.anInt1462 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1373(arg0, local40, local23, local44, local13.aByteArray4[this.anInt1471]);
							if (this.anInt1466 < local23) {
								return;
							}
							local416 = (this.anInt1466 - local18) / local33;
							if (local416 >= this.anInt1462) {
								this.anInt1466 -= local33 * this.anInt1462;
								this.anInt1462 = 0;
								break;
							}
							this.anInt1466 -= local33 * local416;
							this.anInt1462 -= local416;
						}
					}
				}
			}
			if (this.anInt1472 < 0) {
				this.method1342(arg0, local40, 0, local44, 0);
				if (this.anInt1466 < 0) {
					this.anInt1466 = -1;
					this.method1358();
					this.method8829();
					return;
				}
			} else {
				this.method1373(arg0, local40, local29, local44, 0);
				if (this.anInt1466 >= local29) {
					this.anInt1466 = local29;
					this.method1358();
					this.method8829();
				}
			}
		} else if (this.aBoolean111) {
			if (this.anInt1472 < 0) {
				local40 = this.method1342(arg0, arg1, local18, local44, local13.aByteArray4[this.anInt1471]);
				if (this.anInt1466 >= local18) {
					return;
				}
				this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
				this.anInt1472 = -this.anInt1472;
			}
			while (true) {
				local40 = this.method1373(arg0, local40, local23, local44, local13.aByteArray4[this.anInt1474 - 1]);
				if (this.anInt1466 < local23) {
					return;
				}
				this.anInt1466 = local23 + local23 - this.anInt1466 - 1;
				this.anInt1472 = -this.anInt1472;
				local40 = this.method1342(arg0, local40, local18, local44, local13.aByteArray4[this.anInt1471]);
				if (this.anInt1466 >= local18) {
					return;
				}
				this.anInt1466 = local18 + local18 - this.anInt1466 - 1;
				this.anInt1472 = -this.anInt1472;
			}
		} else if (this.anInt1472 < 0) {
			while (true) {
				local40 = this.method1342(arg0, local40, local18, local44, local13.aByteArray4[this.anInt1474 - 1]);
				if (this.anInt1466 >= local18) {
					return;
				}
				this.anInt1466 = local23 - (local23 - 1 - this.anInt1466) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1373(arg0, local40, local23, local44, local13.aByteArray4[this.anInt1471]);
				if (this.anInt1466 < local23) {
					return;
				}
				this.anInt1466 = local18 + (this.anInt1466 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)V")
	private synchronized void method1362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1469 = arg0;
		this.anInt1464 = arg1;
		this.anInt1467 = 0;
		this.method1344();
	}

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "(I)V")
	public synchronized void method1364(@OriginalArg(0) int arg0) {
		this.method1362(this.method1355(), arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8779() {
		return null;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)V")
	public synchronized void method1366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1362(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static678.method1345(arg1, arg2);
		@Pc(14) int local14 = Static678.method1356(arg1, arg2);
		if (this.anInt1461 == local10 && this.anInt1468 == local14) {
			this.anInt1467 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1465;
		if (this.anInt1465 - arg1 > local31) {
			local31 = this.anInt1465 - arg1;
		}
		if (local10 - this.anInt1461 > local31) {
			local31 = local10 - this.anInt1461;
		}
		if (this.anInt1461 - local10 > local31) {
			local31 = this.anInt1461 - local10;
		}
		if (local14 - this.anInt1468 > local31) {
			local31 = local14 - this.anInt1468;
		}
		if (this.anInt1468 - local14 > local31) {
			local31 = this.anInt1468 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1467 = arg0;
		this.anInt1469 = arg1;
		this.anInt1464 = arg2;
		this.anInt1470 = (arg1 - this.anInt1465) / arg0;
		this.anInt1463 = (local10 - this.anInt1461) / arg0;
		this.anInt1473 = (local14 - this.anInt1468) / arg0;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8780() {
		return null;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "()I")
	@Override
	public int method8782() {
		@Pc(6) int local6 = this.anInt1465 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1462 == 0) {
			local6 -= local6 * this.anInt1466 / (((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4.length << 8);
		} else if (this.anInt1462 >= 0) {
			local6 -= local6 * this.anInt1471 / ((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "()Z")
	public boolean method1371() {
		return this.anInt1467 != 0;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "([IIIII)I")
	private int method1373(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1467 <= 0) {
				if (this.anInt1472 == 256 && (this.anInt1466 & 0xFF) == 0) {
					if (Static135.aBoolean154) {
						return Static678.method1363(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, arg3, arg2, this);
					}
					return Static678.method1376(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, arg3, arg2, this);
				}
				if (Static135.aBoolean154) {
					return Static678.method1359(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, arg3, arg2, this, this.anInt1472, arg4);
				}
				return Static678.method1367(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, arg3, arg2, this, this.anInt1472, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1467;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1467 += arg1;
			if (this.anInt1472 == 256 && (this.anInt1466 & 0xFF) == 0) {
				if (Static135.aBoolean154) {
					arg1 = Static678.method1348(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, this.anInt1463, this.anInt1473, local5, arg2, this);
				} else {
					arg1 = Static678.method1352(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, this.anInt1470, local5, arg2, this);
				}
			} else if (Static135.aBoolean154) {
				arg1 = Static678.method1368(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1461, this.anInt1468, this.anInt1463, this.anInt1473, local5, arg2, this, this.anInt1472, arg4);
			} else {
				arg1 = Static678.method1351(((Class5_Sub9_Sub1) super.aClass5_Sub9_6).aByteArray4, arg0, this.anInt1466, arg1, this.anInt1465, this.anInt1470, local5, arg2, this, this.anInt1472, arg4);
			}
			this.anInt1467 -= arg1;
			if (this.anInt1467 != 0) {
				return arg1;
			}
		} while (!this.method1377());
		return arg3;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "()I")
	@Override
	public int method8783() {
		return this.anInt1469 == 0 && this.anInt1467 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "(I)V")
	public synchronized void method1375(@OriginalArg(0) int arg0) {
		if (this.anInt1472 < 0) {
			this.anInt1472 = -arg0;
		} else {
			this.anInt1472 = arg0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "()Z")
	private boolean method1377() {
		@Pc(2) int local2 = this.anInt1469;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static678.method1345(local2, this.anInt1464);
			local8 = Static678.method1356(local2, this.anInt1464);
		}
		if (this.anInt1465 != local2 || this.anInt1461 != local10 || this.anInt1468 != local8) {
			if (this.anInt1465 < local2) {
				this.anInt1470 = 1;
				this.anInt1467 = local2 - this.anInt1465;
			} else if (this.anInt1465 > local2) {
				this.anInt1470 = -1;
				this.anInt1467 = this.anInt1465 - local2;
			} else {
				this.anInt1470 = 0;
			}
			if (this.anInt1461 < local10) {
				this.anInt1463 = 1;
				if (this.anInt1467 == 0 || this.anInt1467 > local10 - this.anInt1461) {
					this.anInt1467 = local10 - this.anInt1461;
				}
			} else if (this.anInt1461 > local10) {
				this.anInt1463 = -1;
				if (this.anInt1467 == 0 || this.anInt1467 > this.anInt1461 - local10) {
					this.anInt1467 = this.anInt1461 - local10;
				}
			} else {
				this.anInt1463 = 0;
			}
			if (this.anInt1468 < local8) {
				this.anInt1473 = 1;
				if (this.anInt1467 == 0 || this.anInt1467 > local8 - this.anInt1468) {
					this.anInt1467 = local8 - this.anInt1468;
				}
			} else if (this.anInt1468 > local8) {
				this.anInt1473 = -1;
				if (this.anInt1467 == 0 || this.anInt1467 > this.anInt1468 - local8) {
					this.anInt1467 = this.anInt1468 - local8;
				}
			} else {
				this.anInt1473 = 0;
			}
			return false;
		} else if (this.anInt1469 == Integer.MIN_VALUE) {
			this.anInt1469 = 0;
			this.anInt1465 = this.anInt1461 = this.anInt1468 = 0;
			this.method8829();
			return true;
		} else {
			this.method1344();
			return false;
		}
	}
}
