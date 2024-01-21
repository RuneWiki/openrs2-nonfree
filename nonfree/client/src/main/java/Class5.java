import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BOZWYCIO")
public final class Class5 {

	@OriginalMember(owner = "client!BOZWYCIO", name = "d", descriptor = "Lclient!AGCGSOQI;")
	private Class1_Sub1 aClass1_Sub1_8;

	@OriginalMember(owner = "client!BOZWYCIO", name = "a", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!BOZWYCIO", name = "b", descriptor = "I")
	private int anInt56 = 4;

	@OriginalMember(owner = "client!BOZWYCIO", name = "c", descriptor = "Lclient!AGCGSOQI;")
	private Class1_Sub1 aClass1_Sub1_7 = new Class1_Sub1();

	@OriginalMember(owner = "client!BOZWYCIO", name = "<init>", descriptor = "(Z)V")
	public Class5(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_Sub1_7.aClass1_Sub1_36 = this.aClass1_Sub1_7;
			if (!arg0) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
			this.aClass1_Sub1_7.aClass1_Sub1_37 = this.aClass1_Sub1_7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("11634, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOZWYCIO", name = "a", descriptor = "(Lclient!AGCGSOQI;)V")
	public void method72(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method545();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_7.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_7;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!BOZWYCIO", name = "a", descriptor = "()Lclient!AGCGSOQI;")
	public Class1_Sub1 method73() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_7.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_7) {
			return null;
		} else {
			local3.method545();
			return local3;
		}
	}

	@OriginalMember(owner = "client!BOZWYCIO", name = "b", descriptor = "()Lclient!AGCGSOQI;")
	public Class1_Sub1 method74() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_7.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_7) {
			this.aClass1_Sub1_8 = null;
			return null;
		} else {
			this.aClass1_Sub1_8 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!BOZWYCIO", name = "a", descriptor = "(Z)Lclient!AGCGSOQI;")
	public Class1_Sub1 method75() {
		try {
			@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_8;
			if (local7 == this.aClass1_Sub1_7) {
				this.aClass1_Sub1_8 = null;
				return null;
			} else {
				this.aClass1_Sub1_8 = local7.aClass1_Sub1_36;
				return local7;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("4806, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BOZWYCIO", name = "c", descriptor = "()I")
	public int method76() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_7.aClass1_Sub1_36; local5 != this.aClass1_Sub1_7; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
