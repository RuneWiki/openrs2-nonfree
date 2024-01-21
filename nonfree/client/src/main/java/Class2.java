import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ABNYIQPF")
public final class Class2 {

	@OriginalMember(owner = "client!ABNYIQPF", name = "d", descriptor = "Lclient!IOXDUYYH;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "I")
	private int anInt1 = -901;

	@OriginalMember(owner = "client!ABNYIQPF", name = "b", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ABNYIQPF", name = "c", descriptor = "Lclient!IOXDUYYH;")
	private Class1_Sub1 aClass1_Sub1_1 = new Class1_Sub1();

	@OriginalMember(owner = "client!ABNYIQPF", name = "<init>", descriptor = "(I)V")
	public Class2(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_1.aClass1_Sub1_36 = this.aClass1_Sub1_1;
			this.aClass1_Sub1_1.aClass1_Sub1_37 = this.aClass1_Sub1_1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("91998, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "(Lclient!IOXDUYYH;)V")
	public void method2(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method553();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_1.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_1;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "()Lclient!IOXDUYYH;")
	public Class1_Sub1 method3() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_1.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_1) {
			return null;
		} else {
			local3.method553();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ABNYIQPF", name = "b", descriptor = "()Lclient!IOXDUYYH;")
	public Class1_Sub1 method4() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_1.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_1) {
			this.aClass1_Sub1_2 = null;
			return null;
		} else {
			this.aClass1_Sub1_2 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ABNYIQPF", name = "a", descriptor = "(Z)Lclient!IOXDUYYH;")
	public Class1_Sub1 method5() {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_2;
			if (local2 == this.aClass1_Sub1_1) {
				this.aClass1_Sub1_2 = null;
				return null;
			} else {
				this.aClass1_Sub1_2 = local2.aClass1_Sub1_36;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("515, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ABNYIQPF", name = "c", descriptor = "()I")
	public int method6() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_1.aClass1_Sub1_36; local5 != this.aClass1_Sub1_1; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
