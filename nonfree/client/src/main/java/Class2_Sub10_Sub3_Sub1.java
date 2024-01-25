import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub10_Sub3_Sub1 extends Class2_Sub10_Sub3 {

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public int anInt3582;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	public int anInt3583;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public int anInt3584;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
	public int anInt3585;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "[B")
	public final byte[] aByteArray67;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!fu;II)V")
	public Class2_Sub10_Sub3_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray67 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
	public void method3262() {
		@Pc(1) int local1 = -1;
		@Pc(11) int local11 = this.aByteArray67.length - 8;
		while (local11 > local1) {
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
			local1++;
			this.aByteArray67[local1] = 0;
		}
		while (local1 < this.aByteArray67.length - 1) {
			local1++;
			this.aByteArray67[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	public boolean method3263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray67.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIBIII)V")
	public void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg1) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg2);
		}
		@Pc(23) int local23 = 0;
		if (arg5 != arg1) {
			local23 = (arg0 - arg4 << 16) / (arg5 - arg1);
		}
		@Pc(45) int local45 = 0;
		if (arg5 != arg2) {
			local45 = (arg3 - arg0 << 16) / (arg2 - arg5);
		}
		if (arg1 >= arg2 && arg5 >= arg2) {
			if (arg5 > arg1) {
				arg0 = arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local1;
					arg0 -= local45 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local23 * arg1;
					arg1 = 0;
				}
				if (arg2 != arg1 && local45 < local1 || arg1 == arg2 && local45 > local23) {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt3584 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static401.method3264(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray67);
								arg4 += local23;
								arg2 += this.anInt3584;
								arg0 += local45;
							}
						}
						Static401.method3264(arg0 >> 16, arg2, arg3 >> 16, this.aByteArray67);
						arg3 += local1;
						arg2 += this.anInt3584;
						arg0 += local45;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt3584;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static401.method3264(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray67);
								arg0 += local45;
								arg4 += local23;
								arg2 += this.anInt3584;
							}
						}
						Static401.method3264(arg3 >> 16, arg2, arg0 >> 16, this.aByteArray67);
						arg3 += local1;
						arg2 += this.anInt3584;
						arg0 += local45;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local45;
					arg3 -= arg2 * local1;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg0 -= local23 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg2 && local45 < local1 || arg5 == arg2 && local1 < local23) {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt3584 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static401.method3264(arg0 >> 16, arg2, arg3 >> 16, this.aByteArray67);
								arg0 += local23;
								arg2 += this.anInt3584;
								arg3 += local1;
							}
						}
						Static401.method3264(arg4 >> 16, arg2, arg3 >> 16, this.aByteArray67);
						arg3 += local1;
						arg2 += this.anInt3584;
						arg4 += local45;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt3584 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static401.method3264(arg3 >> 16, arg2, arg0 >> 16, this.aByteArray67);
								arg3 += local1;
								arg0 += local23;
								arg2 += this.anInt3584;
							}
						}
						Static401.method3264(arg3 >> 16, arg2, arg4 >> 16, this.aByteArray67);
						arg3 += local1;
						arg2 += this.anInt3584;
						arg4 += local45;
					}
				}
			}
		} else if (arg1 <= arg5) {
			if (arg5 < arg2) {
				arg3 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local23;
					arg3 -= arg1 * local1;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg0 -= local45 * arg5;
					arg5 = 0;
				}
				if (arg1 != arg5 && local23 > local1 || arg1 == arg5 && local1 > local45) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt3584 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static401.method3264(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray67);
								arg3 += local1;
								arg1 += this.anInt3584;
								arg0 += local45;
							}
						}
						Static401.method3264(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray67);
						arg3 += local1;
						arg1 += this.anInt3584;
						arg4 += local23;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt3584;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static401.method3264(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray67);
								arg1 += this.anInt3584;
								arg0 += local45;
								arg3 += local1;
							}
						}
						Static401.method3264(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray67);
						arg4 += local23;
						arg3 += local1;
						arg1 += this.anInt3584;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local23 * arg1;
					arg0 -= local1 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local45;
					arg2 = 0;
				}
				if (local1 >= local23) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3584;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static401.method3264(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray67);
								arg4 += local23;
								arg1 += this.anInt3584;
								arg3 += local45;
							}
						}
						Static401.method3264(arg4 >> 16, arg1, arg0 >> 16, this.aByteArray67);
						arg4 += local23;
						arg1 += this.anInt3584;
						arg0 += local1;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3584;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static401.method3264(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray67);
								arg1 += this.anInt3584;
								arg4 += local23;
								arg3 += local45;
							}
						}
						Static401.method3264(arg0 >> 16, arg1, arg4 >> 16, this.aByteArray67);
						arg1 += this.anInt3584;
						arg4 += local23;
						arg0 += local1;
					}
				}
			}
		} else if (arg1 <= arg2) {
			arg3 = arg0 <<= 0x10;
			arg4 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local23 * arg5;
				arg0 -= local45 * arg5;
				arg5 = 0;
			}
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local45 > local23) {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt3584 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static401.method3264(arg4 >> 16, arg5, arg0 >> 16, this.aByteArray67);
							arg0 += local45;
							arg4 += local1;
							arg5 += this.anInt3584;
						}
					}
					Static401.method3264(arg3 >> 16, arg5, arg0 >> 16, this.aByteArray67);
					arg3 += local23;
					arg5 += this.anInt3584;
					arg0 += local45;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt3584 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static401.method3264(arg0 >> 16, arg5, arg4 >> 16, this.aByteArray67);
							arg5 += this.anInt3584;
							arg4 += local1;
							arg0 += local45;
						}
					}
					Static401.method3264(arg0 >> 16, arg5, arg3 >> 16, this.aByteArray67);
					arg5 += this.anInt3584;
					arg3 += local23;
					arg0 += local45;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local23 * arg5;
				arg0 -= arg5 * local45;
				arg5 = 0;
			}
			if (arg2 < 0) {
				arg3 -= local1 * arg2;
				arg2 = 0;
			}
			if (local23 < local45) {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt3584 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static401.method3264(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray67);
							arg5 += this.anInt3584;
							arg4 += local23;
							arg3 += local1;
						}
					}
					Static401.method3264(arg4 >> 16, arg5, arg0 >> 16, this.aByteArray67);
					arg4 += local23;
					arg5 += this.anInt3584;
					arg0 += local45;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt3584 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static401.method3264(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray67);
							arg4 += local23;
							arg3 += local1;
							arg5 += this.anInt3584;
						}
					}
					Static401.method3264(arg0 >> 16, arg5, arg4 >> 16, this.aByteArray67);
					arg5 += this.anInt3584;
					arg4 += local23;
					arg0 += local45;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIB)V")
	public void method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3583 = arg0 - arg1;
		this.anInt3582 = arg1;
		this.anInt3584 = arg3 - arg2;
		this.anInt3585 = arg2;
	}
}
