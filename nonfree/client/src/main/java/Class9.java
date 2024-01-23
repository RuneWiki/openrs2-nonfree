import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class9 implements Interface1 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	private int anInt361 = -1;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class9() {
		if (Static240.aBoolean380) {
			@Pc(12) GL local12 = Static240.aGL1;
			this.anInt361 = local12.glGenLists(2);
			local12.glNewList(this.anInt361, 4864);
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
			local12.glNewList(this.anInt361 + 1, 4864);
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

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()I")
	@Override
	public int method4330() {
		return 4;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()V")
	@Override
	public void method4327() {
		@Pc(5) GL local5 = Static240.aGL1;
		Static240.method3791(1);
		if (Static299.aClass1_Sub2_Sub8_6 == null || this.anInt361 < 0 || !Static294.aBoolean445) {
			local5.glTexEnvi(8960, 34184, 34167);
			return;
		}
		local5.glCallList(this.anInt361);
		local5.glActiveTexture(33985);
		Static299.aClass1_Sub2_Sub8_6.method1582();
		local5.glMatrixMode(5890);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static28.anInt602 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static147.anInt2715 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(5888);
		local5.glActiveTexture(33984);
		this.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	@Override
	public void method4329(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()V")
	@Override
	public void method4328() {
		@Pc(5) GL local5 = Static240.aGL1;
		if (this.aBoolean28) {
			local5.glCallList(this.anInt361 + 1);
			this.aBoolean28 = false;
		} else {
			local5.glTexEnvi(8960, 34184, 5890);
		}
	}
}
