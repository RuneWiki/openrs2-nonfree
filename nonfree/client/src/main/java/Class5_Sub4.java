import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient!lj;")
	private final Class223 aClass223_4;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!md;")
	private final Class144_Sub1_Sub2 aClass144_Sub1_Sub2_9;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "Lclient!un;")
	private final Class368 aClass368_1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!md;Lclient!rg;Lclient!lj;)V")
	public Class5_Sub4(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class223 arg2) {
		super(arg0);
		this.aClass223_4 = arg2;
		this.aClass144_Sub1_Sub2_9 = arg0;
		if (arg1 != null && this.aClass223_4.method5331() && this.aClass144_Sub1_Sub2_9.aBoolean470) {
			this.aClass368_1 = Static641.method8996(arg1.method7801("transparent_water", "gl"), this.aClass144_Sub1_Sub2_9);
		} else {
			this.aClass368_1 = null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
		super.aClass144_Sub1_20.method5653(Static408.aClass287_3, Static284.aClass287_1);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.aClass368_1 != null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass368_1.anInt10238);
		OpenGL.glEnable(34336);
		super.aClass144_Sub1_20.method5740(Static225.aClass138_3, 0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass223_4.aBoolean423) {
			@Pc(51) float local51 = (float) (super.aClass144_Sub1_20.anInt6502 % 4000) / 4000.0F;
			super.aClass144_Sub1_20.method5643(this.aClass223_4.anInterface18_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local51, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(25) int local25 = super.aClass144_Sub1_20.anInt6502 % 4000 * 16 / 4000;
			super.aClass144_Sub1_20.method5643(this.aClass223_4.anInterface9Array2[local25]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
	}
}
