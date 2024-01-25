import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class6_Sub2_Sub18_Sub1 extends Class6_Sub2_Sub18 {

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	public int anInt8846;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	public int anInt8848;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	public int anInt8849;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	public int anInt8855;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "[B")
	public final byte[] aByteArray100;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ml;II)V")
	public Class6_Sub2_Sub18_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray100 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIII)V")
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8849 = arg1 - arg3;
		this.anInt8848 = arg3;
		this.anInt8846 = arg2 - arg0;
		this.anInt8855 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V")
	public void method7741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg4) {
			local7 = (arg3 - arg0 << 16) / (arg2 - arg4);
		}
		@Pc(22) int local22 = 0;
		if (arg2 != arg5) {
			local22 = (arg1 - arg3 << 16) / (arg5 - arg2);
		}
		@Pc(37) int local37 = 0;
		if (arg4 != arg5) {
			local37 = (arg0 - arg1 << 16) / (arg4 - arg5);
		}
		if (arg4 <= arg2 && arg5 >= arg4) {
			if (arg2 < arg5) {
				arg1 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local7;
					arg1 -= local37 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local22;
					arg2 = 0;
				}
				if (arg2 != arg4 && local37 < local7 || arg2 == arg4 && local37 > local22) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt8846;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static6.method58(arg4, this.aByteArray100, arg3 >> 16, arg1 >> 16);
								arg4 += this.anInt8846;
								arg1 += local37;
								arg3 += local22;
							}
						}
						Static6.method58(arg4, this.aByteArray100, arg0 >> 16, arg1 >> 16);
						arg0 += local7;
						arg1 += local37;
						arg4 += this.anInt8846;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt8846;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static6.method58(arg4, this.aByteArray100, arg1 >> 16, arg3 >> 16);
								arg4 += this.anInt8846;
								arg3 += local22;
								arg1 += local37;
							}
						}
						Static6.method58(arg4, this.aByteArray100, arg1 >> 16, arg0 >> 16);
						arg4 += this.anInt8846;
						arg0 += local7;
						arg1 += local37;
					}
				}
			} else {
				arg3 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local37;
					arg0 -= arg4 * local7;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg1 -= local22 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg4 || local37 >= local7) && (arg5 != arg4 || local7 >= local22)) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt8846 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static6.method58(arg4, this.aByteArray100, arg1 >> 16, arg0 >> 16);
								arg4 += this.anInt8846;
								arg0 += local7;
								arg1 += local22;
							}
						}
						Static6.method58(arg4, this.aByteArray100, arg3 >> 16, arg0 >> 16);
						arg3 += local37;
						arg4 += this.anInt8846;
						arg0 += local7;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8846;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static6.method58(arg4, this.aByteArray100, arg0 >> 16, arg1 >> 16);
								arg1 += local22;
								arg0 += local7;
								arg4 += this.anInt8846;
							}
						}
						Static6.method58(arg4, this.aByteArray100, arg0 >> 16, arg3 >> 16);
						arg3 += local37;
						arg0 += local7;
						arg4 += this.anInt8846;
					}
				}
			}
		} else if (arg2 > arg5) {
			if (arg4 >= arg2) {
				arg0 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local37;
					arg0 -= local22 * arg5;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local7 * arg2;
					arg2 = 0;
				}
				if (local37 <= local22) {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt8846 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static6.method58(arg5, this.aByteArray100, arg3 >> 16, arg1 >> 16);
								arg5 += this.anInt8846;
								arg1 += local37;
								arg3 += local7;
							}
						}
						Static6.method58(arg5, this.aByteArray100, arg0 >> 16, arg1 >> 16);
						arg1 += local37;
						arg5 += this.anInt8846;
						arg0 += local22;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt8846 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static6.method58(arg5, this.aByteArray100, arg1 >> 16, arg3 >> 16);
								arg3 += local7;
								arg5 += this.anInt8846;
								arg1 += local37;
							}
						}
						Static6.method58(arg5, this.aByteArray100, arg1 >> 16, arg0 >> 16);
						arg5 += this.anInt8846;
						arg1 += local37;
						arg0 += local22;
					}
				}
			} else {
				arg3 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local37 * arg5;
					arg3 -= arg5 * local22;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg0 -= local7 * arg4;
					arg4 = 0;
				}
				if (local22 >= local37) {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt8846 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static6.method58(arg5, this.aByteArray100, arg3 >> 16, arg0 >> 16);
								arg3 += local22;
								arg0 += local7;
								arg5 += this.anInt8846;
							}
						}
						Static6.method58(arg5, this.aByteArray100, arg3 >> 16, arg1 >> 16);
						arg5 += this.anInt8846;
						arg3 += local22;
						arg1 += local37;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt8846 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static6.method58(arg5, this.aByteArray100, arg0 >> 16, arg3 >> 16);
								arg5 += this.anInt8846;
								arg3 += local22;
								arg0 += local7;
							}
						}
						Static6.method58(arg5, this.aByteArray100, arg1 >> 16, arg3 >> 16);
						arg3 += local22;
						arg5 += this.anInt8846;
						arg1 += local37;
					}
				}
			}
		} else if (arg4 > arg5) {
			arg0 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local22 * arg2;
				arg0 -= arg2 * local7;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local37 * arg5;
				arg5 = 0;
			}
			if ((arg2 == arg5 || local7 >= local22) && (arg2 != arg5 || local7 <= local37)) {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt8846;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static6.method58(arg2, this.aByteArray100, arg0 >> 16, arg1 >> 16);
							arg1 += local37;
							arg0 += local7;
							arg2 += this.anInt8846;
						}
					}
					Static6.method58(arg2, this.aByteArray100, arg0 >> 16, arg3 >> 16);
					arg0 += local7;
					arg3 += local22;
					arg2 += this.anInt8846;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt8846;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static6.method58(arg2, this.aByteArray100, arg1 >> 16, arg0 >> 16);
							arg0 += local7;
							arg1 += local37;
							arg2 += this.anInt8846;
						}
					}
					Static6.method58(arg2, this.aByteArray100, arg3 >> 16, arg0 >> 16);
					arg2 += this.anInt8846;
					arg0 += local7;
					arg3 += local22;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local7;
				arg3 -= local22 * arg2;
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg0 -= arg4 * local37;
				arg4 = 0;
			}
			if (local22 <= local7) {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt8846;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static6.method58(arg2, this.aByteArray100, arg0 >> 16, arg3 >> 16);
							arg0 += local37;
							arg2 += this.anInt8846;
							arg3 += local22;
						}
					}
					Static6.method58(arg2, this.aByteArray100, arg1 >> 16, arg3 >> 16);
					arg3 += local22;
					arg2 += this.anInt8846;
					arg1 += local7;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt8846 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static6.method58(arg2, this.aByteArray100, arg3 >> 16, arg0 >> 16);
							arg2 += this.anInt8846;
							arg0 += local37;
							arg3 += local22;
						}
					}
					Static6.method58(arg2, this.aByteArray100, arg3 >> 16, arg1 >> 16);
					arg1 += local7;
					arg3 += local22;
					arg2 += this.anInt8846;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
	public void method7742() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray100.length - 8;
		while (local21 > local15) {
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
			local15++;
			this.aByteArray100[local15] = 0;
		}
		while (this.aByteArray100.length - 1 > local15) {
			local15++;
			this.aByteArray100[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Z")
	public boolean method7744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray100.length;
	}
}
