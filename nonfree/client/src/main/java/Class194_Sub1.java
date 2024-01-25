import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class194_Sub1 extends Class194 {

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
	private int anInt5292 = 0;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!gj;Lclient!la;)V")
	public Class194_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class218_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7985() {
		@Pc(25) int local25 = super.aClass218_2.aClass92_8.method2199(Static507.anInt8484, super.aClass102_21.method6951()) + super.aClass218_2.anInt6024;
		@Pc(40) int local40 = super.aClass218_2.aClass65_12.method1786(Static581.anInt9218, super.aClass102_21.method6958()) + super.aClass218_2.anInt6023;
		super.aClass102_21.method6963((float) (super.aClass102_21.method6951() / 2 + local25), (float) (local40 + super.aClass102_21.method6958() / 2), 4096, this.anInt5292);
		this.anInt5292 += ((Class218_Sub1) super.aClass218_2).anInt6033;
	}
}
