import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class105 {

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!dh;")
	private Class1 aClass1_166;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!dh;")
	public Class1 aClass1_165 = new Class1();

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class105() {
		this.aClass1_165.aClass1_201 = this.aClass1_165;
		this.aClass1_165.aClass1_202 = this.aClass1_165;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!dh;")
	public Class1 method3109() {
		@Pc(2) Class1 local2 = this.aClass1_166;
		if (local2 == this.aClass1_165) {
			this.aClass1_166 = null;
			return null;
		} else {
			this.aClass1_166 = local2.aClass1_202;
			return local2;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I")
	public int method3110() {
		@Pc(7) int local7 = 0;
		@Pc(19) Class1 local19 = this.aClass1_165.aClass1_202;
		while (local19 != this.aClass1_165) {
			local19 = local19.aClass1_202;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!dh;")
	public Class1 method3111() {
		@Pc(11) Class1 local11 = this.aClass1_166;
		if (this.aClass1_165 == local11) {
			this.aClass1_166 = null;
			return null;
		} else {
			this.aClass1_166 = local11.aClass1_201;
			return local11;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Lclient!dh;")
	public Class1 method3112() {
		@Pc(7) Class1 local7 = this.aClass1_165.aClass1_201;
		if (this.aClass1_165 == local7) {
			this.aClass1_166 = null;
			return null;
		} else {
			this.aClass1_166 = local7.aClass1_201;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public void method3114() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_165.aClass1_202;
			if (local9 == this.aClass1_165) {
				this.aClass1_166 = null;
				return;
			}
			local9.method3758();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method3116(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_201 != null) {
			arg0.method3758();
		}
		arg0.aClass1_201 = this.aClass1_165;
		arg0.aClass1_202 = this.aClass1_165.aClass1_202;
		arg0.aClass1_201.aClass1_202 = arg0;
		arg0.aClass1_202.aClass1_201 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lclient!dh;")
	public Class1 method3117() {
		@Pc(11) Class1 local11 = this.aClass1_165.aClass1_202;
		if (this.aClass1_165 == local11) {
			return null;
		} else {
			local11.method3758();
			return local11;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!dh;ZLclient!dh;)V")
	public void method3118(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_201 != null) {
			arg1.method3758();
		}
		arg1.aClass1_201 = arg0.aClass1_201;
		arg1.aClass1_202 = arg0;
		arg1.aClass1_201.aClass1_202 = arg1;
		arg1.aClass1_202.aClass1_201 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Lclient!dh;I)V")
	public void method3119(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_201 != null) {
			arg0.method3758();
		}
		arg0.aClass1_202 = this.aClass1_165;
		arg0.aClass1_201 = this.aClass1_165.aClass1_201;
		arg0.aClass1_201.aClass1_202 = arg0;
		arg0.aClass1_202.aClass1_201 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Lclient!dh;")
	public Class1 method3120() {
		@Pc(7) Class1 local7 = this.aClass1_165.aClass1_202;
		if (this.aClass1_165 == local7) {
			this.aClass1_166 = null;
			return null;
		} else {
			this.aClass1_166 = local7.aClass1_202;
			return local7;
		}
	}
}
