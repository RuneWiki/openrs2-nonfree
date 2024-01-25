import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class81_Sub3 extends Class81 {

	@OriginalMember(owner = "client!tba", name = "v", descriptor = "Lclient!bka;")
	private Class9 aClass9_31;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!bca;)V")
	public Class81_Sub3(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class21_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	@Override
	public void method8745() {
		super.method8745();
		this.aClass9_31 = Static307.method4661(super.aClass221_148, ((Class21_Sub2) super.aClass21_5).anInt715);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.method8296() * super.aClass21_5.anInt3462 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static488.aClass67_12.K(local16);
		Static488.aClass67_12.KA(arg0, arg1 + 2, arg0 + local13, super.aClass21_5.anInt3460 + arg1);
		this.aClass9_31.method8614(arg0, arg1 + 2, super.aClass21_5.anInt3462, super.aClass21_5.anInt3460);
		Static488.aClass67_12.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8744() {
		return super.method8744() ? super.aClass221_148.method5068(((Class21_Sub2) super.aClass21_5).anInt715) : false;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method8297(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static488.aClass67_12.method7700(arg1 - 2, arg0, super.aClass21_5.anInt3462 + 4, super.aClass21_5.anInt3460 + 2, ((Class21_Sub2) super.aClass21_5).anInt717, 0);
		Static488.aClass67_12.method7700(arg1 - 1, arg0 + 1, super.aClass21_5.anInt3462 + 2, super.aClass21_5.anInt3460, 0, 0);
	}
}
