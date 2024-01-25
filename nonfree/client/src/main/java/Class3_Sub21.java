import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!eea", name = "H", descriptor = "[I")
	public static final int[] anIntArray191 = new int[256];

	@OriginalMember(owner = "client!eea", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "Lclient!rca;")
	private Class280 aClass280_1;

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "Lclient!oj;")
	private final Class139_Sub2 aClass139_Sub2_1;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
	public final int anInt2631;

	@OriginalMember(owner = "client!eea", name = "C", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!eea", name = "A", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_13;

	@OriginalMember(owner = "client!eea", name = "z", descriptor = "F")
	public final float aFloat40;

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "[I")
	private final int[] anIntArray188;

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
	public final int anInt2632;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!eea", name = "G", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_1;

	static {
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			@Pc(23) int local23 = local20;
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				if ((local23 & 0x1) == 1) {
					local23 = local23 >>> 1 ^ 0xEDB88320;
				} else {
					local23 >>>= 0x1;
				}
			}
			anIntArray191[local20] = local23;
		}
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!oj;IIIII)V")
	public Class3_Sub21(@OriginalArg(0) Class139_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass139_Sub2_1 = arg0;
		this.anInt2631 = arg1;
		this.anInt2634 = arg5;
		this.aClass43_Sub3_13 = this.aClass139_Sub2_1.aClass43_Sub3_27;
		this.aFloat40 = arg2;
		this.anIntArray188 = new int[this.aClass139_Sub2_1.anInt8179 * this.aClass139_Sub2_1.anInt8180];
		this.anInt2632 = arg4;
		this.anInt2625 = arg3;
		this.aClass28_Sub1_1 = new Class28_Sub1(this.aClass43_Sub3_13, 5123, null, 1);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
	public void method2366(@OriginalArg(0) int arg0) {
		this.aStream4.b(arg0 * 4 + 3);
		this.aStream4.a(-1);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIII)V")
	public void method2367(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray188[arg0 + arg2 * this.aClass139_Sub2_1.anInt8179] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)V")
	public void method2369(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass43_Sub3_13.aNativeHeap5.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(IB)V")
	public void method2370(@OriginalArg(0) int arg0) {
		this.aStream4.a();
		@Pc(18) Interface7 local18 = this.aClass43_Sub3_13.method7302(arg0 * 4, 4, this.aNativeHeapBuffer4);
		this.aClass280_1 = new Class280(local18, 5121, 4, 0);
		this.aStream4 = null;
		this.aNativeHeapBuffer4 = null;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIFII)V")
	public void method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(27) int local27;
		@Pc(43) int local43;
		if (this.anInt2631 != -1) {
			@Pc(22) Class224 local22 = this.aClass43_Sub3_13.anInterface8_12.method6560(this.anInt2631);
			local27 = local22.aByte73 & 0xFF;
			@Pc(66) int local66;
			if (local27 != 0 && local22.aByte69 != 4) {
				if (arg1 < 0) {
					local43 = 0;
				} else if (arg1 > 127) {
					local43 = 16777215;
				} else {
					local43 = arg1 * 131586;
				}
				if (local27 == 256) {
					arg3 = local43;
				} else {
					local66 = 256 - local27;
					arg3 = (local27 * (local43 & 0xFF00) + local66 * (arg3 & 0xFF00) & 0xFF0000) + ((local43 & 0xFF00FF) * local27 + local66 * (arg3 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local43 = local22.aByte71 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(119) int local119 = local43 * (arg3 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local66 = (arg3 >> 8 & 0xFF) * local43;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(147) int local147 = local43 * (arg3 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				arg3 = (local147 >> 8) + (local119 << 8 & 0xFF00D1) + (local66 & 0xFF00);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(182) int local182 = arg3 >> 16 & 0xFF;
			local27 = arg3 >> 8 & 0xFF;
			local182 = (int) ((float) local182 * arg2);
			local43 = arg3 & 0xFF;
			if (local182 < 0) {
				local182 = 0;
			} else if (local182 > 255) {
				local182 = 255;
			}
			local27 = (int) ((float) local27 * arg2);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			local43 = (int) ((float) local43 * arg2);
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg3 = local27 << 8 | local182 << 16 | local43;
		}
		this.aStream4.b(arg0 * 4);
		this.aStream4.a((byte) (arg3 >> 16));
		this.aStream4.a((byte) (arg3 >> 8));
		this.aStream4.a((byte) arg3);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([IIB)V")
	public void method2373(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(19) Class3_Sub11_Sub2 local19 = this.aClass43_Sub3_13.aClass3_Sub11_Sub2_3;
		local19.anInt3520 = 0;
		@Pc(40) short[] local40;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(28) int local28;
		@Pc(54) int local54;
		@Pc(56) int local56;
		if (this.aClass43_Sub3_13.aBoolean671) {
			for (local28 = 0; local28 < arg1; local28++) {
				local34 = arg0[local28];
				local45 = this.anIntArray188[local34];
				local40 = this.aClass139_Sub2_1.aShortArrayArray66[local34];
				if (local45 != 0 && local40 != null) {
					local54 = 0;
					local56 = 0;
					while (local40.length > local56) {
						if ((0x1 << local54++ & local45) == 0) {
							local56 += 3;
						} else {
							local7++;
							local19.method3131(local40[local56++] & 0xFFFF);
							local7++;
							local19.method3131(local40[local56++] & 0xFFFF);
							local7++;
							local19.method3131(local40[local56++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg1; local28++) {
				local34 = arg0[local28];
				local40 = this.aClass139_Sub2_1.aShortArrayArray66[local34];
				local45 = this.anIntArray188[local34];
				if (local45 != 0 && local40 != null) {
					local54 = 0;
					local56 = 0;
					while (local56 < local40.length) {
						if ((local45 & 0x1 << local54++) == 0) {
							local56 += 3;
						} else {
							local19.method3075(local40[local56++] & 0xFFFF);
							local7++;
							local19.method3075(local40[local56++] & 0xFFFF);
							local7++;
							local19.method3075(local40[local56++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass28_Sub1_1.method6870(local19.aByteArray36, local19.anInt3520);
		this.aClass43_Sub3_13.method7303(this.aClass139_Sub2_1.aClass280_12, this.aClass139_Sub2_1.aClass280_10, this.aClass280_1, this.aClass139_Sub2_1.aClass280_11);
		this.aClass43_Sub3_13.method7221((this.aClass139_Sub2_1.anInt6571 & 0x7) != 0, this.anInt2631, (this.aClass139_Sub2_1.anInt6571 & 0x8) != 0);
		if (this.aClass43_Sub3_13.aBoolean688) {
			this.aClass43_Sub3_13.YA(Integer.MAX_VALUE, this.anInt2625, this.anInt2632, this.anInt2634);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat40, 1.0F / this.aFloat40, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass43_Sub3_13.method7303(this.aClass139_Sub2_1.aClass280_12, this.aClass139_Sub2_1.aClass280_10, this.aClass280_1, this.aClass139_Sub2_1.aClass280_11);
		this.aClass43_Sub3_13.method7224(this.aClass28_Sub1_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
