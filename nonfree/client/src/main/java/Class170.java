import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class170 implements Interface17 {

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "Lclient!wda;")
	private final Class377 aClass377_2;

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "Lclient!jg;")
	private final Class179 aClass179_1;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!wda;Lclient!jg;)V")
	public Class170(@OriginalArg(0) Class377 arg0, @OriginalArg(1) Class179 arg1) {
		this.aClass377_2 = arg0;
		this.aClass179_1 = arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	@Override
	public void method8062() {
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILjava/lang/String;ILclient!da;II)I")
	private int method4242(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) int arg3) {
		return arg2.method6078(0, arg1 + 5, this.aClass179_1.anInt4929, arg3 + 5, this.aClass179_1.anInt4925 + -10, 0, 0, (int[]) null, this.aClass179_1.anInt4930 - 10, this.aClass179_1.anInt4928, 0, 0, (Class1) null, arg0, (Class31[]) null);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8064() {
		@Pc(17) Class257 local17 = this.aClass377_2.method8719(this.aClass179_1.anInt4931);
		if (local17 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass179_1.aClass97_10.method2304(this.aClass179_1.anInt4925, Static143.anInt2998) + this.aClass179_1.anInt4924;
		@Pc(47) int local47 = this.aClass179_1.aClass252_8.method6014(this.aClass179_1.anInt4930, Static478.anInt7732) + this.aClass179_1.anInt4923;
		if (this.aClass179_1.aBoolean367) {
			Static141.aClass13_27.method8104(local33, local47, this.aClass179_1.anInt4925, this.aClass179_1.anInt4930, this.aClass179_1.anInt4927, 0);
		}
		local47 += this.method4242(local17.aString57, local47, Static544.aClass37_8, local33) * 12;
		local47 += 8;
		if (this.aClass179_1.aBoolean367) {
			Static141.aClass13_27.method8090(local33, local47, this.aClass179_1.anInt4925 + local33 - 1, local47, this.aClass179_1.anInt4927, 0);
		}
		local47++;
		local47 += this.method4242(local17.aString58, local47, Static544.aClass37_8, local33) * 12;
		local47 += 5;
		@Pc(129) int local129 = local47 + this.method4242(local17.aString56, local47, Static544.aClass37_8, local33) * 12;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8063() {
		return this.aClass377_2.method8720();
	}
}
