import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class42 {

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!mf;")
	private final Class222 aClass222_7 = new Class222(256);

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "Lclient!fa;")
	private final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_5;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!hea;Lclient!fa;)V")
	public Class42(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_1 = arg1;
		this.aClass134_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public void method752() {
		this.aClass222_7.method4433(5);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)Lclient!oi;")
	public Interface14 method754(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass222_7.method4430((long) arg0);
		if (local10 != null) {
			return (Interface14) local10;
		} else if (this.anInterface7_1.method3871(arg0)) {
			@Pc(34) Class3 local34 = this.anInterface7_1.method3874(arg0);
			@Pc(43) int local43 = local34.aBoolean13 ? 64 : this.aClass134_Sub1_5.anInt8436;
			@Pc(95) Interface14 local95;
			if (local34.aBoolean6 && this.aClass134_Sub1_5.method6917()) {
				@Pc(107) float[] local107 = this.anInterface7_1.method3873(local43, 0.7F, arg0, local43);
				local95 = this.aClass134_Sub1_5.method6752(Static129.aClass203_5, local43, local107, local43, local34.aByte4 != 0);
			} else {
				@Pc(78) int[] local78 = !local34.aBoolean10 && Static471.method6446(local34.aByte7) ? this.anInterface7_1.method3869(local43, arg0, 0.7F, local43, true) : this.anInterface7_1.method3872(local43, local43, arg0, 0.7F);
				local95 = this.aClass134_Sub1_5.method6821(local43, local34.aByte4 != 0, local78, local43);
			}
			local95.method2130(local34.aBoolean12, local34.aBoolean5);
			this.aClass222_7.method4434(local95, (long) arg0);
			return local95;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method755() {
		this.aClass222_7.method4428();
	}
}
