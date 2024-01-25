import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_12;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!gq;")
	private final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
	private final boolean aBoolean161;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!cs;")
	private final Class49 aClass49_1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!ih;Lclient!qm;[Lclient!wh;Z)V")
	public Class20_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class266[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass106_Sub2_12 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class266 local15 = arg2[local10];
			if (local15.anInt7824 > local8) {
				local8 = local15.anInt7824;
			}
			if (local15.anInt7823 > local8) {
				local8 = local15.anInt7823;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class266 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray94;
			local57 = local51.anInt7824;
			local60 = local51.anInt7823;
			local66 = local46 % 16 * local8;
			local72 = local46 / 16 * local8;
			@Pc(78) int local78 = local72 * local37 + local66;
			@Pc(80) int local80 = 0;
			for (@Pc(82) int local82 = 0; local82 < local57; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local60; local85++) {
					local44[local78++] = (byte) (local54[local80++] == 0 ? 0 : -1);
				}
				local78 += local37 - local60;
			}
		}
		this.aClass8_Sub1_Sub1_1 = Static75.method1402(local44, local37, local37, arg0);
		this.aBoolean161 = true;
		this.aClass8_Sub1_Sub1_1.method3073(false);
		this.aClass49_1 = new Class49(arg0, 256);
		@Pc(290) float local290 = this.aClass8_Sub1_Sub1_1.aFloat23 / (float) this.aClass8_Sub1_Sub1_1.anInt3085;
		@Pc(299) float local299 = this.aClass8_Sub1_Sub1_1.aFloat24 / (float) this.aClass8_Sub1_Sub1_1.anInt3088;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class266 local306 = arg2[local301];
			local57 = local306.anInt7824;
			local60 = local306.anInt7823;
			local66 = local306.anInt7826;
			local72 = local306.anInt7825;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass49_1.method1154(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass8_Sub1_Sub1_1.aFloat24 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass8_Sub1_Sub1_1.aFloat24 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass8_Sub1_Sub1_1.aFloat24 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass8_Sub1_Sub1_1.aFloat24 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass49_1.method1151();
		}
	}

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass106_Sub2_12.method2920();
		this.aClass106_Sub2_12.method2912(this.aClass8_Sub1_Sub1_1);
		if (this.aBoolean161 || arg4) {
			this.aClass106_Sub2_12.method2923(7681, 8448);
			this.aClass106_Sub2_12.method2915(0, 34168, 768);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass49_1.method1153(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean161 || arg4) {
			this.aClass106_Sub2_12.method2915(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method5329(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class24_Sub2 local2 = (Class24_Sub2) arg5;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		this.aClass106_Sub2_12.method2920();
		this.aClass106_Sub2_12.method2912(this.aClass8_Sub1_Sub1_1);
		if (this.aBoolean161 || arg4) {
			this.aClass106_Sub2_12.method2923(7681, 8448);
			this.aClass106_Sub2_12.method2915(0, 34168, 768);
		}
		this.aClass106_Sub2_12.method2881(1);
		this.aClass106_Sub2_12.method2912(local5);
		this.aClass106_Sub2_12.method2923(7681, 8448);
		this.aClass106_Sub2_12.method2915(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat23 / (float) local5.anInt3085;
		@Pc(78) float local78 = local5.aFloat24 / (float) local5.anInt3088;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass49_1.method1153(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass106_Sub2_12.method2915(0, 5890, 768);
		this.aClass106_Sub2_12.method2923(8448, 8448);
		this.aClass106_Sub2_12.method2912(null);
		this.aClass106_Sub2_12.method2881(0);
		if (this.aBoolean161 || arg4) {
			this.aClass106_Sub2_12.method2915(0, 5890, 768);
		}
	}
}
