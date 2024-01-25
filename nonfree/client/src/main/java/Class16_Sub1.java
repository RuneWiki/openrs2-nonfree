import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!jea", name = "q", descriptor = "I")
	private int anInt4112 = 0;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!mv;Lclient!lo;)V")
	public Class16_Sub1(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class213_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7259() {
		@Pc(18) int local18 = super.aClass213_2.aClass322_7.method6534(Static14.anInt330, super.aClass38_18.A()) + super.aClass213_2.anInt5119;
		@Pc(32) int local32 = super.aClass213_2.aClass347_7.method7305(Static370.anInt6187, super.aClass38_18.ca()) + super.aClass213_2.anInt5118;
		super.aClass38_18.method7456((float) (super.aClass38_18.A() / 2 + local18), (float) (local32 + super.aClass38_18.ca() / 2), 4096, this.anInt4112);
		this.anInt4112 += ((Class213_Sub1) super.aClass213_2).anInt5131;
	}
}
