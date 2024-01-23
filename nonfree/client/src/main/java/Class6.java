import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 implements Interface2 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private int anInt96 = -1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class6() {
		if (Static94.aBoolean128) {
			@Pc(11) GL local11 = Static94.aGL1;
			this.anInt96 = local11.glGenLists(2);
			local11.glNewList(this.anInt96, 4864);
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
			local11.glNewList(this.anInt96 + 1, 4864);
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

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	@Override
	public void method3521() {
		@Pc(5) GL local5 = Static94.aGL1;
		Static94.method1607(1);
		if (Static198.aClass4_Sub3_Sub10_6 == null || this.anInt96 < 0 || !Static56.aBoolean66) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt96);
		local5.glActiveTexture(33985);
		Static198.aClass4_Sub3_Sub10_6.method1835();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static230.anInt4404 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static164.anInt3258 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean7 = true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	@Override
	public void method3520() {
		@Pc(5) GL local5 = Static94.aGL1;
		if (this.aBoolean7) {
			local5.glCallList(this.anInt96 + 1);
			this.aBoolean7 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
	@Override
	public int method3522() {
		return 4;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method3523(@OriginalArg(0) int arg0) {
	}
}
