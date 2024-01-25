import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class120_Sub2 extends Class120 {

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "[F")
	private final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "Lclient!le;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!le;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "Lclient!le;")
	private Class175 aClass175_4;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "Lclient!le;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!gf;Lclient!kea;)V")
	public Class120_Sub2(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class161 arg1) {
		super(arg0);
		if (arg0.aBoolean269) {
			this.aClass175_2 = Static187.method3528(arg1.method4238("uw_ground_unlit", "gl"), arg0);
			this.aClass175_1 = Static187.method3528(arg1.method4238("uw_ground_lit", "gl"), arg0);
			this.aClass175_4 = Static187.method3528(arg1.method4238("uw_model_unlit", "gl"), arg0);
			this.aClass175_3 = Static187.method3528(arg1.method4238("uw_model_lit", "gl"), arg0);
			this.aBoolean313 = this.aClass175_3 != null & this.aClass175_4 != null & this.aClass175_2 != null & this.aClass175_1 != null;
		} else {
			this.aBoolean313 = false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		if (this.aBoolean314) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean314 = false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
	@Override
	public void method7330() {
		@Pc(8) int local8 = super.aClass5_Sub3_20.method6389();
		@Pc(17) Class205_Sub1 local17 = super.aClass5_Sub3_20.method6427();
		local17.method5234(this.aFloatArray32, 0.0F, -1.0F, (float) local8, 0.0F);
		if (this.aBoolean315) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass175_1.anInt5580 : this.aClass175_3.anInt5580);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass175_2.anInt5580 : this.aClass175_4.anInt5580);
		}
		OpenGL.glEnable(34336);
		this.aBoolean314 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray32[0], this.aFloatArray32[1], this.aFloatArray32[2], this.aFloatArray32[3]);
		this.method7321();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass5_Sub3_20.method6416(arg1);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		this.aBoolean315 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	@Override
	public void method7321() {
		if (this.aBoolean314) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass5_Sub3_20.IA() - 1280), (float) (super.aClass5_Sub3_20.IA() - 768), 1.0F / (float) super.aClass5_Sub3_20.method6296(), (float) super.aClass5_Sub3_20.method6323() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return this.aBoolean313;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
