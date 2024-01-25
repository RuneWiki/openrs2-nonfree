import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class3_Sub7_Sub13_Sub1 extends Class3_Sub7_Sub13 {

	@OriginalMember(owner = "client!og", name = "C", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "I")
	public int anInt6512;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "I")
	public int anInt6516;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "I")
	public int anInt6519;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class3_Sub7_Sub13_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray71 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
	public void method5561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg0) {
			local7 = (arg5 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(30) int local30 = 0;
		if (arg3 != arg4) {
			local30 = (arg2 - arg5 << 16) / (arg4 - arg3);
		}
		@Pc(50) int local50 = 0;
		if (arg4 != arg0) {
			local50 = (arg1 - arg2 << 16) / (arg0 - arg4);
		}
		if (arg3 >= arg0 && arg4 >= arg0) {
			if (arg4 > arg3) {
				arg2 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local7;
					arg2 -= arg0 * local50;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local30 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 > local50 || arg0 == arg3 && local30 < local50) {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt6511 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static267.method4088(arg0, arg2 >> 16, this.aByteArray71, arg5 >> 16);
								arg5 += local30;
								arg2 += local50;
								arg0 += this.anInt6511;
							}
						}
						Static267.method4088(arg0, arg2 >> 16, this.aByteArray71, arg1 >> 16);
						arg1 += local7;
						arg2 += local50;
						arg0 += this.anInt6511;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt6511 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static267.method4088(arg0, arg5 >> 16, this.aByteArray71, arg2 >> 16);
								arg0 += this.anInt6511;
								arg2 += local50;
								arg5 += local30;
							}
						}
						Static267.method4088(arg0, arg1 >> 16, this.aByteArray71, arg2 >> 16);
						arg0 += this.anInt6511;
						arg2 += local50;
						arg1 += local7;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local50 * arg0;
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg2 -= local30 * arg4;
					arg4 = 0;
				}
				if ((arg0 == arg4 || local50 >= local7) && (arg4 != arg0 || local7 >= local30)) {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt6511;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static267.method4088(arg0, arg1 >> 16, this.aByteArray71, arg2 >> 16);
								arg0 += this.anInt6511;
								arg1 += local7;
								arg2 += local30;
							}
						}
						Static267.method4088(arg0, arg1 >> 16, this.aByteArray71, arg5 >> 16);
						arg0 += this.anInt6511;
						arg1 += local7;
						arg5 += local50;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt6511 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static267.method4088(arg0, arg2 >> 16, this.aByteArray71, arg1 >> 16);
								arg2 += local30;
								arg0 += this.anInt6511;
								arg1 += local7;
							}
						}
						Static267.method4088(arg0, arg5 >> 16, this.aByteArray71, arg1 >> 16);
						arg1 += local7;
						arg0 += this.anInt6511;
						arg5 += local50;
					}
				}
			}
		} else if (arg3 > arg4) {
			if (arg3 > arg0) {
				arg5 = arg2 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local50 * arg4;
					arg5 -= local30 * arg4;
					arg4 = 0;
				}
				if (arg0 < 0) {
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (local30 < local50) {
					arg3 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt6511 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static267.method4088(arg4, arg5 >> 16, this.aByteArray71, arg1 >> 16);
								arg1 += local7;
								arg4 += this.anInt6511;
								arg5 += local30;
							}
						}
						Static267.method4088(arg4, arg5 >> 16, this.aByteArray71, arg2 >> 16);
						arg4 += this.anInt6511;
						arg5 += local30;
						arg2 += local50;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt6511;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static267.method4088(arg4, arg1 >> 16, this.aByteArray71, arg5 >> 16);
								arg1 += local7;
								arg4 += this.anInt6511;
								arg5 += local30;
							}
						}
						Static267.method4088(arg4, arg2 >> 16, this.aByteArray71, arg5 >> 16);
						arg4 += this.anInt6511;
						arg5 += local30;
						arg2 += local50;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local50 * arg4;
					arg1 -= arg4 * local30;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local7;
					arg3 = 0;
				}
				if (local50 <= local30) {
					arg0 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt6511;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static267.method4088(arg4, arg2 >> 16, this.aByteArray71, arg5 >> 16);
								arg2 += local50;
								arg4 += this.anInt6511;
								arg5 += local7;
							}
						}
						Static267.method4088(arg4, arg2 >> 16, this.aByteArray71, arg1 >> 16);
						arg4 += this.anInt6511;
						arg2 += local50;
						arg1 += local30;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt6511;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static267.method4088(arg4, arg5 >> 16, this.aByteArray71, arg2 >> 16);
								arg2 += local50;
								arg4 += this.anInt6511;
								arg5 += local7;
							}
						}
						Static267.method4088(arg4, arg1 >> 16, this.aByteArray71, arg2 >> 16);
						arg4 += this.anInt6511;
						arg2 += local50;
						arg1 += local30;
					}
				}
			}
		} else if (arg0 <= arg4) {
			arg2 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local7;
				arg5 -= arg3 * local30;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg1 -= local50 * arg0;
				arg0 = 0;
			}
			if (local7 >= local30) {
				arg4 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt6511 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static267.method4088(arg3, arg5 >> 16, this.aByteArray71, arg1 >> 16);
							arg3 += this.anInt6511;
							arg5 += local30;
							arg1 += local50;
						}
					}
					Static267.method4088(arg3, arg5 >> 16, this.aByteArray71, arg2 >> 16);
					arg2 += local7;
					arg5 += local30;
					arg3 += this.anInt6511;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt6511;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static267.method4088(arg3, arg1 >> 16, this.aByteArray71, arg5 >> 16);
							arg5 += local30;
							arg3 += this.anInt6511;
							arg1 += local50;
						}
					}
					Static267.method4088(arg3, arg2 >> 16, this.aByteArray71, arg5 >> 16);
					arg5 += local30;
					arg3 += this.anInt6511;
					arg2 += local7;
				}
			}
		} else {
			arg1 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local7 * arg3;
				arg5 -= local30 * arg3;
				arg3 = 0;
			}
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= arg4 * local50;
				arg4 = 0;
			}
			if (arg4 != arg3 && local30 > local7 || arg3 == arg4 && local7 > local50) {
				arg0 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt6511 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static267.method4088(arg3, arg1 >> 16, this.aByteArray71, arg2 >> 16);
							arg1 += local7;
							arg2 += local50;
							arg3 += this.anInt6511;
						}
					}
					Static267.method4088(arg3, arg1 >> 16, this.aByteArray71, arg5 >> 16);
					arg1 += local7;
					arg3 += this.anInt6511;
					arg5 += local30;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt6511;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static267.method4088(arg3, arg2 >> 16, this.aByteArray71, arg1 >> 16);
							arg2 += local50;
							arg1 += local7;
							arg3 += this.anInt6511;
						}
					}
					Static267.method4088(arg3, arg5 >> 16, this.aByteArray71, arg1 >> 16);
					arg5 += local30;
					arg3 += this.anInt6511;
					arg1 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
	public boolean method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray71.length;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	public void method5564() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray71.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
			local13++;
			this.aByteArray71[local13] = 0;
		}
		while (this.aByteArray71.length - 1 > local13) {
			local13++;
			this.aByteArray71[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	public void method5567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6511 = arg0 - arg1;
		this.anInt6516 = arg2 - arg3;
		this.anInt6512 = arg3;
		this.anInt6519 = arg1;
	}
}
