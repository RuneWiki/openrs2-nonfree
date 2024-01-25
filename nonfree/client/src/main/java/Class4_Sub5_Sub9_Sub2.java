import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class4_Sub5_Sub9_Sub2 extends Class4_Sub5_Sub9 {

	@OriginalMember(owner = "client!nfa", name = "F", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!nfa", name = "M", descriptor = "I")
	public int anInt5829;

	@OriginalMember(owner = "client!nfa", name = "O", descriptor = "I")
	public int anInt5830;

	@OriginalMember(owner = "client!nfa", name = "P", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!nfa", name = "N", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!pc;II)V")
	public Class4_Sub5_Sub9_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray57 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIII)V")
	public void method5115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5829 = arg0 - arg1;
		this.anInt5831 = arg1;
		this.anInt5830 = arg3;
		this.anInt5826 = arg2 - arg3;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIII)V")
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg2) {
			local7 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(24) int local24 = 0;
		if (arg0 != arg4) {
			local24 = (arg1 - arg3 << 16) / (arg4 - arg0);
		}
		@Pc(45) int local45 = 0;
		if (arg4 != arg2) {
			local45 = (arg5 - arg1 << 16) / (arg2 - arg4);
		}
		if (arg2 <= arg0 && arg4 >= arg2) {
			if (arg0 < arg4) {
				arg1 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg1 -= arg2 * local45;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local24 * arg0;
					arg0 = 0;
				}
				if (arg2 != arg0 && local7 > local45 || arg0 == arg2 && local24 < local45) {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt5829 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static140.method7081(arg3 >> 16, this.aByteArray57, arg1 >> 16, arg2);
								arg3 += local24;
								arg2 += this.anInt5829;
								arg1 += local45;
							}
						}
						Static140.method7081(arg5 >> 16, this.aByteArray57, arg1 >> 16, arg2);
						arg2 += this.anInt5829;
						arg1 += local45;
						arg5 += local7;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt5829 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static140.method7081(arg1 >> 16, this.aByteArray57, arg3 >> 16, arg2);
								arg3 += local24;
								arg2 += this.anInt5829;
								arg1 += local45;
							}
						}
						Static140.method7081(arg1 >> 16, this.aByteArray57, arg5 >> 16, arg2);
						arg2 += this.anInt5829;
						arg1 += local45;
						arg5 += local7;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg3 -= arg2 * local45;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local24;
					arg4 = 0;
				}
				if ((arg4 == arg2 || local45 >= local7) && (arg4 != arg2 || local24 <= local7)) {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt5829 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static140.method7081(arg1 >> 16, this.aByteArray57, arg5 >> 16, arg2);
								arg5 += local7;
								arg2 += this.anInt5829;
								arg1 += local24;
							}
						}
						Static140.method7081(arg3 >> 16, this.aByteArray57, arg5 >> 16, arg2);
						arg3 += local45;
						arg2 += this.anInt5829;
						arg5 += local7;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt5829 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static140.method7081(arg5 >> 16, this.aByteArray57, arg1 >> 16, arg2);
								arg1 += local24;
								arg5 += local7;
								arg2 += this.anInt5829;
							}
						}
						Static140.method7081(arg5 >> 16, this.aByteArray57, arg3 >> 16, arg2);
						arg2 += this.anInt5829;
						arg5 += local7;
						arg3 += local45;
					}
				}
			}
		} else if (arg4 < arg0) {
			if (arg2 < arg0) {
				arg3 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local45 * arg4;
					arg3 -= local24 * arg4;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg2 = 0;
				}
				if (local24 < local45) {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt5829 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static140.method7081(arg5 >> 16, this.aByteArray57, arg3 >> 16, arg4);
								arg4 += this.anInt5829;
								arg5 += local7;
								arg3 += local24;
							}
						}
						Static140.method7081(arg1 >> 16, this.aByteArray57, arg3 >> 16, arg4);
						arg1 += local45;
						arg4 += this.anInt5829;
						arg3 += local24;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt5829;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static140.method7081(arg3 >> 16, this.aByteArray57, arg5 >> 16, arg4);
								arg3 += local24;
								arg4 += this.anInt5829;
								arg5 += local7;
							}
						}
						Static140.method7081(arg3 >> 16, this.aByteArray57, arg1 >> 16, arg4);
						arg4 += this.anInt5829;
						arg1 += local45;
						arg3 += local24;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local45 * arg4;
					arg5 -= local24 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local7 * arg0;
					arg0 = 0;
				}
				if (local24 < local45) {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt5829;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static140.method7081(arg1 >> 16, this.aByteArray57, arg3 >> 16, arg4);
								arg3 += local7;
								arg1 += local45;
								arg4 += this.anInt5829;
							}
						}
						Static140.method7081(arg1 >> 16, this.aByteArray57, arg5 >> 16, arg4);
						arg1 += local45;
						arg4 += this.anInt5829;
						arg5 += local24;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt5829 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static140.method7081(arg3 >> 16, this.aByteArray57, arg1 >> 16, arg4);
								arg3 += local7;
								arg4 += this.anInt5829;
								arg1 += local45;
							}
						}
						Static140.method7081(arg5 >> 16, this.aByteArray57, arg1 >> 16, arg4);
						arg4 += this.anInt5829;
						arg5 += local24;
						arg1 += local45;
					}
				}
			}
		} else if (arg4 < arg2) {
			arg5 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= arg0 * local7;
				arg3 -= local24 * arg0;
				arg0 = 0;
			}
			if (arg4 < 0) {
				arg1 -= arg4 * local45;
				arg4 = 0;
			}
			if ((arg4 == arg0 || local7 >= local24) && (arg0 != arg4 || local45 >= local7)) {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt5829;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static140.method7081(arg5 >> 16, this.aByteArray57, arg1 >> 16, arg0);
							arg1 += local45;
							arg5 += local7;
							arg0 += this.anInt5829;
						}
					}
					Static140.method7081(arg5 >> 16, this.aByteArray57, arg3 >> 16, arg0);
					arg0 += this.anInt5829;
					arg5 += local7;
					arg3 += local24;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt5829;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static140.method7081(arg1 >> 16, this.aByteArray57, arg5 >> 16, arg0);
							arg5 += local7;
							arg0 += this.anInt5829;
							arg1 += local45;
						}
					}
					Static140.method7081(arg3 >> 16, this.aByteArray57, arg5 >> 16, arg0);
					arg5 += local7;
					arg3 += local24;
					arg0 += this.anInt5829;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local7;
				arg3 -= local24 * arg0;
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg5 -= arg2 * local45;
				arg2 = 0;
			}
			if (local24 <= local7) {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt5829;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static140.method7081(arg5 >> 16, this.aByteArray57, arg3 >> 16, arg0);
							arg0 += this.anInt5829;
							arg3 += local24;
							arg5 += local45;
						}
					}
					Static140.method7081(arg1 >> 16, this.aByteArray57, arg3 >> 16, arg0);
					arg3 += local24;
					arg0 += this.anInt5829;
					arg1 += local7;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt5829;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static140.method7081(arg3 >> 16, this.aByteArray57, arg5 >> 16, arg0);
							arg0 += this.anInt5829;
							arg3 += local24;
							arg5 += local45;
						}
					}
					Static140.method7081(arg3 >> 16, this.aByteArray57, arg1 >> 16, arg0);
					arg0 += this.anInt5829;
					arg3 += local24;
					arg1 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(I)V")
	public void method5117() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray57.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
			local11++;
			this.aByteArray57[local11] = 0;
		}
		while (this.aByteArray57.length - 1 > local11) {
			local11++;
			this.aByteArray57[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)Z")
	public boolean method5118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray57.length >= arg1 * arg0;
	}
}
