import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class3_Sub1_Sub6_Sub2 extends Class3_Sub1_Sub6 {

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
	public int anInt6107;

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
	public int anInt6112;

	@OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
	public int anInt6114;

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "[B")
	public final byte[] aByteArray65;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!eq;II)V")
	public Class3_Sub1_Sub6_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray65 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBI)Z")
	public boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray65.length;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
	public void method5192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6108 = arg1;
		this.anInt6107 = arg2;
		this.anInt6112 = arg0 - arg1;
		this.anInt6114 = arg3 - arg2;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V")
	public void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg1) {
			local7 = (arg2 - arg3 << 16) / (arg0 - arg1);
		}
		@Pc(30) int local30 = 0;
		if (arg0 != arg5) {
			local30 = (arg4 - arg2 << 16) / (arg5 - arg0);
		}
		@Pc(49) int local49 = 0;
		if (arg5 != arg1) {
			local49 = (arg3 - arg4 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg0 && arg1 <= arg5) {
			if (arg5 <= arg0) {
				arg2 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local49 * arg1;
					arg3 -= local7 * arg1;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg4 -= local30 * arg5;
					arg5 = 0;
				}
				if (arg1 != arg5 && local49 < local7 || arg1 == arg5 && local7 < local30) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt6114;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg3 >> 16, arg4 >> 16, arg1);
								arg4 += local30;
								arg1 += this.anInt6114;
								arg3 += local7;
							}
						}
						Static358.method5832(this.aByteArray65, arg3 >> 16, arg2 >> 16, arg1);
						arg1 += this.anInt6114;
						arg3 += local7;
						arg2 += local49;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6114 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg4 >> 16, arg3 >> 16, arg1);
								arg1 += this.anInt6114;
								arg4 += local30;
								arg3 += local7;
							}
						}
						Static358.method5832(this.aByteArray65, arg2 >> 16, arg3 >> 16, arg1);
						arg2 += local49;
						arg3 += local7;
						arg1 += this.anInt6114;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local49;
					arg3 -= local7 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg2 -= local30 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg1 || local49 >= local7) && (arg0 != arg1 || local49 <= local30)) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt6114 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg4 >> 16, arg2 >> 16, arg1);
								arg4 += local49;
								arg1 += this.anInt6114;
								arg2 += local30;
							}
						}
						Static358.method5832(this.aByteArray65, arg4 >> 16, arg3 >> 16, arg1);
						arg3 += local7;
						arg1 += this.anInt6114;
						arg4 += local49;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt6114;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg2 >> 16, arg4 >> 16, arg1);
								arg4 += local49;
								arg1 += this.anInt6114;
								arg2 += local30;
							}
						}
						Static358.method5832(this.aByteArray65, arg3 >> 16, arg4 >> 16, arg1);
						arg4 += local49;
						arg1 += this.anInt6114;
						arg3 += local7;
					}
				}
			}
		} else if (arg0 <= arg5) {
			if (arg1 <= arg5) {
				arg4 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local30;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local49;
					arg1 = 0;
				}
				if (local30 > local7) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt6114;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg2 >> 16, arg3 >> 16, arg0);
								arg0 += this.anInt6114;
								arg3 += local49;
								arg2 += local30;
							}
						}
						Static358.method5832(this.aByteArray65, arg2 >> 16, arg4 >> 16, arg0);
						arg2 += local30;
						arg4 += local7;
						arg0 += this.anInt6114;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt6114;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg3 >> 16, arg2 >> 16, arg0);
								arg2 += local30;
								arg0 += this.anInt6114;
								arg3 += local49;
							}
						}
						Static358.method5832(this.aByteArray65, arg4 >> 16, arg2 >> 16, arg0);
						arg2 += local30;
						arg4 += local7;
						arg0 += this.anInt6114;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local7 * arg0;
					arg2 -= local30 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local49;
					arg5 = 0;
				}
				if ((arg0 == arg5 || local30 <= local7) && (arg0 != arg5 || local49 >= local7)) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt6114 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg3 >> 16, arg4 >> 16, arg0);
								arg3 += local7;
								arg0 += this.anInt6114;
								arg4 += local49;
							}
						}
						Static358.method5832(this.aByteArray65, arg3 >> 16, arg2 >> 16, arg0);
						arg2 += local30;
						arg0 += this.anInt6114;
						arg3 += local7;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt6114 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static358.method5832(this.aByteArray65, arg4 >> 16, arg3 >> 16, arg0);
								arg0 += this.anInt6114;
								arg4 += local49;
								arg3 += local7;
							}
						}
						Static358.method5832(this.aByteArray65, arg2 >> 16, arg3 >> 16, arg0);
						arg2 += local30;
						arg3 += local7;
						arg0 += this.anInt6114;
					}
				}
			}
		} else if (arg0 > arg1) {
			arg2 = arg4 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local49 * arg5;
				arg2 -= local30 * arg5;
				arg5 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= local7 * arg1;
				arg1 = 0;
			}
			if (local49 <= local30) {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt6114 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static358.method5832(this.aByteArray65, arg2 >> 16, arg3 >> 16, arg5);
							arg5 += this.anInt6114;
							arg2 += local30;
							arg3 += local7;
						}
					}
					Static358.method5832(this.aByteArray65, arg2 >> 16, arg4 >> 16, arg5);
					arg4 += local49;
					arg2 += local30;
					arg5 += this.anInt6114;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt6114 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static358.method5832(this.aByteArray65, arg3 >> 16, arg2 >> 16, arg5);
							arg5 += this.anInt6114;
							arg2 += local30;
							arg3 += local7;
						}
					}
					Static358.method5832(this.aByteArray65, arg4 >> 16, arg2 >> 16, arg5);
					arg2 += local30;
					arg4 += local49;
					arg5 += this.anInt6114;
				}
			}
		} else {
			arg3 = arg4 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= arg5 * local30;
				arg4 -= arg5 * local49;
				arg5 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= local7 * arg0;
				arg0 = 0;
			}
			if (local49 <= local30) {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt6114 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static358.method5832(this.aByteArray65, arg2 >> 16, arg4 >> 16, arg5);
							arg2 += local7;
							arg4 += local49;
							arg5 += this.anInt6114;
						}
					}
					Static358.method5832(this.aByteArray65, arg3 >> 16, arg4 >> 16, arg5);
					arg3 += local30;
					arg4 += local49;
					arg5 += this.anInt6114;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt6114;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static358.method5832(this.aByteArray65, arg4 >> 16, arg2 >> 16, arg5);
							arg4 += local49;
							arg2 += local7;
							arg5 += this.anInt6114;
						}
					}
					Static358.method5832(this.aByteArray65, arg4 >> 16, arg3 >> 16, arg5);
					arg5 += this.anInt6114;
					arg3 += local30;
					arg4 += local49;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)V")
	public void method5195() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray65.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
			local7++;
			this.aByteArray65[local7] = 0;
		}
		while (local7 < this.aByteArray65.length - 1) {
			local7++;
			this.aByteArray65[local7] = 0;
		}
	}
}
