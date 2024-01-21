import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class36 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!ld;")
	private Class2 aClass2_78;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!ld;")
	public final Class2 aClass2_77 = new Class2();

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class36() {
		this.aClass2_77.aClass2_94 = this.aClass2_77;
		this.aClass2_77.aClass2_93 = this.aClass2_77;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public void method1356() {
		while (true) {
			@Pc(12) Class2 local12 = this.aClass2_77.aClass2_93;
			if (this.aClass2_77 == local12) {
				return;
			}
			local12.method1695();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ld;ILclient!ld;)V")
	public void method1357(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_94 != null) {
			arg0.method1695();
		}
		arg0.aClass2_94 = arg1.aClass2_94;
		arg0.aClass2_93 = arg1;
		arg0.aClass2_94.aClass2_93 = arg0;
		arg0.aClass2_93.aClass2_94 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lclient!ld;")
	public Class2 method1358() {
		@Pc(7) Class2 local7 = this.aClass2_77.aClass2_93;
		if (this.aClass2_77 == local7) {
			return null;
		} else {
			local7.method1695();
			return local7;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lclient!ld;")
	public Class2 method1361() {
		@Pc(12) Class2 local12 = this.aClass2_78;
		if (local12 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local12.aClass2_93;
			return local12;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ld;I)V")
	public void method1362(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_94 != null) {
			arg0.method1695();
		}
		arg0.aClass2_94 = this.aClass2_77.aClass2_94;
		arg0.aClass2_93 = this.aClass2_77;
		arg0.aClass2_94.aClass2_93 = arg0;
		arg0.aClass2_93.aClass2_94 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ld;)V")
	public void method1363(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_94 != null) {
			arg0.method1695();
		}
		arg0.aClass2_94 = this.aClass2_77;
		arg0.aClass2_93 = this.aClass2_77.aClass2_93;
		arg0.aClass2_94.aClass2_93 = arg0;
		arg0.aClass2_93.aClass2_94 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Lclient!ld;")
	public Class2 method1365() {
		@Pc(15) Class2 local15 = this.aClass2_77.aClass2_93;
		if (local15 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local15.aClass2_93;
			return local15;
		}
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)Lclient!ld;")
	public Class2 method1366() {
		@Pc(8) Class2 local8 = this.aClass2_77.aClass2_94;
		if (this.aClass2_77 == local8) {
			return null;
		} else {
			local8.method1695();
			return local8;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)Lclient!ld;")
	public Class2 method1367() {
		@Pc(3) Class2 local3 = this.aClass2_77.aClass2_94;
		if (local3 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local3.aClass2_94;
			return local3;
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Lclient!ld;")
	public Class2 method1370() {
		@Pc(2) Class2 local2 = this.aClass2_78;
		if (local2 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local2.aClass2_94;
			return local2;
		}
	}
}
