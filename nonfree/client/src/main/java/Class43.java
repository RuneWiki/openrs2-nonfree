import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class43 implements Interface4 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	private int anInt1322 = -1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	private int anInt1321 = -1;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[F")
	private float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	private int anInt1323 = -1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class43() {
		this.method1249();
		this.method1247();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	@Override
	public void method4406(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glActiveTexture(33985);
		local1.glTexEnvfv(8960, 8705, Static239.aFloatArray14, 0);
		local1.glActiveTexture(33984);
		if ((arg0 & 0x1) == 1) {
			if (!Static9.aBoolean5) {
				Static156.method2699(Static9.anIntArray8[Static156.anInt3082 * 64 / 100 % 64]);
			} else if (this.anInt1321 != Static156.anInt3082) {
				this.aFloatArray4[0] = 0.0F;
				this.aFloatArray4[1] = 0.0F;
				this.aFloatArray4[2] = 0.0F;
				this.aFloatArray4[3] = (float) Static156.anInt3082 * 0.005F;
				local1.glTexGenfv(8194, 9473, this.aFloatArray4, 0);
				this.anInt1321 = Static156.anInt3082;
			}
		} else if (Static9.aBoolean5) {
			this.aFloatArray4[0] = 0.0F;
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[2] = 0.0F;
			this.aFloatArray4[3] = 0.0F;
			local1.glTexGenfv(8194, 9473, this.aFloatArray4, 0);
		} else {
			Static156.method2699(Static9.anIntArray8[0]);
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()V")
	@Override
	public void method4405() {
		Static156.aGL1.glCallList(this.anInt1322 + 1);
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
	private void method1247() {
		@Pc(1) GL local1 = Static156.aGL1;
		this.anInt1322 = local1.glGenLists(2);
		local1.glNewList(this.anInt1322, 4864);
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
		if (Static9.aBoolean5) {
			local1.glBindTexture(32879, Static9.anInt140);
			local1.glTexGeni(8194, 9472, 9217);
			local1.glTexGeni(8195, 9472, 9217);
			local1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(3170);
			local1.glEnable(3171);
			local1.glEnable(32879);
		}
		local1.glActiveTexture(33985);
		local1.glEnable(3552);
		local1.glBindTexture(3552, this.anInt1323);
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
		local1.glNewList(this.anInt1322 + 1, 4864);
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
		if (Static9.aBoolean5) {
			local1.glDisable(3170);
			local1.glDisable(3171);
			local1.glDisable(32879);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
	@Override
	public int method4404() {
		return 15;
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "()V")
	private void method1249() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL local12 = Static156.aGL1;
		@Pc(15) int[] local15 = new int[1];
		local12.glGenTextures(1, local15, 0);
		local12.glBindTexture(3552, local15[0]);
		local12.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(local2));
		local12.glTexParameteri(3552, 10241, 9729);
		local12.glTexParameteri(3552, 10240, 9729);
		local12.glTexParameteri(3552, 10242, 33071);
		this.anInt1323 = local15[0];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
	@Override
	public void method4403() {
		@Pc(1) GL local1 = Static156.aGL1;
		Static156.method2695(2);
		Static156.method2681(2);
		Static156.method2660();
		local1.glCallList(this.anInt1322);
		@Pc(12) float local12 = 2662.4001F;
		local12 += (float) (Static82.anInt1639 - 128) * 0.5F;
		if (local12 >= 3328.0F) {
			local12 = 3327.0F;
		}
		this.aFloatArray4[0] = 0.0F;
		this.aFloatArray4[1] = 0.0F;
		this.aFloatArray4[2] = 1.0F / (local12 - 3328.0F);
		this.aFloatArray4[3] = local12 / (local12 - 3328.0F);
		local1.glTexGenfv(8192, 9474, this.aFloatArray4, 0);
		local1.glPopMatrix();
		local1.glActiveTexture(33984);
		local1.glTexEnvfv(8960, 8705, Static68.aFloatArray3, 0);
	}
}
