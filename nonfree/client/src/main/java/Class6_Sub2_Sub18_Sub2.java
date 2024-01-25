import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class6_Sub2_Sub18_Sub2 extends Class6_Sub2_Sub18 {

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
	public int anInt9711;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public int anInt9718;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
	public int anInt9720;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
	public int anInt9723;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "[B")
	public final byte[] aByteArray104;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!jj;II)V")
	public Class6_Sub2_Sub18_Sub2(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray104 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public void method8474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9723 = arg3 - arg2;
		this.anInt9711 = arg0 - arg1;
		this.anInt9720 = arg1;
		this.anInt9718 = arg2;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
	public boolean method8476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray104.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
	public void method8477() {
		@Pc(7) int local7 = -1;
		@Pc(24) int local24 = this.aByteArray104.length - 8;
		while (local24 > local7) {
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
			local7++;
			this.aByteArray104[local7] = 0;
		}
		while (local7 < this.aByteArray104.length - 1) {
			local7++;
			this.aByteArray104[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIBIII)V")
	public void method8478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg3) {
			local7 = (arg4 - arg2 << 16) / (arg3 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg3) {
			local28 = (arg1 - arg4 << 16) / (arg5 - arg3);
		}
		@Pc(44) int local44 = 0;
		if (arg0 != arg5) {
			local44 = (arg2 - arg1 << 16) / (arg0 - arg5);
		}
		if (arg3 >= arg0 && arg0 <= arg5) {
			if (arg5 <= arg3) {
				arg4 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg4 -= arg0 * local44;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local28;
					arg5 = 0;
				}
				if (arg0 != arg5 && local7 > local44 || arg0 == arg5 && local28 > local7) {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt9723 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static525.method7533(arg2 >> 16, this.aByteArray104, arg0, arg1 >> 16);
								arg2 += local7;
								arg0 += this.anInt9723;
								arg1 += local28;
							}
						}
						Static525.method7533(arg2 >> 16, this.aByteArray104, arg0, arg4 >> 16);
						arg0 += this.anInt9723;
						arg2 += local7;
						arg4 += local44;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt9723;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static525.method7533(arg1 >> 16, this.aByteArray104, arg0, arg2 >> 16);
								arg2 += local7;
								arg1 += local28;
								arg0 += this.anInt9723;
							}
						}
						Static525.method7533(arg4 >> 16, this.aByteArray104, arg0, arg2 >> 16);
						arg4 += local44;
						arg0 += this.anInt9723;
						arg2 += local7;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local7;
					arg1 -= local44 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local28;
					arg3 = 0;
				}
				if ((arg3 == arg0 || local7 <= local44) && (arg0 != arg3 || local28 >= local44)) {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt9723;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static525.method7533(arg1 >> 16, this.aByteArray104, arg0, arg4 >> 16);
								arg0 += this.anInt9723;
								arg1 += local44;
								arg4 += local28;
							}
						}
						Static525.method7533(arg1 >> 16, this.aByteArray104, arg0, arg2 >> 16);
						arg2 += local7;
						arg1 += local44;
						arg0 += this.anInt9723;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt9723 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static525.method7533(arg4 >> 16, this.aByteArray104, arg0, arg1 >> 16);
								arg4 += local28;
								arg1 += local44;
								arg0 += this.anInt9723;
							}
						}
						Static525.method7533(arg2 >> 16, this.aByteArray104, arg0, arg1 >> 16);
						arg0 += this.anInt9723;
						arg1 += local44;
						arg2 += local7;
					}
				}
			}
		} else if (arg5 < arg3) {
			if (arg3 > arg0) {
				arg4 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local44;
					arg4 -= arg5 * local28;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg2 -= arg0 * local7;
					arg0 = 0;
				}
				if (local28 >= local44) {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt9723 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static525.method7533(arg4 >> 16, this.aByteArray104, arg5, arg2 >> 16);
								arg2 += local7;
								arg5 += this.anInt9723;
								arg4 += local28;
							}
						}
						Static525.method7533(arg4 >> 16, this.aByteArray104, arg5, arg1 >> 16);
						arg1 += local44;
						arg4 += local28;
						arg5 += this.anInt9723;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt9723;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static525.method7533(arg2 >> 16, this.aByteArray104, arg5, arg4 >> 16);
								arg2 += local7;
								arg4 += local28;
								arg5 += this.anInt9723;
							}
						}
						Static525.method7533(arg1 >> 16, this.aByteArray104, arg5, arg4 >> 16);
						arg5 += this.anInt9723;
						arg1 += local44;
						arg4 += local28;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local44 * arg5;
					arg2 -= arg5 * local28;
					arg5 = 0;
				}
				if (arg3 < 0) {
					arg4 -= arg3 * local7;
					arg3 = 0;
				}
				if (local28 >= local44) {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt9723 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static525.method7533(arg4 >> 16, this.aByteArray104, arg5, arg1 >> 16);
								arg5 += this.anInt9723;
								arg4 += local7;
								arg1 += local44;
							}
						}
						Static525.method7533(arg2 >> 16, this.aByteArray104, arg5, arg1 >> 16);
						arg1 += local44;
						arg5 += this.anInt9723;
						arg2 += local28;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt9723;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static525.method7533(arg1 >> 16, this.aByteArray104, arg5, arg4 >> 16);
								arg5 += this.anInt9723;
								arg4 += local7;
								arg1 += local44;
							}
						}
						Static525.method7533(arg1 >> 16, this.aByteArray104, arg5, arg2 >> 16);
						arg2 += local28;
						arg1 += local44;
						arg5 += this.anInt9723;
					}
				}
			}
		} else if (arg0 <= arg5) {
			arg1 = arg4 <<= 0x10;
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local7 * arg3;
				arg4 -= arg3 * local28;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg2 -= local44 * arg0;
				arg0 = 0;
			}
			if (local28 <= local7) {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt9723;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static525.method7533(arg2 >> 16, this.aByteArray104, arg3, arg4 >> 16);
							arg2 += local44;
							arg3 += this.anInt9723;
							arg4 += local28;
						}
					}
					Static525.method7533(arg1 >> 16, this.aByteArray104, arg3, arg4 >> 16);
					arg4 += local28;
					arg3 += this.anInt9723;
					arg1 += local7;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt9723;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static525.method7533(arg4 >> 16, this.aByteArray104, arg3, arg2 >> 16);
							arg2 += local44;
							arg4 += local28;
							arg3 += this.anInt9723;
						}
					}
					Static525.method7533(arg4 >> 16, this.aByteArray104, arg3, arg1 >> 16);
					arg4 += local28;
					arg3 += this.anInt9723;
					arg1 += local7;
				}
			}
		} else {
			arg2 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local7 * arg3;
				arg4 -= local28 * arg3;
				arg3 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local44 * arg5;
				arg5 = 0;
			}
			if (arg5 != arg3 && local7 < local28 || arg3 == arg5 && local44 < local7) {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt9723;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static525.method7533(arg1 >> 16, this.aByteArray104, arg3, arg2 >> 16);
							arg1 += local44;
							arg2 += local7;
							arg3 += this.anInt9723;
						}
					}
					Static525.method7533(arg4 >> 16, this.aByteArray104, arg3, arg2 >> 16);
					arg4 += local28;
					arg2 += local7;
					arg3 += this.anInt9723;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt9723 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static525.method7533(arg2 >> 16, this.aByteArray104, arg3, arg1 >> 16);
							arg3 += this.anInt9723;
							arg2 += local7;
							arg1 += local44;
						}
					}
					Static525.method7533(arg2 >> 16, this.aByteArray104, arg3, arg4 >> 16);
					arg4 += local28;
					arg3 += this.anInt9723;
					arg2 += local7;
				}
			}
		}
	}
}
