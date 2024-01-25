import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	private int anInt2655 = 0;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!pu;Lclient!on;)V")
	public Class28_Sub1(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class97_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4317() {
		@Pc(18) int local18 = super.aClass97_2.aClass335_13.method7396(Static573.anInt9475, super.aClass22_13.A()) + super.aClass97_2.anInt6629;
		@Pc(41) int local41 = super.aClass97_2.aClass122_12.method2394(Static103.anInt2084, super.aClass22_13.ca()) + super.aClass97_2.anInt6628;
		super.aClass22_13.method7658((float) (super.aClass22_13.A() / 2 + local18), (float) (local41 + super.aClass22_13.ca() / 2), 4096, this.anInt2655);
		this.anInt2655 += ((Class97_Sub1) super.aClass97_2).anInt6639;
	}
}
