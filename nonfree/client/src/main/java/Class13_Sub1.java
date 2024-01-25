import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	private int anInt5895 = 0;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!vd;Lclient!mm;)V")
	public Class13_Sub1(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class167_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7903() {
		@Pc(18) int local18 = super.aClass167_2.aClass238_11.method6456(Static507.anInt8741, super.aClass32_14.method5080()) + super.aClass167_2.anInt6595;
		@Pc(37) int local37 = super.aClass167_2.aClass79_16.method2054(super.aClass32_14.method5079(), Static106.anInt2101) + super.aClass167_2.anInt6589;
		super.aClass32_14.method5087((float) (super.aClass32_14.method5080() / 2 + local18), (float) (local37 + super.aClass32_14.method5079() / 2), 4096, this.anInt5895);
		this.anInt5895 += ((Class167_Sub1) super.aClass167_2).anInt6598;
	}
}
