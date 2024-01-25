import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub2_Sub9_Sub1 extends Class2_Sub2_Sub9 {

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	public int anInt7665;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
	public int anInt7666;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	public int anInt7670;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	public int anInt7673;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "[B")
	public final byte[] aByteArray212;

	static {
		new Class256("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bo;II)V")
	public Class2_Sub2_Sub9_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray212 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIB)V")
	public void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7673 = arg3;
		this.anInt7665 = arg2 - arg3;
		this.anInt7666 = arg0;
		this.anInt7670 = arg1 - arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg5 - arg3 << 16) / (arg0 - arg2);
		}
		@Pc(23) int local23 = 0;
		if (arg4 != arg0) {
			local23 = (arg1 - arg5 << 16) / (arg4 - arg0);
		}
		@Pc(53) int local53 = 0;
		if (arg2 != arg4) {
			local53 = (arg3 - arg1 << 16) / (arg2 - arg4);
		}
		if (arg2 <= arg0 && arg4 >= arg2) {
			if (arg0 < arg4) {
				arg1 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local53;
					arg3 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local23;
					arg0 = 0;
				}
				if (arg2 != arg0 && local7 > local53 || arg2 == arg0 && local23 < local53) {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt7670;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg5 >> 16, arg1 >> 16, arg2);
								arg5 += local23;
								arg1 += local53;
								arg2 += this.anInt7670;
							}
						}
						Static297.method4315(this.aByteArray212, arg3 >> 16, arg1 >> 16, arg2);
						arg1 += local53;
						arg3 += local7;
						arg2 += this.anInt7670;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt7670 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg1 >> 16, arg5 >> 16, arg2);
								arg5 += local23;
								arg2 += this.anInt7670;
								arg1 += local53;
							}
						}
						Static297.method4315(this.aByteArray212, arg1 >> 16, arg3 >> 16, arg2);
						arg2 += this.anInt7670;
						arg1 += local53;
						arg3 += local7;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local7 * arg2;
					arg5 -= arg2 * local53;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local23;
					arg4 = 0;
				}
				if ((arg4 == arg2 || local53 >= local7) && (arg2 != arg4 || local7 >= local23)) {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt7670 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg1 >> 16, arg3 >> 16, arg2);
								arg2 += this.anInt7670;
								arg1 += local23;
								arg3 += local7;
							}
						}
						Static297.method4315(this.aByteArray212, arg5 >> 16, arg3 >> 16, arg2);
						arg5 += local53;
						arg3 += local7;
						arg2 += this.anInt7670;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt7670;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg3 >> 16, arg1 >> 16, arg2);
								arg3 += local7;
								arg1 += local23;
								arg2 += this.anInt7670;
							}
						}
						Static297.method4315(this.aByteArray212, arg3 >> 16, arg5 >> 16, arg2);
						arg3 += local7;
						arg2 += this.anInt7670;
						arg5 += local53;
					}
				}
			}
		} else if (arg4 >= arg0) {
			if (arg4 < arg2) {
				arg3 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local7 * arg0;
					arg5 -= local23 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local53;
					arg4 = 0;
				}
				if (arg4 != arg0 && local23 > local7 || arg4 == arg0 && local7 > local53) {
					arg2 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt7670 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg1 >> 16, arg3 >> 16, arg0);
								arg3 += local7;
								arg1 += local53;
								arg0 += this.anInt7670;
							}
						}
						Static297.method4315(this.aByteArray212, arg5 >> 16, arg3 >> 16, arg0);
						arg3 += local7;
						arg0 += this.anInt7670;
						arg5 += local23;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt7670;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg3 >> 16, arg1 >> 16, arg0);
								arg0 += this.anInt7670;
								arg3 += local7;
								arg1 += local53;
							}
						}
						Static297.method4315(this.aByteArray212, arg3 >> 16, arg5 >> 16, arg0);
						arg3 += local7;
						arg5 += local23;
						arg0 += this.anInt7670;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local23;
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local53;
					arg2 = 0;
				}
				if (local23 > local7) {
					arg4 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt7670 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg5 >> 16, arg3 >> 16, arg0);
								arg3 += local53;
								arg5 += local23;
								arg0 += this.anInt7670;
							}
						}
						Static297.method4315(this.aByteArray212, arg5 >> 16, arg1 >> 16, arg0);
						arg5 += local23;
						arg1 += local7;
						arg0 += this.anInt7670;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt7670;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static297.method4315(this.aByteArray212, arg3 >> 16, arg5 >> 16, arg0);
								arg5 += local23;
								arg0 += this.anInt7670;
								arg3 += local53;
							}
						}
						Static297.method4315(this.aByteArray212, arg1 >> 16, arg5 >> 16, arg0);
						arg1 += local7;
						arg5 += local23;
						arg0 += this.anInt7670;
					}
				}
			}
		} else if (arg0 <= arg2) {
			arg3 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local53;
				arg3 -= arg4 * local23;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= arg0 * local7;
				arg0 = 0;
			}
			if (local23 >= local53) {
				arg2 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt7670 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static297.method4315(this.aByteArray212, arg5 >> 16, arg1 >> 16, arg4);
							arg4 += this.anInt7670;
							arg5 += local7;
							arg1 += local53;
						}
					}
					Static297.method4315(this.aByteArray212, arg3 >> 16, arg1 >> 16, arg4);
					arg1 += local53;
					arg3 += local23;
					arg4 += this.anInt7670;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt7670;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static297.method4315(this.aByteArray212, arg1 >> 16, arg5 >> 16, arg4);
							arg5 += local7;
							arg1 += local53;
							arg4 += this.anInt7670;
						}
					}
					Static297.method4315(this.aByteArray212, arg1 >> 16, arg3 >> 16, arg4);
					arg4 += this.anInt7670;
					arg3 += local23;
					arg1 += local53;
				}
			}
		} else {
			arg5 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= local53 * arg4;
				arg5 -= local23 * arg4;
				arg4 = 0;
			}
			arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local7 * arg2;
				arg2 = 0;
			}
			if (local53 > local23) {
				arg0 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt7670;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static297.method4315(this.aByteArray212, arg3 >> 16, arg5 >> 16, arg4);
							arg5 += local23;
							arg3 += local7;
							arg4 += this.anInt7670;
						}
					}
					Static297.method4315(this.aByteArray212, arg1 >> 16, arg5 >> 16, arg4);
					arg1 += local53;
					arg4 += this.anInt7670;
					arg5 += local23;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt7670 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static297.method4315(this.aByteArray212, arg5 >> 16, arg3 >> 16, arg4);
							arg5 += local23;
							arg4 += this.anInt7670;
							arg3 += local7;
						}
					}
					Static297.method4315(this.aByteArray212, arg5 >> 16, arg1 >> 16, arg4);
					arg5 += local23;
					arg1 += local53;
					arg4 += this.anInt7670;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public boolean method5942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray212.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method5944() {
		@Pc(7) int local7 = -1;
		@Pc(21) int local21 = this.aByteArray212.length - 8;
		while (local21 > local7) {
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
			local7++;
			this.aByteArray212[local7] = 0;
		}
		while (local7 < this.aByteArray212.length - 1) {
			local7++;
			this.aByteArray212[local7] = 0;
		}
	}
}
