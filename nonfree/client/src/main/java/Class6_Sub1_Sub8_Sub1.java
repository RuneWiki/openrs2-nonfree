import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class6_Sub1_Sub8_Sub1 extends Class6_Sub1_Sub8 {

	@OriginalMember(owner = "client!un", name = "x", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public int anInt6836;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	public int anInt6839;

	@OriginalMember(owner = "client!un", name = "G", descriptor = "I")
	public int anInt6840;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!bl;II)V")
	public Class6_Sub1_Sub8_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray87 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
	public void method5581() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray87.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
			local11++;
			this.aByteArray87[local11] = 0;
		}
		while (local11 < this.aByteArray87.length - 1) {
			local11++;
			this.aByteArray87[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z")
	public boolean method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray87.length;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIBIII)V")
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg3) {
			local7 = (arg5 - arg1 << 16) / (arg3 - arg4);
		}
		@Pc(31) int local31 = 0;
		if (arg3 != arg2) {
			local31 = (arg0 - arg5 << 16) / (arg2 - arg3);
		}
		@Pc(52) int local52 = 0;
		if (arg4 != arg2) {
			local52 = (arg1 - arg0 << 16) / (arg4 - arg2);
		}
		if (arg3 >= arg4 && arg2 >= arg4) {
			if (arg2 <= arg3) {
				arg5 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local7;
					arg5 -= arg4 * local52;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local31;
					arg2 = 0;
				}
				if (arg2 != arg4 && local7 > local52 || arg4 == arg2 && local31 > local7) {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt6836 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static381.method5248(arg0 >> 16, arg4, this.aByteArray87, arg1 >> 16);
								arg1 += local7;
								arg0 += local31;
								arg4 += this.anInt6836;
							}
						}
						Static381.method5248(arg5 >> 16, arg4, this.aByteArray87, arg1 >> 16);
						arg5 += local52;
						arg1 += local7;
						arg4 += this.anInt6836;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt6836;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static381.method5248(arg1 >> 16, arg4, this.aByteArray87, arg0 >> 16);
								arg1 += local7;
								arg4 += this.anInt6836;
								arg0 += local31;
							}
						}
						Static381.method5248(arg1 >> 16, arg4, this.aByteArray87, arg5 >> 16);
						arg1 += local7;
						arg5 += local52;
						arg4 += this.anInt6836;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local7 * arg4;
					arg0 -= local52 * arg4;
					arg4 = 0;
				}
				if (arg3 < 0) {
					arg5 -= arg3 * local31;
					arg3 = 0;
				}
				if ((arg4 == arg3 || local52 >= local7) && (arg3 != arg4 || local52 <= local31)) {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt6836;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static381.method5248(arg5 >> 16, arg4, this.aByteArray87, arg0 >> 16);
								arg4 += this.anInt6836;
								arg5 += local31;
								arg0 += local52;
							}
						}
						Static381.method5248(arg1 >> 16, arg4, this.aByteArray87, arg0 >> 16);
						arg0 += local52;
						arg1 += local7;
						arg4 += this.anInt6836;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt6836 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static381.method5248(arg0 >> 16, arg4, this.aByteArray87, arg5 >> 16);
								arg0 += local52;
								arg5 += local31;
								arg4 += this.anInt6836;
							}
						}
						Static381.method5248(arg0 >> 16, arg4, this.aByteArray87, arg1 >> 16);
						arg4 += this.anInt6836;
						arg1 += local7;
						arg0 += local52;
					}
				}
			}
		} else if (arg3 <= arg2) {
			if (arg2 >= arg4) {
				arg0 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= local7 * arg3;
					arg5 -= local31 * arg3;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local52;
					arg4 = 0;
				}
				if (local31 <= local7) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt6836 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static381.method5248(arg5 >> 16, arg3, this.aByteArray87, arg1 >> 16);
								arg5 += local31;
								arg3 += this.anInt6836;
								arg1 += local52;
							}
						}
						Static381.method5248(arg5 >> 16, arg3, this.aByteArray87, arg0 >> 16);
						arg0 += local7;
						arg5 += local31;
						arg3 += this.anInt6836;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt6836;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static381.method5248(arg1 >> 16, arg3, this.aByteArray87, arg5 >> 16);
								arg5 += local31;
								arg3 += this.anInt6836;
								arg1 += local52;
							}
						}
						Static381.method5248(arg0 >> 16, arg3, this.aByteArray87, arg5 >> 16);
						arg0 += local7;
						arg5 += local31;
						arg3 += this.anInt6836;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local31;
					arg1 -= local7 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local52;
					arg2 = 0;
				}
				if ((arg2 == arg3 || local31 <= local7) && (arg2 != arg3 || local7 <= local52)) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6836;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static381.method5248(arg0 >> 16, arg3, this.aByteArray87, arg1 >> 16);
								arg0 += local52;
								arg3 += this.anInt6836;
								arg1 += local7;
							}
						}
						Static381.method5248(arg5 >> 16, arg3, this.aByteArray87, arg1 >> 16);
						arg3 += this.anInt6836;
						arg5 += local31;
						arg1 += local7;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6836;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static381.method5248(arg1 >> 16, arg3, this.aByteArray87, arg0 >> 16);
								arg0 += local52;
								arg1 += local7;
								arg3 += this.anInt6836;
							}
						}
						Static381.method5248(arg1 >> 16, arg3, this.aByteArray87, arg5 >> 16);
						arg3 += this.anInt6836;
						arg5 += local31;
						arg1 += local7;
					}
				}
			}
		} else if (arg3 > arg4) {
			arg5 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local52;
				arg5 -= arg2 * local31;
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg1 -= local7 * arg4;
				arg4 = 0;
			}
			if (local52 > local31) {
				arg3 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt6836 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static381.method5248(arg5 >> 16, arg2, this.aByteArray87, arg1 >> 16);
							arg2 += this.anInt6836;
							arg5 += local31;
							arg1 += local7;
						}
					}
					Static381.method5248(arg5 >> 16, arg2, this.aByteArray87, arg0 >> 16);
					arg5 += local31;
					arg0 += local52;
					arg2 += this.anInt6836;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt6836 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static381.method5248(arg1 >> 16, arg2, this.aByteArray87, arg5 >> 16);
							arg5 += local31;
							arg2 += this.anInt6836;
							arg1 += local7;
						}
					}
					Static381.method5248(arg0 >> 16, arg2, this.aByteArray87, arg5 >> 16);
					arg2 += this.anInt6836;
					arg0 += local52;
					arg5 += local31;
				}
			}
		} else {
			arg1 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local31;
				arg0 -= arg2 * local52;
				arg2 = 0;
			}
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local7 * arg3;
				arg3 = 0;
			}
			if (local52 <= local31) {
				arg4 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt6836 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static381.method5248(arg0 >> 16, arg2, this.aByteArray87, arg5 >> 16);
							arg5 += local7;
							arg2 += this.anInt6836;
							arg0 += local52;
						}
					}
					Static381.method5248(arg0 >> 16, arg2, this.aByteArray87, arg1 >> 16);
					arg2 += this.anInt6836;
					arg0 += local52;
					arg1 += local31;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt6836;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static381.method5248(arg5 >> 16, arg2, this.aByteArray87, arg0 >> 16);
							arg5 += local7;
							arg0 += local52;
							arg2 += this.anInt6836;
						}
					}
					Static381.method5248(arg1 >> 16, arg2, this.aByteArray87, arg0 >> 16);
					arg0 += local52;
					arg2 += this.anInt6836;
					arg1 += local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
	public void method5585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6832 = arg3;
		this.anInt6839 = arg0 - arg3;
		this.anInt6836 = arg2 - arg1;
		this.anInt6840 = arg1;
	}
}
