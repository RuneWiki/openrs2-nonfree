import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_14;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "Lclient!sa;")
	private final Class10_Sub3 aClass10_Sub3_2;

	static {
		new Class119("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!ur;I)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass34_Sub2_14 = arg0;
		this.aClass10_Sub3_2 = new Class10_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BFLclient!sa;Lclient!sa;)Z")
	public boolean method2025(@OriginalArg(1) float arg0, @OriginalArg(2) Class10_Sub3 arg1, @OriginalArg(3) Class10_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class158 local11 = this.aClass34_Sub2_14.aClass158_6;
		this.aClass34_Sub2_14.MA(Static397.anIntArray443);
		this.aClass34_Sub2_14.va();
		this.aClass34_Sub2_14.method5529();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass10_Sub3_2.anInt6143, this.aClass10_Sub3_2.anInt6143);
		this.aClass34_Sub2_14.method5555(false);
		this.aClass34_Sub2_14.method5487(false);
		this.aClass34_Sub2_14.method5492(false);
		this.aClass34_Sub2_14.method5546(false);
		this.aClass34_Sub2_14.method5556(-2);
		this.aClass34_Sub2_14.method5507(1);
		this.aClass34_Sub2_14.method5503(0.0F, 0.0F, 0.0F, arg0);
		this.aClass34_Sub2_14.method5526(34165, 34165);
		this.aClass34_Sub2_14.method5493(arg2);
		this.aClass34_Sub2_14.method5507(0);
		this.aClass34_Sub2_14.method5517(1);
		this.aClass34_Sub2_14.method5493(arg1);
		this.aClass34_Sub2_14.method5521(local11);
		for (@Pc(123) int local123 = 0; local123 < 6; local123++) {
			@Pc(130) int local130 = local123 + 34069;
			local11.method3672(this.aClass10_Sub3_2, local130);
			local11.method3666(0);
			if (!local11.method3667()) {
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
		local11.method3659(0);
		this.aClass34_Sub2_14.method5528(local11);
		this.aClass34_Sub2_14.method5507(1);
		this.aClass34_Sub2_14.method5493(null);
		this.aClass34_Sub2_14.method5526(8448, 8448);
		this.aClass34_Sub2_14.method5507(0);
		this.aClass34_Sub2_14.method5493(null);
		OpenGL.glPopAttrib();
		this.aClass34_Sub2_14.ba(Static397.anIntArray443[0], Static397.anIntArray443[1], Static397.anIntArray443[2], Static397.anIntArray443[3]);
		if (local7 && !this.aClass34_Sub2_14.aBoolean767) {
			this.aClass10_Sub3_2.method5934();
		}
		return local7;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Lclient!sa;")
	@Override
	public Class10_Sub3 method2022() {
		return this.aClass10_Sub3_2;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
	public int method2026() {
		return this.aClass10_Sub3_2.anInt6143;
	}
}
