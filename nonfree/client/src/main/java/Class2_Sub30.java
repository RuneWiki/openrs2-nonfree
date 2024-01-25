import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "Lclient!nh;")
	private Class223 aClass223_5;

	@OriginalMember(owner = "client!jn", name = "K", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "Lclient!ed;")
	private final Class65_Sub2 aClass65_Sub2_1;

	@OriginalMember(owner = "client!jn", name = "G", descriptor = "[I")
	private final int[] anIntArray330;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
	public final int anInt5715;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "F")
	public final float aFloat151;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_20;

	@OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
	public final int anInt5725;

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
	public final int anInt5720;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
	public final int anInt5716;

	@OriginalMember(owner = "client!jn", name = "H", descriptor = "Lclient!wv;")
	private final Class67_Sub2 aClass67_Sub2_1;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ed;IIIII)V")
	public Class2_Sub30(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub2_1 = arg0;
		this.anIntArray330 = new int[this.aClass65_Sub2_1.anInt9615 * this.aClass65_Sub2_1.anInt9618];
		this.anInt5715 = arg3;
		this.aFloat151 = arg2;
		this.aClass20_Sub3_20 = this.aClass65_Sub2_1.aClass20_Sub3_12;
		this.anInt5725 = arg1;
		this.anInt5720 = arg4;
		this.anInt5716 = arg5;
		this.aClass67_Sub2_1 = new Class67_Sub2(this.aClass20_Sub3_20, 5123, null, 1);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBII)V")
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray330[arg1 * this.aClass65_Sub2_1.anInt9615 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
	public void method4945(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass20_Sub3_20.aNativeHeap6.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer7);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[I)V")
	public void method4947(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub11_Sub1 local11 = this.aClass20_Sub3_20.aClass2_Sub11_Sub1_1;
		local11.anInt10066 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass20_Sub3_20.aBoolean616) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass65_Sub2_1.aShortArrayArray10[local26];
				local37 = this.anIntArray330[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local11.method8333(local32[local48++] & 0xFFFF);
							local7++;
							local11.method8333(local32[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method8333(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local37 = this.anIntArray330[local26];
				local32 = this.aClass65_Sub2_1.aShortArrayArray10[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local32.length) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method8393(local32[local48++] & 0xFFFF);
							local11.method8393(local32[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method8393(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass67_Sub2_1.method9227(local11.aByteArray128, local11.anInt10066);
		this.aClass20_Sub3_20.method7381(this.aClass65_Sub2_1.aClass223_3, this.aClass223_5, this.aClass65_Sub2_1.aClass223_4, this.aClass65_Sub2_1.aClass223_2);
		this.aClass20_Sub3_20.method7333((this.aClass65_Sub2_1.anInt3150 & 0x7) != 0, this.anInt5725, (this.aClass65_Sub2_1.anInt3150 & 0x8) != 0);
		if (this.aClass20_Sub3_20.aBoolean632) {
			this.aClass20_Sub3_20.EA(Integer.MAX_VALUE, this.anInt5715, this.anInt5720, this.anInt5716);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat151, 1.0F / this.aFloat151, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass20_Sub3_20.method7381(this.aClass65_Sub2_1.aClass223_3, this.aClass223_5, this.aClass65_Sub2_1.aClass223_4, this.aClass65_Sub2_1.aClass223_2);
		this.aClass20_Sub3_20.method7346(local7, this.aClass67_Sub2_1, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIIIF)V")
	public void method4948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(23) int local23;
		@Pc(44) int local44;
		if (this.anInt5725 != -1) {
			@Pc(18) Class127 local18 = this.aClass20_Sub3_20.anInterface4_12.method8048(this.anInt5725);
			local23 = local18.aByte74 & 0xFF;
			@Pc(66) int local66;
			if (local23 != 0 && local18.aByte78 != 4) {
				if (arg1 < 0) {
					local44 = 0;
				} else if (arg1 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg1 * 131586;
				}
				if (local23 == 256) {
					arg2 = local44;
				} else {
					local66 = 256 - local23;
					arg2 = (local66 * (arg2 & 0xFF00FF) + (local44 & 0xFF00FF) * local23 & 0xFF00FF00) + (local66 * (arg2 & 0xFF00) + local23 * (local44 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local44 = local18.aByte79 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(120) int local120 = local44 * (arg2 >> 16 & 0xFF);
				if (local120 > 65535) {
					local120 = 65535;
				}
				local66 = (arg2 >> 8 & 0xFF) * local44;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(148) int local148 = (arg2 & 0xFF) * local44;
				if (local148 > 65535) {
					local148 = 65535;
				}
				arg2 = (local66 & 0xFF00) + (((local120 & 0xFA00FF00) << 8) + (local148 >> 8));
			}
		}
		this.aStream5.e(arg0 * 4);
		if (arg3 != 1.0F) {
			@Pc(190) int local190 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local44 = arg2 & 0xFF;
			local190 = (int) ((float) local190 * arg3);
			if (local190 < 0) {
				local190 = 0;
			} else if (local190 > 255) {
				local190 = 255;
			}
			local23 = (int) ((float) local23 * arg3);
			local44 = (int) ((float) local44 * arg3);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg2 = local23 << 8 | local190 << 16 | local44;
		}
		this.aStream5.f((byte) (arg2 >> 16));
		this.aStream5.f((byte) (arg2 >> 8));
		this.aStream5.f((byte) arg2);
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(II)V")
	public void method4950(@OriginalArg(1) int arg0) {
		this.aStream5.e(arg0 * 4 + 3);
		this.aStream5.f(-1);
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(II)V")
	public void method4951(@OriginalArg(1) int arg0) {
		this.aStream5.a();
		@Pc(22) Interface11 local22 = this.aClass20_Sub3_20.method7326(this.aNativeHeapBuffer7, 4, arg0 * 4);
		this.aClass223_5 = new Class223(local22, 5121, 4, 0);
		this.aStream5 = null;
		this.aNativeHeapBuffer7 = null;
	}
}
