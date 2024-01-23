import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class129 implements Interface3 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	private int anInt3959;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "[F")
	private float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class129() {
		this.method3430();
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "()V")
	@Override
	public void method3929() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glCallList(this.anInt3959);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	private void method3430() {
		@Pc(7) GL local7 = Static71.aGL1;
		this.anInt3959 = local7.glGenLists(2);
		local7.glNewList(this.anInt3959, 4864);
		local7.glActiveTexture(33985);
		if (Static251.aBoolean429) {
			local7.glBindTexture(32879, Static251.anInt4615);
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
		local7.glNewList(this.anInt3959 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static251.aBoolean429) {
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

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()I")
	@Override
	public int method3928() {
		return 0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	@Override
	public void method3930(@OriginalArg(0) int arg0) {
		@Pc(7) GL local7 = Static71.aGL1;
		@Pc(16) float local16 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(38) float local38 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			this.aFloatArray27[0] = local27;
			this.aFloatArray27[1] = 0.0F;
			this.aFloatArray27[3] = 0.0F;
			this.aFloatArray27[2] = 0.0F;
		} else {
			this.aFloatArray27[1] = 0.0F;
			this.aFloatArray27[2] = local27;
			this.aFloatArray27[3] = 0.0F;
			this.aFloatArray27[0] = 0.0F;
		}
		local7.glActiveTexture(33985);
		local7.glMatrixMode(5888);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static284.anInt5165 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static175.anInt3414 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -Static37.anInt689, (float) -Static253.anInt4655, (float) -Static224.anInt4207);
		local7.glTexGenfv(8192, 9474, this.aFloatArray27, 0);
		this.aFloatArray27[3] = (float) Static71.anInt1545 * local16;
		this.aFloatArray27[1] = local27;
		this.aFloatArray27[2] = 0.0F;
		this.aFloatArray27[0] = 0.0F;
		local7.glTexGenfv(8193, 9474, this.aFloatArray27, 0);
		local7.glPopMatrix();
		if (Static251.aBoolean429) {
			this.aFloatArray27[1] = 0.0F;
			this.aFloatArray27[0] = 0.0F;
			this.aFloatArray27[3] = (float) Static71.anInt1545 * local38;
			this.aFloatArray27[2] = 0.0F;
			local7.glTexGenfv(8194, 9473, this.aFloatArray27, 0);
		} else {
			@Pc(223) int local223 = (int) (local38 * (float) Static71.anInt1545 * 64.0F);
			local7.glBindTexture(3553, Static251.anIntArray514[local223 % 64]);
		}
		local7.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "()V")
	@Override
	public void method3931() {
		@Pc(5) GL local5 = Static71.aGL1;
		local5.glCallList(this.anInt3959 + 1);
	}
}
