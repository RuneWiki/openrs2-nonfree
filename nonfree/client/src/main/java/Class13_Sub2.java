import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Lclient!mn;")
	private Class114_Sub1_Sub1 aClass114_Sub1_Sub1_2;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	private int anInt414 = 0;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	private int anInt424 = 0;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	private int anInt423 = 0;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "I")
	private int anInt427 = 0;

	@OriginalMember(owner = "client!as", name = "C", descriptor = "I")
	private int anInt431 = 0;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_1;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Lclient!mn;")
	public final Class114_Sub1_Sub1 aClass114_Sub1_Sub1_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!no;IIZ)V")
	public Class13_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass66_Sub3_1 = arg0;
		this.aClass114_Sub1_Sub1_1 = Static560.method7719(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!no;IIII)V")
	public Class13_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass66_Sub3_1 = arg0;
		this.aClass114_Sub1_Sub1_1 = Static220.method3803(arg4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!no;II[III)V")
	public Class13_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass66_Sub3_1 = arg0;
		this.aClass114_Sub1_Sub1_1 = Static497.method7075(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!as", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass114_Sub1_Sub1_1.method4999(true);
		this.aClass66_Sub3_1.method5366();
		this.aClass66_Sub3_1.method5398(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean43) {
			@Pc(182) float local182 = (float) arg2 / (float) this.AA();
			@Pc(189) float local189 = (float) arg3 / (float) this.a();
			@Pc(198) float local198 = local182 * (float) this.anInt431 + (float) arg0;
			@Pc(207) float local207 = (float) arg1 + (float) this.anInt414 * local189;
			@Pc(216) float local216 = local198 + (float) this.aClass114_Sub1_Sub1_1.anInt5922 * local182;
			@Pc(225) float local225 = (float) this.aClass114_Sub1_Sub1_1.anInt5924 * local189 + local207;
			if (this.aClass114_Sub1_Sub1_2 == null) {
				this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
				this.aClass66_Sub3_1.method5355(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
			} else {
				this.method413(arg4);
				this.aClass114_Sub1_Sub1_2.method4999(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
				this.method414();
			}
		} else if (this.aClass114_Sub1_Sub1_2 == null) {
			this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
			this.aClass66_Sub3_1.method5355(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method413(arg4);
			this.aClass114_Sub1_Sub1_2.method4999(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
			OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method414();
		}
	}

	@OriginalMember(owner = "client!as", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt427 + this.aClass114_Sub1_Sub1_1.anInt5922 + this.anInt431;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class114_Sub1_Sub1 local7 = ((Class98_Sub3) arg6).aClass114_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean43) {
			local14 = this.AA();
			local18 = this.a();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt414 * local38;
			@Pc(57) float local57 = local45 * (float) this.anInt414;
			@Pc(63) float local63 = (float) this.anInt431 * local25;
			@Pc(69) float local69 = local31 * (float) this.anInt431;
			@Pc(76) float local76 = (float) this.anInt427 * -local25;
			@Pc(83) float local83 = -local31 * (float) this.anInt427;
			@Pc(90) float local90 = (float) this.anInt424 * -local38;
			arg4 = local90 + local63 + arg4;
			arg3 = local57 + local83 + arg3;
			arg0 = local51 + local63 + arg0;
			arg2 = local76 + arg2 + local51;
			@Pc(121) float local121 = (float) this.anInt424 * -local45;
			arg1 = local69 + arg1 + local57;
			arg5 = local121 + local69 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass114_Sub1_Sub1_1.method4999(true);
		this.aClass66_Sub3_1.method5366();
		this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
		this.aClass66_Sub3_1.method5355(1);
		this.aClass66_Sub3_1.method5381(1);
		this.aClass66_Sub3_1.method5382(local7);
		this.aClass66_Sub3_1.method5396(8448, 7681);
		this.aClass66_Sub3_1.method5361(768, 0, 34168);
		this.aClass66_Sub3_1.method5398(1);
		local25 = local7.aFloat103 / (float) local7.anInt5922;
		local31 = local7.aFloat104 / (float) local7.anInt5924;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat104 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat104 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat104 - local31 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat104 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass66_Sub3_1.method5361(768, 0, 5890);
		this.aClass66_Sub3_1.method5355(0);
		this.aClass66_Sub3_1.method5382(null);
		this.aClass66_Sub3_1.method5381(0);
	}

	@OriginalMember(owner = "client!as", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass114_Sub1_Sub1_1.method4999(false);
		this.aClass66_Sub3_1.method5366();
		this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
		this.aClass66_Sub3_1.method5398(arg6);
		this.aClass66_Sub3_1.method5355(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass114_Sub1_Sub1_1.aBoolean441 && !this.aBoolean43) {
			@Pc(339) float local339 = this.aClass114_Sub1_Sub1_1.aFloat104 * (float) arg3 / (float) this.aClass114_Sub1_Sub1_1.anInt5924;
			@Pc(351) float local351 = (float) arg2 * this.aClass114_Sub1_Sub1_1.aFloat103 / (float) this.aClass114_Sub1_Sub1_1.anInt5922;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local339);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local351, 0.0F);
			OpenGL.glVertex2i(local10, local14);
			OpenGL.glTexCoord2f(local351, local339);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt431, (float) this.anInt414, 0.0F);
		@Pc(73) int local73 = this.AA();
		@Pc(76) int local76 = this.a();
		@Pc(83) int local83 = arg1 + this.aClass114_Sub1_Sub1_1.anInt5924;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(96) int local96;
		while (local83 <= local14) {
			local96 = arg0 + this.aClass114_Sub1_Sub1_1.anInt5922;
			@Pc(98) int local98 = arg0;
			while (local10 >= local96) {
				OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local98, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local98, local83);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
				OpenGL.glVertex2i(local96, local83);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local96, local87);
				local96 += local73;
				local98 += local73;
			}
			if (local98 < local10) {
				@Pc(161) float local161 = (float) (local10 - local98) * this.aClass114_Sub1_Sub1_1.aFloat103 / (float) this.aClass114_Sub1_Sub1_1.anInt5922;
				OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local98, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local98, local83);
				OpenGL.glTexCoord2f(local161, 0.0F);
				OpenGL.glVertex2i(local10, local83);
				OpenGL.glTexCoord2f(local161, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local10, local87);
			}
			local83 += local76;
			local87 += local76;
		}
		if (local14 > local87) {
			@Pc(226) float local226 = (float) (local87 + this.aClass114_Sub1_Sub1_1.anInt5924 - local14) * this.aClass114_Sub1_Sub1_1.aFloat104 / (float) this.aClass114_Sub1_Sub1_1.anInt5924;
			@Pc(232) int local232 = arg0 + this.aClass114_Sub1_Sub1_1.anInt5922;
			local96 = arg0;
			while (local10 >= local232) {
				OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local96, local87);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local96, local14);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, local226);
				OpenGL.glVertex2i(local232, local14);
				OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local232, local87);
				local96 += local73;
				local232 += local73;
			}
			if (local10 > local96) {
				@Pc(296) float local296 = this.aClass114_Sub1_Sub1_1.aFloat103 * (float) (local10 - local96) / (float) this.aClass114_Sub1_Sub1_1.anInt5922;
				OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local96, local87);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local96, local14);
				OpenGL.glTexCoord2f(local296, local226);
				OpenGL.glVertex2i(local10, local14);
				OpenGL.glTexCoord2f(local296, this.aClass114_Sub1_Sub1_1.aFloat104);
				OpenGL.glVertex2i(local10, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class98_Sub3 local6 = (Class98_Sub3) arg2;
		@Pc(9) Class114_Sub1_Sub1 local9 = local6.aClass114_Sub1_Sub1_5;
		this.aClass114_Sub1_Sub1_1.method4999(false);
		this.aClass66_Sub3_1.method5366();
		this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
		this.aClass66_Sub3_1.method5355(1);
		this.aClass66_Sub3_1.method5381(1);
		this.aClass66_Sub3_1.method5382(local9);
		this.aClass66_Sub3_1.method5396(8448, 7681);
		this.aClass66_Sub3_1.method5361(768, 0, 34168);
		this.aClass66_Sub3_1.method5398(1);
		@Pc(62) int local62 = arg1 + this.anInt414;
		@Pc(67) int local67 = arg0 + this.anInt431;
		@Pc(73) int local73 = this.aClass114_Sub1_Sub1_1.anInt5922 + local67;
		@Pc(79) int local79 = this.aClass114_Sub1_Sub1_1.anInt5924 + local62;
		@Pc(86) float local86 = local9.aFloat103 / (float) local9.anInt5922;
		@Pc(93) float local93 = local9.aFloat104 / (float) local9.anInt5924;
		@Pc(100) float local100 = local86 * (float) (local67 - arg3);
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat104 - (float) (local62 - arg4) * local93;
		@Pc(131) float local131 = local9.aFloat104 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glMultiTexCoord2f(33985, local100, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local131);
		OpenGL.glVertex2i(local67, this.aClass114_Sub1_Sub1_1.anInt5924 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local131);
		OpenGL.glVertex2i(this.aClass114_Sub1_Sub1_1.anInt5922 + local67, local62 + this.aClass114_Sub1_Sub1_1.anInt5924);
		OpenGL.glMultiTexCoord2f(33984, this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(this.aClass114_Sub1_Sub1_1.anInt5922 + local67, local62);
		OpenGL.glEnd();
		this.aClass66_Sub3_1.method5361(768, 0, 5890);
		this.aClass66_Sub3_1.method5355(0);
		this.aClass66_Sub3_1.method5382(null);
		this.aClass66_Sub3_1.method5381(0);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass114_Sub1_Sub1_1.anInt5924;
	}

	@OriginalMember(owner = "client!as", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass114_Sub1_Sub1_2 = Static220.method3803(this.aClass114_Sub1_Sub1_1.anInt5924, arg1, this.aClass114_Sub1_Sub1_1.anInt5922, this.aClass66_Sub3_1, arg0);
		this.anInt423 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!as", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt427 = arg2;
		this.anInt431 = arg0;
		this.anInt414 = arg1;
		this.anInt424 = arg3;
		this.aBoolean43 = this.anInt431 != 0 || this.anInt414 != 0 || this.anInt427 != 0 || this.anInt424 != 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt414 + this.aClass114_Sub1_Sub1_1.anInt5924 + this.anInt424;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
	private void method413(@OriginalArg(0) int arg0) {
		this.aClass66_Sub3_1.method5381(1);
		this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
		this.aClass66_Sub3_1.method5396(7681, this.aClass66_Sub3_1.method5409(arg0));
		this.aClass66_Sub3_1.method5361(768, 1, 34167);
		this.aClass66_Sub3_1.method5424(0, 34168);
		this.aClass66_Sub3_1.method5381(0);
		this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_2);
		this.aClass66_Sub3_1.method5396(7681, 34479);
		this.aClass66_Sub3_1.method5361(768, 1, 34166);
		if (this.anInt423 == 0) {
			this.aClass66_Sub3_1.method5437(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt423 == 1) {
			this.aClass66_Sub3_1.method5437(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt423 == 2) {
			this.aClass66_Sub3_1.method5437(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt423 == 3) {
			this.aClass66_Sub3_1.method5437(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass114_Sub1_Sub1_1.method4999(false);
		this.aClass66_Sub3_1.method5366();
		this.aClass66_Sub3_1.method5398(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt414;
		@Pc(42) int local42 = arg0 + this.anInt431;
		if (this.aClass114_Sub1_Sub1_2 == null) {
			this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
			this.aClass66_Sub3_1.method5355(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass114_Sub1_Sub1_1.anInt5924);
			OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
			OpenGL.glVertex2i(this.aClass114_Sub1_Sub1_1.anInt5922 + local42, local37 + this.aClass114_Sub1_Sub1_1.anInt5924);
			OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
			OpenGL.glVertex2i(local42 + this.aClass114_Sub1_Sub1_1.anInt5922, local37);
			OpenGL.glEnd();
			return;
		}
		this.method413(arg2);
		this.aClass114_Sub1_Sub1_2.method4999(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass114_Sub1_Sub1_1.anInt5924 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
		OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
		OpenGL.glVertex2i(this.aClass114_Sub1_Sub1_1.anInt5922 + local42, local37 + this.aClass114_Sub1_Sub1_1.anInt5924);
		OpenGL.glMultiTexCoord2f(33985, this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glVertex2i(this.aClass114_Sub1_Sub1_1.anInt5922 + local42, local37);
		OpenGL.glEnd();
		this.method414();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
	private void method414() {
		this.aClass66_Sub3_1.method5381(1);
		this.aClass66_Sub3_1.method5382(null);
		this.aClass66_Sub3_1.method5396(8448, 8448);
		this.aClass66_Sub3_1.method5361(768, 1, 34168);
		this.aClass66_Sub3_1.method5424(0, 5890);
		this.aClass66_Sub3_1.method5381(0);
		this.aClass66_Sub3_1.method5361(768, 1, 34168);
	}

	@OriginalMember(owner = "client!as", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass114_Sub1_Sub1_1.method5010(arg2, arg3, arg0, arg1, arg4, arg5);
	}

	@OriginalMember(owner = "client!as", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass114_Sub1_Sub1_1.anInt5922;
	}

	@OriginalMember(owner = "client!as", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean43) {
			local6 = this.AA();
			local10 = this.a();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = (float) this.anInt414 * local29;
			@Pc(47) float local47 = local35 * (float) this.anInt414;
			@Pc(53) float local53 = local16 * (float) this.anInt431;
			@Pc(59) float local59 = (float) this.anInt431 * local22;
			@Pc(66) float local66 = -local16 * (float) this.anInt427;
			@Pc(73) float local73 = -local22 * (float) this.anInt427;
			@Pc(80) float local80 = -local29 * (float) this.anInt424;
			@Pc(87) float local87 = -local35 * (float) this.anInt424;
			arg0 = arg0 + local53 + local41;
			arg4 = arg4 + local53 + local80;
			arg2 = arg2 + local66 + local41;
			arg1 = arg1 + local59 + local47;
			arg3 = local73 + arg3 + local47;
			arg5 = local87 + arg5 + local59;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass114_Sub1_Sub1_1.method4999(true);
		this.aClass66_Sub3_1.method5366();
		this.aClass66_Sub3_1.method5382(this.aClass114_Sub1_Sub1_1);
		this.aClass66_Sub3_1.method5398(arg8);
		this.aClass66_Sub3_1.method5355(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass114_Sub1_Sub1_1.aFloat103, this.aClass114_Sub1_Sub1_1.aFloat104);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}
}
