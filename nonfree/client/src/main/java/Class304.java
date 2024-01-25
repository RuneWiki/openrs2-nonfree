import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class304 implements Interface1 {

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Lclient!pa;")
	private final Class249 aClass249_2;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!eaa;")
	private final Class79 aClass79_1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!pa;Lclient!eaa;)V")
	public Class304(@OriginalArg(0) Class249 arg0, @OriginalArg(1) Class79 arg1) {
		this.aClass249_2 = arg0;
		this.aClass79_1 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7699() {
		@Pc(15) Class17 local15 = this.aClass249_2.method5600(this.aClass79_1.anInt2640);
		if (local15 == null) {
			return;
		}
		@Pc(34) int local34 = this.aClass79_1.aClass154_8.method3814(this.aClass79_1.anInt2639, Static333.anInt6024) + this.aClass79_1.anInt2635;
		@Pc(49) int local49 = this.aClass79_1.aClass201_7.method4868(this.aClass79_1.anInt2633, Static473.anInt8221) + this.aClass79_1.anInt2634;
		if (this.aClass79_1.aBoolean188) {
			Static319.aClass31_11.method8035(local34, local49, this.aClass79_1.anInt2639, this.aClass79_1.anInt2633, this.aClass79_1.anInt2643, 0);
		}
		local49 += this.method6609(local34, Static465.aClass63_10, local15.aString7, local49) * 12;
		local49 += 8;
		if (this.aClass79_1.aBoolean188) {
			Static319.aClass31_11.method8059(local34, local49, local34 + this.aClass79_1.anInt2639 - 1, local49, this.aClass79_1.anInt2643, 0);
		}
		local49++;
		local49 += this.method6609(local34, Static465.aClass63_10, local15.aString8, local49) * 12;
		local49 += 5;
		@Pc(134) int local134 = local49 + this.method6609(local34, Static465.aClass63_10, local15.aString9, local49) * 12;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	@Override
	public void method7700() {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7701() {
		return this.aClass249_2.method5606();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!la;Ljava/lang/String;I)I")
	private int method6609(@OriginalArg(1) int arg0, @OriginalArg(3) Class63 arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		return arg1.method6882(this.aClass79_1.anInt2639 - 10, this.aClass79_1.anInt2636, 0, 0, null, arg3 + 5, arg2, 0, arg0 + 5, 0, 0, this.aClass79_1.anInt2638, null, null, this.aClass79_1.anInt2633 - 10);
	}
}
