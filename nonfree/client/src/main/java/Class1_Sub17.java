import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "Lclient!ln;")
	private Class120 aClass120_5;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Lclient!dl;")
	private final Class41_Sub1 aClass41_Sub1_1;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
	private final int anInt2541;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
	private final int anInt2539;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "F")
	private final float aFloat64;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_17;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
	private final int anInt2540;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "[I")
	private final int[] anIntArray305;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Lclient!io;")
	private final Class47_Sub2 aClass47_Sub2_1;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!dl;IIII)V")
	public Class1_Sub17(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass41_Sub1_1 = arg0;
		this.anInt2541 = arg4;
		this.anInt2539 = arg1;
		this.aFloat64 = arg2;
		this.aClass2_Sub1_17 = this.aClass41_Sub1_1.aClass2_Sub1_9;
		this.anInt2540 = arg3;
		this.anIntArray305 = new int[this.aClass41_Sub1_1.anInt6179 * this.aClass41_Sub1_1.anInt6185];
		this.aClass47_Sub2_1 = new Class47_Sub2(this.aClass2_Sub1_17, 5123, null, 1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[II)V")
	public void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub7 local11 = Static65.aClass1_Sub7_3;
		local11.anInt3368 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(20) int local20;
		@Pc(49) int local49;
		@Pc(51) int local51;
		if (this.aClass2_Sub1_17.aBoolean204) {
			for (local20 = 0; local20 < arg0; local20++) {
				local31 = arg1[local20];
				local42 = this.anIntArray305[local31];
				local37 = this.aClass41_Sub1_1.aShortArrayArray1[local31];
				if (local42 != 0 && local37 != null) {
					local49 = 0;
					local51 = 0;
					while (local51 < local37.length) {
						if ((local42 & 0x1 << local49++) == 0) {
							local51 += 3;
						} else {
							local11.method3128(local37[local51++] & 0xFFFF);
							local9++;
							local9++;
							local11.method3128(local37[local51++] & 0xFFFF);
							local9++;
							local11.method3128(local37[local51++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local31 = arg1[local20];
				local37 = this.aClass41_Sub1_1.aShortArrayArray1[local31];
				local42 = this.anIntArray305[local31];
				if (local42 != 0 && local37 != null) {
					local49 = 0;
					local51 = 0;
					while (local37.length > local51) {
						if ((local42 & 0x1 << local49++) == 0) {
							local51 += 3;
						} else {
							local11.method3138(local37[local51++] & 0xFFFF);
							local9++;
							local11.method3138(local37[local51++] & 0xFFFF);
							local9++;
							local9++;
							local11.method3138(local37[local51++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local9 <= 0) {
			return;
		}
		@Pc(193) opengl local193 = this.aClass2_Sub1_17.anOpengl1;
		this.aClass2_Sub1_17.method2322(this.anInt2539, (this.aClass41_Sub1_1.anInt1390 & 0x7) != 0, (this.aClass41_Sub1_1.anInt1390 & 0x8) != 0);
		if (this.aClass2_Sub1_17.aBoolean208) {
			this.aClass2_Sub1_17.method3281(Integer.MAX_VALUE, this.anInt2540, this.anInt2541);
		}
		this.aClass47_Sub2_1.method4265(local11.aByteArray58, local11.anInt3368);
		local193.glMatrixMode(5890);
		local193.glPushMatrix();
		local193.glScalef(1.0F / this.aFloat64, 1.0F / this.aFloat64, 1.0F);
		local193.glMatrixMode(5888);
		this.aClass2_Sub1_17.method2369(this.aClass41_Sub1_1.aClass120_4, this.aClass41_Sub1_1.aClass120_1, this.aClass120_5, this.aClass41_Sub1_1.aClass120_2);
		this.aClass2_Sub1_17.method2371(this.aClass47_Sub2_1, 0, local9);
		local193.glMatrixMode(5890);
		local193.glPopMatrix();
		local193.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
	public void method2465(@OriginalArg(1) int arg0) {
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)V")
	public void method2466(@OriginalArg(0) int arg0) {
		this.aByteBuffer3.position(arg0 * 4);
		this.aByteBuffer3.flip();
		@Pc(18) Interface6 local18 = this.aClass2_Sub1_17.method2325(0, this.aByteBuffer3);
		this.aClass120_5 = new Class120(this.aClass2_Sub1_17, local18, 5121, 4, 0);
		this.aByteBuffer3 = null;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
	public void method2467(@OriginalArg(0) int arg0) {
		this.aByteBuffer3.position(arg0 * 4 + 3);
		this.aByteBuffer3.put((byte) -1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII)V")
	public void method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray305[arg0 * this.aClass41_Sub1_1.anInt6179 + arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZIFI)V")
	public void method2469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(37) int local37;
		if (this.anInt2539 != -1) {
			@Pc(13) Class215 local13 = this.aClass2_Sub1_17.anInterface7_5.method2788(this.anInt2539);
			local18 = local13.aByte70 & 0xFF;
			@Pc(56) int local56;
			if (local18 != 0 && local13.aByte67 != 4) {
				if (arg3 < 0) {
					local37 = 0;
				} else if (arg3 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg3 * 131586;
				}
				if (local18 == 256) {
					arg1 = local37;
				} else {
					local56 = 256 - local18;
					arg1 = (local56 * (arg1 & 0xFF00) + (local37 & 0xFF00) * local18 & 0xFF0000) + ((arg1 & 0xFF00FF) * local56 + local18 * (local37 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local37 = local13.aByte71 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(106) int local106 = local37 * (arg1 >> 16 & 0xFF);
				if (local106 > 65535) {
					local106 = 65535;
				}
				local56 = local37 * (arg1 >> 8 & 0xFF);
				if (local56 > 65535) {
					local56 = 65535;
				}
				@Pc(133) int local133 = local37 * (arg1 & 0xFF);
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg1 = (local56 & 0xFF00) + (local106 << 8 & 0xFF009F) + (local133 >> 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(166) int local166 = arg1 >> 16 & 0xFF;
			local18 = arg1 >> 8 & 0xFF;
			local166 = (int) ((float) local166 * arg2);
			local37 = arg1 & 0xFF;
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 255) {
				local166 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			local37 = (int) ((float) local37 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg1 = local18 << 8 | local166 << 16 | local37;
		}
		this.aByteBuffer3.position(arg0 * 4);
		this.aByteBuffer3.put((byte) (arg1 >> 16));
		this.aByteBuffer3.put((byte) (arg1 >> 8));
		this.aByteBuffer3.put((byte) arg1);
	}
}
