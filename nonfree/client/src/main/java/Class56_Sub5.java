import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class56_Sub5 extends Class56 {

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_35;

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "Lclient!qt;")
	private final Class116_Sub2_Sub1 aClass116_Sub2_Sub1_5;

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "Z")
	private final boolean aBoolean731;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "Lclient!pia;")
	private final Class283 aClass283_6;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!pc;Lclient!bq;[Lclient!cr;Z)V")
	public Class56_Sub5(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class51[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass33_Sub3_35 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class51 local15 = arg2[local10];
			if (local15.anInt1657 > local8) {
				local8 = local15.anInt1657;
			}
			if (local15.anInt1661 > local8) {
				local8 = local15.anInt1661;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class51 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt1657;
			local57 = local51.anInt1661;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray22 == null) {
				local83 = local51.aByteArray23;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray22;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass116_Sub2_Sub1_5 = Static597.method7836(arg0, local37, local44, local37);
		this.aBoolean731 = true;
		this.aClass116_Sub2_Sub1_5.method8346(false);
		this.aClass283_6 = new Class283(arg0, 256);
		@Pc(334) float local334 = this.aClass116_Sub2_Sub1_5.aFloat190 / (float) this.aClass116_Sub2_Sub1_5.anInt7879;
		@Pc(343) float local343 = this.aClass116_Sub2_Sub1_5.aFloat189 / (float) this.aClass116_Sub2_Sub1_5.anInt7883;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class51 local350 = arg2[local345];
			local57 = local350.anInt1657;
			local63 = local350.anInt1661;
			local69 = local350.anInt1662;
			local75 = local350.anInt1659;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass283_6.method6455(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass116_Sub2_Sub1_5.aFloat189 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass116_Sub2_Sub1_5.aFloat189 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass116_Sub2_Sub1_5.aFloat189 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass116_Sub2_Sub1_5.aFloat189 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass283_6.method6454();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) Class116_Sub2_Sub1 local5 = local2.aClass116_Sub2_Sub1_1;
		this.aClass33_Sub3_35.method6359();
		this.aClass33_Sub3_35.method6340(this.aClass116_Sub2_Sub1_5);
		if (this.aBoolean731 || arg4) {
			this.aClass33_Sub3_35.method6365(8448, 7681);
			this.aClass33_Sub3_35.method6307(34168, 0, 768);
		} else {
			this.aClass33_Sub3_35.method6365(7681, 7681);
		}
		this.aClass33_Sub3_35.method6329(1);
		this.aClass33_Sub3_35.method6340(local5);
		this.aClass33_Sub3_35.method6365(8448, 7681);
		this.aClass33_Sub3_35.method6307(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat190 / (float) local5.anInt7879;
		@Pc(85) float local85 = local5.aFloat189 / (float) local5.anInt7883;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass283_6.method6453(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass33_Sub3_35.method6307(5890, 0, 768);
		this.aClass33_Sub3_35.method6365(8448, 8448);
		this.aClass33_Sub3_35.method6340((Class116) null);
		this.aClass33_Sub3_35.method6329(0);
		if (this.aBoolean731 || arg4) {
			this.aClass33_Sub3_35.method6307(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!ur", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass33_Sub3_35.method6359();
		this.aClass33_Sub3_35.method6340(this.aClass116_Sub2_Sub1_5);
		if (this.aBoolean731 || arg4) {
			this.aClass33_Sub3_35.method6365(8448, 7681);
			this.aClass33_Sub3_35.method6307(34168, 0, 768);
		} else {
			this.aClass33_Sub3_35.method6365(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass283_6.method6453(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean731 || arg4) {
			this.aClass33_Sub3_35.method6307(5890, 0, 768);
		}
	}
}
