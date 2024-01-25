import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_12;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "Lclient!bo;")
	private final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!ee;")
	private final Class93 aClass93_2;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!kv;Lclient!kf;[Lclient!re;Z)V")
	public Class72_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class301[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass143_Sub2_12 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class301 local15 = arg2[local10];
			if (local15.anInt8497 > local8) {
				local8 = local15.anInt8497;
			}
			if (local15.anInt8501 > local8) {
				local8 = local15.anInt8501;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class301 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt8497;
			local57 = local51.anInt8501;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray81 == null) {
				local83 = local51.aByteArray82;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray81;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass44_Sub1_Sub1_1 = Static387.method5664(local37, local44, arg0, local37);
		this.aBoolean115 = true;
		this.aClass44_Sub1_Sub1_1.method6706(false);
		this.aClass93_2 = new Class93(arg0, 256);
		@Pc(334) float local334 = this.aClass44_Sub1_Sub1_1.aFloat11 / (float) this.aClass44_Sub1_Sub1_1.anInt850;
		@Pc(343) float local343 = this.aClass44_Sub1_Sub1_1.aFloat12 / (float) this.aClass44_Sub1_Sub1_1.anInt848;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class301 local350 = arg2[local345];
			local57 = local350.anInt8497;
			local63 = local350.anInt8501;
			local69 = local350.anInt8499;
			local75 = local350.anInt8500;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass93_2.method1950(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass44_Sub1_Sub1_1.aFloat12 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass44_Sub1_Sub1_1.aFloat12 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass44_Sub1_Sub1_1.aFloat12 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass44_Sub1_Sub1_1.aFloat12 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass93_2.method1948();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6910(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) Class44_Sub1_Sub1 local5 = local2.aClass44_Sub1_Sub1_3;
		this.aClass143_Sub2_12.method4963();
		this.aClass143_Sub2_12.method4945(this.aClass44_Sub1_Sub1_1);
		if (this.aBoolean115 || arg4) {
			this.aClass143_Sub2_12.method4940(7681, 8448);
			this.aClass143_Sub2_12.method4947(768, 0, 34168);
		} else {
			this.aClass143_Sub2_12.method4940(7681, 7681);
		}
		this.aClass143_Sub2_12.method4930(1);
		this.aClass143_Sub2_12.method4945(local5);
		this.aClass143_Sub2_12.method4940(7681, 8448);
		this.aClass143_Sub2_12.method4947(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat11 / (float) local5.anInt850;
		@Pc(85) float local85 = local5.aFloat12 / (float) local5.anInt848;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass93_2.method1952(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass143_Sub2_12.method4947(768, 0, 5890);
		this.aClass143_Sub2_12.method4940(8448, 8448);
		this.aClass143_Sub2_12.method4945((Class44) null);
		this.aClass143_Sub2_12.method4930(0);
		if (this.aBoolean115 || arg4) {
			this.aClass143_Sub2_12.method4947(768, 0, 5890);
		}
	}

	@OriginalMember(owner = "client!dc", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass143_Sub2_12.method4963();
		this.aClass143_Sub2_12.method4945(this.aClass44_Sub1_Sub1_1);
		if (this.aBoolean115 || arg4) {
			this.aClass143_Sub2_12.method4940(7681, 8448);
			this.aClass143_Sub2_12.method4947(768, 0, 34168);
		} else {
			this.aClass143_Sub2_12.method4940(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass93_2.method1952(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean115 || arg4) {
			this.aClass143_Sub2_12.method4947(768, 0, 5890);
		}
	}
}
