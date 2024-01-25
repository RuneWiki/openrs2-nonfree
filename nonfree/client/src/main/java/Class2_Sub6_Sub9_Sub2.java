import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class2_Sub6_Sub9_Sub2 extends Class2_Sub6_Sub9 {

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
	public int anInt5298;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
	public int anInt5301;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
	public int anInt5302;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
	public int anInt5303;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!lb;II)V")
	public Class2_Sub6_Sub9_Sub2(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray73 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
	public boolean method4757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray73.length;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBIII)V")
	public void method4758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5301 = arg3 - arg0;
		this.anInt5298 = arg1;
		this.anInt5303 = arg0;
		this.anInt5302 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	public void method4759() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray73.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
		}
		while (local7 < this.aByteArray73.length - 1) {
			local7++;
			this.aByteArray73[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBIIIII)V")
	public void method4761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg3) {
			local7 = (arg5 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(23) int local23 = 0;
		if (arg3 != arg4) {
			local23 = (arg1 - arg5 << 16) / (arg4 - arg3);
		}
		@Pc(43) int local43 = 0;
		if (arg4 != arg2) {
			local43 = (arg0 - arg1 << 16) / (arg2 - arg4);
		}
		if (arg2 <= arg3 && arg4 >= arg2) {
			if (arg4 > arg3) {
				arg1 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local43;
					arg0 -= local7 * arg2;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg5 -= arg3 * local23;
					arg3 = 0;
				}
				if (arg3 != arg2 && local7 > local43 || arg3 == arg2 && local23 < local43) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt5302;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg2, arg5 >> 16, arg1 >> 16);
								arg2 += this.anInt5302;
								arg1 += local43;
								arg5 += local23;
							}
						}
						Static361.method5167(this.aByteArray73, arg2, arg0 >> 16, arg1 >> 16);
						arg0 += local7;
						arg1 += local43;
						arg2 += this.anInt5302;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt5302;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg2, arg1 >> 16, arg5 >> 16);
								arg1 += local43;
								arg5 += local23;
								arg2 += this.anInt5302;
							}
						}
						Static361.method5167(this.aByteArray73, arg2, arg1 >> 16, arg0 >> 16);
						arg1 += local43;
						arg0 += local7;
						arg2 += this.anInt5302;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local43;
					arg0 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local23;
					arg4 = 0;
				}
				if ((arg4 == arg2 || local43 >= local7) && (arg2 != arg4 || local23 <= local7)) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt5302 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg2, arg1 >> 16, arg0 >> 16);
								arg2 += this.anInt5302;
								arg0 += local7;
								arg1 += local23;
							}
						}
						Static361.method5167(this.aByteArray73, arg2, arg5 >> 16, arg0 >> 16);
						arg5 += local43;
						arg2 += this.anInt5302;
						arg0 += local7;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt5302 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg2, arg0 >> 16, arg1 >> 16);
								arg0 += local7;
								arg1 += local23;
								arg2 += this.anInt5302;
							}
						}
						Static361.method5167(this.aByteArray73, arg2, arg0 >> 16, arg5 >> 16);
						arg0 += local7;
						arg5 += local43;
						arg2 += this.anInt5302;
					}
				}
			}
		} else if (arg4 >= arg3) {
			if (arg2 <= arg4) {
				arg1 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local7 * arg3;
					arg5 -= local23 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local43 * arg2;
					arg2 = 0;
				}
				if (local7 >= local23) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt5302 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg3, arg0 >> 16, arg5 >> 16);
								arg0 += local43;
								arg5 += local23;
								arg3 += this.anInt5302;
							}
						}
						Static361.method5167(this.aByteArray73, arg3, arg1 >> 16, arg5 >> 16);
						arg1 += local7;
						arg5 += local23;
						arg3 += this.anInt5302;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt5302 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg3, arg5 >> 16, arg0 >> 16);
								arg5 += local23;
								arg0 += local43;
								arg3 += this.anInt5302;
							}
						}
						Static361.method5167(this.aByteArray73, arg3, arg5 >> 16, arg1 >> 16);
						arg5 += local23;
						arg1 += local7;
						arg3 += this.anInt5302;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= local7 * arg3;
					arg5 -= arg3 * local23;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local43;
					arg4 = 0;
				}
				if ((arg4 == arg3 || local7 >= local23) && (arg3 != arg4 || local7 <= local43)) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt5302 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg3, arg0 >> 16, arg1 >> 16);
								arg1 += local43;
								arg0 += local7;
								arg3 += this.anInt5302;
							}
						}
						Static361.method5167(this.aByteArray73, arg3, arg0 >> 16, arg5 >> 16);
						arg3 += this.anInt5302;
						arg0 += local7;
						arg5 += local23;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt5302;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static361.method5167(this.aByteArray73, arg3, arg1 >> 16, arg0 >> 16);
								arg0 += local7;
								arg1 += local43;
								arg3 += this.anInt5302;
							}
						}
						Static361.method5167(this.aByteArray73, arg3, arg5 >> 16, arg0 >> 16);
						arg0 += local7;
						arg3 += this.anInt5302;
						arg5 += local23;
					}
				}
			}
		} else if (arg3 > arg2) {
			arg5 = arg1 <<= 0x10;
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local43;
				arg5 -= local23 * arg4;
				arg4 = 0;
			}
			if (arg2 < 0) {
				arg0 -= arg2 * local7;
				arg2 = 0;
			}
			if (local23 < local43) {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt5302 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static361.method5167(this.aByteArray73, arg4, arg0 >> 16, arg5 >> 16);
							arg4 += this.anInt5302;
							arg5 += local23;
							arg0 += local7;
						}
					}
					Static361.method5167(this.aByteArray73, arg4, arg1 >> 16, arg5 >> 16);
					arg4 += this.anInt5302;
					arg5 += local23;
					arg1 += local43;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt5302;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static361.method5167(this.aByteArray73, arg4, arg5 >> 16, arg0 >> 16);
							arg5 += local23;
							arg0 += local7;
							arg4 += this.anInt5302;
						}
					}
					Static361.method5167(this.aByteArray73, arg4, arg5 >> 16, arg1 >> 16);
					arg5 += local23;
					arg4 += this.anInt5302;
					arg1 += local43;
				}
			}
		} else {
			arg0 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local23 * arg4;
				arg1 -= local43 * arg4;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local7;
				arg3 = 0;
			}
			if (local23 >= local43) {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt5302;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static361.method5167(this.aByteArray73, arg4, arg5 >> 16, arg1 >> 16);
							arg1 += local43;
							arg5 += local7;
							arg4 += this.anInt5302;
						}
					}
					Static361.method5167(this.aByteArray73, arg4, arg0 >> 16, arg1 >> 16);
					arg0 += local23;
					arg1 += local43;
					arg4 += this.anInt5302;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt5302;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static361.method5167(this.aByteArray73, arg4, arg1 >> 16, arg5 >> 16);
							arg4 += this.anInt5302;
							arg1 += local43;
							arg5 += local7;
						}
					}
					Static361.method5167(this.aByteArray73, arg4, arg1 >> 16, arg0 >> 16);
					arg0 += local23;
					arg4 += this.anInt5302;
					arg1 += local43;
				}
			}
		}
	}
}
