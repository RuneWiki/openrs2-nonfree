import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class21 implements Interface2 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	private int anInt341 = -1;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	private int anInt342 = -1;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "[F")
	private float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class21() {
		if (Static94.anInt2081 >= 2) {
			@Pc(17) int[] local17 = new int[1];
			@Pc(20) byte[] local20 = new byte[8];
			@Pc(22) int local22 = 0;
			while (local22 < 8) {
				local20[local22++] = (byte) (local22 * 159 / 8 + 96);
			}
			@Pc(40) GL local40 = Static94.aGL1;
			local40.glGenTextures(1, local17, 0);
			local40.glBindTexture(3552, local17[0]);
			local40.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(local20));
			local40.glTexParameteri(3552, 10241, 9729);
			local40.glTexParameteri(3552, 10240, 9729);
			local40.glTexParameteri(3552, 10242, 33071);
			this.anInt342 = local17[0];
			Static23.aBoolean21 = Static94.anInt2081 > 2 && Static94.aBoolean137;
			this.method317();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
	@Override
	public void method3521() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glCallList(this.anInt341);
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
	@Override
	public int method3522() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	public void method3520() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glCallList(this.anInt341 + 1);
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "()V")
	private void method317() {
		@Pc(1) GL local1 = Static94.aGL1;
		this.anInt341 = local1.glGenLists(2);
		local1.glNewList(this.anInt341, 4864);
		local1.glActiveTexture(33985);
		if (Static23.aBoolean21) {
			local1.glBindTexture(32879, Static119.anInt2342);
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
		local1.glBindTexture(3552, this.anInt342);
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
		local1.glNewList(this.anInt341 + 1, 4864);
		local1.glActiveTexture(33985);
		if (Static23.aBoolean21) {
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

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method3523(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glActiveTexture(33985);
		if (Static23.aBoolean21 || arg0 >= 0) {
			local1.glPushMatrix();
			local1.glLoadIdentity();
			local1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static164.anInt3258 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static230.anInt4404 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			local1.glTranslatef((float) -Static195.anInt3731, (float) -Static240.anInt4559, (float) -Static31.anInt525);
			if (Static23.aBoolean21) {
				this.aFloatArray8[0] = 0.001F;
				this.aFloatArray8[1] = 9.0E-4F;
				this.aFloatArray8[2] = 0.0F;
				this.aFloatArray8[3] = 0.0F;
				local1.glTexGenfv(8192, 9474, this.aFloatArray8, 0);
				this.aFloatArray8[0] = 0.0F;
				this.aFloatArray8[1] = 9.0E-4F;
				this.aFloatArray8[2] = 0.001F;
				this.aFloatArray8[3] = 0.0F;
				local1.glTexGenfv(8193, 9474, this.aFloatArray8, 0);
				this.aFloatArray8[0] = 0.0F;
				this.aFloatArray8[1] = 0.0F;
				this.aFloatArray8[2] = 0.0F;
				this.aFloatArray8[3] = (float) Static94.anInt2085 * 0.005F;
				local1.glTexGenfv(8194, 9474, this.aFloatArray8, 0);
				local1.glActiveTexture(33986);
			}
			local1.glTexEnvfv(8960, 8705, Static45.method723(), 0);
			if (arg0 >= 0) {
				this.aFloatArray8[0] = 0.0F;
				this.aFloatArray8[1] = 1.0F / (float) Static52.anInt2245;
				this.aFloatArray8[2] = 0.0F;
				this.aFloatArray8[3] = (float) arg0 * 1.0F / (float) Static52.anInt2245;
				local1.glTexGenfv(8192, 9474, this.aFloatArray8, 0);
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
}
