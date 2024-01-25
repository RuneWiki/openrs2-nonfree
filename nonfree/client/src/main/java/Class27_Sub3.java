import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class27_Sub3 extends Class27 {

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!hu;)V")
	public Class27_Sub3(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class63_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static546.aClass132_13.method7481(arg0 - 2, arg1, super.aClass63_5.anInt8537 + 4, super.aClass63_5.anInt8536 + 2, ((Class63_Sub2) super.aClass63_5).anInt3896, 0);
		Static546.aClass132_13.method7481(arg0 - 1, arg1 - -1, super.aClass63_5.anInt8537 + 2, super.aClass63_5.anInt8536, 0, 0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.method6631() * super.aClass63_5.anInt8537 / 10000;
		Static546.aClass132_13.aa(arg0, arg1 + 2, local21, super.aClass63_5.anInt8536 - 2, ((Class63_Sub2) super.aClass63_5).anInt3898, 0);
		Static546.aClass132_13.aa(arg0 + local21, arg1 + 2, super.aClass63_5.anInt8537 - local21, super.aClass63_5.anInt8536 + -2, 0, 0);
	}
}
