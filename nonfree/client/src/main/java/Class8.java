import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class8 {

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!aa;")
	private Class2 aClass2_12;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!aa;")
	public final Class2 aClass2_11 = new Class2();

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class8() {
		this.aClass2_11.aClass2_104 = this.aClass2_11;
		this.aClass2_11.aClass2_103 = this.aClass2_11;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!aa;")
	public Class2 method173() {
		@Pc(7) Class2 local7 = this.aClass2_12;
		if (local7 == this.aClass2_11) {
			this.aClass2_12 = null;
			return null;
		} else {
			this.aClass2_12 = local7.aClass2_104;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!aa;")
	public Class2 method175() {
		@Pc(8) Class2 local8 = this.aClass2_11.aClass2_104;
		if (local8 == this.aClass2_11) {
			this.aClass2_12 = null;
			return null;
		} else {
			this.aClass2_12 = local8.aClass2_104;
			return local8;
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!aa;")
	public Class2 method176() {
		@Pc(11) Class2 local11 = this.aClass2_12;
		if (local11 == this.aClass2_11) {
			this.aClass2_12 = null;
			return null;
		} else {
			this.aClass2_12 = local11.aClass2_103;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lclient!aa;")
	public Class2 method178() {
		@Pc(12) Class2 local12 = this.aClass2_11.aClass2_103;
		if (local12 == this.aClass2_11) {
			return null;
		} else {
			local12.method2073();
			return local12;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public void method179() {
		while (true) {
			@Pc(14) Class2 local14 = this.aClass2_11.aClass2_104;
			if (local14 == this.aClass2_11) {
				return;
			}
			local14.method2073();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Lclient!aa;")
	public Class2 method185() {
		@Pc(7) Class2 local7 = this.aClass2_11.aClass2_103;
		if (local7 == this.aClass2_11) {
			this.aClass2_12 = null;
			return null;
		} else {
			this.aClass2_12 = local7.aClass2_103;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!aa;ILclient!aa;)V")
	public void method186(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_103 != null) {
			arg1.method2073();
		}
		arg1.aClass2_103 = arg0.aClass2_103;
		arg1.aClass2_104 = arg0;
		arg1.aClass2_103.aClass2_104 = arg1;
		arg1.aClass2_104.aClass2_103 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!aa;)V")
	public void method187(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_103 != null) {
			arg0.method2073();
		}
		arg0.aClass2_104 = this.aClass2_11;
		arg0.aClass2_103 = this.aClass2_11.aClass2_103;
		arg0.aClass2_103.aClass2_104 = arg0;
		arg0.aClass2_104.aClass2_103 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!aa;)V")
	public void method188(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_103 != null) {
			arg0.method2073();
		}
		arg0.aClass2_104 = this.aClass2_11.aClass2_104;
		arg0.aClass2_103 = this.aClass2_11;
		arg0.aClass2_103.aClass2_104 = arg0;
		arg0.aClass2_104.aClass2_103 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Lclient!aa;")
	public Class2 method189() {
		@Pc(13) Class2 local13 = this.aClass2_11.aClass2_104;
		if (this.aClass2_11 == local13) {
			return null;
		} else {
			local13.method2073();
			return local13;
		}
	}
}
