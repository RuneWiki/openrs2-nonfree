import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!cf;")
	private final Class38 aClass38_1;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!q;")
	private final Class168 aClass168_1;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!hd;Lclient!cf;)V")
	public Class39_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class38 arg1) {
		super(arg0);
		this.aClass38_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass168_1 = new Class168(arg0, 2);
		this.aClass168_1.method4286(0);
		this.aClass89_Sub1_39.method2433(1);
		if (this.aClass38_1.aBoolean80) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass89_Sub1_39.method2433(0);
		this.aClass168_1.method4285();
		this.aClass168_1.method4286(1);
		this.aClass89_Sub1_39.method2433(1);
		if (this.aClass38_1.aBoolean80) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass89_Sub1_39.method2433(0);
		this.aClass168_1.method4285();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass89_Sub1_39.method2433(1);
		if (local35) {
			Static40.aFloatArray4[0] = local27;
			Static40.aFloatArray4[1] = 0.0F;
			Static40.aFloatArray4[2] = 0.0F;
			Static40.aFloatArray4[3] = 0.0F;
		} else {
			Static40.aFloatArray4[0] = 0.0F;
			Static40.aFloatArray4[1] = 0.0F;
			Static40.aFloatArray4[2] = local27;
			Static40.aFloatArray4[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static40.aFloatArray4, 0);
		Static40.aFloatArray4[0] = 0.0F;
		Static40.aFloatArray4[1] = local27;
		Static40.aFloatArray4[2] = 0.0F;
		Static40.aFloatArray4[3] = (float) this.aClass89_Sub1_39.anInt2599 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static40.aFloatArray4, 0);
		if (this.aClass38_1.aBoolean80) {
			Static40.aFloatArray4[0] = 0.0F;
			Static40.aFloatArray4[1] = 0.0F;
			Static40.aFloatArray4[2] = 0.0F;
			Static40.aFloatArray4[3] = (float) this.aClass89_Sub1_39.anInt2599 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static40.aFloatArray4, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass89_Sub1_39.anInt2599 * 16.0F);
			this.aClass89_Sub1_39.method2445(this.aClass38_1.aClass92_Sub4Array1[local127 % 16]);
		}
		this.aClass89_Sub1_39.method2433(0);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		this.aClass168_1.method4287('\u0001');
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2445(null);
		this.aClass89_Sub1_39.method2433(0);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		this.aClass168_1.method4287('\u0000');
		if (this.aClass38_1.aBoolean80) {
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2445(this.aClass38_1.aClass92_Sub1_2);
			this.aClass89_Sub1_39.method2433(0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
		this.aClass89_Sub1_39.method2445(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
	}
}
