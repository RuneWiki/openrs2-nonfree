import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class212 {

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!gk;")
	private Class26_Sub1 aClass26_Sub1_6;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!gk;")
	public final Class26_Sub1 aClass26_Sub1_5 = new Class26_Sub1();

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class212() {
		this.aClass26_Sub1_5.aClass26_Sub1_10 = this.aClass26_Sub1_5;
		this.aClass26_Sub1_5.aClass26_Sub1_9 = this.aClass26_Sub1_5;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Lclient!gk;")
	public Class26_Sub1 method4705() {
		@Pc(11) Class26_Sub1 local11 = this.aClass26_Sub1_6;
		if (this.aClass26_Sub1_5 == local11) {
			this.aClass26_Sub1_6 = null;
			return null;
		} else {
			this.aClass26_Sub1_6 = local11.aClass26_Sub1_10;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
	public int method4706() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class26_Sub1 local19 = this.aClass26_Sub1_5.aClass26_Sub1_10; local19 != this.aClass26_Sub1_5; local19 = local19.aClass26_Sub1_10) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)Lclient!gk;")
	public Class26_Sub1 method4707() {
		@Pc(13) Class26_Sub1 local13 = this.aClass26_Sub1_5.aClass26_Sub1_10;
		if (this.aClass26_Sub1_5 == local13) {
			this.aClass26_Sub1_6 = null;
			return null;
		} else {
			this.aClass26_Sub1_6 = local13.aClass26_Sub1_10;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	public void method4711() {
		while (true) {
			@Pc(15) Class26_Sub1 local15 = this.aClass26_Sub1_5.aClass26_Sub1_10;
			if (local15 == this.aClass26_Sub1_5) {
				this.aClass26_Sub1_6 = null;
				return;
			}
			local15.method7579();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!gk;Z)V")
	public void method4712(@OriginalArg(0) Class26_Sub1 arg0) {
		if (arg0.aClass26_Sub1_9 != null) {
			arg0.method7579();
		}
		arg0.aClass26_Sub1_10 = this.aClass26_Sub1_5;
		arg0.aClass26_Sub1_9 = this.aClass26_Sub1_5.aClass26_Sub1_9;
		arg0.aClass26_Sub1_9.aClass26_Sub1_10 = arg0;
		arg0.aClass26_Sub1_10.aClass26_Sub1_9 = arg0;
	}
}
