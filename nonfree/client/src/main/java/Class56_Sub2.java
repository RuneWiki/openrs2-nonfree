import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!go;")
	private final Class96 aClass96_2;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "Lclient!wu;")
	private final Class269 aClass269_2;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ht;Lclient!go;)V")
	public Class56_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class96 arg1) {
		super(arg0);
		this.aClass96_2 = arg1;
		this.aClass269_2 = new Class269(arg0, 2);
		this.aClass269_2.method6086(0);
		super.aClass109_Sub1_41.method2564(1);
		if (this.aClass96_2.aBoolean124) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass109_Sub1_41.method2564(0);
		this.aClass269_2.method6090();
		this.aClass269_2.method6086(1);
		super.aClass109_Sub1_41.method2564(1);
		if (this.aClass96_2.aBoolean124) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass109_Sub1_41.method2564(0);
		this.aClass269_2.method6090();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		this.aClass269_2.method6088('\u0000');
		if (this.aClass96_2.aBoolean124) {
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2578(this.aClass96_2.aClass13_Sub2_2);
			super.aClass109_Sub1_41.method2564(0);
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		super.aClass109_Sub1_41.method2578(arg1);
		super.aClass109_Sub1_41.method2531(arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		this.aClass269_2.method6088('\u0001');
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2578(null);
		super.aClass109_Sub1_41.method2564(0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass109_Sub1_41.method2564(1);
		@Pc(52) boolean local52 = (arg0 & 0x80) != 0;
		if (local52) {
			Static314.aFloatArray25[0] = local36;
			Static314.aFloatArray25[2] = 0.0F;
			Static314.aFloatArray25[1] = 0.0F;
			Static314.aFloatArray25[3] = 0.0F;
		} else {
			Static314.aFloatArray25[1] = 0.0F;
			Static314.aFloatArray25[2] = local36;
			Static314.aFloatArray25[0] = 0.0F;
			Static314.aFloatArray25[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static314.aFloatArray25, 0);
		Static314.aFloatArray25[1] = local36;
		Static314.aFloatArray25[2] = 0.0F;
		Static314.aFloatArray25[0] = 0.0F;
		Static314.aFloatArray25[3] = local14 * (float) super.aClass109_Sub1_41.anInt2974 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static314.aFloatArray25, 0);
		if (this.aClass96_2.aBoolean124) {
			Static314.aFloatArray25[2] = 0.0F;
			Static314.aFloatArray25[0] = 0.0F;
			Static314.aFloatArray25[3] = (float) super.aClass109_Sub1_41.anInt2974 * local25 % 1.0F;
			Static314.aFloatArray25[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static314.aFloatArray25, 0);
		} else {
			@Pc(143) int local143 = (int) ((float) super.aClass109_Sub1_41.anInt2974 * 16.0F * local25);
			super.aClass109_Sub1_41.method2578(this.aClass96_2.aClass13_Sub1Array2[local143 % 16]);
		}
		super.aClass109_Sub1_41.method2564(0);
	}
}
