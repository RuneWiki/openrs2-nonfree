import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!i", name = "E", descriptor = "I")
	public int anInt1429;

	@OriginalMember(owner = "client!i", name = "G", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!i", name = "I", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	private int anInt1435;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "I")
	public int anInt1437;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	public int anInt1438;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "I")
	private int anInt1440;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "I")
	private final int anInt1432;

	@OriginalMember(owner = "client!i", name = "F", descriptor = "I")
	private final int anInt1430;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "Z")
	private final boolean aBoolean127;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "I")
	private int anInt1436;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
	private int anInt1441;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "I")
	private int anInt1439;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!pd;II)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class1_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub16_5 = arg0;
		this.anInt1432 = arg0.anInt2190;
		this.anInt1430 = arg0.anInt2192;
		this.aBoolean127 = arg0.aBoolean185;
		this.anInt1436 = arg1;
		this.anInt1441 = arg2;
		this.anInt1439 = 8192;
		this.anInt1434 = 0;
		this.method933();
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!pd;III)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class1_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub16_5 = arg0;
		this.anInt1432 = arg0.anInt2190;
		this.anInt1430 = arg0.anInt2192;
		this.aBoolean127 = arg0.aBoolean185;
		this.anInt1436 = arg1;
		this.anInt1441 = arg2;
		this.anInt1439 = arg3;
		this.anInt1434 = 0;
		this.method933();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([IIIII)I")
	private int method914(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1435 <= 0) {
				if (this.anInt1436 == 256 && (this.anInt1434 & 0xFF) == 0) {
					if (Static18.aBoolean56) {
						return Static131.method915(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, arg3, arg2, this);
					}
					return Static131.method934(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, arg3, arg2, this);
				}
				if (Static18.aBoolean56) {
					return Static131.method943(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, arg3, arg2, this, this.anInt1436, arg4);
				}
				return Static131.method919(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, arg3, arg2, this, this.anInt1436, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1435;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1435 += arg1;
			if (this.anInt1436 == 256 && (this.anInt1434 & 0xFF) == 0) {
				if (Static18.aBoolean56) {
					arg1 = Static131.method935(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, this.anInt1442, this.anInt1431, local5, arg2, this);
				} else {
					arg1 = Static131.method947(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, this.anInt1438, local5, arg2, this);
				}
			} else if (Static18.aBoolean56) {
				arg1 = Static131.method927(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, this.anInt1442, this.anInt1431, local5, arg2, this, this.anInt1436, arg4);
			} else {
				arg1 = Static131.method918(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, this.anInt1438, local5, arg2, this, this.anInt1436, arg4);
			}
			this.anInt1435 -= arg1;
			if (this.anInt1435 != 0) {
				return arg1;
			}
		} while (!this.method938());
		return arg3;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
	@Override
	public int method1733() {
		return this.anInt1441 == 0 && this.anInt1435 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public synchronized void method921(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1434 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "([IIIII)I")
	private int method922(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1435 <= 0) {
				if (this.anInt1436 == -256 && (this.anInt1434 & 0xFF) == 0) {
					if (Static18.aBoolean56) {
						return Static131.method944(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, arg3, arg2, this);
					}
					return Static131.method916(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, arg3, arg2, this);
				}
				if (Static18.aBoolean56) {
					return Static131.method941(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, arg3, arg2, this, this.anInt1436, arg4);
				}
				return Static131.method926(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, arg3, arg2, this, this.anInt1436, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1435;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1435 += arg1;
			if (this.anInt1436 == -256 && (this.anInt1434 & 0xFF) == 0) {
				if (Static18.aBoolean56) {
					arg1 = Static131.method937(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, this.anInt1442, this.anInt1431, local5, arg2, this);
				} else {
					arg1 = Static131.method930(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, this.anInt1438, local5, arg2, this);
				}
			} else if (Static18.aBoolean56) {
				arg1 = Static131.method917(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1429, this.anInt1437, this.anInt1442, this.anInt1431, local5, arg2, this, this.anInt1436, arg4);
			} else {
				arg1 = Static131.method928(((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72, arg0, this.anInt1434, arg1, this.anInt1433, this.anInt1438, local5, arg2, this, this.anInt1436, arg4);
			}
			this.anInt1435 -= arg1;
			if (this.anInt1435 != 0) {
				return arg1;
			}
		} while (!this.method938());
		return arg3;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()Lclient!qf;")
	@Override
	public Class1_Sub8 method1738() {
		return null;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public synchronized void method923(@OriginalArg(0) int arg0) {
		this.anInt1440 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(II)V")
	public synchronized void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method945(arg0, arg1, this.method929());
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()I")
	public synchronized int method929() {
		return this.anInt1439 < 0 ? -1 : this.anInt1439;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1441 == 0 && this.anInt1435 == 0) {
			this.method1739(arg2);
			return;
		}
		@Pc(13) Class1_Sub16_Sub1 local13 = (Class1_Sub16_Sub1) super.aClass1_Sub16_5;
		@Pc(18) int local18 = this.anInt1432 << 8;
		@Pc(23) int local23 = this.anInt1430 << 8;
		@Pc(29) int local29 = local13.aByteArray72.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1440 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1434 < 0) {
			if (this.anInt1436 <= 0) {
				this.method936();
				this.method2128();
				return;
			}
			this.anInt1434 = 0;
		}
		if (this.anInt1434 >= local29) {
			if (this.anInt1436 >= 0) {
				this.method936();
				this.method2128();
				return;
			}
			this.anInt1434 = local29 - 1;
		}
		if (this.anInt1440 >= 0) {
			if (this.anInt1440 > 0) {
				if (this.aBoolean127) {
					label130: {
						if (this.anInt1436 < 0) {
							local40 = this.method922(arg0, arg1, local18, local44, local13.aByteArray72[this.anInt1432]);
							if (this.anInt1434 >= local18) {
								return;
							}
							this.anInt1434 = local18 + local18 - this.anInt1434 - 1;
							this.anInt1436 = -this.anInt1436;
							if (--this.anInt1440 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method914(arg0, local40, local23, local44, local13.aByteArray72[this.anInt1430 - 1]);
							if (this.anInt1434 < local23) {
								return;
							}
							this.anInt1434 = local23 + local23 - this.anInt1434 - 1;
							this.anInt1436 = -this.anInt1436;
							if (--this.anInt1440 == 0) {
								break;
							}
							local40 = this.method922(arg0, local40, local18, local44, local13.aByteArray72[this.anInt1432]);
							if (this.anInt1434 >= local18) {
								return;
							}
							this.anInt1434 = local18 + local18 - this.anInt1434 - 1;
							this.anInt1436 = -this.anInt1436;
						} while (--this.anInt1440 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1436 < 0) {
						while (true) {
							local40 = this.method922(arg0, local40, local18, local44, local13.aByteArray72[this.anInt1430 - 1]);
							if (this.anInt1434 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1434 - 1) / local33;
							if (local416 >= this.anInt1440) {
								this.anInt1434 += local33 * this.anInt1440;
								this.anInt1440 = 0;
								break;
							}
							this.anInt1434 += local33 * local416;
							this.anInt1440 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method914(arg0, local40, local23, local44, local13.aByteArray72[this.anInt1432]);
							if (this.anInt1434 < local23) {
								return;
							}
							local416 = (this.anInt1434 - local18) / local33;
							if (local416 >= this.anInt1440) {
								this.anInt1434 -= local33 * this.anInt1440;
								this.anInt1440 = 0;
								break;
							}
							this.anInt1434 -= local33 * local416;
							this.anInt1440 -= local416;
						}
					}
				}
			}
			if (this.anInt1436 < 0) {
				this.method922(arg0, local40, 0, local44, 0);
				if (this.anInt1434 < 0) {
					this.anInt1434 = -1;
					this.method936();
					this.method2128();
					return;
				}
			} else {
				this.method914(arg0, local40, local29, local44, 0);
				if (this.anInt1434 >= local29) {
					this.anInt1434 = local29;
					this.method936();
					this.method2128();
				}
			}
		} else if (this.aBoolean127) {
			if (this.anInt1436 < 0) {
				local40 = this.method922(arg0, arg1, local18, local44, local13.aByteArray72[this.anInt1432]);
				if (this.anInt1434 >= local18) {
					return;
				}
				this.anInt1434 = local18 + local18 - this.anInt1434 - 1;
				this.anInt1436 = -this.anInt1436;
			}
			while (true) {
				local40 = this.method914(arg0, local40, local23, local44, local13.aByteArray72[this.anInt1430 - 1]);
				if (this.anInt1434 < local23) {
					return;
				}
				this.anInt1434 = local23 + local23 - this.anInt1434 - 1;
				this.anInt1436 = -this.anInt1436;
				local40 = this.method922(arg0, local40, local18, local44, local13.aByteArray72[this.anInt1432]);
				if (this.anInt1434 >= local18) {
					return;
				}
				this.anInt1434 = local18 + local18 - this.anInt1434 - 1;
				this.anInt1436 = -this.anInt1436;
			}
		} else if (this.anInt1436 < 0) {
			while (true) {
				local40 = this.method922(arg0, local40, local18, local44, local13.aByteArray72[this.anInt1430 - 1]);
				if (this.anInt1434 >= local18) {
					return;
				}
				this.anInt1434 = local23 - (local23 - 1 - this.anInt1434) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method914(arg0, local40, local23, local44, local13.aByteArray72[this.anInt1432]);
				if (this.anInt1434 < local23) {
					return;
				}
				this.anInt1434 = local18 + (this.anInt1434 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public synchronized void method932(@OriginalArg(0) int arg0) {
		if (this.anInt1436 < 0) {
			this.anInt1436 = -arg0;
		} else {
			this.anInt1436 = arg0;
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	private void method933() {
		this.anInt1433 = this.anInt1441;
		this.anInt1429 = Static131.method931(this.anInt1441, this.anInt1439);
		this.anInt1437 = Static131.method924(this.anInt1441, this.anInt1439);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Lclient!qf;")
	@Override
	public Class1_Sub8 method1734() {
		return null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1739(@OriginalArg(0) int arg0) {
		if (this.anInt1435 > 0) {
			if (arg0 >= this.anInt1435) {
				if (this.anInt1441 == Integer.MIN_VALUE) {
					this.anInt1441 = 0;
					this.anInt1433 = this.anInt1429 = this.anInt1437 = 0;
					this.method2128();
					arg0 = this.anInt1435;
				}
				this.anInt1435 = 0;
				this.method933();
			} else {
				this.anInt1433 += this.anInt1438 * arg0;
				this.anInt1429 += this.anInt1442 * arg0;
				this.anInt1437 += this.anInt1431 * arg0;
				this.anInt1435 -= arg0;
			}
		}
		@Pc(71) Class1_Sub16_Sub1 local71 = (Class1_Sub16_Sub1) super.aClass1_Sub16_5;
		@Pc(76) int local76 = this.anInt1432 << 8;
		@Pc(81) int local81 = this.anInt1430 << 8;
		@Pc(87) int local87 = local71.aByteArray72.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1440 = 0;
		}
		if (this.anInt1434 < 0) {
			if (this.anInt1436 <= 0) {
				this.method936();
				this.method2128();
				return;
			}
			this.anInt1434 = 0;
		}
		if (this.anInt1434 >= local87) {
			if (this.anInt1436 >= 0) {
				this.method936();
				this.method2128();
				return;
			}
			this.anInt1434 = local87 - 1;
		}
		this.anInt1434 += this.anInt1436 * arg0;
		if (this.anInt1440 >= 0) {
			if (this.anInt1440 > 0) {
				if (this.aBoolean127) {
					label125: {
						if (this.anInt1436 < 0) {
							if (this.anInt1434 >= local76) {
								return;
							}
							this.anInt1434 = local76 + local76 - this.anInt1434 - 1;
							this.anInt1436 = -this.anInt1436;
							if (--this.anInt1440 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1434 < local81) {
								return;
							}
							this.anInt1434 = local81 + local81 - this.anInt1434 - 1;
							this.anInt1436 = -this.anInt1436;
							if (--this.anInt1440 == 0) {
								break;
							}
							if (this.anInt1434 >= local76) {
								return;
							}
							this.anInt1434 = local76 + local76 - this.anInt1434 - 1;
							this.anInt1436 = -this.anInt1436;
						} while (--this.anInt1440 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1436 < 0) {
						if (this.anInt1434 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1434 - 1) / local91;
						if (local361 < this.anInt1440) {
							this.anInt1434 += local91 * local361;
							this.anInt1440 -= local361;
							return;
						}
						this.anInt1434 += local91 * this.anInt1440;
						this.anInt1440 = 0;
					} else if (this.anInt1434 >= local81) {
						local361 = (this.anInt1434 - local76) / local91;
						if (local361 < this.anInt1440) {
							this.anInt1434 -= local91 * local361;
							this.anInt1440 -= local361;
							return;
						}
						this.anInt1434 -= local91 * this.anInt1440;
						this.anInt1440 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1436 < 0) {
				if (this.anInt1434 < 0) {
					this.anInt1434 = -1;
					this.method936();
					this.method2128();
					return;
				}
			} else if (this.anInt1434 >= local87) {
				this.anInt1434 = local87;
				this.method936();
				this.method2128();
			}
		} else if (this.aBoolean127) {
			if (this.anInt1436 < 0) {
				if (this.anInt1434 >= local76) {
					return;
				}
				this.anInt1434 = local76 + local76 - this.anInt1434 - 1;
				this.anInt1436 = -this.anInt1436;
			}
			while (this.anInt1434 >= local81) {
				this.anInt1434 = local81 + local81 - this.anInt1434 - 1;
				this.anInt1436 = -this.anInt1436;
				if (this.anInt1434 >= local76) {
					return;
				}
				this.anInt1434 = local76 + local76 - this.anInt1434 - 1;
				this.anInt1436 = -this.anInt1436;
			}
		} else if (this.anInt1436 < 0) {
			if (this.anInt1434 < local76) {
				this.anInt1434 = local81 - (local81 - 1 - this.anInt1434) % local91 - 1;
			}
		} else if (this.anInt1434 >= local81) {
			this.anInt1434 = local76 + (this.anInt1434 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	private void method936() {
		if (this.anInt1435 == 0) {
			return;
		}
		if (this.anInt1441 == Integer.MIN_VALUE) {
			this.anInt1441 = 0;
		}
		this.anInt1435 = 0;
		this.method933();
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "()Z")
	private boolean method938() {
		@Pc(2) int local2 = this.anInt1441;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static131.method931(local2, this.anInt1439);
			local8 = Static131.method924(local2, this.anInt1439);
		}
		if (this.anInt1433 != local2 || this.anInt1429 != local10 || this.anInt1437 != local8) {
			if (this.anInt1433 < local2) {
				this.anInt1438 = 1;
				this.anInt1435 = local2 - this.anInt1433;
			} else if (this.anInt1433 > local2) {
				this.anInt1438 = -1;
				this.anInt1435 = this.anInt1433 - local2;
			} else {
				this.anInt1438 = 0;
			}
			if (this.anInt1429 < local10) {
				this.anInt1442 = 1;
				if (this.anInt1435 == 0 || this.anInt1435 > local10 - this.anInt1429) {
					this.anInt1435 = local10 - this.anInt1429;
				}
			} else if (this.anInt1429 > local10) {
				this.anInt1442 = -1;
				if (this.anInt1435 == 0 || this.anInt1435 > this.anInt1429 - local10) {
					this.anInt1435 = this.anInt1429 - local10;
				}
			} else {
				this.anInt1442 = 0;
			}
			if (this.anInt1437 < local8) {
				this.anInt1431 = 1;
				if (this.anInt1435 == 0 || this.anInt1435 > local8 - this.anInt1437) {
					this.anInt1435 = local8 - this.anInt1437;
				}
			} else if (this.anInt1437 > local8) {
				this.anInt1431 = -1;
				if (this.anInt1435 == 0 || this.anInt1435 > this.anInt1437 - local8) {
					this.anInt1435 = this.anInt1437 - local8;
				}
			} else {
				this.anInt1431 = 0;
			}
			return false;
		} else if (this.anInt1441 == Integer.MIN_VALUE) {
			this.anInt1441 = 0;
			this.anInt1433 = this.anInt1429 = this.anInt1437 = 0;
			this.method2128();
			return true;
		} else {
			this.method933();
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "()I")
	public synchronized int method939() {
		return this.anInt1441 == Integer.MIN_VALUE ? 0 : this.anInt1441;
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "()Z")
	public boolean method940() {
		return this.anInt1434 < 0 || this.anInt1434 >= ((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72.length << 8;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	private synchronized void method942() {
		this.method946(0, this.method929());
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public synchronized void method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method946(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static131.method931(arg1, arg2);
		@Pc(14) int local14 = Static131.method924(arg1, arg2);
		if (this.anInt1429 == local10 && this.anInt1437 == local14) {
			this.anInt1435 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1433;
		if (this.anInt1433 - arg1 > local31) {
			local31 = this.anInt1433 - arg1;
		}
		if (local10 - this.anInt1429 > local31) {
			local31 = local10 - this.anInt1429;
		}
		if (this.anInt1429 - local10 > local31) {
			local31 = this.anInt1429 - local10;
		}
		if (local14 - this.anInt1437 > local31) {
			local31 = local14 - this.anInt1437;
		}
		if (this.anInt1437 - local14 > local31) {
			local31 = this.anInt1437 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1435 = arg0;
		this.anInt1441 = arg1;
		this.anInt1439 = arg2;
		this.anInt1438 = (arg1 - this.anInt1433) / arg0;
		this.anInt1442 = (local10 - this.anInt1429) / arg0;
		this.anInt1431 = (local14 - this.anInt1437) / arg0;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(II)V")
	private synchronized void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1441 = arg0;
		this.anInt1439 = arg1;
		this.anInt1435 = 0;
		this.method933();
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()I")
	@Override
	public int method1735() {
		@Pc(6) int local6 = this.anInt1433 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1440 == 0) {
			local6 -= local6 * this.anInt1434 / (((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72.length << 8);
		} else if (this.anInt1440 >= 0) {
			local6 -= local6 * this.anInt1432 / ((Class1_Sub16_Sub1) super.aClass1_Sub16_5).aByteArray72.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
	public synchronized void method949() {
		this.anInt1436 = (this.anInt1436 ^ this.anInt1436 >> 31) + (this.anInt1436 >>> 31);
		this.anInt1436 = -this.anInt1436;
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "()I")
	public synchronized int method950() {
		return this.anInt1436 < 0 ? -this.anInt1436 : this.anInt1436;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public synchronized void method951(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method942();
			this.method2128();
		} else if (this.anInt1429 == 0 && this.anInt1437 == 0) {
			this.anInt1435 = 0;
			this.anInt1441 = 0;
			this.anInt1433 = 0;
			this.method2128();
		} else {
			@Pc(31) int local31 = -this.anInt1433;
			if (this.anInt1433 > local31) {
				local31 = this.anInt1433;
			}
			if (-this.anInt1429 > local31) {
				local31 = -this.anInt1429;
			}
			if (this.anInt1429 > local31) {
				local31 = this.anInt1429;
			}
			if (-this.anInt1437 > local31) {
				local31 = -this.anInt1437;
			}
			if (this.anInt1437 > local31) {
				local31 = this.anInt1437;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1435 = arg0;
			this.anInt1441 = Integer.MIN_VALUE;
			this.anInt1438 = -this.anInt1433 / arg0;
			this.anInt1442 = -this.anInt1429 / arg0;
			this.anInt1431 = -this.anInt1437 / arg0;
		}
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "()Z")
	public boolean method952() {
		return this.anInt1435 != 0;
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
	public synchronized void method953(@OriginalArg(0) int arg0) {
		this.method946(arg0 << 6, this.method929());
	}
}
