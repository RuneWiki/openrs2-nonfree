import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class58 {

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!ob;")
	private Class5 aClass5_100;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!ob;")
	public final Class5 aClass5_99 = new Class5();

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class58() {
		this.aClass5_99.aClass5_127 = this.aClass5_99;
		this.aClass5_99.aClass5_128 = this.aClass5_99;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Lclient!ob;")
	public Class5 method1659() {
		@Pc(6) Class5 local6 = this.aClass5_100;
		if (local6 == this.aClass5_99) {
			this.aClass5_100 = null;
			return null;
		} else {
			this.aClass5_100 = local6.aClass5_128;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Lclient!ob;")
	public Class5 method1661() {
		@Pc(15) Class5 local15 = this.aClass5_99.aClass5_128;
		if (this.aClass5_99 == local15) {
			return null;
		} else {
			local15.method2189();
			return local15;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ob;I)V")
	public void method1663(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_128 != null) {
			arg0.method2189();
		}
		arg0.aClass5_128 = this.aClass5_99.aClass5_128;
		arg0.aClass5_127 = this.aClass5_99;
		arg0.aClass5_128.aClass5_127 = arg0;
		arg0.aClass5_127.aClass5_128 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!ob;")
	public Class5 method1664() {
		@Pc(2) Class5 local2 = this.aClass5_100;
		if (this.aClass5_99 == local2) {
			this.aClass5_100 = null;
			return null;
		} else {
			this.aClass5_100 = local2.aClass5_127;
			return local2;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lclient!ob;")
	public Class5 method1666() {
		@Pc(15) Class5 local15 = this.aClass5_99.aClass5_128;
		if (this.aClass5_99 == local15) {
			this.aClass5_100 = null;
			return null;
		} else {
			this.aClass5_100 = local15.aClass5_128;
			return local15;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method1668() {
		while (true) {
			@Pc(13) Class5 local13 = this.aClass5_99.aClass5_127;
			if (this.aClass5_99 == local13) {
				return;
			}
			local13.method2189();
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lclient!ob;")
	public Class5 method1669() {
		@Pc(3) Class5 local3 = this.aClass5_99.aClass5_127;
		if (local3 == this.aClass5_99) {
			this.aClass5_100 = null;
			return null;
		} else {
			this.aClass5_100 = local3.aClass5_127;
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)Lclient!ob;")
	public Class5 method1670() {
		@Pc(7) Class5 local7 = this.aClass5_99.aClass5_127;
		if (this.aClass5_99 == local7) {
			return null;
		} else {
			local7.method2189();
			return local7;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ob;Lclient!ob;)V")
	public void method1672(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0.aClass5_128 != null) {
			arg0.method2189();
		}
		arg0.aClass5_128 = arg1.aClass5_128;
		arg0.aClass5_127 = arg1;
		arg0.aClass5_128.aClass5_127 = arg0;
		arg0.aClass5_127.aClass5_128 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ob;)V")
	public void method1674(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_128 != null) {
			arg0.method2189();
		}
		arg0.aClass5_128 = this.aClass5_99;
		arg0.aClass5_127 = this.aClass5_99.aClass5_127;
		arg0.aClass5_128.aClass5_127 = arg0;
		arg0.aClass5_127.aClass5_128 = arg0;
	}
}
