import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "Lclient!pc;")
	private Class274 aClass274_5;

	@OriginalMember(owner = "client!dia", name = "B", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer2;

	@OriginalMember(owner = "client!dia", name = "G", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!dia", name = "C", descriptor = "Lclient!al;")
	private final Class18_Sub1 aClass18_Sub1_1;

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
	public final int anInt1909;

	@OriginalMember(owner = "client!dia", name = "w", descriptor = "[I")
	private final int[] anIntArray99;

	@OriginalMember(owner = "client!dia", name = "s", descriptor = "I")
	public final int anInt1913;

	@OriginalMember(owner = "client!dia", name = "F", descriptor = "F")
	public final float aFloat29;

	@OriginalMember(owner = "client!dia", name = "y", descriptor = "I")
	public final int anInt1917;

	@OriginalMember(owner = "client!dia", name = "E", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_10;

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
	public final int anInt1912;

	@OriginalMember(owner = "client!dia", name = "x", descriptor = "Lclient!kaa;")
	private final Class55_Sub2 aClass55_Sub2_1;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!al;IIIII)V")
	public Class2_Sub21(@OriginalArg(0) Class18_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass18_Sub1_1 = arg0;
		this.anInt1909 = arg4;
		this.anIntArray99 = new int[this.aClass18_Sub1_1.anInt9742 * this.aClass18_Sub1_1.anInt9741];
		this.anInt1913 = arg1;
		this.aFloat29 = (float) arg2;
		this.anInt1917 = arg3;
		this.aClass101_Sub2_10 = this.aClass18_Sub1_1.aClass101_Sub2_1;
		this.anInt1912 = arg5;
		this.aClass55_Sub2_1 = new Class55_Sub2(this.aClass101_Sub2_10, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIFII)V")
	public void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(42) int local42;
		if (this.anInt1913 != -1) {
			@Pc(14) Class136 local14 = this.aClass101_Sub2_10.anInterface3_12.method1941(this.anInt1913);
			local19 = local14.aByte67 & 0xFF;
			@Pc(66) int local66;
			if (local19 != 0 && local14.aByte62 != 4) {
				if (arg0 < 0) {
					local42 = 0;
				} else if (arg0 <= 127) {
					local42 = arg0 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local19 == 256) {
					arg1 = local42;
				} else {
					local66 = 256 - local19;
					arg1 = ((arg1 & 0xFF00) * local66 + (local42 & 0xFF00) * local19 & 0xFF0000) + ((arg1 & 0xFF00FF) * local66 + (local42 & 0xFF00FF) * local19 & 0xFF00FF00) >> 8;
				}
			}
			local42 = local14.aByte66 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(112) int local112 = local42 * (arg1 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local66 = (arg1 >> 8 & 0xFF) * local42;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(140) int local140 = local42 * (arg1 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg1 = (local140 >> 8) + (local66 & 0xFF00) + ((local112 & 0xF00FF00) << 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(175) int local175 = arg1 >> 16 & 0xFF;
			local19 = arg1 >> 8 & 0xFF;
			local42 = arg1 & 0xFF;
			local175 = (int) ((float) local175 * arg2);
			local19 = (int) ((float) local19 * arg2);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local42 = (int) ((float) local42 * arg2);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			arg1 = local19 << 8 | local175 << 16 | local42;
		}
		this.aStream2.e(arg3 * 4);
		this.aStream2.b((byte) (arg1 >> 16));
		this.aStream2.b((byte) (arg1 >> 8));
		this.aStream2.b((byte) arg1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII)V")
	public void method1876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray99[this.aClass18_Sub1_1.anInt9741 * arg1 + arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([IIZ)V")
	public void method1877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) Class2_Sub8_Sub1 local17 = this.aClass101_Sub2_10.aClass2_Sub8_Sub1_2;
		local17.anInt5725 = 0;
		@Pc(43) short[] local43;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(26) int local26;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (this.aClass101_Sub2_10.aBoolean470) {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local37 = this.anIntArray99[local32];
				local43 = this.aClass18_Sub1_1.aShortArrayArray1[local32];
				if (local37 != 0 && local43 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local43.length) {
						if ((0x1 << local52++ & local37) == 0) {
							local54 += 3;
						} else {
							local7++;
							local17.method5192(local43[local54++] & 0xFFFF);
							local7++;
							local17.method5192(local43[local54++] & 0xFFFF);
							local7++;
							local17.method5192(local43[local54++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local37 = this.anIntArray99[local32];
				local43 = this.aClass18_Sub1_1.aShortArrayArray1[local32];
				if (local37 != 0 && local43 != null) {
					local52 = 0;
					local54 = 0;
					while (local43.length > local54) {
						if ((local37 & 0x1 << local52++) == 0) {
							local54 += 3;
						} else {
							local17.method5228(local43[local54++] & 0xFFFF);
							local7++;
							local7++;
							local17.method5228(local43[local54++] & 0xFFFF);
							local17.method5228(local43[local54++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass55_Sub2_1.method6705(local17.lb, local17.anInt5725);
		this.aClass101_Sub2_10.method5650(this.aClass18_Sub1_1.aClass274_1, this.aClass18_Sub1_1.aClass274_4, this.aClass274_5, this.aClass18_Sub1_1.aClass274_2);
		this.aClass101_Sub2_10.method5684((this.aClass18_Sub1_1.anInt428 & 0x8) != 0, (this.aClass18_Sub1_1.anInt428 & 0x7) != 0, this.anInt1913);
		if (this.aClass101_Sub2_10.aBoolean459) {
			this.aClass101_Sub2_10.EA(Integer.MAX_VALUE, this.anInt1917, this.anInt1909, this.anInt1912);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat29, 1.0F / this.aFloat29, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass101_Sub2_10.method5650(this.aClass18_Sub1_1.aClass274_1, this.aClass18_Sub1_1.aClass274_4, this.aClass274_5, this.aClass18_Sub1_1.aClass274_2);
		this.aClass101_Sub2_10.method5645(local7, 0, this.aClass55_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)V")
	public void method1878(@OriginalArg(1) int arg0) {
		this.aStream2.e(arg0 * 4 + 3);
		this.aStream2.b(-1);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)V")
	public void method1880(@OriginalArg(0) int arg0) {
		this.aStream2.a();
		@Pc(22) Interface2 local22 = this.aClass101_Sub2_10.method5676(this.aNativeHeapBuffer2, 4, arg0 * 4);
		this.aClass274_5 = new Class274(local22, 5121, 4, 0);
		this.aStream2 = null;
		this.aNativeHeapBuffer2 = null;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(II)V")
	public void method1881(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer2 = this.aClass101_Sub2_10.aNativeHeap5.a(arg0 * 4, true);
		this.aStream2 = new Stream(this.aNativeHeapBuffer2);
	}
}
