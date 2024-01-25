import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!um", name = "t", descriptor = "Lclient!gs;")
	private Class100 aClass100_12;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!um", name = "E", descriptor = "Lclient!ui;")
	private final Class106_Sub2 aClass106_Sub2_3;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "I")
	public final int anInt7064;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "I")
	public final int anInt7071;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "[I")
	private final int[] anIntArray472;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_37;

	@OriginalMember(owner = "client!um", name = "C", descriptor = "F")
	public final float aFloat210;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "I")
	public final int anInt7061;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "I")
	public final int anInt7067;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "Lclient!hl;")
	private final Class53_Sub1 aClass53_Sub1_2;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!ui;IIIII)V")
	public Class2_Sub40(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass106_Sub2_3 = arg0;
		this.anInt7064 = arg1;
		this.anInt7071 = arg5;
		this.anIntArray472 = new int[this.aClass106_Sub2_3.anInt6999 * this.aClass106_Sub2_3.anInt7001];
		this.aClass26_Sub1_37 = this.aClass106_Sub2_3.aClass26_Sub1_35;
		this.aFloat210 = arg2;
		this.anInt7061 = arg3;
		this.anInt7067 = arg4;
		this.aClass53_Sub1_2 = new Class53_Sub1(this.aClass26_Sub1_37, 5123, null, 1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([III)V")
	public void method5516(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		@Pc(13) Class2_Sub20 local13 = Static188.aClass2_Sub20_3;
		local13.anInt4608 = 0;
		@Pc(39) short[] local39;
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(22) int local22;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass26_Sub1_37.aBoolean76) {
			for (local22 = 0; local22 < arg1; local22++) {
				local28 = arg0[local22];
				local33 = this.anIntArray472[local28];
				local39 = this.aClass106_Sub2_3.aShortArrayArray6[local28];
				if (local33 != 0 && local39 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local39.length) {
						if ((local33 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local13.method3745(local39[local50++] & 0xFFFF);
							local11++;
							local11++;
							local13.method3745(local39[local50++] & 0xFFFF);
							local11++;
							local13.method3745(local39[local50++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local22 = 0; local22 < arg1; local22++) {
				local28 = arg0[local22];
				local39 = this.aClass106_Sub2_3.aShortArrayArray6[local28];
				local33 = this.anIntArray472[local28];
				if (local33 != 0 && local39 != null) {
					local48 = 0;
					local50 = 0;
					while (local39.length > local50) {
						if ((local33 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local11++;
							local13.method3714(local39[local50++] & 0xFFFF);
							local13.method3714(local39[local50++] & 0xFFFF);
							local11++;
							local11++;
							local13.method3714(local39[local50++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass53_Sub1_2.method3583(local13.aByteArray136, local13.anInt4608);
		this.aClass26_Sub1_37.method668(this.aClass106_Sub2_3.aClass100_8, this.aClass106_Sub2_3.aClass100_11, this.aClass106_Sub2_3.aClass100_9, this.aClass100_12);
		this.aClass26_Sub1_37.method652(this.anInt7064, (this.aClass106_Sub2_3.anInt7024 & 0x8) != 0, (this.aClass106_Sub2_3.anInt7024 & 0x7) != 0);
		if (this.aClass26_Sub1_37.aBoolean69) {
			this.aClass26_Sub1_37.ba(Integer.MAX_VALUE, this.anInt7061, this.anInt7067, this.anInt7071);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat210, 1.0F / this.aFloat210, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass26_Sub1_37.method668(this.aClass106_Sub2_3.aClass100_8, this.aClass106_Sub2_3.aClass100_11, this.aClass106_Sub2_3.aClass100_9, this.aClass100_12);
		this.aClass26_Sub1_37.method664(0, local11, this.aClass53_Sub1_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public void method5518(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIF)V")
	public void method5520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(19) int local19;
		@Pc(36) int local36;
		if (this.anInt7064 != -1) {
			@Pc(14) Class178 local14 = this.aClass26_Sub1_37.anInterface8_5.method3836(this.anInt7064);
			local19 = local14.aByte57 & 0xFF;
			@Pc(58) int local58;
			if (local19 != 0 && local14.aByte59 != 4) {
				if (arg0 < 0) {
					local36 = 0;
				} else if (arg0 <= 127) {
					local36 = arg0 * 131586;
				} else {
					local36 = 16777215;
				}
				if (local19 == 256) {
					arg2 = local36;
				} else {
					local58 = 256 - local19;
					arg2 = ((arg2 & 0xFF00FF) * local58 + (local36 & 0xFF00FF) * local19 & 0xFF00FF00) + ((arg2 & 0xFF00) * local58 + local19 * (local36 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local36 = local14.aByte54 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(104) int local104 = local36 * (arg2 >> 16 & 0xFF);
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (arg2 >> 8 & 0xFF) * local36;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(130) int local130 = local36 * (arg2 & 0xFF);
				if (local130 > 65535) {
					local130 = 65535;
				}
				arg2 = (local130 >> 8) + (local104 << 8 & 0xFF000F) + (local58 & 0xFF00);
			}
		}
		this.aNativeStream1.a(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(179) int local179 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local179 = (int) ((float) local179 * arg3);
			local36 = arg2 & 0xFF;
			if (local179 < 0) {
				local179 = 0;
			} else if (local179 > 255) {
				local179 = 255;
			}
			local19 = (int) ((float) local19 * arg3);
			local36 = (int) ((float) local36 * arg3);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg2 = local19 << 8 | local179 << 16 | local36;
		}
		this.aNativeStream1.b((byte) (arg2 >> 16));
		this.aNativeStream1.b((byte) (arg2 >> 8));
		this.aNativeStream1.b((byte) arg2);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V")
	public void method5522(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass26_Sub1_37.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIB)V")
	public void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray472[arg0 + arg1 * this.aClass106_Sub2_3.anInt6999] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(II)V")
	public void method5524(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a();
		@Pc(18) Interface12 local18 = this.aClass26_Sub1_37.method648(arg0 * 4, 4, this.aNativeBuffer4);
		this.aClass100_12 = new Class100(this.aClass26_Sub1_37, local18, 5121, 4, 0);
		this.aNativeBuffer4 = null;
		this.aNativeStream1 = null;
	}
}
