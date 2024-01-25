import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!vha;)V")
	public Class46_Sub3(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class132_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static273.aClass100_6.method8607(arg0 - 2, arg1, super.aClass132_5.anInt10377 + 4, super.aClass132_5.anInt10374 + 2, ((Class132_Sub3) super.aClass132_5).anInt10384, 0);
		Static273.aClass100_6.method8607(arg0 - 1, arg1 + 1, super.aClass132_5.anInt10377 + 2, super.aClass132_5.anInt10374, 0, 0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method7491(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7488() * super.aClass132_5.anInt10377 / 10000;
		Static273.aClass100_6.aa(arg1, arg0 + 2, local13, super.aClass132_5.anInt10374 - 2, ((Class132_Sub3) super.aClass132_5).anInt10385, 0);
		Static273.aClass100_6.aa(local13 + arg1, arg0 + 2, super.aClass132_5.anInt10377 - local13, super.aClass132_5.anInt10374 + -2, 0, 0);
	}
}
