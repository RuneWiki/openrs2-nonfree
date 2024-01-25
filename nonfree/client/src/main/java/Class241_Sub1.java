import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class241_Sub1 extends Class241 {

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	private int anInt7044 = 0;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!vo;Lclient!jf;)V")
	public Class241_Sub1(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8147() {
		@Pc(22) int local22 = super.aClass1_2.aClass347_6.method7949(Static370.anInt7124, super.aClass88_20.A()) + super.aClass1_2.anInt5016;
		@Pc(37) int local37 = super.aClass1_2.aClass214_8.method5005(Static324.anInt6378, super.aClass88_20.ca()) + super.aClass1_2.anInt5010;
		super.aClass88_20.method8050((float) (local22 + super.aClass88_20.A() / 2), (float) (local37 + super.aClass88_20.ca() / 2), 4096, this.anInt7044);
		this.anInt7044 += ((Class1_Sub1) super.aClass1_2).anInt5017;
	}
}
