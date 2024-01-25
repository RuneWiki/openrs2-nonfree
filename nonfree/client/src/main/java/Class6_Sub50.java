import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class6_Sub50 extends Class6 {

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!jl;")
	private Class166 aClass166_14;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!wl", name = "I", descriptor = "Lclient!mh;")
	private final Class62_Sub2 aClass62_Sub2_2;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
	private final int[] anIntArray835;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public final int anInt9699;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	public final int anInt9701;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
	public final int anInt9705;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "F")
	public final float aFloat197;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_42;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public final int anInt9697;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!us;")
	private final Class14_Sub2 aClass14_Sub2_2;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!mh;IIIII)V")
	public Class6_Sub50(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass62_Sub2_2 = arg0;
		this.anIntArray835 = new int[this.aClass62_Sub2_2.anInt9885 * this.aClass62_Sub2_2.anInt9881];
		this.anInt9699 = arg5;
		this.anInt9701 = arg1;
		this.anInt9705 = arg4;
		this.aFloat197 = arg2;
		this.aClass9_Sub2_42 = this.aClass62_Sub2_2.aClass9_Sub2_21;
		this.anInt9697 = arg3;
		this.aClass14_Sub2_2 = new Class14_Sub2(this.aClass9_Sub2_42, 5123, null, 1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V")
	public void method8080(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass9_Sub2_42.aNativeHeap1.a(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IFIII)V")
	public void method8081(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(31) int local31;
		if (this.anInt9701 != -1) {
			@Pc(13) Class296 local13 = this.aClass9_Sub2_42.anInterface2_11.method3585(this.anInt9701);
			local18 = local13.aByte103 & 0xFF;
			@Pc(57) int local57;
			if (local18 != 0 && local13.aByte104 != 4) {
				if (arg1 < 0) {
					local31 = 0;
				} else if (arg1 <= 127) {
					local31 = arg1 * 131586;
				} else {
					local31 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local31;
				} else {
					local57 = 256 - local18;
					arg3 = (local57 * (arg3 & 0xFF00) + local18 * (local31 & 0xFF00) & 0xFF0000) + (local18 * (local31 & 0xFF00FF) + ((arg3 & 0xFF00FF) * local57) & 0xFF00FF00) >> 8;
				}
			}
			local31 = local13.aByte101 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (arg3 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local57 = (arg3 >> 8 & 0xFF) * local31;
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(132) int local132 = (arg3 & 0xFF) * local31;
				if (local132 > 65535) {
					local132 = 65535;
				}
				arg3 = (local104 << 8 & 0xFF00DF) + (local57 & 0xFF00) + (local132 >> 8);
			}
		}
		this.aStream7.a(arg2 * 4);
		if (arg0 != 1.0F) {
			@Pc(171) int local171 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local171 = (int) ((float) local171 * arg0);
			local31 = arg3 & 0xFF;
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			local18 = (int) ((float) local18 * arg0);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local31 = (int) ((float) local31 * arg0);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg3 = local31 | local171 << 16 | local18 << 8;
		}
		this.aStream7.f((byte) (arg3 >> 16));
		this.aStream7.f((byte) (arg3 >> 8));
		this.aStream7.f((byte) arg3);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
	public void method8083(@OriginalArg(1) int arg0) {
		this.aStream7.a();
		@Pc(18) Interface18 local18 = this.aClass9_Sub2_42.method773(this.aNativeHeapBuffer8, 4, arg0 * 4);
		this.aClass166_14 = new Class166(local18, 5121, 4, 0);
		this.aStream7 = null;
		this.aNativeHeapBuffer8 = null;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(IB)V")
	public void method8084(@OriginalArg(0) int arg0) {
		this.aStream7.a(arg0 * 4 + 3);
		this.aStream7.f(-1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([III)V")
	public void method8085(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) Class6_Sub26_Sub1 local17 = this.aClass9_Sub2_42.aClass6_Sub26_Sub1_1;
		local17.anInt5769 = 0;
		@Pc(38) short[] local38;
		@Pc(32) int local32;
		@Pc(43) int local43;
		@Pc(26) int local26;
		@Pc(49) int local49;
		@Pc(51) int local51;
		if (this.aClass9_Sub2_42.aBoolean65) {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local38 = this.aClass62_Sub2_2.aShortArrayArray5[local32];
				local43 = this.anIntArray835[local32];
				if (local43 != 0 && local38 != null) {
					local49 = 0;
					local51 = 0;
					while (local38.length > local51) {
						if ((0x1 << local49++ & local43) == 0) {
							local51 += 3;
						} else {
							local7++;
							local17.method4962(local38[local51++] & 0xFFFF);
							local17.method4962(local38[local51++] & 0xFFFF);
							local7++;
							local7++;
							local17.method4962(local38[local51++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local43 = this.anIntArray835[local32];
				local38 = this.aClass62_Sub2_2.aShortArrayArray5[local32];
				if (local43 != 0 && local38 != null) {
					local49 = 0;
					local51 = 0;
					while (local38.length > local51) {
						if ((0x1 << local49++ & local43) == 0) {
							local51 += 3;
						} else {
							local7++;
							local17.method4993(local38[local51++] & 0xFFFF);
							local7++;
							local17.method4993(local38[local51++] & 0xFFFF);
							local17.method4993(local38[local51++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass14_Sub2_2.method7657(local17.anInt5769, local17.aByteArray65);
		this.aClass9_Sub2_42.method805(this.aClass62_Sub2_2.aClass166_8, this.aClass62_Sub2_2.aClass166_7, this.aClass166_14, this.aClass62_Sub2_2.aClass166_6);
		this.aClass9_Sub2_42.method799((this.aClass62_Sub2_2.anInt6082 & 0x8) != 0, (this.aClass62_Sub2_2.anInt6082 & 0x7) != 0, this.anInt9701);
		if (this.aClass9_Sub2_42.aBoolean63) {
			this.aClass9_Sub2_42.LA(Integer.MAX_VALUE, this.anInt9697, this.anInt9705, this.anInt9699);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat197, 1.0F / this.aFloat197, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass9_Sub2_42.method805(this.aClass62_Sub2_2.aClass166_8, this.aClass62_Sub2_2.aClass166_7, this.aClass166_14, this.aClass62_Sub2_2.aClass166_6);
		this.aClass9_Sub2_42.method790(local7, 0, this.aClass14_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)V")
	public void method8089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray835[this.aClass62_Sub2_2.anInt9881 * arg0 + arg1] |= 0x1 << arg2;
	}
}
