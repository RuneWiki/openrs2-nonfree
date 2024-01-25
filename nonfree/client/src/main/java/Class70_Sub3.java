import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class70_Sub3 extends Class70 {

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "Lclient!lh;")
	private final Class62_Sub1_Sub2 aClass62_Sub1_Sub2_1;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "Lclient!om;")
	private final Class222 aClass222_4;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Lclient!qg;")
	private final Class244 aClass244_5;

	static {
		new Class40("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!lh;Lclient!gp;Lclient!om;)V")
	public Class70_Sub3(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class222 arg2) {
		super(arg0);
		this.aClass62_Sub1_Sub2_1 = arg0;
		this.aClass222_4 = arg2;
		if (this.aClass222_4.method5524() && this.aClass62_Sub1_Sub2_1.aBoolean398) {
			this.aClass244_5 = Static526.method7193(this.aClass62_Sub1_Sub2_1, arg1.method2980("gl", "transparent_water"));
		} else {
			this.aClass244_5 = null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass222_4.aBoolean476) {
			@Pc(20) float local20 = (float) (super.aClass62_Sub1_20.anInt5698 % 4000) / 4000.0F;
			super.aClass62_Sub1_20.method4676(this.aClass222_4.anInterface17_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local20, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(46) int local46 = super.aClass62_Sub1_20.anInt5698 % 4000 * 16 / 4000;
			super.aClass62_Sub1_20.method4676(this.aClass222_4.anInterface3Array2[local46]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		super.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass244_5.anInt7151);
		OpenGL.glEnable(34336);
		super.aClass62_Sub1_20.method4715(Static233.aClass63_5, 0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return this.aClass244_5 != null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub1_20.method4685(Static148.aClass98_1, Static344.aClass98_4);
	}
}
