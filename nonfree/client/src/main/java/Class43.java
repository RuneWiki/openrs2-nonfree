import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class43 implements Interface1 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[F")
	private float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class43() {
		this.method1040();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	@Override
	public void method4327() {
		@Pc(5) GL local5 = Static240.aGL1;
		local5.glCallList(this.anInt1271);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
	@Override
	public void method4328() {
		@Pc(5) GL local5 = Static240.aGL1;
		local5.glCallList(this.anInt1271 + 1);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()I")
	@Override
	public int method4330() {
		return 0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	private void method1040() {
		@Pc(7) GL local7 = Static240.aGL1;
		this.anInt1271 = local7.glGenLists(2);
		local7.glNewList(this.anInt1271, 4864);
		local7.glActiveTexture(33985);
		if (Static42.aBoolean83) {
			local7.glBindTexture(32879, Static42.anInt894);
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
		local7.glNewList(this.anInt1271 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static42.aBoolean83) {
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

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	@Override
	public void method4329(@OriginalArg(0) int arg0) {
		@Pc(14) float local14 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(16) GL local16 = Static240.aGL1;
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(38) float local38 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		if (local47) {
			this.aFloatArray13[3] = 0.0F;
			this.aFloatArray13[0] = local38;
			this.aFloatArray13[1] = 0.0F;
			this.aFloatArray13[2] = 0.0F;
		} else {
			this.aFloatArray13[0] = 0.0F;
			this.aFloatArray13[1] = 0.0F;
			this.aFloatArray13[3] = 0.0F;
			this.aFloatArray13[2] = local38;
		}
		local16.glActiveTexture(33985);
		local16.glMatrixMode(5888);
		local16.glPushMatrix();
		local16.glLoadIdentity();
		local16.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local16.glRotatef((float) Static147.anInt2715 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local16.glRotatef((float) Static28.anInt602 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local16.glTranslatef((float) -Static110.anInt2060, (float) -Static234.anInt4890, (float) -Static124.anInt2374);
		local16.glTexGenfv(8192, 9474, this.aFloatArray13, 0);
		this.aFloatArray13[0] = 0.0F;
		this.aFloatArray13[1] = local38;
		this.aFloatArray13[2] = 0.0F;
		this.aFloatArray13[3] = local14 * (float) Static240.anInt4950;
		local16.glTexGenfv(8193, 9474, this.aFloatArray13, 0);
		local16.glPopMatrix();
		if (Static42.aBoolean83) {
			this.aFloatArray13[0] = 0.0F;
			this.aFloatArray13[2] = 0.0F;
			this.aFloatArray13[1] = 0.0F;
			this.aFloatArray13[3] = local27 * (float) Static240.anInt4950;
			local16.glTexGenfv(8194, 9473, this.aFloatArray13, 0);
		} else {
			@Pc(221) int local221 = (int) ((float) Static240.anInt4950 * local27 * 64.0F);
			local16.glBindTexture(3553, Static42.anIntArray124[local221 % 64]);
		}
		local16.glActiveTexture(33984);
	}
}
