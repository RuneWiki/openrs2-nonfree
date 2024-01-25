import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class5_Sub3_Sub7_Sub1 extends Class5_Sub3_Sub7 {

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
	public int anInt4605;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
	public int anInt4611;

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
	public int anInt4613;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!gd;II)V")
	public Class5_Sub3_Sub7_Sub1(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray40 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public void method3892() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray40.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
			local15++;
			this.aByteArray40[local15] = 0;
		}
		while (local15 < this.aByteArray40.length - 1) {
			local15++;
			this.aByteArray40[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	public void method3895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4613 = arg2;
		this.anInt4612 = arg0 - arg3;
		this.anInt4611 = arg3;
		this.anInt4605 = arg1 - arg2;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
	public void method3896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg4 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(24) int local24 = 0;
		if (arg0 != arg3) {
			local24 = (arg1 - arg4 << 16) / (arg3 - arg0);
		}
		@Pc(41) int local41 = 0;
		if (arg2 != arg3) {
			local41 = (arg5 - arg1 << 16) / (arg2 - arg3);
		}
		if (arg0 >= arg2 && arg2 <= arg3) {
			if (arg3 <= arg0) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local41;
					arg5 -= local7 * arg2;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local24 * arg3;
					arg3 = 0;
				}
				if (arg2 != arg3 && local7 > local41 || arg2 == arg3 && local7 < local24) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt4612;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static604.method8268(arg2, arg5 >> 16, arg1 >> 16, this.aByteArray40);
								arg5 += local7;
								arg2 += this.anInt4612;
								arg1 += local24;
							}
						}
						Static604.method8268(arg2, arg5 >> 16, arg4 >> 16, this.aByteArray40);
						arg4 += local41;
						arg2 += this.anInt4612;
						arg5 += local7;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt4612 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static604.method8268(arg2, arg1 >> 16, arg5 >> 16, this.aByteArray40);
								arg2 += this.anInt4612;
								arg1 += local24;
								arg5 += local7;
							}
						}
						Static604.method8268(arg2, arg4 >> 16, arg5 >> 16, this.aByteArray40);
						arg2 += this.anInt4612;
						arg4 += local41;
						arg5 += local7;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local41 * arg2;
					arg5 -= arg2 * local7;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local24 * arg0;
					arg0 = 0;
				}
				if ((arg2 == arg0 || local41 >= local7) && (arg2 != arg0 || local24 >= local41)) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt4612 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static604.method8268(arg2, arg1 >> 16, arg4 >> 16, this.aByteArray40);
								arg1 += local41;
								arg4 += local24;
								arg2 += this.anInt4612;
							}
						}
						Static604.method8268(arg2, arg1 >> 16, arg5 >> 16, this.aByteArray40);
						arg1 += local41;
						arg2 += this.anInt4612;
						arg5 += local7;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt4612;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static604.method8268(arg2, arg4 >> 16, arg1 >> 16, this.aByteArray40);
								arg2 += this.anInt4612;
								arg4 += local24;
								arg1 += local41;
							}
						}
						Static604.method8268(arg2, arg5 >> 16, arg1 >> 16, this.aByteArray40);
						arg5 += local7;
						arg2 += this.anInt4612;
						arg1 += local41;
					}
				}
			}
		} else if (arg3 >= arg0) {
			if (arg3 < arg2) {
				arg5 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local24 * arg0;
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local41;
					arg3 = 0;
				}
				if (arg0 != arg3 && local24 > local7 || arg3 == arg0 && local41 < local7) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt4612 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static604.method8268(arg0, arg1 >> 16, arg5 >> 16, this.aByteArray40);
								arg0 += this.anInt4612;
								arg5 += local7;
								arg1 += local41;
							}
						}
						Static604.method8268(arg0, arg4 >> 16, arg5 >> 16, this.aByteArray40);
						arg5 += local7;
						arg4 += local24;
						arg0 += this.anInt4612;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt4612;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static604.method8268(arg0, arg5 >> 16, arg1 >> 16, this.aByteArray40);
								arg5 += local7;
								arg0 += this.anInt4612;
								arg1 += local41;
							}
						}
						Static604.method8268(arg0, arg5 >> 16, arg4 >> 16, this.aByteArray40);
						arg0 += this.anInt4612;
						arg4 += local24;
						arg5 += local7;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local24;
					arg1 -= arg0 * local7;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg5 -= arg2 * local41;
					arg2 = 0;
				}
				if (local7 >= local24) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt4612;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static604.method8268(arg0, arg5 >> 16, arg4 >> 16, this.aByteArray40);
								arg4 += local24;
								arg5 += local41;
								arg0 += this.anInt4612;
							}
						}
						Static604.method8268(arg0, arg1 >> 16, arg4 >> 16, this.aByteArray40);
						arg1 += local7;
						arg4 += local24;
						arg0 += this.anInt4612;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt4612 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static604.method8268(arg0, arg4 >> 16, arg5 >> 16, this.aByteArray40);
								arg0 += this.anInt4612;
								arg4 += local24;
								arg5 += local41;
							}
						}
						Static604.method8268(arg0, arg4 >> 16, arg1 >> 16, this.aByteArray40);
						arg1 += local7;
						arg4 += local24;
						arg0 += this.anInt4612;
					}
				}
			}
		} else if (arg2 >= arg0) {
			arg5 = arg1 <<= 0x10;
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local41 * arg3;
				arg5 -= arg3 * local24;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg4 -= arg0 * local7;
				arg0 = 0;
			}
			if (local41 <= local24) {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt4612 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static604.method8268(arg3, arg4 >> 16, arg1 >> 16, this.aByteArray40);
							arg3 += this.anInt4612;
							arg4 += local7;
							arg1 += local41;
						}
					}
					Static604.method8268(arg3, arg5 >> 16, arg1 >> 16, this.aByteArray40);
					arg5 += local24;
					arg3 += this.anInt4612;
					arg1 += local41;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt4612;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static604.method8268(arg3, arg1 >> 16, arg4 >> 16, this.aByteArray40);
							arg4 += local7;
							arg1 += local41;
							arg3 += this.anInt4612;
						}
					}
					Static604.method8268(arg3, arg1 >> 16, arg5 >> 16, this.aByteArray40);
					arg1 += local41;
					arg5 += local24;
					arg3 += this.anInt4612;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local41 * arg3;
				arg4 -= arg3 * local24;
				arg3 = 0;
			}
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local7 * arg2;
				arg2 = 0;
			}
			if (local41 <= local24) {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt4612 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static604.method8268(arg3, arg4 >> 16, arg5 >> 16, this.aByteArray40);
							arg3 += this.anInt4612;
							arg4 += local24;
							arg5 += local7;
						}
					}
					Static604.method8268(arg3, arg4 >> 16, arg1 >> 16, this.aByteArray40);
					arg4 += local24;
					arg1 += local41;
					arg3 += this.anInt4612;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt4612;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static604.method8268(arg3, arg5 >> 16, arg4 >> 16, this.aByteArray40);
							arg5 += local7;
							arg4 += local24;
							arg3 += this.anInt4612;
						}
					}
					Static604.method8268(arg3, arg1 >> 16, arg4 >> 16, this.aByteArray40);
					arg1 += local41;
					arg4 += local24;
					arg3 += this.anInt4612;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZ)Z")
	public boolean method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray40.length >= arg0 * arg1;
	}
}
