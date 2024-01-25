import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "Lclient!db;")
	private Class47 aClass47_7;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer2;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "Lclient!hk;")
	private final Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
	public final int anInt5306;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
	public final int anInt5305;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_31;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "F")
	public final float aFloat76;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	public final int anInt5297;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "[I")
	private final int[] anIntArray452;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
	public final int anInt5302;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Lclient!vo;")
	private final Class170_Sub2 aClass170_Sub2_1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!hk;IIIII)V")
	public Class2_Sub31(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass22_Sub2_1 = arg0;
		this.anInt5306 = arg1;
		this.anInt5305 = arg4;
		this.aClass75_Sub2_31 = this.aClass22_Sub2_1.aClass75_Sub2_13;
		this.aFloat76 = arg2;
		this.anInt5297 = arg5;
		this.anIntArray452 = new int[this.aClass22_Sub2_1.anInt2816 * this.aClass22_Sub2_1.anInt2819];
		this.anInt5302 = arg3;
		this.aClass170_Sub2_1 = new Class170_Sub2(this.aClass75_Sub2_31, 5123, null, 1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBII)V")
	public void method4219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray452[this.aClass22_Sub2_1.anInt2819 * arg2 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFIIZ)V")
	public void method4220(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23;
		@Pc(36) int local36;
		if (this.anInt5306 != -1) {
			@Pc(18) Class257 local18 = this.aClass75_Sub2_31.anInterface7_8.method1170(this.anInt5306);
			local23 = local18.aByte97 & 0xFF;
			@Pc(66) int local66;
			if (local23 != 0 && local18.aByte96 != 4) {
				if (arg3 < 0) {
					local36 = 0;
				} else if (arg3 <= 127) {
					local36 = arg3 * 131586;
				} else {
					local36 = 16777215;
				}
				if (local23 == 256) {
					arg2 = local36;
				} else {
					local66 = 256 - local23;
					arg2 = ((local36 & 0xFF00) * local23 + local66 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local66 + local23 * (local36 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local36 = local18.aByte93 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(115) int local115 = (arg2 >> 16 & 0xFF) * local36;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local66 = local36 * (arg2 >> 8 & 0xFF);
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(143) int local143 = (arg2 & 0xFF) * local36;
				if (local143 > 65535) {
					local143 = 65535;
				}
				arg2 = (local143 >> 8) + (local66 & 0xFF00) + (local115 << 8 & 0xFF00EA);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(172) int local172 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local36 = arg2 & 0xFF;
			local172 = (int) ((float) local172 * arg1);
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			local23 = (int) ((float) local23 * arg1);
			local36 = (int) ((float) local36 * arg1);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg2 = local36 | local172 << 16 | local23 << 8;
		}
		this.aNativeStream1.a(arg0 * 4);
		this.aNativeStream1.b((byte) (arg2 >> 16));
		this.aNativeStream1.b((byte) (arg2 >> 8));
		this.aNativeStream1.b((byte) arg2);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IB)V")
	public void method4222(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b();
		@Pc(22) Interface12 local22 = this.aClass75_Sub2_31.method3806(arg0 * 4, this.aNativeBuffer2, 4);
		this.aClass47_7 = new Class47(local22, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer2 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI[I)V")
	public void method4224(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(19) Class2_Sub17_Sub2 local19 = this.aClass75_Sub2_31.aClass2_Sub17_Sub2_1;
		local19.anInt7523 = 0;
		@Pc(40) short[] local40;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(28) int local28;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass75_Sub2_31.aBoolean349) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass22_Sub2_1.aShortArrayArray4[local34];
				local45 = this.anIntArray452[local34];
				if (local45 != 0 && local40 != null) {
					local51 = 0;
					local53 = 0;
					while (local40.length > local53) {
						if ((local45 & 0x1 << local51++) == 0) {
							local53 += 3;
						} else {
							local19.method6130(local40[local53++] & 0xFFFF);
							local7++;
							local7++;
							local19.method6130(local40[local53++] & 0xFFFF);
							local7++;
							local19.method6130(local40[local53++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass22_Sub2_1.aShortArrayArray4[local34];
				local45 = this.anIntArray452[local34];
				if (local45 != 0 && local40 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local40.length) {
						if ((local45 & 0x1 << local51++) == 0) {
							local53 += 3;
						} else {
							local19.method6160(local40[local53++] & 0xFFFF);
							local7++;
							local7++;
							local19.method6160(local40[local53++] & 0xFFFF);
							local7++;
							local19.method6160(local40[local53++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass170_Sub2_1.method5887(local19.anInt7523, local19.aByteArray94);
		this.aClass75_Sub2_31.method3852(this.aClass47_7, this.aClass22_Sub2_1.aClass47_4, this.aClass22_Sub2_1.aClass47_2, this.aClass22_Sub2_1.aClass47_3);
		this.aClass75_Sub2_31.method3823((this.aClass22_Sub2_1.anInt2829 & 0x8) != 0, this.anInt5306, (this.aClass22_Sub2_1.anInt2829 & 0x7) != 0);
		if (this.aClass75_Sub2_31.aBoolean353) {
			this.aClass75_Sub2_31.a(Integer.MAX_VALUE, this.anInt5302, this.anInt5305, this.anInt5297);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat76, 1.0F / this.aFloat76, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass75_Sub2_31.method3852(this.aClass47_7, this.aClass22_Sub2_1.aClass47_4, this.aClass22_Sub2_1.aClass47_2, this.aClass22_Sub2_1.aClass47_3);
		this.aClass75_Sub2_31.method3841(this.aClass170_Sub2_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
	public void method4226(@OriginalArg(0) int arg0) {
		this.aNativeBuffer2 = this.aClass75_Sub2_31.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer2);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
	public void method4227(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}
}
