import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	private int anInt1670;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	private int anInt1671;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
	private int anInt1672;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	private int anInt1673;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	private int anInt1674;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	private final int anInt1668;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	private final int anInt1667;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
	private int anInt1675;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public int anInt1666;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	public int anInt1669;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!da;II)V")
	public Class6_Sub3_Sub1(@OriginalArg(0) Class6_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub4_3 = arg0;
		this.anInt1668 = arg0.anInt911;
		this.anInt1667 = arg0.anInt910;
		this.aBoolean76 = arg0.aBoolean40;
		this.anInt1675 = arg1;
		this.anInt1666 = arg2;
		this.anInt1669 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()I")
	@Override
	public int method1971() {
		@Pc(4) int local4 = this.anInt1666 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt1671 == 0) {
			local4 -= local4 * this.anInt1669 / (((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5.length << 8);
		} else if (this.anInt1671 >= 0) {
			local4 -= local4 * this.anInt1668 / ((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIII)I")
	private int method1138(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1674 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1674;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1674 += arg1;
			if (this.anInt1675 == -256 && (this.anInt1669 & 0xFF) == 0) {
				arg1 = Static119.method1147(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, this.anInt1673, this.anInt1670, local7, arg2, this);
			} else {
				arg1 = Static119.method1137(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, this.anInt1673, this.anInt1670, local7, arg2, this, this.anInt1675, arg4);
			}
			this.anInt1674 -= arg1;
			if (this.anInt1674 != 0) {
				return arg1;
			}
			if (this.anInt1672 == Integer.MIN_VALUE) {
				this.method2083();
				return arg3;
			}
			this.anInt1666 = this.anInt1672;
		}
		return this.anInt1675 == -256 && (this.anInt1669 & 0xFF) == 0 ? Static119.method1146(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, arg3, arg2, this) : Static119.method1135(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, arg3, arg2, this, this.anInt1675, arg4);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public synchronized void method1139(@OriginalArg(0) int arg0) {
		this.anInt1671 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1973(@OriginalArg(0) int arg0) {
		if (this.anInt1674 > 0) {
			if (arg0 >= this.anInt1674) {
				if (this.anInt1672 == Integer.MIN_VALUE) {
					this.method2083();
					arg0 = this.anInt1674;
				} else {
					this.anInt1666 = this.anInt1672;
				}
				this.anInt1674 = 0;
			} else {
				this.anInt1666 += this.anInt1670 * arg0;
				this.anInt1674 -= arg0;
			}
		}
		this.anInt1669 += this.anInt1675 * arg0;
		@Pc(53) Class6_Sub4_Sub1 local53 = (Class6_Sub4_Sub1) super.aClass6_Sub4_3;
		@Pc(58) int local58 = this.anInt1668 << 8;
		@Pc(63) int local63 = this.anInt1667 << 8;
		@Pc(69) int local69 = local53.aByteArray5.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt1671 = 0;
		}
		if (this.anInt1671 >= 0) {
			if (this.anInt1671 > 0) {
				if (this.aBoolean76) {
					label113: {
						if (this.anInt1675 < 0) {
							if (this.anInt1669 >= local58) {
								return;
							}
							this.anInt1669 = local58 + local58 - this.anInt1669 - 1;
							this.anInt1675 = -this.anInt1675;
							if (--this.anInt1671 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt1669 < local63) {
								return;
							}
							this.anInt1669 = local63 + local63 - this.anInt1669 - 1;
							this.anInt1675 = -this.anInt1675;
							if (--this.anInt1671 == 0) {
								break;
							}
							if (this.anInt1669 >= local58) {
								return;
							}
							this.anInt1669 = local58 + local58 - this.anInt1669 - 1;
							this.anInt1675 = -this.anInt1675;
						} while (--this.anInt1671 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt1675 < 0) {
						if (this.anInt1669 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt1669 - 1) / local73;
						if (local299 < this.anInt1671) {
							this.anInt1669 += local73 * local299;
							this.anInt1671 -= local299;
							return;
						}
						this.anInt1669 += local73 * this.anInt1671;
						this.anInt1671 = 0;
					} else if (this.anInt1669 >= local63) {
						local299 = (this.anInt1669 - local58) / local73;
						if (local299 < this.anInt1671) {
							this.anInt1669 -= local73 * local299;
							this.anInt1671 -= local299;
							return;
						}
						this.anInt1669 -= local73 * this.anInt1671;
						this.anInt1671 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1675 < 0) {
				if (this.anInt1669 < 0) {
					this.anInt1669 = 0;
					this.method2083();
					return;
				}
			} else if (this.anInt1669 >= local69) {
				this.anInt1669 = local69 - 1;
				this.method2083();
			}
		} else if (this.aBoolean76) {
			if (this.anInt1675 < 0) {
				if (this.anInt1669 >= local58) {
					return;
				}
				this.anInt1669 = local58 + local58 - this.anInt1669 - 1;
				this.anInt1675 = -this.anInt1675;
			}
			while (this.anInt1669 >= local63) {
				this.anInt1669 = local63 + local63 - this.anInt1669 - 1;
				this.anInt1675 = -this.anInt1675;
				if (this.anInt1669 >= local58) {
					return;
				}
				this.anInt1669 = local58 + local58 - this.anInt1669 - 1;
				this.anInt1675 = -this.anInt1675;
			}
		} else if (this.anInt1675 < 0) {
			if (this.anInt1669 < local58) {
				this.anInt1669 = local63 - (local63 - 1 - this.anInt1669) % local73 - 1;
			}
		} else if (this.anInt1669 >= local63) {
			this.anInt1669 = local58 + (this.anInt1669 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "([IIIII)I")
	private int method1141(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1674 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1674;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1674 += arg1;
			if (this.anInt1675 == 256 && (this.anInt1669 & 0xFF) == 0) {
				arg1 = Static119.method1144(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, this.anInt1673, this.anInt1670, local7, arg2, this);
			} else {
				arg1 = Static119.method1143(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, this.anInt1673, this.anInt1670, local7, arg2, this, this.anInt1675, arg4);
			}
			this.anInt1674 -= arg1;
			if (this.anInt1674 != 0) {
				return arg1;
			}
			if (this.anInt1672 == Integer.MIN_VALUE) {
				this.method2083();
				return arg3;
			}
			this.anInt1666 = this.anInt1672;
		}
		return this.anInt1675 == 256 && (this.anInt1669 & 0xFF) == 0 ? Static119.method1140(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, arg3, arg2, this) : Static119.method1136(((Class6_Sub4_Sub1) super.aClass6_Sub4_3).aByteArray5, arg0, this.anInt1669, arg1, this.anInt1666, arg3, arg2, this, this.anInt1675, arg4);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1666 == 0 && (this.anInt1674 == 0 || this.anInt1672 == 0 || this.anInt1672 == Integer.MIN_VALUE)) {
			this.method1973(arg2);
			return 0;
		}
		@Pc(21) Class6_Sub4_Sub1 local21 = (Class6_Sub4_Sub1) super.aClass6_Sub4_3;
		@Pc(26) int local26 = this.anInt1668 << 8;
		@Pc(31) int local31 = this.anInt1667 << 8;
		@Pc(37) int local37 = local21.aByteArray5.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt1671 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt1671 >= 0) {
			if (this.anInt1671 > 0) {
				if (this.aBoolean76) {
					label118: {
						if (this.anInt1675 < 0) {
							local48 = this.method1138(arg0, arg1, local26, local52, local21.aByteArray5[this.anInt1668]);
							if (this.anInt1669 >= local26) {
								return 1;
							}
							this.anInt1669 = local26 + local26 - this.anInt1669 - 1;
							this.anInt1675 = -this.anInt1675;
							if (--this.anInt1671 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1141(arg0, local48, local31, local52, local21.aByteArray5[this.anInt1667 - 1]);
							if (this.anInt1669 < local31) {
								return 1;
							}
							this.anInt1669 = local31 + local31 - this.anInt1669 - 1;
							this.anInt1675 = -this.anInt1675;
							if (--this.anInt1671 == 0) {
								break;
							}
							local48 = this.method1138(arg0, local48, local26, local52, local21.aByteArray5[this.anInt1668]);
							if (this.anInt1669 >= local26) {
								return 1;
							}
							this.anInt1669 = local26 + local26 - this.anInt1669 - 1;
							this.anInt1675 = -this.anInt1675;
						} while (--this.anInt1671 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt1675 < 0) {
						while (true) {
							local48 = this.method1138(arg0, local48, local26, local52, local21.aByteArray5[this.anInt1667 - 1]);
							if (this.anInt1669 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt1669 - 1) / local41;
							if (local398 >= this.anInt1671) {
								this.anInt1669 += local41 * this.anInt1671;
								this.anInt1671 = 0;
								break;
							}
							this.anInt1669 += local41 * local398;
							this.anInt1671 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1141(arg0, local48, local31, local52, local21.aByteArray5[this.anInt1668]);
							if (this.anInt1669 < local31) {
								return 1;
							}
							local398 = (this.anInt1669 - local26) / local41;
							if (local398 >= this.anInt1671) {
								this.anInt1669 -= local41 * this.anInt1671;
								this.anInt1671 = 0;
								break;
							}
							this.anInt1669 -= local41 * local398;
							this.anInt1671 -= local398;
						}
					}
				}
			}
			if (this.anInt1675 < 0) {
				this.method1138(arg0, local48, 0, local52, 0);
				if (this.anInt1669 < 0) {
					this.anInt1669 = 0;
					this.method2083();
				}
			} else {
				this.method1141(arg0, local48, local37, local52, 0);
				if (this.anInt1669 >= local37) {
					this.anInt1669 = local37 - 1;
					this.method2083();
				}
			}
			return 1;
		} else if (this.aBoolean76) {
			if (this.anInt1675 < 0) {
				local48 = this.method1138(arg0, arg1, local26, local52, local21.aByteArray5[this.anInt1668]);
				if (this.anInt1669 >= local26) {
					return 1;
				}
				this.anInt1669 = local26 + local26 - this.anInt1669 - 1;
				this.anInt1675 = -this.anInt1675;
			}
			while (true) {
				local48 = this.method1141(arg0, local48, local31, local52, local21.aByteArray5[this.anInt1667 - 1]);
				if (this.anInt1669 < local31) {
					return 1;
				}
				this.anInt1669 = local31 + local31 - this.anInt1669 - 1;
				this.anInt1675 = -this.anInt1675;
				local48 = this.method1138(arg0, local48, local26, local52, local21.aByteArray5[this.anInt1668]);
				if (this.anInt1669 >= local26) {
					return 1;
				}
				this.anInt1669 = local26 + local26 - this.anInt1669 - 1;
				this.anInt1675 = -this.anInt1675;
			}
		} else if (this.anInt1675 < 0) {
			while (true) {
				local48 = this.method1138(arg0, local48, local26, local52, local21.aByteArray5[this.anInt1667 - 1]);
				if (this.anInt1669 >= local26) {
					return 1;
				}
				this.anInt1669 = local31 - (local31 - 1 - this.anInt1669) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1141(arg0, local48, local31, local52, local21.aByteArray5[this.anInt1668]);
				if (this.anInt1669 < local31) {
					return 1;
				}
				this.anInt1669 = local26 + (this.anInt1669 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()Z")
	public boolean method1145() {
		return this.method2086();
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public synchronized void method1148(@OriginalArg(0) int arg0) {
		this.anInt1666 = arg0;
		this.anInt1674 = 0;
	}
}
