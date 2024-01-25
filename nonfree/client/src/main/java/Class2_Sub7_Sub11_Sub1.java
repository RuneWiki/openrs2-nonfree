import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class2_Sub7_Sub11_Sub1 extends Class2_Sub7_Sub11 {

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	public int anInt3858;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
	public int anInt3859;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
	public int anInt3860;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
	public int anInt3861;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "[B")
	public final byte[] aByteArray44;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ic;II)V")
	public Class2_Sub7_Sub11_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray44 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)Z")
	public boolean method3359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray44.length;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	public void method3361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3859 = arg2 - arg1;
		this.anInt3858 = arg3 - arg0;
		this.anInt3860 = arg0;
		this.anInt3861 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)V")
	public void method3362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg4) {
			local1 = (arg3 - arg1 << 16) / (arg4 - arg2);
		}
		@Pc(22) int local22 = 0;
		if (arg0 != arg4) {
			local22 = (arg5 - arg3 << 16) / (arg0 - arg4);
		}
		@Pc(51) int local51 = 0;
		if (arg2 != arg0) {
			local51 = (arg1 - arg5 << 16) / (arg2 - arg0);
		}
		if (arg2 <= arg4 && arg0 >= arg2) {
			if (arg4 >= arg0) {
				arg3 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local1 * arg2;
					arg3 -= arg2 * local51;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local22;
					arg0 = 0;
				}
				if (arg2 != arg0 && local1 > local51 || arg0 == arg2 && local22 > local1) {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt3858 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static398.method3360(arg5 >> 16, arg2, arg1 >> 16, this.aByteArray44);
								arg5 += local22;
								arg2 += this.anInt3858;
								arg1 += local1;
							}
						}
						Static398.method3360(arg3 >> 16, arg2, arg1 >> 16, this.aByteArray44);
						arg1 += local1;
						arg3 += local51;
						arg2 += this.anInt3858;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt3858 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static398.method3360(arg1 >> 16, arg2, arg5 >> 16, this.aByteArray44);
								arg2 += this.anInt3858;
								arg5 += local22;
								arg1 += local1;
							}
						}
						Static398.method3360(arg1 >> 16, arg2, arg3 >> 16, this.aByteArray44);
						arg2 += this.anInt3858;
						arg1 += local1;
						arg3 += local51;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local1;
					arg5 -= arg2 * local51;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local22;
					arg4 = 0;
				}
				if (arg2 != arg4 && local51 < local1 || arg4 == arg2 && local51 > local22) {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt3858 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static398.method3360(arg5 >> 16, arg2, arg3 >> 16, this.aByteArray44);
								arg5 += local51;
								arg2 += this.anInt3858;
								arg3 += local22;
							}
						}
						Static398.method3360(arg5 >> 16, arg2, arg1 >> 16, this.aByteArray44);
						arg5 += local51;
						arg2 += this.anInt3858;
						arg1 += local1;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt3858 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static398.method3360(arg3 >> 16, arg2, arg5 >> 16, this.aByteArray44);
								arg3 += local22;
								arg2 += this.anInt3858;
								arg5 += local51;
							}
						}
						Static398.method3360(arg1 >> 16, arg2, arg5 >> 16, this.aByteArray44);
						arg2 += this.anInt3858;
						arg5 += local51;
						arg1 += local1;
					}
				}
			}
		} else if (arg4 <= arg0) {
			if (arg0 < arg2) {
				arg1 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local22 * arg4;
					arg1 -= arg4 * local1;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local51;
					arg0 = 0;
				}
				if (arg4 != arg0 && local22 > local1 || arg4 == arg0 && local51 < local1) {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt3858;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static398.method3360(arg1 >> 16, arg4, arg5 >> 16, this.aByteArray44);
								arg5 += local51;
								arg4 += this.anInt3858;
								arg1 += local1;
							}
						}
						Static398.method3360(arg1 >> 16, arg4, arg3 >> 16, this.aByteArray44);
						arg3 += local22;
						arg1 += local1;
						arg4 += this.anInt3858;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt3858 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static398.method3360(arg5 >> 16, arg4, arg1 >> 16, this.aByteArray44);
								arg5 += local51;
								arg1 += local1;
								arg4 += this.anInt3858;
							}
						}
						Static398.method3360(arg3 >> 16, arg4, arg1 >> 16, this.aByteArray44);
						arg4 += this.anInt3858;
						arg1 += local1;
						arg3 += local22;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local1;
					arg3 -= local22 * arg4;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local51;
					arg2 = 0;
				}
				if (local22 <= local1) {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt3858 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static398.method3360(arg3 >> 16, arg4, arg1 >> 16, this.aByteArray44);
								arg1 += local51;
								arg3 += local22;
								arg4 += this.anInt3858;
							}
						}
						Static398.method3360(arg3 >> 16, arg4, arg5 >> 16, this.aByteArray44);
						arg3 += local22;
						arg5 += local1;
						arg4 += this.anInt3858;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt3858 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static398.method3360(arg1 >> 16, arg4, arg3 >> 16, this.aByteArray44);
								arg1 += local51;
								arg4 += this.anInt3858;
								arg3 += local22;
							}
						}
						Static398.method3360(arg5 >> 16, arg4, arg3 >> 16, this.aByteArray44);
						arg4 += this.anInt3858;
						arg3 += local22;
						arg5 += local1;
					}
				}
			}
		} else if (arg4 <= arg2) {
			arg1 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local51 * arg0;
				arg1 -= local22 * arg0;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= arg4 * local1;
				arg4 = 0;
			}
			if (local51 > local22) {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt3858 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static398.method3360(arg3 >> 16, arg0, arg5 >> 16, this.aByteArray44);
							arg0 += this.anInt3858;
							arg3 += local1;
							arg5 += local51;
						}
					}
					Static398.method3360(arg1 >> 16, arg0, arg5 >> 16, this.aByteArray44);
					arg1 += local22;
					arg0 += this.anInt3858;
					arg5 += local51;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt3858;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static398.method3360(arg5 >> 16, arg0, arg3 >> 16, this.aByteArray44);
							arg5 += local51;
							arg0 += this.anInt3858;
							arg3 += local1;
						}
					}
					Static398.method3360(arg5 >> 16, arg0, arg1 >> 16, this.aByteArray44);
					arg1 += local22;
					arg0 += this.anInt3858;
					arg5 += local51;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= arg0 * local51;
				arg3 -= arg0 * local22;
				arg0 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local1 * arg2;
				arg2 = 0;
			}
			if (local51 > local22) {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt3858;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static398.method3360(arg3 >> 16, arg0, arg1 >> 16, this.aByteArray44);
							arg1 += local1;
							arg3 += local22;
							arg0 += this.anInt3858;
						}
					}
					Static398.method3360(arg3 >> 16, arg0, arg5 >> 16, this.aByteArray44);
					arg5 += local51;
					arg0 += this.anInt3858;
					arg3 += local22;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt3858 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static398.method3360(arg1 >> 16, arg0, arg3 >> 16, this.aByteArray44);
							arg1 += local1;
							arg0 += this.anInt3858;
							arg3 += local22;
						}
					}
					Static398.method3360(arg5 >> 16, arg0, arg3 >> 16, this.aByteArray44);
					arg0 += this.anInt3858;
					arg3 += local22;
					arg5 += local51;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public void method3363() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray44.length - 8;
		while (local18 > local12) {
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
			local12++;
			this.aByteArray44[local12] = 0;
		}
		while (this.aByteArray44.length - 1 > local12) {
			local12++;
			this.aByteArray44[local12] = 0;
		}
	}
}
