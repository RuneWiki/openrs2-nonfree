import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class63 {

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!nn;")
	private Class111 aClass111_2;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "Lclient!nn;")
	private final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	public Class63() {
		this.aClass111_1.aClass111_26 = this.aClass111_1;
		this.aClass111_1.aClass111_25 = this.aClass111_1;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lclient!nn;")
	public Class111 method1016() {
		@Pc(12) Class111 local12 = this.aClass111_1.aClass111_25;
		if (local12 == this.aClass111_1) {
			return null;
		} else {
			local12.method5886();
			return local12;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Z")
	public boolean method1018() {
		return this.aClass111_1.aClass111_25 == this.aClass111_1;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)Lclient!nn;")
	public Class111 method1019() {
		@Pc(7) Class111 local7 = this.aClass111_1.aClass111_25;
		if (local7 == this.aClass111_1) {
			this.aClass111_2 = null;
			return null;
		} else {
			this.aClass111_2 = local7.aClass111_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)I")
	public int method1021() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class111 local11 = this.aClass111_1.aClass111_25;
		while (local11 != this.aClass111_1) {
			local11 = local11.aClass111_25;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)Lclient!nn;")
	public Class111 method1022() {
		@Pc(13) Class111 local13 = this.aClass111_2;
		if (local13 == this.aClass111_1) {
			this.aClass111_2 = null;
			return null;
		} else {
			this.aClass111_2 = local13.aClass111_25;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)Lclient!nn;")
	public Class111 method1023() {
		@Pc(12) Class111 local12 = this.aClass111_1.aClass111_26;
		if (local12 == this.aClass111_1) {
			this.aClass111_2 = null;
			return null;
		} else {
			this.aClass111_2 = local12.aClass111_26;
			return local12;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!nn;)V")
	public void method1024(@OriginalArg(1) Class111 arg0) {
		if (arg0.aClass111_26 != null) {
			arg0.method5886();
		}
		arg0.aClass111_25 = this.aClass111_1;
		arg0.aClass111_26 = this.aClass111_1.aClass111_26;
		arg0.aClass111_26.aClass111_25 = arg0;
		arg0.aClass111_25.aClass111_26 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
	public void method1025() {
		while (true) {
			@Pc(9) Class111 local9 = this.aClass111_1.aClass111_25;
			if (this.aClass111_1 == local9) {
				this.aClass111_2 = null;
				return;
			}
			local9.method5886();
		}
	}
}
