import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class74 implements Interface3 {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	private int anInt2635;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[F")
	private float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class74() {
		this.method2040();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void method3962(@OriginalArg(0) int arg0) {
		@Pc(3) GL local3 = Static178.aGL1;
		@Pc(16) float local16 = (float) ((arg0 & 0x3) + 1) * -0.01F;
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(35) float local35 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		if (local44) {
			this.aFloatArray15[3] = 0.0F;
			this.aFloatArray15[0] = local35;
			this.aFloatArray15[2] = 0.0F;
			this.aFloatArray15[1] = 0.0F;
		} else {
			this.aFloatArray15[0] = 0.0F;
			this.aFloatArray15[1] = 0.0F;
			this.aFloatArray15[3] = 0.0F;
			this.aFloatArray15[2] = local35;
		}
		local3.glActiveTexture(33985);
		local3.glMatrixMode(5888);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local3.glRotatef((float) Static102.anInt2164 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local3.glRotatef((float) Static90.anInt1865 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local3.glTranslatef((float) -Static27.anInt1299, (float) -Static71.anInt1318, (float) -Static156.anInt3144);
		local3.glTexGenfv(8192, 9474, this.aFloatArray15, 0);
		this.aFloatArray15[2] = 0.0F;
		this.aFloatArray15[1] = local35;
		this.aFloatArray15[3] = (float) Static178.anInt3492 * local16;
		this.aFloatArray15[0] = 0.0F;
		local3.glTexGenfv(8193, 9474, this.aFloatArray15, 0);
		local3.glPopMatrix();
		if (Static195.aBoolean247) {
			this.aFloatArray15[2] = 0.0F;
			this.aFloatArray15[0] = 0.0F;
			this.aFloatArray15[1] = 0.0F;
			this.aFloatArray15[3] = local27 * (float) Static178.anInt3492;
			local3.glTexGenfv(8194, 9473, this.aFloatArray15, 0);
		} else {
			@Pc(186) int local186 = (int) ((float) Static178.anInt3492 * 64.0F * local27);
			local3.glBindTexture(3553, Static195.anIntArray321[local186 % 64]);
		}
		local3.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	@Override
	public void method3960() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glCallList(this.anInt2635 + 1);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
	@Override
	public int method3963() {
		return 0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	private void method2040() {
		@Pc(7) GL local7 = Static178.aGL1;
		this.anInt2635 = local7.glGenLists(2);
		local7.glNewList(this.anInt2635, 4864);
		local7.glActiveTexture(33985);
		if (Static195.aBoolean247) {
			local7.glBindTexture(32879, Static195.anInt3819);
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
		local7.glNewList(this.anInt2635 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static195.aBoolean247) {
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

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
	@Override
	public void method3961() {
		@Pc(5) GL local5 = Static178.aGL1;
		local5.glCallList(this.anInt2635);
	}
}
