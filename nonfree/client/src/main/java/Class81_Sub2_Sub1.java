import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class81_Sub2_Sub1 extends Class81_Sub2 {

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_28;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "Lclient!gfa;")
	private final Class44_Sub2 aClass44_Sub2_1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public Class81_Sub2_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass75_Sub3_28 = arg0;
		this.aClass44_Sub2_1 = new Class44_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Lclient!gfa;")
	@Override
	public Class44_Sub2 method7366() {
		return this.aClass44_Sub2_1;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
	public int method5410() {
		return this.aClass44_Sub2_1.anInt3805;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(FILclient!gfa;Lclient!gfa;)Z")
	public boolean method5412(@OriginalArg(0) float arg0, @OriginalArg(2) Class44_Sub2 arg1, @OriginalArg(3) Class44_Sub2 arg2) {
		@Pc(16) boolean local16 = true;
		@Pc(20) Class146 local20 = this.aClass75_Sub3_28.aClass146_2;
		this.aClass75_Sub3_28.K(Static8.anIntArray8);
		this.aClass75_Sub3_28.la();
		this.aClass75_Sub3_28.method5772();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass44_Sub2_1.anInt3805, this.aClass44_Sub2_1.anInt3805);
		this.aClass75_Sub3_28.method5829(false);
		this.aClass75_Sub3_28.method5840(false);
		this.aClass75_Sub3_28.method5796(false);
		this.aClass75_Sub3_28.method5788(false);
		this.aClass75_Sub3_28.method5781(-2);
		this.aClass75_Sub3_28.method5775(1);
		this.aClass75_Sub3_28.method5815(0.0F, arg0, 0.0F, 0.0F);
		this.aClass75_Sub3_28.method5784(34165, 34165);
		this.aClass75_Sub3_28.method5774(arg1);
		this.aClass75_Sub3_28.method5775(0);
		this.aClass75_Sub3_28.method5787(1);
		this.aClass75_Sub3_28.method5774(arg2);
		this.aClass75_Sub3_28.method5769(local20);
		for (@Pc(128) int local128 = 0; local128 < 6; local128++) {
			@Pc(136) int local136 = local128 + 34069;
			local20.method3879(this.aClass44_Sub2_1, local136);
			local20.method3885(0);
			if (!local20.method3884()) {
				local16 = false;
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
		local20.method3887(0);
		this.aClass75_Sub3_28.method5791(local20);
		this.aClass75_Sub3_28.method5775(1);
		this.aClass75_Sub3_28.method5774((Class44) null);
		this.aClass75_Sub3_28.method5784(8448, 8448);
		this.aClass75_Sub3_28.method5775(0);
		this.aClass75_Sub3_28.method5774((Class44) null);
		OpenGL.glPopAttrib();
		this.aClass75_Sub3_28.KA(Static8.anIntArray8[0], Static8.anIntArray8[1], Static8.anIntArray8[2], Static8.anIntArray8[3]);
		if (local16 && !this.aClass75_Sub3_28.aBoolean484) {
			this.aClass44_Sub2_1.method9008();
		}
		return local16;
	}
}
