import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "Lclient!pa;")
	private Class161 aClass161_5;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Lclient!dl;")
	private final Class36_Sub1 aClass36_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	private final int anInt1410;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
	private final int anInt1411;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
	private final int anInt1412;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "[I")
	private final int[] anIntArray117;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "F")
	private final float aFloat9;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_10;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "Lclient!et;")
	private final Class23_Sub2 aClass23_Sub2_1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!dl;IIII)V")
	public Class1_Sub13(@OriginalArg(0) Class36_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass36_Sub1_1 = arg0;
		this.anInt1410 = arg4;
		this.anInt1411 = arg3;
		this.anInt1412 = arg1;
		this.anIntArray117 = new int[this.aClass36_Sub1_1.anInt4858 * this.aClass36_Sub1_1.anInt4859];
		this.aFloat9 = arg2;
		this.aClass63_Sub1_10 = this.aClass36_Sub1_1.aClass63_Sub1_12;
		this.aClass23_Sub2_1 = new Class23_Sub2(this.aClass63_Sub1_10, 5123, null, 1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBFII)V")
	public void method1363(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(37) int local37;
		if (this.anInt1412 != -1) {
			@Pc(17) Class178 local17 = this.aClass63_Sub1_10.anInterface3_5.method5486(this.anInt1412);
			local22 = local17.aByte52 & 0xFF;
			@Pc(61) int local61;
			if (local22 != 0 && local17.aByte54 != 4) {
				if (arg2 < 0) {
					local37 = 0;
				} else if (arg2 <= 127) {
					local37 = arg2 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local22 == 256) {
					arg0 = local37;
				} else {
					local61 = 256 - local22;
					arg0 = (local22 * (local37 & 0xFF00FF) + (arg0 & 0xFF00FF) * local61 & 0xFF00FF00) + ((local37 & 0xFF00) * local22 + ((arg0 & 0xFF00) * local61) & 0xFF0000) >> 8;
				}
			}
			local37 = local17.aByte49 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(110) int local110 = local37 * (arg0 >> 16 & 0xFF);
				if (local110 > 65535) {
					local110 = 65535;
				}
				local61 = local37 * (arg0 >> 8 & 0xFF);
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(139) int local139 = (arg0 & 0xFF) * local37;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg0 = (local139 >> 8) + (local61 & 0xFF00) + ((local110 & 0xC200FF00) << 8);
			}
		}
		this.aByteBuffer4.position(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(177) int local177 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg1);
			local37 = arg0 & 0xFF;
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local22 = (int) ((float) local22 * arg1);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local37 = (int) ((float) local37 * arg1);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg0 = local37 | local177 << 16 | local22 << 8;
		}
		this.aByteBuffer4.put((byte) (arg0 >> 16));
		this.aByteBuffer4.put((byte) (arg0 >> 8));
		this.aByteBuffer4.put((byte) arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public void method1364(@OriginalArg(0) int arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
	public void method1365(@OriginalArg(1) int arg0) {
		this.aByteBuffer4.position(arg0 * 4);
		this.aByteBuffer4.flip();
		@Pc(18) Interface6 local18 = this.aClass63_Sub1_10.method3363(0, this.aByteBuffer4);
		this.aClass161_5 = new Class161(this.aClass63_Sub1_10, local18, 5121, 4, 0);
		this.aByteBuffer4 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
	public void method1366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray117[arg1 + arg2 * this.aClass36_Sub1_1.anInt4858] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI[I)V")
	public void method1367(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class1_Sub7 local3 = Static58.aClass1_Sub7_2;
		local3.anInt2219 = 0;
		@Pc(31) short[] local31;
		@Pc(25) int local25;
		@Pc(36) int local36;
		@Pc(18) int local18;
		@Pc(44) int local44;
		@Pc(46) int local46;
		if (this.aClass63_Sub1_10.lb) {
			for (local18 = 0; local18 < arg0; local18++) {
				local25 = arg1[local18];
				local31 = this.aClass36_Sub1_1.aShortArrayArray3[local25];
				local36 = this.anIntArray117[local25];
				if (local36 != 0 && local31 != null) {
					local44 = 0;
					local46 = 0;
					while (local46 < local31.length) {
						if ((0x1 << local44++ & local36) == 0) {
							local46 += 3;
						} else {
							local3.method2144(local31[local46++] & 0xFFFF);
							local1++;
							local1++;
							local3.method2144(local31[local46++] & 0xFFFF);
							local1++;
							local3.method2144(local31[local46++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg0; local18++) {
				local25 = arg1[local18];
				local31 = this.aClass36_Sub1_1.aShortArrayArray3[local25];
				local36 = this.anIntArray117[local25];
				if (local36 != 0 && local31 != null) {
					local44 = 0;
					local46 = 0;
					while (local31.length > local46) {
						if ((local36 & 0x1 << local44++) == 0) {
							local46 += 3;
						} else {
							local3.method2125(local31[local46++] & 0xFFFF);
							local1++;
							local1++;
							local3.method2125(local31[local46++] & 0xFFFF);
							local1++;
							local3.method2125(local31[local46++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(179) opengl local179 = this.aClass63_Sub1_10.anOpengl1;
		this.aClass63_Sub1_10.method3378(this.anInt1412, (this.aClass36_Sub1_1.anInt1465 & 0x7) != 0, (this.aClass36_Sub1_1.anInt1465 & 0x8) != 0);
		if (this.aClass63_Sub1_10.aBoolean251) {
			this.aClass63_Sub1_10.method4563(Integer.MAX_VALUE, this.anInt1411, this.anInt1410);
		}
		this.aClass23_Sub2_1.method2055(local3.aByteArray41, local3.anInt2219);
		local179.glMatrixMode(5890);
		local179.glPushMatrix();
		local179.glScalef(1.0F / this.aFloat9, 1.0F / this.aFloat9, 1.0F);
		local179.glMatrixMode(5888);
		this.aClass63_Sub1_10.method3387(this.aClass36_Sub1_1.aClass161_7, this.aClass36_Sub1_1.aClass161_9, this.aClass161_5, this.aClass36_Sub1_1.aClass161_6);
		this.aClass63_Sub1_10.method3334(this.aClass23_Sub2_1, 0, local1);
		local179.glMatrixMode(5890);
		local179.glPopMatrix();
		local179.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)V")
	public void method1368(@OriginalArg(1) int arg0) {
		this.aByteBuffer4.position(arg0 * 4 + 3);
		this.aByteBuffer4.put((byte) -1);
	}
}
