import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class149 implements Interface4 {

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	private int anInt4999;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "[F")
	private float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class149() {
		this.method3780();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()I")
	@Override
	public int method3793() {
		return 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0) {
		@Pc(7) GL local7 = Static294.aGL1;
		@Pc(18) float local18 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(27) float local27 = (float) ((arg0 & 0x3) + 1) * -0.01F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		@Pc(44) float local44 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		if (local36) {
			this.aFloatArray23[3] = 0.0F;
			this.aFloatArray23[0] = local44;
			this.aFloatArray23[2] = 0.0F;
			this.aFloatArray23[1] = 0.0F;
		} else {
			this.aFloatArray23[3] = 0.0F;
			this.aFloatArray23[1] = 0.0F;
			this.aFloatArray23[2] = local44;
			this.aFloatArray23[0] = 0.0F;
		}
		local7.glActiveTexture(33985);
		local7.glMatrixMode(5888);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static279.anInt5608 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static162.anInt3539 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -Static264.anInt5303, (float) -Static159.anInt3532, (float) -Static120.anInt6261);
		local7.glTexGenfv(8192, 9474, this.aFloatArray23, 0);
		this.aFloatArray23[0] = 0.0F;
		this.aFloatArray23[3] = (float) Static294.anInt5871 * local27;
		this.aFloatArray23[2] = 0.0F;
		this.aFloatArray23[1] = local44;
		local7.glTexGenfv(8193, 9474, this.aFloatArray23, 0);
		local7.glPopMatrix();
		if (Static97.aBoolean145) {
			this.aFloatArray23[1] = 0.0F;
			this.aFloatArray23[2] = 0.0F;
			this.aFloatArray23[0] = 0.0F;
			this.aFloatArray23[3] = (float) Static294.anInt5871 * local18;
			local7.glTexGenfv(8194, 9473, this.aFloatArray23, 0);
		} else {
			@Pc(186) int local186 = (int) (local18 * 64.0F * (float) Static294.anInt5871);
			local7.glBindTexture(3553, Static97.anIntArray218[local186 % 64]);
		}
		local7.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	@Override
	public void method3791() {
		@Pc(5) GL local5 = Static294.aGL1;
		local5.glCallList(this.anInt4999 + 1);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	private void method3780() {
		@Pc(3) GL local3 = Static294.aGL1;
		this.anInt4999 = local3.glGenLists(2);
		local3.glNewList(this.anInt4999, 4864);
		local3.glActiveTexture(33985);
		if (Static97.aBoolean145) {
			local3.glBindTexture(32879, Static97.anInt2214);
			local3.glTexGeni(8194, 9472, 9217);
			local3.glEnable(3170);
			local3.glEnable(32879);
		} else {
			local3.glEnable(3553);
		}
		local3.glTexGeni(8192, 9472, 9216);
		local3.glTexGeni(8193, 9472, 9216);
		local3.glEnable(3168);
		local3.glEnable(3169);
		local3.glActiveTexture(33984);
		local3.glEndList();
		local3.glNewList(this.anInt4999 + 1, 4864);
		local3.glActiveTexture(33985);
		if (Static97.aBoolean145) {
			local3.glDisable(32879);
			local3.glDisable(3170);
		} else {
			local3.glDisable(3553);
		}
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glActiveTexture(33984);
		local3.glEndList();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
	@Override
	public void method3794() {
		@Pc(5) GL local5 = Static294.aGL1;
		local5.glCallList(this.anInt4999);
	}
}
