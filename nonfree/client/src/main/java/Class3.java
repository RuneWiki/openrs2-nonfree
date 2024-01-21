import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!ca;")
	private Class2 aClass2_10;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ca;")
	public final Class2 aClass2_9 = new Class2();

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class3() {
		this.aClass2_9.aClass2_128 = this.aClass2_9;
		this.aClass2_9.aClass2_127 = this.aClass2_9;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lclient!ca;")
	public Class2 method73() {
		@Pc(13) Class2 local13 = this.aClass2_10;
		if (this.aClass2_9 == local13) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local13.aClass2_127;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lclient!ca;")
	public Class2 method74() {
		@Pc(2) Class2 local2 = this.aClass2_10;
		if (local2 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local2.aClass2_128;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ca;)V")
	public void method75(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_127 != null) {
			arg0.method2209();
		}
		arg0.aClass2_128 = this.aClass2_9;
		arg0.aClass2_127 = this.aClass2_9.aClass2_127;
		arg0.aClass2_127.aClass2_128 = arg0;
		arg0.aClass2_128.aClass2_127 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lclient!ca;")
	public Class2 method77() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_127;
		if (local7 == this.aClass2_9) {
			return null;
		} else {
			local7.method2209();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Lclient!ca;")
	public Class2 method78() {
		@Pc(3) Class2 local3 = this.aClass2_9.aClass2_128;
		if (this.aClass2_9 == local3) {
			return null;
		} else {
			local3.method2209();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ca;ILclient!ca;)V")
	public void method79(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_127 != null) {
			arg0.method2209();
		}
		arg0.aClass2_128 = arg1;
		arg0.aClass2_127 = arg1.aClass2_127;
		arg0.aClass2_127.aClass2_128 = arg0;
		arg0.aClass2_128.aClass2_127 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lclient!ca;")
	public Class2 method80() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_127;
		if (this.aClass2_9 == local7) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local7.aClass2_127;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public void method81() {
		while (true) {
			@Pc(15) Class2 local15 = this.aClass2_9.aClass2_128;
			if (this.aClass2_9 == local15) {
				return;
			}
			local15.method2209();
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Lclient!ca;")
	public Class2 method82() {
		@Pc(15) Class2 local15 = this.aClass2_9.aClass2_128;
		if (this.aClass2_9 == local15) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local15.aClass2_128;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BLclient!ca;)V")
	public void method84(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_127 != null) {
			arg0.method2209();
		}
		arg0.aClass2_128 = this.aClass2_9.aClass2_128;
		arg0.aClass2_127 = this.aClass2_9;
		arg0.aClass2_127.aClass2_128 = arg0;
		arg0.aClass2_128.aClass2_127 = arg0;
	}
}
