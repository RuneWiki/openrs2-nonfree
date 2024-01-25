import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class108_Sub9 extends Class108 {

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Lclient!wda;")
	private final Class373 aClass373_7;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!laa;")
	private final Class126_Sub2_Sub1 aClass126_Sub2_Sub1_11;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Lclient!ow;")
	private final Class266 aClass266_5;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!laa;Lclient!wu;Lclient!wda;)V")
	public Class108_Sub9(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class373 arg2) {
		super(arg0);
		this.aClass373_7 = arg2;
		this.aClass126_Sub2_Sub1_11 = arg0;
		if (arg1 != null && this.aClass373_7.method8675() && this.aClass126_Sub2_Sub1_11.aBoolean460) {
			this.aClass266_5 = Static152.method2212(arg1.method8871("transparent_water", "gl"), this.aClass126_Sub2_Sub1_11);
		} else {
			this.aClass266_5 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.aClass266_5 != null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
		super.aClass126_Sub2_23.method5475(Static140.aClass10_3, Static247.aClass10_4);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass266_5.anInt7168);
		OpenGL.glEnable(34336);
		super.aClass126_Sub2_23.method5466(0, Static131.aClass294_2);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass373_7.aBoolean823) {
			@Pc(47) float local47 = (float) (super.aClass126_Sub2_23.anInt6264 % 4000) / 4000.0F;
			super.aClass126_Sub2_23.method5449(this.aClass373_7.anInterface19_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local47, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(21) int local21 = super.aClass126_Sub2_23.anInt6264 % 4000 * 16 / 4000;
			super.aClass126_Sub2_23.method5449(this.aClass373_7.anInterface25Array1[local21]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
