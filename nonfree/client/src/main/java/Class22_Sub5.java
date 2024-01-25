import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!bt;")
	private final Class30 aClass30_3;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!ce;")
	private final Class37 aClass37_3;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!vd;Lclient!bt;)V")
	public Class22_Sub5(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_3 = arg1;
		this.aClass37_3 = new Class37(arg0, 2);
		this.aClass37_3.method601(0);
		super.aClass51_Sub2_33.method5371(1);
		if (this.aClass30_3.aBoolean30) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass51_Sub2_33.method5371(0);
		this.aClass37_3.method606();
		this.aClass37_3.method601(1);
		super.aClass51_Sub2_33.method5371(1);
		if (this.aClass30_3.aBoolean30) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass51_Sub2_33.method5371(0);
		this.aClass37_3.method606();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass51_Sub2_33.method5371(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static15.aFloatArray1[1] = 0.0F;
			Static15.aFloatArray1[0] = local33;
			Static15.aFloatArray1[2] = 0.0F;
			Static15.aFloatArray1[3] = 0.0F;
		} else {
			Static15.aFloatArray1[3] = 0.0F;
			Static15.aFloatArray1[1] = 0.0F;
			Static15.aFloatArray1[2] = local33;
			Static15.aFloatArray1[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static15.aFloatArray1, 0);
		Static15.aFloatArray1[0] = 0.0F;
		Static15.aFloatArray1[2] = 0.0F;
		Static15.aFloatArray1[3] = (float) super.aClass51_Sub2_33.anInt6911 * local14 % 1.0F;
		Static15.aFloatArray1[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static15.aFloatArray1, 0);
		if (this.aClass30_3.aBoolean30) {
			Static15.aFloatArray1[2] = 0.0F;
			Static15.aFloatArray1[0] = 0.0F;
			Static15.aFloatArray1[1] = 0.0F;
			Static15.aFloatArray1[3] = (float) super.aClass51_Sub2_33.anInt6911 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static15.aFloatArray1, 0);
		} else {
			@Pc(136) int local136 = (int) (local25 * (float) super.aClass51_Sub2_33.anInt6911 * 16.0F);
			super.aClass51_Sub2_33.method5364(this.aClass30_3.aClass59_Sub3Array1[local136 % 16]);
		}
		super.aClass51_Sub2_33.method5371(0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		this.aClass37_3.method600('\u0001');
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5364(null);
		super.aClass51_Sub2_33.method5371(0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		this.aClass37_3.method600('\u0000');
		if (this.aClass30_3.aBoolean30) {
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5364(this.aClass30_3.aClass59_Sub2_1);
			super.aClass51_Sub2_33.method5371(0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		super.aClass51_Sub2_33.method5364(arg0);
		super.aClass51_Sub2_33.method5400(arg1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return true;
	}
}
