import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class120_Sub8 extends Class120 {

	@OriginalMember(owner = "client!taa", name = "s", descriptor = "Lclient!ki;")
	private final Class164 aClass164_6;

	@OriginalMember(owner = "client!taa", name = "x", descriptor = "Lclient!gf;")
	private final Class5_Sub3_Sub1 aClass5_Sub3_Sub1_10;

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "Lclient!le;")
	private final Class175 aClass175_5;

	static {
		new Class67("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!gf;Lclient!kea;Lclient!ki;)V")
	public Class120_Sub8(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class164 arg2) {
		super(arg0);
		this.aClass164_6 = arg2;
		this.aClass5_Sub3_Sub1_10 = arg0;
		if (this.aClass164_6.method4287() && this.aClass5_Sub3_Sub1_10.aBoolean269) {
			this.aClass175_5 = Static187.method3528(arg1.method4238("transparent_water", "gl"), this.aClass5_Sub3_Sub1_10);
		} else {
			this.aClass175_5 = null;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub3_20.method6320(Static500.aClass289_4, Static526.aClass289_5);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return this.aClass175_5 != null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass175_5.anInt5580);
		OpenGL.glEnable(34336);
		super.aClass5_Sub3_20.method6415(Static28.aClass166_1, 0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		super.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass164_6.aBoolean349) {
			@Pc(24) float local24 = (float) (super.aClass5_Sub3_20.anInt7766 % 4000) / 4000.0F;
			super.aClass5_Sub3_20.method6416(this.aClass164_6.anInterface13_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local24, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(49) int local49 = super.aClass5_Sub3_20.anInt7766 % 4000 * 16 / 4000;
			super.aClass5_Sub3_20.method6416(this.aClass164_6.anInterface9Array2[local49]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
