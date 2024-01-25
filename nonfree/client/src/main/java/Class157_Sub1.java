import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class157_Sub1 extends Class157 {

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
	private int anInt4414 = 0;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!bi;Lclient!maa;)V")
	public Class157_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class156_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7805() {
		@Pc(23) int local23 = super.aClass156_2.aClass297_8.method6544(super.aClass13_15.AA(), Static9.anInt8933) + super.aClass156_2.anInt5679;
		@Pc(37) int local37 = super.aClass156_2.aClass58_9.method1299(super.aClass13_15.a(), Static576.anInt9547) + super.aClass156_2.anInt5680;
		super.aClass13_15.method8018((float) (super.aClass13_15.AA() / 2 + local23), (float) (local37 + super.aClass13_15.a() / 2), 4096, this.anInt4414);
		this.anInt4414 += ((Class156_Sub1) super.aClass156_2).anInt5684;
	}
}
