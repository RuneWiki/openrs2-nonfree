import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Lclient!fm;")
	private Class72 aClass72_14;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Lclient!ka;")
	private final Class107_Sub1 aClass107_Sub1_3;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
	public final int anInt5889;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_38;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
	private final int[] anIntArray1204;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	public final int anInt5888;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "F")
	public final float aFloat76;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	public final int anInt5890;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
	public final int anInt5891;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "Lclient!br;")
	private final Class23_Sub1 aClass23_Sub1_2;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!ka;IIIII)V")
	public Class2_Sub41(@OriginalArg(0) Class107_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass107_Sub1_3 = arg0;
		this.anInt5889 = arg1;
		this.aClass63_Sub2_38 = this.aClass107_Sub1_3.aClass63_Sub2_23;
		this.anIntArray1204 = new int[this.aClass107_Sub1_3.anInt5379 * this.aClass107_Sub1_3.anInt5378];
		this.anInt5888 = arg3;
		this.aFloat76 = arg2;
		this.anInt5890 = arg4;
		this.anInt5891 = arg5;
		this.aClass23_Sub1_2 = new Class23_Sub1(this.aClass63_Sub2_38, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
	public void method5067(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ[I)V")
	public void method5068(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub16 local11 = Static172.aClass2_Sub16_7;
		local11.anInt6145 = 0;
		@Pc(42) short[] local42;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(20) int local20;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass63_Sub2_38.aBoolean153) {
			for (local20 = 0; local20 < arg0; local20++) {
				local31 = arg1[local20];
				local36 = this.anIntArray1204[local31];
				local42 = this.aClass107_Sub1_3.aShortArrayArray4[local31];
				if (local36 != 0 && local42 != null) {
					local53 = 0;
					local55 = 0;
					while (local42.length > local55) {
						if ((local36 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local9++;
							local11.method5351(local42[local55++] & 0xFFFF);
							local11.method5351(local42[local55++] & 0xFFFF);
							local9++;
							local11.method5351(local42[local55++] & 0xFFFF);
							local9++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local31 = arg1[local20];
				local42 = this.aClass107_Sub1_3.aShortArrayArray4[local31];
				local36 = this.anIntArray1204[local31];
				if (local36 != 0 && local42 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local42.length) {
						if ((local36 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local9++;
							local11.method5374(local42[local55++] & 0xFFFF);
							local9++;
							local11.method5374(local42[local55++] & 0xFFFF);
							local11.method5374(local42[local55++] & 0xFFFF);
							local9++;
						}
					}
				}
			}
		}
		if (local9 <= 0) {
			return;
		}
		@Pc(197) opengl local197 = this.aClass63_Sub2_38.anOpengl2;
		this.aClass23_Sub1_2.method3592(local11.aByteArray112, local11.anInt6145);
		this.aClass63_Sub2_38.method2114(this.aClass107_Sub1_3.aClass72_13, this.aClass107_Sub1_3.aClass72_10, this.aClass72_14, this.aClass107_Sub1_3.aClass72_12);
		this.aClass63_Sub2_38.method2132(this.anInt5889, (this.aClass107_Sub1_3.anInt3320 & 0x7) != 0, (this.aClass107_Sub1_3.anInt3320 & 0x8) != 0);
		if (this.aClass63_Sub2_38.aBoolean147) {
			this.aClass63_Sub2_38.method2009(Integer.MAX_VALUE, this.anInt5888, this.anInt5890, this.anInt5891);
		}
		local197.glMatrixMode(5890);
		local197.glPushMatrix();
		local197.glScalef(1.0F / this.aFloat76, 1.0F / this.aFloat76, 1.0F);
		local197.glMatrixMode(5888);
		this.aClass63_Sub2_38.method2114(this.aClass107_Sub1_3.aClass72_13, this.aClass107_Sub1_3.aClass72_10, this.aClass72_14, this.aClass107_Sub1_3.aClass72_12);
		this.aClass63_Sub2_38.method2072(this.aClass23_Sub1_2, 0, local9);
		local197.glMatrixMode(5890);
		local197.glPopMatrix();
		local197.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBII)V")
	public void method5069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray1204[arg0 * this.aClass107_Sub1_3.anInt5379 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIFIB)V")
	public void method5070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(37) int local37;
		if (this.anInt5889 != -1) {
			@Pc(14) Class132 local14 = this.aClass63_Sub2_38.anInterface9_3.method139(this.anInt5889);
			local19 = local14.aByte34 & 0xFF;
			@Pc(58) int local58;
			if (local19 != 0 && local14.aByte33 != 4) {
				if (arg0 < 0) {
					local37 = 0;
				} else if (arg0 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg0 * 131586;
				}
				if (local19 == 256) {
					arg1 = local37;
				} else {
					local58 = 256 - local19;
					arg1 = (local19 * (local37 & 0xFF00) + local58 * (arg1 & 0xFF00) & 0xFF0000) + ((local37 & 0xFF00FF) * local19 + ((arg1 & 0xFF00FF) * local58) & 0xFF00FF00) >> 8;
				}
			}
			local37 = local14.aByte32 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(106) int local106 = local37 * (arg1 >> 16 & 0xFF);
				if (local106 > 65535) {
					local106 = 65535;
				}
				local58 = (arg1 >> 8 & 0xFF) * local37;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(134) int local134 = (arg1 & 0xFF) * local37;
				if (local134 > 65535) {
					local134 = 65535;
				}
				arg1 = (local58 & 0xFF00) + (((local106 & 0xFF00) << 8) + (local134 >> 8));
			}
		}
		if (arg2 != 1.0F) {
			@Pc(168) int local168 = arg1 >> 16 & 0xFF;
			local19 = arg1 >> 8 & 0xFF;
			local168 = (int) ((float) local168 * arg2);
			local37 = arg1 & 0xFF;
			local19 = (int) ((float) local19 * arg2);
			if (local168 < 0) {
				local168 = 0;
			} else if (local168 > 255) {
				local168 = 255;
			}
			local37 = (int) ((float) local37 * arg2);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg1 = local37 | local168 << 16 | local19 << 8;
		}
		this.aByteBuffer7.position(arg3 * 4);
		this.aByteBuffer7.put((byte) (arg1 >> 16));
		this.aByteBuffer7.put((byte) (arg1 >> 8));
		this.aByteBuffer7.put((byte) arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	public void method5071(@OriginalArg(0) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)V")
	public void method5072(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(21) Interface6 local21 = this.aClass63_Sub2_38.method2130(0, this.aByteBuffer7);
		this.aClass72_14 = new Class72(this.aClass63_Sub2_38, local21, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}
}
