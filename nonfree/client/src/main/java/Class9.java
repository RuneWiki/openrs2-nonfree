import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class9 {

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Lclient!dc;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!dc;")
	public final Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class9() {
		this.aClass10_1.aClass10_94 = this.aClass10_1;
		this.aClass10_1.aClass10_93 = this.aClass10_1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!dc;")
	public Class10 method70() {
		@Pc(3) Class10 local3 = this.aClass10_1.aClass10_93;
		if (local3 == this.aClass10_1) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local3.aClass10_93;
			return local3;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!dc;")
	public Class10 method72() {
		@Pc(3) Class10 local3 = this.aClass10_1.aClass10_94;
		if (local3 == this.aClass10_1) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local3.aClass10_94;
			return local3;
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Lclient!dc;")
	public Class10 method75() {
		@Pc(7) Class10 local7 = this.aClass10_1.aClass10_93;
		if (local7 == this.aClass10_1) {
			return null;
		} else {
			local7.method1654();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method78(@OriginalArg(0) Class10 arg0) {
		if (arg0.aClass10_93 != null) {
			arg0.method1654();
		}
		arg0.aClass10_94 = this.aClass10_1.aClass10_94;
		arg0.aClass10_93 = this.aClass10_1;
		arg0.aClass10_93.aClass10_94 = arg0;
		arg0.aClass10_94.aClass10_93 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method79(@OriginalArg(0) Class10 arg0) {
		if (arg0.aClass10_93 != null) {
			arg0.method1654();
		}
		arg0.aClass10_94 = this.aClass10_1;
		arg0.aClass10_93 = this.aClass10_1.aClass10_93;
		arg0.aClass10_93.aClass10_94 = arg0;
		arg0.aClass10_94.aClass10_93 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!dc;Lclient!dc;)V")
	public void method80(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		if (arg0.aClass10_93 != null) {
			arg0.method1654();
		}
		arg0.aClass10_94 = arg1;
		arg0.aClass10_93 = arg1.aClass10_93;
		arg0.aClass10_93.aClass10_94 = arg0;
		arg0.aClass10_94.aClass10_93 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!dc;")
	public Class10 method81() {
		@Pc(2) Class10 local2 = this.aClass10_2;
		if (this.aClass10_1 == local2) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local2.aClass10_94;
			return local2;
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public void method82() {
		while (true) {
			@Pc(14) Class10 local14 = this.aClass10_1.aClass10_94;
			if (local14 == this.aClass10_1) {
				return;
			}
			local14.method1654();
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Lclient!dc;")
	public Class10 method83() {
		@Pc(7) Class10 local7 = this.aClass10_1.aClass10_94;
		if (local7 == this.aClass10_1) {
			return null;
		} else {
			local7.method1654();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Lclient!dc;")
	public Class10 method84() {
		@Pc(12) Class10 local12 = this.aClass10_2;
		if (this.aClass10_1 == local12) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local12.aClass10_93;
			return local12;
		}
	}
}
