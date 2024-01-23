import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class135 implements Interface2 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private int anInt4190 = -1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class135() {
		if (Static251.aBoolean317) {
			@Pc(11) GL local11 = Static251.aGL1;
			this.anInt4190 = local11.glGenLists(2);
			local11.glNewList(this.anInt4190, 4864);
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
			local11.glNewList(this.anInt4190 + 1, 4864);
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

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void method4567(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()I")
	@Override
	public int method4569() {
		return 4;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	@Override
	public void method4566() {
		@Pc(5) GL local5 = Static251.aGL1;
		Static251.method3851(1);
		if (Static90.aClass4_Sub2_Sub11_11 == null || this.anInt4190 < 0 || !Static253.aBoolean335) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt4190);
		local5.glActiveTexture(33985);
		Static90.aClass4_Sub2_Sub11_11.method2088();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static193.anInt3890 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static293.anInt5686 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean258 = true;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	@Override
	public void method4568() {
		@Pc(5) GL local5 = Static251.aGL1;
		if (this.aBoolean258) {
			local5.glCallList(this.anInt4190 + 1);
			this.aBoolean258 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}
}
