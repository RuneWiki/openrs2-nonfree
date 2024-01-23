import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class110 {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!r;")
	private Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!r;")
	public Class20_Sub2 aClass20_Sub2_1 = new Class20_Sub2();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class110() {
		this.aClass20_Sub2_1.aClass20_Sub2_5 = this.aClass20_Sub2_1;
		this.aClass20_Sub2_1.aClass20_Sub2_6 = this.aClass20_Sub2_1;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method2464() {
		while (true) {
			@Pc(5) Class20_Sub2 local5 = this.aClass20_Sub2_1.aClass20_Sub2_5;
			if (local5 == this.aClass20_Sub2_1) {
				this.aClass20_Sub2_2 = null;
				return;
			}
			local5.method2641();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Lclient!r;")
	public Class20_Sub2 method2465() {
		@Pc(18) Class20_Sub2 local18 = this.aClass20_Sub2_1.aClass20_Sub2_5;
		if (local18 == this.aClass20_Sub2_1) {
			this.aClass20_Sub2_2 = null;
			return null;
		} else {
			this.aClass20_Sub2_2 = local18.aClass20_Sub2_5;
			return local18;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!r;)V")
	public void method2467(@OriginalArg(1) Class20_Sub2 arg0) {
		if (arg0.aClass20_Sub2_6 != null) {
			arg0.method2641();
		}
		arg0.aClass20_Sub2_5 = this.aClass20_Sub2_1;
		arg0.aClass20_Sub2_6 = this.aClass20_Sub2_1.aClass20_Sub2_6;
		arg0.aClass20_Sub2_6.aClass20_Sub2_5 = arg0;
		arg0.aClass20_Sub2_5.aClass20_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)Lclient!r;")
	public Class20_Sub2 method2468() {
		@Pc(2) Class20_Sub2 local2 = this.aClass20_Sub2_2;
		if (this.aClass20_Sub2_1 == local2) {
			this.aClass20_Sub2_2 = null;
			return null;
		} else {
			this.aClass20_Sub2_2 = local2.aClass20_Sub2_5;
			return local2;
		}
	}
}
