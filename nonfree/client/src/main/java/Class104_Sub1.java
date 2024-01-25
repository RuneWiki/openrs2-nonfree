import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	private int anInt3287 = 0;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!tf;Lclient!ji;)V")
	public Class104_Sub1(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class9_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6873() {
		@Pc(22) int local22 = super.aClass9_2.aClass63_12.method1678(Static245.anInt4333, super.aClass14_11.A()) + super.aClass9_2.anInt4468;
		@Pc(37) int local37 = super.aClass9_2.aClass249_11.method5777(super.aClass14_11.ca(), Static66.anInt1531) + super.aClass9_2.anInt4463;
		super.aClass14_11.method7678((float) (super.aClass14_11.A() / 2 + local22), (float) (super.aClass14_11.ca() / 2 + local37), 4096, this.anInt3287);
		this.anInt3287 += ((Class9_Sub1) super.aClass9_2).anInt4469;
	}
}
