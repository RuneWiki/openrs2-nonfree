import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class82_Sub1_Sub2 extends Class82_Sub1 {

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_39;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "Lclient!gh;")
	private final Class19_Sub3 aClass19_Sub3_2;

	static {
		new Class267("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!rl;I)V")
	public Class82_Sub1_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass66_Sub2_39 = arg0;
		this.aClass19_Sub3_2 = new Class19_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!gh;Lclient!gh;F)Z")
	public boolean method5705(@OriginalArg(1) Class19_Sub3 arg0, @OriginalArg(2) Class19_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class200 local11 = this.aClass66_Sub2_39.aClass200_7;
		@Pc(15) Class200 local15 = this.aClass66_Sub2_39.aClass200_6;
		if (this.aClass66_Sub2_39.aClass19_Sub4_6.anInt5083 != arg1.anInt2768 || this.aClass66_Sub2_39.aClass19_Sub4_6.anInt5081 != arg1.anInt2768) {
			this.aClass66_Sub2_39.aClass19_Sub4_6 = new Class19_Sub4(this.aClass66_Sub2_39, 3553, 6408, arg1.anInt2768, arg1.anInt2768);
		}
		if (arg0.anInt2768 != this.aClass66_Sub2_39.aClass19_Sub4_7.anInt5083 || this.aClass66_Sub2_39.aClass19_Sub4_7.anInt5081 != arg0.anInt2768) {
			this.aClass66_Sub2_39.aClass19_Sub4_7 = new Class19_Sub4(this.aClass66_Sub2_39, 3553, 6408, arg0.anInt2768, arg0.anInt2768);
		}
		this.aClass66_Sub2_39.method5019(Static287.anIntArray342);
		this.aClass66_Sub2_39.method5070();
		this.aClass66_Sub2_39.method5127();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass19_Sub3_2.anInt2768, this.aClass19_Sub3_2.anInt2768);
		this.aClass66_Sub2_39.method5106(false);
		this.aClass66_Sub2_39.method5110(false);
		this.aClass66_Sub2_39.method5094(false);
		this.aClass66_Sub2_39.method5134(false);
		this.aClass66_Sub2_39.method5093(-2);
		this.aClass66_Sub2_39.method5075(1);
		this.aClass66_Sub2_39.method5079(0.0F, 0.0F, arg2, 0.0F);
		this.aClass66_Sub2_39.method5145(34165, 34165);
		this.aClass66_Sub2_39.method5109(null);
		this.aClass66_Sub2_39.method5075(0);
		this.aClass66_Sub2_39.method5140(1);
		this.aClass66_Sub2_39.method5109(null);
		@Pc(180) int local180 = 0;
		while (local180 < 6) {
			this.aClass66_Sub2_39.method5133(local11);
			@Pc(191) int local191 = local180 + 34069;
			local11.method4544(arg1, local191);
			this.aClass66_Sub2_39.method5115(local15);
			local15.method4542(this.aClass66_Sub2_39.aClass19_Sub4_6, 0);
			if (local11.method4546() && local15.method4546()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg1.anInt2768, arg1.anInt2768, 0, 0, arg1.anInt2768, arg1.anInt2768, 16384, 9728);
				local11.method4544(arg0, local191);
				local15.method4542(this.aClass66_Sub2_39.aClass19_Sub4_7, 0);
				if (local11.method4546() && local15.method4546()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg1.anInt2768, arg1.anInt2768, 0, 0, arg1.anInt2768, arg1.anInt2768, 16384, 9728);
					local11.method4541(0);
					this.aClass66_Sub2_39.method5120(local11);
					local15.method4541(0);
					this.aClass66_Sub2_39.method5104(local15);
					this.aClass66_Sub2_39.method5098(local11);
					local11.method4544(this.aClass19_Sub3_2, local191);
					if (!local11.method4546()) {
						local11.method4541(0);
						local7 = false;
						this.aClass66_Sub2_39.method5153(local11);
						break;
					}
					this.aClass66_Sub2_39.method5075(1);
					this.aClass66_Sub2_39.method5109(this.aClass66_Sub2_39.aClass19_Sub4_7);
					this.aClass66_Sub2_39.method5075(0);
					this.aClass66_Sub2_39.method5109(this.aClass66_Sub2_39.aClass19_Sub4_6);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2f(0.0F, 1.0F);
					OpenGL.glEnd();
					this.aClass66_Sub2_39.method5075(1);
					this.aClass66_Sub2_39.method5109(null);
					this.aClass66_Sub2_39.method5075(0);
					this.aClass66_Sub2_39.method5109(null);
					local11.method4541(0);
					this.aClass66_Sub2_39.method5153(local11);
					local180++;
					continue;
				}
				local11.method4541(0);
				this.aClass66_Sub2_39.method5120(local11);
				local15.method4541(0);
				local7 = false;
				this.aClass66_Sub2_39.method5104(local15);
				break;
			}
			local11.method4541(0);
			this.aClass66_Sub2_39.method5120(local11);
			local15.method4541(0);
			this.aClass66_Sub2_39.method5104(local15);
			local7 = false;
			break;
		}
		this.aClass66_Sub2_39.method5075(1);
		this.aClass66_Sub2_39.method5145(8448, 8448);
		this.aClass66_Sub2_39.method5075(0);
		OpenGL.glPopAttrib();
		this.aClass66_Sub2_39.method5044(Static287.anIntArray342[0], Static287.anIntArray342[1], Static287.anIntArray342[2], Static287.anIntArray342[3]);
		if (local7) {
			this.aClass19_Sub3_2.method4250();
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)I")
	public int method5706() {
		return this.aClass19_Sub3_2.anInt2768;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lclient!gh;")
	@Override
	public Class19_Sub3 method5702() {
		return this.aClass19_Sub3_2;
	}
}
