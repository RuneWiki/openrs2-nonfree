import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class44 implements Interface1 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt1489 = -1;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class44() {
		if (Static296.aBoolean345) {
			@Pc(12) GL local12 = Static296.aGL1;
			this.anInt1489 = local12.glGenLists(2);
			local12.glNewList(this.anInt1489, 4864);
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
			local12.glNewList(this.anInt1489 + 1, 4864);
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

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	@Override
	public void method3557() {
		@Pc(1) GL local1 = Static296.aGL1;
		Static296.method4823(1);
		if (Static178.aClass1_Sub2_Sub21_6 == null || this.anInt1489 < 0 || !Static10.aBoolean12) {
			local1.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local1.glCallList(this.anInt1489);
		local1.glActiveTexture(33985);
		Static178.aClass1_Sub2_Sub21_6.method4603();
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glRotatef(-((float) Static202.anInt4499 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local1.glRotatef(-((float) Static130.anInt2891 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local1.glScalef(-1.0F, 1.0F, 1.0F);
		local1.glMatrixMode(5888);
		local1.glActiveTexture(33984);
		this.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	public void method3556(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()V")
	@Override
	public void method3559() {
		@Pc(1) GL local1 = Static296.aGL1;
		if (this.aBoolean85) {
			local1.glCallList(this.anInt1489 + 1);
			this.aBoolean85 = false;
		} else {
			local1.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()I")
	@Override
	public int method3558() {
		return 4;
	}
}
