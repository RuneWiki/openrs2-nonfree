import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!kr;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "Lclient!sb;")
	private final Class22_Sub2 aClass22_Sub2_2;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
	private final int anInt1659;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "F")
	private final float aFloat5;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
	private final int[] anIntArray99;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	private final int anInt1657;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_8;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
	private final int anInt1658;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!sb;IIII)V")
	public Class3_Sub16(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass22_Sub2_2 = arg0;
		this.anInt1659 = arg4;
		this.aFloat5 = arg2;
		this.anIntArray99 = new int[this.aClass22_Sub2_2.anInt5577 * this.aClass22_Sub2_2.anInt5574];
		this.anInt1657 = arg1;
		this.aClass122_Sub2_8 = this.aClass22_Sub2_2.aClass122_Sub2_38;
		this.anInt1658 = arg3;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
	public void method1309(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0 * 4 + 3);
		this.aByteBuffer1.put((byte) -1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IFIII)V")
	public void method1310(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17;
		@Pc(38) int local38;
		if (this.anInt1657 != -1) {
			@Pc(12) Class171 local12 = this.aClass122_Sub2_8.anInterface9_5.method2396(this.anInt1657);
			local17 = local12.aByte53 & 0xFF;
			@Pc(54) int local54;
			if (local17 != 0 && local12.aByte57 != 4) {
				if (arg0 < 0) {
					local38 = 0;
				} else if (arg0 <= 127) {
					local38 = arg0 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local17 == 256) {
					arg3 = local38;
				} else {
					local54 = 256 - local17;
					arg3 = (local17 * (local38 & 0xFF00) + local54 * (arg3 & 0xFF00) & 0xFF0000) + ((arg3 & 0xFF00FF) * local54 + local17 * (local38 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local38 = local12.aByte54 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(107) int local107 = (arg3 >> 16 & 0xFF) * local38;
				if (local107 > 65535) {
					local107 = 65535;
				}
				local54 = local38 * (arg3 >> 8 & 0xFF);
				if (local54 > 65535) {
					local54 = 65535;
				}
				@Pc(135) int local135 = local38 * (arg3 & 0xFF);
				if (local135 > 65535) {
					local135 = 65535;
				}
				arg3 = (local135 >> 8) + ((local107 << 8 & 0xFF00EC) + (local54 & 0xFF00));
			}
		}
		this.aByteBuffer1.position(arg2 * 4);
		if (arg1 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local17 = arg3 >> 8 & 0xFF;
			local38 = arg3 & 0xFF;
			local176 = (int) ((float) local176 * arg1);
			local17 = (int) ((float) local17 * arg1);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local38 = (int) ((float) local38 * arg1);
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 255) {
				local17 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg3 = local176 << 16 | local17 << 8 | local38;
		}
		this.aByteBuffer1.put((byte) (arg3 >> 16));
		this.aByteBuffer1.put((byte) (arg3 >> 8));
		this.aByteBuffer1.put((byte) arg3);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
	public void method1311(@OriginalArg(0) int arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([III)V")
	public void method1312(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		Static280.aClass3_Sub4_8.anInt4268 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(19) int local19;
		@Pc(44) int local44;
		@Pc(46) int local46;
		if (this.aClass122_Sub2_8.aBoolean363) {
			for (local19 = 0; local19 < arg1; local19++) {
				local26 = arg0[local19];
				local32 = this.aClass22_Sub2_2.aShortArrayArray6[local26];
				local37 = this.anIntArray99[local26];
				if (local37 != 0 && local32 != null) {
					local44 = 0;
					local46 = 0;
					while (local46 < local32.length) {
						if ((0x1 << local44++ & local37) == 0) {
							local46 += 3;
						} else {
							local1++;
							Static280.aClass3_Sub4_8.method3660(local32[local46++]);
							local1++;
							Static280.aClass3_Sub4_8.method3660(local32[local46++]);
							Static280.aClass3_Sub4_8.method3660(local32[local46++]);
							local1++;
						}
					}
				}
			}
		} else {
			for (local19 = 0; local19 < arg1; local19++) {
				local26 = arg0[local19];
				local32 = this.aClass22_Sub2_2.aShortArrayArray6[local26];
				local37 = this.anIntArray99[local26];
				if (local37 != 0 && local32 != null) {
					local44 = 0;
					local46 = 0;
					while (local46 < local32.length) {
						if ((0x1 << local44++ & local37) == 0) {
							local46 += 3;
						} else {
							Static280.aClass3_Sub4_8.method3616(local32[local46++]);
							local1++;
							local1++;
							Static280.aClass3_Sub4_8.method3616(local32[local46++]);
							local1++;
							Static280.aClass3_Sub4_8.method3616(local32[local46++]);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(168) opengl local168 = this.aClass122_Sub2_8.anOpengl2;
		this.aClass122_Sub2_8.method4868(this.anInt1657, (this.aClass22_Sub2_2.anInt5582 & 0x7) != 0, (this.aClass22_Sub2_2.anInt5582 & 0x8) != 0);
		if (this.aClass122_Sub2_8.aBoolean359) {
			this.aClass122_Sub2_8.method4805(Integer.MAX_VALUE, this.anInt1658, this.anInt1659);
		}
		this.aClass122_Sub2_8.anInterface8_5.method5257(Static280.aClass3_Sub4_8.aByteArray70, Static280.aClass3_Sub4_8.anInt4268);
		local168.glMatrixMode(5890);
		local168.glPushMatrix();
		local168.glScalef(1.0F / this.aFloat5, 1.0F / this.aFloat5, 1.0F);
		local168.glMatrixMode(5888);
		this.aClass122_Sub2_8.method4851(this.aClass117_1);
		this.aClass122_Sub2_8.method4832(this.aClass22_Sub2_2.aClass117_13);
		this.aClass122_Sub2_8.method4827(0, this.aClass22_Sub2_2.aClass117_14);
		if ((this.aClass22_Sub2_2.anInt5582 & 0x7) == 0) {
			this.aClass122_Sub2_8.method4880(false);
		} else {
			this.aClass122_Sub2_8.method4835(this.aClass22_Sub2_2.aClass117_12);
			this.aClass122_Sub2_8.method4880(true);
		}
		if (this.aClass22_Sub2_2.aClass117_15 != null) {
			this.aClass122_Sub2_8.method4827(1, this.aClass22_Sub2_2.aClass117_15);
		}
		this.aClass122_Sub2_8.method4879();
		this.aClass122_Sub2_8.method4840(this.aClass122_Sub2_8.anInterface8_5, 0, local1);
		local168.glMatrixMode(5890);
		local168.glPopMatrix();
		local168.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V")
	public void method1313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray99[arg2 + arg0 * this.aClass22_Sub2_2.anInt5574] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)V")
	public void method1314(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0 * 4);
		this.aByteBuffer1.flip();
		@Pc(22) Interface6 local22 = this.aClass122_Sub2_8.method4853(0, this.aByteBuffer1);
		this.aClass117_1 = new Class117(this.aClass122_Sub2_8, local22, 5121, 4, 0);
		this.aByteBuffer1 = null;
	}
}
