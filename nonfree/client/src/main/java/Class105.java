import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class105 implements Interface3 {

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	private int anInt3183 = -1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class105() {
		if (Static178.aBoolean217) {
			@Pc(12) GL local12 = Static178.aGL1;
			this.anInt3183 = local12.glGenLists(2);
			local12.glNewList(this.anInt3183, 4864);
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
			local12.glNewList(this.anInt3183 + 1, 4864);
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

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	@Override
	public void method3961() {
		@Pc(5) GL local5 = Static178.aGL1;
		Static178.method2769(1);
		if (Static92.aClass4_Sub2_Sub15_1 == null || this.anInt3183 < 0 || !Static298.aBoolean357) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt3183);
		local5.glActiveTexture(33985);
		Static92.aClass4_Sub2_Sub15_1.method3009();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static90.anInt1865 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static102.anInt2164 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean204 = true;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()I")
	@Override
	public int method3963() {
		return 4;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public void method3962(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	@Override
	public void method3960() {
		@Pc(5) GL local5 = Static178.aGL1;
		if (this.aBoolean204) {
			local5.glCallList(this.anInt3183 + 1);
			this.aBoolean204 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}
}
