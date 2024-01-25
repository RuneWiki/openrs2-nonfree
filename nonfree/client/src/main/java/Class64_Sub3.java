import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class64_Sub3 extends Class64 {

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_31;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!m;")
	private final Class88_Sub2_Sub1 aClass88_Sub2_Sub1_5;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Z")
	private final boolean aBoolean609;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!eha;")
	private final Class91 aClass91_5;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!oea;Lclient!fp;[Lclient!fw;Z)V")
	public Class64_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class120[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass87_Sub2_31 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class120 local15 = arg2[local10];
			if (local15.anInt3707 > local8) {
				local8 = local15.anInt3707;
			}
			if (local15.anInt3710 > local8) {
				local8 = local15.anInt3710;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class120 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt3707;
			local57 = local51.anInt3710;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray35 == null) {
				local83 = local51.aByteArray36;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray35;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass88_Sub2_Sub1_5 = Static608.method2888(local44, local37, local37, arg0);
		this.aBoolean609 = true;
		this.aClass88_Sub2_Sub1_5.method6981(false);
		this.aClass91_5 = new Class91(arg0, 256);
		@Pc(334) float local334 = this.aClass88_Sub2_Sub1_5.aFloat153 / (float) this.aClass88_Sub2_Sub1_5.anInt6219;
		@Pc(343) float local343 = this.aClass88_Sub2_Sub1_5.aFloat152 / (float) this.aClass88_Sub2_Sub1_5.anInt6223;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class120 local350 = arg2[local345];
			local57 = local350.anInt3707;
			local63 = local350.anInt3710;
			local69 = local350.anInt3705;
			local75 = local350.anInt3708;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass91_5.method2499(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass88_Sub2_Sub1_5.aFloat152 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass88_Sub2_Sub1_5.aFloat152 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass88_Sub2_Sub1_5.aFloat152 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass88_Sub2_Sub1_5.aFloat152 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass91_5.method2495();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7507(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_3;
		this.aClass87_Sub2_31.method6172();
		this.aClass87_Sub2_31.method6167(this.aClass88_Sub2_Sub1_5);
		if (this.aBoolean609 || arg4) {
			this.aClass87_Sub2_31.method6227(7681, 8448);
			this.aClass87_Sub2_31.method6206(0, 768, 34168);
		} else {
			this.aClass87_Sub2_31.method6227(7681, 7681);
		}
		this.aClass87_Sub2_31.method6155(1);
		this.aClass87_Sub2_31.method6167(local5);
		this.aClass87_Sub2_31.method6227(7681, 8448);
		this.aClass87_Sub2_31.method6206(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat153 / (float) local5.anInt6219;
		@Pc(85) float local85 = local5.aFloat152 / (float) local5.anInt6223;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass91_5.method2497(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass87_Sub2_31.method6206(0, 768, 5890);
		this.aClass87_Sub2_31.method6227(8448, 8448);
		this.aClass87_Sub2_31.method6167(null);
		this.aClass87_Sub2_31.method6155(0);
		if (this.aBoolean609 || arg4) {
			this.aClass87_Sub2_31.method6206(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!qs", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass87_Sub2_31.method6172();
		this.aClass87_Sub2_31.method6167(this.aClass88_Sub2_Sub1_5);
		if (this.aBoolean609 || arg4) {
			this.aClass87_Sub2_31.method6227(7681, 8448);
			this.aClass87_Sub2_31.method6206(0, 768, 34168);
		} else {
			this.aClass87_Sub2_31.method6227(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass91_5.method2497(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean609 || arg4) {
			this.aClass87_Sub2_31.method6206(0, 768, 5890);
		}
	}
}
