import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!bka", name = "z", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_3;

	@OriginalMember(owner = "client!bka", name = "C", descriptor = "Lclient!cw;")
	private final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bka", name = "y", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!bka", name = "B", descriptor = "Lclient!oi;")
	private final Class261 aClass261_1;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!qfa;Lclient!ie;[Lclient!us;Z)V")
	public Class38_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class356[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass137_Sub3_3 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class356 local15 = arg2[local10];
			if (local15.anInt10343 > local8) {
				local8 = local15.anInt10343;
			}
			if (local15.anInt10341 > local8) {
				local8 = local15.anInt10341;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class356 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt10343;
			local57 = local51.anInt10341;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray126 == null) {
				local83 = local51.aByteArray127;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray126;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass66_Sub1_Sub1_1 = Static598.method8450(local37, arg0, local37, local44);
		this.aBoolean100 = true;
		this.aClass66_Sub1_Sub1_1.method6848(false);
		this.aClass261_1 = new Class261(arg0, 256);
		@Pc(334) float local334 = this.aClass66_Sub1_Sub1_1.aFloat52 / (float) this.aClass66_Sub1_Sub1_1.anInt1954;
		@Pc(343) float local343 = this.aClass66_Sub1_Sub1_1.aFloat53 / (float) this.aClass66_Sub1_Sub1_1.anInt1950;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class356 local350 = arg2[local345];
			local57 = local350.anInt10343;
			local63 = local350.anInt10341;
			local69 = local350.anInt10342;
			local75 = local350.anInt10340;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass261_1.method6286(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass66_Sub1_Sub1_1.aFloat53 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass66_Sub1_Sub1_1.aFloat53 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass66_Sub1_Sub1_1.aFloat53 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass66_Sub1_Sub1_1.aFloat53 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass261_1.method6287();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8986(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) Class66_Sub1_Sub1 local5 = local2.aClass66_Sub1_Sub1_5;
		this.aClass137_Sub3_3.method7050();
		this.aClass137_Sub3_3.method7090(this.aClass66_Sub1_Sub1_1);
		if (this.aBoolean100 || arg4) {
			this.aClass137_Sub3_3.method7084(8448, 7681);
			this.aClass137_Sub3_3.method7071(34168, 768, 0);
		} else {
			this.aClass137_Sub3_3.method7084(7681, 7681);
		}
		this.aClass137_Sub3_3.method7095(1);
		this.aClass137_Sub3_3.method7090(local5);
		this.aClass137_Sub3_3.method7084(8448, 7681);
		this.aClass137_Sub3_3.method7071(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat52 / (float) local5.anInt1954;
		@Pc(85) float local85 = local5.aFloat53 / (float) local5.anInt1950;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass261_1.method6285(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass137_Sub3_3.method7071(5890, 768, 0);
		this.aClass137_Sub3_3.method7084(8448, 8448);
		this.aClass137_Sub3_3.method7090((Class66) null);
		this.aClass137_Sub3_3.method7095(0);
		if (this.aBoolean100 || arg4) {
			this.aClass137_Sub3_3.method7071(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!bka", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass137_Sub3_3.method7050();
		this.aClass137_Sub3_3.method7090(this.aClass66_Sub1_Sub1_1);
		if (this.aBoolean100 || arg4) {
			this.aClass137_Sub3_3.method7084(8448, 7681);
			this.aClass137_Sub3_3.method7071(34168, 768, 0);
		} else {
			this.aClass137_Sub3_3.method7084(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass261_1.method6285(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean100 || arg4) {
			this.aClass137_Sub3_3.method7071(5890, 768, 0);
		}
	}
}
