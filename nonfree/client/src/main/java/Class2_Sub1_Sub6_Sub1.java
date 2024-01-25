import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub1_Sub6_Sub1 extends Class2_Sub1_Sub6 {

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	public int anInt2648;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
	public int anInt2650;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!qi;II)V")
	public Class2_Sub1_Sub6_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray45 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	public boolean method2490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray45.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V")
	public void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2648 = arg2 - arg1;
		this.anInt2649 = arg0 - arg3;
		this.anInt2651 = arg3;
		this.anInt2650 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
	public void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 != arg5) {
			local1 = (arg2 - arg1 << 16) / (arg4 - arg5);
		}
		@Pc(31) int local31 = 0;
		if (arg4 != arg3) {
			local31 = (arg0 - arg2 << 16) / (arg3 - arg4);
		}
		@Pc(49) int local49 = 0;
		if (arg3 != arg5) {
			local49 = (arg1 - arg0 << 16) / (arg5 - arg3);
		}
		if (arg4 >= arg5 && arg5 <= arg3) {
			if (arg4 < arg3) {
				arg0 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local49;
					arg1 -= local1 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local31 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg5 && local49 < local1 || arg5 == arg4 && local49 > local31) {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt2649;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static395.method2489(arg2 >> 16, arg0 >> 16, arg5, this.aByteArray45);
								arg2 += local31;
								arg0 += local49;
								arg5 += this.anInt2649;
							}
						}
						Static395.method2489(arg1 >> 16, arg0 >> 16, arg5, this.aByteArray45);
						arg0 += local49;
						arg5 += this.anInt2649;
						arg1 += local1;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt2649;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static395.method2489(arg0 >> 16, arg2 >> 16, arg5, this.aByteArray45);
								arg0 += local49;
								arg5 += this.anInt2649;
								arg2 += local31;
							}
						}
						Static395.method2489(arg0 >> 16, arg1 >> 16, arg5, this.aByteArray45);
						arg1 += local1;
						arg5 += this.anInt2649;
						arg0 += local49;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local1;
					arg2 -= local49 * arg5;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local31;
					arg3 = 0;
				}
				if (arg5 != arg3 && local49 < local1 || arg5 == arg3 && local1 < local31) {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2649 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static395.method2489(arg1 >> 16, arg0 >> 16, arg5, this.aByteArray45);
								arg1 += local1;
								arg5 += this.anInt2649;
								arg0 += local31;
							}
						}
						Static395.method2489(arg1 >> 16, arg2 >> 16, arg5, this.aByteArray45);
						arg5 += this.anInt2649;
						arg2 += local49;
						arg1 += local1;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt2649;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static395.method2489(arg0 >> 16, arg1 >> 16, arg5, this.aByteArray45);
								arg0 += local31;
								arg1 += local1;
								arg5 += this.anInt2649;
							}
						}
						Static395.method2489(arg2 >> 16, arg1 >> 16, arg5, this.aByteArray45);
						arg5 += this.anInt2649;
						arg1 += local1;
						arg2 += local49;
					}
				}
			}
		} else if (arg4 > arg3) {
			if (arg4 > arg5) {
				arg2 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local49;
					arg2 -= local31 * arg3;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local1 * arg5;
					arg5 = 0;
				}
				if (local31 < local49) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt2649;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static395.method2489(arg1 >> 16, arg2 >> 16, arg3, this.aByteArray45);
								arg3 += this.anInt2649;
								arg2 += local31;
								arg1 += local1;
							}
						}
						Static395.method2489(arg0 >> 16, arg2 >> 16, arg3, this.aByteArray45);
						arg3 += this.anInt2649;
						arg2 += local31;
						arg0 += local49;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt2649 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static395.method2489(arg2 >> 16, arg1 >> 16, arg3, this.aByteArray45);
								arg1 += local1;
								arg2 += local31;
								arg3 += this.anInt2649;
							}
						}
						Static395.method2489(arg2 >> 16, arg0 >> 16, arg3, this.aByteArray45);
						arg2 += local31;
						arg0 += local49;
						arg3 += this.anInt2649;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local49;
					arg1 -= arg3 * local31;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local1 * arg4;
					arg4 = 0;
				}
				if (local49 > local31) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt2649 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static395.method2489(arg0 >> 16, arg2 >> 16, arg3, this.aByteArray45);
								arg0 += local49;
								arg2 += local1;
								arg3 += this.anInt2649;
							}
						}
						Static395.method2489(arg0 >> 16, arg1 >> 16, arg3, this.aByteArray45);
						arg0 += local49;
						arg3 += this.anInt2649;
						arg1 += local31;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt2649;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static395.method2489(arg2 >> 16, arg0 >> 16, arg3, this.aByteArray45);
								arg0 += local49;
								arg2 += local1;
								arg3 += this.anInt2649;
							}
						}
						Static395.method2489(arg1 >> 16, arg0 >> 16, arg3, this.aByteArray45);
						arg0 += local49;
						arg3 += this.anInt2649;
						arg1 += local31;
					}
				}
			}
		} else if (arg5 > arg3) {
			arg1 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local31 * arg4;
				arg1 -= arg4 * local1;
				arg4 = 0;
			}
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local49 * arg3;
				arg3 = 0;
			}
			if (arg4 != arg3 && local31 > local1 || arg4 == arg3 && local49 < local1) {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt2649 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static395.method2489(arg0 >> 16, arg1 >> 16, arg4, this.aByteArray45);
							arg1 += local1;
							arg4 += this.anInt2649;
							arg0 += local49;
						}
					}
					Static395.method2489(arg2 >> 16, arg1 >> 16, arg4, this.aByteArray45);
					arg2 += local31;
					arg1 += local1;
					arg4 += this.anInt2649;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt2649;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static395.method2489(arg1 >> 16, arg0 >> 16, arg4, this.aByteArray45);
							arg0 += local49;
							arg4 += this.anInt2649;
							arg1 += local1;
						}
					}
					Static395.method2489(arg1 >> 16, arg2 >> 16, arg4, this.aByteArray45);
					arg4 += this.anInt2649;
					arg1 += local1;
					arg2 += local31;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local1;
				arg2 -= local31 * arg4;
				arg4 = 0;
			}
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local49;
				arg5 = 0;
			}
			if (local1 < local31) {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt2649 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static395.method2489(arg2 >> 16, arg1 >> 16, arg4, this.aByteArray45);
							arg4 += this.anInt2649;
							arg2 += local31;
							arg1 += local49;
						}
					}
					Static395.method2489(arg2 >> 16, arg0 >> 16, arg4, this.aByteArray45);
					arg0 += local1;
					arg4 += this.anInt2649;
					arg2 += local31;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt2649;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static395.method2489(arg1 >> 16, arg2 >> 16, arg4, this.aByteArray45);
							arg2 += local31;
							arg1 += local49;
							arg4 += this.anInt2649;
						}
					}
					Static395.method2489(arg0 >> 16, arg2 >> 16, arg4, this.aByteArray45);
					arg4 += this.anInt2649;
					arg0 += local1;
					arg2 += local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public void method2493() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray45.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
		}
		while (this.aByteArray45.length - 1 > local1) {
			local1++;
			this.aByteArray45[local1] = 0;
		}
	}
}
