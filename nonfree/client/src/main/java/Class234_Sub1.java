import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class234_Sub1 extends Class234 {

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
	private int anInt8902 = 0;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!rg;Lclient!lr;)V")
	public Class234_Sub1(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class225_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8819() {
		@Pc(25) int local25 = super.aClass225_2.aClass258_7.method6293(Static380.anInt6690, super.aClass45_21.method7508()) + super.aClass225_2.anInt6158;
		@Pc(40) int local40 = super.aClass225_2.aClass205_11.method5049(Static380.anInt6697, super.aClass45_21.method7504()) + super.aClass225_2.anInt6156;
		super.aClass45_21.method7494((float) (local25 + super.aClass45_21.method7508() / 2), (float) (local40 + super.aClass45_21.method7504() / 2), 4096, this.anInt8902);
		this.anInt8902 += ((Class225_Sub1) super.aClass225_2).anInt6163;
	}
}
