import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class185_Sub1_Sub1 extends Class185_Sub1 {

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_18;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!dka;")
	private final Class29_Sub2 aClass29_Sub2_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!vf;I)V")
	public Class185_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass100_Sub3_18 = arg0;
		this.aClass29_Sub2_1 = new Class29_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I")
	public int method4314() {
		return this.aClass29_Sub2_1.anInt1663;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLclient!dka;Lclient!dka;F)Z")
	public boolean method4315(@OriginalArg(1) Class29_Sub2 arg0, @OriginalArg(2) Class29_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class219 local11 = this.aClass100_Sub3_18.aClass219_7;
		this.aClass100_Sub3_18.K(Static634.anIntArray586);
		this.aClass100_Sub3_18.la();
		this.aClass100_Sub3_18.method8680();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass29_Sub2_1.anInt1663, this.aClass29_Sub2_1.anInt1663);
		this.aClass100_Sub3_18.method8692(false);
		this.aClass100_Sub3_18.method8720(false);
		this.aClass100_Sub3_18.method8709(false);
		this.aClass100_Sub3_18.method8735(false);
		this.aClass100_Sub3_18.method8693(-2);
		this.aClass100_Sub3_18.method8678(1);
		this.aClass100_Sub3_18.method8701(0.0F, 0.0F, arg2, 0.0F);
		this.aClass100_Sub3_18.method8738(34165, 34165);
		this.aClass100_Sub3_18.method8743(arg0);
		this.aClass100_Sub3_18.method8678(0);
		this.aClass100_Sub3_18.method8671(1);
		this.aClass100_Sub3_18.method8743(arg1);
		this.aClass100_Sub3_18.method8670(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(126) int local126 = local117 + 34069;
			local11.method4970(this.aClass29_Sub2_1, local126);
			local11.method4967(0);
			if (!local11.method4974()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local126 == 34069) {
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
			} else if (local126 == 34070) {
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
			} else if (local126 == 34071) {
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
			} else if (local126 == 34072) {
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
			} else if (local126 == 34073) {
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
			} else if (local126 == 34074) {
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
		local11.method4976(0);
		this.aClass100_Sub3_18.method8748(local11);
		this.aClass100_Sub3_18.method8678(1);
		this.aClass100_Sub3_18.method8743((Class29) null);
		this.aClass100_Sub3_18.method8738(8448, 8448);
		this.aClass100_Sub3_18.method8678(0);
		this.aClass100_Sub3_18.method8743((Class29) null);
		OpenGL.glPopAttrib();
		this.aClass100_Sub3_18.KA(Static634.anIntArray586[0], Static634.anIntArray586[1], Static634.anIntArray586[2], Static634.anIntArray586[3]);
		if (local7 && !this.aClass100_Sub3_18.aBoolean734) {
			this.aClass29_Sub2_1.method8168();
		}
		return local7;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lclient!dka;")
	@Override
	public Class29_Sub2 method8477() {
		return this.aClass29_Sub2_1;
	}
}
