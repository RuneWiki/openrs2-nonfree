import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class158 implements Interface5 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	private int anInt5062 = -1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class158() {
		if (Static116.aBoolean174) {
			@Pc(11) GL local11 = Static116.aGL1;
			this.anInt5062 = local11.glGenLists(2);
			local11.glNewList(this.anInt5062, 4864);
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
			local11.glNewList(this.anInt5062 + 1, 4864);
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

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
	@Override
	public void method4036() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (this.aBoolean333) {
			local1.glCallList(this.anInt5062 + 1);
			this.aBoolean333 = false;
		} else {
			local1.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	@Override
	public void method4039(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
	@Override
	public void method4037() {
		@Pc(5) GL local5 = Static116.aGL1;
		Static116.method1976(1);
		if (Static126.aClass2_Sub8_Sub14_5 == null || this.anInt5062 < 0 || !Static265.aBoolean348) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt5062);
		local5.glActiveTexture(33985);
		Static126.aClass2_Sub8_Sub14_5.method3277();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static265.anInt5204 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static70.anInt1777 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()I")
	@Override
	public int method4038() {
		return 4;
	}
}
