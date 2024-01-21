import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class13 {

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!bd;")
	private Class2 aClass2_18;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!bd;")
	public final Class2 aClass2_17 = new Class2();

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class13() {
		this.aClass2_17.aClass2_128 = this.aClass2_17;
		this.aClass2_17.aClass2_127 = this.aClass2_17;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!bd;BLclient!bd;)V")
	public void method262(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_128 != null) {
			arg0.method2053();
		}
		arg0.aClass2_128 = arg1.aClass2_128;
		arg0.aClass2_127 = arg1;
		arg0.aClass2_128.aClass2_127 = arg0;
		arg0.aClass2_127.aClass2_128 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!bd;)V")
	public void method263(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_128 != null) {
			arg0.method2053();
		}
		arg0.aClass2_127 = this.aClass2_17;
		arg0.aClass2_128 = this.aClass2_17.aClass2_128;
		arg0.aClass2_128.aClass2_127 = arg0;
		arg0.aClass2_127.aClass2_128 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Lclient!bd;")
	public Class2 method265() {
		@Pc(8) Class2 local8 = this.aClass2_17.aClass2_128;
		if (this.aClass2_17 == local8) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local8.aClass2_128;
			return local8;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Lclient!bd;")
	public Class2 method267() {
		@Pc(7) Class2 local7 = this.aClass2_17.aClass2_127;
		if (local7 == this.aClass2_17) {
			return null;
		} else {
			local7.method2053();
			return local7;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lclient!bd;")
	public Class2 method268() {
		@Pc(6) Class2 local6 = this.aClass2_18;
		if (this.aClass2_17 == local6) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local6.aClass2_128;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(ILclient!bd;)V")
	public void method269(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_128 != null) {
			arg0.method2053();
		}
		arg0.aClass2_128 = this.aClass2_17;
		arg0.aClass2_127 = this.aClass2_17.aClass2_127;
		arg0.aClass2_128.aClass2_127 = arg0;
		arg0.aClass2_127.aClass2_128 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Lclient!bd;")
	public Class2 method270() {
		@Pc(7) Class2 local7 = this.aClass2_17.aClass2_127;
		if (this.aClass2_17 == local7) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local7.aClass2_127;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Lclient!bd;")
	public Class2 method273() {
		@Pc(11) Class2 local11 = this.aClass2_18;
		if (local11 == this.aClass2_17) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local11.aClass2_127;
			return local11;
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Lclient!bd;")
	public Class2 method274() {
		@Pc(7) Class2 local7 = this.aClass2_17.aClass2_128;
		if (this.aClass2_17 == local7) {
			return null;
		} else {
			local7.method2053();
			return local7;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public void method275() {
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_17.aClass2_127;
			if (this.aClass2_17 == local10) {
				return;
			}
			local10.method2053();
		}
	}
}
