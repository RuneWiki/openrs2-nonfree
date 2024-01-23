import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class83 implements Interface3 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "[F")
	private float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	private int anInt2707 = -1;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	private int anInt2708 = -1;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class83() {
		if (Static178.anInt3496 >= 2) {
			@Pc(17) int[] local17 = new int[1];
			@Pc(20) byte[] local20 = new byte[8];
			@Pc(22) int local22 = 0;
			while (local22 < 8) {
				local20[local22++] = (byte) (local22 * 159 / 8 + 96);
			}
			@Pc(40) GL local40 = Static178.aGL1;
			local40.glGenTextures(1, local17, 0);
			local40.glBindTexture(3552, local17[0]);
			local40.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(local20));
			local40.glTexParameteri(3552, 10241, 9729);
			local40.glTexParameteri(3552, 10240, 9729);
			local40.glTexParameteri(3552, 10242, 33071);
			this.anInt2708 = local17[0];
			Static128.aBoolean179 = Static178.anInt3496 > 2 && Static178.aBoolean229;
			this.method2104();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
	@Override
	public void method3960() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glCallList(this.anInt2707 + 1);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	@Override
	public void method3962(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glActiveTexture(33985);
		if (Static128.aBoolean179 || arg0 >= 0) {
			local1.glPushMatrix();
			local1.glLoadIdentity();
			local1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static102.anInt2164 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static90.anInt1865 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			local1.glTranslatef((float) -Static27.anInt1299, (float) -Static71.anInt1318, (float) -Static156.anInt3144);
			if (Static128.aBoolean179) {
				this.aFloatArray16[0] = 0.001F;
				this.aFloatArray16[1] = 9.0E-4F;
				this.aFloatArray16[2] = 0.0F;
				this.aFloatArray16[3] = 0.0F;
				local1.glTexGenfv(8192, 9474, this.aFloatArray16, 0);
				this.aFloatArray16[0] = 0.0F;
				this.aFloatArray16[1] = 9.0E-4F;
				this.aFloatArray16[2] = 0.001F;
				this.aFloatArray16[3] = 0.0F;
				local1.glTexGenfv(8193, 9474, this.aFloatArray16, 0);
				this.aFloatArray16[0] = 0.0F;
				this.aFloatArray16[1] = 0.0F;
				this.aFloatArray16[2] = 0.0F;
				this.aFloatArray16[3] = (float) Static178.anInt3492 * 0.005F;
				local1.glTexGenfv(8194, 9474, this.aFloatArray16, 0);
				local1.glActiveTexture(33986);
			}
			local1.glTexEnvfv(8960, 8705, Static46.method725(), 0);
			if (arg0 >= 0) {
				this.aFloatArray16[0] = 0.0F;
				this.aFloatArray16[1] = 1.0F / (float) Static275.anInt5137;
				this.aFloatArray16[2] = 0.0F;
				this.aFloatArray16[3] = (float) arg0 * 1.0F / (float) Static275.anInt5137;
				local1.glTexGenfv(8192, 9474, this.aFloatArray16, 0);
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

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "()V")
	@Override
	public void method3961() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glCallList(this.anInt2707);
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "()V")
	private void method2104() {
		@Pc(1) GL local1 = Static178.aGL1;
		this.anInt2707 = local1.glGenLists(2);
		local1.glNewList(this.anInt2707, 4864);
		local1.glActiveTexture(33985);
		if (Static128.aBoolean179) {
			local1.glBindTexture(32879, Static195.anInt3820);
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
		local1.glBindTexture(3552, this.anInt2708);
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
		local1.glNewList(this.anInt2707 + 1, 4864);
		local1.glActiveTexture(33985);
		if (Static128.aBoolean179) {
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

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "()I")
	@Override
	public int method3963() {
		return 0;
	}
}
