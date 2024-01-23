import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class87 implements Interface2 {

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	private int anInt2460 = -1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class87() {
		if (Static291.aBoolean408) {
			@Pc(11) GL local11 = Static291.aGL1;
			this.anInt2460 = local11.glGenLists(2);
			local11.glNewList(this.anInt2460, 4864);
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
			local11.glNewList(this.anInt2460 + 1, 4864);
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

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	@Override
	public void method3763(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
	@Override
	public void method3762() {
		@Pc(1) GL local1 = Static291.aGL1;
		Static291.method4323(1);
		if (Static188.aClass1_Sub1_Sub16_5 == null || this.anInt2460 < 0 || !Static302.aBoolean419) {
			local1.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local1.glCallList(this.anInt2460);
		local1.glActiveTexture(33985);
		Static188.aClass1_Sub1_Sub16_5.method3197();
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glRotatef(-((float) Static245.anInt2367 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local1.glRotatef(-((float) Static115.anInt2284 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local1.glScalef(-1.0F, 1.0F, 1.0F);
		local1.glMatrixMode(5888);
		local1.glActiveTexture(33984);
		this.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
	@Override
	public void method3761() {
		@Pc(5) GL local5 = Static291.aGL1;
		if (this.aBoolean184) {
			local5.glCallList(this.anInt2460 + 1);
			this.aBoolean184 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
	@Override
	public int method3760() {
		return 4;
	}
}
