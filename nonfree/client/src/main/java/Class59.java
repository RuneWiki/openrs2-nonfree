import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class59 {

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Lclient!kh;")
	private Class1 aClass1_150;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!kh;")
	public final Class1 aClass1_149 = new Class1();

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aClass1_149.aClass1_207 = this.aClass1_149;
		this.aClass1_149.aClass1_208 = this.aClass1_149;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!kh;)V")
	public void method2411(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_208 != null) {
			arg0.method3198();
		}
		arg0.aClass1_207 = this.aClass1_149;
		arg0.aClass1_208 = this.aClass1_149.aClass1_208;
		arg0.aClass1_208.aClass1_207 = arg0;
		arg0.aClass1_207.aClass1_208 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!kh;)V")
	public void method2412(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_208 != null) {
			arg0.method3198();
		}
		arg0.aClass1_207 = this.aClass1_149.aClass1_207;
		arg0.aClass1_208 = this.aClass1_149;
		arg0.aClass1_208.aClass1_207 = arg0;
		arg0.aClass1_207.aClass1_208 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!kh;Lclient!kh;B)V")
	public void method2414(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_208 != null) {
			arg0.method3198();
		}
		arg0.aClass1_207 = arg1;
		arg0.aClass1_208 = arg1.aClass1_208;
		arg0.aClass1_208.aClass1_207 = arg0;
		arg0.aClass1_207.aClass1_208 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public void method2416() {
		while (true) {
			@Pc(12) Class1 local12 = this.aClass1_149.aClass1_207;
			if (local12 == this.aClass1_149) {
				return;
			}
			local12.method3198();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)Lclient!kh;")
	public Class1 method2417() {
		@Pc(7) Class1 local7 = this.aClass1_149.aClass1_207;
		if (this.aClass1_149 == local7) {
			this.aClass1_150 = null;
			return null;
		} else {
			this.aClass1_150 = local7.aClass1_207;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Lclient!kh;")
	public Class1 method2419() {
		@Pc(12) Class1 local12 = this.aClass1_149.aClass1_208;
		if (this.aClass1_149 == local12) {
			this.aClass1_150 = null;
			return null;
		} else {
			this.aClass1_150 = local12.aClass1_208;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Lclient!kh;")
	public Class1 method2421() {
		@Pc(14) Class1 local14 = this.aClass1_150;
		if (this.aClass1_149 == local14) {
			this.aClass1_150 = null;
			return null;
		} else {
			this.aClass1_150 = local14.aClass1_208;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)Lclient!kh;")
	public Class1 method2423() {
		@Pc(7) Class1 local7 = this.aClass1_149.aClass1_207;
		if (this.aClass1_149 == local7) {
			return null;
		} else {
			local7.method3198();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)Lclient!kh;")
	public Class1 method2424() {
		@Pc(6) Class1 local6 = this.aClass1_150;
		if (this.aClass1_149 == local6) {
			this.aClass1_150 = null;
			return null;
		} else {
			this.aClass1_150 = local6.aClass1_207;
			return local6;
		}
	}
}
