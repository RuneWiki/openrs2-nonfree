import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7_Sub1_Sub1 extends Class7_Sub1 {

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_1;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!lm;")
	private final Class42_Sub3 aClass42_Sub3_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!gk;I)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass75_Sub2_1 = arg0;
		this.aClass42_Sub3_1 = new Class42_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lclient!lm;")
	@Override
	public Class42_Sub3 method1775() {
		return this.aClass42_Sub3_1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(FLclient!lm;Lclient!lm;I)Z")
	public boolean method159(@OriginalArg(0) float arg0, @OriginalArg(1) Class42_Sub3 arg1, @OriginalArg(2) Class42_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class122 local11 = this.aClass75_Sub2_1.aClass122_2;
		@Pc(15) Class122 local15 = this.aClass75_Sub2_1.aClass122_1;
		if (arg2.anInt4538 != this.aClass75_Sub2_1.aClass42_Sub1_2.anInt1533 || this.aClass75_Sub2_1.aClass42_Sub1_2.anInt1539 != arg2.anInt4538) {
			this.aClass75_Sub2_1.aClass42_Sub1_2 = new Class42_Sub1(this.aClass75_Sub2_1, 3553, 6408, arg2.anInt4538, arg2.anInt4538);
		}
		if (arg1.anInt4538 != this.aClass75_Sub2_1.aClass42_Sub1_3.anInt1533 || this.aClass75_Sub2_1.aClass42_Sub1_3.anInt1539 != arg1.anInt4538) {
			this.aClass75_Sub2_1.aClass42_Sub1_3 = new Class42_Sub1(this.aClass75_Sub2_1, 3553, 6408, arg1.anInt4538, arg1.anInt4538);
		}
		this.aClass75_Sub2_1.u(Static404.anIntArray497);
		this.aClass75_Sub2_1.va();
		this.aClass75_Sub2_1.method2461();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass42_Sub3_1.anInt4538, this.aClass42_Sub3_1.anInt4538);
		this.aClass75_Sub2_1.method2451(false);
		this.aClass75_Sub2_1.method2482(false);
		this.aClass75_Sub2_1.method2485(false);
		this.aClass75_Sub2_1.method2467(false);
		this.aClass75_Sub2_1.method2440(-2);
		this.aClass75_Sub2_1.method2426(1);
		this.aClass75_Sub2_1.method2486(arg0, 0.0F, 0.0F, 0.0F);
		this.aClass75_Sub2_1.method2479(34165, 34165);
		this.aClass75_Sub2_1.method2456(null);
		this.aClass75_Sub2_1.method2426(0);
		this.aClass75_Sub2_1.method2424(1);
		this.aClass75_Sub2_1.method2456(null);
		@Pc(180) int local180 = 0;
		while (local180 < 6) {
			this.aClass75_Sub2_1.method2407(local11);
			@Pc(191) int local191 = local180 + 34069;
			local11.method3173(local191, arg2);
			this.aClass75_Sub2_1.method2425(local15);
			local15.method3168(this.aClass75_Sub2_1.aClass42_Sub1_2, 0);
			if (local11.method3174() && local15.method3174()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt4538, arg2.anInt4538, 0, 0, arg2.anInt4538, arg2.anInt4538, 16384, 9728);
				local11.method3173(local191, arg1);
				local15.method3168(this.aClass75_Sub2_1.aClass42_Sub1_3, 0);
				if (local11.method3174() && local15.method3174()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt4538, arg2.anInt4538, 0, 0, arg2.anInt4538, arg2.anInt4538, 16384, 9728);
					local11.method3165(0);
					this.aClass75_Sub2_1.method2442(local11);
					local15.method3165(0);
					this.aClass75_Sub2_1.method2409(local15);
					this.aClass75_Sub2_1.method2432(local11);
					local11.method3173(local191, this.aClass42_Sub3_1);
					if (!local11.method3174()) {
						local11.method3165(0);
						this.aClass75_Sub2_1.method2455(local11);
						local7 = false;
						break;
					}
					this.aClass75_Sub2_1.method2426(1);
					this.aClass75_Sub2_1.method2456(this.aClass75_Sub2_1.aClass42_Sub1_3);
					this.aClass75_Sub2_1.method2426(0);
					this.aClass75_Sub2_1.method2456(this.aClass75_Sub2_1.aClass42_Sub1_2);
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
					this.aClass75_Sub2_1.method2426(1);
					this.aClass75_Sub2_1.method2456(null);
					this.aClass75_Sub2_1.method2426(0);
					this.aClass75_Sub2_1.method2456(null);
					local11.method3165(0);
					this.aClass75_Sub2_1.method2455(local11);
					local180++;
					continue;
				}
				local11.method3165(0);
				this.aClass75_Sub2_1.method2442(local11);
				local15.method3165(0);
				this.aClass75_Sub2_1.method2409(local15);
				local7 = false;
				break;
			}
			local11.method3165(0);
			this.aClass75_Sub2_1.method2442(local11);
			local15.method3165(0);
			this.aClass75_Sub2_1.method2409(local15);
			local7 = false;
			break;
		}
		this.aClass75_Sub2_1.method2426(1);
		this.aClass75_Sub2_1.method2479(8448, 8448);
		this.aClass75_Sub2_1.method2426(0);
		OpenGL.glPopAttrib();
		this.aClass75_Sub2_1.pa(Static404.anIntArray497[0], Static404.anIntArray497[1], Static404.anIntArray497[2], Static404.anIntArray497[3]);
		if (local7) {
			this.aClass42_Sub3_1.method4917();
		}
		return local7;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
	public int method163() {
		return this.aClass42_Sub3_1.anInt4538;
	}
}
