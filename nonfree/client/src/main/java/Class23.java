import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class23 implements Interface2 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "[F")
	private float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class23() {
		this.method399();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "()V")
	@Override
	public void method3521() {
		@Pc(5) GL local5 = Static94.aGL1;
		local5.glCallList(this.anInt419);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "()I")
	@Override
	public int method3522() {
		return 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	@Override
	public void method3520() {
		@Pc(5) GL local5 = Static94.aGL1;
		local5.glCallList(this.anInt419 + 1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public void method3523(@OriginalArg(0) int arg0) {
		@Pc(7) GL local7 = Static94.aGL1;
		@Pc(16) float local16 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(43) float local43 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		if (local35) {
			this.aFloatArray9[0] = local43;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[2] = 0.0F;
			this.aFloatArray9[3] = 0.0F;
		} else {
			this.aFloatArray9[0] = 0.0F;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[3] = 0.0F;
			this.aFloatArray9[2] = local43;
		}
		local7.glActiveTexture(33985);
		local7.glMatrixMode(5888);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static164.anInt3258 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static230.anInt4404 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -Static195.anInt3731, (float) -Static240.anInt4559, (float) -Static31.anInt525);
		local7.glTexGenfv(8192, 9474, this.aFloatArray9, 0);
		this.aFloatArray9[1] = local43;
		this.aFloatArray9[0] = 0.0F;
		this.aFloatArray9[2] = 0.0F;
		this.aFloatArray9[3] = (float) Static94.anInt2085 * local16;
		local7.glTexGenfv(8193, 9474, this.aFloatArray9, 0);
		local7.glPopMatrix();
		if (Static119.aBoolean160) {
			this.aFloatArray9[2] = 0.0F;
			this.aFloatArray9[3] = local27 * (float) Static94.anInt2085;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[0] = 0.0F;
			local7.glTexGenfv(8194, 9473, this.aFloatArray9, 0);
		} else {
			@Pc(217) int local217 = (int) ((float) Static94.anInt2085 * 64.0F * local27);
			local7.glBindTexture(3553, Static119.anIntArray199[local217 % 64]);
		}
		local7.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	private void method399() {
		@Pc(7) GL local7 = Static94.aGL1;
		this.anInt419 = local7.glGenLists(2);
		local7.glNewList(this.anInt419, 4864);
		local7.glActiveTexture(33985);
		if (Static119.aBoolean160) {
			local7.glBindTexture(32879, Static119.anInt2341);
			local7.glTexGeni(8194, 9472, 9217);
			local7.glEnable(3170);
			local7.glEnable(32879);
		} else {
			local7.glEnable(3553);
		}
		local7.glTexGeni(8192, 9472, 9216);
		local7.glTexGeni(8193, 9472, 9216);
		local7.glEnable(3168);
		local7.glEnable(3169);
		local7.glActiveTexture(33984);
		local7.glEndList();
		local7.glNewList(this.anInt419 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static119.aBoolean160) {
			local7.glDisable(32879);
			local7.glDisable(3170);
		} else {
			local7.glDisable(3553);
		}
		local7.glDisable(3168);
		local7.glDisable(3169);
		local7.glActiveTexture(33984);
		local7.glEndList();
	}
}
