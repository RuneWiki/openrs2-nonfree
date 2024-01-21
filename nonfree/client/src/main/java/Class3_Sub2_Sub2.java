import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
	private int anInt2130;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
	private int anInt2134;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	private int anInt2135;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
	private int anInt2136;

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
	private int anInt2139;

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
	private int anInt2140;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
	private final int anInt2131;

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
	private final int anInt2132;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
	private int anInt2133;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
	public int anInt2141;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ie;II)V")
	public Class3_Sub2_Sub2(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub4_3 = arg0;
		this.anInt2131 = arg0.anInt1302;
		this.anInt2132 = arg0.anInt1301;
		this.aBoolean101 = arg0.aBoolean63;
		this.anInt2133 = arg1;
		this.anInt2142 = arg2;
		this.anInt2141 = 128;
		this.anInt2137 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()I")
	private int method1384() {
		return this.anInt2141 < 0 ? this.anInt2142 : (int) ((double) this.anInt2142 * Math.sqrt((double) (256 - this.anInt2141) * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
	private int method1385() {
		return this.anInt2141 < 0 ? -this.anInt2142 : (int) ((double) this.anInt2142 * Math.sqrt((double) this.anInt2141 * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1380(@OriginalArg(0) int arg0) {
		if (this.method1406()) {
			return;
		}
		if (this.anInt2136 > 0) {
			if (arg0 >= this.anInt2136) {
				if (this.anInt2130 == Integer.MIN_VALUE) {
					this.anInt2142 = 0;
					this.method1966();
					arg0 = this.anInt2136;
				} else {
					this.anInt2142 = this.anInt2130;
				}
				this.anInt2141 = this.anInt2135;
				this.anInt2136 = 0;
			} else {
				this.anInt2142 += this.anInt2138 * arg0;
				if (Static106.aBoolean147) {
					this.anInt2141 += this.anInt2134 * arg0;
				}
				this.anInt2136 -= arg0;
			}
		}
		this.anInt2137 += this.anInt2133 * arg0;
		@Pc(75) Class3_Sub4_Sub1 local75 = (Class3_Sub4_Sub1) super.aClass3_Sub4_3;
		@Pc(80) int local80 = this.anInt2131 << 8;
		@Pc(85) int local85 = this.anInt2132 << 8;
		@Pc(91) int local91 = local75.aByteArray9.length << 8;
		@Pc(95) int local95 = local85 - local80;
		if (local95 <= 0) {
			this.anInt2140 = 0;
		}
		if (this.anInt2140 >= 0) {
			if (this.anInt2140 > 0) {
				if (this.aBoolean101) {
					label120: {
						if (this.anInt2133 < 0) {
							if (this.anInt2137 >= local80) {
								return;
							}
							this.anInt2137 = local80 + local80 - this.anInt2137 - 1;
							this.anInt2133 = -this.anInt2133;
							if (--this.anInt2140 == 0) {
								break label120;
							}
						}
						do {
							if (this.anInt2137 < local85) {
								return;
							}
							this.anInt2137 = local85 + local85 - this.anInt2137 - 1;
							this.anInt2133 = -this.anInt2133;
							if (--this.anInt2140 == 0) {
								break;
							}
							if (this.anInt2137 >= local80) {
								return;
							}
							this.anInt2137 = local80 + local80 - this.anInt2137 - 1;
							this.anInt2133 = -this.anInt2133;
						} while (--this.anInt2140 != 0);
					}
				} else {
					@Pc(321) int local321;
					if (this.anInt2133 < 0) {
						if (this.anInt2137 >= local80) {
							return;
						}
						local321 = (local85 - this.anInt2137 - 1) / local95;
						if (local321 < this.anInt2140) {
							this.anInt2137 += local95 * local321;
							this.anInt2140 -= local321;
							return;
						}
						this.anInt2137 += local95 * this.anInt2140;
						this.anInt2140 = 0;
					} else if (this.anInt2137 >= local85) {
						local321 = (this.anInt2137 - local80) / local95;
						if (local321 < this.anInt2140) {
							this.anInt2137 -= local95 * local321;
							this.anInt2140 -= local321;
							return;
						}
						this.anInt2137 -= local95 * this.anInt2140;
						this.anInt2140 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2133 < 0) {
				if (this.anInt2137 < 0) {
					this.anInt2137 = 0;
					this.method1966();
					return;
				}
			} else if (this.anInt2137 >= local91) {
				this.anInt2137 = local91 - 1;
				this.method1966();
			}
		} else if (this.aBoolean101) {
			if (this.anInt2133 < 0) {
				if (this.anInt2137 >= local80) {
					return;
				}
				this.anInt2137 = local80 + local80 - this.anInt2137 - 1;
				this.anInt2133 = -this.anInt2133;
			}
			while (this.anInt2137 >= local85) {
				this.anInt2137 = local85 + local85 - this.anInt2137 - 1;
				this.anInt2133 = -this.anInt2133;
				if (this.anInt2137 >= local80) {
					return;
				}
				this.anInt2137 = local80 + local80 - this.anInt2137 - 1;
				this.anInt2133 = -this.anInt2133;
			}
		} else if (this.anInt2133 < 0) {
			if (this.anInt2137 < local80) {
				this.anInt2137 = local85 - (local85 - 1 - this.anInt2137) % local95 - 1;
			}
		} else if (this.anInt2137 >= local85) {
			this.anInt2137 = local80 + (this.anInt2137 - local80) % local95;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
	private synchronized void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2142 = arg0;
		this.anInt2141 = arg1;
		this.anInt2136 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIIII)I")
	private int method1390(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2136 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2136;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2136 += arg1;
			if (this.anInt2133 == -256 && (this.anInt2137 & 0xFF) == 0) {
				if (Static106.aBoolean147) {
					arg1 = Static119.method1386(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2141, this.anInt2139, this.anInt2138, this.anInt2134, local7, arg2, this);
				} else {
					arg1 = Static119.method1397(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2139, this.anInt2138, local7, arg2, this);
				}
			} else if (Static106.aBoolean147) {
				arg1 = Static119.method1391(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2141, this.anInt2139, this.anInt2138, this.anInt2134, local7, arg2, this, this.anInt2133, arg4);
			} else {
				arg1 = Static119.method1382(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2139, this.anInt2138, local7, arg2, this, this.anInt2133, arg4);
			}
			this.anInt2136 -= arg1;
			if (this.anInt2136 != 0) {
				return arg1;
			}
			this.anInt2141 = this.anInt2135;
			if (this.anInt2130 == Integer.MIN_VALUE) {
				this.anInt2142 = 0;
				this.method1966();
				return arg3;
			}
			this.anInt2142 = this.anInt2130;
		}
		if (this.anInt2133 == -256 && (this.anInt2137 & 0xFF) == 0) {
			return Static106.aBoolean147 ? Static119.method1383(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.method1384(), this.method1385(), arg3, arg2, this) : Static119.method1389(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, arg3, arg2, this);
		} else if (Static106.aBoolean147) {
			return Static119.method1405(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.method1384(), this.method1385(), arg3, arg2, this, this.anInt2133, arg4);
		} else {
			return Static119.method1404(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, arg3, arg2, this, this.anInt2133, arg4);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()I")
	@Override
	public int method1379() {
		@Pc(4) int local4 = this.anInt2142 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt2140 == 0) {
			local4 -= local4 * this.anInt2137 / (((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9.length << 8);
		} else if (this.anInt2140 >= 0) {
			local4 -= local4 * this.anInt2131 / ((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()Z")
	public boolean method1392() {
		return this.method1967();
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "([IIIII)I")
	private int method1393(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2136 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2136;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2136 += arg1;
			if (this.anInt2133 == 256 && (this.anInt2137 & 0xFF) == 0) {
				if (Static106.aBoolean147) {
					arg1 = Static119.method1381(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2141, this.anInt2139, this.anInt2138, this.anInt2134, local7, arg2, this);
				} else {
					arg1 = Static119.method1396(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2139, this.anInt2138, local7, arg2, this);
				}
			} else if (Static106.aBoolean147) {
				arg1 = Static119.method1407(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2141, this.anInt2139, this.anInt2138, this.anInt2134, local7, arg2, this, this.anInt2133, arg4);
			} else {
				arg1 = Static119.method1387(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, this.anInt2139, this.anInt2138, local7, arg2, this, this.anInt2133, arg4);
			}
			this.anInt2136 -= arg1;
			if (this.anInt2136 != 0) {
				return arg1;
			}
			this.anInt2141 = this.anInt2135;
			if (this.anInt2130 == Integer.MIN_VALUE) {
				this.anInt2142 = 0;
				this.method1966();
				return arg3;
			}
			this.anInt2142 = this.anInt2130;
		}
		if (this.anInt2133 == 256 && (this.anInt2137 & 0xFF) == 0) {
			return Static106.aBoolean147 ? Static119.method1395(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.method1384(), this.method1385(), arg3, arg2, this) : Static119.method1400(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, arg3, arg2, this);
		} else if (Static106.aBoolean147) {
			return Static119.method1394(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.method1384(), this.method1385(), arg3, arg2, this, this.anInt2133, arg4);
		} else {
			return Static119.method1401(((Class3_Sub4_Sub1) super.aClass3_Sub4_3).aByteArray9, arg0, this.anInt2137, arg1, this.anInt2142, arg3, arg2, this, this.anInt2133, arg4);
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public synchronized void method1398(@OriginalArg(0) int arg0) {
		this.method1388(arg0, this.method1402());
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1378(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.method1406()) {
			return 0;
		} else if (this.anInt2142 == 0 && (this.anInt2136 == 0 || this.anInt2130 == 0 || this.anInt2130 == Integer.MIN_VALUE)) {
			this.method1380(arg2);
			return 0;
		} else {
			@Pc(26) Class3_Sub4_Sub1 local26 = (Class3_Sub4_Sub1) super.aClass3_Sub4_3;
			@Pc(31) int local31 = this.anInt2131 << 8;
			@Pc(36) int local36 = this.anInt2132 << 8;
			@Pc(42) int local42 = local26.aByteArray9.length << 8;
			@Pc(46) int local46 = local36 - local31;
			if (local46 <= 0) {
				this.anInt2140 = 0;
			}
			@Pc(53) int local53 = arg1;
			@Pc(57) int local57 = arg2 + arg1;
			if (this.anInt2140 >= 0) {
				if (this.anInt2140 > 0) {
					if (this.aBoolean101) {
						label121: {
							if (this.anInt2133 < 0) {
								local53 = this.method1390(arg0, arg1, local31, local57, local26.aByteArray9[this.anInt2131]);
								if (this.anInt2137 >= local31) {
									return 1;
								}
								this.anInt2137 = local31 + local31 - this.anInt2137 - 1;
								this.anInt2133 = -this.anInt2133;
								if (--this.anInt2140 == 0) {
									break label121;
								}
							}
							do {
								local53 = this.method1393(arg0, local53, local36, local57, local26.aByteArray9[this.anInt2132 - 1]);
								if (this.anInt2137 < local36) {
									return 1;
								}
								this.anInt2137 = local36 + local36 - this.anInt2137 - 1;
								this.anInt2133 = -this.anInt2133;
								if (--this.anInt2140 == 0) {
									break;
								}
								local53 = this.method1390(arg0, local53, local31, local57, local26.aByteArray9[this.anInt2131]);
								if (this.anInt2137 >= local31) {
									return 1;
								}
								this.anInt2137 = local31 + local31 - this.anInt2137 - 1;
								this.anInt2133 = -this.anInt2133;
							} while (--this.anInt2140 != 0);
						}
					} else {
						@Pc(403) int local403;
						if (this.anInt2133 < 0) {
							while (true) {
								local53 = this.method1390(arg0, local53, local31, local57, local26.aByteArray9[this.anInt2132 - 1]);
								if (this.anInt2137 >= local31) {
									return 1;
								}
								local403 = (local36 - this.anInt2137 - 1) / local46;
								if (local403 >= this.anInt2140) {
									this.anInt2137 += local46 * this.anInt2140;
									this.anInt2140 = 0;
									break;
								}
								this.anInt2137 += local46 * local403;
								this.anInt2140 -= local403;
							}
						} else {
							while (true) {
								local53 = this.method1393(arg0, local53, local36, local57, local26.aByteArray9[this.anInt2131]);
								if (this.anInt2137 < local36) {
									return 1;
								}
								local403 = (this.anInt2137 - local31) / local46;
								if (local403 >= this.anInt2140) {
									this.anInt2137 -= local46 * this.anInt2140;
									this.anInt2140 = 0;
									break;
								}
								this.anInt2137 -= local46 * local403;
								this.anInt2140 -= local403;
							}
						}
					}
				}
				if (this.anInt2133 < 0) {
					this.method1390(arg0, local53, 0, local57, 0);
					if (this.anInt2137 < 0) {
						this.anInt2137 = 0;
						this.method1966();
					}
				} else {
					this.method1393(arg0, local53, local42, local57, 0);
					if (this.anInt2137 >= local42) {
						this.anInt2137 = local42 - 1;
						this.method1966();
					}
				}
				return 1;
			} else if (this.aBoolean101) {
				if (this.anInt2133 < 0) {
					local53 = this.method1390(arg0, arg1, local31, local57, local26.aByteArray9[this.anInt2131]);
					if (this.anInt2137 >= local31) {
						return 1;
					}
					this.anInt2137 = local31 + local31 - this.anInt2137 - 1;
					this.anInt2133 = -this.anInt2133;
				}
				while (true) {
					local53 = this.method1393(arg0, local53, local36, local57, local26.aByteArray9[this.anInt2132 - 1]);
					if (this.anInt2137 < local36) {
						return 1;
					}
					this.anInt2137 = local36 + local36 - this.anInt2137 - 1;
					this.anInt2133 = -this.anInt2133;
					local53 = this.method1390(arg0, local53, local31, local57, local26.aByteArray9[this.anInt2131]);
					if (this.anInt2137 >= local31) {
						return 1;
					}
					this.anInt2137 = local31 + local31 - this.anInt2137 - 1;
					this.anInt2133 = -this.anInt2133;
				}
			} else if (this.anInt2133 < 0) {
				while (true) {
					local53 = this.method1390(arg0, local53, local31, local57, local26.aByteArray9[this.anInt2132 - 1]);
					if (this.anInt2137 >= local31) {
						return 1;
					}
					this.anInt2137 = local36 - (local36 - 1 - this.anInt2137) % local46 - 1;
				}
			} else {
				while (true) {
					local53 = this.method1393(arg0, local53, local36, local57, local26.aByteArray9[this.anInt2131]);
					if (this.anInt2137 < local36) {
						return 1;
					}
					this.anInt2137 = local31 + (this.anInt2137 - local31) % local46;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()I")
	private synchronized int method1402() {
		return this.anInt2136 > 0 ? this.anInt2135 : this.anInt2141;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public synchronized void method1403(@OriginalArg(0) int arg0) {
		this.anInt2140 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z")
	private boolean method1406() {
		if (this.anInt2136 != 0 && Static106.aBoolean147 != (this.anInt2134 != Integer.MIN_VALUE)) {
			this.anInt2142 = this.anInt2130 == Integer.MIN_VALUE ? 0 : this.anInt2130;
			this.anInt2141 = this.anInt2135;
			this.anInt2136 = 0;
			if (this.anInt2130 == Integer.MIN_VALUE) {
				this.method1966();
				return true;
			}
		}
		return false;
	}
}
