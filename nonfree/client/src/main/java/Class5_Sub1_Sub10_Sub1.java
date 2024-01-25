import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class5_Sub1_Sub10_Sub1 extends Class5_Sub1_Sub10 {

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	public int anInt2814;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	public int anInt2815;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "[B")
	public final byte[] aByteArray36;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!mm;II)V")
	public Class5_Sub1_Sub10_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray36 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public void method2606() {
		@Pc(9) int local9 = -1;
		@Pc(15) int local15 = this.aByteArray36.length - 8;
		while (local15 > local9) {
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
			local9++;
			this.aByteArray36[local9] = 0;
		}
		while (this.aByteArray36.length - 1 > local9) {
			local9++;
			this.aByteArray36[local9] = 0;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZIIIII)V")
	public void method2607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg4) {
			local1 = (arg2 - arg0 << 16) / (arg4 - arg1);
		}
		@Pc(17) int local17 = 0;
		if (arg5 != arg4) {
			local17 = (arg3 - arg2 << 16) / (arg5 - arg4);
		}
		@Pc(48) int local48 = 0;
		if (arg1 != arg5) {
			local48 = (arg0 - arg3 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg4 && arg1 <= arg5) {
			if (arg5 > arg4) {
				arg3 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local48;
					arg0 -= local1 * arg1;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local17;
					arg4 = 0;
				}
				if (arg1 != arg4 && local48 < local1 || arg4 == arg1 && local48 > local17) {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt2815 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static362.method2605(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray36);
								arg3 += local48;
								arg2 += local17;
								arg1 += this.anInt2815;
							}
						}
						Static362.method2605(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray36);
						arg3 += local48;
						arg0 += local1;
						arg1 += this.anInt2815;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt2815;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static362.method2605(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray36);
								arg1 += this.anInt2815;
								arg3 += local48;
								arg2 += local17;
							}
						}
						Static362.method2605(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray36);
						arg1 += this.anInt2815;
						arg3 += local48;
						arg0 += local1;
					}
				}
			} else {
				arg2 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local48;
					arg0 -= local1 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local17 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg1 && local1 > local48 || arg5 == arg1 && local1 < local17) {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt2815;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static362.method2605(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray36);
								arg1 += this.anInt2815;
								arg0 += local1;
								arg3 += local17;
							}
						}
						Static362.method2605(arg2 >> 16, arg1, arg0 >> 16, this.aByteArray36);
						arg1 += this.anInt2815;
						arg0 += local1;
						arg2 += local48;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt2815;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static362.method2605(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray36);
								arg3 += local17;
								arg1 += this.anInt2815;
								arg0 += local1;
							}
						}
						Static362.method2605(arg0 >> 16, arg1, arg2 >> 16, this.aByteArray36);
						arg2 += local48;
						arg0 += local1;
						arg1 += this.anInt2815;
					}
				}
			}
		} else if (arg4 > arg5) {
			if (arg1 >= arg4) {
				arg0 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local48 * arg5;
					arg0 -= local17 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local1 * arg4;
					arg4 = 0;
				}
				if (local48 <= local17) {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt2815;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static362.method2605(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray36);
								arg3 += local48;
								arg2 += local1;
								arg5 += this.anInt2815;
							}
						}
						Static362.method2605(arg3 >> 16, arg5, arg0 >> 16, this.aByteArray36);
						arg3 += local48;
						arg5 += this.anInt2815;
						arg0 += local17;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt2815;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static362.method2605(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray36);
								arg3 += local48;
								arg2 += local1;
								arg5 += this.anInt2815;
							}
						}
						Static362.method2605(arg0 >> 16, arg5, arg3 >> 16, this.aByteArray36);
						arg5 += this.anInt2815;
						arg0 += local17;
						arg3 += local48;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local17 * arg5;
					arg3 -= local48 * arg5;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local1 * arg1;
					arg1 = 0;
				}
				if (local17 < local48) {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt2815 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static362.method2605(arg2 >> 16, arg5, arg0 >> 16, this.aByteArray36);
								arg2 += local17;
								arg5 += this.anInt2815;
								arg0 += local1;
							}
						}
						Static362.method2605(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray36);
						arg3 += local48;
						arg2 += local17;
						arg5 += this.anInt2815;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt2815;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static362.method2605(arg0 >> 16, arg5, arg2 >> 16, this.aByteArray36);
								arg5 += this.anInt2815;
								arg0 += local1;
								arg2 += local17;
							}
						}
						Static362.method2605(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray36);
						arg5 += this.anInt2815;
						arg2 += local17;
						arg3 += local48;
					}
				}
			}
		} else if (arg5 >= arg1) {
			arg3 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= local1 * arg4;
				arg2 -= arg4 * local17;
				arg4 = 0;
			}
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= local48 * arg1;
				arg1 = 0;
			}
			if (local1 >= local17) {
				arg5 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt2815 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static362.method2605(arg2 >> 16, arg4, arg0 >> 16, this.aByteArray36);
							arg2 += local17;
							arg0 += local48;
							arg4 += this.anInt2815;
						}
					}
					Static362.method2605(arg2 >> 16, arg4, arg3 >> 16, this.aByteArray36);
					arg2 += local17;
					arg3 += local1;
					arg4 += this.anInt2815;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt2815;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static362.method2605(arg0 >> 16, arg4, arg2 >> 16, this.aByteArray36);
							arg2 += local17;
							arg4 += this.anInt2815;
							arg0 += local48;
						}
					}
					Static362.method2605(arg3 >> 16, arg4, arg2 >> 16, this.aByteArray36);
					arg4 += this.anInt2815;
					arg3 += local1;
					arg2 += local17;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local1 * arg4;
				arg2 -= arg4 * local17;
				arg4 = 0;
			}
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= arg5 * local48;
				arg5 = 0;
			}
			if (arg4 != arg5 && local1 < local17 || arg4 == arg5 && local1 > local48) {
				arg1 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt2815;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static362.method2605(arg0 >> 16, arg4, arg3 >> 16, this.aByteArray36);
							arg0 += local1;
							arg4 += this.anInt2815;
							arg3 += local48;
						}
					}
					Static362.method2605(arg0 >> 16, arg4, arg2 >> 16, this.aByteArray36);
					arg2 += local17;
					arg4 += this.anInt2815;
					arg0 += local1;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt2815;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static362.method2605(arg3 >> 16, arg4, arg0 >> 16, this.aByteArray36);
							arg3 += local48;
							arg0 += local1;
							arg4 += this.anInt2815;
						}
					}
					Static362.method2605(arg2 >> 16, arg4, arg0 >> 16, this.aByteArray36);
					arg2 += local17;
					arg0 += local1;
					arg4 += this.anInt2815;
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z")
	public boolean method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray36.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBII)V")
	public void method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2815 = arg1 - arg3;
		this.anInt2817 = arg0 - arg2;
		this.anInt2816 = arg3;
		this.anInt2814 = arg2;
	}
}
