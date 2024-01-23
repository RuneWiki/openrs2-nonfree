import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class161 implements Interface1 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt5131 = -1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class161() {
		if (Static277.aBoolean407) {
			@Pc(11) GL local11 = Static277.aGL1;
			this.anInt5131 = local11.glGenLists(2);
			local11.glNewList(this.anInt5131, 4864);
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
			local11.glNewList(this.anInt5131 + 1, 4864);
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

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
	@Override
	public void method4018() {
		@Pc(1) GL local1 = Static277.aGL1;
		Static277.method4190(1);
		if (Static29.aClass1_Sub2_Sub7_1 == null || this.anInt5131 < 0 || !Static188.aBoolean295) {
			local1.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local1.glCallList(this.anInt5131);
		local1.glActiveTexture(33985);
		Static29.aClass1_Sub2_Sub7_1.method865();
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glRotatef(-((float) Static68.anInt1455 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local1.glRotatef(-((float) Static156.anInt1435 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local1.glScalef(-1.0F, 1.0F, 1.0F);
		local1.glMatrixMode(5888);
		local1.glActiveTexture(33984);
		this.aBoolean388 = true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method4017(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
	@Override
	public void method4019() {
		@Pc(5) GL local5 = Static277.aGL1;
		if (this.aBoolean388) {
			local5.glCallList(this.anInt5131 + 1);
			this.aBoolean388 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
	@Override
	public int method4016() {
		return 4;
	}
}
