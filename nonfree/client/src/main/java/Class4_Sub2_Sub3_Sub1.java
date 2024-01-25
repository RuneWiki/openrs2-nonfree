import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class4_Sub2_Sub3_Sub1 extends Class4_Sub2_Sub3 {

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
	public int anInt6492;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
	public int anInt6493;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	public int anInt6496;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ug;II)V")
	public Class4_Sub2_Sub3_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray83 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)Z")
	public boolean method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray83.length;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
	public void method5260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg2 != arg3) {
			local11 = (arg0 - arg4 << 16) / (arg3 - arg2);
		}
		@Pc(32) int local32 = 0;
		if (arg5 != arg3) {
			local32 = (arg1 - arg0 << 16) / (arg5 - arg3);
		}
		@Pc(49) int local49 = 0;
		if (arg2 != arg5) {
			local49 = (arg4 - arg1 << 16) / (arg2 - arg5);
		}
		if (arg3 >= arg2 && arg2 <= arg5) {
			if (arg5 > arg3) {
				arg1 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local11;
					arg1 -= arg2 * local49;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg0 -= arg3 * local32;
					arg3 = 0;
				}
				if (arg3 != arg2 && local49 < local11 || arg3 == arg2 && local49 > local32) {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt6493 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static445.method5925(arg1 >> 16, arg2, arg0 >> 16, this.aByteArray83);
								arg0 += local32;
								arg2 += this.anInt6493;
								arg1 += local49;
							}
						}
						Static445.method5925(arg1 >> 16, arg2, arg4 >> 16, this.aByteArray83);
						arg2 += this.anInt6493;
						arg4 += local11;
						arg1 += local49;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt6493;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static445.method5925(arg0 >> 16, arg2, arg1 >> 16, this.aByteArray83);
								arg0 += local32;
								arg2 += this.anInt6493;
								arg1 += local49;
							}
						}
						Static445.method5925(arg4 >> 16, arg2, arg1 >> 16, this.aByteArray83);
						arg2 += this.anInt6493;
						arg1 += local49;
						arg4 += local11;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local49;
					arg4 -= local11 * arg2;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local32 * arg5;
					arg5 = 0;
				}
				if ((arg2 == arg5 || local11 <= local49) && (arg2 != arg5 || local11 >= local32)) {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt6493;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static445.method5925(arg4 >> 16, arg2, arg1 >> 16, this.aByteArray83);
								arg2 += this.anInt6493;
								arg1 += local32;
								arg4 += local11;
							}
						}
						Static445.method5925(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray83);
						arg2 += this.anInt6493;
						arg0 += local49;
						arg4 += local11;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt6493 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static445.method5925(arg1 >> 16, arg2, arg4 >> 16, this.aByteArray83);
								arg4 += local11;
								arg1 += local32;
								arg2 += this.anInt6493;
							}
						}
						Static445.method5925(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray83);
						arg0 += local49;
						arg4 += local11;
						arg2 += this.anInt6493;
					}
				}
			}
		} else if (arg5 >= arg3) {
			if (arg5 >= arg2) {
				arg1 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local11;
					arg0 -= arg3 * local32;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local49;
					arg2 = 0;
				}
				if (local32 > local11) {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt6493 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static445.method5925(arg4 >> 16, arg3, arg0 >> 16, this.aByteArray83);
								arg3 += this.anInt6493;
								arg0 += local32;
								arg4 += local49;
							}
						}
						Static445.method5925(arg1 >> 16, arg3, arg0 >> 16, this.aByteArray83);
						arg3 += this.anInt6493;
						arg0 += local32;
						arg1 += local11;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt6493 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static445.method5925(arg0 >> 16, arg3, arg4 >> 16, this.aByteArray83);
								arg3 += this.anInt6493;
								arg4 += local49;
								arg0 += local32;
							}
						}
						Static445.method5925(arg0 >> 16, arg3, arg1 >> 16, this.aByteArray83);
						arg0 += local32;
						arg1 += local11;
						arg3 += this.anInt6493;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local11;
					arg0 -= arg3 * local32;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg1 -= arg5 * local49;
					arg5 = 0;
				}
				if ((arg5 == arg3 || local11 >= local32) && (arg5 != arg3 || local49 >= local11)) {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt6493;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static445.method5925(arg1 >> 16, arg3, arg4 >> 16, this.aByteArray83);
								arg3 += this.anInt6493;
								arg4 += local11;
								arg1 += local49;
							}
						}
						Static445.method5925(arg0 >> 16, arg3, arg4 >> 16, this.aByteArray83);
						arg0 += local32;
						arg3 += this.anInt6493;
						arg4 += local11;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt6493 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static445.method5925(arg4 >> 16, arg3, arg1 >> 16, this.aByteArray83);
								arg3 += this.anInt6493;
								arg4 += local11;
								arg1 += local49;
							}
						}
						Static445.method5925(arg4 >> 16, arg3, arg0 >> 16, this.aByteArray83);
						arg4 += local11;
						arg0 += local32;
						arg3 += this.anInt6493;
					}
				}
			}
		} else if (arg2 >= arg3) {
			arg4 = arg1 <<= 0x10;
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local49;
				arg4 -= arg5 * local32;
				arg5 = 0;
			}
			if (arg3 < 0) {
				arg0 -= local11 * arg3;
				arg3 = 0;
			}
			if (local32 < local49) {
				arg2 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt6493;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static445.method5925(arg0 >> 16, arg5, arg1 >> 16, this.aByteArray83);
							arg0 += local11;
							arg5 += this.anInt6493;
							arg1 += local49;
						}
					}
					Static445.method5925(arg4 >> 16, arg5, arg1 >> 16, this.aByteArray83);
					arg5 += this.anInt6493;
					arg4 += local32;
					arg1 += local49;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt6493 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static445.method5925(arg1 >> 16, arg5, arg0 >> 16, this.aByteArray83);
							arg1 += local49;
							arg0 += local11;
							arg5 += this.anInt6493;
						}
					}
					Static445.method5925(arg1 >> 16, arg5, arg4 >> 16, this.aByteArray83);
					arg4 += local32;
					arg1 += local49;
					arg5 += this.anInt6493;
				}
			}
		} else {
			arg0 = arg1 <<= 0x10;
			arg4 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= local32 * arg5;
				arg1 -= arg5 * local49;
				arg5 = 0;
			}
			if (arg2 < 0) {
				arg4 -= local11 * arg2;
				arg2 = 0;
			}
			if (local49 > local32) {
				arg3 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt6493;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static445.method5925(arg0 >> 16, arg5, arg4 >> 16, this.aByteArray83);
							arg5 += this.anInt6493;
							arg0 += local32;
							arg4 += local11;
						}
					}
					Static445.method5925(arg0 >> 16, arg5, arg1 >> 16, this.aByteArray83);
					arg0 += local32;
					arg5 += this.anInt6493;
					arg1 += local49;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt6493 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static445.method5925(arg4 >> 16, arg5, arg0 >> 16, this.aByteArray83);
							arg4 += local11;
							arg5 += this.anInt6493;
							arg0 += local32;
						}
					}
					Static445.method5925(arg1 >> 16, arg5, arg0 >> 16, this.aByteArray83);
					arg1 += local49;
					arg0 += local32;
					arg5 += this.anInt6493;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
	public void method5261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6493 = arg2 - arg0;
		this.anInt6490 = arg1;
		this.anInt6492 = arg3 - arg1;
		this.anInt6496 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public void method5262() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray83.length - 8;
		while (local17 > local11) {
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
			local11++;
			this.aByteArray83[local11] = 0;
		}
		while (this.aByteArray83.length - 1 > local11) {
			local11++;
			this.aByteArray83[local11] = 0;
		}
	}
}
