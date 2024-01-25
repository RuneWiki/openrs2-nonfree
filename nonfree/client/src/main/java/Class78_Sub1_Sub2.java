import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class78_Sub1_Sub2 extends Class78_Sub1 {

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_27;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Lclient!il;")
	private final Class13_Sub4 aClass13_Sub4_2;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ht;I)V")
	public Class78_Sub1_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass109_Sub1_27 = arg0;
		this.aClass13_Sub4_2 = new Class13_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IFLclient!il;Lclient!il;)Z")
	public boolean method3278(@OriginalArg(1) float arg0, @OriginalArg(2) Class13_Sub4 arg1, @OriginalArg(3) Class13_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class150 local11 = this.aClass109_Sub1_27.aClass150_6;
		@Pc(15) Class150 local15 = this.aClass109_Sub1_27.aClass150_7;
		if (this.aClass109_Sub1_27.aClass13_Sub1_6.anInt1238 != arg2.anInt3214 || arg2.anInt3214 != this.aClass109_Sub1_27.aClass13_Sub1_6.anInt1239) {
			this.aClass109_Sub1_27.aClass13_Sub1_6 = new Class13_Sub1(this.aClass109_Sub1_27, 3553, 6408, arg2.anInt3214, arg2.anInt3214);
		}
		if (arg1.anInt3214 != this.aClass109_Sub1_27.aClass13_Sub1_5.anInt1238 || this.aClass109_Sub1_27.aClass13_Sub1_5.anInt1239 != arg1.anInt3214) {
			this.aClass109_Sub1_27.aClass13_Sub1_5 = new Class13_Sub1(this.aClass109_Sub1_27, 3553, 6408, arg1.anInt3214, arg1.anInt3214);
		}
		this.aClass109_Sub1_27.u(Static401.anIntArray661);
		this.aClass109_Sub1_27.va();
		this.aClass109_Sub1_27.method2570();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass13_Sub4_2.anInt3214, this.aClass13_Sub4_2.anInt3214);
		this.aClass109_Sub1_27.method2561(false);
		this.aClass109_Sub1_27.method2599(false);
		this.aClass109_Sub1_27.method2577(false);
		this.aClass109_Sub1_27.method2597(false);
		this.aClass109_Sub1_27.method2532(-2);
		this.aClass109_Sub1_27.method2564(1);
		this.aClass109_Sub1_27.method2540(arg0, 0.0F, 0.0F, 0.0F);
		this.aClass109_Sub1_27.method2549(34165, 34165);
		this.aClass109_Sub1_27.method2578(null);
		this.aClass109_Sub1_27.method2564(0);
		this.aClass109_Sub1_27.method2531(1);
		this.aClass109_Sub1_27.method2578(null);
		@Pc(192) int local192 = 0;
		while (local192 < 6) {
			@Pc(199) int local199 = local192 + 34069;
			this.aClass109_Sub1_27.method2533(local11);
			local11.method3524(local199, arg2);
			this.aClass109_Sub1_27.method2588(local15);
			local15.method3527(this.aClass109_Sub1_27.aClass13_Sub1_6, 0);
			if (local11.method3526() && local15.method3526()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt3214, arg2.anInt3214, 0, 0, arg2.anInt3214, arg2.anInt3214, 16384, 9728);
				local11.method3524(local199, arg1);
				local15.method3527(this.aClass109_Sub1_27.aClass13_Sub1_5, 0);
				if (local11.method3526() && local15.method3526()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt3214, arg2.anInt3214, 0, 0, arg2.anInt3214, arg2.anInt3214, 16384, 9728);
					local11.method3525(0);
					this.aClass109_Sub1_27.method2575(local11);
					local15.method3525(0);
					this.aClass109_Sub1_27.method2581(local15);
					this.aClass109_Sub1_27.method2600(local11);
					local11.method3524(local199, this.aClass13_Sub4_2);
					if (!local11.method3526()) {
						local11.method3525(0);
						local7 = false;
						this.aClass109_Sub1_27.method2591(local11);
						break;
					}
					this.aClass109_Sub1_27.method2564(1);
					this.aClass109_Sub1_27.method2578(this.aClass109_Sub1_27.aClass13_Sub1_5);
					this.aClass109_Sub1_27.method2564(0);
					this.aClass109_Sub1_27.method2578(this.aClass109_Sub1_27.aClass13_Sub1_6);
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
					this.aClass109_Sub1_27.method2564(1);
					this.aClass109_Sub1_27.method2578(null);
					this.aClass109_Sub1_27.method2564(0);
					this.aClass109_Sub1_27.method2578(null);
					local11.method3525(0);
					this.aClass109_Sub1_27.method2591(local11);
					local192++;
					continue;
				}
				local11.method3525(0);
				this.aClass109_Sub1_27.method2575(local11);
				local15.method3525(0);
				this.aClass109_Sub1_27.method2581(local15);
				local7 = false;
				break;
			}
			local11.method3525(0);
			this.aClass109_Sub1_27.method2575(local11);
			local15.method3525(0);
			local7 = false;
			this.aClass109_Sub1_27.method2581(local15);
			break;
		}
		this.aClass109_Sub1_27.method2564(1);
		this.aClass109_Sub1_27.method2549(8448, 8448);
		this.aClass109_Sub1_27.method2564(0);
		OpenGL.glPopAttrib();
		this.aClass109_Sub1_27.pa(Static401.anIntArray661[0], Static401.anIntArray661[1], Static401.anIntArray661[2], Static401.anIntArray661[3]);
		if (local7) {
			this.aClass13_Sub4_2.method2740();
		}
		return local7;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)I")
	public int method3279() {
		return this.aClass13_Sub4_2.anInt3214;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lclient!il;")
	@Override
	public Class13_Sub4 method3277() {
		return this.aClass13_Sub4_2;
	}
}
