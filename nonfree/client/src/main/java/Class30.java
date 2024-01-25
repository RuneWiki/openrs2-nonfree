import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class30 {

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!rs;")
	private Class2 aClass2_42;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!rs;")
	public final Class2 aClass2_41 = new Class2();

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class30() {
		this.aClass2_41.aClass2_244 = this.aClass2_41;
		this.aClass2_41.aClass2_243 = this.aClass2_41;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!rs;")
	public Class2 method682() {
		@Pc(11) Class2 local11 = this.aClass2_42;
		if (this.aClass2_41 == local11) {
			this.aClass2_42 = null;
			return null;
		} else {
			this.aClass2_42 = local11.aClass2_243;
			return local11;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z")
	public boolean method684() {
		return this.aClass2_41.aClass2_243 == this.aClass2_41;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!rs;I)V")
	public void method685(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_244 != null) {
			arg0.method5617();
		}
		arg0.aClass2_243 = this.aClass2_41;
		arg0.aClass2_244 = this.aClass2_41.aClass2_244;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Lclient!rs;")
	public Class2 method686() {
		@Pc(6) Class2 local6 = this.aClass2_42;
		if (this.aClass2_41 == local6) {
			this.aClass2_42 = null;
			return null;
		} else {
			this.aClass2_42 = local6.aClass2_244;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)I")
	public int method687() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class2 local16 = this.aClass2_41.aClass2_243; local16 != this.aClass2_41; local16 = local16.aClass2_243) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public void method692() {
		while (true) {
			@Pc(3) Class2 local3 = this.aClass2_41.aClass2_243;
			if (local3 == this.aClass2_41) {
				this.aClass2_42 = null;
				return;
			}
			local3.method5617();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!rs;B)V")
	public void method693(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_244 != null) {
			arg0.method5617();
		}
		arg0.aClass2_243 = this.aClass2_41.aClass2_243;
		arg0.aClass2_244 = this.aClass2_41;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Lclient!rs;")
	public Class2 method694() {
		@Pc(7) Class2 local7 = this.aClass2_41.aClass2_243;
		if (local7 == this.aClass2_41) {
			this.aClass2_42 = null;
			return null;
		} else {
			this.aClass2_42 = local7.aClass2_243;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lclient!rs;")
	public Class2 method695() {
		@Pc(15) Class2 local15 = this.aClass2_41.aClass2_243;
		if (local15 == this.aClass2_41) {
			return null;
		} else {
			local15.method5617();
			return local15;
		}
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Lclient!rs;")
	public Class2 method696() {
		@Pc(7) Class2 local7 = this.aClass2_41.aClass2_244;
		if (local7 == this.aClass2_41) {
			this.aClass2_42 = null;
			return null;
		} else {
			this.aClass2_42 = local7.aClass2_244;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!cf;)V")
	public void method697(@OriginalArg(1) Class30 arg0) {
		this.method698(arg0, this.aClass2_41.aClass2_243);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!cf;ILclient!rs;)V")
	private void method698(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_41.aClass2_244;
		this.aClass2_41.aClass2_244 = arg1.aClass2_244;
		arg1.aClass2_244.aClass2_243 = this.aClass2_41;
		if (this.aClass2_41 != arg1) {
			arg1.aClass2_244 = arg0.aClass2_41.aClass2_244;
			arg1.aClass2_244.aClass2_243 = arg1;
			local7.aClass2_243 = arg0.aClass2_41;
			arg0.aClass2_41.aClass2_244 = local7;
		}
	}
}
