import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class5_Sub4_Sub10_Sub2 extends Class5_Sub4_Sub10 {

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!hv", name = "J", descriptor = "I")
	public int anInt3813;

	@OriginalMember(owner = "client!hv", name = "R", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!hv", name = "T", descriptor = "I")
	public int anInt3820;

	@OriginalMember(owner = "client!hv", name = "M", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!rv;II)V")
	public Class5_Sub4_Sub10_Sub2(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray33 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
	public boolean method3410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray33.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIII)V")
	public void method3415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg4) {
			local7 = (arg1 - arg0 << 16) / (arg2 - arg4);
		}
		@Pc(30) int local30 = 0;
		if (arg2 != arg3) {
			local30 = (arg5 - arg1 << 16) / (arg3 - arg2);
		}
		@Pc(51) int local51 = 0;
		if (arg3 != arg4) {
			local51 = (arg0 - arg5 << 16) / (arg4 - arg3);
		}
		if (arg4 <= arg2 && arg3 >= arg4) {
			if (arg2 >= arg3) {
				arg1 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local7 * arg4;
					arg1 -= arg4 * local51;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local30 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg4 && local7 > local51 || arg4 == arg3 && local7 < local30) {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt3813 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg0 >> 16, arg4, arg5 >> 16);
								arg4 += this.anInt3813;
								arg0 += local7;
								arg5 += local30;
							}
						}
						Static296.method4343(this.aByteArray33, arg0 >> 16, arg4, arg1 >> 16);
						arg1 += local51;
						arg4 += this.anInt3813;
						arg0 += local7;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt3813;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg5 >> 16, arg4, arg0 >> 16);
								arg4 += this.anInt3813;
								arg5 += local30;
								arg0 += local7;
							}
						}
						Static296.method4343(this.aByteArray33, arg1 >> 16, arg4, arg0 >> 16);
						arg0 += local7;
						arg4 += this.anInt3813;
						arg1 += local51;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local7 * arg4;
					arg5 -= arg4 * local51;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg1 -= local30 * arg2;
					arg2 = 0;
				}
				if ((arg4 == arg2 || local51 >= local7) && (arg2 != arg4 || local51 <= local30)) {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt3813 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg5 >> 16, arg4, arg1 >> 16);
								arg5 += local51;
								arg1 += local30;
								arg4 += this.anInt3813;
							}
						}
						Static296.method4343(this.aByteArray33, arg5 >> 16, arg4, arg0 >> 16);
						arg5 += local51;
						arg0 += local7;
						arg4 += this.anInt3813;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt3813 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg1 >> 16, arg4, arg5 >> 16);
								arg4 += this.anInt3813;
								arg1 += local30;
								arg5 += local51;
							}
						}
						Static296.method4343(this.aByteArray33, arg0 >> 16, arg4, arg5 >> 16);
						arg5 += local51;
						arg0 += local7;
						arg4 += this.anInt3813;
					}
				}
			}
		} else if (arg3 >= arg2) {
			if (arg4 > arg3) {
				arg0 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local30 * arg2;
					arg0 -= local7 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local51;
					arg3 = 0;
				}
				if (arg2 != arg3 && local7 < local30 || arg2 == arg3 && local7 > local51) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3813;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg5 >> 16, arg2, arg0 >> 16);
								arg2 += this.anInt3813;
								arg0 += local7;
								arg5 += local51;
							}
						}
						Static296.method4343(this.aByteArray33, arg1 >> 16, arg2, arg0 >> 16);
						arg2 += this.anInt3813;
						arg1 += local30;
						arg0 += local7;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt3813 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg0 >> 16, arg2, arg5 >> 16);
								arg5 += local51;
								arg0 += local7;
								arg2 += this.anInt3813;
							}
						}
						Static296.method4343(this.aByteArray33, arg0 >> 16, arg2, arg1 >> 16);
						arg1 += local30;
						arg2 += this.anInt3813;
						arg0 += local7;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local7 * arg2;
					arg1 -= arg2 * local30;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg0 -= local51 * arg4;
					arg4 = 0;
				}
				if (local30 > local7) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt3813 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg1 >> 16, arg2, arg0 >> 16);
								arg2 += this.anInt3813;
								arg0 += local51;
								arg1 += local30;
							}
						}
						Static296.method4343(this.aByteArray33, arg1 >> 16, arg2, arg5 >> 16);
						arg5 += local7;
						arg1 += local30;
						arg2 += this.anInt3813;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt3813 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static296.method4343(this.aByteArray33, arg0 >> 16, arg2, arg1 >> 16);
								arg0 += local51;
								arg2 += this.anInt3813;
								arg1 += local30;
							}
						}
						Static296.method4343(this.aByteArray33, arg5 >> 16, arg2, arg1 >> 16);
						arg2 += this.anInt3813;
						arg1 += local30;
						arg5 += local7;
					}
				}
			}
		} else if (arg2 <= arg4) {
			arg0 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= arg3 * local30;
				arg5 -= arg3 * local51;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg1 -= local7 * arg2;
				arg2 = 0;
			}
			if (local51 > local30) {
				arg4 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt3813;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static296.method4343(this.aByteArray33, arg5 >> 16, arg3, arg1 >> 16);
							arg3 += this.anInt3813;
							arg1 += local7;
							arg5 += local51;
						}
					}
					Static296.method4343(this.aByteArray33, arg5 >> 16, arg3, arg0 >> 16);
					arg3 += this.anInt3813;
					arg5 += local51;
					arg0 += local30;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt3813 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static296.method4343(this.aByteArray33, arg1 >> 16, arg3, arg5 >> 16);
							arg5 += local51;
							arg3 += this.anInt3813;
							arg1 += local7;
						}
					}
					Static296.method4343(this.aByteArray33, arg0 >> 16, arg3, arg5 >> 16);
					arg0 += local30;
					arg3 += this.anInt3813;
					arg5 += local51;
				}
			}
		} else {
			arg1 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local51;
				arg1 -= local30 * arg3;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local7;
				arg4 = 0;
			}
			if (local51 > local30) {
				arg2 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt3813;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static296.method4343(this.aByteArray33, arg0 >> 16, arg3, arg1 >> 16);
							arg1 += local30;
							arg0 += local7;
							arg3 += this.anInt3813;
						}
					}
					Static296.method4343(this.aByteArray33, arg5 >> 16, arg3, arg1 >> 16);
					arg1 += local30;
					arg3 += this.anInt3813;
					arg5 += local51;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt3813;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static296.method4343(this.aByteArray33, arg1 >> 16, arg3, arg0 >> 16);
							arg3 += this.anInt3813;
							arg0 += local7;
							arg1 += local30;
						}
					}
					Static296.method4343(this.aByteArray33, arg1 >> 16, arg3, arg5 >> 16);
					arg1 += local30;
					arg5 += local51;
					arg3 += this.anInt3813;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
	public void method3416() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray33.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
			local11++;
			this.aByteArray33[local11] = 0;
		}
		while (this.aByteArray33.length - 1 > local11) {
			local11++;
			this.aByteArray33[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3820 = arg3;
		this.anInt3809 = arg0 - arg1;
		this.anInt3819 = arg1;
		this.anInt3813 = arg2 - arg3;
	}
}
