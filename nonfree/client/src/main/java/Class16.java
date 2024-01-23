import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class16 implements Interface1 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	private int anInt435 = -1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class16() {
		if (Static283.aBoolean389) {
			@Pc(11) GL local11 = Static283.aGL1;
			this.anInt435 = local11.glGenLists(2);
			local11.glNewList(this.anInt435, 4864);
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
			local11.glNewList(this.anInt435 + 1, 4864);
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

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
	@Override
	public int method3986() {
		return 4;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
	@Override
	public void method3984() {
		@Pc(5) GL local5 = Static283.aGL1;
		if (this.aBoolean41) {
			local5.glCallList(this.anInt435 + 1);
			this.aBoolean41 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	@Override
	public void method3985(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	@Override
	public void method3983() {
		@Pc(5) GL local5 = Static283.aGL1;
		Static283.method4656(1);
		if (Static56.aClass3_Sub4_Sub24_3 == null || this.anInt435 < 0 || !Static67.aBoolean95) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt435);
		local5.glActiveTexture(33985);
		Static56.aClass3_Sub4_Sub24_3.method5026();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static184.anInt3648 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static241.anInt4892 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean41 = true;
	}
}
