import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class182 implements Interface2 {

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	private int anInt6081 = -1;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class182() {
		if (Static60.aBoolean112) {
			@Pc(12) GL local12 = Static60.aGL1;
			this.anInt6081 = local12.glGenLists(2);
			local12.glNewList(this.anInt6081, 4864);
			local12.glActiveTexture(33985);
			local12.glTexEnvi(8960, 34161, 34165);
			local12.glTexEnvi(8960, 34178, 34168);
			local12.glTexEnvi(8960, 34162, 7681);
			local12.glTexEnvi(8960, 34184, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			local12.glEnable(34067);
			local12.glActiveTexture(33984);
			local12.glEndList();
			local12.glNewList(this.anInt6081 + 1, 4864);
			local12.glActiveTexture(33985);
			local12.glTexEnvi(8960, 34161, 8448);
			local12.glTexEnvi(8960, 34178, 34166);
			local12.glTexEnvi(8960, 34162, 8448);
			local12.glTexEnvi(8960, 34184, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glDisable(34067);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			local12.glActiveTexture(33984);
			local12.glEndList();
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "()V")
	@Override
	public void method4855() {
		@Pc(1) GL local1 = Static60.aGL1;
		Static60.method1168(1);
		if (Static221.aClass2_Sub3_Sub12_5 == null || this.anInt6081 < 0 || !Static56.aBoolean96) {
			local1.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local1.glCallList(this.anInt6081);
		local1.glActiveTexture(33985);
		Static221.aClass2_Sub3_Sub12_5.method2345();
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glRotatef(-((float) Static75.anInt1615 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local1.glRotatef(-((float) Static266.anInt5529 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local1.glScalef(-1.0F, 1.0F, 1.0F);
		local1.glMatrixMode(5888);
		local1.glActiveTexture(33984);
		this.aBoolean485 = true;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()I")
	@Override
	public int method4854() {
		return 4;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
	@Override
	public void method4853() {
		@Pc(1) GL local1 = Static60.aGL1;
		if (this.aBoolean485) {
			local1.glCallList(this.anInt6081 + 1);
			this.aBoolean485 = false;
		} else {
			local1.glTexEnvi(8960, 34184, 5890);
		}
	}
}
