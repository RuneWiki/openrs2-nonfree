import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class52 implements Interface1 {

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	private int anInt1768;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[F")
	private float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class52() {
		this.method1318();
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
	@Override
	public void method3559() {
		@Pc(5) GL local5 = Static296.aGL1;
		local5.glCallList(this.anInt1768 + 1);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	private void method1318() {
		@Pc(7) GL local7 = Static296.aGL1;
		this.anInt1768 = local7.glGenLists(2);
		local7.glNewList(this.anInt1768, 4864);
		local7.glActiveTexture(33985);
		if (Static69.aBoolean95) {
			local7.glBindTexture(32879, Static69.anInt1758);
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
		local7.glNewList(this.anInt1768 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static69.aBoolean95) {
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

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	@Override
	public void method3557() {
		@Pc(5) GL local5 = Static296.aGL1;
		local5.glCallList(this.anInt1768);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public void method3556(@OriginalArg(0) int arg0) {
		@Pc(3) GL local3 = Static296.aGL1;
		@Pc(18) float local18 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(27) float local27 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(38) float local38 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(46) boolean local46 = (arg0 & 0x80) != 0;
		if (local46) {
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[0] = local38;
			this.aFloatArray4[2] = 0.0F;
			this.aFloatArray4[3] = 0.0F;
		} else {
			this.aFloatArray4[0] = 0.0F;
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[3] = 0.0F;
			this.aFloatArray4[2] = local38;
		}
		local3.glActiveTexture(33985);
		local3.glMatrixMode(5888);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local3.glRotatef((float) Static130.anInt2891 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local3.glRotatef((float) Static202.anInt4499 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local3.glTranslatef((float) -Static253.anInt5521, (float) -Static144.anInt3375, (float) -Static171.anInt3879);
		local3.glTexGenfv(8192, 9474, this.aFloatArray4, 0);
		this.aFloatArray4[0] = 0.0F;
		this.aFloatArray4[2] = 0.0F;
		this.aFloatArray4[1] = local38;
		this.aFloatArray4[3] = local27 * (float) Static296.anInt6203;
		local3.glTexGenfv(8193, 9474, this.aFloatArray4, 0);
		local3.glPopMatrix();
		if (Static69.aBoolean95) {
			this.aFloatArray4[2] = 0.0F;
			this.aFloatArray4[0] = 0.0F;
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[3] = (float) Static296.anInt6203 * local18;
			local3.glTexGenfv(8194, 9473, this.aFloatArray4, 0);
		} else {
			@Pc(220) int local220 = (int) (local18 * (float) Static296.anInt6203 * 64.0F);
			local3.glBindTexture(3553, Static69.anIntArray182[local220 % 64]);
		}
		local3.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
	@Override
	public int method3558() {
		return 0;
	}
}
