import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class49 implements Interface4 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	private int anInt1589;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[F")
	private float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class49() {
		this.method1509();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	private void method1509() {
		@Pc(7) GL local7 = Static156.aGL1;
		this.anInt1589 = local7.glGenLists(2);
		local7.glNewList(this.anInt1589, 4864);
		local7.glActiveTexture(33985);
		if (Static9.aBoolean5) {
			local7.glBindTexture(32879, Static9.anInt139);
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
		local7.glNewList(this.anInt1589 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static9.aBoolean5) {
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

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
	@Override
	public int method4404() {
		return 0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
	@Override
	public void method4405() {
		@Pc(5) GL local5 = Static156.aGL1;
		local5.glCallList(this.anInt1589 + 1);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	@Override
	public void method4403() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glCallList(this.anInt1589);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	@Override
	public void method4406(@OriginalArg(0) int arg0) {
		@Pc(3) GL local3 = Static156.aGL1;
		@Pc(16) float local16 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) boolean local25 = (arg0 & 0x80) != 0;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		if (local25) {
			this.aFloatArray6[0] = local33;
			this.aFloatArray6[1] = 0.0F;
			this.aFloatArray6[2] = 0.0F;
			this.aFloatArray6[3] = 0.0F;
		} else {
			this.aFloatArray6[2] = local33;
			this.aFloatArray6[3] = 0.0F;
			this.aFloatArray6[0] = 0.0F;
			this.aFloatArray6[1] = 0.0F;
		}
		@Pc(88) float local88 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		local3.glActiveTexture(33985);
		local3.glMatrixMode(5888);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local3.glRotatef((float) Static82.anInt1639 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local3.glRotatef((float) Static64.anInt1223 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local3.glTranslatef((float) -Static127.anInt2581, (float) -Static315.anInt5220, (float) -Static187.anInt3564);
		local3.glTexGenfv(8192, 9474, this.aFloatArray6, 0);
		this.aFloatArray6[3] = (float) Static156.anInt3082 * local16;
		this.aFloatArray6[1] = local33;
		this.aFloatArray6[0] = 0.0F;
		this.aFloatArray6[2] = 0.0F;
		local3.glTexGenfv(8193, 9474, this.aFloatArray6, 0);
		local3.glPopMatrix();
		if (Static9.aBoolean5) {
			this.aFloatArray6[2] = 0.0F;
			this.aFloatArray6[1] = 0.0F;
			this.aFloatArray6[3] = (float) Static156.anInt3082 * local88;
			this.aFloatArray6[0] = 0.0F;
			local3.glTexGenfv(8194, 9473, this.aFloatArray6, 0);
		} else {
			@Pc(218) int local218 = (int) ((float) Static156.anInt3082 * local88 * 64.0F);
			local3.glBindTexture(3553, Static9.anIntArray9[local218 % 64]);
		}
		local3.glActiveTexture(33984);
	}
}
