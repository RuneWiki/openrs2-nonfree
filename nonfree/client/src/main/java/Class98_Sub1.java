import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
	private int anInt3321 = 0;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!in;Lclient!wg;)V")
	public Class98_Sub1(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class362_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BZ)V")
	@Override
	public void method9233() {
		@Pc(18) int local18 = super.aClass362_2.aClass309_13.method7817(Static326.anInt6591, super.aClass46_12.method6205()) + super.aClass362_2.anInt10880;
		@Pc(32) int local32 = super.aClass362_2.aClass86_13.method2903(Static467.anInt8715, super.aClass46_12.method6219()) + super.aClass362_2.anInt10881;
		super.aClass46_12.method6220((float) (super.aClass46_12.method6205() / 2 + local18), (float) (super.aClass46_12.method6219() / 2 + local32), 4096, this.anInt3321);
		this.anInt3321 += ((Class362_Sub1) super.aClass362_2).anInt10888;
	}
}
