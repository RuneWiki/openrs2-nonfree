import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "Lclient!rfa;")
	private final Class312 aClass312_1;

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "Lclient!nv;")
	private final Class33_Sub2_Sub1 aClass33_Sub2_Sub1_7;

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "Lclient!aja;")
	private final Class15 aClass15_1;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!nv;Lclient!bt;Lclient!rfa;)V")
	public Class20_Sub2(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class312 arg2) {
		super(arg0);
		this.aClass312_1 = arg2;
		this.aClass33_Sub2_Sub1_7 = arg0;
		if (arg1 != null && this.aClass312_1.method6974() && this.aClass33_Sub2_Sub1_7.aBoolean505) {
			this.aClass15_1 = Static47.method831(arg1.method1238("gl", "transparent_water"), this.aClass33_Sub2_Sub1_7);
		} else {
			this.aClass15_1 = null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass15_1.anInt207);
		OpenGL.glEnable(34336);
		super.aClass33_Sub2_21.method8239(0, Static238.aClass230_3);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.aClass15_1 != null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub2_21.method8280(Static228.aClass91_2, Static489.aClass91_4);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass312_1.aBoolean629) {
			@Pc(20) float local20 = (float) (super.aClass33_Sub2_21.anInt9643 % 4000) / 4000.0F;
			super.aClass33_Sub2_21.method8159(this.aClass312_1.anInterface7_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local20, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(45) int local45 = super.aClass33_Sub2_21.anInt9643 % 4000 * 16 / 4000;
			super.aClass33_Sub2_21.method8159(this.aClass312_1.anInterface1Array2[local45]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
