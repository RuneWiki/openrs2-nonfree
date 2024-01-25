import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!bh;")
	private Class23 aClass23_8;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "Lclient!gb;")
	private final Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "I")
	public final int anInt3479;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "I")
	public final int anInt3472;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "[I")
	private final int[] anIntArray218;

	@OriginalMember(owner = "client!io", name = "C", descriptor = "I")
	public final int anInt3475;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_18;

	@OriginalMember(owner = "client!io", name = "H", descriptor = "F")
	public final float aFloat31;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	public final int anInt3473;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "Lclient!qb;")
	private final Class90_Sub2 aClass90_Sub2_2;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!gb;IIIII)V")
	public Class6_Sub18(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub1_1 = arg0;
		this.anInt3479 = arg5;
		this.anInt3472 = arg1;
		this.anIntArray218 = new int[this.aClass86_Sub1_1.anInt8047 * this.aClass86_Sub1_1.anInt8049];
		this.anInt3475 = arg4;
		this.aClass66_Sub2_18 = this.aClass86_Sub1_1.aClass66_Sub2_11;
		this.aFloat31 = arg2;
		this.anInt3473 = arg3;
		this.aClass90_Sub2_2 = new Class90_Sub2(this.aClass66_Sub2_18, 5123, null, 1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method2875(@OriginalArg(1) int arg0) {
		this.aNativeBuffer3 = this.aClass66_Sub2_18.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BIII)V")
	public void method2876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray218[arg2 + arg0 * this.aClass86_Sub1_1.anInt8047] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I[II)V")
	public void method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class6_Sub1 local9 = Static196.aClass6_Sub1_1;
		local9.anInt7898 = 0;
		@Pc(30) short[] local30;
		@Pc(24) int local24;
		@Pc(35) int local35;
		@Pc(18) int local18;
		@Pc(44) int local44;
		@Pc(46) int local46;
		if (this.aClass66_Sub2_18.aBoolean373) {
			for (local18 = 0; local18 < arg0; local18++) {
				local24 = arg1[local18];
				local30 = this.aClass86_Sub1_1.aShortArrayArray6[local24];
				local35 = this.anIntArray218[local24];
				if (local35 != 0 && local30 != null) {
					local44 = 0;
					local46 = 0;
					while (local30.length > local46) {
						if ((0x1 << local44++ & local35) == 0) {
							local46 += 3;
						} else {
							local7++;
							local9.method6453(local30[local46++] & 0xFFFF);
							local7++;
							local9.method6453(local30[local46++] & 0xFFFF);
							local9.method6453(local30[local46++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg0; local18++) {
				local24 = arg1[local18];
				local30 = this.aClass86_Sub1_1.aShortArrayArray6[local24];
				local35 = this.anIntArray218[local24];
				if (local35 != 0 && local30 != null) {
					local44 = 0;
					local46 = 0;
					while (local30.length > local46) {
						if ((0x1 << local44++ & local35) == 0) {
							local46 += 3;
						} else {
							local7++;
							local9.method6480(local30[local46++] & 0xFFFF);
							local9.method6480(local30[local46++] & 0xFFFF);
							local7++;
							local9.method6480(local30[local46++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass90_Sub2_2.method4586(local9.aByteArray96, local9.anInt7898);
		this.aClass66_Sub2_18.method5087(this.aClass23_8, this.aClass86_Sub1_1.aClass23_5, this.aClass86_Sub1_1.aClass23_4, this.aClass86_Sub1_1.aClass23_7);
		this.aClass66_Sub2_18.method5099(this.anInt3472, (this.aClass86_Sub1_1.anInt2593 & 0x8) != 0, (this.aClass86_Sub1_1.anInt2593 & 0x7) != 0);
		if (this.aClass66_Sub2_18.aBoolean376) {
			this.aClass66_Sub2_18.method5060(Integer.MAX_VALUE, this.anInt3473, this.anInt3475, this.anInt3479);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat31, 1.0F / this.aFloat31, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass66_Sub2_18.method5087(this.aClass23_8, this.aClass86_Sub1_1.aClass23_5, this.aClass86_Sub1_1.aClass23_4, this.aClass86_Sub1_1.aClass23_7);
		this.aClass66_Sub2_18.method5155(local7, 0, this.aClass90_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIF)V")
	public void method2878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(19) int local19;
		@Pc(31) int local31;
		if (this.anInt3472 != -1) {
			@Pc(14) Class184 local14 = this.aClass66_Sub2_18.anInterface8_5.method5566(this.anInt3472);
			local19 = local14.aByte73 & 0xFF;
			@Pc(56) int local56;
			if (local19 != 0 && local14.aByte72 != 4) {
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local19 == 256) {
					arg1 = local31;
				} else {
					local56 = 256 - local19;
					arg1 = ((local31 & 0xFF00) * local19 + (arg1 & 0xFF00) * local56 & 0xFF0000) + (local56 * (arg1 & 0xFF00FF) + local19 * (local31 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local31 = local14.aByte74 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(109) int local109 = local31 * (arg1 >> 16 & 0xFF);
				if (local109 > 65535) {
					local109 = 65535;
				}
				local56 = (arg1 >> 8 & 0xFF) * local31;
				if (local56 > 65535) {
					local56 = 65535;
				}
				@Pc(133) int local133 = local31 * (arg1 & 0xFF);
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg1 = (local56 & 0xFF00) + (local109 << 8 & 0xFF0059) + (local133 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(166) int local166 = arg1 >> 16 & 0xFF;
			local19 = arg1 >> 8 & 0xFF;
			local31 = arg1 & 0xFF;
			local166 = (int) ((float) local166 * arg3);
			local19 = (int) ((float) local19 * arg3);
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 255) {
				local166 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local31 = (int) ((float) local31 * arg3);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg1 = local31 | local19 << 8 | local166 << 16;
		}
		this.aNativeStream1.b(arg0 * 4);
		this.aNativeStream1.a((byte) (arg1 >> 16));
		this.aNativeStream1.a((byte) (arg1 >> 8));
		this.aNativeStream1.a((byte) arg1);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	public void method2882(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V")
	public void method2884(@OriginalArg(1) int arg0) {
		this.aNativeStream1.c();
		@Pc(23) Interface5 local23 = this.aClass66_Sub2_18.method5088(arg0 * 4, this.aNativeBuffer3, 4);
		this.aClass23_8 = new Class23(this.aClass66_Sub2_18, local23, 5121, 4, 0);
		this.aNativeBuffer3 = null;
		this.aNativeStream1 = null;
	}
}
