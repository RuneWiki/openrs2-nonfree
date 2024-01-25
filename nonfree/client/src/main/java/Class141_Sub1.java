import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "I")
	private int anInt6902 = 0;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lclient!nd;Lclient!wm;)V")
	public Class141_Sub1(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class135_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8064() {
		@Pc(18) int local18 = super.aClass135_2.aClass97_16.method2304(super.aClass31_17.method8788(), Static143.anInt2998) + super.aClass135_2.anInt10395;
		@Pc(33) int local33 = super.aClass135_2.aClass252_12.method6014(super.aClass31_17.method8807(), Static478.anInt7732) + super.aClass135_2.anInt10393;
		super.aClass31_17.method8809((float) (local18 + super.aClass31_17.method8788() / 2), (float) (super.aClass31_17.method8807() / 2 + local33), 4096, this.anInt6902);
		this.anInt6902 += ((Class135_Sub1) super.aClass135_2).anInt10396;
	}
}
