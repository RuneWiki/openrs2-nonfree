import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class27_Sub5 extends Class27 {

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!om;")
	private final Class133_Sub1_Sub2 aClass133_Sub1_Sub2_10;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "Lclient!no;")
	private final Class250 aClass250_4;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Lclient!he;")
	private final Class137 aClass137_5;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!om;Lclient!la;Lclient!no;)V")
	public Class27_Sub5(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class250 arg2) {
		super(arg0);
		this.aClass133_Sub1_Sub2_10 = arg0;
		this.aClass250_4 = arg2;
		if (arg1 != null && this.aClass250_4.method5558() && this.aClass133_Sub1_Sub2_10.aBoolean508) {
			this.aClass137_5 = Static353.method5267(this.aClass133_Sub1_Sub2_10, arg1.method4695("transparent_water", "gl"));
		} else {
			this.aClass137_5 = null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub1_23.method6239(Static481.aClass151_8, Static81.aClass151_2);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass250_4.aBoolean449) {
			@Pc(50) float local50 = (float) (super.aClass133_Sub1_23.anInt7009 % 4000) / 4000.0F;
			super.aClass133_Sub1_23.method6153(this.aClass250_4.anInterface23_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local50, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(22) int local22 = super.aClass133_Sub1_23.anInt7009 % 4000 * 16 / 4000;
			super.aClass133_Sub1_23.method6153(this.aClass250_4.anInterface20Array1[local22]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass137_5.anInt3942);
		OpenGL.glEnable(34336);
		super.aClass133_Sub1_23.method6211(Static229.aClass236_2, 0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.aClass137_5 != null;
	}
}
