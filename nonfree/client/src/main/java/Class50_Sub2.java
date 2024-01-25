import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_19;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "Lclient!iba;")
	private final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "Z")
	private final boolean aBoolean160;

	@OriginalMember(owner = "client!dp", name = "z", descriptor = "Lclient!jr;")
	private final Class164 aClass164_2;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!wh;Lclient!hia;[Lclient!fg;Z)V")
	public Class50_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class98[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass100_Sub3_19 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class98 local15 = arg2[local10];
			if (local15.anInt2799 > local8) {
				local8 = local15.anInt2799;
			}
			if (local15.anInt2796 > local8) {
				local8 = local15.anInt2796;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class98 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt2799;
			local57 = local51.anInt2796;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray44 == null) {
				local83 = local51.aByteArray45;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray44;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass3_Sub2_Sub1_1 = Static318.method5302(local37, local37, arg0, local44);
		this.aBoolean160 = true;
		this.aClass3_Sub2_Sub1_1.method5781(false);
		this.aClass164_2 = new Class164(arg0, 256);
		@Pc(334) float local334 = this.aClass3_Sub2_Sub1_1.aFloat73 / (float) this.aClass3_Sub2_Sub1_1.anInt4469;
		@Pc(343) float local343 = this.aClass3_Sub2_Sub1_1.aFloat74 / (float) this.aClass3_Sub2_Sub1_1.anInt4472;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class98 local350 = arg2[local345];
			local57 = local350.anInt2799;
			local63 = local350.anInt2796;
			local69 = local350.anInt2798;
			local75 = local350.anInt2797;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass164_2.method4791(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass3_Sub2_Sub1_1.aFloat74 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass3_Sub2_Sub1_1.aFloat74 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass3_Sub2_Sub1_1.aFloat74 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass3_Sub2_Sub1_1.aFloat74 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass164_2.method4790();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5738(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) Class3_Sub2_Sub1 local5 = local2.aClass3_Sub2_Sub1_2;
		this.aClass100_Sub3_19.method8897();
		this.aClass100_Sub3_19.method8925(this.aClass3_Sub2_Sub1_1);
		if (this.aBoolean160 || arg4) {
			this.aClass100_Sub3_19.method8880(8448, 7681);
			this.aClass100_Sub3_19.method8889(34168, 0, 768);
		} else {
			this.aClass100_Sub3_19.method8880(7681, 7681);
		}
		this.aClass100_Sub3_19.method8861(1);
		this.aClass100_Sub3_19.method8925(local5);
		this.aClass100_Sub3_19.method8880(8448, 7681);
		this.aClass100_Sub3_19.method8889(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat73 / (float) local5.anInt4469;
		@Pc(85) float local85 = local5.aFloat74 / (float) local5.anInt4472;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass164_2.method4788(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass100_Sub3_19.method8889(5890, 0, 768);
		this.aClass100_Sub3_19.method8880(8448, 8448);
		this.aClass100_Sub3_19.method8925((Class3) null);
		this.aClass100_Sub3_19.method8861(0);
		if (this.aBoolean160 || arg4) {
			this.aClass100_Sub3_19.method8889(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!dp", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub3_19.method8897();
		this.aClass100_Sub3_19.method8925(this.aClass3_Sub2_Sub1_1);
		if (this.aBoolean160 || arg4) {
			this.aClass100_Sub3_19.method8880(8448, 7681);
			this.aClass100_Sub3_19.method8889(34168, 0, 768);
		} else {
			this.aClass100_Sub3_19.method8880(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass164_2.method4788(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean160 || arg4) {
			this.aClass100_Sub3_19.method8889(5890, 0, 768);
		}
	}
}
