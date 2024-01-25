import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class68_Sub2_Sub2 extends Class68_Sub2 {

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_42;

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "Lclient!hfa;")
	private final Class116_Sub1 aClass116_Sub1_2;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!pc;I)V")
	public Class68_Sub2_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass33_Sub3_42 = arg0;
		this.aClass116_Sub1_2 = new Class116_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class116_Sub1 method8702() {
		return this.aClass116_Sub1_2;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
	public int method8706() {
		return this.aClass116_Sub1_2.anInt3523;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(FLclient!hfa;Lclient!hfa;I)Z")
	public boolean method8709(@OriginalArg(0) float arg0, @OriginalArg(1) Class116_Sub1 arg1, @OriginalArg(2) Class116_Sub1 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class371 local11 = this.aClass33_Sub3_42.aClass371_7;
		this.aClass33_Sub3_42.K(Static301.anIntArray356);
		this.aClass33_Sub3_42.la();
		this.aClass33_Sub3_42.method6316();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass116_Sub1_2.anInt3523, this.aClass116_Sub1_2.anInt3523);
		this.aClass33_Sub3_42.method6317(false);
		this.aClass33_Sub3_42.method6296(false);
		this.aClass33_Sub3_42.method6310(false);
		this.aClass33_Sub3_42.method6312(false);
		this.aClass33_Sub3_42.method6305(-2);
		this.aClass33_Sub3_42.method6329(1);
		this.aClass33_Sub3_42.method6364(0.0F, 0.0F, arg0, 0.0F);
		this.aClass33_Sub3_42.method6365(34165, 34165);
		this.aClass33_Sub3_42.method6340(arg2);
		this.aClass33_Sub3_42.method6329(0);
		this.aClass33_Sub3_42.method6336(1);
		this.aClass33_Sub3_42.method6340(arg1);
		this.aClass33_Sub3_42.method6360(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(124) int local124 = local117 + 34069;
			local11.method8437(this.aClass116_Sub1_2, local124);
			local11.method8439(0);
			if (!local11.method8443()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local124 == 34069) {
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
			} else if (local124 == 34070) {
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
			} else if (local124 == 34071) {
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
			} else if (local124 == 34072) {
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
			} else if (local124 == 34073) {
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
			} else if (local124 == 34074) {
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
		local11.method8447(0);
		this.aClass33_Sub3_42.method6368(local11);
		this.aClass33_Sub3_42.method6329(1);
		this.aClass33_Sub3_42.method6340((Class116) null);
		this.aClass33_Sub3_42.method6365(8448, 8448);
		this.aClass33_Sub3_42.method6329(0);
		this.aClass33_Sub3_42.method6340((Class116) null);
		OpenGL.glPopAttrib();
		this.aClass33_Sub3_42.KA(Static301.anIntArray356[0], Static301.anIntArray356[1], Static301.anIntArray356[2], Static301.anIntArray356[3]);
		if (local7 && !this.aClass33_Sub3_42.aBoolean569) {
			this.aClass116_Sub1_2.method8343();
		}
		return local7;
	}
}
