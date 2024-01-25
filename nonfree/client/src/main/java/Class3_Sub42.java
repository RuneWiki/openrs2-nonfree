import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "Lclient!tp;")
	private Class225 aClass225_16;

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "Lclient!eh;")
	private final Class64_Sub1 aClass64_Sub1_3;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "[I")
	private final int[] anIntArray498;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "F")
	public final float aFloat94;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_43;

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
	public final int anInt7084;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
	public final int anInt7078;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
	public final int anInt7085;

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
	public final int anInt7081;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "Lclient!gi;")
	private final Class85_Sub1 aClass85_Sub1_2;

	static {
		new Class175("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!eh;IIIII)V")
	public Class3_Sub42(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass64_Sub1_3 = arg0;
		this.anIntArray498 = new int[this.aClass64_Sub1_3.anInt7006 * this.aClass64_Sub1_3.anInt7005];
		this.aFloat94 = arg2;
		this.aClass75_Sub2_43 = this.aClass64_Sub1_3.aClass75_Sub2_11;
		this.anInt7084 = arg5;
		this.anInt7078 = arg4;
		this.anInt7085 = arg1;
		this.anInt7081 = arg3;
		this.aClass85_Sub1_2 = new Class85_Sub1(this.aClass75_Sub2_43, 5123, null, 1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBI)V")
	public void method5494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray498[arg0 * this.aClass64_Sub1_3.anInt7006 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public void method5495(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b();
		@Pc(24) Interface5 local24 = this.aClass75_Sub2_43.method2438(4, this.aNativeBuffer4, arg0 * 4);
		this.aClass225_16 = new Class225(this.aClass75_Sub2_43, local24, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ[I)V")
	public void method5496(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class3_Sub2 local9 = Static82.aClass3_Sub2_5;
		local9.anInt7620 = 0;
		@Pc(35) short[] local35;
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(18) int local18;
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (this.aClass75_Sub2_43.aBoolean228) {
			for (local18 = 0; local18 < arg0; local18++) {
				local24 = arg1[local18];
				local35 = this.aClass64_Sub1_3.aShortArrayArray2[local24];
				local29 = this.anIntArray498[local24];
				if (local29 != 0 && local35 != null) {
					local41 = 0;
					local43 = 0;
					while (local43 < local35.length) {
						if ((0x1 << local41++ & local29) == 0) {
							local43 += 3;
						} else {
							local7++;
							local9.method6045(local35[local43++] & 0xFFFF);
							local7++;
							local9.method6045(local35[local43++] & 0xFFFF);
							local7++;
							local9.method6045(local35[local43++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg0; local18++) {
				local24 = arg1[local18];
				local29 = this.anIntArray498[local24];
				local35 = this.aClass64_Sub1_3.aShortArrayArray2[local24];
				if (local29 != 0 && local35 != null) {
					local41 = 0;
					local43 = 0;
					while (local35.length > local43) {
						if ((local29 & 0x1 << local41++) == 0) {
							local43 += 3;
						} else {
							local7++;
							local9.method6000(local35[local43++] & 0xFFFF);
							local7++;
							local9.method6000(local35[local43++] & 0xFFFF);
							local9.method6000(local35[local43++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass85_Sub1_2.method5470(local9.aByteArray95, local9.anInt7620);
		this.aClass75_Sub2_43.method2473(this.aClass64_Sub1_3.aClass225_7, this.aClass64_Sub1_3.aClass225_6, this.aClass225_16, this.aClass64_Sub1_3.aClass225_5);
		this.aClass75_Sub2_43.method2477((this.aClass64_Sub1_3.anInt1951 & 0x8) != 0, this.anInt7085, (this.aClass64_Sub1_3.anInt1951 & 0x7) != 0);
		if (this.aClass75_Sub2_43.aBoolean232) {
			this.aClass75_Sub2_43.ba(Integer.MAX_VALUE, this.anInt7081, this.anInt7078, this.anInt7084);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat94, 1.0F / this.aFloat94, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass75_Sub2_43.method2473(this.aClass64_Sub1_3.aClass225_7, this.aClass64_Sub1_3.aClass225_6, this.aClass225_16, this.aClass64_Sub1_3.aClass225_5);
		this.aClass75_Sub2_43.method2454(0, this.aClass85_Sub1_2, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V")
	public void method5497(@OriginalArg(1) int arg0) {
		this.aNativeBuffer4 = this.aClass75_Sub2_43.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public void method5499(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FIIII)V")
	public void method5500(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) int local25;
		@Pc(38) int local38;
		if (this.anInt7085 != -1) {
			@Pc(20) Class62 local20 = this.aClass75_Sub2_43.anInterface7_6.method2131(this.anInt7085);
			local25 = local20.aByte24 & 0xFF;
			@Pc(65) int local65;
			if (local25 != 0 && local20.aByte28 != 4) {
				if (arg3 < 0) {
					local38 = 0;
				} else if (arg3 > 127) {
					local38 = 16777215;
				} else {
					local38 = arg3 * 131586;
				}
				if (local25 == 256) {
					arg1 = local38;
				} else {
					local65 = 256 - local25;
					arg1 = ((local38 & 0xFF00) * local25 + local65 * (arg1 & 0xFF00) & 0xFF0000) + ((arg1 & 0xFF00FF) * local65 + (local38 & 0xFF00FF) * local25 & 0xFF00FF00) >> 8;
				}
			}
			local38 = local20.aByte27 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(119) int local119 = local38 * (arg1 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local65 = (arg1 >> 8 & 0xFF) * local38;
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(143) int local143 = (arg1 & 0xFF) * local38;
				if (local143 > 65535) {
					local143 = 65535;
				}
				arg1 = (local143 >> 8) + ((local119 & 0x6C00FF00) << 8) + (local65 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(178) int local178 = arg1 >> 16 & 0xFF;
			local25 = arg1 >> 8 & 0xFF;
			local178 = (int) ((float) local178 * arg0);
			local38 = arg1 & 0xFF;
			local25 = (int) ((float) local25 * arg0);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 255) {
				local25 = 255;
			}
			local38 = (int) ((float) local38 * arg0);
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg1 = local38 | local25 << 8 | local178 << 16;
		}
		this.aNativeStream1.b(arg2 * 4);
		this.aNativeStream1.a((byte) (arg1 >> 16));
		this.aNativeStream1.a((byte) (arg1 >> 8));
		this.aNativeStream1.a((byte) arg1);
	}
}
