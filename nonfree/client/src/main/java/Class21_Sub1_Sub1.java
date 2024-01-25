import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class21_Sub1_Sub1 extends Class21_Sub1 {

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_29;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "Lclient!ef;")
	private final Class65_Sub1 aClass65_Sub1_1;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!bo;I)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass26_Sub1_29 = arg0;
		this.aClass65_Sub1_1 = new Class65_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ef;FLclient!ef;)Z")
	public boolean method4673(@OriginalArg(1) Class65_Sub1 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class65_Sub1 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class200 local11 = this.aClass26_Sub1_29.aClass200_2;
		@Pc(15) Class200 local15 = this.aClass26_Sub1_29.aClass200_1;
		if (arg0.anInt2060 != this.aClass26_Sub1_29.aClass65_Sub3_2.anInt2642 || arg0.anInt2060 != this.aClass26_Sub1_29.aClass65_Sub3_2.anInt2641) {
			this.aClass26_Sub1_29.aClass65_Sub3_2 = new Class65_Sub3(this.aClass26_Sub1_29, 3553, 6408, arg0.anInt2060, arg0.anInt2060);
		}
		if (this.aClass26_Sub1_29.aClass65_Sub3_3.anInt2642 != arg2.anInt2060 || arg2.anInt2060 != this.aClass26_Sub1_29.aClass65_Sub3_3.anInt2641) {
			this.aClass26_Sub1_29.aClass65_Sub3_3 = new Class65_Sub3(this.aClass26_Sub1_29, 3553, 6408, arg2.anInt2060, arg2.anInt2060);
		}
		this.aClass26_Sub1_29.u(Static24.anIntArray31);
		this.aClass26_Sub1_29.va();
		this.aClass26_Sub1_29.method688();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass65_Sub1_1.anInt2060, this.aClass65_Sub1_1.anInt2060);
		this.aClass26_Sub1_29.method638(false);
		this.aClass26_Sub1_29.method662(false);
		this.aClass26_Sub1_29.method675(false);
		this.aClass26_Sub1_29.method644(false);
		this.aClass26_Sub1_29.method628(-2);
		this.aClass26_Sub1_29.method696(1);
		this.aClass26_Sub1_29.method659(0.0F, arg1, 0.0F, 0.0F);
		this.aClass26_Sub1_29.method695(34165, 34165);
		this.aClass26_Sub1_29.method673(null);
		this.aClass26_Sub1_29.method696(0);
		this.aClass26_Sub1_29.method669(1);
		this.aClass26_Sub1_29.method673(null);
		@Pc(189) int local189 = 0;
		while (local189 < 6) {
			this.aClass26_Sub1_29.method703(local11);
			@Pc(200) int local200 = local189 + 34069;
			local11.method4545(local200, arg0);
			this.aClass26_Sub1_29.method684(local15);
			local15.method4549(0, this.aClass26_Sub1_29.aClass65_Sub3_2);
			if (local11.method4552() && local15.method4552()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg0.anInt2060, arg0.anInt2060, 0, 0, arg0.anInt2060, arg0.anInt2060, 16384, 9728);
				local11.method4545(local200, arg2);
				local15.method4549(0, this.aClass26_Sub1_29.aClass65_Sub3_3);
				if (local11.method4552() && local15.method4552()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg0.anInt2060, arg0.anInt2060, 0, 0, arg0.anInt2060, arg0.anInt2060, 16384, 9728);
					local11.method4548(0);
					this.aClass26_Sub1_29.method676(local11);
					local15.method4548(0);
					this.aClass26_Sub1_29.method681(local15);
					this.aClass26_Sub1_29.method631(local11);
					local11.method4545(local200, this.aClass65_Sub1_1);
					if (!local11.method4552()) {
						local11.method4548(0);
						local7 = false;
						this.aClass26_Sub1_29.method635(local11);
						break;
					}
					this.aClass26_Sub1_29.method696(1);
					this.aClass26_Sub1_29.method673(this.aClass26_Sub1_29.aClass65_Sub3_3);
					this.aClass26_Sub1_29.method696(0);
					this.aClass26_Sub1_29.method673(this.aClass26_Sub1_29.aClass65_Sub3_2);
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
					this.aClass26_Sub1_29.method696(1);
					this.aClass26_Sub1_29.method673(null);
					this.aClass26_Sub1_29.method696(0);
					this.aClass26_Sub1_29.method673(null);
					local11.method4548(0);
					this.aClass26_Sub1_29.method635(local11);
					local189++;
					continue;
				}
				local11.method4548(0);
				this.aClass26_Sub1_29.method676(local11);
				local15.method4548(0);
				this.aClass26_Sub1_29.method681(local15);
				local7 = false;
				break;
			}
			local11.method4548(0);
			this.aClass26_Sub1_29.method676(local11);
			local15.method4548(0);
			local7 = false;
			this.aClass26_Sub1_29.method681(local15);
			break;
		}
		this.aClass26_Sub1_29.method696(1);
		this.aClass26_Sub1_29.method695(8448, 8448);
		this.aClass26_Sub1_29.method696(0);
		OpenGL.glPopAttrib();
		this.aClass26_Sub1_29.pa(Static24.anIntArray31[0], Static24.anIntArray31[1], Static24.anIntArray31[2], Static24.anIntArray31[3]);
		if (local7) {
			this.aClass65_Sub1_1.method4265();
		}
		return local7;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)Lclient!ef;")
	@Override
	public Class65_Sub1 method5279() {
		return this.aClass65_Sub1_1;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)I")
	public int method4676() {
		return this.aClass65_Sub1_1.anInt2060;
	}
}
