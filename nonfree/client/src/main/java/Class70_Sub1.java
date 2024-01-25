import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	private int anInt5961 = 0;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!pq;Lclient!tf;)V")
	public Class70_Sub1(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class253_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6565() {
		@Pc(17) int local17 = super.aClass253_2.aClass277_11.method6409(Static282.anInt4679, super.aClass4_17.AA()) + super.aClass253_2.anInt8132;
		@Pc(32) int local32 = super.aClass253_2.aClass137_14.method2982(Static381.anInt6587, super.aClass4_17.a()) + super.aClass253_2.anInt8135;
		super.aClass4_17.method6512((float) (super.aClass4_17.AA() / 2 + local17), (float) (local32 + super.aClass4_17.a() / 2), 4096, this.anInt5961);
		this.anInt5961 += ((Class253_Sub1) super.aClass253_2).anInt8143;
	}
}
