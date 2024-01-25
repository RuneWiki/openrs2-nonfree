import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "Z")
	private boolean aBoolean144;

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "Z")
	private boolean aBoolean146;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "[F")
	private final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "Lclient!qg;")
	private Class244 aClass244_4;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "Lclient!qg;")
	private Class244 aClass244_2;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "Lclient!qg;")
	private Class244 aClass244_3;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "Lclient!qg;")
	private Class244 aClass244_1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!lh;Lclient!gp;)V")
	public Class70_Sub1(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class117 arg1) {
		super(arg0);
		if (arg0.aBoolean398) {
			this.aClass244_4 = Static526.method7193(arg0, arg1.method2980("gl", "uw_ground_unlit"));
			this.aClass244_2 = Static526.method7193(arg0, arg1.method2980("gl", "uw_ground_lit"));
			this.aClass244_3 = Static526.method7193(arg0, arg1.method2980("gl", "uw_model_unlit"));
			this.aClass244_1 = Static526.method7193(arg0, arg1.method2980("gl", "uw_model_lit"));
			this.aBoolean145 = this.aClass244_4 != null & this.aClass244_2 != null & this.aClass244_3 != null & this.aClass244_1 != null;
		} else {
			this.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		if (this.aBoolean144) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean144 = false;
		}
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V")
	@Override
	public void method7314() {
		@Pc(8) int local8 = super.aClass62_Sub1_20.method4711();
		@Pc(15) Class78_Sub1 local15 = super.aClass62_Sub1_20.method4730();
		local15.method2199((float) local8, -1.0F, 0.0F, this.aFloatArray24, 0.0F);
		if (this.aBoolean146) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass244_2.anInt7151 : this.aClass244_1.anInt7151);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass244_4.anInt7151 : this.aClass244_3.anInt7151);
		}
		OpenGL.glEnable(34336);
		this.aBoolean144 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray24[0], this.aFloatArray24[1], this.aFloatArray24[2], this.aFloatArray24[3]);
		this.method7299();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	@Override
	public void method7299() {
		if (this.aBoolean144) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass62_Sub1_20.CA() - 1280), (float) (super.aClass62_Sub1_20.CA() - 768), 1.0F / (float) super.aClass62_Sub1_20.method4733(), (float) super.aClass62_Sub1_20.method4731() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		this.aBoolean146 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return this.aBoolean145;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass62_Sub1_20.method4676(arg1);
	}
}
