import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "[B")
	public final byte[] aByteArray7;

	static {
		new Class96("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!qg;II)V")
	public Class1_Sub1_Sub3_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray7 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZIIII)V")
	public void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg5) {
			local7 = (arg1 - arg0 << 16) / (arg5 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg2) {
			local28 = (arg4 - arg1 << 16) / (arg2 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg3 != arg2) {
			local49 = (arg0 - arg4 << 16) / (arg3 - arg2);
		}
		if (arg3 <= arg5 && arg3 <= arg2) {
			if (arg2 <= arg5) {
				arg1 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local49 * arg3;
					arg0 -= local7 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg2 = 0;
				}
				if (arg3 != arg2 && local7 > local49 || arg3 == arg2 && local7 < local28) {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt726;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static379.method5352(arg4 >> 16, arg3, this.aByteArray7, arg0 >> 16);
								arg3 += this.anInt726;
								arg0 += local7;
								arg4 += local28;
							}
						}
						Static379.method5352(arg1 >> 16, arg3, this.aByteArray7, arg0 >> 16);
						arg0 += local7;
						arg3 += this.anInt726;
						arg1 += local49;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt726 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static379.method5352(arg0 >> 16, arg3, this.aByteArray7, arg4 >> 16);
								arg0 += local7;
								arg4 += local28;
								arg3 += this.anInt726;
							}
						}
						Static379.method5352(arg0 >> 16, arg3, this.aByteArray7, arg1 >> 16);
						arg1 += local49;
						arg3 += this.anInt726;
						arg0 += local7;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local49;
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg1 -= arg5 * local28;
					arg5 = 0;
				}
				if ((arg5 == arg3 || local7 <= local49) && (arg3 != arg5 || local49 <= local28)) {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt726;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static379.method5352(arg1 >> 16, arg3, this.aByteArray7, arg4 >> 16);
								arg3 += this.anInt726;
								arg4 += local49;
								arg1 += local28;
							}
						}
						Static379.method5352(arg0 >> 16, arg3, this.aByteArray7, arg4 >> 16);
						arg0 += local7;
						arg4 += local49;
						arg3 += this.anInt726;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt726 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static379.method5352(arg4 >> 16, arg3, this.aByteArray7, arg1 >> 16);
								arg3 += this.anInt726;
								arg4 += local49;
								arg1 += local28;
							}
						}
						Static379.method5352(arg4 >> 16, arg3, this.aByteArray7, arg0 >> 16);
						arg4 += local49;
						arg3 += this.anInt726;
						arg0 += local7;
					}
				}
			}
		} else if (arg5 <= arg2) {
			if (arg2 < arg3) {
				arg0 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local28 * arg5;
					arg0 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg4 -= local49 * arg2;
					arg2 = 0;
				}
				if (arg5 != arg2 && local7 < local28 || arg2 == arg5 && local49 < local7) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt726;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static379.method5352(arg0 >> 16, arg5, this.aByteArray7, arg4 >> 16);
								arg0 += local7;
								arg4 += local49;
								arg5 += this.anInt726;
							}
						}
						Static379.method5352(arg0 >> 16, arg5, this.aByteArray7, arg1 >> 16);
						arg1 += local28;
						arg5 += this.anInt726;
						arg0 += local7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt726;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static379.method5352(arg4 >> 16, arg5, this.aByteArray7, arg0 >> 16);
								arg0 += local7;
								arg4 += local49;
								arg5 += this.anInt726;
							}
						}
						Static379.method5352(arg1 >> 16, arg5, this.aByteArray7, arg0 >> 16);
						arg0 += local7;
						arg1 += local28;
						arg5 += this.anInt726;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local7 * arg5;
					arg1 -= arg5 * local28;
					arg5 = 0;
				}
				if (arg3 < 0) {
					arg0 -= local49 * arg3;
					arg3 = 0;
				}
				if (local7 >= local28) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt726;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static379.method5352(arg1 >> 16, arg5, this.aByteArray7, arg0 >> 16);
								arg5 += this.anInt726;
								arg0 += local49;
								arg1 += local28;
							}
						}
						Static379.method5352(arg1 >> 16, arg5, this.aByteArray7, arg4 >> 16);
						arg4 += local7;
						arg1 += local28;
						arg5 += this.anInt726;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt726;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static379.method5352(arg0 >> 16, arg5, this.aByteArray7, arg1 >> 16);
								arg5 += this.anInt726;
								arg0 += local49;
								arg1 += local28;
							}
						}
						Static379.method5352(arg4 >> 16, arg5, this.aByteArray7, arg1 >> 16);
						arg5 += this.anInt726;
						arg1 += local28;
						arg4 += local7;
					}
				}
			}
		} else if (arg3 < arg5) {
			arg1 = arg4 <<= 0x10;
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local28 * arg2;
				arg4 -= local49 * arg2;
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg0 -= local7 * arg3;
				arg3 = 0;
			}
			if (local49 > local28) {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt726;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static379.method5352(arg1 >> 16, arg2, this.aByteArray7, arg0 >> 16);
							arg0 += local7;
							arg2 += this.anInt726;
							arg1 += local28;
						}
					}
					Static379.method5352(arg1 >> 16, arg2, this.aByteArray7, arg4 >> 16);
					arg4 += local49;
					arg2 += this.anInt726;
					arg1 += local28;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt726 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static379.method5352(arg0 >> 16, arg2, this.aByteArray7, arg1 >> 16);
							arg1 += local28;
							arg0 += local7;
							arg2 += this.anInt726;
						}
					}
					Static379.method5352(arg4 >> 16, arg2, this.aByteArray7, arg1 >> 16);
					arg2 += this.anInt726;
					arg4 += local49;
					arg1 += local28;
				}
			}
		} else {
			arg0 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local28 * arg2;
				arg4 -= local49 * arg2;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local7 * arg5;
				arg5 = 0;
			}
			if (local49 > local28) {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt726 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static379.method5352(arg1 >> 16, arg2, this.aByteArray7, arg4 >> 16);
							arg4 += local49;
							arg1 += local7;
							arg2 += this.anInt726;
						}
					}
					Static379.method5352(arg0 >> 16, arg2, this.aByteArray7, arg4 >> 16);
					arg4 += local49;
					arg0 += local28;
					arg2 += this.anInt726;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt726 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static379.method5352(arg4 >> 16, arg2, this.aByteArray7, arg1 >> 16);
							arg2 += this.anInt726;
							arg4 += local49;
							arg1 += local7;
						}
					}
					Static379.method5352(arg4 >> 16, arg2, this.aByteArray7, arg0 >> 16);
					arg0 += local28;
					arg2 += this.anInt726;
					arg4 += local49;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBII)V")
	public void method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt726 = arg1 - arg2;
		this.anInt724 = arg2;
		this.anInt727 = arg0;
		this.anInt725 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
	public void method614() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray7.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
			local7++;
			this.aByteArray7[local7] = 0;
		}
		while (local7 < this.aByteArray7.length - 1) {
			local7++;
			this.aByteArray7[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Z")
	public boolean method615(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray7.length >= arg1 * arg0;
	}
}
