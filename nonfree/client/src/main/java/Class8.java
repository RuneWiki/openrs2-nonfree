import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class8 {

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!d;")
	private Class2 aClass2_10;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!d;")
	public final Class2 aClass2_9 = new Class2();

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class8() {
		this.aClass2_9.aClass2_285 = this.aClass2_9;
		this.aClass2_9.aClass2_286 = this.aClass2_9;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!d;B)V")
	public void method209(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_285 != null) {
			arg0.method7966();
		}
		arg0.aClass2_285 = this.aClass2_9;
		arg0.aClass2_286 = this.aClass2_9.aClass2_286;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Lclient!d;")
	public Class2 method210() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_286;
		if (this.aClass2_9 == local7) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local7.aClass2_286;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lclient!d;B)V")
	public void method212(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_285 != null) {
			arg0.method7966();
		}
		arg0.aClass2_286 = this.aClass2_9;
		arg0.aClass2_285 = this.aClass2_9.aClass2_285;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I")
	public int method214() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2 local11 = this.aClass2_9.aClass2_286;
		while (this.aClass2_9 != local11) {
			local11 = local11.aClass2_286;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!d;BLclient!ae;)V")
	private void method215(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class8 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_285;
		this.aClass2_9.aClass2_285 = arg0.aClass2_285;
		arg0.aClass2_285.aClass2_286 = this.aClass2_9;
		if (arg0 != this.aClass2_9) {
			arg0.aClass2_285 = arg1.aClass2_9.aClass2_285;
			arg0.aClass2_285.aClass2_286 = arg0;
			local7.aClass2_286 = arg1.aClass2_9;
			arg1.aClass2_9.aClass2_285 = local7;
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Lclient!d;")
	public Class2 method216() {
		@Pc(6) Class2 local6 = this.aClass2_10;
		if (local6 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local6.aClass2_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lclient!d;")
	public Class2 method217() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_286;
		if (local7 == this.aClass2_9) {
			return null;
		} else {
			local7.method7966();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Lclient!d;")
	public Class2 method218() {
		@Pc(13) Class2 local13 = this.aClass2_10;
		if (local13 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local13.aClass2_286;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Z")
	public boolean method219() {
		return this.aClass2_9 == this.aClass2_9.aClass2_286;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	public void method220() {
		while (true) {
			@Pc(9) Class2 local9 = this.aClass2_9.aClass2_286;
			if (this.aClass2_9 == local9) {
				this.aClass2_10 = null;
				return;
			}
			local9.method7966();
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)Lclient!d;")
	public Class2 method221() {
		@Pc(12) Class2 local12 = this.aClass2_9.aClass2_285;
		if (local12 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local12.aClass2_285;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!ae;)V")
	public void method222(@OriginalArg(1) Class8 arg0) {
		this.method215(this.aClass2_9.aClass2_286, arg0);
	}
}
