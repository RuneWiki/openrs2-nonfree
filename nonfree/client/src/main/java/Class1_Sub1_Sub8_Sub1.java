import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub1_Sub8_Sub1 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	public int anInt3611;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public int anInt3612;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	public int anInt3613;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public int anInt3614;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!hj;II)V")
	public Class1_Sub1_Sub8_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray59 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
	public void method3438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3613 = arg3;
		this.anInt3611 = arg2 - arg0;
		this.anInt3614 = arg1 - arg3;
		this.anInt3612 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public void method3440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = 0;
		if (arg3 != arg5) {
			local9 = (arg1 - arg0 << 16) / (arg3 - arg5);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg4) {
			local27 = (arg2 - arg1 << 16) / (arg4 - arg3);
		}
		@Pc(44) int local44 = 0;
		if (arg4 != arg5) {
			local44 = (arg0 - arg2 << 16) / (arg5 - arg4);
		}
		if (arg5 <= arg3 && arg4 >= arg5) {
			if (arg4 <= arg3) {
				arg1 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local9 * arg5;
					arg1 -= local44 * arg5;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local27;
					arg4 = 0;
				}
				if (arg4 != arg5 && local9 > local44 || arg5 == arg4 && local27 > local9) {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt3611;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg0 >> 16, arg2 >> 16, arg5);
								arg2 += local27;
								arg0 += local9;
								arg5 += this.anInt3611;
							}
						}
						Static362.method3439(this.aByteArray59, arg0 >> 16, arg1 >> 16, arg5);
						arg5 += this.anInt3611;
						arg0 += local9;
						arg1 += local44;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt3611 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg2 >> 16, arg0 >> 16, arg5);
								arg0 += local9;
								arg5 += this.anInt3611;
								arg2 += local27;
							}
						}
						Static362.method3439(this.aByteArray59, arg1 >> 16, arg0 >> 16, arg5);
						arg5 += this.anInt3611;
						arg0 += local9;
						arg1 += local44;
					}
				}
			} else {
				arg2 = arg0 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local44 * arg5;
					arg0 -= arg5 * local9;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local27;
					arg3 = 0;
				}
				if (arg5 != arg3 && local9 > local44 || arg5 == arg3 && local27 < local44) {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt3611;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg1 >> 16, arg2 >> 16, arg5);
								arg2 += local44;
								arg1 += local27;
								arg5 += this.anInt3611;
							}
						}
						Static362.method3439(this.aByteArray59, arg0 >> 16, arg2 >> 16, arg5);
						arg2 += local44;
						arg0 += local9;
						arg5 += this.anInt3611;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt3611 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg2 >> 16, arg1 >> 16, arg5);
								arg2 += local44;
								arg5 += this.anInt3611;
								arg1 += local27;
							}
						}
						Static362.method3439(this.aByteArray59, arg2 >> 16, arg0 >> 16, arg5);
						arg2 += local44;
						arg0 += local9;
						arg5 += this.anInt3611;
					}
				}
			}
		} else if (arg3 > arg4) {
			if (arg5 < arg3) {
				arg1 = arg2 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local27;
					arg2 -= local44 * arg4;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg0 -= local9 * arg5;
					arg5 = 0;
				}
				if (local27 < local44) {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt3611 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg0 >> 16, arg1 >> 16, arg4);
								arg4 += this.anInt3611;
								arg1 += local27;
								arg0 += local9;
							}
						}
						Static362.method3439(this.aByteArray59, arg2 >> 16, arg1 >> 16, arg4);
						arg1 += local27;
						arg2 += local44;
						arg4 += this.anInt3611;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt3611 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg1 >> 16, arg0 >> 16, arg4);
								arg4 += this.anInt3611;
								arg1 += local27;
								arg0 += local9;
							}
						}
						Static362.method3439(this.aByteArray59, arg1 >> 16, arg2 >> 16, arg4);
						arg2 += local44;
						arg1 += local27;
						arg4 += this.anInt3611;
					}
				}
			} else {
				arg0 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local27;
					arg2 -= arg4 * local44;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local9 * arg3;
					arg3 = 0;
				}
				if (local44 <= local27) {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt3611;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg1 >> 16, arg2 >> 16, arg4);
								arg4 += this.anInt3611;
								arg2 += local44;
								arg1 += local9;
							}
						}
						Static362.method3439(this.aByteArray59, arg0 >> 16, arg2 >> 16, arg4);
						arg4 += this.anInt3611;
						arg2 += local44;
						arg0 += local27;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt3611;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static362.method3439(this.aByteArray59, arg2 >> 16, arg1 >> 16, arg4);
								arg2 += local44;
								arg4 += this.anInt3611;
								arg1 += local9;
							}
						}
						Static362.method3439(this.aByteArray59, arg2 >> 16, arg0 >> 16, arg4);
						arg2 += local44;
						arg4 += this.anInt3611;
						arg0 += local27;
					}
				}
			}
		} else if (arg5 <= arg4) {
			arg2 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= arg3 * local27;
				arg2 -= local9 * arg3;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local44;
				arg5 = 0;
			}
			if (local9 < local27) {
				arg4 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt3611;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static362.method3439(this.aByteArray59, arg1 >> 16, arg0 >> 16, arg3);
							arg3 += this.anInt3611;
							arg0 += local44;
							arg1 += local27;
						}
					}
					Static362.method3439(this.aByteArray59, arg1 >> 16, arg2 >> 16, arg3);
					arg1 += local27;
					arg3 += this.anInt3611;
					arg2 += local9;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt3611 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static362.method3439(this.aByteArray59, arg0 >> 16, arg1 >> 16, arg3);
							arg3 += this.anInt3611;
							arg1 += local27;
							arg0 += local44;
						}
					}
					Static362.method3439(this.aByteArray59, arg2 >> 16, arg1 >> 16, arg3);
					arg2 += local9;
					arg1 += local27;
					arg3 += this.anInt3611;
				}
			}
		} else {
			arg0 = arg1 <<= 0x10;
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local27 * arg3;
				arg0 -= local9 * arg3;
				arg3 = 0;
			}
			if (arg4 < 0) {
				arg2 -= arg4 * local44;
				arg4 = 0;
			}
			if (arg4 != arg3 && local9 < local27 || arg3 == arg4 && local44 < local9) {
				arg5 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt3611;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static362.method3439(this.aByteArray59, arg2 >> 16, arg0 >> 16, arg3);
							arg3 += this.anInt3611;
							arg0 += local9;
							arg2 += local44;
						}
					}
					Static362.method3439(this.aByteArray59, arg1 >> 16, arg0 >> 16, arg3);
					arg3 += this.anInt3611;
					arg1 += local27;
					arg0 += local9;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt3611 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static362.method3439(this.aByteArray59, arg0 >> 16, arg2 >> 16, arg3);
							arg0 += local9;
							arg2 += local44;
							arg3 += this.anInt3611;
						}
					}
					Static362.method3439(this.aByteArray59, arg0 >> 16, arg1 >> 16, arg3);
					arg1 += local27;
					arg3 += this.anInt3611;
					arg0 += local9;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	public boolean method3441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray59.length;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public void method3442() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray59.length - 8;
		while (local7 > local1) {
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
			local1++;
			this.aByteArray59[local1] = 0;
		}
		while (this.aByteArray59.length - 1 > local1) {
			local1++;
			this.aByteArray59[local1] = 0;
		}
	}
}
