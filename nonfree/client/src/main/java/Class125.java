import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class125 {

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Lclient!pi;")
	private Class23_Sub1 aClass23_Sub1_6;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!pi;")
	public final Class23_Sub1 aClass23_Sub1_5 = new Class23_Sub1();

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class125() {
		this.aClass23_Sub1_5.aClass23_Sub1_10 = this.aClass23_Sub1_5;
		this.aClass23_Sub1_5.aClass23_Sub1_9 = this.aClass23_Sub1_5;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Lclient!pi;")
	public Class23_Sub1 method2782() {
		@Pc(11) Class23_Sub1 local11 = this.aClass23_Sub1_6;
		if (local11 == this.aClass23_Sub1_5) {
			this.aClass23_Sub1_6 = null;
			return null;
		} else {
			this.aClass23_Sub1_6 = local11.aClass23_Sub1_9;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)I")
	public int method2783() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class23_Sub1 local11 = this.aClass23_Sub1_5.aClass23_Sub1_9;
		while (this.aClass23_Sub1_5 != local11) {
			local11 = local11.aClass23_Sub1_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	public void method2784() {
		while (true) {
			@Pc(5) Class23_Sub1 local5 = this.aClass23_Sub1_5.aClass23_Sub1_9;
			if (local5 == this.aClass23_Sub1_5) {
				this.aClass23_Sub1_6 = null;
				return;
			}
			local5.method6583();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!pi;)V")
	public void method2786(@OriginalArg(1) Class23_Sub1 arg0) {
		if (arg0.aClass23_Sub1_10 != null) {
			arg0.method6583();
		}
		arg0.aClass23_Sub1_10 = this.aClass23_Sub1_5.aClass23_Sub1_10;
		arg0.aClass23_Sub1_9 = this.aClass23_Sub1_5;
		arg0.aClass23_Sub1_10.aClass23_Sub1_9 = arg0;
		arg0.aClass23_Sub1_9.aClass23_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)Lclient!pi;")
	public Class23_Sub1 method2787() {
		@Pc(7) Class23_Sub1 local7 = this.aClass23_Sub1_5.aClass23_Sub1_9;
		if (this.aClass23_Sub1_5 == local7) {
			this.aClass23_Sub1_6 = null;
			return null;
		} else {
			this.aClass23_Sub1_6 = local7.aClass23_Sub1_9;
			return local7;
		}
	}
}
