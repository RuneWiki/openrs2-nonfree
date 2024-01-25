import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class32_Sub9 extends Class32 {

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!oaa;")
	private final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_8;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "Lclient!oca;")
	private final Class247 aClass247_5;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "Lclient!eca;")
	private final Class78 aClass78_5;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!oaa;Lclient!ae;Lclient!oca;)V")
	public Class32_Sub9(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class247 arg2) {
		super(arg0);
		this.aClass132_Sub1_Sub1_8 = arg0;
		this.aClass247_5 = arg2;
		if (arg1 != null && this.aClass247_5.method6208() && this.aClass132_Sub1_Sub1_8.aBoolean476) {
			this.aClass78_5 = Static224.method3272(this.aClass132_Sub1_Sub1_8, arg1.method274("gl", "transparent_water"));
		} else {
			this.aClass78_5 = null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.aClass78_5 != null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass78_5.anInt2150);
		OpenGL.glEnable(34336);
		super.aClass132_Sub1_21.method7552(Static648.aClass378_4, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub1_21.method7637(Static320.aClass322_5, Static116.aClass322_2);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass247_5.aBoolean481) {
			@Pc(51) float local51 = (float) (super.aClass132_Sub1_21.anInt9000 % 4000) / 4000.0F;
			super.aClass132_Sub1_21.method7635(this.aClass247_5.anInterface1_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local51, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(25) int local25 = super.aClass132_Sub1_21.anInt9000 % 4000 * 16 / 4000;
			super.aClass132_Sub1_21.method7635(this.aClass247_5.anInterface2Array1[local25]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
