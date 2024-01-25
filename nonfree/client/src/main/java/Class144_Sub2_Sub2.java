import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class144_Sub2_Sub2 extends Class144_Sub2 {

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_41;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!qba;")
	private final Class66_Sub4 aClass66_Sub4_2;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!qfa;I)V")
	public Class144_Sub2_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass137_Sub3_41 = arg0;
		this.aClass66_Sub4_2 = new Class66_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Lclient!qba;")
	@Override
	public Class66_Sub4 method8465() {
		return this.aClass66_Sub4_2;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I")
	public int method8467() {
		return this.aClass66_Sub4_2.anInt8233;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FI)Z")
	public boolean method8468(@OriginalArg(0) Class66_Sub4 arg0, @OriginalArg(1) Class66_Sub4 arg1, @OriginalArg(2) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class125 local11 = this.aClass137_Sub3_41.aClass125_7;
		this.aClass137_Sub3_41.K(Static370.anIntArray770);
		this.aClass137_Sub3_41.la();
		this.aClass137_Sub3_41.method7087();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass66_Sub4_2.anInt8233, this.aClass66_Sub4_2.anInt8233);
		this.aClass137_Sub3_41.method7079(false);
		this.aClass137_Sub3_41.method7038(false);
		this.aClass137_Sub3_41.method7067(false);
		this.aClass137_Sub3_41.method7073(false);
		this.aClass137_Sub3_41.method7029(-2);
		this.aClass137_Sub3_41.method7095(1);
		this.aClass137_Sub3_41.method7051(arg2, 0.0F, 0.0F, 0.0F);
		this.aClass137_Sub3_41.method7084(34165, 34165);
		this.aClass137_Sub3_41.method7090(arg1);
		this.aClass137_Sub3_41.method7095(0);
		this.aClass137_Sub3_41.method7077(1);
		this.aClass137_Sub3_41.method7090(arg0);
		this.aClass137_Sub3_41.method7058(local11);
		for (@Pc(129) int local129 = 0; local129 < 6; local129++) {
			@Pc(136) int local136 = local129 + 34069;
			local11.method2967(this.aClass66_Sub4_2, local136);
			local11.method2969(0);
			if (!local11.method2968()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local136 == 34069) {
				OpenGL.glTexCoord3i(65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local136 == 34070) {
				OpenGL.glTexCoord3i(-65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local136 == 34071) {
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local136 == 34072) {
				OpenGL.glTexCoord3i(-65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local136 == 34073) {
				OpenGL.glTexCoord3i(-65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local136 == 34074) {
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local11.method2965(0);
		this.aClass137_Sub3_41.method7037(local11);
		this.aClass137_Sub3_41.method7095(1);
		this.aClass137_Sub3_41.method7090((Class66) null);
		this.aClass137_Sub3_41.method7084(8448, 8448);
		this.aClass137_Sub3_41.method7095(0);
		this.aClass137_Sub3_41.method7090((Class66) null);
		OpenGL.glPopAttrib();
		this.aClass137_Sub3_41.KA(Static370.anIntArray770[0], Static370.anIntArray770[1], Static370.anIntArray770[2], Static370.anIntArray770[3]);
		if (local7 && !this.aClass137_Sub3_41.aBoolean600) {
			this.aClass66_Sub4_2.method6854();
		}
		return local7;
	}
}
