import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class98 implements Interface2 {

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	private int anInt3211;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[F")
	private float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class98() {
		this.method2535();
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "()I")
	@Override
	public int method4569() {
		return 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	@Override
	public void method4567(@OriginalArg(0) int arg0) {
		@Pc(14) float local14 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) float local36 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		if (local47) {
			this.aFloatArray18[1] = 0.0F;
			this.aFloatArray18[2] = 0.0F;
			this.aFloatArray18[0] = local25;
			this.aFloatArray18[3] = 0.0F;
		} else {
			this.aFloatArray18[0] = 0.0F;
			this.aFloatArray18[2] = local25;
			this.aFloatArray18[1] = 0.0F;
			this.aFloatArray18[3] = 0.0F;
		}
		@Pc(93) GL local93 = Static251.aGL1;
		local93.glActiveTexture(33985);
		local93.glMatrixMode(5888);
		local93.glPushMatrix();
		local93.glLoadIdentity();
		local93.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local93.glRotatef((float) Static293.anInt5686 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local93.glRotatef((float) Static193.anInt3890 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local93.glTranslatef((float) -Static3.anInt19, (float) -Static279.anInt5478, (float) -Static176.anInt5575);
		local93.glTexGenfv(8192, 9474, this.aFloatArray18, 0);
		this.aFloatArray18[2] = 0.0F;
		this.aFloatArray18[1] = local25;
		this.aFloatArray18[3] = local14 * (float) Static251.anInt4930;
		this.aFloatArray18[0] = 0.0F;
		local93.glTexGenfv(8193, 9474, this.aFloatArray18, 0);
		local93.glPopMatrix();
		if (Static220.aBoolean262) {
			this.aFloatArray18[3] = (float) Static251.anInt4930 * local36;
			this.aFloatArray18[1] = 0.0F;
			this.aFloatArray18[2] = 0.0F;
			this.aFloatArray18[0] = 0.0F;
			local93.glTexGenfv(8194, 9473, this.aFloatArray18, 0);
		} else {
			@Pc(191) int local191 = (int) (local36 * (float) Static251.anInt4930 * 64.0F);
			local93.glBindTexture(3553, Static220.anIntArray349[local191 % 64]);
		}
		local93.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	private void method2535() {
		@Pc(7) GL local7 = Static251.aGL1;
		this.anInt3211 = local7.glGenLists(2);
		local7.glNewList(this.anInt3211, 4864);
		local7.glActiveTexture(33985);
		if (Static220.aBoolean262) {
			local7.glBindTexture(32879, Static220.anInt4219);
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
		local7.glNewList(this.anInt3211 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static220.aBoolean262) {
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

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "()V")
	@Override
	public void method4568() {
		@Pc(5) GL local5 = Static251.aGL1;
		local5.glCallList(this.anInt3211 + 1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "()V")
	@Override
	public void method4566() {
		@Pc(5) GL local5 = Static251.aGL1;
		local5.glCallList(this.anInt3211);
	}
}
