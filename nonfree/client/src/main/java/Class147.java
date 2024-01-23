import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class147 implements Interface1 {

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	private int anInt4528;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "[F")
	private float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class147() {
		this.method3573();
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	private void method3573() {
		@Pc(12) GL local12 = Static277.aGL1;
		this.anInt4528 = local12.glGenLists(2);
		local12.glNewList(this.anInt4528, 4864);
		local12.glActiveTexture(33985);
		if (Static27.aBoolean53) {
			local12.glBindTexture(32879, Static27.anInt651);
			local12.glTexGeni(8194, 9472, 9217);
			local12.glEnable(3170);
			local12.glEnable(32879);
		} else {
			local12.glEnable(3553);
		}
		local12.glTexGeni(8192, 9472, 9216);
		local12.glTexGeni(8193, 9472, 9216);
		local12.glEnable(3168);
		local12.glEnable(3169);
		local12.glActiveTexture(33984);
		local12.glEndList();
		local12.glNewList(this.anInt4528 + 1, 4864);
		local12.glActiveTexture(33985);
		if (Static27.aBoolean53) {
			local12.glDisable(32879);
			local12.glDisable(3170);
		} else {
			local12.glDisable(3553);
		}
		local12.glDisable(3168);
		local12.glDisable(3169);
		local12.glActiveTexture(33984);
		local12.glEndList();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
	@Override
	public int method4016() {
		return 0;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()V")
	@Override
	public void method4019() {
		@Pc(5) GL local5 = Static277.aGL1;
		local5.glCallList(this.anInt4528 + 1);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()V")
	@Override
	public void method4018() {
		@Pc(5) GL local5 = Static277.aGL1;
		local5.glCallList(this.anInt4528);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	@Override
	public void method4017(@OriginalArg(0) int arg0) {
		@Pc(10) float local10 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(12) GL local12 = Static277.aGL1;
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		if (local44) {
			this.aFloatArray20[3] = 0.0F;
			this.aFloatArray20[0] = local36;
			this.aFloatArray20[1] = 0.0F;
			this.aFloatArray20[2] = 0.0F;
		} else {
			this.aFloatArray20[2] = local36;
			this.aFloatArray20[3] = 0.0F;
			this.aFloatArray20[1] = 0.0F;
			this.aFloatArray20[0] = 0.0F;
		}
		local12.glActiveTexture(33985);
		local12.glMatrixMode(5888);
		local12.glPushMatrix();
		local12.glLoadIdentity();
		local12.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local12.glRotatef((float) Static156.anInt1435 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local12.glRotatef((float) Static68.anInt1455 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local12.glTranslatef((float) -Static104.anInt2460, (float) -Static163.anInt3498, (float) -Static91.anInt2044);
		local12.glTexGenfv(8192, 9474, this.aFloatArray20, 0);
		this.aFloatArray20[1] = local36;
		this.aFloatArray20[3] = (float) Static277.anInt5361 * local10;
		this.aFloatArray20[0] = 0.0F;
		this.aFloatArray20[2] = 0.0F;
		local12.glTexGenfv(8193, 9474, this.aFloatArray20, 0);
		local12.glPopMatrix();
		if (Static27.aBoolean53) {
			this.aFloatArray20[1] = 0.0F;
			this.aFloatArray20[0] = 0.0F;
			this.aFloatArray20[2] = 0.0F;
			this.aFloatArray20[3] = (float) Static277.anInt5361 * local27;
			local12.glTexGenfv(8194, 9473, this.aFloatArray20, 0);
		} else {
			@Pc(186) int local186 = (int) (local27 * (float) Static277.anInt5361 * 64.0F);
			local12.glBindTexture(3553, Static27.anIntArray74[local186 % 64]);
		}
		local12.glActiveTexture(33984);
	}
}
