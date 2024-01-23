import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class122 implements Interface3 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	private int anInt3725 = -1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class122() {
		if (Static71.aBoolean162) {
			@Pc(12) GL local12 = Static71.aGL1;
			this.anInt3725 = local12.glGenLists(2);
			local12.glNewList(this.anInt3725, 4864);
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
			local12.glNewList(this.anInt3725 + 1, 4864);
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

	@OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
	@Override
	public void method3931() {
		@Pc(5) GL local5 = Static71.aGL1;
		if (this.aBoolean329) {
			local5.glCallList(this.anInt3725 + 1);
			this.aBoolean329 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	@Override
	public void method3930(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
	@Override
	public void method3929() {
		@Pc(1) GL local1 = Static71.aGL1;
		Static71.method1380(1);
		if (Static160.aClass1_Sub5_Sub18_5 == null || this.anInt3725 < 0 || !Static69.aBoolean146) {
			local1.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local1.glCallList(this.anInt3725);
		local1.glActiveTexture(33985);
		Static160.aClass1_Sub5_Sub18_5.method3648();
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glRotatef(-((float) Static175.anInt3414 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local1.glRotatef(-((float) Static284.anInt5165 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local1.glScalef(-1.0F, 1.0F, 1.0F);
		local1.glMatrixMode(5888);
		local1.glActiveTexture(33984);
		this.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()I")
	@Override
	public int method3928() {
		return 4;
	}
}
