import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class5_Sub4_Sub10_Sub1 extends Class5_Sub4_Sub10 {

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
	public int anInt3784;

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
	public int anInt3786;

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
	public int anInt3787;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!rda;II)V")
	public Class5_Sub4_Sub10_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray32 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIII)V")
	public void method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg1) {
			local7 = (arg0 - arg2 << 16) / (arg5 - arg1);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg5) {
			local27 = (arg4 - arg0 << 16) / (arg3 - arg5);
		}
		@Pc(43) int local43 = 0;
		if (arg1 != arg3) {
			local43 = (arg2 - arg4 << 16) / (arg1 - arg3);
		}
		if (arg1 <= arg5 && arg3 >= arg1) {
			if (arg5 >= arg3) {
				arg0 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local43;
					arg2 -= local7 * arg1;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local27 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg1 && local7 > local43 || arg1 == arg3 && local27 > local7) {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt3786;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg4 >> 16, arg1, arg2 >> 16);
								arg1 += this.anInt3786;
								arg2 += local7;
								arg4 += local27;
							}
						}
						Static217.method3298(this.aByteArray32, arg0 >> 16, arg1, arg2 >> 16);
						arg0 += local43;
						arg1 += this.anInt3786;
						arg2 += local7;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt3786 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg2 >> 16, arg1, arg4 >> 16);
								arg4 += local27;
								arg2 += local7;
								arg1 += this.anInt3786;
							}
						}
						Static217.method3298(this.aByteArray32, arg2 >> 16, arg1, arg0 >> 16);
						arg2 += local7;
						arg0 += local43;
						arg1 += this.anInt3786;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local7 * arg1;
					arg4 -= local43 * arg1;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local27;
					arg5 = 0;
				}
				if ((arg1 == arg5 || local43 >= local7) && (arg1 != arg5 || local43 <= local27)) {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt3786 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg0 >> 16, arg1, arg4 >> 16);
								arg1 += this.anInt3786;
								arg0 += local27;
								arg4 += local43;
							}
						}
						Static217.method3298(this.aByteArray32, arg2 >> 16, arg1, arg4 >> 16);
						arg4 += local43;
						arg2 += local7;
						arg1 += this.anInt3786;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt3786 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg4 >> 16, arg1, arg0 >> 16);
								arg4 += local43;
								arg1 += this.anInt3786;
								arg0 += local27;
							}
						}
						Static217.method3298(this.aByteArray32, arg4 >> 16, arg1, arg2 >> 16);
						arg2 += local7;
						arg4 += local43;
						arg1 += this.anInt3786;
					}
				}
			}
		} else if (arg5 > arg3) {
			if (arg1 >= arg5) {
				arg2 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local27 * arg3;
					arg4 -= local43 * arg3;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg0 -= arg5 * local7;
					arg5 = 0;
				}
				if (local27 >= local43) {
					arg1 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt3786 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg4 >> 16, arg3, arg0 >> 16);
								arg3 += this.anInt3786;
								arg4 += local43;
								arg0 += local7;
							}
						}
						Static217.method3298(this.aByteArray32, arg4 >> 16, arg3, arg2 >> 16);
						arg4 += local43;
						arg3 += this.anInt3786;
						arg2 += local27;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt3786;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg0 >> 16, arg3, arg4 >> 16);
								arg3 += this.anInt3786;
								arg0 += local7;
								arg4 += local43;
							}
						}
						Static217.method3298(this.aByteArray32, arg2 >> 16, arg3, arg4 >> 16);
						arg2 += local27;
						arg4 += local43;
						arg3 += this.anInt3786;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local27;
					arg4 -= arg3 * local43;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local7;
					arg1 = 0;
				}
				if (local43 <= local27) {
					arg5 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt3786 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg2 >> 16, arg3, arg0 >> 16);
								arg0 += local27;
								arg3 += this.anInt3786;
								arg2 += local7;
							}
						}
						Static217.method3298(this.aByteArray32, arg4 >> 16, arg3, arg0 >> 16);
						arg3 += this.anInt3786;
						arg4 += local43;
						arg0 += local27;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt3786 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static217.method3298(this.aByteArray32, arg0 >> 16, arg3, arg2 >> 16);
								arg0 += local27;
								arg3 += this.anInt3786;
								arg2 += local7;
							}
						}
						Static217.method3298(this.aByteArray32, arg0 >> 16, arg3, arg4 >> 16);
						arg3 += this.anInt3786;
						arg4 += local43;
						arg0 += local27;
					}
				}
			}
		} else if (arg1 <= arg3) {
			arg4 = arg0 <<= 0x10;
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local27;
				arg4 -= arg5 * local7;
				arg5 = 0;
			}
			if (arg1 < 0) {
				arg2 -= local43 * arg1;
				arg1 = 0;
			}
			if (local7 < local27) {
				arg3 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt3786;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static217.method3298(this.aByteArray32, arg2 >> 16, arg5, arg0 >> 16);
							arg2 += local43;
							arg0 += local27;
							arg5 += this.anInt3786;
						}
					}
					Static217.method3298(this.aByteArray32, arg4 >> 16, arg5, arg0 >> 16);
					arg5 += this.anInt3786;
					arg0 += local27;
					arg4 += local7;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt3786;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static217.method3298(this.aByteArray32, arg0 >> 16, arg5, arg2 >> 16);
							arg0 += local27;
							arg5 += this.anInt3786;
							arg2 += local43;
						}
					}
					Static217.method3298(this.aByteArray32, arg0 >> 16, arg5, arg4 >> 16);
					arg0 += local27;
					arg5 += this.anInt3786;
					arg4 += local7;
				}
			}
		} else {
			arg2 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local7;
				arg0 -= local27 * arg5;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local43;
				arg3 = 0;
			}
			if (arg5 != arg3 && local7 < local27 || arg5 == arg3 && local43 < local7) {
				arg1 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt3786 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static217.method3298(this.aByteArray32, arg2 >> 16, arg5, arg4 >> 16);
							arg2 += local7;
							arg4 += local43;
							arg5 += this.anInt3786;
						}
					}
					Static217.method3298(this.aByteArray32, arg2 >> 16, arg5, arg0 >> 16);
					arg2 += local7;
					arg0 += local27;
					arg5 += this.anInt3786;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt3786;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static217.method3298(this.aByteArray32, arg4 >> 16, arg5, arg2 >> 16);
							arg2 += local7;
							arg4 += local43;
							arg5 += this.anInt3786;
						}
					}
					Static217.method3298(this.aByteArray32, arg0 >> 16, arg5, arg2 >> 16);
					arg5 += this.anInt3786;
					arg0 += local27;
					arg2 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(Z)V")
	public void method3388() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray32.length - 8;
		while (local18 > local12) {
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
			local12++;
			this.aByteArray32[local12] = 0;
		}
		while (this.aByteArray32.length - 1 > local12) {
			local12++;
			this.aByteArray32[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
	public void method3389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3787 = arg1;
		this.anInt3784 = arg3;
		this.anInt3786 = arg0 - arg1;
		this.anInt3782 = arg2 - arg3;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
	public boolean method3390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray32.length;
	}
}
