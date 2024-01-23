import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class60 implements Interface2 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private int anInt1768 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	private int anInt1767 = -1;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[F")
	private float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	private int anInt1769 = -1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class60() {
		this.method1522();
		this.method1523();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()V")
	private void method1522() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL local12 = Static60.aGL1;
		@Pc(15) int[] local15 = new int[1];
		local12.glGenTextures(1, local15, 0);
		local12.glBindTexture(3552, local15[0]);
		local12.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(local2));
		local12.glTexParameteri(3552, 10241, 9729);
		local12.glTexParameteri(3552, 10240, 9729);
		local12.glTexParameteri(3552, 10242, 33071);
		this.anInt1767 = local15[0];
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	@Override
	public void method4853() {
		Static60.aGL1.glCallList(this.anInt1769 + 1);
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "()V")
	private void method1523() {
		@Pc(1) GL local1 = Static60.aGL1;
		this.anInt1769 = local1.glGenLists(2);
		local1.glNewList(this.anInt1769, 4864);
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
		if (Static132.aBoolean216) {
			local1.glBindTexture(32879, Static132.anInt2697);
			local1.glTexGeni(8194, 9472, 9217);
			local1.glTexGeni(8195, 9472, 9217);
			local1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(3170);
			local1.glEnable(3171);
			local1.glEnable(32879);
		}
		local1.glActiveTexture(33985);
		local1.glEnable(3552);
		local1.glBindTexture(3552, this.anInt1767);
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
		local1.glNewList(this.anInt1769 + 1, 4864);
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
		if (Static132.aBoolean216) {
			local1.glDisable(3170);
			local1.glDisable(3171);
			local1.glDisable(32879);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	@Override
	public void method4855() {
		@Pc(1) GL local1 = Static60.aGL1;
		Static60.method1139(2);
		Static60.method1168(2);
		Static60.method1172();
		local1.glCallList(this.anInt1769);
		@Pc(12) float local12 = 2662.4001F;
		local12 += (float) (Static266.anInt5529 - 128) * 0.5F;
		if (local12 >= 3328.0F) {
			local12 = 3327.0F;
		}
		this.aFloatArray13[0] = 0.0F;
		this.aFloatArray13[1] = 0.0F;
		this.aFloatArray13[2] = 1.0F / (local12 - 3328.0F);
		this.aFloatArray13[3] = local12 / (local12 - 3328.0F);
		local1.glTexGenfv(8192, 9474, this.aFloatArray13, 0);
		local1.glPopMatrix();
		local1.glActiveTexture(33984);
		local1.glTexEnvfv(8960, 8705, Static80.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()I")
	@Override
	public int method4854() {
		return 15;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glActiveTexture(33985);
		local1.glTexEnvfv(8960, 8705, Static191.aFloatArray3, 0);
		local1.glActiveTexture(33984);
		if ((arg0 & 0x1) == 1) {
			if (!Static132.aBoolean216) {
				Static60.method1157(Static132.anIntArray201[Static60.anInt1340 * 64 / 100 % 64]);
			} else if (this.anInt1768 != Static60.anInt1340) {
				this.aFloatArray13[0] = 0.0F;
				this.aFloatArray13[1] = 0.0F;
				this.aFloatArray13[2] = 0.0F;
				this.aFloatArray13[3] = (float) Static60.anInt1340 * 0.005F;
				local1.glTexGenfv(8194, 9473, this.aFloatArray13, 0);
				this.anInt1768 = Static60.anInt1340;
			}
		} else if (Static132.aBoolean216) {
			this.aFloatArray13[0] = 0.0F;
			this.aFloatArray13[1] = 0.0F;
			this.aFloatArray13[2] = 0.0F;
			this.aFloatArray13[3] = 0.0F;
			local1.glTexGenfv(8194, 9473, this.aFloatArray13, 0);
		} else {
			Static60.method1157(Static132.anIntArray201[0]);
		}
	}
}
