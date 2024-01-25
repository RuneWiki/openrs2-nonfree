import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class2_Sub2_Sub8_Sub2 extends Class2_Sub2_Sub8 {

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
	public int anInt8964;

	@OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
	public int anInt8965;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
	public int anInt8966;

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
	public int anInt8968;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!uca;II)V")
	public Class2_Sub2_Sub8_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray96 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIZ)V")
	public void method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8965 = arg2;
		this.anInt8968 = arg3 - arg2;
		this.anInt8966 = arg0;
		this.anInt8964 = arg1 - arg0;
	}

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "(I)V")
	public void method7145() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray96.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
			local7++;
			this.aByteArray96[local7] = 0;
		}
		while (local7 < this.aByteArray96.length - 1) {
			local7++;
			this.aByteArray96[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)Z")
	public boolean method7146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray96.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIIIIII)V")
	public void method7147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg2 != arg1) {
			local11 = (arg0 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(28) int local28 = 0;
		if (arg2 != arg3) {
			local28 = (arg5 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(49) int local49 = 0;
		if (arg1 != arg3) {
			local49 = (arg4 - arg5 << 16) / (arg1 - arg3);
		}
		if (arg2 >= arg1 && arg3 >= arg1) {
			if (arg2 < arg3) {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local11 * arg1;
					arg5 -= arg1 * local49;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local28 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local11 > local49 || arg1 == arg2 && local28 < local49) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt8964 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static456.method5934(arg0 >> 16, arg1, arg5 >> 16, this.aByteArray96);
								arg5 += local49;
								arg1 += this.anInt8964;
								arg0 += local28;
							}
						}
						Static456.method5934(arg4 >> 16, arg1, arg5 >> 16, this.aByteArray96);
						arg5 += local49;
						arg4 += local11;
						arg1 += this.anInt8964;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt8964;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static456.method5934(arg5 >> 16, arg1, arg0 >> 16, this.aByteArray96);
								arg5 += local49;
								arg0 += local28;
								arg1 += this.anInt8964;
							}
						}
						Static456.method5934(arg5 >> 16, arg1, arg4 >> 16, this.aByteArray96);
						arg1 += this.anInt8964;
						arg5 += local49;
						arg4 += local11;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local49;
					arg4 -= arg1 * local11;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local28 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg1 || local49 >= local11) && (arg1 != arg3 || local11 >= local28)) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt8964 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static456.method5934(arg5 >> 16, arg1, arg4 >> 16, this.aByteArray96);
								arg1 += this.anInt8964;
								arg4 += local11;
								arg5 += local28;
							}
						}
						Static456.method5934(arg0 >> 16, arg1, arg4 >> 16, this.aByteArray96);
						arg4 += local11;
						arg0 += local49;
						arg1 += this.anInt8964;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt8964;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static456.method5934(arg4 >> 16, arg1, arg5 >> 16, this.aByteArray96);
								arg1 += this.anInt8964;
								arg4 += local11;
								arg5 += local28;
							}
						}
						Static456.method5934(arg4 >> 16, arg1, arg0 >> 16, this.aByteArray96);
						arg4 += local11;
						arg0 += local49;
						arg1 += this.anInt8964;
					}
				}
			}
		} else if (arg3 >= arg2) {
			if (arg1 > arg3) {
				arg4 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local28;
					arg4 -= local11 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local49;
					arg3 = 0;
				}
				if (arg3 != arg2 && local28 > local11 || arg2 == arg3 && local49 < local11) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt8964;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static456.method5934(arg5 >> 16, arg2, arg4 >> 16, this.aByteArray96);
								arg5 += local49;
								arg2 += this.anInt8964;
								arg4 += local11;
							}
						}
						Static456.method5934(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray96);
						arg0 += local28;
						arg4 += local11;
						arg2 += this.anInt8964;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt8964;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static456.method5934(arg4 >> 16, arg2, arg5 >> 16, this.aByteArray96);
								arg2 += this.anInt8964;
								arg5 += local49;
								arg4 += local11;
							}
						}
						Static456.method5934(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray96);
						arg4 += local11;
						arg0 += local28;
						arg2 += this.anInt8964;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local11;
					arg0 -= arg2 * local28;
					arg2 = 0;
				}
				if (arg1 < 0) {
					arg4 -= local49 * arg1;
					arg1 = 0;
				}
				if (local11 < local28) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt8964 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static456.method5934(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray96);
								arg0 += local28;
								arg4 += local49;
								arg2 += this.anInt8964;
							}
						}
						Static456.method5934(arg0 >> 16, arg2, arg5 >> 16, this.aByteArray96);
						arg2 += this.anInt8964;
						arg5 += local11;
						arg0 += local28;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt8964 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static456.method5934(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray96);
								arg0 += local28;
								arg4 += local49;
								arg2 += this.anInt8964;
							}
						}
						Static456.method5934(arg5 >> 16, arg2, arg0 >> 16, this.aByteArray96);
						arg2 += this.anInt8964;
						arg0 += local28;
						arg5 += local11;
					}
				}
			}
		} else if (arg2 > arg1) {
			arg0 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= arg3 * local28;
				arg5 -= local49 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local11;
				arg1 = 0;
			}
			if (local49 <= local28) {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt8964 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static456.method5934(arg0 >> 16, arg3, arg4 >> 16, this.aByteArray96);
							arg3 += this.anInt8964;
							arg4 += local11;
							arg0 += local28;
						}
					}
					Static456.method5934(arg0 >> 16, arg3, arg5 >> 16, this.aByteArray96);
					arg5 += local49;
					arg0 += local28;
					arg3 += this.anInt8964;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt8964 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static456.method5934(arg4 >> 16, arg3, arg0 >> 16, this.aByteArray96);
							arg4 += local11;
							arg3 += this.anInt8964;
							arg0 += local28;
						}
					}
					Static456.method5934(arg5 >> 16, arg3, arg0 >> 16, this.aByteArray96);
					arg3 += this.anInt8964;
					arg5 += local49;
					arg0 += local28;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local49;
				arg4 -= arg3 * local28;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local11;
				arg2 = 0;
			}
			if (local28 >= local49) {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt8964;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static456.method5934(arg0 >> 16, arg3, arg5 >> 16, this.aByteArray96);
							arg0 += local11;
							arg3 += this.anInt8964;
							arg5 += local49;
						}
					}
					Static456.method5934(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray96);
					arg5 += local49;
					arg3 += this.anInt8964;
					arg4 += local28;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt8964;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static456.method5934(arg5 >> 16, arg3, arg0 >> 16, this.aByteArray96);
							arg0 += local11;
							arg3 += this.anInt8964;
							arg5 += local49;
						}
					}
					Static456.method5934(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray96);
					arg4 += local28;
					arg5 += local49;
					arg3 += this.anInt8964;
				}
			}
		}
	}
}
