import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class156 {

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Lclient!mq;")
	private Class28 aClass28_26;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!mq;")
	private final Class28 aClass28_25 = new Class28();

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class156() {
		this.aClass28_25.aClass28_68 = this.aClass28_25;
		this.aClass28_25.aClass28_67 = this.aClass28_25;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!mq;)V")
	public void method3774(@OriginalArg(1) Class28 arg0) {
		if (arg0.aClass28_67 != null) {
			arg0.method9022();
		}
		arg0.aClass28_67 = this.aClass28_25.aClass28_67;
		arg0.aClass28_68 = this.aClass28_25;
		arg0.aClass28_67.aClass28_68 = arg0;
		arg0.aClass28_68.aClass28_67 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lclient!mq;")
	public Class28 method3775() {
		@Pc(7) Class28 local7 = this.aClass28_25.aClass28_68;
		if (this.aClass28_25 == local7) {
			return null;
		} else {
			local7.method9022();
			return local7;
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)Lclient!mq;")
	public Class28 method3776() {
		@Pc(14) Class28 local14 = this.aClass28_25.aClass28_68;
		if (local14 == this.aClass28_25) {
			this.aClass28_26 = null;
			return null;
		} else {
			this.aClass28_26 = local14.aClass28_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
	public int method3777() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class28 local11 = this.aClass28_25.aClass28_68; local11 != this.aClass28_25; local11 = local11.aClass28_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Lclient!mq;")
	public Class28 method3779() {
		@Pc(12) Class28 local12 = this.aClass28_25.aClass28_67;
		if (this.aClass28_25 == local12) {
			this.aClass28_26 = null;
			return null;
		} else {
			this.aClass28_26 = local12.aClass28_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)Z")
	public boolean method3780() {
		return this.aClass28_25 == this.aClass28_25.aClass28_68;
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V")
	public void method3782() {
		while (true) {
			@Pc(3) Class28 local3 = this.aClass28_25.aClass28_68;
			if (this.aClass28_25 == local3) {
				this.aClass28_26 = null;
				return;
			}
			local3.method9022();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Lclient!mq;")
	public Class28 method3783() {
		@Pc(12) Class28 local12 = this.aClass28_26;
		if (local12 == this.aClass28_25) {
			this.aClass28_26 = null;
			return null;
		} else {
			this.aClass28_26 = local12.aClass28_68;
			return local12;
		}
	}
}
