import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class200 implements Interface9 {

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!gaa;")
	private final Class117 aClass117_1;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!cv;")
	private final Class63 aClass63_1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!cv;Lclient!gaa;)V")
	public Class200(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class117 arg1) {
		this.aClass117_1 = arg1;
		this.aClass63_1 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;Lclient!la;III)I")
	private int method4800(@OriginalArg(1) String arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg1.method4852(0, null, null, this.aClass117_1.anInt3336 - 10, 0, 0, 0, this.aClass117_1.anInt3334, arg2 + 5, this.aClass117_1.anInt3333 + -10, this.aClass117_1.anInt3328, arg0, 0, null, arg3 + 5);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	@Override
	public void method8148() {
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8149() {
		return this.aClass63_1.method1612();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8147() {
		@Pc(11) Class349 local11 = this.aClass63_1.method1610(this.aClass117_1.anInt3331);
		if (local11 == null) {
			return;
		}
		@Pc(40) int local40 = this.aClass117_1.aClass347_5.method7949(Static370.anInt7124, this.aClass117_1.anInt3333) + this.aClass117_1.anInt3332;
		@Pc(54) int local54 = this.aClass117_1.aClass214_6.method5005(Static324.anInt6378, this.aClass117_1.anInt3336) + this.aClass117_1.anInt3327;
		if (this.aClass117_1.aBoolean240) {
			Static39.aClass7_2.method7824(local40, local54, this.aClass117_1.anInt3333, this.aClass117_1.anInt3336, this.aClass117_1.anInt3335, 0);
		}
		local54 += this.method4800(local11.aString227, Static306.aClass45_4, local54, local40) * 12;
		local54 += 8;
		if (this.aClass117_1.aBoolean240) {
			Static39.aClass7_2.method7817(local40, local54, this.aClass117_1.anInt3333 + local40 - 1, local54, this.aClass117_1.anInt3335, 0);
		}
		local54++;
		local54 += this.method4800(local11.aString226, Static306.aClass45_4, local54, local40) * 12;
		local54 += 5;
		@Pc(136) int local136 = local54 + this.method4800(local11.aString225, Static306.aClass45_4, local54, local40) * 12;
	}
}
