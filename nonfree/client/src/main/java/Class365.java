import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class365 implements Interface4 {

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!mr;")
	private final Class218 aClass218_1;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!rea;")
	private final Class283 aClass283_2;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!rea;Lclient!mr;)V")
	public Class365(@OriginalArg(0) Class283 arg0, @OriginalArg(1) Class218 arg1) {
		this.aClass218_1 = arg1;
		this.aClass283_2 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	@Override
	public void method7789() {
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7790() {
		return this.aClass283_2.method6275();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;Lclient!la;IIBI)I")
	private int method7792(@OriginalArg(0) String arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return arg1.method7650(this.aClass218_1.anInt5965, arg2 + 5, null, 0, this.aClass218_1.anInt5966, this.aClass218_1.anInt5962 - 10, arg0, null, null, 0, this.aClass218_1.anInt5968 - 10, 0, arg3 + 5, 0, 0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7788() {
		@Pc(11) Class344 local11 = this.aClass283_2.method6274(this.aClass218_1.anInt5961);
		if (local11 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass218_1.aClass300_10.method6502(this.aClass218_1.anInt5968, Static1.anInt7) + this.aClass218_1.anInt5967;
		@Pc(50) int local50 = this.aClass218_1.aClass140_10.method3723(Static283.anInt2480, this.aClass218_1.anInt5962) + this.aClass218_1.anInt5964;
		if (this.aClass218_1.aBoolean482) {
			Static4.aClass43_1.method7170(local35, local50, this.aClass218_1.anInt5968, this.aClass218_1.anInt5962, this.aClass218_1.anInt5959, 0);
		}
		local50 += this.method7792(local11.aString124, Static480.aClass117_9, local50, local35) * 12;
		local50 += 8;
		if (this.aClass218_1.aBoolean482) {
			Static4.aClass43_1.method7137(local35, local50, this.aClass218_1.anInt5968 + local35 - 1, local50, this.aClass218_1.anInt5959, 0);
		}
		local50++;
		local50 += this.method7792(local11.aString123, Static480.aClass117_9, local50, local35) * 12;
		local50 += 5;
		@Pc(132) int local132 = local50 + this.method7792(local11.aString122, Static480.aClass117_9, local50, local35) * 12;
	}
}
