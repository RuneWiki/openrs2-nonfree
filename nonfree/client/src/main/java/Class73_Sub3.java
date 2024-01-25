import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class73_Sub3 extends Class73 {

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_8;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "Lclient!rc;")
	private final Class80_Sub2_Sub1 aClass80_Sub2_Sub1_4;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "Lclient!nc;")
	private final Class243 aClass243_1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!ck;Lclient!ne;[Lclient!vi;Z)V")
	public Class73_Sub3(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) Class369[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass65_Sub1_8 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class369 local15 = arg2[local10];
			if (local15.anInt10307 > local8) {
				local8 = local15.anInt10307;
			}
			if (local15.anInt10309 > local8) {
				local8 = local15.anInt10309;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class369 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt10307;
			local57 = local51.anInt10309;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray103 == null) {
				local83 = local51.aByteArray104;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray103;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass80_Sub2_Sub1_4 = Static107.method2042(local37, arg0, local44, local37);
		this.aBoolean294 = true;
		this.aClass80_Sub2_Sub1_4.method7142(false);
		this.aClass243_1 = new Class243(arg0, 256);
		@Pc(334) float local334 = this.aClass80_Sub2_Sub1_4.aFloat169 / (float) this.aClass80_Sub2_Sub1_4.anInt8361;
		@Pc(343) float local343 = this.aClass80_Sub2_Sub1_4.aFloat168 / (float) this.aClass80_Sub2_Sub1_4.anInt8362;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class369 local350 = arg2[local345];
			local57 = local350.anInt10307;
			local63 = local350.anInt10309;
			local69 = local350.anInt10306;
			local75 = local350.anInt10308;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass243_1.method5742(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass80_Sub2_Sub1_4.aFloat168 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass80_Sub2_Sub1_4.aFloat168 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass80_Sub2_Sub1_4.aFloat168 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass80_Sub2_Sub1_4.aFloat168 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass243_1.method5741();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5786(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) Class80_Sub2_Sub1 local5 = local2.aClass80_Sub2_Sub1_5;
		this.aClass65_Sub1_8.method1235();
		this.aClass65_Sub1_8.method1286(this.aClass80_Sub2_Sub1_4);
		if (this.aBoolean294 || arg4) {
			this.aClass65_Sub1_8.method1228(7681, 8448);
			this.aClass65_Sub1_8.method1265(0, 768, 34168);
		} else {
			this.aClass65_Sub1_8.method1228(7681, 7681);
		}
		this.aClass65_Sub1_8.method1256(1);
		this.aClass65_Sub1_8.method1286(local5);
		this.aClass65_Sub1_8.method1228(7681, 8448);
		this.aClass65_Sub1_8.method1265(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat169 / (float) local5.anInt8361;
		@Pc(85) float local85 = local5.aFloat168 / (float) local5.anInt8362;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass243_1.method5740(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass65_Sub1_8.method1265(0, 768, 5890);
		this.aClass65_Sub1_8.method1228(8448, 8448);
		this.aClass65_Sub1_8.method1286((Class80) null);
		this.aClass65_Sub1_8.method1256(0);
		if (this.aBoolean294 || arg4) {
			this.aClass65_Sub1_8.method1265(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!gf", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass65_Sub1_8.method1235();
		this.aClass65_Sub1_8.method1286(this.aClass80_Sub2_Sub1_4);
		if (this.aBoolean294 || arg4) {
			this.aClass65_Sub1_8.method1228(7681, 8448);
			this.aClass65_Sub1_8.method1265(0, 768, 34168);
		} else {
			this.aClass65_Sub1_8.method1228(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass243_1.method5740(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean294 || arg4) {
			this.aClass65_Sub1_8.method1265(0, 768, 5890);
		}
	}
}
