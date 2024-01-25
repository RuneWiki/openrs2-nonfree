import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!gm;")
	private Class84 aClass84_6;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!kk;")
	private final Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	private final int anInt3789;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	private final int anInt3787;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "F")
	private final float aFloat34;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_24;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
	private final int[] anIntArray356;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	private final int anInt3788;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!kk;IIII)V")
	public Class1_Sub24(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass12_Sub2_1 = arg0;
		this.anInt3789 = arg4;
		this.anInt3787 = arg3;
		this.aFloat34 = arg2;
		this.aClass105_Sub1_24 = this.aClass12_Sub2_1.aClass105_Sub1_20;
		this.anIntArray356 = new int[this.aClass12_Sub2_1.anInt3163 * this.aClass12_Sub2_1.anInt3162];
		this.anInt3788 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([IIB)V")
	public void method3203(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		Static155.aClass1_Sub21_3.anInt6611 = 0;
		@Pc(31) short[] local31;
		@Pc(25) int local25;
		@Pc(36) int local36;
		@Pc(18) int local18;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass105_Sub1_24.aBoolean316) {
			for (local18 = 0; local18 < arg1; local18++) {
				local25 = arg0[local18];
				local31 = this.aClass12_Sub2_1.aShortArrayArray10[local25];
				local36 = this.anIntArray356[local25];
				if (local36 != 0 && local31 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local31.length) {
						if ((0x1 << local46++ & local36) == 0) {
							local48 += 3;
						} else {
							Static155.aClass1_Sub21_3.method5698(local31[local48++]);
							local1++;
							Static155.aClass1_Sub21_3.method5698(local31[local48++]);
							local1++;
							local1++;
							Static155.aClass1_Sub21_3.method5698(local31[local48++]);
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg1; local18++) {
				local25 = arg0[local18];
				local31 = this.aClass12_Sub2_1.aShortArrayArray10[local25];
				local36 = this.anIntArray356[local25];
				if (local36 != 0 && local31 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local31.length) {
						if ((0x1 << local46++ & local36) == 0) {
							local48 += 3;
						} else {
							local1++;
							Static155.aClass1_Sub21_3.method5731(local31[local48++]);
							local1++;
							Static155.aClass1_Sub21_3.method5731(local31[local48++]);
							Static155.aClass1_Sub21_3.method5731(local31[local48++]);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(172) opengl local172 = this.aClass105_Sub1_24.anOpengl1;
		this.aClass105_Sub1_24.method3633(this.anInt3788, (this.aClass12_Sub2_1.anInt3173 & 0x7) != 0, (this.aClass12_Sub2_1.anInt3173 & 0x8) != 0);
		if (this.aClass105_Sub1_24.aBoolean323) {
			this.aClass105_Sub1_24.method4263(Integer.MAX_VALUE, this.anInt3787, this.anInt3789);
		}
		this.aClass105_Sub1_24.anInterface8_5.method1583(Static155.aClass1_Sub21_3.aByteArray82, Static155.aClass1_Sub21_3.anInt6611);
		local172.glMatrixMode(5890);
		local172.glPushMatrix();
		local172.glScalef(1.0F / this.aFloat34, 1.0F / this.aFloat34, 1.0F);
		local172.glMatrixMode(5888);
		this.aClass105_Sub1_24.method3569(this.aClass84_6);
		this.aClass105_Sub1_24.method3590(this.aClass105_Sub1_24.anInterface8_5, 0, local1);
		local172.glMatrixMode(5890);
		local172.glPopMatrix();
		local172.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public void method3204(@OriginalArg(1) int arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IFIIZ)V")
	public void method3205(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (this.anInt3788 != -1) {
			@Pc(12) Class116 local12 = this.aClass105_Sub1_24.anInterface2_3.method951(this.anInt3788);
			local17 = local12.aByte44 & 0xFF;
			@Pc(57) int local57;
			if (local17 != 0 && local12.aByte47 != 4) {
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 <= 127) {
					local31 = arg2 * 131586;
				} else {
					local31 = 16777215;
				}
				if (local17 == 256) {
					arg0 = local31;
				} else {
					local57 = 256 - local17;
					arg0 = (local57 * (arg0 & 0xFF00FF) + (local31 & 0xFF00FF) * local17 & 0xFF00FF00) + (local57 * (arg0 & 0xFF00) + local17 * (local31 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local31 = local12.aByte49 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(106) int local106 = (arg0 >> 16 & 0xFF) * local31;
				if (local106 > 65535) {
					local106 = 65535;
				}
				local57 = (arg0 >> 8 & 0xFF) * local31;
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(132) int local132 = (arg0 & 0xFF) * local31;
				if (local132 > 65535) {
					local132 = 65535;
				}
				arg0 = (local57 & 0xFF00) + ((local106 & 0x4800FF00) << 8) + (local132 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(165) int local165 = arg0 >> 16 & 0xFF;
			local17 = arg0 >> 8 & 0xFF;
			local31 = arg0 & 0xFF;
			local165 = (int) ((float) local165 * arg1);
			local17 = (int) ((float) local17 * arg1);
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 255) {
				local165 = 255;
			}
			local31 = (int) ((float) local31 * arg1);
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 255) {
				local17 = 255;
			}
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg0 = local165 << 16 | local17 << 8 | local31;
		}
		this.aByteBuffer4.position(arg3 * 4);
		this.aByteBuffer4.put((byte) (arg0 >> 16));
		this.aByteBuffer4.put((byte) (arg0 >> 8));
		this.aByteBuffer4.put((byte) arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	public void method3206(@OriginalArg(0) int arg0) {
		this.aByteBuffer4.position(arg0 * 4);
		this.aByteBuffer4.flip();
		@Pc(25) Interface9 local25 = this.aClass105_Sub1_24.method3564(0, this.aByteBuffer4);
		this.aClass84_6 = new Class84(this.aClass105_Sub1_24, local25, 5121, 4, 0);
		this.aByteBuffer4 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
	public void method3207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray356[this.aClass12_Sub2_1.anInt3162 * arg1 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	public void method3208(@OriginalArg(1) int arg0) {
		this.aByteBuffer4.position(arg0 * 4 + 3);
		this.aByteBuffer4.put((byte) -1);
	}
}
