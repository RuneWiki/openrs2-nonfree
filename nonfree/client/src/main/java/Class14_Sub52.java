import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class14_Sub52 extends Class14 {

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "[C")
	private static final char[] aCharArray13 = new char[64];

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Lclient!vm;")
	private Class380 aClass380_16;

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "Lclient!lja;")
	private final Class159_Sub2 aClass159_Sub2_3;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_41;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	public final int anInt10708;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "[I")
	private final int[] anIntArray570;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	public final int anInt10699;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	public final int anInt10704;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	public final int anInt10707;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "F")
	public final float aFloat208;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!uka;")
	private final Class86_Sub2 aClass86_Sub2_2;

	static {
		for (@Pc(93) int local93 = 0; local93 < 26; local93++) {
			aCharArray13[local93] = (char) (local93 + 65);
		}
		for (@Pc(107) int local107 = 26; local107 < 52; local107++) {
			aCharArray13[local107] = (char) (local107 + 97 - 26);
		}
		for (@Pc(123) int local123 = 52; local123 < 62; local123++) {
			aCharArray13[local123] = (char) (local123 + 48 - 52);
		}
		aCharArray13[62] = '+';
		aCharArray13[63] = '/';
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!lja;IIIII)V")
	public Class14_Sub52(@OriginalArg(0) Class159_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass159_Sub2_3 = arg0;
		this.aClass144_Sub3_41 = this.aClass159_Sub2_3.aClass144_Sub3_22;
		this.anInt10708 = arg5;
		this.anIntArray570 = new int[this.aClass159_Sub2_3.anInt9504 * this.aClass159_Sub2_3.anInt9506];
		this.anInt10699 = arg3;
		this.anInt10704 = arg1;
		this.anInt10707 = arg4;
		this.aFloat208 = (float) arg2;
		this.aClass86_Sub2_2 = new Class86_Sub2(this.aClass144_Sub3_41, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIZ)V")
	public void method9138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray570[this.aClass159_Sub2_3.anInt9504 * arg2 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(FIIIB)V")
	public void method9139(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(49) int local49;
		@Pc(118) int local118;
		if (this.anInt10704 != -1) {
			@Pc(13) Class69 local13 = this.aClass144_Sub3_41.anInterface4_12.method8975(this.anInt10704);
			local18 = local13.aByte22 & 0xFF;
			@Pc(72) int local72;
			if (local18 != 0 && local13.aByte19 != 4) {
				if (arg1 < 0) {
					local49 = 0;
				} else if (arg1 <= 127) {
					local49 = arg1 * 131586;
				} else {
					local49 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local49;
				} else {
					local72 = 256 - local18;
					arg3 = ((arg3 & 0xFF00) * local72 + local18 * (local49 & 0xFF00) & 0xFF0000) + ((local49 & 0xFF00FF) * local18 + local72 * (arg3 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local49 = local13.aByte20 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				local118 = (arg3 >> 16 & 0xFF) * local49;
				if (local118 > 65535) {
					local118 = 65535;
				}
				local72 = local49 * (arg3 >> 8 & 0xFF);
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(144) int local144 = (arg3 & 0xFF) * local49;
				if (local144 > 65535) {
					local144 = 65535;
				}
				arg3 = (local118 << 8 & 0xFF00FA) - (-(local72 & 0xFF00) - (local144 >> 8));
			}
		}
		if (arg0 != 1.0F) {
			local18 = arg3 >> 16 & 0xFF;
			local49 = arg3 >> 8 & 0xFF;
			local118 = arg3 & 0xFF;
			local18 = (int) ((float) local18 * arg0);
			local49 = (int) ((float) local49 * arg0);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local118 = (int) ((float) local118 * arg0);
			if (local49 < 0) {
				local49 = 0;
			} else if (local49 > 255) {
				local49 = 255;
			}
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 255) {
				local118 = 255;
			}
			arg3 = local118 | local49 << 8 | local18 << 16;
		}
		this.aStream7.e(arg2 * 4);
		this.aStream7.f((byte) (arg3 >> 16));
		this.aStream7.f((byte) (arg3 >> 8));
		this.aStream7.f((byte) arg3);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	public void method9140(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass144_Sub3_41.aNativeHeap6.a(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[IB)V")
	public void method9142(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class14_Sub21_Sub1 local11 = this.aClass144_Sub3_41.aClass14_Sub21_Sub1_2;
		local11.anInt8936 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass144_Sub3_41.aBoolean557) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass159_Sub2_3.aShortArrayArray2[local26];
				local37 = this.anIntArray570[local26];
				if (local37 != 0 && local32 != null) {
					local48 = 0;
					local50 = 0;
					while (local32.length > local50) {
						if ((local37 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local11.method7751(local32[local50++] & 0xFFFF);
							local7++;
							local11.method7751(local32[local50++] & 0xFFFF);
							local7++;
							local7++;
							local11.method7751(local32[local50++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass159_Sub2_3.aShortArrayArray2[local26];
				local37 = this.anIntArray570[local26];
				if (local37 != 0 && local32 != null) {
					local48 = 0;
					local50 = 0;
					while (local32.length > local50) {
						if ((0x1 << local48++ & local37) == 0) {
							local50 += 3;
						} else {
							local11.method7722(local32[local50++] & 0xFFFF);
							local7++;
							local7++;
							local11.method7722(local32[local50++] & 0xFFFF);
							local7++;
							local11.method7722(local32[local50++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass86_Sub2_2.method8717(local11.anInt8936, local11.aByteArray99);
		this.aClass144_Sub3_41.method6978(this.aClass159_Sub2_3.aClass380_5, this.aClass159_Sub2_3.aClass380_8, this.aClass159_Sub2_3.aClass380_6, this.aClass380_16);
		this.aClass144_Sub3_41.method7042((this.aClass159_Sub2_3.anInt6008 & 0x7) != 0, (this.aClass159_Sub2_3.anInt6008 & 0x8) != 0, this.anInt10704);
		if (this.aClass144_Sub3_41.aBoolean559) {
			this.aClass144_Sub3_41.EA(Integer.MAX_VALUE, this.anInt10699, this.anInt10707, this.anInt10708);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat208, 1.0F / this.aFloat208, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass144_Sub3_41.method6978(this.aClass159_Sub2_3.aClass380_5, this.aClass159_Sub2_3.aClass380_8, this.aClass159_Sub2_3.aClass380_6, this.aClass380_16);
		this.aClass144_Sub3_41.method7029(this.aClass86_Sub2_2, local7, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)V")
	public void method9143(@OriginalArg(0) int arg0) {
		this.aStream7.b();
		@Pc(18) Interface12 local18 = this.aClass144_Sub3_41.method6995(4, this.aNativeHeapBuffer8, arg0 * 4);
		this.aClass380_16 = new Class380(local18, 5121, 4, 0);
		this.aStream7 = null;
		this.aNativeHeapBuffer8 = null;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
	public void method9145(@OriginalArg(1) int arg0) {
		this.aStream7.e(arg0 * 4 + 3);
		this.aStream7.f(-1);
	}
}
