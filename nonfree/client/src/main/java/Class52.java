import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class52 {

	@OriginalMember(owner = "client!s", name = "w", descriptor = "Lclient!q;")
	private Class2 aClass2_86;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!q;")
	public final Class2 aClass2_85 = new Class2();

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class52() {
		this.aClass2_85.aClass2_96 = this.aClass2_85;
		this.aClass2_85.aClass2_95 = this.aClass2_85;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!q;I)V")
	public void method1584(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_95 != null) {
			arg0.method1794();
		}
		arg0.aClass2_96 = this.aClass2_85.aClass2_96;
		arg0.aClass2_95 = this.aClass2_85;
		arg0.aClass2_95.aClass2_96 = arg0;
		arg0.aClass2_96.aClass2_95 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!q;")
	public Class2 method1585() {
		@Pc(6) Class2 local6 = this.aClass2_86;
		if (local6 == this.aClass2_85) {
			this.aClass2_86 = null;
			return null;
		} else {
			this.aClass2_86 = local6.aClass2_95;
			return local6;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Lclient!q;")
	public Class2 method1587() {
		@Pc(3) Class2 local3 = this.aClass2_85.aClass2_96;
		if (this.aClass2_85 == local3) {
			this.aClass2_86 = null;
			return null;
		} else {
			this.aClass2_86 = local3.aClass2_96;
			return local3;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lclient!q;")
	public Class2 method1588() {
		@Pc(6) Class2 local6 = this.aClass2_86;
		if (local6 == this.aClass2_85) {
			this.aClass2_86 = null;
			return null;
		} else {
			this.aClass2_86 = local6.aClass2_96;
			return local6;
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)Lclient!q;")
	public Class2 method1589() {
		@Pc(7) Class2 local7 = this.aClass2_85.aClass2_95;
		if (this.aClass2_85 == local7) {
			this.aClass2_86 = null;
			return null;
		} else {
			this.aClass2_86 = local7.aClass2_95;
			return local7;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public void method1590() {
		while (true) {
			@Pc(15) Class2 local15 = this.aClass2_85.aClass2_96;
			if (this.aClass2_85 == local15) {
				return;
			}
			local15.method1794();
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Lclient!q;")
	public Class2 method1591() {
		@Pc(3) Class2 local3 = this.aClass2_85.aClass2_95;
		if (this.aClass2_85 == local3) {
			return null;
		} else {
			local3.method1794();
			return local3;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!q;Lclient!q;I)V")
	public void method1592(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_95 != null) {
			arg1.method1794();
		}
		arg1.aClass2_96 = arg0;
		arg1.aClass2_95 = arg0.aClass2_95;
		arg1.aClass2_95.aClass2_96 = arg1;
		arg1.aClass2_96.aClass2_95 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Lclient!q;I)V")
	public void method1593(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_95 != null) {
			arg0.method1794();
		}
		arg0.aClass2_96 = this.aClass2_85;
		arg0.aClass2_95 = this.aClass2_85.aClass2_95;
		arg0.aClass2_95.aClass2_96 = arg0;
		arg0.aClass2_96.aClass2_95 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Lclient!q;")
	public Class2 method1594() {
		@Pc(7) Class2 local7 = this.aClass2_85.aClass2_96;
		if (this.aClass2_85 == local7) {
			return null;
		} else {
			local7.method1794();
			return local7;
		}
	}
}
