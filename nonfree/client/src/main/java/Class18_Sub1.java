import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!aka", name = "v", descriptor = "Lclient!jga;")
	private final Class179 aClass179_1;

	@OriginalMember(owner = "client!aka", name = "s", descriptor = "Lclient!jc;")
	private final Class65_Sub2_Sub2 aClass65_Sub2_Sub2_1;

	@OriginalMember(owner = "client!aka", name = "x", descriptor = "Lclient!via;")
	private final Class370 aClass370_1;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Lclient!jc;Lclient!wm;Lclient!jga;)V")
	public Class18_Sub1(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class179 arg2) {
		super(arg0);
		this.aClass179_1 = arg2;
		this.aClass65_Sub2_Sub2_1 = arg0;
		if (arg1 != null && this.aClass179_1.method4541() && this.aClass65_Sub2_Sub2_1.aBoolean459) {
			this.aClass370_1 = Static657.method8803(arg1.method8917("gl", "transparent_water"), this.aClass65_Sub2_Sub2_1);
		} else {
			this.aClass370_1 = null;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.aClass370_1 != null;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
		super.aClass65_Sub2_23.method4432(Static138.aClass178_2, Static654.aClass178_5);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass370_1.anInt10313);
		OpenGL.glEnable(34336);
		super.aClass65_Sub2_23.method4400(Static169.aClass64_1, 0);
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass179_1.aBoolean463) {
			@Pc(44) float local44 = (float) (super.aClass65_Sub2_23.anInt5266 % 4000) / 4000.0F;
			super.aClass65_Sub2_23.method4426(this.aClass179_1.anInterface10_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass65_Sub2_23.anInt5266 % 4000 * 16 / 4000;
			super.aClass65_Sub2_23.method4426(this.aClass179_1.anInterface27Array1[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
