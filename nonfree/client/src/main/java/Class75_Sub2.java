import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!ed", name = "ob", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	private int anInt2328;

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "Lclient!wu;")
	public Class6_Sub41 aClass6_Sub41_1;

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "Lclient!dfa;")
	private Class74 aClass74_12;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!ed", name = "ab", descriptor = "[F")
	public float[] aFloatArray27;

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
	public int anInt2333;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	private int anInt2334;

	@OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
	public int anInt2335;

	@OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
	private int anInt2336;

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "Lclient!ui;")
	private final Class359 aClass359_15;

	@OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
	public int anInt2337;

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	public int anInt2340;

	@OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
	public int anInt2341;

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
	public int anInt2342;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[F")
	public float[] aFloatArray28;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	public int anInt2343;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
	public int anInt2344;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	public int anInt2345;

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!ed", name = "sb", descriptor = "I")
	public int anInt2346;

	@OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
	public int anInt2347;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "[Lclient!nda;")
	private Class246[] aClass246Array1;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
	private int anInt2351;

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lclient!eo;")
	private Class102 aClass102_1;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
	public int anInt2353;

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lclient!ui;")
	private final Class359 aClass359_16;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
	private int anInt2357;

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "Lclient!fc;")
	public Class109_Sub1 aClass109_Sub1_1;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
	private int anInt2359;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "Lclient!tb;")
	private Class49 aClass49_7;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
	private int anInt2360;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class75_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method6652(arg0, arg2, arg3);
			this.method6657(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method6672();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class75_Sub2(@OriginalArg(0) Interface11 arg0) {
		super(arg0);
		this.aBoolean197 = false;
		this.aBoolean198 = false;
		this.aClass74_12 = new Class74(4);
		this.anInt2341 = 0;
		this.aBoolean199 = false;
		this.anInt2333 = 3500;
		this.anInt2335 = 45823;
		this.anInt2347 = 0;
		this.anInt2355 = 512;
		this.anInt2339 = 512;
		this.anInt2342 = 50;
		this.anInt2354 = 128;
		this.anInt2356 = 0;
		this.anInt2357 = 0;
		this.anInt2348 = 0;
		this.anInt2358 = 75518;
		this.anInt2359 = 0;
		this.lb = 78642;
		this.aClass359_16 = new Class359(16);
		this.anInt2360 = -1;
		try {
			this.aClass359_15 = new Class359(256);
			this.aClass109_Sub1_1 = new Class109_Sub1();
			this.method6694(1);
			this.method6696(0);
			Static529.method7605(true, true);
			this.aBoolean198 = true;
			this.anInt2328 = (int) Static549.method7758();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method6672();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(I)Z")
	public boolean method2300(@OriginalArg(0) int arg0) {
		return this.aBoolean199 || super.anInterface11_10.method6027(arg0).aBoolean630;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	@Override
	public void method6706(@OriginalArg(0) int arg0) {
		this.anInt2354 = arg0;
		this.aClass359_15.method8507();
	}

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt2344, this.anInt2353, this.anInt2339, this.anInt2355 };
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)V")
	@Override
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas6 == null || this.aClass6_Sub41_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(19) Graphics local19 = this.aCanvas6.getGraphics();
			this.aClass6_Sub41_1.method8629(0, arg0, this.anInt2330, 0, local19, arg1, this.anInt2329);
		} catch (@Pc(34) Exception local34) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIF)Lclient!ta;")
	@Override
	public Class6_Sub10 method6647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "()Lclient!cba;")
	@Override
	public Class52 method6699() {
		return new Class52(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!bha;Lclient!kb;)Lclient!tha;")
	@Override
	public Interface24 method6641(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface14 arg1) {
		return new Class102(this, (Class49) arg0, (Class147) arg1);
	}

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "()Z")
	@Override
	public boolean method6646() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([IIIIIZ)Lclient!tb;")
	@Override
	public Class49 method6675(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class49_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class49_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class49_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class49_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2347 || arg1 >= this.anInt2341) {
			return;
		}
		if (arg0 < this.anInt2348) {
			arg2 -= this.anInt2348 - arg0;
			arg0 = this.anInt2348;
		}
		if (arg0 + arg2 > this.anInt2356) {
			arg2 = this.anInt2356 - arg0;
		}
		@Pc(43) int local43 = arg0 + arg1 * this.anInt2345;
		@Pc(47) int local47 = arg3 >>> 24;
		@Pc(61) int local61;
		if (arg4 == 0 || arg4 == 1 && local47 == 255) {
			for (local61 = 0; local61 < arg2; local61++) {
				this.anIntArray128[local43 + local61] = arg3;
			}
			return;
		}
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(102) int local102 = ((arg3 & 0xFF00FF) * local47 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local47 >> 8 & 0xFF00) + (local47 << 24);
			local61 = 256 - local47;
			for (local108 = 0; local108 < arg2; local108++) {
				local116 = this.anIntArray128[local43 + local108];
				local116 = ((local116 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local61 >> 8 & 0xFF00);
				this.anIntArray128[local43 + local108] = local102 + local116;
			}
		} else if (arg4 == 2) {
			for (local61 = 0; local61 < arg2; local61++) {
				local108 = this.anIntArray128[local43 + local61];
				local116 = arg3 + local108;
				@Pc(176) int local176 = (arg3 & 0xFF00FF) + (local108 & 0xFF00FF);
				@Pc(186) int local186 = (local176 & 0x1000100) + (local116 - local176 & 0x10000);
				this.anIntArray128[local43 + local61] = local116 - local186 | local186 - (local186 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2335 = (int) (arg1 * 65535.0F);
		this.lb = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2350 = (int) (arg3 * 65535.0F / local26);
		this.anInt2352 = (int) (arg4 * 65535.0F / local26);
		this.anInt2346 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "(I)Z")
	public boolean method2301(@OriginalArg(0) int arg0) {
		return super.anInterface11_10.method6027(arg0).aBoolean631 || super.anInterface11_10.method6027(arg0).aBoolean629;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "()Z")
	@Override
	public boolean method6640() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(31) int local31;
		@Pc(35) int local35;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2316(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local31 = arg5 + arg6;
				local35 = arg7 % local31;
				local35 = local31 + arg5 - local35 - (-arg2 + 1) % local31;
				arg7 = local35 % local31;
				if (arg7 < 0) {
					arg7 += local31;
				}
				this.method2316(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local35 = arg7 << 8;
			@Pc(149) int local149 = arg5 << 8;
			@Pc(153) int local153 = arg6 << 8;
			local31 = local149 + local153;
			arg7 = local35 % local31;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local182 = local178 % local31;
				local35 = local31 + local149 - arg7 - local182;
				arg7 = local35 % local31;
				if (arg7 < 0) {
					arg7 += local31;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(278) int local278;
			@Pc(371) int local371;
			@Pc(405) int local405;
			@Pc(410) int local410;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(362) int local362;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (local182 == 255 && true) {
					while (arg0 <= local243) {
						local278 = arg1 >> 16;
						if (arg0 >= this.anInt2348 && arg0 < this.anInt2356 && local278 >= this.anInt2347 && local278 < this.anInt2341 && arg7 < local149) {
							this.anIntArray128[arg0 + local278 * this.anInt2345] = arg4;
						}
						arg1 += local178;
						arg0++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				} else {
					local362 = ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 << 24);
					local278 = 256 - local182;
					while (arg0 <= local243) {
						local371 = arg1 >> 16;
						if (arg0 >= this.anInt2348 && arg0 < this.anInt2356 && local371 >= this.anInt2347 && local371 < this.anInt2341 && arg7 < local149) {
							local405 = arg0 + local371 * this.anInt2345;
							local410 = this.anIntArray128[local405];
							local410 = ((local410 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local410 & 0xFF00) * local278 >> 8 & 0xFF00);
							this.anIntArray128[local405] = local362 + local410;
						}
						arg1 += local178;
						arg0++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (local182 == 255 && true) {
					while (arg1 <= local229) {
						local278 = arg0 >> 16;
						if (arg1 >= this.anInt2347 && arg1 < this.anInt2341 && local278 >= this.anInt2348 && local278 < this.anInt2356 && arg7 < local149) {
							this.anIntArray128[local278 + arg1 * this.anInt2345] = arg4;
						}
						arg0 += local178;
						arg1++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				} else {
					local362 = ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 << 24);
					local278 = 256 - local182;
					while (arg1 <= local229) {
						local371 = arg0 >> 16;
						if (arg1 >= this.anInt2347 && arg1 < this.anInt2341 && local371 >= this.anInt2348 && local371 < this.anInt2356 && arg7 < local149) {
							local405 = local371 + arg1 * this.anInt2345;
							local410 = this.anIntArray128[local405];
							@Pc(773) int local773 = ((local410 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local410 & 0xFF00) * local278 >> 8 & 0xFF00);
							this.anIntArray128[local371 + arg1 * this.anInt2345] = local362 + local773;
						}
						arg0 += local178;
						arg1++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method2312(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local31 = arg5 + arg6;
			local35 = arg7 % local31;
			local35 = local31 + arg5 - local35 - (-arg3 + 1) % local31;
			arg7 = local35 % local31;
			if (arg7 < 0) {
				arg7 += local31;
			}
			this.method2312(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "()I")
	@Override
	public int method6689() {
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2348;
		arg0[1] = this.anInt2347;
		arg0[2] = this.anInt2356;
		arg0[3] = this.anInt2341;
	}

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "(I)[I")
	public int[] method2302(@OriginalArg(0) int arg0) {
		@Pc(2) Class359 local2 = this.aClass359_15;
		@Pc(14) Class6_Sub26 local14;
		synchronized (this.aClass359_15) {
			local14 = (Class6_Sub26) this.aClass359_15.method8517((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface11_10.method6032(arg0)) {
					return null;
				}
				@Pc(36) Class297 local36 = super.anInterface11_10.method6027(arg0);
				@Pc(50) int local50 = local36.aBoolean630 || this.aBoolean199 ? 64 : this.anInt2354;
				local14 = new Class6_Sub26(arg0, local50, super.anInterface11_10.method6029(local50, local50, 0.7F, arg0), local36.anInt8252 != 1);
				this.aClass359_15.method8515((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean389 = true;
		return local14.method4674();
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "()Z")
	@Override
	public boolean method6670() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method6709() {
		return new Class109_Sub1();
	}

	@OriginalMember(owner = "client!ed", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt2345, this.anInt2334, arg0, 0);
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "()Z")
	@Override
	public boolean method6703() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "()V")
	private void method2303() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2331; local1++) {
			this.aClass246Array1[local1].method6004();
		}
		this.la();
	}

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "()Z")
	@Override
	public boolean method6693() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZ)Lclient!tb;")
	@Override
	public Class49 method6710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class49_Sub1_Sub1(this, arg0, arg1) : new Class49_Sub1_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!cd;[Lclient!cu;Z)Lclient!da;")
	@Override
	public Class67 method6649(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class64[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1300;
			local7[local11] = arg1[local11].anInt1297;
			if (arg1[local11].aByteArray11 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class67_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class67_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "()V")
	@Override
	public void method6715() {
		if (this.aCanvas6 == null) {
			this.anInt2345 = 1;
			this.anInt2334 = 1;
			this.anIntArray128 = null;
			this.anInt2349 = 1;
			this.anInt2338 = 1;
			this.aFloatArray28 = null;
		} else {
			this.anIntArray128 = this.aClass6_Sub41_1.anIntArray653;
			this.anInt2345 = this.aClass6_Sub41_1.anInt9945;
			this.anInt2334 = this.aClass6_Sub41_1.anInt9947;
			this.aFloatArray28 = this.aFloatArray27;
			this.anInt2349 = this.anInt2351;
			this.anInt2338 = this.anInt2336;
		}
		this.aClass102_1 = null;
		this.method2303();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6677() {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		@Pc(6) Class78 local6 = local3.aClass78_1;
		local6.aBoolean176 = false;
		@Pc(14) int local14 = 5 - this.anInt2332;
		@Pc(19) int local19 = 75 - this.anInt2332;
		@Pc(24) int local24 = 15 - this.anInt2332;
		@Pc(29) int local29 = 10 - this.anInt2337;
		@Pc(34) int local34 = 50 - this.anInt2337;
		@Pc(39) int local39 = 90 - this.anInt2337;
		local6.aBoolean177 = local14 < 0 || local14 > local6.anInt2065 || local19 < 0 || local19 > local6.anInt2065 || local24 < 0 || local24 > local6.anInt2065;
		if (255 == 255 && true) {
			local6.anInt2064 = 0;
			local6.aBoolean173 = false;
			local6.method2004((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		} else {
			local6.anInt2064 = 0;
			local6.aBoolean173 = false;
			local6.method2004((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		}
		local6.aBoolean176 = true;
	}

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "()V")
	@Override
	public void method6663() {
	}

	@OriginalMember(owner = "client!ed", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt2358 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "()Z")
	@Override
	public boolean method6680() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!tha;)V")
	@Override
	public void method6665(@OriginalArg(0) Interface24 arg0) {
		@Pc(2) Class102 local2 = (Class102) arg0;
		this.anInt2345 = local2.anInt2883;
		this.anInt2334 = local2.anInt2878;
		this.anIntArray128 = local2.anIntArray162;
		this.aClass102_1 = local2;
		this.anInt2349 = local2.anInt2883;
		this.anInt2338 = local2.anInt2878;
		this.aFloatArray28 = local2.aFloatArray37;
		this.method2303();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray367;
		@Pc(8) int[] local8 = local2.anIntArray366;
		@Pc(18) int local18 = this.anInt2347 > arg7 ? this.anInt2347 : arg7;
		@Pc(34) int local34 = this.anInt2341 < arg7 + local5.length ? this.anInt2341 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(85) int local85;
		@Pc(118) int local118;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(154) int local154;
		@Pc(242) int local242;
		@Pc(261) int local261;
		@Pc(266) int local266;
		@Pc(215) int local215;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(415) int local415 = arg2 << 16;
			local85 = (int) Math.floor((double) local415 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local18) {
				arg0 += local85 * (local18 - arg1);
				arg1 = local18;
			}
			if (arg3 >= local34) {
				arg3 = local34 - 1;
			}
			local118 = arg4 >>> 24;
			if (local118 == 255 && true) {
				while (arg1 <= arg3) {
					local136 = arg0 >> 16;
					local140 = arg1 - arg7;
					local154 = arg6 + local5[local140];
					if (local136 >= this.anInt2348 && local136 < this.anInt2356 && local136 >= local154 && local136 < local154 + local8[local140]) {
						this.anIntArray128[local136 + arg1 * this.anInt2345] = arg4;
					}
					arg0 += local85;
					arg1++;
				}
			} else {
				local215 = ((arg4 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local118 >> 8 & 0xFF00) + (local118 << 24);
				local136 = 256 - local118;
				while (arg1 <= arg3) {
					local140 = arg0 >> 16;
					local154 = arg1 - arg7;
					local242 = arg6 + local5[local154];
					if (local140 >= this.anInt2348 && local140 < this.anInt2356 && local140 >= local242 && local140 < local242 + local8[local154]) {
						local261 = local140 + arg1 * this.anInt2345;
						local266 = this.anIntArray128[local261];
						@Pc(629) int local629 = ((local266 & 0xFF00FF) * local136 >> 8 & 0xFF00FF) + ((local266 & 0xFF00) * local136 >> 8 & 0xFF00);
						this.anIntArray128[local140 + arg1 * this.anInt2345] = local215 + local629;
					}
					arg0 += local85;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(75) int local75 = arg3 << 16;
		local85 = (int) Math.floor((double) local75 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt2348) {
			arg1 += local85 * (this.anInt2348 - arg0);
			arg0 = this.anInt2348;
		}
		if (arg2 >= this.anInt2356) {
			arg2 = this.anInt2356 - 1;
		}
		local118 = arg4 >>> 24;
		if (local118 == 255 && true) {
			while (arg0 <= arg2) {
				local136 = arg1 >> 16;
				local140 = local136 - arg7;
				if (local136 >= local18 && local136 < local34) {
					local154 = arg6 + local5[local140];
					if (arg0 >= local154 && arg0 < local154 + local8[local140]) {
						this.anIntArray128[arg0 + local136 * this.anInt2345] = arg4;
					}
				}
				arg1 += local85;
				arg0++;
			}
			return;
		}
		local215 = ((arg4 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local118 >> 8 & 0xFF00) + (local118 << 24);
		local136 = 256 - local118;
		while (arg0 <= arg2) {
			local140 = arg1 >> 16;
			local154 = local140 - arg7;
			if (local140 >= local18 && local140 < local34) {
				local242 = arg6 + local5[local154];
				if (arg0 >= local242 && arg0 < local242 + local8[local154]) {
					local261 = arg0 + local140 * this.anInt2345;
					local266 = this.anIntArray128[local261];
					local266 = ((local266 & 0xFF00FF) * local136 >> 8 & 0xFF00FF) + ((local266 & 0xFF00) * local136 >> 8 & 0xFF00);
					this.anIntArray128[local261] = local215 + local266;
				}
			}
			arg1 += local85;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt2359;
		this.anInt2359 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = (arg7 << 16) / arg2;
		@Pc(26) int local26 = (arg6.length / arg7 << 16) / arg3;
		@Pc(33) int local33 = arg0 + arg1 * this.anInt2345;
		@Pc(38) int local38 = this.anInt2345 - arg2;
		if (arg1 + arg3 > this.anInt2341) {
			arg3 -= arg1 + arg3 - this.anInt2341;
		}
		@Pc(62) int local62;
		if (arg1 < this.anInt2347) {
			local62 = this.anInt2347 - arg1;
			arg3 -= local62;
			local33 += local62 * this.anInt2345;
			local11 += local26 * local62;
		}
		if (arg0 + arg2 > this.anInt2356) {
			local62 = arg0 + arg2 - this.anInt2356;
			arg2 -= local62;
			local38 += local62;
		}
		if (arg0 < this.anInt2348) {
			local62 = this.anInt2348 - arg0;
			arg2 -= local62;
			local33 += local62;
			local9 += local17 * local62;
			local38 += local62;
		}
		local62 = arg4 >>> 24;
		@Pc(135) int local135 = arg5 >>> 24;
		@Pc(154) int local154;
		@Pc(157) int local157;
		@Pc(164) int local164;
		@Pc(167) int local167;
		if (arg8 == 0 || arg8 == 1 && local62 == 255 && local135 == 255) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					if (arg6[(local9 >> 16) + local164] == 0) {
						this.anIntArray128[local33++] = arg4;
					} else {
						this.anIntArray128[local33++] = arg5;
					}
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
			return;
		}
		@Pc(233) int local233;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(256) int local256;
		if (arg8 == 1) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					local233 = arg4;
					if (arg6[(local9 >> 16) + local164] != 0) {
						local233 = arg5;
					}
					local247 = local233 >>> 24;
					local251 = 255 - local247;
					local256 = this.anIntArray128[local33];
					this.anIntArray128[local33++] = ((local233 & 0xFF00FF) * local247 + (local256 & 0xFF00FF) * local251 & 0xFF00FF00) + ((local233 & 0xFF00) * local247 + (local256 & 0xFF00) * local251 & 0xFF0000) >> 8;
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
		} else if (arg8 == 2) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					local233 = arg4;
					if (arg6[(local9 >> 16) + local164] != 0) {
						local233 = arg5;
					}
					if (local233 == 0) {
						local33++;
					} else {
						local247 = this.anIntArray128[local33];
						local251 = local233 + local247;
						local256 = (local233 & 0xFF00FF) + (local247 & 0xFF00FF);
						@Pc(372) int local372 = (local256 & 0x1000100) + (local251 - local256 & 0x10000);
						this.anIntArray128[local33++] = local251 - local372 | local372 - (local372 >>> 8);
					}
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(I)Z")
	public boolean method2304(@OriginalArg(0) int arg0) {
		return super.anInterface11_10.method6032(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!sn;)V")
	@Override
	public void method6713(@OriginalArg(0) Class81 arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat57 + this.aClass109_Sub1_1.aFloat63 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat64 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(74) int local74 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat54 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat55 * (float) arg2) / local24);
		@Pc(106) int local106 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat62 + this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat65 * (float) arg1 + this.aClass109_Sub1_1.aFloat60 * (float) arg2) / local24);
		arg3[0] = local74 - this.anInt2332;
		arg3[1] = local106 - this.anInt2337;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!ed", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt2348 = 0;
		this.anInt2347 = 0;
		this.anInt2356 = this.anInt2345;
		this.anInt2341 = this.anInt2334;
		this.method2307();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6668(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub41 local8 = (Class6_Sub41) this.aClass74_12.method1401((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9051();
		local8 = Static512.method7385(arg1, arg2, arg0);
		this.aClass74_12.method1399(local8, (long) arg0.hashCode());
		if (this.aCanvas6 != arg0 || this.aClass102_1 != null) {
			return;
		}
		@Pc(39) Dimension local39 = arg0.getSize();
		this.anInt2330 = local39.width;
		this.anInt2329 = local39.height;
		this.aClass6_Sub41_1 = local8;
		this.anIntArray128 = local8.anIntArray653;
		this.anInt2345 = local8.anInt9945;
		this.anInt2334 = local8.anInt9947;
		if (this.anInt2345 != this.anInt2349 || this.anInt2334 != this.anInt2338) {
			this.anInt2351 = this.anInt2349 = this.anInt2345;
			this.anInt2336 = this.anInt2338 = this.anInt2334;
			this.aFloatArray27 = this.aFloatArray28 = new float[this.anInt2349 * this.anInt2338];
		}
		this.method2303();
	}

	@OriginalMember(owner = "client!ed", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass246Array1.length; local1++) {
			this.aClass246Array1[local1].anInt6757 = this.aClass246Array1[local1].anInt6756;
			this.aClass246Array1[local1].aBoolean507 = false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2347) {
			local8 = this.anInt2347;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2341) {
			local21 = this.anInt2341;
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
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt2348) {
					local98 = this.anInt2348;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt2356) {
					local109 = this.anInt2356;
				}
				local123 = local98 + local30 * this.anInt2345;
				for (local125 = local98; local125 < local109; local125++) {
					this.anIntArray128[local123++] = arg3;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt2348) {
					local98 = this.anInt2348;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt2356 - 1) {
					local109 = this.anInt2356 - 1;
				}
				local123 = local98 + local30 * this.anInt2345;
				for (local125 = local98; local125 <= local109; local125++) {
					this.anIntArray128[local123++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(287) int local287 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local98 = 256 - local57;
		@Pc(346) int local346;
		@Pc(352) int local352;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local109 = arg0 + 1 - local36;
			if (local109 < this.anInt2348) {
				local109 = this.anInt2348;
			}
			local123 = arg0 + local36;
			if (local123 > this.anInt2356) {
				local123 = this.anInt2356;
			}
			local125 = local109 + local30 * this.anInt2345;
			for (local346 = local109; local346 < local123; local346++) {
				local352 = this.anIntArray128[local125];
				@Pc(372) int local372 = ((local352 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local352 & 0xFF00) * local98 >> 8 & 0xFF00);
				this.anIntArray128[local125++] = local287 + local372;
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
			local109 = arg0 - local36;
			if (local109 < this.anInt2348) {
				local109 = this.anInt2348;
			}
			local123 = arg0 + local36;
			if (local123 > this.anInt2356 - 1) {
				local123 = this.anInt2356 - 1;
			}
			local125 = local109 + local30 * this.anInt2345;
			for (local346 = local109; local346 <= local123; local346++) {
				local352 = this.anIntArray128[local125];
				local352 = ((local352 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local352 & 0xFF00) * local98 >> 8 & 0xFF00);
				this.anIntArray128[local125++] = local287 + local352;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0) {
		this.anInt2331 = arg0;
		this.aClass246Array1 = new Class246[this.anInt2331];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2331; local9++) {
			this.aClass246Array1[local9] = new Class246(this);
		}
	}

	@OriginalMember(owner = "client!ed", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat57 + this.aClass109_Sub1_1.aFloat63 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat64 * (float) arg2;
		if (local24 < (float) this.anInt2342 || local24 > (float) this.anInt2333) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(84) int local84 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat54 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat55 * (float) arg2) / local24);
		@Pc(116) int local116 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat62 + this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat65 * (float) arg1 + this.aClass109_Sub1_1.aFloat60 * (float) arg2) / local24);
		if (local84 >= this.anInt2332 && local84 <= this.anInt2343 && local116 >= this.anInt2337 && local116 <= this.anInt2340) {
			arg3[0] = local84 - this.anInt2332;
			arg3[1] = local116 - this.anInt2337;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
	@Override
	public int method6686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIII)Lclient!sn;")
	@Override
	public Class81 method6659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "()Z")
	@Override
	public boolean method6704() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass246Array1.length; local1++) {
			this.aClass246Array1[local1].anInt6756 = this.aClass246Array1[local1].anInt6757;
			this.aClass246Array1[local1].anInt6761 = arg0;
			this.aClass246Array1[local1].anInt6757 = arg1;
			this.aClass246Array1[local1].anInt6762 = arg2;
			this.aClass246Array1[local1].aBoolean507 = true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray367;
		@Pc(8) int[] local8 = local2.anIntArray366;
		@Pc(18) int local18 = this.anInt2347 > arg7 ? this.anInt2347 : arg7;
		@Pc(34) int local34 = this.anInt2341 < arg7 + local5.length ? this.anInt2341 : arg7 + local5.length;
		@Pc(38) int local38 = arg10 << 8;
		@Pc(42) int local42 = arg8 << 8;
		@Pc(46) int local46 = arg9 << 8;
		@Pc(50) int local50 = local42 + local46;
		arg10 = local38 % local50;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (arg2 + arg3 < 0) {
			local79 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local83 = local79 % local50;
			local38 = local50 + local42 - arg10 - local83;
			arg10 = local38 % local50;
			if (arg10 < 0) {
				arg10 += local50;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(161) int local161;
		@Pc(179) int local179;
		@Pc(183) int local183;
		@Pc(214) int local214;
		@Pc(327) int local327;
		@Pc(346) int local346;
		@Pc(144) int local144;
		@Pc(130) int local130;
		@Pc(283) int local283;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local144 = arg2 << 16;
			local79 = (int) Math.floor((double) local144 / (double) arg3 + 0.5D);
			local83 = (int) Math.sqrt((double) ((local79 >> 8) * (local79 >> 8) + 65536));
			local130 = arg3 + arg1;
			local161 = arg4 >>> 24;
			if (local161 == 255 && true) {
				while (arg1 <= local130) {
					local179 = arg0 >> 16;
					local183 = arg1 - arg7;
					if (arg1 >= local18 && arg1 < local34 && local179 >= this.anInt2348 && local179 < this.anInt2356 && arg10 < local42 && local179 >= arg6 + local5[local183] && local179 < arg6 + local5[local183] + local8[local183]) {
						this.anIntArray128[local179 + arg1 * this.anInt2345] = arg4;
					}
					arg0 += local79;
					arg1++;
					local38 = arg10 + local83;
					arg10 = local38 % local50;
				}
			} else {
				local283 = ((arg4 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local161 >> 8 & 0xFF00) + (local161 << 24);
				local179 = 256 - local161;
				while (arg1 <= local130) {
					local183 = arg0 >> 16;
					local214 = arg1 - arg7;
					if (arg1 >= local18 && arg1 < local34 && local183 >= this.anInt2348 && local183 < this.anInt2356 && arg10 < local42 && local183 >= arg6 + local5[local214] && local183 < arg6 + local5[local214] + local8[local214]) {
						local327 = local183 + arg1 * this.anInt2345;
						local346 = this.anIntArray128[local327];
						@Pc(782) int local782 = ((local346 & 0xFF00FF) * local179 >> 8 & 0xFF00FF) + ((local346 & 0xFF00) * local179 >> 8 & 0xFF00);
						this.anIntArray128[local183 + arg1 * this.anInt2345] = local283 + local782;
					}
					arg0 += local79;
					arg1++;
					local38 = arg10 + local83;
					arg10 = local38 % local50;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local130 = arg3 << 16;
		local79 = (int) Math.floor((double) local130 / (double) arg2 + 0.5D);
		local144 = arg2 + arg0;
		local83 = arg4 >>> 24;
		local161 = (int) Math.sqrt((double) ((local79 >> 8) * (local79 >> 8) + 65536));
		if (local83 == 255 && true) {
			while (arg0 <= local144) {
				local179 = arg1 >> 16;
				local183 = local179 - arg7;
				if (arg0 >= this.anInt2348 && arg0 < this.anInt2356 && local179 >= local18 && local179 < local34 && arg10 < local42) {
					local214 = arg6 + local5[local183];
					if (arg0 >= local214 && arg0 < local214 + local8[local183]) {
						this.anIntArray128[arg0 + local179 * this.anInt2345] = arg4;
					}
				}
				arg1 += local79;
				arg0++;
				local38 = arg10 + local161;
				arg10 = local38 % local50;
			}
			return;
		}
		local283 = ((arg4 & 0xFF00FF) * local83 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local83 >> 8 & 0xFF00) + (local83 << 24);
		local179 = 256 - local83;
		while (arg0 <= local144) {
			local183 = arg1 >> 16;
			local214 = local183 - arg7;
			if (arg0 >= this.anInt2348 && arg0 < this.anInt2356 && local183 >= local18 && local183 < local34 && arg10 < local42) {
				local327 = arg6 + local5[local214];
				if (arg0 >= local327 && arg0 < local327 + local8[local214]) {
					local346 = arg0 + local183 * this.anInt2345;
					@Pc(351) int local351 = this.anIntArray128[local346];
					@Pc(371) int local371 = ((local351 & 0xFF00FF) * local179 >> 8 & 0xFF00FF) + ((local351 & 0xFF00) * local179 >> 8 & 0xFF00);
					this.anIntArray128[local346] = local283 + local371;
				}
			}
			arg1 += local79;
			arg0++;
			local38 = arg10 + local161;
			arg10 = local38 % local50;
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub18 method6702(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2345 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray128[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "()Z")
	@Override
	public boolean method6666() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2348 || arg0 >= this.anInt2356) {
			return;
		}
		if (arg1 < this.anInt2347) {
			arg2 -= this.anInt2347 - arg1;
			arg1 = this.anInt2347;
		}
		if (arg1 + arg2 > this.anInt2341) {
			arg2 = this.anInt2341 - arg1;
		}
		@Pc(43) int local43 = arg0 + arg1 * this.anInt2345;
		@Pc(47) int local47 = arg3 >>> 24;
		@Pc(61) int local61;
		if (arg4 == 0 || arg4 == 1 && local47 == 255) {
			for (local61 = 0; local61 < arg2; local61++) {
				this.anIntArray128[local43 + local61 * this.anInt2345] = arg3;
			}
			return;
		}
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(124) int local124;
		if (arg4 == 1) {
			@Pc(105) int local105 = ((arg3 & 0xFF00FF) * local47 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local47 >> 8 & 0xFF00) + (local47 << 24);
			local61 = 256 - local47;
			for (local111 = 0; local111 < arg2; local111++) {
				local119 = local43 + local111 * this.anInt2345;
				local124 = this.anIntArray128[local119];
				local124 = ((local124 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((local124 & 0xFF00) * local61 >> 8 & 0xFF00);
				this.anIntArray128[local119] = local105 + local124;
			}
		} else if (arg4 == 2) {
			for (local61 = 0; local61 < arg2; local61++) {
				local111 = local43 + local61 * this.anInt2345;
				local119 = this.anIntArray128[local111];
				local124 = arg3 + local119;
				@Pc(187) int local187 = (arg3 & 0xFF00FF) + (local119 & 0xFF00FF);
				@Pc(197) int local197 = (local187 & 0x1000100) + (local124 - local187 & 0x10000);
				this.anIntArray128[local111] = local124 - local197 | local197 - (local197 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(IIIIII)V")
	private void method2305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt2347) {
			local8 = this.anInt2347;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt2341) {
			local21 = this.anInt2341;
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
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt2348) {
					local98 = this.anInt2348;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt2356) {
					local109 = this.anInt2356;
				}
				local123 = local98 + local30 * this.anInt2345;
				for (local125 = local98; local125 < local109; local125++) {
					if ((float) arg2 < this.aFloatArray28[local123]) {
						this.anIntArray128[local123] = arg4;
					}
					local123++;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt2348) {
					local98 = this.anInt2348;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt2356 - 1) {
					local109 = this.anInt2356 - 1;
				}
				local123 = local98 + local30 * this.anInt2345;
				for (local125 = local98; local125 <= local109; local125++) {
					if ((float) arg2 < this.aFloatArray28[local123]) {
						this.anIntArray128[local123] = arg4;
					}
					local123++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(380) int local380;
		if (arg5 == 1) {
			@Pc(307) int local307 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local98 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local109 = arg0 + 1 - local36;
				if (local109 < this.anInt2348) {
					local109 = this.anInt2348;
				}
				local123 = arg0 + local36;
				if (local123 > this.anInt2356) {
					local123 = this.anInt2356;
				}
				local125 = local109 + local30 * this.anInt2345;
				for (local366 = local109; local366 < local123; local366++) {
					if ((float) arg2 < this.aFloatArray28[local125]) {
						local380 = this.anIntArray128[local125];
						local380 = ((local380 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local98 >> 8 & 0xFF00);
						this.anIntArray128[local125] = local307 + local380;
					}
					local125++;
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
				local109 = arg0 - local36;
				if (local109 < this.anInt2348) {
					local109 = this.anInt2348;
				}
				local123 = arg0 + local36;
				if (local123 > this.anInt2356 - 1) {
					local123 = this.anInt2356 - 1;
				}
				local125 = local109 + local30 * this.anInt2345;
				for (local366 = local109; local366 <= local123; local366++) {
					if ((float) arg2 < this.aFloatArray28[local125]) {
						local380 = this.anIntArray128[local125];
						local380 = ((local380 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local98 >> 8 & 0xFF00);
						this.anIntArray128[local125] = local307 + local380;
					}
					local125++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(655) int local655;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt2348) {
					local98 = this.anInt2348;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt2356) {
					local109 = this.anInt2356;
				}
				local123 = local98 + local30 * this.anInt2345;
				for (local125 = local98; local125 < local109; local125++) {
					if ((float) arg2 < this.aFloatArray28[local123]) {
						local366 = this.anIntArray128[local123];
						local380 = arg4 + local366;
						local655 = (arg4 & 0xFF00FF) + (local366 & 0xFF00FF);
						@Pc(665) int local665 = (local655 & 0x1000100) + (local380 - local655 & 0x10000);
						this.anIntArray128[local123] = local380 - local665 | local665 - (local665 >>> 8);
					}
					local123++;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt2348) {
					local98 = this.anInt2348;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt2356 - 1) {
					local109 = this.anInt2356 - 1;
				}
				local123 = local98 + local30 * this.anInt2345;
				for (local125 = local98; local125 <= local109; local125++) {
					if ((float) arg2 < this.aFloatArray28[local123]) {
						local366 = this.anIntArray128[local123];
						local380 = arg4 + local366;
						local655 = (arg4 & 0xFF00FF) + (local366 & 0xFF00FF);
						local366 = (local655 & 0x1000100) + (local380 - local655 & 0x10000);
						this.anIntArray128[local123] = local380 - local366 | local366 - (local366 >>> 8);
					}
					local123++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)I")
	public int method2306(@OriginalArg(0) int arg0) {
		return super.anInterface11_10.method6027(arg0).anInt8252;
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "()V")
	private void method2307() {
		this.anInt2332 = this.anInt2348 - this.anInt2344;
		this.anInt2343 = this.anInt2356 - this.anInt2344;
		this.anInt2337 = this.anInt2347 - this.anInt2353;
		this.anInt2340 = this.anInt2341 - this.anInt2353;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2331; local29++) {
			@Pc(36) Class78 local36 = this.aClass246Array1[local29].aClass78_1;
			local36.anInt2063 = this.anInt2344 - this.anInt2348;
			local36.anInt2068 = this.anInt2353 - this.anInt2347;
			local36.anInt2065 = this.anInt2356 - this.anInt2348;
			local36.anInt2066 = this.anInt2341 - this.anInt2347;
		}
		@Pc(78) int local78 = this.anInt2347 * this.anInt2345 + this.anInt2348;
		for (@Pc(81) int local81 = this.anInt2347; local81 < this.anInt2341; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2331; local84++) {
				this.aClass246Array1[local84].aClass78_1.anIntArray96[local81 - this.anInt2347] = local78;
			}
			local78 += this.anInt2345;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ts;IIII)V")
	private void method2308(@OriginalArg(0) Class60_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt5623;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method2305(arg1, arg2, arg3, arg4, arg0.anInt5621, 1);
			return;
		}
		if (this.anInt2360 != local2) {
			@Pc(34) Class49 local34 = (Class49) this.aClass359_16.method8517((long) local2);
			if (local34 == null) {
				@Pc(40) int[] local40 = this.method2302(local2);
				if (local40 == null) {
					return;
				}
				@Pc(54) int local54 = this.method2300(local2) ? 64 : this.anInt2354;
				local34 = this.method6692(local54, local54, local40, local54);
				this.aClass359_16.method8515((long) local2, local34);
			}
			this.anInt2360 = local2;
			this.aClass49_7 = local34;
		}
		local8++;
		((Class49_Sub1) this.aClass49_7).method7595(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt5621, 1);
	}

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		local3.aBoolean505 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "()Z")
	@Override
	public boolean method6658() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)[I")
	public int[] method2309(@OriginalArg(0) int arg0) {
		@Pc(2) Class359 local2 = this.aClass359_15;
		@Pc(12) Class6_Sub26 local12;
		synchronized (this.aClass359_15) {
			local12 = (Class6_Sub26) this.aClass359_15.method8517((long) arg0);
			if (local12 == null) {
				if (!super.anInterface11_10.method6032(arg0)) {
					return null;
				}
				@Pc(34) Class297 local34 = super.anInterface11_10.method6027(arg0);
				@Pc(48) int local48 = local34.aBoolean630 || this.aBoolean199 ? 64 : this.anInt2354;
				local12 = new Class6_Sub26(arg0, local48, super.anInterface11_10.method6031(0.7F, local48, local48, arg0, true), local34.anInt8252 != 1);
				this.aClass359_15.method8515((long) arg0, local12);
			}
		}
		local12.aBoolean389 = true;
		return local12.method4674();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface11_10.method6027(arg6).aBoolean625) {
			this.method2305(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt2360 != arg6) {
			@Pc(33) Class49 local33 = (Class49) this.aClass359_16.method8517((long) arg6);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method2302(arg6);
				if (local39 == null) {
					return;
				}
				@Pc(53) int local53 = this.method2300(arg6) ? 64 : this.anInt2354;
				local33 = this.method6692(local53, local53, local39, local53);
				this.aClass359_16.method8515((long) arg6, local33);
			}
			this.anInt2360 = arg6;
			this.aClass49_7 = local33;
		}
		((Class49_Sub1) this.aClass49_7).method7595(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt2345 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt2349 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(24) int[] local24 = this.anIntArray128;
		@Pc(27) float[] local27 = this.aFloatArray28;
		@Pc(34) int local34;
		if (local6 < 0) {
			local34 = local24.length + local6;
			Static695.method5649(local24, -local6, local24, 0, local34);
		} else if (local6 > 0) {
			local34 = local24.length - local6;
			Static695.method5649(local24, 0, local24, local6, local34);
		}
		if (local13 < 0) {
			local34 = local27.length + local13;
			Static695.method5645(local27, -local13, local27, 0, local34);
		} else if (local13 > 0) {
			local34 = local27.length - local13;
			Static695.method5645(local27, 0, local27, local13, local34);
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "()Z")
	@Override
	public boolean method6644() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "()V")
	@Override
	public void method6717() {
	}

	@OriginalMember(owner = "client!ed", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2344 = arg0;
		this.anInt2353 = arg1;
		this.anInt2339 = arg2;
		this.anInt2355 = arg3;
		this.method2307();
	}

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "()Z")
	@Override
	public boolean method6633() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6711(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas6 == null || this.aClass6_Sub41_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(19) Graphics local19 = this.aCanvas6.getGraphics();
			for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
				@Pc(26) Rectangle local26 = arg0[local21];
				if (local26.x + arg2 <= this.anInt2345 && local26.y + arg3 <= this.anInt2334 && local26.x + arg2 + local26.width > 0 && local26.y + arg3 + local26.height > 0) {
					this.aClass6_Sub41_1.method8629(local26.x, local26.x + arg2, local26.width, local26.y, local19, local26.y + arg3, local26.height);
				}
			}
		} catch (@Pc(91) Exception local91) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2348 < arg0) {
			this.anInt2348 = arg0;
		}
		if (this.anInt2347 < arg1) {
			this.anInt2347 = arg1;
		}
		if (this.anInt2356 > arg2) {
			this.anInt2356 = arg2;
		}
		if (this.anInt2341 > arg3) {
			this.anInt2341 = arg3;
		}
		this.method2307();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
	@Override
	public void method6690(@OriginalArg(0) boolean arg0) {
		this.aBoolean199 = arg0;
		this.aClass359_15.method8507();
	}

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "()Z")
	public boolean method2311() {
		return this.aBoolean197;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	@Override
	public void method6650(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6652(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub41 local8 = (Class6_Sub41) this.aClass74_12.method1401((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static512.method7385(arg1, arg2, arg0);
			this.aClass74_12.method1399(local8, (long) arg0.hashCode());
		} else if (local8.anInt9945 != arg1 || local8.anInt9947 != arg2) {
			this.method6668(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)V")
	private void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt2348 || arg0 >= this.anInt2356) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg1 * this.anInt2345;
		@Pc(22) int local22 = arg3 >>> 24;
		@Pc(26) int local26 = arg4 + arg5;
		@Pc(30) int local30 = arg6 % local26;
		@Pc(44) int local44;
		if (local22 == 255 && true) {
			local44 = 0;
			while (local44 < arg2) {
				if (arg1 + local44 >= this.anInt2347 && arg1 + local44 < this.anInt2341 && local30 < arg4) {
					this.anIntArray128[local18 + local44 * this.anInt2345] = arg3;
				}
				local44++;
				local30++;
				local30 %= local26;
			}
			return;
		}
		@Pc(114) int local114 = ((arg3 & 0xFF00FF) * local22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local22 >> 8 & 0xFF00) + (local22 << 24);
		local44 = 256 - local22;
		@Pc(120) int local120 = 0;
		while (local120 < arg2) {
			if (arg1 + local120 >= this.anInt2347 && arg1 + local120 < this.anInt2341 && local30 < arg4) {
				@Pc(147) int local147 = local18 + local120 * this.anInt2345;
				@Pc(152) int local152 = this.anIntArray128[local147];
				@Pc(172) int local172 = ((local152 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((local152 & 0xFF00) * local44 >> 8 & 0xFF00);
				this.anIntArray128[local147] = local114 + local172;
			}
			local120++;
			local30++;
			local30 %= local26;
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		this.anInt2342 = arg0;
		this.anInt2333 = arg1;
		local3.anInt6760 = this.anInt2333 - 255;
	}

	@OriginalMember(owner = "client!ed", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2348) {
			arg2 -= this.anInt2348 - arg0;
			arg0 = this.anInt2348;
		}
		if (arg1 < this.anInt2347) {
			arg3 -= this.anInt2347 - arg1;
			arg1 = this.anInt2347;
		}
		if (arg0 + arg2 > this.anInt2356) {
			arg2 = this.anInt2356 - arg0;
		}
		if (arg1 + arg3 > this.anInt2341) {
			arg3 = this.anInt2341 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2356 || arg1 > this.anInt2341) {
			return;
		}
		@Pc(74) int local74 = this.anInt2345 - arg2;
		@Pc(81) int local81 = arg0 + arg1 * this.anInt2345;
		@Pc(85) int local85 = arg4 >>> 24;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(112) int local112;
		if (arg5 != 0 && (arg5 != 1 || local85 != 255)) {
			@Pc(231) int local231;
			if (arg5 == 1) {
				@Pc(215) int local215 = ((arg4 & 0xFF00FF) * local85 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local85 & 0xFF00FF00);
				local101 = 256 - local85;
				for (local105 = 0; local105 < arg3; local105++) {
					for (local112 = -arg2; local112 < 0; local112++) {
						local231 = this.anIntArray128[local81];
						local231 = ((local231 & 0xFF00FF) * local101 >> 8 & 0xFF00FF) + (((local231 & 0xFF00FF00) >>> 8) * local101 & 0xFF00FF00);
						this.anIntArray128[local81++] = local215 + local231;
					}
					local81 += local74;
				}
			} else if (arg5 == 2) {
				for (local101 = 0; local101 < arg3; local101++) {
					for (local105 = -arg2; local105 < 0; local105++) {
						local112 = this.anIntArray128[local81];
						local231 = arg4 + local112;
						@Pc(299) int local299 = (arg4 & 0xFF00FF) + (local112 & 0xFF00FF);
						@Pc(309) int local309 = (local299 & 0x1000100) + (local231 - local299 & 0x10000);
						this.anIntArray128[local81++] = local231 - local309 | local309 - (local309 >>> 8);
					}
					local81 += local74;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local101 = arg2 >> 3;
		local105 = arg2 & 0x7;
		arg2 = local81 - 1;
		for (local112 = -arg3; local112 < 0; local112++) {
			if (local101 > 0) {
				arg0 = local101;
				do {
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local105 > 0) {
				arg0 = local105;
				do {
					arg2++;
					this.anIntArray128[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local74;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(II)Lclient!kb;")
	@Override
	public Interface14 method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class147(arg0, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method6643() {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		return local3.aClass109_Sub1_2;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	@Override
	public void method6696(@OriginalArg(0) int arg0) {
		this.aClass246Array1[arg0].method6005(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
	@Override
	public void method6637(@OriginalArg(0) int arg0) {
		this.aClass246Array1[arg0].method6005((Runnable) null);
	}

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "()V")
	@Override
	protected void method6667() {
		if (this.aBoolean198) {
			Static217.method3969(true, false);
			this.aBoolean198 = false;
		}
		this.aClass6_Sub41_1 = null;
		this.aCanvas6 = null;
		this.anInt2330 = 0;
		this.anInt2329 = 0;
		this.aClass74_12 = null;
		this.aBoolean197 = true;
	}

	@OriginalMember(owner = "client!ed", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass109_Sub1_1.aFloat63 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat64 * (float) arg2 + this.aClass109_Sub1_1.aFloat57;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass109_Sub1_1.aFloat63 * (float) arg3 + this.aClass109_Sub1_1.aFloat61 * (float) arg4 + this.aClass109_Sub1_1.aFloat64 * (float) arg5 + this.aClass109_Sub1_1.aFloat57;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt2342 && local57 < (float) this.anInt2342) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt2333 && local57 > (float) this.anInt2333) {
			local1 |= 0x20;
		}
		@Pc(132) int local132 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat54 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat55 * (float) arg2 + this.aClass109_Sub1_1.aFloat58) / local26);
		@Pc(164) int local164 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat54 * (float) arg3 + this.aClass109_Sub1_1.aFloat56 * (float) arg4 + this.aClass109_Sub1_1.aFloat55 * (float) arg5 + this.aClass109_Sub1_1.aFloat58) / local57);
		if (local132 < this.anInt2332 && local164 < this.anInt2332) {
			local1 |= 0x1;
		} else if (local132 > this.anInt2343 && local164 > this.anInt2343) {
			local1 |= 0x2;
		}
		@Pc(225) int local225 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat65 * (float) arg1 + this.aClass109_Sub1_1.aFloat60 * (float) arg2 + this.aClass109_Sub1_1.aFloat62) / local26);
		@Pc(257) int local257 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat59 * (float) arg3 + this.aClass109_Sub1_1.aFloat65 * (float) arg4 + this.aClass109_Sub1_1.aFloat60 * (float) arg5 + this.aClass109_Sub1_1.aFloat62) / local57);
		if (local225 < this.anInt2337 && local257 < this.anInt2337) {
			local1 |= 0x4;
		} else if (local225 > this.anInt2340 && local257 > this.anInt2340) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()Z")
	@Override
	public boolean method6664() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt2357;
		this.anInt2357 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!rha;IIII)Lclient!ka;")
	@Override
	public Class54 method6688(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class54_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lclient!ta;)V")
	@Override
	public void method6682(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
	}

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method6636() {
		return this.aClass109_Sub1_1;
	}

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray367;
		@Pc(8) int[] local8 = local2.anIntArray366;
		@Pc(20) int local20;
		if (this.anInt2341 < arg3 + local5.length) {
			local20 = this.anInt2341 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2347 > arg3) {
			local33 = this.anInt2347 - arg3;
			arg3 = this.anInt2347;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(50) int local50 = arg3 * this.anInt2345;
		for (@Pc(52) int local52 = local33; local52 < local20; local52++) {
			@Pc(59) int local59 = arg2 + local5[local52];
			@Pc(63) int local63 = local8[local52];
			if (this.anInt2348 > local59) {
				local63 -= this.anInt2348 - local59;
				local59 = this.anInt2348;
			}
			if (this.anInt2356 < local59 + local63) {
				local63 = this.anInt2356 - local59;
			}
			local59 += local50;
			for (@Pc(95) int local95 = -local63; local95 < 0; local95++) {
				this.anIntArray128[local59++] = arg0;
			}
			local50 += this.anInt2345;
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(II)Lclient!bha;")
	@Override
	public Interface5 method6674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6710(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt2349 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt2349 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray28;
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

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method6695(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub1_1 = (Class109_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([I)V")
	@Override
	public void method6669(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2345;
		arg0[1] = this.anInt2334;
	}

	@OriginalMember(owner = "client!ed", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (this.anInt2348 == 0 && this.anInt2356 == this.anInt2345 && this.anInt2347 == 0 && this.anInt2341 == this.anInt2334) {
			local25 = this.aFloatArray28.length;
			local31 = local25 - (local25 & 0x7);
			local33 = 0;
			while (local33 < local31) {
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
				this.aFloatArray28[local33++] = 2.14748365E9F;
			}
			while (local33 < local25) {
				this.aFloatArray28[local33++] = 2.14748365E9F;
			}
			return;
		}
		local25 = this.anInt2356 - this.anInt2348;
		local31 = this.anInt2341 - this.anInt2347;
		local33 = this.anInt2345 - local25;
		@Pc(124) int local124 = this.anInt2348 + this.anInt2347 * this.anInt2345;
		@Pc(128) int local128 = local25 >> 3;
		@Pc(132) int local132 = local25 & 0x7;
		local25 = local124 - 1;
		for (@Pc(139) int local139 = -local31; local139 < 0; local139++) {
			@Pc(144) int local144;
			if (local128 > 0) {
				local144 = local128;
				do {
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local144--;
				} while (local144 > 0);
			}
			if (local132 > 0) {
				local144 = local132;
				do {
					local25++;
					this.aFloatArray28[local25] = 2.14748365E9F;
					local144--;
				} while (local144 > 0);
			}
			local25 += local33;
		}
	}

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIZ)Lclient!tb;")
	@Override
	public Class49 method6687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2345 + arg0;
		@Pc(16) int local16 = this.anInt2345 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray128[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class49_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class49_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ed", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat57 + this.aClass109_Sub1_1.aFloat63 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat64 * (float) arg2;
		if (local24 < (float) this.anInt2342 || local24 > (float) this.anInt2333) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat54 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat55 * (float) arg2) / (float) arg3);
		@Pc(118) int local118 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat62 + this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat65 * (float) arg1 + this.aClass109_Sub1_1.aFloat60 * (float) arg2) / (float) arg3);
		if (local85 >= this.anInt2332 && local85 <= this.anInt2343 && local118 >= this.anInt2337 && local118 <= this.anInt2340) {
			arg4[0] = local85 - this.anInt2332;
			arg4[1] = local118 - this.anInt2337;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!sn;Lclient!sn;FLclient!sn;)Lclient!sn;")
	@Override
	public Class81 method6656(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class81 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method2313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface11_10.method6027(arg6).aBoolean625) {
			this.method2305(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt2360 != arg6) {
			@Pc(33) Class49 local33 = (Class49) this.aClass359_16.method8517((long) arg6);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method2302(arg6);
				if (local39 == null) {
					return;
				}
				@Pc(53) int local53 = this.method2300(arg6) ? 64 : this.anInt2354;
				local33 = this.method6692(local53, local53, local39, local53);
				this.aClass359_16.method8515((long) arg6, local33);
			}
			this.anInt2360 = arg6;
			this.aClass49_7 = local33;
		}
		((Class49_Sub1) this.aClass49_7).method7596(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)V")
	@Override
	public void method6655() {
		Static515.anInt8502 = 10000;
		Static515.anInt8508 = 10000;
		if (this.anInt2331 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6694(this.anInt2331);
		this.method6696(0);
	}

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "()Z")
	@Override
	public boolean method6676() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!kia;)V")
	@Override
	public void method6634(@OriginalArg(0) Class209 arg0) {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		@Pc(7) Class60_Sub2 local7 = arg0.aClass46_1.aClass60_Sub2_1;
		for (@Pc(10) Class60_Sub2 local10 = local7.aClass60_Sub2_10; local10 != local7; local10 = local10.aClass60_Sub2_10) {
			@Pc(14) Class60_Sub2_Sub1 local14 = (Class60_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt5624 >> 12;
			@Pc(24) int local24 = local14.anInt5625 >> 12;
			@Pc(29) int local29 = local14.anInt5627 >> 12;
			@Pc(54) float local54 = this.aClass109_Sub1_1.aFloat57 + this.aClass109_Sub1_1.aFloat63 * (float) local19 + this.aClass109_Sub1_1.aFloat61 * (float) local24 + this.aClass109_Sub1_1.aFloat64 * (float) local29;
			if (!(local54 < (float) this.anInt2342) && !(local54 > (float) local3.anInt6760)) {
				@Pc(105) int local105 = this.anInt2344 + (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat54 * (float) local19 + this.aClass109_Sub1_1.aFloat56 * (float) local24 + this.aClass109_Sub1_1.aFloat55 * (float) local29) / local54);
				@Pc(140) int local140 = this.anInt2353 + (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat62 + this.aClass109_Sub1_1.aFloat59 * (float) local19 + this.aClass109_Sub1_1.aFloat65 * (float) local24 + this.aClass109_Sub1_1.aFloat60 * (float) local29) / local54);
				if (local105 >= this.anInt2348 && local105 <= this.anInt2356 && local140 >= this.anInt2347 && local140 <= this.anInt2341) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method2308(local14, local105, local140, (int) local54, (int) ((float) (local14.anInt5628 * this.anInt2339 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6708(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method6657((Canvas) null);
		}
		@Pc(17) Class6_Sub41 local17 = (Class6_Sub41) this.aClass74_12.method1401((long) arg0.hashCode());
		if (local17 != null) {
			local17.method9051();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nda;")
	public Class246 method2314(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2331; local1++) {
			if (this.aClass246Array1[local1].aRunnable2 == arg0) {
				return this.aClass246Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat63 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat64 * (float) arg2 + this.aClass109_Sub1_1.aFloat57;
		@Pc(49) float local49 = this.aClass109_Sub1_1.aFloat63 * (float) arg3 + this.aClass109_Sub1_1.aFloat61 * (float) arg4 + this.aClass109_Sub1_1.aFloat64 * (float) arg5 + this.aClass109_Sub1_1.aFloat57;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt2342 && local49 < (float) this.anInt2342) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt2333 && local49 > (float) this.anInt2333) {
			local51 |= 0x20;
		}
		@Pc(121) int local121 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat54 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat55 * (float) arg2 + this.aClass109_Sub1_1.aFloat58) / (float) arg6);
		@Pc(154) int local154 = (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat54 * (float) arg3 + this.aClass109_Sub1_1.aFloat56 * (float) arg4 + this.aClass109_Sub1_1.aFloat55 * (float) arg5 + this.aClass109_Sub1_1.aFloat58) / (float) arg6);
		if (local121 < this.anInt2332 && local154 < this.anInt2332) {
			local51 |= 0x1;
		} else if (local121 > this.anInt2343 && local154 > this.anInt2343) {
			local51 |= 0x2;
		}
		@Pc(216) int local216 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat65 * (float) arg1 + this.aClass109_Sub1_1.aFloat60 * (float) arg2 + this.aClass109_Sub1_1.aFloat62) / (float) arg6);
		@Pc(249) int local249 = (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat59 * (float) arg3 + this.aClass109_Sub1_1.aFloat65 * (float) arg4 + this.aClass109_Sub1_1.aFloat60 * (float) arg5 + this.aClass109_Sub1_1.aFloat62) / (float) arg6);
		if (local216 < this.anInt2337 && local249 < this.anInt2337) {
			local51 |= 0x4;
		} else if (local216 > this.anInt2340 && local249 > this.anInt2340) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt2342;
	}

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "()Z")
	@Override
	public boolean method6705() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!kia;I)V")
	@Override
	public void method6685(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		@Pc(7) Class60_Sub2 local7 = arg0.aClass46_1.aClass60_Sub2_1;
		for (@Pc(10) Class60_Sub2 local10 = local7.aClass60_Sub2_10; local10 != local7; local10 = local10.aClass60_Sub2_10) {
			@Pc(14) Class60_Sub2_Sub1 local14 = (Class60_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt5624 >> 12;
			@Pc(24) int local24 = local14.anInt5625 >> 12;
			@Pc(29) int local29 = local14.anInt5627 >> 12;
			@Pc(54) float local54 = this.aClass109_Sub1_1.aFloat57 + this.aClass109_Sub1_1.aFloat63 * (float) local19 + this.aClass109_Sub1_1.aFloat61 * (float) local24 + this.aClass109_Sub1_1.aFloat64 * (float) local29;
			if (!(local54 < (float) this.anInt2342) && !(local54 > (float) local3.anInt6760)) {
				@Pc(106) int local106 = this.anInt2344 + (int) ((float) this.anInt2339 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat54 * (float) local19 + this.aClass109_Sub1_1.aFloat56 * (float) local24 + this.aClass109_Sub1_1.aFloat55 * (float) local29) / (float) arg1);
				@Pc(142) int local142 = this.anInt2353 + (int) ((float) this.anInt2355 * (this.aClass109_Sub1_1.aFloat62 + this.aClass109_Sub1_1.aFloat59 * (float) local19 + this.aClass109_Sub1_1.aFloat65 * (float) local24 + this.aClass109_Sub1_1.aFloat60 * (float) local29) / (float) arg1);
				if (local106 >= this.anInt2348 && local106 <= this.anInt2356 && local142 >= this.anInt2347 && local142 <= this.anInt2341) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method2308(local14, local106, local142, (int) local54, (local14.anInt5628 * this.anInt2339 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)V")
	@Override
	public void method6671(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2328;
		for (@Pc(9) Object local9 = this.aClass359_15.method8513(); local9 != null; local9 = this.aClass359_15.method8518()) {
			@Pc(13) Class6_Sub26 local13 = (Class6_Sub26) local9;
			if (local13.aBoolean389) {
				local13.anInt5107 += local4;
				@Pc(27) int local27 = local13.anInt5107 / 20;
				if (local27 > 0) {
					@Pc(36) Class297 local36 = super.anInterface11_10.method6027(local13.anInt5108);
					local13.method4675(local36.aByte121 * local4 * 50 / 1000, local36.aByte119 * local4 * 50 / 1000);
					local13.anInt5107 -= local27 * 20;
				}
				local13.aBoolean389 = false;
			}
		}
		this.anInt2328 = arg0;
		this.aClass359_16.method8502(5);
		this.aClass359_15.method8502(5);
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(II)I")
	@Override
	public int method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		@Pc(6) Class78 local6 = local3.aClass78_1;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(22) int local22 = local10 >= 0 ? local10 : -local10;
		@Pc(30) int local30 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local22;
		if (local22 < local30) {
			local32 = local30;
		}
		if (local32 == 0) {
			return;
		}
		@Pc(47) int local47 = (local10 << 16) / local32;
		@Pc(53) int local53 = (local14 << 16) / local32;
		local10 += local47 >> 16;
		local14 += local53 >> 16;
		if (local53 <= local47) {
			local47 = -local47;
		} else {
			local53 = -local53;
		}
		@Pc(81) int local81 = arg5 * local53 >> 17;
		@Pc(89) int local89 = arg5 * local53 + 1 >> 17;
		@Pc(95) int local95 = arg5 * local47 >> 17;
		@Pc(103) int local103 = arg5 * local47 + 1 >> 17;
		@Pc(108) int local108 = arg0 - local6.method2000();
		@Pc(113) int local113 = arg1 - local6.method1998();
		@Pc(117) int local117 = local108 + local81;
		@Pc(121) int local121 = local108 - local89;
		@Pc(127) int local127 = local108 + local10 - local89;
		@Pc(133) int local133 = local108 + local10 + local81;
		@Pc(137) int local137 = local113 + local95;
		@Pc(141) int local141 = local113 - local103;
		@Pc(147) int local147 = local113 + local14 - local103;
		@Pc(153) int local153 = local113 + local14 + local95;
		local6.anInt2064 = 0;
		this.C(false);
		local6.aBoolean177 = local117 < 0 || local117 > local6.anInt2065 || local121 < 0 || local121 > local6.anInt2065 || local127 < 0 || local127 > local6.anInt2065;
		local6.method1989((float) local137, (float) local141, (float) local147, (float) local117, (float) local121, (float) local127, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean177 = local117 < 0 || local117 > local6.anInt2065 || local127 < 0 || local127 > local6.anInt2065 || local133 < 0 || local133 > local6.anInt2065;
		local6.method1989((float) local137, (float) local147, (float) local153, (float) local117, (float) local127, (float) local133, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(I)I")
	public int method2315(@OriginalArg(0) int arg0) {
		return super.anInterface11_10.method6027(arg0).aShort98 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "()V")
	@Override
	public void method6642() {
	}

	@OriginalMember(owner = "client!ed", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2345) {
			arg2 = this.anInt2345;
		}
		if (arg3 > this.anInt2334) {
			arg3 = this.anInt2334;
		}
		this.anInt2348 = arg0;
		this.anInt2356 = arg2;
		this.anInt2347 = arg1;
		this.anInt2341 = arg3;
		this.method2307();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6698(@OriginalArg(0) Class6_Sub18 arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!cu;Z)Lclient!tb;")
	@Override
	public Class49 method6714(@OriginalArg(0) Class64 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray82;
		@Pc(5) byte[] local5 = arg0.aByteArray12;
		@Pc(8) int local8 = arg0.anInt1300;
		@Pc(11) int local11 = arg0.anInt1297;
		@Pc(80) Class49_Sub1 local80;
		@Pc(22) int[] local22;
		@Pc(27) byte[] local27;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg1 && arg0.aByteArray11 == null) {
			local22 = new int[local2.length];
			local27 = new byte[local8 * local11];
			for (local29 = 0; local29 < local11; local29++) {
				local34 = local29 * local8;
				for (local36 = 0; local36 < local8; local36++) {
					local27[local34 + local36] = local5[local34 + local36];
				}
			}
			for (local34 = 0; local34 < local2.length; local34++) {
				local22[local34] = local2[local34];
			}
			local80 = new Class49_Sub1_Sub3(this, local27, local22, local8, local11);
		} else {
			local22 = new int[local8 * local11];
			local27 = arg0.aByteArray11;
			if (local27 == null) {
				for (local29 = 0; local29 < local11; local29++) {
					local34 = local29 * local8;
					for (local36 = 0; local36 < local8; local36++) {
						@Pc(162) int local162 = local2[local5[local34 + local36] & 0xFF];
						local22[local34 + local36] = local162 == 0 ? 0 : local162 | 0xFF000000;
					}
				}
				local80 = new Class49_Sub1_Sub2(this, local22, local8, local11);
			} else {
				for (local29 = 0; local29 < local11; local29++) {
					local34 = local29 * local8;
					for (local36 = 0; local36 < local8; local36++) {
						local22[local34 + local36] = local2[local5[local34 + local36] & 0xFF] | local27[local34 + local36] << 24;
					}
				}
				local80 = new Class49_Sub1_Sub1(this, local22, local8, local11);
			}
		}
		local80.method8989(arg0.anInt1302, arg0.anInt1301, arg0.anInt1298, arg0.anInt1299);
		return local80;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6657(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas6 = null;
			this.aClass6_Sub41_1 = null;
			if (this.aClass102_1 == null) {
				this.anIntArray128 = null;
				this.anInt2345 = this.anInt2334 = 1;
				this.anInt2349 = this.anInt2338 = 1;
				this.method2303();
			}
			return;
		}
		@Pc(10) Class6_Sub41 local10 = (Class6_Sub41) this.aClass74_12.method1401((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas6 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt2330 = local18.width;
		this.anInt2329 = local18.height;
		this.aClass6_Sub41_1 = local10;
		if (this.aClass102_1 != null) {
			return;
		}
		this.anIntArray128 = local10.anIntArray653;
		this.anInt2345 = local10.anInt9945;
		this.anInt2334 = local10.anInt9947;
		if (this.anInt2345 != this.anInt2349 || this.anInt2334 != this.anInt2338) {
			this.anInt2351 = this.anInt2349 = this.anInt2345;
			this.anInt2336 = this.anInt2338 = this.anInt2334;
			this.aFloatArray27 = this.aFloatArray28 = new float[this.anInt2349 * this.anInt2338];
		}
		this.method2303();
		return;
	}

	@OriginalMember(owner = "client!ed", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class246 local3 = this.method2314(Thread.currentThread());
		local3.anInt6761 = arg0;
		local3.anInt6757 = arg1;
		local3.anInt6762 = arg2;
	}

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "()V")
	@Override
	public void method6645() {
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(110) int local110;
			@Pc(143) int local143;
			@Pc(161) int local161;
			@Pc(229) int local229;
			@Pc(246) int local246;
			@Pc(251) int local251;
			@Pc(331) int local331;
			@Pc(220) int local220;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(100) int local100 = arg3 << 16;
				local110 = (int) Math.floor((double) local100 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt2348) {
					arg1 += local110 * (this.anInt2348 - arg0);
					arg0 = this.anInt2348;
				}
				if (arg2 >= this.anInt2356) {
					arg2 = this.anInt2356 - 1;
				}
				local143 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local143 == 255) {
					while (arg0 <= arg2) {
						local161 = arg1 >> 16;
						if (local161 >= this.anInt2347 && local161 < this.anInt2341) {
							this.anIntArray128[arg0 + local161 * this.anInt2345] = arg4;
						}
						arg1 += local110;
						arg0++;
					}
				} else if (arg5 == 1) {
					local220 = ((arg4 & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local143 >> 8 & 0xFF00) + (local143 << 24);
					local161 = 256 - local143;
					while (arg0 <= arg2) {
						local229 = arg1 >> 16;
						if (local229 >= this.anInt2347 && local229 < this.anInt2341) {
							local246 = arg0 + local229 * this.anInt2345;
							local251 = this.anIntArray128[local246];
							local251 = ((local251 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local251 & 0xFF00) * local161 >> 8 & 0xFF00);
							this.anIntArray128[local246] = local220 + local251;
						}
						arg1 += local110;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local161 = arg1 >> 16;
						if (local161 >= this.anInt2347 && local161 < this.anInt2341) {
							local229 = arg0 + local161 * this.anInt2345;
							local246 = this.anIntArray128[local229];
							local251 = arg4 + local246;
							local331 = (arg4 & 0xFF00FF) + (local246 & 0xFF00FF);
							local246 = (local331 & 0x1000100) + (local251 - local331 & 0x10000);
							this.anIntArray128[local229] = local251 - local246 | local246 - (local246 >>> 8);
						}
						arg1 += local110;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(380) int local380 = arg2 << 16;
				local110 = (int) Math.floor((double) local380 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt2347) {
					arg0 += local110 * (this.anInt2347 - arg1);
					arg1 = this.anInt2347;
				}
				if (arg3 >= this.anInt2341) {
					arg3 = this.anInt2341 - 1;
				}
				local143 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local143 == 255) {
					while (arg1 <= arg3) {
						local161 = arg0 >> 16;
						if (local161 >= this.anInt2348 && local161 < this.anInt2356) {
							this.anIntArray128[local161 + arg1 * this.anInt2345] = arg4;
						}
						arg0 += local110;
						arg1++;
					}
				} else if (arg5 == 1) {
					local220 = ((arg4 & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local143 >> 8 & 0xFF00) + (local143 << 24);
					local161 = 256 - local143;
					while (arg1 <= arg3) {
						local229 = arg0 >> 16;
						if (local229 >= this.anInt2348 && local229 < this.anInt2356) {
							local246 = local229 + arg1 * this.anInt2345;
							local251 = this.anIntArray128[local246];
							local251 = ((local251 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local251 & 0xFF00) * local161 >> 8 & 0xFF00);
							this.anIntArray128[local229 + arg1 * this.anInt2345] = local220 + local251;
						}
						arg0 += local110;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local161 = arg0 >> 16;
						if (local161 >= this.anInt2348 && local161 < this.anInt2356) {
							local229 = local161 + arg1 * this.anInt2345;
							local246 = this.anIntArray128[local229];
							local251 = arg4 + local246;
							local331 = (arg4 & 0xFF00FF) + (local246 & 0xFF00FF);
							@Pc(626) int local626 = (local331 & 0x1000100) + (local251 - local331 & 0x10000);
							this.anIntArray128[local229] = local251 - local626 | local626 - (local626 >>> 8);
						}
						arg0 += local110;
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

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "()V")
	@Override
	public void method6632() {
		this.aClass359_15.method8507();
		this.aClass359_16.method8507();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIIIII)V")
	private void method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt2347 || arg1 >= this.anInt2341) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg1 * this.anInt2345;
		@Pc(22) int local22 = arg3 >>> 24;
		@Pc(26) int local26 = arg4 + arg5;
		@Pc(30) int local30 = arg6 % local26;
		@Pc(44) int local44;
		if (local22 == 255 && true) {
			local44 = 0;
			while (local44 < arg2) {
				if (arg0 + local44 >= this.anInt2348 && arg0 + local44 < this.anInt2356 && local30 < arg4) {
					this.anIntArray128[local18 + local44] = arg3;
				}
				local44++;
				local30++;
				local30 %= local26;
			}
			return;
		}
		@Pc(111) int local111 = ((arg3 & 0xFF00FF) * local22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local22 >> 8 & 0xFF00) + (local22 << 24);
		local44 = 256 - local22;
		@Pc(117) int local117 = 0;
		while (local117 < arg2) {
			if (arg0 + local117 >= this.anInt2348 && arg0 + local117 < this.anInt2356 && local30 < arg4) {
				@Pc(144) int local144 = this.anIntArray128[local18 + local117];
				@Pc(164) int local164 = ((local144 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((local144 & 0xFF00) * local44 >> 8 & 0xFF00);
				this.anIntArray128[local18 + local117] = local111 + local164;
			}
			local117++;
			local30++;
			local30 %= local26;
		}
	}

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass246Array1.length; local1++) {
			@Pc(7) Class246 local7 = this.aClass246Array1[local1];
			local7.anInt6757 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt6757 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt6757 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt6757 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt6757 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean506 = false;
			} else {
				local7.aBoolean506 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class96 method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class96_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ed", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt2333;
	}
}
