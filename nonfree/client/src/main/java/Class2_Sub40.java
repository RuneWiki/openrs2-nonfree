import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!us", name = "t", descriptor = "Lclient!fh;")
	private Class75 aClass75_14;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "Lclient!to;")
	private final Class149_Sub1 aClass149_Sub1_2;

	@OriginalMember(owner = "client!us", name = "x", descriptor = "F")
	public final float aFloat75;

	@OriginalMember(owner = "client!us", name = "w", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_36;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "[I")
	private final int[] anIntArray567;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "I")
	public final int anInt6597;

	@OriginalMember(owner = "client!us", name = "q", descriptor = "I")
	public final int anInt6596;

	@OriginalMember(owner = "client!us", name = "s", descriptor = "I")
	public final int anInt6598;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!us", name = "u", descriptor = "Lclient!lh;")
	private final Class99_Sub2 aClass99_Sub2_2;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!to;IIIII)V")
	public Class2_Sub40(@OriginalArg(0) Class149_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass149_Sub1_2 = arg0;
		this.aFloat75 = arg2;
		this.aClass48_Sub2_36 = this.aClass149_Sub1_2.aClass48_Sub2_34;
		this.anIntArray567 = new int[this.aClass149_Sub1_2.anInt6741 * this.aClass149_Sub1_2.anInt6740];
		this.anInt6597 = arg4;
		this.anInt6596 = arg5;
		this.anInt6598 = arg1;
		this.anInt6595 = arg3;
		this.aClass99_Sub2_2 = new Class99_Sub2(this.aClass48_Sub2_36, 5123, null, 1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)V")
	public void method5680(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIII)V")
	public void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray567[arg0 + arg1 * this.aClass149_Sub1_2.anInt6741] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
	public void method5682(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(18) Interface2 local18 = this.aClass48_Sub2_36.method2557(0, this.aByteBuffer7);
		this.aClass75_14 = new Class75(this.aClass48_Sub2_36, local18, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
	public void method5683(@OriginalArg(1) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIFI)V")
	public void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(20) int local20;
		@Pc(37) int local37;
		if (this.anInt6598 != -1) {
			@Pc(15) Class166 local15 = this.aClass48_Sub2_36.anInterface3_4.method1278(this.anInt6598);
			local20 = local15.aByte39 & 0xFF;
			@Pc(57) int local57;
			if (local20 != 0 && local15.aByte37 != 4) {
				if (arg0 < 0) {
					local37 = 0;
				} else if (arg0 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg0 * 131586;
				}
				if (local20 == 256) {
					arg1 = local37;
				} else {
					local57 = 256 - local20;
					arg1 = ((arg1 & 0xFF00FF) * local57 + (local37 & 0xFF00FF) * local20 & 0xFF00FF00) + (local20 * (local37 & 0xFF00) + (arg1 & 0xFF00) * local57 & 0xFF0000) >> 8;
				}
			}
			local37 = local15.aByte41 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(110) int local110 = (arg1 >> 16 & 0xFF) * local37;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local57 = (arg1 >> 8 & 0xFF) * local37;
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(138) int local138 = (arg1 & 0xFF) * local37;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg1 = ((local110 & 0xCC00FF00) << 8) + (local57 & 0xFF00) + (local138 >> 8);
			}
		}
		this.aByteBuffer7.position(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(178) int local178 = arg1 >> 16 & 0xFF;
			local20 = arg1 >> 8 & 0xFF;
			local37 = arg1 & 0xFF;
			local178 = (int) ((float) local178 * arg3);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			local20 = (int) ((float) local20 * arg3);
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			local37 = (int) ((float) local37 * arg3);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg1 = local37 | local20 << 8 | local178 << 16;
		}
		this.aByteBuffer7.put((byte) (arg1 >> 16));
		this.aByteBuffer7.put((byte) (arg1 >> 8));
		this.aByteBuffer7.put((byte) arg1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B[II)V")
	public void method5685(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(12) Class2_Sub24 local12 = Static341.aClass2_Sub24_5;
		local12.anInt6669 = 0;
		@Pc(39) short[] local39;
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(21) int local21;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (this.aClass48_Sub2_36.aBoolean218) {
			for (local21 = 0; local21 < arg1; local21++) {
				local28 = arg0[local21];
				local33 = this.anIntArray567[local28];
				local39 = this.aClass149_Sub1_2.aShortArrayArray26[local28];
				if (local33 != 0 && local39 != null) {
					local45 = 0;
					local47 = 0;
					while (local39.length > local47) {
						if ((0x1 << local45++ & local33) == 0) {
							local47 += 3;
						} else {
							local1++;
							local12.method5721(local39[local47++] & 0xFFFF);
							local1++;
							local12.method5721(local39[local47++] & 0xFFFF);
							local1++;
							local12.method5721(local39[local47++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local21 = 0; local21 < arg1; local21++) {
				local28 = arg0[local21];
				local33 = this.anIntArray567[local28];
				local39 = this.aClass149_Sub1_2.aShortArrayArray26[local28];
				if (local33 != 0 && local39 != null) {
					local45 = 0;
					local47 = 0;
					while (local39.length > local47) {
						if ((0x1 << local45++ & local33) == 0) {
							local47 += 3;
						} else {
							local12.method5717(local39[local47++] & 0xFFFF);
							local1++;
							local12.method5717(local39[local47++] & 0xFFFF);
							local1++;
							local1++;
							local12.method5717(local39[local47++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(185) opengl local185 = this.aClass48_Sub2_36.anOpengl2;
		this.aClass99_Sub2_2.method5136(local12.aByteArray100, local12.anInt6669);
		this.aClass48_Sub2_36.method2586(this.aClass149_Sub1_2.aClass75_11, this.aClass149_Sub1_2.aClass75_13, this.aClass75_14, this.aClass149_Sub1_2.aClass75_10);
		this.aClass48_Sub2_36.method2605(this.anInt6598, (this.aClass149_Sub1_2.anInt6300 & 0x7) != 0, (this.aClass149_Sub1_2.anInt6300 & 0x8) != 0);
		if (this.aClass48_Sub2_36.aBoolean239) {
			this.aClass48_Sub2_36.method2485(Integer.MAX_VALUE, this.anInt6595, this.anInt6597, this.anInt6596);
		}
		local185.glMatrixMode(5890);
		local185.glPushMatrix();
		local185.glScalef(1.0F / this.aFloat75, 1.0F / this.aFloat75, 1.0F);
		local185.glMatrixMode(5888);
		this.aClass48_Sub2_36.method2586(this.aClass149_Sub1_2.aClass75_11, this.aClass149_Sub1_2.aClass75_13, this.aClass75_14, this.aClass149_Sub1_2.aClass75_10);
		this.aClass48_Sub2_36.method2580(this.aClass99_Sub2_2, 0, local1);
		local185.glMatrixMode(5890);
		local185.glPopMatrix();
		local185.glMatrixMode(5888);
	}
}
