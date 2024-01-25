import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!fga", name = "w", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "[F")
	private final float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!fga", name = "A", descriptor = "Lclient!sm;")
	private Class305 aClass305_2;

	@OriginalMember(owner = "client!fga", name = "H", descriptor = "Lclient!sm;")
	private Class305 aClass305_4;

	@OriginalMember(owner = "client!fga", name = "z", descriptor = "Lclient!sm;")
	private Class305 aClass305_1;

	@OriginalMember(owner = "client!fga", name = "D", descriptor = "Lclient!sm;")
	private Class305 aClass305_3;

	@OriginalMember(owner = "client!fga", name = "I", descriptor = "Lclient!mca;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!fga", name = "F", descriptor = "Z")
	private final boolean aBoolean245;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!bea;Lclient!ri;)V")
	public Class32_Sub2(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class284 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean91) {
			this.aClass305_2 = Static270.method4103(arg0, arg1.method6328("gl", "uw_ground_unlit"));
			this.aClass305_4 = Static270.method4103(arg0, arg1.method6328("gl", "uw_ground_lit"));
			this.aClass305_1 = Static270.method4103(arg0, arg1.method6328("gl", "uw_model_unlit"));
			this.aClass305_3 = Static270.method4103(arg0, arg1.method6328("gl", "uw_model_lit"));
			if (this.aClass305_2 != null & this.aClass305_4 != null & this.aClass305_1 != null & this.aClass305_3 != null) {
				this.anInterface12_1 = super.aClass31_Sub1_22.method7089(new int[] { 0, -1 }, 2, false, 1);
				this.anInterface12_1.method2990(false, false);
				this.aBoolean245 = true;
			} else {
				this.aBoolean245 = false;
			}
		} else {
			this.aBoolean245 = false;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		super.aClass31_Sub1_22.method7129(arg1);
		super.aClass31_Sub1_22.method7141(arg0);
	}

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7129(null);
		super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
		super.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		super.aClass31_Sub1_22.method7155(2, Static438.aClass179_14);
		super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
		super.aClass31_Sub1_22.method7092(0);
		if (this.aBoolean243) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean243 = false;
		}
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
	@Override
	public void method7452() {
		@Pc(10) int local10 = super.aClass31_Sub1_22.method7130();
		@Pc(15) Class42_Sub3 local15 = super.aClass31_Sub1_22.method7171();
		if (this.aBoolean244) {
			OpenGL.glBindProgramARB(34336, ~local10 == Integer.MIN_VALUE ? this.aClass305_4.anInt8443 : this.aClass305_3.anInt8443);
		} else {
			OpenGL.glBindProgramARB(34336, local10 == Integer.MAX_VALUE ? this.aClass305_2.anInt8443 : this.aClass305_1.anInt8443);
		}
		OpenGL.glEnable(34336);
		this.aBoolean243 = true;
		local15.method7523(0.0F, 0.0F, (float) local10, this.aFloatArray33, (float) -1);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray33[0], this.aFloatArray33[1], this.aFloatArray33[2], this.aFloatArray33[3]);
		this.method7450();
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
	@Override
	public void method7450() {
		if (!this.aBoolean243) {
			return;
		}
		@Pc(14) int local14 = super.aClass31_Sub1_22.U();
		@Pc(18) int local18 = super.aClass31_Sub1_22.BA();
		@Pc(29) float local29 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(40) float local40 = -((float) (local14 - local18) * 0.25F) + (float) local14;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, local29, 1.0F / (float) super.aClass31_Sub1_22.method7143(), (float) super.aClass31_Sub1_22.method7094() / 255.0F);
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7160(super.aClass31_Sub1_22.method7126());
		super.aClass31_Sub1_22.method7092(0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		this.aBoolean244 = arg0;
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7129(this.anInterface12_1);
		super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static336.aClass266_4);
		super.aClass31_Sub1_22.method7155(0, Static438.aClass179_14);
		super.aClass31_Sub1_22.method7083(Static402.aClass179_23, 2, false, true);
		super.aClass31_Sub1_22.method7185(Static415.aClass179_24, 0);
		super.aClass31_Sub1_22.method7092(0);
		this.method7452();
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
