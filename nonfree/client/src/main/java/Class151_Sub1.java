import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class151_Sub1 extends Class151 {

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	private int anInt6997 = 0;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ni;Lclient!dv;)V")
	public Class151_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class72_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7994() {
		@Pc(17) int local17 = super.aClass72_2.aClass79_6.method2610(Static182.anInt4018, super.aClass4_18.method7700()) + super.aClass72_2.anInt2968;
		@Pc(31) int local31 = super.aClass72_2.aClass127_7.method3682(super.aClass4_18.method7712(), Static52.anInt1780) + super.aClass72_2.anInt2969;
		super.aClass4_18.method7693((float) (local17 + super.aClass4_18.method7700() / 2), (float) (super.aClass4_18.method7712() / 2 + local31), 4096, this.anInt6997);
		this.anInt6997 += ((Class72_Sub1) super.aClass72_2).anInt2974;
	}
}
