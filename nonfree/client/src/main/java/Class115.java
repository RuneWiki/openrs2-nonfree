import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class115 implements Interface5 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	private int anInt3261 = -1;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class115() {
		if (Static116.aBoolean199) {
			@Pc(11) GL local11 = Static116.aGL1;
			this.anInt3261 = local11.glGenLists(2);
			local11.glNewList(this.anInt3261, 4864);
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
			local11.glNewList(this.anInt3261 + 1, 4864);
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

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()V")
	@Override
	public void method4315() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (this.aBoolean274) {
			local1.glCallList(this.anInt3261 + 1);
			this.aBoolean274 = false;
		} else {
			local1.glTexEnvi(8960, 34184, 5890);
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()V")
	@Override
	public void method4313() {
		@Pc(5) GL local5 = Static116.aGL1;
		Static116.method1889(1);
		if (Static111.aClass8_Sub1_Sub3_7 == null || this.anInt3261 < 0 || !Static76.aBoolean117) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt3261);
		local5.glActiveTexture(33985);
		Static111.aClass8_Sub1_Sub3_7.method487();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static170.anInt3413 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static168.anInt5510 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean274 = true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method4314(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()I")
	@Override
	public int method4312() {
		return 4;
	}
}
