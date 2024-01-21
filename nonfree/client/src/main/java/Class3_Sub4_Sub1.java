import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!da", name = "I", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "I")
	private final int anInt610;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	private final int anInt617;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!fd;II)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) Class3_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub5_3 = arg0;
		this.anInt610 = arg0.anInt857;
		this.anInt617 = arg0.anInt858;
		this.anInt618 = arg1;
		this.anInt619 = arg2;
		this.anInt613 = 0;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	public boolean method406() {
		return this.method1858();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	public synchronized void method409(@OriginalArg(0) int arg0) {
		this.anInt619 = arg0;
		this.anInt615 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1567(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt619 == 0 && (this.anInt615 == 0 || this.anInt611 == 0 || this.anInt611 == Integer.MIN_VALUE)) {
			this.method1566(arg2);
			return 0;
		}
		@Pc(21) Class3_Sub5_Sub1 local21 = (Class3_Sub5_Sub1) super.aClass3_Sub5_3;
		@Pc(26) int local26 = this.anInt610 << 8;
		@Pc(31) int local31 = this.anInt617 << 8;
		@Pc(37) int local37 = local21.aByteArray7.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt614 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt614 >= 0) {
			if (this.anInt614 > 0) {
				if (this.aBoolean30) {
					label118: {
						if (this.anInt618 < 0) {
							local48 = this.method418(arg0, arg1, local26, local52, local21.aByteArray7[this.anInt610]);
							if (this.anInt613 >= local26) {
								return 1;
							}
							this.anInt613 = local26 + local26 - this.anInt613 - 1;
							this.anInt618 = -this.anInt618;
							if (--this.anInt614 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method416(arg0, local48, local31, local52, local21.aByteArray7[this.anInt617 - 1]);
							if (this.anInt613 < local31) {
								return 1;
							}
							this.anInt613 = local31 + local31 - this.anInt613 - 1;
							this.anInt618 = -this.anInt618;
							if (--this.anInt614 == 0) {
								break;
							}
							local48 = this.method418(arg0, local48, local26, local52, local21.aByteArray7[this.anInt610]);
							if (this.anInt613 >= local26) {
								return 1;
							}
							this.anInt613 = local26 + local26 - this.anInt613 - 1;
							this.anInt618 = -this.anInt618;
						} while (--this.anInt614 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt618 < 0) {
						while (true) {
							local48 = this.method418(arg0, local48, local26, local52, local21.aByteArray7[this.anInt617 - 1]);
							if (this.anInt613 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt613 - 1) / local41;
							if (local398 >= this.anInt614) {
								this.anInt613 += local41 * this.anInt614;
								this.anInt614 = 0;
								break;
							}
							this.anInt613 += local41 * local398;
							this.anInt614 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method416(arg0, local48, local31, local52, local21.aByteArray7[this.anInt610]);
							if (this.anInt613 < local31) {
								return 1;
							}
							local398 = (this.anInt613 - local26) / local41;
							if (local398 >= this.anInt614) {
								this.anInt613 -= local41 * this.anInt614;
								this.anInt614 = 0;
								break;
							}
							this.anInt613 -= local41 * local398;
							this.anInt614 -= local398;
						}
					}
				}
			}
			if (this.anInt618 < 0) {
				this.method418(arg0, local48, 0, local52, 0);
				if (this.anInt613 < 0) {
					this.anInt613 = 0;
					this.method1852();
				}
			} else {
				this.method416(arg0, local48, local37, local52, 0);
				if (this.anInt613 >= local37) {
					this.anInt613 = local37 - 1;
					this.method1852();
				}
			}
			return 1;
		} else if (this.aBoolean30) {
			if (this.anInt618 < 0) {
				local48 = this.method418(arg0, arg1, local26, local52, local21.aByteArray7[this.anInt610]);
				if (this.anInt613 >= local26) {
					return 1;
				}
				this.anInt613 = local26 + local26 - this.anInt613 - 1;
				this.anInt618 = -this.anInt618;
			}
			while (true) {
				local48 = this.method416(arg0, local48, local31, local52, local21.aByteArray7[this.anInt617 - 1]);
				if (this.anInt613 < local31) {
					return 1;
				}
				this.anInt613 = local31 + local31 - this.anInt613 - 1;
				this.anInt618 = -this.anInt618;
				local48 = this.method418(arg0, local48, local26, local52, local21.aByteArray7[this.anInt610]);
				if (this.anInt613 >= local26) {
					return 1;
				}
				this.anInt613 = local26 + local26 - this.anInt613 - 1;
				this.anInt618 = -this.anInt618;
			}
		} else if (this.anInt618 < 0) {
			while (true) {
				local48 = this.method418(arg0, local48, local26, local52, local21.aByteArray7[this.anInt617 - 1]);
				if (this.anInt613 >= local26) {
					return 1;
				}
				this.anInt613 = local31 - (local31 - 1 - this.anInt613) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method416(arg0, local48, local31, local52, local21.aByteArray7[this.anInt610]);
				if (this.anInt613 < local31) {
					return 1;
				}
				this.anInt613 = local26 + (this.anInt613 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	public synchronized void method413(@OriginalArg(0) int arg0) {
		this.anInt614 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1566(@OriginalArg(0) int arg0) {
		if (this.anInt615 > 0) {
			if (arg0 >= this.anInt615) {
				if (this.anInt611 == Integer.MIN_VALUE) {
					this.method1852();
					arg0 = this.anInt615;
				} else {
					this.anInt619 = this.anInt611;
				}
				this.anInt615 = 0;
			} else {
				this.anInt619 += this.anInt612 * arg0;
				this.anInt615 -= arg0;
			}
		}
		this.anInt613 += this.anInt618 * arg0;
		@Pc(53) Class3_Sub5_Sub1 local53 = (Class3_Sub5_Sub1) super.aClass3_Sub5_3;
		@Pc(58) int local58 = this.anInt610 << 8;
		@Pc(63) int local63 = this.anInt617 << 8;
		@Pc(69) int local69 = local53.aByteArray7.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt614 = 0;
		}
		if (this.anInt614 >= 0) {
			if (this.anInt614 > 0) {
				if (this.aBoolean30) {
					label113: {
						if (this.anInt618 < 0) {
							if (this.anInt613 >= local58) {
								return;
							}
							this.anInt613 = local58 + local58 - this.anInt613 - 1;
							this.anInt618 = -this.anInt618;
							if (--this.anInt614 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt613 < local63) {
								return;
							}
							this.anInt613 = local63 + local63 - this.anInt613 - 1;
							this.anInt618 = -this.anInt618;
							if (--this.anInt614 == 0) {
								break;
							}
							if (this.anInt613 >= local58) {
								return;
							}
							this.anInt613 = local58 + local58 - this.anInt613 - 1;
							this.anInt618 = -this.anInt618;
						} while (--this.anInt614 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt618 < 0) {
						if (this.anInt613 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt613 - 1) / local73;
						if (local299 < this.anInt614) {
							this.anInt613 += local73 * local299;
							this.anInt614 -= local299;
							return;
						}
						this.anInt613 += local73 * this.anInt614;
						this.anInt614 = 0;
					} else if (this.anInt613 >= local63) {
						local299 = (this.anInt613 - local58) / local73;
						if (local299 < this.anInt614) {
							this.anInt613 -= local73 * local299;
							this.anInt614 -= local299;
							return;
						}
						this.anInt613 -= local73 * this.anInt614;
						this.anInt614 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt618 < 0) {
				if (this.anInt613 < 0) {
					this.anInt613 = 0;
					this.method1852();
					return;
				}
			} else if (this.anInt613 >= local69) {
				this.anInt613 = local69 - 1;
				this.method1852();
			}
		} else if (this.aBoolean30) {
			if (this.anInt618 < 0) {
				if (this.anInt613 >= local58) {
					return;
				}
				this.anInt613 = local58 + local58 - this.anInt613 - 1;
				this.anInt618 = -this.anInt618;
			}
			while (this.anInt613 >= local63) {
				this.anInt613 = local63 + local63 - this.anInt613 - 1;
				this.anInt618 = -this.anInt618;
				if (this.anInt613 >= local58) {
					return;
				}
				this.anInt613 = local58 + local58 - this.anInt613 - 1;
				this.anInt618 = -this.anInt618;
			}
		} else if (this.anInt618 < 0) {
			if (this.anInt613 < local58) {
				this.anInt613 = local63 - (local63 - 1 - this.anInt613) % local73 - 1;
			}
		} else if (this.anInt613 >= local63) {
			this.anInt613 = local58 + (this.anInt613 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()I")
	@Override
	public int method1565() {
		@Pc(4) int local4 = this.anInt619 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt614 == 0) {
			local4 -= local4 * this.anInt613 / (((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7.length << 8);
		} else if (this.anInt614 >= 0) {
			local4 -= local4 * this.anInt610 / ((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)I")
	private int method416(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt615 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt615;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt615 += arg1;
			if (this.anInt618 == 256 && (this.anInt613 & 0xFF) == 0) {
				arg1 = Static111.method407(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, this.anInt616, this.anInt612, local7, arg2, this);
			} else {
				arg1 = Static111.method412(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, this.anInt616, this.anInt612, local7, arg2, this, this.anInt618, arg4);
			}
			this.anInt615 -= arg1;
			if (this.anInt615 != 0) {
				return arg1;
			}
			if (this.anInt611 == Integer.MIN_VALUE) {
				this.method1852();
				return arg3;
			}
			this.anInt619 = this.anInt611;
		}
		return this.anInt618 == 256 && (this.anInt613 & 0xFF) == 0 ? Static111.method419(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, arg3, arg2, this) : Static111.method408(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, arg3, arg2, this, this.anInt618, arg4);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "([IIIII)I")
	private int method418(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt615 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt615;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt615 += arg1;
			if (this.anInt618 == -256 && (this.anInt613 & 0xFF) == 0) {
				arg1 = Static111.method414(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, this.anInt616, this.anInt612, local7, arg2, this);
			} else {
				arg1 = Static111.method415(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, this.anInt616, this.anInt612, local7, arg2, this, this.anInt618, arg4);
			}
			this.anInt615 -= arg1;
			if (this.anInt615 != 0) {
				return arg1;
			}
			if (this.anInt611 == Integer.MIN_VALUE) {
				this.method1852();
				return arg3;
			}
			this.anInt619 = this.anInt611;
		}
		return this.anInt618 == -256 && (this.anInt613 & 0xFF) == 0 ? Static111.method411(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, arg3, arg2, this) : Static111.method417(((Class3_Sub5_Sub1) super.aClass3_Sub5_3).aByteArray7, arg0, this.anInt613, arg1, this.anInt619, arg3, arg2, this, this.anInt618, arg4);
	}
}
