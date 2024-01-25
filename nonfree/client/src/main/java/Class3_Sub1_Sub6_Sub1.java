import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class3_Sub1_Sub6_Sub1 extends Class3_Sub1_Sub6 {

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[Lclient!wo;")
	public static final Class375[] aClass375Array1 = new Class375[5];

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
	public int anInt4902;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
	public int anInt4906;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	public int anInt4907;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
	public int anInt4908;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "[B")
	public final byte[] aByteArray46;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass375Array1.length; local6++) {
			aClass375Array1[local6] = new Class375();
		}
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!bm;II)V")
	public Class3_Sub1_Sub6_Sub1(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray46 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
	public void method4157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4902 = arg0 - arg1;
		this.anInt4908 = arg3 - arg2;
		this.anInt4906 = arg1;
		this.anInt4907 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIZI)V")
	public void method4158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg1) {
			local7 = (arg2 - arg5 << 16) / (arg3 - arg1);
		}
		@Pc(22) int local22 = 0;
		if (arg4 != arg3) {
			local22 = (arg0 - arg2 << 16) / (arg4 - arg3);
		}
		@Pc(44) int local44 = 0;
		if (arg1 != arg4) {
			local44 = (arg5 - arg0 << 16) / (arg1 - arg4);
		}
		if (arg3 >= arg1 && arg4 >= arg1) {
			if (arg3 < arg4) {
				arg0 = arg5 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local7;
					arg0 -= local44 * arg1;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg2 -= local22 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg1 && local44 < local7 || arg3 == arg1 && local44 > local22) {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt4902;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static92.method2448(arg0 >> 16, arg2 >> 16, this.aByteArray46, arg1);
								arg2 += local22;
								arg0 += local44;
								arg1 += this.anInt4902;
							}
						}
						Static92.method2448(arg0 >> 16, arg5 >> 16, this.aByteArray46, arg1);
						arg0 += local44;
						arg5 += local7;
						arg1 += this.anInt4902;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt4902 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static92.method2448(arg2 >> 16, arg0 >> 16, this.aByteArray46, arg1);
								arg0 += local44;
								arg2 += local22;
								arg1 += this.anInt4902;
							}
						}
						Static92.method2448(arg5 >> 16, arg0 >> 16, this.aByteArray46, arg1);
						arg1 += this.anInt4902;
						arg5 += local7;
						arg0 += local44;
					}
				}
			} else {
				arg2 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local44;
					arg5 -= arg1 * local7;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local22;
					arg4 = 0;
				}
				if ((arg4 == arg1 || local44 >= local7) && (arg1 != arg4 || local7 >= local22)) {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt4902;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static92.method2448(arg5 >> 16, arg0 >> 16, this.aByteArray46, arg1);
								arg1 += this.anInt4902;
								arg5 += local7;
								arg0 += local22;
							}
						}
						Static92.method2448(arg5 >> 16, arg2 >> 16, this.aByteArray46, arg1);
						arg1 += this.anInt4902;
						arg2 += local44;
						arg5 += local7;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt4902;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static92.method2448(arg0 >> 16, arg5 >> 16, this.aByteArray46, arg1);
								arg0 += local22;
								arg1 += this.anInt4902;
								arg5 += local7;
							}
						}
						Static92.method2448(arg2 >> 16, arg5 >> 16, this.aByteArray46, arg1);
						arg1 += this.anInt4902;
						arg5 += local7;
						arg2 += local44;
					}
				}
			}
		} else if (arg4 < arg3) {
			if (arg3 <= arg1) {
				arg5 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local22 * arg4;
					arg0 -= local44 * arg4;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local7 * arg3;
					arg3 = 0;
				}
				if (local44 <= local22) {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt4902 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static92.method2448(arg0 >> 16, arg2 >> 16, this.aByteArray46, arg4);
								arg2 += local7;
								arg4 += this.anInt4902;
								arg0 += local44;
							}
						}
						Static92.method2448(arg0 >> 16, arg5 >> 16, this.aByteArray46, arg4);
						arg0 += local44;
						arg4 += this.anInt4902;
						arg5 += local22;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt4902 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static92.method2448(arg2 >> 16, arg0 >> 16, this.aByteArray46, arg4);
								arg4 += this.anInt4902;
								arg2 += local7;
								arg0 += local44;
							}
						}
						Static92.method2448(arg5 >> 16, arg0 >> 16, this.aByteArray46, arg4);
						arg0 += local44;
						arg4 += this.anInt4902;
						arg5 += local22;
					}
				}
			} else {
				arg2 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local22 * arg4;
					arg0 -= arg4 * local44;
					arg4 = 0;
				}
				if (arg1 < 0) {
					arg5 -= local7 * arg1;
					arg1 = 0;
				}
				if (local22 < local44) {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt4902 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static92.method2448(arg2 >> 16, arg5 >> 16, this.aByteArray46, arg4);
								arg5 += local7;
								arg2 += local22;
								arg4 += this.anInt4902;
							}
						}
						Static92.method2448(arg2 >> 16, arg0 >> 16, this.aByteArray46, arg4);
						arg0 += local44;
						arg2 += local22;
						arg4 += this.anInt4902;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt4902 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static92.method2448(arg5 >> 16, arg2 >> 16, this.aByteArray46, arg4);
								arg2 += local22;
								arg5 += local7;
								arg4 += this.anInt4902;
							}
						}
						Static92.method2448(arg0 >> 16, arg2 >> 16, this.aByteArray46, arg4);
						arg2 += local22;
						arg4 += this.anInt4902;
						arg0 += local44;
					}
				}
			}
		} else if (arg4 >= arg1) {
			arg0 = arg2 <<= 0x10;
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local22 * arg3;
				arg0 -= arg3 * local7;
				arg3 = 0;
			}
			if (arg1 < 0) {
				arg5 -= arg1 * local44;
				arg1 = 0;
			}
			if (local22 <= local7) {
				arg4 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt4902;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static92.method2448(arg2 >> 16, arg5 >> 16, this.aByteArray46, arg3);
							arg5 += local44;
							arg2 += local22;
							arg3 += this.anInt4902;
						}
					}
					Static92.method2448(arg2 >> 16, arg0 >> 16, this.aByteArray46, arg3);
					arg2 += local22;
					arg0 += local7;
					arg3 += this.anInt4902;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt4902 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static92.method2448(arg5 >> 16, arg2 >> 16, this.aByteArray46, arg3);
							arg2 += local22;
							arg3 += this.anInt4902;
							arg5 += local44;
						}
					}
					Static92.method2448(arg0 >> 16, arg2 >> 16, this.aByteArray46, arg3);
					arg2 += local22;
					arg0 += local7;
					arg3 += this.anInt4902;
				}
			}
		} else {
			arg5 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local22;
				arg5 -= local7 * arg3;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local44 * arg4;
				arg4 = 0;
			}
			if (arg4 != arg3 && local22 > local7 || arg4 == arg3 && local44 < local7) {
				arg1 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt4902;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static92.method2448(arg5 >> 16, arg0 >> 16, this.aByteArray46, arg3);
							arg5 += local7;
							arg3 += this.anInt4902;
							arg0 += local44;
						}
					}
					Static92.method2448(arg5 >> 16, arg2 >> 16, this.aByteArray46, arg3);
					arg3 += this.anInt4902;
					arg5 += local7;
					arg2 += local22;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt4902;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static92.method2448(arg0 >> 16, arg5 >> 16, this.aByteArray46, arg3);
							arg0 += local44;
							arg3 += this.anInt4902;
							arg5 += local7;
						}
					}
					Static92.method2448(arg2 >> 16, arg5 >> 16, this.aByteArray46, arg3);
					arg3 += this.anInt4902;
					arg2 += local22;
					arg5 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z")
	public boolean method4162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray46.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	public void method4164() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray46.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
			local7++;
			this.aByteArray46[local7] = 0;
		}
		while (local7 < this.aByteArray46.length - 1) {
			local7++;
			this.aByteArray46[local7] = 0;
		}
	}
}
