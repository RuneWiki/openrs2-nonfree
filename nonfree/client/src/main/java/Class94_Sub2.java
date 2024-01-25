import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "Lclient!f;")
	private Class73 aClass73_13;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!rh;)V")
	public Class94_Sub2(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class38_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method4388(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method4389() * super.aClass38_5.anInt8020 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static319.aClass31_11.oa(local16);
		Static319.aClass31_11.da(arg0, arg1 + 2, local13 + arg0, super.aClass38_5.anInt8019 + arg1);
		this.aClass73_13.method7953(arg0, arg1 + 2, super.aClass38_5.anInt8020, super.aClass38_5.anInt8019);
		Static319.aClass31_11.da(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZIZ)V")
	@Override
	protected void method4391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static319.aClass31_11.method8035(arg0 - 2, arg1, super.aClass38_5.anInt8020 + 4, super.aClass38_5.anInt8019 + 2, ((Class38_Sub3) super.aClass38_5).anInt8028, 0);
		Static319.aClass31_11.method8035(arg0 - 1, arg1 + 1, super.aClass38_5.anInt8020 + 2, super.aClass38_5.anInt8019, 0, 0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7701() {
		return super.method7701() ? super.aClass284_91.method6347(((Class38_Sub3) super.aClass38_5).anInt8031) : false;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	@Override
	public void method7700() {
		super.method7700();
		this.aClass73_13 = Static581.method7907(((Class38_Sub3) super.aClass38_5).anInt8031, super.aClass284_91);
	}
}
