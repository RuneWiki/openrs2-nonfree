import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class163 implements Interface2 {

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	private int anInt5042;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[F")
	private float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class163() {
		this.method4069();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	private void method4069() {
		@Pc(3) GL local3 = Static60.aGL1;
		this.anInt5042 = local3.glGenLists(2);
		local3.glNewList(this.anInt5042, 4864);
		local3.glActiveTexture(33985);
		if (Static132.aBoolean216) {
			local3.glBindTexture(32879, Static132.anInt2696);
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
		local3.glNewList(this.anInt5042 + 1, 4864);
		local3.glActiveTexture(33985);
		if (Static132.aBoolean216) {
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

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
	@Override
	public void method4853() {
		@Pc(5) GL local5 = Static60.aGL1;
		local5.glCallList(this.anInt5042 + 1);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		@Pc(7) GL local7 = Static60.aGL1;
		@Pc(18) float local18 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(29) float local29 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(38) float local38 = (float) ((arg0 & 0x3) + 1) * -0.01F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		if (local47) {
			this.aFloatArray30[2] = 0.0F;
			this.aFloatArray30[0] = local29;
			this.aFloatArray30[1] = 0.0F;
			this.aFloatArray30[3] = 0.0F;
		} else {
			this.aFloatArray30[2] = local29;
			this.aFloatArray30[3] = 0.0F;
			this.aFloatArray30[0] = 0.0F;
			this.aFloatArray30[1] = 0.0F;
		}
		local7.glActiveTexture(33985);
		local7.glMatrixMode(5888);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static266.anInt5529 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static75.anInt1615 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -Static260.anInt5406, (float) -Static56.anInt1271, (float) -Static217.anInt4546);
		local7.glTexGenfv(8192, 9474, this.aFloatArray30, 0);
		this.aFloatArray30[1] = local29;
		this.aFloatArray30[0] = 0.0F;
		this.aFloatArray30[3] = local38 * (float) Static60.anInt1340;
		this.aFloatArray30[2] = 0.0F;
		local7.glTexGenfv(8193, 9474, this.aFloatArray30, 0);
		local7.glPopMatrix();
		if (Static132.aBoolean216) {
			this.aFloatArray30[0] = 0.0F;
			this.aFloatArray30[3] = (float) Static60.anInt1340 * local18;
			this.aFloatArray30[2] = 0.0F;
			this.aFloatArray30[1] = 0.0F;
			local7.glTexGenfv(8194, 9473, this.aFloatArray30, 0);
		} else {
			@Pc(189) int local189 = (int) (local18 * 64.0F * (float) Static60.anInt1340);
			local7.glBindTexture(3553, Static132.anIntArray200[local189 % 64]);
		}
		local7.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()V")
	@Override
	public void method4855() {
		@Pc(5) GL local5 = Static60.aGL1;
		local5.glCallList(this.anInt5042);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()I")
	@Override
	public int method4854() {
		return 0;
	}
}
