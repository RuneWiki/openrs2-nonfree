import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class32_Sub8 extends Class32 {

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!bea;")
	private final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_10;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!tj;")
	private final Class318 aClass318_7;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!sm;")
	private final Class305 aClass305_5;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bea;Lclient!ri;Lclient!tj;)V")
	public Class32_Sub8(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class318 arg2) {
		super(arg0);
		this.aClass31_Sub1_Sub1_10 = arg0;
		this.aClass318_7 = arg2;
		if (arg1 != null && this.aClass318_7.method6940() && this.aClass31_Sub1_Sub1_10.aBoolean91) {
			this.aClass305_5 = Static270.method4103(this.aClass31_Sub1_Sub1_10, arg1.method6328("gl", "transparent_water"));
		} else {
			this.aClass305_5 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.aClass305_5 != null;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		super.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass318_7.aBoolean589) {
			@Pc(18) float local18 = (float) (super.aClass31_Sub1_22.anInt9105 % 4000) / 4000.0F;
			super.aClass31_Sub1_22.method7129(this.aClass318_7.anInterface19_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local18, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(44) int local44 = super.aClass31_Sub1_22.anInt9105 % 4000 * 16 / 4000;
			super.aClass31_Sub1_22.method7129(this.aClass318_7.anInterface12Array2[local44]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
		super.aClass31_Sub1_22.method7136(Static438.aClass266_2, Static514.aClass266_6);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass305_5.anInt8443);
		OpenGL.glEnable(34336);
		super.aClass31_Sub1_22.method7155(0, Static415.aClass179_24);
	}
}
