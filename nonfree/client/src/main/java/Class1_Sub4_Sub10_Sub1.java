import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class1_Sub4_Sub10_Sub1 extends Class1_Sub4_Sub10 {

	@OriginalMember(owner = "client!um", name = "B", descriptor = "I")
	public int anInt6252;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "I")
	public int anInt6253;

	@OriginalMember(owner = "client!um", name = "H", descriptor = "I")
	public int anInt6254;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "I")
	public int anInt6255;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!h;II)V")
	public Class1_Sub4_Sub10_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray91 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
	public void method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6252 = arg2;
		this.anInt6253 = arg1 - arg3;
		this.anInt6255 = arg0 - arg2;
		this.anInt6254 = arg3;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIZ)V")
	public void method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = 0;
		if (arg5 != arg1) {
			local5 = (arg2 - arg3 << 16) / (arg1 - arg5);
		}
		@Pc(21) int local21 = 0;
		if (arg1 != arg0) {
			local21 = (arg4 - arg2 << 16) / (arg0 - arg1);
		}
		@Pc(37) int local37 = 0;
		if (arg0 != arg5) {
			local37 = (arg3 - arg4 << 16) / (arg5 - arg0);
		}
		if (arg5 <= arg1 && arg0 >= arg5) {
			if (arg1 < arg0) {
				arg4 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local37 * arg5;
					arg3 -= arg5 * local5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local21 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg5 || local37 >= local5) && (arg1 != arg5 || local21 >= local37)) {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt6253;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static371.method5295(arg4 >> 16, this.aByteArray91, arg2 >> 16, arg5);
								arg5 += this.anInt6253;
								arg4 += local37;
								arg2 += local21;
							}
						}
						Static371.method5295(arg4 >> 16, this.aByteArray91, arg3 >> 16, arg5);
						arg5 += this.anInt6253;
						arg4 += local37;
						arg3 += local5;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt6253 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static371.method5295(arg2 >> 16, this.aByteArray91, arg4 >> 16, arg5);
								arg2 += local21;
								arg5 += this.anInt6253;
								arg4 += local37;
							}
						}
						Static371.method5295(arg3 >> 16, this.aByteArray91, arg4 >> 16, arg5);
						arg3 += local5;
						arg4 += local37;
						arg5 += this.anInt6253;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local5;
					arg2 -= arg5 * local37;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg4 -= arg0 * local21;
					arg0 = 0;
				}
				if (arg0 != arg5 && local37 < local5 || arg0 == arg5 && local21 > local5) {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt6253;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static371.method5295(arg3 >> 16, this.aByteArray91, arg4 >> 16, arg5);
								arg5 += this.anInt6253;
								arg4 += local21;
								arg3 += local5;
							}
						}
						Static371.method5295(arg3 >> 16, this.aByteArray91, arg2 >> 16, arg5);
						arg2 += local37;
						arg3 += local5;
						arg5 += this.anInt6253;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt6253 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static371.method5295(arg4 >> 16, this.aByteArray91, arg3 >> 16, arg5);
								arg4 += local21;
								arg5 += this.anInt6253;
								arg3 += local5;
							}
						}
						Static371.method5295(arg2 >> 16, this.aByteArray91, arg3 >> 16, arg5);
						arg3 += local5;
						arg2 += local37;
						arg5 += this.anInt6253;
					}
				}
			}
		} else if (arg1 <= arg0) {
			if (arg0 >= arg5) {
				arg4 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local21 * arg1;
					arg4 -= arg1 * local5;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local37;
					arg5 = 0;
				}
				if (local5 >= local21) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt6253;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static371.method5295(arg3 >> 16, this.aByteArray91, arg2 >> 16, arg1);
								arg1 += this.anInt6253;
								arg2 += local21;
								arg3 += local37;
							}
						}
						Static371.method5295(arg4 >> 16, this.aByteArray91, arg2 >> 16, arg1);
						arg4 += local5;
						arg2 += local21;
						arg1 += this.anInt6253;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6253 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static371.method5295(arg2 >> 16, this.aByteArray91, arg3 >> 16, arg1);
								arg1 += this.anInt6253;
								arg2 += local21;
								arg3 += local37;
							}
						}
						Static371.method5295(arg2 >> 16, this.aByteArray91, arg4 >> 16, arg1);
						arg1 += this.anInt6253;
						arg4 += local5;
						arg2 += local21;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local5;
					arg2 -= local21 * arg1;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local37;
					arg0 = 0;
				}
				if (arg1 != arg0 && local21 > local5 || arg0 == arg1 && local37 < local5) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt6253 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static371.method5295(arg4 >> 16, this.aByteArray91, arg3 >> 16, arg1);
								arg1 += this.anInt6253;
								arg4 += local37;
								arg3 += local5;
							}
						}
						Static371.method5295(arg2 >> 16, this.aByteArray91, arg3 >> 16, arg1);
						arg1 += this.anInt6253;
						arg2 += local21;
						arg3 += local5;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt6253 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static371.method5295(arg3 >> 16, this.aByteArray91, arg4 >> 16, arg1);
								arg3 += local5;
								arg4 += local37;
								arg1 += this.anInt6253;
							}
						}
						Static371.method5295(arg3 >> 16, this.aByteArray91, arg2 >> 16, arg1);
						arg2 += local21;
						arg3 += local5;
						arg1 += this.anInt6253;
					}
				}
			}
		} else if (arg1 <= arg5) {
			arg3 = arg4 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= arg0 * local21;
				arg4 -= local37 * arg0;
				arg0 = 0;
			}
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= arg1 * local5;
				arg1 = 0;
			}
			if (local21 < local37) {
				arg5 -= arg1;
				arg1 -= arg0;
				arg0 = this.anInt6253 * arg0;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static371.method5295(arg4 >> 16, this.aByteArray91, arg2 >> 16, arg0);
							arg2 += local5;
							arg4 += local37;
							arg0 += this.anInt6253;
						}
					}
					Static371.method5295(arg4 >> 16, this.aByteArray91, arg3 >> 16, arg0);
					arg4 += local37;
					arg3 += local21;
					arg0 += this.anInt6253;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt6253;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static371.method5295(arg2 >> 16, this.aByteArray91, arg4 >> 16, arg0);
							arg4 += local37;
							arg0 += this.anInt6253;
							arg2 += local5;
						}
					}
					Static371.method5295(arg3 >> 16, this.aByteArray91, arg4 >> 16, arg0);
					arg0 += this.anInt6253;
					arg4 += local37;
					arg3 += local21;
				}
			}
		} else {
			arg2 = arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local37 * arg0;
				arg2 -= arg0 * local21;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local5 * arg5;
				arg5 = 0;
			}
			if (local37 > local21) {
				arg1 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt6253 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static371.method5295(arg3 >> 16, this.aByteArray91, arg2 >> 16, arg0);
							arg3 += local5;
							arg0 += this.anInt6253;
							arg2 += local21;
						}
					}
					Static371.method5295(arg4 >> 16, this.aByteArray91, arg2 >> 16, arg0);
					arg4 += local37;
					arg2 += local21;
					arg0 += this.anInt6253;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt6253 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static371.method5295(arg2 >> 16, this.aByteArray91, arg3 >> 16, arg0);
							arg0 += this.anInt6253;
							arg3 += local5;
							arg2 += local21;
						}
					}
					Static371.method5295(arg2 >> 16, this.aByteArray91, arg4 >> 16, arg0);
					arg4 += local37;
					arg2 += local21;
					arg0 += this.anInt6253;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)Z")
	public boolean method5297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray91.length;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	public void method5298() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray91.length - 8;
		while (local7 > local1) {
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
			local1++;
			this.aByteArray91[local1] = 0;
		}
		while (local1 < this.aByteArray91.length - 1) {
			local1++;
			this.aByteArray91[local1] = 0;
		}
	}
}
