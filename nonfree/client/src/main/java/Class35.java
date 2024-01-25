import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class35 {

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Lclient!mq;")
	private final Class223 aClass223_7 = new Class223(256);

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!fa;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ifa;Lclient!fa;)V")
	public Class35(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Interface11 arg1) {
		this.anInterface11_1 = arg1;
		this.aClass44_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public void method500() {
		this.aClass223_7.method5398();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public void method501() {
		this.aClass223_7.method5399(5);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)Lclient!co;")
	public Interface6 method504(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass223_7.method5388((long) arg0);
		if (local10 != null) {
			return (Interface6) local10;
		} else if (this.anInterface11_1.method7407(arg0)) {
			@Pc(29) Class14 local29 = this.anInterface11_1.method7405(arg0);
			@Pc(38) int local38 = local29.aBoolean12 ? 64 : this.aClass44_Sub2_1.anInt4975;
			@Pc(70) Interface6 local70;
			if (local29.aBoolean9 && this.aClass44_Sub2_1.method5019()) {
				@Pc(55) float[] local55 = this.anInterface11_1.method7409(arg0, local38, 0.7F, local38);
				local70 = this.aClass44_Sub2_1.method4362(local38, local55, local29.aByte10 != 0, Static7.aClass97_5, local38);
			} else {
				@Pc(102) int[] local102 = !local29.aBoolean15 && Static126.method2599(local29.aByte9) ? this.anInterface11_1.method7408(local38, true, local38, arg0, 0.7F) : this.anInterface11_1.method7406(local38, arg0, local38, 0.7F);
				local70 = this.aClass44_Sub2_1.method4250(local38, local29.aByte10 != 0, local102, local38);
			}
			local70.method8281(local29.aBoolean8, local29.aBoolean7);
			this.aClass223_7.method5394(local70, (long) arg0);
			return local70;
		} else {
			return null;
		}
	}
}
