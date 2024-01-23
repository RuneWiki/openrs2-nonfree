import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class66 {

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient!bm;")
	private Class20_Sub1 aClass20_Sub1_4;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!bm;")
	public Class20_Sub1 aClass20_Sub1_3 = new Class20_Sub1();

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class66() {
		this.aClass20_Sub1_3.aClass20_Sub1_5 = this.aClass20_Sub1_3;
		this.aClass20_Sub1_3.aClass20_Sub1_6 = this.aClass20_Sub1_3;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lclient!bm;")
	public Class20_Sub1 method1707() {
		@Pc(3) Class20_Sub1 local3 = this.aClass20_Sub1_3.aClass20_Sub1_5;
		if (this.aClass20_Sub1_3 == local3) {
			this.aClass20_Sub1_4 = null;
			return null;
		} else {
			this.aClass20_Sub1_4 = local3.aClass20_Sub1_5;
			return local3;
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public void method1709() {
		while (true) {
			@Pc(17) Class20_Sub1 local17 = this.aClass20_Sub1_3.aClass20_Sub1_5;
			if (this.aClass20_Sub1_3 == local17) {
				this.aClass20_Sub1_4 = null;
				return;
			}
			local17.method3693();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!bm;I)V")
	public void method1712(@OriginalArg(0) Class20_Sub1 arg0) {
		if (arg0.aClass20_Sub1_6 != null) {
			arg0.method3693();
		}
		arg0.aClass20_Sub1_6 = this.aClass20_Sub1_3.aClass20_Sub1_6;
		arg0.aClass20_Sub1_5 = this.aClass20_Sub1_3;
		arg0.aClass20_Sub1_6.aClass20_Sub1_5 = arg0;
		arg0.aClass20_Sub1_5.aClass20_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)Lclient!bm;")
	public Class20_Sub1 method1713() {
		@Pc(11) Class20_Sub1 local11 = this.aClass20_Sub1_4;
		if (local11 == this.aClass20_Sub1_3) {
			this.aClass20_Sub1_4 = null;
			return null;
		} else {
			this.aClass20_Sub1_4 = local11.aClass20_Sub1_5;
			return local11;
		}
	}
}
