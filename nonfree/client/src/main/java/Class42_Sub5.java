import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class42_Sub5 extends Class42 {

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "Lclient!ph;")
	private final Class122_Sub2_Sub2 aClass122_Sub2_Sub2_6;

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "Lclient!pv;")
	private final Class241 aClass241_5;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Lclient!ob;")
	private final Class213 aClass213_5;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ph;Lclient!kr;Lclient!pv;)V")
	public Class42_Sub5(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class241 arg2) {
		super(arg0);
		this.aClass122_Sub2_Sub2_6 = arg0;
		this.aClass241_5 = arg2;
		if (this.aClass241_5.method5765() && this.aClass122_Sub2_Sub2_6.aBoolean494) {
			this.aClass213_5 = Static90.method1569(this.aClass122_Sub2_Sub2_6, arg1.method4330("transparent_water", "gl"));
		} else {
			this.aClass213_5 = null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass213_5.anInt6028);
		OpenGL.glEnable(34336);
		super.aClass122_Sub2_16.method5575(0, Static295.aClass181_3);
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return this.aClass213_5 != null;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		super.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub2_16.method5605(Static486.aClass271_5, Static39.aClass271_1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass241_5.aBoolean500) {
			@Pc(22) float local22 = (float) (super.aClass122_Sub2_16.anInt6721 % 4000) / 4000.0F;
			super.aClass122_Sub2_16.method5651(this.aClass241_5.anInterface9_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local22, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(47) int local47 = super.aClass122_Sub2_16.anInt6721 % 4000 * 16 / 4000;
			super.aClass122_Sub2_16.method5651(this.aClass241_5.anInterface3Array2[local47]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
