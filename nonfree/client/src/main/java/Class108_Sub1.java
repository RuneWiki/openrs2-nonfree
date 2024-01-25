import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
	private int anInt2729 = 0;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!bt;Lclient!ns;)V")
	public Class108_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class256_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8637() {
		@Pc(26) int local26 = super.aClass256_2.aClass291_8.method6524(Static606.anInt9314, super.aClass17_20.method5256()) + super.aClass256_2.anInt5986;
		@Pc(40) int local40 = super.aClass256_2.aClass125_12.method2842(super.aClass17_20.method5251(), Static353.anInt5368) + super.aClass256_2.anInt5985;
		super.aClass17_20.method5252((float) (local26 + super.aClass17_20.method5256() / 2), (float) (super.aClass17_20.method5251() / 2 + local40), 4096, this.anInt2729);
		this.anInt2729 += ((Class256_Sub1) super.aClass256_2).anInt5988;
	}
}
