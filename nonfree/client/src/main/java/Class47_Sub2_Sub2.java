import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class47_Sub2_Sub2 extends Class47_Sub2 {

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_38;

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "Lclient!vr;")
	private final Class161_Sub4 aClass161_Sub4_2;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!pi;I)V")
	public Class47_Sub2_Sub2(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass144_Sub3_38 = arg0;
		this.aClass161_Sub4_2 = new Class161_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Lclient!vr;")
	@Override
	public Class161_Sub4 method8702() {
		return this.aClass161_Sub4_2;
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(B)I")
	public int method8703() {
		return this.aClass161_Sub4_2.anInt10753;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILclient!vr;FLclient!vr;)Z")
	public boolean method8705(@OriginalArg(1) Class161_Sub4 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class161_Sub4 arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(17) Class217 local17 = this.aClass144_Sub3_38.aClass217_7;
		this.aClass144_Sub3_38.K(Static624.anIntArray554);
		this.aClass144_Sub3_38.la();
		this.aClass144_Sub3_38.method7020();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass161_Sub4_2.anInt10753, this.aClass161_Sub4_2.anInt10753);
		this.aClass144_Sub3_38.method6977(false);
		this.aClass144_Sub3_38.method7015(false);
		this.aClass144_Sub3_38.method7050(false);
		this.aClass144_Sub3_38.method7040(false);
		this.aClass144_Sub3_38.method7053(-2);
		this.aClass144_Sub3_38.method7028(1);
		this.aClass144_Sub3_38.method7039(arg1, 0.0F, 0.0F, 0.0F);
		this.aClass144_Sub3_38.method7025(34165, 34165);
		this.aClass144_Sub3_38.method6982(arg0);
		this.aClass144_Sub3_38.method7028(0);
		this.aClass144_Sub3_38.method6988(1);
		this.aClass144_Sub3_38.method6982(arg2);
		this.aClass144_Sub3_38.method7006(local17);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(133) int local133 = local125 + 34069;
			local17.method5188(local133, this.aClass161_Sub4_2);
			local17.method5180(0);
			if (!local17.method5184()) {
				local13 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local133 == 34069) {
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
			} else if (local133 == 34070) {
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
			} else if (local133 == 34071) {
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
			} else if (local133 == 34072) {
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
			} else if (local133 == 34073) {
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
			} else if (local133 == 34074) {
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
		local17.method5187(0);
		this.aClass144_Sub3_38.method7030(local17);
		this.aClass144_Sub3_38.method7028(1);
		this.aClass144_Sub3_38.method6982((Class161) null);
		this.aClass144_Sub3_38.method7025(8448, 8448);
		this.aClass144_Sub3_38.method7028(0);
		this.aClass144_Sub3_38.method6982((Class161) null);
		OpenGL.glPopAttrib();
		this.aClass144_Sub3_38.KA(Static624.anIntArray554[0], Static624.anIntArray554[1], Static624.anIntArray554[2], Static624.anIntArray554[3]);
		if (local13 && !this.aClass144_Sub3_38.aBoolean567) {
			this.aClass161_Sub4_2.method9174();
		}
		return local13;
	}
}
