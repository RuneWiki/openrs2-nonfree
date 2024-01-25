import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class2_Sub11_Sub10_Sub1 extends Class2_Sub11_Sub10 {

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
	public int anInt3386;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
	public int anInt3387;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
	public int anInt3388;

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
	public int anInt3389;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!ao;II)V")
	public Class2_Sub11_Sub10_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray50 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)Z")
	public boolean method3131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray50.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	public void method3132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3388 = arg3;
		this.anInt3387 = arg0;
		this.anInt3386 = arg2 - arg3;
		this.anInt3389 = arg1 - arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIBIII)V")
	public void method3133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 != arg2) {
			local1 = (arg5 - arg1 << 16) / (arg2 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg3 != arg2) {
			local24 = (arg4 - arg5 << 16) / (arg3 - arg2);
		}
		@Pc(45) int local45 = 0;
		if (arg0 != arg3) {
			local45 = (arg1 - arg4 << 16) / (arg0 - arg3);
		}
		if (arg0 <= arg2 && arg3 >= arg0) {
			if (arg3 <= arg2) {
				arg5 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local45 * arg0;
					arg1 -= local1 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg4 -= arg3 * local24;
					arg3 = 0;
				}
				if (arg3 != arg0 && local1 > local45 || arg3 == arg0 && local1 < local24) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt3386 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static363.method3135(arg0, this.aByteArray50, arg1 >> 16, arg4 >> 16);
								arg0 += this.anInt3386;
								arg1 += local1;
								arg4 += local24;
							}
						}
						Static363.method3135(arg0, this.aByteArray50, arg1 >> 16, arg5 >> 16);
						arg0 += this.anInt3386;
						arg1 += local1;
						arg5 += local45;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt3386 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static363.method3135(arg0, this.aByteArray50, arg4 >> 16, arg1 >> 16);
								arg0 += this.anInt3386;
								arg1 += local1;
								arg4 += local24;
							}
						}
						Static363.method3135(arg0, this.aByteArray50, arg5 >> 16, arg1 >> 16);
						arg1 += local1;
						arg0 += this.anInt3386;
						arg5 += local45;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local1 * arg0;
					arg4 -= local45 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local24 * arg2;
					arg2 = 0;
				}
				if (arg0 != arg2 && local1 > local45 || arg0 == arg2 && local45 > local24) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt3386 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static363.method3135(arg0, this.aByteArray50, arg5 >> 16, arg4 >> 16);
								arg5 += local24;
								arg4 += local45;
								arg0 += this.anInt3386;
							}
						}
						Static363.method3135(arg0, this.aByteArray50, arg1 >> 16, arg4 >> 16);
						arg0 += this.anInt3386;
						arg1 += local1;
						arg4 += local45;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3386;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static363.method3135(arg0, this.aByteArray50, arg4 >> 16, arg5 >> 16);
								arg5 += local24;
								arg0 += this.anInt3386;
								arg4 += local45;
							}
						}
						Static363.method3135(arg0, this.aByteArray50, arg4 >> 16, arg1 >> 16);
						arg1 += local1;
						arg4 += local45;
						arg0 += this.anInt3386;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 < arg0) {
				arg1 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local24 * arg2;
					arg1 -= local1 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local45 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg2 && local1 < local24 || arg2 == arg3 && local45 < local1) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3386;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static363.method3135(arg2, this.aByteArray50, arg4 >> 16, arg1 >> 16);
								arg1 += local1;
								arg4 += local45;
								arg2 += this.anInt3386;
							}
						}
						Static363.method3135(arg2, this.aByteArray50, arg5 >> 16, arg1 >> 16);
						arg2 += this.anInt3386;
						arg1 += local1;
						arg5 += local24;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt3386 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static363.method3135(arg2, this.aByteArray50, arg1 >> 16, arg4 >> 16);
								arg1 += local1;
								arg2 += this.anInt3386;
								arg4 += local45;
							}
						}
						Static363.method3135(arg2, this.aByteArray50, arg1 >> 16, arg5 >> 16);
						arg5 += local24;
						arg1 += local1;
						arg2 += this.anInt3386;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local1;
					arg5 -= arg2 * local24;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg1 -= arg0 * local45;
					arg0 = 0;
				}
				if (local24 <= local1) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt3386;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static363.method3135(arg2, this.aByteArray50, arg1 >> 16, arg5 >> 16);
								arg5 += local24;
								arg1 += local45;
								arg2 += this.anInt3386;
							}
						}
						Static363.method3135(arg2, this.aByteArray50, arg4 >> 16, arg5 >> 16);
						arg2 += this.anInt3386;
						arg4 += local1;
						arg5 += local24;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt3386;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static363.method3135(arg2, this.aByteArray50, arg5 >> 16, arg1 >> 16);
								arg5 += local24;
								arg2 += this.anInt3386;
								arg1 += local45;
							}
						}
						Static363.method3135(arg2, this.aByteArray50, arg5 >> 16, arg4 >> 16);
						arg2 += this.anInt3386;
						arg5 += local24;
						arg4 += local1;
					}
				}
			}
		} else if (arg0 < arg2) {
			arg5 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local24;
				arg4 -= local45 * arg3;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg1 -= arg0 * local1;
				arg0 = 0;
			}
			if (local45 > local24) {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt3386;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static363.method3135(arg3, this.aByteArray50, arg1 >> 16, arg5 >> 16);
							arg1 += local1;
							arg3 += this.anInt3386;
							arg5 += local24;
						}
					}
					Static363.method3135(arg3, this.aByteArray50, arg4 >> 16, arg5 >> 16);
					arg4 += local45;
					arg5 += local24;
					arg3 += this.anInt3386;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt3386;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static363.method3135(arg3, this.aByteArray50, arg5 >> 16, arg1 >> 16);
							arg5 += local24;
							arg1 += local1;
							arg3 += this.anInt3386;
						}
					}
					Static363.method3135(arg3, this.aByteArray50, arg5 >> 16, arg4 >> 16);
					arg4 += local45;
					arg5 += local24;
					arg3 += this.anInt3386;
				}
			}
		} else {
			arg1 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local45 * arg3;
				arg1 -= arg3 * local24;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg5 -= arg2 * local1;
				arg2 = 0;
			}
			if (local24 >= local45) {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt3386 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static363.method3135(arg3, this.aByteArray50, arg5 >> 16, arg4 >> 16);
							arg3 += this.anInt3386;
							arg5 += local1;
							arg4 += local45;
						}
					}
					Static363.method3135(arg3, this.aByteArray50, arg1 >> 16, arg4 >> 16);
					arg4 += local45;
					arg3 += this.anInt3386;
					arg1 += local24;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt3386 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static363.method3135(arg3, this.aByteArray50, arg4 >> 16, arg5 >> 16);
							arg4 += local45;
							arg3 += this.anInt3386;
							arg5 += local1;
						}
					}
					Static363.method3135(arg3, this.aByteArray50, arg4 >> 16, arg1 >> 16);
					arg4 += local45;
					arg3 += this.anInt3386;
					arg1 += local24;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
	public void method3134() {
		@Pc(5) int local5 = -1;
		@Pc(11) int local11 = this.aByteArray50.length - 8;
		while (local5 < local11) {
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
			local5++;
			this.aByteArray50[local5] = 0;
		}
		while (local5 < this.aByteArray50.length - 1) {
			local5++;
			this.aByteArray50[local5] = 0;
		}
	}
}
