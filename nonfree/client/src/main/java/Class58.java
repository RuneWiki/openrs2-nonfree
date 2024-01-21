import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class58 {

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Lclient!o;")
	private Class2 aClass2_78;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!o;")
	public final Class2 aClass2_77 = new Class2();

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class58() {
		this.aClass2_77.aClass2_116 = this.aClass2_77;
		this.aClass2_77.aClass2_115 = this.aClass2_77;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lclient!o;")
	public Class2 method1281() {
		@Pc(2) Class2 local2 = this.aClass2_78;
		if (local2 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local2.aClass2_115;
			return local2;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Lclient!o;")
	public Class2 method1285() {
		@Pc(12) Class2 local12 = this.aClass2_77.aClass2_115;
		if (local12 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local12.aClass2_115;
			return local12;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!o;")
	public Class2 method1286() {
		@Pc(12) Class2 local12 = this.aClass2_77.aClass2_116;
		if (local12 == this.aClass2_77) {
			return null;
		} else {
			local12.method1961();
			return local12;
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)Lclient!o;")
	public Class2 method1288() {
		@Pc(6) Class2 local6 = this.aClass2_78;
		if (this.aClass2_77 == local6) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local6.aClass2_116;
			return local6;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!o;)V")
	public void method1289(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_116 != null) {
			arg0.method1961();
		}
		arg0.aClass2_115 = this.aClass2_77.aClass2_115;
		arg0.aClass2_116 = this.aClass2_77;
		arg0.aClass2_116.aClass2_115 = arg0;
		arg0.aClass2_115.aClass2_116 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!o;ILclient!o;)V")
	public void method1290(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_116 != null) {
			arg0.method1961();
		}
		arg0.aClass2_115 = arg1;
		arg0.aClass2_116 = arg1.aClass2_116;
		arg0.aClass2_116.aClass2_115 = arg0;
		arg0.aClass2_115.aClass2_116 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Lclient!o;")
	public Class2 method1291() {
		@Pc(7) Class2 local7 = this.aClass2_77.aClass2_115;
		if (local7 == this.aClass2_77) {
			return null;
		} else {
			local7.method1961();
			return local7;
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public void method1292() {
		while (true) {
			@Pc(14) Class2 local14 = this.aClass2_77.aClass2_115;
			if (this.aClass2_77 == local14) {
				return;
			}
			local14.method1961();
		}
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)Lclient!o;")
	public Class2 method1293() {
		@Pc(3) Class2 local3 = this.aClass2_77.aClass2_116;
		if (local3 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local3.aClass2_116;
			return local3;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!o;I)V")
	public void method1294(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_116 != null) {
			arg0.method1961();
		}
		arg0.aClass2_116 = this.aClass2_77.aClass2_116;
		arg0.aClass2_115 = this.aClass2_77;
		arg0.aClass2_116.aClass2_115 = arg0;
		arg0.aClass2_115.aClass2_116 = arg0;
	}
}
