import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class44 {

	@OriginalMember(owner = "client!he", name = "w", descriptor = "Lclient!lf;")
	private Class2 aClass2_84;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!lf;")
	public Class2 aClass2_83 = new Class2();

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class44() {
		this.aClass2_83.aClass2_220 = this.aClass2_83;
		this.aClass2_83.aClass2_219 = this.aClass2_83;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!lf;)V")
	public void method1354(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_220 != null) {
			arg0.method3986();
		}
		arg0.aClass2_219 = this.aClass2_83.aClass2_219;
		arg0.aClass2_220 = this.aClass2_83;
		arg0.aClass2_220.aClass2_219 = arg0;
		arg0.aClass2_219.aClass2_220 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!lf;)V")
	public void method1355(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_220 != null) {
			arg0.method3986();
		}
		arg0.aClass2_219 = this.aClass2_83;
		arg0.aClass2_220 = this.aClass2_83.aClass2_220;
		arg0.aClass2_220.aClass2_219 = arg0;
		arg0.aClass2_219.aClass2_220 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lclient!lf;")
	public Class2 method1356() {
		@Pc(6) Class2 local6 = this.aClass2_84;
		if (this.aClass2_83 == local6) {
			this.aClass2_84 = null;
			return null;
		} else {
			this.aClass2_84 = local6.aClass2_219;
			return local6;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!lf;Lclient!lf;)V")
	public void method1358(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_220 != null) {
			arg0.method3986();
		}
		arg0.aClass2_219 = arg1;
		arg0.aClass2_220 = arg1.aClass2_220;
		arg0.aClass2_220.aClass2_219 = arg0;
		arg0.aClass2_219.aClass2_220 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Lclient!lf;")
	public Class2 method1359() {
		@Pc(13) Class2 local13 = this.aClass2_83.aClass2_219;
		if (this.aClass2_83 == local13) {
			this.aClass2_84 = null;
			return null;
		} else {
			this.aClass2_84 = local13.aClass2_219;
			return local13;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Lclient!lf;")
	public Class2 method1360() {
		@Pc(6) Class2 local6 = this.aClass2_84;
		if (this.aClass2_83 == local6) {
			this.aClass2_84 = null;
			return null;
		} else {
			this.aClass2_84 = local6.aClass2_220;
			return local6;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public void method1362() {
		while (true) {
			@Pc(7) Class2 local7 = this.aClass2_83.aClass2_219;
			if (this.aClass2_83 == local7) {
				this.aClass2_84 = null;
				return;
			}
			local7.method3986();
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	public int method1364() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class2 local16 = this.aClass2_83.aClass2_219; local16 != this.aClass2_83; local16 = local16.aClass2_219) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Lclient!lf;")
	public Class2 method1365() {
		@Pc(3) Class2 local3 = this.aClass2_83.aClass2_219;
		if (local3 == this.aClass2_83) {
			return null;
		} else {
			local3.method3986();
			return local3;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)Lclient!lf;")
	public Class2 method1366() {
		@Pc(11) Class2 local11 = this.aClass2_83.aClass2_220;
		if (local11 == this.aClass2_83) {
			this.aClass2_84 = null;
			return null;
		} else {
			this.aClass2_84 = local11.aClass2_220;
			return local11;
		}
	}
}
