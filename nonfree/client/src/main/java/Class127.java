import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class127 {

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Lclient!aq;")
	private Class20_Sub1 aClass20_Sub1_8;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!aq;")
	public final Class20_Sub1 aClass20_Sub1_7 = new Class20_Sub1();

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	public Class127() {
		this.aClass20_Sub1_7.aClass20_Sub1_10 = this.aClass20_Sub1_7;
		this.aClass20_Sub1_7.aClass20_Sub1_9 = this.aClass20_Sub1_7;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
	public void method2712() {
		while (true) {
			@Pc(13) Class20_Sub1 local13 = this.aClass20_Sub1_7.aClass20_Sub1_9;
			if (local13 == this.aClass20_Sub1_7) {
				this.aClass20_Sub1_8 = null;
				return;
			}
			local13.method5273();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Lclient!aq;")
	public Class20_Sub1 method2713() {
		@Pc(12) Class20_Sub1 local12 = this.aClass20_Sub1_7.aClass20_Sub1_9;
		if (local12 == this.aClass20_Sub1_7) {
			this.aClass20_Sub1_8 = null;
			return null;
		} else {
			this.aClass20_Sub1_8 = local12.aClass20_Sub1_9;
			return local12;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLclient!aq;)V")
	public void method2715(@OriginalArg(1) Class20_Sub1 arg0) {
		if (arg0.aClass20_Sub1_10 != null) {
			arg0.method5273();
		}
		arg0.aClass20_Sub1_10 = this.aClass20_Sub1_7.aClass20_Sub1_10;
		arg0.aClass20_Sub1_9 = this.aClass20_Sub1_7;
		arg0.aClass20_Sub1_10.aClass20_Sub1_9 = arg0;
		arg0.aClass20_Sub1_9.aClass20_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)Lclient!aq;")
	public Class20_Sub1 method2716() {
		@Pc(13) Class20_Sub1 local13 = this.aClass20_Sub1_8;
		if (local13 == this.aClass20_Sub1_7) {
			this.aClass20_Sub1_8 = null;
			return null;
		} else {
			this.aClass20_Sub1_8 = local13.aClass20_Sub1_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)I")
	public int method2718() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class20_Sub1 local11 = this.aClass20_Sub1_7.aClass20_Sub1_9; local11 != this.aClass20_Sub1_7; local11 = local11.aClass20_Sub1_9) {
			local7++;
		}
		return local7;
	}
}
