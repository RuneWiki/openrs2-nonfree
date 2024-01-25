import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	private int anInt7870 = 0;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!pfa;Lclient!qg;)V")
	public Class104_Sub1(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class230_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7571() {
		@Pc(24) int local24 = super.aClass230_2.aClass319_13.method7077(Static592.anInt9585, super.aClass58_42.AA()) + super.aClass230_2.anInt7384;
		@Pc(38) int local38 = super.aClass230_2.aClass247_13.method5723(Static579.anInt9514, super.aClass58_42.a()) + super.aClass230_2.anInt7381;
		super.aClass58_42.method7665((float) (local24 + super.aClass58_42.AA() / 2), (float) (super.aClass58_42.a() / 2 + local38), 4096, this.anInt7870);
		this.anInt7870 += ((Class230_Sub1) super.aClass230_2).anInt7387;
	}
}
