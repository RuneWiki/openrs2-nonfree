import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!po", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "Lclient!hf;")
	private Class81 aClass81_12;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!je;")
	private final Class73_Sub1 aClass73_Sub1_1;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_29;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "F")
	private final float aFloat68;

	@OriginalMember(owner = "client!po", name = "y", descriptor = "I")
	private final int anInt4747;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "I")
	private final int anInt4745;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "I")
	private final int anInt4746;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "[I")
	private final int[] anIntArray372;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "Lclient!ef;")
	private final Class50_Sub1 aClass50_Sub1_1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!je;IIII)V")
	public Class2_Sub35(@OriginalArg(0) Class73_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass73_Sub1_1 = arg0;
		this.aClass4_Sub1_29 = this.aClass73_Sub1_1.aClass4_Sub1_17;
		this.aFloat68 = arg2;
		this.anInt4747 = arg4;
		this.anInt4745 = arg3;
		this.anInt4746 = arg1;
		this.anIntArray372 = new int[this.aClass73_Sub1_1.anInt5546 * this.aClass73_Sub1_1.anInt5550];
		this.aClass50_Sub1_1 = new Class50_Sub1(this.aClass4_Sub1_29, 5123, null, 1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZII)V")
	public void method4368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray372[arg0 + arg2 * this.aClass73_Sub1_1.anInt5546] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public void method4369(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(18) Interface8 local18 = this.aClass4_Sub1_29.method537(0, this.aByteBuffer7);
		this.aClass81_12 = new Class81(this.aClass4_Sub1_29, local18, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BFIII)V")
	public void method4370(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17;
		@Pc(32) int local32;
		if (this.anInt4746 != -1) {
			@Pc(12) Class213 local12 = this.aClass4_Sub1_29.anInterface7_1.method5778(this.anInt4746);
			local17 = local12.aByte70 & 0xFF;
			@Pc(57) int local57;
			if (local17 != 0 && local12.aByte72 != 4) {
				if (arg1 < 0) {
					local32 = 0;
				} else if (arg1 <= 127) {
					local32 = arg1 * 131586;
				} else {
					local32 = 16777215;
				}
				if (local17 == 256) {
					arg3 = local32;
				} else {
					local57 = 256 - local17;
					arg3 = (local57 * (arg3 & 0xFF00FF) + local17 * (local32 & 0xFF00FF) & 0xFF00FF00) + ((local32 & 0xFF00) * local17 + ((arg3 & 0xFF00) * local57) & 0xFF0000) >> 8;
				}
			}
			local32 = local12.aByte75 & 0xFF;
			if (local32 != 0) {
				local32 += 256;
				@Pc(108) int local108 = local32 * (arg3 >> 16 & 0xFF);
				if (local108 > 65535) {
					local108 = 65535;
				}
				local57 = local32 * (arg3 >> 8 & 0xFF);
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(135) int local135 = local32 * (arg3 & 0xFF);
				if (local135 > 65535) {
					local135 = 65535;
				}
				arg3 = (local57 & 0xFF00) + ((local108 & 0x900FF00) << 8) + (local135 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(164) int local164 = arg3 >> 16 & 0xFF;
			local17 = arg3 >> 8 & 0xFF;
			local32 = arg3 & 0xFF;
			local164 = (int) ((float) local164 * arg0);
			local17 = (int) ((float) local17 * arg0);
			if (local164 < 0) {
				local164 = 0;
			} else if (local164 > 255) {
				local164 = 255;
			}
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 255) {
				local17 = 255;
			}
			local32 = (int) ((float) local32 * arg0);
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 255) {
				local32 = 255;
			}
			arg3 = local32 | local17 << 8 | local164 << 16;
		}
		this.aByteBuffer7.position(arg2 * 4);
		this.aByteBuffer7.put((byte) (arg3 >> 16));
		this.aByteBuffer7.put((byte) (arg3 >> 8));
		this.aByteBuffer7.put((byte) arg3);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)V")
	public void method4371(@OriginalArg(0) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
	public void method4372(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II[I)V")
	public void method4373(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) Class2_Sub10 local10 = Static150.aClass2_Sub10_3;
		local10.anInt4807 = 0;
		@Pc(37) short[] local37;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(19) int local19;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass4_Sub1_29.aBoolean32) {
			for (local19 = 0; local19 < arg0; local19++) {
				local26 = arg1[local19];
				local31 = this.anIntArray372[local26];
				local37 = this.aClass73_Sub1_1.aShortArrayArray4[local26];
				if (local31 != 0 && local37 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local37.length) {
						if ((local31 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local10.method4452(local37[local50++] & 0xFFFF);
							local1++;
							local10.method4452(local37[local50++] & 0xFFFF);
							local1++;
							local10.method4452(local37[local50++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local19 = 0; local19 < arg0; local19++) {
				local26 = arg1[local19];
				local31 = this.anIntArray372[local26];
				local37 = this.aClass73_Sub1_1.aShortArrayArray4[local26];
				if (local31 != 0 && local37 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local37.length) {
						if ((local31 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local1++;
							local10.method4456(local37[local50++] & 0xFFFF);
							local10.method4456(local37[local50++] & 0xFFFF);
							local1++;
							local10.method4456(local37[local50++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(186) opengl local186 = this.aClass4_Sub1_29.anOpengl1;
		this.aClass4_Sub1_29.method545(this.anInt4746, (this.aClass73_Sub1_1.anInt3083 & 0x7) != 0, (this.aClass73_Sub1_1.anInt3083 & 0x8) != 0);
		if (this.aClass4_Sub1_29.aBoolean28) {
			this.aClass4_Sub1_29.method4254(Integer.MAX_VALUE, this.anInt4745, this.anInt4747);
		}
		this.aClass50_Sub1_1.method4322(local10.aByteArray57, local10.anInt4807);
		local186.glMatrixMode(5890);
		local186.glPushMatrix();
		local186.glScalef(1.0F / this.aFloat68, 1.0F / this.aFloat68, 1.0F);
		local186.glMatrixMode(5888);
		this.aClass4_Sub1_29.method584(this.aClass73_Sub1_1.aClass81_8, this.aClass73_Sub1_1.aClass81_11, this.aClass81_12, this.aClass73_Sub1_1.aClass81_10);
		this.aClass4_Sub1_29.method567(this.aClass50_Sub1_1, 0, local1);
		local186.glMatrixMode(5890);
		local186.glPopMatrix();
		local186.glMatrixMode(5888);
	}
}
