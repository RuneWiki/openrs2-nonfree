import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!qg;")
	private final Class166 aClass166_1;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!pa;")
	private final Class155 aClass155_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!nf;Lclient!qg;)V")
	public Class20_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Class166 arg1) {
		super(arg0);
		this.aClass166_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass155_1 = new Class155(arg0, 2);
		this.aClass155_1.method4111(0);
		this.aClass105_Sub1_42.method3634(1);
		if (this.aClass166_1.aBoolean424) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass105_Sub1_42.method3634(0);
		this.aClass155_1.method4110();
		this.aClass155_1.method4111(1);
		this.aClass105_Sub1_42.method3634(1);
		if (this.aClass166_1.aBoolean424) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass105_Sub1_42.method3634(0);
		this.aClass155_1.method4110();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!me;)V")
	@Override
	public void method5680(@OriginalArg(0) Class44 arg0) {
		this.aClass105_Sub1_42.method3591(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
	@Override
	public void method5684() {
		this.aClass155_1.method4112('\u0001');
		this.aClass105_Sub1_42.method3634(1);
		this.aClass105_Sub1_42.method3591(null);
		this.aClass105_Sub1_42.method3634(0);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	@Override
	public void method5682(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5681(@OriginalArg(0) boolean arg0) {
		this.aClass155_1.method4112('\u0000');
		if (this.aClass166_1.aBoolean424) {
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3591(this.aClass166_1.aClass44_Sub2_1);
			this.aClass105_Sub1_42.method3634(0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Z")
	@Override
	public boolean method5683() {
		return true;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method5685(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass105_Sub1_42.anOpengl1;
		this.aClass105_Sub1_42.method3634(1);
		if (local35) {
			Static21.aFloatArray1[0] = local27;
			Static21.aFloatArray1[1] = 0.0F;
			Static21.aFloatArray1[2] = 0.0F;
			Static21.aFloatArray1[3] = 0.0F;
		} else {
			Static21.aFloatArray1[0] = 0.0F;
			Static21.aFloatArray1[1] = 0.0F;
			Static21.aFloatArray1[2] = local27;
			Static21.aFloatArray1[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static21.aFloatArray1, 0);
		Static21.aFloatArray1[0] = 0.0F;
		Static21.aFloatArray1[1] = local27;
		Static21.aFloatArray1[2] = 0.0F;
		Static21.aFloatArray1[3] = (float) this.aClass105_Sub1_42.anInt4167 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static21.aFloatArray1, 0);
		if (this.aClass166_1.aBoolean424) {
			Static21.aFloatArray1[0] = 0.0F;
			Static21.aFloatArray1[1] = 0.0F;
			Static21.aFloatArray1[2] = 0.0F;
			Static21.aFloatArray1[3] = (float) this.aClass105_Sub1_42.anInt4167 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static21.aFloatArray1, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass105_Sub1_42.anInt4167 * 16.0F);
			this.aClass105_Sub1_42.method3591(this.aClass166_1.aClass44_Sub1Array4[local127 % 16]);
		}
		this.aClass105_Sub1_42.method3634(0);
	}
}
