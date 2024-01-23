import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class125 implements Interface2 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private int anInt3934;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[F")
	private float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class125() {
		this.method3154();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()V")
	@Override
	public void method3761() {
		@Pc(5) GL local5 = Static291.aGL1;
		local5.glCallList(this.anInt3934 + 1);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()V")
	@Override
	public void method3762() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glCallList(this.anInt3934);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method3763(@OriginalArg(0) int arg0) {
		@Pc(10) float local10 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(16) GL local16 = Static291.aGL1;
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		if (local44) {
			this.aFloatArray25[2] = 0.0F;
			this.aFloatArray25[3] = 0.0F;
			this.aFloatArray25[1] = 0.0F;
			this.aFloatArray25[0] = local36;
		} else {
			this.aFloatArray25[0] = 0.0F;
			this.aFloatArray25[3] = 0.0F;
			this.aFloatArray25[1] = 0.0F;
			this.aFloatArray25[2] = local36;
		}
		local16.glActiveTexture(33985);
		local16.glMatrixMode(5888);
		local16.glPushMatrix();
		local16.glLoadIdentity();
		local16.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local16.glRotatef((float) Static115.anInt2284 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local16.glRotatef((float) Static245.anInt2367 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local16.glTranslatef((float) -Static216.anInt4237, (float) -Static134.anInt2683, (float) -Static225.anInt4441);
		local16.glTexGenfv(8192, 9474, this.aFloatArray25, 0);
		this.aFloatArray25[1] = local36;
		this.aFloatArray25[0] = 0.0F;
		this.aFloatArray25[3] = local10 * (float) Static291.anInt5513;
		this.aFloatArray25[2] = 0.0F;
		local16.glTexGenfv(8193, 9474, this.aFloatArray25, 0);
		local16.glPopMatrix();
		if (Static153.aBoolean229) {
			this.aFloatArray25[3] = (float) Static291.anInt5513 * local27;
			this.aFloatArray25[2] = 0.0F;
			this.aFloatArray25[0] = 0.0F;
			this.aFloatArray25[1] = 0.0F;
			local16.glTexGenfv(8194, 9473, this.aFloatArray25, 0);
		} else {
			@Pc(218) int local218 = (int) (local27 * (float) Static291.anInt5513 * 64.0F);
			local16.glBindTexture(3553, Static153.anIntArray252[local218 % 64]);
		}
		local16.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	private void method3154() {
		@Pc(7) GL local7 = Static291.aGL1;
		this.anInt3934 = local7.glGenLists(2);
		local7.glNewList(this.anInt3934, 4864);
		local7.glActiveTexture(33985);
		if (Static153.aBoolean229) {
			local7.glBindTexture(32879, Static153.anInt3141);
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
		local7.glNewList(this.anInt3934 + 1, 4864);
		local7.glActiveTexture(33985);
		if (Static153.aBoolean229) {
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

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
	@Override
	public int method3760() {
		return 0;
	}
}
