import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class8 {

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "Lclient!bf;")
	private Class26 aClass26_2;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Lclient!bf;")
	private final Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	public Class8() {
		this.aClass26_1.aClass26_26 = this.aClass26_1;
		this.aClass26_1.aClass26_25 = this.aClass26_1;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)I")
	public int method105() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class26 local17 = this.aClass26_1.aClass26_26;
		while (local17 != this.aClass26_1) {
			local17 = local17.aClass26_26;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
	public void method106() {
		while (true) {
			@Pc(16) Class26 local16 = this.aClass26_1.aClass26_26;
			if (local16 == this.aClass26_1) {
				this.aClass26_2 = null;
				return;
			}
			local16.method7575();
		}
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)Lclient!bf;")
	public Class26 method107() {
		@Pc(7) Class26 local7 = this.aClass26_1.aClass26_25;
		if (local7 == this.aClass26_1) {
			this.aClass26_2 = null;
			return null;
		} else {
			this.aClass26_2 = local7.aClass26_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!bf;Z)V")
	public void method109(@OriginalArg(0) Class26 arg0) {
		if (arg0.aClass26_25 != null) {
			arg0.method7575();
		}
		arg0.aClass26_26 = this.aClass26_1;
		arg0.aClass26_25 = this.aClass26_1.aClass26_25;
		arg0.aClass26_25.aClass26_26 = arg0;
		arg0.aClass26_26.aClass26_25 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)Lclient!bf;")
	public Class26 method110() {
		@Pc(7) Class26 local7 = this.aClass26_1.aClass26_26;
		if (local7 == this.aClass26_1) {
			this.aClass26_2 = null;
			return null;
		} else {
			this.aClass26_2 = local7.aClass26_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Lclient!bf;")
	public Class26 method111() {
		@Pc(12) Class26 local12 = this.aClass26_1.aClass26_26;
		if (local12 == this.aClass26_1) {
			return null;
		} else {
			local12.method7575();
			return local12;
		}
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)Z")
	public boolean method112() {
		return this.aClass26_1 == this.aClass26_1.aClass26_26;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)Lclient!bf;")
	public Class26 method113() {
		@Pc(14) Class26 local14 = this.aClass26_2;
		if (local14 == this.aClass26_1) {
			this.aClass26_2 = null;
			return null;
		} else {
			this.aClass26_2 = local14.aClass26_26;
			return local14;
		}
	}
}
