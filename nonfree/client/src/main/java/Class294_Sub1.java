import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class294_Sub1 extends Class294 {

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
	private int anInt10381 = 0;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!wu;Lclient!faa;)V")
	public Class294_Sub1(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class102_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8643() {
		@Pc(18) int local18 = super.aClass102_2.aClass361_5.method8101(Static66.anInt10099, super.aClass61_35.method6446()) + super.aClass102_2.anInt2636;
		@Pc(32) int local32 = super.aClass102_2.aClass306_6.method6899(super.aClass61_35.method6438(), Static364.anInt5763) + super.aClass102_2.anInt2633;
		super.aClass61_35.method6442((float) (super.aClass61_35.method6446() / 2 + local18), (float) (local32 + super.aClass61_35.method6438() / 2), 4096, this.anInt10381);
		this.anInt10381 += ((Class102_Sub1) super.aClass102_2).anInt2639;
	}
}
