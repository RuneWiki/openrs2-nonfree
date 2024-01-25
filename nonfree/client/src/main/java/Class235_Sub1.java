import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class235_Sub1 extends Class235 {

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private int anInt9087 = 0;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!jn;Lclient!ko;)V")
	public Class235_Sub1(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class194_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7418() {
		@Pc(22) int local22 = super.aClass194_2.aClass258_4.method6279(Static501.anInt6750, super.aClass78_32.A()) + super.aClass194_2.anInt5694;
		@Pc(39) int local39 = super.aClass194_2.aClass250_6.method6077(super.aClass78_32.ca(), Static212.anInt3952) + super.aClass194_2.anInt5698;
		super.aClass78_32.method8189((float) (super.aClass78_32.A() / 2 + local22), (float) (local39 + super.aClass78_32.ca() / 2), 4096, this.anInt9087);
		this.anInt9087 += ((Class194_Sub1) super.aClass194_2).anInt5699;
	}
}
