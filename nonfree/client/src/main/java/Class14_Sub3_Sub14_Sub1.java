import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class14_Sub3_Sub14_Sub1 extends Class14_Sub3_Sub14 {

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
	public int anInt8090;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
	public int anInt8091;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
	public int anInt8093;

	@OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
	public int anInt8098;

	@OriginalMember(owner = "client!pn", name = "M", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!pj;II)V")
	public Class14_Sub3_Sub14_Sub1(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray95 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	public void method6746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8093 = arg1;
		this.anInt8090 = arg2 - arg3;
		this.anInt8098 = arg3;
		this.anInt8091 = arg0 - arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
	public void method6747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 0;
		if (arg0 != arg5) {
			local15 = (arg3 - arg2 << 16) / (arg5 - arg0);
		}
		@Pc(35) int local35 = 0;
		if (arg5 != arg1) {
			local35 = (arg4 - arg3 << 16) / (arg1 - arg5);
		}
		@Pc(56) int local56 = 0;
		if (arg0 != arg1) {
			local56 = (arg2 - arg4 << 16) / (arg0 - arg1);
		}
		if (arg5 >= arg0 && arg0 <= arg1) {
			if (arg1 > arg5) {
				arg4 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local15;
					arg4 -= local56 * arg0;
					arg0 = 0;
				}
				if (arg5 < 0) {
					arg3 -= arg5 * local35;
					arg5 = 0;
				}
				if (arg5 != arg0 && local15 > local56 || arg5 == arg0 && local35 < local56) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt8091;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static625.method8790(arg4 >> 16, arg0, arg3 >> 16, this.aByteArray95);
								arg0 += this.anInt8091;
								arg3 += local35;
								arg4 += local56;
							}
						}
						Static625.method8790(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray95);
						arg0 += this.anInt8091;
						arg4 += local56;
						arg2 += local15;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt8091 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static625.method8790(arg3 >> 16, arg0, arg4 >> 16, this.aByteArray95);
								arg4 += local56;
								arg0 += this.anInt8091;
								arg3 += local35;
							}
						}
						Static625.method8790(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray95);
						arg4 += local56;
						arg0 += this.anInt8091;
						arg2 += local15;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local15;
					arg3 -= local56 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg4 -= local35 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg0 || local15 <= local56) && (arg0 != arg1 || local35 <= local15)) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt8091;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static625.method8790(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray95);
								arg4 += local35;
								arg0 += this.anInt8091;
								arg2 += local15;
							}
						}
						Static625.method8790(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray95);
						arg2 += local15;
						arg3 += local56;
						arg0 += this.anInt8091;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt8091 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static625.method8790(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray95);
								arg4 += local35;
								arg0 += this.anInt8091;
								arg2 += local15;
							}
						}
						Static625.method8790(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray95);
						arg2 += local15;
						arg3 += local56;
						arg0 += this.anInt8091;
					}
				}
			}
		} else if (arg5 <= arg1) {
			if (arg0 > arg1) {
				arg2 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local15 * arg5;
					arg3 -= arg5 * local35;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg4 -= local56 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg5 && local35 > local15 || arg1 == arg5 && local56 < local15) {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt8091;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static625.method8790(arg2 >> 16, arg5, arg4 >> 16, this.aByteArray95);
								arg2 += local15;
								arg5 += this.anInt8091;
								arg4 += local56;
							}
						}
						Static625.method8790(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray95);
						arg2 += local15;
						arg5 += this.anInt8091;
						arg3 += local35;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt8091 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static625.method8790(arg4 >> 16, arg5, arg2 >> 16, this.aByteArray95);
								arg4 += local56;
								arg2 += local15;
								arg5 += this.anInt8091;
							}
						}
						Static625.method8790(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray95);
						arg5 += this.anInt8091;
						arg3 += local35;
						arg2 += local15;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local15 * arg5;
					arg3 -= local35 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local56;
					arg0 = 0;
				}
				if (local35 <= local15) {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt8091;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static625.method8790(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray95);
								arg3 += local35;
								arg5 += this.anInt8091;
								arg2 += local56;
							}
						}
						Static625.method8790(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray95);
						arg4 += local15;
						arg5 += this.anInt8091;
						arg3 += local35;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt8091;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static625.method8790(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray95);
								arg2 += local56;
								arg5 += this.anInt8091;
								arg3 += local35;
							}
						}
						Static625.method8790(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray95);
						arg3 += local35;
						arg5 += this.anInt8091;
						arg4 += local15;
					}
				}
			}
		} else if (arg5 > arg0) {
			arg3 = arg4 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= local35 * arg1;
				arg4 -= local56 * arg1;
				arg1 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= local15 * arg0;
				arg0 = 0;
			}
			if (local35 < local56) {
				arg5 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt8091 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static625.method8790(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray95);
							arg1 += this.anInt8091;
							arg3 += local35;
							arg2 += local15;
						}
					}
					Static625.method8790(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray95);
					arg1 += this.anInt8091;
					arg4 += local56;
					arg3 += local35;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt8091;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static625.method8790(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray95);
							arg1 += this.anInt8091;
							arg3 += local35;
							arg2 += local15;
						}
					}
					Static625.method8790(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray95);
					arg3 += local35;
					arg4 += local56;
					arg1 += this.anInt8091;
				}
			}
		} else {
			arg2 = arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local56;
				arg2 -= arg1 * local35;
				arg1 = 0;
			}
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= arg5 * local15;
				arg5 = 0;
			}
			if (local56 > local35) {
				arg0 -= arg5;
				arg5 -= arg1;
				arg1 = this.anInt8091 * arg1;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static625.method8790(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray95);
							arg1 += this.anInt8091;
							arg3 += local15;
							arg4 += local56;
						}
					}
					Static625.method8790(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray95);
					arg1 += this.anInt8091;
					arg2 += local35;
					arg4 += local56;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg1;
				arg1 *= this.anInt8091;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static625.method8790(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray95);
							arg4 += local56;
							arg3 += local15;
							arg1 += this.anInt8091;
						}
					}
					Static625.method8790(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray95);
					arg4 += local56;
					arg1 += this.anInt8091;
					arg2 += local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public void method6750() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray95.length - 8;
		while (local18 > local12) {
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
			local12++;
			this.aByteArray95[local12] = 0;
		}
		while (this.aByteArray95.length - 1 > local12) {
			local12++;
			this.aByteArray95[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBI)Z")
	public boolean method6751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray95.length >= arg1 * arg0;
	}
}
