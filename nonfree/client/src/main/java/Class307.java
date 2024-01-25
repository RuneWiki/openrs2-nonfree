import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class307 {

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "Lclient!ica;")
	private Class28_Sub3 aClass28_Sub3_8;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "Lclient!ica;")
	public final Class28_Sub3 aClass28_Sub3_7 = new Class28_Sub3();

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class307() {
		this.aClass28_Sub3_7.aClass28_Sub3_9 = this.aClass28_Sub3_7;
		this.aClass28_Sub3_7.aClass28_Sub3_10 = this.aClass28_Sub3_7;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)Lclient!ica;")
	public Class28_Sub3 method7410() {
		@Pc(11) Class28_Sub3 local11 = this.aClass28_Sub3_8;
		if (this.aClass28_Sub3_7 == local11) {
			this.aClass28_Sub3_8 = null;
			return null;
		} else {
			this.aClass28_Sub3_8 = local11.aClass28_Sub3_9;
			return local11;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public void method7411() {
		while (true) {
			@Pc(3) Class28_Sub3 local3 = this.aClass28_Sub3_7.aClass28_Sub3_9;
			if (this.aClass28_Sub3_7 == local3) {
				this.aClass28_Sub3_8 = null;
				return;
			}
			local3.method7882();
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)I")
	public int method7415() {
		@Pc(7) int local7 = 0;
		@Pc(19) Class28_Sub3 local19 = this.aClass28_Sub3_7.aClass28_Sub3_9;
		while (local19 != this.aClass28_Sub3_7) {
			local19 = local19.aClass28_Sub3_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)Lclient!ica;")
	public Class28_Sub3 method7416() {
		@Pc(7) Class28_Sub3 local7 = this.aClass28_Sub3_7.aClass28_Sub3_9;
		if (this.aClass28_Sub3_7 == local7) {
			this.aClass28_Sub3_8 = null;
			return null;
		} else {
			this.aClass28_Sub3_8 = local7.aClass28_Sub3_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ica;B)V")
	public void method7417(@OriginalArg(0) Class28_Sub3 arg0) {
		if (arg0.aClass28_Sub3_10 != null) {
			arg0.method7882();
		}
		arg0.aClass28_Sub3_9 = this.aClass28_Sub3_7;
		arg0.aClass28_Sub3_10 = this.aClass28_Sub3_7.aClass28_Sub3_10;
		arg0.aClass28_Sub3_10.aClass28_Sub3_9 = arg0;
		arg0.aClass28_Sub3_9.aClass28_Sub3_10 = arg0;
	}
}
