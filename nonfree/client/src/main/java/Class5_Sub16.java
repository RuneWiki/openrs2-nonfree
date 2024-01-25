import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!pp;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Lclient!jk;")
	private final Class125_Sub1 aClass125_Sub1_1;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	public final int anInt2390;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	public final int anInt2383;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "[I")
	private final int[] anIntArray134;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "F")
	public final float aFloat47;

	@OriginalMember(owner = "client!gh", name = "G", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_20;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
	public final int anInt2391;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public final int anInt2380;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "Lclient!as;")
	private final Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!jk;IIIII)V")
	public Class5_Sub16(@OriginalArg(0) Class125_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass125_Sub1_1 = arg0;
		this.anInt2390 = arg4;
		this.anInt2383 = arg3;
		this.anIntArray134 = new int[this.aClass125_Sub1_1.anInt6299 * this.aClass125_Sub1_1.anInt6301];
		this.aFloat47 = arg2;
		this.aClass200_Sub2_20 = this.aClass125_Sub1_1.aClass200_Sub2_26;
		this.anInt2391 = arg5;
		this.anInt2380 = arg1;
		this.aClass15_Sub1_1 = new Class15_Sub1(this.aClass200_Sub2_20, 5123, null, 1);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
	public void method1927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray134[arg2 * this.aClass125_Sub1_1.anInt6301 + arg0] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public void method1928(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[II)V")
	public void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) Class5_Sub15_Sub1 local17 = this.aClass200_Sub2_20.aClass5_Sub15_Sub1_2;
		local17.anInt7013 = 0;
		@Pc(43) short[] local43;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(26) int local26;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (this.aClass200_Sub2_20.aBoolean433) {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local37 = this.anIntArray134[local32];
				local43 = this.aClass125_Sub1_1.aShortArrayArray7[local32];
				if (local37 != 0 && local43 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local43.length) {
						if ((0x1 << local52++ & local37) == 0) {
							local54 += 3;
						} else {
							local7++;
							local17.method5566(local43[local54++] & 0xFFFF);
							local7++;
							local17.method5566(local43[local54++] & 0xFFFF);
							local7++;
							local17.method5566(local43[local54++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local43 = this.aClass125_Sub1_1.aShortArrayArray7[local32];
				local37 = this.anIntArray134[local32];
				if (local37 != 0 && local43 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local43.length) {
						if ((local37 & 0x1 << local52++) == 0) {
							local54 += 3;
						} else {
							local17.method5568(local43[local54++] & 0xFFFF);
							local7++;
							local7++;
							local17.method5568(local43[local54++] & 0xFFFF);
							local7++;
							local17.method5568(local43[local54++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass15_Sub1_1.method1489(local17.aByteArray93, local17.anInt7013);
		this.aClass200_Sub2_20.method5311(this.aClass195_1, this.aClass125_Sub1_1.aClass195_5, this.aClass125_Sub1_1.aClass195_4, this.aClass125_Sub1_1.aClass195_7);
		this.aClass200_Sub2_20.method5306((this.aClass125_Sub1_1.anInt3315 & 0x8) != 0, this.anInt2380, (this.aClass125_Sub1_1.anInt3315 & 0x7) != 0);
		if (this.aClass200_Sub2_20.aBoolean452) {
			this.aClass200_Sub2_20.a(Integer.MAX_VALUE, this.anInt2383, this.anInt2390, this.anInt2391);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat47, 1.0F / this.aFloat47, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass200_Sub2_20.method5311(this.aClass195_1, this.aClass125_Sub1_1.aClass195_5, this.aClass125_Sub1_1.aClass195_4, this.aClass125_Sub1_1.aClass195_7);
		this.aClass200_Sub2_20.method5325(0, this.aClass15_Sub1_1, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
	public void method1931(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass200_Sub2_20.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IFIII)V")
	public void method1932(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(31) int local31;
		if (this.anInt2380 != -1) {
			@Pc(14) Class178 local14 = this.aClass200_Sub2_20.anInterface8_134.method4125(this.anInt2380);
			local19 = local14.aByte53 & 0xFF;
			@Pc(62) int local62;
			if (local19 != 0 && local14.aByte55 != 4) {
				if (arg1 < 0) {
					local31 = 0;
				} else if (arg1 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg1 * 131586;
				}
				if (local19 == 256) {
					arg2 = local31;
				} else {
					local62 = 256 - local19;
					arg2 = ((arg2 & 0xFF00) * local62 + local19 * (local31 & 0xFF00) & 0xFF0000) + (local62 * (arg2 & 0xFF00FF) + local19 * (local31 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local31 = local14.aByte52 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(108) int local108 = (arg2 >> 16 & 0xFF) * local31;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local62 = (arg2 >> 8 & 0xFF) * local31;
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(136) int local136 = (arg2 & 0xFF) * local31;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg2 = ((local108 & 0x5000FF00) << 8) - (-(local62 & 0xFF00) - (local136 >> 8));
			}
		}
		this.aNativeStream1.b(arg3 * 4);
		if (arg0 != 1.0F) {
			@Pc(177) int local177 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg0);
			local31 = arg2 & 0xFF;
			local19 = (int) ((float) local19 * arg0);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local31 = (int) ((float) local31 * arg0);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg2 = local177 << 16 | local19 << 8 | local31;
		}
		this.aNativeStream1.a((byte) (arg2 >> 16));
		this.aNativeStream1.a((byte) (arg2 >> 8));
		this.aNativeStream1.a((byte) arg2);
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)V")
	public void method1933(@OriginalArg(0) int arg0) {
		this.aNativeStream1.c();
		@Pc(24) Interface12 local24 = this.aClass200_Sub2_20.method5331(4, this.aNativeBuffer4, arg0 * 4);
		this.aClass195_1 = new Class195(local24, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}
}
