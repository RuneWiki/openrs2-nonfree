import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class20 implements Interface2 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[F")
	private float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
	private int anInt537 = -1;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	private int anInt538 = -1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class20() {
		if (Static60.anInt1332 >= 2) {
			@Pc(17) int[] local17 = new int[1];
			@Pc(20) byte[] local20 = new byte[8];
			@Pc(22) int local22 = 0;
			while (local22 < 8) {
				local20[local22++] = (byte) (local22 * 159 / 8 + 96);
			}
			@Pc(40) GL local40 = Static60.aGL1;
			local40.glGenTextures(1, local17, 0);
			local40.glBindTexture(3552, local17[0]);
			local40.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(local20));
			local40.glTexParameteri(3552, 10241, 9729);
			local40.glTexParameteri(3552, 10240, 9729);
			local40.glTexParameteri(3552, 10242, 33071);
			this.anInt538 = local17[0];
			Static24.aBoolean44 = Static60.anInt1332 > 2 && Static60.aBoolean101;
			this.method478();
		}
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()V")
	private void method478() {
		@Pc(1) GL local1 = Static60.aGL1;
		this.anInt537 = local1.glGenLists(2);
		local1.glNewList(this.anInt537, 4864);
		local1.glActiveTexture(33985);
		if (Static24.aBoolean44) {
			local1.glBindTexture(32879, Static132.anInt2697);
			local1.glTexEnvi(8960, 34161, 260);
			local1.glTexEnvi(8960, 34192, 768);
			local1.glTexEnvi(8960, 34162, 7681);
			local1.glTexEnvi(8960, 34184, 34168);
			local1.glTexGeni(8192, 9472, 9216);
			local1.glTexGeni(8194, 9472, 9216);
			local1.glTexGeni(8193, 9472, 9216);
			local1.glTexGeni(8195, 9472, 9217);
			local1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(3168);
			local1.glEnable(3169);
			local1.glEnable(3170);
			local1.glEnable(3171);
			local1.glEnable(32879);
			local1.glActiveTexture(33986);
			local1.glTexEnvi(8960, 8704, 34160);
		}
		local1.glBindTexture(3552, this.anInt538);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34176, 34166);
		local1.glTexEnvi(8960, 34178, 5890);
		local1.glTexEnvi(8960, 34162, 7681);
		local1.glTexEnvi(8960, 34184, 34168);
		local1.glTexGeni(8192, 9472, 9216);
		local1.glEnable(3552);
		local1.glEnable(3168);
		local1.glActiveTexture(33984);
		local1.glEndList();
		local1.glNewList(this.anInt537 + 1, 4864);
		local1.glActiveTexture(33985);
		if (Static24.aBoolean44) {
			local1.glTexEnvi(8960, 34161, 8448);
			local1.glTexEnvi(8960, 34192, 768);
			local1.glTexEnvi(8960, 34162, 8448);
			local1.glTexEnvi(8960, 34184, 5890);
			local1.glDisable(3168);
			local1.glDisable(3169);
			local1.glDisable(3170);
			local1.glDisable(3171);
			local1.glDisable(32879);
			local1.glActiveTexture(33986);
			local1.glTexEnvi(8960, 8704, 8448);
		}
		local1.glTexEnvfv(8960, 8705, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34176, 5890);
		local1.glTexEnvi(8960, 34178, 34166);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glTexEnvi(8960, 34184, 5890);
		local1.glDisable(3552);
		local1.glDisable(3168);
		local1.glActiveTexture(33984);
		local1.glEndList();
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()V")
	@Override
	public void method4855() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glCallList(this.anInt537);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()I")
	@Override
	public int method4854() {
		return 0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glActiveTexture(33985);
		if (Static24.aBoolean44 || arg0 >= 0) {
			local1.glPushMatrix();
			local1.glLoadIdentity();
			local1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static266.anInt5529 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static75.anInt1615 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			local1.glTranslatef((float) -Static260.anInt5406, (float) -Static56.anInt1271, (float) -Static217.anInt4546);
			if (Static24.aBoolean44) {
				this.aFloatArray1[0] = 0.001F;
				this.aFloatArray1[1] = 9.0E-4F;
				this.aFloatArray1[2] = 0.0F;
				this.aFloatArray1[3] = 0.0F;
				local1.glTexGenfv(8192, 9474, this.aFloatArray1, 0);
				this.aFloatArray1[0] = 0.0F;
				this.aFloatArray1[1] = 9.0E-4F;
				this.aFloatArray1[2] = 0.001F;
				this.aFloatArray1[3] = 0.0F;
				local1.glTexGenfv(8193, 9474, this.aFloatArray1, 0);
				this.aFloatArray1[0] = 0.0F;
				this.aFloatArray1[1] = 0.0F;
				this.aFloatArray1[2] = 0.0F;
				this.aFloatArray1[3] = (float) Static60.anInt1340 * 0.005F;
				local1.glTexGenfv(8194, 9474, this.aFloatArray1, 0);
				local1.glActiveTexture(33986);
			}
			local1.glTexEnvfv(8960, 8705, Static43.method833(), 0);
			if (arg0 >= 0) {
				this.aFloatArray1[0] = 0.0F;
				this.aFloatArray1[1] = 1.0F / (float) Static40.anInt977;
				this.aFloatArray1[2] = 0.0F;
				this.aFloatArray1[3] = (float) arg0 * 1.0F / (float) Static40.anInt977;
				local1.glTexGenfv(8192, 9474, this.aFloatArray1, 0);
				local1.glEnable(3168);
			} else {
				local1.glDisable(3168);
			}
			local1.glPopMatrix();
		} else {
			local1.glDisable(3168);
		}
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
	@Override
	public void method4853() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glCallList(this.anInt537 + 1);
	}
}
