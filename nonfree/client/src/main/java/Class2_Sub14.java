import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "Lclient!gv;")
	private Class133 aClass133_4;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "Lclient!vfa;")
	private final Class151_Sub2 aClass151_Sub2_1;

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
	public final int anInt1915;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
	public final int anInt1905;

	@OriginalMember(owner = "client!eca", name = "x", descriptor = "F")
	public final float aFloat49;

	@OriginalMember(owner = "client!eca", name = "z", descriptor = "[I")
	private final int[] anIntArray168;

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
	public final int anInt1908;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
	public final int anInt1910;

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_11;

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "Lclient!oj;")
	private final Class79_Sub2 aClass79_Sub2_1;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!vfa;IIIII)V")
	public Class2_Sub14(@OriginalArg(0) Class151_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass151_Sub2_1 = arg0;
		this.anInt1915 = arg3;
		this.anInt1905 = arg5;
		this.aFloat49 = arg2;
		this.anIntArray168 = new int[this.aClass151_Sub2_1.anInt9572 * this.aClass151_Sub2_1.anInt9574];
		this.anInt1908 = arg4;
		this.anInt1910 = arg1;
		this.aClass162_Sub3_11 = this.aClass151_Sub2_1.aClass162_Sub3_41;
		this.aClass79_Sub2_1 = new Class79_Sub2(this.aClass162_Sub3_11, 5123, null, 1);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II[I)V")
	public void method1603(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(15) int local15 = 0;
		@Pc(19) Class2_Sub7_Sub1 local19 = this.aClass162_Sub3_11.aClass2_Sub7_Sub1_3;
		local19.anInt5186 = 0;
		@Pc(40) short[] local40;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(28) int local28;
		@Pc(54) int local54;
		@Pc(56) int local56;
		if (this.aClass162_Sub3_11.aBoolean720) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass151_Sub2_1.aShortArrayArray14[local34];
				local45 = this.anIntArray168[local34];
				if (local45 != 0 && local40 != null) {
					local54 = 0;
					local56 = 0;
					while (local56 < local40.length) {
						if ((local45 & 0x1 << local54++) == 0) {
							local56 += 3;
						} else {
							local19.method4511(local40[local56++] & 0xFFFF);
							local15++;
							local19.method4511(local40[local56++] & 0xFFFF);
							local15++;
							local19.method4511(local40[local56++] & 0xFFFF);
							local15++;
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass151_Sub2_1.aShortArrayArray14[local34];
				local45 = this.anIntArray168[local34];
				if (local45 != 0 && local40 != null) {
					local54 = 0;
					local56 = 0;
					while (local56 < local40.length) {
						if ((local45 & 0x1 << local54++) == 0) {
							local56 += 3;
						} else {
							local19.method4469(local40[local56++] & 0xFFFF);
							local15++;
							local19.method4469(local40[local56++] & 0xFFFF);
							local15++;
							local15++;
							local19.method4469(local40[local56++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local15 <= 0) {
			return;
		}
		this.aClass79_Sub2_1.method5344(local19.anInt5186, local19.aByteArray52);
		this.aClass162_Sub3_11.method6916(this.aClass151_Sub2_1.aClass133_13, this.aClass151_Sub2_1.aClass133_15, this.aClass133_4, this.aClass151_Sub2_1.aClass133_14);
		this.aClass162_Sub3_11.method6924((this.aClass151_Sub2_1.anInt9159 & 0x7) != 0, (this.aClass151_Sub2_1.anInt9159 & 0x8) != 0, this.anInt1910);
		if (this.aClass162_Sub3_11.aBoolean723) {
			this.aClass162_Sub3_11.YA(Integer.MAX_VALUE, this.anInt1915, this.anInt1908, this.anInt1905);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat49, 1.0F / this.aFloat49, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass162_Sub3_11.method6916(this.aClass151_Sub2_1.aClass133_13, this.aClass151_Sub2_1.aClass133_15, this.aClass133_4, this.aClass151_Sub2_1.aClass133_14);
		this.aClass162_Sub3_11.method6904(0, local15, this.aClass79_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IFIII)V")
	public void method1604(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(36) int local36;
		if (this.anInt1910 != -1) {
			@Pc(18) Class291 local18 = this.aClass162_Sub3_11.anInterface9_10.method1074(this.anInt1910);
			local23 = local18.aByte98 & 0xFF;
			@Pc(65) int local65;
			if (local23 != 0 && local18.aByte96 != 4) {
				if (arg1 < 0) {
					local36 = 0;
				} else if (arg1 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg1 * 131586;
				}
				if (local23 == 256) {
					arg2 = local36;
				} else {
					local65 = 256 - local23;
					arg2 = (local23 * (local36 & 0xFF00) + local65 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local65 + (local36 & 0xFF00FF) * local23 & 0xFF00FF00) >> 8;
				}
			}
			local36 = local18.aByte101 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(115) int local115 = local36 * (arg2 >> 16 & 0xFF);
				if (local115 > 65535) {
					local115 = 65535;
				}
				local65 = local36 * (arg2 >> 8 & 0xFF);
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(141) int local141 = local36 * (arg2 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg2 = (local141 >> 8) + ((local115 & 0xB300FF00) << 8) + (local65 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(180) int local180 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local36 = arg2 & 0xFF;
			local180 = (int) ((float) local180 * arg0);
			if (local180 < 0) {
				local180 = 0;
			} else if (local180 > 255) {
				local180 = 255;
			}
			local23 = (int) ((float) local23 * arg0);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local36 = (int) ((float) local36 * arg0);
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg2 = local23 << 8 | local180 << 16 | local36;
		}
		this.aStream1.a(arg3 * 4);
		this.aStream1.d((byte) (arg2 >> 16));
		this.aStream1.d((byte) (arg2 >> 8));
		this.aStream1.d((byte) arg2);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V")
	public void method1605(@OriginalArg(0) int arg0) {
		this.aStream1.c();
		@Pc(18) Interface10 local18 = this.aClass162_Sub3_11.method6909(arg0 * 4, 4, this.aNativeHeapBuffer1);
		this.aClass133_4 = new Class133(local18, 5121, 4, 0);
		this.aStream1 = null;
		this.aNativeHeapBuffer1 = null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIBI)V")
	public void method1607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray168[arg2 + this.aClass151_Sub2_1.anInt9572 * arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V")
	public void method1609(@OriginalArg(1) int arg0) {
		this.aStream1.a(arg0 * 4 + 3);
		this.aStream1.d(-1);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
	public void method1610(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass162_Sub3_11.aNativeHeap6.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1);
	}
}
