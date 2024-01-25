import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class5_Sub9_Sub14_Sub1 extends Class5_Sub9_Sub14 {

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	public int anInt4479;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	public int anInt4480;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	public int anInt4481;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	public int anInt4482;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!po;II)V")
	public Class5_Sub9_Sub14_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IIIII)V")
	public void method3942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4480 = arg2;
		this.anInt4481 = arg1;
		this.anInt4482 = arg3 - arg1;
		this.anInt4479 = arg0 - arg2;
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V")
	public void method3943() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray55.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
			local1++;
			this.aByteArray55[local1] = 0;
		}
		while (local1 < this.aByteArray55.length - 1) {
			local1++;
			this.aByteArray55[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
	public boolean method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray55.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZIIIII)V")
	public void method3946(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 != arg3) {
			local1 = (arg0 - arg5 << 16) / (arg3 - arg4);
		}
		@Pc(22) int local22 = 0;
		if (arg3 != arg2) {
			local22 = (arg1 - arg0 << 16) / (arg2 - arg3);
		}
		@Pc(42) int local42 = 0;
		if (arg2 != arg4) {
			local42 = (arg5 - arg1 << 16) / (arg4 - arg2);
		}
		if (arg3 >= arg4 && arg4 <= arg2) {
			if (arg3 >= arg2) {
				arg0 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local42;
					arg5 -= local1 * arg4;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local22 * arg2;
					arg2 = 0;
				}
				if (arg4 != arg2 && local1 > local42 || arg4 == arg2 && local1 < local22) {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt4479 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static366.method3944(arg4, arg5 >> 16, this.aByteArray55, arg1 >> 16);
								arg4 += this.anInt4479;
								arg1 += local22;
								arg5 += local1;
							}
						}
						Static366.method3944(arg4, arg5 >> 16, this.aByteArray55, arg0 >> 16);
						arg5 += local1;
						arg0 += local42;
						arg4 += this.anInt4479;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt4479 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static366.method3944(arg4, arg1 >> 16, this.aByteArray55, arg5 >> 16);
								arg5 += local1;
								arg1 += local22;
								arg4 += this.anInt4479;
							}
						}
						Static366.method3944(arg4, arg0 >> 16, this.aByteArray55, arg5 >> 16);
						arg0 += local42;
						arg4 += this.anInt4479;
						arg5 += local1;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local1;
					arg1 -= local42 * arg4;
					arg4 = 0;
				}
				if (arg3 < 0) {
					arg0 -= local22 * arg3;
					arg3 = 0;
				}
				if (arg4 != arg3 && local42 < local1 || arg4 == arg3 && local22 < local42) {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt4479 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static366.method3944(arg4, arg0 >> 16, this.aByteArray55, arg1 >> 16);
								arg4 += this.anInt4479;
								arg1 += local42;
								arg0 += local22;
							}
						}
						Static366.method3944(arg4, arg5 >> 16, this.aByteArray55, arg1 >> 16);
						arg4 += this.anInt4479;
						arg1 += local42;
						arg5 += local1;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt4479 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static366.method3944(arg4, arg1 >> 16, this.aByteArray55, arg0 >> 16);
								arg1 += local42;
								arg0 += local22;
								arg4 += this.anInt4479;
							}
						}
						Static366.method3944(arg4, arg1 >> 16, this.aByteArray55, arg5 >> 16);
						arg5 += local1;
						arg1 += local42;
						arg4 += this.anInt4479;
					}
				}
			}
		} else if (arg3 > arg2) {
			if (arg3 > arg4) {
				arg0 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local22;
					arg1 -= local42 * arg2;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg5 -= local1 * arg4;
					arg4 = 0;
				}
				if (local42 <= local22) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt4479 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static366.method3944(arg2, arg0 >> 16, this.aByteArray55, arg5 >> 16);
								arg5 += local1;
								arg2 += this.anInt4479;
								arg0 += local22;
							}
						}
						Static366.method3944(arg2, arg0 >> 16, this.aByteArray55, arg1 >> 16);
						arg0 += local22;
						arg2 += this.anInt4479;
						arg1 += local42;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt4479;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static366.method3944(arg2, arg5 >> 16, this.aByteArray55, arg0 >> 16);
								arg5 += local1;
								arg2 += this.anInt4479;
								arg0 += local22;
							}
						}
						Static366.method3944(arg2, arg1 >> 16, this.aByteArray55, arg0 >> 16);
						arg2 += this.anInt4479;
						arg1 += local42;
						arg0 += local22;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local42 * arg2;
					arg5 -= arg2 * local22;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg0 -= local1 * arg3;
					arg3 = 0;
				}
				if (local22 < local42) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt4479 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static366.method3944(arg2, arg1 >> 16, this.aByteArray55, arg0 >> 16);
								arg2 += this.anInt4479;
								arg1 += local42;
								arg0 += local1;
							}
						}
						Static366.method3944(arg2, arg1 >> 16, this.aByteArray55, arg5 >> 16);
						arg2 += this.anInt4479;
						arg5 += local22;
						arg1 += local42;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt4479 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static366.method3944(arg2, arg0 >> 16, this.aByteArray55, arg1 >> 16);
								arg2 += this.anInt4479;
								arg0 += local1;
								arg1 += local42;
							}
						}
						Static366.method3944(arg2, arg5 >> 16, this.aByteArray55, arg1 >> 16);
						arg1 += local42;
						arg2 += this.anInt4479;
						arg5 += local22;
					}
				}
			}
		} else if (arg4 > arg2) {
			arg5 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local22 * arg3;
				arg5 -= arg3 * local1;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg1 -= arg2 * local42;
				arg2 = 0;
			}
			if (arg2 != arg3 && local1 < local22 || arg3 == arg2 && local1 > local42) {
				arg4 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt4479;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static366.method3944(arg3, arg1 >> 16, this.aByteArray55, arg5 >> 16);
							arg5 += local1;
							arg3 += this.anInt4479;
							arg1 += local42;
						}
					}
					Static366.method3944(arg3, arg0 >> 16, this.aByteArray55, arg5 >> 16);
					arg0 += local22;
					arg3 += this.anInt4479;
					arg5 += local1;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt4479;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static366.method3944(arg3, arg5 >> 16, this.aByteArray55, arg1 >> 16);
							arg3 += this.anInt4479;
							arg5 += local1;
							arg1 += local42;
						}
					}
					Static366.method3944(arg3, arg5 >> 16, this.aByteArray55, arg0 >> 16);
					arg3 += this.anInt4479;
					arg5 += local1;
					arg0 += local22;
				}
			}
		} else {
			arg1 = arg0 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local22 * arg3;
				arg1 -= arg3 * local1;
				arg3 = 0;
			}
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= local42 * arg4;
				arg4 = 0;
			}
			if (local22 <= local1) {
				arg2 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt4479 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static366.method3944(arg3, arg5 >> 16, this.aByteArray55, arg0 >> 16);
							arg0 += local22;
							arg5 += local42;
							arg3 += this.anInt4479;
						}
					}
					Static366.method3944(arg3, arg1 >> 16, this.aByteArray55, arg0 >> 16);
					arg1 += local1;
					arg3 += this.anInt4479;
					arg0 += local22;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt4479;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static366.method3944(arg3, arg0 >> 16, this.aByteArray55, arg5 >> 16);
							arg3 += this.anInt4479;
							arg5 += local42;
							arg0 += local22;
						}
					}
					Static366.method3944(arg3, arg0 >> 16, this.aByteArray55, arg1 >> 16);
					arg3 += this.anInt4479;
					arg1 += local1;
					arg0 += local22;
				}
			}
		}
	}
}
