import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class2_Sub1_Sub11_Sub1 extends Class2_Sub1_Sub11 {

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
	public int anInt5980;

	@OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
	public int anInt5982;

	@OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
	public int anInt5983;

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "I")
	public int anInt5986;

	@OriginalMember(owner = "client!kw", name = "J", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!lea;II)V")
	public Class2_Sub1_Sub11_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray56 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
	public void method5407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5983 = arg3;
		this.anInt5980 = arg1 - arg3;
		this.anInt5982 = arg2;
		this.anInt5986 = arg0 - arg2;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
	public void method5409() {
		@Pc(7) int local7 = -1;
		@Pc(16) int local16 = this.aByteArray56.length - 8;
		while (local16 > local7) {
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
			local7++;
			this.aByteArray56[local7] = 0;
		}
		while (this.aByteArray56.length - 1 > local7) {
			local7++;
			this.aByteArray56[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIIIIII)V")
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg0) {
			local7 = (arg5 - arg3 << 16) / (arg0 - arg1);
		}
		@Pc(24) int local24 = 0;
		if (arg0 != arg4) {
			local24 = (arg2 - arg5 << 16) / (arg4 - arg0);
		}
		@Pc(40) int local40 = 0;
		if (arg4 != arg1) {
			local40 = (arg3 - arg2 << 16) / (arg1 - arg4);
		}
		if (arg0 >= arg1 && arg4 >= arg1) {
			if (arg0 >= arg4) {
				arg5 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg5 -= local40 * arg1;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg2 -= local24 * arg4;
					arg4 = 0;
				}
				if (arg1 != arg4 && local7 > local40 || arg1 == arg4 && local24 > local7) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt5980;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static350.method6054(arg1, arg3 >> 16, arg2 >> 16, this.aByteArray56);
								arg3 += local7;
								arg2 += local24;
								arg1 += this.anInt5980;
							}
						}
						Static350.method6054(arg1, arg3 >> 16, arg5 >> 16, this.aByteArray56);
						arg3 += local7;
						arg1 += this.anInt5980;
						arg5 += local40;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt5980;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static350.method6054(arg1, arg2 >> 16, arg3 >> 16, this.aByteArray56);
								arg1 += this.anInt5980;
								arg2 += local24;
								arg3 += local7;
							}
						}
						Static350.method6054(arg1, arg5 >> 16, arg3 >> 16, this.aByteArray56);
						arg1 += this.anInt5980;
						arg3 += local7;
						arg5 += local40;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local40;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local24 * arg0;
					arg0 = 0;
				}
				if ((arg1 == arg0 || local7 <= local40) && (arg1 != arg0 || local40 <= local24)) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt5980;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static350.method6054(arg1, arg2 >> 16, arg5 >> 16, this.aByteArray56);
								arg2 += local40;
								arg5 += local24;
								arg1 += this.anInt5980;
							}
						}
						Static350.method6054(arg1, arg2 >> 16, arg3 >> 16, this.aByteArray56);
						arg3 += local7;
						arg2 += local40;
						arg1 += this.anInt5980;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt5980 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static350.method6054(arg1, arg5 >> 16, arg2 >> 16, this.aByteArray56);
								arg2 += local40;
								arg1 += this.anInt5980;
								arg5 += local24;
							}
						}
						Static350.method6054(arg1, arg3 >> 16, arg2 >> 16, this.aByteArray56);
						arg1 += this.anInt5980;
						arg2 += local40;
						arg3 += local7;
					}
				}
			}
		} else if (arg0 > arg4) {
			if (arg1 >= arg0) {
				arg3 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local24;
					arg2 -= arg4 * local40;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				if (local40 > local24) {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt5980 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static350.method6054(arg4, arg2 >> 16, arg5 >> 16, this.aByteArray56);
								arg2 += local40;
								arg5 += local7;
								arg4 += this.anInt5980;
							}
						}
						Static350.method6054(arg4, arg2 >> 16, arg3 >> 16, this.aByteArray56);
						arg3 += local24;
						arg2 += local40;
						arg4 += this.anInt5980;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt5980 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static350.method6054(arg4, arg5 >> 16, arg2 >> 16, this.aByteArray56);
								arg2 += local40;
								arg4 += this.anInt5980;
								arg5 += local7;
							}
						}
						Static350.method6054(arg4, arg3 >> 16, arg2 >> 16, this.aByteArray56);
						arg3 += local24;
						arg4 += this.anInt5980;
						arg2 += local40;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local40;
					arg5 -= arg4 * local24;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (local24 < local40) {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt5980;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static350.method6054(arg4, arg3 >> 16, arg5 >> 16, this.aByteArray56);
								arg3 += local7;
								arg5 += local24;
								arg4 += this.anInt5980;
							}
						}
						Static350.method6054(arg4, arg2 >> 16, arg5 >> 16, this.aByteArray56);
						arg5 += local24;
						arg2 += local40;
						arg4 += this.anInt5980;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt5980;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static350.method6054(arg4, arg5 >> 16, arg3 >> 16, this.aByteArray56);
								arg3 += local7;
								arg5 += local24;
								arg4 += this.anInt5980;
							}
						}
						Static350.method6054(arg4, arg5 >> 16, arg2 >> 16, this.aByteArray56);
						arg2 += local40;
						arg5 += local24;
						arg4 += this.anInt5980;
					}
				}
			}
		} else if (arg1 <= arg4) {
			arg2 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= local7 * arg0;
				arg5 -= arg0 * local24;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local40;
				arg1 = 0;
			}
			if (local24 <= local7) {
				arg4 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt5980;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static350.method6054(arg0, arg3 >> 16, arg5 >> 16, this.aByteArray56);
							arg3 += local40;
							arg5 += local24;
							arg0 += this.anInt5980;
						}
					}
					Static350.method6054(arg0, arg2 >> 16, arg5 >> 16, this.aByteArray56);
					arg5 += local24;
					arg2 += local7;
					arg0 += this.anInt5980;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt5980;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static350.method6054(arg0, arg5 >> 16, arg3 >> 16, this.aByteArray56);
							arg3 += local40;
							arg0 += this.anInt5980;
							arg5 += local24;
						}
					}
					Static350.method6054(arg0, arg5 >> 16, arg2 >> 16, this.aByteArray56);
					arg2 += local7;
					arg5 += local24;
					arg0 += this.anInt5980;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= arg0 * local24;
				arg3 -= local7 * arg0;
				arg0 = 0;
			}
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local40 * arg4;
				arg4 = 0;
			}
			if (arg0 != arg4 && local7 < local24 || arg4 == arg0 && local7 > local40) {
				arg1 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt5980;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static350.method6054(arg0, arg2 >> 16, arg3 >> 16, this.aByteArray56);
							arg3 += local7;
							arg0 += this.anInt5980;
							arg2 += local40;
						}
					}
					Static350.method6054(arg0, arg5 >> 16, arg3 >> 16, this.aByteArray56);
					arg3 += local7;
					arg0 += this.anInt5980;
					arg5 += local24;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt5980 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static350.method6054(arg0, arg3 >> 16, arg2 >> 16, this.aByteArray56);
							arg0 += this.anInt5980;
							arg2 += local40;
							arg3 += local7;
						}
					}
					Static350.method6054(arg0, arg3 >> 16, arg5 >> 16, this.aByteArray56);
					arg5 += local24;
					arg0 += this.anInt5980;
					arg3 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z")
	public boolean method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray56.length;
	}
}
