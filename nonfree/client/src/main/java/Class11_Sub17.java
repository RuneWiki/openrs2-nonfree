import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class11_Sub17 extends Class11 {

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "Lclient!q;")
	private Class160 aClass160_8;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "Lclient!fq;")
	private final Class77_Sub1 aClass77_Sub1_1;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	private final int anInt2247;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
	private final int anInt2248;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "F")
	private final float aFloat15;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "[I")
	private final int[] anIntArray159;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	private final int anInt2246;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_14;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!sr;")
	private final Class100_Sub2 aClass100_Sub2_2;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!fq;IIII)V")
	public Class11_Sub17(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass77_Sub1_1 = arg0;
		this.anInt2247 = arg4;
		this.anInt2248 = arg3;
		this.aFloat15 = arg2;
		this.anIntArray159 = new int[this.aClass77_Sub1_1.anInt4673 * this.aClass77_Sub1_1.anInt4672];
		this.anInt2246 = arg1;
		this.aClass129_Sub2_14 = this.aClass77_Sub1_1.aClass129_Sub2_9;
		this.aClass100_Sub2_2 = new Class100_Sub2(this.aClass129_Sub2_14, 5123, null, 1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBF)V")
	public void method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(17) int local17;
		@Pc(37) int local37;
		if (this.anInt2246 != -1) {
			@Pc(12) Class134 local12 = this.aClass129_Sub2_14.anInterface2_7.method2244(this.anInt2246);
			local17 = local12.aByte48 & 0xFF;
			@Pc(55) int local55;
			if (local17 != 0 && local12.aByte42 != 4) {
				if (arg0 < 0) {
					local37 = 0;
				} else if (arg0 <= 127) {
					local37 = arg0 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local17 == 256) {
					arg2 = local37;
				} else {
					local55 = 256 - local17;
					arg2 = (local55 * (arg2 & 0xFF00FF) + local17 * (local37 & 0xFF00FF) & 0xFF00FF00) + (local17 * (local37 & 0xFF00) + (arg2 & 0xFF00) * local55 & 0xFF0000) >> 8;
				}
			}
			local37 = local12.aByte43 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(109) int local109 = local37 * (arg2 >> 16 & 0xFF);
				if (local109 > 65535) {
					local109 = 65535;
				}
				local55 = (arg2 >> 8 & 0xFF) * local37;
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(138) int local138 = (arg2 & 0xFF) * local37;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg2 = (local138 >> 8) + (local55 & 0xFF00) + (local109 << 8 & 0xFF00D3);
			}
		}
		this.aByteBuffer1.position(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(175) int local175 = arg2 >> 16 & 0xFF;
			local17 = arg2 >> 8 & 0xFF;
			local175 = (int) ((float) local175 * arg3);
			local37 = arg2 & 0xFF;
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local17 = (int) ((float) local17 * arg3);
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 255) {
				local17 = 255;
			}
			local37 = (int) ((float) local37 * arg3);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg2 = local37 | local17 << 8 | local175 << 16;
		}
		this.aByteBuffer1.put((byte) (arg2 >> 16));
		this.aByteBuffer1.put((byte) (arg2 >> 8));
		this.aByteBuffer1.put((byte) arg2);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
	public void method1867(@OriginalArg(0) int arg0) {
		this.aByteBuffer1.position(arg0 * 4 + 3);
		this.aByteBuffer1.put((byte) -1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[I)V")
	public void method1868(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class11_Sub25 local3 = Static94.aClass11_Sub25_2;
		local3.anInt6076 = 0;
		@Pc(36) short[] local36;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(18) int local18;
		@Pc(47) int local47;
		@Pc(49) int local49;
		if (this.aClass129_Sub2_14.aBoolean377) {
			for (local18 = 0; local18 < arg0; local18++) {
				local25 = arg1[local18];
				local30 = this.anIntArray159[local25];
				local36 = this.aClass77_Sub1_1.aShortArrayArray2[local25];
				if (local30 != 0 && local36 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local36.length) {
						if ((local30 & 0x1 << local47++) == 0) {
							local49 += 3;
						} else {
							local1++;
							local3.method5204(local36[local49++] & 0xFFFF);
							local1++;
							local3.method5204(local36[local49++] & 0xFFFF);
							local3.method5204(local36[local49++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg0; local18++) {
				local25 = arg1[local18];
				local36 = this.aClass77_Sub1_1.aShortArrayArray2[local25];
				local30 = this.anIntArray159[local25];
				if (local30 != 0 && local36 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local36.length) {
						if ((local30 & 0x1 << local47++) == 0) {
							local49 += 3;
						} else {
							local1++;
							local3.method5223(local36[local49++] & 0xFFFF);
							local1++;
							local3.method5223(local36[local49++] & 0xFFFF);
							local3.method5223(local36[local49++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(189) opengl local189 = this.aClass129_Sub2_14.anOpengl2;
		this.aClass129_Sub2_14.method5040(this.anInt2246, (this.aClass77_Sub1_1.anInt1680 & 0x7) != 0, (this.aClass77_Sub1_1.anInt1680 & 0x8) != 0);
		if (this.aClass129_Sub2_14.aBoolean386) {
			this.aClass129_Sub2_14.method4964(Integer.MAX_VALUE, this.anInt2248, this.anInt2247);
		}
		this.aClass100_Sub2_2.method4886(local3.aByteArray93, local3.anInt6076);
		local189.glMatrixMode(5890);
		local189.glPushMatrix();
		local189.glScalef(1.0F / this.aFloat15, 1.0F / this.aFloat15, 1.0F);
		local189.glMatrixMode(5888);
		this.aClass129_Sub2_14.method5038(this.aClass77_Sub1_1.aClass160_5, this.aClass77_Sub1_1.aClass160_4, this.aClass160_8, this.aClass77_Sub1_1.aClass160_7);
		this.aClass129_Sub2_14.method5092(this.aClass100_Sub2_2, 0, local1);
		local189.glMatrixMode(5890);
		local189.glPopMatrix();
		local189.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public void method1869(@OriginalArg(0) int arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	public void method1870(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0 * 4);
		this.aByteBuffer1.flip();
		@Pc(18) Interface6 local18 = this.aClass129_Sub2_14.method5062(0, this.aByteBuffer1);
		this.aClass160_8 = new Class160(this.aClass129_Sub2_14, local18, 5121, 4, 0);
		this.aByteBuffer1 = null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)V")
	public void method1871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray159[arg1 * this.aClass77_Sub1_1.anInt4673 + arg0] |= 0x1 << arg2;
	}
}
