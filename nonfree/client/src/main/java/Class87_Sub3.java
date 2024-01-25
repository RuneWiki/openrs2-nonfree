import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class87_Sub3 extends Class87 {

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	private int anInt9463;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "Z")
	private boolean aBoolean686;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	private int anInt9464;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "Lclient!id;")
	public Class2_Sub27 aClass2_Sub27_1;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "Z")
	private boolean aBoolean687;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "Lclient!mp;")
	private Class222 aClass222_40;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	private int anInt9465;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
	public int anInt9466;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
	private int anInt9467;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
	private int anInt9468;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
	public int anInt9469;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
	public int anInt9470;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
	public int anInt9471;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "Lclient!nga;")
	private final Class233 aClass233_53;

	@OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
	public int anInt9472;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
	public int anInt9473;

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "[F")
	public float[] aFloatArray74;

	@OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
	private int anInt9474;

	@OriginalMember(owner = "client!uj", name = "S", descriptor = "Lclient!qha;")
	public Class6_Sub3 aClass6_Sub3_2;

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
	public int anInt9475;

	@OriginalMember(owner = "client!uj", name = "U", descriptor = "Z")
	private boolean aBoolean688;

	@OriginalMember(owner = "client!uj", name = "V", descriptor = "[I")
	public int[] anIntArray662;

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
	public int anInt9476;

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
	public int anInt9477;

	@OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
	public int anInt9478;

	@OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
	public int anInt9479;

	@OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
	public int anInt9480;

	@OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
	private int anInt9481;

	@OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
	public int anInt9482;

	@OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
	private int anInt9483;

	@OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
	private int anInt9484;

	@OriginalMember(owner = "client!uj", name = "fb", descriptor = "Lclient!nga;")
	private final Class233 aClass233_54;

	@OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
	public int anInt9485;

	@OriginalMember(owner = "client!uj", name = "hb", descriptor = "Lclient!ub;")
	private Class333 aClass333_1;

	@OriginalMember(owner = "client!uj", name = "ib", descriptor = "[Lclient!w;")
	private Class364[] aClass364Array1;

	@OriginalMember(owner = "client!uj", name = "jb", descriptor = "I")
	public int anInt9486;

	@OriginalMember(owner = "client!uj", name = "kb", descriptor = "I")
	public int anInt9487;

	@OriginalMember(owner = "client!uj", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!uj", name = "mb", descriptor = "I")
	public int anInt9488;

	@OriginalMember(owner = "client!uj", name = "nb", descriptor = "[F")
	public float[] aFloatArray75;

	@OriginalMember(owner = "client!uj", name = "ob", descriptor = "I")
	public int anInt9489;

	@OriginalMember(owner = "client!uj", name = "pb", descriptor = "I")
	public int anInt9490;

	@OriginalMember(owner = "client!uj", name = "qb", descriptor = "I")
	public int anInt9491;

	@OriginalMember(owner = "client!uj", name = "rb", descriptor = "I")
	public int anInt9492;

	@OriginalMember(owner = "client!uj", name = "sb", descriptor = "I")
	public int anInt9493;

	@OriginalMember(owner = "client!uj", name = "tb", descriptor = "I")
	public int anInt9494;

	@OriginalMember(owner = "client!uj", name = "ub", descriptor = "I")
	private int anInt9495;

	@OriginalMember(owner = "client!uj", name = "vb", descriptor = "Lclient!kr;")
	private Class20 aClass20_34;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class87_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		this.method7974(arg0, arg2, arg3);
		this.method7891(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class87_Sub3(@OriginalArg(0) Interface6 arg0) {
		super(arg0);
		this.aBoolean686 = false;
		this.aBoolean687 = false;
		this.aClass222_40 = new Class222(4);
		this.anInt9473 = 45823;
		this.anInt9470 = 3500;
		this.anInt9477 = 0;
		this.aBoolean688 = false;
		this.anInt9471 = 0;
		this.anInt9482 = 50;
		this.anInt9484 = 0;
		this.anInt9467 = 0;
		this.anInt9480 = 128;
		this.anInt9478 = 78642;
		this.anInt9479 = 75518;
		this.anInt9466 = 512;
		this.anInt9486 = 0;
		this.anInt9493 = 512;
		this.anInt9494 = 0;
		this.aClass233_53 = new Class233(16);
		this.anInt9495 = -1;
		this.aClass233_54 = new Class233(256);
		this.aClass6_Sub3_2 = new Class6_Sub3();
		this.method7938(1);
		this.method7890(0);
		Static240.method3965(true, true);
		this.aBoolean686 = true;
		this.anInt9465 = (int) Static438.method6517();
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "()Z")
	public boolean method7977() {
		return this.aBoolean687;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sfa;)V")
	@Override
	public void method7934(@OriginalArg(0) Class22 arg0) {
	}

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt9484;
		this.anInt9484 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.U(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.U(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt9471) {
					arg1 += local104 * (this.anInt9471 - arg0);
					arg0 = this.anInt9471;
				}
				if (arg2 >= this.anInt9477) {
					arg2 = this.anInt9477 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9486 && local150 < this.anInt9494) {
							this.anIntArray662[arg0 + local150 * this.anInt9491] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt9486 && local213 < this.anInt9494) {
							local228 = arg0 + local213 * this.anInt9491;
							local233 = this.anIntArray662[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray662[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9486 && local150 < this.anInt9494) {
							local213 = arg0 + local150 * this.anInt9491;
							local228 = this.anIntArray662[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray662[local213] = local233 - local228 | local228 - (local228 >>> 8);
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt9486) {
					arg0 += local104 * (this.anInt9486 - arg1);
					arg1 = this.anInt9486;
				}
				if (arg3 >= this.anInt9494) {
					arg3 = this.anInt9494 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9471 && local150 < this.anInt9477) {
							this.anIntArray662[local150 + arg1 * this.anInt9491] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt9471 && local213 < this.anInt9477) {
							local228 = local213 + arg1 * this.anInt9491;
							local233 = this.anIntArray662[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray662[local213 + arg1 * this.anInt9491] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9471 && local150 < this.anInt9477) {
							local213 = local150 + arg1 * this.anInt9491;
							local228 = this.anIntArray662[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray662[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.P(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.P(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)I")
	public int method7978(@OriginalArg(0) int arg0) {
		return super.anInterface6_11.method6357(arg0).aShort83 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!w;")
	public Class364 method7979(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9492; local1++) {
			if (this.aClass364Array1[local1].aRunnable2 == arg0) {
				return this.aClass364Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)V")
	private void method7980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt9486 || arg1 >= this.anInt9494) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt9491;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt9471 && arg0 + local37 < this.anInt9477 && local27 < arg4) {
					this.anIntArray662[local15 + local37] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(103) int local103 = 0;
		while (local103 < arg2) {
			if (arg0 + local103 >= this.anInt9471 && arg0 + local103 < this.anInt9477 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray662[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray662[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method7980(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method7980(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local32 = arg7 << 8;
			@Pc(143) int local143 = arg5 << 8;
			@Pc(147) int local147 = arg6 << 8;
			local28 = local143 + local147;
			arg7 = local32 % local28;
			@Pc(172) int local172;
			@Pc(176) int local176;
			if (arg2 + arg3 < 0) {
				local172 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local176 = local172 % local28;
				local32 = local28 + local143 - arg7 - local176;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(254) int local254;
			@Pc(267) int local267;
			@Pc(349) int local349;
			@Pc(375) int local375;
			@Pc(380) int local380;
			@Pc(237) int local237;
			@Pc(223) int local223;
			@Pc(340) int local340;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local223 = arg3 << 16;
				local172 = (int) Math.floor((double) local223 / (double) arg2 + 0.5D);
				local237 = arg2 + arg0;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg0 <= local237) {
						local267 = arg1 >> 16;
						if (arg0 >= this.anInt9471 && arg0 < this.anInt9477 && local267 >= this.anInt9486 && local267 < this.anInt9494 && arg7 < local143) {
							this.anIntArray662[arg0 + local267 * this.anInt9491] = arg4;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg0 <= local237) {
						local349 = arg1 >> 16;
						if (arg0 >= this.anInt9471 && arg0 < this.anInt9477 && local349 >= this.anInt9486 && local349 < this.anInt9494 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt9491;
							local380 = this.anIntArray662[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray662[local375] = local340 + local380;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local237 = arg2 << 16;
				local172 = (int) Math.floor((double) local237 / (double) arg3 + 0.5D);
				local223 = arg3 + arg1;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg1 <= local223) {
						local267 = arg0 >> 16;
						if (arg1 >= this.anInt9486 && arg1 < this.anInt9494 && local267 >= this.anInt9471 && local267 < this.anInt9477 && arg7 < local143) {
							this.anIntArray662[local267 + arg1 * this.anInt9491] = arg4;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg1 <= local223) {
						local349 = arg0 >> 16;
						if (arg1 >= this.anInt9486 && arg1 < this.anInt9494 && local349 >= this.anInt9471 && local349 < this.anInt9477 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt9491;
							local380 = this.anIntArray662[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray662[local349 + arg1 * this.anInt9491] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method7987(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method7987(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(II)Lclient!c;")
	@Override
	public Interface2 method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7931(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "()Z")
	@Override
	public boolean method7967() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fp;[Lclient!fw;Z)Lclient!da;")
	@Override
	public Class64 method7965(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class120[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3710;
			local7[local11] = arg1[local11].anInt3707;
			if (arg1[local11].aByteArray35 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class64_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class64_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass364Array1.length; local1++) {
			@Pc(7) Class364 local7 = this.aClass364Array1[local1];
			local7.anInt10010 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt10010 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt10010 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt10010 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt10010 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean738 = false;
			} else {
				local7.aBoolean738 = true;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(IIIIII)Lclient!sfa;")
	@Override
	public Class22 method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
	@Override
	public void method7918(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt9465;
		for (@Pc(9) Object local9 = this.aClass233_54.method5659(); local9 != null; local9 = this.aClass233_54.method5666()) {
			@Pc(13) Class2_Sub41 local13 = (Class2_Sub41) local9;
			if (local13.aBoolean607) {
				local13.anInt8058 += local4;
				@Pc(27) int local27 = local13.anInt8058 / 20;
				if (local27 > 0) {
					@Pc(36) Class199 local36 = super.anInterface6_11.method6357(local13.anInt8057);
					local13.method6756(local36.aByte88 * local4 * 50 / 1000, local36.aByte87 * local4 * 50 / 1000);
					local13.anInt8058 -= local27 * 20;
				}
				local13.aBoolean607 = false;
			}
		}
		this.anInt9465 = arg0;
		this.aClass233_53.method5664(5);
		this.aClass233_54.method5664(5);
	}

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "(I)Z")
	public boolean method7981(@OriginalArg(0) int arg0) {
		return super.anInterface6_11.method6357(arg0).aBoolean426 || super.anInterface6_11.method6357(arg0).aBoolean425;
	}

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7951() {
		return this.aClass6_Sub3_2;
	}

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "()Z")
	@Override
	public boolean method7955() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "()Z")
	@Override
	public boolean method7962() {
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7902(@OriginalArg(0) boolean arg0) {
		this.aBoolean688 = arg0;
		this.aClass233_54.method5663();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7894() {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		@Pc(6) Class28 local6 = local3.aClass28_2;
		local6.aBoolean63 = false;
		@Pc(14) int local14 = 5 - this.anInt9472;
		@Pc(19) int local19 = 75 - this.anInt9472;
		@Pc(24) int local24 = 15 - this.anInt9472;
		@Pc(29) int local29 = 10 - this.anInt9476;
		@Pc(34) int local34 = 50 - this.anInt9476;
		@Pc(39) int local39 = 90 - this.anInt9476;
		local6.aBoolean60 = local14 < 0 || local14 > local6.anInt764 || local19 < 0 || local19 > local6.anInt764 || local24 < 0 || local24 > local6.anInt764;
		local6.anInt768 = 0;
		local6.aBoolean62 = false;
		local6.method685((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!uj", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt9479 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([IIIIIZ)Lclient!kr;")
	@Override
	public Class20 method7956(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class20_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class20_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class20_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class20_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0) {
		this.aClass364Array1[arg0].method8378(null);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.lb - arg2;
		@Pc(11) int local11 = arg1 * this.lb + arg0;
		@Pc(14) float[] local14 = this.aFloatArray74;
		@Pc(16) int local16 = 0;
		while (local16 < arg3) {
			@Pc(19) int local19 = 0;
			while (local19 < arg2) {
				@Pc(24) float local24 = local14[local11];
				if (local24 != 2.14748365E9F) {
					local14[local11] = (float) ((double) local24 + arg4);
				}
				local19++;
				local11++;
			}
			local16++;
			local11 += local4;
		}
	}

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "(I)Z")
	public boolean method7982(@OriginalArg(0) int arg0) {
		return super.anInterface6_11.method6355(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7910() {
		return new Class6_Sub3();
	}

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "()Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "(I)Z")
	public boolean method7983(@OriginalArg(0) int arg0) {
		return this.aBoolean688 || super.anInterface6_11.method6357(arg0).aBoolean428;
	}

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "()Z")
	@Override
	public boolean method7958() {
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIF)Lclient!bh;")
	@Override
	public Class2_Sub4 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "()V")
	@Override
	public void method7937() {
	}

	@OriginalMember(owner = "client!uj", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt9475, this.anInt9469, this.anInt9466, this.anInt9493 };
	}

	@OriginalMember(owner = "client!uj", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt9486 || arg1 >= this.anInt9494) {
			return;
		}
		if (arg0 < this.anInt9471) {
			arg2 -= this.anInt9471 - arg0;
			arg0 = this.anInt9471;
		}
		if (arg0 + arg2 > this.anInt9477) {
			arg2 = this.anInt9477 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9491;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray662[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray662[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray662[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray662[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray662[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7896(@OriginalArg(0) Class6 arg0) {
		this.aClass6_Sub3_2 = (Class6_Sub3) arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!c;Lclient!vi;)Lclient!uaa;")
	@Override
	public Interface24 method7900(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return new Class333(this, (Class20) arg0, (Class376) arg1);
	}

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "()V")
	private void method7984() {
		this.anInt9472 = this.anInt9471 - this.anInt9475;
		this.anInt9489 = this.anInt9477 - this.anInt9475;
		this.anInt9476 = this.anInt9486 - this.anInt9469;
		this.anInt9487 = this.anInt9494 - this.anInt9469;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9492; local29++) {
			@Pc(36) Class28 local36 = this.aClass364Array1[local29].aClass28_2;
			local36.anInt765 = this.anInt9475 - this.anInt9471;
			local36.anInt769 = this.anInt9469 - this.anInt9486;
			local36.anInt764 = this.anInt9477 - this.anInt9471;
			local36.anInt767 = this.anInt9494 - this.anInt9486;
		}
		@Pc(78) int local78 = this.anInt9486 * this.anInt9491 + this.anInt9471;
		for (@Pc(81) int local81 = this.anInt9486; local81 < this.anInt9494; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt9492; local84++) {
				this.aClass364Array1[local84].aClass28_2.anIntArray89[local81 - this.anInt9486] = local78;
			}
			local78 += this.anInt9491;
		}
	}

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt9482;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7892() {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		return local3.aClass6_Sub3_3;
	}

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "(I)[I")
	public int[] method7985(@OriginalArg(0) int arg0) {
		@Pc(2) Class233 local2 = this.aClass233_54;
		@Pc(14) Class2_Sub41 local14;
		synchronized (this.aClass233_54) {
			local14 = (Class2_Sub41) this.aClass233_54.method5669((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface6_11.method6355(arg0)) {
					return null;
				}
				@Pc(34) Class199 local34 = super.anInterface6_11.method6357(arg0);
				@Pc(45) int local45 = local34.aBoolean428 || this.aBoolean688 ? 64 : this.anInt9480;
				local14 = new Class2_Sub41(arg0, local45, super.anInterface6_11.method6358(local45, arg0, 0.7F, local45), local34.anInt5691 != 1);
				this.aClass233_54.method5662(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean607 = true;
		return local14.method6754();
	}

	@OriginalMember(owner = "client!uj", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt9491, this.anInt9468, arg0, 0);
	}

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		local3.aBoolean739 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass364Array1.length; local1++) {
			this.aClass364Array1[local1].anInt10006 = this.aClass364Array1[local1].anInt10010;
			this.aClass364Array1[local1].anInt10003 = arg0;
			this.aClass364Array1[local1].anInt10010 = arg1;
			this.aClass364Array1[local1].anInt10009 = arg2;
			this.aClass364Array1[local1].aBoolean740 = true;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIZ)Lclient!kr;")
	@Override
	public Class20 method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt9491 + arg0;
		@Pc(16) int local16 = this.anInt9491 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray662[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class20_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class20_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!uj", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt9473 = (int) (arg1 * 65535.0F);
		this.anInt9478 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt9490 = (int) (arg3 * 65535.0F / local26);
		this.anInt9488 = (int) (arg4 * 65535.0F / local26);
		this.anInt9485 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7891(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas13 = null;
			this.aClass2_Sub27_1 = null;
			if (this.aClass333_1 == null) {
				this.anIntArray662 = null;
				this.anInt9491 = this.anInt9468 = 1;
				this.lb = this.anInt9481 = 1;
				this.method7989();
			}
			return;
		}
		@Pc(10) Class2_Sub27 local10 = (Class2_Sub27) this.aClass222_40.method5468((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas13 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt9464 = local18.width;
		this.anInt9463 = local18.height;
		this.aClass2_Sub27_1 = local10;
		if (this.aClass333_1 != null) {
			return;
		}
		this.anIntArray662 = local10.anIntArray501;
		this.anInt9491 = local10.anInt7426;
		this.anInt9468 = local10.anInt7427;
		if (this.anInt9491 != this.lb || this.anInt9468 != this.anInt9481) {
			this.anInt9483 = this.lb = this.anInt9491;
			this.anInt9474 = this.anInt9481 = this.anInt9468;
			this.aFloatArray75 = this.aFloatArray74 = new float[this.lb * this.anInt9481];
		}
		this.method7989();
		return;
	}

	@OriginalMember(owner = "client!uj", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass364Array1.length; local1++) {
			this.aClass364Array1[local1].anInt10010 = this.aClass364Array1[local1].anInt10006;
			this.aClass364Array1[local1].aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(IIIIII)V")
	private void method7986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt9486) {
			local8 = this.anInt9486;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt9494) {
			local21 = this.anInt9494;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg4 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt9471) {
					local91 = this.anInt9471;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9477) {
					local102 = this.anInt9477;
				}
				local116 = local91 + local30 * this.anInt9491;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray74[local116]) {
						this.anIntArray662[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt9471) {
					local91 = this.anInt9471;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9477 - 1) {
					local102 = this.anInt9477 - 1;
				}
				local116 = local91 + local30 * this.anInt9491;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray74[local116]) {
						this.anIntArray662[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(364) int local364;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt9471) {
					local102 = this.anInt9471;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9477) {
					local116 = this.anInt9477;
				}
				local118 = local102 + local30 * this.anInt9491;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray74[local118]) {
						local364 = this.anIntArray662[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray662[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt9471) {
					local102 = this.anInt9471;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9477 - 1) {
					local116 = this.anInt9477 - 1;
				}
				local118 = local102 + local30 * this.anInt9491;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray74[local118]) {
						local364 = this.anIntArray662[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray662[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(633) int local633;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt9471) {
					local91 = this.anInt9471;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9477) {
					local102 = this.anInt9477;
				}
				local116 = local91 + local30 * this.anInt9491;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray74[local116]) {
						local350 = this.anIntArray662[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray662[local116] = local364 - local643 | local643 - (local643 >>> 8);
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt9471) {
					local91 = this.anInt9471;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9477 - 1) {
					local102 = this.anInt9477 - 1;
				}
				local116 = local91 + local30 * this.anInt9491;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray74[local116]) {
						local350 = this.anIntArray662[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray662[local116] = local364 - local350 | local350 - (local350 >>> 8);
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "()V")
	@Override
	public void method7895() {
		if (this.aCanvas13 == null) {
			this.anInt9491 = 1;
			this.anInt9468 = 1;
			this.anIntArray662 = null;
			this.lb = 1;
			this.anInt9481 = 1;
			this.aFloatArray74 = null;
		} else {
			this.anIntArray662 = this.aClass2_Sub27_1.anIntArray501;
			this.anInt9491 = this.aClass2_Sub27_1.anInt7426;
			this.anInt9468 = this.aClass2_Sub27_1.anInt7427;
			this.aFloatArray74 = this.aFloatArray75;
			this.lb = this.anInt9483;
			this.anInt9481 = this.anInt9474;
		}
		this.aClass333_1 = null;
		this.method7989();
	}

	@OriginalMember(owner = "client!uj", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass6_Sub3_2.aFloat203 * (float) arg0 + this.aClass6_Sub3_2.aFloat208 * (float) arg1 + this.aClass6_Sub3_2.aFloat198 * (float) arg2 + this.aClass6_Sub3_2.aFloat204;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass6_Sub3_2.aFloat203 * (float) arg3 + this.aClass6_Sub3_2.aFloat208 * (float) arg4 + this.aClass6_Sub3_2.aFloat198 * (float) arg5 + this.aClass6_Sub3_2.aFloat204;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt9482 && local57 < (float) this.anInt9482) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt9470 && local57 > (float) this.anInt9470) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat200 * (float) arg0 + this.aClass6_Sub3_2.aFloat201 * (float) arg1 + this.aClass6_Sub3_2.aFloat197 * (float) arg2 + this.aClass6_Sub3_2.aFloat206) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat200 * (float) arg3 + this.aClass6_Sub3_2.aFloat201 * (float) arg4 + this.aClass6_Sub3_2.aFloat197 * (float) arg5 + this.aClass6_Sub3_2.aFloat206) / local57);
		if (local128 < this.anInt9472 && local160 < this.anInt9472) {
			local1 |= 0x1;
		} else if (local128 > this.anInt9489 && local160 > this.anInt9489) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat207 * (float) arg0 + this.aClass6_Sub3_2.aFloat199 * (float) arg1 + this.aClass6_Sub3_2.aFloat202 * (float) arg2 + this.aClass6_Sub3_2.aFloat205) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat207 * (float) arg3 + this.aClass6_Sub3_2.aFloat199 * (float) arg4 + this.aClass6_Sub3_2.aFloat202 * (float) arg5 + this.aClass6_Sub3_2.aFloat205) / local57);
		if (local217 < this.anInt9476 && local249 < this.anInt9476) {
			local1 |= 0x4;
		} else if (local217 > this.anInt9487 && local249 > this.anInt9487) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uj", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass6_Sub3_2.aFloat204 + this.aClass6_Sub3_2.aFloat203 * (float) arg0 + this.aClass6_Sub3_2.aFloat208 * (float) arg1 + this.aClass6_Sub3_2.aFloat198 * (float) arg2;
		if (local24 < (float) this.anInt9482 || local24 > (float) this.anInt9470) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat206 + this.aClass6_Sub3_2.aFloat200 * (float) arg0 + this.aClass6_Sub3_2.aFloat201 * (float) arg1 + this.aClass6_Sub3_2.aFloat197 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat205 + this.aClass6_Sub3_2.aFloat207 * (float) arg0 + this.aClass6_Sub3_2.aFloat199 * (float) arg1 + this.aClass6_Sub3_2.aFloat202 * (float) arg2) / local24);
		if (local81 >= this.anInt9472 && local81 <= this.anInt9489 && local113 >= this.anInt9476 && local113 <= this.anInt9487) {
			arg3[0] = local81 - this.anInt9472;
			arg3[1] = local113 - this.anInt9476;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7974(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub27 local8 = (Class2_Sub27) this.aClass222_40.method5468((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static322.method4852(arg0, arg2, arg1);
			this.aClass222_40.method5476(local8, (long) arg0.hashCode());
		} else if (local8.anInt7426 != arg1 || local8.anInt7427 != arg2) {
			this.method7924(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!oo;I)V")
	@Override
	public void method7972(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		@Pc(7) Class11_Sub5 local7 = arg0.aClass34_1.aClass11_Sub5_1;
		for (@Pc(10) Class11_Sub5 local10 = local7.aClass11_Sub5_10; local10 != local7; local10 = local10.aClass11_Sub5_10) {
			@Pc(14) Class11_Sub5_Sub1 local14 = (Class11_Sub5_Sub1) local10;
			@Pc(19) int local19 = local14.anInt4043 >> 12;
			@Pc(24) int local24 = local14.anInt4041 >> 12;
			@Pc(29) int local29 = local14.anInt4044 >> 12;
			@Pc(54) float local54 = this.aClass6_Sub3_2.aFloat204 + this.aClass6_Sub3_2.aFloat203 * (float) local19 + this.aClass6_Sub3_2.aFloat208 * (float) local24 + this.aClass6_Sub3_2.aFloat198 * (float) local29;
			if (!(local54 < (float) this.anInt9482) && !(local54 > (float) local3.anInt10013)) {
				@Pc(103) int local103 = this.anInt9475 + (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat206 + this.aClass6_Sub3_2.aFloat200 * (float) local19 + this.aClass6_Sub3_2.aFloat201 * (float) local24 + this.aClass6_Sub3_2.aFloat197 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt9469 + (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat205 + this.aClass6_Sub3_2.aFloat207 * (float) local19 + this.aClass6_Sub3_2.aFloat199 * (float) local24 + this.aClass6_Sub3_2.aFloat202 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt9471 && local103 <= this.anInt9477 && local139 >= this.anInt9486 && local139 <= this.anInt9494) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method7992(local14, local103, local139, (int) local54, (local14.anInt4047 * this.anInt9466 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7963(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass2_Sub27_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas13.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt9491 && local21.y + arg3 <= this.anInt9468 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass2_Sub27_1.method6242(local21.y + arg3, local21.height, local21.width, local21.x + arg2, local21.x, local14, local21.y);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIIIII)V")
	private void method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt9471 || arg0 >= this.anInt9477) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt9491;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt9486 && arg1 + local37 < this.anInt9494 && local27 < arg4) {
					this.anIntArray662[local15 + local37 * this.anInt9491] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(100) int local100 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(106) int local106 = 0;
		while (local106 < arg2) {
			if (arg1 + local106 >= this.anInt9486 && arg1 + local106 < this.anInt9494 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt9491;
				@Pc(134) int local134 = this.anIntArray662[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray662[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray379;
		@Pc(8) int[] local8 = local2.anIntArray380;
		@Pc(17) int local17 = this.anInt9486 > arg7 ? this.anInt9486 : arg7;
		@Pc(32) int local32 = this.anInt9494 < arg7 + local5.length ? this.anInt9494 : arg7 + local5.length;
		@Pc(36) int local36 = arg10 << 8;
		@Pc(40) int local40 = arg8 << 8;
		@Pc(44) int local44 = arg9 << 8;
		@Pc(48) int local48 = local40 + local44;
		arg10 = local36 % local48;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (arg2 + arg3 < 0) {
			local77 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local81 = local77 % local48;
			local36 = local48 + local40 - arg10 - local81;
			arg10 = local36 % local48;
			if (arg10 < 0) {
				arg10 += local48;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(159) int local159;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(199) int local199;
		@Pc(299) int local299;
		@Pc(316) int local316;
		@Pc(142) int local142;
		@Pc(128) int local128;
		@Pc(263) int local263;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local142 = arg2 << 16;
			local77 = (int) Math.floor((double) local142 / (double) arg3 + 0.5D);
			local81 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
			local128 = arg3 + arg1;
			local159 = arg4 >>> 24;
			if (local159 == 255) {
				while (arg1 <= local128) {
					local172 = arg0 >> 16;
					local176 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt9471 && local172 < this.anInt9477 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray662[local172 + arg1 * this.anInt9491] = arg4;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			} else {
				local263 = ((arg4 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local159 >> 8 & 0xFF00) + (local159 << 24);
				local172 = 256 - local159;
				while (arg1 <= local128) {
					local176 = arg0 >> 16;
					local199 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt9471 && local176 < this.anInt9477 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt9491;
						local316 = this.anIntArray662[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray662[local176 + arg1 * this.anInt9491] = local263 + local707;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local128 = arg3 << 16;
		local77 = (int) Math.floor((double) local128 / (double) arg2 + 0.5D);
		local142 = arg2 + arg0;
		local81 = arg4 >>> 24;
		local159 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
		if (local81 == 255) {
			while (arg0 <= local142) {
				local172 = arg1 >> 16;
				local176 = local172 - arg7;
				if (arg0 >= this.anInt9471 && arg0 < this.anInt9477 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray662[arg0 + local172 * this.anInt9491] = arg4;
					}
				}
				arg1 += local77;
				arg0++;
				local36 = arg10 + local159;
				arg10 = local36 % local48;
			}
			return;
		}
		local263 = ((arg4 & 0xFF00FF) * local81 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local81 >> 8 & 0xFF00) + (local81 << 24);
		local172 = 256 - local81;
		while (arg0 <= local142) {
			local176 = arg1 >> 16;
			local199 = local176 - arg7;
			if (arg0 >= this.anInt9471 && arg0 < this.anInt9477 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt9491;
					@Pc(321) int local321 = this.anIntArray662[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray662[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	@Override
	public void method7890(@OriginalArg(0) int arg0) {
		this.aClass364Array1[arg0].method8378(Thread.currentThread());
	}

	@OriginalMember(owner = "client!uj", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt9491) {
			arg2 = this.anInt9491;
		}
		if (arg3 > this.anInt9468) {
			arg3 = this.anInt9468;
		}
		this.anInt9471 = arg0;
		this.anInt9477 = arg2;
		this.anInt9486 = arg1;
		this.anInt9494 = arg3;
		this.method7984();
	}

	@OriginalMember(owner = "client!uj", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt9471 == 0 && this.anInt9477 == this.anInt9491 && this.anInt9486 == 0 && this.anInt9494 == this.anInt9468) {
			local19 = this.aFloatArray74.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
				this.aFloatArray74[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray74[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt9477 - this.anInt9471;
		local25 = this.anInt9494 - this.anInt9486;
		local27 = this.anInt9491 - local19;
		@Pc(116) int local116 = this.anInt9471 + this.anInt9486 * this.anInt9491;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray74[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
	@Override
	public void method7916(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uj", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt9471) {
			arg2 -= this.anInt9471 - arg0;
			arg0 = this.anInt9471;
		}
		if (arg1 < this.anInt9486) {
			arg3 -= this.anInt9486 - arg1;
			arg1 = this.anInt9486;
		}
		if (arg0 + arg2 > this.anInt9477) {
			arg2 = this.anInt9477 - arg0;
		}
		if (arg1 + arg3 > this.anInt9494) {
			arg3 = this.anInt9494 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt9477 || arg1 > this.anInt9494) {
			return;
		}
		@Pc(67) int local67 = this.anInt9491 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt9491;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(217) int local217;
			if (arg5 == 1) {
				@Pc(201) int local201 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local78 & 0xFF00FF00);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local217 = this.anIntArray662[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray662[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray662[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray662[local74++] = local217 - local294 | local294 - (local294 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray662[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!uj", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt9470;
	}

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "()Z")
	@Override
	public boolean method7915() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7945(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "()V")
	@Override
	public void method7919() {
	}

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "()V")
	@Override
	protected void method7970() {
		if (this.aBoolean686) {
			Static410.method6301(true, false);
			this.aBoolean686 = false;
		}
		this.aClass2_Sub27_1 = null;
		this.aCanvas13 = null;
		this.anInt9464 = 0;
		this.anInt9463 = 0;
		this.aClass222_40 = null;
		this.aBoolean687 = true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([I)V")
	@Override
	public void method7887(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9491;
		arg0[1] = this.anInt9468;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sfa;Lclient!sfa;FLclient!sfa;)Lclient!sfa;")
	@Override
	public Class22 method7923(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7946(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			this.method7891(null);
		}
		@Pc(15) Class2_Sub27 local15 = (Class2_Sub27) this.aClass222_40.method5468((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8599();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray379;
		@Pc(8) int[] local8 = local2.anIntArray380;
		@Pc(17) int local17 = this.anInt9486 > arg7 ? this.anInt9486 : arg7;
		@Pc(32) int local32 = this.anInt9494 < arg7 + local5.length ? this.anInt9494 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt9471 && local129 < this.anInt9477 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray662[local129 + arg1 * this.anInt9491] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt9471 && local133 < this.anInt9477 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt9491;
						local248 = this.anIntArray662[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray662[local133 + arg1 * this.anInt9491] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt9471) {
			arg1 += local83 * (this.anInt9471 - arg0);
			arg0 = this.anInt9471;
		}
		if (arg2 >= this.anInt9477) {
			arg2 = this.anInt9477 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray662[arg0 + local129 * this.anInt9491] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt9491;
					local248 = this.anIntArray662[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray662[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "()V")
	@Override
	public void method7917() {
		this.aClass233_54.method5663();
		this.aClass233_53.method5663();
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "(I)I")
	public int method7988(@OriginalArg(0) int arg0) {
		return super.anInterface6_11.method6357(arg0).anInt5691;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7929(@OriginalArg(0) Class2_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!uaa;)V")
	@Override
	public void method7949(@OriginalArg(0) Interface24 arg0) {
		@Pc(2) Class333 local2 = (Class333) arg0;
		this.anInt9491 = local2.anInt9274;
		this.anInt9468 = local2.anInt9278;
		this.anIntArray662 = local2.anIntArray650;
		this.aClass333_1 = local2;
		this.lb = local2.anInt9274;
		this.anInt9481 = local2.anInt9278;
		this.aFloatArray74 = local2.aFloatArray71;
		this.method7989();
	}

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "(I)V")
	@Override
	public void method7947() {
		Static26.anInt755 = 10000;
		Static26.anInt757 = 10000;
		if (this.anInt9492 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7938(this.anInt9492);
		this.method7890(0);
	}

	@OriginalMember(owner = "client!uj", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt9486) {
			local8 = this.anInt9486;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt9494) {
			local21 = this.anInt9494;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt9471) {
					local91 = this.anInt9471;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9477) {
					local102 = this.anInt9477;
				}
				local116 = local91 + local30 * this.anInt9491;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray662[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt9471) {
					local91 = this.anInt9471;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9477 - 1) {
					local102 = this.anInt9477 - 1;
				}
				local116 = local91 + local30 * this.anInt9491;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray662[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt9471) {
				local102 = this.anInt9471;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt9477) {
				local116 = this.anInt9477;
			}
			local118 = local102 + local30 * this.anInt9491;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray662[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray662[local118++] = local277 + local360;
			}
			local30++;
			local44 -= local40-- + local40;
			local48 -= local40 + local40;
		}
		local36 = arg2;
		local40 = -local40;
		local48 = local40 * local40 + local34;
		local44 = local48 - arg2;
		local48 -= local40;
		while (local30 < local21) {
			while (local48 > local34 && local44 > local34) {
				local48 -= local36-- + local36;
				local44 -= local36 + local36;
			}
			local102 = arg0 - local36;
			if (local102 < this.anInt9471) {
				local102 = this.anInt9471;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt9477 - 1) {
				local116 = this.anInt9477 - 1;
			}
			local118 = local102 + local30 * this.anInt9491;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray662[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray662[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "()Z")
	@Override
	public boolean method7943() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		local3.anInt10003 = arg0;
		local3.anInt10010 = arg1;
		local3.anInt10009 = arg2;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method7939(@OriginalArg(0) Class247 arg0) {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		@Pc(7) Class11_Sub5 local7 = arg0.aClass34_1.aClass11_Sub5_1;
		for (@Pc(10) Class11_Sub5 local10 = local7.aClass11_Sub5_10; local10 != local7; local10 = local10.aClass11_Sub5_10) {
			@Pc(14) Class11_Sub5_Sub1 local14 = (Class11_Sub5_Sub1) local10;
			@Pc(19) int local19 = local14.anInt4043 >> 12;
			@Pc(24) int local24 = local14.anInt4041 >> 12;
			@Pc(29) int local29 = local14.anInt4044 >> 12;
			@Pc(54) float local54 = this.aClass6_Sub3_2.aFloat204 + this.aClass6_Sub3_2.aFloat203 * (float) local19 + this.aClass6_Sub3_2.aFloat208 * (float) local24 + this.aClass6_Sub3_2.aFloat198 * (float) local29;
			if (!(local54 < (float) this.anInt9482) && !(local54 > (float) local3.anInt10013)) {
				@Pc(102) int local102 = this.anInt9475 + (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat206 + this.aClass6_Sub3_2.aFloat200 * (float) local19 + this.aClass6_Sub3_2.aFloat201 * (float) local24 + this.aClass6_Sub3_2.aFloat197 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt9469 + (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat205 + this.aClass6_Sub3_2.aFloat207 * (float) local19 + this.aClass6_Sub3_2.aFloat199 * (float) local24 + this.aClass6_Sub3_2.aFloat202 * (float) local29) / local54);
				if (local102 >= this.anInt9471 && local102 <= this.anInt9477 && local137 >= this.anInt9486 && local137 <= this.anInt9494) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method7992(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt4047 * this.anInt9466 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9471 < arg0) {
			this.anInt9471 = arg0;
		}
		if (this.anInt9486 < arg1) {
			this.anInt9486 = arg1;
		}
		if (this.anInt9477 > arg2) {
			this.anInt9477 = arg2;
		}
		if (this.anInt9494 > arg3) {
			this.anInt9494 = arg3;
		}
		this.method7984();
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I")
	@Override
	public int method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZ)Lclient!kr;")
	@Override
	public Class20 method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class20_Sub1_Sub3(this, arg0, arg1) : new Class20_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[Lclient!bh;)V")
	@Override
	public void method7926(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
	}

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "()V")
	private void method7989() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9492; local1++) {
			this.aClass364Array1[local1].method8376();
		}
		this.la();
	}

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "()V")
	@Override
	public void method7940() {
	}

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "()Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt9491;
		@Pc(35) int local35 = this.anInt9491 - arg2;
		if (arg1 + arg3 > this.anInt9494) {
			arg3 -= arg1 + arg3 - this.anInt9494;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt9486) {
			local59 = this.anInt9486 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt9491;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt9477) {
			local59 = arg0 + arg2 - this.anInt9477;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt9471) {
			local59 = this.anInt9471 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray662[local30++] = arg4;
					} else {
						this.anIntArray662[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray662[local30];
					this.anIntArray662[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray662[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray662[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "()Lclient!sia;")
	@Override
	public Class306 method7942() {
		return new Class306(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray379;
		@Pc(8) int[] local8 = local2.anIntArray380;
		@Pc(20) int local20;
		if (this.anInt9494 < arg3 + local5.length) {
			local20 = this.anInt9494 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt9486 > arg3) {
			local33 = this.anInt9486 - arg3;
			arg3 = this.anInt9486;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt9491;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt9471 > local58) {
				local62 -= this.anInt9471 - local58;
				local58 = this.anInt9471;
			}
			if (this.anInt9477 < local58 + local62) {
				local62 = this.anInt9477 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray662[local58++] = arg0;
			}
			local49 += this.anInt9491;
		}
	}

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt9467;
		this.anInt9467 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass2_Sub27_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas13.getGraphics();
			this.aClass2_Sub27_1.method6242(arg1, this.anInt9463, this.anInt9464, arg0, 0, local14, 0);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!uj", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt9491 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray662[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt9471 || arg0 >= this.anInt9477) {
			return;
		}
		if (arg1 < this.anInt9486) {
			arg2 -= this.anInt9486 - arg1;
			arg1 = this.anInt9486;
		}
		if (arg1 + arg2 > this.anInt9494) {
			arg2 = this.anInt9494 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9491;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray662[local40 + local54 * this.anInt9491] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt9491;
				local116 = this.anIntArray662[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray662[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt9491;
				local111 = this.anIntArray662[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray662[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fw;Z)Lclient!kr;")
	@Override
	public Class20 method7969(@OriginalArg(0) Class120 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray261;
		@Pc(5) byte[] local5 = arg0.aByteArray36;
		@Pc(8) int local8 = arg0.anInt3710;
		@Pc(11) int local11 = arg0.anInt3707;
		@Pc(76) Class20_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray35 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class20_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray35;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class20_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class20_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.method4592(arg0.anInt3708, arg0.anInt3705, arg0.anInt3706, arg0.anInt3709);
		return local76;
	}

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "()Z")
	@Override
	public boolean method7968() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9471;
		arg0[1] = this.anInt9486;
		arg0[2] = this.anInt9477;
		arg0[3] = this.anInt9494;
	}

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt9491 + arg0;
		@Pc(13) int local13 = arg1 * this.lb + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray662;
		@Pc(24) float[] local24 = this.aFloatArray74;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static649.method4862(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static649.method4862(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static649.method4861(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static649.method4861(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!uj", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9475 = arg0;
		this.anInt9469 = arg1;
		this.anInt9466 = arg2;
		this.anInt9493 = arg3;
		this.method7984();
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "()Z")
	@Override
	public boolean method7912() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lclient!vi;")
	@Override
	public Interface25 method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class376(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "()Z")
	@Override
	public boolean method7904() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		this.anInt9482 = arg0;
		this.anInt9470 = arg1;
		local3.anInt10013 = this.anInt9470 - 255;
	}

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7924(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub27 local8 = (Class2_Sub27) this.aClass222_40.method5468((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8599();
		local8 = Static322.method4852(arg0, arg2, arg1);
		this.aClass222_40.method5476(local8, (long) arg0.hashCode());
		if (this.aCanvas13 != arg0 || this.aClass333_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt9464 = local37.width;
		this.anInt9463 = local37.height;
		this.aClass2_Sub27_1 = local8;
		this.anIntArray662 = local8.anIntArray501;
		this.anInt9491 = local8.anInt7426;
		this.anInt9468 = local8.anInt7427;
		if (this.anInt9491 != this.lb || this.anInt9468 != this.anInt9481) {
			this.anInt9483 = this.lb = this.anInt9491;
			this.anInt9474 = this.anInt9481 = this.anInt9468;
			this.aFloatArray75 = this.aFloatArray74 = new float[this.lb * this.anInt9481];
		}
		this.method7989();
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	@Override
	public void method7911(@OriginalArg(0) int arg0) {
		this.anInt9480 = arg0;
		this.aClass233_54.method5663();
	}

	@OriginalMember(owner = "client!uj", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt9471 = 0;
		this.anInt9486 = 0;
		this.anInt9477 = this.anInt9491;
		this.anInt9494 = this.anInt9468;
		this.method7984();
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(II)I")
	@Override
	public int method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "(I)[I")
	public int[] method7990(@OriginalArg(0) int arg0) {
		@Pc(2) Class233 local2 = this.aClass233_54;
		@Pc(12) Class2_Sub41 local12;
		synchronized (this.aClass233_54) {
			local12 = (Class2_Sub41) this.aClass233_54.method5669((long) arg0);
			if (local12 == null) {
				if (!super.anInterface6_11.method6355(arg0)) {
					return null;
				}
				@Pc(32) Class199 local32 = super.anInterface6_11.method6357(arg0);
				@Pc(43) int local43 = local32.aBoolean428 || this.aBoolean688 ? 64 : this.anInt9480;
				local12 = new Class2_Sub41(arg0, local43, super.anInterface6_11.method6354(0.7F, local43, true, arg0, local43), local32.anInt5691 != 1);
				this.aClass233_54.method5662(local12, (long) arg0);
			}
		}
		local12.aBoolean607 = true;
		return local12.method6754();
	}

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "()Z")
	@Override
	public boolean method7936() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass6_Sub3_2.aFloat204 + this.aClass6_Sub3_2.aFloat203 * (float) arg0 + this.aClass6_Sub3_2.aFloat208 * (float) arg1 + this.aClass6_Sub3_2.aFloat198 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat206 + this.aClass6_Sub3_2.aFloat200 * (float) arg0 + this.aClass6_Sub3_2.aFloat201 * (float) arg1 + this.aClass6_Sub3_2.aFloat197 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat205 + this.aClass6_Sub3_2.aFloat207 * (float) arg0 + this.aClass6_Sub3_2.aFloat199 * (float) arg1 + this.aClass6_Sub3_2.aFloat202 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt9472;
		arg3[1] = local105 - this.anInt9476;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub11 method7920(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ww;IIII)Lclient!ka;")
	@Override
	public Class25 method7975(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class25_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass6_Sub3_2.aFloat203 * (float) arg0 + this.aClass6_Sub3_2.aFloat208 * (float) arg1 + this.aClass6_Sub3_2.aFloat198 * (float) arg2 + this.aClass6_Sub3_2.aFloat204;
		@Pc(49) float local49 = this.aClass6_Sub3_2.aFloat203 * (float) arg3 + this.aClass6_Sub3_2.aFloat208 * (float) arg4 + this.aClass6_Sub3_2.aFloat198 * (float) arg5 + this.aClass6_Sub3_2.aFloat204;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt9482 && local49 < (float) this.anInt9482) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt9470 && local49 > (float) this.anInt9470) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat200 * (float) arg0 + this.aClass6_Sub3_2.aFloat201 * (float) arg1 + this.aClass6_Sub3_2.aFloat197 * (float) arg2 + this.aClass6_Sub3_2.aFloat206) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat200 * (float) arg3 + this.aClass6_Sub3_2.aFloat201 * (float) arg4 + this.aClass6_Sub3_2.aFloat197 * (float) arg5 + this.aClass6_Sub3_2.aFloat206) / (float) arg6);
		if (local117 < this.anInt9472 && local150 < this.anInt9472) {
			local51 |= 0x1;
		} else if (local117 > this.anInt9489 && local150 > this.anInt9489) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat207 * (float) arg0 + this.aClass6_Sub3_2.aFloat199 * (float) arg1 + this.aClass6_Sub3_2.aFloat202 * (float) arg2 + this.aClass6_Sub3_2.aFloat205) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat207 * (float) arg3 + this.aClass6_Sub3_2.aFloat199 * (float) arg4 + this.aClass6_Sub3_2.aFloat202 * (float) arg5 + this.aClass6_Sub3_2.aFloat205) / (float) arg6);
		if (local208 < this.anInt9476 && local241 < this.anInt9476) {
			local51 |= 0x4;
		} else if (local208 > this.anInt9487 && local241 > this.anInt9487) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "(I)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0) {
		this.anInt9492 = arg0;
		this.aClass364Array1 = new Class364[this.anInt9492];
		for (@Pc(9) int local9 = 0; local9 < this.anInt9492; local9++) {
			this.aClass364Array1[local9] = new Class364(this);
		}
	}

	@OriginalMember(owner = "client!uj", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass6_Sub3_2.aFloat204 + this.aClass6_Sub3_2.aFloat203 * (float) arg0 + this.aClass6_Sub3_2.aFloat208 * (float) arg1 + this.aClass6_Sub3_2.aFloat198 * (float) arg2;
		if (local24 < (float) this.anInt9482 || local24 > (float) this.anInt9470) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt9466 * (this.aClass6_Sub3_2.aFloat206 + this.aClass6_Sub3_2.aFloat200 * (float) arg0 + this.aClass6_Sub3_2.aFloat201 * (float) arg1 + this.aClass6_Sub3_2.aFloat197 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt9493 * (this.aClass6_Sub3_2.aFloat205 + this.aClass6_Sub3_2.aFloat207 * (float) arg0 + this.aClass6_Sub3_2.aFloat199 * (float) arg1 + this.aClass6_Sub3_2.aFloat202 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt9472 && local82 <= this.anInt9489 && local115 >= this.anInt9476 && local115 <= this.anInt9487) {
			arg4[0] = local82 - this.anInt9472;
			arg4[1] = local115 - this.anInt9476;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "()Z")
	@Override
	public boolean method7944() {
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class112 method7957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class112_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "()I")
	@Override
	public int method7953() {
		return 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface6_11.method6357(arg6).aBoolean427) {
			this.method7986(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt9495 != arg6) {
			@Pc(26) Class20 local26 = (Class20) this.aClass233_53.method5669((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method7985(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method7983(arg6) ? 64 : this.anInt9480;
				local26 = this.method7913(local44, local32, local44, local44);
				this.aClass233_53.method5662(local26, (long) arg6);
			}
			this.anInt9495 = arg6;
			this.aClass20_34 = local26;
		}
		((Class20_Sub1) this.aClass20_34).method4093(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
	@Override
	public void method7893() {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class364 local3 = this.method7979(Thread.currentThread());
		@Pc(6) Class28 local6 = local3.aClass28_2;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		local10 += local44 >> 16;
		local14 += local50 >> 16;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(78) int local78 = arg5 * local50 >> 17;
		@Pc(86) int local86 = arg5 * local50 + 1 >> 17;
		@Pc(92) int local92 = arg5 * local44 >> 17;
		@Pc(100) int local100 = arg5 * local44 + 1 >> 17;
		@Pc(105) int local105 = arg0 - local6.method681();
		@Pc(110) int local110 = arg1 - local6.method690();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt768 = 0;
		this.C(false);
		local6.aBoolean60 = local114 < 0 || local114 > local6.anInt764 || local118 < 0 || local118 > local6.anInt764 || local124 < 0 || local124 > local6.anInt764;
		local6.method683((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean60 = local114 < 0 || local114 > local6.anInt764 || local124 < 0 || local124 > local6.anInt764 || local130 < 0 || local130 > local6.anInt764;
		local6.method683((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fa;IIII)V")
	private void method7992(@OriginalArg(0) Class11_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt4046;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method7986(arg1, arg2, arg3, arg4, arg0.anInt4045, 1);
			return;
		}
		if (this.anInt9495 != local2) {
			@Pc(33) Class20 local33 = (Class20) this.aClass233_53.method5669((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method7985(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method7983(local2) ? 64 : this.anInt9480;
				local33 = this.method7913(local50, local39, local50, local50);
				this.aClass233_53.method5662(local33, (long) local2);
			}
			this.anInt9495 = local2;
			this.aClass20_34 = local33;
		}
		local8++;
		((Class20_Sub1) this.aClass20_34).method4093(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt4045, 1);
	}
}
