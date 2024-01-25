import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class188_Sub3 extends Class188 {

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!iea;")
	private Class31 aClass31_36;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!fga;)V")
	public Class188_Sub3(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class56_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8063() {
		return super.method8063() ? super.aClass238_249.method5568(((Class56_Sub2) super.aClass56_5).anInt3252) : false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBII)V")
	@Override
	protected void method7581(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7583() * super.aClass56_5.anInt9422 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static141.aClass13_27.K(local16);
		Static141.aClass13_27.KA(arg1, arg0 + 2, local13 + arg1, super.aClass56_5.anInt9414 + arg0);
		this.aClass31_36.method8810(arg1, arg0 + 2, super.aClass56_5.anInt9422, super.aClass56_5.anInt9414);
		Static141.aClass13_27.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	@Override
	public void method8062() {
		super.method8062();
		this.aClass31_36 = Static449.method6408(((Class56_Sub2) super.aClass56_5).anInt3252, super.aClass238_249);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected void method7582(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static141.aClass13_27.method8104(arg1 - 2, arg0, super.aClass56_5.anInt9422 + 4, super.aClass56_5.anInt9414 - -2, ((Class56_Sub2) super.aClass56_5).anInt3255, 0);
		Static141.aClass13_27.method8104(arg1 - 1, arg0 + 1, super.aClass56_5.anInt9422 + 2, super.aClass56_5.anInt9414, 0, 0);
	}
}
