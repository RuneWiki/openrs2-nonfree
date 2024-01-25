import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!ica;")
	private final Class150 aClass150_5;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!cl;")
	private final Class53 aClass53_5;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!ag;Lclient!ica;)V")
	public Class7_Sub7(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class150 arg1) {
		super(arg0);
		this.aClass150_5 = arg1;
		this.aClass53_5 = new Class53(arg0, 2);
		this.aClass53_5.method1513(0);
		super.aClass12_Sub1_42.method376(1);
		if (this.aClass150_5.aBoolean339) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass12_Sub1_42.method376(0);
		this.aClass53_5.method1514();
		this.aClass53_5.method1513(1);
		super.aClass12_Sub1_42.method376(1);
		if (this.aClass150_5.aBoolean339) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass12_Sub1_42.method376(0);
		this.aClass53_5.method1514();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		super.aClass12_Sub1_42.method378(arg1);
		super.aClass12_Sub1_42.method401(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		this.aClass53_5.method1511('\u0000');
		if (this.aClass150_5.aBoolean339) {
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method378(this.aClass150_5.aClass52_Sub4_2);
			super.aClass12_Sub1_42.method376(0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		this.aClass53_5.method1511('\u0001');
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method378(null);
		super.aClass12_Sub1_42.method376(0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass12_Sub1_42.method376(1);
		if (local47) {
			Static546.aFloatArray68[0] = local36;
			Static546.aFloatArray68[1] = 0.0F;
			Static546.aFloatArray68[2] = 0.0F;
			Static546.aFloatArray68[3] = 0.0F;
		} else {
			Static546.aFloatArray68[3] = 0.0F;
			Static546.aFloatArray68[1] = 0.0F;
			Static546.aFloatArray68[0] = 0.0F;
			Static546.aFloatArray68[2] = local36;
		}
		OpenGL.glTexGenfv(8192, 9474, Static546.aFloatArray68, 0);
		Static546.aFloatArray68[0] = 0.0F;
		Static546.aFloatArray68[1] = local36;
		Static546.aFloatArray68[2] = 0.0F;
		Static546.aFloatArray68[3] = (float) super.aClass12_Sub1_42.anInt461 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static546.aFloatArray68, 0);
		if (this.aClass150_5.aBoolean339) {
			Static546.aFloatArray68[2] = 0.0F;
			Static546.aFloatArray68[1] = 0.0F;
			Static546.aFloatArray68[0] = 0.0F;
			Static546.aFloatArray68[3] = local25 * (float) super.aClass12_Sub1_42.anInt461 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static546.aFloatArray68, 0);
		} else {
			@Pc(135) int local135 = (int) ((float) super.aClass12_Sub1_42.anInt461 * 16.0F * local25);
			super.aClass12_Sub1_42.method378(this.aClass150_5.aClass52_Sub1Array1[local135 % 16]);
		}
		super.aClass12_Sub1_42.method376(0);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return true;
	}
}
