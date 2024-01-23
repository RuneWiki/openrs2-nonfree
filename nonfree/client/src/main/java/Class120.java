import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class120 implements Interface3 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	private int anInt3672 = -1;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
	private int anInt3673 = -1;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "[F")
	private float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	private int anInt3674 = -1;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class120() {
		this.method3255();
		this.method3256();
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()V")
	@Override
	public void method3931() {
		Static71.aGL1.glCallList(this.anInt3674 + 1);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()V")
	@Override
	public void method3929() {
		@Pc(1) GL local1 = Static71.aGL1;
		Static71.method1392(2);
		Static71.method1380(2);
		Static71.method1381();
		local1.glCallList(this.anInt3674);
		@Pc(12) float local12 = 2662.4001F;
		local12 += (float) (Static284.anInt5165 - 128) * 0.5F;
		if (local12 >= 3328.0F) {
			local12 = 3327.0F;
		}
		this.aFloatArray26[0] = 0.0F;
		this.aFloatArray26[1] = 0.0F;
		this.aFloatArray26[2] = 1.0F / (local12 - 3328.0F);
		this.aFloatArray26[3] = local12 / (local12 - 3328.0F);
		local1.glTexGenfv(8192, 9474, this.aFloatArray26, 0);
		local1.glPopMatrix();
		local1.glActiveTexture(33984);
		local1.glTexEnvfv(8960, 8705, Static190.aFloatArray25, 0);
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "()V")
	private void method3255() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL local12 = Static71.aGL1;
		@Pc(15) int[] local15 = new int[1];
		local12.glGenTextures(1, local15, 0);
		local12.glBindTexture(3552, local15[0]);
		local12.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(local2));
		local12.glTexParameteri(3552, 10241, 9729);
		local12.glTexParameteri(3552, 10240, 9729);
		local12.glTexParameteri(3552, 10242, 33071);
		this.anInt3673 = local15[0];
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "()V")
	private void method3256() {
		@Pc(1) GL local1 = Static71.aGL1;
		this.anInt3674 = local1.glGenLists(2);
		local1.glNewList(this.anInt3674, 4864);
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
		if (Static251.aBoolean429) {
			local1.glBindTexture(32879, Static251.anInt4616);
			local1.glTexGeni(8194, 9472, 9217);
			local1.glTexGeni(8195, 9472, 9217);
			local1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(3170);
			local1.glEnable(3171);
			local1.glEnable(32879);
		}
		local1.glActiveTexture(33985);
		local1.glEnable(3552);
		local1.glBindTexture(3552, this.anInt3673);
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
		local1.glNewList(this.anInt3674 + 1, 4864);
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
		if (Static251.aBoolean429) {
			local1.glDisable(3170);
			local1.glDisable(3171);
			local1.glDisable(32879);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public void method3930(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glActiveTexture(33985);
		local1.glTexEnvfv(8960, 8705, Static128.aFloatArray21, 0);
		local1.glActiveTexture(33984);
		if ((arg0 & 0x1) == 1) {
			if (!Static251.aBoolean429) {
				Static71.method1400(Static251.anIntArray513[Static71.anInt1545 * 64 / 100 % 64]);
			} else if (this.anInt3672 != Static71.anInt1545) {
				this.aFloatArray26[0] = 0.0F;
				this.aFloatArray26[1] = 0.0F;
				this.aFloatArray26[2] = 0.0F;
				this.aFloatArray26[3] = (float) Static71.anInt1545 * 0.005F;
				local1.glTexGenfv(8194, 9473, this.aFloatArray26, 0);
				this.anInt3672 = Static71.anInt1545;
			}
		} else if (Static251.aBoolean429) {
			this.aFloatArray26[0] = 0.0F;
			this.aFloatArray26[1] = 0.0F;
			this.aFloatArray26[2] = 0.0F;
			this.aFloatArray26[3] = 0.0F;
			local1.glTexGenfv(8194, 9473, this.aFloatArray26, 0);
		} else {
			Static71.method1400(Static251.anIntArray513[0]);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()I")
	@Override
	public int method3928() {
		return 15;
	}
}
