import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class149 implements Interface1 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	private int anInt4693;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[F")
	private float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class149() {
		this.method3987();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
	@Override
	public int method3986() {
		return 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	@Override
	public void method3983() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glCallList(this.anInt4693);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public void method3985(@OriginalArg(0) int arg0) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -0.01F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		if (local44) {
			this.aFloatArray19[3] = 0.0F;
			this.aFloatArray19[1] = 0.0F;
			this.aFloatArray19[2] = 0.0F;
			this.aFloatArray19[0] = local33;
		} else {
			this.aFloatArray19[3] = 0.0F;
			this.aFloatArray19[2] = local33;
			this.aFloatArray19[1] = 0.0F;
			this.aFloatArray19[0] = 0.0F;
		}
		@Pc(90) GL local90 = Static283.aGL1;
		local90.glActiveTexture(33985);
		local90.glMatrixMode(5888);
		local90.glPushMatrix();
		local90.glLoadIdentity();
		local90.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local90.glRotatef((float) Static241.anInt4892 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local90.glRotatef((float) Static184.anInt3648 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local90.glTranslatef((float) -Static136.anInt2621, (float) -Static246.anInt4983, (float) -Static313.anInt6125);
		local90.glTexGenfv(8192, 9474, this.aFloatArray19, 0);
		this.aFloatArray19[3] = (float) Static283.anInt5687 * local14;
		this.aFloatArray19[0] = 0.0F;
		this.aFloatArray19[1] = local33;
		this.aFloatArray19[2] = 0.0F;
		local90.glTexGenfv(8193, 9474, this.aFloatArray19, 0);
		local90.glPopMatrix();
		if (Static8.aBoolean15) {
			this.aFloatArray19[2] = 0.0F;
			this.aFloatArray19[1] = 0.0F;
			this.aFloatArray19[0] = 0.0F;
			this.aFloatArray19[3] = local25 * (float) Static283.anInt5687;
			local90.glTexGenfv(8194, 9473, this.aFloatArray19, 0);
		} else {
			@Pc(220) int local220 = (int) (local25 * (float) Static283.anInt5687 * 64.0F);
			local90.glBindTexture(3553, Static8.anIntArray14[local220 % 64]);
		}
		local90.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	private void method3987() {
		@Pc(3) GL local3 = Static283.aGL1;
		this.anInt4693 = local3.glGenLists(2);
		local3.glNewList(this.anInt4693, 4864);
		local3.glActiveTexture(33985);
		if (Static8.aBoolean15) {
			local3.glBindTexture(32879, Static8.anInt172);
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
		local3.glNewList(this.anInt4693 + 1, 4864);
		local3.glActiveTexture(33985);
		if (Static8.aBoolean15) {
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

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()V")
	@Override
	public void method3984() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glCallList(this.anInt4693 + 1);
	}
}
