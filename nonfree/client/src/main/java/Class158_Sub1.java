import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class158_Sub1 extends Class158 {

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	private int anInt6358 = 0;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!ri;Lclient!cb;)V")
	public Class158_Sub1(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class46_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7699() {
		@Pc(23) int local23 = super.aClass46_2.aClass154_7.method3814(super.aClass73_35.A(), Static333.anInt6024) + super.aClass46_2.anInt1459;
		@Pc(38) int local38 = super.aClass46_2.aClass201_5.method4868(super.aClass73_35.ca(), Static473.anInt8221) + super.aClass46_2.anInt1460;
		super.aClass73_35.method7960((float) (local23 + super.aClass73_35.A() / 2), (float) (local38 + super.aClass73_35.ca() / 2), 4096, this.anInt6358);
		this.anInt6358 += ((Class46_Sub1) super.aClass46_2).anInt1472;
	}
}
