import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class181 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!pg;")
	private Class4_Sub1 aClass4_Sub1_42 = new Class4_Sub1();

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!ub;")
	private final Class252 aClass252_4 = new Class252();

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	private final int anInt5280;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	private int anInt5279;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!hl;")
	private final Class96 aClass96_30;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class181(@OriginalArg(0) int arg0) {
		this.anInt5280 = arg0;
		this.anInt5279 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass96_30 = new Class96(local19);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public void method4417() {
		this.aClass252_4.method5696();
		this.aClass96_30.method2799();
		this.aClass4_Sub1_42 = new Class4_Sub1();
		this.anInt5279 = this.anInt5280;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)Lclient!pg;")
	public Class4_Sub1 method4420(@OriginalArg(1) long arg0) {
		@Pc(18) Class4_Sub1 local18 = (Class4_Sub1) this.aClass96_30.method2797(arg0);
		if (local18 != null) {
			this.aClass252_4.method5694(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJLclient!pg;)V")
	public void method4421(@OriginalArg(1) long arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (this.anInt5279 == 0) {
			@Pc(22) Class4_Sub1 local22 = this.aClass252_4.method5698();
			local22.method6330();
			local22.method5985();
			if (local22 == this.aClass4_Sub1_42) {
				local22 = this.aClass252_4.method5698();
				local22.method6330();
				local22.method5985();
			}
		} else {
			this.anInt5279--;
		}
		this.aClass96_30.method2805(arg0, arg1);
		this.aClass252_4.method5694(arg1);
	}
}
