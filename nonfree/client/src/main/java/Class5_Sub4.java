import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!mt;")
	private final Class171 aClass171_2;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!kq;")
	private final Class144 aClass144_3;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!bl;Lclient!mt;)V")
	public Class5_Sub4(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		this.aClass171_2 = arg1;
		this.aClass144_3 = new Class144(arg0, 2);
		this.aClass144_3.method3283(0);
		super.aClass28_Sub1_42.method650(1);
		if (this.aClass171_2.aBoolean281) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass28_Sub1_42.method650(0);
		this.aClass144_3.method3284();
		this.aClass144_3.method3283(1);
		super.aClass28_Sub1_42.method650(1);
		if (this.aClass171_2.aBoolean281) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass28_Sub1_42.method650(0);
		this.aClass144_3.method3284();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		this.aClass144_3.method3285('\u0001');
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method654(null);
		super.aClass28_Sub1_42.method650(0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) float local18 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(29) float local29 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass28_Sub1_42.method650(1);
		@Pc(53) boolean local53 = (arg0 & 0x80) != 0;
		if (local53) {
			Static35.aFloatArray7[0] = local37;
			Static35.aFloatArray7[2] = 0.0F;
			Static35.aFloatArray7[1] = 0.0F;
			Static35.aFloatArray7[3] = 0.0F;
		} else {
			Static35.aFloatArray7[2] = local37;
			Static35.aFloatArray7[0] = 0.0F;
			Static35.aFloatArray7[3] = 0.0F;
			Static35.aFloatArray7[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static35.aFloatArray7, 0);
		Static35.aFloatArray7[1] = local37;
		Static35.aFloatArray7[3] = local18 * (float) super.aClass28_Sub1_42.anInt737 % 1.0F;
		Static35.aFloatArray7[0] = 0.0F;
		Static35.aFloatArray7[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static35.aFloatArray7, 0);
		if (this.aClass171_2.aBoolean281) {
			Static35.aFloatArray7[3] = local29 * (float) super.aClass28_Sub1_42.anInt737 % 1.0F;
			Static35.aFloatArray7[2] = 0.0F;
			Static35.aFloatArray7[1] = 0.0F;
			Static35.aFloatArray7[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static35.aFloatArray7, 0);
		} else {
			@Pc(136) int local136 = (int) ((float) super.aClass28_Sub1_42.anInt737 * local29 * 16.0F);
			super.aClass28_Sub1_42.method654(this.aClass171_2.aClass40_Sub3Array3[local136 % 16]);
		}
		super.aClass28_Sub1_42.method650(0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		this.aClass144_3.method3285('\u0000');
		if (this.aClass171_2.aBoolean281) {
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method654(this.aClass171_2.aClass40_Sub2_1);
			super.aClass28_Sub1_42.method650(0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		super.aClass28_Sub1_42.method654(arg0);
		super.aClass28_Sub1_42.method678(arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
	}
}
