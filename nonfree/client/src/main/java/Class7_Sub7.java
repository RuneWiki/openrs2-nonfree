import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!po", name = "u", descriptor = "Lclient!sb;")
	private final Class95_Sub3_Sub2 aClass95_Sub3_Sub2_10;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient!jo;")
	private final Class174 aClass174_5;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Lclient!oha;")
	private final Class249 aClass249_5;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!sb;Lclient!wu;Lclient!jo;)V")
	public Class7_Sub7(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class174 arg2) {
		super(arg0);
		this.aClass95_Sub3_Sub2_10 = arg0;
		this.aClass174_5 = arg2;
		if (arg1 != null && this.aClass174_5.method3797() && this.aClass95_Sub3_Sub2_10.aBoolean643) {
			this.aClass249_5 = Static560.method7662(this.aClass95_Sub3_Sub2_10, arg1.method8628("transparent_water", "gl"));
		} else {
			this.aClass249_5 = null;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass174_5.aBoolean302) {
			@Pc(16) float local16 = (float) (super.aClass95_Sub3_23.anInt8347 % 4000) / 4000.0F;
			super.aClass95_Sub3_23.method7112(this.aClass174_5.anInterface5_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local16, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(42) int local42 = super.aClass95_Sub3_23.anInt8347 % 4000 * 16 / 4000;
			super.aClass95_Sub3_23.method7112(this.aClass174_5.anInterface19Array2[local42]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub3_23.method7023(Static248.aClass136_4, Static225.aClass136_3);
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.aClass249_5 != null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass249_5.anInt6326);
		OpenGL.glEnable(34336);
		super.aClass95_Sub3_23.method7139(0, Static10.aClass291_1);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
	}
}
