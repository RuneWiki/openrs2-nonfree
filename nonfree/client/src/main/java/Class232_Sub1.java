import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class232_Sub1 extends Class232 {

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	private int anInt6515 = 0;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!cb;Lclient!de;)V")
	public Class232_Sub1(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class76_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8561() {
		@Pc(22) int local22 = super.aClass76_2.aClass112_4.method2278(Static345.anInt6198, super.aClass59_21.method8053()) + super.aClass76_2.anInt1747;
		@Pc(36) int local36 = super.aClass76_2.aClass4_4.method49(Static427.anInt10577, super.aClass59_21.method8064()) + super.aClass76_2.anInt1745;
		super.aClass59_21.method8071((float) (local22 + super.aClass59_21.method8053() / 2), (float) (local36 + super.aClass59_21.method8064() / 2), 4096, this.anInt6515);
		this.anInt6515 += ((Class76_Sub1) super.aClass76_2).anInt1752;
	}
}
