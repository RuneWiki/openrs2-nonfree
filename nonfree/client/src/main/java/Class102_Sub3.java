import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class102_Sub3 extends Class102 {

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "Lclient!f;")
	private Class88 aClass88_38;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!fga;)V")
	public Class102_Sub3(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class50_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8149() {
		return super.method8149() ? super.aClass348_134.method7960(((Class50_Sub2) super.aClass50_5).anInt3084) : false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	@Override
	public void method8148() {
		super.method8148();
		this.aClass88_38 = Static402.method6120(((Class50_Sub2) super.aClass50_5).anInt3084, super.aClass348_134);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.method8156() * super.aClass50_5.anInt7637 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static39.aClass7_2.oa(local16);
		Static39.aClass7_2.da(arg0, arg1 + 2, local13 + arg0, super.aClass50_5.anInt7630 + arg1);
		this.aClass88_38.method8043(arg0, arg1 + 2, super.aClass50_5.anInt7637, super.aClass50_5.anInt7630);
		Static39.aClass7_2.da(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method8154(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static39.aClass7_2.method7824(arg1 - 2, arg0, super.aClass50_5.anInt7637 + 4, super.aClass50_5.anInt7630 + 2, ((Class50_Sub2) super.aClass50_5).anInt3085, 0);
		Static39.aClass7_2.method7824(arg1 - 1, arg0 + 1, super.aClass50_5.anInt7637 + 2, super.aClass50_5.anInt7630, 0, 0);
	}
}
