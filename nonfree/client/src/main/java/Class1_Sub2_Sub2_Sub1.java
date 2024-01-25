import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!be", name = "z", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "[B")
	public final byte[] aByteArray10;

	static {
		new Class45("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!bda;II)V")
	public Class1_Sub2_Sub2_Sub1(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray10 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)Z")
	public boolean method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray10.length;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIB)V")
	public void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1043 = arg1 - arg0;
		this.anInt1044 = arg0;
		this.anInt1041 = arg3 - arg2;
		this.anInt1048 = arg2;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
	public void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = 0;
		if (arg0 != arg4) {
			local12 = (arg1 - arg5 << 16) / (arg4 - arg0);
		}
		@Pc(33) int local33 = 0;
		if (arg4 != arg2) {
			local33 = (arg3 - arg1 << 16) / (arg2 - arg4);
		}
		@Pc(50) int local50 = 0;
		if (arg2 != arg0) {
			local50 = (arg5 - arg3 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg4 && arg0 <= arg2) {
			if (arg4 < arg2) {
				arg3 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local50;
					arg5 -= arg0 * local12;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local33;
					arg4 = 0;
				}
				if (arg0 != arg4 && local12 > local50 || arg4 == arg0 && local33 < local50) {
					arg2 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt1043 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static405.method6455(arg3 >> 16, arg0, arg1 >> 16, this.aByteArray10);
								arg3 += local50;
								arg0 += this.anInt1043;
								arg1 += local33;
							}
						}
						Static405.method6455(arg3 >> 16, arg0, arg5 >> 16, this.aByteArray10);
						arg5 += local12;
						arg3 += local50;
						arg0 += this.anInt1043;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt1043;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static405.method6455(arg1 >> 16, arg0, arg3 >> 16, this.aByteArray10);
								arg3 += local50;
								arg0 += this.anInt1043;
								arg1 += local33;
							}
						}
						Static405.method6455(arg5 >> 16, arg0, arg3 >> 16, this.aByteArray10);
						arg0 += this.anInt1043;
						arg3 += local50;
						arg5 += local12;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local50 * arg0;
					arg5 -= local12 * arg0;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg3 -= local33 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local12 <= local50) && (arg2 != arg0 || local33 <= local12)) {
					arg4 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt1043;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static405.method6455(arg5 >> 16, arg0, arg3 >> 16, this.aByteArray10);
								arg3 += local33;
								arg5 += local12;
								arg0 += this.anInt1043;
							}
						}
						Static405.method6455(arg5 >> 16, arg0, arg1 >> 16, this.aByteArray10);
						arg5 += local12;
						arg0 += this.anInt1043;
						arg1 += local50;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt1043;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static405.method6455(arg3 >> 16, arg0, arg5 >> 16, this.aByteArray10);
								arg5 += local12;
								arg0 += this.anInt1043;
								arg3 += local33;
							}
						}
						Static405.method6455(arg1 >> 16, arg0, arg5 >> 16, this.aByteArray10);
						arg1 += local50;
						arg0 += this.anInt1043;
						arg5 += local12;
					}
				}
			}
		} else if (arg2 >= arg4) {
			if (arg2 >= arg0) {
				arg3 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local33 * arg4;
					arg3 -= arg4 * local12;
					arg4 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local50;
					arg0 = 0;
				}
				if (local33 > local12) {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt1043;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static405.method6455(arg5 >> 16, arg4, arg1 >> 16, this.aByteArray10);
								arg1 += local33;
								arg4 += this.anInt1043;
								arg5 += local50;
							}
						}
						Static405.method6455(arg3 >> 16, arg4, arg1 >> 16, this.aByteArray10);
						arg1 += local33;
						arg3 += local12;
						arg4 += this.anInt1043;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt1043;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static405.method6455(arg1 >> 16, arg4, arg5 >> 16, this.aByteArray10);
								arg4 += this.anInt1043;
								arg1 += local33;
								arg5 += local50;
							}
						}
						Static405.method6455(arg1 >> 16, arg4, arg3 >> 16, this.aByteArray10);
						arg1 += local33;
						arg3 += local12;
						arg4 += this.anInt1043;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local33 * arg4;
					arg5 -= local12 * arg4;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg3 -= local50 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg4 || local12 >= local33) && (arg4 != arg2 || local12 <= local50)) {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt1043;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static405.method6455(arg3 >> 16, arg4, arg5 >> 16, this.aByteArray10);
								arg3 += local50;
								arg4 += this.anInt1043;
								arg5 += local12;
							}
						}
						Static405.method6455(arg1 >> 16, arg4, arg5 >> 16, this.aByteArray10);
						arg4 += this.anInt1043;
						arg5 += local12;
						arg1 += local33;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt1043 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static405.method6455(arg5 >> 16, arg4, arg3 >> 16, this.aByteArray10);
								arg3 += local50;
								arg4 += this.anInt1043;
								arg5 += local12;
							}
						}
						Static405.method6455(arg5 >> 16, arg4, arg1 >> 16, this.aByteArray10);
						arg4 += this.anInt1043;
						arg1 += local33;
						arg5 += local12;
					}
				}
			}
		} else if (arg4 <= arg0) {
			arg5 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local50;
				arg5 -= arg2 * local33;
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg1 -= local12 * arg4;
				arg4 = 0;
			}
			if (local33 < local50) {
				arg0 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt1043;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static405.method6455(arg1 >> 16, arg2, arg3 >> 16, this.aByteArray10);
							arg1 += local12;
							arg2 += this.anInt1043;
							arg3 += local50;
						}
					}
					Static405.method6455(arg5 >> 16, arg2, arg3 >> 16, this.aByteArray10);
					arg2 += this.anInt1043;
					arg3 += local50;
					arg5 += local33;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt1043 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static405.method6455(arg3 >> 16, arg2, arg1 >> 16, this.aByteArray10);
							arg1 += local12;
							arg2 += this.anInt1043;
							arg3 += local50;
						}
					}
					Static405.method6455(arg3 >> 16, arg2, arg5 >> 16, this.aByteArray10);
					arg5 += local33;
					arg2 += this.anInt1043;
					arg3 += local50;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local33;
				arg3 -= arg2 * local50;
				arg2 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local12 * arg0;
				arg0 = 0;
			}
			if (local33 >= local50) {
				arg4 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt1043;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static405.method6455(arg5 >> 16, arg2, arg1 >> 16, this.aByteArray10);
							arg1 += local33;
							arg5 += local12;
							arg2 += this.anInt1043;
						}
					}
					Static405.method6455(arg3 >> 16, arg2, arg1 >> 16, this.aByteArray10);
					arg2 += this.anInt1043;
					arg3 += local50;
					arg1 += local33;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg2;
				arg2 = this.anInt1043 * arg2;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static405.method6455(arg1 >> 16, arg2, arg5 >> 16, this.aByteArray10);
							arg2 += this.anInt1043;
							arg1 += local33;
							arg5 += local12;
						}
					}
					Static405.method6455(arg1 >> 16, arg2, arg3 >> 16, this.aByteArray10);
					arg1 += local33;
					arg2 += this.anInt1043;
					arg3 += local50;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method1060() {
		@Pc(17) int local17 = -1;
		@Pc(23) int local23 = this.aByteArray10.length - 8;
		while (local23 > local17) {
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
			local17++;
			this.aByteArray10[local17] = 0;
		}
		while (local17 < this.aByteArray10.length - 1) {
			local17++;
			this.aByteArray10[local17] = 0;
		}
	}
}
