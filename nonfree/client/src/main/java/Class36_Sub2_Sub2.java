import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class36_Sub2_Sub2 extends Class36_Sub2 {

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_33;

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "Lclient!sa;")
	private final Class77_Sub4 aClass77_Sub4_2;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!kga;I)V")
	public Class36_Sub2_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass44_Sub3_33 = arg0;
		this.aClass77_Sub4_2 = new Class77_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(FLclient!sa;BLclient!sa;)Z")
	public boolean method6499(@OriginalArg(0) float arg0, @OriginalArg(1) Class77_Sub4 arg1, @OriginalArg(3) Class77_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class51 local11 = this.aClass44_Sub3_33.aClass51_5;
		this.aClass44_Sub3_33.oa(Static149.anIntArray146);
		this.aClass44_Sub3_33.JA();
		this.aClass44_Sub3_33.method4646();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass77_Sub4_2.anInt8684, this.aClass77_Sub4_2.anInt8684);
		this.aClass44_Sub3_33.method4616(false);
		this.aClass44_Sub3_33.method4642(false);
		this.aClass44_Sub3_33.method4625(false);
		this.aClass44_Sub3_33.method4604(false);
		this.aClass44_Sub3_33.method4661(-2);
		this.aClass44_Sub3_33.method4648(1);
		this.aClass44_Sub3_33.method4656(0.0F, 0.0F, arg0, 0.0F);
		this.aClass44_Sub3_33.method4621(34165, 34165);
		this.aClass44_Sub3_33.method4605(arg2);
		this.aClass44_Sub3_33.method4648(0);
		this.aClass44_Sub3_33.method4658(1);
		this.aClass44_Sub3_33.method4605(arg1);
		this.aClass44_Sub3_33.method4626(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local11.method1098(this.aClass77_Sub4_2, local130);
			local11.method1103(0);
			if (!local11.method1102()) {
				local7 = false;
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
		local11.method1100(0);
		this.aClass44_Sub3_33.method4627(local11);
		this.aClass44_Sub3_33.method4648(1);
		this.aClass44_Sub3_33.method4605(null);
		this.aClass44_Sub3_33.method4621(8448, 8448);
		this.aClass44_Sub3_33.method4648(0);
		this.aClass44_Sub3_33.method4605(null);
		OpenGL.glPopAttrib();
		this.aClass44_Sub3_33.da(Static149.anIntArray146[0], Static149.anIntArray146[1], Static149.anIntArray146[2], Static149.anIntArray146[3]);
		if (local7 && !this.aClass44_Sub3_33.aBoolean414) {
			this.aClass77_Sub4_2.method7067();
		}
		return local7;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I")
	public int method6500() {
		return this.aClass77_Sub4_2.anInt8684;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)Lclient!sa;")
	@Override
	public Class77_Sub4 method6497() {
		return this.aClass77_Sub4_2;
	}
}
