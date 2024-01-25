import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!no", name = "h", descriptor = "Lclient!gq;")
	private Class8_Sub1_Sub1 aClass8_Sub1_Sub1_4;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	private int anInt5311 = 0;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	private int anInt5319 = 0;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "I")
	private int anInt5315 = 0;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "I")
	private int anInt5323 = 0;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "I")
	private int anInt5314 = 0;

	@OriginalMember(owner = "client!no", name = "F", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_33;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Lclient!gq;")
	private final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_5;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class137_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass106_Sub2_33 = arg0;
		this.aClass8_Sub1_Sub1_5 = Static169.method2726(arg2, arg4, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!ih;II[III)V")
	public Class137_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass106_Sub2_33 = arg0;
		this.aClass8_Sub1_Sub1_5 = Static41.method769(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!no", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt5311 + this.aClass8_Sub1_Sub1_5.anInt3085 + this.anInt5314;
	}

	@OriginalMember(owner = "client!no", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass8_Sub1_Sub1_5.method3073(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass106_Sub2_33.method2866();
		this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
		this.aClass106_Sub2_33.method2927(arg6);
		this.aClass106_Sub2_33.method2851(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass8_Sub1_Sub1_5.aBoolean185 && !this.aBoolean332) {
			@Pc(344) float local344 = (float) arg3 * this.aClass8_Sub1_Sub1_5.aFloat24 / (float) this.aClass8_Sub1_Sub1_5.anInt3088;
			@Pc(356) float local356 = (float) arg2 * this.aClass8_Sub1_Sub1_5.aFloat23 / (float) this.aClass8_Sub1_Sub1_5.anInt3085;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local344);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local356, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local356, local344);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5311, (float) this.anInt5319, 0.0F);
		@Pc(72) int local72 = this.RA();
		@Pc(75) int local75 = this.Q();
		@Pc(82) int local82 = arg1 + this.aClass8_Sub1_Sub1_5.anInt3088;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local82 <= local18) {
			local95 = arg0 + this.aClass8_Sub1_Sub1_5.anInt3085;
			@Pc(97) int local97 = arg0;
			while (local95 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local95, local86);
				local97 += local72;
				local95 += local72;
			}
			if (local9 > local97) {
				@Pc(164) float local164 = this.aClass8_Sub1_Sub1_5.aFloat23 * (float) (local9 - local97) / (float) this.aClass8_Sub1_Sub1_5.anInt3085;
				OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local164, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local164, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local9, local86);
			}
			local82 += local75;
			local86 += local75;
		}
		if (local18 > local86) {
			@Pc(226) float local226 = this.aClass8_Sub1_Sub1_5.aFloat24 * (float) (local86 + this.aClass8_Sub1_Sub1_5.anInt3088 - local18) / (float) this.aClass8_Sub1_Sub1_5.anInt3088;
			@Pc(232) int local232 = this.aClass8_Sub1_Sub1_5.anInt3085 + arg0;
			local95 = arg0;
			while (local232 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local95, local18);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, local226);
				OpenGL.glVertex2i(local232, local18);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local232, local86);
				local232 += local72;
				local95 += local72;
			}
			if (local9 > local95) {
				@Pc(301) float local301 = (float) (local9 - local95) * this.aClass8_Sub1_Sub1_5.aFloat23 / (float) this.aClass8_Sub1_Sub1_5.anInt3085;
				OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local95, local18);
				OpenGL.glTexCoord2f(local301, local226);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local301, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!no", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass8_Sub1_Sub1_5.method3073(false);
		this.aClass106_Sub2_33.method2866();
		this.aClass106_Sub2_33.method2927(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt5319;
		@Pc(42) int local42 = arg0 + this.anInt5311;
		if (this.aClass8_Sub1_Sub1_4 == null) {
			this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
			this.aClass106_Sub2_33.method2851(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass8_Sub1_Sub1_5.anInt3088 + local37);
			OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass8_Sub1_Sub1_5.anInt3085, local37 + this.aClass8_Sub1_Sub1_5.anInt3088);
			OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glVertex2i(local42 + this.aClass8_Sub1_Sub1_5.anInt3085, local37);
			OpenGL.glEnd();
			return;
		}
		this.method4079(arg2);
		this.aClass8_Sub1_Sub1_4.method3073(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass8_Sub1_Sub1_5.anInt3088 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
		OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass8_Sub1_Sub1_5.anInt3085, this.aClass8_Sub1_Sub1_5.anInt3088 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glVertex2i(this.aClass8_Sub1_Sub1_5.anInt3085 + local42, local37);
		OpenGL.glEnd();
		this.method4081();
	}

	@OriginalMember(owner = "client!no", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5319 = arg1;
		this.anInt5311 = arg0;
		this.anInt5315 = arg3;
		this.anInt5314 = arg2;
		this.aBoolean332 = this.anInt5311 != 0 || this.anInt5319 != 0 || this.anInt5314 != 0 || this.anInt5315 != 0;
	}

	@OriginalMember(owner = "client!no", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass8_Sub1_Sub1_5.method2254(arg0, arg5, arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!no", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean332) {
			local6 = this.RA();
			local10 = this.Q();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt5319;
			@Pc(47) float local47 = local35 * (float) this.anInt5319;
			@Pc(53) float local53 = local17 * (float) this.anInt5311;
			@Pc(59) float local59 = local23 * (float) this.anInt5311;
			@Pc(66) float local66 = -local17 * (float) this.anInt5314;
			@Pc(73) float local73 = (float) this.anInt5314 * -local23;
			@Pc(80) float local80 = (float) this.anInt5315 * -local29;
			arg1 = local59 + arg1 + local47;
			@Pc(93) float local93 = (float) this.anInt5315 * -local35;
			arg2 = local41 + arg2 + local66;
			arg0 = local41 + local53 + arg0;
			arg3 = arg3 + local73 + local47;
			arg4 = local80 + local53 + arg4;
			arg5 = arg5 + local59 + local93;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass8_Sub1_Sub1_5.method3073(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass106_Sub2_33.method2866();
		this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
		this.aClass106_Sub2_33.method2927(arg8);
		this.aClass106_Sub2_33.method2851(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!no", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.anInt5315 + this.aClass8_Sub1_Sub1_5.anInt3088 + this.anInt5319;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class24_Sub2 local6 = (Class24_Sub2) arg2;
		@Pc(9) Class8_Sub1_Sub1 local9 = local6.aClass8_Sub1_Sub1_2;
		this.aClass8_Sub1_Sub1_5.method3073(false);
		this.aClass106_Sub2_33.method2866();
		this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
		this.aClass106_Sub2_33.method2851(1);
		this.aClass106_Sub2_33.method2881(1);
		this.aClass106_Sub2_33.method2912(local9);
		this.aClass106_Sub2_33.method2923(7681, 8448);
		this.aClass106_Sub2_33.method2915(0, 34168, 768);
		this.aClass106_Sub2_33.method2927(1);
		@Pc(62) int local62 = arg1 + this.anInt5319;
		@Pc(67) int local67 = arg0 + this.anInt5311;
		@Pc(73) int local73 = this.aClass8_Sub1_Sub1_5.anInt3085 + local67;
		@Pc(79) int local79 = this.aClass8_Sub1_Sub1_5.anInt3088 + local62;
		@Pc(86) float local86 = local9.aFloat23 / (float) local9.anInt3085;
		@Pc(93) float local93 = local9.aFloat24 / (float) local9.anInt3088;
		@Pc(101) float local101 = (float) (local67 - arg3) * local86;
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat24 - (float) (local62 - arg4) * local93;
		@Pc(131) float local131 = local9.aFloat24 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass8_Sub1_Sub1_5.anInt3088);
		OpenGL.glMultiTexCoord2f(33984, this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local67 + this.aClass8_Sub1_Sub1_5.anInt3085, local62 - -this.aClass8_Sub1_Sub1_5.anInt3088);
		OpenGL.glMultiTexCoord2f(33984, this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(local67 + this.aClass8_Sub1_Sub1_5.anInt3085, local62);
		OpenGL.glEnd();
		this.aClass106_Sub2_33.method2915(0, 5890, 768);
		this.aClass106_Sub2_33.method2851(0);
		this.aClass106_Sub2_33.method2912(null);
		this.aClass106_Sub2_33.method2881(0);
	}

	@OriginalMember(owner = "client!no", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass8_Sub1_Sub1_5.anInt3088;
	}

	@OriginalMember(owner = "client!no", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass8_Sub1_Sub1_5.anInt3085;
	}

	@OriginalMember(owner = "client!no", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass8_Sub1_Sub1_5.method3073(true);
		this.aClass106_Sub2_33.method2866();
		this.aClass106_Sub2_33.method2927(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean332) {
			@Pc(42) float local42 = (float) arg2 / (float) this.RA();
			@Pc(49) float local49 = (float) arg3 / (float) this.Q();
			@Pc(58) float local58 = (float) arg0 + local42 * (float) this.anInt5311;
			@Pc(67) float local67 = (float) arg1 + (float) this.anInt5319 * local49;
			@Pc(76) float local76 = local58 + (float) this.aClass8_Sub1_Sub1_5.anInt3085 * local42;
			@Pc(85) float local85 = local67 + (float) this.aClass8_Sub1_Sub1_5.anInt3088 * local49;
			if (this.aClass8_Sub1_Sub1_4 == null) {
				this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
				this.aClass106_Sub2_33.method2851(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method4079(arg4);
				this.aClass8_Sub1_Sub1_4.method3073(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method4081();
			}
		} else if (this.aClass8_Sub1_Sub1_4 == null) {
			this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
			this.aClass106_Sub2_33.method2851(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method4079(arg4);
			this.aClass8_Sub1_Sub1_4.method3073(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
			OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4081();
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)V")
	private void method4079(@OriginalArg(1) int arg0) {
		this.aClass106_Sub2_33.method2881(1);
		this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
		this.aClass106_Sub2_33.method2923(this.aClass106_Sub2_33.method2911(arg0), 7681);
		this.aClass106_Sub2_33.method2915(1, 34167, 768);
		this.aClass106_Sub2_33.method2925(34168, 0);
		this.aClass106_Sub2_33.method2881(0);
		this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_4);
		this.aClass106_Sub2_33.method2923(34479, 7681);
		this.aClass106_Sub2_33.method2915(1, 34166, 768);
		if (this.anInt5323 == 0) {
			this.aClass106_Sub2_33.method2896(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt5323 == 1) {
			this.aClass106_Sub2_33.method2896(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt5323 == 2) {
			this.aClass106_Sub2_33.method2896(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt5323 == 3) {
			this.aClass106_Sub2_33.method2896(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class8_Sub1_Sub1 local7 = ((Class24_Sub2) arg6).aClass8_Sub1_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean332) {
			local14 = this.RA();
			local18 = this.Q();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt5319 * local37;
			@Pc(55) float local55 = (float) this.anInt5319 * local43;
			@Pc(61) float local61 = (float) this.anInt5311 * local24;
			@Pc(67) float local67 = (float) this.anInt5311 * local30;
			@Pc(74) float local74 = (float) this.anInt5314 * -local24;
			@Pc(81) float local81 = -local30 * (float) this.anInt5314;
			@Pc(88) float local88 = (float) this.anInt5315 * -local37;
			arg0 = local49 + arg0 + local61;
			arg2 = local49 + local74 + arg2;
			arg4 = local61 + arg4 + local88;
			arg3 = local55 + local81 + arg3;
			@Pc(119) float local119 = -local43 * (float) this.anInt5315;
			arg1 = local55 + local67 + arg1;
			arg5 = local119 + local67 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass8_Sub1_Sub1_5.method3073(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass106_Sub2_33.method2866();
		this.aClass106_Sub2_33.method2912(this.aClass8_Sub1_Sub1_5);
		this.aClass106_Sub2_33.method2851(1);
		this.aClass106_Sub2_33.method2881(1);
		this.aClass106_Sub2_33.method2912(local7);
		this.aClass106_Sub2_33.method2923(7681, 8448);
		this.aClass106_Sub2_33.method2915(0, 34168, 768);
		this.aClass106_Sub2_33.method2927(1);
		local24 = local7.aFloat23 / (float) local7.anInt3085;
		local30 = local7.aFloat24 / (float) local7.anInt3088;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat24 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat24 - (arg5 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass8_Sub1_Sub1_5.aFloat23, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat24 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass8_Sub1_Sub1_5.aFloat23, this.aClass8_Sub1_Sub1_5.aFloat24);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local24, local7.aFloat24 - local30 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass106_Sub2_33.method2915(0, 5890, 768);
		this.aClass106_Sub2_33.method2851(0);
		this.aClass106_Sub2_33.method2912(null);
		this.aClass106_Sub2_33.method2881(0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	private void method4081() {
		this.aClass106_Sub2_33.method2881(1);
		this.aClass106_Sub2_33.method2912(null);
		this.aClass106_Sub2_33.method2923(8448, 8448);
		this.aClass106_Sub2_33.method2915(1, 34168, 768);
		this.aClass106_Sub2_33.method2925(5890, 0);
		this.aClass106_Sub2_33.method2881(0);
		this.aClass106_Sub2_33.method2915(1, 34168, 768);
	}

	@OriginalMember(owner = "client!no", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass8_Sub1_Sub1_4 = Static169.method2726(arg1, this.aClass8_Sub1_Sub1_5.anInt3088, this.aClass8_Sub1_Sub1_5.anInt3085, arg0, this.aClass106_Sub2_33);
		this.anInt5323 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}
}
