import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
	private int anInt3882 = 0;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!wu;Lclient!gga;)V")
	public Class99_Sub1(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class129_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8775() {
		@Pc(17) int local17 = super.aClass129_2.aClass204_6.method4964(super.aClass44_16.method5313(), Static519.anInt7022) + super.aClass129_2.anInt3269;
		@Pc(35) int local35 = super.aClass129_2.aClass288_7.method6878(Static363.anInt6413, super.aClass44_16.method5325()) + super.aClass129_2.anInt3271;
		super.aClass44_16.method5306((float) (super.aClass44_16.method5313() / 2 + local17), (float) (super.aClass44_16.method5325() / 2 + local35), 4096, this.anInt3882);
		this.anInt3882 += ((Class129_Sub1) super.aClass129_2).anInt3277;
	}
}
