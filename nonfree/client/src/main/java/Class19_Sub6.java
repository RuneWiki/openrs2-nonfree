import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class19_Sub6 extends Class19 {

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Z")
	private boolean aBoolean628;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "Z")
	private boolean aBoolean629;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "[F")
	private final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!ne;")
	private Class226 aClass226_3;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "Lclient!ne;")
	private Class226 aClass226_5;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!ne;")
	private Class226 aClass226_2;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "Lclient!ne;")
	private Class226 aClass226_4;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
	private final boolean aBoolean627;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!ia;Lclient!pe;)V")
	public Class19_Sub6(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class254 arg1) {
		super(arg0);
		if (arg0.aBoolean331) {
			this.aClass226_3 = Static55.method1314(arg1.method6410("uw_ground_unlit", "gl"), arg0);
			this.aClass226_5 = Static55.method1314(arg1.method6410("uw_ground_lit", "gl"), arg0);
			this.aClass226_2 = Static55.method1314(arg1.method6410("uw_model_unlit", "gl"), arg0);
			this.aClass226_4 = Static55.method1314(arg1.method6410("uw_model_lit", "gl"), arg0);
			this.aBoolean627 = this.aClass226_4 != null & this.aClass226_5 != null & this.aClass226_3 != null & this.aClass226_2 != null;
		} else {
			this.aBoolean627 = false;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	@Override
	public void method7884() {
		@Pc(8) int local8 = super.aClass15_Sub2_18.method5413();
		@Pc(13) Class255_Sub3 local13 = super.aClass15_Sub2_18.method5428();
		local13.method8028(0.0F, (float) local8, this.aFloatArray64, 0.0F, -1.0F);
		if (this.aBoolean629) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass226_5.anInt6994 : this.aClass226_4.anInt6994);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass226_3.anInt6994 : this.aClass226_2.anInt6994);
		}
		OpenGL.glEnable(34336);
		this.aBoolean628 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray64[0], this.aFloatArray64[1], this.aFloatArray64[2], this.aFloatArray64[3]);
		this.method7887();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		super.aClass15_Sub2_18.method5414(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return this.aBoolean627;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		if (this.aBoolean628) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean628 = false;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(B)V")
	@Override
	public void method7887() {
		if (this.aBoolean628) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass15_Sub2_18.IA() - 1280), (float) (super.aClass15_Sub2_18.IA() - 768), 1.0F / (float) super.aClass15_Sub2_18.method5478(), (float) super.aClass15_Sub2_18.method5480() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		this.aBoolean629 = arg0;
	}
}
