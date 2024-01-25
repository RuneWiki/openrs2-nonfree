import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class10_Sub1_Sub7_Sub1 extends Class10_Sub1_Sub7 {

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	public int anInt6635;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	public int anInt6636;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
	public int anInt6642;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	public int anInt6643;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!da;II)V")
	public Class10_Sub1_Sub7_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray86 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	public void method5198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6635 = arg2;
		this.anInt6643 = arg0 - arg1;
		this.anInt6642 = arg3 - arg2;
		this.anInt6636 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBIIIII)V")
	public void method5200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg1) {
			local7 = (arg2 - arg4 << 16) / (arg1 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg5 != arg1) {
			local24 = (arg3 - arg2 << 16) / (arg5 - arg1);
		}
		@Pc(44) int local44 = 0;
		if (arg5 != arg0) {
			local44 = (arg4 - arg3 << 16) / (arg0 - arg5);
		}
		if (arg0 <= arg1 && arg0 <= arg5) {
			if (arg1 < arg5) {
				arg3 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local7;
					arg3 -= local44 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local24 * arg1;
					arg1 = 0;
				}
				if (arg0 != arg1 && local7 > local44 || arg1 == arg0 && local44 > local24) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt6642 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg3 >> 16, arg2 >> 16, arg0);
								arg3 += local44;
								arg0 += this.anInt6642;
								arg2 += local24;
							}
						}
						Static268.method3929(this.aByteArray86, arg3 >> 16, arg4 >> 16, arg0);
						arg0 += this.anInt6642;
						arg3 += local44;
						arg4 += local7;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt6642;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg2 >> 16, arg3 >> 16, arg0);
								arg2 += local24;
								arg0 += this.anInt6642;
								arg3 += local44;
							}
						}
						Static268.method3929(this.aByteArray86, arg4 >> 16, arg3 >> 16, arg0);
						arg3 += local44;
						arg4 += local7;
						arg0 += this.anInt6642;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local7 * arg0;
					arg2 -= arg0 * local44;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local24 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg0 || local44 >= local7) && (arg0 != arg5 || local7 >= local24)) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt6642;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg4 >> 16, arg3 >> 16, arg0);
								arg0 += this.anInt6642;
								arg3 += local24;
								arg4 += local7;
							}
						}
						Static268.method3929(this.aByteArray86, arg4 >> 16, arg2 >> 16, arg0);
						arg0 += this.anInt6642;
						arg4 += local7;
						arg2 += local44;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt6642 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg3 >> 16, arg4 >> 16, arg0);
								arg3 += local24;
								arg4 += local7;
								arg0 += this.anInt6642;
							}
						}
						Static268.method3929(this.aByteArray86, arg2 >> 16, arg4 >> 16, arg0);
						arg0 += this.anInt6642;
						arg4 += local7;
						arg2 += local44;
					}
				}
			}
		} else if (arg1 <= arg5) {
			if (arg0 <= arg5) {
				arg3 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local24 * arg1;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local44;
					arg0 = 0;
				}
				if (local7 < local24) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt6642 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg4 >> 16, arg2 >> 16, arg1);
								arg4 += local44;
								arg2 += local24;
								arg1 += this.anInt6642;
							}
						}
						Static268.method3929(this.aByteArray86, arg3 >> 16, arg2 >> 16, arg1);
						arg3 += local7;
						arg1 += this.anInt6642;
						arg2 += local24;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt6642;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg2 >> 16, arg4 >> 16, arg1);
								arg2 += local24;
								arg4 += local44;
								arg1 += this.anInt6642;
							}
						}
						Static268.method3929(this.aByteArray86, arg2 >> 16, arg3 >> 16, arg1);
						arg1 += this.anInt6642;
						arg2 += local24;
						arg3 += local7;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local7;
					arg2 -= arg1 * local24;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local44;
					arg5 = 0;
				}
				if ((arg5 == arg1 || local7 >= local24) && (arg5 != arg1 || local7 <= local44)) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt6642;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg3 >> 16, arg4 >> 16, arg1);
								arg4 += local7;
								arg1 += this.anInt6642;
								arg3 += local44;
							}
						}
						Static268.method3929(this.aByteArray86, arg2 >> 16, arg4 >> 16, arg1);
						arg4 += local7;
						arg2 += local24;
						arg1 += this.anInt6642;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt6642;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static268.method3929(this.aByteArray86, arg4 >> 16, arg3 >> 16, arg1);
								arg3 += local44;
								arg1 += this.anInt6642;
								arg4 += local7;
							}
						}
						Static268.method3929(this.aByteArray86, arg4 >> 16, arg2 >> 16, arg1);
						arg4 += local7;
						arg1 += this.anInt6642;
						arg2 += local24;
					}
				}
			}
		} else if (arg1 <= arg0) {
			arg4 = arg3 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local24 * arg5;
				arg3 -= local44 * arg5;
				arg5 = 0;
			}
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local7 * arg1;
				arg1 = 0;
			}
			if (local24 < local44) {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt6642;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static268.method3929(this.aByteArray86, arg2 >> 16, arg3 >> 16, arg5);
							arg5 += this.anInt6642;
							arg3 += local44;
							arg2 += local7;
						}
					}
					Static268.method3929(this.aByteArray86, arg4 >> 16, arg3 >> 16, arg5);
					arg3 += local44;
					arg4 += local24;
					arg5 += this.anInt6642;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt6642 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static268.method3929(this.aByteArray86, arg3 >> 16, arg2 >> 16, arg5);
							arg2 += local7;
							arg3 += local44;
							arg5 += this.anInt6642;
						}
					}
					Static268.method3929(this.aByteArray86, arg3 >> 16, arg4 >> 16, arg5);
					arg4 += local24;
					arg3 += local44;
					arg5 += this.anInt6642;
				}
			}
		} else {
			arg2 = arg3 <<= 0x10;
			arg4 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local24 * arg5;
				arg3 -= arg5 * local44;
				arg5 = 0;
			}
			if (arg0 < 0) {
				arg4 -= arg0 * local7;
				arg0 = 0;
			}
			if (local44 > local24) {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt6642 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static268.method3929(this.aByteArray86, arg2 >> 16, arg4 >> 16, arg5);
							arg4 += local7;
							arg2 += local24;
							arg5 += this.anInt6642;
						}
					}
					Static268.method3929(this.aByteArray86, arg2 >> 16, arg3 >> 16, arg5);
					arg3 += local44;
					arg5 += this.anInt6642;
					arg2 += local24;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt6642;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static268.method3929(this.aByteArray86, arg4 >> 16, arg2 >> 16, arg5);
							arg5 += this.anInt6642;
							arg4 += local7;
							arg2 += local24;
						}
					}
					Static268.method3929(this.aByteArray86, arg3 >> 16, arg2 >> 16, arg5);
					arg3 += local44;
					arg5 += this.anInt6642;
					arg2 += local24;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)Z")
	public boolean method5201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray86.length;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public void method5203() {
		@Pc(7) int local7 = -1;
		@Pc(18) int local18 = this.aByteArray86.length - 8;
		while (local7 < local18) {
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
		}
		while (this.aByteArray86.length - 1 > local7) {
			local7++;
			this.aByteArray86[local7] = 0;
		}
	}
}
