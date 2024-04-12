import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	private int anInt1539;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "I")
	private int anInt1541;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	private int anInt1542;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	private int anInt1543;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "I")
	private int anInt1545;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	private final int anInt1536;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	private final int anInt1540;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	private int anInt1537;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "I")
	public int anInt1544;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	public int anInt1538;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 33)
	public synchronized void method1027(@OriginalArg(0) int arg0) {
		this.anInt1543 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIII)I", line = 70)
	private int method1029(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1542 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1542;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1542 += arg1;
			if (this.anInt1537 == 256 && (this.anInt1538 & 0xFF) == 0) {
				arg1 = Static108.method1033(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this);
			} else {
				arg1 = Static108.method1035(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this, this.anInt1537, arg4);
			}
			this.anInt1542 -= arg1;
			if (this.anInt1542 != 0) {
				return arg1;
			}
			if (this.anInt1545 == Integer.MIN_VALUE) {
				this.method1677();
				return arg3;
			}
			this.anInt1544 = this.anInt1545;
		}
		return this.anInt1537 == 256 && (this.anInt1538 & 0xFF) == 0 ? Static108.method1036(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this) : Static108.method1030(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this, this.anInt1537, arg4);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([IIIII)I", line = 138)
	private int method1031(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1542 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1542;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1542 += arg1;
			if (this.anInt1537 == -256 && (this.anInt1538 & 0xFF) == 0) {
				arg1 = Static108.method1028(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this);
			} else {
				arg1 = Static108.method1037(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this, this.anInt1537, arg4);
			}
			this.anInt1542 -= arg1;
			if (this.anInt1542 != 0) {
				return arg1;
			}
			if (this.anInt1545 == Integer.MIN_VALUE) {
				this.method1677();
				return arg3;
			}
			this.anInt1544 = this.anInt1545;
		}
		return this.anInt1537 == -256 && (this.anInt1538 & 0xFF) == 0 ? Static108.method1026(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this) : Static108.method1034(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this, this.anInt1537, arg4);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 245)
	@Override
	public synchronized void method1287(@OriginalArg(0) int arg0) {
		if (this.anInt1542 > 0) {
			if (arg0 >= this.anInt1542) {
				if (this.anInt1545 == Integer.MIN_VALUE) {
					this.method1677();
					arg0 = this.anInt1542;
				} else {
					this.anInt1544 = this.anInt1545;
				}
				this.anInt1542 = 0;
			} else {
				this.anInt1544 += this.anInt1539 * arg0;
				this.anInt1542 -= arg0;
			}
		}
		this.anInt1538 += this.anInt1537 * arg0;
		@Pc(53) Class2_Sub4_Sub1 local53 = (Class2_Sub4_Sub1) super.aClass2_Sub4_3;
		@Pc(58) int local58 = this.anInt1536 << 8;
		@Pc(63) int local63 = this.anInt1540 << 8;
		@Pc(69) int local69 = local53.aByteArray8.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt1543 = 0;
		}
		if (this.anInt1543 >= 0) {
			if (this.anInt1543 > 0) {
				if (this.aBoolean120) {
					label113: {
						if (this.anInt1537 < 0) {
							if (this.anInt1538 >= local58) {
								return;
							}
							this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.anInt1543 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt1538 < local63) {
								return;
							}
							this.anInt1538 = local63 + local63 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.anInt1543 == 0) {
								break;
							}
							if (this.anInt1538 >= local58) {
								return;
							}
							this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
						} while (--this.anInt1543 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt1537 < 0) {
						if (this.anInt1538 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt1538 - 1) / local73;
						if (local299 < this.anInt1543) {
							this.anInt1538 += local73 * local299;
							this.anInt1543 -= local299;
							return;
						}
						this.anInt1538 += local73 * this.anInt1543;
						this.anInt1543 = 0;
					} else if (this.anInt1538 >= local63) {
						local299 = (this.anInt1538 - local58) / local73;
						if (local299 < this.anInt1543) {
							this.anInt1538 -= local73 * local299;
							this.anInt1543 -= local299;
							return;
						}
						this.anInt1538 -= local73 * this.anInt1543;
						this.anInt1543 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1537 < 0) {
				if (this.anInt1538 < 0) {
					this.anInt1538 = 0;
					this.method1677();
					return;
				}
			} else if (this.anInt1538 >= local69) {
				this.anInt1538 = local69 - 1;
				this.method1677();
			}
		} else if (this.aBoolean120) {
			if (this.anInt1537 < 0) {
				if (this.anInt1538 >= local58) {
					return;
				}
				this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
			while (this.anInt1538 >= local63) {
				this.anInt1538 = local63 + local63 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
				if (this.anInt1538 >= local58) {
					return;
				}
				this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
		} else if (this.anInt1537 < 0) {
			if (this.anInt1538 < local58) {
				this.anInt1538 = local63 - (local63 - 1 - this.anInt1538) % local73 - 1;
			}
		} else if (this.anInt1538 >= local63) {
			this.anInt1538 = local58 + (this.anInt1538 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([III)I", line = 436)
	@Override
	public synchronized int method1286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1544 == 0 && (this.anInt1542 == 0 || this.anInt1545 == 0 || this.anInt1545 == Integer.MIN_VALUE)) {
			this.method1287(arg2);
			return 0;
		}
		@Pc(21) Class2_Sub4_Sub1 local21 = (Class2_Sub4_Sub1) super.aClass2_Sub4_3;
		@Pc(26) int local26 = this.anInt1536 << 8;
		@Pc(31) int local31 = this.anInt1540 << 8;
		@Pc(37) int local37 = local21.aByteArray8.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt1543 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt1543 >= 0) {
			if (this.anInt1543 > 0) {
				if (this.aBoolean120) {
					label118: {
						if (this.anInt1537 < 0) {
							local48 = this.method1031(arg0, arg1, local26, local52, local21.aByteArray8[this.anInt1536]);
							if (this.anInt1538 >= local26) {
								return 1;
							}
							this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.anInt1543 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.anInt1540 - 1]);
							if (this.anInt1538 < local31) {
								return 1;
							}
							this.anInt1538 = local31 + local31 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.anInt1543 == 0) {
								break;
							}
							local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.anInt1536]);
							if (this.anInt1538 >= local26) {
								return 1;
							}
							this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
						} while (--this.anInt1543 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt1537 < 0) {
						while (true) {
							local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.anInt1540 - 1]);
							if (this.anInt1538 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt1538 - 1) / local41;
							if (local398 >= this.anInt1543) {
								this.anInt1538 += local41 * this.anInt1543;
								this.anInt1543 = 0;
								break;
							}
							this.anInt1538 += local41 * local398;
							this.anInt1543 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.anInt1536]);
							if (this.anInt1538 < local31) {
								return 1;
							}
							local398 = (this.anInt1538 - local26) / local41;
							if (local398 >= this.anInt1543) {
								this.anInt1538 -= local41 * this.anInt1543;
								this.anInt1543 = 0;
								break;
							}
							this.anInt1538 -= local41 * local398;
							this.anInt1543 -= local398;
						}
					}
				}
			}
			if (this.anInt1537 < 0) {
				this.method1031(arg0, local48, 0, local52, 0);
				if (this.anInt1538 < 0) {
					this.anInt1538 = 0;
					this.method1677();
				}
			} else {
				this.method1029(arg0, local48, local37, local52, 0);
				if (this.anInt1538 >= local37) {
					this.anInt1538 = local37 - 1;
					this.method1677();
				}
			}
			return 1;
		} else if (this.aBoolean120) {
			if (this.anInt1537 < 0) {
				local48 = this.method1031(arg0, arg1, local26, local52, local21.aByteArray8[this.anInt1536]);
				if (this.anInt1538 >= local26) {
					return 1;
				}
				this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
			while (true) {
				local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.anInt1540 - 1]);
				if (this.anInt1538 < local31) {
					return 1;
				}
				this.anInt1538 = local31 + local31 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
				local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.anInt1536]);
				if (this.anInt1538 >= local26) {
					return 1;
				}
				this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
		} else if (this.anInt1537 < 0) {
			while (true) {
				local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.anInt1540 - 1]);
				if (this.anInt1538 >= local26) {
					return 1;
				}
				this.anInt1538 = local31 - (local31 - 1 - this.anInt1538) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.anInt1536]);
				if (this.anInt1538 < local31) {
					return 1;
				}
				this.anInt1538 = local26 + (this.anInt1538 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()I", line = 732)
	@Override
	public int method1288() {
		@Pc(4) int local4 = this.anInt1544 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt1543 == 0) {
			local4 -= local4 * this.anInt1538 / (((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8.length << 8);
		} else if (this.anInt1543 >= 0) {
			local4 -= local4 * this.anInt1536 / ((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray8.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ed;II)V", line = 746)
	public Class2_Sub10_Sub1(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub4_3 = arg0;
		this.anInt1536 = arg0.anInt613;
		this.anInt1540 = arg0.anInt612;
		this.anInt1537 = arg1;
		this.anInt1544 = arg2;
		this.anInt1538 = 0;
	}
}
