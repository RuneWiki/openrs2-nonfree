import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!jm;")
	private Class110 aClass110_7;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!wh;")
	private final Class106_Sub2 aClass106_Sub2_2;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_29;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	private final int anInt4724;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	private final int anInt4725;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	private final int anInt4723;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "F")
	private final float aFloat75;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
	private final int[] anIntArray511;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!wh;IIII)V")
	public Class6_Sub31(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass106_Sub2_2 = arg0;
		this.aClass81_Sub1_29 = this.aClass106_Sub2_2.aClass81_Sub1_40;
		this.anInt4724 = arg3;
		this.anInt4725 = arg1;
		this.anInt4723 = arg4;
		this.aFloat75 = arg2;
		this.anIntArray511 = new int[this.aClass106_Sub2_2.anInt6271 * this.aClass106_Sub2_2.anInt6277];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
	public void method4355(@OriginalArg(0) int arg0) {
		this.aByteBuffer5.position(arg0 * 4 + 3);
		this.aByteBuffer5.put((byte) -1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IB)V")
	public void method4356(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		Static347.aClass6_Sub10_8.anInt4188 = 0;
		@Pc(4) int local4 = 0;
		@Pc(28) short[] local28;
		@Pc(17) int local17;
		@Pc(22) int local22;
		@Pc(10) int local10;
		@Pc(39) int local39;
		@Pc(41) int local41;
		if (this.aClass81_Sub1_29.aBoolean156) {
			for (local10 = 0; local10 < arg0; local10++) {
				local17 = arg1[local10];
				local22 = this.anIntArray511[local17];
				local28 = this.aClass106_Sub2_2.aShortArrayArray61[local17];
				if (local22 != 0 && local28 != null) {
					local39 = 0;
					local41 = 0;
					while (local28.length > local41) {
						if ((0x1 << local39++ & local22) == 0) {
							local41 += 3;
						} else {
							local4++;
							Static347.aClass6_Sub10_8.method4025(local28[local41++]);
							local4++;
							Static347.aClass6_Sub10_8.method4025(local28[local41++]);
							Static347.aClass6_Sub10_8.method4025(local28[local41++]);
							local4++;
						}
					}
				}
			}
		} else {
			for (local10 = 0; local10 < arg0; local10++) {
				local17 = arg1[local10];
				local22 = this.anIntArray511[local17];
				local28 = this.aClass106_Sub2_2.aShortArrayArray61[local17];
				if (local22 != 0 && local28 != null) {
					local39 = 0;
					local41 = 0;
					while (local41 < local28.length) {
						if ((0x1 << local39++ & local22) == 0) {
							local41 += 3;
						} else {
							local4++;
							Static347.aClass6_Sub10_8.method4002(local28[local41++]);
							local4++;
							Static347.aClass6_Sub10_8.method4002(local28[local41++]);
							Static347.aClass6_Sub10_8.method4002(local28[local41++]);
							local4++;
						}
					}
				}
			}
		}
		if (local4 <= 0) {
			return;
		}
		@Pc(174) opengl local174 = this.aClass81_Sub1_29.anOpengl1;
		this.aClass81_Sub1_29.method2017(this.anInt4725, (this.aClass106_Sub2_2.anInt6280 & 0x7) != 0, (this.aClass106_Sub2_2.anInt6280 & 0x8) != 0);
		if (this.aClass81_Sub1_29.aBoolean136) {
			this.aClass81_Sub1_29.method2998(Integer.MAX_VALUE, this.anInt4724, this.anInt4723);
		}
		this.aClass81_Sub1_29.anInterface4_2.method5115(Static347.aClass6_Sub10_8.aByteArray67, Static347.aClass6_Sub10_8.anInt4188);
		local174.glMatrixMode(5890);
		local174.glPushMatrix();
		local174.glScalef(1.0F / this.aFloat75, 1.0F / this.aFloat75, 1.0F);
		local174.glMatrixMode(5888);
		this.aClass81_Sub1_29.method1950(this.aClass110_7);
		this.aClass81_Sub1_29.method1996(this.aClass106_Sub2_2.aClass110_18);
		this.aClass81_Sub1_29.method1998(0, this.aClass106_Sub2_2.aClass110_14);
		if ((this.aClass106_Sub2_2.anInt6280 & 0x7) == 0) {
			this.aClass81_Sub1_29.method2004(false);
		} else {
			this.aClass81_Sub1_29.method2018(this.aClass106_Sub2_2.aClass110_16);
			this.aClass81_Sub1_29.method2004(true);
		}
		if (this.aClass106_Sub2_2.aClass110_17 != null) {
			this.aClass81_Sub1_29.method1998(1, this.aClass106_Sub2_2.aClass110_17);
		}
		this.aClass81_Sub1_29.method1971();
		this.aClass81_Sub1_29.method1973(this.aClass81_Sub1_29.anInterface4_2, 0, local4);
		local174.glMatrixMode(5890);
		local174.glPopMatrix();
		local174.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	public void method4357(@OriginalArg(0) int arg0) {
		this.aByteBuffer5.position(arg0 * 4);
		this.aByteBuffer5.flip();
		@Pc(18) Interface8 local18 = this.aClass81_Sub1_29.method2024(0, this.aByteBuffer5);
		this.aClass110_7 = new Class110(this.aClass81_Sub1_29, local18, 5121, 4, 0);
		this.aByteBuffer5 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIF)V")
	public void method4358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(17) int local17;
		@Pc(33) int local33;
		if (this.anInt4725 != -1) {
			@Pc(12) Class82 local12 = this.aClass81_Sub1_29.anInterface2_2.method346(this.anInt4725);
			local17 = local12.aByte24 & 0xFF;
			@Pc(58) int local58;
			if (local17 != 0 && local12.aByte27 != 4) {
				if (arg2 < 0) {
					local33 = 0;
				} else if (arg2 > 127) {
					local33 = 16777215;
				} else {
					local33 = arg2 * 131586;
				}
				if (local17 == 256) {
					arg0 = local33;
				} else {
					local58 = 256 - local17;
					arg0 = ((arg0 & 0xFF00) * local58 + (local33 & 0xFF00) * local17 & 0xFF0000) + (local58 * (arg0 & 0xFF00FF) + (local33 & 0xFF00FF) * local17 & 0xFF00FF00) >> 8;
				}
			}
			local33 = local12.aByte28 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(107) int local107 = local33 * (arg0 >> 16 & 0xFF);
				if (local107 > 65535) {
					local107 = 65535;
				}
				local58 = local33 * (arg0 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(132) int local132 = (arg0 & 0xFF) * local33;
				if (local132 > 65535) {
					local132 = 65535;
				}
				arg0 = (local132 >> 8) + ((local107 & 0xE600FF00) << 8) + (local58 & 0xFF00);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(162) int local162 = arg0 >> 16 & 0xFF;
			local17 = arg0 >> 8 & 0xFF;
			local162 = (int) ((float) local162 * arg3);
			local33 = arg0 & 0xFF;
			if (local162 < 0) {
				local162 = 0;
			} else if (local162 > 255) {
				local162 = 255;
			}
			local17 = (int) ((float) local17 * arg3);
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 255) {
				local17 = 255;
			}
			local33 = (int) ((float) local33 * arg3);
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg0 = local17 << 8 | local162 << 16 | local33;
		}
		this.aByteBuffer5.position(arg1 * 4);
		this.aByteBuffer5.put((byte) (arg0 >> 16));
		this.aByteBuffer5.put((byte) (arg0 >> 8));
		this.aByteBuffer5.put((byte) arg0);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
	public void method4359(@OriginalArg(0) int arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
	public void method4360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray511[arg0 + arg1 * this.aClass106_Sub2_2.anInt6271] |= 0x1 << arg2;
	}
}
