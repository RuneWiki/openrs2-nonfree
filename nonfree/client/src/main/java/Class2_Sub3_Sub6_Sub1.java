import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class2_Sub3_Sub6_Sub1 extends Class2_Sub3_Sub6 {

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
	public int anInt6817;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
	public int anInt6818;

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
	public int anInt6820;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
	public int anInt6826;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!en;II)V")
	public Class2_Sub3_Sub6_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray69 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V")
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6817 = arg3 - arg2;
		this.anInt6826 = arg0 - arg1;
		this.anInt6820 = arg1;
		this.anInt6818 = arg2;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
	public boolean method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray69.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	public void method5711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg5) {
			local7 = (arg4 - arg3 << 16) / (arg5 - arg1);
		}
		@Pc(33) int local33 = 0;
		if (arg5 != arg2) {
			local33 = (arg0 - arg4 << 16) / (arg2 - arg5);
		}
		@Pc(54) int local54 = 0;
		if (arg2 != arg1) {
			local54 = (arg3 - arg0 << 16) / (arg1 - arg2);
		}
		if (arg1 <= arg5 && arg1 <= arg2) {
			if (arg5 >= arg2) {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg4 -= local54 * arg1;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local33 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local7 > local54 || arg1 == arg2 && local7 < local33) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt6817 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static216.method3473(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray69);
								arg3 += local7;
								arg0 += local33;
								arg1 += this.anInt6817;
							}
						}
						Static216.method3473(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray69);
						arg1 += this.anInt6817;
						arg3 += local7;
						arg4 += local54;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt6817;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static216.method3473(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray69);
								arg3 += local7;
								arg1 += this.anInt6817;
								arg0 += local33;
							}
						}
						Static216.method3473(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray69);
						arg3 += local7;
						arg1 += this.anInt6817;
						arg4 += local54;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local7;
					arg0 -= local54 * arg1;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local33;
					arg5 = 0;
				}
				if ((arg1 == arg5 || local54 >= local7) && (arg1 != arg5 || local33 >= local54)) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6817 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static216.method3473(arg0 >> 16, arg1, arg4 >> 16, this.aByteArray69);
								arg0 += local54;
								arg1 += this.anInt6817;
								arg4 += local33;
							}
						}
						Static216.method3473(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray69);
						arg0 += local54;
						arg3 += local7;
						arg1 += this.anInt6817;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6817 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static216.method3473(arg4 >> 16, arg1, arg0 >> 16, this.aByteArray69);
								arg4 += local33;
								arg1 += this.anInt6817;
								arg0 += local54;
							}
						}
						Static216.method3473(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray69);
						arg0 += local54;
						arg1 += this.anInt6817;
						arg3 += local7;
					}
				}
			}
		} else if (arg5 <= arg2) {
			if (arg2 < arg1) {
				arg3 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local33;
					arg3 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local54;
					arg2 = 0;
				}
				if (arg2 != arg5 && local33 > local7 || arg2 == arg5 && local54 < local7) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt6817 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static216.method3473(arg0 >> 16, arg5, arg3 >> 16, this.aByteArray69);
								arg5 += this.anInt6817;
								arg3 += local7;
								arg0 += local54;
							}
						}
						Static216.method3473(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray69);
						arg5 += this.anInt6817;
						arg3 += local7;
						arg4 += local33;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt6817 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static216.method3473(arg3 >> 16, arg5, arg0 >> 16, this.aByteArray69);
								arg0 += local54;
								arg5 += this.anInt6817;
								arg3 += local7;
							}
						}
						Static216.method3473(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray69);
						arg3 += local7;
						arg5 += this.anInt6817;
						arg4 += local33;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local7 * arg5;
					arg4 -= local33 * arg5;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local54 * arg1;
					arg1 = 0;
				}
				if (local7 >= local33) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt6817;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static216.method3473(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray69);
								arg5 += this.anInt6817;
								arg3 += local54;
								arg4 += local33;
							}
						}
						Static216.method3473(arg0 >> 16, arg5, arg4 >> 16, this.aByteArray69);
						arg4 += local33;
						arg5 += this.anInt6817;
						arg0 += local7;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt6817 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static216.method3473(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray69);
								arg3 += local54;
								arg5 += this.anInt6817;
								arg4 += local33;
							}
						}
						Static216.method3473(arg4 >> 16, arg5, arg0 >> 16, this.aByteArray69);
						arg0 += local7;
						arg4 += local33;
						arg5 += this.anInt6817;
					}
				}
			}
		} else if (arg1 >= arg5) {
			arg3 = arg0 <<= 0x10;
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local33 * arg2;
				arg0 -= arg2 * local54;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg4 -= arg5 * local7;
				arg5 = 0;
			}
			if (local33 < local54) {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt6817 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static216.method3473(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray69);
							arg4 += local7;
							arg2 += this.anInt6817;
							arg0 += local54;
						}
					}
					Static216.method3473(arg0 >> 16, arg2, arg3 >> 16, this.aByteArray69);
					arg3 += local33;
					arg0 += local54;
					arg2 += this.anInt6817;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt6817 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static216.method3473(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray69);
							arg2 += this.anInt6817;
							arg4 += local7;
							arg0 += local54;
						}
					}
					Static216.method3473(arg3 >> 16, arg2, arg0 >> 16, this.aByteArray69);
					arg3 += local33;
					arg2 += this.anInt6817;
					arg0 += local54;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local54 * arg2;
				arg4 -= local33 * arg2;
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (local33 < local54) {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt6817 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static216.method3473(arg3 >> 16, arg2, arg4 >> 16, this.aByteArray69);
							arg4 += local33;
							arg2 += this.anInt6817;
							arg3 += local7;
						}
					}
					Static216.method3473(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray69);
					arg4 += local33;
					arg0 += local54;
					arg2 += this.anInt6817;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt6817 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static216.method3473(arg4 >> 16, arg2, arg3 >> 16, this.aByteArray69);
							arg3 += local7;
							arg4 += local33;
							arg2 += this.anInt6817;
						}
					}
					Static216.method3473(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray69);
					arg2 += this.anInt6817;
					arg0 += local54;
					arg4 += local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V")
	public void method5712() {
		@Pc(7) int local7 = -1;
		@Pc(18) int local18 = this.aByteArray69.length - 8;
		while (local18 > local7) {
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
		}
		while (this.aByteArray69.length - 1 > local7) {
			local7++;
			this.aByteArray69[local7] = 0;
		}
	}
}
