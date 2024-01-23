import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class182 implements Interface4 {

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Z")
	private boolean aBoolean353 = false;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	private int anInt5160 = -1;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class182() {
		if (Static156.aBoolean205) {
			@Pc(12) GL local12 = Static156.aGL1;
			this.anInt5160 = local12.glGenLists(2);
			local12.glNewList(this.anInt5160, 4864);
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
			local12.glNewList(this.anInt5160 + 1, 4864);
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

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()I")
	@Override
	public int method4404() {
		return 4;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	public void method4406(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()V")
	@Override
	public void method4405() {
		@Pc(5) GL local5 = Static156.aGL1;
		if (this.aBoolean353) {
			local5.glCallList(this.anInt5160 + 1);
			this.aBoolean353 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
	@Override
	public void method4403() {
		@Pc(5) GL local5 = Static156.aGL1;
		Static156.method2681(1);
		if (Static268.aClass1_Sub2_Sub20_7 == null || this.anInt5160 < 0 || !Static311.aBoolean384) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt5160);
		local5.glActiveTexture(33985);
		Static268.aClass1_Sub2_Sub20_7.method4233();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static64.anInt1223 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static82.anInt1639 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean353 = true;
	}
}
