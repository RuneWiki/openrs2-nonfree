import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!er;)V")
	public Class64_Sub1(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class104_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZBI)V")
	@Override
	protected void method7603(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static153.aClass22_4.method9403(arg0 - 2, arg1, super.aClass104_5.anInt8371 + 4, super.aClass104_5.anInt8367 + 2, ((Class104_Sub1) super.aClass104_5).anInt2790, 0);
		Static153.aClass22_4.method9403(arg0 - 1, arg1 + 1, super.aClass104_5.anInt8371 + 2, super.aClass104_5.anInt8367, 0, 0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method7607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7605() * super.aClass104_5.anInt8371 / 10000;
		Static153.aClass22_4.aa(arg1, arg0 + 2, local13, super.aClass104_5.anInt8367 - 2, ((Class104_Sub1) super.aClass104_5).anInt2791, 0);
		Static153.aClass22_4.aa(arg1 + local13, arg0 + 2, super.aClass104_5.anInt8371 - local13, super.aClass104_5.anInt8367 + -2, 0, 0);
	}
}
