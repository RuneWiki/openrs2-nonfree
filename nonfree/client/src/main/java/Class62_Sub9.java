import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class62_Sub9 extends Class62 {

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Lclient!mc;")
	private final Class159 aClass159_6;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Lclient!ih;")
	private final Class117 aClass117_6;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ef;Lclient!mc;)V")
	public Class62_Sub9(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class159 arg1) {
		super(arg0);
		this.aClass159_6 = arg1;
		this.aClass117_6 = new Class117(arg0, 2);
		this.aClass117_6.method2648(0);
		super.aClass49_Sub2_43.method1600(1);
		if (this.aClass159_6.aBoolean328) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass49_Sub2_43.method1600(0);
		this.aClass117_6.method2647();
		this.aClass117_6.method2648(1);
		super.aClass49_Sub2_43.method1600(1);
		if (this.aClass159_6.aBoolean328) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass49_Sub2_43.method1600(0);
		this.aClass117_6.method2647();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		super.aClass49_Sub2_43.method1646(arg0);
		super.aClass49_Sub2_43.method1624(arg1);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(40) float local40 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass49_Sub2_43.method1600(1);
		@Pc(53) boolean local53 = (arg1 & 0x80) != 0;
		if (local53) {
			Static298.aFloatArray39[1] = 0.0F;
			Static298.aFloatArray39[2] = 0.0F;
			Static298.aFloatArray39[0] = local40;
			Static298.aFloatArray39[3] = 0.0F;
		} else {
			Static298.aFloatArray39[1] = 0.0F;
			Static298.aFloatArray39[0] = 0.0F;
			Static298.aFloatArray39[2] = local40;
			Static298.aFloatArray39[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static298.aFloatArray39, 0);
		Static298.aFloatArray39[1] = local40;
		Static298.aFloatArray39[0] = 0.0F;
		Static298.aFloatArray39[3] = local14 * (float) super.aClass49_Sub2_43.anInt2002 % 1.0F;
		Static298.aFloatArray39[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static298.aFloatArray39, 0);
		if (this.aClass159_6.aBoolean328) {
			Static298.aFloatArray39[1] = 0.0F;
			Static298.aFloatArray39[3] = local25 * (float) super.aClass49_Sub2_43.anInt2002 % 1.0F;
			Static298.aFloatArray39[0] = 0.0F;
			Static298.aFloatArray39[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static298.aFloatArray39, 0);
		} else {
			@Pc(136) int local136 = (int) ((float) super.aClass49_Sub2_43.anInt2002 * 16.0F * local25);
			super.aClass49_Sub2_43.method1646(this.aClass159_6.aClass55_Sub3Array3[local136 % 16]);
		}
		super.aClass49_Sub2_43.method1600(0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		this.aClass117_6.method2645('\u0001');
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1646(null);
		super.aClass49_Sub2_43.method1600(0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		this.aClass117_6.method2645('\u0000');
		if (this.aClass159_6.aBoolean328) {
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1646(this.aClass159_6.aClass55_Sub2_2);
			super.aClass49_Sub2_43.method1600(0);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}
}
