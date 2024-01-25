import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class6_Sub2_Sub14_Sub2 extends Class6_Sub2_Sub14 {

	@OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
	public int anInt9051;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
	public int anInt9052;

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
	public int anInt9053;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
	public int anInt9058;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "[B")
	public final byte[] aByteArray114;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!jaa;II)V")
	public Class6_Sub2_Sub14_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray114 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIB)V")
	public void method7410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9058 = arg1;
		this.anInt9053 = arg3;
		this.anInt9051 = arg2 - arg1;
		this.anInt9052 = arg0 - arg3;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V")
	public void method7411() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray114.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
		}
		while (this.aByteArray114.length - 1 > local15) {
			local15++;
			this.aByteArray114[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIII)V")
	public void method7412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg0 != arg4) {
			local11 = (arg2 - arg3 << 16) / (arg0 - arg4);
		}
		@Pc(31) int local31 = 0;
		if (arg0 != arg5) {
			local31 = (arg1 - arg2 << 16) / (arg5 - arg0);
		}
		@Pc(48) int local48 = 0;
		if (arg4 != arg5) {
			local48 = (arg3 - arg1 << 16) / (arg4 - arg5);
		}
		if (arg4 <= arg0 && arg4 <= arg5) {
			if (arg0 >= arg5) {
				arg2 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local11;
					arg2 -= arg4 * local48;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local31 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg4 && local48 < local11 || arg4 == arg5 && local31 > local11) {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt9051;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg4, arg1 >> 16, arg3 >> 16);
								arg1 += local31;
								arg3 += local11;
								arg4 += this.anInt9051;
							}
						}
						Static95.method1725(this.aByteArray114, arg4, arg2 >> 16, arg3 >> 16);
						arg2 += local48;
						arg3 += local11;
						arg4 += this.anInt9051;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9051 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg4, arg3 >> 16, arg1 >> 16);
								arg3 += local11;
								arg1 += local31;
								arg4 += this.anInt9051;
							}
						}
						Static95.method1725(this.aByteArray114, arg4, arg3 >> 16, arg2 >> 16);
						arg3 += local11;
						arg2 += local48;
						arg4 += this.anInt9051;
					}
				}
			} else {
				arg1 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local48 * arg4;
					arg3 -= arg4 * local11;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local31;
					arg0 = 0;
				}
				if ((arg0 == arg4 || local48 >= local11) && (arg4 != arg0 || local48 <= local31)) {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt9051 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg4, arg2 >> 16, arg1 >> 16);
								arg4 += this.anInt9051;
								arg1 += local48;
								arg2 += local31;
							}
						}
						Static95.method1725(this.aByteArray114, arg4, arg3 >> 16, arg1 >> 16);
						arg4 += this.anInt9051;
						arg1 += local48;
						arg3 += local11;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt9051 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg4, arg1 >> 16, arg2 >> 16);
								arg1 += local48;
								arg2 += local31;
								arg4 += this.anInt9051;
							}
						}
						Static95.method1725(this.aByteArray114, arg4, arg1 >> 16, arg3 >> 16);
						arg3 += local11;
						arg4 += this.anInt9051;
						arg1 += local48;
					}
				}
			}
		} else if (arg0 <= arg5) {
			if (arg5 < arg4) {
				arg3 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local31 * arg0;
					arg3 -= local11 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local48 * arg5;
					arg5 = 0;
				}
				if (arg0 != arg5 && local31 > local11 || arg5 == arg0 && local11 > local48) {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt9051;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg0, arg3 >> 16, arg1 >> 16);
								arg1 += local48;
								arg0 += this.anInt9051;
								arg3 += local11;
							}
						}
						Static95.method1725(this.aByteArray114, arg0, arg3 >> 16, arg2 >> 16);
						arg0 += this.anInt9051;
						arg3 += local11;
						arg2 += local31;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt9051 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg0, arg1 >> 16, arg3 >> 16);
								arg0 += this.anInt9051;
								arg3 += local11;
								arg1 += local48;
							}
						}
						Static95.method1725(this.aByteArray114, arg0, arg2 >> 16, arg3 >> 16);
						arg3 += local11;
						arg2 += local31;
						arg0 += this.anInt9051;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local31 * arg0;
					arg1 -= local11 * arg0;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local48;
					arg4 = 0;
				}
				if (local11 >= local31) {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt9051;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg0, arg2 >> 16, arg3 >> 16);
								arg2 += local31;
								arg0 += this.anInt9051;
								arg3 += local48;
							}
						}
						Static95.method1725(this.aByteArray114, arg0, arg2 >> 16, arg1 >> 16);
						arg1 += local11;
						arg2 += local31;
						arg0 += this.anInt9051;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt9051;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static95.method1725(this.aByteArray114, arg0, arg3 >> 16, arg2 >> 16);
								arg3 += local48;
								arg2 += local31;
								arg0 += this.anInt9051;
							}
						}
						Static95.method1725(this.aByteArray114, arg0, arg1 >> 16, arg2 >> 16);
						arg0 += this.anInt9051;
						arg1 += local11;
						arg2 += local31;
					}
				}
			}
		} else if (arg0 <= arg4) {
			arg3 = arg1 <<= 0x10;
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local48 * arg5;
				arg3 -= arg5 * local31;
				arg5 = 0;
			}
			if (arg0 < 0) {
				arg2 -= arg0 * local11;
				arg0 = 0;
			}
			if (local31 >= local48) {
				arg4 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt9051 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static95.method1725(this.aByteArray114, arg5, arg1 >> 16, arg2 >> 16);
							arg1 += local48;
							arg2 += local11;
							arg5 += this.anInt9051;
						}
					}
					Static95.method1725(this.aByteArray114, arg5, arg1 >> 16, arg3 >> 16);
					arg3 += local31;
					arg5 += this.anInt9051;
					arg1 += local48;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt9051 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static95.method1725(this.aByteArray114, arg5, arg2 >> 16, arg1 >> 16);
							arg2 += local11;
							arg5 += this.anInt9051;
							arg1 += local48;
						}
					}
					Static95.method1725(this.aByteArray114, arg5, arg3 >> 16, arg1 >> 16);
					arg3 += local31;
					arg1 += local48;
					arg5 += this.anInt9051;
				}
			}
		} else {
			arg2 = arg1 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local31;
				arg1 -= local48 * arg5;
				arg5 = 0;
			}
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= local11 * arg4;
				arg4 = 0;
			}
			if (local31 >= local48) {
				arg0 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt9051 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static95.method1725(this.aByteArray114, arg5, arg3 >> 16, arg2 >> 16);
							arg3 += local11;
							arg5 += this.anInt9051;
							arg2 += local31;
						}
					}
					Static95.method1725(this.aByteArray114, arg5, arg1 >> 16, arg2 >> 16);
					arg5 += this.anInt9051;
					arg2 += local31;
					arg1 += local48;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt9051;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static95.method1725(this.aByteArray114, arg5, arg2 >> 16, arg3 >> 16);
							arg2 += local31;
							arg5 += this.anInt9051;
							arg3 += local11;
						}
					}
					Static95.method1725(this.aByteArray114, arg5, arg2 >> 16, arg1 >> 16);
					arg5 += this.anInt9051;
					arg2 += local31;
					arg1 += local48;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
	public boolean method7413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray114.length >= arg1 * arg0;
	}
}
