import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class113 implements Interface13 {

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "Lclient!ia;")
	private final Class166 aClass166_1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!wn;")
	private final Class395 aClass395_1;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!ia;Lclient!wn;)V")
	public Class113(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class395 arg1) {
		this.aClass166_1 = arg0;
		this.aClass395_1 = arg1;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
	@Override
	public void method8821() {
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8820() {
		return this.aClass166_1.method4037();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8819() {
		@Pc(18) Class11 local18 = this.aClass166_1.method4035(this.aClass395_1.anInt11094);
		if (local18 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass395_1.aClass258_15.method6293(Static380.anInt6690, this.aClass395_1.anInt11086) + this.aClass395_1.anInt11087;
		@Pc(50) int local50 = this.aClass395_1.aClass205_19.method5049(Static380.anInt6697, this.aClass395_1.anInt11092) + this.aClass395_1.anInt11082;
		if (this.aClass395_1.aBoolean774) {
			Static103.aClass144_3.method6923(local35, local50, this.aClass395_1.anInt11086, this.aClass395_1.anInt11092, this.aClass395_1.anInt11090, 0);
		}
		local50 += this.method2254(Static255.aClass68_4, local35, local50, local18.aString5) * 12;
		local50 += 8;
		if (this.aClass395_1.aBoolean774) {
			Static103.aClass144_3.method6969(local35, local50, this.aClass395_1.anInt11086 + local35 - 1, local50, this.aClass395_1.anInt11090, 0);
		}
		local50++;
		local50 += this.method2254(Static255.aClass68_4, local35, local50, local18.aString4) * 12;
		local50 += 5;
		@Pc(136) int local136 = local50 + this.method2254(Static255.aClass68_4, local35, local50, local18.aString3) * 12;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!da;BIILjava/lang/String;I)I")
	private int method2254(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		return arg0.method9436(0, this.aClass395_1.anInt11092 - 10, this.aClass395_1.anInt11088, arg2 + 5, this.aClass395_1.anInt11086 - 10, arg1 + 5, arg3, (Class1) null, this.aClass395_1.anInt11089, 0, (int[]) null, 0, 0, (Class45[]) null, 0);
	}
}
