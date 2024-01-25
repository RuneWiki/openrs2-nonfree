import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!wh;")
	private Class23_Sub3_Sub1 aClass23_Sub3_Sub1_3;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	private int anInt5172 = 0;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt5168 = 0;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	private int anInt5177 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt5171 = 0;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	private int anInt5175 = 0;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
	private boolean aBoolean467 = false;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_31;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!wh;")
	private final Class23_Sub3_Sub1 aClass23_Sub3_Sub1_4;

	static {
		new Class142("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class85_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass117_Sub1_31 = arg0;
		this.aClass23_Sub3_Sub1_4 = Static141.method4894(arg1, arg3, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ih;II[III)V")
	public Class85_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass117_Sub1_31 = arg0;
		this.aClass23_Sub3_Sub1_4 = Static141.method4891(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
	private void method4149(@OriginalArg(1) int arg0) {
		this.aClass117_Sub1_31.method2476(1);
		this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
		this.aClass117_Sub1_31.method2471(7681, this.aClass117_Sub1_31.method2530(arg0));
		this.aClass117_Sub1_31.method2505(1, 34167, 768);
		this.aClass117_Sub1_31.method2492(34168, 0);
		this.aClass117_Sub1_31.method2476(0);
		this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_3);
		this.aClass117_Sub1_31.method2471(7681, 34479);
		this.aClass117_Sub1_31.method2505(1, 34166, 768);
		if (this.anInt5175 == 0) {
			this.aClass117_Sub1_31.method2490(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt5175 == 1) {
			this.aClass117_Sub1_31.method2490(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt5175 == 2) {
			this.aClass117_Sub1_31.method2490(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt5175 == 3) {
			this.aClass117_Sub1_31.method2490(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_Sub3_Sub1_4.method5805(false);
		this.aClass117_Sub1_31.method2466();
		this.aClass117_Sub1_31.method2503(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5171;
		@Pc(42) int local42 = arg1 + this.anInt5172;
		if (this.aClass23_Sub3_Sub1_3 == null) {
			this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
			this.aClass117_Sub1_31.method2535(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass23_Sub3_Sub1_4.anInt7183);
			OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
			OpenGL.glVertex2i(this.aClass23_Sub3_Sub1_4.anInt7184 + local37, this.aClass23_Sub3_Sub1_4.anInt7183 + local42);
			OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glVertex2i(local37 + this.aClass23_Sub3_Sub1_4.anInt7184, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4149(arg2);
		this.aClass23_Sub3_Sub1_3.method5805(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass23_Sub3_Sub1_4.anInt7183 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
		OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass23_Sub3_Sub1_4.anInt7184, this.aClass23_Sub3_Sub1_4.anInt7183 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glVertex2i(local37 + this.aClass23_Sub3_Sub1_4.anInt7184, local42);
		OpenGL.glEnd();
		this.method4150();
	}

	@OriginalMember(owner = "client!pc", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt5177 + this.aClass23_Sub3_Sub1_4.anInt7184 + this.anInt5171;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class23_Sub3_Sub1 local7 = ((Class73_Sub1) arg6).aClass23_Sub3_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean467) {
			local14 = this.RA();
			local18 = this.Q();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt5172;
			@Pc(55) float local55 = local43 * (float) this.anInt5172;
			@Pc(61) float local61 = local25 * (float) this.anInt5171;
			@Pc(67) float local67 = local31 * (float) this.anInt5171;
			@Pc(74) float local74 = -local25 * (float) this.anInt5177;
			@Pc(81) float local81 = -local31 * (float) this.anInt5177;
			@Pc(88) float local88 = (float) this.anInt5168 * -local37;
			arg4 = arg4 + local61 + local88;
			arg3 = local55 + local81 + arg3;
			arg1 = arg1 + local67 + local55;
			arg2 = local49 + local74 + arg2;
			@Pc(119) float local119 = -local43 * (float) this.anInt5168;
			arg0 = arg0 + local61 + local49;
			arg5 = local119 + local67 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass23_Sub3_Sub1_4.method5805(true);
		this.aClass117_Sub1_31.method2466();
		this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
		this.aClass117_Sub1_31.method2535(1);
		this.aClass117_Sub1_31.method2476(1);
		this.aClass117_Sub1_31.method2504(local7);
		this.aClass117_Sub1_31.method2471(8448, 7681);
		this.aClass117_Sub1_31.method2505(0, 34168, 768);
		this.aClass117_Sub1_31.method2503(1);
		local25 = local7.aFloat89 / (float) local7.anInt7184;
		local31 = local7.aFloat88 / (float) local7.anInt7183;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local25, local7.aFloat88 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat88 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat88 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat88 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass117_Sub1_31.method2505(0, 5890, 768);
		this.aClass117_Sub1_31.method2535(0);
		this.aClass117_Sub1_31.method2504(null);
		this.aClass117_Sub1_31.method2476(0);
	}

	@OriginalMember(owner = "client!pc", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass23_Sub3_Sub1_4.anInt7184;
	}

	@OriginalMember(owner = "client!pc", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass23_Sub3_Sub1_4.method5805(true);
		this.aClass117_Sub1_31.method2466();
		this.aClass117_Sub1_31.method2503(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean467) {
			@Pc(181) float local181 = (float) arg2 / (float) this.RA();
			@Pc(188) float local188 = (float) arg3 / (float) this.Q();
			@Pc(197) float local197 = (float) arg0 + local181 * (float) this.anInt5171;
			@Pc(206) float local206 = (float) arg1 + local188 * (float) this.anInt5172;
			@Pc(215) float local215 = local197 + local181 * (float) this.aClass23_Sub3_Sub1_4.anInt7184;
			@Pc(224) float local224 = local188 * (float) this.aClass23_Sub3_Sub1_4.anInt7183 + local206;
			if (this.aClass23_Sub3_Sub1_3 == null) {
				this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
				this.aClass117_Sub1_31.method2535(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method4149(arg4);
				this.aClass23_Sub3_Sub1_3.method5805(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method4150();
			}
		} else if (this.aClass23_Sub3_Sub1_3 == null) {
			this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
			this.aClass117_Sub1_31.method2535(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method4149(arg4);
			this.aClass23_Sub3_Sub1_3.method5805(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
			OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4150();
		}
	}

	@OriginalMember(owner = "client!pc", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass23_Sub3_Sub1_3 = Static141.method4894(arg0, this.aClass23_Sub3_Sub1_4.anInt7184, arg1, this.aClass117_Sub1_31, this.aClass23_Sub3_Sub1_4.anInt7183);
		this.anInt5175 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg2;
		@Pc(9) Class23_Sub3_Sub1 local9 = local6.aClass23_Sub3_Sub1_1;
		this.aClass23_Sub3_Sub1_4.method5805(false);
		this.aClass117_Sub1_31.method2466();
		this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
		this.aClass117_Sub1_31.method2535(1);
		this.aClass117_Sub1_31.method2476(1);
		this.aClass117_Sub1_31.method2504(local9);
		this.aClass117_Sub1_31.method2471(8448, 7681);
		this.aClass117_Sub1_31.method2505(0, 34168, 768);
		this.aClass117_Sub1_31.method2503(1);
		@Pc(62) int local62 = arg1 + this.anInt5172;
		@Pc(67) int local67 = arg0 + this.anInt5171;
		@Pc(74) int local74 = local67 + this.aClass23_Sub3_Sub1_4.anInt7184;
		@Pc(81) int local81 = local62 + this.aClass23_Sub3_Sub1_4.anInt7183;
		@Pc(88) float local88 = local9.aFloat89 / (float) local9.anInt7184;
		@Pc(95) float local95 = local9.aFloat88 / (float) local9.anInt7183;
		@Pc(102) float local102 = (float) (local67 - arg3) * local88;
		@Pc(110) float local110 = (float) (local74 - arg3) * local88;
		@Pc(121) float local121 = local9.aFloat88 - local95 * (float) (local62 - arg4);
		@Pc(133) float local133 = local9.aFloat88 - local95 * (float) (local81 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local133);
		OpenGL.glVertex2i(local67, local62 + this.aClass23_Sub3_Sub1_4.anInt7183);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local133);
		OpenGL.glVertex2i(local67 + this.aClass23_Sub3_Sub1_4.anInt7184, local62 - -this.aClass23_Sub3_Sub1_4.anInt7183);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(this.aClass23_Sub3_Sub1_4.anInt7184 + local67, local62);
		OpenGL.glEnd();
		this.aClass117_Sub1_31.method2505(0, 5890, 768);
		this.aClass117_Sub1_31.method2535(0);
		this.aClass117_Sub1_31.method2504(null);
		this.aClass117_Sub1_31.method2476(0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	private void method4150() {
		this.aClass117_Sub1_31.method2476(1);
		this.aClass117_Sub1_31.method2504(null);
		this.aClass117_Sub1_31.method2471(8448, 8448);
		this.aClass117_Sub1_31.method2505(1, 34168, 768);
		this.aClass117_Sub1_31.method2492(5890, 0);
		this.aClass117_Sub1_31.method2476(0);
		this.aClass117_Sub1_31.method2505(1, 34168, 768);
	}

	@OriginalMember(owner = "client!pc", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass23_Sub3_Sub1_4.anInt7183;
	}

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean467) {
			local6 = this.RA();
			local10 = this.Q();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = (float) this.anInt5172 * local30;
			@Pc(48) float local48 = local36 * (float) this.anInt5172;
			@Pc(54) float local54 = (float) this.anInt5171 * local17;
			@Pc(60) float local60 = local23 * (float) this.anInt5171;
			@Pc(67) float local67 = -local17 * (float) this.anInt5177;
			@Pc(74) float local74 = (float) this.anInt5177 * -local23;
			@Pc(81) float local81 = -local30 * (float) this.anInt5168;
			@Pc(88) float local88 = -local36 * (float) this.anInt5168;
			arg4 = arg4 + local54 + local81;
			arg0 = local54 + arg0 + local42;
			arg1 = arg1 + local60 + local48;
			arg3 = local48 + local74 + arg3;
			arg2 = local67 + arg2 + local42;
			arg5 = local88 + local60 + arg5;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass23_Sub3_Sub1_4.method5805(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass117_Sub1_31.method2466();
		this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
		this.aClass117_Sub1_31.method2503(arg8);
		this.aClass117_Sub1_31.method2535(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pc", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5177 = arg2;
		this.anInt5172 = arg1;
		this.anInt5171 = arg0;
		this.anInt5168 = arg3;
		this.aBoolean467 = this.anInt5171 != 0 || this.anInt5172 != 0 || this.anInt5177 != 0 || this.anInt5168 != 0;
	}

	@OriginalMember(owner = "client!pc", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass23_Sub3_Sub1_4.method5809(arg5, arg2, arg0, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!pc", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(15) int local15 = arg1 + arg3;
		this.aClass23_Sub3_Sub1_4.method5805(false);
		this.aClass117_Sub1_31.method2466();
		this.aClass117_Sub1_31.method2504(this.aClass23_Sub3_Sub1_4);
		this.aClass117_Sub1_31.method2503(arg6);
		this.aClass117_Sub1_31.method2535(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass23_Sub3_Sub1_4.aBoolean625 && !this.aBoolean467) {
			@Pc(74) float local74 = (float) arg3 * this.aClass23_Sub3_Sub1_4.aFloat88 / (float) this.aClass23_Sub3_Sub1_4.anInt7183;
			@Pc(86) float local86 = this.aClass23_Sub3_Sub1_4.aFloat89 * (float) arg2 / (float) this.aClass23_Sub3_Sub1_4.anInt7184;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local15);
			OpenGL.glTexCoord2f(local86, 0.0F);
			OpenGL.glVertex2i(local10, local15);
			OpenGL.glTexCoord2f(local86, local74);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5171, (float) this.anInt5172, 0.0F);
		@Pc(126) int local126 = this.RA();
		@Pc(129) int local129 = this.Q();
		@Pc(135) int local135 = this.aClass23_Sub3_Sub1_4.anInt7183 + arg1;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(147) int local147;
		while (local135 <= local15) {
			local147 = this.aClass23_Sub3_Sub1_4.anInt7184 + arg0;
			@Pc(149) int local149 = arg0;
			while (local10 >= local147) {
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, 0.0F);
				OpenGL.glVertex2i(local147, local135);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local147, local139);
				local149 += local126;
				local147 += local126;
			}
			if (local149 < local10) {
				@Pc(220) float local220 = (float) (local10 - local149) * this.aClass23_Sub3_Sub1_4.aFloat89 / (float) this.aClass23_Sub3_Sub1_4.anInt7184;
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(local220, 0.0F);
				OpenGL.glVertex2i(local10, local135);
				OpenGL.glTexCoord2f(local220, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local10, local139);
			}
			local135 += local129;
			local139 += local129;
		}
		if (local15 > local139) {
			@Pc(281) float local281 = this.aClass23_Sub3_Sub1_4.aFloat88 * (float) (this.aClass23_Sub3_Sub1_4.anInt7183 + local139 - local15) / (float) this.aClass23_Sub3_Sub1_4.anInt7183;
			@Pc(287) int local287 = this.aClass23_Sub3_Sub1_4.anInt7184 + arg0;
			local147 = arg0;
			while (local287 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local147, local15);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, local281);
				OpenGL.glVertex2i(local287, local15);
				OpenGL.glTexCoord2f(this.aClass23_Sub3_Sub1_4.aFloat89, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local287, local139);
				local147 += local126;
				local287 += local126;
			}
			if (local147 < local10) {
				@Pc(356) float local356 = (float) (local10 - local147) * this.aClass23_Sub3_Sub1_4.aFloat89 / (float) this.aClass23_Sub3_Sub1_4.anInt7184;
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local147, local15);
				OpenGL.glTexCoord2f(local356, local281);
				OpenGL.glVertex2i(local10, local15);
				OpenGL.glTexCoord2f(local356, this.aClass23_Sub3_Sub1_4.aFloat88);
				OpenGL.glVertex2i(local10, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.anInt5168 + this.aClass23_Sub3_Sub1_4.anInt7183 + this.anInt5172;
	}
}
