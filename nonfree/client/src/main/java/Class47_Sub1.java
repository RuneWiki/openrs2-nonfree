import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
	private int anInt1470 = 0;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!jo;Lclient!wo;)V")
	public Class47_Sub1(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class177_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8047() {
		@Pc(17) int local17 = super.aClass177_2.aClass148_11.method3982(Static419.anInt7811, super.aClass66_15.AA()) + super.aClass177_2.anInt9733;
		@Pc(35) int local35 = super.aClass177_2.aClass49_14.method1326(Static79.anInt9888, super.aClass66_15.a()) + super.aClass177_2.anInt9729;
		super.aClass66_15.method8061((float) (local17 + super.aClass66_15.AA() / 2), (float) (local35 + super.aClass66_15.a() / 2), 4096, this.anInt1470);
		this.anInt1470 += ((Class177_Sub1) super.aClass177_2).anInt9735;
	}
}
