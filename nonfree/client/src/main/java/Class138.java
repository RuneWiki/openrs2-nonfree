import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class138 {

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Lclient!ah;")
	private Class3 aClass3_138;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "Lclient!ah;")
	public final Class3 aClass3_137 = new Class3();

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	public Class138() {
		this.aClass3_137.aClass3_243 = this.aClass3_137;
		this.aClass3_137.aClass3_244 = this.aClass3_137;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public void method3046() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_137.aClass3_243;
			if (local5 == this.aClass3_137) {
				this.aClass3_138 = null;
				return;
			}
			local5.method5700();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lclient!ah;")
	public Class3 method3047() {
		@Pc(12) Class3 local12 = this.aClass3_137.aClass3_243;
		if (local12 == this.aClass3_137) {
			return null;
		} else {
			local12.method5700();
			return local12;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!kr;I)V")
	public void method3048(@OriginalArg(0) Class138 arg0) {
		this.method3052(arg0, this.aClass3_137.aClass3_243);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Lclient!ah;")
	public Class3 method3050() {
		@Pc(13) Class3 local13 = this.aClass3_138;
		if (this.aClass3_137 == local13) {
			this.aClass3_138 = null;
			return null;
		} else {
			this.aClass3_138 = local13.aClass3_243;
			return local13;
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Lclient!ah;")
	public Class3 method3051() {
		@Pc(12) Class3 local12 = this.aClass3_137.aClass3_243;
		if (this.aClass3_137 == local12) {
			this.aClass3_138 = null;
			return null;
		} else {
			this.aClass3_138 = local12.aClass3_243;
			return local12;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLclient!kr;Lclient!ah;)V")
	private void method3052(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(15) Class3 local15 = this.aClass3_137.aClass3_244;
		this.aClass3_137.aClass3_244 = arg1.aClass3_244;
		arg1.aClass3_244.aClass3_243 = this.aClass3_137;
		if (this.aClass3_137 != arg1) {
			arg1.aClass3_244 = arg0.aClass3_137.aClass3_244;
			arg1.aClass3_244.aClass3_243 = arg1;
			local15.aClass3_243 = arg0.aClass3_137;
			arg0.aClass3_137.aClass3_244 = local15;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ah;B)V")
	public void method3053(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_244 != null) {
			arg0.method5700();
		}
		arg0.aClass3_244 = this.aClass3_137.aClass3_244;
		arg0.aClass3_243 = this.aClass3_137;
		arg0.aClass3_244.aClass3_243 = arg0;
		arg0.aClass3_243.aClass3_244 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ah;I)V")
	public void method3054(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_244 != null) {
			arg0.method5700();
		}
		arg0.aClass3_243 = this.aClass3_137.aClass3_243;
		arg0.aClass3_244 = this.aClass3_137;
		arg0.aClass3_244.aClass3_243 = arg0;
		arg0.aClass3_243.aClass3_244 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)Lclient!ah;")
	public Class3 method3055() {
		@Pc(12) Class3 local12 = this.aClass3_137.aClass3_244;
		if (this.aClass3_137 == local12) {
			this.aClass3_138 = null;
			return null;
		} else {
			this.aClass3_138 = local12.aClass3_244;
			return local12;
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)Lclient!ah;")
	public Class3 method3057() {
		@Pc(6) Class3 local6 = this.aClass3_138;
		if (this.aClass3_137 == local6) {
			this.aClass3_138 = null;
			return null;
		} else {
			this.aClass3_138 = local6.aClass3_244;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)I")
	public int method3058() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3 local11 = this.aClass3_137.aClass3_243;
		while (this.aClass3_137 != local11) {
			local11 = local11.aClass3_243;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)Z")
	public boolean method3059() {
		return this.aClass3_137.aClass3_243 == this.aClass3_137;
	}
}
