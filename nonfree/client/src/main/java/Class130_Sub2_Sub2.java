import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class130_Sub2_Sub2 extends Class130_Sub2 {

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_23;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "Lclient!io;")
	private final Class167_Sub1 aClass167_Sub1_2;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!rs;I)V")
	public Class130_Sub2_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass133_Sub3_23 = arg0;
		this.aClass167_Sub1_2 = new Class167_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(B)I")
	public int method5479() {
		return this.aClass167_Sub1_2.anInt4402;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class167_Sub1 method5475() {
		return this.aClass167_Sub1_2;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BFLclient!io;Lclient!io;)Z")
	public boolean method5481(@OriginalArg(1) float arg0, @OriginalArg(2) Class167_Sub1 arg1, @OriginalArg(3) Class167_Sub1 arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class186 local16 = this.aClass133_Sub3_23.aClass186_5;
		this.aClass133_Sub3_23.K(Static566.anIntArray524);
		this.aClass133_Sub3_23.la();
		this.aClass133_Sub3_23.method7379();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass167_Sub1_2.anInt4402, this.aClass167_Sub1_2.anInt4402);
		this.aClass133_Sub3_23.method7325(false);
		this.aClass133_Sub3_23.method7359(false);
		this.aClass133_Sub3_23.method7386(false);
		this.aClass133_Sub3_23.method7346(false);
		this.aClass133_Sub3_23.method7395(-2);
		this.aClass133_Sub3_23.method7368(1);
		this.aClass133_Sub3_23.method7397(0.0F, 0.0F, 0.0F, arg0);
		this.aClass133_Sub3_23.method7342(34165, 34165);
		this.aClass133_Sub3_23.method7375(arg2);
		this.aClass133_Sub3_23.method7368(0);
		this.aClass133_Sub3_23.method7401(1);
		this.aClass133_Sub3_23.method7375(arg1);
		this.aClass133_Sub3_23.method7390(local16);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local16.method4335(local130, this.aClass167_Sub1_2);
			local16.method4342(0);
			if (!local16.method4344()) {
				local12 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local130 == 34069) {
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
			} else if (local130 == 34070) {
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
			} else if (local130 == 34071) {
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
			} else if (local130 == 34072) {
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
			} else if (local130 == 34073) {
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
			} else if (local130 == 34074) {
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
		local16.method4345(0);
		this.aClass133_Sub3_23.method7363(local16);
		this.aClass133_Sub3_23.method7368(1);
		this.aClass133_Sub3_23.method7375(null);
		this.aClass133_Sub3_23.method7342(8448, 8448);
		this.aClass133_Sub3_23.method7368(0);
		this.aClass133_Sub3_23.method7375(null);
		OpenGL.glPopAttrib();
		this.aClass133_Sub3_23.KA(Static566.anIntArray524[0], Static566.anIntArray524[1], Static566.anIntArray524[2], Static566.anIntArray524[3]);
		if (local12 && !this.aClass133_Sub3_23.aBoolean636) {
			this.aClass167_Sub1_2.method8003();
		}
		return local12;
	}
}
