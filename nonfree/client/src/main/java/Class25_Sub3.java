import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "Lclient!fs;")
	private Class134 aClass134_34;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!sr;)V")
	public Class25_Sub3(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class31_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method7937(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static457.aClass57_11.method7681(arg0 - 2, arg1, super.aClass31_5.anInt9301 + 4, super.aClass31_5.anInt9302 + 2, ((Class31_Sub3) super.aClass31_5).anInt9309, 0);
		Static457.aClass57_11.method7681(arg0 - 1, arg1 + 1, super.aClass31_5.anInt9301 + 2, super.aClass31_5.anInt9302, 0, 0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	@Override
	public void method8948() {
		super.method8948();
		this.aClass134_34 = Static332.method5056(super.aClass208_121, ((Class31_Sub3) super.aClass31_5).anInt9310);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8947() {
		return super.method8947() ? super.aClass208_121.method4977(((Class31_Sub3) super.aClass31_5).anInt9310) : false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected void method7938(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7936() * super.aClass31_5.anInt9301 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static457.aClass57_11.K(local16);
		Static457.aClass57_11.KA(arg0, arg1 + 2, local13 + arg0, super.aClass31_5.anInt9302 + arg1);
		this.aClass134_34.method9240(arg0, arg1 + 2, super.aClass31_5.anInt9301, super.aClass31_5.anInt9302);
		Static457.aClass57_11.KA(local16[0], local16[1], local16[2], local16[3]);
	}
}
