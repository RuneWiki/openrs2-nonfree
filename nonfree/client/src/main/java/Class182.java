import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class182 implements Interface4 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!pia;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!jv;")
	private final Class169 aClass169_1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!pia;Lclient!jv;)V")
	public Class182(@OriginalArg(0) Class262 arg0, @OriginalArg(1) Class169 arg1) {
		this.aClass262_1 = arg0;
		this.aClass169_1 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public void method8346() {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILjava/lang/String;Lclient!da;I)I")
	private int method5060(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) Class25 arg2, @OriginalArg(5) int arg3) {
		return arg2.method5857(arg0 + 5, this.aClass169_1.anInt5844 - 10, 0, this.aClass169_1.anInt5838, null, this.aClass169_1.anInt5842 - 10, this.aClass169_1.anInt5840, arg1, null, 0, null, arg3 + 5, 0, 0, 0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8344() {
		return this.aClass262_1.method6625();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8345() {
		@Pc(17) Class261 local17 = this.aClass262_1.method6624(this.aClass169_1.anInt5835);
		if (local17 == null) {
			return;
		}
		@Pc(34) int local34 = this.aClass169_1.aClass117_8.method3782(Static199.anInt4634, this.aClass169_1.anInt5844) + this.aClass169_1.anInt5836;
		@Pc(49) int local49 = this.aClass169_1.aClass178_8.method5000(this.aClass169_1.anInt5842, Static523.anInt9075) + this.aClass169_1.anInt5843;
		if (this.aClass169_1.aBoolean506) {
			Static47.aClass33_3.method6174(local34, local49, this.aClass169_1.anInt5844, this.aClass169_1.anInt5842, this.aClass169_1.anInt5839, 0);
		}
		local49 += this.method5060(local34, local17.aString87, Static16.aClass25_1, local49) * 12;
		local49 += 8;
		if (this.aClass169_1.aBoolean506) {
			Static47.aClass33_3.method6168(local34, local49, this.aClass169_1.anInt5844 + local34 - 1, local49, this.aClass169_1.anInt5839, 0);
		}
		local49++;
		local49 += this.method5060(local34, local17.aString89, Static16.aClass25_1, local49) * 12;
		local49 += 5;
		@Pc(131) int local131 = local49 + this.method5060(local34, local17.aString88, Static16.aClass25_1, local49) * 12;
	}
}
