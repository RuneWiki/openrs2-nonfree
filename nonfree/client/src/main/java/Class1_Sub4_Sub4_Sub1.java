import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub4_Sub4_Sub1 extends Class1_Sub4_Sub4 {

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
	public int anInt1064;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
	public int anInt1065;

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	public int anInt1066;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ks;II)V")
	public Class1_Sub4_Sub4_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray19 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
	public void method1022() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray19.length - 8;
		while (local7 > local1) {
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
			local1++;
			this.aByteArray19[local1] = 0;
		}
		while (local1 < this.aByteArray19.length - 1) {
			local1++;
			this.aByteArray19[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
	public void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = 0;
		if (arg1 != arg2) {
			local9 = (arg4 - arg3 << 16) / (arg2 - arg1);
		}
		@Pc(29) int local29 = 0;
		if (arg5 != arg2) {
			local29 = (arg0 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(49) int local49 = 0;
		if (arg1 != arg5) {
			local49 = (arg3 - arg0 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg2 && arg5 >= arg1) {
			if (arg5 <= arg2) {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local49 * arg1;
					arg3 -= local9 * arg1;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg0 -= arg5 * local29;
					arg5 = 0;
				}
				if (arg1 != arg5 && local9 > local49 || arg5 == arg1 && local29 > local9) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt1065 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static369.method1024(arg1, arg3 >> 16, arg0 >> 16, this.aByteArray19);
								arg1 += this.anInt1065;
								arg0 += local29;
								arg3 += local9;
							}
						}
						Static369.method1024(arg1, arg3 >> 16, arg4 >> 16, this.aByteArray19);
						arg1 += this.anInt1065;
						arg3 += local9;
						arg4 += local49;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt1065 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static369.method1024(arg1, arg0 >> 16, arg3 >> 16, this.aByteArray19);
								arg0 += local29;
								arg1 += this.anInt1065;
								arg3 += local9;
							}
						}
						Static369.method1024(arg1, arg4 >> 16, arg3 >> 16, this.aByteArray19);
						arg3 += local9;
						arg1 += this.anInt1065;
						arg4 += local49;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local9;
					arg0 -= arg1 * local49;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg4 -= local29 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local9 > local49 || arg2 == arg1 && local29 < local49) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt1065 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static369.method1024(arg1, arg4 >> 16, arg0 >> 16, this.aByteArray19);
								arg1 += this.anInt1065;
								arg4 += local29;
								arg0 += local49;
							}
						}
						Static369.method1024(arg1, arg3 >> 16, arg0 >> 16, this.aByteArray19);
						arg3 += local9;
						arg0 += local49;
						arg1 += this.anInt1065;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt1065;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static369.method1024(arg1, arg0 >> 16, arg4 >> 16, this.aByteArray19);
								arg4 += local29;
								arg1 += this.anInt1065;
								arg0 += local49;
							}
						}
						Static369.method1024(arg1, arg0 >> 16, arg3 >> 16, this.aByteArray19);
						arg1 += this.anInt1065;
						arg3 += local9;
						arg0 += local49;
					}
				}
			}
		} else if (arg5 < arg2) {
			if (arg1 >= arg2) {
				arg3 = arg0 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local49 * arg5;
					arg3 -= local29 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local9;
					arg2 = 0;
				}
				if (local49 > local29) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt1065;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static369.method1024(arg5, arg0 >> 16, arg4 >> 16, this.aByteArray19);
								arg0 += local49;
								arg5 += this.anInt1065;
								arg4 += local9;
							}
						}
						Static369.method1024(arg5, arg0 >> 16, arg3 >> 16, this.aByteArray19);
						arg3 += local29;
						arg5 += this.anInt1065;
						arg0 += local49;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt1065 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static369.method1024(arg5, arg4 >> 16, arg0 >> 16, this.aByteArray19);
								arg0 += local49;
								arg5 += this.anInt1065;
								arg4 += local9;
							}
						}
						Static369.method1024(arg5, arg3 >> 16, arg0 >> 16, this.aByteArray19);
						arg3 += local29;
						arg0 += local49;
						arg5 += this.anInt1065;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local49;
					arg4 -= arg5 * local29;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg3 -= local9 * arg1;
					arg1 = 0;
				}
				if (local49 > local29) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt1065 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static369.method1024(arg5, arg3 >> 16, arg4 >> 16, this.aByteArray19);
								arg5 += this.anInt1065;
								arg4 += local29;
								arg3 += local9;
							}
						}
						Static369.method1024(arg5, arg0 >> 16, arg4 >> 16, this.aByteArray19);
						arg4 += local29;
						arg5 += this.anInt1065;
						arg0 += local49;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt1065;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static369.method1024(arg5, arg4 >> 16, arg3 >> 16, this.aByteArray19);
								arg4 += local29;
								arg5 += this.anInt1065;
								arg3 += local9;
							}
						}
						Static369.method1024(arg5, arg4 >> 16, arg0 >> 16, this.aByteArray19);
						arg5 += this.anInt1065;
						arg0 += local49;
						arg4 += local29;
					}
				}
			}
		} else if (arg1 <= arg5) {
			arg0 = arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local29 * arg2;
				arg0 -= arg2 * local9;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local49;
				arg1 = 0;
			}
			if (local29 <= local9) {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt1065 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static369.method1024(arg2, arg3 >> 16, arg4 >> 16, this.aByteArray19);
							arg4 += local29;
							arg3 += local49;
							arg2 += this.anInt1065;
						}
					}
					Static369.method1024(arg2, arg0 >> 16, arg4 >> 16, this.aByteArray19);
					arg4 += local29;
					arg0 += local9;
					arg2 += this.anInt1065;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt1065 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static369.method1024(arg2, arg4 >> 16, arg3 >> 16, this.aByteArray19);
							arg2 += this.anInt1065;
							arg4 += local29;
							arg3 += local49;
						}
					}
					Static369.method1024(arg2, arg4 >> 16, arg0 >> 16, this.aByteArray19);
					arg4 += local29;
					arg0 += local9;
					arg2 += this.anInt1065;
				}
			}
		} else {
			arg3 = arg4 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local9 * arg2;
				arg4 -= arg2 * local29;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= local49 * arg5;
				arg5 = 0;
			}
			if (arg2 != arg5 && local9 < local29 || arg5 == arg2 && local9 > local49) {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt1065 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static369.method1024(arg2, arg0 >> 16, arg3 >> 16, this.aByteArray19);
							arg2 += this.anInt1065;
							arg3 += local9;
							arg0 += local49;
						}
					}
					Static369.method1024(arg2, arg4 >> 16, arg3 >> 16, this.aByteArray19);
					arg2 += this.anInt1065;
					arg3 += local9;
					arg4 += local29;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt1065 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static369.method1024(arg2, arg3 >> 16, arg0 >> 16, this.aByteArray19);
							arg2 += this.anInt1065;
							arg0 += local49;
							arg3 += local9;
						}
					}
					Static369.method1024(arg2, arg3 >> 16, arg4 >> 16, this.aByteArray19);
					arg4 += local29;
					arg3 += local9;
					arg2 += this.anInt1065;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIB)Z")
	public boolean method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray19.length;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
	public void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1063 = arg2;
		this.anInt1064 = arg0 - arg3;
		this.anInt1065 = arg1 - arg2;
		this.anInt1066 = arg3;
	}
}
