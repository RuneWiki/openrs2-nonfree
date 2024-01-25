import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class5_Sub54 extends Class5 {

	@OriginalMember(owner = "client!vja", name = "l", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!vja", name = "v", descriptor = "Lclient!dea;")
	private Class79 aClass79_16;

	@OriginalMember(owner = "client!vja", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!vja", name = "n", descriptor = "Lclient!lc;")
	private final Class109_Sub2 aClass109_Sub2_2;

	@OriginalMember(owner = "client!vja", name = "G", descriptor = "I")
	public final int anInt10345;

	@OriginalMember(owner = "client!vja", name = "z", descriptor = "I")
	public final int anInt10339;

	@OriginalMember(owner = "client!vja", name = "t", descriptor = "I")
	public final int anInt10337;

	@OriginalMember(owner = "client!vja", name = "y", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_40;

	@OriginalMember(owner = "client!vja", name = "w", descriptor = "[I")
	private final int[] anIntArray562;

	@OriginalMember(owner = "client!vja", name = "B", descriptor = "I")
	public final int anInt10341;

	@OriginalMember(owner = "client!vja", name = "m", descriptor = "F")
	public final float aFloat210;

	@OriginalMember(owner = "client!vja", name = "E", descriptor = "Lclient!ww;")
	private final Class274_Sub2 aClass274_Sub2_2;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!lc;IIIII)V")
	public Class5_Sub54(@OriginalArg(0) Class109_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass109_Sub2_2 = arg0;
		this.anInt10345 = arg5;
		this.anInt10339 = arg4;
		this.anInt10337 = arg3;
		this.aClass65_Sub1_40 = this.aClass109_Sub2_2.aClass65_Sub1_18;
		this.anIntArray562 = new int[this.aClass109_Sub2_2.anInt9065 * this.aClass109_Sub2_2.anInt9061];
		this.anInt10341 = arg1;
		this.aFloat210 = (float) arg2;
		this.aClass274_Sub2_2 = new Class274_Sub2(this.aClass65_Sub1_40, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(II)V")
	public void method8560(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass65_Sub1_40.aNativeHeap1.a(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IB)V")
	public void method8564(@OriginalArg(0) int arg0) {
		this.aStream7.d(arg0 * 4 + 3);
		this.aStream7.f(-1);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII)V")
	public void method8565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray562[this.aClass109_Sub2_2.anInt9061 * arg2 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIFII)V")
	public void method8566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(39) int local39;
		if (this.anInt10341 != -1) {
			@Pc(17) Class136 local17 = this.aClass65_Sub1_40.anInterface4_11.method358(this.anInt10341);
			local22 = local17.aByte55 & 0xFF;
			@Pc(64) int local64;
			if (local22 != 0 && local17.aByte56 != 4) {
				if (arg1 < 0) {
					local39 = 0;
				} else if (arg1 > 127) {
					local39 = 16777215;
				} else {
					local39 = arg1 * 131586;
				}
				if (local22 == 256) {
					arg3 = local39;
				} else {
					local64 = 256 - local22;
					arg3 = ((arg3 & 0xFF00) * local64 + (local39 & 0xFF00) * local22 & 0xFF0000) + (local64 * (arg3 & 0xFF00FF) + local22 * (local39 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local39 = local17.aByte51 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(113) int local113 = (arg3 >> 16 & 0xFF) * local39;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local64 = local39 * (arg3 >> 8 & 0xFF);
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(141) int local141 = (arg3 & 0xFF) * local39;
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg3 = (local64 & 0xFF00) + ((local113 & 0xA00FF00) << 8) + (local141 >> 8);
			}
		}
		this.aStream7.d(arg0 * 4);
		if (arg2 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local22 = arg3 >> 8 & 0xFF;
			local39 = arg3 & 0xFF;
			local176 = (int) ((float) local176 * arg2);
			local22 = (int) ((float) local22 * arg2);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local39 = (int) ((float) local39 * arg2);
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg3 = local39 | local176 << 16 | local22 << 8;
		}
		this.aStream7.f((byte) (arg3 >> 16));
		this.aStream7.f((byte) (arg3 >> 8));
		this.aStream7.f((byte) arg3);
	}

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "(II)V")
	public void method8567(@OriginalArg(0) int arg0) {
		this.aStream7.a();
		@Pc(18) Interface17 local18 = this.aClass65_Sub1_40.method1281(4, arg0 * 4, this.aNativeHeapBuffer8);
		this.aClass79_16 = new Class79(local18, 5121, 4, 0);
		this.aNativeHeapBuffer8 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I[II)V")
	public void method8569(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5_Sub41_Sub1 local11 = this.aClass65_Sub1_40.aClass5_Sub41_Sub1_2;
		local11.anInt9230 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass65_Sub1_40.aBoolean97) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass109_Sub2_2.aShortArrayArray8[local26];
				local37 = this.anIntArray562[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((0x1 << local46++ & local37) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method7848(local32[local48++] & 0xFFFF);
							local11.method7848(local32[local48++] & 0xFFFF);
							local7++;
							local11.method7848(local32[local48++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass109_Sub2_2.aShortArrayArray8[local26];
				local37 = this.anIntArray562[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method7821(local32[local48++] & 0xFFFF);
							local7++;
							local11.method7821(local32[local48++] & 0xFFFF);
							local11.method7821(local32[local48++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass274_Sub2_2.method9043(local11.anInt9230, local11.aByteArray93);
		this.aClass65_Sub1_40.method1258(this.aClass109_Sub2_2.aClass79_5, this.aClass109_Sub2_2.aClass79_8, this.aClass79_16, this.aClass109_Sub2_2.aClass79_7);
		this.aClass65_Sub1_40.method1268(this.anInt10341, (this.aClass109_Sub2_2.anInt6146 & 0x7) != 0, (this.aClass109_Sub2_2.anInt6146 & 0x8) != 0);
		if (this.aClass65_Sub1_40.aBoolean117) {
			this.aClass65_Sub1_40.EA(Integer.MAX_VALUE, this.anInt10337, this.anInt10339, this.anInt10345);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat210, 1.0F / this.aFloat210, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass65_Sub1_40.method1258(this.aClass109_Sub2_2.aClass79_5, this.aClass109_Sub2_2.aClass79_8, this.aClass79_16, this.aClass109_Sub2_2.aClass79_7);
		this.aClass65_Sub1_40.method1291(this.aClass274_Sub2_2, local7, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
