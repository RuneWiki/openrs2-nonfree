import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "[I")
	public static final int[] anIntArray146 = new int[16384];

	@OriginalMember(owner = "client!dr", name = "J", descriptor = "[I")
	public static final int[] anIntArray147 = new int[16384];

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Lclient!ss;")
	private Class313 aClass313_8;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "Lclient!rq;")
	private final Class91_Sub3 aClass91_Sub3_1;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
	public final int anInt2189;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
	public final int anInt2198;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_11;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
	public final int anInt2193;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
	public final int anInt2187;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "[I")
	private final int[] anIntArray145;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "F")
	public final float aFloat27;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Lclient!cb;")
	private final Class41_Sub1 aClass41_Sub1_1;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			anIntArray147[local17] = (int) (Math.sin((double) local17 * local15) * 16384.0D);
			anIntArray146[local17] = (int) (Math.cos(local15 * (double) local17) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!rq;IIIII)V")
	public Class3_Sub13(@OriginalArg(0) Class91_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass91_Sub3_1 = arg0;
		this.anInt2189 = arg3;
		this.anInt2198 = arg5;
		this.aClass82_Sub1_11 = this.aClass91_Sub3_1.aClass82_Sub1_36;
		this.anInt2193 = arg4;
		this.anInt2187 = arg1;
		this.anIntArray145 = new int[this.aClass91_Sub3_1.anInt8983 * this.aClass91_Sub3_1.anInt8985];
		this.aFloat27 = (float) arg2;
		this.aClass41_Sub1_1 = new Class41_Sub1(this.aClass82_Sub1_11, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI[I)V")
	public void method1807(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub9_Sub1 local11 = this.aClass82_Sub1_11.aClass3_Sub9_Sub1_2;
		local11.anInt6453 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass82_Sub1_11.aBoolean174) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local37 = this.anIntArray145[local26];
				local32 = this.aClass91_Sub3_1.aShortArrayArray17[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local32.length) {
						if ((local37 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local7++;
							local11.method5620(local32[local45++] & 0xFFFF);
							local11.method5620(local32[local45++] & 0xFFFF);
							local7++;
							local11.method5620(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass91_Sub3_1.aShortArrayArray17[local26];
				local37 = this.anIntArray145[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((local37 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local11.method5627(local32[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method5627(local32[local45++] & 0xFFFF);
							local11.method5627(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass41_Sub1_1.method5960(local11.anInt6453, local11.aByteArray51);
		this.aClass82_Sub1_11.method2073(this.aClass313_8, this.aClass91_Sub3_1.aClass313_13, this.aClass91_Sub3_1.aClass313_14, this.aClass91_Sub3_1.aClass313_15);
		this.aClass82_Sub1_11.method2027(this.anInt2187, (this.aClass91_Sub3_1.anInt8447 & 0x7) != 0, (this.aClass91_Sub3_1.anInt8447 & 0x8) != 0);
		if (this.aClass82_Sub1_11.aBoolean187) {
			this.aClass82_Sub1_11.EA(Integer.MAX_VALUE, this.anInt2189, this.anInt2193, this.anInt2198);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat27, 1.0F / this.aFloat27, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass82_Sub1_11.method2073(this.aClass313_8, this.aClass91_Sub3_1.aClass313_13, this.aClass91_Sub3_1.aClass313_14, this.aClass91_Sub3_1.aClass313_15);
		this.aClass82_Sub1_11.method2036(0, local7, this.aClass41_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
	public void method1808(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass82_Sub1_11.aNativeHeap1.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer3);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	public void method1811(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.b(-1);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIBI)V")
	public void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray145[this.aClass91_Sub3_1.anInt8983 * arg2 + arg0] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V")
	public void method1813(@OriginalArg(0) int arg0) {
		this.aStream1.b();
		@Pc(18) Interface3 local18 = this.aClass82_Sub1_11.method2019(4, this.aNativeHeapBuffer3, arg0 * 4);
		this.aClass313_8 = new Class313(local18, 5121, 4, 0);
		this.aNativeHeapBuffer3 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIFI)V")
	public void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(43) int local43;
		if (this.anInt2187 != -1) {
			@Pc(18) Class355 local18 = this.aClass82_Sub1_11.anInterface5_9.method4129(this.anInt2187);
			local23 = local18.aByte121 & 0xFF;
			@Pc(67) int local67;
			if (local23 != 0 && local18.aByte119 != 4) {
				if (arg0 < 0) {
					local43 = 0;
				} else if (arg0 <= 127) {
					local43 = arg0 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local23 == 256) {
					arg3 = local43;
				} else {
					local67 = 256 - local23;
					arg3 = (local67 * (arg3 & 0xFF00FF) + local23 * (local43 & 0xFF00FF) & 0xFF00FF00) + ((local43 & 0xFF00) * local23 + (local67 * (arg3 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local43 = local18.aByte124 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(118) int local118 = local43 * (arg3 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local67 = local43 * (arg3 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(142) int local142 = (arg3 & 0xFF) * local43;
				if (local142 > 65535) {
					local142 = 65535;
				}
				arg3 = (local67 & 0xFF00) + ((local118 << 8 & 0xFF008E) + (local142 >> 8));
			}
		}
		if (arg2 != 1.0F) {
			@Pc(174) int local174 = arg3 >> 16 & 0xFF;
			local23 = arg3 >> 8 & 0xFF;
			local43 = arg3 & 0xFF;
			local174 = (int) ((float) local174 * arg2);
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local23 = (int) ((float) local23 * arg2);
			local43 = (int) ((float) local43 * arg2);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg3 = local43 | local174 << 16 | local23 << 8;
		}
		this.aStream1.e(arg1 * 4);
		this.aStream1.b((byte) (arg3 >> 16));
		this.aStream1.b((byte) (arg3 >> 8));
		this.aStream1.b((byte) arg3);
	}
}
