import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class LinkList {

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "Lclient!v;")
	private Linkable aClass4_128;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!v;")
	public final Linkable aClass4_127 = new Linkable();

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public LinkList() {
		this.aClass4_127.aClass4_123 = this.aClass4_127;
		this.aClass4_127.aClass4_124 = this.aClass4_127;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method2018() {
		while (true) {
			@Pc(11) Linkable local11 = this.aClass4_127.aClass4_124;
			if (local11 == this.aClass4_127) {
				return;
			}
			local11.method1999();
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Lclient!v;")
	public Linkable method2020() {
		@Pc(7) Linkable local7 = this.aClass4_127.aClass4_123;
		if (this.aClass4_127 == local7) {
			return null;
		} else {
			local7.method1999();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!v;)V")
	public void method2021(@OriginalArg(1) Linkable arg0) {
		if (arg0.aClass4_123 != null) {
			arg0.method1999();
		}
		arg0.aClass4_124 = this.aClass4_127.aClass4_124;
		arg0.aClass4_123 = this.aClass4_127;
		arg0.aClass4_123.aClass4_124 = arg0;
		arg0.aClass4_124.aClass4_123 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!v;")
	public Linkable method2022() {
		@Pc(11) Linkable local11 = this.aClass4_128;
		if (this.aClass4_127 == local11) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local11.aClass4_123;
			return local11;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!v;")
	public Linkable method2023() {
		@Pc(6) Linkable local6 = this.aClass4_128;
		if (local6 == this.aClass4_127) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local6.aClass4_124;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!v;")
	public Linkable method2025() {
		@Pc(3) Linkable local3 = this.aClass4_127.aClass4_124;
		if (local3 == this.aClass4_127) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local3.aClass4_124;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!v;B)V")
	public void method2028(@OriginalArg(0) Linkable arg0) {
		if (arg0.aClass4_123 != null) {
			arg0.method1999();
		}
		arg0.aClass4_123 = this.aClass4_127.aClass4_123;
		arg0.aClass4_124 = this.aClass4_127;
		arg0.aClass4_123.aClass4_124 = arg0;
		arg0.aClass4_124.aClass4_123 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Lclient!v;")
	public Linkable method2029() {
		@Pc(7) Linkable local7 = this.aClass4_127.aClass4_124;
		if (local7 == this.aClass4_127) {
			return null;
		} else {
			local7.method1999();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!v;Lclient!v;I)V")
	public void method2030(@OriginalArg(0) Linkable arg0, @OriginalArg(1) Linkable arg1) {
		if (arg0.aClass4_123 != null) {
			arg0.method1999();
		}
		arg0.aClass4_123 = arg1.aClass4_123;
		arg0.aClass4_124 = arg1;
		arg0.aClass4_123.aClass4_124 = arg0;
		arg0.aClass4_124.aClass4_123 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Lclient!v;")
	public Linkable method2034() {
		@Pc(12) Linkable local12 = this.aClass4_127.aClass4_123;
		if (local12 == this.aClass4_127) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local12.aClass4_123;
			return local12;
		}
	}
}
