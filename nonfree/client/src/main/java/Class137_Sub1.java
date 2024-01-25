import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "Lclient!f;")
	private Class38 aClass38_15;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!sv;)V")
	public Class137_Sub1(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class153_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method7223(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(15) int local15 = this.method7224() * super.aClass153_5.anInt9316 / 10000;
		@Pc(22) int[] local22 = new int[4];
		Static417.aClass162_17.oa(local22);
		Static417.aClass162_17.da(arg1, arg0 + 2, local15 + arg1, super.aClass153_5.anInt9312 + arg0);
		this.aClass38_15.method7457(arg1, arg0 + 2, super.aClass153_5.anInt9316, super.aClass153_5.anInt9312);
		Static417.aClass162_17.da(local22[0], local22[1], local22[2], local22[3]);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7226(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static417.aClass162_17.method6827(arg0 - 2, arg1, super.aClass153_5.anInt9316 + 4, super.aClass153_5.anInt9312 + 2, ((Class153_Sub3) super.aClass153_5).anInt7932, 0);
		Static417.aClass162_17.method6827(arg0 - 1, arg1 + 1, super.aClass153_5.anInt9316 + 2, super.aClass153_5.anInt9312, 0, 0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7257() {
		return super.method7257() ? super.aClass229_123.method4954(((Class153_Sub3) super.aClass153_5).anInt7929) : false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
		super.method7258();
		this.aClass38_15 = Static214.method2618(super.aClass229_123, ((Class153_Sub3) super.aClass153_5).anInt7929);
	}
}
