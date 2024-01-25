import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class227_Sub1 extends Class227 {

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
	private int anInt7097 = 0;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!ga;Lclient!pda;)V")
	public Class227_Sub1(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class251_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6803() {
		@Pc(17) int local17 = super.aClass251_2.aClass314_12.method7035(super.aClass10_34.A(), Static483.anInt8133) + super.aClass251_2.anInt6883;
		@Pc(31) int local31 = super.aClass251_2.aClass103_18.method2391(super.aClass10_34.ca(), Static443.anInt7712) + super.aClass251_2.anInt6884;
		super.aClass10_34.method7678((float) (local17 + super.aClass10_34.A() / 2), (float) (local31 + super.aClass10_34.ca() / 2), 4096, this.anInt7097);
		this.anInt7097 += ((Class251_Sub1) super.aClass251_2).anInt6892;
	}
}
