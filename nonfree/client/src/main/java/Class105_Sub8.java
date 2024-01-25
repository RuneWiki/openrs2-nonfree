import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class105_Sub8 extends Class105 {

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "Lclient!ul;")
	private final Class330 aClass330_5;

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "Lclient!uq;")
	private final Class334 aClass334_5;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!kfa;Lclient!ul;)V")
	public Class105_Sub8(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		this.aClass330_5 = arg1;
		this.aClass334_5 = new Class334(arg0, 2);
		this.aClass334_5.method7573(0);
		super.aClass7_Sub2_41.method4326(1);
		if (this.aClass330_5.aBoolean660) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass7_Sub2_41.method4326(0);
		this.aClass334_5.method7574();
		this.aClass334_5.method7573(1);
		super.aClass7_Sub2_41.method4326(1);
		if (this.aClass330_5.aBoolean660) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass7_Sub2_41.method4326(0);
		this.aClass334_5.method7574();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass7_Sub2_41.method4313(arg1);
		super.aClass7_Sub2_41.method4288(arg0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		this.aClass334_5.method7575('\u0001');
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(null);
		super.aClass7_Sub2_41.method4326(0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass7_Sub2_41.method4326(1);
		if (local44) {
			Static433.aFloatArray65[2] = 0.0F;
			Static433.aFloatArray65[1] = 0.0F;
			Static433.aFloatArray65[3] = 0.0F;
			Static433.aFloatArray65[0] = local33;
		} else {
			Static433.aFloatArray65[3] = 0.0F;
			Static433.aFloatArray65[0] = 0.0F;
			Static433.aFloatArray65[1] = 0.0F;
			Static433.aFloatArray65[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static433.aFloatArray65, 0);
		Static433.aFloatArray65[0] = 0.0F;
		Static433.aFloatArray65[3] = (float) super.aClass7_Sub2_41.anInt5597 * local14 % 1.0F;
		Static433.aFloatArray65[2] = 0.0F;
		Static433.aFloatArray65[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static433.aFloatArray65, 0);
		if (this.aClass330_5.aBoolean660) {
			Static433.aFloatArray65[3] = local25 * (float) super.aClass7_Sub2_41.anInt5597 % 1.0F;
			Static433.aFloatArray65[1] = 0.0F;
			Static433.aFloatArray65[0] = 0.0F;
			Static433.aFloatArray65[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static433.aFloatArray65, 0);
		} else {
			@Pc(132) int local132 = (int) ((float) super.aClass7_Sub2_41.anInt5597 * local25 * 16.0F);
			super.aClass7_Sub2_41.method4313(this.aClass330_5.aClass3_Sub2Array3[local132 % 16]);
		}
		super.aClass7_Sub2_41.method4326(0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		this.aClass334_5.method7575('\u0000');
		if (this.aClass330_5.aBoolean660) {
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4313(this.aClass330_5.aClass3_Sub3_2);
			super.aClass7_Sub2_41.method4326(0);
		}
	}
}
