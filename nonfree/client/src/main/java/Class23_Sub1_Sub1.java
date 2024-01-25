import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_21;

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "Lclient!rd;")
	private final Class112_Sub4 aClass112_Sub4_1;

	static {
		new Class189("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!vj;I)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass172_Sub2_21 = arg0;
		this.aClass112_Sub4_1 = new Class112_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
	public int method3300() {
		return this.aClass112_Sub4_1.anInt5833;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Lclient!rd;")
	@Override
	public Class112_Sub4 method4740() {
		return this.aClass112_Sub4_1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BFLclient!rd;Lclient!rd;)Z")
	public boolean method3302(@OriginalArg(1) float arg0, @OriginalArg(2) Class112_Sub4 arg1, @OriginalArg(3) Class112_Sub4 arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class259 local9 = this.aClass172_Sub2_21.aClass259_7;
		@Pc(13) Class259 local13 = this.aClass172_Sub2_21.aClass259_6;
		if (arg1.anInt5833 != this.aClass172_Sub2_21.aClass112_Sub2_6.anInt4728 || arg1.anInt5833 != this.aClass172_Sub2_21.aClass112_Sub2_6.anInt4726) {
			this.aClass172_Sub2_21.aClass112_Sub2_6 = new Class112_Sub2(this.aClass172_Sub2_21, 3553, 6408, arg1.anInt5833, arg1.anInt5833);
		}
		if (this.aClass172_Sub2_21.aClass112_Sub2_7.anInt4728 != arg2.anInt5833 || arg2.anInt5833 != this.aClass172_Sub2_21.aClass112_Sub2_7.anInt4726) {
			this.aClass172_Sub2_21.aClass112_Sub2_7 = new Class112_Sub2(this.aClass172_Sub2_21, 3553, 6408, arg2.anInt5833, arg2.anInt5833);
		}
		this.aClass172_Sub2_21.u(Static201.anIntArray354);
		this.aClass172_Sub2_21.va();
		this.aClass172_Sub2_21.method5577();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass112_Sub4_1.anInt5833, this.aClass112_Sub4_1.anInt5833);
		this.aClass172_Sub2_21.method5583(false);
		this.aClass172_Sub2_21.method5581(false);
		this.aClass172_Sub2_21.method5623(false);
		this.aClass172_Sub2_21.method5624(false);
		this.aClass172_Sub2_21.method5610(-2);
		this.aClass172_Sub2_21.method5569(1);
		this.aClass172_Sub2_21.method5607(0.0F, arg0, 0.0F, 0.0F);
		this.aClass172_Sub2_21.method5591(34165, 34165);
		this.aClass172_Sub2_21.method5630(null);
		this.aClass172_Sub2_21.method5569(0);
		this.aClass172_Sub2_21.method5629(1);
		this.aClass172_Sub2_21.method5630(null);
		@Pc(187) int local187 = 0;
		while (local187 < 6) {
			this.aClass172_Sub2_21.method5563(local9);
			@Pc(197) int local197 = local187 + 34069;
			local9.method5440(local197, arg1);
			this.aClass172_Sub2_21.method5564(local13);
			local13.method5451(0, this.aClass172_Sub2_21.aClass112_Sub2_6);
			if (local9.method5444() && local13.method5444()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg1.anInt5833, arg1.anInt5833, 0, 0, arg1.anInt5833, arg1.anInt5833, 16384, 9728);
				local9.method5440(local197, arg2);
				local13.method5451(0, this.aClass172_Sub2_21.aClass112_Sub2_7);
				if (local9.method5444() && local13.method5444()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg1.anInt5833, arg1.anInt5833, 0, 0, arg1.anInt5833, arg1.anInt5833, 16384, 9728);
					local9.method5441(0);
					this.aClass172_Sub2_21.method5600(local9);
					local13.method5441(0);
					this.aClass172_Sub2_21.method5575(local13);
					this.aClass172_Sub2_21.method5585(local9);
					local9.method5440(local197, this.aClass112_Sub4_1);
					if (!local9.method5444()) {
						local9.method5441(0);
						local5 = false;
						this.aClass172_Sub2_21.method5556(local9);
						break;
					}
					this.aClass172_Sub2_21.method5569(1);
					this.aClass172_Sub2_21.method5630(this.aClass172_Sub2_21.aClass112_Sub2_7);
					this.aClass172_Sub2_21.method5569(0);
					this.aClass172_Sub2_21.method5630(this.aClass172_Sub2_21.aClass112_Sub2_6);
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
					this.aClass172_Sub2_21.method5569(1);
					this.aClass172_Sub2_21.method5630(null);
					this.aClass172_Sub2_21.method5569(0);
					this.aClass172_Sub2_21.method5630(null);
					local9.method5441(0);
					this.aClass172_Sub2_21.method5556(local9);
					local187++;
					continue;
				}
				local9.method5441(0);
				this.aClass172_Sub2_21.method5600(local9);
				local13.method5441(0);
				this.aClass172_Sub2_21.method5575(local13);
				local5 = false;
				break;
			}
			local9.method5441(0);
			this.aClass172_Sub2_21.method5600(local9);
			local13.method5441(0);
			local5 = false;
			this.aClass172_Sub2_21.method5575(local13);
			break;
		}
		this.aClass172_Sub2_21.method5569(1);
		this.aClass172_Sub2_21.method5591(8448, 8448);
		this.aClass172_Sub2_21.method5569(0);
		OpenGL.glPopAttrib();
		this.aClass172_Sub2_21.pa(Static201.anIntArray354[0], Static201.anIntArray354[1], Static201.anIntArray354[2], Static201.anIntArray354[3]);
		if (local5) {
			this.aClass112_Sub4_1.method4549();
		}
		return local5;
	}
}
