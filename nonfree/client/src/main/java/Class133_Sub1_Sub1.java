import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class133_Sub1_Sub1 extends Class133_Sub1 {

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_27;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!sl;")
	private final Class40_Sub4 aClass40_Sub4_1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!bl;I)V")
	public Class133_Sub1_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass28_Sub1_27 = arg0;
		this.aClass40_Sub4_1 = new Class40_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!sl;BLclient!sl;F)Z")
	public boolean method4244(@OriginalArg(0) Class40_Sub4 arg0, @OriginalArg(2) Class40_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class166 local11 = this.aClass28_Sub1_27.aClass166_1;
		@Pc(15) Class166 local15 = this.aClass28_Sub1_27.aClass166_2;
		if (arg0.anInt6165 != this.aClass28_Sub1_27.aClass40_Sub3_2.anInt3372 || arg0.anInt6165 != this.aClass28_Sub1_27.aClass40_Sub3_2.anInt3370) {
			this.aClass28_Sub1_27.aClass40_Sub3_2 = new Class40_Sub3(this.aClass28_Sub1_27, 3553, 6408, arg0.anInt6165, arg0.anInt6165);
		}
		if (this.aClass28_Sub1_27.aClass40_Sub3_3.anInt3372 != arg1.anInt6165 || arg1.anInt6165 != this.aClass28_Sub1_27.aClass40_Sub3_3.anInt3370) {
			this.aClass28_Sub1_27.aClass40_Sub3_3 = new Class40_Sub3(this.aClass28_Sub1_27, 3553, 6408, arg1.anInt6165, arg1.anInt6165);
		}
		this.aClass28_Sub1_27.method3524(Static73.anIntArray157);
		this.aClass28_Sub1_27.method3554();
		this.aClass28_Sub1_27.method656();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass40_Sub4_1.anInt6165, this.aClass40_Sub4_1.anInt6165);
		this.aClass28_Sub1_27.method677(false);
		this.aClass28_Sub1_27.method668(false);
		this.aClass28_Sub1_27.method670(false);
		this.aClass28_Sub1_27.method666(false);
		this.aClass28_Sub1_27.method718(-2);
		this.aClass28_Sub1_27.method650(1);
		this.aClass28_Sub1_27.method704(0.0F, 0.0F, 0.0F, arg2);
		this.aClass28_Sub1_27.method692(34165, 34165);
		this.aClass28_Sub1_27.method654(null);
		this.aClass28_Sub1_27.method650(0);
		this.aClass28_Sub1_27.method678(1);
		this.aClass28_Sub1_27.method654(null);
		@Pc(184) int local184 = 0;
		while (local184 < 6) {
			this.aClass28_Sub1_27.method660(local11);
			@Pc(196) int local196 = local184 + 34069;
			local11.method3769(local196, arg0);
			this.aClass28_Sub1_27.method664(local15);
			local15.method3761(0, this.aClass28_Sub1_27.aClass40_Sub3_2);
			if (local11.method3758() && local15.method3758()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg0.anInt6165, arg0.anInt6165, 0, 0, arg0.anInt6165, arg0.anInt6165, 16384, 9728);
				local11.method3769(local196, arg1);
				local15.method3761(0, this.aClass28_Sub1_27.aClass40_Sub3_3);
				if (local11.method3758() && local15.method3758()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg0.anInt6165, arg0.anInt6165, 0, 0, arg0.anInt6165, arg0.anInt6165, 16384, 9728);
					local11.method3763(0);
					this.aClass28_Sub1_27.method687(local11);
					local15.method3763(0);
					this.aClass28_Sub1_27.method663(local15);
					this.aClass28_Sub1_27.method680(local11);
					local11.method3769(local196, this.aClass40_Sub4_1);
					if (!local11.method3758()) {
						local11.method3763(0);
						local7 = false;
						this.aClass28_Sub1_27.method659(local11);
						break;
					}
					this.aClass28_Sub1_27.method650(1);
					this.aClass28_Sub1_27.method654(this.aClass28_Sub1_27.aClass40_Sub3_3);
					this.aClass28_Sub1_27.method650(0);
					this.aClass28_Sub1_27.method654(this.aClass28_Sub1_27.aClass40_Sub3_2);
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
					this.aClass28_Sub1_27.method650(1);
					this.aClass28_Sub1_27.method654(null);
					this.aClass28_Sub1_27.method650(0);
					this.aClass28_Sub1_27.method654(null);
					local11.method3763(0);
					this.aClass28_Sub1_27.method659(local11);
					local184++;
					continue;
				}
				local11.method3763(0);
				this.aClass28_Sub1_27.method687(local11);
				local15.method3763(0);
				local7 = false;
				this.aClass28_Sub1_27.method663(local15);
				break;
			}
			local11.method3763(0);
			this.aClass28_Sub1_27.method687(local11);
			local15.method3763(0);
			this.aClass28_Sub1_27.method663(local15);
			local7 = false;
			break;
		}
		this.aClass28_Sub1_27.method650(1);
		this.aClass28_Sub1_27.method692(8448, 8448);
		this.aClass28_Sub1_27.method650(0);
		OpenGL.glPopAttrib();
		this.aClass28_Sub1_27.method3570(Static73.anIntArray157[0], Static73.anIntArray157[1], Static73.anIntArray157[2], Static73.anIntArray157[3]);
		if (local7) {
			this.aClass40_Sub4_1.method5145();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!sl;")
	@Override
	public Class40_Sub4 method4772() {
		return this.aClass40_Sub4_1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I")
	public int method4249() {
		return this.aClass40_Sub4_1.anInt6165;
	}
}
