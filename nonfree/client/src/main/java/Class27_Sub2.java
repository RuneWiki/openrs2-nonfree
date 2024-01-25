import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!ho;")
	private Class9 aClass9_13;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!rl;)V")
	public Class27_Sub2(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class63_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method8705() {
		super.method8705();
		this.aClass9_13 = Static215.method3139(((Class63_Sub3) super.aClass63_5).anInt8542, super.aClass8_110);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method6631() * super.aClass63_5.anInt8537 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static546.aClass132_13.K(local16);
		Static546.aClass132_13.KA(arg0, arg1 + 2, local13 + arg0, arg1 + super.aClass63_5.anInt8536);
		this.aClass9_13.method8928(arg0, arg1 + 2, super.aClass63_5.anInt8537, super.aClass63_5.anInt8536);
		Static546.aClass132_13.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8704() {
		return super.method8704() ? super.aClass8_110.method273(((Class63_Sub3) super.aClass63_5).anInt8542) : false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static546.aClass132_13.method7481(arg0 - 2, arg1, super.aClass63_5.anInt8537 + 4, super.aClass63_5.anInt8536 - -2, ((Class63_Sub3) super.aClass63_5).anInt8544, 0);
		Static546.aClass132_13.method7481(arg0 - 1, arg1 + 1, super.aClass63_5.anInt8537 + 2, super.aClass63_5.anInt8536, 0, 0);
	}
}
