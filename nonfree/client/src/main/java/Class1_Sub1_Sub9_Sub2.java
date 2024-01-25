import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class1_Sub1_Sub9_Sub2 extends Class1_Sub1_Sub9 {

	@OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
	public int anInt6060;

	@OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
	public int anInt6061;

	@OriginalMember(owner = "client!oca", name = "B", descriptor = "I")
	public int anInt6062;

	@OriginalMember(owner = "client!oca", name = "x", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!re;II)V")
	public Class1_Sub1_Sub9_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray96 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z")
	public boolean method5130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray96.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
	public void method5132() {
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

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BIIII)V")
	public void method5135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6060 = arg0;
		this.anInt6062 = arg2 - arg0;
		this.anInt6061 = arg1 - arg3;
		this.anInt6058 = arg3;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZIIIII)V")
	public void method5136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg0) {
			local7 = (arg3 - arg4 << 16) / (arg1 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg5 != arg1) {
			local24 = (arg2 - arg3 << 16) / (arg5 - arg1);
		}
		@Pc(51) int local51 = 0;
		if (arg0 != arg5) {
			local51 = (arg4 - arg2 << 16) / (arg0 - arg5);
		}
		if (arg0 <= arg1 && arg0 <= arg5) {
			if (arg5 <= arg1) {
				arg3 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local51;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local24 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg0 && local7 > local51 || arg5 == arg0 && local24 > local7) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt6062;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static443.method6361(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray96);
								arg2 += local24;
								arg0 += this.anInt6062;
								arg4 += local7;
							}
						}
						Static443.method6361(arg4 >> 16, arg0, arg3 >> 16, this.aByteArray96);
						arg4 += local7;
						arg0 += this.anInt6062;
						arg3 += local51;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt6062 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static443.method6361(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray96);
								arg0 += this.anInt6062;
								arg2 += local24;
								arg4 += local7;
							}
						}
						Static443.method6361(arg3 >> 16, arg0, arg4 >> 16, this.aByteArray96);
						arg3 += local51;
						arg0 += this.anInt6062;
						arg4 += local7;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local7 * arg0;
					arg2 -= arg0 * local51;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local24 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local51 >= local7) && (arg0 != arg1 || local51 <= local24)) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt6062;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static443.method6361(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray96);
								arg0 += this.anInt6062;
								arg3 += local24;
								arg2 += local51;
							}
						}
						Static443.method6361(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray96);
						arg0 += this.anInt6062;
						arg2 += local51;
						arg4 += local7;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt6062;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static443.method6361(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray96);
								arg2 += local51;
								arg0 += this.anInt6062;
								arg3 += local24;
							}
						}
						Static443.method6361(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray96);
						arg0 += this.anInt6062;
						arg4 += local7;
						arg2 += local51;
					}
				}
			}
		} else if (arg5 >= arg1) {
			if (arg0 > arg5) {
				arg4 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local7 * arg1;
					arg3 -= local24 * arg1;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg2 -= arg5 * local51;
					arg5 = 0;
				}
				if (arg1 != arg5 && local24 > local7 || arg5 == arg1 && local7 > local51) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6062 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static443.method6361(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray96);
								arg1 += this.anInt6062;
								arg2 += local51;
								arg4 += local7;
							}
						}
						Static443.method6361(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray96);
						arg1 += this.anInt6062;
						arg4 += local7;
						arg3 += local24;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt6062 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static443.method6361(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray96);
								arg1 += this.anInt6062;
								arg2 += local51;
								arg4 += local7;
							}
						}
						Static443.method6361(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray96);
						arg1 += this.anInt6062;
						arg3 += local24;
						arg4 += local7;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local24;
					arg2 -= local7 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg4 -= arg0 * local51;
					arg0 = 0;
				}
				if (local24 <= local7) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt6062 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static443.method6361(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray96);
								arg1 += this.anInt6062;
								arg3 += local24;
								arg4 += local51;
							}
						}
						Static443.method6361(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray96);
						arg2 += local7;
						arg3 += local24;
						arg1 += this.anInt6062;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt6062;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static443.method6361(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray96);
								arg3 += local24;
								arg1 += this.anInt6062;
								arg4 += local51;
							}
						}
						Static443.method6361(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray96);
						arg3 += local24;
						arg2 += local7;
						arg1 += this.anInt6062;
					}
				}
			}
		} else if (arg1 <= arg0) {
			arg4 = arg2 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local51;
				arg4 -= local24 * arg5;
				arg5 = 0;
			}
			if (arg1 < 0) {
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (local51 > local24) {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt6062;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static443.method6361(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray96);
							arg2 += local51;
							arg5 += this.anInt6062;
							arg3 += local7;
						}
					}
					Static443.method6361(arg2 >> 16, arg5, arg4 >> 16, this.aByteArray96);
					arg5 += this.anInt6062;
					arg4 += local24;
					arg2 += local51;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt6062 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static443.method6361(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray96);
							arg5 += this.anInt6062;
							arg2 += local51;
							arg3 += local7;
						}
					}
					Static443.method6361(arg4 >> 16, arg5, arg2 >> 16, this.aByteArray96);
					arg4 += local24;
					arg5 += this.anInt6062;
					arg2 += local51;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local24 * arg5;
				arg2 -= arg5 * local51;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local7 * arg0;
				arg0 = 0;
			}
			if (local51 > local24) {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt6062 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static443.method6361(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray96);
							arg4 += local7;
							arg5 += this.anInt6062;
							arg3 += local24;
						}
					}
					Static443.method6361(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray96);
					arg2 += local51;
					arg3 += local24;
					arg5 += this.anInt6062;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt6062 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static443.method6361(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray96);
							arg4 += local7;
							arg3 += local24;
							arg5 += this.anInt6062;
						}
					}
					Static443.method6361(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray96);
					arg3 += local24;
					arg2 += local51;
					arg5 += this.anInt6062;
				}
			}
		}
	}
}
