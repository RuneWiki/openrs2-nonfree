import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!jia", name = "s", descriptor = "Lclient!dda;")
	private Class66 aClass66_7;

	@OriginalMember(owner = "client!jia", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!jia", name = "D", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!jia", name = "o", descriptor = "Lclient!uea;")
	private final Class112_Sub3 aClass112_Sub3_2;

	@OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
	public final int anInt5149;

	@OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
	public final int anInt5154;

	@OriginalMember(owner = "client!jia", name = "n", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_13;

	@OriginalMember(owner = "client!jia", name = "z", descriptor = "F")
	public final float aFloat122;

	@OriginalMember(owner = "client!jia", name = "i", descriptor = "[I")
	private final int[] anIntArray353;

	@OriginalMember(owner = "client!jia", name = "w", descriptor = "I")
	public final int anInt5159;

	@OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
	public final int anInt5152;

	@OriginalMember(owner = "client!jia", name = "C", descriptor = "Lclient!on;")
	private final Class232_Sub2 aClass232_Sub2_1;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!uea;IIIII)V")
	public Class2_Sub28(@OriginalArg(0) Class112_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass112_Sub3_2 = arg0;
		this.anInt5149 = arg5;
		this.anInt5154 = arg3;
		this.aClass87_Sub2_13 = this.aClass112_Sub3_2.aClass87_Sub2_40;
		this.aFloat122 = arg2;
		this.anIntArray353 = new int[this.aClass112_Sub3_2.anInt9340 * this.aClass112_Sub3_2.anInt9348];
		this.anInt5159 = arg1;
		this.anInt5152 = arg4;
		this.aClass232_Sub2_1 = new Class232_Sub2(this.aClass87_Sub2_13, 5123, null, 1);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IFIBI)V")
	public void method4300(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) int local27;
		@Pc(44) int local44;
		if (this.anInt5159 != -1) {
			@Pc(22) Class199 local22 = this.aClass87_Sub2_13.anInterface6_11.method6357(this.anInt5159);
			local27 = local22.aByte84 & 0xFF;
			@Pc(68) int local68;
			if (local27 != 0 && local22.aByte86 != 4) {
				if (arg2 < 0) {
					local44 = 0;
				} else if (arg2 <= 127) {
					local44 = arg2 * 131586;
				} else {
					local44 = 16777215;
				}
				if (local27 == 256) {
					arg3 = local44;
				} else {
					local68 = 256 - local27;
					arg3 = ((local44 & 0xFF00) * local27 + local68 * (arg3 & 0xFF00) & 0xFF0000) + (local68 * (arg3 & 0xFF00FF) + (local44 & 0xFF00FF) * local27 & 0xFF00FF00) >> 8;
				}
			}
			local44 = local22.aByte83 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(115) int local115 = (arg3 >> 16 & 0xFF) * local44;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local68 = (arg3 >> 8 & 0xFF) * local44;
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(141) int local141 = local44 * (arg3 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg3 = (local115 << 8 & 0xFF00E6) + (local68 & 0xFF00) + (local141 >> 8);
			}
		}
		this.aStream6.f(arg0 * 4);
		if (arg1 != 1.0F) {
			@Pc(181) int local181 = arg3 >> 16 & 0xFF;
			local27 = arg3 >> 8 & 0xFF;
			local44 = arg3 & 0xFF;
			local181 = (int) ((float) local181 * arg1);
			local27 = (int) ((float) local27 * arg1);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local44 = (int) ((float) local44 * arg1);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg3 = local44 | local181 << 16 | local27 << 8;
		}
		this.aStream6.e((byte) (arg3 >> 16));
		this.aStream6.e((byte) (arg3 >> 8));
		this.aStream6.e((byte) arg3);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BI)V")
	public void method4301(@OriginalArg(1) int arg0) {
		this.aStream6.f(arg0 * 4 + 3);
		this.aStream6.e(-1);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(II)V")
	public void method4306(@OriginalArg(1) int arg0) {
		this.aStream6.a();
		@Pc(18) Interface23 local18 = this.aClass87_Sub2_13.method6224(this.aNativeHeapBuffer4, arg0 * 4, 4);
		this.aClass66_7 = new Class66(local18, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(II[I)V")
	public void method4307(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub34_Sub1 local11 = this.aClass87_Sub2_13.aClass2_Sub34_Sub1_3;
		local11.anInt8188 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass87_Sub2_13.aBoolean559) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass112_Sub3_2.aShortArrayArray30[local26];
				local37 = this.anIntArray353[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((0x1 << local43++ & local37) == 0) {
							local45 += 3;
						} else {
							local11.method6854(local32[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method6854(local32[local45++] & 0xFFFF);
							local11.method6854(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass112_Sub3_2.aShortArrayArray30[local26];
				local37 = this.anIntArray353[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((local37 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local11.method6868(local32[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method6868(local32[local45++] & 0xFFFF);
							local11.method6868(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass232_Sub2_1.method6318(local11.anInt8188, local11.aByteArray77);
		this.aClass87_Sub2_13.method6151(this.aClass112_Sub3_2.aClass66_14, this.aClass112_Sub3_2.aClass66_15, this.aClass66_7, this.aClass112_Sub3_2.aClass66_16);
		this.aClass87_Sub2_13.method6207((this.aClass112_Sub3_2.anInt9364 & 0x7) != 0, (this.aClass112_Sub3_2.anInt9364 & 0x8) != 0, this.anInt5159);
		if (this.aClass87_Sub2_13.aBoolean556) {
			this.aClass87_Sub2_13.EA(Integer.MAX_VALUE, this.anInt5154, this.anInt5152, this.anInt5149);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat122, 1.0F / this.aFloat122, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass87_Sub2_13.method6151(this.aClass112_Sub3_2.aClass66_14, this.aClass112_Sub3_2.aClass66_15, this.aClass66_7, this.aClass112_Sub3_2.aClass66_16);
		this.aClass87_Sub2_13.method6162(local7, this.aClass232_Sub2_1, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIII)V")
	public void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray353[arg0 * this.aClass112_Sub3_2.anInt9348 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(II)V")
	public void method4309(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass87_Sub2_13.aNativeHeap5.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer4);
	}
}
