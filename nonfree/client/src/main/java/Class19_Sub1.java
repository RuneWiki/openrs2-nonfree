import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!al", name = "z", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_3;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "Lclient!iq;")
	private final Class53_Sub2_Sub1 aClass53_Sub2_Sub1_1;

	@OriginalMember(owner = "client!al", name = "B", descriptor = "Z")
	private final boolean aBoolean25;

	@OriginalMember(owner = "client!al", name = "A", descriptor = "Lclient!up;")
	private final Class358 aClass358_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!pq;Lclient!hw;[Lclient!fm;Z)V")
	public Class19_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class112[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass132_Sub3_3 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class112 local15 = arg2[local10];
			if (local15.anInt2740 > local8) {
				local8 = local15.anInt2740;
			}
			if (local15.anInt2743 > local8) {
				local8 = local15.anInt2743;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class112 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt2740;
			local57 = local51.anInt2743;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray30 == null) {
				local83 = local51.aByteArray31;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray30;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass53_Sub2_Sub1_1 = Static655.method8906(local37, local44, arg0, local37);
		this.aBoolean25 = true;
		this.aClass53_Sub2_Sub1_1.method8287(false);
		this.aClass358_1 = new Class358(arg0, 256);
		@Pc(334) float local334 = this.aClass53_Sub2_Sub1_1.aFloat31 / (float) this.aClass53_Sub2_Sub1_1.anInt4464;
		@Pc(343) float local343 = this.aClass53_Sub2_Sub1_1.aFloat32 / (float) this.aClass53_Sub2_Sub1_1.anInt4466;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class112 local350 = arg2[local345];
			local57 = local350.anInt2740;
			local63 = local350.anInt2743;
			local69 = local350.anInt2741;
			local75 = local350.anInt2745;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass358_1.method8419(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass53_Sub2_Sub1_1.aFloat32 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass53_Sub2_Sub1_1.aFloat32 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass53_Sub2_Sub1_1.aFloat32 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass53_Sub2_Sub1_1.aFloat32 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass358_1.method8417();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6337(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) Class53_Sub2_Sub1 local5 = local2.aClass53_Sub2_Sub1_2;
		this.aClass132_Sub3_3.method6752();
		this.aClass132_Sub3_3.method6759(this.aClass53_Sub2_Sub1_1);
		if (this.aBoolean25 || arg4) {
			this.aClass132_Sub3_3.method6770(8448, 7681);
			this.aClass132_Sub3_3.method6763(0, 768, 34168);
		} else {
			this.aClass132_Sub3_3.method6770(7681, 7681);
		}
		this.aClass132_Sub3_3.method6802(1);
		this.aClass132_Sub3_3.method6759(local5);
		this.aClass132_Sub3_3.method6770(8448, 7681);
		this.aClass132_Sub3_3.method6763(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat31 / (float) local5.anInt4464;
		@Pc(85) float local85 = local5.aFloat32 / (float) local5.anInt4466;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass358_1.method8418(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass132_Sub3_3.method6763(0, 768, 5890);
		this.aClass132_Sub3_3.method6770(8448, 8448);
		this.aClass132_Sub3_3.method6759((Class53) null);
		this.aClass132_Sub3_3.method6802(0);
		if (this.aBoolean25 || arg4) {
			this.aClass132_Sub3_3.method6763(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!al", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass132_Sub3_3.method6752();
		this.aClass132_Sub3_3.method6759(this.aClass53_Sub2_Sub1_1);
		if (this.aBoolean25 || arg4) {
			this.aClass132_Sub3_3.method6770(8448, 7681);
			this.aClass132_Sub3_3.method6763(0, 768, 34168);
		} else {
			this.aClass132_Sub3_3.method6770(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass358_1.method8418(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean25 || arg4) {
			this.aClass132_Sub3_3.method6763(0, 768, 5890);
		}
	}
}
