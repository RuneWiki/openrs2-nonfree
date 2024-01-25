import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Lclient!ig;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Lclient!ef;")
	private final Class53_Sub1 aClass53_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	private final int anInt385;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	private final int anInt384;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "[I")
	private final int[] anIntArray44;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_5;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	private final int anInt386;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "F")
	private final float aFloat1;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Lclient!id;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!ef;IIII)V")
	public Class1_Sub6(@OriginalArg(0) Class53_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass53_Sub1_1 = arg0;
		this.anInt385 = arg4;
		this.anInt384 = arg3;
		this.anIntArray44 = new int[this.aClass53_Sub1_1.anInt3017 * this.aClass53_Sub1_1.anInt3016];
		this.aClass32_Sub2_5 = this.aClass53_Sub1_1.aClass32_Sub2_13;
		this.anInt386 = arg1;
		this.aFloat1 = arg2;
		this.aClass4_Sub2_1 = new Class4_Sub2(this.aClass32_Sub2_5, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
	public void method353(@OriginalArg(0) int arg0) {
		this.aByteBuffer3.position(arg0 * 4);
		this.aByteBuffer3.flip();
		@Pc(27) Interface8 local27 = this.aClass32_Sub2_5.method2272(0, this.aByteBuffer3);
		this.aClass91_1 = new Class91(this.aClass32_Sub2_5, local27, 5121, 4, 0);
		this.aByteBuffer3 = null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IFZII)V")
	public void method354(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) int local27;
		@Pc(42) int local42;
		if (this.anInt386 != -1) {
			@Pc(22) Class154 local22 = this.aClass32_Sub2_5.anInterface2_4.method4244(this.anInt386);
			local27 = local22.aByte35 & 0xFF;
			@Pc(67) int local67;
			if (local27 != 0 && local22.aByte34 != 4) {
				if (arg0 < 0) {
					local42 = 0;
				} else if (arg0 <= 127) {
					local42 = arg0 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local27 == 256) {
					arg2 = local42;
				} else {
					local67 = 256 - local27;
					arg2 = ((arg2 & 0xFF00FF) * local67 + local27 * (local42 & 0xFF00FF) & 0xFF00FF00) + ((local42 & 0xFF00) * local27 + ((arg2 & 0xFF00) * local67) & 0xFF0000) >> 8;
				}
			}
			local42 = local22.aByte37 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(117) int local117 = local42 * (arg2 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local67 = local42 * (arg2 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(145) int local145 = local42 * (arg2 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg2 = (local145 >> 8) + (((local117 & 0xBC00FF00) << 8) + (local67 & 0xFF00));
			}
		}
		this.aByteBuffer3.position(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(183) int local183 = arg2 >> 16 & 0xFF;
			local27 = arg2 >> 8 & 0xFF;
			local42 = arg2 & 0xFF;
			local183 = (int) ((float) local183 * arg1);
			if (local183 < 0) {
				local183 = 0;
			} else if (local183 > 255) {
				local183 = 255;
			}
			local27 = (int) ((float) local27 * arg1);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			local42 = (int) ((float) local42 * arg1);
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			arg2 = local183 << 16 | local27 << 8 | local42;
		}
		this.aByteBuffer3.put((byte) (arg2 >> 16));
		this.aByteBuffer3.put((byte) (arg2 >> 8));
		this.aByteBuffer3.put((byte) arg2);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)V")
	public void method355(@OriginalArg(1) int arg0) {
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B[II)V")
	public void method356(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class1_Sub8 local3 = Static66.aClass1_Sub8_3;
		local3.anInt5182 = 0;
		@Pc(40) short[] local40;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(22) int local22;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass32_Sub2_5.aBoolean240) {
			for (local22 = 0; local22 < arg1; local22++) {
				local29 = arg0[local22];
				local34 = this.anIntArray44[local29];
				local40 = this.aClass53_Sub1_1.aShortArrayArray1[local29];
				if (local34 != 0 && local40 != null) {
					local50 = 0;
					local52 = 0;
					while (local40.length > local52) {
						if ((0x1 << local50++ & local34) == 0) {
							local52 += 3;
						} else {
							local3.method4542(local40[local52++] & 0xFFFF);
							local1++;
							local1++;
							local3.method4542(local40[local52++] & 0xFFFF);
							local3.method4542(local40[local52++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local22 = 0; local22 < arg1; local22++) {
				local29 = arg0[local22];
				local40 = this.aClass53_Sub1_1.aShortArrayArray1[local29];
				local34 = this.anIntArray44[local29];
				if (local34 != 0 && local40 != null) {
					local50 = 0;
					local52 = 0;
					while (local40.length > local52) {
						if ((0x1 << local50++ & local34) == 0) {
							local52 += 3;
						} else {
							local3.method4509(local40[local52++] & 0xFFFF);
							local1++;
							local3.method4509(local40[local52++] & 0xFFFF);
							local1++;
							local3.method4509(local40[local52++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(197) opengl local197 = this.aClass32_Sub2_5.anOpengl2;
		this.aClass32_Sub2_5.method2299(this.anInt386, (this.aClass53_Sub1_1.anInt1812 & 0x7) != 0, (this.aClass53_Sub1_1.anInt1812 & 0x8) != 0);
		if (this.aClass32_Sub2_5.aBoolean248) {
			this.aClass32_Sub2_5.method2164(Integer.MAX_VALUE, this.anInt384, this.anInt385);
		}
		this.aClass4_Sub2_1.method2574(local3.aByteArray81, local3.anInt5182);
		local197.glMatrixMode(5890);
		local197.glPushMatrix();
		local197.glScalef(1.0F / this.aFloat1, 1.0F / this.aFloat1, 1.0F);
		local197.glMatrixMode(5888);
		this.aClass32_Sub2_5.method2269(this.aClass53_Sub1_1.aClass91_2, this.aClass53_Sub1_1.aClass91_5, this.aClass91_1, this.aClass53_Sub1_1.aClass91_4);
		this.aClass32_Sub2_5.method2252(this.aClass4_Sub2_1, 0, local1);
		local197.glMatrixMode(5890);
		local197.glPopMatrix();
		local197.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public void method357(@OriginalArg(1) int arg0) {
		this.aByteBuffer3.position(arg0 * 4 + 3);
		this.aByteBuffer3.put((byte) -1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V")
	public void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray44[this.aClass53_Sub1_1.anInt3017 * arg2 + arg0] |= 0x1 << arg1;
	}
}
