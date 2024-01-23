import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class19 implements Interface5 {

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "[F")
	private float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class19() {
		this.method489();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	@Override
	public void method4036() {
		@Pc(5) GL local5 = Static116.aGL1;
		local5.glCallList(this.anInt546 + 1);
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()I")
	@Override
	public int method4038() {
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	private void method489() {
		@Pc(3) GL local3 = Static116.aGL1;
		this.anInt546 = local3.glGenLists(2);
		local3.glNewList(this.anInt546, 4864);
		local3.glActiveTexture(33985);
		if (Static286.aBoolean372) {
			local3.glBindTexture(32879, Static286.anInt5649);
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
		local3.glNewList(this.anInt546 + 1, 4864);
		local3.glActiveTexture(33985);
		if (Static286.aBoolean372) {
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

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	@Override
	public void method4037() {
		@Pc(5) GL local5 = Static116.aGL1;
		local5.glCallList(this.anInt546);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	@Override
	public void method4039(@OriginalArg(0) int arg0) {
		@Pc(7) GL local7 = Static116.aGL1;
		@Pc(16) float local16 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(38) float local38 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			this.aFloatArray3[1] = 0.0F;
			this.aFloatArray3[2] = 0.0F;
			this.aFloatArray3[0] = local38;
			this.aFloatArray3[3] = 0.0F;
		} else {
			this.aFloatArray3[0] = 0.0F;
			this.aFloatArray3[3] = 0.0F;
			this.aFloatArray3[2] = local38;
			this.aFloatArray3[1] = 0.0F;
		}
		local7.glActiveTexture(33985);
		local7.glMatrixMode(5888);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static70.anInt1777 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static265.anInt5204 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -Static277.anInt5482, (float) -Static229.anInt4619, (float) -Static153.anInt3403);
		local7.glTexGenfv(8192, 9474, this.aFloatArray3, 0);
		this.aFloatArray3[3] = local16 * (float) Static116.anInt2602;
		this.aFloatArray3[0] = 0.0F;
		this.aFloatArray3[2] = 0.0F;
		this.aFloatArray3[1] = local38;
		local7.glTexGenfv(8193, 9474, this.aFloatArray3, 0);
		local7.glPopMatrix();
		if (Static286.aBoolean372) {
			this.aFloatArray3[2] = 0.0F;
			this.aFloatArray3[3] = local27 * (float) Static116.anInt2602;
			this.aFloatArray3[0] = 0.0F;
			this.aFloatArray3[1] = 0.0F;
			local7.glTexGenfv(8194, 9473, this.aFloatArray3, 0);
		} else {
			@Pc(223) int local223 = (int) ((float) Static116.anInt2602 * 64.0F * local27);
			local7.glBindTexture(3553, Static286.anIntArray538[local223 % 64]);
		}
		local7.glActiveTexture(33984);
	}
}
