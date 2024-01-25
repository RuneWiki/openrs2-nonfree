import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class10_Sub8 extends Class10 {

	@OriginalMember(owner = "client!us", name = "q", descriptor = "Lclient!ic;")
	private final Class172 aClass172_6;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Lclient!vaa;")
	private final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_12;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "Lclient!bea;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!vaa;Lclient!ik;Lclient!ic;)V")
	public Class10_Sub8(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class172 arg2) {
		super(arg0);
		this.aClass172_6 = arg2;
		this.aClass22_Sub2_Sub2_12 = arg0;
		if (arg1 != null && this.aClass172_6.method3804() && this.aClass22_Sub2_Sub2_12.aBoolean715) {
			this.aClass32_1 = Static344.method4898(this.aClass22_Sub2_Sub2_12, arg1.method3958("transparent_water", "gl"));
		} else {
			this.aClass32_1 = null;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub2_23.method8914(Static666.aClass372_7, Static468.aClass372_3);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.aClass32_1 != null;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass32_1.anInt1221);
		OpenGL.glEnable(34336);
		super.aClass22_Sub2_23.method8962(Static671.aClass392_4, 0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass172_6.aBoolean278) {
			@Pc(44) float local44 = (float) (super.aClass22_Sub2_23.anInt10466 % 4000) / 4000.0F;
			super.aClass22_Sub2_23.method8976(this.aClass172_6.anInterface19_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass22_Sub2_23.anInt10466 % 4000 * 16 / 4000;
			super.aClass22_Sub2_23.method8976(this.aClass172_6.anInterface16Array2[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
