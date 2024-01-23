import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class108 {

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "Lclient!kh;")
	private Class1_Sub3 aClass1_Sub3_39;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!kh;")
	public Class1_Sub3 aClass1_Sub3_38 = new Class1_Sub3();

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class108() {
		this.aClass1_Sub3_38.aClass1_Sub3_74 = this.aClass1_Sub3_38;
		this.aClass1_Sub3_38.aClass1_Sub3_75 = this.aClass1_Sub3_38;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!kh;")
	public Class1_Sub3 method2751() {
		@Pc(2) Class1_Sub3 local2 = this.aClass1_Sub3_39;
		if (this.aClass1_Sub3_38 == local2) {
			this.aClass1_Sub3_39 = null;
			return null;
		} else {
			this.aClass1_Sub3_39 = local2.aClass1_Sub3_74;
			return local2;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	public int method2752() {
		@Pc(13) Class1_Sub3 local13 = this.aClass1_Sub3_38.aClass1_Sub3_74;
		@Pc(19) int local19 = 0;
		while (local13 != this.aClass1_Sub3_38) {
			local13 = local13.aClass1_Sub3_74;
			local19++;
		}
		return local19;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!kh;)V")
	public void method2753(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_75 != null) {
			arg0.method4652();
		}
		arg0.aClass1_Sub3_75 = this.aClass1_Sub3_38.aClass1_Sub3_75;
		arg0.aClass1_Sub3_74 = this.aClass1_Sub3_38;
		arg0.aClass1_Sub3_75.aClass1_Sub3_74 = arg0;
		arg0.aClass1_Sub3_74.aClass1_Sub3_75 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Lclient!kh;")
	public Class1_Sub3 method2754() {
		@Pc(13) Class1_Sub3 local13 = this.aClass1_Sub3_38.aClass1_Sub3_74;
		if (this.aClass1_Sub3_38 == local13) {
			this.aClass1_Sub3_39 = null;
			return null;
		} else {
			this.aClass1_Sub3_39 = local13.aClass1_Sub3_74;
			return local13;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lclient!kh;")
	public Class1_Sub3 method2756() {
		@Pc(13) Class1_Sub3 local13 = this.aClass1_Sub3_38.aClass1_Sub3_74;
		if (this.aClass1_Sub3_38 == local13) {
			return null;
		} else {
			local13.method4652();
			return local13;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	public void method2757() {
		while (true) {
			@Pc(13) Class1_Sub3 local13 = this.aClass1_Sub3_38.aClass1_Sub3_74;
			if (this.aClass1_Sub3_38 == local13) {
				this.aClass1_Sub3_39 = null;
				return;
			}
			local13.method4652();
		}
	}
}
