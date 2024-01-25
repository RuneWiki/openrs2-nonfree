import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class5_Sub5_Sub4_Sub1 extends Class5_Sub5_Sub4 {

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
	public int anInt2908;

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ffa;II)V")
	public Class5_Sub5_Sub4_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray14 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
	public void method2482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2903 = arg1;
		this.anInt2905 = arg2 - arg1;
		this.anInt2908 = arg3;
		this.anInt2902 = arg0 - arg3;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIBII)V")
	public void method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = 0;
		if (arg3 != arg0) {
			local14 = (arg5 - arg4 << 16) / (arg0 - arg3);
		}
		@Pc(30) int local30 = 0;
		if (arg0 != arg2) {
			local30 = (arg1 - arg5 << 16) / (arg2 - arg0);
		}
		@Pc(51) int local51 = 0;
		if (arg3 != arg2) {
			local51 = (arg4 - arg1 << 16) / (arg3 - arg2);
		}
		if (arg3 <= arg0 && arg2 >= arg3) {
			if (arg0 >= arg2) {
				arg5 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local14;
					arg5 -= local51 * arg3;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local30 * arg2;
					arg2 = 0;
				}
				if (arg2 != arg3 && local14 > local51 || arg3 == arg2 && local14 < local30) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt2905;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static325.method4952(arg1 >> 16, arg4 >> 16, this.aByteArray14, arg3);
								arg1 += local30;
								arg4 += local14;
								arg3 += this.anInt2905;
							}
						}
						Static325.method4952(arg5 >> 16, arg4 >> 16, this.aByteArray14, arg3);
						arg5 += local51;
						arg3 += this.anInt2905;
						arg4 += local14;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt2905;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static325.method4952(arg4 >> 16, arg1 >> 16, this.aByteArray14, arg3);
								arg4 += local14;
								arg3 += this.anInt2905;
								arg1 += local30;
							}
						}
						Static325.method4952(arg4 >> 16, arg5 >> 16, this.aByteArray14, arg3);
						arg4 += local14;
						arg3 += this.anInt2905;
						arg5 += local51;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local51 * arg3;
					arg4 -= local14 * arg3;
					arg3 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local30;
					arg0 = 0;
				}
				if ((arg0 == arg3 || local51 >= local14) && (arg0 != arg3 || local30 >= local51)) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt2905;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static325.method4952(arg5 >> 16, arg1 >> 16, this.aByteArray14, arg3);
								arg1 += local51;
								arg5 += local30;
								arg3 += this.anInt2905;
							}
						}
						Static325.method4952(arg4 >> 16, arg1 >> 16, this.aByteArray14, arg3);
						arg4 += local14;
						arg3 += this.anInt2905;
						arg1 += local51;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt2905 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static325.method4952(arg1 >> 16, arg5 >> 16, this.aByteArray14, arg3);
								arg5 += local30;
								arg1 += local51;
								arg3 += this.anInt2905;
							}
						}
						Static325.method4952(arg1 >> 16, arg4 >> 16, this.aByteArray14, arg3);
						arg1 += local51;
						arg4 += local14;
						arg3 += this.anInt2905;
					}
				}
			}
		} else if (arg0 > arg2) {
			if (arg3 >= arg0) {
				arg4 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local51;
					arg4 -= local30 * arg2;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local14;
					arg0 = 0;
				}
				if (local30 < local51) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt2905 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static325.method4952(arg5 >> 16, arg1 >> 16, this.aByteArray14, arg2);
								arg5 += local14;
								arg1 += local51;
								arg2 += this.anInt2905;
							}
						}
						Static325.method4952(arg4 >> 16, arg1 >> 16, this.aByteArray14, arg2);
						arg4 += local30;
						arg1 += local51;
						arg2 += this.anInt2905;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt2905 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static325.method4952(arg1 >> 16, arg5 >> 16, this.aByteArray14, arg2);
								arg5 += local14;
								arg1 += local51;
								arg2 += this.anInt2905;
							}
						}
						Static325.method4952(arg1 >> 16, arg4 >> 16, this.aByteArray14, arg2);
						arg4 += local30;
						arg2 += this.anInt2905;
						arg1 += local51;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local30 * arg2;
					arg1 -= arg2 * local51;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local14 * arg3;
					arg3 = 0;
				}
				if (local30 >= local51) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt2905;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static325.method4952(arg4 >> 16, arg5 >> 16, this.aByteArray14, arg2);
								arg2 += this.anInt2905;
								arg4 += local14;
								arg5 += local30;
							}
						}
						Static325.method4952(arg1 >> 16, arg5 >> 16, this.aByteArray14, arg2);
						arg5 += local30;
						arg2 += this.anInt2905;
						arg1 += local51;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt2905 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static325.method4952(arg5 >> 16, arg4 >> 16, this.aByteArray14, arg2);
								arg4 += local14;
								arg2 += this.anInt2905;
								arg5 += local30;
							}
						}
						Static325.method4952(arg5 >> 16, arg1 >> 16, this.aByteArray14, arg2);
						arg2 += this.anInt2905;
						arg5 += local30;
						arg1 += local51;
					}
				}
			}
		} else if (arg3 <= arg2) {
			arg1 = arg5 <<= 0x10;
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local14;
				arg5 -= local30 * arg0;
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg4 -= local51 * arg3;
				arg3 = 0;
			}
			if (local14 >= local30) {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt2905 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static325.method4952(arg5 >> 16, arg4 >> 16, this.aByteArray14, arg0);
							arg5 += local30;
							arg4 += local51;
							arg0 += this.anInt2905;
						}
					}
					Static325.method4952(arg5 >> 16, arg1 >> 16, this.aByteArray14, arg0);
					arg5 += local30;
					arg1 += local14;
					arg0 += this.anInt2905;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt2905;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static325.method4952(arg4 >> 16, arg5 >> 16, this.aByteArray14, arg0);
							arg0 += this.anInt2905;
							arg4 += local51;
							arg5 += local30;
						}
					}
					Static325.method4952(arg1 >> 16, arg5 >> 16, this.aByteArray14, arg0);
					arg1 += local14;
					arg0 += this.anInt2905;
					arg5 += local30;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local30 * arg0;
				arg4 -= arg0 * local14;
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg1 -= local51 * arg2;
				arg2 = 0;
			}
			if (arg2 != arg0 && local14 < local30 || arg0 == arg2 && local51 < local14) {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt2905 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static325.method4952(arg4 >> 16, arg1 >> 16, this.aByteArray14, arg0);
							arg0 += this.anInt2905;
							arg4 += local14;
							arg1 += local51;
						}
					}
					Static325.method4952(arg4 >> 16, arg5 >> 16, this.aByteArray14, arg0);
					arg5 += local30;
					arg4 += local14;
					arg0 += this.anInt2905;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt2905;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static325.method4952(arg1 >> 16, arg4 >> 16, this.aByteArray14, arg0);
							arg1 += local51;
							arg0 += this.anInt2905;
							arg4 += local14;
						}
					}
					Static325.method4952(arg5 >> 16, arg4 >> 16, this.aByteArray14, arg0);
					arg0 += this.anInt2905;
					arg4 += local14;
					arg5 += local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V")
	public void method2485() {
		@Pc(7) int local7 = -1;
		@Pc(21) int local21 = this.aByteArray14.length - 8;
		while (local21 > local7) {
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
			local7++;
			this.aByteArray14[local7] = 0;
		}
		while (this.aByteArray14.length - 1 > local7) {
			local7++;
			this.aByteArray14[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)Z")
	public boolean method2487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray14.length >= arg1 * arg0;
	}
}
