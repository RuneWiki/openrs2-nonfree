import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class43 {

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Lclient!mc;")
	private Class8 aClass8_38;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Lclient!mc;")
	public final Class8 aClass8_37 = new Class8();

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class43() {
		this.aClass8_37.aClass8_299 = this.aClass8_37;
		this.aClass8_37.aClass8_300 = this.aClass8_37;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)Z")
	public boolean method1420() {
		return this.aClass8_37 == this.aClass8_37.aClass8_300;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Lclient!mc;")
	public Class8 method1421() {
		@Pc(12) Class8 local12 = this.aClass8_37.aClass8_299;
		if (this.aClass8_37 == local12) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local12.aClass8_299;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Lclient!mc;")
	public Class8 method1422() {
		@Pc(7) Class8 local7 = this.aClass8_37.aClass8_300;
		if (this.aClass8_37 == local7) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local7.aClass8_300;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLclient!mc;)V")
	public void method1424(@OriginalArg(1) Class8 arg0) {
		if (arg0.aClass8_299 != null) {
			arg0.method8640();
		}
		arg0.aClass8_299 = this.aClass8_37.aClass8_299;
		arg0.aClass8_300 = this.aClass8_37;
		arg0.aClass8_299.aClass8_300 = arg0;
		arg0.aClass8_300.aClass8_299 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)Lclient!mc;")
	public Class8 method1426() {
		@Pc(11) Class8 local11 = this.aClass8_38;
		if (this.aClass8_37 == local11) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local11.aClass8_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!bq;I)V")
	public void method1427(@OriginalArg(0) Class43 arg0) {
		this.method1428(arg0, this.aClass8_37.aClass8_300);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!bq;ILclient!mc;)V")
	private void method1428(@OriginalArg(0) Class43 arg0, @OriginalArg(2) Class8 arg1) {
		@Pc(11) Class8 local11 = this.aClass8_37.aClass8_299;
		this.aClass8_37.aClass8_299 = arg1.aClass8_299;
		arg1.aClass8_299.aClass8_300 = this.aClass8_37;
		if (arg1 != this.aClass8_37) {
			arg1.aClass8_299 = arg0.aClass8_37.aClass8_299;
			arg1.aClass8_299.aClass8_300 = arg1;
			local11.aClass8_300 = arg0.aClass8_37;
			arg0.aClass8_37.aClass8_299 = local11;
		}
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)I")
	public int method1430() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class8 local11 = this.aClass8_37.aClass8_300;
		while (local11 != this.aClass8_37) {
			local11 = local11.aClass8_300;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V")
	public void method1431() {
		while (true) {
			@Pc(5) Class8 local5 = this.aClass8_37.aClass8_300;
			if (this.aClass8_37 == local5) {
				this.aClass8_38 = null;
				return;
			}
			local5.method8640();
		}
	}

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)Lclient!mc;")
	public Class8 method1432() {
		@Pc(13) Class8 local13 = this.aClass8_37.aClass8_300;
		if (local13 == this.aClass8_37) {
			return null;
		} else {
			local13.method8640();
			return local13;
		}
	}

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)Lclient!mc;")
	public Class8 method1433() {
		@Pc(6) Class8 local6 = this.aClass8_38;
		if (local6 == this.aClass8_37) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local6.aClass8_299;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method1434(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_299 != null) {
			arg0.method8640();
		}
		arg0.aClass8_300 = this.aClass8_37.aClass8_300;
		arg0.aClass8_299 = this.aClass8_37;
		arg0.aClass8_299.aClass8_300 = arg0;
		arg0.aClass8_300.aClass8_299 = arg0;
	}
}
