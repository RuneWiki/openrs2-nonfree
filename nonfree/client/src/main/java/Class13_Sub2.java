import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Lclient!nc;")
	private final Class242 aClass242_2;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!fc;")
	private final Class101_Sub1_Sub1 aClass101_Sub1_Sub1_1;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "Lclient!oga;")
	private final Class261 aClass261_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!fc;Lclient!gga;Lclient!nc;)V")
	public Class13_Sub2(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass242_2 = arg2;
		this.aClass101_Sub1_Sub1_1 = arg0;
		if (arg1 != null && this.aClass242_2.method6564() && this.aClass101_Sub1_Sub1_1.aBoolean248) {
			this.aClass261_1 = Static144.method2522(arg1.method3639("transparent_water", "gl"), this.aClass101_Sub1_Sub1_1);
		} else {
			this.aClass261_1 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass261_1.anInt7847);
		OpenGL.glEnable(34336);
		super.aClass101_Sub1_22.method5954(0, Static175.aClass118_2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.aClass261_1 != null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
		super.aClass101_Sub1_22.method5891(Static512.aClass381_5, Static238.aClass381_4);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass242_2.aBoolean552) {
			@Pc(44) float local44 = (float) (super.aClass101_Sub1_22.anInt6645 % 4000) / 4000.0F;
			super.aClass101_Sub1_22.method5909(this.aClass242_2.anInterface13_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass101_Sub1_22.anInt6645 % 4000 * 16 / 4000;
			super.aClass101_Sub1_22.method5909(this.aClass242_2.anInterface10Array1[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
