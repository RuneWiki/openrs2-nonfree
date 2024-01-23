import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class49 implements Interface4 {

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private int anInt1426 = -1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class49() {
		if (Static294.aBoolean375) {
			@Pc(11) GL local11 = Static294.aGL1;
			this.anInt1426 = local11.glGenLists(2);
			local11.glNewList(this.anInt1426, 4864);
			local11.glActiveTexture(33985);
			local11.glTexEnvi(8960, 34161, 34165);
			local11.glTexEnvi(8960, 34178, 34168);
			local11.glTexEnvi(8960, 34162, 7681);
			local11.glTexEnvi(8960, 34184, 34167);
			local11.glTexGeni(8192, 9472, 34066);
			local11.glTexGeni(8193, 9472, 34066);
			local11.glTexGeni(8194, 9472, 34066);
			local11.glEnable(3168);
			local11.glEnable(3169);
			local11.glEnable(3170);
			local11.glEnable(34067);
			local11.glActiveTexture(33984);
			local11.glEndList();
			local11.glNewList(this.anInt1426 + 1, 4864);
			local11.glActiveTexture(33985);
			local11.glTexEnvi(8960, 34161, 8448);
			local11.glTexEnvi(8960, 34178, 34166);
			local11.glTexEnvi(8960, 34162, 8448);
			local11.glTexEnvi(8960, 34184, 5890);
			local11.glDisable(3168);
			local11.glDisable(3169);
			local11.glDisable(3170);
			local11.glDisable(34067);
			local11.glMatrixMode(5890);
			local11.glLoadIdentity();
			local11.glMatrixMode(5888);
			local11.glActiveTexture(33984);
			local11.glEndList();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	@Override
	public void method3791() {
		@Pc(5) GL local5 = Static294.aGL1;
		if (this.aBoolean98) {
			local5.glCallList(this.anInt1426 + 1);
			this.aBoolean98 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	public int method3793() {
		return 4;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	@Override
	public void method3794() {
		@Pc(1) GL local1 = Static294.aGL1;
		Static294.method4490(1);
		if (Static59.aClass1_Sub3_Sub24_1 == null || this.anInt1426 < 0 || !Static65.aBoolean96) {
			local1.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local1.glCallList(this.anInt1426);
		local1.glActiveTexture(33985);
		Static59.aClass1_Sub3_Sub24_1.method4657();
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glRotatef(-((float) Static162.anInt3539 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local1.glRotatef(-((float) Static279.anInt5608 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local1.glScalef(-1.0F, 1.0F, 1.0F);
		local1.glMatrixMode(5888);
		local1.glActiveTexture(33984);
		this.aBoolean98 = true;
	}
}
