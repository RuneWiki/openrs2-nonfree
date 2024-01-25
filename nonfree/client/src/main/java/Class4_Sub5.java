import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Lclient!pa;")
	private final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_4;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "Lclient!lja;")
	private final Class202 aClass202_3;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "Lclient!ru;")
	private final Class310 aClass310_1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!pa;Lclient!aj;Lclient!lja;)V")
	public Class4_Sub5(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class202 arg2) {
		super(arg0);
		this.aClass13_Sub1_Sub1_4 = arg0;
		this.aClass202_3 = arg2;
		if (arg1 != null && this.aClass202_3.method5174() && this.aClass13_Sub1_Sub1_4.aBoolean546) {
			this.aClass310_1 = Static499.method7145(arg1.method533("gl", "transparent_water"), this.aClass13_Sub1_Sub1_4);
		} else {
			this.aClass310_1 = null;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.aClass310_1 != null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass310_1.anInt8815);
		OpenGL.glEnable(34336);
		super.aClass13_Sub1_23.method7522(Static348.aClass326_4, 0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass202_3.aBoolean412) {
			@Pc(46) float local46 = (float) (super.aClass13_Sub1_23.anInt8613 % 4000) / 4000.0F;
			super.aClass13_Sub1_23.method7530(this.aClass202_3.anInterface21_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local46, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(19) int local19 = super.aClass13_Sub1_23.anInt8613 % 4000 * 16 / 4000;
			super.aClass13_Sub1_23.method7530(this.aClass202_3.anInterface7Array2[local19]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub1_23.method7521(Static191.aClass203_2, Static265.aClass203_3);
	}
}
