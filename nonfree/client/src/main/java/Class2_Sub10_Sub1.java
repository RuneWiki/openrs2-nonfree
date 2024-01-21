import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
	private int anInt2230;

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
	private int anInt2232;

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
	private int anInt2235;

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
	private int anInt2236;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
	private int anInt2237;

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
	private final int anInt2231;

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
	private final int anInt2228;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
	private int anInt2229;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
	public int anInt2233;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
	public int anInt2234;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!nd;II)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub4_3 = arg0;
		this.anInt2231 = arg0.anInt2063;
		this.anInt2228 = arg0.anInt2062;
		this.anInt2229 = arg1;
		this.anInt2233 = arg2;
		this.anInt2234 = 0;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public synchronized void method1318(@OriginalArg(0) int arg0) {
		this.anInt2237 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()I")
	@Override
	public int method1667() {
		@Pc(4) int local4 = this.anInt2233 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt2237 == 0) {
			local4 -= local4 * this.anInt2234 / (((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53.length << 8);
		} else if (this.anInt2237 >= 0) {
			local4 -= local4 * this.anInt2231 / ((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "()Z")
	public boolean method1326() {
		return this.method1795();
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	public synchronized void method1327(@OriginalArg(0) int arg0) {
		this.anInt2233 = arg0;
		this.anInt2230 = 0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1668(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2233 == 0 && (this.anInt2230 == 0 || this.anInt2235 == 0 || this.anInt2235 == Integer.MIN_VALUE)) {
			this.method1669(arg2);
			return 0;
		}
		@Pc(21) Class2_Sub4_Sub1 local21 = (Class2_Sub4_Sub1) super.aClass2_Sub4_3;
		@Pc(26) int local26 = this.anInt2231 << 8;
		@Pc(31) int local31 = this.anInt2228 << 8;
		@Pc(37) int local37 = local21.aByteArray53.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt2237 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt2237 >= 0) {
			if (this.anInt2237 > 0) {
				if (this.aBoolean117) {
					label118: {
						if (this.anInt2229 < 0) {
							local48 = this.method1328(arg0, arg1, local26, local52, local21.aByteArray53[this.anInt2231]);
							if (this.anInt2234 >= local26) {
								return 1;
							}
							this.anInt2234 = local26 + local26 - this.anInt2234 - 1;
							this.anInt2229 = -this.anInt2229;
							if (--this.anInt2237 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1329(arg0, local48, local31, local52, local21.aByteArray53[this.anInt2228 - 1]);
							if (this.anInt2234 < local31) {
								return 1;
							}
							this.anInt2234 = local31 + local31 - this.anInt2234 - 1;
							this.anInt2229 = -this.anInt2229;
							if (--this.anInt2237 == 0) {
								break;
							}
							local48 = this.method1328(arg0, local48, local26, local52, local21.aByteArray53[this.anInt2231]);
							if (this.anInt2234 >= local26) {
								return 1;
							}
							this.anInt2234 = local26 + local26 - this.anInt2234 - 1;
							this.anInt2229 = -this.anInt2229;
						} while (--this.anInt2237 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt2229 < 0) {
						while (true) {
							local48 = this.method1328(arg0, local48, local26, local52, local21.aByteArray53[this.anInt2228 - 1]);
							if (this.anInt2234 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt2234 - 1) / local41;
							if (local398 >= this.anInt2237) {
								this.anInt2234 += local41 * this.anInt2237;
								this.anInt2237 = 0;
								break;
							}
							this.anInt2234 += local41 * local398;
							this.anInt2237 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1329(arg0, local48, local31, local52, local21.aByteArray53[this.anInt2231]);
							if (this.anInt2234 < local31) {
								return 1;
							}
							local398 = (this.anInt2234 - local26) / local41;
							if (local398 >= this.anInt2237) {
								this.anInt2234 -= local41 * this.anInt2237;
								this.anInt2237 = 0;
								break;
							}
							this.anInt2234 -= local41 * local398;
							this.anInt2237 -= local398;
						}
					}
				}
			}
			if (this.anInt2229 < 0) {
				this.method1328(arg0, local48, 0, local52, 0);
				if (this.anInt2234 < 0) {
					this.anInt2234 = 0;
					this.method1794();
				}
			} else {
				this.method1329(arg0, local48, local37, local52, 0);
				if (this.anInt2234 >= local37) {
					this.anInt2234 = local37 - 1;
					this.method1794();
				}
			}
			return 1;
		} else if (this.aBoolean117) {
			if (this.anInt2229 < 0) {
				local48 = this.method1328(arg0, arg1, local26, local52, local21.aByteArray53[this.anInt2231]);
				if (this.anInt2234 >= local26) {
					return 1;
				}
				this.anInt2234 = local26 + local26 - this.anInt2234 - 1;
				this.anInt2229 = -this.anInt2229;
			}
			while (true) {
				local48 = this.method1329(arg0, local48, local31, local52, local21.aByteArray53[this.anInt2228 - 1]);
				if (this.anInt2234 < local31) {
					return 1;
				}
				this.anInt2234 = local31 + local31 - this.anInt2234 - 1;
				this.anInt2229 = -this.anInt2229;
				local48 = this.method1328(arg0, local48, local26, local52, local21.aByteArray53[this.anInt2231]);
				if (this.anInt2234 >= local26) {
					return 1;
				}
				this.anInt2234 = local26 + local26 - this.anInt2234 - 1;
				this.anInt2229 = -this.anInt2229;
			}
		} else if (this.anInt2229 < 0) {
			while (true) {
				local48 = this.method1328(arg0, local48, local26, local52, local21.aByteArray53[this.anInt2228 - 1]);
				if (this.anInt2234 >= local26) {
					return 1;
				}
				this.anInt2234 = local31 - (local31 - 1 - this.anInt2234) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1329(arg0, local48, local31, local52, local21.aByteArray53[this.anInt2231]);
				if (this.anInt2234 < local31) {
					return 1;
				}
				this.anInt2234 = local26 + (this.anInt2234 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIII)I")
	private int method1328(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2230 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2230;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2230 += arg1;
			if (this.anInt2229 == -256 && (this.anInt2234 & 0xFF) == 0) {
				arg1 = Static113.method1322(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, this.anInt2236, this.anInt2232, local7, arg2, this);
			} else {
				arg1 = Static113.method1320(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, this.anInt2236, this.anInt2232, local7, arg2, this, this.anInt2229, arg4);
			}
			this.anInt2230 -= arg1;
			if (this.anInt2230 != 0) {
				return arg1;
			}
			if (this.anInt2235 == Integer.MIN_VALUE) {
				this.method1794();
				return arg3;
			}
			this.anInt2233 = this.anInt2235;
		}
		return this.anInt2229 == -256 && (this.anInt2234 & 0xFF) == 0 ? Static113.method1330(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, arg3, arg2, this) : Static113.method1324(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, arg3, arg2, this, this.anInt2229, arg4);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1669(@OriginalArg(0) int arg0) {
		if (this.anInt2230 > 0) {
			if (arg0 >= this.anInt2230) {
				if (this.anInt2235 == Integer.MIN_VALUE) {
					this.method1794();
					arg0 = this.anInt2230;
				} else {
					this.anInt2233 = this.anInt2235;
				}
				this.anInt2230 = 0;
			} else {
				this.anInt2233 += this.anInt2232 * arg0;
				this.anInt2230 -= arg0;
			}
		}
		this.anInt2234 += this.anInt2229 * arg0;
		@Pc(53) Class2_Sub4_Sub1 local53 = (Class2_Sub4_Sub1) super.aClass2_Sub4_3;
		@Pc(58) int local58 = this.anInt2231 << 8;
		@Pc(63) int local63 = this.anInt2228 << 8;
		@Pc(69) int local69 = local53.aByteArray53.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt2237 = 0;
		}
		if (this.anInt2237 >= 0) {
			if (this.anInt2237 > 0) {
				if (this.aBoolean117) {
					label113: {
						if (this.anInt2229 < 0) {
							if (this.anInt2234 >= local58) {
								return;
							}
							this.anInt2234 = local58 + local58 - this.anInt2234 - 1;
							this.anInt2229 = -this.anInt2229;
							if (--this.anInt2237 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt2234 < local63) {
								return;
							}
							this.anInt2234 = local63 + local63 - this.anInt2234 - 1;
							this.anInt2229 = -this.anInt2229;
							if (--this.anInt2237 == 0) {
								break;
							}
							if (this.anInt2234 >= local58) {
								return;
							}
							this.anInt2234 = local58 + local58 - this.anInt2234 - 1;
							this.anInt2229 = -this.anInt2229;
						} while (--this.anInt2237 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt2229 < 0) {
						if (this.anInt2234 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt2234 - 1) / local73;
						if (local299 < this.anInt2237) {
							this.anInt2234 += local73 * local299;
							this.anInt2237 -= local299;
							return;
						}
						this.anInt2234 += local73 * this.anInt2237;
						this.anInt2237 = 0;
					} else if (this.anInt2234 >= local63) {
						local299 = (this.anInt2234 - local58) / local73;
						if (local299 < this.anInt2237) {
							this.anInt2234 -= local73 * local299;
							this.anInt2237 -= local299;
							return;
						}
						this.anInt2234 -= local73 * this.anInt2237;
						this.anInt2237 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2229 < 0) {
				if (this.anInt2234 < 0) {
					this.anInt2234 = 0;
					this.method1794();
					return;
				}
			} else if (this.anInt2234 >= local69) {
				this.anInt2234 = local69 - 1;
				this.method1794();
			}
		} else if (this.aBoolean117) {
			if (this.anInt2229 < 0) {
				if (this.anInt2234 >= local58) {
					return;
				}
				this.anInt2234 = local58 + local58 - this.anInt2234 - 1;
				this.anInt2229 = -this.anInt2229;
			}
			while (this.anInt2234 >= local63) {
				this.anInt2234 = local63 + local63 - this.anInt2234 - 1;
				this.anInt2229 = -this.anInt2229;
				if (this.anInt2234 >= local58) {
					return;
				}
				this.anInt2234 = local58 + local58 - this.anInt2234 - 1;
				this.anInt2229 = -this.anInt2229;
			}
		} else if (this.anInt2229 < 0) {
			if (this.anInt2234 < local58) {
				this.anInt2234 = local63 - (local63 - 1 - this.anInt2234) % local73 - 1;
			}
		} else if (this.anInt2234 >= local63) {
			this.anInt2234 = local58 + (this.anInt2234 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "([IIIII)I")
	private int method1329(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2230 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2230;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2230 += arg1;
			if (this.anInt2229 == 256 && (this.anInt2234 & 0xFF) == 0) {
				arg1 = Static113.method1325(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, this.anInt2236, this.anInt2232, local7, arg2, this);
			} else {
				arg1 = Static113.method1331(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, this.anInt2236, this.anInt2232, local7, arg2, this, this.anInt2229, arg4);
			}
			this.anInt2230 -= arg1;
			if (this.anInt2230 != 0) {
				return arg1;
			}
			if (this.anInt2235 == Integer.MIN_VALUE) {
				this.method1794();
				return arg3;
			}
			this.anInt2233 = this.anInt2235;
		}
		return this.anInt2229 == 256 && (this.anInt2234 & 0xFF) == 0 ? Static113.method1319(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, arg3, arg2, this) : Static113.method1323(((Class2_Sub4_Sub1) super.aClass2_Sub4_3).aByteArray53, arg0, this.anInt2234, arg1, this.anInt2233, arg3, arg2, this, this.anInt2229, arg4);
	}
}
