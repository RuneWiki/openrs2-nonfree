import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class30 {

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!o;")
	private Class1 aClass1_90;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!o;")
	public final Class1 aClass1_89 = new Class1();

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class30() {
		this.aClass1_89.aClass1_216 = this.aClass1_89;
		this.aClass1_89.aClass1_215 = this.aClass1_89;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!o;)V")
	public void method1113(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_216 != null) {
			arg0.method3134();
		}
		arg0.aClass1_215 = this.aClass1_89;
		arg0.aClass1_216 = this.aClass1_89.aClass1_216;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!o;)V")
	public void method1114(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_216 != null) {
			arg0.method3134();
		}
		arg0.aClass1_216 = this.aClass1_89;
		arg0.aClass1_215 = this.aClass1_89.aClass1_215;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lclient!o;")
	public Class1 method1115() {
		@Pc(3) Class1 local3 = this.aClass1_89.aClass1_215;
		if (this.aClass1_89 == local3) {
			this.aClass1_90 = null;
			return null;
		} else {
			this.aClass1_90 = local3.aClass1_215;
			return local3;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!o;Lclient!o;I)V")
	public void method1117(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_216 != null) {
			arg0.method3134();
		}
		arg0.aClass1_216 = arg1.aClass1_216;
		arg0.aClass1_215 = arg1;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public void method1118() {
		while (true) {
			@Pc(12) Class1 local12 = this.aClass1_89.aClass1_215;
			if (this.aClass1_89 == local12) {
				return;
			}
			local12.method3134();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lclient!o;")
	public Class1 method1119() {
		@Pc(13) Class1 local13 = this.aClass1_90;
		if (this.aClass1_89 == local13) {
			this.aClass1_90 = null;
			return null;
		} else {
			this.aClass1_90 = local13.aClass1_216;
			return local13;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Lclient!o;")
	public Class1 method1122() {
		@Pc(12) Class1 local12 = this.aClass1_89.aClass1_215;
		if (this.aClass1_89 == local12) {
			return null;
		} else {
			local12.method3134();
			return local12;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)Lclient!o;")
	public Class1 method1123() {
		@Pc(14) Class1 local14 = this.aClass1_89.aClass1_216;
		if (this.aClass1_89 == local14) {
			this.aClass1_90 = null;
			return null;
		} else {
			this.aClass1_90 = local14.aClass1_216;
			return local14;
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Lclient!o;")
	public Class1 method1125() {
		@Pc(2) Class1 local2 = this.aClass1_90;
		if (this.aClass1_89 == local2) {
			this.aClass1_90 = null;
			return null;
		} else {
			this.aClass1_90 = local2.aClass1_215;
			return local2;
		}
	}
}
