import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class3_Sub7_Sub3_Sub1 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!is", name = "x", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!is", name = "y", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	public int anInt2866;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "I")
	public int anInt2867;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!se;II)V")
	public Class3_Sub7_Sub3_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V")
	public void method2335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 != arg2) {
			local1 = (arg3 - arg1 << 16) / (arg2 - arg4);
		}
		@Pc(31) int local31 = 0;
		if (arg5 != arg2) {
			local31 = (arg0 - arg3 << 16) / (arg5 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg4 != arg5) {
			local48 = (arg1 - arg0 << 16) / (arg4 - arg5);
		}
		if (arg2 >= arg4 && arg4 <= arg5) {
			if (arg5 <= arg2) {
				arg3 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local48 * arg4;
					arg1 -= arg4 * local1;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local31;
					arg5 = 0;
				}
				if (arg4 != arg5 && local48 < local1 || arg5 == arg4 && local1 < local31) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt2865 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg1 >> 16, arg0 >> 16, arg4);
								arg0 += local31;
								arg4 += this.anInt2865;
								arg1 += local1;
							}
						}
						Static363.method2336(this.aByteArray55, arg1 >> 16, arg3 >> 16, arg4);
						arg3 += local48;
						arg1 += local1;
						arg4 += this.anInt2865;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt2865 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg0 >> 16, arg1 >> 16, arg4);
								arg1 += local1;
								arg0 += local31;
								arg4 += this.anInt2865;
							}
						}
						Static363.method2336(this.aByteArray55, arg3 >> 16, arg1 >> 16, arg4);
						arg4 += this.anInt2865;
						arg3 += local48;
						arg1 += local1;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local1 * arg4;
					arg0 -= local48 * arg4;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg3 -= arg2 * local31;
					arg2 = 0;
				}
				if (arg4 != arg2 && local1 > local48 || arg4 == arg2 && local31 < local48) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt2865 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg3 >> 16, arg0 >> 16, arg4);
								arg3 += local31;
								arg4 += this.anInt2865;
								arg0 += local48;
							}
						}
						Static363.method2336(this.aByteArray55, arg1 >> 16, arg0 >> 16, arg4);
						arg1 += local1;
						arg4 += this.anInt2865;
						arg0 += local48;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt2865;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg0 >> 16, arg3 >> 16, arg4);
								arg0 += local48;
								arg4 += this.anInt2865;
								arg3 += local31;
							}
						}
						Static363.method2336(this.aByteArray55, arg0 >> 16, arg1 >> 16, arg4);
						arg1 += local1;
						arg0 += local48;
						arg4 += this.anInt2865;
					}
				}
			}
		} else if (arg5 < arg2) {
			if (arg4 < arg2) {
				arg3 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local31 * arg5;
					arg0 -= local48 * arg5;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local1;
					arg4 = 0;
				}
				if (local31 >= local48) {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt2865;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg3 >> 16, arg1 >> 16, arg5);
								arg1 += local1;
								arg3 += local31;
								arg5 += this.anInt2865;
							}
						}
						Static363.method2336(this.aByteArray55, arg3 >> 16, arg0 >> 16, arg5);
						arg5 += this.anInt2865;
						arg0 += local48;
						arg3 += local31;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt2865 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg1 >> 16, arg3 >> 16, arg5);
								arg5 += this.anInt2865;
								arg1 += local1;
								arg3 += local31;
							}
						}
						Static363.method2336(this.aByteArray55, arg0 >> 16, arg3 >> 16, arg5);
						arg0 += local48;
						arg5 += this.anInt2865;
						arg3 += local31;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local31;
					arg0 -= local48 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg3 -= arg2 * local1;
					arg2 = 0;
				}
				if (local48 > local31) {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt2865 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg0 >> 16, arg3 >> 16, arg5);
								arg5 += this.anInt2865;
								arg3 += local1;
								arg0 += local48;
							}
						}
						Static363.method2336(this.aByteArray55, arg0 >> 16, arg1 >> 16, arg5);
						arg1 += local31;
						arg5 += this.anInt2865;
						arg0 += local48;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt2865;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static363.method2336(this.aByteArray55, arg3 >> 16, arg0 >> 16, arg5);
								arg5 += this.anInt2865;
								arg3 += local1;
								arg0 += local48;
							}
						}
						Static363.method2336(this.aByteArray55, arg1 >> 16, arg0 >> 16, arg5);
						arg5 += this.anInt2865;
						arg1 += local31;
						arg0 += local48;
					}
				}
			}
		} else if (arg5 >= arg4) {
			arg0 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local31 * arg2;
				arg0 -= arg2 * local1;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= local48 * arg4;
				arg4 = 0;
			}
			if (local31 > local1) {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt2865 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static363.method2336(this.aByteArray55, arg3 >> 16, arg1 >> 16, arg2);
							arg3 += local31;
							arg1 += local48;
							arg2 += this.anInt2865;
						}
					}
					Static363.method2336(this.aByteArray55, arg3 >> 16, arg0 >> 16, arg2);
					arg3 += local31;
					arg0 += local1;
					arg2 += this.anInt2865;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt2865 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static363.method2336(this.aByteArray55, arg1 >> 16, arg3 >> 16, arg2);
							arg1 += local48;
							arg3 += local31;
							arg2 += this.anInt2865;
						}
					}
					Static363.method2336(this.aByteArray55, arg0 >> 16, arg3 >> 16, arg2);
					arg0 += local1;
					arg3 += local31;
					arg2 += this.anInt2865;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local31;
				arg1 -= local1 * arg2;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local48;
				arg5 = 0;
			}
			if (arg5 != arg2 && local31 > local1 || arg5 == arg2 && local48 < local1) {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt2865;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static363.method2336(this.aByteArray55, arg0 >> 16, arg1 >> 16, arg2);
							arg2 += this.anInt2865;
							arg1 += local1;
							arg0 += local48;
						}
					}
					Static363.method2336(this.aByteArray55, arg3 >> 16, arg1 >> 16, arg2);
					arg2 += this.anInt2865;
					arg3 += local31;
					arg1 += local1;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt2865 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static363.method2336(this.aByteArray55, arg1 >> 16, arg0 >> 16, arg2);
							arg1 += local1;
							arg2 += this.anInt2865;
							arg0 += local48;
						}
					}
					Static363.method2336(this.aByteArray55, arg1 >> 16, arg3 >> 16, arg2);
					arg3 += local31;
					arg1 += local1;
					arg2 += this.anInt2865;
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)V")
	public void method2337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2864 = arg2;
		this.anInt2866 = arg3;
		this.anInt2867 = arg1 - arg2;
		this.anInt2865 = arg0 - arg3;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(B)V")
	public void method2338() {
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
		while (this.aByteArray55.length - 1 > local1) {
			local1++;
			this.aByteArray55[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z")
	public boolean method2339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray55.length;
	}
}
