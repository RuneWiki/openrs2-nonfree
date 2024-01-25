import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class266 {

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Lclient!ki;")
	private Class1 aClass1_256;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Lclient!ki;")
	public final Class1 aClass1_255 = new Class1();

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class266() {
		this.aClass1_255.aClass1_261 = this.aClass1_255;
		this.aClass1_255.aClass1_262 = this.aClass1_255;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
	public int method5992() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class1 local19 = this.aClass1_255.aClass1_261; local19 != this.aClass1_255; local19 = local19.aClass1_261) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lclient!ki;")
	public Class1 method5994() {
		@Pc(12) Class1 local12 = this.aClass1_256;
		if (this.aClass1_255 == local12) {
			this.aClass1_256 = null;
			return null;
		} else {
			this.aClass1_256 = local12.aClass1_261;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wo;I)V")
	public void method5995(@OriginalArg(0) Class266 arg0) {
		this.method6001(arg0, this.aClass1_255.aClass1_261);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Z")
	public boolean method5996() {
		return this.aClass1_255.aClass1_261 == this.aClass1_255;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ki;I)V")
	public void method5997(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_262 != null) {
			arg0.method6071();
		}
		arg0.aClass1_261 = this.aClass1_255.aClass1_261;
		arg0.aClass1_262 = this.aClass1_255;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ki;B)V")
	public void method5998(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_262 != null) {
			arg0.method6071();
		}
		arg0.aClass1_262 = this.aClass1_255.aClass1_262;
		arg0.aClass1_261 = this.aClass1_255;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)Lclient!ki;")
	public Class1 method5999() {
		@Pc(7) Class1 local7 = this.aClass1_255.aClass1_261;
		if (local7 == this.aClass1_255) {
			return null;
		} else {
			local7.method6071();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)Lclient!ki;")
	public Class1 method6000() {
		@Pc(14) Class1 local14 = this.aClass1_255.aClass1_261;
		if (local14 == this.aClass1_255) {
			this.aClass1_256 = null;
			return null;
		} else {
			this.aClass1_256 = local14.aClass1_261;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wo;ILclient!ki;)V")
	private void method6001(@OriginalArg(0) Class266 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_255.aClass1_262;
		this.aClass1_255.aClass1_262 = arg1.aClass1_262;
		arg1.aClass1_262.aClass1_261 = this.aClass1_255;
		if (this.aClass1_255 != arg1) {
			arg1.aClass1_262 = arg0.aClass1_255.aClass1_262;
			arg1.aClass1_262.aClass1_261 = arg1;
			local7.aClass1_261 = arg0.aClass1_255;
			arg0.aClass1_255.aClass1_262 = local7;
		}
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)Lclient!ki;")
	public Class1 method6003() {
		@Pc(14) Class1 local14 = this.aClass1_256;
		if (local14 == this.aClass1_255) {
			this.aClass1_256 = null;
			return null;
		} else {
			this.aClass1_256 = local14.aClass1_262;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(B)V")
	public void method6004() {
		while (true) {
			@Pc(15) Class1 local15 = this.aClass1_255.aClass1_261;
			if (this.aClass1_255 == local15) {
				this.aClass1_256 = null;
				return;
			}
			local15.method6071();
		}
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(B)Lclient!ki;")
	public Class1 method6005() {
		@Pc(7) Class1 local7 = this.aClass1_255.aClass1_262;
		if (this.aClass1_255 == local7) {
			this.aClass1_256 = null;
			return null;
		} else {
			this.aClass1_256 = local7.aClass1_262;
			return local7;
		}
	}
}
