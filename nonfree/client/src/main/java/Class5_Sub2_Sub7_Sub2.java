import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class5_Sub2_Sub7_Sub2 extends Class5_Sub2_Sub7 {

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
	public int anInt6435;

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
	public int anInt6437;

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
	public int anInt6439;

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
	public int anInt6446;

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!kv;II)V")
	public Class5_Sub2_Sub7_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray61 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
	public void method5402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg3) {
			local7 = (arg4 - arg0 << 16) / (arg5 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg1 != arg5) {
			local28 = (arg2 - arg4 << 16) / (arg1 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg1 != arg3) {
			local49 = (arg0 - arg2 << 16) / (arg3 - arg1);
		}
		if (arg5 >= arg3 && arg3 <= arg1) {
			if (arg1 > arg5) {
				arg2 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local49;
					arg0 -= local7 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local28 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg3 && local49 < local7 || arg3 == arg5 && local28 < local49) {
					arg1 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt6437 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg2 >> 16, arg4 >> 16, arg3);
								arg3 += this.anInt6437;
								arg2 += local49;
								arg4 += local28;
							}
						}
						Static671.method8758(this.aByteArray61, arg2 >> 16, arg0 >> 16, arg3);
						arg2 += local49;
						arg0 += local7;
						arg3 += this.anInt6437;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt6437 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg4 >> 16, arg2 >> 16, arg3);
								arg3 += this.anInt6437;
								arg2 += local49;
								arg4 += local28;
							}
						}
						Static671.method8758(this.aByteArray61, arg0 >> 16, arg2 >> 16, arg3);
						arg3 += this.anInt6437;
						arg2 += local49;
						arg0 += local7;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local49;
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local28 * arg1;
					arg1 = 0;
				}
				if ((arg3 == arg1 || local49 >= local7) && (arg1 != arg3 || local7 >= local28)) {
					arg5 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6437 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg0 >> 16, arg2 >> 16, arg3);
								arg0 += local7;
								arg3 += this.anInt6437;
								arg2 += local28;
							}
						}
						Static671.method8758(this.aByteArray61, arg0 >> 16, arg4 >> 16, arg3);
						arg3 += this.anInt6437;
						arg4 += local49;
						arg0 += local7;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6437 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg2 >> 16, arg0 >> 16, arg3);
								arg3 += this.anInt6437;
								arg2 += local28;
								arg0 += local7;
							}
						}
						Static671.method8758(this.aByteArray61, arg4 >> 16, arg0 >> 16, arg3);
						arg4 += local49;
						arg3 += this.anInt6437;
						arg0 += local7;
					}
				}
			}
		} else if (arg5 > arg1) {
			if (arg5 > arg3) {
				arg4 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local49 * arg1;
					arg4 -= arg1 * local28;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				if (local49 > local28) {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt6437;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg4 >> 16, arg0 >> 16, arg1);
								arg4 += local28;
								arg1 += this.anInt6437;
								arg0 += local7;
							}
						}
						Static671.method8758(this.aByteArray61, arg4 >> 16, arg2 >> 16, arg1);
						arg1 += this.anInt6437;
						arg2 += local49;
						arg4 += local28;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt6437;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg0 >> 16, arg4 >> 16, arg1);
								arg4 += local28;
								arg1 += this.anInt6437;
								arg0 += local7;
							}
						}
						Static671.method8758(this.aByteArray61, arg2 >> 16, arg4 >> 16, arg1);
						arg2 += local49;
						arg4 += local28;
						arg1 += this.anInt6437;
					}
				}
			} else {
				arg0 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local49 * arg1;
					arg0 -= local28 * arg1;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local7;
					arg5 = 0;
				}
				if (local28 < local49) {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6437 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg4 >> 16, arg2 >> 16, arg1);
								arg4 += local7;
								arg1 += this.anInt6437;
								arg2 += local49;
							}
						}
						Static671.method8758(this.aByteArray61, arg0 >> 16, arg2 >> 16, arg1);
						arg2 += local49;
						arg0 += local28;
						arg1 += this.anInt6437;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6437 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static671.method8758(this.aByteArray61, arg2 >> 16, arg4 >> 16, arg1);
								arg4 += local7;
								arg1 += this.anInt6437;
								arg2 += local49;
							}
						}
						Static671.method8758(this.aByteArray61, arg2 >> 16, arg0 >> 16, arg1);
						arg1 += this.anInt6437;
						arg2 += local49;
						arg0 += local28;
					}
				}
			}
		} else if (arg1 >= arg3) {
			arg2 = arg4 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local28 * arg5;
				arg2 -= local7 * arg5;
				arg5 = 0;
			}
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local49 * arg3;
				arg3 = 0;
			}
			if (local28 > local7) {
				arg1 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt6437 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static671.method8758(this.aByteArray61, arg0 >> 16, arg4 >> 16, arg5);
							arg4 += local28;
							arg0 += local49;
							arg5 += this.anInt6437;
						}
					}
					Static671.method8758(this.aByteArray61, arg2 >> 16, arg4 >> 16, arg5);
					arg2 += local7;
					arg5 += this.anInt6437;
					arg4 += local28;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt6437;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static671.method8758(this.aByteArray61, arg4 >> 16, arg0 >> 16, arg5);
							arg0 += local49;
							arg4 += local28;
							arg5 += this.anInt6437;
						}
					}
					Static671.method8758(this.aByteArray61, arg4 >> 16, arg2 >> 16, arg5);
					arg4 += local28;
					arg5 += this.anInt6437;
					arg2 += local7;
				}
			}
		} else {
			arg0 = arg4 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local7;
				arg4 -= local28 * arg5;
				arg5 = 0;
			}
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local49 * arg1;
				arg1 = 0;
			}
			if (arg5 != arg1 && local7 < local28 || arg1 == arg5 && local49 < local7) {
				arg3 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt6437 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static671.method8758(this.aByteArray61, arg0 >> 16, arg2 >> 16, arg5);
							arg5 += this.anInt6437;
							arg2 += local49;
							arg0 += local7;
						}
					}
					Static671.method8758(this.aByteArray61, arg0 >> 16, arg4 >> 16, arg5);
					arg4 += local28;
					arg0 += local7;
					arg5 += this.anInt6437;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt6437;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static671.method8758(this.aByteArray61, arg2 >> 16, arg0 >> 16, arg5);
							arg5 += this.anInt6437;
							arg0 += local7;
							arg2 += local49;
						}
					}
					Static671.method8758(this.aByteArray61, arg4 >> 16, arg0 >> 16, arg5);
					arg0 += local7;
					arg5 += this.anInt6437;
					arg4 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	public boolean method5404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray61.length;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	public void method5405() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray61.length - 8;
		while (local21 > local15) {
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
			local15++;
			this.aByteArray61[local15] = 0;
		}
		while (local15 < this.aByteArray61.length - 1) {
			local15++;
			this.aByteArray61[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIII)V")
	public void method5408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6439 = arg3;
		this.anInt6435 = arg1 - arg3;
		this.anInt6446 = arg2;
		this.anInt6437 = arg0 - arg2;
	}
}
