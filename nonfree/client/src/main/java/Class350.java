import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class350 implements Interface5 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!du;")
	private final Class88 aClass88_1;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!fb;")
	private final Class106 aClass106_2;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!fb;Lclient!du;)V")
	public Class350(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class88 arg1) {
		this.aClass88_1 = arg1;
		this.aClass106_2 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8562() {
		@Pc(18) Class177 local18 = this.aClass106_2.method2627(this.aClass88_1.anInt1748);
		if (local18 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass88_1.aClass189_2.method4461(Static592.anInt9548, this.aClass88_1.anInt1751) + this.aClass88_1.anInt1747;
		@Pc(50) int local50 = this.aClass88_1.aClass346_1.method7688(this.aClass88_1.anInt1745, Static401.anInt6745) + this.aClass88_1.anInt1739;
		if (this.aClass88_1.aBoolean136) {
			Static273.aClass100_6.method8607(local35, local50, this.aClass88_1.anInt1751, this.aClass88_1.anInt1745, this.aClass88_1.anInt1741, 0);
		}
		local50 += this.method7753(local18.aString47, local35, local50, Static196.aClass70_3) * 12;
		local50 += 8;
		if (this.aClass88_1.aBoolean136) {
			Static273.aClass100_6.method8638(local35, local50, local35 + this.aClass88_1.anInt1751 - 1, local50, this.aClass88_1.anInt1741, 0);
		}
		local50++;
		local50 += this.method7753(local18.aString46, local35, local50, Static196.aClass70_3) * 12;
		local50 += 5;
		@Pc(137) int local137 = local50 + this.method7753(local18.aString45, local35, local50, Static196.aClass70_3) * 12;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return this.aClass106_2.method2626();
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	@Override
	public void method8563() {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;IIILclient!da;)I")
	private int method7753(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class70 arg3) {
		return arg3.method8435((Class1) null, 0, 0, arg0, this.aClass88_1.anInt1745 - 10, this.aClass88_1.anInt1751 + -10, this.aClass88_1.anInt1749, arg1 + 5, (Class155[]) null, 0, this.aClass88_1.anInt1746, 0, (int[]) null, 0, arg2 + 5);
	}
}
