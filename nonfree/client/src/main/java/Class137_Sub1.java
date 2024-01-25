import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	private int anInt6515 = 0;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!sea;Lclient!ob;)V")
	public Class137_Sub1(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class132_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7887() {
		@Pc(18) int local18 = super.aClass132_2.aClass259_9.method5515(super.aClass5_23.A(), Static318.anInt5819) + super.aClass132_2.anInt6604;
		@Pc(32) int local32 = super.aClass132_2.aClass216_10.method4653(super.aClass5_23.ca(), Static192.anInt3766) + super.aClass132_2.anInt6610;
		super.aClass5_23.method7797((float) (local18 + super.aClass5_23.A() / 2), (float) (local32 + super.aClass5_23.ca() / 2), 4096, this.anInt6515);
		this.anInt6515 += ((Class132_Sub1) super.aClass132_2).anInt6615;
	}
}
