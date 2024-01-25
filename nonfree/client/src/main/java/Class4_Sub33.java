import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!bb;")
	private Class19 aClass19_9;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "Lclient!ge;")
	private final Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	private final int anInt4764;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_24;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	private final int anInt4762;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
	private final int anInt4763;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "[I")
	private final int[] anIntArray385;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "F")
	private final float aFloat43;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!ge;IIII)V")
	public Class4_Sub33(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass26_Sub1_1 = arg0;
		this.anInt4764 = arg3;
		this.aClass92_Sub2_24 = this.aClass26_Sub1_1.aClass92_Sub2_11;
		this.anInt4762 = arg1;
		this.anInt4763 = arg4;
		this.anIntArray385 = new int[this.aClass26_Sub1_1.anInt5936 * this.aClass26_Sub1_1.anInt5941];
		this.aFloat43 = arg2;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIFI)V")
	public void method3900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21;
		@Pc(39) int local39;
		if (this.anInt4762 != -1) {
			@Pc(16) Class135 local16 = this.aClass92_Sub2_24.anInterface1_6.method5634(this.anInt4762);
			local21 = local16.aByte53 & 0xFF;
			@Pc(60) int local60;
			if (local21 != 0 && local16.aByte49 != 4) {
				if (arg1 < 0) {
					local39 = 0;
				} else if (arg1 > 127) {
					local39 = 16777215;
				} else {
					local39 = arg1 * 131586;
				}
				if (local21 == 256) {
					arg0 = local39;
				} else {
					local60 = 256 - local21;
					arg0 = ((arg0 & 0xFF00) * local60 + local21 * (local39 & 0xFF00) & 0xFF0000) + (local60 * (arg0 & 0xFF00FF) + local21 * (local39 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local39 = local16.aByte52 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(110) int local110 = local39 * (arg0 >> 16 & 0xFF);
				if (local110 > 65535) {
					local110 = 65535;
				}
				local60 = local39 * (arg0 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(135) int local135 = local39 * (arg0 & 0xFF);
				if (local135 > 65535) {
					local135 = 65535;
				}
				arg0 = (local60 & 0xFF00) + ((local110 & 0xD700FF00) << 8) + (local135 >> 8);
			}
		}
		this.aByteBuffer6.position(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(172) int local172 = arg0 >> 16 & 0xFF;
			local21 = arg0 >> 8 & 0xFF;
			local39 = arg0 & 0xFF;
			local172 = (int) ((float) local172 * arg2);
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			local21 = (int) ((float) local21 * arg2);
			local39 = (int) ((float) local39 * arg2);
			if (local21 < 0) {
				local21 = 0;
			} else if (local21 > 255) {
				local21 = 255;
			}
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg0 = local39 | local21 << 8 | local172 << 16;
		}
		this.aByteBuffer6.put((byte) (arg0 >> 16));
		this.aByteBuffer6.put((byte) (arg0 >> 8));
		this.aByteBuffer6.put((byte) arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	public void method3901(@OriginalArg(1) int arg0) {
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	public void method3902(@OriginalArg(1) int arg0) {
		this.aByteBuffer6.position(arg0 * 4);
		this.aByteBuffer6.flip();
		@Pc(26) Interface6 local26 = this.aClass92_Sub2_24.method4552(0, this.aByteBuffer6);
		this.aClass19_9 = new Class19(this.aClass92_Sub2_24, local26, 5121, 4, 0);
		this.aByteBuffer6 = null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V")
	public void method3903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray385[arg2 * this.aClass26_Sub1_1.anInt5941 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([III)V")
	public void method3904(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		Static99.aClass4_Sub7_1.anInt2667 = 0;
		@Pc(8) int local8 = 0;
		@Pc(32) short[] local32;
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(14) int local14;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.aClass92_Sub2_24.aBoolean459) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local26 = this.anIntArray385[local21];
				local32 = this.aClass26_Sub1_1.aShortArrayArray4[local21];
				if (local26 != 0 && local32 != null) {
					local42 = 0;
					local44 = 0;
					while (local44 < local32.length) {
						if ((0x1 << local42++ & local26) == 0) {
							local44 += 3;
						} else {
							local8++;
							Static99.aClass4_Sub7_1.method2376(local32[local44++]);
							local8++;
							Static99.aClass4_Sub7_1.method2376(local32[local44++]);
							local8++;
							Static99.aClass4_Sub7_1.method2376(local32[local44++]);
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local26 = this.anIntArray385[local21];
				local32 = this.aClass26_Sub1_1.aShortArrayArray4[local21];
				if (local26 != 0 && local32 != null) {
					local42 = 0;
					local44 = 0;
					while (local44 < local32.length) {
						if ((local26 & 0x1 << local42++) == 0) {
							local44 += 3;
						} else {
							Static99.aClass4_Sub7_1.method2400(local32[local44++]);
							local8++;
							Static99.aClass4_Sub7_1.method2400(local32[local44++]);
							local8++;
							local8++;
							Static99.aClass4_Sub7_1.method2400(local32[local44++]);
						}
					}
				}
			}
		}
		if (local8 <= 0) {
			return;
		}
		@Pc(183) opengl local183 = this.aClass92_Sub2_24.anOpengl2;
		this.aClass92_Sub2_24.method4598(this.anInt4762, (this.aClass26_Sub1_1.anInt2240 & 0x7) != 0, (this.aClass26_Sub1_1.anInt2240 & 0x8) != 0);
		if (this.aClass92_Sub2_24.aBoolean458) {
			this.aClass92_Sub2_24.method4493(Integer.MAX_VALUE, this.anInt4764, this.anInt4763);
		}
		this.aClass92_Sub2_24.anInterface3_4.method4363(Static99.aClass4_Sub7_1.aByteArray42, Static99.aClass4_Sub7_1.anInt2667);
		local183.glMatrixMode(5890);
		local183.glPushMatrix();
		local183.glScalef(1.0F / this.aFloat43, 1.0F / this.aFloat43, 1.0F);
		local183.glMatrixMode(5888);
		this.aClass92_Sub2_24.method4595(this.aClass19_9);
		this.aClass92_Sub2_24.method4553(this.aClass26_Sub1_1.aClass19_1);
		this.aClass92_Sub2_24.method4618(0, this.aClass26_Sub1_1.aClass19_3);
		if ((this.aClass26_Sub1_1.anInt2240 & 0x7) == 0) {
			this.aClass92_Sub2_24.method4607(false);
		} else {
			this.aClass92_Sub2_24.method4584(this.aClass26_Sub1_1.aClass19_2);
			this.aClass92_Sub2_24.method4607(true);
		}
		if (this.aClass26_Sub1_1.aClass19_4 != null) {
			this.aClass92_Sub2_24.method4618(1, this.aClass26_Sub1_1.aClass19_4);
		}
		this.aClass92_Sub2_24.method4601();
		this.aClass92_Sub2_24.method4557(this.aClass92_Sub2_24.anInterface3_4, 0, local8);
		local183.glMatrixMode(5890);
		local183.glPopMatrix();
		local183.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V")
	public void method3905(@OriginalArg(1) int arg0) {
		this.aByteBuffer6.position(arg0 * 4 + 3);
		this.aByteBuffer6.put((byte) -1);
	}
}
