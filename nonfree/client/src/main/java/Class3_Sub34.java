import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!gr;")
	private Class112 aClass112_10;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!pf;")
	private final Class52_Sub3 aClass52_Sub3_1;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	public final int anInt6149;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "F")
	public final float aFloat178;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	public final int anInt6147;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public final int anInt6145;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[I")
	private final int[] anIntArray541;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	public final int anInt6151;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_24;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!jp;")
	private final Class33_Sub2 aClass33_Sub2_1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!pf;IIIII)V")
	public Class3_Sub34(@OriginalArg(0) Class52_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass52_Sub3_1 = arg0;
		this.anInt6149 = arg5;
		this.aFloat178 = arg2;
		this.anInt6147 = arg3;
		this.anInt6145 = arg1;
		this.anIntArray541 = new int[this.aClass52_Sub3_1.anInt9492 * this.aClass52_Sub3_1.anInt9491];
		this.anInt6151 = arg4;
		this.aClass5_Sub1_24 = this.aClass52_Sub3_1.aClass5_Sub1_28;
		this.aClass33_Sub2_1 = new Class33_Sub2(this.aClass5_Sub1_24, 5123, null, 1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public void method5141(@OriginalArg(1) int arg0) {
		this.aStream6.a();
		@Pc(18) Interface1 local18 = this.aClass5_Sub1_24.method426(arg0 * 4, this.aNativeHeapBuffer7, 4);
		this.aClass112_10 = new Class112(local18, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer7 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public void method5143(@OriginalArg(1) int arg0) {
		this.aStream6.e(arg0 * 4 + 3);
		this.aStream6.a(-1);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(BI)V")
	public void method5145(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass5_Sub1_24.aNativeHeap1.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer7);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
	public void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray541[arg2 * this.aClass52_Sub3_1.anInt9491 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIFI)V")
	public void method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (this.anInt6145 != -1) {
			@Pc(13) Class238 local13 = this.aClass5_Sub1_24.anInterface4_14.method6712(this.anInt6145);
			local18 = local13.aByte67 & 0xFF;
			@Pc(57) int local57;
			if (local18 != 0 && local13.aByte70 != 4) {
				if (arg1 < 0) {
					local36 = 0;
				} else if (arg1 <= 127) {
					local36 = arg1 * 131586;
				} else {
					local36 = 16777215;
				}
				if (local18 == 256) {
					arg0 = local36;
				} else {
					local57 = 256 - local18;
					arg0 = (local18 * (local36 & 0xFF00FF) + local57 * (arg0 & 0xFF00FF) & 0xFF00FF00) + (local57 * (arg0 & 0xFF00) + local18 * (local36 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local36 = local13.aByte71 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(103) int local103 = local36 * (arg0 >> 16 & 0xFF);
				if (local103 > 65535) {
					local103 = 65535;
				}
				local57 = (arg0 >> 8 & 0xFF) * local36;
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(129) int local129 = local36 * (arg0 & 0xFF);
				if (local129 > 65535) {
					local129 = 65535;
				}
				arg0 = (local129 >> 8) + (local103 << 8 & 0xFF00E6) + (local57 & 0xFF00);
			}
		}
		this.aStream6.e(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(176) int local176 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local176 = (int) ((float) local176 * arg3);
			local36 = arg0 & 0xFF;
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local18 = (int) ((float) local18 * arg3);
			local36 = (int) ((float) local36 * arg3);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg0 = local18 << 8 | local176 << 16 | local36;
		}
		this.aStream6.a((byte) (arg0 >> 16));
		this.aStream6.a((byte) (arg0 >> 8));
		this.aStream6.a((byte) arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([III)V")
	public void method5150(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = 0;
		@Pc(17) Class3_Sub27_Sub2 local17 = this.aClass5_Sub1_24.aClass3_Sub27_Sub2_1;
		local17.anInt9191 = 0;
		@Pc(43) short[] local43;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(26) int local26;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (this.aClass5_Sub1_24.aBoolean39) {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local37 = this.anIntArray541[local32];
				local43 = this.aClass52_Sub3_1.aShortArrayArray6[local32];
				if (local37 != 0 && local43 != null) {
					local52 = 0;
					local54 = 0;
					while (local43.length > local54) {
						if ((0x1 << local52++ & local37) == 0) {
							local54 += 3;
						} else {
							local17.method7600(local43[local54++] & 0xFFFF, 30364);
							local13++;
							local13++;
							local17.method7600(local43[local54++] & 0xFFFF, 30364);
							local13++;
							local17.method7600(local43[local54++] & 0xFFFF, 30364);
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local43 = this.aClass52_Sub3_1.aShortArrayArray6[local32];
				local37 = this.anIntArray541[local32];
				if (local37 != 0 && local43 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local43.length) {
						if ((local37 & 0x1 << local52++) == 0) {
							local54 += 3;
						} else {
							local13++;
							local17.method7556(local43[local54++] & 0xFFFF);
							local17.method7556(local43[local54++] & 0xFFFF);
							local13++;
							local13++;
							local17.method7556(local43[local54++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local13 <= 0) {
			return;
		}
		this.aClass33_Sub2_1.method5402(local17.aByteArray114, local17.anInt9191);
		this.aClass5_Sub1_24.method383(this.aClass52_Sub3_1.aClass112_13, this.aClass52_Sub3_1.aClass112_12, this.aClass112_10, this.aClass52_Sub3_1.aClass112_11);
		this.aClass5_Sub1_24.method380((this.aClass52_Sub3_1.anInt6927 & 0x7) != 0, (this.aClass52_Sub3_1.anInt6927 & 0x8) != 0, this.anInt6145);
		if (this.aClass5_Sub1_24.aBoolean19) {
			this.aClass5_Sub1_24.LA(Integer.MAX_VALUE, this.anInt6147, this.anInt6151, this.anInt6149);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat178, 1.0F / this.aFloat178, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass5_Sub1_24.method383(this.aClass52_Sub3_1.aClass112_13, this.aClass52_Sub3_1.aClass112_12, this.aClass112_10, this.aClass52_Sub3_1.aClass112_11);
		this.aClass5_Sub1_24.method391(0, local13, this.aClass33_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
