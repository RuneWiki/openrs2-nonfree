import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	private final int anInt174;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
	private final int anInt171;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!vb;II)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class3_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub7_3 = arg0;
		this.anInt174 = arg0.anInt2692;
		this.anInt171 = arg0.anInt2691;
		this.anInt166 = arg1;
		this.anInt170 = arg2;
		this.anInt168 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method143(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt170 == 0 && (this.anInt167 == 0 || this.anInt165 == 0 || this.anInt165 == Integer.MIN_VALUE)) {
			this.method145(arg2);
			return 0;
		}
		@Pc(21) Class3_Sub7_Sub1 local21 = (Class3_Sub7_Sub1) super.aClass3_Sub7_3;
		@Pc(26) int local26 = this.anInt174 << 8;
		@Pc(31) int local31 = this.anInt171 << 8;
		@Pc(37) int local37 = local21.aByteArray23.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt172 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt172 >= 0) {
			if (this.anInt172 > 0) {
				if (this.aBoolean11) {
					label118: {
						if (this.anInt166 < 0) {
							local48 = this.method158(arg0, arg1, local26, local52, local21.aByteArray23[this.anInt174]);
							if (this.anInt168 >= local26) {
								return 1;
							}
							this.anInt168 = local26 + local26 - this.anInt168 - 1;
							this.anInt166 = -this.anInt166;
							if (--this.anInt172 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method151(arg0, local48, local31, local52, local21.aByteArray23[this.anInt171 - 1]);
							if (this.anInt168 < local31) {
								return 1;
							}
							this.anInt168 = local31 + local31 - this.anInt168 - 1;
							this.anInt166 = -this.anInt166;
							if (--this.anInt172 == 0) {
								break;
							}
							local48 = this.method158(arg0, local48, local26, local52, local21.aByteArray23[this.anInt174]);
							if (this.anInt168 >= local26) {
								return 1;
							}
							this.anInt168 = local26 + local26 - this.anInt168 - 1;
							this.anInt166 = -this.anInt166;
						} while (--this.anInt172 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt166 < 0) {
						while (true) {
							local48 = this.method158(arg0, local48, local26, local52, local21.aByteArray23[this.anInt171 - 1]);
							if (this.anInt168 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt168 - 1) / local41;
							if (local398 >= this.anInt172) {
								this.anInt168 += local41 * this.anInt172;
								this.anInt172 = 0;
								break;
							}
							this.anInt168 += local41 * local398;
							this.anInt172 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method151(arg0, local48, local31, local52, local21.aByteArray23[this.anInt174]);
							if (this.anInt168 < local31) {
								return 1;
							}
							local398 = (this.anInt168 - local26) / local41;
							if (local398 >= this.anInt172) {
								this.anInt168 -= local41 * this.anInt172;
								this.anInt172 = 0;
								break;
							}
							this.anInt168 -= local41 * local398;
							this.anInt172 -= local398;
						}
					}
				}
			}
			if (this.anInt166 < 0) {
				this.method158(arg0, local48, 0, local52, 0);
				if (this.anInt168 < 0) {
					this.anInt168 = 0;
					this.method1883();
				}
			} else {
				this.method151(arg0, local48, local37, local52, 0);
				if (this.anInt168 >= local37) {
					this.anInt168 = local37 - 1;
					this.method1883();
				}
			}
			return 1;
		} else if (this.aBoolean11) {
			if (this.anInt166 < 0) {
				local48 = this.method158(arg0, arg1, local26, local52, local21.aByteArray23[this.anInt174]);
				if (this.anInt168 >= local26) {
					return 1;
				}
				this.anInt168 = local26 + local26 - this.anInt168 - 1;
				this.anInt166 = -this.anInt166;
			}
			while (true) {
				local48 = this.method151(arg0, local48, local31, local52, local21.aByteArray23[this.anInt171 - 1]);
				if (this.anInt168 < local31) {
					return 1;
				}
				this.anInt168 = local31 + local31 - this.anInt168 - 1;
				this.anInt166 = -this.anInt166;
				local48 = this.method158(arg0, local48, local26, local52, local21.aByteArray23[this.anInt174]);
				if (this.anInt168 >= local26) {
					return 1;
				}
				this.anInt168 = local26 + local26 - this.anInt168 - 1;
				this.anInt166 = -this.anInt166;
			}
		} else if (this.anInt166 < 0) {
			while (true) {
				local48 = this.method158(arg0, local48, local26, local52, local21.aByteArray23[this.anInt171 - 1]);
				if (this.anInt168 >= local26) {
					return 1;
				}
				this.anInt168 = local31 - (local31 - 1 - this.anInt168) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method151(arg0, local48, local31, local52, local21.aByteArray23[this.anInt174]);
				if (this.anInt168 < local31) {
					return 1;
				}
				this.anInt168 = local26 + (this.anInt168 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIII)I")
	private int method151(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt167 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt167;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt167 += arg1;
			if (this.anInt166 == 256 && (this.anInt168 & 0xFF) == 0) {
				arg1 = Static111.method147(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, this.anInt173, this.anInt169, local7, arg2, this);
			} else {
				arg1 = Static111.method157(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, this.anInt173, this.anInt169, local7, arg2, this, this.anInt166, arg4);
			}
			this.anInt167 -= arg1;
			if (this.anInt167 != 0) {
				return arg1;
			}
			if (this.anInt165 == Integer.MIN_VALUE) {
				this.method1883();
				return arg3;
			}
			this.anInt170 = this.anInt165;
		}
		return this.anInt166 == 256 && (this.anInt168 & 0xFF) == 0 ? Static111.method148(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, arg3, arg2, this) : Static111.method156(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, arg3, arg2, this, this.anInt166, arg4);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()Z")
	public boolean method153() {
		return this.method1888();
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public synchronized void method155(@OriginalArg(0) int arg0) {
		this.anInt170 = arg0;
		this.anInt167 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "([IIIII)I")
	private int method158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt167 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt167;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt167 += arg1;
			if (this.anInt166 == -256 && (this.anInt168 & 0xFF) == 0) {
				arg1 = Static111.method149(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, this.anInt173, this.anInt169, local7, arg2, this);
			} else {
				arg1 = Static111.method154(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, this.anInt173, this.anInt169, local7, arg2, this, this.anInt166, arg4);
			}
			this.anInt167 -= arg1;
			if (this.anInt167 != 0) {
				return arg1;
			}
			if (this.anInt165 == Integer.MIN_VALUE) {
				this.method1883();
				return arg3;
			}
			this.anInt170 = this.anInt165;
		}
		return this.anInt166 == -256 && (this.anInt168 & 0xFF) == 0 ? Static111.method152(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, arg3, arg2, this) : Static111.method150(((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23, arg0, this.anInt168, arg1, this.anInt170, arg3, arg2, this, this.anInt166, arg4);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
	@Override
	public int method144() {
		@Pc(4) int local4 = this.anInt170 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt172 == 0) {
			local4 -= local4 * this.anInt168 / (((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23.length << 8);
		} else if (this.anInt172 >= 0) {
			local4 -= local4 * this.anInt174 / ((Class3_Sub7_Sub1) super.aClass3_Sub7_3).aByteArray23.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method145(@OriginalArg(0) int arg0) {
		if (this.anInt167 > 0) {
			if (arg0 >= this.anInt167) {
				if (this.anInt165 == Integer.MIN_VALUE) {
					this.method1883();
					arg0 = this.anInt167;
				} else {
					this.anInt170 = this.anInt165;
				}
				this.anInt167 = 0;
			} else {
				this.anInt170 += this.anInt169 * arg0;
				this.anInt167 -= arg0;
			}
		}
		this.anInt168 += this.anInt166 * arg0;
		@Pc(53) Class3_Sub7_Sub1 local53 = (Class3_Sub7_Sub1) super.aClass3_Sub7_3;
		@Pc(58) int local58 = this.anInt174 << 8;
		@Pc(63) int local63 = this.anInt171 << 8;
		@Pc(69) int local69 = local53.aByteArray23.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt172 = 0;
		}
		if (this.anInt172 >= 0) {
			if (this.anInt172 > 0) {
				if (this.aBoolean11) {
					label113: {
						if (this.anInt166 < 0) {
							if (this.anInt168 >= local58) {
								return;
							}
							this.anInt168 = local58 + local58 - this.anInt168 - 1;
							this.anInt166 = -this.anInt166;
							if (--this.anInt172 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt168 < local63) {
								return;
							}
							this.anInt168 = local63 + local63 - this.anInt168 - 1;
							this.anInt166 = -this.anInt166;
							if (--this.anInt172 == 0) {
								break;
							}
							if (this.anInt168 >= local58) {
								return;
							}
							this.anInt168 = local58 + local58 - this.anInt168 - 1;
							this.anInt166 = -this.anInt166;
						} while (--this.anInt172 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt166 < 0) {
						if (this.anInt168 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt168 - 1) / local73;
						if (local299 < this.anInt172) {
							this.anInt168 += local73 * local299;
							this.anInt172 -= local299;
							return;
						}
						this.anInt168 += local73 * this.anInt172;
						this.anInt172 = 0;
					} else if (this.anInt168 >= local63) {
						local299 = (this.anInt168 - local58) / local73;
						if (local299 < this.anInt172) {
							this.anInt168 -= local73 * local299;
							this.anInt172 -= local299;
							return;
						}
						this.anInt168 -= local73 * this.anInt172;
						this.anInt172 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt166 < 0) {
				if (this.anInt168 < 0) {
					this.anInt168 = 0;
					this.method1883();
					return;
				}
			} else if (this.anInt168 >= local69) {
				this.anInt168 = local69 - 1;
				this.method1883();
			}
		} else if (this.aBoolean11) {
			if (this.anInt166 < 0) {
				if (this.anInt168 >= local58) {
					return;
				}
				this.anInt168 = local58 + local58 - this.anInt168 - 1;
				this.anInt166 = -this.anInt166;
			}
			while (this.anInt168 >= local63) {
				this.anInt168 = local63 + local63 - this.anInt168 - 1;
				this.anInt166 = -this.anInt166;
				if (this.anInt168 >= local58) {
					return;
				}
				this.anInt168 = local58 + local58 - this.anInt168 - 1;
				this.anInt166 = -this.anInt166;
			}
		} else if (this.anInt166 < 0) {
			if (this.anInt168 < local58) {
				this.anInt168 = local63 - (local63 - 1 - this.anInt168) % local73 - 1;
			}
		} else if (this.anInt168 >= local63) {
			this.anInt168 = local58 + (this.anInt168 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
	public synchronized void method159(@OriginalArg(0) int arg0) {
		this.anInt172 = arg0;
	}
}
