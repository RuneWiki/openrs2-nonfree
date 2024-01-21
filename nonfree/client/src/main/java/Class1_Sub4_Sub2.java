import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!j", name = "E", descriptor = "I")
	private int anInt1502;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	private int anInt1506;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	private int anInt1507;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "I")
	private int anInt1508;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	private int anInt1509;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	private final int anInt1511;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	private final int anInt1504;

	@OriginalMember(owner = "client!j", name = "N", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	private int anInt1510;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "I")
	public int anInt1503;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!te;II)V")
	public Class1_Sub4_Sub2(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub9_3 = arg0;
		this.anInt1511 = arg0.anInt2568;
		this.anInt1504 = arg0.anInt2569;
		this.aBoolean74 = arg0.aBoolean121;
		this.anInt1510 = arg1;
		this.anInt1503 = arg2;
		this.anInt1505 = 0;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public synchronized void method932(@OriginalArg(0) int arg0) {
		this.anInt1507 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
	public boolean method934() {
		return this.method1910();
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method930(@OriginalArg(0) int arg0) {
		if (this.anInt1506 > 0) {
			if (arg0 >= this.anInt1506) {
				if (this.anInt1502 == Integer.MIN_VALUE) {
					this.method1913();
					arg0 = this.anInt1506;
				} else {
					this.anInt1503 = this.anInt1502;
				}
				this.anInt1506 = 0;
			} else {
				this.anInt1503 += this.anInt1509 * arg0;
				this.anInt1506 -= arg0;
			}
		}
		this.anInt1505 += this.anInt1510 * arg0;
		@Pc(53) Class1_Sub9_Sub1 local53 = (Class1_Sub9_Sub1) super.aClass1_Sub9_3;
		@Pc(58) int local58 = this.anInt1511 << 8;
		@Pc(63) int local63 = this.anInt1504 << 8;
		@Pc(69) int local69 = local53.aByteArray15.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt1507 = 0;
		}
		if (this.anInt1507 >= 0) {
			if (this.anInt1507 > 0) {
				if (this.aBoolean74) {
					label113: {
						if (this.anInt1510 < 0) {
							if (this.anInt1505 >= local58) {
								return;
							}
							this.anInt1505 = local58 + local58 - this.anInt1505 - 1;
							this.anInt1510 = -this.anInt1510;
							if (--this.anInt1507 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt1505 < local63) {
								return;
							}
							this.anInt1505 = local63 + local63 - this.anInt1505 - 1;
							this.anInt1510 = -this.anInt1510;
							if (--this.anInt1507 == 0) {
								break;
							}
							if (this.anInt1505 >= local58) {
								return;
							}
							this.anInt1505 = local58 + local58 - this.anInt1505 - 1;
							this.anInt1510 = -this.anInt1510;
						} while (--this.anInt1507 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt1510 < 0) {
						if (this.anInt1505 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt1505 - 1) / local73;
						if (local299 < this.anInt1507) {
							this.anInt1505 += local73 * local299;
							this.anInt1507 -= local299;
							return;
						}
						this.anInt1505 += local73 * this.anInt1507;
						this.anInt1507 = 0;
					} else if (this.anInt1505 >= local63) {
						local299 = (this.anInt1505 - local58) / local73;
						if (local299 < this.anInt1507) {
							this.anInt1505 -= local73 * local299;
							this.anInt1507 -= local299;
							return;
						}
						this.anInt1505 -= local73 * this.anInt1507;
						this.anInt1507 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1510 < 0) {
				if (this.anInt1505 < 0) {
					this.anInt1505 = 0;
					this.method1913();
					return;
				}
			} else if (this.anInt1505 >= local69) {
				this.anInt1505 = local69 - 1;
				this.method1913();
			}
		} else if (this.aBoolean74) {
			if (this.anInt1510 < 0) {
				if (this.anInt1505 >= local58) {
					return;
				}
				this.anInt1505 = local58 + local58 - this.anInt1505 - 1;
				this.anInt1510 = -this.anInt1510;
			}
			while (this.anInt1505 >= local63) {
				this.anInt1505 = local63 + local63 - this.anInt1505 - 1;
				this.anInt1510 = -this.anInt1510;
				if (this.anInt1505 >= local58) {
					return;
				}
				this.anInt1505 = local58 + local58 - this.anInt1505 - 1;
				this.anInt1510 = -this.anInt1510;
			}
		} else if (this.anInt1510 < 0) {
			if (this.anInt1505 < local58) {
				this.anInt1505 = local63 - (local63 - 1 - this.anInt1505) % local73 - 1;
			}
		} else if (this.anInt1505 >= local63) {
			this.anInt1505 = local58 + (this.anInt1505 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1503 == 0 && (this.anInt1506 == 0 || this.anInt1502 == 0 || this.anInt1502 == Integer.MIN_VALUE)) {
			this.method930(arg2);
			return 0;
		}
		@Pc(21) Class1_Sub9_Sub1 local21 = (Class1_Sub9_Sub1) super.aClass1_Sub9_3;
		@Pc(26) int local26 = this.anInt1511 << 8;
		@Pc(31) int local31 = this.anInt1504 << 8;
		@Pc(37) int local37 = local21.aByteArray15.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt1507 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt1507 >= 0) {
			if (this.anInt1507 > 0) {
				if (this.aBoolean74) {
					label118: {
						if (this.anInt1510 < 0) {
							local48 = this.method939(arg0, arg1, local26, local52, local21.aByteArray15[this.anInt1511]);
							if (this.anInt1505 >= local26) {
								return 1;
							}
							this.anInt1505 = local26 + local26 - this.anInt1505 - 1;
							this.anInt1510 = -this.anInt1510;
							if (--this.anInt1507 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method944(arg0, local48, local31, local52, local21.aByteArray15[this.anInt1504 - 1]);
							if (this.anInt1505 < local31) {
								return 1;
							}
							this.anInt1505 = local31 + local31 - this.anInt1505 - 1;
							this.anInt1510 = -this.anInt1510;
							if (--this.anInt1507 == 0) {
								break;
							}
							local48 = this.method939(arg0, local48, local26, local52, local21.aByteArray15[this.anInt1511]);
							if (this.anInt1505 >= local26) {
								return 1;
							}
							this.anInt1505 = local26 + local26 - this.anInt1505 - 1;
							this.anInt1510 = -this.anInt1510;
						} while (--this.anInt1507 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt1510 < 0) {
						while (true) {
							local48 = this.method939(arg0, local48, local26, local52, local21.aByteArray15[this.anInt1504 - 1]);
							if (this.anInt1505 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt1505 - 1) / local41;
							if (local398 >= this.anInt1507) {
								this.anInt1505 += local41 * this.anInt1507;
								this.anInt1507 = 0;
								break;
							}
							this.anInt1505 += local41 * local398;
							this.anInt1507 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method944(arg0, local48, local31, local52, local21.aByteArray15[this.anInt1511]);
							if (this.anInt1505 < local31) {
								return 1;
							}
							local398 = (this.anInt1505 - local26) / local41;
							if (local398 >= this.anInt1507) {
								this.anInt1505 -= local41 * this.anInt1507;
								this.anInt1507 = 0;
								break;
							}
							this.anInt1505 -= local41 * local398;
							this.anInt1507 -= local398;
						}
					}
				}
			}
			if (this.anInt1510 < 0) {
				this.method939(arg0, local48, 0, local52, 0);
				if (this.anInt1505 < 0) {
					this.anInt1505 = 0;
					this.method1913();
				}
			} else {
				this.method944(arg0, local48, local37, local52, 0);
				if (this.anInt1505 >= local37) {
					this.anInt1505 = local37 - 1;
					this.method1913();
				}
			}
			return 1;
		} else if (this.aBoolean74) {
			if (this.anInt1510 < 0) {
				local48 = this.method939(arg0, arg1, local26, local52, local21.aByteArray15[this.anInt1511]);
				if (this.anInt1505 >= local26) {
					return 1;
				}
				this.anInt1505 = local26 + local26 - this.anInt1505 - 1;
				this.anInt1510 = -this.anInt1510;
			}
			while (true) {
				local48 = this.method944(arg0, local48, local31, local52, local21.aByteArray15[this.anInt1504 - 1]);
				if (this.anInt1505 < local31) {
					return 1;
				}
				this.anInt1505 = local31 + local31 - this.anInt1505 - 1;
				this.anInt1510 = -this.anInt1510;
				local48 = this.method939(arg0, local48, local26, local52, local21.aByteArray15[this.anInt1511]);
				if (this.anInt1505 >= local26) {
					return 1;
				}
				this.anInt1505 = local26 + local26 - this.anInt1505 - 1;
				this.anInt1510 = -this.anInt1510;
			}
		} else if (this.anInt1510 < 0) {
			while (true) {
				local48 = this.method939(arg0, local48, local26, local52, local21.aByteArray15[this.anInt1504 - 1]);
				if (this.anInt1505 >= local26) {
					return 1;
				}
				this.anInt1505 = local31 - (local31 - 1 - this.anInt1505) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method944(arg0, local48, local31, local52, local21.aByteArray15[this.anInt1511]);
				if (this.anInt1505 < local31) {
					return 1;
				}
				this.anInt1505 = local26 + (this.anInt1505 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public synchronized void method937(@OriginalArg(0) int arg0) {
		this.anInt1503 = arg0;
		this.anInt1506 = 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	@Override
	public int method931() {
		@Pc(4) int local4 = this.anInt1503 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt1507 == 0) {
			local4 -= local4 * this.anInt1505 / (((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15.length << 8);
		} else if (this.anInt1507 >= 0) {
			local4 -= local4 * this.anInt1511 / ((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)I")
	private int method939(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1506 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1506;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1506 += arg1;
			if (this.anInt1510 == -256 && (this.anInt1505 & 0xFF) == 0) {
				arg1 = Static120.method940(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, this.anInt1508, this.anInt1509, local7, arg2, this);
			} else {
				arg1 = Static120.method945(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, this.anInt1508, this.anInt1509, local7, arg2, this, this.anInt1510, arg4);
			}
			this.anInt1506 -= arg1;
			if (this.anInt1506 != 0) {
				return arg1;
			}
			if (this.anInt1502 == Integer.MIN_VALUE) {
				this.method1913();
				return arg3;
			}
			this.anInt1503 = this.anInt1502;
		}
		return this.anInt1510 == -256 && (this.anInt1505 & 0xFF) == 0 ? Static120.method941(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, arg3, arg2, this) : Static120.method933(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, arg3, arg2, this, this.anInt1510, arg4);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "([IIIII)I")
	private int method944(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1506 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1506;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1506 += arg1;
			if (this.anInt1510 == 256 && (this.anInt1505 & 0xFF) == 0) {
				arg1 = Static120.method942(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, this.anInt1508, this.anInt1509, local7, arg2, this);
			} else {
				arg1 = Static120.method935(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, this.anInt1508, this.anInt1509, local7, arg2, this, this.anInt1510, arg4);
			}
			this.anInt1506 -= arg1;
			if (this.anInt1506 != 0) {
				return arg1;
			}
			if (this.anInt1502 == Integer.MIN_VALUE) {
				this.method1913();
				return arg3;
			}
			this.anInt1503 = this.anInt1502;
		}
		return this.anInt1510 == 256 && (this.anInt1505 & 0xFF) == 0 ? Static120.method943(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, arg3, arg2, this) : Static120.method936(((Class1_Sub9_Sub1) super.aClass1_Sub9_3).aByteArray15, arg0, this.anInt1505, arg1, this.anInt1503, arg3, arg2, this, this.anInt1510, arg4);
	}
}
