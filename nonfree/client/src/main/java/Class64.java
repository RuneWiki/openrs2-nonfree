import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class64 implements Interface5 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
	private int anInt1930;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "[F")
	private float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class64() {
		this.method1474();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	@Override
	public void method4314(@OriginalArg(0) int arg0) {
		@Pc(14) float local14 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(38) GL local38 = Static116.aGL1;
		@Pc(46) boolean local46 = (arg0 & 0x80) != 0;
		if (local46) {
			this.aFloatArray4[2] = 0.0F;
			this.aFloatArray4[0] = local36;
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[3] = 0.0F;
		} else {
			this.aFloatArray4[2] = local36;
			this.aFloatArray4[0] = 0.0F;
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[3] = 0.0F;
		}
		local38.glActiveTexture(33985);
		local38.glMatrixMode(5888);
		local38.glPushMatrix();
		local38.glLoadIdentity();
		local38.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local38.glRotatef((float) Static168.anInt5510 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local38.glRotatef((float) Static170.anInt3413 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local38.glTranslatef((float) -Static260.anInt5235, (float) -Static49.anInt1082, (float) -Static174.anInt3450);
		local38.glTexGenfv(8192, 9474, this.aFloatArray4, 0);
		this.aFloatArray4[2] = 0.0F;
		this.aFloatArray4[1] = local36;
		this.aFloatArray4[0] = 0.0F;
		this.aFloatArray4[3] = (float) Static116.anInt2376 * local14;
		local38.glTexGenfv(8193, 9474, this.aFloatArray4, 0);
		local38.glPopMatrix();
		if (Static129.aBoolean216) {
			this.aFloatArray4[1] = 0.0F;
			this.aFloatArray4[2] = 0.0F;
			this.aFloatArray4[0] = 0.0F;
			this.aFloatArray4[3] = local25 * (float) Static116.anInt2376;
			local38.glTexGenfv(8194, 9473, this.aFloatArray4, 0);
		} else {
			@Pc(220) int local220 = (int) (local25 * (float) Static116.anInt2376 * 64.0F);
			local38.glBindTexture(3553, Static129.anIntArray207[local220 % 64]);
		}
		local38.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	private void method1474() {
		@Pc(3) GL local3 = Static116.aGL1;
		this.anInt1930 = local3.glGenLists(2);
		local3.glNewList(this.anInt1930, 4864);
		local3.glActiveTexture(33985);
		if (Static129.aBoolean216) {
			local3.glBindTexture(32879, Static129.anInt2586);
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
		local3.glNewList(this.anInt1930 + 1, 4864);
		local3.glActiveTexture(33985);
		if (Static129.aBoolean216) {
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

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
	@Override
	public void method4315() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glCallList(this.anInt1930 + 1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
	@Override
	public int method4312() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "()V")
	@Override
	public void method4313() {
		@Pc(5) GL local5 = Static116.aGL1;
		local5.glCallList(this.anInt1930);
	}
}
