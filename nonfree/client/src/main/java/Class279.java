import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class279 {

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!vba;")
	private Class3_Sub10 aClass3_Sub10_56;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!vba;")
	private final Class3_Sub10 aClass3_Sub10_55 = new Class3_Sub10();

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class279() {
		this.aClass3_Sub10_55.aClass3_Sub10_59 = this.aClass3_Sub10_55;
		this.aClass3_Sub10_55.aClass3_Sub10_60 = this.aClass3_Sub10_55;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method6905() {
		while (true) {
			@Pc(5) Class3_Sub10 local5 = this.aClass3_Sub10_55.aClass3_Sub10_59;
			if (local5 == this.aClass3_Sub10_55) {
				this.aClass3_Sub10_56 = null;
				return;
			}
			local5.method7643();
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Lclient!vba;")
	public Class3_Sub10 method6906() {
		@Pc(10) Class3_Sub10 local10 = this.aClass3_Sub10_56;
		if (local10 == this.aClass3_Sub10_55) {
			this.aClass3_Sub10_56 = null;
			return null;
		} else {
			this.aClass3_Sub10_56 = local10.aClass3_Sub10_59;
			return local10;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	public int method6907() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class3_Sub10 local16 = this.aClass3_Sub10_55.aClass3_Sub10_59;
		while (this.aClass3_Sub10_55 != local16) {
			local16 = local16.aClass3_Sub10_59;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!vba;")
	public Class3_Sub10 method6908() {
		@Pc(7) Class3_Sub10 local7 = this.aClass3_Sub10_55.aClass3_Sub10_59;
		if (local7 == this.aClass3_Sub10_55) {
			this.aClass3_Sub10_56 = null;
			return null;
		} else {
			this.aClass3_Sub10_56 = local7.aClass3_Sub10_59;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Lclient!vba;")
	public Class3_Sub10 method6909() {
		@Pc(15) Class3_Sub10 local15 = this.aClass3_Sub10_55.aClass3_Sub10_59;
		if (this.aClass3_Sub10_55 == local15) {
			return null;
		} else {
			local15.method7643();
			return local15;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!vba;)V")
	public void method6910(@OriginalArg(1) Class3_Sub10 arg0) {
		if (arg0.aClass3_Sub10_60 != null) {
			arg0.method7643();
		}
		arg0.aClass3_Sub10_60 = this.aClass3_Sub10_55.aClass3_Sub10_60;
		arg0.aClass3_Sub10_59 = this.aClass3_Sub10_55;
		arg0.aClass3_Sub10_60.aClass3_Sub10_59 = arg0;
		arg0.aClass3_Sub10_59.aClass3_Sub10_60 = arg0;
	}
}
