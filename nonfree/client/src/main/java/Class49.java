import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class49 implements Interface1 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	private int anInt1400 = -1;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "I")
	private int anInt1401 = -1;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "[F")
	private float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	private int anInt1402 = -1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class49() {
		this.method1165();
		this.method1166();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()V")
	@Override
	public void method4327() {
		@Pc(1) GL local1 = Static240.aGL1;
		Static240.method3804(2);
		Static240.method3791(2);
		Static240.method3781();
		local1.glCallList(this.anInt1401);
		@Pc(12) float local12 = 2662.4001F;
		local12 += (float) (Static147.anInt2715 - 128) * 0.5F;
		if (local12 >= 3328.0F) {
			local12 = 3327.0F;
		}
		this.aFloatArray15[0] = 0.0F;
		this.aFloatArray15[1] = 0.0F;
		this.aFloatArray15[2] = 1.0F / (local12 - 3328.0F);
		this.aFloatArray15[3] = local12 / (local12 - 3328.0F);
		local1.glTexGenfv(8192, 9474, this.aFloatArray15, 0);
		local1.glPopMatrix();
		local1.glActiveTexture(33984);
		local1.glTexEnvfv(8960, 8705, Static69.aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "()V")
	private void method1165() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL local12 = Static240.aGL1;
		@Pc(15) int[] local15 = new int[1];
		local12.glGenTextures(1, local15, 0);
		local12.glBindTexture(3552, local15[0]);
		local12.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(local2));
		local12.glTexParameteri(3552, 10241, 9729);
		local12.glTexParameteri(3552, 10240, 9729);
		local12.glTexParameteri(3552, 10242, 33071);
		this.anInt1400 = local15[0];
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()V")
	@Override
	public void method4328() {
		Static240.aGL1.glCallList(this.anInt1401 + 1);
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()I")
	@Override
	public int method4330() {
		return 15;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	@Override
	public void method4329(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glActiveTexture(33985);
		local1.glTexEnvfv(8960, 8705, Static37.aFloatArray23, 0);
		local1.glActiveTexture(33984);
		if ((arg0 & 0x1) == 1) {
			if (!Static42.aBoolean83) {
				Static240.method3789(Static42.anIntArray125[Static240.anInt4950 * 64 / 100 % 64]);
			} else if (this.anInt1402 != Static240.anInt4950) {
				this.aFloatArray15[0] = 0.0F;
				this.aFloatArray15[1] = 0.0F;
				this.aFloatArray15[2] = 0.0F;
				this.aFloatArray15[3] = (float) Static240.anInt4950 * 0.005F;
				local1.glTexGenfv(8194, 9473, this.aFloatArray15, 0);
				this.anInt1402 = Static240.anInt4950;
			}
		} else if (Static42.aBoolean83) {
			this.aFloatArray15[0] = 0.0F;
			this.aFloatArray15[1] = 0.0F;
			this.aFloatArray15[2] = 0.0F;
			this.aFloatArray15[3] = 0.0F;
			local1.glTexGenfv(8194, 9473, this.aFloatArray15, 0);
		} else {
			Static240.method3789(Static42.anIntArray125[0]);
		}
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "()V")
	private void method1166() {
		@Pc(1) GL local1 = Static240.aGL1;
		this.anInt1401 = local1.glGenLists(2);
		local1.glNewList(this.anInt1401, 4864);
		local1.glTexEnvi(8960, 34192, 768);
		local1.glTexEnvi(8960, 34177, 34166);
		local1.glTexEnvf(8960, 34163, 2.0F);
		local1.glTexEnvi(8960, 34185, 34166);
		local1.glTexGeni(8192, 9472, 9217);
		local1.glTexGeni(8193, 9472, 9217);
		local1.glTexGenfv(8192, 9473, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
		local1.glTexGenfv(8193, 9473, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
		local1.glEnable(3168);
		local1.glEnable(3169);
		if (Static42.aBoolean83) {
			local1.glBindTexture(32879, Static42.anInt895);
			local1.glTexGeni(8194, 9472, 9217);
			local1.glTexGeni(8195, 9472, 9217);
			local1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(3170);
			local1.glEnable(3171);
			local1.glEnable(32879);
		}
		local1.glActiveTexture(33985);
		local1.glEnable(3552);
		local1.glBindTexture(3552, this.anInt1400);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34176, 34166);
		local1.glTexEnvi(8960, 34178, 5890);
		local1.glTexEnvi(8960, 34162, 34165);
		local1.glTexEnvi(8960, 34184, 34166);
		local1.glTexEnvi(8960, 34186, 5890);
		local1.glEnable(3168);
		local1.glTexGeni(8192, 9472, 9216);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glEndList();
		local1.glNewList(this.anInt1401 + 1, 4864);
		local1.glActiveTexture(33985);
		local1.glDisable(3552);
		local1.glDisable(3168);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34176, 5890);
		local1.glTexEnvi(8960, 34178, 34166);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glTexEnvi(8960, 34184, 5890);
		local1.glTexEnvi(8960, 34186, 34166);
		local1.glActiveTexture(33984);
		local1.glTexEnvi(8960, 34192, 768);
		local1.glTexEnvi(8960, 34177, 34168);
		local1.glTexEnvf(8960, 34163, 1.0F);
		local1.glTexEnvi(8960, 34185, 34168);
		local1.glDisable(3168);
		local1.glDisable(3169);
		if (Static42.aBoolean83) {
			local1.glDisable(3170);
			local1.glDisable(3171);
			local1.glDisable(32879);
		}
		local1.glEndList();
	}
}
