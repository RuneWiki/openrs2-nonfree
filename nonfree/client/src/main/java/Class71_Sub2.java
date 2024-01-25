import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!gn", name = "E", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_13;

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "Lclient!qq;")
	private final Class81_Sub4_Sub1 aClass81_Sub4_Sub1_4;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "Z")
	private final boolean aBoolean231;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Lclient!cq;")
	private final Class45 aClass45_3;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!cg;Lclient!go;[Lclient!ck;Z)V")
	public Class71_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class40[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass37_Sub1_13 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class40 local20 = arg2[local13];
			if (local20.anInt691 > local11) {
				local11 = local20.anInt691;
			}
			if (local20.anInt694 > local11) {
				local11 = local20.anInt694;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class40 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray7;
			local62 = local56.anInt691;
			local65 = local56.anInt694;
			local71 = local49 % 16 * local11;
			local77 = local49 / 16 * local11;
			@Pc(83) int local83 = local77 * local13 + local71;
			@Pc(85) int local85 = 0;
			for (@Pc(87) int local87 = 0; local87 < local62; local87++) {
				for (@Pc(92) int local92 = 0; local92 < local65; local92++) {
					local47[local83++] = (byte) (local59[local85++] == 0 ? 0 : -1);
				}
				local83 += local13 - local65;
			}
		}
		this.aClass81_Sub4_Sub1_4 = Static375.method4750(local13, local13, local47, arg0);
		this.aBoolean231 = true;
		this.aClass81_Sub4_Sub1_4.method4737(false);
		this.aClass45_3 = new Class45(arg0, 256);
		@Pc(292) float local292 = this.aClass81_Sub4_Sub1_4.aFloat66 / (float) this.aClass81_Sub4_Sub1_4.anInt5616;
		@Pc(301) float local301 = this.aClass81_Sub4_Sub1_4.aFloat67 / (float) this.aClass81_Sub4_Sub1_4.anInt5615;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class40 local310 = arg2[local303];
			local62 = local310.anInt691;
			local65 = local310.anInt694;
			local71 = local310.anInt696;
			local77 = local310.anInt693;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass45_3.method947(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass81_Sub4_Sub1_4.aFloat67 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass81_Sub4_Sub1_4.aFloat67 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass81_Sub4_Sub1_4.aFloat67 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass81_Sub4_Sub1_4.aFloat67 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass45_3.method949();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(CIIIZLclient!or;II)V")
	@Override
	protected void method5249(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class124 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class124_Sub2 local2 = (Class124_Sub2) arg5;
		@Pc(5) Class81_Sub4_Sub1 local5 = local2.aClass81_Sub4_Sub1_5;
		@Pc(9) opengl local9 = this.aClass37_Sub1_13.anOpengl1;
		this.aClass37_Sub1_13.method780();
		this.aClass37_Sub1_13.method767(this.aClass81_Sub4_Sub1_4);
		if (this.aBoolean231 || arg4) {
			this.aClass37_Sub1_13.method735(7681, 8448);
			this.aClass37_Sub1_13.method732(0, 34168, 768);
		}
		this.aClass37_Sub1_13.method759(1);
		this.aClass37_Sub1_13.method767(local5);
		this.aClass37_Sub1_13.method735(7681, 8448);
		this.aClass37_Sub1_13.method732(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat66 / (float) local5.anInt5616;
		@Pc(76) float local76 = local5.aFloat67 / (float) local5.anInt5615;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass45_3.method948(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass37_Sub1_13.method732(0, 5890, 768);
		this.aClass37_Sub1_13.method735(8448, 8448);
		this.aClass37_Sub1_13.method767(null);
		this.aClass37_Sub1_13.method759(0);
		if (this.aBoolean231 || arg4) {
			this.aClass37_Sub1_13.method732(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5247(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_13.anOpengl1;
		this.aClass37_Sub1_13.method780();
		this.aClass37_Sub1_13.method767(this.aClass81_Sub4_Sub1_4);
		if (this.aBoolean231 || arg4) {
			this.aClass37_Sub1_13.method735(7681, 8448);
			this.aClass37_Sub1_13.method732(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass45_3.method948(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean231 || arg4) {
			this.aClass37_Sub1_13.method732(0, 5890, 768);
		}
	}
}
